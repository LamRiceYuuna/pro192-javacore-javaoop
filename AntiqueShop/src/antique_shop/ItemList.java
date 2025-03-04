package antique_shop;

public class ItemList {

    Item list[];
    int numOfItem;
    final int MAX = 100;
    private int i;

    public ItemList() {
        list = new Item[MAX];
        numOfItem = 0;
    }

    public boolean addItem(Item newItem) {
        if (newItem == null || numOfItem >= MAX) {
            return false;
        }
        list[numOfItem] = newItem;
        numOfItem++;
        return true;

    }

    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("The list is empty");
        }
        for (int i = 0; i < numOfItem; i++) {
            System.out.println(list[i]);

        }
    }

    public Item findItem(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return list[i];
            }
        }
        return null;

    }

    public int findItemIndex(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;

    }

    public boolean updateItem(int index) {
        if (index >= 0 && index <= numOfItem) {

            list[i].input();
            return true;
        }
        return false;
    }

    public boolean removeItem(int index) {
        if (index >= 0 && index <= numOfItem) {
            for (int j = index; j < numOfItem; j++) {
                list[j] = list[j + 1];
            }
            numOfItem--;
            return true;
        }
        return false;

    }

    public void displayItemByType(String type) {
        if (type.equals("Vase")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Vase) {
                    System.out.println("List Vase item:");
                    System.out.println(list[i]);
                }
            }

        } else if (type.equals("Statue")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Statue) {
                    System.out.println("List Statue item:");
                    System.out.println(list[i]);
                }
            }
        } else {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Painting) {
                    System.out.println("List paiting item:");
                    System.out.println(list[i]);
                }
            }
        }
    }

    public void sortItem() {
        for (int i = 0; i < numOfItem -1; i++) {
            for (int j = i + 1; j < numOfItem; j++) {
                if (list[i].getValue() > list[j].getValue()) {
                    Item tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }

            }

        }
    }
}
