package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class Class555 implements Interface56 {

	@OriginalMember(owner = "client!wm", name = "gc", descriptor = "Lclient!ue;")
	public static Class499 aClass499_5;

	@OriginalMember(owner = "client!wm", name = "bp", descriptor = "I")
	public static int anInt5334;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Lclient!wm;")
	public static final Class555 aClass555_7 = new Class555(-2);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!wm;")
	public static final Class555 aClass555_2 = new Class555(-3);

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!wm;")
	static final Class555 aClass555_4 = new Class555(2);

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Lclient!wm;")
	public static final Class555 aClass555_3 = new Class555(3);

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Lclient!wm;")
	static final Class555 aClass555_6 = new Class555(21);

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Lclient!wm;")
	static final Class555 aClass555_5 = new Class555(20);

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	final int anInt5333;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "()[Lclient!wm;", line = 17)
	public static Class555[] method32795() {
		return new Class555[] { aClass555_3, aClass555_7, aClass555_6, aClass555_4, aClass555_2, aClass555_5 };
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V", line = 20)
	Class555(@OriginalArg(0) int arg0) {
		this.anInt5333 = arg0 * 709882919;
	}

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "()I", line = 25)
	@Override
	public int method33764() {
		return this.anInt5333 * -1759626345;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I", line = 25)
	@Override
	public int method33765() {
		return this.anInt5333 * -1759626345;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "()I", line = 25)
	@Override
	public int method33766() {
		return this.anInt5333 * -1759626345;
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method33767() {
		return this.anInt5333 * -1759626345;
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)V", line = 904)
	static void method32796() {
		if (Class494.method29317(client.anInt3039 * 1115111877)) {
			if (client.aClass82_1.method21621() == null) {
				Class166.method23342(19);
			} else {
				Class166.method23342(18);
			}
		} else if (client.anInt3039 * 1115111877 == 19 || client.anInt3039 * 1115111877 == 15) {
			Class166.method23342(2);
		} else if (client.anInt3039 * 1115111877 == 10) {
			Class166.method23342(2);
		}
	}
}
