import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!cw", name = "G", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!cw", name = "Z", descriptor = "I")
	public static int anInt1826;

	@OriginalMember(owner = "client!cw", name = "ab", descriptor = "J")
	public static long aLong45;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIIILclient!ns;ILclient!ns;)V")
	public static void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class20_Sub2_Sub2_Sub1 arg5, @OriginalArg(9) Class20_Sub2_Sub2_Sub1 arg6) {
		@Pc(9) int local9 = arg5.method4917();
		if (local9 == -1) {
			return;
		}
		@Pc(22) Class32 local22 = (Class32) Static417.aClass166_40.method4805((long) local9);
		if (local22 == null) {
			@Pc(29) Class98[] local29 = Static651.method2405(Static540.aClass353_110, local9);
			if (local29 == null) {
				return;
			}
			local22 = Static162.aClass100_7.method8773(local29[0], true);
			Static417.aClass166_40.method4803(local22, (long) local9);
		}
		Static298.method5521(arg6.anInt10729, arg6.method4913() * 256, arg3 >> 1, arg6.anInt10725, arg0 >> 1, arg6.aByte131, 0);
		@Pc(76) int local76 = arg2 + Static258.anIntArray298[0] - 18;
		@Pc(84) int local84 = local76 + arg4 / 4 * 18;
		@Pc(94) int local94 = arg1 + Static258.anIntArray298[1] - 16 - 54;
		@Pc(102) int local102 = local94 + arg4 % 4 * 18;
		local22.method5071(local84, local102);
		if (arg5 == arg6) {
			Static162.aClass100_7.method8814(-256, local84 - 1, local102 - 1, 18, 18);
		}
		Static347.method5621(local102 + 18, local84 + 18, local102 - 1, local84 + -1);
		@Pc(138) Class20_Sub5 local138 = Static113.method1881();
		local138.anInt3938 = local102 + 16;
		local138.anInt3939 = local84 + 16;
		local138.aClass20_Sub2_Sub2_Sub1_1 = arg5;
		local138.anInt3942 = local84;
		local138.anInt3943 = local102;
		Static165.aClass81_4.method2119(local138);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IB)I")
	public static int method1510(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)I")
	public static int method1511(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(III)V")
	public static void method1512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub9 local8 = Static144.method2332(14, arg1);
		local8.method3723();
		local8.anInt4294 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZI)B")
	public static byte method1513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
