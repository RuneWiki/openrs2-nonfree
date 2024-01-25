import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!gj;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)Z")
	public static boolean method1377(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
	public static int method1378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = Integer.MAX_VALUE & local15 * (local15 * 15731 * local15 + 789221) + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
