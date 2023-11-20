import math

n = int(input("n:"))
k = int(input("k:"))
p = float(input("p:"))
nk = math.factorial(n) / ((math.factorial((n - k)) * math.factorial(k)))
print(f"nk= {nk}")
print(f"{nk} * {p}^{k} * {(1-p)}^{n-k}")
print(f"{nk} * {p ** k} * {((1 - p) ** (n - k))}")
result = nk * (p ** k) * ((1 - p) ** (n - k))

print(result)
