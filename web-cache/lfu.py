class LFUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.min_freq = 0
        self.key_node = {}
        self.freq_list = {}

    class Node:
        def __init__(self, key, value, freq):
            self.key = key
            self.value = value
            self.freq = freq

    def _update_freq(self, node):
        freq = node.freq
        self.freq_list[freq].remove(node)
        if not self.freq_list[freq]:
            del self.freq_list[freq]
            if freq == self.min_freq:
                self.min_freq += 1
        node.freq += 1
        if node.freq not in self.freq_list:
            self.freq_list[node.freq] = []
        self.freq_list[node.freq].append(node)

    def get(self, key: int) -> int:
        if key not in self.key_node:
            return -1
        node = self.key_node[key]
        self._update_freq(node)
        return node.value

    def put(self, key: int, value: int) -> None:
        if self.capacity == 0:
            return
        if key in self.key_node:
            node = self.key_node[key]
            node.value = value
            self._update_freq(node)
        else:
            if len(self.key_node) == self.capacity:
                node = self.freq_list[self.min_freq].pop(0)
                del self.key_node[node.key]
            new_node = self.Node(key, value, 1)
            self.key_node[key] = new_node
            if 1 not in self.freq_list:
                self.freq_list[1] = []
            self.freq_list[1].append(new_node)
            self.min_freq = 1
