import java.util.Random;
import java.util.Scanner;
public class baitap6lec_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int soNgauNhien = random.nextInt(100) + 1;
        int soNguoiChoiDoan;
        while (true) {
            System.out.print("Nhap so ban doan (1 - 100): ");
            soNguoiChoiDoan = scanner.nextInt();
            if (soNguoiChoiDoan > soNgauNhien) {
                System.out.println("sai roi nhap so nho hon deee");
            } else if (soNguoiChoiDoan < soNgauNhien) {
                System.out.println("sai roi nhap so lon hon deee");
            } else {
                System.out.println("Chuc mung!");
                break; 
            }
        }
    }
}

