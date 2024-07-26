// Sử dụng cấu trúc vòng lặp mảng một chiều với vòng lặp for.
// phát triển một chương trình cho phép gộp 2 mảng trở thành một mảng thứ 3
// Chương trình cho phép người dùng nhập giá trị cho các phần tử trong 2 mảng số nguyên cho trước
// Mảng số nguyên thứ 3 được khai báo có kích thước bằng kích thước của 2 mảng só nguyên đã cho cộng lại với nhau
// Mảng này sẽ chứa các phần tử trong mảng 1 và 2 chiều

  import java.util.Scanner;

  class BT3 {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    // Nhập kích thước và phần tử cho mảng thứ nhất
      System.out.print("Nhập kích thước mảng thứ nhất: ");
      int n1 = sc.nextInt();
      int[] mang1 = new int[n1];
      nhapMang(mang1, sc);

      // Nhập kích thước và phần tử cho mảng thứ hai
      System.out.println("Nhập kích thước mảng thứ hai: ");
      int n2 = sc.nextInt();
      int[] mang2 = new int[n2];
      nhapMang(mang2,sc);

      // Nhập mảng thứ ba bằng tổng kích thước hai mảng
      int[] mang3 = new int[n1 + n2];

      // Gộp mảng thứ nhất vào mảng thứ ba
      for (int i = 0; i < n1; i++) {
       mang3[i] = mang1[i];
      }

      // Gộp mảng thứ hai vào mảng thứ ba
      for (int i = 0; i < n2; i++) {
       mang3[n1 + i] = mang2[i]; // bắt đầu từ vị trí n1
      }

      // In mảng thứ ba sau khi gộp
      System.out.println("Mảng sau khi gộp: ");
      for (int i = 0; i < mang3.length; i++) {
       System.out.println(mang3[i] + " ");
      }
    }

   private static void nhapMang(int[] mang, Scanner sc) {
    System.out.println("Nhập các phần tử của mảng: ");
    for (int i = 0; i < mang.length; i++) {
     mang[i] = sc.nextInt();
    }
   }
  }