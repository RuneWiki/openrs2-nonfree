import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lclient!da;")
	public static Class15 aClass15_67;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lclient!k;")
	public static Class33 aClass33_42;

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1199 = Static24.method441("headicons_prayer");

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1203 = Static24.method441("Attack");

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1200 = aClass65_1203;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1201 = Static24.method441("Chat panel redrawn");

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "[I")
	public static int[] anIntArray395 = new int[5];

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1202 = Static24.method441(" @whi@(X");

	@OriginalMember(owner = "client!sd", name = "vb", descriptor = "I")
	public static int anInt2688 = -1;

	@OriginalMember(owner = "client!sd", name = "wb", descriptor = "I")
	public static int anInt2689 = 0;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public static void method1648() {
		aClass65_1200 = null;
		anIntArray397 = null;
		aClass15_67 = null;
		aClass33_42 = null;
		aClass65_1202 = null;
		aClass65_1201 = null;
		aClass65_1199 = null;
		anIntArray394 = null;
		anIntArray395 = null;
		aClass65_1203 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!fc;IIBILclient!uc;)V")
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class58 arg7) {
		if (Static4.aBoolean16 && (Static50.aByteArrayArrayArray6[0][arg4][arg5] & 0x2) == 0) {
			if ((Static50.aByteArrayArrayArray6[arg1][arg4][arg5] & 0x10) != 0) {
				return;
			}
			if (Static110.method1847(arg4, arg5, arg1) != Static95.anInt1972) {
				return;
			}
		}
		if (Static106.anInt2837 > arg1) {
			Static106.anInt2837 = arg1;
		}
		@Pc(57) int local57 = Static61.anIntArrayArrayArray6[arg1][arg4][arg5];
		@Pc(67) int local67 = Static61.anIntArrayArrayArray6[arg1][arg4 + 1][arg5];
		@Pc(79) int local79 = Static61.anIntArrayArrayArray6[arg1][arg4 + 1][arg5 + 1];
		@Pc(89) int local89 = Static61.anIntArrayArrayArray6[arg1][arg4][arg5 + 1];
		@Pc(100) int local100 = local89 + local57 + local67 + local79 >> 2;
		@Pc(112) int local112 = (arg5 << 7) + arg4 + (arg0 << 14) + 1073741824;
		@Pc(116) Class2_Sub1_Sub14 local116 = Static29.method518(arg0);
		if (local116.anInt2616 == 0) {
			local112 += Integer.MIN_VALUE;
		}
		@Pc(129) int local129 = (arg2 << 6) + arg6;
		if (local116.anInt2644 == 1) {
			local129 += 256;
		}
		if (local116.method1618()) {
			Static48.method843(arg4, arg5, local116, arg2, arg1);
		}
		@Pc(183) Class2_Sub1_Sub1 local183;
		if (arg6 != 22) {
			@Pc(276) int local276;
			if (arg6 == 10 || arg6 == 11) {
				if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
					local183 = local116.method1613(local89, local57, arg2, 10, local79, local67);
				} else {
					local183 = new Class2_Sub1_Sub1_Sub4(arg0, 10, arg2, local57, local67, local79, local89, local116.anInt2611, true);
				}
				if (local183 != null) {
					@Pc(273) int local273;
					if (arg2 == 1 || arg2 == 3) {
						local273 = local116.anInt2621;
						local276 = local116.anInt2634;
					} else {
						local273 = local116.anInt2634;
						local276 = local116.anInt2621;
					}
					@Pc(286) int local286 = 0;
					if (arg6 == 11) {
						local286 += 256;
					}
					if (arg3.method625(arg1, arg4, arg5, local100, local276, local273, local183, local286, local112, local129) && local116.aBoolean137) {
						@Pc(314) Class2_Sub1_Sub1_Sub6 local314;
						if (local183 instanceof Class2_Sub1_Sub1_Sub6) {
							local314 = (Class2_Sub1_Sub1_Sub6) local183;
						} else {
							local314 = local116.method1613(local89, local57, arg2, 10, local79, local67);
						}
						if (local314 != null) {
							for (@Pc(330) int local330 = 0; local330 <= local276; local330++) {
								for (@Pc(334) int local334 = 0; local334 <= local273; local334++) {
									@Pc(341) int local341 = local314.method1523() / 4;
									if (local341 > 30) {
										local341 = 30;
									}
									if (local341 > Static100.aByteArrayArrayArray9[arg1][local330 + arg4][local334 + arg5]) {
										Static100.aByteArrayArrayArray9[arg1][local330 + arg4][local334 + arg5] = (byte) local341;
									}
								}
							}
						}
					}
				}
				if (local116.aBoolean140 && arg7 != null) {
					arg7.method1726(local116.anInt2634, local116.anInt2621, local116.aBoolean139, arg5, arg4, arg2);
				}
			} else if (arg6 >= 12) {
				if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
					local183 = local116.method1613(local89, local57, arg2, arg6, local79, local67);
				} else {
					local183 = new Class2_Sub1_Sub1_Sub4(arg0, arg6, arg2, local57, local67, local79, local89, local116.anInt2611, true);
				}
				arg3.method625(arg1, arg4, arg5, local100, 1, 1, local183, 0, local112, local129);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
					Static100.anIntArrayArrayArray7[arg1][arg4][arg5] |= 0x924;
				}
				if (local116.aBoolean140 && arg7 != null) {
					arg7.method1726(local116.anInt2634, local116.anInt2621, local116.aBoolean139, arg5, arg4, arg2);
				}
			} else if (arg6 == 0) {
				if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
					local183 = local116.method1613(local89, local57, arg2, 0, local79, local67);
				} else {
					local183 = new Class2_Sub1_Sub1_Sub4(arg0, 0, arg2, local57, local67, local79, local89, local116.anInt2611, true);
				}
				arg3.method600(arg1, arg4, arg5, local100, local183, null, Static28.anIntArray112[arg2], 0, local112, local129);
				if (arg2 == 0) {
					if (local116.aBoolean137) {
						Static100.aByteArrayArrayArray9[arg1][arg4][arg5] = 50;
						Static100.aByteArrayArrayArray9[arg1][arg4][arg5 + 1] = 50;
					}
					if (local116.aBoolean141) {
						Static100.anIntArrayArrayArray7[arg1][arg4][arg5] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local116.aBoolean137) {
						Static100.aByteArrayArrayArray9[arg1][arg4][arg5 + 1] = 50;
						Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5 + 1] = 50;
					}
					if (local116.aBoolean141) {
						Static100.anIntArrayArrayArray7[arg1][arg4][arg5 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local116.aBoolean137) {
						Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5] = 50;
						Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5 + 1] = 50;
					}
					if (local116.aBoolean141) {
						Static100.anIntArrayArrayArray7[arg1][arg4 + 1][arg5] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local116.aBoolean137) {
						Static100.aByteArrayArrayArray9[arg1][arg4][arg5] = 50;
						Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5] = 50;
					}
					if (local116.aBoolean141) {
						Static100.anIntArrayArrayArray7[arg1][arg4][arg5] |= 0x492;
					}
				}
				if (local116.aBoolean140 && arg7 != null) {
					arg7.method1735(arg5, arg6, arg4, local116.aBoolean139, arg2);
				}
				if (local116.anInt2631 != 16) {
					arg3.method607(arg1, arg4, arg5, local116.anInt2631);
				}
			} else if (arg6 == 1) {
				if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
					local183 = local116.method1613(local89, local57, arg2, 1, local79, local67);
				} else {
					local183 = new Class2_Sub1_Sub1_Sub4(arg0, 1, arg2, local57, local67, local79, local89, local116.anInt2611, true);
				}
				arg3.method600(arg1, arg4, arg5, local100, local183, null, Static80.anIntArray307[arg2], 0, local112, local129);
				if (local116.aBoolean137) {
					if (arg2 == 0) {
						Static100.aByteArrayArrayArray9[arg1][arg4][arg5 + 1] = 50;
					} else if (arg2 == 1) {
						Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5 + 1] = 50;
					} else if (arg2 == 2) {
						Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5] = 50;
					} else if (arg2 == 3) {
						Static100.aByteArrayArrayArray9[arg1][arg4][arg5] = 50;
					}
				}
				if (local116.aBoolean140 && arg7 != null) {
					arg7.method1735(arg5, arg6, arg4, local116.aBoolean139, arg2);
				}
			} else {
				@Pc(929) int local929;
				@Pc(958) Class2_Sub1_Sub1 local958;
				if (arg6 == 2) {
					local929 = arg2 + 1 & 0x3;
					@Pc(948) Class2_Sub1_Sub1 local948;
					if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
						local948 = local116.method1613(local89, local57, arg2 + 4, 2, local79, local67);
						local958 = local116.method1613(local89, local57, local929, 2, local79, local67);
					} else {
						local948 = new Class2_Sub1_Sub1_Sub4(arg0, 2, arg2 + 4, local57, local67, local79, local89, local116.anInt2611, true);
						local958 = new Class2_Sub1_Sub1_Sub4(arg0, 2, local929, local57, local67, local79, local89, local116.anInt2611, true);
					}
					arg3.method600(arg1, arg4, arg5, local100, local948, local958, Static28.anIntArray112[arg2], Static28.anIntArray112[local929], local112, local129);
					if (local116.aBoolean141) {
						if (arg2 == 0) {
							Static100.anIntArrayArrayArray7[arg1][arg4][arg5] |= 0x249;
							Static100.anIntArrayArrayArray7[arg1][arg4][arg5 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static100.anIntArrayArrayArray7[arg1][arg4][arg5 + 1] |= 0x492;
							Static100.anIntArrayArrayArray7[arg1][arg4 + 1][arg5] |= 0x249;
						} else if (arg2 == 2) {
							Static100.anIntArrayArrayArray7[arg1][arg4 + 1][arg5] |= 0x249;
							Static100.anIntArrayArrayArray7[arg1][arg4][arg5] |= 0x492;
						} else if (arg2 == 3) {
							Static100.anIntArrayArrayArray7[arg1][arg4][arg5] |= 0x492;
							Static100.anIntArrayArrayArray7[arg1][arg4][arg5] |= 0x249;
						}
					}
					if (local116.aBoolean140 && arg7 != null) {
						arg7.method1735(arg5, arg6, arg4, local116.aBoolean139, arg2);
					}
					if (local116.anInt2631 != 16) {
						arg3.method607(arg1, arg4, arg5, local116.anInt2631);
					}
				} else if (arg6 == 3) {
					if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
						local183 = local116.method1613(local89, local57, arg2, 3, local79, local67);
					} else {
						local183 = new Class2_Sub1_Sub1_Sub4(arg0, 3, arg2, local57, local67, local79, local89, local116.anInt2611, true);
					}
					arg3.method600(arg1, arg4, arg5, local100, local183, null, Static80.anIntArray307[arg2], 0, local112, local129);
					if (local116.aBoolean137) {
						if (arg2 == 0) {
							Static100.aByteArrayArrayArray9[arg1][arg4][arg5 + 1] = 50;
						} else if (arg2 == 1) {
							Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5 + 1] = 50;
						} else if (arg2 == 2) {
							Static100.aByteArrayArrayArray9[arg1][arg4 + 1][arg5] = 50;
						} else if (arg2 == 3) {
							Static100.aByteArrayArrayArray9[arg1][arg4][arg5] = 50;
						}
					}
					if (local116.aBoolean140 && arg7 != null) {
						arg7.method1735(arg5, arg6, arg4, local116.aBoolean139, arg2);
					}
				} else if (arg6 == 9) {
					if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
						local183 = local116.method1613(local89, local57, arg2, arg6, local79, local67);
					} else {
						local183 = new Class2_Sub1_Sub1_Sub4(arg0, arg6, arg2, local57, local67, local79, local89, local116.anInt2611, true);
					}
					arg3.method625(arg1, arg4, arg5, local100, 1, 1, local183, 0, local112, local129);
					if (local116.aBoolean140 && arg7 != null) {
						arg7.method1726(local116.anInt2634, local116.anInt2621, local116.aBoolean139, arg5, arg4, arg2);
					}
				} else {
					if (local116.aBoolean138) {
						if (arg2 == 1) {
							local929 = local89;
							local89 = local79;
							local79 = local67;
							local67 = local57;
							local57 = local929;
						} else if (arg2 == 2) {
							local929 = local89;
							local89 = local67;
							local67 = local929;
							local929 = local79;
							local79 = local57;
							local57 = local929;
						} else if (arg2 == 3) {
							local929 = local89;
							local89 = local57;
							local57 = local67;
							local67 = local79;
							local79 = local929;
						}
					}
					if (arg6 == 4) {
						if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
							local183 = local116.method1613(local89, local57, 0, 4, local79, local67);
						} else {
							local183 = new Class2_Sub1_Sub1_Sub4(arg0, 4, 0, local57, local67, local79, local89, local116.anInt2611, true);
						}
						arg3.method605(arg1, arg4, arg5, local100, local183, Static28.anIntArray112[arg2], arg2 * 512, 0, 0, local112, local129);
					} else if (arg6 == 5) {
						local276 = arg3.method581(arg1, arg4, arg5);
						local929 = 16;
						if (local276 > 0) {
							local929 = Static29.method518(local276 >> 14 & 0x7FFF).anInt2631;
						}
						if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
							local958 = local116.method1613(local89, local57, 0, 4, local79, local67);
						} else {
							local958 = new Class2_Sub1_Sub1_Sub4(arg0, 4, 0, local57, local67, local79, local89, local116.anInt2611, true);
						}
						arg3.method605(arg1, arg4, arg5, local100, local958, Static28.anIntArray112[arg2], arg2 * 512, Static92.anIntArray377[arg2] * local929, local929 * Static46.anIntArray193[arg2], local112, local129);
					} else if (arg6 == 6) {
						if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
							local183 = local116.method1613(local89, local57, 0, 4, local79, local67);
						} else {
							local183 = new Class2_Sub1_Sub1_Sub4(arg0, 4, 0, local57, local67, local79, local89, local116.anInt2611, true);
						}
						arg3.method605(arg1, arg4, arg5, local100, local183, 256, arg2, 0, 0, local112, local129);
					} else if (arg6 == 7) {
						if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
							local183 = local116.method1613(local89, local57, 0, 4, local79, local67);
						} else {
							local183 = new Class2_Sub1_Sub1_Sub4(arg0, 4, 0, local57, local67, local79, local89, local116.anInt2611, true);
						}
						arg3.method605(arg1, arg4, arg5, local100, local183, 512, arg2, 0, 0, local112, local129);
					} else if (arg6 == 8) {
						if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
							local183 = local116.method1613(local89, local57, 0, 4, local79, local67);
						} else {
							local183 = new Class2_Sub1_Sub1_Sub4(arg0, 4, 0, local57, local67, local79, local89, local116.anInt2611, true);
						}
						arg3.method605(arg1, arg4, arg5, local100, local183, 768, arg2, 0, 0, local112, local129);
					}
				}
			}
		} else if (!Static4.aBoolean16 || local116.anInt2616 != 0 || local116.aBoolean143) {
			if (local116.anInt2611 == -1 && local116.anIntArray384 == null) {
				local183 = local116.method1613(local89, local57, arg2, 22, local79, local67);
			} else {
				local183 = new Class2_Sub1_Sub1_Sub4(arg0, 22, arg2, local57, local67, local79, local89, local116.anInt2611, true);
			}
			arg3.method582(arg1, arg4, arg5, local100, local183, local112, local129);
			if (local116.aBoolean140 && local116.anInt2616 == 1 && arg7 != null) {
				arg7.method1728(arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
	public static void method1650() {
		while (Static52.method928()) {
			if (Static98.anInt2770 != -1 && Static98.anInt2770 == Static99.anInt2544) {
				if (Static33.anInt2315 == 85 && Static8.aClass65_142.method1760() > 0) {
					Static8.aClass65_142 = Static8.aClass65_142.method1772(Static8.aClass65_142.method1760() - 1, 0);
				}
				if ((Static13.method278(Static63.anInt1902) || Static63.anInt1902 == 32) && Static8.aClass65_142.method1760() < 12) {
					Static8.aClass65_142 = Static8.aClass65_142.method1793(Static63.anInt1902);
				}
			} else {
				@Pc(118) int local118;
				if (Static85.aBoolean125) {
					if (Static33.anInt2315 == 85 && Static8.aClass65_148.method1760() > 0) {
						Static8.aClass65_148 = Static8.aClass65_148.method1772(Static8.aClass65_148.method1760() - 1, 0);
						Static107.aBoolean156 = true;
					}
					if (Static90.method836(Static63.anInt1902) && Static8.aClass65_148.method1760() < 80) {
						Static8.aClass65_148 = Static8.aClass65_148.method1793(Static63.anInt1902);
						Static107.aBoolean156 = true;
					}
					if (Static33.anInt2315 == 84) {
						Static107.aBoolean156 = true;
						Static85.aBoolean125 = false;
						@Pc(836) long local836;
						if (Static15.anInt474 == 1) {
							local836 = Static8.aClass65_148.method1790();
							Static47.method826(local836);
						}
						if (Static15.anInt474 == 2 && Static32.anInt1047 > 0) {
							local836 = Static8.aClass65_148.method1790();
							Static75.method1295(local836);
						}
						if (Static15.anInt474 == 3 && Static8.aClass65_148.method1760() > 0) {
							Static12.aClass2_Sub8_Sub1_8.method1425(179);
							Static12.aClass2_Sub8_Sub1_8.method1375(0);
							local118 = Static12.aClass2_Sub8_Sub1_8.anInt2342;
							Static12.aClass2_Sub8_Sub1_8.method1389(Static104.aLong81);
							Static84.method1445(Static12.aClass2_Sub8_Sub1_8, Static8.aClass65_148);
							Static12.aClass2_Sub8_Sub1_8.method1404(Static12.aClass2_Sub8_Sub1_8.anInt2342 - local118);
							if (Static42.anInt1350 == 2) {
								Static42.anInt1350 = 1;
								Static81.aBoolean158 = true;
								Static12.aClass2_Sub8_Sub1_8.method1425(0);
								Static12.aClass2_Sub8_Sub1_8.method1375(Static103.anInt2811);
								Static12.aClass2_Sub8_Sub1_8.method1375(Static42.anInt1350);
								Static12.aClass2_Sub8_Sub1_8.method1375(Static85.anInt2454);
							}
						}
						if (Static15.anInt474 == 4 && Static93.anInt2629 < 100) {
							local836 = Static8.aClass65_148.method1790();
							Static2.method66(local836);
						}
						if (Static15.anInt474 == 5 && Static93.anInt2629 > 0) {
							local836 = Static8.aClass65_148.method1790();
							Static78.method361(local836);
						}
					}
				} else if (Static55.anInt1673 == 1) {
					if (Static33.anInt2315 == 85 && Static8.aClass65_144.method1760() > 0) {
						Static8.aClass65_144 = Static8.aClass65_144.method1772(Static8.aClass65_144.method1760() - 1, 0);
						Static107.aBoolean156 = true;
					}
					if (Static47.method818(Static63.anInt1902) && Static8.aClass65_144.method1760() < 10) {
						Static8.aClass65_144 = Static8.aClass65_144.method1793(Static63.anInt1902);
						Static107.aBoolean156 = true;
					}
					if (Static33.anInt2315 == 84) {
						if (Static8.aClass65_144.method1760() > 0) {
							local118 = 0;
							if (Static8.aClass65_144.method1762()) {
								local118 = Static8.aClass65_144.method1755();
							}
							Static12.aClass2_Sub8_Sub1_8.method1425(178);
							Static12.aClass2_Sub8_Sub1_8.method1370(local118);
						}
						Static107.aBoolean156 = true;
						Static55.anInt1673 = 0;
					}
				} else if (Static55.anInt1673 == 2) {
					if (Static33.anInt2315 == 85 && Static8.aClass65_144.method1760() > 0) {
						Static8.aClass65_144 = Static8.aClass65_144.method1772(Static8.aClass65_144.method1760() - 1, 0);
						Static107.aBoolean156 = true;
					}
					if ((Static13.method278(Static63.anInt1902) || Static63.anInt1902 == 32) && Static8.aClass65_144.method1760() < 12) {
						Static8.aClass65_144 = Static8.aClass65_144.method1793(Static63.anInt1902);
						Static107.aBoolean156 = true;
					}
					if (Static33.anInt2315 == 84) {
						if (Static8.aClass65_144.method1760() > 0) {
							Static12.aClass2_Sub8_Sub1_8.method1425(4);
							Static12.aClass2_Sub8_Sub1_8.method1389(Static8.aClass65_144.method1790());
						}
						Static55.anInt1673 = 0;
						Static107.aBoolean156 = true;
					}
				} else if (Static55.anInt1673 == 3) {
					if (Static33.anInt2315 == 85 && Static8.aClass65_144.method1760() > 0) {
						Static8.aClass65_144 = Static8.aClass65_144.method1772(Static8.aClass65_144.method1760() - 1, 0);
						Static107.aBoolean156 = true;
					}
					if (Static90.method836(Static63.anInt1902) && Static8.aClass65_144.method1760() < 40) {
						Static8.aClass65_144 = Static8.aClass65_144.method1793(Static63.anInt1902);
						Static107.aBoolean156 = true;
					}
				} else if (Static21.anInt2494 == -1 && anInt2688 == -1) {
					if (Static33.anInt2315 == 85 && Static8.aClass65_147.method1760() > 0) {
						Static8.aClass65_147 = Static8.aClass65_147.method1772(Static8.aClass65_147.method1760() - 1, 0);
						Static107.aBoolean156 = true;
					}
					if (Static90.method836(Static63.anInt1902) && Static8.aClass65_147.method1760() < 80) {
						Static8.aClass65_147 = Static8.aClass65_147.method1793(Static63.anInt1902);
						Static107.aBoolean156 = true;
					}
					if (Static33.anInt2315 == 84 && Static8.aClass65_147.method1760() > 0) {
						if (Static20.anInt629 == 2) {
							if (Static8.aClass65_147.method1781(Static99.aClass65_1146)) {
								Static7.method151();
							}
							if (Static8.aClass65_147.method1781(Static56.aClass65_762)) {
								Static45.aBoolean80 = true;
							}
							if (Static8.aClass65_147.method1781(Static67.aClass65_925)) {
								Static45.aBoolean80 = false;
							}
							if (Static8.aClass65_147.method1781(Static56.aClass65_761)) {
								for (local118 = 0; local118 < 4; local118++) {
									for (@Pc(280) int local280 = 1; local280 < 103; local280++) {
										for (@Pc(284) int local284 = 1; local284 < 103; local284++) {
											Static84.aClass58Array1[local118].anIntArrayArray25[local280][local284] = 0;
										}
									}
								}
							}
							if (Static8.aClass65_147.method1781(Static40.aClass65_565) && Static56.anInt1704 == 2) {
								throw new RuntimeException();
							}
							if (Static8.aClass65_147.method1781(Static97.aClass65_1205)) {
								Static9.aBoolean25 = true;
							}
						}
						if (Static8.aClass65_147.method1783(Static4.aClass65_94)) {
							Static12.aClass2_Sub8_Sub1_8.method1425(150);
							Static12.aClass2_Sub8_Sub1_8.method1375(Static8.aClass65_147.method1760() - 1);
							Static12.aClass2_Sub8_Sub1_8.method1417(Static8.aClass65_147.method1779(2));
						} else {
							@Pc(339) byte local339 = 0;
							@Pc(343) Class65 local343 = Static8.aClass65_147.method1776();
							@Pc(345) byte local345 = 0;
							if (local343.method1783(Static5.aClass65_114)) {
								local345 = 0;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static5.aClass65_114.method1760());
							} else if (local343.method1783(Static70.aClass65_973)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static70.aClass65_973.method1760());
								local345 = 1;
							} else if (local343.method1783(Static108.aClass65_1338)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static108.aClass65_1338.method1760());
								local345 = 2;
							} else if (local343.method1783(Static45.aClass65_604)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static45.aClass65_604.method1760());
								local345 = 3;
							} else if (local343.method1783(Static23.aClass65_322)) {
								local345 = 4;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static23.aClass65_322.method1760());
							} else if (local343.method1783(Static54.aClass65_732)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static54.aClass65_732.method1760());
								local345 = 5;
							} else if (local343.method1783(Static16.aClass65_256)) {
								local345 = 6;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static16.aClass65_256.method1760());
							} else if (local343.method1783(Static23.aClass65_316)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static23.aClass65_316.method1760());
								local345 = 7;
							} else if (local343.method1783(Static30.aClass65_456)) {
								local345 = 8;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static30.aClass65_456.method1760());
							} else if (local343.method1783(Static67.aClass65_924)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static67.aClass65_924.method1760());
								local345 = 9;
							} else if (local343.method1783(Static23.aClass65_315)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static23.aClass65_315.method1760());
								local345 = 10;
							} else if (local343.method1783(Static30.aClass65_448)) {
								local345 = 11;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static30.aClass65_448.method1760());
							}
							local343 = Static8.aClass65_147.method1776();
							if (local343.method1783(Static90.aClass65_622)) {
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static90.aClass65_622.method1760());
								local339 = 1;
							} else if (local343.method1783(Static95.aClass65_904)) {
								local339 = 2;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static95.aClass65_904.method1760());
							} else if (local343.method1783(Static4.aClass65_92)) {
								local339 = 3;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static4.aClass65_92.method1760());
							} else if (local343.method1783(Static74.aClass65_715)) {
								local339 = 4;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static74.aClass65_715.method1760());
							} else if (local343.method1783(Static67.aClass65_927)) {
								local339 = 5;
								Static8.aClass65_147 = Static8.aClass65_147.method1779(Static67.aClass65_927.method1760());
							}
							Static12.aClass2_Sub8_Sub1_8.method1425(13);
							Static12.aClass2_Sub8_Sub1_8.method1375(0);
							@Pc(628) int local628 = Static12.aClass2_Sub8_Sub1_8.anInt2342;
							Static12.aClass2_Sub8_Sub1_8.method1375(local345);
							Static12.aClass2_Sub8_Sub1_8.method1375(local339);
							Static84.method1445(Static12.aClass2_Sub8_Sub1_8, Static8.aClass65_147);
							Static12.aClass2_Sub8_Sub1_8.method1404(Static12.aClass2_Sub8_Sub1_8.anInt2342 - local628);
							if (Static103.anInt2811 == 2) {
								Static103.anInt2811 = 3;
								Static81.aBoolean158 = true;
								Static12.aClass2_Sub8_Sub1_8.method1425(0);
								Static12.aClass2_Sub8_Sub1_8.method1375(Static103.anInt2811);
								Static12.aClass2_Sub8_Sub1_8.method1375(Static42.anInt1350);
								Static12.aClass2_Sub8_Sub1_8.method1375(Static85.anInt2454);
							}
						}
						Static107.aBoolean156 = true;
						Static8.aClass65_147 = Static8.aClass65_145;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!qd;B)V")
	public static void method1651(@OriginalArg(0) Class2_Sub1_Sub4_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static77.anIntArray303.length; local9++) {
			Static77.anIntArray303[local9] = 0;
		}
		@Pc(34) int local34;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local34 = (int) ((double) 256 * 128.0D * Math.random());
			Static77.anIntArray303[local34] = (int) (Math.random() * 256.0D);
		}
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(64) int local64;
		for (local34 = 0; local34 < 20; local34++) {
			for (local51 = 1; local51 < 255; local51++) {
				for (local55 = 1; local55 < 127; local55++) {
					local64 = local55 + (local51 << 7);
					Static93.anIntArray388[local64] = (Static77.anIntArray303[local64 + 128] + Static77.anIntArray303[local64 - 128] + Static77.anIntArray303[local64 - 1] + Static77.anIntArray303[local64 + 1]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static77.anIntArray303;
			Static77.anIntArray303 = Static93.anIntArray388;
			Static93.anIntArray388 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local51 = 0;
		for (local55 = 0; local55 < arg0.anInt2450; local55++) {
			for (local64 = 0; local64 < arg0.anInt2448; local64++) {
				if (arg0.aByteArray62[local51++] != 0) {
					@Pc(145) int local145 = arg0.anInt2447 + local64 + 16;
					@Pc(152) int local152 = arg0.anInt2449 + local55 + 16;
					@Pc(158) int local158 = (local152 << 7) + local145;
					Static77.anIntArray303[local158] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	public static void method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Static4.aBoolean16) {
			arg4 = 0;
		}
		if (arg0 == Static84.anInt2408 && Static24.anInt721 == arg1 && arg4 == Static95.anInt1972) {
			return;
		}
		Static24.anInt721 = arg1;
		Static95.anInt1972 = arg4;
		Static84.anInt2408 = arg0;
		Static76.method1307(25);
		Static4.method94(null, false, Static39.aClass65_537);
		@Pc(39) int local39 = Static37.anInt1220;
		@Pc(41) int local41 = Static107.anInt2849;
		Static107.anInt2849 = arg0 * 8 - 48;
		@Pc(52) int local52 = Static107.anInt2849 - local41;
		Static37.anInt1220 = (arg1 - 6) * 8;
		@Pc(65) int local65 = Static37.anInt1220 - local39;
		for (@Pc(69) int local69 = 0; local69 < 32768; local69++) {
			@Pc(75) Class2_Sub1_Sub1_Sub2_Sub1 local75 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local69];
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < 10; local79++) {
					local75.anIntArray209[local79] -= local52;
					local75.anIntArray208[local79] -= local65;
				}
				local75.anInt1518 -= local52 * 128;
				local75.anInt1562 -= local65 * 128;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < 2048; local123++) {
			@Pc(129) Class2_Sub1_Sub1_Sub2_Sub2 local129 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local123];
			if (local129 != null) {
				for (@Pc(133) int local133 = 0; local133 < 10; local133++) {
					local129.anIntArray209[local133] -= local52;
					local129.anIntArray208[local133] -= local65;
				}
				local129.anInt1518 -= local52 * 128;
				local129.anInt1562 -= local65 * 128;
			}
		}
		@Pc(181) byte local181 = 0;
		Static62.anInt1879 = arg4;
		@Pc(193) byte local193 = 104;
		@Pc(195) byte local195 = 1;
		if (local52 < 0) {
			local193 = -1;
			local181 = 103;
			local195 = -1;
		}
		@Pc(205) byte local205 = 0;
		Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.method922(arg2, false, arg3);
		@Pc(213) byte local213 = 104;
		@Pc(215) byte local215 = 1;
		if (local65 < 0) {
			local213 = -1;
			local205 = 103;
			local215 = -1;
		}
		for (@Pc(228) int local228 = local181; local228 != local193; local228 += local195) {
			for (@Pc(232) int local232 = local205; local232 != local213; local232 += local215) {
				@Pc(238) int local238 = local232 + local65;
				@Pc(243) int local243 = local228 + local52;
				for (@Pc(245) int local245 = 0; local245 < 4; local245++) {
					if (local243 >= 0 && local238 >= 0 && local243 < 104 && local238 < 104) {
						Static22.aClass52ArrayArrayArray1[local245][local228][local232] = Static22.aClass52ArrayArrayArray1[local245][local243][local238];
					} else {
						Static22.aClass52ArrayArrayArray1[local245][local228][local232] = null;
					}
				}
			}
		}
		for (@Pc(317) Class2_Sub12 local317 = (Class2_Sub12) Static13.aClass52_3.method1587(); local317 != null; local317 = (Class2_Sub12) Static13.aClass52_3.method1588()) {
			local317.anInt1709 -= local52;
			local317.anInt1698 -= local65;
			if (local317.anInt1709 < 0 || local317.anInt1698 < 0 || local317.anInt1709 >= 104 || local317.anInt1698 >= 104) {
				local317.method1794();
			}
		}
		Static35.aBoolean73 = false;
		if (Static99.anInt2533 != 0) {
			Static54.anInt1641 -= local65;
			Static99.anInt2533 -= local52;
		}
		Static98.anInt2771 = -1;
		Static98.anInt2765 = 0;
		Static36.aClass52_6.method1590();
		Static45.aClass52_7.method1590();
	}
}
