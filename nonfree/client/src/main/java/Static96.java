import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_97;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_627 = Static181.method2795(" loggt sich ein)3");

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_5 = new Class91(50);

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
	public static final int[] anIntArray204 = new int[32];

	@OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lclient!nc;")
	public static final Class63 aClass63_9 = new Class63(4096);

	@OriginalMember(owner = "client!kc", name = "nb", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_11 = new Class19();

	@OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_628 = Static181.method2795("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
	public static void method1641() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZIZIBIIIILclient!dg;)V")
	public static void method1642(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class22 arg9) {
		if (arg1 && (Static9.aByteArrayArrayArray7[0][arg4][arg5] & 0x2) == 0) {
			if ((Static9.aByteArrayArrayArray7[arg2][arg4][arg5] & 0x10) != 0) {
				return;
			}
			if (Static98.method1684(arg4, arg2, arg5) != Static159.anInt3223) {
				return;
			}
		}
		if (arg2 < Static40.anInt1032) {
			Static40.anInt1032 = arg2;
		}
		@Pc(53) Class2_Sub2_Sub20 local53 = Static99.method1689(arg7);
		@Pc(64) int local64;
		@Pc(67) int local67;
		if (arg8 == 1 || arg8 == 3) {
			local67 = local53.anInt2670;
			local64 = local53.anInt2665;
		} else {
			local64 = local53.anInt2670;
			local67 = local53.anInt2665;
		}
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (local64 + arg4 <= 104) {
			local91 = arg4 + (local64 >> 1);
			local100 = arg4 + (local64 + 1 >> 1);
		} else {
			local91 = arg4;
			local100 = arg4 + 1;
		}
		@Pc(112) int[][] local112 = Static170.anIntArrayArrayArray10[arg0];
		@Pc(123) int local123;
		@Pc(121) int local121;
		if (arg5 + local67 > 104) {
			local121 = arg5 + 1;
			local123 = arg5;
		} else {
			local121 = arg5 + (local67 + 1 >> 1);
			local123 = (local67 >> 1) + arg5;
		}
		@Pc(147) int local147 = (local64 << 6) + (arg4 << 7);
		@Pc(155) int local155 = (local67 << 6) + (arg5 << 7);
		@Pc(181) int local181 = local112[local91][local121] + local112[local100][local123] + local112[local91][local123] + local112[local100][local121] >> 2;
		@Pc(198) long local198 = (long) (arg8 << 20 | arg5 << 7 | arg4 | arg6 << 14 | 0x40000000);
		if (local53.anInt2658 == 0) {
			local198 |= Long.MIN_VALUE;
		}
		if (local53.anInt2690 == 1) {
			local198 |= 0x400000L;
		}
		local198 |= (long) arg7 << 32;
		if (arg3 && local53.method2049()) {
			Static180.method2786(arg5, arg8, local53, arg4, arg2);
		}
		@Pc(277) Class24 local277;
		@Pc(290) Class2_Sub2_Sub13 local290;
		if (arg6 == 22) {
			if (!arg1 || local53.anInt2658 != 0 || local53.anInt2671 == 1 || local53.aBoolean131) {
				if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
					local290 = local53.method2045(local155, 22, local181, local147, arg3, arg8, local112);
					local277 = local290.aClass24_2;
				} else {
					local277 = new Class24_Sub2(arg7, 22, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
				}
				Static89.method3269(arg2, arg4, arg5, local181, local277, local198, local53.aBoolean132);
				if (local53.anInt2671 == 1 && arg9 != null) {
					arg9.method737(arg4, arg5);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
				local290 = local53.method2045(local155, 10, local181, local147, arg3, arg8, local112);
				local277 = local290.aClass24_2;
			} else {
				local277 = new Class24_Sub2(arg7, 10, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
			}
			if (local277 != null) {
				@Pc(378) boolean local378 = Static75.method1427(arg2, arg4, arg5, local181, local64, local67, local277, arg6 == 11 ? 256 : 0, local198);
				if (local53.aBoolean125 && local378 && arg3) {
					@Pc(387) int local387 = 15;
					if (local277 instanceof Class24_Sub3) {
						local387 = ((Class24_Sub3) local277).method2726() / 4;
						if (local387 > 30) {
							local387 = 30;
						}
					}
					for (@Pc(405) int local405 = 0; local405 <= local64; local405++) {
						for (@Pc(409) int local409 = 0; local409 <= local67; local409++) {
							if (Static110.aByteArrayArrayArray46[arg2][arg4 + local405][arg5 + local409] < local387) {
								Static110.aByteArrayArrayArray46[arg2][local405 + arg4][local409 + arg5] = (byte) local387;
							}
						}
					}
				}
			}
			if (local53.anInt2671 != 0 && arg9 != null) {
				arg9.method729(local53.aBoolean134, arg5, local67, local64, arg4);
			}
		} else if (arg6 >= 12) {
			if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
				local290 = local53.method2045(local155, arg6, local181, local147, arg3, arg8, local112);
				local277 = local290.aClass24_2;
			} else {
				local277 = new Class24_Sub2(arg7, arg6, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
			}
			Static75.method1427(arg2, arg4, arg5, local181, 1, 1, local277, 0, local198);
			if (arg3 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
				Static61.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x924;
			}
			if (local53.anInt2671 != 0 && arg9 != null) {
				arg9.method729(local53.aBoolean134, arg5, local67, local64, arg4);
			}
		} else if (arg6 == 0) {
			if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
				local290 = local53.method2045(local155, 0, local181, local147, arg3, arg8, local112);
				local277 = local290.aClass24_2;
			} else {
				local277 = new Class24_Sub2(arg7, 0, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
			}
			Static92.method1601(arg2, arg4, arg5, local181, local277, null, Static88.anIntArray196[arg8], 0, local198);
			if (arg3) {
				if (arg8 == 0) {
					if (local53.aBoolean125) {
						Static110.aByteArrayArrayArray46[arg2][arg4][arg5] = 50;
						Static110.aByteArrayArrayArray46[arg2][arg4][arg5 + 1] = 50;
					}
					if (local53.aBoolean126) {
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x249;
					}
				} else if (arg8 == 1) {
					if (local53.aBoolean125) {
						Static110.aByteArrayArrayArray46[arg2][arg4][arg5 + 1] = 50;
						Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5 + 1] = 50;
					}
					if (local53.aBoolean126) {
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5 + 1] |= 0x492;
					}
				} else if (arg8 == 2) {
					if (local53.aBoolean125) {
						Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5] = 50;
						Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5 + 1] = 50;
					}
					if (local53.aBoolean126) {
						Static61.anIntArrayArrayArray4[arg2][arg4 + 1][arg5] |= 0x249;
					}
				} else if (arg8 == 3) {
					if (local53.aBoolean125) {
						Static110.aByteArrayArrayArray46[arg2][arg4][arg5] = 50;
						Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5] = 50;
					}
					if (local53.aBoolean126) {
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x492;
					}
				}
			}
			if (local53.anInt2671 != 0 && arg9 != null) {
				arg9.method734(local53.aBoolean134, arg5, arg8, arg4, arg6);
			}
			if (local53.anInt2675 != 16) {
				Static22.method433(arg2, arg4, arg5, local53.anInt2675);
			}
		} else if (arg6 == 1) {
			if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
				local290 = local53.method2045(local155, 1, local181, local147, arg3, arg8, local112);
				local277 = local290.aClass24_2;
			} else {
				local277 = new Class24_Sub2(arg7, 1, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
			}
			Static92.method1601(arg2, arg4, arg5, local181, local277, null, Static192.anIntArray371[arg8], 0, local198);
			if (local53.aBoolean125 && arg3) {
				if (arg8 == 0) {
					Static110.aByteArrayArrayArray46[arg2][arg4][arg5 + 1] = 50;
				} else if (arg8 == 1) {
					Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5 + 1] = 50;
				} else if (arg8 == 2) {
					Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5] = 50;
				} else if (arg8 == 3) {
					Static110.aByteArrayArrayArray46[arg2][arg4][arg5] = 50;
				}
			}
			if (local53.anInt2671 != 0 && arg9 != null) {
				arg9.method734(local53.aBoolean134, arg5, arg8, arg4, arg6);
			}
		} else {
			@Pc(1000) int local1000;
			if (arg6 == 2) {
				local1000 = arg8 + 1 & 0x3;
				@Pc(1039) Class24 local1039;
				@Pc(1024) Class24 local1024;
				if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
					@Pc(1054) Class2_Sub2_Sub13 local1054 = local53.method2045(local155, 2, local181, local147, arg3, arg8 + 4, local112);
					local1024 = local1054.aClass24_2;
					@Pc(1068) Class2_Sub2_Sub13 local1068 = local53.method2045(local155, 2, local181, local147, arg3, local1000, local112);
					local1039 = local1068.aClass24_2;
				} else {
					local1024 = new Class24_Sub2(arg7, 2, arg8 + 4, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
					local1039 = new Class24_Sub2(arg7, 2, local1000, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
				}
				Static92.method1601(arg2, arg4, arg5, local181, local1024, local1039, Static88.anIntArray196[arg8], Static88.anIntArray196[local1000], local198);
				if (local53.aBoolean126 && arg3) {
					if (arg8 == 0) {
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x249;
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5 + 1] |= 0x492;
					} else if (arg8 == 1) {
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5 + 1] |= 0x492;
						Static61.anIntArrayArrayArray4[arg2][arg4 + 1][arg5] |= 0x249;
					} else if (arg8 == 2) {
						Static61.anIntArrayArrayArray4[arg2][arg4 + 1][arg5] |= 0x249;
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x492;
					} else if (arg8 == 3) {
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x492;
						Static61.anIntArrayArrayArray4[arg2][arg4][arg5] |= 0x249;
					}
				}
				if (local53.anInt2671 != 0 && arg9 != null) {
					arg9.method734(local53.aBoolean134, arg5, arg8, arg4, arg6);
				}
				if (local53.anInt2675 != 16) {
					Static22.method433(arg2, arg4, arg5, local53.anInt2675);
				}
			} else if (arg6 == 3) {
				if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
					local290 = local53.method2045(local155, 3, local181, local147, arg3, arg8, local112);
					local277 = local290.aClass24_2;
				} else {
					local277 = new Class24_Sub2(arg7, 3, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
				}
				Static92.method1601(arg2, arg4, arg5, local181, local277, null, Static192.anIntArray371[arg8], 0, local198);
				if (local53.aBoolean125 && arg3) {
					if (arg8 == 0) {
						Static110.aByteArrayArrayArray46[arg2][arg4][arg5 + 1] = 50;
					} else if (arg8 == 1) {
						Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5 + 1] = 50;
					} else if (arg8 == 2) {
						Static110.aByteArrayArrayArray46[arg2][arg4 + 1][arg5] = 50;
					} else if (arg8 == 3) {
						Static110.aByteArrayArrayArray46[arg2][arg4][arg5] = 50;
					}
				}
				if (local53.anInt2671 != 0 && arg9 != null) {
					arg9.method734(local53.aBoolean134, arg5, arg8, arg4, arg6);
				}
			} else if (arg6 == 9) {
				if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
					local290 = local53.method2045(local155, arg6, local181, local147, arg3, arg8, local112);
					local277 = local290.aClass24_2;
				} else {
					local277 = new Class24_Sub2(arg7, arg6, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
				}
				Static75.method1427(arg2, arg4, arg5, local181, 1, 1, local277, 0, local198);
				if (local53.anInt2671 != 0 && arg9 != null) {
					arg9.method729(local53.aBoolean134, arg5, local67, local64, arg4);
				}
				if (local53.anInt2675 != 16) {
					Static22.method433(arg2, arg4, arg5, local53.anInt2675);
				}
			} else if (arg6 == 4) {
				if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
					local290 = local53.method2045(local155, 4, local181, local147, arg3, arg8, local112);
					local277 = local290.aClass24_2;
				} else {
					local277 = new Class24_Sub2(arg7, 4, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
				}
				Static29.method606(arg2, arg4, arg5, local181, local277, null, Static88.anIntArray196[arg8], 0, 0, 0, local198);
			} else {
				@Pc(1573) long local1573;
				@Pc(1609) Class24 local1609;
				@Pc(1622) Class2_Sub2_Sub13 local1622;
				if (arg6 == 5) {
					local1000 = 16;
					local1573 = Static213.method3230(arg2, arg4, arg5);
					if (local1573 != 0L) {
						local1000 = Static99.method1689((int) (local1573 >>> 32) & Integer.MAX_VALUE).anInt2675;
					}
					if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
						local1622 = local53.method2045(local155, 4, local181, local147, arg3, arg8, local112);
						local1609 = local1622.aClass24_2;
					} else {
						local1609 = new Class24_Sub2(arg7, 4, arg8, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
					}
					Static29.method606(arg2, arg4, arg5, local181, local1609, null, Static88.anIntArray196[arg8], 0, Static94.anIntArray202[arg8] * local1000, local1000 * Static169.anIntArray326[arg8], local198);
				} else if (arg6 == 6) {
					local1000 = 8;
					local1573 = Static213.method3230(arg2, arg4, arg5);
					if (local1573 != 0L) {
						local1000 = Static99.method1689(Integer.MAX_VALUE & (int) (local1573 >>> 32)).anInt2675 / 2;
					}
					if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
						local1622 = local53.method2045(local155, 4, local181, local147, arg3, arg8 + 4, local112);
						local1609 = local1622.aClass24_2;
					} else {
						local1609 = new Class24_Sub2(arg7, 4, arg8 + 4, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
					}
					Static29.method606(arg2, arg4, arg5, local181, local1609, null, 256, arg8, local1000 * Static133.anIntArray286[arg8], Static159.anIntArray312[arg8] * local1000, local198);
				} else if (arg6 == 7) {
					@Pc(1746) int local1746 = arg8 + 2 & 0x3;
					if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
						@Pc(1786) Class2_Sub2_Sub13 local1786 = local53.method2045(local155, 4, local181, local147, arg3, local1746 + 4, local112);
						local277 = local1786.aClass24_2;
					} else {
						local277 = new Class24_Sub2(arg7, 4, local1746 + 4, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
					}
					Static29.method606(arg2, arg4, arg5, local181, local277, null, 256, local1746, 0, 0, local198);
				} else if (arg6 == 8) {
					local1573 = Static213.method3230(arg2, arg4, arg5);
					@Pc(1818) int local1818 = arg8 + 2 & 0x3;
					local1000 = 8;
					if (local1573 != 0L) {
						local1000 = Static99.method1689((int) (local1573 >>> 32) & Integer.MAX_VALUE).anInt2675 / 2;
					}
					@Pc(1880) Class24 local1880;
					if (local53.anInt2673 == -1 && local53.anIntArray264 == null) {
						@Pc(1895) Class2_Sub2_Sub13 local1895 = local53.method2045(local155, 4, local181, local147, arg3, arg8 + 4, local112);
						local1609 = local1895.aClass24_2;
						@Pc(1911) Class2_Sub2_Sub13 local1911 = local53.method2045(local155, 4, local181, local147, arg3, local1818 + 4, local112);
						local1880 = local1911.aClass24_2;
					} else {
						local1609 = new Class24_Sub2(arg7, 4, arg8 + 4, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
						local1880 = new Class24_Sub2(arg7, 4, local1818 + 4, arg0, arg4, arg5, local53.anInt2673, local53.aBoolean130, null);
					}
					Static29.method606(arg2, arg4, arg5, local181, local1609, local1880, 256, arg8, local1000 * Static133.anIntArray286[arg8], Static159.anIntArray312[arg8] * local1000, local198);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass105_1 = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V")
	public static void method1644(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) int local3 = 0;
		@Pc(5) Class76[] local5 = Static163.aClass76Array1;
		while (local3 < local5.length) {
			@Pc(11) Class76 local11 = local5[local3];
			if (local11 != null && local11.anInt3018 == 2) {
				Static124.method1908(local11.anInt3016 + (local11.anInt3015 - Static123.anInt2755 << 7), local11.anInt3011 * 2, arg2 >> 1, arg3 >> 1, local11.anInt3020 + (local11.anInt3017 - Static2.anInt57 << 7));
				if (Static152.anInt3095 > -1 && Static13.anInt386 % 20 < 10) {
					Static170.aClass2_Sub2_Sub17Array9[local11.anInt3013].method1905(arg1 + Static152.anInt3095 - 12, arg0 + -28 + Static62.anInt1509);
				}
			}
			local3++;
		}
	}
}
