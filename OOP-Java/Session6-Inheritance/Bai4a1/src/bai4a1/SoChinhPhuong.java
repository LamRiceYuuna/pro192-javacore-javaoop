package bai4a1;
import java.util.Scanner;
class SoChinhPhuong {
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập vào số cần kiểm tra:");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();
        if (checkPerfectSquare(num))
            System.out.println(num+ " Là số chính phương");
        else
            System.out.println(num+ " Không phải là số chính phương");
    }
}