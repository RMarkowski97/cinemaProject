package pl.markowski.kinoteatr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import pl.markowski.kinoteatr.model.Spectacle;
import pl.markowski.kinoteatr.repo.SpectacleRepo;

import java.util.Optional;

public class SpectacleService {

    private SpectacleRepo spectacleRepo;

    @Autowired
    public SpectacleService(SpectacleRepo spectacleRepo) {
        this.spectacleRepo = spectacleRepo;
    }

    public Iterable<Spectacle> findAll() {
        return spectacleRepo.findAll();
    }

    public Optional<Spectacle> findById(Long id) {
        return spectacleRepo.findById(id);
    }

    public Spectacle save(Spectacle spectacle) {
        return spectacleRepo.save(spectacle);
    }

    public void deleteById(Long id) {
        spectacleRepo.deleteById(id);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDb() {
//        save(new Spectacle("teatr 4","Ga Eso",127,7));
//        save(new Spectacle("pteatr","MoaW",96,12));
//    }
}
