/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author romainchigar
 */
public class WrongServerPortException extends Exception {
    
    private int portCode;
    
    public WrongServerPortException(int portCode) {
        this.portCode = portCode;
    }
    
    @Override
    public String getMessage() {
        return "Wrong Server Port Exception : "+ this.portCode;
    }
}
