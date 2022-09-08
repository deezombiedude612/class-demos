# We can use float here in order to allow for a radius that isn't restricted to being in integer format.
radius = float(input("Enter radius >> "))

# Radius is scalar, so negative radius values should not be allowed.
if radius < 0:
    print("Invalid radius!")
else:
    area = radius * radius * (22 / 7)   # or (radius ** 2) * (22 / 7)
    print(
        f"Area of circle with radius {radius} units is {round(area, 2)} sq. units.")
    # Note: round(area, 2) rounds the value of <area> into 2 decimal places.
