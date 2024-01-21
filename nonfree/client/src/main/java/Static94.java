import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "Lclient!he;")
	private static Class26 aClass26_1363 = Static6.method100("Attack");

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Lclient!he;")
	public static Class26 aClass26_1359 = aClass26_1363;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "Lclient!he;")
	private static Class26 aClass26_1360 = Static6.method100("You have only just left another world)3");

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
	public static int anInt2551 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "Lclient!he;")
	private static Class26 aClass26_1362 = Static6.method100("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "Lclient!he;")
	public static Class26 aClass26_1361 = aClass26_1362;

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "Lclient!sf;")
	public static Class66 aClass66_22 = new Class66(64);

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "Lclient!he;")
	public static Class26 aClass26_1364 = aClass26_1360;

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
	public static int anInt2554 = 0;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method1700() {
		Static56.aClass66_16.method1971();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!eb;ILclient!cb;)V")
	public static void method1701(@OriginalArg(1) Class16_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class65 local9 = Static59.aClass65_45;
		synchronized (Static59.aClass65_45) {
			for (@Pc(16) Class3_Sub13 local16 = (Class3_Sub13) Static59.aClass65_45.method1958(); local16 != null; local16 = (Class3_Sub13) Static59.aClass65_45.method1962()) {
				if ((long) arg1 == local16.aLong100 && arg2 == local16.aClass12_4 && local16.anInt2070 == 0) {
					local7 = local16.aByteArray21;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(71) byte[] local71 = arg2.method270(arg1);
			arg0.method582(arg2, arg1, local71, true);
		} else {
			arg0.method582(arg2, arg1, local7, true);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)Lclient!he;")
	public static Class26 method1702(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static122.method2170(arg0) : Static19.aClass26_301;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public static void method1703() {
		aClass26_1359 = null;
		aClass26_1363 = null;
		aClass26_1362 = null;
		aClass26_1361 = null;
		aClass26_1364 = null;
		aClass66_22 = null;
		aClass26_1360 = null;
	}
}
