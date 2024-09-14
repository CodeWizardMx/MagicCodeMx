package org.codewizard.controller;

import org.codewizard.entity.LibroEntity;
import org.codewizard.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping
    public List<LibroEntity> getLibros() {
        return libroRepository.findAll();
    }

    @PostMapping
    public LibroEntity createLibro(@RequestBody LibroEntity libro) {
        return (LibroEntity) libroRepository.save(libro);
    }

    @PutMapping("/{id}")
    public LibroEntity updateLibro(@PathVariable Long id, @RequestBody LibroEntity libroDetalles) {
        LibroEntity libro = (LibroEntity) libroRepository.findById(id).orElseThrow();
        libro.setTitulo(libroDetalles.getTitulo());
        libro.setAutor(libroDetalles.getAutor());
        return (LibroEntity) libroRepository.save(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id) {
        libroRepository.deleteById(id);
    }
}
