package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class Class547 implements Interface56 {

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!wd;")
	public static final Class547 aClass547_6 = new Class547(-2);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!wd;")
	public static final Class547 aClass547_3 = new Class547(-3);

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!wd;")
	public static final Class547 aClass547_4 = new Class547(2);

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!wd;")
	public static final Class547 aClass547_2 = new Class547(3);

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!wd;")
	static final Class547 aClass547_5 = new Class547(4);

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	final int anInt5327;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "()[Lclient!wd;", line = 16)
	public static Class547[] method32654() {
		return new Class547[] { aClass547_4, aClass547_5, aClass547_2, aClass547_6, aClass547_3 };
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 19)
	Class547(@OriginalArg(0) int arg0) {
		this.anInt5327 = arg0 * -1866649647;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I", line = 24)
	@Override
	public int method33765() {
		return this.anInt5327 * -775714511;
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "()I", line = 24)
	@Override
	public int method33767() {
		return this.anInt5327 * -775714511;
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "()I", line = 24)
	@Override
	public int method33766() {
		return this.anInt5327 * -775714511;
	}

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "()I", line = 24)
	@Override
	public int method33764() {
		return this.anInt5327 * -775714511;
	}
}
