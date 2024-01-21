import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!r", name = "q", descriptor = "[I")
	public static int[] anIntArray267;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	public static int anInt2440 = 0;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_1280 = Static69.method1231("(Udns");

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!ob;")
	public static Class55 aClass55_76 = new Class55(64);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!je;")
	private static Class40 aClass40_1281 = Static69.method1231("Loading interfaces )2 ");

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_1282 = aClass40_1281;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!je;")
	private static Class40 aClass40_1285 = Static69.method1231("red:");

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_1283 = aClass40_1285;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!uf;")
	public static Class77 aClass77_10 = new Class77(32);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_1284 = aClass40_1285;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Lclient!je;")
	private static Class40 aClass40_1286 = Static69.method1231("Choose Option");

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_1287 = Static69.method1231(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!je;")
	public static Class40 aClass40_1288 = aClass40_1286;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_1289 = Static69.method1231("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!je;")
	public static Class40 aClass40_1290 = Static69.method1231("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
	public static int method1768(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) Static63.aClass77_5.method2034((long) arg1);
		if (local18 == null) {
			return -1;
		} else if (arg0 >= 0 && local18.anIntArray266.length > arg0) {
			return local18.anIntArray266[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method1769(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class2_Sub15 local14 = (Class2_Sub15) Static105.aClass77_11.method2031(); local14 != null; local14 = (Class2_Sub15) Static105.aClass77_11.method2039()) {
			if ((long) arg0 == (local14.aLong100 >> 48 & 0xFFFFL)) {
				local14.method2209();
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method1770() {
		for (@Pc(7) int local7 = 0; local7 < Static70.anInt1888; local7++) {
			@Pc(13) int local13 = Static106.anIntArray289[local7]--;
			if (Static106.anIntArray289[local7] >= -10) {
				@Pc(80) Class66 local80 = Static64.aClass66Array1[local7];
				if (local80 == null) {
					local80 = Static140.method1806(Static32.aClass24_Sub1_2, Static48.anIntArray137[local7], 0);
					if (local80 == null) {
						continue;
					}
					Static106.anIntArray289[local7] += local80.method1805();
					Static64.aClass66Array1[local7] = local80;
				}
				if (Static106.anIntArray289[local7] < 0) {
					@Pc(203) int local203;
					if (Static121.anIntArray331[local7] == 0) {
						local203 = Static66.anInt1735;
					} else {
						@Pc(123) int local123 = Static121.anIntArray331[local7] >> 8 & 0xFF;
						@Pc(131) int local131 = Static121.anIntArray331[local7] >> 16 & 0xFF;
						@Pc(141) int local141 = local131 * 128 + 64 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788;
						@Pc(149) int local149 = (Static121.anIntArray331[local7] & 0xFF) * 128;
						if (local141 < 0) {
							local141 = -local141;
						}
						@Pc(164) int local164 = local123 * 128 + 64 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792;
						if (local164 < 0) {
							local164 = -local164;
						}
						@Pc(178) int local178 = local164 + local141 - 128;
						if (local178 > local149) {
							Static106.anIntArray289[local7] = -100;
							continue;
						}
						if (local178 < 0) {
							local178 = 0;
						}
						local203 = Static106.anInt2536 * (local149 - local178) / local149;
					}
					if (local203 > 0) {
						@Pc(214) Class2_Sub4_Sub1 local214 = local80.method1807().method1815(Static16.aClass31_1);
						@Pc(219) Class2_Sub5_Sub2 local219 = Static137.method1313(local214, local203);
						local219.method1326(Static104.anIntArray285[local7] - 1);
						Static77.aClass2_Sub5_Sub1_1.method1138(local219);
					}
					Static106.anIntArray289[local7] = -100;
				}
			} else {
				Static70.anInt1888--;
				for (@Pc(27) int local27 = local7; local27 < Static70.anInt1888; local27++) {
					Static48.anIntArray137[local27] = Static48.anIntArray137[local27 + 1];
					Static64.aClass66Array1[local27] = Static64.aClass66Array1[local27 + 1];
					Static104.anIntArray285[local27] = Static104.anIntArray285[local27 + 1];
					Static106.anIntArray289[local27] = Static106.anIntArray289[local27 + 1];
					Static121.anIntArray331[local27] = Static121.anIntArray331[local27 + 1];
				}
				local7--;
			}
		}
		if (Static86.aBoolean247 && !Static57.method1015()) {
			if (Static81.anInt2089 != 0 && Static79.anInt2069 != -1) {
				Static52.method940(Static79.anInt2069, 0, Static61.aClass24_Sub1_8, Static81.anInt2089);
			}
			Static86.aBoolean247 = false;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method1771() {
		aClass40_1285 = null;
		aClass40_1288 = null;
		aClass40_1286 = null;
		aClass40_1287 = null;
		aClass40_1280 = null;
		aClass40_1289 = null;
		aClass55_76 = null;
		aClass77_10 = null;
		aClass40_1281 = null;
		aClass40_1282 = null;
		aClass40_1290 = null;
		anIntArray267 = null;
		aClass40_1283 = null;
		aClass40_1284 = null;
	}
}
