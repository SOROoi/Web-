package response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 		�����������ʱˢ��	
 			
 		response.setHeader("refresh", "3");							//ÿ������ˢ��һ��
 		response.setHeader("refresh", "3;url='/day06/index.jsp'");	//ÿ������ˢ��һ�Σ���ת��url��ַ��Ĭ���������£�
 		
 		response.sendRedirect(url)									//�ض���
 		resquest.getRequestDispatcher(url).forward(request,response)//����ת����ָ��url(�������ڲ���תurlȻ�󽫽�����������)
 																					(ֻ�ܶ�λ����������Դs)
 		
 */

public class RespServlet4 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		test1(response);
		test2(response);
	}

	private void test1(HttpServletResponse response) throws IOException {
		response.setHeader("refresh", "3");
		String data = new Random().nextInt(100000)+"";
		response.getWriter().write(data);
	}
	
	private void test2(HttpServletResponse response) throws IOException {	
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		response.setHeader("refresh", "3;url='/Web05_Response__Request/1.html'");
		response.getWriter().write("��¼�ɹ�������3�����ת�����û�У����<a href=''>������</a>");
	}

	private void test3(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
		String message="<meta http-equiv='refresh' content='3;url=/day06/index.jsp'>��¼�ɹ�������3�����ת�����û�У����<a href=''>������</a>";
		request.setAttribute("message",message);
		this.getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
	}
}