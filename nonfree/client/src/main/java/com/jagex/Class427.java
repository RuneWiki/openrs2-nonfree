package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public class Class427 {

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
	public static final int anInt4824 = 15;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static final int anInt4825 = 32768;

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
	public static final int anInt4826 = 15;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V", line = 8)
	Class427() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Z", line = 149)
	static boolean method28797() {
		return Class672.method33213(Class695.aClass635_1.aClass600_2);
	}

	@OriginalMember(owner = "client!nr", name = "aq", descriptor = "(IIIIB)V", line = 260)
	static void method28798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(10, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
		local4.anInt2953 = arg2 * -1621355885;
		local4.anInt2954 = arg3 * -105177451;
	}

	@OriginalMember(owner = "client!nr", name = "aav", descriptor = "(Lclient!yf;I)V", line = 9264)
	static final void method28799(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.aByteArray83[local12];
	}

	@OriginalMember(owner = "client!nr", name = "nx", descriptor = "(IIIIIIIIIIIIIIZIS)V", line = 12421)
	static void method28800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) int arg15) {
		if (arg1 != 0 && arg3 != -1) {
			@Pc(7) Class104_Sub1_Sub1_Sub1 local7 = null;
			@Pc(14) int local14;
			if (arg1 < 0) {
				local14 = -arg1 - 1;
				if (local14 == client.anInt3389 * -643758853) {
					local7 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3;
				} else {
					local7 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local14];
				}
			} else {
				local14 = arg1 - 1;
				@Pc(37) Class77_Sub6 local37 = (Class77_Sub6) client.aClass12_22.method173((long) local14);
				if (local37 != null) {
					local7 = (Class104_Sub1_Sub1_Sub1) local37.anObject5;
				}
			}
			if (local7 != null) {
				@Pc(50) Class570 local50 = local7.method21105();
				if (local50.anIntArrayArray60 != null && local50.anIntArrayArray60[arg3] != null) {
					arg4 -= local50.anIntArrayArray60[arg3][1];
				}
				if (local50.anIntArrayArray61 != null && local50.anIntArrayArray61[arg3] != null) {
					arg4 -= local50.anIntArrayArray61[arg3][1];
				}
			}
		}
		@Pc(118) Class104_Sub1_Sub1_Sub6 local118 = new Class104_Sub1_Sub1_Sub6(client.aClass517_1.method30435(), arg0, Class421.anInt4804 * -1729998935, Class421.anInt4804 * -1729998935, arg6, arg7, arg4, arg10 + client.anInt3414, arg11 + client.anInt3414, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
		local118.method24184(arg8, arg9, Class277.method26658(arg8, arg9, Class421.anInt4804 * -1729998935) - arg5, client.anInt3414 + arg10);
		client.aClass695_45.method36383(new Class77_Sub1_Sub4(local118));
	}
}
