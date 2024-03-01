package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public class Class288 implements Interface55 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!uh;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method25509(@OriginalArg(0) Class502 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class502.aClass502_13 == arg0) {
			@Pc(9) Class574 local9 = Class438.aClass589_1.method33297(arg1[0]);
			return local9.method33097((int) arg2);
		} else if (arg0 == Class502.aClass502_2 || Class502.aClass502_7 == arg0) {
			@Pc(27) Class594 local27 = Class44_Sub3.aClass596_1.method33435((int) arg2);
			return local27.aString243;
		} else if (Class502.aClass502_4 == arg0 || Class502.aClass502_5 == arg0 || arg0 == Class502.aClass502_1) {
			return Class438.aClass589_1.method33297(arg1[0]).method33097((int) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "(Lclient!uh;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method25508(@OriginalArg(0) Class502 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class502.aClass502_13 == arg0) {
			@Pc(9) Class574 local9 = Class438.aClass589_1.method33297(arg1[0]);
			return local9.method33097((int) arg2);
		} else if (arg0 == Class502.aClass502_2 || Class502.aClass502_7 == arg0) {
			@Pc(27) Class594 local27 = Class44_Sub3.aClass596_1.method33435((int) arg2);
			return local27.aString243;
		} else if (Class502.aClass502_4 == arg0 || Class502.aClass502_5 == arg0 || arg0 == Class502.aClass502_1) {
			return Class438.aClass589_1.method33297(arg1[0]).method33097((int) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "(Lclient!uh;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method25507(@OriginalArg(0) Class502 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class502.aClass502_13 == arg0) {
			@Pc(9) Class574 local9 = Class438.aClass589_1.method33297(arg1[0]);
			return local9.method33097((int) arg2);
		} else if (arg0 == Class502.aClass502_2 || Class502.aClass502_7 == arg0) {
			@Pc(27) Class594 local27 = Class44_Sub3.aClass596_1.method33435((int) arg2);
			return local27.aString243;
		} else if (Class502.aClass502_4 == arg0 || Class502.aClass502_5 == arg0 || arg0 == Class502.aClass502_1) {
			return Class438.aClass589_1.method33297(arg1[0]).method33097((int) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "(II)V", line = 114)
	public static void method25511(@OriginalArg(0) int arg0) {
		if (client.anInt3039 * 1115111877 == 16) {
			@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_46, client.aClass82_1.aClass577_2);
			local11.aClass3_Sub41_Sub1_1.method20250(arg0);
			client.aClass82_1.method21601(local11);
		}
	}

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "(Lclient!fo;IIB)V", line = 537)
	static void method25513(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (client.aBoolean596) {
			@Pc(15) Class630 local15 = Class354.anInt4634 * 670813509 == -1 ? null : Class3_Sub20.aClass625_1.method33783(Class354.anInt4634 * 670813509);
			if (client.method22372(arg0).method11809() && (Class162.anInt3446 * -1948586859 & 0x20) != 0 && (local15 == null || arg0.method23442(Class354.anInt4634 * 670813509, local15.anInt5585 * 100041865) != local15.anInt5585 * 100041865)) {
				Class531.method32488(client.aString153, client.aString152 + " " + Class1.aString2 + " " + arg0.aString170, Class484.anInt5179 * -823340541, 58, arg0.anInt3559 * 1976441867, 0L, arg0.anInt3491 * 18828465, arg0.anInt3570 * 954808515, true, false, (long) (arg0.anInt3491 * 18828465 << 0 | arg0.anInt3570 * 954808515), false);
			}
		}
		for (@Pc(96) int local96 = 9; local96 >= 5; local96--) {
			@Pc(104) String local104 = Class445.method28333(arg0, local96);
			if (local104 != null) {
				Class531.method32488(local104, arg0.aString170, Class3_Sub4.method10251(arg0, local96), 1007, arg0.anInt3559 * 1976441867, (long) (local96 + 1), arg0.anInt3491 * 18828465, arg0.anInt3570 * 954808515, true, false, (long) (arg0.anInt3491 * 18828465 << 0 | arg0.anInt3570 * 954808515), false);
			}
		}
		@Pc(154) String local154 = Class497.method29342(arg0);
		if (local154 != null) {
			Class531.method32488(local154, arg0.aString170, arg0.anInt3548 * -1578871233, 25, arg0.anInt3559 * 1976441867, 0L, arg0.anInt3491 * 18828465, arg0.anInt3570 * 954808515, true, false, (long) (arg0.anInt3491 * 18828465 << 0 | arg0.anInt3570 * 954808515), false);
		}
		for (@Pc(197) int local197 = 4; local197 >= 0; local197--) {
			@Pc(204) String local204 = Class445.method28333(arg0, local197);
			if (local204 != null) {
				Class531.method32488(local204, arg0.aString170, Class3_Sub4.method10251(arg0, local197), 57, arg0.anInt3559 * 1976441867, (long) (local197 + 1), arg0.anInt3491 * 18828465, arg0.anInt3570 * 954808515, true, false, (long) (arg0.anInt3491 * 18828465 << 0 | arg0.anInt3570 * 954808515), false);
			}
		}
		if (!client.method22372(arg0).method11804()) {
			return;
		}
		if (arg0.aString171 == null) {
			Class531.method32488(Class601.aClass601_20.method33512(Class469.aClass530_2), "", -1, 30, arg0.anInt3559 * 1976441867, 0L, arg0.anInt3491 * 18828465, arg0.anInt3570 * 954808515, true, false, (long) (arg0.anInt3491 * 18828465 << 0 | arg0.anInt3570 * 954808515), false);
		} else {
			Class531.method32488(arg0.aString171, "", -1, 30, arg0.anInt3559 * 1976441867, 0L, arg0.anInt3491 * 18828465, arg0.anInt3570 * 954808515, true, false, (long) (arg0.anInt3491 * 18828465 << 0 | arg0.anInt3570 * 954808515), false);
		}
	}

	@OriginalMember(owner = "client!ku", name = "qt", descriptor = "(Lclient!vs;B)V", line = 7084)
	static final void method25512(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class341.method26460(local11, arg0);
	}

	@OriginalMember(owner = "client!ku", name = "acf", descriptor = "(Lclient!vs;I)V", line = 9121)
	static final void method25510(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class594 local28 = Class44_Sub3.aClass596_1.method33435(local13);
		if (local23 < 1 || local23 > 5 || local28.aStringArray24[local23 - 1] == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.aStringArray24[local23 - 1];
		}
	}
}
