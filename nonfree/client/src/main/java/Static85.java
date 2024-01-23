import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
	public static int[] anIntArray123 = new int[2048];

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[Lclient!vi;")
	public static Class36_Sub7[] aClass36_Sub7Array1 = new Class36_Sub7[4];

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!ok;")
	public static Class125 aClass125_22 = new Class125(64);

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Please wait...";

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
	public static int anInt1820 = 50;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V")
	public static void method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg4 + 1;
		Static19.method343(arg0, arg3, Static181.anIntArrayArray19[arg4], arg2);
		@Pc(13) int local13 = arg1 - 1;
		Static19.method343(arg0, arg3, Static181.anIntArrayArray19[arg1], arg2);
		for (@Pc(25) int local25 = local4; local25 <= local13; local25++) {
			@Pc(36) int[] local36 = Static181.anIntArrayArray19[local25];
			local36[arg0] = local36[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
	public static int method1383(@OriginalArg(0) int arg0) {
		if (Static95.aClass92_4 != null) {
			Static95.aClass92_4.method2176();
			Static95.aClass92_4 = null;
		}
		Static288.anInt1355++;
		if (Static288.anInt1355 > 4) {
			Static288.anInt1355 = 0;
			Static46.anInt1042 = 0;
			return arg0;
		}
		if (Static37.anInt3863 == Static33.anInt764) {
			Static33.anInt764 = Static209.anInt4334;
		} else {
			Static33.anInt764 = Static37.anInt3863;
		}
		Static46.anInt1042 = 0;
		return -1;
	}
}
