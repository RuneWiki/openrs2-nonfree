import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "[S")
	public static final short[] aShortArray53 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
	public static int anInt2276 = 0;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_13 = new Class42();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(J[IZI)Ljava/lang/String;")
	public static String method2188(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (Static285.anInterface8_2 != null) {
			@Pc(17) String local17 = Static285.anInterface8_2.method3457(arg1, arg2, arg0);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg0);
	}
}
