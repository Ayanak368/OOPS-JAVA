import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void print() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();

        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);
        ComplexNumber result = num1.add(num2);

        System.out.print("Sum: ");
        result.print();

        scanner.close();
    }
}

