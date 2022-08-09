package QuadraticEquation;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Nhập vào a: ");
        int a = input.nextInt();
        System.out.print("Nhập vào b: ");
        int b = input.nextInt();
        System.out.print("Nhập vào c: ");
        int c = input.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a ,b ,c);
        double delta = quadraticEquation.getDiscriminant();
        double x1 = quadraticEquation.getRoot1();
        double x2 = quadraticEquation.getRoot2();

        if (delta<0) System.out.println("Phương trình vô nghiệm!");
        else if (delta==0) System.out.println("Có nghiệm kép: x=" + x1);
        else System.out.printf("Phương trình có 2 nghiệm: x1=%f và x2=%f", x1, x2);
    }
}
