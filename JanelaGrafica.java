import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class JanelaGrafica extends JFrame {

  public JanelaGrafica() {
    this.setSize(500, 300);
    this.setTitle("Equação do Segundo Grau");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    Color pretoClaro = new Color(40, 40, 40);
    this.getContentPane().setBackground(pretoClaro);
    this.setLayout(null);
    Color cinzaClaro = new Color(220, 220, 220);

    JTextField aTexto = new JTextField();
    aTexto.setSize(50, 30);
    aTexto.setLocation(50, 25);

    JTextField bTexto = new JTextField();
    bTexto.setSize(50, 30);
    bTexto.setLocation(50, 75);

    JTextField cTexto = new JTextField();
    cTexto.setSize(50, 30);
    cTexto.setLocation(50, 125);

    JLabel aInfo = new JLabel("a");
    aInfo.setSize(50, 30);
    aInfo.setLocation(105, 25);
    aInfo.setForeground(cinzaClaro);

    JLabel bInfo = new JLabel("b");
    bInfo.setSize(50, 30);
    bInfo.setLocation(105, 75);
    bInfo.setForeground(cinzaClaro);

    JLabel cInfo = new JLabel("c");
    cInfo.setSize(50, 30);
    cInfo.setLocation(105, 125);
    cInfo.setForeground(cinzaClaro);

    JTextField deltaTexto = new JTextField();
    deltaTexto.setSize(50, 30);
    deltaTexto.setLocation(270, 25);
    deltaTexto.setEditable(false);

    JTextField x1Texto = new JTextField();
    x1Texto.setSize(50, 30);
    x1Texto.setLocation(270, 75);
    x1Texto.setEditable(false);

    JTextField x2Texto = new JTextField();
    x2Texto.setSize(50, 30);
    x2Texto.setLocation(270, 125);
    x2Texto.setEditable(false);

    JLabel deltaInfo = new JLabel("Delta");
    deltaInfo.setSize(100, 30);
    deltaInfo.setLocation(325, 25);
    deltaInfo.setForeground(cinzaClaro);

    JLabel x1Info = new JLabel("x1");
    x1Info.setSize(100, 30);
    x1Info.setLocation(325, 75);
    x1Info.setForeground(cinzaClaro);

    JLabel x2Info = new JLabel("x2");
    x2Info.setSize(100, 30);
    x2Info.setLocation(325, 125);
    x2Info.setForeground(cinzaClaro);

    JButton botaoCalcular = new JButton("Calcular");
    botaoCalcular.setSize(100, 50);
    botaoCalcular.setLocation(70, 190);
    botaoCalcular.setBackground(new Color(144, 238, 144));
    botaoCalcular.addActionListener(new ActionListener() {
      
      public void actionPerformed(ActionEvent e) {
        Equacao formula = new Equacao(Double.parseDouble(aTexto.getText()), Double.parseDouble(bTexto.getText()), Double.parseDouble(cTexto.getText()));
        DecimalFormat df = new DecimalFormat("#.##");
        deltaTexto.setText(df.format(formula.delta).toString());
        x1Texto.setText(df.format(formula.x1).toString());
        x2Texto.setText(df.format(formula.x2).toString());
      }
    });

    JButton botaoLimpar = new JButton("Limpar");
    botaoLimpar.setSize(100, 50);
    botaoLimpar.setLocation(220, 190);
    botaoLimpar.setBackground(new Color(255, 192, 203));
    botaoLimpar.addActionListener(new ActionListener() {
      
      public void actionPerformed(ActionEvent e) {
        aTexto.setText("");
        bTexto.setText("");
        cTexto.setText("");
        deltaTexto.setText("");
        x1Texto.setText("");
        x2Texto.setText("");
      }
    });
    
    this.add(aTexto);
    this.add(bTexto);
    this.add(cTexto);
    this.add(botaoCalcular);
    this.add(botaoLimpar);
    this.add(aInfo);
    this.add(bInfo);
    this.add(cInfo);
    this.add(deltaTexto);
    this.add(x1Texto);
    this.add(x2Texto);
    this.add(deltaInfo);
    this.add(x1Info);
    this.add(x2Info);
    this.setVisible(true);
    
  }
}