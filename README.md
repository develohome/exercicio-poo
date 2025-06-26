Parte 1: Criação de Classes e Objetos

1. Fácil: Crie uma classe Livro com os seguintes atributos:
● titulo (String)
● autor (String)
● anoPublicacao (int)

2. Médio: Adicione métodos na classe Livro:
● Um método exibirDetalhes() que imprime os detalhes do livro.

3. Difícil: Crie uma classe Biblioteca que armazena uma lista de livros e possui 
métodos para adicionar e listar os livros.

● Use um ArrayList<Livro> para armazenar os livros.
● Método adicionarLivro(Livro livro) para adicionar um livro à 
biblioteca.
● Método listarLivros() para listar todos os livros da biblioteca.

-----------------------------------------------------------------------------------
Exercício 2: Encapsulamento e Métodos

Parte 2: Encapsulamento

1. Fácil: Modifique a classe Livro para que seus atributos sejam privados e 
forneça métodos getter e setter para cada um deles.

2. Médio: Adicione validação nos setters, por exemplo, anoPublicacao não pode
ser negativo.

3. Difícil: Na classe Biblioteca, crie um método 
buscarLivroPorTitulo(String titulo) que retorna o livro com o título 
especificado.

-----------------------------------------------------------------------------------
Exercício 3: Herança e Polimorfismo

Parte 3: Herança

1. Fácil: Crie uma classe Revista que herda da classe Livro e adicione um 
atributo edicao (int).

2. Médio: Sobrescreva o método exibirDetalhes() na classe Revista para 
incluir a edição da revista.

3. Difícil: Modifique a classe Biblioteca para que ela possa armazenar tanto 
livros quanto revistas. Utilize polimorfismo para listar os detalhes de cada item 
corretamente.

-----------------------------------------------------------------------------------
Exercício 4: Interfaces e Classes Abstratas

Parte 4: Interfaces e Classes Abstratas

1. Fácil: Crie uma interface ItemBiblioteca com o método 
exibirDetalhes().

2. Médio: Faça com que Livro e Revista implementem a interface 
ItemBiblioteca.

3. Difícil: Crie uma classe abstrata Item que implemente ItemBiblioteca e faça
com que Livro e Revista herdem de Item. Adicione um método abstrato 
getTipo() na classe Item que retorna o tipo de item (livro ou revista).
