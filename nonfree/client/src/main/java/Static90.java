import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Lclient!kr;")
	public static final Class3_Sub27_Sub1 aClass3_Sub27_Sub1_1 = new Class3_Sub27_Sub1(5000);

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
	public static int anInt1953 = 0;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_26 = new Class67("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!tt;I)I")
	public static int method1815(@OriginalArg(0) Class6_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) Class230 local8 = arg0.aClass230_1;
		if (local8.anIntArray627 != null) {
			local8 = local8.method5898(Static127.aClass215_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local8.anInt7049;
		@Pc(35) Class73 local35 = arg0.method7088();
		if (arg0.aBoolean630) {
			local31 = local8.anInt7037;
		} else if (arg0.anInt8534 == local35.anInt2434 || arg0.anInt8534 == local35.anInt2412 || arg0.anInt8534 == local35.anInt2425 || local35.anInt2439 == arg0.anInt8534) {
			local31 = local8.anInt7053;
		} else if (local35.anInt2417 == arg0.anInt8534 || local35.anInt2407 == arg0.anInt8534 || local35.anInt2403 == arg0.anInt8534 || arg0.anInt8534 == local35.anInt2419) {
			local31 = local8.anInt7060;
		}
		return local31;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZLclient!qb;)V")
	public static void method1817(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub1_Sub2 arg1) {
		@Pc(9) Class73 local9 = arg1.method7088();
		if (arg1.anInt8599 == 0) {
			Static463.anInt8327 = 0;
			arg1.anInt8598 = 0;
			Static57.anInt1228 = -1;
			return;
		}
		if (arg1.anInt8592 != -1 && arg1.anInt8575 == 0) {
			@Pc(37) Class122 local37 = Static46.aClass247_1.method6029(arg1.anInt8592);
			if (arg1.anInt8600 > 0 && local37.anInt4153 == 0) {
				arg1.anInt8598++;
				Static57.anInt1228 = -1;
				Static463.anInt8327 = 0;
				return;
			}
			if (arg1.anInt8600 <= 0 && local37.anInt4142 == 0) {
				Static57.anInt1228 = -1;
				arg1.anInt8598++;
				Static463.anInt8327 = 0;
				return;
			}
		}
		@Pc(112) Class122 local112;
		@Pc(98) Class186 local98;
		if (arg1.anInt8565 != -1 && Static223.anInt4829 >= arg1.anInt8537) {
			local98 = Static17.aClass231_2.method5905(arg1.anInt8565);
			if (local98.aBoolean375 && local98.anInt5838 != -1) {
				local112 = Static46.aClass247_1.method6029(local98.anInt5838);
				if (arg1.anInt8600 > 0 && local112.anInt4153 == 0) {
					arg1.anInt8598++;
					Static57.anInt1228 = -1;
					Static463.anInt8327 = 0;
					return;
				}
				if (arg1.anInt8600 <= 0 && local112.anInt4142 == 0) {
					arg1.anInt8598++;
					Static57.anInt1228 = -1;
					Static463.anInt8327 = 0;
					return;
				}
			}
		}
		if (arg1.anInt8565 != -1 && Static223.anInt4829 >= arg1.anInt8537) {
			local98 = Static17.aClass231_2.method5905(arg1.anInt8565);
			if (local98.aBoolean375 && local98.anInt5838 != -1) {
				local112 = Static46.aClass247_1.method6029(local98.anInt5838);
				if (arg1.anInt8600 > 0 && local112.anInt4153 == 0) {
					Static463.anInt8327 = 0;
					arg1.anInt8598++;
					Static57.anInt1228 = -1;
					return;
				}
				if (arg1.anInt8600 <= 0 && local112.anInt4142 == 0) {
					arg1.anInt8598++;
					Static463.anInt8327 = 0;
					Static57.anInt1228 = -1;
					return;
				}
			}
		}
		@Pc(229) int local229 = arg1.anInt8811;
		@Pc(232) int local232 = arg1.anInt8813;
		@Pc(248) int local248 = arg1.anIntArray733[arg1.anInt8599 - 1] * 512 + arg1.method7083() * 256;
		@Pc(264) int local264 = arg1.anIntArray734[arg1.anInt8599 - 1] * 512 + arg1.method7083() * 256;
		if (local229 < local248) {
			if (local264 > local232) {
				arg1.method7085(10240);
			} else if (local232 <= local264) {
				arg1.method7085(12288);
			} else {
				arg1.method7085(14336);
			}
		} else if (local229 > local248) {
			if (local264 > local232) {
				arg1.method7085(6144);
			} else if (local232 <= local264) {
				arg1.method7085(4096);
			} else {
				arg1.method7085(2048);
			}
		} else if (local232 < local264) {
			arg1.method7085(8192);
		} else if (local232 > local264) {
			arg1.method7085(0);
		}
		@Pc(358) byte local358 = arg1.aByteArray99[arg1.anInt8599 - 1];
		if (!arg0 && (local248 - local229 > 1024 || local248 - local229 < -1024 || local264 - local232 > 1024 || local264 - local232 < -1024)) {
			arg1.anInt8813 = local264;
			arg1.anInt8811 = local248;
			arg1.method7079(arg1.anInt8544, false);
			Static57.anInt1228 = -1;
			arg1.anInt8599--;
			if (arg1.anInt8600 > 0) {
				arg1.anInt8600--;
			}
			Static463.anInt8327 = 0;
			return;
		}
		@Pc(419) int local419 = 16;
		@Pc(421) boolean local421 = true;
		if (arg1 instanceof Class6_Sub1_Sub2_Sub2) {
			local421 = ((Class6_Sub1_Sub2_Sub2) arg1).aClass230_1.aBoolean451;
		}
		@Pc(459) int local459;
		if (local421) {
			local459 = arg1.anInt8544 - arg1.aClass173_7.anInt5572;
			if (local459 != 0 && arg1.anInt8563 == -1 && arg1.anInt8594 != 0) {
				local419 = 8;
			}
			if (!arg0 && arg1.anInt8599 > 2) {
				local419 = 24;
			}
			if (!arg0 && arg1.anInt8599 > 3) {
				local419 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt8599 > 1) {
				local419 = 24;
			}
			if (!arg0 && arg1.anInt8599 > 2) {
				local419 = 32;
			}
		}
		if (arg1.anInt8598 > 0 && arg1.anInt8599 > 1) {
			arg1.anInt8598--;
			local419 = 32;
		}
		if (local358 == 2) {
			local419 <<= 0x1;
		} else if (local358 == 0) {
			local419 >>= 0x1;
		}
		if (local9.anInt2429 != -1) {
			local419 <<= 0x9;
			if (arg1.anInt8599 == 1) {
				local459 = arg1.anInt8601 * arg1.anInt8601;
				@Pc(619) int local619 = (local248 >= arg1.anInt8811 ? local248 - arg1.anInt8811 : -local248 + arg1.anInt8811) << 9;
				@Pc(641) int local641 = (local264 < arg1.anInt8813 ? arg1.anInt8813 - local264 : -arg1.anInt8813 + local264) << 9;
				@Pc(652) int local652 = local641 >= local619 ? local641 : local619;
				@Pc(659) int local659 = local652 * local9.anInt2429 * 2;
				if (local659 < local459) {
					arg1.anInt8601 /= 2;
				} else if (local459 / 2 > local652) {
					arg1.anInt8601 -= local9.anInt2429;
					if (arg1.anInt8601 < 0) {
						arg1.anInt8601 = 0;
					}
				} else if (arg1.anInt8601 < local419) {
					arg1.anInt8601 += local9.anInt2429;
					if (local419 < arg1.anInt8601) {
						arg1.anInt8601 = local419;
					}
				}
			} else if (local419 > arg1.anInt8601) {
				arg1.anInt8601 += local9.anInt2429;
				if (local419 < arg1.anInt8601) {
					arg1.anInt8601 = local419;
				}
			} else if (arg1.anInt8601 > 0) {
				arg1.anInt8601 -= local9.anInt2429;
				if (arg1.anInt8601 < 0) {
					arg1.anInt8601 = 0;
				}
			}
			local419 = arg1.anInt8601 >> 9;
			if (local419 < 1) {
				local419 = 1;
			}
		}
		Static463.anInt8327 = 0;
		if (local229 == local248 && local232 == local264) {
			Static57.anInt1228 = -1;
		} else {
			if (local248 > local229) {
				Static463.anInt8327 |= 0x4;
				arg1.anInt8811 += local419;
				if (arg1.anInt8811 > local248) {
					arg1.anInt8811 = local248;
				}
			} else if (local229 > local248) {
				arg1.anInt8811 -= local419;
				Static463.anInt8327 |= 0x8;
				if (arg1.anInt8811 < local248) {
					arg1.anInt8811 = local248;
				}
			}
			if (local232 < local264) {
				Static463.anInt8327 |= 0x1;
				arg1.anInt8813 += local419;
				if (local264 < arg1.anInt8813) {
					arg1.anInt8813 = local264;
				}
			} else if (local232 > local264) {
				arg1.anInt8813 -= local419;
				Static463.anInt8327 |= 0x2;
				if (local264 > arg1.anInt8813) {
					arg1.anInt8813 = local264;
				}
			}
			if (local419 < 32) {
				Static57.anInt1228 = local358;
			} else {
				Static57.anInt1228 = 2;
			}
		}
		if (arg1.anInt8811 == local248 && arg1.anInt8813 == local264) {
			if (arg1.anInt8600 > 0) {
				arg1.anInt8600--;
			}
			arg1.anInt8599--;
		}
	}
}
