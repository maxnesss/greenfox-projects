package com.gfa.webshop.services;

import com.gfa.webshop.models.ShopItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class ShopItemService {
    private List<ShopItem> shopItemList = new ArrayList<>();

    public ShopItemService() {
        shopItemList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
        shopItemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
        shopItemList.add(new ShopItem("Coke", "0.5l standard coke", 25, 0));
        shopItemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        shopItemList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
    }

    public List<ShopItem> getAll() {
        return shopItemList;
    }

    public List<ShopItem> onlyAvailable() {
        List<ShopItem> onlyAvailable;
        onlyAvailable = shopItemList.stream()
                .filter(p -> p.getQuantityOfStock() > 0)
                .toList();
        return onlyAvailable;
    }

    public List<ShopItem> cheapestFirst() {
        List<ShopItem> cheapestFirst;
        cheapestFirst = shopItemList.stream()
                .sorted(Comparator.comparingInt(ShopItem::getPrice))
                .toList();
        return cheapestFirst;
    }

    public List<ShopItem> mostExpensive() {
        List<ShopItem> expensiveFirst;
        expensiveFirst = shopItemList.stream()
                .filter(p -> p.getQuantityOfStock() > 0)
                .sorted(Comparator.comparingInt(ShopItem::getPrice).reversed())
                .limit(1)
                .toList();
        return expensiveFirst;
    }

    public List<ShopItem> containsNike() {
        List<ShopItem> containsNike;
        containsNike = shopItemList.stream()
                .filter(p -> p.getDescription()
                        .toLowerCase()
                        .contains("nike"))
                .toList();
        return containsNike;
    }

    public Double avarageStock() {

        OptionalDouble num = shopItemList.stream()
                .map(ShopItem::getQuantityOfStock).mapToInt((x) -> x).average();

        return num.getAsDouble();
    }

    public List<ShopItem> search(String searchText) {
        List<ShopItem> searched;
        searched = shopItemList.stream().filter(p -> p.getName().toLowerCase().contains(searchText.toLowerCase()) || p.getDescription().toLowerCase().contains(searchText.toLowerCase())).toList();
        return searched;
    }


}
