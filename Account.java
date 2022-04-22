public class Account {
    private int id;
    private double balance;
    public Account (){
    id = 0;
    balance = 0.0;
    }
    
    public Account(int inpId, double inpBalance){
        id = inpId;
        balance = inpBalance;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public void setId (int inpId){
            if (inpId > 0)
        id = inpId;
    }
    public void setBalance (double inpBalance){
        balance = inpBalance;
    }
    
    public static void main (String[] args){
        Account inp = new Account();
        Account inp1 = new Account (567, 2000);
        System.out.println(inp1.getBalance());
    }
}
