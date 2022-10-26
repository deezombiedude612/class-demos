import math


def area_cylinder(radius, height):
    circle_area = math.pi * radius ** 2
    height_area = 2 * radius * math.pi * height
    return 2*circle_area + height_area


radius = int(input("Enter the radius of a cylinder (cm) >>"))
height = int(input("Enter the height of a cylinder (cm) >>"))
area = area_cylinder(radius, height)
print("The surface are aof a cylinder with radius",
      radius, "and height", height, "is", round(area, 2))
