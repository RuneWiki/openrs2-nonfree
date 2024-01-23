import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	public static int anInt2014;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "Lclient!ji;")
	public static Class2_Sub3_Sub16 aClass2_Sub3_Sub16_1;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_17;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public static int anInt2013 = 0;

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "Lclient!qe;")
	private static Class78 aClass78_446 = Static199.method3560("Loading fonts )2 ");

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "Lclient!qe;")
	public static Class78 aClass78_445 = aClass78_446;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	public static int anInt2015 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class1 local3 = new Class1();
		local3.anInt4 = arg2 / 128;
		local3.anInt20 = arg3 / 128;
		local3.anInt8 = arg4 / 128;
		local3.anInt16 = arg5 / 128;
		local3.anInt18 = arg1;
		local3.anInt12 = arg2;
		local3.anInt5 = arg3;
		local3.anInt9 = arg4;
		local3.anInt1 = arg5;
		local3.anInt13 = arg6;
		local3.anInt19 = arg7;
		Static74.aClass1ArrayArray1[arg0][Static74.anIntArray271[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZBIZIIILclient!tb;II)V")
	public static void method1591(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class90 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg1 && !Static48.method633() && (Static133.aByteArrayArrayArray10[0][arg2][arg0] & 0x2) == 0) {
			if ((Static133.aByteArrayArrayArray10[arg7][arg2][arg0] & 0x10) != 0) {
				return;
			}
			if (Static220.method3826(arg0, arg7, arg2) != Static150.anInt3435) {
				return;
			}
		}
		if (arg7 < Static145.anInt3289) {
			Static145.anInt3289 = arg7;
		}
		@Pc(53) Class2_Sub3_Sub17 local53 = Static121.method3984(arg4);
		@Pc(65) int local65;
		@Pc(62) int local62;
		if (arg5 == 1 || arg5 == 3) {
			local65 = local53.anInt2387;
			local62 = local53.anInt2394;
		} else {
			local62 = local53.anInt2387;
			local65 = local53.anInt2394;
		}
		@Pc(88) int local88;
		@Pc(86) int local86;
		if (local65 + arg2 > 104) {
			local86 = arg2 + 1;
			local88 = arg2;
		} else {
			local86 = arg2 + (local65 + 1 >> 1);
			local88 = (local65 >> 1) + arg2;
		}
		@Pc(116) int local116;
		@Pc(124) int local124;
		if (local62 + arg0 <= 104) {
			local116 = arg0 + (local62 >> 1);
			local124 = (local62 + 1 >> 1) + arg0;
		} else {
			local124 = arg0 + 1;
			local116 = arg0;
		}
		@Pc(135) int[][] local135 = Static144.anIntArrayArrayArray7[arg3];
		@Pc(144) int local144 = (arg2 << 7) + (local65 << 6);
		@Pc(170) int local170 = local135[local88][local124] + local135[local86][local116] + local135[local88][local116] + local135[local86][local124] >> 2;
		@Pc(179) int local179 = (arg0 << 7) + (local62 << 6);
		@Pc(181) int[][] local181 = null;
		@Pc(198) long local198 = (long) (arg8 << 14 | arg0 << 7 | arg2 | arg5 << 20 | 0x40000000);
		if (local53.anInt2380 == 0) {
			local198 |= Long.MIN_VALUE;
		}
		if (arg3 < 3) {
			local181 = Static144.anIntArrayArrayArray7[arg3 + 1];
		}
		if (local53.anInt2375 == 1) {
			local198 |= 0x400000L;
		}
		if (local53.aBoolean91) {
			local198 |= 0xFFFFFFFF80000000L;
		}
		local198 |= (long) arg4 << 32;
		if (local53.method1878()) {
			Static162.method2923(arg2, null, local53, arg7, null, arg0, arg5);
		}
		@Pc(274) boolean local274 = local53.aBoolean100 & true;
		@Pc(317) Class5 local317;
		@Pc(332) Class2_Sub3_Sub20 local332;
		if (arg8 == 22) {
			if (Static112.aBoolean105 || local53.anInt2380 != 0 || local53.anInt2373 == 1 || local53.aBoolean90) {
				if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
					local332 = local53.method1874(local274, arg1, 22, null, local170, local181, local179, local135, local144, arg5);
					local317 = local332.aClass5_4;
				} else {
					local317 = new Class5_Sub1(arg4, 22, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
				}
				Static7.method150(arg7, arg2, arg0, local170, local317, local198, local53.aBoolean98);
				if (local53.anInt2373 == 1 && arg6 != null) {
					arg6.method3518(arg0, arg2);
				}
			}
		} else if (arg8 == 10 || arg8 == 11) {
			if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
				local332 = local53.method1874(local274, arg1, 10, null, local170, local181, local179, local135, local144, arg8 == 11 ? arg5 + 4 : arg5);
				local317 = local332.aClass5_4;
			} else {
				local317 = new Class5_Sub1(arg4, 10, arg8 == 11 ? arg5 + 4 : arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
			}
			if (local317 != null) {
				@Pc(440) boolean local440 = Static142.method2534(arg7, arg2, arg0, local170, local65, local62, local317, local198);
				if (local53.aBoolean92 && local440 && arg1) {
					@Pc(449) int local449 = 15;
					if (local317 instanceof Class5_Sub3) {
						local449 = ((Class5_Sub3) local317).method1430() / 4;
						if (local449 > 30) {
							local449 = 30;
						}
					}
					for (@Pc(467) int local467 = 0; local467 <= local65; local467++) {
						for (@Pc(470) int local470 = 0; local470 <= local62; local470++) {
							if (Static220.aByteArrayArrayArray15[arg7][local467 + arg2][local470 + arg0] < local449) {
								Static220.aByteArrayArrayArray15[arg7][local467 + arg2][local470 + arg0] = (byte) local449;
							}
						}
					}
				}
			}
			if (local53.anInt2373 != 0 && arg6 != null) {
				arg6.method3516(arg2, arg0, local53.aBoolean94, local62, local65);
			}
		} else if (arg8 >= 12) {
			if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
				local332 = local53.method1874(local274, arg1, arg8, null, local170, local181, local179, local135, local144, arg5);
				local317 = local332.aClass5_4;
			} else {
				local317 = new Class5_Sub1(arg4, arg8, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
			}
			Static142.method2534(arg7, arg2, arg0, local170, 1, 1, local317, local198);
			if (arg1 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg7 > 0) {
				Static224.anIntArrayArrayArray14[arg7][arg2][arg0] |= 0x924;
			}
			if (local53.anInt2373 != 0 && arg6 != null) {
				arg6.method3516(arg2, arg0, local53.aBoolean94, local62, local65);
			}
		} else if (arg8 == 0) {
			if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
				local332 = local53.method1874(local274, arg1, 0, null, local170, local181, local179, local135, local144, arg5);
				local317 = local332.aClass5_4;
			} else {
				local317 = new Class5_Sub1(arg4, 0, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
			}
			Static94.method1644(arg7, arg2, arg0, local170, local317, null, Static205.anIntArray123[arg5], 0, local198);
			if (arg1) {
				if (arg5 == 0) {
					if (local53.aBoolean92) {
						Static220.aByteArrayArrayArray15[arg7][arg2][arg0] = 50;
						Static220.aByteArrayArrayArray15[arg7][arg2][arg0 + 1] = 50;
					}
					if (local53.aBoolean101) {
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local53.aBoolean92) {
						Static220.aByteArrayArrayArray15[arg7][arg2][arg0 + 1] = 50;
						Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0 + 1] = 50;
					}
					if (local53.aBoolean101) {
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local53.aBoolean92) {
						Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0] = 50;
						Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0 + 1] = 50;
					}
					if (local53.aBoolean101) {
						Static224.anIntArrayArrayArray14[arg7][arg2 + 1][arg0] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local53.aBoolean92) {
						Static220.aByteArrayArrayArray15[arg7][arg2][arg0] = 50;
						Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0] = 50;
					}
					if (local53.aBoolean101) {
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0] |= 0x492;
					}
				}
			}
			if (local53.anInt2373 != 0 && arg6 != null) {
				arg6.method3527(arg0, arg5, arg8, local53.aBoolean94, arg2);
			}
			if (local53.anInt2367 != 16) {
				Static94.method1643(arg7, arg2, arg0, local53.anInt2367);
			}
		} else if (arg8 == 1) {
			if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
				local332 = local53.method1874(local274, arg1, 1, null, local170, local181, local179, local135, local144, arg5);
				local317 = local332.aClass5_4;
			} else {
				local317 = new Class5_Sub1(arg4, 1, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
			}
			Static94.method1644(arg7, arg2, arg0, local170, local317, null, Static168.anIntArray753[arg5], 0, local198);
			if (local53.aBoolean92 && arg1) {
				if (arg5 == 0) {
					Static220.aByteArrayArrayArray15[arg7][arg2][arg0 + 1] = 50;
				} else if (arg5 == 1) {
					Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0 + 1] = 50;
				} else if (arg5 == 2) {
					Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0] = 50;
				} else if (arg5 == 3) {
					Static220.aByteArrayArrayArray15[arg7][arg2][arg0] = 50;
				}
			}
			if (local53.anInt2373 != 0 && arg6 != null) {
				arg6.method3527(arg0, arg5, arg8, local53.aBoolean94, arg2);
			}
		} else {
			@Pc(1050) int local1050;
			if (arg8 == 2) {
				local1050 = arg5 + 1 & 0x3;
				@Pc(1095) Class5 local1095;
				@Pc(1078) Class5 local1078;
				if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
					@Pc(1075) Class2_Sub3_Sub20 local1075 = local53.method1874(local274, arg1, 2, null, local170, local181, local179, local135, local144, arg5 + 4);
					local1078 = local1075.aClass5_4;
					@Pc(1092) Class2_Sub3_Sub20 local1092 = local53.method1874(local274, arg1, 2, null, local170, local181, local179, local135, local144, local1050);
					local1095 = local1092.aClass5_4;
				} else {
					local1078 = new Class5_Sub1(arg4, 2, arg5 + 4, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
					local1095 = new Class5_Sub1(arg4, 2, local1050, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
				}
				Static94.method1644(arg7, arg2, arg0, local170, local1078, local1095, Static205.anIntArray123[arg5], Static205.anIntArray123[local1050], local198);
				if (local53.aBoolean101 && arg1) {
					if (arg5 == 0) {
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0] |= 0x249;
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0 + 1] |= 0x492;
					} else if (arg5 == 1) {
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0 + 1] |= 0x492;
						Static224.anIntArrayArrayArray14[arg7][arg2 + 1][arg0] |= 0x249;
					} else if (arg5 == 2) {
						Static224.anIntArrayArrayArray14[arg7][arg2 + 1][arg0] |= 0x249;
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0] |= 0x492;
					} else if (arg5 == 3) {
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0] |= 0x492;
						Static224.anIntArrayArrayArray14[arg7][arg2][arg0] |= 0x249;
					}
				}
				if (local53.anInt2373 != 0 && arg6 != null) {
					arg6.method3527(arg0, arg5, arg8, local53.aBoolean94, arg2);
				}
				if (local53.anInt2367 != 16) {
					Static94.method1643(arg7, arg2, arg0, local53.anInt2367);
				}
			} else if (arg8 == 3) {
				if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
					local332 = local53.method1874(local274, arg1, 3, null, local170, local181, local179, local135, local144, arg5);
					local317 = local332.aClass5_4;
				} else {
					local317 = new Class5_Sub1(arg4, 3, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
				}
				Static94.method1644(arg7, arg2, arg0, local170, local317, null, Static168.anIntArray753[arg5], 0, local198);
				if (local53.aBoolean92 && arg1) {
					if (arg5 == 0) {
						Static220.aByteArrayArrayArray15[arg7][arg2][arg0 + 1] = 50;
					} else if (arg5 == 1) {
						Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0 + 1] = 50;
					} else if (arg5 == 2) {
						Static220.aByteArrayArrayArray15[arg7][arg2 + 1][arg0] = 50;
					} else if (arg5 == 3) {
						Static220.aByteArrayArrayArray15[arg7][arg2][arg0] = 50;
					}
				}
				if (local53.anInt2373 != 0 && arg6 != null) {
					arg6.method3527(arg0, arg5, arg8, local53.aBoolean94, arg2);
				}
			} else if (arg8 == 9) {
				if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
					local332 = local53.method1874(local274, arg1, arg8, null, local170, local181, local179, local135, local144, arg5);
					local317 = local332.aClass5_4;
				} else {
					local317 = new Class5_Sub1(arg4, arg8, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
				}
				Static142.method2534(arg7, arg2, arg0, local170, 1, 1, local317, local198);
				if (local53.anInt2373 != 0 && arg6 != null) {
					arg6.method3516(arg2, arg0, local53.aBoolean94, local62, local65);
				}
				if (local53.anInt2367 != 16) {
					Static94.method1643(arg7, arg2, arg0, local53.anInt2367);
				}
			} else if (arg8 == 4) {
				if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
					local332 = local53.method1874(local274, arg1, 4, null, local170, local181, local179, local135, local144, arg5);
					local317 = local332.aClass5_4;
				} else {
					local317 = new Class5_Sub1(arg4, 4, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
				}
				Static183.method3362(arg7, arg2, arg0, local170, local317, null, Static205.anIntArray123[arg5], 0, 0, 0, local198);
			} else {
				@Pc(1627) long local1627;
				@Pc(1670) Class5 local1670;
				@Pc(1667) Class2_Sub3_Sub20 local1667;
				if (arg8 == 5) {
					local1627 = Static105.method1814(arg7, arg2, arg0);
					local1050 = 16;
					if (local1627 != 0L) {
						local1050 = Static121.method3984(Integer.MAX_VALUE & (int) (local1627 >>> 32)).anInt2367;
					}
					if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
						local1667 = local53.method1874(local274, arg1, 4, null, local170, local181, local179, local135, local144, arg5);
						local1670 = local1667.aClass5_4;
					} else {
						local1670 = new Class5_Sub1(arg4, 4, arg5, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
					}
					Static183.method3362(arg7, arg2, arg0, local170, local1670, null, Static205.anIntArray123[arg5], 0, Static206.anIntArray734[arg5] * local1050, Static174.anIntArray658[arg5] * local1050, local198);
				} else if (arg8 == 6) {
					local1050 = 8;
					local1627 = Static105.method1814(arg7, arg2, arg0);
					if (local1627 != 0L) {
						local1050 = Static121.method3984((int) (local1627 >>> 32) & Integer.MAX_VALUE).anInt2367 / 2;
					}
					if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
						local1667 = local53.method1874(local274, arg1, 4, null, local170, local181, local179, local135, local144, arg5 + 4);
						local1670 = local1667.aClass5_4;
					} else {
						local1670 = new Class5_Sub1(arg4, 4, arg5 + 4, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
					}
					Static183.method3362(arg7, arg2, arg0, local170, local1670, null, 256, arg5, local1050 * Static8.anIntArray32[arg5], Static12.anIntArray44[arg5] * local1050, local198);
				} else if (arg8 == 7) {
					@Pc(1812) int local1812 = arg5 + 2 & 0x3;
					if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
						@Pc(1835) Class2_Sub3_Sub20 local1835 = local53.method1874(local274, arg1, 4, null, local170, local181, local179, local135, local144, local1812 + 4);
						local317 = local1835.aClass5_4;
					} else {
						local317 = new Class5_Sub1(arg4, 4, local1812 + 4, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
					}
					Static183.method3362(arg7, arg2, arg0, local170, local317, null, 256, local1812, 0, 0, local198);
				} else if (arg8 == 8) {
					local1050 = 8;
					local1627 = Static105.method1814(arg7, arg2, arg0);
					@Pc(1885) int local1885 = arg5 + 2 & 0x3;
					if (local1627 != 0L) {
						local1050 = Static121.method3984((int) (local1627 >>> 32) & Integer.MAX_VALUE).anInt2367 / 2;
					}
					@Pc(1945) Class5 local1945;
					if (local53.anInt2397 == -1 && local53.anIntArray413 == null) {
						@Pc(1962) Class2_Sub3_Sub20 local1962 = local53.method1874(local274, arg1, 4, null, local170, local181, local179, local135, local144, arg5 + 4);
						local1670 = local1962.aClass5_4;
						@Pc(1981) Class2_Sub3_Sub20 local1981 = local53.method1874(local274, arg1, 4, null, local170, local181, local179, local135, local144, local1885 + 4);
						local1945 = local1981.aClass5_4;
					} else {
						local1670 = new Class5_Sub1(arg4, 4, arg5 + 4, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
						local1945 = new Class5_Sub1(arg4, 4, local1885 + 4, arg3, arg2, arg0, local53.anInt2397, local53.aBoolean93, null);
					}
					Static183.method3362(arg7, arg2, arg0, local170, local1670, local1945, 256, arg5, Static8.anIntArray32[arg5] * local1050, local1050 * Static12.anIntArray44[arg5], local198);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!qe;IZ)V")
	public static void method1592(@OriginalArg(0) Class78 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(18) int local18 = Static211.aClass2_Sub3_Sub7_3.method887(arg0, 250);
		@Pc(25) int local25 = Static211.aClass2_Sub3_Sub7_3.method893(arg0, 250) * 13;
		Static217.method3761(6, 6, local18 + 4 + 4, local25 + 4 + 4, 0);
		Static217.method3751(6, 6, local18 + 4 + 4, local25 + 4 + 4, 16777215);
		Static211.aClass2_Sub3_Sub7_3.method905(arg0, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static169.method3108(6, 6, local18 + 4 + 4, local25 + 4 + 4);
		if (!arg1) {
			Static158.method2847(local25, 10, local18, 10);
			return;
		}
		try {
			@Pc(114) Graphics local114 = Static79.aCanvas2.getGraphics();
			Static160.aClass10_1.method2687(local114);
		} catch (@Pc(122) Exception local122) {
			Static79.aCanvas2.repaint();
		}
	}
}
