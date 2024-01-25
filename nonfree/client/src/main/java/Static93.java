import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static int anInt2504;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
	public static int anInt2506 = 0;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "[I")
	public static final int[] anIntArray213 = new int[14];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public static void method2206() {
		if (Static324.anInt6209 == 0 || Static324.anInt6209 == 5) {
			return;
		}
		try {
			if (++Static333.anInt6366 > 2000) {
				if (Static155.aClass114_3 != null) {
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
				}
				if (Static268.anInt5371 >= 1) {
					Static324.anInt6209 = 0;
					Static42.anInt1131 = -5;
					return;
				}
				Static324.anInt6209 = 1;
				if (Static206.anInt4324 == Static184.anInt3886) {
					Static184.anInt3886 = Static328.anInt6269;
				} else {
					Static184.anInt3886 = Static206.anInt4324;
				}
				Static268.anInt5371++;
				Static333.anInt6366 = 0;
			}
			if (Static324.anInt6209 == 1) {
				Static113.aClass185_1 = Static1.aClass134_7.method3760(Static184.anInt3886, Static309.aString62);
				Static324.anInt6209 = 2;
			}
			if (Static324.anInt6209 == 2) {
				if (Static113.aClass185_1.anInt5682 == 2) {
					throw new IOException();
				}
				if (Static113.aClass185_1.anInt5682 != 1) {
					return;
				}
				Static155.aClass114_3 = new Class114((Socket) Static113.aClass185_1.anObject4, Static1.aClass134_7);
				Static113.aClass185_1 = null;
				@Pc(115) long local115 = Static81.aLong63 = Static15.method863(Static121.aString54);
				Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
				@Pc(125) int local125 = (int) (local115 >> 16 & 0x1FL);
				Static15.aClass4_Sub11_Sub1_2.method3434(14);
				Static15.aClass4_Sub11_Sub1_2.method3434(local125);
				Static155.aClass114_3.method3163(Static15.aClass4_Sub11_Sub1_2.aByteArray55, 2);
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				@Pc(154) int local154 = Static155.aClass114_3.method3170();
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				if (local154 != 0) {
					Static324.anInt6209 = 0;
					Static42.anInt1131 = local154;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
					return;
				}
				Static324.anInt6209 = 3;
			}
			if (Static324.anInt6209 == 3) {
				if (Static155.aClass114_3.method3161() < 8) {
					return;
				}
				Static155.aClass114_3.method3168(8, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
				Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
				Static274.aLong175 = Static127.aClass4_Sub11_Sub1_3.method3407();
				@Pc(208) int[] local208 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static274.aLong175 >> 32), (int) Static274.aLong175 };
				Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
				Static15.aClass4_Sub11_Sub1_2.method3434(10);
				Static15.aClass4_Sub11_Sub1_2.method3452(local208[0]);
				Static15.aClass4_Sub11_Sub1_2.method3452(local208[1]);
				Static15.aClass4_Sub11_Sub1_2.method3452(local208[2]);
				Static15.aClass4_Sub11_Sub1_2.method3452(local208[3]);
				Static15.aClass4_Sub11_Sub1_2.method3435(Static15.method863(Static121.aString54));
				Static15.aClass4_Sub11_Sub1_2.method3410(Static31.aString13);
				Static15.aClass4_Sub11_Sub1_2.method3436(Static251.aBigInteger1, Static316.aBigInteger2);
				Static298.aClass4_Sub11_Sub1_4.anInt3768 = 0;
				if (Static139.anInt3199 == 40) {
					Static298.aClass4_Sub11_Sub1_4.method3434(18);
				} else {
					Static298.aClass4_Sub11_Sub1_4.method3434(16);
				}
				Static298.aClass4_Sub11_Sub1_4.method3402(Static15.aClass4_Sub11_Sub1_2.anInt3768 + Static294.method4905(Static209.aString48) + 161);
				Static298.aClass4_Sub11_Sub1_4.method3452(566);
				Static298.aClass4_Sub11_Sub1_4.method3434(Static193.anInt4281);
				Static298.aClass4_Sub11_Sub1_4.method3434(Static35.method713());
				Static298.aClass4_Sub11_Sub1_4.method3402(Static24.anInt496);
				Static298.aClass4_Sub11_Sub1_4.method3402(Static23.anInt465);
				Static298.aClass4_Sub11_Sub1_4.method3434(Static347.anInt6585);
				Static289.method4869(Static298.aClass4_Sub11_Sub1_4);
				Static298.aClass4_Sub11_Sub1_4.method3410(Static209.aString48);
				Static298.aClass4_Sub11_Sub1_4.method3452(Static182.anInt3853);
				Static298.aClass4_Sub11_Sub1_4.method3452(Static212.method2561());
				Static313.aBoolean449 = true;
				Static298.aClass4_Sub11_Sub1_4.method3402(Static286.anInt6705);
				Static298.aClass4_Sub11_Sub1_4.method3452(Static248.aClass193_88.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static247.aClass193_87.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static149.aClass193_69.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static229.aClass193_79.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static146.aClass193_43.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static287.aClass193_77.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static39.aClass193_11.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static142.aClass193_53.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static316.aClass193_99.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static302.aClass193_95.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static8.aClass193_5.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static210.aClass193_76.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static121.aClass193_85.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static103.aClass193_38.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static117.aClass193_41.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static145.aClass193_54.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static349.aClass193_109.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static167.aClass193_60.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static351.aClass193_110.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static203.aClass193_73.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static132.aClass193_47.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static301.aClass193_94.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static253.aClass193_89.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static72.aClass193_20.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static52.aClass193_13.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static181.aClass193_66.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static217.aClass193_78.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static97.aClass193_36.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3452(Static97.aClass193_35.method5048());
				Static298.aClass4_Sub11_Sub1_4.method3424(Static15.aClass4_Sub11_Sub1_2.anInt3768, Static15.aClass4_Sub11_Sub1_2.aByteArray55);
				Static155.aClass114_3.method3163(Static298.aClass4_Sub11_Sub1_4.aByteArray55, Static298.aClass4_Sub11_Sub1_4.anInt3768);
				Static15.aClass4_Sub11_Sub1_2.method707(local208);
				for (@Pc(551) int local551 = 0; local551 < 4; local551++) {
					local208[local551] += 50;
				}
				Static127.aClass4_Sub11_Sub1_3.method707(local208);
				Static324.anInt6209 = 4;
			}
			if (Static324.anInt6209 == 4) {
				if (Static155.aClass114_3.method3161() < 1) {
					return;
				}
				@Pc(587) int local587 = Static155.aClass114_3.method3170();
				if (local587 == 21) {
					Static324.anInt6209 = 7;
				} else if (local587 == 29) {
					Static324.anInt6209 = 10;
				} else if (local587 == 1) {
					Static324.anInt6209 = 5;
					Static42.anInt1131 = local587;
					return;
				} else if (local587 == 2) {
					Static324.anInt6209 = 8;
				} else if (local587 == 15) {
					Static324.anInt6209 = 0;
					Static42.anInt1131 = local587;
					return;
				} else if (local587 == 23 && Static268.anInt5371 < 1) {
					Static268.anInt5371++;
					Static333.anInt6366 = 0;
					Static324.anInt6209 = 1;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
					return;
				} else {
					Static324.anInt6209 = 0;
					Static42.anInt1131 = local587;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
					return;
				}
			}
			if (Static324.anInt6209 == 6) {
				Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
				Static15.aClass4_Sub11_Sub1_2.method706(17);
				Static155.aClass114_3.method3163(Static15.aClass4_Sub11_Sub1_2.aByteArray55, Static15.aClass4_Sub11_Sub1_2.anInt3768);
				Static324.anInt6209 = 4;
			} else if (Static324.anInt6209 == 7) {
				if (Static155.aClass114_3.method3161() >= 1) {
					Static42.anInt1130 = (Static155.aClass114_3.method3170() + 3) * 60;
					Static42.anInt1131 = 21;
					Static324.anInt6209 = 0;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
				}
			} else if (Static324.anInt6209 != 10) {
				if (Static324.anInt6209 == 8) {
					if (Static155.aClass114_3.method3161() < 13) {
						return;
					}
					Static155.aClass114_3.method3168(13, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
					Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
					Static23.anInt452 = Static127.aClass4_Sub11_Sub1_3.method3440();
					Static68.anInt1789 = Static127.aClass4_Sub11_Sub1_3.method3440();
					Static230.aBoolean459 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
					Static321.aBoolean363 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
					Static105.aBoolean188 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
					Static162.aBoolean273 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
					Static64.anInt1674 = Static127.aClass4_Sub11_Sub1_3.method3401();
					Static25.aBoolean42 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
					Static121.aBoolean369 = Static127.aClass4_Sub11_Sub1_3.method3440() == 1;
					Static127.method2625(Static121.aBoolean369);
					Static158.method3081(Static121.aBoolean369);
					Static354.method5632(Static121.aBoolean369);
					if (Static230.aBoolean459 && !Static105.aBoolean188 || Static25.aBoolean42) {
						try {
							Static366.method4253("zap", Static1.aClass134_7.anApplet1);
						} catch (@Pc(857) Throwable local857) {
						}
					} else {
						try {
							Static366.method4253("unzap", Static1.aClass134_7.anApplet1);
						} catch (@Pc(867) Throwable local867) {
						}
					}
					if (Static80.anInt2116 == 0) {
						try {
							Static366.method4253("loggedin", Static1.aClass134_7.anApplet1);
						} catch (@Pc(878) Throwable local878) {
						}
					}
					Static229.anInt4619 = Static127.aClass4_Sub11_Sub1_3.method704();
					Static133.anInt3104 = Static127.aClass4_Sub11_Sub1_3.method3401();
					Static324.anInt6209 = 9;
				}
				if (Static324.anInt6209 == 9 && Static155.aClass114_3.method3161() >= Static133.anInt3104) {
					Static127.aClass4_Sub11_Sub1_3.anInt3768 = 0;
					Static155.aClass114_3.method3168(Static133.anInt3104, Static127.aClass4_Sub11_Sub1_3.aByteArray55, 0);
					Static324.anInt6209 = 0;
					Static42.anInt1131 = 2;
					Static144.method2975();
					Static103.anInt2592 = -1;
					Static240.method4266(false);
					Static229.anInt4619 = -1;
				}
			} else if (Static155.aClass114_3.method3161() >= 1) {
				Static206.anInt4322 = Static155.aClass114_3.method3170();
				Static42.anInt1131 = 29;
				Static324.anInt6209 = 0;
				Static155.aClass114_3.method3165();
				Static155.aClass114_3 = null;
			}
		} catch (@Pc(933) IOException local933) {
			if (Static155.aClass114_3 != null) {
				Static155.aClass114_3.method3165();
				Static155.aClass114_3 = null;
			}
			if (Static268.anInt5371 < 1) {
				Static268.anInt5371++;
				Static324.anInt6209 = 1;
				Static333.anInt6366 = 0;
				if (Static184.anInt3886 == Static206.anInt4324) {
					Static184.anInt3886 = Static328.anInt6269;
				} else {
					Static184.anInt3886 = Static206.anInt4324;
				}
			} else {
				Static42.anInt1131 = -4;
				Static324.anInt6209 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!tj;I)V")
	public static void method2207(@OriginalArg(0) Class193 arg0) {
		Static339.aClass193_2 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(CB)B")
	public static byte method2208(@OriginalArg(0) char arg0) {
		@Pc(34) byte local34;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local34 = (byte) arg0;
		} else if (arg0 == '€') {
			local34 = -128;
		} else if (arg0 == '‚') {
			local34 = -126;
		} else if (arg0 == 'ƒ') {
			local34 = -125;
		} else if (arg0 == '„') {
			local34 = -124;
		} else if (arg0 == '…') {
			local34 = -123;
		} else if (arg0 == '†') {
			local34 = -122;
		} else if (arg0 == '‡') {
			local34 = -121;
		} else if (arg0 == 'ˆ') {
			local34 = -120;
		} else if (arg0 == '‰') {
			local34 = -119;
		} else if (arg0 == 'Š') {
			local34 = -118;
		} else if (arg0 == '‹') {
			local34 = -117;
		} else if (arg0 == 'Œ') {
			local34 = -116;
		} else if (arg0 == 'Ž') {
			local34 = -114;
		} else if (arg0 == '‘') {
			local34 = -111;
		} else if (arg0 == '’') {
			local34 = -110;
		} else if (arg0 == '“') {
			local34 = -109;
		} else if (arg0 == '”') {
			local34 = -108;
		} else if (arg0 == '•') {
			local34 = -107;
		} else if (arg0 == '–') {
			local34 = -106;
		} else if (arg0 == '—') {
			local34 = -105;
		} else if (arg0 == '˜') {
			local34 = -104;
		} else if (arg0 == '™') {
			local34 = -103;
		} else if (arg0 == 'š') {
			local34 = -102;
		} else if (arg0 == '›') {
			local34 = -101;
		} else if (arg0 == 'œ') {
			local34 = -100;
		} else if (arg0 == 'ž') {
			local34 = -98;
		} else if (arg0 == 'Ÿ') {
			local34 = -97;
		} else {
			local34 = 63;
		}
		return local34;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!pn;)V")
	public static void method2210(@OriginalArg(1) Class8_Sub1_Sub2_Sub2 arg0) {
		if (Static105.anInt2645 >= 400) {
			return;
		}
		@Pc(14) Class141 local14 = arg0.aClass141_1;
		if (local14.anIntArray380 != null) {
			local14 = local14.method3908();
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean340) {
			return;
		}
		@Pc(31) String local31 = local14.aString51;
		if (local14.anInt4375 != 0) {
			@Pc(59) String local59 = Static330.anInt6312 == 1 ? Static7.aClass159_10.method4311(Static180.anInt3835) : Static55.aClass159_81.method4311(Static180.anInt3835);
			local31 = local31 + Static239.method4230(Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346, local14.anInt4375) + " (" + local59 + local14.anInt4375 + ")";
		}
		if (Static344.aBoolean219) {
			@Pc(331) Class4_Sub4_Sub21 local331 = Static199.anInt4136 == -1 ? null : Static157.method3056(Static199.anInt4136);
			if ((Static48.anInt1288 & 0x2) != 0 && (local331 == null || local14.method3906(local331.anInt6440, Static199.anInt4136) != local331.anInt6440)) {
				Static138.method2617((long) arg0.anInt4916, Static194.aString36 + " -> <col=ffff00>" + local31, 47, Static169.anInt3596, Static171.aString34, 0, 0);
			}
			return;
		}
		@Pc(87) String[] local87 = local14.aStringArray54;
		if (Static174.aBoolean293) {
			local87 = Static37.method747(local87);
		}
		@Pc(97) int local97;
		if (local87 != null) {
			for (local97 = 4; local97 >= 0; local97--) {
				if (local87[local97] != null && (Static330.anInt6312 != 0 || !local87[local97].equalsIgnoreCase(Static52.aClass159_79.method4311(Static180.anInt3835)))) {
					@Pc(116) byte local116 = 0;
					@Pc(118) int local118 = Static207.anInt4330;
					if (local97 == 0) {
						local116 = 10;
					}
					if (local97 == 1) {
						local116 = 49;
					}
					if (local97 == 2) {
						local116 = 25;
					}
					if (local97 == 3) {
						local116 = 6;
					}
					if (local97 == local14.anInt4383) {
						local118 = local14.anInt4366;
					}
					if (local97 == 4) {
						local116 = 9;
					}
					if (local14.anInt4381 == local97) {
						local118 = local14.anInt4368;
					}
					Static138.method2617((long) arg0.anInt4916, "<col=ffff00>" + local31, local116, local118, local87[local97], 0, 0);
				}
			}
		}
		if (Static330.anInt6312 == 0 && local87 != null) {
			for (local97 = 4; local97 >= 0; local97--) {
				if (local87[local97] != null && local87[local97].equalsIgnoreCase(Static52.aClass159_79.method4311(Static180.anInt3835))) {
					@Pc(215) short local215 = 0;
					if (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346 < local14.anInt4375) {
						local215 = 2000;
					}
					@Pc(228) short local228 = 0;
					if (local97 == 0) {
						local228 = 10;
					}
					if (local97 == 1) {
						local228 = 49;
					}
					if (local97 == 2) {
						local228 = 25;
					}
					if (local97 == 3) {
						local228 = 6;
					}
					if (local97 == 4) {
						local228 = 9;
					}
					if (local228 != 0) {
						local228 += local215;
					}
					Static138.method2617((long) arg0.anInt4916, "<col=ffff00>" + local31, local228, local14.anInt4388, local87[local97], 0, 0);
				}
			}
		}
		Static138.method2617((long) arg0.anInt4916, "<col=ffff00>" + local31, 1001, Static214.anInt2074, Static183.aClass159_201.method4311(Static180.anInt3835), 0, 0);
	}
}
