# this function definition starts a new block
def add_numbers(a, b):
    # this instruction is inside the block, because it's indented
    c = a + b
    # so is this one
    return c


day = "Tuesday"
# this if statement starts a new block
if day == "tuesday":
    # this is inside the block
    print("It's Tuesday!")
# this is outside the block!
print("Print this no matter what.")
