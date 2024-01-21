import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "J")
	public static long aLong68;

	@OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
	public static int anInt2430;

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "Lclient!md;")
	public static Class30 aClass30_14;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
	public static int anInt2425 = 0;

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
	public static int anInt2426 = 0;

	@OriginalMember(owner = "client!qb", name = "ib", descriptor = "Lclient!ab;")
	public static Class2 aClass2_9 = new Class2(32);

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1293 = Static33.method650(" is already on your ignore list");

	@OriginalMember(owner = "client!qb", name = "nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1288 = aClass56_1293;

	@OriginalMember(owner = "client!qb", name = "rb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1291 = Static33.method650("wave2:");

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1289 = aClass56_1291;

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1290 = Static33.method650("mn");

	@OriginalMember(owner = "client!qb", name = "sb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1292 = aClass56_1291;

	@OriginalMember(owner = "client!qb", name = "ub", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1294 = Static33.method650("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!qb", name = "vb", descriptor = "[I")
	public static int[] anIntArray218 = new int[25];

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
	public static void method1642() {
		if (Static64.aClass17_3 != null) {
			Static64.aClass17_3.method498();
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	public static void method1643() {
		Static106.anInt2639++;
		Static15.method316(true);
		Static80.method1411(true);
		Static15.method316(false);
		Static80.method1411(false);
		Static1.method2();
		Static8.method175();
		@Pc(38) int local38;
		@Pc(78) int local78;
		if (!Static27.aBoolean43) {
			local38 = Static106.anInt2632;
			if (local38 < Static48.anInt1392 / 256) {
				local38 = Static48.anInt1392 / 256;
			}
			if (Static60.aBooleanArray5[4] && Static118.anIntArray306[4] + 128 > local38) {
				local38 = Static118.anIntArray306[4] + 128;
			}
			local78 = anInt2425 + Static22.anInt686 & 0x7FF;
			Static73.method1331(local38, Static84.anInt2282, local38 * 3 + 600, local78, Static75.anInt2033, Static27.method560(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196, Static94.anInt2470, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187) - 50);
		}
		if (Static27.aBoolean43) {
			local38 = Static31.method635();
		} else {
			local38 = Static63.method1210();
		}
		local78 = Static57.anInt1615;
		@Pc(117) int local117 = Static111.anInt2863;
		@Pc(119) int local119 = Static15.anInt433;
		@Pc(121) int local121 = Static97.anInt2547;
		@Pc(123) int local123 = Static94.anInt2474;
		for (@Pc(125) int local125 = 0; local125 < 5; local125++) {
			if (Static60.aBooleanArray5[local125]) {
				@Pc(167) int local167 = (int) ((double) -Static72.anIntArray81[local125] + Math.random() * (double) (Static72.anIntArray81[local125] * 2 + 1) + Math.sin((double) Static38.anIntArray64[local125] / 100.0D * (double) Static84.anIntArray192[local125]) * (double) Static118.anIntArray306[local125]);
				if (local125 == 3) {
					Static94.anInt2474 = local167 + Static94.anInt2474 & 0x7FF;
				}
				if (local125 == 0) {
					Static57.anInt1615 += local167;
				}
				if (local125 == 2) {
					Static15.anInt433 += local167;
				}
				if (local125 == 1) {
					Static111.anInt2863 += local167;
				}
				if (local125 == 4) {
					Static97.anInt2547 += local167;
					if (Static97.anInt2547 < 128) {
						Static97.anInt2547 = 128;
					}
					if (Static97.anInt2547 > 383) {
						Static97.anInt2547 = 383;
					}
				}
			}
		}
		Static86.method1601();
		Static107.anInt2688 = Static36.anInt1021 - 4;
		Static107.anInt2687 = 0;
		Static107.aBoolean126 = true;
		Static107.anInt2685 = Static102.anInt3222 - 4;
		Static18.method349();
		Static6.method1486();
		Static18.method349();
		Static116.aClass14_1.method453(Static57.anInt1615, Static111.anInt2863, Static15.anInt433, Static97.anInt2547, Static94.anInt2474, local38);
		Static18.method349();
		Static116.aClass14_1.method413();
		Static41.method768();
		Static127.method2042();
		((Class21) Static55.anInterface2_1).method572(Static44.anInt1163);
		Static8.method170();
		if (Static40.aBoolean52 && Static113.method1871() == 0) {
			Static40.aBoolean52 = false;
		}
		if (Static40.aBoolean52) {
			Static86.method1601();
			Static6.method1486();
			Static79.method1391(false, Static46.aClass56_1214, null);
		}
		Static18.method349();
		Static68.method1234();
		Static15.anInt433 = local119;
		Static94.anInt2474 = local123;
		Static57.anInt1615 = local78;
		Static111.anInt2863 = local117;
		Static97.anInt2547 = local121;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public static void method1644() {
		anIntArray218 = null;
		aClass56_1288 = null;
		aClass56_1294 = null;
		aClass30_14 = null;
		aClass56_1289 = null;
		aClass2_9 = null;
		aClass56_1290 = null;
		aClass56_1291 = null;
		aClass56_1292 = null;
		aClass56_1293 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!tb;ZI)Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 method1645(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1) {
		return Static14.method253(arg1, arg0) ? Static57.method1079() : null;
	}
}
