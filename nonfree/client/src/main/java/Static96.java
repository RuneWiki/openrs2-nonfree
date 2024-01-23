import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	public static int anInt2297;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
	public static int anInt2300;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString83 = null;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
	public static int anInt2299 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method1668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg8 && arg3 == arg4 && arg1 == arg2 && arg7 == arg0) {
			Static159.method2931(arg7, arg1, arg6, arg5, arg3);
			return;
		}
		@Pc(36) int local36 = arg6;
		@Pc(38) int local38 = arg3;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(62) int local62 = arg0 * 3;
		@Pc(71) int local71 = arg1 + local50 - local58 - arg6;
		@Pc(80) int local80 = local54 + arg7 - arg3 - local62;
		@Pc(89) int local89 = local46 + local58 - local50 - local50;
		@Pc(94) int local94 = local50 - local46;
		@Pc(105) int local105 = local62 + local42 - local54 - local54;
		@Pc(109) int local109 = local54 - local42;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(122) int local122 = local111 * local111 >> 12;
			@Pc(128) int local128 = local111 * local122 >> 12;
			@Pc(132) int local132 = local71 * local128;
			@Pc(136) int local136 = local128 * local80;
			@Pc(140) int local140 = local122 * local89;
			@Pc(144) int local144 = local105 * local122;
			@Pc(148) int local148 = local109 * local111;
			@Pc(159) int local159 = arg3 + (local144 + local136 + local148 >> 12);
			@Pc(163) int local163 = local94 * local111;
			@Pc(174) int local174 = arg6 + (local140 + local132 + local163 >> 12);
			Static159.method2931(local159, local174, local36, arg5, local38);
			local36 = local174;
			local38 = local159;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	public static void method1669() {
		Static205.anInt4269 = -1;
		Static9.anInt3025 = 0;
		Static73.anInt1821 = 1;
		Static130.anInt2976 = 2;
		Static95.aClass42_23 = null;
		Static154.anInt3461 = -1;
		Static88.aBoolean137 = false;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method1670(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static155.anInt3466 > 0) {
			local21 = Static294.aByteArrayArray17[--Static155.anInt3466];
			Static294.aByteArrayArray17[Static155.anInt3466] = null;
			return local21;
		} else if (arg0 == 5000 && Static153.anInt3409 > 0) {
			local21 = Static99.aByteArrayArray6[--Static153.anInt3409];
			Static99.aByteArrayArray6[Static153.anInt3409] = null;
			return local21;
		} else if (arg0 == 30000 && Static100.anInt2380 > 0) {
			@Pc(74) byte[] local74 = Static31.aByteArrayArray4[--Static100.anInt2380];
			Static31.aByteArrayArray4[Static100.anInt2380] = null;
			return local74;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Z")
	public static boolean method1672() {
		try {
			return Static189.method3287();
		} catch (@Pc(15) IOException local15) {
			Static154.method2844();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(61) String local61 = "T2 - " + Static259.anInt5137 + "," + Static154.anInt3462 + "," + Static244.anInt4865 + " - " + Static218.anInt4451 + "," + (Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] + Static160.anInt5159) + "," + (Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] + Static234.anInt4705) + " - ";
			for (@Pc(63) int local63 = 0; local63 < Static218.anInt4451 && local63 < 50; local63++) {
				local61 = local61 + Static91.aClass2_Sub16_Sub1_1.aByteArray17[local63] + ",";
			}
			Static183.method3240(local20, local61);
			Static11.method197();
			return true;
		}
	}
}
