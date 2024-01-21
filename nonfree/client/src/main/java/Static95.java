import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!qb", name = "jc", descriptor = "[I")
	private static int[] anIntArray256 = new int[10000];

	@OriginalMember(owner = "client!qb", name = "rc", descriptor = "[I")
	private static int[] anIntArray262 = new int[10000];

	@OriginalMember(owner = "client!qb", name = "Dc", descriptor = "I")
	private static int anInt2324 = 0;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(II)I")
	public static int method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)I")
	public static int method1744(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class4_Sub2_Sub1_Sub4.anIntArray254[arg0];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!qb;Lclient!qb;IIIZ)V")
	public static void method1745(@OriginalArg(0) Class4_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1737();
		arg0.method1748();
		arg1.method1737();
		arg1.method1748();
		anInt2324++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray267;
		@Pc(19) int local19 = arg1.anInt2320;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2320; local21++) {
			@Pc(27) Class50 local27 = arg0.aClass50Array1[local21];
			if (local27.anInt1697 != 0) {
				local37 = arg0.anIntArray261[local21] - arg3;
				if (local37 <= arg1.anInt2325) {
					@Pc(48) int local48 = arg0.anIntArray267[local21] - arg2;
					if (local48 >= arg1.anInt2318 && local48 <= arg1.anInt2321) {
						@Pc(64) int local64 = arg0.anIntArray258[local21] - arg4;
						if (local64 >= arg1.anInt2322 && local64 <= arg1.anInt2319) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class50 local81 = arg1.aClass50Array1[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray258[local75] && local37 == arg1.anIntArray261[local75] && local81.anInt1697 != 0) {
									if (arg0.aClass50Array2 == null) {
										arg0.aClass50Array2 = new Class50[arg0.anInt2320];
									}
									if (arg1.aClass50Array2 == null) {
										arg1.aClass50Array2 = new Class50[local19];
									}
									@Pc(121) Class50 local121 = arg0.aClass50Array2[local21];
									if (local121 == null) {
										local121 = arg0.aClass50Array2[local21] = new Class50(local27);
									}
									@Pc(138) Class50 local138 = arg1.aClass50Array2[local75];
									if (local138 == null) {
										local138 = arg1.aClass50Array2[local75] = new Class50(local81);
									}
									local121.anInt1706 += local81.anInt1706;
									local121.anInt1699 += local81.anInt1699;
									local121.anInt1709 += local81.anInt1709;
									local121.anInt1697 += local81.anInt1697;
									local138.anInt1706 += local27.anInt1706;
									local138.anInt1699 += local27.anInt1699;
									local138.anInt1709 += local27.anInt1709;
									local138.anInt1697 += local27.anInt1697;
									local13++;
									anIntArray262[local21] = anInt2324;
									anIntArray256[local75] = anInt2324;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt2317; local232++) {
			if (anIntArray262[arg0.anIntArray265[local232]] == anInt2324 && anIntArray262[arg0.anIntArray255[local232]] == anInt2324 && anIntArray262[arg0.anIntArray263[local232]] == anInt2324) {
				if (arg0.aByteArray29 == null) {
					arg0.aByteArray29 = new byte[arg0.anInt2317];
				}
				arg0.aByteArray29[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt2317; local37++) {
			if (anIntArray256[arg1.anIntArray265[local37]] == anInt2324 && anIntArray256[arg1.anIntArray255[local37]] == anInt2324 && anIntArray256[arg1.anIntArray263[local37]] == anInt2324) {
				if (arg1.aByteArray29 == null) {
					arg1.aByteArray29 = new byte[arg1.anInt2317];
				}
				arg1.aByteArray29[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!pd;II)Lclient!qb;")
	public static Class4_Sub2_Sub1_Sub4 method1747(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method474(arg1, 0);
		return local5 == null ? null : new Class4_Sub2_Sub1_Sub4(local5);
	}

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "()V")
	public static void method1750() {
		anIntArray262 = null;
		anIntArray256 = null;
		Class4_Sub2_Sub1_Sub4.anIntArray254 = null;
	}
}
