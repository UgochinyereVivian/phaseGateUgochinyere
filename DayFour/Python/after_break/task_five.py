total = 0


for count in range(10):
    score = int(input("enter score: "))
    if(score % 2 == 0):
        total+= score

print(total)
