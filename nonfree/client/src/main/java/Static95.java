import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
	public static int anInt2063;

	@OriginalMember(owner = "client!ij", name = "ib", descriptor = "[S")
	public static short[] aShortArray28;

	@OriginalMember(owner = "client!ij", name = "U", descriptor = "Lclient!jd;")
	public static Class61 aClass61_34 = new Class61(5);

	@OriginalMember(owner = "client!ij", name = "eb", descriptor = "I")
	public static int anInt2072 = 0;

	@OriginalMember(owner = "client!ij", name = "jb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_582 = Static231.method3737("Attack");

	@OriginalMember(owner = "client!ij", name = "gb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_581 = aClass107_582;

	@OriginalMember(owner = "client!ij", name = "kb", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = arg3 - arg5;
		@Pc(13) int local13 = arg0 - arg1;
		@Pc(30) int local30 = (arg2 - arg4 << 16) / local13;
		@Pc(39) int local39 = (arg6 - arg7 << 16) / local8;
		Static199.method3193(arg0, local39, arg4, arg3, arg1, arg5, local30, arg7);
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(IB)Z")
	public static boolean method1615(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
