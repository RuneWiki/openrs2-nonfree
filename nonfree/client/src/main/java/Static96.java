import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
	public static int anInt2438;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "Lclient!je;")
	public static Class40 aClass40_1271 = Static69.method1231(": ");

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
	public static int anInt2435 = 0;

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!je;")
	public static Class40 aClass40_1272 = Static69.method1231("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "Lclient!je;")
	public static Class40 aClass40_1273 = Static69.method1231("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "Lclient!je;")
	private static Class40 aClass40_1274 = Static69.method1231("Error loading your profile)3");

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "Lclient!je;")
	private static Class40 aClass40_1275 = Static69.method1231("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "Lclient!je;")
	private static Class40 aClass40_1279 = Static69.method1231(" ");

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "Lclient!je;")
	public static Class40 aClass40_1276 = aClass40_1279;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Lclient!je;")
	public static Class40 aClass40_1277 = aClass40_1275;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	public static int anInt2439 = 0;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lclient!je;")
	public static Class40 aClass40_1278 = aClass40_1274;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lclient!we;")
	public static Class2_Sub1_Sub17 method1764(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub1_Sub17 local8 = (Class2_Sub1_Sub17) Static65.aClass55_45.method1410((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static35.aClass24_9.method1931(arg0, 3);
		local8 = new Class2_Sub1_Sub17();
		if (local22 != null) {
			local8.method2229(new Class2_Sub9(local22));
		}
		Static65.aClass55_45.method1411((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public static void method1765() {
		aClass40_1271 = null;
		aClass40_1275 = null;
		aClass40_1278 = null;
		aClass40_1273 = null;
		aClass40_1279 = null;
		aClass40_1272 = null;
		aClass40_1277 = null;
		aClass40_1274 = null;
		aClass40_1276 = null;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	public static void method1766() {
		try {
			if (Static69.aClass18_2 == null) {
				Static69.aClass18_2 = new Class18(Static129.aClass59_5, Static40.method722(new Class40[] { Static100.aClass40_1313, Static43.aClass40_575, Static106.aClass40_1365 }).method991());
			} else {
				@Pc(9) byte[] local9 = Static69.aClass18_2.method426();
				if (local9 != null) {
					@Pc(16) Class2_Sub9 local16 = new Class2_Sub9(local9);
					Static29.anInt724 = local16.method632();
					Static81.aClass68Array1 = new Class68[Static29.anInt724];
					for (@Pc(25) int local25 = 0; local25 < Static29.anInt724; local25++) {
						@Pc(35) Class68 local35 = Static81.aClass68Array1[local25] = new Class68();
						@Pc(39) int local39 = local16.method632();
						local35.anInt2515 = local39 & 0x7FFF;
						local35.aBoolean202 = (local39 & 0x8000) != 0;
						local35.aClass40_1344 = local16.method625();
						local35.anInt2514 = local16.method666();
						local35.anInt2518 = local25;
						local35.anInt2513 = Static37.method680(local35.aClass40_1344);
					}
					Static16.method297(Static118.anIntArray325, Static81.aClass68Array1.length - 1, Static107.anIntArray292, 0, Static81.aClass68Array1);
					Static60.aBoolean124 = true;
					Static69.aClass18_2 = null;
				}
			}
		} catch (@Pc(124) Exception local124) {
			local124.printStackTrace();
			Static69.aClass18_2 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	public static void method1767() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
}
