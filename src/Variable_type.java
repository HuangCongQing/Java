//类变量：独立于方法之外的变量，用 static 修饰。
//实例变量：独立于方法之外的变量，不过没有 static 修饰。
//局部变量：类的方法中的变量。



public class Variable_type {
	static int allClicks=0;    // 类变量
	 
    String str="hello world";  // 实例变量
 
    public void method(){
 
        int i =0;  // 局部变量
    }
//  Java 局部变量
//  局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
     }
     
     public static void main(String args[]){
    	 Variable_type test = new Variable_type();
        test.pupAge();
  
  
//  实例变量
//  类变量（静态变量）
}
