import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transformacion {
    private JTextArea textArea1;
    private JButton Calcular;
    private JScrollBar scrollBar1;
    private Pila pila = new Pila();


    public Transformacion() {


        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    String mensaje = "";
                    for (int i=.numero()-1; i>= 0; i--){
                        mensaje += numeros.get(i)+ "\n";
                    }
                    return mensaje;
                }



            }
        });
    }
}
