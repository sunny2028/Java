public class Bank {

    final static String bank_name = "Your Own Bank";
    private static int count = 0;
    private String name;
    private String address;
    private double balance;
    
    Bank() {

        count++;
    }

    Bank(String n, String add, double bal) {

        name = n;
        address = add;
        balance = bal;
        count++;
    }

    void setInfo(String name, String address, double balance) {

//        System.out.println("here");
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    void withdraw(double amt) {

        if(balance >= amt) {

            balance -= amt;
            System.out.println("Successfully Withdrawn Rs." + amt);
        }else
            System.out.println("Insufficient Balance");
    }

    void deposit(int amt) {

        balance += amt;
    }

    void getInfo() {

        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("balance : " + balance);
    }

    static void getBankName() {

        System.out.println("Bank Name : " + bank_name + "\n");
    }

    static void getTotal() {

        System.out.println("Total Depositors : " + count + "\n");
    }

    void exchangeAddress(Bank a) {

        String temp = a.address;
        a.address = this.address;
        this.address = temp;
    }

    static double avgBalance(Bank[] arr) {

        int len = arr.length;
        int i;
        double sum = 0;

        for(Bank cust : arr) {

            sum += cust.balance;
        }
        
        return sum  / len;
    }



    public static void main(String[] args) {

        getBankName();

        Bank[] arr = new Bank[5];

        for(int i = 0; i < 5; i++) {

            arr[i] = new Bank();
        }

        (arr[0]).setInfo("Ayush", "Chitkara University", 200000);
        arr[1].setInfo("Guneet", "Tapa", 200000);
        arr[2].setInfo("Ayushi", "karnal", 300000);
        arr[3].setInfo("Gitesh", "Jhajjar", 100000);
        arr[4].setInfo("Peeyush", "bathinda", 200000);

//        System.out.println("Here");

        getTotal();

        int i;
        for(i = 0; i < 5; i++) {
            arr[i].getInfo();
            System.out.println();
        }

        arr[0].exchangeAddress(arr[4]);

        for(i = 0; i < 5; i++) {
            arr[i].getInfo();
            System.out.println();
        }

        Bank cust = new Bank("New Customer", "Naya Desh", 200);
        cust.withdraw(20000);
        cust.deposit(50000);
        cust.getInfo();

        System.out.println("Average Balance of each Customer of array in our bank is " + avgBalance(arr));

        getTotal();

    }
}
