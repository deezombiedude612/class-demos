length = float(input("Enter length >> "))
width = float(input("Enter width >> "))
height = float(input("Enter height >> "))

# Length, width and height are scalar; none of them should be negative.
if length < 0:
    print("Invalid length!")
elif width < 0:
    print("Invalid width!")
elif height < 0:
    print("Invalid height!")
else:
    volume = (length * width * height) / 3
    print(
        f"The volume of a pyramid with length {length} units, width {width} units, and height {height} is {round(volume, 2)} cub. units")

# Caveat: This program will only show if the first of the three measurements are invalid.
