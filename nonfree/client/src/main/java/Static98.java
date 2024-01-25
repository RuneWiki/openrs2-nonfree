import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dv", name = "Z", descriptor = "Lclient!kg;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!dv", name = "Y", descriptor = "[I")
	public static final int[] anIntArray234 = new int[5];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
	public static boolean method1512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static448.anIntArrayArrayArray18[arg0][arg1][arg2];
		if (local7 == -Static216.anInt3692) {
			return false;
		} else if (local7 == Static216.anInt3692) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static188.anInt3275;
			@Pc(26) int local26 = arg2 << Static188.anInt3275;
			if (Static236.method3450(local22 + 1, Static285.aClass60Array8[arg0].JA(arg1, arg2), local26 + 1) && Static236.method3450(local22 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1 + 1, arg2), local26 + 1) && Static236.method3450(local22 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1 + 1, arg2 + 1), local26 + Static57.anInt953 - 1) && Static236.method3450(local22 + 1, Static285.aClass60Array8[arg0].JA(arg1, arg2 + 1), local26 + Static57.anInt953 - 1) && Static236.method3450(local22 + Static431.anInt7547, Static285.aClass60Array8[arg0].JA(arg1, arg2), local26 + 1) && Static236.method3450(local22 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1 + 1, arg2), local26 + Static431.anInt7547) && Static236.method3450(local22 + Static431.anInt7547, Static285.aClass60Array8[arg0].JA(arg1, arg2 + 1), local26 + Static57.anInt953 - 1) && Static236.method3450(local22 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1, arg2), local26 + Static431.anInt7547) && Static236.method3450(local22 + Static431.anInt7547, Static285.aClass60Array8[arg0].JA(arg1, arg2), local26 + Static431.anInt7547)) {
				Static448.anIntArrayArrayArray18[arg0][arg1][arg2] = Static216.anInt3692;
				return true;
			} else {
				Static448.anIntArrayArrayArray18[arg0][arg1][arg2] = -Static216.anInt3692;
				return false;
			}
		}
	}
}
