package 工厂方法模式;

public class xiaomiPC implements PC{
	public xiaomiPC(){
		this.make();
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("make xaiomiPC");
		
	}

}
