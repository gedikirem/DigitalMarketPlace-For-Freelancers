package com.freelanciaApp.FreelanciaWorld.eventdriver;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {

    @EventListener
    public void handleUserCreatedEvent(UserCreatedEvent event) {
        System.out.println("New user created with ID: " + event.getUserId());
        // Örneğin, bir e-posta göndermek
        sendWelcomeEmail(event.getEmail());
    }

    private void sendWelcomeEmail(String email) {
        System.out.println("Welcome email sent to: " + email);
        // E-posta gönderme mantığı buraya eklenebilir
    }
}

