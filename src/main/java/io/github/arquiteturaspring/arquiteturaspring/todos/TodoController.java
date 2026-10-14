package io.github.arquiteturaspring.arquiteturaspring.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity novoTodo) {

        try {
            return this.todoService.salvar(novoTodo);
        } catch (IllegalArgumentException e) {
            var errorMessage = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, errorMessage);
        }
    }

    @PutMapping("/{id}")
    public TodoEntity atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        this.todoService.atualizarStatus(todo);
        return todo;
    }

    @GetMapping("/{id}")
    public TodoEntity buscarPorId(@PathVariable("id") Integer id) {
        return this.todoService.buscarPorId(id);
    }

    @GetMapping
    public java.util.List<TodoEntity> buscarTodos() {
        return this.todoService.buscarTodos();
    }

}
