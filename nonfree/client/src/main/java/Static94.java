import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_874 = Static177.method3050("red:");

	@OriginalMember(owner = "client!ke", name = "kb", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ke", name = "lb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_875 = Static177.method3050("hint_headicons");

	@OriginalMember(owner = "client!ke", name = "mb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_876 = aClass46_874;

	@OriginalMember(owner = "client!ke", name = "nb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_877 = Static177.method3050("sl_stars");

	@OriginalMember(owner = "client!ke", name = "pb", descriptor = "[S")
	public static final short[] aShortArray27 = new short[] { 33, 58, 20, 5, 28, 42, 24, 26 };

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_878 = aClass46_874;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V")
	public static void method1841(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static48.anInt1228 = -1;
			Static162.anInt3591 = -1;
			return;
		}
		@Pc(33) int local33 = Static106.method1998(arg1, Static73.anInt1873, arg2) - arg0;
		@Pc(37) int local37 = local33 - Static111.anInt2724;
		@Pc(41) int local41 = arg2 - Static135.anInt3214;
		@Pc(45) int local45 = arg1 - Static119.anInt2886;
		@Pc(49) int local49 = Class4_Sub1_Sub7_Sub4.anIntArray416[Static15.anInt456];
		@Pc(53) int local53 = Class4_Sub1_Sub7_Sub4.anIntArray412[Static15.anInt456];
		@Pc(57) int local57 = Class4_Sub1_Sub7_Sub4.anIntArray412[Static4.anInt2849];
		@Pc(61) int local61 = Class4_Sub1_Sub7_Sub4.anIntArray416[Static4.anInt2849];
		@Pc(76) int local76 = local61 * local45 + local57 * local41 >> 16;
		@Pc(87) int local87 = local41 * local61 - local45 * local57 >> 16;
		@Pc(89) int local89 = local76;
		@Pc(100) int local100 = local37 * local49 - local53 * local87 >> 16;
		@Pc(110) int local110 = local53 * local37 + local49 * local87 >> 16;
		if (local110 < 50) {
			Static162.anInt3591 = -1;
			Static48.anInt1228 = -1;
		} else {
			Static48.anInt1228 = (local100 << 9) / local110 + 167;
			Static162.anInt3591 = (local89 << 9) / local110 + 256;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!a;)Z")
	public static boolean method1843(@OriginalArg(1) Class1 arg0) {
		if (Static120.aBoolean150) {
			if (Static102.method1954(arg0) != 0) {
				return false;
			}
			if (arg0.anInt7 == 0) {
				return false;
			}
		}
		return arg0.aBoolean5;
	}
}
