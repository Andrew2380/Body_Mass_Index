public class BmiService {
    public float calculate(float weight, float length) {
        float index = weight / ((length / 100) * (length / 100));

        return index;
    }
}
