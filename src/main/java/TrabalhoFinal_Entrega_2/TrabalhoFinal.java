package TrabalhoFinal_Entrega_2;


import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gt2a
 */
public class TrabalhoFinal {
    
    public static void main(String[] args){
        
        NBA nba = new NBA();
        
        EquipeBasquete celtics = nba.getEquipes().get(0);
        EquipeBasquete hornets = nba.getEquipes().get(1);
        EquipeBasquete pistons = nba.getEquipes().get(2);
        EquipeBasquete magic = nba.getEquipes().get(3);
        
        
        //lista todos os jogos ja carregados na classe IniciaListaEquipe
        nba.listarJogos();
        
        
        /*
        //Caso de uso 1 agenda novos jogos
        nba.agendarJogo(celtics, magic, "10/11/2017 08:00");
        nba.agendarJogo(pistons, hornets, "10/11/2017 14:00");
        */

        /*
        // listar todos os jogos
        nba.listarJogos();
        */

        /*
        //Caso de uso 2 listar jogos por data
        nba.listarJogos("05/11/2017");
        */

        /*
        //Caso de uso 3 reagendar um jogo
        nba.listarJogos(5);
        nba.reagendarJogo(5, "18/11/2017 16:00");
        nba.listarJogos(5);
        */
    }
    
}
