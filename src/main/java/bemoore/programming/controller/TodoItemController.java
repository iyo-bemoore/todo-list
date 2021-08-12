package bemoore.programming.controller;

import bemoore.programming.model.TodoData;
import bemoore.programming.model.TodoItem;
import bemoore.programming.service.TodoItemService;
import bemoore.programming.util.AttributeName;
import bemoore.programming.util.Mappings;
import bemoore.programming.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoItemController {
    private final TodoItemService todoItemService;

    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
       this.todoItemService = todoItemService;
    }

    @ModelAttribute
    public TodoData todoData(){
        return todoItemService.getData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeName.TODO_ITEM) TodoItem item){
         return  "redirect:/" + Mappings.ITEMS;
    }

}
