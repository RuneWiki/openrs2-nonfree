import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_809 = Static161.method2971("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_810 = Static161.method2971("");

	@OriginalMember(owner = "client!k", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!k", name = "n", descriptor = "I")
	public static int anInt2447 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method1824() {
		aClass13_809 = null;
		aClass13_810 = null;
		aByteArrayArray6 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILclient!d;IIII)V")
	public static void method1827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static30.aBoolean72 && (Static35.aByteArrayArrayArray20[0][arg3][arg5] & 0x2) == 0) {
			if ((Static35.aByteArrayArrayArray20[arg6][arg3][arg5] & 0x10) != 0) {
				return;
			}
			if (Static30.method879(arg3, arg5, arg6) != Static136.anInt3397) {
				return;
			}
		}
		if (arg6 < Static21.anInt782) {
			Static21.anInt782 = arg6;
		}
		@Pc(59) Class1_Sub2_Sub14 local59 = Static4.method79(arg4);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (arg1 == 1 || arg1 == 3) {
			local72 = local59.anInt3302;
			local75 = local59.anInt3314;
		} else {
			local72 = local59.anInt3314;
			local75 = local59.anInt3302;
		}
		@Pc(94) int local94;
		@Pc(92) int local92;
		if (local75 + arg3 > 104) {
			local92 = arg3 + 1;
			local94 = arg3;
		} else {
			local92 = (local75 + 1 >> 1) + arg3;
			local94 = arg3 + (local75 >> 1);
		}
		@Pc(114) int[][] local114 = Static183.anIntArrayArrayArray8[arg6];
		@Pc(123) int local123 = (arg3 << 7) + (local75 << 6);
		@Pc(131) int local131 = (local72 << 6) + (arg5 << 7);
		@Pc(140) int local140;
		@Pc(144) int local144;
		if (local72 + arg5 > 104) {
			local140 = arg5;
			local144 = arg5 + 1;
		} else {
			local140 = (local72 >> 1) + arg5;
			local144 = arg5 + (local72 + 1 >> 1);
		}
		@Pc(187) int local187 = local114[local94][local144] + local114[local92][local140] + local114[local94][local140] + local114[local92][local144] >> 2;
		@Pc(204) long local204 = (long) (arg5 << 7 | arg3 | arg0 << 14 | arg1 << 20 | 0x40000000);
		if (local59.anInt3319 == 0) {
			local204 |= Long.MIN_VALUE;
		}
		if (local59.anInt3326 == 1) {
			local204 |= 0x400000L;
		}
		if (local59.method2378()) {
			Static7.method2259(arg5, arg3, local59, arg6, arg1);
		}
		local204 |= (long) arg4 << 32;
		@Pc(279) Class1_Sub2_Sub2 local279;
		@Pc(276) Class1_Sub2_Sub15 local276;
		if (arg0 != 22) {
			@Pc(387) int local387;
			if (arg0 == 10 || arg0 == 11) {
				if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
					local276 = local59.method2372(local187, local123, local131, arg1, local114, 10);
					local279 = local276.aClass1_Sub2_Sub2_8;
				} else {
					local279 = new Class1_Sub2_Sub2_Sub6(arg4, 10, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
				}
				if (local279 != null && Static147.method2583(arg6, arg3, arg5, local187, local75, local72, local279, arg0 == 11 ? 256 : 0, local204) && local59.aBoolean253) {
					local387 = 15;
					if (local279 instanceof Class1_Sub2_Sub2_Sub5) {
						local387 = ((Class1_Sub2_Sub2_Sub5) local279).method2717() / 4;
						if (local387 > 30) {
							local387 = 30;
						}
					}
					for (@Pc(403) int local403 = 0; local403 <= local75; local403++) {
						for (@Pc(407) int local407 = 0; local407 <= local72; local407++) {
							if (Static81.aByteArrayArrayArray27[arg6][local403 + arg3][arg5 + local407] < local387) {
								Static81.aByteArrayArrayArray27[arg6][arg3 + local403][local407 + arg5] = (byte) local387;
							}
						}
					}
				}
				if (local59.anInt3320 != 0 && arg2 != null) {
					arg2.method824(arg5, local59.aBoolean257, local72, local75, arg3);
				}
			} else if (arg0 >= 12) {
				if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
					local276 = local59.method2372(local187, local123, local131, arg1, local114, arg0);
					local279 = local276.aClass1_Sub2_Sub2_8;
				} else {
					local279 = new Class1_Sub2_Sub2_Sub6(arg4, arg0, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
				}
				Static147.method2583(arg6, arg3, arg5, local187, 1, 1, local279, 0, local204);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg6 > 0) {
					Static160.anIntArrayArrayArray7[arg6][arg3][arg5] |= 0x924;
				}
				if (local59.anInt3320 != 0 && arg2 != null) {
					arg2.method824(arg5, local59.aBoolean257, local72, local75, arg3);
				}
			} else if (arg0 == 0) {
				if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
					local276 = local59.method2372(local187, local123, local131, arg1, local114, 0);
					local279 = local276.aClass1_Sub2_Sub2_8;
				} else {
					local279 = new Class1_Sub2_Sub2_Sub6(arg4, 0, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
				}
				Static14.method536(arg6, arg3, arg5, local187, local279, null, Static51.anIntArray179[arg1], 0, local204);
				if (arg1 == 0) {
					if (local59.aBoolean253) {
						Static81.aByteArrayArrayArray27[arg6][arg3][arg5] = 50;
						Static81.aByteArrayArrayArray27[arg6][arg3][arg5 + 1] = 50;
					}
					if (local59.aBoolean252) {
						Static160.anIntArrayArrayArray7[arg6][arg3][arg5] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local59.aBoolean253) {
						Static81.aByteArrayArrayArray27[arg6][arg3][arg5 + 1] = 50;
						Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5 + 1] = 50;
					}
					if (local59.aBoolean252) {
						Static160.anIntArrayArrayArray7[arg6][arg3][arg5 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local59.aBoolean253) {
						Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5] = 50;
						Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5 + 1] = 50;
					}
					if (local59.aBoolean252) {
						Static160.anIntArrayArrayArray7[arg6][arg3 + 1][arg5] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local59.aBoolean253) {
						Static81.aByteArrayArrayArray27[arg6][arg3][arg5] = 50;
						Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5] = 50;
					}
					if (local59.aBoolean252) {
						Static160.anIntArrayArrayArray7[arg6][arg3][arg5] |= 0x492;
					}
				}
				if (local59.anInt3320 != 0 && arg2 != null) {
					arg2.method823(arg1, arg0, local59.aBoolean257, arg3, arg5);
				}
				if (local59.anInt3337 != 16) {
					Static1.method47(arg6, arg3, arg5, local59.anInt3337);
				}
			} else if (arg0 == 1) {
				if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
					local276 = local59.method2372(local187, local123, local131, arg1, local114, 1);
					local279 = local276.aClass1_Sub2_Sub2_8;
				} else {
					local279 = new Class1_Sub2_Sub2_Sub6(arg4, 1, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
				}
				Static14.method536(arg6, arg3, arg5, local187, local279, null, Static174.anIntArray146[arg1], 0, local204);
				if (local59.aBoolean253) {
					if (arg1 == 0) {
						Static81.aByteArrayArrayArray27[arg6][arg3][arg5 + 1] = 50;
					} else if (arg1 == 1) {
						Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5 + 1] = 50;
					} else if (arg1 == 2) {
						Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5] = 50;
					} else if (arg1 == 3) {
						Static81.aByteArrayArrayArray27[arg6][arg3][arg5] = 50;
					}
				}
				if (local59.anInt3320 != 0 && arg2 != null) {
					arg2.method823(arg1, arg0, local59.aBoolean257, arg3, arg5);
				}
			} else {
				@Pc(990) int local990;
				@Pc(1019) Class1_Sub2_Sub15 local1019;
				if (arg0 == 2) {
					local990 = arg1 + 1 & 0x3;
					@Pc(1022) Class1_Sub2_Sub2 local1022;
					@Pc(1025) Class1_Sub2_Sub2 local1025;
					if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
						@Pc(1009) Class1_Sub2_Sub15 local1009 = local59.method2372(local187, local123, local131, arg1 + 4, local114, 2);
						local1019 = local59.method2372(local187, local123, local131, local990, local114, 2);
						local1022 = local1019.aClass1_Sub2_Sub2_8;
						local1025 = local1009.aClass1_Sub2_Sub2_8;
					} else {
						local1025 = new Class1_Sub2_Sub2_Sub6(arg4, 2, arg1 + 4, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
						local1022 = new Class1_Sub2_Sub2_Sub6(arg4, 2, local990, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
					}
					Static14.method536(arg6, arg3, arg5, local187, local1025, local1022, Static51.anIntArray179[arg1], Static51.anIntArray179[local990], local204);
					if (local59.aBoolean252) {
						if (arg1 == 0) {
							Static160.anIntArrayArrayArray7[arg6][arg3][arg5] |= 0x249;
							Static160.anIntArrayArrayArray7[arg6][arg3][arg5 + 1] |= 0x492;
						} else if (arg1 == 1) {
							Static160.anIntArrayArrayArray7[arg6][arg3][arg5 + 1] |= 0x492;
							Static160.anIntArrayArrayArray7[arg6][arg3 + 1][arg5] |= 0x249;
						} else if (arg1 == 2) {
							Static160.anIntArrayArrayArray7[arg6][arg3 + 1][arg5] |= 0x249;
							Static160.anIntArrayArrayArray7[arg6][arg3][arg5] |= 0x492;
						} else if (arg1 == 3) {
							Static160.anIntArrayArrayArray7[arg6][arg3][arg5] |= 0x492;
							Static160.anIntArrayArrayArray7[arg6][arg3][arg5] |= 0x249;
						}
					}
					if (local59.anInt3320 != 0 && arg2 != null) {
						arg2.method823(arg1, arg0, local59.aBoolean257, arg3, arg5);
					}
					if (local59.anInt3337 != 16) {
						Static1.method47(arg6, arg3, arg5, local59.anInt3337);
					}
				} else if (arg0 == 3) {
					if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
						local276 = local59.method2372(local187, local123, local131, arg1, local114, 3);
						local279 = local276.aClass1_Sub2_Sub2_8;
					} else {
						local279 = new Class1_Sub2_Sub2_Sub6(arg4, 3, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
					}
					Static14.method536(arg6, arg3, arg5, local187, local279, null, Static174.anIntArray146[arg1], 0, local204);
					if (local59.aBoolean253) {
						if (arg1 == 0) {
							Static81.aByteArrayArrayArray27[arg6][arg3][arg5 + 1] = 50;
						} else if (arg1 == 1) {
							Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5 + 1] = 50;
						} else if (arg1 == 2) {
							Static81.aByteArrayArrayArray27[arg6][arg3 + 1][arg5] = 50;
						} else if (arg1 == 3) {
							Static81.aByteArrayArrayArray27[arg6][arg3][arg5] = 50;
						}
					}
					if (local59.anInt3320 != 0 && arg2 != null) {
						arg2.method823(arg1, arg0, local59.aBoolean257, arg3, arg5);
					}
				} else if (arg0 == 9) {
					if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
						local276 = local59.method2372(local187, local123, local131, arg1, local114, arg0);
						local279 = local276.aClass1_Sub2_Sub2_8;
					} else {
						local279 = new Class1_Sub2_Sub2_Sub6(arg4, arg0, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
					}
					Static147.method2583(arg6, arg3, arg5, local187, 1, 1, local279, 0, local204);
					if (local59.anInt3320 != 0 && arg2 != null) {
						arg2.method824(arg5, local59.aBoolean257, local72, local75, arg3);
					}
					if (local59.anInt3337 != 16) {
						Static1.method47(arg6, arg3, arg5, local59.anInt3337);
					}
				} else if (arg0 == 4) {
					if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
						local276 = local59.method2372(local187, local123, local131, arg1, local114, 4);
						local279 = local276.aClass1_Sub2_Sub2_8;
					} else {
						local279 = new Class1_Sub2_Sub2_Sub6(arg4, 4, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
					}
					Static171.method2893(arg6, arg3, arg5, local187, local279, null, Static51.anIntArray179[arg1], 0, 0, 0, local204);
				} else {
					@Pc(1550) long local1550;
					@Pc(1585) Class1_Sub2_Sub2 local1585;
					if (arg0 == 5) {
						local990 = 16;
						local1550 = Static99.method1994(arg6, arg3, arg5);
						if (local1550 != 0L) {
							local990 = Static4.method79((int) (local1550 >>> 32) & Integer.MAX_VALUE).anInt3337;
						}
						if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
							local1019 = local59.method2372(local187, local123, local131, arg1, local114, 4);
							local1585 = local1019.aClass1_Sub2_Sub2_8;
						} else {
							local1585 = new Class1_Sub2_Sub2_Sub6(arg4, 4, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
						}
						Static171.method2893(arg6, arg3, arg5, local187, local1585, null, Static51.anIntArray179[arg1], 0, Static10.anIntArray48[arg1] * local990, Static118.anIntArray301[arg1] * local990, local204);
					} else if (arg0 == 6) {
						local990 = 8;
						local1550 = Static99.method1994(arg6, arg3, arg5);
						if (local1550 != 0L) {
							local990 = Static4.method79((int) (local1550 >>> 32) & Integer.MAX_VALUE).anInt3337 / 2;
						}
						if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
							local1019 = local59.method2372(local187, local123, local131, arg1 + 4, local114, 4);
							local1585 = local1019.aClass1_Sub2_Sub2_8;
						} else {
							local1585 = new Class1_Sub2_Sub2_Sub6(arg4, 4, arg1 + 4, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
						}
						Static171.method2893(arg6, arg3, arg5, local187, local1585, null, 256, arg1, Static43.anIntArray149[arg1] * local990, local990 * Static69.anIntArray211[arg1], local204);
					} else if (arg0 == 7) {
						local387 = arg1 + 2 & 0x3;
						if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
							@Pc(1763) Class1_Sub2_Sub15 local1763 = local59.method2372(local187, local123, local131, local387 + 4, local114, 4);
							local279 = local1763.aClass1_Sub2_Sub2_8;
						} else {
							local279 = new Class1_Sub2_Sub2_Sub6(arg4, 4, local387 + 4, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
						}
						Static171.method2893(arg6, arg3, arg5, local187, local279, null, 256, local387, 0, 0, local204);
					} else if (arg0 == 8) {
						local990 = 8;
						local1550 = Static99.method1994(arg6, arg3, arg5);
						if (local1550 != 0L) {
							local990 = Static4.method79(Integer.MAX_VALUE & (int) (local1550 >>> 32)).anInt3337 / 2;
						}
						@Pc(1813) int local1813 = arg1 + 2 & 0x3;
						@Pc(1855) Class1_Sub2_Sub2 local1855;
						if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
							@Pc(1869) Class1_Sub2_Sub15 local1869 = local59.method2372(local187, local123, local131, arg1 + 4, local114, 4);
							@Pc(1881) Class1_Sub2_Sub15 local1881 = local59.method2372(local187, local123, local131, local1813 + 4, local114, 4);
							local1855 = local1881.aClass1_Sub2_Sub2_8;
							local1585 = local1869.aClass1_Sub2_Sub2_8;
						} else {
							local1585 = new Class1_Sub2_Sub2_Sub6(arg4, 4, arg1 + 4, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
							local1855 = new Class1_Sub2_Sub2_Sub6(arg4, 4, local1813 + 4, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
						}
						Static171.method2893(arg6, arg3, arg5, local187, local1585, local1855, 256, arg1, local990 * Static43.anIntArray149[arg1], local990 * Static69.anIntArray211[arg1], local204);
					}
				}
			}
		} else if (!Static30.aBoolean72 || local59.anInt3319 != 0 || local59.anInt3320 == 1 || local59.aBoolean249) {
			if (local59.anInt3336 == -1 && local59.anIntArray326 == null) {
				local276 = local59.method2372(local187, local123, local131, arg1, local114, 22);
				local279 = local276.aClass1_Sub2_Sub2_8;
			} else {
				local279 = new Class1_Sub2_Sub2_Sub6(arg4, 22, arg1, arg6, arg3, arg5, local59.anInt3336, local59.aBoolean250, null);
			}
			Static85.method1821(arg6, arg3, arg5, local187, local279, local204, local59.aBoolean255);
			if (local59.anInt3320 == 1 && arg2 != null) {
				arg2.method815(arg3, arg5);
			}
		}
	}
}
