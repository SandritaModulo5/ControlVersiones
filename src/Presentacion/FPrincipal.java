/*
 * FPrincipal.java
 *
 * Created on 21 de junio de 2008, 01:08 AM
 */

package Presentacion;

import Grafica.Diagrama;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author  Arvin
 */
public class FPrincipal extends javax.swing.JFrame {
    
    /** Creates new form FPrincipal */
    private ToolBar toolBar;
    private Diagrama diagrama;
    
    public FPrincipal() {
        
       Toolkit.getDefaultToolkit().setDynamicLayout(true);
       System.setProperty("sun.awt.noerasebackground", "true");
       try{
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
           //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }
        catch( Exception e ){          
          System.exit(0);
        }
           
        initComponents();
        
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        this.getContentPane().setLayout( new BorderLayout() );  
        this.setSize( dim );
        
        this.diagrama=new Diagrama( dim );
        this.getContentPane().add( diagrama, BorderLayout.CENTER );
        
        this.crearToolBar();
    }
    
    protected void crearToolBar() {
        this.toolBar=new ToolBar();
        this.toolBar.setDiagrama( diagrama );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );         
    } 
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
