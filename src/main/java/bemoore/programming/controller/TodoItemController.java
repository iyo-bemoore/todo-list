package bemoore.programming.controller;

import bemoore.programming.model.TodoData;
import bemoore.programming.util.Mappings;
import bemoore.programming.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS;
    }

}
