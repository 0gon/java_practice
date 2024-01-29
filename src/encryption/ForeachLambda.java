package encryption;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambda {
	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1,6,16,22,23,33);
		//#1
		mmlists.forEach(m->{System.out.print(m+"\t");});
		System.out.println();
		//#2 ������� �ٸ� ���
		Consumer<Integer> consume = (Integer m)->{System.out.print(m+"\t");};
		mmlists.forEach(consume);
		
	}
}
