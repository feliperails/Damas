/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.EnumMap;

/**
 *
 * @author jessica.rodrigues
 */
public class Tabuleiro {
    private IPeca[][] pecas;
    private EnumMap<ECor, Integer> pecasRemovidas = new EnumMap<ECor, Integer>(ECor.class);

    public Tabuleiro() {
        //preencher matriz de pecas
        //preencher pecasRemovidas
    }

    public IPeca[][] getPecas() {
        return pecas;
    }

    public Integer getPecasRemovidas(ECor cor) {        
        return pecasRemovidas.get(cor);
    }
    
    public void validarMovimento() {
    }
    
    public void mover() {        
    }
    
    public void remover() {
    }
    
    public void getProximoJogador() {
    }
    
    public void setProximoJogador() {

    }
}