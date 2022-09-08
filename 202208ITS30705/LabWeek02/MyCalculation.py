# Retrieve each of the three numbers one by one before proceeding to multiply all of them.
num1 = int(input("Enter number #1 >> "))
num2 = int(input("Enter number #2 >> "))
num3 = int(input("Enter number #3 >> "))

# assign the product of all three values to a new variable
product = num1 * num2 * num3

print(f"The product of all three numbers is {product}.")
# Note: The f in front of the output string allows variable(s) to be slotted in with curly braces {}.
