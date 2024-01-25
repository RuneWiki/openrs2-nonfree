import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "Lclient!f;")
	public static Class49 aClass49_7;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	public static int anInt1679 = 503;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)Lclient!vg;")
	public static Class250 method1379(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static369.aClass250ArrayArray5[local7] == null || Static369.aClass250ArrayArray5[local7][local18] == null) {
			@Pc(32) boolean local32 = Static266.method2725(local7);
			if (!local32) {
				return null;
			}
		}
		return Static369.aClass250ArrayArray5[local7][local18];
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(IB)Ljava/lang/String;")
	public static String method1380(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
