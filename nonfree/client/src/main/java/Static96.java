import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!oa;")
	public static Class62 aClass62_4;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt2774 = -1;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!dd;")
	private static Class13 aClass13_882 = Static161.method2971("Too many connections from your address)3");

	@OriginalMember(owner = "client!la", name = "c", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array19 = new Class13[1000];

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_883 = Static161.method2971("Cabbage");

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!dd;")
	private static Class13 aClass13_885 = Static161.method2971("No reply from loginserver)3");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_884 = aClass13_885;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	public static int[] anIntArray263 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_886 = aClass13_882;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1989() {
		aClass13_885 = null;
		aClass13_883 = null;
		aClass13_882 = null;
		aClass13_886 = null;
		aClass13_884 = null;
		aClass62_4 = null;
		aClass13Array19 = null;
		anIntArray263 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass7_1 != null && local7.aClass7_1.aLong33 == arg3) {
			return true;
		} else if (local7.aClass69_1 != null && local7.aClass69_1.aLong114 == arg3) {
			return true;
		} else if (local7.aClass56_1 != null && local7.aClass56_1.aLong104 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1544; local46++) {
				if (local7.aClass59Array4[local46].aLong106 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
