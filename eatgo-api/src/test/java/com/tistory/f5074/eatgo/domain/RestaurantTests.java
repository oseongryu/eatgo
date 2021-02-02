package com.tistory.f5074.eatgo.domain;

import org.junit.jupiter.api.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;

public class RestaurantTests {
    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
//        assertThat(restaurant.getName(), is("Bob zip"));
//        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    public void information(){
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
//        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }

}