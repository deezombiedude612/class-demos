num = int(input("Enter a number >> "))
print(f"Multiplication chart for number {num}")

i = 1
while i <= 12:
    print(f"{num} x {i} = {num * i}")
    i += 1

print(f"\nMultiplication chart for number {num} in reverse")

# to count in reverse,
# start with the bigger number and end with a smaller number,
# and invert the update statement from += to -=
j = 12
while j >= 1:
    print(f"{num} x {j} = {num * j}")
    j -= 1
