package Socket_Application;
//URL常用方法

import java.net.MalformedURLException;
import java.net.URL;

public class url {

	public static void main(String[] args) {
		
		try {
			// 创建一个URL实例
			URL imooc = new URL("http://www.imooc.com");
			// ?后面表示参数，#后面表示锚点
			URL url = new URL(imooc, "/index.html?username=重庆#test");
			System.out.println("协议：" + url.getProtocol());
			System.out.println("主机：" + url.getHost());
			// 如果未指定端口号，则默认端口号，此时getPort()返回值为-1
			System.out.println("端口：" + url.getPort());
			System.out.println("文件路径：" + url.getPath());
			System.out.println("文件名：" + url.getFile());
			System.out.println("相对路径（即锚点）：" + url.getRef());
			System.out.println("查询字符串：" + url.getQuery());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
