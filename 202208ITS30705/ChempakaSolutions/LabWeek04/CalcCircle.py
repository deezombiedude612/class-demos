import math


def calcArea(radius):
    area = math.pi * (radius**2)
    return area


def calcVolume(radius):
    volume = (4/3) * math.pi * (radius**3)
    return volume


print("""(1) Calculate area of circle
(2) Calculate volume of sphere
""")
usr_input = int(input("Enter your option >> "))
radius = float(input("Enter the radius of the circle >> "))

if usr_input == 1:
    area = calcArea(radius)
    print("The area of the circle is", round(area, 2))
elif usr_input == 2:
    volume = calcVolume(radius)
    print("The volume of the sphere is", round(volume, 2))
