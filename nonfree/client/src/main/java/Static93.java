import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1082 = Static63.method1251("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1083 = Static63.method1251("k");

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1084 = Static63.method1251("headicons_pk");

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1085 = Static63.method1251("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "[Lclient!ba;")
	public static Class8[] aClass8Array1 = new Class8[50];

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1086 = Static63.method1251("Fps:");

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1087 = Static63.method1251("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
	public static int anInt2572 = 0;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
	public static void method1724() {
		@Pc(12) int local12;
		for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
			local12 = (int) (Math.random() * 100.0D);
			if (local12 < 50) {
				Static119.anIntArray484[local5 + 32512] = 255;
			}
		}
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(59) int local59;
		for (local12 = 0; local12 < 100; local12++) {
			local46 = (int) (Math.random() * 124.0D) + 2;
			local53 = (int) (Math.random() * 128.0D) + 128;
			local59 = (local53 << 7) + local46;
			Static119.anIntArray484[local59] = 192;
		}
		for (local46 = 1; local46 < 255; local46++) {
			for (local53 = 1; local53 < 127; local53++) {
				local59 = (local46 << 7) + local53;
				Static99.anIntArray405[local59] = (Static119.anIntArray484[local59 + 128] + Static119.anIntArray484[local59 + 1] + Static119.anIntArray484[local59 + -1] + Static119.anIntArray484[local59 - 128]) / 4;
			}
		}
		Static111.anInt2908 += 128;
		if (Static35.anIntArray162.length < Static111.anInt2908) {
			Static111.anInt2908 -= Static35.anIntArray162.length;
			local53 = (int) (Math.random() * 12.0D);
			Static74.method1690(Static37.aClass5_Sub2_Sub6_Sub4Array3[local53]);
		}
		@Pc(163) int local163;
		for (local53 = 1; local53 < 255; local53++) {
			for (local59 = 1; local59 < 127; local59++) {
				local163 = (local53 << 7) + local59;
				@Pc(183) int local183 = Static99.anIntArray405[local163 + 128] - Static35.anIntArray162[Static111.anInt2908 + local163 & Static35.anIntArray162.length + -1] / 5;
				if (local183 < 0) {
					local183 = 0;
				}
				Static119.anIntArray484[local163] = local183;
			}
		}
		for (local59 = 0; local59 < 255; local59++) {
			Static90.anIntArray369[local59] = Static90.anIntArray369[local59 + 1];
		}
		Static90.anIntArray369[255] = (int) (Math.sin((double) Static3.anInt94 / 14.0D) * 16.0D + Math.sin((double) Static3.anInt94 / 15.0D) * 14.0D + Math.sin((double) Static3.anInt94 / 16.0D) * 12.0D);
		if (Static96.anInt2623 > 0) {
			Static96.anInt2623 -= 4;
		}
		if (Static61.anInt1808 > 0) {
			Static61.anInt1808 -= 4;
		}
		if (Static61.anInt1808 != 0 || Static96.anInt2623 != 0) {
			return;
		}
		local163 = (int) (Math.random() * 2000.0D);
		if (local163 == 0) {
			Static61.anInt1808 = 1024;
		}
		if (local163 == 1) {
			Static96.anInt2623 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
	public static int method1726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg1 + (arg0 << 16));
		return Static107.aClass5_Sub2_Sub11_1 != null && local15 == Static107.aClass5_Sub2_Sub11_1.aLong146 ? Static104.aClass5_Sub9_5.anInt2140 * 99 / (Static104.aClass5_Sub9_5.aByteArray28.length - Static107.aClass5_Sub2_Sub11_1.aByte3) + 1 : 0;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	public static void method1727() {
		aClass8Array1 = null;
		aClass45_1086 = null;
		aClass45_1087 = null;
		aClass45_1084 = null;
		aClass45_1085 = null;
		aClass45_1082 = null;
		aClass45_1083 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ia;ZI)I")
	public static int method1728(@OriginalArg(0) Class5_Sub2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray17 == null || arg1 >= arg0.anIntArrayArray17.length) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg0.anIntArrayArray17[arg1];
			@Pc(27) int local27 = 0;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local29++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 1) {
					local38 = Static23.anIntArray130[local25[local29++]];
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 2) {
					local38 = Static57.anIntArray260[local25[local29++]];
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 3) {
					local38 = Static52.anIntArray488[local25[local29++]];
				}
				@Pc(112) int local112;
				@Pc(123) Class5_Sub2_Sub8 local123;
				@Pc(128) int local128;
				@Pc(141) int local141;
				if (local36 == 4) {
					local112 = local25[local29++] << 16;
					@Pc(119) int local119 = local112 + local25[local29++];
					local123 = Static80.method1507(local119);
					local128 = local25[local29++];
					if (local128 != -1 && (!Static81.method1515(local128).aBoolean9 || Static68.aBoolean95)) {
						for (local141 = 0; local141 < local123.anIntArray201.length; local141++) {
							if (local128 + 1 == local123.anIntArray201[local141]) {
								local38 += local123.anIntArray208[local141];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static117.anIntArray483[local25[local29++]];
				}
				if (local36 == 6) {
					local38 = Class4_Sub2.anIntArray366[Static57.anIntArray260[local25[local29++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static117.anIntArray483[local25[local29++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt1569;
				}
				if (local36 == 9) {
					for (local112 = 0; local112 < 25; local112++) {
						if (Static33.aBooleanArray9[local112]) {
							local38 += Static57.anIntArray260[local112];
						}
					}
				}
				if (local36 == 10) {
					local112 = local25[local29++] << 16;
					local112 += local25[local29++];
					local123 = Static80.method1507(local112);
					local128 = local25[local29++];
					if (local128 != -1 && (!Static81.method1515(local128).aBoolean9 || Static68.aBoolean95)) {
						for (local141 = 0; local141 < local123.anIntArray201.length; local141++) {
							if (local128 + 1 == local123.anIntArray201[local141]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static48.anInt1591;
				}
				if (local36 == 12) {
					local38 = Static59.anInt1756;
				}
				if (local36 == 13) {
					local112 = Static117.anIntArray483[local25[local29++]];
					@Pc(340) int local340 = local25[local29++];
					local38 = (0x1 << local340 & local112) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local112 = local25[local29++];
					local38 = Static112.method2047(local112);
				}
				if (local36 == 18) {
					local38 = Static78.anInt2210 + (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 >> 7);
				}
				if (local36 == 19) {
					local38 = (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 >> 7) + Static6.anInt162;
				}
				if (local36 == 20) {
					local38 = local25[local29++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local27 += local38;
					}
					if (local31 == 1) {
						local27 -= local38;
					}
					if (local31 == 2 && local38 != 0) {
						local27 /= local38;
					}
					if (local31 == 3) {
						local27 *= local38;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(443) Exception local443) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Lclient!te;")
	public static Class5_Sub2_Sub14 method1729(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub2_Sub14 local8 = (Class5_Sub2_Sub14) Static100.aClass67_22.method1823((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static13.aClass29_10.method733(arg0, 5);
		local8 = new Class5_Sub2_Sub14();
		if (local22 != null) {
			local8.method1947(new Class5_Sub9(local22));
		}
		Static100.aClass67_22.method1818(local8, (long) arg0);
		return local8;
	}
}
