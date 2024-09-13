class Stack:
    def __init__(self):
        self.stack = []

    def is_empty(self):
        return len(self.stack) == 0

    def push(self, value):
        self.stack.append(value)

    def pop(self):
        if self.is_empty():
            raise IndexError("Pop from empty stack")
        return self.stack.pop()

    def peek(self):
        if self.is_empty():
            raise IndexError("Peek from empty stack")
        return self.stack[-1]

    def size(self):
        return len(self.stack)


class MinStack:
    def __init__(self):
        self.stack = []
        self.min_stack = []

    def push(self, value):
        self.stack.append(value)
        if not self.min_stack or value <= self.min_stack[-1]:
            self.min_stack.append(value)

    def pop(self):
        if not self.stack:
            raise IndexError("Pop from empty stack")
        popped_value = self.stack.pop()
        if popped_value == self.min_stack[-1]:
            self.min_stack.pop()

    def get_min(self):
        if not self.min_stack:
            raise IndexError("Min from empty stack")
        return self.min_stack[-1]

    def peek(self):
        if not self.stack:
            raise IndexError("Peek from empty stack")
        return self.stack[-1]


class TwoStackQueue:
    def __init__(self):
        self.stack1 = []
        self.stack2 = []

    def enqueue(self, value):
        self.stack1.append(value)

    def dequeue(self):
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        if not self.stack2:
            raise IndexError("Dequeue from empty queue")
        return self.stack2.pop()

    def is_empty(self):
        return not self.stack1 and not self.stack2

class BalancedParenthesesStack:
    def __init__(self):
        self.stack = []

    def is_balanced(self, expression):
        matching_brackets = {')': '(', '}': '{', ']': '['}
        for char in expression:
            if char in '({[':
                self.stack.append(char)
            elif char in ')}]':
                if not self.stack or self.stack.pop() != matching_brackets[char]:
                    return False
        return not self.stack


class ReversibleStack:
    def __init__(self):
        self.stack = []

    def push(self, value):
        self.stack.append(value)

    def pop(self):
        if not self.stack:
            raise IndexError("Pop from empty stack")
        return self.stack.pop()

    def is_empty(self):
        return len(self.stack) == 0

    def insert_at_bottom(self, value):
        if self.is_empty():
            self.push(value)
        else:
            temp = self.pop()
            self.insert_at_bottom(value)
            self.push(temp)

    def reverse(self):
        if not self.is_empty():
            temp = self.pop()
            self.reverse()
            self.insert_at_bottom(temp)
