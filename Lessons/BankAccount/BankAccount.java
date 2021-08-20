public class BankAccount {
    public static void main(String[] args) {
        System.out.println(total);
        deposit(90l);
        System.out.println(total);
    }
    public static long total = 0;

    static void deposit(long cents) {
        total += cents;
    }
    static void withdraw(long cents) {
        total -= cents;
    }
    static long balance() {
        return total;
    }
    static boolean isOverDrawn() {
        if (total < 0) {
            return true;
        } else {
            return false;
        }
    }
}