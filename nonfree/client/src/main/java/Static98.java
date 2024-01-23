import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics12;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[IIII)V")
	public static void method3942(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(9) int local9 = arg0 - 1;
		@Pc(12) int local12 = local9 - 7;
		while (arg3 < local12) {
			@Pc(17) int local17 = arg3 + 1;
			arg1[local17] = arg2;
			@Pc(22) int local22 = local17 + 1;
			arg1[local22] = arg2;
			@Pc(27) int local27 = local22 + 1;
			arg1[local27] = arg2;
			@Pc(32) int local32 = local27 + 1;
			arg1[local32] = arg2;
			@Pc(37) int local37 = local32 + 1;
			arg1[local37] = arg2;
			@Pc(42) int local42 = local37 + 1;
			arg1[local42] = arg2;
			@Pc(47) int local47 = local42 + 1;
			arg1[local47] = arg2;
			arg3 = local47 + 1;
			arg1[arg3] = arg2;
		}
		while (local9 > arg3) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)V")
	public static void method3944() {
		Static9.anInt285 = 1;
		Static190.aBoolean261 = false;
		Static295.anInt5889 = -1;
		Static309.anInt6195 = 2;
		Static254.aClass168_172 = null;
		Static203.anInt5699 = -1;
		Static296.anInt5906 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public static void method3947(@OriginalArg(1) int arg0) {
		if (Static9.anInt285 == 0) {
			Static2.aClass1_Sub10_Sub3_1.method3179(arg0);
		} else {
			Static296.anInt5906 = arg0;
		}
	}
}
