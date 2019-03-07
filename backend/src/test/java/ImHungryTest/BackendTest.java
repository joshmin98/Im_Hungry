package ImHungryTest;

import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import ImHungryServlet.RecipeServlet;
import ImHungryServlet.YelpRestaurantService;

public class BackendTest {
	
	@Test
	public void testYelpRestaurntQuery() throws UnsupportedEncodingException {
		YelpRestaurantService yrs = new YelpRestaurantService();
				assertTrue("{\n" + 
						"  \"businesses\": [\n" + 
						"    {\n" + 
						"      \"id\": \"qpZCi8oVqxOA_YSIaCaMnw\",\n" + 
						"      \"alias\": \"northern-cafe-los-angeles-6\",\n" + 
						"      \"name\": \"Northern Cafe\",\n" + 
						"      \"image_url\": \"https://s3-media1.fl.yelpcdn.com/bphoto/ezitWloRnPbDr6Pj5UlmPA/o.jpg\",\n" + 
						"      \"is_closed\": false,\n" + 
						"      \"url\": \"https://www.yelp.com/biz/northern-cafe-los-angeles-6?adjust_creative\\u003dTDGLRk9p6uqlW-mfLx7Skw\\u0026utm_campaign\\u003dyelp_api_v3\\u0026utm_medium\\u003dapi_v3_business_search\\u0026utm_source\\u003dTDGLRk9p6uqlW-mfLx7Skw\",\n" + 
						"      \"review_count\": 162,\n" + 
						"      \"categories\": [\n" + 
						"        {\n" + 
						"          \"alias\": \"noodles\",\n" + 
						"          \"title\": \"Noodles\"\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"alias\": \"chinese\",\n" + 
						"          \"title\": \"Chinese\"\n" + 
						"        }\n" + 
						"      ],\n" + 
						"      \"rating\": 4.0,\n" + 
						"      \"coordinates\": {\n" + 
						"        \"latitude\": 34.0255178,\n" + 
						"        \"longitude\": -118.2775239\n" + 
						"      },\n" + 
						"      \"transactions\": [\n" + 
						"        \"pickup\",\n" + 
						"        \"delivery\"\n" + 
						"      ],\n" + 
						"      \"price\": \"$$\",\n" + 
						"      \"location\": {\n" + 
						"        \"address1\": \"2904 S Figueroa St\",\n" + 
						"        \"address2\": \"\",\n" + 
						"        \"city\": \"Los Angeles\",\n" + 
						"        \"zip_code\": \"90007\",\n" + 
						"        \"country\": \"US\",\n" + 
						"        \"state\": \"CA\",\n" + 
						"        \"display_address\": [\n" + 
						"          \"2904 S Figueroa St\",\n" + 
						"          \"Los Angeles, CA 90007\"\n" + 
						"        ]\n" + 
						"      },\n" + 
						"      \"phone\": \"+12137419050\",\n" + 
						"      \"display_phone\": \"(213) 741-9050\",\n" + 
						"      \"distance\": 922.0293558073239\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"id\": \"j7zBQ2dfP5QDVH8n33X9cg\",\n" + 
						"      \"alias\": \"qin-west-noodle-los-angeles-2\",\n" + 
						"      \"name\": \"Qin West Noodle\",\n" + 
						"      \"image_url\": \"https://s3-media3.fl.yelpcdn.com/bphoto/uDA2-u7bb4ch83GioHcm1Q/o.jpg\",\n" + 
						"      \"is_closed\": false,\n" + 
						"      \"url\": \"https://www.yelp.com/biz/qin-west-noodle-los-angeles-2?adjust_creative\\u003dTDGLRk9p6uqlW-mfLx7Skw\\u0026utm_campaign\\u003dyelp_api_v3\\u0026utm_medium\\u003dapi_v3_business_search\\u0026utm_source\\u003dTDGLRk9p6uqlW-mfLx7Skw\",\n" + 
						"      \"review_count\": 45,\n" + 
						"      \"categories\": [\n" + 
						"        {\n" + 
						"          \"alias\": \"chinese\",\n" + 
						"          \"title\": \"Chinese\"\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"alias\": \"noodles\",\n" + 
						"          \"title\": \"Noodles\"\n" + 
						"        }\n" + 
						"      ],\n" + 
						"      \"rating\": 4.0,\n" + 
						"      \"coordinates\": {\n" + 
						"        \"latitude\": 34.0284352846134,\n" + 
						"        \"longitude\": -118.275783478992\n" + 
						"      },\n" + 
						"      \"transactions\": [],\n" + 
						"      \"price\": \"$\",\n" + 
						"      \"location\": {\n" + 
						"        \"address1\": \"2520 S Figueroa St\",\n" + 
						"        \"address2\": \"\",\n" + 
						"        \"city\": \"Los Angeles\",\n" + 
						"        \"zip_code\": \"90007\",\n" + 
						"        \"country\": \"US\",\n" + 
						"        \"state\": \"CA\",\n" + 
						"        \"display_address\": [\n" + 
						"          \"2520 S Figueroa St\",\n" + 
						"          \"Los Angeles, CA 90007\"\n" + 
						"        ]\n" + 
						"      },\n" + 
						"      \"phone\": \"+12135365057\",\n" + 
						"      \"display_phone\": \"(213) 536-5057\",\n" + 
						"      \"distance\": 1288.6587259146172\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"id\": \"ZlQo_ArRw-nnHcrcnYPbiA\",\n" + 
						"      \"alias\": \"yang-chow-los-angeles\",\n" + 
						"      \"name\": \"Yang Chow\",\n" + 
						"      \"image_url\": \"https://s3-media2.fl.yelpcdn.com/bphoto/IE5gIT5gXcS82yJAyxnG6g/o.jpg\",\n" + 
						"      \"is_closed\": false,\n" + 
						"      \"url\": \"https://www.yelp.com/biz/yang-chow-los-angeles?adjust_creative\\u003dTDGLRk9p6uqlW-mfLx7Skw\\u0026utm_campaign\\u003dyelp_api_v3\\u0026utm_medium\\u003dapi_v3_business_search\\u0026utm_source\\u003dTDGLRk9p6uqlW-mfLx7Skw\",\n" + 
						"      \"review_count\": 2307,\n" + 
						"      \"categories\": [\n" + 
						"        {\n" + 
						"          \"alias\": \"chinese\",\n" + 
						"          \"title\": \"Chinese\"\n" + 
						"        }\n" + 
						"      ],\n" + 
						"      \"rating\": 4.0,\n" + 
						"      \"coordinates\": {\n" + 
						"        \"latitude\": 34.06301,\n" + 
						"        \"longitude\": -118.2384\n" + 
						"      },\n" + 
						"      \"transactions\": [],\n" + 
						"      \"price\": \"$$\",\n" + 
						"      \"location\": {\n" + 
						"        \"address1\": \"819 N Broadway\",\n" + 
						"        \"address2\": \"\",\n" + 
						"        \"address3\": \"\",\n" + 
						"        \"city\": \"Los Angeles\",\n" + 
						"        \"zip_code\": \"90012\",\n" + 
						"        \"country\": \"US\",\n" + 
						"        \"state\": \"CA\",\n" + 
						"        \"display_address\": [\n" + 
						"          \"819 N Broadway\",\n" + 
						"          \"Los Angeles, CA 90012\"\n" + 
						"        ]\n" + 
						"      },\n" + 
						"      \"phone\": \"+12136250811\",\n" + 
						"      \"display_phone\": \"(213) 625-0811\",\n" + 
						"      \"distance\": 6410.25003818175\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"id\": \"5WRkjiZWv25aGOUqfupSUQ\",\n" + 
						"      \"alias\": \"the-new-moon-los-angeles\",\n" + 
						"      \"name\": \"The New Moon\",\n" + 
						"      \"image_url\": \"https://s3-media3.fl.yelpcdn.com/bphoto/zgZb9sXd2mxgr8HeM2K8pA/o.jpg\",\n" + 
						"      \"is_closed\": false,\n" + 
						"      \"url\": \"https://www.yelp.com/biz/the-new-moon-los-angeles?adjust_creative\\u003dTDGLRk9p6uqlW-mfLx7Skw\\u0026utm_campaign\\u003dyelp_api_v3\\u0026utm_medium\\u003dapi_v3_business_search\\u0026utm_source\\u003dTDGLRk9p6uqlW-mfLx7Skw\",\n" + 
						"      \"review_count\": 255,\n" + 
						"      \"categories\": [\n" + 
						"        {\n" + 
						"          \"alias\": \"chinese\",\n" + 
						"          \"title\": \"Chinese\"\n" + 
						"        }\n" + 
						"      ],\n" + 
						"      \"rating\": 4.0,\n" + 
						"      \"coordinates\": {\n" + 
						"        \"latitude\": 34.0415537,\n" + 
						"        \"longitude\": -118.255232\n" + 
						"      },\n" + 
						"      \"transactions\": [\n" + 
						"        \"pickup\",\n" + 
						"        \"delivery\"\n" + 
						"      ],\n" + 
						"      \"price\": \"$$\",\n" + 
						"      \"location\": {\n" + 
						"        \"address1\": \"102 W 9th St\",\n" + 
						"        \"address2\": \"\",\n" + 
						"        \"address3\": \"\",\n" + 
						"        \"city\": \"Los Angeles\",\n" + 
						"        \"zip_code\": \"90015\",\n" + 
						"        \"country\": \"US\",\n" + 
						"        \"state\": \"CA\",\n" + 
						"        \"display_address\": [\n" + 
						"          \"102 W 9th St\",\n" + 
						"          \"Los Angeles, CA 90015\"\n" + 
						"        ]\n" + 
						"      },\n" + 
						"      \"phone\": \"+12136240186\",\n" + 
						"      \"display_phone\": \"(213) 624-0186\",\n" + 
						"      \"distance\": 3620.2074087871115\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"id\": \"hoGJgKNrtKRq7i0C5fp2iQ\",\n" + 
						"      \"alias\": \"new-hong-kong-chinese-express-los-angeles\",\n" + 
						"      \"name\": \"New Hong Kong Chinese Express\",\n" + 
						"      \"image_url\": \"https://s3-media2.fl.yelpcdn.com/bphoto/XlPaZEMXRPS3Vvn5kT7Y7w/o.jpg\",\n" + 
						"      \"is_closed\": false,\n" + 
						"      \"url\": \"https://www.yelp.com/biz/new-hong-kong-chinese-express-los-angeles?adjust_creative\\u003dTDGLRk9p6uqlW-mfLx7Skw\\u0026utm_campaign\\u003dyelp_api_v3\\u0026utm_medium\\u003dapi_v3_business_search\\u0026utm_source\\u003dTDGLRk9p6uqlW-mfLx7Skw\",\n" + 
						"      \"review_count\": 16,\n" + 
						"      \"categories\": [\n" + 
						"        {\n" + 
						"          \"alias\": \"chinese\",\n" + 
						"          \"title\": \"Chinese\"\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"alias\": \"thai\",\n" + 
						"          \"title\": \"Thai\"\n" + 
						"        }\n" + 
						"      ],\n" + 
						"      \"rating\": 4.5,\n" + 
						"      \"coordinates\": {\n" + 
						"        \"latitude\": 34.0113868713379,\n" + 
						"        \"longitude\": -118.309410095215\n" + 
						"      },\n" + 
						"      \"transactions\": [],\n" + 
						"      \"price\": \"$\",\n" + 
						"      \"location\": {\n" + 
						"        \"address1\": \"3991 S Western Ave\",\n" + 
						"        \"address2\": \"Ste 2\",\n" + 
						"        \"address3\": \"\",\n" + 
						"        \"city\": \"Los Angeles\",\n" + 
						"        \"zip_code\": \"90062\",\n" + 
						"        \"country\": \"US\",\n" + 
						"        \"state\": \"CA\",\n" + 
						"        \"display_address\": [\n" + 
						"          \"3991 S Western Ave\",\n" + 
						"          \"Ste 2\",\n" + 
						"          \"Los Angeles, CA 90062\"\n" + 
						"        ]\n" + 
						"      },\n" + 
						"      \"phone\": \"+15623493109\",\n" + 
						"      \"display_phone\": \"(562) 349-3109\",\n" + 
						"      \"distance\": 2453.9766097331844\n" + 
						"    }\n" + 
						"  ],\n" + 
						"  \"total\": 568,\n" + 
						"  \"region\": {\n" + 
						"    \"center\": {\n" + 
						"      \"longitude\": -118.2854,\n" + 
						"      \"latitude\": 34.0206\n" + 
						"    }\n" + 
						"  }\n" + 
						"}" == yrs.getRestaurantInfo("Chinese", "5")); 
				
}
	
