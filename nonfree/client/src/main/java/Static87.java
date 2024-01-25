import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!qj;")
	public static Class165 aClass165_29;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array7;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt1720;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
	public static final int[] anIntArray215 = new int[3];

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "S")
	public static short aShort15 = 1;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString67 = "flash2:";

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static int anInt1718 = -1;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString69 = "";

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!jj;ZI)V")
	public static void method1672(@OriginalArg(0) Class5_Sub3_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class45 local9 = arg0.method4533();
		if (arg0.anInt4985 == 0) {
			Static145.anInt2839 = -1;
			arg0.anInt4981 = 0;
			Static55.anInt1237 = 0;
			return;
		}
		if (arg0.anInt4977 != -1 && arg0.anInt4936 == 0) {
			@Pc(35) Class121 local35 = Static133.method2520(arg0.anInt4977);
			if (arg0.anInt4984 > 0 && local35.anInt3776 == 0) {
				arg0.anInt4981++;
				Static55.anInt1237 = 0;
				Static145.anInt2839 = -1;
				return;
			}
			if (arg0.anInt4984 <= 0 && local35.anInt3778 == 0) {
				arg0.anInt4981++;
				Static55.anInt1237 = 0;
				Static145.anInt2839 = -1;
				return;
			}
		}
		if (arg0.anInt4934 != -1 && arg0.anInt4951 <= Static215.anInt4246) {
			@Pc(86) Class125 local86 = Static183.method3571(arg0.anInt4934);
			if (local86.aBoolean335 && local86.anInt3913 != -1) {
				@Pc(99) Class121 local99 = Static133.method2520(local86.anInt3913);
				if (arg0.anInt4984 > 0 && local99.anInt3776 == 0) {
					Static145.anInt2839 = -1;
					arg0.anInt4981++;
					Static55.anInt1237 = 0;
					return;
				}
				if (arg0.anInt4984 <= 0 && local99.anInt3778 == 0) {
					Static55.anInt1237 = 0;
					arg0.anInt4981++;
					Static145.anInt2839 = -1;
					return;
				}
			}
		}
		@Pc(139) int local139 = arg0.anInt5050;
		@Pc(142) int local142 = arg0.anInt5047;
		@Pc(159) int local159 = arg0.anIntArray638[arg0.anInt4985 - 1] * 128 + arg0.method4541() * 64;
		@Pc(176) int local176 = arg0.anIntArray637[arg0.anInt4985 - 1] * 128 + arg0.method4541() * 64;
		if (!arg1 && (local159 - local139 > 256 || local159 - local139 < -256 || local176 - local142 > 256 || local176 - local142 < -256)) {
			arg0.anInt5050 = local159;
			Static55.anInt1237 = 0;
			arg0.anInt5047 = local176;
			Static145.anInt2839 = -1;
			return;
		}
		if (local139 >= local159) {
			if (local139 > local159) {
				if (local142 < local176) {
					arg0.method4527(6144);
				} else if (local142 <= local176) {
					arg0.method4527(4096);
				} else {
					arg0.method4527(2048);
				}
			} else if (local142 < local176) {
				arg0.method4527(8192);
			} else if (local176 < local142) {
				arg0.method4527(0);
			}
		} else if (local142 < local176) {
			arg0.method4527(10240);
		} else if (local176 < local142) {
			arg0.method4527(14336);
		} else {
			arg0.method4527(12288);
		}
		@Pc(307) int local307 = 4;
		@Pc(309) boolean local309 = true;
		if (arg0 instanceof Class5_Sub3_Sub3_Sub2) {
			local309 = ((Class5_Sub3_Sub3_Sub2) arg0).aClass122_1.aBoolean324;
		}
		if (local309) {
			@Pc(347) int local347 = arg0.anInt4921 - arg0.aClass11_7.anInt264;
			if (local347 != 0 && arg0.anInt4964 == -1 && arg0.anInt4935 != 0) {
				local307 = 2;
			}
			if (!arg1 && arg0.anInt4985 > 2) {
				local307 = 6;
			}
			if (!arg1 && arg0.anInt4985 > 3) {
				local307 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4985 > 1) {
				local307 = 6;
			}
			if (!arg1 && arg0.anInt4985 > 2) {
				local307 = 8;
			}
		}
		if (arg0.anInt4981 > 0 && arg0.anInt4985 > 1) {
			arg0.anInt4981--;
			local307 = 8;
		}
		@Pc(405) byte local405 = arg0.aByteArray82[arg0.anInt4985 - 1];
		if (local405 == 2) {
			local307 <<= 0x1;
		} else if (local405 == 0) {
			local307 >>= 0x1;
		}
		Static55.anInt1237 = 0;
		if (local9.anInt1477 != -1) {
			local307 <<= 0x7;
			if (arg0.anInt4985 == 1) {
				@Pc(446) int local446 = arg0.anInt4991 * arg0.anInt4991;
				@Pc(464) int local464 = (arg0.anInt5050 <= local159 ? local159 - arg0.anInt5050 : -local159 + arg0.anInt5050) << 7;
				@Pc(480) int local480 = (local176 < arg0.anInt5047 ? arg0.anInt5047 - local176 : local176 - arg0.anInt5047) << 7;
				@Pc(491) int local491 = local480 < local464 ? local464 : local480;
				@Pc(498) int local498 = local9.anInt1477 * 2 * local491;
				if (local498 < local446) {
					arg0.anInt4991 /= 2;
				} else if (local446 / 2 > local491) {
					arg0.anInt4991 -= local9.anInt1477;
					if (arg0.anInt4991 < 0) {
						arg0.anInt4991 = 0;
					}
				} else if (local307 > arg0.anInt4991) {
					arg0.anInt4991 += local9.anInt1477;
					if (local307 < arg0.anInt4991) {
						arg0.anInt4991 = local307;
					}
				}
			} else if (local307 > arg0.anInt4991) {
				arg0.anInt4991 += local9.anInt1477;
				if (arg0.anInt4991 > local307) {
					arg0.anInt4991 = local307;
				}
			} else if (arg0.anInt4991 > 0) {
				arg0.anInt4991 -= local9.anInt1477;
				if (arg0.anInt4991 < 0) {
					arg0.anInt4991 = 0;
				}
			}
			local307 = arg0.anInt4991 >> 7;
			if (local307 < 1) {
				local307 = 1;
			}
		}
		if (local139 < local159) {
			Static55.anInt1237 |= 0x4;
			arg0.anInt5050 += local307;
			if (local159 < arg0.anInt5050) {
				arg0.anInt5050 = local159;
			}
		} else if (local139 > local159) {
			arg0.anInt5050 -= local307;
			Static55.anInt1237 |= 0x8;
			if (arg0.anInt5050 < local159) {
				arg0.anInt5050 = local159;
			}
		}
		if (local142 < local176) {
			Static55.anInt1237 |= 0x1;
			arg0.anInt5047 += local307;
			if (arg0.anInt5047 > local176) {
				arg0.anInt5047 = local176;
			}
		} else if (local142 > local176) {
			Static55.anInt1237 |= 0x2;
			arg0.anInt5047 -= local307;
			if (arg0.anInt5047 < local176) {
				arg0.anInt5047 = local176;
			}
		}
		if (local307 >= 8) {
			Static145.anInt2839 = 2;
		} else {
			Static145.anInt2839 = local405;
		}
		if (arg0.anInt5050 != local159 || arg0.anInt5047 != local176) {
			return;
		}
		arg0.anInt4985--;
		if (arg0.anInt4984 > 0) {
			arg0.anInt4984--;
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1673(@OriginalArg(1) String arg0) {
		if (Static23.aClass123Array1 != null) {
			Static248.aClass1_Sub7_Sub1_2.method728(210);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(arg0));
			Static248.aClass1_Sub7_Sub1_2.method3124(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
	public static void method1674() {
		@Pc(5) Class140 local5 = Static326.aClass140_165;
		synchronized (Static326.aClass140_165) {
			Static326.aClass140_165.method3824(5);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)I")
	public static int method1675(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(60) char local60;
			if (local17 == '\u0000') {
				local60 = arg2.charAt(local13++);
			} else {
				local60 = local17;
			}
			@Pc(76) char local76;
			if (local19 == '\u0000') {
				local76 = arg1.charAt(local15++);
			} else {
				local76 = local19;
			}
			local17 = Static192.method5707(local60);
			local19 = Static192.method5707(local76);
			local60 = Static288.method5428(local60, arg0);
			local76 = Static288.method5428(local76, arg0);
			if (local60 != local76 && Character.toUpperCase(local60) != Character.toUpperCase(local76)) {
				local60 = Character.toLowerCase(local60);
				local76 = Character.toLowerCase(local76);
				if (local76 != local60) {
					return Static157.method2972(local60, arg0) - Static157.method2972(local76, arg0);
				}
			}
		}
		@Pc(135) int local135 = Math.min(local8, local11);
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			if (arg0 == 2) {
				local15 = local11 - local137 - 1;
				local13 = local8 - local137 - 1;
			} else {
				local15 = local137;
				local13 = local137;
			}
			@Pc(168) char local168 = arg2.charAt(local13);
			@Pc(172) char local172 = arg1.charAt(local15);
			if (local172 != local168 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local172 != local168) {
					return Static157.method2972(local168, arg0) - Static157.method2972(local172, arg0);
				}
			}
		}
		@Pc(220) int local220 = local8 - local11;
		if (local220 != 0) {
			return local220;
		}
		for (@Pc(231) int local231 = 0; local231 < local135; local231++) {
			@Pc(237) char local237 = arg2.charAt(local231);
			@Pc(241) char local241 = arg1.charAt(local231);
			if (local241 != local237) {
				return Static157.method2972(local237, arg0) - Static157.method2972(local241, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)I")
	public static int method1677(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
