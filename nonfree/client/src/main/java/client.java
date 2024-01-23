import java.awt.Color;
import java.awt.Graphics;
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
			if (arg0.length < 7 || arg0.length > 8) {
				Static95.method1668();
			}
			Static77.anInt1691 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static144.anInt3283 = 0;
			} else if (arg0[1].equals("office")) {
				Static144.anInt3283 = 1;
			} else if (arg0[1].equals("local")) {
				Static144.anInt3283 = 2;
			} else {
				Static95.method1668();
			}
			if (arg0[2].equals("live")) {
				Static150.anInt3423 = 0;
			} else if (arg0[2].equals("rc")) {
				Static150.anInt3423 = 1;
			} else if (arg0[2].equals("wip")) {
				Static150.anInt3423 = 2;
			} else {
				Static95.method1668();
			}
			if (arg0[4].equals("free")) {
				Static111.aBoolean104 = false;
			} else if (arg0[4].equals("members")) {
				Static111.aBoolean104 = true;
			} else {
				Static95.method1668();
			}
			if (arg0[5].equals("english")) {
				Static211.anInt4647 = 0;
			} else if (arg0[5].equals("german")) {
				Static17.method258();
				Static211.anInt4647 = 1;
			} else {
				Static95.method1668();
			}
			if (arg0[6].equals("game0")) {
				Static193.anInt4451 = 0;
			} else if (arg0[6].equals("game1")) {
				Static193.anInt4451 = 1;
			} else {
				Static95.method1668();
			}
			if (arg0.length != 8) {
				Static192.aBoolean190 = false;
			} else if (arg0[7].equals("safemode")) {
				Static192.aBoolean190 = true;
			} else {
				Static95.method1668();
			}
			Static113.aString6 = "127.0.0.1";
			Static29.aClass78_95 = Static73.aClass78_352;
			Static102.anInt2232 = 0;
			@Pc(186) client local186 = new client();
			local186.method455("runescape", Static150.anInt3423 + 32);
			Static3.aFrame1.setLocation(40, 40);
		} catch (@Pc(204) Exception local204) {
			Static139.method2127(local204, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method469() {
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method462() {
		if (Static226.anInt4903 == 1000) {
			return;
		}
		Static123.anInt2808++;
		if (Static123.anInt2808 % 1000 == 1) {
			@Pc(32) GregorianCalendar local32 = new GregorianCalendar();
			Static109.anInt2419 = local32.get(11) * 600 + local32.get(12) * 10 + local32.get(13) / 6;
			Static5.aRandom1.setSeed((long) Static109.anInt2419);
		}
		this.method479();
		Static52.method676();
		Static81.method1351();
		Static41.method565();
		Static33.method420();
		Static145.method2572();
		if (Static57.aClass23_2 != null) {
			@Pc(75) int local75 = Static57.aClass23_2.method546();
			Static148.anInt3392 = local75;
		}
		if (Static226.anInt4903 == 0) {
			this.method478();
			Static82.method1361();
		} else if (Static226.anInt4903 == 5) {
			this.method478();
			Static82.method1361();
		} else if (Static226.anInt4903 == 10) {
			this.method481();
			Static16.method3963();
			return;
		} else if (Static226.anInt4903 == 20) {
			this.method481();
			Static209.method3072();
		} else if (Static226.anInt4903 == 25) {
			Static82.method1353();
		} else if (Static226.anInt4903 == 28) {
			Static82.method1353();
			Static16.method3963();
		}
		if (Static226.anInt4903 == 30) {
			Static133.method2414();
		} else if (Static226.anInt4903 == 10) {
			this.method481();
			return;
		} else if (Static226.anInt4903 == 40) {
			Static209.method3072();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method476() {
		if (Static101.anInt2210 >= 4) {
			this.method461("js5crc");
			Static226.anInt4903 = 1000;
			return;
		}
		if (Static101.anInt2212 >= 4) {
			if (Static226.anInt4903 <= 5) {
				this.method461("js5io");
				Static226.anInt4903 = 1000;
				return;
			}
			Static101.anInt2212 = 3;
			Static220.anInt4769 = 3000;
		}
		if (Static220.anInt4769-- > 0) {
			return;
		}
		try {
			if (Static50.anInt905 == 0) {
				Static184.aClass33_15 = Static133.aClass41_2.method1264(Static113.aString6, Static227.anInt4919);
				Static50.anInt905++;
			}
			if (Static50.anInt905 == 1) {
				if (Static184.aClass33_15.anInt947 == 2) {
					this.method480(-1);
					return;
				}
				if (Static184.aClass33_15.anInt947 == 1) {
					Static50.anInt905++;
				}
			}
			if (Static50.anInt905 == 2) {
				Static151.aClass105_2 = new Class105((Socket) Static184.aClass33_15.anObject2, Static133.aClass41_2);
				@Pc(101) Class2_Sub23 local101 = new Class2_Sub23(5);
				local101.method2132(15);
				local101.method2134(501);
				Static151.aClass105_2.method3692(local101.aByteArray41, 5);
				Static50.anInt905++;
				Static227.aLong189 = Static111.method1911();
			}
			if (Static50.anInt905 == 3) {
				if (Static226.anInt4903 <= 5 || Static151.aClass105_2.method3690() > 0) {
					@Pc(154) int local154 = Static151.aClass105_2.method3699();
					if (local154 != 0) {
						this.method480(local154);
						return;
					}
					Static50.anInt905++;
				} else if (Static111.method1911() - Static227.aLong189 > 30000L) {
					this.method480(-2);
					return;
				}
			}
			if (Static50.anInt905 == 4) {
				Static154.method2748(Static226.anInt4903 > 20, Static151.aClass105_2);
				Static151.aClass105_2 = null;
				Static148.anInt3390 = 0;
				Static184.aClass33_15 = null;
				Static50.anInt905 = 0;
			}
		} catch (@Pc(194) IOException local194) {
			this.method480(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method458()) {
			return;
		}
		Static77.anInt1691 = Integer.parseInt(this.getParameter("worldid"));
		Static150.anInt3423 = Integer.parseInt(this.getParameter("modewhat"));
		Static144.anInt3283 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("safemode");
		if (local29 != null && local29.equals("1")) {
			Static192.aBoolean190 = true;
		} else {
			Static192.aBoolean190 = false;
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static111.aBoolean104 = true;
		} else {
			Static111.aBoolean104 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static17.method258();
			Static211.anInt4647 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static193.anInt4451 = 1;
		} else {
			Static193.anInt4451 = 0;
		}
		try {
			Static92.anInt2043 = Integer.parseInt(this.getParameter("js"));
			Static148.anInt3386 = Integer.parseInt(this.getParameter("plug"));
			Static102.anInt2232 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static29.aClass78_95 = Static168.aClass78_849.method3019(this);
		if (Static29.aClass78_95 == null) {
			Static29.aClass78_95 = Static73.aClass78_352;
		}
		@Pc(117) String local117 = this.getParameter("advert");
		if (local117 != null) {
			@Pc(122) byte[] local122 = local117.getBytes();
			@Pc(129) Class78 local129 = Static48.method629(local122.length, 0, local122);
			@Pc(133) boolean local133 = Static7.method152(local129);
		}
		Static113.aString6 = this.getCodeBase().getHost();
		this.method468(Static150.anInt3423 + 32);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method478() {
		@Pc(21) int local21;
		if (Static10.anInt308 == 0) {
			@Pc(12) Runtime local12 = Runtime.getRuntime();
			local21 = (int) ((local12.totalMemory() - local12.freeMemory()) / 1024L);
			@Pc(24) long local24 = Static111.method1911();
			if (Static40.aLong27 == 0L) {
				Static40.aLong27 = local24;
			}
			if (local21 > 16384 && local24 - Static40.aLong27 < 5000L) {
				if (local24 - Static64.aLong55 > 1000L) {
					System.gc();
					Static64.aLong55 = local24;
				}
				Static105.aClass78_500 = Static43.aClass78_148;
				Static184.anInt4292 = 5;
			} else {
				Static10.anInt308 = 10;
				Static105.aClass78_500 = Static167.aClass78_675;
				Static184.anInt4292 = 5;
			}
			return;
		}
		@Pc(71) int local71;
		if (Static10.anInt308 == 10) {
			Static65.method1055();
			for (local71 = 0; local71 < 4; local71++) {
				Static202.aClass90Array1[local71] = new Class90(104, 104);
			}
			Static10.anInt308 = 30;
			Static105.aClass78_500 = Static97.aClass78_471;
			Static184.anInt4292 = 10;
		} else if (Static10.anInt308 == 30) {
			Static50.aClass72_Sub1_6 = Static109.method1897(true, false, true, 0);
			Static166.aClass72_Sub1_12 = Static109.method1897(true, false, true, 1);
			Static99.aClass72_Sub1_20 = Static109.method1897(false, true, true, 2);
			Static169.aClass72_Sub1_28 = Static109.method1897(true, false, true, 3);
			Static124.aClass72_Sub1_24 = Static109.method1897(true, false, true, 4);
			Static95.aClass72_Sub1_18 = Static109.method1897(true, true, true, 5);
			Static90.aClass72_Sub1_17 = Static109.method1897(true, true, false, 6);
			Static110.aClass72_Sub1_23 = Static109.method1897(true, false, true, 7);
			Static215.aClass72_Sub1_33 = Static109.method1897(true, false, true, 8);
			Static223.aClass72_Sub1_35 = Static109.method1897(true, false, true, 9);
			Static122.aClass72_Sub1_16 = Static109.method1897(true, false, true, 10);
			Static223.aClass72_Sub1_34 = Static109.method1897(true, false, true, 11);
			Static97.aClass72_Sub1_19 = Static109.method1897(true, false, true, 12);
			Static170.aClass72_Sub1_29 = Static109.method1897(true, false, true, 13);
			Static33.aClass72_Sub1_3 = Static109.method1897(true, false, false, 14);
			Static145.aClass72_Sub1_27 = Static109.method1897(true, false, true, 15);
			Static9.aClass72_Sub1_1 = Static109.method1897(true, false, true, 16);
			Static134.aClass72_Sub1_26 = Static109.method1897(true, false, true, 17);
			Static174.aClass72_Sub1_30 = Static109.method1897(true, false, true, 18);
			Static202.aClass72_Sub1_32 = Static109.method1897(true, false, true, 19);
			Static46.aClass72_Sub1_5 = Static109.method1897(true, false, true, 20);
			Static31.aClass72_Sub1_2 = Static109.method1897(true, false, true, 21);
			Static201.aClass72_Sub1_31 = Static109.method1897(true, false, true, 22);
			Static35.aClass72_Sub1_4 = Static109.method1897(true, true, true, 23);
			Static106.aClass72_Sub1_22 = Static109.method1897(true, false, true, 24);
			Static80.aClass72_Sub1_15 = Static109.method1897(true, false, true, 25);
			Static129.aClass72_Sub1_25 = Static109.method1897(true, true, true, 26);
			Static105.aClass78_500 = Static226.aClass78_869;
			Static10.anInt308 = 40;
			Static184.anInt4292 = 15;
		} else if (Static10.anInt308 == 40) {
			local71 = Static50.aClass72_Sub1_6.method3202() * 4 / 100;
			local71 += Static166.aClass72_Sub1_12.method3202() * 4 / 100;
			local71 += Static99.aClass72_Sub1_20.method3202() / 100;
			local71 += Static169.aClass72_Sub1_28.method3202() * 2 / 100;
			local71 += Static124.aClass72_Sub1_24.method3202() * 6 / 100;
			local71 += Static95.aClass72_Sub1_18.method3202() * 4 / 100;
			local71 += Static90.aClass72_Sub1_17.method3202() * 2 / 100;
			local71 += Static110.aClass72_Sub1_23.method3202() * 50 / 100;
			local71 += Static215.aClass72_Sub1_33.method3202() * 2 / 100;
			local71 += Static223.aClass72_Sub1_35.method3202() * 2 / 100;
			local71 += Static122.aClass72_Sub1_16.method3202() * 2 / 100;
			local71 += Static223.aClass72_Sub1_34.method3202() * 2 / 100;
			local71 += Static97.aClass72_Sub1_19.method3202() * 2 / 100;
			local71 += Static170.aClass72_Sub1_29.method3202() * 2 / 100;
			local71 += Static33.aClass72_Sub1_3.method3202() * 2 / 100;
			local71 += Static145.aClass72_Sub1_27.method3202() * 2 / 100;
			local71 += Static9.aClass72_Sub1_1.method3202() / 100;
			local71 += Static134.aClass72_Sub1_26.method3202() / 100;
			local71 += Static174.aClass72_Sub1_30.method3202() / 100;
			local71 += Static202.aClass72_Sub1_32.method3202() / 100;
			local71 += Static46.aClass72_Sub1_5.method3202() / 100;
			local71 += Static31.aClass72_Sub1_2.method3202() / 100;
			local71 += Static201.aClass72_Sub1_31.method3202() / 100;
			local71 += Static35.aClass72_Sub1_4.method3202() / 100;
			local71 += Static106.aClass72_Sub1_22.method3202() / 100;
			local71 += Static80.aClass72_Sub1_15.method3202() / 100;
			local71 += Static129.aClass72_Sub1_25.method3202() / 100;
			if (local71 == 100) {
				Static184.anInt4292 = 20;
				Static105.aClass78_500 = Static159.aClass78_720;
				Static176.method3212(Static215.aClass72_Sub1_33);
				Static224.method3932(Static215.aClass72_Sub1_33);
				Static185.method3425(Static215.aClass72_Sub1_33);
				Static33.method421(Static215.aClass72_Sub1_33);
				Static10.anInt308 = 45;
			} else {
				if (local71 != 0) {
					Static105.aClass78_500 = Static94.method1640(new Class78[] { Static108.aClass78_514, Static19.method268(local71), Static70.aClass78_576 });
				}
				Static184.anInt4292 = 20;
			}
		} else if (Static10.anInt308 == 45) {
			Static1.method2(Static40.aBoolean27);
			Static129.aClass2_Sub21_Sub2_3 = new Class2_Sub21_Sub2();
			Static129.aClass2_Sub21_Sub2_3.method2796();
			Static220.aClass40_3 = Static184.method3395(Static79.aCanvas2, Static133.aClass41_2, 22050, 0);
			Static220.aClass40_3.method3708(Static129.aClass2_Sub21_Sub2_3);
			Static78.method1326(Static129.aClass2_Sub21_Sub2_3, Static145.aClass72_Sub1_27, Static124.aClass72_Sub1_24, Static33.aClass72_Sub1_3);
			Static53.aClass40_2 = Static184.method3395(Static79.aCanvas2, Static133.aClass41_2, 2048, 1);
			Static23.aClass2_Sub21_Sub3_1 = new Class2_Sub21_Sub3();
			Static53.aClass40_2.method3708(Static23.aClass2_Sub21_Sub3_1);
			Static181.aClass96_1 = new Class96(22050, Static161.anInt3727);
			Static175.anInt4036 = Static90.aClass72_Sub1_17.method3190(Static137.aClass78_598);
			Static10.anInt308 = 50;
			Static184.anInt4292 = 30;
			Static105.aClass78_500 = Static11.aClass78_43;
		} else if (Static10.anInt308 == 50) {
			local71 = Static219.method3824(Static170.aClass72_Sub1_29, Static215.aClass72_Sub1_33);
			local21 = Static121.method3985();
			if (local71 < local21) {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static90.aClass78_445, Static19.method268(local71 * 100 / local21), Static70.aClass78_576 });
				Static184.anInt4292 = 35;
			} else {
				Static10.anInt308 = 60;
				Static184.anInt4292 = 35;
				Static105.aClass78_500 = Static196.aClass78_776;
			}
		} else if (Static10.anInt308 == 60) {
			local71 = Static220.method3827(Static215.aClass72_Sub1_33);
			local21 = Static38.method511();
			if (local71 < local21) {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static98.aClass78_477, Static19.method268(local71 * 100 / local21), Static70.aClass78_576 });
				Static184.anInt4292 = 40;
			} else {
				Static184.anInt4292 = 40;
				Static105.aClass78_500 = Static32.aClass78_706;
				Static10.anInt308 = 65;
			}
		} else if (Static10.anInt308 == 65) {
			Static206.method3623(Static215.aClass72_Sub1_33, Static170.aClass72_Sub1_29);
			Static105.aClass78_500 = Static82.aClass78_394;
			Static184.anInt4292 = 45;
			Static125.method1281(5);
			Static10.anInt308 = 70;
		} else if (Static10.anInt308 == 70) {
			Static99.aClass72_Sub1_20.method3179();
			local71 = Static99.aClass72_Sub1_20.method3174();
			Static9.aClass72_Sub1_1.method3179();
			local71 += Static9.aClass72_Sub1_1.method3174();
			Static134.aClass72_Sub1_26.method3179();
			local71 += Static134.aClass72_Sub1_26.method3174();
			Static174.aClass72_Sub1_30.method3179();
			local71 += Static174.aClass72_Sub1_30.method3174();
			Static202.aClass72_Sub1_32.method3179();
			local71 += Static202.aClass72_Sub1_32.method3174();
			Static46.aClass72_Sub1_5.method3179();
			local71 += Static46.aClass72_Sub1_5.method3174();
			Static31.aClass72_Sub1_2.method3179();
			local71 += Static31.aClass72_Sub1_2.method3174();
			Static201.aClass72_Sub1_31.method3179();
			local71 += Static201.aClass72_Sub1_31.method3174();
			Static106.aClass72_Sub1_22.method3179();
			local71 += Static106.aClass72_Sub1_22.method3174();
			Static80.aClass72_Sub1_15.method3179();
			local71 += Static80.aClass72_Sub1_15.method3174();
			if (local71 < 1000) {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static2.aClass78_8, Static19.method268(local71 / 10), Static70.aClass78_576 });
				Static184.anInt4292 = 50;
			} else {
				Static206.method3624(Static99.aClass72_Sub1_20);
				Static203.method3593(Static99.aClass72_Sub1_20);
				Static152.method2733(Static99.aClass72_Sub1_20);
				Static101.method1730(Static99.aClass72_Sub1_20, Static110.aClass72_Sub1_23);
				Static161.method2905(Static111.aBoolean104, Static9.aClass72_Sub1_1, Static110.aClass72_Sub1_23);
				Static194.method3534(Static174.aClass72_Sub1_30, Static110.aClass72_Sub1_23);
				Static66.method1083(Static72.aClass2_Sub3_Sub7_Sub1_Sub1_3, Static202.aClass72_Sub1_32, Static110.aClass72_Sub1_23, Static111.aBoolean104);
				Static176.method3216(Static99.aClass72_Sub1_20);
				Static46.method624(Static50.aClass72_Sub1_6, Static166.aClass72_Sub1_12, Static46.aClass72_Sub1_5);
				Static84.method1461(Static110.aClass72_Sub1_23, Static31.aClass72_Sub1_2);
				Static187.method3448(Static201.aClass72_Sub1_31);
				Static70.method2254(Static99.aClass72_Sub1_20);
				Static167.method3020(Static215.aClass72_Sub1_33, Static110.aClass72_Sub1_23, Static170.aClass72_Sub1_29, Static169.aClass72_Sub1_28);
				Static208.method3660(Static99.aClass72_Sub1_20);
				Static225.method3970(Static134.aClass72_Sub1_26);
				Static13.method233(Static106.aClass72_Sub1_22, new Class68(), Static80.aClass72_Sub1_15);
				Static9.method186(Static80.aClass72_Sub1_15, Static106.aClass72_Sub1_22);
				Static105.aClass78_500 = Static34.aClass78_106;
				Static184.anInt4292 = 50;
				Static165.method3000();
				Static10.anInt308 = 80;
			}
		} else if (Static10.anInt308 == 80) {
			local71 = Static150.method2680(Static215.aClass72_Sub1_33);
			local21 = Static40.method550();
			if (local21 > local71) {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static203.aClass78_807, Static19.method268(local71 * 100 / local21), Static70.aClass78_576 });
				Static184.anInt4292 = 60;
			} else {
				Static28.method364(Static215.aClass72_Sub1_33);
				Static10.anInt308 = 90;
				Static105.aClass78_500 = Static123.aClass78_564;
				Static184.anInt4292 = 60;
			}
		} else if (Static10.anInt308 == 90) {
			if (Static129.aClass72_Sub1_25.method3179()) {
				@Pc(1117) Class35 local1117 = new Class35(Static223.aClass72_Sub1_35, Static129.aClass72_Sub1_25, Static215.aClass72_Sub1_33, 20, !Static14.aBoolean151);
				Static163.method2945(local1117);
				if (Static180.anInt4194 == 1) {
					Static163.method2932(0.9F);
				}
				if (Static180.anInt4194 == 2) {
					Static163.method2932(0.8F);
				}
				if (Static180.anInt4194 == 3) {
					Static163.method2932(0.7F);
				}
				if (Static180.anInt4194 == 4) {
					Static163.method2932(0.6F);
				}
				Static184.anInt4292 = 70;
				Static105.aClass78_500 = Static60.aClass78_200;
				Static10.anInt308 = 100;
			} else {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static100.aClass78_479, Static19.method268(Static129.aClass72_Sub1_25.method3174()), Static70.aClass78_576 });
				Static184.anInt4292 = 70;
			}
		} else if (Static10.anInt308 == 100) {
			if (Static39.method528(Static215.aClass72_Sub1_33)) {
				Static10.anInt308 = 110;
			}
		} else if (Static10.anInt308 == 110) {
			Static65.aClass65_1 = new Class65();
			Static133.aClass41_2.method1259(10, Static65.aClass65_1);
			Static10.anInt308 = 120;
			Static105.aClass78_500 = Static50.aClass78_168;
			Static184.anInt4292 = 75;
		} else if (Static10.anInt308 == 120) {
			if (Static122.aClass72_Sub1_16.method3191(Static31.aClass78_99, Static73.aClass78_352)) {
				@Pc(1219) Class52 local1219 = new Class52(Static122.aClass72_Sub1_16.method3183(Static73.aClass78_352, Static31.aClass78_99));
				Static150.method2685(local1219);
				Static105.aClass78_500 = Static206.aClass78_812;
				Static184.anInt4292 = 80;
				Static10.anInt308 = 130;
			} else {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static219.aClass78_856, Static42.aClass78_142 });
				Static184.anInt4292 = 80;
			}
		} else if (Static10.anInt308 == 130) {
			if (!Static169.aClass72_Sub1_28.method3179()) {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static116.aClass78_557, Static19.method268(Static169.aClass72_Sub1_28.method3174() * 4 / 5), Static70.aClass78_576 });
				Static184.anInt4292 = 85;
			} else if (!Static97.aClass72_Sub1_19.method3179()) {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static116.aClass78_557, Static19.method268(Static97.aClass72_Sub1_19.method3174() / 6 + 80), Static70.aClass78_576 });
				Static184.anInt4292 = 85;
			} else if (Static170.aClass72_Sub1_29.method3179()) {
				Static10.anInt308 = 140;
				Static184.anInt4292 = 100;
				Static105.aClass78_500 = Static226.aClass78_870;
			} else {
				Static105.aClass78_500 = Static94.method1640(new Class78[] { Static116.aClass78_557, Static19.method268(Static170.aClass72_Sub1_29.method3174() / 20 + 96), Static70.aClass78_576 });
				Static184.anInt4292 = 85;
			}
		} else if (Static10.anInt308 == 140) {
			Static189.anInt4407 = Static169.aClass72_Sub1_28.method3190(Static190.aClass78_753);
			Static95.aClass72_Sub1_18.method3187(false);
			Static90.aClass72_Sub1_17.method3187(true);
			Static215.aClass72_Sub1_33.method3187(true);
			Static170.aClass72_Sub1_29.method3187(true);
			Static122.aClass72_Sub1_16.method3187(true);
			Static169.aClass72_Sub1_28.method3187(true);
			Static125.method1281(8);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method459() {
		if (Static226.anInt4903 == 1000) {
			return;
		}
		@Pc(18) boolean local18 = Static119.method2210();
		@Pc(20) boolean local20 = false;
		if (local18 && Static2.aBoolean2 && Static220.aClass40_3 != null) {
			Static220.aClass40_3.method3715();
		}
		if (Static196.aBoolean192 && (Static226.anInt4903 == 30 || Static226.anInt4903 == 10)) {
			Static96.method1679();
		}
		if (Static205.aBoolean25) {
			local20 = true;
			Static205.aBoolean25 = false;
		}
		if (Static226.anInt4903 == 0) {
			Static41.method568(Static184.anInt4292, Static105.aClass78_500, null, local20);
		} else if (Static226.anInt4903 == 5) {
			Static119.method2208(Static75.aClass2_Sub3_Sub7_1);
		} else if (Static226.anInt4903 == 10 || Static226.anInt4903 == 20) {
			Static146.method2587();
		} else if (Static226.anInt4903 == 25 || Static226.anInt4903 == 28) {
			@Pc(134) int local134;
			if (Static103.anInt2274 == 1) {
				if (Static175.anInt4043 > Static157.anInt3622) {
					Static157.anInt3622 = Static175.anInt4043;
				}
				local134 = (Static157.anInt3622 - Static175.anInt4043) * 50 / Static157.anInt3622;
				Static90.method1592(Static94.method1640(new Class78[] { Static62.aClass78_300, Static77.aClass78_370, Static19.method268(local134), Static176.aClass78_709 }), false);
			} else if (Static103.anInt2274 == 2) {
				if (Static29.anInt532 < Static144.anInt3273) {
					Static29.anInt532 = Static144.anInt3273;
				}
				local134 = (Static29.anInt532 - Static144.anInt3273) * 50 / Static29.anInt532 + 50;
				Static90.method1592(Static94.method1640(new Class78[] { Static62.aClass78_300, Static77.aClass78_370, Static19.method268(local134), Static176.aClass78_709 }), false);
			} else {
				Static90.method1592(Static62.aClass78_300, false);
			}
		} else if (Static226.anInt4903 == 30) {
			Static226.method3974();
		} else if (Static226.anInt4903 == 40) {
			Static90.method1592(Static94.method1640(new Class78[] { Static49.aClass78_165, Static185.aClass78_737, Static152.aClass78_638 }), false);
		}
		@Pc(242) int local242;
		@Pc(234) Graphics local234;
		if ((Static226.anInt4903 == 30 || Static226.anInt4903 == 10) && Static89.anInt1998 == 0 && !local20) {
			try {
				local234 = Static79.aCanvas2.getGraphics();
				for (local242 = 0; local242 < Static109.anInt2416; local242++) {
					if (Static84.aBooleanArray57[local242]) {
						Static160.aClass10_1.method2691(local234, Static56.anIntArray160[local242], Static92.anIntArray363[local242], Static202.anIntArray728[local242], Static123.anIntArray461[local242]);
						Static84.aBooleanArray57[local242] = false;
					}
				}
			} catch (@Pc(302) Exception local302) {
				Static79.aCanvas2.repaint();
			}
		} else if (Static226.anInt4903 > 0) {
			try {
				local234 = Static79.aCanvas2.getGraphics();
				Static160.aClass10_1.method2687(local234);
				for (local242 = 0; local242 < Static109.anInt2416; local242++) {
					Static84.aBooleanArray57[local242] = false;
				}
			} catch (@Pc(258) Exception local258) {
				Static79.aCanvas2.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method465() {
		Static23.method306(Static133.aClass41_2, Static192.aBoolean190);
		Static107.anInt2351 = Static144.anInt3283 == 0 ? 443 : Static77.anInt1691 + 50000;
		Static85.anInt1909 = Static144.anInt3283 == 0 ? 43594 : Static77.anInt1691 + 40000;
		Static227.anInt4919 = Static85.anInt1909;
		if (Static193.anInt4451 == 1) {
			Static60.aShortArrayArray30 = Static7.aShortArrayArray7;
			Static21.aShortArray11 = Static101.aShortArray65;
			Static121.aShortArray165 = Static204.aShortArray144;
			Static2.aShortArrayArray3 = Static121.aShortArrayArray113;
		} else {
			Static21.aShortArray11 = Static201.aShortArray142;
			Static2.aShortArrayArray3 = Static95.aShortArrayArray54;
			Static121.aShortArray165 = Static221.aShortArray158;
			Static60.aShortArrayArray30 = Static12.aShortArrayArray11;
		}
		Static111.aShortArray76 = Static64.aShortArray39 = Static2.aShortArray3 = Static119.aShortArray84 = new short[256];
		Static137.method2464();
		Static157.method2816(Static79.aCanvas2);
		Static18.method264(Static79.aCanvas2);
		Static57.aClass23_2 = Static182.method3336();
		if (Static57.aClass23_2 != null) {
			Static57.aClass23_2.method545(Static79.aCanvas2);
		}
		Static122.anInt1736 = Static76.anInt1630;
		try {
			if (Static133.aClass41_2.aClass62_3 != null) {
				Static177.aClass99_3 = new Class99(Static133.aClass41_2.aClass62_3, 5200, 0);
				for (@Pc(99) int local99 = 0; local99 < 27; local99++) {
					Static188.aClass99Array1[local99] = new Class99(Static133.aClass41_2.aClass62Array1[local99], 6000, 0);
				}
				Static77.aClass99_1 = new Class99(Static133.aClass41_2.aClass62_1, 6000, 0);
				Static211.aClass88_4 = new Class88(255, Static177.aClass99_3, Static77.aClass99_1, 500000);
				Static106.aClass99_2 = new Class99(Static133.aClass41_2.aClass62_2, 24, 0);
				Static133.aClass41_2.aClass62_2 = null;
				Static133.aClass41_2.aClass62_1 = null;
				Static133.aClass41_2.aClass62Array1 = null;
				Static133.aClass41_2.aClass62_3 = null;
			}
		} catch (@Pc(157) IOException local157) {
			Static77.aClass99_1 = null;
			Static211.aClass88_4 = null;
			Static177.aClass99_3 = null;
			Static106.aClass99_2 = null;
		}
		if (Static144.anInt3283 != 0) {
			Static108.aBoolean95 = true;
		}
		Static132.aClass78_588 = Static207.aClass78_813;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method453() {
		if (Static114.aBrowsercontrol1 != null) {
			Static114.aBrowsercontrol1.method2448();
		}
		if (Static133.aClass41_2 != null) {
			Static133.aClass41_2.method1266(this.getClass());
		}
		if (Static65.aClass65_1 != null) {
			Static65.aClass65_1.aBoolean138 = false;
		}
		Static65.aClass65_1 = null;
		if (Static202.aClass105_4 != null) {
			Static202.aClass105_4.method3695();
			Static202.aClass105_4 = null;
		}
		Static100.method1728(Static79.aCanvas2);
		Static25.method327(Static79.aCanvas2);
		if (Static57.aClass23_2 != null) {
			Static57.aClass23_2.method548(Static79.aCanvas2);
		}
		Static185.method3426();
		Static171.method3140();
		Static57.aClass23_2 = null;
		if (Static220.aClass40_3 != null) {
			Static220.aClass40_3.method3710();
		}
		if (Static53.aClass40_2 != null) {
			Static53.aClass40_2.method3710();
		}
		Static29.method392();
		Static189.method3490();
		try {
			if (Static177.aClass99_3 != null) {
				Static177.aClass99_3.method3572();
			}
			if (Static188.aClass99Array1 != null) {
				for (@Pc(80) int local80 = 0; local80 < Static188.aClass99Array1.length; local80++) {
					if (Static188.aClass99Array1[local80] != null) {
						Static188.aClass99Array1[local80].method3572();
					}
				}
			}
			if (Static77.aClass99_1 != null) {
				Static77.aClass99_1.method3572();
			}
			if (Static106.aClass99_2 != null) {
				Static106.aClass99_2.method3572();
			}
		} catch (@Pc(108) IOException local108) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method479() {
		@Pc(13) boolean local13 = Static56.method730();
		if (!local13) {
			this.method476();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method480(@OriginalArg(1) int arg0) {
		if (Static85.anInt1909 == Static227.anInt4919) {
			Static227.anInt4919 = Static107.anInt2351;
		} else {
			Static227.anInt4919 = Static85.anInt1909;
		}
		Static184.aClass33_15 = null;
		Static148.anInt3390++;
		Static151.aClass105_2 = null;
		Static50.anInt905 = 0;
		if (Static148.anInt3390 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static226.anInt4903 > 5) {
				Static220.anInt4769 = 3000;
			} else {
				this.method461("js5connect_full");
				Static226.anInt4903 = 1000;
			}
		} else if (Static148.anInt3390 >= 2 && arg0 == 6) {
			this.method461("js5connect_outofdate");
			Static226.anInt4903 = 1000;
		} else if (Static148.anInt3390 >= 4) {
			if (Static226.anInt4903 > 5) {
				Static220.anInt4769 = 3000;
			} else {
				this.method461("js5connect");
				Static226.anInt4903 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method481() {
		Static20.method286(this);
		for (Static4.anInt115 = 0; Static53.method1335() && Static4.anInt115 < 128; Static4.anInt115++) {
			Static224.anIntArray788[Static4.anInt115] = Static92.anInt2046;
			Static22.anIntArray53[Static4.anInt115] = Static153.anInt3538;
		}
		Static44.anInt797++;
		if (Static166.anInt1143 != -1) {
			Static179.method3304(Static134.anInt3131, Static166.anInt1143, Static30.anInt546, 0, 0, 0, 0);
		}
		Static133.anInt3087++;
		Static26.method346();
		while (true) {
			@Pc(62) Class2_Sub1 local62;
			@Pc(67) Class64 local67;
			@Pc(78) Class64 local78;
			do {
				local62 = (Class2_Sub1) Static23.aClass44_7.method1365();
				if (local62 == null) {
					while (true) {
						do {
							local62 = (Class2_Sub1) Static150.aClass44_39.method1365();
							if (local62 == null) {
								while (true) {
									do {
										local62 = (Class2_Sub1) Static37.aClass44_9.method1365();
										if (local62 == null) {
											if (Static227.aClass64_17 != null) {
												Static125.method1285();
												return;
											}
											return;
										}
										local67 = local62.aClass64_1;
										if (local67.anInt2993 < 0) {
											break;
										}
										local78 = Static204.method3618(local67.anInt3075);
									} while (local78 == null || local78.aClass64Array2 == null || local78.aClass64Array2.length <= local67.anInt2993 || local78.aClass64Array2[local67.anInt2993] != local67);
									Static50.method649(local62);
								}
							}
							local67 = local62.aClass64_1;
							if (local67.anInt2993 < 0) {
								break;
							}
							local78 = Static204.method3618(local67.anInt3075);
						} while (local78 == null || local78.aClass64Array2 == null || local78.aClass64Array2.length <= local67.anInt2993 || local67 != local78.aClass64Array2[local67.anInt2993]);
						Static50.method649(local62);
					}
				}
				local67 = local62.aClass64_1;
				if (local67.anInt2993 < 0) {
					break;
				}
				local78 = Static204.method3618(local67.anInt3075);
			} while (local78 == null || local78.aClass64Array2 == null || local78.aClass64Array2.length <= local67.anInt2993 || local78.aClass64Array2[local67.anInt2993] != local67);
			Static50.method649(local62);
		}
	}
}
