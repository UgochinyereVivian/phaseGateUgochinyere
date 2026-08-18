def getAge(sonsAge,fathersAge):
    if(sonsAge < 0 or fathersAge <= 0): return
    if(sonsAge > fathersAge): return
        
    twiceTheAge = fathersAge % sonsAge
    twice = sonsAge * 2
    difference = fathersAge - twice

    if(twiceTheAge + fathersAge == sonsAge * 2):
        print(f"father will be twice sons age in {twiceTheAge} years time ")
    elif (twice > fathersAge):
        print(f"father will be twice sons age in {difference * - 1} years time ");
    
    else:
        print(f"father was twice sons age in {fathersAge - (sonsAge * 2)} years ago ")







getAge(60,76);


