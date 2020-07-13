package controller;

/*
1.Do not modify the existing code at any point or you will not get output.
2. Uncomment the code inside the doPost method given in this class to run and see the output
*/
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.FlamesCheckService;
@WebServlet("/flames")
public class FlamesCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FlamesCheck() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/check.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		 
		  String name1 = request.getParameter("your"); 
		  String name2 = request.getParameter("crush");
		  
		  FlamesCheckService fcs = new FlamesCheckService();
		  
		  char k = fcs.findFlames(name1,name2);
		  
		 if (k == 'f') { RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/friends.jsp"
		  ); rd.forward(request, response);
		  
		  } else if (k == 'l') { RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/lovers.jsp")
		  ; rd.forward(request, response);
		  
		  } else if (k == 'a') { RequestDispatcher rd=this.getServletContext().getRequestDispatcher(
		  "/WEB-INF/views/affection.jsp"); rd.forward(request, response);
		  
		  } else if (k == 'm') { RequestDispatcher rd=this.getServletContext().getRequestDispatcher(
		  "/WEB-INF/views/marriage.jsp"); rd.forward(request, response);
		  
		  } else if (k == 'e') { RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/enemies.jsp"
		  ); rd.forward(request, response);
		  
		  } else if (k == 's') { RequestDispatcher rd=this.getServletContext().getRequestDispatcher(
		  "/WEB-INF/views/siblings.jsp"); rd.forward(request, response);
		  
		  }
		 
	}

}
