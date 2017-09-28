// 基本数据类型
 // 内置数据类型
 // 引用数据类型
public class Base_data_type {

	public static void main(String[] args) {
// 内置数据类型
		// 八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
		// byte 主要代替整数
		byte a = 100;
		// short
		// int
		// long
		// float
		// double
				
		// boolean:默认false
		boolean one = true;
		// char
		char letter = 'A';
		
//		因为它们的值都已经以常量的形式定义在对应的包装类中了。请看下面的例子：
		 // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);
		
// 引用类型
//        对象、数组都是引用数据类型。
//        所有引用类型的默认值都是null。
//        例子：Site site = new Site("Runoob")
//        引用类型的变量非常类似于C/C++的指针。引用类型指向一个对象，指向对象的变量是引用变量。
//        这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等
        
// Java常量：使用 final 关键字来修饰常量，声明方式和变量类似
        final double PI = 3.1415927;
        
// 自动类型转换(byte,short,char—> int —> long—> float —> double )
//        不能对boolean类型进行类型转换。
        
//        浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入
        System.out.println((int)23.7 == 23  ); 
//        (int)-45.89f == -45;
//        
//        char c1='a';//定义一个char类型
//        int i1 = c1;//char自动类型转换为int
//        System.out.println("char自动类型转换为int后的值等于"+i1);
//        char c2 = 'A';//定义一个char类型
//        int i2 = c2+1;//char 类型和 int 类型计算
//        System.out.println("char类型和int计算后的值等于"+i2);
        
//        强制类型转换      格式：(type)value type
        byte b = (byte)123;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值equals:"+b);
        
        
        
//        隐含强制类型转换
//        1. 整数的默认类型是 int。
//        2. 浮点型不存在这种情况，因为在定义 float 类型时必须在数字后面跟上 F 或者 f。
        
        
        
//        Java 里使用 long 类型的数据一定要在数值后面加上 L，否则将作为整型解析：
//        long g = (long)9223372036854775807;
        long g = (long)9223372036854775807L;
        
        
        
/*  错误的例子：
        MyDate today;
        today.day = 4; // 发生错误，因为today对象的数据空间未分配。
        引用类型变量在声明后必须通过实例化开辟数据空间，才能对变量所指向的对象进行访问。
        MyDate today;          //将变量分配一个保存引用的空间
        today = new MyDate();     // 这句话是2步，首先执行new MyDate（），给today变量开辟数据空间，然后再执行赋值操作
        引用变量赋值：
        MyDate a，b;       // 在内存开辟两个引用空间
        a = new MyDate();       // 开辟MyDate对象的数据空间，并把该空间的首地址赋给a
        b = a;                   // 将a存储空间中的地址写到b的存储空间中
*/        
	}

}
