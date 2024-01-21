import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	public static int anInt96;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "Lclient!bb;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	public static int anInt120;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt91 = 0;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][13][13];

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_24 = Static13.method257("Aug");

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[I")
	public static int[] anIntArray13 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Lclient!o;")
	public static Class40 aClass40_25 = Static13.method257("overlay_multiway");

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "Lclient!o;")
	public static Class40 aClass40_26 = Static13.method257("hitmarks");

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "Lclient!o;")
	public static Class40 aClass40_27 = Static13.method257("Cancel");

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
	public static volatile int anInt112 = -1;

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_28 = Static13.method257("Accept trade @whi@");

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
	public static int anInt121 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
	public static void method58(@OriginalArg(0) boolean arg0) {
		Static45.aBoolean87 = arg0;
		@Pc(19) int local19;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(72) int local72;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(148) int local148;
		if (!Static45.aBoolean87) {
			local19 = Static56.aClass2_Sub3_Sub1_5.method1705();
			local26 = (Static33.anInt785 - Static56.aClass2_Sub3_Sub1_5.anInt2546) / 16;
			Static86.anIntArrayArray20 = new int[local26][4];
			for (local32 = 0; local32 < local26; local32++) {
				for (local36 = 0; local36 < 4; local36++) {
					Static86.anIntArrayArray20[local32][local36] = Static56.aClass2_Sub3_Sub1_5.method1728();
				}
			}
			local36 = Static56.aClass2_Sub3_Sub1_5.method1705();
			local62 = Static56.aClass2_Sub3_Sub1_5.method1705();
			local66 = Static56.aClass2_Sub3_Sub1_5.method1715();
			local72 = Static56.aClass2_Sub3_Sub1_5.method1704();
			Static105.aByteArrayArray12 = new byte[local26][];
			Static58.anIntArray311 = new int[local26];
			@Pc(80) boolean local80 = false;
			if ((local72 / 8 == 48 || local72 / 8 == 49) && local36 / 8 == 48) {
				local80 = true;
			}
			if (local72 / 8 == 48 && local36 / 8 == 148) {
				local80 = true;
			}
			Static24.aByteArrayArray6 = new byte[local26][];
			Static51.anIntArray256 = new int[local26];
			Static55.anIntArray299 = new int[local26];
			local26 = 0;
			for (local132 = (local72 - 6) / 8; local132 <= (local72 + 6) / 8; local132++) {
				for (local140 = (local36 - 6) / 8; local140 <= (local36 + 6) / 8; local140++) {
					local148 = local140 + (local132 << 8);
					if (!local80 || local140 != 49 && local140 != 149 && local140 != 147 && local132 != 50 && (local132 != 49 || local140 != 47)) {
						Static58.anIntArray311[local26] = local148;
						Static55.anIntArray299[local26] = Static36.aClass5_Sub1_8.method80(Static80.method1334(new Class40[] { Static104.aClass40_723, Static53.method859(local132), Static91.aClass40_612, Static53.method859(local140) }));
						Static51.anIntArray256[local26] = Static36.aClass5_Sub1_8.method80(Static80.method1334(new Class40[] { Static51.aClass40_356, Static53.method859(local132), Static91.aClass40_612, Static53.method859(local140) }));
						local26++;
					}
				}
			}
			Static82.method1343(local72, local66, local19, local62, local36);
			return;
		}
		local19 = Static56.aClass2_Sub3_Sub1_5.method1681();
		Static56.aClass2_Sub3_Sub1_5.method1737();
		for (local26 = 0; local26 < 4; local26++) {
			for (local32 = 0; local32 < 13; local32++) {
				for (local36 = 0; local36 < 13; local36++) {
					local62 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
					if (local62 == 1) {
						anIntArrayArrayArray2[local26][local32][local36] = Static56.aClass2_Sub3_Sub1_5.method1743(26);
					} else {
						anIntArrayArrayArray2[local26][local32][local36] = -1;
					}
				}
			}
		}
		Static56.aClass2_Sub3_Sub1_5.method1739();
		local32 = (Static33.anInt785 - Static56.aClass2_Sub3_Sub1_5.anInt2546) / 16;
		Static86.anIntArrayArray20 = new int[local32][4];
		for (local36 = 0; local36 < local32; local36++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static86.anIntArrayArray20[local36][local62] = Static56.aClass2_Sub3_Sub1_5.method1732();
			}
		}
		local62 = Static56.aClass2_Sub3_Sub1_5.method1715();
		local66 = Static56.aClass2_Sub3_Sub1_5.method1714();
		local72 = Static56.aClass2_Sub3_Sub1_5.method1681();
		@Pc(394) int local394 = Static56.aClass2_Sub3_Sub1_5.method1714();
		Static55.anIntArray299 = new int[local32];
		Static51.anIntArray256 = new int[local32];
		Static105.aByteArrayArray12 = new byte[local32][];
		Static58.anIntArray311 = new int[local32];
		Static24.aByteArrayArray6 = new byte[local32][];
		local32 = 0;
		for (local132 = 0; local132 < 4; local132++) {
			for (local140 = 0; local140 < 13; local140++) {
				for (local148 = 0; local148 < 13; local148++) {
					@Pc(431) int local431 = anIntArrayArrayArray2[local132][local140][local148];
					if (local431 != -1) {
						@Pc(440) int local440 = local431 >> 14 & 0x3FF;
						@Pc(446) int local446 = local431 >> 3 & 0x7FF;
						@Pc(456) int local456 = (local440 / 8 << 8) + local446 / 8;
						for (@Pc(458) int local458 = 0; local458 < local32; local458++) {
							if (local456 == Static58.anIntArray311[local458]) {
								local456 = -1;
								break;
							}
						}
						if (local456 != -1) {
							Static58.anIntArray311[local32] = local456;
							@Pc(490) int local490 = local456 >> 8 & 0xFF;
							@Pc(494) int local494 = local456 & 0xFF;
							Static55.anIntArray299[local32] = Static36.aClass5_Sub1_8.method80(Static80.method1334(new Class40[] { Static104.aClass40_723, Static53.method859(local490), Static91.aClass40_612, Static53.method859(local494) }));
							Static51.anIntArray256[local32] = Static36.aClass5_Sub1_8.method80(Static80.method1334(new Class40[] { Static51.aClass40_356, Static53.method859(local490), Static91.aClass40_612, Static53.method859(local494) }));
							local32++;
						}
					}
				}
			}
		}
		Static82.method1343(local72, local62, local19, local66, local394);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method70() {
		aClass40_27 = null;
		aClass40_25 = null;
		aClass40_26 = null;
		anObject2 = null;
		anIntArray13 = null;
		aClass40_24 = null;
		aClass7_2 = null;
		anIntArrayArrayArray2 = null;
		aClass40_28 = null;
		aClass2_Sub2_Sub2_Sub4Array2 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method75(@OriginalArg(1) Class5 arg0) {
		Static30.aClass5_10 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;ZLclient!o;Lclient!o;)Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 method77(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(13) int local13 = arg0.method80(arg2);
		@Pc(19) int local19 = arg0.method72(arg1, local13);
		return Static88.method1407(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;III)[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] method79(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static92.method1484(arg1, arg0, arg2) ? Static37.method715() : null;
	}
}
