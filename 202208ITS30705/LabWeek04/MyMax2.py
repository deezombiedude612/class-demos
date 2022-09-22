def max(a, b, c):
    if b > a:
        if b > c:
            return b
        else:
            return c
    else:
        if a > c:
            return a
        else:
            return c


num_1 = int(input("Enter first number >> "))
num_2 = int(input("Enter second number >> "))
num_3 = int(input("Enter third number >> "))

print(f"Maximum number is {max(num_1, num_2, num_3)}")
