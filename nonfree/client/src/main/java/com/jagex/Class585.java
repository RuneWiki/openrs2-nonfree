package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class Class585 {

	@OriginalMember(owner = "client!uw", name = "gy", descriptor = "Lclient!pw;")
	public static Class478 aClass478_131;

	@OriginalMember(owner = "client!uw", name = "lc", descriptor = "I")
	public static int anInt5453;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
	final int anInt5449;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
	final int anInt5451;

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
	final int anInt5450;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	final int anInt5452;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIII)V", line = 9)
	Class585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5449 = arg0 * 1396131067;
		this.anInt5451 = arg1 * 807408755;
		this.anInt5450 = arg2 * -1787939525;
		this.anInt5452 = arg3 * -619852583;
	}

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "([Ljava/lang/String;[IB)V", line = 9)
	public static void method31727(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class152.method17431(arg0, arg1, 0, arg0.length - 1);
	}
}
