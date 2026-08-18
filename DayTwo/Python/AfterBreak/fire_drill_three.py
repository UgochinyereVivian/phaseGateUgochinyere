
def getLikes(array):
    listt = []
    
    print(f"{listt} -> no one liked this")
    print()
    for count in range(len(array)):
        listt.append(array[count]);
        print(listt,end="");
        print(f" ->   {listt} liked this");
        print()

        if(len(listt) > 3):
            print(f"{listt} ->  {listt[0]}, {listt[1]} and {len(listt) - 2} liked this");
              

array = ["ugo","vivian","viv","mathew"]
getLikes(array);
    


