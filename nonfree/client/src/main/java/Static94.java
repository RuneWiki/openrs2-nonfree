import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!pf", name = "rb", descriptor = "[I")
	private static int[] anIntArray279 = new int[10000];

	@OriginalMember(owner = "client!pf", name = "Fb", descriptor = "[I")
	private static int[] anIntArray282 = new int[10000];

	@OriginalMember(owner = "client!pf", name = "Hb", descriptor = "I")
	private static int anInt2000 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!pf;Lclient!pf;IIIZ)V")
	public static void method1399(@OriginalArg(0) Class2_Sub2_Sub2_Sub7 arg0, @OriginalArg(1) Class2_Sub2_Sub2_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg0.method1413();
		arg0.method1400();
		arg1.method1413();
		arg1.method1400();
		anInt2000++;
		@Pc(13) int local13 = 0;
		@Pc(16) int[] local16 = arg1.anIntArray287;
		@Pc(19) int local19 = arg1.anInt2001;
		@Pc(37) int local37;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2001; local21++) {
			@Pc(27) Class76 local27 = arg0.aClass76Array2[local21];
			if (local27.anInt2545 != 0) {
				local37 = arg0.anIntArray280[local21] - arg3;
				if (local37 <= arg1.anInt2002) {
					@Pc(48) int local48 = arg0.anIntArray287[local21] - arg2;
					if (local48 >= arg1.anInt1995 && local48 <= arg1.anInt1997) {
						@Pc(64) int local64 = arg0.anIntArray284[local21] - arg4;
						if (local64 >= arg1.anInt1999 && local64 <= arg1.anInt1996) {
							for (@Pc(75) int local75 = 0; local75 < local19; local75++) {
								@Pc(81) Class76 local81 = arg1.aClass76Array2[local75];
								if (local48 == local16[local75] && local64 == arg1.anIntArray284[local75] && local37 == arg1.anIntArray280[local75] && local81.anInt2545 != 0) {
									if (arg0.aClass76Array1 == null) {
										arg0.aClass76Array1 = new Class76[arg0.anInt2001];
									}
									if (arg1.aClass76Array1 == null) {
										arg1.aClass76Array1 = new Class76[local19];
									}
									@Pc(121) Class76 local121 = arg0.aClass76Array1[local21];
									if (local121 == null) {
										local121 = arg0.aClass76Array1[local21] = new Class76(local27);
									}
									@Pc(138) Class76 local138 = arg1.aClass76Array1[local75];
									if (local138 == null) {
										local138 = arg1.aClass76Array1[local75] = new Class76(local81);
									}
									local121.anInt2542 += local81.anInt2542;
									local121.anInt2546 += local81.anInt2546;
									local121.anInt2541 += local81.anInt2541;
									local121.anInt2545 += local81.anInt2545;
									local138.anInt2542 += local27.anInt2542;
									local138.anInt2546 += local27.anInt2546;
									local138.anInt2541 += local27.anInt2541;
									local138.anInt2545 += local27.anInt2545;
									local13++;
									anIntArray282[local21] = anInt2000;
									anIntArray279[local75] = anInt2000;
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
		for (@Pc(232) int local232 = 0; local232 < arg0.anInt1998; local232++) {
			if (anIntArray282[arg0.anIntArray278[local232]] == anInt2000 && anIntArray282[arg0.anIntArray289[local232]] == anInt2000 && anIntArray282[arg0.anIntArray290[local232]] == anInt2000) {
				if (arg0.aByteArray25 == null) {
					arg0.aByteArray25 = new byte[arg0.anInt1998];
				}
				arg0.aByteArray25[local232] = 2;
			}
		}
		for (local37 = 0; local37 < arg1.anInt1998; local37++) {
			if (anIntArray279[arg1.anIntArray278[local37]] == anInt2000 && anIntArray279[arg1.anIntArray289[local37]] == anInt2000 && anIntArray279[arg1.anIntArray290[local37]] == anInt2000) {
				if (arg1.aByteArray25 == null) {
					arg1.aByteArray25 = new byte[arg1.anInt1998];
				}
				arg1.aByteArray25[local37] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)I")
	public static int method1405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "()V")
	public static void method1406() {
		anIntArray282 = null;
		anIntArray279 = null;
		Class2_Sub2_Sub2_Sub7.anIntArray288 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!g;II)Lclient!pf;")
	public static Class2_Sub2_Sub2_Sub7 method1414(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1358(0, arg1);
		return local5 == null ? null : new Class2_Sub2_Sub2_Sub7(local5);
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)I")
	public static int method1417(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 > 127) {
			arg0 = 127;
		}
		return Class2_Sub2_Sub2_Sub7.anIntArray288[arg0];
	}
}
