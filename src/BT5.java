import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    /***
     * Viết một chương trình Java để tìm kiếm một phần tử trong một mảng số nguyên bằng thuật toán tìm kiếm nhị phân.
     * Nếu phần tử không được tìm thấy trong mảng, chương trình sẽ hiển thị thông báo lỗi.**/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        int[] arr = {2, 12, 8, 7, 5, 23, 10, 56, 40, 91};
        Arrays.sort(arr);
        System.out.println("Mảng đã đc sắp xếp " + Arrays.toString(arr));

        System.out.println("Nhập giá trị cần tìm kiếm");
        int target = scanner.nextInt();


        int index = binarySearch(arr,target);
        if (index != -1)
        {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy phần tử " + target + " trong mảng.");
        }

        scanner.close();
    }


    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
