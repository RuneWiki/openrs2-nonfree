package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public class Class406 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	static final int anInt4810 = 2;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	static final int anInt4811 = 8;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
	static final int anInt4812 = 63;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	static final int anInt4813 = 16;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	static final int anInt4814 = 62;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	static final int anInt4815 = 1;

	@OriginalMember(owner = "client!qh", name = "ba", descriptor = "Ljava/lang/String;")
	static String aString218;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 11)
	Class406() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "(II)V", line = 108)
	public static void method27658(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(5, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "(IIIIIIFZB)[[I", line = 218)
	public static int[][] method27659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) boolean arg6) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class3_Sub46_Sub1 local7 = new Class3_Sub46_Sub1();
		local7.aBoolean490 = arg6;
		local7.anInt2793 = arg2 * 2093581431;
		local7.anInt2787 = arg3 * -2066376489;
		local7.anInt2791 = arg4 * 1146713033;
		local7.anInt2792 = (int) (arg5 * 4096.0F) * -699376425;
		local7.method20161();
		Class602.method33521(arg0, arg1);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method20155(local42, local3[local42]);
		}
		return local3;
	}

	@OriginalMember(owner = "client!qh", name = "fs", descriptor = "(I)Lclient!av;", line = 1925)
	public static Class82 method27657() {
		return Class108.method21938(client.anInt3039 * 1115111877) || client.anInt3039 * 1115111877 == 16 ? client.aClass82_1 : client.aClass82_2;
	}

	@OriginalMember(owner = "client!qh", name = "qx", descriptor = "(Lclient!vs;B)V", line = 7039)
	static final void method27655(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		if (local11.aString170 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local11.aString170;
		}
	}

	@OriginalMember(owner = "client!qh", name = "aov", descriptor = "(Lclient!vs;B)V", line = 11567)
	static final void method27656(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub33_3.method14179();
	}
}
