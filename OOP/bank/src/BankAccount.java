public class BankAccount {
    private String id, customerId, username, password;

    public BankAccount(String id, String customerId, String username, String password) {
        this.id = id;
        this.customerId = customerId;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
