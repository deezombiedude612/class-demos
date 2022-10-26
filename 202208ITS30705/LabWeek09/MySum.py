"""
sum() gets recursively called as long as the <list> parameter
always has more than one item.
"""


def sum(list):
    # base case: if list is empty
    if len(list) == 0:
        return 0

    # recursive case: if there are more than 1 elements in list,
    # call the result of the same function but with one item less + first item
    if len(list) > 1:
        return list[0] + sum(list[1:])

    # if list only contains one item,
    # return that one item
    return list[0]


def main():
    list_num = [90, 34, 67, 12, 59]

    print(sum(list_num))


if __name__ == "__main__":
    main()
