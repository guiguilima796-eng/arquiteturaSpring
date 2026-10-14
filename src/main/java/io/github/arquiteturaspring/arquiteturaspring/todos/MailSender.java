package io.github.arquiteturaspring.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviarEmail(String email) {
        System.out.println(email);
    }
}
