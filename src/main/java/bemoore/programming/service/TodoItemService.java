package bemoore.programming.service;

import bemoore.programming.model.TodoData;
import bemoore.programming.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem item);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem item);
    TodoData getData();
}
