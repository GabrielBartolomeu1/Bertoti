document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('livro-form');
    const livroList = document.getElementById('livros-list');
    const livroId = document.getElementById('livro-id');
    const titulo = document.getElementById('titulo');
    const autor = document.getElementById('autor');
    const editora = document.getElementById('editora');
    const anoPublicacao = document.getElementById('anoPublicacao');
    const submitBtn = document.getElementById('submit-btn');

    const API_URL = 'http://localhost:8080/livros';

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const livro = {
            titulo: titulo.value,
            autor: autor.value,
            editora: editora.value,
            anoPublicacao: parseInt(anoPublicacao.value)
        };

        if (livroId.value) {
            updateLivro(livroId.value, livro);
        } else {
            createLivro(livro);
        }
    });

    function createLivro(livro) {
        fetch(API_URL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(livro)
        })
            .then(response => response.json())
            .then(data => {
                addLivroToDOM(data);
                form.reset();
            })
            .catch(error => console.error('Error:', error));
    }

    function updateLivro(id, livro) {
        fetch(`${API_URL}/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(livro)
        })
            .then(response => response.json())
            .then(data => {
                document.getElementById(`livro-${id}`).remove();
                addLivroToDOM(data);
                form.reset();
                submitBtn.textContent = 'Adicionar Livro';
                livroId.value = '';
            })
            .catch(error => console.error('Error:', error));
    }

    function deleteLivro(id) {
        fetch(`${API_URL}/${id}`, {
            method: 'DELETE'
        })
            .then(() => {
                document.getElementById(`livro-${id}`).remove();
            })
            .catch(error => console.error('Error:', error));
    }

    function editLivro(livro) {
        livroId.value = livro.id;
        titulo.value = livro.titulo;
        autor.value = livro.autor;
        editora.value = livro.editora;
        anoPublicacao.value = livro.anoPublicacao;
        submitBtn.textContent = 'Atualizar Livro';
    }

    function addLivroToDOM(livro) {
        const li = document.createElement('li');
        li.id = `livro-${livro.id}`;
        li.innerHTML = `
            ${livro.titulo} - ${livro.autor}
            <button class="edit" onclick='editLivro(${JSON.stringify(livro)})'>Editar</button>
            <button class="delete" onclick='deleteLivro("${livro.id}")'>Deletar</button>
        `;
        livroList.appendChild(li);
    }

    function fetchLivros() {
        fetch(API_URL)
            .then(response => response.json())
            .then(data => {
                data.forEach(livro => addLivroToDOM(livro));
            })
            .catch(error => console.error('Error:', error));
    }

    fetchLivros();

    window.editLivro = editLivro;
    window.deleteLivro = deleteLivro;
});
