package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public class Class345 {

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	static final int anInt4608 = 3;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	static final int anInt4609 = 1;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	static final int anInt4610 = 0;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	static final int anInt4611 = 2;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	static final int anInt4612 = 4;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	static final int anInt4613 = 6;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
	static final int anInt4614 = 7;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 12)
	Class345() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "(II)Z", line = 60)
	public static boolean method26496(@OriginalArg(0) int arg0) {
		return arg0 >= Class456.aClass456_17.anInt5061 * 821735799 && arg0 <= Class456.aClass456_19.anInt5061 * 821735799;
	}

	@OriginalMember(owner = "client!nh", name = "gu", descriptor = "(Lclient!vs;B)V", line = 5308)
	static final void method26499(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class3_Sub40.method19103(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "mh", descriptor = "(Lclient!vs;B)V", line = 6332)
	static final void method26497(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class416.method27786(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "yw", descriptor = "(Lclient!vs;I)V", line = 8481)
	static final void method26498(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local13.startsWith(Class301.method25664(0)) || local13.startsWith(Class301.method25664(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class532.method32503(local13);
	}

	@OriginalMember(owner = "client!nh", name = "apj", descriptor = "(Lclient!vs;I)V", line = 11651)
	static final void method26500(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class298.aClass3_Sub47_1.anInt1811 * 573273029 < 512 || client.aBoolean567 || client.aBoolean571 ? 1 : 0;
	}
}
