import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
	public static int anInt2084 = -1;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "[I")
	public static final int[] anIntArray148 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static103.method2158(arg0, arg1) | (arg0 & 0x60000) != 0 || Static240.method4633(arg1, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ba;ILclient!gr;BII)V")
	public static void method1889(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg2.method3531(arg3, arg0.K(), arg0.LA(), arg1, arg0.ha(), arg0.EA(), arg0.DA(), arg0.M(), arg0.ZA(), arg4);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Z")
	public static boolean method1890(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method1891(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(60) char local60;
			if (local17 == '\u0000') {
				local60 = arg0.charAt(local13++);
			} else {
				local60 = local17;
			}
			@Pc(79) char local79;
			if (local19 == '\u0000') {
				local79 = arg1.charAt(local15++);
			} else {
				local79 = local19;
			}
			local17 = Static119.method2181(local60);
			local19 = Static119.method2181(local79);
			local60 = Static366.method5846(local60, arg2);
			local79 = Static366.method5846(local79, arg2);
			if (local79 != local60 && Character.toUpperCase(local60) != Character.toUpperCase(local79)) {
				local60 = Character.toLowerCase(local60);
				local79 = Character.toLowerCase(local79);
				if (local60 != local79) {
					return Static54.method1264(local60, arg2) - Static54.method1264(local79, arg2);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg2 == 2) {
				local15 = local11 - local145 - 1;
				local13 = local8 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(173) char local173 = arg0.charAt(local13);
			@Pc(177) char local177 = arg1.charAt(local15);
			if (local177 != local173 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local173 != local177) {
					return Static54.method1264(local173, arg2) - Static54.method1264(local177, arg2);
				}
			}
		}
		@Pc(228) int local228 = local8 - local11;
		if (local228 != 0) {
			return local228;
		}
		for (@Pc(235) int local235 = 0; local235 < local143; local235++) {
			@Pc(241) char local241 = arg0.charAt(local235);
			@Pc(245) char local245 = arg1.charAt(local235);
			if (local241 != local245) {
				return Static54.method1264(local241, arg2) - Static54.method1264(local245, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!fp;Z)V")
	public static void method1892(@OriginalArg(1) Class11_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class169 local9 = arg0.method6209();
		if (arg0.anInt7432 == 0) {
			Static415.anInt7773 = -1;
			arg0.anInt7433 = 0;
			Static566.anInt9589 = 0;
			return;
		}
		if (arg0.anInt7387 != -1 && arg0.anInt7401 == 0) {
			@Pc(36) Class16 local36 = Static114.aClass156_2.method4101(arg0.anInt7387);
			if (arg0.anInt7435 > 0 && local36.anInt589 == 0) {
				Static566.anInt9589 = 0;
				arg0.anInt7433++;
				Static415.anInt7773 = -1;
				return;
			}
			if (arg0.anInt7435 <= 0 && local36.anInt583 == 0) {
				Static566.anInt9589 = 0;
				arg0.anInt7433++;
				Static415.anInt7773 = -1;
				return;
			}
		}
		@Pc(111) Class16 local111;
		@Pc(98) Class212 local98;
		if (arg0.anInt7384 != -1 && Static508.anInt8998 >= arg0.anInt7405) {
			local98 = Static355.aClass278_2.method6826(arg0.anInt7384);
			if (local98.aBoolean450 && local98.anInt6056 != -1) {
				local111 = Static114.aClass156_2.method4101(local98.anInt6056);
				if (arg0.anInt7435 > 0 && local111.anInt589 == 0) {
					arg0.anInt7433++;
					Static415.anInt7773 = -1;
					Static566.anInt9589 = 0;
					return;
				}
				if (arg0.anInt7435 <= 0 && local111.anInt583 == 0) {
					Static566.anInt9589 = 0;
					arg0.anInt7433++;
					Static415.anInt7773 = -1;
					return;
				}
			}
		}
		if (arg0.anInt7384 != -1 && arg0.anInt7405 <= Static508.anInt8998) {
			local98 = Static355.aClass278_2.method6826(arg0.anInt7384);
			if (local98.aBoolean450 && local98.anInt6056 != -1) {
				local111 = Static114.aClass156_2.method4101(local98.anInt6056);
				if (arg0.anInt7435 > 0 && local111.anInt589 == 0) {
					Static566.anInt9589 = 0;
					Static415.anInt7773 = -1;
					arg0.anInt7433++;
					return;
				}
				if (arg0.anInt7435 <= 0 && local111.anInt583 == 0) {
					Static566.anInt9589 = 0;
					arg0.anInt7433++;
					Static415.anInt7773 = -1;
					return;
				}
			}
		}
		@Pc(213) int local213 = arg0.anInt7347;
		@Pc(216) int local216 = arg0.anInt7351;
		@Pc(232) int local232 = arg0.anIntArray526[arg0.anInt7432 - 1] * 512 + arg0.method6212() * 256;
		@Pc(249) int local249 = arg0.anIntArray527[arg0.anInt7432 - 1] * 512 + arg0.method6212() * 256;
		if (local213 >= local232) {
			if (local232 >= local213) {
				if (local249 > local216) {
					arg0.method6213(8192);
				} else if (local216 > local249) {
					arg0.method6213(0);
				}
			} else if (local216 < local249) {
				arg0.method6213(6144);
			} else if (local249 < local216) {
				arg0.method6213(2048);
			} else {
				arg0.method6213(4096);
			}
		} else if (local249 > local216) {
			arg0.method6213(10240);
		} else if (local249 >= local216) {
			arg0.method6213(12288);
		} else {
			arg0.method6213(14336);
		}
		@Pc(347) byte local347 = arg0.aByteArray84[arg0.anInt7432 - 1];
		if (!arg1 && (local232 - local213 > 1024 || local232 - local213 < -1024 || local249 - local216 > 1024 || local249 - local216 < -1024)) {
			arg0.anInt7347 = local232;
			arg0.anInt7351 = local249;
			arg0.method6204(false, arg0.anInt7364);
			if (arg0.anInt7435 > 0) {
				arg0.anInt7435--;
			}
			Static415.anInt7773 = -1;
			arg0.anInt7432--;
			Static566.anInt9589 = 0;
			return;
		}
		@Pc(410) int local410 = 16;
		@Pc(412) boolean local412 = true;
		if (arg0 instanceof Class11_Sub1_Sub1_Sub1) {
			local412 = ((Class11_Sub1_Sub1_Sub1) arg0).aClass222_1.aBoolean466;
		}
		@Pc(452) int local452;
		if (local412) {
			local452 = arg0.anInt7364 - arg0.aClass134_7.anInt4230;
			if (local452 != 0 && arg0.anInt7407 == -1 && arg0.anInt7397 != 0) {
				local410 = 8;
			}
			if (!arg1 && arg0.anInt7432 > 2) {
				local410 = 24;
			}
			if (!arg1 && arg0.anInt7432 > 3) {
				local410 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt7432 > 1) {
				local410 = 24;
			}
			if (!arg1 && arg0.anInt7432 > 2) {
				local410 = 32;
			}
		}
		if (arg0.anInt7433 > 0 && arg0.anInt7432 > 1) {
			arg0.anInt7433--;
			local410 = 32;
		}
		if (local347 == 2) {
			local410 <<= 0x1;
		} else if (local347 == 0) {
			local410 >>= 0x1;
		}
		Static566.anInt9589 = 0;
		if (local9.anInt5169 != -1) {
			local410 <<= 0x9;
			if (arg0.anInt7432 == 1) {
				local452 = arg0.anInt7434 * arg0.anInt7434;
				@Pc(599) int local599 = (arg0.anInt7347 <= local232 ? local232 - arg0.anInt7347 : arg0.anInt7347 - local232) << 9;
				@Pc(616) int local616 = (local249 >= arg0.anInt7351 ? local249 - arg0.anInt7351 : arg0.anInt7351 - local249) << 9;
				@Pc(627) int local627 = local599 <= local616 ? local616 : local599;
				@Pc(634) int local634 = local627 * local9.anInt5169 * 2;
				if (local634 < local452) {
					arg0.anInt7434 /= 2;
				} else if (local627 < local452 / 2) {
					arg0.anInt7434 -= local9.anInt5169;
					if (arg0.anInt7434 < 0) {
						arg0.anInt7434 = 0;
					}
				} else if (arg0.anInt7434 < local410) {
					arg0.anInt7434 += local9.anInt5169;
					if (local410 < arg0.anInt7434) {
						arg0.anInt7434 = local410;
					}
				}
			} else if (arg0.anInt7434 < local410) {
				arg0.anInt7434 += local9.anInt5169;
				if (arg0.anInt7434 > local410) {
					arg0.anInt7434 = local410;
				}
			} else if (arg0.anInt7434 > 0) {
				arg0.anInt7434 -= local9.anInt5169;
				if (arg0.anInt7434 < 0) {
					arg0.anInt7434 = 0;
				}
			}
			local410 = arg0.anInt7434 >> 9;
			if (local410 < 1) {
				local410 = 1;
			}
		}
		if (local213 == local232 && local249 == local216) {
			Static415.anInt7773 = -1;
		} else {
			if (local232 > local213) {
				Static566.anInt9589 |= 0x4;
				arg0.anInt7347 += local410;
				if (arg0.anInt7347 > local232) {
					arg0.anInt7347 = local232;
				}
			} else if (local213 > local232) {
				Static566.anInt9589 |= 0x8;
				arg0.anInt7347 -= local410;
				if (arg0.anInt7347 < local232) {
					arg0.anInt7347 = local232;
				}
			}
			if (local249 > local216) {
				arg0.anInt7351 += local410;
				Static566.anInt9589 |= 0x1;
				if (arg0.anInt7351 > local249) {
					arg0.anInt7351 = local249;
				}
			} else if (local249 < local216) {
				arg0.anInt7351 -= local410;
				Static566.anInt9589 |= 0x2;
				if (arg0.anInt7351 < local249) {
					arg0.anInt7351 = local249;
				}
			}
			if (local410 < 32) {
				Static415.anInt7773 = local347;
			} else {
				Static415.anInt7773 = 2;
			}
		}
		if (local232 == arg0.anInt7347 && local249 == arg0.anInt7351) {
			arg0.anInt7432--;
			if (arg0.anInt7435 > 0) {
				arg0.anInt7435--;
			}
		}
	}
}
