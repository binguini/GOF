package 工厂方法模式;

public class xiaomiPhone implements Phone{
	public xiaomiPhone(){
		this.make();
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("xiaomiPhone");
	}

}
