public class IndexService {
    public double index(double weight, double growth) {
        double indexResult;

        indexResult = (weight / (growth * growth));
        return indexResult;
    }
}
