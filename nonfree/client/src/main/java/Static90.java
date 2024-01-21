import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public static int anInt2532;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!jd;")
	public static Class11 aClass11_101;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!jd;")
	public static Class11 aClass11_102;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
	public static int[] anIntArray369 = new int[256];

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!s;")
	public static Class66 aClass66_9 = new Class66(4096);

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1052 = Static63.method1251("lila:");

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1053 = Static63.method1251("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1054 = Static63.method1251("mapback");

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public static int anInt2531 = 0;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1055 = Static63.method1251("@gre@");

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1056 = Static63.method1251("titlebox");

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1057 = Static63.method1251("Freunde");

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1058 = Static63.method1251("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1059 = Static63.method1251("@whi@ )4 ");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1704() {
		aClass45_1054 = null;
		aClass11_101 = null;
		aClass45_1056 = null;
		aClass45_1057 = null;
		aClass45_1059 = null;
		aClass45_1053 = null;
		aClass45_1055 = null;
		aClass11_102 = null;
		aClass66_9 = null;
		aClass45_1052 = null;
		aClass45_1058 = null;
		anIntArray369 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
	public static void method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class5_Sub2_Sub8 local16 = Static38.method798(arg0, arg1);
		if (local16 != null && local16.anObjectArray20 != null) {
			Static33.method687(0, null, 0, local16.anObjectArray20, 0, local16);
		}
		Static13.aBoolean12 = true;
		Static56.anInt1695 = arg1;
		Static101.anInt1044 = arg2;
		Static34.anInt956 = arg0;
	}
}
