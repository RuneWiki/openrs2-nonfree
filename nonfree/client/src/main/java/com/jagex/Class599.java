package com.jagex;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yi")
public class Class599 {

	@OriginalMember(owner = "client!yi", name = "p", descriptor = "[[Ljava/lang/String;")
	static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

	@OriginalMember(owner = "client!yi", name = "a", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!yi", name = "g", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!yi", name = "<init>", descriptor = "()V", line = 25)
	Class599() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yi", name = "z", descriptor = "(JI)Ljava/lang/String;", line = 30)
	public static String method33481(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class313.method25819(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(9) int local9 = aCalendar2.get(2);
		@Pc(13) int local13 = aCalendar2.get(1);
		return arg1 == 3 ? Class69_Sub4.method14668(arg0, arg1) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!yi", name = "e", descriptor = "(JI)Ljava/lang/String;", line = 30)
	public static String method33484(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class313.method25819(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(9) int local9 = aCalendar2.get(2);
		@Pc(13) int local13 = aCalendar2.get(1);
		return arg1 == 3 ? Class69_Sub4.method14668(arg0, arg1) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!yi", name = "n", descriptor = "(JI)Ljava/lang/String;", line = 30)
	public static String method33495(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class313.method25819(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(9) int local9 = aCalendar2.get(2);
		@Pc(13) int local13 = aCalendar2.get(1);
		return arg1 == 3 ? Class69_Sub4.method14668(arg0, arg1) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!yi", name = "j", descriptor = "(JI)Ljava/lang/String;", line = 30)
	public static String method33498(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class313.method25819(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(9) int local9 = aCalendar2.get(2);
		@Pc(13) int local13 = aCalendar2.get(1);
		return arg1 == 3 ? Class69_Sub4.method14668(arg0, arg1) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!yi", name = "r", descriptor = "(JIZ)Ljava/lang/String;", line = 40)
	public static String method33485(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class312.method25816(arg0);
			local5 = aCalendar3;
		} else {
			Class313.method25819(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class279.method25422(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!yi", name = "d", descriptor = "(JIZ)Ljava/lang/String;", line = 40)
	public static String method33486(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class312.method25816(arg0);
			local5 = aCalendar3;
		} else {
			Class313.method25819(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class279.method25422(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!yi", name = "q", descriptor = "(JIZ)Ljava/lang/String;", line = 40)
	public static String method33487(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class312.method25816(arg0);
			local5 = aCalendar3;
		} else {
			Class313.method25819(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class279.method25422(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!yi", name = "v", descriptor = "(JIZ)Ljava/lang/String;", line = 59)
	static String method33480(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) Calendar local5;
		if (arg1) {
			Class312.method25816(arg0);
			local5 = aCalendar3;
		} else {
			Class313.method25819(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!yi", name = "m", descriptor = "(JIZ)Ljava/lang/String;", line = 59)
	static String method33483(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) Calendar local5;
		if (arg1) {
			Class312.method25816(arg0);
			local5 = aCalendar3;
		} else {
			Class313.method25819(arg0);
			local5 = aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!yi", name = "t", descriptor = "(JI)Ljava/lang/String;", line = 76)
	static String method33479(@OriginalArg(0) long arg0) {
		Class313.method25819(arg0);
		@Pc(5) int local5 = aCalendar2.get(5);
		@Pc(11) int local11 = aCalendar2.get(2) + 1;
		@Pc(15) int local15 = aCalendar2.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!yi", name = "w", descriptor = "(J)I", line = 84)
	public static int method33490(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!yi", name = "o", descriptor = "(J)V", line = 88)
	static void method33491(@OriginalArg(0) long arg0) {
		aCalendar3.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!yi", name = "i", descriptor = "(J)V", line = 88)
	static void method33492(@OriginalArg(0) long arg0) {
		aCalendar3.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!yi", name = "f", descriptor = "(I)[I", line = 96)
	public static int[] method33488(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class313.method25819(Class431.method27960(arg0));
		local2[0] = aCalendar2.get(5);
		local2[1] = aCalendar2.get(2);
		local2[2] = aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!yi", name = "k", descriptor = "(I)[I", line = 96)
	public static int[] method33493(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class313.method25819(Class431.method27960(arg0));
		local2[0] = aCalendar2.get(5);
		local2[1] = aCalendar2.get(2);
		local2[2] = aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!yi", name = "at", descriptor = "(I)[I", line = 96)
	public static int[] method33494(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class313.method25819(Class431.method27960(arg0));
		local2[0] = aCalendar2.get(5);
		local2[1] = aCalendar2.get(2);
		local2[2] = aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!yi", name = "af", descriptor = "(I)[I", line = 96)
	public static int[] method33499(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class313.method25819(Class431.method27960(arg0));
		local2[0] = aCalendar2.get(5);
		local2[1] = aCalendar2.get(2);
		local2[2] = aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!yi", name = "ah", descriptor = "(IIIIII)J", line = 105)
	public static long method33482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar3.clear();
		aCalendar3.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar3.getTime().getTime();
	}

	@OriginalMember(owner = "client!yi", name = "ak", descriptor = "(IIIIII)J", line = 105)
	public static long method33496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar3.clear();
		aCalendar3.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar3.getTime().getTime();
	}

	@OriginalMember(owner = "client!yi", name = "aa", descriptor = "(IIIIII)J", line = 105)
	public static long method33497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar3.clear();
		aCalendar3.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar3.getTime().getTime();
	}

	@OriginalMember(owner = "client!yi", name = "an", descriptor = "(I)J", line = 111)
	public static long method33500(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!yi", name = "aj", descriptor = "(J)I", line = 115)
	public static int method33489(@OriginalArg(0) long arg0) {
		Class313.method25819(arg0);
		return aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!yi", name = "as", descriptor = "(J)I", line = 115)
	public static int method33501(@OriginalArg(0) long arg0) {
		Class313.method25819(arg0);
		return aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!yi", name = "ai", descriptor = "(J)I", line = 115)
	public static int method33502(@OriginalArg(0) long arg0) {
		Class313.method25819(arg0);
		return aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!yi", name = "ms", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;", line = 11759)
	static String method33503(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) String local5 = arg1 ? "https://" : "http://";
		if (Class527.aClass527_8 == Class1.aClass527_1) {
			arg0 = arg0 + "-wtrc";
		} else if (Class527.aClass527_4 == Class1.aClass527_1) {
			arg0 = arg0 + "-wtqa";
		} else if (Class527.aClass527_11 == Class1.aClass527_1) {
			arg0 = arg0 + "-wtwip";
		} else if (Class527.aClass527_5 == Class1.aClass527_1) {
			arg0 = arg0 + "-wti";
		} else if (Class1.aClass527_1 == Class527.aClass527_12) {
			arg0 = arg0 + "-demo";
		} else if (Class1.aClass527_1 == Class527.aClass527_6) {
			arg0 = "local";
		}
		@Pc(77) String local77 = "";
		if (client.aString150 != null) {
			local77 = "/p=" + client.aString150;
		}
		@Pc(98) String local98 = client.aClass543_2.aString236 + ".com";
		return local5 + arg0 + "." + local98 + "/l=" + Class469.aClass530_2.anInt5306 * 1515113627 + "/a=" + client.anInt3073 * -720912181 + local77 + "/";
	}
}
