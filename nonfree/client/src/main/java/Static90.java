import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gj", name = "xb", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString148 = "scroll:";

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString149 = "glow2:";

	@OriginalMember(owner = "client!gj", name = "Db", descriptor = "[Z")
	public static boolean[] aBooleanArray49 = new boolean[100];

	@OriginalMember(owner = "client!gj", name = "Sb", descriptor = "Ljava/lang/String;")
	public static String aString151 = null;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
	public static void method3642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12;
		@Pc(38) int local38;
		if (Static197.anInt3990 == 0) {
			@Pc(6) int local6 = Static187.anInt3768;
			@Pc(8) int local8 = Static25.anInt487;
			@Pc(10) int local10 = Static38.anInt768;
			local12 = Static56.anInt1120;
			@Pc(26) int local26 = local8 + (local6 - local8) * (arg5 - arg2) / arg3;
			local38 = local12 + (arg0 - arg1) * (local10 - local12) / arg4;
			if (Static91.aBoolean136 && (Static234.anInt4733 & 0x40) != 0) {
				@Pc(52) Class146 local52 = Static300.method4492(Static81.anInt1490, Static10.anInt180);
				if (local52 == null) {
					Static87.method1300();
				} else {
					Static59.method1004((short) 12, Static232.aString115, Static49.anInt937, local26, " ->", local38, 0L);
				}
			} else {
				if (Static35.anInt641 == 1) {
					Static59.method1004((short) 13, Static128.aString90, -1, local26, "", local38, 0L);
				}
				Static59.method1004((short) 14, Static31.aString18, -1, local26, "", local38, 0L);
			}
		}
		@Pc(106) long local106 = -1L;
		for (local12 = 0; local12 < Static57.anInt1123; local12++) {
			@Pc(115) long local115 = Static17.aLongArray11[local12];
			local38 = (int) local115 & 0x7F;
			@Pc(127) int local127 = (int) (local115 >>> 32) & Integer.MAX_VALUE;
			@Pc(134) int local134 = (int) local115 >> 7 & 0x7F;
			@Pc(141) int local141 = (int) local115 >> 29 & 0x3;
			if (local115 != local106) {
				local106 = local115;
				@Pc(227) int local227;
				@Pc(243) int local243;
				if (local141 == 2 && Static21.method421(Static295.anInt5586, local38, local134, local115)) {
					@Pc(164) Class43 local164 = Static189.method3080(local127);
					if (local164.anIntArray97 != null) {
						local164 = local164.method1009();
					}
					if (local164 == null) {
						continue;
					}
					if (Static197.anInt3990 == 1) {
						Static59.method1004((short) 51, Static249.aString163, Static108.anInt2142, local38, aString151 + " -> <col=00ffff>" + local164.aString35, local134, local115);
					} else if (Static91.aBoolean136) {
						@Pc(348) Class1_Sub1_Sub15 local348 = Static213.anInt4211 == -1 ? null : Static217.method3426(Static213.anInt4211);
						if ((Static234.anInt4733 & 0x4) != 0 && (local348 == null || local164.method1006(Static213.anInt4211, local348.anInt3964) != local348.anInt3964)) {
							Static59.method1004((short) 29, Static232.aString115, Static49.anInt937, local38, Static86.aString53 + " -> <col=00ffff>" + local164.aString35, local134, local115);
						}
					} else {
						@Pc(215) String[] local215 = local164.aStringArray9;
						if (Static118.aBoolean180) {
							local215 = Static111.method1804(local215);
						}
						if (local215 != null) {
							for (local227 = 4; local227 >= 0; local227--) {
								if (local215[local227] != null) {
									local243 = -1;
									@Pc(245) short local245 = 0;
									if (local227 == 0) {
										local245 = 57;
									}
									if (local227 == local164.anInt1172) {
										local243 = local164.anInt1158;
									}
									if (local164.anInt1165 == local227) {
										local243 = local164.anInt1157;
									}
									if (local227 == 1) {
										local245 = 3;
									}
									if (local227 == 2) {
										local245 = 31;
									}
									if (local227 == 3) {
										local245 = 15;
									}
									if (local227 == 4) {
										local245 = 1003;
									}
									Static59.method1004(local245, local215[local227], local243, local38, "<col=00ffff>" + local164.aString35, local134, local115);
								}
							}
						}
						Static59.method1004((short) 1006, Static300.aString191, Static243.anInt5650, local38, "<col=00ffff>" + local164.aString35, local134, (long) local164.anInt1198);
					}
				}
				@Pc(480) Class22_Sub3_Sub1 local480;
				@Pc(504) int local504;
				@Pc(513) int local513;
				@Pc(519) int local519;
				@Pc(457) int local457;
				@Pc(463) int local463;
				@Pc(562) Class22_Sub3_Sub2 local562;
				if (local141 == 1) {
					@Pc(396) Class22_Sub3_Sub1 local396 = Static265.aClass22_Sub3_Sub1Array1[local127];
					if ((local396.aClass112_1.anInt3495 & 0x1) == 0 && (local396.anInt4601 & 0x7F) == 0 && (local396.anInt4623 & 0x7F) == 0 || (local396.aClass112_1.anInt3495 & 0x1) == 1 && (local396.anInt4601 & 0x7F) == 64 && (local396.anInt4623 & 0x7F) == 64) {
						local227 = local396.anInt4623 - (local396.aClass112_1.anInt3495 << 6);
						local457 = local396.anInt4601 - (local396.aClass112_1.anInt3495 << 6);
						local463 = local396.aClass112_1.anInt3495 << 7;
						if (Static31.aBoolean40) {
							for (local243 = 0; local243 < Static105.anInt2015; local243++) {
								local480 = Static265.aClass22_Sub3_Sub1Array1[Static7.anIntArray12[local243]];
								if (local480 != null && !local480.aBoolean329 && local396 != local480 && local480.aBoolean327) {
									local504 = local480.anInt4601 - (local480.aClass112_1.anInt3495 << 6);
									local513 = local480.anInt4623 - (local480.aClass112_1.anInt3495 << 6);
									local519 = local480.aClass112_1.anInt3495 << 7;
									if (Static230.method3628(local463, local519, local504, local513, local463, local227, local457, local519)) {
										Static24.method455(local134, local38, local480.aClass112_1, Static7.anIntArray12[local243]);
										local480.aBoolean329 = true;
									}
								}
							}
							for (local243 = 0; local243 < Static222.anInt4329; local243++) {
								local562 = Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local243]];
								if (local562 != null && !local562.aBoolean329 && local562.aBoolean327) {
									local504 = local562.anInt4601 - (local562.method3660() << 6);
									local513 = local562.anInt4623 - (local562.method3660() << 6);
									local519 = local562.method3660() << 7;
									if (Static230.method3628(local463, local519, local504, local513, local463, local227, local457, local519)) {
										Static79.method1217(Static46.anIntArray79[local243], local562, local38, local134);
										local562.aBoolean329 = true;
									}
								}
							}
						}
					}
					if (local396.aBoolean329) {
						continue;
					}
					Static24.method455(local134, local38, local396.aClass112_1, local127);
					local396.aBoolean329 = true;
				}
				if (local141 == 0) {
					@Pc(641) Class22_Sub3_Sub2 local641 = Static195.aClass22_Sub3_Sub2Array1[local127];
					if ((local641.anInt4601 & 0x7F) == 64 && (local641.anInt4623 & 0x7F) == 64) {
						local457 = local641.anInt4601 - (local641.method3660() << 6);
						local227 = local641.anInt4623 - (local641.method3660() << 6);
						local463 = local641.method3660() << 7;
						if (Static31.aBoolean40) {
							for (local243 = 0; local243 < Static105.anInt2015; local243++) {
								local480 = Static265.aClass22_Sub3_Sub1Array1[Static7.anIntArray12[local243]];
								if (local480 != null && !local480.aBoolean329 && local480.aBoolean327) {
									local504 = local480.anInt4601 - (local480.aClass112_1.anInt3495 << 6);
									local513 = local480.anInt4623 - (local480.aClass112_1.anInt3495 << 6);
									local519 = local480.aClass112_1.anInt3495 << 7;
									if (Static230.method3628(local463, local519, local504, local513, local463, local227, local457, local519)) {
										Static24.method455(local134, local38, local480.aClass112_1, Static7.anIntArray12[local243]);
										local480.aBoolean329 = true;
									}
								}
							}
							for (local243 = 0; local243 < Static222.anInt4329; local243++) {
								local562 = Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local243]];
								if (local562 != null && !local562.aBoolean329 && local562 != local641 && local562.aBoolean327) {
									local504 = local562.anInt4601 - (local562.method3660() << 6);
									local513 = local562.anInt4623 - (local562.method3660() << 6);
									local519 = local562.method3660() << 7;
									if (Static230.method3628(local463, local519, local504, local513, local463, local227, local457, local519)) {
										Static79.method1217(Static46.anIntArray79[local243], local562, local38, local134);
										local562.aBoolean329 = true;
									}
								}
							}
						}
					}
					if (local641.aBoolean329) {
						continue;
					}
					Static79.method1217(local127, local641, local38, local134);
					local641.aBoolean329 = true;
				}
				if (local141 == 3) {
					@Pc(864) Class24 local864 = Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local38][local134];
					if (local864 != null) {
						for (@Pc(872) Class1_Sub1_Sub18 local872 = (Class1_Sub1_Sub18) local864.method461(); local872 != null; local872 = (Class1_Sub1_Sub18) local864.method471()) {
							local227 = local872.aClass22_Sub2_1.anInt543;
							@Pc(882) Class149 local882 = Static271.method4006(local227);
							if (Static197.anInt3990 == 1) {
								Static59.method1004((short) 5, Static249.aString163, Static108.anInt2142, local38, aString151 + " -> <col=ff9040>" + local882.aString159, local134, (long) local227);
							} else if (Static91.aBoolean136) {
								@Pc(897) Class1_Sub1_Sub15 local897 = Static213.anInt4211 == -1 ? null : Static217.method3426(Static213.anInt4211);
								if ((Static234.anInt4733 & 0x1) != 0 && (local897 == null || local882.method3740(Static213.anInt4211, local897.anInt3964) != local897.anInt3964)) {
									Static59.method1004((short) 9, Static232.aString115, Static49.anInt937, local38, Static86.aString53 + " -> <col=ff9040>" + local882.aString159, local134, (long) local227);
								}
							} else {
								@Pc(949) String[] local949 = local882.aStringArray39;
								if (Static118.aBoolean180) {
									local949 = Static111.method1804(local949);
								}
								for (@Pc(960) int local960 = 4; local960 >= 0; local960--) {
									if (local949 != null && local949[local960] != null) {
										local513 = -1;
										if (local882.anInt4772 == local960) {
											local513 = local882.anInt4793;
										}
										@Pc(985) byte local985 = 0;
										if (local960 == 0) {
											local985 = 59;
										}
										if (local960 == 1) {
											local985 = 25;
										}
										if (local960 == 2) {
											local985 = 39;
										}
										if (local960 == 3) {
											local985 = 10;
										}
										if (local882.anInt4791 == local960) {
											local513 = local882.anInt4786;
										}
										if (local960 == 4) {
											local985 = 16;
										}
										Static59.method1004(local985, local949[local960], local513, local38, "<col=ff9040>" + local882.aString159, local134, (long) local227);
									}
								}
								Static59.method1004((short) 1007, Static300.aString191, Static243.anInt5650, local38, "<col=ff9040>" + local882.aString159, local134, (long) local227);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIZI)V")
	public static void method3646(@OriginalArg(2) boolean arg0) {
		Static61.anInt1209 = 2;
		Static152.anInt3130 = 22050;
		Static64.aBoolean221 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method3649(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg2.length();
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local10 - local17 < local8 || local15 - local19 < local13) {
			if (local10 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local13) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg1.charAt(local10++);
			} else {
				local62 = local17;
			}
			@Pc(78) char local78;
			if (local19 == '\u0000') {
				local78 = arg2.charAt(local15++);
			} else {
				local78 = local19;
			}
			local17 = Static238.method3751(local62);
			local19 = Static238.method3751(local78);
			local62 = Static121.method1950(local62, arg0);
			local78 = Static121.method1950(local78, arg0);
			if (local78 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local62 != local78) {
					return Static260.method3910(local62, arg0) - Static260.method3910(local78, arg0);
				}
			}
		}
		@Pc(148) int local148 = Math.min(local8, local13);
		@Pc(189) char local189;
		@Pc(150) int local150;
		for (local150 = 0; local150 < local148; local150++) {
			if (arg0 == 2) {
				local10 = local8 - local150 - 1;
				local15 = local13 - local150 - 1;
			} else {
				local15 = local150;
				local10 = local150;
			}
			@Pc(185) char local185 = arg1.charAt(local10);
			local189 = arg2.charAt(local15);
			if (local189 != local185 && Character.toUpperCase(local185) != Character.toUpperCase(local189)) {
				local185 = Character.toLowerCase(local185);
				local189 = Character.toLowerCase(local189);
				if (local189 != local185) {
					return Static260.method3910(local185, arg0) - Static260.method3910(local189, arg0);
				}
			}
		}
		local150 = local8 - local13;
		if (local150 != 0) {
			return local150;
		}
		for (@Pc(244) int local244 = 0; local244 < local148; local244++) {
			local189 = arg1.charAt(local244);
			@Pc(259) char local259 = arg2.charAt(local244);
			if (local189 != local259) {
				return Static260.method3910(local189, arg0) - Static260.method3910(local259, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!ph;I)Lclient!mo;")
	public static Class103 method3651(@OriginalArg(1) Class138 arg0, @OriginalArg(2) int arg1) {
		return Static109.method1792(arg1, arg0) ? Static224.method3521() : null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ph;III)[Lclient!mo;")
	public static Class103[] method3653(@OriginalArg(0) Class138 arg0, @OriginalArg(3) int arg1) {
		return Static27.method486(arg1, 0, arg0) ? Static283.method4221() : null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIB)I")
	public static int method3656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static18.anIntArray26[Static227.method3595(arg0, arg1)];
		if (arg2 > 0) {
			@Pc(21) int local21 = Static18.anInterface1_1.method1631(arg2 & 0xFFFF);
			@Pc(38) int local38;
			@Pc(62) int local62;
			if (local21 != 0) {
				if (arg1 < 0) {
					local38 = 0;
				} else if (arg1 <= 127) {
					local38 = arg1 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local21 == 256) {
					local7 = local38;
				} else {
					local62 = 256 - local21;
					local7 = (local62 * (local7 & 0xFF00FF) + (local38 & 0xFF00FF) * local21 & 0xFF00FF00) + (local62 * (local7 & 0xFF00) + (local38 & 0xFF00) * local21 & 0xFF0000) >> 8;
				}
			}
			local38 = Static18.anInterface1_1.method1635(arg2 & 0xFFFF);
			if (local38 != 0) {
				local38 += 256;
				local62 = (local7 >> 8 & 0xFF) * local38;
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(128) int local128 = (local7 & 0xFF) * local38;
				if (local128 > 65535) {
					local128 = 65535;
				}
				@Pc(141) int local141 = local38 * (local7 >> 16 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				local7 = (local62 & 0xFF00) + (local141 << 8 & 0xFF00B1) + (local128 >> 8);
			}
		}
		return local7;
	}
}
