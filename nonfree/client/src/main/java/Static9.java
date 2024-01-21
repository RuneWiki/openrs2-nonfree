import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_1;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_1;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] aClass1_Sub1_Sub6_Sub3Array1;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!rb;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!rb;")
	public static Class55 aClass55_3;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_160 = Static15.method178("Neuer Benutzer");

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_161 = Static15.method178(": ");

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean6 = false;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_162 = Static15.method178("Benutzername: ");

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_163 = Static15.method178("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public static int anInt195 = 0;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "[I")
	public static int[] anIntArray38 = new int[1000];

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "Lclient!gd;")
	private static Class23 aClass23_164 = Static15.method178("Prepared sound engine");

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_165 = aClass23_164;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!ba;")
	public static Class5 aClass5_7 = new Class5(100);

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
	public static int[] anIntArray39 = new int[4000];

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	public static final int anInt201 = 2301979;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method102() {
		Static7.aClass14_2 = new Class14(32);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method103() {
		aClass1_Sub1_Sub6_Sub1_1 = null;
		aClass23_163 = null;
		anIntArray39 = null;
		aClass55_2 = null;
		aClass1_Sub1_Sub6_Sub3_1 = null;
		aClass5_7 = null;
		aClass23_165 = null;
		aClass23_161 = null;
		aClass1_Sub1_Sub6_Sub3Array1 = null;
		aClass55_3 = null;
		anIntArray40 = null;
		aClass23_164 = null;
		aClass23_162 = null;
		anIntArray38 = null;
		aClass23_160 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I")
	public static int method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public static void method105() {
		Static51.anImage1 = null;
		Static44.aFontMetrics1 = null;
		Static29.aFont1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!gd;BLclient!ee;)Lclient!gd;")
	public static Class23 method106(@OriginalArg(0) Class23 arg0, @OriginalArg(2) Class1_Sub1_Sub7 arg1) {
		if (arg0.method528(Static16.aClass23_241) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(20) int local20 = arg0.method528(Static7.aClass23_139);
			if (local20 == -1) {
				while (true) {
					local20 = arg0.method528(Static62.aClass23_1066);
					if (local20 == -1) {
						while (true) {
							local20 = arg0.method528(Static58.aClass23_1676);
							if (local20 == -1) {
								while (true) {
									local20 = arg0.method528(Static109.aClass23_1685);
									if (local20 == -1) {
										while (true) {
											local20 = arg0.method528(Static111.aClass23_1703);
											if (local20 == -1) {
												while (true) {
													local20 = arg0.method528(Static92.aClass23_1713);
													if (local20 == -1) {
														return arg0;
													}
													@Pc(227) Class23 local227 = Static104.aClass23_1523;
													if (Static76.aClass62_37 != null) {
														local227 = Static11.method119(Static76.aClass62_37.anInt2573);
														try {
															if (Static76.aClass62_37.anObject4 != null) {
																@Pc(243) byte[] local243 = ((String) Static76.aClass62_37.anObject4).getBytes("ISO-8859-1");
																local227 = Static42.method904(local243.length, local243, 0);
															}
														} catch (@Pc(252) UnsupportedEncodingException local252) {
														}
													}
													arg0 = Static17.method233(new Class23[] { arg0.method512(0, local20), local227, arg0.method510(local20 + 4) });
												}
											}
											arg0 = Static17.method233(new Class23[] { arg0.method512(0, local20), Static88.method712(Static12.method1547(4, arg1)), arg0.method510(local20 + 2) });
										}
									}
									arg0 = Static17.method233(new Class23[] { arg0.method512(0, local20), Static88.method712(Static12.method1547(3, arg1)), arg0.method510(local20 + 2) });
								}
							}
							arg0 = Static17.method233(new Class23[] { arg0.method512(0, local20), Static88.method712(Static12.method1547(2, arg1)), arg0.method510(local20 + 2) });
						}
					}
					arg0 = Static17.method233(new Class23[] { arg0.method512(0, local20), Static88.method712(Static12.method1547(1, arg1)), arg0.method510(local20 + 2) });
				}
			}
			arg0 = Static17.method233(new Class23[] { arg0.method512(0, local20), Static88.method712(Static12.method1547(0, arg1)), arg0.method510(local20 + 2) });
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method107() {
		@Pc(5) int local5 = -1;
		if (Static115.anInt2955 == 0 && Static94.anInt2487 == 0) {
			Static82.method1457(Static32.anInt1007, Static110.anInt2872, Static104.aClass23_1523, Static39.aClass23_722, 45, 0);
		}
		for (@Pc(37) int local37 = 0; local37 < Static81.anInt2308; local37++) {
			@Pc(42) int local42 = Static81.anIntArray305[local37];
			@Pc(48) int local48 = local42 >> 7 & 0x7F;
			@Pc(54) int local54 = local42 >> 29 & 0x3;
			@Pc(58) int local58 = local42 & 0x7F;
			@Pc(64) int local64 = local42 >> 14 & 0x7FFF;
			if (local5 != local42) {
				local5 = local42;
				@Pc(124) int local124;
				if (local54 == 2 && Static19.aClass65_1.method1730(Static79.anInt2137, local58, local48, local42) >= 0) {
					@Pc(90) Class1_Sub1_Sub4 local90 = Static97.method1645(local64);
					if (local90.anIntArray54 != null) {
						local90 = local90.method176();
					}
					if (local90 == null) {
						continue;
					}
					if (Static115.anInt2955 == 1) {
						Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static87.aClass23_1690, Static33.aClass23_570, local90.aClass23_232 }), Static73.aClass23_1201, 38, local42);
					} else if (Static94.anInt2487 != 1) {
						@Pc(114) Class23[] local114 = local90.aClass23Array7;
						if (Static5.aBoolean2) {
							local114 = Static102.method1710(local114);
						}
						if (local114 != null) {
							for (local124 = 4; local124 >= 0; local124--) {
								if (local114[local124] != null) {
									@Pc(131) short local131 = 0;
									if (local124 == 0) {
										local131 = 15;
									}
									if (local124 == 1) {
										local131 = 3;
									}
									if (local124 == 2) {
										local131 = 48;
									}
									if (local124 == 3) {
										local131 = 57;
									}
									if (local124 == 4) {
										local131 = 1001;
									}
									Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static96.aClass23_975, local90.aClass23_232 }), local114[local124], local131, local42);
								}
							}
						}
						Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static96.aClass23_975, local90.aClass23_232 }), Static43.aClass23_773, 1005, local90.anInt330 << 14);
					} else if ((Static90.anInt2427 & 0x4) == 4) {
						Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static1.aClass23_53, Static33.aClass23_570, local90.aClass23_232 }), Static3.aClass23_96, 51, local42);
					}
				}
				@Pc(310) int local310;
				@Pc(317) Class1_Sub1_Sub2_Sub1_Sub1 local317;
				@Pc(365) Class1_Sub1_Sub2_Sub1_Sub2 local365;
				if (local54 == 1) {
					@Pc(291) Class1_Sub1_Sub2_Sub1_Sub1 local291 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local64];
					if (local291.aClass1_Sub1_Sub16_1.anInt2749 == 1 && (local291.anInt2196 & 0x7F) == 64 && (local291.anInt2232 & 0x7F) == 64) {
						for (local310 = 0; local310 < Static20.anInt691; local310++) {
							local317 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static98.anIntArray346[local310]];
							if (local317 != null && local291 != local317 && local317.aClass1_Sub1_Sub16_1.anInt2749 == 1 && local317.anInt2196 == local291.anInt2196 && local291.anInt2232 == local317.anInt2232) {
								Static26.method435(Static98.anIntArray346[local310], local317.aClass1_Sub1_Sub16_1, local58, local48);
							}
						}
						for (local124 = 0; local124 < Static2.anInt2290; local124++) {
							local365 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static63.anIntArray226[local124]];
							if (local365 != null && local365.anInt2196 == local291.anInt2196 && local291.anInt2232 == local365.anInt2232) {
								Static88.method720(local48, local365, local58, Static63.anIntArray226[local124]);
							}
						}
					}
					Static26.method435(local64, local291.aClass1_Sub1_Sub16_1, local58, local48);
				}
				if (local54 == 0) {
					@Pc(410) Class1_Sub1_Sub2_Sub1_Sub2 local410 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local64];
					if ((local410.anInt2196 & 0x7F) == 64 && (local410.anInt2232 & 0x7F) == 64) {
						for (local310 = 0; local310 < Static20.anInt691; local310++) {
							local317 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static98.anIntArray346[local310]];
							if (local317 != null && local317.aClass1_Sub1_Sub16_1.anInt2749 == 1 && local317.anInt2196 == local410.anInt2196 && local317.anInt2232 == local410.anInt2232) {
								Static26.method435(Static98.anIntArray346[local310], local317.aClass1_Sub1_Sub16_1, local58, local48);
							}
						}
						for (local124 = 0; local124 < Static2.anInt2290; local124++) {
							local365 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static63.anIntArray226[local124]];
							if (local365 != null && local410 != local365 && local410.anInt2196 == local365.anInt2196 && local365.anInt2232 == local410.anInt2232) {
								Static88.method720(local48, local365, local58, Static63.anIntArray226[local124]);
							}
						}
					}
					Static88.method720(local48, local410, local58, local64);
				}
				if (local54 == 3) {
					@Pc(530) Class45 local530 = Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local58][local48];
					if (local530 != null) {
						for (@Pc(537) Class1_Sub1_Sub2_Sub3 local537 = (Class1_Sub1_Sub2_Sub3) local530.method1294(); local537 != null; local537 = (Class1_Sub1_Sub2_Sub3) local530.method1298()) {
							@Pc(543) Class1_Sub1_Sub1 local543 = Static111.method1907(local537.anInt1041);
							if (Static115.anInt2955 == 1) {
								Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static87.aClass23_1690, Static1.aClass23_63, local543.aClass23_58 }), Static73.aClass23_1201, 7, local537.anInt1041);
							} else if (Static94.anInt2487 != 1) {
								@Pc(594) Class23[] local594 = local543.aClass23Array1;
								if (Static5.aBoolean2) {
									local594 = Static102.method1710(local594);
								}
								for (@Pc(602) int local602 = 4; local602 >= 0; local602--) {
									if (local594 != null && local594[local602] != null) {
										@Pc(644) byte local644 = 0;
										if (local602 == 0) {
											local644 = 2;
										}
										if (local602 == 1) {
											local644 = 28;
										}
										if (local602 == 2) {
											local644 = 52;
										}
										if (local602 == 3) {
											local644 = 4;
										}
										if (local602 == 4) {
											local644 = 39;
										}
										Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static64.aClass23_1109, local543.aClass23_58 }), local594[local602], local644, local537.anInt1041);
									} else if (local602 == 2) {
										Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static64.aClass23_1109, local543.aClass23_58 }), Static64.aClass23_1095, 52, local537.anInt1041);
									}
								}
								Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static64.aClass23_1109, local543.aClass23_58 }), Static43.aClass23_773, 1002, local537.anInt1041);
							} else if ((Static90.anInt2427 & 0x1) == 1) {
								Static82.method1457(local58, local48, Static17.method233(new Class23[] { Static1.aClass23_53, Static1.aClass23_63, local543.aClass23_58 }), Static3.aClass23_96, 37, local537.anInt1041);
							}
						}
					}
				}
			}
		}
	}
}
