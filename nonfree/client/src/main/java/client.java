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
				Static55.method394();
			}
			Static45.anInt1033 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static37.anInt1938 = 0;
			} else if (arg0[1].equals("office")) {
				Static37.anInt1938 = 1;
			} else if (arg0[1].equals("local")) {
				Static37.anInt1938 = 2;
			} else {
				Static55.method394();
			}
			if (arg0[2].equals("live")) {
				Static29.anInt685 = 0;
			} else if (arg0[2].equals("rc")) {
				Static29.anInt685 = 1;
			} else if (arg0[2].equals("wip")) {
				Static29.anInt685 = 2;
			} else {
				Static55.method394();
			}
			if (arg0[3].equals("lowmem")) {
				Static46.method747();
			} else if (arg0[3].equals("highmem")) {
				Static64.method1006();
			} else {
				Static55.method394();
			}
			if (arg0[4].equals("free")) {
				Static1.aBoolean86 = false;
			} else if (arg0[4].equals("members")) {
				Static1.aBoolean86 = true;
			} else {
				Static55.method394();
			}
			if (arg0[5].equals("english")) {
				Static95.anInt2095 = 0;
			} else if (arg0[5].equals("german")) {
				Static20.method444();
				Static97.aClass74_1727 = Static48.aClass74_841;
				Static95.anInt2095 = 1;
			} else {
				Static55.method394();
			}
			Static88.aString4 = "127.0.0.1";
			@Pc(152) client local152 = new client();
			local152.method392(Static29.anInt685 + 32, "runescape");
		} catch (@Pc(165) Exception local165) {
			Static29.method518(null, local165);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method400(@OriginalArg(1) int arg0) {
		Static101.anInt2238++;
		Static11.aClass62_2 = null;
		Static14.anInt415 = 0;
		Static117.aClass37_8 = null;
		if (Static109.anInt2397 == Static53.anInt1292) {
			Static53.anInt1292 = Static8.anInt252;
		} else {
			Static53.anInt1292 = Static109.anInt2397;
		}
		if (Static101.anInt2238 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static68.anInt1490 <= 5) {
				this.method390("js5connect_full");
				Static68.anInt1490 = 1000;
			} else {
				Static38.anInt917 = 3000;
			}
		} else if (Static101.anInt2238 >= 2 && arg0 == 6) {
			this.method390("js5connect_outofdate");
			Static68.anInt1490 = 1000;
		} else if (Static101.anInt2238 >= 4) {
			if (Static68.anInt1490 <= 5) {
				this.method390("js5connect");
				Static68.anInt1490 = 1000;
			} else {
				Static38.anInt917 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method401() {
		if (Static68.anInt1490 != 1000) {
			@Pc(16) boolean local16 = Static50.method810();
			if (!local16) {
				this.method406();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method381() {
		@Pc(8) boolean local8 = Static62.method996();
		if (local8 && Static57.aBoolean52 && Static79.aClass22_1 != null) {
			Static79.aClass22_1.method1080();
		}
		if (Static124.aBoolean118) {
			Static120.method1767(Static51.aCanvas2);
			Static19.method430(Static51.aCanvas2);
			if (Static8.aClass66_1 != null) {
				Static8.aClass66_1.method1901(Static51.aCanvas2);
			}
			this.method397();
			Static30.method537(Static51.aCanvas2);
			Static35.method1931(Static51.aCanvas2);
			if (Static8.aClass66_1 != null) {
				Static8.aClass66_1.method1903(Static51.aCanvas2);
			}
		}
		if (Static68.anInt1490 == 0) {
			Static20.method448(Static81.anInt1787, null, Static49.aClass74_850);
		} else if (Static68.anInt1490 == 5) {
			Static110.method1675(Static123.aClass2_Sub2_Sub1_Sub3_13, Static54.aClass2_Sub2_Sub1_Sub3_7);
		} else if (Static68.anInt1490 == 10) {
			Static110.method1675(Static123.aClass2_Sub2_Sub1_Sub3_13, Static54.aClass2_Sub2_Sub1_Sub3_7);
		} else if (Static68.anInt1490 == 20) {
			Static110.method1675(Static123.aClass2_Sub2_Sub1_Sub3_13, Static54.aClass2_Sub2_Sub1_Sub3_7);
		} else if (Static68.anInt1490 == 25) {
			@Pc(107) int local107;
			if (Static77.anInt1674 == 1) {
				if (Static34.anInt849 < Static30.anInt728) {
					Static34.anInt849 = Static30.anInt728;
				}
				local107 = (Static34.anInt849 - Static30.anInt728) * 50 / Static34.anInt849;
				Static9.method226(Static92.aClass74_1314, Static91.method1340(new Class74[] { Static33.aClass74_613, Static56.method940(local107), Static29.aClass74_532 }), true);
			} else if (Static77.anInt1674 == 2) {
				if (Static61.anInt1576 > Static48.anInt1154) {
					Static48.anInt1154 = Static61.anInt1576;
				}
				local107 = (Static48.anInt1154 - Static61.anInt1576) * 50 / Static48.anInt1154 + 50;
				Static9.method226(Static92.aClass74_1314, Static91.method1340(new Class74[] { Static33.aClass74_613, Static56.method940(local107), Static29.aClass74_532 }), true);
			} else {
				Static9.method226(Static92.aClass74_1314, null, false);
			}
		} else if (Static68.anInt1490 == 30) {
			Static84.method1291();
		} else if (Static68.anInt1490 == 35) {
			Static79.method1247();
		} else if (Static68.anInt1490 == 40) {
			Static9.method226(Static17.aClass74_437, Static21.aClass74_478, false);
		}
		Static106.anInt2330 = 0;
		Static10.anInt322 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method383() {
		Static17.method405();
		Static116.method1713();
		Static55.method396();
		Static87.method924();
		Static103.method1584();
		Static65.method1011();
		Static51.method1523();
		Static92.method1346();
		Static93.method1381();
		Static33.method597();
		Static120.method1764();
		Static95.method1445();
		Static100.method1539();
		Static13.method321();
		Static108.method1635();
		Static83.method1280();
		Static124.method1872();
		Static19.method417();
		Static125.method1897();
		Static104.method1904();
		Static86.method1303();
		Static61.method1083();
		Static45.method733();
		Static20.method439();
		Static69.method1051();
		Static7.method1859();
		Static38.method650();
		Static47.method770();
		Static35.method1933();
		Static66.method1012();
		Static39.method661();
		Static24.method488();
		Static76.method1127();
		Static94.method1406();
		Static88.method1310();
		Static111.method1680();
		Static72.method1078();
		Static2.method21();
		Static34.method600();
		Static99.method1471();
		Static123.method1856();
		Static3.method23();
		Static25.method498();
		Static127.method1928();
		Static90.method1331();
		Static73.method1079();
		Static63.method999();
		Static102.method1570();
		Static10.method245();
		Static97.method1936();
		Static37.method1361();
		Static31.method576();
		Static82.method1265();
		Static121.method1785();
		Static52.method876();
		Static18.method409();
		Static85.method1293();
		Static43.method682();
		Static41.method673();
		Static68.method1033();
		Static71.method1069();
		Static84.method1290();
		Static109.method1668();
		Static29.method521();
		Static44.method724();
		Static58.method705();
		Static107.method1605();
		Static62.method995();
		Static75.method1099();
		Static15.method356();
		Static60.method978();
		Static126.method1923();
		Static67.method1029();
		Static91.method1342();
		Static79.method1241();
		Static23.method484();
		Static36.method611();
		Static101.method1567();
		Static78.method1228();
		Static117.method1744();
		Static14.method342();
		Static12.method273();
		Static46.method744();
		Static53.method898();
		Static32.method588();
		Static70.method1061();
		Static59.method966();
		Static42.method676();
		Static106.method1596();
		Static81.method1264();
		Static4.method24();
		Static57.method954();
		Static50.method809();
		Static128.method1940();
		Static49.method799();
		Static5.method34();
		Static28.method513();
		Static48.method791();
		Static54.method919();
		Static9.method227();
		Static80.method1252();
		Static6.method111();
		Static89.method1329();
		Static30.method536();
		Static98.method1470();
		Static27.method508();
		Static64.method1008();
		Static8.method170();
		Static105.method1592();
		Static1.method1462();
		Static113.method1688();
		Static16.method359();
		Static119.method1760();
		Static74.method1098();
		Static122.method1820();
		Static40.method666();
		Static115.method1694();
		Static21.method457();
		Static26.method499();
		Static112.method1682();
		Static110.method1676();
		Static11.method252();
		Static114.method1691();
		Static118.method1751();
		Static96.method1449();
		Static77.method1208();
		Static56.method945();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method393() {
		Static109.anInt2397 = Static37.anInt1938 == 0 ? 43594 : Static45.anInt1033 + 40000;
		Static53.anInt1292 = Static109.anInt2397;
		Static8.anInt252 = Static37.anInt1938 == 0 ? 443 : Static45.anInt1033 + 50000;
		Static85.method1294();
		Static30.method537(Static51.aCanvas2);
		Static35.method1931(Static51.aCanvas2);
		Static8.aClass66_1 = Static111.method1679();
		if (Static8.aClass66_1 != null) {
			Static8.aClass66_1.method1903(Static51.aCanvas2);
		}
		Static2.anInt38 = Static22.anInt620;
		try {
			if (Static35.aClass15_59.aClass6_1 != null) {
				Static89.aClass24_2 = new Class24(Static35.aClass15_59.aClass6_1, 5200, 0);
				for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
					Static63.aClass24Array1[local60] = new Class24(Static35.aClass15_59.aClass6Array1[local60], 6000, 0);
				}
				Static83.aClass24_1 = new Class24(Static35.aClass15_59.aClass6_2, 6000, 0);
				Static56.aClass77_1 = new Class77(255, Static89.aClass24_2, Static83.aClass24_1, 500000);
				Static35.aClass15_59.aClass6_1 = null;
				Static35.aClass15_59.aClass6_2 = null;
				Static35.aClass15_59.aClass6Array1 = null;
			}
		} catch (@Pc(105) IOException local105) {
			Static56.aClass77_1 = null;
			Static83.aClass24_1 = null;
			Static89.aClass24_2 = null;
		}
		if (Static37.anInt1938 != 0) {
			Static87.aBoolean50 = true;
		}
		Static2.aClass2_Sub2_Sub17_1 = new Class2_Sub2_Sub17();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method388()) {
			return;
		}
		Static45.anInt1033 = Integer.parseInt(this.getParameter("worldid"));
		Static29.anInt685 = Integer.parseInt(this.getParameter("modewhat"));
		Static37.anInt1938 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static46.method747();
		} else {
			Static64.method1006();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static1.aBoolean86 = true;
		} else {
			Static1.aBoolean86 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static20.method444();
			Static97.aClass74_1727 = Static48.aClass74_841;
			Static95.anInt2095 = 1;
		}
		try {
			Static36.anInt866 = Integer.parseInt(this.getParameter("js"));
			Static54.anInt1321 = Integer.parseInt(this.getParameter("plug"));
		} catch (@Pc(85) Exception local85) {
		}
		Static88.aString4 = this.getCodeBase().getHost();
		this.method391(Static29.anInt685 + 32);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method398() {
		Static107.anInt2338++;
		this.method401();
		Static70.method1065();
		Static43.method681();
		Static31.method574();
		Static67.method1031();
		Static75.method1102();
		if (Static8.aClass66_1 != null) {
			@Pc(33) int local33 = Static8.aClass66_1.method1900();
			Static97.anInt2889 = local33;
			Static10.anInt322 += local33;
		}
		if (Static68.anInt1490 == 0) {
			Static75.method1100();
			Static38.method651();
		} else if (Static68.anInt1490 == 5) {
			Static1.method1459(this);
			Static75.method1100();
			Static38.method651();
		} else if (Static68.anInt1490 == 10) {
			Static1.method1459(this);
		} else if (Static68.anInt1490 == 20) {
			Static1.method1459(this);
			Static121.method1812();
		} else if (Static68.anInt1490 == 25) {
			Static80.method1256();
		}
		if (Static68.anInt1490 == 30) {
			Static33.method594();
		} else if (Static68.anInt1490 == 35) {
			Static33.method594();
			return;
		} else if (Static68.anInt1490 == 40) {
			Static121.method1812();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method387() {
		if (Static39.aClass43_1 != null) {
			Static39.aClass43_1.aBoolean56 = false;
		}
		Static39.aClass43_1 = null;
		if (Static88.aClass62_4 != null) {
			Static88.aClass62_4.method1347();
			Static88.aClass62_4 = null;
		}
		Static54.method920();
		Static54.method921();
		Static8.aClass66_1 = null;
		if (Static79.aClass22_1 != null) {
			Static79.aClass22_1.method1086();
		}
		if (Static98.aClass22_2 != null) {
			Static98.aClass22_2.method1086();
		}
		Static5.method31();
		Static95.method1446();
		try {
			if (Static89.aClass24_2 != null) {
				Static89.aClass24_2.method592();
			}
			if (Static63.aClass24Array1 != null) {
				for (@Pc(55) int local55 = 0; local55 < Static63.aClass24Array1.length; local55++) {
					if (Static63.aClass24Array1[local55] != null) {
						Static63.aClass24Array1[local55].method592();
					}
				}
			}
			if (Static83.aClass24_1 != null) {
				Static83.aClass24_1.method592();
			}
		} catch (@Pc(82) IOException local82) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method406() {
		if (Static47.anInt1092 >= 4) {
			this.method390("js5crc");
			Static68.anInt1490 = 1000;
			return;
		}
		if (Static30.anInt724 >= 4) {
			if (Static68.anInt1490 <= 5) {
				this.method390("js5io");
				Static68.anInt1490 = 1000;
				return;
			}
			Static30.anInt724 = 3;
			Static38.anInt917 = 3000;
		}
		if (Static38.anInt917-- > 0) {
			return;
		}
		try {
			if (Static14.anInt415 == 0) {
				Static117.aClass37_8 = Static35.aClass15_59.method462(Static53.anInt1292, Static88.aString4);
				Static14.anInt415++;
			}
			if (Static14.anInt415 == 1) {
				if (Static117.aClass37_8.anInt1337 == 2) {
					this.method400(-1);
					return;
				}
				if (Static117.aClass37_8.anInt1337 == 1) {
					Static14.anInt415++;
				}
			}
			if (Static14.anInt415 == 2) {
				Static11.aClass62_2 = new Class62((Socket) Static117.aClass37_8.anObject3, Static35.aClass15_59);
				@Pc(92) Class2_Sub10 local92 = new Class2_Sub10(5);
				local92.method1486(15);
				local92.method1497(456);
				Static11.aClass62_2.method1343(5, local92.aByteArray27);
				Static14.anInt415++;
				Static1.aLong78 = Static10.method244();
			}
			if (Static14.anInt415 == 3) {
				if (Static68.anInt1490 <= 5 || Static11.aClass62_2.method1350() > 0) {
					@Pc(133) int local133 = Static11.aClass62_2.method1348();
					if (local133 != 0) {
						this.method400(local133);
						return;
					}
					Static14.anInt415++;
				} else if (Static10.method244() - Static1.aLong78 > 30000L) {
					this.method400(-2);
					return;
				}
			}
			if (Static14.anInt415 == 4) {
				Static46.method745(Static68.anInt1490 > 20, Static11.aClass62_2);
				Static14.anInt415 = 0;
				Static101.anInt2238 = 0;
				Static11.aClass62_2 = null;
				Static117.aClass37_8 = null;
			}
		} catch (@Pc(182) IOException local182) {
			this.method400(-3);
		}
	}
}
