class ArrayList:
    def __init__(self, capacity=10):
        self.capacity = capacity
        self.size = 0
        self.array = [None] * self.capacity

    def is_empty(self):
        return self.size == 0

    def resize(self):
        new_capacity = self.capacity * 2
        new_array = [None] * new_capacity
        for i in range(self.size):
            new_array[i] = self.array[i]
        self.array = new_array
        self.capacity = new_capacity

    def append(self, value):
        if self.size == self.capacity:
            self.resize()
        self.array[self.size] = value
        self.size += 1

    def insert(self, index, value):
        if index < 0 or index > self.size:
            raise IndexError("Index out of bounds")
        if self.size == self.capacity:
            self.resize()
        for i in range(self.size, index, -1):
            self.array[i] = self.array[i-1]
        self.array[index] = value
        self.size += 1

    def remove(self, index):
        if index < 0 or index >= self.size:
            raise IndexError("Index out of bounds")
        for i in range(index, self.size - 1):
            self.array[i] = self.array[i + 1]
        self.size -= 1
        self.array[self.size] = None

    def get(self, index):
        if index < 0 or index >= self.size:
            raise IndexError("Index out of bounds")
        return self.array[index]

    def __str__(self):
        return str([self.array[i] for i in range(self.size)])
