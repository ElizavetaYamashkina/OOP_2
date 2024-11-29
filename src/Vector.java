import java.io.IOException;
/**
 * Класс Vector реализует динамический массив объектов,
 * размер которого может расти или уменьшаться.
 * В данной программе представляет вектор в трехмерном пространстве,
 * благодаря ему можем проводить разлижные операции.
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     * Конструктор.
     */
    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Конструктор с параметрами.
     * @param x - Координата вектора x.
     * @param y-координата вектора y.
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    /**
     * @return возвращает x-координату вектора.
     */
    public double getX() {
        return x;
    }

    /**
     * @return возвращает y-координату вектора.
     */
    public double getY() {
        return y;
    }

    /**
     * @return возвращает z-координату вектора.
     */
    public double getZ() {
        return z;
    }



    /**
     * @param x Задает координату x для вектора.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @param y Задает координату y для вектора.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @param z Задает координату y для вектора.
     */
    public void setZ(double z) {
        this.z = z;
    }



    /**
     * @return возвращает длину вектора.
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Вычисляет скалярное произведение двух векторов.
     * @param v вектор.
     * @return возвращает скалярное произведение двух векторов.
     */
    public double scalar(Vector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    /**
     * Вычисляет векторное произведение двух векторов.
     * @param v вектор.
     * @return возвращает новый вектор,векторное произведение.
     */
    public Vector vectorP(Vector v) {
        double newX = this.y * v.z - this.z * v.y;
        double newY = this.z * v.x - this.x * v.z;
        double newZ = this.x * v.y - this.y * v.x;
        return new Vector(newX, newY, newZ);
    }

    /**
     * Умножает вектор на число.
     * @param scalar - число.
     * @return возвращает новый вектор, умноженный на скаляр.
     */
    public Vector vectorNumber(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    /**
     * Сумма векторов.
     * @param v вектор.
     * @return возвращает новый вектор, сумму векторов.
     */
    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    /**
     * Разность векторов.
     * @param v для другого вектора.
     * @return возвращает новый вектор, разницу между векторами.
     */
    public Vector subtract(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    public static void main(String[] args) throws IOException{
// Example usage of the Vector class
        Vector v1 = new Vector(6, 4, 2);
        Vector v2 = new Vector(7, 1, 4);
        System.out.println("Длинна v1: " + v1.length());
        System.out.println("Скалярное произведнние v1 и v2: Число  " + v1.scalar(v2));
        Vector v3 = v1.vectorP(v2);
        System.out.println("Векторнье произведение v1 и v2: Вектор с координатами(" + v3.getX() + ", " + v3.getY() + ", " + v3.getZ() + ")");
    }
}

