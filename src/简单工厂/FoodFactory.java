package �򵥹���;

public class FoodFactory {
	public static Food getFood(String type) throws InstantiationException,
	IllegalAccessException, ClassNotFoundException {
        if(type.equalsIgnoreCase("mcchicken")) {
            return McChicken.class.newInstance();
        } else if(type.equalsIgnoreCase("chips")) {
            return Chips.class.newInstance();
        } else if(type.equalsIgnoreCase("eggs")){
        	return Eggs.class.newInstance();
        }else {
            System.out.println("��ѽ���Ҳ�����Ӧ��ʵ����������");
            return null;
        }
    }
}
