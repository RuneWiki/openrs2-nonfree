import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!bi;Lclient!bi;I)V")
	public static void method1579(@OriginalArg(1) Class31 arg0, @OriginalArg(2) Class31 arg1) {
		Static143.aClass31_31 = arg1;
		Static47.aClass31_13 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
	public static boolean method1580(@OriginalArg(0) int arg0) {
		Static102.anInt2529 = arg0 + 1 & 0xFFFF;
		Static532.aBoolean629 = true;
		return true;
	}
}
