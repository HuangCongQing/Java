package Varable;
// 实例变量
//实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息
//实例变量可以声明在使用前或者使用后；
//访问修饰符可以修饰实例变量；
//一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见
//实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。

public class Instance_variable{
	   // 这个实例变量对子类可见
	   public String name;
	   // 私有变量，仅在该类可见
	   private double salary;
	   //在构造器中对name赋值
	   public Instance_variable (String empName){
	      name = empName;
	   }
	   //设定salary的值
	   public void setSalary(double empSal){
	      salary = empSal;
	   }  
	   // 打印信息
	   public void printEmp(){
	      System.out.println("名字 : " + name );
	      System.out.println("薪水 : " + salary);
	   }
	 
	   public static void main(String args[]){
		   Instance_variable empOne = new Instance_variable("RUNOOB");
	      empOne.setSalary(1000);
	      empOne.printEmp();
	   }
	}