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

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static338.method4842("Argument count");
			}
			Static320.aClass43_4 = new Class43();
			Static320.aClass43_4.anInt1402 = Integer.parseInt(arg0[0]);
			Static120.aClass43_1 = new Class43();
			Static120.aClass43_1.anInt1402 = Integer.parseInt(arg0[1]);
			Static416.aClass379_6 = Static301.aClass379_9;
			if (arg0[3].equals("live")) {
				Static654.aClass258_4 = Static267.aClass258_1;
			} else if (arg0[3].equals("rc")) {
				Static654.aClass258_4 = Static577.aClass258_3;
			} else if (arg0[3].equals("wip")) {
				Static654.aClass258_4 = Static268.aClass258_2;
			} else {
				Static338.method4842("modewhat");
			}
			Static456.anInt7118 = Static495.method6769(arg0[4]);
			if (Static456.anInt7118 == -1) {
				if (arg0[4].equals("english")) {
					Static456.anInt7118 = 0;
				} else if (arg0[4].equals("german")) {
					Static456.anInt7118 = 1;
				} else {
					Static338.method4842("language");
				}
			}
			Static632.aBoolean654 = false;
			Static304.aBoolean320 = false;
			if (arg0[5].equals("game0")) {
				Static346.aClass309_6 = Static326.aClass309_5;
			} else if (arg0[5].equals("game1")) {
				Static346.aClass309_6 = Static422.aClass309_8;
			} else if (arg0[5].equals("game2")) {
				Static346.aClass309_6 = Static494.aClass309_9;
			} else if (arg0[5].equals("game3")) {
				Static346.aClass309_6 = Static411.aClass309_7;
			} else {
				Static338.method4842("game");
			}
			Static667.anInt10219 = Static346.aClass309_6.anInt8217;
			Static268.aLong150 = 0L;
			Static353.aString68 = null;
			Static67.aBoolean116 = false;
			Static373.anInt2732 = 0;
			Static440.aBoolean450 = true;
			Static601.aBoolean608 = true;
			Static259.aBoolean257 = false;
			Static281.anInt4321 = 0;
			Static633.aByteArray92 = null;
			Static65.aString113 = "";
			Static297.anInt4549 = 0;
			@Pc(241) client local241 = new client();
			Static459.aClient1 = local241;
			local241.method1843(Static654.aClass258_4.method5719() + 32, Static346.aClass309_6.aString103);
			Static628.aFrame2.setLocation(40, 40);
		} catch (@Pc(264) Exception local264) {
			Static275.method4893((String) null, local264);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1858() {
		@Pc(13) boolean local13 = Static294.aClass349_3.method7772();
		if (!local13) {
			this.method1874();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1859() {
		@Pc(50) int local50;
		if (Static98.anInt2140 == 7 && !Static524.method7018(-1) || Static98.anInt2140 == 9 && Static289.anInt4432 == 42) {
			if (Static708.anInt11107 > 1) {
				Static365.anInt5729 = Static475.anInt7494;
				Static708.anInt11107--;
			}
			if (!Static530.aBoolean556) {
				Static205.method3103();
			}
			for (local50 = 0; local50 < 100 && Static414.method5528(Static95.aClass292_1); local50++) {
			}
		}
		Static286.anInt4372++;
		Static713.method9475(-1, -1, (Class270) null);
		Static262.method3720(-1, -1, (Class270) null);
		Static642.method8457();
		Static475.anInt7494++;
		for (local50 = 0; local50 < Static568.anInt8629; local50++) {
			@Pc(99) Class9_Sub1_Sub1_Sub2_Sub2 local99 = Static169.aClass3_Sub52Array1[local50].aClass9_Sub1_Sub1_Sub2_Sub2_2;
			if (local99 != null) {
				@Pc(105) byte local105 = local99.aClass219_1.aByte79;
				if ((local105 & 0x1) != 0) {
					@Pc(116) int local116 = local99.method7485();
					@Pc(144) int local144;
					if ((local105 & 0x2) != 0 && local99.anInt8817 == 0 && Math.random() * 1000.0D < 10.0D) {
						local144 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(152) int local152 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local144 != 0 || local152 != 0) {
							@Pc(166) int local166 = local99.anIntArray644[0] + local144;
							if (local166 < 0) {
								local166 = 0;
							} else if (local166 > Static497.anInt7926 - local116 - 1) {
								local166 = Static497.anInt7926 - local116 - 1;
							}
							@Pc(199) int local199 = local99.anIntArray643[0] + local152;
							if (local199 < 0) {
								local199 = 0;
							} else if (Static646.anInt9979 - local116 - 1 < local199) {
								local199 = Static646.anInt9979 - local116 - 1;
							}
							@Pc(251) int local251 = Static173.method8685(true, local166, Static125.anIntArray151, 0, -1, local99.anIntArray643[0], local116, 0, local99.anIntArray644[0], local199, Static68.anIntArray87, local116, Static455.aClass109Array1[local99.aByte139], local116);
							if (local251 > 0) {
								if (local251 > 9) {
									local251 = 9;
								}
								for (@Pc(265) int local265 = 0; local265 < local251; local265++) {
									local99.anIntArray644[local265] = Static68.anIntArray87[local251 - local265 - 1];
									local99.anIntArray643[local265] = Static125.anIntArray151[local251 - local265 - 1];
									local99.aByteArray86[local265] = 1;
								}
								local99.anInt8817 = local251;
							}
						}
					}
					Static455.method6040(true, local99);
					local144 = Static339.method4851(local99);
					Static392.method5318(local99);
					Static364.method5040(local144, Static268.anInt4146, Static285.anInt4361, local99);
					Static534.method7109(local99, Static285.anInt4361);
					Static515.method6958(local99);
				}
			}
		}
		if ((Static98.anInt2140 == 3 || Static98.anInt2140 == 9 || Static98.anInt2140 == 7) && (!Static524.method7018(-1) || Static98.anInt2140 == 9 && Static289.anInt4432 == 42) && Static446.anInt6827 == 0) {
			if (Static262.anInt4081 == 2) {
				Static38.method1144();
			} else {
				Static26.method929();
			}
			if (Static305.anInt4908 >> 9 < 14 || Static497.anInt7926 - 14 <= Static305.anInt4908 >> 9 || Static263.anInt4101 >> 9 < 14 || Static646.anInt9979 - 14 <= Static263.anInt4101 >> 9) {
				Static559.method7322();
			}
		}
		while (true) {
			@Pc(448) Class3_Sub41 local448;
			@Pc(453) Class270 local453;
			@Pc(468) Class270 local468;
			do {
				local448 = (Class3_Sub41) Static477.aClass342_58.method7653();
				if (local448 == null) {
					while (true) {
						do {
							local448 = (Class3_Sub41) Static408.aClass342_48.method7653();
							if (local448 == null) {
								while (true) {
									do {
										local448 = (Class3_Sub41) Static501.aClass342_61.method7653();
										if (local448 == null) {
											if (Static334.aClass270_10 != null) {
												Static655.method8594();
											}
											if (Static716.anInt11157 % 1500 == 0) {
												Static147.method2484();
											}
											if (Static98.anInt2140 == 7 && !Static524.method7018(2 - 3) || Static98.anInt2140 == 9 && Static289.anInt4432 == 42) {
												Static425.method5642();
											}
											Static444.method5885();
											if (Static652.aBoolean155 && Static517.method6965() - 60000L > Static346.aLong189) {
												Static563.method7341();
											}
											for (@Pc(666) Class9_Sub2_Sub2 local666 = (Class9_Sub2_Sub2) Static187.aClass319_3.method7195(); local666 != null; local666 = (Class9_Sub2_Sub2) Static187.aClass319_3.method7188()) {
												if (Static517.method6965() / 1000L - 5L > (long) local666.anInt2345) {
													if (local666.aShort41 > 0) {
														Static97.method1971(local666.aString42 + Static430.aClass257_19.method5699(Static456.anInt7118), "", "", "", 5, 0);
													}
													if (local666.aShort41 == 0) {
														Static97.method1971(local666.aString42 + Static430.aClass257_20.method5699(Static456.anInt7118), "", "", "", 5, 0);
													}
													local666.method9182();
												}
											}
											if (-3 != -3) {
												Static85.aClass238_Sub1Array1 = null;
											}
											if (Static98.anInt2140 == 7 && !Static524.method7018(-1) || Static98.anInt2140 == 9 && Static289.anInt4432 == 42) {
												if (Static98.anInt2140 != 9 && Static95.aClass292_1.aClass118_2 == null) {
													Static164.method2681(false);
													return;
												}
												if (Static95.aClass292_1 != null) {
													Static95.aClass292_1.anInt8015++;
													if (Static95.aClass292_1.anInt8015 > 50) {
														@Pc(823) Class3_Sub29 local823 = Static507.method6901(Static658.aClass144_101, Static95.aClass292_1.aClass88_2);
														Static95.aClass292_1.method6855(local823);
													}
													try {
														Static95.aClass292_1.method6851();
														return;
													} catch (@Pc(832) IOException local832) {
														if (Static98.anInt2140 != 9) {
															Static164.method2681(false);
															return;
														}
														Static95.aClass292_1.method6852();
														return;
													}
												}
											}
											return;
										}
										local453 = local448.aClass270_12;
										if (local453.anInt7020 < 0) {
											break;
										}
										local468 = Static254.method3544(local453.anInt7050);
									} while (local468 == null || local468.aClass270Array3 == null || local453.anInt7020 >= local468.aClass270Array3.length || local468.aClass270Array3[local453.anInt7020] != local453);
									Static540.method7160(local448);
								}
							}
							local453 = local448.aClass270_12;
							if (local453.anInt7020 < 0) {
								break;
							}
							local468 = Static254.method3544(local453.anInt7050);
						} while (local468 == null || local468.aClass270Array3 == null || local468.aClass270Array3.length <= local453.anInt7020 || local453 != local468.aClass270Array3[local453.anInt7020]);
						Static540.method7160(local448);
					}
				}
				local453 = local448.aClass270_12;
				if (local453.anInt7020 < 0) {
					break;
				}
				local468 = Static254.method3544(local453.anInt7050);
			} while (local468 == null || local468.aClass270Array3 == null || local468.aClass270Array3.length <= local453.anInt7020 || local453 != local468.aClass270Array3[local453.anInt7020]);
			Static540.method7160(local448);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1853() {
		if (Static652.aBoolean155) {
			Static563.method7341();
		}
		Static318.method1660();
		if (Static153.aClass22_4 != null) {
			Static153.aClass22_4.method9397();
		}
		if (Static702.aFrame3 != null) {
			Static392.method5317(Static122.aClass47_1, Static702.aFrame3);
			Static702.aFrame3 = null;
		}
		Static95.aClass292_2.method6852();
		Static95.aClass292_1.method6852();
		Static355.method9498();
		Static294.aClass349_3.method7771();
		Static717.aClass176_3.method3853();
		if (Static417.aClass24_2 != null) {
			Static417.aClass24_2.method977();
			Static417.aClass24_2 = null;
		}
		try {
			Static314.aClass203_3.method4774();
			for (@Pc(58) int local58 = 0; local58 < 37; local58++) {
				Static430.aClass203Array1[local58].method4774();
			}
			Static280.aClass203_2.method4774();
			Static169.aClass203_1.method4774();
			Static707.method9439();
		} catch (@Pc(93) Exception local93) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
	@Override
	public String method1842() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static291.anInt4448 + "," + Static189.anInt3243 + "," + Static497.anInt7926 + "," + Static646.anInt9979 + "|";
			if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 != null) {
				local7 = local7 + "2)" + Static723.anInt11225 + "," + (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0] + Static291.anInt4448) + "," + (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0] + Static189.anInt3243) + "|";
			}
			local7 = local7 + "3)" + Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() + "|4)" + Static580.aClass3_Sub22_24.aClass21_Sub6_1.method3188() + "|5)" + Static276.method3880(3) + "|6)" + Static681.anInt10652 + "," + Static76.anInt1720 + "|";
			local7 = local7 + "7)" + Static580.aClass3_Sub22_24.aClass21_Sub2_1.method1740() + "|";
			local7 = local7 + "8)" + Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242() + "|";
			local7 = local7 + "9)" + Static580.aClass3_Sub22_24.aClass21_Sub25_1.method7954() + "|";
			local7 = local7 + "10)" + Static580.aClass3_Sub22_24.aClass21_Sub27_1.method8320() + "|";
			local7 = local7 + "11)" + Static580.aClass3_Sub22_24.aClass21_Sub19_1.method5679() + "|";
			local7 = local7 + "12)" + Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() + "|";
			local7 = local7 + "13)" + Static7.anInt229 + "|";
			local7 = local7 + "14)" + Static98.anInt2140;
			if (Static12.aClass3_Sub39_12 != null) {
				local7 = local7 + "|15)" + Static12.aClass3_Sub39_12.anInt5861;
			}
			try {
				if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 2) {
					@Pc(276) Class local276 = Class.forName("java.lang.ClassLoader");
					@Pc(282) Field local282 = local276.getDeclaredField("nativeLibraries");
					@Pc(287) Class local287 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(299) Method local299 = local287.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local299.invoke(local282, Boolean.TRUE);
					@Pc(325) Vector local325 = (Vector) local282.get((Static85.aClass8 == null ? (Static85.aClass8 = a("client")) : Static85.aClass8).getClassLoader());
					for (@Pc(327) int local327 = 0; local325.size() > local327; local327++) {
						try {
							@Pc(333) Object local333 = local325.elementAt(local327);
							@Pc(340) Field local340 = local333.getClass().getDeclaredField("name");
							local299.invoke(local340, Boolean.TRUE);
							try {
								@Pc(355) String local355 = (String) local340.get(local333);
								if (local355 != null && local355.indexOf("sw3d.dll") != -1) {
									@Pc(373) Field local373 = local333.getClass().getDeclaredField("handle");
									local299.invoke(local373, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local373.getLong(local333));
									local299.invoke(local373, Boolean.FALSE);
								}
							} catch (@Pc(411) Throwable local411) {
							}
							local299.invoke(local340, Boolean.FALSE);
						} catch (@Pc(423) Throwable local423) {
						}
					}
				}
			} catch (@Pc(433) Throwable local433) {
			}
			local7 = local7 + "]";
		} catch (@Pc(449) Throwable local449) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1868() {
		if (Static98.anInt2140 == 16) {
			return;
		}
		@Pc(19) long local19 = Static453.method6003() / 1000000L - Static673.aLong333;
		Static673.aLong333 = Static453.method6003() / 1000000L;
		@Pc(27) boolean local27 = Static104.method2098();
		if (local27 && Static627.aBoolean651 && Static467.aClass107_3 != null) {
			Static467.aClass107_3.method5380();
		}
		if (Static679.method9037(Static98.anInt2140)) {
			if (Static42.aLong42 != 0L && Static517.method6965() > Static42.aLong42) {
				Static112.method2180(Static276.method3880(3), false, Static257.anInt3930, Static55.anInt1396);
			} else if (!Static153.aClass22_4.method9340() && Static689.aBoolean728) {
				Static317.method4648();
			}
		}
		@Pc(109) int local109;
		@Pc(113) int local113;
		if (Static702.aFrame3 == null) {
			@Pc(93) Container local93;
			if (Static628.aFrame2 != null) {
				local93 = Static628.aFrame2;
			} else if (Static41.anApplet1 == null) {
				local93 = Static229.anApplet_Sub1_1;
			} else {
				local93 = Static41.anApplet1;
			}
			local109 = local93.getSize().width;
			local113 = local93.getSize().height;
			if (local93 == Static628.aFrame2) {
				@Pc(119) Insets local119 = Static628.aFrame2.getInsets();
				local113 -= local119.top + local119.bottom;
				local109 -= local119.left + local119.right;
			}
			if (Static91.anInt2083 != local109 || Static342.anInt5491 != local113 || Static477.aBoolean507) {
				if (Static153.aClass22_4 == null || Static153.aClass22_4.method9335()) {
					Static205.method3108();
				} else {
					Static91.anInt2083 = local109;
					Static342.anInt5491 = local113;
				}
				Static42.aLong42 = Static517.method6965() + 500L;
				Static477.aBoolean507 = false;
			}
		}
		if (Static702.aFrame3 != null && !Static213.aBoolean221 && Static679.method9037(Static98.anInt2140)) {
			Static112.method2180(Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), false, -1, -1);
		}
		@Pc(210) boolean local210 = false;
		if (Static43.aBoolean88) {
			Static43.aBoolean88 = false;
			local210 = true;
		}
		if (local210) {
			Static598.method7697();
		}
		if (Static153.aClass22_4 != null && Static153.aClass22_4.method9340() || Static276.method3880(3) != 1) {
			Static402.method5423();
		}
		if (Static161.method2613(Static98.anInt2140)) {
			Static725.method9584(local210);
		} else if (Static190.method9221(Static98.anInt2140)) {
			Static453.method6004(124);
		} else if (Static67.method1511(Static98.anInt2140)) {
			Static453.method6004(90);
		} else if (Static664.method8658(124, Static98.anInt2140)) {
			if (Static104.anInt2258 == 1) {
				if (Static294.anInt4507 > Static20.anInt696) {
					Static20.anInt696 = Static294.anInt4507;
				}
				local109 = (Static20.anInt696 - Static294.anInt4507) * 50 / Static20.anInt696;
				Static472.method6430(Static153.aClass22_4, true, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_12.method5699(Static456.anInt7118) + "<br>(" + local109 + "%)");
			} else if (Static104.anInt2258 == 2) {
				if (Static208.anInt3445 > Static335.anInt5388) {
					Static335.anInt5388 = Static208.anInt3445;
				}
				local109 = (Static335.anInt5388 - Static208.anInt3445) * 50 / Static335.anInt5388 + 50;
				Static472.method6430(Static153.aClass22_4, true, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_12.method5699(Static456.anInt7118) + "<br>(" + local109 + "%)");
			} else {
				Static472.method6430(Static153.aClass22_4, true, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_12.method5699(Static456.anInt7118));
			}
		} else if (Static98.anInt2140 == 11) {
			Static606.method7782(local19);
		} else if (Static98.anInt2140 == 14) {
			Static472.method6430(Static153.aClass22_4, false, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_14.method5699(Static456.anInt7118) + "<br>" + Static430.aClass257_15.method5699(Static456.anInt7118));
		} else if (Static98.anInt2140 == 15) {
			Static472.method6430(Static153.aClass22_4, false, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_30.method5699(Static456.anInt7118));
		}
		if (Static262.anInt4080 == 3) {
			for (local109 = 0; local109 < Static440.anInt6772; local109++) {
				@Pc(472) Rectangle local472 = Class202.aRectangleArray1[local109];
				if (Static452.aBooleanArray17[local109]) {
					Static153.aClass22_4.method9399(local472.width, local472.height, -65281, local472.x, local472.y);
				} else if (Static472.aBooleanArray19[local109]) {
					Static153.aClass22_4.method9399(local472.width, local472.height, -65536, local472.x, local472.y);
				} else {
					Static153.aClass22_4.method9399(local472.width, local472.height, -16711936, local472.x, local472.y);
				}
			}
		}
		if (Static647.method8510()) {
			Static203.method3085(Static153.aClass22_4);
		}
		if (Static122.aClass47_1.aBoolean106 && Static679.method9037(Static98.anInt2140) && Static262.anInt4080 == 0 && Static276.method3880(3) == 1 && !local210) {
			local109 = 0;
			for (local113 = 0; local113 < Static440.anInt6772; local113++) {
				if (Static472.aBooleanArray19[local113]) {
					Static472.aBooleanArray19[local113] = false;
					Static365.aRectangleArray2[local109++] = Class202.aRectangleArray1[local113];
				}
			}
			try {
				if (Static347.aBoolean360) {
					Static348.method4920(local109, Static365.aRectangleArray2);
				} else {
					Static153.aClass22_4.method9400(local109, Static365.aRectangleArray2);
				}
			} catch (@Pc(618) Exception_Sub1 local618) {
			}
		} else if (!Static161.method2613(Static98.anInt2140)) {
			for (local109 = 0; local109 < Static440.anInt6772; local109++) {
				Static472.aBooleanArray19[local109] = false;
			}
			try {
				if (Static347.aBoolean360) {
					Static627.method8257();
				} else {
					Static153.aClass22_4.method9358();
				}
			} catch (@Pc(659) Exception_Sub1 local659) {
				Static275.method4893(local659.getMessage() + " (Recovered) " + this.method1842(), local659);
				Static36.method1127(false, 0);
			}
		}
		Static89.method1910();
		local109 = Static580.aClass3_Sub22_24.aClass21_Sub12_1.method4833();
		if (local109 == 0) {
			Static550.method7219(15L);
		} else if (local109 == 1) {
			Static550.method7219(10L);
		} else if (local109 == 2) {
			Static550.method7219(5L);
		} else if (local109 == 3) {
			Static550.method7219(2L);
		}
		if (Static484.aBoolean511) {
			Static678.method9033();
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub20_1.method5715() == 1 && Static98.anInt2140 == 3 && Static589.anInt8959 != -1) {
			Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub20_1);
			Static124.method2284();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1870(@OriginalArg(1) int arg0) {
		Static641.aClass338_9 = null;
		Static300.aClass348_4 = null;
		Static21.anInt708 = 0;
		Static294.aClass349_3.anInt9191++;
		Static294.aClass349_3.anInt9192 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1872() {
		if (Static98.anInt2140 == 16) {
			return;
		}
		Static716.anInt11157++;
		if (Static716.anInt11157 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static548.anInt8967 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static342.aRandom1.setSeed((long) Static548.anInt8967);
		}
		Static95.aClass292_2.method6859();
		Static95.aClass292_1.method6859();
		this.method1858();
		if (Static100.aClass33_1 != null) {
			Static100.aClass33_1.method1150();
		}
		Static326.method4759();
		Static25.method710();
		Static43.aClass50_1.method7398();
		Static334.aClass18_1.method4195();
		if (Static153.aClass22_4 != null) {
			Static153.aClass22_4.method9394((int) Static517.method6965());
		}
		Static368.method5068();
		Static303.anInt4880 = 0;
		Static362.anInt5713 = 0;
		for (@Pc(98) Interface26 local98 = Static43.aClass50_1.method7397(); local98 != null; local98 = Static43.aClass50_1.method7397()) {
			@Pc(106) int local106 = local98.method5022();
			if (local106 == 2 || local106 == 3) {
				@Pc(145) char local145 = local98.method5026();
				if (Static347.method4914() && (local145 == '`' || local145 == '§' || local145 == '²')) {
					if (Static647.method8510()) {
						Static597.method7694();
					} else {
						Static242.method3457();
					}
				} else if (Static303.anInt4880 < 128) {
					Static708.anInterface26Array2[Static303.anInt4880] = local98;
					Static303.anInt4880++;
				}
			} else if (local106 == 0 && Static362.anInt5713 < 75) {
				Static461.anInterface26Array1[Static362.anInt5713] = local98;
				Static362.anInt5713++;
			}
		}
		Static452.anInt6919 = 0;
		for (@Pc(217) Class3_Sub23 local217 = Static334.aClass18_1.method4198(); local217 != null; local217 = Static334.aClass18_1.method4198()) {
			@Pc(225) int local225 = local217.method3194();
			if (local225 == -1) {
				Static10.aClass342_1.method7654(local217);
			} else if (local225 == 6) {
				Static452.anInt6919 += local217.method3198();
			} else if (Static555.method6569(local225)) {
				Static114.aClass342_21.method7654(local217);
				if (Static114.aClass342_21.method7647() > 10) {
					Static114.aClass342_21.method7653();
				}
			}
		}
		if (Static647.method8510()) {
			Static238.method3425();
		}
		if (Static161.method2613(Static98.anInt2140)) {
			Static317.method4643();
			Static32.method1057(113);
		} else if (Static664.method8658(109, Static98.anInt2140)) {
			Static303.method4483();
		}
		if (Static461.method6259(Static98.anInt2140) && !Static664.method8658(104, Static98.anInt2140)) {
			this.method1859();
			Static197.method6350();
			Static461.method6262();
		} else if (Static14.method502(Static98.anInt2140) && !Static664.method8658(118, Static98.anInt2140)) {
			this.method1859();
			Static461.method6262();
		} else if (Static98.anInt2140 == 13) {
			Static461.method6262();
		} else if (Static472.method6431(Static98.anInt2140) && !Static664.method8658(0x0 ^ 0x75, Static98.anInt2140)) {
			Static531.method7069();
		} else if (Static98.anInt2140 == 14 || Static98.anInt2140 == 15) {
			Static461.method6262();
			if (Static289.anInt4432 != -3 && Static289.anInt4432 != 2 && Static289.anInt4432 != 15) {
				if (Static98.anInt2140 == 15) {
					Static474.anInt7460 = Static289.anInt4432;
					Static127.anInt2527 = Static92.anInt2098;
					Static369.anInt5763 = Static325.anInt5284;
					if (Static472.aBoolean500) {
						Static615.method7906(Static668.aClass43_5.anInt1402, Static668.aClass43_5.aString20);
						Static95.aClass292_2.aClass118_2 = null;
						Static336.method4832(14);
					} else {
						Static164.method2681(Static374.aBoolean376);
					}
				} else {
					Static164.method2681(false);
				}
			}
		}
		Static239.method3435(Static153.aClass22_4);
		Static114.aClass342_21.method7653();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1874() {
		if (Static120.anInt2460 < Static294.aClass349_3.anInt9191) {
			Static226.aClass43_3.method1304();
			Static361.anInt5675 = (Static294.aClass349_3.anInt9191 - 1) * 50 * 5;
			if (Static361.anInt5675 > 3000) {
				Static361.anInt5675 = 3000;
			}
			if (Static294.aClass349_3.anInt9191 >= 2 && Static294.aClass349_3.anInt9192 == 6) {
				this.method1845("js5connect_outofdate");
				Static98.anInt2140 = 16;
				return;
			}
			if (Static294.aClass349_3.anInt9191 >= 4 && Static294.aClass349_3.anInt9192 == -1) {
				this.method1845("js5crc");
				Static98.anInt2140 = 16;
				return;
			}
			if (Static294.aClass349_3.anInt9191 >= 4 && Static161.method2613(Static98.anInt2140)) {
				if (Static294.aClass349_3.anInt9192 == 7 || Static294.aClass349_3.anInt9192 == 9) {
					this.method1845("js5connect_full");
				} else if (Static294.aClass349_3.anInt9192 <= 0) {
					this.method1845("js5io");
				} else if (Static418.aString85 == null) {
					this.method1845("js5connect");
				} else {
					this.method1845("js5proxy_" + Static418.aString85.trim());
				}
				Static98.anInt2140 = 16;
				return;
			}
		}
		Static120.anInt2460 = Static294.aClass349_3.anInt9191;
		if (Static361.anInt5675 > 0) {
			Static361.anInt5675--;
			return;
		}
		try {
			if (Static21.anInt708 == 0) {
				Static641.aClass338_9 = Static226.aClass43_3.method1307(Static122.aClass47_1);
				Static21.anInt708++;
			}
			if (Static21.anInt708 == 1) {
				if (Static641.aClass338_9.anInt8934 == 2) {
					if (Static641.aClass338_9.anObject16 != null) {
						Static418.aString85 = (String) Static641.aClass338_9.anObject16;
					}
					this.method1870(1000);
					return;
				}
				if (Static641.aClass338_9.anInt8934 == 1) {
					Static21.anInt708++;
				}
			}
			if (Static21.anInt708 == 2) {
				Static300.aClass348_4 = new Class348((Socket) Static641.aClass338_9.anObject16, Static122.aClass47_1, 25000);
				@Pc(262) Class3_Sub2 local262 = new Class3_Sub2(5);
				local262.method2065(Static596.aClass146_2.anInt3686);
				local262.method2018(665);
				Static300.aClass348_4.method7738(5, local262.aByteArray20);
				Static21.anInt708++;
				Static420.aLong221 = Static517.method6965();
			}
			if (Static21.anInt708 == 3) {
				if (Static161.method2613(Static98.anInt2140) || Static300.aClass348_4.method7737() > 0) {
					@Pc(310) int local310 = Static300.aClass348_4.method7742();
					if (local310 != 0) {
						this.method1870(local310);
						return;
					}
					Static21.anInt708++;
				} else if (Static517.method6965() - Static420.aLong221 > 30000L) {
					this.method1870(1001);
					return;
				}
			}
			if (Static21.anInt708 == 4) {
				@Pc(373) boolean local373 = Static161.method2613(Static98.anInt2140) || Static461.method6259(Static98.anInt2140) || Static14.method502(Static98.anInt2140);
				@Pc(378) Class44[] local378 = Static56.method1317();
				@Pc(386) Class3_Sub2 local386 = new Class3_Sub2(local378.length * 4);
				Static300.aClass348_4.method7740(local386.aByteArray20, local386.aByteArray20.length, 0);
				for (@Pc(399) int local399 = 0; local399 < local378.length; local399++) {
					local378[local399].method1319(local386.method2036());
				}
				Static294.aClass349_3.method7762(!local373, Static300.aClass348_4);
				Static641.aClass338_9 = null;
				Static300.aClass348_4 = null;
				Static21.anInt708 = 0;
			}
		} catch (@Pc(442) IOException local442) {
			this.method1870(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1851() {
		if (Static67.aBoolean116) {
			Static7.anInt229 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static205.method3108();
		Static717.aClass176_3 = new Class176(Static122.aClass47_1);
		Static294.aClass349_3 = new Class349();
		Static512.method9063(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static286.aClass379_8 != Static416.aClass379_6) {
			Static644.aByteArrayArray19 = new byte[50][];
		}
		Static580.aClass3_Sub22_24 = Static50.method1252();
		if (Static286.aClass379_8 == Static416.aClass379_6) {
			Static320.aClass43_4.aString20 = this.getCodeBase().getHost();
		} else if (Static473.method6435(Static416.aClass379_6)) {
			Static320.aClass43_4.aString20 = this.getCodeBase().getHost();
			Static320.aClass43_4.anInt1400 = Static320.aClass43_4.anInt1402 + 40000;
			Static320.aClass43_4.anInt1404 = Static320.aClass43_4.anInt1402 + 50000;
			Static120.aClass43_1.anInt1400 = Static120.aClass43_1.anInt1402 + 40000;
			Static120.aClass43_1.anInt1404 = Static120.aClass43_1.anInt1402 + 50000;
		} else if (Static301.aClass379_9 == Static416.aClass379_6) {
			Static320.aClass43_4.aString20 = "127.0.0.1";
			Static120.aClass43_1.aString20 = "127.0.0.1";
			Static320.aClass43_4.anInt1400 = Static320.aClass43_4.anInt1402 + 40000;
			Static320.aClass43_4.anInt1404 = Static320.aClass43_4.anInt1402 + 50000;
			Static120.aClass43_1.anInt1400 = Static120.aClass43_1.anInt1402 + 40000;
			Static120.aClass43_1.anInt1404 = Static120.aClass43_1.anInt1402 + 50000;
		}
		if (Static346.aClass309_6 == Static326.aClass309_5) {
			Static705.aBoolean743 = false;
		}
		Static657.aShortArray139 = Static94.aShortArray13 = Static214.aShortArray28 = Static397.aShortArray75 = new short[256];
		Static226.aClass43_3 = Static320.aClass43_4;
		try {
			Static627.aClipboard1 = Static459.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(193) Exception local193) {
		}
		Static43.aClass50_1 = Static499.method6810(Static508.aCanvas8);
		Static334.aClass18_1 = Static626.method8233(Static508.aCanvas8);
		try {
			if (Static122.aClass47_1.aClass288_1 != null) {
				Static314.aClass203_3 = new Class203(Static122.aClass47_1.aClass288_1, 5200, 0);
				for (@Pc(215) int local215 = 0; local215 < 37; local215++) {
					Static430.aClass203Array1[local215] = new Class203(Static122.aClass47_1.aClass288Array1[local215], 6000, 0);
				}
				Static280.aClass203_2 = new Class203(Static122.aClass47_1.aClass288_2, 6000, 0);
				Static257.aClass199_3 = new Class199(255, Static314.aClass203_3, Static280.aClass203_2, 500000);
				Static169.aClass203_1 = new Class203(Static122.aClass47_1.aClass288_3, 24, 0);
				Static122.aClass47_1.aClass288Array1 = null;
				Static122.aClass47_1.aClass288_1 = null;
				Static122.aClass47_1.aClass288_2 = null;
				Static122.aClass47_1.aClass288_3 = null;
			}
		} catch (@Pc(277) IOException local277) {
			Static169.aClass203_1 = null;
			Static257.aClass199_3 = null;
			Static280.aClass203_2 = null;
			Static314.aClass203_3 = null;
		}
		if (Static416.aClass379_6 != Static286.aClass379_8) {
			Static714.aBoolean755 = true;
		}
		Static310.aString61 = Static430.aClass257_12.method5699(Static456.anInt7118);
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1849()) {
			return;
		}
		Static320.aClass43_4 = new Class43();
		Static320.aClass43_4.anInt1402 = Integer.parseInt(this.getParameter("worldid"));
		Static120.aClass43_1 = new Class43();
		Static120.aClass43_1.anInt1402 = Integer.parseInt(this.getParameter("lobbyid"));
		Static120.aClass43_1.aString20 = this.getParameter("lobbyaddress");
		Static416.aClass379_6 = Static717.method9502(Integer.parseInt(this.getParameter("modewhere")));
		if (Static416.aClass379_6 == Static301.aClass379_9) {
			Static416.aClass379_6 = Static585.aClass379_10;
		} else if (!Static473.method6435(Static416.aClass379_6) && Static416.aClass379_6 != Static286.aClass379_8) {
			Static416.aClass379_6 = Static286.aClass379_8;
		}
		Static654.aClass258_4 = Static148.method2489(Integer.parseInt(this.getParameter("modewhat")));
		if (Static268.aClass258_2 != Static654.aClass258_4 && Static577.aClass258_3 != Static654.aClass258_4 && Static654.aClass258_4 != Static267.aClass258_1) {
			Static654.aClass258_4 = Static267.aClass258_1;
		}
		try {
			Static456.anInt7118 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			Static456.anInt7118 = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static632.aBoolean654 = true;
		} else {
			Static632.aBoolean654 = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static304.aBoolean320 = true;
		} else {
			Static304.aBoolean320 = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static608.aBoolean613 = true;
		} else {
			Static608.aBoolean613 = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static346.aClass309_6 = Static326.aClass309_5;
			} else if (local190.equals("1")) {
				Static346.aClass309_6 = Static422.aClass309_8;
			} else if (local190.equals("2")) {
				Static346.aClass309_6 = Static494.aClass309_9;
			} else if (local190.equals("3")) {
				Static346.aClass309_6 = Static411.aClass309_7;
			}
		}
		try {
			Static281.anInt4321 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static281.anInt4321 = 0;
		}
		Static7.aString2 = this.getParameter("quiturl");
		Static65.aString113 = this.getParameter("settings");
		if (Static65.aString113 == null) {
			Static65.aString113 = "";
		}
		Static504.aBoolean540 = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static373.anInt2732 = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static373.anInt2732 = 0;
			}
		}
		Static667.anInt10219 = Integer.parseInt(this.getParameter("colourid"));
		if (Static667.anInt10219 < 0 || Static581.aColorArray3.length <= Static667.anInt10219) {
			Static667.anInt10219 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static440.aBoolean450 = true;
			Static601.aBoolean608 = true;
		}
		@Pc(332) String local332 = this.getParameter("frombilling");
		if (local332 != null && local332.equals("true")) {
			Static259.aBoolean257 = true;
		}
		@Pc(352) String local352 = this.getParameter("sskey");
		if (local352 != null) {
			Static633.aByteArray92 = Static510.method6924(Static565.method7348(local352));
			if (Static633.aByteArray92.length < 16) {
				Static633.aByteArray92 = null;
			}
		}
		@Pc(376) String local376 = this.getParameter("force64mb");
		if (local376 != null && local376.equals("true")) {
			Static67.aBoolean116 = true;
		}
		@Pc(396) String local396 = this.getParameter("worldflags");
		if (local396 != null) {
			try {
				Static297.anInt4549 = Integer.parseInt(local396);
			} catch (@Pc(403) Exception local403) {
			}
		}
		@Pc(410) String local410 = this.getParameter("userFlow");
		if (local410 != null) {
			try {
				Static268.aLong150 = Long.parseLong(local410);
			} catch (@Pc(418) NumberFormatException local418) {
			}
		}
		Static353.aString68 = this.getParameter("additionalInfo");
		if (Static353.aString68 != null && Static353.aString68.length() > 50) {
			Static353.aString68 = null;
		}
		Static459.aClient1 = this;
		if (Static326.aClass309_5 == Static346.aClass309_6) {
			Static221.anInt3616 = 765;
			Static700.anInt10927 = 503;
		} else if (Static422.aClass309_8 == Static346.aClass309_6) {
			Static221.anInt3616 = 640;
			Static700.anInt10927 = 480;
		}
		this.method1856(Static346.aClass309_6.aString103, Static654.aClass258_4.method5719() + 32, Static700.anInt10927, Static221.anInt3616);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1839() {
		if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 2) {
			this.method1872();
			return;
		}
		try {
			this.method1872();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static275.method4893(local19.getMessage() + " (Recovered) " + this.method1842(), local19);
			Static234.aBoolean236 = true;
			Static36.method1127(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method1841() {
		if (Static41.anApplet1 != null && Static508.aCanvas8 == null && !Static122.aClass47_1.aBoolean106) {
			try {
				@Pc(17) Class local17 = Static41.anApplet1.getClass();
				@Pc(23) Field local23 = local17.getDeclaredField("canvas");
				Static508.aCanvas8 = (Canvas) local23.get(Static41.anApplet1);
				local23.set(Static41.anApplet1, (Object) null);
				if (Static508.aCanvas8 != null) {
					return;
				}
			} catch (@Pc(37) Exception local37) {
			}
		}
		super.method1841();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1847() {
		if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() != 2) {
			this.method1868();
			return;
		}
		try {
			this.method1868();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static275.method4893(local24.getMessage() + " (Recovered) " + this.method1842(), local24);
			Static234.aBoolean236 = true;
			Static36.method1127(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1848() {
	}
}
