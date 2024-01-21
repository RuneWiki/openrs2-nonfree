import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array17;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Lclient!sa;")
	public static Class67 aClass67_20 = new Class67(64);

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1048 = Static63.method1251("sideicons");

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1050 = Static63.method1251("Drop");

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1049 = aClass45_1050;

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "[I")
	public static int[] anIntArray367 = new int[1000];

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1051 = Static63.method1251("sch-Utteln:");

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "Lclient!oa;")
	public static Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!sd;IB)[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] method1701(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2) {
		return Static106.method1918(arg2, arg1, arg0) ? Static80.method1506() : null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public static void method1702() {
		aClass45_1049 = null;
		aClass45_1048 = null;
		Class4_Sub2.anIntArray366 = null;
		aClass45_1051 = null;
		aClass67_20 = null;
		anIntArray367 = null;
		aClass52_1 = null;
		aClass45_1050 = null;
		aClass45Array17 = null;
		anIntArray368 = null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method1703() {
		Static121.aClass4_3.method1691();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static105.aLongArray6[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static54.aLongArray2[local22] = 0L;
		}
		Static88.anInt2503 = 0;
	}
}
