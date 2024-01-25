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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[Lclient!f;")
	public static Class78[] lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static83.method1535("Argument count");
			}
			Static387.aClass342_4 = new Class342();
			Static387.aClass342_4.anInt9881 = Integer.parseInt(arg0[0]);
			Static133.aClass342_3 = new Class342();
			Static133.aClass342_3.anInt9881 = Integer.parseInt(arg0[1]);
			Static105.aClass342_2 = new Class342();
			Static105.aClass342_2.anInt9881 = Integer.parseInt(arg0[2]);
			Static296.aClass145_5 = Static204.aClass145_10;
			if (arg0[3].equals("live")) {
				Static83.aClass299_1 = Static560.aClass299_6;
			} else if (arg0[3].equals("rc")) {
				Static83.aClass299_1 = Static273.aClass299_4;
			} else if (arg0[3].equals("wip")) {
				Static83.aClass299_1 = Static458.aClass299_5;
			} else {
				Static83.method1535("modewhat");
			}
			Static154.anInt3181 = Static421.method6589(arg0[4]);
			if (Static154.anInt3181 == -1) {
				if (arg0[4].equals("english")) {
					Static154.anInt3181 = 0;
				} else if (arg0[4].equals("german")) {
					Static154.anInt3181 = 1;
				} else {
					Static83.method1535("language");
				}
			}
			Static429.aBoolean558 = false;
			Static429.aBoolean557 = false;
			if (arg0[5].equals("game0")) {
				Static438.aClass92_4 = Static248.aClass92_2;
			} else if (arg0[5].equals("game1")) {
				Static438.aClass92_4 = Static264.aClass92_3;
			} else {
				Static83.method1535("game");
			}
			Static79.aLong41 = 0L;
			Static47.anInt649 = 0;
			Static404.aBoolean530 = true;
			Static310.aBoolean452 = true;
			Static566.anInt9919 = 0;
			Static80.anInt9684 = 0;
			Static179.anInt3619 = Static438.aClass92_4.anInt2751;
			Static450.aString79 = "";
			Static34.aBoolean28 = false;
			Static314.aString60 = null;
			Static590.aString106 = null;
			Static166.aBoolean283 = false;
			@Pc(167) client local167 = new client();
			Static430.aClient1 = local167;
			local167.method1151(Static438.aClass92_4.aString18, Static83.aClass299_1.method7080() + 32);
			Static475.aFrame3.setLocation(40, 40);
		} catch (@Pc(190) Exception local190) {
			Static205.method3450(null, local190);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1166() {
		if (Static203.anInt3855 == 14) {
			return;
		}
		@Pc(19) long local19 = Static207.method3459() / 1000000L - Static199.aLong105;
		Static199.aLong105 = Static207.method3459() / 1000000L;
		@Pc(27) boolean local27 = Static72.method6566();
		if (local27 && Static393.aBoolean519 && Static43.aClass80_1 != null) {
			Static43.aClass80_1.method5598();
		}
		if (Static213.method4319(Static203.anInt3855)) {
			if (Static264.aLong140 != 0L && Static574.method8210() > Static264.aLong140) {
				Static98.method2170(Static214.aClass4_Sub19_Sub1_1.anInt3050, Static4.method130(), false, Static214.aClass4_Sub19_Sub1_1.anInt3054);
			} else if (!Static440.aClass44_12.method5041() && Static498.aBoolean633) {
				Static253.method4073();
			}
		}
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (Static13.aFrame1 == null) {
			@Pc(79) Container local79;
			if (Static475.aFrame3 != null) {
				local79 = Static475.aFrame3;
			} else if (Static110.anApplet1 == null) {
				local79 = Static162.anApplet_Sub1_1;
			} else {
				local79 = Static110.anApplet1;
			}
			local93 = local79.getSize().width;
			local97 = local79.getSize().height;
			if (local79 == Static475.aFrame3) {
				@Pc(103) Insets local103 = Static475.aFrame3.getInsets();
				local93 -= local103.right + local103.left;
				local97 -= local103.top + local103.bottom;
			}
			if (local93 != Static286.anInt5862 || local97 != Static238.anInt4332 || Static493.aBoolean628) {
				if (Static440.aClass44_12 == null || Static440.aClass44_12.method5028()) {
					Static531.method7706();
				} else {
					Static286.anInt5862 = local93;
					Static238.anInt4332 = local97;
				}
				Static264.aLong140 = Static574.method8210() + 500L;
				Static493.aBoolean628 = false;
			}
		}
		if (Static13.aFrame1 != null && !Static450.aBoolean600 && Static213.method4319(Static203.anInt3855)) {
			Static98.method2170(-1, Static214.aClass4_Sub19_Sub1_1.anInt3060, false, -1);
		}
		@Pc(168) boolean local168 = false;
		if (Static530.aBoolean664) {
			Static530.aBoolean664 = false;
			local168 = true;
		}
		if (local168) {
			Static479.method7194();
		}
		if (Static440.aClass44_12 != null && Static440.aClass44_12.method5041() || Static4.method130() != 1) {
			Static523.method7617();
		}
		if (Static98.method2168(Static203.anInt3855)) {
			Static85.method1562(local168);
		} else if (Static567.method8138(Static203.anInt3855)) {
			Static99.method2177();
		} else if (Static575.method8211(Static203.anInt3855)) {
			Static99.method2177();
		} else if (Static473.method7114(Static203.anInt3855)) {
			if (Static318.anInt6250 == 1) {
				if (Static271.anInt5576 < Static177.anInt9181) {
					Static271.anInt5576 = Static177.anInt9181;
				}
				local93 = (Static271.anInt5576 - Static177.anInt9181) * 50 / Static271.anInt5576;
				Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, true, Static238.aClass114_9, Static590.aClass364_16.method8334(Static154.anInt3181) + "<br>(" + local93 + "%)");
			} else if (Static318.anInt6250 == 2) {
				if (Static149.anInt3137 > Static186.anInt3679) {
					Static186.anInt3679 = Static149.anInt3137;
				}
				local93 = (Static186.anInt3679 - Static149.anInt3137) * 50 / Static186.anInt3679 + 50;
				Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, true, Static238.aClass114_9, Static590.aClass364_16.method8334(Static154.anInt3181) + "<br>(" + local93 + "%)");
			} else {
				Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, true, Static238.aClass114_9, Static590.aClass364_16.method8334(Static154.anInt3181));
			}
		} else if (Static203.anInt3855 == 10) {
			Static8.method155(local19);
		} else if (Static203.anInt3855 == 13) {
			Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, false, Static238.aClass114_9, Static590.aClass364_18.method8334(Static154.anInt3181) + "<br>" + Static590.aClass364_19.method8334(Static154.anInt3181));
		}
		if (Static534.anInt9511 == 3) {
			for (local93 = 0; local93 < Static68.anInt1112; local93++) {
				@Pc(369) Rectangle local369 = Class1_Sub4_Sub2_Sub3.aRectangleArray2[local93];
				if (Static222.aBooleanArray9[local93]) {
					Static440.aClass44_12.method5006(local369.x, local369.width, local369.y, -1996553985, local369.height);
				} else if (Static250.aBooleanArray13[local93]) {
					Static440.aClass44_12.method5006(local369.x, local369.width, local369.y, -1996554240, local369.height);
				}
			}
		}
		if (Static282.method4054()) {
			Static313.method4152(Static440.aClass44_12);
		}
		if (Static406.aClass354_5.aBoolean710 && Static213.method4319(Static203.anInt3855) && Static534.anInt9511 == 0 && Static4.method130() == 1 && !local168) {
			local93 = 0;
			for (local97 = 0; local97 < Static68.anInt1112; local97++) {
				if (Static250.aBooleanArray13[local97]) {
					Static250.aBooleanArray13[local97] = false;
					Static346.aRectangleArray1[local93++] = Class1_Sub4_Sub2_Sub3.aRectangleArray2[local97];
				}
			}
			try {
				Static440.aClass44_12.method4986(Static346.aRectangleArray1, local93);
			} catch (@Pc(500) Exception_Sub1 local500) {
			}
		} else if (!Static98.method2168(Static203.anInt3855)) {
			for (local93 = 0; local93 < Static68.anInt1112; local93++) {
				Static250.aBooleanArray13[local93] = false;
			}
			try {
				Static440.aClass44_12.method5013();
			} catch (@Pc(448) Exception_Sub1 local448) {
				Static205.method3450(local448.getMessage() + " (Recovered) " + this.method1165(), local448);
				Static547.method7956(0);
			}
		}
		if (Static214.aClass4_Sub19_Sub1_1.anInt3069 == 0) {
			Static63.method1019(15L);
		} else if (Static214.aClass4_Sub19_Sub1_1.anInt3069 == 1) {
			Static63.method1019(10L);
		} else if (Static214.aClass4_Sub19_Sub1_1.anInt3069 == 2) {
			Static63.method1019(5L);
		} else if (Static214.aClass4_Sub19_Sub1_1.anInt3069 == 3) {
			Static63.method1019(2L);
		}
		if (Static463.aBoolean508) {
			Static181.method3237();
		}
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean263 && Static203.anInt3855 == 3 && Static332.anInt6370 != -1) {
			Static214.aClass4_Sub19_Sub1_1.aBoolean263 = false;
			Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1152() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1162() {
		if (Static495.anInt9000 != 2) {
			this.method1177();
			return;
		}
		try {
			this.method1177();
		} catch (@Pc(20) ThreadDeath local20) {
			throw local20;
		} catch (@Pc(23) Throwable local23) {
			Static205.method3450(local23.getMessage() + " (Recovered) " + this.method1165(), local23);
			Static547.method7956(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1169() {
		if (Static413.anInt8209 < Static528.aClass329_3.anInt9523) {
			Static60.aClass342_1.method8062();
			Static261.anInt5004 = (Static528.aClass329_3.anInt9523 - 1) * 5 * 50;
			if (Static261.anInt5004 > 3000) {
				Static261.anInt5004 = 3000;
			}
			if (Static528.aClass329_3.anInt9523 >= 2 && Static528.aClass329_3.anInt9522 == 6) {
				this.method1149("js5connect_outofdate");
				Static203.anInt3855 = 14;
				return;
			}
			if (Static528.aClass329_3.anInt9523 >= 4 && Static528.aClass329_3.anInt9522 == -1) {
				this.method1149("js5crc");
				Static203.anInt3855 = 14;
				return;
			}
			if (Static528.aClass329_3.anInt9523 >= 4 && Static98.method2168(Static203.anInt3855)) {
				if (Static528.aClass329_3.anInt9522 == 7 || Static528.aClass329_3.anInt9522 == 9) {
					this.method1149("js5connect_full");
				} else if (Static528.aClass329_3.anInt9522 <= 0) {
					this.method1149("js5io");
				} else if (Static114.aString94 == null) {
					this.method1149("js5connect");
				} else {
					this.method1149("js5proxy_" + Static114.aString94.trim());
				}
				Static203.anInt3855 = 14;
				return;
			}
		}
		Static413.anInt8209 = Static528.aClass329_3.anInt9523;
		if (Static261.anInt5004 > 0) {
			Static261.anInt5004--;
			return;
		}
		try {
			if (Static239.anInt8665 == 0) {
				Static191.aClass234_4 = Static60.aClass342_1.method8058(Static406.aClass354_5);
				Static239.anInt8665++;
			}
			if (Static239.anInt8665 == 1) {
				if (Static191.aClass234_4.anInt6717 == 2) {
					if (Static191.aClass234_4.anObject16 != null) {
						Static114.aString94 = (String) Static191.aClass234_4.anObject16;
					}
					this.method1183(1000);
					return;
				}
				if (Static191.aClass234_4.anInt6717 == 1) {
					Static239.anInt8665++;
				}
			}
			if (Static239.anInt8665 == 2) {
				Static61.aClass272_1 = new Class272((Socket) Static191.aClass234_4.anObject16, Static406.aClass354_5);
				@Pc(192) Class4_Sub11 local192 = new Class4_Sub11(5);
				local192.method4957(Static367.aClass140_2.anInt3740);
				local192.method4909(623);
				Static61.aClass272_1.method6615(local192.aByteArray68, 5);
				Static239.anInt8665++;
				Static67.aLong37 = Static574.method8210();
			}
			if (Static239.anInt8665 == 3) {
				if (Static98.method2168(Static203.anInt3855) || Static61.aClass272_1.method6621() > 0) {
					@Pc(246) int local246 = Static61.aClass272_1.method6616();
					if (local246 != 0) {
						this.method1183(local246);
						return;
					}
					Static239.anInt8665++;
				} else if (Static574.method8210() - Static67.aLong37 > 30000L) {
					this.method1183(1001);
					return;
				}
			}
			if (Static239.anInt8665 == 4) {
				@Pc(278) boolean local278 = Static98.method2168(Static203.anInt3855) || Static5.method133(Static203.anInt3855) || Static272.method4728(Static203.anInt3855);
				@Pc(281) Class212[] local281 = Static312.method5274();
				@Pc(289) Class4_Sub11 local289 = new Class4_Sub11(local281.length * 4);
				Static61.aClass272_1.method6620(0, local289.aByteArray68, local289.aByteArray68.length);
				for (@Pc(300) int local300 = 0; local300 < local281.length; local300++) {
					local281[local300].method5272(local289.method4931());
				}
				Static528.aClass329_3.method7766(!local278, Static61.aClass272_1);
				Static191.aClass234_4 = null;
				Static239.anInt8665 = 0;
				Static61.aClass272_1 = null;
			}
		} catch (@Pc(336) IOException local336) {
			this.method1183(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1170() {
		@Pc(21) int local21;
		if (Static203.anInt3855 == 7 && Static587.anInt10158 == 0) {
			if (Static454.anInt8310 > 1) {
				Static284.anInt5784 = Static436.anInt8161;
				Static454.anInt8310--;
			}
			if (!Static49.aBoolean36) {
				Static10.method173();
			}
			for (local21 = 0; local21 < 100 && Static95.method2110(); local21++) {
			}
		}
		Static356.anInt6930++;
		Static272.method4722(null, -1, -1);
		Static182.method3246(null, -1, -1);
		Static444.method6845();
		Static436.anInt8161++;
		for (local21 = 0; local21 < Static436.anInt8163; local21++) {
			@Pc(65) Class1_Sub4_Sub2_Sub1_Sub1 local65 = Static457.aClass4_Sub4Array1[local21].aClass1_Sub4_Sub2_Sub1_Sub1_1;
			if (local65 != null) {
				@Pc(71) byte local71 = local65.aClass283_1.aByte94;
				if ((local71 & 0x1) != 0) {
					@Pc(82) int local82 = local65.method6925();
					@Pc(103) int local103;
					if ((local71 & 0x2) != 0 && local65.anInt8447 == 0 && Math.random() * 1000.0D < 10.0D) {
						local103 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(111) int local111 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local103 != 0 || local111 != 0) {
							@Pc(129) int local129 = local65.anIntArray463[0] + local103;
							if (local129 < 0) {
								local129 = 0;
							} else if (local129 > Static428.anInt8046 - local82 - 1) {
								local129 = Static428.anInt8046 - local82 - 1;
							}
							@Pc(163) int local163 = local65.anIntArray462[0] + local111;
							if (local163 < 0) {
								local163 = 0;
							} else if (local163 > Static119.anInt2717 - local82 - 1) {
								local163 = Static119.anInt2717 - local82 - 1;
							}
							@Pc(217) int local217 = Static397.method6278(true, local129, local163, local82, Static86.aClass111Array1[local65.aByte126], Static450.anIntArray464, local65.anIntArray462[0], local82, Static572.anIntArray534, local65.anIntArray463[0], 0, -1, 0, local82);
							if (local217 > 0) {
								if (local217 > 9) {
									local217 = 9;
								}
								for (@Pc(231) int local231 = 0; local231 < local217; local231++) {
									local65.anIntArray463[local231] = Static450.anIntArray464[local217 - local231 - 1];
									local65.anIntArray462[local231] = Static572.anIntArray534[local217 - local231 - 1];
									local65.aByteArray94[local231] = 1;
								}
								local65.anInt8447 = local217;
							}
						}
					}
					Static410.method6486(true, local65);
					local103 = Static125.method2596(local65);
					Static149.method2821(local65);
					Static50.method664(local65, Static105.anInt2402, local103, Static398.anInt7614);
					Static74.method1214(Static105.anInt2402, local65);
					Static219.method3588(local65);
				}
			}
		}
		if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
			if (Static166.anInt3419 == 2) {
				Static276.method4773();
			} else {
				Static548.method7957();
			}
			if (Static24.anInt387 >> 9 < 14 || Static24.anInt387 >> 9 >= Static428.anInt8046 - 14 || Static110.anInt2624 >> 9 < 14 || Static110.anInt2624 >> 9 >= Static119.anInt2717 - 14) {
				Static311.method5270();
			}
		}
		while (true) {
			@Pc(356) Class4_Sub25 local356;
			@Pc(361) Class225 local361;
			@Pc(372) Class225 local372;
			do {
				local356 = (Class4_Sub25) Static61.aClass244_6.method5968();
				if (local356 == null) {
					while (true) {
						do {
							local356 = (Class4_Sub25) Static60.aClass244_5.method5968();
							if (local356 == null) {
								while (true) {
									do {
										local356 = (Class4_Sub25) Static525.aClass244_59.method5968();
										if (local356 == null) {
											if (Static317.aClass225_54 != null) {
												Static458.method6988();
											}
											if (Static106.anInt2418 % 1500 == 0) {
												Static29.method368();
											}
											if (Static203.anInt3855 == 7 && Static587.anInt10158 == 0) {
												Static552.method8003();
											}
											Static80.method7923();
											if (Static478.aBoolean619 && Static574.method8210() - 60000L > Static543.aLong252) {
												Static355.method5748();
											}
											for (@Pc(530) Class1_Sub1_Sub2 local530 = (Class1_Sub1_Sub2) Static543.aClass136_8.method3288(); local530 != null; local530 = (Class1_Sub1_Sub2) Static543.aClass136_8.method3286()) {
												if ((long) local530.anInt6758 < Static574.method8210() / 1000L - 5L) {
													if (local530.aShort79 > 0) {
														Static574.method8209("", local530.aString70 + Static590.aClass364_23.method8334(Static154.anInt3181), "", "", 5, 0);
													}
													if (local530.aShort79 == 0) {
														Static574.method8209("", local530.aString70 + Static590.aClass364_24.method8334(Static154.anInt3181), "", "", 5, 0);
													}
													local530.method8252();
												}
											}
											if (Static203.anInt3855 == 7 && Static587.anInt10158 == 0) {
												if (Static299.aClass241_3 == null) {
													Static135.method2684(false);
													return;
												}
												Static12.anInt226++;
												if (Static12.anInt226 > 50) {
													@Pc(633) Class4_Sub14 local633 = Static196.method3380(Static17.aClass159_1, Static122.aClass173_40);
													Static353.method5712(local633);
												}
												try {
													Static367.method5899();
												} catch (@Pc(640) IOException local640) {
													Static135.method2684(false);
												}
											}
											return;
										}
										local361 = local356.aClass225_21;
										if (local361.anInt6565 < 0) {
											break;
										}
										local372 = Static490.method7272(local361.anInt6559);
									} while (local372 == null || local372.aClass225Array1 == null || local372.aClass225Array1.length <= local361.anInt6565 || local361 != local372.aClass225Array1[local361.anInt6565]);
									Static388.method6121(local356);
								}
							}
							local361 = local356.aClass225_21;
							if (local361.anInt6565 < 0) {
								break;
							}
							local372 = Static490.method7272(local361.anInt6559);
						} while (local372 == null || local372.aClass225Array1 == null || local372.aClass225Array1.length <= local361.anInt6565 || local372.aClass225Array1[local361.anInt6565] != local361);
						Static388.method6121(local356);
					}
				}
				local361 = local356.aClass225_21;
				if (local361.anInt6565 < 0) {
					break;
				}
				local372 = Static490.method7272(local361.anInt6559);
			} while (local372 == null || local372.aClass225Array1 == null || local372.aClass225Array1.length <= local361.anInt6565 || local361 != local372.aClass225Array1[local361.anInt6565]);
			Static388.method6121(local356);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1174() {
		@Pc(15) boolean local15 = Static528.aClass329_3.method7773();
		if (!local15) {
			this.method1169();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1177() {
		if (Static203.anInt3855 == 14) {
			return;
		}
		Static106.anInt2418++;
		if (Static106.anInt2418 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static421.anInt7924 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static536.aRandom1.setSeed((long) Static421.anInt7924);
		}
		if (Static106.anInt2418 % 50 == 0) {
			Static582.anInt10108 = Static63.anInt994;
			Static63.anInt994 = 0;
			Static553.anInt9815 = Static48.anInt687;
			Static48.anInt687 = 0;
		}
		this.method1174();
		if (Static413.aClass195_5 != null) {
			Static413.aClass195_5.method4823();
		}
		Static450.method6958();
		Static584.aClass154_1.method3568();
		Static172.aClass135_1.method6369();
		if (Static440.aClass44_12 != null) {
			Static440.aClass44_12.method4973((int) Static574.method8210());
		}
		Static377.method6038();
		Static566.anInt9917 = 0;
		Static114.anInt9774 = 0;
		for (@Pc(97) Interface2 local97 = Static584.aClass154_1.method3565(); local97 != null; local97 = Static584.aClass154_1.method3565()) {
			@Pc(103) int local103 = local97.method5849();
			if (local103 == 2 || local103 == 3) {
				@Pc(115) char local115 = local97.method5851();
				if (Static381.method6458() && (local115 == '`' || local115 == '§' || local115 == '²')) {
					if (Static282.method4054()) {
						Static22.method270();
					} else {
						Static218.method3581();
					}
				} else if (Static114.anInt9774 < 128) {
					Static84.anInterface2Array2[Static114.anInt9774] = local97;
					Static114.anInt9774++;
				}
			} else if (local103 == 0 && Static566.anInt9917 < 75) {
				Static7.anInterface2Array1[Static566.anInt9917] = local97;
				Static566.anInt9917++;
			}
		}
		Static581.anInt10088 = 0;
		for (@Pc(187) Class4_Sub15 local187 = Static172.aClass135_1.method6374(); local187 != null; local187 = Static172.aClass135_1.method6374()) {
			@Pc(193) int local193 = local187.method3496();
			if (local193 == -1) {
				Static316.aClass244_50.method5960(local187);
			} else if (local193 == 6) {
				Static581.anInt10088 += local187.method3492();
			} else if (Static323.method5341(local193)) {
				Static222.aClass244_35.method5960(local187);
				if (Static222.aClass244_35.method5973() > 10) {
					Static222.aClass244_35.method5968();
				}
			}
		}
		if (Static282.method4054()) {
			Static195.method3371();
		}
		if (Static98.method2168(Static203.anInt3855)) {
			Static145.method2797();
			Static554.method8016();
		} else if (Static473.method7114(Static203.anInt3855)) {
			Static567.method8140();
		}
		if (Static5.method133(Static203.anInt3855) && !Static473.method7114(Static203.anInt3855)) {
			this.method1170();
			Static393.method6220();
			Static572.method8106();
		} else if (Static272.method4728(Static203.anInt3855) && !Static473.method7114(Static203.anInt3855)) {
			this.method1170();
			Static572.method8106();
		} else if (Static203.anInt3855 == 12) {
			Static572.method8106();
		} else if (Static270.method4668(Static203.anInt3855) && !Static473.method7114(Static203.anInt3855)) {
			Static525.method7621();
		} else if (Static203.anInt3855 == 13) {
			Static572.method8106();
			if (Static95.anInt2223 != -3 && Static95.anInt2223 != 2 && Static95.anInt2223 != 15) {
				Static135.method2684(false);
			}
		}
		Static544.method7887(Static440.aClass44_12);
		Static222.aClass244_35.method5968();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1160() {
		if (Static478.aBoolean619) {
			Static355.method5748();
		}
		Static592.method8361();
		if (Static440.aClass44_12 != null) {
			Static440.aClass44_12.method5033();
		}
		if (Static13.aFrame1 != null) {
			Static200.method3419(Static13.aFrame1, Static406.aClass354_5);
			Static13.aFrame1 = null;
		}
		if (Static299.aClass241_3 != null) {
			Static299.aClass241_3.method7087();
			Static299.aClass241_3 = null;
		}
		Static24.method316();
		Static528.aClass329_3.method7765();
		Static307.aClass269_3.method6531();
		if (Static282.aClass317_2 != null) {
			Static282.aClass317_2.method7511();
			Static282.aClass317_2 = null;
		}
		try {
			Static311.aClass134_2.method3248();
			for (@Pc(55) int local55 = 0; local55 < 35; local55++) {
				Static226.aClass134Array1[local55].method3248();
			}
			Static8.aClass134_1.method3248();
			Static340.aClass134_3.method3248();
			Static376.method6004();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
	@Override
	public String method1165() {
		@Pc(12) String local12 = null;
		try {
			local12 = "[1)" + Static552.anInt9805 + "," + Static254.anInt4667 + "," + Static428.anInt8046 + "," + Static119.anInt2717 + "|";
			if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 != null) {
				local12 = local12 + "2)" + Static13.anInt231 + "," + (Static552.anInt9805 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0]) + "," + (Static254.anInt4667 + Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0]) + "|";
			}
			local12 = local12 + "3)" + Static495.anInt9000 + "|4)" + Static214.aClass4_Sub19_Sub1_1.anInt3061 + "|5)" + Static4.method130() + "|6)" + Static554.anInt9828 + "," + Static375.anInt7256 + "|";
			local12 = local12 + "7)" + Static214.aClass4_Sub19_Sub1_1.method2771(Static495.anInt9000) + "|";
			local12 = local12 + "8)" + Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000) + "|";
			local12 = local12 + "9)" + Static214.aClass4_Sub19_Sub1_1.aBoolean261 + "|";
			local12 = local12 + "10)" + Static214.aClass4_Sub19_Sub1_1.aBoolean256 + "|";
			local12 = local12 + "11)" + Static214.aClass4_Sub19_Sub1_1.aBoolean257 + "|";
			local12 = local12 + "12)" + Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000) + "|";
			local12 = local12 + "13)" + Static577.anInt10067 + "|";
			local12 = local12 + "14)" + Static203.anInt3855;
			try {
				local12 = local12 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static495.anInt9000 == 2) {
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
									@Pc(312) Field local312 = local279.getClass().getDeclaredField("handle");
									local248.invoke(local312, Boolean.TRUE);
									local12 = local12 + "|16)" + Long.toHexString(local312.getLong(local279));
									local248.invoke(local312, Boolean.FALSE);
								}
							} catch (@Pc(348) Throwable local348) {
							}
							local248.invoke(local284, Boolean.FALSE);
						} catch (@Pc(360) Throwable local360) {
						}
					}
				}
			} catch (@Pc(368) Throwable local368) {
			}
			local12 = local12 + "]";
		} catch (@Pc(379) Throwable local379) {
		}
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1150() {
		if (Static495.anInt9000 != 2) {
			this.method1166();
			return;
		}
		try {
			this.method1166();
		} catch (@Pc(13) ThreadDeath local13) {
			throw local13;
		} catch (@Pc(16) Throwable local16) {
			Static205.method3450(local16.getMessage() + " (Recovered) " + this.method1165(), local16);
			Static547.method7956(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1154() {
		if (Static34.aBoolean28) {
			Static577.anInt10067 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static531.method7706();
		Static307.aClass269_3 = new Class269(Static406.aClass354_5);
		Static528.aClass329_3 = new Class329();
		Static1.method66(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static565.aClass145_11 != Static296.aClass145_5) {
			Static582.aByteArrayArray25 = new byte[50][];
		}
		Static214.aClass4_Sub19_Sub1_1 = new Class4_Sub19_Sub1(Static406.aClass354_5);
		if (Static565.aClass145_11 == Static296.aClass145_5) {
			Static387.aClass342_4.aString96 = this.getCodeBase().getHost();
		} else if (Static367.method5891(Static296.aClass145_5)) {
			Static387.aClass342_4.aString96 = this.getCodeBase().getHost();
			Static387.aClass342_4.anInt9874 = Static387.aClass342_4.anInt9881 + 40000;
			Static133.aClass342_3.anInt9874 = Static133.aClass342_3.anInt9881 + 40000;
			Static105.aClass342_2.anInt9874 = Static105.aClass342_2.anInt9881 + 40000;
			Static387.aClass342_4.anInt9876 = Static387.aClass342_4.anInt9881 + 50000;
			Static133.aClass342_3.anInt9876 = Static133.aClass342_3.anInt9881 + 50000;
			Static105.aClass342_2.anInt9876 = Static105.aClass342_2.anInt9881 + 50000;
		} else if (Static204.aClass145_10 == Static296.aClass145_5) {
			Static387.aClass342_4.aString96 = "127.0.0.1";
			Static133.aClass342_3.aString96 = "127.0.0.1";
			Static105.aClass342_2.aString96 = "127.0.0.1";
			Static387.aClass342_4.anInt9874 = Static387.aClass342_4.anInt9881 + 40000;
			Static133.aClass342_3.anInt9874 = Static133.aClass342_3.anInt9881 + 40000;
			Static387.aClass342_4.anInt9876 = Static387.aClass342_4.anInt9881 + 50000;
			Static105.aClass342_2.anInt9874 = Static105.aClass342_2.anInt9881 + 40000;
			Static133.aClass342_3.anInt9876 = Static133.aClass342_3.anInt9881 + 50000;
			Static105.aClass342_2.anInt9876 = Static105.aClass342_2.anInt9881 + 50000;
		}
		Static60.aClass342_1 = Static387.aClass342_4;
		if (Static248.aClass92_2 == Static438.aClass92_4) {
			Static324.aBoolean457 = false;
		}
		if (Static264.aClass92_3 == Static438.aClass92_4) {
			Static445.aShortArrayArray8 = Static402.aShortArrayArray3;
			Static400.anInt7647 = 16777215;
			Static89.aBoolean156 = true;
			Static174.aShortArrayArrayArray1 = Static407.aShortArrayArrayArray2;
			Static583.anInt10139 = 0;
		} else {
			Static445.aShortArrayArray8 = Static457.aShortArrayArray9;
			Static174.aShortArrayArrayArray1 = Static539.aShortArrayArrayArray3;
		}
		Static567.aShortArray132 = Static198.aShortArray45 = Static525.aShortArray128 = Static394.aShortArray98 = new short[256];
		try {
			Static580.aClipboard2 = Static430.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(217) Exception local217) {
		}
		Static584.aClass154_1 = Static263.method4440(Static475.aCanvas12);
		Static172.aClass135_1 = Static56.method931(Static475.aCanvas12);
		try {
			if (Static406.aClass354_5.aClass337_3 != null) {
				Static311.aClass134_2 = new Class134(Static406.aClass354_5.aClass337_3, 5200, 0);
				for (@Pc(239) int local239 = 0; local239 < 35; local239++) {
					Static226.aClass134Array1[local239] = new Class134(Static406.aClass354_5.aClass337Array1[local239], 6000, 0);
				}
				Static8.aClass134_1 = new Class134(Static406.aClass354_5.aClass337_2, 6000, 0);
				Static320.aClass345_4 = new Class345(255, Static311.aClass134_2, Static8.aClass134_1, 500000);
				Static340.aClass134_3 = new Class134(Static406.aClass354_5.aClass337_4, 24, 0);
				Static406.aClass354_5.aClass337Array1 = null;
				Static406.aClass354_5.aClass337_3 = null;
				Static406.aClass354_5.aClass337_4 = null;
				Static406.aClass354_5.aClass337_2 = null;
			}
		} catch (@Pc(295) IOException local295) {
			Static311.aClass134_2 = null;
			Static320.aClass345_4 = null;
			Static8.aClass134_1 = null;
			Static340.aClass134_3 = null;
		}
		if (Static565.aClass145_11 != Static296.aClass145_5) {
			Static397.aBoolean521 = true;
		}
		if (Static248.aClass92_2 == Static438.aClass92_4) {
			Static334.aString62 = Static590.aClass364_3.method8334(Static154.anInt3181);
		} else if (Static264.aClass92_3 == Static438.aClass92_4) {
			Static334.aString62 = Static590.aClass364_4.method8334(Static154.anInt3181);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1155() {
		if (Static110.anApplet1 != null && Static475.aCanvas12 == null && !Static406.aClass354_5.aBoolean710) {
			try {
				@Pc(13) Class local13 = Static110.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static475.aCanvas12 = (Canvas) local17.get(Static110.anApplet1);
				local17.set(Static110.anApplet1, null);
				if (Static475.aCanvas12 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1155();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1157()) {
			return;
		}
		Static387.aClass342_4 = new Class342();
		Static387.aClass342_4.anInt9881 = Integer.parseInt(this.getParameter("worldid"));
		Static133.aClass342_3 = new Class342();
		Static133.aClass342_3.anInt9881 = Integer.parseInt(this.getParameter("lobbyid"));
		Static133.aClass342_3.aString96 = this.getParameter("lobbyaddress");
		Static105.aClass342_2 = new Class342();
		Static105.aClass342_2.anInt9881 = Integer.parseInt(this.getParameter("demoid"));
		Static105.aClass342_2.aString96 = this.getParameter("demoaddress");
		Static296.aClass145_5 = Static166.method3033(Integer.parseInt(this.getParameter("modewhere")));
		if (Static204.aClass145_10 == Static296.aClass145_5) {
			Static296.aClass145_5 = Static379.aClass145_7;
		} else if (!Static367.method5891(Static296.aClass145_5) && Static296.aClass145_5 != Static565.aClass145_11) {
			Static296.aClass145_5 = Static565.aClass145_11;
		}
		Static83.aClass299_1 = Static586.method8304(Integer.parseInt(this.getParameter("modewhat")));
		if (Static458.aClass299_5 != Static83.aClass299_1 && Static83.aClass299_1 != Static273.aClass299_4 && Static560.aClass299_6 != Static83.aClass299_1) {
			Static83.aClass299_1 = Static560.aClass299_6;
		}
		try {
			Static154.anInt3181 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static154.anInt3181 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static429.aBoolean558 = true;
		} else {
			Static429.aBoolean558 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static429.aBoolean557 = true;
		} else {
			Static429.aBoolean557 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static274.aBoolean424 = true;
		} else {
			Static274.aBoolean424 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static438.aClass92_4 = Static248.aClass92_2;
			} else if (local152.equals("1")) {
				Static438.aClass92_4 = Static264.aClass92_3;
			}
		}
		try {
			Static566.anInt9919 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static566.anInt9919 = 0;
		}
		Static241.aString48 = this.getParameter("quiturl");
		Static450.aString79 = this.getParameter("settings");
		if (Static450.aString79 == null) {
			Static450.aString79 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static47.anInt649 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static47.anInt649 = 0;
			}
		}
		Static179.anInt3619 = Integer.parseInt(this.getParameter("colourid"));
		if (Static179.anInt3619 < 0 || Static188.aColorArray3.length <= Static179.anInt3619) {
			Static179.anInt3619 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static404.aBoolean530 = true;
			Static310.aBoolean452 = true;
		}
		@Pc(232) String local232 = this.getParameter("frombilling");
		if (local232 != null && local232.equals("true")) {
			Static166.aBoolean283 = true;
		}
		Static590.aString106 = this.getParameter("sskey");
		if (Static590.aString106 != null && Static590.aString106.length() < 2) {
			Static590.aString106 = null;
		}
		@Pc(258) String local258 = this.getParameter("force64mb");
		if (local258 != null && local258.equals("true")) {
			Static34.aBoolean28 = true;
		}
		@Pc(270) String local270 = this.getParameter("worldflags");
		if (local270 != null) {
			try {
				Static80.anInt9684 = Integer.parseInt(local270);
			} catch (@Pc(277) Exception local277) {
			}
		}
		@Pc(282) String local282 = this.getParameter("userFlow");
		if (local282 != null) {
			try {
				Static79.aLong41 = Long.parseLong(local282);
			} catch (@Pc(289) NumberFormatException local289) {
			}
		}
		Static314.aString60 = this.getParameter("additionalInfo");
		if (Static314.aString60 != null && Static314.aString60.length() > 50) {
			Static314.aString60 = null;
		}
		if (Static438.aClass92_4 == Static248.aClass92_2) {
			Static212.anInt3952 = 503;
			Static501.anInt6750 = 765;
		} else if (Static264.aClass92_3 == Static438.aClass92_4) {
			Static501.anInt6750 = 640;
			Static212.anInt3952 = 480;
		}
		Static430.aClient1 = this;
		this.method1147(Static438.aClass92_4.aString18, Static212.anInt3952, Static83.aClass299_1.method7080() + 32, Static501.anInt6750);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1183(@OriginalArg(0) int arg0) {
		Static528.aClass329_3.anInt9523++;
		Static239.anInt8665 = 0;
		Static191.aClass234_4 = null;
		Static528.aClass329_3.anInt9522 = arg0;
		Static61.aClass272_1 = null;
	}
}
