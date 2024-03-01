package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afx")
public class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!afx", name = "l", descriptor = "Lclient!wk;")
	public Class553 aClass553_17 = new Class553();

	@OriginalMember(owner = "client!afx", name = "<init>", descriptor = "()V", line = 9)
	Class3_Sub13() {
	}

	@OriginalMember(owner = "client!afx", name = "dj", descriptor = "(II)V", line = 744)
	public static void method11250(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Class58_Sub1.aFloat148 = 3.0F;
		} else if (arg0 == 50) {
			Class58_Sub1.aFloat148 = 4.0F;
		} else if (arg0 == 75) {
			Class58_Sub1.aFloat148 = 6.0F;
		} else if (arg0 == 100) {
			Class58_Sub1.aFloat148 = 8.0F;
		} else if (arg0 == 200) {
			Class58_Sub1.aFloat148 = 16.0F;
		}
		Class58_Sub1.anInt1435 = 1239823265;
		Class58_Sub1.anInt1435 = 1239823265;
	}

	@OriginalMember(owner = "client!afx", name = "mu", descriptor = "(Lclient!vs;I)V", line = 6311)
	static final void method11251(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class2.method59(local11, local14, arg0);
	}
}
