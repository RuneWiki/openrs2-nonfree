import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!re;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!ea;")
	private static Class18 aClass18_645 = Static8.method128(" is already on your ignore list)3");

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!ea;")
	private static Class18 aClass18_648 = Static8.method128(" ");

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_646 = aClass18_648;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_647 = Static8.method128("<col=80ff00>");

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!ea;")
	private static Class18 aClass18_650 = Static8.method128("Login limit exceeded)3");

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_649 = aClass18_650;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public static int anInt2632 = 2;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Lclient!ea;")
	public static Class18 aClass18_651 = Static8.method128("Titelbild geladen)3");

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "Lclient!ea;")
	public static Class18 aClass18_652 = Static8.method128(":duelreq:");

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "Lclient!ea;")
	public static Class18 aClass18_653 = aClass18_645;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	public static int anInt2639 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method1879() {
		for (@Pc(10) Class1_Sub9 local10 = (Class1_Sub9) Static12.aClass59_59.method2417(); local10 != null; local10 = (Class1_Sub9) Static12.aClass59_59.method2424()) {
			if (local10.aClass1_Sub5_Sub4_1 != null) {
				Static2.aClass1_Sub5_Sub2_1.method1191(local10.aClass1_Sub5_Sub4_1);
				local10.aClass1_Sub5_Sub4_1 = null;
			}
			if (local10.aClass1_Sub5_Sub4_2 != null) {
				Static2.aClass1_Sub5_Sub2_1.method1191(local10.aClass1_Sub5_Sub4_2);
				local10.aClass1_Sub5_Sub4_2 = null;
			}
		}
		Static12.aClass59_59.method2416();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!ef;)I")
	public static int method1881(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		if (arg1.anIntArrayArray29 == null || arg0 >= arg1.anIntArrayArray29.length) {
			return -2;
		}
		try {
			@Pc(21) int local21 = 0;
			@Pc(26) int[] local26 = arg1.anIntArrayArray29[arg0];
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local26[local33++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local21;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 1) {
					local42 = Static166.anIntArray410[local26[local33++]];
				}
				if (local40 == 2) {
					local42 = Static141.anIntArray189[local26[local33++]];
				}
				if (local40 == 3) {
					local42 = Static65.anIntArray168[local26[local33++]];
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				@Pc(118) int local118;
				@Pc(129) Class20 local129;
				@Pc(134) int local134;
				@Pc(146) int local146;
				if (local40 == 4) {
					local118 = local26[local33++] << 16;
					@Pc(125) int local125 = local118 + local26[local33++];
					local129 = Static84.method1826(local125);
					local134 = local26[local33++];
					if (local134 != -1 && (!Static101.method2134(local134).aBoolean2 || Static124.aBoolean153)) {
						for (local146 = 0; local146 < local129.anIntArray79.length; local146++) {
							if (local134 + 1 == local129.anIntArray79[local146]) {
								local42 += local129.anIntArray82[local146];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static170.anIntArray420[local26[local33++]];
				}
				if (local40 == 6) {
					local42 = Class19.anIntArray74[Static141.anIntArray189[local26[local33++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static170.anIntArray420[local26[local33++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3621;
				}
				if (local40 == 9) {
					for (local118 = 0; local118 < 25; local118++) {
						if (Static42.aBooleanArray3[local118]) {
							local42 += Static141.anIntArray189[local118];
						}
					}
				}
				if (local40 == 10) {
					local118 = local26[local33++] << 16;
					local118 += local26[local33++];
					local129 = Static84.method1826(local118);
					local134 = local26[local33++];
					if (local134 != -1 && (!Static101.method2134(local134).aBoolean2 || Static124.aBoolean153)) {
						for (local146 = 0; local146 < local129.anIntArray79.length; local146++) {
							if (local134 + 1 == local129.anIntArray79[local146]) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static150.anInt4133;
				}
				if (local40 == 12) {
					local42 = Static74.anInt2245;
				}
				if (local40 == 13) {
					local118 = Static170.anIntArray420[local26[local33++]];
					@Pc(333) int local333 = local26[local33++];
					local42 = (local118 & 0x1 << local333) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local118 = local26[local33++];
					local42 = Static59.method549(local118);
				}
				if (local40 == 18) {
					local42 = Static117.anInt3328 + (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 >> 7);
				}
				if (local40 == 19) {
					local42 = (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 >> 7) + Static110.anInt3227;
				}
				if (local40 == 20) {
					local42 = local26[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local21 += local42;
					}
					if (local35 == 1) {
						local21 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local21 /= local42;
					}
					if (local35 == 3) {
						local21 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(439) Exception local439) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1882() {
		aClass18_645 = null;
		aClass68_1 = null;
		aClass18_650 = null;
		aClass18_651 = null;
		aClass18_652 = null;
		aClass18_653 = null;
		aClass18_648 = null;
		aClass18_647 = null;
		aClass18_646 = null;
		aClass18_649 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ea;IILclient!ea;Lclient!ea;)V")
	public static void method1883(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class18 arg2, @OriginalArg(4) Class18 arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static93.anIntArray260[local3] = Static93.anIntArray260[local3 - 1];
			Static148.aClass18Array21[local3] = Static148.aClass18Array21[local3 - 1];
			Static59.aClass18Array4[local3] = Static59.aClass18Array4[local3 - 1];
			Static65.aClass18Array10[local3] = Static65.aClass18Array10[local3 - 1];
		}
		Static157.anInt4315 = Static167.anInt4526;
		Static19.anInt567++;
		Static93.anIntArray260[0] = arg1;
		Static148.aClass18Array21[0] = arg0;
		Static59.aClass18Array4[0] = arg2;
		Static65.aClass18Array10[0] = arg3;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ea;IBZLclient!dd;Lclient!ea;)V")
	public static void method1885(@OriginalArg(0) Class18 arg0, @OriginalArg(4) Class16 arg1, @OriginalArg(5) Class18 arg2) {
		@Pc(8) int local8 = arg1.method2246(arg0);
		@Pc(19) int local19 = arg1.method2251(arg2, local8);
		Static28.method2243(255, local19, arg1, local8);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1886() {
		Static167.aClass1_Sub6_Sub1_3.method559();
		@Pc(13) int local13 = Static167.aClass1_Sub6_Sub1_3.method562(8);
		@Pc(22) int local22;
		if (local13 < Static155.anInt4267) {
			for (local22 = local13; local22 < Static155.anInt4267; local22++) {
				Static35.anIntArray48[Static118.anInt3362++] = Static150.anIntArray382[local22];
			}
		}
		if (Static155.anInt4267 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static155.anInt4267 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static150.anIntArray382[local22];
			@Pc(68) Class1_Sub1_Sub5_Sub1_Sub1 local68 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local64];
			@Pc(75) int local75 = Static167.aClass1_Sub6_Sub1_3.method562(1);
			if (local75 == 0) {
				Static150.anIntArray382[Static155.anInt4267++] = local64;
				local68.anInt3557 = Static41.anInt1322;
			} else {
				@Pc(98) int local98 = Static167.aClass1_Sub6_Sub1_3.method562(2);
				if (local98 == 0) {
					Static150.anIntArray382[Static155.anInt4267++] = local64;
					local68.anInt3557 = Static41.anInt1322;
					Static82.anIntArray220[Static76.anInt2355++] = local64;
				} else {
					@Pc(145) int local145;
					@Pc(157) int local157;
					if (local98 == 1) {
						Static150.anIntArray382[Static155.anInt4267++] = local64;
						local68.anInt3557 = Static41.anInt1322;
						local145 = Static167.aClass1_Sub6_Sub1_3.method562(3);
						local68.method2477(false, local145);
						local157 = Static167.aClass1_Sub6_Sub1_3.method562(1);
						if (local157 == 1) {
							Static82.anIntArray220[Static76.anInt2355++] = local64;
						}
					} else if (local98 == 2) {
						Static150.anIntArray382[Static155.anInt4267++] = local64;
						local68.anInt3557 = Static41.anInt1322;
						local145 = Static167.aClass1_Sub6_Sub1_3.method562(3);
						local68.method2477(true, local145);
						local157 = Static167.aClass1_Sub6_Sub1_3.method562(3);
						local68.method2477(true, local157);
						@Pc(213) int local213 = Static167.aClass1_Sub6_Sub1_3.method562(1);
						if (local213 == 1) {
							Static82.anIntArray220[Static76.anInt2355++] = local64;
						}
					} else if (local98 == 3) {
						Static35.anIntArray48[Static118.anInt3362++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public static void method1887() {
		if (Static112.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static32.anIntArray71[188] = 71;
			Static32.anIntArray71[186] = 57;
			Static32.anIntArray71[189] = 26;
			Static32.anIntArray71[223] = 28;
			Static32.anIntArray71[191] = 73;
			Static32.anIntArray71[192] = 58;
			Static32.anIntArray71[220] = 74;
			Static32.anIntArray71[222] = 59;
			Static32.anIntArray71[190] = 72;
			Static32.anIntArray71[187] = 27;
			Static32.anIntArray71[221] = 43;
			Static32.anIntArray71[219] = 42;
			return;
		}
		if (Static112.aMethod1 == null) {
			Static32.anIntArray71[222] = 59;
			Static32.anIntArray71[192] = 58;
		} else {
			Static32.anIntArray71[520] = 59;
			Static32.anIntArray71[222] = 58;
			Static32.anIntArray71[192] = 28;
		}
		Static32.anIntArray71[92] = 74;
		Static32.anIntArray71[46] = 72;
		Static32.anIntArray71[93] = 43;
		Static32.anIntArray71[47] = 73;
		Static32.anIntArray71[45] = 26;
		Static32.anIntArray71[61] = 27;
		Static32.anIntArray71[59] = 57;
		Static32.anIntArray71[91] = 42;
		Static32.anIntArray71[44] = 71;
	}
}
