package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afl")
public class Class53_Sub5 extends Class53 {

	@OriginalMember(owner = "client!afl", name = "g", descriptor = "I")
	int anInt1192 = (int) (Class176.method23413() / 1000L) * -254923619;

	@OriginalMember(owner = "client!afl", name = "l", descriptor = "Ljava/lang/String;")
	String aString43;

	@OriginalMember(owner = "client!afl", name = "h", descriptor = "S")
	short aShort50;

	@OriginalMember(owner = "client!afl", name = "p", descriptor = "(Lclient!ur;B)V", line = 24)
	public static void method10322(@OriginalArg(0) Class511 arg0) {
		if (arg0.aClass265_3 == Class265.aClass265_2) {
			Class514.aClass48_6 = new Class48_Sub2(arg0);
		} else if (Class265.aClass265_1 == arg0.aClass265_3) {
			Class514.aClass48_6 = new Class48_Sub1(arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!afl", name = "alq", descriptor = "(Lclient!vs;B)V", line = 11139)
	static final void method10323(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3678 * -2078978165;
	}

	@OriginalMember(owner = "client!afl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 11841)
	Class53_Sub5(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString43 = arg0;
		this.aShort50 = (short) arg1;
	}
}
