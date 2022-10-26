# This is a global variable
a = 0

if a == 0:
    # This is still a global variable
    b = 1


def my_function(c):
    # This is a local variable
    d = 3
    print(c)
    print(d)


# Now we call the function, passing the value 7 as the first and only parameter
my_function(7)

# a nad b still exist
print(a)
print(b)

# c and d is defined inside the function - so it will shows error
# print(c)
# print(d)
