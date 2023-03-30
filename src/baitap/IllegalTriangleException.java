package baitap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static class illegalTriangleException extends Exception {
        public illegalTriangleException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào cạnh c: ");
        int c = scanner.nextInt();
        try {
            if (a < 0 || b < 0 || c < 0 || (a + b) < c || (b + c) < a || (a + c) < b) {
                throw new illegalTriangleException("Không phải là tam giác");
            } else {
                System.out.println("Không phải là tam giác");
            }
        } catch (illegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
