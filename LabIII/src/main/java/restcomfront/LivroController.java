package restcomfront;

import meuprimeirorest.lab3.Livros;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private static final Logger log = LoggerFactory.getLogger(LivroController.class);
    private List<Livros> livrosList = new ArrayList<>();

    @PostMapping
    public Livros createLivro(@RequestBody Livros livro) {
        livrosList.add(livro);
        return livro;
    }

    @GetMapping
    public List<Livros> getAllLivros() {
        return livrosList;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livros> getLivroById(@PathVariable String id) {
        log.info("Get livro by id: {}", id);
        Optional<Livros> livro = livrosList.stream().filter(l -> l.getId().equals(id)).findFirst();
        if (livro.isPresent()) {
            return new ResponseEntity<>(livro.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livros> updateLivro(@PathVariable String id, @RequestBody Livros livroAtualizado) {
        for (Livros livro : livrosList) {
            if (livro.getId().equals(id)) {
                livro.setTitulo(livroAtualizado.getTitulo());
                livro.setAutor(livroAtualizado.getAutor());
                livro.setEditora(livroAtualizado.getEditora());
                livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
                return new ResponseEntity<>(livro, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLivro(@PathVariable String id) {
        boolean removed = livrosList.removeIf(l -> l.getId().equals(id));
        if (removed) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
