import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!fo;B)V")
	public static void method1725(@OriginalArg(0) Class57_Sub1 arg0) {
		@Pc(7) int local7;
		for (local7 = 0; local7 < Static265.anIntArray550.length; local7++) {
			Static265.anIntArray550[local7] = 0;
		}
		@Pc(35) int local35;
		for (local7 = 0; local7 < 5000; local7++) {
			local35 = (int) (Math.random() * 128.0D * (double) 256);
			Static265.anIntArray550[local35] = (int) (Math.random() * 284.0D);
		}
		@Pc(67) int local67;
		@Pc(76) int local76;
		for (local7 = 0; local7 < 20; local7++) {
			for (local35 = 1; local35 < 255; local35++) {
				for (local67 = 1; local67 < 127; local67++) {
					local76 = (local35 << 7) + local67;
					Static196.anIntArray412[local76] = (Static265.anIntArray550[local76 + 128] + Static265.anIntArray550[local76 - 128] + Static265.anIntArray550[local76 + -1] + Static265.anIntArray550[local76 + 1]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static265.anIntArray550;
			Static265.anIntArray550 = Static196.anIntArray412;
			Static196.anIntArray412 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local7 = 0;
		for (local35 = 0; local35 < arg0.anInt3766; local35++) {
			for (local67 = 0; local67 < arg0.anInt3768; local67++) {
				if (arg0.aByteArray59[local7++] != 0) {
					local76 = arg0.anInt3762 + local67 + 16;
					@Pc(163) int local163 = arg0.anInt3769 + local35 + 16;
					@Pc(169) int local169 = local76 + (local163 << 7);
					Static265.anIntArray550[local169] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	public static void method1728() {
		Static242.aClass175_36.method4288(5);
		Static83.aClass175_11.method4288(5);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!nm;Lclient!nm;Lclient!lm;ILclient!nm;)Z")
	public static boolean method1729(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) Class1_Sub7_Sub2 arg2, @OriginalArg(4) Class119 arg3) {
		Static279.aClass119_87 = arg0;
		Static292.aClass1_Sub7_Sub2_3 = arg2;
		Static84.aClass119_36 = arg1;
		Static198.aClass119_65 = arg3;
		return true;
	}
}
