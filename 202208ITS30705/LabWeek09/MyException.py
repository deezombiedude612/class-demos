"""
Refer to the following website for more information about the types of exceptions in Python:
https://docs.python.org/3/library/exceptions.html
"""


def main():
    filename = "data.txt"

    try:
        with open(filename) as file:
            pass
    except Exception as ex:
        print(f"Exception caught: {type(ex).__name__}")
        print(ex.args[0])
        print(f"{filename} does not exist.")


if __name__ == "__main__":
    main()
