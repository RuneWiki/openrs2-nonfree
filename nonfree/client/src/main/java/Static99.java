import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public static int anInt2032 = 0;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	public static int anInt2033 = 0;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_951 = Static14.method2017("Hidden)2");

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	public static int anInt2035 = 0;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_952 = Static14.method2017("(Udns");

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!kc;")
	public static Class36 aClass36_953 = Static14.method2017("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "Lclient!kc;")
	private static Class36 aClass36_954 = Static14.method2017("No reply from loginserver)3");

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Lclient!kc;")
	public static Class36 aClass36_955 = aClass36_954;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "[Lclient!kc;")
	public static Class36[] aClass36Array35 = new Class36[100];

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "[I")
	public static int[] anIntArray243 = new int[2048];

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!kc;")
	public static Class36 aClass36_956 = Static14.method2017("Offline");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILclient!ad;Lclient!sa;II)V")
	public static void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4 arg4, @OriginalArg(6) Class61 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static35.aBoolean51 && (Static16.aByteArrayArrayArray3[0][arg6][arg1] & 0x2) == 0) {
			if ((Static16.aByteArrayArrayArray3[arg7][arg6][arg1] & 0x10) != 0) {
				return;
			}
			if (Static83.method1509(arg1, arg7, arg6) != Static14.anInt2900) {
				return;
			}
		}
		if (Static53.anInt1481 > arg7) {
			Static53.anInt1481 = arg7;
		}
		@Pc(60) int local60 = Static27.anIntArrayArrayArray4[arg7][arg6][arg1];
		@Pc(70) int local70 = Static27.anIntArrayArrayArray4[arg7][arg6 + 1][arg1];
		@Pc(82) int local82 = Static27.anIntArrayArrayArray4[arg7][arg6 + 1][arg1 + 1];
		@Pc(92) int local92 = Static27.anIntArrayArrayArray4[arg7][arg6][arg1 + 1];
		@Pc(98) Class2_Sub1_Sub13 local98 = Static2.method2072(arg3);
		@Pc(109) int local109 = local60 + local70 + local82 + local92 >> 2;
		@Pc(116) int local116 = (arg2 << 6) + arg0;
		if (local98.anInt2314 == 1) {
			local116 += 256;
		}
		@Pc(133) int local133 = (arg3 << 14) + (arg1 << 7) + arg6 + 1073741824;
		if (local98.anInt2303 == 0) {
			local133 += Integer.MIN_VALUE;
		}
		if (local98.method1626()) {
			Static14.method2019(arg6, arg1, arg2, local98, arg7);
		}
		@Pc(188) Class2_Sub1_Sub4 local188;
		if (arg0 != 22) {
			@Pc(284) int local284;
			if (arg0 == 10 || arg0 == 11) {
				if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
					local188 = local98.method1629(local82, arg2, local70, local60, 10, local92);
				} else {
					local188 = new Class2_Sub1_Sub4_Sub6(arg3, 10, arg2, local60, local70, local82, local92, local98.anInt2300, true, null);
				}
				if (local188 != null) {
					@Pc(281) int local281;
					if (arg2 == 1 || arg2 == 3) {
						local281 = local98.anInt2326;
						local284 = local98.anInt2288;
					} else {
						local284 = local98.anInt2326;
						local281 = local98.anInt2288;
					}
					@Pc(294) int local294 = 0;
					if (arg0 == 11) {
						local294 += 256;
					}
					if (arg5.method1731(arg7, arg6, arg1, local109, local284, local281, local188, local294, local133, local116) && local98.aBoolean98) {
						@Pc(327) Class2_Sub1_Sub4_Sub1 local327;
						if (local188 instanceof Class2_Sub1_Sub4_Sub1) {
							local327 = (Class2_Sub1_Sub4_Sub1) local188;
						} else {
							local327 = local98.method1629(local82, arg2, local70, local60, 10, local92);
						}
						if (local327 != null) {
							for (@Pc(336) int local336 = 0; local336 <= local284; local336++) {
								for (@Pc(340) int local340 = 0; local340 <= local281; local340++) {
									@Pc(347) int local347 = local327.method656() / 4;
									if (local347 > 30) {
										local347 = 30;
									}
									if (local347 > Static35.aByteArrayArrayArray5[arg7][local336 + arg6][arg1 + local340]) {
										Static35.aByteArrayArrayArray5[arg7][arg6 + local336][local340 + arg1] = (byte) local347;
									}
								}
							}
						}
					}
				}
				if (local98.aBoolean95 && arg4 != null) {
					arg4.method137(local98.anInt2288, arg2, local98.aBoolean103, local98.anInt2326, arg6, arg1);
				}
			} else if (arg0 >= 12) {
				if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
					local188 = local98.method1629(local82, arg2, local70, local60, arg0, local92);
				} else {
					local188 = new Class2_Sub1_Sub4_Sub6(arg3, arg0, arg2, local60, local70, local82, local92, local98.anInt2300, true, null);
				}
				arg5.method1731(arg7, arg6, arg1, local109, 1, 1, local188, 0, local133, local116);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
					Static20.anIntArrayArrayArray3[arg7][arg6][arg1] |= 0x924;
				}
				if (local98.aBoolean95 && arg4 != null) {
					arg4.method137(local98.anInt2288, arg2, local98.aBoolean103, local98.anInt2326, arg6, arg1);
				}
			} else if (arg0 == 0) {
				if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
					local188 = local98.method1629(local82, arg2, local70, local60, 0, local92);
				} else {
					local188 = new Class2_Sub1_Sub4_Sub6(arg3, 0, arg2, local60, local70, local82, local92, local98.anInt2300, true, null);
				}
				arg5.method1692(arg7, arg6, arg1, local109, local188, null, Static88.anIntArray268[arg2], 0, local133, local116);
				if (arg2 == 0) {
					if (local98.aBoolean98) {
						Static35.aByteArrayArrayArray5[arg7][arg6][arg1] = 50;
						Static35.aByteArrayArrayArray5[arg7][arg6][arg1 + 1] = 50;
					}
					if (local98.aBoolean96) {
						Static20.anIntArrayArrayArray3[arg7][arg6][arg1] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local98.aBoolean98) {
						Static35.aByteArrayArrayArray5[arg7][arg6][arg1 + 1] = 50;
						Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1 + 1] = 50;
					}
					if (local98.aBoolean96) {
						Static20.anIntArrayArrayArray3[arg7][arg6][arg1 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local98.aBoolean98) {
						Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1] = 50;
						Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1 + 1] = 50;
					}
					if (local98.aBoolean96) {
						Static20.anIntArrayArrayArray3[arg7][arg6 + 1][arg1] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local98.aBoolean98) {
						Static35.aByteArrayArrayArray5[arg7][arg6][arg1] = 50;
						Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1] = 50;
					}
					if (local98.aBoolean96) {
						Static20.anIntArrayArrayArray3[arg7][arg6][arg1] |= 0x492;
					}
				}
				if (local98.aBoolean95 && arg4 != null) {
					arg4.method127(local98.aBoolean103, arg6, arg0, arg1, arg2);
				}
				if (local98.anInt2302 != 16) {
					arg5.method1723(arg7, arg6, arg1, local98.anInt2302);
				}
			} else if (arg0 == 1) {
				if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
					local188 = local98.method1629(local82, arg2, local70, local60, 1, local92);
				} else {
					local188 = new Class2_Sub1_Sub4_Sub6(arg3, 1, arg2, local60, local70, local82, local92, local98.anInt2300, true, null);
				}
				arg5.method1692(arg7, arg6, arg1, local109, local188, null, Static97.anIntArray315[arg2], 0, local133, local116);
				if (local98.aBoolean98) {
					if (arg2 == 0) {
						Static35.aByteArrayArrayArray5[arg7][arg6][arg1 + 1] = 50;
					} else if (arg2 == 1) {
						Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1 + 1] = 50;
					} else if (arg2 == 2) {
						Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1] = 50;
					} else if (arg2 == 3) {
						Static35.aByteArrayArrayArray5[arg7][arg6][arg1] = 50;
					}
				}
				if (local98.aBoolean95 && arg4 != null) {
					arg4.method127(local98.aBoolean103, arg6, arg0, arg1, arg2);
				}
			} else {
				@Pc(935) int local935;
				@Pc(966) Class2_Sub1_Sub4 local966;
				if (arg0 == 2) {
					local935 = arg2 + 1 & 0x3;
					@Pc(956) Class2_Sub1_Sub4 local956;
					if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
						local956 = local98.method1629(local82, arg2 + 4, local70, local60, 2, local92);
						local966 = local98.method1629(local82, local935, local70, local60, 2, local92);
					} else {
						local956 = new Class2_Sub1_Sub4_Sub6(arg3, 2, arg2 + 4, local60, local70, local82, local92, local98.anInt2300, true, null);
						local966 = new Class2_Sub1_Sub4_Sub6(arg3, 2, local935, local60, local70, local82, local92, local98.anInt2300, true, null);
					}
					arg5.method1692(arg7, arg6, arg1, local109, local956, local966, Static88.anIntArray268[arg2], Static88.anIntArray268[local935], local133, local116);
					if (local98.aBoolean96) {
						if (arg2 == 0) {
							Static20.anIntArrayArrayArray3[arg7][arg6][arg1] |= 0x249;
							Static20.anIntArrayArrayArray3[arg7][arg6][arg1 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static20.anIntArrayArrayArray3[arg7][arg6][arg1 + 1] |= 0x492;
							Static20.anIntArrayArrayArray3[arg7][arg6 + 1][arg1] |= 0x249;
						} else if (arg2 == 2) {
							Static20.anIntArrayArrayArray3[arg7][arg6 + 1][arg1] |= 0x249;
							Static20.anIntArrayArrayArray3[arg7][arg6][arg1] |= 0x492;
						} else if (arg2 == 3) {
							Static20.anIntArrayArrayArray3[arg7][arg6][arg1] |= 0x492;
							Static20.anIntArrayArrayArray3[arg7][arg6][arg1] |= 0x249;
						}
					}
					if (local98.aBoolean95 && arg4 != null) {
						arg4.method127(local98.aBoolean103, arg6, arg0, arg1, arg2);
					}
					if (local98.anInt2302 != 16) {
						arg5.method1723(arg7, arg6, arg1, local98.anInt2302);
					}
				} else if (arg0 == 3) {
					if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
						local188 = local98.method1629(local82, arg2, local70, local60, 3, local92);
					} else {
						local188 = new Class2_Sub1_Sub4_Sub6(arg3, 3, arg2, local60, local70, local82, local92, local98.anInt2300, true, null);
					}
					arg5.method1692(arg7, arg6, arg1, local109, local188, null, Static97.anIntArray315[arg2], 0, local133, local116);
					if (local98.aBoolean98) {
						if (arg2 == 0) {
							Static35.aByteArrayArrayArray5[arg7][arg6][arg1 + 1] = 50;
						} else if (arg2 == 1) {
							Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1 + 1] = 50;
						} else if (arg2 == 2) {
							Static35.aByteArrayArrayArray5[arg7][arg6 + 1][arg1] = 50;
						} else if (arg2 == 3) {
							Static35.aByteArrayArrayArray5[arg7][arg6][arg1] = 50;
						}
					}
					if (local98.aBoolean95 && arg4 != null) {
						arg4.method127(local98.aBoolean103, arg6, arg0, arg1, arg2);
					}
				} else if (arg0 == 9) {
					if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
						local188 = local98.method1629(local82, arg2, local70, local60, arg0, local92);
					} else {
						local188 = new Class2_Sub1_Sub4_Sub6(arg3, arg0, arg2, local60, local70, local82, local92, local98.anInt2300, true, null);
					}
					arg5.method1731(arg7, arg6, arg1, local109, 1, 1, local188, 0, local133, local116);
					if (local98.aBoolean95 && arg4 != null) {
						arg4.method137(local98.anInt2288, arg2, local98.aBoolean103, local98.anInt2326, arg6, arg1);
					}
				} else {
					if (local98.aBoolean101) {
						if (arg2 == 1) {
							local935 = local92;
							local92 = local82;
							local82 = local70;
							local70 = local60;
							local60 = local935;
						} else if (arg2 == 2) {
							local935 = local92;
							local92 = local70;
							local70 = local935;
							local935 = local82;
							local82 = local60;
							local60 = local935;
						} else if (arg2 == 3) {
							local935 = local92;
							local92 = local60;
							local60 = local70;
							local70 = local82;
							local82 = local935;
						}
					}
					if (arg0 == 4) {
						if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
							local188 = local98.method1629(local82, 0, local70, local60, 4, local92);
						} else {
							local188 = new Class2_Sub1_Sub4_Sub6(arg3, 4, 0, local60, local70, local82, local92, local98.anInt2300, true, null);
						}
						arg5.method1701(arg7, arg6, arg1, local109, local188, Static88.anIntArray268[arg2], arg2 * 512, 0, 0, local133, local116);
					} else if (arg0 == 5) {
						local284 = arg5.method1710(arg7, arg6, arg1);
						local935 = 16;
						if (local284 > 0) {
							local935 = Static2.method2072(local284 >> 14 & 0x7FFF).anInt2302;
						}
						if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
							local966 = local98.method1629(local82, 0, local70, local60, 4, local92);
						} else {
							local966 = new Class2_Sub1_Sub4_Sub6(arg3, 4, 0, local60, local70, local82, local92, local98.anInt2300, true, null);
						}
						arg5.method1701(arg7, arg6, arg1, local109, local966, Static88.anIntArray268[arg2], arg2 * 512, local935 * Static38.anIntArray145[arg2], Static92.anIntArray285[arg2] * local935, local133, local116);
					} else if (arg0 == 6) {
						if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
							local188 = local98.method1629(local82, 0, local70, local60, 4, local92);
						} else {
							local188 = new Class2_Sub1_Sub4_Sub6(arg3, 4, 0, local60, local70, local82, local92, local98.anInt2300, true, null);
						}
						arg5.method1701(arg7, arg6, arg1, local109, local188, 256, arg2, 0, 0, local133, local116);
					} else if (arg0 == 7) {
						if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
							local188 = local98.method1629(local82, 0, local70, local60, 4, local92);
						} else {
							local188 = new Class2_Sub1_Sub4_Sub6(arg3, 4, 0, local60, local70, local82, local92, local98.anInt2300, true, null);
						}
						arg5.method1701(arg7, arg6, arg1, local109, local188, 512, arg2, 0, 0, local133, local116);
					} else if (arg0 == 8) {
						if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
							local188 = local98.method1629(local82, 0, local70, local60, 4, local92);
						} else {
							local188 = new Class2_Sub1_Sub4_Sub6(arg3, 4, 0, local60, local70, local82, local92, local98.anInt2300, true, null);
						}
						arg5.method1701(arg7, arg6, arg1, local109, local188, 768, arg2, 0, 0, local133, local116);
					}
				}
			}
		} else if (!Static35.aBoolean51 || local98.anInt2303 != 0 || local98.aBoolean94) {
			if (local98.anInt2300 == -1 && local98.anIntArray275 == null) {
				local188 = local98.method1629(local82, arg2, local70, local60, 22, local92);
			} else {
				local188 = new Class2_Sub1_Sub4_Sub6(arg3, 22, arg2, local60, local70, local82, local92, local98.anInt2300, true, null);
			}
			arg5.method1706(arg7, arg6, arg1, local109, local188, local133, local116);
			if (local98.aBoolean95 && local98.anInt2303 == 1 && arg4 != null) {
				arg4.method138(arg6, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1471(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static52.aClass32_1);
		arg0.removeMouseMotionListener(Static52.aClass32_1);
		arg0.removeFocusListener(Static52.aClass32_1);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method1473() {
		Static25.aFontMetrics1 = null;
		Static14.anImage34 = null;
		Static100.aFont1 = null;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
	public static void method1475() {
		aClass36_954 = null;
		aClass36_953 = null;
		aClass36_951 = null;
		aClass36_952 = null;
		aClass36Array35 = null;
		aClass36_955 = null;
		anIntArray243 = null;
		aClass36_956 = null;
		aBooleanArray12 = null;
		aBigInteger3 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lclient!me;")
	public static Class2_Sub1_Sub11 method1476(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub11 local10 = (Class2_Sub1_Sub11) Static23.aClass22_6.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static55.aClass3_24.method928(arg0, 13);
		local10 = new Class2_Sub1_Sub11();
		local10.anInt1686 = arg0;
		if (local25 != null) {
			local10.method1155(new Class2_Sub12(local25));
		}
		Static23.aClass22_6.method712(local10, (long) arg0);
		return local10;
	}
}
