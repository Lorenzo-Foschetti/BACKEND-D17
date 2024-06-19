package lorenzofoschetti.u5d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lorenzofoschetti.u5d2.enums.StatoOrdine;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Ordine {

    private int numeroOrdine;

    private LocalDate orario;

    private int numeroCoperti;

    private StatoOrdine statoOrdine;

    private int coperto;

    private List<Pizza> pizze;

    private List<Drink> drinks;

    private double prezzoTotale;

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", orario=" + orario +
                ", numeroCoperti=" + numeroCoperti +
                ", statoOrdine=" + statoOrdine +
                ", coperto=" + coperto +
                ", pizze=" + pizze +
                ", drinks=" + drinks +
                ", prezzoTotale=" + prezzoTotale +
                '}';
    }

    //serve metodo per calcolare prezzo
}