def fibonacci(n):
    # base case
    if n <= 1:
        return n

    # recursive case
    return fibonacci(n - 1) + fibonacci(n - 2)


def main():
    try:
        # ask for how many numbers to print from Fibonacci sequence
        num_terms = int(input("Enter number of terms >> "))
    except ValueError:
        print("Invalid number of terms, positive integer values only!")
    except Exception as ex:
        print(f"Unprecedented exception caught: {type(ex).__name__}")
    else:
        if num_terms > 0:
            # print(fibonacci(num_terms))
            for i in range(num_terms):
                print(fibonacci(i), end=" ")
            print("END")
        else:
            print("Positive integers only!")


if __name__ == "__main__":
    main()
