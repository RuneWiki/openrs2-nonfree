import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ep", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ep", name = "J", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
	public static int anInt1745;

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
	public static int anInt1738 = 0;

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "[Lclient!ft;")
	public static final Class85_Sub1[] aClass85_Sub1Array1 = new Class85_Sub1[30];

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIB)V")
	public static void method1504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub5_Sub11 local13 = Static188.method2688(arg0, 12);
		local13.method2661();
		local13.anInt3213 = arg1;
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
	public static void method1505() {
		Static18.aClass1_Sub28_Sub1_1.method5347(Static285.aClass82_68.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static231.aClass82_53.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static305.aClass82_72.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static19.aClass82_4.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static257.aClass82_59.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static206.aClass82_50.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static447.aClass82_54.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static145.aClass82_27.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static448.aClass82_104.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static146.aClass82_40.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static332.aClass82_77.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static409.aClass82_93.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static73.aClass82_19.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static332.aClass82_76.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static348.aClass82_81.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static459.aClass82_100.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static223.aClass82_80.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static388.aClass82_89.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static362.aClass82_21.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static104.aClass82_24.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static142.aClass82_39.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static441.aClass82_101.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static168.aClass82_44.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static160.aClass82_43.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static240.aClass82_91.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static394.aClass82_90.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static307.aClass82_74.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static337.aClass82_79.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static31.aClass82_6.method1824());
		Static18.aClass1_Sub28_Sub1_1.method5347(Static431.aClass82_98.method1824());
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(CI)Z")
	public static boolean method1506(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IJ)V")
	public static void method1510(@OriginalArg(1) long arg0) {
		@Pc(12) int local12 = Static436.anInt7317;
		@Pc(24) int local24;
		@Pc(32) int local32;
		if (local12 != Static140.anInt2485) {
			local24 = local12 - Static140.anInt2485;
			local32 = (int) ((long) local24 * arg0 / 320L);
			if (local24 <= 0) {
				if (local32 == 0) {
					local32 = -1;
				} else if (local32 < local24) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = 1;
			} else if (local32 > local24) {
				local32 = local24;
			}
			Static140.anInt2485 += local32;
		}
		@Pc(78) int local78 = Static378.anInt2804;
		if (Static52.anInt896 != local78) {
			local24 = local78 - Static52.anInt896;
			local32 = (int) ((long) local24 * arg0 / 320L);
			if (local24 > 0) {
				if (local32 == 0) {
					local32 = 1;
				} else if (local32 > local24) {
					local32 = local24;
				}
			} else if (local32 == 0) {
				local32 = -1;
			} else if (local32 < local24) {
				local32 = local24;
			}
			Static52.anInt896 += local32;
		}
		if (!Static453.aClass136_Sub1_1.aBoolean495) {
			Static262.aFloat62 += (float) arg0 * Static351.aFloat72 / 40.0F * 8.0F;
			Static98.aFloat20 += (float) arg0 * Static252.aFloat61 / 40.0F * 8.0F;
		}
		Static415.method5402();
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(CI)B")
	public static byte method1513(@OriginalArg(0) char arg0) {
		@Pc(31) byte local31;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local31 = (byte) arg0;
		} else if (arg0 == '€') {
			local31 = -128;
		} else if (arg0 == '‚') {
			local31 = -126;
		} else if (arg0 == 'ƒ') {
			local31 = -125;
		} else if (arg0 == '„') {
			local31 = -124;
		} else if (arg0 == '…') {
			local31 = -123;
		} else if (arg0 == '†') {
			local31 = -122;
		} else if (arg0 == '‡') {
			local31 = -121;
		} else if (arg0 == 'ˆ') {
			local31 = -120;
		} else if (arg0 == '‰') {
			local31 = -119;
		} else if (arg0 == 'Š') {
			local31 = -118;
		} else if (arg0 == '‹') {
			local31 = -117;
		} else if (arg0 == 'Œ') {
			local31 = -116;
		} else if (arg0 == 'Ž') {
			local31 = -114;
		} else if (arg0 == '‘') {
			local31 = -111;
		} else if (arg0 == '’') {
			local31 = -110;
		} else if (arg0 == '“') {
			local31 = -109;
		} else if (arg0 == '”') {
			local31 = -108;
		} else if (arg0 == '•') {
			local31 = -107;
		} else if (arg0 == '–') {
			local31 = -106;
		} else if (arg0 == '—') {
			local31 = -105;
		} else if (arg0 == '˜') {
			local31 = -104;
		} else if (arg0 == '™') {
			local31 = -103;
		} else if (arg0 == 'š') {
			local31 = -102;
		} else if (arg0 == '›') {
			local31 = -101;
		} else if (arg0 == 'œ') {
			local31 = -100;
		} else if (arg0 == 'ž') {
			local31 = -98;
		} else if (arg0 == 'Ÿ') {
			local31 = -97;
		} else {
			local31 = 63;
		}
		return local31;
	}
}
