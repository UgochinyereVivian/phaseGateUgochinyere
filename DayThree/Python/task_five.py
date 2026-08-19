
def getFirstVowelPosition(name):
    
    for index in range(len(name)):
        match(name[index].lower()):
            case 'a' : return index;
            case 'e' : return index;
            case 'i' : return index;
            case 'o' : return index;
            case 'u' : return index;
                 
    return "invalid";
