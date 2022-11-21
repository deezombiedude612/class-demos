import math


class Circle:
    def __init__(self, r):
        self.radius = r

    def area(self):
        return math.pi * self.radius * self.radius

    def display(self):
        print(f"Radius of circle: {self.radius}")
        print(f"Area of circle: {self.area()}")
