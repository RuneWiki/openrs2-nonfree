package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/v")
final class Component_Sub2 extends Component {

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "a", descriptor = "I")
	private int anInt21 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "b", descriptor = "Ljava/awt/Dialog;")
	private static Dialog aDialog6;

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "c", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "d", descriptor = "Ljava/awt/Color;")
	private Color aColor4 = new Color(140, 11, 1);

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "e", descriptor = "Ljagexappletviewer!app/v;")
	private static Component_Sub2 aComponent_Sub2_1;

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "f", descriptor = "Ljava/lang/String;")
	private String aString9 = "Loading...";

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "g", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "a", descriptor = "(I)V")
	static final void method44(@OriginalArg(0) int arg0) {
		if (arg0 <= 11) {
			method49(-20);
		}
		if (aDialog6 != null) {
			aDialog6.setVisible(false);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "a", descriptor = "(B)V")
	static final void method45(@OriginalArg(0) byte arg0) {
		System.out.println("Init 1");
		aComponent_Sub2_1 = new Component_Sub2(appletviewer.method11(99, "loaderbox_initial"));
		System.out.println("Init 2");
		aComponent_Sub2_1.aFont1 = new Font("Helvetica", 1, 13);
		System.out.println("Init 3");
		aComponent_Sub2_1.aFontMetrics1 = aComponent_Sub2_1.getFontMetrics(aComponent_Sub2_1.aFont1);
		System.out.println("Init 4");
		aDialog6 = new Dialog(appletviewer.aFrame1, "Jagex Ltd.", false);
		@Pc(47) int local47 = 120 % ((-arg0 - 22) / 46);
		System.out.println("Init 5");
		aDialog6.add(aComponent_Sub2_1);
		System.out.println("Init 6");
		aDialog6.addWindowListener(WindowAdapter_Sub2.method27((byte) -42));
		System.out.println("Init 7");
		aDialog6.setResizable(false);
		System.out.println("Init 8");
		aDialog6.setSize(320, 100);
	}

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "b", descriptor = "(I)V")
	static final void method46(@OriginalArg(0) int arg0) {
		aDialog6.setLocationRelativeTo(appletviewer.aFrame1);
		if (arg0 < -3) {
			aDialog6.setVisible(true);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	public final void paint(@OriginalArg(0) Graphics arg0) {
		try {
			if (arg0 == null) {
				this.repaint();
			} else {
				@Pc(4) int local4 = this.getWidth();
				@Pc(7) int local7 = this.getHeight();
				arg0.setColor(Color.black);
				arg0.fillRect(0, 0, local4, local7);
				arg0.setColor(this.aColor4);
				arg0.drawRect(local4 / 2 - 152, local7 / 2 + -18, 303, 33);
				arg0.fillRect(local4 / 2 - 150, local7 / 2 + -18 + 2, this.anInt21 * 303 / 100 - 3, 30);
				@Pc(72) String local72 = this.aString9 + " - " + this.anInt21 + "%";
				arg0.setFont(this.aFont1);
				arg0.setColor(Color.white);
				arg0.drawString(local72, (local4 - this.aFontMetrics1.stringWidth(local72)) / 2, local7 / 2 + 4);
			}
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "a", descriptor = "(IZ)V")
	static final void method47(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (aComponent_Sub2_1 == null) {
			return;
		}
		if (arg0 > 100) {
			arg0 = 100;
		}
		aComponent_Sub2_1.anInt21 = arg0;
		aComponent_Sub2_1.repaint();
		if (arg1) {
			aDialog6 = null;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "a", descriptor = "(ZLjava/lang/String;)V")
	static final void method48(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		aComponent_Sub2_1.aString9 = arg1;
		aComponent_Sub2_1.repaint();
		if (!arg0) {
			method45((byte) -113);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "c", descriptor = "(I)V")
	static final void method49(@OriginalArg(0) int arg0) {
		aComponent_Sub2_1.paint(aComponent_Sub2_1.getGraphics());
		if (arg0 != 10432) {
			method47(121, false);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/v", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	private Component_Sub2(@OriginalArg(0) String arg0) {
		this.aString9 = arg0;
	}
}
