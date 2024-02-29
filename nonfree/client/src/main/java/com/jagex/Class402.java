package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public class Class402 {

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	protected static int anInt4694;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "Lclient!mk;")
	static final Class402 aClass402_12 = new Class402();

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!mk;")
	static final Class402 aClass402_11 = new Class402();

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "Lclient!mk;")
	static final Class402 aClass402_10 = new Class402();

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "()[Lclient!mk;", line = 12)
	public static Class402[] method28500() {
		return new Class402[] { aClass402_12, aClass402_11, aClass402_10 };
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 15)
	Class402() {
	}

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "(II)I", line = 18)
	public int method28501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class19.anInt108 * -1091172141 > arg1 ? Class19.anInt108 * -1091172141 : arg1;
		if (aClass402_12 == this) {
			return 0;
		} else if (aClass402_10 == this) {
			return local10 - arg0;
		} else if (aClass402_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(IIB)I", line = 18)
	public int method28502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class19.anInt108 * -1091172141 > arg1 ? Class19.anInt108 * -1091172141 : arg1;
		if (aClass402_12 == this) {
			return 0;
		} else if (aClass402_10 == this) {
			return local10 - arg0;
		} else if (aClass402_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "(II)I", line = 18)
	public int method28503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class19.anInt108 * -1091172141 > arg1 ? Class19.anInt108 * -1091172141 : arg1;
		if (aClass402_12 == this) {
			return 0;
		} else if (aClass402_10 == this) {
			return local10 - arg0;
		} else if (aClass402_11 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mk", name = "al", descriptor = "(B)V", line = 921)
	public static void method28504() {
		Class494.aClass83_29 = null;
		Class304.aClass83_26 = null;
		Class37.aClass83_1 = null;
		Class579.aClass83_37 = null;
		Class275.aClass83_25 = null;
		Class355.aClass83_28 = null;
		Class500.aClass83_30 = null;
		Class573.aClass83_35 = null;
		Class503.aClass94_11 = null;
		Class315.aClass17_11 = null;
	}

	@OriginalMember(owner = "client!mk", name = "amj", descriptor = "(Lclient!yf;B)V", line = 11857)
	static final void method28505(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_3) {
			throw new RuntimeException();
		}
		((Class149_Sub3) Class597.aClass107_Sub1_2.method8873()).method16719(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}
}
