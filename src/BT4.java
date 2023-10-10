import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT4 {
    /**Viết một chương trình Java để chuyển đổi một chuỗi thành số nguyên.
     *  Nếu chuỗi không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và trả về giá trị mặc định là 0.
     ***/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi : ");
        String s = scanner.nextLine();
        String[] splitArray = s.split("");
        List<Integer> list  = new ArrayList<>();
        for (String str : splitArray) {
            try{
                int num = Integer.parseInt(str);
                list.add(num);
            }catch (NumberFormatException e) {
                list.add(0);
                System.out.println("Ký tự thứ " + str + " không phải số nguyên. Đã thay thế bằng 0.");
            }

        }
        System.out.println("Danh sách số nguyên " + list);
        scanner.close();
    }
}