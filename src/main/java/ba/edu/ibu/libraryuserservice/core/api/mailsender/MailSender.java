package ba.edu.ibu.libraryuserservice.core.api.mailsender;

import ba.edu.ibu.libraryuserservice.core.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MailSender {

    public String send(List<User> users, String message);
}
