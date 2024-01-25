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
				Static475.method6509("Argument count");
			}
			Static56.aClass65_1 = new Class65();
			Static56.aClass65_1.anInt2279 = Integer.parseInt(arg0[0]);
			Static460.aClass65_3 = new Class65();
			Static460.aClass65_3.anInt2279 = Integer.parseInt(arg0[1]);
			Static338.aClass65_2 = new Class65();
			Static338.aClass65_2.anInt2279 = Integer.parseInt(arg0[2]);
			Static559.aClass173_9 = Static52.aClass173_6;
			if (arg0[3].equals("live")) {
				Static181.aClass215_3 = Static75.aClass215_1;
			} else if (arg0[3].equals("rc")) {
				Static181.aClass215_3 = Static233.aClass215_4;
			} else if (arg0[3].equals("wip")) {
				Static181.aClass215_3 = Static180.aClass215_2;
			} else {
				Static475.method6509("modewhat");
			}
			Static131.anInt2839 = Static339.method5172(arg0[4]);
			if (Static131.anInt2839 == -1) {
				if (arg0[4].equals("english")) {
					Static131.anInt2839 = 0;
				} else if (arg0[4].equals("german")) {
					Static131.anInt2839 = 1;
				} else {
					Static475.method6509("language");
				}
			}
			Static437.aBoolean572 = false;
			Static464.aBoolean600 = false;
			if (arg0[5].equals("game0")) {
				Static227.aClass211_1 = Static250.aClass211_2;
			} else if (arg0[5].equals("game1")) {
				Static227.aClass211_1 = Static560.aClass211_4;
			} else {
				Static475.method6509("game");
			}
			Static367.aBoolean520 = false;
			Static53.aBoolean91 = false;
			Static148.aString42 = null;
			Static502.aString109 = "";
			Static69.aBoolean162 = true;
			Static35.aBoolean75 = true;
			Static350.anInt8128 = 0;
			Static250.anInt4577 = Static227.aClass211_1.anInt5793;
			Static428.aString28 = null;
			Static541.anInt8510 = 0;
			Static513.aLong237 = 0L;
			Static352.anInt4606 = 0;
			@Pc(165) client local165 = new client();
			Static478.aClient1 = local165;
			local165.method1614(Static181.aClass215_3.method5134() + 32, Static227.aClass211_1.aString77);
			Static92.aFrame1.setLocation(40, 40);
		} catch (@Pc(189) Exception local189) {
			Static379.method5607(null, local189);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1633() {
		if (Static153.aClass331_1.anInt8370 > Static96.anInt2327) {
			Static583.aClass65_5.method2046();
			Static36.anInt854 = (Static153.aClass331_1.anInt8370 - 1) * 50 * 5;
			if (Static36.anInt854 > 3000) {
				Static36.anInt854 = 3000;
			}
			if (Static153.aClass331_1.anInt8370 >= 2 && Static153.aClass331_1.anInt8369 == 6) {
				this.method1630("js5connect_outofdate");
				Static246.anInt4542 = 14;
				return;
			}
			if (Static153.aClass331_1.anInt8370 >= 4 && Static153.aClass331_1.anInt8369 == -1) {
				this.method1630("js5crc");
				Static246.anInt4542 = 14;
				return;
			}
			if (Static153.aClass331_1.anInt8370 >= 4 && Static276.method4414(Static246.anInt4542)) {
				if (Static153.aClass331_1.anInt8369 == 7 || Static153.aClass331_1.anInt8369 == 9) {
					this.method1630("js5connect_full");
				} else if (Static153.aClass331_1.anInt8369 <= 0) {
					this.method1630("js5io");
				} else if (Static581.aString127 == null) {
					this.method1630("js5connect");
				} else {
					this.method1630("js5proxy_" + Static581.aString127.trim());
				}
				Static246.anInt4542 = 14;
				return;
			}
		}
		Static96.anInt2327 = Static153.aClass331_1.anInt8370;
		if (Static36.anInt854 > 0) {
			Static36.anInt854--;
			return;
		}
		try {
			if (Static477.anInt7762 == 0) {
				Static549.aClass192_10 = Static583.aClass65_5.method2044(Static409.aClass221_6);
				Static477.anInt7762++;
			}
			if (Static477.anInt7762 == 1) {
				if (Static549.aClass192_10.anInt5186 == 2) {
					if (Static549.aClass192_10.anObject30 != null) {
						Static581.aString127 = (String) Static549.aClass192_10.anObject30;
					}
					this.method1644(1000);
					return;
				}
				if (Static549.aClass192_10.anInt5186 == 1) {
					Static477.anInt7762++;
				}
			}
			if (Static477.anInt7762 == 2) {
				Static107.aClass277_2 = new Class277((Socket) Static549.aClass192_10.anObject30, Static409.aClass221_6);
				@Pc(193) Class3_Sub11 local193 = new Class3_Sub11(5);
				local193.method3079(Static115.aClass92_2.anInt2893);
				local193.method3101(620);
				Static107.aClass277_2.method6185(5, local193.aByteArray36);
				Static477.anInt7762++;
				Static202.aLong115 = Static587.method7753();
			}
			if (Static477.anInt7762 == 3) {
				if (Static276.method4414(Static246.anInt4542) || Static107.aClass277_2.method6183() > 0) {
					@Pc(236) int local236 = Static107.aClass277_2.method6181();
					if (local236 != 0) {
						this.method1644(local236);
						return;
					}
					Static477.anInt7762++;
				} else if (Static587.method7753() - Static202.aLong115 > 30000L) {
					this.method1644(1001);
					return;
				}
			}
			if (Static477.anInt7762 == 4) {
				@Pc(288) boolean local288 = Static276.method4414(Static246.anInt4542) || Static382.method5640(Static246.anInt4542) || Static419.method7098(Static246.anInt4542);
				@Pc(291) Class6[] local291 = Static9.method116();
				@Pc(299) Class3_Sub11 local299 = new Class3_Sub11(local291.length * 4);
				Static107.aClass277_2.method6182(local299.aByteArray36, local299.aByteArray36.length, 0);
				for (@Pc(310) int local310 = 0; local310 < local291.length; local310++) {
					local291[local310].method112(local299.method3116());
				}
				Static153.aClass331_1.method7003(!local288, Static107.aClass277_2);
				Static107.aClass277_2 = null;
				Static549.aClass192_10 = null;
				Static477.anInt7762 = 0;
			}
		} catch (@Pc(346) IOException local346) {
			this.method1644(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1628() {
		if (Static590.aBoolean729) {
			Static537.method3881();
		}
		Static397.method5822();
		if (Static4.aClass43_1 != null) {
			Static4.aClass43_1.method7179();
		}
		if (Static311.aFrame2 != null) {
			Static553.method7390(Static409.aClass221_6, Static311.aFrame2);
			Static311.aFrame2 = null;
		}
		if (Static78.aClass152_2 != null) {
			Static78.aClass152_2.method3908();
			Static78.aClass152_2 = null;
		}
		Static398.method5824();
		Static153.aClass331_1.method7002();
		Static546.aClass125_3.method3231();
		if (Static490.aClass102_3 != null) {
			Static490.aClass102_3.method2800();
			Static490.aClass102_3 = null;
		}
		try {
			Static565.aClass204_5.method4817();
			for (@Pc(57) int local57 = 0; local57 < 35; local57++) {
				Static51.aClass204Array1[local57].method4817();
			}
			Static412.aClass204_4.method4817();
			Static174.aClass204_3.method4817();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1612() {
		if (Static260.anInt4932 != 2) {
			this.method1653();
			return;
		}
		try {
			this.method1653();
		} catch (@Pc(20) ThreadDeath local20) {
			throw local20;
		} catch (@Pc(23) Throwable local23) {
			Static379.method5607(local23.getMessage() + " (Recovered) " + this.method1613(), local23);
			Static137.method2648(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1613() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static529.anInt8344 + "," + Static463.anInt7588 + "," + Static400.anInt6818 + "," + Static271.anInt5050 + "|";
			if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 != null) {
				local7 = local7 + "2)" + Static209.anInt8182 + "," + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] + Static529.anInt8344) + "," + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] + Static463.anInt7588) + "|";
			}
			local7 = local7 + "3)" + Static260.anInt4932 + "|4)" + Static278.aClass3_Sub13_Sub1_1.anInt5159 + "|5)" + Static294.method4660() + "|6)" + Static318.anInt5754 + "," + Static447.anInt7372 + "|";
			local7 = local7 + "7)" + Static278.aClass3_Sub13_Sub1_1.method4457(Static260.anInt4932) + "|";
			local7 = local7 + "8)" + Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932) + "|";
			local7 = local7 + "9)" + Static278.aClass3_Sub13_Sub1_1.aBoolean404 + "|";
			local7 = local7 + "10)" + Static278.aClass3_Sub13_Sub1_1.aBoolean410 + "|";
			local7 = local7 + "11)" + Static278.aClass3_Sub13_Sub1_1.aBoolean408 + "|";
			local7 = local7 + "12)" + Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932) + "|";
			local7 = local7 + "13)" + Static597.anInt9433 + "|";
			local7 = local7 + "14)" + Static246.anInt4542;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(221) Throwable local221) {
			}
			try {
				if (Static260.anInt4932 == 2) {
					@Pc(227) Class local227 = Class.forName("java.lang.ClassLoader");
					@Pc(231) Field local231 = local227.getDeclaredField("nativeLibraries");
					@Pc(234) Class local234 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(244) Method local244 = local234.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local244.invoke(local231, Boolean.TRUE);
					@Pc(267) Vector local267 = (Vector) local231.get(client.class.getClassLoader());
					for (@Pc(269) int local269 = 0; local269 < local267.size(); local269++) {
						try {
							@Pc(275) Object local275 = local267.elementAt(local269);
							@Pc(280) Field local280 = local275.getClass().getDeclaredField("name");
							local244.invoke(local280, Boolean.TRUE);
							try {
								@Pc(295) String local295 = (String) local280.get(local275);
								if (local295 != null && local295.indexOf("sw3d.dll") != -1) {
									@Pc(308) Field local308 = local275.getClass().getDeclaredField("handle");
									local244.invoke(local308, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local308.getLong(local275));
									local244.invoke(local308, Boolean.FALSE);
								}
							} catch (@Pc(344) Throwable local344) {
							}
							local244.invoke(local280, Boolean.FALSE);
						} catch (@Pc(356) Throwable local356) {
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

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1632() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1623() {
		if (Static260.anInt4932 != 2) {
			this.method1648();
			return;
		}
		try {
			this.method1648();
		} catch (@Pc(18) ThreadDeath local18) {
			throw local18;
		} catch (@Pc(21) Throwable local21) {
			Static379.method5607(local21.getMessage() + " (Recovered) " + this.method1613(), local21);
			Static137.method2648(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1640() {
		@Pc(28) int local28;
		if (Static246.anInt4542 == 7 && Static582.anInt9301 == 0) {
			if (Static208.anInt4195 > 1) {
				Static247.anInt4548 = Static251.anInt4580;
				Static208.anInt4195--;
			}
			if (!Static255.aBoolean352) {
				Static380.method5622();
			}
			for (local28 = 0; local28 < 100 && Static241.method4006(); local28++) {
			}
		}
		Static14.anInt217++;
		Static576.method7636(-1, -1, null);
		Static553.method7388(null, -1, -1);
		Static350.method6839();
		Static251.anInt4580++;
		for (local28 = 0; local28 < Static568.anInt9131; local28++) {
			@Pc(70) Class9_Sub1_Sub1_Sub2_Sub1 local70 = Static341.aClass3_Sub39Array1[local28].aClass9_Sub1_Sub1_Sub2_Sub1_2;
			if (local70 != null) {
				@Pc(76) byte local76 = local70.aClass294_1.aByte112;
				if ((local76 & 0x1) != 0) {
					@Pc(86) int local86 = local70.method5569();
					@Pc(113) int local113;
					if ((local76 & 0x2) != 0 && local70.anInt6468 == 0 && Math.random() * 1000.0D < 10.0D) {
						local113 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(121) int local121 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local113 != 0 || local121 != 0) {
							@Pc(132) int local132 = local113 + local70.anIntArray518[0];
							if (local132 < 0) {
								local132 = 0;
							} else if (local132 > Static400.anInt6818 - local86 - 1) {
								local132 = Static400.anInt6818 - local86 - 1;
							}
							@Pc(160) int local160 = local121 + local70.anIntArray517[0];
							if (local160 < 0) {
								local160 = 0;
							} else if (Static271.anInt5050 - local86 - 1 < local160) {
								local160 = Static271.anInt5050 - local86 - 1;
							}
							@Pc(210) int local210 = Static258.method4312(Static583.anIntArray691, local86, -1, true, 0, local86, local160, 0, Static221.aClass95Array2[local70.aByte126], local70.anIntArray517[0], local86, local70.anIntArray518[0], local132, Static10.anIntArray18);
							if (local210 > 0) {
								if (local210 > 9) {
									local210 = 9;
								}
								for (@Pc(221) int local221 = 0; local221 < local210; local221++) {
									local70.anIntArray518[local221] = Static10.anIntArray18[local210 - local221 - 1];
									local70.anIntArray517[local221] = Static583.anIntArray691[local210 - local221 - 1];
									local70.aByteArray84[local221] = 1;
								}
								local70.anInt6468 = local210;
							}
						}
					}
					Static316.method7579(true, local70);
					local113 = Static550.method6448(local70);
					Static32.method566(local70, Static203.anInt4110, local113, Static582.anInt9300);
					Static217.method3785(Static582.anInt9300, local70);
					Static408.method5902(local70);
				}
			}
		}
		if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
			if (Static446.anInt7363 == 2) {
				Static532.method7028();
			} else {
				Static546.method7319();
			}
			if (Static421.anInt7061 >> 9 < 14 || Static400.anInt6818 - 14 <= Static421.anInt7061 >> 9 || Static233.anInt4431 >> 9 < 14 || Static233.anInt4431 >> 9 >= Static271.anInt5050 - 14) {
				Static510.method6826();
			}
		}
		while (true) {
			@Pc(341) Class3_Sub45 local341;
			@Pc(346) Class203 local346;
			@Pc(354) Class203 local354;
			do {
				local341 = (Class3_Sub45) Static122.aClass130_9.method3545();
				if (local341 == null) {
					while (true) {
						do {
							local341 = (Class3_Sub45) Static509.aClass130_50.method3545();
							if (local341 == null) {
								while (true) {
									do {
										local341 = (Class3_Sub45) Static146.aClass130_12.method3545();
										if (local341 == null) {
											if (Static265.aClass203_82 != null) {
												Static372.method5514();
											}
											if (Static305.anInt5560 % 1500 == 0) {
												Static477.method6552();
											}
											if (Static246.anInt4542 == 7 && Static582.anInt9301 == 0) {
												Static491.method6670();
											}
											Static579.method7687();
											if (Static590.aBoolean729 && Static587.method7753() - 60000L > Static410.aLong195) {
												Static537.method3881();
											}
											for (@Pc(518) Class9_Sub8_Sub1 local518 = (Class9_Sub8_Sub1) Static124.aClass309_8.method6590(); local518 != null; local518 = (Class9_Sub8_Sub1) Static124.aClass309_8.method6594()) {
												if ((long) local518.anInt4531 < Static587.method7753() / 1000L - 5L) {
													if (local518.aShort57 > 0) {
														Static483.method6585("", "", "", 5, 0, local518.aString60 + Static48.aClass33_21.method797(Static131.anInt2839));
													}
													if (local518.aShort57 == 0) {
														Static483.method6585("", "", "", 5, 0, local518.aString60 + Static48.aClass33_22.method797(Static131.anInt2839));
													}
													local518.method7465();
												}
											}
											if (Static246.anInt4542 == 7 && Static582.anInt9301 == 0) {
												if (Static78.aClass152_2 == null) {
													Static429.method6073(false);
													return;
												}
												Static218.anInt4297++;
												if (Static218.anInt4297 > 50) {
													@Pc(624) Class3_Sub34 local624 = Static374.method5522(Static192.aClass298_74, Static220.aClass287_2);
													Static131.method2572(local624);
												}
												try {
													Static556.method7408();
													return;
												} catch (@Pc(633) IOException local633) {
													Static429.method6073(false);
													return;
												}
											}
											return;
										}
										local346 = local341.aClass203_136;
										if (local346.anInt5504 < 0) {
											break;
										}
										local354 = Static414.method5954(local346.anInt5518);
									} while (local354 == null || local354.aClass203Array2 == null || local354.aClass203Array2.length <= local346.anInt5504 || local346 != local354.aClass203Array2[local346.anInt5504]);
									Static149.method2778(local341);
								}
							}
							local346 = local341.aClass203_136;
							if (local346.anInt5504 < 0) {
								break;
							}
							local354 = Static414.method5954(local346.anInt5518);
						} while (local354 == null || local354.aClass203Array2 == null || local346.anInt5504 >= local354.aClass203Array2.length || local346 != local354.aClass203Array2[local346.anInt5504]);
						Static149.method2778(local341);
					}
				}
				local346 = local341.aClass203_136;
				if (local346.anInt5504 < 0) {
					break;
				}
				local354 = Static414.method5954(local346.anInt5518);
			} while (local354 == null || local354.aClass203Array2 == null || local346.anInt5504 >= local354.aClass203Array2.length || local354.aClass203Array2[local346.anInt5504] != local346);
			Static149.method2778(local341);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1644(@OriginalArg(1) int arg0) {
		Static153.aClass331_1.anInt8369 = arg0;
		Static549.aClass192_10 = null;
		Static107.aClass277_2 = null;
		Static477.anInt7762 = 0;
		Static153.aClass331_1.anInt8370++;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1631()) {
			return;
		}
		Static56.aClass65_1 = new Class65();
		Static56.aClass65_1.anInt2279 = Integer.parseInt(this.getParameter("worldid"));
		Static460.aClass65_3 = new Class65();
		Static460.aClass65_3.anInt2279 = Integer.parseInt(this.getParameter("lobbyid"));
		Static460.aClass65_3.aString31 = this.getParameter("lobbyaddress");
		Static338.aClass65_2 = new Class65();
		Static338.aClass65_2.anInt2279 = Integer.parseInt(this.getParameter("demoid"));
		Static338.aClass65_2.aString31 = this.getParameter("demoaddress");
		Static559.aClass173_9 = Static345.method5247(Integer.parseInt(this.getParameter("modewhere")));
		if (Static52.aClass173_6 == Static559.aClass173_9) {
			Static559.aClass173_9 = Static184.aClass173_3;
		} else if (!Static165.method2918(Static559.aClass173_9) && Static559.aClass173_9 != Static555.aClass173_8) {
			Static559.aClass173_9 = Static555.aClass173_8;
		}
		Static181.aClass215_3 = Static11.method127(Integer.parseInt(this.getParameter("modewhat")));
		if (Static181.aClass215_3 != Static180.aClass215_2 && Static181.aClass215_3 != Static233.aClass215_4 && Static75.aClass215_1 != Static181.aClass215_3) {
			Static181.aClass215_3 = Static75.aClass215_1;
		}
		try {
			Static131.anInt2839 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static131.anInt2839 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static464.aBoolean600 = true;
		} else {
			Static464.aBoolean600 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static437.aBoolean572 = true;
		} else {
			Static437.aBoolean572 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static32.aBoolean55 = true;
		} else {
			Static32.aBoolean55 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static227.aClass211_1 = Static250.aClass211_2;
			} else if (local152.equals("1")) {
				Static227.aClass211_1 = Static560.aClass211_4;
			}
		}
		try {
			Static350.anInt8128 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static350.anInt8128 = 0;
		}
		Static132.aString38 = this.getParameter("quiturl");
		Static502.aString109 = this.getParameter("settings");
		if (Static502.aString109 == null) {
			Static502.aString109 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static352.anInt4606 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static352.anInt4606 = 0;
			}
		}
		Static250.anInt4577 = Integer.parseInt(this.getParameter("colourid"));
		if (Static250.anInt4577 < 0 || Static250.anInt4577 >= Static359.aColorArray3.length) {
			Static250.anInt4577 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static69.aBoolean162 = true;
			Static35.aBoolean75 = true;
		}
		@Pc(234) String local234 = this.getParameter("frombilling");
		if (local234 != null && local234.equals("true")) {
			Static53.aBoolean91 = true;
		}
		Static148.aString42 = this.getParameter("sskey");
		if (Static148.aString42 != null && Static148.aString42.length() < 2) {
			Static148.aString42 = null;
		}
		@Pc(258) String local258 = this.getParameter("force64mb");
		if (local258 != null && local258.equals("true")) {
			Static367.aBoolean520 = true;
		}
		@Pc(270) String local270 = this.getParameter("worldflags");
		if (local270 != null) {
			try {
				Static541.anInt8510 = Integer.parseInt(local270);
			} catch (@Pc(277) Exception local277) {
			}
		}
		@Pc(282) String local282 = this.getParameter("userFlow");
		if (local282 != null) {
			try {
				Static513.aLong237 = Long.parseLong(local282);
			} catch (@Pc(289) NumberFormatException local289) {
			}
		}
		Static428.aString28 = this.getParameter("additionalInfo");
		if (Static428.aString28 != null && Static428.aString28.length() > 50) {
			Static428.aString28 = null;
		}
		Static478.aClient1 = this;
		if (Static227.aClass211_1 == Static250.aClass211_2) {
			Static1.anInt7 = 765;
			Static283.anInt2480 = 503;
		} else if (Static560.aClass211_4 == Static227.aClass211_1) {
			Static283.anInt2480 = 480;
			Static1.anInt7 = 640;
		}
		this.method1629(Static227.aClass211_1.aString77, Static1.anInt7, Static283.anInt2480, Static181.aClass215_3.method5134() + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1618() {
		if (Static367.aBoolean520) {
			Static597.anInt9433 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static418.method6002();
		Static546.aClass125_3 = new Class125(Static409.aClass221_6);
		Static153.aClass331_1 = new Class331();
		Static376.method5531(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static555.aClass173_8 != Static559.aClass173_9) {
			Static366.aByteArrayArray16 = new byte[50][];
		}
		Static278.aClass3_Sub13_Sub1_1 = new Class3_Sub13_Sub1(Static409.aClass221_6);
		if (Static555.aClass173_8 == Static559.aClass173_9) {
			Static56.aClass65_1.aString31 = this.getCodeBase().getHost();
		} else if (Static165.method2918(Static559.aClass173_9)) {
			Static56.aClass65_1.aString31 = this.getCodeBase().getHost();
			Static56.aClass65_1.anInt2274 = Static56.aClass65_1.anInt2279 + 40000;
			Static460.aClass65_3.anInt2274 = Static460.aClass65_3.anInt2279 + 40000;
			Static56.aClass65_1.anInt2278 = Static56.aClass65_1.anInt2279 + 50000;
			Static338.aClass65_2.anInt2274 = Static338.aClass65_2.anInt2279 + 40000;
			Static460.aClass65_3.anInt2278 = Static460.aClass65_3.anInt2279 + 50000;
			Static338.aClass65_2.anInt2278 = Static338.aClass65_2.anInt2279 + 50000;
		} else if (Static52.aClass173_6 == Static559.aClass173_9) {
			Static56.aClass65_1.aString31 = "127.0.0.1";
			Static460.aClass65_3.aString31 = "127.0.0.1";
			Static338.aClass65_2.aString31 = "127.0.0.1";
			Static56.aClass65_1.anInt2274 = Static56.aClass65_1.anInt2279 + 40000;
			Static460.aClass65_3.anInt2274 = Static460.aClass65_3.anInt2279 + 40000;
			Static56.aClass65_1.anInt2278 = Static56.aClass65_1.anInt2279 + 50000;
			Static338.aClass65_2.anInt2274 = Static338.aClass65_2.anInt2279 + 40000;
			Static460.aClass65_3.anInt2278 = Static460.aClass65_3.anInt2279 + 50000;
			Static338.aClass65_2.anInt2278 = Static338.aClass65_2.anInt2279 + 50000;
		}
		Static438.aShortArray102 = Static238.aShortArray103 = Static184.aShortArray88 = Static107.aShortArray219 = new short[256];
		Static583.aClass65_5 = Static56.aClass65_1;
		if (Static250.aClass211_2 == Static227.aClass211_1) {
			Static302.aBoolean635 = false;
		}
		if (Static227.aClass211_1 == Static560.aClass211_4) {
			Static295.aShortArrayArray50 = Static323.aShortArrayArray85;
			Static206.anInt4178 = 16777215;
			Static429.aShortArrayArrayArray3 = Static231.aShortArrayArrayArray2;
			Static522.aBoolean641 = true;
			Static36.anInt850 = 0;
		} else {
			Static429.aShortArrayArrayArray3 = Static77.aShortArrayArrayArray1;
			Static295.aShortArrayArray50 = Static338.aShortArrayArray59;
		}
		try {
			Static414.aClipboard1 = Static478.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(212) Exception local212) {
		}
		Static478.aClass127_1 = Static478.method6562(Static347.aCanvas9);
		Static563.aClass156_1 = Static151.method2793(Static347.aCanvas9);
		try {
			if (Static409.aClass221_6.aClass235_4 != null) {
				Static565.aClass204_5 = new Class204(Static409.aClass221_6.aClass235_4, 5200, 0);
				for (@Pc(238) int local238 = 0; local238 < 35; local238++) {
					Static51.aClass204Array1[local238] = new Class204(Static409.aClass221_6.aClass235Array1[local238], 6000, 0);
				}
				Static412.aClass204_4 = new Class204(Static409.aClass221_6.aClass235_2, 6000, 0);
				Static355.aClass97_1 = new Class97(255, Static565.aClass204_5, Static412.aClass204_4, 500000);
				Static174.aClass204_3 = new Class204(Static409.aClass221_6.aClass235_3, 24, 0);
				Static409.aClass221_6.aClass235Array1 = null;
				Static409.aClass221_6.aClass235_2 = null;
				Static409.aClass221_6.aClass235_4 = null;
				Static409.aClass221_6.aClass235_3 = null;
			}
		} catch (@Pc(296) IOException local296) {
			Static355.aClass97_1 = null;
			Static174.aClass204_3 = null;
			Static565.aClass204_5 = null;
			Static412.aClass204_4 = null;
		}
		if (Static559.aClass173_9 != Static555.aClass173_8) {
			Static537.aBoolean334 = true;
		}
		if (Static250.aClass211_2 == Static227.aClass211_1) {
			Static250.aString61 = Static48.aClass33_1.method797(Static131.anInt2839);
		} else if (Static227.aClass211_1 == Static560.aClass211_4) {
			Static250.aString61 = Static48.aClass33_2.method797(Static131.anInt2839);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1648() {
		if (Static246.anInt4542 == 14) {
			return;
		}
		Static305.anInt5560++;
		if (Static305.anInt5560 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static403.anInt6866 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static203.aRandom1.setSeed((long) Static403.anInt6866);
		}
		if (Static305.anInt5560 % 50 == 0) {
			Static347.anInt6095 = Static379.anInt6523;
			Static379.anInt6523 = 0;
			Static257.anInt4912 = Static432.anInt7151;
			Static432.anInt7151 = 0;
		}
		this.method1654();
		if (Static259.aClass296_6 != null) {
			Static259.aClass296_6.method6476();
		}
		Static150.method2785();
		Static478.aClass127_1.method3275();
		Static563.aClass156_1.method5692();
		if (Static4.aClass43_1 != null) {
			Static4.aClass43_1.method7215((int) Static587.method7753());
		}
		Static68.method3621();
		Static235.anInt4454 = 0;
		Static187.anInt3653 = 0;
		for (@Pc(97) Interface16 local97 = Static478.aClass127_1.method3271(); local97 != null; local97 = Static478.aClass127_1.method3271()) {
			@Pc(103) int local103 = local97.method5164();
			if (local103 == 2 || local103 == 3) {
				@Pc(115) char local115 = local97.method5162();
				if (Static210.method3720() && (local115 == '`' || local115 == '§' || local115 == '²')) {
					if (Static47.method787()) {
						Static176.method3041();
					} else {
						Static84.method1826();
					}
				} else if (Static187.anInt3653 < 128) {
					Static400.anInterface16Array2[Static187.anInt3653] = local97;
					Static187.anInt3653++;
				}
			} else if (local103 == 0 && Static235.anInt4454 < 75) {
				Static122.anInterface16Array1[Static235.anInt4454] = local97;
				Static235.anInt4454++;
			}
		}
		Static400.anInt6813 = 0;
		for (@Pc(179) Class3_Sub24 local179 = Static563.aClass156_1.method5691(); local179 != null; local179 = Static563.aClass156_1.method5691()) {
			@Pc(185) int local185 = local179.method7746();
			if (local185 == -1) {
				Static473.aClass130_46.method3548(local179);
			} else if (local185 == 6) {
				Static400.anInt6813 += local179.method7750();
			} else if (Static468.method6473(local185)) {
				Static205.aClass130_20.method3548(local179);
				if (Static205.aClass130_20.method3544() > 10) {
					Static205.aClass130_20.method3545();
				}
			}
		}
		if (Static47.method787()) {
			Static239.method3993();
		}
		if (Static276.method4414(Static246.anInt4542)) {
			Static85.method1846();
			Static488.method6648();
		} else if (Static25.method460(Static246.anInt4542)) {
			Static345.method5248();
		}
		if (Static382.method5640(Static246.anInt4542) && !Static25.method460(Static246.anInt4542)) {
			this.method1640();
			Static121.method2507();
			Static406.method5891();
		} else if (Static419.method7098(Static246.anInt4542) && !Static25.method460(Static246.anInt4542)) {
			this.method1640();
			Static406.method5891();
		} else if (Static246.anInt4542 == 12) {
			Static406.method5891();
		} else if (Static59.method4458(Static246.anInt4542) && !Static25.method460(Static246.anInt4542)) {
			Static36.method634();
		} else if (Static246.anInt4542 == 13) {
			Static406.method5891();
			if (Static254.anInt4588 != -3 && Static254.anInt4588 != 2 && Static254.anInt4588 != 15) {
				Static429.method6073(false);
			}
		}
		Static121.method2510(Static4.aClass43_1);
		Static205.aClass130_20.method3545();
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1653() {
		if (Static246.anInt4542 == 14) {
			return;
		}
		@Pc(18) long local18 = Static384.method5650() / 1000000L - Static171.aLong97;
		Static171.aLong97 = Static384.method5650() / 1000000L;
		@Pc(26) boolean local26 = Static486.method6619();
		if (local26 && Static127.aBoolean238 && Static483.aClass288_2 != null) {
			Static483.aClass288_2.method6806();
		}
		if (Static12.method132(Static246.anInt4542)) {
			if (Static385.aLong188 != 0L && Static385.aLong188 < Static587.method7753()) {
				Static29.method547(Static278.aClass3_Sub13_Sub1_1.anInt5155, Static294.method4660(), Static278.aClass3_Sub13_Sub1_1.anInt5158, false);
			} else if (!Static4.aClass43_1.method7147() && Static582.aBoolean724) {
				Static437.method6180();
			}
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static311.aFrame2 == null) {
			@Pc(82) Container local82;
			if (Static92.aFrame1 != null) {
				local82 = Static92.aFrame1;
			} else if (Static533.anApplet4 == null) {
				local82 = Static498.anApplet_Sub1_1;
			} else {
				local82 = Static533.anApplet4;
			}
			local94 = local82.getSize().width;
			local98 = local82.getSize().height;
			if (Static92.aFrame1 == local82) {
				@Pc(104) Insets local104 = Static92.aFrame1.getInsets();
				local98 -= local104.bottom + local104.top;
				local94 -= local104.left + local104.right;
			}
			if (Static56.anInt1315 != local94 || Static224.anInt4385 != local98 || Static14.aBoolean20) {
				if (Static4.aClass43_1 == null || Static4.aClass43_1.method7173()) {
					Static418.method6002();
				} else {
					Static224.anInt4385 = local98;
					Static56.anInt1315 = local94;
				}
				Static385.aLong188 = Static587.method7753() + 500L;
				Static14.aBoolean20 = false;
			}
		}
		if (Static311.aFrame2 != null && !Static538.aBoolean658 && Static12.method132(Static246.anInt4542)) {
			Static29.method547(-1, Static278.aClass3_Sub13_Sub1_1.anInt5151, -1, false);
		}
		@Pc(175) boolean local175 = false;
		if (Static63.aBoolean141) {
			Static63.aBoolean141 = false;
			local175 = true;
		}
		if (local175) {
			Static572.method6782();
		}
		if (Static4.aClass43_1 != null && Static4.aClass43_1.method7147() || Static294.method4660() != 1) {
			Static121.method2508();
		}
		if (Static276.method4414(Static246.anInt4542)) {
			Static561.method5338(local175);
		} else if (Static515.method3036(Static246.anInt4542)) {
			Static315.method4945();
		} else if (Static597.method7822(Static246.anInt4542)) {
			Static315.method4945();
		} else if (Static25.method460(Static246.anInt4542)) {
			if (Static506.anInt8040 == 1) {
				if (Static141.anInt3012 < Static43.anInt5562) {
					Static141.anInt3012 = Static43.anInt5562;
				}
				local94 = (Static141.anInt3012 - Static43.anInt5562) * 50 / Static141.anInt3012;
				Static392.method5757(Static4.aClass43_1, Static48.aClass33_14.method797(Static131.anInt2839) + "<br>(" + local94 + "%)", true, Static49.aClass117_1, Static103.aClass58_6);
			} else if (Static506.anInt8040 == 2) {
				if (Static49.anInt1056 > Static157.anInt3171) {
					Static157.anInt3171 = Static49.anInt1056;
				}
				local94 = (Static157.anInt3171 - Static49.anInt1056) * 50 / Static157.anInt3171 + 50;
				Static392.method5757(Static4.aClass43_1, Static48.aClass33_14.method797(Static131.anInt2839) + "<br>(" + local94 + "%)", true, Static49.aClass117_1, Static103.aClass58_6);
			} else {
				Static392.method5757(Static4.aClass43_1, Static48.aClass33_14.method797(Static131.anInt2839), true, Static49.aClass117_1, Static103.aClass58_6);
			}
		} else if (Static246.anInt4542 == 10) {
			Static333.method5135(local18);
		} else if (Static246.anInt4542 == 13) {
			Static392.method5757(Static4.aClass43_1, Static48.aClass33_16.method797(Static131.anInt2839) + "<br>" + Static48.aClass33_17.method797(Static131.anInt2839), false, Static49.aClass117_1, Static103.aClass58_6);
		}
		if (Static309.anInt2464 == 3) {
			for (local94 = 0; local94 < Static591.anInt9382; local94++) {
				@Pc(374) Rectangle local374 = Class55_Sub2_Sub1.aRectangleArray1[local94];
				if (Static332.aBooleanArray24[local94]) {
					Static4.aClass43_1.method7185(local374.y, local374.height, local374.width, local374.x, -1996553985);
				} else if (Static97.aBooleanArray4[local94]) {
					Static4.aClass43_1.method7185(local374.y, local374.height, local374.width, local374.x, -1996554240);
				}
			}
		}
		if (Static47.method787()) {
			Static34.method590(Static4.aClass43_1);
		}
		if (Static409.aClass221_6.aBoolean483 && Static12.method132(Static246.anInt4542) && Static309.anInt2464 == 0 && Static294.method4660() == 1 && !local175) {
			local94 = 0;
			for (local98 = 0; local98 < Static591.anInt9382; local98++) {
				if (Static97.aBooleanArray4[local98]) {
					Static97.aBooleanArray4[local98] = false;
					Static454.aRectangleArray2[local94++] = Class55_Sub2_Sub1.aRectangleArray1[local98];
				}
			}
			try {
				Static4.aClass43_1.method7207(Static454.aRectangleArray2, local94);
			} catch (@Pc(518) Exception_Sub1 local518) {
			}
		} else if (!Static276.method4414(Static246.anInt4542)) {
			for (local94 = 0; local94 < Static591.anInt9382; local94++) {
				Static97.aBooleanArray4[local94] = false;
			}
			try {
				Static4.aClass43_1.method7197();
			} catch (@Pc(462) Exception_Sub1 local462) {
				Static379.method5607(local462.getMessage() + " (Recovered) " + this.method1613(), local462);
				Static137.method2648(0);
			}
		}
		if (Static278.aClass3_Sub13_Sub1_1.anInt5162 == 0) {
			Static374.method5521(15L);
		} else if (Static278.aClass3_Sub13_Sub1_1.anInt5162 == 1) {
			Static374.method5521(10L);
		} else if (Static278.aClass3_Sub13_Sub1_1.anInt5162 == 2) {
			Static374.method5521(5L);
		} else if (Static278.aClass3_Sub13_Sub1_1.anInt5162 == 3) {
			Static374.method5521(2L);
		}
		if (Static248.aBoolean725) {
			Static17.method295();
		}
		if (Static278.aClass3_Sub13_Sub1_1.aBoolean407 && Static246.anInt4542 == 3 && Static307.anInt5578 != -1) {
			Static278.aClass3_Sub13_Sub1_1.aBoolean407 = false;
			Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1654() {
		@Pc(11) boolean local11 = Static153.aClass331_1.method6999();
		if (!local11) {
			this.method1633();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	public synchronized void method1626() {
		if (Static533.anApplet4 != null && Static347.aCanvas9 == null && !Static409.aClass221_6.aBoolean483) {
			try {
				@Pc(21) Class local21 = Static533.anApplet4.getClass();
				@Pc(25) Field local25 = local21.getDeclaredField("canvas");
				Static347.aCanvas9 = (Canvas) local25.get(Static533.anApplet4);
				local25.set(Static533.anApplet4, null);
				if (Static347.aCanvas9 != null) {
					return;
				}
			} catch (@Pc(38) Exception local38) {
			}
		}
		super.method1626();
	}
}
