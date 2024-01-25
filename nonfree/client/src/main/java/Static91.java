import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
	public static int anInt1705;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString17 = "";

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
	public static int anInt1707 = 0;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)Z")
	public static boolean method1432(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
	public static void method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static28.aClass53ArrayArrayArray1[0][arg1][arg2] != null && Static28.aClass53ArrayArrayArray1[0][arg1][arg2].aClass53_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static28.aClass53ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(44) Class53 local44 = Static28.aClass53ArrayArrayArray1[local22][arg1][arg2] = new Class53(local22);
				if (local20) {
					local44.aByte28++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!paa;I)Ljava/lang/String;")
	public static String method1438(@OriginalArg(0) Class261 arg0) {
		if (Static76.method1071(arg0).method6880() == 0) {
			return null;
		} else if (arg0.aString94 == null || arg0.aString94.trim().length() == 0) {
			return Static488.aBoolean602 ? "Hidden-use" : null;
		} else {
			return arg0.aString94;
		}
	}
}
