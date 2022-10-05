num = int(input("Enter a number >> "))
print(f"Multiplication chart for number {num}")

for i in range(1, 13):
    print(f"{num} x {i} = {num * i}")

print(f"\nMultiplication chart for number {num} in reverse")

# to count in reverse,
# start with the bigger number and end with a smaller number,
# and specify third parameter representing a negative value
for i in range(12, 0, -1):
    print(f"{num} x {i} = {num * i}")
