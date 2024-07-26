//Viết một chương trình Java để nối hai chuỗi lại với nhau bằng phương thức nối chuỗi của String

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        String chuoi1 = "Xin chào, ";
        String chuoi2 = "Mr.Tuc!";

        //Nối chuỗi sử dụng phương thức concat()
        String chuoiNoi = chuoi1.concat(chuoi2);

        System.out.println("Chuỗi sau khi nối nè: " + chuoiNoi);
    }
}

//chuoi1.concat(chuoi2): Phương thức concat() của chuoi1 được gọi, nhận chuoi2 làm tham số.
// Phương thức này trả về một chuỗi mới là kết quả của việc nối chuoi1 và chuoi2.
