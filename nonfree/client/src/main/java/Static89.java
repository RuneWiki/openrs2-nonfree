import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "J")
	public static long aLong68;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!wh;")
	public static final Class99 aClass99_6 = new Class99(32);

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
	public static final int[] anIntArray244 = new int[2000];

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1259 = Static118.method2249("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1262 = Static118.method2249("Loaded input handler");

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1260 = aClass65_1262;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1261 = Static118.method2249("Malformed login packet)3");

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1263 = aClass65_1261;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
	public static void method1498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static206.anInt4385 && Static133.anInt3309 >= arg2) {
			@Pc(15) int local15 = Static100.method1896(Static23.anInt685, arg0, Static71.anInt1744);
			@Pc(21) int local21 = Static100.method1896(Static23.anInt685, arg3, Static71.anInt1744);
			Static153.method2676(local21, arg2, local15, arg1);
		}
	}
}
