package OOPS.Encapsulation;


public class UserBankAccount {
    static class BankAccount {
        String name;
        private int password;
        private int balance;

        public void setPass(int password) {
            this.password = password;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public int getPass() {
            return password;
        }

        public int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.name = "Rohan";
        acc1.setPass(1234);
        acc1.setBalance(1000);

        BankAccount acc2 = new BankAccount();
        acc2.name = "Rahul";
        acc2.setPass(0);
        acc2.setBalance(2000);

        BankAccount acc3 = new BankAccount();
        acc3.name = "Mohan";
        acc3.setPass(1111);
        acc3.setBalance(3000);

        BankAccount[] details = new BankAccount[3];
        details[0] = acc1;
        details[1] = acc2;
        details[2] = acc3;

        for (int i = 0; i < 3; i++) {
            System.out.println(details[i].name + " " + details[i].getPass() + " " + details[i].getBalance());
        }
    }
}