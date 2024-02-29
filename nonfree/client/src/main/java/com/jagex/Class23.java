package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aax")
public class Class23 {

	@OriginalMember(owner = "client!aax", name = "v", descriptor = "I")
	public static final int anInt116 = 3;

	@OriginalMember(owner = "client!aax", name = "c", descriptor = "I")
	public static final int anInt117 = 2;

	@OriginalMember(owner = "client!aax", name = "l", descriptor = "I")
	public static final int anInt118 = 4;

	@OriginalMember(owner = "client!aax", name = "p", descriptor = "I")
	public static final int anInt119 = 1;

	@OriginalMember(owner = "client!aax", name = "<init>", descriptor = "()V", line = 9)
	Class23() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aax", name = "aad", descriptor = "(Lclient!yf;B)V", line = 9323)
	static final void method425(@OriginalArg(0) Class665 arg0) {
		if (Class494.aClass77_Sub25_1 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
			arg0.aClass77_Sub25_3 = Class494.aClass77_Sub25_1;
		}
	}

	@OriginalMember(owner = "client!aax", name = "aqm", descriptor = "(Lclient!yf;I)V", line = 12427)
	static final void method426(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub37_1.method16134() == 1 ? 1 : 0;
	}
}
