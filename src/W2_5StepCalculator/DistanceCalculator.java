package W2_5StepCalculator;

public class DistanceCalculator {

    public Double calculateDistance(Double steps) {
        Double kilometersPerStep = 0.000762;
        return steps * kilometersPerStep;
    }

}