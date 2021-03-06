package pl.markowski.kinoteatr.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "rezerwacja")
public class Reservation {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "spektakl_id")
    private Spectacle spectacle;

    @ManyToOne
    @JoinColumn(name = "uzytkownik_id")
    private AppUser appUser;

    @OneToOne
    @JoinColumn(name = "bilet_id")
    private Ticket ticket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repertuar_id")
    private Repertoire repertoire;
}
