import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public static int anInt1696;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
	public static int anInt1701 = 0;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	public static int anInt1704 = -1;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
	public static int[] anIntArray163 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II[BB)Z")
	public static boolean method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class3_Sub26 local17 = new Class3_Sub26(arg2);
		@Pc(19) int local19 = -1;
		label57: while (true) {
			@Pc(23) int local23 = local17.method3942();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) boolean local34 = false;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(42) int local42;
				while (!local34) {
					local42 = local17.method3904();
					if (local42 == 0) {
						continue label57;
					}
					local36 += local42 - 1;
					@Pc(76) int local76 = local36 & 0x3F;
					@Pc(82) int local82 = local17.method3915() >> 2;
					@Pc(87) int local87 = local76 + arg0;
					@Pc(93) int local93 = local36 >> 6 & 0x3F;
					@Pc(97) int local97 = local93 + arg1;
					if (local97 > 0 && local87 > 0 && local97 < 103 && local87 < 103) {
						@Pc(112) Class49 local112 = Static175.method2874(local19);
						if (local82 != 22 || Static201.aBoolean280 || local112.anInt1330 != 0 || local112.anInt1372 == 1 || local112.aBoolean117) {
							local34 = true;
							if (!local112.method1124()) {
								local12 = false;
								Static206.anInt4082++;
							}
						}
					}
				}
				local42 = local17.method3904();
				if (local42 == 0) {
					break;
				}
				local17.method3915();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[S)[S")
	public static short[] method1380(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static326.method4271(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
	public static void method1381() {
		Static249.aClass98_40.method2571();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([II[J)V")
	public static void method1382(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static112.method4705(arg1, arg1.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([BI)[B")
	public static byte[] method1383(@OriginalArg(0) byte[] arg0) {
		@Pc(16) int local16 = arg0.length;
		@Pc(19) byte[] local19 = new byte[local16];
		Static326.method4270(arg0, 0, local19, 0, local16);
		return local19;
	}
}
