color_list = [
    {'id': '#FF0000', 'color': 'Red'},
    {'id': '#800000', 'color': 'Maroon'},
    {'id': '#FFFF00', 'color': 'Yellow'},
    {'id': '#808000', 'color': 'Olive'}
]

new_list = []

for i in color_list:
    if i['id'] != "#FF0000":
        new_list.append(i)

print(new_list)
