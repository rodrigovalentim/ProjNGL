/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import contratos.GamerInterface;
import javax.swing.JDesktopPane;
import model.ModeGamer;

/**
 *
 * @author Rodrigo
 */
public class Cliente extends ModeGamer implements GamerInterface {

    public void setModoServidor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void inicializar(JDesktopPane desktopPane, int porta, String ip) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void comunicacao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
