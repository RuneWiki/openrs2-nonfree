import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static99 {

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1011 = Static32.method683(" seconds)3");

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1008 = aClass49_1011;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
	public static boolean aBoolean88 = true;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1009 = Static32.method683("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1010 = Static32.method683("sl_stars");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)I")
	public static int method1724(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method1725() {
		aClass49_1009 = null;
		aClass49_1010 = null;
		aClass49_1011 = null;
		aClass49_1008 = null;
	}
}
