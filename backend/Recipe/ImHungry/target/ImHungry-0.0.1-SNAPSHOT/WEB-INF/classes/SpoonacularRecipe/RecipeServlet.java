package ImHungry.Index;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RecipeServlet {

	public static void main(String[] args) throws UnirestException {

		String API_KEY = "885e38805emsh424ffd2e4016f98p1cb3efjsn55402a4c6758";
		String URL = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/";

		URL += "recipes/479101/information";

		System.out.println(URL);

		HttpResponse<JsonNode> jsonResponse = Unirest.get(URL)
				 .header("X-RapidAPI-Key", API_KEY)
				 .asJson();
		 
		JsonParser parser = new JsonParser();
		JsonObject recipe = parser.parse(jsonResponse.getBody().toString()).getAsJsonObject();
		
		System.out.println(jsonResponse.getBody().toString());
		
		String title = recipe.get("title").getAsString();
		System.out.println("Title: " + title);
		
		String imgURL = recipe.get("image").getAsString();
		System.out.println("Image URL: " + imgURL);
		
		int time = recipe.get("readyInMinutes").getAsInt();
		System.out.println("Total time: " + time + " minutes");
		
		double price = recipe.get("pricePerServing").getAsDouble();
		System.out.println("Price: $" + price);
		
		JsonArray ingredients = recipe.get("extendedIngredients").getAsJsonArray();
		for(int i=0; i<ingredients.size(); i++) {
			
			JsonObject ing = ingredients.get(i).getAsJsonObject();
			String name = ing.get("name").getAsString();
			String amount = ing.get("amount").getAsString();
			String unit = ing.get("unit").getAsString();
			
			System.out.println((i+1) + ") " + amount + " " + unit + " of " + name);
			
		}
		
		
		String instructions = recipe.get("instructions").getAsString();
		String[] instr = instructions.split("\\.");
		
		for(int i=0; i<instr.length; i++) {
			System.out.println((i+1) + ") " + instr[i] + ".");
		}
		 
	}
}
