total = 0
for count in range(10):
    score = int(input("enter score: "))
    if(score > 0 and score <= 100):
        total+= score

print(total)
