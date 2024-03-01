package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public abstract class Class5 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!hg;")
	public static Class221 aClass221_4;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 4)
	Class5() {
	}

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "(ZZI)V", line = 15)
	public static void method743(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Class515.anInt5271 += 171058891;
			Class188.method23973();
		}
		if (arg1) {
			Class515.anInt5270 += 1353385231;
			Class174.method23401();
		}
	}

	@OriginalMember(owner = "client!ch", name = "lr", descriptor = "(Lclient!vs;I)V", line = 6197)
	static final void method744(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class626.method33798(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ch", name = "qb", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 7046)
	static final void method745(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		if (arg1.anInt5313 * -428728141 >= 10) {
			throw new RuntimeException();
		} else if (arg0.anObjectArray8 != null) {
			@Pc(17) Class3_Sub17 local17 = new Class3_Sub17();
			local17.aClass178_2 = arg0;
			local17.anObjectArray1 = arg0.anObjectArray8;
			local17.anInt1262 = arg1.anInt5313 * 1646181909 + 1742076439;
			client.aClass553_45.method32702(local17);
		}
	}

	@OriginalMember(owner = "client!ch", name = "sw", descriptor = "(Lclient!vs;I)V", line = 7394)
	static final void method746(@OriginalArg(0) Class536 arg0) {
		@Pc(14) Class178 local14 = Class375.method27235(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local14.anInt3559 * 1976441867;
	}

	@OriginalMember(owner = "client!ch", name = "xo", descriptor = "(Lclient!vs;I)V", line = 8301)
	static final void method747(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass313Array1[local12].anInt4530 * -639487189;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "adq", descriptor = "(Lclient!vs;B)V", line = 9408)
	static final void method748(@OriginalArg(0) Class536 arg0) {
		if (Class13_Sub22.aClass566_1 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class13_Sub22.aClass566_1.anInt5371 * 1519418413;
		}
	}
}
