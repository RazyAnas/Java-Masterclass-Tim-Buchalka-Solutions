package ComplexNumberOperations;

public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for real part
    public double getReal() {
        return real;
    }

    // Getter for imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Add method with real and imaginary parameters
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Add method with another ComplexNumber
    public void add(ComplexNumber other) {
        this.real += other.getReal();
        this.imaginary += other.getImaginary();
    }

    // Subtract method with real and imaginary parameters
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Subtract method with another ComplexNumber
    public void subtract(ComplexNumber other) {
        this.real -= other.getReal();
        this.imaginary -= other.getImaginary();
    }
}
