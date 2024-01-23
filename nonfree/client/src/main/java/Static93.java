import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!bn;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString114 = "flash1:";

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
	public static int[] anIntArray267 = new int[128];

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "[I")
	public static int[] anIntArray268 = new int[2000];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I")
	public static int method2548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	public static void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static190.method3151(arg1 + arg3, Static253.anIntArrayArray34[arg0], arg2, arg1 - arg3);
		@Pc(17) int local17 = 0;
		@Pc(29) int local29 = -arg3;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = -1;
		while (local31 > local17) {
			local17++;
			local33 += 2;
			local29 += local33;
			if (local29 >= 0) {
				local31--;
				local29 -= local31 << 1;
				@Pc(65) int[] local65 = Static253.anIntArrayArray34[arg0 - local31];
				@Pc(70) int local70 = arg1 + local17;
				@Pc(76) int[] local76 = Static253.anIntArrayArray34[local31 + arg0];
				@Pc(80) int local80 = arg1 - local17;
				Static190.method3151(local70, local76, arg2, local80);
				Static190.method3151(local70, local65, arg2, local80);
			}
			@Pc(99) int[] local99 = Static253.anIntArrayArray34[arg0 + local17];
			@Pc(106) int[] local106 = Static253.anIntArrayArray34[arg0 - local17];
			@Pc(111) int local111 = arg1 - local31;
			@Pc(115) int local115 = arg1 + local31;
			Static190.method3151(local115, local99, arg2, local111);
			Static190.method3151(local115, local106, arg2, local111);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method2552() {
		Static136.aClass172_23.method4346();
		Static177.aClass172_34.method4346();
		Static95.aClass172_18.method4346();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2553(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static291.aClass48_1);
		arg0.removeMouseMotionListener(Static291.aClass48_1);
		arg0.removeFocusListener(Static291.aClass48_1);
		Static286.anInt5587 = 0;
	}
}
