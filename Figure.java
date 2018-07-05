package Circle;

public class Figure {

    /**
     * function compares square
     * @param comparfigure1 square figure with which they compare
     * @return 0 if square =; -1 if square rectangle square less and 1 if square more
     */
    public int comparison(double comparfigure1){
        if (S() == comparfigure1){
            return 0;
        }else if (S() > comparfigure1){
            return 1;
        }else {
            return -1;
        }
    }

    public double S() {
        return 1;
    }
}
