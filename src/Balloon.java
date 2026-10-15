public class Balloon {
    int x;
    int y;
    int r;

    public Balloon(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getArea(){
        return (Math.PI *Math.pow(r,2));
    }

    public double getDis(Balloon other){
        double d1 = Math.pow(other.x - this.x, 2);
        double d2 = Math.pow(other.y - this.y, 2);
        return (Math.sqrt(d1+d2));
    }

    public double getInter(Balloon other) {
        double d = getDis(other);

        if (d >= this.r + other.r) {
            return 0.0;
        }

        if (d <= Math.abs(this.r - other.r)) {
            double minR = Math.min(this.r, other.r);
            return Math.PI * minR * minR;
        }

        double part1 = this.r * this.r * Math.acos((d * d + this.r * this.r - other.r * other.r) / (2 * d * this.r));
        double part2 = other.r * other.r * Math.acos((d * d + other.r * other.r - this.r * this.r) / (2 * d * other.r));
        double part3 = 0.5 * Math.sqrt((-d + this.r + other.r) * (d + this.r - other.r) * (d - this.r + other.r) + (d + this.r + other.r));

        return part1 + part2 - part3;
    }

    public double getUnion(Balloon other){
        return (this.getArea()+other.getArea() - getInter(other));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Balloon other)
            return (this.x == other.x && this.y == other.y && this.r == other.r);
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %d", this.x, this.y, this.r);
    }
}
