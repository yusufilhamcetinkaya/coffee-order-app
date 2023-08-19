package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import service.CoffeeService;
import service.CoffeeServiceImpl;


public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeService coffeeService = new CoffeeServiceImpl(Arrays.asList(CoffeeType.values()));
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                CoffeeMenu menu = coffeeService.getCoffeeMenu();
                System.out.println("Kahve Menüsü:");
                for (int i = 0; i < menu.getCoffees().size(); i++) {
                    CoffeeType coffeeType = CoffeeType.values()[i];
                    System.out.println((i + 1) + ". " + coffeeType.getDisplayName() + " - " + coffeeType.getPrice() + " TL");
                }

                int choice;
                boolean invalidChoice = false;

                do {
                    if (invalidChoice) {
                        System.out.println("Hatalı bir seçim yaptınız. Lütfen 1-7 arası bir numara giriniz.");
                    }

                    System.out.print("Lütfen içmek istediğiniz kahvenin numarasını giriniz (1-7 arası): ");
                    choice = scanner.nextInt();

                    invalidChoice = (choice < 1 || choice > 7);
                } while (invalidChoice);

                CoffeeType selectedCoffeeType = CoffeeType.values()[choice - 1];
                System.out.println("Teşekkürler, kahveniz hazırlanıyor...");

                Recipe recipe = coffeeService.prepareCoffee(new Order(selectedCoffeeType));
                List<RecipeItem> items = recipe.getRecipeItems();
                int itemCount = items.size();
                
                StringBuilder description = new StringBuilder(recipe.getCoffeeType().getDisplayName() + " seçtiniz. Bu içeceğimiz ");
                for (int i = 0; i < itemCount - 1; i++) {
                    description.append(items.get(i).getAmount())
                               .append(" doz ")
                               .append(items.get(i).getIngredient())
                               .append(" ");
                }
                
                if (itemCount > 1) {
                    description.append("ve ");
                }
                
                description.append(items.get(itemCount - 1).getAmount())
                           .append(" doz ")
                           .append(items.get(itemCount - 1).getIngredient())
                           .append(" içermektedir. Afiyet Olsun.");
                
                System.out.println(description.toString());

                System.out.print("Başka bir şey almak ister misiniz? (Evet için 1, Hayır için 2): ");
                int continueChoice = scanner.nextInt();
                if (continueChoice == 2) {
                    System.out.println("İyi günler dileriz, güle güle...");
                    break;
                }
            } while (true);
        }
    }
}




