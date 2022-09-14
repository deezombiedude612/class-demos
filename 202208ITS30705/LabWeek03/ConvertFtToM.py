def feet_to_meters(feet):
    meters = feet * .3048
    # meters = feet / 3.28084

    return meters


def meters_to_feet(meters):
    feet = meters / .3048
    # feet = meters / 3.28084

    return feet


if __name__ == "__main__":
    input_feet = float(input("Enter length in ft >> "))
    print(f"{input_feet} ft is {feet_to_meters(input_feet)} m")
