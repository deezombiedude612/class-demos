# Reference: https://stackabuse.com/stacks-and-queues-in-python/

class Stack:
    def __init__(self):
        self.__stack = []

    def __repr__(self):
        repr_output = ""
        for elem in self.__stack:
            repr_output += f"{elem} "
        repr_output += "TOP"
        return repr_output

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
    print(my_stack)
    my_stack.peek()

    my_stack.push(35)
    print(my_stack)
    my_stack.push(42)
    print(my_stack)
    my_stack.push(49)
    print(my_stack)
    my_stack.push(56)
    print(my_stack)
    print(f"Size of stack: {my_stack.size()}")

    my_stack.peek()

    print(f"Popped: {my_stack.pop()}")
    print(my_stack)
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    print(my_stack)
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    print(my_stack)
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    print(my_stack)
    print(f"Size of stack: {my_stack.size()}")
    print(f"Popped: {my_stack.pop()}")
    print(my_stack)
    print(f"Size of stack: {my_stack.size()}")


if __name__ == "__main__":
    main()
