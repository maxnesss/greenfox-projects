package com.gfa.webshop.controllers;

import com.gfa.webshop.services.ShopItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

    private ShopItemService shopItemService = new ShopItemService();


    @GetMapping("/webshop")
    public String index(Model model) {
        model.addAttribute("items", shopItemService.getAll());
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", shopItemService.onlyAvailable());
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("items", shopItemService.cheapestFirst());
        return "index";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("items", shopItemService.containsNike());
        return "index";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("items", shopItemService.mostExpensive());
        return "index";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("average", shopItemService.avarageStock());
        return "index";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam String search) {
        model.addAttribute("items", shopItemService.search(search));
        return "index";
    }

}
