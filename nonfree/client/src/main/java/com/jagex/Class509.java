package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public class Class509 {

	@OriginalMember(owner = "client!up", name = "p", descriptor = "Lclient!amj;")
	Class3_Sub1_Sub6 aClass3_Sub1_Sub6_1;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "[I")
	int[] anIntArray489;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray40;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "[J")
	long[] aLongArray16;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "I")
	int anInt5257 = 1498171261;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V", line = 12)
	Class509() {
	}

	@OriginalMember(owner = "client!up", name = "ce", descriptor = "(Lclient!de;Lclient!ds;I)V", line = 89)
	static final void method29575(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class134 arg1) {
		if (Class58_Sub1.anInt1434 * 1235407417 == 100 || Class58_Sub1.aClass3_Sub1_Sub4_2 == null) {
			return;
		}
		Class176.method23413();
		Class176.method23413();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (Class58_Sub1.anInt1434 * 1235407417 < 10) {
			for (local20 = 0; local20 < Class58_Sub1.aClass14ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < Class58_Sub1.aClass14ArrayArray1[local20].length; local26++) {
					Class294.aClass359_54.method26674(Class58_Sub1.aClass484_2.anIntArrayArray58[local20][local26]);
					Class475.aClass359_86.method26674(Class58_Sub1.aClass484_2.anIntArrayArray58[local20][local26]);
				}
			}
			if (!Class58_Sub1.aClass359_20.method26694(Class58_Sub1.aClass3_Sub1_Sub4_2.aString106)) {
				Class58_Sub1.anInt1434 = Class579.aClass359_102.method26689(Class58_Sub1.aClass3_Sub1_Sub4_2.aString106) / 10 * -1693746167;
				return;
			}
			Class58_Sub1.anInt1434 = 242407514;
		}
		if (Class58_Sub1.anInt1434 * 1235407417 == 10) {
			Class58_Sub1.anInt1429 = Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2652 * 1214831777 >> 6 << 6;
			Class58_Sub1.anInt1406 = Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2654 * 1120229487 >> 6 << 6;
			Class58_Sub1.anInt1407 = (Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2653 * 363486565 >> 6 << 6) - Class58_Sub1.anInt1429 + 64;
			Class58_Sub1.anInt1408 = (Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2655 * -1121810567 >> 6 << 6) - Class58_Sub1.anInt1406 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class320 local135 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
			@Pc(139) Class464 local139 = client.aClass370_1.method26942();
			if (Class58_Sub1.aClass3_Sub1_Sub4_2.method18896(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, ((int) local135.aFloat259 >> 9) + local139.anInt5071 * -1567811631, ((int) local135.aFloat261 >> 9) + local139.anInt5073 * 1360175441, local127)) {
				local26 = local127[1] - Class58_Sub1.anInt1429;
				local131 = local127[2] - Class58_Sub1.anInt1406;
			}
			if (!Class58_Sub1.aBoolean318 && local26 >= 0 && local26 < Class58_Sub1.anInt1407 && local131 >= 0 && local131 < Class58_Sub1.anInt1408) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class485.anInt5182 = local26 * -1310727029;
				Class161.anInt3445 = local131 * 634470607;
			} else if (Class58_Sub1.anInt1430 * 173836929 == -1 || Class58_Sub1.anInt1442 * 1322489321 == -1) {
				Class58_Sub1.aClass3_Sub1_Sub4_2.method18902(Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2650 * -13600129 >> 14 & 0x3FFF, Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2650 * -13600129 & 0x3FFF, local127);
				Class485.anInt5182 = (local127[1] - Class58_Sub1.anInt1429) * -1310727029;
				Class161.anInt3445 = (local127[2] - Class58_Sub1.anInt1406) * 634470607;
			} else {
				Class58_Sub1.aClass3_Sub1_Sub4_2.method18902(Class58_Sub1.anInt1430 * 173836929, Class58_Sub1.anInt1442 * 1322489321, local127);
				if (local127 != null) {
					Class485.anInt5182 = (local127[1] - Class58_Sub1.anInt1429) * -1310727029;
					Class161.anInt3445 = (local127[2] - Class58_Sub1.anInt1406) * 634470607;
				}
				Class58_Sub1.anInt1442 = -1679987289;
				Class58_Sub1.anInt1430 = 151931519;
				Class58_Sub1.aBoolean318 = false;
			}
			if (Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 37) {
				Class58_Sub1.aFloat149 = 3.0F;
				Class58_Sub1.aFloat148 = 3.0F;
			} else if (Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 50) {
				Class58_Sub1.aFloat149 = 4.0F;
				Class58_Sub1.aFloat148 = 4.0F;
			} else if (Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 75) {
				Class58_Sub1.aFloat149 = 6.0F;
				Class58_Sub1.aFloat148 = 6.0F;
			} else if (Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 100) {
				Class58_Sub1.aFloat149 = 8.0F;
				Class58_Sub1.aFloat148 = 8.0F;
			} else if (Class58_Sub1.aClass3_Sub1_Sub4_2.anInt2648 * -897670753 == 200) {
				Class58_Sub1.aFloat149 = 16.0F;
				Class58_Sub1.aFloat148 = 16.0F;
			} else {
				Class58_Sub1.aFloat149 = 8.0F;
				Class58_Sub1.aFloat148 = 8.0F;
			}
			Class58_Sub1.anInt1403 = (int) Class58_Sub1.aFloat148 >> 1;
			Class58_Sub1.aByteArrayArrayArray10 = Class377.method27243(Class58_Sub1.anInt1403);
			Class538.method32566();
			Class58_Sub1.method12385();
			Class269.aClass553_55 = new Class553();
			Class58_Sub1.anInt1401 += (int) (Math.random() * 5.0D) - 2;
			if (Class58_Sub1.anInt1401 < -8) {
				Class58_Sub1.anInt1401 = -8;
			}
			if (Class58_Sub1.anInt1401 > 8) {
				Class58_Sub1.anInt1401 = 8;
			}
			Class58_Sub1.anInt1402 += (int) (Math.random() * 5.0D) - 2;
			if (Class58_Sub1.anInt1402 < -16) {
				Class58_Sub1.anInt1402 = -16;
			}
			if (Class58_Sub1.anInt1402 > 16) {
				Class58_Sub1.anInt1402 = 16;
			}
			Class58_Sub1.method12426(arg1, Class58_Sub1.anInt1401 >> 2 << 10, Class58_Sub1.anInt1402 >> 1);
			Class58_Sub1.aClass454_2.method28439(1024, 256);
			Class58_Sub1.aClass629_2.method33839(256, 256);
			Class58_Sub1.aClass457_7.method28492(4096);
			Class308.aClass70_Sub2_3.method33887(256);
			Class58_Sub1.anInt1434 = 484815028;
		} else if (Class58_Sub1.anInt1434 * 1235407417 == 20) {
			if (!Class58_Sub1.aBoolean315) {
				Class110.method22005(true);
				Class58_Sub1.method12405(arg0, Class58_Sub1.anInt1401, Class58_Sub1.anInt1402, Class58_Sub1.aBoolean315);
				Class58_Sub1.anInt1434 = 1454445084;
				Class110.method22005(true);
				Class148.method23113();
			} else if (Class58_Sub1.method12405(arg0, Class58_Sub1.anInt1401, Class58_Sub1.anInt1402, Class58_Sub1.aBoolean315)) {
				Class58_Sub1.anInt1434 = 1454445084;
			}
		} else if (Class58_Sub1.anInt1434 * 1235407417 == 60) {
			if (Class58_Sub1.aClass359_20.method26681(Class58_Sub1.aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
				if (!Class58_Sub1.aClass359_20.method26694(Class58_Sub1.aClass3_Sub1_Sub4_2.aString106 + "_staticelements")) {
					return;
				}
				Class58_Sub1.aClass421_2 = Class191.method24060(Class58_Sub1.aClass359_20, Class58_Sub1.aClass3_Sub1_Sub4_2.aString106 + "_staticelements", client.aBoolean590);
			} else {
				Class58_Sub1.aClass421_2 = new Class421(0);
			}
			Class58_Sub1.method12398();
			Class58_Sub1.anInt1434 = 1696852598;
			Class110.method22005(true);
			Class148.method23113();
		} else if (Class58_Sub1.anInt1434 * 1235407417 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					Class58_Sub1.anInt1434 = -1870892156;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 4; local26++) {
					if (Class58_Sub1.aClass14ArrayArray1[local20][local26] == null || Class58_Sub1.aClass611ArrayArray1[local20][local26] == null) {
						Class58_Sub1.aClass14ArrayArray1[local20][local26] = (Class14) Class379.aClass312_1.method25785(client.anInterface34_1, Class58_Sub1.aClass484_2.anIntArrayArray58[local20][local26], true, true);
						Class58_Sub1.aClass611ArrayArray1[local20][local26] = Class179.method23534(Class475.aClass359_86, Class58_Sub1.aClass484_2.anIntArrayArray58[local20][local26]);
						if (Class58_Sub1.aClass14ArrayArray1[local20][local26] == null || Class58_Sub1.aClass611ArrayArray1[local20][local26] == null) {
							return;
						}
						Class58_Sub1.anInt1434 += -786271205;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "hv", descriptor = "(Lclient!vs;I)V", line = 5471)
	static final void method29571(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class451.method28390(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!up", name = "wn", descriptor = "(Lclient!vs;I)V", line = 8245)
	static final void method29573(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(19) Class3_Sub23 local19 = Class269.method25284(Class311.aClass311_39, client.aClass82_1.aClass577_2);
		local19.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(local13));
		local19.aClass3_Sub41_Sub1_1.method20260(local13);
		client.aClass82_1.method21601(local19);
	}

	@OriginalMember(owner = "client!up", name = "afj", descriptor = "(Lclient!vs;B)V", line = 9950)
	static final void method29572(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(15) Class3_Sub1_Sub4 local15 = Class58.method12390(local12);
		if (local15 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anInt2653 * 363486565 - local15.anInt2652 * 1214831777;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anInt2655 * -1121810567 - local15.anInt2654 * 1120229487;
		}
	}

	@OriginalMember(owner = "client!up", name = "ahn", descriptor = "(Lclient!vs;I)V", line = 10384)
	static final void method29574(@OriginalArg(0) Class536 arg0) {
		@Pc(1) String local1 = null;
		if (Class128.aClass140_1 != null) {
			local1 = Class128.aClass140_1.method23015();
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local1;
	}
}
