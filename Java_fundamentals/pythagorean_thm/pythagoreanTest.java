import java.lang.Math;
public class pythagoreanTest {
    public double calculateHypotenuse(int legA, int legB) {
        double c = (legA)*(legA) + (legB)*(legB);
        double squareRoot = Math.sqrt(c);
        return squareRoot;
    }
}