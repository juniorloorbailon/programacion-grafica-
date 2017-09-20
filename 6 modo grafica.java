paquete  ejercicio;

import  java.util.Stack ;
import  javax.swing.JOptionPane ;

Todos los derechos reservados
 *
 * @author junior loor
 * /
el  principal de la clase  pública extiende javax.swing . JFrame {  
Pila pila =  nueva  pila ();
    Todos los derechos reservados
     * Crea nueva forma principal
     * /
     principal público () {
        initComponents ();
    }
    private  void  jButton6ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        Sistema . salida ( 0 );
    }                                        

    private  void  jButton1ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        Pila . agregar ( TXTinsertar . getText () . toString ());
        TXTinsertar . setText ( " " );
        JOptionPane . showMessageDialog ( nulo , " ELEMENTO INSERTADO " );
    }                                        

    private  void  jButton5ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        TXTimprimirTodo . setText (pila . toString ());
    }                                        

    private  void  jButton2ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        
        si (pila . empty () ==  true ) {
           JOptionPane . showMessageDialog ( nulo , " LA COLA ESTA VACIA " );
        } else {
            TXTeliminar . setText (pila . pop () . toString ());
            JOptionPane . showMessageDialog ( nulo , " ELEMENTO ELIMINADO " );
        }
    }                                        

    private  void  jButton3ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        if (pila . contiene ( TXTbuscar . getText ())) {
            JOptionPane . showMessageDialog ( null , TXTbuscar . getText () +  " SI SE ENCUENTRA EN LA PILA " );
        } else {
            JOptionPane . showMessageDialog ( null , TXTbuscar . getText () +  " NO SE ENCUENTRA EN LA PILA " );
        }
    }                                        

    private  void  jButton4ActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        si (pila . empty () ==  true ) {
           JOptionPane . showMessageDialog ( nulo , " LA COLA ESTA VACIA " );
        } else {
            TXTimprimir . setText (pila . peek () . toString ());
        }
    } 