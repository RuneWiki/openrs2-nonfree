package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.StringTokenizer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/i")
final class Component_Sub1 extends Component implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "a", descriptor = "Ljava/awt/Color;")
	private static Color aColor1 = new Color(12410);

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "b", descriptor = "[[Ljagexappletviewer!app/e;")
	private Class7[][] aClass7ArrayArray1 = (Class7[][]) null;

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "c", descriptor = "[Ljagexappletviewer!app/l;")
	private Class13[] aClass13Array1;

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "d", descriptor = "Ljava/awt/Color;")
	private static Color aColor2 = new Color(16777215);

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "e", descriptor = "Ljava/awt/Color;")
	private static Color aColor3 = new Color(16765440);

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) Point local4 = arg0.getPoint();
		for (@Pc(6) int local6 = 0; local6 < this.aClass13Array1.length; local6++) {
			if (this.aClass13Array1[local6].aRectangle1.contains(local4)) {
				this.setCursor(Cursor.getPredefinedCursor(12));
				return;
			}
		}
		this.setCursor(Cursor.getPredefinedCursor(0));
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) Point local4 = arg0.getPoint();
		for (@Pc(6) int local6 = 0; local6 < this.aClass13Array1.length; local6++) {
			if (this.aClass13Array1[local6].aRectangle1.contains(local4)) {
				Class15.showurl(this.aClass13Array1[local6].aString4, null);
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private final void method30(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return;
		}
		@Pc(11) StringTokenizer local11 = new StringTokenizer(arg0, "\\");
		this.aClass7ArrayArray1 = new Class7[local11.countTokens()][];
		@Pc(19) Class7[] local19 = new Class7[100];
		@Pc(21) int local21 = 0;
		while (local11.hasMoreTokens()) {
			@Pc(26) int local26 = 0;
			@Pc(29) String local29 = local11.nextToken();
			while (true) {
				@Pc(33) int local33 = local29.indexOf(91);
				if (local33 < 0) {
					local19[local26++] = new Class7(local29);
					break;
				}
				if (local33 > 0) {
					local19[local26++] = new Class7(local29.substring(0, local33));
					local29 = local29.substring(local33);
				}
				@Pc(71) int local71 = local29.indexOf(34);
				if (local71 < 0) {
					break;
				}
				@Pc(83) int local83 = local29.indexOf(34, local71 + 1);
				if (local83 < 0) {
					break;
				}
				@Pc(90) int local90 = local29.indexOf(93);
				if (local90 < 0) {
					break;
				}
				@Pc(104) String local104 = local29.substring(local71 + 1, local83);
				@Pc(112) String local112 = local29.substring(local83 + 1, local90).trim();
				local19[local26++] = new Class7(local112, local104);
				if (local29.length() <= local90 + 1) {
					break;
				}
				local29 = local29.substring(local90 + 1);
			}
			this.aClass7ArrayArray1[local21] = new Class7[local26];
			System.arraycopy(local19, 0, this.aClass7ArrayArray1[local21], 0, local26);
			local21++;
		}
		if (arg1 != 91) {
			aColor2 = null;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Component_Sub1(@OriginalArg(0) String arg0) {
		this.setBackground(aColor1);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.method30(arg0, 91);
		if (this.aClass7ArrayArray1 != null) {
			@Pc(27) int local27 = 0;
			@Pc(29) int local29;
			for (local29 = 0; local29 < this.aClass7ArrayArray1.length; local29++) {
				@Pc(43) Class7[] local43 = this.aClass7ArrayArray1[local29];
				for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
					if (local43[local45].aClass13_1 != null) {
						local27++;
					}
				}
			}
			this.aClass13Array1 = new Class13[local27];
			local29 = 0;
			for (@Pc(69) int local69 = 0; local69 < this.aClass7ArrayArray1.length; local69++) {
				@Pc(79) Class7[] local79 = this.aClass7ArrayArray1[local69];
				for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
					if (local79[local81].aClass13_1 != null) {
						this.aClass13Array1[local29++] = local79[local81].aClass13_1;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseExited(@OriginalArg(0) MouseEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	public final void paint(@OriginalArg(0) Graphics arg0) {
		@Pc(4) int local4 = this.getWidth();
		@Pc(7) FontMetrics local7 = arg0.getFontMetrics();
		@Pc(10) int local10 = local7.getHeight();
		@Pc(12) int local12 = local10;
		if (this.aClass7ArrayArray1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.aClass7ArrayArray1.length; local19++) {
			@Pc(33) Class7[] local33 = this.aClass7ArrayArray1[local19];
			@Pc(35) int local35 = 0;
			@Pc(37) int local37;
			for (local37 = 0; local37 < local33.length; local37++) {
				local35 += local7.stringWidth(local33[local37].aString3);
			}
			local37 = (local4 - local35) / 2;
			for (@Pc(62) int local62 = 0; local62 < local33.length; local62++) {
				@Pc(74) Class7 local74 = local33[local62];
				@Pc(79) int local79 = local7.stringWidth(local74.aString3);
				@Pc(82) Class13 local82 = local74.aClass13_1;
				if (local82 == null) {
					arg0.setColor(aColor2);
				} else {
					arg0.setColor(aColor3);
					@Pc(91) Rectangle local91 = local82.aRectangle1;
					local91.y = local12 - local10;
					local91.x = local37;
					local91.height = local10;
					local91.width = local79;
				}
				arg0.drawString(local74.aString3, local37, local12);
				local37 += local79;
			}
			local12 += local10;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/i", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
	}
}
