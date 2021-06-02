package com.gamboatech.retofull;

import com.gamboatech.retofull.repository.ToDoService;
import com.gamboatech.retofull.repository.ToDoServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.desktop.OpenFilesEvent;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;



    @GetMapping()
    public List<ToDo> list() {
         return toDoService.list();
    }
    @GetMapping("/{id}")
    public Optional<ToDo> get(@PathVariable("id") long id){
        return toDoService.get(id);
    }
    @PostMapping(value = "/save")
    public ToDo save(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id){
        toDoService.delete(id);
    }
}
