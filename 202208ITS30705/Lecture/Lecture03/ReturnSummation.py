def summation(number_1, number_2):
    total = number_1 + number_2
    return total


number_1 = input("Enter first number >>")
number_2 = input("Enter second number >>")

answer = summation(int(number_1), int(number_2))

print("The summation between the number entered is", answer)
