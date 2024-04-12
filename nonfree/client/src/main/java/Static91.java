import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	public static int anInt96;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "Lclient!bb;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	public static int anInt120;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V", line = 42)
	public static void method58(@OriginalArg(0) boolean arg0) {
		Class27.aBoolean87 = arg0;
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
		if (!Class27.aBoolean87) {
			local19 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
			local26 = (Class2_Sub2_Sub7.anInt785 - Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546) / 16;
			Static78.anIntArrayArray20 = new int[local26][4];
			for (local32 = 0; local32 < local26; local32++) {
				for (local36 = 0; local36 < 4; local36++) {
					Static78.anIntArrayArray20[local32][local36] = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
				}
			}
			local36 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
			local62 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
			local66 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
			local72 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
			Static97.aByteArrayArray12 = new byte[local26][];
			Static53.anIntArray311 = new int[local26];
			@Pc(80) boolean local80 = false;
			if ((local72 / 8 == 48 || local72 / 8 == 49) && local36 / 8 == 48) {
				local80 = true;
			}
			if (local72 / 8 == 48 && local36 / 8 == 148) {
				local80 = true;
			}
			Static23.aByteArrayArray6 = new byte[local26][];
			Static46.anIntArray256 = new int[local26];
			Static50.anIntArray299 = new int[local26];
			local26 = 0;
			for (local132 = (local72 - 6) / 8; local132 <= (local72 + 6) / 8; local132++) {
				for (local140 = (local36 - 6) / 8; local140 <= (local36 + 6) / 8; local140++) {
					local148 = local140 + (local132 << 8);
					if (!local80 || local140 != 49 && local140 != 149 && local140 != 147 && local132 != 50 && (local132 != 49 || local140 != 47)) {
						Static53.anIntArray311[local26] = local148;
						Static50.anIntArray299[local26] = Static34.aClass5_Sub1_8.method80(Static72.method1334(new Class40[] { Class63.aClass40_723, Static48.method859(local132), Class57.aClass40_612, Static48.method859(local140) }));
						Static46.anIntArray256[local26] = Static34.aClass5_Sub1_8.method80(Static72.method1334(new Class40[] { Canvas_Sub1.aClass40_356, Static48.method859(local132), Class57.aClass40_612, Static48.method859(local140) }));
						local26++;
					}
				}
			}
			Static74.method1343(local72, local66, local19, local62, local36);
			return;
		}
		local19 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
		Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1737();
		for (local26 = 0; local26 < 4; local26++) {
			for (local32 = 0; local32 < 13; local32++) {
				for (local36 = 0; local36 < 13; local36++) {
					local62 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(1);
					if (local62 == 1) {
						Class5.anIntArrayArrayArray2[local26][local32][local36] = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(26);
					} else {
						Class5.anIntArrayArrayArray2[local26][local32][local36] = -1;
					}
				}
			}
		}
		Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1739();
		local32 = (Class2_Sub2_Sub7.anInt785 - Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546) / 16;
		Static78.anIntArrayArray20 = new int[local32][4];
		for (local36 = 0; local36 < local32; local36++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static78.anIntArrayArray20[local36][local62] = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1732();
			}
		}
		local62 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
		local66 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
		local72 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
		@Pc(394) int local394 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
		Static50.anIntArray299 = new int[local32];
		Static46.anIntArray256 = new int[local32];
		Static97.aByteArrayArray12 = new byte[local32][];
		Static53.anIntArray311 = new int[local32];
		Static23.aByteArrayArray6 = new byte[local32][];
		local32 = 0;
		for (local132 = 0; local132 < 4; local132++) {
			for (local140 = 0; local140 < 13; local140++) {
				for (local148 = 0; local148 < 13; local148++) {
					@Pc(431) int local431 = Class5.anIntArrayArrayArray2[local132][local140][local148];
					if (local431 != -1) {
						@Pc(440) int local440 = local431 >> 14 & 0x3FF;
						@Pc(446) int local446 = local431 >> 3 & 0x7FF;
						@Pc(456) int local456 = (local440 / 8 << 8) + local446 / 8;
						for (@Pc(458) int local458 = 0; local458 < local32; local458++) {
							if (local456 == Static53.anIntArray311[local458]) {
								local456 = -1;
								break;
							}
						}
						if (local456 != -1) {
							Static53.anIntArray311[local32] = local456;
							@Pc(490) int local490 = local456 >> 8 & 0xFF;
							@Pc(494) int local494 = local456 & 0xFF;
							Static50.anIntArray299[local32] = Static34.aClass5_Sub1_8.method80(Static72.method1334(new Class40[] { Class63.aClass40_723, Static48.method859(local490), Class57.aClass40_612, Static48.method859(local494) }));
							Static46.anIntArray256[local32] = Static34.aClass5_Sub1_8.method80(Static72.method1334(new Class40[] { Canvas_Sub1.aClass40_356, Static48.method859(local490), Class57.aClass40_612, Static48.method859(local494) }));
							local32++;
						}
					}
				}
			}
		}
		Static74.method1343(local72, local62, local19, local66, local394);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 652)
	public static void method70() {
		Class5.aClass40_27 = null;
		Class5.aClass40_25 = null;
		Class5.aClass40_26 = null;
		Class5.anObject2 = null;
		Class5.anIntArray13 = null;
		Class5.aClass40_24 = null;
		aClass7_2 = null;
		Class5.anIntArrayArrayArray2 = null;
		Class5.aClass40_28 = null;
		aClass2_Sub2_Sub2_Sub4Array2 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ud;)V", line = 861)
	public static void method75(@OriginalArg(1) Class5 arg0) {
		Static28.aClass5_10 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;ZLclient!o;Lclient!o;)Lclient!qb;", line = 890)
	public static Class2_Sub2_Sub2_Sub3 method77(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(13) int local13 = arg0.method80(arg2);
		@Pc(19) int local19 = arg0.method72(arg1, local13);
		return Static80.method1407(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ud;III)[Lclient!vb;", line = 939)
	public static Class2_Sub2_Sub2_Sub4[] method79(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static84.method1484(arg1, arg0, arg2) ? Static35.method715() : null;
	}
}
