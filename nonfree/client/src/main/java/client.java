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

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static398.method2752("Argument count");
			}
			Static437.aClass156_5 = new Class156();
			Static437.aClass156_5.anInt4501 = Integer.parseInt(arg0[0]);
			Static95.aClass156_2 = new Class156();
			Static95.aClass156_2.anInt4501 = Integer.parseInt(arg0[1]);
			Static217.aClass156_3 = new Class156();
			Static217.aClass156_3.anInt4501 = Integer.parseInt(arg0[2]);
			Static328.aClass30_10 = Static38.aClass30_1;
			if (arg0[3].equals("live")) {
				Static57.aClass233_2 = Static430.aClass233_4;
			} else if (arg0[3].equals("rc")) {
				Static57.aClass233_2 = Static125.aClass233_3;
			} else if (arg0[3].equals("wip")) {
				Static57.aClass233_2 = Static52.aClass233_1;
			} else {
				Static398.method2752("modewhat");
			}
			Static394.anInt6582 = Static342.method4596(arg0[4]);
			if (Static394.anInt6582 == -1) {
				if (arg0[4].equals("english")) {
					Static394.anInt6582 = 0;
				} else if (arg0[4].equals("german")) {
					Static394.anInt6582 = 1;
				} else {
					Static398.method2752("language");
				}
			}
			Static330.aBoolean639 = false;
			Static122.aBoolean254 = false;
			if (arg0[5].equals("game0")) {
				Static183.aClass48_3 = Static191.aClass48_4;
			} else if (arg0[5].equals("game1")) {
				Static183.aClass48_3 = Static82.aClass48_7;
			} else {
				Static398.method2752("game");
			}
			Static414.anInt6794 = 0;
			Static83.anInt1575 = 0;
			Static324.aBoolean629 = true;
			Static334.aBoolean649 = true;
			Static241.aBoolean492 = false;
			Static297.anInt5867 = Static183.aClass48_3.anInt1229;
			Static87.aString74 = "";
			@Pc(156) client local156 = new client();
			Static159.aClient1 = local156;
			local156.method954(Static57.aClass233_2.method5030() + 32, Static183.aClass48_3.aString9);
			Static411.aFrame2.setLocation(40, 40);
		} catch (@Pc(179) Exception local179) {
			Static55.method972(local179, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method952() {
		try {
			this.method964();
		} catch (@Pc(14) OutOfMemoryError local14) {
			if (local14.getMessage() == null || !local14.getMessage().startsWith("native")) {
				throw local14;
			}
			Static379.method4990(0);
			Static55.method972(local14, local14.getMessage() + " (Recovered) " + this.method953());
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method959(@OriginalArg(0) int arg0) {
		Static337.aClass232_6 = null;
		Static32.aClass224_1.anInt6269 = arg0;
		Static32.aClass224_1.anInt6268++;
		Static372.anInt6266 = 0;
		Static425.aClass131_4 = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method960() {
		if (Static32.aClass224_1.anInt6268 > Static414.anInt6795) {
			Static389.anInt6506 = (Static32.aClass224_1.anInt6268 - 1) * 5 * 50;
			Static259.aClass156_4.aBoolean517 = !Static259.aClass156_4.aBoolean517;
			if (Static389.anInt6506 > 3000) {
				Static389.anInt6506 = 3000;
			}
			if (Static32.aClass224_1.anInt6268 >= 2 && Static32.aClass224_1.anInt6269 == 6) {
				this.method945("js5connect_outofdate");
				Static312.anInt5414 = 13;
				return;
			}
			if (Static32.aClass224_1.anInt6268 >= 4 && Static32.aClass224_1.anInt6269 == -1) {
				this.method945("js5crc");
				Static312.anInt5414 = 13;
				return;
			}
			if (Static32.aClass224_1.anInt6268 >= 4 && Static398.method2753(Static312.anInt5414)) {
				if (Static32.aClass224_1.anInt6269 == 7 || Static32.aClass224_1.anInt6269 == 9) {
					this.method945("js5connect_full");
				} else if (Static32.aClass224_1.anInt6269 <= 0) {
					this.method945("js5io");
				} else {
					this.method945("js5connect");
				}
				Static312.anInt5414 = 13;
				return;
			}
		}
		Static414.anInt6795 = Static32.aClass224_1.anInt6268;
		if (Static389.anInt6506 > 0) {
			Static389.anInt6506--;
			return;
		}
		try {
			if (Static372.anInt6266 == 0) {
				Static337.aClass232_6 = Static183.aClass83_2.method1856(Static259.aClass156_4.method3552(), Static259.aClass156_4.aString53);
				Static372.anInt6266++;
			}
			if (Static372.anInt6266 == 1) {
				if (Static337.aClass232_6.anInt6402 == 2) {
					this.method959(1000);
					return;
				}
				if (Static337.aClass232_6.anInt6402 == 1) {
					Static372.anInt6266++;
				}
			}
			if (Static372.anInt6266 == 2) {
				Static425.aClass131_4 = new Class131((Socket) Static337.aClass232_6.anObject8, Static183.aClass83_2);
				@Pc(186) Class1_Sub28 local186 = new Class1_Sub28(5);
				local186.method5398(Static180.aClass99_2.anInt2588);
				local186.method5347(596);
				Static425.aClass131_4.method2928(local186.aByteArray86, 5);
				Static372.anInt6266++;
				Static232.aLong133 = Static27.method359();
			}
			if (Static372.anInt6266 == 3) {
				if (Static398.method2753(Static312.anInt5414) || Static425.aClass131_4.method2932() > 0) {
					@Pc(229) int local229 = Static425.aClass131_4.method2934();
					if (local229 != 0) {
						this.method959(local229);
						return;
					}
					Static372.anInt6266++;
				} else if (Static27.method359() - Static232.aLong133 > 30000L) {
					this.method959(1001);
					return;
				}
			}
			if (Static372.anInt6266 == 4) {
				@Pc(284) boolean local284 = Static312.anInt5414 == 1 || Static306.method4183(Static312.anInt5414) || Static40.method585(Static312.anInt5414);
				Static32.aClass224_1.method4922(!local284, Static425.aClass131_4);
				Static425.aClass131_4 = null;
				Static372.anInt6266 = 0;
				Static337.aClass232_6 = null;
			}
		} catch (@Pc(301) IOException local301) {
			this.method959(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method943() {
		try {
			this.method961();
		} catch (@Pc(8) OutOfMemoryError local8) {
			if (local8.getMessage() == null || !local8.getMessage().startsWith("native")) {
				throw local8;
			}
			Static379.method4990(0);
			Static55.method972(local8, local8.getMessage() + " (Recovered) " + this.method953());
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method961() {
		if (Static312.anInt5414 == 13) {
			return;
		}
		@Pc(17) long local17 = Static278.method3868() / 1000000L - Static205.aLong118;
		Static205.aLong118 = Static278.method3868() / 1000000L;
		@Pc(25) boolean local25 = Static91.method1450();
		if (local25 && Static328.aBoolean637 && Static353.aClass125_1 != null) {
			Static353.aClass125_1.method5866();
		}
		if (Static445.method5848(Static312.anInt5414)) {
			if (Static432.aLong224 != 0L && Static27.method359() > Static432.aLong224) {
				Static169.method2392(Static453.aClass136_Sub1_1.anInt4445, Static101.method1560(), Static453.aClass136_Sub1_1.anInt4440, false);
			} else if (!Static185.aClass34_7.method5728() && Static325.aBoolean631) {
				Static433.method5712();
			}
		}
		@Pc(95) int local95;
		@Pc(99) int local99;
		if (Static90.aFrame1 == null) {
			@Pc(86) Container local86;
			if (Static411.aFrame2 == null) {
				local86 = Static183.aClass83_2.anApplet1;
			} else {
				local86 = Static411.aFrame2;
			}
			local95 = local86.getSize().width;
			local99 = local86.getSize().height;
			if (local86 == Static411.aFrame2) {
				@Pc(105) Insets local105 = Static411.aFrame2.getInsets();
				local95 -= local105.right + local105.left;
				local99 -= local105.bottom + local105.top;
			}
			if (local95 != Static187.anInt3236 || Static285.anInt5014 != local99) {
				if (Static185.aClass34_7 == null || Static185.aClass34_7.method5760()) {
					Static182.method2648();
				} else {
					Static285.anInt5014 = local99;
					Static187.anInt3236 = local95;
				}
				Static432.aLong224 = Static27.method359() + 500L;
			}
		}
		if (Static90.aFrame1 != null && !Static138.aBoolean285 && Static445.method5848(Static312.anInt5414)) {
			Static169.method2392(-1, Static453.aClass136_Sub1_1.anInt4455, -1, false);
		}
		@Pc(166) boolean local166 = false;
		if (Static388.aBoolean709) {
			local166 = true;
			Static388.aBoolean709 = false;
		}
		if (local166) {
			Static263.method3723();
		}
		if (Static185.aClass34_7 != null && Static185.aClass34_7.method5728() || Static101.method1560() != 1) {
			Static65.method1072();
		}
		if (Static312.anInt5414 == 0) {
			Static263.method3720(Static339.aColorArray104[Static297.anInt5867], Static303.aColorArray130[Static297.anInt5867], local166, Static250.aString54, Static319.anInt5465, Static257.aColorArray84[Static297.anInt5867]);
		} else if (Static312.anInt5414 == 1) {
			Static367.method4882(Static185.aClass34_7, Static185.aClass34_7.method5728() | local166, Static339.aColorArray104[Static297.anInt5867].getRGB(), Static121.aClass76_2, Static257.aColorArray84[Static297.anInt5867].getRGB(), Static303.aColorArray130[Static297.anInt5867].getRGB());
		} else if (Static242.method3485(Static312.anInt5414)) {
			Static65.method1073();
		} else if (Static20.method3816(Static312.anInt5414)) {
			Static65.method1073();
		} else if (Static91.method1452(Static312.anInt5414)) {
			if (Static42.anInt717 == 1) {
				if (Static391.anInt6531 > Static34.anInt594) {
					Static34.anInt594 = Static391.anInt6531;
				}
				local95 = (Static34.anInt594 - Static391.anInt6531) * 50 / Static34.anInt594;
				Static163.method4683(true, Static437.aClass76_4, Static277.aClass119_130.method2673(Static394.anInt6582) + "<br>(" + local95 + "%)");
			} else if (Static42.anInt717 == 2) {
				if (Static368.anInt6205 > Static234.anInt4178) {
					Static234.anInt4178 = Static368.anInt6205;
				}
				local95 = (Static234.anInt4178 - Static368.anInt6205) * 50 / Static234.anInt4178 + 50;
				Static163.method4683(true, Static437.aClass76_4, Static277.aClass119_130.method2673(Static394.anInt6582) + "<br>(" + local95 + "%)");
			} else {
				Static163.method4683(true, Static437.aClass76_4, Static277.aClass119_130.method2673(Static394.anInt6582));
			}
		} else if (Static312.anInt5414 == 9) {
			Static281.method2017(local17);
		} else if (Static312.anInt5414 == 12) {
			Static163.method4683(true, Static437.aClass76_4, Static308.aClass119_127.method2673(Static394.anInt6582) + "<br>" + Static98.aClass119_49.method2673(Static394.anInt6582));
		}
		if (Static231.anInt4065 == 3) {
			for (local95 = 0; local95 < Static250.anInt4507; local95++) {
				@Pc(403) Rectangle local403 = Class129.aRectangleArray2[local95];
				if (Static10.aBooleanArray1[local95]) {
					Static185.aClass34_7.method5729(local403.width, local403.x, local403.height, -1996553985, local403.y);
				} else if (Static408.aBooleanArray25[local95]) {
					Static185.aClass34_7.method5729(local403.width, local403.x, local403.height, -1996554240, local403.y);
				}
			}
		}
		if (Static151.method2248()) {
			Static398.method2756(Static185.aClass34_7);
		}
		if (Static445.method5848(Static312.anInt5414) && Static231.anInt4065 == 0 && Static101.method1560() == 1 && !local166 && Static117.aString28.equals("1.1")) {
			local95 = 0;
			for (local99 = 0; local99 < Static250.anInt4507; local99++) {
				if (Static408.aBooleanArray25[local99]) {
					Static408.aBooleanArray25[local99] = false;
					Static162.aRectangleArray1[local95++] = Class129.aRectangleArray2[local99];
				}
			}
			Static185.aClass34_7.method5751(Static162.aRectangleArray1, local95);
		} else if (Static312.anInt5414 != 0) {
			Static185.aClass34_7.method5781();
			for (local95 = 0; local95 < Static250.anInt4507; local95++) {
				Static408.aBooleanArray25[local95] = false;
			}
		}
		if (Static453.aClass136_Sub1_1.anInt4459 == 0) {
			Static223.method4582(15L);
		} else if (Static453.aClass136_Sub1_1.anInt4459 == 1) {
			Static223.method4582(10L);
		} else if (Static453.aClass136_Sub1_1.anInt4459 == 2) {
			Static223.method4582(5L);
		} else if (Static453.aClass136_Sub1_1.anInt4459 == 3) {
			Static223.method4582(2L);
		}
		if (Static294.aBoolean583) {
			Static87.method5267();
		}
		if (Static453.aClass136_Sub1_1.aBoolean497 && Static312.anInt5414 == 2 && Static207.anInt6026 != -1) {
			Static453.aClass136_Sub1_1.aBoolean497 = false;
			Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method962() {
		@Pc(7) boolean local7 = Static32.aClass224_1.method4928();
		if (!local7) {
			this.method960();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method963() {
		@Pc(35) int local35;
		if (Static312.anInt5414 == 6 && Static58.anInt1166 == 0) {
			if (Static338.anInt5778 > 1) {
				Static338.anInt5778--;
				Static15.anInt300 = Static18.anInt379;
			}
			if (Static372.anInt6263 > 0) {
				Static372.anInt6263--;
			}
			if (!Static17.aBoolean39) {
				Static108.method1714();
			}
			for (local35 = 0; local35 < 100 && Static124.method5685(); local35++) {
			}
		}
		Static341.anInt5831++;
		Static437.method5726(null, -1, -1);
		Static361.method4848(null, -1, -1);
		Static116.method1853();
		Static18.anInt379++;
		for (local35 = 0; local35 < 32768; local35++) {
			@Pc(84) Class25_Sub5_Sub1_Sub1 local84 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local35];
			if (local84 != null) {
				@Pc(90) byte local90 = local84.aClass54_1.aByte11;
				if ((local90 & 0x1) != 0) {
					@Pc(101) int local101 = local84.method3427();
					@Pc(125) int local125;
					if ((local90 & 0x2) != 0 && local84.anInt4314 == 0 && Math.random() * 1000.0D < 10.0D) {
						local125 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(133) int local133 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local125 != 0 || local133 != 0) {
							@Pc(150) int local150 = local125 + local84.anIntArray283[0];
							if (local150 < 0) {
								local150 = 0;
							} else if (Static296.anInt5187 - local101 - 1 < local150) {
								local150 = Static296.anInt5187 - local101 - 1;
							}
							@Pc(180) int local180 = local133 + local84.anIntArray284[0];
							if (local180 < 0) {
								local180 = 0;
							} else if (local180 > Static206.anInt3607 - local101 - 1) {
								local180 = Static206.anInt3607 - local101 - 1;
							}
							@Pc(233) int local233 = Static262.method3695(local180, true, local84.anIntArray283[0], 0, Static334.anIntArray390, local150, Static81.anIntArray113, local84.anIntArray284[0], local101, 0, local101, -1, Static447.aClass14Array3[local84.aByte94], local101);
							if (local233 > 0) {
								if (local233 > 9) {
									local233 = 9;
								}
								for (@Pc(247) int local247 = 0; local247 < local233; local247++) {
									local84.anIntArray283[local247] = Static334.anIntArray390[local233 - local247 - 1];
									local84.anIntArray284[local247] = Static81.anIntArray113[local233 - local247 - 1];
									local84.aByteArray51[local247] = 1;
								}
								local84.anInt4314 = local233;
							}
						}
					}
					Static286.method3943(true, local84);
					local125 = Static426.method5638(local84);
					Static312.method4242(local84, Static289.anInt5060, local125, Static428.anInt7227);
					Static169.method2395(local84);
				}
			}
		}
		if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
			if (Static333.anInt5693 == 2) {
				Static130.method2037();
			} else {
				Static409.method5275();
			}
			if (Static213.anInt258 >> 7 < 14 || Static213.anInt258 >> 7 >= Static296.anInt5187 - 14 || Static360.anInt6145 >> 7 < 14 || Static360.anInt6145 >> 7 >= Static206.anInt3607 - 14) {
				Static448.method5874();
			}
		}
		while (true) {
			@Pc(364) Class1_Sub40 local364;
			@Pc(369) Class124 local369;
			@Pc(377) Class124 local377;
			do {
				local364 = (Class1_Sub40) Static3.aClass227_36.method4974();
				if (local364 == null) {
					while (true) {
						do {
							local364 = (Class1_Sub40) Static104.aClass227_9.method4974();
							if (local364 == null) {
								while (true) {
									do {
										local364 = (Class1_Sub40) Static254.aClass227_28.method4974();
										if (local364 == null) {
											if (Static371.aClass124_10 != null) {
												Static83.method1382();
											}
											if (Static236.anInt4213 % 1500 == 0) {
												Static458.method4949();
											}
											if (Static312.anInt5414 == 6 && Static58.anInt1166 == 0) {
												Static295.method4032();
											}
											Static280.method3890();
											if (Static433.aBoolean797 && Static27.method359() - 60000L > Static216.aLong125) {
												Static364.method2863();
											}
											for (@Pc(544) Class4_Sub1_Sub1 local544 = (Class4_Sub1_Sub1) Static341.aClass262_11.method5819(); local544 != null; local544 = (Class4_Sub1_Sub1) Static341.aClass262_11.method5813()) {
												if (Static27.method359() / 1000L - 5L > (long) local544.anInt3922) {
													if (local544.aShort57 > 0) {
														Static90.method1430(local544.aString46 + Static31.aClass119_13.method2673(Static394.anInt6582), "", 5, "", 0);
													}
													if (local544.aShort57 == 0) {
														Static90.method1430(local544.aString46 + Static276.aClass119_114.method2673(Static394.anInt6582), "", 5, "", 0);
													}
													local544.method5572();
												}
											}
											if (Static312.anInt5414 == 6 && Static58.anInt1166 == 0) {
												if (Static395.aClass131_3 == null) {
													Static368.method4884(false);
													return;
												}
												Static343.anInt5889++;
												if (Static343.anInt5889 > 50) {
													Static52.method867(Static412.aClass103_239);
												}
												try {
													if (Static395.aClass131_3 != null && Static18.aClass1_Sub28_Sub1_1.anInt6812 > 0) {
														Static316.anInt5454 += Static18.aClass1_Sub28_Sub1_1.anInt6812;
														Static395.aClass131_3.method2928(Static18.aClass1_Sub28_Sub1_1.aByteArray86, Static18.aClass1_Sub28_Sub1_1.anInt6812);
														Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
														Static343.anInt5889 = 0;
														return;
													}
												} catch (@Pc(668) IOException local668) {
													Static368.method4884(false);
													return;
												}
											}
											return;
										}
										local369 = local364.aClass124_14;
										if (local369.anInt3430 < 0) {
											break;
										}
										local377 = Static412.method5315(local369.anInt3344);
									} while (local377 == null || local377.aClass124Array1 == null || local377.aClass124Array1.length <= local369.anInt3430 || local377.aClass124Array1[local369.anInt3430] != local369);
									Static298.method4076(local364);
								}
							}
							local369 = local364.aClass124_14;
							if (local369.anInt3430 < 0) {
								break;
							}
							local377 = Static412.method5315(local369.anInt3344);
						} while (local377 == null || local377.aClass124Array1 == null || local377.aClass124Array1.length <= local369.anInt3430 || local377.aClass124Array1[local369.anInt3430] != local369);
						Static298.method4076(local364);
					}
				}
				local369 = local364.aClass124_14;
				if (local369.anInt3430 < 0) {
					break;
				}
				local377 = Static412.method5315(local369.anInt3344);
			} while (local377 == null || local377.aClass124Array1 == null || local369.anInt3430 >= local377.aClass124Array1.length || local377.aClass124Array1[local369.anInt3430] != local369);
			Static298.method4076(local364);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method948()) {
			return;
		}
		Static437.aClass156_5 = new Class156();
		Static437.aClass156_5.anInt4501 = Integer.parseInt(this.getParameter("worldid"));
		Static95.aClass156_2 = new Class156();
		Static95.aClass156_2.anInt4501 = Integer.parseInt(this.getParameter("lobbyid"));
		Static95.aClass156_2.aString53 = this.getParameter("lobbyaddress");
		Static217.aClass156_3 = new Class156();
		Static217.aClass156_3.anInt4501 = Integer.parseInt(this.getParameter("demoid"));
		Static217.aClass156_3.aString53 = this.getParameter("demoaddress");
		Static328.aClass30_10 = Static239.method4557(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static361.method4843(Static328.aClass30_10) && Static328.aClass30_10 != Static459.aClass30_13) {
			Static328.aClass30_10 = Static459.aClass30_13;
		}
		Static57.aClass233_2 = Static347.method4706(Integer.parseInt(this.getParameter("modewhat")));
		if (Static52.aClass233_1 != Static57.aClass233_2 && Static125.aClass233_3 != Static57.aClass233_2 && Static430.aClass233_4 != Static57.aClass233_2) {
			Static57.aClass233_2 = Static430.aClass233_4;
		}
		try {
			Static394.anInt6582 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static394.anInt6582 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static122.aBoolean254 = true;
		} else {
			Static122.aBoolean254 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static330.aBoolean639 = true;
		} else {
			Static330.aBoolean639 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static260.aBoolean257 = true;
		} else {
			Static260.aBoolean257 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static183.aClass48_3 = Static191.aClass48_4;
			} else if (local145.equals("1")) {
				Static183.aClass48_3 = Static82.aClass48_7;
			}
		}
		try {
			Static83.anInt1575 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static83.anInt1575 = 0;
		}
		Static82.aString79 = this.getParameter("quiturl");
		Static87.aString74 = this.getParameter("settings");
		if (Static87.aString74 == null) {
			Static87.aString74 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static414.anInt6794 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static414.anInt6794 = 0;
			}
		}
		Static297.anInt5867 = Integer.parseInt(this.getParameter("colourid"));
		if (Static297.anInt5867 < 0 || Static339.aColorArray104.length <= Static297.anInt5867) {
			Static297.anInt5867 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static324.aBoolean629 = true;
			Static334.aBoolean649 = true;
		}
		@Pc(230) String local230 = this.getParameter("frombilling");
		if (local230 != null && local230.equals("true")) {
			Static241.aBoolean492 = true;
		}
		if (Static183.aClass48_3 == Static191.aClass48_4) {
			Static252.anInt4573 = 503;
			Static313.anInt5427 = 765;
		} else if (Static183.aClass48_3 == Static82.aClass48_7) {
			Static252.anInt4573 = 480;
			Static313.anInt5427 = 640;
		}
		Static159.aClient1 = this;
		this.method955(Static57.aClass233_2.method5030() + 32, Static252.anInt4573, Static313.anInt5427);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method964() {
		if (Static312.anInt5414 == 13) {
			return;
		}
		Static236.anInt4213++;
		if (Static236.anInt4213 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static392.anInt6557 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static454.aRandom1.setSeed((long) Static392.anInt6557);
		}
		if (Static236.anInt4213 % 50 == 0) {
			Static174.anInt2864 = Static316.anInt5454;
			Static316.anInt5454 = 0;
			Static396.anInt6616 = Static60.anInt1170;
			Static60.anInt1170 = 0;
		}
		this.method962();
		if (Static374.aClass101_1 != null) {
			Static374.aClass101_1.method2252();
		}
		Static329.method4428();
		Static160.aClass123_1.method2757();
		Static62.aClass96_1.method3879();
		if (Static374.aClass45_1 != null) {
			@Pc(82) int local82 = Static374.aClass45_1.method1292();
			Static208.anInt3611 = local82;
		}
		if (Static185.aClass34_7 != null) {
			Static185.aClass34_7.method5743((int) Static27.method359());
		}
		Static43.method597();
		Static324.anInt5556 = 0;
		for (@Pc(107) Class128 local107 = Static160.aClass123_1.method2751(); local107 != null && Static324.anInt5556 < 128; local107 = Static160.aClass123_1.method2751()) {
			if (local107.method4779() != 1) {
				@Pc(118) char local118 = local107.method4780();
				if (!Static336.method4512() || local118 != '`' && local118 != '§') {
					Static94.aClass128Array1[Static324.anInt5556] = local107;
					Static324.anInt5556++;
				} else if (Static151.method2248()) {
					Static36.method5123();
				} else {
					Static401.method5218();
				}
			}
		}
		for (@Pc(161) Class1_Sub24 local161 = Static62.aClass96_1.method3873(); local161 != null; local161 = Static62.aClass96_1.method3873()) {
			@Pc(167) int local167 = local161.method2417();
			if (local167 == -1) {
				Static135.aClass227_20.method4972(local161);
			} else if (Static37.method567(local167)) {
				Static130.aClass227_19.method4972(local161);
			}
			if (Static130.aClass227_19.method4975() > 10) {
				Static130.aClass227_19.method4974();
			}
		}
		if (Static151.method2248()) {
			Static168.method2385();
		}
		if (Static312.anInt5414 == 0) {
			this.method976();
			Static376.method4979();
		} else if (Static312.anInt5414 == 1) {
			this.method976();
			Static376.method4979();
		} else if (Static91.method1452(Static312.anInt5414)) {
			Static32.method423();
		}
		if (Static306.method4183(Static312.anInt5414) && !Static91.method1452(Static312.anInt5414)) {
			this.method963();
			Static262.method3700();
			Static210.method3094();
		} else if (Static40.method585(Static312.anInt5414) && !Static91.method1452(Static312.anInt5414)) {
			this.method963();
			Static210.method3094();
		} else if (Static312.anInt5414 == 11) {
			Static210.method3094();
		} else if (Static247.method3528(Static312.anInt5414) && !Static91.method1452(Static312.anInt5414)) {
			Static93.method1459();
		} else if (Static312.anInt5414 == 12) {
			Static210.method3094();
			if (Static291.anInt5071 != -3 && Static291.anInt5071 != 2 && Static291.anInt5071 != 15) {
				Static368.method4884(false);
			}
		}
		Static45.method4314(Static185.aClass34_7);
		Static130.aClass227_19.method4974();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method969(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class1_Sub28 local18 = new Class1_Sub28(arg0);
		while (true) {
			while (true) {
				@Pc(22) int local22 = local18.method5337();
				if (local22 == 0) {
					return;
				}
				if (local22 == 1) {
					@Pc(37) int[] local37 = Static137.anIntArray163 = new int[6];
					local37[0] = local18.method5335();
					local37[1] = local18.method5335();
					local37[2] = local18.method5335();
					local37[3] = local18.method5335();
					local37[4] = local18.method5335();
					local37[5] = local18.method5335();
				} else {
					@Pc(89) int local89;
					@Pc(94) int local94;
					if (local22 == 4) {
						local89 = local18.method5337();
						Static438.anIntArray306 = new int[local89];
						for (local94 = 0; local94 < local89; local94++) {
							Static438.anIntArray306[local94] = local18.method5335();
							if (Static438.anIntArray306[local94] == 65535) {
								Static438.anIntArray306[local94] = -1;
							}
						}
					} else if (local22 == 5) {
						local89 = local18.method5337();
						Static378.anIntArray190 = new int[local89];
						for (local94 = 0; local94 < local89; local94++) {
							Static378.anIntArray190[local94] = local18.method5335();
							if (Static378.anIntArray190[local94] == 65535) {
								Static378.anIntArray190[local94] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method949() {
		if (Static433.aBoolean797) {
			Static364.method2863();
		}
		if (Static185.aClass34_7 != null) {
			Static185.aClass34_7.method5782();
		}
		if (Static90.aFrame1 != null) {
			Static226.method3259(Static90.aFrame1, Static183.aClass83_2);
			Static90.aFrame1 = null;
		}
		if (Static395.aClass131_3 != null) {
			Static395.aClass131_3.method2933();
			Static395.aClass131_3 = null;
		}
		if (Static374.aClass45_1 != null) {
			Static374.aClass45_1.method1288(Static392.aCanvas5);
		}
		Static374.aClass45_1 = null;
		Static90.method1426();
		Static32.aClass224_1.method4927();
		Static14.aClass200_1.method4420();
		if (Static98.aClass66_1 != null) {
			Static98.aClass66_1.method1463();
			Static98.aClass66_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method976() {
		@Pc(6) int local6;
		if (!Static453.aClass136_Sub1_1.aBoolean497) {
			for (local6 = 0; local6 < Static324.anInt5556; local6++) {
				if (Static94.aClass128Array1[local6].method4780() == 's' || Static94.aClass128Array1[local6].method4780() == 'S') {
					Static453.aClass136_Sub1_1.aBoolean497 = true;
					break;
				}
			}
		}
		@Pc(54) int local54;
		if (Static351.anInt6020 == 0) {
			@Pc(44) Runtime local44 = Runtime.getRuntime();
			local54 = (int) ((local44.totalMemory() - local44.freeMemory()) / 1024L);
			@Pc(57) long local57 = Static27.method359();
			if (Static382.aLong218 == 0L) {
				Static382.aLong218 = local57;
			}
			if (local54 > 16384 && local57 - Static382.aLong218 < 5000L) {
				if (local57 - Static230.aLong131 > 1000L) {
					System.gc();
					Static230.aLong131 = local57;
				}
				Static250.aString54 = Static299.aClass119_177.method2673(Static394.anInt6582);
				Static319.anInt5465 = 5;
			} else {
				Static250.aString54 = Static220.aClass119_101.method2673(Static394.anInt6582);
				Static351.anInt6020 = 10;
				Static319.anInt5465 = 5;
			}
		} else if (Static351.anInt6020 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static447.aClass14Array3[local6] = Static260.method1930(Static206.anInt3607, Static296.anInt5187);
			}
			Static250.aString54 = Static116.aClass119_63.method2673(Static394.anInt6582);
			Static319.anInt5465 = 10;
			Static351.anInt6020 = 20;
		} else if (Static351.anInt6020 == 20) {
			if (Static374.aClass101_1 == null) {
				Static374.aClass101_1 = new Class101(Static32.aClass224_1, Static14.aClass200_1);
			}
			if (Static374.aClass101_1.method2250()) {
				Static285.aClass82_68 = Static276.method3828(0, true, false);
				Static231.aClass82_53 = Static276.method3828(1, true, false);
				Static305.aClass82_72 = Static276.method3828(2, true, false);
				Static19.aClass82_4 = Static276.method3828(3, true, false);
				Static257.aClass82_59 = Static276.method3828(4, true, false);
				Static206.aClass82_50 = Static276.method3828(5, true, true);
				Static447.aClass82_54 = Static276.method3828(6, false, true);
				Static145.aClass82_27 = Static276.method3828(7, true, false);
				Static448.aClass82_104 = Static276.method3828(8, true, false);
				Static146.aClass82_40 = Static276.method3828(9, true, false);
				Static332.aClass82_77 = Static276.method3828(10, true, false);
				Static409.aClass82_93 = Static276.method3828(11, true, false);
				Static73.aClass82_19 = Static276.method3828(12, true, false);
				Static332.aClass82_76 = Static276.method3828(13, true, false);
				Static348.aClass82_81 = Static276.method3828(14, false, false);
				Static459.aClass82_100 = Static276.method3828(15, true, false);
				Static223.aClass82_80 = Static276.method3828(16, true, false);
				Static388.aClass82_89 = Static276.method3828(17, true, false);
				Static362.aClass82_21 = Static276.method3828(18, true, false);
				Static104.aClass82_24 = Static276.method3828(19, true, false);
				Static142.aClass82_39 = Static276.method3828(20, true, false);
				Static441.aClass82_101 = Static276.method3828(21, true, false);
				Static168.aClass82_44 = Static276.method3828(22, true, false);
				Static160.aClass82_43 = Static276.method3828(23, true, true);
				Static240.aClass82_91 = Static276.method3828(24, true, false);
				Static394.aClass82_90 = Static276.method3828(25, true, false);
				Static307.aClass82_74 = Static276.method3828(26, true, true);
				Static337.aClass82_79 = Static276.method3828(27, true, false);
				Static31.aClass82_6 = Static276.method3828(28, true, true);
				Static431.aClass82_98 = Static276.method3828(29, true, false);
				Static250.aString54 = Static272.aClass119_112.method2673(Static394.anInt6582);
				Static351.anInt6020 = 30;
				Static319.anInt5465 = 15;
			} else {
				Static250.aString54 = Static209.aClass119_97.method2673(Static394.anInt6582);
				Static319.anInt5465 = 12;
			}
		} else if (Static351.anInt6020 == 30) {
			local6 = 0;
			for (local54 = 0; local54 < 30; local54++) {
				local6 += Static97.aClass85_Sub1Array1[local54].method1900() * Static388.anIntArray432[local54] / 100;
			}
			if (local6 == 100) {
				Static250.aString54 = Static107.aClass119_57.method2673(Static394.anInt6582);
				Static319.anInt5465 = 20;
				Static282.method3893(Static448.aClass82_104);
				Static30.method392(Static448.aClass82_104);
				Static351.anInt6020 = 40;
			} else {
				if (local6 != 0) {
					Static250.aString54 = Static118.aClass119_64.method2673(Static394.anInt6582) + local6 + "%";
				}
				Static319.anInt5465 = 20;
			}
		} else if (Static351.anInt6020 == 40) {
			if (Static31.aClass82_6.method1828()) {
				this.method969(Static31.aClass82_6.method1815(1));
				Static250.aString54 = Static377.aClass119_156.method2673(Static394.anInt6582);
				Static319.anInt5465 = 25;
				Static351.anInt6020 = 50;
			} else {
				Static250.aString54 = Static102.aClass119_50.method2673(Static394.anInt6582) + Static31.aClass82_6.method1821() + "%";
				Static319.anInt5465 = 25;
			}
		} else if (Static351.anInt6020 == 50) {
			Static369.method4900();
			Static250.aString54 = Static431.aClass119_174.method2673(Static394.anInt6582);
			Static351.anInt6020 = 60;
			Static319.anInt5465 = 30;
		} else if (Static351.anInt6020 == 60) {
			local6 = Static180.method2607(Static448.aClass82_104, Static332.aClass82_76);
			local54 = Static421.method5597();
			if (local6 < local54) {
				Static250.aString54 = Static445.aClass119_179.method2673(Static394.anInt6582) + local6 * 100 / local54 + "%";
				Static319.anInt5465 = 35;
			} else {
				Static250.aString54 = Static414.aClass119_165.method2673(Static394.anInt6582);
				Static319.anInt5465 = 35;
				Static351.anInt6020 = 70;
			}
		} else if (Static351.anInt6020 == 70) {
			local6 = Static336.method4514(Static448.aClass82_104);
			local54 = Static320.method4995();
			if (local54 > local6) {
				Static250.aString54 = Static235.aClass119_105.method2673(Static394.anInt6582) + local6 * 100 / local54 + "%";
				Static319.anInt5465 = 40;
			} else {
				Static250.aString54 = Static400.aClass119_163.method2673(Static394.anInt6582);
				Static351.anInt6020 = 80;
				Static319.anInt5465 = 40;
			}
		} else if (Static351.anInt6020 == 80) {
			if (Static307.aClass82_74.method1828()) {
				Static310.anInterface6_4 = new Class175(Static307.aClass82_74, Static146.aClass82_40, Static448.aClass82_104);
				Static250.aString54 = Static388.aClass119_161.method2673(Static394.anInt6582);
				Static319.anInt5465 = 45;
				Static351.anInt6020 = 90;
			} else {
				Static250.aString54 = Static279.aClass119_116.method2673(Static394.anInt6582) + Static307.aClass82_74.method1821() + "%";
				Static319.anInt5465 = 45;
			}
		} else if (Static351.anInt6020 == 90) {
			Static250.aString54 = Static76.aClass119_36.method2673(Static394.anInt6582);
			Static351.anInt6020 = 95;
			Static319.anInt5465 = 50;
		} else if (Static351.anInt6020 == 95) {
			if (Static453.aClass136_Sub1_1.aBoolean497) {
				Static453.aClass136_Sub1_1.anInt4439 = 0;
				Static453.aClass136_Sub1_1.anInt4454 = 0;
				Static453.aClass136_Sub1_1.anInt4446 = 0;
				Static453.aClass136_Sub1_1.anInt4455 = 1;
				Static453.aClass136_Sub1_1.anInt4443 = 0;
			}
			Static453.aClass136_Sub1_1.aBoolean497 = true;
			Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
			Static173.method2428(false, Static453.aClass136_Sub1_1.anInt4439);
			Static250.aString54 = Static7.aClass119_1.method2673(Static394.anInt6582);
			Static319.anInt5465 = 55;
			Static351.anInt6020 = 100;
		} else if (Static351.anInt6020 == 100) {
			Static451.method5905(Static185.aClass34_7, Static448.aClass82_104, Static332.aClass82_76);
			Static250.aString54 = Static181.aClass119_91.method2673(Static394.anInt6582);
			Static319.anInt5465 = 60;
			Static203.method4783(1);
			Static351.anInt6020 = 110;
		} else if (Static351.anInt6020 == 110) {
			Static305.aClass82_72.method1828();
			local6 = Static305.aClass82_72.method1821();
			Static223.aClass82_80.method1828();
			local6 += Static223.aClass82_80.method1821();
			Static388.aClass82_89.method1828();
			local6 += Static388.aClass82_89.method1821();
			Static362.aClass82_21.method1828();
			local6 += Static362.aClass82_21.method1821();
			Static104.aClass82_24.method1828();
			local6 += Static104.aClass82_24.method1821();
			Static142.aClass82_39.method1828();
			local6 += Static142.aClass82_39.method1821();
			Static441.aClass82_101.method1828();
			local6 += Static441.aClass82_101.method1821();
			Static168.aClass82_44.method1828();
			local6 += Static168.aClass82_44.method1821();
			Static240.aClass82_91.method1828();
			local6 += Static240.aClass82_91.method1821();
			Static394.aClass82_90.method1828();
			local6 += Static394.aClass82_90.method1821();
			Static337.aClass82_79.method1828();
			local6 += Static337.aClass82_79.method1821();
			Static431.aClass82_98.method1828();
			local6 += Static431.aClass82_98.method1821();
			if (local6 < 1200) {
				Static250.aString54 = Static416.aClass119_166.method2673(Static394.anInt6582) + local6 / 12 + "%";
				Static319.anInt5465 = 65;
			} else {
				Static65.aClass86_1 = new Class86(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static291.aClass21_1 = new Class21(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static95.aClass163_1 = new Class163(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72, Static448.aClass82_104);
				Static18.aClass40_1 = new Class40(Static183.aClass48_3, Static394.anInt6582, Static388.aClass82_89);
				Static277.aClass241_12 = new Class241(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static382.aClass245_8 = new Class245(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static339.aClass215_2 = new Class215(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72, Static145.aClass82_27);
				Static8.aClass132_1 = new Class132(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static95.aClass26_1 = new Class26(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static341.aClass75_4 = new Class75(Static183.aClass48_3, Static394.anInt6582, true, Static223.aClass82_80, Static145.aClass82_27);
				Static392.aClass178_4 = new Class178(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72, Static448.aClass82_104);
				Static355.aClass263_4 = new Class263(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72, Static448.aClass82_104);
				Static161.aClass231_2 = new Class231(Static183.aClass48_3, Static394.anInt6582, true, Static362.aClass82_21, Static145.aClass82_27);
				Static342.aClass155_2 = new Class155(Static183.aClass48_3, Static394.anInt6582, true, Static65.aClass86_1, Static104.aClass82_24, Static145.aClass82_27);
				Static300.aClass223_1 = new Class223(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static174.aClass254_1 = new Class254(Static183.aClass48_3, Static394.anInt6582, Static142.aClass82_39, Static285.aClass82_68, Static231.aClass82_53);
				Static55.aClass187_1 = new Class187(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static130.aClass164_1 = new Class164(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static88.aClass69_1 = new Class69(Static183.aClass48_3, Static394.anInt6582, Static441.aClass82_101, Static145.aClass82_27);
				Static271.aClass180_2 = new Class180(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static213.aClass218_2 = new Class218(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static433.aClass138_1 = new Class138(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static82.aClass105_4 = new Class105(Static183.aClass48_3, Static394.anInt6582, Static168.aClass82_44);
				Static208.aClass151_1 = new Class151(Static183.aClass48_3, Static394.anInt6582, Static305.aClass82_72);
				Static33.method427(Static19.aClass82_4, Static332.aClass82_76, Static145.aClass82_27, Static448.aClass82_104);
				Static450.method5882(Static431.aClass82_98);
				Static377.aClass121_1 = new Class121(Static394.anInt6582, Static240.aClass82_91, Static394.aClass82_90);
				Static456.aClass9_2 = new Class9(Static394.anInt6582, Static240.aClass82_91, Static394.aClass82_90, new Class197());
				Static250.aString54 = Static246.aClass119_107.method2673(Static394.anInt6582);
				Static319.anInt5465 = 65;
				Static262.method3699();
				Static341.aClass75_4.method1612(!Static453.aClass136_Sub1_1.method3522(Static14.anInt293));
				Static320.aClass249_2 = new Class249();
				Static354.method4773();
				Static182.method2649(Static337.aClass82_79);
				Static309.method4216(Static310.anInterface6_4, Static145.aClass82_27);
				Static351.anInt6020 = 120;
			}
		} else if (Static351.anInt6020 == 120) {
			local6 = Static452.method5907(Static448.aClass82_104);
			local54 = Static198.method2822();
			if (local54 > local6) {
				Static250.aString54 = Static425.aClass119_171.method2673(Static394.anInt6582) + local6 * 100 / local54 + "%";
				Static319.anInt5465 = 70;
			} else {
				Static359.method4817(Static185.aClass34_7, Static448.aClass82_104);
				Static428.method5663(Static352.aClass6Array11);
				Static250.aString54 = Static260.aClass119_66.method2673(Static394.anInt6582);
				Static351.anInt6020 = 130;
				Static319.anInt5465 = 70;
			}
		} else if (Static351.anInt6020 == 130) {
			if (Static332.aClass82_77.method1814("", "huffman")) {
				@Pc(1244) Class239 local1244 = new Class239(Static332.aClass82_77.method1819("huffman", ""));
				Static381.method5018(local1244);
				Static250.aString54 = Static104.aClass119_51.method2673(Static394.anInt6582);
				Static351.anInt6020 = 140;
				Static319.anInt5465 = 75;
			} else {
				Static250.aString54 = Static20.aClass119_113.method2673(Static394.anInt6582) + "0%";
				Static319.anInt5465 = 75;
			}
		} else if (Static351.anInt6020 == 140) {
			if (Static19.aClass82_4.method1828()) {
				Static250.aString54 = Static41.aClass119_18.method2673(Static394.anInt6582);
				Static319.anInt5465 = 80;
				Static351.anInt6020 = 150;
			} else {
				Static250.aString54 = Static8.aClass119_2.method2673(Static394.anInt6582) + Static19.aClass82_4.method1821() + "%";
				Static319.anInt5465 = 80;
			}
		} else if (Static351.anInt6020 == 150) {
			if (Static73.aClass82_19.method1828()) {
				Static250.aString54 = Static349.aClass119_145.method2673(Static394.anInt6582);
				Static351.anInt6020 = 160;
				Static319.anInt5465 = 82;
			} else {
				Static250.aString54 = Static10.aClass119_5.method2673(Static394.anInt6582) + Static73.aClass82_19.method1821() + "%";
				Static319.anInt5465 = 82;
			}
		} else if (Static351.anInt6020 == 160) {
			if (Static332.aClass82_76.method1828()) {
				Static250.aString54 = Static350.aClass119_146.method2673(Static394.anInt6582);
				Static351.anInt6020 = 170;
				Static319.anInt5465 = 85;
			} else {
				Static250.aString54 = Static350.aClass119_146.method2673(Static394.anInt6582) + Static332.aClass82_76.method1821() + "%";
				Static319.anInt5465 = 85;
			}
		} else if (Static351.anInt6020 == 170) {
			if (Static160.aClass82_43.method1844("details")) {
				Static167.method1762(Static160.aClass82_43, Static277.aClass241_12, Static382.aClass245_8, Static341.aClass75_4, Static392.aClass178_4, Static355.aClass263_4, Static320.aClass249_2);
				Static250.aString54 = Static200.aClass119_96.method2673(Static394.anInt6582);
				Static319.anInt5465 = 89;
				Static351.anInt6020 = 190;
			} else {
				Static250.aString54 = Static157.aClass119_75.method2673(Static394.anInt6582) + Static160.aClass82_43.method1841("details") + "%";
				Static319.anInt5465 = 87;
			}
		} else if (Static351.anInt6020 == 190) {
			Static352.anIntArray414 = new int[Static433.aClass138_1.anInt3904];
			Static148.aBooleanArray9 = new boolean[Static433.aClass138_1.anInt3904];
			Static11.aStringArray3 = new String[Static213.aClass218_2.anInt6119];
			for (local6 = 0; local6 < Static433.aClass138_1.anInt3904; local6++) {
				if (Static433.aClass138_1.method3186(local6).anInt1839 == 0) {
					Static148.aBooleanArray9[local6] = true;
					Static391.anInt6530++;
				}
				Static352.anIntArray414[local6] = -1;
			}
			Static403.method5242();
			Static228.anInt4845 = Static19.aClass82_4.method1835("loginscreen");
			Static443.anInt5161 = Static19.aClass82_4.method1835("lobbyscreen");
			Static206.aClass82_50.method1831(false);
			Static447.aClass82_54.method1831(true);
			Static448.aClass82_104.method1831(true);
			Static332.aClass82_76.method1831(true);
			Static332.aClass82_77.method1831(true);
			Static19.aClass82_4.method1831(true);
			Static305.aClass82_72.anInt2180 = 2;
			Static294.aBoolean583 = true;
			Static388.aClass82_89.anInt2180 = 2;
			Static223.aClass82_80.anInt2180 = 2;
			Static362.aClass82_21.anInt2180 = 2;
			Static104.aClass82_24.anInt2180 = 2;
			Static142.aClass82_39.anInt2180 = 2;
			Static441.aClass82_101.anInt2180 = 2;
			Static169.method2392(-1, Static453.aClass136_Sub1_1.anInt4455, -1, false);
			Static250.aString54 = Static51.aClass119_24.method2673(Static394.anInt6582);
			Static319.anInt5465 = 95;
			Static351.anInt6020 = 200;
		} else if (Static351.anInt6020 == 200) {
			Static203.method4783(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/lang/String;")
	@Override
	protected String method953() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static199.anInt3480 + "," + Static164.anInt2731 + "," + Static296.anInt5187 + "," + Static206.anInt3607 + "|";
			if (Static447.aClass25_Sub5_Sub1_Sub2_4 != null) {
				local5 = local5 + "2)" + Static265.anInt4807 + "," + (Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0] + Static199.anInt3480) + "," + (Static164.anInt2731 + Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0]) + "|";
			}
			local5 = local5 + "3)" + Static14.anInt293 + "|4)" + Static453.aClass136_Sub1_1.anInt4443 + "|5)" + Static101.method1560() + "|6)" + Static69.anInt1304 + "," + Static338.anInt5777 + "|";
			local5 = local5 + "7)" + Static453.aClass136_Sub1_1.method3519(Static14.anInt293) + "|";
			local5 = local5 + "8)" + Static453.aClass136_Sub1_1.method3516(Static14.anInt293) + "|";
			local5 = local5 + "9)" + Static453.aClass136_Sub1_1.aBoolean501 + "|";
			local5 = local5 + "10)" + Static453.aClass136_Sub1_1.aBoolean505 + "|";
			local5 = local5 + "11)" + Static453.aClass136_Sub1_1.aBoolean511 + "|";
			local5 = local5 + "12)" + Static453.aClass136_Sub1_1.method3522(Static14.anInt293) + "|";
			local5 = local5 + "13)" + Static270.anInt4858 + "|";
			local5 = local5 + "14)" + Static312.anInt5414;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(224) Throwable local224) {
			}
			local5 = local5 + "]";
		} catch (@Pc(235) Throwable local235) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method958() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static182.method2648();
		Static14.aClass200_1 = new Class200(Static183.aClass83_2);
		Static32.aClass224_1 = new Class224();
		if (Static459.aClass30_13 != Static328.aClass30_10) {
			Static335.aByteArrayArray23 = new byte[50][];
		}
		Static453.aClass136_Sub1_1 = new Class136_Sub1(Static183.aClass83_2);
		if (Static459.aClass30_13 == Static328.aClass30_10) {
			Static437.aClass156_5.aString53 = this.getCodeBase().getHost();
		} else if (Static361.method4843(Static328.aClass30_10)) {
			Static437.aClass156_5.aString53 = this.getCodeBase().getHost();
			Static437.aClass156_5.anInt4508 = Static437.aClass156_5.anInt4501 + 40000;
			Static95.aClass156_2.anInt4508 = Static95.aClass156_2.anInt4501 + 40000;
			Static437.aClass156_5.anInt4505 = Static437.aClass156_5.anInt4501 + 50000;
			Static217.aClass156_3.anInt4508 = Static217.aClass156_3.anInt4501 + 40000;
			Static95.aClass156_2.anInt4505 = Static95.aClass156_2.anInt4501 + 50000;
			Static217.aClass156_3.anInt4505 = Static217.aClass156_3.anInt4501 + 50000;
		} else if (Static38.aClass30_1 == Static328.aClass30_10) {
			Static437.aClass156_5.aString53 = "127.0.0.1";
			Static95.aClass156_2.aString53 = "127.0.0.1";
			Static437.aClass156_5.anInt4508 = Static437.aClass156_5.anInt4501 + 40000;
			Static217.aClass156_3.aString53 = "127.0.0.1";
			Static95.aClass156_2.anInt4508 = Static95.aClass156_2.anInt4501 + 40000;
			Static217.aClass156_3.anInt4508 = Static217.aClass156_3.anInt4501 + 40000;
			Static437.aClass156_5.anInt4505 = Static437.aClass156_5.anInt4501 + 50000;
			Static95.aClass156_2.anInt4505 = Static95.aClass156_2.anInt4501 + 50000;
			Static217.aClass156_3.anInt4505 = Static217.aClass156_3.anInt4501 + 50000;
		}
		if (Static183.aClass48_3 == Static82.aClass48_7) {
			Static429.anInt7256 = 0;
			Static28.aShortArrayArray1 = Static336.aShortArrayArray8;
			Static345.aBoolean678 = true;
			Static452.aShortArrayArray13 = Static356.aShortArrayArray9;
			Static343.anInt5894 = 16777215;
			Static220.aShortArray62 = Static69.aShortArray12;
			Static166.aShortArray47 = Static354.aShortArray99;
		} else {
			Static28.aShortArrayArray1 = Static87.aShortArrayArray11;
			Static166.aShortArray47 = Static112.aShortArray46;
			Static452.aShortArrayArray13 = Static450.aShortArrayArray12;
			Static220.aShortArray62 = Static319.aShortArray97;
		}
		if (Static191.aClass48_4 == Static183.aClass48_3) {
			Static443.aBoolean586 = false;
		}
		Static259.aClass156_4 = Static437.aClass156_5;
		Static34.aShortArray3 = Static96.aShortArray52 = Static109.aShortArray75 = Static328.aShortArray98 = new short[256];
		Static160.aClass123_1 = Static333.method4488(Static392.aCanvas5);
		Static62.aClass96_1 = Static254.method3665(Static392.aCanvas5);
		Static374.aClass45_1 = Static379.method4988();
		if (Static374.aClass45_1 != null) {
			Static374.aClass45_1.method1294(Static392.aCanvas5);
		}
		Static34.anInt592 = Static117.anInt2198;
		try {
			if (Static183.aClass83_2.aClass98_3 != null) {
				Static96.aClass219_3 = new Class219(Static183.aClass83_2.aClass98_3, 5200, 0);
				for (@Pc(225) int local225 = 0; local225 < 30; local225++) {
					Static280.aClass219Array1[local225] = new Class219(Static183.aClass83_2.aClass98Array1[local225], 6000, 0);
				}
				Static133.aClass219_2 = new Class219(Static183.aClass83_2.aClass98_2, 6000, 0);
				Static367.aClass257_4 = new Class257(255, Static96.aClass219_3, Static133.aClass219_2, 500000);
				Static363.aClass219_4 = new Class219(Static183.aClass83_2.aClass98_1, 24, 0);
				Static183.aClass83_2.aClass98_3 = null;
				Static183.aClass83_2.aClass98_1 = null;
				Static183.aClass83_2.aClass98_2 = null;
				Static183.aClass83_2.aClass98Array1 = null;
			}
		} catch (@Pc(281) IOException local281) {
			Static96.aClass219_3 = null;
			Static367.aClass257_4 = null;
			Static363.aClass219_4 = null;
			Static133.aClass219_2 = null;
		}
		if (Static459.aClass30_13 != Static328.aClass30_10) {
			Static303.aBoolean817 = true;
		}
		if (Static191.aClass48_4 == Static183.aClass48_3) {
			Static145.aString21 = Static174.aClass119_84.method2673(Static394.anInt6582);
		} else if (Static82.aClass48_7 == Static183.aClass48_3) {
			Static145.aString21 = Static352.aClass119_147.method2673(Static394.anInt6582);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method950() {
	}
}
