package Circle;

public class Rectangle extends Figure implements IFigure {


    /** field a
     */
    private int a;

    /**
     * field b
     */
    private int h;

    Rectangle(int h, int a) throws ValueCantbeMinusExseption {
        setA(a);
        setH(h);
    }

    /**
     * function to get the value of line {@link Rectangle#h)
     * @return
     */
    public int getH(){
        return h;
    }

    /**
     * Function to set the value of line {@link Rectangle#h}
     * @param h width of the rectangle
     */
    public void setH(int h) throws ValueCantbeMinusExseption {
        if (h < 0) throw new ValueCantbeMinusExseption("length can't be minus");
        this.h=h;
    }

    /**
     * function to get the value of line {@link Rectangle#a)
     * @return a
     */
    public int getA(){
        return a;
    }

    /**
     * Function to set the value of line {@link Rectangle#a}
     * @param a length of the rectangle
     */
    public void setA(int a) throws ValueCantbeMinusExseption {
        if(a < 0 ) throw new ValueCantbeMinusExseption("width can't be minus");
        this.a = a;
    }

    /**
     * function count perimeter of the rectangle
     * @return 2 * a + 2 * h - perimeter
     */
    public double P(){
        return 2 * a + 2 * h;
    }

    @Override
    /**
     * function count square of the rectangle
     * @return a*b - square of the rectangle
     */
    public double S(){
        return a * h;
    }

}
