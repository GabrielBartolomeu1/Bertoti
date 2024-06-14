package restcomfront;

import meuprimeirorest.lab3.Livros;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

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
    public Optional<Livros> getLivroById(@PathVariable String id) {
        return livrosList.stream().filter(l -> l.getId().equals(id)).findFirst();
    }

    @PutMapping("/{id}")
    public Livros updateLivro(@PathVariable String id, @RequestBody Livros livroAtualizado) {
        for (Livros livro : livrosList) {
            if (livro.getId().equals(id)) {
                livro.setTitulo(livroAtualizado.getTitulo());
                livro.setAutor(livroAtualizado.getAutor());
                livro.setEditora(livroAtualizado.getEditora());
                livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
                return livro;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable String id) {
        livrosList.removeIf(l -> l.getId().equals(id));
    }
}



