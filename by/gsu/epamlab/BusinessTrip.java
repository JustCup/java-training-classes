package by.gsu.epamlab;

public class BusinessTrip {
    private static final int RATE = 200;
    private String account;
    private int transport;
    private int days;

    public BusinessTrip() {
    }

    public BusinessTrip(String account, int transport, int days) {
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotal() {
        return transport + RATE * days;
    }

    private static String convertBYN(int sum) {
        return String.format("%d.%02d", sum / 100, sum % 100);
    }

    public void show() {
        System.out.printf("rate = %s\n" +
                "account = %s\n" +
                "transport = %s\n" +
                "days = %d\n" +
                "total = %s\n",
                convertBYN(RATE),
                account,
                convertBYN(transport),
                days,
                convertBYN(getTotal())
        );
    }

    public String toString() {
        return String.format("%s;%s;%d;%s", account, convertBYN(transport), days, convertBYN(getTotal()));
    }
}
