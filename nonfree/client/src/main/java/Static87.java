import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Lclient!ea;")
	public static Class20 aClass20_44;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!ec;")
	private static Class22 aClass22_651 = Static60.method1113("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array1 = new Class60[4];

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_652 = Static60.method1113("Loaded update list");

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!ec;")
	private static Class22 aClass22_661 = Static60.method1113("Members only world");

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_653 = aClass22_661;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_654 = aClass22_652;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!ec;")
	private static Class22 aClass22_655 = Static60.method1113("button near the top of that page)3");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_656 = aClass22_651;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_657 = aClass22_655;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!ec;")
	private static Class22 aClass22_662 = Static60.method1113("Existing User");

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_658 = aClass22_662;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_659 = Static60.method1113("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_660 = Static60.method1113(":duelreq:");

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_663 = Static60.method1113("title_mute");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1540() {
		if (!Static128.aBoolean274) {
			return;
		}
		@Pc(11) Class4_Sub7 local11 = Static108.method1767(Static123.anInt3082, Static37.anInt903);
		if (local11 != null && local11.anObjectArray16 != null) {
			@Pc(20) Class4_Sub3 local20 = new Class4_Sub3();
			local20.aClass4_Sub7_3 = local11;
			local20.anObjectArray1 = local11.anObjectArray16;
			Static133.method2036(local20);
		}
		Static128.aBoolean274 = false;
		Static110.method1772(local11);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public static void method1541() {
		Static41.aClass33_16.method1003();
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public static void method1542() {
		aClass22_658 = null;
		aClass22_660 = null;
		aClass60Array1 = null;
		aClass20_44 = null;
		aClass22_657 = null;
		aClass22_659 = null;
		aClass22_663 = null;
		aClass22_661 = null;
		aClass22_652 = null;
		aClass22_662 = null;
		aClass22_656 = null;
		aClass22_654 = null;
		aClass22_655 = null;
		aClass22_653 = null;
		aClass22_651 = null;
	}
}
