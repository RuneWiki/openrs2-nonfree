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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static49.method1090("argument count");
			}
			Static231.anInt7998 = Integer.parseInt(arg0[0]);
			Static170.aClass193_5 = Static388.aClass193_6;
			if (arg0[1].equals("live")) {
				Static111.aClass8_1 = Static288.aClass8_5;
			} else if (arg0[1].equals("rc")) {
				Static111.aClass8_1 = Static396.aClass8_4;
			} else if (arg0[1].equals("wip")) {
				Static111.aClass8_1 = Static252.aClass8_2;
			} else {
				Static49.method1090("modewhat");
			}
			Static161.anInt3239 = Static20.method583(arg0[2]);
			if (Static161.anInt3239 == -1) {
				if (arg0[2].equals("english")) {
					Static161.anInt3239 = 0;
				} else if (arg0[2].equals("german")) {
					Static161.anInt3239 = 1;
				} else {
					Static49.method1090("language");
				}
			}
			Static29.aBoolean43 = false;
			Static37.aBoolean92 = false;
			if (arg0[3].equals("game0")) {
				Static4.aClass36_5 = Static87.aClass36_3;
			} else if (arg0[3].equals("game1")) {
				Static4.aClass36_5 = Static24.aClass36_2;
			} else {
				Static49.method1090("game");
			}
			Static128.anInt2737 = 0;
			Static56.aBoolean118 = true;
			Static130.aBoolean183 = true;
			Static65.aString14 = "";
			Static35.anInt1085 = Static4.aClass36_5.anInt1242;
			Static334.anInt5834 = 0;
			@Pc(124) client local124 = new client();
			Static448.aClient1 = local124;
			local124.method1125(Static4.aClass36_5.aString5, Static111.aClass8_1.method206() + 32);
			Static133.aFrame3.setLocation(40, 40);
		} catch (@Pc(147) Exception local147) {
			Static390.method5741(local147, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method1138(@OriginalArg(1) int arg0) {
		Static342.aClass122_9 = null;
		Static106.aClass73_1 = null;
		Static311.anInt5428 = 0;
		Static443.aClass227_3.anInt6699++;
		Static443.aClass227_3.anInt6698 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method1139(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub1 local10 = new Class6_Sub1(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method6433();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(29) int[] local29 = Static322.anIntArray382 = new int[6];
					local29[0] = local10.method6485();
					local29[1] = local10.method6485();
					local29[2] = local10.method6485();
					local29[3] = local10.method6485();
					local29[4] = local10.method6485();
					local29[5] = local10.method6485();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local14 == 4) {
						local76 = local10.method6433();
						Static430.anIntArray527 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static430.anIntArray527[local81] = local10.method6485();
							if (Static430.anIntArray527[local81] == 65535) {
								Static430.anIntArray527[local81] = -1;
							}
						}
					} else if (local14 == 5) {
						local76 = local10.method6433();
						Static434.anIntArray528 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static434.anIntArray528[local81] = local10.method6485();
							if (Static434.anIntArray528[local81] == 65535) {
								Static434.anIntArray528[local81] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1116() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static320.method4622();
		Static42.aClass203_1 = new Class203(Static45.aClass209_127);
		Static443.aClass227_3 = new Class227();
		if (Static136.aClass193_3 != Static170.aClass193_5) {
			Static412.aByteArrayArray25 = new byte[50][];
		}
		Static291.aClass28_Sub1_1 = new Class28_Sub1(Static45.aClass209_127);
		if (Static136.aClass193_3 == Static170.aClass193_5) {
			Static338.aString48 = this.getCodeBase().getHost();
			Static135.anInt2875 = 443;
			Static46.anInt1238 = 43594;
		} else if (Static407.method6012(Static170.aClass193_5)) {
			Static338.aString48 = this.getCodeBase().getHost();
			Static46.anInt1238 = Static231.anInt7998 + 40000;
			Static135.anInt2875 = Static231.anInt7998 + 50000;
		} else if (Static388.aClass193_6 == Static170.aClass193_5) {
			Static338.aString48 = "127.0.0.1";
			Static135.anInt2875 = Static231.anInt7998 + 50000;
			Static46.anInt1238 = Static231.anInt7998 + 40000;
		}
		Static426.anInt7595 = Static46.anInt1238;
		Static124.anInt2566 = Static135.anInt2875;
		Static263.anInt4756 = Static46.anInt1238;
		Static207.aString29 = Static338.aString48;
		Static301.aShortArray83 = Static148.aShortArray37 = Static226.aShortArray87 = Static434.aShortArray113 = new short[256];
		if (Static24.aClass36_2 == Static4.aClass36_5) {
			Static368.aShortArrayArray9 = Static318.aShortArrayArray8;
			Static384.anInt6848 = 0;
			Static395.aBoolean453 = true;
			Static274.aShortArray66 = Static341.aShortArray91;
			Static28.aShortArray9 = Static67.aShortArray15;
			Static182.anInt3604 = 16777215;
			Static350.aShortArrayArray10 = Static190.aShortArrayArray2;
		} else {
			Static350.aShortArrayArray10 = Static227.aShortArrayArray7;
			Static368.aShortArrayArray9 = Static124.aShortArrayArray5;
			Static28.aShortArray9 = Static346.aShortArray92;
			Static274.aShortArray66 = Static186.aShortArray42;
		}
		Static154.anInt3148 = Static426.anInt7595;
		if (Static325.anInt5594 == 3) {
			Static118.anInt2485 = Static231.anInt7998;
		}
		Static54.aClass187_1 = Static177.method6075(Static280.aCanvas3);
		Static186.aClass50_1 = Static170.method2803(Static280.aCanvas3);
		Static335.aClass84_1 = Static212.method3220();
		if (Static335.aClass84_1 != null) {
			Static335.aClass84_1.method2110(Static280.aCanvas3);
		}
		Static6.anInt252 = Static325.anInt5594;
		try {
			if (Static45.aClass209_127.aClass46_2 != null) {
				Static397.aClass136_15 = new Class136(Static45.aClass209_127.aClass46_2, 5200, 0);
				for (@Pc(176) int local176 = 0; local176 < 30; local176++) {
					Static247.aClass136Array1[local176] = new Class136(Static45.aClass209_127.aClass46Array1[local176], 6000, 0);
				}
				Static251.aClass136_14 = new Class136(Static45.aClass209_127.aClass46_4, 6000, 0);
				Static32.aClass63_5 = new Class63(255, Static397.aClass136_15, Static251.aClass136_14, 500000);
				Static350.aClass136_13 = new Class136(Static45.aClass209_127.aClass46_3, 24, 0);
				Static45.aClass209_127.aClass46Array1 = null;
				Static45.aClass209_127.aClass46_4 = null;
				Static45.aClass209_127.aClass46_2 = null;
				Static45.aClass209_127.aClass46_3 = null;
			}
		} catch (@Pc(232) IOException local232) {
			Static397.aClass136_15 = null;
			Static32.aClass63_5 = null;
			Static251.aClass136_14 = null;
			Static350.aClass136_13 = null;
		}
		if (Static170.aClass193_5 != Static136.aClass193_3) {
			Static250.aBoolean295 = true;
		}
		Static71.aString12 = (Static87.aClass36_3 == Static4.aClass36_5 ? Static273.aClass267_65 : Static272.aClass267_64).method6581(Static161.anInt3239);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1140() {
		Static254.anInt4641++;
		Static272.method4103(null, -1, -1);
		Static97.method1810(null, -1, -1);
		Static86.method823();
		Static144.anInt2943++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class3_Sub2_Sub1_Sub1 local33 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass48_1.aByte28;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method5521();
					@Pc(71) int local71;
					if ((local39 & 0x2) != 0 && local33.anInt6613 == 0 && Math.random() * 1000.0D < 10.0D) {
						local71 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(79) int local79 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local71 != 0 || local79 != 0) {
							@Pc(97) int local97 = local33.anIntArray458[0] + local71;
							if (local97 < 0) {
								local97 = 0;
							} else if (Static181.anInt3574 - local50 - 1 < local97) {
								local97 = Static181.anInt3574 - local50 - 1;
							}
							@Pc(132) int local132 = local33.anIntArray459[0] + local79;
							if (local132 < 0) {
								local132 = 0;
							} else if (Static117.anInt2450 - local50 - 1 < local132) {
								local132 = Static117.anInt2450 - local50 - 1;
							}
							@Pc(185) int local185 = Static51.method1172(local50, Static209.aClass210Array2[local33.aByte103], local50, -1, 0, local33.anIntArray459[0], local33.anIntArray458[0], 0, local50, local132, Static265.anIntArray325, Static298.anIntArray357, local97, true);
							if (local185 > 0) {
								if (local185 > 9) {
									local185 = 9;
								}
								for (@Pc(199) int local199 = 0; local199 < local185; local199++) {
									local33.anIntArray458[local199] = Static265.anIntArray325[local185 - local199 - 1];
									local33.anIntArray459[local199] = Static298.anIntArray357[local185 - local199 - 1];
									local33.aByteArray85[local199] = 1;
								}
								local33.anInt6613 = local185;
							}
						}
					}
					Static372.method5571(true, local33);
					local71 = Static338.method4924(local33);
					Static10.method337(Static245.anInt4506, local33, local71, Static329.anInt5689);
					Static340.method4954(local33);
				}
			}
		}
		if (Static149.anInt3065 == 0 && Static17.anInt529 == 0) {
			if (Static429.anInt7656 == 2) {
				Static327.method4728();
			} else {
				Static445.method6521();
			}
			if (Static157.anInt3220 >> 7 < 14 || Static181.anInt3574 - 14 <= Static157.anInt3220 >> 7 || Static229.anInt4187 >> 7 < 14 || Static117.anInt2450 - 14 <= Static229.anInt4187 >> 7) {
				Static236.method3643();
			}
		}
		while (true) {
			@Pc(324) Class6_Sub42 local324;
			@Pc(329) Class239 local329;
			@Pc(340) Class239 local340;
			do {
				local324 = (Class6_Sub42) Static17.aClass244_5.method5973();
				if (local324 == null) {
					while (true) {
						do {
							local324 = (Class6_Sub42) Static409.aClass244_44.method5973();
							if (local324 == null) {
								while (true) {
									do {
										local324 = (Class6_Sub42) Static376.aClass244_40.method5973();
										if (local324 == null) {
											if (Static240.aClass239_8 != null) {
												Static172.method2860();
											}
											if (Static66.anInt1741 % 1500 == 0) {
												Static404.method5968();
											}
											Static231.method6538();
											if (Static304.aBoolean346 && Static43.aLong45 < Static449.method6552() - 60000L) {
												Static327.method4731();
												return;
											}
											return;
										}
										local329 = local324.aClass239_13;
										if (local329.anInt6907 < 0) {
											break;
										}
										local340 = Static121.method2092(local329.anInt6895);
									} while (local340 == null || local340.aClass239Array2 == null || local329.anInt6907 >= local340.aClass239Array2.length || local329 != local340.aClass239Array2[local329.anInt6907]);
									Static166.method2744(local324);
								}
							}
							local329 = local324.aClass239_13;
							if (local329.anInt6907 < 0) {
								break;
							}
							local340 = Static121.method2092(local329.anInt6895);
						} while (local340 == null || local340.aClass239Array2 == null || local340.aClass239Array2.length <= local329.anInt6907 || local329 != local340.aClass239Array2[local329.anInt6907]);
						Static166.method2744(local324);
					}
				}
				local329 = local324.aClass239_13;
				if (local329.anInt6907 < 0) {
					break;
				}
				local340 = Static121.method2092(local329.anInt6895);
			} while (local340 == null || local340.aClass239Array2 == null || local340.aClass239Array2.length <= local329.anInt6907 || local329 != local340.aClass239Array2[local329.anInt6907]);
			Static166.method2744(local324);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1117() {
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1132() {
		if (Static304.aBoolean346) {
			Static327.method4731();
		}
		if (Static126.aClass66_5 != null) {
			Static126.aClass66_5.method5069();
		}
		if (Static264.aFrame2 != null) {
			Static298.method4403(Static264.aFrame2, Static45.aClass209_127);
			Static264.aFrame2 = null;
		}
		if (Static177.aClass73_6 != null) {
			Static177.aClass73_6.method1875();
			Static177.aClass73_6 = null;
		}
		if (Static335.aClass84_1 != null) {
			Static335.aClass84_1.method2113(Static280.aCanvas3);
		}
		Static335.aClass84_1 = null;
		Static318.method4609();
		Static443.aClass227_3.method5577();
		Static42.aClass203_1.method4593();
		if (Static128.aClass31_1 != null) {
			Static128.aClass31_1.method911();
			Static128.aClass31_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1148() {
		if (Static231.anInt8002 < Static443.aClass227_3.anInt6699) {
			if (Static263.anInt4756 == Static154.anInt3148) {
				Static154.anInt3148 = Static124.anInt2566;
			} else {
				Static154.anInt3148 = Static263.anInt4756;
			}
			Static194.anInt3724 = 5 * 50 * (Static443.aClass227_3.anInt6699 - 1);
			if (Static194.anInt3724 > 3000) {
				Static194.anInt3724 = 3000;
			}
			if (Static443.aClass227_3.anInt6699 >= 2 && Static443.aClass227_3.anInt6698 == 6) {
				this.method1135("js5connect_outofdate");
				Static217.anInt3941 = 1000;
				return;
			}
			if (Static443.aClass227_3.anInt6699 >= 4 && Static443.aClass227_3.anInt6698 == -1) {
				this.method1135("js5crc");
				Static217.anInt3941 = 1000;
				return;
			}
			if (Static443.aClass227_3.anInt6699 >= 4 && (Static217.anInt3941 == 0 || Static217.anInt3941 == 5)) {
				if (Static443.aClass227_3.anInt6698 == 7 || Static443.aClass227_3.anInt6698 == 9) {
					this.method1135("js5connect_full");
				} else if (Static443.aClass227_3.anInt6698 > 0) {
					this.method1135("js5connect");
				} else {
					this.method1135("js5io");
				}
				Static217.anInt3941 = 1000;
				return;
			}
		}
		Static231.anInt8002 = Static443.aClass227_3.anInt6699;
		if (Static194.anInt3724 > 0) {
			Static194.anInt3724--;
			return;
		}
		try {
			if (Static311.anInt5428 == 0) {
				Static342.aClass122_9 = Static45.aClass209_127.method4688(Static154.anInt3148, Static207.aString29);
				Static311.anInt5428++;
			}
			if (Static311.anInt5428 == 1) {
				if (Static342.aClass122_9.anInt3557 == 2) {
					this.method1138(1000);
					return;
				}
				if (Static342.aClass122_9.anInt3557 == 1) {
					Static311.anInt5428++;
				}
			}
			if (Static311.anInt5428 == 2) {
				Static106.aClass73_1 = new Class73((Socket) Static342.aClass122_9.anObject7, Static45.aClass209_127);
				@Pc(178) Class6_Sub1 local178 = new Class6_Sub1(5);
				local178.method6439(Static356.aClass223_2.anInt6416);
				local178.method6461(582);
				Static106.aClass73_1.method1873(5, local178.aByteArray96);
				Static311.anInt5428++;
				Static195.aLong203 = Static449.method6552();
			}
			if (Static311.anInt5428 == 3) {
				if (Static217.anInt3941 == 0 || Static217.anInt3941 == 5 || Static106.aClass73_1.method1872() > 0) {
					@Pc(228) int local228 = Static106.aClass73_1.method1874();
					if (local228 != 0) {
						this.method1138(local228);
						return;
					}
					Static311.anInt5428++;
				} else if (Static449.method6552() - Static195.aLong203 > 30000L) {
					this.method1138(1001);
					return;
				}
			}
			if (Static311.anInt5428 == 4) {
				@Pc(279) boolean local279 = Static217.anInt3941 == 5 || Static217.anInt3941 == 10 || Static217.anInt3941 == 28;
				Static443.aClass227_3.method5579(!local279, Static106.aClass73_1);
				Static311.anInt5428 = 0;
				Static342.aClass122_9 = null;
				Static106.aClass73_1 = null;
			}
		} catch (@Pc(296) IOException local296) {
			this.method1138(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1136()) {
			return;
		}
		Static231.anInt7998 = Integer.parseInt(this.getParameter("worldid"));
		Static170.aClass193_5 = Static256.method3937(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static407.method6012(Static170.aClass193_5) && Static170.aClass193_5 != Static136.aClass193_3) {
			Static170.aClass193_5 = Static136.aClass193_3;
		}
		Static111.aClass8_1 = Static395.method5844(Integer.parseInt(this.getParameter("modewhat")));
		if (Static252.aClass8_2 != Static111.aClass8_1 && Static111.aClass8_1 != Static396.aClass8_4 && Static288.aClass8_5 != Static111.aClass8_1) {
			Static111.aClass8_1 = Static288.aClass8_5;
		}
		try {
			Static161.anInt3239 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static161.anInt3239 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static37.aBoolean92 = true;
		} else {
			Static37.aBoolean92 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static29.aBoolean43 = true;
		} else {
			Static29.aBoolean43 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static287.aBoolean318 = true;
		} else {
			Static287.aBoolean318 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static4.aClass36_5 = Static24.aClass36_2;
		} else {
			Static4.aClass36_5 = Static87.aClass36_3;
		}
		try {
			Static128.anInt2737 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static128.anInt2737 = 0;
		}
		Static362.aString51 = this.getParameter("quiturl");
		Static65.aString14 = this.getParameter("settings");
		if (Static65.aString14 == null) {
			Static65.aString14 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static334.anInt5834 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static334.anInt5834 = 0;
			}
		}
		Static35.anInt1085 = Integer.parseInt(this.getParameter("colourid"));
		if (Static35.anInt1085 < 0 || Static35.anInt1085 >= Static71.aColorArray2.length) {
			Static35.anInt1085 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static56.aBoolean118 = true;
			Static130.aBoolean183 = true;
		}
		if (Static87.aClass36_3 == Static4.aClass36_5) {
			Static365.anInt6516 = 765;
			Static357.anInt6368 = 503;
		} else if (Static4.aClass36_5 == Static24.aClass36_2) {
			Static357.anInt6368 = 480;
			Static365.anInt6516 = 640;
		}
		Static448.aClient1 = this;
		this.method1119(Static357.anInt6368, Static111.aClass8_1.method206() + 32, Static365.anInt6516);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1151() {
		@Pc(12) boolean local12 = Static443.aClass227_3.method5576();
		if (!local12) {
			this.method1148();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1134() {
		if (Static217.anInt3941 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static45.method6526() / 1000000L - Static237.aLong134;
		Static237.aLong134 = Static45.method6526() / 1000000L;
		@Pc(27) boolean local27 = Static150.method2597();
		if (local27 && Static5.aBoolean10 && Static352.aClass2_2 != null) {
			Static352.aClass2_2.method361();
		}
		if (Static217.anInt3941 == 30 || Static217.anInt3941 == 10) {
			if (Static438.aLong223 != 0L && Static438.aLong223 < Static449.method6552()) {
				Static21.method609(Static374.method5599(), Static291.aClass28_Sub1_1.anInt1031, Static291.aClass28_Sub1_1.anInt1024, false);
			} else if (!Static126.aClass66_5.method4970() && Static331.aBoolean358) {
				Static45.method6529();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static264.aFrame2 == null) {
			@Pc(81) Container local81;
			if (Static133.aFrame3 == null) {
				local81 = Static45.aClass209_127.anApplet1;
			} else {
				local81 = Static133.aFrame3;
			}
			local90 = local81.getSize().width;
			local94 = local81.getSize().height;
			if (Static133.aFrame3 == local81) {
				@Pc(100) Insets local100 = Static133.aFrame3.getInsets();
				local90 -= local100.right + local100.left;
				local94 -= local100.top + local100.bottom;
			}
			if (local90 != Static142.anInt2934 || Static212.anInt3904 != local94) {
				if (Static126.aClass66_5 == null || Static126.aClass66_5.method5050()) {
					Static320.method4622();
				} else {
					Static212.anInt3904 = local94;
					Static142.anInt2934 = local90;
				}
				Static438.aLong223 = Static449.method6552() + 500L;
			}
		}
		if (Static264.aFrame2 != null && !Static185.aBoolean236 && (Static217.anInt3941 == 30 || Static217.anInt3941 == 10)) {
			Static21.method609(Static291.aClass28_Sub1_1.anInt1023, -1, -1, false);
		}
		@Pc(168) boolean local168 = false;
		if (Static30.aBoolean46) {
			local168 = true;
			Static30.aBoolean46 = false;
		}
		if (local168) {
			Static344.method5291();
		}
		if (Static126.aClass66_5 != null && Static126.aClass66_5.method4970() || Static374.method5599() != 1) {
			Static206.method3172();
		}
		if (Static217.anInt3941 == 0) {
			Static94.method1671(Static200.anInt3785, local168, Static304.aColorArray3[Static35.anInt1085], Static65.aString15, Static71.aColorArray2[Static35.anInt1085], Static28.aColorArray1[Static35.anInt1085]);
		} else if (Static217.anInt3941 == 5) {
			Static448.method6551(Static126.aClass66_5.method4970() | local168, Static236.aClass29_2, Static71.aColorArray2[Static35.anInt1085].getRGB(), Static28.aColorArray1[Static35.anInt1085].getRGB(), Static304.aColorArray3[Static35.anInt1085].getRGB(), Static126.aClass66_5);
		} else if (Static217.anInt3941 == 10) {
			Static3.method61();
		} else if (Static217.anInt3941 == 25 || Static217.anInt3941 == 28) {
			if (Static399.anInt7156 == 1) {
				if (Static309.anInt5420 < Static238.anInt4370) {
					Static309.anInt5420 = Static238.anInt4370;
				}
				local90 = (Static309.anInt5420 - Static238.anInt4370) * 50 / Static309.anInt5420;
				Static134.method2374(Static35.aClass29_1, Static54.aClass267_20.method6581(Static161.anInt3239) + "<br>(" + local90 + "%)", true);
			} else if (Static399.anInt7156 == 2) {
				if (Static252.anInt4606 > Static44.anInt1202) {
					Static44.anInt1202 = Static252.anInt4606;
				}
				local90 = (Static44.anInt1202 - Static252.anInt4606) * 50 / Static44.anInt1202 + 50;
				Static134.method2374(Static35.aClass29_1, Static54.aClass267_20.method6581(Static161.anInt3239) + "<br>(" + local90 + "%)", true);
			} else {
				Static134.method2374(Static35.aClass29_1, Static54.aClass267_20.method6581(Static161.anInt3239), true);
			}
		} else if (Static217.anInt3941 == 30) {
			Static288.method4320(local17);
		} else if (Static217.anInt3941 == 40) {
			Static134.method2374(Static35.aClass29_1, Static208.aClass267_54.method6581(Static161.anInt3239) + "<br>" + Static309.aClass267_73.method6581(Static161.anInt3239), true);
		}
		if (Static69.anInt1815 == 3) {
			for (local90 = 0; local90 < Static386.anInt6857; local90++) {
				@Pc(398) Rectangle local398 = Class12_Sub2.aRectangleArray1[local90];
				if (Static43.aBooleanArray4[local90]) {
					Static126.aClass66_5.method5035(local398.width, local398.y, -1996553985, local398.x, local398.height);
				} else if (Static256.aBooleanArray16[local90]) {
					Static126.aClass66_5.method5035(local398.width, local398.y, -1996554240, local398.x, local398.height);
				}
			}
		}
		if (Static342.method4963()) {
			Static297.method4398(Static126.aClass66_5);
		}
		if ((Static217.anInt3941 == 30 || Static217.anInt3941 == 10) && Static69.anInt1815 == 0 && Static374.method5599() == 1 && !local168 && Static325.aString45.equals("1.1")) {
			local90 = 0;
			for (local94 = 0; local94 < Static386.anInt6857; local94++) {
				if (Static256.aBooleanArray16[local94]) {
					Static256.aBooleanArray16[local94] = false;
					Static276.aRectangleArray2[local90++] = Class12_Sub2.aRectangleArray1[local94];
				}
			}
			Static126.aClass66_5.method4994(Static276.aRectangleArray2, local90);
		} else if (Static217.anInt3941 != 0) {
			Static126.aClass66_5.method4977();
			for (local90 = 0; local90 < Static386.anInt6857; local90++) {
				Static256.aBooleanArray16[local90] = false;
			}
		}
		if (Static291.aClass28_Sub1_1.anInt1026 == 0) {
			Static88.method4161(15L);
		} else if (Static291.aClass28_Sub1_1.anInt1026 == 1) {
			Static88.method4161(10L);
		} else if (Static291.aClass28_Sub1_1.anInt1026 == 2) {
			Static88.method4161(5L);
		} else if (Static291.aClass28_Sub1_1.anInt1026 == 3) {
			Static88.method4161(2L);
		}
		if (Static128.aBoolean179) {
			Static163.method2694();
		}
		if (Static291.aClass28_Sub1_1.aBoolean79 && Static217.anInt3941 == 10 && Static36.anInt1129 != -1) {
			Static291.aClass28_Sub1_1.aBoolean79 = false;
			Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1128() {
		if (Static217.anInt3941 == 1000) {
			return;
		}
		Static66.anInt1741++;
		if (Static66.anInt1741 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static356.anInt6347 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static96.aRandom3.setSeed((long) Static356.anInt6347);
		}
		if (Static66.anInt1741 % 50 == 0) {
			Static223.anInt4046 = Static76.anInt7823;
			Static76.anInt7823 = 0;
			Static345.anInt6217 = Static57.anInt1544;
			Static57.anInt1544 = 0;
		}
		this.method1151();
		if (Static297.aClass163_1 != null) {
			Static297.aClass163_1.method3816();
		}
		Static215.method3236();
		Static54.aClass187_1.method4603();
		Static186.aClass50_1.method1440();
		if (Static335.aClass84_1 != null) {
			@Pc(89) int local89 = Static335.aClass84_1.method2115();
			Static43.anInt1190 = local89;
		}
		if (Static126.aClass66_5 != null) {
			Static126.aClass66_5.method5067((int) Static449.method6552());
		}
		Static112.method1963();
		Static207.anInt3852 = 0;
		for (@Pc(106) Class40 local106 = Static54.aClass187_1.method4605(); local106 != null && Static207.anInt3852 < 128; local106 = Static54.aClass187_1.method4605()) {
			if (local106.method2683() != 1) {
				@Pc(119) char local119 = local106.method2682();
				if (!Static91.method1639() || local119 != '`' && local119 != '§') {
					Static196.aClass40Array1[Static207.anInt3852] = local106;
					Static207.anInt3852++;
				} else if (Static342.method4963()) {
					Static321.method4631();
				} else {
					Static23.method657();
				}
			}
		}
		for (@Pc(164) Class6_Sub33 local164 = Static186.aClass50_1.method1444(); local164 != null; local164 = Static186.aClass50_1.method1444()) {
			@Pc(170) int local170 = local164.method5293();
			if (local170 == -1) {
				Static337.aClass244_28.method5966(local164);
			} else if (Static399.method5888(local170)) {
				Static124.aClass244_13.method5966(local164);
			}
			if (Static124.aClass244_13.method5965() > 10) {
				Static124.aClass244_13.method5973();
			}
		}
		if (Static342.method4963()) {
			Static194.method3063();
		}
		if (Static217.anInt3941 == 0) {
			this.method1154();
			Static76.method6388();
		} else if (Static217.anInt3941 == 5) {
			this.method1154();
			Static76.method6388();
		} else if (Static217.anInt3941 == 25 || Static217.anInt3941 == 28) {
			Static208.method3212();
		}
		if (Static217.anInt3941 == 10) {
			this.method1140();
			Static149.method2555();
			Static113.method1983();
			Static250.method3880();
		} else if (Static217.anInt3941 == 30) {
			Static433.method6297();
		} else if (Static217.anInt3941 == 40) {
			Static250.method3880();
			if (Static107.anInt2300 != -3 && Static107.anInt2300 != 2 && Static107.anInt2300 != 15) {
				Static63.method1342();
			}
		}
		Static234.method4163(Static126.aClass66_5);
		Static124.aClass244_13.method5973();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1154() {
		@Pc(6) int local6;
		if (!Static291.aClass28_Sub1_1.aBoolean79) {
			for (local6 = 0; local6 < Static207.anInt3852; local6++) {
				if (Static196.aClass40Array1[local6].method2682() == 's' || Static196.aClass40Array1[local6].method2682() == 'S') {
					Static291.aClass28_Sub1_1.aBoolean79 = true;
					break;
				}
			}
		}
		@Pc(52) int local52;
		if (Static68.anInt7443 == 0) {
			@Pc(43) Runtime local43 = Runtime.getRuntime();
			local52 = (int) ((local43.totalMemory() - local43.freeMemory()) / 1024L);
			@Pc(55) long local55 = Static449.method6552();
			if (Static249.aLong139 == 0L) {
				Static249.aLong139 = local55;
			}
			if (local52 > 16384 && local55 - Static249.aLong139 < 5000L) {
				if (local55 - Static74.aLong63 > 1000L) {
					System.gc();
					Static74.aLong63 = local55;
				}
				Static65.aString15 = Static24.aClass267_12.method6581(Static161.anInt3239);
				Static200.anInt3785 = 5;
			} else {
				Static65.aString15 = Static362.aClass267_87.method6581(Static161.anInt3239);
				Static200.anInt3785 = 5;
				Static68.anInt7443 = 10;
			}
		} else if (Static68.anInt7443 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static209.aClass210Array2[local6] = Static15.method394(Static181.anInt3574, Static117.anInt2450);
			}
			Static65.aString15 = Static207.aClass267_53.method6581(Static161.anInt3239);
			Static68.anInt7443 = 20;
			Static200.anInt3785 = 10;
		} else if (Static68.anInt7443 == 20) {
			if (Static297.aClass163_1 == null) {
				Static297.aClass163_1 = new Class163(Static443.aClass227_3, Static42.aClass203_1);
			}
			if (Static297.aClass163_1.method3814()) {
				Static214.aClass100_41 = Static57.method1274(0, false, true);
				Static243.aClass100_47 = Static57.method1274(1, false, true);
				Static22.aClass100_4 = Static57.method1274(2, false, true);
				Static137.aClass100_23 = Static57.method1274(3, false, true);
				Static298.aClass100_55 = Static57.method1274(4, false, true);
				Static332.aClass100_63 = Static57.method1274(5, true, true);
				Static263.aClass100_51 = Static57.method1274(6, true, false);
				Static335.aClass100_66 = Static57.method1274(7, false, true);
				Static350.aClass100_69 = Static57.method1274(8, false, true);
				Static71.aClass100_11 = Static57.method1274(9, false, true);
				Static300.aClass100_56 = Static57.method1274(10, false, true);
				Static208.aClass100_39 = Static57.method1274(11, false, true);
				Static321.aClass100_60 = Static57.method1274(12, false, true);
				Static410.aClass100_89 = Static57.method1274(13, false, true);
				Static101.aClass100_13 = Static57.method1274(14, false, false);
				Static212.aClass100_40 = Static57.method1274(15, false, true);
				Static289.aClass100_53 = Static57.method1274(16, false, true);
				Static31.aClass100_6 = Static57.method1274(17, false, true);
				Static226.aClass100_61 = Static57.method1274(18, false, true);
				Static387.aClass100_85 = Static57.method1274(19, false, true);
				Static340.aClass100_68 = Static57.method1274(20, false, true);
				Static75.aClass100_12 = Static57.method1274(21, false, true);
				Static119.aClass100_84 = Static57.method1274(22, false, true);
				Static173.aClass100_34 = Static57.method1274(23, true, true);
				Static328.aClass100_62 = Static57.method1274(24, false, true);
				Static441.aClass100_94 = Static57.method1274(25, false, true);
				Static110.aClass100_88 = Static57.method1274(26, true, true);
				Static248.aClass100_91 = Static57.method1274(27, false, true);
				Static378.aClass100_81 = Static57.method1274(28, true, true);
				Static44.aClass100_9 = Static57.method1274(29, false, true);
				Static65.aString15 = Static39.aClass267_16.method6581(Static161.anInt3239);
				Static68.anInt7443 = 30;
				Static200.anInt3785 = 15;
			} else {
				Static65.aString15 = Static100.aClass267_29.method6581(Static161.anInt3239);
				Static200.anInt3785 = 12;
			}
		} else if (Static68.anInt7443 == 30) {
			local6 = 0;
			for (local52 = 0; local52 < 30; local52++) {
				local6 += Static360.aClass68_Sub1Array2[local52].method5223() * Static241.anIntArray545[local52] / 100;
			}
			if (local6 == 100) {
				Static65.aString15 = Static209.aClass267_43.method6581(Static161.anInt3239);
				Static200.anInt3785 = 20;
				Static215.method3238(Static350.aClass100_69);
				Static406.method5996(Static350.aClass100_69);
				Static68.anInt7443 = 40;
			} else {
				if (local6 != 0) {
					Static65.aString15 = Static22.aClass267_11.method6581(Static161.anInt3239) + local6 + "%";
				}
				Static200.anInt3785 = 20;
			}
		} else if (Static68.anInt7443 == 40) {
			if (Static378.aClass100_81.method2498()) {
				this.method1139(Static378.aClass100_81.method2515(1));
				Static65.aString15 = Static173.aClass267_49.method6581(Static161.anInt3239);
				Static200.anInt3785 = 25;
				Static68.anInt7443 = 50;
			} else {
				Static65.aString15 = Static229.aClass267_58.method6581(Static161.anInt3239) + Static378.aClass100_81.method2502() + "%";
				Static200.anInt3785 = 25;
			}
		} else if (Static68.anInt7443 == 50) {
			Static65.method1835();
			Static65.aString15 = Static443.aClass267_109.method6581(Static161.anInt3239);
			Static68.anInt7443 = 60;
			Static200.anInt3785 = 30;
		} else if (Static68.anInt7443 == 60) {
			local6 = Static65.method1837(Static350.aClass100_69, Static410.aClass100_89);
			local52 = Static36.method907();
			if (local52 > local6) {
				Static65.aString15 = Static93.aClass267_28.method6581(Static161.anInt3239) + local6 * 100 / local52 + "%";
				Static200.anInt3785 = 35;
			} else {
				Static65.aString15 = Static366.aClass267_88.method6581(Static161.anInt3239);
				Static200.anInt3785 = 35;
				Static68.anInt7443 = 70;
			}
		} else {
			@Pc(571) int local571;
			if (Static68.anInt7443 == 70) {
				local52 = Static408.method6018(Static350.aClass100_69);
				local571 = Static356.method5278();
				if (local571 > local52) {
					Static65.aString15 = Static27.aClass267_14.method6581(Static161.anInt3239) + local52 * 100 / local571 + "%";
					Static200.anInt3785 = 40;
				} else {
					Static65.aString15 = Static135.aClass267_46.method6581(Static161.anInt3239);
					Static200.anInt3785 = 40;
					Static68.anInt7443 = 80;
				}
			} else if (Static68.anInt7443 == 80) {
				if (Static110.aClass100_88.method2498()) {
					Static397.anInterface8_6 = new Class226(Static110.aClass100_88, Static71.aClass100_11, Static350.aClass100_69);
					Static65.aString15 = Static429.aClass267_105.method6581(Static161.anInt3239);
					Static68.anInt7443 = 90;
					Static200.anInt3785 = 45;
				} else {
					Static65.aString15 = Static75.aClass267_25.method6581(Static161.anInt3239) + Static110.aClass100_88.method2502() + "%";
					Static200.anInt3785 = 45;
				}
			} else if (Static68.anInt7443 == 90) {
				Static65.aString15 = Static115.aClass267_33.method6581(Static161.anInt3239);
				Static200.anInt3785 = 50;
				Static68.anInt7443 = 95;
			} else if (Static68.anInt7443 == 95) {
				if (Static291.aClass28_Sub1_1.aBoolean79) {
					Static291.aClass28_Sub1_1.anInt1038 = 0;
					Static291.aClass28_Sub1_1.anInt1035 = 0;
					Static291.aClass28_Sub1_1.anInt1023 = 1;
					Static291.aClass28_Sub1_1.anInt1032 = 0;
					Static291.aClass28_Sub1_1.anInt1037 = 0;
				}
				Static291.aClass28_Sub1_1.aBoolean79 = true;
				Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
				Static160.method2665(Static291.aClass28_Sub1_1.anInt1032, false);
				Static65.aString15 = Static286.aClass267_68.method6581(Static161.anInt3239);
				Static200.anInt3785 = 55;
				Static68.anInt7443 = 100;
			} else if (Static68.anInt7443 == 100) {
				Static175.method2902(Static126.aClass66_5, Static350.aClass100_69, Static410.aClass100_89);
				Static65.aString15 = Static128.aClass267_45.method6581(Static161.anInt3239);
				Static200.anInt3785 = 60;
				Static100.method1818(5);
				Static68.anInt7443 = 110;
			} else if (Static68.anInt7443 == 110) {
				Static22.aClass100_4.method2498();
				local52 = Static22.aClass100_4.method2502();
				Static289.aClass100_53.method2498();
				local52 += Static289.aClass100_53.method2502();
				Static31.aClass100_6.method2498();
				local52 += Static31.aClass100_6.method2502();
				Static226.aClass100_61.method2498();
				local52 += Static226.aClass100_61.method2502();
				Static387.aClass100_85.method2498();
				local52 += Static387.aClass100_85.method2502();
				Static340.aClass100_68.method2498();
				local52 += Static340.aClass100_68.method2502();
				Static75.aClass100_12.method2498();
				local52 += Static75.aClass100_12.method2502();
				Static119.aClass100_84.method2498();
				local52 += Static119.aClass100_84.method2502();
				Static328.aClass100_62.method2498();
				local52 += Static328.aClass100_62.method2502();
				Static441.aClass100_94.method2498();
				local52 += Static441.aClass100_94.method2502();
				Static248.aClass100_91.method2498();
				local52 += Static248.aClass100_91.method2502();
				Static44.aClass100_9.method2498();
				local52 += Static44.aClass100_9.method2502();
				if (local52 < 1200) {
					Static65.aString15 = Static270.aClass267_63.method6581(Static161.anInt3239) + local52 / 12 + "%";
					Static200.anInt3785 = 65;
				} else {
					Static80.aClass181_1 = new Class181(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static145.aClass27_1 = new Class27(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static71.aClass83_1 = new Class83(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4, Static350.aClass100_69);
					Static176.aClass192_1 = new Class192(Static4.aClass36_5, Static161.anInt3239, Static31.aClass100_6);
					Static281.aClass253_4 = new Class253(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static134.aClass140_3 = new Class140(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static270.aClass18_1 = new Class18(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4, Static335.aClass100_66);
					Static300.aClass225_1 = new Class225(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static126.aClass39_1 = new Class39(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static448.aClass104_4 = new Class104(Static4.aClass36_5, Static161.anInt3239, true, Static289.aClass100_53, Static335.aClass100_66);
					Static244.aClass169_29 = new Class169(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4, Static350.aClass100_69);
					Static314.aClass108_4 = new Class108(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4, Static350.aClass100_69);
					Static235.aClass263_2 = new Class263(Static4.aClass36_5, Static161.anInt3239, true, Static226.aClass100_61, Static335.aClass100_66);
					Static380.aClass231_2 = new Class231(Static4.aClass36_5, Static161.anInt3239, true, Static80.aClass181_1, Static387.aClass100_85, Static335.aClass100_66);
					Static282.aClass164_1 = new Class164(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static5.aClass217_1 = new Class217(Static4.aClass36_5, Static161.anInt3239, Static340.aClass100_68, Static214.aClass100_41, Static243.aClass100_47);
					Static133.aClass133_2 = new Class133(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static89.aClass70_1 = new Class70(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static141.aClass141_2 = new Class141(Static4.aClass36_5, Static161.anInt3239, Static75.aClass100_12, Static335.aClass100_66);
					Static89.aClass229_1 = new Class229(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static173.aClass248_1 = new Class248(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static388.aClass206_1 = new Class206(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static69.aClass103_1 = new Class103(Static4.aClass36_5, Static161.anInt3239, Static119.aClass100_84);
					Static447.aClass257_10 = new Class257(Static4.aClass36_5, Static161.anInt3239, Static22.aClass100_4);
					Static402.method5959(Static137.aClass100_23, Static335.aClass100_66, Static410.aClass100_89, Static350.aClass100_69);
					Static399.method5883(Static44.aClass100_9);
					Static262.aClass237_2 = new Class237(Static161.anInt3239, Static328.aClass100_62, Static441.aClass100_94);
					Static426.aClass149_2 = new Class149(Static161.anInt3239, Static328.aClass100_62, Static441.aClass100_94, new Class1());
					Static65.aString15 = Static428.aClass267_104.method6581(Static161.anInt3239);
					Static200.anInt3785 = 65;
					Static322.method4638();
					Static448.aClass104_4.method2619(!Static291.aClass28_Sub1_1.method832(Static294.anInt5208));
					Static393.aClass207_1 = new Class207();
					Static54.method1228();
					Static141.method1123(Static248.aClass100_91);
					Static133.method5722(Static335.aClass100_66, Static397.anInterface8_6);
					Static68.anInt7443 = 120;
				}
			} else if (Static68.anInt7443 == 120) {
				local52 = Static69.method1413(Static350.aClass100_69);
				local571 = Static258.method3950();
				if (local52 < local571) {
					Static65.aString15 = Static191.aClass267_51.method6581(Static161.anInt3239) + local52 * 100 / local571 + "%";
					Static200.anInt3785 = 70;
				} else {
					Static281.method4261(Static126.aClass66_5, Static350.aClass100_69);
					Static35.method859(Static15.aClass87Array1);
					Static65.aString15 = Static54.aClass267_19.method6581(Static161.anInt3239);
					Static200.anInt3785 = 70;
					Static68.anInt7443 = 130;
				}
			} else if (Static68.anInt7443 == 130) {
				if (Static300.aClass100_56.method2509("", "huffman")) {
					@Pc(1206) Class147 local1206 = new Class147(Static300.aClass100_56.method2519("huffman", ""));
					Static190.method579(local1206);
					Static65.aString15 = Static300.aClass267_69.method6581(Static161.anInt3239);
					Static200.anInt3785 = 75;
					Static68.anInt7443 = 140;
				} else {
					Static65.aString15 = Static90.aClass267_26.method6581(Static161.anInt3239) + "0%";
					Static200.anInt3785 = 75;
				}
			} else if (Static68.anInt7443 == 140) {
				if (Static137.aClass100_23.method2498()) {
					Static65.aString15 = Static335.aClass267_79.method6581(Static161.anInt3239);
					Static68.anInt7443 = 150;
					Static200.anInt3785 = 80;
				} else {
					Static65.aString15 = Static247.aClass267_59.method6581(Static161.anInt3239) + Static137.aClass100_23.method2502() + "%";
					Static200.anInt3785 = 80;
				}
			} else if (Static68.anInt7443 == 150) {
				if (Static321.aClass100_60.method2498()) {
					Static65.aString15 = Static122.aClass267_39.method6581(Static161.anInt3239);
					Static200.anInt3785 = 82;
					Static68.anInt7443 = 160;
				} else {
					Static65.aString15 = Static285.aClass267_92.method6581(Static161.anInt3239) + Static321.aClass100_60.method2502() + "%";
					Static200.anInt3785 = 82;
				}
			} else if (Static68.anInt7443 == 160) {
				if (Static410.aClass100_89.method2498()) {
					Static65.aString15 = Static27.aClass267_13.method6581(Static161.anInt3239);
					Static68.anInt7443 = 170;
					Static200.anInt3785 = 85;
				} else {
					Static65.aString15 = Static27.aClass267_13.method6581(Static161.anInt3239) + Static410.aClass100_89.method2502() + "%";
					Static200.anInt3785 = 85;
				}
			} else if (Static68.anInt7443 == 170) {
				if (Static173.aClass100_34.method2496("details")) {
					Static7.method921(Static173.aClass100_34, Static281.aClass253_4, Static134.aClass140_3, Static448.aClass104_4, Static244.aClass169_29, Static314.aClass108_4, Static393.aClass207_1);
					Static65.aString15 = Static402.aClass267_96.method6581(Static161.anInt3239);
					Static68.anInt7443 = 180;
					Static200.anInt3785 = 89;
				} else {
					Static65.aString15 = Static19.aClass267_8.method6581(Static161.anInt3239) + Static173.aClass100_34.method2508("details") + "%";
					Static200.anInt3785 = 87;
				}
			} else if (Static68.anInt7443 == 180) {
				local52 = Static66.method1371();
				if (local52 == -1) {
					Static65.aString15 = Static38.aClass267_15.method6581(Static161.anInt3239);
					Static200.anInt3785 = 90;
				} else if (local52 == 7 || local52 == 9) {
					this.method1135("worldlistfull");
					Static100.method1818(1000);
				} else if (Static425.aBoolean363) {
					Static65.aString15 = Static305.aClass267_71.method6581(Static161.anInt3239);
					Static200.anInt3785 = 90;
					Static68.anInt7443 = 190;
				} else {
					this.method1135("worldlistio_" + local52);
					Static100.method1818(1000);
				}
			} else if (Static68.anInt7443 == 190) {
				Static331.anIntArray389 = new int[Static388.aClass206_1.anInt5535];
				Static172.aStringArray23 = new String[Static173.aClass248_1.anInt7379];
				Static384.aBooleanArray25 = new boolean[Static388.aClass206_1.anInt5535];
				for (local52 = 0; local52 < Static388.aClass206_1.anInt5535; local52++) {
					if (Static388.aClass206_1.method4621(local52).anInt6316 == 0) {
						Static384.aBooleanArray25[local52] = true;
						Static304.anInt5382++;
					}
					Static331.anIntArray389[local52] = -1;
				}
				Static116.method2019();
				Static291.anInt5197 = Static137.aClass100_23.method2494("loginscreen");
				Static332.aClass100_63.method2500(false);
				Static263.aClass100_51.method2500(true);
				Static350.aClass100_69.method2500(true);
				Static410.aClass100_89.method2500(true);
				Static300.aClass100_56.method2500(true);
				Static137.aClass100_23.method2500(true);
				Static22.aClass100_4.anInt2998 = 2;
				Static128.aBoolean179 = true;
				Static31.aClass100_6.anInt2998 = 2;
				Static289.aClass100_53.anInt2998 = 2;
				Static226.aClass100_61.anInt2998 = 2;
				Static387.aClass100_85.anInt2998 = 2;
				Static340.aClass100_68.anInt2998 = 2;
				Static75.aClass100_12.anInt2998 = 2;
				Static21.method609(Static291.aClass28_Sub1_1.anInt1023, -1, -1, false);
				Static65.aString15 = Static151.aClass267_47.method6581(Static161.anInt3239);
				Static200.anInt3785 = 95;
				Static68.anInt7443 = 200;
			} else if (Static68.anInt7443 == 200) {
				Static192.method3048(true);
			}
		}
	}
}
