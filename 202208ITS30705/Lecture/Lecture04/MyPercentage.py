percent = float(input("What percentage did you earn? "))

if percent >= 90 and percent <= 100:
    print("You got an A!")

# elif percent >= 80 and percent < 90:
elif percent >= 80:
    print("You got a B!")

# elif percent >= 70 and percent < 80:
elif percent >= 70:
    print("You got a C!")

# elif percent >= 60 and percent < 70:
elif percent >= 60:
    print("You got a D!")

# elif percent < 60:
else:
    print("You got an F!")
