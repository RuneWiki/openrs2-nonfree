package com.jagex;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akm")
public class Class138_Sub1 extends Class138 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!akm", name = "p", descriptor = "I")
	static final int anInt1731 = 1;

	@OriginalMember(owner = "client!akm", name = "c", descriptor = "I")
	static final int anInt1732 = 2;

	@OriginalMember(owner = "client!akm", name = "v", descriptor = "I")
	static final int anInt1733 = 4;

	@OriginalMember(owner = "client!akm", name = "w", descriptor = "I")
	int anInt1734;

	@OriginalMember(owner = "client!akm", name = "r", descriptor = "Ljava/awt/Component;")
	Component aComponent1;

	@OriginalMember(owner = "client!akm", name = "y", descriptor = "I")
	int anInt1735;

	@OriginalMember(owner = "client!akm", name = "l", descriptor = "I")
	int anInt1736;

	@OriginalMember(owner = "client!akm", name = "x", descriptor = "I")
	int anInt1737;

	@OriginalMember(owner = "client!akm", name = "d", descriptor = "I")
	int anInt1738;

	@OriginalMember(owner = "client!akm", name = "q", descriptor = "I")
	int anInt1739;

	@OriginalMember(owner = "client!akm", name = "t", descriptor = "Lclient!zm;")
	Class695 aClass695_24 = new Class695();

	@OriginalMember(owner = "client!akm", name = "s", descriptor = "Lclient!zm;")
	Class695 aClass695_25 = new Class695();

	@OriginalMember(owner = "client!akm", name = "g", descriptor = "Z")
	boolean aBoolean350;

	@OriginalMember(owner = "client!akm", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 25)
	Class138_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method14248(arg0);
		this.aBoolean350 = arg1;
	}

	@OriginalMember(owner = "client!akm", name = "ah", descriptor = "(Ljava/awt/Component;I)V", line = 31)
	void method14248(@OriginalArg(0) Component arg0) {
		this.method14253();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!akm", name = "af", descriptor = "(Ljava/awt/Component;)V", line = 31)
	void method14249(@OriginalArg(0) Component arg0) {
		this.method14253();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!akm", name = "aa", descriptor = "()V", line = 39)
	void method14250() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1735 = 0;
		this.anInt1734 = 0;
		this.anInt1736 = 0;
		this.anInt1738 = 0;
		this.anInt1737 = 0;
		this.anInt1739 = 0;
		this.aClass695_24 = null;
		this.aClass695_25 = null;
	}

	@OriginalMember(owner = "client!akm", name = "an", descriptor = "()V", line = 39)
	void method14251() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1735 = 0;
		this.anInt1734 = 0;
		this.anInt1736 = 0;
		this.anInt1738 = 0;
		this.anInt1737 = 0;
		this.anInt1739 = 0;
		this.aClass695_24 = null;
		this.aClass695_25 = null;
	}

	@OriginalMember(owner = "client!akm", name = "ab", descriptor = "()V", line = 39)
	void method14252() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1735 = 0;
		this.anInt1734 = 0;
		this.anInt1736 = 0;
		this.anInt1738 = 0;
		this.anInt1737 = 0;
		this.anInt1739 = 0;
		this.aClass695_24 = null;
		this.aClass695_25 = null;
	}

	@OriginalMember(owner = "client!akm", name = "as", descriptor = "(I)V", line = 39)
	void method14253() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1735 = 0;
		this.anInt1734 = 0;
		this.anInt1736 = 0;
		this.anInt1738 = 0;
		this.anInt1737 = 0;
		this.anInt1739 = 0;
		this.aClass695_24 = null;
		this.aClass695_25 = null;
	}

	@OriginalMember(owner = "client!akm", name = "aq", descriptor = "(IIIII)V", line = 55)
	void method14254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class77_Sub42_Sub2 local8 = Class619.method32394(arg0, arg1, arg2, Class280.method26667(), arg3);
		this.aClass695_25.method36383(local8);
	}

	@OriginalMember(owner = "client!akm", name = "ap", descriptor = "(IIII)V", line = 55)
	void method14255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class77_Sub42_Sub2 local8 = Class619.method32394(arg0, arg1, arg2, Class280.method26667(), arg3);
		this.aClass695_25.method36383(local8);
	}

	@OriginalMember(owner = "client!akm", name = "am", descriptor = "(IIB)V", line = 60)
	void method14256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1739 = arg0 * -501098171;
		this.anInt1737 = arg1 * -987887771;
		if (this.aBoolean350) {
			this.method14254(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!akm", name = "aw", descriptor = "(II)V", line = 60)
	void method14257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1739 = arg0 * -501098171;
		this.anInt1737 = arg1 * -987887771;
		if (this.aBoolean350) {
			this.method14254(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!akm", name = "d", descriptor = "(B)Lclient!akz;", line = 68)
	@Override
	public Class77_Sub42 method14226() {
		return (Class77_Sub42) this.aClass695_24.method36388();
	}

	@OriginalMember(owner = "client!akm", name = "ar", descriptor = "()Lclient!akz;", line = 68)
	@Override
	public Class77_Sub42 method14243() {
		return (Class77_Sub42) this.aClass695_24.method36388();
	}

	@OriginalMember(owner = "client!akm", name = "ax", descriptor = "()Lclient!akz;", line = 68)
	@Override
	public Class77_Sub42 method14244() {
		return (Class77_Sub42) this.aClass695_24.method36388();
	}

	@OriginalMember(owner = "client!akm", name = "v", descriptor = "(I)V", line = 72)
	@Override
	public synchronized void method14228() {
		this.anInt1736 = this.anInt1739 * -238490711;
		this.anInt1734 = this.anInt1737 * -104773981;
		this.anInt1735 = this.anInt1738 * 1191152557;
		@Pc(20) Class695 local20 = this.aClass695_24;
		this.aClass695_24 = this.aClass695_25;
		this.aClass695_25 = local20;
		this.aClass695_25.method36380();
	}

	@OriginalMember(owner = "client!akm", name = "ac", descriptor = "()V", line = 72)
	@Override
	public synchronized void method14220() {
		this.anInt1736 = this.anInt1739 * -238490711;
		this.anInt1734 = this.anInt1737 * -104773981;
		this.anInt1735 = this.anInt1738 * 1191152557;
		@Pc(20) Class695 local20 = this.aClass695_24;
		this.aClass695_24 = this.aClass695_25;
		this.aClass695_25 = local20;
		this.aClass695_25.method36380();
	}

	@OriginalMember(owner = "client!akm", name = "av", descriptor = "()V", line = 72)
	@Override
	public synchronized void method14224() {
		this.anInt1736 = this.anInt1739 * -238490711;
		this.anInt1734 = this.anInt1737 * -104773981;
		this.anInt1735 = this.anInt1738 * 1191152557;
		@Pc(20) Class695 local20 = this.aClass695_24;
		this.aClass695_24 = this.aClass695_25;
		this.aClass695_25 = local20;
		this.aClass695_25.method36380();
	}

	@OriginalMember(owner = "client!akm", name = "l", descriptor = "(B)Z", line = 82)
	@Override
	public boolean method14222() {
		return (this.anInt1735 * 1159354507 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "i", descriptor = "()Z", line = 82)
	@Override
	public boolean method14223() {
		return (this.anInt1735 * 1159354507 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "y", descriptor = "(B)Z", line = 86)
	@Override
	public boolean method14242() {
		return (this.anInt1735 * 1159354507 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "k", descriptor = "()Z", line = 86)
	@Override
	public boolean method14230() {
		return (this.anInt1735 * 1159354507 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "u", descriptor = "()Z", line = 86)
	@Override
	public boolean method14231() {
		return (this.anInt1735 * 1159354507 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "e", descriptor = "()Z", line = 86)
	@Override
	public boolean method14232() {
		return (this.anInt1735 * 1159354507 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "o", descriptor = "()Z", line = 86)
	@Override
	public boolean method14233() {
		return (this.anInt1735 * 1159354507 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "f", descriptor = "()Z", line = 86)
	@Override
	public boolean method14229() {
		return (this.anInt1735 * 1159354507 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "ae", descriptor = "()Z", line = 90)
	@Override
	public boolean method14247() {
		return (this.anInt1735 * 1159354507 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "w", descriptor = "(B)Z", line = 90)
	@Override
	public boolean method14235() {
		return (this.anInt1735 * 1159354507 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "at", descriptor = "()Z", line = 90)
	@Override
	public boolean method14246() {
		return (this.anInt1735 * 1159354507 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!akm", name = "q", descriptor = "(I)I", line = 94)
	@Override
	public int method14234() {
		return this.anInt1736 * 453576005;
	}

	@OriginalMember(owner = "client!akm", name = "aj", descriptor = "()I", line = 94)
	@Override
	public int method14245() {
		return this.anInt1736 * 453576005;
	}

	@OriginalMember(owner = "client!akm", name = "ag", descriptor = "()I", line = 94)
	@Override
	public int method14237() {
		return this.anInt1736 * 453576005;
	}

	@OriginalMember(owner = "client!akm", name = "al", descriptor = "()I", line = 94)
	@Override
	public int method14238() {
		return this.anInt1736 * 453576005;
	}

	@OriginalMember(owner = "client!akm", name = "ai", descriptor = "()I", line = 94)
	@Override
	public int method14236() {
		return this.anInt1736 * 453576005;
	}

	@OriginalMember(owner = "client!akm", name = "x", descriptor = "(I)I", line = 98)
	@Override
	public int method14225() {
		return this.anInt1734 * -1028660305;
	}

	@OriginalMember(owner = "client!akm", name = "au", descriptor = "()I", line = 98)
	@Override
	public int method14221() {
		return this.anInt1734 * -1028660305;
	}

	@OriginalMember(owner = "client!akm", name = "ao", descriptor = "()I", line = 98)
	@Override
	public int method14239() {
		return this.anInt1734 * -1028660305;
	}

	@OriginalMember(owner = "client!akm", name = "ak", descriptor = "()I", line = 98)
	@Override
	public int method14240() {
		return this.anInt1734 * -1028660305;
	}

	@OriginalMember(owner = "client!akm", name = "ad", descriptor = "()V", line = 102)
	@Override
	public void method14241() {
		this.method14253();
	}

	@OriginalMember(owner = "client!akm", name = "s", descriptor = "(I)V", line = 102)
	@Override
	public void method14227() {
		this.method14253();
	}

	@OriginalMember(owner = "client!akm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 107)
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!akm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 112)
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method14256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!akm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 117)
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method14256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!akm", name = "ay", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 121)
	int method14258(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!akm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 132)
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method14258(arg0);
		if (local4 == 1) {
			this.method14254(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method14254(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method14254(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt1738 = (this.anInt1738 * 894848751 | local4) * 2065997839;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!akm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 142)
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method14258(arg0);
		if ((this.anInt1738 * 894848751 & local4) == 0) {
			local4 = this.anInt1738 * 894848751;
		}
		if ((local4 & 0x1) != 0) {
			this.method14254(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method14254(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method14254(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt1738 = (this.anInt1738 * 894848751 & ~local4) * 2065997839;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!akm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 153)
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method14256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!akm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method14256(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!akm", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 163)
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method14254(6, local2, local5, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!akm", name = "ta", descriptor = "(Lclient!yf;I)V", line = 8122)
	static final void method14259(@OriginalArg(0) Class665 arg0) {
		Class498.method30206((String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147]);
	}
}
