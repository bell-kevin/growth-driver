package growthdriver;

import java.util.Scanner;

public class GrowthDriver {

    public static void main(String[] args) {
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
        }
    }
}
