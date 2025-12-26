
package main;

public class Complex implements Norm {
    private double real;
    private double imaginary;
    
    // Конструктор
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Геттеры
    public double getReal() {
        return real;
    }
    
    public double getImaginary() {
        return imaginary;
    }
    
    // Реализация метода norm() из интерфейса Norm
    @Override
    public double norm() {
        // Норма комплексного числа - квадрат модуля
        return real * real + imaginary * imaginary;
    }
    
    // Реализация метода modulus() из интерфейса Norm
    @Override
    public double modulus() {
        // Модуль комплексного числа
        return Math.sqrt(norm());
    }
    
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}