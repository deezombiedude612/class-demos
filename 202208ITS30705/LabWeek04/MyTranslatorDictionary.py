# DON'T WORRY ABOUT THIS ONE, JUST TRYING THIS OUT FOR SOMEONE XD

solutions = {
    0: "ZERO",
    1: "ONE",
    2: "TWO",
    3: "THREE",
    4: "FOUR"
}

num = int(input("Enter a number from 0 to 4 >> "))

if num not in solutions:
    print("Out of range! Valid number is from 0 to 4 only!")
else:
    print(solutions.get(num))
