package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public class Class435 {

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 7)
	Class435() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rm", name = "aa", descriptor = "(II)V", line = 47)
	public static void method27996(@OriginalArg(0) int arg0) {
		Class13_Sub18.anInt694 = arg0 * 1541295941;
		Class3_Sub22_Sub2.aClass3_Sub22_Sub2Array1 = new Class3_Sub22_Sub2[arg0];
		Class134.anInt3383 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)Lclient!wm;", line = 131)
	public static Class555 method27992() {
		return Class13_Sub13.aClass555_1 == null ? Class555.aClass555_7 : Class13_Sub13.aClass555_1;
	}

	@OriginalMember(owner = "client!rm", name = "gw", descriptor = "(Lclient!vs;I)V", line = 5273)
	static final void method27997(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class224.method24455(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!rm", name = "kl", descriptor = "(Lclient!fo;[B[BLclient!vs;I)V", line = 5908)
	static final void method27995(@OriginalArg(0) Class178 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class536 arg3) {
		@Pc(14) int local14 = arg3.anIntArray496[(arg3.anInt5319 -= 312124549) * 960738381] - 1;
		if (local14 < 0 || local14 > 9) {
			throw new RuntimeException();
		}
		Class370.method27078(arg0, local14, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rm", name = "ok", descriptor = "(Lclient!vs;B)V", line = 6774)
	static final void method27994(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class364.method26785(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!rm", name = "jt", descriptor = "(Lclient!act;[IIZB)V", line = 9376)
	public static void method27993(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) boolean local4;
		@Pc(6) int local6;
		if (arg0.anIntArray234 != null) {
			local4 = true;
			for (local6 = 0; local6 < arg0.anIntArray234.length; local6++) {
				if (arg1[local6] != arg0.anIntArray234[local6]) {
					local4 = false;
					break;
				}
			}
			@Pc(27) Class71 local27 = arg0.aClass71_3;
			if (local4 && local27.method20021()) {
				@Pc(38) Class440 local38 = arg0.aClass71_3.method20069();
				@Pc(43) int local43 = local38.anInt4928 * -413041149;
				if (local43 == 1) {
					local27.method20023(arg2);
				}
				if (local43 == 2) {
					local27.method20040();
				}
			}
		}
		local4 = true;
		for (local6 = 0; local6 < arg1.length; local6++) {
			if (arg1[local6] != -1) {
				local4 = false;
			}
			if (arg0.anIntArray234 == null || arg0.anIntArray234[local6] == -1 || Class110.aClass436_1.method27999(arg1[local6]).anInt4932 * -2127032365 >= Class110.aClass436_1.method27999(arg0.anIntArray234[local6]).anInt4932 * -2127032365) {
				arg0.anIntArray234 = arg1;
				arg0.aClass71_3.method20025(arg2);
				if (arg3) {
					arg0.anInt2385 = arg0.anInt2362 * -1492923025;
				}
			}
		}
		if (!local4) {
			return;
		}
		arg0.anIntArray234 = arg1;
		arg0.aClass71_3.method20025(arg2);
		if (arg3) {
			arg0.anInt2385 = arg0.anInt2362 * -1492923025;
		}
	}
}
