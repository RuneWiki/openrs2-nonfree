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

	static {
		new Class159("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static301.method4953("argument count");
			}
			Static8.anInt195 = Integer.parseInt(arg0[0]);
			Static80.anInt2116 = 2;
			if (arg0[1].equals("live")) {
				Static110.anInt2697 = 0;
			} else if (arg0[1].equals("rc")) {
				Static110.anInt2697 = 1;
			} else if (arg0[1].equals("wip")) {
				Static110.anInt2697 = 2;
			} else {
				Static301.method4953("modewhat");
			}
			Static180.anInt3835 = Static347.method5530(arg0[2]);
			if (Static180.anInt3835 == -1) {
				if (arg0[2].equals("english")) {
					Static180.anInt3835 = 0;
				} else if (arg0[2].equals("german")) {
					Static180.anInt3835 = 1;
				} else {
					Static301.method4953("language");
				}
			}
			Static100.aBoolean183 = false;
			Static302.aBoolean427 = false;
			if (arg0[3].equals("game0")) {
				Static330.anInt6312 = 0;
			} else if (arg0[3].equals("game1")) {
				Static330.anInt6312 = 1;
			} else {
				Static301.method4953("game");
			}
			Static209.aString48 = "";
			Static160.anInt3457 = Static330.anInt6312;
			Static182.anInt3853 = 0;
			Static312.anInt6056 = 0;
			@Pc(121) client local121 = new client();
			Static76.aClient1 = local121;
			local121.method867(Static330.anInt6312 == 1 ? "stellardawn" : "runescape", Static110.anInt2697 + 32);
			Static308.aFrame2.setLocation(40, 40);
		} catch (@Pc(148) Exception local148) {
			Static289.method4874(null, local148);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method876() {
		if (Static147.aClass13_3.anInt343 > Static35.anInt972) {
			Static76.anInt1949 = (Static147.aClass13_3.anInt343 - 1) * 250;
			if (Static184.anInt3886 == Static206.anInt4324) {
				Static184.anInt3886 = Static328.anInt6269;
			} else {
				Static184.anInt3886 = Static206.anInt4324;
			}
			if (Static76.anInt1949 > 3000) {
				Static76.anInt1949 = 3000;
			}
			if (Static147.aClass13_3.anInt343 >= 2 && Static147.aClass13_3.anInt342 == 6) {
				this.method857("js5connect_outofdate");
				Static139.anInt3199 = 1000;
				return;
			}
			if (Static147.aClass13_3.anInt343 >= 4 && Static147.aClass13_3.anInt342 == -1) {
				this.method857("js5crc");
				Static139.anInt3199 = 1000;
				return;
			}
			if (Static147.aClass13_3.anInt343 >= 4 && (Static139.anInt3199 == 0 || Static139.anInt3199 == 5)) {
				if (Static147.aClass13_3.anInt342 == 7 || Static147.aClass13_3.anInt342 == 9) {
					this.method857("js5connect_full");
				} else if (Static147.aClass13_3.anInt342 > 0) {
					this.method857("js5connect");
				} else {
					this.method857("js5io");
				}
				Static139.anInt3199 = 1000;
				return;
			}
		}
		Static35.anInt972 = Static147.aClass13_3.anInt343;
		if (Static76.anInt1949 > 0) {
			Static76.anInt1949--;
			return;
		}
		try {
			if (Static251.anInt5138 == 0) {
				Static188.aClass185_4 = Static1.aClass134_7.method3760(Static184.anInt3886, Static309.aString62);
				Static251.anInt5138++;
			}
			if (Static251.anInt5138 == 1) {
				if (Static188.aClass185_4.anInt5682 == 2) {
					this.method879(1000);
					return;
				}
				if (Static188.aClass185_4.anInt5682 == 1) {
					Static251.anInt5138++;
				}
			}
			if (Static251.anInt5138 == 2) {
				Static255.aClass114_4 = new Class114((Socket) Static188.aClass185_4.anObject4, Static1.aClass134_7);
				@Pc(176) Class4_Sub11 local176 = new Class4_Sub11(5);
				local176.method3434(15);
				local176.method3452(566);
				Static255.aClass114_4.method3163(local176.aByteArray55, 5);
				Static251.anInt5138++;
				Static223.aLong142 = Static208.method3879();
			}
			if (Static251.anInt5138 == 3) {
				if (Static139.anInt3199 == 0 || Static139.anInt3199 == 5 || Static255.aClass114_4.method3161() > 0) {
					@Pc(216) int local216 = Static255.aClass114_4.method3170();
					if (local216 != 0) {
						this.method879(local216);
						return;
					}
					Static251.anInt5138++;
				} else if (Static208.method3879() - Static223.aLong142 > 30000L) {
					this.method879(1001);
					return;
				}
			}
			if (Static251.anInt5138 == 4) {
				@Pc(264) boolean local264 = Static139.anInt3199 == 5 || Static139.anInt3199 == 10 || Static139.anInt3199 == 28;
				Static147.aClass13_3.method289(!local264, Static255.aClass114_4);
				Static188.aClass185_4 = null;
				Static251.anInt5138 = 0;
				Static255.aClass114_4 = null;
			}
		} catch (@Pc(281) IOException local281) {
			this.method879(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method879(@OriginalArg(1) int arg0) {
		Static147.aClass13_3.anInt342 = arg0;
		Static251.anInt5138 = 0;
		Static188.aClass185_4 = null;
		Static147.aClass13_3.anInt343++;
		Static255.aClass114_4 = null;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	protected void method875() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static44.method880();
		Static220.aClass53_4 = new Class53(Static1.aClass134_7);
		Static147.aClass13_3 = new Class13();
		if (Static110.anInt2697 != 0) {
			Static223.aByteArrayArray17 = new byte[50][];
		}
		Static284.method4837(Static1.aClass134_7);
		if (Static80.anInt2116 == 0) {
			Static89.aString25 = this.getCodeBase().getHost();
			Static207.anInt4331 = 43594;
			Static100.anInt2562 = 443;
		} else if (Static80.anInt2116 == 1) {
			Static89.aString25 = this.getCodeBase().getHost();
			Static207.anInt4331 = Static8.anInt195 + 40000;
			Static100.anInt2562 = Static8.anInt195 + 50000;
		} else if (Static80.anInt2116 == 2) {
			Static100.anInt2562 = Static8.anInt195 + 50000;
			Static89.aString25 = "127.0.0.1";
			Static207.anInt4331 = Static8.anInt195 + 40000;
		}
		Static156.anInt5228 = Static207.anInt4331;
		Static309.aString62 = Static89.aString25;
		Static328.anInt6269 = Static100.anInt2562;
		Static206.anInt4324 = Static207.anInt4331;
		Static184.anInt3886 = Static156.anInt5228;
		Static306.aShortArray91 = Static342.aShortArray112 = Static11.aShortArray5 = Static293.aShortArray57 = new short[256];
		if (Static200.anInt4144 == 3) {
			Static215.anInt4413 = Static8.anInt195;
		}
		if (Static330.anInt6312 == 1) {
			Static24.anInt495 = 0;
			Static62.aShortArrayArray1 = Static222.aShortArrayArray6;
			Static73.aBoolean139 = true;
			Static139.aShortArray45 = Static330.aShortArray106;
			Static40.anInt1098 = 16777215;
			Static155.aShortArray46 = Static307.aShortArray92;
			Static106.aShortArrayArray5 = Static89.aShortArrayArray4;
		} else {
			Static139.aShortArray45 = Static160.aShortArray47;
			Static62.aShortArrayArray1 = Static225.aShortArrayArray7;
			Static155.aShortArray46 = Static289.aShortArray90;
			Static106.aShortArrayArray5 = Static83.aShortArrayArray3;
		}
		Static264.aClass92_3 = Static195.method3697(Static300.aCanvas5);
		Static258.aClass127_1 = Static214.method1927(Static300.aCanvas5);
		Static338.aClass1_1 = Static331.method5369();
		if (Static338.aClass1_1 != null) {
			Static338.aClass1_1.method11(Static300.aCanvas5);
		}
		Static192.anInt4031 = Static200.anInt4144;
		try {
			if (Static1.aClass134_7.aClass84_1 != null) {
				Static248.aClass205_2 = new Class205(Static1.aClass134_7.aClass84_1, 5200, 0);
				for (@Pc(174) int local174 = 0; local174 < 29; local174++) {
					Static259.aClass205Array1[local174] = new Class205(Static1.aClass134_7.aClass84Array1[local174], 6000, 0);
				}
				Static356.aClass205_5 = new Class205(Static1.aClass134_7.aClass84_2, 6000, 0);
				Static327.aClass214_4 = new Class214(255, Static248.aClass205_2, Static356.aClass205_5, 500000);
				Static183.aClass205_1 = new Class205(Static1.aClass134_7.aClass84_3, 24, 0);
				Static1.aClass134_7.aClass84Array1 = null;
				Static1.aClass134_7.aClass84_3 = null;
				Static1.aClass134_7.aClass84_2 = null;
				Static1.aClass134_7.aClass84_1 = null;
			}
		} catch (@Pc(230) IOException local230) {
			Static327.aClass214_4 = null;
			Static248.aClass205_2 = null;
			Static183.aClass205_1 = null;
			Static356.aClass205_5 = null;
		}
		if (Static80.anInt2116 != 0) {
			Static274.aBoolean398 = true;
		}
		if (Static330.anInt6312 == 0) {
			Static283.aString57 = Static43.aClass159_64.method4311(Static180.anInt3835);
		} else if (Static330.anInt6312 == 1) {
			Static283.aString57 = Static31.aClass159_52.method4311(Static180.anInt3835);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method856() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method885() {
		Static218.anInt4454++;
		Static308.method5087(null, -1, -1);
		Static290.method4876(null, -1, -1);
		Static201.method3776();
		Static66.anInt1751++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class8_Sub1_Sub2_Sub2 local33 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass141_1.aByte57;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4349();
					@Pc(77) int local77;
					if ((local39 & 0x2) != 0 && local33.anInt4987 == 0 && Math.random() * 1000.0D < 10.0D) {
						local77 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(85) int local85 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local77 != 0 || local85 != 0) {
							@Pc(102) int local102 = local77 + local33.anIntArray415[0];
							@Pc(109) int local109 = local85 + local33.anIntArray416[0];
							if (local102 < 0) {
								local102 = 0;
							} else if (Static350.anInt6637 - local50 - 1 < local102) {
								local102 = Static350.anInt6637 - local50 - 1;
							}
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 > Static105.anInt2647 - local50 - 1) {
								local109 = Static105.anInt2647 - local50 - 1;
							}
							@Pc(184) int local184 = Static42.method837(Static246.anIntArray417, local109, -1, true, 0, 0, local33.anIntArray416[0], Static271.anIntArray441, local50, local102, Static16.aClass170Array1[local33.aByte77], local50, local50, local33.anIntArray415[0]);
							if (local184 > 0) {
								if (local184 > 9) {
									local184 = 9;
								}
								for (@Pc(193) int local193 = 0; local193 < local184; local193++) {
									local33.anIntArray415[local193] = Static246.anIntArray417[local184 - local193 - 1];
									local33.anIntArray416[local193] = Static271.anIntArray441[local184 - local193 - 1];
									local33.aByteArray67[local193] = 1;
								}
								local33.anInt4987 = local184;
							}
						}
					}
					Static29.method496(local33, true);
					local77 = Static95.method2222(local33);
					Static227.method812(local33, Static93.anInt2504, Static221.anInt2807, local77);
					Static195.method3689(local33);
				}
			}
		}
		if (Static324.anInt6209 == 0 && Static222.anInt4518 == 0) {
			if (Static353.anInt2640 == 2) {
				Static97.method2226();
			} else {
				Static292.method4890();
			}
			if (Static240.anInt4829 >> 7 < 14 || Static350.anInt6637 - 14 <= Static240.anInt4829 >> 7 || Static129.anInt3039 >> 7 < 14 || Static129.anInt3039 >> 7 >= Static105.anInt2647 - 14) {
				Static161.method3159();
			}
		}
		while (true) {
			@Pc(317) Class4_Sub34 local317;
			@Pc(322) Class21 local322;
			@Pc(330) Class21 local330;
			do {
				local317 = (Class4_Sub34) Static135.aClass116_26.method3266();
				if (local317 == null) {
					while (true) {
						do {
							local317 = (Class4_Sub34) Static301.aClass116_44.method3266();
							if (local317 == null) {
								while (true) {
									do {
										local317 = (Class4_Sub34) Static318.aClass116_45.method3266();
										if (local317 == null) {
											if (Static103.aClass21_5 != null) {
												Static195.method3696();
											}
											if (Static199.anInt4137 % 1500 == 0) {
												Static328.method5311();
											}
											Static318.method5243();
											if (Static133.aBoolean245 && Static208.method3879() - 60000L > Static150.aLong96) {
												Static149.method3565();
												return;
											}
											return;
										}
										local322 = local317.aClass21_12;
										if (local322.anInt791 < 0) {
											break;
										}
										local330 = Static92.method534(local322.anInt723);
									} while (local330 == null || local330.aClass21Array1 == null || local322.anInt791 >= local330.aClass21Array1.length || local330.aClass21Array1[local322.anInt791] != local322);
									Static164.method3189(local317);
								}
							}
							local322 = local317.aClass21_12;
							if (local322.anInt791 < 0) {
								break;
							}
							local330 = Static92.method534(local322.anInt723);
						} while (local330 == null || local330.aClass21Array1 == null || local330.aClass21Array1.length <= local322.anInt791 || local322 != local330.aClass21Array1[local322.anInt791]);
						Static164.method3189(local317);
					}
				}
				local322 = local317.aClass21_12;
				if (local322.anInt791 < 0) {
					break;
				}
				local330 = Static92.method534(local322.anInt723);
			} while (local330 == null || local330.aClass21Array1 == null || local322.anInt791 >= local330.aClass21Array1.length || local330.aClass21Array1[local322.anInt791] != local322);
			Static164.method3189(local317);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method887(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.method3440();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(107) int[] local107 = Static68.anIntArray99 = new int[6];
						local107[0] = local14.method3401();
						local107[1] = local14.method3401();
						local107[2] = local14.method3401();
						local107[3] = local14.method3401();
						local107[4] = local14.method3401();
						local107[5] = local14.method3401();
					} else {
						@Pc(38) int local38;
						@Pc(33) int local33;
						if (local18 == 4) {
							local33 = local14.method3440();
							Static157.anIntArray299 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static157.anIntArray299[local38] = local14.method3401();
								if (Static157.anIntArray299[local38] == 65535) {
									Static157.anIntArray299[local38] = -1;
								}
							}
						} else if (local18 == 5) {
							local33 = local14.method3440();
							Static122.anIntArray249 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static122.anIntArray249[local38] = local14.method3401();
								if (Static122.anIntArray249[local38] == 65535) {
									Static122.anIntArray249[local38] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method861()) {
			return;
		}
		Static8.anInt195 = Integer.parseInt(this.getParameter("worldid"));
		Static80.anInt2116 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static80.anInt2116 < 0 || Static80.anInt2116 > 1) {
			Static80.anInt2116 = 0;
		}
		Static110.anInt2697 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static110.anInt2697 < 0 || Static110.anInt2697 > 2) {
			Static110.anInt2697 = 0;
		}
		try {
			Static180.anInt3835 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(49) Exception local49) {
			Static180.anInt3835 = 0;
		}
		@Pc(55) String local55 = this.getParameter("objecttag");
		if (local55 != null && local55.equals("1")) {
			Static100.aBoolean183 = true;
		} else {
			Static100.aBoolean183 = false;
		}
		@Pc(71) String local71 = this.getParameter("js");
		if (local71 != null && local71.equals("1")) {
			Static302.aBoolean427 = true;
		} else {
			Static302.aBoolean427 = false;
		}
		@Pc(87) String local87 = this.getParameter("game");
		if (local87 != null && local87.equals("1")) {
			Static330.anInt6312 = 1;
		} else {
			Static330.anInt6312 = 0;
		}
		try {
			Static182.anInt3853 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(106) Exception local106) {
			Static182.anInt3853 = 0;
		}
		Static25.aString4 = this.getParameter("quiturl");
		Static209.aString48 = this.getParameter("settings");
		if (Static209.aString48 == null) {
			Static209.aString48 = "";
		}
		@Pc(124) String local124 = this.getParameter("country");
		if (local124 != null) {
			try {
				Static312.anInt6056 = Integer.parseInt(local124);
			} catch (@Pc(131) Exception local131) {
				Static312.anInt6056 = 0;
			}
		}
		Static160.anInt3457 = Integer.parseInt(this.getParameter("colourid"));
		if (Static160.anInt3457 < 0 || Static160.anInt3457 >= Static170.aColorArray1.length) {
			Static160.anInt3457 = 0;
		}
		Static76.aClient1 = this;
		this.method874(Static110.anInt2697 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method891() {
		@Pc(15) int local15;
		if (!Static165.aBoolean280) {
			for (local15 = 0; local15 < Static11.anInt241; local15++) {
				if (Static88.aClass157Array1[local15].method5190() == 's' || Static88.aClass157Array1[local15].method5190() == 'S') {
					Static165.aBoolean280 = true;
					break;
				}
			}
		}
		@Pc(61) int local61;
		if (Static173.anInt3687 == 0) {
			@Pc(52) Runtime local52 = Runtime.getRuntime();
			local61 = (int) ((local52.totalMemory() - local52.freeMemory()) / 1024L);
			@Pc(64) long local64 = Static208.method3879();
			if (Static73.aLong56 == 0L) {
				Static73.aLong56 = local64;
			}
			if (local61 > 16384 && local64 - Static73.aLong56 < 5000L) {
				if (local64 - Static348.aLong217 > 1000L) {
					System.gc();
					Static348.aLong217 = local64;
				}
				Static117.aString26 = Static261.aClass159_274.method4311(Static180.anInt3835);
				Static171.anInt3660 = 5;
			} else {
				Static117.aString26 = Static307.aClass159_322.method4311(Static180.anInt3835);
				Static171.anInt3660 = 5;
				Static173.anInt3687 = 10;
			}
		} else if (Static173.anInt3687 == 10) {
			for (local15 = 0; local15 < 4; local15++) {
				Static16.aClass170Array1[local15] = Static125.method2587(Static105.anInt2647, Static350.anInt6637);
			}
			Static117.aString26 = Static160.aClass159_176.method4311(Static180.anInt3835);
			Static171.anInt3660 = 10;
			Static173.anInt3687 = 20;
		} else if (Static173.anInt3687 == 20) {
			if (Static334.aClass25_6 == null) {
				Static334.aClass25_6 = new Class25(Static147.aClass13_3, Static220.aClass53_4);
			}
			if (Static334.aClass25_6.method723()) {
				Static248.aClass193_88 = Static81.method2007(0, false, true);
				Static247.aClass193_87 = Static81.method2007(1, false, true);
				Static149.aClass193_69 = Static81.method2007(2, false, true);
				Static229.aClass193_79 = Static81.method2007(3, false, true);
				Static146.aClass193_43 = Static81.method2007(4, false, true);
				Static287.aClass193_77 = Static81.method2007(5, true, true);
				Static39.aClass193_11 = Static81.method2007(6, true, false);
				Static142.aClass193_53 = Static81.method2007(7, false, true);
				Static316.aClass193_99 = Static81.method2007(8, false, true);
				Static302.aClass193_95 = Static81.method2007(9, false, true);
				Static8.aClass193_5 = Static81.method2007(10, false, true);
				Static210.aClass193_76 = Static81.method2007(11, false, true);
				Static121.aClass193_85 = Static81.method2007(12, false, true);
				Static103.aClass193_38 = Static81.method2007(13, false, true);
				Static117.aClass193_41 = Static81.method2007(14, false, false);
				Static145.aClass193_54 = Static81.method2007(15, false, true);
				Static349.aClass193_109 = Static81.method2007(16, false, true);
				Static167.aClass193_60 = Static81.method2007(17, false, true);
				Static351.aClass193_110 = Static81.method2007(18, false, true);
				Static203.aClass193_73 = Static81.method2007(19, false, true);
				Static132.aClass193_47 = Static81.method2007(20, false, true);
				Static301.aClass193_94 = Static81.method2007(21, false, true);
				Static253.aClass193_89 = Static81.method2007(22, false, true);
				Static72.aClass193_20 = Static81.method2007(23, true, true);
				Static52.aClass193_13 = Static81.method2007(24, false, true);
				Static181.aClass193_66 = Static81.method2007(25, false, true);
				Static217.aClass193_78 = Static81.method2007(26, true, true);
				Static97.aClass193_36 = Static81.method2007(27, false, true);
				Static97.aClass193_35 = Static81.method2007(28, true, true);
				Static117.aString26 = Static11.aClass159_21.method4311(Static180.anInt3835);
				Static173.anInt3687 = 30;
				Static171.anInt3660 = 15;
			} else {
				Static117.aString26 = Static355.aClass159_368.method4311(Static180.anInt3835);
				Static171.anInt3660 = 12;
			}
		} else if (Static173.anInt3687 == 30) {
			local15 = 0;
			for (local61 = 0; local61 < 29; local61++) {
				local15 += Static28.aClass7_Sub1Array6[local61].method2590() * Static161.anIntArray302[local61] / 100;
			}
			if (local15 == 100) {
				Static117.aString26 = Static346.aClass159_359.method4311(Static180.anInt3835);
				Static171.anInt3660 = 20;
				Static258.method4492(Static316.aClass193_99);
				Static107.method5413(Static316.aClass193_99);
				Static173.anInt3687 = 40;
			} else {
				if (local15 != 0) {
					Static117.aString26 = Static72.aClass159_105.method4311(Static180.anInt3835) + local15 + "%";
				}
				Static171.anInt3660 = 20;
			}
		} else if (Static173.anInt3687 == 40) {
			if (Static97.aClass193_35.method5060()) {
				this.method887(Static97.aClass193_35.method5049(1));
				Static117.aString26 = Static84.aClass159_114.method4311(Static180.anInt3835);
				Static173.anInt3687 = 50;
				Static171.anInt3660 = 25;
			} else {
				Static117.aString26 = Static141.aClass159_160.method4311(Static180.anInt3835) + Static97.aClass193_35.method5056() + "%";
				Static171.anInt3660 = 25;
			}
		} else if (Static173.anInt3687 == 50) {
			Static258.method4493(Static106.aBoolean193);
			Static133.aClass4_Sub1_Sub4_2 = new Class4_Sub1_Sub4();
			Static133.aClass4_Sub1_Sub4_2.method3820();
			Static201.aClass35_1 = Static324.method5272(22050, Static1.aClass134_7, 0, Static300.aCanvas5);
			Static201.aClass35_1.method2549(Static133.aClass4_Sub1_Sub4_2);
			Static150.method3014(Static117.aClass193_41, Static145.aClass193_54, Static146.aClass193_43, Static133.aClass4_Sub1_Sub4_2);
			Static261.aClass35_2 = Static324.method5272(2048, Static1.aClass134_7, 1, Static300.aCanvas5);
			Static196.aClass4_Sub1_Sub3_3 = new Class4_Sub1_Sub3();
			Static261.aClass35_2.method2549(Static196.aClass4_Sub1_Sub3_3);
			Static37.aClass150_1 = new Class150(22050, Static251.anInt5134);
			Static316.anInt6130 = Static39.aClass193_11.method5066("scape main");
			Static117.aString26 = Static6.aClass159_7.method4311(Static180.anInt3835);
			Static173.anInt3687 = 60;
			Static171.anInt3660 = 30;
		} else if (Static173.anInt3687 == 60) {
			local15 = Static121.method4343(Static316.aClass193_99, Static103.aClass193_38);
			local61 = Static114.method2394();
			if (local15 < local61) {
				Static117.aString26 = Static101.aClass159_372.method4311(Static180.anInt3835) + local15 * 100 / local61 + "%";
				Static171.anInt3660 = 35;
			} else {
				Static117.aString26 = Static197.aClass159_219.method4311(Static180.anInt3835);
				Static171.anInt3660 = 35;
				Static173.anInt3687 = 70;
			}
		} else if (Static173.anInt3687 == 70) {
			local15 = Static57.method1207(Static316.aClass193_99);
			local61 = Static270.method4635();
			if (local15 < local61) {
				Static117.aString26 = Static224.aClass159_237.method4311(Static180.anInt3835) + local15 * 100 / local61 + "%";
				Static171.anInt3660 = 40;
			} else {
				Static117.aString26 = Static179.aClass159_195.method4311(Static180.anInt3835);
				Static171.anInt3660 = 40;
				Static173.anInt3687 = 80;
			}
		} else if (Static173.anInt3687 == 80) {
			if (Static217.aClass193_78.method5060()) {
				Static141.anInterface3_6 = new Class209(Static217.aClass193_78, Static302.aClass193_95, Static316.aClass193_99);
				Static117.aString26 = Static52.aClass159_78.method4311(Static180.anInt3835);
				Static171.anInt3660 = 45;
				Static173.anInt3687 = 90;
			} else {
				Static117.aString26 = Static336.aClass159_352.method4311(Static180.anInt3835) + Static217.aClass193_78.method5056() + "%";
				Static171.anInt3660 = 45;
			}
		} else if (Static173.anInt3687 == 90) {
			Static117.aString26 = Static354.aClass159_365.method4311(Static180.anInt3835);
			Static173.anInt3687 = 95;
			Static171.anInt3660 = 50;
		} else if (Static173.anInt3687 == 95) {
			if (Static165.aBoolean280) {
				Static233.anInt4697 = 0;
				Static347.anInt6585 = 0;
				Static333.anInt6382 = 0;
				Static309.anInt6000 = 1;
				Static159.anInt3440 = 0;
			}
			Static165.aBoolean280 = true;
			Static222.method4006(Static1.aClass134_7);
			Static35.method716();
			Static72.method1718(false, Static233.anInt4697);
			Static117.aString26 = Static239.aClass159_257.method4311(Static180.anInt3835);
			Static171.anInt3660 = 55;
			Static173.anInt3687 = 100;
		} else if (Static173.anInt3687 == 100) {
			Static86.method2107(Static316.aClass193_99, Static103.aClass193_38, Static274.aClass47_9);
			Static117.aString26 = Static100.aClass159_123.method4311(Static180.anInt3835);
			Static171.anInt3660 = 60;
			Static243.method5095(5);
			Static173.anInt3687 = 110;
		} else if (Static173.anInt3687 == 110) {
			Static149.aClass193_69.method5060();
			local15 = Static149.aClass193_69.method5056();
			Static349.aClass193_109.method5060();
			local15 += Static349.aClass193_109.method5056();
			Static167.aClass193_60.method5060();
			local15 += Static167.aClass193_60.method5056();
			Static351.aClass193_110.method5060();
			local15 += Static351.aClass193_110.method5056();
			Static203.aClass193_73.method5060();
			local15 += Static203.aClass193_73.method5056();
			Static132.aClass193_47.method5060();
			local15 += Static132.aClass193_47.method5056();
			Static301.aClass193_94.method5060();
			local15 += Static301.aClass193_94.method5056();
			Static253.aClass193_89.method5060();
			local15 += Static253.aClass193_89.method5056();
			Static52.aClass193_13.method5060();
			local15 += Static52.aClass193_13.method5056();
			Static181.aClass193_66.method5060();
			local15 += Static181.aClass193_66.method5056();
			Static97.aClass193_36.method5060();
			local15 += Static97.aClass193_36.method5056();
			if (local15 < 1100) {
				Static117.aString26 = Static125.aClass159_152.method4311(Static180.anInt3835) + local15 / 11 + "%";
				Static171.anInt3660 = 65;
			} else {
				Static105.method2336(Static149.aClass193_69);
				Static162.method3169(Static149.aClass193_69);
				Static233.method4147(Static149.aClass193_69);
				Static227.method810(Static149.aClass193_69, Static142.aClass193_53);
				Static235.method4182(Static142.aClass193_53, Static349.aClass193_109, Static180.anInt3835);
				Static347.method5524(Static142.aClass193_53, Static180.anInt3835, Static351.aClass193_110);
				Static304.method4988(Static180.anInt3835, Static203.aClass193_73, Static142.aClass193_53);
				Static61.method1269(Static149.aClass193_69);
				Static345.method5677(Static132.aClass193_47, Static248.aClass193_88, Static247.aClass193_87);
				Static8.method187(Static149.aClass193_69);
				Static255.method4464(Static142.aClass193_53, Static301.aClass193_94);
				Static18.method314(Static253.aClass193_89);
				Static81.method2012(Static149.aClass193_69);
				Static186.method3558(Static103.aClass193_38, Static142.aClass193_53, Static316.aClass193_99, Static229.aClass193_79);
				Static43.method842(Static149.aClass193_69);
				Static93.method2207(Static167.aClass193_60);
				Static186.method3554(new Class85(), Static52.aClass193_13, Static181.aClass193_66);
				Static354.method5637(Static52.aClass193_13, Static181.aClass193_66);
				Static160.method3156(Static149.aClass193_69);
				Static329.method3590(Static149.aClass193_69);
				Static239.method4228(Static149.aClass193_69);
				Static83.method2098(Static316.aClass193_99, Static149.aClass193_69);
				Static254.method2406(Static316.aClass193_99, Static149.aClass193_69);
				Static43.method848(Static149.aClass193_69);
				Static146.method2547(Static149.aClass193_69, Static316.aClass193_99);
				Static183.method3523(Static149.aClass193_69);
				Static315.method5199(Static149.aClass193_69);
				Static117.aString26 = Static191.aClass159_207.method4311(Static180.anInt3835);
				Static171.anInt3660 = 65;
				Static121.method4345();
				Static173.anInt3687 = 120;
			}
		} else if (Static173.anInt3687 == 120) {
			local15 = Static82.method2088(Static316.aClass193_99);
			local61 = Static241.method4295();
			if (local61 > local15) {
				Static117.aString26 = Static167.aClass159_185.method4311(Static180.anInt3835) + local15 * 100 / local61 + "%";
				Static171.anInt3660 = 70;
			} else {
				Static269.method4622(Static274.aClass47_9, Static316.aClass193_99);
				Static244.method4312(Static237.aClass58Array136);
				Static117.aString26 = Static9.aClass159_13.method4311(Static180.anInt3835);
				Static171.anInt3660 = 70;
				Static173.anInt3687 = 130;
			}
		} else if (Static173.anInt3687 == 130) {
			Static117.aString26 = Static191.aClass159_206.method4311(Static180.anInt3835);
			Static171.anInt3660 = 75;
			Static173.anInt3687 = 140;
		} else if (Static173.anInt3687 == 140) {
			if (Static8.aClass193_5.method5058("huffman", "")) {
				@Pc(1143) Class211 local1143 = new Class211(Static8.aClass193_5.method5034("huffman", ""));
				Static350.method5566(local1143);
				Static117.aString26 = Static192.aClass159_210.method4311(Static180.anInt3835);
				Static171.anInt3660 = 80;
				Static173.anInt3687 = 150;
			} else {
				Static117.aString26 = Static225.aClass159_238.method4311(Static180.anInt3835) + "0%";
				Static171.anInt3660 = 80;
			}
		} else if (Static173.anInt3687 == 150) {
			if (!Static229.aClass193_79.method5060()) {
				Static117.aString26 = Static345.aClass159_371.method4311(Static180.anInt3835) + Static229.aClass193_79.method5056() * 3 / 4 + "%";
				Static171.anInt3660 = 85;
			} else if (!Static121.aClass193_85.method5060()) {
				Static117.aString26 = Static345.aClass159_371.method4311(Static180.anInt3835) + (Static121.aClass193_85.method5056() / 10 + 75) + "%";
				Static171.anInt3660 = 85;
			} else if (!Static103.aClass193_38.method5060()) {
				Static117.aString26 = Static345.aClass159_371.method4311(Static180.anInt3835) + (Static103.aClass193_38.method5056() / 20 + 85) + "%";
				Static171.anInt3660 = 85;
			} else if (Static72.aClass193_20.method5040("details")) {
				Static54.method4176(Static72.aClass193_20);
				Static85.method2103(Static97.aClass193_36);
				Static25.method407(Static142.aClass193_53, Static141.anInterface3_6);
				Static117.aString26 = Static195.aClass159_216.method4311(Static180.anInt3835);
				Static173.anInt3687 = 160;
				Static171.anInt3660 = 85;
			} else {
				Static117.aString26 = Static345.aClass159_371.method4311(Static180.anInt3835) + (Static72.aClass193_20.method5044("details") / 10 + 90) + "%";
				Static171.anInt3660 = 85;
			}
		} else if (Static173.anInt3687 == 160) {
			local15 = Static232.method4124();
			if (local15 == -1) {
				Static117.aString26 = Static264.aClass159_347.method4311(Static180.anInt3835);
				Static171.anInt3660 = 90;
			} else if (local15 == 7 || local15 == 9) {
				this.method857("worldlistfull");
				Static243.method5095(1000);
			} else if (Static2.aBoolean7) {
				Static117.aString26 = Static277.aClass159_299.method4311(Static180.anInt3835);
				Static171.anInt3660 = 90;
				Static173.anInt3687 = 170;
			} else {
				this.method857("worldlistio_" + local15);
				Static243.method5095(1000);
			}
		} else if (Static173.anInt3687 == 170) {
			Static174.aStringArray45 = new String[Static168.anInt6696];
			Static169.aBooleanArray18 = new boolean[Static103.anInt2590];
			Static118.anIntArray244 = new int[Static103.anInt2590];
			for (local15 = 0; local15 < Static103.anInt2590; local15++) {
				if (Static198.method3730(local15).anInt4055 == 0) {
					Static169.aBooleanArray18[local15] = true;
					Static140.anInt3222++;
				}
				Static118.anIntArray244[local15] = -1;
			}
			Static60.method1268();
			Static304.anInt5823 = Static229.aClass193_79.method5066("loginscreen");
			Static287.aClass193_77.method5052(false);
			Static39.aClass193_11.method5052(true);
			Static316.aClass193_99.method5052(true);
			Static103.aClass193_38.method5052(true);
			Static8.aClass193_5.method5052(true);
			Static229.aClass193_79.method5052(true);
			Static149.aClass193_69.anInt5952 = 2;
			Static129.aBoolean217 = true;
			Static167.aClass193_60.anInt5952 = 2;
			Static349.aClass193_109.anInt5952 = 2;
			Static351.aClass193_110.anInt5952 = 2;
			Static203.aClass193_73.anInt5952 = 2;
			Static132.aClass193_47.anInt5952 = 2;
			Static301.aClass193_94.anInt5952 = 2;
			Static195.method3698(-1, Static309.anInt6000, false, -1);
			Static117.aString26 = Static291.aClass159_308.method4311(Static180.anInt3835);
			Static173.anInt3687 = 180;
			Static171.anInt3660 = 95;
		} else if (Static173.anInt3687 == 180) {
			Static339.method10(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method854() {
		if (Static139.anInt3199 == 1000) {
			return;
		}
		@Pc(22) long local22 = Static354.method5643() / 1000000L - Static325.aLong198;
		Static325.aLong198 = Static354.method5643() / 1000000L;
		@Pc(30) boolean local30 = Static171.method3322();
		if (local30 && Static74.aBoolean135 && Static201.aClass35_1 != null) {
			Static201.aClass35_1.method2567();
		}
		if (Static139.anInt3199 == 30 || Static139.anInt3199 == 10) {
			if (Static155.aLong97 != 0L && Static155.aLong97 < Static208.method3879()) {
				Static195.method3698(Static43.anInt1147, Static35.method713(), false, Static184.anInt3878);
			} else if (Static274.aClass47_9.method2754() && Static199.aBoolean317) {
				Static257.method4477();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static229.aFrame1 == null) {
			@Pc(80) Container local80;
			if (Static308.aFrame2 == null) {
				local80 = Static1.aClass134_7.anApplet1;
			} else {
				local80 = Static308.aFrame2;
			}
			local89 = local80.getSize().width;
			local93 = local80.getSize().height;
			if (local80 == Static308.aFrame2) {
				@Pc(99) Insets local99 = Static308.aFrame2.getInsets();
				local89 -= local99.right + local99.left;
				local93 -= local99.bottom + local99.top;
			}
			if (Static255.anInt5171 != local89 || local93 != Static165.anInt3522) {
				if (Static274.aClass47_9 == null || Static274.aClass47_9.method2670()) {
					Static44.method880();
				} else {
					Static255.anInt5171 = local89;
					Static165.anInt3522 = local93;
				}
				Static155.aLong97 = Static208.method3879() + 500L;
			}
		}
		if (Static229.aFrame1 != null && !Static96.aBoolean470 && (Static139.anInt3199 == 30 || Static139.anInt3199 == 10)) {
			Static195.method3698(-1, Static309.anInt6000, false, -1);
		}
		@Pc(167) boolean local167 = false;
		if (Static195.aBoolean315) {
			Static195.aBoolean315 = false;
			local167 = true;
		}
		if (local167) {
			Static12.method241();
		}
		if (Static274.aClass47_9 != null && Static274.aClass47_9.method2658() || Static35.method713() != 1) {
			Static12.method242();
		}
		if (Static139.anInt3199 == 0) {
			Static293.method3943(Static170.aColorArray1[Static160.anInt3457], Static117.aString26, local167, Static248.aColorArray3[Static160.anInt3457], Static171.anInt3660, Static233.aColorArray2[Static160.anInt3457]);
		} else if (Static139.anInt3199 == 5) {
			Static184.method3531(Static274.aClass47_9, Static233.aColorArray2[Static160.anInt3457].getRGB(), Static170.aColorArray1[Static160.anInt3457].getRGB(), Static274.aClass47_9.method2658() | local167, Static248.aColorArray3[Static160.anInt3457].getRGB(), Static282.aClass51_4);
		} else if (Static139.anInt3199 == 10) {
			Static128.method2641();
		} else if (Static139.anInt3199 == 25 || Static139.anInt3199 == 28) {
			if (Static295.anInt5715 == 1) {
				if (Static178.anInt3770 < Static306.anInt5906) {
					Static178.anInt3770 = Static306.anInt5906;
				}
				local89 = (Static178.anInt3770 - Static306.anInt5906) * 50 / Static178.anInt3770;
				Static3.method124(true, Static341.aClass159_23.method4311(Static180.anInt3835) + "<br>(" + local89 + "%)", Static238.aClass51_6);
			} else if (Static295.anInt5715 == 2) {
				if (Static232.anInt4673 < Static256.anInt5173) {
					Static232.anInt4673 = Static256.anInt5173;
				}
				local89 = (Static232.anInt4673 - Static256.anInt5173) * 50 / Static232.anInt4673 + 50;
				Static3.method124(true, Static341.aClass159_23.method4311(Static180.anInt3835) + "<br>(" + local89 + "%)", Static238.aClass51_6);
			} else {
				Static3.method124(true, Static341.aClass159_23.method4311(Static180.anInt3835), Static238.aClass51_6);
			}
		} else if (Static139.anInt3199 == 30) {
			Static210.method3896(local22);
		} else if (Static139.anInt3199 == 40) {
			Static3.method124(true, Static114.aClass159_131.method4311(Static180.anInt3835) + "<br>" + Static353.aClass159_125.method4311(Static180.anInt3835), Static238.aClass51_6);
		}
		if (Static30.anInt769 == 3) {
			for (local89 = 0; local89 < Static67.anInt1778; local89++) {
				@Pc(389) Rectangle local389 = Class13.aRectangleArray1[local89];
				if (Static89.aBooleanArray9[local89]) {
					Static274.aClass47_9.method2687(local389.x, -1996553985, local389.width, local389.y, local389.height);
				} else if (Static353.aBooleanArray12[local89]) {
					Static274.aClass47_9.method2687(local389.x, -1996554240, local389.width, local389.y, local389.height);
				}
			}
		}
		if (Static261.method4552()) {
			Static160.method3155(Static274.aClass47_9);
		}
		if ((Static139.anInt3199 == 30 || Static139.anInt3199 == 10) && Static30.anInt769 == 0 && Static35.method713() == 1 && !local167 && Static200.aString39.equals("1.1")) {
			local89 = 0;
			for (local93 = 0; local93 < Static67.anInt1778; local93++) {
				if (Static353.aBooleanArray12[local93]) {
					Static353.aBooleanArray12[local93] = false;
					Static281.aRectangleArray2[local89++] = Class13.aRectangleArray1[local93];
				}
			}
			Static274.aClass47_9.method2750(Static281.aRectangleArray2, local89);
		} else if (Static139.anInt3199 != 0) {
			Static274.aClass47_9.method2756();
			for (local89 = 0; local89 < Static67.anInt1778; local89++) {
				Static353.aBooleanArray12[local89] = false;
			}
		}
		if (Static348.anInt6588 == 0) {
			Static249.method4396(15L);
		} else if (Static348.anInt6588 == 1) {
			Static249.method4396(10L);
		} else if (Static348.anInt6588 == 2) {
			Static249.method4396(5L);
		} else if (Static348.anInt6588 == 3) {
			Static249.method4396(2L);
		}
		if (Static129.aBoolean217) {
			Static192.method3644();
		}
		if (Static165.aBoolean280 && Static139.anInt3199 == 10 && Static357.anInt6821 != -1) {
			Static165.aBoolean280 = false;
			Static222.method4006(Static1.aClass134_7);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method860() {
		if (Static139.anInt3199 == 1000) {
			return;
		}
		Static199.anInt4137++;
		if (Static199.anInt4137 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static217.anInt4446 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static319.aRandom1.setSeed((long) Static217.anInt4446);
		}
		this.method895();
		if (Static334.aClass25_6 != null) {
			Static334.aClass25_6.method721();
		}
		Static180.method3480();
		Static319.method5250();
		Static264.aClass92_3.method2615();
		Static258.aClass127_1.method3587();
		if (Static338.aClass1_1 != null) {
			@Pc(69) int local69 = Static338.aClass1_1.method12();
			Static310.anInt6021 = local69;
		}
		if (Static274.aClass47_9 != null) {
			Static274.aClass47_9.method2692((int) Static208.method3879());
		}
		Static82.method2081();
		Static11.anInt241 = 0;
		for (@Pc(86) Class157 local86 = Static264.aClass92_3.method2619(); local86 != null && Static11.anInt241 < 128; local86 = Static264.aClass92_3.method2619()) {
			if (local86.method5189() != 1) {
				@Pc(103) char local103 = local86.method5190();
				if (!Static152.method3024() || local103 != '`' && local103 != '§') {
					Static88.aClass157Array1[Static11.anInt241] = local86;
					Static11.anInt241++;
				} else if (Static261.method4552()) {
					Static25.method411();
				} else {
					Static63.method1314();
				}
			}
		}
		Static138.aClass4_Sub28_2 = null;
		for (@Pc(146) Class4_Sub28 local146 = Static258.aClass127_1.method3591(); local146 != null; local146 = Static258.aClass127_1.method3591()) {
			@Pc(152) int local152 = local146.method5558();
			if (local152 == -1) {
				Static37.aClass116_3.method3274(local146);
			} else if (Static132.method2839(local152)) {
				Static138.aClass4_Sub28_2 = local146;
			}
		}
		if (Static261.method4552()) {
			Static183.method3517();
		}
		if (Static139.anInt3199 == 0) {
			this.method891();
			Static150.method3016();
		} else if (Static139.anInt3199 == 5) {
			this.method891();
			Static150.method3016();
		} else if (Static139.anInt3199 == 25 || Static139.anInt3199 == 28) {
			Static288.method4867();
		}
		if (Static139.anInt3199 == 10) {
			this.method885();
			Static324.method5271();
			Static268.method4614();
			Static93.method2206();
		} else if (Static139.anInt3199 == 30) {
			Static337.method5434();
		} else if (Static139.anInt3199 == 40) {
			Static93.method2206();
			if (Static42.anInt1131 != -3) {
				if (Static42.anInt1131 == 15) {
					Static156.method4518();
				} else if (Static42.anInt1131 != 2) {
					Static232.method4122();
				}
			}
		}
		Static303.method4983(Static274.aClass47_9);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method859() {
		if (Static133.aBoolean245) {
			Static149.method3565();
		}
		if (Static274.aClass47_9 != null) {
			Static274.aClass47_9.method2673();
		}
		if (Static229.aFrame1 != null) {
			Static311.method5120(Static229.aFrame1, Static1.aClass134_7);
			Static229.aFrame1 = null;
		}
		if (Static155.aClass114_3 != null) {
			Static155.aClass114_3.method3165();
			Static155.aClass114_3 = null;
		}
		if (Static338.aClass1_1 != null) {
			Static338.aClass1_1.method14(Static300.aCanvas5);
		}
		Static338.aClass1_1 = null;
		if (Static201.aClass35_1 != null) {
			Static201.aClass35_1.method2568();
		}
		if (Static261.aClass35_2 != null) {
			Static261.aClass35_2.method2568();
		}
		Static147.aClass13_3.method298();
		Static220.aClass53_4.method1719();
		if (Static146.aClass166_2 != null) {
			Static146.aClass166_2.method4497();
			Static146.aClass166_2 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method895() {
		@Pc(13) boolean local13 = Static147.aClass13_3.method296();
		if (!local13) {
			this.method876();
		}
	}
}
