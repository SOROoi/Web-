package HTTP_500����;
/*
 * ���̣�Web04_HelloServlet 
 * 
 * ���⣺
 * 		������������������ҳ����������ִ��servletʧ�� (��������������룺http://localhost:8080/HelloServlet/hello)
 * 
 * ������Ϣ��
  			HTTP Status 500 �C Internal Server Error
			Type Exception Report
			
			Message Error instantiating servlet class [/HelloServlet/src/show/HelloServlet]
			
			Description The server encountered an unexpected condition that prevented it from fulfilling the request.
			
			Exception
			
			javax.servlet.ServletException: Error instantiating servlet class [/HelloServlet/src/show/HelloServlet]
				org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:493)
				org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:81)
				org.apache.catalina.valves.AbstractAccessLogValve.invoke(AbstractAccessLogValve.java:660)
				org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)
				org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:798)
				org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66)
				org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:806)
				org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1498)
				org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)
				java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
				java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
				org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)
				java.lang.Thread.run(Unknown Source)
			Root Cause
			
			java.lang.ClassNotFoundException: /HelloServlet/src/show/HelloServlet
				org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1364)
				org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1185)
				org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:493)
				org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:81)
				org.apache.catalina.valves.AbstractAccessLogValve.invoke(AbstractAccessLogValve.java:660)
				org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)
				org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:798)
				org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66)
				org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:806)
				org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1498)
				org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)
				java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
				java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
				org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)
				java.lang.Thread.run(Unknown Source)
				
	web.xml���ݣ�
				<?xml version="1.0" encoding="UTF-8"?>
				<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
				  <display-name>Web04_HelloServlet</display-name>
				  <servlet>
				    <servlet-name>hi</servlet-name>
				    <servlet-class>/HelloServlet/src/show/HelloServlet</servlet-class>
				  </servlet>
				  <servlet-mapping>
				    <servlet-name>hi</servlet-name>
				    <url-pattern>/hello</url-pattern>
				  </servlet-mapping>
				  <welcome-file-list>
				    <welcome-file>index.html</welcome-file>
				    <welcome-file>index.htm</welcome-file>
				    <welcome-file>index.jsp</welcome-file>
				    <welcome-file>default.html</welcome-file>
				    <welcome-file>default.htm</welcome-file>
				    <welcome-file>default.jsp</welcome-file>
				  </welcome-file-list>
				</web-app>
 *  
 *  �Ų飺
 *  		1.����������Ϣ Error instantiating servlet class [/HelloServlet/src/show/HelloServlet]��
 *  			   ˵����ʵ����servlet��ʱ����������webӦ��Ŀ¼�в������ڸ��ļ�·��/HelloServlet/src/show/HelloServlet����ô
 *  			������Ϣ�е����·���Ǵ�����ð�������أ�
 *  		
 *  		2.������ Web04_HelloServlet�����е�web.xml��д���󣬴���
 *  						<servlet-class>/HelloServlet/src/show/HelloServlet</servlet-class>
 *  		   ��ȷ�ĸ�ʽӦ��Ϊ��
 *  						<servlet-class>show.HelloServlet</servlet-class>
 *  
 *  �ܽ᣺ 
 *  		web.xml��<servlet-class>��ǩ��ȷ��ʽӦ��Ϊ��(Ĭ��Ϊclasses�ļ�����)	
 *  											 <servlet-class>����.����</servlet-class>
 *
 *
 */
public class HTTP500���� {

}
