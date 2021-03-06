package com.jam.pattern.singleton;

/**
* @ClassName: SingleObject
* @Description: 单例设计模式
* @author Ken Yin
* @date 2016年5月19日 下午5:17:16
*
 */
public class SingleObject {

	//创建 SingleObject 的一个对象
	private static SingleObject instance = new SingleObject();

	//让构造函数为 private，这样该类就不会被实例化
	private SingleObject(){}

	//获取唯一可用的对象
	public static SingleObject getInstance(){
		return instance;
	}

	public void showMessage(){
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		//不合法的构造函数
		//编译时错误：构造函数 SingleObject() 是不可见的
		//SingleObject object = new SingleObject();

		//获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();

		//显示消息
		object.showMessage();
	}


}
