import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Imagem extends Reta {
	
	int width;
	int height;
		
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public ImageIcon GeraImagem (){
				
		  BufferedImage buffer = new BufferedImage( width, height, BufferedImage.TYPE_INT_RGB );
		  Graphics g = buffer.createGraphics();
		  g.setColor( Color.WHITE );
		  g.fillRect( 0, 0, width, height );
		  g.setColor( Color.BLACK );
		  g.drawLine( 0, 0, width, height );
		  return new ImageIcon( buffer );
	}
	
}
