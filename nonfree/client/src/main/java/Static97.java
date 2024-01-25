import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
	public static int anInt1786 = 0;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_7 = new Class357("", 17);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!sha;I)Lclient!sha;")
	public static Class321 method1587(@OriginalArg(0) Class321 arg0) {
		if (arg0.anInt9033 != -1) {
			return Static286.method4134(arg0.anInt9033);
		}
		@Pc(20) int local20 = arg0.anInt9040 >>> 16;
		@Pc(32) Class331 local32 = new Class331(Static262.aClass209_35);
		for (@Pc(37) Class6_Sub51 local37 = (Class6_Sub51) local32.method7889(); local37 != null; local37 = (Class6_Sub51) local32.method7886()) {
			if (local20 == local37.anInt9360) {
				return Static286.method4134((int) local37.aLong314);
			}
		}
		return null;
	}
}
