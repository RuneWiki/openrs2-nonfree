import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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
				Static126.method2091("argument count");
			}
			Static124.anInt2686 = Integer.parseInt(arg0[0]);
			Static251.anInt4743 = 2;
			if (arg0[1].equals("live")) {
				Static275.anInt5146 = 0;
			} else if (arg0[1].equals("rc")) {
				Static275.anInt5146 = 1;
			} else if (arg0[1].equals("wip")) {
				Static275.anInt5146 = 2;
			} else {
				Static126.method2091("modewhat");
			}
			Static148.aBoolean198 = false;
			Static139.anInt2870 = Static294.method3440(arg0[2]);
			if (Static139.anInt2870 == -1) {
				if (arg0[2].equals("english")) {
					Static139.anInt2870 = 0;
				} else if (arg0[2].equals("german")) {
					Static139.anInt2870 = 1;
				} else {
					Static126.method2091("language");
				}
			}
			Static257.method3883(Static139.anInt2870);
			Static175.aBoolean213 = false;
			Static287.aBoolean169 = false;
			if (arg0[3].equals("game0")) {
				Static132.anInt2784 = 0;
			} else if (arg0[3].equals("game1")) {
				Static132.anInt2784 = 1;
			} else {
				Static126.method2091("game");
			}
			Static168.anInt3340 = 0;
			Static145.aBoolean193 = false;
			Static245.anInt4683 = 0;
			Static90.aString56 = "";
			@Pc(129) client local129 = new client();
			Static114.aClient1 = local129;
			local129.method658(Static275.anInt5146 + 32, "runescape");
			Static27.aFrame3.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static244.method3721(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method666()) {
			return;
		}
		Static124.anInt2686 = Integer.parseInt(this.getParameter("worldid"));
		Static251.anInt4743 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static251.anInt4743 < 0 || Static251.anInt4743 > 1) {
			Static251.anInt4743 = 0;
		}
		Static275.anInt5146 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static275.anInt5146 < 0 || Static275.anInt5146 > 2) {
			Static275.anInt5146 = 0;
		}
		@Pc(53) String local53 = this.getParameter("advertsuppressed");
		if (local53 != null && local53.equals("1")) {
			Static148.aBoolean198 = true;
		} else {
			Static148.aBoolean198 = false;
		}
		try {
			Static139.anInt2870 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(73) Exception local73) {
			Static139.anInt2870 = 0;
		}
		Static257.method3883(Static139.anInt2870);
		@Pc(82) String local82 = this.getParameter("objecttag");
		if (local82 != null && local82.equals("1")) {
			Static175.aBoolean213 = true;
		} else {
			Static175.aBoolean213 = false;
		}
		@Pc(98) String local98 = this.getParameter("js");
		if (local98 != null && local98.equals("1")) {
			Static287.aBoolean169 = true;
		} else {
			Static287.aBoolean169 = false;
		}
		@Pc(115) String local115 = this.getParameter("game");
		if (local115 != null && local115.equals("1")) {
			Static132.anInt2784 = 1;
		} else {
			Static132.anInt2784 = 0;
		}
		try {
			Static168.anInt3340 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(135) Exception local135) {
			Static168.anInt3340 = 0;
		}
		Static90.aString56 = this.getParameter("settings");
		if (Static90.aString56 == null) {
			Static90.aString56 = "";
		}
		@Pc(151) String local151 = this.getParameter("country");
		if (local151 != null) {
			try {
				Static245.anInt4683 = Integer.parseInt(local151);
			} catch (@Pc(159) Exception local159) {
				Static245.anInt4683 = 0;
			}
		}
		@Pc(165) String local165 = this.getParameter("haveie6");
		if (local165 != null && local165.equals("1")) {
			Static145.aBoolean193 = true;
		} else {
			Static145.aBoolean193 = false;
		}
		Static114.aClient1 = this;
		this.method663(Static275.anInt5146 + 32);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method671() {
		if (Static103.aClass113_1.anInt3388 > Static14.anInt2091) {
			if (Static275.anInt5134 == Static187.anInt3757) {
				Static187.anInt3757 = Static101.anInt4750;
			} else {
				Static187.anInt3757 = Static275.anInt5134;
			}
			Static73.anInt1334 = (Static103.aClass113_1.anInt3388 * 50 - 50) * 5;
			if (Static73.anInt1334 > 3000) {
				Static73.anInt1334 = 3000;
			}
			if (Static103.aClass113_1.anInt3388 >= 2 && Static103.aClass113_1.anInt3387 == 6) {
				this.method659("js5connect_outofdate");
				Static267.anInt3573 = 1000;
				return;
			}
			if (Static103.aClass113_1.anInt3388 >= 4 && Static103.aClass113_1.anInt3387 == -1) {
				this.method659("js5crc");
				Static267.anInt3573 = 1000;
				return;
			}
			if (Static103.aClass113_1.anInt3388 >= 4 && (Static267.anInt3573 == 0 || Static267.anInt3573 == 5)) {
				if (Static103.aClass113_1.anInt3387 == 7 || Static103.aClass113_1.anInt3387 == 9) {
					this.method659("js5connect_full");
				} else if (Static103.aClass113_1.anInt3387 <= 0) {
					this.method659("js5io");
				} else {
					this.method659("js5connect");
				}
				Static267.anInt3573 = 1000;
				return;
			}
		}
		Static14.anInt2091 = Static103.aClass113_1.anInt3388;
		if (Static73.anInt1334 > 0) {
			Static73.anInt1334--;
			return;
		}
		try {
			if (Static232.anInt4528 == 0) {
				Static48.aClass123_1 = Static87.aClass164_2.method3941(Static28.aString8, Static187.anInt3757);
				Static232.anInt4528++;
			}
			if (Static232.anInt4528 == 1) {
				if (Static48.aClass123_1.anInt3791 == 2) {
					this.method676(1000);
					return;
				}
				if (Static48.aClass123_1.anInt3791 == 1) {
					Static232.anInt4528++;
				}
			}
			if (Static232.anInt4528 == 2) {
				Static82.aClass158_1 = new Class158((Socket) Static48.aClass123_1.anObject4, Static87.aClass164_2);
				@Pc(194) Class4_Sub17 local194 = new Class4_Sub17(5);
				local194.method1861(15);
				local194.method1854(542);
				Static82.aClass158_1.method3780(local194.aByteArray30, 5);
				Static232.anInt4528++;
				Static276.aLong184 = Static133.method2163();
			}
			if (Static232.anInt4528 == 3) {
				if (Static267.anInt3573 == 0 || Static267.anInt3573 == 5 || Static82.aClass158_1.method3774() > 0) {
					@Pc(242) int local242 = Static82.aClass158_1.method3777();
					if (local242 != 0) {
						this.method676(local242);
						return;
					}
					Static232.anInt4528++;
				} else if (Static133.method2163() - Static276.aLong184 > 30000L) {
					this.method676(1001);
					return;
				}
			}
			if (Static232.anInt4528 == 4) {
				@Pc(295) boolean local295 = Static267.anInt3573 == 5 || Static267.anInt3573 == 10 || Static267.anInt3573 == 28;
				Static103.aClass113_1.method2679(Static82.aClass158_1, !local295);
				Static48.aClass123_1 = null;
				Static82.aClass158_1 = null;
				Static232.anInt4528 = 0;
			}
		} catch (@Pc(312) IOException local312) {
			this.method676(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method668() {
		if (Static267.anInt3573 == 1000) {
			return;
		}
		Static104.anInt2226++;
		if (Static104.anInt2226 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static207.anInt4059 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static103.aRandom1.setSeed((long) Static207.anInt4059);
		}
		this.method684();
		if (Static28.aClass162_1 != null) {
			Static28.aClass162_1.method3844();
		}
		Static81.method3267();
		Static81.method3275();
		Static217.method3491();
		Static216.method3445();
		if (Static178.aBoolean216) {
			Static163.method2527();
		}
		if (Static223.aClass130_1 != null) {
			@Pc(82) int local82 = Static223.aClass130_1.method3215();
			Static44.anInt887 = local82;
		}
		if (Static267.anInt3573 == 0) {
			this.method678();
			Static62.method959();
		} else if (Static267.anInt3573 == 5) {
			this.method678();
			Static62.method959();
		} else if (Static267.anInt3573 == 25 || Static267.anInt3573 == 28) {
			Static113.method1931();
		}
		if (Static267.anInt3573 == 10) {
			this.method680();
			Static268.method4007();
			Static3.method48();
			Static101.method3791();
		} else if (Static267.anInt3573 == 30) {
			Static294.method3439();
		} else if (Static267.anInt3573 == 40) {
			Static101.method3791();
			if (Static254.anInt4785 != -3) {
				if (Static254.anInt4785 == 15) {
					Static196.method3058();
				} else if (Static254.anInt4785 != 2) {
					Static180.method2828();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method664() {
		Static40.method674();
		Static59.method2489();
		Static88.method1416();
		Static10.method173();
		Static82.method1276();
		Static206.method3289();
		Static114.method1940();
		Static174.method2714();
		Static176.method655();
		Static178.method2790();
		Static267.method2845();
		Static265.method3984();
		Static5.method124();
		Static198.method1846();
		Static250.method3776();
		Static170.method2682();
		Static1.method1();
		Static255.method3849();
		Static259.method3915();
		Static148.method2387();
		Static212.method3390();
		Static124.method2087();
		Static49.method840();
		Static96.method1558();
		Static110.method1903();
		Static103.method1664();
		Static121.method2049();
		Static211.method3381();
		Static11.method183();
		Static21.method3457();
		Static147.method2368();
		Static227.method3210();
		Static95.method1530();
		Static153.method2438();
		Static77.method1198();
		Static81.method3281();
		Static93.method1492();
		Static223.method3567();
		Static220.method3522();
		Static83.method3372();
		Static52.method862();
		Static281.method4240();
		Static278.method4131();
		Static51.method854();
		Static180.method2838();
		Static284.method4272();
		Static42.method694();
		Static217.method3495();
		Static243.method3717();
		Static41.method687();
		Static89.method1423();
		Static215.method3429();
		Static125.method2088();
		Static22.method368();
		Static181.method1755();
		Static44.method704();
		Static127.method2093();
		Static155.method2473();
		Static274.method4075();
		Static58.method932();
		Static249.method3766();
		Static99.method1609();
		Static87.method1403();
		Static126.method2092();
		Static201.method3115();
		Static291.method4309();
		Static92.method1490();
		Static208.method3342();
		Static244.method3720();
		Static203.method3181();
		Static37.method607();
		Static102.method1650();
		Static237.method3673();
		Static182.method2850();
		Static163.method2530();
		Static4.method52();
		Static146.method2351();
		Static32.method474();
		Static101.method3789();
		Static293.method4192();
		Static251.method3783();
		Static3.method42();
		Static226.method3596();
		Static79.method1227();
		Static158.method2492();
		Static20.method365();
		Static12.method194();
		Static247.method3750();
		Static242.method3909();
		Static16.method276();
		Static14.method1608();
		Static166.method2626();
		Static167.method2634();
		Static141.method2288();
		Static299.method4402();
		Static209.method4395();
		Static113.method1936();
		Static221.method3529();
		Static97.method1572();
		Static94.method1514();
		Static122.method2057();
		Static269.method4011();
		Static116.method2001();
		Static194.method3025();
		Static117.method2008();
		Static137.method2183();
		Static285.method4284();
		Static205.method3260();
		Static90.method1441();
		Static184.method2886();
		Static57.method924();
		Static80.method1245();
		Static18.method325();
		Static123.method2071();
		Static62.method956();
		Static33.method483();
		Static224.method3582();
		Static115.method1992();
		Static287.method1964();
		Static264.method3978();
		Static213.method3415();
		Static13.method224();
		Static152.method2437();
		Static204.method3224();
		Static45.method712();
		Static120.method2046();
		Static69.method1049();
		Static72.method1081();
		Static86.method1381();
		Static231.method3627();
		Static195.method3029();
		Static106.method1731();
		Static188.method3007();
		Static136.method2177();
		Static132.method2158();
		Static138.method2261();
		Static172.method2701();
		Static70.method3360();
		Static91.method1455();
		Static276.method4106();
		Static225.method3586();
		Static66.method1014();
		Static159.method2495();
		Static210.method3350();
		Static25.method382();
		Static290.method4307();
		Static228.method3606();
		Static6.method135();
		Static165.method2604();
		Static230.method3621();
		Static135.method2176();
		Static64.method982();
		Static282.method4244();
		Static76.method1155();
		Static261.method3954();
		Static29.method455();
		Static186.method2965();
		Static144.method2329();
		Static273.method910();
		Static28.method437();
		Static53.method867();
		Static295.method4350();
		Static286.method4295();
		Static173.method2712();
		Static24.method379();
		Static199.method3085();
		Static169.method2668();
		Static289.method4306();
		Static15.method267();
		Static140.method2281();
		Static175.method2722();
		Static207.method3307();
		Static262.method3967();
		Static139.method2269();
		Static161.method2513();
		Static61.method951();
		Static214.method3422();
		Static185.method2908();
		Static55.method878();
		Static192.method3015();
		Static193.method3017();
		Static8.method154();
		Static34.method488();
		Static288.method1917();
		Static111.method1919();
		Static39.method4120();
		Static256.method3857();
		Static190.method3011();
		Static130.method2152();
		Static78.method1209();
		Static241.method3696();
		Static112.method1926();
		Static68.method1042();
		Static107.method1743();
		Static253.method3810();
		Static119.method2039();
		Static160.method2500();
		Static252.method3786();
		Static36.method518();
		Static9.method170();
		Static143.method2315();
		Static19.method350();
		Static218.method4261();
		Static43.method4385();
		Static131.method2157();
		Static248.method3760();
		Static283.method4253();
		Static134.method2173();
		Static35.method514();
		Static27.method1073();
		Static270.method4036();
		Static296.method1373();
		Static236.method2947();
		Static229.method4266();
		Static232.method3632();
		Static277.method4116();
		Static171.method2690();
		Static187.method2993();
		Static196.method3055();
		Static271.method4061();
		Static222.method3557();
		Static154.method2469();
		Static200.method3112();
		Static245.method3748();
		Static280.method4226();
		Static279.method4163();
		Static74.method1123();
		Static142.method2313();
		Static100.method1637();
		Static105.method1724();
		Static75.method1150();
		Static47.method750();
		Static298.method4388();
		Static71.method1076();
		Static84.method1326();
		Static65.method1012();
		Static129.method2128();
		Static118.method2031();
		Static67.method1039();
		Static177.method2745();
		Static275.method4098();
		Static197.method3083();
		Static104.method1699();
		Static168.method2662();
		Static48.method837();
		Static257.method3880();
		Static234.method3667();
		Static26.method406();
		Static219.method3517();
		Static254.method3836();
		Static179.method2813();
		Static294.method3441();
		Static240.method3999();
		Static216.method3443();
		Static268.method4001();
		Static46.method724();
		Static263.method723();
		Static272.method4072();
		Static239.method3684();
		Static85.method1339();
		Static63.method969();
		Static235.method3671();
		Static2.method11();
		Static150.method2410();
		Static23.method375();
		Static38.method624();
		Static191.method3989();
		Static233.method3645();
		Static151.method2417();
		Static145.method2349();
		Static266.method3995();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method676(@OriginalArg(1) int arg0) {
		Static103.aClass113_1.anInt3388++;
		Static82.aClass158_1 = null;
		Static103.aClass113_1.anInt3387 = arg0;
		Static232.anInt4528 = 0;
		Static48.aClass123_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method662() {
		Static97.method1571();
		Static191.aClass1_7 = new Class1();
		Static103.aClass113_1 = new Class113();
		if (Static275.anInt5146 != 0) {
			Static175.aByteArrayArray14 = new byte[50][];
		}
		Static77.method1191(Static87.aClass164_2);
		if (Static251.anInt4743 == 0) {
			Static145.aString98 = this.getCodeBase().getHost();
			Static28.anInt524 = 443;
			Static173.anInt3426 = 43594;
		} else if (Static251.anInt4743 == 1) {
			Static145.aString98 = this.getCodeBase().getHost();
			Static28.anInt524 = Static124.anInt2686 + 50000;
			Static173.anInt3426 = Static124.anInt2686 + 40000;
		} else if (Static251.anInt4743 == 2) {
			Static173.anInt3426 = Static124.anInt2686 + 40000;
			Static145.aString98 = "127.0.0.1";
			Static28.anInt524 = Static124.anInt2686 + 50000;
		}
		Static28.aString8 = Static145.aString98;
		Static181.aShortArray23 = Static231.aShortArray76 = Static67.aShortArray11 = Static200.aShortArray50 = new short[256];
		if (Static260.anInt4951 == 3 && Static251.anInt4743 != 2) {
			Static211.anInt4204 = Static124.anInt2686;
		}
		Static90.anInt1866 = Static173.anInt3426;
		Static275.anInt5134 = Static173.anInt3426;
		Static101.anInt4750 = Static28.anInt524;
		if (Static132.anInt2784 == 1) {
			Static184.aShortArray39 = Static256.aShortArray78;
			Static274.aShortArrayArray5 = Static284.aShortArrayArray6;
			Static291.anInt5436 = 0;
			Static291.anInt5435 = 16777215;
			Static118.aShortArrayArray1 = Static268.aShortArrayArray4;
			Static28.aShortArray3 = Static274.aShortArray85;
			Static86.aBoolean133 = true;
		} else {
			Static184.aShortArray39 = Static71.aShortArray12;
			Static28.aShortArray3 = Static222.aShortArray73;
			Static118.aShortArrayArray1 = Static249.aShortArrayArray3;
			Static274.aShortArrayArray5 = Static161.aShortArrayArray2;
		}
		Static187.anInt3757 = Static90.anInt1866;
		Static98.method1590();
		Static161.method2516(Static235.aCanvas1);
		Static43.method4382(Static235.aCanvas1);
		Static223.aClass130_1 = Static175.method2723();
		if (Static223.aClass130_1 != null) {
			Static223.aClass130_1.method3217(Static235.aCanvas1);
		}
		Static152.anInt3081 = Static260.anInt4951;
		try {
			if (Static87.aClass164_2.aClass50_4 != null) {
				Static103.aClass137_1 = new Class137(Static87.aClass164_2.aClass50_4, 5200, 0);
				for (@Pc(168) int local168 = 0; local168 < 29; local168++) {
					Static99.aClass137Array1[local168] = new Class137(Static87.aClass164_2.aClass50Array1[local168], 6000, 0);
				}
				Static118.aClass137_4 = new Class137(Static87.aClass164_2.aClass50_3, 6000, 0);
				Static267.aClass79_4 = new Class79(255, Static103.aClass137_1, Static118.aClass137_4, 500000);
				Static287.aClass137_3 = new Class137(Static87.aClass164_2.aClass50_2, 24, 0);
				Static87.aClass164_2.aClass50_2 = null;
				Static87.aClass164_2.aClass50_4 = null;
				Static87.aClass164_2.aClass50_3 = null;
				Static87.aClass164_2.aClass50Array1 = null;
			}
		} catch (@Pc(224) IOException local224) {
			Static287.aClass137_3 = null;
			Static118.aClass137_4 = null;
			Static103.aClass137_1 = null;
			Static267.aClass79_4 = null;
		}
		Static184.aString121 = Static124.aString78;
		if (Static251.anInt4743 != 0) {
			Static131.aBoolean184 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method660() {
		if (Static267.anInt3573 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static89.method1426() / 1000000L - Static256.aLong173;
		Static256.aLong173 = Static89.method1426() / 1000000L;
		@Pc(32) boolean local32 = Static14.method1602();
		if (local32 && Static190.aBoolean244 && Static83.aClass51_4 != null) {
			Static83.aClass51_4.method3272();
		}
		if ((Static267.anInt3573 == 30 || Static267.anInt3573 == 10) && (Static115.aBoolean170 || Static284.aLong192 != 0L && Static284.aLong192 < Static133.method2163())) {
			Static82.method1277(Static115.aBoolean170, Static40.method683(), Static224.anInt4445, Static176.anInt808);
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static55.aFrame2 == null) {
			@Pc(78) Container local78;
			if (Static55.aFrame2 != null) {
				local78 = Static55.aFrame2;
			} else if (Static27.aFrame3 == null) {
				local78 = Static87.aClass164_2.anApplet1;
			} else {
				local78 = Static27.aFrame3;
			}
			local90 = local78.getSize().width;
			local94 = local78.getSize().height;
			if (Static27.aFrame3 == local78) {
				@Pc(101) Insets local101 = Static27.aFrame3.getInsets();
				local94 -= local101.top + local101.bottom;
				local90 -= local101.right + local101.left;
			}
			if (Static179.anInt3545 != local90 || Static210.anInt4102 != local94) {
				if (Static260.aString172.startsWith("mac")) {
					Static179.anInt3545 = local90;
					Static210.anInt4102 = local94;
				} else {
					Static97.method1571();
				}
				Static284.aLong192 = Static133.method2163() + 500L;
			}
		}
		if (Static55.aFrame2 != null && !Static159.aBoolean202 && (Static267.anInt3573 == 30 || Static267.anInt3573 == 10)) {
			Static82.method1277(false, Static116.anInt2573, -1, -1);
		}
		@Pc(161) boolean local161 = false;
		if (Static196.aBoolean249) {
			local161 = true;
			Static196.aBoolean249 = false;
		}
		if (local161) {
			Static59.method2488();
		}
		if (Static178.aBoolean216) {
			for (local90 = 0; local90 < 100; local90++) {
				Static222.aBooleanArray20[local90] = true;
			}
		}
		if (Static267.anInt3573 == 0) {
			Static231.method3628(Static124.aString77, Static41.anInt852, null, local161);
		} else if (Static267.anInt3573 == 5) {
			Static155.method2475(Static289.aClass4_Sub2_Sub12_3, false);
		} else if (Static267.anInt3573 == 10) {
			Static47.method747();
		} else if (Static267.anInt3573 == 25 || Static267.anInt3573 == 28) {
			if (Static5.anInt134 == 1) {
				if (Static69.anInt1273 < Static117.anInt2596) {
					Static69.anInt1273 = Static117.anInt2596;
				}
				local90 = (Static69.anInt1273 - Static117.anInt2596) * 50 / Static69.anInt1273;
				Static265.method3986(Static86.aString50 + "<br>(" + local90 + "%)", false);
			} else if (Static5.anInt134 == 2) {
				if (Static131.anInt2782 > Static30.anInt609) {
					Static30.anInt609 = Static131.anInt2782;
				}
				local90 = (Static30.anInt609 - Static131.anInt2782) * 50 / Static30.anInt609 + 50;
				Static265.method3986(Static86.aString50 + "<br>(" + local90 + "%)", false);
			} else {
				Static265.method3986(Static86.aString50, false);
			}
		} else if (Static267.anInt3573 == 30) {
			Static233.method3644(local18);
		} else if (Static267.anInt3573 == 40) {
			Static265.method3986(Static44.aString22 + "<br>" + Static127.aString82, false);
		}
		if (Static178.aBoolean216 && Static267.anInt3573 != 0) {
			Static178.method2766();
			for (local90 = 0; local90 < Static220.anInt4365; local90++) {
				Static72.aBooleanArray11[local90] = false;
			}
		} else {
			@Pc(376) Graphics local376;
			if ((Static267.anInt3573 == 30 || Static267.anInt3573 == 10) && Static14.anInt2092 == 0 && !local161) {
				try {
					local376 = Static235.aCanvas1.getGraphics();
					for (local94 = 0; local94 < Static220.anInt4365; local94++) {
						if (Static72.aBooleanArray11[local94]) {
							Static26.aClass119_1.method3928(Static77.anIntArray154[local94], Static243.anIntArray427[local94], local376, Static267.anIntArray300[local94], Static197.anIntArray324[local94]);
							Static72.aBooleanArray11[local94] = false;
						}
					}
				} catch (@Pc(441) Exception local441) {
					Static235.aCanvas1.repaint();
				}
			} else if (Static267.anInt3573 != 0) {
				try {
					local376 = Static235.aCanvas1.getGraphics();
					Static26.aClass119_1.method3931(local376);
					for (local94 = 0; local94 < Static220.anInt4365; local94++) {
						Static72.aBooleanArray11[local94] = false;
					}
				} catch (@Pc(400) Exception local400) {
					Static235.aCanvas1.repaint();
				}
			}
		}
		if (Static16.aBoolean23) {
			Static131.method2156();
		}
		if (Static169.aBoolean209 && Static267.anInt3573 == 10 && Static25.anInt448 != -1) {
			Static169.aBoolean209 = false;
			Static102.method1649(Static87.aClass164_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method678() {
		if (!Static169.aBoolean209) {
			label259: while (true) {
				do {
					if (!Static185.method2900()) {
						break label259;
					}
				} while (Static69.aChar1 != 's' && Static69.aChar1 != 'S');
				Static169.aBoolean209 = true;
			}
		}
		@Pc(39) int local39;
		if (Static276.anInt5152 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(42) long local42 = Static133.method2163();
			if (Static92.aLong77 == 0L) {
				Static92.aLong77 = local42;
			}
			if (local39 > 16384 && local42 - Static92.aLong77 < 5000L) {
				if (local42 - Static171.aLong121 > 1000L) {
					System.gc();
					Static171.aLong121 = local42;
				}
				Static41.anInt852 = 5;
				Static124.aString77 = Static222.aString142;
			} else {
				Static41.anInt852 = 5;
				Static124.aString77 = Static113.aString72;
				Static276.anInt5152 = 10;
			}
			return;
		}
		@Pc(92) int local92;
		if (Static276.anInt5152 == 10) {
			Static12.method200();
			for (local92 = 0; local92 < 4; local92++) {
				Static121.aClass63Array1[local92] = new Class63(104, 104);
			}
			Static124.aString77 = Static83.aString131;
			Static41.anInt852 = 10;
			Static276.anInt5152 = 30;
		} else if (Static276.anInt5152 == 30) {
			if (Static28.aClass162_1 == null) {
				Static28.aClass162_1 = new Class162(Static103.aClass113_1, Static191.aClass1_7);
			}
			if (Static28.aClass162_1.method3840()) {
				Static125.aClass98_77 = Static17.method322(true, true, 0, false);
				Static262.aClass98_152 = Static17.method322(true, true, 1, false);
				Static165.aClass98_95 = Static17.method322(true, false, 2, true);
				Static34.aClass98_18 = Static17.method322(true, true, 3, false);
				Static35.aClass98_22 = Static17.method322(true, true, 4, false);
				Static106.aClass98_65 = Static17.method322(true, true, 5, true);
				Static94.aClass98_56 = Static17.method322(false, true, 6, true);
				Static34.aClass98_19 = Static17.method322(true, true, 7, false);
				Static288.aClass98_66 = Static17.method322(true, true, 8, false);
				Static145.aClass98_88 = Static17.method322(true, true, 9, false);
				Static218.aClass98_168 = Static17.method322(true, true, 10, false);
				Static28.aClass98_17 = Static17.method322(true, true, 11, false);
				Static80.aClass98_49 = Static17.method322(true, true, 12, false);
				Static197.aClass98_116 = Static17.method322(true, true, 13, false);
				Static154.aClass98_91 = Static17.method322(false, true, 14, false);
				Static24.aClass98_11 = Static17.method322(true, true, 15, false);
				Static137.aClass98_83 = Static17.method322(true, true, 16, false);
				Static71.aClass98_44 = Static17.method322(true, true, 17, false);
				Static234.aClass98_136 = Static17.method322(true, true, 18, false);
				Static142.aClass98_87 = Static17.method322(true, true, 19, false);
				Static43.aClass98_174 = Static17.method322(true, true, 20, false);
				Static142.aClass98_86 = Static17.method322(true, true, 21, false);
				Static1.aClass98_1 = Static17.method322(true, true, 22, false);
				Static234.aClass98_137 = Static17.method322(true, true, 23, true);
				Static277.aClass98_163 = Static17.method322(true, true, 24, false);
				Static43.aClass98_173 = Static17.method322(true, true, 25, false);
				Static116.aClass98_73 = Static17.method322(true, true, 26, true);
				Static62.aClass98_34 = Static17.method322(true, true, 27, false);
				Static190.aClass98_109 = Static17.method322(true, true, 28, true);
				Static276.anInt5152 = 40;
				Static41.anInt852 = 15;
				Static124.aString77 = Static97.aString63;
			} else {
				Static124.aString77 = Static180.aString117;
				Static41.anInt852 = 12;
			}
		} else if (Static276.anInt5152 == 40) {
			local92 = 0;
			for (local39 = 0; local39 < 29; local39++) {
				local92 += Static165.aClass153_Sub1Array1[local39].method3920() * Static239.anIntArray426[local39] / 100;
			}
			if (local92 == 100) {
				Static124.aString77 = Static257.aString168;
				Static41.anInt852 = 20;
				Static42.method689(Static288.aClass98_66);
				Static121.method2050(Static288.aClass98_66);
				Static25.method384(Static288.aClass98_66);
				Static276.anInt5152 = 41;
			} else {
				if (local92 != 0) {
					Static124.aString77 = Static259.aString170 + local92 + "%";
				}
				Static41.anInt852 = 20;
			}
		} else if (Static276.anInt5152 == 41) {
			if (Static190.aClass98_109.method2385()) {
				this.method682(Static190.aClass98_109.method2392(1));
				Static124.aString77 = Static104.aString66;
				Static276.anInt5152 = 45;
				Static41.anInt852 = 25;
			} else {
				Static124.aString77 = Static62.aString32 + Static190.aClass98_109.method2399() + "%";
				Static41.anInt852 = 25;
			}
		} else if (Static276.anInt5152 == 45) {
			Static256.method3858(Static159.aBoolean203);
			Static278.aClass4_Sub9_Sub2_3 = new Class4_Sub9_Sub2();
			Static278.aClass4_Sub9_Sub2_3.method1185();
			Static83.aClass51_4 = Static148.method2393(Static87.aClass164_2, 22050, Static235.aCanvas1, 0);
			Static83.aClass51_4.method3283(Static278.aClass4_Sub9_Sub2_3);
			Static11.method186(Static35.aClass98_22, Static278.aClass4_Sub9_Sub2_3, Static154.aClass98_91, Static24.aClass98_11);
			Static147.aClass51_3 = Static148.method2393(Static87.aClass164_2, 2048, Static235.aCanvas1, 1);
			Static219.aClass4_Sub9_Sub4_2 = new Class4_Sub9_Sub4();
			Static147.aClass51_3.method3283(Static219.aClass4_Sub9_Sub4_2);
			Static254.aClass56_1 = new Class56(22050, Static79.anInt1529);
			Static14.anInt2097 = Static94.aClass98_56.method2376("scape main");
			Static124.aString77 = Static22.aString5;
			Static276.anInt5152 = 50;
			Static41.anInt852 = 30;
		} else if (Static276.anInt5152 == 50) {
			local92 = Static269.method4008(Static197.aClass98_116, Static288.aClass98_66);
			local39 = Static262.method3972();
			if (local92 < local39) {
				Static41.anInt852 = 35;
				Static124.aString77 = Static63.aString34 + local92 * 100 / local39 + "%";
			} else {
				Static124.aString77 = Static67.aString35;
				Static41.anInt852 = 35;
				Static276.anInt5152 = 60;
			}
		} else if (Static276.anInt5152 == 60) {
			local92 = Static100.method1639(Static288.aClass98_66);
			local39 = Static151.method2418();
			if (local92 >= local39) {
				Static41.anInt852 = 40;
				Static124.aString77 = Static41.aString21;
				Static276.anInt5152 = 65;
			} else {
				Static124.aString77 = Static176.aString19 + local92 * 100 / local39 + "%";
				Static41.anInt852 = 40;
			}
		} else if (Static276.anInt5152 == 65) {
			Static162.method2521(Static288.aClass98_66, Static197.aClass98_116);
			Static41.anInt852 = 45;
			Static124.aString77 = Static233.aString153;
			Static264.method3976(5);
			Static276.anInt5152 = 70;
		} else if (Static276.anInt5152 == 70) {
			Static165.aClass98_95.method2385();
			local92 = Static165.aClass98_95.method2399();
			Static137.aClass98_83.method2385();
			local92 += Static137.aClass98_83.method2399();
			Static71.aClass98_44.method2385();
			local92 += Static71.aClass98_44.method2399();
			Static234.aClass98_136.method2385();
			local92 += Static234.aClass98_136.method2399();
			Static142.aClass98_87.method2385();
			local92 += Static142.aClass98_87.method2399();
			Static43.aClass98_174.method2385();
			local92 += Static43.aClass98_174.method2399();
			Static142.aClass98_86.method2385();
			local92 += Static142.aClass98_86.method2399();
			Static1.aClass98_1.method2385();
			local92 += Static1.aClass98_1.method2399();
			Static277.aClass98_163.method2385();
			local92 += Static277.aClass98_163.method2399();
			Static43.aClass98_173.method2385();
			local92 += Static43.aClass98_173.method2399();
			Static62.aClass98_34.method2385();
			local92 += Static62.aClass98_34.method2399();
			if (local92 < 1100) {
				Static124.aString77 = Static80.aString42 + local92 / 11 + "%";
				Static41.anInt852 = 50;
			} else {
				Static79.method1230(Static165.aClass98_95);
				Static158.method2491(Static165.aClass98_95);
				Static140.method2284(Static165.aClass98_95);
				Static146.method2355(Static34.aClass98_19, Static165.aClass98_95);
				Static129.method2129(Static137.aClass98_83, Static34.aClass98_19);
				Static154.method2466(Static34.aClass98_19, Static234.aClass98_136);
				Static184.method2887(Static142.aClass98_87, Static16.aClass4_Sub2_Sub12_Sub1_1, Static34.aClass98_19);
				Static155.method2470(Static165.aClass98_95);
				Static136.method2178(Static262.aClass98_152, Static125.aClass98_77, Static43.aClass98_174);
				Static205.method3258(Static165.aClass98_95);
				Static265.method3987(Static142.aClass98_86, Static34.aClass98_19);
				Static167.method2631(Static1.aClass98_1);
				Static247.method3749(Static165.aClass98_95);
				Static5.method125(Static34.aClass98_18, Static34.aClass98_19, Static288.aClass98_66, Static197.aClass98_116);
				Static134.method2172(Static165.aClass98_95);
				Static38.method622(Static71.aClass98_44);
				Static6.method136(Static43.aClass98_173, new Class37(), Static277.aClass98_163);
				Static92.method1488(Static43.aClass98_173, Static277.aClass98_163);
				Static44.method705(Static165.aClass98_95);
				Static57.method922(Static165.aClass98_95);
				Static62.method958(Static165.aClass98_95);
				Static95.method1529(Static165.aClass98_95, Static288.aClass98_66);
				Static50.method442(Static288.aClass98_66, Static165.aClass98_95);
				Static41.anInt852 = 50;
				Static124.aString77 = Static45.aString23;
				Static72.method1082();
				Static276.anInt5152 = 80;
			}
		} else if (Static276.anInt5152 == 80) {
			local92 = Static53.method870(Static288.aClass98_66);
			local39 = Static167.method2635();
			if (local92 < local39) {
				Static124.aString77 = Static46.aString28 + local92 * 100 / local39 + "%";
				Static41.anInt852 = 60;
			} else {
				Static120.method2048(Static288.aClass98_66);
				Static41.anInt852 = 60;
				Static276.anInt5152 = 90;
				Static124.aString77 = Static86.aString51;
			}
		} else if (Static276.anInt5152 == 90) {
			if (Static116.aClass98_73.method2385()) {
				@Pc(956) Class71_Sub1 local956 = new Class71_Sub1(Static145.aClass98_88, Static116.aClass98_73, Static288.aClass98_66, 20, !Static238.aBoolean299);
				Static204.method3231(local956);
				if (Static165.anInt3301 == 1) {
					Static204.method3239(0.9F);
				}
				if (Static165.anInt3301 == 2) {
					Static204.method3239(0.8F);
				}
				if (Static165.anInt3301 == 3) {
					Static204.method3239(0.7F);
				}
				if (Static165.anInt3301 == 4) {
					Static204.method3239(0.6F);
				}
				Static276.anInt5152 = 100;
				Static124.aString77 = Static158.aString105;
				Static41.anInt852 = 70;
			} else {
				Static124.aString77 = Static81.aString129 + Static116.aClass98_73.method2399() + "%";
				Static41.anInt852 = 70;
			}
		} else if (Static276.anInt5152 == 100) {
			if (Static206.method3288(Static288.aClass98_66)) {
				Static276.anInt5152 = 110;
			}
		} else if (Static276.anInt5152 == 110) {
			Static177.aClass169_1 = new Class169();
			Static87.aClass164_2.method3952(10, Static177.aClass169_1);
			Static276.anInt5152 = 120;
			Static124.aString77 = Static6.aString3;
			Static41.anInt852 = 75;
		} else if (Static276.anInt5152 == 120) {
			if (Static218.aClass98_168.method2401("", "huffman")) {
				@Pc(1057) Class31 local1057 = new Class31(Static218.aClass98_168.method2377("", "huffman"));
				Static84.method1327(local1057);
				Static124.aString77 = Static25.aString7;
				Static41.anInt852 = 80;
				Static276.anInt5152 = 130;
			} else {
				Static41.anInt852 = 80;
				Static124.aString77 = Static25.aString6 + "0%";
			}
		} else if (Static276.anInt5152 == 130) {
			if (!Static34.aClass98_18.method2385()) {
				Static124.aString77 = Static1.aString1 + Static34.aClass98_18.method2399() * 3 / 4 + "%";
				Static41.anInt852 = 85;
			} else if (!Static80.aClass98_49.method2385()) {
				Static124.aString77 = Static1.aString1 + (Static80.aClass98_49.method2399() / 10 + 75) + "%";
				Static41.anInt852 = 85;
			} else if (!Static197.aClass98_116.method2385()) {
				Static124.aString77 = Static1.aString1 + (Static197.aClass98_116.method2399() / 20 + 85) + "%";
				Static41.anInt852 = 85;
			} else if (Static234.aClass98_137.method2404("details")) {
				Static249.method3773(Static234.aClass98_137, Static240.aClass4_Sub2_Sub1_Sub1Array7);
				Static285.method4286(Static34.aClass98_19);
				Static276.anInt5152 = 135;
				Static41.anInt852 = 95;
				Static124.aString77 = Static145.aString96;
			} else {
				Static124.aString77 = Static1.aString1 + (Static234.aClass98_137.method2373("details") / 10 + 90) + "%";
				Static41.anInt852 = 85;
			}
		} else if (Static276.anInt5152 == 135) {
			local92 = Static129.method2131();
			if (local92 == -1) {
				Static124.aString77 = Static158.aString106;
				Static41.anInt852 = 95;
			} else if (local92 == 7 || local92 == 9) {
				this.method659("worldlistfull");
				Static264.method3976(1000);
			} else if (Static162.aBoolean205) {
				Static124.aString77 = Static225.aString145;
				Static276.anInt5152 = 140;
				Static41.anInt852 = 96;
			} else {
				this.method659("worldlistio_" + local92);
				Static264.method3976(1000);
			}
		} else if (Static276.anInt5152 == 140) {
			Static168.anInt3351 = Static34.aClass98_18.method2376("loginscreen");
			Static106.aClass98_65.method2390(false);
			Static94.aClass98_56.method2390(true);
			Static288.aClass98_66.method2390(true);
			Static197.aClass98_116.method2390(true);
			Static218.aClass98_168.method2390(true);
			Static34.aClass98_18.method2390(true);
			Static41.anInt852 = 97;
			Static276.anInt5152 = 150;
			Static124.aString77 = Static154.aString103;
			Static16.aBoolean23 = true;
		} else if (Static276.anInt5152 == 150) {
			Static195.method3028();
			if (Static169.aBoolean209) {
				Static218.anInt5374 = 0;
				Static116.anInt2573 = 0;
				Static222.anInt4407 = 0;
				Static86.anInt1777 = 0;
			}
			Static169.aBoolean209 = true;
			Static102.method1649(Static87.aClass164_2);
			Static82.method1277(false, Static116.anInt2573, -1, -1);
			Static41.anInt852 = 100;
			Static276.anInt5152 = 160;
			Static124.aString77 = Static194.aString124;
		} else if (Static276.anInt5152 == 160) {
			Static49.method846(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method680() {
		for (Static298.anInt5539 = 0; Static185.method2900() && Static298.anInt5539 < 128; Static298.anInt5539++) {
			Static80.anIntArray167[Static298.anInt5539] = Static28.anInt525;
			Static137.anIntArray252[Static298.anInt5539] = Static69.aChar1;
		}
		Static16.anInt307++;
		if (Static25.anInt448 != -1) {
			Static241.method3693(0, 0, Static25.anInt448, Static111.anInt2450, 0, 0, Static216.anInt4287);
		}
		Static177.anInt3485++;
		if (Static178.aBoolean216) {
			label193: for (@Pc(64) int local64 = 0; local64 < 32768; local64++) {
				@Pc(71) Class12_Sub3_Sub1 local71 = Static100.aClass12_Sub3_Sub1Array1[local64];
				if (local71 != null) {
					@Pc(77) byte local77 = local71.aClass175_1.aByte26;
					if ((local77 & 0x2) > 0 && local71.anInt4157 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(103) int local103 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(111) int local111 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local103 != 0 || local111 != 0) {
							local71.anIntArray376[0] = local103 + (local71.anInt4141 >> 7);
							local71.anIntArray379[0] = local111 + (local71.anInt4113 >> 7);
							local71.aByteArray59[0] = 1;
							Static121.aClass63Array1[Static210.anInt4103].method1666(0, local71.anInt4141 >> 7, local71.anInt4113 >> 7, false, false, local71.method3375(), local71.method3375());
							if (local71.anIntArray376[0] >= 0 && local71.anIntArray376[0] <= 104 - local71.method3375() && local71.anIntArray379[0] >= 0 && local71.anIntArray379[0] <= 104 - local71.method3375() && Static121.aClass63Array1[Static210.anInt4103].method1670(local71.anIntArray379[0], local71.anInt4113 >> 7, local71.anIntArray376[0], local71.anInt4141 >> 7)) {
								if (local71.method3375() > 1) {
									for (@Pc(237) int local237 = local71.anIntArray376[0]; local237 < local71.anIntArray376[0] + local71.method3375(); local237++) {
										for (@Pc(256) int local256 = local71.anIntArray379[0]; local256 < local71.anIntArray379[0] + local71.method3375(); local256++) {
											if ((Static121.aClass63Array1[Static210.anInt4103].anIntArrayArray21[local237][local256] & 0x2401FF) != 0) {
												continue label193;
											}
										}
									}
								}
								local71.anInt4157 = 1;
							}
						}
					}
					Static3.method50(local71);
					Static121.method2053(local71);
					Static2.method15(local71);
					Static121.aClass63Array1[Static210.anInt4103].method1662(local71.method3375(), false, false, local71.method3375(), local71.anInt4141 >> 7, local71.anInt4113 >> 7);
				}
			}
		}
		if (!Static178.aBoolean216) {
			Static246.method4392();
		} else if (Static277.anInt5177 == 0 && Static81.anInt4026 == 0) {
			if (Static239.anInt4616 == 2) {
				Static157.method2483();
			} else {
				Static32.method478();
			}
			if (Static149.anInt3032 >> 7 < 14 || Static149.anInt3032 >> 7 >= 90 || Static211.anInt4210 >> 7 < 14 || Static211.anInt4210 >> 7 >= 90) {
				Static27.method1074();
			}
		}
		while (true) {
			@Pc(385) Class4_Sub22 local385;
			@Pc(391) Class22 local391;
			@Pc(400) Class22 local400;
			do {
				local385 = (Class4_Sub22) Static198.aClass10_25.method182();
				if (local385 == null) {
					while (true) {
						do {
							local385 = (Class4_Sub22) Static257.aClass10_54.method182();
							if (local385 == null) {
								while (true) {
									do {
										local385 = (Class4_Sub22) Static243.aClass10_52.method182();
										if (local385 == null) {
											if (Static45.aClass22_6 != null) {
												Static210.method3349();
											}
											if (Static119.aClass123_3 != null && Static119.aClass123_3.anInt3791 == 1) {
												if (Static119.aClass123_3.anObject4 != null) {
													Static275.method4103(Static86.aString52, Static55.aBoolean81);
												}
												Static86.aString52 = null;
												Static119.aClass123_3 = null;
												Static55.aBoolean81 = false;
											}
											if (Static104.anInt2226 % 1500 == 0) {
												Static94.method1517();
											}
											return;
										}
										local391 = local385.aClass22_15;
										if (local391.anInt561 < 0) {
											break;
										}
										local400 = Static21.method3453(local391.anInt587);
									} while (local400 == null || local400.aClass22Array1 == null || local400.aClass22Array1.length <= local391.anInt561 || local400.aClass22Array1[local391.anInt561] != local391);
									Static125.method2089(local385);
								}
							}
							local391 = local385.aClass22_15;
							if (local391.anInt561 < 0) {
								break;
							}
							local400 = Static21.method3453(local391.anInt587);
						} while (local400 == null || local400.aClass22Array1 == null || local391.anInt561 >= local400.aClass22Array1.length || local391 != local400.aClass22Array1[local391.anInt561]);
						Static125.method2089(local385);
					}
				}
				local391 = local385.aClass22_15;
				if (local391.anInt561 < 0) {
					break;
				}
				local400 = Static21.method3453(local391.anInt587);
			} while (local400 == null || local400.aClass22Array1 == null || local400.aClass22Array1.length <= local391.anInt561 || local391 != local400.aClass22Array1[local391.anInt561]);
			Static125.method2089(local385);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method650() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method682(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub17 local10 = new Class4_Sub17(arg0);
		while (true) {
			@Pc(22) int local22 = local10.method1874();
			if (local22 == 0) {
				return;
			}
			if (local22 == 1) {
				@Pc(37) int[] local37 = Static21.anIntArray385 = new int[6];
				local37[0] = local10.method1837();
				local37[1] = local10.method1837();
				local37[2] = local10.method1837();
				local37[3] = local10.method1837();
				local37[4] = local10.method1837();
				local37[5] = local10.method1837();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method684() {
		@Pc(13) boolean local13 = Static103.aClass113_1.method2674();
		if (!local13) {
			this.method671();
		}
	}
}
