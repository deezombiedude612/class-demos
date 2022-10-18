def convertFtToM(ft):
    m = ft * 0.3048
    return m


feet = float(input("Convert ft to m >> "))
metre = convertFtToM(feet)

print(feet, "ft is", metre, "m")
