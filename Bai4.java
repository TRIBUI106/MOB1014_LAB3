import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

    public static void sapXep(String sv[], float diemSV[]) {
        for (int i = 0; i < diemSV.length; i++) {
            for (int j = 0; j < diemSV.length; j++) {
                if (diemSV[i] < diemSV[j]) {
                    float temp = diemSV[i];
                    diemSV[i] = diemSV[j];
                    diemSV[j] = temp;
                    String svTemp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = svTemp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên : ");
        int n = sc.nextInt();

        String[] sinhVien = new String[n];
        float[] diemSV = new float[n];


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("[%d] Nhập tên sinh viên: ", i + 1);
            sinhVien[i] = sc.nextLine();
            System.out.printf("[%d] Nhập điểm sinh viên: ", i + 1);
            diemSV[i] = sc.nextFloat();
            System.out.println();
        }
        sapXep(sinhVien, diemSV);

        for (int i = 0; i < n; i++) {
            System.out.println("Danh Sách " + i);
            System.out.println("Tên Sinh Viên: " +sinhVien[i]);
            System.out.println("Điểm Sinh Viên: "+diemSV[i]);
            if ( diemSV[i] > 10 ) {
                System.out.println("Nhập sai điểm !");
            } else if (diemSV[i] >= 9) {
                System.out.println("Học Lực : Xuất Sắc");
            } else if ( diemSV[i] >= 7.5 ) {
                System.out.println("Học Lực : Giỏi");
            } else if (diemSV[i] >= 6.5) {
                System.out.println("Học Lực : Khá");
            } else if (diemSV[i] >= 5) {
                System.out.println("Học Lực : Trung Bình");
            } else {
                System.out.println("Học Lực : Yếu");
            }
            System.out.println();
        }
    }
}
