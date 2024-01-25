import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "Lclient!vo;")
	public static Class381 aClass381_2;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "Lclient!u;")
	public static final Class352 aClass352_3 = new Class352("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BIII)I")
	public static int method1283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(31) int local31 = (arg2 & 0x7F) * local17 + (arg0 & 0x7F) * arg1 >> 7;
		@Pc(45) int local45 = local17 * (arg2 & 0x380) + (arg0 & 0x380) * arg1 >> 7;
		@Pc(59) int local59 = (arg0 & 0xFC00) * arg1 + (arg2 & 0xFC00) * local17 >> 7;
		return local45 & 0x380 | local59 & 0xFC00 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
	public static void method1288(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 8);
		local9.method2038();
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(BI)Z")
	public static boolean method1289(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
