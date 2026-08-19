def countUpper(name):
    count = 0
    for character in name:
        if(character == character.upper()):
            count+=1

    return count
