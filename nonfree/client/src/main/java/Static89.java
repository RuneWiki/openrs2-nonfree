import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!ev;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!tc;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "Lclient!ii;")
	public static Class117 aClass117_1;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!wl;")
	public static Class6_Sub1_Sub2 aClass6_Sub1_Sub2_2 = new Class6_Sub1_Sub2(8192);

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method1608() {
		for (@Pc(3) int local3 = 0; local3 < Static415.anInt7434; local3++) {
			@Pc(9) Class241 local9 = Static302.aClass241Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(124) int local124;
			if (local9.aClass6_Sub4_Sub1_4 == null) {
				local9.anInt7113--;
				if (local9.anInt7113 < (local9.aByte102 == 2 ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte102 == 1 && local9.aClass127_1 == null) {
						local9.aClass127_1 = Static454.method3004(Static298.aClass100_55, local9.anInt7112, 0);
						if (local9.aClass127_1 == null) {
							continue;
						}
						local9.anInt7113 += local9.aClass127_1.method3002();
					} else if (local9.aByte102 == 2 && (local9.aClass6_Sub26_1 == null || local9.aClass6_Sub17_Sub1_2 == null)) {
						if (local9.aClass6_Sub26_1 == null) {
							local9.aClass6_Sub26_1 = Static277.method4181(Static101.aClass100_13, local9.anInt7112);
						}
						if (local9.aClass6_Sub26_1 == null) {
							continue;
						}
						if (local9.aClass6_Sub17_Sub1_2 == null) {
							local9.aClass6_Sub17_Sub1_2 = local9.aClass6_Sub26_1.method4179(new int[] { 22050 });
							if (local9.aClass6_Sub17_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local9.anInt7113 < 0) {
						if (local9.anInt7110 == 0) {
							local124 = local9.anInt7109 * Static291.aClass28_Sub1_1.anInt1042 >> 8;
						} else {
							@Pc(133) int local133 = local9.anInt7110 >> 24 & 0x3;
							if (local133 == Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103) {
								@Pc(152) int local152 = (local9.anInt7110 & 0xFF) << 7;
								@Pc(159) int local159 = local9.anInt7110 >> 16 & 0xFF;
								@Pc(169) int local169 = (local159 << 7) + 64 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202;
								if (local169 < 0) {
									local169 = -local169;
								}
								@Pc(184) int local184 = local9.anInt7110 >> 8 & 0xFF;
								@Pc(194) int local194 = (local184 << 7) + 64 - Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207;
								if (local194 < 0) {
									local194 = -local194;
								}
								@Pc(208) int local208 = local169 + local194 - 128;
								if (local152 < local208) {
									local9.anInt7113 = -99999;
									continue;
								}
								if (local208 < 0) {
									local208 = 0;
								}
								local124 = local9.anInt7109 * Static291.aClass28_Sub1_1.anInt1036 * (local152 - local208) / local152 >> 8;
							} else {
								local124 = 0;
							}
						}
						if (local124 > 0) {
							@Pc(242) Class6_Sub17_Sub1 local242 = null;
							if (local9.aByte102 == 1) {
								local242 = local9.aClass127_1.method3001().method2572(Static9.aClass14_1);
							} else if (local9.aByte102 == 2) {
								local242 = local9.aClass6_Sub17_Sub1_2;
							}
							@Pc(270) Class6_Sub4_Sub1 local270 = local9.aClass6_Sub4_Sub1_4 = Static452.method431(local242, local124);
							local270.method435(local9.anInt7108 - 1);
							Static360.aClass6_Sub4_Sub4_2.method5905(local270);
						}
					}
				}
			} else if (!local9.aClass6_Sub4_Sub1_4.method6531()) {
				local11 = true;
			}
			if (local11) {
				Static415.anInt7434--;
				for (local124 = local3; local124 < Static415.anInt7434; local124++) {
					Static302.aClass241Array1[local124] = Static302.aClass241Array1[local124 + 1];
				}
				local3--;
			}
		}
		if (Static5.aBoolean10 && !Static434.method6300()) {
			if (Static291.aClass28_Sub1_1.anInt1033 != 0 && Static168.anInt3378 != -1) {
				Static210.method3214(Static291.aClass28_Sub1_1.anInt1033, Static168.anInt3378, Static263.aClass100_51);
			}
			Static5.aBoolean10 = false;
		} else if (Static291.aClass28_Sub1_1.anInt1033 != 0 && Static168.anInt3378 != -1 && !Static434.method6300()) {
			Static403.method5961(Static63.aClass92_28);
			Static109.aClass6_Sub1_Sub1_5.method6461(Static168.anInt3378);
			Static168.anInt3378 = -1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIB)V")
	public static void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static291.aClass28_Sub1_1.anInt1042 != 0 && arg3 != 0 && Static415.anInt7434 < 50 && arg2 != -1) {
			Static302.aClass241Array1[Static415.anInt7434++] = new Class241((byte) 2, arg2, arg3, arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZIIZ)V")
	public static void method1612(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static445.method6524(0, Static266.aClass152_Sub1Array2.length - 1, arg1, arg0, arg2, arg3);
		Static302.anInt5365 = 0;
		Static91.aClass6_Sub30_2 = null;
	}
}
