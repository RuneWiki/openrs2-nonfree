import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt1797;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!cd;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public static int anInt1799;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9 = new String[1000];

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V")
	public static void method1498(@OriginalArg(0) int arg0) {
		if (!Static48.method951(arg0)) {
			return;
		}
		@Pc(18) Class97[] local18 = Static217.aClass97ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(28) Class97 local28 = local18[local20];
			if (local28 != null) {
				local28.anInt3120 = 1;
				local28.anInt3194 = 0;
				local28.anInt3188 = 0;
			}
		}
	}
}
