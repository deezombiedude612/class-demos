def bmr_calculator(gender):
    bmr = 4.54545 * weight + 15.875 * height - 5 * age
    if gender.lower() == "male":
        bmr += 5
    elif gender.lower() == "female":
        bmr -= 161
    else:
        bmr = 0
    return bmr


def bmr_level(bmr):
    if bmr >= 2000:
        return "High"
    elif bmr >= 1200 and bmr < 2000:
        return "Moderate"
    else:
        return "Low"


print("Enter person's information:")
height = float(input("height (in inches)?"))
weight = float(input("weight (in lb)?"))
age = float(input("age (in years)?"))
gender = float(input("gender (male or female)?"))

bmr = bmr_calculator(gender)
level = bmr_level(bmr)

print("The person basal metabolic rate =", round(bmr, 1))
print(level, "resting burn rate")
