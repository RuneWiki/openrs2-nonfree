import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
	public static int anInt2158;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "[Lclient!ac;")
	public static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "[I")
	public static final int[] anIntArray126 = new int[5];

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)V")
	public static void method1988() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Long local22 = (Long) local12.invoke(local16, (Object[]) null);
					Static46.anInt1196 = (int) (local22 / 1048576L) + 1;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)Z")
	public static boolean method1989(@OriginalArg(1) int arg0) {
		if (arg0 == 15 || arg0 == 51 || arg0 == 6 || arg0 == 13 || arg0 == 46) {
			return true;
		} else {
			return arg0 == 39 || arg0 == 12 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIBI)V")
	public static void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class5_Sub19 local17 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg3);
		if (local17 == null) {
			local17 = new Class5_Sub19();
			Static331.aClass42_54.method1050((long) arg3, local17);
		}
		if (local17.anIntArray135.length <= arg2) {
			@Pc(45) int[] local45 = new int[arg2 + 1];
			@Pc(50) int[] local50 = new int[arg2 + 1];
			for (@Pc(52) int local52 = 0; local52 < local17.anIntArray135.length; local52++) {
				local45[local52] = local17.anIntArray135[local52];
				local50[local52] = local17.anIntArray134[local52];
			}
			for (@Pc(82) int local82 = local17.anIntArray135.length; local82 < arg2; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local17.anIntArray135 = local45;
			local17.anIntArray134 = local50;
		}
		local17.anIntArray135[arg2] = arg0;
		local17.anIntArray134[arg2] = arg1;
	}
}
