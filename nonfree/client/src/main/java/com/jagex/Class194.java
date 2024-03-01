package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public class Class194 {

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
	static int[] anIntArray387;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!gd;")
	static final Class194 aClass194_5 = new Class194(0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!gd;")
	static final Class194 aClass194_2 = new Class194(1);

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!gd;")
	static final Class194 aClass194_4 = new Class194(2);

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!gd;")
	public static final Class194 aClass194_3 = new Class194(3);

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!gd;")
	public static final Class194 aClass194_7 = new Class194(4);

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!gd;")
	public static final Class194 aClass194_6 = new Class194(5);

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	int anInt3684;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V", line = 12)
	Class194(@OriginalArg(0) int arg0) {
		this.anInt3684 = arg0 * 135117077;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Lclient!gd;", line = 17)
	public static Class194 method24075(@OriginalArg(0) int arg0) {
		if (aClass194_5.anInt3684 * 2107428413 == arg0) {
			return aClass194_5;
		} else if (aClass194_2.anInt3684 * 2107428413 == arg0) {
			return aClass194_2;
		} else if (aClass194_4.anInt3684 * 2107428413 == arg0) {
			return aClass194_4;
		} else if (aClass194_3.anInt3684 * 2107428413 == arg0) {
			return aClass194_3;
		} else if (aClass194_7.anInt3684 * 2107428413 == arg0) {
			return aClass194_7;
		} else if (arg0 == aClass194_6.anInt3684 * 2107428413) {
			return aClass194_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "(I)Lclient!gd;", line = 17)
	public static Class194 method24076(@OriginalArg(0) int arg0) {
		if (aClass194_5.anInt3684 * 2107428413 == arg0) {
			return aClass194_5;
		} else if (aClass194_2.anInt3684 * 2107428413 == arg0) {
			return aClass194_2;
		} else if (aClass194_4.anInt3684 * 2107428413 == arg0) {
			return aClass194_4;
		} else if (aClass194_3.anInt3684 * 2107428413 == arg0) {
			return aClass194_3;
		} else if (aClass194_7.anInt3684 * 2107428413 == arg0) {
			return aClass194_7;
		} else if (arg0 == aClass194_6.anInt3684 * 2107428413) {
			return aClass194_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)Lclient!gd;", line = 17)
	public static Class194 method24077(@OriginalArg(0) int arg0) {
		if (aClass194_5.anInt3684 * 2107428413 == arg0) {
			return aClass194_5;
		} else if (aClass194_2.anInt3684 * 2107428413 == arg0) {
			return aClass194_2;
		} else if (aClass194_4.anInt3684 * 2107428413 == arg0) {
			return aClass194_4;
		} else if (aClass194_3.anInt3684 * 2107428413 == arg0) {
			return aClass194_3;
		} else if (aClass194_7.anInt3684 * 2107428413 == arg0) {
			return aClass194_7;
		} else if (arg0 == aClass194_6.anInt3684 * 2107428413) {
			return aClass194_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)Lclient!gd;", line = 17)
	public static Class194 method24078(@OriginalArg(0) int arg0) {
		if (aClass194_5.anInt3684 * 2107428413 == arg0) {
			return aClass194_5;
		} else if (aClass194_2.anInt3684 * 2107428413 == arg0) {
			return aClass194_2;
		} else if (aClass194_4.anInt3684 * 2107428413 == arg0) {
			return aClass194_4;
		} else if (aClass194_3.anInt3684 * 2107428413 == arg0) {
			return aClass194_3;
		} else if (aClass194_7.anInt3684 * 2107428413 == arg0) {
			return aClass194_7;
		} else if (arg0 == aClass194_6.anInt3684 * 2107428413) {
			return aClass194_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "gq", descriptor = "(IIIB)V", line = 3226)
	static final void method24081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(32) String local32 = "tele " + arg0 + Class1.aString4 + (arg1 >> 6) + Class1.aString4 + (arg2 >> 6) + Class1.aString4 + (arg1 & 0x3F) + Class1.aString4 + (arg2 & 0x3F);
		System.out.println(local32);
		Class339.method26424(local32, true, false);
	}

	@OriginalMember(owner = "client!gd", name = "ia", descriptor = "(Lclient!vs;I)V", line = 5598)
	static final void method24079(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class559.method32842(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "aqs", descriptor = "(Lclient!vs;I)V", line = 12029)
	static final void method24080(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(9, local13 << 16 | local23, local33, "");
	}
}
