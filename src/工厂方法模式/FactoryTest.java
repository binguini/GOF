package ��������ģʽ;
/**
 * �����������ŵ�/ȱ�㣺 

�ŵ㣺
�����ṩ�ҹ�������Ϊ���������ṩȱʡʵ�֣����������д�µ�ʵ�֣�Ҳ���Լ̳и����ʵ�֡�-- ��һ�����ԣ������������
���β�Ʒ�ࡣ��Ʒ���ʵ����α仯�������߶�����Ҫ���ģ�ֻ����Ĳ�Ʒ�Ľӿڣ�ֻҪ�ӿڱ��ֲ��䣬ϵͳ�е��ϲ�ģ��Ͳ��ᷢ���仯��
���͵Ľ����ܡ��߲�ģ��ֻ��Ҫ֪����Ʒ�ĳ����࣬������ʵ���඼����Ҫ���ģ����ϵ����ط��򣬷�����������ԭ�򣬷��������滻ԭ��
��̬�ԣ��ͻ���������������ض�Ӧ���޹أ��������κ�ʵ���ࡣ
 * @author ����
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
