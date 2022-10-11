print("Sample dictionary:")

dict_1 = {1: 10, 2: 20}
dict_2 = {3: 30, 4: 40}
dict_3 = {5: 50, 6: 60}

combo_dict = {}

for i in dict_1:
    combo_dict[i] = dict_1[i]
for i in dict_2:
    combo_dict[i] = dict_2[i]
for i in dict_3:
    combo_dict[i] = dict_3[i]

print(combo_dict)
