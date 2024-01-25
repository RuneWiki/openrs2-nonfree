import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	static {
		new Class394("", 73);
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static432.method6355("Argument count");
			}
			Static343.aClass395_2 = new Class395();
			Static343.aClass395_2.anInt10873 = Integer.parseInt(arg0[0]);
			Static585.aClass395_5 = new Class395();
			Static585.aClass395_5.anInt10873 = Integer.parseInt(arg0[1]);
			Static308.aClass395_1 = new Class395();
			Static308.aClass395_1.anInt10873 = Integer.parseInt(arg0[2]);
			Static217.aClass187_7 = Static432.aClass187_10;
			if (arg0[3].equals("live")) {
				Static262.aClass368_2 = Static305.aClass368_3;
			} else if (arg0[3].equals("rc")) {
				Static262.aClass368_2 = Static306.aClass368_4;
			} else if (arg0[3].equals("wip")) {
				Static262.aClass368_2 = Static79.aClass368_1;
			} else {
				Static432.method6355("modewhat");
			}
			Static544.anInt8937 = Static586.method8060(arg0[4]);
			if (Static544.anInt8937 == -1) {
				if (arg0[4].equals("english")) {
					Static544.anInt8937 = 0;
				} else if (arg0[4].equals("german")) {
					Static544.anInt8937 = 1;
				} else {
					Static432.method6355("language");
				}
			}
			Static287.aBoolean484 = false;
			Static361.aBoolean581 = false;
			if (arg0[5].equals("game0")) {
				Static218.aClass98_2 = Static599.aClass98_6;
			} else if (arg0[5].equals("game1")) {
				Static218.aClass98_2 = Static409.aClass98_3;
			} else if (arg0[5].equals("game2")) {
				Static218.aClass98_2 = Static538.aClass98_4;
			} else if (arg0[5].equals("game3")) {
				Static218.aClass98_2 = Static654.aClass98_7;
			} else {
				Static432.method6355("game");
			}
			Static320.aBoolean925 = true;
			Static289.aBoolean488 = true;
			Static571.aLong266 = 0L;
			Static315.aBoolean249 = false;
			Static89.aString11 = "";
			Static362.anInt4830 = Static218.aClass98_2.anInt2677;
			Static266.aBoolean417 = false;
			Static254.anInt4619 = 0;
			Static223.anInt4119 = 0;
			Static267.anInt4952 = 0;
			Static60.aString73 = null;
			Static360.aString55 = null;
			@Pc(188) client local188 = new client();
			Static209.aClient2 = local188;
			local188.method1797(Static262.aClass368_2.method8531() + 32, Static218.aClass98_2.aString13);
			Static147.aFrame1.setLocation(40, 40);
		} catch (@Pc(211) Exception local211) {
			Static234.method3615(local211, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1794() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static153.anInt3147 + "," + Static201.anInt3839 + "," + Static201.anInt3834 + "," + Static626.anInt10238 + "|";
			if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 != null) {
				local5 = local5 + "2)" + Static481.anInt8082 + "," + (Static153.anInt3147 + Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0]) + "," + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] + Static201.anInt3839) + "|";
			}
			local5 = local5 + "3)" + Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() + "|4)" + Static172.aClass5_Sub50_14.aClass12_Sub6_2.method1989() + "|5)" + Static469.method6688() + "|6)" + Static32.anInt510 + "," + Static79.anInt1140 + "|";
			local5 = local5 + "7)" + Static172.aClass5_Sub50_14.aClass12_Sub4_1.method930() + "|";
			local5 = local5 + "8)" + Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990() + "|";
			local5 = local5 + "9)" + Static172.aClass5_Sub50_14.aClass12_Sub29_1.method8477() + "|";
			local5 = local5 + "10)" + Static172.aClass5_Sub50_14.aClass12_Sub21_1.method6299() + "|";
			local5 = local5 + "11)" + Static172.aClass5_Sub50_14.aClass12_Sub15_1.method3450() + "|";
			local5 = local5 + "12)" + Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() + "|";
			local5 = local5 + "13)" + Static631.anInt10279 + "|";
			local5 = local5 + "14)" + Static173.anInt3397;
			if (Static580.aClass5_Sub30_1 != null) {
				local5 = local5 + "|15)" + Static580.aClass5_Sub30_1.anInt4762;
			}
			try {
				if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 2) {
					@Pc(245) Class local245 = Class.forName("java.lang.ClassLoader");
					@Pc(249) Field local249 = local245.getDeclaredField("nativeLibraries");
					@Pc(252) Class local252 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(262) Method local262 = local252.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local262.invoke(local249, Boolean.TRUE);
					@Pc(285) Vector local285 = (Vector) local249.get(client.class.getClassLoader());
					for (@Pc(287) int local287 = 0; local287 < local285.size(); local287++) {
						try {
							@Pc(292) Object local292 = local285.elementAt(local287);
							@Pc(297) Field local297 = local292.getClass().getDeclaredField("name");
							local262.invoke(local297, Boolean.TRUE);
							try {
								@Pc(312) String local312 = (String) local297.get(local292);
								if (local312 != null && local312.indexOf("sw3d.dll") != -1) {
									@Pc(324) Field local324 = local292.getClass().getDeclaredField("handle");
									local262.invoke(local324, Boolean.TRUE);
									local5 = local5 + "|16)" + Long.toHexString(local324.getLong(local292));
									local262.invoke(local324, Boolean.FALSE);
								}
							} catch (@Pc(360) Throwable local360) {
							}
							local262.invoke(local297, Boolean.FALSE);
						} catch (@Pc(372) Throwable local372) {
						}
					}
				}
			} catch (@Pc(384) Throwable local384) {
			}
			local5 = local5 + "]";
		} catch (@Pc(395) Throwable local395) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1809() {
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1810() {
		if (Static173.anInt3397 == 14) {
			return;
		}
		Static26.anInt350++;
		if (Static26.anInt350 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static605.anInt9946 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static561.aRandom1.setSeed((long) Static605.anInt9946);
		}
		if (Static26.anInt350 % 50 == 0) {
			Static248.anInt4555 = Static106.anInt2263;
			Static546.anInt8977 = Static677.anInt10869;
			Static106.anInt2263 = 0;
			Static677.anInt10869 = 0;
		}
		this.method1821();
		if (Static303.aClass224_1 != null) {
			Static303.aClass224_1.method5529();
		}
		Static612.method8320();
		Static223.method3496();
		Static17.aClass252_1.method8820();
		Static359.aClass11_1.method6143();
		if (Static208.aClass65_7 != null) {
			Static208.aClass65_7.method6918((int) Static547.method7619());
		}
		Static557.method7724();
		Static676.anInt10853 = 0;
		Static276.anInt10228 = 0;
		for (@Pc(105) Interface16 local105 = Static17.aClass252_1.method8817(); local105 != null; local105 = Static17.aClass252_1.method8817()) {
			@Pc(111) int local111 = local105.method7499();
			if (local111 == 2 || local111 == 3) {
				@Pc(123) char local123 = local105.method7501();
				if (Static219.method3471() && (local123 == '`' || local123 == '§' || local123 == '²')) {
					if (Static202.method3285()) {
						Static593.method8134();
					} else {
						Static320.method9051();
					}
				} else if (Static276.anInt10228 < 128) {
					Static340.anInterface16Array2[Static276.anInt10228] = local105;
					Static276.anInt10228++;
				}
			} else if (local111 == 0 && Static676.anInt10853 < 75) {
				Static194.anInterface16Array1[Static676.anInt10853] = local105;
				Static676.anInt10853++;
			}
		}
		Static133.anInt2650 = 0;
		for (@Pc(191) Class5_Sub7 local191 = Static359.aClass11_1.method6142(); local191 != null; local191 = Static359.aClass11_1.method6142()) {
			@Pc(197) int local197 = local191.method8705();
			if (local197 == -1) {
				Static363.aClass114_63.method2807(local191);
			} else if (local197 == 6) {
				Static133.anInt2650 += local191.method8704();
			} else if (Static54.method711(local197)) {
				Static223.aClass114_23.method2807(local191);
				if (Static223.aClass114_23.method2811() > 10) {
					Static223.aClass114_23.method2813();
				}
			}
		}
		if (Static202.method3285()) {
			Static233.method3598();
		}
		if (Static636.method8568(Static173.anInt3397)) {
			Static259.method4059();
			Static495.method7089();
		} else if (Static315.method2586(Static173.anInt3397)) {
			Static453.method6522();
		}
		if (Static15.method206(Static173.anInt3397) && !Static315.method2586(Static173.anInt3397)) {
			this.method1813();
			Static139.method2420();
			Static274.method4249();
		} else if (Static326.method5069(Static173.anInt3397) && !Static315.method2586(Static173.anInt3397)) {
			this.method1813();
			Static274.method4249();
		} else if (Static173.anInt3397 == 12) {
			Static274.method4249();
		} else if (Static134.method1808(Static173.anInt3397) && !Static315.method2586(Static173.anInt3397)) {
			Static409.method6021();
		} else if (Static173.anInt3397 == 13) {
			Static274.method4249();
			if (Static324.anInt9546 != -3 && Static324.anInt9546 != 2 && Static324.anInt9546 != 15) {
				Static628.method8487(false);
			}
		}
		Static22.method288(Static208.aClass65_7);
		Static223.aClass114_23.method2813();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1802() {
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != 2) {
			this.method1825();
			return;
		}
		try {
			this.method1825();
		} catch (@Pc(20) ThreadDeath local20) {
			throw local20;
		} catch (@Pc(23) Throwable local23) {
			Static234.method3615(local23, local23.getMessage() + " (Recovered) " + this.method1794());
			Static637.aBoolean879 = true;
			Static428.method6321(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1813() {
		@Pc(29) int local29;
		if (Static173.anInt3397 == 7 && Static273.anInt5015 == 0) {
			if (Static198.anInt8358 > 1) {
				Static605.anInt9948 = Static370.anInt8567;
				Static198.anInt8358--;
			}
			if (!Static493.aBoolean702) {
				Static447.method6475();
			}
			for (local29 = 0; local29 < 100 && Static49.method623(); local29++) {
			}
		}
		Static290.anInt5659++;
		Static125.method2266(-1, -1, (Class345) null);
		Static269.method4158(-1, (Class345) null, -1);
		Static316.method4964();
		Static370.anInt8567++;
		for (local29 = 0; local29 < Static37.anInt617; local29++) {
			@Pc(79) Class28_Sub1_Sub4_Sub2_Sub1 local79 = Static317.aClass5_Sub25Array1[local29].aClass28_Sub1_Sub4_Sub2_Sub1_1;
			if (local79 != null) {
				@Pc(85) byte local85 = local79.aClass134_1.aByte50;
				if ((local85 & 0x1) != 0) {
					@Pc(93) int local93 = local79.method4599();
					@Pc(117) int local117;
					if ((local85 & 0x2) != 0 && local79.anInt5524 == 0 && Math.random() * 1000.0D < 10.0D) {
						local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(125) int local125 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local117 != 0 || local125 != 0) {
							@Pc(140) int local140 = local79.anIntArray308[0] + local117;
							@Pc(148) int local148 = local79.anIntArray307[0] + local125;
							if (local140 < 0) {
								local140 = 0;
							} else if (local140 > Static201.anInt3834 - local93 - 1) {
								local140 = Static201.anInt3834 - local93 - 1;
							}
							if (local148 < 0) {
								local148 = 0;
							} else if (local148 > Static626.anInt10238 - local93 - 1) {
								local148 = Static626.anInt10238 - local93 - 1;
							}
							@Pc(228) int local228 = Static131.method2371(local79.anIntArray308[0], -1, 0, 0, Static306.anIntArray326, local79.anIntArray307[0], local140, local93, local93, local148, local93, true, Static300.anIntArray565, Static275.aClass106Array1[local79.aByte145]);
							if (local228 > 0) {
								if (local228 > 9) {
									local228 = 9;
								}
								for (@Pc(242) int local242 = 0; local242 < local228; local242++) {
									local79.anIntArray308[local242] = Static306.anIntArray326[local228 - local242 - 1];
									local79.anIntArray307[local242] = Static300.anIntArray565[local228 - local242 - 1];
									local79.aByteArray44[local242] = 1;
								}
								local79.anInt5524 = local228;
							}
						}
					}
					Static250.method3864(true, local79);
					local117 = Static306.method4845(local79);
					Static461.method6596(local79);
					Static321.method5000(local117, Static79.anInt1139, local79, Static399.anInt7112);
					Static117.method2216(Static399.anInt7112, local79);
					Static561.method7744(local79);
				}
			}
		}
		if (Static273.anInt5015 == 0 && Static83.anInt1914 == 0) {
			if (Static660.anInt10605 == 2) {
				Static6.method68();
			} else {
				Static80.method1041();
			}
			if (Static332.anInt6132 >> 9 < 14 || Static201.anInt3834 - 14 <= Static332.anInt6132 >> 9 || Static407.anInt7215 >> 9 < 14 || Static407.anInt7215 >> 9 >= Static626.anInt10238 - 14) {
				Static13.method7330();
			}
		}
		while (true) {
			@Pc(366) Class5_Sub22 local366;
			@Pc(371) Class345 local371;
			@Pc(382) Class345 local382;
			do {
				local366 = (Class5_Sub22) Static203.aClass114_22.method2813();
				if (local366 == null) {
					while (true) {
						do {
							local366 = (Class5_Sub22) Static562.aClass114_62.method2813();
							if (local366 == null) {
								while (true) {
									do {
										local366 = (Class5_Sub22) Static637.aClass114_66.method2813();
										if (local366 == null) {
											if (Static383.aClass345_10 != null) {
												Static327.method5080();
											}
											if (Static26.anInt350 % 1500 == 0) {
												Static117.method2215();
											}
											if (Static173.anInt3397 == 7 && Static273.anInt5015 == 0) {
												Static676.method9029();
											}
											Static469.method6692();
											if (Static550.aBoolean771 && Static404.aLong184 < Static547.method7619() - 60000L) {
												Static431.method6343();
											}
											for (@Pc(538) Class28_Sub3_Sub2 local538 = (Class28_Sub3_Sub2) Static205.aClass156_2.method3776(); local538 != null; local538 = (Class28_Sub3_Sub2) Static205.aClass156_2.method3783()) {
												if ((long) local538.anInt9317 < Static547.method7619() / 1000L - 5L) {
													if (local538.aShort94 > 0) {
														Static234.method3619(0, "", "", "", local538.aString88 + Static64.aClass52_19.method907(Static544.anInt8937), 5);
													}
													if (local538.aShort94 == 0) {
														Static234.method3619(0, "", "", "", local538.aString88 + Static64.aClass52_20.method907(Static544.anInt8937), 5);
													}
													local538.method9022();
												}
											}
											if (Static173.anInt3397 == 7 && Static273.anInt5015 == 0) {
												if (Static12.aClass244_1 == null) {
													Static628.method8487(false);
													return;
												}
												Static292.anInt5664++;
												if (Static292.anInt5664 > 50) {
													@Pc(643) Class5_Sub21 local643 = Static64.method905(Static263.aClass49_1, Static5.aClass305_3);
													Static495.method7092(local643);
												}
												try {
													Static24.method6162();
													return;
												} catch (@Pc(650) IOException local650) {
													Static628.method8487(false);
													return;
												}
											}
											return;
										}
										local371 = local366.aClass345_1;
										if (local371.anInt9611 < 0) {
											break;
										}
										local382 = Static264.method4120(local371.anInt9657);
									} while (local382 == null || local382.aClass345Array1 == null || local371.anInt9611 >= local382.aClass345Array1.length || local371 != local382.aClass345Array1[local371.anInt9611]);
									Static652.method8743(local366);
								}
							}
							local371 = local366.aClass345_1;
							if (local371.anInt9611 < 0) {
								break;
							}
							local382 = Static264.method4120(local371.anInt9657);
						} while (local382 == null || local382.aClass345Array1 == null || local371.anInt9611 >= local382.aClass345Array1.length || local371 != local382.aClass345Array1[local371.anInt9611]);
						Static652.method8743(local366);
					}
				}
				local371 = local366.aClass345_1;
				if (local371.anInt9611 < 0) {
					break;
				}
				local382 = Static264.method4120(local371.anInt9657);
			} while (local382 == null || local382.aClass345Array1 == null || local371.anInt9611 >= local382.aClass345Array1.length || local371 != local382.aClass345Array1[local371.anInt9611]);
			Static652.method8743(local366);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1795() {
		if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != 2) {
			this.method1810();
			return;
		}
		try {
			this.method1810();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static234.method3615(local22, local22.getMessage() + " (Recovered) " + this.method1794());
			Static637.aBoolean879 = true;
			Static428.method6321(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1819() {
		if (Static671.aClass296_3.anInt8296 > Static132.anInt2647) {
			Static514.aClass395_4.method9035();
			Static578.anInt9494 = (Static671.aClass296_3.anInt8296 * 50 - 50) * 5;
			if (Static578.anInt9494 > 3000) {
				Static578.anInt9494 = 3000;
			}
			if (Static671.aClass296_3.anInt8296 >= 2 && Static671.aClass296_3.anInt8297 == 6) {
				this.method1796("js5connect_outofdate");
				Static173.anInt3397 = 14;
				return;
			}
			if (Static671.aClass296_3.anInt8296 >= 4 && Static671.aClass296_3.anInt8297 == -1) {
				this.method1796("js5crc");
				Static173.anInt3397 = 14;
				return;
			}
			if (Static671.aClass296_3.anInt8296 >= 4 && Static636.method8568(Static173.anInt3397)) {
				if (Static671.aClass296_3.anInt8297 == 7 || Static671.aClass296_3.anInt8297 == 9) {
					this.method1796("js5connect_full");
				} else if (Static671.aClass296_3.anInt8297 <= 0) {
					this.method1796("js5io");
				} else if (Static633.aString106 == null) {
					this.method1796("js5connect");
				} else {
					this.method1796("js5proxy_" + Static633.aString106.trim());
				}
				Static173.anInt3397 = 14;
				return;
			}
		}
		Static132.anInt2647 = Static671.aClass296_3.anInt8296;
		if (Static578.anInt9494 > 0) {
			Static578.anInt9494--;
			return;
		}
		try {
			if (Static250.anInt4570 == 0) {
				Static535.aClass331_10 = Static514.aClass395_4.method9037(Static570.aClass268_5);
				Static250.anInt4570++;
			}
			if (Static250.anInt4570 == 1) {
				if (Static535.aClass331_10.anInt9108 == 2) {
					if (Static535.aClass331_10.anObject20 != null) {
						Static633.aString106 = (String) Static535.aClass331_10.anObject20;
					}
					this.method1820(1000);
					return;
				}
				if (Static535.aClass331_10.anInt9108 == 1) {
					Static250.anInt4570++;
				}
			}
			if (Static250.anInt4570 == 2) {
				Static556.aClass295_2 = new Class295((Socket) Static535.aClass331_10.anObject20, Static570.aClass268_5, 25000);
				@Pc(199) Class5_Sub41 local199 = new Class5_Sub41(5);
				local199.method7798(Static146.aClass111_2.anInt3148);
				local199.method7803(647);
				Static556.aClass295_2.method7078(local199.aByteArray93, 5);
				Static250.anInt4570++;
				Static149.aLong59 = Static547.method7619();
			}
			if (Static250.anInt4570 == 3) {
				if (Static636.method8568(Static173.anInt3397) || Static556.aClass295_2.method7081() > 0) {
					@Pc(239) int local239 = Static556.aClass295_2.method7073();
					if (local239 != 0) {
						this.method1820(local239);
						return;
					}
					Static250.anInt4570++;
				} else if (Static547.method7619() - Static149.aLong59 > 30000L) {
					this.method1820(1001);
					return;
				}
			}
			if (Static250.anInt4570 == 4) {
				@Pc(291) boolean local291 = Static636.method8568(Static173.anInt3397) || Static15.method206(Static173.anInt3397) || Static326.method5069(Static173.anInt3397);
				@Pc(294) Class280[] local294 = Static454.method6524();
				@Pc(302) Class5_Sub41 local302 = new Class5_Sub41(local294.length * 4);
				Static556.aClass295_2.method7080(local302.aByteArray93.length, local302.aByteArray93, 0);
				for (@Pc(313) int local313 = 0; local313 < local294.length; local313++) {
					local294[local313].method6528(local302.method7804());
				}
				Static671.aClass296_3.method7090(!local291, Static556.aClass295_2);
				Static535.aClass331_10 = null;
				Static250.anInt4570 = 0;
				Static556.aClass295_2 = null;
			}
		} catch (@Pc(349) IOException local349) {
			this.method1820(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1820(@OriginalArg(1) int arg0) {
		Static556.aClass295_2 = null;
		Static535.aClass331_10 = null;
		Static250.anInt4570 = 0;
		Static671.aClass296_3.anInt8297 = arg0;
		Static671.aClass296_3.anInt8296++;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1821() {
		@Pc(9) boolean local9 = Static671.aClass296_3.method7084();
		if (!local9) {
			this.method1819();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method1806() {
		if (Static639.anApplet2 != null && Static141.aCanvas7 == null && !Static570.aClass268_5.aBoolean645) {
			try {
				@Pc(13) Class local13 = Static639.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static141.aCanvas7 = (Canvas) local17.get(Static639.anApplet2);
				local17.set(Static639.anApplet2, (Object) null);
				if (Static141.aCanvas7 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1806();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1804() {
		if (Static266.aBoolean417) {
			Static631.anInt10279 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static10.method148();
		Static405.aClass147_5 = new Class147(Static570.aClass268_5);
		Static671.aClass296_3 = new Class296();
		Static146.method2652(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static560.aClass187_13 != Static217.aClass187_7) {
			Static171.aByteArrayArray10 = new byte[50][];
		}
		Static172.aClass5_Sub50_14 = Static450.method6500();
		if (Static560.aClass187_13 == Static217.aClass187_7) {
			Static343.aClass395_2.aString122 = this.getCodeBase().getHost();
		} else if (Static375.method5606(Static217.aClass187_7)) {
			Static343.aClass395_2.aString122 = this.getCodeBase().getHost();
			Static343.aClass395_2.anInt10879 = Static343.aClass395_2.anInt10873 + 40000;
			Static585.aClass395_5.anInt10879 = Static585.aClass395_5.anInt10873 + 40000;
			Static343.aClass395_2.anInt10870 = Static343.aClass395_2.anInt10873 + 50000;
			Static308.aClass395_1.anInt10879 = Static308.aClass395_1.anInt10873 + 40000;
			Static585.aClass395_5.anInt10870 = Static585.aClass395_5.anInt10873 + 50000;
			Static308.aClass395_1.anInt10870 = Static308.aClass395_1.anInt10873 + 50000;
		} else if (Static217.aClass187_7 == Static432.aClass187_10) {
			Static343.aClass395_2.aString122 = "127.0.0.1";
			Static585.aClass395_5.aString122 = "127.0.0.1";
			Static308.aClass395_1.aString122 = "127.0.0.1";
			Static343.aClass395_2.anInt10879 = Static343.aClass395_2.anInt10873 + 40000;
			Static585.aClass395_5.anInt10879 = Static585.aClass395_5.anInt10873 + 40000;
			Static343.aClass395_2.anInt10870 = Static343.aClass395_2.anInt10873 + 50000;
			Static308.aClass395_1.anInt10879 = Static308.aClass395_1.anInt10873 + 40000;
			Static585.aClass395_5.anInt10870 = Static585.aClass395_5.anInt10873 + 50000;
			Static308.aClass395_1.anInt10870 = Static308.aClass395_1.anInt10873 + 50000;
		}
		Static607.aShortArray91 = Static470.aShortArray87 = Static653.aShortArray157 = Static672.aShortArray158 = new short[256];
		if (Static599.aClass98_6 == Static218.aClass98_2) {
			Static317.aBoolean530 = false;
		}
		if (Static218.aClass98_2 == Static409.aClass98_3) {
			Static157.aBoolean262 = true;
			Static551.aShortArrayArrayArray4 = Static502.aShortArrayArrayArray3;
			Static661.aShortArrayArray18 = Static46.aShortArrayArray1;
			Static160.anInt3184 = 16777215;
			Static9.anInt10600 = 0;
		} else if (Static654.aClass98_7 == Static218.aClass98_2) {
			Static551.aShortArrayArrayArray4 = Static196.aShortArrayArrayArray1;
			Static661.aShortArrayArray18 = Static201.aShortArrayArray6;
		} else {
			Static661.aShortArrayArray18 = Static168.aShortArrayArray2;
			Static551.aShortArrayArrayArray4 = Static354.aShortArrayArrayArray2;
		}
		Static514.aClass395_4 = Static343.aClass395_2;
		try {
			Static458.aClipboard1 = Static209.aClient2.getToolkit().getSystemClipboard();
		} catch (@Pc(226) Exception local226) {
		}
		Static17.aClass252_1 = Static213.method8046(Static141.aCanvas7);
		Static359.aClass11_1 = Static353.method5338(Static141.aCanvas7);
		try {
			if (Static570.aClass268_5.aClass373_4 != null) {
				Static529.aClass151_8 = new Class151(Static570.aClass268_5.aClass373_4, 5200, 0);
				for (@Pc(248) int local248 = 0; local248 < 37; local248++) {
					Static382.aClass151Array1[local248] = new Class151(Static570.aClass268_5.aClass373Array1[local248], 6000, 0);
				}
				Static344.aClass151_6 = new Class151(Static570.aClass268_5.aClass373_3, 6000, 0);
				Static19.aClass71_1 = new Class71(255, Static529.aClass151_8, Static344.aClass151_6, 500000);
				Static573.aClass151_9 = new Class151(Static570.aClass268_5.aClass373_2, 24, 0);
				Static570.aClass268_5.aClass373_4 = null;
				Static570.aClass268_5.aClass373_2 = null;
				Static570.aClass268_5.aClass373Array1 = null;
				Static570.aClass268_5.aClass373_3 = null;
			}
		} catch (@Pc(304) IOException local304) {
			Static573.aClass151_9 = null;
			Static19.aClass71_1 = null;
			Static529.aClass151_8 = null;
			Static344.aClass151_6 = null;
		}
		if (Static560.aClass187_13 != Static217.aClass187_7) {
			Static198.aBoolean709 = true;
		}
		Static516.aString84 = Static64.aClass52_12.method907(Static544.anInt8937);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method1825() {
		if (Static173.anInt3397 == 14) {
			return;
		}
		@Pc(17) long local17 = Static240.method3767() / 1000000L - Static303.aLong146;
		Static303.aLong146 = Static240.method3767() / 1000000L;
		@Pc(25) boolean local25 = Static446.method6472();
		if (local25 && Static569.aBoolean788 && Static39.aClass255_1 != null) {
			Static39.aClass255_1.method7456();
		}
		if (Static258.method4029(Static173.anInt3397)) {
			if (Static578.aLong269 != 0L && Static547.method7619() > Static578.aLong269) {
				Static279.method4512(Static648.anInt10458, false, Static469.method6688(), Static366.anInt6661);
			} else if (!Static208.aClass65_7.method6947() && Static46.aBoolean50) {
				Static645.method8709();
			}
		}
		@Pc(85) int local85;
		@Pc(89) int local89;
		if (Static625.aFrame3 == null) {
			@Pc(71) Container local71;
			if (Static147.aFrame1 != null) {
				local71 = Static147.aFrame1;
			} else if (Static639.anApplet2 == null) {
				local71 = Static556.anApplet_Sub1_1;
			} else {
				local71 = Static639.anApplet2;
			}
			local85 = local71.getSize().width;
			local89 = local71.getSize().height;
			if (local71 == Static147.aFrame1) {
				@Pc(95) Insets local95 = Static147.aFrame1.getInsets();
				local85 -= local95.left + local95.right;
				local89 -= local95.top + local95.bottom;
			}
			if (local85 != Static255.anInt4665 || local89 != Static89.anInt2047 || Static592.aBoolean826) {
				if (Static208.aClass65_7 == null || Static208.aClass65_7.method6896()) {
					Static10.method148();
				} else {
					Static255.anInt4665 = local85;
					Static89.anInt2047 = local89;
				}
				Static578.aLong269 = Static547.method7619() + 500L;
				Static592.aBoolean826 = false;
			}
		}
		if (Static625.aFrame3 != null && !Static391.aBoolean602 && Static258.method4029(Static173.anInt3397)) {
			Static279.method4512(-1, false, Static172.aClass5_Sub50_14.aClass12_Sub9_2.method2337(), -1);
		}
		@Pc(160) boolean local160 = false;
		if (Static113.aBoolean216) {
			Static113.aBoolean216 = false;
			local160 = true;
		}
		if (local160) {
			Static236.method3643();
		}
		if (Static208.aClass65_7 != null && Static208.aClass65_7.method6947() || Static469.method6688() != 1) {
			Static283.method4543();
		}
		if (Static636.method8568(Static173.anInt3397)) {
			Static16.method226(local160);
		} else if (Static305.method4817(Static173.anInt3397)) {
			Static551.method7647();
		} else if (Static233.method3599(Static173.anInt3397)) {
			Static551.method7647();
		} else if (Static315.method2586(Static173.anInt3397)) {
			if (Static310.anInt5911 == 1) {
				if (Static318.anInt5993 > Static596.anInt3346) {
					Static596.anInt3346 = Static318.anInt5993;
				}
				local85 = (Static596.anInt3346 - Static318.anInt5993) * 50 / Static596.anInt3346;
				Static270.method4168(Static64.aClass52_12.method907(Static544.anInt8937) + "<br>(" + local85 + "%)", Static208.aClass65_7, Static604.aClass73_15, true, Static247.aClass247_16);
			} else if (Static310.anInt5911 == 2) {
				if (Static408.anInt7217 > Static39.anInt651) {
					Static39.anInt651 = Static408.anInt7217;
				}
				local85 = (Static39.anInt651 - Static408.anInt7217) * 50 / Static39.anInt651 + 50;
				Static270.method4168(Static64.aClass52_12.method907(Static544.anInt8937) + "<br>(" + local85 + "%)", Static208.aClass65_7, Static604.aClass73_15, true, Static247.aClass247_16);
			} else {
				Static270.method4168(Static64.aClass52_12.method907(Static544.anInt8937), Static208.aClass65_7, Static604.aClass73_15, true, Static247.aClass247_16);
			}
		} else if (Static173.anInt3397 == 10) {
			Static580.method8011(local17);
		} else if (Static173.anInt3397 == 13) {
			Static270.method4168(Static64.aClass52_14.method907(Static544.anInt8937) + "<br>" + Static64.aClass52_15.method907(Static544.anInt8937), Static208.aClass65_7, Static604.aClass73_15, false, Static247.aClass247_16);
		}
		if (Static332.anInt6133 == 3) {
			for (local85 = 0; local85 < Static168.anInt3361; local85++) {
				@Pc(367) Rectangle local367 = Class12_Sub8.aRectangleArray1[local85];
				if (Static19.aBooleanArray1[local85]) {
					Static208.aClass65_7.method6943(local367.x, local367.width, local367.height, local367.y, -65281);
				} else if (Static208.aBooleanArray18[local85]) {
					Static208.aClass65_7.method6943(local367.x, local367.width, local367.height, local367.y, -65536);
				} else {
					Static208.aClass65_7.method6943(local367.x, local367.width, local367.height, local367.y, -16711936);
				}
			}
		}
		if (Static202.method3285()) {
			Static266.method4130(Static208.aClass65_7);
		}
		if (Static570.aClass268_5.aBoolean645 && Static258.method4029(Static173.anInt3397) && Static332.anInt6133 == 0 && Static469.method6688() == 1 && !local160) {
			local85 = 0;
			for (local89 = 0; local89 < Static168.anInt3361; local89++) {
				if (Static208.aBooleanArray18[local89]) {
					Static208.aBooleanArray18[local89] = false;
					Static268.aRectangleArray2[local85++] = Class12_Sub8.aRectangleArray1[local89];
				}
			}
			try {
				if (Static66.aBoolean570) {
					Static640.method8647(local85, Static268.aRectangleArray2);
				} else {
					Static208.aClass65_7.method6920(local85, Static268.aRectangleArray2);
				}
			} catch (@Pc(540) Exception_Sub1 local540) {
			}
		} else if (!Static636.method8568(Static173.anInt3397)) {
			for (local85 = 0; local85 < Static168.anInt3361; local85++) {
				Static208.aBooleanArray18[local85] = false;
			}
			try {
				if (Static66.aBoolean570) {
					Static546.method7617();
				} else {
					Static208.aClass65_7.method6925();
				}
			} catch (@Pc(474) Exception_Sub1 local474) {
				Static234.method3615(local474, local474.getMessage() + " (Recovered) " + this.method1794());
				Static428.method6321(0, false);
			}
		}
		Static155.method447();
		local85 = Static172.aClass5_Sub50_14.aClass12_Sub3_1.method596();
		if (local85 == 0) {
			Static579.method8004(15L);
		} else if (local85 == 1) {
			Static579.method8004(10L);
		} else if (local85 == 2) {
			Static579.method8004(5L);
		} else if (local85 == 3) {
			Static579.method8004(2L);
		}
		if (Static582.aBoolean919) {
			Static409.method6016();
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub5_1.method1912() == 1 && Static173.anInt3397 == 3 && Static84.anInt2018 != -1) {
			Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub5_1);
			Static102.method1995();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1791()) {
			return;
		}
		Static343.aClass395_2 = new Class395();
		Static343.aClass395_2.anInt10873 = Integer.parseInt(this.getParameter("worldid"));
		Static585.aClass395_5 = new Class395();
		Static585.aClass395_5.anInt10873 = Integer.parseInt(this.getParameter("lobbyid"));
		Static585.aClass395_5.aString122 = this.getParameter("lobbyaddress");
		Static308.aClass395_1 = new Class395();
		Static308.aClass395_1.anInt10873 = Integer.parseInt(this.getParameter("demoid"));
		Static308.aClass395_1.aString122 = this.getParameter("demoaddress");
		Static217.aClass187_7 = Static592.method8117(Integer.parseInt(this.getParameter("modewhere")));
		if (Static217.aClass187_7 == Static432.aClass187_10) {
			Static217.aClass187_7 = Static221.aClass187_15;
		} else if (!Static375.method5606(Static217.aClass187_7) && Static217.aClass187_7 != Static560.aClass187_13) {
			Static217.aClass187_7 = Static560.aClass187_13;
		}
		Static262.aClass368_2 = Static373.method5593(Integer.parseInt(this.getParameter("modewhat")));
		if (Static262.aClass368_2 != Static79.aClass368_1 && Static306.aClass368_4 != Static262.aClass368_2 && Static262.aClass368_2 != Static305.aClass368_3) {
			Static262.aClass368_2 = Static305.aClass368_3;
		}
		try {
			Static544.anInt8937 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static544.anInt8937 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static287.aBoolean484 = true;
		} else {
			Static287.aBoolean484 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static361.aBoolean581 = true;
		} else {
			Static361.aBoolean581 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static42.aBoolean48 = true;
		} else {
			Static42.aBoolean48 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static218.aClass98_2 = Static599.aClass98_6;
			} else if (local152.equals("1")) {
				Static218.aClass98_2 = Static409.aClass98_3;
			} else if (local152.equals("2")) {
				Static218.aClass98_2 = Static538.aClass98_4;
			} else if (local152.equals("3")) {
				Static218.aClass98_2 = Static654.aClass98_7;
			}
		}
		try {
			Static254.anInt4619 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static254.anInt4619 = 0;
		}
		Static587.aString93 = this.getParameter("quiturl");
		Static89.aString11 = this.getParameter("settings");
		if (Static89.aString11 == null) {
			Static89.aString11 = "";
		}
		Static135.aBoolean234 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static267.anInt4952 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static267.anInt4952 = 0;
			}
		}
		Static362.anInt4830 = Integer.parseInt(this.getParameter("colourid"));
		if (Static362.anInt4830 < 0 || Static362.anInt4830 >= Static220.aColorArray4.length) {
			Static362.anInt4830 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static320.aBoolean925 = true;
			Static289.aBoolean488 = true;
		}
		@Pc(256) String local256 = this.getParameter("frombilling");
		if (local256 != null && local256.equals("true")) {
			Static315.aBoolean249 = true;
		}
		Static360.aString55 = this.getParameter("sskey");
		if (Static360.aString55 != null && Static360.aString55.length() < 2) {
			Static360.aString55 = null;
		}
		@Pc(280) String local280 = this.getParameter("force64mb");
		if (local280 != null && local280.equals("true")) {
			Static266.aBoolean417 = true;
		}
		@Pc(292) String local292 = this.getParameter("worldflags");
		if (local292 != null) {
			try {
				Static223.anInt4119 = Integer.parseInt(local292);
			} catch (@Pc(299) Exception local299) {
			}
		}
		@Pc(304) String local304 = this.getParameter("userFlow");
		if (local304 != null) {
			try {
				Static571.aLong266 = Long.parseLong(local304);
			} catch (@Pc(311) NumberFormatException local311) {
			}
		}
		Static60.aString73 = this.getParameter("additionalInfo");
		if (Static60.aString73 != null && Static60.aString73.length() > 50) {
			Static60.aString73 = null;
		}
		if (Static218.aClass98_2 == Static599.aClass98_6) {
			Static10.anInt152 = 503;
			Static613.anInt10005 = 765;
		} else if (Static409.aClass98_3 == Static218.aClass98_2) {
			Static10.anInt152 = 480;
			Static613.anInt10005 = 640;
		}
		Static209.aClient2 = this;
		this.method1792(Static613.anInt10005, Static10.anInt152, Static262.aClass368_2.method8531() + 32, Static218.aClass98_2.aString13);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1799() {
		if (Static550.aBoolean771) {
			Static431.method6343();
		}
		Static417.method6202();
		if (Static208.aClass65_7 != null) {
			Static208.aClass65_7.method6923();
		}
		if (Static625.aFrame3 != null) {
			Static312.method4926(Static570.aClass268_5, Static625.aFrame3);
			Static625.aFrame3 = null;
		}
		if (Static12.aClass244_1 != null) {
			Static12.aClass244_1.method5753();
			Static12.aClass244_1 = null;
		}
		Static7.method106();
		Static671.aClass296_3.method7085();
		Static405.aClass147_5.method3558();
		if (Static546.aClass249_1 != null) {
			Static546.aClass249_1.method5823();
			Static546.aClass249_1 = null;
		}
		try {
			Static529.aClass151_8.method3648();
			for (@Pc(51) int local51 = 0; local51 < 37; local51++) {
				Static382.aClass151Array1[local51].method3648();
			}
			Static344.aClass151_6.method3648();
			Static573.aClass151_9.method3648();
			Static602.method8251();
		} catch (@Pc(80) Exception local80) {
		}
	}
}
