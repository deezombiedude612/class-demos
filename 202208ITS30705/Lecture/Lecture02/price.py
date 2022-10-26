totalPrice = int(input("Enter total price RM >>"))

totalPayment = (totalPrice * 0.1) + (totalPrice * 0.06) + totalPrice

print("Total payment to be made is RM", round(totalPayment, 2))
