package JAVA8.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        // Traditional way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    System.out.println("Tradition:" + i);
            }
        };

        new Thread(runnable).start();


        // lambda expression
        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++)
                System.out.println("lambda:" + i);
        };
        new Thread(runnable1).start();

        // implement thread using lambda
        new Thread(() -> {
            for (int i = 0; i < 10; i++)
                System.out.println("lambda thread:" + i);
        }).start();
    }
}
