public class Main {
    public static void main(String[] args) {
        CustomerManager dataBase = new CustomerManager(new OracleDataBase());
        dataBase.add();


    }
}