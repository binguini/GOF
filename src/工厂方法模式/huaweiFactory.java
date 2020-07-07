package 工厂方法模式;

public class huaweiFactory implements PhoneFactory{

	@Override
	public Phone makePhone() {
		// TODO Auto-generated method stub
		System.out.println("华为生产工厂");
		return null;
		
	}

	@Override
	public PC makePC() {
		// TODO Auto-generated method stub
		System.out.println("make huaweiPC");
		return null;
	}

}
