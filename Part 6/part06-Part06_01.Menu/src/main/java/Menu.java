
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (int i = 0; i < meals.size(); i++){
            System.out.println(meals.get(i));
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
}
