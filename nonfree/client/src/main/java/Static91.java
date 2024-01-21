import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public static int anInt2532 = 0;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1054 = Static34.method846("Off");

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "Lclient!le;")
	public static Class36 aClass36_30 = new Class36(50);

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1055 = aClass55_1054;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1056 = Static34.method846("titlebutton");

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1059 = Static34.method846("Enter name:");

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1057 = aClass55_1059;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "Lclient!ce;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1058 = Static34.method846("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
	public static int anInt2553 = 0;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1060 = Static34.method846("Abbrechen");

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1061 = Static34.method846("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
	public static int anInt2554 = 0;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1062 = Static34.method846("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1725() {
		aClass55_1059 = null;
		aClass55_1056 = null;
		aClass55_1058 = null;
		aClass36_30 = null;
		aBooleanArray10 = null;
		aClass55_1061 = null;
		aClass55_1054 = null;
		aClass55_1057 = null;
		aClass55_1062 = null;
		aClass55_1055 = null;
		aClass55_1060 = null;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1726() {
		Static58.aClass21_13.method1445();
		Static8.aClass6_Sub2_Sub2_Sub1_3.method318(0, 0);
		Static85.anIntArray238 = Static30.method790(Static85.anIntArray238);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method1727() {
		Static21.aBoolean42 = true;
		Static57.method1181();
		if (Static67.aBoolean90) {
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static34.aClass55_506, 239, 40, 0);
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static89.method1698(new Class55[] { Static34.aClass55_511, Static114.aClass55_1378 }), 239, 60, 128);
		} else if (Static79.anInt2289 == 1) {
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static19.aClass55_333, 239, 40, 0);
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static89.method1698(new Class55[] { Static34.aClass55_510, Static114.aClass55_1378 }), 239, 60, 128);
		} else if (Static79.anInt2289 == 2) {
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(aClass55_1057, 239, 40, 0);
			Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static89.method1698(new Class55[] { Static34.aClass55_510, Static114.aClass55_1378 }), 239, 60, 128);
		} else {
			@Pc(86) Class6_Sub2_Sub2_Sub4 local86;
			@Pc(93) int local93;
			@Pc(103) int local103;
			if (Static79.anInt2289 == 3) {
				if (Static34.aClass55_510 != Static34.aClass55_509) {
					Static72.method1428(Static34.aClass55_510);
					Static34.aClass55_509 = Static34.aClass55_510;
				}
				local86 = Static4.aClass6_Sub2_Sub2_Sub4_6;
				Static53.method1277(0, 0, 463, 77);
				for (local93 = 0; local93 < Static85.anInt2392; local93++) {
					local103 = local93 * 14 + 18 - Static27.anInt1353;
					if (local103 > 0 && local103 < 110) {
						local86.method1307(Static35.aClass55Array11[local93], 239, local103, 0);
					}
				}
				Static53.method1289();
				if (Static85.anInt2392 > 5) {
					Static43.method982(0, 77, Static27.anInt1353, 463, Static85.anInt2392 * 14 + 7);
				}
				if (Static34.aClass55_510.method1674() == 0) {
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static76.aClass55_889, 239, 40, 255);
				} else if (Static85.anInt2392 == 0) {
					Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static55.aClass55_661, 239, 40, 0);
				}
				local86.method1307(Static89.method1698(new Class55[] { Static34.aClass55_510, Static114.aClass55_1378 }), 239, 90, 0);
				Static53.method1285(0, 77, 479, 0);
			} else if (Static44.aClass55_1159 == null) {
				@Pc(223) boolean local223;
				if (Static1.anInt3 != -1) {
					local223 = Static69.method1383(Static1.anInt3, 96, 479, 2);
					if (!local223) {
						Static72.aBoolean99 = true;
					}
				} else if (Static39.anInt1691 == -1) {
					local86 = Static4.aClass6_Sub2_Sub2_Sub4_6;
					local93 = 0;
					Static53.method1277(0, 0, 463, 77);
					for (local103 = 0; local103 < 100; local103++) {
						if (Static29.aClass55Array10[local103] != null) {
							@Pc(250) Class55 local250 = Static74.aClass55Array16[local103];
							@Pc(259) int local259 = Static102.anInt3033 + 70 - local93 * 14;
							@Pc(263) int local263 = Static100.anIntArray276[local103];
							@Pc(265) byte local265 = 0;
							if (local250 != null && local250.method1659(Static63.aClass55_750)) {
								local265 = 1;
								local250 = local250.method1673(5);
							}
							if (local250 != null && local250.method1659(Static34.aClass55_505)) {
								local250 = local250.method1673(5);
								local265 = 2;
							}
							if (local263 == 0) {
								if (local259 > 0 && local259 < 110) {
									local86.method1303(Static29.aClass55Array10[local103], 4, local259, 0);
								}
								local93++;
							}
							@Pc(355) int local355;
							if ((local263 == 1 || local263 == 2) && (local263 == 1 || Static12.anInt717 == 0 || Static12.anInt717 == 1 && Static57.method1186(local250))) {
								local93++;
								if (local259 > 0 && local259 < 110) {
									local355 = 4;
									if (local265 == 1) {
										Static57.aClass6_Sub2_Sub2_Sub1Array29[0].method318(4, local259 - 12);
										local355 += 14;
									}
									if (local265 == 2) {
										Static57.aClass6_Sub2_Sub2_Sub1Array29[1].method318(local355, local259 - 12);
										local355 += 14;
									}
									local86.method1303(Static89.method1698(new Class55[] { local250, Static13.aClass55_265 }), local355, local259, 0);
									local355 += local86.method1301(local250) + 8;
									local86.method1303(Static29.aClass55Array10[local103], local355, local259, 255);
								}
							}
							if ((local263 == 3 || local263 == 7) && Static31.anInt1201 == 0 && (local263 == 7 || Static112.anInt3231 == 0 || Static112.anInt3231 == 1 && Static57.method1186(local250))) {
								local93++;
								if (local259 > 0 && local259 < 110) {
									local86.method1303(Static7.aClass55_126, 4, local259, 0);
									local355 = local86.method1301(Static7.aClass55_126) + 4;
									local355 += local86.method1293(32);
									if (local265 == 1) {
										Static57.aClass6_Sub2_Sub2_Sub1Array29[0].method318(local355, local259 - 12);
										local355 += 14;
									}
									if (local265 == 2) {
										Static57.aClass6_Sub2_Sub2_Sub1Array29[1].method318(local355, local259 - 12);
										local355 += 14;
									}
									local86.method1303(Static89.method1698(new Class55[] { local250, Static13.aClass55_265 }), local355, local259, 0);
									local355 += local86.method1301(local250) + 8;
									local86.method1303(Static29.aClass55Array10[local103], local355, local259, 8388608);
								}
							}
							if (local263 == 4 && (Static41.anInt1399 == 0 || Static41.anInt1399 == 1 && Static57.method1186(local250))) {
								local93++;
								if (local259 > 0 && local259 < 110) {
									local86.method1303(Static89.method1698(new Class55[] { local250, Static71.aClass55_859, Static29.aClass55Array10[local103] }), 4, local259, 8388736);
								}
							}
							if (local263 == 5 && Static31.anInt1201 == 0 && Static112.anInt3231 < 2) {
								local93++;
								if (local259 > 0 && local259 < 110) {
									local86.method1303(Static29.aClass55Array10[local103], 4, local259, 8388608);
								}
							}
							if (local263 == 6 && Static31.anInt1201 == 0 && Static112.anInt3231 < 2) {
								local93++;
								if (local259 > 0 && local259 < 110) {
									local86.method1303(Static89.method1698(new Class55[] { Static17.aClass55_319, Static71.aClass55_859, local250, Static13.aClass55_265 }), 4, local259, 0);
									local86.method1303(Static29.aClass55Array10[local103], local86.method1301(Static89.method1698(new Class55[] { Static17.aClass55_319, Static71.aClass55_859, local250 })) + 12, local259, 8388608);
								}
							}
							if (local263 == 8 && (Static41.anInt1399 == 0 || Static41.anInt1399 == 1 && Static57.method1186(local250))) {
								if (local259 > 0 && local259 < 110) {
									local86.method1303(Static89.method1698(new Class55[] { local250, Static71.aClass55_859, Static29.aClass55Array10[local103] }), 4, local259, 8270336);
								}
								local93++;
							}
						}
					}
					Static53.method1289();
					Static111.anInt3171 = local93 * 14 + 7;
					if (Static111.anInt3171 < 78) {
						Static111.anInt3171 = 78;
					}
					Static43.method982(0, 77, Static111.anInt3171 - Static102.anInt3033 - 77, 463, Static111.anInt3171);
					@Pc(776) Class55 local776;
					if (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1 == null || Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass55_245 == null) {
						local776 = Static29.aClass55_429;
					} else {
						local776 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass55_245;
					}
					local86.method1303(Static89.method1698(new Class55[] { local776, Static13.aClass55_265 }), 4, 90, 0);
					local86.method1303(Static89.method1698(new Class55[] { Static34.aClass55_504, Static114.aClass55_1378 }), local86.method1301(Static89.method1698(new Class55[] { local776, Static47.aClass55_587 })) + 6, 90, 255);
					Static53.method1285(0, 77, 479, 0);
				} else {
					local223 = Static69.method1383(Static39.anInt1691, 96, 479, 3);
					if (!local223) {
						Static72.aBoolean99 = true;
					}
				}
			} else {
				Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static44.aClass55_1159, 239, 40, 0);
				Static81.aClass6_Sub2_Sub2_Sub4_4.method1307(Static63.aClass55_748, 239, 60, 128);
			}
		}
		if (Static109.aBoolean163 && Static1.anInt6 == 2) {
			Static109.method2036();
		}
		Static55.method1170();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public static void method1728(@OriginalArg(0) int arg0) {
		Static94.anInt2641 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
	public static int method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static43.aByteArrayArrayArray8[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static43.aByteArrayArrayArray8[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZI)V")
	public static void method1731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			Static51.aClass6_Sub1_Sub1_3.method1515(60);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 2) {
			Static51.aClass6_Sub1_Sub1_3.method1515(6);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 3) {
			Static51.aClass6_Sub1_Sub1_3.method1515(63);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 4) {
			Static51.aClass6_Sub1_Sub1_3.method1515(88);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 5) {
			Static51.aClass6_Sub1_Sub1_3.method1515(59);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 6) {
			Static51.aClass6_Sub1_Sub1_3.method1515(37);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 7) {
			Static51.aClass6_Sub1_Sub1_3.method1515(55);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 8) {
			Static51.aClass6_Sub1_Sub1_3.method1515(219);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 9) {
			Static51.aClass6_Sub1_Sub1_3.method1515(178);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
		if (arg2 == 10) {
			Static51.aClass6_Sub1_Sub1_3.method1515(58);
			Static51.aClass6_Sub1_Sub1_3.method1499(arg0);
			Static51.aClass6_Sub1_Sub1_3.method1512(arg1);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!te;)V")
	public static void method1738(@OriginalArg(1) Class6_Sub2_Sub14 arg0) {
		@Pc(8) int local8 = arg0.anInt2909;
		@Pc(80) int local80;
		if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
			if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
				local80 = Static64.anInt1912;
				if (local8 <= 800) {
					local8 -= 101;
				} else {
					local8 -= 701;
				}
				if (Static70.anInt2072 != 2) {
					local80 = 0;
				}
				if (local8 >= local80) {
					arg0.anInt2903 = 0;
					arg0.aClass55_1223 = Static34.aClass55_502;
				} else {
					if (Static102.anIntArray286[local8] == 0) {
						arg0.aClass55_1223 = Static89.method1698(new Class55[] { Static18.aClass55_320, Static59.aClass55_703 });
					} else if (Static102.anIntArray286[local8] >= 5000) {
						if (Static59.anInt1828 == Static102.anIntArray286[local8]) {
							arg0.aClass55_1223 = Static89.method1698(new Class55[] { Static44.aClass55_1153, Static98.aClass55_1196, Static58.method1196(Static102.anIntArray286[local8] - 5000) });
						} else {
							arg0.aClass55_1223 = Static89.method1698(new Class55[] { Static15.aClass55_287, Static98.aClass55_1196, Static58.method1196(Static102.anIntArray286[local8] - 5000) });
						}
					} else if (Static102.anIntArray286[local8] == Static59.anInt1828) {
						arg0.aClass55_1223 = Static89.method1698(new Class55[] { Static44.aClass55_1153, Static57.aClass55_671, Static58.method1196(Static102.anIntArray286[local8]) });
					} else {
						arg0.aClass55_1223 = Static89.method1698(new Class55[] { Static15.aClass55_287, Static57.aClass55_671, Static58.method1196(Static102.anIntArray286[local8]) });
					}
					arg0.anInt2903 = 1;
				}
			} else if (local8 == 203) {
				local80 = Static64.anInt1912;
				if (Static70.anInt2072 != 2) {
					local80 = 0;
				}
				arg0.anInt2919 = local80 * 15 + 20;
				if (arg0.anInt2919 <= arg0.anInt2875) {
					arg0.anInt2919 = arg0.anInt2875 + 1;
				}
			} else if (local8 >= 401 && local8 <= 500) {
				local8 -= 401;
				if (local8 == 0 && Static70.anInt2072 == 0) {
					arg0.anInt2903 = 0;
					arg0.aClass55_1223 = Static68.aClass55_805;
				} else if (local8 == 1 && Static70.anInt2072 == 0) {
					arg0.anInt2903 = 0;
					arg0.aClass55_1223 = Static67.aClass55_788;
				} else {
					local80 = Static12.anInt712;
					if (Static70.anInt2072 == 0) {
						local80 = 0;
					}
					if (local80 <= local8) {
						arg0.anInt2903 = 0;
						arg0.aClass55_1223 = Static34.aClass55_502;
					} else {
						arg0.aClass55_1223 = Static50.method2085(Static29.aLongArray3[local8]).method1655();
						arg0.anInt2903 = 1;
					}
				}
			} else if (local8 == 503) {
				arg0.anInt2919 = Static12.anInt712 * 15 + 20;
				if (arg0.anInt2919 <= arg0.anInt2875) {
					arg0.anInt2919 = arg0.anInt2875 + 1;
				}
			} else if (local8 == 324) {
				if (Static7.anInt292 == -1) {
					Static34.anInt1318 = arg0.anInt2892;
					Static7.anInt292 = arg0.anInt2878;
				}
				if (Static74.aClass8_3.aBoolean21) {
					arg0.anInt2878 = Static7.anInt292;
				} else {
					arg0.anInt2878 = Static34.anInt1318;
				}
			} else if (local8 == 325) {
				if (Static7.anInt292 == -1) {
					Static7.anInt292 = arg0.anInt2878;
					Static34.anInt1318 = arg0.anInt2892;
				}
				if (Static74.aClass8_3.aBoolean21) {
					arg0.anInt2878 = Static34.anInt1318;
				} else {
					arg0.anInt2878 = Static7.anInt292;
				}
			} else if (local8 == 327) {
				arg0.anInt2896 = 150;
				arg0.anInt2888 = (int) (Math.sin((double) Static85.anInt2389 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2910 = 5;
				arg0.anInt2930 = 0;
			} else if (local8 == 328) {
				arg0.anInt2896 = 150;
				arg0.anInt2888 = (int) (Math.sin((double) Static85.anInt2389 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2910 = 5;
				arg0.anInt2930 = 1;
			} else if (local8 == 600) {
				arg0.aClass55_1223 = Static89.method1698(new Class55[] { Static34.aClass55_514, Static34.aClass55_501 });
			} else if (local8 == 620) {
				if (anInt2554 < 1) {
					arg0.aClass55_1223 = Static34.aClass55_502;
				} else if (Static90.aBoolean118) {
					arg0.aClass55_1223 = Static110.aClass55_1324;
					arg0.anInt2894 = 16711680;
				} else {
					arg0.anInt2894 = 16777215;
					arg0.aClass55_1223 = Static70.aClass55_832;
				}
			}
		} else if (local8 == 1 && Static70.anInt2072 == 0) {
			arg0.anInt2903 = 0;
			arg0.aClass55_1223 = Static5.aClass55_887;
		} else if (local8 == 1 && Static70.anInt2072 == 1) {
			arg0.aClass55_1223 = Static41.aClass55_541;
			arg0.anInt2903 = 0;
		} else if (local8 == 2 && Static70.anInt2072 != 2) {
			arg0.anInt2903 = 0;
			arg0.aClass55_1223 = Static67.aClass55_788;
		} else {
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local80 = Static64.anInt1912;
			if (Static70.anInt2072 != 2) {
				local80 = 0;
			}
			if (local80 <= local8) {
				arg0.aClass55_1223 = Static34.aClass55_502;
				arg0.anInt2903 = 0;
			} else {
				arg0.aClass55_1223 = Static68.aClass55Array18[local8];
				arg0.anInt2903 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)Z")
	public static boolean method1742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(8) Class6_Sub2_Sub15 local8 = Static8.method333(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method1941(arg1);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public static void method1745() {
		if (Static100.anInt2949 > 0) {
			Static75.method1437();
		} else {
			Static114.method2097(40);
			Static35.aClass65_2 = Static19.aClass65_1;
			Static19.aClass65_1 = null;
		}
	}
}
