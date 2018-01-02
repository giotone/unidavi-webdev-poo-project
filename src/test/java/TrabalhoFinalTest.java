/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TrabalhoFinal_Entrega_2.EquipeBasquete;
import TrabalhoFinal_Entrega_2.IniciaListaEquipe;
import TrabalhoFinal_Entrega_2.Jogador;
import TrabalhoFinal_Entrega_2.JogoBasquete;
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
     public void hello() {
     
     }
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
}
