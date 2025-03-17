public class Account {
     private String ID, customerID, STK,PIN;
     private int  soDu;

    public Account(String ID, String customerID, String STK, String PIN, int soDu) {
        this.ID = ID;
        this.customerID = customerID;
        this.STK = STK;
        this.PIN = PIN;
        this.soDu = soDu;
    }

    public String getSTK() {
        return STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID='" + ID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", STK='" + STK + '\'' +
                ", PIN='" + PIN + '\'' +
                ", soDu=" + soDu +
                '}';
    }
}


