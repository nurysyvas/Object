package Circle;

public class Triangle extends Figure implements IFigure {

    /**
     * field a first side of teh triangle
     */
    int a;

    /**
     * second a first side of teh triangle
     */
    int b;

    /**
     * third a first side of teh triangle
     */
    int c;

    /**
     * constructor class Triangle
     * @param a first side of teh triangle
     * @param b second side of teh triangle
     * @param c third side of teh triangle
     * @throws ValueCantbeMinusExseption exception value
     */
    Triangle(int a, int b, int c) throws ValueCantbeMinusExseption {
        setA(a);
        setB(b);
        setC(c);
    }

    public void setA(int a) throws ValueCantbeMinusExseption {
        if(a <= 0){throw new ValueCantbeMinusExseption("side can't be minis or 0");
        }
        this.a = a;
    }

    public void setB(int b) throws ValueCantbeMinusExseption {
        if(b <= 0){throw new ValueCantbeMinusExseption("side can't be minis or 0");
        }
        this.b = b;
    }

    public void setC(int c) throws ValueCantbeMinusExseption {
            if(c <= 0){throw new ValueCantbeMinusExseption("side can't be minis or 0");
        }
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

    public  double P(){
        return (this.a + this.b + this.c);
    }


    @Override
    public  double S(){
        double p=P();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
