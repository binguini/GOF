package 工厂方法模式;

public class xiaomiFactory implements PhoneFactory{

	@Override
	public Phone makePhone() {
		// TODO Auto-generated method stub
		System.out.println("小米生产工厂");
		return null;
		
	}

	@Override
	public PC makePC() {
		// TODO Auto-generated method stub
		
		return new xiaomiPC();
	}

}
