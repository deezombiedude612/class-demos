first_name = ["Jason", "Hillary"]
second_name = ["Derulo", "Duff"]

full_name = []
for i in first_name:
    for j in second_name:
        full_name.append(f"{i} {j}")

print(full_name)
