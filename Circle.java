package Circle;

/**
 * Класс со свойствами <b>x</b> и <b>y</b, <b>R</b>.
 * @author  Павел
 * @version 1.0
 **/
public class Circle implements IFigure {

    /** field х */
    private float x;
    /** field y */
    private int y;
    /** field R */
    private float R;

    /** Конструктор
     *
     * @param  x coordinates of the centre the circle
     * @param  y coordinates of the centre the circle
     * @throws ValueCantbeMinusExseption exception radius can't be minus
     * @see Circle#Circle(float, int, int)
     */
    Circle(float x, int y, int R ) throws ValueCantbeMinusExseption {
        this.x = x;
        this.y = y;
        setR(R);
    }

    /**
     * function count circle square
     * @return  circle square
     */
    public double S(){
        return R * R * (float) Math.PI;
    }

    /**
     * function count circle perimeter
     * @return circle perimeter
     */
    public double P(){
        return R * 2 *(float) Math.PI;
    }

    /**
     * Function to set the value of line {@link Circle#x}
     * @param x coordinates of the centre the circle
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * function to get the value of line {@link Circle#x}
     * @return x coordinates of the centre the circle
     */
    public float getX() {
        return x;
    }

    /** function to set the value of line {@link  Circle#y}
     * @param y coordinates of the centre the circle
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * function to get the value of line {@link Circle#y}
     * @return y coordinates of the centre the circle
     */
    public int getY() {
        return y;
    }

    /** function to set the value of line {@link  Circle#R}
     * @param R value of the radius
     */
    public void setR(float R) throws ValueCantbeMinusExseption {
        if (R<0){
            throw new ValueCantbeMinusExseption("radius can't be minus");
        }
        this.R=R;
    }

    /**
     * function to get the value of line {@link Circle#R}
     * @return R value of the radius
     */
    public float getR() {

        return R;
    }

    /**
     *unction to return the value sun all circle
     * @param circles  array of circle
     * @return summS value sum all circle
     */
    public static float summScircl(Circle ...circles) {
        if (circles == null || circles.length == 0) {
            throw new IllegalArgumentException("Circles can't be null or empty");
        }
        float summS = 0;
        for (Circle i : circles) {
            summS += i.S();
        }
        return summS;
    }

}
