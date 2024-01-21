import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!kh;")
	public static Class29 aClass29_37;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static final int anInt1945 = 5063219;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[Lclient!gb;")
	public static Class2_Sub1_Sub3_Sub2_Sub1[] aClass2_Sub1_Sub3_Sub2_Sub1Array1 = new Class2_Sub1_Sub3_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!cd;")
	private static Class10 aClass10_849 = Static51.method932("Loading wordpack )2 ");

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_850 = Static51.method932("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!cd;")
	public static Class10 aClass10_851 = aClass10_849;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	public static void method1369() {
		for (@Pc(12) int local12 = 0; local12 < Static64.anInt1578; local12++) {
			@Pc(18) int local18 = Static8.anIntArray15[local12];
			@Pc(22) Class2_Sub1_Sub3_Sub2_Sub2 local22 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local18];
			if (local22 != null) {
				Static48.method889(local22.aClass2_Sub1_Sub2_1.anInt72, local22);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!fa;)Z")
	public static boolean method1370(@OriginalArg(1) Class23 arg0) {
		if (Static54.aBoolean55) {
			if (Static126.method2068(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1090 == 0) {
				return false;
			}
		}
		return arg0.aBoolean49;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1371() {
		aClass10_850 = null;
		aClass2_Sub1_Sub3_Sub2_Sub1Array1 = null;
		aClass10_849 = null;
		aClass29_37 = null;
		anIntArray218 = null;
		aClass10_851 = null;
	}
}
