import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "Lclient!db;")
	public static final Class64 aClass64_419 = new Class64(72, 6);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!gba;II)Ljava/lang/String;")
	public static String method6651(@OriginalArg(0) Class115 arg0, @OriginalArg(2) int arg1) {
		if (!Static69.method1233(arg0).method4967(arg1) && arg0.anObjectArray26 == null) {
			return null;
		} else if (arg0.aStringArray11 == null || arg0.aStringArray11.length <= arg1 || arg0.aStringArray11[arg1] == null || arg0.aStringArray11[arg1].trim().length() == 0) {
			return Static126.aBoolean235 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray11[arg1];
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z")
	public static boolean method6652(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
