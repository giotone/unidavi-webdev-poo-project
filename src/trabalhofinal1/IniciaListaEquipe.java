/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gt2a
 */
public class IniciaListaEquipe {
    
    private List<EquipeBasquete> equipe = new ArrayList<EquipeBasquete>();

    public List<EquipeBasquete> getEquipe() {
        return equipe;
    }
    
    public IniciaListaEquipe(){
        
        this.addJogadorEquipeUsandoLista();                
        this.addJogadorEquipeDireto();        
    }
    
    // método criado só para mostrar que é possivel utilizar o "addJogador" de duas maneiras
    private void addJogadorEquipeUsandoLista(){
        List<Jogador> listaJogador = new ArrayList<Jogador>();
    
        Jogador j1 = new Jogador("Al Horford", 42);
        Jogador j2 = new Jogador("Jaylen Brown", 7);
        Jogador j3 = new Jogador("Aron Baynes",46);
        Jogador j4 = new Jogador("Jayson Tatum",0);
        
        listaJogador.add(j1);
        listaJogador.add(j2);
        listaJogador.add(j3);
        listaJogador.add(j4);                
        
        EquipeBasquete celtics = new EquipeBasquete("Boston Celtics","2017-2018");
        celtics.setVitoria(10);
        celtics.setDerrota(2);
        celtics.addJogador(listaJogador);
        
        this.equipe.add(celtics);
    }
    
    private void addJogadorEquipeDireto(){
        
        EquipeBasquete hornets = new EquipeBasquete("Charlotte Hornets","2017-2018");
        hornets.setVitoria(0);
        hornets.setDerrota(0);
        hornets.addJogador(new Jogador("Malik Monk",1));
        hornets.addJogador(new Jogador("Kemba Walker",15));
        hornets.addJogador(new Jogador("Jeremy Lamb",3));
        hornets.addJogador(new Jogador("Cody Zeller",40));
        
        EquipeBasquete pistons = new EquipeBasquete("Detroit Pistons","2017-2018");
        pistons.setVitoria(0);
        pistons.setDerrota(0);
        pistons.addJogador(new Jogador("Tobias Harris",34));
        pistons.addJogador(new Jogador("Stanley Johnson",7));
        pistons.addJogador(new Jogador("Andre Drummond",0));
        pistons.addJogador(new Jogador("Ishmael Smith",14));
        
        EquipeBasquete magic = new EquipeBasquete("Orlando Magic","2017-2018");
        magic.setVitoria(0);
        magic.setDerrota(0);
        magic.addJogador(new Jogador("T.J. Warren",12));
        magic.addJogador(new Jogador("Alex Len",21));
        magic.addJogador(new Jogador("Devin Booker",1));
        magic.addJogador(new Jogador("Josh Jackson",20));
        
        this.equipe.add(hornets);
        this.equipe.add(pistons);
        this.equipe.add(magic);
    }
}

