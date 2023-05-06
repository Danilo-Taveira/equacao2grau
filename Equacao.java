import javax.swing.JOptionPane;

public class Equacao {
    Double a;
    Double b;
    Double c;
    Double delta;
    Double x1;
    Double x2;

    public Equacao(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.conta();
    }

    public void conta() {
        this.delta = (this.b * this.b) - (4 * this.a * this.c);
        if (this.delta < 0) {
        	JOptionPane.showMessageDialog(null, "Não será possível encontrar valores para x1 e para x2, pois os valores de 'a', 'b' e 'c' informados retornam um valor negativo para o Delta.", "O delta da equação ficará negativo!", JOptionPane.INFORMATION_MESSAGE);
        }
        this.x1 = (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
        this.x2 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
    }
}