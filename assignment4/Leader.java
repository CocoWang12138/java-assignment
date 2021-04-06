/*
 * 单例模式有以下特点：
　　1、单例类只能有一个实例。
　　2、单例类必须自己创建自己的唯一实例。
　　3、单例类必须给所有其他对象提供这一实例。
 */
package assignment4;

public class Leader {
	private static Leader instance = new Leader();	//创建 Leader 的一个对象
	
	private Leader() {}	//构造函数为 private，这样该类就不会被实例化
	
	public static Leader getInstance(){
	      return instance;
	}
	
	public static void main(String args[]) {
		Leader object1 = Leader.getInstance();	//创建2个Leader对象
		Leader object2 = Leader.getInstance();
		
		System.out.println(object1==object2);	//经过判断，2个Leader相等
	}
}
