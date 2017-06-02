/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer6;

/**
 *
 * @author RandyLee
 */
public class Growth {

    private double startSize; // initial size
    private double endSize; // maximum size
    private double fractionGrowthRate; // per unit time
//*****************************************************************

    public void initialize(double start, double end, double factor) {
        this.startSize = start;
        this.endSize = end;
        this.fractionGrowthRate = factor;
    } // end initialize
//*****************************************************************

    public double getSize(double time) {
        double g0 = Math.log(startSize / (1.0 - startSize / endSize));
        return 1.0 / (1.0 / endSize
                + Math.exp(-(fractionGrowthRate * time + g0)));
    } // end getSize
//*****************************************************************

    public double getSizeIncrement(double size, double timeStep) {
        return fractionGrowthRate
                * size * (1.0 - size / endSize) * timeStep;
    } // end getSizeIncrement 
}
