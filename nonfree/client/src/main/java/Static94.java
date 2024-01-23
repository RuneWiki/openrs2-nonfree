import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static94 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt1774;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!gi;")
	public static Class64 aClass64_14 = new Class64(64);

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "Lclient!cd;")
	public static Class22 aClass22_10 = new Class22(16);

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString52 = "flash2:";

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
	public static volatile int anInt1785 = 0;

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
	public static int anInt1786 = -1;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1537(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
