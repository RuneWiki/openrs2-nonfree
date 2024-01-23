import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "[[Lclient!ko;")
	public static Class100[][] aClass100ArrayArray1;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!ek;")
	public static Class42 aClass42_22;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "[Lclient!fc;")
	public static Class31_Sub1[] aClass31_Sub1Array2 = new Class31_Sub1[29];

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Lclient!sf;")
	public static Class157 aClass157_20 = new Class157(2);

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)Z")
	public static boolean method1596() {
		return Static73.anInt1821 == 0 ? Static185.aClass2_Sub3_Sub1_7.method212() : true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method1597(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static222.anInt4524 + arg0 * Static20.anInt418 >> 16;
		@Pc(19) int local19 = arg3 * Static20.anInt418 - arg0 * Static222.anInt4524 >> 16;
		@Pc(29) int local29 = arg1 * Static192.anInt4024 + local19 * Static100.anInt2374 >> 16;
		@Pc(39) int local39 = arg1 * Static100.anInt2374 - local19 * Static192.anInt4024 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static192.anInt4024 + local19 * Static100.anInt2374 >> 16;
		@Pc(76) int local76 = arg2 * Static100.anInt2374 - local19 * Static192.anInt4024 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static246.anInt4876 && local87 < Static246.anInt4876) {
			return false;
		} else if (local50 > Static185.anInt5539 && local87 > Static185.anInt5539) {
			return false;
		} else if (local56 < Static185.anInt5543 && local93 < Static185.anInt5543) {
			return false;
		} else {
			return local56 <= Static263.anInt5196 || local93 <= Static263.anInt5196;
		}
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	public static void method1600() {
		Static49.method914();
		Static232.method3771();
		Static25.method488();
		Static146.method2598();
		Static24.method476();
		Static29.method568();
		Static80.method1474();
		Static301.method4578();
		Static255.method4014();
		Static255.method4016();
		Static255.method4015();
		Static209.method3507();
		Static37.method709();
		Static277.method4338();
		Static280.method4384();
		Static247.method1329();
		Static29.method565();
		Static101.method1741();
		Static71.method1388();
		Static102.method1748();
		Static101.method1742();
		Static263.aClass157_42.method4033();
		Static89.aClass157_18.method4033();
		Static87.aClass157_16.method4033();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static25.method486(Static275.anIntArrayArray37[arg1], arg4 - arg0, arg4 - -arg0, arg3);
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(27) int local27 = arg2;
		@Pc(31) int local31 = arg0 * arg0;
		@Pc(35) int local35 = local25 << 1;
		@Pc(39) int local39 = arg2 << 1;
		@Pc(43) int local43 = local31 << 1;
		@Pc(51) int local51 = local35 + (1 - local39) * local31;
		@Pc(55) int local55 = local31 << 2;
		@Pc(59) int local59 = local25 << 2;
		@Pc(67) int local67 = local35 * 3;
		@Pc(75) int local75 = local25 - local43 * (local39 - 1);
		@Pc(81) int local81 = local59;
		@Pc(89) int local89 = local43 * ((arg2 << 1) - 3);
		@Pc(95) int local95 = local55 * (arg2 - 1);
		while (local27 > 0) {
			local27--;
			@Pc(104) int local104 = arg1 - local27;
			@Pc(108) int local108 = arg1 + local27;
			if (local51 < 0) {
				while (local51 < 0) {
					local17++;
					local75 += local81;
					local81 += local59;
					local51 += local67;
					local67 += local59;
				}
			}
			if (local75 < 0) {
				local51 += local67;
				local75 += local81;
				local67 += local59;
				local81 += local59;
				local17++;
			}
			local51 += -local95;
			local75 += -local89;
			local95 -= local55;
			local89 -= local55;
			@Pc(181) int local181 = arg4 + local17;
			@Pc(185) int local185 = arg4 - local17;
			Static25.method486(Static275.anIntArrayArray37[local104], local185, local181, arg3);
			Static25.method486(Static275.anIntArrayArray37[local108], local185, local181, arg3);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([[B[[BI[[B[[F[Lclient!sd;II[[B[[F[[F[[I)V")
	public static void method1603(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) Class156[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) int[][] arg10) {
		for (@Pc(3) int local3 = 0; local3 < arg5; local3++) {
			@Pc(14) Class156 local14 = arg4[local3];
			if (local14.anInt4993 == arg6) {
				@Pc(23) Class183 local23 = new Class183();
				@Pc(25) int local25 = 0;
				@Pc(34) int local34 = (local14.anInt4995 >> 7) - local14.anInt4977;
				@Pc(43) int local43 = (local14.anInt4984 >> 7) - local14.anInt4977;
				if (local43 < 0) {
					local25 = -local43;
					local43 = 0;
				}
				@Pc(60) int local60 = local14.anInt4977 + (local14.anInt4984 >> 7);
				if (local60 > 103) {
					local60 = 103;
				}
				@Pc(70) int local70;
				@Pc(82) short local82;
				@Pc(88) int local88;
				@Pc(96) int local96;
				@Pc(114) int local114;
				@Pc(133) int local133;
				@Pc(314) boolean local314;
				@Pc(341) int local341;
				for (local70 = local43; local70 <= local60; local70++) {
					local82 = local14.aShortArray68[local25];
					local88 = (local82 >> 8) + local34;
					local96 = (local82 & 0xFF) + local88 - 1;
					if (local96 > 103) {
						local96 = 103;
					}
					if (local88 < 0) {
						local88 = 0;
					}
					for (local114 = local88; local114 <= local96; local114++) {
						@Pc(125) int local125 = arg7[local114][local70] & 0xFF;
						local133 = arg0[local114][local70] & 0xFF;
						@Pc(135) boolean local135 = false;
						@Pc(145) Class127 local145;
						@Pc(169) int[] local169;
						@Pc(238) int[] local238;
						if (local125 == 0) {
							if (local133 == 0) {
								continue;
							}
							local145 = Static7.method121(local133 - 1);
							if (local145.anInt4281 == -1) {
								continue;
							}
							if (arg2[local114][local70] != 0) {
								local169 = Static12.anIntArrayArray1[arg2[local114][local70]];
								local23.anInt5700 += ((local169.length >> 1) - 2) * 3;
								local23.anInt5699 += local169.length >> 1;
								continue;
							}
						} else if (local133 != 0) {
							local145 = Static7.method121(local133 - 1);
							@Pc(217) byte local217;
							if (local145.anInt4281 == -1) {
								local217 = arg2[local114][local70];
								if (local217 != 0) {
									local238 = Static189.anIntArrayArray27[local217];
									local23.anInt5700 += ((local238.length >> 1) - 2) * 3;
									local23.anInt5699 += local238.length >> 1;
								}
								continue;
							}
							local217 = arg2[local114][local70];
							if (local217 != 0) {
								local135 = true;
							}
						}
						@Pc(267) Class170 local267 = Static278.method4341(arg6, local114, local70);
						if (local267 != null) {
							@Pc(278) int local278 = (int) (local267.aLong195 >> 14) & 0x3F;
							if (local278 == 9) {
								local238 = null;
								@Pc(292) int local292 = (int) (local267.aLong195 >> 20) & 0x3;
								@Pc(305) boolean local305;
								@Pc(329) short local329;
								@Pc(335) int local335;
								if ((local292 & 0x1) == 0) {
									local305 = local114 - 1 >= local88;
									local314 = local114 + 1 <= local96;
									if (!local305 && local70 + 1 <= local60) {
										local329 = local14.aShortArray68[local25 + 1];
										local335 = (local329 >> 8) + local34;
										local341 = local335 + (local329 & 0xFF);
										local305 = local335 < local114 && local341 > local114;
									}
									if (!local314 && local43 <= local70 - 1) {
										local329 = local14.aShortArray68[local25 - 1];
										local335 = (local329 >> 8) + local34;
										local341 = (local329 & 0xFF) + local335;
										local314 = local114 > local335 && local341 > local114;
									}
									if (local305 && local314) {
										local238 = Static12.anIntArrayArray1[0];
									} else if (local305) {
										local238 = Static12.anIntArrayArray1[1];
									} else if (local314) {
										local238 = Static12.anIntArrayArray1[1];
									}
								} else {
									local305 = local114 - 1 >= local88;
									local314 = local96 >= local114 + 1;
									if (!local305 && local43 <= local70 - 1) {
										local329 = local14.aShortArray68[local25 - 1];
										local335 = local34 + (local329 >> 8);
										local341 = (local329 & 0xFF) + local335;
										local305 = local335 < local114 && local341 > local114;
									}
									if (!local314 && local60 >= local70 + 1) {
										local329 = local14.aShortArray68[local25 + 1];
										local335 = (local329 >> 8) + local34;
										local341 = (local329 & 0xFF) + local335;
										local314 = local335 < local114 && local114 < local341;
									}
									if (local305 && local314) {
										local238 = Static12.anIntArrayArray1[0];
									} else if (local305) {
										local238 = Static12.anIntArrayArray1[1];
									} else if (local314) {
										local238 = Static12.anIntArrayArray1[1];
									}
								}
								if (local238 != null) {
									local23.anInt5700 += (local238.length >> 1) * 3 - 6;
									local23.anInt5699 += local238.length >> 1;
								}
								continue;
							}
						}
						if (local135) {
							local238 = Static189.anIntArrayArray27[arg2[local114][local70]];
							local169 = Static12.anIntArrayArray1[arg2[local114][local70]];
							local23.anInt5700 += (local169.length >> 1) * 3 - 6;
							local23.anInt5700 += (local238.length >> 1) * 3 - 6;
							local23.anInt5699 += local169.length >> 1;
							local23.anInt5699 += local238.length >> 1;
						} else {
							local169 = Static12.anIntArrayArray1[0];
							local23.anInt5700 += (local169.length >> 1) * 3 - 6;
							local23.anInt5699 += local169.length >> 1;
						}
					}
					local25++;
				}
				local25 = 0;
				local23.method4497();
				if ((local14.anInt4984 >> 7) - local14.anInt4977 < 0) {
					local25 = local14.anInt4977 - (local14.anInt4984 >> 7);
				}
				for (local70 = local43; local70 <= local60; local70++) {
					local82 = local14.aShortArray68[local25];
					local88 = local34 + (local82 >> 8);
					local96 = (local82 & 0xFF) + local88 - 1;
					if (local88 < 0) {
						local88 = 0;
					}
					if (local96 > 103) {
						local96 = 103;
					}
					for (local114 = local88; local114 <= local96; local114++) {
						@Pc(758) byte local758 = arg1[local114][local70];
						local133 = arg7[local114][local70] & 0xFF;
						@Pc(774) int local774 = arg0[local114][local70] & 0xFF;
						@Pc(776) boolean local776 = false;
						@Pc(793) Class127 local793;
						if (local133 == 0) {
							if (local774 == 0) {
								continue;
							}
							local793 = Static7.method121(local774 - 1);
							if (local793.anInt4281 == -1) {
								continue;
							}
							if (arg2[local114][local70] != 0) {
								Static86.method1543(Static12.anIntArrayArray1[arg2[local114][local70]], local70, local23, local14, arg9, local114, arg10, arg8, arg1[local114][local70], arg3);
								continue;
							}
						} else if (local774 != 0) {
							local793 = Static7.method121(local774 - 1);
							if (local793.anInt4281 == -1) {
								Static86.method1543(Static189.anIntArrayArray27[arg2[local114][local70]], local70, local23, local14, arg9, local114, arg10, arg8, arg1[local114][local70], arg3);
								continue;
							}
							@Pc(828) byte local828 = arg2[local114][local70];
							if (local828 != 0) {
								local776 = true;
							}
						}
						@Pc(891) Class170 local891 = Static278.method4341(arg6, local114, local70);
						if (local891 != null) {
							@Pc(902) int local902 = (int) (local891.aLong195 >> 14) & 0x3F;
							if (local902 == 9) {
								@Pc(908) int[] local908 = null;
								@Pc(916) int local916 = (int) (local891.aLong195 >> 20) & 0x3;
								@Pc(972) int local972;
								@Pc(941) boolean local941;
								@Pc(959) short local959;
								if ((local916 & 0x1) == 0) {
									local941 = local114 + 1 <= local96;
									local314 = local114 - 1 >= local88;
									if (!local314 && local70 + 1 <= local60) {
										local959 = local14.aShortArray68[local25 + 1];
										local341 = (local959 >> 8) + local34;
										local972 = (local959 & 0xFF) + local341;
										local314 = local341 < local114 && local972 > local114;
									}
									if (!local941 && local43 <= local70 - 1) {
										local959 = local14.aShortArray68[local25 - 1];
										local341 = local34 + (local959 >> 8);
										local972 = (local959 & 0xFF) + local341;
										local941 = local114 > local341 && local114 < local972;
									}
									if (local314 && local941) {
										local908 = Static12.anIntArrayArray1[0];
									} else if (local314) {
										local758 = 1;
										local908 = Static12.anIntArrayArray1[1];
									} else if (local941) {
										local908 = Static12.anIntArrayArray1[1];
										local758 = 3;
									}
								} else {
									local314 = local114 - 1 >= local88;
									local941 = local114 + 1 <= local96;
									if (!local314 && local43 <= local70 - 1) {
										local959 = local14.aShortArray68[local25 - 1];
										local341 = local34 + (local959 >> 8);
										local972 = local341 + (local959 & 0xFF);
										local314 = local114 > local341 && local114 < local972;
									}
									if (!local941 && local70 + 1 <= local60) {
										local959 = local14.aShortArray68[local25 + 1];
										local341 = local34 + (local959 >> 8);
										local972 = local341 + (local959 & 0xFF);
										local941 = local341 < local114 && local114 < local972;
									}
									if (local314 && local941) {
										local908 = Static12.anIntArrayArray1[0];
									} else if (local314) {
										local758 = 0;
										local908 = Static12.anIntArrayArray1[1];
									} else if (local941) {
										local758 = 2;
										local908 = Static12.anIntArrayArray1[1];
									}
								}
								if (local908 != null) {
									Static86.method1543(local908, local70, local23, local14, arg9, local114, arg10, arg8, local758, arg3);
								}
								continue;
							}
						}
						if (local776) {
							Static86.method1543(Static189.anIntArrayArray27[arg2[local114][local70]], local70, local23, local14, arg9, local114, arg10, arg8, arg1[local114][local70], arg3);
							Static86.method1543(Static12.anIntArrayArray1[arg2[local114][local70]], local70, local23, local14, arg9, local114, arg10, arg8, arg1[local114][local70], arg3);
						} else {
							Static86.method1543(Static12.anIntArrayArray1[0], local70, local23, local14, arg9, local114, arg10, arg8, local758, arg3);
						}
					}
					local25++;
				}
				if (local23.anInt5702 > 0 && local23.anInt5701 > 0) {
					local23.method4495();
					local14.aClass183_1 = local23;
				}
			}
		}
	}
}
