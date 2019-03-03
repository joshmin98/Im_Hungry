
public class RecipeDetails {

	String title;
	String imgURL;
	int time;
	double price;
	String[] ingredients;
	String[] instructions;
	
	public RecipeDetails(String title, String imgURL, int time, double price, 
			String[] ingredients, String[] instructions) {
		this.title = title;
		this.imgURL = imgURL;
		this.time = time;
		this.price = price;
		this.ingredients = ingredients;
		this.instructions = instructions;
		
	}
}
