package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public class Class300 {

	@OriginalMember(owner = "client!lk", name = "bi", descriptor = "Ljava/lang/String;")
	public static String aString198;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_8 = new Class300(3);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_17 = new Class300(14);

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_3 = new Class300(5);

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_4 = new Class300(4);

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_5 = new Class300(7);

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_13 = new Class300(15);

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_16 = new Class300(12);

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_6 = new Class300(10);

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_9 = new Class300(17);

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_10 = new Class300(1);

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_11 = new Class300(6);

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_12 = new Class300(16);

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_7 = new Class300(11);

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_14 = new Class300(13);

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Lclient!lk;")
	public static final Class300 aClass300_15 = new Class300(9);

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!lk;")
	static final Class300 aClass300_2 = new Class300(8);

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Lclient!lk;")
	static final Class300 aClass300_1 = new Class300(2);

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	final int anInt4420;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V", line = 44)
	Class300(@OriginalArg(0) int arg0) {
		this.anInt4420 = arg0 * 1240420493;
	}

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "()Ljava/lang/String;", line = 49)
	public String method25638() {
		return "_" + this.anInt4420 * 1682108997;
	}

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "(I)Ljava/lang/String;", line = 49)
	public String method25639() {
		return "_" + this.anInt4420 * 1682108997;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()Ljava/lang/String;", line = 49)
	public String method25642() {
		return "_" + this.anInt4420 * 1682108997;
	}

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "()Ljava/lang/String;", line = 49)
	public String method25644() {
		return "_" + this.anInt4420 * 1682108997;
	}

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "()Ljava/lang/String;", line = 49)
	public String method25645() {
		return "_" + this.anInt4420 * 1682108997;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "()Ljava/lang/String;", line = 49)
	public String method25646() {
		return "_" + this.anInt4420 * 1682108997;
	}

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "()Ljava/lang/String;", line = 49)
	public String method25647() {
		return "_" + this.anInt4420 * 1682108997;
	}

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;", line = 53)
	public Object method25649(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class588.method33290(Class524.anApplet2, this.method25639(), arg0);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([Ljava/lang/Object;I)Ljava/lang/Object;", line = 53)
	public Object method25650(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class588.method33290(Class524.anApplet2, this.method25639(), arg0);
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 57)
	public Object method25641() throws Throwable {
		return Class588.method33291(Class524.anApplet2, this.method25639());
	}

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "([Ljava/lang/Object;)V", line = 62)
	public void method25640(@OriginalArg(0) Object[] arg0) {
		try {
			this.method25650(arg0);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "([Ljava/lang/Object;)V", line = 62)
	public void method25648(@OriginalArg(0) Object[] arg0) {
		try {
			this.method25650(arg0);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "([Ljava/lang/Object;)V", line = 62)
	public void method25651(@OriginalArg(0) Object[] arg0) {
		try {
			this.method25650(arg0);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "([Ljava/lang/Object;)V", line = 62)
	public void method25652(@OriginalArg(0) Object[] arg0) {
		try {
			this.method25650(arg0);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "([Ljava/lang/Object;I)V", line = 62)
	public void method25653(@OriginalArg(0) Object[] arg0) {
		try {
			this.method25650(arg0);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)V", line = 69)
	public void method25643() {
		try {
			this.method25641();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "()V", line = 69)
	public void method25654() {
		try {
			this.method25641();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(ZI)V", line = 310)
	public static void method25656(@OriginalArg(0) boolean arg0) {
		if (Class5.aClass221_4 == null) {
			Class226.method24481();
		}
		if (arg0) {
			Class5.aClass221_4.method24408();
		}
	}

	@OriginalMember(owner = "client!lk", name = "atk", descriptor = "(Lclient!vs;I)V", line = 12425)
	static final void method25655(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub13_1.method14599(local12);
	}
}
