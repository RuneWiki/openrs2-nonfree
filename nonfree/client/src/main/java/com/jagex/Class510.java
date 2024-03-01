package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public class Class510 {

	@OriginalMember(owner = "client!uq", name = "az", descriptor = "Ljava/io/File;")
	static File aFile4;

	@OriginalMember(owner = "client!uq", name = "vm", descriptor = "Lclient!ft;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!uq", name = "dh", descriptor = "Lclient!aht;")
	public static Class3_Sub45 aClass3_Sub45_37;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	public int anInt5258;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(I)V", line = 6)
	public Class510(@OriginalArg(0) int arg0) {
		this.anInt5258 = arg0 * 1831444979;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V", line = 46)
	static void method29576(@OriginalArg(0) int arg0) {
		Class212.anInt3704 = arg0 * 1567954517;
		Class68.aClass161_10.method23224();
	}

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "(I[ILclient!fw;ZI)Lclient!fw;", line = 291)
	public static Class186 method29578(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class186 arg2, @OriginalArg(3) boolean arg3) {
		if (!Class504.aClass359_93.method26675(arg0)) {
			return null;
		}
		@Pc(11) int local11 = Class504.aClass359_93.method26682(arg0);
		@Pc(17) Class178[] local17;
		if (local11 == 0) {
			local17 = new Class178[0];
		} else if (arg2 == null) {
			local17 = new Class178[local11];
		} else {
			local17 = arg2.aClass178Array8;
		}
		if (arg2 == null) {
			arg2 = new Class186(arg3, local17);
		} else {
			arg2.aClass178Array8 = local17;
			arg2.aBoolean657 = arg3;
		}
		for (@Pc(44) int local44 = 0; local44 < local11; local44++) {
			if (arg2.aClass178Array8[local44] == null) {
				@Pc(59) byte[] local59 = Class504.aClass359_93.method26672(arg0, local44, arg1);
				if (local59 != null) {
					@Pc(71) Class178 local71 = arg2.aClass178Array8[local44] = new Class178();
					local71.anInt3570 = ((arg0 << 16) + local44) * 1526544363;
					local71.method23429(new Class3_Sub41(local59));
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!uq", name = "nf", descriptor = "(Lclient!vs;I)V", line = 6567)
	static final void method29577(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class564.method32900(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "aal", descriptor = "(Lclient!vs;B)V", line = 8747)
	static final void method29580(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(18) int local18 = client.aClass367Array1[local12].method26908();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local18 == 5 ? 1 : 0;
	}

	@OriginalMember(owner = "client!uq", name = "jv", descriptor = "(ILjava/lang/String;S)V", line = 9465)
	public static void method29579(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(3) int local3 = Class52.anInt1127 * 701602229;
		@Pc(5) int[] local5 = Class52.anIntArray167;
		@Pc(7) boolean local7 = false;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			@Pc(18) Class26_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local5[local9]];
			if (local18 != null && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != local18 && local18.aString75 != null && local18.aString75.equalsIgnoreCase(arg1)) {
				@Pc(34) Class311 local34 = null;
				if (arg0 == 1) {
					local34 = Class311.aClass311_28;
				} else if (arg0 == 4) {
					local34 = Class311.aClass311_40;
				} else if (arg0 == 5) {
					local34 = Class311.aClass311_43;
				} else if (arg0 == 6) {
					local34 = Class311.aClass311_32;
				} else if (arg0 == 7) {
					local34 = Class311.aClass311_72;
				} else if (arg0 == 9) {
					local34 = Class311.aClass311_66;
				}
				if (local34 != null) {
					@Pc(77) Class3_Sub23 local77 = Class269.method25284(local34, client.aClass82_2.aClass577_2);
					local77.aClass3_Sub41_Sub1_1.method20301(0);
					local77.aClass3_Sub41_Sub1_1.method20312(local5[local9]);
					client.aClass82_2.method21601(local77);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Class544.method32611(4, Class601.aClass601_130.method33512(Class469.aClass530_2) + arg1);
		}
	}
}
