
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Программа для вычисления нормы и модуля ===");
        System.out.println("Выберите тип объекта:");
        System.out.println("1 - Комплексное число");
        System.out.println("2 - Трехмерный вектор");
        System.out.print("Ваш выбор (1 или 2): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                createComplexNumber(scanner);
                break;
            case 2:
                createVector3D(scanner);
                break;
            default:
                System.out.println("Некорректный выбор!");
        }
        
        scanner.close();
    }
    
    private static void createComplexNumber(Scanner scanner) {
        System.out.println("\n=== Создание комплексного числа ===");
        System.out.print("Введите действительную часть: ");
        double real = scanner.nextDouble();
        
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextDouble();
        
        Complex complex = new Complex(real, imaginary);
        
        System.out.println("\n=== Результаты ===");
        System.out.println("Комплексное число: " + complex);
        System.out.printf("Норма: %.4f%n", complex.norm());
        System.out.printf("Модуль: %.4f%n", complex.modulus());
    }
    
    private static void createVector3D(Scanner scanner) {
        System.out.println("\n=== Создание трехмерного вектора ===");
        System.out.print("Введите координату X: ");
        double x = scanner.nextDouble();
        
        System.out.print("Введите координату Y: ");
        double y = scanner.nextDouble();
        
        System.out.print("Введите координату Z: ");
        double z = scanner.nextDouble();
        
        Vector3D vector = new Vector3D(x, y, z);
        
        System.out.println("\n=== Результаты ===");
        System.out.println("Вектор: " + vector);
        System.out.printf("Норма: %.4f%n", vector.norm());
        System.out.printf("Модуль: %.4f%n", vector.modulus());
    }
}
