import math


class Sphere:
    def __init__(self, r):
        self.radius = r

    def volume(self):
        return (4 / 3) * math.pi * self.radius ** 3

    def display(self):
        print(f"Radius of sphere: {self.radius}")
        print(f"Volume of sphere: {self.volume()}")
