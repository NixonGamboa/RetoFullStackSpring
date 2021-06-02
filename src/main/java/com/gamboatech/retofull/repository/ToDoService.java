package com.gamboatech.retofull.repository;

import com.gamboatech.retofull.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoService {

    public List<ToDo> list();
    public ToDo save(ToDo toDo);
    public void delete(long id);
    public Optional<ToDo> get(long id);


}
