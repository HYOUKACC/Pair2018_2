import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class testGrade1 {
	// ����һ�꼶�Ƿ�ͨ��Ҫ��

	@Test // �����Ƿ�����������һ��һ�꼶�ӷ�����ʽ��
	void testAddOperation() { 
		ArrayList<String> answerSet= new ArrayList<>();
		AddOperation add=new AddOperation(answerSet, 3);
		System.out.print("һ�꼶�ӷ���");
		System.out.println(answerSet);
	}
	
	@Test // �����ܷ���������һ��һ�꼶��������ʽ��
	void testSubtraction() { 
		ArrayList<String> answerSet= new ArrayList<>();
		Subtraction sub=new Subtraction(answerSet, 6);
		System.out.print("һ�꼶������");
		System.out.println(answerSet);
	}

}
