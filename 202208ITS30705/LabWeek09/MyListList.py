def sum_inner(small_list):
    if len(small_list) == 1:
        return small_list[0]

    return small_list[0] + sum_inner(small_list[1:])


def sum_outer(big_list):
    if len(big_list) == 1:
        return sum_inner(big_list[0])

    return sum_inner(big_list[0]) + sum_outer(big_list[1:])


def main():
    test_data = [[1, 2], [3, 4], [5, 6]]
    print(f"Expected Result: {sum_outer(test_data)}")


if __name__ == "__main__":
    main()
