import java.util.Scanner;

public class BT2 {
    /**
     * Viết một chương trình Java để tìm số lớn nhất trong một mảng số nguyên.
     * Nếu mảng không có phần tử nào, chương trình sẽ hiển thị thông báo lỗi.**/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số lượng phần tử của mảng");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " +(i+1) +"là : ");
            arr[i] = scanner.nextInt();
        }
        if (n == 0){
            throw new IllegalArgumentException("Mảng rỗng, không tìm thấy số lớn nhất");
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("Số lớn nhất trong mảng là :" + max);
    }
}
