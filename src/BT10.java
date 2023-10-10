import java.util.Scanner;

public class BT10 {
    /**
     * Đề bài:  Viết một chương trình Java để tính diện tích hình tròn với bán kính nhập vào từ bàn phím.
     * Nếu người dùng nhập vào một giá trị âm, chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
     * Hướng dẫn:
     * - Bước 1: Khai báo biến và nhập dữ liệu
     * Khai báo biến để lưu giá trị bán kính và diện tích hình tròn.
     * Sử dụng Scanner để nhập giá trị bán kính từ người dùng.

     * - Bước 2: Kiểm tra điều kiện giá trị âm
     * Kiểm tra nếu giá trị bán kính là một số âm (nhỏ hơn 0), hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.

     * - Bước 3: Tính diện tích hình tròn
     * Sử dụng công thức pi * r * r để tính diện tích hình tròn, với r là bán kính và pi là số Pi (có thể sử dụng giá trị gần đúng 3.14159).

     * - Bước 4: Hiển thị kết quả
     * In ra diện tích hình tròn.

     * - Bước 5: Kết thúc chương trình.\
     * **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check){
            try{
                System.out.println("Mời nhập bán kính : ");
                double banKinh = scanner.nextDouble();
                if (banKinh <= 0){
                    System.err.println("Vui lòng nhập bán kính lớn 0 ");
                }else {
                    double tinhDienTich = Math.PI* banKinh *banKinh;
                    System.out.println("Diện tích là " + tinhDienTich);
                    check =true;
                }
            }catch (Exception e){
                System.err.println("Lỗi , Vui lòng nhập lại ");
                scanner.nextLine();
            }

        }
        scanner.close();
    }
}
