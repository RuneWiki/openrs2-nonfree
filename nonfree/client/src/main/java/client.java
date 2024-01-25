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

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static247.method4419("argument count");
			}
			Static11.anInt218 = Integer.parseInt(arg0[0]);
			Static351.anInt6735 = 2;
			if (arg0[1].equals("live")) {
				Static125.anInt2409 = 0;
			} else if (arg0[1].equals("rc")) {
				Static125.anInt2409 = 1;
			} else if (arg0[1].equals("wip")) {
				Static125.anInt2409 = 2;
			} else {
				Static247.method4419("modewhat");
			}
			Static41.anInt726 = Static306.method5354(arg0[2]);
			if (Static41.anInt726 == -1) {
				if (arg0[2].equals("english")) {
					Static41.anInt726 = 0;
				} else if (arg0[2].equals("german")) {
					Static41.anInt726 = 1;
				} else {
					Static247.method4419("language");
				}
			}
			Static259.aBoolean424 = false;
			Static319.aBoolean514 = false;
			if (arg0[3].equals("game0")) {
				Static111.anInt2077 = 0;
			} else if (arg0[3].equals("game1")) {
				Static111.anInt2077 = 1;
			} else {
				Static247.method4419("game");
			}
			Static96.aString10 = "";
			Static161.anInt3184 = 0;
			Static16.anInt331 = 0;
			Static23.anInt484 = Static111.anInt2077;
			@Pc(122) client local122 = new client();
			Static138.aClient1 = local122;
			local122.method693(Static125.anInt2409 + 32, Static111.anInt2077 == 1 ? "stellardawn" : "runescape");
			Static60.aFrame3.setLocation(40, 40);
		} catch (@Pc(149) Exception local149) {
			Static114.method1992(local149, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method687() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
	private void method704(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class5_Sub12 local18 = new Class5_Sub12(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(22) int local22 = local18.method5115();
					if (local22 == 0) {
						return;
					}
					if (local22 == 1) {
						@Pc(112) int[] local112 = Static292.anIntArray240 = new int[6];
						local112[0] = local18.method5106();
						local112[1] = local18.method5106();
						local112[2] = local18.method5106();
						local112[3] = local18.method5106();
						local112[4] = local18.method5106();
						local112[5] = local18.method5106();
					} else {
						@Pc(41) int local41;
						@Pc(36) int local36;
						if (local22 == 4) {
							local36 = local18.method5115();
							Static158.anIntArray518 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static158.anIntArray518[local41] = local18.method5106();
								if (Static158.anIntArray518[local41] == 65535) {
									Static158.anIntArray518[local41] = -1;
								}
							}
						} else if (local22 == 5) {
							local36 = local18.method5115();
							Static175.anIntArray269 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static175.anIntArray269[local41] = local18.method5106();
								if (Static175.anIntArray269[local41] == 65535) {
									Static175.anIntArray269[local41] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method691() {
		if (Static278.anInt5495 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static116.method2023() / 1000000L - Static185.aLong126;
		Static185.aLong126 = Static116.method2023() / 1000000L;
		@Pc(24) boolean local24 = Static190.method432();
		if (local24 && Static111.aBoolean156 && Static143.aClass47_1 != null) {
			Static143.aClass47_1.method5327();
		}
		if (Static278.anInt5495 == 30 || Static278.anInt5495 == 10) {
			if (Static129.aLong84 != 0L && Static340.method5863() > Static129.aLong84) {
				Static198.method3483(Static124.anInt2371, false, Static211.anInt4178, Static101.method1804());
			} else if (Static236.aClass55_9.method5166() && Static57.aBoolean492) {
				Static264.method4683();
			}
		}
		@Pc(87) int local87;
		@Pc(91) int local91;
		if (Static110.aFrame4 == null) {
			@Pc(79) Container local79;
			if (Static60.aFrame3 == null) {
				local79 = Static182.aClass139_5.anApplet1;
			} else {
				local79 = Static60.aFrame3;
			}
			local87 = local79.getSize().width;
			local91 = local79.getSize().height;
			if (Static60.aFrame3 == local79) {
				@Pc(97) Insets local97 = Static60.aFrame3.getInsets();
				local91 -= local97.bottom + local97.top;
				local87 -= local97.right + local97.left;
			}
			if (Static1.anInt9 != local87 || Static32.anInt632 != local91) {
				if (Static236.aClass55_9 == null || Static236.aClass55_9.method5158()) {
					Static76.method1405();
				} else {
					Static1.anInt9 = local87;
					Static32.anInt632 = local91;
				}
				Static129.aLong84 = Static340.method5863() + 500L;
			}
		}
		if (Static110.aFrame4 != null && !Static87.aBoolean113 && (Static278.anInt5495 == 30 || Static278.anInt5495 == 10)) {
			Static198.method3483(-1, false, -1, Static223.anInt4410);
		}
		@Pc(166) boolean local166 = false;
		if (Static78.aBoolean102) {
			local166 = true;
			Static78.aBoolean102 = false;
		}
		if (local166) {
			Static1.method2();
		}
		if (Static236.aClass55_9 != null && Static236.aClass55_9.method5218() || Static101.method1804() != 1) {
			Static300.method5274();
		}
		if (Static278.anInt5495 == 0) {
			Static357.method6058(Static145.aColorArray3[Static23.anInt484], local166, Static316.aString47, Static51.aColorArray1[Static23.anInt484], Static178.anInt3531, Static52.aColorArray2[Static23.anInt484]);
		} else if (Static278.anInt5495 == 5) {
			Static181.method3303(Static145.aColorArray3[Static23.anInt484].getRGB(), Static77.aClass18_1, Static236.aClass55_9, Static236.aClass55_9.method5218() | local166, Static51.aColorArray1[Static23.anInt484].getRGB(), Static52.aColorArray2[Static23.anInt484].getRGB());
		} else if (Static278.anInt5495 == 10) {
			Static221.method4024();
		} else if (Static278.anInt5495 == 25 || Static278.anInt5495 == 28) {
			if (Static267.anInt5275 == 1) {
				if (Static237.anInt4724 > Static325.anInt6291) {
					Static325.anInt6291 = Static237.anInt4724;
				}
				local87 = (Static325.anInt6291 - Static237.anInt4724) * 50 / Static325.anInt6291;
				Static86.method1557(true, Static204.aClass18_3, Static321.aClass85_134.method2020(Static41.anInt726) + "<br>(" + local87 + "%)");
			} else if (Static267.anInt5275 == 2) {
				if (Static277.anInt5470 < Static75.anInt1444) {
					Static277.anInt5470 = Static75.anInt1444;
				}
				local87 = (Static277.anInt5470 - Static75.anInt1444) * 50 / Static277.anInt5470 + 50;
				Static86.method1557(true, Static204.aClass18_3, Static321.aClass85_134.method2020(Static41.anInt726) + "<br>(" + local87 + "%)");
			} else {
				Static86.method1557(true, Static204.aClass18_3, Static321.aClass85_134.method2020(Static41.anInt726));
			}
		} else if (Static278.anInt5495 == 30) {
			Static130.method4918(local16);
		} else if (Static278.anInt5495 == 40) {
			Static86.method1557(true, Static204.aClass18_3, Static169.aClass85_135.method2020(Static41.anInt726) + "<br>" + Static90.aClass85_38.method2020(Static41.anInt726));
		}
		if (Static159.anInt3164 == 3) {
			for (local87 = 0; local87 < Static66.anInt5818; local87++) {
				@Pc(392) Rectangle local392 = Class4_Sub3_Sub2.aRectangleArray2[local87];
				if (Static34.aBooleanArray5[local87]) {
					Static236.aClass55_9.method5254(local392.width, -1996553985, local392.height, local392.x, local392.y);
				} else if (Static133.aBooleanArray10[local87]) {
					Static236.aClass55_9.method5254(local392.width, -1996554240, local392.height, local392.x, local392.y);
				}
			}
		}
		if (Static85.method1515()) {
			Static232.method4185(Static236.aClass55_9);
		}
		if ((Static278.anInt5495 == 30 || Static278.anInt5495 == 10) && Static159.anInt3164 == 0 && Static101.method1804() == 1 && !local166 && Static210.aString35.equals("1.1")) {
			local87 = 0;
			for (local91 = 0; local91 < Static66.anInt5818; local91++) {
				if (Static133.aBooleanArray10[local91]) {
					Static133.aBooleanArray10[local91] = false;
					Static197.aRectangleArray1[local87++] = Class4_Sub3_Sub2.aRectangleArray2[local91];
				}
			}
			Static236.aClass55_9.method5174(Static197.aRectangleArray1, local87);
		} else if (Static278.anInt5495 != 0) {
			Static236.aClass55_9.method5159();
			for (local87 = 0; local87 < Static66.anInt5818; local87++) {
				Static133.aBooleanArray10[local87] = false;
			}
		}
		if (Static344.anInt6622 == 0) {
			Static20.method408(15L);
		} else if (Static344.anInt6622 == 1) {
			Static20.method408(10L);
		} else if (Static344.anInt6622 == 2) {
			Static20.method408(5L);
		} else if (Static344.anInt6622 == 3) {
			Static20.method408(2L);
		}
		if (Static316.aBoolean404) {
			Static32.method557();
		}
		if (Static118.aBoolean168 && Static278.anInt5495 == 10 && Static32.anInt628 != -1) {
			Static118.aBoolean168 = false;
			Static72.method1328(Static182.aClass139_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method708() {
		@Pc(7) boolean local7 = Static170.aClass162_2.method4448();
		if (!local7) {
			this.method715();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method711(@OriginalArg(1) int arg0) {
		Static353.aClass16_9 = null;
		Static154.anInt2992 = 0;
		Static170.aClass162_2.anInt4989 = arg0;
		Static170.aClass162_2.anInt4988++;
		Static299.aClass41_44 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method689() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static76.method1405();
		Static172.aClass56_4 = new Class56(Static182.aClass139_5);
		Static170.aClass162_2 = new Class162();
		if (Static125.anInt2409 != 0) {
			Static94.aByteArrayArray7 = new byte[50][];
		}
		Static327.method5660(Static182.aClass139_5);
		if (Static351.anInt6735 == 0) {
			Static214.aString37 = this.getCodeBase().getHost();
			Static309.anInt6049 = 443;
			Static347.anInt6685 = 43594;
		} else if (Static351.anInt6735 == 1) {
			Static214.aString37 = this.getCodeBase().getHost();
			Static309.anInt6049 = Static11.anInt218 + 50000;
			Static347.anInt6685 = Static11.anInt218 + 40000;
		} else if (Static351.anInt6735 == 2) {
			Static347.anInt6685 = Static11.anInt218 + 40000;
			Static309.anInt6049 = Static11.anInt218 + 50000;
			Static214.aString37 = "127.0.0.1";
		}
		Static152.aString56 = Static214.aString37;
		Static89.anInt1684 = Static347.anInt6685;
		Static195.anInt3881 = Static347.anInt6685;
		Static312.anInt6076 = Static309.anInt6049;
		Static101.anInt1909 = Static89.anInt1684;
		Static244.aShortArray85 = Static349.aShortArray118 = Static239.aShortArray77 = Static57.aShortArray108 = new short[256];
		if (Static210.anInt4168 == 3) {
			Static48.anInt918 = Static11.anInt218;
		}
		if (Static111.anInt2077 == 1) {
			Static321.anInt6213 = 0;
			Static317.aBoolean513 = true;
			Static274.aShortArray92 = Static84.aShortArray58;
			Static96.aShortArrayArray3 = Static176.aShortArrayArray5;
			Static352.aShortArrayArray7 = Static21.aShortArrayArray1;
			Static139.anInt2689 = 16777215;
			Static47.aShortArray8 = Static179.aShortArray52;
		} else {
			Static274.aShortArray92 = Static113.aShortArray21;
			Static47.aShortArray8 = Static304.aShortArray107;
			Static96.aShortArrayArray3 = Static235.aShortArrayArray6;
			Static352.aShortArrayArray7 = Static96.aShortArrayArray4;
		}
		Static174.aClass2_1 = Static87.method1564(Static102.aCanvas3);
		Static316.aClass118_3 = Static179.method3201(Static102.aCanvas3);
		Static142.aClass79_1 = Static116.method2021();
		if (Static142.aClass79_1 != null) {
			Static142.aClass79_1.method4264(Static102.aCanvas3);
		}
		Static333.anInt6434 = Static210.anInt4168;
		try {
			if (Static182.aClass139_5.aClass92_4 != null) {
				Static87.aClass129_2 = new Class129(Static182.aClass139_5.aClass92_4, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Static237.aClass129Array1[local171] = new Class129(Static182.aClass139_5.aClass92Array1[local171], 6000, 0);
				}
				Static78.aClass129_1 = new Class129(Static182.aClass139_5.aClass92_2, 6000, 0);
				Static350.aClass140_4 = new Class140(255, Static87.aClass129_2, Static78.aClass129_1, 500000);
				Static257.aClass129_5 = new Class129(Static182.aClass139_5.aClass92_3, 24, 0);
				Static182.aClass139_5.aClass92Array1 = null;
				Static182.aClass139_5.aClass92_4 = null;
				Static182.aClass139_5.aClass92_2 = null;
				Static182.aClass139_5.aClass92_3 = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static78.aClass129_1 = null;
			Static87.aClass129_2 = null;
			Static350.aClass140_4 = null;
			Static257.aClass129_5 = null;
		}
		if (Static351.anInt6735 != 0) {
			Static320.aBoolean515 = true;
		}
		if (Static111.anInt2077 == 0) {
			Static257.aString51 = Static94.aClass85_39.method2020(Static41.anInt726);
		} else if (Static111.anInt2077 == 1) {
			Static257.aString51 = Static74.aClass85_32.method2020(Static41.anInt726);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method715() {
		if (Static93.anInt1789 < Static170.aClass162_2.anInt4988) {
			Static150.anInt2938 = (Static170.aClass162_2.anInt4988 * 50 - 50) * 5;
			if (Static195.anInt3881 == Static101.anInt1909) {
				Static101.anInt1909 = Static312.anInt6076;
			} else {
				Static101.anInt1909 = Static195.anInt3881;
			}
			if (Static150.anInt2938 > 3000) {
				Static150.anInt2938 = 3000;
			}
			if (Static170.aClass162_2.anInt4988 >= 2 && Static170.aClass162_2.anInt4989 == 6) {
				this.method700("js5connect_outofdate");
				Static278.anInt5495 = 1000;
				return;
			}
			if (Static170.aClass162_2.anInt4988 >= 4 && Static170.aClass162_2.anInt4989 == -1) {
				this.method700("js5crc");
				Static278.anInt5495 = 1000;
				return;
			}
			if (Static170.aClass162_2.anInt4988 >= 4 && (Static278.anInt5495 == 0 || Static278.anInt5495 == 5)) {
				if (Static170.aClass162_2.anInt4989 == 7 || Static170.aClass162_2.anInt4989 == 9) {
					this.method700("js5connect_full");
				} else if (Static170.aClass162_2.anInt4989 > 0) {
					this.method700("js5connect");
				} else {
					this.method700("js5io");
				}
				Static278.anInt5495 = 1000;
				return;
			}
		}
		Static93.anInt1789 = Static170.aClass162_2.anInt4988;
		if (Static150.anInt2938 > 0) {
			Static150.anInt2938--;
			return;
		}
		try {
			if (Static154.anInt2992 == 0) {
				Static353.aClass16_9 = Static182.aClass139_5.method3857(Static101.anInt1909, Static152.aString56);
				Static154.anInt2992++;
			}
			if (Static154.anInt2992 == 1) {
				if (Static353.aClass16_9.anInt381 == 2) {
					this.method711(1000);
					return;
				}
				if (Static353.aClass16_9.anInt381 == 1) {
					Static154.anInt2992++;
				}
			}
			if (Static154.anInt2992 == 2) {
				Static299.aClass41_44 = new Class41((Socket) Static353.aClass16_9.anObject1, Static182.aClass139_5);
				@Pc(189) Class5_Sub12 local189 = new Class5_Sub12(5);
				local189.method5089(15);
				local189.method5070(565);
				Static299.aClass41_44.method829(local189.aByteArray90, 5);
				Static154.anInt2992++;
				Static333.aLong224 = Static340.method5863();
			}
			if (Static154.anInt2992 == 3) {
				if (Static278.anInt5495 == 0 || Static278.anInt5495 == 5 || Static299.aClass41_44.method826() > 0) {
					@Pc(253) int local253 = Static299.aClass41_44.method830();
					if (local253 != 0) {
						this.method711(local253);
						return;
					}
					Static154.anInt2992++;
				} else if (Static340.method5863() - Static333.aLong224 > 30000L) {
					this.method711(1001);
					return;
				}
			}
			if (Static154.anInt2992 == 4) {
				@Pc(282) boolean local282 = Static278.anInt5495 == 5 || Static278.anInt5495 == 10 || Static278.anInt5495 == 28;
				Static170.aClass162_2.method4446(!local282, Static299.aClass41_44);
				Static154.anInt2992 = 0;
				Static353.aClass16_9 = null;
				Static299.aClass41_44 = null;
			}
		} catch (@Pc(299) IOException local299) {
			this.method711(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method716() {
		@Pc(5) int local5;
		if (!Static118.aBoolean168) {
			for (local5 = 0; local5 < Static258.anInt5091; local5++) {
				if (Static55.aClass19Array3[local5].method427() == 's' || Static55.aClass19Array3[local5].method427() == 'S') {
					Static118.aBoolean168 = true;
					break;
				}
			}
		}
		@Pc(56) int local56;
		if (Static193.anInt3690 == 0) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local56 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static340.method5863();
			if (Static197.aLong139 == 0L) {
				Static197.aLong139 = local59;
			}
			if (local56 > 16384 && local59 - Static197.aLong139 < 5000L) {
				if (local59 - Static3.aLong230 > 1000L) {
					System.gc();
					Static3.aLong230 = local59;
				}
				Static316.aString47 = Static317.aClass85_132.method2020(Static41.anInt726);
				Static178.anInt3531 = 5;
			} else {
				Static316.aString47 = Static167.aClass85_77.method2020(Static41.anInt726);
				Static178.anInt3531 = 5;
				Static193.anInt3690 = 10;
			}
		} else if (Static193.anInt3690 == 10) {
			for (local5 = 0; local5 < 4; local5++) {
				Static152.aClass24Array3[local5] = Static45.method712(Static22.anInt481, Static269.anInt5281);
			}
			Static316.aString47 = Static334.aClass85_143.method2020(Static41.anInt726);
			Static178.anInt3531 = 10;
			Static193.anInt3690 = 20;
		} else if (Static193.anInt3690 == 20) {
			if (Static78.aClass138_1 == null) {
				Static78.aClass138_1 = new Class138(Static170.aClass162_2, Static172.aClass56_4);
			}
			if (Static78.aClass138_1.method3848()) {
				Static183.aClass93_69 = Static229.method4129(true, 0, false);
				Static55.aClass93_106 = Static229.method4129(true, 1, false);
				Static200.aClass93_77 = Static229.method4129(true, 2, false);
				Static346.aClass93_130 = Static229.method4129(true, 3, false);
				Static186.aClass93_72 = Static229.method4129(true, 4, false);
				Static351.aClass93_134 = Static229.method4129(true, 5, true);
				Static319.aClass93_121 = Static229.method4129(false, 6, true);
				Static161.aClass93_63 = Static229.method4129(true, 7, false);
				Static244.aClass93_93 = Static229.method4129(true, 8, false);
				Static242.aClass93_90 = Static229.method4129(true, 9, false);
				Static177.aClass93_65 = Static229.method4129(true, 10, false);
				Static270.aClass93_104 = Static229.method4129(true, 11, false);
				Static1.aClass93_1 = Static229.method4129(true, 12, false);
				Static294.aClass93_133 = Static229.method4129(true, 13, false);
				Static134.aClass93_43 = Static229.method4129(false, 14, false);
				Static134.aClass93_42 = Static229.method4129(true, 15, false);
				Static29.aClass93_11 = Static229.method4129(true, 16, false);
				Static253.aClass93_96 = Static229.method4129(true, 17, false);
				Static254.aClass93_97 = Static229.method4129(true, 18, false);
				Static233.aClass93_88 = Static229.method4129(true, 19, false);
				Static1.aClass93_2 = Static229.method4129(true, 20, false);
				Static180.aClass93_66 = Static229.method4129(true, 21, false);
				Static288.aClass93_112 = Static229.method4129(true, 22, false);
				Static48.aClass93_15 = Static229.method4129(true, 23, true);
				Static159.aClass93_62 = Static229.method4129(true, 24, false);
				Static307.aClass93_118 = Static229.method4129(true, 25, false);
				Static191.aClass93_75 = Static229.method4129(true, 26, true);
				Static353.aClass93_135 = Static229.method4129(true, 27, false);
				Static93.aClass93_37 = Static229.method4129(true, 28, true);
				Static316.aString47 = Static215.aClass85_102.method2020(Static41.anInt726);
				Static193.anInt3690 = 30;
				Static178.anInt3531 = 15;
			} else {
				Static316.aString47 = Static323.aClass85_137.method2020(Static41.anInt726);
				Static178.anInt3531 = 12;
			}
		} else if (Static193.anInt3690 == 30) {
			local5 = 0;
			for (local56 = 0; local56 < 29; local56++) {
				local5 += Static157.aClass82_Sub1Array1[local56].method1933() * Static97.anIntArray162[local56] / 100;
			}
			if (local5 == 100) {
				Static316.aString47 = Static25.aClass85_117.method2020(Static41.anInt726);
				Static178.anInt3531 = 20;
				Static291.method5026(Static244.aClass93_93);
				Static326.method5659(Static244.aClass93_93);
				Static193.anInt3690 = 40;
			} else {
				if (local5 != 0) {
					Static316.aString47 = Static1.aClass85_1.method2020(Static41.anInt726) + local5 + "%";
				}
				Static178.anInt3531 = 20;
			}
		} else if (Static193.anInt3690 == 40) {
			if (Static93.aClass93_37.method2389()) {
				this.method704(Static93.aClass93_37.method2392(1));
				Static316.aString47 = Static183.aClass85_85.method2020(Static41.anInt726);
				Static193.anInt3690 = 50;
				Static178.anInt3531 = 25;
			} else {
				Static316.aString47 = Static168.aClass85_78.method2020(Static41.anInt726) + Static93.aClass93_37.method2411() + "%";
				Static178.anInt3531 = 25;
			}
		} else if (Static193.anInt3690 == 50) {
			Static130.method4916(Static230.aBoolean379);
			Static122.aClass5_Sub16_Sub1_2 = new Class5_Sub16_Sub1();
			Static122.aClass5_Sub16_Sub1_2.method1679();
			Static143.aClass47_1 = Static234.method4159(22050, Static102.aCanvas3, 0, Static182.aClass139_5);
			Static143.aClass47_1.method5333(Static122.aClass5_Sub16_Sub1_2);
			Static296.method5127(Static134.aClass93_43, Static122.aClass5_Sub16_Sub1_2, Static186.aClass93_72, Static134.aClass93_42);
			Static311.aClass47_3 = Static234.method4159(2048, Static102.aCanvas3, 1, Static182.aClass139_5);
			Static114.aClass5_Sub16_Sub4_1 = new Class5_Sub16_Sub4();
			Static311.aClass47_3.method5333(Static114.aClass5_Sub16_Sub4_1);
			Static146.aClass101_1 = new Class101(22050, Static226.anInt4449);
			Static104.anInt2004 = Static319.aClass93_121.method2393("scape main");
			Static316.aString47 = Static348.aClass85_146.method2020(Static41.anInt726);
			Static178.anInt3531 = 30;
			Static193.anInt3690 = 60;
		} else if (Static193.anInt3690 == 60) {
			local5 = Static102.method1828(Static244.aClass93_93, Static294.aClass93_133);
			local56 = Static53.method854();
			if (local5 < local56) {
				Static316.aString47 = Static314.aClass85_130.method2020(Static41.anInt726) + local5 * 100 / local56 + "%";
				Static178.anInt3531 = 35;
			} else {
				Static316.aString47 = Static95.aClass85_41.method2020(Static41.anInt726);
				Static178.anInt3531 = 35;
				Static193.anInt3690 = 70;
			}
		} else if (Static193.anInt3690 == 70) {
			local5 = Static352.method5987(Static244.aClass93_93);
			local56 = Static204.method3752();
			if (local5 < local56) {
				Static316.aString47 = Static304.aClass85_125.method2020(Static41.anInt726) + local5 * 100 / local56 + "%";
				Static178.anInt3531 = 40;
			} else {
				Static316.aString47 = Static107.aClass85_109.method2020(Static41.anInt726);
				Static193.anInt3690 = 80;
				Static178.anInt3531 = 40;
			}
		} else if (Static193.anInt3690 == 80) {
			if (Static191.aClass93_75.method2389()) {
				Static182.anInterface3_3 = new Class68(Static191.aClass93_75, Static242.aClass93_90, Static244.aClass93_93);
				Static316.aString47 = Static306.aClass85_126.method2020(Static41.anInt726);
				Static193.anInt3690 = 90;
				Static178.anInt3531 = 45;
			} else {
				Static316.aString47 = Static324.aClass85_138.method2020(Static41.anInt726) + Static191.aClass93_75.method2411() + "%";
				Static178.anInt3531 = 45;
			}
		} else if (Static193.anInt3690 == 90) {
			Static316.aString47 = Static128.aClass85_89.method2020(Static41.anInt726);
			Static193.anInt3690 = 95;
			Static178.anInt3531 = 50;
		} else if (Static193.anInt3690 == 95) {
			if (Static118.aBoolean168) {
				Static223.anInt4410 = 1;
				Static161.anInt3186 = 0;
				Static44.anInt747 = 0;
				Static254.anInt5030 = 0;
				Static278.anInt5486 = 0;
			}
			Static118.aBoolean168 = true;
			Static72.method1328(Static182.aClass139_5);
			Static143.method2570();
			Static230.method4148(Static254.anInt5030, false);
			Static316.aString47 = Static241.aClass85_110.method2020(Static41.anInt726);
			Static178.anInt3531 = 55;
			Static193.anInt3690 = 100;
		} else if (Static193.anInt3690 == 100) {
			Static79.method1422(Static294.aClass93_133, Static236.aClass55_9, Static244.aClass93_93);
			Static316.aString47 = Static205.aClass85_95.method2020(Static41.anInt726);
			Static178.anInt3531 = 60;
			Static50.method822(5);
			Static193.anInt3690 = 110;
		} else if (Static193.anInt3690 == 110) {
			Static200.aClass93_77.method2389();
			local56 = Static200.aClass93_77.method2411();
			Static29.aClass93_11.method2389();
			local56 += Static29.aClass93_11.method2411();
			Static253.aClass93_96.method2389();
			local56 += Static253.aClass93_96.method2411();
			Static254.aClass93_97.method2389();
			local56 += Static254.aClass93_97.method2411();
			Static233.aClass93_88.method2389();
			local56 += Static233.aClass93_88.method2411();
			Static1.aClass93_2.method2389();
			local56 += Static1.aClass93_2.method2411();
			Static180.aClass93_66.method2389();
			local56 += Static180.aClass93_66.method2411();
			Static288.aClass93_112.method2389();
			local56 += Static288.aClass93_112.method2411();
			Static159.aClass93_62.method2389();
			local56 += Static159.aClass93_62.method2411();
			Static307.aClass93_118.method2389();
			local56 += Static307.aClass93_118.method2411();
			Static353.aClass93_135.method2389();
			local56 += Static353.aClass93_135.method2411();
			if (local56 < 1100) {
				Static316.aString47 = Static157.aClass85_72.method2020(Static41.anInt726) + local56 / 11 + "%";
				Static178.anInt3531 = 65;
			} else {
				Static249.method5570(Static200.aClass93_77);
				Static152.method5139(Static200.aClass93_77);
				Static144.method2636(Static200.aClass93_77);
				Static226.method4086(Static200.aClass93_77, Static161.aClass93_63);
				Static134.method1925(Static161.aClass93_63, Static29.aClass93_11, Static41.anInt726);
				Static27.method488(Static41.anInt726, Static161.aClass93_63, Static254.aClass93_97);
				Static34.method569(Static41.anInt726, Static233.aClass93_88, Static161.aClass93_63);
				Static187.method3353(Static200.aClass93_77);
				Static197.method3478(Static55.aClass93_106, Static183.aClass93_69, Static1.aClass93_2);
				Static66.method5236(Static200.aClass93_77);
				Static55.method4831(Static180.aClass93_66, Static161.aClass93_63);
				Static325.method5629(Static288.aClass93_112);
				Static95.method1730(Static200.aClass93_77);
				Static319.method5549(Static294.aClass93_133, Static161.aClass93_63, Static244.aClass93_93, Static346.aClass93_130);
				Static125.method2234(Static200.aClass93_77);
				Static278.method4850(Static253.aClass93_96);
				Static92.method1676(new Class35(), Static307.aClass93_118, Static159.aClass93_62);
				Static331.method5734(Static307.aClass93_118, Static159.aClass93_62);
				Static15.method291(Static200.aClass93_77);
				Static332.method6050(Static200.aClass93_77);
				Static301.method5299(Static200.aClass93_77);
				Static103.method4834(Static244.aClass93_93, Static200.aClass93_77);
				Static131.method2332(Static244.aClass93_93, Static200.aClass93_77);
				Static14.method284(Static200.aClass93_77);
				Static252.method4464(Static244.aClass93_93, Static200.aClass93_77);
				Static271.method4758(Static200.aClass93_77);
				Static174.method3167(Static200.aClass93_77);
				Static316.aString47 = Static180.aClass85_82.method2020(Static41.anInt726);
				Static178.anInt3531 = 65;
				Static14.method282();
				Static193.anInt3690 = 120;
			}
		} else if (Static193.anInt3690 == 120) {
			local56 = Static44.method655(Static244.aClass93_93);
			@Pc(1047) int local1047 = Static39.method616();
			if (local56 < local1047) {
				Static316.aString47 = Static207.aClass85_97.method2020(Static41.anInt726) + local56 * 100 / local1047 + "%";
				Static178.anInt3531 = 70;
			} else {
				Static171.method3126(Static244.aClass93_93, Static236.aClass55_9);
				Static53.method851(Static132.aClass95Array9);
				Static316.aString47 = Static51.aClass85_25.method2020(Static41.anInt726);
				Static193.anInt3690 = 130;
				Static178.anInt3531 = 70;
			}
		} else if (Static193.anInt3690 == 130) {
			Static316.aString47 = Static43.aClass85_149.method2020(Static41.anInt726);
			Static178.anInt3531 = 75;
			Static193.anInt3690 = 140;
		} else if (Static193.anInt3690 == 140) {
			if (Static177.aClass93_65.method2416("huffman", "")) {
				@Pc(1138) Class154 local1138 = new Class154(Static177.aClass93_65.method2406("huffman", ""));
				Static329.method5697(local1138);
				Static316.aString47 = Static42.aClass85_19.method2020(Static41.anInt726);
				Static193.anInt3690 = 150;
				Static178.anInt3531 = 80;
			} else {
				Static316.aString47 = Static171.aClass85_79.method2020(Static41.anInt726) + "0%";
				Static178.anInt3531 = 80;
			}
		} else if (Static193.anInt3690 == 150) {
			if (!Static346.aClass93_130.method2389()) {
				Static316.aString47 = Static9.aClass85_7.method2020(Static41.anInt726) + Static346.aClass93_130.method2411() * 3 / 4 + "%";
				Static178.anInt3531 = 85;
			} else if (!Static1.aClass93_1.method2389()) {
				Static316.aString47 = Static9.aClass85_7.method2020(Static41.anInt726) + (Static1.aClass93_1.method2411() / 10 + 75) + "%";
				Static178.anInt3531 = 85;
			} else if (!Static294.aClass93_133.method2389()) {
				Static316.aString47 = Static9.aClass85_7.method2020(Static41.anInt726) + (Static294.aClass93_133.method2411() / 20 + 85) + "%";
				Static178.anInt3531 = 85;
			} else if (Static48.aClass93_15.method2405("details")) {
				Static290.method2547(Static48.aClass93_15);
				Static274.method4819(Static353.aClass93_135);
				Static137.method2432(Static182.anInterface3_3, Static161.aClass93_63);
				Static316.aString47 = Static166.aClass85_76.method2020(Static41.anInt726);
				Static178.anInt3531 = 85;
				Static193.anInt3690 = 160;
			} else {
				Static316.aString47 = Static9.aClass85_7.method2020(Static41.anInt726) + (Static48.aClass93_15.method2394("details") / 10 + 90) + "%";
				Static178.anInt3531 = 85;
			}
		} else if (Static193.anInt3690 == 160) {
			local56 = Static251.method4451();
			if (local56 == -1) {
				Static316.aString47 = Static199.aClass85_92.method2020(Static41.anInt726);
				Static178.anInt3531 = 90;
			} else if (local56 == 7 || local56 == 9) {
				this.method700("worldlistfull");
				Static50.method822(1000);
			} else if (Static244.aBoolean410) {
				Static316.aString47 = Static149.aClass85_70.method2020(Static41.anInt726);
				Static193.anInt3690 = 170;
				Static178.anInt3531 = 90;
			} else {
				this.method700("worldlistio_" + local56);
				Static50.method822(1000);
			}
		} else if (Static193.anInt3690 == 170) {
			Static234.anIntArray427 = new int[Static129.anInt2460];
			Static346.aBooleanArray25 = new boolean[Static129.anInt2460];
			Static182.aStringArray43 = new String[Static139.anInt2693];
			for (local56 = 0; local56 < Static129.anInt2460; local56++) {
				if (Static238.method4230(local56).anInt5235 == 0) {
					Static346.aBooleanArray25[local56] = true;
					Static63.anInt5176++;
				}
				Static234.anIntArray427[local56] = -1;
			}
			Static214.method3923();
			Static137.anInt2651 = Static346.aClass93_130.method2393("loginscreen");
			Static351.aClass93_134.method2401(false);
			Static319.aClass93_121.method2401(true);
			Static244.aClass93_93.method2401(true);
			Static294.aClass93_133.method2401(true);
			Static177.aClass93_65.method2401(true);
			Static346.aClass93_130.method2401(true);
			Static316.aBoolean404 = true;
			Static200.aClass93_77.anInt2609 = 2;
			Static253.aClass93_96.anInt2609 = 2;
			Static29.aClass93_11.anInt2609 = 2;
			Static254.aClass93_97.anInt2609 = 2;
			Static233.aClass93_88.anInt2609 = 2;
			Static1.aClass93_2.anInt2609 = 2;
			Static180.aClass93_66.anInt2609 = 2;
			Static198.method3483(-1, false, -1, Static223.anInt4410);
			Static316.aString47 = Static85.aClass85_34.method2020(Static41.anInt726);
			Static193.anInt3690 = 180;
			Static178.anInt3531 = 95;
		} else if (Static193.anInt3690 == 180) {
			Static280.method4870(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method688() {
		if (Static278.anInt5495 == 1000) {
			return;
		}
		Static283.anInt5563++;
		if (Static283.anInt5563 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static92.anInt1719 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static55.aRandom3.setSeed((long) Static92.anInt1719);
		}
		this.method708();
		if (Static78.aClass138_1 != null) {
			Static78.aClass138_1.method3852();
		}
		Static85.method1518();
		Static315.method5535();
		Static174.aClass2_1.method1429();
		Static316.aClass118_3.method4058();
		if (Static142.aClass79_1 != null) {
			@Pc(76) int local76 = Static142.aClass79_1.method4266();
			Static156.anInt3027 = local76;
		}
		if (Static236.aClass55_9 != null) {
			Static236.aClass55_9.method5248((int) Static340.method5863());
		}
		Static16.method309();
		Static258.anInt5091 = 0;
		for (@Pc(93) Class19 local93 = Static174.aClass2_1.method1433(); local93 != null && Static258.anInt5091 < 128; local93 = Static174.aClass2_1.method1433()) {
			if (local93.method422() != 1) {
				@Pc(106) char local106 = local93.method427();
				if (!Static148.method2694() || local106 != '`' && local106 != '§') {
					Static55.aClass19Array3[Static258.anInt5091] = local93;
					Static258.anInt5091++;
				} else if (Static85.method1515()) {
					Static127.method2261();
				} else {
					Static249.method5572();
				}
			}
		}
		Static150.aClass5_Sub26_1 = null;
		for (@Pc(155) Class5_Sub26 local155 = Static316.aClass118_3.method4057(); local155 != null; local155 = Static316.aClass118_3.method4057()) {
			@Pc(161) int local161 = local155.method4481();
			if (local161 == -1) {
				Static121.aClass103_61.method2745(local155);
			} else if (Static24.method5480(local161)) {
				Static150.aClass5_Sub26_1 = local155;
			}
		}
		if (Static85.method1515()) {
			Static162.method2851();
		}
		if (Static278.anInt5495 == 0) {
			this.method716();
			Static163.method2870();
		} else if (Static278.anInt5495 == 5) {
			this.method716();
			Static163.method2870();
		} else if (Static278.anInt5495 == 25 || Static278.anInt5495 == 28) {
			Static11.method190();
		}
		if (Static278.anInt5495 == 10) {
			this.method721();
			Static16.method301();
			Static215.method3930();
			Static251.method4447();
		} else if (Static278.anInt5495 == 30) {
			Static38.method599();
		} else if (Static278.anInt5495 == 40) {
			Static251.method4447();
			if (Static333.anInt6433 != -3) {
				if (Static333.anInt6433 == 15) {
					Static60.method1849();
				} else if (Static333.anInt6433 != 2) {
					Static49.method4428();
				}
			}
		}
		Static89.method1618(Static236.aClass55_9);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method692() {
		if (Static235.aBoolean381) {
			Static246.method4391();
		}
		if (Static236.aClass55_9 != null) {
			Static236.aClass55_9.method5168();
		}
		if (Static110.aFrame4 != null) {
			Static151.method2736(Static110.aFrame4, Static182.aClass139_5);
			Static110.aFrame4 = null;
		}
		if (Static155.aClass41_18 != null) {
			Static155.aClass41_18.method825();
			Static155.aClass41_18 = null;
		}
		if (Static142.aClass79_1 != null) {
			Static142.aClass79_1.method4267(Static102.aCanvas3);
		}
		Static142.aClass79_1 = null;
		if (Static143.aClass47_1 != null) {
			Static143.aClass47_1.method5331();
		}
		if (Static311.aClass47_3 != null) {
			Static311.aClass47_3.method5331();
		}
		Static170.aClass162_2.method4444();
		Static172.aClass56_4.method1305();
		if (Static222.aClass136_1 != null) {
			Static222.aClass136_1.method3753();
			Static222.aClass136_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method701()) {
			return;
		}
		Static11.anInt218 = Integer.parseInt(this.getParameter("worldid"));
		Static351.anInt6735 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static351.anInt6735 < 0 || Static351.anInt6735 > 1) {
			Static351.anInt6735 = 0;
		}
		Static125.anInt2409 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static125.anInt2409 < 0 || Static125.anInt2409 > 2) {
			Static125.anInt2409 = 0;
		}
		try {
			Static41.anInt726 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(51) Exception local51) {
			Static41.anInt726 = 0;
		}
		@Pc(57) String local57 = this.getParameter("objecttag");
		if (local57 != null && local57.equals("1")) {
			Static319.aBoolean514 = true;
		} else {
			Static319.aBoolean514 = false;
		}
		@Pc(73) String local73 = this.getParameter("js");
		if (local73 != null && local73.equals("1")) {
			Static259.aBoolean424 = true;
		} else {
			Static259.aBoolean424 = false;
		}
		@Pc(89) String local89 = this.getParameter("game");
		if (local89 != null && local89.equals("1")) {
			Static111.anInt2077 = 1;
		} else {
			Static111.anInt2077 = 0;
		}
		try {
			Static16.anInt331 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(108) Exception local108) {
			Static16.anInt331 = 0;
		}
		Static153.aString17 = this.getParameter("quiturl");
		Static96.aString10 = this.getParameter("settings");
		if (Static96.aString10 == null) {
			Static96.aString10 = "";
		}
		@Pc(126) String local126 = this.getParameter("country");
		if (local126 != null) {
			try {
				Static161.anInt3184 = Integer.parseInt(local126);
			} catch (@Pc(133) Exception local133) {
				Static161.anInt3184 = 0;
			}
		}
		Static23.anInt484 = Integer.parseInt(this.getParameter("colourid"));
		if (Static23.anInt484 < 0 || Static51.aColorArray1.length <= Static23.anInt484) {
			Static23.anInt484 = 0;
		}
		Static138.aClient1 = this;
		this.method690(Static125.anInt2409 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method721() {
		Static26.anInt519++;
		Static80.method1434(null, -1, -1);
		Static36.method578(-1, -1, null);
		Static312.method5453();
		Static190.anInt456++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class4_Sub5_Sub2_Sub2 local33 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass106_1.aByte15;
				if ((local39 & 0x1) != 0) {
					@Pc(52) int local52 = local33.method4807();
					@Pc(76) int local76;
					if ((local39 & 0x2) != 0 && local33.anInt5413 == 0 && Math.random() * 1000.0D < 10.0D) {
						local76 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(84) int local84 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local76 != 0 || local84 != 0) {
							@Pc(102) int local102 = local33.anIntArray523[0] + local76;
							@Pc(109) int local109 = local33.anIntArray522[0] + local84;
							if (local102 < 0) {
								local102 = 0;
							} else if (local102 > Static22.anInt481 - local52 - 1) {
								local102 = Static22.anInt481 - local52 - 1;
							}
							if (local109 < 0) {
								local109 = 0;
							} else if (Static269.anInt5281 - local52 - 1 < local109) {
								local109 = Static269.anInt5281 - local52 - 1;
							}
							@Pc(181) int local181 = Static86.method1556(-1, local33.anIntArray523[0], Static100.anIntArray177, Static152.aClass24Array3[local33.aByte75], local52, Static244.anIntArray480, 0, local52, local52, true, local109, local102, 0, local33.anIntArray522[0]);
							if (local181 > 0) {
								if (local181 > 9) {
									local181 = 9;
								}
								for (@Pc(192) int local192 = 0; local192 < local181; local192++) {
									local33.anIntArray523[local192] = Static100.anIntArray177[local181 - local192 - 1];
									local33.anIntArray522[local192] = Static244.anIntArray480[local181 - local192 - 1];
									local33.aByteArray74[local192] = 1;
								}
								local33.anInt5413 = local181;
							}
						}
					}
					Static234.method4162(true, local33);
					local76 = Static181.method3306(local33);
					Static261.method4606(Static178.anInt3535, Static261.anInt5123, local33, local76);
					Static116.method2024(local33);
				}
			}
		}
		if (Static150.anInt2940 == 0 && Static350.anInt6718 == 0) {
			if (Static53.anInt992 == 2) {
				Static205.method3776();
			} else {
				Static85.method1516();
			}
			if (Static271.anInt5301 >> 7 < 14 || Static22.anInt481 - 14 <= Static271.anInt5301 >> 7 || Static21.anInt466 >> 7 < 14 || Static269.anInt5281 - 14 <= Static21.anInt466 >> 7) {
				Static164.method2904();
			}
		}
		while (true) {
			@Pc(316) Class5_Sub17 local316;
			@Pc(321) Class201 local321;
			@Pc(329) Class201 local329;
			do {
				local316 = (Class5_Sub17) Static309.aClass103_146.method2743();
				if (local316 == null) {
					while (true) {
						do {
							local316 = (Class5_Sub17) Static229.aClass103_111.method2743();
							if (local316 == null) {
								while (true) {
									do {
										local316 = (Class5_Sub17) Static144.aClass103_74.method2743();
										if (local316 == null) {
											if (Static204.aClass201_8 != null) {
												Static5.method89();
											}
											if (Static283.anInt5563 % 1500 == 0) {
												Static48.method799();
											}
											Static162.method2860();
											if (Static235.aBoolean381 && Static135.aLong29 < Static340.method5863() - 60000L) {
												Static246.method4391();
												return;
											}
											return;
										}
										local321 = local316.aClass201_3;
										if (local321.anInt6548 < 0) {
											break;
										}
										local329 = Static262.method4616(local321.anInt6491);
									} while (local329 == null || local329.aClass201Array121 == null || local321.anInt6548 >= local329.aClass201Array121.length || local321 != local329.aClass201Array121[local321.anInt6548]);
									Static108.method1907(local316);
								}
							}
							local321 = local316.aClass201_3;
							if (local321.anInt6548 < 0) {
								break;
							}
							local329 = Static262.method4616(local321.anInt6491);
						} while (local329 == null || local329.aClass201Array121 == null || local329.aClass201Array121.length <= local321.anInt6548 || local329.aClass201Array121[local321.anInt6548] != local321);
						Static108.method1907(local316);
					}
				}
				local321 = local316.aClass201_3;
				if (local321.anInt6548 < 0) {
					break;
				}
				local329 = Static262.method4616(local321.anInt6491);
			} while (local329 == null || local329.aClass201Array121 == null || local329.aClass201Array121.length <= local321.anInt6548 || local321 != local329.aClass201Array121[local321.anInt6548]);
			Static108.method1907(local316);
		}
	}
}
