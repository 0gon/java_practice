package chapter4_onlyOne;

public class SavingAccount {
	
	CheckingAccount registerCounterAccount;
	
	public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException{
		
		if(isValid(counterAccount)) {  
			SavingAccount acct = SavingAccount.findAcctByNumber(counterAccount);
			Transfer result = new Transfer(this, acct, amount);
			if(result.equals("something")) {
				return result;
			}else {
				throw new BusinessException("상대편 계좌가 등록되지 않음");
			}
		}else {
			throw new BusinessException("잘못된 계좌");
		}
	}
	
	public static boolean isValid(String counterAccount) {
		int sum=0;
		for (int i = 0 ; i< counterAccount.length();i++) {
			sum = sum + (9-i)*Character.getNumericValue(counterAccount.charAt(i));
		}
		return sum % 11 == 0;
	}
	
	private static SavingAccount findAcctByNumber(String counterAccount) {
		// TODO Auto-generated method stub
		return null;
	}
}
class Transfer{

	public Transfer(SavingAccount checkingAccount, SavingAccount acct, Money amount) {
		// TODO Auto-generated constructor stub
	}
}
class Money{
	public boolean greaterThan(int value) {
		return true;
	}
}

