import datetime


def get_birth_year(age):
    current_year = datetime.datetime.today().year
    if age < 0 or age > current_year:
        print("Invalid age!")
    else:
        birth_year = current_year - age
        print(f"Your birth year is {birth_year}")


if __name__ == "__main__":
    age = int(input("Your age please >> "))
    get_birth_year(age)
