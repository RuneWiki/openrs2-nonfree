package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alj")
public class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!alj", name = "cp", descriptor = "I")
	public static int anInt1952;

	@OriginalMember(owner = "client!alj", name = "bv", descriptor = "I")
	static int anInt1954 = 0;

	@OriginalMember(owner = "client!alj", name = "br", descriptor = "I")
	static int anInt1945 = -53528545;

	@OriginalMember(owner = "client!alj", name = "bg", descriptor = "I")
	static int anInt1957 = -1360099010;

	@OriginalMember(owner = "client!alj", name = "ba", descriptor = "I")
	static int anInt1947 = 1725032216;

	@OriginalMember(owner = "client!alj", name = "bp", descriptor = "I")
	public static int anInt1948 = -599801319;

	@OriginalMember(owner = "client!alj", name = "bj", descriptor = "I")
	public static int anInt1949 = -847107946;

	@OriginalMember(owner = "client!alj", name = "bs", descriptor = "I")
	public static int anInt1950 = 0;

	@OriginalMember(owner = "client!alj", name = "ci", descriptor = "I")
	static int anInt1956 = -130712985;

	@OriginalMember(owner = "client!alj", name = "cn", descriptor = "I")
	static int anInt1951 = -919990023;

	@OriginalMember(owner = "client!alj", name = "cx", descriptor = "Z")
	static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!alj", name = "ct", descriptor = "I")
	static int anInt1953 = 322880463;

	@OriginalMember(owner = "client!alj", name = "cf", descriptor = "I")
	static int anInt1946 = 1150228155;

	@OriginalMember(owner = "client!alj", name = "co", descriptor = "Z")
	static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!alj", name = "cr", descriptor = "[[Lclient!eu;")
	static Class106[][] aClass106ArrayArray1 = new Class106[3][5];

	@OriginalMember(owner = "client!alj", name = "cm", descriptor = "[[Lclient!aac;")
	static Class5[][] aClass5ArrayArray1 = new Class5[3][5];

	@OriginalMember(owner = "client!alj", name = "cb", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap4 = new HashMap();

	@OriginalMember(owner = "client!alj", name = "cs", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap5 = new HashMap();

	@OriginalMember(owner = "client!alj", name = "cy", descriptor = "I")
	static int anInt1944 = anInt1948 * 1379158621;

	@OriginalMember(owner = "client!alj", name = "cc", descriptor = "I")
	static int anInt1955 = anInt1949 * 1208056059;

	@OriginalMember(owner = "client!alj", name = "cz", descriptor = "Z")
	static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!alj", name = "cj", descriptor = "Z")
	public static boolean aBoolean351 = false;

	@OriginalMember(owner = "client!alj", name = "cd", descriptor = "Lclient!aan;")
	public static Class16 aClass16_15 = new Class16(8);

	@OriginalMember(owner = "client!alj", name = "dd", descriptor = "Lclient!aan;")
	public static Class16 aClass16_16 = new Class16(8);

	@OriginalMember(owner = "client!alj", name = "dr", descriptor = "Lclient!aar;")
	static Class20 aClass20_1 = new Class20(new Class22());

	@OriginalMember(owner = "client!alj", name = "da", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!alj", name = "dt", descriptor = "Z")
	public static boolean aBoolean353 = false;

	@OriginalMember(owner = "client!alj", name = "do", descriptor = "Z")
	public static boolean aBoolean358 = false;

	@OriginalMember(owner = "client!alj", name = "dz", descriptor = "Z")
	static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!alj", name = "dv", descriptor = "Z")
	static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!alj", name = "dm", descriptor = "Z")
	static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!alj", name = "t", descriptor = "(II)V", line = 47)
	public static void method14675(@OriginalArg(0) int arg0) {
		Class321.anInt4098 = arg0 * -587198019;
		Class93_Sub23_Sub2.aClass93_Sub23_Sub2Array1 = new Class93_Sub23_Sub2[arg0];
		Class640.anInt5755 = 0;
	}

	@OriginalMember(owner = "client!alj", name = "<init>", descriptor = "()V", line = 84)
	Class159_Sub1() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!alj", name = "fm", descriptor = "(Lclient!dh;Lclient!df;)V", line = 89)
	static final void method14623(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class225 arg1) {
		if (anInt1950 * -1574654625 == 100 || aClass93_Sub1_Sub20_2 == null) {
			return;
		}
		Class305.method26796();
		Class305.method26796();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1950 * -1574654625 < 10) {
			for (local20 = 0; local20 < aClass106ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass106ArrayArray1[local20].length; local26++) {
					Class110_Sub7.aClass497_22.method30054(aClass637_2.anIntArrayArray66[local20][local26]);
					Class633.aClass497_137.method30054(aClass637_2.anIntArrayArray66[local20][local26]);
				}
			}
			if (!aClass497_54.method30051(aClass93_Sub1_Sub20_2.aString113)) {
				anInt1950 = Class710.aClass497_143.method30045(aClass93_Sub1_Sub20_2.aString113) / 10 * 1614212767;
				return;
			}
			anInt1950 = -1037741514;
		}
		if (anInt1950 * -1574654625 == 10) {
			anInt1915 = aClass93_Sub1_Sub20_2.anInt3166 * -332819059 >> 6 << 6;
			anInt1921 = aClass93_Sub1_Sub20_2.anInt3170 * 598304723 >> 6 << 6;
			anInt1923 = (aClass93_Sub1_Sub20_2.anInt3167 * -1863527503 >> 6 << 6) - anInt1915 + 64;
			anInt1922 = (aClass93_Sub1_Sub20_2.anInt3169 * -1436122155 >> 6 << 6) - anInt1921 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class472 local135 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
			@Pc(139) Class611 local139 = client.aClass532_1.method30443();
			if (aClass93_Sub1_Sub20_2.method23169(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local139.anInt5623 * 270611681 + ((int) local135.aFloat317 >> 9), ((int) local135.aFloat319 >> 9) + local139.anInt5624 * -1994307635, local127)) {
				local26 = local127[1] - anInt1915;
				local131 = local127[2] - anInt1921;
			}
			if (!aBoolean356 && local26 >= 0 && local26 < anInt1923 && local131 >= 0 && local131 < anInt1922) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class93_Sub14.anInt1527 = local26 * -1845499089;
				anInt1952 = local131 * 1415476369;
			} else if (anInt1953 * 982555857 == -1 || anInt1946 * -770621043 == -1) {
				aClass93_Sub1_Sub20_2.method23168(aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 >> 14 & 0x3FFF, aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 & 0x3FFF, local127);
				Class93_Sub14.anInt1527 = (local127[1] - anInt1915) * -1845499089;
				anInt1952 = (local127[2] - anInt1921) * 1415476369;
			} else {
				aClass93_Sub1_Sub20_2.method23168(anInt1953 * 982555857, anInt1946 * -770621043, local127);
				if (local127 != null) {
					Class93_Sub14.anInt1527 = (local127[1] - anInt1915) * -1845499089;
					anInt1952 = (local127[2] - anInt1921) * 1415476369;
				}
				anInt1946 = 1150228155;
				anInt1953 = 322880463;
				aBoolean356 = false;
			}
			if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 25) {
				aFloat152 = 2.0F;
				aFloat153 = 2.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 37) {
				aFloat152 = 3.0F;
				aFloat153 = 3.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 50) {
				aFloat152 = 4.0F;
				aFloat153 = 4.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 75) {
				aFloat152 = 6.0F;
				aFloat153 = 6.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 100) {
				aFloat152 = 8.0F;
				aFloat153 = 8.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 200) {
				aFloat152 = 16.0F;
				aFloat153 = 16.0F;
			} else {
				aFloat152 = 8.0F;
				aFloat153 = 8.0F;
			}
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
			Class358.method27780();
			method14616();
			Class93_Sub9.aClass22_20 = new Class22();
			anInt1917 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1917 < -8) {
				anInt1917 = -8;
			}
			if (anInt1917 > 8) {
				anInt1917 = 8;
			}
			anInt1918 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1918 < -16) {
				anInt1918 = -16;
			}
			if (anInt1918 > 16) {
				anInt1918 = 16;
			}
			method14511(arg1, anInt1917 >> 2 << 10, anInt1918 >> 1);
			aClass32_Sub2_2.method16652(1024, 256);
			aClass32_Sub20_2.method17465(256, 256);
			aClass32_Sub14_7.method17822(4096);
			Class30.aClass32_Sub16_1.method17822(256);
			anInt1950 = -2075483028;
		} else if (anInt1950 * -1574654625 == 20) {
			if (!aBoolean348) {
				Class481.method29753(true);
				method14539(arg0, anInt1917, anInt1918, aBoolean348);
				anInt1950 = -1931481788;
				Class481.method29753(true);
				Class238.method25800();
			} else if (method14539(arg0, anInt1917, anInt1918, aBoolean348)) {
				anInt1950 = -1931481788;
			}
		} else if (anInt1950 * -1574654625 == 60) {
			if (aClass497_54.method30069(aClass93_Sub1_Sub20_2.aString113)) {
				if (!aClass497_54.method30051(aClass93_Sub1_Sub20_2.aString113)) {
					return;
				}
				aClass584_2 = Class443.method28868(aClass497_54, aClass93_Sub1_Sub20_2.aString113, client.aBoolean620);
			} else {
				aClass584_2 = new Class584(0);
			}
			method14502();
			anInt1950 = 1325743994;
			Class481.method29753(true);
			Class238.method25800();
		} else if (anInt1950 * -1574654625 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1950 = -1787480548;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 5; local26++) {
					if (aClass106ArrayArray1[local20][local26] == null || aClass5ArrayArray1[local20][local26] == null) {
						aClass106ArrayArray1[local20][local26] = (Class106) Class157.aClass462_2.method29264(client.anInterface50_1, aClass637_2.anIntArrayArray66[local20][local26], true, true);
						aClass5ArrayArray1[local20][local26] = Class157.aClass462_2.method29241(client.anInterface50_1, aClass637_2.anIntArrayArray66[local20][local26]);
						if (aClass106ArrayArray1[local20][local26] == null || aClass5ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1950 += 547671005;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fs", descriptor = "(Lclient!dh;Lclient!df;)V", line = 89)
	static final void method14625(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class225 arg1) {
		if (anInt1950 * -1574654625 == 100 || aClass93_Sub1_Sub20_2 == null) {
			return;
		}
		Class305.method26796();
		Class305.method26796();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1950 * -1574654625 < 10) {
			for (local20 = 0; local20 < aClass106ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass106ArrayArray1[local20].length; local26++) {
					Class110_Sub7.aClass497_22.method30054(aClass637_2.anIntArrayArray66[local20][local26]);
					Class633.aClass497_137.method30054(aClass637_2.anIntArrayArray66[local20][local26]);
				}
			}
			if (!aClass497_54.method30051(aClass93_Sub1_Sub20_2.aString113)) {
				anInt1950 = Class710.aClass497_143.method30045(aClass93_Sub1_Sub20_2.aString113) / 10 * 1614212767;
				return;
			}
			anInt1950 = -1037741514;
		}
		if (anInt1950 * -1574654625 == 10) {
			anInt1915 = aClass93_Sub1_Sub20_2.anInt3166 * -332819059 >> 6 << 6;
			anInt1921 = aClass93_Sub1_Sub20_2.anInt3170 * 598304723 >> 6 << 6;
			anInt1923 = (aClass93_Sub1_Sub20_2.anInt3167 * -1863527503 >> 6 << 6) - anInt1915 + 64;
			anInt1922 = (aClass93_Sub1_Sub20_2.anInt3169 * -1436122155 >> 6 << 6) - anInt1921 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class472 local135 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
			@Pc(139) Class611 local139 = client.aClass532_1.method30443();
			if (aClass93_Sub1_Sub20_2.method23169(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local139.anInt5623 * 270611681 + ((int) local135.aFloat317 >> 9), ((int) local135.aFloat319 >> 9) + local139.anInt5624 * -1994307635, local127)) {
				local26 = local127[1] - anInt1915;
				local131 = local127[2] - anInt1921;
			}
			if (!aBoolean356 && local26 >= 0 && local26 < anInt1923 && local131 >= 0 && local131 < anInt1922) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class93_Sub14.anInt1527 = local26 * -1845499089;
				anInt1952 = local131 * 1415476369;
			} else if (anInt1953 * 982555857 == -1 || anInt1946 * -770621043 == -1) {
				aClass93_Sub1_Sub20_2.method23168(aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 >> 14 & 0x3FFF, aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 & 0x3FFF, local127);
				Class93_Sub14.anInt1527 = (local127[1] - anInt1915) * -1845499089;
				anInt1952 = (local127[2] - anInt1921) * 1415476369;
			} else {
				aClass93_Sub1_Sub20_2.method23168(anInt1953 * 982555857, anInt1946 * -770621043, local127);
				if (local127 != null) {
					Class93_Sub14.anInt1527 = (local127[1] - anInt1915) * -1845499089;
					anInt1952 = (local127[2] - anInt1921) * 1415476369;
				}
				anInt1946 = 1150228155;
				anInt1953 = 322880463;
				aBoolean356 = false;
			}
			if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 25) {
				aFloat152 = 2.0F;
				aFloat153 = 2.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 37) {
				aFloat152 = 3.0F;
				aFloat153 = 3.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 50) {
				aFloat152 = 4.0F;
				aFloat153 = 4.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 75) {
				aFloat152 = 6.0F;
				aFloat153 = 6.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 100) {
				aFloat152 = 8.0F;
				aFloat153 = 8.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 200) {
				aFloat152 = 16.0F;
				aFloat153 = 16.0F;
			} else {
				aFloat152 = 8.0F;
				aFloat153 = 8.0F;
			}
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
			Class358.method27780();
			method14616();
			Class93_Sub9.aClass22_20 = new Class22();
			anInt1917 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1917 < -8) {
				anInt1917 = -8;
			}
			if (anInt1917 > 8) {
				anInt1917 = 8;
			}
			anInt1918 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1918 < -16) {
				anInt1918 = -16;
			}
			if (anInt1918 > 16) {
				anInt1918 = 16;
			}
			method14511(arg1, anInt1917 >> 2 << 10, anInt1918 >> 1);
			aClass32_Sub2_2.method16652(1024, 256);
			aClass32_Sub20_2.method17465(256, 256);
			aClass32_Sub14_7.method17822(4096);
			Class30.aClass32_Sub16_1.method17822(256);
			anInt1950 = -2075483028;
		} else if (anInt1950 * -1574654625 == 20) {
			if (!aBoolean348) {
				Class481.method29753(true);
				method14539(arg0, anInt1917, anInt1918, aBoolean348);
				anInt1950 = -1931481788;
				Class481.method29753(true);
				Class238.method25800();
			} else if (method14539(arg0, anInt1917, anInt1918, aBoolean348)) {
				anInt1950 = -1931481788;
			}
		} else if (anInt1950 * -1574654625 == 60) {
			if (aClass497_54.method30069(aClass93_Sub1_Sub20_2.aString113)) {
				if (!aClass497_54.method30051(aClass93_Sub1_Sub20_2.aString113)) {
					return;
				}
				aClass584_2 = Class443.method28868(aClass497_54, aClass93_Sub1_Sub20_2.aString113, client.aBoolean620);
			} else {
				aClass584_2 = new Class584(0);
			}
			method14502();
			anInt1950 = 1325743994;
			Class481.method29753(true);
			Class238.method25800();
		} else if (anInt1950 * -1574654625 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1950 = -1787480548;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 5; local26++) {
					if (aClass106ArrayArray1[local20][local26] == null || aClass5ArrayArray1[local20][local26] == null) {
						aClass106ArrayArray1[local20][local26] = (Class106) Class157.aClass462_2.method29264(client.anInterface50_1, aClass637_2.anIntArrayArray66[local20][local26], true, true);
						aClass5ArrayArray1[local20][local26] = Class157.aClass462_2.method29241(client.anInterface50_1, aClass637_2.anIntArrayArray66[local20][local26]);
						if (aClass106ArrayArray1[local20][local26] == null || aClass5ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1950 += 547671005;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fu", descriptor = "(Lclient!dh;Lclient!df;)V", line = 89)
	static final void method14659(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class225 arg1) {
		if (anInt1950 * -1574654625 == 100 || aClass93_Sub1_Sub20_2 == null) {
			return;
		}
		Class305.method26796();
		Class305.method26796();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1950 * -1574654625 < 10) {
			for (local20 = 0; local20 < aClass106ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass106ArrayArray1[local20].length; local26++) {
					Class110_Sub7.aClass497_22.method30054(aClass637_2.anIntArrayArray66[local20][local26]);
					Class633.aClass497_137.method30054(aClass637_2.anIntArrayArray66[local20][local26]);
				}
			}
			if (!aClass497_54.method30051(aClass93_Sub1_Sub20_2.aString113)) {
				anInt1950 = Class710.aClass497_143.method30045(aClass93_Sub1_Sub20_2.aString113) / 10 * 1614212767;
				return;
			}
			anInt1950 = -1037741514;
		}
		if (anInt1950 * -1574654625 == 10) {
			anInt1915 = aClass93_Sub1_Sub20_2.anInt3166 * -332819059 >> 6 << 6;
			anInt1921 = aClass93_Sub1_Sub20_2.anInt3170 * 598304723 >> 6 << 6;
			anInt1923 = (aClass93_Sub1_Sub20_2.anInt3167 * -1863527503 >> 6 << 6) - anInt1915 + 64;
			anInt1922 = (aClass93_Sub1_Sub20_2.anInt3169 * -1436122155 >> 6 << 6) - anInt1921 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class472 local135 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
			@Pc(139) Class611 local139 = client.aClass532_1.method30443();
			if (aClass93_Sub1_Sub20_2.method23169(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local139.anInt5623 * 270611681 + ((int) local135.aFloat317 >> 9), ((int) local135.aFloat319 >> 9) + local139.anInt5624 * -1994307635, local127)) {
				local26 = local127[1] - anInt1915;
				local131 = local127[2] - anInt1921;
			}
			if (!aBoolean356 && local26 >= 0 && local26 < anInt1923 && local131 >= 0 && local131 < anInt1922) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class93_Sub14.anInt1527 = local26 * -1845499089;
				anInt1952 = local131 * 1415476369;
			} else if (anInt1953 * 982555857 == -1 || anInt1946 * -770621043 == -1) {
				aClass93_Sub1_Sub20_2.method23168(aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 >> 14 & 0x3FFF, aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 & 0x3FFF, local127);
				Class93_Sub14.anInt1527 = (local127[1] - anInt1915) * -1845499089;
				anInt1952 = (local127[2] - anInt1921) * 1415476369;
			} else {
				aClass93_Sub1_Sub20_2.method23168(anInt1953 * 982555857, anInt1946 * -770621043, local127);
				if (local127 != null) {
					Class93_Sub14.anInt1527 = (local127[1] - anInt1915) * -1845499089;
					anInt1952 = (local127[2] - anInt1921) * 1415476369;
				}
				anInt1946 = 1150228155;
				anInt1953 = 322880463;
				aBoolean356 = false;
			}
			if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 25) {
				aFloat152 = 2.0F;
				aFloat153 = 2.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 37) {
				aFloat152 = 3.0F;
				aFloat153 = 3.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 50) {
				aFloat152 = 4.0F;
				aFloat153 = 4.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 75) {
				aFloat152 = 6.0F;
				aFloat153 = 6.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 100) {
				aFloat152 = 8.0F;
				aFloat153 = 8.0F;
			} else if (aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 200) {
				aFloat152 = 16.0F;
				aFloat153 = 16.0F;
			} else {
				aFloat152 = 8.0F;
				aFloat153 = 8.0F;
			}
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
			Class358.method27780();
			method14616();
			Class93_Sub9.aClass22_20 = new Class22();
			anInt1917 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1917 < -8) {
				anInt1917 = -8;
			}
			if (anInt1917 > 8) {
				anInt1917 = 8;
			}
			anInt1918 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1918 < -16) {
				anInt1918 = -16;
			}
			if (anInt1918 > 16) {
				anInt1918 = 16;
			}
			method14511(arg1, anInt1917 >> 2 << 10, anInt1918 >> 1);
			aClass32_Sub2_2.method16652(1024, 256);
			aClass32_Sub20_2.method17465(256, 256);
			aClass32_Sub14_7.method17822(4096);
			Class30.aClass32_Sub16_1.method17822(256);
			anInt1950 = -2075483028;
		} else if (anInt1950 * -1574654625 == 20) {
			if (!aBoolean348) {
				Class481.method29753(true);
				method14539(arg0, anInt1917, anInt1918, aBoolean348);
				anInt1950 = -1931481788;
				Class481.method29753(true);
				Class238.method25800();
			} else if (method14539(arg0, anInt1917, anInt1918, aBoolean348)) {
				anInt1950 = -1931481788;
			}
		} else if (anInt1950 * -1574654625 == 60) {
			if (aClass497_54.method30069(aClass93_Sub1_Sub20_2.aString113)) {
				if (!aClass497_54.method30051(aClass93_Sub1_Sub20_2.aString113)) {
					return;
				}
				aClass584_2 = Class443.method28868(aClass497_54, aClass93_Sub1_Sub20_2.aString113, client.aBoolean620);
			} else {
				aClass584_2 = new Class584(0);
			}
			method14502();
			anInt1950 = 1325743994;
			Class481.method29753(true);
			Class238.method25800();
		} else if (anInt1950 * -1574654625 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1950 = -1787480548;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 5; local26++) {
					if (aClass106ArrayArray1[local20][local26] == null || aClass5ArrayArray1[local20][local26] == null) {
						aClass106ArrayArray1[local20][local26] = (Class106) Class157.aClass462_2.method29264(client.anInterface50_1, aClass637_2.anIntArrayArray66[local20][local26], true, true);
						aClass5ArrayArray1[local20][local26] = Class157.aClass462_2.method29241(client.anInterface50_1, aClass637_2.anIntArrayArray66[local20][local26]);
						if (aClass106ArrayArray1[local20][local26] == null || aClass5ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1950 += 547671005;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fj", descriptor = "()V", line = 232)
	static void method14626() {
		if (Class93_Sub14.anInt1527 * -1951188017 < 0) {
			Class93_Sub14.anInt1527 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (Class93_Sub14.anInt1527 * -1951188017 > anInt1923) {
			Class93_Sub14.anInt1527 = anInt1923 * -1845499089;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 < 0) {
			anInt1952 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 > anInt1922) {
			anInt1952 = anInt1922 * 1415476369;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
	}

	@OriginalMember(owner = "client!alj", name = "fd", descriptor = "()V", line = 232)
	static void method14627() {
		if (Class93_Sub14.anInt1527 * -1951188017 < 0) {
			Class93_Sub14.anInt1527 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (Class93_Sub14.anInt1527 * -1951188017 > anInt1923) {
			Class93_Sub14.anInt1527 = anInt1923 * -1845499089;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 < 0) {
			anInt1952 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 > anInt1922) {
			anInt1952 = anInt1922 * 1415476369;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
	}

	@OriginalMember(owner = "client!alj", name = "fn", descriptor = "()V", line = 232)
	static void method14628() {
		if (Class93_Sub14.anInt1527 * -1951188017 < 0) {
			Class93_Sub14.anInt1527 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (Class93_Sub14.anInt1527 * -1951188017 > anInt1923) {
			Class93_Sub14.anInt1527 = anInt1923 * -1845499089;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 < 0) {
			anInt1952 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 > anInt1922) {
			anInt1952 = anInt1922 * 1415476369;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
	}

	@OriginalMember(owner = "client!alj", name = "fz", descriptor = "()V", line = 232)
	static void method14636() {
		if (Class93_Sub14.anInt1527 * -1951188017 < 0) {
			Class93_Sub14.anInt1527 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (Class93_Sub14.anInt1527 * -1951188017 > anInt1923) {
			Class93_Sub14.anInt1527 = anInt1923 * -1845499089;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 < 0) {
			anInt1952 = 0;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
		if (anInt1952 * -1606693775 > anInt1922) {
			anInt1952 = anInt1922 * 1415476369;
			anInt1956 = -130712985;
			anInt1951 = -919990023;
		}
	}

	@OriginalMember(owner = "client!alj", name = "fi", descriptor = "()V", line = 255)
	static void method14667() {
		Class93_Sub9.aClass22_20 = null;
		anInt1950 = 0;
		anInt1916 = 0;
		Class378.aClass312_10 = null;
		method14505();
		aClass22_28.method406();
		aClass584_2 = null;
		aClass240_33.method25833();
		aClass240_34.method25833();
		Class604.aClass100_50 = null;
		anInt1956 = -130712985;
		anInt1951 = -919990023;
		if (aClass32_Sub2_2 != null) {
			aClass32_Sub2_2.method17807();
			aClass32_Sub2_2.method16652(128, 64);
		}
		if (aClass32_Sub20_2 != null) {
			aClass32_Sub20_2.method17465(64, 64);
		}
		if (aClass32_Sub14_7 != null) {
			aClass32_Sub14_7.method17822(256);
		}
		Class30.aClass32_Sub16_1.method17822(64);
	}

	@OriginalMember(owner = "client!alj", name = "ft", descriptor = "()V", line = 277)
	static void method14630() {
		@Pc(1) int local1 = -1;
		if (aClass93_Sub1_Sub20_2 != null) {
			local1 = aClass93_Sub1_Sub20_2.anInt3168 * 937363209;
		}
		Class47.method957();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass106ArrayArray1[local13][local18] = null;
				aClass5ArrayArray1[local13][local18] = null;
			}
		}
		aClass93_Sub1_Sub20_2 = null;
		if (local1 != -1) {
			Class267.method26248(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!alj", name = "fx", descriptor = "()V", line = 277)
	static void method14631() {
		@Pc(1) int local1 = -1;
		if (aClass93_Sub1_Sub20_2 != null) {
			local1 = aClass93_Sub1_Sub20_2.anInt3168 * 937363209;
		}
		Class47.method957();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass106ArrayArray1[local13][local18] = null;
				aClass5ArrayArray1[local13][local18] = null;
			}
		}
		aClass93_Sub1_Sub20_2 = null;
		if (local1 != -1) {
			Class267.method26248(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!alj", name = "fc", descriptor = "()V", line = 293)
	static void method14633() {
		Class47.method957();
		aClass93_Sub1_Sub20_2 = null;
		Class602.aClass93_Sub1_Sub20_4 = null;
		aClass16_15.method219();
		aClass16_16.method219();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass106ArrayArray1[local13][local18] = null;
				aClass5ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fv", descriptor = "()V", line = 293)
	static void method14634() {
		Class47.method957();
		aClass93_Sub1_Sub20_2 = null;
		Class602.aClass93_Sub1_Sub20_4 = null;
		aClass16_15.method219();
		aClass16_16.method219();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass106ArrayArray1[local13][local18] = null;
				aClass5ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fw", descriptor = "(Lclient!dh;IIII)V", line = 307)
	static void method14654(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20467(arg1, arg2, arg1 + arg3, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (anInt1950 * -1574654625 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg1 + arg3 / 2;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method20653(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method20478(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3427 * 182213747].getRGB(), 0);
			arg0.method20653(local22 - 150, local32 + 2, anInt1950 * -428996579, 30, client.aColorArray1[client.anInt3427 * 182213747].getRGB(), 0);
			Class118_Sub1.aClass106_3.method7526(Class74.aClass74_131.method1259(Class106.aClass717_8), local22, local32 + local16, client.aColorArray3[client.anInt3427 * 182213747].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class93_Sub14.anInt1527 * -1951188017 - (int) ((float) arg3 / aFloat152);
		local22 = anInt1952 * -1606693775 + (int) ((float) arg4 / aFloat152);
		local32 = Class93_Sub14.anInt1527 * -1951188017 + (int) ((float) arg3 / aFloat152);
		@Pc(133) int local133 = anInt1952 * -1606693775 - (int) ((float) arg4 / aFloat152);
		Class344.anInt4190 = (Class93_Sub14.anInt1527 * -1951188017 - (int) ((float) arg3 / aFloat152)) * -2111696771;
		Class657.anInt5811 = (-1606693775 * anInt1952 - (int) ((float) arg4 / aFloat152)) * -123898291;
		Class386.anInt4648 = (int) ((float) (arg3 * 2) / aFloat152) * 1242810649;
		Class138.anInt1383 = (int) ((float) (arg4 * 2) / aFloat152) * 1182553313;
		aClass240_35 = aClass240_33;
		method14617(anInt1915 + local103, local22 + anInt1921, anInt1915 + local32, local133 + anInt1921, arg1, arg2, arg1 + arg3, arg2 + 1 + arg4);
		method14520(arg0, !aBoolean350, !aBoolean349, client.aBoolean620, false);
		@Pc(219) Class22 local219 = method14599(arg0);
		Class169.method18343(arg0, local219, 0, 0);
		if (client.aBoolean599) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class82.aClass106_1.method7525("Fps: " + Class553.anInt3407 * 1249273355 + " (" + Class553.anInt3417 * -2066467757 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class82.aClass106_1.method7525("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		aClass240_33.method25832(5);
	}

	@OriginalMember(owner = "client!alj", name = "fa", descriptor = "(Lclient!dh;Lclient!aat;II)V", line = 347)
	static void method14647(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class93_Sub9.aClass22_20.method406();
		if (aBoolean351) {
			return;
		}
		for (@Pc(10) Class93_Sub29 local10 = (Class93_Sub29) arg1.method445(); local10 != null; local10 = (Class93_Sub29) arg1.method415()) {
			@Pc(21) Class322 local21 = (Class322) aClass32_Sub2_2.method18261(local10.anInt1603 * 1208139441);
			if (Class32_Sub11.method17037(local21)) {
				@Pc(34) boolean local34 = Class300.method26722(arg0, local10, local21, arg2, arg3);
				if (local34) {
					Class54.method14856(arg0, local10, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fp", descriptor = "(Lclient!dh;Lclient!aat;II)V", line = 347)
	static void method14657(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class93_Sub9.aClass22_20.method406();
		if (aBoolean351) {
			return;
		}
		for (@Pc(10) Class93_Sub29 local10 = (Class93_Sub29) arg1.method445(); local10 != null; local10 = (Class93_Sub29) arg1.method415()) {
			@Pc(21) Class322 local21 = (Class322) aClass32_Sub2_2.method18261(local10.anInt1603 * 1208139441);
			if (Class32_Sub11.method17037(local21)) {
				@Pc(34) boolean local34 = Class300.method26722(arg0, local10, local21, arg2, arg3);
				if (local34) {
					Class54.method14856(arg0, local10, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fq", descriptor = "(Lclient!dh;Lclient!aks;Lclient!hs;II)Z", line = 376)
	static boolean method14637(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub29 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (aBoolean347 && !client.aBoolean620 && !method14531(arg1.anInt1605 * 1012619213, arg1.anInt1608 * -2087611449)) {
			return false;
		}
		if (arg2.anIntArray398 != null) {
			arg2 = arg2.method27252(anInterface21_2, anInterface23_2);
			if (arg2 == null) {
				return false;
			}
		}
		@Pc(30) int local30 = Integer.MAX_VALUE;
		@Pc(32) int local32 = Integer.MIN_VALUE;
		@Pc(34) int local34 = Integer.MAX_VALUE;
		@Pc(36) int local36 = Integer.MIN_VALUE;
		if (arg2.anIntArray399 != null) {
			local30 = (arg2.anInt4104 * -975351719 + arg1.anInt1605 * 1012619213 - anInt1937) * (anInt1941 - anInt1919) / (anInt1939 - anInt1937) + anInt1919;
			local32 = (anInt1941 - anInt1919) * (arg2.anInt4122 * 141650771 + arg1.anInt1605 * 1012619213 - anInt1937) / (anInt1939 - anInt1937) + anInt1919;
			local36 = anInt1942 - (arg1.anInt1608 * -2087611449 + arg2.anInt4121 * -1564254457 - anInt1940) * (anInt1942 - anInt1934) / (anInt1938 - anInt1940);
			local34 = anInt1942 - (arg1.anInt1608 * -2087611449 + arg2.anInt4123 * 226143903 - anInt1940) * (anInt1942 - anInt1934) / (anInt1938 - anInt1940);
		}
		@Pc(130) Class100 local130 = null;
		@Pc(132) int local132 = 0;
		@Pc(134) int local134 = 0;
		@Pc(136) int local136 = 0;
		@Pc(138) int local138 = 0;
		if (arg2.anInt4126 * -498063801 != -1) {
			if (arg1.aBoolean340 && arg2.anInt4129 * 2059687735 != -1) {
				local130 = arg2.method27253(arg0, true);
			} else {
				local130 = arg2.method27253(arg0, false);
			}
			if (local130 != null) {
				switch(arg2.aClass319_4.anInt4097 * -964115205) {
					case 0:
						local132 = arg1.anInt1606 * 704671089 - local130.method18160();
						local134 = arg1.anInt1606 * 704671089;
						break;
					case 1:
						local132 = arg1.anInt1606 * 704671089;
						local134 = arg1.anInt1606 * 704671089 + local130.method18160();
						break;
					case 2:
						local132 = arg1.anInt1606 * 704671089 - (local130.method18160() + 1 >> 1);
						local134 = arg1.anInt1606 * 704671089 + (local130.method18160() + 1 >> 1);
				}
				switch(arg2.aClass328_1.anInt4144 * 781808927) {
					case 0:
						local136 = arg1.anInt1607 * 1844815193 - local130.method18166();
						local138 = arg1.anInt1607 * 1844815193;
						break;
					case 1:
						local136 = arg1.anInt1607 * 1844815193;
						local138 = arg1.anInt1607 * 1844815193 + local130.method18166();
						break;
					case 2:
						local136 = arg1.anInt1607 * 1844815193 - (local130.method18166() + 1 >> 1);
						local138 = arg1.anInt1607 * 1844815193 + (local130.method18166() + 1 >> 1);
				}
				if (local132 < local30) {
					local30 = local132;
				}
				if (local134 > local32) {
					local32 = local134;
				}
				if (local136 < local34) {
					local34 = local136;
				}
				if (local138 > local36) {
					local36 = local138;
				}
			}
		}
		@Pc(306) Class100 local306 = null;
		if (arg2.anInt4112 * -2050445699 != -1) {
			local306 = arg2.method27254(arg0);
		}
		@Pc(319) int local319 = 0;
		@Pc(321) int local321 = 0;
		@Pc(323) int local323 = 0;
		@Pc(325) int local325 = 0;
		@Pc(327) int local327 = 0;
		@Pc(329) int local329 = 0;
		@Pc(331) int local331 = 0;
		@Pc(333) int local333 = 0;
		if (arg2.aString174 != null) {
			Class254.method26001(arg2.anInt4116 * 1579741579);
			if (Class171.aClass106_9 != null) {
				local333 = Class129_Sub2.aClass5_13.method49(arg2.aString174, Class553.anInt3408 * -1378711501, 0, null);
				local323 = Class129_Sub2.aClass5_13.method55(arg2.aString174, Class553.anInt3408 * -1378711501, null);
				local319 = arg1.anInt1606 * 704671089 - local323 / 2 + (anInt1941 - anInt1919) * arg2.anInt4131 * 2089237947 / (anInt1939 - anInt1937);
				local321 = arg1.anInt1607 * 1844815193 - arg2.anInt4120 * -876461677 * (anInt1942 - anInt1934) / (anInt1938 - anInt1940);
				if (local130 == null) {
					local321 -= local333 / 2;
				} else {
					local321 -= (local130.method18166() >> 1) + local333;
				}
				local325 = local319 + arg3;
				if (local325 < local30) {
					local30 = local325;
				}
				local327 = local323 + local319 + arg3;
				if (local327 > local32) {
					local32 = local327;
				}
				local329 = arg4 + local321;
				if (local329 < local34) {
					local34 = local329;
				}
				local331 = local333 + local321 + arg4;
				if (local331 > local36) {
					local36 = local331;
				}
			}
		}
		if (local32 < anInt1919 || local30 > anInt1941 || local36 < anInt1934 || local34 > anInt1942) {
			return true;
		}
		method14530(arg0, arg1, arg2);
		if (local130 != null) {
			@Pc(489) int local489 = 0;
			@Pc(491) int local491 = 0;
			@Pc(493) int local493 = 0;
			@Pc(495) int local495 = 0;
			@Pc(497) int local497 = 0;
			@Pc(499) int local499 = 0;
			switch(arg2.aClass319_4.anInt4097 * -964115205) {
				case 0:
					local489 = local130.method18189();
					local491 = (local130.method18189() + 1) / 2;
					local493 = local130.method18160();
					break;
				case 1:
					local491 = -(local130.method18189() + 1) / 2;
					break;
				case 2:
					local489 = local130.method18189() / 2;
					local493 = local130.method18160() >> 1;
			}
			switch(arg2.aClass328_1.anInt4144 * 781808927) {
				case 0:
					local495 = local130.method18189();
					local497 = (local130.method18189() + 1) / 2;
					local499 = local130.method18166();
					break;
				case 1:
					local497 = -(local130.method18189() + 1) / 2;
					break;
				case 2:
					local495 = local130.method18189() / 2;
					local499 = local130.method18166() >> 1;
			}
			@Pc(586) Class355 local586 = (Class355) aHashMap4.get(arg1.anInt1603 * 1208139441);
			if (local586 == null) {
				local586 = (Class355) aHashMap5.get(arg2.anInt4105 * 880251661);
			}
			@Pc(629) int local629;
			@Pc(645) int local645;
			if (local586 != null && arg2.anInt4112 * -2050445699 == -1) {
				if (local586.anInt4217 * 1950348827 > anInt1955 * 1548012049 / 2) {
					local629 = (anInt1955 * -393918737 - local586.anInt4217 * -877255451) / (anInt1955 * 1548012049);
				} else {
					local629 = local586.anInt4217 * -877255451 / (anInt1955 * 1548012049);
				}
				local645 = local629 << 24 | 0xFFFF00;
				if (arg0 instanceof Class104_Sub2) {
					arg0.method20600(arg1.anInt1606 * 704671089 - local489 - 7, arg1.anInt1607 * 1844815193 - local495 - 7, local130.method18189() + 14, local130.method18189() + 14, local645);
					arg0.method20600(arg1.anInt1606 * 704671089 - local489 - 5, arg1.anInt1607 * 1844815193 - local495 - 5, local130.method18189() + 10, local130.method18189() + 10, local645);
					arg0.method20600(arg1.anInt1606 * 704671089 - local489 - 3, arg1.anInt1607 * 1844815193 - local495 - 3, local130.method18189() + 6, local130.method18189() + 6, local645);
					arg0.method20600(arg1.anInt1606 * 704671089 - local489 - 1, arg1.anInt1607 * 1844815193 - local495 - 1, local130.method18189() + 2, local130.method18189() + 2, local645);
					arg0.method20600(arg1.anInt1606 * 704671089 - local489, arg1.anInt1607 * 1844815193 - local495, local130.method18189(), local130.method18189(), local645);
				} else {
					arg0.method20474(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497, local130.method18189() / 2 + 7, local645);
					arg0.method20474(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18189() / 2 + 5, local645);
					arg0.method20474(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18189() / 2 + 3, local645);
					arg0.method20474(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18189() / 2 + 1, local645);
					arg0.method20474(arg1.anInt1606 * 704671089 - local491, arg1.anInt1607 * 1844815193 - local497 - local497 == 0 ? 0 : 1, local130.method18189() / 2, local645);
				}
			}
			local130.method18169(arg1.anInt1606 * 704671089 - local493, arg1.anInt1607 * 1844815193 - local499);
			local629 = 0;
			local645 = 0;
			if (local586 != null && local306 != null) {
				switch(arg2.aClass319_4.anInt4097 * -964115205) {
					case 0:
					default:
						break;
					case 1:
						local629 = local306.method18160();
						break;
					case 2:
						local629 = local306.method18160() >> 1;
				}
				switch(arg2.aClass328_1.anInt4144 * 781808927) {
					case 0:
						local645 = (local306.method18166() + local130.method18166()) / 2;
					case 1:
					default:
						break;
					case 2:
						local645 = (local306.method18166() / 2 + local130.method18166()) / 2;
				}
				@Pc(1003) int local1003;
				if (local586.anInt4217 * 1950348827 > anInt1955 * 1548012049 / 2) {
					local1003 = (anInt1955 * -393918737 - local586.anInt4217 * -877255451) / (anInt1955 * 1548012049);
				} else {
					local1003 = local586.anInt4217 * -877255451 / (anInt1955 * 1548012049);
				}
				@Pc(1019) int local1019 = local1003 << 24 | 0xFFFF00;
				local306.method18173(arg1.anInt1606 * 704671089 - local629, arg1.anInt1607 * 1844815193 - local645, 0, local1019, 1);
			}
		}
		if (arg2.aString174 != null && Class171.aClass106_9 != null) {
			Class314.method26941(arg0, arg1, arg2, local319, local321, local333, local323);
		}
		if (-498063801 * arg2.anInt4126 != -1 || arg2.aString174 != null) {
			@Pc(1065) Class93_Sub9 local1065 = new Class93_Sub9(arg1);
			local1065.anInt1488 = local132 * 1074208877;
			local1065.anInt1486 = local134 * 1065675971;
			local1065.anInt1483 = local136 * 315868373;
			local1065.anInt1485 = local138 * 1073762263;
			local1065.anInt1481 = local325 * 519191853;
			local1065.anInt1484 = local327 * -1010491119;
			local1065.anInt1487 = local329 * 92623553;
			local1065.anInt1482 = local331 * 669031469;
			Class93_Sub9.aClass22_20.method407(local1065);
		}
		return false;
	}

	@OriginalMember(owner = "client!alj", name = "ff", descriptor = "(Lclient!dh;Lclient!aks;Lclient!hs;)V", line = 572)
	static void method14638(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub29 arg1, @OriginalArg(2) Class322 arg2) {
		@Pc(4) Class100 local4 = arg2.method27255(arg0);
		if (local4 == null) {
			return;
		}
		@Pc(10) int local10 = local4.method18189();
		if (local4.method18165() > local10) {
			local10 = local4.method18165();
		}
		@Pc(19) byte local19 = 10;
		@Pc(24) int local24 = arg1.anInt1606 * 704671089;
		@Pc(29) int local29 = arg1.anInt1607 * 1844815193;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		if (arg2.aString174 != null) {
			local33 = Class129_Sub2.aClass5_13.method49(arg2.aString174, Class553.anInt3408 * -1378711501, 0, null);
			local31 = Class129_Sub2.aClass5_13.method55(arg2.aString174, Class553.anInt3408 * -1378711501, null);
		}
		@Pc(66) int local66 = arg1.anInt1606 * 704671089 + local10 / 2;
		@Pc(71) int local71 = arg1.anInt1607 * 1844815193;
		if (local24 < local10 + anInt1919) {
			local24 = anInt1919;
			local66 = local31 / 2 + 5 + local19 + local10 / 2 + anInt1919;
		} else if (local24 > anInt1941 - local10) {
			local24 = anInt1941 - local10;
			local66 = anInt1941 - local10 / 2 - local19 - local31 / 2 - 5;
		}
		if (local29 < local10 + anInt1934) {
			local29 = anInt1934;
			local71 = local10 / 2 + anInt1934 + local19;
		} else if (local29 > anInt1942 - local10) {
			local29 = anInt1942 - local10;
			local71 = anInt1942 - local10 / 2 - local19 - local33;
		}
		@Pc(174) int local174 = (int) (Math.atan2((double) (local24 - arg1.anInt1606 * 704671089), (double) (local29 - arg1.anInt1607 * 1844815193)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local4.method18181((float) local24 + (float) local10 / 2.0F, (float) local29 + (float) local10 / 2.0F, 4096, local174);
		@Pc(194) int local194 = -2;
		@Pc(196) int local196 = -2;
		@Pc(198) int local198 = -2;
		@Pc(200) int local200 = -2;
		if (arg2.aString174 != null) {
			local194 = local66 - local31 / 2 - 5;
			local196 = local71;
			local198 = local194 + 10 + local31;
			local200 = local33 + local71 + 3;
			if (arg2.anInt4108 * -664150941 != 0) {
				arg0.method20600(local194, local71, local198 - local194, local200 - local71, arg2.anInt4108 * -664150941);
			}
			if (arg2.anInt4109 * 989664399 != 0) {
				arg0.method20472(local194, local71, local198 - local194, local200 - local71, arg2.anInt4109 * 989664399);
			}
			Class171.aClass106_9.method7563(arg2.aString174, local66, local71, local31, local33, arg2.anInt4099 * 2016508123 | 0xFF000000, aClass637_2.anInt5738 * 2079115473, 1, 0, 0, null, null, null, 0, 0);
		}
		if (arg2.anInt4126 * -498063801 == -1 && arg2.aString174 == null) {
			return;
		}
		@Pc(309) Class93_Sub9 local309 = new Class93_Sub9(arg1);
		local309.anInt1488 = (local24 - local10 / 2) * 1074208877;
		local309.anInt1486 = (local10 / 2 + local24) * 1065675971;
		local309.anInt1483 = (local29 - local10) * 315868373;
		local309.anInt1485 = local29 * 1073762263;
		local309.anInt1481 = local194 * 519191853;
		local309.anInt1484 = local198 * -1010491119;
		local309.anInt1487 = local196 * 92623553;
		local309.anInt1482 = local200 * 669031469;
		Class93_Sub9.aClass22_20.method407(local309);
	}

	@OriginalMember(owner = "client!alj", name = "fl", descriptor = "(Lclient!dh;Lclient!aks;Lclient!hs;IIII)V", line = 654)
	static void method14639(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub29 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg3 - 5;
		@Pc(7) int local7 = arg4 + 2;
		if (arg2.anInt4108 * -664150941 != 0) {
			arg0.method20600(local3, local7, arg6 + 10, arg5 + arg4 - local7 + 1, arg2.anInt4108 * -664150941);
		}
		if (arg2.anInt4109 * 989664399 != 0) {
			arg0.method20472(local3, local7, arg6 + 10, arg4 + arg5 - local7 + 1, arg2.anInt4109 * 989664399);
		}
		@Pc(61) int local61 = arg2.anInt4099 * 2016508123;
		if (arg1.aBoolean340 && arg2.anInt4103 * -283861829 != -1) {
			local61 = arg2.anInt4103 * -283861829;
		}
		Class171.aClass106_9.method7563(arg2.aString174, arg3, arg4, arg6, arg5, local61 | 0xFF000000, aClass637_2.anInt5738 * 2079115473, 1, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!alj", name = "fb", descriptor = "(Lclient!dh;Lclient!aks;Lclient!hs;IIII)V", line = 654)
	static void method14640(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub29 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg3 - 5;
		@Pc(7) int local7 = arg4 + 2;
		if (arg2.anInt4108 * -664150941 != 0) {
			arg0.method20600(local3, local7, arg6 + 10, arg5 + arg4 - local7 + 1, arg2.anInt4108 * -664150941);
		}
		if (arg2.anInt4109 * 989664399 != 0) {
			arg0.method20472(local3, local7, arg6 + 10, arg4 + arg5 - local7 + 1, arg2.anInt4109 * 989664399);
		}
		@Pc(61) int local61 = arg2.anInt4099 * 2016508123;
		if (arg1.aBoolean340 && arg2.anInt4103 * -283861829 != -1) {
			local61 = arg2.anInt4103 * -283861829;
		}
		Class171.aClass106_9.method7563(arg2.aString174, arg3, arg4, arg6, arg5, local61 | 0xFF000000, aClass637_2.anInt5738 * 2079115473, 1, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!alj", name = "fo", descriptor = "(II)V", line = 708)
	static final void method14635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat152 < aFloat153) {
			aFloat152 = (float) ((double) aFloat152 + (double) aFloat152 / 30.0D);
			if (aFloat152 > aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		} else if (aFloat152 > aFloat153) {
			aFloat152 = (float) ((double) aFloat152 - (double) aFloat152 / 30.0D);
			if (aFloat152 < aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		}
		if (anInt1956 * 2025914025 != -1 && anInt1951 * 38948535 != -1) {
			@Pc(78) int local78 = anInt1956 * 2025914025 - Class93_Sub14.anInt1527 * -1951188017;
			if (local78 != 0) {
				local78 /= Math.min(anInt1947 * -932386613, Math.abs(local78));
			}
			@Pc(97) int local97 = anInt1951 * 38948535 - anInt1952 * -1606693775;
			if (local97 != 0) {
				local97 /= Math.min(anInt1947 * -932386613, Math.abs(local97));
			}
			Class93_Sub14.anInt1527 = (local78 + -1951188017 * Class93_Sub14.anInt1527) * -1845499089;
			anInt1952 = (anInt1952 * -1606693775 + local97) * 1415476369;
			if (local78 == 0 && local97 == 0) {
				anInt1956 = -130712985;
				anInt1951 = -919990023;
			}
			Class358.method27780();
		}
		@Pc(140) Iterator local140 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(149) Class355 local149;
				do {
					if (!local140.hasNext()) {
						local140 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local140.hasNext()) {
										if (aBoolean352 && Class93_Sub9.aClass22_20 != null) {
											for (@Pc(240) Class93_Sub9 local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method445(); local240 != null; local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method415()) {
												@Pc(252) Class322 local252 = (Class322) aClass32_Sub2_2.method18261(local240.aClass93_Sub29_1.anInt1603 * 1208139441);
												if (local240.method13152(arg0, arg1)) {
													if (local252.aStringArray24 != null) {
														if (local252.aStringArray24[4] != null) {
															Class280.method26458(local252.aStringArray24[4], local252.aString175, -1, 1012, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[3] != null) {
															Class280.method26458(local252.aStringArray24[3], local252.aString175, -1, 1011, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[2] != null) {
															Class280.method26458(local252.aStringArray24[2], local252.aString175, -1, 1010, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[1] != null) {
															Class280.method26458(local252.aStringArray24[1], local252.aString175, -1, 1009, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[0] != null) {
															Class280.method26458(local252.aStringArray24[0], local252.aString175, -1, 1008, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
													}
													if (!local240.aClass93_Sub29_1.aBoolean340) {
														local240.aClass93_Sub29_1.aBoolean340 = true;
														Class165.method15320(Class155.aClass155_62, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
													if (local240.aClass93_Sub29_1.aBoolean340) {
														Class165.method15320(Class155.aClass155_54, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
												} else if (local240.aClass93_Sub29_1.aBoolean340) {
													local240.aClass93_Sub29_1.aBoolean340 = false;
													Class165.method15320(Class155.aClass155_53, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
												}
											}
										}
										return;
									}
									local149 = (Class355) ((Entry) local140.next()).getValue();
									local149.anInt4217 -= -1862405101;
								} while (local149.anInt4217 * 1950348827 != 0);
								if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
									local149.anInt4218 -= -1712890239;
									local149.anInt4217 = anInt1955 * -1400884413;
								} else {
									local140.remove();
								}
							}
						}
					}
					local149 = (Class355) ((Entry) local140.next()).getValue();
					local149.anInt4217 -= -1862405101;
				} while (local149.anInt4217 * 1950348827 != 0);
				if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
					local149.anInt4218 -= -1712890239;
					local149.anInt4217 = anInt1955 * -1400884413;
				} else {
					local140.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fy", descriptor = "(II)V", line = 708)
	static final void method14642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat152 < aFloat153) {
			aFloat152 = (float) ((double) aFloat152 + (double) aFloat152 / 30.0D);
			if (aFloat152 > aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		} else if (aFloat152 > aFloat153) {
			aFloat152 = (float) ((double) aFloat152 - (double) aFloat152 / 30.0D);
			if (aFloat152 < aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		}
		if (anInt1956 * 2025914025 != -1 && anInt1951 * 38948535 != -1) {
			@Pc(78) int local78 = anInt1956 * 2025914025 - Class93_Sub14.anInt1527 * -1951188017;
			if (local78 != 0) {
				local78 /= Math.min(anInt1947 * -932386613, Math.abs(local78));
			}
			@Pc(97) int local97 = anInt1951 * 38948535 - anInt1952 * -1606693775;
			if (local97 != 0) {
				local97 /= Math.min(anInt1947 * -932386613, Math.abs(local97));
			}
			Class93_Sub14.anInt1527 = (local78 + -1951188017 * Class93_Sub14.anInt1527) * -1845499089;
			anInt1952 = (anInt1952 * -1606693775 + local97) * 1415476369;
			if (local78 == 0 && local97 == 0) {
				anInt1956 = -130712985;
				anInt1951 = -919990023;
			}
			Class358.method27780();
		}
		@Pc(140) Iterator local140 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(149) Class355 local149;
				do {
					if (!local140.hasNext()) {
						local140 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local140.hasNext()) {
										if (aBoolean352 && Class93_Sub9.aClass22_20 != null) {
											for (@Pc(240) Class93_Sub9 local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method445(); local240 != null; local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method415()) {
												@Pc(252) Class322 local252 = (Class322) aClass32_Sub2_2.method18261(local240.aClass93_Sub29_1.anInt1603 * 1208139441);
												if (local240.method13152(arg0, arg1)) {
													if (local252.aStringArray24 != null) {
														if (local252.aStringArray24[4] != null) {
															Class280.method26458(local252.aStringArray24[4], local252.aString175, -1, 1012, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[3] != null) {
															Class280.method26458(local252.aStringArray24[3], local252.aString175, -1, 1011, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[2] != null) {
															Class280.method26458(local252.aStringArray24[2], local252.aString175, -1, 1010, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[1] != null) {
															Class280.method26458(local252.aStringArray24[1], local252.aString175, -1, 1009, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[0] != null) {
															Class280.method26458(local252.aStringArray24[0], local252.aString175, -1, 1008, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
													}
													if (!local240.aClass93_Sub29_1.aBoolean340) {
														local240.aClass93_Sub29_1.aBoolean340 = true;
														Class165.method15320(Class155.aClass155_62, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
													if (local240.aClass93_Sub29_1.aBoolean340) {
														Class165.method15320(Class155.aClass155_54, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
												} else if (local240.aClass93_Sub29_1.aBoolean340) {
													local240.aClass93_Sub29_1.aBoolean340 = false;
													Class165.method15320(Class155.aClass155_53, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
												}
											}
										}
										return;
									}
									local149 = (Class355) ((Entry) local140.next()).getValue();
									local149.anInt4217 -= -1862405101;
								} while (local149.anInt4217 * 1950348827 != 0);
								if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
									local149.anInt4218 -= -1712890239;
									local149.anInt4217 = anInt1955 * -1400884413;
								} else {
									local140.remove();
								}
							}
						}
					}
					local149 = (Class355) ((Entry) local140.next()).getValue();
					local149.anInt4217 -= -1862405101;
				} while (local149.anInt4217 * 1950348827 != 0);
				if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
					local149.anInt4218 -= -1712890239;
					local149.anInt4217 = anInt1955 * -1400884413;
				} else {
					local140.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fe", descriptor = "(II)V", line = 708)
	static final void method14648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat152 < aFloat153) {
			aFloat152 = (float) ((double) aFloat152 + (double) aFloat152 / 30.0D);
			if (aFloat152 > aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		} else if (aFloat152 > aFloat153) {
			aFloat152 = (float) ((double) aFloat152 - (double) aFloat152 / 30.0D);
			if (aFloat152 < aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		}
		if (anInt1956 * 2025914025 != -1 && anInt1951 * 38948535 != -1) {
			@Pc(78) int local78 = anInt1956 * 2025914025 - Class93_Sub14.anInt1527 * -1951188017;
			if (local78 != 0) {
				local78 /= Math.min(anInt1947 * -932386613, Math.abs(local78));
			}
			@Pc(97) int local97 = anInt1951 * 38948535 - anInt1952 * -1606693775;
			if (local97 != 0) {
				local97 /= Math.min(anInt1947 * -932386613, Math.abs(local97));
			}
			Class93_Sub14.anInt1527 = (local78 + -1951188017 * Class93_Sub14.anInt1527) * -1845499089;
			anInt1952 = (anInt1952 * -1606693775 + local97) * 1415476369;
			if (local78 == 0 && local97 == 0) {
				anInt1956 = -130712985;
				anInt1951 = -919990023;
			}
			Class358.method27780();
		}
		@Pc(140) Iterator local140 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(149) Class355 local149;
				do {
					if (!local140.hasNext()) {
						local140 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local140.hasNext()) {
										if (aBoolean352 && Class93_Sub9.aClass22_20 != null) {
											for (@Pc(240) Class93_Sub9 local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method445(); local240 != null; local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method415()) {
												@Pc(252) Class322 local252 = (Class322) aClass32_Sub2_2.method18261(local240.aClass93_Sub29_1.anInt1603 * 1208139441);
												if (local240.method13152(arg0, arg1)) {
													if (local252.aStringArray24 != null) {
														if (local252.aStringArray24[4] != null) {
															Class280.method26458(local252.aStringArray24[4], local252.aString175, -1, 1012, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[3] != null) {
															Class280.method26458(local252.aStringArray24[3], local252.aString175, -1, 1011, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[2] != null) {
															Class280.method26458(local252.aStringArray24[2], local252.aString175, -1, 1010, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[1] != null) {
															Class280.method26458(local252.aStringArray24[1], local252.aString175, -1, 1009, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[0] != null) {
															Class280.method26458(local252.aStringArray24[0], local252.aString175, -1, 1008, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
													}
													if (!local240.aClass93_Sub29_1.aBoolean340) {
														local240.aClass93_Sub29_1.aBoolean340 = true;
														Class165.method15320(Class155.aClass155_62, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
													if (local240.aClass93_Sub29_1.aBoolean340) {
														Class165.method15320(Class155.aClass155_54, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
												} else if (local240.aClass93_Sub29_1.aBoolean340) {
													local240.aClass93_Sub29_1.aBoolean340 = false;
													Class165.method15320(Class155.aClass155_53, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
												}
											}
										}
										return;
									}
									local149 = (Class355) ((Entry) local140.next()).getValue();
									local149.anInt4217 -= -1862405101;
								} while (local149.anInt4217 * 1950348827 != 0);
								if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
									local149.anInt4218 -= -1712890239;
									local149.anInt4217 = anInt1955 * -1400884413;
								} else {
									local140.remove();
								}
							}
						}
					}
					local149 = (Class355) ((Entry) local140.next()).getValue();
					local149.anInt4217 -= -1862405101;
				} while (local149.anInt4217 * 1950348827 != 0);
				if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
					local149.anInt4218 -= -1712890239;
					local149.anInt4217 = anInt1955 * -1400884413;
				} else {
					local140.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fk", descriptor = "(II)V", line = 708)
	static final void method14673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat152 < aFloat153) {
			aFloat152 = (float) ((double) aFloat152 + (double) aFloat152 / 30.0D);
			if (aFloat152 > aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		} else if (aFloat152 > aFloat153) {
			aFloat152 = (float) ((double) aFloat152 - (double) aFloat152 / 30.0D);
			if (aFloat152 < aFloat153) {
				aFloat152 = aFloat153;
			}
			Class358.method27780();
			anInt1935 = (int) aFloat153 >> 1;
			aByteArrayArrayArray10 = Class166_Sub6.method15484(anInt1935);
		}
		if (anInt1956 * 2025914025 != -1 && anInt1951 * 38948535 != -1) {
			@Pc(78) int local78 = anInt1956 * 2025914025 - Class93_Sub14.anInt1527 * -1951188017;
			if (local78 != 0) {
				local78 /= Math.min(anInt1947 * -932386613, Math.abs(local78));
			}
			@Pc(97) int local97 = anInt1951 * 38948535 - anInt1952 * -1606693775;
			if (local97 != 0) {
				local97 /= Math.min(anInt1947 * -932386613, Math.abs(local97));
			}
			Class93_Sub14.anInt1527 = (local78 + -1951188017 * Class93_Sub14.anInt1527) * -1845499089;
			anInt1952 = (anInt1952 * -1606693775 + local97) * 1415476369;
			if (local78 == 0 && local97 == 0) {
				anInt1956 = -130712985;
				anInt1951 = -919990023;
			}
			Class358.method27780();
		}
		@Pc(140) Iterator local140 = aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(149) Class355 local149;
				do {
					if (!local140.hasNext()) {
						local140 = aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local140.hasNext()) {
										if (aBoolean352 && Class93_Sub9.aClass22_20 != null) {
											for (@Pc(240) Class93_Sub9 local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method445(); local240 != null; local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method415()) {
												@Pc(252) Class322 local252 = (Class322) aClass32_Sub2_2.method18261(local240.aClass93_Sub29_1.anInt1603 * 1208139441);
												if (local240.method13152(arg0, arg1)) {
													if (local252.aStringArray24 != null) {
														if (local252.aStringArray24[4] != null) {
															Class280.method26458(local252.aStringArray24[4], local252.aString175, -1, 1012, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[3] != null) {
															Class280.method26458(local252.aStringArray24[3], local252.aString175, -1, 1011, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[2] != null) {
															Class280.method26458(local252.aStringArray24[2], local252.aString175, -1, 1010, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[1] != null) {
															Class280.method26458(local252.aStringArray24[1], local252.aString175, -1, 1009, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[0] != null) {
															Class280.method26458(local252.aStringArray24[0], local252.aString175, -1, 1008, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
													}
													if (!local240.aClass93_Sub29_1.aBoolean340) {
														local240.aClass93_Sub29_1.aBoolean340 = true;
														Class165.method15320(Class155.aClass155_62, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
													if (local240.aClass93_Sub29_1.aBoolean340) {
														Class165.method15320(Class155.aClass155_54, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
												} else if (local240.aClass93_Sub29_1.aBoolean340) {
													local240.aClass93_Sub29_1.aBoolean340 = false;
													Class165.method15320(Class155.aClass155_53, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
												}
											}
										}
										return;
									}
									local149 = (Class355) ((Entry) local140.next()).getValue();
									local149.anInt4217 -= -1862405101;
								} while (local149.anInt4217 * 1950348827 != 0);
								if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
									local149.anInt4218 -= -1712890239;
									local149.anInt4217 = anInt1955 * -1400884413;
								} else {
									local140.remove();
								}
							}
						}
					}
					local149 = (Class355) ((Entry) local140.next()).getValue();
					local149.anInt4217 -= -1862405101;
				} while (local149.anInt4217 * 1950348827 != 0);
				if (local149.anInt4218 * 1599791489 > 1 || aBoolean355) {
					local149.anInt4218 -= -1712890239;
					local149.anInt4217 = anInt1955 * -1400884413;
				} else {
					local140.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "fh", descriptor = "(IIIZ)V", line = 799)
	public static void method14645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class93_Sub1_Sub20 local1 = aClass93_Sub1_Sub20_2;
		method14518(arg0);
		aBoolean348 = false;
		if (aClass93_Sub1_Sub20_2 != local1) {
			Class47.method957();
		}
		anInt1953 = arg1 * -322880463;
		anInt1946 = arg2 * -1150228155;
		aBoolean356 = arg3;
	}

	@OriginalMember(owner = "client!alj", name = "fr", descriptor = "()V", line = 811)
	public static void method14646() {
		Class275.method26344(true);
	}

	@OriginalMember(owner = "client!alj", name = "gu", descriptor = "()Lclient!asy;", line = 815)
	public static Class93_Sub1_Sub20 method14622() {
		return aClass93_Sub1_Sub20_2;
	}

	@OriginalMember(owner = "client!alj", name = "gq", descriptor = "(Z)V", line = 819)
	static void method14652(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class611 local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19978();
		@Pc(13) Class93_Sub1_Sub20 local13 = method14508(local3.anInt5623 * 270611681, local3.anInt5624 * -1994307635);
		if (local13 == null) {
			local13 = method14509(aClass637_2.anInt5747 * 267023917);
		}
		if (Class602.aClass93_Sub1_Sub20_4 == local13 && !arg0) {
			return;
		}
		Class602.aClass93_Sub1_Sub20_4 = local13;
		@Pc(32) boolean local32 = method14507(local13);
		if (local32) {
			aBoolean348 = true;
			Class47.method957();
		}
	}

	@OriginalMember(owner = "client!alj", name = "gl", descriptor = "(I)V", line = 833)
	static void method14649(@OriginalArg(0) int arg0) {
		Class93_Sub14.anInt1527 = arg0 * -1845499089;
		anInt1956 = -130712985;
		anInt1951 = -919990023;
		Class358.method27780();
	}

	@OriginalMember(owner = "client!alj", name = "go", descriptor = "(I)V", line = 833)
	static void method14650(@OriginalArg(0) int arg0) {
		Class93_Sub14.anInt1527 = arg0 * -1845499089;
		anInt1956 = -130712985;
		anInt1951 = -919990023;
		Class358.method27780();
	}

	@OriginalMember(owner = "client!alj", name = "gk", descriptor = "(I)V", line = 833)
	static void method14651(@OriginalArg(0) int arg0) {
		Class93_Sub14.anInt1527 = arg0 * -1845499089;
		anInt1956 = -130712985;
		anInt1951 = -919990023;
		Class358.method27780();
	}

	@OriginalMember(owner = "client!alj", name = "gp", descriptor = "(I)V", line = 840)
	static void method14629(@OriginalArg(0) int arg0) {
		anInt1952 = arg0 * 1415476369;
		anInt1951 = -919990023;
		anInt1951 = -919990023;
		Class358.method27780();
	}

	@OriginalMember(owner = "client!alj", name = "gy", descriptor = "(I)V", line = 847)
	public static void method14653(@OriginalArg(0) int arg0) {
		if (arg0 == 25) {
			aFloat153 = 2.0F;
		} else if (arg0 == 37) {
			aFloat153 = 3.0F;
		} else if (arg0 == 50) {
			aFloat153 = 4.0F;
		} else if (arg0 == 75) {
			aFloat153 = 6.0F;
		} else if (arg0 == 100) {
			aFloat153 = 8.0F;
		} else if (arg0 == 200) {
			aFloat153 = 16.0F;
		}
		anInt1951 = -919990023;
		anInt1951 = -919990023;
	}

	@OriginalMember(owner = "client!alj", name = "ga", descriptor = "(I)V", line = 847)
	public static void method14670(@OriginalArg(0) int arg0) {
		if (arg0 == 25) {
			aFloat153 = 2.0F;
		} else if (arg0 == 37) {
			aFloat153 = 3.0F;
		} else if (arg0 == 50) {
			aFloat153 = 4.0F;
		} else if (arg0 == 75) {
			aFloat153 = 6.0F;
		} else if (arg0 == 100) {
			aFloat153 = 8.0F;
		} else if (arg0 == 200) {
			aFloat153 = 16.0F;
		}
		anInt1951 = -919990023;
		anInt1951 = -919990023;
	}

	@OriginalMember(owner = "client!alj", name = "gc", descriptor = "(IIII)V", line = 858)
	static void method14632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1922 / (float) anInt1923;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) (local5 * (float) arg2);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class93_Sub14.anInt1527 = local34 * anInt1923 / local7 * -1845499089;
		anInt1952 = (anInt1922 - local42 * anInt1922 / local9) * 1415476369;
		anInt1956 = -130712985;
		anInt1951 = -919990023;
		Class358.method27780();
	}

	@OriginalMember(owner = "client!alj", name = "gf", descriptor = "(IIII)V", line = 858)
	static void method14641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1922 / (float) anInt1923;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) (local5 * (float) arg2);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class93_Sub14.anInt1527 = local34 * anInt1923 / local7 * -1845499089;
		anInt1952 = (anInt1922 - local42 * anInt1922 / local9) * 1415476369;
		anInt1956 = -130712985;
		anInt1951 = -919990023;
		Class358.method27780();
	}

	@OriginalMember(owner = "client!alj", name = "gn", descriptor = "(IIII)V", line = 858)
	static void method14655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1922 / (float) anInt1923;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) (local5 * (float) arg2);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class93_Sub14.anInt1527 = local34 * anInt1923 / local7 * -1845499089;
		anInt1952 = (anInt1922 - local42 * anInt1922 / local9) * 1415476369;
		anInt1956 = -130712985;
		anInt1951 = -919990023;
		Class358.method27780();
	}

	@OriginalMember(owner = "client!alj", name = "ge", descriptor = "(I)V", line = 882)
	public static void method14656(@OriginalArg(0) int arg0) {
		@Pc(5) Class355 local5 = (Class355) aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class355();
		}
		local5.anInt4218 = anInt1944 * -1043952585;
		local5.anInt4217 = anInt1955 * -1400884413;
		aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!alj", name = "gx", descriptor = "(I)V", line = 882)
	public static void method14658(@OriginalArg(0) int arg0) {
		@Pc(5) Class355 local5 = (Class355) aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class355();
		}
		local5.anInt4218 = anInt1944 * -1043952585;
		local5.anInt4217 = anInt1955 * -1400884413;
		aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!alj", name = "gg", descriptor = "(I)V", line = 890)
	public static void method14660(@OriginalArg(0) int arg0) {
		@Pc(5) Class355 local5 = (Class355) aHashMap5.get(arg0);
		if (local5 == null) {
			local5 = new Class355();
		}
		local5.anInt4218 = anInt1944 * -1043952585;
		local5.anInt4217 = anInt1955 * -1400884413;
		aHashMap5.put(arg0, local5);
	}

	@OriginalMember(owner = "client!alj", name = "gr", descriptor = "(I)V", line = 898)
	public static void method14644(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1944 = anInt1948 * 1379158621;
		} else {
			anInt1944 = arg0 * 1254637319;
		}
	}

	@OriginalMember(owner = "client!alj", name = "gs", descriptor = "(I)V", line = 898)
	public static void method14662(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1944 = anInt1948 * 1379158621;
		} else {
			anInt1944 = arg0 * 1254637319;
		}
	}

	@OriginalMember(owner = "client!alj", name = "gt", descriptor = "(I)V", line = 903)
	public static void method14663(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1955 = anInt1949 * 1208056059;
		} else {
			anInt1955 = arg0 * 1275815665;
		}
	}

	@OriginalMember(owner = "client!alj", name = "gh", descriptor = "(Z)V", line = 908)
	public static void method14664(@OriginalArg(0) boolean arg0) {
		aBoolean355 = arg0;
	}

	@OriginalMember(owner = "client!alj", name = "gm", descriptor = "(Z)V", line = 908)
	public static void method14665(@OriginalArg(0) boolean arg0) {
		aBoolean355 = arg0;
	}

	@OriginalMember(owner = "client!alj", name = "gv", descriptor = "(Z)V", line = 908)
	public static void method14666(@OriginalArg(0) boolean arg0) {
		aBoolean355 = arg0;
	}

	@OriginalMember(owner = "client!alj", name = "gj", descriptor = "(III)I", line = 917)
	public static int method14661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (anInt1950 * -1574654625 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - anInt1915;
		@Pc(18) int local18 = arg2 - anInt1921;
		for (@Pc(23) Class93_Sub29 local23 = (Class93_Sub29) aClass22_28.method445(); local23 != null; local23 = (Class93_Sub29) aClass22_28.method415()) {
			if (arg0 == local23.anInt1603 * 1208139441) {
				@Pc(37) int local37 = local23.anInt1605 * 1012619213;
				@Pc(42) int local42 = local23.anInt1608 * -2087611449;
				@Pc(52) int local52 = anInt1915 + local37 << 14 | anInt1921 + local42;
				@Pc(68) int local68 = (local14 - local37) * (local14 - local37) + (local18 - local42) * (local18 - local42);
				if (local8 < 0 || local68 < local10) {
					local8 = local52;
					local10 = local68;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!alj", name = "gw", descriptor = "(III)I", line = 917)
	public static int method14668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (anInt1950 * -1574654625 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - anInt1915;
		@Pc(18) int local18 = arg2 - anInt1921;
		for (@Pc(23) Class93_Sub29 local23 = (Class93_Sub29) aClass22_28.method445(); local23 != null; local23 = (Class93_Sub29) aClass22_28.method415()) {
			if (arg0 == local23.anInt1603 * 1208139441) {
				@Pc(37) int local37 = local23.anInt1605 * 1012619213;
				@Pc(42) int local42 = local23.anInt1608 * -2087611449;
				@Pc(52) int local52 = anInt1915 + local37 << 14 | anInt1921 + local42;
				@Pc(68) int local68 = (local14 - local37) * (local14 - local37) + (local18 - local42) * (local18 - local42);
				if (local8 < 0 || local68 < local10) {
					local8 = local52;
					local10 = local68;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!alj", name = "gz", descriptor = "()Lclient!aks;", line = 937)
	public static Class93_Sub29 method14643() {
		if (aClass22_28 == null || aClass20_1 == null) {
			return null;
		}
		aClass20_1.method361(aClass22_28);
		@Pc(14) Class93_Sub29 local14 = (Class93_Sub29) aClass20_1.method372();
		if (local14 == null) {
			return null;
		} else {
			@Pc(27) Class322 local27 = (Class322) aClass32_Sub2_2.method18261(local14.anInt1603 * 1208139441);
			return local27 != null && local27.aBoolean711 && local27.method27258(anInterface21_2, anInterface23_2) ? local14 : Class717.method36897();
		}
	}

	@OriginalMember(owner = "client!alj", name = "gd", descriptor = "()Lclient!aks;", line = 937)
	public static Class93_Sub29 method14669() {
		if (aClass22_28 == null || aClass20_1 == null) {
			return null;
		}
		aClass20_1.method361(aClass22_28);
		@Pc(14) Class93_Sub29 local14 = (Class93_Sub29) aClass20_1.method372();
		if (local14 == null) {
			return null;
		} else {
			@Pc(27) Class322 local27 = (Class322) aClass32_Sub2_2.method18261(local14.anInt1603 * 1208139441);
			return local27 != null && local27.aBoolean711 && local27.method27258(anInterface21_2, anInterface23_2) ? local14 : Class717.method36897();
		}
	}

	@OriginalMember(owner = "client!alj", name = "hm", descriptor = "(II)V", line = 958)
	public static void method14624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1956 = (arg0 - anInt1915) * 130712985;
		anInt1951 = (arg1 - anInt1921) * 919990023;
	}

	@OriginalMember(owner = "client!alj", name = "gb", descriptor = "(II)V", line = 958)
	public static void method14671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1956 = (arg0 - anInt1915) * 130712985;
		anInt1951 = (arg1 - anInt1921) * 919990023;
	}

	@OriginalMember(owner = "client!alj", name = "gi", descriptor = "(II)V", line = 958)
	public static void method14672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1956 = (arg0 - anInt1915) * 130712985;
		anInt1951 = (arg1 - anInt1921) * 919990023;
	}

	@OriginalMember(owner = "client!alj", name = "ha", descriptor = "(I)I", line = 979)
	public static int method14674(@OriginalArg(0) int arg0) {
		if (arg0 == anInt1954 * -1423765151) {
			return aBoolean357 ? 1 : 0;
		} else if (anInt1945 * -1301134369 == arg0) {
			return aBoolean350 ? 1 : 0;
		} else if (anInt1957 * 778360671 == arg0) {
			return aBoolean349 ? 1 : 0;
		} else {
			return -1;
		}
	}
}
