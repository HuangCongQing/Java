//非访问修饰符
//
//	为了实现一些其他的功能，Java 也提供了许多非访问修饰符。
//	static 修饰符，用来修饰类方法和类变量。
//	final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
//	abstract 修饰符，用来创建抽象类和抽象方法。
//	synchronized 和 volatile 修饰符，主要用于线程的编程。


//static 修饰符
	// 静态变量也被称为类变量。局部变量不能被声明为 static 变量。


public class Non_access_modifier {
	
	
	
	   private static int numInstances = 0;  // 用来创建类方法和类变量
	   protected static int getCount() {   // 类方法
	      return numInstances;
	   }
	 
	   private static void addInstance() {
	      numInstances++;
	   }
	 
	   Non_access_modifier() {
		   Non_access_modifier.addInstance();
	   }
	 
	   
	   
	   
//	   主函数
	   public static void main(String[] arguments) {
	      System.out.println("起始 " +
	    		  Non_access_modifier.getCount() + " instances");
	      for (int i = 0; i < 500; ++i){
	         new Non_access_modifier();
	          }
	      System.out.println("循环之后Created " +
	    		  Non_access_modifier.getCount() + " instances");
	      System.out.println(Non_access_modifier.numInstances);
	   }
	   
	   
	   
	   
	   
	   
	}