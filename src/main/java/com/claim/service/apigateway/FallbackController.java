package com.claim.service.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/notifyClaimFallBack")
    public Mono<String> notifyClaimServiceFallBack() {
        return Mono.just("notify claim  Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/settlmentFallback")
    public Mono<String> settlmentServiceFallBack() {
        return Mono.just("settlment Service is taking too long to respond or is down. Please try again later");
    }
}