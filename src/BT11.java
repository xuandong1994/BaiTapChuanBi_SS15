import java.util.Scanner;

public class BT11 {
    /**
     * Đề bài: Viết một chương trình Java để kiểm tra tính hợp lệ của một ngày tháng năm.
     * Nếu ngày tháng năm không hợp lệ, chương trình sẽ hiển thị thông báo lỗi.
     * Hướng dẫn:
     * B1: Nhập vào ngày, tháng, năm từ người dùng.
     * B2 :Kiểm tra tính hợp lệ của ngày tháng năm đó bằng cách kiểm tra các điều kiện sau:
     * Năm phải lớn hơn 0.
     * Tháng phải nằm trong khoảng từ 1 đến 12.
     * Số ngày trong tháng phải hợp lệ (tức là phải từ 1 đến số ngày tương ứng với tháng đó).
     * B3: Nếu ngày tháng năm hợp lệ, hiển thị thông báo "Ngày tháng năm hợp lệ".
     * B4: Nếu ngày tháng năm không hợp lệ, ném ngoại lệ bất kỳ và thông báo lỗi.**/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                System.out.println("Mời nhập ngày : ");
                int day = scanner.nextInt();
                System.out.println("Mời nhập tháng :");
                int month = scanner.nextInt();
                System.out.println("Mời nhập năm :");
                int year = scanner.nextInt();
                if (year > 0 && month >= 1 && month <= 12) {
                    int soNgayTrongThang = getSoNgayTrongThang(month, year);
                    if (day >= 1 && day <= soNgayTrongThang) {
                        System.out.println("Ngày tháng năm hợp lệ." + day + "-" + month + "-" + year);
                        check = true;
                    } else {
                        throw new Exception("Ngày không hợp lệ.");
                    }
                } else {
                    throw new Exception("Ngày tháng năm không hợp lệ.");
                }

            } catch (Exception e) {
                System.err.println("Lỗi: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    private static int getSoNgayTrongThang(int month, int year){
        int soNgay;
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    soNgay = 29; // Năm nhuận
                } else {
                    soNgay = 28; // Năm không nhuận
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            default:
                soNgay = 31;
                break;
        }
        return soNgay;
    }
}
