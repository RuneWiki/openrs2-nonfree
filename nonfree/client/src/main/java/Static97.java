import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public static int anInt1852;

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
	public static int anInt1883;

	@OriginalMember(owner = "client!ge", name = "gb", descriptor = "I")
	public static int anInt1886;

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "[S")
	public static short[] aShortArray13 = new short[256];

	@OriginalMember(owner = "client!ge", name = "Eb", descriptor = "Ljava/lang/String;")
	public static String aString76 = "flash3:";

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)Lclient!h;")
	public static Class90 method1552(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static150.aFloat19 == 3.0D) {
				return Static83.aClass90_3;
			}
			if ((double) Static150.aFloat19 == 4.0D) {
				return Static5.aClass90_1;
			}
			if ((double) Static150.aFloat19 == 6.0D) {
				return Static342.aClass90_6;
			}
			if ((double) Static150.aFloat19 >= 8.0D) {
				return Static268.aClass90_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static150.aFloat19 == 3.0D) {
				return Static342.aClass90_6;
			}
			if ((double) Static150.aFloat19 == 4.0D) {
				return Static268.aClass90_7;
			}
			if ((double) Static150.aFloat19 == 6.0D) {
				return Static309.aClass90_8;
			}
			if ((double) Static150.aFloat19 >= 8.0D) {
				return Static92.aClass90_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static150.aFloat19 == 3.0D) {
				return Static309.aClass90_8;
			}
			if ((double) Static150.aFloat19 == 4.0D) {
				return Static92.aClass90_4;
			}
			if ((double) Static150.aFloat19 == 6.0D) {
				return Static355.aClass90_9;
			}
			if ((double) Static150.aFloat19 >= 8.0D) {
				return Static47.aClass90_2;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)I")
	public static int method1560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static114.method1830(4, arg1 + 91923, arg0 + 45365) + (Static114.method1830(2, arg1 + 37821, arg0 + 10294) + -128 >> 1) + (Static114.method1830(1, arg1, arg0) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}
}
