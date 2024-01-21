import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	public static int[] anIntArray33 = new int[32];

	static {
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			anIntArray33[local29] = local27 - 1;
			local27 += local27;
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static94.method1664();
			}
			Static4.anInt54 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static95.anInt2480 = 0;
			} else if (arg0[1].equals("office")) {
				Static95.anInt2480 = 1;
			} else if (arg0[1].equals("local")) {
				Static95.anInt2480 = 2;
			} else {
				Static94.method1664();
			}
			if (arg0[2].equals("live")) {
				Static8.anInt206 = 0;
			} else if (arg0[2].equals("rc")) {
				Static8.anInt206 = 1;
			} else if (arg0[2].equals("wip")) {
				Static8.anInt206 = 2;
			} else {
				Static94.method1664();
			}
			if (arg0[3].equals("lowmem")) {
				Static54.method1014();
			} else if (arg0[3].equals("highmem")) {
				Static106.method1758();
			} else {
				Static94.method1664();
			}
			if (arg0[4].equals("free")) {
				Static3.aBoolean168 = false;
			} else if (arg0[4].equals("members")) {
				Static3.aBoolean168 = true;
			} else {
				Static94.method1664();
			}
			if (arg0[5].equals("english")) {
				Static117.anInt2965 = 0;
			} else if (arg0[5].equals("german")) {
				Static97.method1704();
				Static117.anInt2965 = 1;
				Static122.aClass56_1642 = Static72.aClass56_695;
			} else {
				Static94.method1664();
			}
			Static108.aString5 = "127.0.0.1";
			@Pc(156) client local156 = new client();
			local156.method397("runescape", Static8.anInt206 + 32);
		} catch (@Pc(169) Exception local169) {
			Static61.method1200(null, local169);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method393()) {
			return;
		}
		Static4.anInt54 = Integer.parseInt(this.getParameter("worldid"));
		Static8.anInt206 = Integer.parseInt(this.getParameter("modewhat"));
		Static95.anInt2480 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static54.method1014();
		} else {
			Static106.method1758();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static3.aBoolean168 = true;
		} else {
			Static3.aBoolean168 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static97.method1704();
			Static122.aClass56_1642 = Static72.aClass56_695;
			Static117.anInt2965 = 1;
		}
		try {
			Static80.anInt2138 = Integer.parseInt(this.getParameter("js"));
			Static124.anInt3089 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(85) Exception local85) {
		}
		Static108.aString5 = this.getCodeBase().getHost();
		this.method380(Static8.anInt206 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method384() {
		Static19.method405();
		Static81.method1420();
		Static66.method390();
		Static46.method1515();
		Static72.method809();
		Static51.method979();
		Static7.method287();
		Static24.method495();
		Static59.method1163();
		Static98.method1715();
		Static122.method1956();
		Static127.method2044();
		Static15.method317();
		Static39.method744();
		Static20.method417();
		Static126.method2011();
		Static47.method879();
		Static52.method988();
		Static111.method1857();
		Static99.method617();
		Static2.method18();
		Static67.method1535();
		Static18.method352();
		Static57.method1088();
		Static29.method593();
		Static125.method2036();
		Static32.method648();
		Static115.method1906();
		Static102.method2050();
		Static91.method1626();
		Static25.method535();
		Static75.method1350();
		Static107.method1782();
		Static10.method232();
		Static33.method651();
		Static43.method802();
		Static12.method241();
		Static110.method1838();
		Static40.method751();
		Static14.method254();
		Static77.method2030();
		Static106.method1760();
		Static17.method346();
		Static86.method1599();
		Static70.method1283();
		Static112.method1862();
		Static13.method244();
		Static64.method1214();
		Static38.method695();
		Static3.method2021();
		Static109.method1140();
		Static65.method1216();
		Static1.method3();
		Static68.method1254();
		Static119.method1931();
		Static34.method654();
		Static62.method1208();
		Static118.method1919();
		Static9.method178();
		Static21.method470();
		Static4.method37();
		Static103.method1736();
		Static97.method1701();
		Static104.method1741();
		Static55.method1049();
		Static6.method1490();
		Static116.method1909();
		Static48.method884();
		Static63.method1211();
		Static123.method1971();
		Static120.method1936();
		Static8.method174();
		Static54.method1012();
		Static53.method1000();
		Static50.method902();
		Static80.method1414();
		Static76.method1365();
		Static108.method1826();
		Static60.method1191();
		Static35.method671();
		Static16.method344();
		Static94.method1665();
		Static42.method786();
		Static82.method1467();
		Static28.method577();
		Static90.method1620();
		Static5.method44();
		Static100.method1719();
		Static31.method638();
		Static23.method492();
		Static117.method1918();
		Static105.method1751();
		Static92.method1644();
		Static26.method537();
		Static83.method1511();
		Static121.method1948();
		Static27.method561();
		Static124.method1996();
		Static41.method769();
		Static87.method1604();
		Static71.method1307();
		Static22.method490();
		Static73.method1330();
		Static69.method1279();
		Static95.method1668();
		Static114.method1872();
		Static84.method1526();
		Static45.method818();
		Static49.method975();
		Static113.method1870();
		Static88.method1610();
		Static93.method1649();
		Static85.method1543();
		Static101.method1724();
		Static11.method236();
		Static89.method1612();
		Static79.method1395();
		Static37.method683();
		Static61.method1203();
		Static96.method1686();
		Static30.method630();
		Static44.method806();
		Static78.method1375();
		Static74.method1335();
		Static56.method1063();
		Static36.method681();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method386() {
		@Pc(8) boolean local8 = Static21.method468();
		if (local8 && Static7.aBoolean18 && Static70.aClass18_2 != null) {
			Static70.aClass18_2.method1541();
		}
		if (Static87.aBoolean109) {
			Static29.method600(Static59.aCanvas1);
			Static18.method358(Static59.aCanvas1);
			if (Static87.aClass22_1 != null) {
				Static87.aClass22_1.method620(Static59.aCanvas1);
			}
			this.method387();
			Static86.method1603(Static59.aCanvas1);
			Static70.method1281(Static59.aCanvas1);
			if (Static87.aClass22_1 != null) {
				Static87.aClass22_1.method612(Static59.aCanvas1);
			}
		}
		if (Static44.anInt1156 == 0) {
			Static12.method242(null, Static66.aClass56_265, Static67.anInt2309);
		} else if (Static44.anInt1156 == 5) {
			Static122.method1963(Static122.aClass3_Sub1_Sub1_Sub1_5, Static57.aClass3_Sub1_Sub1_Sub1_3);
		} else if (Static44.anInt1156 == 10) {
			Static122.method1963(Static122.aClass3_Sub1_Sub1_Sub1_5, Static57.aClass3_Sub1_Sub1_Sub1_3);
		} else if (Static44.anInt1156 == 20) {
			Static122.method1963(Static122.aClass3_Sub1_Sub1_Sub1_5, Static57.aClass3_Sub1_Sub1_Sub1_3);
		} else if (Static44.anInt1156 == 25) {
			@Pc(112) int local112;
			if (Static32.anInt951 == 1) {
				if (Static113.anInt2871 < Static1.anInt5) {
					Static113.anInt2871 = Static1.anInt5;
				}
				local112 = (Static113.anInt2871 - Static1.anInt5) * 50 / Static113.anInt2871;
				Static79.method1391(true, Static46.aClass56_1214, Static84.method1524(new Class56[] { Static113.aClass56_1561, Static111.method1851(local112), Static105.aClass56_1445 }));
			} else if (Static32.anInt951 == 2) {
				if (Static53.anInt1526 < Static93.anInt2440) {
					Static53.anInt1526 = Static93.anInt2440;
				}
				local112 = (Static53.anInt1526 - Static93.anInt2440) * 50 / Static53.anInt1526 + 50;
				Static79.method1391(true, Static46.aClass56_1214, Static84.method1524(new Class56[] { Static113.aClass56_1561, Static111.method1851(local112), Static105.aClass56_1445 }));
			} else {
				Static79.method1391(false, Static46.aClass56_1214, null);
			}
		} else if (Static44.anInt1156 == 30) {
			Static87.method1605();
		} else if (Static44.anInt1156 == 35) {
			Static91.method1624();
		} else if (Static44.anInt1156 == 40) {
			Static79.method1391(false, Static76.aClass56_1115, Static14.aClass56_187);
		}
		Static49.anInt1493 = 0;
		Static123.anInt3045 = 0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method399() {
		if (Static11.anInt297 >= 4) {
			this.method391("js5crc");
			Static44.anInt1156 = 1000;
			return;
		}
		if (Static31.anInt923 >= 4) {
			if (Static44.anInt1156 <= 5) {
				this.method391("js5io");
				Static44.anInt1156 = 1000;
				return;
			}
			Static31.anInt923 = 3;
			Static86.anInt2354 = 3000;
		}
		if (Static86.anInt2354-- > 0) {
			return;
		}
		try {
			if (Static94.anInt2476 == 0) {
				Static47.aClass54_4 = Static8.aClass43_1.method1090(Static9.anInt220, Static108.aString5);
				Static94.anInt2476++;
			}
			if (Static94.anInt2476 == 1) {
				if (Static47.aClass54_4.anInt2077 == 2) {
					this.method404(-1);
					return;
				}
				if (Static47.aClass54_4.anInt2077 == 1) {
					Static94.anInt2476++;
				}
			}
			if (Static94.anInt2476 == 2) {
				Static40.aClass17_1 = new Class17((Socket) Static47.aClass54_4.anObject2, Static8.aClass43_1);
				@Pc(101) Class3_Sub2 local101 = new Class3_Sub2(5);
				local101.method303(15);
				local101.method280(455);
				Static40.aClass17_1.method493(local101.aByteArray7, 5);
				Static94.anInt2476++;
				Static100.aLong80 = Static38.method694();
			}
			if (Static94.anInt2476 == 3) {
				if (Static44.anInt1156 <= 5 || Static40.aClass17_1.method499() > 0) {
					@Pc(155) int local155 = Static40.aClass17_1.method496();
					if (local155 != 0) {
						this.method404(local155);
						return;
					}
					Static94.anInt2476++;
				} else if (Static38.method694() - Static100.aLong80 > 30000L) {
					this.method404(-2);
					return;
				}
			}
			if (Static94.anInt2476 == 4) {
				Static123.method1974(Static44.anInt1156 > 20, Static40.aClass17_1);
				Static40.aClass17_1 = null;
				Static94.anInt2476 = 0;
				Static87.anInt2363 = 0;
				Static47.aClass54_4 = null;
			}
		} catch (@Pc(188) IOException local188) {
			this.method404(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method396() {
		Static8.anInt207 = Static95.anInt2480 == 0 ? 443 : Static4.anInt54 + 50000;
		Static86.anInt2357 = Static95.anInt2480 == 0 ? 43594 : Static4.anInt54 + 40000;
		Static9.anInt220 = Static86.anInt2357;
		Static114.method1874();
		Static86.method1603(Static59.aCanvas1);
		Static70.method1281(Static59.aCanvas1);
		Static87.aClass22_1 = Static7.method296();
		if (Static87.aClass22_1 != null) {
			Static87.aClass22_1.method612(Static59.aCanvas1);
		}
		Static96.anInt2517 = Static58.anInt1624;
		try {
			if (Static8.aClass43_1.aClass41_1 != null) {
				Static66.aClass65_2 = new Class65(Static8.aClass43_1.aClass41_1, 5200, 0);
				for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
					Static11.aClass65Array1[local63] = new Class65(Static8.aClass43_1.aClass41Array1[local63], 6000, 0);
				}
				Static86.aClass65_3 = new Class65(Static8.aClass43_1.aClass41_2, 6000, 0);
				Static15.aClass80_1 = new Class80(255, Static66.aClass65_2, Static86.aClass65_3, 500000);
				Static8.aClass43_1.aClass41Array1 = null;
				Static8.aClass43_1.aClass41_2 = null;
				Static8.aClass43_1.aClass41_1 = null;
			}
		} catch (@Pc(108) IOException local108) {
			Static66.aClass65_2 = null;
			Static15.aClass80_1 = null;
			Static86.aClass65_3 = null;
		}
		if (Static95.anInt2480 != 0) {
			Static50.aBoolean63 = true;
		}
		Static31.aClass3_Sub1_Sub16_3 = new Class3_Sub1_Sub16();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method381() {
		if (Static17.aClass36_1 != null) {
			Static17.aClass36_1.aBoolean65 = false;
		}
		Static17.aClass36_1 = null;
		if (Static117.aClass17_4 != null) {
			Static117.aClass17_4.method498();
			Static117.aClass17_4 = null;
		}
		Static14.method251();
		Static31.method636();
		Static87.aClass22_1 = null;
		if (Static70.aClass18_2 != null) {
			Static70.aClass18_2.method1530();
		}
		if (Static35.aClass18_1 != null) {
			Static35.aClass18_1.method1530();
		}
		Static92.method1642();
		Static73.method1327();
		try {
			if (Static66.aClass65_2 != null) {
				Static66.aClass65_2.method1713();
			}
			if (Static11.aClass65Array1 != null) {
				for (@Pc(61) int local61 = 0; local61 < Static11.aClass65Array1.length; local61++) {
					if (Static11.aClass65Array1[local61] != null) {
						Static11.aClass65Array1[local61].method1713();
					}
				}
			}
			if (Static86.aClass65_3 != null) {
				Static86.aClass65_3.method1713();
			}
		} catch (@Pc(90) IOException local90) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method392() {
		Static98.anInt2566++;
		this.method403();
		Static64.method1213();
		Static93.method1648();
		Static18.method349();
		Static5.method47();
		Static21.method466();
		if (Static87.aClass22_1 != null) {
			@Pc(33) int local33 = Static87.aClass22_1.method618();
			Static123.anInt3045 += local33;
			Static71.anInt1968 = local33;
		}
		if (Static44.anInt1156 == 0) {
			Static59.method1165();
			Static24.method497();
		} else if (Static44.anInt1156 == 5) {
			Static102.method2052(this);
			Static59.method1165();
			Static24.method497();
		} else if (Static44.anInt1156 == 10) {
			Static102.method2052(this);
		} else if (Static44.anInt1156 == 20) {
			Static102.method2052(this);
			Static99.method611();
		} else if (Static44.anInt1156 == 25) {
			Static87.method1607();
		}
		if (Static44.anInt1156 == 30) {
			Static103.method1732();
		} else if (Static44.anInt1156 == 35) {
			Static103.method1732();
			return;
		} else if (Static44.anInt1156 == 40) {
			Static99.method611();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method403() {
		if (Static44.anInt1156 != 1000) {
			@Pc(12) boolean local12 = Static32.method649();
			if (!local12) {
				this.method399();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method404(@OriginalArg(1) int arg0) {
		Static87.anInt2363++;
		Static47.aClass54_4 = null;
		if (Static9.anInt220 == Static86.anInt2357) {
			Static9.anInt220 = Static8.anInt207;
		} else {
			Static9.anInt220 = Static86.anInt2357;
		}
		Static40.aClass17_1 = null;
		Static94.anInt2476 = 0;
		if (Static87.anInt2363 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static44.anInt1156 <= 5) {
				this.method391("js5connect_full");
				Static44.anInt1156 = 1000;
			} else {
				Static86.anInt2354 = 3000;
			}
		} else if (Static87.anInt2363 >= 2 && arg0 == 6) {
			this.method391("js5connect_outofdate");
			Static44.anInt1156 = 1000;
		} else if (Static87.anInt2363 >= 4) {
			if (Static44.anInt1156 > 5) {
				Static86.anInt2354 = 3000;
			} else {
				this.method391("js5connect");
				Static44.anInt1156 = 1000;
			}
		}
	}
}
