package Circle;

/**
 * @author  pasha
 * @version 1.0
 **/
public class ComparisonSquare {

    /**
     *  field S square figure
     */
     public double S;

    /**
     * function compares square
     * @param figure1 square figure with which they compare
     * @return 0 if square =; -1 if square rectangle square less and 1 if square more
     */
    public int comparison(double figure1){
        if (this.S == figure1){
            return 0;
        }else if (this.S > figure1){
            return 1;
        }else {
            return -1;
        }
    }

    public void setS(double s) {
        this.S = s;
    }
}
