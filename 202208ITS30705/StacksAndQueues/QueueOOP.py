# Reference: https://stackabuse.com/stacks-and-queues-in-python/

class Queue:
    def __init__(self):
        self.__queue = []

    def display(self):
        print(self.__queue)

    def size(self):
        return len(self.__queue)

    def is_empty(self):
        return self.size() == 0

    def enqueue(self, item):
        # print(f"Enqueueing item: {item}")
        self.__queue.append(item)

    def dequeue(self):
        if self.size() < 1:
            print("No items in queue, unable to dequeue!")
            return None

        dequeued_item = self.__queue.pop(0)
        # print(f"Dequeued item: {dequeued_item}")
        return dequeued_item


def main():
    my_queue = Queue()
    my_queue.display()
    print(f"Is queue empty? {my_queue.is_empty()}")

    my_queue.enqueue("UP")
    my_queue.display()
    my_queue.enqueue("UP")
    my_queue.display()
    my_queue.enqueue("DOWN")
    my_queue.display()
    my_queue.enqueue("DOWN")
    my_queue.display()
    my_queue.enqueue("LEFT")
    my_queue.display()
    my_queue.enqueue("RIGHT")
    my_queue.display()
    my_queue.enqueue("LEFT")
    my_queue.display()
    my_queue.enqueue("RIGHT")
    my_queue.display()
    my_queue.enqueue("B")
    my_queue.display()
    my_queue.enqueue("A")
    my_queue.display()
    print(f"Length of queue: {my_queue.size()}")
    print(f"Is queue empty? {my_queue.is_empty()}")

    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()
    print(f"Popped: {my_queue.dequeue()}")
    my_queue.display()


if __name__ == "__main__":
    main()
