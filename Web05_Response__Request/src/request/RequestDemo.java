package request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 		if�еĴ��뼴Ϊ������
 * 		
 * 		��������ͷreferer�ж���Դҳ���ӱ���վ��Դ�ģ��ſɲ鿴��
 *									�Ǳ���վ��Դ���ض�����ת����ҳ��
 * 
 */
public class RequestDemo extends HttpServlet {

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//request��ȡ����ͷreferer���õ���Դ·��
		String referer=request.getHeader("referer");
		
		//1. referer==null�û�ֱ��ճ��url���ʣ��������
		//2. !referer.startsWith("http://localhost")�����վ����url����
		if(referer==null && !referer.startsWith("http://localhost"))
		{
			response.sendRedirect("/day06/index.jsp");	//�ض�����ҳȥ������棡
			return;
		}
		response.getOutputStream().write("bbb".getBytes());	//���Ա���վ�����㿴
	}
	
	



	 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
