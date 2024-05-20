import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Nhập A[%d]: ", i + 1);
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        System.out.print(">> Sau khi đã sắp xếp, mảng có giá trị là : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }


        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(min > num[i])
                min = num[i];
        }
        System.out.println("\n >> Số nhỏ nhất là : " + min);

        //
        int sum = 0,count = 0;
        for (int i = 0; i < num.length; i++) {
            if ( num[i] % 3 == 0) { //Kiểm tra xem có chia hết cho 3 hay không
                sum = sum + num[i];
                count = count + 1;
            }
        }

        System.out.println(">> Trung bình cộng các số chia hết cho 3 là : " + sum/count);

    }

}
