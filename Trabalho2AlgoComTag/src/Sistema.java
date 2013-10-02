import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;

public class Sistema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cor classecor = new Cor();
		Imagem imagem = new Imagem ();
		Reta reta = new Reta();
		Shape shape = new Shape();
						
		
	
	String aux = "";	
	System.out.println("Começou");
		
	
	
				while (!aux.equals("fim")){
		
			try {
				
				
				Scanner leitura = new Scanner(System.in);
				aux = leitura.next();
		
					if (aux.equals("imagem")){
						
						int altura;
						int largura;
						String cor;
				
						largura = leitura.nextInt();
						altura = leitura.nextInt();
						cor = leitura.next();
											
						imagem.setHeight(altura);
						imagem.setWidth(largura);
						classecor.setColorido(cor);
												
					}
					
					if (aux.equals("reta")){
						
						int x = 0;
						int y = 0;
						
						Ponto p0 = new Ponto(x, y);
						Ponto p1 = new Ponto(x, y);
						
						p0.x = leitura.nextInt();
						p0.y = leitura.nextInt();
						
						p1.x = leitura.nextInt();
						p1.y = leitura.nextInt();
												
						reta.setVertices(p0, p1);
						
						
						
						
					}
					
					if (aux.equals("salvar")){

						
						Cor c = null;
						shape.draw();
						JFrame frm = new JFrame("Teste Imagem");
						JPanel pan = new JPanel();
						JLabel lbl = new JLabel( imagem.GeraImagem() );
						pan.add( lbl );
						frm.getContentPane().add( pan );
						frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
						frm.pack();
						frm.setVisible(true);
					
					}
			}
			
			catch (InputMismatchException e){
				System.out.println("Erro: Parametro não reconhecido");
			}
		}
	
		
	System.out.println("Fim do Programa");
	System.exit(0);
	

	}

}
