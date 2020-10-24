package com.learn.springBoot.roadmap.web.rest;


import com.learn.springBoot.roadmap.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExternalApiRessource {


    @Autowired
    private RestTemplate restTemplate;
    @Value("${spring.application.urlApi}")
    private String URL_API ;




    @RequestMapping(value="/todos" , method = RequestMethod.GET)
    public List<ItemDTO> getTodosList()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(URL_API, HttpMethod.GET, entity, List.class).getBody();

    }
}
