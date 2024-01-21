import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!p", name = "u", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array48;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1182 = Static106.method1849(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public static volatile int anInt2197 = 0;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "[Lclient!da;")
	public static Class13[] aClass13Array1 = new Class13[4];

	@OriginalMember(owner = "client!p", name = "g", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1183 = Static106.method1849("<col=00ff00>");

	@OriginalMember(owner = "client!p", name = "i", descriptor = "J")
	public static volatile long aLong86 = 0L;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt2202 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method1506() {
		Static15.aClass10_62.method539();
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static114.aLongArray9[local18] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static90.aLongArray7[local30] = 0L;
		}
		Static67.anInt1720 = 0;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method1507() {
		for (@Pc(8) int local8 = 0; local8 < Static101.anInt2503; local8++) {
			@Pc(14) int local14 = Static44.anIntArray207[local8];
			@Pc(18) Class1_Sub1_Sub1_Sub5_Sub2 local18 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local14];
			@Pc(22) int local22 = Static133.aClass1_Sub12_Sub1_3.method1190();
			if ((local22 & 0x80) != 0) {
				local22 += Static133.aClass1_Sub12_Sub1_3.method1190() << 8;
			}
			Static41.method900(local18, local22, local14);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1508() {
		Static127.aClass1_Sub12_Sub1_2.method1227(195);
		for (@Pc(22) Class1_Sub22 local22 = (Class1_Sub22) Static52.aClass65_22.method1803(); local22 != null; local22 = (Class1_Sub22) Static52.aClass65_22.method1801()) {
			if (local22.anInt2782 == 0 || local22.anInt2782 == 3) {
				Static36.method651(local22, true);
			}
		}
		if (Static87.aClass1_Sub10_10 != null) {
			Static70.method537(Static87.aClass1_Sub10_10);
			Static87.aClass1_Sub10_10 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILclient!da;Lclient!be;III)V")
	public static void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static87.aBoolean96 && (Static87.aByteArrayArrayArray15[0][arg5][arg1] & 0x2) == 0) {
			if ((Static87.aByteArrayArrayArray15[arg7][arg5][arg1] & 0x10) != 0) {
				return;
			}
			if (Static80.method1488(arg7, arg5, arg1) != Static59.anInt1827) {
				return;
			}
		}
		if (Static74.anInt2039 > arg7) {
			Static74.anInt2039 = arg7;
		}
		@Pc(57) Class1_Sub1_Sub9 local57 = Static122.method1995(arg0);
		@Pc(69) int local69;
		@Pc(66) int local66;
		if (arg2 == 1 || arg2 == 3) {
			local69 = local57.anInt2083;
			local66 = local57.anInt2065;
		} else {
			local66 = local57.anInt2083;
			local69 = local57.anInt2065;
		}
		@Pc(86) int local86;
		@Pc(90) int local90;
		if (arg5 + local69 > 104) {
			local86 = arg5;
			local90 = arg5 + 1;
		} else {
			local86 = (local69 >> 1) + arg5;
			local90 = (local69 + 1 >> 1) + arg5;
		}
		@Pc(110) int[][] local110 = Static44.anIntArrayArrayArray3[arg7];
		@Pc(121) int local121;
		@Pc(130) int local130;
		if (local66 + arg1 <= 104) {
			local121 = (local66 >> 1) + arg1;
			local130 = arg1 + (local66 + 1 >> 1);
		} else {
			local130 = arg1 + 1;
			local121 = arg1;
		}
		@Pc(164) int local164 = local110[local90][local121] + local110[local86][local121] + local110[local86][local130] + local110[local90][local130] >> 2;
		@Pc(173) int local173 = (arg5 << 7) + (local69 << 6);
		@Pc(181) int local181 = (arg1 << 7) + (local66 << 6);
		@Pc(194) int local194 = arg5 + (arg1 << 7) + (arg0 << 14) + 1073741824;
		if (local57.anInt2089 == 0) {
			local194 += Integer.MIN_VALUE;
		}
		@Pc(210) int local210 = arg6 + (arg2 << 6);
		if (local57.anInt2054 == 1) {
			local210 += 256;
		}
		if (local57.method1439()) {
			Static27.method544(arg1, local57, arg7, arg2, arg5);
		}
		@Pc(264) Class1_Sub1_Sub1 local264;
		if (arg6 != 22) {
			@Pc(372) int local372;
			if (arg6 == 10 || arg6 == 11) {
				if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
					local264 = local57.method1436(10, local110, arg2, local181, local164, local173);
				} else {
					local264 = new Class1_Sub1_Sub1_Sub4(arg0, 10, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
				}
				if (local264 != null && arg4.method320(arg7, arg5, arg1, local164, local69, local66, local264, arg6 == 11 ? 256 : 0, local194, local210) && local57.aBoolean84) {
					local372 = 15;
					if (local264 instanceof Class1_Sub1_Sub1_Sub6) {
						local372 = ((Class1_Sub1_Sub1_Sub6) local264).method1334() / 4;
						if (local372 > 30) {
							local372 = 30;
						}
					}
					for (@Pc(388) int local388 = 0; local388 <= local69; local388++) {
						for (@Pc(392) int local392 = 0; local392 <= local66; local392++) {
							if (local372 > Static22.aByteArrayArrayArray6[arg7][arg5 + local388][arg1 + local392]) {
								Static22.aByteArrayArrayArray6[arg7][arg5 + local388][local392 + arg1] = (byte) local372;
							}
						}
					}
				}
				if (local57.anInt2084 != 0 && arg3 != null) {
					arg3.method476(local66, arg5, local69, arg1, local57.aBoolean85);
				}
			} else if (arg6 >= 12) {
				if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
					local264 = local57.method1436(arg6, local110, arg2, local181, local164, local173);
				} else {
					local264 = new Class1_Sub1_Sub1_Sub4(arg0, arg6, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
				}
				arg4.method320(arg7, arg5, arg1, local164, 1, 1, local264, 0, local194, local210);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0) {
					Static76.anIntArrayArrayArray6[arg7][arg5][arg1] |= 0x924;
				}
				if (local57.anInt2084 != 0 && arg3 != null) {
					arg3.method476(local66, arg5, local69, arg1, local57.aBoolean85);
				}
			} else if (arg6 == 0) {
				if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
					local264 = local57.method1436(0, local110, arg2, local181, local164, local173);
				} else {
					local264 = new Class1_Sub1_Sub1_Sub4(arg0, 0, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
				}
				arg4.method321(arg7, arg5, arg1, local164, local264, null, Static71.anIntArray319[arg2], 0, local194, local210);
				if (arg2 == 0) {
					if (local57.aBoolean84) {
						Static22.aByteArrayArrayArray6[arg7][arg5][arg1] = 50;
						Static22.aByteArrayArrayArray6[arg7][arg5][arg1 + 1] = 50;
					}
					if (local57.aBoolean87) {
						Static76.anIntArrayArrayArray6[arg7][arg5][arg1] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local57.aBoolean84) {
						Static22.aByteArrayArrayArray6[arg7][arg5][arg1 + 1] = 50;
						Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1 + 1] = 50;
					}
					if (local57.aBoolean87) {
						Static76.anIntArrayArrayArray6[arg7][arg5][arg1 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local57.aBoolean84) {
						Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1] = 50;
						Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1 + 1] = 50;
					}
					if (local57.aBoolean87) {
						Static76.anIntArrayArrayArray6[arg7][arg5 + 1][arg1] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local57.aBoolean84) {
						Static22.aByteArrayArrayArray6[arg7][arg5][arg1] = 50;
						Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1] = 50;
					}
					if (local57.aBoolean87) {
						Static76.anIntArrayArrayArray6[arg7][arg5][arg1] |= 0x492;
					}
				}
				if (local57.anInt2084 != 0 && arg3 != null) {
					arg3.method471(arg5, arg1, arg2, arg6, local57.aBoolean85);
				}
				if (local57.anInt2088 != 16) {
					arg4.method319(arg7, arg5, arg1, local57.anInt2088);
				}
			} else if (arg6 == 1) {
				if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
					local264 = local57.method1436(1, local110, arg2, local181, local164, local173);
				} else {
					local264 = new Class1_Sub1_Sub1_Sub4(arg0, 1, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
				}
				arg4.method321(arg7, arg5, arg1, local164, local264, null, Static94.anIntArray406[arg2], 0, local194, local210);
				if (local57.aBoolean84) {
					if (arg2 == 0) {
						Static22.aByteArrayArrayArray6[arg7][arg5][arg1 + 1] = 50;
					} else if (arg2 == 1) {
						Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1 + 1] = 50;
					} else if (arg2 == 2) {
						Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1] = 50;
					} else if (arg2 == 3) {
						Static22.aByteArrayArrayArray6[arg7][arg5][arg1] = 50;
					}
				}
				if (local57.anInt2084 != 0 && arg3 != null) {
					arg3.method471(arg5, arg1, arg2, arg6, local57.aBoolean85);
				}
			} else {
				@Pc(969) int local969;
				@Pc(1007) Class1_Sub1_Sub1 local1007;
				if (arg6 == 2) {
					local969 = arg2 + 1 & 0x3;
					@Pc(993) Class1_Sub1_Sub1 local993;
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local993 = local57.method1436(2, local110, arg2 + 4, local181, local164, local173);
						local1007 = local57.method1436(2, local110, local969, local181, local164, local173);
					} else {
						local993 = new Class1_Sub1_Sub1_Sub4(arg0, 2, arg2 + 4, arg7, arg5, arg1, local57.anInt2075, true, null);
						local1007 = new Class1_Sub1_Sub1_Sub4(arg0, 2, local969, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method321(arg7, arg5, arg1, local164, local993, local1007, Static71.anIntArray319[arg2], Static71.anIntArray319[local969], local194, local210);
					if (local57.aBoolean87) {
						if (arg2 == 0) {
							Static76.anIntArrayArrayArray6[arg7][arg5][arg1] |= 0x249;
							Static76.anIntArrayArrayArray6[arg7][arg5][arg1 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static76.anIntArrayArrayArray6[arg7][arg5][arg1 + 1] |= 0x492;
							Static76.anIntArrayArrayArray6[arg7][arg5 + 1][arg1] |= 0x249;
						} else if (arg2 == 2) {
							Static76.anIntArrayArrayArray6[arg7][arg5 + 1][arg1] |= 0x249;
							Static76.anIntArrayArrayArray6[arg7][arg5][arg1] |= 0x492;
						} else if (arg2 == 3) {
							Static76.anIntArrayArrayArray6[arg7][arg5][arg1] |= 0x492;
							Static76.anIntArrayArrayArray6[arg7][arg5][arg1] |= 0x249;
						}
					}
					if (local57.anInt2084 != 0 && arg3 != null) {
						arg3.method471(arg5, arg1, arg2, arg6, local57.aBoolean85);
					}
					if (local57.anInt2088 != 16) {
						arg4.method319(arg7, arg5, arg1, local57.anInt2088);
					}
				} else if (arg6 == 3) {
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local264 = local57.method1436(3, local110, arg2, local181, local164, local173);
					} else {
						local264 = new Class1_Sub1_Sub1_Sub4(arg0, 3, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method321(arg7, arg5, arg1, local164, local264, null, Static94.anIntArray406[arg2], 0, local194, local210);
					if (local57.aBoolean84) {
						if (arg2 == 0) {
							Static22.aByteArrayArrayArray6[arg7][arg5][arg1 + 1] = 50;
						} else if (arg2 == 1) {
							Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1 + 1] = 50;
						} else if (arg2 == 2) {
							Static22.aByteArrayArrayArray6[arg7][arg5 + 1][arg1] = 50;
						} else if (arg2 == 3) {
							Static22.aByteArrayArrayArray6[arg7][arg5][arg1] = 50;
						}
					}
					if (local57.anInt2084 != 0 && arg3 != null) {
						arg3.method471(arg5, arg1, arg2, arg6, local57.aBoolean85);
					}
				} else if (arg6 == 9) {
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local264 = local57.method1436(arg6, local110, arg2, local181, local164, local173);
					} else {
						local264 = new Class1_Sub1_Sub1_Sub4(arg0, arg6, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method320(arg7, arg5, arg1, local164, 1, 1, local264, 0, local194, local210);
					if (local57.anInt2084 != 0 && arg3 != null) {
						arg3.method476(local66, arg5, local69, arg1, local57.aBoolean85);
					}
					if (local57.anInt2088 != 16) {
						arg4.method319(arg7, arg5, arg1, local57.anInt2088);
					}
				} else if (arg6 == 4) {
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local264 = local57.method1436(4, local110, arg2, local181, local164, local173);
					} else {
						local264 = new Class1_Sub1_Sub1_Sub4(arg0, 4, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method342(arg7, arg5, arg1, local164, local264, null, Static71.anIntArray319[arg2], 0, 0, 0, local194, local210);
				} else if (arg6 == 5) {
					local969 = 16;
					local372 = arg4.method337(arg7, arg5, arg1);
					if (local372 != 0) {
						local969 = Static122.method1995(local372 >> 14 & 0x7FFF).anInt2088;
					}
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local1007 = local57.method1436(4, local110, arg2, local181, local164, local173);
					} else {
						local1007 = new Class1_Sub1_Sub1_Sub4(arg0, 4, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method342(arg7, arg5, arg1, local164, local1007, null, Static71.anIntArray319[arg2], 0, local969 * Static87.anIntArray387[arg2], local969 * Static102.anIntArray427[arg2], local194, local210);
				} else if (arg6 == 6) {
					local969 = 8;
					local372 = arg4.method337(arg7, arg5, arg1);
					if (local372 != 0) {
						local969 = Static122.method1995(local372 >> 14 & 0x7FFF).anInt2088 / 2;
					}
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local1007 = local57.method1436(4, local110, arg2 + 4, local181, local164, local173);
					} else {
						local1007 = new Class1_Sub1_Sub1_Sub4(arg0, 4, arg2 + 4, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method342(arg7, arg5, arg1, local164, local1007, null, 256, arg2, local969 * Static84.anIntArray372[arg2], Static48.anIntArray227[arg2] * local969, local194, local210);
				} else if (arg6 == 7) {
					local372 = arg2 + 2 & 0x3;
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local264 = local57.method1436(4, local110, local372 + 4, local181, local164, local173);
					} else {
						local264 = new Class1_Sub1_Sub1_Sub4(arg0, 4, local372 + 4, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method342(arg7, arg5, arg1, local164, local264, null, 256, local372, 0, 0, local194, local210);
				} else if (arg6 == 8) {
					local969 = 8;
					local372 = arg4.method337(arg7, arg5, arg1);
					if (local372 != 0) {
						local969 = Static122.method1995(local372 >> 14 & 0x7FFF).anInt2088 / 2;
					}
					@Pc(1764) int local1764 = arg2 + 2 & 0x3;
					@Pc(1795) Class1_Sub1_Sub1 local1795;
					if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
						local1007 = local57.method1436(4, local110, arg2 + 4, local181, local164, local173);
						local1795 = local57.method1436(4, local110, local1764 + 4, local181, local164, local173);
					} else {
						local1007 = new Class1_Sub1_Sub1_Sub4(arg0, 4, arg2 + 4, arg7, arg5, arg1, local57.anInt2075, true, null);
						local1795 = new Class1_Sub1_Sub1_Sub4(arg0, 4, local1764 + 4, arg7, arg5, arg1, local57.anInt2075, true, null);
					}
					arg4.method342(arg7, arg5, arg1, local164, local1007, local1795, 256, arg2, Static84.anIntArray372[arg2] * local969, local969 * Static48.anIntArray227[arg2], local194, local210);
				}
			}
		} else if (!Static87.aBoolean96 || local57.anInt2089 != 0 || local57.anInt2084 == 1 || local57.aBoolean83) {
			if (local57.anInt2075 == -1 && local57.anIntArray338 == null) {
				local264 = local57.method1436(22, local110, arg2, local181, local164, local173);
			} else {
				local264 = new Class1_Sub1_Sub1_Sub4(arg0, 22, arg2, arg7, arg5, arg1, local57.anInt2075, true, null);
			}
			arg4.method335(arg7, arg5, arg1, local164, local264, local194, local210);
			if (local57.anInt2084 == 1 && arg3 != null) {
				arg3.method474(arg1, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method1512() {
		aClass66_1183 = null;
		aClass1_Sub1_Sub2_Sub1Array48 = null;
		aClass13Array1 = null;
		aClass66_1182 = null;
	}
}
