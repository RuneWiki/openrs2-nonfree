import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Lclient!km;")
	public static Class91 aClass91_66;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "Lclient!km;")
	public static Class91 aClass91_67;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "[I")
	public static int[] anIntArray176 = new int[1000];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method1482(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (!arg0) {
			try {
				Static309.method3982(Static253.aClass175_4.anApplet1, "loggedout");
			} catch (@Pc(55) Throwable local55) {
			}
			try {
				Static214.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static214.anApplet_Sub1_1.getCodeBase(), arg1), "_top");
			} catch (@Pc(67) Exception local67) {
			}
			return;
		}
		if (Static277.aBoolean412 && Static121.aBoolean207) {
			try {
				Static309.method3983("openjs", new Object[] { (new URL(Static214.anApplet_Sub1_1.getCodeBase(), arg1)).toString() }, Static253.aClass175_4.anApplet1);
				return;
			} catch (@Pc(33) Throwable local33) {
			}
		}
		try {
			Static214.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static214.anApplet_Sub1_1.getCodeBase(), arg1), "_blank");
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	public static void method1483() {
		Static244.aClass135_30.method3317();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(3) int local3 = 0; local3 < Static53.aClass82_13.anInt2893; local3++) {
			if (Static53.aClass82_13.method2232(local3)) {
				@Pc(40) int[] local40 = Static20.aClass1_Sub2_Sub21_1.method4288(Static53.aClass82_13.anIntArray262[local3] >> 14 & 0x3FFF, Static53.aClass82_13.anIntArray262[local3] & 0x3FFF, Static53.aClass82_13.anIntArray262[local3] >> 28 & 0x3);
				if (local40 != null) {
					@Pc(52) int local52 = Static254.anInt4979 + Static95.anInt2218 - local40[2] - 1;
					@Pc(58) int local58 = local40[1] - Static264.anInt5177;
					@Pc(75) int local75 = (local58 - arg2) * (arg1 - arg0) / (arg4 - arg2) + arg0;
					@Pc(92) int local92 = (local52 - arg5) * (arg6 - arg3) / (arg7 - arg5) + arg3;
					@Pc(94) int local94 = 16777215;
					@Pc(96) Class156 local96 = null;
					@Pc(101) int local101 = Static53.aClass82_13.method2229(local3);
					if (local101 == 0) {
						if ((double) Static13.aFloat3 == 3.0D) {
							local96 = Static218.aClass156_8;
						}
						if ((double) Static13.aFloat3 == 4.0D) {
							local96 = Static19.aClass156_1;
						}
						if ((double) Static13.aFloat3 == 6.0D) {
							local96 = Static69.aClass156_3;
						}
						if ((double) Static13.aFloat3 >= 8.0D) {
							local96 = Static133.aClass156_6;
						}
					}
					if (local101 == 1) {
						if ((double) Static13.aFloat3 == 3.0D) {
							local96 = Static69.aClass156_3;
						}
						if ((double) Static13.aFloat3 == 4.0D) {
							local96 = Static133.aClass156_6;
						}
						if ((double) Static13.aFloat3 == 6.0D) {
							local96 = Static133.aClass156_7;
						}
						if ((double) Static13.aFloat3 >= 8.0D) {
							local96 = Static109.aClass156_5;
						}
					}
					if (local101 == 2) {
						local94 = 16755200;
						if ((double) Static13.aFloat3 == 3.0D) {
							local96 = Static133.aClass156_7;
						}
						if ((double) Static13.aFloat3 == 4.0D) {
							local96 = Static109.aClass156_5;
						}
						if ((double) Static13.aFloat3 == 6.0D) {
							local96 = Static31.aClass156_2;
						}
						if ((double) Static13.aFloat3 >= 8.0D) {
							local96 = Static92.aClass156_4;
						}
					}
					if (Static53.aClass82_13.anIntArray264[local3] != -1) {
						local94 = Static53.aClass82_13.anIntArray264[local3];
					}
					if (local96 != null) {
						@Pc(235) int local235 = Static39.aClass1_Sub2_Sub1_1.method472(Static53.aClass82_13.aStringArray38[local3], null, Static22.aStringArray10);
						local92 -= (local235 - 1) * local96.method3866() / 2;
						local92 += local96.method3862() / 2;
						for (@Pc(255) int local255 = 0; local255 < local235; local255++) {
							@Pc(266) String local266 = Static22.aStringArray10[local255];
							if (local255 < local235 - 1) {
								local266 = local266.substring(0, local266.length() - 4);
							}
							local96.method3864(local266, local75, local92, local94);
							local92 += local96.method3866();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method1486() {
		if (Static67.method1221() != 2) {
			return;
		}
		@Pc(18) byte local18 = (byte) (Static279.anInt5382 - 4 & 0xFF);
		@Pc(22) int local22 = Static279.anInt5382 % 104;
		@Pc(24) int local24;
		@Pc(31) int local31;
		for (local24 = 0; local24 < 4; local24++) {
			for (local31 = 0; local31 < 104; local31++) {
				Static35.aByteArrayArrayArray12[local24][local22][local31] = local18;
			}
		}
		if (Static140.anInt3034 == 3) {
			return;
		}
		for (local24 = 0; local24 < 2; local24++) {
			Static125.anIntArray258[local24] = -1000000;
			Static232.anIntArray405[local24] = 1000000;
			Static100.anIntArray212[local24] = 0;
			Static14.anIntArray33[local24] = 1000000;
			Static18.anIntArray42[local24] = 0;
		}
		if (Static220.anInt4376 != 1) {
			local24 = Static20.method383(Static239.anInt4738, Static140.anInt3034, Static69.anInt1504);
			if (local24 - Static297.anInt5618 < 800 && (Static260.aByteArrayArrayArray25[Static140.anInt3034][Static69.anInt1504 >> 7][Static239.anInt4738 >> 7] & 0x4) != 0) {
				Static239.method3685(1, Static69.anInt1504 >> 7, Static74.aClass1_Sub26ArrayArrayArray1, Static239.anInt4738 >> 7, false);
			}
			return;
		}
		if ((Static260.aByteArrayArrayArray25[Static140.anInt3034][Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7][Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7] & 0x4) != 0) {
			Static239.method3685(0, Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7, Static74.aClass1_Sub26ArrayArrayArray1, Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7, false);
		}
		if (Static134.anInt2950 >= 310) {
			return;
		}
		local24 = Static69.anInt1504 >> 7;
		@Pc(140) int local140 = Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7;
		@Pc(145) int local145 = Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7;
		@Pc(157) int local157;
		if (local140 <= local24) {
			local157 = local24 - local140;
		} else {
			local157 = local140 - local24;
		}
		local31 = Static239.anInt4738 >> 7;
		@Pc(180) int local180;
		if (local31 < local145) {
			local180 = local145 - local31;
		} else {
			local180 = local31 - local145;
		}
		if (local157 == 0 && local180 == 0 || local157 <= -104 || local157 >= 104 || local180 <= -104 || local180 >= 104) {
			Static3.method136("RC: " + local24 + "," + local31 + " " + local140 + "," + local145 + " " + Static53.anInt5288 + "," + Static83.anInt1875, null);
			return;
		}
		@Pc(255) int local255;
		@Pc(257) int local257;
		if (local157 > local180) {
			local255 = local180 * 65536 / local157;
			local257 = 32768;
			while (local140 != local24) {
				if (local140 > local24) {
					local24++;
				} else if (local140 < local24) {
					local24--;
				}
				if ((Static260.aByteArrayArrayArray25[Static140.anInt3034][local24][local31] & 0x4) != 0) {
					Static239.method3685(1, local24, Static74.aClass1_Sub26ArrayArrayArray1, local31, false);
					break;
				}
				local257 += local255;
				if (local257 >= 65536) {
					local257 -= 65536;
					if (local31 < local145) {
						local31++;
					} else if (local145 < local31) {
						local31--;
					}
					if ((Static260.aByteArrayArrayArray25[Static140.anInt3034][local24][local31] & 0x4) != 0) {
						Static239.method3685(1, local24, Static74.aClass1_Sub26ArrayArrayArray1, local31, false);
						break;
					}
				}
			}
			return;
		}
		local255 = local157 * 65536 / local180;
		local257 = 32768;
		while (local31 != local145) {
			if (local31 < local145) {
				local31++;
			} else if (local31 > local145) {
				local31--;
			}
			if ((Static260.aByteArrayArrayArray25[Static140.anInt3034][local24][local31] & 0x4) != 0) {
				Static239.method3685(1, local24, Static74.aClass1_Sub26ArrayArrayArray1, local31, false);
				break;
			}
			local257 += local255;
			if (local257 >= 65536) {
				local257 -= 65536;
				if (local24 < local140) {
					local24++;
				} else if (local24 > local140) {
					local24--;
				}
				if ((Static260.aByteArrayArrayArray25[Static140.anInt3034][local24][local31] & 0x4) != 0) {
					Static239.method3685(1, local24, Static74.aClass1_Sub26ArrayArrayArray1, local31, false);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ICB)I")
	public static int method1487(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(3) int local3 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local3 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
	public static void method1488() {
		if (Static48.aClass138_1 != null) {
			@Pc(5) Class138 local5 = Static48.aClass138_1;
			synchronized (Static48.aClass138_1) {
				Static48.aClass138_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZIIII)V")
	public static void method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static108.method1987(arg5)) {
			Static97.method1786(-1, arg3, arg0, arg2, Static77.aClass71ArrayArray1[arg5], arg6, arg4, arg1, arg7);
		} else if (arg2 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static272.aBooleanArray50[local15] = true;
			}
		} else {
			Static272.aBooleanArray50[arg2] = true;
		}
	}
}
