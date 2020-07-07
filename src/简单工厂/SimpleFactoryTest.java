package 简单工厂;
/**
 * 简单工厂的优点/缺点： 
优点：简单工厂模式能够根据外界给定的信息，决定究竟应该创建哪个具体类的对象。明确区分了各自的职责和权力，有利于整个软件体系结构的优化。
缺点：很明显工厂类集中了所有实例的创建逻辑，容易违反GRASPR的高内聚的责任分配原则
 * @author 凌轩
 *
 */
public class SimpleFactoryTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
        //实例化各种食物
        Food mcChicken = FoodFactory.getFood("McChicken");
        Food chips = FoodFactory.getFood("Chips");
        Food eggs = FoodFactory.getFood("Eggs");
        Food fish = FoodFactory.getFood("Fish");
        Food rice = FoodFactory.getFood("Rice");
        //获取食物
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
