public class FireDrillOne{



public static void getAge(int sonsAge, int fathersAge){
    if(sonsAge < 0 || fathersAge <= 0) return;
    if(sonsAge > fathersAge) return;

    int years = sonsAge % fathersAge;
    int twice = sonsAge * 2;
    int difference = fathersAge - twice;

    if(years + fathersAge == (sonsAge * 2)){
        System.out.printf("father will be twice sons age in %d years time ", years);
    }
    else if(twice > fathersAge){
        System.out.printf("father will be twice sons age in %d years time ", difference * - 1);
    }
    else{
        System.out.printf("father was twice sons age %d years ago ", difference);
    }

}




public static void main(String...ugo){
     getAge(50,76);

}

}
