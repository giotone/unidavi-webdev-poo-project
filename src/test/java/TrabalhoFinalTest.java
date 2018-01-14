/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TrabalhoFinal_Entrega_2.EquipeBasquete;
import TrabalhoFinal_Entrega_2.IniciaListaEquipe;
import TrabalhoFinal_Entrega_2.Jogador;
import TrabalhoFinal_Entrega_2.JogoBasquete;
import TrabalhoFinal_Entrega_2.NBA;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gt2a
 */
public class TrabalhoFinalTest {
    
    public TrabalhoFinalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //     
     @Test
     public void testIniciaListaEquipe(){
         
        IniciaListaEquipe listaEquipe = new IniciaListaEquipe();
        List<EquipeBasquete> equipes;

        equipes = listaEquipe.getEquipe();         
        Assert.assertEquals(4, equipes.size());
     }
     
     @Test
     public void testAdicionaEquipe(){
         
        IniciaListaEquipe listaEquipe = new IniciaListaEquipe();
        List<EquipeBasquete> equipes;
         
        equipes = listaEquipe.getEquipe();

        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");
        bulls.setVitoria(0);
        bulls.setDerrota(0);
        bulls.addJogador(new Jogador("Lauri Markkanen",24));
        bulls.addJogador(new Jogador("Denzel Valentine",45));
        bulls.addJogador(new Jogador("Robin Lopez",42));
        bulls.addJogador(new Jogador("Justin Holiday",7));
        
        equipes.add(bulls);
         
        Assert.assertEquals(5, equipes.size());
     }
     
     @Test
     public void testGetNomeNumeroJogador(){
         
        Jogador jogador = new Jogador("Lauri Markkanen",24);
         
        Assert.assertEquals("Lauri Markkanen", jogador.getNome());
        Assert.assertEquals(24, jogador.getNumero());
     }
     
     @Test
     public void testGetNomeEquipe(){
         
        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");
         
        Assert.assertEquals("Chicago Bulls", bulls.getNome());        
     }
     
     @Test
     public void testGetTemporadaEquipe(){
         
        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");

        Assert.assertEquals("2017-2018", bulls.getTemporada());
     }
     
     @Test
     public void testVitoriaEquipe(){
         
        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");
        
        bulls.addVitoriaEquipe();
        bulls.addVitoriaEquipe();
        bulls.addVitoriaEquipe();
        
        Assert.assertEquals(3, bulls.getVitoria());
     }
     
     @Test
     public void testDerrotaEquipe(){
         
        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");
        
        bulls.addDerrotaEquipe();        
        
        Assert.assertEquals(1, bulls.getDerrota());
     }
     
     @Test
     public void testAddJogo(){
         
        JogoBasquete jogos = new JogoBasquete();
         
        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");
        bulls.setVitoria(0);
        bulls.setDerrota(0);
        bulls.addJogador(new Jogador("Lauri Markkanen",24));
        bulls.addJogador(new Jogador("Denzel Valentine",45));
        bulls.addJogador(new Jogador("Robin Lopez",42));
        bulls.addJogador(new Jogador("Justin Holiday",7));
        
        EquipeBasquete hornets = new EquipeBasquete("Charlotte Hornets","2017-2018");
        hornets.setVitoria(0);
        hornets.setDerrota(0);
        hornets.addJogador(new Jogador("Malik Monk",1));
        hornets.addJogador(new Jogador("Kemba Walker",15));
        hornets.addJogador(new Jogador("Jeremy Lamb",3));
        hornets.addJogador(new Jogador("Cody Zeller",40));
        
        jogos.addJogo(bulls, hornets);
        
        EquipeBasquete pistons = new EquipeBasquete("Detroit Pistons","2017-2018");
        pistons.setVitoria(0);
        pistons.setDerrota(0);
        pistons.addJogador(new Jogador("Tobias Harris",34));
        pistons.addJogador(new Jogador("Stanley Johnson",7));
        pistons.addJogador(new Jogador("Andre Drummond",0));
        pistons.addJogador(new Jogador("Ishmael Smith",14));
        
        jogos.addJogo(bulls, pistons,"18/11/2017 16:00");
        
        jogos.addJogo(2,bulls, pistons);
        
        Assert.assertEquals(3, jogos.getJogo().size());
        
     }
     
     @Test
     public void testBasquete(){
         
        JogoBasquete jogos = new JogoBasquete();
        
        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");
        bulls.setVitoria(0);
        bulls.setDerrota(0);
        bulls.addJogador(new Jogador("Lauri Markkanen",24));
        bulls.addJogador(new Jogador("Denzel Valentine",45));
        bulls.addJogador(new Jogador("Robin Lopez",42));
        bulls.addJogador(new Jogador("Justin Holiday",7));
        
        EquipeBasquete hornets = new EquipeBasquete("Charlotte Hornets","2017-2018");
        hornets.setVitoria(0);
        hornets.setDerrota(0);
        hornets.addJogador(new Jogador("Malik Monk",1));
        hornets.addJogador(new Jogador("Kemba Walker",15));
        hornets.addJogador(new Jogador("Jeremy Lamb",3));
        hornets.addJogador(new Jogador("Cody Zeller",40));
        
        jogos.addJogo(bulls, hornets);
        
        EquipeBasquete time1 = jogos.getJogo().get(0).getTime1();
        EquipeBasquete time2 = jogos.getJogo().get(0).getTime2();
        
        Assert.assertEquals("Chicago Bulls", time1.getNome());
        Assert.assertEquals("Charlotte Hornets", time2.getNome());
     }
     
     @Test
     public void testJogo() throws ParseException{
         
        JogoBasquete jogos = new JogoBasquete();
        
        EquipeBasquete bulls = new EquipeBasquete("Chicago Bulls","2017-2018");
        bulls.setVitoria(0);
        bulls.setDerrota(0);
        bulls.addJogador(new Jogador("Lauri Markkanen",24));
        bulls.addJogador(new Jogador("Denzel Valentine",45));
        bulls.addJogador(new Jogador("Robin Lopez",42));
        bulls.addJogador(new Jogador("Justin Holiday",7));
        
        EquipeBasquete hornets = new EquipeBasquete("Charlotte Hornets","2017-2018");
        hornets.setVitoria(0);
        hornets.setDerrota(0);
        hornets.addJogador(new Jogador("Malik Monk",1));
        hornets.addJogador(new Jogador("Kemba Walker",15));
        hornets.addJogador(new Jogador("Jeremy Lamb",3));
        hornets.addJogador(new Jogador("Cody Zeller",40));
        
        jogos.addJogo(bulls, hornets,"18/11/2017 16:00");
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data = formato.parse("18/11/2017 16:00");
        
        jogos.getJogo().get(0).setPontoTime1(98);
        jogos.getJogo().get(0).setPontoTime2(102);
        
        Assert.assertEquals(data, jogos.getJogo().get(0).getDataJogo());
        Assert.assertEquals("16:00", jogos.getJogo().get(0).getHoraJogo());
        
        Assert.assertEquals(98, jogos.getJogo().get(0).getPontoTime1());
        Assert.assertEquals(102, jogos.getJogo().get(0).getPontoTime2());
     }
     
     @Test
     public void testNBA(){
         
        NBA nba = new NBA();
        
        nba.listarJogos();
        nba.listarJogos(0);
        nba.listarJogos("05/11/2017");
        
        List<EquipeBasquete> equipes = nba.getEquipes();
                
        Assert.assertEquals(4, equipes.size());
        
     }
}
