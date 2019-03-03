package com.YelpRestaurant.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.YelpRestaurant.Entities.Business;
import com.YelpRestaurant.Entities.Root;
import com.YelpRestaurant.Services.YelpRestaurantService;

/**
 * Servlet implementation class RestaurantServlet
 */
@WebServlet("/RestaurantServlet")
public class RestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RestaurantServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Get queries
		String term = request.getParameter("query");
	
		String limit = request.getParameter("numResults");
		
		// contains restaurant JSON string results
		String restaurantJSONstring = YelpRestaurantService.getRestaurantInfo(term,limit);
		
//		if(restaurantInfoObject != null) {
//			List<Business> restaurantList = restaurantInfoObject.getBusinesses();
//			if(restaurantList != null) {
//				//ouput the restaurant content on web page
//				StringBuilder outputContent = new StringBuilder();
//			}  
//		}
		
		
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
