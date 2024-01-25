import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static83 {

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_3 = new Class286("", 19);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
	public static boolean method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static392.aByteArrayArrayArray16[1].length && arg1 < Static392.aByteArrayArrayArray16[1][arg0].length) {
			return (Static392.aByteArrayArrayArray16[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!oh;)Ljava/lang/String;")
	public static String method1240(@OriginalArg(1) Class273 arg0) {
		if (Static91.method1412(arg0).method3010() == 0) {
			return null;
		} else if (arg0.aString84 == null || arg0.aString84.trim().length() == 0) {
			return Static311.aBoolean411 ? "Hidden-use" : null;
		} else {
			return arg0.aString84;
		}
	}
}
