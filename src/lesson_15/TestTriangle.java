package lesson_15;

class TriangleException extends RuntimeException{
    public TriangleException(String wrong_triangle) {
        super("Wrong triangle");
    }
}

class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if(a>(b+c)|| b>(a+c)|| c>(a+b)){
            throw new TriangleException("Wrong triangle");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    int getPerimeter() {
        return a + b + c;
    }
}

public class TestTriangle {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(10,15,30);
        System.out.println(tr1.getPerimeter());
        System.out.println(tr1);


    }
}
