import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "[I")
	public static int[] anIntArray194 = Class2_Sub3_Sub2_Sub2.anIntArray207;

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "[I")
	public static int[] anIntArray198 = Class2_Sub3_Sub2_Sub2.anIntArray208;

	@OriginalMember(owner = "client!mc", name = "jb", descriptor = "[I")
	private static int[] anIntArray199 = new int[10000];

	@OriginalMember(owner = "client!mc", name = "yb", descriptor = "I")
	private static int anInt2471 = 0;

	@OriginalMember(owner = "client!mc", name = "Eb", descriptor = "[I")
	private static int[] anIntArray202 = new int[10000];

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;Lclient!mc;IIIZ)V")
	public static void method1633(@OriginalArg(0) Class2_Sub3_Sub5_Sub3 arg0, @OriginalArg(1) Class2_Sub3_Sub5_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1631();
		arg0.method1636();
		arg1.method1631();
		arg1.method1636();
		anInt2471++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray201;
		@Pc(19) int local19 = arg1.anInt2470;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2470; local21++) {
			@Pc(27) Class47 local27 = arg0.aClass47Array2[local21];
			if (local27.anInt2207 != 0) {
				local37 = arg0.anIntArray196[local21] - arg3;
				if (local37 >= arg1.aShort25 && local37 <= arg1.aShort9) {
					@Pc(53) int local53 = arg0.anIntArray201[local21] - arg2;
					if (local53 >= arg1.aShort10 && local53 <= arg1.aShort11) {
						@Pc(69) int local69 = arg0.anIntArray193[local21] - arg4;
						if (local69 >= arg1.aShort6 && local69 <= arg1.aShort7) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class47 local86 = arg1.aClass47Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray193[local80] && local37 == arg1.anIntArray196[local80] && local86.anInt2207 != 0) {
									if (arg0.aClass47Array1 == null) {
										arg0.aClass47Array1 = new Class47[arg0.anInt2470];
									}
									if (arg1.aClass47Array1 == null) {
										arg1.aClass47Array1 = new Class47[local19];
									}
									@Pc(126) Class47 local126 = arg0.aClass47Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass47Array1[local21] = new Class47(local27);
									}
									@Pc(143) Class47 local143 = arg1.aClass47Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass47Array1[local80] = new Class47(local86);
									}
									local126.anInt2210 += local86.anInt2210;
									local126.anInt2206 += local86.anInt2206;
									local126.anInt2212 += local86.anInt2212;
									local126.anInt2207 += local86.anInt2207;
									local143.anInt2210 += local27.anInt2210;
									local143.anInt2206 += local27.anInt2206;
									local143.anInt2212 += local27.anInt2212;
									local143.anInt2207 += local27.anInt2207;
									local13++;
									anIntArray199[local21] = anInt2471;
									anIntArray202[local80] = anInt2471;
								}
							}
						}
					}
				}
			}
		}
		if (local13 < 3 || !arg5) {
			return;
		}
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt2469; local237++) {
			if (anIntArray199[arg0.anIntArray195[local237]] == anInt2471 && anIntArray199[arg0.anIntArray203[local237]] == anInt2471 && anIntArray199[arg0.anIntArray197[local237]] == anInt2471) {
				if (arg0.aByteArray25 == null) {
					arg0.aByteArray25 = new byte[arg0.anInt2469];
				}
				arg0.aByteArray25[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2469; local37++) {
			if (anIntArray202[arg1.anIntArray195[local37]] == anInt2471 && anIntArray202[arg1.anIntArray203[local37]] == anInt2471 && anIntArray202[arg1.anIntArray197[local37]] == anInt2471) {
				if (arg1.aByteArray25 == null) {
					arg1.aByteArray25 = new byte[arg1.anInt2469];
				}
				arg1.aByteArray25[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!c;II)Lclient!mc;")
	public static Class2_Sub3_Sub5_Sub3 method1637(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1605(0, arg1);
		return local5 == null ? null : new Class2_Sub3_Sub5_Sub3(local5);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "()V")
	public static void method1645() {
		anIntArray199 = null;
		anIntArray202 = null;
		anIntArray198 = null;
		anIntArray194 = null;
	}
}
