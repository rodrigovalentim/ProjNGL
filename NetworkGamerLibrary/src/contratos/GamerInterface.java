/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package contratos;

import javax.swing.JDesktopPane;

/**
 *
 * @author Rodrigo
 */
public interface GamerInterface {
    public void setModoServidor();
    public void inicializar(JDesktopPane desktopPane, int porta, String ip);
    public void comunicacao();
}
