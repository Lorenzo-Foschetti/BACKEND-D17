package lorenzofoschetti.u5d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lorenzofoschetti.u5d2.enums.StatoOrdine;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Ordine {

    private UUID id;

    private LocalDate orario;

    private int numeroCoperti;

    private StatoOrdine statoOrdine;

    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", orario=" + orario +
                ", numeroCoperti=" + numeroCoperti +
                ", statoOrdine=" + statoOrdine +
                '}';
    }
}