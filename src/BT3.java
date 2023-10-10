import java.util.Scanner;

public class BT3 {
    /**Viết một chương trình Java để tính tổng của một mảng số nguyên.
     * Nếu một phần tử trong mảng không phải số nguyên,
     * chương trình sẽ hiển thị thông báo lỗi và bỏ qua phần tử đó.
     **/
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Mời nhập số lượng mảng: ");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        System.out.println("Mời nhập phần tử của mảng : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i+1) + " là: ");
            arr[i] =Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            try {
                sum += arr[i];
            }catch (NumberFormatException e) {
                System.out.println("aaaaaaaaaaaaaa");
            }

        }
        System.out.println("Tổng của mảng là " + sum);
    }

}
