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
			if (arg0.length != 4) {
				Static345.method4961("argument count");
			}
			Static221.anInt7649 = Integer.parseInt(arg0[0]);
			Static153.aClass174_7 = Static108.aClass174_2;
			if (arg0[1].equals("live")) {
				Static311.aClass182_4 = Static414.aClass182_5;
			} else if (arg0[1].equals("rc")) {
				Static311.aClass182_4 = Static264.aClass182_2;
			} else if (arg0[1].equals("wip")) {
				Static311.aClass182_4 = Static204.aClass182_1;
			} else {
				Static345.method4961("modewhat");
			}
			Static389.anInt7061 = Static199.method3072(arg0[2]);
			if (Static389.anInt7061 == -1) {
				if (arg0[2].equals("english")) {
					Static389.anInt7061 = 0;
				} else if (arg0[2].equals("german")) {
					Static389.anInt7061 = 1;
				} else {
					Static345.method4961("language");
				}
			}
			Static189.aBoolean273 = false;
			Static310.aBoolean422 = false;
			if (arg0[3].equals("game0")) {
				Static325.aClass169_2 = Static392.aClass169_3;
			} else if (arg0[3].equals("game1")) {
				Static325.aClass169_2 = Static92.aClass169_1;
			} else {
				Static345.method4961("game");
			}
			Static311.anInt6534 = 0;
			Static40.anInt625 = 0;
			Static379.anInt6823 = Static325.aClass169_2.anInt4406;
			Static42.aBoolean412 = true;
			Static97.aBoolean142 = true;
			Static87.aString67 = "";
			@Pc(128) client local128 = new client();
			Static451.aClient1 = local128;
			local128.method732(Static325.aClass169_2.aString61, Static311.aClass182_4.method3908() + 32);
			Static303.aFrame1.setLocation(40, 40);
		} catch (@Pc(151) Exception local151) {
			Static101.method1630(null, local151);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;")
	@Override
	protected String method739() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static190.anInt3507 + "," + Static331.anInt6034 + "," + Static80.anInt6558 + "," + Static104.anInt2048 + "|";
			if (Static255.aClass47_Sub1_Sub5_Sub2_2 != null) {
				local5 = local5 + "2)" + Static1.anInt41 + "," + (Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0] + Static190.anInt3507) + "," + (Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0] + Static331.anInt6034) + "|";
			}
			local5 = local5 + "3)" + Static146.anInt2664 + "|4)" + Static327.aClass230_Sub1_1.anInt7312 + "|5)" + Static174.method2768() + "|6)" + Static403.anInt7142 + "," + Static324.anInt5725 + "|";
			local5 = local5 + "7)" + Static327.aClass230_Sub1_1.method5639(Static146.anInt2664) + "|";
			local5 = local5 + "8)" + Static327.aClass230_Sub1_1.method5636(Static146.anInt2664) + "|";
			local5 = local5 + "9)" + Static327.aClass230_Sub1_1.aBoolean616 + "|";
			local5 = local5 + "10)" + Static327.aClass230_Sub1_1.aBoolean617 + "|";
			local5 = local5 + "11)" + Static327.aClass230_Sub1_1.aBoolean612 + "|";
			local5 = local5 + "12)" + Static327.aClass230_Sub1_1.method5644(Static146.anInt2664) + "|";
			local5 = local5 + "13)" + Static188.anInt3481 + "]";
		} catch (@Pc(205) Throwable local205) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method730() {
		if (Static40.anInt629 == 1000) {
			return;
		}
		Static123.anInt2333++;
		if (Static123.anInt2333 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static250.anInt4325 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static117.aRandom1.setSeed((long) Static250.anInt4325);
		}
		if (Static123.anInt2333 % 50 == 0) {
			Static70.anInt1286 = Static9.anInt212;
			Static238.anInt4206 = Static129.anInt2415;
			Static9.anInt212 = 0;
			Static129.anInt2415 = 0;
		}
		this.method757();
		if (Static267.aClass172_1 != null) {
			Static267.aClass172_1.method3703();
		}
		Static332.method4786();
		Static254.aClass10_1.method223();
		Static38.aClass32_1.method3525();
		if (Static386.aClass224_1 != null) {
			@Pc(85) int local85 = Static386.aClass224_1.method5332();
			Static152.anInt2736 = local85;
		}
		if (Static447.aClass121_11 != null) {
			Static447.aClass121_11.method4579((int) Static107.method1707());
		}
		Static426.method5750();
		Static64.anInt1162 = 0;
		for (@Pc(102) Class22 local102 = Static254.aClass10_1.method220(); local102 != null && Static64.anInt1162 < 128; local102 = Static254.aClass10_1.method220()) {
			if (local102.method369() != 1) {
				@Pc(113) char local113 = local102.method366();
				if (!Static31.method435() || local113 != '`' && local113 != '§') {
					Static209.aClass22Array3[Static64.anInt1162] = local102;
					Static64.anInt1162++;
				} else if (Static177.method2860()) {
					Static325.method4726();
				} else {
					Static180.method3095();
				}
			}
		}
		for (@Pc(156) Class1_Sub22 local156 = Static38.aClass32_1.method3523(); local156 != null; local156 = Static38.aClass32_1.method3523()) {
			@Pc(162) int local162 = local156.method2937();
			if (local162 == -1) {
				Static392.aClass142_47.method3212(local156);
			} else if (Static39.method518(local162)) {
				Static335.aClass142_42.method3212(local156);
			}
			if (Static335.aClass142_42.method3208() > 10) {
				Static335.aClass142_42.method3196();
			}
		}
		if (Static177.method2860()) {
			Static318.method4378();
		}
		if (Static40.anInt629 == 0) {
			this.method758();
			Static346.method4985();
		} else if (Static40.anInt629 == 5) {
			this.method758();
			Static346.method4985();
		} else if (Static40.anInt629 == 25 || Static40.anInt629 == 28) {
			Static99.method1608();
		}
		if (Static40.anInt629 == 10) {
			this.method745();
			Static235.method3420();
			Static401.method5479();
			Static213.method3205();
		} else if (Static40.anInt629 == 30) {
			Static343.method4934();
		} else if (Static40.anInt629 == 40) {
			Static213.method3205();
			if (Static195.anInt3545 != -3 && Static195.anInt3545 != 2 && Static195.anInt3545 != 15) {
				Static261.method3691();
			}
		}
		Static41.method549(Static447.aClass121_11);
		Static335.aClass142_42.method3196();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method743() {
		if (Static125.aClass164_2.anInt4318 > Static161.anInt2865) {
			if (Static29.anInt481 == Static168.anInt3019) {
				Static29.anInt481 = Static11.anInt231;
			} else {
				Static29.anInt481 = Static168.anInt3019;
			}
			Static77.anInt1447 = (Static125.aClass164_2.anInt4318 * 50 - 50) * 5;
			if (Static77.anInt1447 > 3000) {
				Static77.anInt1447 = 3000;
			}
			if (Static125.aClass164_2.anInt4318 >= 2 && Static125.aClass164_2.anInt4319 == 6) {
				this.method722("js5connect_outofdate");
				Static40.anInt629 = 1000;
				return;
			}
			if (Static125.aClass164_2.anInt4318 >= 4 && Static125.aClass164_2.anInt4319 == -1) {
				this.method722("js5crc");
				Static40.anInt629 = 1000;
				return;
			}
			if (Static125.aClass164_2.anInt4318 >= 4 && (Static40.anInt629 == 0 || Static40.anInt629 == 5)) {
				if (Static125.aClass164_2.anInt4319 == 7 || Static125.aClass164_2.anInt4319 == 9) {
					this.method722("js5connect_full");
				} else if (Static125.aClass164_2.anInt4319 <= 0) {
					this.method722("js5io");
				} else {
					this.method722("js5connect");
				}
				Static40.anInt629 = 1000;
				return;
			}
		}
		Static161.anInt2865 = Static125.aClass164_2.anInt4318;
		if (Static77.anInt1447 > 0) {
			Static77.anInt1447--;
			return;
		}
		try {
			if (Static449.anInt7753 == 0) {
				Static152.aClass159_3 = Static403.aClass42_6.method656(Static63.aString24, Static29.anInt481);
				Static449.anInt7753++;
			}
			if (Static449.anInt7753 == 1) {
				if (Static152.aClass159_3.anInt4271 == 2) {
					this.method752(1000);
					return;
				}
				if (Static152.aClass159_3.anInt4271 == 1) {
					Static449.anInt7753++;
				}
			}
			if (Static449.anInt7753 == 2) {
				Static83.aClass114_7 = new Class114((Socket) Static152.aClass159_3.anObject8, Static403.aClass42_6);
				@Pc(194) Class1_Sub14 local194 = new Class1_Sub14(5);
				local194.method4553(Static121.aClass44_2.anInt793);
				local194.method4522(588);
				Static83.aClass114_7.method2497(5, local194.aByteArray65);
				Static449.anInt7753++;
				Static86.aLong50 = Static107.method1707();
			}
			if (Static449.anInt7753 == 3) {
				if (Static40.anInt629 == 0 || Static40.anInt629 == 5 || Static83.aClass114_7.method2495() > 0) {
					@Pc(240) int local240 = Static83.aClass114_7.method2499();
					if (local240 != 0) {
						this.method752(local240);
						return;
					}
					Static449.anInt7753++;
				} else if (Static107.method1707() - Static86.aLong50 > 30000L) {
					this.method752(1001);
					return;
				}
			}
			if (Static449.anInt7753 == 4) {
				@Pc(284) boolean local284 = Static40.anInt629 == 5 || Static40.anInt629 == 10 || Static40.anInt629 == 28;
				Static125.aClass164_2.method3587(!local284, Static83.aClass114_7);
				Static83.aClass114_7 = null;
				Static449.anInt7753 = 0;
				Static152.aClass159_3 = null;
			}
		} catch (@Pc(301) IOException local301) {
			this.method752(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method724() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static28.method391();
		Static368.aClass119_3 = new Class119(Static403.aClass42_6);
		Static125.aClass164_2 = new Class164();
		if (Static153.aClass174_7 != Static191.aClass174_5) {
			Static334.aByteArrayArray25 = new byte[50][];
		}
		Static327.aClass230_Sub1_1 = new Class230_Sub1(Static403.aClass42_6);
		if (Static191.aClass174_5 == Static153.aClass174_7) {
			Static94.aString34 = this.getCodeBase().getHost();
			Static4.anInt147 = 443;
			Static369.anInt6689 = 43594;
		} else if (Static81.method1174(Static153.aClass174_7)) {
			Static94.aString34 = this.getCodeBase().getHost();
			Static369.anInt6689 = Static221.anInt7649 + 40000;
			Static4.anInt147 = Static221.anInt7649 + 50000;
		} else if (Static153.aClass174_7 == Static108.aClass174_2) {
			Static94.aString34 = "127.0.0.1";
			Static369.anInt6689 = Static221.anInt7649 + 40000;
			Static4.anInt147 = Static221.anInt7649 + 50000;
		}
		Static168.anInt3019 = Static369.anInt6689;
		Static11.anInt231 = Static4.anInt147;
		Static63.aString24 = Static94.aString34;
		Static401.anInt7129 = Static369.anInt6689;
		Static29.anInt481 = Static401.anInt7129;
		if (Static48.anInt770 == 3) {
			Static20.anInt299 = Static221.anInt7649;
		}
		Static242.aShortArray75 = Static404.aShortArray114 = Static207.aShortArray56 = Static106.aShortArray13 = new short[256];
		if (Static92.aClass169_1 == Static325.aClass169_2) {
			Static68.aShortArrayArray2 = Static29.aShortArrayArray1;
			Static207.aShortArrayArray3 = Static207.aShortArrayArray4;
			Static19.anInt296 = 16777215;
			Static324.aShortArray98 = Static338.aShortArray99;
			Static18.anInt291 = 0;
			Static54.aBoolean82 = true;
			Static396.aShortArray112 = Static234.aShortArray65;
		} else {
			Static68.aShortArrayArray2 = Static263.aShortArrayArray5;
			Static207.aShortArrayArray3 = Static323.aShortArrayArray7;
			Static396.aShortArray112 = Static47.aShortArray9;
			Static324.aShortArray98 = Static218.aShortArray57;
		}
		Static254.aClass10_1 = Static26.method372(Static159.aCanvas3);
		Static38.aClass32_1 = Static397.method5469(Static159.aCanvas3);
		Static386.aClass224_1 = Static65.method977();
		if (Static386.aClass224_1 != null) {
			Static386.aClass224_1.method5336(Static159.aCanvas3);
		}
		Static184.anInt3445 = Static48.anInt770;
		try {
			if (Static403.aClass42_6.aClass110_2 != null) {
				Static39.aClass124_1 = new Class124(Static403.aClass42_6.aClass110_2, 5200, 0);
				for (@Pc(170) int local170 = 0; local170 < 30; local170++) {
					Static174.aClass124Array1[local170] = new Class124(Static403.aClass42_6.aClass110Array1[local170], 6000, 0);
				}
				Static284.aClass124_5 = new Class124(Static403.aClass42_6.aClass110_1, 6000, 0);
				Static123.aClass141_1 = new Class141(255, Static39.aClass124_1, Static284.aClass124_5, 500000);
				Static272.aClass124_4 = new Class124(Static403.aClass42_6.aClass110_3, 24, 0);
				Static403.aClass42_6.aClass110_3 = null;
				Static403.aClass42_6.aClass110_2 = null;
				Static403.aClass42_6.aClass110Array1 = null;
				Static403.aClass42_6.aClass110_1 = null;
			}
		} catch (@Pc(228) IOException local228) {
			Static272.aClass124_4 = null;
			Static284.aClass124_5 = null;
			Static123.aClass141_1 = null;
			Static39.aClass124_1 = null;
		}
		if (Static153.aClass174_7 != Static191.aClass174_5) {
			Static356.aBoolean529 = true;
		}
		Static90.aString32 = (Static325.aClass169_2 == Static392.aClass169_3 ? Static401.aClass96_101 : Static153.aClass96_76).method1935(Static389.anInt7061);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method719() {
		if (Static330.aBoolean487) {
			Static51.method746();
		}
		if (Static447.aClass121_11 != null) {
			Static447.aClass121_11.method4598();
		}
		if (Static432.aFrame2 != null) {
			Static131.method2036(Static432.aFrame2, Static403.aClass42_6);
			Static432.aFrame2 = null;
		}
		if (Static169.aClass114_4 != null) {
			Static169.aClass114_4.method2496();
			Static169.aClass114_4 = null;
		}
		if (Static386.aClass224_1 != null) {
			Static386.aClass224_1.method5334(Static159.aCanvas3);
		}
		Static386.aClass224_1 = null;
		Static325.method4684();
		Static125.aClass164_2.method3589();
		Static368.aClass119_3.method2636();
		if (Static438.aClass268_1 != null) {
			Static438.aClass268_1.method5994();
			Static438.aClass268_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method745() {
		Static384.anInt6843++;
		Static130.method3751(-1, -1, null);
		Static296.method4063(-1, null, -1);
		Static175.method4328();
		Static270.anInt2350++;
		for (@Pc(32) int local32 = 0; local32 < 32768; local32++) {
			@Pc(38) Class47_Sub1_Sub5_Sub1 local38 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local32];
			if (local38 != null) {
				@Pc(44) byte local44 = local38.aClass196_1.aByte87;
				if ((local44 & 0x1) != 0) {
					@Pc(55) int local55 = local38.method4317();
					@Pc(79) int local79;
					if ((local44 & 0x2) != 0 && local38.anInt5421 == 0 && Math.random() * 1000.0D < 10.0D) {
						local79 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(87) int local87 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local79 != 0 || local87 != 0) {
							@Pc(104) int local104 = local38.anIntArray407[0] + local79;
							@Pc(111) int local111 = local87 + local38.anIntArray408[0];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > Static80.anInt6558 - local55 - 1) {
								local104 = Static80.anInt6558 - local55 - 1;
							}
							if (local111 < 0) {
								local111 = 0;
							} else if (Static104.anInt2048 - local55 - 1 < local111) {
								local111 = Static104.anInt2048 - local55 - 1;
							}
							@Pc(191) int local191 = Static272.method3778(local55, Static299.anIntArray382, 0, local38.anIntArray408[0], 0, true, local104, local111, -1, local55, local55, Static429.anIntArray191, local38.anIntArray407[0], Static20.aClass181Array2[local38.aByte97]);
							if (local191 > 0) {
								if (local191 > 9) {
									local191 = 9;
								}
								for (@Pc(200) int local200 = 0; local200 < local191; local200++) {
									local38.anIntArray407[local200] = Static429.anIntArray191[local191 - local200 - 1];
									local38.anIntArray408[local200] = Static299.anIntArray382[local191 - local200 - 1];
									local38.aByteArray63[local200] = 1;
								}
								local38.anInt5421 = local191;
							}
						}
					}
					Static288.method3961(true, local38);
					local79 = Static111.method1741(local38);
					Static35.method477(Static437.anInt7634, local79, Static105.anInt2074, local38);
					Static213.method3213(local38);
				}
			}
		}
		if (Static403.anInt7143 == 0 && Static312.anInt5262 == 0) {
			if (Static57.anInt883 == 2) {
				Static338.method4861();
			} else {
				Static413.method5599();
			}
			if (Static302.anInt5030 >> 7 < 14 || Static80.anInt6558 - 14 <= Static302.anInt5030 >> 7 || Static4.anInt149 >> 7 < 14 || Static104.anInt2048 - 14 <= Static4.anInt149 >> 7) {
				Static16.method236();
			}
		}
		while (true) {
			@Pc(316) Class1_Sub16 local316;
			@Pc(321) Class229 local321;
			@Pc(334) Class229 local334;
			do {
				local316 = (Class1_Sub16) Static306.aClass142_31.method3196();
				if (local316 == null) {
					while (true) {
						do {
							local316 = (Class1_Sub16) Static135.aClass142_16.method3196();
							if (local316 == null) {
								while (true) {
									do {
										local316 = (Class1_Sub16) Static38.aClass142_8.method3196();
										if (local316 == null) {
											if (Static206.aClass229_6 != null) {
												Static420.method5672();
											}
											if (Static123.anInt2333 % 1500 == 0) {
												Static443.method5920();
											}
											Static156.method2490();
											if (Static330.aBoolean487 && Static443.aLong233 < Static107.method1707() - 60000L) {
												Static51.method746();
												return;
											}
											return;
										}
										local321 = local316.aClass229_4;
										if (local321.anInt6860 < 0) {
											break;
										}
										local334 = Static203.method1670(local321.anInt6882);
									} while (local334 == null || local334.aClass229Array2 == null || local321.anInt6860 >= local334.aClass229Array2.length || local334.aClass229Array2[local321.anInt6860] != local321);
									Static354.method5070(local316);
								}
							}
							local321 = local316.aClass229_4;
							if (local321.anInt6860 < 0) {
								break;
							}
							local334 = Static203.method1670(local321.anInt6882);
						} while (local334 == null || local334.aClass229Array2 == null || local334.aClass229Array2.length <= local321.anInt6860 || local321 != local334.aClass229Array2[local321.anInt6860]);
						Static354.method5070(local316);
					}
				}
				local321 = local316.aClass229_4;
				if (local321.anInt6860 < 0) {
					break;
				}
				local334 = Static203.method1670(local321.anInt6882);
			} while (local334 == null || local334.aClass229Array2 == null || local334.aClass229Array2.length <= local321.anInt6860 || local321 != local334.aClass229Array2[local321.anInt6860]);
			Static354.method5070(local316);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method752(@OriginalArg(0) int arg0) {
		Static152.aClass159_3 = null;
		Static449.anInt7753 = 0;
		Static83.aClass114_7 = null;
		Static125.aClass164_2.anInt4318++;
		Static125.aClass164_2.anInt4319 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method736() {
		if (Static40.anInt629 == 1000) {
			return;
		}
		@Pc(21) long local21 = Static143.method2300() / 1000000L - Static344.aLong182;
		Static344.aLong182 = Static143.method2300() / 1000000L;
		@Pc(29) boolean local29 = Static212.method3190();
		if (local29 && Static292.aBoolean390 && Static145.aClass118_4 != null) {
			Static145.aClass118_4.method3934();
		}
		if (Static40.anInt629 == 30 || Static40.anInt629 == 10) {
			if (Static320.aLong161 != 0L && Static107.method1707() > Static320.aLong161) {
				Static230.method3353(Static327.aClass230_Sub1_1.anInt7303, false, Static327.aClass230_Sub1_1.anInt7305, Static174.method2768());
			} else if (!Static447.aClass121_11.method4610() && Static334.aBoolean490) {
				Static90.method1404();
			}
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static432.aFrame2 == null) {
			@Pc(86) Container local86;
			if (Static303.aFrame1 == null) {
				local86 = Static403.aClass42_6.anApplet1;
			} else {
				local86 = Static303.aFrame1;
			}
			local94 = local86.getSize().width;
			local98 = local86.getSize().height;
			if (Static303.aFrame1 == local86) {
				@Pc(104) Insets local104 = Static303.aFrame1.getInsets();
				local98 -= local104.top + local104.bottom;
				local94 -= local104.left + local104.right;
			}
			if (Static90.anInt1737 != local94 || Static356.anInt6526 != local98) {
				if (Static447.aClass121_11 == null || Static447.aClass121_11.method4626()) {
					Static28.method391();
				} else {
					Static90.anInt1737 = local94;
					Static356.anInt6526 = local98;
				}
				Static320.aLong161 = Static107.method1707() + 500L;
			}
		}
		if (Static432.aFrame2 != null && !Static135.aBoolean196 && (Static40.anInt629 == 30 || Static40.anInt629 == 10)) {
			Static230.method3353(-1, false, -1, Static327.aClass230_Sub1_1.anInt7301);
		}
		@Pc(173) boolean local173 = false;
		if (Static24.aBoolean22) {
			Static24.aBoolean22 = false;
			local173 = true;
		}
		if (local173) {
			Static299.method4092();
		}
		if (Static447.aClass121_11 != null && Static447.aClass121_11.method4610() || Static174.method2768() != 1) {
			Static197.method3044();
		}
		if (Static40.anInt629 == 0) {
			Static272.method3776(Static319.aColorArray6[Static379.anInt6823], Static75.anInt1425, Static403.aColorArray7[Static379.anInt6823], local173, Static159.aString45, Static429.aColorArray2[Static379.anInt6823]);
		} else if (Static40.anInt629 == 5) {
			Static170.method2641(Static447.aClass121_11, Static319.aColorArray6[Static379.anInt6823].getRGB(), Static237.aClass4_5, Static429.aColorArray2[Static379.anInt6823].getRGB(), local173 | Static447.aClass121_11.method4610(), Static403.aColorArray7[Static379.anInt6823].getRGB());
		} else if (Static40.anInt629 == 10) {
			Static43.method574();
		} else if (Static40.anInt629 == 25 || Static40.anInt629 == 28) {
			if (Static373.anInt6744 == 1) {
				if (Static374.anInt6752 < Static442.anInt7684) {
					Static374.anInt6752 = Static442.anInt7684;
				}
				local94 = (Static374.anInt6752 - Static442.anInt7684) * 50 / Static374.anInt6752;
				Static210.method3170(true, Static293.aClass96_81.method1935(Static389.anInt7061) + "<br>(" + local94 + "%)", Static199.aClass4_4);
			} else if (Static373.anInt6744 == 2) {
				if (Static43.anInt678 > Static177.anInt3316) {
					Static177.anInt3316 = Static43.anInt678;
				}
				local94 = (Static177.anInt3316 - Static43.anInt678) * 50 / Static177.anInt3316 + 50;
				Static210.method3170(true, Static293.aClass96_81.method1935(Static389.anInt7061) + "<br>(" + local94 + "%)", Static199.aClass4_4);
			} else {
				Static210.method3170(true, Static293.aClass96_81.method1935(Static389.anInt7061), Static199.aClass4_4);
			}
		} else if (Static40.anInt629 == 30) {
			Static164.method2556(local21);
		} else if (Static40.anInt629 == 40) {
			Static210.method3170(true, Static226.aClass96_50.method1935(Static389.anInt7061) + "<br>" + Static167.aClass96_45.method1935(Static389.anInt7061), Static199.aClass4_4);
		}
		if (Static41.anInt661 == 3) {
			for (local94 = 0; local94 < Static346.anInt6355; local94++) {
				@Pc(394) Rectangle local394 = Class1_Sub31.aRectangleArray2[local94];
				if (Static105.aBooleanArray7[local94]) {
					Static447.aClass121_11.method4600(local394.width, local394.x, -1996553985, local394.height, local394.y);
				} else if (Static41.aBooleanArray2[local94]) {
					Static447.aClass121_11.method4600(local394.width, local394.x, -1996554240, local394.height, local394.y);
				}
			}
		}
		if (Static177.method2860()) {
			Static409.method5545(Static447.aClass121_11);
		}
		if ((Static40.anInt629 == 30 || Static40.anInt629 == 10) && Static41.anInt661 == 0 && Static174.method2768() == 1 && !local173 && Static48.aString11.equals("1.1")) {
			local94 = 0;
			for (local98 = 0; local98 < Static346.anInt6355; local98++) {
				if (Static41.aBooleanArray2[local98]) {
					Static41.aBooleanArray2[local98] = false;
					Static168.aRectangleArray1[local94++] = Class1_Sub31.aRectangleArray2[local98];
				}
			}
			Static447.aClass121_11.method4590(Static168.aRectangleArray1, local94);
		} else if (Static40.anInt629 != 0) {
			Static447.aClass121_11.method4602();
			for (local94 = 0; local94 < Static346.anInt6355; local94++) {
				Static41.aBooleanArray2[local94] = false;
			}
		}
		if (Static327.aClass230_Sub1_1.anInt7309 == 0) {
			Static366.method5214(15L);
		} else if (Static327.aClass230_Sub1_1.anInt7309 == 1) {
			Static366.method5214(10L);
		} else if (Static327.aClass230_Sub1_1.anInt7309 == 2) {
			Static366.method5214(5L);
		} else if (Static327.aClass230_Sub1_1.anInt7309 == 3) {
			Static366.method5214(2L);
		}
		if (Static309.aBoolean420) {
			Static254.method3624();
		}
		if (Static327.aClass230_Sub1_1.aBoolean608 && Static40.anInt629 == 10 && Static246.anInt4292 != -1) {
			Static327.aClass230_Sub1_1.aBoolean608 = false;
			Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method720() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method729()) {
			return;
		}
		Static221.anInt7649 = Integer.parseInt(this.getParameter("worldid"));
		Static153.aClass174_7 = Static201.method3102(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static81.method1174(Static153.aClass174_7) && Static191.aClass174_5 != Static153.aClass174_7) {
			Static153.aClass174_7 = Static191.aClass174_5;
		}
		Static311.aClass182_4 = Static51.method741(Integer.parseInt(this.getParameter("modewhat")));
		if (Static311.aClass182_4 != Static204.aClass182_1 && Static311.aClass182_4 != Static264.aClass182_2 && Static414.aClass182_5 != Static311.aClass182_4) {
			Static311.aClass182_4 = Static414.aClass182_5;
		}
		try {
			Static389.anInt7061 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static389.anInt7061 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static310.aBoolean422 = true;
		} else {
			Static310.aBoolean422 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static189.aBoolean273 = true;
		} else {
			Static189.aBoolean273 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static388.aBoolean610 = true;
		} else {
			Static388.aBoolean610 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static325.aClass169_2 = Static92.aClass169_1;
		} else {
			Static325.aClass169_2 = Static392.aClass169_3;
		}
		try {
			Static311.anInt6534 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static311.anInt6534 = 0;
		}
		Static162.aString46 = this.getParameter("quiturl");
		Static87.aString67 = this.getParameter("settings");
		if (Static87.aString67 == null) {
			Static87.aString67 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static40.anInt625 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static40.anInt625 = 0;
			}
		}
		Static379.anInt6823 = Integer.parseInt(this.getParameter("colourid"));
		if (Static379.anInt6823 < 0 || Static379.anInt6823 >= Static429.aColorArray2.length) {
			Static379.anInt6823 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static42.aBoolean412 = true;
			Static97.aBoolean142 = true;
		}
		if (Static392.aClass169_3 == Static325.aClass169_2) {
			Static73.anInt1378 = 503;
			Static170.anInt3041 = 765;
		} else if (Static92.aClass169_1 == Static325.aClass169_2) {
			Static170.anInt3041 = 640;
			Static73.anInt1378 = 480;
		}
		Static451.aClient1 = this;
		this.method731(Static73.anInt1378, Static170.anInt3041, Static311.aClass182_4.method3908() + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
	private void method756(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method4548();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(32) int[] local32 = Static329.anIntArray441 = new int[6];
					local32[0] = local15.method4498();
					local32[1] = local15.method4498();
					local32[2] = local15.method4498();
					local32[3] = local15.method4498();
					local32[4] = local15.method4498();
					local32[5] = local15.method4498();
				} else {
					@Pc(82) int local82;
					@Pc(87) int local87;
					if (local19 == 4) {
						local82 = local15.method4548();
						Static268.anIntArray357 = new int[local82];
						for (local87 = 0; local87 < local82; local87++) {
							Static268.anIntArray357[local87] = local15.method4498();
							if (Static268.anIntArray357[local87] == 65535) {
								Static268.anIntArray357[local87] = -1;
							}
						}
					} else if (local19 == 5) {
						local82 = local15.method4548();
						Static14.anIntArray19 = new int[local82];
						for (local87 = 0; local87 < local82; local87++) {
							Static14.anIntArray19[local87] = local15.method4498();
							if (Static14.anIntArray19[local87] == 65535) {
								Static14.anIntArray19[local87] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method757() {
		@Pc(7) boolean local7 = Static125.aClass164_2.method3574();
		if (!local7) {
			this.method743();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method758() {
		@Pc(6) int local6;
		if (!Static327.aClass230_Sub1_1.aBoolean608) {
			for (local6 = 0; local6 < Static64.anInt1162; local6++) {
				if (Static209.aClass22Array3[local6].method366() == 's' || Static209.aClass22Array3[local6].method366() == 'S') {
					Static327.aClass230_Sub1_1.aBoolean608 = true;
					break;
				}
			}
		}
		@Pc(48) int local48;
		if (Static136.anInt2491 == 0) {
			@Pc(39) Runtime local39 = Runtime.getRuntime();
			local48 = (int) ((local39.totalMemory() - local39.freeMemory()) / 1024L);
			@Pc(51) long local51 = Static107.method1707();
			if (Static281.aLong138 == 0L) {
				Static281.aLong138 = local51;
			}
			if (local48 > 16384 && local51 - Static281.aLong138 < 5000L) {
				if (local51 - Static85.aLong49 > 1000L) {
					System.gc();
					Static85.aLong49 = local51;
				}
				Static159.aString45 = Static441.aClass96_111.method1935(Static389.anInt7061);
				Static75.anInt1425 = 5;
			} else {
				Static159.aString45 = Static43.aClass96_17.method1935(Static389.anInt7061);
				Static75.anInt1425 = 5;
				Static136.anInt2491 = 10;
			}
		} else if (Static136.anInt2491 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static20.aClass181Array2[local6] = Static36.method5941(Static80.anInt6558, Static104.anInt2048);
			}
			Static159.aString45 = Static33.aClass96_10.method1935(Static389.anInt7061);
			Static75.anInt1425 = 10;
			Static136.anInt2491 = 20;
		} else if (Static136.anInt2491 == 20) {
			if (Static267.aClass172_1 == null) {
				Static267.aClass172_1 = new Class172(Static125.aClass164_2, Static368.aClass119_3);
			}
			if (Static267.aClass172_1.method3698()) {
				Static188.aClass109_52 = Static198.method3051(true, false, 0);
				Static368.aClass109_83 = Static198.method3051(true, false, 1);
				Static225.aClass109_57 = Static198.method3051(true, false, 2);
				Static19.aClass109_4 = Static198.method3051(true, false, 3);
				Static453.aClass109_44 = Static198.method3051(true, false, 4);
				Static162.aClass109_37 = Static198.method3051(true, true, 5);
				Static297.aClass109_69 = Static198.method3051(false, true, 6);
				Static172.aClass109_40 = Static198.method3051(true, false, 7);
				Static353.aClass109_79 = Static198.method3051(true, false, 8);
				Static279.aClass109_97 = Static198.method3051(true, false, 9);
				Static21.aClass109_7 = Static198.method3051(true, false, 10);
				Static21.aClass109_8 = Static198.method3051(true, false, 11);
				Static29.aClass109_14 = Static198.method3051(true, false, 12);
				Static381.aClass109_12 = Static198.method3051(true, false, 13);
				Static360.aClass109_80 = Static198.method3051(false, false, 14);
				Static263.aClass109_61 = Static198.method3051(true, false, 15);
				Static134.aClass109_35 = Static198.method3051(true, false, 16);
				Static221.aClass109_98 = Static198.method3051(true, false, 17);
				Static131.aClass109_31 = Static198.method3051(true, false, 18);
				Static388.aClass109_94 = Static198.method3051(true, false, 19);
				Static200.aClass109_53 = Static198.method3051(true, false, 20);
				Static173.aClass109_42 = Static198.method3051(true, false, 21);
				Static278.aClass109_95 = Static198.method3051(true, false, 22);
				Static44.aClass109_20 = Static198.method3051(true, true, 23);
				Static184.aClass109_48 = Static198.method3051(true, false, 24);
				Static222.aClass109_56 = Static198.method3051(true, false, 25);
				Static454.aClass109_100 = Static198.method3051(true, true, 26);
				Static116.aClass109_29 = Static198.method3051(true, false, 27);
				Static140.aClass109_36 = Static198.method3051(true, true, 28);
				Static369.aClass109_84 = Static198.method3051(true, false, 29);
				Static159.aString45 = Static77.aClass96_25.method1935(Static389.anInt7061);
				Static136.anInt2491 = 30;
				Static75.anInt1425 = 15;
			} else {
				Static159.aString45 = Static192.aClass96_54.method1935(Static389.anInt7061);
				Static75.anInt1425 = 12;
			}
		} else if (Static136.anInt2491 == 30) {
			local6 = 0;
			for (local48 = 0; local48 < 30; local48++) {
				local6 += Static171.aClass113_Sub1Array1[local48].method3796() * Static147.anIntArray240[local48] / 100;
			}
			if (local6 == 100) {
				Static159.aString45 = Static411.aClass96_104.method1935(Static389.anInt7061);
				Static75.anInt1425 = 20;
				Static368.method5239(Static353.aClass109_79);
				Static252.method3606(Static353.aClass109_79);
				Static136.anInt2491 = 40;
			} else {
				if (local6 != 0) {
					Static159.aString45 = Static150.aClass96_43.method1935(Static389.anInt7061) + local6 + "%";
				}
				Static75.anInt1425 = 20;
			}
		} else if (Static136.anInt2491 == 40) {
			if (Static140.aClass109_36.method2353()) {
				this.method756(Static140.aClass109_36.method2346(1));
				Static159.aString45 = Static196.aClass96_57.method1935(Static389.anInt7061);
				Static75.anInt1425 = 25;
				Static136.anInt2491 = 50;
			} else {
				Static159.aString45 = Static172.aClass96_46.method1935(Static389.anInt7061) + Static140.aClass109_36.method2332() + "%";
				Static75.anInt1425 = 25;
			}
		} else if (Static136.anInt2491 == 50) {
			Static1.method26();
			Static159.aString45 = Static278.aClass96_107.method1935(Static389.anInt7061);
			Static136.anInt2491 = 60;
			Static75.anInt1425 = 30;
		} else if (Static136.anInt2491 == 60) {
			local6 = Static204.method3114(Static353.aClass109_79, Static381.aClass109_12);
			local48 = Static363.method5164();
			if (local6 < local48) {
				Static159.aString45 = Static324.aClass96_91.method1935(Static389.anInt7061) + local6 * 100 / local48 + "%";
				Static75.anInt1425 = 35;
			} else {
				Static159.aString45 = Static28.aClass96_7.method1935(Static389.anInt7061);
				Static75.anInt1425 = 35;
				Static136.anInt2491 = 70;
			}
		} else if (Static136.anInt2491 == 70) {
			local6 = Static120.method1879(Static353.aClass109_79);
			local48 = Static197.method3042();
			if (local6 < local48) {
				Static159.aString45 = Static224.aClass96_62.method1935(Static389.anInt7061) + local6 * 100 / local48 + "%";
				Static75.anInt1425 = 40;
			} else {
				Static159.aString45 = Static84.aClass96_96.method1935(Static389.anInt7061);
				Static75.anInt1425 = 40;
				Static136.anInt2491 = 80;
			}
		} else if (Static136.anInt2491 == 80) {
			if (Static454.aClass109_100.method2353()) {
				Static80.anInterface5_18 = new Class184(Static454.aClass109_100, Static279.aClass109_97, Static353.aClass109_79);
				Static159.aString45 = Static209.aClass96_77.method1935(Static389.anInt7061);
				Static136.anInt2491 = 90;
				Static75.anInt1425 = 45;
			} else {
				Static159.aString45 = Static301.aClass96_85.method1935(Static389.anInt7061) + Static454.aClass109_100.method2332() + "%";
				Static75.anInt1425 = 45;
			}
		} else if (Static136.anInt2491 == 90) {
			Static159.aString45 = Static176.aClass96_47.method1935(Static389.anInt7061);
			Static136.anInt2491 = 95;
			Static75.anInt1425 = 50;
		} else if (Static136.anInt2491 == 95) {
			if (Static327.aClass230_Sub1_1.aBoolean608) {
				Static327.aClass230_Sub1_1.anInt7312 = 0;
				Static327.aClass230_Sub1_1.anInt7313 = 0;
				Static327.aClass230_Sub1_1.anInt7294 = 0;
				Static327.aClass230_Sub1_1.anInt7301 = 1;
				Static327.aClass230_Sub1_1.anInt7307 = 0;
			}
			Static327.aClass230_Sub1_1.aBoolean608 = true;
			Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
			Static213.method3203(Static327.aClass230_Sub1_1.anInt7313, false);
			Static159.aString45 = Static183.aClass96_51.method1935(Static389.anInt7061);
			Static136.anInt2491 = 100;
			Static75.anInt1425 = 55;
		} else if (Static136.anInt2491 == 100) {
			Static83.method3986(Static447.aClass121_11, Static353.aClass109_79, Static381.aClass109_12);
			Static159.aString45 = Static97.aClass96_36.method1935(Static389.anInt7061);
			Static75.anInt1425 = 60;
			Static169.method2637(5);
			Static136.anInt2491 = 110;
		} else if (Static136.anInt2491 == 110) {
			Static225.aClass109_57.method2353();
			local6 = Static225.aClass109_57.method2332();
			Static134.aClass109_35.method2353();
			local6 += Static134.aClass109_35.method2332();
			Static221.aClass109_98.method2353();
			local6 += Static221.aClass109_98.method2332();
			Static131.aClass109_31.method2353();
			local6 += Static131.aClass109_31.method2332();
			Static388.aClass109_94.method2353();
			local6 += Static388.aClass109_94.method2332();
			Static200.aClass109_53.method2353();
			local6 += Static200.aClass109_53.method2332();
			Static173.aClass109_42.method2353();
			local6 += Static173.aClass109_42.method2332();
			Static278.aClass109_95.method2353();
			local6 += Static278.aClass109_95.method2332();
			Static184.aClass109_48.method2353();
			local6 += Static184.aClass109_48.method2332();
			Static222.aClass109_56.method2353();
			local6 += Static222.aClass109_56.method2332();
			Static116.aClass109_29.method2353();
			local6 += Static116.aClass109_29.method2332();
			Static369.aClass109_84.method2353();
			local6 += Static369.aClass109_84.method2332();
			if (local6 < 1200) {
				Static159.aString45 = Static403.aClass96_102.method1935(Static389.anInt7061) + local6 / 12 + "%";
				Static75.anInt1425 = 65;
			} else {
				Static192.aClass75_1 = new Class75(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static117.aClass81_1 = new Class81(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static394.aClass86_2 = new Class86(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57, Static353.aClass109_79);
				Static178.aClass138_1 = new Class138(Static325.aClass169_2, Static389.anInt7061, Static221.aClass109_98);
				Static135.aClass123_2 = new Class123(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static121.aClass104_2 = new Class104(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static160.aClass122_5 = new Class122(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57, Static172.aClass109_40);
				Static308.aClass197_3 = new Class197(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static40.aClass165_1 = new Class165(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static251.aClass207_2 = new Class207(Static325.aClass169_2, Static389.anInt7061, true, Static134.aClass109_35, Static172.aClass109_40);
				Static86.aClass103_2 = new Class103(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57, Static353.aClass109_79);
				Static50.aClass177_1 = new Class177(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57, Static353.aClass109_79);
				Static268.aClass26_1 = new Class26(Static325.aClass169_2, Static389.anInt7061, true, Static131.aClass109_31, Static172.aClass109_40);
				Static388.aClass193_3 = new Class193(Static325.aClass169_2, Static389.anInt7061, true, Static192.aClass75_1, Static388.aClass109_94, Static172.aClass109_40);
				Static183.aClass30_1 = new Class30(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static322.aClass45_5 = new Class45(Static325.aClass169_2, Static389.anInt7061, Static200.aClass109_53, Static188.aClass109_52, Static368.aClass109_83);
				Static377.aClass243_1 = new Class243(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static347.aClass163_1 = new Class163(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static294.aClass125_2 = new Class125(Static325.aClass169_2, Static389.anInt7061, Static173.aClass109_42, Static172.aClass109_40);
				Static96.aClass39_1 = new Class39(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static173.aClass186_1 = new Class186(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static316.aClass153_1 = new Class153(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static82.aClass260_1 = new Class260(Static325.aClass169_2, Static389.anInt7061, Static278.aClass109_95);
				Static157.aClass255_1 = new Class255(Static325.aClass169_2, Static389.anInt7061, Static225.aClass109_57);
				Static121.method1883(Static381.aClass109_12, Static19.aClass109_4, Static353.aClass109_79, Static172.aClass109_40);
				Static58.method895(Static369.aClass109_84);
				Static442.aClass24_1 = new Class24(Static389.anInt7061, Static184.aClass109_48, Static222.aClass109_56);
				Static42.aClass228_5 = new Class228(Static389.anInt7061, Static184.aClass109_48, Static222.aClass109_56, new Class79());
				Static159.aString45 = Static219.aClass96_61.method1935(Static389.anInt7061);
				Static75.anInt1425 = 65;
				Static392.method5429();
				Static251.aClass207_2.method4980(!Static327.aClass230_Sub1_1.method5644(Static146.anInt2664));
				Static237.aClass80_1 = new Class80();
				Static366.method5216();
				Static215.method3226(Static116.aClass109_29);
				Static208.method3167(Static172.aClass109_40, Static80.anInterface5_18);
				Static136.anInt2491 = 120;
			}
		} else if (Static136.anInt2491 == 120) {
			local6 = Static338.method4863(Static353.aClass109_79);
			local48 = Static355.method5093();
			if (local6 < local48) {
				Static159.aString45 = Static294.aClass96_82.method1935(Static389.anInt7061) + local6 * 100 / local48 + "%";
				Static75.anInt1425 = 70;
			} else {
				Static298.method4070(Static447.aClass121_11, Static353.aClass109_79);
				Static357.method5116(Static407.aClass78Array13);
				Static159.aString45 = Static89.aClass96_29.method1935(Static389.anInt7061);
				Static136.anInt2491 = 130;
				Static75.anInt1425 = 70;
			}
		} else if (Static136.anInt2491 == 130) {
			if (Static21.aClass109_7.method2331("", "huffman")) {
				@Pc(1218) Class217 local1218 = new Class217(Static21.aClass109_7.method2340("", "huffman"));
				Static220.method2315(local1218);
				Static159.aString45 = Static232.aClass96_63.method1935(Static389.anInt7061);
				Static75.anInt1425 = 75;
				Static136.anInt2491 = 140;
			} else {
				Static159.aString45 = Static342.aClass96_97.method1935(Static389.anInt7061) + "0%";
				Static75.anInt1425 = 75;
			}
		} else if (Static136.anInt2491 == 140) {
			if (Static19.aClass109_4.method2353()) {
				Static159.aString45 = Static79.aClass96_26.method1935(Static389.anInt7061);
				Static136.anInt2491 = 150;
				Static75.anInt1425 = 80;
			} else {
				Static159.aString45 = Static181.aClass96_48.method1935(Static389.anInt7061) + Static19.aClass109_4.method2332() + "%";
				Static75.anInt1425 = 80;
			}
		} else if (Static136.anInt2491 == 150) {
			if (Static29.aClass109_14.method2353()) {
				Static159.aString45 = Static81.aClass96_27.method1935(Static389.anInt7061);
				Static75.anInt1425 = 82;
				Static136.anInt2491 = 160;
			} else {
				Static159.aString45 = Static130.aClass96_74.method1935(Static389.anInt7061) + Static29.aClass109_14.method2332() + "%";
				Static75.anInt1425 = 82;
			}
		} else if (Static136.anInt2491 == 160) {
			if (Static381.aClass109_12.method2353()) {
				Static159.aString45 = Static184.aClass96_52.method1935(Static389.anInt7061);
				Static136.anInt2491 = 170;
				Static75.anInt1425 = 85;
			} else {
				Static159.aString45 = Static184.aClass96_52.method1935(Static389.anInt7061) + Static381.aClass109_12.method2332() + "%";
				Static75.anInt1425 = 85;
			}
		} else if (Static136.anInt2491 == 170) {
			if (Static44.aClass109_20.method2342("details")) {
				Static350.method5195(Static44.aClass109_20, Static135.aClass123_2, Static121.aClass104_2, Static251.aClass207_2, Static86.aClass103_2, Static50.aClass177_1, Static237.aClass80_1);
				Static159.aString45 = Static6.aClass96_2.method1935(Static389.anInt7061);
				Static75.anInt1425 = 89;
				Static136.anInt2491 = 180;
			} else {
				Static159.aString45 = Static31.aClass96_9.method1935(Static389.anInt7061) + Static44.aClass109_20.method2323("details") + "%";
				Static75.anInt1425 = 87;
			}
		} else if (Static136.anInt2491 == 180) {
			local6 = Static65.method983();
			if (local6 == -1) {
				Static159.aString45 = Static76.aClass96_24.method1935(Static389.anInt7061);
				Static75.anInt1425 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method722("worldlistfull");
				Static169.method2637(1000);
			} else if (Static444.aBoolean652) {
				Static159.aString45 = Static195.aClass96_56.method1935(Static389.anInt7061);
				Static75.anInt1425 = 90;
				Static136.anInt2491 = 190;
			} else {
				this.method722("worldlistio_" + local6);
				Static169.method2637(1000);
			}
		} else if (Static136.anInt2491 == 190) {
			Static103.anIntArray102 = new int[Static316.aClass153_1.anInt4054];
			Static431.aStringArray43 = new String[Static173.aClass186_1.anInt4885];
			Static342.aBooleanArray23 = new boolean[Static316.aClass153_1.anInt4054];
			for (local6 = 0; local6 < Static316.aClass153_1.anInt4054; local6++) {
				if (Static316.aClass153_1.method3380(local6).anInt4062 == 0) {
					Static342.aBooleanArray23[local6] = true;
					Static87.anInt5505++;
				}
				Static103.anIntArray102[local6] = -1;
			}
			Static299.method4093();
			Static159.anInt2864 = Static19.aClass109_4.method2343("loginscreen");
			Static162.aClass109_37.method2326(false);
			Static297.aClass109_69.method2326(true);
			Static353.aClass109_79.method2326(true);
			Static381.aClass109_12.method2326(true);
			Static21.aClass109_7.method2326(true);
			Static19.aClass109_4.method2326(true);
			Static309.aBoolean420 = true;
			Static225.aClass109_57.anInt2631 = 2;
			Static221.aClass109_98.anInt2631 = 2;
			Static134.aClass109_35.anInt2631 = 2;
			Static131.aClass109_31.anInt2631 = 2;
			Static388.aClass109_94.anInt2631 = 2;
			Static200.aClass109_53.anInt2631 = 2;
			Static173.aClass109_42.anInt2631 = 2;
			Static230.method3353(-1, false, -1, Static327.aClass230_Sub1_1.anInt7301);
			Static159.aString45 = Static433.aClass96_108.method1935(Static389.anInt7061);
			Static136.anInt2491 = 200;
			Static75.anInt1425 = 95;
		} else if (Static136.anInt2491 == 200) {
			Static309.method4240(true);
		}
	}
}
