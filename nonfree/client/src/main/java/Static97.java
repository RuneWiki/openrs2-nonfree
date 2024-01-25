import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!en", name = "K", descriptor = "I")
	public static int anInt1705;

	@OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
	public static int anInt1709;

	@OriginalMember(owner = "client!en", name = "J", descriptor = "[I")
	public static final int[] anIntArray78 = new int[2048];

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public static void method1390() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static425.anInt6922; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static251.anInt4072; local18++) {
				if (Static345.method4398(local7, local14, Static159.aClass82ArrayArrayArray2, true, local18)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)Z")
	public static boolean method1391(@OriginalArg(0) int arg0) {
		if (arg0 == 58 || arg0 == 22 || arg0 == 20 || arg0 == 50 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 12 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	public static void method1393() {
		if (Static426.aBoolean567) {
			return;
		}
		Static390.aBoolean526 = true;
		if (Static336.aClass106_Sub1_1.aBoolean470) {
			Static278.aFloat52 = (int) Static278.aFloat52 - 17 & 0xFFFFFFF0;
		} else {
			Static230.aFloat90 += (-12.0F - Static230.aFloat90) / 2.0F;
		}
		Static426.aBoolean567 = true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIB)V")
	public static void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > arg1) {
			Static298.method3891(arg3, arg1, Static106.anIntArrayArray46[arg2], arg0);
		} else {
			Static298.method3891(arg1, arg3, Static106.anIntArrayArray46[arg2], arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIZIII)I")
	public static int method1397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg5;
			arg5 = local6;
		}
		@Pc(23) int local23 = arg0 & 0x3;
		if (local23 == 0) {
			return arg4;
		} else if (local23 == 1) {
			return arg3;
		} else if (local23 == 2) {
			return 7 + 1 - arg4 - arg1;
		} else {
			return 7 + 1 - arg3 - arg5;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1398(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local16 = (local16 << 5) + Static5.method95(arg0.charAt(local18)) - local16;
		}
		return local16;
	}
}
