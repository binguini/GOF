package �򵥹���;
/**
 * �򵥹������ŵ�/ȱ�㣺 
�ŵ㣺�򵥹���ģʽ�ܹ���������������Ϣ����������Ӧ�ô����ĸ�������Ķ�����ȷ�����˸��Ե�ְ���Ȩ�������������������ϵ�ṹ���Ż���
ȱ�㣺�����Թ����༯��������ʵ���Ĵ����߼�������Υ��GRASPR�ĸ��ھ۵����η���ԭ��
 * @author ����
 *
 */
public class SimpleFactoryTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
        //ʵ��������ʳ��
        Food mcChicken = FoodFactory.getFood("McChicken");
        Food chips = FoodFactory.getFood("Chips");
        Food eggs = FoodFactory.getFood("Eggs");
        Food fish = FoodFactory.getFood("Fish");
        Food rice = FoodFactory.getFood("Rice");
        //��ȡʳ��
        if(mcChicken!=null){
            mcChicken.get();
        }
        if(chips!=null){
            chips.get();
        }
        if(eggs!=null){
            eggs.get();
        }
        if(fish!=null){
        	fish.get();
        	
        }
        if(rice!=null){
        	rice.get();
        	
        }
    }
}
