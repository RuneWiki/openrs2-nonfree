import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
	public static int anInt2192;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3 aClass4_Sub1_Sub7_Sub3_3;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_808 = Static177.method3050("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_809 = Static177.method3050("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILclient!tg;JLclient!tg;Lclient!tg;)V")
	public static void method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class4_Sub1_Sub1 arg6, @OriginalArg(7) Class4_Sub1_Sub1 arg7) {
		@Pc(3) Class70 local3 = new Class70();
		local3.aClass4_Sub1_Sub1_8 = arg4;
		local3.anInt3138 = arg1 * 128 + 64;
		local3.anInt3141 = arg2 * 128 + 64;
		local3.anInt3135 = arg3;
		local3.aLong112 = arg5;
		local3.aClass4_Sub1_Sub1_9 = arg6;
		local3.aClass4_Sub1_Sub1_7 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(42) Class4_Sub7 local42 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1040; local46++) {
				if ((local42.aClass86Array1[local46].aLong129 & 0x400000L) == 4194304L && local42.aClass86Array1[local46].aClass4_Sub1_Sub1_10 instanceof Class4_Sub1_Sub1_Sub4) {
					@Pc(71) Class4_Sub1_Sub1_Sub4 local71 = (Class4_Sub1_Sub1_Sub4) local42.aClass86Array1[local46].aClass4_Sub1_Sub1_10;
					local71.method2824();
					if (local71.aShort29 < local34) {
						local34 = local71.aShort29;
					}
				}
			}
		}
		local3.anInt3134 = -local34;
		if (Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub7(arg0, arg1, arg2);
		}
		Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass70_1 = local3;
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
	public static void method1706() {
		@Pc(16) int local16;
		if (Static117.anInt2874 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static117.anInt2874 > 768) {
					Static30.anIntArray66[local16] = Static43.method730(Static67.anIntArray169[local16], 1024 - Static117.anInt2874, Static155.anIntArray330[local16]);
				} else if (Static117.anInt2874 <= 256) {
					Static30.anIntArray66[local16] = Static43.method730(Static155.anIntArray330[local16], 256 - Static117.anInt2874, Static67.anIntArray169[local16]);
				} else {
					Static30.anIntArray66[local16] = Static155.anIntArray330[local16];
				}
			}
		} else if (Static45.anInt1122 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static45.anInt1122 > 768) {
					Static30.anIntArray66[local16] = Static43.method730(Static67.anIntArray169[local16], 1024 - Static45.anInt1122, Static87.anIntArray209[local16]);
				} else if (Static45.anInt1122 <= 256) {
					Static30.anIntArray66[local16] = Static43.method730(Static87.anIntArray209[local16], 256 - Static45.anInt1122, Static67.anIntArray169[local16]);
				} else {
					Static30.anIntArray66[local16] = Static87.anIntArray209[local16];
				}
			}
		} else {
			for (local16 = 0; local16 < 256; local16++) {
				Static30.anIntArray66[local16] = Static67.anIntArray169[local16];
			}
		}
		@Pc(154) int local154 = Static18.aClass4_Sub1_Sub7_Sub2_1.anInt3405 * 9;
		local16 = 0;
		@Pc(158) int local158 = 0;
		@Pc(175) int local175;
		@Pc(188) int local188;
		@Pc(201) int local201;
		@Pc(196) int local196;
		@Pc(208) int local208;
		@Pc(213) int local213;
		for (@Pc(160) int local160 = 1; local160 < 255; local160++) {
			local175 = Static36.anIntArray85[local160] * (256 - local160) / 256 + 22;
			if (local175 < 0) {
				local175 = 0;
			}
			local16 += local175;
			for (local188 = local175; local188 < 128; local188++) {
				local196 = Static18.aClass4_Sub1_Sub7_Sub2_1.anIntArray323[local154++];
				local201 = Static124.anIntArray281[local16++];
				if (local201 == 0) {
					Static136.aClass4_Sub1_Sub7_Sub2_5.anIntArray323[local158++] = local196;
				} else {
					local208 = local201;
					local213 = 256 - local201;
					local201 = Static30.anIntArray66[local201];
					Static136.aClass4_Sub1_Sub7_Sub2_5.anIntArray323[local158++] = (local208 * (local201 & 0xFF00) + (local196 & 0xFF00) * local213 & 0xFF0000) + ((local196 & 0xFF00FF) * local213 + local208 * (local201 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local201 = 0; local201 < local175; local201++) {
				Static136.aClass4_Sub1_Sub7_Sub2_5.anIntArray323[local158++] = Static18.aClass4_Sub1_Sub7_Sub2_1.anIntArray323[local154++];
			}
			local154 += Static18.aClass4_Sub1_Sub7_Sub2_1.anInt3405 - 128;
		}
		local16 = 0;
		local158 = 0;
		Static136.aClass4_Sub1_Sub7_Sub2_5.method2533(0, 9);
		local154 = Static18.aClass4_Sub1_Sub7_Sub2_1.anInt3405 * 9 + 128;
		for (local175 = 1; local175 < 255; local175++) {
			local188 = Static36.anIntArray85[local175] * (256 - local175) / 256 + 22;
			if (local188 < 0) {
				local188 = 0;
			}
			for (local201 = 0; local201 < local188; local201++) {
				@Pc(349) int local349 = local158++;
				local154--;
				Static158.aClass4_Sub1_Sub7_Sub2_6.anIntArray323[local349] = Static18.aClass4_Sub1_Sub7_Sub2_1.anIntArray323[local154];
			}
			for (local196 = local188; local196 < 128; local196++) {
				local208 = Static124.anIntArray281[local16++];
				local154--;
				local213 = Static18.aClass4_Sub1_Sub7_Sub2_1.anIntArray323[local154];
				if (local208 == 0) {
					Static158.aClass4_Sub1_Sub7_Sub2_6.anIntArray323[local158++] = local213;
				} else {
					@Pc(386) int local386 = 256 - local208;
					@Pc(388) int local388 = local208;
					local208 = Static30.anIntArray66[local208];
					Static158.aClass4_Sub1_Sub7_Sub2_6.anIntArray323[local158++] = (local386 * (local213 & 0xFF00) + local388 * (local208 & 0xFF00) & 0xFF0000) + ((local208 & 0xFF00FF) * local388 + local386 * (local213 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local16 += local188;
			local154 += Static18.aClass4_Sub1_Sub7_Sub2_1.anInt3405 + 128;
		}
		Static158.aClass4_Sub1_Sub7_Sub2_6.method2533(637, 9);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	public static void method1707(@OriginalArg(1) int arg0) {
		for (@Pc(4) Class4_Sub18 local4 = (Class4_Sub18) Static129.aClass20_8.method504(); local4 != null; local4 = (Class4_Sub18) Static129.aClass20_8.method498()) {
			if ((long) arg0 == (local4.aLong148 >> 48 & 0xFFFFL)) {
				local4.method3173();
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!mb;IZIIII)V")
	public static void method1708(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static103.aBoolean113 && (Static53.aByteArrayArrayArray2[0][arg5][arg0] & 0x2) == 0) {
			if ((Static53.aByteArrayArrayArray2[arg3][arg5][arg0] & 0x10) != 0) {
				return;
			}
			if (Static8.method163(arg3, arg0, arg5) != Static146.anInt3365) {
				return;
			}
		}
		if (Static38.anInt1011 > arg3) {
			Static38.anInt1011 = arg3;
		}
		@Pc(48) Class4_Sub1_Sub19 local48 = Static113.method2090(arg2);
		@Pc(59) int local59;
		@Pc(62) int local62;
		if (arg4 == 1 || arg4 == 3) {
			local59 = local48.anInt4187;
			local62 = local48.anInt4191;
		} else {
			local59 = local48.anInt4191;
			local62 = local48.anInt4187;
		}
		@Pc(91) int local91;
		@Pc(85) int local85;
		if (arg5 + local59 <= 104) {
			local85 = arg5 + (local59 + 1 >> 1);
			local91 = arg5 + (local59 >> 1);
		} else {
			local85 = arg5 + 1;
			local91 = arg5;
		}
		@Pc(111) int local111;
		@Pc(109) int local109;
		if (arg0 + local62 > 104) {
			local109 = arg0 + 1;
			local111 = arg0;
		} else {
			local111 = arg0 + (local62 >> 1);
			local109 = (local62 + 1 >> 1) + arg0;
		}
		@Pc(132) int[][] local132 = Static112.anIntArrayArrayArray42[arg3];
		@Pc(141) int local141 = (arg0 << 7) + (local62 << 6);
		@Pc(168) int local168 = local132[local91][local111] + local132[local85][local111] + local132[local91][local109] + local132[local85][local109] >> 2;
		@Pc(176) int local176 = (arg5 << 7) + (local59 << 6);
		@Pc(193) long local193 = (long) (arg6 << 14 | arg5 | arg0 << 7 | arg4 << 20 | 0x40000000);
		if (local48.anInt4175 == 0) {
			local193 |= Long.MIN_VALUE;
		}
		if (local48.anInt4164 == 1) {
			local193 |= 0x400000L;
		}
		if (local48.method3187()) {
			Static111.method2062(arg5, arg0, local48, arg3, arg4);
		}
		local193 |= (long) arg2 << 32;
		@Pc(269) Class4_Sub1_Sub1 local269;
		@Pc(281) Class4_Sub1_Sub10 local281;
		if (arg6 != 22) {
			@Pc(377) int local377;
			if (arg6 == 10 || arg6 == 11) {
				if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
					local281 = local48.method3193(local168, arg4, local176, local132, 10, local141);
					local269 = local281.aClass4_Sub1_Sub1_4;
				} else {
					local269 = new Class4_Sub1_Sub1_Sub2(arg2, 10, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
				}
				if (local269 != null && Static102.method1955(arg3, arg5, arg0, local168, local59, local62, local269, arg6 == 11 ? 256 : 0, local193) && local48.aBoolean179) {
					local377 = 15;
					if (local269 instanceof Class4_Sub1_Sub1_Sub4) {
						local377 = ((Class4_Sub1_Sub1_Sub4) local269).method2834() / 4;
						if (local377 > 30) {
							local377 = 30;
						}
					}
					for (@Pc(395) int local395 = 0; local395 <= local59; local395++) {
						for (@Pc(399) int local399 = 0; local399 <= local62; local399++) {
							if (Static27.aByteArrayArrayArray1[arg3][local395 + arg5][arg0 + local399] < local377) {
								Static27.aByteArrayArrayArray1[arg3][arg5 + local395][local399 + arg0] = (byte) local377;
							}
						}
					}
				}
				if (local48.anInt4156 != 0 && arg1 != null) {
					arg1.method1990(local48.aBoolean177, arg5, local59, local62, arg0);
				}
			} else if (arg6 >= 12) {
				if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
					local281 = local48.method3193(local168, arg4, local176, local132, arg6, local141);
					local269 = local281.aClass4_Sub1_Sub1_4;
				} else {
					local269 = new Class4_Sub1_Sub1_Sub2(arg2, arg6, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
				}
				Static102.method1955(arg3, arg5, arg0, local168, 1, 1, local269, 0, local193);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
					Static27.anIntArrayArrayArray9[arg3][arg5][arg0] |= 0x924;
				}
				if (local48.anInt4156 != 0 && arg1 != null) {
					arg1.method1990(local48.aBoolean177, arg5, local59, local62, arg0);
				}
			} else if (arg6 == 0) {
				if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
					local281 = local48.method3193(local168, arg4, local176, local132, 0, local141);
					local269 = local281.aClass4_Sub1_Sub1_4;
				} else {
					local269 = new Class4_Sub1_Sub1_Sub2(arg2, 0, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
				}
				Static1.method5(arg3, arg5, arg0, local168, local269, null, Static38.anIntArray89[arg4], 0, local193);
				if (arg4 == 0) {
					if (local48.aBoolean179) {
						Static27.aByteArrayArrayArray1[arg3][arg5][arg0] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg5][arg0 + 1] = 50;
					}
					if (local48.aBoolean175) {
						Static27.anIntArrayArrayArray9[arg3][arg5][arg0] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local48.aBoolean179) {
						Static27.aByteArrayArrayArray1[arg3][arg5][arg0 + 1] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0 + 1] = 50;
					}
					if (local48.aBoolean175) {
						Static27.anIntArrayArrayArray9[arg3][arg5][arg0 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local48.aBoolean179) {
						Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0 + 1] = 50;
					}
					if (local48.aBoolean175) {
						Static27.anIntArrayArrayArray9[arg3][arg5 + 1][arg0] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local48.aBoolean179) {
						Static27.aByteArrayArrayArray1[arg3][arg5][arg0] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0] = 50;
					}
					if (local48.aBoolean175) {
						Static27.anIntArrayArrayArray9[arg3][arg5][arg0] |= 0x492;
					}
				}
				if (local48.anInt4156 != 0 && arg1 != null) {
					arg1.method1991(arg6, arg0, local48.aBoolean177, arg4, arg5);
				}
				if (local48.anInt4168 != 16) {
					Static41.method706(arg3, arg5, arg0, local48.anInt4168);
				}
			} else if (arg6 == 1) {
				if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
					local281 = local48.method3193(local168, arg4, local176, local132, 1, local141);
					local269 = local281.aClass4_Sub1_Sub1_4;
				} else {
					local269 = new Class4_Sub1_Sub1_Sub2(arg2, 1, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
				}
				Static1.method5(arg3, arg5, arg0, local168, local269, null, Static96.anIntArray230[arg4], 0, local193);
				if (local48.aBoolean179) {
					if (arg4 == 0) {
						Static27.aByteArrayArrayArray1[arg3][arg5][arg0 + 1] = 50;
					} else if (arg4 == 1) {
						Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0 + 1] = 50;
					} else if (arg4 == 2) {
						Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0] = 50;
					} else if (arg4 == 3) {
						Static27.aByteArrayArrayArray1[arg3][arg5][arg0] = 50;
					}
				}
				if (local48.anInt4156 != 0 && arg1 != null) {
					arg1.method1991(arg6, arg0, local48.aBoolean177, arg4, arg5);
				}
			} else {
				@Pc(979) int local979;
				@Pc(1008) Class4_Sub1_Sub10 local1008;
				if (arg6 == 2) {
					local979 = arg4 + 1 & 0x3;
					@Pc(1011) Class4_Sub1_Sub1 local1011;
					@Pc(1014) Class4_Sub1_Sub1 local1014;
					if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
						@Pc(998) Class4_Sub1_Sub10 local998 = local48.method3193(local168, arg4 + 4, local176, local132, 2, local141);
						local1008 = local48.method3193(local168, local979, local176, local132, 2, local141);
						local1011 = local1008.aClass4_Sub1_Sub1_4;
						local1014 = local998.aClass4_Sub1_Sub1_4;
					} else {
						local1014 = new Class4_Sub1_Sub1_Sub2(arg2, 2, arg4 + 4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
						local1011 = new Class4_Sub1_Sub1_Sub2(arg2, 2, local979, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
					}
					Static1.method5(arg3, arg5, arg0, local168, local1014, local1011, Static38.anIntArray89[arg4], Static38.anIntArray89[local979], local193);
					if (local48.aBoolean175) {
						if (arg4 == 0) {
							Static27.anIntArrayArrayArray9[arg3][arg5][arg0] |= 0x249;
							Static27.anIntArrayArrayArray9[arg3][arg5][arg0 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static27.anIntArrayArrayArray9[arg3][arg5][arg0 + 1] |= 0x492;
							Static27.anIntArrayArrayArray9[arg3][arg5 + 1][arg0] |= 0x249;
						} else if (arg4 == 2) {
							Static27.anIntArrayArrayArray9[arg3][arg5 + 1][arg0] |= 0x249;
							Static27.anIntArrayArrayArray9[arg3][arg5][arg0] |= 0x492;
						} else if (arg4 == 3) {
							Static27.anIntArrayArrayArray9[arg3][arg5][arg0] |= 0x492;
							Static27.anIntArrayArrayArray9[arg3][arg5][arg0] |= 0x249;
						}
					}
					if (local48.anInt4156 != 0 && arg1 != null) {
						arg1.method1991(arg6, arg0, local48.aBoolean177, arg4, arg5);
					}
					if (local48.anInt4168 != 16) {
						Static41.method706(arg3, arg5, arg0, local48.anInt4168);
					}
				} else if (arg6 == 3) {
					if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
						local281 = local48.method3193(local168, arg4, local176, local132, 3, local141);
						local269 = local281.aClass4_Sub1_Sub1_4;
					} else {
						local269 = new Class4_Sub1_Sub1_Sub2(arg2, 3, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
					}
					Static1.method5(arg3, arg5, arg0, local168, local269, null, Static96.anIntArray230[arg4], 0, local193);
					if (local48.aBoolean179) {
						if (arg4 == 0) {
							Static27.aByteArrayArrayArray1[arg3][arg5][arg0 + 1] = 50;
						} else if (arg4 == 1) {
							Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0 + 1] = 50;
						} else if (arg4 == 2) {
							Static27.aByteArrayArrayArray1[arg3][arg5 + 1][arg0] = 50;
						} else if (arg4 == 3) {
							Static27.aByteArrayArrayArray1[arg3][arg5][arg0] = 50;
						}
					}
					if (local48.anInt4156 != 0 && arg1 != null) {
						arg1.method1991(arg6, arg0, local48.aBoolean177, arg4, arg5);
					}
				} else if (arg6 == 9) {
					if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
						local281 = local48.method3193(local168, arg4, local176, local132, arg6, local141);
						local269 = local281.aClass4_Sub1_Sub1_4;
					} else {
						local269 = new Class4_Sub1_Sub1_Sub2(arg2, arg6, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
					}
					Static102.method1955(arg3, arg5, arg0, local168, 1, 1, local269, 0, local193);
					if (local48.anInt4156 != 0 && arg1 != null) {
						arg1.method1990(local48.aBoolean177, arg5, local59, local62, arg0);
					}
					if (local48.anInt4168 != 16) {
						Static41.method706(arg3, arg5, arg0, local48.anInt4168);
					}
				} else if (arg6 == 4) {
					if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
						local281 = local48.method3193(local168, arg4, local176, local132, 4, local141);
						local269 = local281.aClass4_Sub1_Sub1_4;
					} else {
						local269 = new Class4_Sub1_Sub1_Sub2(arg2, 4, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
					}
					Static53.method1029(arg3, arg5, arg0, local168, local269, null, Static38.anIntArray89[arg4], 0, 0, 0, local193);
				} else {
					@Pc(1541) long local1541;
					@Pc(1580) Class4_Sub1_Sub1 local1580;
					if (arg6 == 5) {
						local979 = 16;
						local1541 = Static111.method2060(arg3, arg5, arg0);
						if (local1541 != 0L) {
							local979 = Static113.method2090(Integer.MAX_VALUE & (int) (local1541 >>> 32)).anInt4168;
						}
						if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
							local1008 = local48.method3193(local168, arg4, local176, local132, 4, local141);
							local1580 = local1008.aClass4_Sub1_Sub1_4;
						} else {
							local1580 = new Class4_Sub1_Sub1_Sub2(arg2, 4, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
						}
						Static53.method1029(arg3, arg5, arg0, local168, local1580, null, Static38.anIntArray89[arg4], 0, Static69.anIntArray172[arg4] * local979, local979 * Static110.anIntArray251[arg4], local193);
					} else if (arg6 == 6) {
						local979 = 8;
						local1541 = Static111.method2060(arg3, arg5, arg0);
						if (local1541 != 0L) {
							local979 = Static113.method2090(Integer.MAX_VALUE & (int) (local1541 >>> 32)).anInt4168 / 2;
						}
						if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
							local1008 = local48.method3193(local168, arg4 + 4, local176, local132, 4, local141);
							local1580 = local1008.aClass4_Sub1_Sub1_4;
						} else {
							local1580 = new Class4_Sub1_Sub1_Sub2(arg2, 4, arg4 + 4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
						}
						Static53.method1029(arg3, arg5, arg0, local168, local1580, null, 256, arg4, local979 * Static8.anIntArray28[arg4], Static100.anIntArray237[arg4] * local979, local193);
					} else if (arg6 == 7) {
						local377 = arg4 + 2 & 0x3;
						if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
							@Pc(1734) Class4_Sub1_Sub10 local1734 = local48.method3193(local168, local377 + 4, local176, local132, 4, local141);
							local269 = local1734.aClass4_Sub1_Sub1_4;
						} else {
							local269 = new Class4_Sub1_Sub1_Sub2(arg2, 4, local377 + 4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
						}
						Static53.method1029(arg3, arg5, arg0, local168, local269, null, 256, local377, 0, 0, local193);
					} else if (arg6 == 8) {
						local1541 = Static111.method2060(arg3, arg5, arg0);
						local979 = 8;
						if (local1541 != 0L) {
							local979 = Static113.method2090(Integer.MAX_VALUE & (int) (local1541 >>> 32)).anInt4168 / 2;
						}
						@Pc(1805) int local1805 = arg4 + 2 & 0x3;
						@Pc(1839) Class4_Sub1_Sub1 local1839;
						if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
							@Pc(1824) Class4_Sub1_Sub10 local1824 = local48.method3193(local168, arg4 + 4, local176, local132, 4, local141);
							@Pc(1836) Class4_Sub1_Sub10 local1836 = local48.method3193(local168, local1805 + 4, local176, local132, 4, local141);
							local1839 = local1836.aClass4_Sub1_Sub1_4;
							local1580 = local1824.aClass4_Sub1_Sub1_4;
						} else {
							local1580 = new Class4_Sub1_Sub1_Sub2(arg2, 4, arg4 + 4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
							local1839 = new Class4_Sub1_Sub1_Sub2(arg2, 4, local1805 + 4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
						}
						Static53.method1029(arg3, arg5, arg0, local168, local1580, local1839, 256, arg4, local979 * Static8.anIntArray28[arg4], Static100.anIntArray237[arg4] * local979, local193);
					}
				}
			}
		} else if (!Static103.aBoolean113 || local48.anInt4175 != 0 || local48.anInt4156 == 1 || local48.aBoolean173) {
			if (local48.anInt4185 == -1 && local48.anIntArray442 == null) {
				local281 = local48.method3193(local168, arg4, local176, local132, 22, local141);
				local269 = local281.aClass4_Sub1_Sub1_4;
			} else {
				local269 = new Class4_Sub1_Sub1_Sub2(arg2, 22, arg4, arg3, arg5, arg0, local48.anInt4185, local48.aBoolean178, null);
			}
			Static43.method731(arg3, arg5, arg0, local168, local269, local193, local48.aBoolean174);
			if (local48.anInt4156 == 1 && arg1 != null) {
				arg1.method1989(arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!jd;Lclient!jd;BLclient!jd;)V")
	public static void method1709(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(3) Class46 arg2) {
		Static3.aClass46_32 = arg2;
		Static3.aClass46_40 = arg1;
		Static3.aClass46_35 = arg0;
	}
}
