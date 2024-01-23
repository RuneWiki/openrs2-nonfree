import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Lclient!e;")
	public static Class38 aClass38_2;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1737(@OriginalArg(1) int arg0) {
		@Pc(4) String local4 = Integer.toString(arg0);
		for (@Pc(9) int local9 = local4.length() - 3; local9 > 0; local9 -= 3) {
			local4 = local4.substring(0, local9) + "," + local4.substring(local9);
		}
		if (local4.length() > 9) {
			return " <col=00ff80>" + local4.substring(0, local4.length() - 8) + Static279.aString197 + " (" + local4 + ")</col>";
		} else if (local4.length() <= 6) {
			return " <col=ffff00>" + local4 + "</col>";
		} else {
			return " <col=ffffff>" + local4.substring(0, local4.length() - 4) + Static39.aString32 + " (" + local4 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method1738() {
		Static210.aClass175_33.method4294();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	public static void method1739() {
		Static89.aClass175_13.method4287();
		Static111.aClass175_17.method4287();
	}
}
