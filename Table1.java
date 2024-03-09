import java.util.Scanner;

public class Table1 {
    public static void main(String[] args) {
        int num,i,res;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number to print table: ");
        num=sc.nextInt();
        for (i=1;i<=10;i++){
            res=num*i;
            System.out.println(num+" "+"*"+" "+i+"="+res);

        }
    }
}
