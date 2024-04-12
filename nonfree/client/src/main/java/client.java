import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!o;")
	public static Class40 aClass40_110 = Static12.method257("");

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Lclient!o;")
	public static Class40 aClass40_109 = Static12.method257("green:");

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_111 = Static12.method257("Report abuse @whi@");

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt410 = 0;

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 4)
	@Override
	protected void method330() {
		if (Class2_Sub2_Sub11.anInt1075 == 0) {
			Static83.method1467(null, Class60.aClass40_680, Class59.anInt2194);
		} else if (Class2_Sub2_Sub11.anInt1075 == 5) {
			Static93.method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, Static23.aGraphics1, Static13.aClass2_Sub2_Sub2_Sub2_1);
		} else if (Class2_Sub2_Sub11.anInt1075 == 10) {
			Static93.method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, Static23.aGraphics1, Static13.aClass2_Sub2_Sub2_Sub2_1);
		} else if (Class2_Sub2_Sub11.anInt1075 == 20) {
			Static93.method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, Static23.aGraphics1, Static13.aClass2_Sub2_Sub2_Sub2_1);
		} else if (Class2_Sub2_Sub11.anInt1075 == 25) {
			@Pc(97) int local97;
			if (Applet_Sub1.anInt375 == 1) {
				if (Class2_Sub6.anInt805 < Class2_Sub2_Sub11.anInt1080) {
					Class2_Sub6.anInt805 = Class2_Sub2_Sub11.anInt1080;
				}
				local97 = (Class2_Sub6.anInt805 - Class2_Sub2_Sub11.anInt1080) * 50 / Class2_Sub6.anInt805;
				Static61.method1095(true, Static72.method1334(new Class40[] { Class9.aClass40_63, Static48.method859(local97), Class2_Sub2_Sub11.aClass40_335 }), Class60.aClass40_674);
			} else if (Applet_Sub1.anInt375 == 2) {
				if (Class2_Sub2.anInt2455 < Class38.anInt1667) {
					Class2_Sub2.anInt2455 = Class38.anInt1667;
				}
				local97 = (Class2_Sub2.anInt2455 - Class38.anInt1667) * 50 / Class2_Sub2.anInt2455 + 50;
				Static61.method1095(true, Static72.method1334(new Class40[] { Class9.aClass40_63, Static48.method859(local97), Class2_Sub2_Sub11.aClass40_335 }), Class60.aClass40_674);
			} else {
				Static61.method1095(false, null, Class60.aClass40_674);
			}
		} else if (Class2_Sub2_Sub11.anInt1075 == 30) {
			Static86.method1489();
		} else if (Class2_Sub2_Sub11.anInt1075 == 35) {
			Static86.method1492();
		} else if (Class2_Sub2_Sub11.anInt1075 == 40) {
			Static61.method1095(false, Class3.aClass40_13, Class62.aClass40_714);
		}
		Class2_Sub2_Sub12_Sub1.anInt2326 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 92)
	private void method341(@OriginalArg(1) int arg0) {
		Class38.anInt1675 = 0;
		Class20.anInt695++;
		if (Static88.anInt2341 == Static54.anInt1500) {
			Static54.anInt1500 = Static47.anInt1173;
		} else {
			Static54.anInt1500 = Static88.anInt2341;
		}
		Static27.aClass25_15 = null;
		Static72.aClass48_7 = null;
		if (Class20.anInt695 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Class2_Sub2_Sub11.anInt1075 > 5) {
				Class27.anInt1097 = 3000;
			} else {
				this.method333("js5connect_full");
				Class2_Sub2_Sub11.anInt1075 = 1000;
			}
		} else if (Class20.anInt695 >= 2 && arg0 == 6) {
			this.method333("js5connect_outofdate");
			Class2_Sub2_Sub11.anInt1075 = 1000;
		} else if (Class20.anInt695 >= 4) {
			if (Class2_Sub2_Sub11.anInt1075 <= 5) {
				this.method333("js5connect");
				Class2_Sub2_Sub11.anInt1075 = 1000;
			} else {
				Class27.anInt1097 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 150)
	@Override
	protected void method327() {
		Static88.anInt2341 = Class56.anInt2132 == 0 ? 43594 : Class5_Sub1.anInt140 + 40000;
		Static54.anInt1500 = Static88.anInt2341;
		Static47.anInt1173 = Class56.anInt2132 == 0 ? 443 : Class5_Sub1.anInt140 + 50000;
		Static51.method1538();
		Static35.method712(Static7.method185());
		Static62.method1097(Static7.method185());
		Static95.anInt2495 = Class7.anInt248;
		try {
			@Pc(55) int local55;
			if (Static91.aClass7_2.aClass16_1 != null) {
				Static61.aClass14_4 = new Class14(Static91.aClass7_2.aClass16_1, 5200, 0);
				for (local55 = 0; local55 < 12; local55++) {
					Class3.aClass14Array1[local55] = new Class14(Static91.aClass7_2.aClass16Array2[local55], 6000, 0);
				}
				Static97.aClass14_5 = new Class14(Static91.aClass7_2.aClass16_3, 6000, 0);
				Static68.aClass11_4 = new Class11(255, Static61.aClass14_4, Static97.aClass14_5, 500000);
				Static91.aClass7_2.aClass16_3 = null;
				Static91.aClass7_2.aClass16_1 = null;
				Static91.aClass7_2.aClass16Array2 = null;
			}
			if (Static91.aClass7_2.aClass16_2 != null) {
				Static9.aClass14_1 = new Class14(Static91.aClass7_2.aClass16_2, 5200, 0);
				for (local55 = 0; local55 < 5; local55++) {
					Class2_Sub6.aClass14Array2[local55] = new Class14(Static91.aClass7_2.aClass16Array1[local55], 6000, 0);
				}
				Static91.aClass7_2.aClass16_2 = null;
				Static91.aClass7_2.aClass16Array1 = null;
			}
		} catch (@Pc(144) IOException local144) {
			Static61.aClass14_4 = null;
			Static9.aClass14_1 = null;
			Static97.aClass14_5 = null;
			Static68.aClass11_4 = null;
		}
		if (Class56.anInt2132 != 0) {
			Class2_Sub2_Sub12_Sub1_Sub2.aBoolean173 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 221)
	private void method342() {
		if (Class2_Sub2_Sub11.anInt1075 != 1000) {
			@Pc(10) boolean local10 = Static32.method625();
			if (!local10) {
				this.method343();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 293)
	@Override
	public void init() {
		if (!this.method331()) {
			return;
		}
		Class5_Sub1.anInt140 = Integer.parseInt(this.getParameter("worldid"));
		Class18_Sub1.anInt475 = Integer.parseInt(this.getParameter("modewhat"));
		Class56.anInt2132 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static29.method1676();
		} else {
			Static7.method188();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Class15.aBoolean37 = true;
		} else {
			Class15.aBoolean37 = false;
		}
		this.method326(Class18_Sub1.anInt475 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 334)
	private void method343() {
		if (Class40.anInt1792 >= 4) {
			this.method333("js5crc");
			Class2_Sub2_Sub11.anInt1075 = 1000;
			return;
		}
		if (Class61.anInt2401 >= 4) {
			if (Class2_Sub2_Sub11.anInt1075 <= 5) {
				this.method333("js5io");
				Class2_Sub2_Sub11.anInt1075 = 1000;
				return;
			}
			Class61.anInt2401 = 3;
			Class27.anInt1097 = 3000;
		}
		if (Class27.anInt1097-- > 0) {
			return;
		}
		try {
			if (Class38.anInt1675 == 0) {
				Static72.aClass48_7 = Static91.aClass7_2.method202(Static54.anInt1500);
				Class38.anInt1675++;
			}
			if (Class38.anInt1675 == 1) {
				if (Static72.aClass48_7.anInt1928 == 2) {
					this.method341(-1);
					return;
				}
				if (Static72.aClass48_7.anInt1928 == 1) {
					Class38.anInt1675++;
				}
			}
			if (Class38.anInt1675 == 2) {
				Static27.aClass25_15 = new Class25((Socket) Static72.aClass48_7.anObject4, Static91.aClass7_2);
				@Pc(103) Class2_Sub3 local103 = new Class2_Sub3(5);
				local103.method1703(15);
				local103.method1725(410);
				Static27.aClass25_15.method731(local103.aByteArray24, 5);
				Class38.anInt1675++;
				Static11.aLong24 = System.currentTimeMillis();
			}
			if (Class38.anInt1675 == 3) {
				if (Class2_Sub2_Sub11.anInt1075 <= 5 || Static27.aClass25_15.method728() > 0) {
					@Pc(142) int local142 = Static27.aClass25_15.method726();
					if (local142 != 0) {
						this.method341(local142);
						return;
					}
					Class38.anInt1675++;
				} else if (System.currentTimeMillis() - Static11.aLong24 > 30000L) {
					this.method341(-2);
					return;
				}
			}
			if (Class38.anInt1675 == 4) {
				Static73.method1336(Static27.aClass25_15, Class2_Sub2_Sub11.anInt1075 > 20);
				Class20.anInt695 = 0;
				Static72.aClass48_7 = null;
				Static27.aClass25_15 = null;
				Class38.anInt1675 = 0;
			}
		} catch (@Pc(196) IOException local196) {
			this.method341(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 455)
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 5) {
				Static84.method1480();
			}
			Class5_Sub1.anInt140 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Class56.anInt2132 = 0;
			} else if (arg0[1].equals("office")) {
				Class56.anInt2132 = 1;
			} else if (arg0[1].equals("local")) {
				Class56.anInt2132 = 2;
			} else {
				Static84.method1480();
			}
			if (arg0[2].equals("live")) {
				Class18_Sub1.anInt475 = 0;
			} else if (arg0[2].equals("rc")) {
				Class18_Sub1.anInt475 = 1;
			} else if (arg0[2].equals("wip")) {
				Class18_Sub1.anInt475 = 2;
			} else {
				Static84.method1480();
			}
			if (arg0[3].equals("lowmem")) {
				Static29.method1676();
			} else if (arg0[3].equals("highmem")) {
				Static7.method188();
			} else {
				Static84.method1480();
			}
			if (arg0[4].equals("free")) {
				Class15.aBoolean37 = false;
			} else if (arg0[4].equals("members")) {
				Class15.aBoolean37 = true;
			} else {
				Static84.method1480();
			}
			@Pc(124) client local124 = new client();
			local124.method339("runescape", Class18_Sub1.anInt475 + 32, InetAddress.getLocalHost());
		} catch (@Pc(138) Exception local138) {
			Static36.method727(null, local138);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 569)
	@Override
	protected void method332() {
		Static15.method344();
		Static66.method1170();
		Static63.method325();
		Static83.method1466();
		Static71.method1278();
		Static70.method1472();
		Static46.method847();
		Static76.method1358();
		Static21.method1689();
		Static36.method733();
		Static4.method96();
		Static16.method345();
		Static12.method254();
		Static88.method1554();
		Static98.method1738();
		Static103.method571();
		Static81.method1431();
		Static26.method541();
		Static49.method919();
		Static69.method1219();
		Static58.method1058();
		Static82.method1464();
		Static55.method1003();
		Static51.method1546();
		Static33.method635();
		Static31.method613();
		Static7.method191();
		Static29.method1679();
		Static10.method234();
		Static34.method642();
		Static43.method1635();
		Static91.method70();
		Static72.method1328();
		Static24.method525();
		Static65.method1150();
		Static13.method263();
		Static64.method1112();
		Static61.method1093();
		Static80.method1405();
		Static45.method1531();
		Static90.method1569();
		Static1.method5();
		Static3.method24();
		Static74.method1346();
		Static109.method1102();
		Static47.method852();
		Static95.method1652();
		Static77.method1363();
		Static86.method1498();
		Static99.method1653();
		Static2.method20();
		Static96.method1666();
		Static67.method1206();
		Static38.method753();
		Static54.method994();
		Static6.method180();
		Static25.method1605();
		Static56.method1041();
		Static27.method581();
		Static62.method1096();
		Static22.method474();
		Static94.method1643();
		Static92.method1580();
		Static39.method775();
		Static35.method720();
		Static79.method1398();
		Static23.method506();
		Static5.method118();
		Static41.method790();
		Static20.method398();
		Static37.method740();
		Static68.method1211();
		Static28.method584();
		Static73.method1339();
		Static85.method1488();
		Static106.method842();
		Static9.method229();
		Static50.method940();
		Static87.method1520();
		Static18.method368();
		Static53.method991();
		Static78.method1382();
		Static57.method1043();
		Static32.method622();
		Static42.method802();
		Static19.method386();
		Static84.method1482();
		Static75.method1352();
		Static59.method1064();
		Static97.method1670();
		Static111.method1272();
		Static93.method1591();
		Static105.method804();
		Static30.method593();
		Static48.method858();
		Static40.method1245();
		Static11.method250();
		Static104.method1086();
		Static60.method1092();
		Static17.method356();
		Static89.method1562();
		Static14.method1264();
		Static100.method224();
		Static44.method823();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 686)
	@Override
	protected void method334() {
		if (Static41.aClass52_1 != null) {
			Static41.aClass52_1.aBoolean157 = false;
		}
		Static41.aClass52_1 = null;
		if (Static64.aClass25_36 != null) {
			Static64.aClass25_36.method730();
		}
		Static45.method1530();
		Static51.method1541();
		Static86.method1493();
		Static7.method183();
		Static88.method1550();
		Static71.method1279();
		try {
			if (Static61.aClass14_4 != null) {
				Static61.aClass14_4.method353();
			}
			@Pc(43) int local43;
			if (Class3.aClass14Array1 != null) {
				for (local43 = 0; local43 < Class3.aClass14Array1.length; local43++) {
					if (Class3.aClass14Array1[local43] != null) {
						Class3.aClass14Array1[local43].method353();
					}
				}
			}
			if (Static97.aClass14_5 != null) {
				Static97.aClass14_5.method353();
			}
			if (Static9.aClass14_1 != null) {
				Static9.aClass14_1.method353();
			}
			if (Class2_Sub6.aClass14Array2 != null) {
				for (local43 = 0; local43 < Class2_Sub6.aClass14Array2.length; local43++) {
					if (Class2_Sub6.aClass14Array2[local43] != null) {
						Class2_Sub6.aClass14Array2[local43].method353();
					}
				}
			}
		} catch (@Pc(95) IOException local95) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 779)
	@Override
	protected void method329() {
		Class24.anInt2511++;
		this.method342();
		Static73.method1341();
		Static86.method1500();
		Static16.method347();
		Static62.method1101();
		Static49.method916();
		if (Class2_Sub2_Sub11.anInt1075 == 0) {
			Static95.method1647();
			Static24.method524();
		} else if (Class2_Sub2_Sub11.anInt1075 == 5) {
			Static95.method1647();
			Static24.method524();
		} else if (Class2_Sub2_Sub11.anInt1075 == 10) {
			Static51.method1548();
		} else if (Class2_Sub2_Sub11.anInt1075 == 20) {
			Static51.method1548();
			Static40.method1246();
		} else if (Class2_Sub2_Sub11.anInt1075 == 25) {
			Static67.method1205();
		}
		if (Class2_Sub2_Sub11.anInt1075 == 30) {
			Static84.method1479();
		} else if (Class2_Sub2_Sub11.anInt1075 == 35) {
			Static84.method1479();
		} else if (Class2_Sub2_Sub11.anInt1075 == 40) {
			Static40.method1246();
			return;
		}
	}
}
