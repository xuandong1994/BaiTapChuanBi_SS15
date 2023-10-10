import java.util.Scanner;

public class BT15  {
    /**
     * Viết một ứng dụng nhập vào 3 cạnh của hình tam giác.
     * Kiểm tra nếu giá trị nhập vào là số âm hoặc tổng 2 cạnh không lớn hơn cạnh còn lại thì sinh ngoại lệ.
     * Sử dụng IllegalTriangleException để sinh lỗi khi kiểm tra tam giác.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập vào độ dài của 3 cạnh của tam giác:");
            System.out.print("Cạnh a: ");
            double a = scanner.nextDouble();
            System.out.print("Cạnh b: ");
            double b = scanner.nextDouble();
            System.out.print("Cạnh c: ");
            double c = scanner.nextDouble();

            validateTriangle(a, b, c);
            System.out.println("Ba cạnh nhập vào tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi: Nhập không hợp lệ.");
        } finally {
            scanner.close();
        }
    }

    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Không thể tạo thành tam giác với 3 cạnh đã cho.");
        }
    }
}
