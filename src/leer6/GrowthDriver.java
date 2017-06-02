/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer6;

import java.util.Scanner;

/**
 *
 * @author RandyLee
 */
public class GrowthDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        double timeStep;
        double timeMax;
        Growth entity = new Growth();
        double startSize = 1.0;
        double endSize = 40.0;
        double fractionGrowthRate = 1.0;
        double size = startSize;

        entity.initialize(startSize, endSize, fractionGrowthRate);
        System.out.print("Enter time increment: ");
        timeStep = stdin.nextDouble();
        System.out.print("Enter total time units to simulate: ");
        timeMax = stdin.nextDouble();
        System.out.println("        exact   simulated");
        System.out.println("time    size    size");

        for (double time = 0.0; time <= timeMax; time += timeStep) {
            System.out.printf("%4.1f%8.1f%8.1f\n",
                    time, entity.getSize(time), size);
            size += entity.getSizeIncrement(size, timeStep);
        } // end for
    }

}
