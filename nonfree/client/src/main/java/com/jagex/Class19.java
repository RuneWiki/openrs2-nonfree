package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aat")
public class Class19 implements Iterator {

	@OriginalMember(owner = "client!aat", name = "z", descriptor = "I")
	public static int anInt108;

	@OriginalMember(owner = "client!aat", name = "uy", descriptor = "I")
	static int anInt109;

	@OriginalMember(owner = "client!aat", name = "v", descriptor = "I")
	int anInt107;

	@OriginalMember(owner = "client!aat", name = "c", descriptor = "Lclient!sn;")
	Class77 aClass77_4;

	@OriginalMember(owner = "client!aat", name = "l", descriptor = "Lclient!sn;")
	Class77 aClass77_3 = null;

	@OriginalMember(owner = "client!aat", name = "p", descriptor = "Lclient!aak;")
	Class12 aClass12_2;

	@OriginalMember(owner = "client!aat", name = "<init>", descriptor = "(Lclient!aak;)V", line = 12)
	public Class19(@OriginalArg(0) Class12 arg0) {
		this.aClass12_2 = arg0;
		this.method389();
	}

	@OriginalMember(owner = "client!aat", name = "x", descriptor = "(B)V", line = 18)
	void method389() {
		this.aClass77_4 = this.aClass12_2.aClass77Array1[0].aClass77_222;
		this.anInt107 = -373459183;
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "z", descriptor = "()V", line = 18)
	void method390() {
		this.aClass77_4 = this.aClass12_2.aClass77Array1[0].aClass77_222;
		this.anInt107 = -373459183;
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "s", descriptor = "()V", line = 18)
	void method391() {
		this.aClass77_4 = this.aClass12_2.aClass77Array1[0].aClass77_222;
		this.anInt107 = -373459183;
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "g", descriptor = "()V", line = 18)
	void method392() {
		this.aClass77_4 = this.aClass12_2.aClass77Array1[0].aClass77_222;
		this.anInt107 = -373459183;
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "r", descriptor = "()V", line = 18)
	void method393() {
		this.aClass77_4 = this.aClass12_2.aClass77Array1[0].aClass77_222;
		this.anInt107 = -373459183;
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "k", descriptor = "()Lclient!sn;", line = 24)
	public Class77 method394() {
		this.method389();
		return (Class77) this.next();
	}

	@OriginalMember(owner = "client!aat", name = "j", descriptor = "()Lclient!sn;", line = 24)
	public Class77 method395() {
		this.method389();
		return (Class77) this.next();
	}

	@OriginalMember(owner = "client!aat", name = "i", descriptor = "()Lclient!sn;", line = 24)
	public Class77 method396() {
		this.method389();
		return (Class77) this.next();
	}

	@OriginalMember(owner = "client!aat", name = "d", descriptor = "(I)Lclient!sn;", line = 24)
	public Class77 method397() {
		this.method389();
		return (Class77) this.next();
	}

