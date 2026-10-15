public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c){
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            this.a =a;
            this.b = b;
            this.c = c;
        }
        else {
          throw new ArithmeticException("З цих сторін не можна зробити трикутник");
        }
    }

    public int getPerimeter(){
        return a+b+c;
    }

    public double getArea(){
        double p2 = getPerimeter()/2d;
        double s = p2*(p2-a)*(p2-b)*(p2-c);
        return Math.sqrt(s);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle other)
            return (this.a == other.a && this.b == other.b && this.c == other.c);
        return super.equals(obj);
    }

    public boolean isGreater(Triangle other){
        return (this.getArea() > other.getArea());
    }

    public boolean isLesser(Triangle other){
        return (this.getArea() < other.getArea());
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %d", this.a, this.b, this.c);
    }
}
