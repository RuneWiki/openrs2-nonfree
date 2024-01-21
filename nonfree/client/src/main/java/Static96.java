import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1153 = Static108.method1915("Your account is already logged in)3");

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1152 = aClass39_1153;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!ie;")
	public static Class31 aClass31_54 = new Class31();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "[I")
	public static int[] anIntArray345 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
	public static final int anInt2281 = 50;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "[I")
	public static int[] anIntArray346 = new int[anInt2281];

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "[I")
	public static int[] anIntArray347 = new int[anInt2281];

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1155 = Static108.method1915("Offline");

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1154 = aClass39_1155;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array23 = new Class39[anInt2281];

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "[I")
	public static int[] anIntArray348 = new int[anInt2281];

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "[I")
	public static int[] anIntArray349 = new int[anInt2281];

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
	public static int anInt2280 = 0;

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "[I")
	public static int[] anIntArray350 = new int[anInt2281];

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "[I")
	public static int[] anIntArray351 = new int[anInt2281];

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "[I")
	public static int[] anIntArray352 = new int[anInt2281];

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1156 = Static108.method1915("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
	public static int anInt2282 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!a;I)Z")
	public static boolean method1613(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		if (Static120.aBoolean252) {
			if (Static129.method2213(arg0) != 0) {
				return false;
			}
			if (arg0.anInt91 == 0) {
				return false;
			}
		}
		return arg0.aBoolean8;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public static void method1614() {
		aClass39_1153 = null;
		aClass39_1154 = null;
		anIntArray346 = null;
		anIntArray350 = null;
		aClass39_1152 = null;
		anIntArray352 = null;
		anIntArray348 = null;
		aClass39Array23 = null;
		anIntArray349 = null;
		anIntArray351 = null;
		anIntArray347 = null;
		anIntArray345 = null;
		aClass31_54 = null;
		aClass39_1155 = null;
		aClass39_1156 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!q;BI)Z")
	public static boolean method1615(@OriginalArg(0) Class62 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1998(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static116.method1989(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)V")
	public static void method1616(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static59.method1062(arg0 - 1L);
			Static59.method1062(1L);
		} else {
			Static59.method1062(arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIIIIII[Lclient!a;IIII)V")
	public static void method1617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub1_Sub1[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg5 > arg4 || arg10 > arg1 || arg3 <= arg4 || arg1 >= arg7) {
			return;
		}
		for (@Pc(36) int local36 = 0; local36 < arg6.length; local36++) {
			@Pc(50) Class1_Sub1_Sub1 local50 = arg6[local36];
			if (local50 != null && arg2 == local50.anInt102 && (!local50.aBoolean14 || !method1613(local50))) {
				@Pc(74) int local74 = local50.anInt110 + arg10 - arg9;
				@Pc(82) int local82 = local50.anInt81 + arg5 - arg0;
				if (local50.anInt91 == 8 && local82 <= arg4 && arg1 >= local74 && arg4 < local50.anInt101 + local82 && arg1 < local50.anInt82 + local74) {
					Static93.anInt2195 = local36;
				}
				if ((local50.anInt63 >= 0 || local50.anInt109 != 0) && arg4 >= local82 && arg1 >= local74 && local82 + local50.anInt101 > arg4 && arg1 < local50.anInt82 + local74) {
					if (local50.anInt63 < 0) {
						Static23.anInt811 = local36;
					} else {
						Static23.anInt811 = local50.anInt63;
					}
				}
				if (local50.anInt91 == 0) {
					if (!local50.aBoolean14 && method1613(local50) && !Static81.method1388(arg8, local36)) {
						continue;
					}
					method1617(local50.anInt87, arg1, local50.anInt72, local82 + local50.anInt101, arg4, local82, arg6, local74 + local50.anInt82, arg8, local50.anInt95, local74);
					if (local50.aClass1_Sub1_Sub1Array1 != null) {
						method1617(local50.anInt87, arg1, local50.anInt72, local50.anInt101 + local82, arg4, local82, local50.aClass1_Sub1_Sub1Array1, local50.anInt82 + local74, arg8, local50.anInt95, local74);
					}
					if (local50.anInt82 < local50.anInt99 && !local50.aBoolean14) {
						Static107.method1889(local74, local50.anInt101 + local82, local50.anInt82, local50.anInt99, arg1, arg4, arg8, local50);
					}
					if (!local50.aBoolean14) {
						continue;
					}
				}
				if (local50.anInt60 == 1 && local82 <= arg4 && local74 <= arg1 && arg4 < local82 + local50.anInt101 && local50.anInt82 + local74 > arg1) {
					@Pc(282) boolean local282 = false;
					if (local50.anInt93 != 0) {
						local282 = Static33.method636(local50);
					}
					if (!local282) {
						Static71.method1242(Static8.aClass39_147, 57, local50.aClass39_33, 0, local50.anInt72, 0);
					}
				}
				if (local50.anInt60 == 2 && !Static46.aBoolean222 && local82 <= arg4 && local74 <= arg1 && local50.anInt101 + local82 > arg4 && local74 + local50.anInt82 > arg1) {
					@Pc(344) Class39 local344 = Static68.method1215(local50);
					if (local344 != null) {
						Static71.method1242(Static30.method601(new Class39[] { Static75.aClass39_924, local50.aClass39_34 }), 56, local344, -1, local50.anInt72, 0);
					}
				}
				if (local50.anInt60 == 3 && local82 <= arg4 && arg1 >= local74 && local82 + local50.anInt101 > arg4 && local74 + local50.anInt82 > arg1) {
					@Pc(418) byte local418;
					if (arg8 == 3) {
						local418 = 52;
					} else {
						local418 = 30;
					}
					Static71.method1242(Static8.aClass39_147, local418, Static12.aClass39_234, 0, local50.anInt72, 0);
				}
				if (local50.anInt60 == 4 && local82 <= arg4 && arg1 >= local74 && arg4 < local50.anInt101 + local82 && local74 + local50.anInt82 > arg1) {
					Static71.method1242(Static8.aClass39_147, 15, local50.aClass39_33, 0, local50.anInt72, 0);
				}
				if (local50.anInt60 == 5 && local82 <= arg4 && arg1 >= local74 && arg4 < local50.anInt101 + local82 && local74 + local50.anInt82 > arg1) {
					Static71.method1242(Static8.aClass39_147, 5, local50.aClass39_33, 0, local50.anInt72, 0);
				}
				if (local50.anInt60 == 6 && Static122.anInt2982 == -1 && local82 <= arg4 && local74 <= arg1 && arg4 < local82 + local50.anInt101 && arg1 < local50.anInt82 + local74) {
					Static71.method1242(Static8.aClass39_147, 35, local50.aClass39_33, -1, local50.anInt72, 0);
				}
				@Pc(596) int local596;
				@Pc(590) int local590;
				if (local50.anInt91 == 2) {
					local590 = 0;
					for (@Pc(592) int local592 = 0; local592 < local50.anInt82; local592++) {
						for (local596 = 0; local596 < local50.anInt101; local596++) {
							@Pc(608) int local608 = local82 + (local50.anInt80 + 32) * local596;
							@Pc(618) int local618 = local74 + local592 * (local50.anInt52 + 32);
							if (local590 < 20) {
								local618 += local50.anIntArray11[local590];
								local608 += local50.anIntArray12[local590];
							}
							if (local608 <= arg4 && arg1 >= local618 && local608 + 32 > arg4 && arg1 < local618 + 32) {
								Static121.anInt2966 = local50.anInt72;
								Static26.anInt901 = local590;
								if (local50.anIntArray9[local590] > 0) {
									@Pc(676) Class1_Sub1_Sub17 local676 = Static8.method224(local50.anIntArray9[local590] - 1);
									if (Static89.anInt2107 == 1 && Static97.method2155(Static129.method2213(local50))) {
										if (local50.anInt72 != Static62.anInt2928 || Static52.anInt1456 != local590) {
											Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_66, Static66.aClass39_846, local676.aClass39_1321 }), 40, Static77.aClass39_953, local590, local50.anInt72, local676.anInt2749);
										}
									} else if (!Static46.aBoolean222 || !Static97.method2155(Static129.method2213(local50))) {
										@Pc(737) Class39[] local737 = local676.aClass39Array27;
										if (Static31.aBoolean91) {
											local737 = Static122.method2059(local737);
										}
										@Pc(755) int local755;
										@Pc(803) byte local803;
										if (Static97.method2155(Static129.method2213(local50))) {
											for (local755 = 4; local755 >= 3; local755--) {
												if (local737 != null && local737[local755] != null) {
													if (local755 == 3) {
														local803 = 37;
													} else {
														local803 = 9;
													}
													Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local676.aClass39_1321 }), local803, local737[local755], local590, local50.anInt72, local676.anInt2749);
												} else if (local755 == 4) {
													Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local676.aClass39_1321 }), 9, Static87.aClass39_1013, local590, local50.anInt72, local676.anInt2749);
												}
											}
										}
										if (Static1.method43(Static129.method2213(local50))) {
											Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local676.aClass39_1321 }), 19, Static77.aClass39_953, local590, local50.anInt72, local676.anInt2749);
										}
										if (Static97.method2155(Static129.method2213(local50)) && local737 != null) {
											for (local755 = 2; local755 >= 0; local755--) {
												if (local737[local755] != null) {
													local803 = 0;
													if (local755 == 0) {
														local803 = 18;
													}
													if (local755 == 1) {
														local803 = 34;
													}
													if (local755 == 2) {
														local803 = 1;
													}
													Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local676.aClass39_1321 }), local803, local737[local755], local590, local50.anInt72, local676.anInt2749);
												}
											}
										}
										local737 = local50.aClass39Array1;
										if (Static31.aBoolean91) {
											local737 = Static122.method2059(local737);
										}
										if (local737 != null) {
											for (local755 = 4; local755 >= 0; local755--) {
												if (local737[local755] != null) {
													local803 = 0;
													if (local755 == 0) {
														local803 = 24;
													}
													if (local755 == 1) {
														local803 = 4;
													}
													if (local755 == 2) {
														local803 = 22;
													}
													if (local755 == 3) {
														local803 = 38;
													}
													if (local755 == 4) {
														local803 = 7;
													}
													Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local676.aClass39_1321 }), local803, local737[local755], local590, local50.anInt72, local676.anInt2749);
												}
											}
										}
										Static71.method1242(Static30.method601(new Class39[] { Static112.aClass39_1346, local676.aClass39_1321 }), 1005, Static76.aClass39_940, local590, local50.anInt72, local676.anInt2749);
									} else if ((Static82.anInt1996 & 0x10) == 16) {
										Static71.method1242(Static30.method601(new Class39[] { Static103.aClass39_1273, Static66.aClass39_846, local676.aClass39_1321 }), 31, Static52.aClass39_695, local590, local50.anInt72, local676.anInt2749);
									}
								}
							}
							local590++;
						}
					}
				}
				if (local50.aBoolean14) {
					if (Static46.aBoolean222) {
						if (Static93.method1567(Static129.method2213(local50)) && (Static82.anInt1996 & 0x20) == 32 && arg4 >= local82 && local74 <= arg1 && local50.anInt101 + local82 > arg4 && local50.anInt82 + local74 > arg1) {
							Static71.method1242(Static30.method601(new Class39[] { Static103.aClass39_1273, Static91.aClass39_1084, local50.aClass39_35 }), 51, Static52.aClass39_695, local50.anInt46, local50.anInt72, 0);
						}
					} else if (arg4 >= local82 && arg1 >= local74 && arg4 < local82 + local50.anInt101 && local74 + local50.anInt82 > arg1) {
						@Pc(1192) Class39 local1192;
						for (local590 = 9; local590 >= 5; local590--) {
							local1192 = Static113.method1973(local50, local590);
							if (local1192 != null) {
								Static71.method1242(local50.aClass39_35, 23, local1192, local50.anInt46, local50.anInt72, local590 + 1);
							}
						}
						local1192 = Static68.method1215(local50);
						if (local1192 != null) {
							Static71.method1242(local50.aClass39_35, 56, local1192, local50.anInt46, local50.anInt72, 0);
						}
						for (local596 = 4; local596 >= 0; local596--) {
							@Pc(1247) Class39 local1247 = Static113.method1973(local50, local596);
							if (local1247 != null) {
								Static71.method1242(local50.aClass39_35, 23, local1247, local50.anInt46, local50.anInt72, local596 + 1);
							}
						}
						if (Static33.method637(Static129.method2213(local50))) {
							Static71.method1242(Static8.aClass39_147, 35, local50.aClass39_33, local50.anInt46, local50.anInt72, 0);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method1618() {
		Static93.method1565(Static72.anInt1798);
		if (Static16.anInt2474 != -1) {
			Static93.method1565(Static16.anInt2474);
		}
		Static107.anInt2687 = 0;
		Static52.aClass6_13.method2069();
		Static27.method566();
		Static15.method1510();
		Static89.method1478(0, 503, Static72.anInt1798, 765);
		if (Static16.anInt2474 != -1) {
			Static89.method1478(0, 503, Static16.anInt2474, 765);
		}
		if (Static13.aBoolean47) {
			Static124.method2080();
		} else {
			Static71.method1241();
			Static44.method782();
		}
		try {
			@Pc(61) Graphics local61 = Static16.aCanvas10.getGraphics();
			Static52.aClass6_13.method2067(0, 0, local61);
		} catch (@Pc(76) Exception local76) {
			Static16.aCanvas10.repaint();
		}
	}
}
