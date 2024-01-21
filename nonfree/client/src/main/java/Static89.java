import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "[I")
	public static int[] anIntArray425 = Class3_Sub2_Sub2_Sub2.anIntArray127;

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "[I")
	private static int[] anIntArray426 = new int[10000];

	@OriginalMember(owner = "client!lc", name = "fb", descriptor = "[I")
	private static int[] anIntArray429 = new int[10000];

	@OriginalMember(owner = "client!lc", name = "lb", descriptor = "I")
	private static int anInt2561 = 0;

	@OriginalMember(owner = "client!lc", name = "ob", descriptor = "[I")
	public static int[] anIntArray433 = Class3_Sub2_Sub2_Sub2.anIntArray129;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
	public static void method2024() {
		anIntArray429 = null;
		anIntArray426 = null;
		anIntArray425 = null;
		anIntArray433 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lc;Lclient!lc;IIIZ)V")
	public static void method2030(@OriginalArg(0) Class3_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method2033();
		arg0.method2046();
		arg1.method2033();
		arg1.method2046();
		anInt2561++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray428;
		@Pc(19) int local19 = arg1.anInt2560;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2560; local21++) {
			@Pc(27) Class10 local27 = arg0.aClass10Array2[local21];
			if (local27.anInt447 != 0) {
				local37 = arg0.anIntArray430[local21] - arg3;
				if (local37 >= arg1.aShort36 && local37 <= arg1.aShort28) {
					@Pc(53) int local53 = arg0.anIntArray428[local21] - arg2;
					if (local53 >= arg1.aShort30 && local53 <= arg1.aShort27) {
						@Pc(69) int local69 = arg0.anIntArray434[local21] - arg4;
						if (local69 >= arg1.aShort31 && local69 <= arg1.aShort29) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class10 local86 = arg1.aClass10Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray434[local80] && local37 == arg1.anIntArray430[local80] && local86.anInt447 != 0) {
									if (arg0.aClass10Array1 == null) {
										arg0.aClass10Array1 = new Class10[arg0.anInt2560];
									}
									if (arg1.aClass10Array1 == null) {
										arg1.aClass10Array1 = new Class10[local19];
									}
									@Pc(126) Class10 local126 = arg0.aClass10Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass10Array1[local21] = new Class10(local27);
									}
									@Pc(143) Class10 local143 = arg1.aClass10Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass10Array1[local80] = new Class10(local86);
									}
									local126.anInt445 += local86.anInt445;
									local126.anInt446 += local86.anInt446;
									local126.anInt448 += local86.anInt448;
									local126.anInt447 += local86.anInt447;
									local143.anInt445 += local27.anInt445;
									local143.anInt446 += local27.anInt446;
									local143.anInt448 += local27.anInt448;
									local143.anInt447 += local27.anInt447;
									local13++;
									anIntArray429[local21] = anInt2561;
									anIntArray426[local80] = anInt2561;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt2563; local237++) {
			if (anIntArray429[arg0.anIntArray431[local237]] == anInt2561 && anIntArray429[arg0.anIntArray432[local237]] == anInt2561 && anIntArray429[arg0.anIntArray436[local237]] == anInt2561) {
				if (arg0.aByteArray23 == null) {
					arg0.aByteArray23 = new byte[arg0.anInt2563];
				}
				arg0.aByteArray23[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2563; local37++) {
			if (anIntArray426[arg1.anIntArray431[local37]] == anInt2561 && anIntArray426[arg1.anIntArray432[local37]] == anInt2561 && anIntArray426[arg1.anIntArray436[local37]] == anInt2561) {
				if (arg1.aByteArray23 == null) {
					arg1.aByteArray23 = new byte[arg1.anInt2563];
				}
				arg1.aByteArray23[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ah;II)Lclient!lc;")
	public static Class3_Sub2_Sub1_Sub4 method2044(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1021(arg1, 0);
		return local5 == null ? null : new Class3_Sub2_Sub1_Sub4(local5);
	}
}
