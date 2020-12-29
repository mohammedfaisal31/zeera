package com.zeera.controller;


import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zeera.ui.*;

public class ZeeraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ZeeraController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		  Header head = new Header();
		  Content content = new Content();
		  Footer foot = new Footer();
		  
		  head.prepareHeader();
		  content.prepareContent();
		  foot.prepareFooter();
			
		  response.setContentType("text/html");
		  PrintWriter printWriter = response.getWriter();
		  printWriter.print(head.getHeader()+content.getContent()+foot.getFooter());
		}
		catch (IOException ioException)
		{
		  ioException.printStackTrace();
		}
	}

}