	@Test(expected=RuntimeException.class)
	public void testYelpRestaurntEmptyQuery() throws UnsupportedEncodingException {
		YelpRestaurantService yrs = new YelpRestaurantService();
		String json = yrs.getRestaurantInfo("", "");
	} 
	
	@Test
	public void testRecipeMalformed() {
		RecipeServlet rs = new RecipeServlet(); 
		assertTrue("{\n" + 
				"\"results\":[\n" + 
				"]\n" + 
				"\"baseUri\":\"https://spoonacular.com/recipeImages/\"\n" + 
				"\"offset\":0\n" + 
				"\"number\":10\n" + 
				"\"totalResults\":0\n" + 
				"\"processingTimeMs\":4076\n" + 
				"}" == rs.getRecipeData("asdfasdfasdf", "10"));
	}

	@Test
	public void testRecipeQuery(){
		
		RecipeServlet rs = new RecipeServlet();
        assertTrue( "{\n" + 
        		"  \"number\": 3,\n" + 
        		"  \"totalResults\": 210,\n" + 
        		"  \"offset\": 0,\n" + 
        		"  \"processingTimeMs\": 244,\n" + 
        		"  \"baseUri\": \"https://spoonacular.com/recipeImages/\",\n" + 
        		"  \"results\": [\n" + 
        		"    {\n" + 
        		"      \"sustainable\": false,\n" + 
        		"      \"analyzedInstructions\": [\n" + 
        		"        {\n" + 
        		"          \"name\": \"\",\n" + 
        		"          \"steps\": [\n" + 
        		"            {\n" + 
        		"              \"number\": 1,\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"olive-oil.jpg\",\n" + 
        		"                  \"name\": \"olive oil\",\n" + 
        		"                  \"id\": 4053\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"dutch-oven.jpg\",\n" + 
        		"                  \"name\": \"dutch oven\",\n" + 
        		"                  \"id\": 404667\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"step\": \"To a large dutch oven or soup pot, heat the olive oil over medium heat.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 2,\n" + 
        		"              \"length\": {\n" + 
        		"                \"number\": 10,\n" + 
        		"                \"unit\": \"minutes\"\n" + 
        		"              },\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"sliced-carrot.png\",\n" + 
        		"                  \"name\": \"carrot\",\n" + 
        		"                  \"id\": 11124\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"celery.jpg\",\n" + 
        		"                  \"name\": \"celery\",\n" + 
        		"                  \"id\": 11143\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"brown-onion.png\",\n" + 
        		"                  \"name\": \"onion\",\n" + 
        		"                  \"id\": 11282\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [],\n" + 
        		"              \"step\": \"Add the onion, carrots and celery and cook for 8-10 minutes or until tender, stirring occasionally.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 3,\n" + 
        		"              \"length\": {\n" + 
        		"                \"number\": 22,\n" + 
        		"                \"unit\": \"minutes\"\n" + 
        		"              },\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"salt-and-pepper.jpg\",\n" + 
        		"                  \"name\": \"salt and pepper\",\n" + 
        		"                  \"id\": 1102047\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"chicken-broth.png\",\n" + 
        		"                  \"name\": \"vegetable stock\",\n" + 
        		"                  \"id\": 6615\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"red-lentils.png\",\n" + 
        		"                  \"name\": \"red lentils\",\n" + 
        		"                  \"id\": 10016069\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"tomato.png\",\n" + 
        		"                  \"name\": \"tomato\",\n" + 
        		"                  \"id\": 11529\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"lentils-brown.jpg\",\n" + 
        		"                  \"name\": \"lentils\",\n" + 
        		"                  \"id\": 16069\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"turnips.png\",\n" + 
        		"                  \"name\": \"turnip\",\n" + 
        		"                  \"id\": 11564\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"garlic.png\",\n" + 
        		"                  \"name\": \"garlic\",\n" + 
        		"                  \"id\": 11215\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"oven.jpg\",\n" + 
        		"                  \"name\": \"stove\",\n" + 
        		"                  \"id\": 404794\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"stock-pot.jpg\",\n" + 
        		"                  \"name\": \"pot\",\n" + 
        		"                  \"id\": 404752\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"step\": \"Add the garlic and cook for an additional 2 minutes, or until fragrant. Season conservatively with a pinch of salt and black pepper.To the pot, add the tomatoes, turnip and red lentils. Stir to combine. Stir in the vegetable stock and increase the heat on the stove to high. Bring the soup to a boil and then reduce to a simmer. Simmer for 20 minutes or until the turnips are tender and the lentils are cooked through.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 4,\n" + 
        		"              \"length\": {\n" + 
        		"                \"number\": 5,\n" + 
        		"                \"unit\": \"minutes\"\n" + 
        		"              },\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"chicken-breasts.png\",\n" + 
        		"                  \"name\": \"chicken breast\",\n" + 
        		"                  \"id\": 5062\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"parsley.jpg\",\n" + 
        		"                  \"name\": \"parsley\",\n" + 
        		"                  \"id\": 11297\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [],\n" + 
        		"              \"step\": \"Add the chicken breast and parsley. Cook for an additional 5 minutes. Adjust seasoning to taste.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 5,\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"parsley.jpg\",\n" + 
        		"                  \"name\": \"fresh parsley\",\n" + 
        		"                  \"id\": 11297\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [],\n" + 
        		"              \"step\": \"Serve the soup immediately garnished with fresh parsley and any additional toppings. Enjoy!\"\n" + 
        		"            }\n" + 
        		"          ]\n" + 
        		"        }\n" + 
        		"      ],\n" + 
        		"      \"glutenFree\": true,\n" + 
        		"      \"veryPopular\": true,\n" + 
        		"      \"healthScore\": 73,\n" + 
        		"      \"title\": \"Red Lentil Soup with Chicken and Turnips\",\n" + 
        		"      \"diets\": [\n" + 
        		"        \"gluten free\",\n" + 
        		"        \"dairy free\"\n" + 
        		"      ],\n" + 
        		"      \"aggregateLikes\": 1866,\n" + 
        		"      \"sourceUrl\": \"http://www.pinkwhen.com/red-lentil-soup-with-chicken-and-turnips/\",\n" + 
        		"      \"readyInMinutes\": 55,\n" + 
        		"      \"creditsText\": \"Jen West\",\n" + 
        		"      \"dairyFree\": true,\n" + 
        		"      \"servings\": 8,\n" + 
        		"      \"vegetarian\": false,\n" + 
        		"      \"whole30\": false,\n" + 
        		"      \"creditText\": \"Jen West\",\n" + 
        		"      \"id\": 715415,\n" + 
        		"      \"preparationMinutes\": 10,\n" + 
        		"      \"imageType\": \"jpg\",\n" + 
        		"      \"winePairing\": {\n" + 
        		"        \"productMatches\": [],\n" + 
        		"        \"pairingText\": \"\",\n" + 
        		"        \"pairedWines\": []\n" + 
        		"      },\n" + 
        		"      \"cookingMinutes\": 45,\n" + 
        		"      \"image\": \"https://spoonacular.com/recipeImages/715415-312x231.jpg\",\n" + 
        		"      \"veryHealthy\": true,\n" + 
        		"      \"vegan\": false,\n" + 
        		"      \"cheap\": false,\n" + 
        		"      \"dishTypes\": [\n" + 
        		"        \"soup\"\n" + 
        		"      ],\n" + 
        		"      \"gaps\": \"no\",\n" + 
        		"      \"cuisines\": [],\n" + 
        		"      \"lowFodmap\": false,\n" + 
        		"      \"license\": \"CC BY-SA 3.0\",\n" + 
        		"      \"weightWatcherSmartPoints\": 11,\n" + 
        		"      \"occasions\": [\n" + 
        		"        \"fall\",\n" + 
        		"        \"winter\"\n" + 
        		"      ],\n" + 
        		"      \"spoonacularScore\": 99,\n" + 
        		"      \"pricePerServing\": 276.67,\n" + 
        		"      \"spoonacularSourceUrl\": \"https://spoonacular.com/red-lentil-soup-with-chicken-and-turnips-715415\",\n" + 
        		"      \"sourceName\": \"Pink When\",\n" + 
        		"      \"ketogenic\": false\n" + 
        		"    },\n" + 
        		"    {\n" + 
        		"      \"sustainable\": false,\n" + 
        		"      \"analyzedInstructions\": [\n" + 
        		"        {\n" + 
        		"          \"name\": \"\",\n" + 
        		"          \"steps\": [\n" + 
        		"            {\n" + 
        		"              \"number\": 1,\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"potatoes-yukon-gold.png\",\n" + 
        		"                  \"name\": \"potato\",\n" + 
        		"                  \"id\": 11362\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"sliced-carrot.png\",\n" + 
        		"                  \"name\": \"carrot\",\n" + 
        		"                  \"id\": 11124\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"garlic.png\",\n" + 
        		"                  \"name\": \"garlic\",\n" + 
        		"                  \"id\": 11215\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"brown-onion.png\",\n" + 
        		"                  \"name\": \"onion\",\n" + 
        		"                  \"id\": 11282\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"water.png\",\n" + 
        		"                  \"name\": \"water\",\n" + 
        		"                  \"id\": 14412\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"bowl.jpg\",\n" + 
        		"                  \"name\": \"bowl\",\n" + 
        		"                  \"id\": 404783\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"step\": \"Chop your onions, slice your carrots and smash your garlic. Set aside.Peel and chop the potatoes. Set aside in a bowl of cold water.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 2,\n" + 
        		"              \"ingredients\": [],\n" + 
        		"              \"equipment\": [],\n" + 
        		"              \"step\": \"Remove the casing from your chorizo. This is an important step. Chorizo casing is tough and unforgiving and will make the sausage link curl during the cooking process. Just remove it and don\\u0027t worry about appearance.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 3,\n" + 
        		"              \"ingredients\": [],\n" + 
        		"              \"equipment\": [],\n" + 
        		"              \"step\": \"Cut the links length-wise then chop into half-moons.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 4,\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"kale.jpg\",\n" + 
        		"                  \"name\": \"kale\",\n" + 
        		"                  \"id\": 11233\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"pan.png\",\n" + 
        		"                  \"name\": \"frying pan\",\n" + 
        		"                  \"id\": 404645\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"stock-pot.jpg\",\n" + 
        		"                  \"name\": \"pot\",\n" + 
        		"                  \"id\": 404752\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"step\": \"Sautee in a separate pan until the are nice and browned. Don\\u0027t put into the pot until the last minute, otherwise the color of the chorizo will leach into the soup turning it a weird red color.Now it\\u0027s time to prepare the kale. With each individual leaf, cut out the stem. You can do this several ways.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 5,\n" + 
        		"              \"length\": {\n" + 
        		"                \"number\": 5,\n" + 
        		"                \"unit\": \"minutes\"\n" + 
        		"              },\n" + 
        		"              \"ingredients\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"red-pepper-flakes.jpg\",\n" + 
        		"                  \"name\": \"red pepper flakes\",\n" + 
        		"                  \"id\": 1032009\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"potatoes-yukon-gold.png\",\n" + 
        		"                  \"name\": \"potato\",\n" + 
        		"                  \"id\": 11362\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"sliced-carrot.png\",\n" + 
        		"                  \"name\": \"carrot\",\n" + 
        		"                  \"id\": 11124\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"garlic.png\",\n" + 
        		"                  \"name\": \"garlic\",\n" + 
        		"                  \"id\": 11215\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"brown-onion.png\",\n" + 
        		"                  \"name\": \"onion\",\n" + 
        		"                  \"id\": 11282\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"water.png\",\n" + 
        		"                  \"name\": \"water\",\n" + 
        		"                  \"id\": 14412\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"kale.jpg\",\n" + 
        		"                  \"name\": \"kale\",\n" + 
        		"                  \"id\": 11233\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"equipment\": [\n" + 
        		"                {\n" + 
        		"                  \"image\": \"wooden-spoon.jpg\",\n" + 
        		"                  \"name\": \"wooden spoon\",\n" + 
        		"                  \"id\": 404732\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"chefs-knife.jpg\",\n" + 
        		"                  \"name\": \"knife\",\n" + 
        		"                  \"id\": 404745\n" + 
        		"                },\n" + 
        		"                {\n" + 
        		"                  \"image\": \"stock-pot.jpg\",\n" + 
        		"                  \"name\": \"pot\",\n" + 
        		"                  \"id\": 404752\n" + 
        		"                }\n" + 
        		"              ],\n" + 
        		"              \"step\": \"Cut a triangle out of the leaf, or fold over the leaf and cut out the stem that way. Or rip off the halves of the leaves off the stem. I like a little bit of stem to give some crunch and texture.Tightly roll the leaf into a bundle.Run your knife over it to julienne the leaf into thin strips.Don\\u0027t worry if it\\u0027s not perfect. Set aside the kale.In a big pot, sautee your onions, carrots and garlic in a bit of olive oil.Once the vegetables start to soften, add the potatoes and some crushed red pepper flakes. Stir the pot and cook the potatoes until the outer edges start turning clear.Then add the 6 cups of water and 2 bouillion packets (or 4 cups of broth and 2 cups of water) to the pot. Bring to a boil then let simmer until the potatoes are cooked.With a wooden spoon, mash the potatoes against the side of the pot. Do this until almost all the chunks of potatoes are mashed. Leave some chunks behind. This will give your soup a wonderful hearty texture.Now it\\u0027s time to add the Kale. It looks like a lot and will fill up your whole pot but not to worry because it wilts down pretty quickly.Cook for 5 minutes at a simmer then stir in chorizo sausage.\"\n" + 
        		"            },\n" + 
        		"            {\n" + 
        		"              \"number\": 6,\n" + 
        		"              \"ingredients\": [],\n" + 
        		"              \"equipment\": [],\n" + 
        		"              \"step\": \"Serve hot or at room temperature (the latter is my favorite). Eat with a nice crusty loaf of Portuguese bread. Enjoy!\"\n" + 
        		"            }\n" + 
        		"          ]\n" + 
        		"        }\n" + 
        		"      ],\n" + 
        		"      \"glutenFree\": true,\n" + 
        		"      \"veryPopular\": false,\n" + 
        		"      \"healthScore\": 100,\n" + 
        		"      \"title\": \"Caldo Verde - Portuguese Kale Soup\",\n" + 
        		"      \"diets\": [\n" + 
        		"        \"gluten free\",\n" + 
        		"        \"dairy free\",\n" + 
        		"        \"whole 30\"\n" + 
        		"      ],\n" + 
        		"      \"aggregateLikes\": 13,\n" + 
        		"      \"sourceUrl\": \"http://www.foodista.com/recipe/7SDK7CGK/caldo-verde-portuguese-kale-soup\",\n" + 
        		"      \"readyInMinutes\": 45,\n" + 
        		"      \"creditsText\": \"Foodista.com – The Cooking Encyclopedia Everyone Can Edit\",\n" + 
        		"      \"dairyFree\": true,\n" + 
        		"      \"servings\": 4,\n" + 
        		"      \"vegetarian\": false,\n" + 
        		"      \"whole30\": true,\n" + 
        		"      \"creditText\": \"Foodista.com – The Cooking Encyclopedia Everyone Can Edit\",\n" + 
        		"      \"id\": 636787,\n" + 
        		"      \"imageType\": \"jpg\",\n" + 
        		"      \"winePairing\": {\n" + 
        		"        \"productMatches\": [],\n" + 
        		"        \"pairingText\": \"\",\n" + 
        		"        \"pairedWines\": []\n" + 
        		"      },\n" + 
        		"      \"image\": \"https://spoonacular.com/recipeImages/636787-312x231.jpg\",\n" + 
        		"      \"veryHealthy\": true,\n" + 
        		"      \"vegan\": false,\n" + 
        		"      \"cheap\": false,\n" + 
        		"      \"dishTypes\": [\n" + 
        		"        \"soup\"\n" + 
        		"      ],\n" + 
        		"      \"gaps\": \"no\",\n" + 
        		"      \"cuisines\": [],\n" + 
        		"      \"lowFodmap\": false,\n" + 
        		"      \"license\": \"CC BY 3.0\",\n" + 
        		"      \"weightWatcherSmartPoints\": 11,\n" + 
        		"      \"occasions\": [\n" + 
        		"        \"fall\",\n" + 
        		"        \"winter\"\n" + 
        		"      ],\n" + 
        		"      \"spoonacularScore\": 98,\n" + 
        		"      \"pricePerServing\": 224.09,\n" + 
        		"      \"spoonacularSourceUrl\": \"https://spoonacular.com/caldo-verde-portuguese-kale-soup-636787\",\n" + 
        		"      \"sourceName\": \"Foodista\",\n" + 
        		"      \"ketogenic\": false\n" + 
        		"    },\n" + 
        		"    {\n" + 
        		"      \"sustainable\": false,\n" + 
        		"      \"analyzedInstructions\": [],\n" + 
        		"      \"glutenFree\": true,\n" + 
        		"      \"veryPopular\": false,\n" + 
        		"      \"healthScore\": 55,\n" + 
        		"      \"title\": \"Chilled Cucumber Avocado Soup with Yogurt and Kefir\",\n" + 
        		"      \"diets\": [\n" + 
        		"        \"gluten free\",\n" + 
        		"        \"lacto ovo vegetarian\",\n" + 
        		"        \"primal\"\n" + 
        		"      ],\n" + 
        		"      \"aggregateLikes\": 171,\n" + 
        		"      \"sourceUrl\": \"http://fullbellysisters.blogspot.com/2012/06/chilled-cucumber-avocado-soup-with.html\",\n" + 
        		"      \"readyInMinutes\": 45,\n" + 
        		"      \"creditsText\": \"Full Belly Sisters\",\n" + 
        		"      \"dairyFree\": false,\n" + 
        		"      \"servings\": 3,\n" + 
        		"      \"vegetarian\": true,\n" + 
        		"      \"whole30\": false,\n" + 
        		"      \"creditText\": \"Full Belly Sisters\",\n" + 
        		"      \"id\": 716437,\n" + 
        		"      \"imageType\": \"jpg\",\n" + 
        		"      \"winePairing\": {},\n" + 
        		"      \"image\": \"https://spoonacular.com/recipeImages/716437-312x231.jpg\",\n" + 
        		"      \"veryHealthy\": true,\n" + 
        		"      \"vegan\": false,\n" + 
        		"      \"cheap\": false,\n" + 
        		"      \"dishTypes\": [\n" + 
        		"        \"soup\"\n" + 
        		"      ],\n" + 
        		"      \"gaps\": \"no\",\n" + 
        		"      \"cuisines\": [],\n" + 
        		"      \"lowFodmap\": false,\n" + 
        		"      \"license\": \"CC BY-SA 3.0\",\n" + 
        		"      \"weightWatcherSmartPoints\": 3,\n" + 
        		"      \"occasions\": [\n" + 
        		"        \"fall\",\n" + 
        		"        \"winter\"\n" + 
        		"      ],\n" + 
        		"      \"spoonacularScore\": 97,\n" + 
        		"      \"pricePerServing\": 216.29,\n" + 
        		"      \"spoonacularSourceUrl\": \"https://spoonacular.com/chilled-cucumber-avocado-soup-with-yogurt-and-kefir-716437\",\n" + 
        		"      \"sourceName\": \"Full Belly Sisters\",\n" + 
        		"      \"ketogenic\": false\n" + 
        		"    }\n" + 
        		"  ]\n" + 
        		"}\n" + 
        		"" == rs.getRecipeData("soup", "3"));
	}

}
