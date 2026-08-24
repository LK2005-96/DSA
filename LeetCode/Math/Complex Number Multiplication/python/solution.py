class Solution(object):
    def complexNumberMultiply(self, num1, num2):
        num1 = num1.split("+")
        num2 = num2.split("+")
        a, b = int(num1[0]), int(num1[1].replace("i", ""))
        c, d = int(num2[0]), int(num2[1].replace("i", ""))
        return str(a * c - b * d) + "+" + str(a * d + b * c) + "i"