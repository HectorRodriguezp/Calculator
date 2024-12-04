public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division zero");
            return 0;
        }
        return a / b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
            System.out.println("Addition: " + calculator.add(2, 3));
            System.out.println("Subtraction: " + calculator.subtract(5, 3));
            System.out.println("Multiplication: " + calculator.multiply(2, 3));
            System.out.println("Division: " + calculator.divide(6, 3));
            System.out.println("Division zero: " + calculator.divide(6, 0));
             System.out.println("Modulus: " + calculator.modulus(10, 3));

        }

    }





