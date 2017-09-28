// 对象和类
public class ObjectClass {
// Java中的类
	//  一个类可以包含以下类型变量
	//  局部变量： 方法、构造方法或者语句块中定义的变量被称为局部变量
	//  成员变量：成员变量是定义在类中，方法体之外的变量
	//  类变量： 类变量也声明在类中，方法体之外，但必须声明为   static   类型。
	String breed;
    int age;
    String color;
    void barking(){
 	   System.out.println("Barking");
    };
    void hungry(){
    };
   
    void sleeping(){
    };

	
	
// 构造方法
    public ObjectClass(){
    }
 
    public ObjectClass(String name){
        // 这个构造器仅有一个参数：name
    }
	
	
	public static void main(String []args) {
		 System.out.println("所有的Java 程序由public static void main(String []args)方法开始执行");
	    }

}
