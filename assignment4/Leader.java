/*
 * ����ģʽ�������ص㣺
����1��������ֻ����һ��ʵ����
����2������������Լ������Լ���Ψһʵ����
����3�������������������������ṩ��һʵ����
 */
package assignment4;

public class Leader {
	private static Leader instance = new Leader();	//���� Leader ��һ������
	
	private Leader() {}	//���캯��Ϊ private����������Ͳ��ᱻʵ����
	
	public static Leader getInstance(){
	      return instance;
	}
	
	public static void main(String args[]) {
		Leader object1 = Leader.getInstance();	//����2��Leader����
		Leader object2 = Leader.getInstance();
		
		System.out.println(object1==object2);	//�����жϣ�2��Leader���
	}
}
