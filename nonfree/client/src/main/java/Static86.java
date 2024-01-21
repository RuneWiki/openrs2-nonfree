import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!p", name = "bb", descriptor = "[I")
	public static int[] anIntArray260 = Class4_Sub1_Sub2_Sub1.anIntArray12;

	@OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
	private static int anInt2307 = 0;

	@OriginalMember(owner = "client!p", name = "hb", descriptor = "[I")
	public static int[] anIntArray262 = Class4_Sub1_Sub2_Sub1.anIntArray9;

	@OriginalMember(owner = "client!p", name = "zb", descriptor = "[I")
	private static int[] anIntArray265 = new int[10000];

	@OriginalMember(owner = "client!p", name = "Gb", descriptor = "[I")
	private static int[] anIntArray267 = new int[10000];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ea;II)Lclient!p;")
	public static Class4_Sub1_Sub3_Sub4 method1524(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method597(arg1, 0);
		return local5 == null ? null : new Class4_Sub1_Sub3_Sub4(local5);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)I")
	public static int method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!p;Lclient!p;IIIZ)V")
	public static void method1532(@OriginalArg(0) Class4_Sub1_Sub3_Sub4 arg0, @OriginalArg(1) Class4_Sub1_Sub3_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1527();
		arg0.method1523();
		arg1.method1527();
		arg1.method1523();
		anInt2307++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray261;
		@Pc(19) int local19 = arg1.anInt2306;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2306; local21++) {
			@Pc(27) Class37 local27 = arg0.aClass37Array1[local21];
			if (local27.anInt1756 != 0) {
				local37 = arg0.anIntArray264[local21] - arg3;
				if (local37 <= arg1.anInt2313) {
					@Pc(48) int local48 = arg0.anIntArray261[local21] - arg2;
					if (local48 >= arg1.anInt2314 && local48 <= arg1.anInt2312) {
						@Pc(64) int local64 = arg0.anIntArray258[local21] - arg4;
						if (local64 >= arg1.anInt2308 && local64 <= arg1.anInt2310) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class37 local81 = arg1.aClass37Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray258[local75] && local37 == arg1.anIntArray264[local75] && local81.anInt1756 != 0) {
									if (arg0.aClass37Array2 == null) {
										arg0.aClass37Array2 = new Class37[arg0.anInt2306];
									}
									if (arg1.aClass37Array2 == null) {
										arg1.aClass37Array2 = new Class37[local19];
									}
									@Pc(121) Class37 local121 = arg0.aClass37Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass37Array2[local21] = new Class37(local27);
									}
									@Pc(138) Class37 local138 = arg1.aClass37Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass37Array2[local75] = new Class37(local81);
									}
									local121.anInt1761 += local81.anInt1761;
									local121.anInt1759 += local81.anInt1759;
									local121.anInt1755 += local81.anInt1755;
									local121.anInt1756 += local81.anInt1756;
									local138.anInt1761 += local27.anInt1761;
									local138.anInt1759 += local27.anInt1759;
									local138.anInt1755 += local27.anInt1755;
									local138.anInt1756 += local27.anInt1756;
									local13++;
									anIntArray267[local21] = anInt2307;
									anIntArray265[local75] = anInt2307;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2311; local232++) {
			if (anIntArray267[arg0.anIntArray259[local232]] == anInt2307 && anIntArray267[arg0.anIntArray269[local232]] == anInt2307 && anIntArray267[arg0.anIntArray266[local232]] == anInt2307) {
				if (arg0.aByteArray37 == null) {
					arg0.aByteArray37 = new byte[arg0.anInt2311];
				}
				arg0.aByteArray37[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2311; local37++) {
			if (anIntArray265[arg1.anIntArray259[local37]] == anInt2307 && anIntArray265[arg1.anIntArray269[local37]] == anInt2307 && anIntArray265[arg1.anIntArray266[local37]] == anInt2307) {
				if (arg1.aByteArray37 == null) {
					arg1.aByteArray37 = new byte[arg1.anInt2311];
				}
				arg1.aByteArray37[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)I")
	public static int method1533(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "()V")
	public static void method1534() {
		anIntArray267 = null;
		anIntArray265 = null;
		anIntArray262 = null;
		anIntArray260 = null;
	}
}
