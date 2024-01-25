import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public static void method90() {
		Static166.aClass100_1 = new Class100(8);
		Static246.anInt4588 = 0;
		for (@Pc(17) Class3_Sub2 local17 = (Class3_Sub2) Static384.aClass84_8.method2312(); local17 != null; local17 = (Class3_Sub2) Static384.aClass84_8.method2309()) {
			local17.method165();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)I")
	public static int method92(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
