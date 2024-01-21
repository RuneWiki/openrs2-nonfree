import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "[I")
	public static int[] anIntArray83;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!ja;")
	private static Class39 aClass39_386 = Static28.method504("Walk here");

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!ja;")
	private static Class39 aClass39_387 = Static28.method504("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_388 = aClass39_386;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
	public static int[] anIntArray78 = new int[1000];

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "Lclient!ja;")
	public static Class39 aClass39_389 = aClass39_387;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "[Lclient!s;")
	public static Class4_Sub16[] aClass4_Sub16Array2 = new Class4_Sub16[2048];

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "Lclient!ja;")
	public static Class39 aClass39_390 = Static28.method504("<col=ffff00>*V");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lclient!nf;")
	public static Class4_Sub2_Sub11 method469(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub11 local10 = (Class4_Sub2_Sub11) Static101.aClass12_68.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static71.aClass20_35.method474(1, arg0);
		local10 = new Class4_Sub2_Sub11();
		if (local20 != null) {
			local10.method1366(arg0, new Class4_Sub16(local20));
		}
		local10.method1368();
		Static101.aClass12_68.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)I")
	public static int method476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 0;
		while (arg1 > 0) {
			local13 = arg0 & 0x1 | local13 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public static void method478() {
		anIntArray78 = null;
		Class20.anIntArray79 = null;
		anIntArray83 = null;
		aClass39_388 = null;
		aClass39_387 = null;
		aClass39_386 = null;
		aClass39_389 = null;
		aClass4_Sub16Array2 = null;
		aClass39_390 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!de;)V")
	public static void method490(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static46.aBoolean54) {
			Static77.method1295(arg0);
			return;
		}
		if (Static62.anInt1637 == 1 && Static27.anInt741 >= 715 && Static1.anInt9 >= 453) {
			Static5.aBoolean135 = !Static5.aBoolean135;
			if (Static5.aBoolean135) {
				Static59.method1057();
			} else {
				Static9.method191(Static6.aClass39_180, Static49.aClass39_730, Static29.aClass20_Sub1_3);
			}
		}
		if (Static88.anInt2205 == 5) {
			return;
		}
		Static45.anInt1160++;
		if (Static88.anInt2205 != 10) {
			return;
		}
		if (Static105.anInt2043 != 2 && Static44.anInt1125 == 0) {
			if (Static62.anInt1637 == 1 && Static27.anInt741 >= 5 && Static27.anInt741 <= 105 && Static1.anInt9 >= 463 && Static1.anInt9 <= 498) {
				Static7.method183();
				return;
			}
			if (Static83.aClass47_1 != null) {
				Static7.method183();
			}
		}
		@Pc(125) int local125 = Static62.anInt1637;
		@Pc(127) int local127 = Static27.anInt741;
		@Pc(129) int local129 = Static1.anInt9;
		if (Static9.anInt286 == 0) {
			if (local125 == 1 && local127 >= 227 && local127 <= 377 && local129 >= 271 && local129 <= 311) {
				Static9.anInt286 = 3;
				Static80.anInt1893 = 0;
			}
			if (local125 == 1 && local127 >= 387 && local127 <= 537 && local129 >= 271 && local129 <= 311) {
				Static80.anInt1893 = 0;
				Static6.aClass39_182 = Static14.aClass39_249;
				Static9.anInt286 = 2;
				Static6.aClass39_184 = Static119.aClass39_1726;
				Static6.aClass39_185 = Static119.aClass39_1709;
				return;
			}
			return;
		}
		if (Static9.anInt286 == 2) {
			@Pc(224) short local224 = 231;
			@Pc(227) int local227 = local224 + 30;
			if (local125 == 1 && local129 >= 246 && local129 < 261) {
				Static80.anInt1893 = 0;
			}
			local227 += 15;
			if (local125 == 1 && local129 >= 261 && local129 < 276) {
				Static80.anInt1893 = 1;
			}
			local227 += 15;
			if (local125 == 1 && local127 >= 227 && local127 <= 377 && local129 >= 301 && local129 <= 341) {
				Static6.aClass39_179 = Static6.aClass39_179.method937().method955();
				if (Static6.aClass39_179.method953() == 0) {
					Static2.method7(Static122.aClass39_1623, Static119.aClass39_1716, Static119.aClass39_1745);
					return;
				}
				if (Static6.aClass39_183.method953() == 0) {
					Static2.method7(Static18.aClass39_285, Static119.aClass39_1714, Static119.aClass39_1727);
					return;
				}
				Static2.method7(Static4.aClass39_42, Static119.aClass39_1719, Static119.aClass39_1721);
				Static54.method966(20);
				return;
			}
			if (local125 == 1 && local127 >= 387 && local127 <= 537 && local129 >= 301 && local129 <= 341) {
				Static6.aClass39_179 = Static6.aClass39_180;
				Static9.anInt286 = 0;
				Static6.aClass39_183 = Static6.aClass39_180;
			}
			while (true) {
				while (Static48.method783()) {
					@Pc(384) boolean local384 = false;
					for (@Pc(386) int local386 = 0; Static55.aClass39_812.method953() > local386; local386++) {
						if (Static55.anInt1496 == Static55.aClass39_812.method939(local386)) {
							local384 = true;
							break;
						}
					}
					if (Static80.anInt1893 == 0) {
						if (Static35.anInt904 == 85 && Static6.aClass39_179.method953() > 0) {
							Static6.aClass39_179 = Static6.aClass39_179.method938(Static6.aClass39_179.method953() - 1, 0);
						}
						if (Static35.anInt904 == 84 || Static35.anInt904 == 80) {
							Static80.anInt1893 = 1;
						}
						if (local384 && Static6.aClass39_179.method953() < 12) {
							Static6.aClass39_179 = Static6.aClass39_179.method933(Static55.anInt1496);
						}
					} else if (Static80.anInt1893 == 1) {
						if (Static35.anInt904 == 85 && Static6.aClass39_183.method953() > 0) {
							Static6.aClass39_183 = Static6.aClass39_183.method938(Static6.aClass39_183.method953() - 1, 0);
						}
						if (Static35.anInt904 == 84 || Static35.anInt904 == 80) {
							Static80.anInt1893 = 0;
						}
						if (Static1.anInt2 == 2 && Static35.anInt904 == 84) {
							Static6.aClass39_179 = Static6.aClass39_179.method937().method955();
							if (Static6.aClass39_179.method953() == 0) {
								Static2.method7(Static122.aClass39_1623, Static119.aClass39_1716, Static119.aClass39_1745);
								return;
							}
							if (Static6.aClass39_183.method953() == 0) {
								Static2.method7(Static18.aClass39_285, Static119.aClass39_1714, Static119.aClass39_1727);
								return;
							}
							Static2.method7(Static4.aClass39_42, Static119.aClass39_1719, Static119.aClass39_1721);
							Static54.method966(20);
							return;
						}
						if (local384 && Static6.aClass39_183.method953() < 20) {
							Static6.aClass39_183 = Static6.aClass39_183.method933(Static55.anInt1496);
						}
					}
				}
				return;
			}
		}
		if (Static9.anInt286 != 3 || local125 != 1 || local127 < 307 || local127 > 457 || local129 < 301 || local129 > 341) {
			return;
		}
		Static9.anInt286 = 0;
	}
}
