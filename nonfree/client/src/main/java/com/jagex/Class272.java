package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class272 {

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString175 = "#";

	@OriginalMember(owner = "client!gg", name = "fy", descriptor = "Lclient!pw;")
	public static Class478 aClass478_92;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 6)
	Class272() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", line = 11)
	public static final boolean method26524(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", line = 11)
	public static final boolean method26525(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Lclient!dx;IILclient!gm;II)V", line = 29)
	static void method26526(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class463.method29543(false, true);
				@Pc(31) int local31 = Class424.anIntArray462[local23];
				Class459.method29505(false, true);
				arg0.method20088((arg3.anInt3874 * -881188269 * local5 >> 7) + arg1, arg2 + (arg3.anInt3875 * -1279656873 * (7 - local1) >> 3), (arg3.anInt3874 * -881188269 >> 7) + 1, (arg3.anInt3875 * -1279656873 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "(B)Z", line = 53)
	static boolean method26527() {
		return Class434.aBoolean749;
	}

	@OriginalMember(owner = "client!gg", name = "rg", descriptor = "(Lclient!yf;I)V", line = 7666)
	static final void method26528(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class53.method794(local16, arg0);
	}

	@OriginalMember(owner = "client!gg", name = "zh", descriptor = "(Lclient!yf;B)V", line = 9074)
	static final void method26529(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 0 || local12 >= client.anInt3532 * 2103713403) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aClass217Array1[local12].aString169;
		}
	}

	@OriginalMember(owner = "client!gg", name = "aul", descriptor = "(Lclient!yf;I)V", line = 12976)
	static final void method26530(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local23);
		if (local29.method968()) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class302) Class251.aClass35_Sub10_3.method18319(local13)).method27149(local23, local29.aString13);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class302) Class251.aClass35_Sub10_3.method18319(local13)).method27146(local23, local29.anInt198 * 263946597);
		}
	}

	@OriginalMember(owner = "client!gg", name = "avv", descriptor = "(Lclient!yf;I)V", line = 13220)
	static final void method26531(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15947() ? 1 : 0;
	}

	@OriginalMember(owner = "client!gg", name = "azn", descriptor = "(Lclient!yf;B)V", line = 13716)
	static final void method26532(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local13).method26397(local23);
	}
}
