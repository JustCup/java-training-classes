package by.gsu.epamlab;

public class BusinessTrip {
    private final static int DAILY_RATE = 950;
    private String account;
    private int expenses;
    private int daysNumber;

    public BusinessTrip() {
    }

    public BusinessTrip(String account, int expenses, int daysNumber) {
        this.account = account;
        this.expenses = expenses;
        this.daysNumber = daysNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public int getTotal() {
        return expenses + DAILY_RATE * daysNumber;
    }

    private static String convertBYN(int sum) {
        return String.format("%d.%02d", sum / 100, sum % 100);
    }

    public void show() {
        System.out.println("rate = " + convertBYN(DAILY_RATE) + "\naccount = " + account + "\nexpenses = " + convertBYN(expenses) + "\ndaysNumber = " + daysNumber + "\ntotal = " + convertBYN(getTotal()));
    }

    @Override
    public String toString() {
        return account + ";" + convertBYN(expenses) + ";" + daysNumber + ";" + convertBYN(getTotal());
    }
}
