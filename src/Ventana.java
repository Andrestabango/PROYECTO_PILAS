import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel ventana;
    private JTextField textNumero;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JButton cimaButton;
    private JButton buscarButton;
    private JTextArea textArea1;
    private Pila pila = new Pila();

    public Ventana(){

        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pila.apilar(Integer.parseInt(textNumero.getText()));
                textArea1.setText(pila.toString());
                textNumero.setText("");
            }
        });
        desapilarButton.addActionListener(new ActionListener() {
            //llamar a una accion
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showConfirmDialog(null,"El dato sacado es "+pila.desapilar());
                    textArea1.setText(pila.toString());
                } catch (Exception ex) {
                    JOptionPane.showConfirmDialog(null,ex.getMessage());
                }

            }
        });
        cimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showConfirmDialog(null,"El dato sacado es "+pila.cima());
                    textArea1.setText(pila.toString());
                } catch (Exception ex) {
                    JOptionPane.showConfirmDialog(null,ex.getMessage());
                }
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int indice = pila.buscarElemento(Integer.parseInt(textNumero.getText()));
                   if(indice ==-1){
                       JOptionPane.showConfirmDialog(null,"Elemento no encontrado");
                   }else
                       JOptionPane.showConfirmDialog(null,"El elemento "+ textNumero.getText()+ "Se encuentra en la posicion "+indice);
                } catch (Exception ex) {
                    JOptionPane.showConfirmDialog(null,ex.getMessage());
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
