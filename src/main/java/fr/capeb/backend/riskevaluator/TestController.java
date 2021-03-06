package fr.capeb.backend.riskevaluator;

import fr.capeb.backend.riskevaluator.model.Status;
import fr.capeb.backend.riskevaluator.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TestController {


    @Autowired
    public StatusRepository statusRepo;

    @GetMapping("api/status")
    public ResponseEntity<Object> getStatus() {

        final Optional<Status> status = statusRepo.findById((long) 1);
        if (status.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(status.get());
    }
}