	@OriginalMember(owner = "client!aat", name = "next", descriptor = "()Ljava/lang/Object;", line = 29)
	@Override
	public Object next() {
		@Pc(15) Class77 local15;
		if (this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1] != this.aClass77_4) {
			local15 = this.aClass77_4;
			this.aClass77_4 = local15.aClass77_222;
			this.aClass77_3 = local15;
			return local15;
		}
		do {
			if (this.anInt107 * 2120112625 >= this.aClass12_2.anInt37 * -393701507) {
				return null;
			}
			local15 = this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222;
		} while (local15 == this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]);
		this.aClass77_4 = local15.aClass77_222;
		this.aClass77_3 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aat", name = "w", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method398() {
		@Pc(15) Class77 local15;
		if (this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1] != this.aClass77_4) {
			local15 = this.aClass77_4;
			this.aClass77_4 = local15.aClass77_222;
			this.aClass77_3 = local15;
			return local15;
		}
		do {
			if (this.anInt107 * 2120112625 >= this.aClass12_2.anInt37 * -393701507) {
				return null;
			}
			local15 = this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222;
		} while (local15 == this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]);
		this.aClass77_4 = local15.aClass77_222;
		this.aClass77_3 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aat", name = "y", descriptor = "()Ljava/lang/Object;", line = 29)
	public Object method399() {
		@Pc(15) Class77 local15;
		if (this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1] != this.aClass77_4) {
			local15 = this.aClass77_4;
			this.aClass77_4 = local15.aClass77_222;
			this.aClass77_3 = local15;
			return local15;
		}
		do {
			if (this.anInt107 * 2120112625 >= this.aClass12_2.anInt37 * -393701507) {
				return null;
			}
			local15 = this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222;
		} while (local15 == this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]);
		this.aClass77_4 = local15.aClass77_222;
		this.aClass77_3 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aat", name = "hasNext", descriptor = "()Z", line = 47)
	@Override
	public boolean hasNext() {
		if (this.aClass77_4 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
			return true;
		}
		while (this.anInt107 * 2120112625 < this.aClass12_2.anInt37 * -393701507) {
			if (this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
				this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1].aClass77_222;
				return true;
			}
			this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aat", name = "p", descriptor = "()Z", line = 47)
	public boolean method400() {
		if (this.aClass77_4 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
			return true;
		}
		while (this.anInt107 * 2120112625 < this.aClass12_2.anInt37 * -393701507) {
			if (this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
				this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1].aClass77_222;
				return true;
			}
			this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aat", name = "c", descriptor = "()Z", line = 47)
	public boolean method401() {
		if (this.aClass77_4 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
			return true;
		}
		while (this.anInt107 * 2120112625 < this.aClass12_2.anInt37 * -393701507) {
			if (this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
				this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1].aClass77_222;
				return true;
			}
			this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aat", name = "l", descriptor = "()Z", line = 47)
	public boolean method402() {
		if (this.aClass77_4 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
			return true;
		}
		while (this.anInt107 * 2120112625 < this.aClass12_2.anInt37 * -393701507) {
			if (this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
				this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1].aClass77_222;
				return true;
			}
			this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aat", name = "v", descriptor = "()Z", line = 47)
	public boolean method403() {
		if (this.aClass77_4 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
			return true;
		}
		while (this.anInt107 * 2120112625 < this.aClass12_2.anInt37 * -393701507) {
			if (this.aClass12_2.aClass77Array1[(this.anInt107 += -373459183) * 2120112625 - 1].aClass77_222 != this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1]) {
				this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1].aClass77_222;
				return true;
			}
			this.aClass77_4 = this.aClass12_2.aClass77Array1[this.anInt107 * 2120112625 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aat", name = "remove", descriptor = "()V", line = 61)
	@Override
	public void remove() {
		if (this.aClass77_3 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_3.method24063();
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "t", descriptor = "()V", line = 61)
	public void method404() {
		if (this.aClass77_3 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_3.method24063();
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "q", descriptor = "()V", line = 61)
	public void method405() {
		if (this.aClass77_3 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_3.method24063();
		this.aClass77_3 = null;
	}

	@OriginalMember(owner = "client!aat", name = "y", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 214)
	static Class method406(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!aat", name = "wd", descriptor = "(Lclient!yf;B)V", line = 8604)
	static final void method407(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class683.anInt5826 * 324852453;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class683.anInt5840 * 1965634793;
	}

	@OriginalMember(owner = "client!aat", name = "ld", descriptor = "(Ljava/lang/String;I)Z", line = 11969)
	public static boolean method408(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < client.anInt3532 * 2103713403; local6++) {
			@Pc(15) Class217 local15 = client.aClass217Array1[local6];
			if (arg0.equalsIgnoreCase(local15.aString169)) {
				return true;
			}
			if (arg0.equalsIgnoreCase(local15.aString171)) {
				return true;
			}
		}
		return false;
	}
}
