package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jz")
public class Class354 {

	@OriginalMember(owner = "client!jz", name = "c", descriptor = "[Lclient!js;")
	static Interface32[] anInterface32Array1;

	@OriginalMember(owner = "client!jz", name = "l", descriptor = "Lclient!acs;")
	static Class66 aClass66_1;

	@OriginalMember(owner = "client!jz", name = "p", descriptor = "[Lclient!ih;")
	static Class322[] aClass322Array1;

	@OriginalMember(owner = "client!jz", name = "w", descriptor = "Lclient!pw;")
	static Class478 aClass478_108;

	@OriginalMember(owner = "client!jz", name = "y", descriptor = "Lclient!pw;")
	static Class478 aClass478_109;

	@OriginalMember(owner = "client!jz", name = "x", descriptor = "J")
	static long aLong260;

	@OriginalMember(owner = "client!jz", name = "z", descriptor = "Ljava/lang/String;")
	static final String aString207 = " - ";

	@OriginalMember(owner = "client!jz", name = "q", descriptor = "Ljava/lang/Thread;")
	static Thread aThread7;

	@OriginalMember(owner = "client!jz", name = "dh", descriptor = "Lclient!mz;")
	public static Class411 aClass411_1;

	@OriginalMember(owner = "client!jz", name = "v", descriptor = "I")
	static int anInt4498 = 1048534259;

	@OriginalMember(owner = "client!jz", name = "j", descriptor = "Z")
	static boolean aBoolean719 = false;

	@OriginalMember(owner = "client!jz", name = "u", descriptor = "I")
	static int anInt4497 = 399326993;

