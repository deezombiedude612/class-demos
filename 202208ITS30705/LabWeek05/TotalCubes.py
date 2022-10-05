num = int(input("Enter a number >> "))

total = 0
for i in range(1, num + 1):
    cube = i ** 3
    print(f"{i}^3 = {cube}")
    total += cube

print(f"Sum of all cubes: {total}")
