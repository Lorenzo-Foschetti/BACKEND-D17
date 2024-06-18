package lorenzofoschetti.u5d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lorenzofoschetti.u5d2.enums.StatoTavolo;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Tavolo {

    private UUID id;

    private int numeroMaxPartecipanti;

    private StatoTavolo statoTavolo;

    @Override
    public String toString() {
        return "Tavolo{" +
                "id=" + id +
                ", numeroMaxPartecipanti=" + numeroMaxPartecipanti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
