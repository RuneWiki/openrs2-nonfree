package com.jagex;

import java.util.HashMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahd")
public class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!ahd", name = "bn", descriptor = "I")
	static int anInt1441 = 0;

	@OriginalMember(owner = "client!ahd", name = "be", descriptor = "I")
	static int anInt1431 = 252858217;

	@OriginalMember(owner = "client!ahd", name = "bx", descriptor = "I")
	static int anInt1436 = -659237042;

	@OriginalMember(owner = "client!ahd", name = "bh", descriptor = "I")
	static int anInt1432 = 2083601464;

	@OriginalMember(owner = "client!ahd", name = "bj", descriptor = "I")
	public static int anInt1440 = 411119717;

	@OriginalMember(owner = "client!ahd", name = "bq", descriptor = "I")
	public static int anInt1433 = 809368042;

	@OriginalMember(owner = "client!ahd", name = "bv", descriptor = "I")
	public static int anInt1434 = 0;

	@OriginalMember(owner = "client!ahd", name = "cu", descriptor = "I")
	static int anInt1437 = -481951965;

	@OriginalMember(owner = "client!ahd", name = "cv", descriptor = "I")
	static int anInt1435 = 1239823265;

	@OriginalMember(owner = "client!ahd", name = "cp", descriptor = "Z")
	static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!ahd", name = "cs", descriptor = "I")
	static int anInt1430 = 151931519;

	@OriginalMember(owner = "client!ahd", name = "ct", descriptor = "I")
	static int anInt1442 = -1679987289;

	@OriginalMember(owner = "client!ahd", name = "cx", descriptor = "Z")
	static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!ahd", name = "cy", descriptor = "[[Lclient!dw;")
	static Class14[][] aClass14ArrayArray1 = new Class14[3][4];

	@OriginalMember(owner = "client!ahd", name = "cb", descriptor = "[[Lclient!yx;")
	static Class611[][] aClass611ArrayArray1 = new Class611[3][4];

	@OriginalMember(owner = "client!ahd", name = "co", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap3 = new HashMap();

	@OriginalMember(owner = "client!ahd", name = "cd", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap4 = new HashMap();

	@OriginalMember(owner = "client!ahd", name = "ch", descriptor = "I")
	static int anInt1438 = anInt1440 * 1182966379;

	@OriginalMember(owner = "client!ahd", name = "ci", descriptor = "I")
	static int anInt1439 = anInt1433 * 956783367;

	@OriginalMember(owner = "client!ahd", name = "ca", descriptor = "Z")
	static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ahd", name = "ce", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ahd", name = "cw", descriptor = "Lclient!xn;")
	public static Class581 aClass581_14 = new Class581(8);

	@OriginalMember(owner = "client!ahd", name = "cf", descriptor = "Lclient!xn;")
	public static Class581 aClass581_15 = new Class581(8);

	@OriginalMember(owner = "client!ahd", name = "dv", descriptor = "Lclient!wl;")
	static Class554 aClass554_1 = new Class554(new Class553());

	@OriginalMember(owner = "client!ahd", name = "df", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!ahd", name = "dh", descriptor = "Z")
	public static boolean aBoolean321 = false;

	@OriginalMember(owner = "client!ahd", name = "db", descriptor = "Z")
	public static boolean aBoolean322 = false;

	@OriginalMember(owner = "client!ahd", name = "dp", descriptor = "Z")
	static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!ahd", name = "dk", descriptor = "Z")
	static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!ahd", name = "dy", descriptor = "Z")
	static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!ahd", name = "<init>", descriptor = "()V", line = 84)
	Class58_Sub1() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ahd", name = "ew", descriptor = "(Lclient!de;Lclient!ds;)V", line = 89)
	static final void method12486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class134 arg1) {
		if (anInt1434 * 1235407417 == 100 || aClass3_Sub1_Sub4_2 == null) {
			return;
		}
		Class176.method23413();
		Class176.method23413();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1434 * 1235407417 < 10) {
			for (local20 = 0; local20 < aClass14ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass14ArrayArray1[local20].length; local26++) {
					Class294.aClass359_54.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
					Class475.aClass359_86.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
				}
			}
			if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106)) {
				anInt1434 = Class579.aClass359_102.method26689(aClass3_Sub1_Sub4_2.aString106) / 10 * -1693746167;
				return;
			}
			anInt1434 = 242407514;
		}
		if (anInt1434 * 1235407417 == 10) {
			anInt1429 = aClass3_Sub1_Sub4_2.anInt2652 * 1214831777 >> 6 << 6;
			anInt1406 = aClass3_Sub1_Sub4_2.anInt2654 * 1120229487 >> 6 << 6;
			anInt1407 = (aClass3_Sub1_Sub4_2.anInt2653 * 363486565 >> 6 << 6) - anInt1429 + 64;
			anInt1408 = (aClass3_Sub1_Sub4_2.anInt2655 * -1121810567 >> 6 << 6) - anInt1406 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class320 local135 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
			@Pc(139) Class464 local139 = client.aClass370_1.method26942();
			if (aClass3_Sub1_Sub4_2.method18896(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, ((int) local135.aFloat259 >> 9) + local139.anInt5071 * -1567811631, ((int) local135.aFloat261 >> 9) + local139.anInt5073 * 1360175441, local127)) {
				local26 = local127[1] - anInt1429;
				local131 = local127[2] - anInt1406;
			}
			if (!aBoolean318 && local26 >= 0 && local26 < anInt1407 && local131 >= 0 && local131 < anInt1408) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class485.anInt5182 = local26 * -1310727029;
				Class161.anInt3445 = local131 * 634470607;
			} else if (anInt1430 * 173836929 == -1 || anInt1442 * 1322489321 == -1) {
				aClass3_Sub1_Sub4_2.method18902(aClass3_Sub1_Sub4_2.anInt2650 * -13600129 >> 14 & 0x3FFF, aClass3_Sub1_Sub4_2.anInt2650 * -13600129 & 0x3FFF, local127);
				Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
				Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
			} else {
				aClass3_Sub1_Sub4_2.method18902(anInt1430 * 173836929, anInt1442 * 1322489321, local127);
				if (local127 != null) {
					Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
					Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
				}
				anInt1442 = -1679987289;
				anInt1430 = 151931519;
				aBoolean318 = false;
			}
			if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 37) {
				aFloat149 = 3.0F;
				aFloat148 = 3.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 50) {
				aFloat149 = 4.0F;
				aFloat148 = 4.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 75) {
				aFloat149 = 6.0F;
				aFloat148 = 6.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 100) {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 200) {
				aFloat149 = 16.0F;
				aFloat148 = 16.0F;
			} else {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			}
			anInt1403 = (int) aFloat148 >> 1;
			aByteArrayArrayArray10 = Class377.method27243(anInt1403);
			Class538.method32566();
			method12385();
			Class269.aClass553_55 = new Class553();
			anInt1401 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1401 < -8) {
				anInt1401 = -8;
			}
			if (anInt1401 > 8) {
				anInt1401 = 8;
			}
			anInt1402 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1402 < -16) {
				anInt1402 = -16;
			}
			if (anInt1402 > 16) {
				anInt1402 = 16;
			}
			method12426(arg1, anInt1401 >> 2 << 10, anInt1402 >> 1);
			aClass454_2.method28439(1024, 256);
			aClass629_2.method33839(256, 256);
			aClass457_7.method28492(4096);
			Class308.aClass70_Sub2_3.method33887(256);
			anInt1434 = 484815028;
		} else if (anInt1434 * 1235407417 == 20) {
			if (!aBoolean315) {
				Class110.method22005(true);
				method12405(arg0, anInt1401, anInt1402, aBoolean315);
				anInt1434 = 1454445084;
				Class110.method22005(true);
				Class148.method23113();
			} else if (method12405(arg0, anInt1401, anInt1402, aBoolean315)) {
				anInt1434 = 1454445084;
			}
		} else if (anInt1434 * 1235407417 == 60) {
			if (aClass359_20.method26681(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
				if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
					return;
				}
				aClass421_2 = Class191.method24060(aClass359_20, aClass3_Sub1_Sub4_2.aString106 + "_staticelements", client.aBoolean590);
			} else {
				aClass421_2 = new Class421(0);
			}
			method12398();
			anInt1434 = 1696852598;
			Class110.method22005(true);
			Class148.method23113();
		} else if (anInt1434 * 1235407417 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1434 = -1870892156;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 4; local26++) {
					if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
						aClass14ArrayArray1[local20][local26] = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, aClass484_2.anIntArrayArray58[local20][local26], true, true);
						aClass611ArrayArray1[local20][local26] = Class179.method23534(Class475.aClass359_86, aClass484_2.anIntArrayArray58[local20][local26]);
						if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1434 += -786271205;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "em", descriptor = "(Lclient!de;Lclient!ds;)V", line = 89)
	static final void method12487(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class134 arg1) {
		if (anInt1434 * 1235407417 == 100 || aClass3_Sub1_Sub4_2 == null) {
			return;
		}
		Class176.method23413();
		Class176.method23413();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1434 * 1235407417 < 10) {
			for (local20 = 0; local20 < aClass14ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass14ArrayArray1[local20].length; local26++) {
					Class294.aClass359_54.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
					Class475.aClass359_86.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
				}
			}
			if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106)) {
				anInt1434 = Class579.aClass359_102.method26689(aClass3_Sub1_Sub4_2.aString106) / 10 * -1693746167;
				return;
			}
			anInt1434 = 242407514;
		}
		if (anInt1434 * 1235407417 == 10) {
			anInt1429 = aClass3_Sub1_Sub4_2.anInt2652 * 1214831777 >> 6 << 6;
			anInt1406 = aClass3_Sub1_Sub4_2.anInt2654 * 1120229487 >> 6 << 6;
			anInt1407 = (aClass3_Sub1_Sub4_2.anInt2653 * 363486565 >> 6 << 6) - anInt1429 + 64;
			anInt1408 = (aClass3_Sub1_Sub4_2.anInt2655 * -1121810567 >> 6 << 6) - anInt1406 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class320 local135 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
			@Pc(139) Class464 local139 = client.aClass370_1.method26942();
			if (aClass3_Sub1_Sub4_2.method18896(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, ((int) local135.aFloat259 >> 9) + local139.anInt5071 * -1567811631, ((int) local135.aFloat261 >> 9) + local139.anInt5073 * 1360175441, local127)) {
				local26 = local127[1] - anInt1429;
				local131 = local127[2] - anInt1406;
			}
			if (!aBoolean318 && local26 >= 0 && local26 < anInt1407 && local131 >= 0 && local131 < anInt1408) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class485.anInt5182 = local26 * -1310727029;
				Class161.anInt3445 = local131 * 634470607;
			} else if (anInt1430 * 173836929 == -1 || anInt1442 * 1322489321 == -1) {
				aClass3_Sub1_Sub4_2.method18902(aClass3_Sub1_Sub4_2.anInt2650 * -13600129 >> 14 & 0x3FFF, aClass3_Sub1_Sub4_2.anInt2650 * -13600129 & 0x3FFF, local127);
				Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
				Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
			} else {
				aClass3_Sub1_Sub4_2.method18902(anInt1430 * 173836929, anInt1442 * 1322489321, local127);
				if (local127 != null) {
					Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
					Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
				}
				anInt1442 = -1679987289;
				anInt1430 = 151931519;
				aBoolean318 = false;
			}
			if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 37) {
				aFloat149 = 3.0F;
				aFloat148 = 3.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 50) {
				aFloat149 = 4.0F;
				aFloat148 = 4.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 75) {
				aFloat149 = 6.0F;
				aFloat148 = 6.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 100) {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 200) {
				aFloat149 = 16.0F;
				aFloat148 = 16.0F;
			} else {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			}
			anInt1403 = (int) aFloat148 >> 1;
			aByteArrayArrayArray10 = Class377.method27243(anInt1403);
			Class538.method32566();
			method12385();
			Class269.aClass553_55 = new Class553();
			anInt1401 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1401 < -8) {
				anInt1401 = -8;
			}
			if (anInt1401 > 8) {
				anInt1401 = 8;
			}
			anInt1402 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1402 < -16) {
				anInt1402 = -16;
			}
			if (anInt1402 > 16) {
				anInt1402 = 16;
			}
			method12426(arg1, anInt1401 >> 2 << 10, anInt1402 >> 1);
			aClass454_2.method28439(1024, 256);
			aClass629_2.method33839(256, 256);
			aClass457_7.method28492(4096);
			Class308.aClass70_Sub2_3.method33887(256);
			anInt1434 = 484815028;
		} else if (anInt1434 * 1235407417 == 20) {
			if (!aBoolean315) {
				Class110.method22005(true);
				method12405(arg0, anInt1401, anInt1402, aBoolean315);
				anInt1434 = 1454445084;
				Class110.method22005(true);
				Class148.method23113();
			} else if (method12405(arg0, anInt1401, anInt1402, aBoolean315)) {
				anInt1434 = 1454445084;
			}
		} else if (anInt1434 * 1235407417 == 60) {
			if (aClass359_20.method26681(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
				if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
					return;
				}
				aClass421_2 = Class191.method24060(aClass359_20, aClass3_Sub1_Sub4_2.aString106 + "_staticelements", client.aBoolean590);
			} else {
				aClass421_2 = new Class421(0);
			}
			method12398();
			anInt1434 = 1696852598;
			Class110.method22005(true);
			Class148.method23113();
		} else if (anInt1434 * 1235407417 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1434 = -1870892156;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 4; local26++) {
					if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
						aClass14ArrayArray1[local20][local26] = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, aClass484_2.anIntArrayArray58[local20][local26], true, true);
						aClass611ArrayArray1[local20][local26] = Class179.method23534(Class475.aClass359_86, aClass484_2.anIntArrayArray58[local20][local26]);
						if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1434 += -786271205;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ec", descriptor = "(Lclient!de;Lclient!ds;)V", line = 89)
	static final void method12488(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class134 arg1) {
		if (anInt1434 * 1235407417 == 100 || aClass3_Sub1_Sub4_2 == null) {
			return;
		}
		Class176.method23413();
		Class176.method23413();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1434 * 1235407417 < 10) {
			for (local20 = 0; local20 < aClass14ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass14ArrayArray1[local20].length; local26++) {
					Class294.aClass359_54.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
					Class475.aClass359_86.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
				}
			}
			if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106)) {
				anInt1434 = Class579.aClass359_102.method26689(aClass3_Sub1_Sub4_2.aString106) / 10 * -1693746167;
				return;
			}
			anInt1434 = 242407514;
		}
		if (anInt1434 * 1235407417 == 10) {
			anInt1429 = aClass3_Sub1_Sub4_2.anInt2652 * 1214831777 >> 6 << 6;
			anInt1406 = aClass3_Sub1_Sub4_2.anInt2654 * 1120229487 >> 6 << 6;
			anInt1407 = (aClass3_Sub1_Sub4_2.anInt2653 * 363486565 >> 6 << 6) - anInt1429 + 64;
			anInt1408 = (aClass3_Sub1_Sub4_2.anInt2655 * -1121810567 >> 6 << 6) - anInt1406 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class320 local135 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
			@Pc(139) Class464 local139 = client.aClass370_1.method26942();
			if (aClass3_Sub1_Sub4_2.method18896(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, ((int) local135.aFloat259 >> 9) + local139.anInt5071 * -1567811631, ((int) local135.aFloat261 >> 9) + local139.anInt5073 * 1360175441, local127)) {
				local26 = local127[1] - anInt1429;
				local131 = local127[2] - anInt1406;
			}
			if (!aBoolean318 && local26 >= 0 && local26 < anInt1407 && local131 >= 0 && local131 < anInt1408) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class485.anInt5182 = local26 * -1310727029;
				Class161.anInt3445 = local131 * 634470607;
			} else if (anInt1430 * 173836929 == -1 || anInt1442 * 1322489321 == -1) {
				aClass3_Sub1_Sub4_2.method18902(aClass3_Sub1_Sub4_2.anInt2650 * -13600129 >> 14 & 0x3FFF, aClass3_Sub1_Sub4_2.anInt2650 * -13600129 & 0x3FFF, local127);
				Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
				Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
			} else {
				aClass3_Sub1_Sub4_2.method18902(anInt1430 * 173836929, anInt1442 * 1322489321, local127);
				if (local127 != null) {
					Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
					Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
				}
				anInt1442 = -1679987289;
				anInt1430 = 151931519;
				aBoolean318 = false;
			}
			if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 37) {
				aFloat149 = 3.0F;
				aFloat148 = 3.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 50) {
				aFloat149 = 4.0F;
				aFloat148 = 4.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 75) {
				aFloat149 = 6.0F;
				aFloat148 = 6.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 100) {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 200) {
				aFloat149 = 16.0F;
				aFloat148 = 16.0F;
			} else {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			}
			anInt1403 = (int) aFloat148 >> 1;
			aByteArrayArrayArray10 = Class377.method27243(anInt1403);
			Class538.method32566();
			method12385();
			Class269.aClass553_55 = new Class553();
			anInt1401 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1401 < -8) {
				anInt1401 = -8;
			}
			if (anInt1401 > 8) {
				anInt1401 = 8;
			}
			anInt1402 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1402 < -16) {
				anInt1402 = -16;
			}
			if (anInt1402 > 16) {
				anInt1402 = 16;
			}
			method12426(arg1, anInt1401 >> 2 << 10, anInt1402 >> 1);
			aClass454_2.method28439(1024, 256);
			aClass629_2.method33839(256, 256);
			aClass457_7.method28492(4096);
			Class308.aClass70_Sub2_3.method33887(256);
			anInt1434 = 484815028;
		} else if (anInt1434 * 1235407417 == 20) {
			if (!aBoolean315) {
				Class110.method22005(true);
				method12405(arg0, anInt1401, anInt1402, aBoolean315);
				anInt1434 = 1454445084;
				Class110.method22005(true);
				Class148.method23113();
			} else if (method12405(arg0, anInt1401, anInt1402, aBoolean315)) {
				anInt1434 = 1454445084;
			}
		} else if (anInt1434 * 1235407417 == 60) {
			if (aClass359_20.method26681(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
				if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
					return;
				}
				aClass421_2 = Class191.method24060(aClass359_20, aClass3_Sub1_Sub4_2.aString106 + "_staticelements", client.aBoolean590);
			} else {
				aClass421_2 = new Class421(0);
			}
			method12398();
			anInt1434 = 1696852598;
			Class110.method22005(true);
			Class148.method23113();
		} else if (anInt1434 * 1235407417 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1434 = -1870892156;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 4; local26++) {
					if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
						aClass14ArrayArray1[local20][local26] = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, aClass484_2.anIntArrayArray58[local20][local26], true, true);
						aClass611ArrayArray1[local20][local26] = Class179.method23534(Class475.aClass359_86, aClass484_2.anIntArrayArray58[local20][local26]);
						if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1434 += -786271205;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "en", descriptor = "(Lclient!de;Lclient!ds;)V", line = 89)
	static final void method12535(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class134 arg1) {
		if (anInt1434 * 1235407417 == 100 || aClass3_Sub1_Sub4_2 == null) {
			return;
		}
		Class176.method23413();
		Class176.method23413();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1434 * 1235407417 < 10) {
			for (local20 = 0; local20 < aClass14ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass14ArrayArray1[local20].length; local26++) {
					Class294.aClass359_54.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
					Class475.aClass359_86.method26674(aClass484_2.anIntArrayArray58[local20][local26]);
				}
			}
			if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106)) {
				anInt1434 = Class579.aClass359_102.method26689(aClass3_Sub1_Sub4_2.aString106) / 10 * -1693746167;
				return;
			}
			anInt1434 = 242407514;
		}
		if (anInt1434 * 1235407417 == 10) {
			anInt1429 = aClass3_Sub1_Sub4_2.anInt2652 * 1214831777 >> 6 << 6;
			anInt1406 = aClass3_Sub1_Sub4_2.anInt2654 * 1120229487 >> 6 << 6;
			anInt1407 = (aClass3_Sub1_Sub4_2.anInt2653 * 363486565 >> 6 << 6) - anInt1429 + 64;
			anInt1408 = (aClass3_Sub1_Sub4_2.anInt2655 * -1121810567 >> 6 << 6) - anInt1406 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class320 local135 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
			@Pc(139) Class464 local139 = client.aClass370_1.method26942();
			if (aClass3_Sub1_Sub4_2.method18896(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, ((int) local135.aFloat259 >> 9) + local139.anInt5071 * -1567811631, ((int) local135.aFloat261 >> 9) + local139.anInt5073 * 1360175441, local127)) {
				local26 = local127[1] - anInt1429;
				local131 = local127[2] - anInt1406;
			}
			if (!aBoolean318 && local26 >= 0 && local26 < anInt1407 && local131 >= 0 && local131 < anInt1408) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class485.anInt5182 = local26 * -1310727029;
				Class161.anInt3445 = local131 * 634470607;
			} else if (anInt1430 * 173836929 == -1 || anInt1442 * 1322489321 == -1) {
				aClass3_Sub1_Sub4_2.method18902(aClass3_Sub1_Sub4_2.anInt2650 * -13600129 >> 14 & 0x3FFF, aClass3_Sub1_Sub4_2.anInt2650 * -13600129 & 0x3FFF, local127);
				Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
				Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
			} else {
				aClass3_Sub1_Sub4_2.method18902(anInt1430 * 173836929, anInt1442 * 1322489321, local127);
				if (local127 != null) {
					Class485.anInt5182 = (local127[1] - anInt1429) * -1310727029;
					Class161.anInt3445 = (local127[2] - anInt1406) * 634470607;
				}
				anInt1442 = -1679987289;
				anInt1430 = 151931519;
				aBoolean318 = false;
			}
			if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 37) {
				aFloat149 = 3.0F;
				aFloat148 = 3.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 50) {
				aFloat149 = 4.0F;
				aFloat148 = 4.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 75) {
				aFloat149 = 6.0F;
				aFloat148 = 6.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 100) {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			} else if (aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 200) {
				aFloat149 = 16.0F;
				aFloat148 = 16.0F;
			} else {
				aFloat149 = 8.0F;
				aFloat148 = 8.0F;
			}
			anInt1403 = (int) aFloat148 >> 1;
			aByteArrayArrayArray10 = Class377.method27243(anInt1403);
			Class538.method32566();
			method12385();
			Class269.aClass553_55 = new Class553();
			anInt1401 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1401 < -8) {
				anInt1401 = -8;
			}
			if (anInt1401 > 8) {
				anInt1401 = 8;
			}
			anInt1402 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1402 < -16) {
				anInt1402 = -16;
			}
			if (anInt1402 > 16) {
				anInt1402 = 16;
			}
			method12426(arg1, anInt1401 >> 2 << 10, anInt1402 >> 1);
			aClass454_2.method28439(1024, 256);
			aClass629_2.method33839(256, 256);
			aClass457_7.method28492(4096);
			Class308.aClass70_Sub2_3.method33887(256);
			anInt1434 = 484815028;
		} else if (anInt1434 * 1235407417 == 20) {
			if (!aBoolean315) {
				Class110.method22005(true);
				method12405(arg0, anInt1401, anInt1402, aBoolean315);
				anInt1434 = 1454445084;
				Class110.method22005(true);
				Class148.method23113();
			} else if (method12405(arg0, anInt1401, anInt1402, aBoolean315)) {
				anInt1434 = 1454445084;
			}
		} else if (anInt1434 * 1235407417 == 60) {
			if (aClass359_20.method26681(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
				if (!aClass359_20.method26694(aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
					return;
				}
				aClass421_2 = Class191.method24060(aClass359_20, aClass3_Sub1_Sub4_2.aString106 + "_staticelements", client.aBoolean590);
			} else {
				aClass421_2 = new Class421(0);
			}
			method12398();
			anInt1434 = 1696852598;
			Class110.method22005(true);
			Class148.method23113();
		} else if (anInt1434 * 1235407417 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1434 = -1870892156;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 4; local26++) {
					if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
						aClass14ArrayArray1[local20][local26] = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, aClass484_2.anIntArrayArray58[local20][local26], true, true);
						aClass611ArrayArray1[local20][local26] = Class179.method23534(Class475.aClass359_86, aClass484_2.anIntArrayArray58[local20][local26]);
						if (aClass14ArrayArray1[local20][local26] == null || aClass611ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1434 += -786271205;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ea", descriptor = "()V", line = 251)
	static void method12495() {
		Class269.aClass553_55 = null;
		anInt1434 = 0;
		anInt1419 = 0;
		Class19_Sub1.aClass178_8 = null;
		method12386();
		aClass553_23.method32701();
		aClass421_2 = null;
		aClass161_8.method23224();
		aClass161_7.method23224();
		Class381.aClass6_28 = null;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		if (aClass454_2 != null) {
			aClass454_2.method28449();
			aClass454_2.method28439(128, 64);
		}
		if (aClass629_2 != null) {
			aClass629_2.method33839(64, 64);
		}
		if (aClass457_7 != null) {
			aClass457_7.method28492(256);
		}
		Class308.aClass70_Sub2_3.method33887(64);
	}

	@OriginalMember(owner = "client!ahd", name = "ed", descriptor = "()V", line = 273)
	static void method12484() {
		@Pc(1) int local1 = -1;
		if (aClass3_Sub1_Sub4_2 != null) {
			local1 = aClass3_Sub1_Sub4_2.anInt2649 * 75245013;
		}
		Class473.method28782();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				aClass14ArrayArray1[local13][local18] = null;
				aClass611ArrayArray1[local13][local18] = null;
			}
		}
		aClass3_Sub1_Sub4_2 = null;
		if (local1 != -1) {
			Class10.method720(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ez", descriptor = "()V", line = 273)
	static void method12490() {
		@Pc(1) int local1 = -1;
		if (aClass3_Sub1_Sub4_2 != null) {
			local1 = aClass3_Sub1_Sub4_2.anInt2649 * 75245013;
		}
		Class473.method28782();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				aClass14ArrayArray1[local13][local18] = null;
				aClass611ArrayArray1[local13][local18] = null;
			}
		}
		aClass3_Sub1_Sub4_2 = null;
		if (local1 != -1) {
			Class10.method720(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ep", descriptor = "()V", line = 273)
	static void method12491() {
		@Pc(1) int local1 = -1;
		if (aClass3_Sub1_Sub4_2 != null) {
			local1 = aClass3_Sub1_Sub4_2.anInt2649 * 75245013;
		}
		Class473.method28782();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				aClass14ArrayArray1[local13][local18] = null;
				aClass611ArrayArray1[local13][local18] = null;
			}
		}
		aClass3_Sub1_Sub4_2 = null;
		if (local1 != -1) {
			Class10.method720(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ev", descriptor = "(Lclient!de;IIII)V", line = 303)
	static void method12512(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method17079(arg1, arg2, arg1 + arg3, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (anInt1434 * 1235407417 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg3 / 2 + arg1;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method17050(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method17068(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3130 * 548516575].getRGB(), 0);
			arg0.method17050(local22 - 150, local32 + 2, anInt1434 * -588745045, 30, client.aColorArray1[client.anInt3130 * 548516575].getRGB(), 0);
			Class568.aClass14_13.method3282(Class601.aClass601_124.method33512(Class469.aClass530_2), local22, local16 + local32, client.aColorArray3[client.anInt3130 * 548516575].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class485.anInt5182 * 826696483 - (int) ((float) arg3 / aFloat149);
		local22 = (int) ((float) arg4 / aFloat149) + Class161.anInt3445 * 2105263663;
		local32 = (int) ((float) arg3 / aFloat149) + Class485.anInt5182 * 826696483;
		@Pc(133) int local133 = Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / aFloat149);
		Class177.anInt3475 = (Class485.anInt5182 * 826696483 - (int) ((float) arg3 / aFloat149)) * 291202019;
		Class408.anInt4816 = (Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / aFloat149)) * -1365949555;
		Class463.anInt5070 = (int) ((float) (arg3 * 2) / aFloat149) * -1550147811;
		Class237.anInt3749 = (int) ((float) (arg4 * 2) / aFloat149) * -829018415;
		aClass161_9 = aClass161_8;
		method12399(anInt1429 + local103, local22 + anInt1406, local32 + anInt1429, local133 + anInt1406, arg1, arg2, arg1 + arg3, arg2 + arg4 + 1);
		method12400(arg0, !aBoolean323, !aBoolean324, client.aBoolean590, false);
		@Pc(219) Class553 local219 = method12455(arg0);
		Class42.method8328(arg0, local219, 0, 0);
		if (client.aBoolean574) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class454.aClass14_12.method3309("Fps: " + Class390.anInt3019 * 1617726299 + " (" + Class390.anInt3027 * 222336985 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class454.aClass14_12.method3309("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		aClass161_8.method23240(5);
	}

	@OriginalMember(owner = "client!ahd", name = "et", descriptor = "(Lclient!de;IIII)V", line = 303)
	static void method12530(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method17079(arg1, arg2, arg1 + arg3, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (anInt1434 * 1235407417 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg3 / 2 + arg1;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method17050(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method17068(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3130 * 548516575].getRGB(), 0);
			arg0.method17050(local22 - 150, local32 + 2, anInt1434 * -588745045, 30, client.aColorArray1[client.anInt3130 * 548516575].getRGB(), 0);
			Class568.aClass14_13.method3282(Class601.aClass601_124.method33512(Class469.aClass530_2), local22, local16 + local32, client.aColorArray3[client.anInt3130 * 548516575].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class485.anInt5182 * 826696483 - (int) ((float) arg3 / aFloat149);
		local22 = (int) ((float) arg4 / aFloat149) + Class161.anInt3445 * 2105263663;
		local32 = (int) ((float) arg3 / aFloat149) + Class485.anInt5182 * 826696483;
		@Pc(133) int local133 = Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / aFloat149);
		Class177.anInt3475 = (Class485.anInt5182 * 826696483 - (int) ((float) arg3 / aFloat149)) * 291202019;
		Class408.anInt4816 = (Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / aFloat149)) * -1365949555;
		Class463.anInt5070 = (int) ((float) (arg3 * 2) / aFloat149) * -1550147811;
		Class237.anInt3749 = (int) ((float) (arg4 * 2) / aFloat149) * -829018415;
		aClass161_9 = aClass161_8;
		method12399(anInt1429 + local103, local22 + anInt1406, local32 + anInt1429, local133 + anInt1406, arg1, arg2, arg1 + arg3, arg2 + arg4 + 1);
		method12400(arg0, !aBoolean323, !aBoolean324, client.aBoolean590, false);
		@Pc(219) Class553 local219 = method12455(arg0);
		Class42.method8328(arg0, local219, 0, 0);
		if (client.aBoolean574) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class454.aClass14_12.method3309("Fps: " + Class390.anInt3019 * 1617726299 + " (" + Class390.anInt3027 * 222336985 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class454.aClass14_12.method3309("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		aClass161_8.method23240(5);
	}

	@OriginalMember(owner = "client!ahd", name = "eq", descriptor = "(Lclient!de;IIII)V", line = 303)
	static void method12542(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method17079(arg1, arg2, arg1 + arg3, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (anInt1434 * 1235407417 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg3 / 2 + arg1;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method17050(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method17068(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3130 * 548516575].getRGB(), 0);
			arg0.method17050(local22 - 150, local32 + 2, anInt1434 * -588745045, 30, client.aColorArray1[client.anInt3130 * 548516575].getRGB(), 0);
			Class568.aClass14_13.method3282(Class601.aClass601_124.method33512(Class469.aClass530_2), local22, local16 + local32, client.aColorArray3[client.anInt3130 * 548516575].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class485.anInt5182 * 826696483 - (int) ((float) arg3 / aFloat149);
		local22 = (int) ((float) arg4 / aFloat149) + Class161.anInt3445 * 2105263663;
		local32 = (int) ((float) arg3 / aFloat149) + Class485.anInt5182 * 826696483;
		@Pc(133) int local133 = Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / aFloat149);
		Class177.anInt3475 = (Class485.anInt5182 * 826696483 - (int) ((float) arg3 / aFloat149)) * 291202019;
		Class408.anInt4816 = (Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / aFloat149)) * -1365949555;
		Class463.anInt5070 = (int) ((float) (arg3 * 2) / aFloat149) * -1550147811;
		Class237.anInt3749 = (int) ((float) (arg4 * 2) / aFloat149) * -829018415;
		aClass161_9 = aClass161_8;
		method12399(anInt1429 + local103, local22 + anInt1406, local32 + anInt1429, local133 + anInt1406, arg1, arg2, arg1 + arg3, arg2 + arg4 + 1);
		method12400(arg0, !aBoolean323, !aBoolean324, client.aBoolean590, false);
		@Pc(219) Class553 local219 = method12455(arg0);
		Class42.method8328(arg0, local219, 0, 0);
		if (client.aBoolean574) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class454.aClass14_12.method3309("Fps: " + Class390.anInt3019 * 1617726299 + " (" + Class390.anInt3027 * 222336985 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class454.aClass14_12.method3309("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		aClass161_8.method23240(5);
	}

	@OriginalMember(owner = "client!ahd", name = "ek", descriptor = "(Lclient!de;Lclient!wk;II)V", line = 343)
	static void method12497(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class553 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class269.aClass553_55.method32701();
		if (aBoolean319) {
			return;
		}
		for (@Pc(10) Class3_Sub26 local10 = (Class3_Sub26) arg1.method32768(); local10 != null; local10 = (Class3_Sub26) arg1.method32709()) {
			@Pc(20) Class452 local20 = aClass454_2.method28448(local10.anInt1304 * 1865552421);
			if (Class44_Sub1.method8406(local20)) {
				@Pc(33) boolean local33 = Class343.method26483(arg0, local10, local20, arg2, arg3);
				if (local33) {
					Class201.method24157(arg0, local10, local20);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ei", descriptor = "(Lclient!de;Lclient!wk;II)V", line = 343)
	static void method12529(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class553 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class269.aClass553_55.method32701();
		if (aBoolean319) {
			return;
		}
		for (@Pc(10) Class3_Sub26 local10 = (Class3_Sub26) arg1.method32768(); local10 != null; local10 = (Class3_Sub26) arg1.method32709()) {
			@Pc(20) Class452 local20 = aClass454_2.method28448(local10.anInt1304 * 1865552421);
			if (Class44_Sub1.method8406(local20)) {
				@Pc(33) boolean local33 = Class343.method26483(arg0, local10, local20, arg2, arg3);
				if (local33) {
					Class201.method24157(arg0, local10, local20);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "eo", descriptor = "(Lclient!de;Lclient!wk;II)V", line = 343)
	static void method12531(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class553 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class269.aClass553_55.method32701();
		if (aBoolean319) {
			return;
		}
		for (@Pc(10) Class3_Sub26 local10 = (Class3_Sub26) arg1.method32768(); local10 != null; local10 = (Class3_Sub26) arg1.method32709()) {
			@Pc(20) Class452 local20 = aClass454_2.method28448(local10.anInt1304 * 1865552421);
			if (Class44_Sub1.method8406(local20)) {
				@Pc(33) boolean local33 = Class343.method26483(arg0, local10, local20, arg2, arg3);
				if (local33) {
					Class201.method24157(arg0, local10, local20);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "el", descriptor = "(Lclient!se;)Z", line = 354)
	static boolean method12499(@OriginalArg(0) Class452 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean775) {
			return false;
		} else if (!arg0.method28402(anInterface9_2, anInterface8_2)) {
			return false;
		} else if (aClass581_14.method33217((long) (arg0.anInt5025 * -1073021415)) != null) {
			return false;
		} else if (aClass581_15.method33217((long) (arg0.anInt5054 * -589352987)) == null) {
			if (arg0.aString224 != null) {
				if (arg0.anInt5041 * 404639277 == 0 && aBoolean320) {
					return false;
				}
				if (arg0.anInt5041 * 404639277 == 1 && aBoolean321) {
					return false;
				}
				if (arg0.anInt5041 * 404639277 == 2 && aBoolean322) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahd", name = "eu", descriptor = "(Lclient!se;)Z", line = 354)
	static boolean method12500(@OriginalArg(0) Class452 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean775) {
			return false;
		} else if (!arg0.method28402(anInterface9_2, anInterface8_2)) {
			return false;
		} else if (aClass581_14.method33217((long) (arg0.anInt5025 * -1073021415)) != null) {
			return false;
		} else if (aClass581_15.method33217((long) (arg0.anInt5054 * -589352987)) == null) {
			if (arg0.aString224 != null) {
				if (arg0.anInt5041 * 404639277 == 0 && aBoolean320) {
					return false;
				}
				if (arg0.anInt5041 * 404639277 == 1 && aBoolean321) {
					return false;
				}
				if (arg0.anInt5041 * 404639277 == 2 && aBoolean322) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahd", name = "es", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;II)Z", line = 368)
	static boolean method12502(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (aBoolean314 && !client.aBoolean590 && !method12407(arg1.anInt1303 * -582755297, arg1.anInt1306 * 1667122095)) {
			return false;
		}
		@Pc(17) int local17 = Integer.MAX_VALUE;
		@Pc(19) int local19 = Integer.MIN_VALUE;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		if (arg2.anIntArray458 != null) {
			local17 = (arg1.anInt1303 * -582755297 + arg2.anInt5044 * 931070665 - anInt1422) * (anInt1426 - anInt1410) / (anInt1423 - anInt1422) + anInt1410;
			local19 = anInt1410 + (anInt1426 - anInt1410) * (arg1.anInt1303 * -582755297 + arg2.anInt5029 * -1797323007 - anInt1422) / (anInt1423 - anInt1422);
			local23 = anInt1427 - (arg1.anInt1306 * 1667122095 + arg2.anInt5045 * -1023948257 - anInt1424) * (anInt1427 - anInt1425) / (anInt1405 - anInt1424);
			local21 = anInt1427 - (arg1.anInt1306 * 1667122095 + arg2.anInt5037 * 294573617 - anInt1424) * (anInt1427 - anInt1425) / (anInt1405 - anInt1424);
		}
		@Pc(116) Class6 local116 = null;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(122) int local122 = 0;
		@Pc(124) int local124 = 0;
		if (arg2.anInt5026 * -2127909191 != -1) {
			if (arg1.aBoolean300 && arg2.anInt5027 * 234440891 != -1) {
				local116 = arg2.method28398(arg0, true);
			} else {
				local116 = arg2.method28398(arg0, false);
			}
			if (local116 != null) {
				local118 = arg1.anInt1305 * -7401377 - (local116.method16772() + 1 >> 1);
				if (local118 < local17) {
					local17 = local118;
				}
				local120 = arg1.anInt1305 * -7401377 + (local116.method16772() + 1 >> 1);
				if (local120 > local19) {
					local19 = local120;
				}
				local122 = arg1.anInt1308 * -891551457 - (local116.method16779() + 1 >> 1);
				if (local122 < local21) {
					local21 = local122;
				}
				local124 = arg1.anInt1308 * -891551457 + (local116.method16779() + 1 >> 1);
				if (local124 > local23) {
					local23 = local124;
				}
			}
		}
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(237) int local237 = 0;
		@Pc(239) int local239 = 0;
		if (arg2.aString224 != null) {
			Class274.method25356(arg2.anInt5041 * 404639277);
			if (Class3_Sub3.aClass14_5 != null) {
				local239 = Class340.aClass611_10.method33606(arg2.aString224, Class128.anInt3317 * 2037417253, 0, null);
				local229 = Class340.aClass611_10.method33586(arg2.aString224, Class128.anInt3317 * 2037417253, null);
				local225 = (anInt1426 - anInt1410) * arg2.anInt5050 * 1894745027 / (anInt1423 - anInt1422) + (arg1.anInt1305 * -7401377 - local229 / 2);
				local227 = arg1.anInt1308 * -891551457 - (anInt1427 - anInt1425) * arg2.anInt5051 * 1362640291 / (anInt1405 - anInt1424);
				if (local116 == null) {
					local227 -= local239 / 2;
				} else {
					local227 -= (local116.method16779() >> 1) + local239;
				}
				local231 = local225 - local229 / 2 + arg3;
				if (local231 < local17) {
					local17 = local231;
				}
				local233 = arg3 + local229 / 2 + local225;
				if (local233 > local19) {
					local19 = local233;
				}
				local235 = arg4 + local227;
				if (local235 < local21) {
					local21 = local235;
				}
				local237 = arg4 + local227 + local239;
				if (local237 > local23) {
					local23 = local237;
				}
			}
		}
		if (local19 < anInt1410 || local17 > anInt1426 || local23 < anInt1425 || local21 > anInt1427) {
			return true;
		}
		method12410(arg0, arg1, arg2);
		if (local116 != null) {
			@Pc(408) Class472 local408 = (Class472) aHashMap3.get(arg1.anInt1304 * 1865552421);
			if (local408 == null) {
				local408 = (Class472) aHashMap4.get(arg2.anInt5054 * -589352987);
			}
			if (local408 != null) {
				@Pc(444) int local444;
				if (local408.anInt5118 * 250493265 > anInt1439 * -242378493 / 2) {
					local444 = (anInt1439 * -1676973571 - local408.anInt5118 * -548726865) / (anInt1439 * -242378493);
				} else {
					local444 = local408.anInt5118 * -548726865 / (anInt1439 * -242378493);
				}
				@Pc(460) int local460 = local444 << 24 | 0xFFFF00;
				if (arg0 instanceof Class21_Sub3) {
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 7, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 7, local116.method16782() + 14, local116.method16782() + 14, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 5, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 5, local116.method16782() + 10, local116.method16782() + 10, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 3, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 3, local116.method16782() + 6, local116.method16782() + 6, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 1, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 1, local116.method16782() + 2, local116.method16782() + 2, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2, arg1.anInt1308 * -891551457 - local116.method16782() / 2, local116.method16782(), local116.method16782(), local460);
				} else {
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 7, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 5, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 3, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 1, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2, local460);
				}
			}
			local116.method16783(arg1.anInt1305 * -7401377 - (local116.method16772() >> 1), arg1.anInt1308 * -891551457 - (local116.method16779() >> 1));
		}
		if (arg2.aString224 != null && Class3_Sub3.aClass14_5 != null) {
			Class13_Sub19.method7197(arg0, arg1, arg2, local225, local227, local239, local229);
		}
		if (arg2.anInt5026 * -2127909191 != -1 || arg2.aString224 != null) {
			@Pc(764) Class3_Sub10 local764 = new Class3_Sub10(arg1);
			local764.anInt1220 = local118 * 1043141073;
			local764.anInt1214 = local120 * -1300190211;
			local764.anInt1215 = local122 * -190619361;
			local764.anInt1219 = local124 * 687886947;
			local764.anInt1217 = local231 * -120575679;
			local764.anInt1218 = local233 * 1967039075;
			local764.anInt1213 = local235 * 1579808205;
			local764.anInt1216 = local237 * 2105674693;
			Class269.aClass553_55.method32702(local764);
		}
		return false;
	}

	@OriginalMember(owner = "client!ahd", name = "eg", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;II)Z", line = 368)
	static boolean method12514(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (aBoolean314 && !client.aBoolean590 && !method12407(arg1.anInt1303 * -582755297, arg1.anInt1306 * 1667122095)) {
			return false;
		}
		@Pc(17) int local17 = Integer.MAX_VALUE;
		@Pc(19) int local19 = Integer.MIN_VALUE;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		if (arg2.anIntArray458 != null) {
			local17 = (arg1.anInt1303 * -582755297 + arg2.anInt5044 * 931070665 - anInt1422) * (anInt1426 - anInt1410) / (anInt1423 - anInt1422) + anInt1410;
			local19 = anInt1410 + (anInt1426 - anInt1410) * (arg1.anInt1303 * -582755297 + arg2.anInt5029 * -1797323007 - anInt1422) / (anInt1423 - anInt1422);
			local23 = anInt1427 - (arg1.anInt1306 * 1667122095 + arg2.anInt5045 * -1023948257 - anInt1424) * (anInt1427 - anInt1425) / (anInt1405 - anInt1424);
			local21 = anInt1427 - (arg1.anInt1306 * 1667122095 + arg2.anInt5037 * 294573617 - anInt1424) * (anInt1427 - anInt1425) / (anInt1405 - anInt1424);
		}
		@Pc(116) Class6 local116 = null;
		@Pc(118) int local118 = 0;
		@Pc(120) int local120 = 0;
		@Pc(122) int local122 = 0;
		@Pc(124) int local124 = 0;
		if (arg2.anInt5026 * -2127909191 != -1) {
			if (arg1.aBoolean300 && arg2.anInt5027 * 234440891 != -1) {
				local116 = arg2.method28398(arg0, true);
			} else {
				local116 = arg2.method28398(arg0, false);
			}
			if (local116 != null) {
				local118 = arg1.anInt1305 * -7401377 - (local116.method16772() + 1 >> 1);
				if (local118 < local17) {
					local17 = local118;
				}
				local120 = arg1.anInt1305 * -7401377 + (local116.method16772() + 1 >> 1);
				if (local120 > local19) {
					local19 = local120;
				}
				local122 = arg1.anInt1308 * -891551457 - (local116.method16779() + 1 >> 1);
				if (local122 < local21) {
					local21 = local122;
				}
				local124 = arg1.anInt1308 * -891551457 + (local116.method16779() + 1 >> 1);
				if (local124 > local23) {
					local23 = local124;
				}
			}
		}
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(237) int local237 = 0;
		@Pc(239) int local239 = 0;
		if (arg2.aString224 != null) {
			Class274.method25356(arg2.anInt5041 * 404639277);
			if (Class3_Sub3.aClass14_5 != null) {
				local239 = Class340.aClass611_10.method33606(arg2.aString224, Class128.anInt3317 * 2037417253, 0, null);
				local229 = Class340.aClass611_10.method33586(arg2.aString224, Class128.anInt3317 * 2037417253, null);
				local225 = (anInt1426 - anInt1410) * arg2.anInt5050 * 1894745027 / (anInt1423 - anInt1422) + (arg1.anInt1305 * -7401377 - local229 / 2);
				local227 = arg1.anInt1308 * -891551457 - (anInt1427 - anInt1425) * arg2.anInt5051 * 1362640291 / (anInt1405 - anInt1424);
				if (local116 == null) {
					local227 -= local239 / 2;
				} else {
					local227 -= (local116.method16779() >> 1) + local239;
				}
				local231 = local225 - local229 / 2 + arg3;
				if (local231 < local17) {
					local17 = local231;
				}
				local233 = arg3 + local229 / 2 + local225;
				if (local233 > local19) {
					local19 = local233;
				}
				local235 = arg4 + local227;
				if (local235 < local21) {
					local21 = local235;
				}
				local237 = arg4 + local227 + local239;
				if (local237 > local23) {
					local23 = local237;
				}
			}
		}
		if (local19 < anInt1410 || local17 > anInt1426 || local23 < anInt1425 || local21 > anInt1427) {
			return true;
		}
		method12410(arg0, arg1, arg2);
		if (local116 != null) {
			@Pc(408) Class472 local408 = (Class472) aHashMap3.get(arg1.anInt1304 * 1865552421);
			if (local408 == null) {
				local408 = (Class472) aHashMap4.get(arg2.anInt5054 * -589352987);
			}
			if (local408 != null) {
				@Pc(444) int local444;
				if (local408.anInt5118 * 250493265 > anInt1439 * -242378493 / 2) {
					local444 = (anInt1439 * -1676973571 - local408.anInt5118 * -548726865) / (anInt1439 * -242378493);
				} else {
					local444 = local408.anInt5118 * -548726865 / (anInt1439 * -242378493);
				}
				@Pc(460) int local460 = local444 << 24 | 0xFFFF00;
				if (arg0 instanceof Class21_Sub3) {
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 7, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 7, local116.method16782() + 14, local116.method16782() + 14, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 5, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 5, local116.method16782() + 10, local116.method16782() + 10, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 3, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 3, local116.method16782() + 6, local116.method16782() + 6, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2 - 1, arg1.anInt1308 * -891551457 - local116.method16782() / 2 - 1, local116.method16782() + 2, local116.method16782() + 2, local460);
					arg0.method17063(arg1.anInt1305 * -7401377 - local116.method16782() / 2, arg1.anInt1308 * -891551457 - local116.method16782() / 2, local116.method16782(), local116.method16782(), local460);
				} else {
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 7, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 5, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 3, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2 + 1, local460);
					arg0.method17064(arg1.anInt1305 * -7401377, arg1.anInt1308 * -891551457, local116.method16782() / 2, local460);
				}
			}
			local116.method16783(arg1.anInt1305 * -7401377 - (local116.method16772() >> 1), arg1.anInt1308 * -891551457 - (local116.method16779() >> 1));
		}
		if (arg2.aString224 != null && Class3_Sub3.aClass14_5 != null) {
			Class13_Sub19.method7197(arg0, arg1, arg2, local225, local227, local239, local229);
		}
		if (arg2.anInt5026 * -2127909191 != -1 || arg2.aString224 != null) {
			@Pc(764) Class3_Sub10 local764 = new Class3_Sub10(arg1);
			local764.anInt1220 = local118 * 1043141073;
			local764.anInt1214 = local120 * -1300190211;
			local764.anInt1215 = local122 * -190619361;
			local764.anInt1219 = local124 * 687886947;
			local764.anInt1217 = local231 * -120575679;
			local764.anInt1218 = local233 * 1967039075;
			local764.anInt1213 = local235 * 1579808205;
			local764.anInt1216 = local237 * 2105674693;
			Class269.aClass553_55.method32702(local764);
		}
		return false;
	}

	@OriginalMember(owner = "client!ahd", name = "eh", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;)V", line = 469)
	static void method12503(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2) {
		@Pc(4) Class6 local4 = arg2.method28399(arg0);
		if (local4 == null) {
			return;
		}
		@Pc(11) int local11 = local4.method16782();
		if (local4.method16787() > local11) {
			local11 = local4.method16787();
		}
		@Pc(20) byte local20 = 10;
		@Pc(25) int local25 = arg1.anInt1305 * -7401377;
		@Pc(30) int local30 = arg1.anInt1308 * -891551457;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		if (arg2.aString224 != null) {
			local34 = Class340.aClass611_10.method33606(arg2.aString224, Class128.anInt3317 * 2037417253, 0, null);
			local32 = Class340.aClass611_10.method33586(arg2.aString224, Class128.anInt3317 * 2037417253, null);
		}
		@Pc(68) int local68 = local11 / 2 + arg1.anInt1305 * -7401377;
		@Pc(73) int local73 = arg1.anInt1308 * -891551457;
		if (local25 < local11 + anInt1410) {
			local25 = anInt1410;
			local68 = anInt1410 + local11 / 2 + local20 + local32 / 2 + 5;
		} else if (local25 > anInt1426 - local11) {
			local25 = anInt1426 - local11;
			local68 = anInt1426 - local11 / 2 - local20 - local32 / 2 - 5;
		}
		if (local30 < anInt1425 + local11) {
			local30 = anInt1425;
			local73 = local11 / 2 + local20 + anInt1425;
		} else if (local30 > anInt1427 - local11) {
			local30 = anInt1427 - local11;
			local73 = anInt1427 - local11 / 2 - local20 - local34;
		}
		@Pc(176) int local176 = (int) (Math.atan2((double) (local25 - arg1.anInt1305 * -7401377), (double) (local30 - arg1.anInt1308 * -891551457)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local4.method16792((float) local25 + (float) local11 / 2.0F, (float) local11 / 2.0F + (float) local30, 4096, local176);
		@Pc(196) int local196 = -2;
		@Pc(198) int local198 = -2;
		@Pc(200) int local200 = -2;
		@Pc(202) int local202 = -2;
		if (arg2.aString224 != null) {
			local196 = local68 - local32 / 2 - 5;
			local198 = local73;
			local200 = local32 + local196 + 10;
			local202 = local34 + 3 + local73;
			if (arg2.anInt5034 * -1874290321 != 0) {
				arg0.method17063(local196, local73, local200 - local196, local202 - local73, arg2.anInt5034 * -1874290321);
			}
			if (arg2.anInt5035 * -329291339 != 0) {
				arg0.method17062(local196, local73, local200 - local196, local202 - local73, arg2.anInt5035 * -329291339);
			}
			Class3_Sub3.aClass14_5.method3283(arg2.aString224, local68, local73, local32, local34, arg2.anInt5040 * 985187229 | 0xFF000000, aClass484_2.anInt5177 * -260489881, 1, 0, 0, null, null, null, 0, 0);
		}
		if (arg2.anInt5026 * -2127909191 == -1 && arg2.aString224 == null) {
			return;
		}
		@Pc(311) Class3_Sub10 local311 = new Class3_Sub10(arg1);
		local11 >>= 0x1;
		local311.anInt1220 = (local25 - local11) * 1043141073;
		local311.anInt1214 = (local25 + local11) * -1300190211;
		local311.anInt1215 = (local30 - local11) * -190619361;
		local311.anInt1219 = (local11 + local30) * 687886947;
		local311.anInt1217 = local196 * -120575679;
		local311.anInt1218 = local200 * 1967039075;
		local311.anInt1213 = local198 * 1579808205;
		local311.anInt1216 = local202 * 2105674693;
		Class269.aClass553_55.method32702(local311);
	}

	@OriginalMember(owner = "client!ahd", name = "ft", descriptor = "(I)V", line = 533)
	static void method12504(@OriginalArg(0) int arg0) {
		@Pc(3) byte local3;
		if (arg0 == 0) {
			local3 = 0;
		} else if (arg0 == 1) {
			local3 = 1;
		} else if (arg0 == 2) {
			local3 = 2;
		} else {
			return;
		}
		@Pc(24) byte local24;
		if ((double) aFloat148 == 3.0D) {
			local24 = 0;
		} else if ((double) aFloat148 == 4.0D) {
			local24 = 1;
		} else if ((double) aFloat148 == 6.0D) {
			local24 = 2;
		} else if ((double) aFloat148 >= 8.0D) {
			local24 = 3;
		} else {
			return;
		}
		Class3_Sub3.aClass14_5 = aClass14ArrayArray1[local3][local24];
		Class340.aClass611_10 = aClass611ArrayArray1[local3][local24];
	}

	@OriginalMember(owner = "client!ahd", name = "fp", descriptor = "(I)V", line = 533)
	static void method12538(@OriginalArg(0) int arg0) {
		@Pc(3) byte local3;
		if (arg0 == 0) {
			local3 = 0;
		} else if (arg0 == 1) {
			local3 = 1;
		} else if (arg0 == 2) {
			local3 = 2;
		} else {
			return;
		}
		@Pc(24) byte local24;
		if ((double) aFloat148 == 3.0D) {
			local24 = 0;
		} else if ((double) aFloat148 == 4.0D) {
			local24 = 1;
		} else if ((double) aFloat148 == 6.0D) {
			local24 = 2;
		} else if ((double) aFloat148 >= 8.0D) {
			local24 = 3;
		} else {
			return;
		}
		Class3_Sub3.aClass14_5 = aClass14ArrayArray1[local3][local24];
		Class340.aClass611_10 = aClass611ArrayArray1[local3][local24];
	}

	@OriginalMember(owner = "client!ahd", name = "fn", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;IIII)V", line = 551)
	static void method12489(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg3 - arg6 / 2 - 5;
		@Pc(11) int local11 = arg4 + 2;
		if (arg2.anInt5034 * -1874290321 != 0) {
			arg0.method17063(local7, local11, arg6 + 10, arg4 + arg5 - local11 + 1, arg2.anInt5034 * -1874290321);
		}
		if (arg2.anInt5035 * -329291339 != 0) {
			arg0.method17062(local7, local11, arg6 + 10, arg4 + arg5 - local11 + 1, arg2.anInt5035 * -329291339);
		}
		@Pc(64) int local64 = arg2.anInt5040 * 985187229;
		if (arg1.aBoolean300 && arg2.anInt5030 * 608289279 != -1) {
			local64 = arg2.anInt5030 * 608289279;
		}
		Class3_Sub3.aClass14_5.method3283(arg2.aString224, arg3, arg4, arg6, arg5, local64 | 0xFF000000, aClass484_2.anInt5177 * -260489881, 1, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!ahd", name = "fm", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;IIII)V", line = 551)
	static void method12506(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg3 - arg6 / 2 - 5;
		@Pc(11) int local11 = arg4 + 2;
		if (arg2.anInt5034 * -1874290321 != 0) {
			arg0.method17063(local7, local11, arg6 + 10, arg4 + arg5 - local11 + 1, arg2.anInt5034 * -1874290321);
		}
		if (arg2.anInt5035 * -329291339 != 0) {
			arg0.method17062(local7, local11, arg6 + 10, arg4 + arg5 - local11 + 1, arg2.anInt5035 * -329291339);
		}
		@Pc(64) int local64 = arg2.anInt5040 * 985187229;
		if (arg1.aBoolean300 && arg2.anInt5030 * 608289279 != -1) {
			local64 = arg2.anInt5030 * 608289279;
		}
		Class3_Sub3.aClass14_5.method3283(arg2.aString224, arg3, arg4, arg6, arg5, local64 | 0xFF000000, aClass484_2.anInt5177 * -260489881, 1, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!ahd", name = "fs", descriptor = "(Lclient!de;IIII)V", line = 561)
	static final void method12527(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method17079(arg1, arg2, arg1 + arg3, arg2 + arg4);
		arg0.method17063(arg1, arg2, arg3, arg4, -16777216);
		if (anInt1434 * 1235407417 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) anInt1408 / (float) anInt1407;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class381.aClass6_28 == null || Class381.aClass6_28.method16782() != local31 || Class381.aClass6_28.method16787() != local33) {
			aClass161_9 = aClass161_7;
			method12399(anInt1429, anInt1406 + anInt1408, anInt1407 + anInt1429, anInt1406, local58, local66, local31 + local58, local33 + local66);
			method12400(arg0, false, false, client.aBoolean590, true);
			arg0.method17028();
			Class381.aClass6_28 = arg0.method17090(local58, local66, local31, local33, true);
		}
		Class381.aClass6_28.method16783(local58, local66);
		@Pc(123) int local123 = Class463.anInt5070 * 469310261 * local31 / anInt1407;
		@Pc(131) int local131 = local33 * -1063851471 * Class237.anInt3749 / anInt1408;
		@Pc(141) int local141 = local58 + Class177.anInt3475 * 1948318155 * local31 / anInt1407;
		@Pc(155) int local155 = local66 + local33 - Class408.anInt4816 * -1004030139 * local33 / anInt1408 - local131;
		@Pc(157) int local157 = -1996554240;
		if (client.aClass543_2 == Class543.aClass543_5) {
			local157 = -1996488705;
		}
		arg0.method17050(local141, local155, local123, local131, local157, 1);
		arg0.method17068(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class3_Sub26 local183 = (Class3_Sub26) aClass553_23.method32768(); local183 != null; local183 = (Class3_Sub26) aClass553_23.method32709()) {
			@Pc(194) Class452 local194 = aClass454_2.method28448(local183.anInt1304 * 1865552421);
			if (Class44_Sub1.method8406(local194)) {
				@Pc(208) Class472 local208 = (Class472) aHashMap3.get(local183.anInt1304 * 1865552421);
				if (local208 == null) {
					local208 = (Class472) aHashMap4.get(local194.anInt5054 * -589352987);
				}
				if (local208 != null) {
					@Pc(245) int local245;
					if (local208.anInt5118 * 250493265 > anInt1439 * -242378493 / 2) {
						local245 = (anInt1439 * -1676973571 - local208.anInt5118 * -548726865) / (anInt1439 * -242378493);
					} else {
						local245 = local208.anInt5118 * -548726865 / (anInt1439 * -242378493);
					}
					@Pc(266) int local266 = local58 + local183.anInt1303 * -582755297 * local31 / anInt1407;
					@Pc(279) int local279 = local66 + (anInt1408 - local183.anInt1306 * 1667122095) * local33 / anInt1408;
					arg0.method17063(local266 - 2, local279 - 2, 4, 4, local245 << 24 | 0xFFFF00);
				}
			}
		}
		aClass161_7.method23240(5);
	}

	@OriginalMember(owner = "client!ahd", name = "fx", descriptor = "(IIIZ)V", line = 696)
	public static void method12509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class3_Sub1_Sub4 local1 = aClass3_Sub1_Sub4_2;
		method12402(arg0);
		aBoolean315 = false;
		if (aClass3_Sub1_Sub4_2 != local1) {
			Class473.method28782();
		}
		anInt1430 = arg1 * -151931519;
		anInt1442 = arg2 * 1679987289;
		aBoolean318 = arg3;
	}

	@OriginalMember(owner = "client!ahd", name = "fh", descriptor = "(IIIZ)V", line = 696)
	public static void method12510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class3_Sub1_Sub4 local1 = aClass3_Sub1_Sub4_2;
		method12402(arg0);
		aBoolean315 = false;
		if (aClass3_Sub1_Sub4_2 != local1) {
			Class473.method28782();
		}
		anInt1430 = arg1 * -151931519;
		anInt1442 = arg2 * 1679987289;
		aBoolean318 = arg3;
	}

	@OriginalMember(owner = "client!ahd", name = "fu", descriptor = "()V", line = 708)
	public static void method12511() {
		Class591.method33334(true);
	}

	@OriginalMember(owner = "client!ahd", name = "fg", descriptor = "()Lclient!amh;", line = 712)
	public static Class3_Sub1_Sub4 method12501() {
		return aClass3_Sub1_Sub4_2;
	}

	@OriginalMember(owner = "client!ahd", name = "fd", descriptor = "()Lclient!amh;", line = 712)
	public static Class3_Sub1_Sub4 method12505() {
		return aClass3_Sub1_Sub4_2;
	}

	@OriginalMember(owner = "client!ahd", name = "fb", descriptor = "()Lclient!amh;", line = 712)
	public static Class3_Sub1_Sub4 method12513() {
		return aClass3_Sub1_Sub4_2;
	}

	@OriginalMember(owner = "client!ahd", name = "fz", descriptor = "()Lclient!amh;", line = 712)
	public static Class3_Sub1_Sub4 method12515() {
		return aClass3_Sub1_Sub4_2;
	}

	@OriginalMember(owner = "client!ahd", name = "fv", descriptor = "(Z)V", line = 716)
	static void method12516(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class464 local3 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16663();
		@Pc(13) Class3_Sub1_Sub4 local13 = method12460(local3.anInt5071 * -1567811631, local3.anInt5073 * 1360175441);
		if (local13 == null) {
			local13 = method12390(aClass484_2.anInt5176 * 1068120557);
		}
		if (Class179.aClass3_Sub1_Sub4_3 == local13 && !arg0) {
			return;
		}
		Class179.aClass3_Sub1_Sub4_3 = local13;
		@Pc(32) boolean local32 = method12436(local13);
		if (local32) {
			aBoolean315 = true;
			Class473.method28782();
		}
	}

	@OriginalMember(owner = "client!ahd", name = "fy", descriptor = "(Z)V", line = 716)
	static void method12517(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class464 local3 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16663();
		@Pc(13) Class3_Sub1_Sub4 local13 = method12460(local3.anInt5071 * -1567811631, local3.anInt5073 * 1360175441);
		if (local13 == null) {
			local13 = method12390(aClass484_2.anInt5176 * 1068120557);
		}
		if (Class179.aClass3_Sub1_Sub4_3 == local13 && !arg0) {
			return;
		}
		Class179.aClass3_Sub1_Sub4_3 = local13;
		@Pc(32) boolean local32 = method12436(local13);
		if (local32) {
			aBoolean315 = true;
			Class473.method28782();
		}
	}

	@OriginalMember(owner = "client!ahd", name = "fe", descriptor = "(Z)V", line = 716)
	static void method12518(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class464 local3 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16663();
		@Pc(13) Class3_Sub1_Sub4 local13 = method12460(local3.anInt5071 * -1567811631, local3.anInt5073 * 1360175441);
		if (local13 == null) {
			local13 = method12390(aClass484_2.anInt5176 * 1068120557);
		}
		if (Class179.aClass3_Sub1_Sub4_3 == local13 && !arg0) {
			return;
		}
		Class179.aClass3_Sub1_Sub4_3 = local13;
		@Pc(32) boolean local32 = method12436(local13);
		if (local32) {
			aBoolean315 = true;
			Class473.method28782();
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ff", descriptor = "(I)V", line = 730)
	static void method12498(@OriginalArg(0) int arg0) {
		Class485.anInt5182 = arg0 * -1310727029;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "fw", descriptor = "(I)V", line = 730)
	static void method12519(@OriginalArg(0) int arg0) {
		Class485.anInt5182 = arg0 * -1310727029;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "fo", descriptor = "(I)V", line = 730)
	static void method12520(@OriginalArg(0) int arg0) {
		Class485.anInt5182 = arg0 * -1310727029;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "fk", descriptor = "(I)V", line = 730)
	static void method12522(@OriginalArg(0) int arg0) {
		Class485.anInt5182 = arg0 * -1310727029;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "fl", descriptor = "(I)V", line = 730)
	static void method12541(@OriginalArg(0) int arg0) {
		Class485.anInt5182 = arg0 * -1310727029;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "fj", descriptor = "(I)V", line = 737)
	static void method12523(@OriginalArg(0) int arg0) {
		Class161.anInt3445 = arg0 * 634470607;
		anInt1435 = 1239823265;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "fa", descriptor = "(I)V", line = 737)
	static void method12524(@OriginalArg(0) int arg0) {
		Class161.anInt3445 = arg0 * 634470607;
		anInt1435 = 1239823265;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "fq", descriptor = "(I)V", line = 744)
	public static void method12525(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			aFloat148 = 3.0F;
		} else if (arg0 == 50) {
			aFloat148 = 4.0F;
		} else if (arg0 == 75) {
			aFloat148 = 6.0F;
		} else if (arg0 == 100) {
			aFloat148 = 8.0F;
		} else if (arg0 == 200) {
			aFloat148 = 16.0F;
		}
		anInt1435 = 1239823265;
		anInt1435 = 1239823265;
	}

	@OriginalMember(owner = "client!ahd", name = "fc", descriptor = "(I)V", line = 744)
	public static void method12526(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			aFloat148 = 3.0F;
		} else if (arg0 == 50) {
			aFloat148 = 4.0F;
		} else if (arg0 == 75) {
			aFloat148 = 6.0F;
		} else if (arg0 == 100) {
			aFloat148 = 8.0F;
		} else if (arg0 == 200) {
			aFloat148 = 16.0F;
		}
		anInt1435 = 1239823265;
		anInt1435 = 1239823265;
	}

	@OriginalMember(owner = "client!ahd", name = "fi", descriptor = "(I)V", line = 744)
	public static void method12537(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			aFloat148 = 3.0F;
		} else if (arg0 == 50) {
			aFloat148 = 4.0F;
		} else if (arg0 == 75) {
			aFloat148 = 6.0F;
		} else if (arg0 == 100) {
			aFloat148 = 8.0F;
		} else if (arg0 == 200) {
			aFloat148 = 16.0F;
		}
		anInt1435 = 1239823265;
		anInt1435 = 1239823265;
	}

	@OriginalMember(owner = "client!ahd", name = "fr", descriptor = "(IIII)V", line = 754)
	static void method12485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1408 / (float) anInt1407;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class485.anInt5182 = anInt1407 * local34 / local7 * -1310727029;
		Class161.anInt3445 = (anInt1408 - local42 * anInt1408 / local9) * 634470607;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "gf", descriptor = "(IIII)V", line = 754)
	static void method12492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1408 / (float) anInt1407;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class485.anInt5182 = anInt1407 * local34 / local7 * -1310727029;
		Class161.anInt3445 = (anInt1408 - local42 * anInt1408 / local9) * 634470607;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "gp", descriptor = "(IIII)V", line = 754)
	static void method12494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1408 / (float) anInt1407;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class485.anInt5182 = anInt1407 * local34 / local7 * -1310727029;
		Class161.anInt3445 = (anInt1408 - local42 * anInt1408 / local9) * 634470607;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "gy", descriptor = "(IIII)V", line = 754)
	static void method12528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1408 / (float) anInt1407;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class485.anInt5182 = anInt1407 * local34 / local7 * -1310727029;
		Class161.anInt3445 = (anInt1408 - local42 * anInt1408 / local9) * 634470607;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "ge", descriptor = "(IIII)V", line = 754)
	static void method12532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1408 / (float) anInt1407;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class485.anInt5182 = anInt1407 * local34 / local7 * -1310727029;
		Class161.anInt3445 = (anInt1408 - local42 * anInt1408 / local9) * 634470607;
		anInt1437 = -481951965;
		anInt1435 = 1239823265;
		Class538.method32566();
	}

	@OriginalMember(owner = "client!ahd", name = "gj", descriptor = "(I)V", line = 793)
	public static void method12533(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1438 = anInt1440 * 1182966379;
		} else {
			anInt1438 = arg0 * 1699591869;
		}
	}

	@OriginalMember(owner = "client!ahd", name = "gd", descriptor = "(I)V", line = 798)
	public static void method12534(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1439 = anInt1433 * 956783367;
		} else {
			anInt1439 = arg0 * 883464619;
		}
	}

	@OriginalMember(owner = "client!ahd", name = "gm", descriptor = "(Z)V", line = 803)
	public static void method12496(@OriginalArg(0) boolean arg0) {
		aBoolean316 = arg0;
	}

	@OriginalMember(owner = "client!ahd", name = "gn", descriptor = "(Z)V", line = 803)
	public static void method12536(@OriginalArg(0) boolean arg0) {
		aBoolean316 = arg0;
	}

	@OriginalMember(owner = "client!ahd", name = "gh", descriptor = "(III)I", line = 812)
	public static int method12493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (anInt1434 * 1235407417 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - anInt1429;
		@Pc(18) int local18 = arg2 - anInt1406;
		for (@Pc(23) Class3_Sub26 local23 = (Class3_Sub26) aClass553_23.method32768(); local23 != null; local23 = (Class3_Sub26) aClass553_23.method32709()) {
			if (arg0 == local23.anInt1304 * 1865552421) {
				@Pc(38) int local38 = local23.anInt1303 * -582755297;
				@Pc(43) int local43 = local23.anInt1306 * 1667122095;
				@Pc(53) int local53 = anInt1429 + local38 << 14 | anInt1406 + local43;
				@Pc(69) int local69 = (local18 - local43) * (local18 - local43) + (local14 - local38) * (local14 - local38);
				if (local8 < 0 || local69 < local10) {
					local8 = local53;
					local10 = local69;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ahd", name = "gv", descriptor = "(III)I", line = 812)
	public static int method12508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (anInt1434 * 1235407417 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - anInt1429;
		@Pc(18) int local18 = arg2 - anInt1406;
		for (@Pc(23) Class3_Sub26 local23 = (Class3_Sub26) aClass553_23.method32768(); local23 != null; local23 = (Class3_Sub26) aClass553_23.method32709()) {
			if (arg0 == local23.anInt1304 * 1865552421) {
				@Pc(38) int local38 = local23.anInt1303 * -582755297;
				@Pc(43) int local43 = local23.anInt1306 * 1667122095;
				@Pc(53) int local53 = anInt1429 + local38 << 14 | anInt1406 + local43;
				@Pc(69) int local69 = (local18 - local43) * (local18 - local43) + (local14 - local38) * (local14 - local38);
				if (local8 < 0 || local69 < local10) {
					local8 = local53;
					local10 = local69;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ahd", name = "gz", descriptor = "(III)I", line = 812)
	public static int method12539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (anInt1434 * 1235407417 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - anInt1429;
		@Pc(18) int local18 = arg2 - anInt1406;
		for (@Pc(23) Class3_Sub26 local23 = (Class3_Sub26) aClass553_23.method32768(); local23 != null; local23 = (Class3_Sub26) aClass553_23.method32709()) {
			if (arg0 == local23.anInt1304 * 1865552421) {
				@Pc(38) int local38 = local23.anInt1303 * -582755297;
				@Pc(43) int local43 = local23.anInt1306 * 1667122095;
				@Pc(53) int local53 = anInt1429 + local38 << 14 | anInt1406 + local43;
				@Pc(69) int local69 = (local18 - local43) * (local18 - local43) + (local14 - local38) * (local14 - local38);
				if (local8 < 0 || local69 < local10) {
					local8 = local53;
					local10 = local69;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ahd", name = "gq", descriptor = "()Lclient!agk;", line = 832)
	public static Class3_Sub26 method12540() {
		if (aClass553_23 == null || aClass554_1 == null) {
			return null;
		}
		aClass554_1.method32775(aClass553_23);
		@Pc(15) Class3_Sub26 local15 = (Class3_Sub26) aClass554_1.method32778();
		if (local15 == null) {
			return null;
		} else {
			@Pc(27) Class452 local27 = aClass454_2.method28448(local15.anInt1304 * 1865552421);
			return local27 != null && local27.aBoolean776 && local27.method28402(anInterface9_2, anInterface8_2) ? local15 : Class340.method26441();
		}
	}

	@OriginalMember(owner = "client!ahd", name = "gt", descriptor = "()Lclient!agk;", line = 842)
	public static Class3_Sub26 method12521() {
		if (aClass553_23 == null || aClass554_1 == null) {
			return null;
		}
		for (@Pc(9) Class3_Sub26 local9 = (Class3_Sub26) aClass554_1.next(); local9 != null; local9 = (Class3_Sub26) aClass554_1.next()) {
			@Pc(19) Class452 local19 = aClass454_2.method28448(local9.anInt1304 * 1865552421);
			if (local19 != null && local19.aBoolean776 && local19.method28402(anInterface9_2, anInterface8_2)) {
				return local9;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ahd", name = "ga", descriptor = "(II)V", line = 853)
	public static void method12507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1437 = (arg0 - anInt1429) * 481951965;
		anInt1435 = (arg1 - anInt1406) * -1239823265;
	}
}
