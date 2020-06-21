package show;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 		Eclipse����������������Ŀ��Servlet���Ľ����Զ����𵽷�����
 * 
 */

public class S3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��װ������������classesĿ¼�µ���Դ�ļ�·��
		String s = this.getClass().getClassLoader().getResource("db.properties").getPath();
		FileInputStream in = new FileInputStream(s); 
		Properties p = new Properties();
		p.load(in);
		String value = p.getProperty("url");
		System.out.println(value);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}