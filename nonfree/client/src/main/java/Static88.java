import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!g", name = "M", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "Lclient!rg;")
	public static Class151 aClass151_2;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "Lclient!pl;")
	public static Class139 aClass139_2;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Started 3d Library";

	@OriginalMember(owner = "client!g", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString69 = "M";

	@OriginalMember(owner = "client!g", name = "W", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "[J")
	public static long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
	public static int anInt1660 = 0;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
	public static int anInt1661 = 0;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(II)Ljava/lang/String;")
	public static String method1352(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)V")
	public static void method1354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static245.method4932(arg1)) {
			Static299.method4831(arg0, Static96.aClass151ArrayArray1[arg1]);
		}
	}
}
