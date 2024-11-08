package umg.TelegramBot.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ErrorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String errorType;
    private String message;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "chat_message_id")
    private ChatMessage chatMessage; // Asegúrate de que `ChatMessage` existe en tu proyecto o crea una versión mínima.


    public ErrorLog() {
        this.timestamp = LocalDateTime.now();
    }

    // los Gettters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public ChatMessage getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(ChatMessage chatMessage) {
        this.chatMessage = chatMessage;
    }
}
