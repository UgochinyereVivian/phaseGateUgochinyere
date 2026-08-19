def countSensitivity(name):
    repeat = 0
    
    for character in name:
        for character in name:
            if(character == character.upper() or character == character.lower()):
                repeat += 1
    return repeat


print(countSensitivity("1ooa11BAcb"))
   
    
