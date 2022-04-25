package Bank;

import AimsProject.DigitalVideoDisc;

public class ManageAccount {
	public static final int MAX_NUMBERS_ACCOUNT = 1000;
	private Account arrAccount[] = new Account[MAX_NUMBERS_ACCOUNT];
	public int qtyAccount = 0;
	
	
	public void addAccount(Account account) {
		if(qtyAccount == MAX_NUMBERS_ACCOUNT) {
			System.out.println("False!");
		}else {
			arrAccount[qtyAccount] = account ;
			System.out.println("Them thanh cong!");
			qtyAccount++;
		}
		printAccount();
	}
	public void removeAccount(Account account) {
		//Xoa muc khoi danh sach
		for (int i = 0; i < qtyAccount; i++) {
			if(arrAccount[i] == account) {
				for (int j = i; j < qtyAccount; j++)
					arrAccount[j] = arrAccount[j+1];
			    System.out.println("Xoa thanh cong!");
			    qtyAccount--;
			}
		}
		printAccount();
	}
	public int plusMoney(Account account, int money) {
		account.setMoney(account.getMoney() + money);
		return account.getMoney();
	}
	public boolean minusMoney(Account account, int money) {
		if(account.getMoney() < money) {
			return false;
		}else {
			account.setMoney(account.getMoney() - money);
			return true;
		}	
	}
	public void printAccount() {
		for (int i = 0; i < qtyAccount; i++) {
			System.out.println(arrAccount[i].getName() + "\t" + arrAccount[i].getMoney());
		}
	}
}
