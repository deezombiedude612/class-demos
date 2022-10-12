numbers = [1, 2, 3, 4, 5, 6, 7]
squares = []

for n in range(1, len(numbers) + 1):
    squares.append(n * n)

print(f"Original list:\t{numbers}")
print(f"List squared:\t{squares}")

# Shortcut:
# print(n ** 2 for n in numbers)
