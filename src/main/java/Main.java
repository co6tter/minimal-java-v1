public class Main {
    private static int triple(int num) {
        return num * 3;
    }

    private static int sum (int a, int b) {
        return a + b;
    }

    private static void showSum(int a, int b) {
        System.out.println(a + b);
    }

    private static boolean isDivisible(int a, int b) {
        return b != 0 && a % b == 0;
    }

    private static <T> void showThreeTimes(T n) {
        System.out.println(n);
        System.out.println(n);
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println(1_000_000); // 1000000
        System.out.println(1.2e3); // 1200.0
        System.out.println(1.2e-3); // 0.0012

        final double RATE = 1.1;
        int price = 1000;
        System.out.println(price * RATE);

        String firstName = "foo";
        String lastName = "bar";
        System.out.println(String.format("I am %s %s.", firstName, lastName));

        int[] scores = {70, 90, 80, 60};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int score: scores) {
            if (score >= 80) {
                break;
            }
            System.out.println(score);
        }

        double money = 500.0;
        while (money < 1000.0) {
            money *= 1.1;
            System.out.println(money);
        }

        System.out.println(triple(10));
        System.out.println(sum(3, 7));
        showSum(3, 7);
        System.out.println(isDivisible(10, 2));
        System.out.println(isDivisible(10, 3));
        System.out.println(isDivisible(10, 0));
        showThreeTimes(3);
        showThreeTimes(5.2);
    }
}
