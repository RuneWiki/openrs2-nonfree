import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
	public static int anInt1545 = -1;

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
	public static int anInt1546 = 0;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "[I")
	public static final int[] anIntArray77 = new int[500];

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
	public static void method1391() {
		if (Static457.aClass57_11 == null) {
			return;
		}
		if (Static40.aBoolean61) {
			Static175.method2575();
		}
		Static51.aClass339_1.method8425();
		Static427.method9314();
		Static510.method7465();
		Static203.method2914();
		Static452.method6465();
		Static168.method2445(0);
		if (Static86.aClass311_1 != null) {
			Static86.aClass311_1.method7506();
		}
		Static637.method8917();
		Static234.method3394(-6177);
		Static220.method3152();
		Static85.method1305();
		Static511.method6253(false);
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			@Pc(58) Class8_Sub1_Sub3_Sub2_Sub1 local58 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local52];
			if (local58 != null) {
				for (@Pc(62) int local62 = 0; local62 < local58.aClass164Array3.length; local62++) {
					local58.aClass164Array3[local62] = null;
				}
			}
		}
		for (@Pc(87) int local87 = 0; local87 < Static230.anInt3776; local87++) {
			@Pc(94) Class8_Sub1_Sub3_Sub2_Sub2 local94 = Static85.aClass5_Sub35Array1[local87].aClass8_Sub1_Sub3_Sub2_Sub2_2;
			if (local94 != null) {
				for (@Pc(98) int local98 = 0; local98 < local94.aClass164Array3.length; local98++) {
					local94.aClass164Array3[local98] = null;
				}
			}
		}
		Static158.aClass203_4 = null;
		Static113.aClass203_3 = null;
		Static457.aClass57_11.method7722();
		Static457.aClass57_11 = null;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILclient!ha;I)V")
	public static void method1392(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (!Static570.aBoolean734 || !Static119.aBoolean171) {
			Static443.anInt7616 = 0;
			return;
		}
		if (Static58.aBoolean73) {
			Static463.aLong235 = Static498.aClass3_1.method7050();
		}
		Static386.anInt6607 = 0;
		Static267.anInt4664 = 0;
		Static331.anInt5924 = 0;
		@Pc(32) int[] local32 = arg1.Y();
		Static617.anInt10169 = (int) ((float) local32[2] / 3.0F);
		Static17.anInt299 = (int) ((float) local32[3] / 3.0F);
		arg1.method7692(Static376.anIntArray350);
		if (Static5.anInt9541 != (int) ((float) Static376.anIntArray350[0] / 3.0F) || (int) ((float) Static376.anIntArray350[1] / 3.0F) != Static114.anInt1831) {
			Static5.anInt9541 = (int) ((float) Static376.anIntArray350[0] / 3.0F);
			Static114.anInt1831 = (int) ((float) Static376.anIntArray350[1] / 3.0F);
			Static502.anInt8565 = Static5.anInt9541 >> 1;
			Static120.anInt1905 = Static114.anInt1831 >> 1;
			Static58.anIntArray45 = new int[Static114.anInt1831 * Static5.anInt9541];
		}
		Static372.aClass203_13 = arg1.method7720();
		Static443.anInt7616 = 0;
		for (@Pc(113) int local113 = 0; local113 < Static57.anInt865; local113++) {
			Static105.method1532(Static394.aClass337Array5[local113], arg1, arg0);
		}
		@Pc(134) int local134 = 0;
		if (113 < 76) {
			return;
		}
		while (local134 < Static372.anInt8186) {
			Static105.method1532(Static292.aClass337Array4[local134], arg1, arg0);
			local134++;
		}
		for (@Pc(154) int local154 = 0; local154 < Static603.anInt10076; local154++) {
			Static105.method1532(Static265.aClass337Array3[local154], arg1, arg0);
		}
		Static224.anInt3656 = 0;
		if (Static443.anInt7616 > 0) {
			@Pc(185) int local185 = Static58.anIntArray45.length;
			@Pc(192) int local192 = local185 - local185 & 0x7;
			@Pc(194) int local194 = 0;
			while (local192 > local194) {
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
			}
			while (local185 > local194) {
				Static58.anIntArray45[local194++] = Integer.MAX_VALUE;
			}
			Static49.anInt6793 = 1;
			for (@Pc(261) int local261 = 0; local261 < Static443.anInt7616; local261++) {
				@Pc(267) Class337 local267 = Static128.aClass337Array6[local261];
				Static516.method7501(local267.aShortArray127[0], local267.aShortArray125[3], local267.aShortArray126[0], local267.aShortArray125[0], local267.aShortArray127[1], local267.aShortArray126[1], local267.aShortArray126[3], local267.aShortArray125[1], local267.aShortArray127[3]);
				Static516.method7501(local267.aShortArray127[1], local267.aShortArray125[3], local267.aShortArray126[1], local267.aShortArray125[1], local267.aShortArray127[2], local267.aShortArray126[2], local267.aShortArray126[3], local267.aShortArray125[2], local267.aShortArray127[3]);
			}
			Static49.anInt6793 = 2;
		}
		if (Static58.aBoolean73) {
			Static46.aLong23 = Static498.aClass3_1.method7050() - Static463.aLong235;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)I")
	public static int method1393(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(19) int local19 = local9 | local9 >>> 1;
		@Pc(25) int local25 = local19 | local19 >>> 2;
		@Pc(31) int local31 = local25 | local25 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return local43 + 1;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)[Lclient!dv;")
	public static Class96[] method1394() {
		return new Class96[] { Static575.aClass96_23, Static659.aClass96_26, Static46.aClass96_3, Static82.aClass96_27, Static358.aClass96_13, Static518.aClass96_18, Static415.aClass96_24, Static246.aClass96_9, Static547.aClass96_21, Static286.aClass96_11, Static579.aClass96_25, Static87.aClass96_5, Static242.aClass96_8, Static557.aClass96_22 };
	}
}
