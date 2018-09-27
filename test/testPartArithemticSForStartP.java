import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testPartArithemticSForStartP { // ����Arithemitics�е�startProblem�ܷ������ȷ�ĺ�׺���ʽ
	
	@Test
	void testStartProblem() {
		
		String[][] test=new String[][] { // �洢�������ݣ�����ȷ��׺���ʽ
			{"-��+45+83+2515","( 15 + 25 ) - ( 3 + 8 ) �� ( 5 + 4 )"},
			{"��-23��415","15 �� 4 �� ( 3 - 2 )"},
			{"��4��+232","2 �� ( 3 + 2 ) �� 4"},
			{"+��432","2 + 3 �� 4"}
			/*
			{"-��+45+83+2515","( 15 + 25 ) - ( 3 + 8 ) �� ( 5 + 4 )"},
			{"��-23��415","15 �� 4 �� ( 3 - 2 )"},
			{"��4��+232","2 �� ( 3 + 2 ) �� 4"},
			{"+��432","2 + 3 �� 4"} //�ı���ȷ�������֤�ܷ񱻼�����
			*/
		};
		
		ArithemticS as=new ArithemticS();
		String s1="";
		
		for(int i=0;i<test.length;i++) {
			s1="";
			as.startProblem(test[i][1]);
			for(int j=0;j<as.postFixStack.size();j++) {
				s1=s1+as.postFixStack.get(j);
			}
			//System.out.println("��"+(i+1)+"�����ݣ�"+s1.equals(test[i][0])); // �жϺ�׺���ʽ����ȷ����Ƿ���ͬ			
			assertEquals(test[i][0], s1);// �жϺ�׺���ʽ����ȷ����Ƿ���ͬ			
		
		}
		
		
	}

}
