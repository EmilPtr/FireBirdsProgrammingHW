/*
 * U1_L3 Grocery.java
 * Created by Emil on 2025-07-14
 * This program simulates a grocery store inventory system.
 * It manages different types of items (fruits, vegetables, dairy, meat) and tracks their stock.
 * Each week, items are sold randomly, and the earnings are calculated.
 * The program restocks items at the beginning of each week.
 */

package U1_L3;

import java.util.ArrayList;

public class Grocery {
    final static int QUOTA = 50;
    final static int WEEKS_RUN = 50;
    public static void main(String[] args) {
        Item.restock();
        for (int i = 0; i < WEEKS_RUN; i++) {
            // Each week
            int earnings = Item.passWeek();
            System.out.println("This week's earnings are: " + earnings);
            System.out.println("Current stock of fruits: " + Item.countItems(ItemType.FRUIT));
            System.out.println("Current stock of vegetables: " + Item.countItems(ItemType.VEGETABLE));
            System.out.println("Current stock of dairy: " + Item.countItems(ItemType.DAIRY));
            System.out.println("Current stock of meat: " + Item.countItems(ItemType.MEAT));
            Item.restock();
        }
    }
}

class Item {
    final static int FRUIT_PRICE = 40;
    final static int VEGETABLE_PRICE = 30;
    final static int DAIRY_PRICE = 50;
    final static int MEAT_PRICE = 600;

    ItemType type;
    double price;
    static ArrayList<Item> items = new ArrayList<>();

    public Item(ItemType type, double price) {
        this.type = type;
        this.price = price;
    }

    public static int countItems(ItemType type) {
        int count = 0;
        for (Item item : items) {
            if (item.type == type) {
                count++;
            }
        }
        return count;
    }

    public static void restock() {
        items.clear();
        for (int i = 0; i < Grocery.QUOTA; i++) {
            items.add(new Item(ItemType.FRUIT, FRUIT_PRICE));
            items.add(new Item(ItemType.VEGETABLE, VEGETABLE_PRICE));
            items.add(new Item(ItemType.DAIRY, DAIRY_PRICE));
            items.add(new Item(ItemType.MEAT, MEAT_PRICE));
        }
    }

    public static int passWeek() {
        int earnings = 0;
        for (int i = 0; i < items.size(); i++) {
            int chance = (int) (Math.random() * 4);
            if (chance == 1) {
                earnings += items.get(i).price;
                items.remove(i);
            }
        }
        return earnings;
    }
}

enum ItemType {
    FRUIT, VEGETABLE, DAIRY, MEAT
}