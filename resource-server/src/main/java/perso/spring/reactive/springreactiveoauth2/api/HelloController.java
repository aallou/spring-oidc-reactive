package perso.spring.reactive.springreactiveoauth2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/")
    public Mono<String> hello(Principal user) {
        return Mono.just("Hello " + user.getName());
    }
}
