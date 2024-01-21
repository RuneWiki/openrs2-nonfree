import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
	public static int anInt4119;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray44;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "[I")
	public static int[] anIntArray688 = new int[32];

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1445 = Static170.method3101("blinken1:");

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1446 = Static170.method3101("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1449 = Static170.method3101("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1447 = aClass28_1449;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1448 = Static170.method3101("weiss:");

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	public static int anInt4137 = 0;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
	public static int anInt4138 = 0;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)I")
	public static int method3116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)I")
	public static int method3117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg3;
			arg3 = local6;
		}
		@Pc(23) int local23 = arg1 & 0x3;
		if (local23 == 0) {
			return arg4;
		} else if (local23 == 1) {
			return arg0;
		} else if (local23 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return 1 + 7 - arg3 - arg0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BJ)V")
	public static void method3122(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < Static4.anInt128; local10++) {
			if (Static21.aLongArray3[local10] == arg0) {
				Static4.anInt128--;
				for (@Pc(27) int local27 = local10; local27 < Static4.anInt128; local27++) {
					Static21.aLongArray3[local27] = Static21.aLongArray3[local27 + 1];
					Static11.aClass28Array2[local27] = Static11.aClass28Array2[local27 + 1];
				}
				Static31.anInt968 = Static90.anInt2570;
				Static51.aClass3_Sub8_Sub1_2.method1559(42);
				Static51.aClass3_Sub8_Sub1_2.method1541(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!sh;I)V")
	public static void method3123(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		arg0.anInt1827 = arg0.anInt1821;
		if (arg0.anInt1783 == 0) {
			arg0.anInt1784 = 0;
			return;
		}
		if (arg0.anInt1833 != -1 && arg0.anInt1832 == 0) {
			@Pc(30) Class3_Sub2_Sub4 local30 = Static21.method594(arg0.anInt1833);
			if (arg0.anInt1808 > 0 && local30.anInt547 == 0) {
				arg0.anInt1784++;
				return;
			}
			if (arg0.anInt1808 <= 0 && local30.anInt536 == 0) {
				arg0.anInt1784++;
				return;
			}
		}
		@Pc(65) int local65 = arg0.anInt1800;
		@Pc(68) int local68 = arg0.anInt1792;
		@Pc(83) int local83 = arg0.anIntArray311[arg0.anInt1783 - 1] * 128 + arg0.anInt1787 * 64;
		@Pc(98) int local98 = arg0.anInt1787 * 64 + arg0.anIntArray314[arg0.anInt1783 - 1] * 128;
		if (local83 - local65 > 256 || local83 - local65 < -256 || local98 - local68 > 256 || local98 - local68 < -256) {
			arg0.anInt1792 = local98;
			arg0.anInt1800 = local83;
			return;
		}
		if (local65 >= local83) {
			if (local65 > local83) {
				if (local98 > local68) {
					arg0.anInt1793 = 768;
				} else if (local68 > local98) {
					arg0.anInt1793 = 256;
				} else {
					arg0.anInt1793 = 512;
				}
			} else if (local68 < local98) {
				arg0.anInt1793 = 1024;
			} else if (local68 > local98) {
				arg0.anInt1793 = 0;
			}
		} else if (local68 < local98) {
			arg0.anInt1793 = 1280;
		} else if (local98 >= local68) {
			arg0.anInt1793 = 1536;
		} else {
			arg0.anInt1793 = 1792;
		}
		@Pc(213) int local213 = arg0.anInt1793 - arg0.anInt1795 & 0x7FF;
		if (local213 > 1024) {
			local213 -= 2048;
		}
		@Pc(219) boolean local219 = true;
		@Pc(221) int local221 = 4;
		@Pc(224) int local224 = arg0.anInt1839;
		if (local213 >= -256 && local213 <= 256) {
			local224 = arg0.anInt1831;
		} else if (local213 >= 256 && local213 < 768) {
			local224 = arg0.anInt1791;
		} else if (local213 >= -768 && local213 <= -256) {
			local224 = arg0.anInt1835;
		}
		if (local224 == -1) {
			local224 = arg0.anInt1831;
		}
		arg0.anInt1827 = local224;
		if (arg0 instanceof Class3_Sub2_Sub1_Sub2_Sub2) {
			local219 = ((Class3_Sub2_Sub1_Sub2_Sub2) arg0).aClass3_Sub2_Sub7_1.aBoolean72;
		}
		if (local219) {
			if (arg0.anInt1793 != arg0.anInt1795 && arg0.anInt1796 == -1 && arg0.anInt1816 != 0) {
				local221 = 2;
			}
			if (arg0.anInt1783 > 2) {
				local221 = 6;
			}
			if (arg0.anInt1783 > 3) {
				local221 = 8;
			}
			if (arg0.anInt1784 > 0 && arg0.anInt1783 > 1) {
				arg0.anInt1784--;
				local221 = 8;
			}
		} else {
			if (arg0.anInt1783 > 1) {
				local221 = 6;
			}
			if (arg0.anInt1783 > 2) {
				local221 = 8;
			}
			if (arg0.anInt1784 > 0 && arg0.anInt1783 > 1) {
				arg0.anInt1784--;
				local221 = 8;
			}
		}
		if (arg0.aBooleanArray11[arg0.anInt1783 - 1]) {
			local221 <<= 0x1;
		}
		if (local83 > local65) {
			arg0.anInt1800 += local221;
			if (arg0.anInt1800 > local83) {
				arg0.anInt1800 = local83;
			}
		} else if (local83 < local65) {
			arg0.anInt1800 -= local221;
			if (local83 > arg0.anInt1800) {
				arg0.anInt1800 = local83;
			}
		}
		if (local221 >= 8 && arg0.anInt1831 == arg0.anInt1827 && arg0.anInt1802 != -1) {
			arg0.anInt1827 = arg0.anInt1802;
		}
		if (local98 > local68) {
			arg0.anInt1792 += local221;
			if (arg0.anInt1792 > local98) {
				arg0.anInt1792 = local98;
			}
		} else if (local68 > local98) {
			arg0.anInt1792 -= local221;
			if (arg0.anInt1792 < local98) {
				arg0.anInt1792 = local98;
			}
		}
		if (arg0.anInt1800 != local83 || arg0.anInt1792 != local98) {
			return;
		}
		arg0.anInt1783--;
		if (arg0.anInt1808 > 0) {
			arg0.anInt1808--;
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method3125() {
		anIntArray688 = null;
		aByteArrayArrayArray44 = null;
		aClass28_1447 = null;
		aClass28_1449 = null;
		aClass28_1446 = null;
		aClass28_1445 = null;
		aClass28_1448 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)I")
	public static int method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public static void method3129() {
		if (Static179.aBoolean202 && Static171.anInt4109 != Static93.anInt2605) {
			Static94.method2075(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], Static119.anInt3081, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], Static171.anInt4109, Static19.anInt551);
		} else if (Static86.anInt2526 != Static171.anInt4109) {
			Static86.anInt2526 = Static171.anInt4109;
			Static126.method2501(Static171.anInt4109);
		}
	}
}
