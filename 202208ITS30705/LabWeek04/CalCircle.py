import math


def circle_area(r):
    # area = math.pi * r ** 2
    # return area
    return math.pi * r * r


def sphere_volume(r):
    # volume = (4 / 3) * math.pi * r ** 3
    # return volume
    return (4 / 3) * math.pi * (r ** 3)


print("(1) Calculate area of circle")
print("(2) Calculate volume of sphere")

# print(
#     """(1) Calculate area of circle
# (2) Calculate volume of sphere""")

option = int(input("\nEnter your option >> "))

while option != 1 or option != 2:
    print("Invalid option! Try again..")
    option = int(input("Enter your option >> "))


radius = float(input("\nEnter the radius >> "))

while radius < 0:
    print("Invalid radius! Radius cannot be < 0!")
    radius = float(input("Enter the radius >> "))

if option == 1:
    print(f"\nThe area of the circle is {round(circle_area(radius), 2)}")
    # this_area = circle_area(radius)
    # print(f"The area of the circle is {round(this_area, 2)}")
elif option == 2:
    print(f"\nThe volume of the sphere is {round(sphere_volume(radius), 2)}")
