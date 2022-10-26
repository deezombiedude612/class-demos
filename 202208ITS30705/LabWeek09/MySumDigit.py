def sum_digit(n):
    # base case
    if 0 <= n < 10:
        return n

    # recursive case
    return (n % 10) + sum_digit(int(n / 10))


def main():
    try:
        user_int = int(input("Enter nonnegative integer >> "))
    except ValueError:
        print("Invalid input, nonnegative integer values only!")
    except Exception as ex:
        print(f"Unprecedented exception caught: {type(ex).__name__}")
    else:
        if user_int >= 0:
            print(f"Expected Result: {sum_digit(user_int)}")
        else:
            print("Non-negative integers only!")


if __name__ == "__main__":
    main()
