package Circle;

public class Triangle {
    int a;
    int b;
    int c;
    Triangle(int a, int b, int c) throws RadiusExseption {
        if(a<0 || b<0 || c< 0){throw new RadiusExseption("radius can't be minus");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public double P(){
        return (this.a+this.b + this.c);
    }
    public double S(){
        double p=P();
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
