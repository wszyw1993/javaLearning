package j2se;

public class GoldenPoint {
	public static void main(String[] args) {
		double goldenPoint = 0.618;
		double lastResult = 0.00;
		double closestPoint = 0.00;
		double closestDenominator = 0.00;
		double clostestNumerator = 0.00;
		int denominator;
		int numerator=1;
        for (denominator = 2 ; denominator<20; denominator++) {
    	    for (numerator = 1 ; numerator < denominator; numerator++) {
    		    if (denominator % 2 == 0 && numerator % 2 == 0)
    			    continue;
    		    double currentPoint = (double) numerator / denominator ;
    		    double curResidual = Math.abs(currentPoint-goldenPoint);
    		    double lastResidual = Math.abs(lastResult-goldenPoint);
    		    if (curResidual<lastResidual) {
    		    	closestPoint = currentPoint;
    		        lastResult = closestPoint;
    		    	closestDenominator = denominator;
    		    	clostestNumerator = numerator;
    		    }
    	    }
        }
    	System.out.println(clostestNumerator+"/"+closestDenominator+"="+closestPoint);
    }
}
