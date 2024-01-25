import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
	public static int anInt1491;

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
	public static int anInt1496;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method1301(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static156.anInt2487;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(29) Class58 local29 = Static232.aClass176_1.method3609(arg0[local18]);
			if (local29.anInt1166 != -1) {
				@Pc(42) Class38 local42 = (Class38) Static465.aClass21_71.method324((long) local29.anInt1166);
				if (local42 == null) {
					@Pc(50) Class344 local50 = Static603.method7117(Static241.aClass229_54, local29.anInt1166, 0);
					if (local50 != null) {
						local42 = Static417.aClass162_17.method6845(local50, true);
						Static465.aClass21_71.method317(local42, (long) local29.anInt1166);
					}
				}
				if (local42 != null) {
					Static389.aClass38Array21[local11] = local42;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)V")
	public static void method1302() {
		for (@Pc(7) int local7 = 0; local7 < Static268.aClass75ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static268.aClass75ArrayArray1[local7].length; local11++) {
				Static268.aClass75ArrayArray1[local7][local11] = Static135.aClass75_5;
			}
		}
	}
}
