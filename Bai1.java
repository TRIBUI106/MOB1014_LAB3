import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();

        boolean work = true;
        for(int i = 2; i < n-1; i++)
        {
            if ( n % i == 0 ) {
                System.out.println("Chia hết cho "+i)
                work = false;
                break;
            }
        }

        if (work) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println( n + " không phải là số nguyên tố");
        }


    }




}
