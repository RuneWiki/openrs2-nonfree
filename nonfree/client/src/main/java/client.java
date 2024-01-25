import jagex3.jagmisc.jagmisc;
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
		new Class45("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static319.method5473("Argument count");
			}
			Static499.aClass210_4 = new Class210();
			Static499.aClass210_4.anInt6291 = Integer.parseInt(arg0[0]);
			Static119.aClass210_2 = new Class210();
			Static119.aClass210_2.anInt6291 = Integer.parseInt(arg0[1]);
			Static101.aClass210_1 = new Class210();
			Static101.aClass210_1.anInt6291 = Integer.parseInt(arg0[2]);
			Static190.aClass139_1 = Static283.aClass139_2;
			if (arg0[3].equals("live")) {
				Static362.aClass174_9 = Static151.aClass174_7;
			} else if (arg0[3].equals("rc")) {
				Static362.aClass174_9 = Static233.aClass174_6;
			} else if (arg0[3].equals("wip")) {
				Static362.aClass174_9 = Static483.aClass174_10;
			} else {
				Static319.method5473("modewhat");
			}
			Static544.anInt7853 = Static209.method3849(arg0[4]);
			if (Static544.anInt7853 == -1) {
				if (arg0[4].equals("english")) {
					Static544.anInt7853 = 0;
				} else if (arg0[4].equals("german")) {
					Static544.anInt7853 = 1;
				} else {
					Static319.method5473("language");
				}
			}
			Static23.aBoolean56 = false;
			Static197.aBoolean322 = false;
			if (arg0[5].equals("game0")) {
				Static332.aClass250_4 = Static71.aClass250_1;
			} else if (arg0[5].equals("game1")) {
				Static332.aClass250_4 = Static116.aClass250_2;
			} else {
				Static319.method5473("game");
			}
			Static488.aBoolean470 = true;
			Static132.aBoolean231 = true;
			Static327.aBoolean463 = false;
			Static18.aString9 = "";
			Static460.anInt7963 = 0;
			Static402.anInt7080 = 0;
			Static332.anInt6229 = Static332.aClass250_4.anInt7314;
			Static27.anInt767 = 0;
			Static396.aString177 = null;
			Static23.aBoolean55 = false;
			@Pc(160) client local160 = new client();
			Static125.aClient1 = local160;
			local160.method1565(Static362.aClass174_9.method4738() + 32, Static332.aClass250_4.aString182);
			Static306.aFrame2.setLocation(40, 40);
		} catch (@Pc(183) Exception local183) {
			Static25.method773(local183, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method1568() {
		@Pc(31) int local31;
		if (Static186.anInt3863 == 6 && Static121.anInt2498 == 0) {
			if (Static396.anInt6970 > 1) {
				Static448.anInt7840 = Static209.anInt4108;
				Static396.anInt6970--;
			}
			if (!Static238.aBoolean354) {
				Static130.method7388();
			}
			for (local31 = 0; local31 < 100 && Static467.method7127(); local31++) {
			}
		}
		Static242.anInt4651++;
		Static290.method5099(-1, -1, null);
		Static329.method5611(null, -1, -1);
		Static285.method5034();
		Static209.anInt4108++;
		for (local31 = 0; local31 < Static342.anInt6322; local31++) {
			@Pc(73) Class20_Sub1_Sub1_Sub2 local73 = Static35.aClass1_Sub41Array1[local31].aClass20_Sub1_Sub1_Sub2_2;
			if (local73 != null) {
				@Pc(79) byte local79 = local73.aClass283_1.aByte91;
				if ((local79 & 0x1) != 0) {
					@Pc(89) int local89 = local73.method7808();
					@Pc(113) int local113;
					if ((local79 & 0x2) != 0 && local73.anInt9035 == 0 && Math.random() * 1000.0D < 10.0D) {
						local113 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(121) int local121 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local113 != 0 || local121 != 0) {
							@Pc(133) int local133 = local73.anIntArray780[0] + local113;
							@Pc(140) int local140 = local73.anIntArray781[0] + local121;
							if (local133 < 0) {
								local133 = 0;
							} else if (local133 > Static237.anInt4563 - local89 - 1) {
								local133 = Static237.anInt4563 - local89 - 1;
							}
							if (local140 < 0) {
								local140 = 0;
							} else if (Static373.anInt6694 - local89 - 1 < local140) {
								local140 = Static373.anInt6694 - local89 - 1;
							}
							@Pc(209) int local209 = Static231.method4172(local89, local73.anIntArray780[0], Static23.anIntArray58, -1, 0, local73.anIntArray781[0], Static362.aClass243Array5[local73.aByte108], Static102.anIntArray160, local140, local89, local133, 0, local89, true);
							if (local209 > 0) {
								if (local209 > 9) {
									local209 = 9;
								}
								for (@Pc(220) int local220 = 0; local220 < local209; local220++) {
									local73.anIntArray780[local220] = Static102.anIntArray160[local209 - local220 - 1];
									local73.anIntArray781[local220] = Static23.anIntArray58[local209 - local220 - 1];
									local73.aByteArray116[local220] = 1;
								}
								local73.anInt9035 = local209;
							}
						}
					}
					Static206.method3822(local73, true);
					local113 = Static187.method3601(local73);
					Static191.method8119(local73, Static470.anInt6888, Static141.anInt2827, local113);
					Static410.method6776(local73);
				}
			}
		}
		if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
			if (Static170.anInt3418 == 2) {
				Static81.method1809();
			} else {
				Static180.method3529();
			}
			if (Static321.anInt6064 >> 7 < 14 || Static237.anInt4563 - 14 <= Static321.anInt6064 >> 7 || Static46.anInt1256 >> 7 < 14 || Static373.anInt6694 - 14 <= Static46.anInt1256 >> 7) {
				Static337.method5697();
			}
		}
		while (true) {
			@Pc(331) Class1_Sub10 local331;
			@Pc(336) Class91 local336;
			@Pc(344) Class91 local344;
			do {
				local331 = (Class1_Sub10) Static434.aClass295_47.method7547();
				if (local331 == null) {
					while (true) {
						do {
							local331 = (Class1_Sub10) Static500.aClass295_60.method7547();
							if (local331 == null) {
								while (true) {
									do {
										local331 = (Class1_Sub10) Static282.aClass295_21.method7547();
										if (local331 == null) {
											if (Static360.aClass91_10 != null) {
												Static137.method2606();
											}
											if (Static445.anInt7791 % 1500 == 0) {
												Static287.method6886();
											}
											if (Static186.anInt3863 == 6 && Static121.anInt2498 == 0) {
												Static179.method3510();
											}
											Static88.method1878();
											if (Static502.aBoolean668 && Static110.method2222() - 60000L > Static257.aLong129) {
												Static141.method2640();
											}
											for (@Pc(515) Class46_Sub3_Sub2 local515 = (Class46_Sub3_Sub2) Static162.aClass184_10.method5138(); local515 != null; local515 = (Class46_Sub3_Sub2) Static162.aClass184_10.method5145()) {
												if ((long) local515.anInt9560 < Static110.method2222() / 1000L - 5L) {
													if (local515.aShort128 > 0) {
														Static229.method4129(local515.aString216 + Static313.aClass45_91.method1474(Static544.anInt7853), 5, "", 0, "");
													}
													if (local515.aShort128 == 0) {
														Static229.method4129(local515.aString216 + Static482.aClass45_125.method1474(Static544.anInt7853), 5, "", 0, "");
													}
													local515.method8227();
												}
											}
											if (Static186.anInt3863 == 6 && Static121.anInt2498 == 0) {
												if (Static200.aClass134_2 == null) {
													Static406.method6459(false);
													return;
												}
												Static201.anInt4048++;
												if (Static201.anInt4048 > 50) {
													Static216.method3997(Static384.aClass252_97);
												}
												try {
													if (Static200.aClass134_2 != null && Static259.aClass1_Sub17_Sub2_1.anInt4872 > 0) {
														Static427.anInt7428 += Static259.aClass1_Sub17_Sub2_1.anInt4872;
														Static200.aClass134_2.method8117(Static259.aClass1_Sub17_Sub2_1.aByteArray58, Static259.aClass1_Sub17_Sub2_1.anInt4872);
														Static201.anInt4048 = 0;
														Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
														return;
													}
												} catch (@Pc(640) IOException local640) {
													Static406.method6459(false);
													return;
												}
											}
											return;
										}
										local336 = local331.aClass91_2;
										if (local336.anInt2395 < 0) {
											break;
										}
										local344 = Static384.method6156(local336.anInt2375);
									} while (local344 == null || local344.lb == null || local336.anInt2395 >= local344.lb.length || local336 != local344.lb[local336.anInt2395]);
									Static173.method3207(local331);
								}
							}
							local336 = local331.aClass91_2;
							if (local336.anInt2395 < 0) {
								break;
							}
							local344 = Static384.method6156(local336.anInt2375);
						} while (local344 == null || local344.lb == null || local336.anInt2395 >= local344.lb.length || local336 != local344.lb[local336.anInt2395]);
						Static173.method3207(local331);
					}
				}
				local336 = local331.aClass91_2;
				if (local336.anInt2395 < 0) {
					break;
				}
				local344 = Static384.method6156(local336.anInt2375);
			} while (local344 == null || local344.lb == null || local344.lb.length <= local336.anInt2395 || local336 != local344.lb[local336.anInt2395]);
			Static173.method3207(local331);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method1569() {
		@Pc(6) int local6;
		if (!Static286.aClass1_Sub15_Sub1_1.aBoolean522) {
			for (local6 = 0; local6 < Static354.anInt6464; local6++) {
				if (Static463.anInterface18Array2[local6].method3594() == 's' || Static463.anInterface18Array2[local6].method3594() == 'S') {
					Static286.aClass1_Sub15_Sub1_1.aBoolean522 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static462.anInt7984 == 0) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local55 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(58) long local58 = Static110.method2222();
			if (Static291.aLong145 == 0L) {
				Static291.aLong145 = local58;
			}
			if (local55 > 16384 && local58 - Static291.aLong145 < 5000L) {
				if (local58 - Static358.aLong176 > 1000L) {
					System.gc();
					Static358.aLong176 = local58;
				}
				Static439.aString187 = Static285.aClass45_84.method1474(Static544.anInt7853);
				Static439.anInt7698 = 5;
			} else {
				Static439.aString187 = Static420.aClass45_111.method1474(Static544.anInt7853);
				Static439.anInt7698 = 5;
				Static462.anInt7984 = 10;
			}
		} else if (Static462.anInt7984 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static362.aClass243Array5[local6] = Static142.method2644(Static373.anInt6694, Static237.anInt4563);
			}
			Static439.aString187 = Static541.aClass45_138.method1474(Static544.anInt7853);
			Static462.anInt7984 = 20;
			Static439.anInt7698 = 10;
		} else if (Static462.anInt7984 == 20) {
			if (Static291.aClass172_1 == null) {
				Static291.aClass172_1 = new Class172(Static302.aClass117_5, Static266.aClass30_2, Static59.aBigInteger1, Static202.aBigInteger3);
			}
			if (Static291.aClass172_1.method4731()) {
				Static79.aClass69_22 = Static286.method5044(true, 0, false);
				Static29.aClass69_10 = Static286.method5044(true, 1, false);
				Static205.aClass69_73 = Static286.method5044(true, 2, false);
				Static351.aClass69_69 = Static286.method5044(true, 3, false);
				Static339.aClass69_66 = Static286.method5044(true, 4, false);
				Static10.aClass69_4 = Static286.method5044(true, 5, true);
				Static521.aClass69_96 = Static286.method5044(false, 6, true);
				Static408.aClass69_78 = Static286.method5044(true, 7, false);
				Static46.aClass69_14 = Static286.method5044(true, 8, false);
				Static260.aClass69_53 = Static286.method5044(true, 9, false);
				Static194.aClass69_38 = Static286.method5044(true, 10, false);
				Static98.aClass69_25 = Static286.method5044(true, 11, false);
				Static153.aClass69_32 = Static286.method5044(true, 12, false);
				Static61.aClass69_18 = Static286.method5044(true, 13, false);
				Static479.aClass69_93 = Static286.method5044(false, 14, false);
				Static234.aClass69_46 = Static286.method5044(true, 15, false);
				Static237.aClass69_47 = Static286.method5044(true, 16, false);
				Static334.aClass69_65 = Static286.method5044(true, 17, false);
				Static11.aClass69_5 = Static286.method5044(true, 18, false);
				Static272.aClass69_54 = Static286.method5044(true, 19, false);
				Static525.aClass69_97 = Static286.method5044(true, 20, false);
				Static80.aClass69_23 = Static286.method5044(true, 21, false);
				Static298.aClass69_59 = Static286.method5044(true, 22, false);
				Static11.aClass69_6 = Static286.method5044(true, 23, true);
				Static112.aClass69_26 = Static286.method5044(true, 24, false);
				Static70.aClass69_19 = Static286.method5044(true, 25, false);
				Static409.aClass69_79 = Static286.method5044(true, 26, true);
				Static216.aClass69_42 = Static286.method5044(true, 27, false);
				Static159.aClass69_35 = Static286.method5044(true, 28, true);
				Static354.aClass69_71 = Static286.method5044(true, 29, false);
				Static307.aClass69_61 = Static286.method5044(true, 30, true);
				Static405.aClass69_77 = Static286.method5044(true, 31, true);
				Static439.aString187 = Static234.aClass45_67.method1474(Static544.anInt7853);
				Static462.anInt7984 = 30;
				Static439.anInt7698 = 15;
			} else {
				Static439.aString187 = Static12.aClass45_8.method1474(Static544.anInt7853);
				Static439.anInt7698 = 12;
			}
		} else if (Static462.anInt7984 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 32; local55++) {
				local6 += Static161.aClass235_Sub1Array1[local55].method6229() * Static449.anIntArray729[local55] / 100;
			}
			if (local6 == 100) {
				Static439.aString187 = Static277.aClass45_81.method1474(Static544.anInt7853);
				Static439.anInt7698 = 20;
				Static382.method6134(Static46.aClass69_14);
				Static175.method3239(Static46.aClass69_14);
				Static462.anInt7984 = 35;
			} else {
				if (local6 != 0) {
					Static439.aString187 = Static213.aClass45_60.method1474(Static544.anInt7853) + local6 + "%";
				}
				Static439.anInt7698 = 20;
			}
		} else if (Static462.anInt7984 == 35) {
			Static289.method5098(Static473.aClass229_14, Static307.aClass69_61);
			Static439.aString187 = Static498.aClass45_131.method1474(Static544.anInt7853);
			Static439.anInt7698 = 20;
			Static462.anInt7984 = 40;
		} else if (Static462.anInt7984 == 40) {
			if (Static159.aClass69_35.method1904()) {
				this.method1579(Static159.aClass69_35.method1890(1));
				this.method1586(Static159.aClass69_35.method1890(3));
				if (Static417.anInt7305 == -1 || Static408.aClass69_78.method1893(Static417.anInt7305, 0)) {
					Static439.aString187 = Static43.aClass45_101.method1474(Static544.anInt7853);
					Static462.anInt7984 = 41;
					Static439.anInt7698 = 25;
				}
			} else {
				Static439.aString187 = Static295.aClass45_87.method1474(Static544.anInt7853) + Static159.aClass69_35.method1902() + "%";
				Static439.anInt7698 = 25;
			}
		} else if (Static462.anInt7984 == 41) {
			local6 = Static167.method3167("jaggl");
			if (local6 >= 0 && local6 < 100) {
				Static439.aString187 = Static513.aClass45_134.method1474(Static544.anInt7853) + local6 + "%";
				Static439.anInt7698 = 25;
			} else {
				Static439.aString187 = Static159.aClass45_54.method1474(Static544.anInt7853);
				Static439.anInt7698 = 25;
				Static462.anInt7984 = 42;
			}
		} else if (Static462.anInt7984 == 42) {
			local6 = Static167.method3167("jagdx");
			if (local6 >= 0 && local6 < 100) {
				Static439.aString187 = Static393.aClass45_105.method1474(Static544.anInt7853) + local6 + "%";
				Static439.anInt7698 = 25;
			} else {
				Static439.aString187 = Static489.aClass45_129.method1474(Static544.anInt7853);
				Static439.anInt7698 = 25;
				Static462.anInt7984 = 43;
			}
		} else if (Static462.anInt7984 == 43) {
			local6 = Static167.method3167("jagmisc");
			if (local6 >= 0 && local6 < 100) {
				Static439.aString187 = Static109.aClass45_39.method1474(Static544.anInt7853) + local6 + "%";
				Static439.anInt7698 = 25;
			} else {
				if (local6 == 100) {
					this.method1563();
				}
				Static439.aString187 = Static152.aClass45_50.method1474(Static544.anInt7853);
				Static462.anInt7984 = 44;
				Static439.anInt7698 = 25;
			}
		} else if (Static462.anInt7984 == 44) {
			local6 = Static167.method3167("sw3d");
			if (local6 >= 0 && local6 < 100) {
				Static439.aString187 = Static473.aClass45_124.method1474(Static544.anInt7853) + local6 + "%";
				Static439.anInt7698 = 25;
			} else {
				Static439.aString187 = Static3.aClass45_3.method1474(Static544.anInt7853);
				Static462.anInt7984 = 45;
				Static439.anInt7698 = 25;
			}
		} else if (Static462.anInt7984 == 45) {
			local6 = Static167.method3167("jaclib");
			if (local6 >= 0 && local6 < 100) {
				Static439.aString187 = Static26.aClass45_16.method1474(Static544.anInt7853) + local6 + "%";
				Static439.anInt7698 = 25;
			} else {
				if (local6 == 100) {
					this.method1552();
				}
				Static439.aString187 = Static464.aClass45_119.method1474(Static544.anInt7853);
				Static462.anInt7984 = 46;
				Static439.anInt7698 = 25;
			}
		} else if (Static462.anInt7984 == 46) {
			local6 = Static167.method3167("hw3d");
			if (local6 >= 0 && local6 < 100) {
				Static439.aString187 = Static426.aClass45_113.method1474(Static544.anInt7853) + local6 + "%";
				Static439.anInt7698 = 25;
			} else {
				Static439.aString187 = Static489.aClass45_128.method1474(Static544.anInt7853);
				Static439.anInt7698 = 25;
				Static462.anInt7984 = 47;
			}
		} else if (Static462.anInt7984 == 47) {
			if (Static405.aClass69_77.method1904()) {
				Static439.aString187 = Static119.aClass45_45.method1474(Static544.anInt7853);
				Static462.anInt7984 = 50;
				Static439.anInt7698 = 25;
			} else {
				Static439.aString187 = Static386.aClass45_123.method1474(Static544.anInt7853);
				Static439.anInt7698 = 25;
			}
		} else if (Static462.anInt7984 == 50) {
			Static17.method536();
			Static439.aString187 = Static113.aClass45_41.method1474(Static544.anInt7853);
			Static439.anInt7698 = 30;
			Static462.anInt7984 = 60;
		} else {
			@Pc(871) int local871;
			if (Static462.anInt7984 == 60) {
				local55 = Static59.method1513(Static61.aClass69_18, Static46.aClass69_14);
				local871 = Static2.method175();
				if (local871 > local55) {
					Static439.aString187 = Static192.aClass45_10.method1474(Static544.anInt7853) + local55 * 100 / local871 + "%";
					Static439.anInt7698 = 35;
				} else {
					Static439.aString187 = Static354.aClass45_98.method1474(Static544.anInt7853);
					Static439.anInt7698 = 35;
					Static462.anInt7984 = 70;
				}
			} else if (Static462.anInt7984 == 70) {
				local55 = Static16.method8203(Static46.aClass69_14);
				local871 = Static223.method4037();
				if (local55 < local871) {
					Static439.aString187 = Static223.aClass45_65.method1474(Static544.anInt7853) + local55 * 100 / local871 + "%";
					Static439.anInt7698 = 40;
				} else {
					Static439.aString187 = Static57.aClass45_27.method1474(Static544.anInt7853);
					Static439.anInt7698 = 40;
					Static462.anInt7984 = 80;
				}
			} else if (Static462.anInt7984 == 80) {
				if (Static409.aClass69_79.method1904()) {
					Static67.anInterface13_6 = new Class217(Static409.aClass69_79, Static260.aClass69_53, Static46.aClass69_14);
					Static439.aString187 = Static160.aClass45_132.method1474(Static544.anInt7853);
					Static439.anInt7698 = 45;
					Static462.anInt7984 = 90;
				} else {
					Static439.aString187 = Static39.aClass45_22.method1474(Static544.anInt7853) + Static409.aClass69_79.method1902() + "%";
					Static439.anInt7698 = 45;
				}
			} else if (Static462.anInt7984 == 90) {
				Static439.aString187 = Static94.aClass45_35.method1474(Static544.anInt7853);
				Static439.anInt7698 = 50;
				Static462.anInt7984 = 95;
			} else if (Static462.anInt7984 == 95) {
				if (Static286.aClass1_Sub15_Sub1_1.aBoolean522) {
					Static286.aClass1_Sub15_Sub1_1.anInt7036 = 0;
					Static286.aClass1_Sub15_Sub1_1.anInt7039 = 0;
					Static286.aClass1_Sub15_Sub1_1.anInt7032 = 0;
					Static286.aClass1_Sub15_Sub1_1.anInt7031 = 1;
					Static286.aClass1_Sub15_Sub1_1.anInt7029 = 0;
				}
				Static286.aClass1_Sub15_Sub1_1.aBoolean522 = true;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
				Static377.method6034(false, Static286.aClass1_Sub15_Sub1_1.anInt7039);
				Static439.aString187 = Static344.aClass45_97.method1474(Static544.anInt7853);
				Static439.anInt7698 = 55;
				Static462.anInt7984 = 100;
			} else if (Static462.anInt7984 == 100) {
				Static289.method5096(Static46.aClass69_14, Static61.aClass69_18, Static455.aClass4_11);
				Static439.aString187 = Static361.aClass45_100.method1474(Static544.anInt7853);
				Static439.anInt7698 = 60;
				Static506.method7745(1);
				Static462.anInt7984 = 110;
			} else if (Static462.anInt7984 == 110) {
				Static205.aClass69_73.method1904();
				local55 = Static205.aClass69_73.method1902();
				Static237.aClass69_47.method1904();
				local55 += Static237.aClass69_47.method1902();
				Static334.aClass69_65.method1904();
				local55 += Static334.aClass69_65.method1902();
				Static11.aClass69_5.method1904();
				local55 += Static11.aClass69_5.method1902();
				Static272.aClass69_54.method1904();
				local55 += Static272.aClass69_54.method1902();
				Static525.aClass69_97.method1904();
				local55 += Static525.aClass69_97.method1902();
				Static80.aClass69_23.method1904();
				local55 += Static80.aClass69_23.method1902();
				Static298.aClass69_59.method1904();
				local55 += Static298.aClass69_59.method1902();
				Static112.aClass69_26.method1904();
				local55 += Static112.aClass69_26.method1902();
				Static70.aClass69_19.method1904();
				local55 += Static70.aClass69_19.method1902();
				Static216.aClass69_42.method1904();
				local55 += Static216.aClass69_42.method1902();
				Static354.aClass69_71.method1904();
				local55 += Static354.aClass69_71.method1902();
				if (local55 < 1200) {
					Static439.aString187 = Static416.aClass45_110.method1474(Static544.anInt7853) + local55 / 12 + "%";
					Static439.anInt7698 = 65;
				} else {
					Static440.aClass266_1 = new Class266(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static398.aClass167_1 = new Class167(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static440.aClass273_1 = new Class273(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73, Static46.aClass69_14);
					Static286.aClass249_1 = new Class249(Static332.aClass250_4, Static544.anInt7853, Static334.aClass69_65);
					Static237.aClass143_2 = new Class143(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static541.aClass264_5 = new Class264(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static10.aClass179_1 = new Class179(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73, Static408.aClass69_78);
					Static409.aClass257_1 = new Class257(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static478.aClass309_1 = new Class309(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static398.aClass18_4 = new Class18(Static332.aClass250_4, Static544.anInt7853, true, Static237.aClass69_47, Static408.aClass69_78);
					Static193.aClass32_2 = new Class32(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73, Static46.aClass69_14);
					Static152.aClass160_1 = new Class160(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73, Static46.aClass69_14);
					Static358.aClass95_1 = new Class95(Static332.aClass250_4, Static544.anInt7853, true, Static11.aClass69_5, Static408.aClass69_78);
					Static181.aClass316_1 = new Class316(Static332.aClass250_4, Static544.anInt7853, true, Static440.aClass266_1, Static272.aClass69_54, Static408.aClass69_78);
					Static337.aClass48_1 = new Class48(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static35.aClass152_1 = new Class152(Static332.aClass250_4, Static544.anInt7853, Static525.aClass69_97, Static79.aClass69_22, Static29.aClass69_10);
					Static402.aClass2_1 = new Class2(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static435.aClass280_1 = new Class280(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static530.aClass195_2 = new Class195(Static332.aClass250_4, Static544.anInt7853, Static80.aClass69_23, Static408.aClass69_78);
					Static99.aClass141_1 = new Class141(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static542.aClass236_1 = new Class236(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static48.aClass269_1 = new Class269(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static363.aClass118_1 = new Class118(Static332.aClass250_4, Static544.anInt7853, Static298.aClass69_59);
					Static292.aClass255_1 = new Class255(Static332.aClass250_4, Static544.anInt7853, Static205.aClass69_73);
					Static351.method5795(Static61.aClass69_18, Static408.aClass69_78, Static46.aClass69_14, Static351.aClass69_69);
					Static322.method5567(Static354.aClass69_71);
					Static429.aClass5_1 = new Class5(Static544.anInt7853, Static112.aClass69_26, Static70.aClass69_19);
					Static221.aClass41_1 = new Class41(Static544.anInt7853, Static112.aClass69_26, Static70.aClass69_19, new Class206());
					Static439.aString187 = Static408.aClass45_109.method1474(Static544.anInt7853);
					Static439.anInt7698 = 65;
					Static36.method1112();
					Static398.aClass18_4.method605(!Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876));
					Static417.aClass10_1 = new Class10();
					Static449.method6959();
					Static42.method1221(Static216.aClass69_42);
					Static457.method7004(Static67.anInterface13_6, Static408.aClass69_78);
					Static462.anInt7984 = 120;
				}
			} else if (Static462.anInt7984 == 120) {
				local55 = Static282.method4957(Static46.aClass69_14);
				local871 = Static175.method3244();
				if (local55 < local871) {
					Static439.aString187 = Static237.aClass45_68.method1474(Static544.anInt7853) + local55 * 100 / local871 + "%";
					Static439.anInt7698 = 70;
				} else {
					Static426.method6641(Static455.aClass4_11, Static46.aClass69_14);
					Static273.method4837(Static62.aClass104Array15);
					Static439.aString187 = Static8.aClass45_7.method1474(Static544.anInt7853);
					Static439.anInt7698 = 70;
					Static462.anInt7984 = 130;
				}
			} else if (Static462.anInt7984 == 130) {
				if (Static194.aClass69_38.method1912("huffman", "")) {
					@Pc(1558) Class199 local1558 = new Class199(Static194.aClass69_38.method1900("", "huffman"));
					Static434.method6717(local1558);
					Static439.aString187 = Static30.aClass45_18.method1474(Static544.anInt7853);
					Static439.anInt7698 = 75;
					Static462.anInt7984 = 140;
				} else {
					Static439.aString187 = Static538.aClass45_137.method1474(Static544.anInt7853) + "0%";
					Static439.anInt7698 = 75;
				}
			} else if (Static462.anInt7984 == 140) {
				if (Static351.aClass69_69.method1904()) {
					Static439.aString187 = Static496.aClass45_130.method1474(Static544.anInt7853);
					Static462.anInt7984 = 150;
					Static439.anInt7698 = 80;
				} else {
					Static439.aString187 = Static295.aClass45_88.method1474(Static544.anInt7853) + Static351.aClass69_69.method1902() + "%";
					Static439.anInt7698 = 80;
				}
			} else if (Static462.anInt7984 == 150) {
				if (Static153.aClass69_32.method1904()) {
					Static439.aString187 = Static322.aClass45_95.method1474(Static544.anInt7853);
					Static439.anInt7698 = 82;
					Static462.anInt7984 = 160;
				} else {
					Static439.aString187 = Static487.aClass45_127.method1474(Static544.anInt7853) + Static153.aClass69_32.method1902() + "%";
					Static439.anInt7698 = 82;
				}
			} else if (Static462.anInt7984 == 160) {
				if (Static61.aClass69_18.method1904()) {
					Static439.aString187 = Static4.aClass45_4.method1474(Static544.anInt7853);
					Static462.anInt7984 = 170;
					Static439.anInt7698 = 85;
				} else {
					Static439.aString187 = Static4.aClass45_4.method1474(Static544.anInt7853) + Static61.aClass69_18.method1902() + "%";
					Static439.anInt7698 = 85;
				}
			} else if (Static462.anInt7984 == 170) {
				if (Static11.aClass69_6.method1908("details")) {
					Static335.method4563(Static11.aClass69_6, Static237.aClass143_2, Static541.aClass264_5, Static398.aClass18_4, Static193.aClass32_2, Static152.aClass160_1, Static417.aClass10_1);
					Static439.aString187 = Static337.aClass45_96.method1474(Static544.anInt7853);
					Static439.anInt7698 = 89;
					Static462.anInt7984 = 190;
				} else {
					Static439.aString187 = Static74.aClass45_32.method1474(Static544.anInt7853) + Static11.aClass69_6.method1907("details") + "%";
					Static439.anInt7698 = 87;
				}
			} else if (Static462.anInt7984 == 190) {
				Static540.anIntArray837 = new int[Static48.aClass269_1.anInt7889];
				Static137.aBooleanArray4 = new boolean[Static48.aClass269_1.anInt7889];
				Static83.aStringArray36 = new String[Static542.aClass236_1.anInt6908];
				for (local55 = 0; local55 < Static48.aClass269_1.anInt7889; local55++) {
					if (Static48.aClass269_1.method6972(local55).anInt7335 == 0) {
						Static137.aBooleanArray4[local55] = true;
						Static94.anInt2056++;
					}
					Static540.anIntArray837[local55] = -1;
				}
				Static222.method4033();
				Static39.anInt1109 = Static351.aClass69_69.method1909("loginscreen");
				Static25.anInt735 = Static351.aClass69_69.method1909("lobbyscreen");
				Static10.aClass69_4.method1894(false);
				Static521.aClass69_96.method1894(true);
				Static46.aClass69_14.method1894(true);
				Static61.aClass69_18.method1894(true);
				Static194.aClass69_38.method1894(true);
				Static351.aClass69_69.method1894(true);
				Static205.aClass69_73.anInt2003 = 2;
				Static243.aBoolean357 = true;
				Static334.aClass69_65.anInt2003 = 2;
				Static237.aClass69_47.anInt2003 = 2;
				Static11.aClass69_5.anInt2003 = 2;
				Static272.aClass69_54.anInt2003 = 2;
				Static525.aClass69_97.anInt2003 = 2;
				Static80.aClass69_23.anInt2003 = 2;
				Static487.method7514(Static286.aClass1_Sub15_Sub1_1.anInt7031, -1, -1, false);
				Static439.aString187 = Static60.aClass45_29.method1474(Static544.anInt7853);
				Static462.anInt7984 = 200;
				Static439.anInt7698 = 95;
			} else if (Static462.anInt7984 == 200) {
				Static506.method7745(2);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	protected void method1564() {
		if (Static449.anInt7876 != 2) {
			this.method1577();
			return;
		}
		try {
			this.method1577();
		} catch (@Pc(17) Throwable local17) {
			Static25.method773(local17, local17.getMessage() + " (Recovered) " + this.method1551());
			Static124.method2356(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1560() {
		if (Static449.anInt7876 != 2) {
			this.method1581();
			return;
		}
		try {
			this.method1581();
		} catch (@Pc(12) Throwable local12) {
			Static25.method773(local12, local12.getMessage() + " (Recovered) " + this.method1551());
			Static124.method2356(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1550()) {
			return;
		}
		Static499.aClass210_4 = new Class210();
		Static499.aClass210_4.anInt6291 = Integer.parseInt(this.getParameter("worldid"));
		Static119.aClass210_2 = new Class210();
		Static119.aClass210_2.anInt6291 = Integer.parseInt(this.getParameter("lobbyid"));
		Static119.aClass210_2.aString150 = this.getParameter("lobbyaddress");
		Static101.aClass210_1 = new Class210();
		Static101.aClass210_1.anInt6291 = Integer.parseInt(this.getParameter("demoid"));
		Static101.aClass210_1.aString150 = this.getParameter("demoaddress");
		Static190.aClass139_1 = Static39.method1122(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static171.method3200(Static190.aClass139_1) && Static190.aClass139_1 != Static334.aClass139_4) {
			Static190.aClass139_1 = Static334.aClass139_4;
		}
		Static362.aClass174_9 = Static44.method8041(Integer.parseInt(this.getParameter("modewhat")));
		if (Static483.aClass174_10 != Static362.aClass174_9 && Static362.aClass174_9 != Static233.aClass174_6 && Static362.aClass174_9 != Static151.aClass174_7) {
			Static362.aClass174_9 = Static151.aClass174_7;
		}
		try {
			Static544.anInt7853 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static544.anInt7853 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static197.aBoolean322 = true;
		} else {
			Static197.aBoolean322 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static23.aBoolean56 = true;
		} else {
			Static23.aBoolean56 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static259.aBoolean375 = true;
		} else {
			Static259.aBoolean375 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static332.aClass250_4 = Static71.aClass250_1;
			} else if (local145.equals("1")) {
				Static332.aClass250_4 = Static116.aClass250_2;
			}
		}
		try {
			Static27.anInt767 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static27.anInt767 = 0;
		}
		Static290.aString130 = this.getParameter("quiturl");
		Static18.aString9 = this.getParameter("settings");
		if (Static18.aString9 == null) {
			Static18.aString9 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static402.anInt7080 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static402.anInt7080 = 0;
			}
		}
		Static332.anInt6229 = Integer.parseInt(this.getParameter("colourid"));
		if (Static332.anInt6229 < 0 || Static172.aColorArray2.length <= Static332.anInt6229) {
			Static332.anInt6229 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static488.aBoolean470 = true;
			Static132.aBoolean231 = true;
		}
		@Pc(226) String local226 = this.getParameter("frombilling");
		if (local226 != null && local226.equals("true")) {
			Static327.aBoolean463 = true;
		}
		Static396.aString177 = this.getParameter("sskey");
		if (Static396.aString177 != null && Static396.aString177.length() < 2) {
			Static396.aString177 = null;
		}
		@Pc(252) String local252 = this.getParameter("force64mb");
		if (local252 != null && local252.equals("true")) {
			Static23.aBoolean55 = true;
		}
		@Pc(264) String local264 = this.getParameter("worldflags");
		if (local264 != null) {
			try {
				Static460.anInt7963 = Integer.parseInt(local264);
			} catch (@Pc(271) Exception local271) {
			}
		}
		Static125.aClient1 = this;
		if (Static71.aClass250_1 == Static332.aClass250_4) {
			Static469.anInt8092 = 765;
			Static60.anInt1482 = 503;
		} else if (Static116.aClass250_2 == Static332.aClass250_4) {
			Static469.anInt8092 = 640;
			Static60.anInt1482 = 480;
		}
		this.method1556(Static362.aClass174_9.method4738() + 32, Static469.anInt8092, Static60.anInt1482);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1573(@OriginalArg(1) int arg0) {
		Static400.anInt6819 = 0;
		Static302.aClass117_5.anInt3159 = arg0;
		Static514.aClass240_2 = null;
		Static339.aClass311_1 = null;
		Static302.aClass117_5.anInt3160++;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1549() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1557() {
		if (Static23.aBoolean55) {
			Static520.anInt9181 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static39.method1120();
		Static266.aClass30_2 = new Class30(Static473.aClass229_14);
		Static302.aClass117_5 = new Class117();
		if (Static190.aClass139_1 != Static334.aClass139_4) {
			Static495.aByteArrayArray26 = new byte[50][];
		}
		Static286.aClass1_Sub15_Sub1_1 = new Class1_Sub15_Sub1(Static473.aClass229_14);
		if (Static190.aClass139_1 == Static334.aClass139_4) {
			Static499.aClass210_4.aString150 = this.getCodeBase().getHost();
		} else if (Static171.method3200(Static190.aClass139_1)) {
			Static499.aClass210_4.aString150 = this.getCodeBase().getHost();
			Static499.aClass210_4.anInt6287 = Static499.aClass210_4.anInt6291 + 40000;
			Static119.aClass210_2.anInt6287 = Static119.aClass210_2.anInt6291 + 40000;
			Static499.aClass210_4.anInt6288 = Static499.aClass210_4.anInt6291 + 50000;
			Static101.aClass210_1.anInt6287 = Static101.aClass210_1.anInt6291 + 40000;
			Static119.aClass210_2.anInt6288 = Static119.aClass210_2.anInt6291 + 50000;
			Static101.aClass210_1.anInt6288 = Static101.aClass210_1.anInt6291 + 50000;
		} else if (Static283.aClass139_2 == Static190.aClass139_1) {
			Static499.aClass210_4.aString150 = "127.0.0.1";
			Static119.aClass210_2.aString150 = "127.0.0.1";
			Static499.aClass210_4.anInt6287 = Static499.aClass210_4.anInt6291 + 40000;
			Static101.aClass210_1.aString150 = "127.0.0.1";
			Static119.aClass210_2.anInt6287 = Static119.aClass210_2.anInt6291 + 40000;
			Static499.aClass210_4.anInt6288 = Static499.aClass210_4.anInt6291 + 50000;
			Static101.aClass210_1.anInt6287 = Static101.aClass210_1.anInt6291 + 40000;
			Static119.aClass210_2.anInt6288 = Static119.aClass210_2.anInt6291 + 50000;
			Static101.aClass210_1.anInt6288 = Static101.aClass210_1.anInt6291 + 50000;
		}
		if (Static116.aClass250_2 == Static332.aClass250_4) {
			Static451.aBoolean585 = true;
			Static429.aShortArray115 = Static412.aShortArray113;
			Static179.anInt3764 = 16777215;
			Static139.anInt2796 = 0;
			Static407.aShortArrayArray8 = Static414.aShortArrayArray9;
			Static488.aShortArrayArray7 = Static191.aShortArrayArray12;
			Static283.aShortArray94 = Static98.aShortArray37;
		} else {
			Static488.aShortArrayArray7 = Static507.aShortArrayArray11;
			Static407.aShortArrayArray8 = Static464.aShortArrayArray10;
			Static429.aShortArray115 = Static172.aShortArray70;
			Static283.aShortArray94 = Static525.aShortArray149;
		}
		if (Static332.aClass250_4 == Static71.aClass250_1) {
			Static450.aBoolean584 = false;
		}
		Static193.aShortArray71 = Static147.aShortArray64 = Static92.aShortArray63 = Static424.aShortArray114 = new short[256];
		Class216.lb = Static499.aClass210_4;
		Static25.aClass241_1 = Static130.method7387(Static312.aCanvas12);
		Static10.aClass99_1 = Static479.method7469(Static312.aCanvas12);
		Static59.anInt1478 = Static380.anInt6743;
		try {
			if (Static473.aClass229_14.aClass208_2 != null) {
				Static45.aClass265_1 = new Class265(Static473.aClass229_14.aClass208_2, 5200, 0);
				for (@Pc(223) int local223 = 0; local223 < 32; local223++) {
					Static522.aClass265Array1[local223] = new Class265(Static473.aClass229_14.aClass208Array1[local223], 6000, 0);
				}
				Static400.aClass265_5 = new Class265(Static473.aClass229_14.aClass208_3, 6000, 0);
				Static199.aClass90_2 = new Class90(255, Static45.aClass265_1, Static400.aClass265_5, 500000);
				Static528.aClass265_6 = new Class265(Static473.aClass229_14.aClass208_1, 24, 0);
				Static473.aClass229_14.aClass208_2 = null;
				Static473.aClass229_14.aClass208_1 = null;
				Static473.aClass229_14.aClass208_3 = null;
				Static473.aClass229_14.aClass208Array1 = null;
			}
		} catch (@Pc(279) IOException local279) {
			Static45.aClass265_1 = null;
			Static400.aClass265_5 = null;
			Static199.aClass90_2 = null;
			Static528.aClass265_6 = null;
		}
		if (Static190.aClass139_1 != Static334.aClass139_4) {
			Static520.aBoolean687 = true;
		}
		if (Static71.aClass250_1 == Static332.aClass250_4) {
			Static382.aString174 = Static105.aClass45_38.method1474(Static544.anInt7853);
		} else if (Static116.aClass250_2 == Static332.aClass250_4) {
			Static382.aString174 = Static434.aClass45_114.method1474(Static544.anInt7853);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1577() {
		if (Static186.anInt3863 == 13) {
			return;
		}
		Static445.anInt7791++;
		if (Static445.anInt7791 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static187.anInt3881 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static425.aRandom1.setSeed((long) Static187.anInt3881);
		}
		if (Static445.anInt7791 % 50 == 0) {
			Static175.anInt3472 = Static427.anInt7428;
			Static282.anInt5383 = Static103.anInt2200;
			Static427.anInt7428 = 0;
			Static103.anInt2200 = 0;
		}
		this.method1584();
		if (Static291.aClass172_1 != null) {
			Static291.aClass172_1.method4729();
		}
		Static545.method8265();
		Static25.aClass241_1.method6305();
		Static10.aClass99_1.method6613();
		if (Static455.aClass4_11 != null) {
			Static455.aClass4_11.method7177((int) Static110.method2222());
		}
		Static449.method6961();
		Static543.anInt9602 = 0;
		Static354.anInt6464 = 0;
		for (@Pc(91) Interface18 local91 = Static25.aClass241_1.method6301(); local91 != null; local91 = Static25.aClass241_1.method6301()) {
			@Pc(97) int local97 = local91.method3593();
			if (local97 == 2 || local97 == 3) {
				@Pc(109) char local109 = local91.method3594();
				if (Static533.method8114() && (local109 == '`' || local109 == '§')) {
					if (Static290.method5103()) {
						Static32.method1061();
					} else {
						Static9.method426();
					}
				} else if (Static354.anInt6464 < 128) {
					Static463.anInterface18Array2[Static354.anInt6464] = local91;
					Static354.anInt6464++;
				}
			} else if (local97 == 0 && Static543.anInt9602 < 75) {
				Static111.anInterface18Array1[Static543.anInt9602] = local91;
				Static543.anInt9602++;
			}
		}
		Static372.anInt6690 = 0;
		for (@Pc(174) Class1_Sub32 local174 = Static10.aClass99_1.method6624(); local174 != null; local174 = Static10.aClass99_1.method6624()) {
			@Pc(180) int local180 = local174.method5776();
			if (local180 == -1) {
				Static479.aClass295_59.method7533(local174);
			} else if (local180 == 6) {
				Static372.anInt6690 += local174.method5775();
			} else if (Static147.method2754(local180)) {
				Static77.aClass295_9.method7533(local174);
				if (Static77.aClass295_9.method7548() > 10) {
					Static77.aClass295_9.method7547();
				}
			}
		}
		if (Static290.method5103()) {
			Static284.method4982();
		}
		if (Static186.anInt3863 == 0) {
			this.method1569();
			Static175.method3240();
		} else if (Static186.anInt3863 == 1) {
			this.method1569();
			Static175.method3240();
		} else if (Static139.method2617(Static186.anInt3863)) {
			Static449.method6955();
		}
		if (Static167.method3162(Static186.anInt3863) && !Static139.method2617(Static186.anInt3863)) {
			this.method1568();
			Static57.method1472();
			Static330.method5622();
		} else if (Static275.method4864(Static186.anInt3863) && !Static139.method2617(Static186.anInt3863)) {
			this.method1568();
			Static330.method5622();
		} else if (Static186.anInt3863 == 11) {
			Static330.method5622();
		} else if (Static215.method3993(Static186.anInt3863) && !Static139.method2617(Static186.anInt3863)) {
			Static26.method784();
		} else if (Static186.anInt3863 == 12) {
			Static330.method5622();
			if (Static358.anInt6481 != -3 && Static358.anInt6481 != 2 && Static358.anInt6481 != 15) {
				Static406.method6459(false);
			}
		}
		Static206.method3820(Static455.aClass4_11);
		Static77.aClass295_9.method7547();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method1579(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub17 local14 = new Class1_Sub17(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method4487();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(29) int[] local29 = Static261.anIntArray418 = new int[6];
					local29[0] = local14.method4494();
					local29[1] = local14.method4494();
					local29[2] = local14.method4494();
					local29[3] = local14.method4494();
					local29[4] = local14.method4494();
					local29[5] = local14.method4494();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local18 == 4) {
						local76 = local14.method4487();
						Static396.anIntArray680 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static396.anIntArray680[local81] = local14.method4494();
							if (Static396.anIntArray680[local81] == 65535) {
								Static396.anIntArray680[local81] = -1;
							}
						}
					} else if (local18 == 5) {
						local76 = local14.method4487();
						Static490.anIntArray757 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static490.anIntArray757[local81] = local14.method4494();
							if (Static490.anIntArray757[local81] == 65535) {
								Static490.anIntArray757[local81] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1559() {
		if (Static502.aBoolean668) {
			Static141.method2640();
		}
		if (Static455.aClass4_11 != null) {
			Static455.aClass4_11.method7150();
		}
		if (Static189.aFrame1 != null) {
			Static435.method6744(Static473.aClass229_14, Static189.aFrame1);
			Static189.aFrame1 = null;
		}
		if (Static200.aClass134_2 != null) {
			Static200.aClass134_2.method8116();
			Static200.aClass134_2 = null;
		}
		Static344.method5745();
		Static302.aClass117_5.method2920();
		Static266.aClass30_2.method1115();
		if (Static288.aClass168_1 != null) {
			Static288.aClass168_1.method4637();
			Static288.aClass168_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1581() {
		if (Static186.anInt3863 == 13) {
			return;
		}
		@Pc(16) long local16 = Static224.method4042() / 1000000L - Static282.aLong137;
		Static282.aLong137 = Static224.method4042() / 1000000L;
		@Pc(24) boolean local24 = Static133.method7840();
		if (local24 && Static410.aBoolean568 && Static486.aClass15_2 != null) {
			Static486.aClass15_2.method3554();
		}
		if (Static372.method5999(Static186.anInt3863)) {
			if (Static537.aLong248 != 0L && Static110.method2222() > Static537.aLong248) {
				Static487.method7514(Static226.method4065(), Static286.aClass1_Sub15_Sub1_1.anInt7038, Static286.aClass1_Sub15_Sub1_1.anInt7035, false);
			} else if (!Static455.aClass4_11.method7208() && Static73.aBoolean145) {
				Static212.method3937();
			}
		}
		@Pc(87) int local87;
		@Pc(91) int local91;
		if (Static189.aFrame1 == null) {
			@Pc(79) Container local79;
			if (Static306.aFrame2 == null) {
				local79 = Static473.aClass229_14.anApplet1;
			} else {
				local79 = Static306.aFrame2;
			}
			local87 = local79.getSize().width;
			local91 = local79.getSize().height;
			if (Static306.aFrame2 == local79) {
				@Pc(97) Insets local97 = Static306.aFrame2.getInsets();
				local87 -= local97.left + local97.right;
				local91 -= local97.top + local97.bottom;
			}
			if (local87 != Static204.anInt4066 || Static199.anInt1460 != local91) {
				if (Static455.aClass4_11 == null || Static455.aClass4_11.method7171()) {
					Static39.method1120();
				} else {
					Static199.anInt1460 = local91;
					Static204.anInt4066 = local87;
				}
				Static537.aLong248 = Static110.method2222() + 500L;
			}
		}
		if (Static189.aFrame1 != null && !Static87.aBoolean160 && Static372.method5999(Static186.anInt3863)) {
			Static487.method7514(Static286.aClass1_Sub15_Sub1_1.anInt7031, -1, -1, false);
		}
		@Pc(156) boolean local156 = false;
		if (Static221.aBoolean338) {
			local156 = true;
			Static221.aBoolean338 = false;
		}
		if (local156) {
			Static311.method5393();
		}
		if (Static455.aClass4_11 != null && Static455.aClass4_11.method7208() || Static226.method4065() != 1) {
			Static402.method6385();
		}
		if (Static186.anInt3863 == 0) {
			Static267.method4740(Static104.aColorArray7[Static332.anInt6229], local156, Static439.anInt7698, Static172.aColorArray2[Static332.anInt6229], Static485.aColorArray6[Static332.anInt6229], Static439.aString187);
		} else if (Static186.anInt3863 == 1) {
			Static200.method3758(Static172.aColorArray2[Static332.anInt6229].getRGB(), Static455.aClass4_11, Static511.aClass36_4, Static455.aClass4_11.method7208() | local156, Static104.aColorArray7[Static332.anInt6229].getRGB(), Static485.aColorArray6[Static332.anInt6229].getRGB());
		} else if (Static49.method1361(Static186.anInt3863)) {
			Static49.method1358();
		} else if (Static188.method3621(Static186.anInt3863)) {
			Static49.method1358();
		} else if (Static139.method2617(Static186.anInt3863)) {
			if (Static134.anInt2698 == 1) {
				if (Static291.anInt5561 < Static519.anInt2064) {
					Static291.anInt5561 = Static519.anInt2064;
				}
				local87 = (Static291.anInt5561 - Static519.anInt2064) * 50 / Static291.anInt5561;
				Static433.method6712(Static246.aClass45_71.method1474(Static544.anInt7853) + "<br>(" + local87 + "%)", true, Static186.aClass36_1);
			} else if (Static134.anInt2698 == 2) {
				if (Static264.anInt9555 > Static155.anInt3072) {
					Static155.anInt3072 = Static264.anInt9555;
				}
				local87 = (Static155.anInt3072 - Static264.anInt9555) * 50 / Static155.anInt3072 + 50;
				Static433.method6712(Static246.aClass45_71.method1474(Static544.anInt7853) + "<br>(" + local87 + "%)", true, Static186.aClass36_1);
			} else {
				Static433.method6712(Static246.aClass45_71.method1474(Static544.anInt7853), true, Static186.aClass36_1);
			}
		} else if (Static186.anInt3863 == 9) {
			Static278.method4888(local16);
		} else if (Static186.anInt3863 == 12) {
			Static433.method6712(Static172.aClass45_55.method1474(Static544.anInt7853) + "<br>" + Static254.aClass45_72.method1474(Static544.anInt7853), true, Static186.aClass36_1);
		}
		if (Static44.anInt9301 == 3) {
			for (local87 = 0; local87 < Static260.anInt5066; local87++) {
				@Pc(385) Rectangle local385 = Class194.aRectangleArray2[local87];
				if (Static272.aBooleanArray19[local87]) {
					Static455.aClass4_11.method7162(-1996553985, local385.width, local385.x, local385.y, local385.height);
				} else if (Static266.aBooleanArray18[local87]) {
					Static455.aClass4_11.method7162(-1996554240, local385.width, local385.x, local385.y, local385.height);
				}
			}
		}
		if (Static290.method5103()) {
			Static124.method2354(Static455.aClass4_11);
		}
		if (Static372.method5999(Static186.anInt3863) && Static44.anInt9301 == 0 && Static226.method4065() == 1 && !local156 && Static380.aString172.equals("1.1")) {
			local87 = 0;
			for (local91 = 0; local91 < Static260.anInt5066; local91++) {
				if (Static266.aBooleanArray18[local91]) {
					Static266.aBooleanArray18[local91] = false;
					Static26.aRectangleArray1[local87++] = Class194.aRectangleArray2[local91];
				}
			}
			Static455.aClass4_11.method7178(Static26.aRectangleArray1, local87);
		} else if (Static186.anInt3863 != 0) {
			Static455.aClass4_11.method7164();
			for (local87 = 0; local87 < Static260.anInt5066; local87++) {
				Static266.aBooleanArray18[local87] = false;
			}
		}
		if (Static286.aClass1_Sub15_Sub1_1.anInt7051 == 0) {
			Static265.method3147(15L);
		} else if (Static286.aClass1_Sub15_Sub1_1.anInt7051 == 1) {
			Static265.method3147(10L);
		} else if (Static286.aClass1_Sub15_Sub1_1.anInt7051 == 2) {
			Static265.method3147(5L);
		} else if (Static286.aClass1_Sub15_Sub1_1.anInt7051 == 3) {
			Static265.method3147(2L);
		}
		if (Static243.aBoolean357) {
			Static93.method1971();
		}
		if (Static286.aClass1_Sub15_Sub1_1.aBoolean522 && Static186.anInt3863 == 2 && Static328.anInt6167 != -1) {
			Static286.aClass1_Sub15_Sub1_1.aBoolean522 = false;
			Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1551() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static538.anInt9485 + "," + Static282.anInt5380 + "," + Static237.anInt4563 + "," + Static373.anInt6694 + "|";
			if (Static107.aClass20_Sub1_Sub1_Sub1_1 != null) {
				local7 = local7 + "2)" + Static322.anInt6113 + "," + (Static538.anInt9485 + Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0]) + "," + (Static282.anInt5380 + Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0]) + "|";
			}
			local7 = local7 + "3)" + Static449.anInt7876 + "|4)" + Static286.aClass1_Sub15_Sub1_1.anInt7032 + "|5)" + Static226.method4065() + "|6)" + Static70.anInt1753 + "," + Static508.anInt8910 + "|";
			local7 = local7 + "7)" + Static286.aClass1_Sub15_Sub1_1.method6361(Static449.anInt7876) + "|";
			local7 = local7 + "8)" + Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876) + "|";
			local7 = local7 + "9)" + Static286.aClass1_Sub15_Sub1_1.aBoolean532 + "|";
			local7 = local7 + "10)" + Static286.aClass1_Sub15_Sub1_1.aBoolean527 + "|";
			local7 = local7 + "11)" + Static286.aClass1_Sub15_Sub1_1.aBoolean520 + "|";
			local7 = local7 + "12)" + Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876) + "|";
			local7 = local7 + "13)" + Static520.anInt9181 + "|";
			local7 = local7 + "14)" + Static186.anInt3863;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static449.anInt7876 == 2) {
					@Pc(231) Class local231 = Class.forName("java.lang.ClassLoader");
					@Pc(235) Field local235 = local231.getDeclaredField("nativeLibraries");
					@Pc(238) Class local238 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(248) Method local248 = local238.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local248.invoke(local235, Boolean.TRUE);
					@Pc(271) Vector local271 = (Vector) local235.get(client.class.getClassLoader());
					for (@Pc(273) int local273 = 0; local271.size() > local273; local273++) {
						try {
							@Pc(279) Object local279 = local271.elementAt(local273);
							@Pc(284) Field local284 = local279.getClass().getDeclaredField("name");
							local248.invoke(local284, Boolean.TRUE);
							try {
								@Pc(299) String local299 = (String) local284.get(local279);
								if (local299 != null && local299.indexOf("sw3d.dll") != -1) {
									@Pc(311) Field local311 = local279.getClass().getDeclaredField("handle");
									local248.invoke(local311, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local311.getLong(local279));
									local248.invoke(local311, Boolean.FALSE);
								}
							} catch (@Pc(347) Throwable local347) {
							}
							local248.invoke(local284, Boolean.FALSE);
						} catch (@Pc(359) Throwable local359) {
						}
					}
				}
			} catch (@Pc(367) Throwable local367) {
			}
			local7 = local7 + "]";
		} catch (@Pc(378) Throwable local378) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1584() {
		@Pc(7) boolean local7 = Static302.aClass117_5.method2932();
		if (!local7) {
			this.method1585();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1585() {
		if (Static459.anInt7958 < Static302.aClass117_5.anInt3160) {
			Class216.lb.aBoolean468 = !Class216.lb.aBoolean468;
			Static463.anInt7994 = (Static302.aClass117_5.anInt3160 * 50 - 50) * 5;
			if (Static463.anInt7994 > 3000) {
				Static463.anInt7994 = 3000;
			}
			if (Static302.aClass117_5.anInt3160 >= 2 && Static302.aClass117_5.anInt3159 == 6) {
				this.method1553("js5connect_outofdate");
				Static186.anInt3863 = 13;
				return;
			}
			if (Static302.aClass117_5.anInt3160 >= 4 && Static302.aClass117_5.anInt3159 == -1) {
				this.method1553("js5crc");
				Static186.anInt3863 = 13;
				return;
			}
			if (Static302.aClass117_5.anInt3160 >= 4 && Static495.method7593(Static186.anInt3863)) {
				if (Static302.aClass117_5.anInt3159 == 7 || Static302.aClass117_5.anInt3159 == 9) {
					this.method1553("js5connect_full");
				} else if (Static302.aClass117_5.anInt3159 <= 0) {
					this.method1553("js5io");
				} else {
					this.method1553("js5connect");
				}
				Static186.anInt3863 = 13;
				return;
			}
		}
		Static459.anInt7958 = Static302.aClass117_5.anInt3160;
		if (Static463.anInt7994 > 0) {
			Static463.anInt7994--;
			return;
		}
		try {
			if (Static400.anInt6819 == 0) {
				Static339.aClass311_1 = Static473.aClass229_14.method6083(Class216.lb.method5716(), Class216.lb.aString150);
				Static400.anInt6819++;
			}
			if (Static400.anInt6819 == 1) {
				if (Static339.aClass311_1.anInt9169 == 2) {
					this.method1573(1000);
					return;
				}
				if (Static339.aClass311_1.anInt9169 == 1) {
					Static400.anInt6819++;
				}
			}
			if (Static400.anInt6819 == 2) {
				Static514.aClass240_2 = new Class240((Socket) Static339.aClass311_1.anObject17, Static473.aClass229_14);
				@Pc(182) Class1_Sub17 local182 = new Class1_Sub17(5);
				local182.method4451(Static10.aClass39_2.anInt1272);
				local182.method4489(605);
				Static514.aClass240_2.method6266(local182.aByteArray58, 5);
				Static400.anInt6819++;
				Static315.aLong155 = Static110.method2222();
			}
			if (Static400.anInt6819 == 3) {
				if (Static495.method7593(Static186.anInt3863) || Static514.aClass240_2.method6264() > 0) {
					@Pc(227) int local227 = Static514.aClass240_2.method6268();
					if (local227 != 0) {
						this.method1573(local227);
						return;
					}
					Static400.anInt6819++;
				} else if (Static110.method2222() - Static315.aLong155 > 30000L) {
					this.method1573(1001);
					return;
				}
			}
			if (Static400.anInt6819 == 4) {
				@Pc(274) boolean local274 = Static186.anInt3863 == 1 || Static167.method3162(Static186.anInt3863) || Static275.method4864(Static186.anInt3863);
				Static302.aClass117_5.method2926(!local274, Static514.aClass240_2);
				Static514.aClass240_2 = null;
				Static400.anInt6819 = 0;
				Static339.aClass311_1 = null;
			}
		} catch (@Pc(291) IOException local291) {
			this.method1573(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V")
	private void method1586(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(arg0);
		while (true) {
			@Pc(17) int local17 = local8.method4487();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static417.anInt7305 = local8.method4494();
			}
		}
	}
}
