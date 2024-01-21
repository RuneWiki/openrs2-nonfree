import java.awt.Canvas;
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
			if (arg0.length != 7) {
				Static7.method128();
			}
			Static183.anInt3929 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static86.anInt1862 = 0;
			} else if (arg0[1].equals("office")) {
				Static86.anInt1862 = 1;
			} else if (arg0[1].equals("local")) {
				Static86.anInt1862 = 2;
			} else {
				Static7.method128();
			}
			if (arg0[2].equals("live")) {
				Static93.anInt1975 = 0;
			} else if (arg0[2].equals("rc")) {
				Static93.anInt1975 = 1;
			} else if (arg0[2].equals("wip")) {
				Static93.anInt1975 = 2;
			} else {
				Static7.method128();
			}
			if (arg0[3].equals("lowmem")) {
				Static36.method677();
			} else if (arg0[3].equals("highmem")) {
				Static109.method1643();
			} else {
				Static7.method128();
			}
			if (arg0[4].equals("free")) {
				Static181.aBoolean221 = false;
			} else if (arg0[4].equals("members")) {
				Static181.aBoolean221 = true;
			} else {
				Static7.method128();
			}
			if (arg0[5].equals("english")) {
				Static93.anInt1976 = 0;
			} else if (arg0[5].equals("german")) {
				Static162.method2553();
				Static93.anInt1976 = 1;
			} else {
				Static7.method128();
			}
			if (arg0[6].equals("game0")) {
				Static63.anInt3580 = 0;
			} else if (arg0[6].equals("game1")) {
				Static63.anInt3580 = 1;
			} else {
				Static7.method128();
			}
			Static124.aClass92_1222 = Static26.aClass92_268;
			Static109.aString5 = "127.0.0.1";
			Static70.anInt1590 = 0;
			@Pc(178) client local178 = new client();
			local178.method536(Static93.anInt1975 + 32, "runescape");
			Static11.aFrame1.setLocation(40, 40);
		} catch (@Pc(195) Exception local195) {
			Static61.method998(local195, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method538() {
		if (Static165.aClass51_1 != null) {
			Static165.aClass51_1.aBoolean116 = false;
		}
		Static165.aClass51_1 = null;
		if (Static27.aClass57_1 != null) {
			Static27.aClass57_1.method1672();
			Static27.aClass57_1 = null;
		}
		Static152.method2318(Static119.aCanvas1);
		Static18.method403(Static119.aCanvas1);
		if (Static136.aClass29_1 != null) {
			Static136.aClass29_1.method2106(Static119.aCanvas1);
		}
		Static50.method2315();
		Static170.method2664();
		Static136.aClass29_1 = null;
		if (Static65.aClass15_2 != null) {
			Static65.aClass15_2.method2617();
		}
		if (Static42.aClass15_3 != null) {
			Static42.aClass15_3.method2617();
		}
		Static25.method474();
		Static84.method1274();
		try {
			if (Static180.aClass96_47 != null) {
				Static180.aClass96_47.method3337();
			}
			if (Static66.aClass96Array1 != null) {
				for (@Pc(64) int local64 = 0; local64 < Static66.aClass96Array1.length; local64++) {
					if (Static66.aClass96Array1[local64] != null) {
						Static66.aClass96Array1[local64].method3337();
					}
				}
			}
			if (Static61.aClass96_16 != null) {
				Static61.aClass96_16.method3337();
			}
			if (Static63.aClass96_39 != null) {
				Static63.aClass96_39.method3337();
			}
		} catch (@Pc(92) IOException local92) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method535() {
		@Pc(4) boolean local4 = Static62.method1007();
		if (local4 && Static156.aBoolean183 && Static65.aClass15_2 != null) {
			Static65.aClass15_2.method2609();
		}
		@Pc(15) boolean local15 = false;
		if (Static79.aBoolean109) {
			local15 = true;
			Static79.aBoolean109 = false;
		}
		if (Static31.anInt748 == 0) {
			Static161.method2534(Static88.aClass92_804, Static144.anInt2892, null, local15);
		} else if (Static31.anInt748 == 5 || Static31.anInt748 == 10 || Static31.anInt748 == 20) {
			Static163.method2694(Static201.aClass1_Sub3_Sub1_Sub3_Sub1_5, Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3);
		} else if (Static31.anInt748 == 25) {
			@Pc(119) int local119;
			if (Static132.anInt2747 == 1) {
				if (Static49.anInt1254 < Static29.anInt717) {
					Static49.anInt1254 = Static29.anInt717;
				}
				local119 = (Static49.anInt1254 - Static29.anInt717) * 50 / Static49.anInt1254;
				Static80.method1240(Static208.method787(new Class92[] { Static26.aClass92_265, Static200.aClass92_1997, Static49.method872(local119), Static151.aClass92_1469 }), false);
			} else if (Static132.anInt2747 == 2) {
				if (Static123.anInt2600 < Static28.anInt645) {
					Static123.anInt2600 = Static28.anInt645;
				}
				local119 = (Static123.anInt2600 - Static28.anInt645) * 50 / Static123.anInt2600 + 50;
				Static80.method1240(Static208.method787(new Class92[] { Static26.aClass92_265, Static200.aClass92_1997, Static49.method872(local119), Static151.aClass92_1469 }), false);
			} else {
				Static80.method1240(Static26.aClass92_265, false);
			}
		} else if (Static31.anInt748 == 30) {
			Static71.method1105();
		} else if (Static31.anInt748 == 40) {
			Static80.method1240(Static208.method787(new Class92[] { Static85.aClass92_780, Static117.aClass92_1159, Static172.aClass92_1743 }), false);
		}
		@Pc(205) Canvas local205 = Static119.aCanvas1;
		@Pc(217) Graphics local217;
		@Pc(225) int local225;
		if (Static31.anInt748 == 30 && Static173.anInt3701 == 0 && !local15) {
			try {
				local217 = local205.getGraphics();
				for (local225 = 0; local225 < Static89.anInt1911; local225++) {
					if (Static143.aBooleanArray13[local225]) {
						Static84.aClass22_1.method1658(Static189.anIntArray331[local225], Static111.anIntArray182[local225], Static110.anIntArray176[local225], local217, Static49.anIntArray90[local225]);
						Static143.aBooleanArray13[local225] = false;
					}
				}
			} catch (@Pc(281) Exception local281) {
				local205.repaint();
			}
		} else if (Static31.anInt748 > 0) {
			try {
				local217 = local205.getGraphics();
				Static84.aClass22_1.method1657(local217);
				for (local225 = 0; local225 < Static89.anInt1911; local225++) {
					Static143.aBooleanArray13[local225] = false;
				}
			} catch (@Pc(237) Exception local237) {
				local205.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method550() {
		if (Static107.anInt2317 >= 4) {
			this.method544("js5crc");
			Static31.anInt748 = 1000;
			return;
		}
		if (Static157.anInt3249 >= 4) {
			if (Static31.anInt748 <= 5) {
				this.method544("js5io");
				Static31.anInt748 = 1000;
				return;
			}
			Static51.anInt1264 = 3000;
			Static157.anInt3249 = 3;
		}
		if (Static51.anInt1264-- > 0) {
			return;
		}
		try {
			if (Static51.anInt1263 == 0) {
				Static68.aClass65_4 = Static169.aClass24_4.method555(Static23.anInt561, Static109.aString5);
				Static51.anInt1263++;
			}
			if (Static51.anInt1263 == 1) {
				if (Static68.aClass65_4.anInt2681 == 2) {
					this.method551(-1);
					return;
				}
				if (Static68.aClass65_4.anInt2681 == 1) {
					Static51.anInt1263++;
				}
			}
			if (Static51.anInt1263 == 2) {
				Static52.aClass57_3 = new Class57((Socket) Static68.aClass65_4.anObject3, Static169.aClass24_4);
				@Pc(89) Class1_Sub14 local89 = new Class1_Sub14(5);
				local89.method3024(15);
				local89.method3032(492);
				Static52.aClass57_3.method1673(local89.aByteArray49, 5);
				Static51.anInt1263++;
				Static76.aLong81 = Static124.method1828();
			}
			if (Static51.anInt1263 == 3) {
				if (Static31.anInt748 <= 5 || Static52.aClass57_3.method1674() > 0) {
					@Pc(144) int local144 = Static52.aClass57_3.method1668();
					if (local144 != 0) {
						this.method551(local144);
						return;
					}
					Static51.anInt1263++;
				} else if (Static124.method1828() - Static76.aLong81 > 30000L) {
					this.method551(-2);
					return;
				}
			}
			if (Static51.anInt1263 == 4) {
				Static178.method2910(Static31.anInt748 > 20, Static52.aClass57_3);
				Static51.anInt1263 = 0;
				Static144.anInt2888 = 0;
				Static68.aClass65_4 = null;
				Static52.aClass57_3 = null;
			}
		} catch (@Pc(182) IOException local182) {
			this.method551(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method545()) {
			return;
		}
		Static183.anInt3929 = Integer.parseInt(this.getParameter("worldid"));
		Static93.anInt1975 = Integer.parseInt(this.getParameter("modewhat"));
		Static86.anInt1862 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static36.method677();
		} else {
			Static109.method1643();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static181.aBoolean221 = true;
		} else {
			Static181.aBoolean221 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static162.method2553();
			Static93.anInt1976 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static63.anInt3580 = 1;
		} else {
			Static63.anInt3580 = 0;
		}
		try {
			Static179.anInt3907 = Integer.parseInt(this.getParameter("js"));
			Static40.anInt3561 = Integer.parseInt(this.getParameter("plug"));
			Static70.anInt1590 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static124.aClass92_1222 = Static36.aClass92_387.method3203(this);
		if (Static124.aClass92_1222 == null) {
			Static124.aClass92_1222 = Static26.aClass92_268;
		}
		Static109.aString5 = this.getCodeBase().getHost();
		this.method541(Static93.anInt1975 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method543() {
		Static160.anInt3336 = Static86.anInt1862 == 0 ? 43594 : Static183.anInt3929 + 40000;
		if (Static63.anInt3580 == 1) {
			Static195.aShortArrayArray6 = Static189.aShortArrayArray5;
			Static129.aShortArray26 = Static90.aShortArray13;
			Static90.aShortArray12 = Static150.aShortArray37;
			Static186.aShortArrayArray4 = Static108.aShortArrayArray1;
		} else {
			Static129.aShortArray26 = Static109.aShortArray19;
			Static186.aShortArrayArray4 = Static132.aShortArrayArray2;
			Static195.aShortArrayArray6 = Static145.aShortArrayArray3;
			Static90.aShortArray12 = Static62.aShortArray7;
		}
		Static23.anInt561 = Static160.anInt3336;
		Static200.anInt4360 = Static86.anInt1862 == 0 ? 443 : Static183.anInt3929 + 50000;
		Static193.method2266();
		Static117.method1730(Static119.aCanvas1);
		Static109.method1645(Static119.aCanvas1);
		Static136.aClass29_1 = Static58.method970();
		if (Static136.aClass29_1 != null) {
			Static136.aClass29_1.method2110(Static119.aCanvas1);
		}
		Static166.anInt3455 = Static30.anInt726;
		try {
			if (Static169.aClass24_4.aClass99_3 != null) {
				Static180.aClass96_47 = new Class96(Static169.aClass24_4.aClass99_3, 5200, 0);
				for (@Pc(86) int local86 = 0; local86 < 24; local86++) {
					Static66.aClass96Array1[local86] = new Class96(Static169.aClass24_4.aClass99Array1[local86], 6000, 0);
				}
				Static61.aClass96_16 = new Class96(Static169.aClass24_4.aClass99_2, 6000, 0);
				Static202.aClass83_4 = new Class83(255, Static180.aClass96_47, Static61.aClass96_16, 500000);
				Static63.aClass96_39 = new Class96(Static169.aClass24_4.aClass99_1, 24, 0);
				Static169.aClass24_4.aClass99_3 = null;
				Static169.aClass24_4.aClass99Array1 = null;
				Static169.aClass24_4.aClass99_2 = null;
				Static169.aClass24_4.aClass99_1 = null;
			}
		} catch (@Pc(144) IOException local144) {
			Static202.aClass83_4 = null;
			Static180.aClass96_47 = null;
			Static63.aClass96_39 = null;
			Static61.aClass96_16 = null;
		}
		if (Static86.anInt1862 != 0) {
			Static184.aBoolean225 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method540() {
		Static155.anInt2981++;
		if (Static155.anInt2981 % 1000 == 1) {
			@Pc(16) GregorianCalendar local16 = new GregorianCalendar();
			Static28.anInt647 = local16.get(11) * 600 + local16.get(12) * 10 + local16.get(13) / 6;
			Static144.aRandom1.setSeed((long) Static28.anInt647);
		}
		this.method552();
		Static94.method1368();
		Static43.method789();
		Static140.method2075();
		Static69.method1081();
		Static124.method1830();
		if (Static136.aClass29_1 != null) {
			@Pc(61) int local61 = Static136.aClass29_1.method2109();
			Static199.anInt4342 = local61;
		}
		if (Static31.anInt748 == 0) {
			this.method554();
			Static88.method1302();
		} else if (Static31.anInt748 == 5) {
			Static144.method2131(this);
			this.method554();
			Static88.method1302();
		} else if (Static31.anInt748 == 10) {
			Static144.method2131(this);
		} else if (Static31.anInt748 == 20) {
			Static144.method2131(this);
			Static153.method2349();
		} else if (Static31.anInt748 == 25) {
			Static58.method968();
		}
		if (Static31.anInt748 == 30) {
			Static53.method906();
		} else if (Static31.anInt748 == 40) {
			Static153.method2349();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method551(@OriginalArg(0) int arg0) {
		Static52.aClass57_3 = null;
		Static68.aClass65_4 = null;
		if (Static23.anInt561 == Static160.anInt3336) {
			Static23.anInt561 = Static200.anInt4360;
		} else {
			Static23.anInt561 = Static160.anInt3336;
		}
		Static51.anInt1263 = 0;
		Static144.anInt2888++;
		if (Static144.anInt2888 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static31.anInt748 <= 5) {
				this.method544("js5connect_full");
				Static31.anInt748 = 1000;
			} else {
				Static51.anInt1264 = 3000;
			}
		} else if (Static144.anInt2888 >= 2 && arg0 == 6) {
			this.method544("js5connect_outofdate");
			Static31.anInt748 = 1000;
		} else if (Static144.anInt2888 >= 4) {
			if (Static31.anInt748 > 5) {
				Static51.anInt1264 = 3000;
			} else {
				this.method544("js5connect");
				Static31.anInt748 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method552() {
		if (Static31.anInt748 != 1000) {
			@Pc(15) boolean local15 = Static108.method1635();
			if (!local15) {
				this.method550();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method539() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method554() {
		@Pc(14) int local14;
		if (Static195.anInt4218 == 0) {
			Static51.method882(Static156.anIntArrayArrayArray6);
			for (local14 = 0; local14 < 4; local14++) {
				Static98.aClass7Array1[local14] = new Class7(104, 104);
			}
			Static141.aClass1_Sub3_Sub1_Sub1_4 = new Class1_Sub3_Sub1_Sub1(512, 512);
			Static144.anInt2892 = 5;
			Static88.aClass92_804 = Static101.aClass92_975;
			Static195.anInt4218 = 20;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(63) int local63;
		if (Static195.anInt4218 == 20) {
			@Pc(47) int[] local47 = new int[9];
			for (local49 = 0; local49 < 9; local49++) {
				local59 = local49 * 32 + 15 + 128;
				local63 = Class1_Sub3_Sub1_Sub4.anIntArray320[local59];
				local69 = local59 * 3 + 600;
				local47[local49] = local63 * local69 >> 16;
			}
			Static95.method1386(local47);
			Static144.anInt2892 = 10;
			Static88.aClass92_804 = Static148.aClass92_1448;
			Static195.anInt4218 = 30;
		} else if (Static195.anInt4218 == 30) {
			Static76.aClass3_Sub1_9 = Static176.method2881(0, true, true, false);
			Static88.aClass3_Sub1_11 = Static176.method2881(1, true, true, false);
			Static107.aClass3_Sub1_16 = Static176.method2881(2, true, false, true);
			Static105.aClass3_Sub1_14 = Static176.method2881(3, true, true, false);
			Static140.aClass3_Sub1_20 = Static176.method2881(4, true, true, false);
			Static99.aClass3_Sub1_24 = Static176.method2881(5, true, true, true);
			Static166.aClass3_Sub1_23 = Static176.method2881(6, false, true, true);
			Static106.aClass3_Sub1_15 = Static176.method2881(7, true, true, false);
			Static71.aClass3_Sub1_8 = Static176.method2881(8, true, true, false);
			Static119.aClass3_Sub1_19 = Static176.method2881(9, true, false, true);
			Static109.aClass3_Sub1_17 = Static176.method2881(10, true, true, false);
			Static79.aClass3_Sub1_10 = Static176.method2881(11, true, true, false);
			Static39.aClass3_Sub1_5 = Static176.method2881(12, true, true, false);
			Static7.aClass3_Sub1_3 = Static176.method2881(13, true, false, true);
			Static119.aClass3_Sub1_18 = Static176.method2881(14, false, true, false);
			Static207.aClass3_Sub1_28 = Static176.method2881(15, true, true, false);
			Static146.aClass3_Sub1_21 = Static176.method2881(16, true, true, false);
			Static104.aClass3_Sub1_13 = Static176.method2881(17, true, true, false);
			Static3.aClass3_Sub1_27 = Static176.method2881(18, true, true, false);
			Static189.aClass3_Sub1_26 = Static176.method2881(19, true, true, false);
			Static36.aClass3_Sub1_4 = Static176.method2881(20, true, true, false);
			Static66.aClass3_Sub1_7 = Static176.method2881(21, true, true, false);
			Static49.aClass3_Sub1_6 = Static176.method2881(22, true, true, false);
			Static5.aClass3_Sub1_2 = Static176.method2881(23, true, true, true);
			Static88.aClass92_804 = Static91.aClass92_860;
			Static195.anInt4218 = 40;
			Static144.anInt2892 = 20;
		} else if (Static195.anInt4218 == 40) {
			local14 = Static76.aClass3_Sub1_9.method3279() * 4 / 100;
			local14 += Static88.aClass3_Sub1_11.method3279() * 4 / 100;
			local14 += Static107.aClass3_Sub1_16.method3279() / 100;
			local14 += Static105.aClass3_Sub1_14.method3279() * 2 / 100;
			local14 += Static140.aClass3_Sub1_20.method3279() * 6 / 100;
			local14 += Static99.aClass3_Sub1_24.method3279() * 4 / 100;
			local14 += Static166.aClass3_Sub1_23.method3279() * 2 / 100;
			local14 += Static106.aClass3_Sub1_15.method3279() * 53 / 100;
			local14 += Static71.aClass3_Sub1_8.method3279() * 2 / 100;
			local14 += Static119.aClass3_Sub1_19.method3279() * 2 / 100;
			local14 += Static109.aClass3_Sub1_17.method3279() * 2 / 100;
			local14 += Static79.aClass3_Sub1_10.method3279() * 2 / 100;
			local14 += Static39.aClass3_Sub1_5.method3279() * 2 / 100;
			local14 += Static7.aClass3_Sub1_3.method3279() * 2 / 100;
			local14 += Static119.aClass3_Sub1_18.method3279() * 2 / 100;
			local14 += Static207.aClass3_Sub1_28.method3279() * 2 / 100;
			local14 += Static146.aClass3_Sub1_21.method3279() / 100;
			local14 += Static104.aClass3_Sub1_13.method3279() / 100;
			local14 += Static3.aClass3_Sub1_27.method3279() / 100;
			local14 += Static189.aClass3_Sub1_26.method3279() / 100;
			local14 += Static36.aClass3_Sub1_4.method3279() / 100;
			local14 += Static66.aClass3_Sub1_7.method3279() / 100;
			local14 += Static49.aClass3_Sub1_6.method3279() / 100;
			local14 += Static5.aClass3_Sub1_2.method3279() / 100;
			if (local14 == 100) {
				Static88.aClass92_804 = Static1.aClass92_33;
				Static144.anInt2892 = 30;
				Static39.method725(Static71.aClass3_Sub1_8, Static166.aClass3_Sub1_23, Static109.aClass3_Sub1_17);
				Static195.anInt4218 = 45;
			} else {
				if (local14 != 0) {
					Static88.aClass92_804 = Static208.method787(new Class92[] { Static110.aClass92_1065, Static49.method872(local14), Static41.aClass92_425 });
				}
				Static144.anInt2892 = 30;
			}
		} else if (Static195.anInt4218 == 45) {
			Static94.method1367(!Static111.aBoolean141);
			@Pc(582) Class1_Sub12_Sub3 local582 = new Class1_Sub12_Sub3();
			local582.method2244();
			Static65.aClass15_2 = Static103.method1561(0, 22050, Static169.aClass24_4, Static119.aCanvas1);
			Static65.aClass15_2.method2622(local582);
			Static96.method1392(Static140.aClass3_Sub1_20, Static119.aClass3_Sub1_18, Static207.aClass3_Sub1_28, local582);
			Static42.aClass15_3 = Static103.method1561(1, 2048, Static169.aClass24_4, Static119.aCanvas1);
			Static16.aClass1_Sub12_Sub2_2 = new Class1_Sub12_Sub2();
			Static42.aClass15_3.method2622(Static16.aClass1_Sub12_Sub2_2);
			Static163.aClass18_3 = new Class18(22050, Static96.anInt2009);
			Static144.anInt2892 = 35;
			Static88.aClass92_804 = Static20.aClass92_216;
			Static195.anInt4218 = 50;
		} else if (Static195.anInt4218 == 50) {
			local14 = 0;
			if (Static201.aClass1_Sub3_Sub1_Sub3_Sub1_5 == null) {
				Static201.aClass1_Sub3_Sub1_Sub3_Sub1_5 = Static136.method2028(Static41.aClass92_419, Static26.aClass92_268, Static7.aClass3_Sub1_3, Static71.aClass3_Sub1_8);
			} else {
				local14++;
			}
			if (Static143.aClass1_Sub3_Sub1_Sub3_Sub1_4 == null) {
				Static143.aClass1_Sub3_Sub1_Sub3_Sub1_4 = Static201.aClass1_Sub3_Sub1_Sub3_Sub1_5;
			} else {
				local14++;
			}
			if (Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2 == null) {
				Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2 = Static136.method2028(Static107.aClass92_1032, Static26.aClass92_268, Static7.aClass3_Sub1_3, Static71.aClass3_Sub1_8);
			} else {
				local14++;
			}
			if (Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3 == null) {
				Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3 = Static136.method2028(Static194.aClass92_1976, Static26.aClass92_268, Static7.aClass3_Sub1_3, Static71.aClass3_Sub1_8);
			} else {
				local14++;
			}
			if (local14 < 4) {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static147.aClass92_1437, Static49.method872(local14 * 100 / 4), Static41.aClass92_425 });
				Static144.anInt2892 = 40;
			} else {
				Static195.anInt4218 = 60;
				Static144.anInt2892 = 40;
				Static88.aClass92_804 = Static66.aClass92_620;
			}
		} else if (Static195.anInt4218 == 60) {
			local14 = Static21.method437(Static71.aClass3_Sub1_8, Static109.aClass3_Sub1_17);
			local49 = Static166.method2604();
			if (local14 < local49) {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static172.aClass92_1739, Static49.method872(local14 * 100 / local49), Static41.aClass92_425 });
				Static144.anInt2892 = 50;
			} else {
				Static144.anInt2892 = 50;
				Static195.anInt4218 = 65;
				Static88.aClass92_804 = Static188.aClass92_2037;
			}
		} else if (Static195.anInt4218 == 65) {
			Static144.anInt2892 = 50;
			Static88.aClass92_804 = Static153.aClass92_1510;
			Static48.method862(5);
			Static195.anInt4218 = 70;
		} else if (Static195.anInt4218 == 70) {
			Static107.aClass3_Sub1_16.method3249();
			local14 = Static107.aClass3_Sub1_16.method3251();
			Static146.aClass3_Sub1_21.method3249();
			local14 += Static146.aClass3_Sub1_21.method3251();
			Static104.aClass3_Sub1_13.method3249();
			local14 += Static104.aClass3_Sub1_13.method3251();
			Static3.aClass3_Sub1_27.method3249();
			local14 += Static3.aClass3_Sub1_27.method3251();
			Static189.aClass3_Sub1_26.method3249();
			local14 += Static189.aClass3_Sub1_26.method3251();
			Static36.aClass3_Sub1_4.method3249();
			local14 += Static36.aClass3_Sub1_4.method3251();
			Static66.aClass3_Sub1_7.method3249();
			local14 += Static66.aClass3_Sub1_7.method3251();
			Static49.aClass3_Sub1_6.method3249();
			local14 += Static49.aClass3_Sub1_6.method3251();
			if (local14 < 800) {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static88.aClass92_806, Static49.method872(local14 / 8), Static41.aClass92_425 });
				Static144.anInt2892 = 60;
			} else {
				Static152.method2321(Static107.aClass3_Sub1_16);
				Static195.method3191(Static107.aClass3_Sub1_16);
				Static76.method1144(Static106.aClass3_Sub1_15, Static107.aClass3_Sub1_16);
				Static105.method1585(Static106.aClass3_Sub1_15, Static111.aBoolean141, Static146.aClass3_Sub1_21);
				Static201.method3330(Static3.aClass3_Sub1_27, Static106.aClass3_Sub1_15);
				Static60.method995(Static106.aClass3_Sub1_15, Static181.aBoolean221, Static189.aClass3_Sub1_26, Static143.aClass1_Sub3_Sub1_Sub3_Sub1_4);
				Static132.method1969(Static88.aClass3_Sub1_11, Static36.aClass3_Sub1_4, Static76.aClass3_Sub1_9);
				Static91.method1357(Static66.aClass3_Sub1_7, Static106.aClass3_Sub1_15);
				Static42.method734(Static49.aClass3_Sub1_6);
				Static169.method2640(Static107.aClass3_Sub1_16);
				Static97.method1412(Static105.aClass3_Sub1_14, Static106.aClass3_Sub1_15, Static7.aClass3_Sub1_3, Static71.aClass3_Sub1_8);
				Static10.method189(Static107.aClass3_Sub1_16);
				Static49.method874(Static104.aClass3_Sub1_13);
				Static209.method3401(Static107.aClass3_Sub1_16);
				Static82.method1263(Static107.aClass3_Sub1_16);
				Static144.anInt2892 = 60;
				Static88.aClass92_804 = Static8.aClass92_75;
				Static118.method1734();
				Static195.anInt4218 = 80;
			}
		} else if (Static195.anInt4218 == 80) {
			local14 = 0;
			if (Static25.aClass1_Sub3_Sub1_Sub1_1 == null) {
				Static25.aClass1_Sub3_Sub1_Sub1_1 = Static18.method402(Static71.aClass3_Sub1_8, Static26.aClass92_268, Static204.aClass92_1073);
			} else {
				local14++;
			}
			if (Static18.aClass1_Sub3_Sub1_Sub5Array1 == null) {
				Static18.aClass1_Sub3_Sub1_Sub5Array1 = Static191.method3131(Static71.aClass3_Sub1_8, Static109.aClass92_1056, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static52.aClass1_Sub3_Sub1_Sub1Array12 == null) {
				Static52.aClass1_Sub3_Sub1_Sub1Array12 = Static109.method1644(Static75.aClass92_698, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static22.aClass1_Sub3_Sub1_Sub1Array4 == null) {
				Static22.aClass1_Sub3_Sub1_Sub1Array4 = Static52.aClass1_Sub3_Sub1_Sub1Array12;
			} else {
				local14++;
			}
			if (Static160.aClass1_Sub3_Sub1_Sub1Array19 == null) {
				Static160.aClass1_Sub3_Sub1_Sub1Array19 = Static109.method1644(Static204.aClass92_1072, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static138.aClass1_Sub3_Sub1_Sub1Array17 == null) {
				Static138.aClass1_Sub3_Sub1_Sub1Array17 = Static109.method1644(Static105.aClass92_1019, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static25.aClass1_Sub3_Sub1_Sub1Array5 == null) {
				Static25.aClass1_Sub3_Sub1_Sub1Array5 = Static109.method1644(Static153.aClass92_1511, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static82.aClass1_Sub3_Sub1_Sub1Array13 == null) {
				Static82.aClass1_Sub3_Sub1_Sub1Array13 = Static109.method1644(Static93.aClass92_872, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static28.aClass1_Sub3_Sub1_Sub1Array6 == null) {
				Static28.aClass1_Sub3_Sub1_Sub1Array6 = Static109.method1644(Static43.aClass92_460, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static138.aClass1_Sub3_Sub1_Sub1Array18 == null) {
				Static138.aClass1_Sub3_Sub1_Sub1Array18 = Static109.method1644(Static191.aClass92_1956, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static176.aClass1_Sub3_Sub1_Sub1_6 == null) {
				Static176.aClass1_Sub3_Sub1_Sub1_6 = Static18.method402(Static71.aClass3_Sub1_8, Static26.aClass92_268, Static93.aClass92_869);
			} else {
				local14++;
			}
			if (Static40.aClass1_Sub3_Sub1_Sub1Array20 == null) {
				Static40.aClass1_Sub3_Sub1_Sub1Array20 = Static109.method1644(Static186.aClass92_1901, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static209.aClass1_Sub3_Sub1_Sub1Array21 == null) {
				Static209.aClass1_Sub3_Sub1_Sub1Array21 = Static109.method1644(Static12.aClass92_120, Static71.aClass3_Sub1_8, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static56.aClass1_Sub3_Sub1_Sub5Array3 == null) {
				Static56.aClass1_Sub3_Sub1_Sub5Array3 = Static191.method3131(Static71.aClass3_Sub1_8, Static100.aClass92_950, Static26.aClass92_268);
			} else {
				local14++;
			}
			if (Static21.aClass1_Sub3_Sub1_Sub5Array2 == null) {
				Static21.aClass1_Sub3_Sub1_Sub5Array2 = Static191.method3131(Static71.aClass3_Sub1_8, Static76.aClass92_701, Static26.aClass92_268);
			} else {
				local14++;
			}
			local14++;
			if (local14 < 16) {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static12.aClass92_118, Static49.method872(local14 * 100 / 16), Static41.aClass92_425 });
				Static144.anInt2892 = 70;
			} else {
				Static201.aClass1_Sub3_Sub1_Sub3_Sub1_5.method2456(Static21.aClass1_Sub3_Sub1_Sub5Array2, null);
				Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2456(Static21.aClass1_Sub3_Sub1_Sub5Array2, null);
				Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2456(Static21.aClass1_Sub3_Sub1_Sub5Array2, null);
				if (Static143.aClass1_Sub3_Sub1_Sub3_Sub1_4 != Static201.aClass1_Sub3_Sub1_Sub3_Sub1_5) {
					Static143.aClass1_Sub3_Sub1_Sub3_Sub1_4.method2456(Static21.aClass1_Sub3_Sub1_Sub5Array2, null);
				}
				for (local49 = 0; local49 < Static138.aClass1_Sub3_Sub1_Sub1Array18.length; local49++) {
					Static138.aClass1_Sub3_Sub1_Sub1Array18[local49].method357();
				}
				Static25.aClass1_Sub3_Sub1_Sub1_1.method357();
				local59 = (int) (Math.random() * 21.0D) - 10;
				local69 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1235) int local1235 = (int) (Math.random() * 41.0D) - 20;
				local63 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1244) int local1244 = 0; local1244 < Static52.aClass1_Sub3_Sub1_Sub1Array12.length; local1244++) {
					Static52.aClass1_Sub3_Sub1_Sub1Array12[local1244].method374(local59 + local1235, local1235 + local69, local63 + local1235);
				}
				Static18.aClass1_Sub3_Sub1_Sub5Array1[0].method3178(local59 + local1235, local69 - -local1235, local63 + local1235);
				Static88.aClass92_804 = Static202.aClass92_2015;
				Static195.anInt4218 = 90;
				Static144.anInt2892 = 70;
			}
		} else if (Static195.anInt4218 == 90) {
			if (Static119.aClass3_Sub1_19.method3249()) {
				@Pc(1333) Class82 local1333 = new Class82(Static119.aClass3_Sub1_19, Static71.aClass3_Sub1_8, 20, Static111.aBoolean141 ? 64 : 128);
				Static174.method2845(local1333);
				Static174.method2850(0.7F);
				Static144.anInt2892 = 90;
				Static195.anInt4218 = 110;
				Static88.aClass92_804 = Static25.aClass92_259;
			} else {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static192.aClass92_1957, Static49.method872(Static119.aClass3_Sub1_19.method3251()), Static41.aClass92_425 });
				Static144.anInt2892 = 90;
			}
		} else if (Static195.anInt4218 == 110) {
			Static165.aClass51_1 = new Class51();
			Static169.aClass24_4.method560(Static165.aClass51_1, 10);
			Static195.anInt4218 = 120;
			Static88.aClass92_804 = Static190.aClass92_1937;
			Static144.anInt2892 = 94;
		} else if (Static195.anInt4218 == 120) {
			if (Static109.aClass3_Sub1_17.method3272(Static118.aClass92_1164, Static26.aClass92_268)) {
				@Pc(1402) Class50 local1402 = new Class50(Static109.aClass3_Sub1_17.method3252(Static26.aClass92_268, Static118.aClass92_1164));
				Static165.method2582(local1402);
				Static88.aClass92_804 = Static101.aClass92_966;
				Static144.anInt2892 = 96;
				Static195.anInt4218 = 130;
			} else {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static41.aClass92_421, Static22.aClass92_233 });
				Static144.anInt2892 = 96;
			}
		} else if (Static195.anInt4218 == 130) {
			if (!Static105.aClass3_Sub1_14.method3249()) {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static45.aClass92_486, Static49.method872(Static105.aClass3_Sub1_14.method3251() * 4 / 5), Static41.aClass92_425 });
				Static144.anInt2892 = 100;
			} else if (!Static39.aClass3_Sub1_5.method3249()) {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static45.aClass92_486, Static49.method872(Static39.aClass3_Sub1_5.method3251() / 6 + 80), Static41.aClass92_425 });
				Static144.anInt2892 = 100;
			} else if (Static7.aClass3_Sub1_3.method3249()) {
				Static88.aClass92_804 = Static25.aClass92_260;
				Static144.anInt2892 = 100;
				Static195.anInt4218 = 140;
			} else {
				Static88.aClass92_804 = Static208.method787(new Class92[] { Static45.aClass92_486, Static49.method872(Static7.aClass3_Sub1_3.method3251() / 20 + 96), Static41.aClass92_425 });
				Static144.anInt2892 = 100;
			}
		} else if (Static195.anInt4218 == 140) {
			Static99.aClass3_Sub1_24.method3276(false);
			Static166.aClass3_Sub1_23.method3276(true);
			Static71.aClass3_Sub1_8.method3276(true);
			Static7.aClass3_Sub1_3.method3276(true);
			Static109.aClass3_Sub1_17.method3276(true);
			Static48.method862(10);
		}
	}
}
