import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
	public static int anInt2094;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array8;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
	public static int anInt2108;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	public static int anInt2085 = 1;

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
	public static int anInt2089 = -1;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "S")
	public static short aShort22 = 1;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_782 = Static161.method2452("Freie Welt");

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_783 = Static161.method2452("<col=ffff00>");

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "S")
	public static short aShort23 = 1;

	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
	public static int anInt2103 = -1;

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_784 = Static161.method2452("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "[I")
	public static final int[] anIntArray207 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	public static void method1641() {
		Static79.method1387();
		Static14.method256();
		Static201.method1366();
		Static118.method2461();
		Static121.method1915();
		Static111.method1766();
		Static127.method1972();
		Static67.method3015();
		Static135.method2100();
		Static185.method2810();
		Static116.method1866();
		Static192.method2856();
		((Class89) Static149.anInterface1_10).method2493();
		Static142.aClass8_28.method233();
		Static38.aClass23_Sub1_4.method742();
		Static48.aClass23_Sub1_6.method742();
		Static177.aClass23_Sub1_24.method742();
		Static60.aClass23_Sub1_9.method742();
		Static161.aClass23_Sub1_21.method742();
		Static59.aClass23_Sub1_7.method742();
		Static130.aClass23_Sub1_15.method742();
		Static186.aClass23_Sub1_26.method742();
		Static141.aClass23_Sub1_20.method742();
		Static16.aClass23_Sub1_3.method742();
		Static130.aClass23_Sub1_16.method742();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method1643(@OriginalArg(1) Class23 arg0) {
		Static191.aClass23_72 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
	public static void method1649() {
		if (Static44.aClass20_339 == null) {
			return;
		}
		if (Static144.anInt2995 < 10) {
			if (!Static48.aClass23_Sub1_5.method755(Static44.aClass20_339)) {
				Static144.anInt2995 = Static48.aClass23_Sub1_5.method735(Static44.aClass20_339) / 10;
				return;
			}
			Static144.anInt2995 = 10;
		}
		if (Static144.anInt2995 == 10) {
			@Pc(42) Class5_Sub6 local42 = new Class5_Sub6(Static48.aClass23_Sub1_5.method730(Static44.aClass20_339, Static169.aClass20_1253));
			@Pc(46) int local46 = local42.method3077();
			@Pc(50) int local50 = local42.method3077();
			@Pc(54) int local54 = local42.method3077();
			@Pc(58) int local58 = local42.method3077();
			@Pc(62) int local62 = local42.method3077();
			@Pc(66) int local66 = local42.method3077();
			Static216.aDouble11 = 8.0D;
			Static29.aDouble1 = 8.0D;
			Static207.anInt4070 = local46 * 64;
			Static165.anInt2257 = (local58 + 1 - local50) * 64;
			@Pc(92) int local92 = Static86.anInt1895 + (Static210.aClass1_Sub2_Sub2_2.anInt2241 >> 7) - Static207.anInt4070;
			Static131.anInt2727 = (local54 - local46) * 64 + 64;
			@Pc(110) int local110 = local92 + (int) (Math.random() * 10.0D) - 5;
			@Pc(114) int local114 = Static131.anInt2727 >> 6;
			Static36.anIntArray45 = new int[Static197.anInt3849 + 1];
			@Pc(123) int local123 = Static165.anInt2257 >> 6;
			Static94.aByteArrayArrayArray7 = new byte[local114][local123][];
			Static62.aByteArrayArrayArray4 = new byte[local114][local123][];
			Static200.aByteArrayArrayArray15 = new byte[local114][local123][];
			Static207.anIntArrayArrayArray13 = new int[local114][local123][];
			Static93.anIntArrayArrayArray9 = new int[local114][local123][];
			Static59.anInt1331 = local50 * 64;
			Static106.aByteArrayArrayArray8 = new byte[local114][local123][];
			Static28.aByteArrayArrayArray1 = new byte[local114][local123][];
			Static160.aByteArrayArrayArray12 = new byte[local114][local123][];
			@Pc(165) int local165 = Static68.anInt1481 >> 2 << 10;
			@Pc(175) int local175 = Static110.anInt2295 + (Static210.aClass1_Sub2_Sub2_2.anInt2234 >> 7) - Static59.anInt1331;
			@Pc(184) int local184 = local175 + (int) (Math.random() * 10.0D) - 5;
			if (local110 >= 0 && Static131.anInt2727 > local110 && local184 >= 0 && Static165.anInt2257 > local184) {
				Static212.anInt4113 = local110;
				Static18.anInt354 = Static165.anInt2257 - local184;
			} else {
				Static212.anInt4113 = local62 * 64 - Static207.anInt4070;
				Static18.anInt354 = Static165.anInt2257 + Static59.anInt1331 - local66 * 64;
			}
			@Pc(226) int local226 = Static123.anInt2610 >> 1;
			for (@Pc(228) int local228 = 0; local228 < Static197.anInt3849; local228++) {
				@Pc(234) Class5_Sub2_Sub4 local234 = Static114.method496(local228);
				if (local234 != null) {
					@Pc(239) int local239 = local234.anInt229;
					if (local239 >= 0 && !Static149.anInterface1_10.method2487(local239)) {
						local239 = -1;
					}
					@Pc(295) int local295;
					@Pc(256) int local256;
					@Pc(262) int local262;
					@Pc(288) int local288;
					if (local234.anInt230 >= 0) {
						local256 = local234.anInt230;
						local262 = local226 + (local256 & 0x7F);
						if (local262 < 0) {
							local262 = 0;
						} else if (local262 > 127) {
							local262 = 127;
						}
						local288 = (local256 & 0x380) + (local165 + local256 & 0xFC00) + local262;
						local295 = Static149.anIntArray328[Static64.method1047(96, local288)];
					} else if (local239 >= 0) {
						local295 = Static149.anIntArray328[Static64.method1047(96, Static149.anInterface1_10.method2489(local239))];
					} else if (local234.anInt226 == -1) {
						local295 = -1;
					} else {
						local256 = local234.anInt226;
						local262 = (local256 & 0x7F) + local226;
						if (local262 < 0) {
							local262 = 0;
						} else if (local262 > 127) {
							local262 = 127;
						}
						local288 = local262 + (local256 & 0x380) + (local165 + local256 & 0xFC00);
						local295 = Static149.anIntArray328[Static64.method1047(96, local288)];
					}
					Static36.anIntArray45[local228 + 1] = local295;
				}
			}
			Static144.anInt2995 = 20;
		} else if (Static144.anInt2995 == 20) {
			Static40.method690(Static48.aClass23_Sub1_5.method730(Static44.aClass20_339, Static171.aClass20_1268));
			Static144.anInt2995 = 30;
			Static28.method425();
		} else if (Static144.anInt2995 == 30) {
			Static99.method1685(Static48.aClass23_Sub1_5.method730(Static44.aClass20_339, Static27.aClass20_200));
			Static144.anInt2995 = 50;
			Static28.method425();
		} else if (Static144.anInt2995 == 50) {
			Static63.method1045(Static48.aClass23_Sub1_5.method730(Static44.aClass20_339, Static188.aClass20_1378));
			Static144.anInt2995 = 70;
			Static28.method425();
		} else if (Static144.anInt2995 == 70) {
			Static165.method1749(Static48.aClass23_Sub1_5.method730(Static44.aClass20_339, Static193.aClass20_1421));
			Static144.anInt2995 = 90;
			Static28.method425();
		} else {
			Static37.method1028(Static48.aClass23_Sub1_5.method730(Static44.aClass20_339, Static12.aClass20_131));
			if (Static144.anInt2995 == 90) {
				Static188.aClass87_32 = new Class87(11, true, Static198.aCanvas1);
				Static117.aClass87_17 = new Class87(12, true, Static198.aCanvas1);
				Static67.aClass87_36 = new Class87(14, true, Static198.aCanvas1);
				Static168.aClass87_25 = new Class87(17, true, Static198.aCanvas1);
				Static3.aClass87_1 = new Class87(19, true, Static198.aCanvas1);
				Static218.aClass87_37 = new Class87(22, true, Static198.aCanvas1);
				Static176.aClass87_28 = new Class87(26, true, Static198.aCanvas1);
				Static44.aClass87_10 = new Class87(30, true, Static198.aCanvas1);
				Static144.anInt2995 = 100;
			}
			Static148.anInt3057 = -1;
			Static129.anInt2701 = -1;
			Static144.anInt2995 = 100;
			Static28.method425();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(II)V")
	public static void method1662(@OriginalArg(0) int arg0) {
		Static11.anInt258 = 50;
		Static186.anInt3737 = arg0;
	}
}
