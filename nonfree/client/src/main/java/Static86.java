import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!jc;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[S")
	public static short[] aShortArray25;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt1894;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
	public static int anInt1895;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!mf;")
	public static Class69 aClass69_6;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!oa;")
	public static final Class75 aClass75_9 = new Class75(32);

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_687 = Static161.method2452("<col=80ff00>");

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_691 = Static161.method2452("K");

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!dc;")
	public static Class20 aClass20_688 = aClass20_691;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_690 = Static161.method2452("slide:");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!dc;")
	public static Class20 aClass20_689 = aClass20_690;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!dc;")
	public static Class20 aClass20_692 = aClass20_691;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_10 = new Class91();

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_693 = aClass20_690;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_19 = new Class8(16);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIB)V")
	public static void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static210.anInt919 * 128) {
			arg0 = Static210.anInt919 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static31.anInt671 * 128) {
			arg2 = Static31.anInt671 * 128 - 1;
		}
		Static50.anInt1081 = Class80.anIntArray324[arg3];
		Static36.anInt781 = Class80.anIntArray327[arg3];
		Static110.anInt2297 = Class80.anIntArray324[arg4];
		Static172.anInt3670 = Class80.anIntArray327[arg4];
		Static37.anInt1357 = arg0;
		Static117.anInt2448 = arg1;
		Static132.anInt3725 = arg2;
		Static212.anInt4111 = arg0 / 128;
		Static174.anInt3487 = arg2 / 128;
		Static80.anInt1804 = arg5;
		Static214.anInt4155 = Static212.anInt4111 - Static74.anInt1609;
		if (Static214.anInt4155 < 0) {
			Static214.anInt4155 = 0;
		}
		Static16.anInt321 = Static174.anInt3487 - Static74.anInt1609;
		if (Static16.anInt321 < 0) {
			Static16.anInt321 = 0;
		}
		Static38.anInt818 = Static212.anInt4111 + Static74.anInt1609;
		if (Static38.anInt818 > Static210.anInt919) {
			Static38.anInt818 = Static210.anInt919;
		}
		Static157.anInt3190 = Static174.anInt3487 + Static74.anInt1609;
		if (Static157.anInt3190 > Static31.anInt671) {
			Static157.anInt3190 = Static31.anInt671;
		}
		@Pc(104) int local104;
		@Pc(115) int local115;
		for (@Pc(101) int local101 = 0; local101 < Static74.anInt1609 + Static74.anInt1609 + 2; local101++) {
			for (local104 = 0; local104 < Static74.anInt1609 + Static74.anInt1609 + 2; local104++) {
				local115 = (local101 - Static74.anInt1609 << 7) - (Static37.anInt1357 & 0x7F);
				@Pc(125) int local125 = (local104 - Static74.anInt1609 << 7) - (Static132.anInt3725 & 0x7F);
				@Pc(131) int local131 = Static212.anInt4111 + local101 - Static74.anInt1609;
				@Pc(137) int local137 = Static174.anInt3487 + local104 - Static74.anInt1609;
				if (local131 >= 0 && local137 >= 0 && local131 < Static210.anInt919 && local137 < Static31.anInt671) {
					@Pc(161) int local161;
					if (Static200.anIntArrayArrayArray12 == null) {
						local161 = Static68.anIntArrayArrayArray6[0][local131][local137] + 128 - Static117.anInt2448;
					} else {
						local161 = Static200.anIntArrayArrayArray12[0][local131][local137] + 128 - Static117.anInt2448;
					}
					@Pc(186) int local186 = Static68.anIntArrayArrayArray6[3][local131][local137] - Static117.anInt2448 - 1000;
					Static134.aBooleanArrayArray1[local101][local104] = Static1.method42(local115, local186, local161, local125);
				} else {
					Static134.aBooleanArrayArray1[local101][local104] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static74.anInt1609 + Static74.anInt1609 + 1; local104++) {
			for (local115 = 0; local115 < Static74.anInt1609 + Static74.anInt1609 + 1; local115++) {
				Static188.aBooleanArrayArray2[local104][local115] = Static134.aBooleanArrayArray1[local104][local115] || Static134.aBooleanArrayArray1[local104 + 1][local115] || Static134.aBooleanArrayArray1[local104][local115 + 1] || Static134.aBooleanArrayArray1[local104 + 1][local115 + 1];
			}
		}
		Static72.anIntArray142 = arg7;
		Static154.anIntArray342 = arg8;
		Static132.anIntArray383 = arg9;
		Static174.anIntArray368 = arg10;
		Static159.anIntArray349 = arg11;
		Static62.method1030();
		Static147.method2264(arg0, arg1, arg2, arg6);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1466() {
		try {
			if (Static26.anInt3997 == 0) {
				if (Static157.aClass39_3 != null) {
					Static157.aClass39_3.method1175();
					Static157.aClass39_3 = null;
				}
				Static28.anInt534 = 0;
				Static45.aClass65_3 = null;
				Static26.anInt3997 = 1;
				Static38.aBoolean49 = false;
			}
			if (Static26.anInt3997 == 1) {
				if (Static45.aClass65_3 == null) {
					Static45.aClass65_3 = Static8.aClass12_1.method298(Static199.aString5, Static141.anInt2946);
				}
				if (Static45.aClass65_3.anInt2446 == 2) {
					throw new IOException();
				}
				if (Static45.aClass65_3.anInt2446 == 1) {
					Static157.aClass39_3 = new Class39((Socket) Static45.aClass65_3.anObject3, Static8.aClass12_1);
					Static26.anInt3997 = 2;
					Static45.aClass65_3 = null;
				}
			}
			if (Static26.anInt3997 == 2) {
				@Pc(72) long local72 = Static173.aLong203 = Static17.aClass20_161.method595();
				Static43.aClass5_Sub6_Sub1_2.anInt4050 = 0;
				Static43.aClass5_Sub6_Sub1_2.method3061(14);
				@Pc(86) int local86 = (int) (local72 >> 16 & 0x1FL);
				Static43.aClass5_Sub6_Sub1_2.method3061(local86);
				Static157.aClass39_3.method1176(2, Static43.aClass5_Sub6_Sub1_2.aByteArray56);
				Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
				Static26.anInt3997 = 3;
			}
			@Pc(119) int local119;
			if (Static26.anInt3997 == 3) {
				if (Static59.aClass9_1 != null) {
					Static59.aClass9_1.method2933();
				}
				if (Static192.aClass9_2 != null) {
					Static192.aClass9_2.method2933();
				}
				local119 = Static157.aClass39_3.method1170();
				if (Static59.aClass9_1 != null) {
					Static59.aClass9_1.method2933();
				}
				if (Static192.aClass9_2 != null) {
					Static192.aClass9_2.method2933();
				}
				if (local119 != 0) {
					Static160.method2441(local119);
					return;
				}
				Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
				Static26.anInt3997 = 4;
			}
			if (Static26.anInt3997 == 4) {
				if (Static10.aClass5_Sub6_Sub1_1.anInt4050 < 8) {
					local119 = Static157.aClass39_3.method1172();
					if (8 - Static10.aClass5_Sub6_Sub1_1.anInt4050 < local119) {
						local119 = 8 - Static10.aClass5_Sub6_Sub1_1.anInt4050;
					}
					if (local119 > 0) {
						Static157.aClass39_3.method1173(local119, Static10.aClass5_Sub6_Sub1_1.anInt4050, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
						Static10.aClass5_Sub6_Sub1_1.anInt4050 += local119;
					}
				}
				if (Static10.aClass5_Sub6_Sub1_1.anInt4050 == 8) {
					Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
					Static172.aLong218 = Static10.aClass5_Sub6_Sub1_1.method3069();
					Static26.anInt3997 = 5;
				}
			}
			if (Static26.anInt3997 == 5) {
				Static43.aClass5_Sub6_Sub1_2.anInt4050 = 0;
				@Pc(211) int[] local211 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static172.aLong218 >> 32), (int) Static172.aLong218 };
				Static43.aClass5_Sub6_Sub1_2.method3061(10);
				Static43.aClass5_Sub6_Sub1_2.method3030(local211[0]);
				Static43.aClass5_Sub6_Sub1_2.method3030(local211[1]);
				Static43.aClass5_Sub6_Sub1_2.method3030(local211[2]);
				Static43.aClass5_Sub6_Sub1_2.method3030(local211[3]);
				Static43.aClass5_Sub6_Sub1_2.method3037(Static17.aClass20_161.method595());
				Static43.aClass5_Sub6_Sub1_2.method3047(Static17.aClass20_162);
				Static43.aClass5_Sub6_Sub1_2.method3063(Static64.aBigInteger2, Static2.aBigInteger1);
				Static44.aClass5_Sub6_Sub1_3.anInt4050 = 0;
				if (Static96.anInt2013 == 40) {
					Static44.aClass5_Sub6_Sub1_3.method3061(18);
				} else {
					Static44.aClass5_Sub6_Sub1_3.method3061(16);
				}
				Static44.aClass5_Sub6_Sub1_3.method3061(Static43.aClass5_Sub6_Sub1_2.anInt4050 + Static159.method2434(Static41.aClass20_307) + 137);
				Static44.aClass5_Sub6_Sub1_3.method3030(498);
				Static44.aClass5_Sub6_Sub1_3.method3061(Static14.aBoolean14 ? 1 : 0);
				Static26.method3071(Static44.aClass5_Sub6_Sub1_3);
				Static44.aClass5_Sub6_Sub1_3.method3047(Static41.aClass20_307);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static85.anInt1875);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static38.aClass23_Sub1_4.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static48.aClass23_Sub1_6.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static139.aClass23_Sub1_19.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static177.aClass23_Sub1_24.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static60.aClass23_Sub1_9.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static161.aClass23_Sub1_21.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static59.aClass23_Sub1_7.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static130.aClass23_Sub1_15.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static186.aClass23_Sub1_26.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static127.aClass23_Sub1_14.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static141.aClass23_Sub1_20.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static16.aClass23_Sub1_3.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static130.aClass23_Sub1_16.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static185.aClass23_Sub1_25.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static134.aClass23_Sub1_17.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static214.aClass23_Sub1_28.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static175.aClass23_Sub1_23.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static59.aClass23_Sub1_8.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static7.aClass23_Sub1_1.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static166.aClass23_Sub1_22.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static69.aClass23_Sub1_10.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static109.aClass23_Sub1_13.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static103.aClass23_Sub1_12.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static48.aClass23_Sub1_5.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static137.aClass23_Sub1_18.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3030(Static12.aClass23_Sub1_2.anInt917);
				Static44.aClass5_Sub6_Sub1_3.method3039(Static43.aClass5_Sub6_Sub1_2.aByteArray56, Static43.aClass5_Sub6_Sub1_2.anInt4050);
				Static157.aClass39_3.method1176(Static44.aClass5_Sub6_Sub1_3.anInt4050, Static44.aClass5_Sub6_Sub1_3.aByteArray56);
				Static43.aClass5_Sub6_Sub1_2.method3093(local211);
				for (@Pc(495) int local495 = 0; local495 < 4; local495++) {
					local211[local495] += 50;
				}
				Static10.aClass5_Sub6_Sub1_1.method3093(local211);
				Static26.anInt3997 = 6;
			}
			if (Static26.anInt3997 == 6 && Static157.aClass39_3.method1172() > 0) {
				local119 = Static157.aClass39_3.method1170();
				if (local119 == 21 && Static96.anInt2013 == 20) {
					Static26.anInt3997 = 7;
				} else if (local119 == 2) {
					Static26.anInt3997 = 9;
				} else if (local119 == 15 && Static96.anInt2013 == 40) {
					Static154.method2334();
					return;
				} else if (local119 == 23 && Static41.anInt927 < 1) {
					Static41.anInt927++;
					Static26.anInt3997 = 0;
				} else {
					Static160.method2441(local119);
					return;
				}
			}
			if (Static26.anInt3997 == 7 && Static157.aClass39_3.method1172() > 0) {
				Static95.anInt2008 = (Static157.aClass39_3.method1170() + 3) * 60;
				Static26.anInt3997 = 8;
			}
			if (Static26.anInt3997 == 8) {
				Static28.anInt534 = 0;
				Static56.method950(Static70.method1166(new Class20[] { Static132.method2805(Static95.anInt2008 / 60), Static75.aClass20_542 }), Static145.aClass20_1130, Static108.aClass20_822);
				if (--Static95.anInt2008 <= 0) {
					Static26.anInt3997 = 0;
				}
			} else {
				if (Static26.anInt3997 == 9 && Static157.aClass39_3.method1172() >= 9) {
					Static80.anInt1803 = Static157.aClass39_3.method1170();
					Static202.anInt3970 = Static157.aClass39_3.method1170();
					Static127.anInt2649 = Static157.aClass39_3.method1170();
					Static68.anInt1469 = Static157.aClass39_3.method1170();
					Static168.aBoolean149 = Static157.aClass39_3.method1170() == 1;
					Static65.anInt1414 = Static157.aClass39_3.method1170();
					Static65.anInt1414 <<= 0x8;
					Static65.anInt1414 += Static157.aClass39_3.method1170();
					Static60.anInt1348 = Static157.aClass39_3.method1170();
					Static157.aClass39_3.method1173(1, 0, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
					Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
					Static196.anInt3834 = Static10.aClass5_Sub6_Sub1_1.method3092();
					Static157.aClass39_3.method1173(2, 0, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
					Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
					Static6.anInt155 = Static10.aClass5_Sub6_Sub1_1.method3077();
					Static26.anInt3997 = 10;
				}
				if (Static26.anInt3997 != 10) {
					Static28.anInt534++;
					if (Static28.anInt534 > 2000) {
						if (Static41.anInt927 < 1) {
							if (Static67.anInt3982 == Static141.anInt2946) {
								Static141.anInt2946 = Static63.anInt1382;
							} else {
								Static141.anInt2946 = Static67.anInt3982;
							}
							Static41.anInt927++;
							Static26.anInt3997 = 0;
						} else {
							Static160.method2441(-3);
						}
					}
				} else if (Static157.aClass39_3.method1172() >= Static6.anInt155) {
					Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
					Static157.aClass39_3.method1173(Static6.anInt155, 0, Static10.aClass5_Sub6_Sub1_1.aByteArray56);
					Static116.method1860();
					Static132.anInt3723 = -1;
					Static170.method2597(false);
					Static196.anInt3834 = -1;
				}
			}
		} catch (@Pc(785) IOException local785) {
			if (Static41.anInt927 < 1) {
				Static41.anInt927++;
				if (Static67.anInt3982 == Static141.anInt2946) {
					Static141.anInt2946 = Static63.anInt1382;
				} else {
					Static141.anInt2946 = Static67.anInt3982;
				}
				Static26.anInt3997 = 0;
			} else {
				Static160.method2441(-2);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!dc;B)Z")
	public static boolean method1467(@OriginalArg(0) Class20 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static91.anInt1957; local11++) {
			if (arg0.method551(Static70.aClass20Array7[local11])) {
				return true;
			}
		}
		return arg0.method551(Static210.aClass1_Sub2_Sub2_2.aClass20_848);
	}
}
