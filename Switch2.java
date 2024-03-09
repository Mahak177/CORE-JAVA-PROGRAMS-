import java.util.Scanner;

public class Switch2{
    public static void main(String[] args) {
        char alpha;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        alpha = sc.next().charAt(0);

        switch(alpha) {
            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':
                System.out.println("Vowel");
            break;
            default:
                System.out.println("consonant");
        }
    }
}
