package lorenzofoschetti.u5d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Pizza {

    List<Topping> toppings;
    private String name;
    private double price;
    private int calories;


    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", calories=" + calories +
                '}';
    }
}
