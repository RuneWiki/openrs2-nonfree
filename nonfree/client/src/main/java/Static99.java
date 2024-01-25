import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static99 {

	@OriginalMember(owner = "client!dea", name = "F", descriptor = "Lclient!ae;")
	public static Class8 aClass8_29;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method1638(@OriginalArg(1) Class8 arg0) {
		aClass8_29 = arg0;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(IIB)Z")
	public static boolean method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
