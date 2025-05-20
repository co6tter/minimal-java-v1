class User {
    String name;
    private int score;
    private static int count = 0;

    User(String name, int score) {
        this.name = name;
        this.score = score;
        User.count++;
    }

    static int getUserCount() {
        return User.count;
    }

    String getUserString() {
        // thisは省略しても意味が通じる場合は省略できる
        // return name + ", " + score;
        return this.name + ", " + this.score + ", " + getResult();
    }

    void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score!");
            return;
        }
        this.score = score;
    }

    int getScore() {
        return this.score;
    }

    private String getResult() {
        if (this.score >= 80) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

interface Loggable {
    void log();
}

abstract class Score implements Loggable {
    private String subject;
    protected int score;

    Score(String subject, int score) {
        this.subject = subject;
        this.score = score;
        this.log();
    }

    protected abstract String getResult();

    String getScoreString() {
        return this.subject + ", " + this.score + ", " + this.getResult();
    }

    @Override
    public void log() {
        System.out.println("Instance created: " + this.subject);
    }
}

class MathScore extends Score {
    MathScore(int score) {
        super("Math", score);
    }

    @Override
    protected String getResult() {
        return this.score >= 50 ? "Pass" : "Fail";
    }
}

class EnglishScore extends Score {
    EnglishScore(int score) {
        super("English", score);
    }

    @Override
    protected String getResult() {
        return this.score >= 70 ? "Pass" : "Fail";
    }
}

class User2 implements Loggable {
    private String name;
    private Score score;

    User2(String name, Score score) {
        this.name = name;
        this.score = score;
        this.log();
    }

    String getUserString() {
        return this.name + ", " + this.score.getScoreString();
    }

       @Override
    public void log() {
        System.out.println("Instance created: " + this.name);
    }
}

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

        User user1 = new User("Taro", 70);
        User user2 = new User("Jiro", 80);

        System.out.println(User.getUserCount());

        user1.setScore(900);
        System.out.println(user1.getScore());

        System.out.println(user1.getUserString());
        System.out.println(user2.getUserString());

        // User2 user2a = new User2("Taro", new Score("Math", 70));
        // User2 user2b = new User2("Jiro", new Score("English", 80));

        // System.out.println(user2a.getUserString());
        // System.out.println(user2b.getUserString());

        User2 user2c = new User2("Saburo", new MathScore(70));
        User2 user2d = new User2("Shiro", new EnglishScore(80));

        System.out.println(user2c.getUserString());
        System.out.println(user2d.getUserString());
    }
}
