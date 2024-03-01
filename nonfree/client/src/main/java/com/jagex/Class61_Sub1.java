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

@OriginalClass("client!ahk")
public class Class61_Sub1 extends Class61 implements MouseListener, MouseMotionListener, MouseWheelListener {

	@OriginalMember(owner = "client!ahk", name = "a", descriptor = "I")
	static final int anInt1463 = 2;

	@OriginalMember(owner = "client!ahk", name = "g", descriptor = "I")
	static final int anInt1464 = 4;

	@OriginalMember(owner = "client!ahk", name = "p", descriptor = "I")
	static final int anInt1470 = 1;

	@OriginalMember(owner = "client!ahk", name = "l", descriptor = "I")
	int anInt1462;

	@OriginalMember(owner = "client!ahk", name = "h", descriptor = "I")
	int anInt1465;

	@OriginalMember(owner = "client!ahk", name = "y", descriptor = "I")
	int anInt1466;

	@OriginalMember(owner = "client!ahk", name = "x", descriptor = "I")
	int anInt1467;

	@OriginalMember(owner = "client!ahk", name = "u", descriptor = "I")
	int anInt1468;

	@OriginalMember(owner = "client!ahk", name = "z", descriptor = "Ljava/awt/Component;")
	Component aComponent1;

	@OriginalMember(owner = "client!ahk", name = "b", descriptor = "I")
	int anInt1469;

	@OriginalMember(owner = "client!ahk", name = "s", descriptor = "Lclient!wk;")
	Class553 aClass553_25 = new Class553();

	@OriginalMember(owner = "client!ahk", name = "c", descriptor = "Lclient!wk;")
	Class553 aClass553_26 = new Class553();

	@OriginalMember(owner = "client!ahk", name = "j", descriptor = "Z")
	boolean aBoolean326;

	@OriginalMember(owner = "client!ahk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 25)
	Class61_Sub1(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		this.method12770(arg0);
		this.aBoolean326 = arg1;
	}

	@OriginalMember(owner = "client!ahk", name = "an", descriptor = "(Ljava/awt/Component;B)V", line = 31)
	void method12770(@OriginalArg(0) Component arg0) {
		this.method12771();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ahk", name = "ax", descriptor = "(Ljava/awt/Component;)V", line = 31)
	void method12774(@OriginalArg(0) Component arg0) {
		this.method12771();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ahk", name = "av", descriptor = "(Ljava/awt/Component;)V", line = 31)
	void method12775(@OriginalArg(0) Component arg0) {
		this.method12771();
		this.aComponent1 = arg0;
		this.aComponent1.addMouseListener(this);
		this.aComponent1.addMouseMotionListener(this);
		this.aComponent1.addMouseWheelListener(this);
	}

	@OriginalMember(owner = "client!ahk", name = "aj", descriptor = "(I)V", line = 39)
	void method12771() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1467 = 0;
		this.anInt1465 = 0;
		this.anInt1462 = 0;
		this.anInt1469 = 0;
		this.anInt1466 = 0;
		this.anInt1468 = 0;
		this.aClass553_25 = null;
		this.aClass553_26 = null;
	}

	@OriginalMember(owner = "client!ahk", name = "az", descriptor = "()V", line = 39)
	void method12779() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1467 = 0;
		this.anInt1465 = 0;
		this.anInt1462 = 0;
		this.anInt1469 = 0;
		this.anInt1466 = 0;
		this.anInt1468 = 0;
		this.aClass553_25 = null;
		this.aClass553_26 = null;
	}

	@OriginalMember(owner = "client!ahk", name = "al", descriptor = "()V", line = 39)
	void method12780() {
		if (this.aComponent1 == null) {
			return;
		}
		this.aComponent1.removeMouseWheelListener(this);
		this.aComponent1.removeMouseMotionListener(this);
		this.aComponent1.removeMouseListener(this);
		this.aComponent1 = null;
		this.anInt1467 = 0;
		this.anInt1465 = 0;
		this.anInt1462 = 0;
		this.anInt1469 = 0;
		this.anInt1466 = 0;
		this.anInt1468 = 0;
		this.aClass553_25 = null;
		this.aClass553_26 = null;
	}

	@OriginalMember(owner = "client!ahk", name = "as", descriptor = "(IIIII)V", line = 55)
	void method12776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub22_Sub1 local8 = Class245.method24871(arg0, arg1, arg2, Class176.method23413(), arg3);
		this.aClass553_26.method32702(local8);
	}

