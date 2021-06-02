package com.gamboatech.retofull.repository;

import com.gamboatech.retofull.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImplement implements ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public List<ToDo> list(){
        return (List<ToDo>) toDoRepository.findAll();
    }

    @Override
    public ToDo save(ToDo toDo){
        return  toDoRepository.save(toDo);
    }

    @Override
    public void delete(long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public Optional<ToDo> get(long id) {
        return toDoRepository.findById(id);
    }
}
