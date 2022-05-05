package Methods;

public class AverageMethod {
    public static void main(String[] args) {
        AverageMethod avg = new AverageMethod();
        avg.sum(3, 4, 5);
        System.out.println(avg.average(3, 4, 5));
    }

    public int sum(int first, int second, int third) {
        return first + second + third;
    }

    public double average(int first, int second, int third) {
        int sum = sum(first, second, third);
        return (1.0 * sum) / 3;
    }
}
