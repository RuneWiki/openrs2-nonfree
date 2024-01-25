import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
	public static int anInt1909;

	@OriginalMember(owner = "client!ep", name = "E", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!ep", name = "F", descriptor = "Z")
	public static boolean aBoolean178;

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "[I")
	public static final int[] anIntArray154 = new int[5];

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
	public static void method1664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static393.aClass121_3 == Static317.aClass121_2) {
			if (!Static166.method2734(0, arg1, arg0, 1, false, 1, 0, -2)) {
				Static166.method2734(0, arg1, arg0, 1, false, 1, 0, -3);
			}
		} else if (!Static166.method2734(0, arg1, arg0, 1, false, 1, 0, -3)) {
			Static166.method2734(0, arg1, arg0, 1, false, 1, 0, -2);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!iv;ILclient!et;I)V")
	public static void method1665(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2) {
		@Pc(13) Class4_Sub36 local13 = new Class4_Sub36();
		local13.anInt5309 = arg0.method2490();
		local13.anInt5310 = arg0.method2529();
		local13.aByteArrayArrayArray4 = new byte[local13.anInt5309][][];
		local13.aClass199Array2 = new Class199[local13.anInt5309];
		local13.anIntArray349 = new int[local13.anInt5309];
		local13.aClass199Array1 = new Class199[local13.anInt5309];
		local13.anIntArray351 = new int[local13.anInt5309];
		local13.anIntArray350 = new int[local13.anInt5309];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt5309; local55++) {
			try {
				@Pc(61) int local61 = arg0.method2490();
				@Pc(76) String local76;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local76 = arg0.method2537();
					local80 = arg0.method2537();
					local82 = 0;
					if (local61 == 1) {
						local82 = arg0.method2529();
					}
					local13.anIntArray349[local55] = local61;
					local13.anIntArray350[local55] = local82;
					local13.aClass199Array1[local55] = arg2.method1750(Static323.method4383(local76), local80);
				} else if (local61 == 3 || local61 == 4) {
					local76 = arg0.method2537();
					local80 = arg0.method2537();
					local82 = arg0.method2490();
					@Pc(135) String[] local135 = new String[local82];
					for (@Pc(137) int local137 = 0; local137 < local82; local137++) {
						local135[local137] = arg0.method2537();
					}
					@Pc(156) byte[][] local156 = new byte[local82][];
					@Pc(167) int local167;
					if (local61 == 3) {
						for (@Pc(161) int local161 = 0; local161 < local82; local161++) {
							local167 = arg0.method2529();
							local156[local161] = new byte[local167];
							arg0.method2508(local167, local156[local161]);
						}
					}
					local13.anIntArray349[local55] = local61;
					@Pc(196) Class[] local196 = new Class[local82];
					for (local167 = 0; local167 < local82; local167++) {
						local196[local167] = Static323.method4383(local135[local167]);
					}
					local13.aClass199Array2[local55] = arg2.method1730(local196, local80, Static323.method4383(local76));
					local13.aByteArrayArrayArray4[local55] = local156;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local13.anIntArray351[local55] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local13.anIntArray351[local55] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local13.anIntArray351[local55] = -3;
			} catch (@Pc(258) Exception local258) {
				local13.anIntArray351[local55] = -4;
			} catch (@Pc(265) Throwable local265) {
				local13.anIntArray351[local55] = -5;
			}
		}
		Static421.aClass183_48.method4137(local13);
	}
}
