package com.mysite.ml;

import com.mysite.ml.toDoSite.Item;
import com.mysite.ml.toDoSite.Priority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MySiteController {
  //  private ToDoListRepository toDoListRepository;
/*
    public MySiteController(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }
*/
    private List<Item> items;

    public MySiteController(){
        items = new ArrayList<>();
        items.add(new Item("Zadanie 1", "Opis zadania 1", Priority.LOW));
        items.add(new Item("Zadanie 2", "Opis zadania 2", Priority.HIGH));
        items.add(new Item("Zadanie 3", "Opis zadania 3", Priority.MODERATE));
    }

    //@ResponseBody
    @GetMapping("/")
    public String welcomeSite() {
        return "home";
    }

    @GetMapping("/calculator")
    public String calculatorSite() {
        return "calculator";
    }

    @GetMapping("/toDoList")
    public String toDoListSite(Model model) {
        model.addAttribute("item", new Item());
        model.addAttribute("items", items);
        return "toDoList";
    }

    @PostMapping("/toDoList/dodaj")
    public String add(Item item){
        items.add(item);
        return "redirect:/toDoList";
    }
/*
    @PostMapping("/dodaj")
    public String add(Items item){
        items.add(item);
        return "redirect:/";
    }
*/
}
//  return "redirect:/";6