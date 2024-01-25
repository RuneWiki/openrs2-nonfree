import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	public static int anInt1760;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	public static int anInt1762;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Ljava/lang/String;")
	public static final String aString72 = "flash3:";

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public static int anInt1761 = 0;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "Lclient!br;")
	public static final Class26 aClass26_10 = new Class26(8);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I")
	public static int method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!qj;)V")
	public static void method1715(@OriginalArg(1) Class165 arg0) {
		Static256.aClass165_75 = arg0;
		Static145.anInt2849 = Static256.aClass165_75.method4499(15);
	}
}
