# Reference: https://stackabuse.com/stacks-and-queues-in-python/

class Stack:
    def __init__(self):
        self.__stack = []

    def display(self):
        print(self.__stack)

    def size(self):
        return len(self.__stack)

    def is_empty(self):
        return self.size() == 0

    def push(self, item):
        # print(f"Pushing to stack: {item}")
        self.__stack.append(item)

    def pop(self):
        if self.size() < 1:
            print("No items in stack, unable to pop!")
            return None

        popped_item = self.__stack.pop()
        # print(f"Popping item from stack: {popped_item}")
        return popped_item

    def peek(self):
        if self.size() < 1:
            print("No items in stack, unable to peek!")
            return None
        return self.__stack[len(self.__stack) - 1]


def main():
    my_stack = Stack()
    my_stack.display()
    my_stack.peek()

    my_stack.push(35)
    my_stack.display()
    my_stack.push(42)
    my_stack.display()
    my_stack.push(49)
    my_stack.display()
    my_stack.push(56)
    my_stack.display()
    print(f"Size of stack: {my_stack.size()}")

    my_stack.peek()

    print(f"Popped: {my_stack.pop()}")
    my_stack.display()
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    my_stack.display()
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    my_stack.display()
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    my_stack.display()
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    my_stack.display()
    print(f"Size of stack: {my_stack.size()}")


if __name__ == "__main__":
    main()
