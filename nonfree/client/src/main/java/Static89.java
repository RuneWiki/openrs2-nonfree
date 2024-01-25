import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static89 {

	@OriginalMember(owner = "client!daa", name = "o", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!daa", name = "l", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!daa", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString23 = null;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)Z")
	public static boolean method1685() {
		return Static313.anInt9044 > 0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBIIIIIII)Z")
	public static boolean method1687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 + arg5 > arg0 && arg0 + arg1 > arg5) {
			return arg2 + arg7 > arg3 && arg4 + arg3 > arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IJ)V")
	public static void method1689(@OriginalArg(1) long arg0) {
		Static170.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)I")
	public static int method1690() {
		if ((double) Static498.aFloat217 == 3.0D) {
			return 37;
		} else if ((double) Static498.aFloat217 == 4.0D) {
			return 50;
		} else if ((double) Static498.aFloat217 == 6.0D) {
			return 75;
		} else if ((double) Static498.aFloat217 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
