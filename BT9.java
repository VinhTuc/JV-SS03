//khai báo 2 biến đại diện cho email và password
//dùng regex để kiểm tra email
//Regex với email thì phải đúng định dạng
//Regex với password thì phải không có dấu cách (space) và phải lơn hơn 6 kí tự

import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Email: ");
        String email = sc.nextLine();

        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();

        //Biểu thức cho Email
        String regexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        //Kiểm tra Emial
        if (email.matches(regexEmail)) {
            System.out.println("Email hợp lệ.");

            //Kiểm tra mật khẩu
            if (password.length() >= 6 && !password.contains(" ")) {
                System.out.println("Mật khẩu hợp lệ.");
            } else {
                System.out.println("Mật khẩu không hợp lệ. Ít nhất 6 ký tự và không khoảng cách nghen hôn.");
            }
        } else {
            System.out.println("Email không hợp lệ rồi nhé!");
        }
    }
}
