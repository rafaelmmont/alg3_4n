import java.awt.*;
import javax.swing.*;

public class Shape extends Imagem {
	
		
	public void draw(){
		JFrame frm = new JFrame("Teste Imagem");
		JPanel pan = new JPanel();
		JLabel lbl = new JLabel(GeraImagem());
		pan.add(lbl);
		frm.getContentPane().add(pan);
		frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frm.pack();
		frm.setVisible(true);		
	}
}

	
	
	
	
	

