import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!lb", name = "eb", descriptor = "[I")
	public static int[] anIntArray204 = Class3_Sub1_Sub3_Sub2.anIntArray87;

	@OriginalMember(owner = "client!lb", name = "fb", descriptor = "[I")
	private static int[] anIntArray205 = new int[10000];

	@OriginalMember(owner = "client!lb", name = "nb", descriptor = "I")
	private static int anInt1997 = 0;

	@OriginalMember(owner = "client!lb", name = "wb", descriptor = "[I")
	public static int[] anIntArray209 = Class3_Sub1_Sub3_Sub2.anIntArray88;

	@OriginalMember(owner = "client!lb", name = "Ab", descriptor = "[I")
	private static int[] anIntArray210 = new int[10000];

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()V")
	public static void method1557() {
		anIntArray205 = null;
		anIntArray210 = null;
		anIntArray204 = null;
		anIntArray209 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!lb;Lclient!lb;IIIZ)V")
	public static void method1569(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1563();
		arg0.method1555();
		arg1.method1563();
		arg1.method1555();
		anInt1997++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray207;
		@Pc(19) int local19 = arg1.anInt1998;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1998; local21++) {
			@Pc(27) Class15 local27 = arg0.aClass15Array2[local21];
			if (local27.anInt629 != 0) {
				local37 = arg0.anIntArray214[local21] - arg3;
				if (local37 >= arg1.aShort32 && local37 <= arg1.aShort10) {
					@Pc(53) int local53 = arg0.anIntArray207[local21] - arg2;
					if (local53 >= arg1.aShort9 && local53 <= arg1.aShort7) {
						@Pc(69) int local69 = arg0.anIntArray206[local21] - arg4;
						if (local69 >= arg1.aShort6 && local69 <= arg1.aShort11) {
							for (@Pc(80) int local80 = 0; local80 < local19; local80++) {
								@Pc(86) Class15 local86 = arg1.aClass15Array2[local80];
								if (local53 == local16[local80] && local69 == arg1.anIntArray206[local80] && local37 == arg1.anIntArray214[local80] && local86.anInt629 != 0) {
									if (arg0.aClass15Array1 == null) {
										arg0.aClass15Array1 = new Class15[arg0.anInt1998];
									}
									if (arg1.aClass15Array1 == null) {
										arg1.aClass15Array1 = new Class15[local19];
									}
									@Pc(126) Class15 local126 = arg0.aClass15Array1[local21];
									if (local126 == null) {
										local126 = arg0.aClass15Array1[local21] = new Class15(local27);
									}
									@Pc(143) Class15 local143 = arg1.aClass15Array1[local80];
									if (local143 == null) {
										local143 = arg1.aClass15Array1[local80] = new Class15(local86);
									}
									local126.anInt633 += local86.anInt633;
									local126.anInt631 += local86.anInt631;
									local126.anInt632 += local86.anInt632;
									local126.anInt629 += local86.anInt629;
									local143.anInt633 += local27.anInt633;
									local143.anInt631 += local27.anInt631;
									local143.anInt632 += local27.anInt632;
									local143.anInt629 += local27.anInt629;
									local13++;
									anIntArray205[local21] = anInt1997;
									anIntArray210[local80] = anInt1997;
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
		for (@Pc(237) int local237 = 0; local237 < arg0.anInt1996; local237++) {
			if (anIntArray205[arg0.anIntArray208[local237]] == anInt1997 && anIntArray205[arg0.anIntArray212[local237]] == anInt1997 && anIntArray205[arg0.anIntArray213[local237]] == anInt1997) {
				if (arg0.aByteArray21 == null) {
					arg0.aByteArray21 = new byte[arg0.anInt1996];
				}
				arg0.aByteArray21[local237] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1996; local37++) {
			if (anIntArray210[arg1.anIntArray208[local37]] == anInt1997 && anIntArray210[arg1.anIntArray212[local37]] == anInt1997 && anIntArray210[arg1.anIntArray213[local37]] == anInt1997) {
				if (arg1.aByteArray21 == null) {
					arg1.aByteArray21 = new byte[arg1.anInt1996];
				}
				arg1.aByteArray21[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!f;II)Lclient!lb;")
	public static Class3_Sub1_Sub4_Sub4 method1571(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method348(arg1, 0);
		return local5 == null ? null : new Class3_Sub1_Sub4_Sub4(local5);
	}
}
