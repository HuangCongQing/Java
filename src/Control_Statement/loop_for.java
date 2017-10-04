
package Control_Statement;
//while( 布尔表达式 ) {
//	  //循环内容
//	}
public class loop_for {
	 public static void main(String args[]) {
//		 
//	      for(int x = 10; x < 20; x = x+1) {
//	         System.out.print("value of x : " + x );
//	         System.out.print("\n");
//	      }
		 
		 
//		 Java 增强 for 循环		 
		//		 for(声明语句 : 表达式)
		//		 {
		//		    //代码句子
		//		 }
		 int [] numbers = {10, 20, 30, 40, 50};
		 
	      for(int x : numbers ){
	         System.out.print( x );
	         System.out.print(",");
	      }
	      
	   }
}
