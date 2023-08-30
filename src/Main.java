// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main { //Tính diện tích hình chữ nhật
    public static void main(String[] args) {
        // Khai báo biến chiều rộng a, chiều cao b
        double a = 20;
        double b = 90;
        //Tính diện tích S
        double S = a*b;
        // in ra kết quả tính diện tích
        System.out.println("Diện tích của hình chữ nhật là: " + S);
    }
}

class LinearEquationResolver { // Giải phương trình ax+b=0. Tìm x?
    public static void main(String[] args) {
        //Khai báo hệ số a và b
        double a = 2;
        double b = 9;
        // Giải phương trình và tìm nghiệm x
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x= " + x);
        }
    }
}