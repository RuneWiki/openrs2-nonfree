import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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
				Static272.method2776("argument count");
			}
			Static145.anInt2772 = Integer.parseInt(arg0[0]);
			Static252.anInt5207 = 2;
			if (arg0[1].equals("live")) {
				Static69.anInt1255 = 0;
			} else if (arg0[1].equals("rc")) {
				Static69.anInt1255 = 1;
			} else if (arg0[1].equals("wip")) {
				Static69.anInt1255 = 2;
			} else {
				Static272.method2776("modewhat");
			}
			Static206.aBoolean289 = false;
			Static134.anInt4352 = Static92.method1365(arg0[2]);
			if (Static134.anInt4352 == -1) {
				if (arg0[2].equals("english")) {
					Static134.anInt4352 = 0;
				} else if (arg0[2].equals("german")) {
					Static134.anInt4352 = 1;
				} else {
					Static272.method2776("language");
				}
			}
			Static25.method414(Static134.anInt4352);
			Static35.aBoolean54 = false;
			Static109.aBoolean207 = false;
			if (arg0[3].equals("game0")) {
				Static47.anInt5990 = 0;
			} else if (arg0[3].equals("game1")) {
				Static47.anInt5990 = 1;
			} else {
				Static272.method2776("game");
			}
			Static60.anInt723 = 0;
			Static62.aBoolean87 = false;
			Static62.aString50 = "";
			Static215.anInt4213 = 0;
			@Pc(128) client local128 = new client();
			Static110.aClient1 = local128;
			local128.method600(Static69.anInt1255 + 32, Static47.anInt5990 == 1 ? "mechscape" : "runescape");
			Static276.aFrame2.setLocation(40, 40);
		} catch (@Pc(155) Exception local155) {
			Static42.method613(null, local155);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method611() {
		for (Static85.anInt1596 = 0; Static109.method2614() && Static85.anInt1596 < 128; Static85.anInt1596++) {
			Static307.anIntArray622[Static85.anInt1596] = Static245.anInt6028;
			Static123.anIntArray281[Static85.anInt1596] = Static75.aChar4;
		}
		Static140.anInt2709++;
		if (Static66.anInt1232 != -1) {
			Static100.method1603(Static66.anInt1232, 0, 0, Static123.anInt2333, Static253.anInt5224, 0, 0);
		}
		Static201.anInt3956++;
		if (Static283.aBoolean393) {
			label197: for (@Pc(55) int local55 = 0; local55 < 32768; local55++) {
				@Pc(64) Class10_Sub5_Sub2 local64 = Static110.aClass10_Sub5_Sub2Array1[local55];
				if (local64 != null) {
					@Pc(71) byte local71 = local64.aClass124_1.aByte19;
					if ((local71 & 0x2) > 0 && local64.anInt5044 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(94) int local94 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(102) int local102 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local94 != 0 || local102 != 0) {
							local64.anIntArray537[0] = (local64.anInt5073 >> 7) + local94;
							local64.anIntArray535[0] = (local64.anInt5016 >> 7) + local102;
							local64.aByteArray69[0] = 1;
							Static138.aClass153Array1[Static99.anInt1826].method4089(local64.anInt5016 >> 7, false, 0, local64.method4186(), false, local64.anInt5073 >> 7, local64.method4186());
							if (local64.anIntArray537[0] >= 0 && local64.anIntArray537[0] <= 104 - local64.method4186() && local64.anIntArray535[0] >= 0 && local64.anIntArray535[0] <= 104 - local64.method4186() && Static138.aClass153Array1[Static99.anInt1826].method4076(local64.anInt5016 >> 7, local64.anInt5073 >> 7, local64.anIntArray535[0], local64.anIntArray537[0])) {
								if (local64.method4186() > 1) {
									for (@Pc(232) int local232 = local64.anIntArray537[0]; local232 < local64.anIntArray537[0] + local64.method4186(); local232++) {
										for (@Pc(248) int local248 = local64.anIntArray535[0]; local248 < local64.anIntArray535[0] + local64.method4186(); local248++) {
											if ((Static138.aClass153Array1[Static99.anInt1826].anIntArrayArray69[local232][local248] & 0x2401FF) != 0) {
												continue label197;
											}
										}
									}
								}
								local64.anInt5044 = 1;
							}
						}
					}
					Static259.method4350(local64);
					Static186.method3126(local64);
					Static240.method4069(local64);
					Static138.aClass153Array1[Static99.anInt1826].method4075(local64.anInt5073 >> 7, local64.method4186(), false, local64.anInt5016 >> 7, local64.method4186(), false);
				}
			}
		}
		if (!Static283.aBoolean393 && Static47.anInt5990 == 0) {
			Static73.method1116();
		} else if (Static241.anInt4885 == 0 && Static214.anInt4184 == 0) {
			if (Static25.anInt467 == 2) {
				Static60.method609();
			} else {
				Static65.method1017();
			}
			if (Static230.anInt4492 >> 7 < 14 || Static230.anInt4492 >> 7 >= 90 || Static173.anInt3251 >> 7 < 14 || Static173.anInt3251 >> 7 >= 90) {
				Static48.method755();
			}
		}
		while (true) {
			@Pc(383) Class3_Sub24 local383;
			@Pc(391) Class151 local391;
			@Pc(400) Class151 local400;
			do {
				local383 = (Class3_Sub24) Static236.aClass56_23.method1279();
				if (local383 == null) {
					while (true) {
						do {
							local383 = (Class3_Sub24) Static253.aClass56_24.method1279();
							if (local383 == null) {
								while (true) {
									do {
										local383 = (Class3_Sub24) Static5.aClass56_1.method1279();
										if (local383 == null) {
											if (Static191.aClass151_10 != null) {
												Static232.method3803();
											}
											if (Static120.aClass178_1 != null && Static120.aClass178_1.anInt5649 == 1) {
												if (Static120.aClass178_1.anObject6 != null) {
													Static17.method291(Static85.aString63, Static306.aBoolean428);
												}
												Static120.aClass178_1 = null;
												Static306.aBoolean428 = false;
												Static85.aString63 = null;
											}
											if (Static124.anInt2371 % 1500 == 0) {
												Static109.method2615();
											}
											return;
										}
										local391 = local383.aClass151_13;
										if (local391.anInt4776 < 0) {
											break;
										}
										local400 = Static243.method4115(local391.anInt4727);
									} while (local400 == null || local400.aClass151Array2 == null || local400.aClass151Array2.length <= local391.anInt4776 || local391 != local400.aClass151Array2[local391.anInt4776]);
									Static161.method2653(local383);
								}
							}
							local391 = local383.aClass151_13;
							if (local391.anInt4776 < 0) {
								break;
							}
							local400 = Static243.method4115(local391.anInt4727);
						} while (local400 == null || local400.aClass151Array2 == null || local391.anInt4776 >= local400.aClass151Array2.length || local391 != local400.aClass151Array2[local391.anInt4776]);
						Static161.method2653(local383);
					}
				}
				local391 = local383.aClass151_13;
				if (local391.anInt4776 < 0) {
					break;
				}
				local400 = Static243.method4115(local391.anInt4727);
			} while (local400 == null || local400.aClass151Array2 == null || local391.anInt4776 >= local400.aClass151Array2.length || local391 != local400.aClass151Array2[local391.anInt4776]);
			Static161.method2653(local383);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method614() {
		@Pc(7) boolean local7 = Static161.aClass177_1.method4549();
		if (!local7) {
			this.method616();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method616() {
		if (Static161.aClass177_1.anInt5592 > Static133.anInt2589) {
			if (Static51.anInt995 == Static203.anInt3974) {
				Static51.anInt995 = Static152.anInt2881;
			} else {
				Static51.anInt995 = Static203.anInt3974;
			}
			Static135.anInt2615 = (Static161.aClass177_1.anInt5592 - 1) * 5 * 50;
			if (Static135.anInt2615 > 3000) {
				Static135.anInt2615 = 3000;
			}
			if (Static161.aClass177_1.anInt5592 >= 2 && Static161.aClass177_1.anInt5591 == 6) {
				this.method602("js5connect_outofdate");
				Static10.anInt190 = 1000;
				return;
			}
			if (Static161.aClass177_1.anInt5592 >= 4 && Static161.aClass177_1.anInt5591 == -1) {
				this.method602("js5crc");
				Static10.anInt190 = 1000;
				return;
			}
			if (Static161.aClass177_1.anInt5592 >= 4 && (Static10.anInt190 == 0 || Static10.anInt190 == 5)) {
				if (Static161.aClass177_1.anInt5591 == 7 || Static161.aClass177_1.anInt5591 == 9) {
					this.method602("js5connect_full");
				} else if (Static161.aClass177_1.anInt5591 <= 0) {
					this.method602("js5io");
				} else {
					this.method602("js5connect");
				}
				Static10.anInt190 = 1000;
				return;
			}
		}
		Static133.anInt2589 = Static161.aClass177_1.anInt5592;
		if (Static135.anInt2615 > 0) {
			Static135.anInt2615--;
			return;
		}
		try {
			if (Static245.anInt6026 == 0) {
				Static291.aClass178_9 = Static274.aClass176_4.method4521(Static307.aString230, Static51.anInt995);
				Static245.anInt6026++;
			}
			if (Static245.anInt6026 == 1) {
				if (Static291.aClass178_9.anInt5649 == 2) {
					this.method617(1000);
					return;
				}
				if (Static291.aClass178_9.anInt5649 == 1) {
					Static245.anInt6026++;
				}
			}
			if (Static245.anInt6026 == 2) {
				Static41.aClass139_1 = new Class139((Socket) Static291.aClass178_9.anObject6, Static274.aClass176_4);
				@Pc(185) Class3_Sub26 local185 = new Class3_Sub26(5);
				local185.method3907(15);
				local185.method3944(554);
				Static41.aClass139_1.method3556(local185.aByteArray64, 5);
				Static245.anInt6026++;
				Static105.aLong76 = Static128.method2196();
			}
			if (Static245.anInt6026 == 3) {
				if (Static10.anInt190 == 0 || Static10.anInt190 == 5 || Static41.aClass139_1.method3554() > 0) {
					@Pc(226) int local226 = Static41.aClass139_1.method3553();
					if (local226 != 0) {
						this.method617(local226);
						return;
					}
					Static245.anInt6026++;
				} else if (Static128.method2196() - Static105.aLong76 > 30000L) {
					this.method617(1001);
					return;
				}
			}
			if (Static245.anInt6026 == 4) {
				@Pc(282) boolean local282 = Static10.anInt190 == 5 || Static10.anInt190 == 10 || Static10.anInt190 == 28;
				Static161.aClass177_1.method4544(Static41.aClass139_1, !local282);
				Static41.aClass139_1 = null;
				Static245.anInt6026 = 0;
				Static291.aClass178_9 = null;
			}
		} catch (@Pc(299) IOException local299) {
			this.method617(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method617(@OriginalArg(0) int arg0) {
		Static161.aClass177_1.anInt5591 = arg0;
		Static291.aClass178_9 = null;
		Static161.aClass177_1.anInt5592++;
		Static245.anInt6026 = 0;
		Static41.aClass139_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method595() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method597() {
		if (Static283.aBoolean393) {
			Static283.method4652();
		}
		if (Static73.aFrame1 != null) {
			Static252.method4275(Static73.aFrame1, Static274.aClass176_4);
			Static73.aFrame1 = null;
		}
		if (Static23.aClass136_1 != null) {
			Static23.aClass136_1.aBoolean294 = false;
		}
		Static23.aClass136_1 = null;
		if (Static150.aClass139_3 != null) {
			Static150.aClass139_3.method3559();
			Static150.aClass139_3 = null;
		}
		Static229.method3779(Static224.aCanvas12);
		Static54.method838(Static224.aCanvas12);
		if (Static307.aClass77_1 != null) {
			Static307.aClass77_1.method1849(Static224.aCanvas12);
		}
		Static300.method4858();
		Static102.method1632();
		Static307.aClass77_1 = null;
		if (Static32.aClass105_1 != null) {
			Static32.aClass105_1.method2782();
		}
		if (Static187.aClass105_2 != null) {
			Static187.aClass105_2.method2782();
		}
		Static161.aClass177_1.method4548();
		Static254.aClass117_2.method2954();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method601() {
		if (Static10.anInt190 == 1000) {
			return;
		}
		Static124.anInt2371++;
		if (Static124.anInt2371 % 1000 == 1) {
			@Pc(31) GregorianCalendar local31 = new GregorianCalendar();
			Static232.anInt4518 = local31.get(11) * 600 + local31.get(12) * 10 + local31.get(13) / 6;
			Static3.aRandom1.setSeed((long) Static232.anInt4518);
		}
		this.method614();
		if (Static79.aClass188_2 != null) {
			Static79.aClass188_2.method4867();
		}
		Static34.method531();
		Static174.method2872();
		Static109.method2612();
		Static259.method4347();
		if (Static283.aBoolean393) {
			Static189.method3148();
		}
		if (Static307.aClass77_1 != null) {
			@Pc(81) int local81 = Static307.aClass77_1.method1848();
			Static235.anInt4699 = local81;
		}
		if (Static10.anInt190 == 0) {
			this.method628();
			Static21.method347();
		} else if (Static10.anInt190 == 5) {
			this.method628();
			Static21.method347();
		} else if (Static10.anInt190 == 25 || Static10.anInt190 == 28) {
			Static239.method4063();
		}
		if (Static10.anInt190 == 10) {
			this.method611();
			Static158.method2620();
			Static197.method4296();
			Static199.method3285();
		} else if (Static10.anInt190 == 30) {
			Static28.method430();
		} else if (Static10.anInt190 == 40) {
			Static199.method3285();
			if (Static98.anInt1803 != -3) {
				if (Static98.anInt1803 == 15) {
					Static243.method4111();
				} else if (Static98.anInt1803 != 2) {
					Static5.method101();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method626(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class3_Sub26 local15 = new Class3_Sub26(arg0);
		while (true) {
			@Pc(21) int local21;
			do {
				while (true) {
					local21 = local15.method3915();
					if (local21 == 0) {
						return;
					}
					if (local21 != 1) {
						break;
					}
					@Pc(76) int[] local76 = Static293.anIntArray604 = new int[6];
					local76[0] = local15.method3948();
					local76[1] = local15.method3948();
					local76[2] = local15.method3948();
					local76[3] = local15.method3948();
					local76[4] = local15.method3948();
					local76[5] = local15.method3948();
				}
			} while (local21 != 4);
			@Pc(36) int local36 = local15.method3915();
			Static266.anIntArray564 = new int[local36];
			for (@Pc(41) int local41 = 0; local41 < local36; local41++) {
				Static266.anIntArray564[local41] = local15.method3948();
				if (Static266.anIntArray564[local41] == 65535) {
					Static266.anIntArray564[local41] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method628() {
		if (!Static19.aBoolean34) {
			label258: while (true) {
				do {
					if (!Static109.method2614()) {
						break label258;
					}
				} while (Static75.aChar4 != 's' && Static75.aChar4 != 'S');
				Static19.aBoolean34 = true;
			}
		}
		@Pc(38) int local38;
		if (Static202.anInt3967 == 0) {
			@Pc(28) Runtime local28 = Runtime.getRuntime();
			local38 = (int) ((local28.totalMemory() - local28.freeMemory()) / 1024L);
			@Pc(41) long local41 = Static128.method2196();
			if (Static300.aLong235 == 0L) {
				Static300.aLong235 = local41;
			}
			if (local38 > 16384 && local41 - Static300.aLong235 < 5000L) {
				if (local41 - Static103.aLong74 > 1000L) {
					System.gc();
					Static103.aLong74 = local41;
				}
				Static27.aString15 = Static266.aString195;
				Static37.anInt657 = 5;
			} else {
				Static37.anInt657 = 5;
				Static27.aString15 = Static32.aString21;
				Static202.anInt3967 = 10;
			}
			return;
		}
		@Pc(94) int local94;
		if (Static202.anInt3967 == 10) {
			for (local94 = 0; local94 < 4; local94++) {
				Static138.aClass153Array1[local94] = new Class153(104, 104);
			}
			Static27.aString15 = Static42.aString29;
			Static37.anInt657 = 10;
			Static202.anInt3967 = 30;
		} else if (Static202.anInt3967 == 30) {
			if (Static79.aClass188_2 == null) {
				Static79.aClass188_2 = new Class188(Static161.aClass177_1, Static254.aClass117_2);
			}
			if (Static79.aClass188_2.method4866()) {
				Static257.aClass155_107 = Static301.method4862(true, false, 0, true);
				Static129.aClass155_54 = Static301.method4862(true, false, 1, true);
				Static278.aClass155_101 = Static301.method4862(true, true, 2, false);
				Static56.aClass155_29 = Static301.method4862(true, false, 3, true);
				Static220.aClass155_105 = Static301.method4862(true, false, 4, true);
				Static62.aClass155_30 = Static301.method4862(true, true, 5, true);
				Static257.aClass155_106 = Static301.method4862(false, true, 6, true);
				Static49.aClass155_27 = Static301.method4862(true, false, 7, true);
				Static65.aClass155_31 = Static301.method4862(true, false, 8, true);
				Static181.aClass155_80 = Static301.method4862(true, false, 9, true);
				Static2.aClass155_1 = Static301.method4862(true, false, 10, true);
				Static161.aClass155_65 = Static301.method4862(true, false, 11, true);
				Static195.aClass155_82 = Static301.method4862(true, false, 12, true);
				Static268.aClass155_113 = Static301.method4862(true, false, 13, true);
				Static222.aClass155_92 = Static301.method4862(false, false, 14, true);
				Static9.aClass155_4 = Static301.method4862(true, false, 15, true);
				Static224.aClass155_120 = Static301.method4862(true, false, 16, true);
				Static288.aClass155_118 = Static301.method4862(true, false, 17, true);
				Static48.aClass155_26 = Static301.method4862(true, false, 18, true);
				Static152.aClass155_63 = Static301.method4862(true, false, 19, true);
				Static178.aClass155_71 = Static301.method4862(true, false, 20, true);
				Static107.aClass155_50 = Static301.method4862(true, false, 21, true);
				Static198.aClass155_84 = Static301.method4862(true, false, 22, true);
				Static81.aClass155_38 = Static301.method4862(true, true, 23, true);
				Static102.aClass155_49 = Static301.method4862(true, false, 24, true);
				Static65.aClass155_32 = Static301.method4862(true, false, 25, true);
				Static196.aClass155_83 = Static301.method4862(true, true, 26, true);
				Static94.aClass155_41 = Static301.method4862(true, false, 27, true);
				Static288.aClass155_117 = Static301.method4862(true, true, 28, true);
				Static37.anInt657 = 15;
				Static202.anInt3967 = 40;
				Static27.aString15 = Static29.aString19;
			} else {
				Static37.anInt657 = 12;
				Static27.aString15 = Static265.aString201;
			}
		} else if (Static202.anInt3967 == 40) {
			local94 = 0;
			for (local38 = 0; local38 < 29; local38++) {
				local94 += Static196.aClass4_Sub1Array1[local38].method3432() * Static279.anIntArray582[local38] / 100;
			}
			if (local94 == 100) {
				Static27.aString15 = Static288.aString219;
				Static37.anInt657 = 20;
				Static42.method610(Static65.aClass155_31);
				Static120.method2009(Static65.aClass155_31);
				Static252.method4277(Static65.aClass155_31);
				Static202.anInt3967 = 41;
			} else {
				if (local94 != 0) {
					Static27.aString15 = Static11.aString179 + local94 + "%";
				}
				Static37.anInt657 = 20;
			}
		} else if (Static202.anInt3967 == 41) {
			if (Static288.aClass155_117.method4134()) {
				this.method626(Static288.aClass155_117.method4137(1));
				Static37.anInt657 = 25;
				Static27.aString15 = Static107.aString78;
				Static202.anInt3967 = 45;
			} else {
				Static27.aString15 = Static47.aString226 + Static288.aClass155_117.method4124() + "%";
				Static37.anInt657 = 25;
			}
		} else if (Static202.anInt3967 == 45) {
			Static27.method426(Static110.aBoolean160);
			Static22.aClass3_Sub15_Sub4_1 = new Class3_Sub15_Sub4();
			Static22.aClass3_Sub15_Sub4_1.method4591();
			Static32.aClass105_1 = Static31.method475(0, Static224.aCanvas12, 22050, Static274.aClass176_4);
			Static32.aClass105_1.method2777(Static22.aClass3_Sub15_Sub4_1);
			Static64.method1011(Static22.aClass3_Sub15_Sub4_1, Static222.aClass155_92, Static9.aClass155_4, Static220.aClass155_105);
			Static187.aClass105_2 = Static31.method475(1, Static224.aCanvas12, 2048, Static274.aClass176_4);
			Static86.aClass3_Sub15_Sub2_1 = new Class3_Sub15_Sub2();
			Static187.aClass105_2.method2777(Static86.aClass3_Sub15_Sub2_1);
			Static231.aClass152_1 = new Class152(22050, Static155.anInt2915);
			Static91.anInt1672 = Static257.aClass155_106.method4120("scape main");
			Static202.anInt3967 = 50;
			Static27.aString15 = Static60.aString27;
			Static37.anInt657 = 30;
		} else if (Static202.anInt3967 == 50) {
			local94 = Static184.method3091(Static268.aClass155_113, Static65.aClass155_31);
			local38 = Static58.method943();
			if (local94 < local38) {
				Static27.aString15 = Static64.aString53 + local94 * 100 / local38 + "%";
				Static37.anInt657 = 35;
			} else {
				Static202.anInt3967 = 60;
				Static27.aString15 = Static204.aString140;
				Static37.anInt657 = 35;
			}
		} else if (Static202.anInt3967 == 60) {
			local94 = Static257.method4339(Static65.aClass155_31);
			local38 = Static26.method416();
			if (local38 > local94) {
				Static37.anInt657 = 40;
				Static27.aString15 = Static118.aString89 + local94 * 100 / local38 + "%";
			} else {
				Static27.aString15 = Static256.aString188;
				Static37.anInt657 = 40;
				Static202.anInt3967 = 65;
			}
		} else if (Static202.anInt3967 == 65) {
			Static56.method918(Static65.aClass155_31, Static268.aClass155_113);
			Static37.anInt657 = 45;
			Static27.aString15 = Static43.aString31;
			Static264.method4398(5);
			Static202.anInt3967 = 70;
		} else if (Static202.anInt3967 == 70) {
			Static278.aClass155_101.method4134();
			local94 = Static278.aClass155_101.method4124();
			Static224.aClass155_120.method4134();
			local94 += Static224.aClass155_120.method4124();
			Static288.aClass155_118.method4134();
			local94 += Static288.aClass155_118.method4124();
			Static48.aClass155_26.method4134();
			local94 += Static48.aClass155_26.method4124();
			Static152.aClass155_63.method4134();
			local94 += Static152.aClass155_63.method4124();
			Static178.aClass155_71.method4134();
			local94 += Static178.aClass155_71.method4124();
			Static107.aClass155_50.method4134();
			local94 += Static107.aClass155_50.method4124();
			Static198.aClass155_84.method4134();
			local94 += Static198.aClass155_84.method4124();
			Static102.aClass155_49.method4134();
			local94 += Static102.aClass155_49.method4124();
			Static65.aClass155_32.method4134();
			local94 += Static65.aClass155_32.method4124();
			Static94.aClass155_41.method4134();
			local94 += Static94.aClass155_41.method4124();
			if (local94 < 1100) {
				Static37.anInt657 = 50;
				Static27.aString15 = Static38.aString24 + local94 / 11 + "%";
			} else {
				Static17.method297(Static278.aClass155_101);
				Static131.method2214(Static278.aClass155_101);
				Static267.method4417(Static278.aClass155_101);
				Static115.method1876(Static49.aClass155_27, Static278.aClass155_101);
				Static278.method4195(Static224.aClass155_120, Static49.aClass155_27);
				Static63.method1009(Static48.aClass155_26, Static49.aClass155_27);
				Static41.method570(Static175.aClass3_Sub4_Sub2_Sub2_1, Static152.aClass155_63, Static49.aClass155_27);
				Static91.method1361(Static278.aClass155_101);
				Static297.method1850(Static257.aClass155_107, Static129.aClass155_54, Static178.aClass155_71);
				Static168.method2793(Static278.aClass155_101);
				Static14.method230(Static107.aClass155_50, Static49.aClass155_27);
				Static265.method4460(Static198.aClass155_84);
				Static208.method3460(Static278.aClass155_101);
				Static208.method3459(Static56.aClass155_29, Static268.aClass155_113, Static65.aClass155_31, Static49.aClass155_27);
				Static248.method4170(Static278.aClass155_101);
				Static115.method1877(Static288.aClass155_118);
				Static94.method1387(Static102.aClass155_49, Static65.aClass155_32, new Class113());
				Static32.method502(Static102.aClass155_49, Static65.aClass155_32);
				Static47.method4908(Static278.aClass155_101);
				Static270.method4461(Static278.aClass155_101);
				Static217.method3571(Static278.aClass155_101);
				Static187.method3132(Static65.aClass155_31, Static278.aClass155_101);
				Static38.method558(Static65.aClass155_31, Static278.aClass155_101);
				Static100.method1604(Static278.aClass155_101, Static65.aClass155_31);
				Static37.anInt657 = 50;
				Static27.aString15 = Static173.aString116;
				Static102.method1628();
				Static202.anInt3967 = 80;
			}
		} else if (Static202.anInt3967 == 80) {
			local94 = Static64.method1013(Static65.aClass155_31);
			local38 = Static135.method2327();
			if (local94 < local38) {
				Static37.anInt657 = 60;
				Static27.aString15 = Static111.aString84 + local94 * 100 / local38 + "%";
			} else {
				Static190.method3182(Static65.aClass155_31);
				Static27.aString15 = Static233.aString162;
				Static37.anInt657 = 60;
				Static202.anInt3967 = 90;
			}
		} else if (Static202.anInt3967 == 90) {
			if (Static196.aClass155_83.method4134()) {
				@Pc(967) Class91_Sub1 local967 = new Class91_Sub1(Static181.aClass155_80, Static196.aClass155_83, Static65.aClass155_31, 20, !Static258.aBoolean367);
				Static16.method281(local967);
				if (Static251.anInt5174 == 1) {
					Static16.method278(0.9F);
				}
				if (Static251.anInt5174 == 2) {
					Static16.method278(0.8F);
				}
				if (Static251.anInt5174 == 3) {
					Static16.method278(0.7F);
				}
				if (Static251.anInt5174 == 4) {
					Static16.method278(0.6F);
				}
				Static37.anInt657 = 70;
				Static27.aString15 = Static90.aString70;
				Static202.anInt3967 = 100;
			} else {
				Static27.aString15 = Static70.aString55 + Static196.aClass155_83.method4124() + "%";
				Static37.anInt657 = 70;
			}
		} else if (Static202.anInt3967 == 100) {
			if (Static36.method539(Static65.aClass155_31)) {
				Static202.anInt3967 = 110;
			}
		} else if (Static202.anInt3967 == 110) {
			Static23.aClass136_1 = new Class136();
			Static274.aClass176_4.method4523(Static23.aClass136_1, 10);
			Static37.anInt657 = 75;
			Static27.aString15 = Static252.aString181;
			Static202.anInt3967 = 120;
		} else if (Static202.anInt3967 == 120) {
			if (Static2.aClass155_1.method4140("", "huffman")) {
				@Pc(1070) Class192 local1070 = new Class192(Static2.aClass155_1.method4149("", "huffman"));
				Static78.method1218(local1070);
				Static27.aString15 = Static117.aString88;
				Static37.anInt657 = 80;
				Static202.anInt3967 = 130;
			} else {
				Static27.aString15 = Static4.aString142 + "0%";
				Static37.anInt657 = 80;
			}
		} else if (Static202.anInt3967 == 130) {
			if (!Static56.aClass155_29.method4134()) {
				Static27.aString15 = Static222.aString155 + Static56.aClass155_29.method4124() * 3 / 4 + "%";
				Static37.anInt657 = 85;
			} else if (!Static195.aClass155_82.method4134()) {
				Static27.aString15 = Static222.aString155 + (Static195.aClass155_82.method4124() / 10 + 75) + "%";
				Static37.anInt657 = 85;
			} else if (!Static268.aClass155_113.method4134()) {
				Static27.aString15 = Static222.aString155 + (Static268.aClass155_113.method4124() / 20 + 85) + "%";
				Static37.anInt657 = 85;
			} else if (Static81.aClass155_38.method4145("details")) {
				Static228.method1190(Static81.aClass155_38);
				Static71.method1073(Static94.aClass155_41);
				Static261.method4358(Static49.aClass155_27);
				Static27.aString15 = Static216.aString149;
				Static37.anInt657 = 95;
				Static202.anInt3967 = 135;
			} else {
				Static27.aString15 = Static222.aString155 + (Static81.aClass155_38.method4143("details") / 10 + 90) + "%";
				Static37.anInt657 = 85;
			}
		} else if (Static202.anInt3967 == 135) {
			local94 = Static284.method4681();
			if (local94 == -1) {
				Static27.aString15 = Static132.aString94;
				Static37.anInt657 = 95;
			} else if (local94 == 7 || local94 == 9) {
				this.method602("worldlistfull");
				Static264.method4398(1000);
			} else if (Static134.aBoolean312) {
				Static37.anInt657 = 96;
				Static202.anInt3967 = 140;
				Static27.aString15 = Static208.aString143;
			} else {
				this.method602("worldlistio_" + local94);
				Static264.method4398(1000);
			}
		} else if (Static202.anInt3967 == 140) {
			Static156.anInt2936 = Static56.aClass155_29.method4120("loginscreen");
			Static62.aClass155_30.method4151(false);
			Static257.aClass155_106.method4151(true);
			Static65.aClass155_31.method4151(true);
			Static268.aClass155_113.method4151(true);
			Static2.aClass155_1.method4151(true);
			Static56.aClass155_29.method4151(true);
			Static202.anInt3967 = 150;
			Static37.anInt657 = 97;
			Static27.aString15 = Static22.aString12;
			Static43.aBoolean70 = true;
		} else if (Static202.anInt3967 == 150) {
			Static8.method141();
			if (Static19.aBoolean34) {
				Static268.anInt5481 = 0;
				Static224.anInt6084 = 0;
				Static255.anInt5254 = 0;
				Static120.anInt2254 = 0;
			}
			Static19.aBoolean34 = true;
			Static188.method3143(Static274.aClass176_4);
			Static203.method3359(-1, false, -1, Static255.anInt5254);
			Static202.anInt3967 = 160;
			Static37.anInt657 = 100;
			Static27.aString15 = Static88.aString68;
		} else if (Static202.anInt3967 == 160) {
			Static133.method2310(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method599()) {
			return;
		}
		Static145.anInt2772 = Integer.parseInt(this.getParameter("worldid"));
		Static252.anInt5207 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static252.anInt5207 < 0 || Static252.anInt5207 > 1) {
			Static252.anInt5207 = 0;
		}
		Static69.anInt1255 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static69.anInt1255 < 0 || Static69.anInt1255 > 2) {
			Static69.anInt1255 = 0;
		}
		@Pc(47) String local47 = this.getParameter("advertsuppressed");
		if (local47 != null && local47.equals("1")) {
			Static206.aBoolean289 = true;
		} else {
			Static206.aBoolean289 = false;
		}
		try {
			Static134.anInt4352 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(66) Exception local66) {
			Static134.anInt4352 = 0;
		}
		Static25.method414(Static134.anInt4352);
		@Pc(75) String local75 = this.getParameter("objecttag");
		if (local75 != null && local75.equals("1")) {
			Static35.aBoolean54 = true;
		} else {
			Static35.aBoolean54 = false;
		}
		@Pc(92) String local92 = this.getParameter("js");
		if (local92 != null && local92.equals("1")) {
			Static109.aBoolean207 = true;
		} else {
			Static109.aBoolean207 = false;
		}
		@Pc(109) String local109 = this.getParameter("game");
		if (local109 != null && local109.equals("1")) {
			Static47.anInt5990 = 1;
		} else {
			Static47.anInt5990 = 0;
		}
		try {
			Static60.anInt723 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static60.anInt723 = 0;
		}
		Static62.aString50 = this.getParameter("settings");
		if (Static62.aString50 == null) {
			Static62.aString50 = "";
		}
		@Pc(144) String local144 = this.getParameter("country");
		if (local144 != null) {
			try {
				Static215.anInt4213 = Integer.parseInt(local144);
			} catch (@Pc(152) Exception local152) {
				Static215.anInt4213 = 0;
			}
		}
		@Pc(158) String local158 = this.getParameter("haveie6");
		if (local158 != null && local158.equals("1")) {
			Static62.aBoolean87 = true;
		} else {
			Static62.aBoolean87 = false;
		}
		Static110.aClient1 = this;
		this.method596(Static69.anInt1255 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method603() {
		if (Static10.anInt190 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static117.method1917() / 1000000L - Static188.aLong159;
		Static188.aLong159 = Static117.method1917() / 1000000L;
		@Pc(25) boolean local25 = Static86.method1314();
		if (local25 && Static73.aBoolean123 && Static32.aClass105_1 != null) {
			Static32.aClass105_1.method2779();
		}
		if ((Static10.anInt190 == 30 || Static10.anInt190 == 10) && (Static90.aBoolean137 || Static262.aLong210 != 0L && Static128.method2196() > Static262.aLong210)) {
			Static203.method3359(Static132.anInt2491, Static90.aBoolean137, Static187.anInt3701, Static254.method4299());
		}
		@Pc(86) int local86;
		@Pc(90) int local90;
		if (Static73.aFrame1 == null) {
			@Pc(71) Container local71;
			if (Static73.aFrame1 != null) {
				local71 = Static73.aFrame1;
			} else if (Static276.aFrame2 == null) {
				local71 = Static274.aClass176_4.anApplet1;
			} else {
				local71 = Static276.aFrame2;
			}
			local86 = local71.getSize().width;
			local90 = local71.getSize().height;
			if (Static276.aFrame2 == local71) {
				@Pc(97) Insets local97 = Static276.aFrame2.getInsets();
				local86 -= local97.left + local97.right;
				local90 -= local97.top + local97.bottom;
			}
			if (Static199.anInt3882 != local86 || Static256.anInt5286 != local90) {
				if (Static275.aString208.startsWith("mac")) {
					Static256.anInt5286 = local90;
					Static199.anInt3882 = local86;
				} else {
					Static288.method4743();
				}
				Static262.aLong210 = Static128.method2196() + 500L;
			}
		}
		if (Static73.aFrame1 != null && !Static224.aBoolean432 && (Static10.anInt190 == 30 || Static10.anInt190 == 10)) {
			Static203.method3359(-1, false, -1, Static255.anInt5254);
		}
		@Pc(162) boolean local162 = false;
		if (Static176.aBoolean235) {
			local162 = true;
			Static176.aBoolean235 = false;
		}
		if (local162) {
			Static45.method685();
		}
		if (Static283.aBoolean393) {
			for (local86 = 0; local86 < 100; local86++) {
				Static292.aBooleanArray129[local86] = true;
			}
		}
		if (Static10.anInt190 == 0) {
			Static149.method2521(local162, null, Static37.anInt657, Static27.aString15);
		} else if (Static10.anInt190 == 5) {
			Static150.method2554(Static224.aClass3_Sub4_Sub2_14, false);
		} else if (Static10.anInt190 == 10) {
			Static58.method946();
		} else if (Static10.anInt190 == 25 || Static10.anInt190 == 28) {
			if (Static66.anInt1235 == 1) {
				if (Static221.anInt4335 > Static54.anInt1011) {
					Static54.anInt1011 = Static221.anInt4335;
				}
				local86 = (Static54.anInt1011 - Static221.anInt4335) * 50 / Static54.anInt1011;
				Static212.method3485(Static167.aString113 + "<br>(" + local86 + "%)", false);
			} else if (Static66.anInt1235 == 2) {
				if (Static134.anInt4353 < Static206.anInt4082) {
					Static134.anInt4353 = Static206.anInt4082;
				}
				local86 = (Static134.anInt4353 - Static206.anInt4082) * 50 / Static134.anInt4353 + 50;
				Static212.method3485(Static167.aString113 + "<br>(" + local86 + "%)", false);
			} else {
				Static212.method3485(Static167.aString113, false);
			}
		} else if (Static10.anInt190 == 30) {
			Static190.method3183(local17);
		} else if (Static10.anInt190 == 40) {
			Static212.method3485(Static179.aString120 + "<br>" + Static84.aString60, false);
		}
		if (Static283.aBoolean393 && Static10.anInt190 != 0) {
			Static283.method4637();
			for (local86 = 0; local86 < Static123.anInt2326; local86++) {
				Static223.aBooleanArray102[local86] = false;
			}
		} else {
			@Pc(363) Graphics local363;
			if ((Static10.anInt190 == 30 || Static10.anInt190 == 10) && Static111.anInt2048 == 0 && !local162) {
				try {
					local363 = Static224.aCanvas12.getGraphics();
					for (local90 = 0; local90 < Static123.anInt2326; local90++) {
						if (Static223.aBooleanArray102[local90]) {
							Static94.aClass128_1.method4295(Static73.anIntArray134[local90], Static278.anIntArray540[local90], Static150.anIntArray329[local90], Static125.anIntArray288[local90], local363);
							Static223.aBooleanArray102[local90] = false;
						}
					}
				} catch (@Pc(403) Exception local403) {
					Static224.aCanvas12.repaint();
				}
			} else if (Static10.anInt190 != 0) {
				try {
					local363 = Static224.aCanvas12.getGraphics();
					Static94.aClass128_1.method4291(local363);
					for (local90 = 0; local90 < Static123.anInt2326; local90++) {
						Static223.aBooleanArray102[local90] = false;
					}
				} catch (@Pc(437) Exception local437) {
					Static224.aCanvas12.repaint();
				}
			}
		}
		if (Static43.aBoolean70) {
			Static289.method4750();
		}
		if (Static19.aBoolean34 && Static10.anInt190 == 10 && Static66.anInt1232 != -1) {
			Static19.aBoolean34 = false;
			Static188.method3143(Static274.aClass176_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method592() {
		Static288.method4743();
		Static254.aClass117_2 = new Class117();
		Static161.aClass177_1 = new Class177();
		if (Static69.anInt1255 != 0) {
			Static34.aByteArrayArray15 = new byte[50][];
		}
		Static220.method4258(Static274.aClass176_4);
		if (Static252.anInt5207 == 0) {
			Static109.aString107 = this.getCodeBase().getHost();
			Static94.anInt1707 = 43594;
			Static239.anInt4856 = 443;
		} else if (Static252.anInt5207 == 1) {
			Static109.aString107 = this.getCodeBase().getHost();
			Static94.anInt1707 = Static145.anInt2772 + 40000;
			Static239.anInt4856 = Static145.anInt2772 + 50000;
		} else if (Static252.anInt5207 == 2) {
			Static239.anInt4856 = Static145.anInt2772 + 50000;
			Static109.aString107 = "127.0.0.1";
			Static94.anInt1707 = Static145.anInt2772 + 40000;
		}
		Static311.anInt6114 = Static94.anInt1707;
		if (Static47.anInt5990 == 1) {
			Static296.aShortArray93 = Static150.aShortArray70;
			Static226.anInt4374 = 16777215;
			Static226.anInt4371 = 0;
			Static137.aShortArray68 = Static92.aShortArray30;
			Static263.aShortArrayArray8 = Static20.aShortArrayArray1;
			Static176.aBoolean234 = true;
			Static73.aShortArrayArray5 = Static168.aShortArrayArray6;
		} else {
			Static263.aShortArrayArray8 = Static200.aShortArrayArray7;
			Static296.aShortArray93 = Static187.aShortArray71;
			Static73.aShortArrayArray5 = Static66.aShortArrayArray2;
			Static137.aShortArray68 = Static264.aShortArray88;
		}
		Static307.aString230 = Static109.aString107;
		Static203.anInt3974 = Static94.anInt1707;
		Static51.anInt995 = Static311.anInt6114;
		Static152.anInt2881 = Static239.anInt4856;
		if (Static275.anInt5563 == 3 && Static252.anInt5207 != 2) {
			Static203.anInt3980 = Static145.anInt2772;
		}
		Static14.aShortArray3 = Static219.aShortArray77 = Static134.aShortArray80 = Static133.aShortArray62 = new short[256];
		Static77.method1207();
		Static213.method3488(Static224.aCanvas12);
		Static92.method1372(Static224.aCanvas12);
		Static307.aClass77_1 = Static201.method3339();
		if (Static307.aClass77_1 != null) {
			Static307.aClass77_1.method1846(Static224.aCanvas12);
		}
		Static122.anInt2303 = Static275.anInt5563;
		try {
			if (Static274.aClass176_4.aClass70_4 != null) {
				Static200.aClass159_4 = new Class159(Static274.aClass176_4.aClass70_4, 5200, 0);
				for (@Pc(170) int local170 = 0; local170 < 29; local170++) {
					Static90.aClass159Array1[local170] = new Class159(Static274.aClass176_4.aClass70Array1[local170], 6000, 0);
				}
				Static146.aClass159_9 = new Class159(Static274.aClass176_4.aClass70_3, 6000, 0);
				Static47.aClass171_5 = new Class171(255, Static200.aClass159_4, Static146.aClass159_9, 500000);
				Static100.aClass159_3 = new Class159(Static274.aClass176_4.aClass70_2, 24, 0);
				Static274.aClass176_4.aClass70_4 = null;
				Static274.aClass176_4.aClass70Array1 = null;
				Static274.aClass176_4.aClass70_3 = null;
				Static274.aClass176_4.aClass70_2 = null;
			}
		} catch (@Pc(226) IOException local226) {
			Static146.aClass159_9 = null;
			Static200.aClass159_4 = null;
			Static47.aClass171_5 = null;
			Static100.aClass159_3 = null;
		}
		if (Static47.anInt5990 == 0) {
			Static265.aString202 = Static246.aString174;
		} else if (Static47.anInt5990 == 1) {
			Static265.aString202 = Static100.aString75;
		}
		if (Static252.anInt5207 != 0) {
			Static95.aBoolean141 = true;
		}
	}
}
