package Circle;

/**
 * Класс со свойствами <b>x</b> и <b>y</b, <b>R</b>.
 * @author  Павел
 * @version 1.0
 **/

public class Circle {

    /** поле х */
    private float x;
    /** поле y */
    private int y;
    /** поле R */
    private float R;

    /** Конструктор
     *
     * @param  x coordinates of the centre the circle
     * @param  y coordinates of the centre the circle
     * @param  R radius circle
     * @throws RadiusExseption exception radius can't be minus
     * @see Circle#Circle(float, int, int)
     */

    Circle(float x, int y, int R ) throws RadiusExseption {
        this.x = x;
        this.y = y;
        if (R<0) {
            throw new RadiusExseption("не может быть  -");
        }
        this.R=R;

    }

    /**
     * function count circle radius
     * @return  circle radius
     */

    public float S(){
        return R * R * (float) Math.PI;
    }

    /**
     * function count circle perimeter
     * @return circle perimeter
     */

    public float P(){
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

    public void setR(float R) throws RadiusExseption {
        try {
            if (R<0){
                throw new RadiusExseption("radius can't be minus");
            }
            this.R=R;
        } catch (NullPointerException e){
            e.getMessage();
        }

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
     * @param ar  array of circle
     * @return summS value sum all circle
     */
    public static float summScircl(Circle[] ar){
        float summS = 0;
        for (Circle i : ar){
            summS += i.S();
        }
        return summS;
    }

}
