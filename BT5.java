//Phát triển một chương trình cho phép người dùng khai báo một mảng số nguyên
//với các giá trị trong mảng được khởi tạo sẵn hoặc được nhập từ bàn phím.
//Hiển thị mảng đó ra màn hình
//Hiển thị giá trị nhỏ nhất trong mảng đó ra màn hình

import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang;

        System.out.println("Chọn cách khởi tạo mảng: ");
        System.out.println("1. Khởi tạo sẵn giá trị");
        System.out.println("2. Nhập giá trị từ bàn phím");
        int luaChon = sc.nextInt();

        if (luaChon == 1) {
            //Khởi tạo sẵn giá trị mảng
            mang = new int[] {1, 2, 3, 4, 5};
        } else if (luaChon == 2) {
            //Nhập giá trị từ bàn phím
            System.out.println("Nhập số lượng phần tử của mảng: ");
            int n = sc.nextInt();
            mang = new int[n];
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                mang[i] = sc.nextInt();
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ rồi!");
            return;
        }

        //Hiển thị mảng
        System.out.println("Mảng bạn vừa tạo: " + Arrays.toString(mang));

        //Tìm giá trị nhỏ nhất
        int min = mang[0];
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
