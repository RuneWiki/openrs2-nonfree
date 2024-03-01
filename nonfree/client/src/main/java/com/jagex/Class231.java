package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hz")
public class Class231 {

	@OriginalMember(owner = "client!hz", name = "u", descriptor = "I")
	static int anInt3738;

	@OriginalMember(owner = "client!hz", name = "z", descriptor = "J")
	static long aLong248;

	@OriginalMember(owner = "client!hz", name = "h", descriptor = "Lclient!zn;")
	static Class624 aClass624_1;

	@OriginalMember(owner = "client!hz", name = "a", descriptor = "[Lclient!hd;")
	static Class218[] aClass218Array1;

	@OriginalMember(owner = "client!hz", name = "g", descriptor = "[Lclient!hx;")
	static Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!hz", name = "x", descriptor = "Lclient!ny;")
	static Class359 aClass359_46;

	@OriginalMember(owner = "client!hz", name = "j", descriptor = "Ljava/lang/String;")
	static String aString190;

	@OriginalMember(owner = "client!hz", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString191 = " - ";

	@OriginalMember(owner = "client!hz", name = "p", descriptor = "[I")
	static final int[] anIntArray395 = new int[] { 6, 4, 1, 2, 0, 4, 0, 50, 2, 2, 2, 0, 2, 1, 5, 0, 2, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 2 };

	@OriginalMember(owner = "client!hz", name = "l", descriptor = "I")
	static int anInt3739;

	@OriginalMember(owner = "client!hz", name = "q", descriptor = "Z")
	static boolean aBoolean678;

	@OriginalMember(owner = "client!hz", name = "t", descriptor = "I")
	static int anInt3740;

	static {
		if (Class202.aBoolean664) {
			anIntArray395[0] += anIntArray395[14];
			anIntArray395[14] = 0;
			anIntArray395[0] += anIntArray395[40];
			anIntArray395[40] = 0;
		}
		anInt3739 = -122325285;
		aBoolean678 = false;
		anInt3740 = 479726397;
	}

	@OriginalMember(owner = "client!hz", name = "<init>", descriptor = "()V", line = 227)
	Class231() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!hz", name = "d", descriptor = "()V", line = 232)
	public static void method24549() {
		aBoolean678 = true;
		Class34_Sub2.aString40 = Class190.aString178;
		Class60_Sub16.aString66 = Class190.aString179;
		Class394.method27445(false);
		Class34.method16494();
		aClass218Array1 = null;
		Class626.aClass334_1 = null;
		Class166.method23342(0);
	}

	@OriginalMember(owner = "client!hz", name = "r", descriptor = "()V", line = 232)
	public static void method24551() {
		aBoolean678 = true;
		Class34_Sub2.aString40 = Class190.aString178;
		Class60_Sub16.aString66 = Class190.aString179;
		Class394.method27445(false);
		Class34.method16494();
		aClass218Array1 = null;
		Class626.aClass334_1 = null;
		Class166.method23342(0);
	}

	@OriginalMember(owner = "client!hz", name = "q", descriptor = "()Z", line = 243)
	public static boolean method24552() {
		return aBoolean678;
	}

	@OriginalMember(owner = "client!hz", name = "v", descriptor = "()Z", line = 243)
	public static boolean method24554() {
		return aBoolean678;
	}

	@OriginalMember(owner = "client!hz", name = "m", descriptor = "()Z", line = 243)
	public static boolean method24562() {
		return aBoolean678;
	}

	@OriginalMember(owner = "client!hz", name = "w", descriptor = "()V", line = 247)
	public static void method24555() {
		if (aClass218Array1 == null) {
			aClass218Array1 = Class218.method24356();
			Class602.aClass218_20 = aClass218Array1[0];
			aLong248 = Class176.method23413() * -7062202854273115071L;
		}
		if (Class5.aClass221_4 == null) {
			Class226.method24481();
		}
		@Pc(21) Class218 local21 = Class602.aClass218_20;
		@Pc(24) int local24 = Class164.method23306();
		if (local21 == Class602.aClass218_20) {
			Class34_Sub3.aString41 = Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2);
			aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean673) {
				Class329.anInt4587 = (Class602.aClass218_20.anInt3727 * 266184707 + local24 * (Class602.aClass218_20.anInt3726 * 1152921423 - Class602.aClass218_20.anInt3727 * 266184707) / 100) * 970308245;
			}
			if (Class602.aClass218_20.aBoolean672) {
				aString190 = aString190 + " - " + Class329.anInt4587 * 1347436733 + "%";
			}
		} else if (Class602.aClass218_20 == Class218.aClass218_18) {
			Class5.aClass221_4 = null;
			Class166.method23342(2);
			if (aBoolean678) {
				aBoolean678 = false;
				Class3_Sub29.method11606(Class34_Sub2.aString40, Class60_Sub16.aString66);
			}
		} else {
			Class34_Sub3.aString41 = local21.aClass601_2.method33512(Class469.aClass530_2);
			aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean672) {
				aString190 = aString190 + local21.anInt3726 * 1152921423 + "%";
			}
			Class329.anInt4587 = local21.anInt3726 * -984748293;
			if (Class602.aClass218_20.aBoolean673 || local21.aBoolean673) {
				aLong248 = Class176.method23413() * -7062202854273115071L;
			}
		}
		if (Class5.aClass221_4 == null) {
			return;
		}
		Class5.aClass221_4.method24389(aLong248 * -666017818301631551L, Class34_Sub3.aString41, aString190, Class329.anInt4587 * 1347436733, Class602.aClass218_20);
		if (anInterface18Array1 == null) {
			return;
		}
		for (@Pc(160) int local160 = anInt3739 * -755471699 + 1; local160 < anInterface18Array1.length; local160++) {
			if (anInterface18Array1[local160].method24490() >= 100 && anInt3739 * -755471699 == local160 - 1 && client.anInt3039 * 1115111877 != 0 && Class5.aClass221_4.method24388()) {
				try {
					anInterface18Array1[local160].method24483();
				} catch (@Pc(194) Exception local194) {
					anInterface18Array1 = null;
					break;
				}
				Class5.aClass221_4.method24406(anInterface18Array1[local160]);
				anInt3739 += 122325285;
				if (anInt3739 * -755471699 >= anInterface18Array1.length - 1 && anInterface18Array1.length > 1) {
					anInt3739 = (aClass624_1.method33776() ? 0 : -1) * 122325285;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hz", name = "o", descriptor = "()V", line = 247)
	public static void method24556() {
		if (aClass218Array1 == null) {
			aClass218Array1 = Class218.method24356();
			Class602.aClass218_20 = aClass218Array1[0];
			aLong248 = Class176.method23413() * -7062202854273115071L;
		}
		if (Class5.aClass221_4 == null) {
			Class226.method24481();
		}
		@Pc(21) Class218 local21 = Class602.aClass218_20;
		@Pc(24) int local24 = Class164.method23306();
		if (local21 == Class602.aClass218_20) {
			Class34_Sub3.aString41 = Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2);
			aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean673) {
				Class329.anInt4587 = (Class602.aClass218_20.anInt3727 * 266184707 + local24 * (Class602.aClass218_20.anInt3726 * 1152921423 - Class602.aClass218_20.anInt3727 * 266184707) / 100) * 970308245;
			}
			if (Class602.aClass218_20.aBoolean672) {
				aString190 = aString190 + " - " + Class329.anInt4587 * 1347436733 + "%";
			}
		} else if (Class602.aClass218_20 == Class218.aClass218_18) {
			Class5.aClass221_4 = null;
			Class166.method23342(2);
			if (aBoolean678) {
				aBoolean678 = false;
				Class3_Sub29.method11606(Class34_Sub2.aString40, Class60_Sub16.aString66);
			}
		} else {
			Class34_Sub3.aString41 = local21.aClass601_2.method33512(Class469.aClass530_2);
			aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean672) {
				aString190 = aString190 + local21.anInt3726 * 1152921423 + "%";
			}
			Class329.anInt4587 = local21.anInt3726 * -984748293;
			if (Class602.aClass218_20.aBoolean673 || local21.aBoolean673) {
				aLong248 = Class176.method23413() * -7062202854273115071L;
			}
		}
		if (Class5.aClass221_4 == null) {
			return;
		}
		Class5.aClass221_4.method24389(aLong248 * -666017818301631551L, Class34_Sub3.aString41, aString190, Class329.anInt4587 * 1347436733, Class602.aClass218_20);
		if (anInterface18Array1 == null) {
			return;
		}
		for (@Pc(160) int local160 = anInt3739 * -755471699 + 1; local160 < anInterface18Array1.length; local160++) {
			if (anInterface18Array1[local160].method24490() >= 100 && anInt3739 * -755471699 == local160 - 1 && client.anInt3039 * 1115111877 != 0 && Class5.aClass221_4.method24388()) {
				try {
					anInterface18Array1[local160].method24483();
				} catch (@Pc(194) Exception local194) {
					anInterface18Array1 = null;
					break;
				}
				Class5.aClass221_4.method24406(anInterface18Array1[local160]);
				anInt3739 += 122325285;
				if (anInt3739 * -755471699 >= anInterface18Array1.length - 1 && anInterface18Array1.length > 1) {
					anInt3739 = (aClass624_1.method33776() ? 0 : -1) * 122325285;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hz", name = "t", descriptor = "()V", line = 247)
	public static void method24568() {
		if (aClass218Array1 == null) {
			aClass218Array1 = Class218.method24356();
			Class602.aClass218_20 = aClass218Array1[0];
			aLong248 = Class176.method23413() * -7062202854273115071L;
		}
		if (Class5.aClass221_4 == null) {
			Class226.method24481();
		}
		@Pc(21) Class218 local21 = Class602.aClass218_20;
		@Pc(24) int local24 = Class164.method23306();
		if (local21 == Class602.aClass218_20) {
			Class34_Sub3.aString41 = Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2);
			aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean673) {
				Class329.anInt4587 = (Class602.aClass218_20.anInt3727 * 266184707 + local24 * (Class602.aClass218_20.anInt3726 * 1152921423 - Class602.aClass218_20.anInt3727 * 266184707) / 100) * 970308245;
			}
			if (Class602.aClass218_20.aBoolean672) {
				aString190 = aString190 + " - " + Class329.anInt4587 * 1347436733 + "%";
			}
		} else if (Class602.aClass218_20 == Class218.aClass218_18) {
			Class5.aClass221_4 = null;
			Class166.method23342(2);
			if (aBoolean678) {
				aBoolean678 = false;
				Class3_Sub29.method11606(Class34_Sub2.aString40, Class60_Sub16.aString66);
			}
		} else {
			Class34_Sub3.aString41 = local21.aClass601_2.method33512(Class469.aClass530_2);
			aString190 = Class34_Sub3.aString41;
			if (Class602.aClass218_20.aBoolean672) {
				aString190 = aString190 + local21.anInt3726 * 1152921423 + "%";
			}
			Class329.anInt4587 = local21.anInt3726 * -984748293;
			if (Class602.aClass218_20.aBoolean673 || local21.aBoolean673) {
				aLong248 = Class176.method23413() * -7062202854273115071L;
			}
		}
		if (Class5.aClass221_4 == null) {
			return;
		}
		Class5.aClass221_4.method24389(aLong248 * -666017818301631551L, Class34_Sub3.aString41, aString190, Class329.anInt4587 * 1347436733, Class602.aClass218_20);
		if (anInterface18Array1 == null) {
			return;
		}
		for (@Pc(160) int local160 = anInt3739 * -755471699 + 1; local160 < anInterface18Array1.length; local160++) {
			if (anInterface18Array1[local160].method24490() >= 100 && anInt3739 * -755471699 == local160 - 1 && client.anInt3039 * 1115111877 != 0 && Class5.aClass221_4.method24388()) {
				try {
					anInterface18Array1[local160].method24483();
				} catch (@Pc(194) Exception local194) {
					anInterface18Array1 = null;
					break;
				}
				Class5.aClass221_4.method24406(anInterface18Array1[local160]);
				anInt3739 += 122325285;
				if (anInt3739 * -755471699 >= anInterface18Array1.length - 1 && anInterface18Array1.length > 1) {
					anInt3739 = (aClass624_1.method33776() ? 0 : -1) * 122325285;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hz", name = "i", descriptor = "()V", line = 302)
	static void method24557() {
		if (Class602.aClass218_20 != null) {
			Class5.aClass221_4 = new Class221();
			Class5.aClass221_4.method24389(aLong248 * -666017818301631551L, Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2), Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2), Class602.aClass218_20.anInt3727 * 266184707, Class602.aClass218_20);
			Class383.aThread8 = new Thread(Class5.aClass221_4, "");
			Class383.aThread8.start();
		}
	}

	@OriginalMember(owner = "client!hz", name = "k", descriptor = "(Z)V", line = 310)
	public static void method24553(@OriginalArg(0) boolean arg0) {
		if (Class5.aClass221_4 == null) {
			Class226.method24481();
		}
		if (arg0) {
			Class5.aClass221_4.method24408();
		}
	}

	@OriginalMember(owner = "client!hz", name = "f", descriptor = "(Z)V", line = 310)
	public static void method24558(@OriginalArg(0) boolean arg0) {
		if (Class5.aClass221_4 == null) {
			Class226.method24481();
		}
		if (arg0) {
			Class5.aClass221_4.method24408();
		}
	}

	@OriginalMember(owner = "client!hz", name = "at", descriptor = "()I", line = 315)
	public static int method24560() {
		return Class5.aClass221_4.method24386();
	}

	@OriginalMember(owner = "client!hz", name = "af", descriptor = "()I", line = 315)
	public static int method24561() {
		return Class5.aClass221_4.method24386();
	}

	@OriginalMember(owner = "client!hz", name = "ak", descriptor = "()I", line = 315)
	public static int method24574() {
		return Class5.aClass221_4.method24386();
	}

	@OriginalMember(owner = "client!hz", name = "aa", descriptor = "()I", line = 315)
	public static int method24576() {
		return Class5.aClass221_4.method24386();
	}

	@OriginalMember(owner = "client!hz", name = "ah", descriptor = "()V", line = 319)
	public static void method24564() {
		if (anInterface18Array1 == null) {
			return;
		}
		@Pc(4) Interface18[] local4 = anInterface18Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface18 local14 = local4[local6];
			local14.method24483();
		}
	}

	@OriginalMember(owner = "client!hz", name = "an", descriptor = "()V", line = 319)
	public static void method24565() {
		if (anInterface18Array1 == null) {
			return;
		}
		@Pc(4) Interface18[] local4 = anInterface18Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface18 local14 = local4[local6];
			local14.method24483();
		}
	}

	@OriginalMember(owner = "client!hz", name = "aj", descriptor = "()I", line = 329)
	static int method24566() {
		@Pc(4) int local4 = Class602.aClass218_20.anInt3725 * 2076865137;
		if (local4 < aClass218Array1.length - 1) {
			Class602.aClass218_20 = aClass218Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!hz", name = "as", descriptor = "()I", line = 335)
	static int method24567() {
		@Pc(6) int local6;
		if (Class510.aClass3_Sub45_37.aClass60_Sub26_1.method13832() == 0) {
			for (local6 = 0; local6 < client.anInt3154 * 1723265727; local6++) {
				if (client.anInterface46Array1[local6].method11581() == 's' || client.anInterface46Array1[local6].method11581() == 'S') {
					Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 1);
					client.aBoolean568 = true;
					Class10.method715(Class600.aClass600_5);
					break;
				}
			}
		}
		if (Class602.aClass218_20 == Class218.aClass218_16) {
			if (Class626.aClass334_1 == null) {
				Class626.aClass334_1 = new Class334(Class117.aClass51_2, Class571.aClass348_3, Class398.aClass347_3, Class361.aBigInteger5, Class361.aBigInteger8);
			}
			if (!Class626.aClass334_1.method26276()) {
				return 0;
			}
			Class315.method25834(0, null, true);
			Class85.aBoolean534 = !Class357.method26657();
			aClass359_46 = Class273.method25350(Class85.aBoolean534 ? Class188.aClass188_31 : Class188.aClass188_29, false, 1, true);
			Class228.aClass359_43 = Class273.method25350(Class188.aClass188_30, false, 1, true);
			Class475.aClass359_86 = Class273.method25350(Class188.aClass188_36, false, 1, true);
		}
		@Pc(114) int local114;
		@Pc(106) boolean local106;
		if (Class218.aClass218_2 == Class602.aClass218_20) {
			local106 = Class228.aClass359_43.method26676();
			local114 = Class296.aClass46_Sub1Array1[Class188.aClass188_30.method23965()].method8535();
			@Pc(130) int local130 = local114 + Class296.aClass46_Sub1Array1[Class85.aBoolean534 ? Class188.aClass188_31.method23965() : Class188.aClass188_29.method23965()].method8535();
			@Pc(140) int local140 = local130 + Class296.aClass46_Sub1Array1[Class188.aClass188_36.method23965()].method8535();
			@Pc(150) int local150 = local140 + (local106 ? 100 : Class228.aClass359_43.method26706());
			if (local150 != 400) {
				return local150 / 4;
			}
			anInt3738 = aClass359_46.method26749() * -2087684995;
			Class379.anInt4703 = Class228.aClass359_43.method26749() * -1382923009;
			Class274.method25354(aClass359_46);
			@Pc(177) int local177 = Class510.aClass3_Sub45_37.aClass60_Sub19_1.method13635();
			aClass624_1 = new Class624(client.aClass543_2, Class469.aClass530_2, Class228.aClass359_43);
			@Pc(189) Class626[] local189 = aClass624_1.method33777(local177);
			if (local189.length == 0) {
				local189 = aClass624_1.method33777(0);
			}
			@Pc(204) Class224 local204 = new Class224(aClass359_46, Class475.aClass359_86);
			if (local189.length > 0) {
				anInterface18Array1 = new Interface18[local189.length];
				for (@Pc(213) int local213 = 0; local213 < anInterface18Array1.length; local213++) {
					anInterface18Array1[local213] = new Class227(aClass624_1.method33774(local189[local213].anInt5579 * 3021567), local189[local213].anInt5578 * 449796557, local189[local213].anInt5580 * 1290640577, local204);
				}
			}
		}
		if (Class218.aClass218_17 == Class602.aClass218_20) {
			Class379.aClass312_1 = new Class312(aClass359_46, Class475.aClass359_86, Class294.method25565());
		}
		if (Class602.aClass218_20 == Class218.aClass218_7) {
			local6 = Class379.aClass312_1.method25782();
			local114 = Class379.aClass312_1.method25784();
			if (local6 < local114) {
				return local6 * 100 / local114;
			}
		}
		if (Class218.aClass218_3 == Class602.aClass218_20) {
			if (anInterface18Array1 != null && anInterface18Array1.length > 0) {
				if (anInterface18Array1[0].method24490() < 100) {
					return 0;
				}
				if (anInterface18Array1.length > 1 && aClass624_1.method33776() && anInterface18Array1[1].method24490() < 100) {
					return 0;
				}
			}
			Class379.aClass312_1.method25797(client.anInterface34_1);
			Class134.method22909(Class613.aClass21_13);
			Class166.method23342(13);
		}
		if (Class218.aClass218_10 == Class602.aClass218_20) {
			Class294.aClass359_54 = Class273.method25350(Class188.aClass188_1, false, 1, true);
			Class491.aClass359_91 = Class273.method25350(Class188.aClass188_11, false, 1, true);
			Class602.aClass359_112 = Class273.method25350(Class188.aClass188_26, false, 1, true);
			Class73.aClass359_25 = Class273.method25350(Class188.aClass188_33, false, 1, true);
			Class453.aClass359_77 = Class273.method25350(Class188.aClass188_7, false, 1, true);
			Class430.aClass359_74 = Class273.method25350(Class188.aClass188_5, true, 1, true);
			Class55.aClass359_17 = Class273.method25350(Class188.aClass188_2, false, 1, true);
			Class72.aClass359_23 = Class273.method25350(Class188.aClass188_8, true, 1, true);
			Class13_Sub6.aClass359_2 = Class273.method25350(Class188.aClass188_34, true, 1, true);
			Class403.aClass359_66 = Class273.method25350(Class188.aClass188_9, false, 1, true);
			Class474.aClass359_85 = Class273.method25350(Class188.aClass188_10, false, 1, true);
			if (!Class202.aBoolean664) {
				Class462.aClass359_82 = Class273.method25350(Class188.aClass188_12, true, 1, false);
				Class427.aClass359_71 = Class273.method25350(Class188.aClass188_6, true, 1, false);
			}
			Class448.aClass359_76 = Class273.method25350(Class188.aClass188_37, false, 1, true);
			Class580.aClass359_105 = Class273.method25350(Class188.aClass188_14, false, 1, true);
			Class534.aClass359_97 = Class273.method25350(Class188.aClass188_4, false, 1, true);
			Class13_Sub18.aClass359_3 = Class273.method25350(Class188.aClass188_16, false, 1, true);
			Class27_Sub1.aClass359_4 = Class273.method25350(Class188.aClass188_17, false, 1, true);
			Class400.aClass359_64 = Class273.method25350(Class188.aClass188_18, false, 1, true);
			Class52.aClass359_16 = Class273.method25350(Class188.aClass188_19, false, 1, true);
			Class579.aClass359_102 = Class273.method25350(Class188.aClass188_20, true, 1, true);
			Class403.aClass359_65 = Class273.method25350(Class188.aClass188_21, false, 1, true);
			Class623.aClass359_116 = Class273.method25350(Class188.aClass188_13, false, 1, true);
			Class50_Sub1.aClass359_15 = Class273.method25350(Class188.aClass188_23, true, 1, true);
			Class485.aClass359_90 = Class273.method25350(Class188.aClass188_28, false, 1, true);
			Class276.aClass359_52 = Class273.method25350(Class188.aClass188_25, true, 1, true);
			Class161.aClass359_35 = Class273.method25350(Class188.aClass188_3, false, 1, true);
			Class329.aClass359_60 = Class273.method25350(Class188.aClass188_32, true, 1, true);
			Class557.aClass359_98 = Class273.method25350(Class188.aClass188_27, true, 1, true);
			Class127.aClass359_33 = Class273.method25350(Class188.aClass188_22, true, 1, true);
			Class343.aClass359_63 = Class273.method25350(Class188.aClass188_15, true, 2, true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_5) {
			local6 = 0;
			for (local114 = 0; local114 < Class296.aClass46_Sub1Array1.length; local114++) {
				if (Class296.aClass46_Sub1Array1[local114] != null) {
					local6 += Class296.aClass46_Sub1Array1[local114].method8535() * anIntArray395[local114] / 100;
				}
			}
			if (local6 != 100) {
				if (anInt3740 * -384082965 < 0) {
					anInt3740 = local6 * -479726397;
				}
				return (local6 - anInt3740 * -384082965) * 100 / (100 - anInt3740 * -384082965);
			}
			Class438.method28215(Class294.aClass359_54);
			Class379.aClass312_1 = new Class312(Class294.aClass359_54, Class475.aClass359_86, Class294.method25565());
		}
		if (Class602.aClass218_20 == Class218.aClass218_12) {
			@Pc(654) byte[] local654 = Class276.aClass359_52.method26705(Class474.aClass474_1.anInt5121 * 152686723);
			if (local654 == null) {
				return 0;
			}
			Class510.aClass183_1 = new Class183();
			if (!Class202.aBoolean664) {
				Class510.aClass183_1.method23655(50, 7340032);
			}
			Class465.method28639(local654);
			Class166.method23342(8);
		}
		if (Class218.aClass218_4 == Class602.aClass218_20 && Class370.aClass417_1 == null) {
			Class370.aClass417_1 = new Class417(Class557.aClass359_98);
			Class121.method22822(Class370.aClass417_1);
		}
		if (Class602.aClass218_20 == Class218.aClass218_8) {
			local6 = Class181.method23546();
			if (local6 < 100) {
				return local6;
			}
			Class56.method12593(Class276.aClass359_52.method26705(Class474.aClass474_4.anInt5121 * 152686723));
			Class630.aClass493_1 = new Class493(Class276.aClass359_52);
			Class346.aShortArrayArray4 = Class630.aClass493_1.aShortArrayArray6;
			Class488.aShortArrayArrayArray5 = Class630.aClass493_1.aShortArrayArrayArray6;
			if (Class630.aClass493_1.anInt5227 * -1377571755 != -1 && Class630.aClass493_1.anInt5223 * 1140314633 != -1) {
				client.anInt3032 = Class630.aClass493_1.anInt5227 * 1629643639;
				client.anInt3131 = Class630.aClass493_1.anInt5223 * 308079217;
			}
			Class589.aClass489_2 = new Class489(Class276.aClass359_52);
			Class490.aClass494_1 = new Class494(Class276.aClass359_52);
			Class44.aClass483_5 = new Class483(Class276.aClass359_52);
			Class61.aClass495_2 = new Class495(Class276.aClass359_52);
			Class58.aClass484_2 = new Class484(Class276.aClass359_52);
		}
		if (Class218.aClass218_9 == Class602.aClass218_20) {
			if (Class630.aClass493_1.anInt5220 * -238210995 != -1 && !Class55.aClass359_17.method26673(Class630.aClass493_1.anInt5220 * -238210995, 0)) {
				return 99;
			}
			Class43_Sub5.aClass134_5 = new Class134(Class50_Sub1.aClass359_15);
			Class325.anInterface11_9 = new Class110(Class72.aClass359_23, Class13_Sub6.aClass359_2);
			Class3_Sub20.aClass625_1 = new Class625(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class399.aClass428_1 = new Class428(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class589.aClass489_2);
			FileFilter_Sub1.aClass597_1 = new Class597(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class438.aClass589_1 = new Class589(client.aClass543_2, Class469.aClass530_2, Class580.aClass359_105);
			Class555.aClass499_5 = new Class499(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class598.aClass575_5 = new Class575(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class284.aClass465_1 = new Class465(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class623.aClass415_2 = new Class415(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class585.aClass228_2 = new Class228(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class55.aClass359_17);
			Class352.aClass621_1 = new Class621(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class16.aClass616_3 = new Class616(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class629.aClass457_11 = new Class457(client.aClass543_2, Class469.aClass530_2, true, Class448.aClass359_76, Class55.aClass359_17);
			client.aClass370_1.method27036(Class629.aClass457_11);
			Class30_Sub1.aClass379_1.method27251(new Class457(client.aClass543_2, Class469.aClass530_2, true, Class448.aClass359_76, Class55.aClass359_17));
			Class107.aClass454_3 = new Class454(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class342.aClass629_3 = new Class629(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class498.aClass579_1 = new Class579(client.aClass543_2, Class469.aClass530_2, true, Class534.aClass359_97, Class55.aClass359_17);
			Class44_Sub3.aClass596_1 = new Class596(client.aClass543_2, Class469.aClass530_2, true, Class3_Sub20.aClass625_1, Class13_Sub18.aClass359_3, Class55.aClass359_17);
			Class239.aClass505_1 = new Class505(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, true);
			Class279.aClass429_1 = new Class429(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class110.aClass436_1 = new Class436(client.aClass543_2, Class469.aClass530_2, Class27_Sub1.aClass359_4, Class491.aClass359_91, Class602.aClass359_112, Class279.aClass429_1);
			Class369.aClass413_1 = new Class413(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class375.aClass200_1 = new Class200(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class19.aClass523_14 = new Class523(client.aClass543_2, Class469.aClass530_2, Class400.aClass359_64, Class55.aClass359_17);
			Class583.aClass609_1 = new Class609(client.aClass543_2, Class469.aClass530_2, Class52.aClass359_16, true);
			Class500.aClass70_Sub1_Sub2_12 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_60, Class469.aClass530_2, Class73.aClass359_25);
			Class429.aClass70_Sub1_Sub1_2 = new Class70_Sub1_Sub1(client.aClass543_2, Class43.aClass43_68, Class469.aClass530_2, Class73.aClass359_25);
			Class419.aClass70_Sub1_Sub2_11 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_62, Class469.aClass530_2, Class73.aClass359_25);
			Class69.aClass70_Sub1_Sub2_9 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_64, Class469.aClass530_2, Class73.aClass359_25);
			Class135.aClass70_Sub1_Sub2_10 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_59, Class469.aClass530_2, Class73.aClass359_25);
			Class499.aMap13 = Class330.method26173(new Class70_Sub1[] { Class500.aClass70_Sub1_Sub2_12, Class429.aClass70_Sub1_Sub1_2, Class419.aClass70_Sub1_Sub2_11, Class69.aClass70_Sub1_Sub2_9, Class135.aClass70_Sub1_Sub2_10 });
			Class308.aClass70_Sub2_3 = new Class70_Sub2(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class499.aMap13);
			Class548.anInterface9_4 = new Class216();
			Class43_Sub1.method8382(Class453.aClass359_77, Class55.aClass359_17, Class294.aClass359_54, Class475.aClass359_86);
			Class291.method25542(Class161.aClass359_35);
			Class13_Sub23.aClass343_1 = new Class343(Class469.aClass530_2, Class403.aClass359_65, Class623.aClass359_116);
			Class622.aClass580_2 = new Class580(Class469.aClass530_2, Class403.aClass359_65, Class623.aClass359_116, new Class288());
			Class424.aClass165_1 = new Class165(Class429.aClass70_Sub1_Sub1_2, Class308.aClass70_Sub2_3, Class490.aClass494_1.method29304());
			Class457.method28515();
			Class160.method23213(Class110.aClass436_1);
			Class446.method28354(Class485.aClass359_90);
			Class30.method16448(Class55.aClass359_17, Class43_Sub5.aClass134_5, Class325.anInterface11_9);
			@Pc(1128) Class205 local1128 = new Class205(Class403.aClass359_66.method26691("huffman", ""));
			Class57.method12277(local1128);
			Class265.aClass47_1 = Class273.method25343();
			Class298.aClass3_Sub47_1 = new Class3_Sub47(true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_1) {
			local6 = Class21.method17428(Class294.aClass359_54) + Class379.aClass312_1.method25781(true);
			local114 = Class513.method29602() + Class379.aClass312_1.method25784();
			if (local6 < local114) {
				return local6 * 100 / local114;
			}
		}
		if (Class218.aClass218_11 == Class602.aClass218_20) {
			Class58.method12384(Class579.aClass359_102, Class555.aClass499_5, Class598.aClass575_5, client.aClass370_1.method26954(), Class107.aClass454_3, Class342.aClass629_3, Class424.aClass165_1, Class424.aClass165_1);
		}
		if (Class218.aClass218_6 == Class602.aClass218_20) {
			Class302.aClass10_Sub1_1 = new Class10_Sub1(Class500.aClass70_Sub1_Sub2_12);
			Class180.method23541();
			Class430.aClass359_74.method26748(false, true);
			Class294.aClass359_54.method26748(true, true);
			Class475.aClass359_86.method26748(true, true);
			Class403.aClass359_66.method26748(true, true);
			client.aBoolean576 = true;
		}
		if (Class218.aClass218_13 == Class602.aClass218_20 && Class630.aClass493_1.anInt5221 * 376354043 != -1) {
			if (!Class33.method7569(Class630.aClass493_1.anInt5221 * 376354043, null)) {
				return 0;
			}
			local106 = true;
			for (local114 = 0; local114 < Class178.aClass186Array1[Class630.aClass493_1.anInt5221 * 376354043].aClass178Array8.length; local114++) {
				@Pc(1256) Class178 local1256 = Class178.aClass186Array1[Class630.aClass493_1.anInt5221 * 376354043].aClass178Array8[local114];
				if (local1256.anInt3492 * -107621169 == 5 && local1256.anInt3509 * 1314053873 != -1 && !Class294.aClass359_54.method26673(local1256.anInt3509 * 1314053873, 0)) {
					local106 = false;
				}
			}
			if (!local106) {
				return 0;
			}
		}
		if (Class602.aClass218_20 == Class218.aClass218_14) {
			Class392.method27428(true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_15) {
			Class5.aClass221_4.method24396();
			try {
				Class383.aThread8.join();
			} catch (@Pc(1301) InterruptedException local1301) {
				return 0;
			}
			Class5.aClass221_4 = null;
			Class383.aThread8 = null;
			aClass359_46 = null;
			Class228.aClass359_43 = null;
			aClass624_1 = null;
			anInterface18Array1 = null;
			Class215.method24293();
			client.aBoolean567 = Class510.aClass3_Sub45_37.aClass60_Sub26_1.method13832() == 1;
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 1);
			if (client.aBoolean567) {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			} else if (Class510.aClass3_Sub45_37.aClass60_Sub10_1.aBoolean338 && Class298.aClass3_Sub47_1.anInt1811 * 573273029 < 512 && Class298.aClass3_Sub47_1.anInt1811 * 573273029 != 0) {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			}
			Class26_Sub1_Sub1_Sub1.method16728();
			if (client.aBoolean567) {
				Class546.method32647(0, false);
				if (!client.aBoolean568) {
					Class10.method715(Class600.aClass600_15);
				}
			} else {
				Class546.method32647(Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13373(), false);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13373() == 0) {
					Class10.method715(Class600.aClass600_10);
				}
			}
			Class157.method23193(Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, false);
			Class379.aClass312_1.method25797(client.anInterface34_1);
			Class134.method22909(Class613.aClass21_13);
			Class551.method32694(Class613.aClass21_13, Class294.aClass359_54);
			Class618.method33710(Class19_Sub1.aClass6Array10);
		}
		return Class438.method28213();
	}

	@OriginalMember(owner = "client!hz", name = "ai", descriptor = "()I", line = 335)
	static int method24571() {
		@Pc(6) int local6;
		if (Class510.aClass3_Sub45_37.aClass60_Sub26_1.method13832() == 0) {
			for (local6 = 0; local6 < client.anInt3154 * 1723265727; local6++) {
				if (client.anInterface46Array1[local6].method11581() == 's' || client.anInterface46Array1[local6].method11581() == 'S') {
					Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 1);
					client.aBoolean568 = true;
					Class10.method715(Class600.aClass600_5);
					break;
				}
			}
		}
		if (Class602.aClass218_20 == Class218.aClass218_16) {
			if (Class626.aClass334_1 == null) {
				Class626.aClass334_1 = new Class334(Class117.aClass51_2, Class571.aClass348_3, Class398.aClass347_3, Class361.aBigInteger5, Class361.aBigInteger8);
			}
			if (!Class626.aClass334_1.method26276()) {
				return 0;
			}
			Class315.method25834(0, null, true);
			Class85.aBoolean534 = !Class357.method26657();
			aClass359_46 = Class273.method25350(Class85.aBoolean534 ? Class188.aClass188_31 : Class188.aClass188_29, false, 1, true);
			Class228.aClass359_43 = Class273.method25350(Class188.aClass188_30, false, 1, true);
			Class475.aClass359_86 = Class273.method25350(Class188.aClass188_36, false, 1, true);
		}
		@Pc(114) int local114;
		@Pc(106) boolean local106;
		if (Class218.aClass218_2 == Class602.aClass218_20) {
			local106 = Class228.aClass359_43.method26676();
			local114 = Class296.aClass46_Sub1Array1[Class188.aClass188_30.method23965()].method8535();
			@Pc(130) int local130 = local114 + Class296.aClass46_Sub1Array1[Class85.aBoolean534 ? Class188.aClass188_31.method23965() : Class188.aClass188_29.method23965()].method8535();
			@Pc(140) int local140 = local130 + Class296.aClass46_Sub1Array1[Class188.aClass188_36.method23965()].method8535();
			@Pc(150) int local150 = local140 + (local106 ? 100 : Class228.aClass359_43.method26706());
			if (local150 != 400) {
				return local150 / 4;
			}
			anInt3738 = aClass359_46.method26749() * -2087684995;
			Class379.anInt4703 = Class228.aClass359_43.method26749() * -1382923009;
			Class274.method25354(aClass359_46);
			@Pc(177) int local177 = Class510.aClass3_Sub45_37.aClass60_Sub19_1.method13635();
			aClass624_1 = new Class624(client.aClass543_2, Class469.aClass530_2, Class228.aClass359_43);
			@Pc(189) Class626[] local189 = aClass624_1.method33777(local177);
			if (local189.length == 0) {
				local189 = aClass624_1.method33777(0);
			}
			@Pc(204) Class224 local204 = new Class224(aClass359_46, Class475.aClass359_86);
			if (local189.length > 0) {
				anInterface18Array1 = new Interface18[local189.length];
				for (@Pc(213) int local213 = 0; local213 < anInterface18Array1.length; local213++) {
					anInterface18Array1[local213] = new Class227(aClass624_1.method33774(local189[local213].anInt5579 * 3021567), local189[local213].anInt5578 * 449796557, local189[local213].anInt5580 * 1290640577, local204);
				}
			}
		}
		if (Class218.aClass218_17 == Class602.aClass218_20) {
			Class379.aClass312_1 = new Class312(aClass359_46, Class475.aClass359_86, Class294.method25565());
		}
		if (Class602.aClass218_20 == Class218.aClass218_7) {
			local6 = Class379.aClass312_1.method25782();
			local114 = Class379.aClass312_1.method25784();
			if (local6 < local114) {
				return local6 * 100 / local114;
			}
		}
		if (Class218.aClass218_3 == Class602.aClass218_20) {
			if (anInterface18Array1 != null && anInterface18Array1.length > 0) {
				if (anInterface18Array1[0].method24490() < 100) {
					return 0;
				}
				if (anInterface18Array1.length > 1 && aClass624_1.method33776() && anInterface18Array1[1].method24490() < 100) {
					return 0;
				}
			}
			Class379.aClass312_1.method25797(client.anInterface34_1);
			Class134.method22909(Class613.aClass21_13);
			Class166.method23342(13);
		}
		if (Class218.aClass218_10 == Class602.aClass218_20) {
			Class294.aClass359_54 = Class273.method25350(Class188.aClass188_1, false, 1, true);
			Class491.aClass359_91 = Class273.method25350(Class188.aClass188_11, false, 1, true);
			Class602.aClass359_112 = Class273.method25350(Class188.aClass188_26, false, 1, true);
			Class73.aClass359_25 = Class273.method25350(Class188.aClass188_33, false, 1, true);
			Class453.aClass359_77 = Class273.method25350(Class188.aClass188_7, false, 1, true);
			Class430.aClass359_74 = Class273.method25350(Class188.aClass188_5, true, 1, true);
			Class55.aClass359_17 = Class273.method25350(Class188.aClass188_2, false, 1, true);
			Class72.aClass359_23 = Class273.method25350(Class188.aClass188_8, true, 1, true);
			Class13_Sub6.aClass359_2 = Class273.method25350(Class188.aClass188_34, true, 1, true);
			Class403.aClass359_66 = Class273.method25350(Class188.aClass188_9, false, 1, true);
			Class474.aClass359_85 = Class273.method25350(Class188.aClass188_10, false, 1, true);
			if (!Class202.aBoolean664) {
				Class462.aClass359_82 = Class273.method25350(Class188.aClass188_12, true, 1, false);
				Class427.aClass359_71 = Class273.method25350(Class188.aClass188_6, true, 1, false);
			}
			Class448.aClass359_76 = Class273.method25350(Class188.aClass188_37, false, 1, true);
			Class580.aClass359_105 = Class273.method25350(Class188.aClass188_14, false, 1, true);
			Class534.aClass359_97 = Class273.method25350(Class188.aClass188_4, false, 1, true);
			Class13_Sub18.aClass359_3 = Class273.method25350(Class188.aClass188_16, false, 1, true);
			Class27_Sub1.aClass359_4 = Class273.method25350(Class188.aClass188_17, false, 1, true);
			Class400.aClass359_64 = Class273.method25350(Class188.aClass188_18, false, 1, true);
			Class52.aClass359_16 = Class273.method25350(Class188.aClass188_19, false, 1, true);
			Class579.aClass359_102 = Class273.method25350(Class188.aClass188_20, true, 1, true);
			Class403.aClass359_65 = Class273.method25350(Class188.aClass188_21, false, 1, true);
			Class623.aClass359_116 = Class273.method25350(Class188.aClass188_13, false, 1, true);
			Class50_Sub1.aClass359_15 = Class273.method25350(Class188.aClass188_23, true, 1, true);
			Class485.aClass359_90 = Class273.method25350(Class188.aClass188_28, false, 1, true);
			Class276.aClass359_52 = Class273.method25350(Class188.aClass188_25, true, 1, true);
			Class161.aClass359_35 = Class273.method25350(Class188.aClass188_3, false, 1, true);
			Class329.aClass359_60 = Class273.method25350(Class188.aClass188_32, true, 1, true);
			Class557.aClass359_98 = Class273.method25350(Class188.aClass188_27, true, 1, true);
			Class127.aClass359_33 = Class273.method25350(Class188.aClass188_22, true, 1, true);
			Class343.aClass359_63 = Class273.method25350(Class188.aClass188_15, true, 2, true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_5) {
			local6 = 0;
			for (local114 = 0; local114 < Class296.aClass46_Sub1Array1.length; local114++) {
				if (Class296.aClass46_Sub1Array1[local114] != null) {
					local6 += Class296.aClass46_Sub1Array1[local114].method8535() * anIntArray395[local114] / 100;
				}
			}
			if (local6 != 100) {
				if (anInt3740 * -384082965 < 0) {
					anInt3740 = local6 * -479726397;
				}
				return (local6 - anInt3740 * -384082965) * 100 / (100 - anInt3740 * -384082965);
			}
			Class438.method28215(Class294.aClass359_54);
			Class379.aClass312_1 = new Class312(Class294.aClass359_54, Class475.aClass359_86, Class294.method25565());
		}
		if (Class602.aClass218_20 == Class218.aClass218_12) {
			@Pc(654) byte[] local654 = Class276.aClass359_52.method26705(Class474.aClass474_1.anInt5121 * 152686723);
			if (local654 == null) {
				return 0;
			}
			Class510.aClass183_1 = new Class183();
			if (!Class202.aBoolean664) {
				Class510.aClass183_1.method23655(50, 7340032);
			}
			Class465.method28639(local654);
			Class166.method23342(8);
		}
		if (Class218.aClass218_4 == Class602.aClass218_20 && Class370.aClass417_1 == null) {
			Class370.aClass417_1 = new Class417(Class557.aClass359_98);
			Class121.method22822(Class370.aClass417_1);
		}
		if (Class602.aClass218_20 == Class218.aClass218_8) {
			local6 = Class181.method23546();
			if (local6 < 100) {
				return local6;
			}
			Class56.method12593(Class276.aClass359_52.method26705(Class474.aClass474_4.anInt5121 * 152686723));
			Class630.aClass493_1 = new Class493(Class276.aClass359_52);
			Class346.aShortArrayArray4 = Class630.aClass493_1.aShortArrayArray6;
			Class488.aShortArrayArrayArray5 = Class630.aClass493_1.aShortArrayArrayArray6;
			if (Class630.aClass493_1.anInt5227 * -1377571755 != -1 && Class630.aClass493_1.anInt5223 * 1140314633 != -1) {
				client.anInt3032 = Class630.aClass493_1.anInt5227 * 1629643639;
				client.anInt3131 = Class630.aClass493_1.anInt5223 * 308079217;
			}
			Class589.aClass489_2 = new Class489(Class276.aClass359_52);
			Class490.aClass494_1 = new Class494(Class276.aClass359_52);
			Class44.aClass483_5 = new Class483(Class276.aClass359_52);
			Class61.aClass495_2 = new Class495(Class276.aClass359_52);
			Class58.aClass484_2 = new Class484(Class276.aClass359_52);
		}
		if (Class218.aClass218_9 == Class602.aClass218_20) {
			if (Class630.aClass493_1.anInt5220 * -238210995 != -1 && !Class55.aClass359_17.method26673(Class630.aClass493_1.anInt5220 * -238210995, 0)) {
				return 99;
			}
			Class43_Sub5.aClass134_5 = new Class134(Class50_Sub1.aClass359_15);
			Class325.anInterface11_9 = new Class110(Class72.aClass359_23, Class13_Sub6.aClass359_2);
			Class3_Sub20.aClass625_1 = new Class625(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class399.aClass428_1 = new Class428(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class589.aClass489_2);
			FileFilter_Sub1.aClass597_1 = new Class597(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class438.aClass589_1 = new Class589(client.aClass543_2, Class469.aClass530_2, Class580.aClass359_105);
			Class555.aClass499_5 = new Class499(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class598.aClass575_5 = new Class575(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class284.aClass465_1 = new Class465(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class623.aClass415_2 = new Class415(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class585.aClass228_2 = new Class228(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class55.aClass359_17);
			Class352.aClass621_1 = new Class621(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class16.aClass616_3 = new Class616(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class629.aClass457_11 = new Class457(client.aClass543_2, Class469.aClass530_2, true, Class448.aClass359_76, Class55.aClass359_17);
			client.aClass370_1.method27036(Class629.aClass457_11);
			Class30_Sub1.aClass379_1.method27251(new Class457(client.aClass543_2, Class469.aClass530_2, true, Class448.aClass359_76, Class55.aClass359_17));
			Class107.aClass454_3 = new Class454(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class342.aClass629_3 = new Class629(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class498.aClass579_1 = new Class579(client.aClass543_2, Class469.aClass530_2, true, Class534.aClass359_97, Class55.aClass359_17);
			Class44_Sub3.aClass596_1 = new Class596(client.aClass543_2, Class469.aClass530_2, true, Class3_Sub20.aClass625_1, Class13_Sub18.aClass359_3, Class55.aClass359_17);
			Class239.aClass505_1 = new Class505(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, true);
			Class279.aClass429_1 = new Class429(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class110.aClass436_1 = new Class436(client.aClass543_2, Class469.aClass530_2, Class27_Sub1.aClass359_4, Class491.aClass359_91, Class602.aClass359_112, Class279.aClass429_1);
			Class369.aClass413_1 = new Class413(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class375.aClass200_1 = new Class200(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class19.aClass523_14 = new Class523(client.aClass543_2, Class469.aClass530_2, Class400.aClass359_64, Class55.aClass359_17);
			Class583.aClass609_1 = new Class609(client.aClass543_2, Class469.aClass530_2, Class52.aClass359_16, true);
			Class500.aClass70_Sub1_Sub2_12 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_60, Class469.aClass530_2, Class73.aClass359_25);
			Class429.aClass70_Sub1_Sub1_2 = new Class70_Sub1_Sub1(client.aClass543_2, Class43.aClass43_68, Class469.aClass530_2, Class73.aClass359_25);
			Class419.aClass70_Sub1_Sub2_11 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_62, Class469.aClass530_2, Class73.aClass359_25);
			Class69.aClass70_Sub1_Sub2_9 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_64, Class469.aClass530_2, Class73.aClass359_25);
			Class135.aClass70_Sub1_Sub2_10 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_59, Class469.aClass530_2, Class73.aClass359_25);
			Class499.aMap13 = Class330.method26173(new Class70_Sub1[] { Class500.aClass70_Sub1_Sub2_12, Class429.aClass70_Sub1_Sub1_2, Class419.aClass70_Sub1_Sub2_11, Class69.aClass70_Sub1_Sub2_9, Class135.aClass70_Sub1_Sub2_10 });
			Class308.aClass70_Sub2_3 = new Class70_Sub2(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class499.aMap13);
			Class548.anInterface9_4 = new Class216();
			Class43_Sub1.method8382(Class453.aClass359_77, Class55.aClass359_17, Class294.aClass359_54, Class475.aClass359_86);
			Class291.method25542(Class161.aClass359_35);
			Class13_Sub23.aClass343_1 = new Class343(Class469.aClass530_2, Class403.aClass359_65, Class623.aClass359_116);
			Class622.aClass580_2 = new Class580(Class469.aClass530_2, Class403.aClass359_65, Class623.aClass359_116, new Class288());
			Class424.aClass165_1 = new Class165(Class429.aClass70_Sub1_Sub1_2, Class308.aClass70_Sub2_3, Class490.aClass494_1.method29304());
			Class457.method28515();
			Class160.method23213(Class110.aClass436_1);
			Class446.method28354(Class485.aClass359_90);
			Class30.method16448(Class55.aClass359_17, Class43_Sub5.aClass134_5, Class325.anInterface11_9);
			@Pc(1128) Class205 local1128 = new Class205(Class403.aClass359_66.method26691("huffman", ""));
			Class57.method12277(local1128);
			Class265.aClass47_1 = Class273.method25343();
			Class298.aClass3_Sub47_1 = new Class3_Sub47(true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_1) {
			local6 = Class21.method17428(Class294.aClass359_54) + Class379.aClass312_1.method25781(true);
			local114 = Class513.method29602() + Class379.aClass312_1.method25784();
			if (local6 < local114) {
				return local6 * 100 / local114;
			}
		}
		if (Class218.aClass218_11 == Class602.aClass218_20) {
			Class58.method12384(Class579.aClass359_102, Class555.aClass499_5, Class598.aClass575_5, client.aClass370_1.method26954(), Class107.aClass454_3, Class342.aClass629_3, Class424.aClass165_1, Class424.aClass165_1);
		}
		if (Class218.aClass218_6 == Class602.aClass218_20) {
			Class302.aClass10_Sub1_1 = new Class10_Sub1(Class500.aClass70_Sub1_Sub2_12);
			Class180.method23541();
			Class430.aClass359_74.method26748(false, true);
			Class294.aClass359_54.method26748(true, true);
			Class475.aClass359_86.method26748(true, true);
			Class403.aClass359_66.method26748(true, true);
			client.aBoolean576 = true;
		}
		if (Class218.aClass218_13 == Class602.aClass218_20 && Class630.aClass493_1.anInt5221 * 376354043 != -1) {
			if (!Class33.method7569(Class630.aClass493_1.anInt5221 * 376354043, null)) {
				return 0;
			}
			local106 = true;
			for (local114 = 0; local114 < Class178.aClass186Array1[Class630.aClass493_1.anInt5221 * 376354043].aClass178Array8.length; local114++) {
				@Pc(1256) Class178 local1256 = Class178.aClass186Array1[Class630.aClass493_1.anInt5221 * 376354043].aClass178Array8[local114];
				if (local1256.anInt3492 * -107621169 == 5 && local1256.anInt3509 * 1314053873 != -1 && !Class294.aClass359_54.method26673(local1256.anInt3509 * 1314053873, 0)) {
					local106 = false;
				}
			}
			if (!local106) {
				return 0;
			}
		}
		if (Class602.aClass218_20 == Class218.aClass218_14) {
			Class392.method27428(true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_15) {
			Class5.aClass221_4.method24396();
			try {
				Class383.aThread8.join();
			} catch (@Pc(1301) InterruptedException local1301) {
				return 0;
			}
			Class5.aClass221_4 = null;
			Class383.aThread8 = null;
			aClass359_46 = null;
			Class228.aClass359_43 = null;
			aClass624_1 = null;
			anInterface18Array1 = null;
			Class215.method24293();
			client.aBoolean567 = Class510.aClass3_Sub45_37.aClass60_Sub26_1.method13832() == 1;
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 1);
			if (client.aBoolean567) {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			} else if (Class510.aClass3_Sub45_37.aClass60_Sub10_1.aBoolean338 && Class298.aClass3_Sub47_1.anInt1811 * 573273029 < 512 && Class298.aClass3_Sub47_1.anInt1811 * 573273029 != 0) {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			}
			Class26_Sub1_Sub1_Sub1.method16728();
			if (client.aBoolean567) {
				Class546.method32647(0, false);
				if (!client.aBoolean568) {
					Class10.method715(Class600.aClass600_15);
				}
			} else {
				Class546.method32647(Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13373(), false);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13373() == 0) {
					Class10.method715(Class600.aClass600_10);
				}
			}
			Class157.method23193(Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, false);
			Class379.aClass312_1.method25797(client.anInterface34_1);
			Class134.method22909(Class613.aClass21_13);
			Class551.method32694(Class613.aClass21_13, Class294.aClass359_54);
			Class618.method33710(Class19_Sub1.aClass6Array10);
		}
		return Class438.method28213();
	}

	@OriginalMember(owner = "client!hz", name = "aq", descriptor = "([B)V", line = 605)
	static void method24569(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method20269();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				Class479.anInt5144 = local4.method20271() * -1956438823;
			}
		}
	}

	@OriginalMember(owner = "client!hz", name = "ax", descriptor = "([B)V", line = 614)
	static void method24550(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method20269();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method20271();
				Class510.aClass183_1.method23592(local19);
			}
		}
	}

	@OriginalMember(owner = "client!hz", name = "av", descriptor = "([B)V", line = 614)
	static void method24570(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method20269();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method20271();
				Class510.aClass183_1.method23592(local19);
			}
		}
	}

	@OriginalMember(owner = "client!hz", name = "az", descriptor = "([B)V", line = 614)
	static void method24572(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method20269();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method20271();
				Class510.aClass183_1.method23592(local19);
			}
		}
	}

	@OriginalMember(owner = "client!hz", name = "al", descriptor = "()V", line = 626)
	static void method24573() {
		@Pc(6) Class592 local6 = Class348.method26559("2", client.aClass543_2.aString236, false);
		Class302.aClass10_Sub1_1.method722(local6);
	}

	@OriginalMember(owner = "client!hz", name = "ao", descriptor = "()I", line = 631)
	public static int method24559() {
		return Class379.anInt4703 * 1322564351;
	}

	@OriginalMember(owner = "client!hz", name = "ap", descriptor = "()I", line = 631)
	public static int method24575() {
		return Class379.anInt4703 * 1322564351;
	}

	@OriginalMember(owner = "client!hz", name = "ab", descriptor = "()I", line = 635)
	public static int method24563() {
		return anInt3738 * -1726241579;
	}

	@OriginalMember(owner = "client!hz", name = "zs", descriptor = "(Lclient!vs;I)V", line = 8587)
	static final void method24577(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.aBooleanArray29[local12] ? 1 : 0;
	}

	@OriginalMember(owner = "client!hz", name = "aes", descriptor = "(Lclient!vs;I)V", line = 9763)
	static final void method24578(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class622.aClass580_2.method33211(local12).method19279();
	}
}
