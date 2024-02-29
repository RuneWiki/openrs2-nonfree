package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anz")
public class Class35_Sub17 extends Class35 {

	@OriginalMember(owner = "client!anz", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;)V", line = 12)
	public Class35_Sub17(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2) {
		super(arg0, arg1, arg2, Class647.aClass647_59, 64, new Class46(Class649.class));
	}

	@OriginalMember(owner = "client!anz", name = "v", descriptor = "(Lclient!akv;I)Lclient!um;", line = 40)
	static Class580 method17429(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) int local7 = arg0.method22478();
		@Pc(11) int local11 = arg0.method22478();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = arg0.method22478();
		}
		return new Class580(local3, local7, local14);
	}

	@OriginalMember(owner = "client!anz", name = "g", descriptor = "(B)V", line = 473)
	public static void method17430() {
		Class581.method31699();
		Class683.aBoolean861 = false;
		Class341.method27765(Class624.anInt5644 * -620506573, Class683.anInt5836 * -260575397, Class639.anInt5719 * -1739196959, Class100_Sub1.anInt946 * -577412881);
		Class281.aClass77_Sub1_Sub7_3 = null;
		Class301.aClass77_Sub1_Sub7_4 = null;
	}
}
