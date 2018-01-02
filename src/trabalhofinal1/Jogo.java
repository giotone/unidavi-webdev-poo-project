package trabalhofinal1;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gt2a
 */
public abstract class Jogo {    

    public Date getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(Date dataJogo) {
        this.dataJogo = dataJogo;
    }

    public Time getHoraJogo() {
        return horaJogo;
    }

    public void setHoraJogo(Time horaJogo) {
        this.horaJogo = horaJogo;
    }

    public int getPontoTime1() {
        return pontoTime1;
    }

    public void setPontoTime1(int pontoTime1) {
        this.pontoTime1 = pontoTime1;
    }

    public int getPontoTime2() {
        return pontoTime2;
    }

    public void setPontoTime2(int pontoTime2) {
        this.pontoTime2 = pontoTime2;
    }
    
    private Date dataJogo;
    private Time horaJogo;
    private int pontoTime1;
    private int pontoTime2;
    
    protected abstract void Agendar(String dataHoraJogo);
}
