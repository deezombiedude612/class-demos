def max(a, b, c):
    max_num = a

    if b > max_num:
        max_num = b
    if c > max_num:
        max_num = c

    return max_num


num1 = int(input("Enter first number >> "))
num2 = int(input("Enter second number >> "))
num3 = int(input("Enter third number >> "))

# invoke the function here
print(f"Maximum number is {max(num1, num2, num3)}")
# maximum = max(num1, num2, num3)
# print(f"Maximum number is {maximum}")
