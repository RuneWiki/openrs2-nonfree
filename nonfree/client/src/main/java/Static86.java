import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	public static int anInt1957;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_48 = new Class81(114, 7);

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_49 = new Class81(60, -2);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
	public static void method1720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg4 + 1;
		Static250.method4000(arg3, Static478.anIntArrayArray51[arg4], arg2, arg0);
		@Pc(20) int local20 = arg1 - 1;
		Static250.method4000(arg3, Static478.anIntArrayArray51[arg1], arg2, arg0);
		for (@Pc(31) int local31 = local5; local31 <= local20; local31++) {
			@Pc(37) int[] local37 = Static478.anIntArrayArray51[local31];
			local37[arg2] = local37[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Z")
	public static boolean method1721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static157.method2423(arg1, arg0) & Static501.method6978(arg1, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)Z")
	public static boolean method1722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static28.method2623(arg0, arg1) | (arg1 & 0x60000) != 0 || Static515.method7050(arg1, arg0) || Static205.method3505(arg0, arg1);
	}
}
