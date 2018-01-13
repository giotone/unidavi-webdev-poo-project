package TrabalhoFinal_Entrega_2;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gt2a
 */
public class Basquete extends Jogo{

    public EquipeBasquete getTime1() {
        return time1;
    }

    public void setTime1(EquipeBasquete time1) {
        this.time1 = time1;
    }

    public EquipeBasquete getTime2() {
        return time2;
    }

    public void setTime2(EquipeBasquete time2) {
        this.time2 = time2;
    }
    
    private EquipeBasquete time1;
    private EquipeBasquete time2;
    
    public Basquete(EquipeBasquete t1, EquipeBasquete t2){
        this.setTime1(t1);
        this.setTime2(t2);
    }
    
    @Override
    protected void Agendar(String dataHoraJogo){
        
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date data = formato.parse(dataHoraJogo);
            
            String[] horaJogo = dataHoraJogo.split(" ");
            
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
            Date hora = formatoHora.parse(horaJogo[1]);

            this.setDataJogo(data);
            this.setHoraJogo(formatoHora.format(hora));
        } catch (ParseException ex) {
            Logger.getLogger(Basquete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
