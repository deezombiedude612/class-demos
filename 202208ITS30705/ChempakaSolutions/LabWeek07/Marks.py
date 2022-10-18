"""
Note from Mr Henry: 

Absolute paths are not recommended, this specific path will not 
work on any other machine aside from the one owned by Ms Chempaka.
"""
with open("/Users/chempakaseri/Desktop/Sample - Algorithm/marks.txt") as files:
    grade_A = grade_B = grade_C = 0
    count_A = count_B = count_C = 0

    lines = files.read().split()

    for i in range(0, len(lines), 2):
        grade = lines[i + 1]

        if grade == "A":
            grade_A += float(lines[i])
            count_A += 1

        elif grade == "B":
            grade_B += float(lines[i])
            count_B += 1

        elif grade == "C":
            grade_C += float(lines[i])
            count_C += 1

        else:
            print("Error")

print("Average mark for A", round(grade_A/count_A), 2)
print("Average mark for B", round(grade_B/count_B), 2)
print("Average mark for C", round(grade_C/count_C), 2)
