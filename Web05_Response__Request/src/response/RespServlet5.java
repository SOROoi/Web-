package response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 					�����ض���(���������������ַ�����ͱ仯)
 					
 		��ʽһ��
	 		response.setStatus(302);											//����״̬��302
			response.setHeader("location", "/Web05_Response__Request/1.html");	//������Ӧͷlocation
	 		
	 	��ʽ����
	 		response.sendRedirect("/Web05_Response__Request/1.html")		//һ����
 */

public class RespServlet5 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		test1(response);	//��ʽһ
		test2(response);	//��ʽ��
	}

	private void test2(HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("/Web05_Response__Request/1.html");
	}

	private void test1(HttpServletResponse response) {
		response.setStatus(302);											//����״̬��302
		response.setHeader("location", "/Web05_Response__Request/1.html");	//������Ӧͷlocation
	}

}