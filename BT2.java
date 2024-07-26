//Phát triển một chương trình cho phép người dùng khai báo mảng số nguyên gồm N phần tử.
// Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn, giá trị này được chèn vào vị trí đó trong mảng.
//Dòng value: Gồm 10 các phần tử trong mảng. Các phần tử chưa có giá trị mặc định được gán là 0.
//Dòng index: Đánh chỉ số trong mảng từ 0 đến 9
//Dòng new value: Khi thêm một giá trị X mới vào vị trí thứ 3.
// Phần tử ở vị trí thứ 3 sẽ đẩy xuống vị trí 4. Phần tử ở vị trí thứ 4 sẽ đẩy xuống vị trí thứ 5.


import java.util.ArrayList;
import java.util.Arrays;

public class BT2 {
    public static void main(String[] args) {

        int[] arr = {10,4,6,7,8,6,7,3,2,1};
        //            0 1 2 3 4 5 6 7 8 9
        int[] newArr = new int[arr.length + 1];
        int valueInsert = 5;
        int indexInsert = 3;

        System.out.println("Trước khi " + Arrays.toString(arr));
        for(int i = 0; i<newArr.length; i++){
            if (i < indexInsert){
                newArr[i] = arr[i];
            } else if (i == indexInsert){
                newArr[i] = valueInsert;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println("Sau khi " + Arrays.toString(newArr));
    }
}
