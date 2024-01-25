import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public static int anInt1660;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!uaa;")
	public static final Class345 aClass345_1 = new Class345();

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "J")
	public static long aLong50 = -1L;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	public static int anInt1659 = -50;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "[Lclient!pe;")
	public static final Class6_Sub44[] aClass6_Sub44Array1 = new Class6_Sub44[1024];

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	public static void method1469(@OriginalArg(0) int arg0) {
		Static360.anInt9757 = -1;
		Static428.anInt7352 = -1;
		Static417.anInt7258 = arg0;
		Static524.method7853();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method1470(@OriginalArg(0) Class132 arg0) {
		Static494.aClass19_12 = Static381.method6632(Static270.anInt4693, true, arg0);
		Static393.aClass151_10 = Static454.method6566(Static270.anInt4693, arg0);
		Static423.aClass19_9 = Static381.method6632(Static332.anInt7616, true, arg0);
		Static462.aClass151_12 = Static454.method6566(Static332.anInt7616, arg0);
		Static51.aClass19_4 = Static381.method6632(Static568.anInt9424, true, arg0);
		Static173.aClass151_4 = Static454.method6566(Static568.anInt9424, arg0);
	}
}
