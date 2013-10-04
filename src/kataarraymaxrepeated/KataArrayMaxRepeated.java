package kataarraymaxrepeated;

public class KataArrayMaxRepeated {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 66, 7, 8, 1, 9, 1, 8, 1, 2, 6, 2, 1};
        System.out.println("El número más repetido en el vector es: " + Max_Repeated.repeat(test));
        int[] test1 ={};
        int[] test2 ={0,0,1,1,2,2};
        System.out.println("El número más repetido en el vector es: " + Max_Repeated.repeat(test1));
        System.out.println("El número más repetido en el vector es: " + Max_Repeated.repeat(test2));
                
    }
}
