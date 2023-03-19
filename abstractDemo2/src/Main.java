public class Main {
    public static void main(String[] args) {
        CustomerDatabaseManager customerDatabaseManager = new CustomerDatabaseManager();
        customerDatabaseManager.baseDatabaseManager = new PostgreSqlDatabaseManager();
        customerDatabaseManager.getCustomers();

     }
}