import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public static int anInt1654;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
	public static int anInt1668;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
	public static int method1550(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!ta;IILclient!ta;IIIIB)V")
	public static void method1551(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub6 arg1, @OriginalArg(4) Class3_Sub3_Sub6 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg2.method5508();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class12 local21 = (Class12) Static282.aClass220_42.method4990((long) local7);
		if (local21 == null) {
			@Pc(28) Class77[] local28 = Static455.method1708(Static76.aClass158_17, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static44.aClass28_14.method3540(local28[0]);
			Static282.aClass220_42.method4996(local21, (long) local7);
		}
		Static101.method1691(arg6 >> 1, 0, arg1.method5512() * 64, arg1.anInt6677, arg1.anInt6675, arg3 >> 1, arg1.aByte93);
		@Pc(75) int local75 = arg4 + Static363.anIntArray538[0] - 18;
		@Pc(86) int local86 = arg0 + Static363.anIntArray538[1] - 54 - 16;
		@Pc(94) int local94 = local75 + arg5 / 4 * 18;
		@Pc(102) int local102 = local86 + arg5 % 4 * 18;
		local21.method5665(local94, local102);
		if (arg1 == arg2) {
			Static44.aClass28_14.method3508(18, -256, local94 - 1, 18, local102 - 1);
		}
		@Pc(129) Class48_Sub4 local129 = Static185.method4355();
		local129.anInt2678 = local102;
		local129.aClass3_Sub3_Sub6_1 = arg2;
		local129.anInt2675 = local94;
		local129.anInt2676 = local102 + 16;
		local129.anInt2677 = local94 + 16;
		Static328.aClass128_9.method2833(local129);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public static void method1553() {
		if (Static18.aClass105_1 != null) {
			Static18.aClass105_1.method5166();
		}
		if (Static166.aClass105_2 != null) {
			Static166.aClass105_2.method5166();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
	public static void method1555(@OriginalArg(1) int arg0) {
		@Pc(22) Class6_Sub1_Sub12 local22 = Static449.method5975(arg0, 14);
		local22.method3048();
	}
}
