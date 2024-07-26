//Viết một chương trình Java để kiểm tra xem một chuỗi có chứa một chuỗi con khác không,
// sử dụng phương thức contains() của String

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi chính: ");
        String chuoiChinh = sc.nextLine();

        System.out.println("Nhập chuỗi con cần kiểm tra: ");
        String chuoiCon = sc.nextLine();

        //Kiểm tra chuỗi con
        if (chuoiChinh.contains(chuoiCon)) {
            System.out.println("Chuỗi con '" + chuoiCon + "' tồn tại trong chuỗi chính.");
        } else {
            System.out.println("Chuỗi con '" + chuoiCon + "' không tồn tại trong chuỗi chính.");
        }
    }
}

//chuoiChinh.contains(chuoiCon): Phương thức contains() được gọi trên chuoiChinh,
// kiểm tra xem nó có chứa chuoiCon hay không.
//Nếu chứa, phương thức trả về true. Ngược lại, trả về false.