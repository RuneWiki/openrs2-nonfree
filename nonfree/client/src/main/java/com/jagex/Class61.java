package com.jagex;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acl")
public class Class61 {

	@OriginalMember(owner = "client!acl", name = "hx", descriptor = "Lclient!ans;")
	public static Class35_Sub11 aClass35_Sub11_1;

	@OriginalMember(owner = "client!acl", name = "p", descriptor = "[[Ljava/lang/String;")
	static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

	@OriginalMember(owner = "client!acl", name = "c", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!acl", name = "v", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!acl", name = "<init>", descriptor = "()V", line = 25)
	Class61() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acl", name = "g", descriptor = "(JI)Ljava/lang/String;", line = 30)
	public static String method886(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class694.method36377(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(9) int local9 = aCalendar2.get(2);
		@Pc(13) int local13 = aCalendar2.get(1);
		return arg1 == 3 ? Class63.method923(arg0, arg1) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!acl", name = "z", descriptor = "(JIZ)Ljava/lang/String;", line = 40)
	public static String method887(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class397.method28437(arg0);
			local5 = aCalendar1;
		} else {
			Class694.method36377(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class466.method29558(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!acl", name = "j", descriptor = "(JIZ)Ljava/lang/String;", line = 40)
	public static String method888(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class397.method28437(arg0);
			local5 = aCalendar1;
		} else {
			Class694.method36377(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class466.method29558(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!acl", name = "i", descriptor = "(JIZ)Ljava/lang/String;", line = 59)
	static String method889(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) Calendar local5;
		if (arg1) {
			Class397.method28437(arg0);
			local5 = aCalendar1;
		} else {
			Class694.method36377(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!acl", name = "k", descriptor = "(JI)Ljava/lang/String;", line = 76)
	static String method890(@OriginalArg(0) long arg0) {
		Class694.method36377(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(11) int local11 = aCalendar2.get(2) + 1;
		@Pc(15) int local15 = aCalendar2.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!acl", name = "u", descriptor = "(JI)Ljava/lang/String;", line = 76)
	static String method891(@OriginalArg(0) long arg0) {
		Class694.method36377(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(11) int local11 = aCalendar2.get(2) + 1;
		@Pc(15) int local15 = aCalendar2.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!acl", name = "e", descriptor = "(JI)Ljava/lang/String;", line = 84)
	public static String method892(@OriginalArg(0) long arg0) {
		Class694.method36377(arg0);
		@Pc(5) int local5 = aCalendar2.get(11);
		@Pc(9) int local9 = aCalendar2.get(12);
		@Pc(13) int local13 = aCalendar2.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!acl", name = "f", descriptor = "(J)V", line = 96)
	static void method893(@OriginalArg(0) long arg0) {
		aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acl", name = "o", descriptor = "(J)V", line = 100)
	static void method894(@OriginalArg(0) long arg0) {
		aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acl", name = "b", descriptor = "(I)[I", line = 104)
	public static int[] method895(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class694.method36377(Class290.method26994(arg0));
		local2[0] = aCalendar2.get(5);
		local2[1] = aCalendar2.get(2);
		local2[2] = aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!acl", name = "a", descriptor = "(I)[I", line = 104)
	public static int[] method896(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class694.method36377(Class290.method26994(arg0));
		local2[0] = aCalendar2.get(5);
		local2[1] = aCalendar2.get(2);
		local2[2] = aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!acl", name = "n", descriptor = "(I)[I", line = 104)
	public static int[] method897(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class694.method36377(Class290.method26994(arg0));
		local2[0] = aCalendar2.get(5);
		local2[1] = aCalendar2.get(2);
		local2[2] = aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!acl", name = "m", descriptor = "(IIIIII)J", line = 113)
	public static long method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar1.clear();
		aCalendar1.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar1.getTime().getTime();
	}

	@OriginalMember(owner = "client!acl", name = "h", descriptor = "(I)J", line = 119)
	public static long method899(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!acl", name = "ai", descriptor = "(J)I", line = 123)
	public static int method900(@OriginalArg(0) long arg0) {
		Class694.method36377(arg0);
		return aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!acl", name = "aj", descriptor = "(J)I", line = 123)
	public static int method901(@OriginalArg(0) long arg0) {
		Class694.method36377(arg0);
		return aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!acl", name = "gx", descriptor = "(I)V", line = 3359)
	public static final void method902() {
		if (client.anInt3441 * -1351358339 == -1 || client.anInt3442 * 1614995835 == -1) {
			return;
		}
		@Pc(28) int local28 = client.anInt3386 * -444594113 + (client.anInt3444 * -1927250963 * (client.anInt3501 * -1698962903 - client.anInt3386 * -444594113) >> 16);
		client.anInt3444 += local28 * 139663845;
		if (client.anInt3444 * -1927250963 >= 65535) {
			client.anInt3444 = 294774299;
			if (client.aBoolean605) {
				client.aBoolean614 = false;
			} else {
				client.aBoolean614 = true;
			}
			client.aBoolean605 = true;
		} else {
			client.aBoolean614 = false;
			client.aBoolean605 = false;
		}
		@Pc(62) float local62 = (float) (client.anInt3444 * -1927250963) / 65535.0F;
		@Pc(65) float[] local65 = new float[3];
		@Pc(69) int local69 = client.anInt3395 * 229109634;
		@Pc(100) int local100;
		@Pc(138) int local138;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(160) int local160;
		@Pc(178) int local178;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(86) int local86 = client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69][local71] * 3;
			local100 = client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69 + 1][local71] * 3;
			local138 = (client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69 + 2][local71] - (client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69 + 3][local71] - client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69 + 2][local71])) * 3;
			local148 = client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69][local71];
			local152 = local100 - local86;
			local160 = local138 + (local86 - local100 * 2);
			local178 = client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69 + 2][local71] - local148 + local100 - local138;
			local65[local71] = (float) local148 + local62 * (((float) local160 + local62 * (float) local178) * local62 + (float) local152);
		}
		@Pc(204) Class595 local204 = client.aClass517_1.method30409();
		Class96_Sub13.anInt883 = ((int) local65[0] - local204.anInt5504 * 1852947968) * -2079086379;
		Class672.anInt5796 = (int) local65[1] * -996845503;
		Class633.anInt5710 = ((int) local65[2] - local204.anInt5506 * -139729408) * -866237299;
		@Pc(238) float[] local238 = new float[3];
		local100 = client.anInt3407 * 1980678826;
		for (local138 = 0; local138 < 3; local138++) {
			local148 = client.anIntArrayArrayArray15[client.anInt3442 * 1614995835][local100][local138] * 3;
			local152 = client.anIntArrayArrayArray15[client.anInt3442 * 1614995835][local100 + 1][local138] * 3;
			local160 = (client.anIntArrayArrayArray15[client.anInt3442 * 1614995835][local100 + 2][local138] - (client.anIntArrayArrayArray15[client.anInt3442 * 1614995835][local100 + 3][local138] - client.anIntArrayArrayArray15[client.anInt3442 * 1614995835][local100 + 2][local138])) * 3;
			local178 = client.anIntArrayArrayArray15[client.anInt3442 * 1614995835][local100][local138];
			@Pc(325) int local325 = local152 - local148;
			@Pc(333) int local333 = local148 - local152 * 2 + local160;
			@Pc(351) int local351 = client.anIntArrayArrayArray15[client.anInt3442 * 1614995835][local100 + 2][local138] - local178 + local152 - local160;
			local238[local138] = (float) local178 + ((local62 * (float) local351 + (float) local333) * local62 + (float) local325) * local62;
		}
		@Pc(381) float local381 = local238[0] - local65[0];
		@Pc(391) float local391 = (local238[1] - local65[1]) * -1.0F;
		@Pc(399) float local399 = local238[2] - local65[2];
		@Pc(409) double local409 = Math.sqrt((double) (local399 * local399 + local381 * local381));
		Class565.anInt5338 = ((int) (Math.atan2((double) local391, local409) * 2607.5945876176133D) & 0x3FFF) * -1539495063;
		Class639.anInt5720 = ((int) (-Math.atan2((double) local381, (double) local399) * 2607.5945876176133D) & 0x3FFF) * 486346273;
		Class4.anInt17 = (client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69][3] + ((client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69 + 2][3] - client.anIntArrayArrayArray15[client.anInt3441 * -1351358339][local69][3]) * -1927250963 * client.anInt3444 >> 16)) * 506655975;
	}

	@OriginalMember(owner = "client!acl", name = "jx", descriptor = "(III)V", line = 6340)
	static final void method903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class156.anInt3234 = arg0 * -1660827629;
		Class156.anInt3235 = arg1 * 517634255;
		Class156.aBoolean551 = false;
		Class127_Sub3.method12944();
	}
}