	@OriginalMember(owner = "client!jz", name = "w", descriptor = "(II)V", line = 92)
	public static void method27932(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(3, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!jz", name = "<init>", descriptor = "()V", line = 229)
	Class354() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jz", name = "z", descriptor = "()V", line = 234)
	public static void method27933() {
		aBoolean719 = true;
		Class77_Sub22.aString48 = Class589.aString234;
		Class117.aString44 = Class589.aString233;
		Class619.method32395(false);
		Class264.method26450();
		aClass322Array1 = null;
		Class528.aClass473_1 = null;
		Class668.method33179(8);
	}

	@OriginalMember(owner = "client!jz", name = "i", descriptor = "()Z", line = 245)
	public static boolean method27934() {
		return aBoolean719;
	}

	@OriginalMember(owner = "client!jz", name = "k", descriptor = "()Z", line = 245)
	public static boolean method27935() {
		return aBoolean719;
	}

	@OriginalMember(owner = "client!jz", name = "e", descriptor = "()Z", line = 245)
	public static boolean method27936() {
		return aBoolean719;
	}

	@OriginalMember(owner = "client!jz", name = "j", descriptor = "()Z", line = 245)
	public static boolean method27937() {
		return aBoolean719;
	}

	@OriginalMember(owner = "client!jz", name = "u", descriptor = "()Z", line = 245)
	public static boolean method27938() {
		return aBoolean719;
	}

	@OriginalMember(owner = "client!jz", name = "f", descriptor = "()V", line = 249)
	public static void method27939() {
		if (aClass322Array1 == null) {
			aClass322Array1 = Class322.method27465();
			Class80.aClass322_4 = aClass322Array1[0];
			aLong260 = Class280.method26667() * -3214781987892434315L;
		}
		if (Class307.aClass327_1 == null) {
			Class125.method12682();
		}
		@Pc(20) Class322 local20 = Class80.aClass322_4;
		@Pc(23) int local23 = Class656.method33034();
		if (local20 == Class80.aClass322_4) {
			Class304.aString192 = Class80.aClass322_4.aClass44_178.method713(Class128.aClass667_3);
			Class192.aString165 = Class304.aString192;
			if (Class80.aClass322_4.aBoolean699) {
				Class238.anInt3781 = (Class80.aClass322_4.anInt4078 * 255476555 + (Class80.aClass322_4.anInt4079 * 1646981573 - Class80.aClass322_4.anInt4078 * 255476555) * local23 / 100) * 310636191;
			}
			if (Class80.aClass322_4.aBoolean698) {
				Class192.aString165 = Class192.aString165 + " - " + Class238.anInt3781 * 664251743 + "%";
			}
		} else if (Class80.aClass322_4 == Class322.aClass322_20) {
			Class307.aClass327_1 = null;
			Class668.method33179(15);
			if (aBoolean719) {
				aBoolean719 = false;
				Class96_Sub5.method7143(Class77_Sub22.aString48, Class117.aString44, "", false);
			}
		} else {
			Class304.aString192 = local20.aClass44_177.method713(Class128.aClass667_3);
			Class192.aString165 = Class304.aString192;
			if (Class80.aClass322_4.aBoolean698) {
				Class192.aString165 = Class192.aString165 + " - " + local20.anInt4079 * 1646981573 + "%";
			}
			Class238.anInt3781 = local20.anInt4079 * 2000703323;
			if (Class80.aClass322_4.aBoolean699 || local20.aBoolean699) {
				aLong260 = Class280.method26667() * -3214781987892434315L;
			}
		}
		if (Class307.aClass327_1 == null) {
			return;
		}
		Class307.aClass327_1.method27554(aLong260 * -8730536087753452067L, Class304.aString192, Class192.aString165, Class238.anInt3781 * 664251743, Class80.aClass322_4);
		if (anInterface32Array1 == null) {
			return;
		}
		for (@Pc(161) int local161 = anInt4498 * 1101456325 + 1; local161 < anInterface32Array1.length; local161++) {
			if (anInterface32Array1[local161].method27491() >= 100 && anInt4498 * 1101456325 == local161 - 1 && client.anInt3390 * -1850530127 != 8 && Class307.aClass327_1.method27547()) {
				try {
					anInterface32Array1[local161].method27482();
				} catch (@Pc(195) Exception local195) {
					anInterface32Array1 = null;
					break;
				}
				Class307.aClass327_1.method27551(anInterface32Array1[local161]);
				anInt4498 += -1048534259;
				if (anInt4498 * 1101456325 >= anInterface32Array1.length - 1 && anInterface32Array1.length > 1) {
					anInt4498 = (aClass66_1.method950() ? 0 : -1) * -1048534259;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jz", name = "o", descriptor = "()V", line = 249)
	public static void method27940() {
		if (aClass322Array1 == null) {
			aClass322Array1 = Class322.method27465();
			Class80.aClass322_4 = aClass322Array1[0];
			aLong260 = Class280.method26667() * -3214781987892434315L;
		}
		if (Class307.aClass327_1 == null) {
			Class125.method12682();
		}
		@Pc(20) Class322 local20 = Class80.aClass322_4;
		@Pc(23) int local23 = Class656.method33034();
		if (local20 == Class80.aClass322_4) {
			Class304.aString192 = Class80.aClass322_4.aClass44_178.method713(Class128.aClass667_3);
			Class192.aString165 = Class304.aString192;
			if (Class80.aClass322_4.aBoolean699) {
				Class238.anInt3781 = (Class80.aClass322_4.anInt4078 * 255476555 + (Class80.aClass322_4.anInt4079 * 1646981573 - Class80.aClass322_4.anInt4078 * 255476555) * local23 / 100) * 310636191;
			}
			if (Class80.aClass322_4.aBoolean698) {
				Class192.aString165 = Class192.aString165 + " - " + Class238.anInt3781 * 664251743 + "%";
			}
		} else if (Class80.aClass322_4 == Class322.aClass322_20) {
			Class307.aClass327_1 = null;
			Class668.method33179(15);
			if (aBoolean719) {
				aBoolean719 = false;
				Class96_Sub5.method7143(Class77_Sub22.aString48, Class117.aString44, "", false);
			}
		} else {
			Class304.aString192 = local20.aClass44_177.method713(Class128.aClass667_3);
			Class192.aString165 = Class304.aString192;
			if (Class80.aClass322_4.aBoolean698) {
				Class192.aString165 = Class192.aString165 + " - " + local20.anInt4079 * 1646981573 + "%";
			}
			Class238.anInt3781 = local20.anInt4079 * 2000703323;
			if (Class80.aClass322_4.aBoolean699 || local20.aBoolean699) {
				aLong260 = Class280.method26667() * -3214781987892434315L;
			}
		}
		if (Class307.aClass327_1 == null) {
			return;
		}
		Class307.aClass327_1.method27554(aLong260 * -8730536087753452067L, Class304.aString192, Class192.aString165, Class238.anInt3781 * 664251743, Class80.aClass322_4);
		if (anInterface32Array1 == null) {
			return;
		}
		for (@Pc(161) int local161 = anInt4498 * 1101456325 + 1; local161 < anInterface32Array1.length; local161++) {
			if (anInterface32Array1[local161].method27491() >= 100 && anInt4498 * 1101456325 == local161 - 1 && client.anInt3390 * -1850530127 != 8 && Class307.aClass327_1.method27547()) {
				try {
					anInterface32Array1[local161].method27482();
				} catch (@Pc(195) Exception local195) {
					anInterface32Array1 = null;
					break;
				}
				Class307.aClass327_1.method27551(anInterface32Array1[local161]);
				anInt4498 += -1048534259;
				if (anInt4498 * 1101456325 >= anInterface32Array1.length - 1 && anInterface32Array1.length > 1) {
					anInt4498 = (aClass66_1.method950() ? 0 : -1) * -1048534259;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jz", name = "b", descriptor = "()V", line = 304)
	static void method27941() {
		if (Class80.aClass322_4 != null) {
			Class307.aClass327_1 = new Class327();
			Class307.aClass327_1.method27554(aLong260 * -8730536087753452067L, Class80.aClass322_4.aClass44_178.method713(Class128.aClass667_3), Class80.aClass322_4.aClass44_178.method713(Class128.aClass667_3), Class80.aClass322_4.anInt4078 * 255476555, Class80.aClass322_4);
			aThread7 = new Thread(Class307.aClass327_1, "");
			aThread7.start();
		}
	}

	@OriginalMember(owner = "client!jz", name = "n", descriptor = "(Z)V", line = 312)
	public static void method27942(@OriginalArg(0) boolean arg0) {
		if (Class307.aClass327_1 == null) {
			Class125.method12682();
		}
		if (arg0) {
			Class307.aClass327_1.method27545();
		}
	}

	@OriginalMember(owner = "client!jz", name = "a", descriptor = "()I", line = 317)
	public static int method27943() {
		return Class307.aClass327_1.method27540();
	}

	@OriginalMember(owner = "client!jz", name = "m", descriptor = "()I", line = 317)
	public static int method27944() {
		return Class307.aClass327_1.method27540();
	}

	@OriginalMember(owner = "client!jz", name = "h", descriptor = "()V", line = 321)
	public static void method27945() {
		if (anInterface32Array1 == null) {
			return;
		}
		@Pc(4) Interface32[] local4 = anInterface32Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface32 local14 = local4[local6];
			local14.method27482();
		}
	}

	@OriginalMember(owner = "client!jz", name = "aj", descriptor = "()I", line = 331)
	static int method27946() {
		@Pc(4) int local4 = Class80.aClass322_4.anInt4077 * -1262216053;
		if (local4 < aClass322Array1.length - 1) {
			Class80.aClass322_4 = aClass322Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!jz", name = "ag", descriptor = "()I", line = 337)
	static int method27947() {
		@Pc(6) int local6;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 0) {
			for (local6 = 0; local6 < client.anInt3401 * 1779655715; local6++) {
				if (client.anInterface62Array1[local6].method14146() == 's' || client.anInterface62Array1[local6].method14146() == 'S') {
					Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
					client.aBoolean590 = true;
					Class347.method27848(Class27.aClass27_9);
					break;
				}
			}
		}
		if (Class322.aClass322_14 == Class80.aClass322_4) {
			if (Class528.aClass473_1 == null) {
				Class528.aClass473_1 = new Class473(Class7.aClass129_1, Class47.aClass470_1, Class643.aClass469_3, Class291.aBigInteger1, Class291.aBigInteger4);
			}
			if (!Class528.aClass473_1.method29638()) {
				return 0;
			}
			Class75.method1148(0, null, true);
			Class252.aBoolean655 = !Class102.method7916();
			aClass478_109 = Class473.method29653(Class252.aBoolean655 ? Class40.aClass40_30 : Class40.aClass40_28, false, 1, true);
			aClass478_108 = Class473.method29653(Class40.aClass40_29, false, 1, true);
			Class145.aClass478_46 = Class473.method29653(Class40.aClass40_11, false, 1, true);
			Class585.aClass478_131 = Class473.method29653(Class40.aClass40_40, true, 1, true);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class80.aClass322_4 == Class322.aClass322_12) {
			local115 = aClass478_108.method29737();
			@Pc(119) boolean local119 = Class585.aClass478_131.method29737();
			local127 = Class503.aClass126_Sub1Array2[Class40.aClass40_29.method677()].method11591();
			@Pc(143) int local143 = local127 + Class503.aClass126_Sub1Array2[Class252.aBoolean655 ? Class40.aClass40_30.method677() : Class40.aClass40_28.method677()].method11591();
			@Pc(153) int local153 = local143 + Class503.aClass126_Sub1Array2[Class40.aClass40_11.method677()].method11591();
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class585.aClass478_131.method29743());
			@Pc(173) int local173 = local163 + (local115 ? 100 : aClass478_108.method29743());
			if (local173 != 500) {
				return local173 / 5;
			}
			Class617.aClass629_1 = new Class629(Class585.aClass478_131);
			Class568.method31388(Class617.aClass629_1);
			@Pc(193) int local193 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub43_1.method16275();
			aClass66_1 = new Class66(client.aClass670_4, Class128.aClass667_3, aClass478_108);
			@Pc(205) Class72[] local205 = aClass66_1.method948(local193);
			if (local205.length == 0) {
				local205 = aClass66_1.method948(0);
			}
			@Pc(219) Class339 local219 = new Class339(aClass478_109, Class145.aClass478_46);
			if (local205.length > 0) {
				anInterface32Array1 = new Interface32[local205.length];
				for (@Pc(228) int local228 = 0; local228 < anInterface32Array1.length; local228++) {
					anInterface32Array1[local228] = new Class319(aClass66_1.method946(local205[local228].anInt206 * 1064408419), local205[local228].anInt205 * -2060664041, local205[local228].anInt204 * -336114669, local219);
				}
			}
		}
		if (Class322.aClass322_8 == Class80.aClass322_4) {
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, aClass478_109, Class145.aClass478_46, Class26.method461());
		}
		@Pc(285) int local285;
		if (Class322.aClass322_11 == Class80.aClass322_4) {
			local6 = Class367.aClass415_1.method28631();
			local285 = Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_9) {
			if (anInterface32Array1 != null && anInterface32Array1.length > 0) {
				if (anInterface32Array1[0].method27491() < 100) {
					return 0;
				}
				if (anInterface32Array1.length > 1 && aClass66_1.method950() && anInterface32Array1[1].method27491() < 100) {
					return 0;
				}
			}
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class668.method33179(11);
		}
		if (Class322.aClass322_5 == Class80.aClass322_4) {
			Class470.aClass478_125 = Class473.method29653(Class40.aClass40_24, false, 1, true);
			Class211.aClass478_89 = Class473.method29653(Class40.aClass40_13, false, 1, true);
			Class395.aClass478_111 = Class473.method29653(Class40.aClass40_2, false, 1, true);
			Class262.aClass478_91 = Class473.method29653(Class40.aClass40_3, false, 1, true);
			Class7.aClass478_2 = Class473.method29653(Class40.aClass40_41, false, 1, true);
			Class317.aClass478_94 = Class473.method29653(Class40.aClass40_4, false, 1, true);
			Class107_Sub1.aClass478_28 = Class473.method29653(Class40.aClass40_5, true, 1, true);
			Class173.aClass478_87 = Class473.method29653(Class40.aClass40_6, false, 1, true);
			Class4.aClass478_1 = Class473.method29653(Class40.aClass40_42, true, 1, true);
			Class514.aClass478_127 = Class473.method29653(Class40.aClass40_36, true, 1, true);
			Class628.aClass478_135 = Class473.method29653(Class40.aClass40_38, false, 1, true);
			Class322.aClass478_95 = Class473.method29653(Class40.aClass40_9, false, 1, true);
			Class146_Sub1.aClass478_48 = Class473.method29653(Class40.aClass40_10, true, 1, false);
			Class569.aClass478_130 = Class473.method29653(Class40.aClass40_32, true, 1, false);
			Class220.aClass478_90 = Class473.method29653(Class40.aClass40_12, false, 1, true);
			Class272.aClass478_92 = Class473.method29653(Class40.aClass40_17, false, 1, true);
			Class96_Sub5.aClass478_17 = Class473.method29653(Class40.aClass40_1, false, 1, true);
			Class151_Sub3_Sub1.aClass478_86 = Class473.method29653(Class40.aClass40_15, false, 1, true);
			Class115_Sub3.aClass478_83 = Class473.method29653(Class40.aClass40_16, false, 1, true);
			Class338.aClass478_97 = Class473.method29653(Class40.aClass40_27, false, 1, true);
			Class39.aClass478_42 = Class473.method29653(Class40.aClass40_25, false, 1, true);
			Class688.aClass478_137 = Class473.method29653(Class40.aClass40_19, true, 1, false);
			Class52.aClass478_9 = Class473.method29653(Class40.aClass40_33, true, 1, true);
			Class499.aClass478_126 = Class473.method29653(Class40.aClass40_20, false, 1, true);
			Class379.aClass478_110 = Class473.method29653(Class40.aClass40_21, false, 1, true);
			Class694.aClass478_138 = Class473.method29653(Class40.aClass40_22, true, 1, true);
			Class675.aClass478_136 = Class473.method29653(Class40.aClass40_23, false, 1, true);
			Class406.aClass478_114 = Class473.method29653(Class40.aClass40_31, false, 1, true);
			client.aClass478_88 = Class473.method29653(Class40.aClass40_35, true, 1, true);
			Class517.aClass478_128 = Class473.method29653(Class40.aClass40_26, true, 1, true);
			Class323.aClass478_96 = Class473.method29653(Class40.aClass40_43, true, 1, true);
		}
		if (Class322.aClass322_21 == Class80.aClass322_4) {
			local6 = 0;
			local285 = 0;
			for (local127 = 0; local127 < Class503.aClass126_Sub1Array2.length; local127++) {
				if (Class503.aClass126_Sub1Array2[local127] != null) {
					local6 += Class503.aClass126_Sub1Array2[local127].method11591();
					local285++;
				}
			}
			if (local285 > 0) {
				local6 /= local285;
			}
			if (local6 != 100) {
				if (anInt4497 * -1948226033 < 0) {
					anInt4497 = local6 * -399326993;
				}
				return (local6 - anInt4497 * -1948226033) * 100 / (100 - anInt4497 * -1948226033);
			}
			Class75_Sub1.method1129(Class617.aClass629_1);
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, Class470.aClass478_125, Class145.aClass478_46, Class26.method461());
		}
		if (Class322.aClass322_18 == Class80.aClass322_4) {
			@Pc(671) byte[] local671 = Class585.aClass478_131.method29745(Class614.aClass614_3.anInt5587 * -448671533);
			if (local671 == null) {
				return 0;
			}
			Class94_Sub4.aClass261_1 = new Class261();
			Class94_Sub4.aClass261_1.method26273(50, 7340032);
			Class647.method32852(local671);
			Class668.method33179(4);
		}
		if (Class80.aClass322_4 == Class322.aClass322_13 && Class629.aClass541_1 == null) {
			Class629.aClass541_1 = new Class541(Class517.aClass478_128);
			Class144.method14992(Class629.aClass541_1);
		}
		if (Class322.aClass322_7 == Class80.aClass322_4) {
			local6 = Class62.method904();
			if (local6 < 100) {
				return local6;
			}
			Class326.method27533(Class585.aClass478_131.method29745(Class614.aClass614_1.anInt5587 * -448671533));
			Class628.aShortArrayArray5 = Class617.aClass629_1.aShortArrayArray6;
			Class101.aShortArrayArrayArray9 = Class617.aClass629_1.aShortArrayArrayArray11;
			Class580.aShortArrayArray4 = Class617.aClass629_1.aShortArrayArray7;
			Class479.aShortArrayArrayArray10 = Class617.aClass629_1.aShortArrayArrayArray12;
			if (Class617.aClass629_1.anInt5673 * 1576674457 != -1 && Class617.aClass629_1.anInt5680 * -1351281821 != -1) {
				client.anInt3394 = Class617.aClass629_1.anInt5673 * -1669149727;
				client.anInt3464 = Class617.aClass629_1.anInt5680 * -807589047;
			}
			Class636.aClass627_1 = new Class627(Class585.aClass478_131);
			Class544.aClass620_1 = new Class620(Class585.aClass478_131);
			Class695.aClass635_1 = new Class635(Class585.aClass478_131);
			Class96_Sub16.aClass625_1 = new Class625(Class585.aClass478_131);
			Class136.aClass619_2 = new Class619(Class585.aClass478_131);
		}
		if (Class80.aClass322_4 == Class322.aClass322_15) {
			if (Class617.aClass629_1.anInt5689 * -1085389923 != -1 && !Class173.aClass478_87.method29727(Class617.aClass629_1.anInt5689 * -1085389923, 0)) {
				return 99;
			}
			Class147.aClass209_7 = new Class209(Class694.aClass478_138);
			Class77.anInterface24_117 = new Class87_Sub1(Class4.aClass478_1, Class514.aClass478_127);
			Class77_Sub13_Sub12.aClass35_Sub22_1 = new Class35_Sub22(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub23.aClass35_Sub15_1 = new Class35_Sub15(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class648.aClass35_Sub5_1 = new Class35_Sub5(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class75_Sub1.aClass35_1 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_71, 64, new Class46(Class24.class));
			Class149.aClass35_10 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_49, 16, new Class46(Class52.class));
			Class663.aClass35_Sub21_1 = new Class35_Sub21(client.aClass670_4, Class128.aClass667_3, Class272.aClass478_92);
			Class555.aClass35_Sub17_3 = new Class35_Sub17(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class65.aClass35_Sub13_1 = new Class35_Sub13(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class629.aClass35_Sub1_1 = new Class35_Sub1(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class476.aClass35_Sub16_1 = new Class35_Sub16(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class333.aClass35_Sub14_1 = new Class35_Sub14(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class173.aClass478_87);
			Class248.aClass35_Sub19_1 = new Class35_Sub19(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub10.aClass35_Sub20_1 = new Class35_Sub20(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class92_Sub1.aClass35_Sub12_13 = new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87);
			client.aClass517_1.method30461(Class92_Sub1.aClass35_Sub12_13);
			Class196.aClass514_1.method30346(new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87));
			Class251.aClass35_Sub10_3 = new Class35_Sub10(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class118_Sub1.aClass35_Sub18_4 = new Class35_Sub18(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class578.aClass35_Sub3_1 = new Class35_Sub3(client.aClass670_4, Class128.aClass667_3, true, Class96_Sub5.aClass478_17, Class173.aClass478_87);
			Class537.aClass35_Sub7_1 = new Class35_Sub7(client.aClass670_4, Class128.aClass667_3, true, Class77_Sub13_Sub12.aClass35_Sub22_1, Class151_Sub3_Sub1.aClass478_86, Class173.aClass478_87);
			Class252.aClass42_Sub2_1 = new Class42_Sub2(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, true);
			Class358.aClass35_Sub8_1 = new Class35_Sub8(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub11.aClass35_Sub2_3 = new Class35_Sub2(client.aClass670_4, Class128.aClass667_3, Class115_Sub3.aClass478_83, Class211.aClass478_89, Class395.aClass478_111, Class358.aClass35_Sub8_1);
			Class214.aClass35_Sub6_1 = new Class35_Sub6(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class497.aClass35_Sub9_1 = new Class35_Sub9(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class482.aClass35_Sub4_1 = new Class35_Sub4(client.aClass670_4, Class128.aClass667_3, Class338.aClass478_97, Class173.aClass478_87);
			Class679.aClass42_Sub1_1 = new Class42_Sub1(client.aClass670_4, Class128.aClass667_3, Class39.aClass478_42, true);
			Class416.aClass80_Sub1_Sub2_4 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_64, Class128.aClass667_3, Class262.aClass478_91);
			Class562.aClass80_Sub1_Sub1_2 = new Class80_Sub1_Sub1(client.aClass670_4, Class127.aClass127_63, Class128.aClass667_3, Class262.aClass478_91);
			Class539.aClass80_Sub1_Sub2_6 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_68, Class128.aClass667_3, Class262.aClass478_91);
			Class55.aClass80_Sub1_Sub2_1 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_70, Class128.aClass667_3, Class262.aClass478_91);
			Class308.aClass80_Sub1_Sub2_3 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_71, Class128.aClass667_3, Class262.aClass478_91);
			Class528.aClass80_Sub1_Sub2_5 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_67, Class128.aClass667_3, Class262.aClass478_91);
			Class77_Sub23.aClass80_Sub1_Sub2_2 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_69, Class128.aClass667_3, Class262.aClass478_91);
			Class87_Sub1.aMap5 = Class404.method28523(new Class80_Sub1[] { Class416.aClass80_Sub1_Sub2_4, Class562.aClass80_Sub1_Sub1_2, Class539.aClass80_Sub1_Sub2_6, Class55.aClass80_Sub1_Sub2_1, Class308.aClass80_Sub1_Sub2_3, Class528.aClass80_Sub1_Sub2_5, Class77_Sub23.aClass80_Sub1_Sub2_2 });
			Class61.aClass35_Sub11_1 = new Class35_Sub11(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class87_Sub1.aMap5);
			Class310.anInterface17_4 = new Class332();
			Class75_Sub1.method1130(Class317.aClass478_94, Class173.aClass478_87, Class470.aClass478_125, Class145.aClass478_46);
			aClass411_1 = new Class411(Class406.aClass478_114);
			Class392.aClass398_1 = new Class398(Class675.aClass478_136);
			Class112.aClass405_3 = new Class405(Class675.aClass478_136);
			Class615.aClass465_1 = new Class465(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110);
			RuntimeException_Sub4.aClass41_2 = new Class41(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110, new Class408());
			Class55.aClass124_1 = new Class124(Class562.aClass80_Sub1_Sub1_2, Class61.aClass35_Sub11_1, Class544.aClass620_1.method32410());
			Class632.method32649();
			Class87_Sub1.method4258(Class96_Sub11.aClass35_Sub2_3);
			Class417.method28675(Class112.aClass405_3, Class392.aClass398_1);
			Class526.method30675(Class173.aClass478_87, Class147.aClass209_7, Class77.anInterface24_117);
			@Pc(1206) Class298 local1206 = new Class298(Class628.aClass478_135.method29778("huffman", ""));
			Class92.method23484(local1206);
			Class504.aClass125_2 = Class122_Sub1_Sub2.method18590();
			Class96_Sub23.aClass77_Sub28_1 = new Class77_Sub28(true);
		}
		if (Class80.aClass322_4 == Class322.aClass322_16) {
			local6 = Class630.method32602(Class470.aClass478_125) + Class367.aClass415_1.method28635(true);
			local285 = Class257.method26226() + Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_17) {
			Class136.method13895(Class688.aClass478_137, Class52.aClass478_9, Class555.aClass35_Sub17_3, Class65.aClass35_Sub13_1, client.aClass517_1.method30444(), Class251.aClass35_Sub10_3, Class118_Sub1.aClass35_Sub18_4, Class55.aClass124_1, Class55.aClass124_1);
		}
		if (Class322.aClass322_10 == Class80.aClass322_4) {
			Class56.aClass93_Sub1_1 = new Class93_Sub1(Class416.aClass80_Sub1_Sub2_4);
			Class416.method28671();
			Class638.aClass240_1 = Class77_Sub31.method13784();
			Class107_Sub1.aClass478_28.method29757(false, true);
			Class470.aClass478_125.method29757(true, true);
			Class145.aClass478_46.method29757(true, true);
			Class628.aClass478_135.method29757(true, true);
			client.aBoolean627 = true;
		}
		if (Class322.aClass322_19 == Class80.aClass322_4 && Class617.aClass629_1.anInt5666 * 143908383 != -1) {
			if (!Class211.method25607(Class617.aClass629_1.anInt5666 * 143908383, null)) {
				return 0;
			}
			local115 = true;
			for (local285 = 0; local285 < Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2.length; local285++) {
				@Pc(1338) Class277 local1338 = Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2[local285];
				if (local1338.anInt3857 * -1960530827 == 5 && local1338.anInt3954 * 2083357573 != -1 && !Class470.aClass478_125.method29727(local1338.anInt3954 * 2083357573, 0)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class322.aClass322_22 == Class80.aClass322_4) {
			Class149.method23150(true);
		}
		if (Class322.aClass322_6 == Class80.aClass322_4) {
			Class307.aClass327_1.method27570();
			try {
				aThread7.join();
			} catch (@Pc(1383) InterruptedException local1383) {
				return 0;
			}
			Class307.aClass327_1 = null;
			aThread7 = null;
			aClass478_109 = null;
			aClass478_108 = null;
			aClass66_1 = null;
			anInterface32Array1 = null;
			Class592.aMap21.remove(Class40.aClass40_29);
			Class592.aMap21.remove(Class40.aClass40_28);
			Class592.aMap21.remove(Class40.aClass40_30);
			Class108.method9021();
			client.aBoolean595 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 1;
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
			if (client.aBoolean595) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.aBoolean354 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 < 512 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 != 0) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			}
			Class667.method33150();
			if (client.aBoolean595) {
				Class533.method30776(0, false);
				if (!client.aBoolean590) {
					Class347.method27848(Class27.aClass27_10);
				}
			} else {
				Class533.method30776(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109(), false);
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() == 0) {
					Class347.method27848(Class27.aClass27_13);
				}
			}
			Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class600.method32037(Class284.aClass86_9, Class470.aClass478_125);
		}
		return Class552.method31013();
	}

	@OriginalMember(owner = "client!jz", name = "ai", descriptor = "()I", line = 337)
	static int method27948() {
		@Pc(6) int local6;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 0) {
			for (local6 = 0; local6 < client.anInt3401 * 1779655715; local6++) {
				if (client.anInterface62Array1[local6].method14146() == 's' || client.anInterface62Array1[local6].method14146() == 'S') {
					Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
					client.aBoolean590 = true;
					Class347.method27848(Class27.aClass27_9);
					break;
				}
			}
		}
		if (Class322.aClass322_14 == Class80.aClass322_4) {
			if (Class528.aClass473_1 == null) {
				Class528.aClass473_1 = new Class473(Class7.aClass129_1, Class47.aClass470_1, Class643.aClass469_3, Class291.aBigInteger1, Class291.aBigInteger4);
			}
			if (!Class528.aClass473_1.method29638()) {
				return 0;
			}
			Class75.method1148(0, null, true);
			Class252.aBoolean655 = !Class102.method7916();
			aClass478_109 = Class473.method29653(Class252.aBoolean655 ? Class40.aClass40_30 : Class40.aClass40_28, false, 1, true);
			aClass478_108 = Class473.method29653(Class40.aClass40_29, false, 1, true);
			Class145.aClass478_46 = Class473.method29653(Class40.aClass40_11, false, 1, true);
			Class585.aClass478_131 = Class473.method29653(Class40.aClass40_40, true, 1, true);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class80.aClass322_4 == Class322.aClass322_12) {
			local115 = aClass478_108.method29737();
			@Pc(119) boolean local119 = Class585.aClass478_131.method29737();
			local127 = Class503.aClass126_Sub1Array2[Class40.aClass40_29.method677()].method11591();
			@Pc(143) int local143 = local127 + Class503.aClass126_Sub1Array2[Class252.aBoolean655 ? Class40.aClass40_30.method677() : Class40.aClass40_28.method677()].method11591();
			@Pc(153) int local153 = local143 + Class503.aClass126_Sub1Array2[Class40.aClass40_11.method677()].method11591();
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class585.aClass478_131.method29743());
			@Pc(173) int local173 = local163 + (local115 ? 100 : aClass478_108.method29743());
			if (local173 != 500) {
				return local173 / 5;
			}
			Class617.aClass629_1 = new Class629(Class585.aClass478_131);
			Class568.method31388(Class617.aClass629_1);
			@Pc(193) int local193 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub43_1.method16275();
			aClass66_1 = new Class66(client.aClass670_4, Class128.aClass667_3, aClass478_108);
			@Pc(205) Class72[] local205 = aClass66_1.method948(local193);
			if (local205.length == 0) {
				local205 = aClass66_1.method948(0);
			}
			@Pc(219) Class339 local219 = new Class339(aClass478_109, Class145.aClass478_46);
			if (local205.length > 0) {
				anInterface32Array1 = new Interface32[local205.length];
				for (@Pc(228) int local228 = 0; local228 < anInterface32Array1.length; local228++) {
					anInterface32Array1[local228] = new Class319(aClass66_1.method946(local205[local228].anInt206 * 1064408419), local205[local228].anInt205 * -2060664041, local205[local228].anInt204 * -336114669, local219);
				}
			}
		}
		if (Class322.aClass322_8 == Class80.aClass322_4) {
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, aClass478_109, Class145.aClass478_46, Class26.method461());
		}
		@Pc(285) int local285;
		if (Class322.aClass322_11 == Class80.aClass322_4) {
			local6 = Class367.aClass415_1.method28631();
			local285 = Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_9) {
			if (anInterface32Array1 != null && anInterface32Array1.length > 0) {
				if (anInterface32Array1[0].method27491() < 100) {
					return 0;
				}
				if (anInterface32Array1.length > 1 && aClass66_1.method950() && anInterface32Array1[1].method27491() < 100) {
					return 0;
				}
			}
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class668.method33179(11);
		}
		if (Class322.aClass322_5 == Class80.aClass322_4) {
			Class470.aClass478_125 = Class473.method29653(Class40.aClass40_24, false, 1, true);
			Class211.aClass478_89 = Class473.method29653(Class40.aClass40_13, false, 1, true);
			Class395.aClass478_111 = Class473.method29653(Class40.aClass40_2, false, 1, true);
			Class262.aClass478_91 = Class473.method29653(Class40.aClass40_3, false, 1, true);
			Class7.aClass478_2 = Class473.method29653(Class40.aClass40_41, false, 1, true);
			Class317.aClass478_94 = Class473.method29653(Class40.aClass40_4, false, 1, true);
			Class107_Sub1.aClass478_28 = Class473.method29653(Class40.aClass40_5, true, 1, true);
			Class173.aClass478_87 = Class473.method29653(Class40.aClass40_6, false, 1, true);
			Class4.aClass478_1 = Class473.method29653(Class40.aClass40_42, true, 1, true);
			Class514.aClass478_127 = Class473.method29653(Class40.aClass40_36, true, 1, true);
			Class628.aClass478_135 = Class473.method29653(Class40.aClass40_38, false, 1, true);
			Class322.aClass478_95 = Class473.method29653(Class40.aClass40_9, false, 1, true);
			Class146_Sub1.aClass478_48 = Class473.method29653(Class40.aClass40_10, true, 1, false);
			Class569.aClass478_130 = Class473.method29653(Class40.aClass40_32, true, 1, false);
			Class220.aClass478_90 = Class473.method29653(Class40.aClass40_12, false, 1, true);
			Class272.aClass478_92 = Class473.method29653(Class40.aClass40_17, false, 1, true);
			Class96_Sub5.aClass478_17 = Class473.method29653(Class40.aClass40_1, false, 1, true);
			Class151_Sub3_Sub1.aClass478_86 = Class473.method29653(Class40.aClass40_15, false, 1, true);
			Class115_Sub3.aClass478_83 = Class473.method29653(Class40.aClass40_16, false, 1, true);
			Class338.aClass478_97 = Class473.method29653(Class40.aClass40_27, false, 1, true);
			Class39.aClass478_42 = Class473.method29653(Class40.aClass40_25, false, 1, true);
			Class688.aClass478_137 = Class473.method29653(Class40.aClass40_19, true, 1, false);
			Class52.aClass478_9 = Class473.method29653(Class40.aClass40_33, true, 1, true);
			Class499.aClass478_126 = Class473.method29653(Class40.aClass40_20, false, 1, true);
			Class379.aClass478_110 = Class473.method29653(Class40.aClass40_21, false, 1, true);
			Class694.aClass478_138 = Class473.method29653(Class40.aClass40_22, true, 1, true);
			Class675.aClass478_136 = Class473.method29653(Class40.aClass40_23, false, 1, true);
			Class406.aClass478_114 = Class473.method29653(Class40.aClass40_31, false, 1, true);
			client.aClass478_88 = Class473.method29653(Class40.aClass40_35, true, 1, true);
			Class517.aClass478_128 = Class473.method29653(Class40.aClass40_26, true, 1, true);
			Class323.aClass478_96 = Class473.method29653(Class40.aClass40_43, true, 1, true);
		}
		if (Class322.aClass322_21 == Class80.aClass322_4) {
			local6 = 0;
			local285 = 0;
			for (local127 = 0; local127 < Class503.aClass126_Sub1Array2.length; local127++) {
				if (Class503.aClass126_Sub1Array2[local127] != null) {
					local6 += Class503.aClass126_Sub1Array2[local127].method11591();
					local285++;
				}
			}
			if (local285 > 0) {
				local6 /= local285;
			}
			if (local6 != 100) {
				if (anInt4497 * -1948226033 < 0) {
					anInt4497 = local6 * -399326993;
				}
				return (local6 - anInt4497 * -1948226033) * 100 / (100 - anInt4497 * -1948226033);
			}
			Class75_Sub1.method1129(Class617.aClass629_1);
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, Class470.aClass478_125, Class145.aClass478_46, Class26.method461());
		}
		if (Class322.aClass322_18 == Class80.aClass322_4) {
			@Pc(671) byte[] local671 = Class585.aClass478_131.method29745(Class614.aClass614_3.anInt5587 * -448671533);
			if (local671 == null) {
				return 0;
			}
			Class94_Sub4.aClass261_1 = new Class261();
			Class94_Sub4.aClass261_1.method26273(50, 7340032);
			Class647.method32852(local671);
			Class668.method33179(4);
		}
		if (Class80.aClass322_4 == Class322.aClass322_13 && Class629.aClass541_1 == null) {
			Class629.aClass541_1 = new Class541(Class517.aClass478_128);
			Class144.method14992(Class629.aClass541_1);
		}
		if (Class322.aClass322_7 == Class80.aClass322_4) {
			local6 = Class62.method904();
			if (local6 < 100) {
				return local6;
			}
			Class326.method27533(Class585.aClass478_131.method29745(Class614.aClass614_1.anInt5587 * -448671533));
			Class628.aShortArrayArray5 = Class617.aClass629_1.aShortArrayArray6;
			Class101.aShortArrayArrayArray9 = Class617.aClass629_1.aShortArrayArrayArray11;
			Class580.aShortArrayArray4 = Class617.aClass629_1.aShortArrayArray7;
			Class479.aShortArrayArrayArray10 = Class617.aClass629_1.aShortArrayArrayArray12;
			if (Class617.aClass629_1.anInt5673 * 1576674457 != -1 && Class617.aClass629_1.anInt5680 * -1351281821 != -1) {
				client.anInt3394 = Class617.aClass629_1.anInt5673 * -1669149727;
				client.anInt3464 = Class617.aClass629_1.anInt5680 * -807589047;
			}
			Class636.aClass627_1 = new Class627(Class585.aClass478_131);
			Class544.aClass620_1 = new Class620(Class585.aClass478_131);
			Class695.aClass635_1 = new Class635(Class585.aClass478_131);
			Class96_Sub16.aClass625_1 = new Class625(Class585.aClass478_131);
			Class136.aClass619_2 = new Class619(Class585.aClass478_131);
		}
		if (Class80.aClass322_4 == Class322.aClass322_15) {
			if (Class617.aClass629_1.anInt5689 * -1085389923 != -1 && !Class173.aClass478_87.method29727(Class617.aClass629_1.anInt5689 * -1085389923, 0)) {
				return 99;
			}
			Class147.aClass209_7 = new Class209(Class694.aClass478_138);
			Class77.anInterface24_117 = new Class87_Sub1(Class4.aClass478_1, Class514.aClass478_127);
			Class77_Sub13_Sub12.aClass35_Sub22_1 = new Class35_Sub22(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub23.aClass35_Sub15_1 = new Class35_Sub15(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class648.aClass35_Sub5_1 = new Class35_Sub5(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class75_Sub1.aClass35_1 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_71, 64, new Class46(Class24.class));
			Class149.aClass35_10 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_49, 16, new Class46(Class52.class));
			Class663.aClass35_Sub21_1 = new Class35_Sub21(client.aClass670_4, Class128.aClass667_3, Class272.aClass478_92);
			Class555.aClass35_Sub17_3 = new Class35_Sub17(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class65.aClass35_Sub13_1 = new Class35_Sub13(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class629.aClass35_Sub1_1 = new Class35_Sub1(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class476.aClass35_Sub16_1 = new Class35_Sub16(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class333.aClass35_Sub14_1 = new Class35_Sub14(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class173.aClass478_87);
			Class248.aClass35_Sub19_1 = new Class35_Sub19(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub10.aClass35_Sub20_1 = new Class35_Sub20(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class92_Sub1.aClass35_Sub12_13 = new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87);
			client.aClass517_1.method30461(Class92_Sub1.aClass35_Sub12_13);
			Class196.aClass514_1.method30346(new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87));
			Class251.aClass35_Sub10_3 = new Class35_Sub10(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class118_Sub1.aClass35_Sub18_4 = new Class35_Sub18(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class578.aClass35_Sub3_1 = new Class35_Sub3(client.aClass670_4, Class128.aClass667_3, true, Class96_Sub5.aClass478_17, Class173.aClass478_87);
			Class537.aClass35_Sub7_1 = new Class35_Sub7(client.aClass670_4, Class128.aClass667_3, true, Class77_Sub13_Sub12.aClass35_Sub22_1, Class151_Sub3_Sub1.aClass478_86, Class173.aClass478_87);
			Class252.aClass42_Sub2_1 = new Class42_Sub2(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, true);
			Class358.aClass35_Sub8_1 = new Class35_Sub8(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub11.aClass35_Sub2_3 = new Class35_Sub2(client.aClass670_4, Class128.aClass667_3, Class115_Sub3.aClass478_83, Class211.aClass478_89, Class395.aClass478_111, Class358.aClass35_Sub8_1);
			Class214.aClass35_Sub6_1 = new Class35_Sub6(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class497.aClass35_Sub9_1 = new Class35_Sub9(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class482.aClass35_Sub4_1 = new Class35_Sub4(client.aClass670_4, Class128.aClass667_3, Class338.aClass478_97, Class173.aClass478_87);
			Class679.aClass42_Sub1_1 = new Class42_Sub1(client.aClass670_4, Class128.aClass667_3, Class39.aClass478_42, true);
			Class416.aClass80_Sub1_Sub2_4 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_64, Class128.aClass667_3, Class262.aClass478_91);
			Class562.aClass80_Sub1_Sub1_2 = new Class80_Sub1_Sub1(client.aClass670_4, Class127.aClass127_63, Class128.aClass667_3, Class262.aClass478_91);
			Class539.aClass80_Sub1_Sub2_6 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_68, Class128.aClass667_3, Class262.aClass478_91);
			Class55.aClass80_Sub1_Sub2_1 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_70, Class128.aClass667_3, Class262.aClass478_91);
			Class308.aClass80_Sub1_Sub2_3 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_71, Class128.aClass667_3, Class262.aClass478_91);
			Class528.aClass80_Sub1_Sub2_5 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_67, Class128.aClass667_3, Class262.aClass478_91);
			Class77_Sub23.aClass80_Sub1_Sub2_2 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_69, Class128.aClass667_3, Class262.aClass478_91);
			Class87_Sub1.aMap5 = Class404.method28523(new Class80_Sub1[] { Class416.aClass80_Sub1_Sub2_4, Class562.aClass80_Sub1_Sub1_2, Class539.aClass80_Sub1_Sub2_6, Class55.aClass80_Sub1_Sub2_1, Class308.aClass80_Sub1_Sub2_3, Class528.aClass80_Sub1_Sub2_5, Class77_Sub23.aClass80_Sub1_Sub2_2 });
			Class61.aClass35_Sub11_1 = new Class35_Sub11(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class87_Sub1.aMap5);
			Class310.anInterface17_4 = new Class332();
			Class75_Sub1.method1130(Class317.aClass478_94, Class173.aClass478_87, Class470.aClass478_125, Class145.aClass478_46);
			aClass411_1 = new Class411(Class406.aClass478_114);
			Class392.aClass398_1 = new Class398(Class675.aClass478_136);
			Class112.aClass405_3 = new Class405(Class675.aClass478_136);
			Class615.aClass465_1 = new Class465(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110);
			RuntimeException_Sub4.aClass41_2 = new Class41(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110, new Class408());
			Class55.aClass124_1 = new Class124(Class562.aClass80_Sub1_Sub1_2, Class61.aClass35_Sub11_1, Class544.aClass620_1.method32410());
			Class632.method32649();
			Class87_Sub1.method4258(Class96_Sub11.aClass35_Sub2_3);
			Class417.method28675(Class112.aClass405_3, Class392.aClass398_1);
			Class526.method30675(Class173.aClass478_87, Class147.aClass209_7, Class77.anInterface24_117);
			@Pc(1206) Class298 local1206 = new Class298(Class628.aClass478_135.method29778("huffman", ""));
			Class92.method23484(local1206);
			Class504.aClass125_2 = Class122_Sub1_Sub2.method18590();
			Class96_Sub23.aClass77_Sub28_1 = new Class77_Sub28(true);
		}
		if (Class80.aClass322_4 == Class322.aClass322_16) {
			local6 = Class630.method32602(Class470.aClass478_125) + Class367.aClass415_1.method28635(true);
			local285 = Class257.method26226() + Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_17) {
			Class136.method13895(Class688.aClass478_137, Class52.aClass478_9, Class555.aClass35_Sub17_3, Class65.aClass35_Sub13_1, client.aClass517_1.method30444(), Class251.aClass35_Sub10_3, Class118_Sub1.aClass35_Sub18_4, Class55.aClass124_1, Class55.aClass124_1);
		}
		if (Class322.aClass322_10 == Class80.aClass322_4) {
			Class56.aClass93_Sub1_1 = new Class93_Sub1(Class416.aClass80_Sub1_Sub2_4);
			Class416.method28671();
			Class638.aClass240_1 = Class77_Sub31.method13784();
			Class107_Sub1.aClass478_28.method29757(false, true);
			Class470.aClass478_125.method29757(true, true);
			Class145.aClass478_46.method29757(true, true);
			Class628.aClass478_135.method29757(true, true);
			client.aBoolean627 = true;
		}
		if (Class322.aClass322_19 == Class80.aClass322_4 && Class617.aClass629_1.anInt5666 * 143908383 != -1) {
			if (!Class211.method25607(Class617.aClass629_1.anInt5666 * 143908383, null)) {
				return 0;
			}
			local115 = true;
			for (local285 = 0; local285 < Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2.length; local285++) {
				@Pc(1338) Class277 local1338 = Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2[local285];
				if (local1338.anInt3857 * -1960530827 == 5 && local1338.anInt3954 * 2083357573 != -1 && !Class470.aClass478_125.method29727(local1338.anInt3954 * 2083357573, 0)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class322.aClass322_22 == Class80.aClass322_4) {
			Class149.method23150(true);
		}
		if (Class322.aClass322_6 == Class80.aClass322_4) {
			Class307.aClass327_1.method27570();
			try {
				aThread7.join();
			} catch (@Pc(1383) InterruptedException local1383) {
				return 0;
			}
			Class307.aClass327_1 = null;
			aThread7 = null;
			aClass478_109 = null;
			aClass478_108 = null;
			aClass66_1 = null;
			anInterface32Array1 = null;
			Class592.aMap21.remove(Class40.aClass40_29);
			Class592.aMap21.remove(Class40.aClass40_28);
			Class592.aMap21.remove(Class40.aClass40_30);
			Class108.method9021();
			client.aBoolean595 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 1;
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
			if (client.aBoolean595) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.aBoolean354 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 < 512 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 != 0) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			}
			Class667.method33150();
			if (client.aBoolean595) {
				Class533.method30776(0, false);
				if (!client.aBoolean590) {
					Class347.method27848(Class27.aClass27_10);
				}
			} else {
				Class533.method30776(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109(), false);
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() == 0) {
					Class347.method27848(Class27.aClass27_13);
				}
			}
			Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class600.method32037(Class284.aClass86_9, Class470.aClass478_125);
		}
		return Class552.method31013();
	}

	@OriginalMember(owner = "client!jz", name = "al", descriptor = "()I", line = 337)
	static int method27949() {
		@Pc(6) int local6;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 0) {
			for (local6 = 0; local6 < client.anInt3401 * 1779655715; local6++) {
				if (client.anInterface62Array1[local6].method14146() == 's' || client.anInterface62Array1[local6].method14146() == 'S') {
					Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
					client.aBoolean590 = true;
					Class347.method27848(Class27.aClass27_9);
					break;
				}
			}
		}
		if (Class322.aClass322_14 == Class80.aClass322_4) {
			if (Class528.aClass473_1 == null) {
				Class528.aClass473_1 = new Class473(Class7.aClass129_1, Class47.aClass470_1, Class643.aClass469_3, Class291.aBigInteger1, Class291.aBigInteger4);
			}
			if (!Class528.aClass473_1.method29638()) {
				return 0;
			}
			Class75.method1148(0, null, true);
			Class252.aBoolean655 = !Class102.method7916();
			aClass478_109 = Class473.method29653(Class252.aBoolean655 ? Class40.aClass40_30 : Class40.aClass40_28, false, 1, true);
			aClass478_108 = Class473.method29653(Class40.aClass40_29, false, 1, true);
			Class145.aClass478_46 = Class473.method29653(Class40.aClass40_11, false, 1, true);
			Class585.aClass478_131 = Class473.method29653(Class40.aClass40_40, true, 1, true);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class80.aClass322_4 == Class322.aClass322_12) {
			local115 = aClass478_108.method29737();
			@Pc(119) boolean local119 = Class585.aClass478_131.method29737();
			local127 = Class503.aClass126_Sub1Array2[Class40.aClass40_29.method677()].method11591();
			@Pc(143) int local143 = local127 + Class503.aClass126_Sub1Array2[Class252.aBoolean655 ? Class40.aClass40_30.method677() : Class40.aClass40_28.method677()].method11591();
			@Pc(153) int local153 = local143 + Class503.aClass126_Sub1Array2[Class40.aClass40_11.method677()].method11591();
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class585.aClass478_131.method29743());
			@Pc(173) int local173 = local163 + (local115 ? 100 : aClass478_108.method29743());
			if (local173 != 500) {
				return local173 / 5;
			}
			Class617.aClass629_1 = new Class629(Class585.aClass478_131);
			Class568.method31388(Class617.aClass629_1);
			@Pc(193) int local193 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub43_1.method16275();
			aClass66_1 = new Class66(client.aClass670_4, Class128.aClass667_3, aClass478_108);
			@Pc(205) Class72[] local205 = aClass66_1.method948(local193);
			if (local205.length == 0) {
				local205 = aClass66_1.method948(0);
			}
			@Pc(219) Class339 local219 = new Class339(aClass478_109, Class145.aClass478_46);
			if (local205.length > 0) {
				anInterface32Array1 = new Interface32[local205.length];
				for (@Pc(228) int local228 = 0; local228 < anInterface32Array1.length; local228++) {
					anInterface32Array1[local228] = new Class319(aClass66_1.method946(local205[local228].anInt206 * 1064408419), local205[local228].anInt205 * -2060664041, local205[local228].anInt204 * -336114669, local219);
				}
			}
		}
		if (Class322.aClass322_8 == Class80.aClass322_4) {
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, aClass478_109, Class145.aClass478_46, Class26.method461());
		}
		@Pc(285) int local285;
		if (Class322.aClass322_11 == Class80.aClass322_4) {
			local6 = Class367.aClass415_1.method28631();
			local285 = Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_9) {
			if (anInterface32Array1 != null && anInterface32Array1.length > 0) {
				if (anInterface32Array1[0].method27491() < 100) {
					return 0;
				}
				if (anInterface32Array1.length > 1 && aClass66_1.method950() && anInterface32Array1[1].method27491() < 100) {
					return 0;
				}
			}
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class668.method33179(11);
		}
		if (Class322.aClass322_5 == Class80.aClass322_4) {
			Class470.aClass478_125 = Class473.method29653(Class40.aClass40_24, false, 1, true);
			Class211.aClass478_89 = Class473.method29653(Class40.aClass40_13, false, 1, true);
			Class395.aClass478_111 = Class473.method29653(Class40.aClass40_2, false, 1, true);
			Class262.aClass478_91 = Class473.method29653(Class40.aClass40_3, false, 1, true);
			Class7.aClass478_2 = Class473.method29653(Class40.aClass40_41, false, 1, true);
			Class317.aClass478_94 = Class473.method29653(Class40.aClass40_4, false, 1, true);
			Class107_Sub1.aClass478_28 = Class473.method29653(Class40.aClass40_5, true, 1, true);
			Class173.aClass478_87 = Class473.method29653(Class40.aClass40_6, false, 1, true);
			Class4.aClass478_1 = Class473.method29653(Class40.aClass40_42, true, 1, true);
			Class514.aClass478_127 = Class473.method29653(Class40.aClass40_36, true, 1, true);
			Class628.aClass478_135 = Class473.method29653(Class40.aClass40_38, false, 1, true);
			Class322.aClass478_95 = Class473.method29653(Class40.aClass40_9, false, 1, true);
			Class146_Sub1.aClass478_48 = Class473.method29653(Class40.aClass40_10, true, 1, false);
			Class569.aClass478_130 = Class473.method29653(Class40.aClass40_32, true, 1, false);
			Class220.aClass478_90 = Class473.method29653(Class40.aClass40_12, false, 1, true);
			Class272.aClass478_92 = Class473.method29653(Class40.aClass40_17, false, 1, true);
			Class96_Sub5.aClass478_17 = Class473.method29653(Class40.aClass40_1, false, 1, true);
			Class151_Sub3_Sub1.aClass478_86 = Class473.method29653(Class40.aClass40_15, false, 1, true);
			Class115_Sub3.aClass478_83 = Class473.method29653(Class40.aClass40_16, false, 1, true);
			Class338.aClass478_97 = Class473.method29653(Class40.aClass40_27, false, 1, true);
			Class39.aClass478_42 = Class473.method29653(Class40.aClass40_25, false, 1, true);
			Class688.aClass478_137 = Class473.method29653(Class40.aClass40_19, true, 1, false);
			Class52.aClass478_9 = Class473.method29653(Class40.aClass40_33, true, 1, true);
			Class499.aClass478_126 = Class473.method29653(Class40.aClass40_20, false, 1, true);
			Class379.aClass478_110 = Class473.method29653(Class40.aClass40_21, false, 1, true);
			Class694.aClass478_138 = Class473.method29653(Class40.aClass40_22, true, 1, true);
			Class675.aClass478_136 = Class473.method29653(Class40.aClass40_23, false, 1, true);
			Class406.aClass478_114 = Class473.method29653(Class40.aClass40_31, false, 1, true);
			client.aClass478_88 = Class473.method29653(Class40.aClass40_35, true, 1, true);
			Class517.aClass478_128 = Class473.method29653(Class40.aClass40_26, true, 1, true);
			Class323.aClass478_96 = Class473.method29653(Class40.aClass40_43, true, 1, true);
		}
		if (Class322.aClass322_21 == Class80.aClass322_4) {
			local6 = 0;
			local285 = 0;
			for (local127 = 0; local127 < Class503.aClass126_Sub1Array2.length; local127++) {
				if (Class503.aClass126_Sub1Array2[local127] != null) {
					local6 += Class503.aClass126_Sub1Array2[local127].method11591();
					local285++;
				}
			}
			if (local285 > 0) {
				local6 /= local285;
			}
			if (local6 != 100) {
				if (anInt4497 * -1948226033 < 0) {
					anInt4497 = local6 * -399326993;
				}
				return (local6 - anInt4497 * -1948226033) * 100 / (100 - anInt4497 * -1948226033);
			}
			Class75_Sub1.method1129(Class617.aClass629_1);
			Class367.aClass415_1 = new Class415(Class284.aClass86_9, Class470.aClass478_125, Class145.aClass478_46, Class26.method461());
		}
		if (Class322.aClass322_18 == Class80.aClass322_4) {
			@Pc(671) byte[] local671 = Class585.aClass478_131.method29745(Class614.aClass614_3.anInt5587 * -448671533);
			if (local671 == null) {
				return 0;
			}
			Class94_Sub4.aClass261_1 = new Class261();
			Class94_Sub4.aClass261_1.method26273(50, 7340032);
			Class647.method32852(local671);
			Class668.method33179(4);
		}
		if (Class80.aClass322_4 == Class322.aClass322_13 && Class629.aClass541_1 == null) {
			Class629.aClass541_1 = new Class541(Class517.aClass478_128);
			Class144.method14992(Class629.aClass541_1);
		}
		if (Class322.aClass322_7 == Class80.aClass322_4) {
			local6 = Class62.method904();
			if (local6 < 100) {
				return local6;
			}
			Class326.method27533(Class585.aClass478_131.method29745(Class614.aClass614_1.anInt5587 * -448671533));
			Class628.aShortArrayArray5 = Class617.aClass629_1.aShortArrayArray6;
			Class101.aShortArrayArrayArray9 = Class617.aClass629_1.aShortArrayArrayArray11;
			Class580.aShortArrayArray4 = Class617.aClass629_1.aShortArrayArray7;
			Class479.aShortArrayArrayArray10 = Class617.aClass629_1.aShortArrayArrayArray12;
			if (Class617.aClass629_1.anInt5673 * 1576674457 != -1 && Class617.aClass629_1.anInt5680 * -1351281821 != -1) {
				client.anInt3394 = Class617.aClass629_1.anInt5673 * -1669149727;
				client.anInt3464 = Class617.aClass629_1.anInt5680 * -807589047;
			}
			Class636.aClass627_1 = new Class627(Class585.aClass478_131);
			Class544.aClass620_1 = new Class620(Class585.aClass478_131);
			Class695.aClass635_1 = new Class635(Class585.aClass478_131);
			Class96_Sub16.aClass625_1 = new Class625(Class585.aClass478_131);
			Class136.aClass619_2 = new Class619(Class585.aClass478_131);
		}
		if (Class80.aClass322_4 == Class322.aClass322_15) {
			if (Class617.aClass629_1.anInt5689 * -1085389923 != -1 && !Class173.aClass478_87.method29727(Class617.aClass629_1.anInt5689 * -1085389923, 0)) {
				return 99;
			}
			Class147.aClass209_7 = new Class209(Class694.aClass478_138);
			Class77.anInterface24_117 = new Class87_Sub1(Class4.aClass478_1, Class514.aClass478_127);
			Class77_Sub13_Sub12.aClass35_Sub22_1 = new Class35_Sub22(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub23.aClass35_Sub15_1 = new Class35_Sub15(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class648.aClass35_Sub5_1 = new Class35_Sub5(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class75_Sub1.aClass35_1 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_71, 64, new Class46(Class24.class));
			Class149.aClass35_10 = new Class35(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class647.aClass647_49, 16, new Class46(Class52.class));
			Class663.aClass35_Sub21_1 = new Class35_Sub21(client.aClass670_4, Class128.aClass667_3, Class272.aClass478_92);
			Class555.aClass35_Sub17_3 = new Class35_Sub17(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class65.aClass35_Sub13_1 = new Class35_Sub13(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class629.aClass35_Sub1_1 = new Class35_Sub1(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class476.aClass35_Sub16_1 = new Class35_Sub16(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class333.aClass35_Sub14_1 = new Class35_Sub14(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class173.aClass478_87);
			Class248.aClass35_Sub19_1 = new Class35_Sub19(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub10.aClass35_Sub20_1 = new Class35_Sub20(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class92_Sub1.aClass35_Sub12_13 = new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87);
			client.aClass517_1.method30461(Class92_Sub1.aClass35_Sub12_13);
			Class196.aClass514_1.method30346(new Class35_Sub12(client.aClass670_4, Class128.aClass667_3, true, Class220.aClass478_90, Class173.aClass478_87));
			Class251.aClass35_Sub10_3 = new Class35_Sub10(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class118_Sub1.aClass35_Sub18_4 = new Class35_Sub18(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class470.aClass478_125);
			Class578.aClass35_Sub3_1 = new Class35_Sub3(client.aClass670_4, Class128.aClass667_3, true, Class96_Sub5.aClass478_17, Class173.aClass478_87);
			Class537.aClass35_Sub7_1 = new Class35_Sub7(client.aClass670_4, Class128.aClass667_3, true, Class77_Sub13_Sub12.aClass35_Sub22_1, Class151_Sub3_Sub1.aClass478_86, Class173.aClass478_87);
			Class252.aClass42_Sub2_1 = new Class42_Sub2(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, true);
			Class358.aClass35_Sub8_1 = new Class35_Sub8(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class96_Sub11.aClass35_Sub2_3 = new Class35_Sub2(client.aClass670_4, Class128.aClass667_3, Class115_Sub3.aClass478_83, Class211.aClass478_89, Class395.aClass478_111, Class358.aClass35_Sub8_1);
			Class214.aClass35_Sub6_1 = new Class35_Sub6(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class497.aClass35_Sub9_1 = new Class35_Sub9(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91);
			Class482.aClass35_Sub4_1 = new Class35_Sub4(client.aClass670_4, Class128.aClass667_3, Class338.aClass478_97, Class173.aClass478_87);
			Class679.aClass42_Sub1_1 = new Class42_Sub1(client.aClass670_4, Class128.aClass667_3, Class39.aClass478_42, true);
			Class416.aClass80_Sub1_Sub2_4 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_64, Class128.aClass667_3, Class262.aClass478_91);
			Class562.aClass80_Sub1_Sub1_2 = new Class80_Sub1_Sub1(client.aClass670_4, Class127.aClass127_63, Class128.aClass667_3, Class262.aClass478_91);
			Class539.aClass80_Sub1_Sub2_6 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_68, Class128.aClass667_3, Class262.aClass478_91);
			Class55.aClass80_Sub1_Sub2_1 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_70, Class128.aClass667_3, Class262.aClass478_91);
			Class308.aClass80_Sub1_Sub2_3 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_71, Class128.aClass667_3, Class262.aClass478_91);
			Class528.aClass80_Sub1_Sub2_5 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_67, Class128.aClass667_3, Class262.aClass478_91);
			Class77_Sub23.aClass80_Sub1_Sub2_2 = new Class80_Sub1_Sub2(client.aClass670_4, Class127.aClass127_69, Class128.aClass667_3, Class262.aClass478_91);
			Class87_Sub1.aMap5 = Class404.method28523(new Class80_Sub1[] { Class416.aClass80_Sub1_Sub2_4, Class562.aClass80_Sub1_Sub1_2, Class539.aClass80_Sub1_Sub2_6, Class55.aClass80_Sub1_Sub2_1, Class308.aClass80_Sub1_Sub2_3, Class528.aClass80_Sub1_Sub2_5, Class77_Sub23.aClass80_Sub1_Sub2_2 });
			Class61.aClass35_Sub11_1 = new Class35_Sub11(client.aClass670_4, Class128.aClass667_3, Class262.aClass478_91, Class87_Sub1.aMap5);
			Class310.anInterface17_4 = new Class332();
			Class75_Sub1.method1130(Class317.aClass478_94, Class173.aClass478_87, Class470.aClass478_125, Class145.aClass478_46);
			aClass411_1 = new Class411(Class406.aClass478_114);
			Class392.aClass398_1 = new Class398(Class675.aClass478_136);
			Class112.aClass405_3 = new Class405(Class675.aClass478_136);
			Class615.aClass465_1 = new Class465(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110);
			RuntimeException_Sub4.aClass41_2 = new Class41(Class128.aClass667_3, Class499.aClass478_126, Class379.aClass478_110, new Class408());
			Class55.aClass124_1 = new Class124(Class562.aClass80_Sub1_Sub1_2, Class61.aClass35_Sub11_1, Class544.aClass620_1.method32410());
			Class632.method32649();
			Class87_Sub1.method4258(Class96_Sub11.aClass35_Sub2_3);
			Class417.method28675(Class112.aClass405_3, Class392.aClass398_1);
			Class526.method30675(Class173.aClass478_87, Class147.aClass209_7, Class77.anInterface24_117);
			@Pc(1206) Class298 local1206 = new Class298(Class628.aClass478_135.method29778("huffman", ""));
			Class92.method23484(local1206);
			Class504.aClass125_2 = Class122_Sub1_Sub2.method18590();
			Class96_Sub23.aClass77_Sub28_1 = new Class77_Sub28(true);
		}
		if (Class80.aClass322_4 == Class322.aClass322_16) {
			local6 = Class630.method32602(Class470.aClass478_125) + Class367.aClass415_1.method28635(true);
			local285 = Class257.method26226() + Class367.aClass415_1.method28637();
			if (local6 < local285) {
				return local6 * 100 / local285;
			}
		}
		if (Class80.aClass322_4 == Class322.aClass322_17) {
			Class136.method13895(Class688.aClass478_137, Class52.aClass478_9, Class555.aClass35_Sub17_3, Class65.aClass35_Sub13_1, client.aClass517_1.method30444(), Class251.aClass35_Sub10_3, Class118_Sub1.aClass35_Sub18_4, Class55.aClass124_1, Class55.aClass124_1);
		}
		if (Class322.aClass322_10 == Class80.aClass322_4) {
			Class56.aClass93_Sub1_1 = new Class93_Sub1(Class416.aClass80_Sub1_Sub2_4);
			Class416.method28671();
			Class638.aClass240_1 = Class77_Sub31.method13784();
			Class107_Sub1.aClass478_28.method29757(false, true);
			Class470.aClass478_125.method29757(true, true);
			Class145.aClass478_46.method29757(true, true);
			Class628.aClass478_135.method29757(true, true);
			client.aBoolean627 = true;
		}
		if (Class322.aClass322_19 == Class80.aClass322_4 && Class617.aClass629_1.anInt5666 * 143908383 != -1) {
			if (!Class211.method25607(Class617.aClass629_1.anInt5666 * 143908383, null)) {
				return 0;
			}
			local115 = true;
			for (local285 = 0; local285 < Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2.length; local285++) {
				@Pc(1338) Class277 local1338 = Class35_Sub11.aClass273Array1[Class617.aClass629_1.anInt5666 * 143908383].aClass277Array2[local285];
				if (local1338.anInt3857 * -1960530827 == 5 && local1338.anInt3954 * 2083357573 != -1 && !Class470.aClass478_125.method29727(local1338.anInt3954 * 2083357573, 0)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class322.aClass322_22 == Class80.aClass322_4) {
			Class149.method23150(true);
		}
		if (Class322.aClass322_6 == Class80.aClass322_4) {
			Class307.aClass327_1.method27570();
			try {
				aThread7.join();
			} catch (@Pc(1383) InterruptedException local1383) {
				return 0;
			}
			Class307.aClass327_1 = null;
			aThread7 = null;
			aClass478_109 = null;
			aClass478_108 = null;
			aClass66_1 = null;
			anInterface32Array1 = null;
			Class592.aMap21.remove(Class40.aClass40_29);
			Class592.aMap21.remove(Class40.aClass40_28);
			Class592.aMap21.remove(Class40.aClass40_30);
			Class108.method9021();
			client.aBoolean595 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1.method16227() == 1;
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub41_1, 1);
			if (client.aBoolean595) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			} else if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.aBoolean354 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 < 512 && Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 != 0) {
				Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			}
			Class667.method33150();
			if (client.aBoolean595) {
				Class533.method30776(0, false);
				if (!client.aBoolean590) {
					Class347.method27848(Class27.aClass27_10);
				}
			} else {
				Class533.method30776(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109(), false);
				if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109() == 0) {
					Class347.method27848(Class27.aClass27_13);
				}
			}
			Class196.method25463(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2.method15194(), -1, -1, false);
			Class367.aClass415_1.method28624(client.anInterface51_1);
			Class55.method830(Class284.aClass86_9);
			Class600.method32037(Class284.aClass86_9, Class470.aClass478_125);
		}
		return Class552.method31013();
	}

	@OriginalMember(owner = "client!jz", name = "ak", descriptor = "([B)V", line = 620)
	static void method27950(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22478();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				Class613.anInt5586 = local4.method22483() * -1285368653;
			} else if (local8 == 10) {
				local4.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!jz", name = "ao", descriptor = "([B)V", line = 620)
	static void method27951(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22478();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				Class613.anInt5586 = local4.method22483() * -1285368653;
			} else if (local8 == 10) {
				local4.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!jz", name = "au", descriptor = "()V", line = 642)
	static void method27952() {
		@Pc(6) Class28 local6 = Class145.method15079("2", client.aClass670_4.aString245, false);
		Class56.aClass93_Sub1_1.method6432(local6);
	}

	@OriginalMember(owner = "client!jz", name = "ar", descriptor = "()V", line = 647)
	public static void method27953() {
		if (Class307.aClass327_1 != null) {
			Class307.aClass327_1.method27570();
		}
		if (aThread7 == null) {
			return;
		}
		while (true) {
			try {
				aThread7.join();
				break;
			} catch (@Pc(11) InterruptedException local11) {
			}
		}
	}

	@OriginalMember(owner = "client!jz", name = "ax", descriptor = "()V", line = 647)
	public static void method27954() {
		if (Class307.aClass327_1 != null) {
			Class307.aClass327_1.method27570();
		}
		if (aThread7 == null) {
			return;
		}
		while (true) {
			try {
				aThread7.join();
				break;
			} catch (@Pc(11) InterruptedException local11) {
			}
		}
	}

	@OriginalMember(owner = "client!jz", name = "ag", descriptor = "(Lclient!yf;I)V", line = 4430)
	static final void method27955(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		if (arg0.anIntArray536[arg0.anInt5784 * 2088438307] < arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!jz", name = "azt", descriptor = "(Lclient!yf;I)V", line = 13742)
	static final void method27956(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local13).method26402(local23);
	}
}
