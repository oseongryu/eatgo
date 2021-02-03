package com.tistory.f5074.eatgo.interfaces;

import com.tistory.f5074.eatgo.domain.Restaurant;
import com.tistory.f5074.eatgo.domain.RestaurantRepository;
import org.apache.catalina.util.ErrorPageSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    private RestaurantRepository repository = new RestaurantRepository();
    @GetMapping("/restaurants")
    public List<Restaurant> list(){
//        List<Restaurant> restaurants = new ArrayList<>();
//        restaurants.add(new Restaurant(1004L,"Bob zip", "Seoul"));
//        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
        
        
        List<Restaurant> restaurants = repository.findAll();

        return restaurants;
    }


//    @GetMapping("/restaurants")
//    public List<Restaurant> list(){
//        List<Restaurant> restaurants = new ArrayList<>();
//        restaurants.add(new Restaurant(1004L,"Bob zip", "Seoul"));
//        restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
//        return restaurants;
//    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        List<Restaurant> restaurants = repository.findAll();
        Restaurant restaurant = repository.findById(id);

        //1
//        Restaurant restaurant = null;
//        if(id == 1004L){
//            restaurant = new Restaurant(1004L,"Bob zip", "Seoul");
//        }
//
//        if(id == 2020L){
//            restaurant = new Restaurant(2020L,"Cyber Food", "Seoul");
//        }

        //2
//        Restaurant restaurant = restaurants.stream().filter(r-> r.getId().equals(id))
//                .findFirst()
//                .get();

        return restaurant;
    }

}
