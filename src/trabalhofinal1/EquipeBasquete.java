package trabalhofinal1;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gt2a
 */
public class EquipeBasquete extends Equipe {
    
    public EquipeBasquete(String Nome, String Temporada){
        this.listaJogadores = new ArrayList<Jogador>();
        this.setNome(Nome);
        this.setTemporada(Temporada);
    }
    
    @Override
    public void addJogador(List<Jogador> jogadores){
        listaJogadores = jogadores;
    }
    
    @Override
    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }
       
}
