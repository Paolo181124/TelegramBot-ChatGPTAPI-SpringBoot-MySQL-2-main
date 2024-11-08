package umg.TelegramBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.TelegramBot.entities.ErrorLog;

public interface ErrorLogRepository extends JpaRepository<ErrorLog, Long> {}
