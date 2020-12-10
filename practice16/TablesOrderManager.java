package practice16;

import java.util.Arrays;
import java.util.Collection;

public class TablesOrderManager {

    private final MyLinkedList<Item> data;

    public TablesOrderManager() {
        this.data = new MyLinkedList<>();
    }

    public TablesOrderManager(Collection<Item> collection) {
        this.data = new MyLinkedList<>(collection);
    }

    public boolean add(Item item) {
        return data.add(item);
    }

    public boolean remove(String name) {
        Item item = Arrays.stream(
                data.toArray())
                .filter(i -> i.getName().equals(name))
                .findFirst()
                .orElse(null);
        if (item == null)
            return false;
        return data.remove(item);
    }

    public int removeAll(String name) {
        return (int) Arrays.stream(
                data.toArray())
                .filter(i -> i.getName().equals(name))
                .map(data::remove)
                .count();
    }

    public int dishQuantity() {
        return data.getSize();
    }

    public Item[] getDishes() {
        return data.toArray();
    }

    public double costTotal() {
        return (int) Arrays.stream(
                data.toArray())
                .mapToDouble(Item::getCost)
                .sum();
    }

    public Object[] dishesNames() {
        return  Arrays.stream(
                data.toArray())
                .map(Item::getName)
                .toArray();
    }

    public Object[] sortedDishesByCostDesc() {
        return Arrays.stream(
                data.toArray())
                .sorted((dishn1, dishn2) -> (int) (dishn2.getCost() - dishn1.getCost()))
                .toArray();
    }
}