# Reference: https://stackabuse.com/stacks-and-queues-in-python/

class Queue:
    def __init__(self):
        self.__queue = []

    def __repr__(self):
        if self.size() > 1:
            repr_output = f"{self.__queue[0]}"
            # repr_output = "(FRONT) "
            for elem in self.__queue[1:]:
                repr_output += f" {elem}"
            # repr_output += "(BACK)"
            return repr_output

        return ""

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
    print(my_queue)
    print(f"Is queue empty? {my_queue.is_empty()}")

    my_queue.enqueue("UP")
    print(my_queue)
    my_queue.enqueue("UP")
    print(my_queue)
    my_queue.enqueue("DOWN")
    print(my_queue)
    my_queue.enqueue("DOWN")
    print(my_queue)
    my_queue.enqueue("LEFT")
    print(my_queue)
    my_queue.enqueue("RIGHT")
    print(my_queue)
    my_queue.enqueue("LEFT")
    print(my_queue)
    my_queue.enqueue("RIGHT")
    print(my_queue)
    my_queue.enqueue("B")
    print(my_queue)
    my_queue.enqueue("A")
    print(my_queue)
    print(f"Length of queue: {my_queue.size()}")
    print(f"Is queue empty? {my_queue.is_empty()}")

    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)
    print(f"Popped: {my_queue.dequeue()}")
    print(my_queue)

    pass


if __name__ == "__main__":
    main()
