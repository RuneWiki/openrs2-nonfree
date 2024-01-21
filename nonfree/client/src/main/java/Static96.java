import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "Lclient!ad;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_3;

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
	public static int anInt2385;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] aClass1_Sub3_Sub1_Sub3Array8;

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array5;

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "Lclient!af;")
	private static Class5 aClass5_1142 = Static45.method1937("Unexpected server response");

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "Lclient!af;")
	public static Class5 aClass5_1143 = Static45.method1937("Sprites geladen)3");

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lclient!af;")
	public static Class5 aClass5_1144 = Static45.method1937("l");

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "[I")
	public static int[] anIntArray366 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
	public static int anInt2386 = 1;

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1145 = aClass5_1142;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
	public static void method1621() {
		@Pc(9) Object local9 = Static123.anObject3;
		synchronized (Static123.anObject3) {
			if (Static50.anInt1250 != 0) {
				Static50.anInt1250 = 1;
				try {
					Static123.anObject3.wait();
				} catch (@Pc(19) InterruptedException local19) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!of;II)I")
	public static int method1622(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray67 == null || arg1 >= arg0.anIntArrayArray67.length) {
			return -2;
		}
		try {
			@Pc(31) int[] local31 = arg0.anIntArrayArray67[arg1];
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(42) int local42 = local31[local33++];
				@Pc(44) byte local44 = 0;
				@Pc(46) int local46 = 0;
				if (local42 == 0) {
					return local37;
				}
				if (local42 == 1) {
					local46 = Static42.anIntArray185[local31[local33++]];
				}
				if (local42 == 15) {
					local44 = 1;
				}
				if (local42 == 2) {
					local46 = Static89.anIntArray442[local31[local33++]];
				}
				if (local42 == 16) {
					local44 = 2;
				}
				if (local42 == 17) {
					local44 = 3;
				}
				if (local42 == 3) {
					local46 = Static117.anIntArray459[local31[local33++]];
				}
				@Pc(118) int local118;
				@Pc(129) Class1_Sub17 local129;
				@Pc(134) int local134;
				@Pc(147) int local147;
				if (local42 == 4) {
					local118 = local31[local33++] << 16;
					@Pc(125) int local125 = local118 + local31[local33++];
					local129 = Static36.method680(local125);
					local134 = local31[local33++];
					if (local134 != -1 && (!Static56.method1022(local134).aBoolean114 || Static82.aBoolean70)) {
						for (local147 = 0; local147 < local129.anIntArray341.length; local147++) {
							if (local134 + 1 == local129.anIntArray341[local147]) {
								local46 += local129.anIntArray340[local147];
							}
						}
					}
				}
				if (local42 == 5) {
					local46 = Static40.anIntArray182[local31[local33++]];
				}
				if (local42 == 6) {
					local46 = Class1_Sub3_Sub9.anIntArray213[Static89.anIntArray442[local31[local33++]] - 1];
				}
				if (local42 == 7) {
					local46 = Static40.anIntArray182[local31[local33++]] * 100 / 46875;
				}
				if (local42 == 8) {
					local46 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2001;
				}
				if (local42 == 9) {
					for (local118 = 0; local118 < 25; local118++) {
						if (Static65.aBooleanArray19[local118]) {
							local46 += Static89.anIntArray442[local118];
						}
					}
				}
				if (local42 == 10) {
					local118 = local31[local33++] << 16;
					local118 += local31[local33++];
					local129 = Static36.method680(local118);
					local134 = local31[local33++];
					if (local134 != -1 && (!Static56.method1022(local134).aBoolean114 || Static82.aBoolean70)) {
						for (local147 = 0; local147 < local129.anIntArray341.length; local147++) {
							if (local129.anIntArray341[local147] == local134 + 1) {
								local46 = 999999999;
								break;
							}
						}
					}
				}
				if (local42 == 11) {
					local46 = Static84.anInt2138;
				}
				if (local42 == 12) {
					local46 = Static131.anInt3268;
				}
				if (local42 == 13) {
					local118 = Static40.anIntArray182[local31[local33++]];
					@Pc(351) int local351 = local31[local33++];
					local46 = (local118 & 0x1 << local351) == 0 ? 0 : 1;
				}
				if (local42 == 14) {
					local118 = local31[local33++];
					local46 = method1626(local118);
				}
				if (local42 == 18) {
					local46 = (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 >> 7) + Static129.anInt3262;
				}
				if (local42 == 19) {
					local46 = Static32.anInt927 + (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 >> 7);
				}
				if (local42 == 20) {
					local46 = local31[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local37 += local46;
					}
					if (local35 == 1) {
						local37 -= local46;
					}
					if (local35 == 2 && local46 != 0) {
						local37 /= local46;
					}
					if (local35 == 3) {
						local37 *= local46;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(457) Exception local457) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(B)Lclient!ud;")
	public static Class50 method1623() {
		try {
			return (Class50) Class.forName("Class50_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
	public static int method1624(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local14 >>> 2 & 0x73333333) + (local14 & 0x33333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(B)V")
	public static void method1625() {
		aClass1_Sub3_Sub1_Sub3Array8 = null;
		aClass5_1145 = null;
		aClass5_1144 = null;
		anIntArray366 = null;
		aClass1_Sub3_Sub1_Sub2Array5 = null;
		aClass5_1143 = null;
		aClass1_Sub3_Sub1_Sub1_3 = null;
		aClass5_1142 = null;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)I")
	public static int method1626(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub3_Sub14 local11 = Static13.method298(arg0);
		@Pc(18) int local18 = local11.anInt2227;
		@Pc(21) int local21 = local11.anInt2223;
		@Pc(24) int local24 = local11.anInt2222;
		@Pc(31) int local31 = Class1_Sub3_Sub12.anIntArray323[local24 - local21];
		return local31 & Static40.anIntArray182[local18] >> local21;
	}
}
