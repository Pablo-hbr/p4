package edu.comillas.icai.gitt.pat.spring.mvc.destino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoControler {

    @Autowired
    private DestinoRepository repository;

    @GetMapping
    public List<Destino> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Destino getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Destino create(@RequestBody Destino destino) {
        return repository.save(destino);
    }

    @PutMapping("/{id}")
    public Destino update(@PathVariable Long id, @RequestBody Destino updated) {
        return repository.findById(id).map(destino -> {
            destino.setNombre(updated.getNombre());
            destino.setPais(updated.getPais());
            destino.setDificultad(updated.getDificultad());
            destino.setMaxDepth(updated.getMaxDepth());
            return repository.save(destino);
        }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}