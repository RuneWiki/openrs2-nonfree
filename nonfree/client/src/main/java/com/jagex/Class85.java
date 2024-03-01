package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public class Class85 {

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Z")
	static boolean aBoolean534;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
	boolean aBoolean532;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	int anInt2924;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	int anInt2925;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Z")
	boolean aBoolean533;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	int anInt2926;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 10)
	Class85() {
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "(Lclient!cy;B)V", line = 83)
	public static void method21640(@OriginalArg(0) Class11 arg0) {
		@Pc(7) Class3_Sub1_Sub11 local7 = Class60_Sub34.method14470(1, (long) (arg0.anInt130 * -112096509));
		local7.method19145();
	}

	@OriginalMember(owner = "client!b", name = "s", descriptor = "(IIIIIIIIIB)V", line = 160)
	static final void method21639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass370_1.method26943() - 2 || arg3 > client.aClass370_1.method27062() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass370_1.method27075().method26504(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass370_1.method26950() == null) {
			return;
		}
		client.aClass370_1.method26959().method9456(Class613.aClass21_13, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class510.aClass3_Sub45_37.aClass60_Sub31_1.method13987();
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
			client.aClass370_1.method26959().method9461(Class613.aClass21_13, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, local55);
		}
		Class3_Sub10.method11192(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(CB)Z", line = 186)
	public static boolean method21638(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!b", name = "ht", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5478)
	static final void method21635(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 1248498196;
		arg0.anInt3565 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * -617738471;
		arg0.anInt3567 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -1934705839;
		arg0.anInt3568 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2] * -182962305;
		arg0.anInt3490 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 3] * 356667763;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!b", name = "sa", descriptor = "(Lclient!vs;I)V", line = 7500)
	static final void method21636(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(19) Class3_Sub23 local19 = Class269.method25284(Class311.aClass311_63, client.aClass82_2.aClass577_2);
		local19.aClass3_Sub41_Sub1_1.method20250(local13.length() + 1);
		local19.aClass3_Sub41_Sub1_1.method20260(local13);
		client.aClass82_2.method21601(local19);
	}

	@OriginalMember(owner = "client!b", name = "abt", descriptor = "(Lclient!vs;I)V", line = 8957)
	static final void method21637(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Integer.toString(local12);
	}
}
