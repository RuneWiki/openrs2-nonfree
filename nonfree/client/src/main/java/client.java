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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static188.method3247("argument count");
			}
			Static308.anInt5182 = Integer.parseInt(arg0[0]);
			Static141.aClass117_7 = Static350.aClass117_9;
			if (arg0[1].equals("live")) {
				Static196.aClass89_2 = Static260.aClass89_3;
			} else if (arg0[1].equals("rc")) {
				Static196.aClass89_2 = Static282.aClass89_4;
			} else if (arg0[1].equals("wip")) {
				Static196.aClass89_2 = Static311.aClass89_5;
			} else {
				Static188.method3247("modewhat");
			}
			Static107.anInt2498 = Static356.method5234(arg0[2]);
			if (Static107.anInt2498 == -1) {
				if (arg0[2].equals("english")) {
					Static107.anInt2498 = 0;
				} else if (arg0[2].equals("german")) {
					Static107.anInt2498 = 1;
				} else {
					Static188.method3247("language");
				}
			}
			Static130.aBoolean205 = false;
			Static217.aBoolean297 = false;
			if (arg0[3].equals("game0")) {
				Static275.aClass150_3 = Static195.aClass150_2;
			} else if (arg0[3].equals("game1")) {
				Static275.aClass150_3 = Static119.aClass150_1;
			} else {
				Static188.method3247("game");
			}
			Static34.anInt731 = Static275.aClass150_3.anInt3682;
			Static104.anInt2158 = 0;
			Static388.aBoolean470 = true;
			Static330.aBoolean414 = true;
			Static16.anInt383 = 0;
			Static9.aString6 = "";
			@Pc(129) client local129 = new client();
			Static387.aClient1 = local129;
			local129.method764(Static275.aClass150_3.aString43, Static196.aClass89_2.method2470() + 32);
			Static8.aFrame1.setLocation(40, 40);
		} catch (@Pc(152) Exception local152) {
			Static142.method2676(local152, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method771(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub16 local10 = new Class2_Sub16(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(14) int local14 = local10.method5350();
					if (local14 == 0) {
						return;
					}
					if (local14 == 1) {
						@Pc(98) int[] local98 = Static48.anIntArray200 = new int[6];
						local98[0] = local10.method5312();
						local98[1] = local10.method5312();
						local98[2] = local10.method5312();
						local98[3] = local10.method5312();
						local98[4] = local10.method5312();
						local98[5] = local10.method5312();
					} else {
						@Pc(33) int local33;
						@Pc(28) int local28;
						if (local14 == 4) {
							local28 = local10.method5350();
							Static145.anIntArray1070 = new int[local28];
							for (local33 = 0; local33 < local28; local33++) {
								Static145.anIntArray1070[local33] = local10.method5312();
								if (Static145.anIntArray1070[local33] == 65535) {
									Static145.anIntArray1070[local33] = -1;
								}
							}
						} else if (local14 == 5) {
							local28 = local10.method5350();
							Static184.anIntArray666 = new int[local28];
							for (local33 = 0; local33 < local28; local33++) {
								Static184.anIntArray666[local33] = local10.method5312();
								if (Static184.anIntArray666[local33] == 65535) {
									Static184.anIntArray666[local33] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method767() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method762() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static275.method4182();
		Static91.aClass151_2 = new Class151(Static359.aClass111_5);
		Static333.aClass106_2 = new Class106();
		if (Static17.aClass117_1 != Static141.aClass117_7) {
			Static168.aByteArrayArray6 = new byte[50][];
		}
		Static117.method2425(Static359.aClass111_5);
		if (Static17.aClass117_1 == Static141.aClass117_7) {
			Static301.aString58 = this.getCodeBase().getHost();
			Static379.anInt6374 = 43594;
			Static218.anInt4547 = 443;
		} else if (Static16.method311(Static141.aClass117_7)) {
			Static301.aString58 = this.getCodeBase().getHost();
			Static379.anInt6374 = Static308.anInt5182 + 40000;
			Static218.anInt4547 = Static308.anInt5182 + 50000;
		} else if (Static141.aClass117_7 == Static350.aClass117_9) {
			Static218.anInt4547 = Static308.anInt5182 + 50000;
			Static379.anInt6374 = Static308.anInt5182 + 40000;
			Static301.aString58 = "127.0.0.1";
		}
		Static61.aString15 = Static301.aString58;
		Static225.anInt4017 = Static379.anInt6374;
		Static41.anInt831 = Static218.anInt4547;
		Static255.anInt4505 = Static379.anInt6374;
		Static66.aShortArray13 = Static205.aShortArray67 = Static15.aShortArray1 = Static198.aShortArray66 = new short[256];
		if (Static275.aClass150_3 == Static119.aClass150_1) {
			Static161.anInt3121 = 0;
			Static283.aShortArrayArray7 = Static221.aShortArrayArray8;
			Static158.aShortArrayArray3 = Static187.aShortArrayArray5;
			Static216.aShortArray69 = Static58.aShortArray6;
			Static110.anInt2329 = 16777215;
			Static250.aBoolean335 = true;
			Static325.aShortArray104 = Static216.aShortArray68;
		} else {
			Static325.aShortArray104 = Static140.aShortArray42;
			Static158.aShortArrayArray3 = Static208.aShortArrayArray6;
			Static216.aShortArray69 = Static191.aShortArray65;
			Static283.aShortArrayArray7 = Static359.aShortArrayArray9;
		}
		Static167.anInt5329 = Static225.anInt4017;
		if (Static152.anInt2983 == 3) {
			Static347.anInt5864 = Static308.anInt5182;
		}
		Static48.aClass69_1 = Static57.method3257(Static257.aCanvas4);
		Static311.aClass129_1 = Static315.method4661(Static257.aCanvas4);
		Static31.aClass167_1 = Static139.method2652();
		if (Static31.aClass167_1 != null) {
			Static31.aClass167_1.method5462(Static257.aCanvas4);
		}
		Static293.anInt6495 = Static152.anInt2983;
		try {
			if (Static359.aClass111_5.aClass25_3 != null) {
				Static226.aClass128_6 = new Class128(Static359.aClass111_5.aClass25_3, 5200, 0);
				for (@Pc(168) int local168 = 0; local168 < 29; local168++) {
					Static294.aClass128Array1[local168] = new Class128(Static359.aClass111_5.aClass25Array1[local168], 6000, 0);
				}
				Static216.aClass128_1 = new Class128(Static359.aClass111_5.aClass25_2, 6000, 0);
				Static81.aClass197_1 = new Class197(255, Static226.aClass128_6, Static216.aClass128_1, 500000);
				Static266.aClass128_3 = new Class128(Static359.aClass111_5.aClass25_1, 24, 0);
				Static359.aClass111_5.aClass25Array1 = null;
				Static359.aClass111_5.aClass25_2 = null;
				Static359.aClass111_5.aClass25_1 = null;
				Static359.aClass111_5.aClass25_3 = null;
			}
		} catch (@Pc(224) IOException local224) {
			Static266.aClass128_3 = null;
			Static81.aClass197_1 = null;
			Static226.aClass128_6 = null;
			Static216.aClass128_1 = null;
		}
		if (Static141.aClass117_7 != Static17.aClass117_1) {
			Static379.aBoolean456 = true;
		}
		Static72.aString54 = (Static275.aClass150_3 == Static195.aClass150_2 ? Static309.aClass32_83 : Static34.aClass32_17).method701(Static107.anInt2498);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method776() {
		@Pc(5) int local5;
		if (!Static214.aBoolean294) {
			for (local5 = 0; local5 < Static184.anInt3459; local5++) {
				if (Static360.aClass162Array1[local5].method4033() == 's' || Static360.aClass162Array1[local5].method4033() == 'S') {
					Static214.aBoolean294 = true;
					break;
				}
			}
		}
		@Pc(53) int local53;
		if (Static33.anInt695 == 0) {
			@Pc(43) Runtime local43 = Runtime.getRuntime();
			local53 = (int) ((local43.totalMemory() - local43.freeMemory()) / 1024L);
			@Pc(56) long local56 = Static39.method699();
			if (Static161.aLong105 == 0L) {
				Static161.aLong105 = local56;
			}
			if (local53 > 16384 && local56 - Static161.aLong105 < 5000L) {
				if (local56 - Static4.aLong6 > 1000L) {
					System.gc();
					Static4.aLong6 = local56;
				}
				Static243.aString50 = Static381.aClass32_101.method701(Static107.anInt2498);
				Static30.anInt644 = 5;
			} else {
				Static243.aString50 = Static192.aClass32_49.method701(Static107.anInt2498);
				Static33.anInt695 = 10;
				Static30.anInt644 = 5;
			}
		} else if (Static33.anInt695 == 10) {
			for (local5 = 0; local5 < 4; local5++) {
				Static58.aClass188Array1[local5] = Static372.method5458(Static246.anInt4374, Static185.anInt3485);
			}
			Static243.aString50 = Static254.aClass32_64.method701(Static107.anInt2498);
			Static30.anInt644 = 10;
			Static33.anInt695 = 20;
		} else if (Static33.anInt695 == 20) {
			if (Static59.aClass233_1 == null) {
				Static59.aClass233_1 = new Class233(Static333.aClass106_2, Static91.aClass151_2);
			}
			if (Static59.aClass233_1.method5203()) {
				Static347.aClass171_93 = Static104.method2186(false, true, 0);
				Static137.aClass171_75 = Static104.method2186(false, true, 1);
				Static29.aClass171_10 = Static104.method2186(false, true, 2);
				Static86.aClass171_30 = Static104.method2186(false, true, 3);
				Static329.aClass171_85 = Static104.method2186(false, true, 4);
				Static200.aClass171_51 = Static104.method2186(true, true, 5);
				Static233.aClass171_53 = Static104.method2186(true, false, 6);
				Static237.aClass171_58 = Static104.method2186(false, true, 7);
				Static263.aClass171_64 = Static104.method2186(false, true, 8);
				Static357.aClass171_69 = Static104.method2186(false, true, 9);
				Static138.aClass171_15 = Static104.method2186(false, true, 10);
				Static165.aClass171_41 = Static104.method2186(false, true, 11);
				Static305.aClass171_80 = Static104.method2186(false, true, 12);
				Static120.aClass171_35 = Static104.method2186(false, true, 13);
				Static49.aClass171_17 = Static104.method2186(false, false, 14);
				Static187.aClass171_47 = Static104.method2186(false, true, 15);
				Static308.aClass171_81 = Static104.method2186(false, true, 16);
				Static135.aClass171_46 = Static104.method2186(false, true, 17);
				Static275.aClass171_74 = Static104.method2186(false, true, 18);
				Static81.aClass171_29 = Static104.method2186(false, true, 19);
				Static41.aClass171_13 = Static104.method2186(false, true, 20);
				Static201.aClass171_52 = Static104.method2186(false, true, 21);
				Static320.aClass171_82 = Static104.method2186(false, true, 22);
				Static67.aClass171_25 = Static104.method2186(true, true, 23);
				Static356.aClass171_94 = Static104.method2186(false, true, 24);
				Static93.aClass171_31 = Static104.method2186(false, true, 25);
				Static110.aClass171_34 = Static104.method2186(true, true, 26);
				Static246.aClass171_61 = Static104.method2186(false, true, 27);
				Static21.aClass171_6 = Static104.method2186(true, true, 28);
				Static243.aString50 = Static369.aClass32_97.method701(Static107.anInt2498);
				Static30.anInt644 = 15;
				Static33.anInt695 = 30;
			} else {
				Static243.aString50 = Static303.aClass32_81.method701(Static107.anInt2498);
				Static30.anInt644 = 12;
			}
		} else if (Static33.anInt695 == 30) {
			local5 = 0;
			for (local53 = 0; local53 < 29; local53++) {
				local5 += Static105.aClass16_Sub1Array1[local53].method4722() * Static150.anIntArray605[local53] / 100;
			}
			if (local5 == 100) {
				Static243.aString50 = Static106.aClass32_35.method701(Static107.anInt2498);
				Static30.anInt644 = 20;
				Static67.method1059(Static263.aClass171_64);
				Static162.method2889(Static263.aClass171_64);
				Static33.anInt695 = 40;
			} else {
				if (local5 != 0) {
					Static243.aString50 = Static60.aClass32_22.method701(Static107.anInt2498) + local5 + "%";
				}
				Static30.anInt644 = 20;
			}
		} else if (Static33.anInt695 == 40) {
			if (Static21.aClass171_6.method3749()) {
				this.method771(Static21.aClass171_6.method3762(1));
				Static243.aString50 = Static329.aClass32_89.method701(Static107.anInt2498);
				Static30.anInt644 = 25;
				Static33.anInt695 = 50;
			} else {
				Static243.aString50 = Static45.aClass32_18.method701(Static107.anInt2498) + Static21.aClass171_6.method3741() + "%";
				Static30.anInt644 = 25;
			}
		} else if (Static33.anInt695 == 50) {
			Static9.method195(Static343.aBoolean422);
			Static389.aClass2_Sub2_Sub4_43 = new Class2_Sub2_Sub4();
			Static389.aClass2_Sub2_Sub4_43.method5276();
			Static269.aClass85_2 = Static296.method4433(Static359.aClass111_5, Static257.aCanvas4, 22050, 0);
			Static269.aClass85_2.method4226(Static389.aClass2_Sub2_Sub4_43);
			Static85.method1521(Static329.aClass171_85, Static389.aClass2_Sub2_Sub4_43, Static187.aClass171_47, Static49.aClass171_17);
			Static156.aClass85_1 = Static296.method4433(Static359.aClass111_5, Static257.aCanvas4, 2048, 1);
			Static324.aClass2_Sub2_Sub1_2 = new Class2_Sub2_Sub1();
			Static156.aClass85_1.method4226(Static324.aClass2_Sub2_Sub1_2);
			Static123.aClass223_1 = new Class223(22050, Static42.anInt4820);
			Static145.anInt5377 = Static233.aClass171_53.method3769("scape main");
			Static243.aString50 = Static75.aClass32_25.method701(Static107.anInt2498);
			Static33.anInt695 = 60;
			Static30.anInt644 = 30;
		} else if (Static33.anInt695 == 60) {
			local5 = Static235.method3812(Static120.aClass171_35, Static263.aClass171_64);
			local53 = Static37.method679();
			if (local5 < local53) {
				Static243.aString50 = Static209.aClass32_55.method701(Static107.anInt2498) + local5 * 100 / local53 + "%";
				Static30.anInt644 = 35;
			} else {
				Static243.aString50 = Static276.aClass32_74.method701(Static107.anInt2498);
				Static33.anInt695 = 70;
				Static30.anInt644 = 35;
			}
		} else if (Static33.anInt695 == 70) {
			local5 = Static330.method4879(Static263.aClass171_64);
			local53 = Static128.method2524();
			if (local5 < local53) {
				Static243.aString50 = Static75.aClass32_26.method701(Static107.anInt2498) + local5 * 100 / local53 + "%";
				Static30.anInt644 = 40;
			} else {
				Static243.aString50 = Static237.aClass32_60.method701(Static107.anInt2498);
				Static30.anInt644 = 40;
				Static33.anInt695 = 80;
			}
		} else if (Static33.anInt695 == 80) {
			if (Static110.aClass171_34.method3749()) {
				Static329.anInterface9_6 = new Class6(Static110.aClass171_34, Static357.aClass171_69, Static263.aClass171_64);
				Static243.aString50 = Static205.aClass32_53.method701(Static107.anInt2498);
				Static33.anInt695 = 90;
				Static30.anInt644 = 45;
			} else {
				Static243.aString50 = Static355.aClass32_94.method701(Static107.anInt2498) + Static110.aClass171_34.method3741() + "%";
				Static30.anInt644 = 45;
			}
		} else if (Static33.anInt695 == 90) {
			Static243.aString50 = Static2.aClass32_1.method701(Static107.anInt2498);
			Static33.anInt695 = 95;
			Static30.anInt644 = 50;
		} else if (Static33.anInt695 == 95) {
			if (Static214.aBoolean294) {
				Static213.anInt3866 = 1;
				Static131.anInt2686 = 0;
				Static81.anInt1473 = 0;
				Static132.anInt2709 = 0;
				Static182.anInt3879 = 0;
			}
			Static214.aBoolean294 = true;
			Static164.method2916(Static359.aClass111_5);
			Static23.method417(false, Static182.anInt3879);
			Static243.aString50 = Static104.aClass32_34.method701(Static107.anInt2498);
			Static30.anInt644 = 55;
			Static33.anInt695 = 100;
		} else if (Static33.anInt695 == 100) {
			Static54.method3529(Static111.aClass63_3, Static263.aClass171_64, Static120.aClass171_35);
			Static243.aString50 = Static109.aClass32_36.method701(Static107.anInt2498);
			Static30.anInt644 = 60;
			Static104.method2180(5);
			Static33.anInt695 = 110;
		} else if (Static33.anInt695 == 110) {
			Static29.aClass171_10.method3749();
			local5 = Static29.aClass171_10.method3741();
			Static308.aClass171_81.method3749();
			local5 += Static308.aClass171_81.method3741();
			Static135.aClass171_46.method3749();
			local5 += Static135.aClass171_46.method3741();
			Static275.aClass171_74.method3749();
			local5 += Static275.aClass171_74.method3741();
			Static81.aClass171_29.method3749();
			local5 += Static81.aClass171_29.method3741();
			Static41.aClass171_13.method3749();
			local5 += Static41.aClass171_13.method3741();
			Static201.aClass171_52.method3749();
			local5 += Static201.aClass171_52.method3741();
			Static320.aClass171_82.method3749();
			local5 += Static320.aClass171_82.method3741();
			Static356.aClass171_94.method3749();
			local5 += Static356.aClass171_94.method3741();
			Static93.aClass171_31.method3749();
			local5 += Static93.aClass171_31.method3741();
			Static246.aClass171_61.method3749();
			local5 += Static246.aClass171_61.method3741();
			if (local5 < 1100) {
				Static243.aString50 = Static155.aClass32_41.method701(Static107.anInt2498) + local5 / 11 + "%";
				Static30.anInt644 = 65;
			} else {
				Static261.aClass125_2 = new Class125(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static46.aClass139_1 = new Class139(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static332.aClass210_1 = new Class210(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10, Static263.aClass171_64);
				Static289.aClass235_1 = new Class235(Static275.aClass150_3, Static107.anInt2498, Static135.aClass171_46);
				Static13.aClass5_1 = new Class5(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static35.aClass47_1 = new Class47(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static192.aClass196_1 = new Class196(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10, Static237.aClass171_58);
				Static345.aClass180_2 = new Class180(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static363.aClass228_1 = new Class228(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static221.aClass118_6 = new Class118(Static275.aClass150_3, Static107.anInt2498, true, Static308.aClass171_81, Static237.aClass171_58);
				Static158.aClass226_1 = new Class226(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10, Static263.aClass171_64);
				Static304.aClass206_122 = new Class206(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10, Static263.aClass171_64);
				Static356.aClass48_2 = new Class48(Static275.aClass150_3, Static107.anInt2498, true, Static275.aClass171_74, Static237.aClass171_58);
				Static15.aClass81_1 = new Class81(Static275.aClass150_3, Static107.anInt2498, true, Static261.aClass125_2, Static81.aClass171_29, Static237.aClass171_58);
				Static27.aClass51_1 = new Class51(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static36.aClass236_1 = new Class236(Static275.aClass150_3, Static107.anInt2498, Static41.aClass171_13, Static347.aClass171_93, Static137.aClass171_75);
				Static341.aClass225_1 = new Class225(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static106.aClass98_1 = new Class98(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static149.aClass173_5 = new Class173(Static275.aClass150_3, Static107.anInt2498, Static201.aClass171_52, Static237.aClass171_58);
				Static170.aClass149_1 = new Class149(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static36.aClass14_1 = new Class14(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static355.aClass190_1 = new Class190(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static341.aClass36_1 = new Class36(Static275.aClass150_3, Static107.anInt2498, Static320.aClass171_82);
				Static215.aClass114_1 = new Class114(Static275.aClass150_3, Static107.anInt2498, Static29.aClass171_10);
				Static105.method2210(Static86.aClass171_30, Static120.aClass171_35, Static263.aClass171_64, Static237.aClass171_58);
				Static57.method3258(new Class70(), Static93.aClass171_31, Static356.aClass171_94);
				Static384.method5621(Static93.aClass171_31, Static356.aClass171_94);
				Static243.aString50 = Static252.aClass32_63.method701(Static107.anInt2498);
				Static30.anInt644 = 65;
				Static203.method3448();
				Static221.aClass118_6.method2854(!Static231.method3740());
				Static321.aClass211_1 = new Class211();
				Static360.method5257();
				Static33.anInt695 = 120;
			}
		} else if (Static33.anInt695 == 120) {
			local5 = Static215.method3584(Static263.aClass171_64);
			local53 = Static174.method3095();
			if (local5 < local53) {
				Static243.aString50 = Static316.aClass32_85.method701(Static107.anInt2498) + local5 * 100 / local53 + "%";
				Static30.anInt644 = 70;
			} else {
				Static125.method2503(Static111.aClass63_3, Static263.aClass171_64);
				Static212.method3555(Static63.aClass18Array3);
				Static243.aString50 = Static186.aClass32_46.method701(Static107.anInt2498);
				Static30.anInt644 = 70;
				Static33.anInt695 = 130;
			}
		} else if (Static33.anInt695 == 130) {
			Static243.aString50 = Static341.aClass32_90.method701(Static107.anInt2498);
			Static33.anInt695 = 140;
			Static30.anInt644 = 75;
		} else if (Static33.anInt695 == 140) {
			if (Static138.aClass171_15.method3759("huffman", "")) {
				@Pc(1267) Class42 local1267 = new Class42(Static138.aClass171_15.method3738("", "huffman"));
				Static127.method2518(local1267);
				Static243.aString50 = Static19.aClass32_6.method701(Static107.anInt2498);
				Static30.anInt644 = 80;
				Static33.anInt695 = 150;
			} else {
				Static243.aString50 = Static237.aClass32_59.method701(Static107.anInt2498) + "0%";
				Static30.anInt644 = 80;
			}
		} else if (Static33.anInt695 == 150) {
			if (!Static86.aClass171_30.method3749()) {
				Static243.aString50 = Static269.aClass32_71.method701(Static107.anInt2498) + Static86.aClass171_30.method3741() * 3 / 4 + "%";
				Static30.anInt644 = 85;
			} else if (!Static305.aClass171_80.method3749()) {
				Static243.aString50 = Static269.aClass32_71.method701(Static107.anInt2498) + (Static305.aClass171_80.method3741() / 10 + 75) + "%";
				Static30.anInt644 = 85;
			} else if (!Static120.aClass171_35.method3749()) {
				Static243.aString50 = Static269.aClass32_71.method701(Static107.anInt2498) + (Static120.aClass171_35.method3741() / 20 + 85) + "%";
				Static30.anInt644 = 85;
			} else if (Static67.aClass171_25.method3752("details")) {
				Static338.method3045(Static67.aClass171_25, Static13.aClass5_1, Static35.aClass47_1, Static221.aClass118_6, Static158.aClass226_1, Static304.aClass206_122, Static321.aClass211_1);
				Static168.method2963(Static246.aClass171_61);
				Static356.method5232(Static329.anInterface9_6, Static237.aClass171_58);
				Static243.aString50 = Static100.aClass32_33.method701(Static107.anInt2498);
				Static33.anInt695 = 160;
				Static30.anInt644 = 85;
			} else {
				Static243.aString50 = Static269.aClass32_71.method701(Static107.anInt2498) + (Static67.aClass171_25.method3737("details") / 10 + 90) + "%";
				Static30.anInt644 = 85;
			}
		} else if (Static33.anInt695 == 160) {
			local5 = Static324.method4799();
			if (local5 == -1) {
				Static243.aString50 = Static383.aClass32_102.method701(Static107.anInt2498);
				Static30.anInt644 = 90;
			} else if (local5 == 7 || local5 == 9) {
				this.method766("worldlistfull");
				Static104.method2180(1000);
			} else if (Static195.aBoolean279) {
				Static243.aString50 = Static29.aClass32_11.method701(Static107.anInt2498);
				Static33.anInt695 = 170;
				Static30.anInt644 = 90;
			} else {
				this.method766("worldlistio_" + local5);
				Static104.method2180(1000);
			}
		} else if (Static33.anInt695 == 170) {
			Static245.aStringArray108 = new String[Static36.aClass14_1.anInt384];
			Static330.anIntArray1157 = new int[Static355.aClass190_1.anInt4616];
			Static88.aBooleanArray13 = new boolean[Static355.aClass190_1.anInt4616];
			for (local5 = 0; local5 < Static355.aClass190_1.anInt4616; local5++) {
				if (Static355.aClass190_1.method4085(local5).anInt4039 == 0) {
					Static88.aBooleanArray13[local5] = true;
					Static308.anInt5180++;
				}
				Static330.anIntArray1157[local5] = -1;
			}
			Static69.method1127();
			Static305.anInt5143 = Static86.aClass171_30.method3769("loginscreen");
			Static200.aClass171_51.method3744(false);
			Static233.aClass171_53.method3744(true);
			Static263.aClass171_64.method3744(true);
			Static120.aClass171_35.method3744(true);
			Static138.aClass171_15.method3744(true);
			Static86.aClass171_30.method3744(true);
			Static131.aBoolean207 = true;
			Static29.aClass171_10.anInt4076 = 2;
			Static135.aClass171_46.anInt4076 = 2;
			Static308.aClass171_81.anInt4076 = 2;
			Static275.aClass171_74.anInt4076 = 2;
			Static81.aClass171_29.anInt4076 = 2;
			Static41.aClass171_13.anInt4076 = 2;
			Static201.aClass171_52.anInt4076 = 2;
			Static145.method4675(Static213.anInt3866, -1, -1, false);
			Static243.aString50 = Static42.aClass32_76.method701(Static107.anInt2498);
			Static33.anInt695 = 180;
			Static30.anInt644 = 95;
		} else if (Static33.anInt695 == 180) {
			Static48.method809(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method777() {
		if (Static333.aClass106_2.anInt2889 > Static23.anInt499) {
			Static332.anInt5678 = (Static333.aClass106_2.anInt2889 - 1) * 250;
			if (Static255.anInt4505 == Static167.anInt5329) {
				Static167.anInt5329 = Static41.anInt831;
			} else {
				Static167.anInt5329 = Static255.anInt4505;
			}
			if (Static332.anInt5678 > 3000) {
				Static332.anInt5678 = 3000;
			}
			if (Static333.aClass106_2.anInt2889 >= 2 && Static333.aClass106_2.anInt2888 == 6) {
				this.method766("js5connect_outofdate");
				Static391.anInt6627 = 1000;
				return;
			}
			if (Static333.aClass106_2.anInt2889 >= 4 && Static333.aClass106_2.anInt2888 == -1) {
				this.method766("js5crc");
				Static391.anInt6627 = 1000;
				return;
			}
			if (Static333.aClass106_2.anInt2889 >= 4 && (Static391.anInt6627 == 0 || Static391.anInt6627 == 5)) {
				if (Static333.aClass106_2.anInt2888 == 7 || Static333.aClass106_2.anInt2888 == 9) {
					this.method766("js5connect_full");
				} else if (Static333.aClass106_2.anInt2888 > 0) {
					this.method766("js5connect");
				} else {
					this.method766("js5io");
				}
				Static391.anInt6627 = 1000;
				return;
			}
		}
		Static23.anInt499 = Static333.aClass106_2.anInt2889;
		if (Static332.anInt5678 > 0) {
			Static332.anInt5678--;
			return;
		}
		try {
			if (Static321.anInt5506 == 0) {
				Static120.aClass182_4 = Static359.aClass111_5.method2798(Static167.anInt5329, Static61.aString15);
				Static321.anInt5506++;
			}
			if (Static321.anInt5506 == 1) {
				if (Static120.aClass182_4.anInt4498 == 2) {
					this.method787(1000);
					return;
				}
				if (Static120.aClass182_4.anInt4498 == 1) {
					Static321.anInt5506++;
				}
			}
			if (Static321.anInt5506 == 2) {
				Static188.aClass221_4 = new Class221((Socket) Static120.aClass182_4.anObject6, Static359.aClass111_5);
				@Pc(186) Class2_Sub16 local186 = new Class2_Sub16(5);
				local186.method5358(Static320.aClass17_2.anInt444);
				local186.method5355(573);
				Static188.aClass221_4.method4796(local186.aByteArray112, 5);
				Static321.anInt5506++;
				Static85.aLong62 = Static39.method699();
			}
			if (Static321.anInt5506 == 3) {
				if (Static391.anInt6627 == 0 || Static391.anInt6627 == 5 || Static188.aClass221_4.method4795() > 0) {
					@Pc(230) int local230 = Static188.aClass221_4.method4794();
					if (local230 != 0) {
						this.method787(local230);
						return;
					}
					Static321.anInt5506++;
				} else if (Static39.method699() - Static85.aLong62 > 30000L) {
					this.method787(1001);
					return;
				}
			}
			if (Static321.anInt5506 == 4) {
				@Pc(279) boolean local279 = Static391.anInt6627 == 5 || Static391.anInt6627 == 10 || Static391.anInt6627 == 28;
				Static333.aClass106_2.method2699(Static188.aClass221_4, !local279);
				Static188.aClass221_4 = null;
				Static120.aClass182_4 = null;
				Static321.anInt5506 = 0;
			}
		} catch (@Pc(296) IOException local296) {
			this.method787(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method779() {
		@Pc(12) boolean local12 = Static333.aClass106_2.method2698();
		if (!local12) {
			this.method777();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method768() {
		if (Static10.aBoolean423) {
			Static37.method675();
		}
		if (Static111.aClass63_3 != null) {
			Static111.aClass63_3.method2050();
		}
		if (Static385.aFrame2 != null) {
			Static17.method318(Static385.aFrame2, Static359.aClass111_5);
			Static385.aFrame2 = null;
		}
		if (Static88.aClass221_1 != null) {
			Static88.aClass221_1.method4801();
			Static88.aClass221_1 = null;
		}
		if (Static31.aClass167_1 != null) {
			Static31.aClass167_1.method5461(Static257.aCanvas4);
		}
		Static31.aClass167_1 = null;
		if (Static269.aClass85_2 != null) {
			Static269.aClass85_2.method4215();
		}
		if (Static156.aClass85_1 != null) {
			Static156.aClass85_1.method4215();
		}
		Static333.aClass106_2.method2689();
		Static91.aClass151_2.method3438();
		if (Static114.aClass156_1 != null) {
			Static114.aClass156_1.method3509();
			Static114.aClass156_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method756() {
		if (Static391.anInt6627 == 1000) {
			return;
		}
		@Pc(16) long local16 = Static300.method1286() / 1000000L - Static90.aLong66;
		Static90.aLong66 = Static300.method1286() / 1000000L;
		@Pc(24) boolean local24 = Static56.method926();
		if (local24 && Static221.aBoolean428 && Static269.aClass85_2 != null) {
			Static269.aClass85_2.method4213();
		}
		if (Static391.anInt6627 == 30 || Static391.anInt6627 == 10) {
			if (Static4.aLong7 != 0L && Static39.method699() > Static4.aLong7) {
				Static145.method4675(Static162.method2888(), Static364.anInt6192, Static132.anInt2711, false);
			} else if (Static111.aClass63_3.method2005() && Static23.aBoolean37) {
				Static210.method3520();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static385.aFrame2 == null) {
			@Pc(80) Container local80;
			if (Static8.aFrame1 == null) {
				local80 = Static359.aClass111_5.anApplet1;
			} else {
				local80 = Static8.aFrame1;
			}
			local89 = local80.getSize().width;
			local93 = local80.getSize().height;
			if (Static8.aFrame1 == local80) {
				@Pc(99) Insets local99 = Static8.aFrame1.getInsets();
				local89 -= local99.left + local99.right;
				local93 -= local99.bottom + local99.top;
			}
			if (Static70.anInt1246 != local89 || local93 != Static230.anInt4054) {
				if (Static111.aClass63_3 == null || Static111.aClass63_3.method1971()) {
					Static275.method4182();
				} else {
					Static230.anInt4054 = local93;
					Static70.anInt1246 = local89;
				}
				Static4.aLong7 = Static39.method699() + 500L;
			}
		}
		if (Static385.aFrame2 != null && !Static90.aBoolean129 && (Static391.anInt6627 == 30 || Static391.anInt6627 == 10)) {
			Static145.method4675(Static213.anInt3866, -1, -1, false);
		}
		@Pc(163) boolean local163 = false;
		if (Static242.aBoolean363) {
			local163 = true;
			Static242.aBoolean363 = false;
		}
		if (local163) {
			Static316.method4706();
		}
		if (Static111.aClass63_3 != null && Static111.aClass63_3.method2057() || Static162.method2888() != 1) {
			Static240.method3873();
		}
		if (Static391.anInt6627 == 0) {
			Static109.method2270(Static202.aColorArray1[Static34.anInt731], local163, Static282.aColorArray3[Static34.anInt731], Static255.aColorArray2[Static34.anInt731], Static243.aString50, Static30.anInt644);
		} else if (Static391.anInt6627 == 5) {
			Static374.method5470(Static111.aClass63_3, Static255.aColorArray2[Static34.anInt731].getRGB(), Static282.aColorArray3[Static34.anInt731].getRGB(), Static111.aClass63_3.method2057() | local163, Static202.aColorArray1[Static34.anInt731].getRGB(), Static340.aClass9_4);
		} else if (Static391.anInt6627 == 10) {
			Static85.method1523();
		} else if (Static391.anInt6627 == 25 || Static391.anInt6627 == 28) {
			if (Static20.anInt5422 == 1) {
				if (Static339.anInt5782 > Static146.anInt2916) {
					Static146.anInt2916 = Static339.anInt5782;
				}
				local89 = (Static146.anInt2916 - Static339.anInt5782) * 50 / Static146.anInt2916;
				Static108.method4606(Static319.aClass9_3, true, Static55.aClass32_21.method701(Static107.anInt2498) + "<br>(" + local89 + "%)");
			} else if (Static20.anInt5422 == 2) {
				if (Static90.anInt1733 < Static162.anInt3139) {
					Static90.anInt1733 = Static162.anInt3139;
				}
				local89 = (Static90.anInt1733 - Static162.anInt3139) * 50 / Static90.anInt1733 + 50;
				Static108.method4606(Static319.aClass9_3, true, Static55.aClass32_21.method701(Static107.anInt2498) + "<br>(" + local89 + "%)");
			} else {
				Static108.method4606(Static319.aClass9_3, true, Static55.aClass32_21.method701(Static107.anInt2498));
			}
		} else if (Static391.anInt6627 == 30) {
			Static329.method4858(local16);
		} else if (Static391.anInt6627 == 40) {
			Static108.method4606(Static319.aClass9_3, true, Static29.aClass32_10.method701(Static107.anInt2498) + "<br>" + Static195.aClass32_51.method701(Static107.anInt2498));
		}
		if (Static301.anInt5345 == 3) {
			for (local89 = 0; local89 < Static86.anInt1651; local89++) {
				@Pc(381) Rectangle local381 = Class148.aRectangleArray2[local89];
				if (Static135.aBooleanArray19[local89]) {
					Static111.aClass63_3.method1951(local381.y, local381.height, local381.width, -1996553985, local381.x);
				} else if (Static51.aBooleanArray7[local89]) {
					Static111.aClass63_3.method1951(local381.y, local381.height, local381.width, -1996554240, local381.x);
				}
			}
		}
		if (Static239.method3869()) {
			Static289.method4377(Static111.aClass63_3);
		}
		if ((Static391.anInt6627 == 30 || Static391.anInt6627 == 10) && Static301.anInt5345 == 0 && Static162.method2888() == 1 && !local163 && Static152.aString33.equals("1.1")) {
			local89 = 0;
			for (local93 = 0; local93 < Static86.anInt1651; local93++) {
				if (Static51.aBooleanArray7[local93]) {
					Static51.aBooleanArray7[local93] = false;
					Static24.aRectangleArray1[local89++] = Class148.aRectangleArray2[local93];
				}
			}
			Static111.aClass63_3.method1981(Static24.aRectangleArray1, local89);
		} else if (Static391.anInt6627 != 0) {
			Static111.aClass63_3.method2049();
			for (local89 = 0; local89 < Static86.anInt1651; local89++) {
				Static51.aBooleanArray7[local89] = false;
			}
		}
		if (Static29.anInt617 == 0) {
			Static358.method2028(15L);
		} else if (Static29.anInt617 == 1) {
			Static358.method2028(10L);
		} else if (Static29.anInt617 == 2) {
			Static358.method2028(5L);
		} else if (Static29.anInt617 == 3) {
			Static358.method2028(2L);
		}
		if (Static131.aBoolean207) {
			Static61.method1004();
		}
		if (Static214.aBoolean294 && Static391.anInt6627 == 10 && Static234.anInt4158 != -1) {
			Static214.aBoolean294 = false;
			Static164.method2916(Static359.aClass111_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method759() {
		if (Static391.anInt6627 == 1000) {
			return;
		}
		Static253.anInt4469++;
		if (Static253.anInt4469 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static259.anInt4530 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static51.aRandom1.setSeed((long) Static259.anInt4530);
		}
		if (Static253.anInt4469 % 50 == 0) {
			Static18.anInt429 = Static297.anInt5090;
			Static297.anInt5090 = 0;
			Static173.anInt3328 = Static367.anInt6239;
			Static367.anInt6239 = 0;
		}
		this.method779();
		if (Static59.aClass233_1 != null) {
			Static59.aClass233_1.method5207();
		}
		Static189.method5664();
		Static271.method4164();
		Static48.aClass69_1.method2262();
		Static311.aClass129_1.method2988();
		if (Static31.aClass167_1 != null) {
			@Pc(87) int local87 = Static31.aClass167_1.method5464();
			Static303.anInt5140 = local87;
		}
		if (Static111.aClass63_3 != null) {
			Static111.aClass63_3.method1991((int) Static39.method699());
		}
		Static86.method1537();
		Static184.anInt3459 = 0;
		for (@Pc(110) Class162 local110 = Static48.aClass69_1.method2260(); local110 != null && Static184.anInt3459 < 128; local110 = Static48.aClass69_1.method2260()) {
			if (local110.method4028() != 1) {
				@Pc(121) char local121 = local110.method4033();
				if (!Static344.method4219() || local121 != '`' && local121 != '§') {
					Static360.aClass162Array1[Static184.anInt3459] = local110;
					Static184.anInt3459++;
				} else if (Static239.method3869()) {
					Static248.method3939();
				} else {
					Static3.method77();
				}
			}
		}
		Static29.aClass2_Sub19_1 = null;
		for (@Pc(170) Class2_Sub19 local170 = Static311.aClass129_1.method2994(); local170 != null; local170 = Static311.aClass129_1.method2994()) {
			@Pc(178) int local178 = local170.method2379();
			if (local178 == -1) {
				Static234.aClass30_35.method685(local170);
			} else if (Static322.method4780(local178)) {
				Static29.aClass2_Sub19_1 = local170;
			}
		}
		if (Static239.method3869()) {
			Static214.method3579();
		}
		if (Static391.anInt6627 == 0) {
			this.method776();
			Static41.method708();
		} else if (Static391.anInt6627 == 5) {
			this.method776();
			Static41.method708();
		} else if (Static391.anInt6627 == 25 || Static391.anInt6627 == 28) {
			Static136.method2647();
		}
		if (Static391.anInt6627 == 10) {
			this.method786();
			Static100.method1945();
			Static339.method4971();
			Static326.method4843();
		} else if (Static391.anInt6627 == 30) {
			Static76.method1208();
		} else if (Static391.anInt6627 == 40) {
			Static326.method4843();
			if (Static139.anInt2783 != -3 && Static139.anInt2783 != 2 && Static139.anInt2783 != 15) {
				Static32.method596();
			}
		}
		Static303.method4471(Static111.aClass63_3);
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method763()) {
			return;
		}
		Static308.anInt5182 = Integer.parseInt(this.getParameter("worldid"));
		Static141.aClass117_7 = Static363.method5386(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static16.method311(Static141.aClass117_7) && Static141.aClass117_7 != Static17.aClass117_1) {
			Static141.aClass117_7 = Static17.aClass117_1;
		}
		Static196.aClass89_2 = Static384.method5623(Integer.parseInt(this.getParameter("modewhat")));
		if (Static311.aClass89_5 != Static196.aClass89_2 && Static282.aClass89_4 != Static196.aClass89_2 && Static196.aClass89_2 != Static260.aClass89_3) {
			Static196.aClass89_2 = Static260.aClass89_3;
		}
		try {
			Static107.anInt2498 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static107.anInt2498 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static130.aBoolean205 = true;
		} else {
			Static130.aBoolean205 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static217.aBoolean297 = true;
		} else {
			Static217.aBoolean297 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static195.aBoolean280 = true;
		} else {
			Static195.aBoolean280 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static275.aClass150_3 = Static119.aClass150_1;
		} else {
			Static275.aClass150_3 = Static195.aClass150_2;
		}
		try {
			Static16.anInt383 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static16.anInt383 = 0;
		}
		Static128.aString27 = this.getParameter("quiturl");
		Static9.aString6 = this.getParameter("settings");
		if (Static9.aString6 == null) {
			Static9.aString6 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static104.anInt2158 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static104.anInt2158 = 0;
			}
		}
		Static34.anInt731 = Integer.parseInt(this.getParameter("colourid"));
		if (Static34.anInt731 < 0 || Static255.aColorArray2.length <= Static34.anInt731) {
			Static34.anInt731 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static388.aBoolean470 = true;
			Static330.aBoolean414 = true;
		}
		Static387.aClient1 = this;
		if (Static195.aClass150_2 == Static275.aClass150_3) {
			Static237.anInt4228 = 765;
			Static253.anInt4466 = 503;
		} else if (Static275.aClass150_3 == Static119.aClass150_1) {
			Static253.anInt4466 = 480;
			Static237.anInt4228 = 640;
		}
		this.method760(Static237.anInt4228, Static196.aClass89_2.method2470() + 32, Static253.anInt4466);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method786() {
		Static64.anInt1278++;
		Static270.method2995(-1, null, -1);
		Static94.method1873(null, -1, -1);
		Static162.method2890();
		Static102.anInt2133++;
		for (@Pc(32) int local32 = 0; local32 < 32768; local32++) {
			@Pc(38) Class1_Sub5_Sub1_Sub2 local38 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local32];
			if (local38 != null) {
				@Pc(44) byte local44 = local38.aClass133_1.aByte36;
				if ((local44 & 0x1) != 0) {
					@Pc(52) int local52 = local38.method5547();
					@Pc(76) int local76;
					if ((local44 & 0x2) != 0 && local38.anInt6456 == 0 && Math.random() * 1000.0D < 10.0D) {
						local76 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(84) int local84 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local76 != 0 || local84 != 0) {
							@Pc(95) int local95 = local76 + local38.anIntArray1324[0];
							@Pc(103) int local103 = local38.anIntArray1323[0] + local84;
							if (local95 < 0) {
								local95 = 0;
							} else if (local95 > Static246.anInt4374 - local52 - 1) {
								local95 = Static246.anInt4374 - local52 - 1;
							}
							if (local103 < 0) {
								local103 = 0;
							} else if (Static185.anInt3485 - local52 - 1 < local103) {
								local103 = Static185.anInt3485 - local52 - 1;
							}
							@Pc(175) int local175 = Static194.method3308(-1, true, Static58.aClass188Array1[local38.aByte69], local38.anIntArray1324[0], local52, 0, local52, 0, local95, Static360.anIntArray1274, local52, Static48.anIntArray196, local103, local38.anIntArray1323[0]);
							if (local175 > 0) {
								if (local175 > 9) {
									local175 = 9;
								}
								for (@Pc(186) int local186 = 0; local186 < local175; local186++) {
									local38.anIntArray1324[local186] = Static360.anIntArray1274[local175 - local186 - 1];
									local38.anIntArray1323[local186] = Static48.anIntArray196[local175 - local186 - 1];
									local38.aByteArray115[local186] = 1;
								}
								local38.anInt6456 = local175;
							}
						}
					}
					Static376.method5493(true, local38);
					local76 = Static367.method5423(local38);
					Static131.method2588(local38, Static209.anInt3826, Static38.anInt806, local76);
					Static38.method689(local38);
				}
			}
		}
		if (Static216.anInt3923 == 0 && Static349.anInt4698 == 0) {
			if (Static79.anInt4624 == 2) {
				Static178.method3130();
			} else {
				Static176.method3102();
			}
			if (Static224.anInt4006 >> 7 < 14 || Static224.anInt4006 >> 7 >= Static246.anInt4374 - 14 || Static51.anInt1057 >> 7 < 14 || Static51.anInt1057 >> 7 >= Static185.anInt3485 - 14) {
				Static250.method3960();
			}
		}
		while (true) {
			@Pc(300) Class2_Sub22 local300;
			@Pc(305) Class4 local305;
			@Pc(316) Class4 local316;
			do {
				local300 = (Class2_Sub22) Static110.aClass30_15.method695();
				if (local300 == null) {
					while (true) {
						do {
							local300 = (Class2_Sub22) Static184.aClass30_27.method695();
							if (local300 == null) {
								while (true) {
									do {
										local300 = (Class2_Sub22) Static206.aClass30_29.method695();
										if (local300 == null) {
											if (Static242.aClass4_22 != null) {
												Static196.method3727();
											}
											if (Static253.anInt4469 % 1500 == 0) {
												Static200.method3361();
											}
											Static133.method2605();
											if (Static10.aBoolean423 && Static39.method699() - 60000L > Static69.aLong51) {
												Static37.method675();
												return;
											}
											return;
										}
										local305 = local300.aClass4_15;
										if (local305.lb < 0) {
											break;
										}
										local316 = Static380.method5560(local305.anInt88);
									} while (local316 == null || local316.aClass4Array1 == null || local305.lb >= local316.aClass4Array1.length || local305 != local316.aClass4Array1[local305.lb]);
									Static256.method4003(local300);
								}
							}
							local305 = local300.aClass4_15;
							if (local305.lb < 0) {
								break;
							}
							local316 = Static380.method5560(local305.anInt88);
						} while (local316 == null || local316.aClass4Array1 == null || local316.aClass4Array1.length <= local305.lb || local316.aClass4Array1[local305.lb] != local305);
						Static256.method4003(local300);
					}
				}
				local305 = local300.aClass4_15;
				if (local305.lb < 0) {
					break;
				}
				local316 = Static380.method5560(local305.anInt88);
			} while (local316 == null || local316.aClass4Array1 == null || local316.aClass4Array1.length <= local305.lb || local305 != local316.aClass4Array1[local305.lb]);
			Static256.method4003(local300);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method787(@OriginalArg(1) int arg0) {
		Static333.aClass106_2.anInt2888 = arg0;
		Static333.aClass106_2.anInt2889++;
		Static321.anInt5506 = 0;
		Static188.aClass221_4 = null;
		Static120.aClass182_4 = null;
	}
}
