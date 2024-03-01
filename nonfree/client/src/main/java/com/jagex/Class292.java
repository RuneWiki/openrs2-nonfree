package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
final class Class292 implements Interface34 {

	@OriginalMember(owner = "client!l", name = "p", descriptor = "(Lclient!ya;Lclient!ahb;B)Lclient!yo;", line = 43)
	public static Class605 method25555(@OriginalArg(0) Class594 arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		@Pc(4) Class605 local4 = new Class605(arg0);
		@Pc(8) int local8 = arg1.method20269();
		@Pc(17) boolean local17 = (local8 & 0x1) != 0;
		@Pc(26) boolean local26 = (local8 & 0x2) != 0;
		@Pc(35) boolean local35 = (local8 & 0x4) != 0;
		@Pc(44) boolean local44 = (local8 & 0x8) != 0;
		if (local17) {
			local4.anIntArray521[0] = arg1.method20375();
			local4.anIntArray522[0] = arg1.method20375();
			if (arg0.anInt5482 * 457019623 != -1 || arg0.anInt5484 * -142090397 != -1) {
				local4.anIntArray521[1] = arg1.method20375();
				local4.anIntArray522[1] = arg1.method20375();
			}
			if (arg0.anInt5485 * 1159698617 != -1 || arg0.anInt5499 * -323024195 != -1) {
				local4.anIntArray521[2] = arg1.method20375();
				local4.anIntArray522[2] = arg1.method20375();
			}
		}
		if (local26) {
			local4.anIntArray523[0] = arg1.method20375();
			local4.anIntArray524[0] = arg1.method20375();
			if (-159642721 * arg0.anInt5480 != -1 || arg0.anInt5479 * -264196485 != -1) {
				local4.anIntArray523[1] = arg1.method20375();
				local4.anIntArray524[1] = arg1.method20375();
			}
		}
		@Pc(160) int local160;
		@Pc(163) int[] local163;
		@Pc(195) int local195;
		if (local35) {
			local160 = arg1.method20271();
			local163 = new int[] { local160 & 0xF, local160 >> 4 & 0xF, local160 >> 8 & 0xF, local160 >> 12 & 0xF };
			for (local195 = 0; local195 < 4; local195++) {
				if (local163[local195] != 15) {
					local4.aShortArray139[local163[local195]] = (short) arg1.method20271();
				}
			}
		}
		if (local44) {
			local160 = arg1.method20269();
			local163 = new int[] { local160 & 0xF, local160 >> 4 & 0xF };
			for (local195 = 0; local195 < 2; local195++) {
				if (local163[local195] != 15) {
					local4.aShortArray140[local163[local195]] = (short) arg1.method20271();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "([BLclient!yx;ZB)Ljava/lang/Object;", line = 580)
	@Override
	public Object method25550(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) boolean arg2) {
		return Class613.aClass21_13.method17096(arg1, (Class15_Sub1[]) Class137.method22940(arg0), arg2);
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "([BLclient!yx;Z)Ljava/lang/Object;", line = 580)
	@Override
	public Object method25549(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) boolean arg2) {
		return Class613.aClass21_13.method17096(arg1, (Class15_Sub1[]) Class137.method22940(arg0), arg2);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([BLclient!yx;Z)Ljava/lang/Object;", line = 580)
	@Override
	public Object method25551(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class611 arg1, @OriginalArg(2) boolean arg2) {
		return Class613.aClass21_13.method17096(arg1, (Class15_Sub1[]) Class137.method22940(arg0), arg2);
	}

	@OriginalMember(owner = "client!l", name = "az", descriptor = "(Lclient!aml;I)Ljava/lang/String;", line = 1085)
	public static String method25552(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		return Class250.aBoolean688 || arg0 == null ? "" : arg0.aString110;
	}

	@OriginalMember(owner = "client!l", name = "if", descriptor = "(IIIB)Lclient!act;", line = 5205)
	static Class26_Sub1_Sub1_Sub1 method25556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class432 local10 = client.aClass370_1.method26950().aClass432ArrayArrayArray3[arg0][arg1][arg2];
		if (local10 == null) {
			return null;
		}
		@Pc(16) Class26_Sub1_Sub1_Sub1 local16 = null;
		@Pc(18) int local18 = -1;
		for (@Pc(21) Class437 local21 = local10.aClass437_1; local21 != null; local21 = local21.aClass437_3) {
			@Pc(27) Class26_Sub1_Sub1 local27 = local21.aClass26_Sub1_Sub1_1;
			if (local27 instanceof Class26_Sub1_Sub1_Sub1) {
				@Pc(33) Class26_Sub1_Sub1_Sub1 local33 = (Class26_Sub1_Sub1_Sub1) local27;
				@Pc(43) int local43 = (local33.method16630() - 1) * 256 + 252;
				@Pc(47) Class320 local47 = local33.method21431().aClass320_61;
				@Pc(55) int local55 = (int) local47.aFloat259 - local43 >> 9;
				@Pc(63) int local63 = (int) local47.aFloat261 - local43 >> 9;
				@Pc(71) int local71 = (int) local47.aFloat259 + local43 >> 9;
				@Pc(79) int local79 = (int) local47.aFloat261 + local43 >> 9;
				if (local55 <= arg1 && local63 <= arg2 && local71 >= arg1 && local79 >= arg2) {
					@Pc(103) int local103 = (local71 + 1 - arg1) * (local79 + 1 - arg2);
					if (local103 > local18) {
						local16 = local33;
						local18 = local103;
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!l", name = "ajc", descriptor = "(Lclient!vs;B)V", line = 10632)
	static final void method25553(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class158.method23198(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
	}

	@OriginalMember(owner = "client!l", name = "ass", descriptor = "(Lclient!vs;B)V", line = 12342)
	static final void method25554(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13983() ? 1 : 0;
	}
}
