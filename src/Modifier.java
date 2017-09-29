// 修饰符
//访问修饰符
//非访问修饰符

//修饰符用来定义类、方法或者变量，通常放在语句的最前端。

//访问修饰符
//	default： (即缺省，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
//	private： 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
//	public：对所有类可见。使用对象：类、接口、变量、方法
//	protected：对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。




public class Modifier {
//1，default默认访问修饰符-不使用任何关键字
    //使用默认访问修饰符声明的变量和方法，对同一个包内的类是可见的。
	//接口里的变量都隐式声明为 public static final,而接口里的方法默认情况下访问权限为 public。
	String version = "1.5.1";
	boolean processOrder() {
	   return true;
	}
	
// 私有访问修饰符-private
//	是最严格的访问级别,所以被声明为 private 的方法、变量和构造方法只能被所属类访问
//	声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问
//	Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。
	   private String format; // 私有
//类中的 format 变量为私有变量，所以其他类不能直接得到和设置该变量的值
//为了使其他类能够操作该变量，定义了两个 public 方法：
	   public String getFormat() {
	      return this.format;
	   }
	   public void setFormat(String format) {
	      this.format = format;
	   }
	
//	   公有访问修饰符-public
//	         如果几个相互访问的 public 类分布在不同的包中，则需要导入相应 public 类所在的包。
//	         由于类的继承性，类所有的公有方法和变量都能被其子类继承。
//	共有
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
//	受保护的访问修饰符-protected
	//	protected 的变量、方法和构造器能被同一个包中的任何其他类访问，也能够被不同包中的子类访问。
		
	//	下面的父类使用了 protected 访问修饰符，子类重写了父类的 openSpeaker() 方法。
	//	class AudioPlayer {
	//	   protected boolean openSpeaker(Speaker sp) {
	//	      // 实现细节
	//	   }
	//	}
	//	 
	//	class StreamingAudioPlayer extends AudioPlayer {
	//	   protected boolean openSpeaker(Speaker sp) {
	//	      // 实现细节
	//	   }
	//	}
		
	
//	如果把 openSpeaker() 方法声明为 private，那么除了 AudioPlayer 之外的类将不能访问该方法。
//	如果把 openSpeaker() 声明为 public，那么所有的类都能够访问该方法。
//	如果我们只想让该方法对其所在类的子类可见，则将该方法声明为 protected。
	
	
//	
//	访问控制和继承
	//	请注意以下方法继承的规则：
	//	父类中声明为 public 的方法在子类中也必须为 public。
	//	父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
	//	父类中声明为 private 的方法，不能够被继承。

}
