package response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * �ļ����غ������ļ�������
 * 	1.��ȡ���ļ�
 * 	2.д��response����
 * 	3.��������������ط�ʽ������Դ
 * 	
 *  4.�����ļ��������ļ������ļ�����Ҫ����url����
 */
public class RespServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// test1(response);	// ���ط������ļ�
		test2(response);	// ���������ļ�
	}

	// ���������ļ��������ļ�����Ҫ����url����
	private void test2(HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		// 1.������Ӧͷ:���ط�ʽ��
		response.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode("��ľ.jpg", "UTF-8"));
		
		// 2.��ȡ�ļ�
		InputStream in = this.getServletContext().getResourceAsStream("/Download/��ľ.jpg");
		// 3.д��response
		OutputStream out = response.getOutputStream();
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = in.read(by)) != -1) {
			out.write(by, 0, len);
		}
		out.close();
		in.close();
	}

	// ���ط������ļ�
	private void test1(HttpServletResponse response) throws IOException {
		// ������Ӧͷ
		response.setHeader("Content-Disposition", "attachment; filename=1.jpg");
		// ��ȡ�ļ�
		InputStream in = this.getServletContext().getResourceAsStream("/Download/1.jpg");
		// д��response
		OutputStream out = response.getOutputStream();
		byte[] by = new byte[1024];
		int len = 0;
		while ((len = in.read(by)) != -1) {
			out.write(by, 0, len);
		}
		out.close();
		in.close();
	}

}