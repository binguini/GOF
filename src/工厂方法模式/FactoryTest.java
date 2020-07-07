package 工厂方法模式;
/**
 * 工厂方法的优点/缺点： 

优点：
子类提供挂钩。基类为工厂方法提供缺省实现，子类可以重写新的实现，也可以继承父类的实现。-- 加一层间接性，增加了灵活性
屏蔽产品类。产品类的实现如何变化，调用者都不需要关心，只需关心产品的接口，只要接口保持不变，系统中的上层模块就不会发生变化。
典型的解耦框架。高层模块只需要知道产品的抽象类，其他的实现类都不需要关心，符合迪米特法则，符合依赖倒置原则，符合里氏替换原则。
多态性：客户代码可以做到与特定应用无关，适用于任何实体类。
 * @author 凌轩
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		PhoneFactory phoneFactory1 = new xiaomiFactory();
		PhoneFactory phoneFactory2 = new huaweiFactory();
		PhoneFactory pcFactory1 = new xiaomiFactory();
		PhoneFactory pcFactory2 = new huaweiFactory();
		phoneFactory1.makePhone();
		phoneFactory2.makePhone();
		pcFactory1.makePC();
		pcFactory2.makePC();
	}
}
