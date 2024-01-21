import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "[I")
	private static int[] anIntArray238 = new int[10000];

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "[I")
	private static int[] anIntArray240 = new int[10000];

	@OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
	private static int anInt2085 = 0;

	@OriginalMember(owner = "client!pf", name = "Bb", descriptor = "[I")
	public static int[] anIntArray246 = Class4_Sub3_Sub6_Sub4.anIntArray304;

	@OriginalMember(owner = "client!pf", name = "Fb", descriptor = "[I")
	public static int[] anIntArray248 = Class4_Sub3_Sub6_Sub4.anIntArray301;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!pf;Lclient!pf;IIIZ)V")
	public static void method1435(@OriginalArg(0) Class4_Sub3_Sub1_Sub5 arg0, @OriginalArg(1) Class4_Sub3_Sub1_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1431();
		arg0.method1453();
		arg1.method1431();
		arg1.method1453();
		anInt2085++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray243;
		@Pc(19) int local19 = arg1.anInt2083;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2083; local21++) {
			@Pc(27) Class30 local27 = arg0.aClass30Array1[local21];
			if (local27.anInt1129 != 0) {
				local37 = arg0.anIntArray242[local21] - arg3;
				if (local37 <= arg1.anInt2086) {
					@Pc(48) int local48 = arg0.anIntArray243[local21] - arg2;
					if (local48 >= arg1.anInt2082 && local48 <= arg1.anInt2089) {
						@Pc(64) int local64 = arg0.anIntArray247[local21] - arg4;
						if (local64 >= arg1.anInt2088 && local64 <= arg1.anInt2081) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class30 local81 = arg1.aClass30Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray247[local75] && local37 == arg1.anIntArray242[local75] && local81.anInt1129 != 0) {
									if (arg0.aClass30Array2 == null) {
										arg0.aClass30Array2 = new Class30[arg0.anInt2083];
									}
									if (arg1.aClass30Array2 == null) {
										arg1.aClass30Array2 = new Class30[local19];
									}
									@Pc(121) Class30 local121 = arg0.aClass30Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass30Array2[local21] = new Class30(local27);
									}
									@Pc(138) Class30 local138 = arg1.aClass30Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass30Array2[local75] = new Class30(local81);
									}
									local121.anInt1123 += local81.anInt1123;
									local121.anInt1125 += local81.anInt1125;
									local121.anInt1124 += local81.anInt1124;
									local121.anInt1129 += local81.anInt1129;
									local138.anInt1123 += local27.anInt1123;
									local138.anInt1125 += local27.anInt1125;
									local138.anInt1124 += local27.anInt1124;
									local138.anInt1129 += local27.anInt1129;
									local13++;
									anIntArray240[local21] = anInt2085;
									anIntArray238[local75] = anInt2085;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2087; local232++) {
			if (anIntArray240[arg0.anIntArray241[local232]] == anInt2085 && anIntArray240[arg0.anIntArray244[local232]] == anInt2085 && anIntArray240[arg0.anIntArray237[local232]] == anInt2085) {
				if (arg0.aByteArray28 == null) {
					arg0.aByteArray28 = new byte[arg0.anInt2087];
				}
				arg0.aByteArray28[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2087; local37++) {
			if (anIntArray238[arg1.anIntArray241[local37]] == anInt2085 && anIntArray238[arg1.anIntArray244[local37]] == anInt2085 && anIntArray238[arg1.anIntArray237[local37]] == anInt2085) {
				if (arg1.aByteArray28 == null) {
					arg1.aByteArray28 = new byte[arg1.anInt2087];
				}
				arg1.aByteArray28[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "(I)I")
	public static int method1440(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!c;II)Lclient!pf;")
	public static Class4_Sub3_Sub1_Sub5 method1445(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1774(arg1, 0);
		return local5 == null ? null : new Class4_Sub3_Sub1_Sub5(local5);
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "()V")
	public static void method1448() {
		anIntArray240 = null;
		anIntArray238 = null;
		anIntArray248 = null;
		anIntArray246 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
	public static int method1449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
