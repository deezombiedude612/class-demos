"""
Refer to the following website for more information about the types of exceptions in Python:
https://docs.python.org/3/library/exceptions.html
"""


def main():
    filename = "data.txt"

    try:
        lines = ""

        with open(filename) as file:
            lines = file.readlines()

        for l in lines:
            print(l, end="")
    except FileNotFoundError as ex:
        print(f"{filename} does not exist.")
    except Exception as ex:
        print(f"Unprecedented exception caught: {type(ex).__name__}")
        print(ex.args[0])


if __name__ == "__main__":
    main()
