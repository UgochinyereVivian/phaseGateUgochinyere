def getAverageVersionTwo(score_one, score_two, score_three):
    ssum = score_one + score_two + score_three;
    average = ssum//3;


    if(average > 100 or average < 0): print("invalid hence 0");
    match(average):

        case temp if 90<= temp <= 100: return 'A';
        case temp if 80<= temp < 90: return 'B';
        case temp if 70<= temp < 80: return 'C';
        case temp if 60<= temp < 70: return 'D';
        case temp if 0<= temp < 60: return 'F';

    return '0'

print(getAverageVersionTwo(100,80,10))



def getAverage(score_one, score_two, score_three):
    ssum = score_one + score_two + score_three;
    average = ssum//3;


    if(average > 100 or average < 0): print("invalid hence 0");

    if(average >= 90 and average <= 100): return 'A';
    elif(average >= 80 and average < 90): return 'B';
    elif(average >= 70 and average < 80): return 'C';
    elif(average >= 60 and average < 70): return 'D';
    elif(average >= 0 and average < 60): return 'F';

    return '0'



print(getAverage(100,80,10))





