# unidavi-webdev-poo-project
Para utilizar o projeto é necessário acessar o arquivo `TrabalhoFinal.java` e manipular as execuções da classe `main`.

* Para listar todos os jogos já carregados na classe `IniciaListaEquipe`: `nba.listarJogos();`

* Para fazer o agendamento de um jogo deve ser utilizado o método `agendarJogo`  da classe `NBA`, 
passando como parâmetro as duas equipes e a data e hora do jogo: `nba.agendarJogo(celtics, magic, "10/11/2017 08:00");`

* Para listar os jogos por data deve ser utilizado o método `listarJogos` da classe `NBA`, passando como parâmetro a data 
de filtro para listar os jogos: `nba.listarJogos("05/11/2017");`

* Para reagendar um jogo deve ser utilizado o método `reagendarJogo` da classe `NBA`, passando como parâmetro o `Index` 
do jogo e a nova data e hora desejada. `nba.reagendarJogo(5, "18/11/2017 16:00");`
