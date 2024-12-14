package com.srv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UsersDao;
import com.model.Users;

/**
 * Servlet implementation class UsersSrv
 */
@WebServlet("/UsersSrv")
public class UsersSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsersDao uDao = new UsersDao();
		
//		Users u = new Users();
//		u.setCountry("Italia");
//		u.setEmail("jj@kk.it");
//		u.setName("prova");
//		uDao.insert(u);
		
//		Users u = new Users();
//		u.setId(1);
//		u.setCountry("Germania");
//		u.setEmail("jj@kk.it");
//		u.setName("prova");
//		uDao.update(u);
		
//		Users u = uDao.getById(1);
//		System.out.println(u.getCountry());


		uDao.delete(1);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
