package io.github.arquiteturaspring.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void validar(TodoEntity todo) {
        if(todoRepository.existsByDescricao(todo.getDescricao())) {
            throw new RuntimeException("Todo com a mesma descrição já existe");
        }
    }
}
