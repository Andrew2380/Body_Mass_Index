public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float weight = 80;
        float length = 180;
        float index = service.calculate (weight, length);
        System.out.println(index);

        float weight1 = 70;
        float length1 = 190;
        float index1 = service.calculate (weight1, length1);
        System.out.println(index1);

        float weight2 = 90;
        float length2 = 170;
        float index2 = service.calculate (weight2, length2);
        System.out.println(index2);


    }
}