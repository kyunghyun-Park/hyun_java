package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public View() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ActionForward forward = null;
		
		//이벤트 처리 컨트롤러
		try {
			forward = new ActionForward();
			MemberBean memberInfo = new MemberBean();
			String name=request.getParameter("name");
			String id=request.getParameter("id");
			memberInfo.setName(name);
			memberInfo.setId(id);
			request.setAttribute("memberInfo", memberInfo);
			forward.setPath("/view.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(forward != null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

}
