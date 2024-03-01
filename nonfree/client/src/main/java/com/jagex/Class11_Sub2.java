package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aay")
public class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!aay", name = "<init>", descriptor = "(Lclient!nw;I)V", line = 9)
	Class11_Sub2(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aay", name = "z", descriptor = "(Lclient!ahb;I)V", line = 12)
	@Override
	void method1200(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aay", name = "n", descriptor = "(Lclient!ahb;I)V", line = 12)
	@Override
	void method1205(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aay", name = "a", descriptor = "(Lclient!ahb;II)V", line = 12)
	@Override
	void method1198(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aay", name = "j", descriptor = "(Lclient!ahb;I)V", line = 12)
	@Override
	void method1210(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aay", name = "p", descriptor = "(I)[Lclient!wd;", line = 16)
	public static Class547[] method1218() {
		return new Class547[] { Class547.aClass547_4, Class547.aClass547_5, Class547.aClass547_2, Class547.aClass547_6, Class547.aClass547_3 };
	}

	@OriginalMember(owner = "client!aay", name = "l", descriptor = "(III)Lclient!fo;", line = 276)
	public static Class178 method1219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class178 local3 = Class375.method27235(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass178Array5 == null || arg1 >= local3.aClass178Array5.length) {
			return null;
		} else {
			return local3.aClass178Array5[arg1];
		}
	}

	@OriginalMember(owner = "client!aay", name = "br", descriptor = "(Lclient!vs;B)V", line = 4232)
	static final void method1216(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(18) Class534 local18;
		if (arg0.aBoolean822) {
			local18 = arg0.aClass534_2;
		} else {
			local18 = arg0.aClass534_1;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local18.method32513(local12, -1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aay", name = "ze", descriptor = "(Lclient!vs;I)V", line = 8636)
	static final void method1220(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.anIntArray399[local12];
	}

	@OriginalMember(owner = "client!aay", name = "mf", descriptor = "(Ljava/lang/String;ZS)V", line = 11659)
	public static void method1217(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class21_Sub1.anInt289 = 0;
		if (client.anInt3175 * -275349883 == client.anInt3177 * 315283673 && client.aBoolean607 == arg1 && local2.equals(Class331.aString207)) {
			return;
		}
		Class331.aString207 = local2;
		client.anInt3177 = client.anInt3175 * 16000909;
		client.aBoolean607 = arg1;
		@Pc(30) short[] local30 = new short[16];
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < Class44_Sub3.aClass596_1.anInt5517 * 386588925; local34++) {
			@Pc(45) Class594 local45 = Class44_Sub3.aClass596_1.method33435(local34);
			if ((!arg1 || local45.aBoolean844) && local45.anInt5495 * 847909323 == -1 && local45.anInt5497 * -1331987253 == -1 && local45.anInt5513 * 1437932437 == -1 && local45.anInt5509 * -2020209923 == 0 && local45.aString243.toLowerCase().indexOf(local2) != -1) {
				if (local32 >= 250) {
					Class177.anInt3474 = -1267492223;
					Class354.aShortArray108 = null;
					return;
				}
				if (local32 >= local30.length) {
					@Pc(101) short[] local101 = new short[local30.length * 2];
					for (@Pc(103) int local103 = 0; local103 < local32; local103++) {
						local101[local103] = local30[local103];
					}
					local30 = local101;
				}
				local30[local32++] = (short) local34;
			}
		}
		Class354.aShortArray108 = local30;
		Class177.anInt3474 = local32 * 1267492223;
		@Pc(135) String[] local135 = new String[Class177.anInt3474 * -908764545];
		for (@Pc(137) int local137 = 0; local137 < Class177.anInt3474 * -908764545; local137++) {
			local135[local137] = Class44_Sub3.aClass596_1.method33435(local30[local137]).aString243;
		}
		Class439.method28216(local135, Class354.aShortArray108);
	}
}
