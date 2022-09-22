def find_max(num1, num2, num3):
    if num1 > num2 and num1 > num3:
        return num1

    elif num2 > num1 and num2 > num3:
        return num2

    else:
        return num3


first = int(input("Enter first number >> "))
second = int(input("Enter second number >> "))
third = int(input("Enter third number >> "))

max_number = find_max(first, second, third)

print("Maximum number is", max_number)
