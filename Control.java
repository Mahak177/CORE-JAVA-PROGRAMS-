import java.util.*;
public class Control {
    public static void main(String[] args) {
        int m1,m2,m3,m4,per;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter four subject marks of the students");
        m1=sc.nextInt();
        m2= sc.nextInt();
        m3=sc.nextInt();
        m4= sc.nextInt();
        per=(m1+m2+m3+m4)/4;
        if (per>=75){
            System.out.println("honours");
        }
        else if(per>=60){
            System.out.println("first");
        } else if (per>=50) {
            System.out.println("second");

        } else if (per>=40) {
            System.out.println("third");
        }
        else{
            System.out.println("failed");
        }
    }
}
