// Phát triển một chương trình thực hiện xoá một phần tử được nhập vào từ bàn phím ra khỏi mảng,
// nếu phần tử đó xuất hiện trong mảng.
//Để thực hiện được việc xoá, trước tiên cần tìm xem phần tử đó có xuất hiện trong mảng hay không.
// Nếu xuất hiện cần chỉ ra vị trí của phần tử đó.
//Việc xoá một phần tử trong mảng chính là thực hiện ghi đè phần tử đằng sau nó lên chính phần tử cần xoá.
//Dòng value: hiển thị các giá trị trong mảng cho trước. 7 là phần tử cần xoá.
// Sau khi 7 xoá khỏi mảng thì có mảng với giá trị mới ở dòng new value.


import java.sql.SQLOutput;
import java.util.Arrays;

public class BT1 {
    public static void main(String[] args) {

        // arr cũ [10,4,6,7,8,6,0,0,0,0]
        // arr mới [10,4,8,6,0,0,0,0,0]
        // index [0,1,2,3,4,5,6,7,8,9]

        int[] arr = {10,4,6,7,8,6,0,0,0,0};
        int valueDelete = 7;

        // tìm index để xóa
        int indexDelete = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueDelete) {
                indexDelete = i;
            break;
            }
        }

        System.out.println("Trước khi xóa " + Arrays.toString(arr));
            for (int i = indexDelete; i < arr.length -1; i++) {
                arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.println("Sau khi xóa " + Arrays.toString(arr));
    }
}
