import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
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
				Static13.method224();
			}
			Static106.anInt2839 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static76.anInt1971 = 0;
			} else if (arg0[1].equals("office")) {
				Static76.anInt1971 = 1;
			} else if (arg0[1].equals("local")) {
				Static76.anInt1971 = 2;
			} else {
				Static13.method224();
			}
			if (arg0[2].equals("live")) {
				Static118.anInt3027 = 0;
			} else if (arg0[2].equals("rc")) {
				Static118.anInt3027 = 1;
			} else if (arg0[2].equals("wip")) {
				Static118.anInt3027 = 2;
			} else {
				Static13.method224();
			}
			if (arg0[3].equals("lowmem")) {
				Static110.method1843();
			} else if (arg0[3].equals("highmem")) {
				Static23.method459();
			} else {
				Static13.method224();
			}
			if (arg0[4].equals("free")) {
				Static43.aBoolean80 = false;
			} else if (arg0[4].equals("members")) {
				Static43.aBoolean80 = true;
			} else {
				Static13.method224();
			}
			if (arg0[5].equals("english")) {
				Static81.anInt2043 = 0;
			} else if (arg0[5].equals("german")) {
				Static94.method1450();
				Static81.anInt2043 = 1;
				Static40.aClass80_452 = Static23.aClass80_284;
			} else {
				Static13.method224();
			}
			Static65.aString1 = "127.0.0.1";
			@Pc(152) client local152 = new client();
			local152.method477("runescape", Static118.anInt3027 + 32);
		} catch (@Pc(166) Exception local166) {
			Static53.method953(null, local166);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method479(@OriginalArg(1) int arg0) {
		Static107.aClass56_6 = null;
		Static10.aClass10_1 = null;
		Static73.anInt1929 = 0;
		if (Static42.anInt1256 == Static29.anInt1069) {
			Static42.anInt1256 = Static112.anInt2923;
		} else {
			Static42.anInt1256 = Static29.anInt1069;
		}
		Static38.anInt1214++;
		if (Static38.anInt1214 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static114.anInt2934 <= 5) {
				this.method475("js5connect_full");
				Static114.anInt2934 = 1000;
			} else {
				Static40.anInt1241 = 3000;
			}
		} else if (Static38.anInt1214 >= 2 && arg0 == 6) {
			this.method475("js5connect_outofdate");
			Static114.anInt2934 = 1000;
		} else if (Static38.anInt1214 >= 4) {
			if (Static114.anInt2934 <= 5) {
				this.method475("js5connect");
				Static114.anInt2934 = 1000;
			} else {
				Static40.anInt1241 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method465() {
		@Pc(4) boolean local4 = Static42.method682();
		if (local4 && Static70.aBoolean132 && Static107.aClass29_2 != null) {
			Static107.aClass29_2.method1276();
		}
		if (Static123.aBoolean242) {
			Static25.method520(Static119.aCanvas2);
			Static96.method1510(Static119.aCanvas2);
			if (Static103.aClass59_1 != null) {
				Static103.aClass59_1.method1405(Static119.aCanvas2);
			}
			this.method466();
			Static31.method576(Static119.aCanvas2);
			Static106.method1808(Static119.aCanvas2);
			if (Static103.aClass59_1 != null) {
				Static103.aClass59_1.method1410(Static119.aCanvas2);
			}
		}
		if (Static114.anInt2934 == 0) {
			Static24.method514(Static42.anInt1250, null, Static79.aClass80_789);
		} else if (Static114.anInt2934 == 5) {
			Static59.method1044(Static111.aClass2_Sub1_Sub9_Sub4_34, Static88.aClass2_Sub1_Sub9_Sub4_25);
		} else if (Static114.anInt2934 == 10) {
			Static59.method1044(Static111.aClass2_Sub1_Sub9_Sub4_34, Static88.aClass2_Sub1_Sub9_Sub4_25);
		} else if (Static114.anInt2934 == 20) {
			Static59.method1044(Static111.aClass2_Sub1_Sub9_Sub4_34, Static88.aClass2_Sub1_Sub9_Sub4_25);
		} else if (Static114.anInt2934 == 25) {
			@Pc(139) int local139;
			if (Static105.anInt2367 == 1) {
				if (Static9.anInt258 > Static23.anInt893) {
					Static23.anInt893 = Static9.anInt258;
				}
				local139 = (Static23.anInt893 - Static9.anInt258) * 50 / Static23.anInt893;
				Static23.method467(Static86.aClass80_835, Static93.method1444(new Class80[] { Static65.aClass80_698, Static28.method1422(local139), Static93.aClass80_921 }), true);
			} else if (Static105.anInt2367 == 2) {
				if (Static74.anInt1963 < Static121.anInt3086) {
					Static74.anInt1963 = Static121.anInt3086;
				}
				local139 = (Static74.anInt1963 - Static121.anInt3086) * 50 / Static74.anInt1963 + 50;
				Static23.method467(Static86.aClass80_835, Static93.method1444(new Class80[] { Static65.aClass80_698, Static28.method1422(local139), Static93.aClass80_921 }), true);
			} else {
				Static23.method467(Static86.aClass80_835, null, false);
			}
		} else if (Static114.anInt2934 == 30) {
			Static51.method893();
		} else if (Static114.anInt2934 == 35) {
			Static42.method685();
		} else if (Static114.anInt2934 == 40) {
			Static23.method467(Static121.aClass80_1178, Static104.aClass80_1038, false);
		}
		Static85.anInt2061 = 0;
		Static7.anInt185 = 0;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method481() {
		if (Static123.anInt3112 >= 4) {
			this.method475("js5crc");
			Static114.anInt2934 = 1000;
			return;
		}
		if (Static111.anInt2999 >= 4) {
			if (Static114.anInt2934 <= 5) {
				this.method475("js5io");
				Static114.anInt2934 = 1000;
				return;
			}
			Static40.anInt1241 = 3000;
			Static111.anInt2999 = 3;
		}
		if (Static40.anInt1241-- > 0) {
			return;
		}
		try {
			if (Static73.anInt1929 == 0) {
				Static107.aClass56_6 = Static9.aClass74_1.method1868(Static42.anInt1256, Static65.aString1);
				Static73.anInt1929++;
			}
			if (Static73.anInt1929 == 1) {
				if (Static107.aClass56_6.anInt2056 == 2) {
					this.method479(-1);
					return;
				}
				if (Static107.aClass56_6.anInt2056 == 1) {
					Static73.anInt1929++;
				}
			}
			if (Static73.anInt1929 == 2) {
				Static10.aClass10_1 = new Class10((Socket) Static107.aClass56_6.anObject2, Static9.aClass74_1);
				@Pc(98) Class2_Sub17 local98 = new Class2_Sub17(5);
				local98.method1769(15);
				local98.method1765(454);
				Static10.aClass10_1.method256(local98.aByteArray38, 5);
				Static73.anInt1929++;
				Static7.aLong11 = Static49.method877();
			}
			if (Static73.anInt1929 == 3) {
				if (Static114.anInt2934 <= 5 || Static10.aClass10_1.method259() > 0) {
					@Pc(139) int local139 = Static10.aClass10_1.method254();
					if (local139 != 0) {
						this.method479(local139);
						return;
					}
					Static73.anInt1929++;
				} else if (Static49.method877() - Static7.aLong11 > 30000L) {
					this.method479(-2);
					return;
				}
			}
			if (Static73.anInt1929 == 4) {
				Static113.method1858(Static114.anInt2934 > 20, Static10.aClass10_1);
				Static38.anInt1214 = 0;
				Static107.aClass56_6 = null;
				Static73.anInt1929 = 0;
				Static10.aClass10_1 = null;
			}
		} catch (@Pc(188) IOException local188) {
			this.method479(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method483() {
		if (Static114.anInt2934 != 1000) {
			@Pc(12) boolean local12 = Static105.method1433();
			if (!local12) {
				this.method481();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method468() {
		if (Static80.aClass73_1 != null) {
			Static80.aClass73_1.aBoolean217 = false;
		}
		Static80.aClass73_1 = null;
		if (Static44.aClass10_2 != null) {
			Static44.aClass10_2.method255();
			Static44.aClass10_2 = null;
		}
		Static107.method1821();
		Static84.method1251();
		Static103.aClass59_1 = null;
		if (Static107.aClass29_2 != null) {
			Static107.aClass29_2.method1278();
		}
		if (Static1.aClass29_1 != null) {
			Static1.aClass29_1.method1278();
		}
		Static4.method92();
		Static80.method1238();
		try {
			if (Static95.aClass6_3 != null) {
				Static95.aClass6_3.method117();
			}
			if (Static67.aClass6Array1 != null) {
				for (@Pc(53) int local53 = 0; local53 < Static67.aClass6Array1.length; local53++) {
					if (Static67.aClass6Array1[local53] != null) {
						Static67.aClass6Array1[local53].method117();
					}
				}
			}
			if (Static112.aClass6_4 != null) {
				Static112.aClass6_4.method117();
			}
		} catch (@Pc(76) IOException local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method463()) {
			return;
		}
		Static106.anInt2839 = Integer.parseInt(this.getParameter("worldid"));
		Static118.anInt3027 = Integer.parseInt(this.getParameter("modewhat"));
		Static76.anInt1971 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static110.method1843();
		} else {
			Static23.method459();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static43.aBoolean80 = true;
		} else {
			Static43.aBoolean80 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static94.method1450();
			Static81.anInt2043 = 1;
			Static40.aClass80_452 = Static23.aClass80_284;
		}
		try {
			Static88.anInt2161 = Integer.parseInt(this.getParameter("js"));
			Static28.anInt2308 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(85) Exception local85) {
		}
		Static65.aString1 = this.getCodeBase().getHost();
		this.method469(Static118.anInt3027 + 32);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method476() {
		Static112.anInt2923 = Static76.anInt1971 == 0 ? 443 : Static106.anInt2839 + 50000;
		Static29.anInt1069 = Static76.anInt1971 == 0 ? 43594 : Static106.anInt2839 + 40000;
		Static42.anInt1256 = Static29.anInt1069;
		Static108.method1825();
		Static31.method576(Static119.aCanvas2);
		Static106.method1808(Static119.aCanvas2);
		Static103.aClass59_1 = Static86.method1287();
		if (Static103.aClass59_1 != null) {
			Static103.aClass59_1.method1410(Static119.aCanvas2);
		}
		Static6.anInt169 = Static116.anInt2951;
		try {
			if (Static9.aClass74_1.aClass81_2 != null) {
				Static95.aClass6_3 = new Class6(Static9.aClass74_1.aClass81_2, 5200, 0);
				for (@Pc(67) int local67 = 0; local67 < 16; local67++) {
					Static67.aClass6Array1[local67] = new Class6(Static9.aClass74_1.aClass81Array1[local67], 6000, 0);
				}
				Static112.aClass6_4 = new Class6(Static9.aClass74_1.aClass81_3, 6000, 0);
				Static27.aClass60_3 = new Class60(255, Static95.aClass6_3, Static112.aClass6_4, 500000);
				Static9.aClass74_1.aClass81Array1 = null;
				Static9.aClass74_1.aClass81_2 = null;
				Static9.aClass74_1.aClass81_3 = null;
			}
		} catch (@Pc(112) IOException local112) {
			Static112.aClass6_4 = null;
			Static95.aClass6_3 = null;
			Static27.aClass60_3 = null;
		}
		if (Static76.anInt1971 != 0) {
			Static2.aBoolean11 = true;
		}
		Static119.aClass2_Sub1_Sub17_4 = new Class2_Sub1_Sub17();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method461() {
		Static20.method484();
		Static127.method2032();
		Static23.method460();
		Static55.method713();
		Static62.method1066();
		Static115.method1866();
		Static125.method1749();
		Static16.method253();
		Static18.method402();
		Static7.method113();
		Static89.method1327();
		Static17.method324();
		Static106.method1803();
		Static117.method1923();
		Static101.method1649();
		Static74.method1168();
		Static93.method1442();
		Static86.method1283();
		Static118.method1952();
		Static87.method1404();
		Static61.method1054();
		Static45.method1270();
		Static31.method578();
		Static126.method1989();
		Static44.method740();
		Static105.method1441();
		Static48.method873();
		Static97.method1578();
		Static82.method1959();
		Static70.method1130();
		Static15.method250();
		Static50.method884();
		Static12.method214();
		Static26.method551();
		Static21.method491();
		Static96.method1512();
		Static83.method1250();
		Static121.method1966();
		Static29.method565();
		Static124.method1977();
		Static28.method1426();
		Static79.method1235();
		Static11.method180();
		Static51.method895();
		Static71.method1141();
		Static41.method679();
		Static85.method1261();
		Static68.method1119();
		Static49.method876();
		Static111.method1935();
		Static39.method393();
		Static6.method106();
		Static123.method1971();
		Static91.method1369();
		Static84.method1252();
		Static1.method2();
		Static27.method563();
		Static76.method1190();
		Static103.method1666();
		Static32.method590();
		Static60.method1052();
		Static112.method1847();
		Static104.method1679();
		Static38.method658();
		Static52.method925();
		Static99.method1892();
		Static114.method1862();
		Static80.method1239();
		Static95.method1459();
		Static54.method976();
		Static4.method93();
		Static78.method1212();
		Static67.method1111();
		Static98.method1596();
		Static8.method137();
		Static10.method166();
		Static53.method960();
		Static19.method421();
		Static110.method1840();
		Static90.method1344();
		Static9.method150();
		Static88.method1322();
		Static33.method606();
		Static40.method665();
		Static72.method1154();
		Static100.method1605();
		Static13.method226();
		Static64.method1080();
		Static108.method1826();
		Static107.method1822();
		Static59.method1045();
		Static35.method627();
		Static30.method572();
		Static36.method629();
		Static34.method609();
		Static14.method247();
		Static2.method61();
		Static120.method1954();
		Static113.method1856();
		Static73.method1166();
		Static56.method1024();
		Static22.method510();
		Static37.method654();
		Static122.method1968();
		Static3.method64();
		Static43.method709();
		Static63.method1076();
		Static119.method1005();
		Static25.method516();
		Static102.method1663();
		Static5.method102();
		Static46.method856();
		Static75.method1189();
		Static42.method681();
		Static109.method1828();
		Static66.method1108();
		Static58.method1029();
		Static24.method512();
		Static94.method1449();
		Static77.method1201();
		Static81.method1246();
		Static57.method1025();
		Static47.method866();
		Static69.method1125();
		Static92.method1399();
		Static65.method1099();
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method473() {
		Static10.anInt300++;
		this.method483();
		Static68.method1118();
		Static19.method426();
		Static38.method657();
		Static110.method1842();
		Static4.method97();
		if (Static103.aClass59_1 != null) {
			@Pc(33) int local33 = Static103.aClass59_1.method1401();
			Static7.anInt185 += local33;
			Static91.anInt2248 = local33;
		}
		if (Static114.anInt2934 == 0) {
			Static85.method1259();
			Static31.method575();
		} else if (Static114.anInt2934 == 5) {
			Static95.method1460(this);
			Static85.method1259();
			Static31.method575();
		} else if (Static114.anInt2934 == 10) {
			Static95.method1460(this);
		} else if (Static114.anInt2934 == 20) {
			Static95.method1460(this);
			Static120.method1953();
		} else if (Static114.anInt2934 == 25) {
			Static9.method149();
		}
		if (Static114.anInt2934 == 30) {
			Static40.method666();
		} else if (Static114.anInt2934 == 35) {
			Static40.method666();
		} else if (Static114.anInt2934 == 40) {
			Static120.method1953();
			return;
		}
	}
}
