dictionary_list = [
    {"id": "#FF0000", "color": "Red"},
    {"id": "#800000", "color": "Maroon"},
    {"id": "#FFFF00", "color": "Yellow"},
    {"id": "#808000", "color": "Olive"},
]

print(dictionary_list)

key_to_remove = "#FF0000"
print(f"Removing item with key {key_to_remove} from dictionary_list...")
# dictionary_list.pop(key_to_remove)

list_index = 0
for d in dictionary_list:
    if d["id"] == key_to_remove:
        dictionary_list.pop(list_index)
        break

    # print(d)
    list_index += 1

print(dictionary_list)
