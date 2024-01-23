import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!s;")
	public static Class88 aClass88_4;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!ai;")
	public static Class7 aClass7_17;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_703 = Static200.method3116("rect_debug=");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public static void method1621(@OriginalArg(0) int arg0) {
		if (!Static199.method3112(arg0)) {
			return;
		}
		@Pc(19) Class6[] local19 = Static82.aClass6ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class6 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt258 = 0;
				local27.anInt269 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method1622(@OriginalArg(0) Class1_Sub8 arg0) {
		Static205.method3192(200000, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BZ)V")
	public static void method1623(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (local7 < arg0.length) {
				@Pc(25) int local25 = (arg0[local7++] & 0xFF) * 64 - Static73.anInt1791;
				@Pc(36) int local36 = (arg0[local7++] & 0xFF) * 64 - Static153.anInt3417;
				@Pc(83) byte local83;
				@Pc(70) int local70;
				if (local25 > 0 && local36 > 0 && Static211.anInt3462 > local25 + 64 && local36 + 64 < Static30.anInt724) {
					@Pc(66) int local66 = Static30.anInt724 - local36 - 1 >> 6;
					local70 = local25 >> 6;
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						for (@Pc(76) int local76 = -64; local76 < 0; local76++) {
							local83 = arg0[local7++];
							if (local83 != 0) {
								if (Static192.aByteArrayArrayArray11[local70][local66] == null) {
									Static192.aByteArrayArrayArray11[local70][local66] = new byte[4096];
								}
								Static192.aByteArrayArrayArray11[local70][local66][local72 + (-(local76 + 1) << 6)] = local83;
								@Pc(122) byte local122 = arg0[local7++];
								if (Static97.aByteArrayArrayArray2[local70][local66] == null) {
									Static97.aByteArrayArrayArray2[local70][local66] = new byte[4096];
								}
								Static97.aByteArrayArrayArray2[local70][local66][(-(local76 + 1) << 6) + local72] = local122;
							}
						}
					}
				} else {
					for (local70 = -4096; local70 < 0; local70++) {
						local83 = arg0[local7++];
						if (local83 != 0) {
							local7++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;Lclient!ai;Lclient!ai;I)V")
	public static void method1624(@OriginalArg(0) Component arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2) {
		if (Static60.aBoolean77) {
			return;
		}
		Static76.method1354();
		@Pc(15) byte[] local15 = arg2.method3242(Static168.anInt3648, 0);
		Static7.aClass1_Sub1_Sub6_Sub1_1 = new Class1_Sub1_Sub6_Sub1(local15, arg0);
		Static31.aClass1_Sub1_Sub6_Sub1_2 = Static7.aClass1_Sub1_Sub6_Sub1_1.method2172();
		Static37.aClass73_1 = Static160.method2691(arg1, Static158.anInt3539);
		Static55.aClass73_2 = Static160.method2691(arg1, Static102.anInt2348);
		Static79.aClass73_3 = Static160.method2691(arg1, Static42.anInt904);
		Static67.aClass73_Sub1Array1 = Static176.method581(arg1, Static87.anInt2031);
		Static73.aClass73Array2 = Static149.method2556(Static88.anInt2051, arg1);
		Static73.anIntArray209 = new int[256];
		for (@Pc(62) int local62 = 0; local62 < 64; local62++) {
			Static73.anIntArray209[local62] = local62 * 262144;
		}
		for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
			Static73.anIntArray209[local78 + 64] = local78 * 1024 + 16711680;
		}
		for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
			Static73.anIntArray209[local98 + 128] = local98 * 4 + 16776960;
		}
		for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
			Static73.anIntArray209[local119 + 192] = 16777215;
		}
		Static162.anIntArray648 = new int[256];
		for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
			Static162.anIntArray648[local138] = local138 * 1024;
		}
		for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
			Static162.anIntArray648[local154 + 64] = local154 * 4 + 65280;
		}
		for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
			Static162.anIntArray648[local172 + 128] = local172 * 262144 + 65535;
		}
		for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
			Static162.anIntArray648[local190 + 192] = 16777215;
		}
		Static171.anIntArray486 = new int[256];
		for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
			Static171.anIntArray486[local209] = local209 * 4;
		}
		for (@Pc(223) int local223 = 0; local223 < 64; local223++) {
			Static171.anIntArray486[local223 + 64] = local223 * 262144 + 255;
		}
		for (@Pc(242) int local242 = 0; local242 < 64; local242++) {
			Static171.anIntArray486[local242 + 128] = local242 * 1024 + 16711935;
		}
		for (@Pc(260) int local260 = 0; local260 < 64; local260++) {
			Static171.anIntArray486[local260 + 192] = 16777215;
		}
		Static122.anIntArray342 = new int[256];
		Static186.anIntArray518 = new int[32768];
		Static186.anIntArray517 = new int[32768];
		Static131.method2193(null);
		Static101.anIntArray476 = new int[32768];
		Static12.aClass60_95 = Static12.aClass60_99;
		Static12.aClass60_94 = Static12.aClass60_99;
		Static43.aBoolean59 = false;
		if (Static155.anInt3456 == 0) {
			Static56.aBoolean74 = true;
		} else {
			Static56.aBoolean74 = false;
		}
		Static94.anInt2196 = 0;
		Static89.anIntArray243 = new int[32768];
		if (Static56.aBoolean74) {
			Static24.method419();
		} else {
			Static202.method3128(Static106.aClass7_Sub1_19, Static69.anInt1711, 255);
		}
		Static151.method2591(false);
		Static60.aBoolean77 = true;
		Static163.method2707();
		Static82.aClass1_Sub1_Sub6_Sub1_3 = new Class1_Sub1_Sub6_Sub1(128, 254);
		Static95.aClass1_Sub1_Sub6_Sub1_5 = new Class1_Sub1_Sub6_Sub1(128, 254);
	}
}
