import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "Lclient!ae;")
	public static Class4 aClass4_10;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
	public static int anInt1912;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "Lclient!nl;")
	public static Class171 aClass171_31;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	public static int anInt1906 = 0;

	@OriginalMember(owner = "client!fl", name = "V", descriptor = "J")
	public static long aLong71 = -1L;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
	public static void method1857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static144.anInt2880 == 1) {
			Static53.method897(arg0, arg1, Static15.aClass2_Sub26_1);
		} else if (Static144.anInt2880 == 2) {
			Static264.method4081(arg1, arg0);
		}
		Static144.anInt2880 = 0;
		Static15.aClass2_Sub26_1 = null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)I")
	public static int method1862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 <= arg0) {
			return arg0 <= arg1 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIBI)V")
	public static void method1865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg4 + 1;
		Static315.method4662(arg1, Static15.anIntArrayArray1[arg4], arg3, arg0);
		@Pc(19) int local19 = arg2 - 1;
		Static315.method4662(arg1, Static15.anIntArrayArray1[arg2], arg3, arg0);
		for (@Pc(30) int local30 = local6; local30 <= local19; local30++) {
			@Pc(36) int[] local36 = Static15.anIntArrayArray1[local30];
			local36[arg3] = local36[arg1] = arg0;
		}
	}
}
