package bemoore.programming.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    // Fields //
    private static int idValue = 1;
    public List<TodoItem> items = new ArrayList<>();

    // Constructor //
    public TodoData() {
        addItem(new TodoItem("First Item", "This is the first detail for the Todo", LocalDate.now()));
        addItem(new TodoItem("Second Item", "This is the Second detail for the Todo", LocalDate.now()));
        addItem(new TodoItem("Third Item", "This is the Third for the Todo", LocalDate.now()));
        addItem(new TodoItem("Forth Item", "This is the Forth detail for the Todo", LocalDate.now()));
        addItem(new TodoItem("Fifth Item", "This is the Fifth detail for the Todo", LocalDate.now()));
    }

    public List<TodoItem> getItems(){
        return Collections.unmodifiableList(items); // this prevents other classes from altering the content of the items array
                                                    // Only the Todo class is responsible of initiating CRUD operations.
    }
    public void addItem(@NonNull TodoItem item){
        item.setId(idValue);
        items.add(item);
        idValue++;
    }

    public void removeItem(int id){
        ListIterator<TodoItem> itemListIterator = items.listIterator();
        while(itemListIterator.hasNext()){
            TodoItem item = itemListIterator.next();
            if(item.getId() == id){
                itemListIterator.remove();
                break;
            }
        }
    }

    public  TodoItem  getItem(int id){
         for(TodoItem item : items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem item){
        ListIterator<TodoItem> itemListIterator = items.listIterator();
        while (itemListIterator.hasNext()){
            TodoItem toUpdateItem = itemListIterator.next();
            if(toUpdateItem.equals(item)){
                itemListIterator.set(item);
               break;
            }
        }
    }


}
