cost = float(input("Enter the cost of the bike (RM)>>"))

if cost > 10000:
    tax = cost * 0.15

elif cost > 5000 and cost <= 10000:
    tax = cost * 0.1

else:
    tax = cost * 0.05

print("The road tax for the bike is RM", tax)
