package com.jf.apps.spring5.webflux;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

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

    public Mono<Long> save(City city){
        return Mono.create(ct -> ct.success(System.currentTimeMillis()));
    }

    public Mono<City> findCityById(Long id){
        City ct = new City();
        ct.setName("find") ;
        return Mono.justOrEmpty(ct);
    }

    public Flux<City> findAllCity(){
        List<City> cs = new ArrayList<>();
        City ct = new City();
        ct.setName("zhangsan") ;
        cs.add(ct);

        City ct2 = new City();
        ct2.setName("李四") ;
        cs.add(ct2);

        return Flux.fromIterable(cs);
    }

    public Mono<Long> modifyCity(City city){
        return Mono.create(cityMonoSink -> cityMonoSink.success(System.currentTimeMillis()));
    }

    public Mono<Long> deleteCity(Long id){
        return Mono.create(cityMonoSink -> cityMonoSink.success(System.currentTimeMillis()));
    }

}
