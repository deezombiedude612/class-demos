def process_student(line):
    part = line.split("//")
    student_id = part[0]
    student_name = part[1]
    total = 0

    for i in range(2, len(part)):
        total += float(part[i])

    final_CGPA = round((total/4), 2)
    print(student_name, "(Student ID:", student_id, ") have a", final_CGPA, "CGPA")


"""
Note from Mr Henry: 

Absolute paths are not recommended, this specific path will not 
work on any other machine aside from the one owned by Ms Chempaka.
"""
with open("/Users/chempakaseri/Desktop/Sample - Algorithm/students.txt") as file:
    for line in file:
        process_student(line)
