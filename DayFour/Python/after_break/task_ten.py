total = 0
counter = 0

for count in range(10):
    score = int(input("enter score: "))
    if(score >= 0):
        total+= score
        counter += 1
average = total//counter
print(average)
