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
				Static341.method5291("Argument count");
			}
			Static226.aClass105_4 = new Class105();
			Static226.aClass105_4.anInt3307 = Integer.parseInt(arg0[0]);
			Static188.aClass105_3 = new Class105();
			Static188.aClass105_3.anInt3307 = Integer.parseInt(arg0[1]);
			Static40.aClass105_1 = new Class105();
			Static40.aClass105_1.anInt3307 = Integer.parseInt(arg0[2]);
			Static542.aClass194_5 = Static5.aClass194_1;
			if (arg0[3].equals("live")) {
				Static428.aClass199_4 = Static66.aClass199_1;
			} else if (arg0[3].equals("rc")) {
				Static428.aClass199_4 = Static82.aClass199_2;
			} else if (arg0[3].equals("wip")) {
				Static428.aClass199_4 = Static260.aClass199_3;
			} else {
				Static341.method5291("modewhat");
			}
			Static25.anInt769 = Static13.method6297(arg0[4]);
			if (Static25.anInt769 == -1) {
				if (arg0[4].equals("english")) {
					Static25.anInt769 = 0;
				} else if (arg0[4].equals("german")) {
					Static25.anInt769 = 1;
				} else {
					Static341.method5291("language");
				}
			}
			Static252.aBoolean206 = false;
			Static301.aBoolean391 = false;
			if (arg0[5].equals("game0")) {
				Static317.aClass37_3 = Static336.aClass37_4;
			} else if (arg0[5].equals("game1")) {
				Static317.aClass37_3 = Static255.aClass37_2;
			} else {
				Static341.method5291("game");
			}
			Static384.anInt6750 = 0;
			Static358.aLong177 = 0L;
			Static73.aBoolean111 = false;
			Static110.aString17 = "";
			Static243.anInt4888 = 0;
			Static413.aBoolean503 = false;
			Static587.aBoolean733 = true;
			Static318.aBoolean406 = true;
			Static488.anInt5164 = 0;
			Static178.anInt3725 = Static317.aClass37_3.anInt1063;
			Static70.aString27 = null;
			@Pc(161) client local161 = new client();
			Static111.aClient1 = local161;
			local161.method1348(Static317.aClass37_3.aString9, Static428.aClass199_4.method4745() + 32);
			Static547.aFrame2.setLocation(40, 40);
		} catch (@Pc(184) Exception local184) {
			Static256.method4328(null, local184);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1337() {
		if (Static560.anInt9242 != 2) {
			this.method1359();
			return;
		}
		try {
			this.method1359();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static256.method4328(local24.getMessage() + " (Recovered) " + this.method1347(), local24);
			Static293.method4707(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1347() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static39.anInt4952 + "," + Static138.anInt3088 + "," + Static473.anInt8075 + "," + Static165.anInt6749 + "|";
			if (Static328.aClass4_Sub1_Sub1_Sub2_2 != null) {
				local7 = local7 + "2)" + Static97.anInt1863 + "," + (Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] + Static39.anInt4952) + "," + (Static138.anInt3088 + Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0]) + "|";
			}
			local7 = local7 + "3)" + Static560.anInt9242 + "|4)" + Static140.aClass6_Sub48_Sub1_1.anInt9013 + "|5)" + Static74.method1450() + "|6)" + Static240.anInt4852 + "," + Static196.anInt4059 + "|";
			local7 = local7 + "7)" + Static140.aClass6_Sub48_Sub1_1.method7369(Static560.anInt9242) + "|";
			local7 = local7 + "8)" + Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242) + "|";
			local7 = local7 + "9)" + Static140.aClass6_Sub48_Sub1_1.aBoolean679 + "|";
			local7 = local7 + "10)" + Static140.aClass6_Sub48_Sub1_1.aBoolean676 + "|";
			local7 = local7 + "11)" + Static140.aClass6_Sub48_Sub1_1.aBoolean682 + "|";
			local7 = local7 + "12)" + Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242) + "|";
			local7 = local7 + "13)" + Static11.anInt321 + "|";
			local7 = local7 + "14)" + Static557.anInt9206;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(220) Throwable local220) {
			}
			try {
				if (Static560.anInt9242 == 2) {
					@Pc(226) Class local226 = Class.forName("java.lang.ClassLoader");
					@Pc(230) Field local230 = local226.getDeclaredField("nativeLibraries");
					@Pc(233) Class local233 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(243) Method local243 = local233.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local243.invoke(local230, Boolean.TRUE);
					@Pc(266) Vector local266 = (Vector) local230.get(client.class.getClassLoader());
					for (@Pc(268) int local268 = 0; local268 < local266.size(); local268++) {
						try {
							@Pc(274) Object local274 = local266.elementAt(local268);
							@Pc(279) Field local279 = local274.getClass().getDeclaredField("name");
							local243.invoke(local279, Boolean.TRUE);
							try {
								@Pc(294) String local294 = (String) local279.get(local274);
								if (local294 != null && local294.indexOf("sw3d.dll") != -1) {
									@Pc(306) Field local306 = local274.getClass().getDeclaredField("handle");
									local243.invoke(local306, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local306.getLong(local274));
									local243.invoke(local306, Boolean.FALSE);
								}
							} catch (@Pc(342) Throwable local342) {
							}
							local243.invoke(local279, Boolean.FALSE);
						} catch (@Pc(354) Throwable local354) {
						}
					}
				}
			} catch (@Pc(362) Throwable local362) {
			}
			local7 = local7 + "]";
		} catch (@Pc(378) Throwable local378) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1358() {
		@Pc(23) int local23;
		if (Static557.anInt9206 == 7 && Static384.anInt6751 == 0) {
			if (Static97.anInt1865 > 1) {
				Static330.anInt6004 = Static592.anInt9587;
				Static97.anInt1865--;
			}
			if (!Static587.aBoolean734) {
				Static305.method1155();
			}
			for (local23 = 0; local23 < 100 && Static333.method5191(); local23++) {
			}
		}
		Static54.anInt1208++;
		Static560.method7563(null, -1, -1);
		Static202.method3654(null, -1, -1);
		Static112.method1994();
		Static592.anInt9587++;
		for (local23 = 0; local23 < Static535.anInt8885; local23++) {
			@Pc(69) Class4_Sub1_Sub1_Sub1 local69 = Static76.aClass6_Sub34Array7[local23].aClass4_Sub1_Sub1_Sub1_2;
			if (local69 != null) {
				@Pc(75) byte local75 = local69.aClass273_1.aByte71;
				if ((local75 & 0x1) != 0) {
					@Pc(83) int local83 = local69.method5892();
					@Pc(104) int local104;
					if ((local75 & 0x2) != 0 && local69.anInt7132 == 0 && Math.random() * 1000.0D < 10.0D) {
						local104 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(112) int local112 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local104 != 0 || local112 != 0) {
							@Pc(123) int local123 = local104 + local69.anIntArray521[0];
							if (local123 < 0) {
								local123 = 0;
							} else if (Static473.anInt8075 - local83 - 1 < local123) {
								local123 = Static473.anInt8075 - local83 - 1;
							}
							@Pc(154) int local154 = local69.anIntArray522[0] + local112;
							if (local154 < 0) {
								local154 = 0;
							} else if (local154 > Static165.anInt6749 - local83 - 1) {
								local154 = Static165.anInt6749 - local83 - 1;
							}
							@Pc(204) int local204 = Static333.method5196(true, local69.anIntArray522[0], Static579.aClass189Array4[local69.aByte108], -1, 0, local83, local69.anIntArray521[0], local154, local123, local83, Static524.anIntArray647, 0, local83, Static295.anIntArray408);
							if (local204 > 0) {
								if (local204 > 9) {
									local204 = 9;
								}
								for (@Pc(218) int local218 = 0; local218 < local204; local218++) {
									local69.anIntArray521[local218] = Static524.anIntArray647[local204 - local218 - 1];
									local69.anIntArray522[local218] = Static295.anIntArray408[local204 - local218 - 1];
									local69.aByteArray90[local218] = 1;
								}
								local69.anInt7132 = local204;
							}
						}
					}
					Static146.method2822(local69, true);
					local104 = Static284.method4644(local69);
					Static578.method7717(local104, Static72.anInt1522, Static135.anInt3010, local69);
					Static592.method7817(local69, Static135.anInt3010);
					Static27.method853(local69);
				}
			}
		}
		if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
			if (Static346.anInt6215 == 2) {
				Static12.method252();
			} else {
				Static542.method7334();
			}
			if (Static371.anInt6572 >> 9 < 14 || Static473.anInt8075 - 14 <= Static371.anInt6572 >> 9 || Static322.anInt5904 >> 9 < 14 || Static322.anInt5904 >> 9 >= Static165.anInt6749 - 14) {
				Static298.method4755();
			}
		}
		while (true) {
			@Pc(343) Class6_Sub43 local343;
			@Pc(348) Class292 local348;
			@Pc(359) Class292 local359;
			do {
				local343 = (Class6_Sub43) Static445.aClass361_55.method7835();
				if (local343 == null) {
					while (true) {
						do {
							local343 = (Class6_Sub43) Static141.aClass361_22.method7835();
							if (local343 == null) {
								while (true) {
									do {
										local343 = (Class6_Sub43) Static127.aClass361_21.method7835();
										if (local343 == null) {
											if (Static547.aClass292_14 != null) {
												Static409.method7705();
											}
											if (Static312.anInt5688 % 1500 == 0) {
												Static300.method4759();
											}
											if (Static557.anInt9206 == 7 && Static384.anInt6751 == 0) {
												Static253.method4294();
											}
											Static386.method5698();
											if (Static185.aBoolean264 && Static8.method201() - 60000L > Static559.aLong254) {
												Static512.method7099();
											}
											for (@Pc(513) Class98_Sub1_Sub2 local513 = (Class98_Sub1_Sub2) Static74.aClass40_1.method1132(); local513 != null; local513 = (Class98_Sub1_Sub2) Static74.aClass40_1.method1129()) {
												if (Static8.method201() / 1000L - 5L > (long) local513.anInt6945) {
													if (local513.aShort89 > 0) {
														Static417.method5982("", "", "", local513.aString60 + Static230.aClass156_18.method4065(Static25.anInt769), 0, 5);
													}
													if (local513.aShort89 == 0) {
														Static417.method5982("", "", "", local513.aString60 + Static230.aClass156_19.method4065(Static25.anInt769), 0, 5);
													}
													local513.method7855();
												}
											}
											if (Static557.anInt9206 == 7 && Static384.anInt6751 == 0) {
												if (Static563.aClass127_2 == null) {
													Static40.method1024(false);
													return;
												}
												Static133.anInt2978++;
												if (Static133.anInt2978 > 50) {
													@Pc(616) Class6_Sub31 local616 = Static114.method2007(Static596.aClass47_155, Static337.aClass324_1);
													Static534.method7251(local616);
												}
												try {
													Static278.method4563();
													return;
												} catch (@Pc(623) IOException local623) {
													Static40.method1024(false);
													return;
												}
											}
											return;
										}
										local348 = local343.aClass292_12;
										if (local348.anInt7964 < 0) {
											break;
										}
										local359 = Static367.method5505(local348.anInt7901);
									} while (local359 == null || local359.aClass292Array2 == null || local348.anInt7964 >= local359.aClass292Array2.length || local348 != local359.aClass292Array2[local348.anInt7964]);
									Static446.method6319(local343);
								}
							}
							local348 = local343.aClass292_12;
							if (local348.anInt7964 < 0) {
								break;
							}
							local359 = Static367.method5505(local348.anInt7901);
						} while (local359 == null || local359.aClass292Array2 == null || local348.anInt7964 >= local359.aClass292Array2.length || local348 != local359.aClass292Array2[local348.anInt7964]);
						Static446.method6319(local343);
					}
				}
				local348 = local343.aClass292_12;
				if (local348.anInt7964 < 0) {
					break;
				}
				local359 = Static367.method5505(local348.anInt7901);
			} while (local359 == null || local359.aClass292Array2 == null || local359.aClass292Array2.length <= local348.anInt7964 || local359.aClass292Array2[local348.anInt7964] != local348);
			Static446.method6319(local343);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1359() {
		if (Static557.anInt9206 == 14) {
			return;
		}
		Static312.anInt5688++;
		if (Static312.anInt5688 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static111.anInt2159 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static96.aRandom1.setSeed((long) Static111.anInt2159);
		}
		if (Static312.anInt5688 % 50 == 0) {
			Static235.anInt4760 = Static75.anInt1633;
			Static75.anInt1633 = 0;
			Static541.anInt6702 = Static564.anInt9280;
			Static564.anInt9280 = 0;
		}
		this.method1364();
		if (Static399.aClass13_1 != null) {
			Static399.aClass13_1.method329();
		}
		Static244.method4239();
		Static365.aClass155_1.method4037();
		Static164.aClass173_1.method6494();
		if (Static240.aClass14_7 != null) {
			Static240.aClass14_7.method6897((int) Static8.method201());
		}
		Static346.method5321();
		Static21.anInt685 = 0;
		Static86.anInt1717 = 0;
		for (@Pc(101) Interface8 local101 = Static365.aClass155_1.method4039(); local101 != null; local101 = Static365.aClass155_1.method4039()) {
			@Pc(107) int local107 = local101.method1039();
			if (local107 == 2 || local107 == 3) {
				@Pc(119) char local119 = local101.method1040();
				if (Static403.method5918() && (local119 == '`' || local119 == '§')) {
					if (Static161.method2957()) {
						Static288.method4674();
					} else {
						Static333.method5193();
					}
				} else if (Static21.anInt685 < 128) {
					Static551.anInterface8Array2[Static21.anInt685] = local101;
					Static21.anInt685++;
				}
			} else if (local107 == 0 && Static86.anInt1717 < 75) {
				Static119.anInterface8Array1[Static86.anInt1717] = local101;
				Static86.anInt1717++;
			}
		}
		Static330.anInt6006 = 0;
		for (@Pc(192) Class6_Sub5 local192 = Static164.aClass173_1.method6491(); local192 != null; local192 = Static164.aClass173_1.method6491()) {
			@Pc(198) int local198 = local192.method1986();
			if (local198 == -1) {
				Static19.aClass361_49.method7833(local192);
			} else if (local198 == 6) {
				Static330.anInt6006 += local192.method1992();
			} else if (Static87.method1655(local198)) {
				Static395.aClass361_52.method7833(local192);
				if (Static395.aClass361_52.method7841() > 10) {
					Static395.aClass361_52.method7835();
				}
			}
		}
		if (Static161.method2957()) {
			Static374.method5573();
		}
		if (Static309.method4877(Static557.anInt9206)) {
			Static249.method4262();
			Static500.method6767();
		} else if (Static568.method7613(Static557.anInt9206)) {
			Static348.method5327();
		}
		if (Static33.method929(Static557.anInt9206) && !Static568.method7613(Static557.anInt9206)) {
			this.method1358();
			Static176.method3228();
			Static182.method3299();
		} else if (Static379.method5623(Static557.anInt9206) && !Static568.method7613(Static557.anInt9206)) {
			this.method1358();
			Static182.method3299();
		} else if (Static557.anInt9206 == 12) {
			Static182.method3299();
		} else if (Static230.method4063(Static557.anInt9206) && !Static568.method7613(Static557.anInt9206)) {
			Static237.method4109();
		} else if (Static557.anInt9206 == 13) {
			Static182.method3299();
			if (Static349.anInt6232 != -3 && Static349.anInt6232 != 2 && Static349.anInt6232 != 15) {
				Static40.method1024(false);
			}
		}
		Static541.method5639(Static240.aClass14_7);
		Static395.aClass361_52.method7835();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1361() {
		if (Static557.anInt9206 == 14) {
			return;
		}
		@Pc(22) long local22 = Static405.method5931() / 1000000L - Static562.aLong255;
		Static562.aLong255 = Static405.method5931() / 1000000L;
		@Pc(30) boolean local30 = Static55.method1205();
		if (local30 && Static422.aBoolean507 && Static3.aClass11_1 != null) {
			Static3.aClass11_1.method6288();
		}
		if (Static189.method3423(Static557.anInt9206)) {
			if (Static333.aLong169 != 0L && Static333.aLong169 < Static8.method201()) {
				Static235.method4083(false, Static74.method1450(), Static140.aClass6_Sub48_Sub1_1.anInt9006, Static140.aClass6_Sub48_Sub1_1.anInt8998);
			} else if (!Static240.aClass14_7.method6901() && Static355.aBoolean508) {
				Static483.method6646();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static15.aFrame1 == null) {
			@Pc(76) Container local76;
			if (Static547.aFrame2 != null) {
				local76 = Static547.aFrame2;
			} else if (Static249.anApplet1 == null) {
				local76 = Static340.anApplet_Sub1_1;
			} else {
				local76 = Static249.anApplet1;
			}
			local90 = local76.getSize().width;
			local94 = local76.getSize().height;
			if (Static547.aFrame2 == local76) {
				@Pc(100) Insets local100 = Static547.aFrame2.getInsets();
				local90 -= local100.left + local100.right;
				local94 -= local100.bottom + local100.top;
			}
			if (local90 != Static1.anInt9404 || local94 != Static120.anInt2852 || Static555.aBoolean712) {
				if (Static240.aClass14_7 == null || Static240.aClass14_7.method6886()) {
					Static386.method5699();
				} else {
					Static120.anInt2852 = local94;
					Static1.anInt9404 = local90;
				}
				Static333.aLong169 = Static8.method201() + 500L;
				Static555.aBoolean712 = false;
			}
		}
		if (Static15.aFrame1 != null && !Static470.aBoolean53 && Static189.method3423(Static557.anInt9206)) {
			Static235.method4083(false, Static140.aClass6_Sub48_Sub1_1.anInt9003, -1, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Static136.aBoolean218) {
			local169 = true;
			Static136.aBoolean218 = false;
		}
		if (local169) {
			Static535.method7308();
		}
		if (Static240.aClass14_7 != null && Static240.aClass14_7.method6901() || Static74.method1450() != 1) {
			Static415.method7746();
		}
		if (Static309.method4877(Static557.anInt9206)) {
			Static185.method3399(local169);
		} else if (Static552.method7485(Static557.anInt9206)) {
			Static543.method7355();
		} else if (Static292.method4693(Static557.anInt9206)) {
			Static543.method7355();
		} else if (Static568.method7613(Static557.anInt9206)) {
			if (Static36.anInt951 == 1) {
				if (Static501.anInt8346 < Static233.anInt4738) {
					Static501.anInt8346 = Static233.anInt4738;
				}
				local90 = (Static501.anInt8346 - Static233.anInt4738) * 50 / Static501.anInt8346;
				Static30.method892(Static230.aClass156_11.method4065(Static25.anInt769) + "<br>(" + local90 + "%)", Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, true);
			} else if (Static36.anInt951 == 2) {
				if (Static47.anInt1067 > Static237.anInt4797) {
					Static237.anInt4797 = Static47.anInt1067;
				}
				local90 = (Static237.anInt4797 - Static47.anInt1067) * 50 / Static237.anInt4797 + 50;
				Static30.method892(Static230.aClass156_11.method4065(Static25.anInt769) + "<br>(" + local90 + "%)", Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, true);
			} else {
				Static30.method892(Static230.aClass156_11.method4065(Static25.anInt769), Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, true);
			}
		} else if (Static557.anInt9206 == 10) {
			Static514.method7114(local22);
		} else if (Static557.anInt9206 == 13) {
			Static30.method892(Static230.aClass156_13.method4065(Static25.anInt769) + "<br>" + Static230.aClass156_14.method4065(Static25.anInt769), Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, true);
		}
		if (Static273.anInt5224 == 3) {
			for (local90 = 0; local90 < Static414.anInt7237; local90++) {
				@Pc(367) Rectangle local367 = Class237.aRectangleArray1[local90];
				if (Static528.aBooleanArray37[local90]) {
					Static240.aClass14_7.method6859(local367.width, local367.y, local367.x, -1996553985, local367.height);
				} else if (Static143.aBooleanArray15[local90]) {
					Static240.aClass14_7.method6859(local367.width, local367.y, local367.x, -1996554240, local367.height);
				}
			}
		}
		if (Static161.method2957()) {
			Static172.method3191(Static240.aClass14_7);
		}
		if (Static352.aClass272_2.aBoolean512 && Static189.method3423(Static557.anInt9206) && Static273.anInt5224 == 0 && Static74.method1450() == 1 && !local169) {
			local90 = 0;
			for (local94 = 0; local94 < Static414.anInt7237; local94++) {
				if (Static143.aBooleanArray15[local94]) {
					Static143.aBooleanArray15[local94] = false;
					Static589.aRectangleArray2[local90++] = Class237.aRectangleArray1[local94];
				}
			}
			try {
				Static240.aClass14_7.method6865(Static589.aRectangleArray2, local90);
			} catch (@Pc(511) Exception_Sub1 local511) {
			}
		} else if (!Static309.method4877(Static557.anInt9206)) {
			for (local90 = 0; local90 < Static414.anInt7237; local90++) {
				Static143.aBooleanArray15[local90] = false;
			}
			try {
				Static240.aClass14_7.method6848();
			} catch (@Pc(455) Exception_Sub1 local455) {
				Static256.method4328(local455.getMessage() + " (Recovered) " + this.method1347(), local455);
				Static293.method4707(0);
			}
		}
		if (Static140.aClass6_Sub48_Sub1_1.anInt8988 == 0) {
			Static318.method4952(15L);
		} else if (Static140.aClass6_Sub48_Sub1_1.anInt8988 == 1) {
			Static318.method4952(10L);
		} else if (Static140.aClass6_Sub48_Sub1_1.anInt8988 == 2) {
			Static318.method4952(5L);
		} else if (Static140.aClass6_Sub48_Sub1_1.anInt8988 == 3) {
			Static318.method4952(2L);
		}
		if (Static420.aBoolean505) {
			Static376.method5588();
		}
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean686 && Static557.anInt9206 == 3 && Static468.anInt8036 != -1) {
			Static140.aClass6_Sub48_Sub1_1.aBoolean686 = false;
			Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1343() {
		if (Static185.aBoolean264) {
			Static512.method7099();
		}
		Static206.method3660();
		if (Static240.aClass14_7 != null) {
			Static240.aClass14_7.method6824();
		}
		if (Static15.aFrame1 != null) {
			Static449.method6347(Static352.aClass272_2, Static15.aFrame1);
			Static15.aFrame1 = null;
		}
		if (Static563.aClass127_2 != null) {
			Static563.aClass127_2.method6305();
			Static563.aClass127_2 = null;
		}
		Static418.method5988();
		Static489.aClass163_3.method4210();
		Static142.aClass55_4.method1436();
		if (Static304.aClass23_1 != null) {
			Static304.aClass23_1.method886();
			Static304.aClass23_1 = null;
		}
		try {
			Static524.aClass257_5.method5932();
			for (@Pc(59) int local59 = 0; local59 < 35; local59++) {
				Static63.aClass257Array1[local59].method5932();
			}
			Static421.aClass257_4.method5932();
			Static306.aClass257_3.method5932();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1346() {
		if (Static560.anInt9242 != 2) {
			this.method1361();
			return;
		}
		try {
			this.method1361();
		} catch (@Pc(11) ThreadDeath local11) {
			throw local11;
		} catch (@Pc(14) Throwable local14) {
			Static256.method4328(local14.getMessage() + " (Recovered) " + this.method1347(), local14);
			Static293.method4707(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1339() {
		if (Static73.aBoolean111) {
			Static11.anInt321 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static386.method5699();
		Static142.aClass55_4 = new Class55(Static352.aClass272_2);
		Static489.aClass163_3 = new Class163();
		Static448.method6344(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static580.aClass194_7 != Static542.aClass194_5) {
			Static371.aByteArrayArray21 = new byte[50][];
		}
		Static140.aClass6_Sub48_Sub1_1 = new Class6_Sub48_Sub1(Static352.aClass272_2);
		if (Static542.aClass194_5 == Static580.aClass194_7) {
			Static226.aClass105_4.aString26 = this.getCodeBase().getHost();
		} else if (Static118.method2499(Static542.aClass194_5)) {
			Static226.aClass105_4.aString26 = this.getCodeBase().getHost();
			Static226.aClass105_4.anInt3308 = Static226.aClass105_4.anInt3307 + 40000;
			Static188.aClass105_3.anInt3308 = Static188.aClass105_3.anInt3307 + 40000;
			Static226.aClass105_4.anInt3312 = Static226.aClass105_4.anInt3307 + 50000;
			Static40.aClass105_1.anInt3308 = Static40.aClass105_1.anInt3307 + 40000;
			Static188.aClass105_3.anInt3312 = Static188.aClass105_3.anInt3307 + 50000;
			Static40.aClass105_1.anInt3312 = Static40.aClass105_1.anInt3307 + 50000;
		} else if (Static5.aClass194_1 == Static542.aClass194_5) {
			Static226.aClass105_4.aString26 = "127.0.0.1";
			Static188.aClass105_3.aString26 = "127.0.0.1";
			Static40.aClass105_1.aString26 = "127.0.0.1";
			Static226.aClass105_4.anInt3308 = Static226.aClass105_4.anInt3307 + 40000;
			Static188.aClass105_3.anInt3308 = Static188.aClass105_3.anInt3307 + 40000;
			Static226.aClass105_4.anInt3312 = Static226.aClass105_4.anInt3307 + 50000;
			Static40.aClass105_1.anInt3308 = Static40.aClass105_1.anInt3307 + 40000;
			Static188.aClass105_3.anInt3312 = Static188.aClass105_3.anInt3307 + 50000;
			Static40.aClass105_1.anInt3312 = Static40.aClass105_1.anInt3307 + 50000;
		}
		Static316.aClass105_5 = Static226.aClass105_4;
		if (Static317.aClass37_3 == Static336.aClass37_4) {
			Static6.aBoolean275 = false;
		}
		if (Static317.aClass37_3 == Static255.aClass37_2) {
			Static155.aShortArrayArray2 = Static365.aShortArrayArray8;
			Static336.aShortArrayArrayArray2 = Static170.aShortArrayArrayArray1;
			Static452.anInt7784 = 0;
			Static159.aBoolean736 = true;
			Static33.anInt908 = 16777215;
		} else {
			Static336.aShortArrayArrayArray2 = Static556.aShortArrayArrayArray3;
			Static155.aShortArrayArray2 = Static519.aShortArrayArray10;
		}
		Static180.aShortArray24 = Static71.aShortArray11 = Static259.aShortArray55 = Static205.aShortArray37 = new short[256];
		Static365.aClass155_1 = Static164.method3124(Static32.aCanvas3);
		Static164.aClass173_1 = Static541.method5641(Static32.aCanvas3);
		try {
			if (Static352.aClass272_2.aClass31_3 != null) {
				Static524.aClass257_5 = new Class257(Static352.aClass272_2.aClass31_3, 5200, 0);
				for (@Pc(230) int local230 = 0; local230 < 35; local230++) {
					Static63.aClass257Array1[local230] = new Class257(Static352.aClass272_2.aClass31Array1[local230], 6000, 0);
				}
				Static421.aClass257_4 = new Class257(Static352.aClass272_2.aClass31_2, 6000, 0);
				Static347.aClass172_2 = new Class172(255, Static524.aClass257_5, Static421.aClass257_4, 500000);
				Static306.aClass257_3 = new Class257(Static352.aClass272_2.aClass31_4, 24, 0);
				Static352.aClass272_2.aClass31_4 = null;
				Static352.aClass272_2.aClass31_2 = null;
				Static352.aClass272_2.aClass31Array1 = null;
				Static352.aClass272_2.aClass31_3 = null;
			}
		} catch (@Pc(288) IOException local288) {
			Static347.aClass172_2 = null;
			Static306.aClass257_3 = null;
			Static524.aClass257_5 = null;
			Static421.aClass257_4 = null;
		}
		if (Static542.aClass194_5 != Static580.aClass194_7) {
			Static43.aBoolean62 = true;
		}
		if (Static317.aClass37_3 == Static336.aClass37_4) {
			Static473.aString84 = Static230.aClass156_1.method4065(Static25.anInt769);
		} else if (Static255.aClass37_2 == Static317.aClass37_3) {
			Static473.aString84 = Static230.aClass156_2.method4065(Static25.anInt769);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1336()) {
			return;
		}
		Static226.aClass105_4 = new Class105();
		Static226.aClass105_4.anInt3307 = Integer.parseInt(this.getParameter("worldid"));
		Static188.aClass105_3 = new Class105();
		Static188.aClass105_3.anInt3307 = Integer.parseInt(this.getParameter("lobbyid"));
		Static188.aClass105_3.aString26 = this.getParameter("lobbyaddress");
		Static40.aClass105_1 = new Class105();
		Static40.aClass105_1.anInt3307 = Integer.parseInt(this.getParameter("demoid"));
		Static40.aClass105_1.aString26 = this.getParameter("demoaddress");
		Static542.aClass194_5 = Static344.method5314(Integer.parseInt(this.getParameter("modewhere")));
		if (Static542.aClass194_5 == Static5.aClass194_1) {
			Static542.aClass194_5 = Static530.aClass194_4;
		} else if (!Static118.method2499(Static542.aClass194_5) && Static580.aClass194_7 != Static542.aClass194_5) {
			Static542.aClass194_5 = Static580.aClass194_7;
		}
		Static428.aClass199_4 = Static402.method5868(Integer.parseInt(this.getParameter("modewhat")));
		if (Static428.aClass199_4 != Static260.aClass199_3 && Static82.aClass199_2 != Static428.aClass199_4 && Static66.aClass199_1 != Static428.aClass199_4) {
			Static428.aClass199_4 = Static66.aClass199_1;
		}
		try {
			Static25.anInt769 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static25.anInt769 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static252.aBoolean206 = true;
		} else {
			Static252.aBoolean206 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static301.aBoolean391 = true;
		} else {
			Static301.aBoolean391 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static346.aBoolean440 = true;
		} else {
			Static346.aBoolean440 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static317.aClass37_3 = Static336.aClass37_4;
			} else if (local152.equals("1")) {
				Static317.aClass37_3 = Static255.aClass37_2;
			}
		}
		try {
			Static488.anInt5164 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static488.anInt5164 = 0;
		}
		Static464.aString81 = this.getParameter("quiturl");
		Static110.aString17 = this.getParameter("settings");
		if (Static110.aString17 == null) {
			Static110.aString17 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static384.anInt6750 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static384.anInt6750 = 0;
			}
		}
		Static178.anInt3725 = Integer.parseInt(this.getParameter("colourid"));
		if (Static178.anInt3725 < 0 || Static178.anInt3725 >= Static95.aColorArray1.length) {
			Static178.anInt3725 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static587.aBoolean733 = true;
			Static318.aBoolean406 = true;
		}
		@Pc(239) String local239 = this.getParameter("frombilling");
		if (local239 != null && local239.equals("true")) {
			Static413.aBoolean503 = true;
		}
		Static70.aString27 = this.getParameter("sskey");
		if (Static70.aString27 != null && Static70.aString27.length() < 2) {
			Static70.aString27 = null;
		}
		@Pc(263) String local263 = this.getParameter("force64mb");
		if (local263 != null && local263.equals("true")) {
			Static73.aBoolean111 = true;
		}
		@Pc(275) String local275 = this.getParameter("worldflags");
		if (local275 != null) {
			try {
				Static243.anInt4888 = Integer.parseInt(local275);
			} catch (@Pc(282) Exception local282) {
			}
		}
		@Pc(287) String local287 = this.getParameter("userFlow");
		if (local287 != null) {
			try {
				Static358.aLong177 = Long.parseLong(local287);
			} catch (@Pc(294) NumberFormatException local294) {
			}
		}
		if (Static317.aClass37_3 == Static336.aClass37_4) {
			Static592.anInt9585 = 765;
			Static579.anInt9514 = 503;
		} else if (Static317.aClass37_3 == Static255.aClass37_2) {
			Static579.anInt9514 = 480;
			Static592.anInt9585 = 640;
		}
		Static111.aClient1 = this;
		this.method1335(Static592.anInt9585, Static428.aClass199_4.method4745() + 32, Static579.anInt9514, Static317.aClass37_3.aString9);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1362(@OriginalArg(0) int arg0) {
		Static489.aClass163_3.anInt4877++;
		Static443.anInt7701 = 0;
		Static353.aClass239_2 = null;
		Static165.aClass331_7 = null;
		Static489.aClass163_3.anInt4878 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1364() {
		@Pc(7) boolean local7 = Static489.aClass163_3.method4213();
		if (!local7) {
			this.method1366();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1340() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1366() {
		if (Static489.aClass163_3.anInt4877 > Static142.anInt9522) {
			Static316.aClass105_5.method2908();
			Static334.anInt6059 = (Static489.aClass163_3.anInt4877 - 1) * 5 * 50;
			if (Static334.anInt6059 > 3000) {
				Static334.anInt6059 = 3000;
			}
			if (Static489.aClass163_3.anInt4877 >= 2 && Static489.aClass163_3.anInt4878 == 6) {
				this.method1334("js5connect_outofdate");
				Static557.anInt9206 = 14;
				return;
			}
			if (Static489.aClass163_3.anInt4877 >= 4 && Static489.aClass163_3.anInt4878 == -1) {
				this.method1334("js5crc");
				Static557.anInt9206 = 14;
				return;
			}
			if (Static489.aClass163_3.anInt4877 >= 4 && Static309.method4877(Static557.anInt9206)) {
				if (Static489.aClass163_3.anInt4878 == 7 || Static489.aClass163_3.anInt4878 == 9) {
					this.method1334("js5connect_full");
				} else if (Static489.aClass163_3.anInt4878 <= 0) {
					this.method1334("js5io");
				} else if (Static487.aString87 == null) {
					this.method1334("js5connect");
				} else {
					this.method1334("js5proxy_" + Static487.aString87.trim());
				}
				Static557.anInt9206 = 14;
				return;
			}
		}
		Static142.anInt9522 = Static489.aClass163_3.anInt4877;
		if (Static334.anInt6059 > 0) {
			Static334.anInt6059--;
			return;
		}
		try {
			if (Static443.anInt7701 == 0) {
				Static165.aClass331_7 = Static316.aClass105_5.method2907(Static352.aClass272_2);
				Static443.anInt7701++;
			}
			if (Static443.anInt7701 == 1) {
				if (Static165.aClass331_7.anInt8818 == 2) {
					if (Static165.aClass331_7.anObject18 != null) {
						Static487.aString87 = (String) Static165.aClass331_7.anObject18;
					}
					this.method1362(1000);
					return;
				}
				if (Static165.aClass331_7.anInt8818 == 1) {
					Static443.anInt7701++;
				}
			}
			if (Static443.anInt7701 == 2) {
				Static353.aClass239_2 = new Class239((Socket) Static165.aClass331_7.anObject18, Static352.aClass272_2);
				@Pc(197) Class6_Sub21 local197 = new Class6_Sub21(5);
				local197.method6062(Static530.aClass46_2.anInt1234);
				local197.method6033(616);
				Static353.aClass239_2.method5552(local197.aByteArray93, 5);
				Static443.anInt7701++;
				Static553.aLong251 = Static8.method201();
			}
			if (Static443.anInt7701 == 3) {
				if (Static309.method4877(Static557.anInt9206) || Static353.aClass239_2.method5553() > 0) {
					@Pc(245) int local245 = Static353.aClass239_2.method5557();
					if (local245 != 0) {
						this.method1362(local245);
						return;
					}
					Static443.anInt7701++;
				} else if (Static8.method201() - Static553.aLong251 > 30000L) {
					this.method1362(1001);
					return;
				}
			}
			if (Static443.anInt7701 == 4) {
				@Pc(292) boolean local292 = Static309.method4877(Static557.anInt9206) || Static33.method929(Static557.anInt9206) || Static379.method5623(Static557.anInt9206);
				@Pc(295) Class184[] local295 = Static272.method4499();
				@Pc(303) Class6_Sub21 local303 = new Class6_Sub21(local295.length * 4);
				Static353.aClass239_2.method5551(local303.aByteArray93.length, local303.aByteArray93, 0);
				for (@Pc(314) int local314 = 0; local314 < local295.length; local314++) {
					local295[local314].method4494(local303.method6036());
				}
				Static489.aClass163_3.method4220(!local292, Static353.aClass239_2);
				Static165.aClass331_7 = null;
				Static443.anInt7701 = 0;
				Static353.aClass239_2 = null;
			}
		} catch (@Pc(350) IOException local350) {
			this.method1362(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	public synchronized void method1345() {
		if (Static249.anApplet1 != null && Static32.aCanvas3 == null) {
			try {
				@Pc(10) Class local10 = Static249.anApplet1.getClass();
				@Pc(14) Field local14 = local10.getDeclaredField("canvas");
				Static32.aCanvas3 = (Canvas) local14.get(Static249.anApplet1);
				local14.set(Static249.anApplet1, null);
				if (Static32.aCanvas3 != null) {
					return;
				}
			} catch (@Pc(27) Exception local27) {
			}
		}
		super.method1345();
	}
}
