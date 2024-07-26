//Viết một phương thức Java để loại bỏ tất cả các khoảng trắng (space) thừa ở 2 đầu của chuỗi

public class BT8 {
    public static String main(String str) {
        //Kiểm tra chuỗi rỗng
        if  (str == null || str.isEmpty()){
            return str; // Trả về chuỗi gốc nếu rỗng
        }

        //Tìm vị trí ký tự đầu tiên không phải khoảng trắng từ đầu chuỗi
        int start = 0;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        //Tìm vị trí ký tự đầu tiên không phải khoảng trắng từ cuối chuỗi
        int end = str.length() - 1;
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        //Trích xuất chuỗi con không chứa khoảng trắng thừa
        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String chuoiGoc = " Xin chào, Mr.Tuc! ";
        String chuoiHoanThien = main(chuoiGoc);
        System.out.println("Chuỗi gốc: |" + chuoiGoc + "|");
        System.out.println("Chuỗi sau khi xử lý: |" + chuoiHoanThien + "|");
    }
}
