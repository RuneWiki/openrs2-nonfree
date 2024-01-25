import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[[[Lclient!fq;")
	public static Class80[][][] lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static307.method4374("Argument count");
			}
			Static315.aClass209_3 = new Class209();
			Static315.aClass209_3.anInt5815 = Integer.parseInt(arg0[0]);
			Static81.aClass209_1 = new Class209();
			Static81.aClass209_1.anInt5815 = Integer.parseInt(arg0[1]);
			Static438.aClass209_4 = new Class209();
			Static438.aClass209_4.anInt5815 = Integer.parseInt(arg0[2]);
			Static35.aClass137_11 = Static102.aClass137_5;
			if (arg0[3].equals("live")) {
				Static150.aClass112_2 = Static323.aClass112_4;
			} else if (arg0[3].equals("rc")) {
				Static150.aClass112_2 = Static215.aClass112_3;
			} else if (arg0[3].equals("wip")) {
				Static150.aClass112_2 = Static122.aClass112_1;
			} else {
				Static307.method4374("modewhat");
			}
			Static341.anInt5770 = Static298.method5257(arg0[4]);
			if (Static341.anInt5770 == -1) {
				if (arg0[4].equals("english")) {
					Static341.anInt5770 = 0;
				} else if (arg0[4].equals("german")) {
					Static341.anInt5770 = 1;
				} else {
					Static307.method4374("language");
				}
			}
			Static333.aBoolean403 = false;
			Static189.aBoolean208 = false;
			if (arg0[5].equals("game0")) {
				Static337.aClass61_5 = Static444.aClass61_7;
			} else if (arg0[5].equals("game1")) {
				Static337.aClass61_5 = Static147.aClass61_4;
			} else {
				Static307.method4374("game");
			}
			Static209.anInt3932 = 0;
			Static164.aString23 = "";
			Static317.aBoolean389 = true;
			Static158.aBoolean180 = true;
			Static263.anInt4681 = 0;
			Static373.anInt6190 = Static337.aClass61_5.anInt1910;
			@Pc(154) client local154 = new client();
			Static152.aClient1 = local154;
			local154.method1215(Static150.aClass112_2.method2643() + 32, Static337.aClass61_5.aString16);
			Static285.aFrame4.setLocation(40, 40);
		} catch (@Pc(178) Exception local178) {
			Static158.method2570(local178, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method1235() {
		@Pc(15) boolean local15 = Static365.aClass195_2.method4449();
		if (!local15) {
			this.method1251();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1224() {
		try {
			this.method1253();
		} catch (@Pc(12) OutOfMemoryError local12) {
			if (local12.getMessage() == null || !local12.getMessage().startsWith("native")) {
				throw local12;
			}
			Static178.method2844(0);
			Static158.method2570(local12, local12.getMessage() + " (Recovered) " + this.method1232());
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1223()) {
			return;
		}
		Static315.aClass209_3 = new Class209();
		Static315.aClass209_3.anInt5815 = Integer.parseInt(this.getParameter("worldid"));
		Static81.aClass209_1 = new Class209();
		Static81.aClass209_1.anInt5815 = Integer.parseInt(this.getParameter("lobbyid"));
		Static81.aClass209_1.aString60 = this.getParameter("lobbyaddress");
		Static438.aClass209_4 = new Class209();
		Static438.aClass209_4.anInt5815 = Integer.parseInt(this.getParameter("demoid"));
		Static438.aClass209_4.aString60 = this.getParameter("demoaddress");
		Static35.aClass137_11 = Static227.method3470(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static53.method907(Static35.aClass137_11) && Static45.aClass137_10 != Static35.aClass137_11) {
			Static35.aClass137_11 = Static45.aClass137_10;
		}
		Static150.aClass112_2 = Static197.method3076(Integer.parseInt(this.getParameter("modewhat")));
		if (Static150.aClass112_2 != Static122.aClass112_1 && Static150.aClass112_2 != Static215.aClass112_3 && Static323.aClass112_4 != Static150.aClass112_2) {
			Static150.aClass112_2 = Static323.aClass112_4;
		}
		try {
			Static341.anInt5770 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static341.anInt5770 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static333.aBoolean403 = true;
		} else {
			Static333.aBoolean403 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static189.aBoolean208 = true;
		} else {
			Static189.aBoolean208 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static222.aBoolean289 = true;
		} else {
			Static222.aBoolean289 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static337.aClass61_5 = Static444.aClass61_7;
			} else if (local145.equals("1")) {
				Static337.aClass61_5 = Static147.aClass61_4;
			}
		}
		try {
			Static209.anInt3932 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static209.anInt3932 = 0;
		}
		Static228.aString33 = this.getParameter("quiturl");
		Static164.aString23 = this.getParameter("settings");
		if (Static164.aString23 == null) {
			Static164.aString23 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static263.anInt4681 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static263.anInt4681 = 0;
			}
		}
		Static373.anInt6190 = Integer.parseInt(this.getParameter("colourid"));
		if (Static373.anInt6190 < 0 || Static373.anInt6190 >= Static332.aColorArray2.length) {
			Static373.anInt6190 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static317.aBoolean389 = true;
			Static158.aBoolean180 = true;
		}
		if (Static444.aClass61_7 == Static337.aClass61_5) {
			Static270.anInt4804 = 503;
			Static392.anInt6303 = 765;
		} else if (Static337.aClass61_5 == Static147.aClass61_4) {
			Static392.anInt6303 = 640;
			Static270.anInt4804 = 480;
		}
		Static152.aClient1 = this;
		this.method1233(Static270.anInt4804, Static150.aClass112_2.method2643() + 32, Static392.anInt6303);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1239() {
		if (Static342.anInt5771 == 13) {
			return;
		}
		Static378.anInt4244++;
		if (Static378.anInt4244 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static381.anInt6917 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static415.aRandom1.setSeed((long) Static381.anInt6917);
		}
		if (Static378.anInt4244 % 50 == 0) {
			Static42.anInt862 = Static417.anInt6756;
			Static135.anInt2706 = Static3.anInt107;
			Static417.anInt6756 = 0;
			Static3.anInt107 = 0;
		}
		this.method1235();
		if (Static340.aClass254_1 != null) {
			Static340.aClass254_1.method5562();
		}
		Static66.method1320();
		Static306.aClass155_1.method3518();
		Static125.aClass114_1.method2706();
		if (Static135.aClass25_1 != null) {
			@Pc(90) int local90 = Static135.aClass25_1.method5799();
			Static268.anInt4749 = local90;
		}
		if (Static415.aClass39_11 != null) {
			Static415.aClass39_11.method4521((int) Static279.method4058());
		}
		Static257.method3837();
		Static150.anInt2864 = 0;
		for (@Pc(107) Class250 local107 = Static306.aClass155_1.method3519(); local107 != null && Static150.anInt2864 < 128; local107 = Static306.aClass155_1.method3519()) {
			if (local107.method5641() != 1) {
				@Pc(120) char local120 = local107.method5645();
				if (!Static54.method911() || local120 != '`' && local120 != '§') {
					Static344.aClass250Array1[Static150.anInt2864] = local107;
					Static150.anInt2864++;
				} else if (Static160.method2594()) {
					Static421.method1797();
				} else {
					Static454.method5962();
				}
			}
		}
		for (@Pc(167) Class1_Sub7 local167 = Static125.aClass114_1.method2700(); local167 != null; local167 = Static125.aClass114_1.method2700()) {
			@Pc(173) int local173 = local167.method3628();
			if (local173 == -1) {
				Static231.aClass181_65.method4102(local167);
			} else if (Static372.method5076(local173)) {
				Static447.aClass181_64.method4102(local167);
			}
			if (Static447.aClass181_64.method4108() > 10) {
				Static447.aClass181_64.method4109();
			}
		}
		if (Static160.method2594()) {
			Static229.method3493();
		}
		if (Static342.anInt5771 == 0) {
			this.method1255();
			Static320.method5063();
		} else if (Static342.anInt5771 == 1) {
			this.method1255();
			Static320.method5063();
		} else if (Static139.method2336(Static342.anInt5771)) {
			Static314.method4467();
		}
		if (Static323.method4607(Static342.anInt5771) && !Static139.method2336(Static342.anInt5771)) {
			this.method1246();
			Static179.method2849();
			Static136.method2329();
		} else if (Static85.method1601(Static342.anInt5771) && !Static139.method2336(Static342.anInt5771)) {
			this.method1246();
			Static136.method2329();
		} else if (Static342.anInt5771 == 11) {
			Static136.method2329();
		} else if (Static340.method4806(Static342.anInt5771) && !Static139.method2336(Static342.anInt5771)) {
			Static26.method559();
		} else if (Static342.anInt5771 == 12) {
			Static136.method2329();
			if (Static285.anInt4984 != -3 && Static285.anInt4984 != 2 && Static285.anInt4984 != 15) {
				Static225.method3455(false);
			}
		}
		Static414.method5534(Static415.aClass39_11);
		Static447.aClass181_64.method4109();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V")
	private void method1241(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub5 local14 = new Class1_Sub5(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method5366();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(32) int[] local32 = Static331.anIntArray649 = new int[6];
					local32[0] = local14.method5362();
					local32[1] = local14.method5362();
					local32[2] = local14.method5362();
					local32[3] = local14.method5362();
					local32[4] = local14.method5362();
					local32[5] = local14.method5362();
				} else {
					@Pc(79) int local79;
					@Pc(84) int local84;
					if (local18 == 4) {
						local79 = local14.method5366();
						Static425.anIntArray616 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static425.anIntArray616[local84] = local14.method5362();
							if (Static425.anIntArray616[local84] == 65535) {
								Static425.anIntArray616[local84] = -1;
							}
						}
					} else if (local18 == 5) {
						local79 = local14.method5366();
						Static317.anIntArray499 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static317.anIntArray499[local84] = local14.method5362();
							if (Static317.anIntArray499[local84] == 65535) {
								Static317.anIntArray499[local84] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1246() {
		@Pc(39) int local39;
		if (Static342.anInt5771 == 6 && Static90.anInt1905 == 0) {
			if (Static264.anInt4690 > 0) {
				Static264.anInt4690--;
			}
			if (Static425.anInt6874 > 1) {
				Static425.anInt6874--;
				Static433.anInt7017 = Static319.anInt4221;
			}
			if (!Static385.aBoolean436) {
				Static220.method3399();
			}
			for (local39 = 0; local39 < 100 && Static58.method1257(); local39++) {
			}
		}
		Static4.anInt115++;
		Static187.method2936(null, -1, -1);
		Static413.method5646(null, -1, -1);
		Static453.method5942();
		Static319.anInt4221++;
		for (local39 = 0; local39 < 32768; local39++) {
			@Pc(78) Class31_Sub2_Sub1_Sub2 local78 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local39];
			if (local78 != null) {
				@Pc(84) byte local84 = local78.aClass53_1.aByte28;
				if ((local84 & 0x1) != 0) {
					@Pc(97) int local97 = local78.method5989();
					@Pc(118) int local118;
					if ((local84 & 0x2) != 0 && local78.anInt7378 == 0 && Math.random() * 1000.0D < 10.0D) {
						local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(126) int local126 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local118 != 0 || local126 != 0) {
							@Pc(140) int local140 = local78.anIntArray658[0] + local118;
							@Pc(147) int local147 = local126 + local78.anIntArray657[0];
							if (local140 < 0) {
								local140 = 0;
							} else if (local140 > Static195.anInt3537 - local97 - 1) {
								local140 = Static195.anInt3537 - local97 - 1;
							}
							if (local147 < 0) {
								local147 = 0;
							} else if (Static118.anInt2419 - local97 - 1 < local147) {
								local147 = Static118.anInt2419 - local97 - 1;
							}
							@Pc(224) int local224 = Static210.method3331(local97, Static295.anIntArray443, local140, 0, local147, 0, Static125.aClass188Array1[local78.aByte100], local97, local78.anIntArray657[0], -1, true, Static119.anIntArray65, local97, local78.anIntArray658[0]);
							if (local224 > 0) {
								if (local224 > 9) {
									local224 = 9;
								}
								for (@Pc(235) int local235 = 0; local235 < local224; local235++) {
									local78.anIntArray658[local235] = Static295.anIntArray443[local224 - local235 - 1];
									local78.anIntArray657[local235] = Static119.anIntArray65[local224 - local235 - 1];
									local78.aByteArray96[local235] = 1;
								}
								local78.anInt7378 = local224;
							}
						}
					}
					Static137.method2331(true, local78);
					local118 = Static223.method3423(local78);
					Static177.method2837(local118, Static43.anInt896, local78, Static294.anInt7294);
					Static169.method2681(local78);
				}
			}
		}
		if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
			if (Static345.anInt5797 == 2) {
				Static246.method4279();
			} else {
				Static182.method2891();
			}
			if (Static139.anInt2727 >> 7 < 14 || Static195.anInt3537 - 14 <= Static139.anInt2727 >> 7 || Static92.anInt1946 >> 7 < 14 || Static92.anInt1946 >> 7 >= Static118.anInt2419 - 14) {
				Static250.method3753();
			}
		}
		while (true) {
			@Pc(358) Class1_Sub24 local358;
			@Pc(363) Class251 local363;
			@Pc(374) Class251 local374;
			do {
				local358 = (Class1_Sub24) Static176.aClass181_30.method4109();
				if (local358 == null) {
					while (true) {
						do {
							local358 = (Class1_Sub24) Static257.aClass181_47.method4109();
							if (local358 == null) {
								while (true) {
									do {
										local358 = (Class1_Sub24) Static249.aClass181_43.method4109();
										if (local358 == null) {
											if (Static455.aClass251_14 != null) {
												Static114.method2107();
											}
											if (Static378.anInt4244 % 1500 == 0) {
												Static123.method2221();
											}
											if (Static342.anInt5771 == 6 && Static90.anInt1905 == 0) {
												Static184.method2899();
											}
											Static76.method1511();
											if (Static359.aBoolean414 && Static279.method4058() - 60000L > Static209.aLong120) {
												Static89.method1640();
											}
											for (@Pc(543) Class4_Sub2_Sub2 local543 = (Class4_Sub2_Sub2) Static96.aClass141_4.method3357(); local543 != null; local543 = (Class4_Sub2_Sub2) Static96.aClass141_4.method3360()) {
												if ((long) local543.anInt1892 < Static279.method4058() / 1000L - 5L) {
													if (local543.aShort30 > 0) {
														Static378.method3527(local543.aString15 + Static262.aClass7_109.method331(Static341.anInt5770), 0, "", "", 5);
													}
													if (local543.aShort30 == 0) {
														Static378.method3527(local543.aString15 + Static321.aClass7_124.method331(Static341.anInt5770), 0, "", "", 5);
													}
													local543.method5737();
												}
											}
											if (Static342.anInt5771 == 6 && Static90.anInt1905 == 0) {
												if (Static82.aClass229_1 == null) {
													Static225.method3455(false);
													return;
												}
												Static245.anInt4501++;
												if (Static245.anInt4501 > 50) {
													Static193.method2984(Static249.aClass179_53);
												}
												try {
													if (Static82.aClass229_1 != null && Static92.aClass1_Sub5_Sub1_1.anInt6475 > 0) {
														Static417.anInt6756 += Static92.aClass1_Sub5_Sub1_1.anInt6475;
														Static82.aClass229_1.method5207(Static92.aClass1_Sub5_Sub1_1.aByteArray89, Static92.aClass1_Sub5_Sub1_1.anInt6475);
														Static245.anInt4501 = 0;
														Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
														return;
													}
												} catch (@Pc(670) IOException local670) {
													Static225.method3455(false);
													return;
												}
											}
											return;
										}
										local363 = local358.aClass251_5;
										if (local363.anInt6679 < 0) {
											break;
										}
										local374 = Static378.method3544(local363.anInt6722);
									} while (local374 == null || local374.aClass251Array2 == null || local374.aClass251Array2.length <= local363.anInt6679 || local374.aClass251Array2[local363.anInt6679] != local363);
									Static13.method366(local358);
								}
							}
							local363 = local358.aClass251_5;
							if (local363.anInt6679 < 0) {
								break;
							}
							local374 = Static378.method3544(local363.anInt6722);
						} while (local374 == null || local374.aClass251Array2 == null || local363.anInt6679 >= local374.aClass251Array2.length || local374.aClass251Array2[local363.anInt6679] != local363);
						Static13.method366(local358);
					}
				}
				local363 = local358.aClass251_5;
				if (local363.anInt6679 < 0) {
					break;
				}
				local374 = Static378.method3544(local363.anInt6722);
			} while (local374 == null || local374.aClass251Array2 == null || local363.anInt6679 >= local374.aClass251Array2.length || local374.aClass251Array2[local363.anInt6679] != local363);
			Static13.method366(local358);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
	@Override
	protected String method1232() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static165.anInt3049 + "," + Static345.anInt5799 + "," + Static195.anInt3537 + "," + Static118.anInt2419 + "|";
			if (Static452.aClass31_Sub2_Sub1_Sub1_2 != null) {
				local5 = local5 + "2)" + Static357.anInt5881 + "," + (Static165.anInt3049 + Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0]) + "," + (Static345.anInt5799 + Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0]) + "|";
			}
			local5 = local5 + "3)" + Static143.anInt2766 + "|4)" + Static38.aClass135_Sub1_1.anInt5108 + "|5)" + Static432.method5740() + "|6)" + Static95.anInt1971 + "," + Static34.anInt715 + "|";
			local5 = local5 + "7)" + Static38.aClass135_Sub1_1.method4237(Static143.anInt2766) + "|";
			local5 = local5 + "8)" + Static38.aClass135_Sub1_1.method4236(Static143.anInt2766) + "|";
			local5 = local5 + "9)" + Static38.aClass135_Sub1_1.aBoolean366 + "|";
			local5 = local5 + "10)" + Static38.aClass135_Sub1_1.aBoolean357 + "|";
			local5 = local5 + "11)" + Static38.aClass135_Sub1_1.aBoolean359 + "|";
			local5 = local5 + "12)" + Static38.aClass135_Sub1_1.method4244(Static143.anInt2766) + "|";
			local5 = local5 + "13)" + Static79.anInt1766 + "|";
			local5 = local5 + "14)" + Static342.anInt5771;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(218) Throwable local218) {
			}
			local5 = local5 + "]";
		} catch (@Pc(229) Throwable local229) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1213() {
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method1249(@OriginalArg(0) int arg0) {
		Static345.aClass229_4 = null;
		Static375.anInt6122 = 0;
		Static365.aClass195_2.anInt5403 = arg0;
		Static365.aClass195_2.anInt5404++;
		Static40.aClass9_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1222() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static438.method5774();
		Static60.aClass230_1 = new Class230(Static77.aClass180_1);
		Static365.aClass195_2 = new Class195();
		if (Static35.aClass137_11 != Static45.aClass137_10) {
			Static287.aByteArrayArray15 = new byte[50][];
		}
		Static38.aClass135_Sub1_1 = new Class135_Sub1(Static77.aClass180_1);
		if (Static35.aClass137_11 == Static45.aClass137_10) {
			Static315.aClass209_3.aString60 = this.getCodeBase().getHost();
		} else if (Static53.method907(Static35.aClass137_11)) {
			Static315.aClass209_3.aString60 = this.getCodeBase().getHost();
			Static315.aClass209_3.anInt5817 = Static315.aClass209_3.anInt5815 + 40000;
			Static81.aClass209_1.anInt5817 = Static81.aClass209_1.anInt5815 + 40000;
			Static438.aClass209_4.anInt5817 = Static438.aClass209_4.anInt5815 + 40000;
			Static315.aClass209_3.anInt5818 = Static315.aClass209_3.anInt5815 + 50000;
			Static81.aClass209_1.anInt5818 = Static81.aClass209_1.anInt5815 + 50000;
			Static438.aClass209_4.anInt5818 = Static438.aClass209_4.anInt5815 + 50000;
		} else if (Static102.aClass137_5 == Static35.aClass137_11) {
			Static315.aClass209_3.aString60 = "127.0.0.1";
			Static81.aClass209_1.aString60 = "127.0.0.1";
			Static315.aClass209_3.anInt5817 = Static315.aClass209_3.anInt5815 + 40000;
			Static438.aClass209_4.aString60 = "127.0.0.1";
			Static81.aClass209_1.anInt5817 = Static81.aClass209_1.anInt5815 + 40000;
			Static315.aClass209_3.anInt5818 = Static315.aClass209_3.anInt5815 + 50000;
			Static438.aClass209_4.anInt5817 = Static438.aClass209_4.anInt5815 + 40000;
			Static81.aClass209_1.anInt5818 = Static81.aClass209_1.anInt5815 + 50000;
			Static438.aClass209_4.anInt5818 = Static438.aClass209_4.anInt5815 + 50000;
		}
		if (Static337.aClass61_5 == Static444.aClass61_7) {
			Static297.aBoolean375 = false;
		}
		if (Static147.aClass61_4 == Static337.aClass61_5) {
			Static137.aBoolean164 = true;
			Static268.anInt4756 = 0;
			Static401.aShortArray111 = Static159.aShortArray46;
			Static444.aShortArrayArray8 = Static117.aShortArrayArray4;
			Static144.anInt2776 = 16777215;
			Static295.aShortArray84 = Static87.aShortArray25;
			Static191.aShortArrayArray5 = Static229.aShortArrayArray7;
		} else {
			Static191.aShortArrayArray5 = Static83.aShortArrayArray2;
			Static295.aShortArray84 = Static446.aShortArray115;
			Static401.aShortArray111 = Static254.aShortArray71;
			Static444.aShortArrayArray8 = Static105.aShortArrayArray3;
		}
		Static426.aShortArray113 = Static432.aShortArray114 = Static91.aShortArray26 = Static93.aShortArray27 = new short[256];
		Static451.aClass209_5 = Static315.aClass209_3;
		Static306.aClass155_1 = Static240.method3620(Static155.aCanvas4);
		Static125.aClass114_1 = Static171.method2756(Static155.aCanvas4);
		Static135.aClass25_1 = Static23.method4302();
		if (Static135.aClass25_1 != null) {
			Static135.aClass25_1.method5794(Static155.aCanvas4);
		}
		Static166.anInt3057 = Static282.anInt4930;
		try {
			if (Static77.aClass180_1.aClass222_2 != null) {
				Static79.aClass26_1 = new Class26(Static77.aClass180_1.aClass222_2, 5200, 0);
				for (@Pc(224) int local224 = 0; local224 < 30; local224++) {
					Static246.aClass26Array2[local224] = new Class26(Static77.aClass180_1.aClass222Array1[local224], 6000, 0);
				}
				Static409.aClass26_5 = new Class26(Static77.aClass180_1.aClass222_4, 6000, 0);
				Static300.aClass65_7 = new Class65(255, Static79.aClass26_1, Static409.aClass26_5, 500000);
				Static312.aClass26_4 = new Class26(Static77.aClass180_1.aClass222_3, 24, 0);
				Static77.aClass180_1.aClass222Array1 = null;
				Static77.aClass180_1.aClass222_4 = null;
				Static77.aClass180_1.aClass222_3 = null;
				Static77.aClass180_1.aClass222_2 = null;
			}
		} catch (@Pc(282) IOException local282) {
			Static300.aClass65_7 = null;
			Static79.aClass26_1 = null;
			Static312.aClass26_4 = null;
			Static409.aClass26_5 = null;
		}
		if (Static35.aClass137_11 != Static45.aClass137_10) {
			Static331.aBoolean498 = true;
		}
		if (Static337.aClass61_5 == Static444.aClass61_7) {
			Static16.aString3 = Static97.aClass7_51.method331(Static341.anInt5770);
		} else if (Static147.aClass61_4 == Static337.aClass61_5) {
			Static16.aString3 = Static235.aClass7_101.method331(Static341.anInt5770);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1251() {
		if (Static365.aClass195_2.anInt5404 > Static160.anInt3006) {
			Static451.aClass209_5.aBoolean406 = !Static451.aClass209_5.aBoolean406;
			Static44.anInt898 = 5 * 50 * (Static365.aClass195_2.anInt5404 - 1);
			if (Static44.anInt898 > 3000) {
				Static44.anInt898 = 3000;
			}
			if (Static365.aClass195_2.anInt5404 >= 2 && Static365.aClass195_2.anInt5403 == 6) {
				this.method1229("js5connect_outofdate");
				Static342.anInt5771 = 13;
				return;
			}
			if (Static365.aClass195_2.anInt5404 >= 4 && Static365.aClass195_2.anInt5403 == -1) {
				this.method1229("js5crc");
				Static342.anInt5771 = 13;
				return;
			}
			if (Static365.aClass195_2.anInt5404 >= 4 && Static158.method2572(Static342.anInt5771)) {
				if (Static365.aClass195_2.anInt5403 == 7 || Static365.aClass195_2.anInt5403 == 9) {
					this.method1229("js5connect_full");
				} else if (Static365.aClass195_2.anInt5403 <= 0) {
					this.method1229("js5io");
				} else {
					this.method1229("js5connect");
				}
				Static342.anInt5771 = 13;
				return;
			}
		}
		Static160.anInt3006 = Static365.aClass195_2.anInt5404;
		if (Static44.anInt898 > 0) {
			Static44.anInt898--;
			return;
		}
		try {
			if (Static375.anInt6122 == 0) {
				Static40.aClass9_2 = Static77.aClass180_1.method4086(Static451.aClass209_5.method4847(), Static451.aClass209_5.aString60);
				Static375.anInt6122++;
			}
			if (Static375.anInt6122 == 1) {
				if (Static40.aClass9_2.anInt368 == 2) {
					this.method1249(1000);
					return;
				}
				if (Static40.aClass9_2.anInt368 == 1) {
					Static375.anInt6122++;
				}
			}
			if (Static375.anInt6122 == 2) {
				Static345.aClass229_4 = new Class229((Socket) Static40.aClass9_2.anObject2, Static77.aClass180_1);
				@Pc(174) Class1_Sub5 local174 = new Class1_Sub5(5);
				local174.method5396(Static114.aClass208_2.anInt5814);
				local174.method5417(594);
				Static345.aClass229_4.method5207(local174.aByteArray89, 5);
				Static375.anInt6122++;
				Static179.aLong109 = Static279.method4058();
			}
			if (Static375.anInt6122 == 3) {
				if (Static158.method2572(Static342.anInt5771) || Static345.aClass229_4.method5208() > 0) {
					@Pc(221) int local221 = Static345.aClass229_4.method5206();
					if (local221 != 0) {
						this.method1249(local221);
						return;
					}
					Static375.anInt6122++;
				} else if (Static279.method4058() - Static179.aLong109 > 30000L) {
					this.method1249(1001);
					return;
				}
			}
			if (Static375.anInt6122 == 4) {
				@Pc(267) boolean local267 = Static342.anInt5771 == 1 || Static323.method4607(Static342.anInt5771) || Static85.method1601(Static342.anInt5771);
				Static365.aClass195_2.method4448(!local267, Static345.aClass229_4);
				Static375.anInt6122 = 0;
				Static345.aClass229_4 = null;
				Static40.aClass9_2 = null;
			}
		} catch (@Pc(284) IOException local284) {
			this.method1249(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1226() {
		try {
			this.method1239();
		} catch (@Pc(14) OutOfMemoryError local14) {
			if (local14.getMessage() == null || !local14.getMessage().startsWith("native")) {
				throw local14;
			}
			Static178.method2844(0);
			Static158.method2570(local14, local14.getMessage() + " (Recovered) " + this.method1232());
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1227() {
		if (Static359.aBoolean414) {
			Static89.method1640();
		}
		if (Static415.aClass39_11 != null) {
			Static415.aClass39_11.method4523();
		}
		if (Static373.aFrame5 != null) {
			Static410.method5508(Static77.aClass180_1, Static373.aFrame5);
			Static373.aFrame5 = null;
		}
		if (Static82.aClass229_1 != null) {
			Static82.aClass229_1.method5204();
			Static82.aClass229_1 = null;
		}
		if (Static135.aClass25_1 != null) {
			Static135.aClass25_1.method5800(Static155.aCanvas4);
		}
		Static135.aClass25_1 = null;
		Static92.method1683();
		Static365.aClass195_2.method4455();
		Static60.aClass230_1.method5211();
		if (Static9.aClass69_3 != null) {
			Static9.aClass69_3.method1880();
			Static9.aClass69_3 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1253() {
		if (Static342.anInt5771 == 13) {
			return;
		}
		@Pc(16) long local16 = Static222.method3400() / 1000000L - Static448.aLong216;
		Static448.aLong216 = Static222.method3400() / 1000000L;
		@Pc(24) boolean local24 = Static225.method3457();
		if (local24 && Static176.aBoolean196 && Static229.aClass66_1 != null) {
			Static229.aClass66_1.method5624();
		}
		if (Static409.method5485(Static342.anInt5771)) {
			if (Static4.aLong11 != 0L && Static279.method4058() > Static4.aLong11) {
				Static448.method5876(Static432.method5740(), Static38.aClass135_Sub1_1.anInt5099, Static38.aClass135_Sub1_1.anInt5095, false);
			} else if (!Static415.aClass39_11.method4550() && Static278.aBoolean322) {
				Static214.method4407();
			}
		}
		@Pc(85) int local85;
		@Pc(89) int local89;
		if (Static373.aFrame5 == null) {
			@Pc(77) Container local77;
			if (Static285.aFrame4 == null) {
				local77 = Static77.aClass180_1.anApplet1;
			} else {
				local77 = Static285.aFrame4;
			}
			local85 = local77.getSize().width;
			local89 = local77.getSize().height;
			if (Static285.aFrame4 == local77) {
				@Pc(95) Insets local95 = Static285.aFrame4.getInsets();
				local89 -= local95.bottom + local95.top;
				local85 -= local95.right + local95.left;
			}
			if (local85 != Static299.anInt700 || local89 != Static107.anInt2270) {
				if (Static415.aClass39_11 == null || Static415.aClass39_11.method4505()) {
					Static438.method5774();
				} else {
					Static107.anInt2270 = local89;
					Static299.anInt700 = local85;
				}
				Static4.aLong11 = Static279.method4058() + 500L;
			}
		}
		if (Static373.aFrame5 != null && !Static289.aBoolean418 && Static409.method5485(Static342.anInt5771)) {
			Static448.method5876(Static38.aClass135_Sub1_1.anInt5090, -1, -1, false);
		}
		@Pc(156) boolean local156 = false;
		if (Static90.aBoolean117) {
			local156 = true;
			Static90.aBoolean117 = false;
		}
		if (local156) {
			Static55.method5709();
		}
		if (Static415.aClass39_11 != null && Static415.aClass39_11.method4550() || Static432.method5740() != 1) {
			Static319.method3515();
		}
		if (Static342.anInt5771 == 0) {
			Static295.method4255(Static30.aColorArray1[Static373.anInt6190], Static148.anInt2855, Static250.aString39, Static332.aColorArray2[Static373.anInt6190], Static377.aColorArray3[Static373.anInt6190], local156);
		} else if (Static342.anInt5771 == 1) {
			Static287.method4166(Static377.aColorArray3[Static373.anInt6190].getRGB(), Static415.aClass39_11, Static415.aClass39_11.method4550() | local156, Static332.aColorArray2[Static373.anInt6190].getRGB(), Static178.aClass71_5, Static30.aColorArray1[Static373.anInt6190].getRGB());
		} else if (Static342.anInt5771 == 2) {
			Static216.method5458();
		} else if (Static342.anInt5771 == 6) {
			Static216.method5458();
		} else if (Static139.method2336(Static342.anInt5771)) {
			if (Static407.anInt6565 == 1) {
				if (Static361.anInt5958 > Static69.anInt1587) {
					Static69.anInt1587 = Static361.anInt5958;
				}
				local85 = (Static69.anInt1587 - Static361.anInt5958) * 50 / Static69.anInt1587;
				Static18.method3000(true, Static343.aClass7_150.method331(Static341.anInt5770) + "<br>(" + local85 + "%)", Static312.aClass71_7);
			} else if (Static407.anInt6565 == 2) {
				if (Static378.anInt4252 > Static163.anInt3039) {
					Static163.anInt3039 = Static378.anInt4252;
				}
				local85 = (Static163.anInt3039 - Static378.anInt4252) * 50 / Static163.anInt3039 + 50;
				Static18.method3000(true, Static343.aClass7_150.method331(Static341.anInt5770) + "<br>(" + local85 + "%)", Static312.aClass71_7);
			} else {
				Static18.method3000(true, Static343.aClass7_150.method331(Static341.anInt5770), Static312.aClass71_7);
			}
		} else if (Static342.anInt5771 == 9) {
			Static22.method526(local16);
		} else if (Static342.anInt5771 == 12) {
			Static18.method3000(true, Static174.aClass7_79.method331(Static341.anInt5770) + "<br>" + Static227.aClass7_99.method331(Static341.anInt5770), Static312.aClass71_7);
		}
		if (Static289.anInt6024 == 3) {
			for (local85 = 0; local85 < Static121.anInt2467; local85++) {
				@Pc(398) Rectangle local398 = Class102.aRectangleArray1[local85];
				if (Static193.aBooleanArray27[local85]) {
					Static415.aClass39_11.method4563(local398.y, -1996553985, local398.width, local398.x, local398.height);
				} else if (Static391.aBooleanArray46[local85]) {
					Static415.aClass39_11.method4563(local398.y, -1996554240, local398.width, local398.x, local398.height);
				}
			}
		}
		if (Static160.method2594()) {
			Static156.method2556(Static415.aClass39_11);
		}
		if (Static409.method5485(Static342.anInt5771) && Static289.anInt6024 == 0 && Static432.method5740() == 1 && !local156 && Static282.aString44.equals("1.1")) {
			local85 = 0;
			for (local89 = 0; local89 < Static121.anInt2467; local89++) {
				if (Static391.aBooleanArray46[local89]) {
					Static391.aBooleanArray46[local89] = false;
					Static274.aRectangleArray2[local85++] = Class102.aRectangleArray1[local89];
				}
			}
			Static415.aClass39_11.method4492(Static274.aRectangleArray2, local85);
		} else if (Static342.anInt5771 != 0) {
			Static415.aClass39_11.method4558();
			for (local85 = 0; local85 < Static121.anInt2467; local85++) {
				Static391.aBooleanArray46[local85] = false;
			}
		}
		if (Static38.aClass135_Sub1_1.anInt5105 == 0) {
			Static224.method3441(15L);
		} else if (Static38.aClass135_Sub1_1.anInt5105 == 1) {
			Static224.method3441(10L);
		} else if (Static38.aClass135_Sub1_1.anInt5105 == 2) {
			Static224.method3441(5L);
		} else if (Static38.aClass135_Sub1_1.anInt5105 == 3) {
			Static224.method3441(2L);
		}
		if (Static225.aBoolean292) {
			Static96.method1721();
		}
		if (Static38.aClass135_Sub1_1.aBoolean369 && Static342.anInt5771 == 2 && Static407.anInt6564 != -1) {
			Static38.aClass135_Sub1_1.aBoolean369 = false;
			Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1255() {
		@Pc(16) int local16;
		if (!Static38.aClass135_Sub1_1.aBoolean369) {
			for (local16 = 0; local16 < Static150.anInt2864; local16++) {
				if (Static344.aClass250Array1[local16].method5645() == 's' || Static344.aClass250Array1[local16].method5645() == 'S') {
					Static38.aClass135_Sub1_1.aBoolean369 = true;
					break;
				}
			}
		}
		@Pc(61) int local61;
		if (Static258.anInt3112 == 0) {
			@Pc(51) Runtime local51 = Runtime.getRuntime();
			local61 = (int) ((local51.totalMemory() - local51.freeMemory()) / 1024L);
			@Pc(64) long local64 = Static279.method4058();
			if (Static362.aLong185 == 0L) {
				Static362.aLong185 = local64;
			}
			if (local61 > 16384 && local64 - Static362.aLong185 < 5000L) {
				if (local64 - Static410.aLong201 > 1000L) {
					System.gc();
					Static410.aLong201 = local64;
				}
				Static250.aString39 = Static458.aClass7_164.method331(Static341.anInt5770);
				Static148.anInt2855 = 5;
			} else {
				Static250.aString39 = Static331.aClass7_161.method331(Static341.anInt5770);
				Static148.anInt2855 = 5;
				Static258.anInt3112 = 10;
			}
		} else if (Static258.anInt3112 == 10) {
			for (local16 = 0; local16 < 4; local16++) {
				Static125.aClass188Array1[local16] = Static348.method4851(Static118.anInt2419, Static195.anInt3537);
			}
			Static250.aString39 = Static251.aClass7_104.method331(Static341.anInt5770);
			Static258.anInt3112 = 20;
			Static148.anInt2855 = 10;
		} else if (Static258.anInt3112 == 20) {
			if (Static340.aClass254_1 == null) {
				Static340.aClass254_1 = new Class254(Static365.aClass195_2, Static60.aClass230_1);
			}
			if (Static340.aClass254_1.method5563()) {
				Static219.aClass246_121 = Static429.method5688(true, false, 0);
				Static171.aClass246_99 = Static429.method5688(true, false, 1);
				Static94.aClass246_56 = Static429.method5688(true, false, 2);
				Static320.aClass246_197 = Static429.method5688(true, false, 3);
				Static30.aClass246_24 = Static429.method5688(true, false, 4);
				Static334.aClass246_179 = Static429.method5688(true, true, 5);
				Static312.aClass246_168 = Static429.method5688(false, true, 6);
				Static144.aClass246_86 = Static429.method5688(true, false, 7);
				Static345.aClass246_187 = Static429.method5688(true, false, 8);
				Static51.aClass246_225 = Static429.method5688(true, false, 9);
				Static69.aClass246_43 = Static429.method5688(true, false, 10);
				Static243.aClass246_136 = Static429.method5688(true, false, 11);
				Static105.aClass246_64 = Static429.method5688(true, false, 12);
				Static319.aClass246_127 = Static429.method5688(true, false, 13);
				Static261.aClass246_145 = Static429.method5688(false, false, 14);
				Static209.aClass246_117 = Static429.method5688(true, false, 15);
				Static95.aClass246_59 = Static429.method5688(true, false, 16);
				Static444.aClass246_219 = Static429.method5688(true, false, 17);
				Static154.aClass246_206 = Static429.method5688(true, false, 18);
				Static113.aClass246_73 = Static429.method5688(true, false, 19);
				Static166.aClass246_94 = Static429.method5688(true, false, 20);
				Static408.aClass246_209 = Static429.method5688(true, false, 21);
				Static187.aClass246_111 = Static429.method5688(true, false, 22);
				Static86.aClass246_54 = Static429.method5688(true, true, 23);
				Static74.aClass246_48 = Static429.method5688(true, false, 24);
				Static351.aClass246_188 = Static429.method5688(true, false, 25);
				Static304.aClass246_164 = Static429.method5688(true, true, 26);
				Static276.aClass246_155 = Static429.method5688(true, false, 27);
				Static135.aClass246_85 = Static429.method5688(true, true, 28);
				Static213.aClass246_120 = Static429.method5688(true, false, 29);
				Static250.aString39 = Static19.aClass7_8.method331(Static341.anInt5770);
				Static258.anInt3112 = 30;
				Static148.anInt2855 = 15;
			} else {
				Static250.aString39 = Static145.aClass7_64.method331(Static341.anInt5770);
				Static148.anInt2855 = 12;
			}
		} else if (Static258.anInt3112 == 30) {
			local16 = 0;
			for (local61 = 0; local61 < 30; local61++) {
				local16 += Static299.aClass90_Sub1Array2[local61].method3348() * Static38.anIntArray60[local61] / 100;
			}
			if (local16 == 100) {
				Static250.aString39 = Static379.aClass7_102.method331(Static341.anInt5770);
				Static148.anInt2855 = 20;
				Static72.method1433(Static345.aClass246_187);
				Static181.method2870(Static345.aClass246_187);
				Static258.anInt3112 = 40;
			} else {
				if (local16 != 0) {
					Static250.aString39 = Static320.aClass7_138.method331(Static341.anInt5770) + local16 + "%";
				}
				Static148.anInt2855 = 20;
			}
		} else if (Static258.anInt3112 == 40) {
			if (Static135.aClass246_85.method5504()) {
				this.method1241(Static135.aClass246_85.method5499(1));
				Static250.aString39 = Static377.aClass7_140.method331(Static341.anInt5770);
				Static258.anInt3112 = 50;
				Static148.anInt2855 = 25;
			} else {
				Static250.aString39 = Static369.aClass7_136.method331(Static341.anInt5770) + Static135.aClass246_85.method5480() + "%";
				Static148.anInt2855 = 25;
			}
		} else if (Static258.anInt3112 == 50) {
			Static184.method2898();
			Static250.aString39 = Static52.aClass7_118.method331(Static341.anInt5770);
			Static148.anInt2855 = 30;
			Static258.anInt3112 = 60;
		} else if (Static258.anInt3112 == 60) {
			local16 = Static83.method1588(Static319.aClass246_127, Static345.aClass246_187);
			local61 = Static251.method3762();
			if (local16 < local61) {
				Static250.aString39 = Static285.aClass7_115.method331(Static341.anInt5770) + local16 * 100 / local61 + "%";
				Static148.anInt2855 = 35;
			} else {
				Static250.aString39 = Static143.aClass7_60.method331(Static341.anInt5770);
				Static148.anInt2855 = 35;
				Static258.anInt3112 = 70;
			}
		} else if (Static258.anInt3112 == 70) {
			local16 = Static113.method2105(Static345.aClass246_187);
			local61 = Static198.method3230();
			if (local16 < local61) {
				Static250.aString39 = Static344.aClass7_132.method331(Static341.anInt5770) + local16 * 100 / local61 + "%";
				Static148.anInt2855 = 40;
			} else {
				Static250.aString39 = Static390.aClass7_142.method331(Static341.anInt5770);
				Static148.anInt2855 = 40;
				Static258.anInt3112 = 80;
			}
		} else if (Static258.anInt3112 == 80) {
			if (Static304.aClass246_164.method5504()) {
				Static378.anInterface4_9 = new Class104(Static304.aClass246_164, Static51.aClass246_225, Static345.aClass246_187);
				Static250.aString39 = Static300.aClass7_153.method331(Static341.anInt5770);
				Static148.anInt2855 = 45;
				Static258.anInt3112 = 90;
			} else {
				Static250.aString39 = Static47.aClass7_24.method331(Static341.anInt5770) + Static304.aClass246_164.method5480() + "%";
				Static148.anInt2855 = 45;
			}
		} else if (Static258.anInt3112 == 90) {
			Static250.aString39 = Static327.aClass7_126.method331(Static341.anInt5770);
			Static148.anInt2855 = 50;
			Static258.anInt3112 = 95;
		} else if (Static258.anInt3112 == 95) {
			if (Static38.aClass135_Sub1_1.aBoolean369) {
				Static38.aClass135_Sub1_1.anInt5108 = 0;
				Static38.aClass135_Sub1_1.anInt5103 = 0;
				Static38.aClass135_Sub1_1.anInt5091 = 0;
				Static38.aClass135_Sub1_1.anInt5098 = 0;
				Static38.aClass135_Sub1_1.anInt5090 = 1;
			}
			Static38.aClass135_Sub1_1.aBoolean369 = true;
			Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
			Static314.method4466(false, Static38.aClass135_Sub1_1.anInt5098);
			Static250.aString39 = Static361.aClass7_135.method331(Static341.anInt5770);
			Static258.anInt3112 = 100;
			Static148.anInt2855 = 55;
		} else if (Static258.anInt3112 == 100) {
			Static246.method4278(Static415.aClass39_11, Static319.aClass246_127, Static345.aClass246_187);
			Static250.aString39 = Static210.aClass7_97.method331(Static341.anInt5770);
			Static148.anInt2855 = 60;
			Static193.method2987(1);
			Static258.anInt3112 = 110;
		} else if (Static258.anInt3112 == 110) {
			Static94.aClass246_56.method5504();
			local16 = Static94.aClass246_56.method5480();
			Static95.aClass246_59.method5504();
			local16 += Static95.aClass246_59.method5480();
			Static444.aClass246_219.method5504();
			local16 += Static444.aClass246_219.method5480();
			Static154.aClass246_206.method5504();
			local16 += Static154.aClass246_206.method5480();
			Static113.aClass246_73.method5504();
			local16 += Static113.aClass246_73.method5480();
			Static166.aClass246_94.method5504();
			local16 += Static166.aClass246_94.method5480();
			Static408.aClass246_209.method5504();
			local16 += Static408.aClass246_209.method5480();
			Static187.aClass246_111.method5504();
			local16 += Static187.aClass246_111.method5480();
			Static74.aClass246_48.method5504();
			local16 += Static74.aClass246_48.method5480();
			Static351.aClass246_188.method5504();
			local16 += Static351.aClass246_188.method5480();
			Static276.aClass246_155.method5504();
			local16 += Static276.aClass246_155.method5480();
			Static213.aClass246_120.method5504();
			local16 += Static213.aClass246_120.method5480();
			if (local16 < 1200) {
				Static250.aString39 = Static70.aClass7_37.method331(Static341.anInt5770) + local16 / 12 + "%";
				Static148.anInt2855 = 65;
			} else {
				Static400.aClass35_2 = new Class35(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static117.aClass75_1 = new Class75(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static305.aClass84_2 = new Class84(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56, Static345.aClass246_187);
				Static389.aClass242_1 = new Class242(Static337.aClass61_5, Static341.anInt5770, Static444.aClass246_219);
				Static344.aClass42_5 = new Class42(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static396.aClass205_5 = new Class205(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static184.aClass158_1 = new Class158(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56, Static144.aClass246_86);
				Static386.aClass64_1 = new Class64(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static316.aClass167_1 = new Class167(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static349.aClass115_4 = new Class115(Static337.aClass61_5, Static341.anInt5770, true, Static95.aClass246_59, Static144.aClass246_86);
				Static17.aClass78_3 = new Class78(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56, Static345.aClass246_187);
				Static343.aClass217_15 = new Class217(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56, Static345.aClass246_187);
				Static238.aClass116_2 = new Class116(Static337.aClass61_5, Static341.anInt5770, true, Static154.aClass246_206, Static144.aClass246_86);
				Static165.aClass19_1 = new Class19(Static337.aClass61_5, Static341.anInt5770, true, Static400.aClass35_2, Static113.aClass246_73, Static144.aClass246_86);
				Static28.aClass239_1 = new Class239(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static293.aClass127_1 = new Class127(Static337.aClass61_5, Static341.anInt5770, Static166.aClass246_94, Static219.aClass246_121, Static171.aClass246_99);
				Static303.aClass161_1 = new Class161(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static117.aClass142_1 = new Class142(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static67.aClass263_2 = new Class263(Static337.aClass61_5, Static341.anInt5770, Static408.aClass246_209, Static144.aClass246_86);
				Static274.aClass124_1 = new Class124(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static92.aClass191_1 = new Class191(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static139.aClass119_1 = new Class119(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static45.aClass36_4 = new Class36(Static337.aClass61_5, Static341.anInt5770, Static187.aClass246_111);
				Static405.aClass252_1 = new Class252(Static337.aClass61_5, Static341.anInt5770, Static94.aClass246_56);
				Static88.method1628(Static320.aClass246_197, Static144.aClass246_86, Static345.aClass246_187, Static319.aClass246_127);
				Static132.method2289(Static213.aClass246_120);
				Static48.aClass197_1 = new Class197(Static341.anInt5770, Static74.aClass246_48, Static351.aClass246_188);
				Static189.aClass156_1 = new Class156(Static341.anInt5770, Static74.aClass246_48, Static351.aClass246_188, new Class108());
				Static250.aString39 = Static28.aClass7_12.method331(Static341.anInt5770);
				Static148.anInt2855 = 65;
				Static127.method2244();
				Static349.aClass115_4.method2773(!Static38.aClass135_Sub1_1.method4244(Static143.anInt2766));
				Static394.aClass23_1 = new Class23();
				Static418.method5569();
				Static155.method2551(Static276.aClass246_155);
				Static290.method4210(Static378.anInterface4_9, Static144.aClass246_86);
				Static258.anInt3112 = 120;
			}
		} else if (Static258.anInt3112 == 120) {
			local16 = Static39.method720(Static345.aClass246_187);
			local61 = Static330.method4696();
			if (local61 > local16) {
				Static250.aString39 = Static214.aClass7_119.method331(Static341.anInt5770) + local16 * 100 / local61 + "%";
				Static148.anInt2855 = 70;
			} else {
				Static121.method2193(Static415.aClass39_11, Static345.aClass246_187);
				Static432.method5741(Static148.aClass143Array4);
				Static250.aString39 = Static15.aClass7_6.method331(Static341.anInt5770);
				Static148.anInt2855 = 70;
				Static258.anInt3112 = 130;
			}
		} else if (Static258.anInt3112 == 130) {
			if (Static69.aClass246_43.method5506("huffman", "")) {
				@Pc(1214) Class215 local1214 = new Class215(Static69.aClass246_43.method5491("", "huffman"));
				Static134.method2317(local1214);
				Static250.aString39 = Static174.aClass7_78.method331(Static341.anInt5770);
				Static148.anInt2855 = 75;
				Static258.anInt3112 = 140;
			} else {
				Static250.aString39 = Static405.aClass7_145.method331(Static341.anInt5770) + "0%";
				Static148.anInt2855 = 75;
			}
		} else if (Static258.anInt3112 == 140) {
			if (Static320.aClass246_197.method5504()) {
				Static250.aString39 = Static438.aClass7_156.method331(Static341.anInt5770);
				Static258.anInt3112 = 150;
				Static148.anInt2855 = 80;
			} else {
				Static250.aString39 = Static18.aClass7_89.method331(Static341.anInt5770) + Static320.aClass246_197.method5480() + "%";
				Static148.anInt2855 = 80;
			}
		} else if (Static258.anInt3112 == 150) {
			if (Static105.aClass246_64.method5504()) {
				Static250.aString39 = Static85.aClass7_44.method331(Static341.anInt5770);
				Static258.anInt3112 = 160;
				Static148.anInt2855 = 82;
			} else {
				Static250.aString39 = Static267.aClass7_111.method331(Static341.anInt5770) + Static105.aClass246_64.method5480() + "%";
				Static148.anInt2855 = 82;
			}
		} else if (Static258.anInt3112 == 160) {
			if (Static319.aClass246_127.method5504()) {
				Static250.aString39 = Static436.aClass7_155.method331(Static341.anInt5770);
				Static148.anInt2855 = 85;
				Static258.anInt3112 = 170;
			} else {
				Static250.aString39 = Static436.aClass7_155.method331(Static341.anInt5770) + Static319.aClass246_127.method5480() + "%";
				Static148.anInt2855 = 85;
			}
		} else if (Static258.anInt3112 == 170) {
			if (Static86.aClass246_54.method5500("details")) {
				Static168.method416(Static86.aClass246_54, Static344.aClass42_5, Static396.aClass205_5, Static349.aClass115_4, Static17.aClass78_3, Static343.aClass217_15, Static394.aClass23_1);
				Static250.aString39 = Static64.aClass7_34.method331(Static341.anInt5770);
				Static258.anInt3112 = 190;
				Static148.anInt2855 = 89;
			} else {
				Static250.aString39 = Static174.aClass7_76.method331(Static341.anInt5770) + Static86.aClass246_54.method5484("details") + "%";
				Static148.anInt2855 = 87;
			}
		} else if (Static258.anInt3112 == 190) {
			Static266.anIntArray630 = new int[Static139.aClass119_1.anInt3273];
			Static32.aBooleanArray1 = new boolean[Static139.aClass119_1.anInt3273];
			Static280.aStringArray31 = new String[Static92.aClass191_1.anInt5264];
			for (local16 = 0; local16 < Static139.aClass119_1.anInt3273; local16++) {
				if (Static139.aClass119_1.method2843(local16).anInt5127 == 0) {
					Static32.aBooleanArray1[local16] = true;
					Static69.anInt1592++;
				}
				Static266.anIntArray630[local16] = -1;
			}
			Static287.method4172();
			Static247.anInt7107 = Static320.aClass246_197.method5478("loginscreen");
			Static291.anInt5089 = Static320.aClass246_197.method5478("lobbyscreen");
			Static334.aClass246_179.method5501(false);
			Static312.aClass246_168.method5501(true);
			Static345.aClass246_187.method5501(true);
			Static319.aClass246_127.method5501(true);
			Static69.aClass246_43.method5501(true);
			Static320.aClass246_197.method5501(true);
			Static225.aBoolean292 = true;
			Static94.aClass246_56.anInt6592 = 2;
			Static444.aClass246_219.anInt6592 = 2;
			Static95.aClass246_59.anInt6592 = 2;
			Static154.aClass246_206.anInt6592 = 2;
			Static113.aClass246_73.anInt6592 = 2;
			Static166.aClass246_94.anInt6592 = 2;
			Static408.aClass246_209.anInt6592 = 2;
			Static448.method5876(Static38.aClass135_Sub1_1.anInt5090, -1, -1, false);
			Static250.aString39 = Static202.aClass7_95.method331(Static341.anInt5770);
			Static258.anInt3112 = 200;
			Static148.anInt2855 = 95;
		} else if (Static258.anInt3112 == 200) {
			Static193.method2987(2);
		}
	}
}
