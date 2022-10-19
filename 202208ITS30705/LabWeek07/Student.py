def calculate_cgpa(gpa_list):
    if gpa_list == []:
        return 0

    total = 0

    for gpa in gpa_list:
        total += float(gpa)

    return total / len(gpa_list)


def main():
    """
    We can temporarily declare the variable named "lines" before it is assigned 
    to the contents of the text file. That way, we don't really need to have the 
    text file open for too long beyond what's needed.
    """
    lines = ""

    with open("student.txt") as file:
        lines = file.readlines()

    for l in lines:
        split_line = l.split("//")
        gpa_scores = split_line[2:]

        """
        "a" means append to text file; "w" means overwriting a text file (if exists).
        Both modes will create a new text file if one of the given name doesn't exist.
        """
        with open("student_results.txt", "a") as out:
            # output_string = f"{split_line[1]} (Student ID: {split_line[0]}) has a CGPA of {round(calculate_cgpa(gpa_scores), 2)}"
            output_string = f"{split_line[1]} (Student ID: {split_line[0]}) has a CGPA of {'{:.2f}'.format(calculate_cgpa(gpa_scores))}"
            print(output_string)
            out.write(output_string + "\n")


if __name__ == "__main__":
    main()
