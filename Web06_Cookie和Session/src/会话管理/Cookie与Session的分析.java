package 会话管理;

/*				会话
 
 	1.什么是会话？
		会话可简单理解为：用户开一个浏览器，中间xxx，然后关闭浏览器，整个过程称之为一个会话。
 
 	2.会话过程中要解决的一些问题？
		1.问题： 每个用户在使用浏览器与服务器进行会话的过程中，不可避免各自会产生一些数据，程序要想办法为每个用户保存这些数据。
		
		2.例如：用户点击超链接通过一个servlet购买了一个商品，程序应该想办法保存用户购买的商品，以便于用户点结帐servlet时，结帐servlet可以得到
	           用户购买的商品为用户结帐。
	    
		3.思考：用户购买的商品保存在request或servletContext中行不行？

	3.保存会话数据的两种技术：
		1.Cookie：	（对服务器来说，让浏览器持久保存数据 的容器）
			Cookie是客户端技术，程序把每个用户的数据以cookie的形式写给用户各自的浏览器。当用户使用浏览器再去访问服务器中的web资源时，就会带
		  着各自的数据去。这样，web资源处理的就是用户各自的数据了。
		
		2.Session：	（对服务器来说，在浏览器在访问服务器时保存数据的 容器）	
			Session是服务器端技术，利用这个技术，服务器在运行时可以为每一个用户的浏览器创建一个其独享的session对象，由于session为用户浏览器
		  独享，所以用户在访问服务器的web资源时，可以把各自的数据放在各自的session中，当用户再去访问服务器中的其它web资源时，其它web资源再从用户
		  各自的session中取出数据为用户服务。
		  
		  Session 依赖于Cookie;
		  Cookie 	类似一个JavaBean，name，value 为两个字段，都为String。
		  Session	类似于request域，可用setAttribute()存入键值对数据; 键为String,值为Object。
	
*/

public class Cookie与Session的分析 {

}
