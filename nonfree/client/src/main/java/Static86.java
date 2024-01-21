import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ka", name = "Gb", descriptor = "I")
	private static int anInt2181 = 0;

	@OriginalMember(owner = "client!ka", name = "Jb", descriptor = "[I")
	private static int[] anIntArray206 = new int[10000];

	@OriginalMember(owner = "client!ka", name = "Zb", descriptor = "[I")
	public static int[] anIntArray210 = Class2_Sub4_Sub3_Sub1.anIntArray60;

	@OriginalMember(owner = "client!ka", name = "gc", descriptor = "[I")
	public static int[] anIntArray211 = Class2_Sub4_Sub3_Sub1.anIntArray58;

	@OriginalMember(owner = "client!ka", name = "hc", descriptor = "[I")
	private static int[] anIntArray212 = new int[10000];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!jc;II)Lclient!ka;")
	public static Class2_Sub4_Sub1_Sub5 method1530(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1771(arg1, 0);
		return local5 == null ? null : new Class2_Sub4_Sub1_Sub5(local5);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;Lclient!ka;IIIZ)V")
	public static void method1543(@OriginalArg(0) Class2_Sub4_Sub1_Sub5 arg0, @OriginalArg(1) Class2_Sub4_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1538();
		arg0.method1535();
		arg1.method1538();
		arg1.method1535();
		anInt2181++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray215;
		@Pc(19) int local19 = arg1.anInt2179;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2179; local21++) {
			@Pc(27) Class20 local27 = arg0.aClass20Array2[local21];
			if (local27.anInt1156 != 0) {
				local37 = arg0.anIntArray213[local21] - arg3;
				if (local37 >= arg1.aShort36 && local37 <= arg1.aShort33) {
					@Pc(53) int local53 = arg0.anIntArray215[local21] - arg2;
					if (local53 >= arg1.aShort30 && local53 <= arg1.aShort29) {
						@Pc(69) int local69 = arg0.anIntArray214[local21] - arg4;
						if (local69 >= arg1.aShort31 && local69 <= arg1.aShort28) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class20 local86 = arg1.aClass20Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray214[local80] && local37 == arg1.anIntArray213[local80] && local86.anInt1156 != 0) {
									if (arg0.aClass20Array1 == null) {
										arg0.aClass20Array1 = new Class20[arg0.anInt2179];
									}
									if (arg1.aClass20Array1 == null) {
										arg1.aClass20Array1 = new Class20[local19];
									}
									@Pc(126) Class20 local126 = arg0.aClass20Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass20Array1[local21] = new Class20(local27);
									}
									@Pc(143) Class20 local143 = arg1.aClass20Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass20Array1[local80] = new Class20(local86);
									}
									local126.anInt1157 += local86.anInt1157;
									local126.anInt1152 += local86.anInt1152;
									local126.anInt1153 += local86.anInt1153;
									local126.anInt1156 += local86.anInt1156;
									local143.anInt1157 += local27.anInt1157;
									local143.anInt1152 += local27.anInt1152;
									local143.anInt1153 += local27.anInt1153;
									local143.anInt1156 += local27.anInt1156;
									local13++;
									anIntArray206[local21] = anInt2181;
									anIntArray212[local80] = anInt2181;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt2182; local237++) {
			if (anIntArray206[arg0.anIntArray208[local237]] == anInt2181 && anIntArray206[arg0.anIntArray207[local237]] == anInt2181 && anIntArray206[arg0.anIntArray205[local237]] == anInt2181) {
				if (arg0.aByteArray22 == null) {
					arg0.aByteArray22 = new byte[arg0.anInt2182];
				}
				arg0.aByteArray22[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2182; local37++) {
			if (anIntArray212[arg1.anIntArray208[local37]] == anInt2181 && anIntArray212[arg1.anIntArray207[local37]] == anInt2181 && anIntArray212[arg1.anIntArray205[local37]] == anInt2181) {
				if (arg1.aByteArray22 == null) {
					arg1.aByteArray22 = new byte[arg1.anInt2182];
				}
				arg1.aByteArray22[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "()V")
	public static void method1545() {
		anIntArray206 = null;
		anIntArray212 = null;
		anIntArray211 = null;
		anIntArray210 = null;
	}
}
