public class TaskThree{

    public static void main(String...ugo){
           greetWorldOriginal("ugo"); 
    }


public static void greetWorldOriginal(String name){
        System.out.printf("""

        "My name is "%s""
        "Today is 17/08/2026"

        """, name);

}

public static void greetWorld(String name){
        System.out.println("\"My name is \"" + name + "\" \"");
        System.out.println("\"Today is 17/08/2026\"");

}
}
