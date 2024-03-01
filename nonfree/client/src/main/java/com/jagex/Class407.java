package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public class Class407 {

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "(B)V", line = 20)
	static void method27661() {
		Class65_Sub1.anIntArray202[44] = 71;
		Class65_Sub1.anIntArray202[45] = 26;
		Class65_Sub1.anIntArray202[46] = 72;
		Class65_Sub1.anIntArray202[47] = 73;
		Class65_Sub1.anIntArray202[59] = 57;
		Class65_Sub1.anIntArray202[61] = 27;
		Class65_Sub1.anIntArray202[91] = 42;
		Class65_Sub1.anIntArray202[92] = 74;
		Class65_Sub1.anIntArray202[93] = 43;
		Class65_Sub1.anIntArray202[192] = 28;
		Class65_Sub1.anIntArray202[222] = 58;
		Class65_Sub1.anIntArray202[520] = 59;
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 206)
	Class407() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!qi", name = "ij", descriptor = "(Lclient!vs;B)V", line = 5620)
	static final void method27660(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class60_Sub29.method13925(local16, local22, arg0);
	}
}
