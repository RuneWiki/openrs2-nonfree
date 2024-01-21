import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_744 = Static120.method1824("Texturen geladen)3");

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!rd;")
	public static Class80 aClass80_745 = null;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_746 = Static120.method1824("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "[S")
	public static final short[] aShortArray18 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_747 = Static120.method1824("blinken2:");

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!rd;")
	public static Class80 aClass80_748 = aClass80_746;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1313() {
		Static82.aClass5_22.method146();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public static void method1314() {
		Static185.aByteArrayArrayArray7 = new byte[4][104][104];
		Static193.anIntArray517 = new int[104];
		Static113.aByteArrayArrayArray4 = new byte[4][104][104];
		Static13.anInt315 = 99;
		Static140.anIntArray389 = new int[104];
		Static72.anIntArrayArrayArray10 = new int[4][105][105];
		Static172.anIntArray466 = new int[104];
		Static41.aByteArrayArrayArray3 = new byte[4][104][104];
		Static126.aByteArrayArrayArray5 = new byte[4][105][105];
		Static152.anIntArray432 = new int[104];
		Static20.aByteArrayArrayArray2 = new byte[4][104][104];
		Static51.anIntArray158 = new int[104];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI[Lclient!rh;IIIII)V")
	public static void method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class3_Sub17 local17 = new Class3_Sub17(arg2);
		while (true) {
			@Pc(21) int local21 = local17.method2090();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local17.method2090();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local17.method2107();
				@Pc(59) int local59 = local55 >> 2;
				@Pc(63) int local63 = local29 >> 12;
				@Pc(67) int local67 = local55 & 0x3;
				if (local63 == arg1 && local51 >= arg3 && local51 < arg3 + 8 && arg7 <= local45 && local45 < arg7 + 8) {
					@Pc(102) Class3_Sub1_Sub1 local102 = Static162.method2627(local12);
					@Pc(120) int local120 = arg8 + Static167.method2699(local51 & 0x7, local45 & 0x7, local102.anInt150, local102.anInt145, arg0, local67);
					@Pc(137) int local137 = Static36.method569(local51 & 0x7, local67, arg0, local102.anInt150, local45 & 0x7, local102.anInt145) + arg5;
					if (local120 > 0 && local137 > 0 && local120 < 103 && local137 < 103) {
						@Pc(153) Class82 local153 = null;
						@Pc(155) int local155 = arg6;
						if ((Static18.aByteArrayArrayArray1[1][local120][local137] & 0x2) == 2) {
							local155 = arg6 - 1;
						}
						if (local155 >= 0) {
							local153 = arg4[local155];
						}
						Static79.method1199(local153, local59, local67 + arg0 & 0x3, local137, local12, arg6, local120);
					}
				}
			}
		}
	}
}
