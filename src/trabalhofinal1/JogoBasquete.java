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
public class JogoBasquete {
    
    public List<Basquete> getJogo() {
        return listaJogos;
    }
    
    private List<Basquete> listaJogos = new ArrayList<Basquete>();
       
    public void addJogo(int Index, EquipeBasquete time1, EquipeBasquete time2){
        this.listaJogos.add(Index, new Basquete(time1,time2));
    }
    
    public void addJogo(EquipeBasquete time1, EquipeBasquete time2){
        this.listaJogos.add(new Basquete(time1,time2));
    }
    
    public void addJogo(EquipeBasquete time1, EquipeBasquete time2, String dataHora){
        Basquete jogo = new Basquete(time1,time2);
        jogo.Agendar(dataHora);
        this.listaJogos.add(jogo);
    }
}
