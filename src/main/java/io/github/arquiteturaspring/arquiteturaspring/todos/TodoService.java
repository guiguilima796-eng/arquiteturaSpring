package io.github.arquiteturaspring.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        return todoRepository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo) {
        this.todoRepository.save(todo);
    }

    public TodoEntity buscarPorId(Integer id) {
        return this.todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo não encontrado"));
    }

    public List<TodoEntity> buscarTodos() {
        return this.todoRepository.findAll();
    }
}
