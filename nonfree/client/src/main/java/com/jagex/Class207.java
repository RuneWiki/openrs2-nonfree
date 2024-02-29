package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class Class207 {

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public static final int anInt3583 = 8191;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "[I")
	static int[] anIntArray348;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!zn;")
	public Class696 aClass696_1 = new Class696();

	@OriginalMember(owner = "client!dm", name = "avn", descriptor = "(Lclient!yf;B)V", line = 13164)
	static final void method25577(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15139() ? 1 : 0;
	}
}
