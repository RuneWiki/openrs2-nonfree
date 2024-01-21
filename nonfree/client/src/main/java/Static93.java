import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!pe", name = "Eb", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_56;

	@OriginalMember(owner = "client!pe", name = "Fb", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1327 = Static72.method1077("sl_arrows");

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "Lclient!u;")
	public static Class74 aClass74_1328 = Static72.method1077(" x ");

	@OriginalMember(owner = "client!pe", name = "xb", descriptor = "Lclient!e;")
	public static Class16 aClass16_69 = new Class16(64);

	@OriginalMember(owner = "client!pe", name = "Ab", descriptor = "Lclient!u;")
	private static Class74 aClass74_1330 = Static72.method1077("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!pe", name = "yb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1329 = aClass74_1330;

	@OriginalMember(owner = "client!pe", name = "Gb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1333 = Static72.method1077(" seconds)3");

	@OriginalMember(owner = "client!pe", name = "Cb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1331 = aClass74_1333;

	@OriginalMember(owner = "client!pe", name = "Db", descriptor = "Lclient!u;")
	public static Class74 aClass74_1332 = Static72.method1077("(Z");

	@OriginalMember(owner = "client!pe", name = "Hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1334 = Static72.method1077("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!pe", name = "Ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_1335 = Static72.method1077("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!pe", name = "Jb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1336 = Static72.method1077("headicons_pk");

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)V")
	public static void method1378(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = Static80.aClass2_Sub2_Sub1_Sub2_5.anIntArray31;
		@Pc(16) int local16 = local13.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			local13[local18] = 0;
		}
		@Pc(43) int local43;
		@Pc(45) int local45;
		for (@Pc(30) int local30 = 1; local30 < 103; local30++) {
			local43 = (103 - local30) * 512 * 4 + 24628;
			for (local45 = 1; local45 < 103; local45++) {
				if ((Static17.aByteArrayArrayArray1[arg0][local45][local30] & 0x18) == 0) {
					Static84.aClass69_1.method1619(local13, local43, arg0, local45, local30);
				}
				if (arg0 < 3 && (Static17.aByteArrayArrayArray1[arg0 + 1][local45][local30] & 0x8) != 0) {
					Static84.aClass69_1.method1619(local13, local43, arg0 + 1, local45, local30);
				}
				local43 += 4;
			}
		}
		Static80.aClass2_Sub2_Sub1_Sub2_5.method200();
		local43 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + 238 - 10;
		local45 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(150) int local150;
		for (@Pc(146) int local146 = 1; local146 < 103; local146++) {
			for (local150 = 1; local150 < 103; local150++) {
				if ((Static17.aByteArrayArrayArray1[arg0][local150][local146] & 0x18) == 0) {
					Static119.method1759(local43, arg0, local146, local150, local45);
				}
				if (arg0 < 3 && (Static17.aByteArrayArrayArray1[arg0 + 1][local150][local146] & 0x8) != 0) {
					Static119.method1759(local43, arg0 + 1, local146, local150, local45);
				}
			}
		}
		Static84.anInt1828 = 0;
		for (local150 = 0; local150 < 104; local150++) {
			for (@Pc(216) int local216 = 0; local216 < 104; local216++) {
				@Pc(224) int local224 = Static84.aClass69_1.method1630(Static117.anInt2529, local150, local216);
				if (local224 != 0) {
					local224 = local224 >> 14 & 0x7FFF;
					@Pc(237) int local237 = Static2.method19(local224).anInt2269;
					if (local237 >= 0) {
						@Pc(244) int local244 = local150;
						@Pc(246) int local246 = local216;
						if (local237 != 22 && local237 != 29 && local237 != 34 && local237 != 36 && local237 != 46 && local237 != 47 && local237 != 48) {
							@Pc(276) int[][] local276 = Static50.aClass55Array1[Static117.anInt2529].anIntArrayArray18;
							for (@Pc(278) int local278 = 0; local278 < 10; local278++) {
								@Pc(285) int local285 = (int) (Math.random() * 4.0D);
								if (local285 == 0 && local244 > 0 && local244 > local150 - 3 && (local276[local244 - 1][local246] & 0x12C0108) == 0) {
									local244--;
								}
								if (local285 == 1 && local244 < 103 && local244 < local150 + 3 && (local276[local244 + 1][local246] & 0x12C0180) == 0) {
									local244++;
								}
								if (local285 == 2 && local246 > 0 && local246 > local216 - 3 && (local276[local244][local246 - 1] & 0x12C0102) == 0) {
									local246--;
								}
								if (local285 == 3 && local246 < 103 && local246 < local216 + 3 && (local276[local244][local246 + 1] & 0x12C0120) == 0) {
									local246++;
								}
							}
						}
						Static116.aClass2_Sub2_Sub1_Sub2Array11[Static84.anInt1828] = Static8.aClass2_Sub2_Sub1_Sub2Array1[local237];
						Static19.anIntArray56[Static84.anInt1828] = local244;
						Static126.anIntArray409[Static84.anInt1828] = local246;
						Static84.anInt1828++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	public static void method1381() {
		aClass74_1336 = null;
		aClass74_1332 = null;
		aClass74_1330 = null;
		aClass16_69 = null;
		aClass74_1328 = null;
		aClass74_1335 = null;
		aClass26_Sub1_56 = null;
		aClass74_1329 = null;
		aClass74_1327 = null;
		aClass74_1334 = null;
		aClass74_1331 = null;
		aClass74_1333 = null;
		anIntArray274 = null;
		Class26_Sub1.anIntArray273 = null;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)I")
	public static int method1383() {
		return 6;
	}
}
