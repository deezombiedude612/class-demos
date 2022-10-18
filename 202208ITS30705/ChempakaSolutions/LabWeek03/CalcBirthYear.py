def calBirthYear(age):
    birthyear = 2022 - age
    return birthyear


age = int(input("Your age please >> "))
x = calBirthYear(age)
print("Your birth year is", x)
