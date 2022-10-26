def factorial(num):
    # base case: if num is 0 or 1, return 1
    # note: factorials of negative numbers is undefined by definition
    if num <= 1:
        return 1

    # recursive case: return num multiplied by result of same function with (num - 1)
    return num * factorial(num - 1)


def main():
    print(factorial(5))


if __name__ == "__main__":
    main()
