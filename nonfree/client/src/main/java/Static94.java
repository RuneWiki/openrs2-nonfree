import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[128][128];

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "J")
	public static long aLong53 = 0L;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_35 = new Class180(25, 0);

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
	public static int[] anIntArray148 = new int[2];

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)Z")
	public static boolean method1709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static493.method7095(arg0, arg1) | Static60.method1284(arg0, arg1) | Static623.method8759(arg1, arg0)) & Static393.method5548(arg1, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(FFFI)I")
	public static int method1710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(20) float local20 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(29) float local29 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(38) float local38 = arg2 < 0.0F ? -arg2 : arg2;
		if (local20 < local29 && local29 > local38) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local38 > local20 && local29 < local38) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)Z")
	public static boolean method1711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
