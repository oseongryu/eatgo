package com.tistory.f5074.eatgo.application;

import com.tistory.f5074.eatgo.domain.MenuItem;
import com.tistory.f5074.eatgo.domain.MenuItemRepository;
import com.tistory.f5074.eatgo.domain.Restaurant;
import com.tistory.f5074.eatgo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    MenuItemRepository menuItemRepository;

    public RestaurantService(RestaurantRepository restaurantRepository, MenuItemRepository menuItemRepository){
        this.restaurantRepository = restaurantRepository;
        this.menuItemRepository = menuItemRepository;
    }

    public List<Restaurant> getRestaurants(){
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
    }

    public Restaurant getRestaurant(Long id){

        Restaurant restaurant =  restaurantRepository.findById(id);
        List<MenuItem> menuItems = menuItemRepository.findAllByRestaurantId(id);
        restaurant.setMenuItems(menuItems);
        restaurant.addMenuItem(new MenuItem("Kimchi"));

        return restaurant;

    }
}
