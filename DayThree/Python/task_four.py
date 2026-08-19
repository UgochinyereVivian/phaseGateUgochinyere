
def countLower(name):
    count = 0
    for character in name:
        if(character == character.lower()):
            count+=1

    return count
