package onlyOne;

public class CheckingAccount {
	private int transferLimit = 100;
	public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException{
		//��ü �ѵ� üũ
		if(amount.greaterThan(this.transferLimit)) {
			throw new BusinessException("�ѵ��ʰ�");
		}
		// ���¹�ȣ üũ
		/*
		int sum=0;
		for (int i = 0 ; i< counterAccount.length();i++) {
			sum = sum + (9-i)*Character.getNumericValue(counterAccount.charAt(i));
		}
		�޼���ȭ ��Ű��
		*/ 
		if(isValid(counterAccount)) {  
			CheckingAccount acct = CheckingAccount.findAcctByNumber(counterAccount);
			Transfer result = new Transfer(this, acct, amount);
			return result;
		}else {
			throw new BusinessException("�߸��� ����");
		}
	}
	
	public static boolean isValid(String counterAccount) {
		int sum=0;
		for (int i = 0 ; i< counterAccount.length();i++) {
			sum = sum + (9-i)*Character.getNumericValue(counterAccount.charAt(i));
		}
		return sum % 11 == 0;
	}
	
	private static CheckingAccount findAcctByNumber(String counterAccount) {
		// TODO Auto-generated method stub
		return null;
	}
}
class Transfer{

	public Transfer(CheckingAccount checkingAccount, CheckingAccount acct, Money amount) {
		// TODO Auto-generated constructor stub
	}
}
class Money{
	public boolean greaterThan(int value) {
		return true;
	}
}

