import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fm", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString63;

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString62 = "Please remove ";

	@OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
	public static int anInt1596 = 0;

	@OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
	public static int anInt1598 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIIII)I")
	public static int method1309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(25) int local25 = 65536 - Class11.anIntArray27[arg1 * 1024 / arg2] >> 1;
		return (arg0 * local25 >> 16) + ((65536 - local25) * arg3 >> 16);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)V")
	public static void method1310(@OriginalArg(1) int arg0) {
		Static99.anInt1825 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
	public static void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static175.anInt3267 <= arg3 && arg4 <= Static204.anInt4020 && arg0 >= Static245.anInt6027 && arg1 <= Static111.anInt2039) {
			Static269.method4453(arg2, arg0, arg1, arg4, arg3);
		} else {
			Static249.method4207(arg2, arg1, arg4, arg3, arg0);
		}
	}
}
