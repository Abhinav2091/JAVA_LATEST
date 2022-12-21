package JAVA8.lambda.realexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        AccountFactory accountFactory = BankAccount::new;
        BankAccount bankAccount1 = accountFactory.getBankDetails(1, 50000, "StudentAccount");
        BankAccount bankAccount2 = accountFactory.getBankDetails(2, 1000000, "CollegeAccount");

        BiPredicate<Double, Double> biPredicate = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> biConsumer = (x, y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> biConsumer2 = (student, college) -> System.out.println("Student account balance:" + bankAccount1.getBalance() + ": college account balance:" + bankAccount2.getBalance());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "says :: Executing Transfer");
            try {
                double amount = 1000;
                if (!biPredicate.test(bankAccount1.getBalance(), amount)) {
                    biConsumer.accept(Thread.currentThread().getName() + " says balance insufficient", amount);
                    return;
                }
                while (!bankAccount1.transferMoney(bankAccount2, amount)) {
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            biConsumer.accept(Thread.currentThread().getName() + " transfer is successful:", bankAccount2.getBalance());
        });

        for (int i = 0; i < 20; i++) {
            executorService.submit(thread1);
        }
        executorService.shutdown();

        try {
            while (!executorService.awaitTermination(244L, TimeUnit.HOURS)) {
                System.out.println("Not yet. Still waiting for termination");
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        biConsumer2.accept(bankAccount1, bankAccount2);
    }
}
