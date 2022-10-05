word = input("Enter a word >> ")
letter = input("Enter a letter to count >> ")

count = 0
for i in word:
    if i == letter:
        count += 1

print(f"Qty of letter {letter} is {count}")
