import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public static int anInt1803;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "I")
	public static int anInt1805 = 0;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean112 = true;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method1679(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static382.aClass174_182.method4208(Static300.anInt5192) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static1.aClass174_215.method4208(Static300.anInt5192) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)[Lclient!co;")
	public static Class35[] method1680() {
		return new Class35[] { Static80.aClass35_1, Static266.aClass35_5, Static246.aClass35_4, Static390.aClass35_7, Static238.aClass35_3, Static317.aClass35_6 };
	}
}
