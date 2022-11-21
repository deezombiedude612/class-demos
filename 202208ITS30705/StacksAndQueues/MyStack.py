def main():
	my_stack = [4, 7, 11, 13, 15]

	print(my_stack)
	my_stack.append(17)
	print(my_stack)
	my_stack.append(19)
	print(my_stack)

	print(f"Popped: {my_stack.pop()}")
	print(my_stack)
	print(f"Popped: {my_stack.pop()}")
	print(my_stack)


if __name__ == "__main__":
	main()
