package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiz")
final class Class127_Sub5 extends Class127 {

	@OriginalMember(owner = "client!aiz", name = "<init>", descriptor = "(Lclient!xl;IZZ)V", line = 35)
	Class127_Sub5(@OriginalArg(0) Class647 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class127_Sub1) null);
	}

	@OriginalMember(owner = "client!aiz", name = "q", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 37)
	@Override
	Object method13153(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_113 || Class498.aClass498_8 == arg0.aClass498_6 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!aiz", name = "t", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 37)
	@Override
	Object method13151(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_113 || Class498.aClass498_8 == arg0.aClass498_6 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!aiz", name = "x", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 37)
	@Override
	Object method13152(@OriginalArg(0) Class75 arg0) {
		return arg0.aClass498_6 == Class498.aClass498_113 || Class498.aClass498_8 == arg0.aClass498_6 ? -1 : arg0.aClass498_6.method30201();
	}

	@OriginalMember(owner = "client!aiz", name = "q", descriptor = "([I[F[FIII)V", line = 143)
	static void method13159(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg4) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = Long.MAX_VALUE == (long) local14 ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < (local63 & local61) + local14) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		method13159(arg0, arg1, arg2, arg3, local10 - 1);
		method13159(arg0, arg1, arg2, local10 + 1, arg4);
	}

	@OriginalMember(owner = "client!aiz", name = "v", descriptor = "(I)Z", line = 153)
	static boolean method13160() {
		return Class672.method33213(Class695.aClass635_1.aClass600_3);
	}

	@OriginalMember(owner = "client!aiz", name = "id", descriptor = "(B)V", line = 4606)
	public static final void method13161() {
		@Pc(4) int local4 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2.method15438();
		if (local4 == 0) {
			client.aClass517_1.method30458(null);
			Class252.method26182(0);
		} else if (local4 == 1 || local4 == 3) {
			Class652.method32973((byte) 0);
			Class252.method26182(512);
			if (client.aClass517_1.method30435() != null) {
				Class705.method36568();
			}
		} else {
			Class652.method32973((byte) (client.anInt3447 * 1373322351 - 4 & 0xFF));
			Class252.method26182(2);
		}
		client.anInt3457 = Class669.anInt5790 * -1097084975;
	}
}
