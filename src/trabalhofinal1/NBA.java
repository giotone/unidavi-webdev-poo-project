/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gt2a
 */
public class NBA {
    
    private JogoBasquete jogos = new JogoBasquete();
    private List<EquipeBasquete> equipes;

    public List<EquipeBasquete> getEquipes() {
        return equipes;
    }
    
    public NBA(){
        IniciaListaEquipe listaEquipe = new IniciaListaEquipe();
        this.equipes = listaEquipe.getEquipe();
        carregaJogos();
    }
    
    private void carregaJogos(){
        
        EquipeBasquete celtics = this.equipes.get(0);
        EquipeBasquete hornets = this.equipes.get(1);
        EquipeBasquete pistons = this.equipes.get(2);
        EquipeBasquete magic = this.equipes.get(3);
        
        jogos.addJogo(celtics,hornets);
        jogos.getJogo().get(0).Agendar("04/11/2017 16:00");
        
        jogos.addJogo(magic,pistons);
        jogos.getJogo().get(1).Agendar("04/11/2017 20:20");
        
        jogos.addJogo(magic,hornets);
        jogos.getJogo().get(2).Agendar("05/11/2017 18:10");
        
        jogos.addJogo(pistons,celtics);
        jogos.getJogo().get(3).Agendar("05/11/2017 22:20");
        
        jogos.addJogo(pistons,hornets);
        jogos.getJogo().get(4).Agendar("06/11/2017 08:00");
        
        jogos.addJogo(magic,celtics);
        jogos.getJogo().get(5).Agendar("06/11/2017 10:30");
    }
    
    public void agendarJogo(EquipeBasquete time1, EquipeBasquete time2, String dataHora){
        jogos.addJogo(time1,time2,dataHora);
    }
    
    public void reagendarJogo(int index, String dataHora){
        jogos.getJogo().get(index).Agendar(dataHora);
    }
    
    public void listarJogos(String data){
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        for (int i=0; i < jogos.getJogo().size(); i++){
            String dataJogo = formatoData.format(jogos.getJogo().get(i).getDataJogo());
            String dataHoraJogo = formato.format(jogos.getJogo().get(i).getDataJogo());
            EquipeBasquete time1 = jogos.getJogo().get(i).getTime1();
            EquipeBasquete time2 = jogos.getJogo().get(i).getTime2();
            if ( data.equals(dataJogo)){
                System.out.println("Index: "+ i);
                System.out.println("Data: "+ dataHoraJogo);
                System.out.println("Jogo: " + time1.getNome() + " x " + time2.getNome());
                System.out.println("");
            }
        }
        
        System.out.println("--------------------");
        System.out.println("");
    }
    
    public void listarJogos(){
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        for (int i=0; i < jogos.getJogo().size(); i++){
            
            String dataHoraJogo = formato.format(jogos.getJogo().get(i).getDataJogo());
            EquipeBasquete time1 = jogos.getJogo().get(i).getTime1();
            EquipeBasquete time2 = jogos.getJogo().get(i).getTime2();
            
            System.out.println("Index: "+ i);
            System.out.println("Data: "+ dataHoraJogo);
            System.out.println("Jogo: " + time1.getNome() + " x " + time2.getNome());
            System.out.println("");
            
        }
        
        System.out.println("--------------------");
        System.out.println("");
    }
    
    public void listarJogos(int index){
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            
        String dataHoraJogo = formato.format(jogos.getJogo().get(index).getDataJogo());
        EquipeBasquete time1 = jogos.getJogo().get(index).getTime1();
        EquipeBasquete time2 = jogos.getJogo().get(index).getTime2();

        System.out.println("Index: "+ index);
        System.out.println("Data: "+ dataHoraJogo);
        System.out.println("Jogo: " + time1.getNome() + " x " + time2.getNome());
        System.out.println("");     
        
        System.out.println("--------------------");
        System.out.println("");
    }
}
