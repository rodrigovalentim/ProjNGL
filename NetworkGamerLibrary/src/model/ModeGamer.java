/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Rodrigo
 */
public class ModeGamer extends Thread {

    private int porta;
    private String ip;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private Socket conexao;
    private ServerSocket servidor;

    /**
     * @return the porta
     */
    public int getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(int porta) {
        this.porta = porta;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the input
     */
    public ObjectInputStream getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(ObjectInputStream input) {
        this.input = input;
    }

    /**
     * @return the output
     */
    public ObjectOutputStream getOutput() {
        return output;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }

    /**
     * @return the conexao
     */
    public Socket getConexao() {
        return conexao;
    }

    /**
     * @param conexao the conexao to set
     */
    public void setConexao(Socket conexao) {
        this.conexao = conexao;
    }

    /**
     * @return the servidor
     */
    public ServerSocket getServidor() {
        return servidor;
    }

    /**
     * @param servidor the servidor to set
     */
    public void setServidor(ServerSocket servidor) {
        this.servidor = servidor;
    }
}
