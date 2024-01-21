import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!sc", name = "Tb", descriptor = "Lclient!kc;")
	public static Class11 aClass11_22;

	@OriginalMember(owner = "client!sc", name = "Vb", descriptor = "Lclient!kc;")
	public static Class11 aClass11_23;

	@OriginalMember(owner = "client!sc", name = "Wb", descriptor = "I")
	public static int anInt2484;

	@OriginalMember(owner = "client!sc", name = "Zb", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_15;

	@OriginalMember(owner = "client!sc", name = "kb", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!sc", name = "ob", descriptor = "Lclient!lc;")
	public static Class31 aClass31_855 = Static56.method1206("titlebutton");

	@OriginalMember(owner = "client!sc", name = "yb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_857 = Static56.method1206("To play on this world move to a free area first");

	@OriginalMember(owner = "client!sc", name = "zb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_858 = Static56.method1206("This world is full)3");

	@OriginalMember(owner = "client!sc", name = "Gb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_859 = Static56.method1206("Your profile will be transferred in: ");

	@OriginalMember(owner = "client!sc", name = "Jb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_860 = Static56.method1206(" has logged out)3");

	@OriginalMember(owner = "client!sc", name = "Xb", descriptor = "[I")
	public static int[] anIntArray349 = new int[25];

	@OriginalMember(owner = "client!sc", name = "cc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_862 = Static56.method1206("Enter your username (V password)3");

	@OriginalMember(owner = "client!sc", name = "lc", descriptor = "[I")
	public static int[] anIntArray352 = new int[2048];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Z")
	public static boolean method1535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 >> 14 & 0x7FFF;
		@Pc(23) int local23 = Static99.aClass64_1.method1802(Static58.anInt1945, arg1, arg2, arg0);
		if (local23 == -1) {
			return false;
		}
		@Pc(33) int local33 = local23 & 0x1F;
		@Pc(39) int local39 = local23 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(54) Class2_Sub1_Sub16 local54 = Static92.method1045(local16);
			@Pc(57) int local57 = local54.anInt2702;
			@Pc(73) int local73;
			@Pc(70) int local70;
			if (local39 == 0 || local39 == 2) {
				local73 = local54.anInt2698;
				local70 = local54.anInt2699;
			} else {
				local70 = local54.anInt2698;
				local73 = local54.anInt2699;
			}
			if (local39 != 0) {
				local57 = (local57 >> 4 - local39) + (local57 << local39 & 0xF);
			}
			Static72.method865(0, 0, true, local57, local70, local73, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], arg2, 2, arg1);
		} else {
			Static72.method865(local33 + 1, local39, true, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], arg2, 2, arg1);
		}
		Static17.anInt796 = 2;
		Static44.anInt1596 = Static15.anInt649;
		Static70.anInt2224 = Static105.anInt2783;
		Static12.anInt526 = 0;
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!kc;Lclient!lc;ILclient!lc;)[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] method1537(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(8) int local8 = arg0.method345(arg2);
		@Pc(14) int local14 = arg0.method334(local8, arg1);
		return Static83.method1462(local14, arg0, local8);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1541() {
		Static99.anInt2672 = 0;
		Static64.anInt624 = 0;
		Static61.method1308();
		Static75.method1406();
		Static9.method206();
		Static7.method177();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static99.anInt2672; local26++) {
			local32 = Static77.anIntArray318[local26];
			if (Static49.anInt2694 != Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local32].anInt2030) {
				Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local32] = null;
			}
		}
		if (Static87.anInt2339 != Static3.aClass2_Sub6_Sub1_1.anInt952) {
			throw new RuntimeException("gpp1 pos:" + Static3.aClass2_Sub6_Sub1_1.anInt952 + " psize:" + Static87.anInt2339);
		}
		for (local32 = 0; local32 < Static21.anInt1007; local32++) {
			if (Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[Static78.anIntArray322[local32]] == null) {
				throw new RuntimeException("gpp2 pos:" + local32 + " size:" + Static21.anInt1007);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!kc;Lclient!kc;)V")
	public static void method1542(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static89.aClass11_19 = arg1;
		aClass11_22 = arg0;
		Static27.anInt1160 = Static89.aClass11_19.method325(3);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z)Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 method1543() {
		@Pc(7) Class2_Sub1_Sub3_Sub1 local7 = new Class2_Sub1_Sub3_Sub1();
		local7.anInt435 = Static58.anInt1946;
		local7.anInt434 = Static15.anInt655;
		local7.anInt431 = Static95.anIntArray366[0];
		local7.anInt433 = Static76.anIntArray316[0];
		local7.anInt432 = Static50.anIntArray74[0];
		local7.anInt436 = anIntArray346[0];
		local7.anIntArray60 = Static67.anIntArray301;
		local7.aByteArray7 = Static77.aByteArrayArray10[0];
		Static4.method95();
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!wd;ILclient!vb;IIIIII)V")
	public static void method1544(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static10.aBoolean28 && (Static34.aByteArrayArrayArray17[0][arg5][arg4] & 0x2) == 0) {
			if ((Static34.aByteArrayArrayArray17[arg6][arg5][arg4] & 0x10) != 0) {
				return;
			}
			if (Static89.method1496(arg4, arg6, arg5) != Static87.anInt2341) {
				return;
			}
		}
		if (arg6 < Static76.anInt2263) {
			Static76.anInt2263 = arg6;
		}
		@Pc(64) int local64 = Static16.anIntArrayArrayArray1[arg6][arg5][arg4];
		@Pc(76) int local76 = Static16.anIntArrayArrayArray1[arg6][arg5 + 1][arg4 + 1];
		@Pc(86) int local86 = Static16.anIntArrayArrayArray1[arg6][arg5 + 1][arg4];
		@Pc(96) int local96 = Static16.anIntArrayArrayArray1[arg6][arg5][arg4 + 1];
		@Pc(106) int local106 = local86 + local64 + local76 + local96 >> 2;
		@Pc(110) Class2_Sub1_Sub16 local110 = Static92.method1045(arg3);
		@Pc(116) int local116 = arg7 + (arg1 << 6);
		if (local110.anInt2701 == 1) {
			local116 += 256;
		}
		@Pc(135) int local135 = (arg3 << 14) + (arg4 << 7) + arg5 + 1073741824;
		if (local110.anInt2722 == 0) {
			local135 += Integer.MIN_VALUE;
		}
		@Pc(177) Class2_Sub1_Sub4 local177;
		if (arg7 != 22) {
			@Pc(277) int local277;
			if (arg7 == 10 || arg7 == 11) {
				if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
					local177 = local110.method1704(local96, 10, local64, local86, local76, arg1);
				} else {
					local177 = new Class2_Sub1_Sub4_Sub3(arg3, 10, arg1, local64, local86, local76, local96, local110.anInt2703, true);
				}
				if (local177 != null) {
					@Pc(274) int local274;
					if (arg1 == 1 || arg1 == 3) {
						local274 = local110.anInt2698;
						local277 = local110.anInt2699;
					} else {
						local277 = local110.anInt2698;
						local274 = local110.anInt2699;
					}
					@Pc(287) int local287 = 0;
					if (arg7 == 11) {
						local287 += 256;
					}
					if (arg0.method1779(arg6, arg5, arg4, local106, local277, local274, local177, local287, local135, local116) && local110.aBoolean147) {
						@Pc(320) Class2_Sub1_Sub4_Sub5 local320;
						if (local177 instanceof Class2_Sub1_Sub4_Sub5) {
							local320 = (Class2_Sub1_Sub4_Sub5) local177;
						} else {
							local320 = local110.method1704(local96, 10, local64, local86, local76, arg1);
						}
						if (local320 != null) {
							for (@Pc(329) int local329 = 0; local329 <= local277; local329++) {
								for (@Pc(333) int local333 = 0; local333 <= local274; local333++) {
									@Pc(340) int local340 = local320.method921() / 4;
									if (local340 > 30) {
										local340 = 30;
									}
									if (Static77.aByteArrayArrayArray30[arg6][arg5 + local329][arg4 + local333] < local340) {
										Static77.aByteArrayArrayArray30[arg6][arg5 + local329][local333 + arg4] = (byte) local340;
									}
								}
							}
						}
					}
				}
				if (local110.aBoolean144 && arg2 != null) {
					arg2.method1719(arg5, local110.aBoolean145, local110.anInt2698, local110.anInt2699, arg4, arg1);
				}
			} else if (arg7 >= 12) {
				if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
					local177 = local110.method1704(local96, arg7, local64, local86, local76, arg1);
				} else {
					local177 = new Class2_Sub1_Sub4_Sub3(arg3, arg7, arg1, local64, local86, local76, local96, local110.anInt2703, true);
				}
				arg0.method1779(arg6, arg5, arg4, local106, 1, 1, local177, 0, local135, local116);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg6 > 0) {
					Static76.anIntArrayArrayArray3[arg6][arg5][arg4] |= 0x924;
				}
				if (local110.aBoolean144 && arg2 != null) {
					arg2.method1719(arg5, local110.aBoolean145, local110.anInt2698, local110.anInt2699, arg4, arg1);
				}
			} else if (arg7 == 0) {
				if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
					local177 = local110.method1704(local96, 0, local64, local86, local76, arg1);
				} else {
					local177 = new Class2_Sub1_Sub4_Sub3(arg3, 0, arg1, local64, local86, local76, local96, local110.anInt2703, true);
				}
				arg0.method1767(arg6, arg5, arg4, local106, local177, null, Static34.anIntArray171[arg1], 0, local135, local116);
				if (arg1 == 0) {
					if (local110.aBoolean147) {
						Static77.aByteArrayArrayArray30[arg6][arg5][arg4] = 50;
						Static77.aByteArrayArrayArray30[arg6][arg5][arg4 + 1] = 50;
					}
					if (local110.aBoolean148) {
						Static76.anIntArrayArrayArray3[arg6][arg5][arg4] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local110.aBoolean147) {
						Static77.aByteArrayArrayArray30[arg6][arg5][arg4 + 1] = 50;
						Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4 + 1] = 50;
					}
					if (local110.aBoolean148) {
						Static76.anIntArrayArrayArray3[arg6][arg5][arg4 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local110.aBoolean147) {
						Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4] = 50;
						Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4 + 1] = 50;
					}
					if (local110.aBoolean148) {
						Static76.anIntArrayArrayArray3[arg6][arg5 + 1][arg4] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local110.aBoolean147) {
						Static77.aByteArrayArrayArray30[arg6][arg5][arg4] = 50;
						Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4] = 50;
					}
					if (local110.aBoolean148) {
						Static76.anIntArrayArrayArray3[arg6][arg5][arg4] |= 0x492;
					}
				}
				if (local110.aBoolean144 && arg2 != null) {
					arg2.method1725(arg4, arg1, arg5, arg7, local110.aBoolean145);
				}
				if (local110.anInt2721 != 16) {
					arg0.method1780(arg6, arg5, arg4, local110.anInt2721);
				}
			} else if (arg7 == 1) {
				if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
					local177 = local110.method1704(local96, 1, local64, local86, local76, arg1);
				} else {
					local177 = new Class2_Sub1_Sub4_Sub3(arg3, 1, arg1, local64, local86, local76, local96, local110.anInt2703, true);
				}
				arg0.method1767(arg6, arg5, arg4, local106, local177, null, Static44.anIntArray247[arg1], 0, local135, local116);
				if (local110.aBoolean147) {
					if (arg1 == 0) {
						Static77.aByteArrayArrayArray30[arg6][arg5][arg4 + 1] = 50;
					} else if (arg1 == 1) {
						Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4 + 1] = 50;
					} else if (arg1 == 2) {
						Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4] = 50;
					} else if (arg1 == 3) {
						Static77.aByteArrayArrayArray30[arg6][arg5][arg4] = 50;
					}
				}
				if (local110.aBoolean144 && arg2 != null) {
					arg2.method1725(arg4, arg1, arg5, arg7, local110.aBoolean145);
				}
			} else {
				@Pc(932) int local932;
				@Pc(964) Class2_Sub1_Sub4 local964;
				if (arg7 == 2) {
					local932 = arg1 + 1 & 0x3;
					@Pc(954) Class2_Sub1_Sub4 local954;
					if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
						local954 = local110.method1704(local96, 2, local64, local86, local76, arg1 + 4);
						local964 = local110.method1704(local96, 2, local64, local86, local76, local932);
					} else {
						local954 = new Class2_Sub1_Sub4_Sub3(arg3, 2, arg1 + 4, local64, local86, local76, local96, local110.anInt2703, true);
						local964 = new Class2_Sub1_Sub4_Sub3(arg3, 2, local932, local64, local86, local76, local96, local110.anInt2703, true);
					}
					arg0.method1767(arg6, arg5, arg4, local106, local954, local964, Static34.anIntArray171[arg1], Static34.anIntArray171[local932], local135, local116);
					if (local110.aBoolean148) {
						if (arg1 == 0) {
							Static76.anIntArrayArrayArray3[arg6][arg5][arg4] |= 0x249;
							Static76.anIntArrayArrayArray3[arg6][arg5][arg4 + 1] |= 0x492;
						} else if (arg1 == 1) {
							Static76.anIntArrayArrayArray3[arg6][arg5][arg4 + 1] |= 0x492;
							Static76.anIntArrayArrayArray3[arg6][arg5 + 1][arg4] |= 0x249;
						} else if (arg1 == 2) {
							Static76.anIntArrayArrayArray3[arg6][arg5 + 1][arg4] |= 0x249;
							Static76.anIntArrayArrayArray3[arg6][arg5][arg4] |= 0x492;
						} else if (arg1 == 3) {
							Static76.anIntArrayArrayArray3[arg6][arg5][arg4] |= 0x492;
							Static76.anIntArrayArrayArray3[arg6][arg5][arg4] |= 0x249;
						}
					}
					if (local110.aBoolean144 && arg2 != null) {
						arg2.method1725(arg4, arg1, arg5, arg7, local110.aBoolean145);
					}
					if (local110.anInt2721 != 16) {
						arg0.method1780(arg6, arg5, arg4, local110.anInt2721);
					}
				} else if (arg7 == 3) {
					if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
						local177 = local110.method1704(local96, 3, local64, local86, local76, arg1);
					} else {
						local177 = new Class2_Sub1_Sub4_Sub3(arg3, 3, arg1, local64, local86, local76, local96, local110.anInt2703, true);
					}
					arg0.method1767(arg6, arg5, arg4, local106, local177, null, Static44.anIntArray247[arg1], 0, local135, local116);
					if (local110.aBoolean147) {
						if (arg1 == 0) {
							Static77.aByteArrayArrayArray30[arg6][arg5][arg4 + 1] = 50;
						} else if (arg1 == 1) {
							Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4 + 1] = 50;
						} else if (arg1 == 2) {
							Static77.aByteArrayArrayArray30[arg6][arg5 + 1][arg4] = 50;
						} else if (arg1 == 3) {
							Static77.aByteArrayArrayArray30[arg6][arg5][arg4] = 50;
						}
					}
					if (local110.aBoolean144 && arg2 != null) {
						arg2.method1725(arg4, arg1, arg5, arg7, local110.aBoolean145);
					}
				} else if (arg7 == 9) {
					if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
						local177 = local110.method1704(local96, arg7, local64, local86, local76, arg1);
					} else {
						local177 = new Class2_Sub1_Sub4_Sub3(arg3, arg7, arg1, local64, local86, local76, local96, local110.anInt2703, true);
					}
					arg0.method1779(arg6, arg5, arg4, local106, 1, 1, local177, 0, local135, local116);
					if (local110.aBoolean144 && arg2 != null) {
						arg2.method1719(arg5, local110.aBoolean145, local110.anInt2698, local110.anInt2699, arg4, arg1);
					}
				} else {
					if (local110.aBoolean149) {
						if (arg1 == 1) {
							local932 = local96;
							local96 = local76;
							local76 = local86;
							local86 = local64;
							local64 = local932;
						} else if (arg1 == 2) {
							local932 = local96;
							local96 = local86;
							local86 = local932;
							local932 = local76;
							local76 = local64;
							local64 = local932;
						} else if (arg1 == 3) {
							local932 = local96;
							local96 = local64;
							local64 = local86;
							local86 = local76;
							local76 = local932;
						}
					}
					if (arg7 == 4) {
						if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
							local177 = local110.method1704(local96, 4, local64, local86, local76, 0);
						} else {
							local177 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local64, local86, local76, local96, local110.anInt2703, true);
						}
						arg0.method1805(arg6, arg5, arg4, local106, local177, Static34.anIntArray171[arg1], arg1 * 512, 0, 0, local135, local116);
					} else if (arg7 == 5) {
						local932 = 16;
						local277 = arg0.method1757(arg6, arg5, arg4);
						if (local277 > 0) {
							local932 = Static92.method1045(local277 >> 14 & 0x7FFF).anInt2721;
						}
						if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
							local964 = local110.method1704(local96, 4, local64, local86, local76, 0);
						} else {
							local964 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local64, local86, local76, local96, local110.anInt2703, true);
						}
						arg0.method1805(arg6, arg5, arg4, local106, local964, Static34.anIntArray171[arg1], arg1 * 512, local932 * Static77.anIntArray317[arg1], Static40.anIntArray280[arg1] * local932, local135, local116);
					} else if (arg7 == 6) {
						if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
							local177 = local110.method1704(local96, 4, local64, local86, local76, 0);
						} else {
							local177 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local64, local86, local76, local96, local110.anInt2703, true);
						}
						arg0.method1805(arg6, arg5, arg4, local106, local177, 256, arg1, 0, 0, local135, local116);
					} else if (arg7 == 7) {
						if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
							local177 = local110.method1704(local96, 4, local64, local86, local76, 0);
						} else {
							local177 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local64, local86, local76, local96, local110.anInt2703, true);
						}
						arg0.method1805(arg6, arg5, arg4, local106, local177, 512, arg1, 0, 0, local135, local116);
					} else if (arg7 == 8) {
						if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
							local177 = local110.method1704(local96, 4, local64, local86, local76, 0);
						} else {
							local177 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local64, local86, local76, local96, local110.anInt2703, true);
						}
						arg0.method1805(arg6, arg5, arg4, local106, local177, 768, arg1, 0, 0, local135, local116);
					}
				}
			}
		} else if (!Static10.aBoolean28 || local110.anInt2722 != 0 || local110.aBoolean146) {
			if (local110.anInt2703 == -1 && local110.anIntArray388 == null) {
				local177 = local110.method1704(local96, 22, local64, local86, local76, arg1);
			} else {
				local177 = new Class2_Sub1_Sub4_Sub3(arg3, 22, arg1, local64, local86, local76, local96, local110.anInt2703, true);
			}
			arg0.method1798(arg6, arg5, arg4, local106, local177, local135, local116);
			if (local110.aBoolean144 && local110.anInt2722 == 1 && arg2 != null) {
				arg2.method1728(arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method1547() {
		aClass31_859 = null;
		aClass2_Sub1_Sub3_Sub1_15 = null;
		aClass31_862 = null;
		aClass31_855 = null;
		aClass11_22 = null;
		anIntArray352 = null;
		anIntArray349 = null;
		aClass31_857 = null;
		aClass31_858 = null;
		aClass31_860 = null;
		anIntArray346 = null;
		aClass11_23 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)V")
	public static void method1548(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static100.method1713(arg0 - 1L);
			Static100.method1713(1L);
		} else {
			Static100.method1713(arg0);
		}
	}
}
