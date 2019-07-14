package perso.spring.reactive.webapplogin.api;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
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

    @GetMapping(value = "/userinfo", produces = {"application/json"})
    public OAuth2User userinfo(OAuth2AuthenticationToken authentication) {
        return authentication.getPrincipal();
    }

}
