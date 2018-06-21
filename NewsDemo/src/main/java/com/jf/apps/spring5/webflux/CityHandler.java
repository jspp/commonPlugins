package com.jf.apps.spring5.webflux;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * sun
 * 2018/6/20
 * 15:07
 */
@Component
public class CityHandler {

    /**
     * 处理实际的请求
     * @param request
     * @return
     */
    public Mono<ServerResponse> helloCity(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, City!"));
    }

}