	@OriginalMember(owner = "client!ahk", name = "ao", descriptor = "(IIII)V", line = 55)
	void method12781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub22_Sub1 local8 = Class245.method24871(arg0, arg1, arg2, Class176.method23413(), arg3);
		this.aClass553_26.method32702(local8);
	}

	@OriginalMember(owner = "client!ahk", name = "ai", descriptor = "(IIB)V", line = 60)
	void method12772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1468 = arg0 * -2105978699;
		this.anInt1466 = arg1 * 153048937;
		if (this.aBoolean326) {
			this.method12776(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ahk", name = "ay", descriptor = "(II)V", line = 60)
	void method12778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1468 = arg0 * -2105978699;
		this.anInt1466 = arg1 * 153048937;
		if (this.aBoolean326) {
			this.method12776(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ahk", name = "ap", descriptor = "(II)V", line = 60)
	void method12782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1468 = arg0 * -2105978699;
		this.anInt1466 = arg1 * 153048937;
		if (this.aBoolean326) {
			this.method12776(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ahk", name = "ab", descriptor = "(II)V", line = 60)
	void method12783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1468 = arg0 * -2105978699;
		this.anInt1466 = arg1 * 153048937;
		if (this.aBoolean326) {
			this.method12776(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ahk", name = "au", descriptor = "(II)V", line = 60)
	void method12784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1468 = arg0 * -2105978699;
		this.anInt1466 = arg1 * 153048937;
		if (this.aBoolean326) {
			this.method12776(-1, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!ahk", name = "b", descriptor = "(I)Lclient!agg;", line = 68)
	@Override
	public Class3_Sub22 method12742() {
		return (Class3_Sub22) this.aClass553_25.method32718();
	}

	@OriginalMember(owner = "client!ahk", name = "af", descriptor = "()Lclient!agg;", line = 68)
	@Override
	public Class3_Sub22 method12760() {
		return (Class3_Sub22) this.aClass553_25.method32718();
	}

	@OriginalMember(owner = "client!ahk", name = "at", descriptor = "()Lclient!agg;", line = 68)
	@Override
	public Class3_Sub22 method12759() {
		return (Class3_Sub22) this.aClass553_25.method32718();
	}

	@OriginalMember(owner = "client!ahk", name = "r", descriptor = "()V", line = 72)
	@Override
	public synchronized void method12748() {
		this.anInt1462 = this.anInt1468 * 1778638597;
		this.anInt1465 = this.anInt1466 * -1884333975;
		this.anInt1467 = this.anInt1469 * -384629977;
		@Pc(20) Class553 local20 = this.aClass553_25;
		this.aClass553_25 = this.aClass553_26;
		this.aClass553_26 = local20;
		this.aClass553_26.method32701();
	}

	@OriginalMember(owner = "client!ahk", name = "g", descriptor = "(B)V", line = 72)
	@Override
	public synchronized void method12735() {
		this.anInt1462 = this.anInt1468 * 1778638597;
		this.anInt1465 = this.anInt1466 * -1884333975;
		this.anInt1467 = this.anInt1469 * -384629977;
		@Pc(20) Class553 local20 = this.aClass553_25;
		this.aClass553_25 = this.aClass553_26;
		this.aClass553_26 = local20;
		this.aClass553_26.method32701();
	}

	@OriginalMember(owner = "client!ahk", name = "l", descriptor = "(I)Z", line = 82)
	@Override
	public boolean method12736() {
		return (this.anInt1467 * -136616259 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ahk", name = "d", descriptor = "()Z", line = 82)
	@Override
	public boolean method12751() {
		return (this.anInt1467 * -136616259 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ahk", name = "h", descriptor = "(I)Z", line = 86)
	@Override
	public boolean method12737() {
		return (this.anInt1467 * -136616259 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ahk", name = "q", descriptor = "()Z", line = 86)
	@Override
	public boolean method12750() {
		return (this.anInt1467 * -136616259 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ahk", name = "m", descriptor = "()Z", line = 90)
	@Override
	public boolean method12734() {
		return (this.anInt1467 * -136616259 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ahk", name = "v", descriptor = "()Z", line = 90)
	@Override
	public boolean method12752() {
		return (this.anInt1467 * -136616259 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ahk", name = "x", descriptor = "(I)Z", line = 90)
	@Override
	public boolean method12738() {
		return (this.anInt1467 * -136616259 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ahk", name = "w", descriptor = "()I", line = 94)
	@Override
	public int method12754() {
		return this.anInt1462 * -1927964743;
	}

	@OriginalMember(owner = "client!ahk", name = "o", descriptor = "()I", line = 94)
	@Override
	public int method12755() {
		return this.anInt1462 * -1927964743;
	}

	@OriginalMember(owner = "client!ahk", name = "u", descriptor = "(B)I", line = 94)
	@Override
	public int method12740() {
		return this.anInt1462 * -1927964743;
	}

	@OriginalMember(owner = "client!ahk", name = "y", descriptor = "(B)I", line = 98)
	@Override
	public int method12741() {
		return this.anInt1465 * 397360881;
	}

	@OriginalMember(owner = "client!ahk", name = "k", descriptor = "()I", line = 98)
	@Override
	public int method12758() {
		return this.anInt1465 * 397360881;
	}

	@OriginalMember(owner = "client!ahk", name = "i", descriptor = "()I", line = 98)
	@Override
	public int method12756() {
		return this.anInt1465 * 397360881;
	}

	@OriginalMember(owner = "client!ahk", name = "f", descriptor = "()I", line = 98)
	@Override
	public int method12757() {
		return this.anInt1465 * 397360881;
	}

	@OriginalMember(owner = "client!ahk", name = "c", descriptor = "(I)V", line = 102)
	@Override
	public void method12743() {
		this.method12771();
	}

	@OriginalMember(owner = "client!ahk", name = "aa", descriptor = "()V", line = 102)
	@Override
	public void method12762() {
		this.method12771();
	}

	@OriginalMember(owner = "client!ahk", name = "ak", descriptor = "()V", line = 102)
	@Override
	public void method12761() {
		this.method12771();
	}

	@OriginalMember(owner = "client!ahk", name = "ah", descriptor = "()V", line = 102)
	@Override
	public void method12739() {
		this.method12771();
	}

	@OriginalMember(owner = "client!ahk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 107)
	@Override
	public synchronized void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 112)
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		this.method12772(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ahk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 117)
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		this.method12772(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ahk", name = "am", descriptor = "(Ljava/awt/event/MouseEvent;)I", line = 121)
	int method12773(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ahk", name = "aq", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 121)
	int method12777(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ahk", name = "ag", descriptor = "(Ljava/awt/event/MouseEvent;)I", line = 121)
	int method12785(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ahk", name = "ar", descriptor = "(Ljava/awt/event/MouseEvent;)I", line = 121)
	int method12786(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ahk", name = "ae", descriptor = "(Ljava/awt/event/MouseEvent;)I", line = 121)
	int method12787(@OriginalArg(0) MouseEvent arg0) {
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

	@OriginalMember(owner = "client!ahk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 132)
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method12777(arg0);
		if (local4 == 1) {
			this.method12776(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 4) {
			this.method12776(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (local4 == 2) {
			this.method12776(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt1469 = (this.anInt1469 * -106439221 | local4) * 1669881827;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 142)
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		@Pc(4) int local4 = this.method12777(arg0);
		if ((this.anInt1469 * -106439221 & local4) == 0) {
			local4 = this.anInt1469 * -106439221;
		}
		if ((local4 & 0x1) != 0) {
			this.method12776(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x4) != 0) {
			this.method12776(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((local4 & 0x2) != 0) {
			this.method12776(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.anInt1469 = (this.anInt1469 * -106439221 & ~local4) * 1669881827;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ahk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 153)
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		this.method12772(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ahk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		this.method12772(arg0.getX(), arg0.getY());
	}

	@OriginalMember(owner = "client!ahk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 163)
	@Override
	public synchronized void mouseWheelMoved(@OriginalArg(0) MouseWheelEvent arg0) {
		@Pc(2) int local2 = arg0.getX();
		@Pc(5) int local5 = arg0.getY();
		@Pc(8) int local8 = arg0.getWheelRotation();
		this.method12776(6, local2, local5, local8);
		arg0.consume();
	}

	@OriginalMember(owner = "client!ahk", name = "fa", descriptor = "(ZI)Z", line = 2359)
	public static boolean method12789(@OriginalArg(0) boolean arg0) {
		@Pc(2) boolean local2 = Class613.aClass21_13.method17131();
		if (arg0 == local2) {
			return true;
		}
		if (!arg0) {
			Class613.aClass21_13.method17130();
		} else if (!Class613.aClass21_13.method17129()) {
			arg0 = false;
		}
		if (local2 == arg0) {
			return false;
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, arg0 ? 1 : 0);
			Class26_Sub1_Sub1_Sub1.method16728();
			return true;
		}
	}

	@OriginalMember(owner = "client!ahk", name = "tu", descriptor = "(Lclient!vs;I)V", line = 7559)
	static final void method12788(@OriginalArg(0) Class536 arg0) {
		Class541.method32587((String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575]);
	}
}
