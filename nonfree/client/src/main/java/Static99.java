import java.io.DataInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ud", name = "jb", descriptor = "Lclient!w;")
	public static Class15 aClass15_37;

	@OriginalMember(owner = "client!ud", name = "vb", descriptor = "Lclient!w;")
	public static Class15 aClass15_38;

	@OriginalMember(owner = "client!ud", name = "Eb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!ud", name = "Ub", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_13;

	@OriginalMember(owner = "client!ud", name = "Vb", descriptor = "Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4 aClass10_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!ud", name = "zb", descriptor = "[I")
	public static int[] anIntArray333 = new int[4000];

	@OriginalMember(owner = "client!ud", name = "Fb", descriptor = "Lclient!va;")
	private static Class61 aClass61_1030 = Static88.method1421("(U4");

	@OriginalMember(owner = "client!ud", name = "Gb", descriptor = "Lclient!va;")
	public static Class61 aClass61_1031 = Static88.method1421(" )2> @yel@");

	@OriginalMember(owner = "client!ud", name = "Tb", descriptor = "Lclient!va;")
	public static Class61 aClass61_1032 = Static88.method1421("redstone3");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ed;)V")
	public static void method1572(@OriginalArg(1) Class10_Sub1_Sub5_Sub2 arg0) {
		arg0.anInt1674 = arg0.anInt1647;
		if (arg0.anInt1633 == 0) {
			arg0.anInt1638 = 0;
			return;
		}
		if (arg0.anInt1688 != -1 && arg0.anInt1675 == 0) {
			@Pc(37) Class10_Sub1_Sub6 local37 = Static5.method33(arg0.anInt1688);
			if (arg0.anInt1671 > 0 && local37.anInt968 == 0) {
				arg0.anInt1638++;
				return;
			}
			if (arg0.anInt1671 <= 0 && local37.anInt974 == 0) {
				arg0.anInt1638++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt1654;
		@Pc(72) int local72 = arg0.anInt1649;
		@Pc(87) int local87 = arg0.anIntArray189[arg0.anInt1633 - 1] * 128 + arg0.anInt1681 * 64;
		@Pc(102) int local102 = arg0.anInt1681 * 64 + arg0.anIntArray186[arg0.anInt1633 - 1] * 128;
		if (local87 - local69 > 256 || local87 - local69 < -256 || local102 - local72 > 256 || local102 - local72 < -256) {
			arg0.anInt1654 = local87;
			arg0.anInt1649 = local102;
			return;
		}
		if (local69 < local87) {
			if (local72 < local102) {
				arg0.anInt1634 = 1280;
			} else if (local72 <= local102) {
				arg0.anInt1634 = 1536;
			} else {
				arg0.anInt1634 = 1792;
			}
		} else if (local87 >= local69) {
			if (local72 < local102) {
				arg0.anInt1634 = 1024;
			} else {
				arg0.anInt1634 = 0;
			}
		} else if (local72 < local102) {
			arg0.anInt1634 = 768;
		} else if (local72 > local102) {
			arg0.anInt1634 = 256;
		} else {
			arg0.anInt1634 = 512;
		}
		@Pc(223) int local223 = arg0.anInt1634 - arg0.anInt1646 & 0x7FF;
		@Pc(230) int local230 = 4;
		if (arg0.anInt1646 != arg0.anInt1634 && arg0.anInt1657 == -1 && arg0.anInt1637 != 0) {
			local230 = 2;
		}
		if (arg0.anInt1633 > 2) {
			local230 = 6;
		}
		if (arg0.anInt1633 > 3) {
			local230 = 8;
		}
		@Pc(267) int local267 = arg0.anInt1662;
		if (local223 > 1024) {
			local223 -= 2048;
		}
		if (local223 >= -256 && local223 <= 256) {
			local267 = arg0.anInt1668;
		} else if (local223 >= 256 && local223 < 768) {
			local267 = arg0.anInt1665;
		} else if (local223 >= -768 && local223 <= -256) {
			local267 = arg0.anInt1630;
		}
		if (arg0.anInt1638 > 0 && arg0.anInt1633 > 1) {
			arg0.anInt1638--;
			local230 = 8;
		}
		if (local267 == -1) {
			local267 = arg0.anInt1668;
		}
		arg0.anInt1674 = local267;
		if (arg0.aBooleanArray8[arg0.anInt1633 - 1]) {
			local230 <<= 0x1;
		}
		if (local69 < local87) {
			arg0.anInt1654 += local230;
			if (local87 < arg0.anInt1654) {
				arg0.anInt1654 = local87;
			}
		} else if (local69 > local87) {
			arg0.anInt1654 -= local230;
			if (local87 > arg0.anInt1654) {
				arg0.anInt1654 = local87;
			}
		}
		if (local102 > local72) {
			arg0.anInt1649 += local230;
			if (local102 < arg0.anInt1649) {
				arg0.anInt1649 = local102;
			}
		} else if (local72 > local102) {
			arg0.anInt1649 -= local230;
			if (arg0.anInt1649 < local102) {
				arg0.anInt1649 = local102;
			}
		}
		if (arg0.anInt1654 == local87 && local102 == arg0.anInt1649) {
			arg0.anInt1633--;
			if (arg0.anInt1671 > 0) {
				arg0.anInt1671--;
			}
		}
		if (local230 >= 8 && arg0.anInt1674 == arg0.anInt1668 && arg0.anInt1644 != -1) {
			arg0.anInt1674 = arg0.anInt1644;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!d;ILclient!va;)Lclient!va;")
	public static Class61 method1576(@OriginalArg(0) Class10_Sub1_Sub4 arg0, @OriginalArg(2) Class61 arg1) {
		if (arg1.method1604(Static43.aClass61_502) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(18) int local18 = arg1.method1604(Static44.aClass61_514);
			if (local18 == -1) {
				while (true) {
					local18 = arg1.method1604(Static20.aClass61_1069);
					if (local18 == -1) {
						while (true) {
							local18 = arg1.method1604(Static93.aClass61_805);
							if (local18 == -1) {
								while (true) {
									local18 = arg1.method1604(aClass61_1030);
									if (local18 == -1) {
										while (true) {
											local18 = arg1.method1604(Static56.aClass61_625);
											if (local18 == -1) {
												while (true) {
													local18 = arg1.method1604(Static28.aClass61_338);
													if (local18 == -1) {
														return arg1;
													}
													@Pc(232) Class61 local232 = Static15.aClass61_166;
													if (Static16.aClass19_2 != null) {
														local232 = Static23.method475(Static16.aClass19_2.anInt881);
														try {
															if (Static16.aClass19_2.anObject2 != null) {
																@Pc(248) byte[] local248 = ((String) Static16.aClass19_2.anObject2).getBytes("ISO-8859-1");
																local232 = Static81.method1276(local248, local248.length, 0);
															}
														} catch (@Pc(259) UnsupportedEncodingException local259) {
														}
													}
													arg1 = Static93.method1156(new Class61[] { arg1.method1611(local18, 0), local232, arg1.method1619(local18 + 4) });
												}
											}
											arg1 = Static93.method1156(new Class61[] { arg1.method1611(local18, 0), Static49.method774(Static4.method30(arg0, 4)), arg1.method1619(local18 + 2) });
										}
									}
									arg1 = Static93.method1156(new Class61[] { arg1.method1611(local18, 0), Static49.method774(Static4.method30(arg0, 3)), arg1.method1619(local18 + 2) });
								}
							}
							arg1 = Static93.method1156(new Class61[] { arg1.method1611(local18, 0), Static49.method774(Static4.method30(arg0, 2)), arg1.method1619(local18 + 2) });
						}
					}
					arg1 = Static93.method1156(new Class61[] { arg1.method1611(local18, 0), Static49.method774(Static4.method30(arg0, 1)), arg1.method1619(local18 + 2) });
				}
			}
			arg1 = Static93.method1156(new Class61[] { arg1.method1611(local18, 0), Static49.method774(Static4.method30(arg0, 0)), arg1.method1619(local18 + 2) });
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1580(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(3) String local3 = "";
			if (arg1 != null) {
				local3 = Static31.method559(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local3 = local3 + " | ";
				}
				local3 = local3 + arg0;
			}
			System.out.println("Error: " + local3);
			local3 = local3.replace(':', '.');
			local3 = local3.replace('@', '_');
			local3 = local3.replace('&', '_');
			local3 = local3.replace('#', '_');
			@Pc(98) Class19 local98 = Static76.aClass55_3.method1395(new URL(Static76.aClass55_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static56.anInt1498 + "&u=" + Static46.aLong36 + "&v1=" + Static86.aString3 + "&v2=" + Static86.aString4 + "&e=" + local3));
			while (local98.anInt879 == 0) {
				Static93.method1123(1L);
			}
			if (local98.anInt879 == 1) {
				@Pc(119) DataInputStream local119 = (DataInputStream) local98.anObject2;
				local119.read();
				local119.close();
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!he;II)[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] method1582(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2) {
		return Static5.method36(arg2, arg1, arg0) ? Static23.method477() : null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method1584() {
		aClass61_1031 = null;
		aClass61_1032 = null;
		aClass61_1030 = null;
		aClass15_38 = null;
		aClass10_Sub1_Sub1_Sub4_4 = null;
		aClass15_37 = null;
		aClass11_Sub1_13 = null;
		aClass27_4 = null;
		anIntArray333 = null;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)V")
	public static void method1585() {
		Static67.aClass29_48.method646();
		Static61.aClass29_43.method646();
	}
}
