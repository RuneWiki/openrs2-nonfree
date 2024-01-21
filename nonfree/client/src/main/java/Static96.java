import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
	public static int anInt2001;

	@OriginalMember(owner = "client!jc", name = "kb", descriptor = "I")
	public static int anInt2007;

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
	public static int anInt2000 = 0;

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_993 = Static193.method3027("To create a new account you need to");

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_992 = aClass70_993;

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
	public static int anInt2006 = 0;

	@OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
	public static int anInt2009 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method1398() {
		for (@Pc(1) int local1 = 0; local1 < Static201.anInt4110; local1++) {
			@Pc(6) int local6 = Static80.anIntArray85[local1];
			@Pc(10) Class26_Sub2_Sub2 local10 = Static8.aClass26_Sub2_Sub2Array1[local6];
			if (local10 != null) {
				Static78.method1142(local10.aClass3_Sub3_Sub24_1.anInt3954, local10);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIII)V")
	public static void method1399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = Static130.method1827(Static52.anInt1117, arg4, Static26.anInt554);
		@Pc(15) int local15 = Static130.method1827(Static52.anInt1117, arg3, Static26.anInt554);
		@Pc(21) int local21 = Static130.method1827(Static200.anInt4074, arg1, Static119.anInt2428);
		@Pc(27) int local27 = Static130.method1827(Static200.anInt4074, arg0, Static119.anInt2428);
		for (@Pc(29) int local29 = local9; local29 <= local15; local29++) {
			Static16.method302(arg2, local21, local27, Static157.anIntArrayArray24[local29]);
		}
	}
}
