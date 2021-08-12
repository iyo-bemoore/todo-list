package bemoore.programming.service;

import bemoore.programming.model.TodoData;
import bemoore.programming.model.TodoItem;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService  {
 public final TodoData todoData = new TodoData();

    @Override
    public void addItem(TodoItem item) {
       todoData.addItem(item);
    }
    @Override
    public void removeItem(int id) {
       todoData.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoData.getItem(id) ;
    }
    @Override
    public void updateItem(TodoItem item) {
       todoData.updateItem(item);
    }
    @Override
    public TodoData getData() {
        return todoData ;
    }
}
