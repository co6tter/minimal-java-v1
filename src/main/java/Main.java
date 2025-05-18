public class Main {
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
    }
}