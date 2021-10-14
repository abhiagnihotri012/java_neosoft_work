package lab;

import java.awt.*;

public class FontcClasscheck {

	public static void main(String[] args) {
		Font f;
		f = new Font("TimesNewRoman", Font.BOLD + Font.ITALIC, 12);
		String font = f.getName();
		int style = f.getStyle();
		int size = f.getSize();
		boolean bold = f.isBold();
		boolean normal = f.isPlain();
		boolean italic = f.isItalic();
		System.out.println("Font : " + font + "\n Style : " + style + "\n Size: " + size + "\n Bold : " + bold
				+ "\n Italic : " + italic);

	}

}
