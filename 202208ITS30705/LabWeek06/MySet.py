my_set = set()

# user_input = input("")
print(f"Set: {my_set}")

while True:
    user_input = input("Enter item >> ")
    my_set.add(user_input)

    if user_input == "":
        break

    print(f"Set: {my_set}")

print("Goodbye")
