package app;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/o")
final class Canvas_Sub2 extends Canvas implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "a", descriptor = "I")
	private int anInt17 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "b", descriptor = "[I")
	private int[] anIntArray4 = null;

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "c", descriptor = "I")
	private int anInt18 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "d", descriptor = "I")
	private int anInt19 = -1;

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "e", descriptor = "Ljava/awt/event/ActionListener;")
	private ActionListener anActionListener1;

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[10];

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.anInt18 = arg0.getX();
		arg0.getY();
		@Pc(11) int local11 = this.anInt19;
		if (this.anIntArray4 == null) {
			return;
		}
		this.anInt19 = -1;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray4.length - 1; local21++) {
			if (this.anInt18 >= this.anIntArray4[local21] && this.anIntArray4[local21 + 1] > this.anInt18 + 10) {
				this.anInt19 = local21;
				break;
			}
		}
		if (this.anInt19 != local11) {
			this.repaint();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		this.anInt18 = arg0.getX();
		arg0.getY();
		@Pc(11) int local11 = this.anInt19;
		if (this.anIntArray4 == null) {
			return;
		}
		this.anInt19 = -1;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray4.length - 1; local19++) {
			if (this.anInt18 >= this.anIntArray4[local19] && this.anInt18 + 10 < this.anIntArray4[local19 + 1]) {
				this.anInt19 = -1;
				this.anInt18 = 0;
				this.repaint();
				this.anActionListener1.actionPerformed(new ActionEvent(this, local19, ""));
				break;
			}
		}
		if (local11 != this.anInt19) {
			this.repaint();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.anInt18 = arg0.getX();
		arg0.getY();
		@Pc(11) int local11 = this.anInt19;
		if (this.anIntArray4 == null) {
			return;
		}
		this.anInt19 = -1;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray4.length - 1; local20++) {
			if (this.anInt18 >= this.anIntArray4[local20] && this.anInt18 + 10 < this.anIntArray4[local20 - -1]) {
				this.anInt19 = local20;
				break;
			}
		}
		if (local11 != this.anInt19) {
			this.repaint();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	public final void paint(@OriginalArg(0) Graphics arg0) {
		@Pc(4) int local4 = this.getWidth();
		@Pc(7) int local7 = this.getHeight();
		arg0.setColor(Color.BLACK);
		arg0.fillRect(0, 0, local4, local7);
		arg0.setFont(this.getFont());
		@Pc(23) FontMetrics local23 = arg0.getFontMetrics();
		@Pc(25) int local25 = 10;
		@Pc(37) int local37 = local23.getAscent() + (local7 - local23.getHeight()) / 2;
		if (this.anIntArray4 == null || this.anInt17 + 1 != this.anIntArray4.length) {
			this.anIntArray4 = new int[this.anInt17 + 1];
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt17; local63++) {
			@Pc(69) int local69 = local25;
			this.anIntArray4[local63] = local25;
			local25 += local23.stringWidth(this.aStringArray2[local63]);
			if (local69 <= this.anInt18 && this.anInt18 < local25) {
				arg0.setColor(Color.YELLOW);
			} else {
				arg0.setColor(this.getForeground());
			}
			local25 += 10;
			arg0.drawString(this.aStringArray2[local63], local69, local37);
		}
		this.anIntArray4[this.anInt17] = local25;
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.anInt19 = -1;
		this.anInt18 = 0;
		this.repaint();
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		this.anInt18 = arg0.getX();
		arg0.getY();
		@Pc(11) int local11 = this.anInt19;
		if (this.anIntArray4 == null) {
			return;
		}
		this.anInt19 = -1;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray4.length - 1; local20++) {
			if (this.anInt18 >= this.anIntArray4[local20] && this.anIntArray4[local20 + 1] > this.anInt18 + 10) {
				this.anInt19 = local20;
				break;
			}
		}
		if (this.anInt19 != local11) {
			this.repaint();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "a", descriptor = "(BLjava/lang/String;)V")
	final void method37(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (this.aStringArray2.length <= this.anInt17) {
			@Pc(12) String[] local12 = new String[this.aStringArray2.length + 5];
			System.arraycopy(this.aStringArray2, 0, local12, 0, this.aStringArray2.length);
			this.aStringArray2 = local12;
		}
		if (arg0 != 109) {
			this.mousePressed(null);
		}
		this.aStringArray2[this.anInt17++] = arg1;
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/o", name = "<init>", descriptor = "(Ljava/awt/event/ActionListener;)V")
	Canvas_Sub2(@OriginalArg(0) ActionListener arg0) {
		this.anActionListener1 = arg0;
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
}
