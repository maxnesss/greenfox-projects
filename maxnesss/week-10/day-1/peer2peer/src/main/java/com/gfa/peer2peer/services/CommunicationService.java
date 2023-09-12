package com.gfa.peer2peer.services;

import com.gfa.peer2peer.models.Input;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
@Service
public class CommunicationService {
    WebClient webClient = WebClient.builder().build();

    public void sendMessage(Input input){
                webClient
                .post()
                .uri("http://192.168.1.160:8080/api/message/receive")
                .bodyValue(input)
                .retrieve()
                .bodyToMono(String.class)
                .block();


//        webClient
//                .post()
//                .uri("http://192.168.1.184:8080/api/message/receive")
//                .bodyValue(input)
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//211 mirek
//
        //tomas
//                webClient
//                .post()
//                .uri("http://192.168.1.196:8080/api/message/receive")
//                .bodyValue(input)
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();





//petr
//                webClient
//                .post()
//                .uri("http://192.168.1.154:8080/api/message/receive")
//                .bodyValue(input)
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();

    }

}
