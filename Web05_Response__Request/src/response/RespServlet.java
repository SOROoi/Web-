package response;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*	1.��response���������������װ��OutputStreamWrite�У�ָ��GBK���룬д��"��Һ�"
	
	2.ͨ��response�з�����ӦͷContent-type��������������յı��룬response��д��UTF-8�� "�й�"��
			
			response.setContentType("text/html;charset=UTF-8");//������ӦͷContent-type
			response.setCharacterEncoding("UTF-8");			//����response����ı���
			response.getWriter().write("�й�");
			
*/
public class RespServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		test1(response,request);
		test2(response,request);
	}

	//ͨ��response�з�����ӦͷContent-type��������������յı��룬response��д��UTF-8�� "�й�"��
	private void test2(HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException, IOException {
//		response.setHeader("Content-type", "text/html;charset=UTF-8");
//		response.getOutputStream().write("�й�".getBytes("UTF-8"));

		response.setContentType("text/html;charset=UTF-8");//������ӦͷContent-type
		response.setCharacterEncoding("UTF-8");			//����response����ı���
		response.getWriter().write("�й�");

	}

	//��response���������������װ��OutputStreamWrite�У�ָ��GBK���룬д��"��Һ�"
	private void test1(HttpServletResponse response, HttpServletRequest request) {
		// TODO Auto-generated method stub
		OutputStreamWriter osw = null;
		try {
			osw = new OutputStreamWriter(response.getOutputStream(),"GBK");
			osw.write("��Һ�");
			osw.flush();
		} catch (Exception e) {
			// TODO: handle exception
			throw new ExceptionInInitializerError();
		}finally {
			try {
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}