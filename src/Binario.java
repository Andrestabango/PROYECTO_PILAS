import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Binario {


    private Pila pila = new Pila();
    private JTextField textField1;
    private JButton transformarABinarioButton;
    private JTextArea textArea1;
    private JPanel binario;


    public Binario() {

        transformarABinarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(textField1.getText());
                String binario = convertirABinario(numero);
                textArea1.setText(binario);
           
            }
        });
    }

    private String convertirABinario(int numero) {
        StringBuilder binarioBuilder = new StringBuilder();
             while (numero > 0) {
            int bit = numero % 2;
            binarioBuilder.insert(0, bit);
            numero /= 2;
        }
        return binarioBuilder.toString();
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Binario");
        frame.setContentPane(new Binario().binario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
