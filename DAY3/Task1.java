package programs;
class CnrbAcc{
	private String Accholder;
	private int Balance;
	CnrbAcc(String Accholder , int Balance){
		this.Accholder=Accholder;
		this.Balance=Balance;
	}
	public String getAccholder() {
		return Accholder;
	}
	public int getBalance() {
		return Balance;
	}
	public void Deposit(int dep) {
		if(Balance > 0) {
			Balance +=dep;
			System.out.println("Deposite Amount:" +dep);
			System.out.println("Current Balance:" +Balance);
		}
		
	}
		public void setAccholder(String Accholder) {
			this.Accholder=Accholder;
	}
		public void setWithdrawn(int Withdrawn) {
			Balance -=Withdrawn;
			System.out.println("Withdrwawn:"+Withdrawn);
		}
}
public class BankDetails {
	public static void main(String[] args) {
		CnrbAcc a=new CnrbAcc("Ganga",35000);
		System.out.println("Account holder Name:"+a.getAccholder());
		a.setAccholder("Jumana");
		System.out.println("Update account holder:"+a.getAccholder());
		System.out.println("Balance:"+a.getBalance());
		a.Deposit(4500);
		a.setWithdrawn(3000);
		System.out.println("Available Balance:"+a.getBalance());
	}

}
