import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "Lclient!ek;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
	public static int anInt2256;

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
	public static int anInt2259;

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "Lclient!db;")
	public static final Class64 aClass64_78 = new Class64(15, 3);

	@OriginalMember(owner = "client!dca", name = "i", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_2 = new Class210(12, 0, 1, 0);

	@OriginalMember(owner = "client!dca", name = "m", descriptor = "Lclient!db;")
	public static final Class64 aClass64_79 = new Class64(27, 17);

	@OriginalMember(owner = "client!dca", name = "n", descriptor = "I")
	public static int anInt2258 = -1;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2041(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method2042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static375.method5597(arg0, arg3, 0, arg5, arg4, arg2, arg1);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)Z")
	public static boolean method2043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static354.method5233(arg1, arg0) || Static515.method7276(arg0, arg1);
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(III)I")
	public static int method2045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static579.method7869(arg1 - 1, arg0 - 1) + Static579.method7869(arg1 - 1, arg0 - -1) + Static579.method7869(arg1 + 1, arg0 + -1) + Static579.method7869(arg1 - -1, arg0 + 1);
		@Pc(71) int local71 = Static579.method7869(arg1, arg0 - 1) + Static579.method7869(arg1, arg0 + 1) + Static579.method7869(arg1 - 1, arg0) + Static579.method7869(arg1 + 1, arg0);
		@Pc(76) int local76 = Static579.method7869(arg1, arg0);
		return local76 / 4 + local41 / 16 + local71 / 8;
	}
}
