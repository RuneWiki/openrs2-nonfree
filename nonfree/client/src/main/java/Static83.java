import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!daa", name = "L", descriptor = "Lclient!hga;")
	public static Class123 aClass123_63;

	@OriginalMember(owner = "client!daa", name = "P", descriptor = "Lclient!is;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!daa", name = "Q", descriptor = "I")
	public static int anInt2240 = 16777215;

	@OriginalMember(owner = "client!daa", name = "T", descriptor = "I")
	public static int anInt2243 = 0;

	@OriginalMember(owner = "client!daa", name = "Y", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!ie;B)V")
	public static void method1913(@OriginalArg(0) Class3_Sub26 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static291.anInt5439; local7++) {
			@Pc(13) int local13 = arg0.method6832();
			@Pc(19) int local19 = arg0.method6811();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static23.aClass48_Sub1Array1[local13] != null) {
				Static23.aClass48_Sub1Array1[local13].anInt1526 = local19;
			}
		}
	}
}
