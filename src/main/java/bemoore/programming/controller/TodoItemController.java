package bemoore.programming.controller;

import bemoore.programming.model.TodoData;
import bemoore.programming.model.TodoItem;
import bemoore.programming.service.TodoItemService;
import bemoore.programming.util.AttributeName;
import bemoore.programming.util.Mappings;
import bemoore.programming.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Slf4j
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

    @GetMapping(Mappings.ADD_ITEM)
     public String addEditItem(@RequestParam(required = false,defaultValue = "-1") int id, Model model){
        TodoItem todoItem = todoItemService.getItem(id);
        if(todoItem ==  null) {
            todoItem = new TodoItem("","", LocalDate.now());
        }
        model.addAttribute(AttributeName.TODO_ITEM,todoItem );
        return ViewNames.ADD_ITEM;
     }


    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeName.TODO_ITEM) TodoItem item){
         log.info("Todo item = {}" , item);
         if(item.getId()==0) {
             todoItemService.addItem(item);
         }
         todoItemService.updateItem(item);
         return  "redirect:/" + Mappings.ITEMS;
    }
    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id){
        todoItemService.removeItem(id);
        return "redirect:/"+ Mappings.ITEMS;
    }

    @GetMapping(Mappings.VIEW_ITEM)
    public String viewItem(@RequestParam int id, Model model ){
       TodoItem todoItem =  todoItemService.getItem(id);
        model.addAttribute(AttributeName.TODO_ITEM,todoItem);
        return ViewNames.VIEW_ITEM;
    }

}
