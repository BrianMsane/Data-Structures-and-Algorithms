from collections import deque
import heapq

class Graph:
    def __init__(self):
        self.graph = {}

    def add_vertex(self, vertex):
        if vertex not in self.graph:
            self.graph[vertex] = []

    def add_edge(self, vertex1, vertex2):
        if vertex1 not in self.graph:
            self.add_vertex(vertex1)
        if vertex2 not in self.graph:
            self.add_vertex(vertex2)
        self.graph[vertex1].append(vertex2)

    def get_vertices(self):
        return list(self.graph.keys())

    def get_edges(self):
        edges = []
        for vertex in self.graph:
            for neighbor in self.graph[vertex]:
                edges.append((vertex, neighbor))
        return edges


class DepthFirstSearch:
    def __init__(self, graph):
        self.graph = graph

    def dfs(self, start_vertex):
        visited = set()
        self._dfs_recursive(start_vertex, visited)
        return visited

    def _dfs_recursive(self, vertex, visited):
        if vertex not in visited:
            visited.add(vertex)
            for neighbor in self.graph[vertex]:
                self._dfs_recursive(neighbor, visited)


class BreadthFirstSearch:
    def __init__(self, graph):
        self.graph = graph

    def bfs(self, start_vertex):
        visited = set()
        queue = deque([start_vertex])
        visited.add(start_vertex)
        while queue:
            vertex = queue.popleft()
            for neighbor in self.graph[vertex]:
                if neighbor not in visited:
                    visited.add(neighbor)
                    queue.append(neighbor)
        return visited


class Dijkstra:
    def __init__(self, graph):
        self.graph = graph

    def dijkstra(self, start_vertex):
        distances = {vertex: float('infinity') for vertex in self.graph}
        distances[start_vertex] = 0
        priority_queue = [(0, start_vertex)]
        
        while priority_queue:
            current_distance, current_vertex = heapq.heappop(priority_queue)
            
            if current_distance > distances[current_vertex]:
                continue
                
            for neighbor, weight in self.graph[current_vertex]:
                distance = current_distance + weight
                
                if distance < distances[neighbor]:
                    distances[neighbor] = distance
                    heapq.heappush(priority_queue, (distance, neighbor))
        
        return distances


class TopologicalSort:
    def __init__(self, graph):
        self.graph = graph
        self.visited = set()
        self.stack = []

    def topological_sort(self):
        for vertex in self.graph:
            if vertex not in self.visited:
                self._topological_sort_recursive(vertex)
        return self.stack[::-1]

    def _topological_sort_recursive(self, vertex):
        self.visited.add(vertex)
        for neighbor in self.graph[vertex]:
            if neighbor not in self.visited:
                self._topological_sort_recursive(neighbor)
        self.stack.append(vertex)


class Kruskal:
    def __init__(self, graph):
        self.graph = graph

    def find(self, parent, i):
        if parent[i] == i:
            return i
        return self.find(parent, parent[i])

    def union(self, parent, rank, x, y):
        root_x = self.find(parent, x)
        root_y = self.find(parent, y)

        if rank[root_x] < rank[root_y]:
            parent[root_x] = root_y
        elif rank[root_x] > rank[root_y]:
            parent[root_y] = root_x
        else:
            parent[root_y] = root_x
            rank[root_x] += 1

    def kruskal(self):
        result = []
        edges = sorted(self.graph.get_edges(), key=lambda edge: edge[2])
        parent = {}
        rank = {}

        for vertex in self.graph.get_vertices():
            parent[vertex] = vertex
            rank[vertex] = 0

        for edge in edges:
            vertex1, vertex2, weight = edge
            root1 = self.find(parent, vertex1)
            root2 = self.find(parent, vertex2)

            if root1 != root2:
                result.append(edge)
                self.union(parent, rank, root1, root2)

        return result


class FloydWarshall:
    def __init__(self, graph, vertices):
        self.graph = graph
        self.vertices = vertices

    def floyd_warshall(self):
        dist = [[float('inf')] * self.vertices for _ in range(self.vertices)]

        for u in range(self.vertices):
            for v in range(self.vertices):
                if u == v:
                    dist[u][v] = 0
                elif self.graph[u][v] != 0:
                    dist[u][v] = self.graph[u][v]

        for k in range(self.vertices):
            for i in range(self.vertices):
                for j in range(self.vertices):
                    dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

        return dist


class BellmanFord:
    def __init__(self, graph, vertices):
        self.graph = graph
        self.vertices = vertices

    def bellman_ford(self, start_vertex):
        dist = [float('inf')] * self.vertices
        dist[start_vertex] = 0

        for _ in range(self.vertices - 1):
            for u, v, weight in self.graph.get_edges():
                if dist[u] != float('inf') and dist[u] + weight < dist[v]:
                    dist[v] = dist[u] + weight

        for u, v, weight in self.graph.get_edges():
            if dist[u] != float('inf') and dist[u] + weight < dist[v]:
                print("Graph contains a negative-weight cycle")
                return None

        return dist


class TarjanSCC:
    def __init__(self, graph):
        self.graph = graph
        self.stack = []
        self.index = 0
        self.indices = {}
        self.low_link = {}
        self.scc = []

    def tarjan_scc(self):
        for vertex in self.graph:
            if vertex not in self.indices:
                self._strongconnect(vertex)
        return self.scc

    def _strongconnect(self, vertex):
        self.indices[vertex] = self.index
        self.low_link[vertex] = self.index
        self.index += 1
        self.stack.append(vertex)

        for neighbor in self.graph[vertex]:
            if neighbor not in self.indices:
                self._strongconnect(neighbor)
                self.low_link[vertex] = min(self.low_link[vertex], self.low_link[neighbor])
            elif neighbor in self.stack:
                self.low_link[vertex] = min(self.low_link[vertex], self.indices[neighbor])

        if self.low_link[vertex] == self.indices[vertex]:
            scc = []
            while True:
                w = self.stack.pop()
                scc.append(w)
                if w == vertex:
                    break
            self.scc.append(scc)
