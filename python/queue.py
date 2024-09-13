class Queue:
    def __init__(self):
        self.queue = []

    def is_empty(self):
        return len(self.queue) == 0

    def enqueue(self, value):
        self.queue.append(value)

    def dequeue(self):
        if self.is_empty():
            raise IndexError("Dequeue from empty queue")
        return self.queue.pop(0)

    def peek(self):
        if self.is_empty():
            raise IndexError("Peek from empty queue")
        return self.queue[0]

    def size(self):
        return len(self.queue)


class CircularQueue:
    def __init__(self, capacity):
        self.capacity = capacity
        self.queue = [None] * capacity
        self.front = self.rear = -1

    def is_full(self):
        return (self.rear + 1) % self.capacity == self.front

    def is_empty(self):
        return self.front == -1

    def enqueue(self, value):
        if self.is_full():
            raise OverflowError("Queue is full")
        if self.is_empty():
            self.front = 0
        self.rear = (self.rear + 1) % self.capacity
        self.queue[self.rear] = value

    def dequeue(self):
        if self.is_empty():
            raise IndexError("Dequeue from empty queue")
        result = self.queue[self.front]
        if self.front == self.rear:
            self.front = self.rear = -1  # Queue is now empty
        else:
            self.front = (self.front + 1) % self.capacity
        return result

    def peek(self):
        if self.is_empty():
            raise IndexError("Peek from empty queue")
        return self.queue[self.front]

import heapq

class PriorityQueue:
    def __init__(self):
        self.queue = []

    def is_empty(self):
        return len(self.queue) == 0

    def enqueue(self, value):
        heapq.heappush(self.queue, value)  # Push based on priority

    def dequeue(self):
        if self.is_empty():
            raise IndexError("Dequeue from empty queue")
        return heapq.heappop(self.queue)  # Pop the smallest value

    def peek(self):
        if self.is_empty():
            raise IndexError("Peek from empty queue")
        return self.queue[0]


from collections import deque

class Deque:
    def __init__(self):
        self.deque = deque()

    def is_empty(self):
        return len(self.deque) == 0

    def add_front(self, value):
        self.deque.appendleft(value)

    def add_rear(self, value):
        self.deque.append(value)

    def remove_front(self):
        if self.is_empty():
            raise IndexError("Remove from empty deque")
        return self.deque.popleft()

    def remove_rear(self):
        if self.is_empty():
            raise IndexError("Remove from empty deque")
        return self.deque.pop()

    def peek_front(self):
        if self.is_empty():
            raise IndexError("Peek from empty deque")
        return self.deque[0]

    def peek_rear(self):
        if self.is_empty():
            raise IndexError("Peek from empty deque")
        return self.deque[-1]


class TwoStackQueue:
    def __init__(self):
        self.stack1 = []
        self.stack2 = []

    def is_empty(self):
        return len(self.stack1) == 0 and len(self.stack2) == 0

    def enqueue(self, value):
        self.stack1.append(value)

    def dequeue(self):
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        if not self.stack2:
            raise IndexError("Dequeue from empty queue")
        return self.stack2.pop()

    def peek(self):
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        if not self.stack2:
            raise IndexError("Peek from empty queue")
        return self.stack2[-1]


import threading

class BlockingQueue:
    def __init__(self, capacity):
        self.queue = []
        self.capacity = capacity
        self.lock = threading.Lock()
        self.not_full = threading.Condition(self.lock)
        self.not_empty = threading.Condition(self.lock)

    def enqueue(self, value):
        with self.not_full:
            while len(self.queue) == self.capacity:
                self.not_full.wait()
            self.queue.append(value)
            self.not_empty.notify()

    def dequeue(self):
        with self.not_empty:
            while not self.queue:
                self.not_empty.wait()
            value = self.queue.pop(0)
            self.not_full.notify()
            return value


class CircularBuffer:
    def __init__(self, capacity):
        self.capacity = capacity
        self.buffer = [None] * capacity
        self.start = 0
        self.end = 0
        self.size = 0

    def is_full(self):
        return self.size == self.capacity

    def is_empty(self):
        return self.size == 0

    def enqueue(self, value):
        self.buffer[self.end] = value
        self.end = (self.end + 1) % self.capacity
        if self.size < self.capacity:
            self.size += 1
        else:
            self.start = (self.start + 1) % self.capacity

    def dequeue(self):
        if self.is_empty():
            raise IndexError("Dequeue from empty buffer")
        value = self.buffer[self.start]
        self.start = (self.start + 1) % self.capacity
        self.size -= 1
        return value

    def peek(self):
        if self.is_empty():
            raise IndexError("Peek from empty buffer")
        return self.buffer[self.start]
