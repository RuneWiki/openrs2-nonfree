import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray117;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	public static int anInt4440;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_168;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2589 = Static118.method2249("Enter your username (V password)3");

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2587 = aClass65_2589;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public static int anInt4438 = -1;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "[Lclient!vi;")
	public static final Class94[] aClass94Array105 = new Class94[50];

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2588 = Static118.method2249("::qa_op_test");

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2590 = Static118.method2249(":duelstake:");

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!lf;)V")
	public static void method3298(@OriginalArg(0) Class54 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2639; local2 <= arg0.anInt2636; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2632; local6 <= arg0.anInt2640; local6++) {
				@Pc(16) Class1_Sub7 local16 = Static83.aClass1_Sub7ArrayArrayArray1[arg0.anInt2638][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1677; local20++) {
						if (local16.aClass54Array2[local20] == arg0) {
							local16.anInt1677--;
							for (local35 = local20; local35 < local16.anInt1677; local35++) {
								local16.aClass54Array2[local35] = local16.aClass54Array2[local35 + 1];
								local16.anIntArray161[local35] = local16.anIntArray161[local35 + 1];
							}
							local16.aClass54Array2[local16.anInt1677] = null;
							break;
						}
					}
					local16.anInt1676 = 0;
					for (local35 = 0; local35 < local16.anInt1677; local35++) {
						local16.anInt1676 |= local16.anIntArray161[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public static void method3299(@OriginalArg(1) int arg0) {
		if (!Static173.method2925(arg0)) {
			return;
		}
		@Pc(12) Class97[] local12 = Static99.aClass97ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class97 local19 = local12[local14];
			if (local19 != null) {
				local19.anInt4316 = 0;
				local19.anInt4328 = 0;
			}
		}
	}
}
