package com.igeekhome.tankwar.j2se11_27;

/**
 * �����淶:����ĸ��_ ��ĸ  $
 * 		 ������ĸ: ��ĸ�����֡�_
 * 		�����ǹؼ���
 * 	�淶:
 * 		����������
 * 		����������:userSex  customerHabit
 * @author student
 *
 */
public class Demo01 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i=1;
		double d=1.23;
		char ch='A';
		//����
		String name="jikeying";
		boolean b=true;
		
		{
			int j=1;			
		}
		//�޷�����
		//System.out.println("j="+j);
		
		System.out.println("------------");
		System.out.println("i="+i);
		System.out.println("d="+d);
		System.out.println("ch="+ch);
		System.out.println("name="+name);
		System.out.println("b="+b);
		System.out.println("------------");
		
		//�Զ�����ת��
		d=i;
		System.out.println("d="+d);
		//ǿ������ת��,���ܶ�ʧ����
		i=(int)d;
		System.out.println("i="+i);
		
		//byte->short->int->long->float->double
		float f=1.23f;
		double dd=f;
		//char<->int
		int ii='A';
		char cch=95;
		
		System.out.println("dd="+dd);
		System.out.println("ii="+ii);
		System.out.println("cch="+cch);
		
	}

}
