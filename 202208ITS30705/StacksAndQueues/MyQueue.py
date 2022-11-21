from collections import deque


def main():
	# initialize a deque with a list
	# deque is pronounced "deck"
	my_queue = deque()

	my_queue.append(45)
	my_queue.append(12)
	my_queue.append(23)
	my_queue.append(98)
	print(my_queue)

	print(f"Dequeued: {my_queue.pop()}")
	print(my_queue)


if __name__ == "__main__":
	main()
