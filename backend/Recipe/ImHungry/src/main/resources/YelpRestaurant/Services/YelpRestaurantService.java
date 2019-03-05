package com.YelpRestaurant.Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.YelpRestaurant.Entities.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

public class YelpRestaurantService {
	
	private static final String apiKey = "Bearer d5CaSD1fY-tiI_b-jD1UZ62Q4PFfnCOCRw6WwzSYdrzyxehoclOrlsYRR0JYQCL5jXie1LaYlgnwD7r22AbAU0WCtPUB3DVccZMatEQ7kFEGCABLHMvz41FsRQJ7XHYx";
	
	//coordinates are configured to Tommy Trojan
	private static final String baseyelpSearchUrl = "https://api.yelp.com/v3/businesses/search?latitude=34.0206&longitude=-118.2854";
	
	// getRestaurantInfo(term, limit) - returns Yelp restaurant results as a JSON string. 
	
	public static String getRestaurantInfo(String term, String limit) {
		// returns a JSON String of Yelp results
		String jsonResult = getRestaurantJsonString(term, limit);
		
		// Root restaurantInfoObject = toEntity(jsonResult);
		return jsonResult;
	} 
	
	//Convert json string to class object - might be useful later. 
//	private static Root toEntity(String jsonString) {
//		try {
//			Gson gson = new GsonBuilder().create();
//			Root restaurantInfo = gson.fromJson(jsonString, Root.class);
//			return restaurantInfo;
//		}
//		catch (JsonSyntaxException ex) {
//			ex.printStackTrace();
//			return null;
//		}
//	}
	
	// getRestaurantJsonString(term, limit) - makes the HTTP request to the API and forms the JSON string
	private static String getRestaurantJsonString(String term, String limit) {
		String yelpurl = baseyelpSearchUrl + "term=" + term + "&" + "limit=" + limit; 

		try {
			if((term != null && term != "") && (limit != null && limit != ""))
				yelpurl = baseyelpSearchUrl+"&term="+URLEncoder.encode(term, "utf-8")+"&limit="+URLEncoder.encode(limit, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		StringBuilder sb = new StringBuilder();
		HttpURLConnection conn = null; 
		BufferedReader reader = null; 
		
		try {
			URL url = new URL(yelpurl);
			System.out.println(yelpurl);
			conn = (HttpURLConnection)url.openConnection();  
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization", apiKey);

     
		if (conn.getResponseCode() != 200) {
            throw new RuntimeException("HTTP GET Request Failed with Error code : "
                          + conn.getResponseCode());
        }
	    //Read the content from the defined connection
        //Using IO Stream with Buffer raise highly the efficiency of IO
        reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
        String output = null;  
        
        while ((output = reader.readLine()) != null)  
            sb.append(output);  
		}catch(MalformedURLException e) {  
		    e.printStackTrace();   
		}catch(IOException e){  
		    e.printStackTrace();   
		}
		
		finally
		{
		    if(reader != null)
		    {
		        try {
		            reader.close();
		        } catch (IOException e) {
		            e.printStackTrace();
	 	        }
		    }
		    if(conn != null)
		    { 
		        conn.disconnect();
		    }
		}
		
		return sb.toString();  
	}	

}
