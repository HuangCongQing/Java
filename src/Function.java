//JAVA中只有值传递，没有引用传递，JAVA没有引用指针
//方法命名：
//1. 必须以字母、'_'或'＄'开头。
//2. 可以包括数字，但不能以它开头。

//修饰符 返回值类型 方法名(参数类型 参数名){
//    ...
//    方法体
//    ...
//    return 返回值;
//}
public class Function {
//	计算0-100分别奇数和偶数的和
	public static void Sum(){
		int oddSum = 0; //用来保存奇数的和
		int evenSum = 0;// 用来保存偶数的和
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				oddSum+=i;
			} else{
				evenSum +=i;
			}
		}
		System.out.println("奇数的和:"+oddSum);
		System.out.println("偶数的和:"+evenSum);
		
	}
	// 有返回值
		public static int add(int a, int b){
			int sum = a+b;
			return sum;  //return 两个作用，结束方法的运行，返回值
		}
// 注意，静态方法只能调用静态属性和静态方法
	public static void main(String[] arguments) {
	    Sum();
	    int s = add(3, 5);
		System.out.println(s);
	}
	
}
