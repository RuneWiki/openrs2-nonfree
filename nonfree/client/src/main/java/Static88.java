import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!dg", name = "Xc", descriptor = "Lclient!mv;")
	public static final Class219 aClass219_1 = new Class219(10, 2, 2, 0);

	@OriginalMember(owner = "client!dg", name = "sd", descriptor = "[Lclient!bg;")
	public static final Class29[] aClass29Array1 = new Class29[16];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2034(@OriginalArg(0) String arg0) {
		if (Class229.aString77.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class229.aString77.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class229.aString77.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Z")
	public static boolean method2036() {
		return Static178.anInt3592 == 0 ? Static547.aClass3_Sub14_Sub4_3.method7843() : true;
	}
}
