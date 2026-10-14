package io.github.arquiteturaspring.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private TodoValidator todoValidator;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository,TodoValidator todoValidator, MailSender mailSender) {
        this.todoValidator = todoValidator;
        this.mailSender = mailSender;
        this.todoRepository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        try {
            this.todoValidator.validar(novoTodo);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return todoRepository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo) {
        this.todoRepository.save(todo);
        String status = todo.getConcluido() ? "concluído" : "não concluído";
        mailSender.enviarEmail("Todo " + todo.getDescricao() + " foi atualizado, o status: " + status);
    }

    public TodoEntity buscarPorId(Integer id) {
        return this.todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo não encontrado"));
    }

    public List<TodoEntity> buscarTodos() {
        return this.todoRepository.findAll();
    }
}
