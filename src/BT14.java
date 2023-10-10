import java.util.Scanner;

public class BT14 {
    /**
     * Đề bài: Viết một chương trình Java để tìm giá trị trung bình của một mảng số nguyên.
     * Nếu mảng không có phần tử nào, chương trình sẽ hiển thị thông báo lỗi.
     * hướng dẫn :
     *
     * Bước 1: Khai báo biến và nhập dữ liệu
     * Khai báo một mảng số nguyên và một biến để lưu giá trị trung bình.
     * Sử dụng Scanner để nhập số lượng phần tử của mảng từ người dùng.
     *
     * Bước 2: Kiểm tra điều kiện mảng rỗng
     * Kiểm tra nếu số lượng phần tử của mảng là 0 hoặc âm, hiển thị thông báo lỗi và kết thúc chương trình.
     *
     * b3: Nhập giá trị cho mảng
     * Sử dụng vòng lặp để nhập giá trị cho mảng từ người dùng.
     *
     * b4: Tính giá trị trung bình
     * Sử dụng vòng lặp để tính tổng của tất cả các phần tử trong mảng.
     * Chia tổng cho số lượng phần tử để tính giá trị trung bình.
     *
     * b5: Hiển thị kết quả
     * In ra giá trị trung bình của mảng.
     * b6: Kết thúc chương trình**/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Mời nhập số lượng phần tử mảng: ");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                if (n <= 0) {
                    System.err.println("Số lượng phần tử phải lớn hơn không.");
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.println("Phần tử thứ " + (i + 1) + " của mảng là: ");
                        arr[i] = scanner.nextInt();
                    }
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    double average = (double) sum / n;
                    System.out.println("Giá trị trung bình của mảng là: " + average);
                    check = true;
                }
            } catch (Exception e) {
                System.err.println("Lỗi, vui lòng nhập lại.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
