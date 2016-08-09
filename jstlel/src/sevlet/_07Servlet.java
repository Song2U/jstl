package sevlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.MemberVo;

@WebServlet("/07")
public class _07Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberVo vo = new MemberVo();
		vo.setName("둘리");
		vo.setEmail("dooly0_0@gmail.com");
		vo.setNo(10L);
		vo.setGender("MALE");
		
		// requestScope 저장
		request.setAttribute("memberVo", vo);
		
		// sessionScope 저장
		MemberVo vo2 = new MemberVo();
		vo2.setName("둘리");
		vo2.setEmail("dooly0_0@gmail.com");
		vo2.setNo(10L);
		vo2.setGender("MALE");
		HttpSession session = request.getSession(true);
		
		session.setAttribute("memberVo", vo2);
		
		
		// applicationScope에 저장
		MemberVo vo3 = new MemberVo();
		vo3.setName("고길동");
		vo3.setEmail("gildong2@gmail.com");
		vo3.setNo(30L);
		vo3.setGender("MALE");
		getServletContext().setAttribute("", vo3);
		
		session.setAttribute("memberVo3", vo3);
		
		request.getRequestDispatcher( "/view/07.jsp" ).forward( request, response );
	}
}
