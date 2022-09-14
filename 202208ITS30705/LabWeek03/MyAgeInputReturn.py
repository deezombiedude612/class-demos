import datetime


def get_birth_year(age):
    current_year = datetime.datetime.today().year
    birth_year = current_year - age

    return birth_year


if __name__ == "__main__":
    age = int(input("Your age please >> "))
    print(f"Your birth year is {get_birth_year(age)}")
