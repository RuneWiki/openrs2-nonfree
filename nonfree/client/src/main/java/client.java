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
				Static407.method6009("Argument count");
			}
			Static63.aClass54_4 = new Class54();
			Static63.aClass54_4.anInt869 = Integer.parseInt(arg0[0]);
			Static71.aClass54_5 = new Class54();
			Static71.aClass54_5.anInt869 = Integer.parseInt(arg0[1]);
			Static511.aClass54_23 = new Class54();
			Static511.aClass54_23.anInt869 = Integer.parseInt(arg0[2]);
			Static570.aClass201_10 = Static116.aClass201_5;
			if (arg0[3].equals("live")) {
				Static154.aClass249_2 = Static443.aClass249_4;
			} else if (arg0[3].equals("rc")) {
				Static154.aClass249_2 = Static268.aClass249_3;
			} else if (arg0[3].equals("wip")) {
				Static154.aClass249_2 = Static63.aClass249_1;
			} else {
				Static407.method6009("modewhat");
			}
			Static323.anInt5795 = Static357.method5334(arg0[4]);
			if (Static323.anInt5795 == -1) {
				if (arg0[4].equals("english")) {
					Static323.anInt5795 = 0;
				} else if (arg0[4].equals("german")) {
					Static323.anInt5795 = 1;
				} else {
					Static407.method6009("language");
				}
			}
			Static525.aBoolean720 = false;
			Static301.aBoolean679 = false;
			if (arg0[5].equals("game0")) {
				Static256.aClass333_3 = Static569.aClass333_7;
			} else if (arg0[5].equals("game1")) {
				Static256.aClass333_3 = Static521.aClass333_6;
			} else if (arg0[5].equals("game2")) {
				Static256.aClass333_3 = Static124.aClass333_1;
			} else if (arg0[5].equals("game3")) {
				Static256.aClass333_3 = Static449.aClass333_5;
			} else {
				Static407.method6009("game");
			}
			Static530.anInt8943 = Static256.aClass333_3.anInt9710;
			Static650.anInt2312 = 0;
			Static672.aByteArray113 = null;
			Static294.aLong158 = 0L;
			Static402.aBoolean531 = true;
			Static510.aBoolean660 = true;
			Static287.aBoolean389 = false;
			Static456.anInt7813 = 0;
			Static625.aString132 = "";
			Static105.aBoolean165 = false;
			Static74.anInt1194 = 0;
			Static461.aString125 = null;
			@Pc(250) client local250 = new client();
			Static454.aClient1 = local250;
			local250.method1234(Static154.aClass249_2.method5772() + 32, Static256.aClass333_3.aString123);
			Static675.aFrame3.setLocation(40, 40);
		} catch (@Pc(273) Exception local273) {
			Static405.method5934((String) null, local273);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1245() {
		@Pc(7) boolean local7 = Static410.aClass65_1.method1129();
		if (!local7) {
			this.method1259();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1241() {
		if (Static105.aBoolean165) {
			Static329.anInt5875 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static360.method5369();
		Static514.aClass381_2 = new Class381(Static294.aClass230_3);
		Static410.aClass65_1 = new Class65();
		Static375.method5509(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static570.aClass201_10 != Static408.aClass201_8) {
			Static138.aByteArrayArray3 = new byte[50][];
		}
		Static637.aClass5_Sub20_31 = Static455.method6707();
		if (Static408.aClass201_8 == Static570.aClass201_10) {
			Static63.aClass54_4.aString15 = this.getCodeBase().getHost();
		} else if (Static145.method2055(Static570.aClass201_10)) {
			Static63.aClass54_4.aString15 = this.getCodeBase().getHost();
			Static63.aClass54_4.anInt868 = Static63.aClass54_4.anInt869 + 40000;
			Static71.aClass54_5.anInt868 = Static71.aClass54_5.anInt869 + 40000;
			Static511.aClass54_23.anInt868 = Static511.aClass54_23.anInt869 + 40000;
			Static63.aClass54_4.anInt872 = Static63.aClass54_4.anInt869 + 50000;
			Static71.aClass54_5.anInt872 = Static71.aClass54_5.anInt869 + 50000;
			Static511.aClass54_23.anInt872 = Static511.aClass54_23.anInt869 + 50000;
		} else if (Static570.aClass201_10 == Static116.aClass201_5) {
			Static63.aClass54_4.aString15 = "127.0.0.1";
			Static71.aClass54_5.aString15 = "127.0.0.1";
			Static511.aClass54_23.aString15 = "127.0.0.1";
			Static63.aClass54_4.anInt868 = Static63.aClass54_4.anInt869 + 40000;
			Static71.aClass54_5.anInt868 = Static71.aClass54_5.anInt869 + 40000;
			Static511.aClass54_23.anInt868 = Static511.aClass54_23.anInt869 + 40000;
			Static63.aClass54_4.anInt872 = Static63.aClass54_4.anInt869 + 50000;
			Static71.aClass54_5.anInt872 = Static71.aClass54_5.anInt869 + 50000;
			Static511.aClass54_23.anInt872 = Static511.aClass54_23.anInt869 + 50000;
		}
		if (Static256.aClass333_3 == Static521.aClass333_6) {
			Static114.aShortArrayArrayArray1 = Static331.aShortArrayArrayArray2;
			Static59.aShortArrayArray2 = Static588.aShortArrayArray15;
			Static279.anInt4837 = 0;
			Static257.anInt6392 = 16777215;
			Static572.aBoolean460 = true;
		} else if (Static256.aClass333_3 == Static449.aClass333_5) {
			Static114.aShortArrayArrayArray1 = Static605.aShortArrayArrayArray4;
			Static59.aShortArrayArray2 = Static209.aShortArrayArray4;
		} else {
			Static59.aShortArrayArray2 = Static422.aShortArrayArray11;
			Static114.aShortArrayArrayArray1 = Static449.aShortArrayArrayArray3;
		}
		if (Static256.aClass333_3 == Static569.aClass333_7) {
			Static224.aBoolean289 = false;
		}
		Static197.aClass54_35 = Static63.aClass54_4;
		Static309.aShortArray79 = Static482.aShortArray101 = Static447.aShortArray100 = Static256.aShortArray48 = new short[256];
		try {
			Static210.aClipboard5 = Static454.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(256) Exception local256) {
		}
		Static258.aClass89_1 = Static86.method1308(Static24.aCanvas1);
		Static205.aClass107_1 = Static564.method8143(Static24.aCanvas1);
		try {
			if (Static294.aClass230_3.aClass286_2 != null) {
				Static289.aClass176_11 = new Class176(Static294.aClass230_3.aClass286_2, 5200, 0);
				for (@Pc(280) int local280 = 0; local280 < 37; local280++) {
					Static371.aClass176Array1[local280] = new Class176(Static294.aClass230_3.aClass286Array1[local280], 6000, 0);
				}
				Static199.aClass176_8 = new Class176(Static294.aClass230_3.aClass286_3, 6000, 0);
				Static499.aClass223_4 = new Class223(255, Static289.aClass176_11, Static199.aClass176_8, 500000);
				Static620.aClass176_10 = new Class176(Static294.aClass230_3.aClass286_4, 24, 0);
				Static294.aClass230_3.aClass286_4 = null;
				Static294.aClass230_3.aClass286_2 = null;
				Static294.aClass230_3.aClass286_3 = null;
				Static294.aClass230_3.aClass286Array1 = null;
			}
		} catch (@Pc(342) IOException local342) {
			Static199.aClass176_8 = null;
			Static620.aClass176_10 = null;
			Static499.aClass223_4 = null;
			Static289.aClass176_11 = null;
		}
		if (Static408.aClass201_8 != Static570.aClass201_10) {
			Static443.aBoolean588 = true;
		}
		Static286.aString68 = Static582.aClass335_13.method8349(Static323.anInt5795);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1243() {
		if (Static593.aBoolean754) {
			Static553.method8002();
		}
		Static447.method6655();
		if (Static457.aClass57_11 != null) {
			Static457.aClass57_11.method7722();
		}
		if (Static517.aFrame1 != null) {
			Static606.method8452(Static294.aClass230_3, Static517.aFrame1);
			Static517.aFrame1 = null;
		}
		if (Static492.aClass295_1 != null) {
			Static492.aClass295_1.method7023();
			Static492.aClass295_1 = null;
		}
		Static361.method5373();
		Static410.aClass65_1.method1127();
		Static514.aClass381_2.method9063();
		if (Static303.aClass254_1 != null) {
			Static303.aClass254_1.method5899();
			Static303.aClass254_1 = null;
		}
		try {
			Static289.aClass176_11.method3775();
			for (@Pc(61) int local61 = 0; local61 < 37; local61++) {
				Static371.aClass176Array1[local61].method3775();
			}
			if (-70 <= -87) {
				Static81.anInt1321 = -29;
			}
			Static199.aClass176_8.method3775();
			Static620.aClass176_10.method3775();
			Static447.method6657();
		} catch (@Pc(97) Exception local97) {
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1248() {
		if (Static107.anInt1746 == 14) {
			return;
		}
		@Pc(22) long local22 = Static402.method5908() / 1000000L - Static567.aLong277;
		Static567.aLong277 = Static402.method5908() / 1000000L;
		@Pc(32) boolean local32 = Static585.method8419();
		if (local32 && Static152.aBoolean200 && Static311.aClass175_1 != null) {
			Static311.aClass175_1.method4695();
		}
		if (Static334.method5071(Static107.anInt1746)) {
			if (Static147.aLong71 != 0L && Static515.method7499(87 - 1) > Static147.aLong71) {
				Static674.method9280(false, Static476.anInt8056, Static15.anInt261, Static341.method5176());
			} else if (!Static457.aClass57_11.method7665() && Static666.aBoolean785) {
				Static1.method8127();
			}
		}
		@Pc(116) int local116;
		@Pc(120) int local120;
		if (Static517.aFrame1 == null) {
			@Pc(104) Container local104;
			if (Static675.aFrame3 != null) {
				local104 = Static675.aFrame3;
			} else if (Static492.anApplet2 == null) {
				local104 = Static361.anApplet_Sub1_1;
			} else {
				local104 = Static492.anApplet2;
			}
			local116 = local104.getSize().width;
			local120 = local104.getSize().height;
			if (Static675.aFrame3 == local104) {
				@Pc(126) Insets local126 = Static675.aFrame3.getInsets();
				local116 -= local126.right + local126.left;
				local120 -= local126.bottom + local126.top;
			}
			if (Static340.anInt6053 != local116 || local120 != Static584.anInt9793 || Static179.aBoolean250) {
				if (Static457.aClass57_11 == null || Static457.aClass57_11.method7694()) {
					Static360.method5369();
				} else {
					Static340.anInt6053 = local116;
					Static584.anInt9793 = local120;
				}
				Static147.aLong71 = Static515.method7499(98) + 500L;
				Static179.aBoolean250 = false;
			}
		}
		if (Static517.aFrame1 != null && !Static429.aBoolean567 && Static334.method5071(Static107.anInt1746)) {
			Static674.method9280(false, -1, -1, Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574());
		}
		@Pc(209) boolean local209 = false;
		if (Static494.aBoolean619) {
			local209 = true;
			Static494.aBoolean619 = false;
		}
		if (local209) {
			Static403.method5923();
		}
		if (Static457.aClass57_11 != null && Static457.aClass57_11.method7665() || Static341.method5176() != 1) {
			Static437.method6493();
		}
		if (Static288.method4698(Static107.anInt1746)) {
			Static55.method805(local209);
		} else if (Static237.method1622(Static107.anInt1746)) {
			Static415.method8271();
		} else if (Static117.method1656(Static107.anInt1746)) {
			Static415.method8271();
		} else if (Static103.method1468(Static107.anInt1746)) {
			if (Static73.anInt1183 == 1) {
				if (Static380.anInt6506 < Static148.anInt2388) {
					Static380.anInt6506 = Static148.anInt2388;
				}
				local116 = (Static380.anInt6506 - Static148.anInt2388) * 50 / Static380.anInt6506;
				Static299.method1114(true, Static582.aClass335_13.method8349(Static323.anInt5795) + "<br>(" + local116 + "%)", Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
			} else if (Static73.anInt1183 == 2) {
				if (Static220.anInt3575 < Static68.anInt1101) {
					Static220.anInt3575 = Static68.anInt1101;
				}
				local116 = (Static220.anInt3575 - Static68.anInt1101) * 50 / Static220.anInt3575 + 50;
				Static299.method1114(true, Static582.aClass335_13.method8349(Static323.anInt5795) + "<br>(" + local116 + "%)", Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
			} else {
				Static299.method1114(true, Static582.aClass335_13.method8349(Static323.anInt5795), Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
			}
		} else if (Static107.anInt1746 == 10) {
			Static654.method9047(local22);
		} else if (Static107.anInt1746 == 13) {
			Static299.method1114(false, Static582.aClass335_15.method8349(Static323.anInt5795) + "<br>" + Static582.aClass335_16.method8349(Static323.anInt5795), Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
		}
		if (Static455.anInt7798 == 3) {
			for (local116 = 0; local116 < Static449.anInt7746; local116++) {
				@Pc(460) Rectangle local460 = Class13_Sub11.aRectangleArray2[local116];
				if (Static559.aBooleanArray25[local116]) {
					Static457.aClass57_11.method7723(local460.x, local460.height, -65281, local460.width, local460.y);
				} else if (Static587.aBooleanArray26[local116]) {
					Static457.aClass57_11.method7723(local460.x, local460.height, -65536, local460.width, local460.y);
				} else {
					Static457.aClass57_11.method7723(local460.x, local460.height, -16711936, local460.width, local460.y);
				}
			}
		}
		if (Static110.method1580()) {
			Static175.method2573(Static457.aClass57_11);
		}
		if (Static294.aClass230_3.aBoolean472 && Static334.method5071(Static107.anInt1746) && Static455.anInt7798 == 0 && Static341.method5176() == 1 && !local209) {
			local116 = 0;
			for (local120 = 0; local120 < Static449.anInt7746; local120++) {
				if (Static587.aBooleanArray26[local120]) {
					Static587.aBooleanArray26[local120] = false;
					Static291.aRectangleArray1[local116++] = Class13_Sub11.aRectangleArray2[local120];
				}
			}
			try {
				if (Static40.aBoolean61) {
					Static539.method7914(local116, Static291.aRectangleArray1);
				} else {
					Static457.aClass57_11.method7714(Static291.aRectangleArray1, local116);
				}
			} catch (@Pc(679) Exception_Sub1 local679) {
			}
		} else if (!Static288.method4698(Static107.anInt1746)) {
			for (local116 = 0; local116 < Static449.anInt7746; local116++) {
				Static587.aBooleanArray26[local116] = false;
			}
			try {
				if (Static40.aBoolean61) {
					Static75.method1189();
				} else {
					Static457.aClass57_11.method7693();
				}
			} catch (@Pc(603) Exception_Sub1 local603) {
				Static405.method5934(local603.getMessage() + " (Recovered) " + this.method1228(), local603);
				Static565.method8890(0, false);
			}
		}
		Static34.method615();
		local116 = Static637.aClass5_Sub20_31.aClass24_Sub20_1.method6628();
		if (local116 == 0) {
			Static351.method5279(15L);
		} else if (local116 == 1) {
			Static351.method5279(10L);
		} else if (local116 == 2) {
			Static351.method5279(5L);
		} else if (local116 == 3) {
			Static351.method5279(2L);
		}
		if (Static76.aBoolean98) {
			Static108.method1564();
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub8_1.method2669() == 1 && Static107.anInt1746 == 3 && Static390.anInt6669 != -1) {
			Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub8_1);
			Static52.method792();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1249() {
		@Pc(36) int local36;
		if (Static107.anInt1746 == 7 && !Static665.method9171()) {
			if (Static142.anInt2314 > 1) {
				Static142.anInt2314--;
				Static45.anInt10277 = Static261.anInt4525;
			}
			if (!Static526.aBoolean669) {
				Static397.method5811();
			}
			for (local36 = 0; local36 < 100 && Static317.method4807(); local36++) {
			}
		}
		Static315.anInt5591++;
		Static89.method1350(-1, (Class73) null, -1);
		Static530.method7641(-1, -1, (Class73) null);
		Static642.method8951();
		Static261.anInt4525++;
		for (local36 = 0; local36 < Static230.anInt3776; local36++) {
			@Pc(84) Class8_Sub1_Sub3_Sub2_Sub2 local84 = Static85.aClass5_Sub35Array1[local36].aClass8_Sub1_Sub3_Sub2_Sub2_2;
			if (local84 != null) {
				@Pc(90) byte local90 = local84.aClass227_1.aByte90;
				if ((local90 & 0x1) != 0) {
					@Pc(98) int local98 = local84.method5993();
					@Pc(123) int local123;
					if ((local90 & 0x2) != 0 && local84.anInt7050 == 0 && Math.random() * 1000.0D < 10.0D) {
						local123 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(131) int local131 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local123 != 0 || local131 != 0) {
							@Pc(150) int local150 = local84.anIntArray414[0] + local123;
							@Pc(158) int local158 = local84.anIntArray415[0] + local131;
							if (local150 < 0) {
								local150 = 0;
							} else if (local150 > Static544.anInt9261 - local98 - 1) {
								local150 = Static544.anInt9261 - local98 - 1;
							}
							if (local158 < 0) {
								local158 = 0;
							} else if (local158 > Static282.anInt4887 - local98 - 1) {
								local158 = Static282.anInt4887 - local98 - 1;
							}
							@Pc(237) int local237 = Static429.method6353(local84.anIntArray415[0], Static670.aClass88Array1[local84.aByte145], local158, 0, local98, Static196.anIntArray186, local98, -1, Static106.anIntArray93, 0, local150, local98, true, local84.anIntArray414[0]);
							if (local237 > 0) {
								if (local237 > 9) {
									local237 = 9;
								}
								for (@Pc(250) int local250 = 0; local250 < local237; local250++) {
									local84.anIntArray414[local250] = Static106.anIntArray93[local237 - local250 - 1];
									local84.anIntArray415[local250] = Static196.anIntArray186[local237 - local250 - 1];
									local84.aByteArray64[local250] = 1;
								}
								local84.anInt7050 = local237;
							}
						}
					}
					Static412.method6982(local84, true);
					local123 = Static543.method7945(local84);
					Static514.method7496(local84);
					Static90.method1351(Static202.anInt3288, local123, Static317.anInt5609, local84);
					Static28.method7935(local84, Static317.anInt5609);
					Static404.method5927(local84);
				}
			}
		}
		if (!Static665.method9171() && Static222.anInt3623 == 0) {
			if (Static79.anInt1216 == 2) {
				Static324.method8982();
			} else {
				Static159.method2170();
			}
			if (Static532.anInt9189 >> 9 < 14 || Static544.anInt9261 - 14 <= Static532.anInt9189 >> 9 || Static489.anInt8202 >> 9 < 14 || Static282.anInt4887 - 14 <= Static489.anInt8202 >> 9) {
				Static188.method2726((byte) -81);
			}
		}
		while (true) {
			@Pc(398) Class5_Sub3 local398;
			@Pc(403) Class73 local403;
			@Pc(415) Class73 local415;
			do {
				local398 = (Class5_Sub3) Static626.aClass102_74.method1928();
				if (local398 == null) {
					while (true) {
						do {
							local398 = (Class5_Sub3) Static457.aClass102_50.method1928();
							if (local398 == null) {
								while (true) {
									do {
										local398 = (Class5_Sub3) Static118.aClass102_3.method1928();
										if (local398 == null) {
											if (Static370.aClass73_22 != null) {
												Static598.method8618();
											}
											if (Static44.anInt740 % 1500 == 0) {
												Static195.method2804();
											}
											if (Static107.anInt1746 == 7 && !Static665.method9171()) {
												Static217.method3110();
											}
											Static545.method7955();
											if (Static593.aBoolean754 && Static489.aLong249 < Static515.method7499(116) - 60000L) {
												Static553.method8002();
											}
											for (@Pc(617) Class8_Sub8_Sub2 local617 = (Class8_Sub8_Sub2) Static140.aClass98_4.method1777(); local617 != null; local617 = (Class8_Sub8_Sub2) Static140.aClass98_4.method1782()) {
												if ((long) local617.anInt8113 < Static515.method7499(77) / 1000L - 5L) {
													if (local617.aShort98 > 0) {
														Static177.method2584("", local617.aString106 + Static582.aClass335_20.method8349(Static323.anInt5795), "", 0, 5, "");
													}
													if (local617.aShort98 == 0) {
														Static177.method2584("", local617.aString106 + Static582.aClass335_21.method8349(Static323.anInt5795), "", 0, 5, "");
													}
													local617.method8893();
												}
											}
											if (Static107.anInt1746 == 7 && !Static665.method9171()) {
												if (Static492.aClass295_1 == null) {
													Static600.method8644(false);
													return;
												}
												Static453.anInt7762++;
												if (Static453.anInt7762 > 50) {
													@Pc(734) Class5_Sub50 local734 = Static457.method6722(Static70.aClass387_18, Static80.aClass313_1);
													Static494.method7120(local734);
												}
												try {
													Static253.method3720();
													return;
												} catch (@Pc(741) IOException local741) {
													Static600.method8644(false);
													return;
												}
											}
											return;
										}
										local403 = local398.aClass73_1;
										if (local403.anInt1364 < 0) {
											break;
										}
										local415 = Static259.method3831(local403.anInt1410);
									} while (local415 == null || local415.aClass73Array1 == null || local415.aClass73Array1.length <= local403.anInt1364 || local403 != local415.aClass73Array1[local403.anInt1364]);
									Static173.method2520(local398);
								}
							}
							local403 = local398.aClass73_1;
							if (local403.anInt1364 < 0) {
								break;
							}
							local415 = Static259.method3831(local403.anInt1410);
						} while (local415 == null || local415.aClass73Array1 == null || local415.aClass73Array1.length <= local403.anInt1364 || local415.aClass73Array1[local403.anInt1364] != local403);
						Static173.method2520(local398);
					}
				}
				local403 = local398.aClass73_1;
				if (local403.anInt1364 < 0) {
					break;
				}
				local415 = Static259.method3831(local403.anInt1410);
			} while (local415 == null || local415.aClass73Array1 == null || local415.aClass73Array1.length <= local403.anInt1364 || local403 != local415.aClass73Array1[local403.anInt1364]);
			Static173.method2520(local398);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1236()) {
			return;
		}
		Static63.aClass54_4 = new Class54();
		Static63.aClass54_4.anInt869 = Integer.parseInt(this.getParameter("worldid"));
		Static71.aClass54_5 = new Class54();
		Static71.aClass54_5.anInt869 = Integer.parseInt(this.getParameter("lobbyid"));
		Static71.aClass54_5.aString15 = this.getParameter("lobbyaddress");
		Static511.aClass54_23 = new Class54();
		Static511.aClass54_23.anInt869 = Integer.parseInt(this.getParameter("demoid"));
		Static511.aClass54_23.aString15 = this.getParameter("demoaddress");
		Static570.aClass201_10 = Static432.method6403(Integer.parseInt(this.getParameter("modewhere")));
		if (Static116.aClass201_5 == Static570.aClass201_10) {
			Static570.aClass201_10 = Static47.aClass201_1;
		} else if (!Static145.method2055(Static570.aClass201_10) && Static408.aClass201_8 != Static570.aClass201_10) {
			Static570.aClass201_10 = Static408.aClass201_8;
		}
		Static154.aClass249_2 = Static111.method1601(Integer.parseInt(this.getParameter("modewhat")));
		if (Static154.aClass249_2 != Static63.aClass249_1 && Static154.aClass249_2 != Static268.aClass249_3 && Static154.aClass249_2 != Static443.aClass249_4) {
			Static154.aClass249_2 = Static443.aClass249_4;
		}
		try {
			Static323.anInt5795 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(129) Exception local129) {
			Static323.anInt5795 = 0;
		}
		@Pc(137) String local137 = this.getParameter("objecttag");
		if (local137 != null && local137.equals("1")) {
			Static525.aBoolean720 = true;
		} else {
			Static525.aBoolean720 = false;
		}
		@Pc(161) String local161 = this.getParameter("js");
		if (local161 != null && local161.equals("1")) {
			Static301.aBoolean679 = true;
		} else {
			Static301.aBoolean679 = false;
		}
		@Pc(185) String local185 = this.getParameter("advert");
		if (local185 != null && local185.equals("1")) {
			Static586.aBoolean749 = true;
		} else {
			Static586.aBoolean749 = false;
		}
		@Pc(209) String local209 = this.getParameter("game");
		if (local209 != null) {
			if (local209.equals("0")) {
				Static256.aClass333_3 = Static569.aClass333_7;
			} else if (local209.equals("1")) {
				Static256.aClass333_3 = Static521.aClass333_6;
			} else if (local209.equals("2")) {
				Static256.aClass333_3 = Static124.aClass333_1;
			} else if (local209.equals("3")) {
				Static256.aClass333_3 = Static449.aClass333_5;
			}
		}
		try {
			Static456.anInt7813 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(266) Exception local266) {
			Static456.anInt7813 = 0;
		}
		Static575.aString122 = this.getParameter("quiturl");
		Static625.aString132 = this.getParameter("settings");
		if (Static625.aString132 == null) {
			Static625.aString132 = "";
		}
		Static581.aBoolean744 = "1".equals(this.getParameter("under"));
		@Pc(300) String local300 = this.getParameter("country");
		if (local300 != null) {
			try {
				Static650.anInt2312 = Integer.parseInt(local300);
			} catch (@Pc(307) Exception local307) {
				Static650.anInt2312 = 0;
			}
		}
		Static530.anInt8943 = Integer.parseInt(this.getParameter("colourid"));
		if (Static530.anInt8943 < 0 || Static134.aColorArray2.length <= Static530.anInt8943) {
			Static530.anInt8943 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static402.aBoolean531 = true;
			Static510.aBoolean660 = true;
		}
		@Pc(355) String local355 = this.getParameter("frombilling");
		if (local355 != null && local355.equals("true")) {
			Static287.aBoolean389 = true;
		}
		@Pc(375) String local375 = this.getParameter("sskey");
		if (local375 != null) {
			Static672.aByteArray113 = Static114.method1635(Static46.method754(local375));
			if (Static672.aByteArray113.length < 16) {
				Static672.aByteArray113 = null;
			}
		}
		@Pc(399) String local399 = this.getParameter("force64mb");
		if (local399 != null && local399.equals("true")) {
			Static105.aBoolean165 = true;
		}
		@Pc(419) String local419 = this.getParameter("worldflags");
		if (local419 != null) {
			try {
				Static74.anInt1194 = Integer.parseInt(local419);
			} catch (@Pc(426) Exception local426) {
			}
		}
		@Pc(433) String local433 = this.getParameter("userFlow");
		if (local433 != null) {
			try {
				Static294.aLong158 = Long.parseLong(local433);
			} catch (@Pc(441) NumberFormatException local441) {
			}
		}
		Static461.aString125 = this.getParameter("additionalInfo");
		if (Static461.aString125 != null && Static461.aString125.length() > 50) {
			Static461.aString125 = null;
		}
		if (Static256.aClass333_3 == Static569.aClass333_7) {
			Static47.anInt794 = 503;
			Static264.anInt4559 = 765;
		} else if (Static521.aClass333_6 == Static256.aClass333_3) {
			Static47.anInt794 = 480;
			Static264.anInt4559 = 640;
		}
		Static454.aClient1 = this;
		this.method1240(Static154.aClass249_2.method5772() + 32, Static47.anInt794, Static256.aClass333_3.aString123, Static264.anInt4559);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1253(@OriginalArg(0) int arg0) {
		Static410.aClass65_1.anInt1149 = arg0;
		Static410.aClass65_1.anInt1148++;
		Static613.aClass170_2 = null;
		Static440.aClass366_6 = null;
		Static62.anInt973 = 0;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	@Override
	protected void method1233() {
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != 2) {
			this.method1248();
			return;
		}
		try {
			this.method1248();
		} catch (@Pc(29) ThreadDeath local29) {
			throw local29;
		} catch (@Pc(32) Throwable local32) {
			Static405.method5934(local32.getMessage() + " (Recovered) " + this.method1228(), local32);
			Static404.aBoolean532 = true;
			Static565.method8890(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1235() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1226() {
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != 2) {
			this.method1258(-88);
			return;
		}
		try {
			this.method1258(-124);
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static405.method5934(local24.getMessage() + " (Recovered) " + this.method1228(), local24);
			Static404.aBoolean532 = true;
			Static565.method8890(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1258(@OriginalArg(0) int arg0) {
		if (Static107.anInt1746 == 14) {
			return;
		}
		Static44.anInt740++;
		if (Static44.anInt740 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static451.anInt7755 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static297.aRandom1.setSeed((long) Static451.anInt7755);
		}
		if (Static44.anInt740 % 50 == 0) {
			Static35.anInt9308 = Static446.anInt7690;
			Static373.anInt6401 = Static200.anInt3241;
			Static446.anInt7690 = 0;
			Static200.anInt3241 = 0;
		}
		this.method1245();
		if (Static33.aClass331_1 != null) {
			Static33.aClass331_1.method8151();
		}
		Static442.method6548();
		Static602.method8657();
		Static258.aClass89_1.method1614();
		Static205.aClass107_1.method4076();
		if (Static457.aClass57_11 != null) {
			Static457.aClass57_11.method7660((int) Static515.method7499(92));
		}
		Static580.method8319();
		Static643.anInt10457 = 0;
		Static357.anInt6272 = 0;
		for (@Pc(103) Interface12 local103 = Static258.aClass89_1.method1620(); local103 != null; local103 = Static258.aClass89_1.method1620()) {
			@Pc(111) int local111 = local103.method6715();
			if (local111 == 2 || local111 == 3) {
				@Pc(125) char local125 = local103.method6714();
				if (Static389.method5665() && (local125 == '`' || local125 == '§' || local125 == '²')) {
					if (Static110.method1580()) {
						Static422.method6308();
					} else {
						Static89.method1349();
					}
				} else if (Static643.anInt10457 < 128) {
					Static538.anInterface12Array2[Static643.anInt10457] = local103;
					Static643.anInt10457++;
				}
			} else if (local111 == 0 && Static357.anInt6272 < 75) {
				Static475.anInterface12Array1[Static357.anInt6272] = local103;
				Static357.anInt6272++;
			}
		}
		Static659.anInt10600 = 0;
		for (@Pc(223) Class5_Sub6 local223 = Static205.aClass107_1.method4073(); local223 != null; local223 = Static205.aClass107_1.method4073()) {
			@Pc(231) int local231 = local223.method5806();
			if (local231 == -1) {
				Static135.aClass102_16.method1921(local223);
			} else if (local231 == 6) {
				Static659.anInt10600 += local223.method5808();
			} else if (Static51.method787(local231)) {
				Static536.aClass102_65.method1921(local223);
				if (Static536.aClass102_65.method1927() > 10) {
					Static536.aClass102_65.method1928();
				}
			}
		}
		if (arg0 > -65) {
			Static81.aString20 = null;
		}
		if (Static110.method1580()) {
			Static115.method1643();
		}
		if (Static288.method4698(Static107.anInt1746)) {
			Static175.method2571();
			Static442.method6547(125);
		} else if (Static103.method1468(Static107.anInt1746)) {
			Static44.method711();
		}
		if (Static165.method2306(Static107.anInt1746) && !Static103.method1468(Static107.anInt1746)) {
			this.method1249();
			Static337.method5134();
			Static323.method4944();
		} else if (Static416.method8829(Static107.anInt1746) && !Static103.method1468(Static107.anInt1746)) {
			this.method1249();
			Static323.method4944();
		} else if (Static107.anInt1746 == 12) {
			Static323.method4944();
		} else if (Static70.method1121(Static107.anInt1746) && !Static103.method1468(Static107.anInt1746)) {
			Static107.method1555();
		} else if (Static107.anInt1746 == 13) {
			Static323.method4944();
			if (Static313.anInt5550 != -3 && Static313.anInt5550 != 2 && Static313.anInt5550 != 15) {
				Static600.method8644(false);
			}
		}
		Static559.method8097(Static457.aClass57_11);
		Static536.aClass102_65.method1928();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1228() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static622.anInt10188 + "," + Static668.anInt10683 + "," + Static544.anInt9261 + "," + Static282.anInt4887 + "|";
			if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 != null) {
				local7 = local7 + "2)" + Static240.anInt3974 + "," + (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] + Static622.anInt10188) + "," + (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] + Static668.anInt10683) + "|";
			}
			local7 = local7 + "3)" + Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() + "|4)" + Static637.aClass5_Sub20_31.aClass24_Sub11_2.method3217() + "|5)" + Static341.method5176() + "|6)" + Static70.anInt1125 + "," + Static631.anInt10283 + "|";
			local7 = local7 + "7)" + Static637.aClass5_Sub20_31.aClass24_Sub5_1.method2086() + "|";
			local7 = local7 + "8)" + Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674() + "|";
			local7 = local7 + "9)" + Static637.aClass5_Sub20_31.aClass24_Sub28_1.method8607() + "|";
			local7 = local7 + "10)" + Static637.aClass5_Sub20_31.aClass24_Sub3_1.method1558() + "|";
			local7 = local7 + "11)" + Static637.aClass5_Sub20_31.aClass24_Sub14_1.method5150() + "|";
			local7 = local7 + "12)" + Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() + "|";
			local7 = local7 + "13)" + Static329.anInt5875 + "|";
			local7 = local7 + "14)" + Static107.anInt1746;
			if (Static528.aClass5_Sub19_1 != null) {
				local7 = local7 + "|15)" + Static528.aClass5_Sub19_1.anInt3442;
			}
			try {
				if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 2) {
					@Pc(281) Class local281 = Class.forName("java.lang.ClassLoader");
					@Pc(287) Field local287 = local281.getDeclaredField("nativeLibraries");
					@Pc(292) Class local292 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(304) Method local304 = local292.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local304.invoke(local287, Boolean.TRUE);
					@Pc(330) Vector local330 = (Vector) local287.get((Static81.aClass5 == null ? (Static81.aClass5 = a("client")) : Static81.aClass5).getClassLoader());
					for (@Pc(332) int local332 = 0; local332 < local330.size(); local332++) {
						try {
							@Pc(338) Object local338 = local330.elementAt(local332);
							@Pc(345) Field local345 = local338.getClass().getDeclaredField("name");
							local304.invoke(local345, Boolean.TRUE);
							try {
								@Pc(360) String local360 = (String) local345.get(local338);
								if (local360 != null && local360.indexOf("sw3d.dll") != -1) {
									@Pc(379) Field local379 = local338.getClass().getDeclaredField("handle");
									local304.invoke(local379, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local379.getLong(local338));
									local304.invoke(local379, Boolean.FALSE);
								}
							} catch (@Pc(417) Throwable local417) {
							}
							local304.invoke(local345, Boolean.FALSE);
						} catch (@Pc(429) Throwable local429) {
						}
					}
				}
			} catch (@Pc(439) Throwable local439) {
			}
			local7 = local7 + "]";
		} catch (@Pc(450) Throwable local450) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	public synchronized void method1239() {
		if (Static492.anApplet2 != null && Static24.aCanvas1 == null && !Static294.aClass230_3.aBoolean472) {
			try {
				@Pc(17) Class local17 = Static492.anApplet2.getClass();
				@Pc(23) Field local23 = local17.getDeclaredField("canvas");
				Static24.aCanvas1 = (Canvas) local23.get(Static492.anApplet2);
				local23.set(Static492.anApplet2, (Object) null);
				if (Static24.aCanvas1 != null) {
					return;
				}
			} catch (@Pc(37) Exception local37) {
			}
		}
		super.method1239();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1259() {
		if (Static463.anInt7893 < Static410.aClass65_1.anInt1148) {
			Static197.aClass54_35.method825();
			Static13.anInt247 = 5 * 50 * (Static410.aClass65_1.anInt1148 - 1);
			if (Static13.anInt247 > 3000) {
				Static13.anInt247 = 3000;
			}
			if (Static410.aClass65_1.anInt1148 >= 2 && Static410.aClass65_1.anInt1149 == 6) {
				this.method1238("js5connect_outofdate");
				Static107.anInt1746 = 14;
				return;
			}
			if (Static410.aClass65_1.anInt1148 >= 4 && Static410.aClass65_1.anInt1149 == -1) {
				this.method1238("js5crc");
				Static107.anInt1746 = 14;
				return;
			}
			if (Static410.aClass65_1.anInt1148 >= 4 && Static288.method4698(Static107.anInt1746)) {
				if (Static410.aClass65_1.anInt1149 == 7 || Static410.aClass65_1.anInt1149 == 9) {
					this.method1238("js5connect_full");
				} else if (Static410.aClass65_1.anInt1149 <= 0) {
					this.method1238("js5io");
				} else if (Static86.aString26 == null) {
					this.method1238("js5connect");
				} else {
					this.method1238("js5proxy_" + Static86.aString26.trim());
				}
				Static107.anInt1746 = 14;
				return;
			}
		}
		Static463.anInt7893 = Static410.aClass65_1.anInt1148;
		if (Static13.anInt247 > 0) {
			Static13.anInt247--;
			return;
		}
		try {
			if (Static62.anInt973 == 0) {
				Static440.aClass366_6 = Static197.aClass54_35.method826(Static294.aClass230_3);
				Static62.anInt973++;
			}
			if (Static62.anInt973 == 1) {
				if (Static440.aClass366_6.anInt10206 == 2) {
					if (Static440.aClass366_6.anObject18 != null) {
						Static86.aString26 = (String) Static440.aClass366_6.anObject18;
					}
					this.method1253(1000);
					return;
				}
				if (Static440.aClass366_6.anInt10206 == 1) {
					Static62.anInt973++;
				}
			}
			if (Static62.anInt973 == 2) {
				Static613.aClass170_2 = new Class170((Socket) Static440.aClass366_6.anObject18, Static294.aClass230_3, 25000);
				@Pc(249) Class5_Sub23 local249 = new Class5_Sub23(5);
				local249.method8502(Static157.aClass45_2.anInt829);
				local249.method8486(652);
				Static613.aClass170_2.method3641(local249.aByteArray102, 5);
				Static62.anInt973++;
				Static66.aLong32 = Static515.method7499(79);
			}
			if (Static62.anInt973 == 3) {
				if (Static288.method4698(Static107.anInt1746) || Static613.aClass170_2.method3640() > 0) {
					@Pc(313) int local313 = Static613.aClass170_2.method3638();
					if (local313 != 0) {
						this.method1253(local313);
						return;
					}
					Static62.anInt973++;
				} else if (Static515.method7499(113) - Static66.aLong32 > 30000L) {
					this.method1253(1001);
					return;
				}
			}
			if (Static62.anInt973 == 4) {
				@Pc(351) boolean local351 = Static288.method4698(Static107.anInt1746) || Static165.method2306(Static107.anInt1746) || Static416.method8829(Static107.anInt1746);
				@Pc(354) Class347[] local354 = Static601.method8650();
				@Pc(362) Class5_Sub23 local362 = new Class5_Sub23(local354.length * 4);
				Static613.aClass170_2.method3642(local362.aByteArray102, local362.aByteArray102.length, 0);
				for (@Pc(373) int local373 = 0; local373 < local354.length; local373++) {
					local354[local373].method8648(local362.method8527());
				}
				Static410.aClass65_1.method1134(Static613.aClass170_2, !local351);
				Static62.anInt973 = 0;
				Static440.aClass366_6 = null;
				Static613.aClass170_2 = null;
			}
		} catch (@Pc(416) IOException local416) {
			this.method1253(1002);
		}
	}
}
