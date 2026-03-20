import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;










public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		String [] fastfood = {"Mcdonalds", "Jack in the Box", "Wendys", "Sonic", "Burger King", "Popeyes", "Chick fil a", "Canes", "Jason's Deli", "KFC", "Domino's", "DQ",};
		String [] dinein = {"Olive Garden", "Applebees", "Chili's", "Cheddars", "Red Lobster", "Saltgrass", "Texas RoadHouse", "Chuy's", "Pappadeaux's", "KBBQ", "Adriatic Cafe",};
		String [] eatathome = {"Pasta", "Taco's", "Soup", "Chinese Food", "Mexican Food", "Enchiladas", "Quesadillas", "Chicken", "Porkchops", "Steak"};
		String[][] categories = {eatathome, dinein, fastfood};
		String[] categoryNames = {"Eat at home", "Dine In", "Fast Food"};
		
		Label label = new Label("What should I eat today?");
		Button button = new Button("Let Fate Decide..");
		
		button.setOnAction(e -> {
			Random rand = new Random();
			int catIndex = rand.nextInt(categories.length);
			String[] chosenCategory = categories[catIndex];
			int itemIndex = rand.nextInt(chosenCategory.length);
			String chosenfood = chosenCategory[itemIndex];
			String chosenCategoryName = categoryNames[catIndex];
			
			label.setText("Try " + chosenfood + " (" + chosenCategoryName + ")");
			
			
			
		
		});
		
		VBox layout = new VBox(100, label, button);
		Scene scene = new Scene(layout, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Dinner Picker");
		primaryStage.show();
	}
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	
	
	
	

	
		
		
		
		
	
	
	
	
	
	public static void main(String[] args) {
		launch();
		
		// TODO Auto-generated method stub

		
	
	}

}
