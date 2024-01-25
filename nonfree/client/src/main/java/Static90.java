import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static90 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_36 = new Class73(75, 3);

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_24 = new Class185(3, 16);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)V")
	public static void method2285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static25.aClass290_5 == Static8.aClass290_1) {
			if (!Static168.method3192(0, 0, 1, -2, arg0, arg1, false, 1)) {
				Static168.method3192(0, 0, 1, -3, arg0, arg1, false, 1);
			}
		} else if (!Static168.method3192(0, 0, 1, -3, arg0, arg1, false, 1)) {
			Static168.method3192(0, 0, 1, -2, arg0, arg1, false, 1);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZZ)Ljava/lang/String;")
	public static String method2286(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static537.method7607(arg0, arg1) : Integer.toString(arg0);
	}
}
