import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!sb;")
	public static Class219 aClass219_3;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "[S")
	public static short[] aShortArray52 = new short[256];

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "F")
	public static float aFloat42 = 0.25F;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Z")
	public static boolean method2905(@OriginalArg(1) int arg0) {
		return arg0 == 44 || arg0 == 9 || arg0 == 1012 || arg0 == 18 || arg0 == 16;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
	public static void method2906(@OriginalArg(1) int arg0) {
		Static287.anInt5028 = 100;
		Static427.anInt7220 = -1;
		Static154.anInt2613 = 3;
		Static125.anInt2319 = arg0;
	}
}
