def print_letters(word):
    print(word[0], end="")
    for i in range(1, len(word)):
        print(", " + word[i], end='')
    print()		# end line


print_letters("Atmosphere")
