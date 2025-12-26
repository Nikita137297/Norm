
package main;
public class Vector3D implements Norm {
    private double x;
    private double y;
    private double z;
    
    // Конструктор
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    // Геттеры
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getZ() {
        return z;
    }
    
    // Реализация метода norm() из интерфейса Norm
    @Override
    public double norm() {
        // Норма вектора - квадрат его длины
        return x * x + y * y + z * z;
    }
    
    // Реализация метода modulus() из интерфейса Norm
    @Override
    public double modulus() {
        // Модуль вектора - его длина
        return Math.sqrt(norm());
    }
    
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
