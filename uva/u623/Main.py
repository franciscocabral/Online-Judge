import math
while True:
    try:
        num = input()
        print(num+"!")
        print(math.factorial(int(num)))
    except EOFError:
        break
