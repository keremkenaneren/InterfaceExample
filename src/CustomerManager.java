public class CustomerManager {
    private IDataBase dataBase;

    public CustomerManager(IDataBase dataBasa) {
        this.dataBase = dataBasa;
    }
    public void add(){
        dataBase.add();
    }
}
