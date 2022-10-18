def main():
    with open("marks.txt") as file:
        lines = file.readlines()

        total_a = 0
        total_b = 0
        total_c = 0

        count_a = 0
        count_b = 0
        count_c = 0

        for l in lines:
            split_line = l.split()
            if split_line[1] == "A":
                total_a += int(split_line[0])
                count_a += 1
            elif split_line[1] == "B":
                total_b += int(split_line[0])
                count_b += 1
            elif split_line[1] == "C":
                total_c += int(split_line[0])
                count_c += 1

        avg_a = total_a / count_a
        avg_b = total_b / count_b
        avg_c = total_c / count_c

        if count_a != 0:
            print(f"Average mark for A: {'{:.2f}'.format(avg_a)}")
        if count_b != 0:
            print(f"Average mark for B: {'{:.2f}'.format(avg_b)}")
        if count_c != 0:
            print(f"Average mark for C: {'{:.2f}'.format(avg_c)}")


if __name__ == "__main__":
    main()
