import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	public static int anInt2130;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1216 = Static122.method531("sch-Utteln:");

	@OriginalMember(owner = "client!m", name = "V", descriptor = "Lclient!b;")
	public static Class7 aClass7_13 = new Class7(64);

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1218 = Static122.method531("The server is being updated)3");

	@OriginalMember(owner = "client!m", name = "W", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1217 = aClass73_1218;

	@OriginalMember(owner = "client!m", name = "jb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1219 = Static122.method531("scroll:");

	@OriginalMember(owner = "client!m", name = "kb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1220 = aClass73_1219;

	@OriginalMember(owner = "client!m", name = "lb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1221 = aClass73_1219;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BI)I")
	public static int method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class3_Sub1_Sub10.anIntArray172[(arg2[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
	public static void method1660() {
		aClass73_1218 = null;
		aClass73_1221 = null;
		aClass73_1220 = null;
		aClass73_1216 = null;
		aClass73_1217 = null;
		aClass73_1219 = null;
		anIntArray222 = null;
		aClass7_13 = null;
	}
}
