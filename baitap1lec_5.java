import java.util.Random;
public class baitap1lec_5 {
    public static void main(String[] args) {
        Random random = new Random(); 
        int soNgauNhien = random.nextInt(100) + 1;      
        System.out.println("So nguyen ngau nhien tu 1 den 100 la: " + soNgauNhien);
    }
}
