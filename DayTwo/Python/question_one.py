def greet(text_one, text_two):
    
    interleaved_text = ""
    for count in range(len(text_one)):

        if(count >= 2):
            interleaved_text += text_two[count]
            interleaved_text += text_one[count]
        else:
            interleaved_text += text_one[count]
            interleaved_text += text_two[count]
        


    print(f"\"{interleaved_text}\"")


greet("Hello", "World")
