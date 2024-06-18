package lorenzofoschetti.u5d2.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Drink {

    private String name;
    private Double price;
    private int calories;


    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", calories=" + calories +
                '}';
    }
}
