import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "F")
	public static float aFloat21 = 0.0F;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString60 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)I")
	public static int method1284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = 0;
		while (arg1 > 0) {
			local9 = local9 << 1 | arg0 & 0x1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local9;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
	public static int method1285(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class3_Sub16 local19 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg0);
		if (local19 == null) {
			return Static2.method27(arg0).anInt5665;
		}
		@Pc(28) int local28 = 0;
		for (@Pc(37) int local37 = 0; local37 < local19.anIntArray294.length; local37++) {
			if (local19.anIntArray294[local37] == -1) {
				local28++;
			}
		}
		return local28 + Static2.method27(arg0).anInt5665 - local19.anIntArray294.length;
	}
}
