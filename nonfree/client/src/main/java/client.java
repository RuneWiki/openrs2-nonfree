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

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static22.method497();
			}
			Static89.anInt2414 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static19.anInt2837 = 0;
			} else if (arg0[1].equals("office")) {
				Static19.anInt2837 = 1;
			} else if (arg0[1].equals("local")) {
				Static19.anInt2837 = 2;
			} else {
				Static22.method497();
			}
			if (arg0[2].equals("live")) {
				Static56.anInt1570 = 0;
			} else if (arg0[2].equals("rc")) {
				Static56.anInt1570 = 1;
			} else if (arg0[2].equals("wip")) {
				Static56.anInt1570 = 2;
			} else {
				Static22.method497();
			}
			if (arg0[3].equals("lowmem")) {
				Static75.method1220();
			} else if (arg0[3].equals("highmem")) {
				Static24.method501();
			} else {
				Static22.method497();
			}
			if (arg0[4].equals("free")) {
				Static59.aBoolean87 = false;
			} else if (arg0[4].equals("members")) {
				Static59.aBoolean87 = true;
			} else {
				Static22.method497();
			}
			if (arg0[5].equals("english")) {
				Static100.anInt2474 = 0;
			} else if (arg0[5].equals("german")) {
				Static74.method1201();
				Static100.anInt2474 = 1;
			} else {
				Static22.method497();
			}
			@Pc(154) client local154 = new client();
			local154.method354("runescape", Static56.anInt1570 + 32, InetAddress.getLocalHost());
		} catch (@Pc(168) Exception local168) {
			Static72.method1184(null, local168);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method347() {
		Static12.anInt451++;
		this.method364();
		Static39.method691();
		Static92.method1546();
		Static41.method707();
		Static9.method1155();
		Static21.method488();
		if (Static35.anInt1104 == 0) {
			Static76.method1251();
			Static95.method1614();
		} else if (Static35.anInt1104 == 5) {
			Static76.method1251();
			Static95.method1614();
		} else if (Static35.anInt1104 == 10) {
			Static93.method1588();
		} else if (Static35.anInt1104 == 20) {
			Static93.method1588();
			Static38.method679();
		} else if (Static35.anInt1104 == 25) {
			Static79.method1285();
		}
		if (Static35.anInt1104 == 30) {
			Static22.method496();
		} else if (Static35.anInt1104 == 35) {
			Static22.method496();
		} else if (Static35.anInt1104 == 40) {
			Static38.method679();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method350() {
		Static61.anInt1671 = Static19.anInt2837 == 0 ? 43594 : Static89.anInt2414 + 40000;
		Static85.anInt2270 = Static61.anInt1671;
		Static20.anInt703 = Static19.anInt2837 == 0 ? 443 : Static89.anInt2414 + 50000;
		Static95.method1615();
		Static96.method1635(Static44.aCanvas1);
		Static15.method376(Static44.aCanvas1);
		Static51.anInt2318 = Static47.anInt1371;
		try {
			if (Static2.aClass35_1.aClass8_3 != null) {
				Static70.aClass13_2 = new Class13(Static2.aClass35_1.aClass8_3, 5200, 0);
				for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
					Static96.aClass13Array1[local57] = new Class13(Static2.aClass35_1.aClass8Array1[local57], 6000, 0);
				}
				Static38.aClass13_1 = new Class13(Static2.aClass35_1.aClass8_2, 6000, 0);
				Static52.aClass46_3 = new Class46(255, Static70.aClass13_2, Static38.aClass13_1, 500000);
				Static2.aClass35_1.aClass8_3 = null;
				Static2.aClass35_1.aClass8Array1 = null;
				Static2.aClass35_1.aClass8_2 = null;
			}
		} catch (@Pc(104) IOException local104) {
			Static52.aClass46_3 = null;
			Static38.aClass13_1 = null;
			Static70.aClass13_2 = null;
		}
		if (Static19.anInt2837 != 0) {
			Static91.aBoolean150 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method358()) {
			return;
		}
		Static89.anInt2414 = Integer.parseInt(this.getParameter("worldid"));
		Static56.anInt1570 = Integer.parseInt(this.getParameter("modewhat"));
		Static19.anInt2837 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static75.method1220();
		} else {
			Static24.method501();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static59.aBoolean87 = true;
		} else {
			Static59.aBoolean87 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("de")) {
			Static74.method1201();
			Static100.anInt2474 = 1;
		}
		this.method353(Static56.anInt1570 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method357() {
		Static14.method365();
		Static102.method1676();
		Static83.method359();
		Static48.method781();
		Static10.method1325();
		Static52.method687();
		Static49.method783();
		Static54.method1809();
		Static61.method1027();
		Static89.method1525();
		Static15.method380();
		Static71.method1181();
		Static68.method1158();
		Static104.method1817();
		Static88.method1492();
		Static1.method36();
		Static12.method298();
		Static45.method758();
		Static27.method532();
		Static28.method569();
		Static13.method326();
		Static78.method1266();
		Static9.method1152();
		Static4.method159();
		Static16.method434();
		Static64.method1077();
		Static19.method1860();
		Static90.method1535();
		Static5.method164();
		Static108.method1838();
		Static63.method1519();
		Static46.method763();
		Static75.method1229();
		Static57.method948();
		Static3.method149();
		Static42.method712();
		Static62.method1047();
		Static29.method583();
		Static26.method518();
		Static50.method1844();
		Static7.method180();
		Static69.method1160();
		Static25.method511();
		Static34.method658();
		Static73.method1193();
		Static37.method669();
		Static22.method495();
		Static94.method1593();
		Static92.method1549();
		Static17.method1868();
		Static58.method975();
		Static99.method1659();
		Static77.method1253();
		Static59.method980();
		Static70.method1176();
		Static36.method668();
		Static66.method1121();
		Static97.method1737();
		Static105.method1826();
		Static24.method503();
		Static65.method1088();
		Static79.method1287();
		Static32.method627();
		Static86.method1414();
		Static33.method649();
		Static8.method208();
		Static98.method1651();
		Static95.method1616();
		Static76.method1249();
		Static21.method485();
		Static18.method464();
		Static107.method1864();
		Static38.method680();
		Static6.method172();
		Static23.method499();
		Static41.method709();
		Static35.method660();
		Static103.method1713();
		Static74.method1202();
		Static106.method1847();
		Static80.method1308();
		Static109.method1877();
		Static85.method1395();
		Static55.method911();
		Static56.method925();
		Static91.method1542();
		Static31.method609();
		Static2.method68();
		Static39.method690();
		Static40.method693();
		Static84.method1373();
		Static72.method1183();
		Static101.method1671();
		Static44.method717();
		Static43.method716();
		Static96.method1632();
		Static81.method1321();
		Static100.method1583();
		Static30.method599();
		Static67.method1364();
		Static60.method1022();
		Static20.method472();
		Static53.method831();
		Static51.method1441();
		Static11.method292();
		Static93.method1590();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method364() {
		if (Static35.anInt1104 != 1000) {
			@Pc(18) boolean local18 = Static64.method1084();
			if (!local18) {
				this.method370();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method346() {
		if (Static89.aClass37_1 != null) {
			Static89.aClass37_1.aBoolean77 = false;
		}
		Static89.aClass37_1 = null;
		if (Static55.aClass41_2 != null) {
			Static55.aClass41_2.method1025();
		}
		Static54.method1799();
		Static3.method148();
		Static92.method1554();
		Static75.method1226();
		Static95.method1610();
		Static30.method597();
		try {
			if (Static70.aClass13_2 != null) {
				Static70.aClass13_2.method373();
			}
			if (Static96.aClass13Array1 != null) {
				for (@Pc(38) int local38 = 0; local38 < Static96.aClass13Array1.length; local38++) {
					if (Static96.aClass13Array1[local38] != null) {
						Static96.aClass13Array1[local38].method373();
					}
				}
			}
			if (Static38.aClass13_1 != null) {
				Static38.aClass13_1.method373();
			}
		} catch (@Pc(61) IOException local61) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method368(@OriginalArg(1) int arg0) {
		Static53.anInt1434++;
		Static2.anInt50 = 0;
		if (Static61.anInt1671 == Static85.anInt2270) {
			Static85.anInt2270 = Static20.anInt703;
		} else {
			Static85.anInt2270 = Static61.anInt1671;
		}
		Static93.aClass54_6 = null;
		Static35.aClass41_1 = null;
		if (Static53.anInt1434 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static35.anInt1104 > 5) {
				Static109.anInt2860 = 3000;
			} else {
				this.method351("js5connect_full");
				Static35.anInt1104 = 1000;
			}
		} else if (Static53.anInt1434 >= 2 && arg0 == 6) {
			this.method351("js5connect_outofdate");
			Static35.anInt1104 = 1000;
		} else if (Static53.anInt1434 >= 4) {
			if (Static35.anInt1104 <= 5) {
				this.method351("js5connect");
				Static35.anInt1104 = 1000;
			} else {
				Static109.anInt2860 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method370() {
		if (Static86.anInt2295 >= 4) {
			this.method351("js5crc");
			Static35.anInt1104 = 1000;
			return;
		}
		if (Static17.anInt2844 >= 4) {
			if (Static35.anInt1104 <= 5) {
				this.method351("js5io");
				Static35.anInt1104 = 1000;
				return;
			}
			Static109.anInt2860 = 3000;
			Static17.anInt2844 = 3;
		}
		if (Static109.anInt2860-- > 0) {
			return;
		}
		try {
			if (Static2.anInt50 == 0) {
				Static93.aClass54_6 = Static2.aClass35_1.method769(Static85.anInt2270);
				Static2.anInt50++;
			}
			if (Static2.anInt50 == 1) {
				if (Static93.aClass54_6.anInt2217 == 2) {
					this.method368(-1);
					return;
				}
				if (Static93.aClass54_6.anInt2217 == 1) {
					Static2.anInt50++;
				}
			}
			if (Static2.anInt50 == 2) {
				Static35.aClass41_1 = new Class41((Socket) Static93.aClass54_6.anObject3, Static2.aClass35_1);
				@Pc(102) Class3_Sub8 local102 = new Class3_Sub8(5);
				local102.method1806(15);
				local102.method1792(417);
				Static35.aClass41_1.method1033(local102.aByteArray26, 5);
				Static2.anInt50++;
				Static20.aLong24 = System.currentTimeMillis();
			}
			if (Static2.anInt50 == 3) {
				if (Static35.anInt1104 <= 5 || Static35.aClass41_1.method1029() > 0) {
					@Pc(141) int local141 = Static35.aClass41_1.method1024();
					if (local141 != 0) {
						this.method368(local141);
						return;
					}
					Static2.anInt50++;
				} else if (System.currentTimeMillis() - Static20.aLong24 > 30000L) {
					this.method368(-2);
					return;
				}
			}
			if (Static2.anInt50 == 4) {
				Static55.method912(Static35.anInt1104 > 20, Static35.aClass41_1);
				Static93.aClass54_6 = null;
				Static35.aClass41_1 = null;
				Static2.anInt50 = 0;
				Static53.anInt1434 = 0;
			}
		} catch (@Pc(194) IOException local194) {
			this.method368(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method356() {
		if (Static4.aBoolean8) {
			Static94.method1594(Static44.aCanvas1);
			Static76.method1243(Static44.aCanvas1);
			this.method355();
			Static96.method1635(Static44.aCanvas1);
			Static15.method376(Static44.aCanvas1);
		}
		if (Static35.anInt1104 == 0) {
			Static44.method721(Static94.anInt2490, Static74.aClass62_876, null);
		} else if (Static35.anInt1104 == 5) {
			Static50.method1845(Static86.aClass3_Sub1_Sub1_Sub3_11, Static71.aClass3_Sub1_Sub1_Sub3_8);
		} else if (Static35.anInt1104 == 10) {
			Static50.method1845(Static86.aClass3_Sub1_Sub1_Sub3_11, Static71.aClass3_Sub1_Sub1_Sub3_8);
		} else if (Static35.anInt1104 == 20) {
			Static50.method1845(Static86.aClass3_Sub1_Sub1_Sub3_11, Static71.aClass3_Sub1_Sub1_Sub3_8);
		} else if (Static35.anInt1104 == 25) {
			@Pc(117) int local117;
			if (Static14.anInt553 == 1) {
				if (Static40.anInt1176 < Static15.anInt566) {
					Static40.anInt1176 = Static15.anInt566;
				}
				local117 = (Static40.anInt1176 - Static15.anInt566) * 50 / Static40.anInt1176;
				Static74.method1203(Static49.method782(new Class62[] { Static91.aClass62_1095, Static99.method1662(local117), Static83.aClass62_202 }), Static93.aClass62_1129, true);
			} else if (Static14.anInt553 == 2) {
				if (Static6.anInt210 > Static21.anInt731) {
					Static21.anInt731 = Static6.anInt210;
				}
				local117 = (Static21.anInt731 - Static6.anInt210) * 50 / Static21.anInt731 + 50;
				Static74.method1203(Static49.method782(new Class62[] { Static91.aClass62_1095, Static99.method1662(local117), Static83.aClass62_202 }), Static93.aClass62_1129, true);
			} else {
				Static74.method1203(null, Static93.aClass62_1129, false);
			}
		} else if (Static35.anInt1104 == 30) {
			Static28.method572();
		} else if (Static35.anInt1104 == 35) {
			Static28.method576();
		} else if (Static35.anInt1104 == 40) {
			Static74.method1203(Static105.aClass62_1258, Static34.aClass62_471, false);
		}
		Static80.anInt2161 = 0;
	}
}
