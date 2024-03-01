package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xt")
public class Class586 {

	@OriginalMember(owner = "client!xt", name = "kb", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!xt", name = "p", descriptor = "[I")
	public int[] anIntArray513;

	@OriginalMember(owner = "client!xt", name = "a", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!xt", name = "<init>", descriptor = "([I[S)V", line = 7)
	public Class586(@OriginalArg(0) int[] arg0, @OriginalArg(1) short[] arg1) {
		this.anIntArray513 = arg0;
		this.aShortArray133 = arg1;
	}

	@OriginalMember(owner = "client!xt", name = "<init>", descriptor = "(Lclient!xc;)V", line = 12)
	public Class586(@OriginalArg(0) Class571 arg0) {
		this.anIntArray513 = new int[8];
		this.aShortArray133 = new short[8];
		@Pc(11) int local11 = 0;
		if (arg0.anIntArray507 != null && arg0.aShortArray130 != null) {
			local11 = arg0.anIntArray507.length;
			System.arraycopy(arg0.anIntArray507, 0, this.anIntArray513, 0, local11);
			System.arraycopy(arg0.aShortArray130, 0, this.aShortArray133, 0, local11);
		}
		for (@Pc(41) int local41 = local11; local41 < 8; local41++) {
			this.anIntArray513[local41] = -1;
			this.aShortArray133[local41] = -1;
		}
	}

	@OriginalMember(owner = "client!xt", name = "c", descriptor = "(B)V", line = 370)
	static void method33283() {
		if (Class390.anInt3018 * -96764183 > 1) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub20_1, 4);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub20_1, 2);
		}
	}

	@OriginalMember(owner = "client!xt", name = "kx", descriptor = "(IIILjava/lang/String;I)V", line = 9595)
	public static void method33284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(4) Class178 local4 = Class11_Sub2.method1219(arg1, arg2);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray26 != null) {
			@Pc(15) Class3_Sub17 local15 = new Class3_Sub17();
			local15.aClass178_2 = local4;
			local15.anInt1259 = arg0 * -1401492969;
			local15.aString45 = arg3;
			local15.anObjectArray1 = local4.anObjectArray26;
			Class410.method27671(local15);
		}
		if (!client.method22372(local4).method11807(arg0 - 1)) {
			return;
		}
		@Pc(45) Class82 local45 = Class406.method27657();
		if (client.anInt3039 * 1115111877 != 18 && client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 16) {
			return;
		}
		if (local4.aString168 == null) {
			Class526.method32416(local45, local4, arg0, arg1, arg2);
			return;
		}
		@Pc(78) Class3_Sub23 local78 = Class269.method25284(Class311.aClass311_53, local45.aClass577_2);
		local78.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(local4.aString168) + 7);
		local78.aClass3_Sub41_Sub1_1.method20260(local4.aString168);
		local78.aClass3_Sub41_Sub1_1.method20353(arg1);
		local78.aClass3_Sub41_Sub1_1.method20251(arg2);
		local78.aClass3_Sub41_Sub1_1.method20302(arg0);
		local45.method21601(local78);
	}
}
