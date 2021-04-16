package packageWireframe;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BorderFactory {
	
	public static Border criar() {//static informa que o metodo ñ depende de um objeto.
		return new LineBorder(Color.BLACK);
	}
}
