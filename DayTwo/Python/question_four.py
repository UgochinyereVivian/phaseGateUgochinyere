def printNumbersReverseVersion():
    reverse = ""

    for count in range(100):

        if(count % 3 == 0):
            print("hello")
        if(count % 5 == 0):
            print("world")
        if(count % 7 == 0):
            print("world")
        else:
            new_count = str(count) 
            for character in new_count:
                reverse = character + reverse;
            
            print(reverse);
            
                     
            
printNumbersReverseVersion()   
