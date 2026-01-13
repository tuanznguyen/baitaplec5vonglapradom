import java.util.Random;
import java.util.Scanner;
public class baitap4lec_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Nhap so thuc tu 1 den 100: ");
        double soNguoiDungNhap = scanner.nextDouble();
        double soNgauNhien = random.nextDouble() * 99 + 1;
        System.out.println("So ngau nhien la: " + soNgauNhien);
        if (soNguoiDungNhap > soNgauNhien) {
            System.out.println("So ban lon hon so ngau nhien");
        } else if (soNguoiDungNhap < soNgauNhien) {
            System.out.println("So ban nho hon so ngau nhien");
        } else {
            System.out.println("So ban bang so ngau nhien");
        }
    }
}
