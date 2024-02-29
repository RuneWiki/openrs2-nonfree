package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aci")
public class Class58 {

	@OriginalMember(owner = "client!aci", name = "p", descriptor = "J")
	public static final long aLong12 = 94608000L;

	@OriginalMember(owner = "client!aci", name = "m", descriptor = "[Lclient!cy;")
	static Class83[] aClass83Array2;

	@OriginalMember(owner = "client!aci", name = "qc", descriptor = "Lclient!gm;")
	static Class277 aClass277_1;

	@OriginalMember(owner = "client!aci", name = "<init>", descriptor = "()V", line = 8)
	Class58() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aci", name = "hq", descriptor = "(I)V", line = 3781)
	static final void method865() {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		@Pc(7) Class447 local7 = Class597.aClass107_Sub1_2.method8883();
		Class96_Sub13.anInt883 = ((int) local7.aFloat277 - (-424199969 * local3.anInt5504 << 9)) * -2079086379;
		Class672.anInt5796 = -((int) local7.aFloat276) * 996845503;
		Class633.anInt5710 = ((int) local7.aFloat278 - (-1166289421 * local3.anInt5506 << 9)) * -866237299;
		Class565.anInt5338 = ((int) ((double) Class597.aClass107_Sub1_2.method8894() * 2607.5945876176133D) & 0x3FFF) * -1539495063;
		Class639.anInt5720 = ((int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) & 0x3FFF) * 486346273;
		Class4.anInt17 = 0;
	}
}
