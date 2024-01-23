import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!h", name = "D", descriptor = "Lclient!vd;")
	public static Class185 aClass185_1;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!qj;")
	public static Class148 aClass148_6 = new Class148(64);

	@OriginalMember(owner = "client!h", name = "n", descriptor = "[I")
	public static int[] anIntArray172 = new int[3];

	@OriginalMember(owner = "client!h", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString116 = null;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	public static int anInt2007 = 0;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!bk;")
	public static Class17 method1803(@OriginalArg(1) int arg0) {
		@Pc(6) Class17 local6 = (Class17) Static296.aClass187_148.method4527((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22 = Static270.aClass121_120.method3115(16, arg0);
		local6 = new Class17();
		if (local22 != null) {
			local6.method384(new Class1_Sub14(local22));
		}
		Static296.aClass187_148.method4524((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	public static int method1806(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local25 >> 12) + 40960;
		return local34 * local13 >> 12;
	}
}
