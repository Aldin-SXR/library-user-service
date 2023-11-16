package ba.edu.ibu.libraryuserservice.rest.feign;

import ba.edu.ibu.libraryuserservice.core.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("BOOK-MICROSERVICE")
public interface BookInterface {
    @RequestMapping(method = RequestMethod.GET, path = "/api/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String id);
}
