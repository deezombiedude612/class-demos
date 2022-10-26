def pow(a, b):
    # base case
    if b == 0:
        return 1
    elif b < 0:
        return pow(a, b + 1) / a

    return a * pow(a, b - 1)


def main():
    print(pow(3, -4))


if __name__ == "__main__":
    main()
