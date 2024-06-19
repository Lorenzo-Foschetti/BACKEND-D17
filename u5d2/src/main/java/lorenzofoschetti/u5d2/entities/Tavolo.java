package lorenzofoschetti.u5d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lorenzofoschetti.u5d2.enums.StatoTavolo;

@Getter
@Setter
@AllArgsConstructor
public class Tavolo {

    private int numeroTavolo;

    private int numeroMaxPartecipanti;

    private StatoTavolo statoTavolo;

    @Override
    public String toString() {
        return "Tavolo{" +
                "numeroTavolo=" + numeroTavolo +
                ", numeroMaxPartecipanti=" + numeroMaxPartecipanti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
