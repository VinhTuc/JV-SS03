//Viết một ứng dụng cho phép người dùng nhập vào một ma trận số thực
// sau đó tìm ra tọa độ cũng như giá trị của phần tử lớn nhất
//In ra ma trận
//Hiển thị ra giá trị lớn nhất trong mảng hai chiều

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập kích thước ma trận
        System.out.println("Nhập số hàng của ma trận: ");
        int soHang = sc.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int soCot = sc.nextInt();

        // Khai báo và khởi tạo ma trận
        double[][] maTran = new double[soHang][soCot];

        //Nhập các phần tử của ma trận
        System.out.println("Nhập các phần tử của ma trận: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Phần tử tại vị trí [" + i + "][" + j + "]: ");
                maTran[i][j] = sc.nextDouble();
            }
        }

        // Tìm tọa độ và phần tử lớn nhất
        double max = maTran[0][0]; //giả sử phần tử đầu là lớn nhất
        int hangMax = 0, cotMax = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                    hangMax = i;
                    cotMax = j;
                }
            }
        }

        // In ma trận
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println(maTran[i][j] + "\t");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }

        // Hiển thị kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ của phần tử  lớn nhất là: [" + hangMax + "][" + cotMax + "]");
    }
}
