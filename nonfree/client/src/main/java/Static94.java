import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public static int anInt2298;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_772 = null;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_773 = Static65.method1172("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!kb;")
	public static Class46 aClass46_774 = Static65.method1172(" ");

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public static int anInt2302 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
	public static boolean method1560(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method1561() {
		aClass46_774 = null;
		aClass46_772 = null;
		anIntArray232 = null;
		aClass46_773 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!dd;I)V")
	public static void method1562(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x20) != 0) {
			arg1.aClass46_590 = Static49.aClass3_Sub4_Sub1_2.method172();
			if (arg1.aClass46_590.method1357(0) == 126) {
				arg1.aClass46_590 = arg1.aClass46_590.method1380(1);
				Static168.method2686(2, arg1.aClass46_233, arg1.aClass46_590);
			} else if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 == arg1) {
				Static168.method2686(2, arg1.aClass46_233, arg1.aClass46_590);
			}
			arg1.anInt1730 = 150;
			arg1.anInt1694 = 0;
			arg1.anInt1716 = 0;
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt1695 = Static49.aClass3_Sub4_Sub1_2.method223();
			arg1.anInt1703 = Static49.aClass3_Sub4_Sub1_2.method192();
			arg1.anInt1685 = Static49.aClass3_Sub4_Sub1_2.method205();
			arg1.anInt1691 = Static49.aClass3_Sub4_Sub1_2.method223();
			arg1.anInt1720 = Static49.aClass3_Sub4_Sub1_2.method171() + Static20.anInt512;
			arg1.anInt1705 = Static49.aClass3_Sub4_Sub1_2.method171() + Static20.anInt512;
			arg1.anInt1725 = Static49.aClass3_Sub4_Sub1_2.method192();
			arg1.anInt1715 = 0;
			arg1.anInt1724 = 1;
		}
		@Pc(122) int local122;
		@Pc(126) int local126;
		if ((arg2 & 0x10) != 0) {
			local122 = Static49.aClass3_Sub4_Sub1_2.method171();
			local126 = Static49.aClass3_Sub4_Sub1_2.method192();
			if (local122 == 65535) {
				local122 = -1;
			}
			Static163.method2611(local126, local122, arg1);
		}
		if ((arg2 & 0x80) != 0) {
			arg1.anInt1723 = Static49.aClass3_Sub4_Sub1_2.method208();
			if (arg1.anInt1723 == 65535) {
				arg1.anInt1723 = -1;
			}
		}
		if ((arg2 & 0x1) != 0) {
			local122 = Static49.aClass3_Sub4_Sub1_2.method223();
			local126 = Static49.aClass3_Sub4_Sub1_2.method191();
			arg1.method1164(local126, local122, Static20.anInt512);
			arg1.anInt1721 = Static20.anInt512 + 300;
			arg1.anInt1704 = Static49.aClass3_Sub4_Sub1_2.method223();
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt1707 = Static49.aClass3_Sub4_Sub1_2.method171();
			local122 = Static49.aClass3_Sub4_Sub1_2.method207();
			arg1.anInt1717 = local122 >> 16;
			if (arg1.anInt1707 == 65535) {
				arg1.anInt1707 = -1;
			}
			arg1.anInt1722 = (local122 & 0xFFFF) + Static20.anInt512;
			arg1.anInt1728 = 0;
			arg1.anInt1687 = 0;
			if (arg1.anInt1722 > Static20.anInt512) {
				arg1.anInt1687 = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			local122 = Static49.aClass3_Sub4_Sub1_2.method174();
			local126 = Static49.aClass3_Sub4_Sub1_2.method192();
			@Pc(260) int local260 = Static49.aClass3_Sub4_Sub1_2.method191();
			@Pc(263) int local263 = Static49.aClass3_Sub4_Sub1_2.anInt232;
			if (arg1.aClass46_233 != null && arg1.aClass64_1 != null) {
				@Pc(274) long local274 = arg1.aClass46_233.method1348();
				@Pc(276) boolean local276 = false;
				if (local126 <= 1) {
					for (@Pc(283) int local283 = 0; local283 < Static25.anInt3983; local283++) {
						if (Static146.aLongArray3[local283] == local274) {
							local276 = true;
							break;
						}
					}
				}
				if (!local276 && Static153.anInt3469 == 0) {
					Static79.aClass3_Sub4_3.anInt232 = 0;
					Static49.aClass3_Sub4_Sub1_2.method210(Static79.aClass3_Sub4_3.aByteArray5, local260);
					Static79.aClass3_Sub4_3.anInt232 = 0;
					@Pc(330) Class46 local330 = Static138.method815(Static130.method2188(Static79.aClass3_Sub4_3).method1364());
					arg1.aClass46_590 = local330.method1379();
					arg1.anInt1716 = local122 >> 8;
					arg1.anInt1730 = 150;
					arg1.anInt1694 = local122 & 0xFF;
					if (local126 == 2 || local126 == 3) {
						Static168.method2686(1, Static178.method2860(new Class46[] { Static157.aClass46_1266, arg1.aClass46_233 }), local330);
					} else if (local126 == 1) {
						Static168.method2686(1, Static178.method2860(new Class46[] { Static148.aClass46_1289, arg1.aClass46_233 }), local330);
					} else {
						Static168.method2686(2, arg1.aClass46_233, local330);
					}
				}
			}
			Static49.aClass3_Sub4_Sub1_2.anInt232 = local263 + local260;
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt1718 = Static49.aClass3_Sub4_Sub1_2.method184();
			arg1.anInt1708 = Static49.aClass3_Sub4_Sub1_2.method171();
		}
		if ((arg2 & 0x8) != 0) {
			local122 = Static49.aClass3_Sub4_Sub1_2.method192();
			@Pc(443) byte[] local443 = new byte[local122];
			@Pc(448) Class3_Sub4 local448 = new Class3_Sub4(local443);
			Static49.aClass3_Sub4_Sub1_2.method180(local443, local122);
			Static114.aClass3_Sub4Array1[arg0] = local448;
			arg1.method572(local448);
		}
		if ((arg2 & 0x400) != 0) {
			local122 = Static49.aClass3_Sub4_Sub1_2.method205();
			local126 = Static49.aClass3_Sub4_Sub1_2.method191();
			arg1.method1164(local126, local122, Static20.anInt512);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!kf;)V")
	public static void method1563(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static139.aBoolean134) {
			Static91.method1513(arg0);
			return;
		}
		if (Static127.anInt3013 == 1 && Static77.anInt1923 >= 715 && Static48.anInt1329 >= 453) {
			Static148.aBoolean151 = !Static148.aBoolean151;
			if (Static148.aBoolean151) {
				Static4.method2684();
			} else {
				Static40.method840(Static130.aClass46_1067, Static151.aClass46_1192, Static53.aClass44_Sub1_5);
			}
		}
		if (Static26.anInt597 == 5) {
			return;
		}
		Static36.anInt1029++;
		if (Static26.anInt597 != 10) {
			return;
		}
		if (Static48.anInt1331 != 2 && Static122.anInt2902 == 0) {
			if (Static127.anInt3013 == 1 && Static77.anInt1923 >= 5 && Static77.anInt1923 <= 105 && Static48.anInt1329 >= 463 && Static48.anInt1329 <= 498) {
				Static71.method1218();
				return;
			}
			if (Static51.aClass73_1 != null) {
				Static71.method1218();
			}
		}
		@Pc(123) int local123 = Static77.anInt1923;
		@Pc(125) int local125 = Static48.anInt1329;
		@Pc(127) int local127 = Static127.anInt3013;
		if (Static122.anInt2903 == 0) {
			@Pc(136) boolean local136 = false;
			if (local127 == 1 && local123 >= 227 && local123 <= 377 && local125 >= 271 && local125 <= 311) {
				Static28.anInt691 = 0;
				Static122.anInt2903 = 3;
			}
			if (Static114.anInt2715 != 0) {
				while (Static95.method1573()) {
					if (Static2.anInt25 == 84) {
						local136 = true;
						break;
					}
				}
			}
			if (local136 || local127 == 1 && local123 >= 387 && local123 <= 537 && local125 >= 271 && local125 <= 311) {
				Static130.aClass46_1062 = Static155.aClass46_1219;
				Static122.anInt2903 = 2;
				Static130.aClass46_1064 = Static155.aClass46_1210;
				Static28.anInt691 = 0;
				Static130.aClass46_1060 = Static171.aClass46_1352;
			}
		} else if (Static122.anInt2903 == 2) {
			@Pc(298) short local298 = 231;
			@Pc(299) int local299 = local298 + 30;
			if (local127 == 1 && local125 >= 246 && local125 < 261) {
				Static28.anInt691 = 0;
			}
			local299 += 15;
			if (local127 == 1 && local125 >= 261 && local125 < 276) {
				Static28.anInt691 = 1;
			}
			local299 += 15;
			if (local127 == 1 && local123 >= 227 && local123 <= 377 && local125 >= 301 && local125 <= 341) {
				Static130.aClass46_1066 = Static130.aClass46_1066.method1372().method1371();
				if (Static130.aClass46_1066.method1376() == 0) {
					Static81.method1387(Static155.aClass46_1223, Static155.aClass46_1243, Static174.aClass46_1374);
				} else if (Static130.aClass46_1063.method1376() == 0) {
					Static81.method1387(Static155.aClass46_1227, Static155.aClass46_1229, Static59.aClass46_541);
				} else {
					Static81.method1387(Static155.aClass46_1224, Static155.aClass46_1235, Static8.aClass46_70);
					Static180.method2893(20);
				}
			} else {
				if (local127 == 1 && local123 >= 387 && local123 <= 537 && local125 >= 301 && local125 <= 341) {
					Static130.aClass46_1063 = Static130.aClass46_1067;
					Static130.aClass46_1066 = Static130.aClass46_1067;
					Static122.anInt2903 = 0;
				}
				while (true) {
					@Pc(457) boolean local457;
					label228: do {
						while (Static95.method1573()) {
							local457 = false;
							for (@Pc(459) int local459 = 0; local459 < Static34.aClass46_264.method1376(); local459++) {
								if (Static78.anInt2403 == Static34.aClass46_264.method1357(local459)) {
									local457 = true;
									break;
								}
							}
							if (Static28.anInt691 != 0) {
								continue label228;
							}
							if (Static2.anInt25 == 85 && Static130.aClass46_1066.method1376() > 0) {
								Static130.aClass46_1066 = Static130.aClass46_1066.method1363(Static130.aClass46_1066.method1376() - 1, 0);
							}
							if (Static2.anInt25 == 84 || Static2.anInt25 == 80) {
								Static28.anInt691 = 1;
							}
							if (local457 && Static130.aClass46_1066.method1376() < 12) {
								Static130.aClass46_1066 = Static130.aClass46_1066.method1358(Static78.anInt2403);
							}
						}
						return;
					} while (Static28.anInt691 != 1);
					if (Static2.anInt25 == 85 && Static130.aClass46_1063.method1376() > 0) {
						Static130.aClass46_1063 = Static130.aClass46_1063.method1363(Static130.aClass46_1063.method1376() - 1, 0);
					}
					if (Static2.anInt25 == 84 || Static2.anInt25 == 80) {
						Static28.anInt691 = 0;
					}
					if (Static114.anInt2715 != 0 && Static2.anInt25 == 84) {
						Static130.aClass46_1066 = Static130.aClass46_1066.method1372().method1371();
						if (Static130.aClass46_1066.method1376() == 0) {
							Static81.method1387(Static155.aClass46_1223, Static155.aClass46_1243, Static174.aClass46_1374);
							return;
						}
						if (Static130.aClass46_1063.method1376() == 0) {
							Static81.method1387(Static155.aClass46_1227, Static155.aClass46_1229, Static59.aClass46_541);
							return;
						}
						Static81.method1387(Static155.aClass46_1224, Static155.aClass46_1235, Static8.aClass46_70);
						Static180.method2893(20);
						return;
					}
					if (local457 && Static130.aClass46_1063.method1376() < 20) {
						Static130.aClass46_1063 = Static130.aClass46_1063.method1358(Static78.anInt2403);
					}
				}
			}
		} else if (Static122.anInt2903 == 3 && local127 == 1 && local123 >= 307 && local123 <= 457 && local125 >= 301 && local125 <= 341) {
			Static122.anInt2903 = 0;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Lclient!kb;")
	public static Class46 method1564(@OriginalArg(1) int arg0) {
		@Pc(7) Class46 local7 = new Class46();
		local7.aByteArray17 = new byte[arg0];
		local7.anInt2034 = 0;
		return local7;
	}
}
