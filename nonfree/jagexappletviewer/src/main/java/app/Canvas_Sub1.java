package app;

import java.awt.Adjustable;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.ImageObserver;
import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/c")
final class Canvas_Sub1 extends Canvas implements Adjustable {

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "a", descriptor = "I")
	private int anInt4 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "b", descriptor = "I")
	private int anInt5 = 20;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "c", descriptor = "I")
	int anInt6 = 0;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "d", descriptor = "I")
	int anInt7 = 100;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "e", descriptor = "I")
	int anInt8 = 100;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "f", descriptor = "Z")
	boolean aBoolean6 = false;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "g", descriptor = "I")
	int anInt9 = 10;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "h", descriptor = "Ljava/util/LinkedList;")
	private LinkedList aLinkedList1 = new LinkedList();

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "i", descriptor = "I")
	int anInt10;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage1 = null;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "k", descriptor = "I")
	int anInt11;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "l", descriptor = "I")
	int anInt12;

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "getUnitIncrement", descriptor = "()I")
	public final int getUnitIncrement() {
		return this.anInt9;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "a", descriptor = "(B)Z")
	private final boolean method24(@OriginalArg(0) byte arg0) {
		@Pc(4) boolean local4 = this.isEnabled();
		@Pc(7) int local7 = this.getHeight();
		if (local7 == 0) {
			return false;
		}
		if (this.anImage1 == null || local7 != this.anImage1.getHeight(null)) {
			this.anImage1 = this.createImage(15, local7);
		}
		if (this.anImage1 == null) {
			return false;
		}
		if (arg0 > -25) {
			this.aLinkedList1 = null;
		}
		@Pc(53) Graphics local53 = this.anImage1.getGraphics();
		this.anInt12 = local7 - 30;
		local53.setColor(Color.BLACK);
		local53.fillRect(3, 15, 9, this.anInt12);
		if (local4) {
			local53.setColor(Color.GRAY);
		} else {
			local53.setColor(Color.DARK_GRAY);
		}
		local53.drawRoundRect(0, 0, 14, local7 - 1, 3, 3);
		for (@Pc(90) int local90 = 0; local90 < 3; local90++) {
			local53.drawLine(7 - local90, local90 + 5, local90 + 7, local90 + 5);
			local53.drawLine(7 - local90, -local90 + (local7 + 1 - 7), local90 + 7, -local90 + 1 + local7 + -7);
		}
		if (local4) {
			this.anInt11 = this.anInt12 * this.anInt4 / (this.anInt8 - this.anInt6);
			this.anInt10 = this.anInt5 * this.anInt12 / (this.anInt8 - this.anInt6);
		} else {
			this.anInt11 = 0;
			this.anInt10 = this.anInt12;
		}
		local53.fillRect(3, this.anInt11 + 15 + 2, 9, this.anInt10 - 4);
		local53.drawLine(4, this.anInt11 + 15 + 1, 10, this.anInt11 + 1 + 15);
		local53.drawLine(4, this.anInt11 + this.anInt10 + 13, 10, this.anInt11 + this.anInt10 + 13);
		local53.drawLine(6, this.anInt11 + 15, 8, this.anInt11 + 15);
		local53.drawLine(6, this.anInt10 + this.anInt11 + 15 - 1, 8, this.anInt11 + this.anInt10 + 15 - 1);
		local53.dispose();
		return true;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "setUnitIncrement", descriptor = "(I)V")
	public final void setUnitIncrement(@OriginalArg(0) int arg0) {
		this.anInt9 = arg0;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "getVisibleAmount", descriptor = "()I")
	public final int getVisibleAmount() {
		return this.anInt5;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "setMinimum", descriptor = "(I)V")
	public final void setMinimum(@OriginalArg(0) int arg0) {
		this.anInt6 = arg0;
		this.repaint();
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.method24((byte) -96)) {
			arg0.drawImage(this.anImage1, 0, 0, null);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "getValue", descriptor = "()I")
	public final int getValue() {
		return this.anInt4;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "getMaximum", descriptor = "()I")
	public final int getMaximum() {
		return this.anInt8;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "removeAdjustmentListener", descriptor = "(Ljava/awt/event/AdjustmentListener;)V")
	public final void removeAdjustmentListener(@OriginalArg(0) AdjustmentListener arg0) {
		this.aLinkedList1.remove(this.anInt5);
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "getMinimum", descriptor = "()I")
	public final int getMinimum() {
		return this.anInt6;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "a", descriptor = "(ZLjava/awt/event/AdjustmentEvent;)V")
	private final void method25(@OriginalArg(0) boolean arg0, @OriginalArg(1) AdjustmentEvent arg1) {
		@Pc(5) Iterator local5 = this.aLinkedList1.iterator();
		while (local5.hasNext()) {
			@Pc(12) AdjustmentListener local12 = (AdjustmentListener) local5.next();
			local12.adjustmentValueChanged(arg1);
		}
		if (arg0) {
			this.anInt5 = 17;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "getOrientation", descriptor = "()I")
	public final int getOrientation() {
		return 1;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "setEnabled", descriptor = "(Z)V")
	public final void setEnabled(@OriginalArg(0) boolean arg0) {
		super.setEnabled(arg0);
		this.repaint();
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "addAdjustmentListener", descriptor = "(Ljava/awt/event/AdjustmentListener;)V")
	public final void addAdjustmentListener(@OriginalArg(0) AdjustmentListener arg0) {
		this.aLinkedList1.add(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "setMaximum", descriptor = "(I)V")
	public final void setMaximum(@OriginalArg(0) int arg0) {
		this.anInt8 = arg0;
		this.repaint();
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "setValue", descriptor = "(I)V")
	public final void setValue(@OriginalArg(0) int arg0) {
		if (this.anInt6 > arg0) {
			arg0 = this.anInt6;
		}
		if (this.anInt8 - this.anInt5 < arg0) {
			arg0 = this.anInt8 - this.anInt5;
		}
		this.anInt4 = arg0;
		this.repaint();
		this.method25(false, new AdjustmentEvent(this, 601, 5, this.anInt4, this.aBoolean6));
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "getBlockIncrement", descriptor = "()I")
	public final int getBlockIncrement() {
		return this.anInt7;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "setBlockIncrement", descriptor = "(I)V")
	public final void setBlockIncrement(@OriginalArg(0) int arg0) {
		this.anInt7 = arg0;
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "setVisibleAmount", descriptor = "(I)V")
	public final void setVisibleAmount(@OriginalArg(0) int arg0) {
		this.anInt5 = arg0;
		this.repaint();
	}

	@OriginalMember(owner = "jagexappletviewer!app/c", name = "<init>", descriptor = "()V")
	public Canvas_Sub1() {
		this.setMinimumSize(new Dimension(15, 40));
		this.setPreferredSize(new Dimension(15, Integer.MAX_VALUE));
		this.setMaximumSize(new Dimension(15, Integer.MAX_VALUE));
		this.setBackground(Color.BLACK);
		@Pc(59) Class10 local59 = new Class10(this);
		this.addMouseListener(local59);
		this.addMouseMotionListener(local59);
	}
}
