package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class Class563 implements Interface56 {

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "Lclient!wv;")
	static final Class563 aClass563_5 = new Class563(-1);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!wv;")
	public static final Class563 aClass563_2 = new Class563(-2);

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "Lclient!wv;")
	public static final Class563 aClass563_4 = new Class563(-3);

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "Lclient!wv;")
	static final Class563 aClass563_11 = new Class563(-4);

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Lclient!wv;")
	public static final Class563 aClass563_3 = new Class563(-5);

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "Lclient!wv;")
	public static final Class563 aClass563_6 = new Class563(2);

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "Lclient!wv;")
	static final Class563 aClass563_7 = new Class563(3);

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "Lclient!wv;")
	static final Class563 aClass563_8 = new Class563(7);

	@OriginalMember(owner = "client!wv", name = "y", descriptor = "Lclient!wv;")
	static final Class563 aClass563_9 = new Class563(9);

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!wv;")
	static final Class563 aClass563_10 = new Class563(37);

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	final int anInt5369;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "()[Lclient!wv;", line = 21)
	public static Class563[] method32889() {
		return new Class563[] { aClass563_2, aClass563_3, aClass563_8, aClass563_10, aClass563_11, aClass563_7, aClass563_9, aClass563_6, aClass563_5, aClass563_4 };
	}

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "()[Lclient!wv;", line = 21)
	public static Class563[] method32890() {
		return new Class563[] { aClass563_2, aClass563_3, aClass563_8, aClass563_10, aClass563_11, aClass563_7, aClass563_9, aClass563_6, aClass563_5, aClass563_4 };
	}

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "()[Lclient!wv;", line = 21)
	public static Class563[] method32891() {
		return new Class563[] { aClass563_2, aClass563_3, aClass563_8, aClass563_10, aClass563_11, aClass563_7, aClass563_9, aClass563_6, aClass563_5, aClass563_4 };
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(I)V", line = 24)
	Class563(@OriginalArg(0) int arg0) {
		this.anInt5369 = arg0 * 1973545403;
	}

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "()I", line = 29)
	@Override
	public int method33764() {
		return this.anInt5369 * -1577094285;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)I", line = 29)
	@Override
	public int method33765() {
		return this.anInt5369 * -1577094285;
	}

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "()I", line = 29)
	@Override
	public int method33766() {
		return this.anInt5369 * -1577094285;
	}

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "()I", line = 29)
	@Override
	public int method33767() {
		return this.anInt5369 * -1577094285;
	}
}
