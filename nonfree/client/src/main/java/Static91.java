import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	public static int anInt4078;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public static int anInt4085;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1316 = Static186.method3527("Wordpack geladen)3");

	@OriginalMember(owner = "client!id", name = "r", descriptor = "I")
	public static int anInt4082 = 0;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array78 = new Class50[500];

	@OriginalMember(owner = "client!id", name = "D", descriptor = "Z")
	public static boolean aBoolean192 = true;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public static void method3219() {
		if (Static67.anInt1301 > 0) {
			Static210.method3288();
		} else {
			Static212.aClass26_3 = Static33.aClass26_2;
			Static33.aClass26_2 = null;
			Static229.method3481(40);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!pa;Lclient!pa;)V")
	public static void method3220(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class86 arg1) {
		Static5.aClass1_Sub1_Sub10_1 = Static118.method1871(arg1, arg0, Static69.anInt1314);
		Static117.aClass1_Sub1_Sub10_Sub1_1 = (Class1_Sub1_Sub10_Sub1) Static5.aClass1_Sub1_Sub10_1;
		Static130.aClass1_Sub1_Sub10_2 = Static118.method1871(arg1, arg0, Static58.anInt1159);
		Static187.aClass1_Sub1_Sub10_3 = Static118.method1871(arg1, arg0, Static12.anInt235);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILclient!ta;Lclient!ta;IIJ)V")
	public static void method3222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class29 local8 = new Class29();
		local8.aLong44 = arg8;
		local8.anInt1085 = arg1 * 128 + 64;
		local8.anInt1087 = arg2 * 128 + 64;
		local8.anInt1091 = arg3;
		local8.aClass20_1 = arg4;
		local8.aClass20_2 = arg5;
		local8.anInt1090 = arg6;
		local8.anInt1086 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static56.aClass1_Sub11ArrayArrayArray3[local42][arg1][arg2] == null) {
				Static56.aClass1_Sub11ArrayArrayArray3[local42][arg1][arg2] = new Class1_Sub11(local42, arg1, arg2);
			}
		}
		Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2].aClass29_1 = local8;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method3224() {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static76.aClass75_9.method2239(); local10 != null; local10 = (Class1_Sub4) Static76.aClass75_9.method2238()) {
			if (local10.anInt369 > 0) {
				local10.anInt369--;
			}
			if (local10.anInt369 != 0) {
				if (local10.anInt357 > 0) {
					local10.anInt357--;
				}
				if (local10.anInt357 == 0 && local10.anInt365 >= 1 && local10.anInt366 >= 1 && local10.anInt365 <= 102 && local10.anInt366 <= 102 && (local10.anInt364 < 0 || Static109.method1725(local10.anInt358, local10.anInt364))) {
					Static197.method3489(local10.anInt367, local10.anInt365, local10.anInt361, local10.anInt354, local10.anInt366, local10.anInt364, local10.anInt358);
					local10.anInt357 = -1;
					if (local10.anInt362 == local10.anInt364 && local10.anInt362 == -1) {
						local10.method3525();
					} else if (local10.anInt362 == local10.anInt364 && local10.anInt354 == local10.anInt363 && local10.anInt358 == local10.anInt360) {
						local10.method3525();
					}
				}
			} else if (local10.anInt362 < 0 || Static109.method1725(local10.anInt360, local10.anInt362)) {
				Static197.method3489(local10.anInt367, local10.anInt365, local10.anInt361, local10.anInt363, local10.anInt366, local10.anInt362, local10.anInt360);
				local10.method3525();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public static void method3226() {
		if (!Static40.aBoolean44) {
			Static193.anInt3035 = 1;
			aClass50Array78[0] = Static163.aClass50_1092;
			Static27.aShortArray4[0] = 1006;
			Static211.aClass50Array80[0] = Static7.aClass50_69;
		}
		if (Static10.anInt204 != -1) {
			Static194.method3147(Static10.anInt204);
		}
		for (@Pc(29) int local29 = 0; local29 < Static42.anInt924; local29++) {
			if (Static98.aBooleanArray5[local29]) {
				Static222.aBooleanArray28[local29] = true;
			}
			Static124.aBooleanArray9[local29] = Static98.aBooleanArray5[local29];
			Static98.aBooleanArray5[local29] = false;
		}
		Static217.anInt4283 = -1;
		Static106.anInt2130 = -1;
		Static197.aClass93_124 = null;
		Static62.anInt1226 = Static107.anInt2132;
		if (Static10.anInt204 != -1) {
			Static42.anInt924 = 0;
			Static156.method2583(Static185.anInt3844, 0, 0, 0, Static10.anInt204, Static48.anInt1023, -1, 0);
		}
		Static29.method420();
		Static22.method310();
		if (Static40.aBoolean44) {
			Static188.method3110();
		} else if (Static217.anInt4283 != -1) {
			Static99.method3533(Static217.anInt4283, Static106.anInt2130);
		}
		if (Static20.anInt418 == 3) {
			for (@Pc(102) int local102 = 0; local102 < Static42.anInt924; local102++) {
				if (Static124.aBooleanArray9[local102]) {
					Static29.method401(Static118.anIntArray258[local102], Static75.anIntArray124[local102], Static135.anIntArray296[local102], Static189.anIntArray440[local102], 16711935, 128);
				} else if (Static222.aBooleanArray28[local102]) {
					Static29.method401(Static118.anIntArray258[local102], Static75.anIntArray124[local102], Static135.anIntArray296[local102], Static189.anIntArray440[local102], 16711680, 128);
				}
			}
		}
		Static119.method1893(Static212.anInt4195, Static42.anInt921, Static230.aClass20_Sub3_Sub1_3.anInt3022, Static230.aClass20_Sub3_Sub1_3.anInt3008);
		Static42.anInt921 = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	public static void method3231() {
		Static4.aClass84_7.method2585();
		Static203.aClass84_14.method2585();
	}
}
