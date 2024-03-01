package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ym")
public class Class603 implements Interface56 {

	@OriginalMember(owner = "client!ym", name = "c", descriptor = "Ljava/lang/String;")
	static String aString246;

	@OriginalMember(owner = "client!ym", name = "p", descriptor = "Lclient!ym;")
	public static final Class603 aClass603_2 = new Class603(0);

	@OriginalMember(owner = "client!ym", name = "a", descriptor = "Lclient!ym;")
	public static final Class603 aClass603_3 = new Class603(1);

	@OriginalMember(owner = "client!ym", name = "g", descriptor = "I")
	final int anInt5526;

	@OriginalMember(owner = "client!ym", name = "<init>", descriptor = "(I)V", line = 10)
	Class603(@OriginalArg(0) int arg0) {
		this.anInt5526 = arg0 * 1677925441;
	}

	@OriginalMember(owner = "client!ym", name = "x", descriptor = "()I", line = 15)
	@Override
	public int method33764() {
		return this.anInt5526 * 676787137;
	}

	@OriginalMember(owner = "client!ym", name = "l", descriptor = "()I", line = 15)
	@Override
	public int method33767() {
		return this.anInt5526 * 676787137;
	}

	@OriginalMember(owner = "client!ym", name = "h", descriptor = "()I", line = 15)
	@Override
	public int method33766() {
		return this.anInt5526 * 676787137;
	}

	@OriginalMember(owner = "client!ym", name = "a", descriptor = "(I)I", line = 15)
	@Override
	public int method33765() {
		return this.anInt5526 * 676787137;
	}

	@OriginalMember(owner = "client!ym", name = "x", descriptor = "(I)V", line = 168)
	static void method33531() {
		Class325.aClass3_Sub1_Sub7_4 = new Class3_Sub1_Sub7(Class601.aClass601_7.method33512(Class469.aClass530_2), "", client.anInt3159 * -651417687, 1006, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!ym", name = "k", descriptor = "(Lclient!vs;B)V", line = 3989)
	static final void method33530(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		if (arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == arg0.anIntArray496[arg0.anInt5319 * 960738381]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}
}
