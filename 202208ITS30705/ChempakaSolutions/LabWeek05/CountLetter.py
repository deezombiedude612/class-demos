def countLetters(word, letter):
    count = 0
    for i in word:
        if i == letter:
            count += 1

    return count


word = input("Enter a word >> ")
letter = input("Enter a letter to count >> ")

count = countLetters(word, letter)
print("Qty of letter", letter, "is", count)
