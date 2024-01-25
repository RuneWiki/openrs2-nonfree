import jagex3.jagmisc.jagmisc;
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
				Static339.method4919("Argument count");
			}
			Static236.aClass292_2 = new Class292();
			Static236.aClass292_2.anInt7261 = Integer.parseInt(arg0[0]);
			Static323.aClass292_3 = new Class292();
			Static323.aClass292_3.anInt7261 = Integer.parseInt(arg0[1]);
			Static361.aClass292_4 = new Class292();
			Static361.aClass292_4.anInt7261 = Integer.parseInt(arg0[2]);
			Static416.aClass232_7 = Static560.aClass232_19;
			if (arg0[3].equals("live")) {
				Static587.aClass285_4 = Static372.aClass285_2;
			} else if (arg0[3].equals("rc")) {
				Static587.aClass285_4 = Static38.aClass285_1;
			} else if (arg0[3].equals("wip")) {
				Static587.aClass285_4 = Static571.aClass285_3;
			} else {
				Static339.method4919("modewhat");
			}
			Static261.anInt4297 = Static373.method5226(arg0[4]);
			if (Static261.anInt4297 == -1) {
				if (arg0[4].equals("english")) {
					Static261.anInt4297 = 0;
				} else if (arg0[4].equals("german")) {
					Static261.anInt4297 = 1;
				} else {
					Static339.method4919("language");
				}
			}
			Static550.aBoolean537 = false;
			Static341.aBoolean467 = false;
			if (arg0[5].equals("game0")) {
				Static18.aClass308_7 = Static278.aClass308_6;
			} else if (arg0[5].equals("game1")) {
				Static18.aClass308_7 = Static283.aClass308_10;
			} else {
				Static339.method4919("game");
			}
			Static139.anInt2264 = 0;
			Static269.aBoolean329 = false;
			Static409.aString96 = null;
			Static353.aString80 = null;
			Static523.aString125 = "";
			Static309.aLong139 = 0L;
			Static354.anInt6045 = 0;
			Static116.aBoolean134 = false;
			Static516.anInt8248 = 0;
			Static401.anInt6601 = Static18.aClass308_7.anInt7714;
			Static567.aBoolean619 = true;
			Static327.aBoolean433 = true;
			@Pc(163) client local163 = new client();
			Static474.aClient1 = local163;
			local163.method1151(Static18.aClass308_7.aString119, Static587.aClass285_4.method5717() + 32);
			Static223.aFrame2.setLocation(40, 40);
		} catch (@Pc(186) Exception local186) {
			Static357.method5094(local186, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1157() {
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1160() {
		if (Static335.aClass249_2.anInt6251 > Static112.anInt1992) {
			Static489.aClass292_5.method5908();
			Static420.anInt7089 = (Static335.aClass249_2.anInt6251 * 50 - 50) * 5;
			if (Static420.anInt7089 > 3000) {
				Static420.anInt7089 = 3000;
			}
			if (Static335.aClass249_2.anInt6251 >= 2 && Static335.aClass249_2.anInt6250 == 6) {
				this.method1148("js5connect_outofdate");
				Static540.anInt8912 = 14;
				return;
			}
			if (Static335.aClass249_2.anInt6251 >= 4 && Static335.aClass249_2.anInt6250 == -1) {
				this.method1148("js5crc");
				Static540.anInt8912 = 14;
				return;
			}
			if (Static335.aClass249_2.anInt6251 >= 4 && Static592.method7705(Static540.anInt8912)) {
				if (Static335.aClass249_2.anInt6250 == 7 || Static335.aClass249_2.anInt6250 == 9) {
					this.method1148("js5connect_full");
				} else if (Static335.aClass249_2.anInt6250 <= 0) {
					this.method1148("js5io");
				} else if (Static89.aString21 == null) {
					this.method1148("js5connect");
				} else {
					this.method1148("js5proxy_" + Static89.aString21.trim());
				}
				Static540.anInt8912 = 14;
				return;
			}
		}
		Static112.anInt1992 = Static335.aClass249_2.anInt6251;
		if (Static420.anInt7089 > 0) {
			Static420.anInt7089--;
			return;
		}
		try {
			if (Static372.anInt6229 == 0) {
				Static245.aClass5_7 = Static489.aClass292_5.method5912(Static169.aClass99_2);
				Static372.anInt6229++;
			}
			if (Static372.anInt6229 == 1) {
				if (Static245.aClass5_7.anInt151 == 2) {
					if (Static245.aClass5_7.anObject1 != null) {
						Static89.aString21 = (String) Static245.aClass5_7.anObject1;
					}
					this.method1178(1000);
					return;
				}
				if (Static245.aClass5_7.anInt151 == 1) {
					Static372.anInt6229++;
				}
			}
			if (Static372.anInt6229 == 2) {
				Static9.aClass284_1 = new Class284((Socket) Static245.aClass5_7.anObject1, Static169.aClass99_2, 25000);
				@Pc(193) Class2_Sub7 local193 = new Class2_Sub7(5);
				local193.method4459(Static28.aClass283_2.anInt6971);
				local193.method4495(627);
				Static9.aClass284_1.method5709(local193.aByteArray52, 5);
				Static372.anInt6229++;
				Static91.aLong35 = Static362.method5133();
			}
			if (Static372.anInt6229 == 3) {
				if (Static592.method7705(Static540.anInt8912) || Static9.aClass284_1.method5711() > 0) {
					@Pc(255) int local255 = Static9.aClass284_1.method5705();
					if (local255 != 0) {
						this.method1178(local255);
						return;
					}
					Static372.anInt6229++;
				} else if (Static362.method5133() - Static91.aLong35 > 30000L) {
					this.method1178(1001);
					return;
				}
			}
			if (Static372.anInt6229 == 4) {
				@Pc(290) boolean local290 = Static592.method7705(Static540.anInt8912) || Static526.method7746(Static540.anInt8912) || Static397.method5446(Static540.anInt8912);
				@Pc(293) Class4[] local293 = Static5.method81();
				@Pc(301) Class2_Sub7 local301 = new Class2_Sub7(local293.length * 4);
				Static9.aClass284_1.method5716(local301.aByteArray52, 0, local301.aByteArray52.length);
				for (@Pc(312) int local312 = 0; local312 < local293.length; local312++) {
					local293[local312].method78(local301.method4509());
				}
				Static335.aClass249_2.method5220(!local290, Static9.aClass284_1);
				Static245.aClass5_7 = null;
				Static9.aClass284_1 = null;
				Static372.anInt6229 = 0;
			}
		} catch (@Pc(348) IOException local348) {
			this.method1178(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1149() {
		if (Static116.aBoolean134) {
			Static326.anInt7462 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static340.method4948();
		Static281.aClass181_2 = new Class181(Static169.aClass99_2);
		Static335.aClass249_2 = new Class249();
		Static430.method5686(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static340.aClass232_14 != Static416.aClass232_7) {
			Static454.aByteArrayArray18 = new byte[50][];
		}
		Static257.aClass2_Sub35_Sub1_1 = new Class2_Sub35_Sub1(Static169.aClass99_2);
		if (Static416.aClass232_7 == Static340.aClass232_14) {
			Static236.aClass292_2.aString111 = this.getCodeBase().getHost();
		} else if (Static386.method5337(Static416.aClass232_7)) {
			Static236.aClass292_2.aString111 = this.getCodeBase().getHost();
			Static236.aClass292_2.anInt7263 = Static236.aClass292_2.anInt7261 + 40000;
			Static323.aClass292_3.anInt7263 = Static323.aClass292_3.anInt7261 + 40000;
			Static236.aClass292_2.anInt7264 = Static236.aClass292_2.anInt7261 + 50000;
			Static361.aClass292_4.anInt7263 = Static361.aClass292_4.anInt7261 + 40000;
			Static323.aClass292_3.anInt7264 = Static323.aClass292_3.anInt7261 + 50000;
			Static361.aClass292_4.anInt7264 = Static361.aClass292_4.anInt7261 + 50000;
		} else if (Static416.aClass232_7 == Static560.aClass232_19) {
			Static236.aClass292_2.aString111 = "127.0.0.1";
			Static323.aClass292_3.aString111 = "127.0.0.1";
			Static361.aClass292_4.aString111 = "127.0.0.1";
			Static236.aClass292_2.anInt7263 = Static236.aClass292_2.anInt7261 + 40000;
			Static323.aClass292_3.anInt7263 = Static323.aClass292_3.anInt7261 + 40000;
			Static236.aClass292_2.anInt7264 = Static236.aClass292_2.anInt7261 + 50000;
			Static361.aClass292_4.anInt7263 = Static361.aClass292_4.anInt7261 + 40000;
			Static323.aClass292_3.anInt7264 = Static323.aClass292_3.anInt7261 + 50000;
			Static361.aClass292_4.anInt7264 = Static361.aClass292_4.anInt7261 + 50000;
		}
		if (Static278.aClass308_6 == Static18.aClass308_7) {
			Static355.aBoolean472 = false;
		}
		Static307.aShortArray95 = Static560.aShortArray134 = Static579.aShortArray138 = Static459.aShortArray113 = new short[256];
		if (Static18.aClass308_7 == Static283.aClass308_10) {
			Static418.aBoolean542 = true;
			Static179.anInt2669 = 0;
			Static250.aShortArrayArray12 = Static330.aShortArrayArray2;
			Static320.aShortArrayArrayArray3 = Static62.aShortArrayArrayArray1;
			Static268.anInt4385 = 16777215;
		} else {
			Static320.aShortArrayArrayArray3 = Static172.aShortArrayArrayArray2;
			Static250.aShortArrayArray12 = Static213.aShortArrayArray11;
		}
		Static489.aClass292_5 = Static236.aClass292_2;
		try {
			Static588.aClipboard1 = Static474.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(218) Exception local218) {
		}
		Static106.aClass150_3 = Static209.method2579(Static9.aCanvas1);
		Static205.aClass131_1 = Static383.method5318(Static9.aCanvas1);
		try {
			if (Static169.aClass99_2.aClass317_1 != null) {
				Static263.aClass121_1 = new Class121(Static169.aClass99_2.aClass317_1, 5200, 0);
				for (@Pc(240) int local240 = 0; local240 < 35; local240++) {
					Static538.aClass121Array1[local240] = new Class121(Static169.aClass99_2.aClass317Array1[local240], 6000, 0);
				}
				Static504.aClass121_5 = new Class121(Static169.aClass99_2.aClass317_3, 6000, 0);
				Static349.aClass245_4 = new Class245(255, Static263.aClass121_1, Static504.aClass121_5, 500000);
				Static466.aClass121_4 = new Class121(Static169.aClass99_2.aClass317_2, 24, 0);
				Static169.aClass99_2.aClass317Array1 = null;
				Static169.aClass99_2.aClass317_1 = null;
				Static169.aClass99_2.aClass317_2 = null;
				Static169.aClass99_2.aClass317_3 = null;
			}
		} catch (@Pc(296) IOException local296) {
			Static263.aClass121_1 = null;
			Static504.aClass121_5 = null;
			Static349.aClass245_4 = null;
			Static466.aClass121_4 = null;
		}
		if (Static416.aClass232_7 != Static340.aClass232_14) {
			Static222.aBoolean232 = true;
		}
		if (Static278.aClass308_6 == Static18.aClass308_7) {
			Static16.aString6 = Static229.aClass159_1.method2776(Static261.anInt4297);
		} else if (Static18.aClass308_7 == Static283.aClass308_10) {
			Static16.aString6 = Static229.aClass159_2.method2776(Static261.anInt4297);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1140() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static485.anInt7725 + "," + Static310.anInt5129 + "," + Static281.anInt4822 + "," + Static29.anInt491 + "|";
			if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 != null) {
				local7 = local7 + "2)" + Static402.anInt6620 + "," + (Static485.anInt7725 + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray566[0]) + "," + (Static310.anInt5129 + Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anIntArray565[0]) + "|";
			}
			local7 = local7 + "3)" + Static226.anInt3318 + "|4)" + Static257.aClass2_Sub35_Sub1_1.anInt7498 + "|5)" + Static480.method6206() + "|6)" + Static172.anInt2621 + "," + Static187.anInt8962 + "|";
			local7 = local7 + "7)" + Static257.aClass2_Sub35_Sub1_1.method6036(Static226.anInt3318) + "|";
			local7 = local7 + "8)" + Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318) + "|";
			local7 = local7 + "9)" + Static257.aClass2_Sub35_Sub1_1.aBoolean634 + "|";
			local7 = local7 + "10)" + Static257.aClass2_Sub35_Sub1_1.aBoolean624 + "|";
			local7 = local7 + "11)" + Static257.aClass2_Sub35_Sub1_1.aBoolean628 + "|";
			local7 = local7 + "12)" + Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318) + "|";
			local7 = local7 + "13)" + Static326.anInt7462 + "|";
			local7 = local7 + "14)" + Static540.anInt8912;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static226.anInt3318 == 2) {
					@Pc(233) Class local233 = Class.forName("java.lang.ClassLoader");
					@Pc(237) Field local237 = local233.getDeclaredField("nativeLibraries");
					@Pc(240) Class local240 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(250) Method local250 = local240.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local250.invoke(local237, Boolean.TRUE);
					@Pc(273) Vector local273 = (Vector) local237.get(client.class.getClassLoader());
					for (@Pc(275) int local275 = 0; local273.size() > local275; local275++) {
						try {
							@Pc(281) Object local281 = local273.elementAt(local275);
							@Pc(286) Field local286 = local281.getClass().getDeclaredField("name");
							local250.invoke(local286, Boolean.TRUE);
							try {
								@Pc(301) String local301 = (String) local286.get(local281);
								if (local301 != null && local301.indexOf("sw3d.dll") != -1) {
									@Pc(313) Field local313 = local281.getClass().getDeclaredField("handle");
									local250.invoke(local313, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local313.getLong(local281));
									local250.invoke(local313, Boolean.FALSE);
								}
							} catch (@Pc(349) Throwable local349) {
							}
							local250.invoke(local286, Boolean.FALSE);
						} catch (@Pc(361) Throwable local361) {
						}
					}
				}
			} catch (@Pc(369) Throwable local369) {
			}
			local7 = local7 + "]";
		} catch (@Pc(380) Throwable local380) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1166() {
		@Pc(23) int local23;
		if (Static540.anInt8912 == 7 && Static135.anInt8199 == 0) {
			if (Static593.anInt9634 > 1) {
				Static181.anInt2687 = Static390.anInt6454;
				Static593.anInt9634--;
			}
			if (!Static572.aBoolean774) {
				Static519.method1522();
			}
			for (local23 = 0; local23 < 100 && Static533.method7004(); local23++) {
			}
		}
		Static534.anInt8792++;
		Static306.method4399(-1, null, -1);
		Static560.method7327(null, -1, -1);
		Static460.method5966();
		Static390.anInt6454++;
		for (local23 = 0; local23 < Static51.anInt912; local23++) {
			@Pc(77) Class12_Sub2_Sub1_Sub4_Sub2 local77 = Static379.aClass2_Sub5Array1[local23].aClass12_Sub2_Sub1_Sub4_Sub2_1;
			if (local77 != null) {
				@Pc(83) byte local83 = local77.aClass295_1.aByte105;
				if ((local83 & 0x1) != 0) {
					@Pc(94) int local94 = local77.method6777();
					@Pc(115) int local115;
					if ((local83 & 0x2) != 0 && local77.anInt8431 == 0 && Math.random() * 1000.0D < 10.0D) {
						local115 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(123) int local123 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local115 != 0 || local123 != 0) {
							@Pc(140) int local140 = local115 + local77.anIntArray566[0];
							if (local140 < 0) {
								local140 = 0;
							} else if (Static281.anInt4822 - local94 - 1 < local140) {
								local140 = Static281.anInt4822 - local94 - 1;
							}
							@Pc(172) int local172 = local77.anIntArray565[0] + local123;
							if (local172 < 0) {
								local172 = 0;
							} else if (Static29.anInt491 - local94 - 1 < local172) {
								local172 = Static29.anInt491 - local94 - 1;
							}
							@Pc(226) int local226 = Static101.method1527(local94, -1, 0, local77.anIntArray565[0], Static124.anIntArray611, Static176.anIntArray220, local77.anIntArray566[0], 0, local94, local94, Static87.aClass362Array3[local77.aByte128], true, local172, local140);
							if (local226 > 0) {
								if (local226 > 9) {
									local226 = 9;
								}
								for (@Pc(240) int local240 = 0; local240 < local226; local240++) {
									local77.anIntArray566[local240] = Static176.anIntArray220[local226 - local240 - 1];
									local77.anIntArray565[local240] = Static124.anIntArray611[local226 - local240 - 1];
									local77.aByteArray92[local240] = 1;
								}
								local77.anInt8431 = local226;
							}
						}
					}
					Static70.method1161(local77, true);
					local115 = Static327.method4750(local77);
					Static397.method5451(local77);
					Static508.method6606(local77, Static138.anInt2256, Static142.anInt5305, local115);
					Static245.method3481(Static138.anInt2256, local77);
					Static236.method3368(local77);
				}
			}
		}
		if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
			if (Static489.anInt7763 == 2) {
				Static577.method7482();
			} else {
				Static317.method4598();
			}
			if (Static285.anInt2206 >> 9 < 14 || Static281.anInt4822 - 14 <= Static285.anInt2206 >> 9 || Static469.anInt7519 >> 9 < 14 || Static29.anInt491 - 14 <= Static469.anInt7519 >> 9) {
				Static493.method6303();
			}
		}
		while (true) {
			@Pc(367) Class2_Sub10 local367;
			@Pc(372) Class273 local372;
			@Pc(383) Class273 local383;
			do {
				local367 = (Class2_Sub10) Static153.aClass70_7.method1262();
				if (local367 == null) {
					while (true) {
						do {
							local367 = (Class2_Sub10) Static361.aClass70_40.method1262();
							if (local367 == null) {
								while (true) {
									do {
										local367 = (Class2_Sub10) Static213.aClass70_15.method1262();
										if (local367 == null) {
											if (Class12_Sub2_Sub1_Sub3.lb != null) {
												Static158.method6598();
											}
											if (Static532.anInt8757 % 1500 == 0) {
												Static585.method7579();
											}
											if (Static540.anInt8912 == 7 && Static135.anInt8199 == 0) {
												Static508.method6608();
											}
											Static49.method2108();
											if (Static435.aBoolean574 && Static362.method5133() - 60000L > Static266.aLong115) {
												Static25.method354();
											}
											for (@Pc(544) Class12_Sub1_Sub2 local544 = (Class12_Sub1_Sub2) Static235.aClass220_6.method4661(); local544 != null; local544 = (Class12_Sub1_Sub2) Static235.aClass220_6.method4660()) {
												if ((long) local544.anInt6564 < Static362.method5133() / 1000L - 5L) {
													if (local544.aShort84 > 0) {
														Static316.method4596("", 5, local544.aString93 + Static229.aClass159_21.method2776(Static261.anInt4297), "", "", 0);
													}
													if (local544.aShort84 == 0) {
														Static316.method4596("", 5, local544.aString93 + Static229.aClass159_22.method2776(Static261.anInt4297), "", "", 0);
													}
													local544.method7630();
												}
											}
											if (Static540.anInt8912 == 7 && Static135.anInt8199 == 0) {
												if (Static529.aClass124_2 == null) {
													Static449.method5858(false);
													return;
												}
												Static3.anInt2071++;
												if (Static3.anInt2071 > 50) {
													@Pc(643) Class2_Sub34 local643 = Static555.method7264(Static235.aClass154_50, Static551.aClass64_2);
													Static100.method1508(local643);
												}
												try {
													Static509.method6612();
													return;
												} catch (@Pc(650) IOException local650) {
													Static449.method5858(false);
													return;
												}
											}
											return;
										}
										local372 = local367.aClass273_4;
										if (local372.anInt6800 < 0) {
											break;
										}
										local383 = Static594.method7731(local372.anInt6820);
									} while (local383 == null || local383.aClass273Array2 == null || local372.anInt6800 >= local383.aClass273Array2.length || local372 != local383.aClass273Array2[local372.anInt6800]);
									Static566.method7398(local367);
								}
							}
							local372 = local367.aClass273_4;
							if (local372.anInt6800 < 0) {
								break;
							}
							local383 = Static594.method7731(local372.anInt6820);
						} while (local383 == null || local383.aClass273Array2 == null || local383.aClass273Array2.length <= local372.anInt6800 || local372 != local383.aClass273Array2[local372.anInt6800]);
						Static566.method7398(local367);
					}
				}
				local372 = local367.aClass273_4;
				if (local372.anInt6800 < 0) {
					break;
				}
				local383 = Static594.method7731(local372.anInt6820);
			} while (local383 == null || local383.aClass273Array2 == null || local383.aClass273Array2.length <= local372.anInt6800 || local372 != local383.aClass273Array2[local372.anInt6800]);
			Static566.method7398(local367);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1168() {
		if (Static540.anInt8912 == 14) {
			return;
		}
		@Pc(18) long local18 = Static22.method321() / 1000000L - Static439.aLong193;
		Static439.aLong193 = Static22.method321() / 1000000L;
		@Pc(26) boolean local26 = Static549.method7170();
		if (local26 && Static271.aBoolean352 && Static382.aClass7_3 != null) {
			Static382.aClass7_3.method6319();
		}
		if (Static209.method2578(Static540.anInt8912)) {
			if (Static114.aLong46 != 0L && Static114.aLong46 < Static362.method5133()) {
				Static51.method873(Static257.aClass2_Sub35_Sub1_1.anInt7502, false, Static257.aClass2_Sub35_Sub1_1.anInt7511, Static480.method6206());
			} else if (!Static417.aClass162_17.method6848() && Static382.aBoolean500) {
				Static42.method723();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static43.aFrame1 == null) {
			@Pc(76) Container local76;
			if (Static223.aFrame2 != null) {
				local76 = Static223.aFrame2;
			} else if (Static195.anApplet4 == null) {
				local76 = Static414.anApplet_Sub1_1;
			} else {
				local76 = Static195.anApplet4;
			}
			local88 = local76.getSize().width;
			local92 = local76.getSize().height;
			if (local76 == Static223.aFrame2) {
				@Pc(98) Insets local98 = Static223.aFrame2.getInsets();
				local88 -= local98.right + local98.left;
				local92 -= local98.top + local98.bottom;
			}
			if (local88 != Static441.anInt7086 || Static222.anInt3250 != local92 || Static6.aBoolean15) {
				if (Static417.aClass162_17 == null || Static417.aClass162_17.method6865()) {
					Static340.method4948();
				} else {
					Static222.anInt3250 = local92;
					Static441.anInt7086 = local88;
				}
				Static114.aLong46 = Static362.method5133() + 500L;
				Static6.aBoolean15 = false;
			}
		}
		if (Static43.aFrame1 != null && !Static287.aBoolean374 && Static209.method2578(Static540.anInt8912)) {
			Static51.method873(-1, false, -1, Static257.aClass2_Sub35_Sub1_1.anInt7491);
		}
		@Pc(167) boolean local167 = false;
		if (Static199.aBoolean208) {
			Static199.aBoolean208 = false;
			local167 = true;
		}
		if (local167) {
			Static539.method7062();
		}
		if (Static417.aClass162_17 != null && Static417.aClass162_17.method6848() || Static480.method6206() != 1) {
			Static549.method7175();
		}
		if (Static592.method7705(Static540.anInt8912)) {
			Static501.method6523(local167);
		} else if (Static251.method3590(Static540.anInt8912)) {
			Static104.method1542();
		} else if (Static318.method4634(Static540.anInt8912)) {
			Static104.method1542();
		} else if (Static442.method5791(Static540.anInt8912)) {
			if (Static422.anInt6896 == 1) {
				if (Static494.anInt7844 < Static455.anInt7311) {
					Static494.anInt7844 = Static455.anInt7311;
				}
				local88 = (Static494.anInt7844 - Static455.anInt7311) * 50 / Static494.anInt7844;
				Static96.method1453(Static322.aClass37_20, Static229.aClass159_14.method2776(Static261.anInt4297) + "<br>(" + local88 + "%)", Static417.aClass162_17, true, Static266.aClass112_7);
			} else if (Static422.anInt6896 == 2) {
				if (Static346.anInt5968 < Static449.anInt7191) {
					Static346.anInt5968 = Static449.anInt7191;
				}
				local88 = (Static346.anInt5968 - Static449.anInt7191) * 50 / Static346.anInt5968 + 50;
				Static96.method1453(Static322.aClass37_20, Static229.aClass159_14.method2776(Static261.anInt4297) + "<br>(" + local88 + "%)", Static417.aClass162_17, true, Static266.aClass112_7);
			} else {
				Static96.method1453(Static322.aClass37_20, Static229.aClass159_14.method2776(Static261.anInt4297), Static417.aClass162_17, true, Static266.aClass112_7);
			}
		} else if (Static540.anInt8912 == 10) {
			Static555.method7260(local18);
		} else if (Static540.anInt8912 == 13) {
			Static96.method1453(Static322.aClass37_20, Static229.aClass159_16.method2776(Static261.anInt4297) + "<br>" + Static229.aClass159_17.method2776(Static261.anInt4297), Static417.aClass162_17, false, Static266.aClass112_7);
		}
		if (Static527.anInt8456 == 3) {
			for (local88 = 0; local88 < Static292.anInt4935; local88++) {
				@Pc(371) Rectangle local371 = Class198.aRectangleArray2[local88];
				if (Static232.aBooleanArray16[local88]) {
					Static417.aClass162_17.method6885(local371.y, -1996553985, local371.width, local371.x, local371.height);
				} else if (Static217.aBooleanArray11[local88]) {
					Static417.aClass162_17.method6885(local371.y, -1996554240, local371.width, local371.x, local371.height);
				}
			}
		}
		if (Static312.method4451()) {
			Static442.method5789(Static417.aClass162_17);
		}
		if (Static169.aClass99_2.aBoolean149 && Static209.method2578(Static540.anInt8912) && Static527.anInt8456 == 0 && Static480.method6206() == 1 && !local167) {
			local88 = 0;
			for (local92 = 0; local92 < Static292.anInt4935; local92++) {
				if (Static217.aBooleanArray11[local92]) {
					Static217.aBooleanArray11[local92] = false;
					Static93.aRectangleArray1[local88++] = Class198.aRectangleArray2[local92];
				}
			}
			try {
				Static417.aClass162_17.method6869(Static93.aRectangleArray1, local88);
			} catch (@Pc(476) Exception_Sub1 local476) {
			}
		} else if (!Static592.method7705(Static540.anInt8912)) {
			for (local88 = 0; local88 < Static292.anInt4935; local88++) {
				Static217.aBooleanArray11[local88] = false;
			}
			try {
				Static417.aClass162_17.method6842();
			} catch (@Pc(502) Exception_Sub1 local502) {
				Static357.method5094(local502, local502.getMessage() + " (Recovered) " + this.method1140());
				Static368.method6714(0);
			}
		}
		if (Static257.aClass2_Sub35_Sub1_1.anInt7492 == 0) {
			Static263.method3671(15L);
		} else if (Static257.aClass2_Sub35_Sub1_1.anInt7492 == 1) {
			Static263.method3671(10L);
		} else if (Static257.aClass2_Sub35_Sub1_1.anInt7492 == 2) {
			Static263.method3671(5L);
		} else if (Static257.aClass2_Sub35_Sub1_1.anInt7492 == 3) {
			Static263.method3671(2L);
		}
		if (Static99.aBoolean115) {
			Static501.method6522();
		}
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean635 && Static540.anInt8912 == 3 && Static122.anInt2094 != -1) {
			Static257.aClass2_Sub35_Sub1_1.aBoolean635 = false;
			Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1147()) {
			return;
		}
		Static236.aClass292_2 = new Class292();
		Static236.aClass292_2.anInt7261 = Integer.parseInt(this.getParameter("worldid"));
		Static323.aClass292_3 = new Class292();
		Static323.aClass292_3.anInt7261 = Integer.parseInt(this.getParameter("lobbyid"));
		Static323.aClass292_3.aString111 = this.getParameter("lobbyaddress");
		Static361.aClass292_4 = new Class292();
		Static361.aClass292_4.anInt7261 = Integer.parseInt(this.getParameter("demoid"));
		Static361.aClass292_4.aString111 = this.getParameter("demoaddress");
		Static416.aClass232_7 = Static308.method4414(Integer.parseInt(this.getParameter("modewhere")));
		if (Static416.aClass232_7 == Static560.aClass232_19) {
			Static416.aClass232_7 = Static295.aClass232_12;
		} else if (!Static386.method5337(Static416.aClass232_7) && Static340.aClass232_14 != Static416.aClass232_7) {
			Static416.aClass232_7 = Static340.aClass232_14;
		}
		Static587.aClass285_4 = Static117.method1701(Integer.parseInt(this.getParameter("modewhat")));
		if (Static587.aClass285_4 != Static571.aClass285_3 && Static587.aClass285_4 != Static38.aClass285_1 && Static372.aClass285_2 != Static587.aClass285_4) {
			Static587.aClass285_4 = Static372.aClass285_2;
		}
		try {
			Static261.anInt4297 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static261.anInt4297 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static550.aBoolean537 = true;
		} else {
			Static550.aBoolean537 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static341.aBoolean467 = true;
		} else {
			Static341.aBoolean467 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static31.aBoolean30 = true;
		} else {
			Static31.aBoolean30 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static18.aClass308_7 = Static278.aClass308_6;
			} else if (local152.equals("1")) {
				Static18.aClass308_7 = Static283.aClass308_10;
			}
		}
		try {
			Static516.anInt8248 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static516.anInt8248 = 0;
		}
		Static244.aString49 = this.getParameter("quiturl");
		Static523.aString125 = this.getParameter("settings");
		if (Static523.aString125 == null) {
			Static523.aString125 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static354.anInt6045 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static354.anInt6045 = 0;
			}
		}
		Static401.anInt6601 = Integer.parseInt(this.getParameter("colourid"));
		if (Static401.anInt6601 < 0 || Static333.aColorArray1.length <= Static401.anInt6601) {
			Static401.anInt6601 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static567.aBoolean619 = true;
			Static327.aBoolean433 = true;
		}
		@Pc(234) String local234 = this.getParameter("frombilling");
		if (local234 != null && local234.equals("true")) {
			Static269.aBoolean329 = true;
		}
		Static353.aString80 = this.getParameter("sskey");
		if (Static353.aString80 != null && Static353.aString80.length() < 2) {
			Static353.aString80 = null;
		}
		@Pc(258) String local258 = this.getParameter("force64mb");
		if (local258 != null && local258.equals("true")) {
			Static116.aBoolean134 = true;
		}
		@Pc(270) String local270 = this.getParameter("worldflags");
		if (local270 != null) {
			try {
				Static139.anInt2264 = Integer.parseInt(local270);
			} catch (@Pc(277) Exception local277) {
			}
		}
		@Pc(282) String local282 = this.getParameter("userFlow");
		if (local282 != null) {
			try {
				Static309.aLong139 = Long.parseLong(local282);
			} catch (@Pc(289) NumberFormatException local289) {
			}
		}
		Static409.aString96 = this.getParameter("additionalInfo");
		if (Static409.aString96 != null && Static409.aString96.length() > 50) {
			Static409.aString96 = null;
		}
		if (Static278.aClass308_6 == Static18.aClass308_7) {
			Static14.anInt330 = 765;
			Static370.anInt6187 = 503;
		} else if (Static18.aClass308_7 == Static283.aClass308_10) {
			Static370.anInt6187 = 480;
			Static14.anInt330 = 640;
		}
		Static474.aClient1 = this;
		this.method1143(Static18.aClass308_7.aString119, Static370.anInt6187, Static14.anInt330, Static587.aClass285_4.method5717() + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1146() {
		if (Static195.anApplet4 != null && Static9.aCanvas1 == null && !Static169.aClass99_2.aBoolean149) {
			try {
				@Pc(13) Class local13 = Static195.anApplet4.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static9.aCanvas1 = (Canvas) local17.get(Static195.anApplet4);
				local17.set(Static195.anApplet4, null);
				if (Static9.aCanvas1 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1146();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1152() {
		if (Static226.anInt3318 != 2) {
			this.method1168();
			return;
		}
		try {
			this.method1168();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static357.method5094(local25, local25.getMessage() + " (Recovered) " + this.method1140());
			Static368.method6714(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1156() {
		if (Static226.anInt3318 != 2) {
			this.method1174();
			return;
		}
		try {
			this.method1174();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static357.method5094(local19, local19.getMessage() + " (Recovered) " + this.method1140());
			Static368.method6714(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1174() {
		if (Static540.anInt8912 == 14) {
			return;
		}
		Static532.anInt8757++;
		if (Static532.anInt8757 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static287.anInt4869 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static366.aRandom1.setSeed((long) Static287.anInt4869);
		}
		if (Static532.anInt8757 % 50 == 0) {
			Static270.anInt4402 = Static324.anInt5456;
			Static324.anInt5456 = 0;
			Static379.anInt6315 = Static524.anInt8325;
			Static524.anInt8325 = 0;
		}
		this.method1175();
		if (Static517.aClass189_1 != null) {
			Static517.aClass189_1.method3743();
		}
		Static507.method6605();
		Static106.aClass150_3.method2631();
		Static205.aClass131_1.method6541();
		if (Static417.aClass162_17 != null) {
			Static417.aClass162_17.method6829((int) Static362.method5133());
		}
		Static587.method7627();
		Static136.anInt2219 = 0;
		Static69.anInt5062 = 0;
		for (@Pc(98) Interface24 local98 = Static106.aClass150_3.method2629(); local98 != null; local98 = Static106.aClass150_3.method2629()) {
			@Pc(104) int local104 = local98.method7254();
			if (local104 == 2 || local104 == 3) {
				@Pc(116) char local116 = local98.method7251();
				if (Static219.method2676() && (local116 == '`' || local116 == '§' || local116 == '²')) {
					if (Static312.method4451()) {
						Static422.method5652();
					} else {
						Static386.method5338();
					}
				} else if (Static69.anInt5062 < 128) {
					Static344.anInterface24Array2[Static69.anInt5062] = local98;
					Static69.anInt5062++;
				}
			} else if (local104 == 0 && Static136.anInt2219 < 75) {
				Static66.anInterface24Array1[Static136.anInt2219] = local98;
				Static136.anInt2219++;
			}
		}
		Static157.anInt2491 = 0;
		for (@Pc(184) Class2_Sub29 local184 = Static205.aClass131_1.method6543(); local184 != null; local184 = Static205.aClass131_1.method6543()) {
			@Pc(190) int local190 = local184.method6295();
			if (local190 == -1) {
				Static484.aClass70_49.method1269(local184);
			} else if (local190 == 6) {
				Static157.anInt2491 += local184.method6291();
			} else if (Static451.method6826(local190)) {
				Static359.aClass70_17.method1269(local184);
				if (Static359.aClass70_17.method1267() > 10) {
					Static359.aClass70_17.method1262();
				}
			}
		}
		if (Static312.method4451()) {
			Static520.method6722();
		}
		if (Static592.method7705(Static540.anInt8912)) {
			Static475.method4440();
			Static524.method6734();
		} else if (Static442.method5791(Static540.anInt8912)) {
			Static292.method4156();
		}
		if (Static526.method7746(Static540.anInt8912) && !Static442.method5791(Static540.anInt8912)) {
			this.method1166();
			Static265.method3688();
			Static250.method3583();
		} else if (Static397.method5446(Static540.anInt8912) && !Static442.method5791(Static540.anInt8912)) {
			this.method1166();
			Static250.method3583();
		} else if (Static540.anInt8912 == 12) {
			Static250.method3583();
		} else if (Static578.method7492(Static540.anInt8912) && !Static442.method5791(Static540.anInt8912)) {
			Static471.method6068();
		} else if (Static540.anInt8912 == 13) {
			Static250.method3583();
			if (Static263.anInt4318 != -3 && Static263.anInt4318 != 2 && Static263.anInt4318 != 15) {
				Static449.method5858(false);
			}
		}
		Static435.method5715(Static417.aClass162_17);
		Static359.aClass70_17.method1262();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1175() {
		@Pc(7) boolean local7 = Static335.aClass249_2.method5222();
		if (!local7) {
			this.method1160();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1178(@OriginalArg(0) int arg0) {
		Static372.anInt6229 = 0;
		Static245.aClass5_7 = null;
		Static9.aClass284_1 = null;
		Static335.aClass249_2.anInt6250 = arg0;
		Static335.aClass249_2.anInt6251++;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1154() {
		if (Static435.aBoolean574) {
			Static25.method354();
		}
		Static539.method7064();
		if (Static417.aClass162_17 != null) {
			Static417.aClass162_17.method6821();
		}
		if (Static43.aFrame1 != null) {
			Static572.method7446(Static43.aFrame1, Static169.aClass99_2);
			Static43.aFrame1 = null;
		}
		if (Static529.aClass124_2 != null) {
			Static529.aClass124_2.method2256();
			Static529.aClass124_2 = null;
		}
		Static11.method218();
		Static335.aClass249_2.method5221();
		Static281.aClass181_2.method3657();
		if (Static330.aClass209_2 != null) {
			Static330.aClass209_2.method4385();
			Static330.aClass209_2 = null;
		}
		try {
			Static263.aClass121_1.method2179();
			for (@Pc(55) int local55 = 0; local55 < 35; local55++) {
				Static538.aClass121Array1[local55].method2179();
			}
			Static504.aClass121_5.method2179();
			Static466.aClass121_4.method2179();
			Static560.method7328();
		} catch (@Pc(78) Exception local78) {
		}
	}
}
