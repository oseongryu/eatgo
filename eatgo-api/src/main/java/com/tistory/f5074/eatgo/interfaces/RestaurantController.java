package com.tistory.f5074.eatgo.interfaces;

import com.tistory.f5074.eatgo.application.RestaurantService;
import com.tistory.f5074.eatgo.domain.MenuItem;
import com.tistory.f5074.eatgo.domain.MenuItemRepository;
import com.tistory.f5074.eatgo.domain.Restaurant;
import com.tistory.f5074.eatgo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        Restaurant restaurant = restaurantService.getRestaurant(id);

        return restaurant;
    }
}
