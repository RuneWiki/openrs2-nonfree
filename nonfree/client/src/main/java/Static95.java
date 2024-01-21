import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt2362;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!jc;")
	public static Class40 aClass40_28;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!ch;")
	public static Class14 aClass14_122 = new Class14(64);

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1406 = Static107.method1838("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1403 = aClass28_1406;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1405 = Static107.method1838("Cancel");

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1404 = aClass28_1405;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1407 = Static107.method1838("<col=ff9040>");

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public static int anInt2365 = -1;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public static int anInt2366 = 0;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public static int anInt2368 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public static void method1644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int[] local13 = new int[4];
		local13[0] = arg1;
		@Pc(20) int[] local20 = new int[4];
		@Pc(22) int local22 = 1;
		local20[0] = arg0;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static96.anIntArray229[local28] != arg1) {
				local13[local22] = Static96.anIntArray229[local28];
				local20[local22] = Static160.anIntArray326[local28];
				local22++;
			}
		}
		Static96.anIntArray229 = local13;
		Static160.anIntArray326 = local20;
		Static41.method739(Static47.aClass31Array3.length - 1, Static160.anIntArray326, Static47.aClass31Array3, Static96.anIntArray229, 0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1645() {
		aClass40_28 = null;
		aClass28_1407 = null;
		aClass28_1403 = null;
		aClass28_1405 = null;
		aClass28_1406 = null;
		aClass28_1404 = null;
		aClass14_122 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)V")
	public static void method1646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static131.method2109(arg0)) {
			Static46.method887(arg1, Static23.aClass24ArrayArray1[arg0]);
		}
	}
}
