length = float(input("Enter length >> "))
width = float(input("Enter width >> "))
height = float(input("Enter height >> "))

"""
Length, width and height are scalar; none of them should be negative.
Here, we introduce a flag value (ironically called "flag") which will turn False if any of the three measurements
are negative.
We initialize flag as True (to potentially turn False when checking the measurement values).
"""
flag = True

# Each of the if statements in the program are now independent of each other.
if length < 0:
    print("Invalid length!")
    flag = False
if width < 0:
    print("Invalid width!")
    flag = False
if height < 0:
    print("Invalid height!")
    flag = False

# Check to see if the flag value remains unchanged before proceeding to calculate the pyramid volume.
if flag is True:
    volume = (length * width * height) / 3
    print(
        f"The volume of a pyramid with length {length} units, width {width} units, and height {height} is {round(volume, 2)} cub. units")
