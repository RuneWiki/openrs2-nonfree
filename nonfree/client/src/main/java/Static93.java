import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public static int anInt1613 = 0;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_26 = new Class198("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
	public static int anInt1623 = -1;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[128][128];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBZI)I")
	public static int method1314(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class5_Sub26 local10 = Static176.method2415(arg1, arg2);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray247.length > arg0) {
			return local10.anIntArray247[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method1315(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2_Sub9 local13 = Static72.method1073(6, arg0);
		local13.method3024();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	public static int method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(11) int local11 = 255 - local7;
		@Pc(29) int local29 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local29 + ((local11 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local11 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		Static193.method2590(arg2, arg4, arg1, arg3, arg0, 0, arg5);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!um;Z)V")
	public static void method1323(@OriginalArg(0) Class243 arg0) {
		Static94.anInt1631 = arg0.method5461("titlebg");
		Static1.anInt4522 = arg0.method5461("logo");
	}
}
