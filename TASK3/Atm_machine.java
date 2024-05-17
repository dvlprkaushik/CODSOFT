package TASK3;

class Account {
    private int accountNumber;
    private int atmPin;
    private double availableBalance;
    private double totalBalance;

    public void account(int accNum, int pin, double availBal, double totBal) {
        this.accountNumber = accNum;
        this.atmPin = pin;
        this.availableBalance = availBal;
        this.totalBalance = totBal;
    }

    public double getBal(double bal){
        bal = availableBalance;
        return bal;
    }

    public double withDraw(double wdMoney){
        wdMoney = availableBalance - wdMoney;
        return wdMoney;
    }

    public double depositMoney(double deposit){
        deposit += availableBalance;
        return deposit;
    }
}

class Transaction extends Account{
    
}

class UserInterface extends Transaction{

}

class bankDB extends UserInterface{

}

public class Atm_machine {
    public static void main(String[] args) {

    }
}
