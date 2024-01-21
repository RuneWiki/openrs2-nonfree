import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
	public static int anInt2070;

	@OriginalMember(owner = "client!k", name = "ib", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_934 = Static187.method3089("glow1:");

	@OriginalMember(owner = "client!k", name = "V", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_932 = aClass92_934;

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
	public static int anInt2072 = 0;

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_933 = Static187.method3089(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!k", name = "db", descriptor = "Lclient!vd;")
	public static Class92 aClass92_935 = aClass92_934;

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_936 = Static187.method3089("<col=ff9040>");

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "[Lclient!ag;")
	public static final Class7[] aClass7Array1 = new Class7[4];

	@OriginalMember(owner = "client!k", name = "kb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_937 = Static187.method3089("<col=ffff00>");

	@OriginalMember(owner = "client!k", name = "lb", descriptor = "I")
	public static int anInt2076 = -1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
	public static void method1434(@OriginalArg(1) int arg0) {
		Static20.anInt545 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIZIILclient!ag;IZ)V")
	public static void method1435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class7 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (arg9 && (Static146.aByteArrayArrayArray33[0][arg3][arg0] & 0x2) == 0) {
			if ((Static146.aByteArrayArrayArray33[arg8][arg3][arg0] & 0x10) != 0) {
				return;
			}
			if (Static178.method2911(arg3, arg0, arg8) != Static102.anInt2214) {
				return;
			}
		}
		if (Static31.anInt733 > arg8) {
			Static31.anInt733 = arg8;
		}
		@Pc(54) Class1_Sub3_Sub5 local54 = Static154.method2362(arg5);
		@Pc(68) int local68;
		@Pc(65) int local65;
		if (arg2 == 1 || arg2 == 3) {
			local65 = local54.anInt1399;
			local68 = local54.anInt1408;
		} else {
			local68 = local54.anInt1399;
			local65 = local54.anInt1408;
		}
		@Pc(88) int local88;
		@Pc(86) int local86;
		if (arg3 + local68 > 104) {
			local86 = arg3 + 1;
			local88 = arg3;
		} else {
			local86 = (local68 + 1 >> 1) + arg3;
			local88 = arg3 + (local68 >> 1);
		}
		@Pc(114) int local114;
		@Pc(118) int local118;
		if (arg0 + local65 > 104) {
			local114 = arg0;
			local118 = arg0 + 1;
		} else {
			local114 = (local65 >> 1) + arg0;
			local118 = arg0 + (local65 + 1 >> 1);
		}
		@Pc(138) int[][] local138 = Static156.anIntArrayArrayArray6[arg6];
		@Pc(165) int local165 = local138[local86][local114] + local138[local88][local114] + local138[local88][local118] + local138[local86][local118] >> 2;
		@Pc(174) int local174 = (arg3 << 7) + (local68 << 6);
		@Pc(183) int local183 = (arg0 << 7) + (local65 << 6);
		@Pc(200) long local200 = (long) ((arg1 | 0x10000) << 14 | arg0 << 7 | arg3 | arg2 << 20);
		if (local54.anInt1406 == 0) {
			local200 |= Long.MIN_VALUE;
		}
		if (local54.anInt1398 == 1) {
			local200 |= 0x400000L;
		}
		@Pc(219) Object local219 = null;
		if (arg4 && local54.method964()) {
			Static102.method1547(arg0, arg3, arg8, arg2, local54);
		}
		local200 |= (long) arg5 << 32;
		@Pc(283) Class8 local283;
		@Pc(296) Class1_Sub3_Sub25 local296;
		if (arg1 == 22) {
			if (!arg9 || local54.anInt1406 != 0 || local54.anInt1420 == 1 || local54.aBoolean93) {
				if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
					local296 = local54.method966(local165, local174, arg4, 22, local138, local183, arg2);
					local283 = local296.aClass8_11;
				} else {
					local283 = new Class8_Sub6(arg5, 22, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
				}
				Static24.method461(arg8, arg3, arg0, local165, local283, local200, local54.aBoolean91);
				if (local54.anInt1420 == 1 && arg7 != null) {
					arg7.method136(arg3, arg0);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
				local296 = local54.method966(local165, local174, arg4, 10, local138, local183, arg2);
				local283 = local296.aClass8_11;
			} else {
				local283 = new Class8_Sub6(arg5, 10, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
			}
			if (local283 != null) {
				@Pc(388) boolean local388 = Static210.method3416(arg8, arg3, arg0, local165, local68, local65, local283, arg1 == 11 ? 256 : 0, local200);
				if (local54.aBoolean90 && local388 && arg4) {
					@Pc(397) int local397 = 15;
					if (local283 instanceof Class8_Sub5) {
						local397 = ((Class8_Sub5) local283).method2041() / 4;
						if (local397 > 30) {
							local397 = 30;
						}
					}
					for (@Pc(415) int local415 = 0; local415 <= local68; local415++) {
						for (@Pc(419) int local419 = 0; local419 <= local65; local419++) {
							if (Static34.aByteArrayArrayArray8[arg8][arg3 + local415][arg0 + local419] < local397) {
								Static34.aByteArrayArrayArray8[arg8][local415 + arg3][arg0 + local419] = (byte) local397;
							}
						}
					}
				}
			}
			if (local54.anInt1420 != 0 && arg7 != null) {
				arg7.method130(local54.aBoolean87, arg0, local68, arg3, local65);
			}
		} else if (arg1 >= 12) {
			if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
				local296 = local54.method966(local165, local174, arg4, arg1, local138, local183, arg2);
				local283 = local296.aClass8_11;
			} else {
				local283 = new Class8_Sub6(arg5, arg1, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
			}
			Static210.method3416(arg8, arg3, arg0, local165, 1, 1, local283, 0, local200);
			if (arg4 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg8 > 0) {
				Static12.anIntArrayArrayArray1[arg8][arg3][arg0] |= 0x924;
			}
			if (local54.anInt1420 != 0 && arg7 != null) {
				arg7.method130(local54.aBoolean87, arg0, local68, arg3, local65);
			}
		} else if (arg1 == 0) {
			if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
				local296 = local54.method966(local165, local174, arg4, 0, local138, local183, arg2);
				local283 = local296.aClass8_11;
			} else {
				local283 = new Class8_Sub6(arg5, 0, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
			}
			Static24.method464(arg8, arg3, arg0, local165, local283, null, Static200.anIntArray356[arg2], 0, local200);
			if (arg4) {
				if (arg2 == 0) {
					if (local54.aBoolean90) {
						Static34.aByteArrayArrayArray8[arg8][arg3][arg0] = 50;
						Static34.aByteArrayArrayArray8[arg8][arg3][arg0 + 1] = 50;
					}
					if (local54.aBoolean88) {
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local54.aBoolean90) {
						Static34.aByteArrayArrayArray8[arg8][arg3][arg0 + 1] = 50;
						Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0 + 1] = 50;
					}
					if (local54.aBoolean88) {
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local54.aBoolean90) {
						Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0] = 50;
						Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0 + 1] = 50;
					}
					if (local54.aBoolean88) {
						Static12.anIntArrayArrayArray1[arg8][arg3 + 1][arg0] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local54.aBoolean90) {
						Static34.aByteArrayArrayArray8[arg8][arg3][arg0] = 50;
						Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0] = 50;
					}
					if (local54.aBoolean88) {
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0] |= 0x492;
					}
				}
			}
			if (local54.anInt1420 != 0 && arg7 != null) {
				arg7.method140(arg1, arg0, arg3, arg2, local54.aBoolean87);
			}
			if (local54.anInt1397 != 16) {
				Static91.method1351(arg8, arg3, arg0, local54.anInt1397);
			}
		} else if (arg1 == 1) {
			if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
				local296 = local54.method966(local165, local174, arg4, 1, local138, local183, arg2);
				local283 = local296.aClass8_11;
			} else {
				local283 = new Class8_Sub6(arg5, 1, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
			}
			Static24.method464(arg8, arg3, arg0, local165, local283, null, Static172.anIntArray314[arg2], 0, local200);
			if (local54.aBoolean90 && arg4) {
				if (arg2 == 0) {
					Static34.aByteArrayArrayArray8[arg8][arg3][arg0 + 1] = 50;
				} else if (arg2 == 1) {
					Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0 + 1] = 50;
				} else if (arg2 == 2) {
					Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0] = 50;
				} else if (arg2 == 3) {
					Static34.aByteArrayArrayArray8[arg8][arg3][arg0] = 50;
				}
			}
			if (local54.anInt1420 != 0 && arg7 != null) {
				arg7.method140(arg1, arg0, arg3, arg2, local54.aBoolean87);
			}
		} else {
			@Pc(1008) int local1008;
			if (arg1 == 2) {
				local1008 = arg2 + 1 & 0x3;
				@Pc(1046) Class8 local1046;
				@Pc(1032) Class8 local1032;
				if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
					@Pc(1029) Class1_Sub3_Sub25 local1029 = local54.method966(local165, local174, arg4, 2, local138, local183, arg2 + 4);
					local1032 = local1029.aClass8_11;
					@Pc(1043) Class1_Sub3_Sub25 local1043 = local54.method966(local165, local174, arg4, 2, local138, local183, local1008);
					local1046 = local1043.aClass8_11;
				} else {
					local1032 = new Class8_Sub6(arg5, 2, arg2 + 4, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
					local1046 = new Class8_Sub6(arg5, 2, local1008, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
				}
				Static24.method464(arg8, arg3, arg0, local165, local1032, local1046, Static200.anIntArray356[arg2], Static200.anIntArray356[local1008], local200);
				if (local54.aBoolean88 && arg4) {
					if (arg2 == 0) {
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0] |= 0x249;
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0 + 1] |= 0x492;
					} else if (arg2 == 1) {
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0 + 1] |= 0x492;
						Static12.anIntArrayArrayArray1[arg8][arg3 + 1][arg0] |= 0x249;
					} else if (arg2 == 2) {
						Static12.anIntArrayArrayArray1[arg8][arg3 + 1][arg0] |= 0x249;
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0] |= 0x492;
					} else if (arg2 == 3) {
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0] |= 0x492;
						Static12.anIntArrayArrayArray1[arg8][arg3][arg0] |= 0x249;
					}
				}
				if (local54.anInt1420 != 0 && arg7 != null) {
					arg7.method140(arg1, arg0, arg3, arg2, local54.aBoolean87);
				}
				if (local54.anInt1397 != 16) {
					Static91.method1351(arg8, arg3, arg0, local54.anInt1397);
				}
			} else if (arg1 == 3) {
				if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
					local296 = local54.method966(local165, local174, arg4, 3, local138, local183, arg2);
					local283 = local296.aClass8_11;
				} else {
					local283 = new Class8_Sub6(arg5, 3, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
				}
				Static24.method464(arg8, arg3, arg0, local165, local283, null, Static172.anIntArray314[arg2], 0, local200);
				if (local54.aBoolean90 && arg4) {
					if (arg2 == 0) {
						Static34.aByteArrayArrayArray8[arg8][arg3][arg0 + 1] = 50;
					} else if (arg2 == 1) {
						Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0 + 1] = 50;
					} else if (arg2 == 2) {
						Static34.aByteArrayArrayArray8[arg8][arg3 + 1][arg0] = 50;
					} else if (arg2 == 3) {
						Static34.aByteArrayArrayArray8[arg8][arg3][arg0] = 50;
					}
				}
				if (local54.anInt1420 != 0 && arg7 != null) {
					arg7.method140(arg1, arg0, arg3, arg2, local54.aBoolean87);
				}
			} else if (arg1 == 9) {
				if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
					local296 = local54.method966(local165, local174, arg4, arg1, local138, local183, arg2);
					local283 = local296.aClass8_11;
				} else {
					local283 = new Class8_Sub6(arg5, arg1, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
				}
				Static210.method3416(arg8, arg3, arg0, local165, 1, 1, local283, 0, local200);
				if (local54.anInt1420 != 0 && arg7 != null) {
					arg7.method130(local54.aBoolean87, arg0, local68, arg3, local65);
				}
				if (local54.anInt1397 != 16) {
					Static91.method1351(arg8, arg3, arg0, local54.anInt1397);
				}
			} else if (arg1 == 4) {
				if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
					local296 = local54.method966(local165, local174, arg4, 4, local138, local183, arg2);
					local283 = local296.aClass8_11;
				} else {
					local283 = new Class8_Sub6(arg5, 4, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
				}
				Static45.method814(arg8, arg3, arg0, local165, local283, null, Static200.anIntArray356[arg2], 0, 0, 0, local200, (Class63) local219);
			} else {
				@Pc(1580) long local1580;
				@Pc(1617) Class8 local1617;
				@Pc(1614) Class1_Sub3_Sub25 local1614;
				if (arg1 == 5) {
					local1008 = 16;
					local1580 = Static133.method1972(arg8, arg3, arg0);
					if (local1580 != 0L) {
						local1008 = Static154.method2362((int) (local1580 >>> 32) & Integer.MAX_VALUE).anInt1397;
					}
					if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
						local1614 = local54.method966(local165, local174, arg4, 4, local138, local183, arg2);
						local1617 = local1614.aClass8_11;
					} else {
						local1617 = new Class8_Sub6(arg5, 4, arg2, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
					}
					Static45.method814(arg8, arg3, arg0, local165, local1617, null, Static200.anIntArray356[arg2], 0, Static10.anIntArray20[arg2] * local1008, Static154.anIntArray284[arg2] * local1008, local200, (Class63) local219);
				} else if (arg1 == 6) {
					local1008 = 8;
					local1580 = Static133.method1972(arg8, arg3, arg0);
					if (local1580 != 0L) {
						local1008 = Static154.method2362((int) (local1580 >>> 32) & Integer.MAX_VALUE).anInt1397 / 2;
					}
					if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
						local1614 = local54.method966(local165, local174, arg4, 4, local138, local183, arg2 + 4);
						local1617 = local1614.aClass8_11;
					} else {
						local1617 = new Class8_Sub6(arg5, 4, arg2 + 4, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
					}
					Static45.method814(arg8, arg3, arg0, local165, local1617, null, 256, arg2, local1008 * Static203.anIntArray361[arg2], Static37.anIntArray77[arg2] * local1008, local200, (Class63) local219);
				} else if (arg1 == 7) {
					@Pc(1761) int local1761 = arg2 + 2 & 0x3;
					if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
						@Pc(1782) Class1_Sub3_Sub25 local1782 = local54.method966(local165, local174, arg4, 4, local138, local183, local1761 + 4);
						local283 = local1782.aClass8_11;
					} else {
						local283 = new Class8_Sub6(arg5, 4, local1761 + 4, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
					}
					Static45.method814(arg8, arg3, arg0, local165, local283, null, 256, local1761, 0, 0, local200, (Class63) local219);
				} else if (arg1 == 8) {
					local1008 = 8;
					local1580 = Static133.method1972(arg8, arg3, arg0);
					if (local1580 != 0L) {
						local1008 = Static154.method2362(Integer.MAX_VALUE & (int) (local1580 >>> 32)).anInt1397 / 2;
					}
					@Pc(1850) int local1850 = arg2 + 2 & 0x3;
					@Pc(1889) Class8 local1889;
					if (local54.anInt1393 == -1 && local54.anIntArray116 == null) {
						@Pc(1870) Class1_Sub3_Sub25 local1870 = local54.method966(local165, local174, arg4, 4, local138, local183, arg2 + 4);
						local1617 = local1870.aClass8_11;
						@Pc(1886) Class1_Sub3_Sub25 local1886 = local54.method966(local165, local174, arg4, 4, local138, local183, local1850 + 4);
						local1889 = local1886.aClass8_11;
					} else {
						local1617 = new Class8_Sub6(arg5, 4, arg2 + 4, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
						local1889 = new Class8_Sub6(arg5, 4, local1850 + 4, arg6, arg3, arg0, local54.anInt1393, local54.aBoolean89, null);
					}
					Static45.method814(arg8, arg3, arg0, local165, local1617, local1889, 256, arg2, Static203.anIntArray361[arg2] * local1008, Static37.anIntArray77[arg2] * local1008, local200, (Class63) local219);
				}
			}
		}
	}
}
