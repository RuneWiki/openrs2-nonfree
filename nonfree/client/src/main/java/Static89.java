import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	public static int anInt2231 = -1;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public static int anInt2233 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
	public static int method1941(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (arg0 * local24 >> 12) + 40960;
		return local33 * local18 >> 12;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1943(@OriginalArg(0) String arg0) {
		return Static270.method4743(arg0, 10);
	}
}
