package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public class Class468 implements Interface50 {

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "[I")
	final int[] anIntArray468;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "([I)V", line = 11)
	Class468(@OriginalArg(0) int[] arg0) {
		this.anIntArray468 = arg0;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 17)
	@Override
	public boolean method28751(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		@Pc(2) int[] local2 = this.anIntArray468;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method13145(local12)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;I)Z", line = 17)
	@Override
	public boolean method28750(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		@Pc(2) int[] local2 = this.anIntArray468;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method13145(local12)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 17)
	@Override
	public boolean method28752(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		@Pc(2) int[] local2 = this.anIntArray468;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method13145(local12)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "(Lclient!agg;[Lclient!qd;ILclient!qt;)Z", line = 17)
	@Override
	public boolean method28753(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Interface46[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		@Pc(2) int[] local2 = this.anIntArray468;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method13145(local12)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "(Lclient!ahb;)Lclient!sw;", line = 27)
	public static Class468 method28744(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method20269();
		}
		return new Class468(local6);
	}

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "(Lclient!vs;I)V", line = 65)
	static void method28746(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][0];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "(IIII)I", line = 240)
	public static final int method28745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!sw", name = "pw", descriptor = "(Lclient!vs;I)V", line = 6892)
	static final void method28747(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local11.aString169;
	}

	@OriginalMember(owner = "client!sw", name = "qq", descriptor = "(B)J", line = 7110)
	static final long method28748() {
		return (long) ((Class525.anInt5298 += -1015160261) * 795911923 - 1) << 32 | 0xFFFFFFFFL;
	}

	@OriginalMember(owner = "client!sw", name = "acb", descriptor = "(Lclient!vs;I)V", line = 9194)
	static final void method28749(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (local28.method33850()) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class44_Sub3.aClass596_1.method33435(local13).method33376(local23, local28.aString248);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub3.aClass596_1.method33435(local13).method33375(local23, local28.anInt5585 * 100041865);
		}
	}
}
