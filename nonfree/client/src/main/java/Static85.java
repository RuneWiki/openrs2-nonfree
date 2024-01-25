import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "Lclient!la;")
	public static Class208 aClass208_16;

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "Lclient!fs;")
	public static Class134 aClass134_7;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "Lclient!hg;")
	public static Class158 aClass158_2;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "[Lclient!ll;")
	public static final Class5_Sub35[] aClass5_Sub35Array1 = new Class5_Sub35[1024];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public static void method1305() {
		if (Static109.anInterface14Array1 == null) {
			return;
		}
		@Pc(14) Interface14[] local14 = Static109.anInterface14Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface14 local22 = local14[local16];
			local22.method7948();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIII)V")
	public static void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg3; local7++) {
			Static646.method7025(Static569.anIntArrayArray54[local7], arg1, arg2, arg0);
		}
	}
}
