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
public abstract class Equipe {       

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getVitoria() {
        return Vitoria;
    }

    public void setVitoria(int Vitoria) {
        this.Vitoria = Vitoria;
    }

    public int getDerrota() {
        return Derrota;
    }

    public void setDerrota(int Derrota) {
        this.Derrota = Derrota;
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }
    
    private String Nome;
    private int Vitoria;
    private int Derrota;
    private String Temporada;
    protected List<Jogador> listaJogadores;
    
    public abstract void addJogador(List<Jogador> jogadores);
    public abstract void addJogador(Jogador jogador);
    
    public void addVitoria(){
        this.Vitoria++;
    }
    public void addDerrota(){
        this.Derrota++;
    }
}
