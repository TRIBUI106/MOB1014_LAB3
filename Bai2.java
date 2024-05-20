import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Nhập số để thực hiện phép nhân : ");
//        int x = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d\n",x,i,x*i);
//        }

        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d",i,j,i*j);
                System.out.println();
            }
            System.out.println();
        }

        
    }


}
