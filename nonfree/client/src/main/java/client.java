import java.awt.Color;
import java.awt.Graphics;
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
			if (arg0.length != 7) {
				Static121.method1916();
			}
			Static42.anInt1103 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static116.anInt2705 = 0;
			} else if (arg0[1].equals("office")) {
				Static116.anInt2705 = 1;
			} else if (arg0[1].equals("local")) {
				Static116.anInt2705 = 2;
			} else {
				Static121.method1916();
			}
			if (arg0[2].equals("live")) {
				Static133.anInt2976 = 0;
			} else if (arg0[2].equals("rc")) {
				Static133.anInt2976 = 1;
			} else if (arg0[2].equals("wip")) {
				Static133.anInt2976 = 2;
			} else {
				Static121.method1916();
			}
			if (arg0[3].equals("lowmem")) {
				Static110.method1824();
			} else if (arg0[3].equals("highmem")) {
				Static1.method4();
			} else {
				Static121.method1916();
			}
			if (arg0[4].equals("free")) {
				Static29.aBoolean36 = false;
			} else if (arg0[4].equals("members")) {
				Static29.aBoolean36 = true;
			} else {
				Static121.method1916();
			}
			if (arg0[5].equals("english")) {
				Static11.anInt428 = 0;
			} else if (arg0[5].equals("german")) {
				Static11.method220();
				Static11.anInt428 = 1;
				Static23.aClass60_251 = Static29.aClass60_303;
			} else {
				Static121.method1916();
			}
			if (arg0[6].equals("game0")) {
				Static19.anInt680 = 0;
			} else if (arg0[6].equals("game1")) {
				Static19.anInt680 = 1;
			} else {
				Static121.method1916();
			}
			Static63.aString2 = "127.0.0.1";
			@Pc(174) client local174 = new client();
			local174.method342(Static133.anInt2976 + 32, "runescape");
		} catch (@Pc(188) Exception local188) {
			Static117.method1885(null, local188);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method351() {
		if (Static120.anInt2757 != 1000) {
			@Pc(16) boolean local16 = Static44.method1486();
			if (!local16) {
				this.method354();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method344() {
		Static51.anInt1355 = Static116.anInt2705 == 0 ? 443 : Static42.anInt1103 + 50000;
		Static23.anInt803 = Static116.anInt2705 == 0 ? 43594 : Static42.anInt1103 + 40000;
		if (Static19.anInt680 == 1) {
			Static109.aShortArrayArray34 = Static60.aShortArrayArray37;
			Static8.aShortArray2 = Static45.aShortArray17;
			Static79.aShortArrayArray22 = Static77.aShortArrayArray21;
			Static41.aShortArray15 = Static72.aShortArray18;
		} else {
			Static109.aShortArrayArray34 = Static19.aShortArrayArray7;
			Static79.aShortArrayArray22 = Static94.aShortArrayArray29;
			Static41.aShortArray15 = Static41.aShortArray16;
			Static8.aShortArray2 = Static7.aShortArray1;
		}
		Static80.anInt1907 = Static23.anInt803;
		Static105.method1730();
		Static65.method1055(Static110.aCanvas1);
		Static29.method471(Static110.aCanvas1);
		Static24.aClass19_1 = Static96.method1568();
		if (Static24.aClass19_1 != null) {
			Static24.aClass19_1.method1360(Static110.aCanvas1);
		}
		Static18.anInt623 = Static126.anInt2832;
		try {
			if (Static105.aClass81_4.aClass64_3 != null) {
				Static44.aClass16_13 = new Class16(Static105.aClass81_4.aClass64_3, 5200, 0);
				for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
					Static130.aClass16Array1[local79] = new Class16(Static105.aClass81_4.aClass64Array1[local79], 6000, 0);
				}
				Static122.aClass16_14 = new Class16(Static105.aClass81_4.aClass64_4, 6000, 0);
				Static101.aClass56_65 = new Class56(255, Static44.aClass16_13, Static122.aClass16_14, 500000);
				Static77.aClass16_8 = new Class16(Static105.aClass81_4.aClass64_2, 24, 0);
				Static105.aClass81_4.aClass64_4 = null;
				Static105.aClass81_4.aClass64Array1 = null;
				Static105.aClass81_4.aClass64_2 = null;
				Static105.aClass81_4.aClass64_3 = null;
			}
		} catch (@Pc(137) IOException local137) {
			Static44.aClass16_13 = null;
			Static77.aClass16_8 = null;
			Static101.aClass56_65 = null;
			Static122.aClass16_14 = null;
		}
		if (Static116.anInt2705 != 0) {
			Static133.aBoolean129 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method336() {
		if (Static35.aClass25_1 != null) {
			Static35.aClass25_1.aBoolean40 = false;
		}
		Static35.aClass25_1 = null;
		if (Static72.aClass37_6 != null) {
			Static72.aClass37_6.method877();
			Static72.aClass37_6 = null;
		}
		Static16.method312();
		Static54.method872();
		Static24.aClass19_1 = null;
		if (Static85.aClass11_3 != null) {
			Static85.aClass11_3.method1835();
		}
		if (Static113.aClass11_2 != null) {
			Static113.aClass11_2.method1835();
		}
		Static48.method665();
		Static127.method636();
		try {
			if (Static44.aClass16_13 != null) {
				Static44.aClass16_13.method430();
			}
			if (Static130.aClass16Array1 != null) {
				for (@Pc(50) int local50 = 0; local50 < Static130.aClass16Array1.length; local50++) {
					if (Static130.aClass16Array1[local50] != null) {
						Static130.aClass16Array1[local50].method430();
					}
				}
			}
			if (Static122.aClass16_14 != null) {
				Static122.aClass16_14.method430();
			}
			if (Static77.aClass16_8 != null) {
				Static77.aClass16_8.method430();
			}
		} catch (@Pc(82) IOException local82) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method339() {
		@Pc(8) boolean local8 = Static50.method849();
		if (local8 && Static130.aBoolean126 && Static85.aClass11_3 != null) {
			Static85.aClass11_3.method1847();
		}
		if (Static84.aBoolean70) {
			Static40.method585(Static110.aCanvas1);
			Static29.method473(Static110.aCanvas1);
			if (Static24.aClass19_1 != null) {
				Static24.aClass19_1.method1356(Static110.aCanvas1);
			}
			this.method335();
			Static65.method1055(Static110.aCanvas1);
			Static29.method471(Static110.aCanvas1);
			if (Static24.aClass19_1 != null) {
				Static24.aClass19_1.method1360(Static110.aCanvas1);
			}
		}
		if (Static120.anInt2757 == 0) {
			Static33.method503(Static97.anInt2283, Static68.aClass60_682, null);
		} else if (Static120.anInt2757 == 5) {
			Static84.method1349(Static96.aClass4_Sub3_Sub6_Sub1_Sub1_5, Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3);
		} else if (Static120.anInt2757 == 10) {
			Static84.method1349(Static96.aClass4_Sub3_Sub6_Sub1_Sub1_5, Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3);
		} else if (Static120.anInt2757 == 20) {
			Static84.method1349(Static96.aClass4_Sub3_Sub6_Sub1_Sub1_5, Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3);
		} else if (Static120.anInt2757 == 25) {
			@Pc(127) int local127;
			if (Static4.anInt56 == 1) {
				if (Static91.anInt2128 < Static60.anInt2964) {
					Static91.anInt2128 = Static60.anInt2964;
				}
				local127 = (Static91.anInt2128 - Static60.anInt2964) * 50 / Static91.anInt2128;
				Static101.method1991(false, Static12.method1761(new Class60[] { Static37.aClass60_378, Static130.aClass60_1126, Static65.method1051(local127), Static36.aClass60_366 }));
			} else if (Static4.anInt56 == 2) {
				if (Static14.anInt518 < Static30.anInt905) {
					Static14.anInt518 = Static30.anInt905;
				}
				local127 = (Static14.anInt518 - Static30.anInt905) * 50 / Static14.anInt518 + 50;
				Static101.method1991(false, Static12.method1761(new Class60[] { Static37.aClass60_378, Static130.aClass60_1126, Static65.method1051(local127), Static36.aClass60_366 }));
			} else {
				Static101.method1991(false, Static37.aClass60_378);
			}
		} else if (Static120.anInt2757 == 30) {
			Static28.method1355();
		} else if (Static120.anInt2757 == 40) {
			Static101.method1991(false, Static12.method1761(new Class60[] { Static78.aClass60_782, Static72.aClass60_757, Static80.aClass60_796 }));
		}
		@Pc(248) int local248;
		@Pc(246) Graphics local246;
		if (Static120.anInt2757 == 30 && Static111.anInt2633 == 0 && !Static19.aBoolean24) {
			try {
				local246 = Static110.aCanvas1.getGraphics();
				for (local248 = 0; local248 < Static132.anInt2950; local248++) {
					if (Static108.aBooleanArray17[local248]) {
						Static86.aClass14_1.method691(Static68.anIntArray193[local248], Static78.anIntArray219[local248], local246, Static107.anIntArray324[local248], Static102.anIntArray309[local248]);
						Static108.aBooleanArray17[local248] = false;
					}
				}
			} catch (@Pc(284) Exception local284) {
				Static110.aCanvas1.repaint();
			}
		} else if (Static120.anInt2757 > 0) {
			try {
				local246 = Static110.aCanvas1.getGraphics();
				Static86.aClass14_1.method690(local246);
				Static19.aBoolean24 = false;
				for (local248 = 0; local248 < Static132.anInt2950; local248++) {
					Static108.aBooleanArray17[local248] = false;
				}
			} catch (@Pc(319) Exception local319) {
				Static110.aCanvas1.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method338()) {
			return;
		}
		Static42.anInt1103 = Integer.parseInt(this.getParameter("worldid"));
		Static133.anInt2976 = Integer.parseInt(this.getParameter("modewhat"));
		Static116.anInt2705 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static110.method1824();
		} else {
			Static1.method4();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static29.aBoolean36 = true;
		} else {
			Static29.aBoolean36 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static11.method220();
			Static23.aClass60_251 = Static29.aClass60_303;
			Static11.anInt428 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static19.anInt680 = 1;
		} else {
			Static19.anInt680 = 0;
		}
		try {
			Static55.anInt1494 = Integer.parseInt(this.getParameter("js"));
			Static49.anInt1206 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(101) Exception local101) {
		}
		Static63.aString2 = this.getCodeBase().getHost();
		this.method337(Static133.anInt2976 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method354() {
		if (Static39.anInt1049 >= 4) {
			this.method347("js5crc");
			Static120.anInt2757 = 1000;
			return;
		}
		if (Static5.anInt65 >= 4) {
			if (Static120.anInt2757 <= 5) {
				this.method347("js5io");
				Static120.anInt2757 = 1000;
				return;
			}
			Static119.anInt2749 = 3000;
			Static5.anInt65 = 3;
		}
		if (Static119.anInt2749-- > 0) {
			return;
		}
		try {
			if (Static80.anInt1908 == 0) {
				Static127.aClass43_3 = Static105.aClass81_4.method1939(Static80.anInt1907, Static63.aString2);
				Static80.anInt1908++;
			}
			if (Static80.anInt1908 == 1) {
				if (Static127.aClass43_3.anInt1565 == 2) {
					this.method355(-1);
					return;
				}
				if (Static127.aClass43_3.anInt1565 == 1) {
					Static80.anInt1908++;
				}
			}
			if (Static80.anInt1908 == 2) {
				Static75.aClass37_5 = new Class37((Socket) Static127.aClass43_3.anObject2, Static105.aClass81_4);
				@Pc(94) Class4_Sub9 local94 = new Class4_Sub9(5);
				local94.method819(15);
				local94.method808(465);
				Static75.aClass37_5.method875(5, local94.aByteArray6);
				Static80.anInt1908++;
				Static78.aLong64 = Static8.method75();
			}
			if (Static80.anInt1908 == 3) {
				if (Static120.anInt2757 <= 5 || Static75.aClass37_5.method876() > 0) {
					@Pc(148) int local148 = Static75.aClass37_5.method870();
					if (local148 != 0) {
						this.method355(local148);
						return;
					}
					Static80.anInt1908++;
				} else if (Static8.method75() - Static78.aLong64 > 30000L) {
					this.method355(-2);
					return;
				}
			}
			if (Static80.anInt1908 == 4) {
				Static1.method3(Static120.anInt2757 > 20, Static75.aClass37_5);
				Static80.anInt1908 = 0;
				Static72.anInt1825 = 0;
				Static127.aClass43_3 = null;
				Static75.aClass37_5 = null;
			}
		} catch (@Pc(185) IOException local185) {
			this.method355(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method345() {
		Static18.method353();
		Static83.method1347();
		Static99.method346();
		Static127.method633();
		Static75.method685();
		Static40.method586();
		Static113.method810();
		Static54.method871();
		Static108.method1790();
		Static23.method424();
		Static78.method1270();
		Static52.method863();
		Static51.method829();
		Static64.method1036();
		Static42.method612();
		Static102.method1702();
		Static11.method217();
		Static61.method987();
		Static118.method1893();
		Static28.method1359();
		Static24.method443();
		Static15.method1845();
		Static86.method1375();
		Static65.method1053();
		Static77.method1263();
		Static50.method857();
		Static131.method1980();
		Static94.method1525();
		Static109.method1803();
		Static101.method1990();
		Static76.method1243();
		Static43.method617();
		Static14.method283();
		Static92.method1498();
		Static89.method1448();
		Static59.method975();
		Static7.method62();
		Static49.method684();
		Static124.method1931();
		Static91.method1473();
		Static29.method474();
		Static44.method1483();
		Static1.method2();
		Static25.method447();
		Static41.method592();
		Static105.method1734();
		Static58.method954();
		Static123.method1924();
		Static97.method1577();
		Static56.method884();
		Static128.method1945();
		Static8.method76();
		Static62.method996();
		Static26.method451();
		Static12.method1786();
		Static9.method102();
		Static85.method1369();
		Static115.method1868();
		Static72.method1231();
		Static31.method483();
		Static84.method1350();
		Static98.method1579();
		Static80.method1282();
		Static81.method1289();
		Static70.method1114();
		Static33.method499();
		Static30.method479();
		Static6.method58();
		Static34.method1665();
		Static60.method1993();
		Static100.method1681();
		Static111.method1832();
		Static88.method1413();
		Static110.method1823();
		Static103.method1708();
		Static120.method1903();
		Static107.method1755();
		Static48.method666();
		Static36.method559();
		Static21.method404();
		Static130.method1958();
		Static121.method1913();
		Static22.method422();
		Static133.method1999();
		Static32.method493();
		Static87.method1396();
		Static20.method384();
		Static93.method1213();
		Static96.method1564();
		Static57.method944();
		Static46.method639();
		Static4.method47();
		Static117.method1887();
		Static55.method878();
		Static106.method1739();
		Static132.method1988();
		Static82.method1301();
		Static69.method1099();
		Static5.method55();
		Static116.method1884();
		Static39.method581();
		Static2.method7();
		Static17.method315();
		Static19.method374();
		Static68.method1098();
		Static38.method577();
		Static10.method164();
		Static90.method1471();
		Static35.method542();
		Static71.method1229();
		Static37.method568();
		Static74.method1240();
		Static3.method30();
		Static16.method308();
		Static129.method678();
		Static119.method1901();
		Static122.method1922();
		Static63.method999();
		Static45.method627();
		Static13.method282();
		Static73.method1233();
		Static79.method1275();
		Static95.method1559();
		Static112.method1856();
		Static66.method1071();
		Static114.method1864();
		Static53.method868();
		Static67.method1076();
		Static125.method1934();
		Static104.method1721();
		Static134.method2004();
		Static47.method648();
		Static27.method459();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method355(@OriginalArg(0) int arg0) {
		if (Static23.anInt803 == Static80.anInt1907) {
			Static80.anInt1907 = Static51.anInt1355;
		} else {
			Static80.anInt1907 = Static23.anInt803;
		}
		Static80.anInt1908 = 0;
		Static75.aClass37_5 = null;
		Static127.aClass43_3 = null;
		Static72.anInt1825++;
		if (Static72.anInt1825 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static120.anInt2757 <= 5) {
				this.method347("js5connect_full");
				Static120.anInt2757 = 1000;
			} else {
				Static119.anInt2749 = 3000;
			}
		} else if (Static72.anInt1825 >= 2 && arg0 == 6) {
			this.method347("js5connect_outofdate");
			Static120.anInt2757 = 1000;
		} else if (Static72.anInt1825 >= 4) {
			if (Static120.anInt2757 <= 5) {
				this.method347("js5connect");
				Static120.anInt2757 = 1000;
			} else {
				Static119.anInt2749 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method343() {
		Static118.anInt2741++;
		this.method351();
		Static18.method350();
		Static67.method1078();
		Static44.method1487();
		Static60.method1995();
		Static31.method482();
		if (Static24.aClass19_1 != null) {
			@Pc(35) int local35 = Static24.aClass19_1.method1357();
			Static105.anInt2480 = local35;
		}
		if (Static120.anInt2757 == 0) {
			Static7.method61();
			Static116.method1883();
		} else if (Static120.anInt2757 == 5) {
			Static36.method560(this);
			Static7.method61();
			Static116.method1883();
		} else if (Static120.anInt2757 == 10) {
			Static36.method560(this);
		} else if (Static120.anInt2757 == 20) {
			Static36.method560(this);
			Static82.method1306();
		} else if (Static120.anInt2757 == 25) {
			Static130.method1968();
		}
		if (Static120.anInt2757 == 30) {
			Static121.method1918();
		} else if (Static120.anInt2757 == 40) {
			Static82.method1306();
		}
	}
}
