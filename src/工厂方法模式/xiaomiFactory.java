package ��������ģʽ;

public class xiaomiFactory implements PhoneFactory{

	@Override
	public Phone makePhone() {
		// TODO Auto-generated method stub
		System.out.println("С����������");
		return null;
		
	}

	@Override
	public PC makePC() {
		// TODO Auto-generated method stub
		
		return new xiaomiPC();
	}

}
