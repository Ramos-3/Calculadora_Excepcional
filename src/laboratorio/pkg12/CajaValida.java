/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg12;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author diego
 */
public class CajaValida {
    
    private JLabel lblError;
    private JTextField txtCaja;
    public CajaValida(JLabel lblError, JTextField txtCaja)
    {
        this.lblError = lblError;
        this.txtCaja = txtCaja;
    }
    
    public float getNumero(){
        lblError.setText("");
        String num2 = txtCaja.getText();
        
        try{
        return Float.parseFloat(num2);
        }catch(NumberFormatException ex){
            lblError.setText("Número inválido");
        }
            return 0;
         
    }
    public JLabel getLblError(){
        return lblError;
    }
    public void setLblError(JLabel lblError){
        this.lblError = lblError;
    }
     public JTextField getTxtCaja(){
        return txtCaja;
    }
     public void setTxtCaja(JTextField txtCaja){
       this.txtCaja = txtCaja;
    } 
}
