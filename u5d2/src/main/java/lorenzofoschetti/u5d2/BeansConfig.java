package lorenzofoschetti.u5d2;

import lorenzofoschetti.u5d2.entities.*;
import lorenzofoschetti.u5d2.enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {


    @Bean
    public Topping pomodoro() {
        return new Topping("Pomodoro", 0.8, 40);
    }


    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 1.2, 80);
    }

    @Bean
    public Topping salamePiccante() {
        return new Topping("Salame Piccante", 1.1, 100);
    }

    @Bean
    public Pizza Margherita() {
        return new Pizza(Arrays.asList(pomodoro(), mozzarella()), "Margherita", 6.5, 300);
    }


    @Bean
    public Pizza Diavola() {
        return new Pizza(Arrays.asList(pomodoro(), mozzarella(), salamePiccante()), "Diavola", 7.5, 350);
    }

    @Bean
    public Drink Cocacola() {
        return new Drink("Cocacola", 1.8, 250);
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(Margherita());
        pizze.add(Diavola());
        List<Topping> toppings = new ArrayList<>();
        toppings.add(mozzarella());
        toppings.add(pomodoro());
        toppings.add(salamePiccante());
        List<Drink> drinks = new ArrayList<>();
        drinks.add(Cocacola());
        return new Menu(pizze, toppings, drinks);
    }

    @Bean
    public Ordine order(@Value("${coperto.prezzo}") int coperto) {
        List<Pizza> pizzeOrdinate = new ArrayList<>();
        pizzeOrdinate.add(Diavola());
        List<Drink> drinkOrdinati = new ArrayList<>();
        drinkOrdinati.add(Cocacola());
        return new Ordine(1, LocalDate.now(), 7, StatoOrdine.INCORSO, coperto, pizzeOrdinate, drinkOrdinati, 50);
    }
}

