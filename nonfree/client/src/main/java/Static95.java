import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public static int anInt2218;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public static int anInt2222 = 0;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString127 = "Loading sprites - ";

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	public static int anInt2225 = -1;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V")
	public static void method1752(@OriginalArg(1) long arg0) {
		Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
		Static283.aClass1_Sub11_Sub1_3.method2655(21);
		Static283.aClass1_Sub11_Sub1_3.method2673(arg0);
		Static64.anInt1382 = -3;
		Static178.anInt3968 = 0;
		Static239.anInt4742 = 1;
		Static264.anInt5178 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIII)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg0 > arg3) {
			for (local14 = arg3; local14 < arg0; local14++) {
				Static22.anIntArrayArray3[local14][arg2] = arg1;
			}
		} else {
			for (local14 = arg0; local14 < arg3; local14++) {
				Static22.anIntArrayArray3[local14][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method1755() {
		Static265.aClass135_38.method3324();
		Static227.aClass135_26.method3324();
		Static255.aClass135_34.method3324();
		Static49.aClass135_2.method3324();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)I")
	public static int method1758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local18 ^ local18 << 13;
		@Pc(38) int local38 = Integer.MAX_VALUE & (local24 * 15731 * local24 + 789221) * local24 + 1376312589;
		return local38 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method1759() {
		if (Static288.aString323.toLowerCase().indexOf("microsoft") != -1) {
			Static53.anIntArray465[191] = 73;
			Static53.anIntArray465[220] = 74;
			Static53.anIntArray465[221] = 43;
			Static53.anIntArray465[219] = 42;
			Static53.anIntArray465[222] = 59;
			Static53.anIntArray465[189] = 26;
			Static53.anIntArray465[223] = 28;
			Static53.anIntArray465[190] = 72;
			Static53.anIntArray465[187] = 27;
			Static53.anIntArray465[186] = 57;
			Static53.anIntArray465[192] = 58;
			Static53.anIntArray465[188] = 71;
			return;
		}
		Static53.anIntArray465[93] = 43;
		Static53.anIntArray465[47] = 73;
		Static53.anIntArray465[61] = 27;
		Static53.anIntArray465[91] = 42;
		Static53.anIntArray465[46] = 72;
		Static53.anIntArray465[92] = 74;
		Static53.anIntArray465[45] = 26;
		Static53.anIntArray465[44] = 71;
		if (Static288.aMethod2 == null) {
			Static53.anIntArray465[192] = 58;
			Static53.anIntArray465[222] = 59;
		} else {
			Static53.anIntArray465[520] = 59;
			Static53.anIntArray465[192] = 28;
			Static53.anIntArray465[222] = 58;
		}
		Static53.anIntArray465[59] = 57;
	}
}
