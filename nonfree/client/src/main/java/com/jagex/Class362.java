package com.jagex;

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public class Class362 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[Lclient!jw;")
	static Class370[] aClass370Array1;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "[Lclient!jt;")
	static Interface30[] anInterface30Array1;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Ljava/lang/Thread;")
	static Thread aThread6;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Z")
	static boolean aBoolean729;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Ljava/lang/String;")
	static String aString187;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Ljava/lang/String;")
	static final String aString188 = " - ";

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
	static int anInt4573 = -770058321;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Z")
	static boolean aBoolean730 = false;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	static int anInt4572 = 790545439;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(JIZB)Ljava/lang/String;", line = 59)
	static String method27848(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class543.method30947(arg0);
			local5 = Class69.aCalendar2;
		} else {
			Class337.method27459(arg0);
			local5 = Class69.aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 231)
	Class362() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "()V", line = 236)
	public static void method27811() {
		aBoolean730 = true;
		Class7.aString2 = Class411.aString200;
		Class490.aString217 = Class411.aString201;
		Class642.method32522(false);
		Class283.method26477();
		aClass370Array1 = null;
		Class275.aClass496_1 = null;
		Class481.method29756(5);
	}

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "()V", line = 236)
	public static void method27840() {
		aBoolean730 = true;
		Class7.aString2 = Class411.aString200;
		Class490.aString217 = Class411.aString201;
		Class642.method32522(false);
		Class283.method26477();
		aClass370Array1 = null;
		Class275.aClass496_1 = null;
		Class481.method29756(5);
	}

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "()Z", line = 247)
	public static boolean method27810() {
		return aBoolean730;
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "()Z", line = 247)
	public static boolean method27812() {
		return aBoolean730;
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "()Z", line = 247)
	public static boolean method27814() {
		return aBoolean730;
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "()V", line = 251)
	public static void method27809() {
		if (aClass370Array1 == null) {
			aClass370Array1 = Class370.method27993();
			Class146.aClass370_3 = aClass370Array1[0];
			Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30604();
		if (Class146.aClass370_3 == local19) {
			aString187 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8);
			Class531.aString225 = aString187;
			if (Class146.aClass370_3.aBoolean737) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4591 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4592 - Class146.aClass370_3.anInt4591 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29756(4);
			if (aBoolean730) {
				aBoolean730 = false;
				Class114.method7634(Class7.aString2, Class490.aString217, "", false);
			}
		} else {
			aString187 = local19.aClass74_178.method1259(Class106.aClass717_8);
			Class531.aString225 = aString187;
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + local19.anInt4592 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4592 * 640981761;
			if (Class146.aClass370_3.aBoolean737 || local19.aBoolean737) {
				Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27735(Class661.aLong302 * 3693219987677404063L, aString187, Class531.aString225, Class66.anInt237 * 1453631867, Class146.aClass370_3);
		if (anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = anInt4573 * 815014065 + 1; local162 < anInterface30Array1.length; local162++) {
			if (anInterface30Array1[local162].method27932() >= 100 && local162 - 1 == anInt4573 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27743()) {
				try {
					anInterface30Array1[local162].method27923();
				} catch (@Pc(196) Exception local196) {
					anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27765(anInterface30Array1[local162]);
				anInt4573 += 770058321;
				if (anInt4573 * 815014065 >= anInterface30Array1.length - 1 && anInterface30Array1.length > 1) {
					anInt4573 = (Class363.aClass81_1.method1374() ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "()V", line = 251)
	public static void method27815() {
		if (aClass370Array1 == null) {
			aClass370Array1 = Class370.method27993();
			Class146.aClass370_3 = aClass370Array1[0];
			Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30604();
		if (Class146.aClass370_3 == local19) {
			aString187 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8);
			Class531.aString225 = aString187;
			if (Class146.aClass370_3.aBoolean737) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4591 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4592 - Class146.aClass370_3.anInt4591 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29756(4);
			if (aBoolean730) {
				aBoolean730 = false;
				Class114.method7634(Class7.aString2, Class490.aString217, "", false);
			}
		} else {
			aString187 = local19.aClass74_178.method1259(Class106.aClass717_8);
			Class531.aString225 = aString187;
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + local19.anInt4592 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4592 * 640981761;
			if (Class146.aClass370_3.aBoolean737 || local19.aBoolean737) {
				Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27735(Class661.aLong302 * 3693219987677404063L, aString187, Class531.aString225, Class66.anInt237 * 1453631867, Class146.aClass370_3);
		if (anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = anInt4573 * 815014065 + 1; local162 < anInterface30Array1.length; local162++) {
			if (anInterface30Array1[local162].method27932() >= 100 && local162 - 1 == anInt4573 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27743()) {
				try {
					anInterface30Array1[local162].method27923();
				} catch (@Pc(196) Exception local196) {
					anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27765(anInterface30Array1[local162]);
				anInt4573 += 770058321;
				if (anInt4573 * 815014065 >= anInterface30Array1.length - 1 && anInterface30Array1.length > 1) {
					anInt4573 = (Class363.aClass81_1.method1374() ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()V", line = 251)
	public static void method27816() {
		if (aClass370Array1 == null) {
			aClass370Array1 = Class370.method27993();
			Class146.aClass370_3 = aClass370Array1[0];
			Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30604();
		if (Class146.aClass370_3 == local19) {
			aString187 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8);
			Class531.aString225 = aString187;
			if (Class146.aClass370_3.aBoolean737) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4591 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4592 - Class146.aClass370_3.anInt4591 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29756(4);
			if (aBoolean730) {
				aBoolean730 = false;
				Class114.method7634(Class7.aString2, Class490.aString217, "", false);
			}
		} else {
			aString187 = local19.aClass74_178.method1259(Class106.aClass717_8);
			Class531.aString225 = aString187;
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + local19.anInt4592 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4592 * 640981761;
			if (Class146.aClass370_3.aBoolean737 || local19.aBoolean737) {
				Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27735(Class661.aLong302 * 3693219987677404063L, aString187, Class531.aString225, Class66.anInt237 * 1453631867, Class146.aClass370_3);
		if (anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = anInt4573 * 815014065 + 1; local162 < anInterface30Array1.length; local162++) {
			if (anInterface30Array1[local162].method27932() >= 100 && local162 - 1 == anInt4573 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27743()) {
				try {
					anInterface30Array1[local162].method27923();
				} catch (@Pc(196) Exception local196) {
					anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27765(anInterface30Array1[local162]);
				anInt4573 += 770058321;
				if (anInt4573 * 815014065 >= anInterface30Array1.length - 1 && anInterface30Array1.length > 1) {
					anInt4573 = (Class363.aClass81_1.method1374() ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 306)
	static void method27818() {
		if (Class146.aClass370_3 != null) {
			Class653.aClass357_1 = new Class357();
			Class653.aClass357_1.method27735(Class661.aLong302 * 3693219987677404063L, Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8), Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8), Class146.aClass370_3.anInt4591 * 903713925, Class146.aClass370_3);
			aThread6 = new Thread(Class653.aClass357_1, "");
			aThread6.start();
		}
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(Z)V", line = 314)
	public static void method27817(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		if (arg0) {
			Class653.aClass357_1.method27731();
		}
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(Z)V", line = 314)
	public static void method27819(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		if (arg0) {
			Class653.aClass357_1.method27731();
		}
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(Z)V", line = 314)
	public static void method27820(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		if (arg0) {
			Class653.aClass357_1.method27731();
		}
	}

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "(Z)V", line = 314)
	public static void method27821(@OriginalArg(0) boolean arg0) {
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		if (arg0) {
			Class653.aClass357_1.method27731();
		}
	}

	@OriginalMember(owner = "client!ji", name = "ae", descriptor = "()I", line = 319)
	public static int method27822() {
		return Class653.aClass357_1.method27732();
	}

	@OriginalMember(owner = "client!ji", name = "al", descriptor = "()I", line = 319)
	public static int method27824() {
		return Class653.aClass357_1.method27732();
	}

	@OriginalMember(owner = "client!ji", name = "ah", descriptor = "()I", line = 319)
	public static int method27833() {
		return Class653.aClass357_1.method27732();
	}

	@OriginalMember(owner = "client!ji", name = "ag", descriptor = "()I", line = 319)
	public static int method27838() {
		return Class653.aClass357_1.method27732();
	}

	@OriginalMember(owner = "client!ji", name = "ac", descriptor = "()V", line = 323)
	public static void method27826() {
		if (anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method27923();
		}
	}

	@OriginalMember(owner = "client!ji", name = "ai", descriptor = "()V", line = 323)
	public static void method27827() {
		if (anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method27923();
		}
	}

	@OriginalMember(owner = "client!ji", name = "aw", descriptor = "()V", line = 323)
	public static void method27828() {
		if (anInterface30Array1 == null) {
			return;
		}
		@Pc(3) Interface30[] local3 = anInterface30Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Interface30 local13 = local3[local5];
			local13.method27923();
		}
	}

	@OriginalMember(owner = "client!ji", name = "as", descriptor = "()I", line = 333)
	static int method27829() {
		@Pc(4) int local4 = Class146.aClass370_3.anInt4590 * -909097621;
		if (local4 < aClass370Array1.length - 1) {
			Class146.aClass370_3 = aClass370Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!ji", name = "at", descriptor = "()I", line = 333)
	static int method27830() {
		@Pc(4) int local4 = Class146.aClass370_3.anInt4590 * -909097621;
		if (local4 < aClass370Array1.length - 1) {
			Class146.aClass370_3 = aClass370Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!ji", name = "ad", descriptor = "()I", line = 339)
	static int method27831() {
		@Pc(6) int local6;
		if (Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16505() == 0) {
			for (local6 = 0; local6 < client.anInt3448 * -1523148821; local6++) {
				if (client.anInterface66Array2[local6].method13686() == 's' || client.anInterface66Array2[local6].method13686() == 'S') {
					Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1);
					client.aBoolean606 = true;
					Class481.method29755(Class73.aClass73_9);
					break;
				}
			}
		}
		if (Class370.aClass370_15 == Class146.aClass370_3) {
			if (Class275.aClass496_1 == null) {
				Class275.aClass496_1 = new Class496(Class520.aClass144_3, Class484.aClass493_2, Class477.aClass480_2, Class95.aBigInteger1, Class95.aBigInteger3);
			}
			if (!Class275.aClass496_1.method30032()) {
				return 0;
			}
			Class293.method26588(0, null, true);
			aBoolean729 = !Class319.method27222();
			Class17.aClass497_2 = Class384.method28156(aBoolean729 ? Class31.aClass31_29 : Class31.aClass31_7, false, 1, true);
			Class7.aClass497_1 = Class384.method28156(Class31.aClass31_28, false, 1, true);
			Class633.aClass497_137 = Class384.method28156(Class31.aClass31_9, false, 1, true);
			Class222.aClass497_97 = Class384.method28156(Class31.aClass31_25, true, 1, true);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class370.aClass370_13 == Class146.aClass370_3) {
			local115 = Class7.aClass497_1.method30061();
			@Pc(119) boolean local119 = Class222.aClass497_97.method30061();
			local127 = Class569.aClass143_Sub1Array2[Class31.aClass31_28.method629()].method11071();
			@Pc(143) int local143 = local127 + Class569.aClass143_Sub1Array2[aBoolean729 ? Class31.aClass31_29.method629() : Class31.aClass31_7.method629()].method11071();
			@Pc(153) int local153 = local143 + Class569.aClass143_Sub1Array2[Class31.aClass31_9.method629()].method11071();
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class222.aClass497_97.method30058());
			@Pc(173) int local173 = local163 + (local115 ? 100 : Class7.aClass497_1.method30058());
			if (local173 != 500) {
				return local173 / 5;
			}
			Class93_Sub26.aClass645_15 = new Class645(Class222.aClass497_97);
			Class659.aClass633_1 = new Class633(Class222.aClass497_97);
			Class292.method26580(Class93_Sub26.aClass645_15);
			@Pc(198) int local198 = Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16321();
			Class363.aClass81_1 = new Class81(client.aClass702_4, Class106.aClass717_8, Class7.aClass497_1);
			@Pc(210) Class84[] local210 = Class363.aClass81_1.method1369(local198);
			if (local210.length == 0) {
				local210 = Class363.aClass81_1.method1369(0);
			}
			@Pc(224) Class385 local224 = new Class385(Class17.aClass497_2, Class633.aClass497_137);
			if (local210.length > 0) {
				anInterface30Array1 = new Interface30[local210.length];
				for (@Pc(233) int local233 = 0; local233 < anInterface30Array1.length; local233++) {
					anInterface30Array1[local233] = new Class366(Class363.aClass81_1.method1368(local210[local233].anInt258 * 1709991339), local210[local233].anInt256 * 1396449397, local210[local233].anInt257 * 1604660509, local224);
				}
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_7) {
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class17.aClass497_2, Class633.aClass497_137, Class173.method23800());
		}
		@Pc(290) int local290;
		if (Class370.aClass370_8 == Class146.aClass370_3) {
			local6 = Class157.aClass462_2.method29256();
			local290 = Class157.aClass462_2.method29239();
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class370.aClass370_9 == Class146.aClass370_3) {
			if (anInterface30Array1 != null && anInterface30Array1.length > 0) {
				if (anInterface30Array1[0].method27932() < 100) {
					return 0;
				}
				if (anInterface30Array1.length > 1 && Class363.aClass81_1.method1374() && anInterface30Array1[1].method27932() < 100) {
					return 0;
				}
			}
			Class157.aClass462_2.method29236(client.anInterface50_1);
			Class520.method30339(Class694.aClass104_14);
			Class481.method29756(11);
		}
		if (Class146.aClass370_3 == Class370.aClass370_10) {
			Class110_Sub7.aClass497_22 = Class384.method28156(Class31.aClass31_6, false, 1, true);
			Class623.aClass497_136 = Class384.method28156(Class31.aClass31_17, false, 1, true);
			Class110_Sub10.aClass497_23 = Class384.method28156(Class31.aClass31_8, false, 1, true);
			Class93_Sub3.aClass497_43 = Class384.method28156(Class31.aClass31_2, false, 1, true);
			Class166_Sub45.aClass497_60 = Class384.method28156(Class31.aClass31_24, false, 1, true);
			Class621.aClass497_135 = Class384.method28156(Class31.aClass31_36, false, 1, true);
			Class200.aClass497_96 = Class384.method28156(Class31.aClass31_41, false, 1, true);
			Class166_Sub15.aClass497_59 = Class384.method28156(Class31.aClass31_18, true, 1, true);
			Class86.aClass497_15 = Class384.method28156(Class31.aClass31_10, false, 1, true);
			Class230.aClass497_99 = Class384.method28156(Class31.aClass31_38, true, 1, true);
			Class40.aClass497_4 = Class384.method28156(Class31.aClass31_5, false, 1, true);
			Class542.aClass497_129 = Class384.method28156(Class31.aClass31_3, false, 1, true);
			Class337.aClass497_103 = Class384.method28156(Class31.aClass31_22, true, 1, false);
			Class124.aClass497_93 = Class384.method28156(Class31.aClass31_31, true, 1, false);
			Class493.aClass497_124 = Class384.method28156(Class31.aClass31_11, false, 1, true);
			Class47.aClass497_6 = Class384.method28156(Class31.aClass31_42, false, 1, true);
			Class514.aClass497_128 = Class384.method28156(Class31.aClass31_20, false, 1, true);
			Class157.aClass497_49 = Class384.method28156(Class31.aClass31_14, false, 1, true);
			Class705.aClass497_141 = Class384.method28156(Class31.aClass31_15, false, 1, true);
			Class327.aClass497_102 = Class384.method28156(Class31.aClass31_16, false, 1, true);
			Class443.aClass497_115 = Class384.method28156(Class31.aClass31_27, false, 1, true);
			Class144_Sub1.aClass497_42 = Class384.method28156(Class31.aClass31_1, true, 1, false);
			Class710.aClass497_143 = Class384.method28156(Class31.aClass31_32, true, 1, true);
			Class486.aClass497_123 = Class384.method28156(Class31.aClass31_19, false, 1, true);
			Class304.aClass497_101 = Class384.method28156(Class31.aClass31_23, false, 1, true);
			Class108_Sub1.aClass497_19 = Class384.method28156(Class31.aClass31_21, true, 1, true);
			Class577.aClass497_130 = Class384.method28156(Class31.aClass31_13, false, 1, true);
			Class75.aClass497_11 = Class384.method28156(Class31.aClass31_12, false, 1, true);
			Class446.aClass497_117 = Class384.method28156(Class31.aClass31_30, true, 1, true);
			Class590.aClass497_133 = Class384.method28156(Class31.aClass31_4, true, 1, true);
			Class364.aClass497_105 = Class384.method28156(Class31.aClass31_26, true, 1, true);
		}
		if (Class370.aClass370_22 == Class146.aClass370_3) {
			local6 = 0;
			local290 = 0;
			for (local127 = 0; local127 < Class569.aClass143_Sub1Array2.length; local127++) {
				if (Class569.aClass143_Sub1Array2[local127] != null) {
					local6 += Class569.aClass143_Sub1Array2[local127].method11071();
					local290++;
				}
			}
			if (local290 > 0) {
				local6 /= local290;
			}
			if (local6 != 100) {
				if (anInt4572 * -31438815 < 0) {
					anInt4572 = local6 * -790545439;
				}
				return (local6 - anInt4572 * -31438815) * 100 / (100 - anInt4572 * -31438815);
			}
			Class110_Sub4.method7302(Class93_Sub26.aClass645_15);
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class110_Sub7.aClass497_22, Class633.aClass497_137, Class173.method23800());
		}
		if (Class146.aClass370_3 == Class370.aClass370_11) {
			@Pc(677) byte[] local677 = Class222.aClass497_97.method30059(Class649.aClass649_5.anInt5795 * -51136173);
			if (local677 == null) {
				return 0;
			}
			Class274.aClass258_1 = new Class258();
			Class274.aClass258_1.method26031(50, 7340032);
			Class151.method13979(local677);
			Class481.method29756(1);
		}
		if (Class146.aClass370_3 == Class370.aClass370_12 && Class125_Sub1.aClass586_1 == null) {
			Class125_Sub1.aClass586_1 = new Class586(Class590.aClass497_133);
			Class43.method843(Class125_Sub1.aClass586_1);
		}
		if (Class370.aClass370_5 == Class146.aClass370_3) {
			local6 = Class378.method28069();
			if (local6 < 100) {
				return local6;
			}
			Class27.method585(Class222.aClass497_97.method30059(Class649.aClass649_1.anInt5795 * -51136173));
			Class618.aShortArrayArray6 = Class93_Sub26.aClass645_15.aShortArrayArray8;
			Class111.aShortArrayArrayArray3 = Class93_Sub26.aClass645_15.aShortArrayArrayArray8;
			Class138_Sub3.aShortArrayArray4 = Class93_Sub26.aClass645_15.aShortArrayArray7;
			Class79_Sub1_Sub2.aShortArrayArrayArray1 = Class93_Sub26.aClass645_15.aShortArrayArrayArray9;
			if (Class93_Sub26.aClass645_15.anInt5774 * 68799883 != -1 && Class93_Sub26.aClass645_15.anInt5775 * 810262785 != -1) {
				client.anInt3511 = Class93_Sub26.aClass645_15.anInt5774 * -1828737035;
				client.anInt3512 = Class93_Sub26.aClass645_15.anInt5775 * 1053772179;
			}
			Class113.aClass651_2 = new Class651(Class222.aClass497_97);
			Class336.aClass644_1 = new Class644(Class222.aClass497_97);
			Class288.aClass636_1 = new Class636(Class222.aClass497_97);
			Class119.aClass650_2 = new Class650(Class222.aClass497_97);
			Class159.aClass637_2 = new Class637(Class222.aClass497_97);
		}
		if (Class370.aClass370_14 == Class146.aClass370_3) {
			if (-742728449 * Class93_Sub26.aClass645_15.anInt5773 != -1 && !Class86.aClass497_15.method30053(Class93_Sub26.aClass645_15.anInt5773 * -742728449, 0)) {
				return 99;
			}
			Class619.aClass225_8 = new Class225(Class108_Sub1.aClass497_19);
			Class636.anInterface24_10 = new Class111_Sub1(Class230.aClass497_99);
			Class124.aClass32_Sub21_7 = new Class32_Sub21(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class166_Sub6.aClass32_Sub5_1 = new Class32_Sub5(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class311.aClass32_Sub6_1 = new Class32_Sub6(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class74.aClass32_1 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_73, 64, new Class52(Class30.class));
			Class276.aClass32_2 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_72, 16, new Class52(Class77.class));
			Class19.aClass32_Sub7_5 = new Class32_Sub7(client.aClass702_4, Class106.aClass717_8, Class47.aClass497_6);
			Class682.aClass32_Sub1_3 = new Class32_Sub1(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class692.aClass32_Sub4_3 = new Class32_Sub4(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class366.aClass32_Sub8_1 = new Class32_Sub8(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class534.aClass32_Sub10_1 = new Class32_Sub10(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class343.aClass32_Sub19_1 = new Class32_Sub19(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class86.aClass497_15);
			Class638.aClass32_Sub22_1 = new Class32_Sub22(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class668.aClass32_Sub15_1 = new Class32_Sub15(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class273.aClass32_Sub14_8 = new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15);
			client.aClass532_1.method30449(Class273.aClass32_Sub14_8);
			Class392.aClass541_1.method30902(new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15));
			Class542.aClass32_Sub2_3 = new Class32_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class466.aClass32_Sub20_3 = new Class32_Sub20(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class162.aClass32_Sub3_2 = new Class32_Sub3(client.aClass702_4, Class106.aClass717_8, true, Class514.aClass497_128, Class86.aClass497_15);
			Class277.aClass32_Sub12_1 = new Class32_Sub12(client.aClass702_4, Class106.aClass717_8, true, Class124.aClass32_Sub21_7, Class157.aClass497_49, Class86.aClass497_15);
			Class288.aClass55_Sub2_1 = new Class55_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, true);
			client.aClass32_Sub13_1 = new Class32_Sub13(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class32.aClass32_Sub17_23 = new Class32_Sub17(client.aClass702_4, Class106.aClass717_8, Class705.aClass497_141, Class623.aClass497_136, Class110_Sub10.aClass497_23, Class93_Sub3.aClass497_43, client.aClass32_Sub13_1);
			Class123.aClass32_Sub11_2 = new Class32_Sub11(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class51.aClass32_Sub9_1 = new Class32_Sub9(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class501.aClass32_Sub18_1 = new Class32_Sub18(client.aClass702_4, Class106.aClass717_8, Class327.aClass497_102, Class86.aClass497_15);
			Class649.aClass55_Sub1_1 = new Class55_Sub1(client.aClass702_4, Class106.aClass717_8, Class443.aClass497_115, true);
			Class72.aClass79_Sub1_Sub2_2 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_63, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class21.aClass79_Sub1_Sub1_1 = new Class79_Sub1_Sub1(client.aClass702_4, Class138.aClass138_65, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class684.aClass79_Sub1_Sub2_6 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_67, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class39.aClass79_Sub1_Sub2_1 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_71, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_68, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class429.aClass79_Sub1_Sub2_5 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_70, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class265.aClass79_Sub1_Sub2_4 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_72, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class96.aMap9 = Class85.method1445(new Class79_Sub1[] { Class72.aClass79_Sub1_Sub2_2, Class21.aClass79_Sub1_Sub1_1, Class684.aClass79_Sub1_Sub2_6, Class39.aClass79_Sub1_Sub2_1, Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3, Class429.aClass79_Sub1_Sub2_5, Class265.aClass79_Sub1_Sub2_4 });
			Class30.aClass32_Sub16_1 = new Class32_Sub16(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class96.aMap9);
			Class506.anInterface21_4 = new Class367();
			Class283.method26476(Class200.aClass497_96, Class86.aClass497_15, Class110_Sub7.aClass497_22, Class633.aClass497_137);
			Class81.aClass451_1 = new Class451(Class75.aClass497_11);
			Class283.aClass444_1 = new Class444(Class577.aClass497_130);
			Class599.aClass438_1 = new Class438(Class577.aClass497_130);
			Class449.aClass514_1 = new Class514(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101);
			Class372.aClass58_2 = new Class58(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101, new Class452());
			Class624.aClass120_1 = new Class120(Class21.aClass79_Sub1_Sub1_1, Class30.aClass32_Sub16_1, Class336.aClass644_1.method32594());
			Class610.method32021();
			Class450.method28938(Class32.aClass32_Sub17_23);
			Class120.method8671(Class599.aClass438_1, Class283.aClass444_1);
			Class711.method36813(Class86.aClass497_15, Class619.aClass225_8, Class636.anInterface24_10);
			@Pc(1211) Class337 local1211 = new Class337(Class40.aClass497_4.method30071("huffman", ""));
			Class339.method27489(local1211);
			Class553.aClass147_2 = Class450.method28933();
			Class125_Sub3.aClass93_Sub42_1 = new Class93_Sub42(true);
		}
		if (Class370.aClass370_20 == Class146.aClass370_3) {
			local6 = Class96_Sub3.method2329(Class110_Sub7.aClass497_22) + Class157.aClass462_2.method29267(true);
			local290 = Class15.method213() + Class157.aClass462_2.method29239();
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_16) {
			Class159.method14503(Class144_Sub1.aClass497_42, Class710.aClass497_143, Class682.aClass32_Sub1_3, Class692.aClass32_Sub4_3, client.aClass532_1.method30466(), Class542.aClass32_Sub2_3, Class466.aClass32_Sub20_3, Class624.aClass120_1, Class624.aClass120_1);
		}
		if (Class146.aClass370_3 == Class370.aClass370_17) {
			Class596.aClass113_Sub1_1 = new Class113_Sub1(Class72.aClass79_Sub1_Sub2_2);
			Class605.method31905();
			Class266.aClass306_1 = Class166_Sub29.method16069();
			Class166_Sub15.aClass497_59.method30065(false, true);
			Class110_Sub7.aClass497_22.method30065(true, true);
			Class633.aClass497_137.method30065(true, true);
			Class40.aClass497_4.method30065(true, true);
			client.aBoolean603 = true;
		}
		if (Class146.aClass370_3 == Class370.aClass370_18 && Class93_Sub26.aClass645_15.anInt5766 * -221025663 != -1) {
			if (!Class383.method28145(Class93_Sub26.aClass645_15.anInt5766 * -221025663, null)) {
				return 0;
			}
			local115 = true;
			for (local290 = 0; local290 < Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5766 * -221025663].aClass312Array3.length; local290++) {
				@Pc(1343) Class312 local1343 = Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5766 * -221025663].aClass312Array3[local290];
				if (local1343.anInt3971 * -158526639 == 5 && local1343.anInt3995 * -1566573331 != -1 && !Class110_Sub7.aClass497_22.method30053(local1343.anInt3995 * -1566573331, 0)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class370.aClass370_19 == Class146.aClass370_3) {
			Class138.method11537(true);
		}
		if (Class146.aClass370_3 == Class370.aClass370_6) {
			Class653.aClass357_1.method27742();
			try {
				aThread6.join();
			} catch (@Pc(1388) InterruptedException local1388) {
				return 0;
			}
			Class653.aClass357_1 = null;
			aThread6 = null;
			Class17.aClass497_2 = null;
			Class7.aClass497_1 = null;
			Class363.aClass81_1 = null;
			anInterface30Array1 = null;
			Class14.aMap1.remove(Class31.aClass31_28);
			Class14.aMap1.remove(Class31.aClass31_7);
			Class14.aMap1.remove(Class31.aClass31_29);
			Class699.method36707();
			client.aBoolean595 = Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16505() == 1;
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1);
			if (client.aBoolean595) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.aBoolean365 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 < 512 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 != 0) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			}
			Class106_Sub1.method5148();
			if (client.aBoolean595) {
				Class543.method30948(0, false);
				if (!client.aBoolean606) {
					Class481.method29755(Class73.aClass73_10);
				}
			} else {
				Class543.method30948(Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424(), false);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424() == 0) {
					Class481.method29755(Class73.aClass73_11);
				}
			}
			Class717.method36895(Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15844(), -1, -1, false);
			Class157.aClass462_2.method29236(client.anInterface50_1);
			Class520.method30339(Class694.aClass104_14);
			Class379.method28101(Class694.aClass104_14, Class110_Sub7.aClass497_22);
		}
		return Class300.method26717();
	}

	@OriginalMember(owner = "client!ji", name = "am", descriptor = "([B)V", line = 633)
	static void method27813(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22413();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22415();
				Class274.aClass258_1.method26054(local19);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "au", descriptor = "([B)V", line = 633)
	static void method27823(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22413();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22415();
				Class274.aClass258_1.method26054(local19);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "ar", descriptor = "([B)V", line = 633)
	static void method27832(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22413();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22415();
				Class274.aClass258_1.method26054(local19);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "ap", descriptor = "([B)V", line = 633)
	static void method27835(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22413();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method22415();
				Class274.aClass258_1.method26054(local19);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "av", descriptor = "()V", line = 645)
	static void method27825() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15743("2", client.aClass702_4.aString241, false);
		Class596.aClass113_Sub1_1.method7419(local6);
	}

	@OriginalMember(owner = "client!ji", name = "aj", descriptor = "()V", line = 645)
	static void method27834() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15743("2", client.aClass702_4.aString241, false);
		Class596.aClass113_Sub1_1.method7419(local6);
	}

	@OriginalMember(owner = "client!ji", name = "aq", descriptor = "()V", line = 645)
	static void method27836() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15743("2", client.aClass702_4.aString241, false);
		Class596.aClass113_Sub1_1.method7419(local6);
	}

	@OriginalMember(owner = "client!ji", name = "ax", descriptor = "()V", line = 645)
	static void method27837() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15743("2", client.aClass702_4.aString241, false);
		Class596.aClass113_Sub1_1.method7419(local6);
	}

	@OriginalMember(owner = "client!ji", name = "ao", descriptor = "()V", line = 645)
	static void method27839() {
		@Pc(6) Class38 local6 = Class166_Sub18.method15743("2", client.aClass702_4.aString241, false);
		Class596.aClass113_Sub1_1.method7419(local6);
	}

	@OriginalMember(owner = "client!ji", name = "ay", descriptor = "()V", line = 650)
	public static void method27841() {
		if (Class653.aClass357_1 != null) {
			Class653.aClass357_1.method27742();
		}
		if (aThread6 == null) {
			return;
		}
		while (true) {
			try {
				aThread6.join();
				break;
			} catch (@Pc(10) InterruptedException local10) {
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "nk", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7440)
	static final void method27847(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30148(local13, arg2);
	}

	@OriginalMember(owner = "client!ji", name = "oj", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7637)
	static final void method27842(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray28 = Class499.method30148(local13, arg2);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ji", name = "acr", descriptor = "(Lclient!yf;I)V", line = 10029)
	static final void method27849(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = arg0.aClass386_3.aStringArray29[local12];
	}

	@OriginalMember(owner = "client!ji", name = "agd", descriptor = "(Lclient!yf;I)V", line = 10694)
	static final void method27843(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class47 local29 = (Class47) Class277.aClass32_Sub12_1.method18261(local13);
		if (local23 < 1 || local23 > 5 || local29.aStringArray5[local23 - 1] == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local29.aStringArray5[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!ji", name = "ate", descriptor = "(Lclient!yf;B)V", line = 13317)
	static final void method27844(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub8_1.method15528();
	}

	@OriginalMember(owner = "client!ji", name = "awe", descriptor = "(Lclient!yf;B)V", line = 13737)
	static final void method27845(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3526 * -703563959;
	}

	@OriginalMember(owner = "client!ji", name = "bfv", descriptor = "(Lclient!yf;I)V", line = 15093)
	static final void method27846(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
