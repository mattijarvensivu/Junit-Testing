/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import fi.jamk.oo1k2014.HuijariNoppa;
import fi.jamk.oo1k2014.Noppa;
import junit.framework.Assert;

/**
 *
 * @author H4102
 */
public class Unittest1 {
    private Noppa noppa;
    private Noppa noppa2;
    private HuijariNoppa huijarinoppa;
    private HuijariNoppa huijarinoppa2;
    
    @Before
     public void setup(){
      noppa = new Noppa();
    noppa2 = new Noppa();
    huijarinoppa = new HuijariNoppa();
    huijarinoppa2 = new HuijariNoppa();
            
            }
            
 

    @Test
    public void NopanHeitto() {
        double tulos = noppa2.Heita();
  double high = 6.0;
  double low = 0;
  assertTrue("Value is too high", high >= tulos);
  assertTrue("Value is too low",  low  <= tulos);
       
        System.out.println("Noppatesti " + tulos);
    
    }
@Test
     public void Nopanheittojahaku() {
         
              
              noppa.Heita();
       Assert.assertEquals( 2 , noppa.getNopanheittoja());
        System.out.println("Heittoja" + noppa.getNopanheittoja());
     }
     @Test
     public void HuijariNopanheittojahaku() {
         
              huijarinoppa.Heita();
              huijarinoppa.Heita();
       Assert.assertEquals( 2 , huijarinoppa.getHuijariheittoja());
        System.out.println("Huijariheittoja" + huijarinoppa.getNopanheittoja());
     
     }
       @Test
  public void NoppaNotNull() {
    org.junit.Assert.assertNotNull("Should not be null", new Noppa());
  }

}
    

