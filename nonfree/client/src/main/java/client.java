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
				Static104.method1934();
			}
			Static13.anInt910 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static99.anInt2495 = 0;
			} else if (arg0[1].equals("office")) {
				Static99.anInt2495 = 1;
			} else if (arg0[1].equals("local")) {
				Static99.anInt2495 = 2;
			} else {
				Static104.method1934();
			}
			if (arg0[2].equals("live")) {
				Static125.anInt3092 = 0;
			} else if (arg0[2].equals("rc")) {
				Static125.anInt3092 = 1;
			} else if (arg0[2].equals("wip")) {
				Static125.anInt3092 = 2;
			} else {
				Static104.method1934();
			}
			if (arg0[3].equals("lowmem")) {
				Static1.method3314();
			} else if (arg0[3].equals("highmem")) {
				Static24.method447();
			} else {
				Static104.method1934();
			}
			if (arg0[4].equals("free")) {
				Static15.aBoolean19 = false;
			} else if (arg0[4].equals("members")) {
				Static15.aBoolean19 = true;
			} else {
				Static104.method1934();
			}
			if (arg0[5].equals("english")) {
				Static107.anInt2630 = 0;
			} else if (arg0[5].equals("german")) {
				Static178.method3027();
				Static107.anInt2630 = 1;
			} else {
				Static104.method1934();
			}
			if (arg0[6].equals("game0")) {
				Static64.anInt1666 = 0;
			} else if (arg0[6].equals("game1")) {
				Static64.anInt1666 = 1;
			} else {
				Static104.method1934();
			}
			Static167.aString5 = "127.0.0.1";
			Static154.anInt3548 = 0;
			Static188.aClass65_2456 = Static117.aClass65_1665;
			@Pc(182) client local182 = new client();
			local182.method582(Static125.anInt3092 + 32, "runescape");
			Static165.aFrame1.setLocation(40, 40);
		} catch (@Pc(199) Exception local199) {
			Static107.method1977(local199, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method601(@OriginalArg(0) int arg0) {
		Static93.aClass34_6 = null;
		if (Static180.anInt3910 == Static33.anInt969) {
			Static33.anInt969 = Static177.anInt3987;
		} else {
			Static33.anInt969 = Static180.anInt3910;
		}
		Static29.anInt857 = 0;
		Static150.anInt3512++;
		Static205.aClass23_5 = null;
		if (Static150.anInt3512 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static174.anInt3884 > 5) {
				Static107.anInt2621 = 3000;
			} else {
				this.method585("js5connect_full");
				Static174.anInt3884 = 1000;
			}
		} else if (Static150.anInt3512 >= 2 && arg0 == 6) {
			this.method585("js5connect_outofdate");
			Static174.anInt3884 = 1000;
		} else if (Static150.anInt3512 >= 4) {
			if (Static174.anInt3884 > 5) {
				Static107.anInt2621 = 3000;
			} else {
				this.method585("js5connect");
				Static174.anInt3884 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method602() {
		if (Static64.anInt1662 >= 4) {
			this.method585("js5crc");
			Static174.anInt3884 = 1000;
			return;
		}
		if (Static188.anInt4139 >= 4) {
			if (Static174.anInt3884 <= 5) {
				this.method585("js5io");
				Static174.anInt3884 = 1000;
				return;
			}
			Static188.anInt4139 = 3;
			Static107.anInt2621 = 3000;
		}
		if (Static107.anInt2621-- > 0) {
			return;
		}
		try {
			if (Static29.anInt857 == 0) {
				Static93.aClass34_6 = Static153.aClass14_3.method620(Static33.anInt969, Static167.aString5);
				Static29.anInt857++;
			}
			if (Static29.anInt857 == 1) {
				if (Static93.aClass34_6.anInt1727 == 2) {
					this.method601(-1);
					return;
				}
				if (Static93.aClass34_6.anInt1727 == 1) {
					Static29.anInt857++;
				}
			}
			if (Static29.anInt857 == 2) {
				Static205.aClass23_5 = new Class23((Socket) Static93.aClass34_6.anObject1, Static153.aClass14_3);
				@Pc(106) Class1_Sub14 local106 = new Class1_Sub14(5);
				local106.method1710(15);
				local106.method1724(493);
				Static205.aClass23_5.method726(5, local106.aByteArray29);
				Static29.anInt857++;
				Static73.aLong58 = Static190.method3141();
			}
			if (Static29.anInt857 == 3) {
				if (Static174.anInt3884 <= 5 || Static205.aClass23_5.method732() > 0) {
					@Pc(159) int local159 = Static205.aClass23_5.method734();
					if (local159 != 0) {
						this.method601(local159);
						return;
					}
					Static29.anInt857++;
				} else if (Static190.method3141() - Static73.aLong58 > 30000L) {
					this.method601(-2);
					return;
				}
			}
			if (Static29.anInt857 == 4) {
				Static71.method1212(Static174.anInt3884 > 20, Static205.aClass23_5);
				Static205.aClass23_5 = null;
				Static29.anInt857 = 0;
				Static93.aClass34_6 = null;
				Static150.anInt3512 = 0;
			}
		} catch (@Pc(199) IOException local199) {
			this.method601(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method586() {
		Static180.anInt3910 = Static99.anInt2495 == 0 ? 43594 : Static13.anInt910 + 40000;
		Static177.anInt3987 = Static99.anInt2495 == 0 ? 443 : Static13.anInt910 + 50000;
		if (Static64.anInt1666 == 1) {
			Static26.aShortArrayArray1 = Static111.aShortArrayArray2;
			Static24.aShortArray17 = Static174.aShortArray53;
			Static125.aShortArray49 = Static108.aShortArray46;
			Static168.aShortArrayArray5 = Static162.aShortArrayArray6;
		} else {
			Static26.aShortArrayArray1 = Static197.aShortArrayArray7;
			Static125.aShortArray49 = Static30.aShortArray19;
			Static168.aShortArrayArray5 = Static119.aShortArrayArray3;
			Static24.aShortArray17 = Static29.aShortArray18;
		}
		Static33.anInt969 = Static180.anInt3910;
		Static33.method642();
		Static36.method671(Static36.aCanvas1);
		Static163.method2806(Static36.aCanvas1);
		Static88.aClass25_1 = Static72.method1240();
		if (Static88.aClass25_1 != null) {
			Static88.aClass25_1.method2785(Static36.aCanvas1);
		}
		Static145.anInt3448 = Static32.anInt944;
		try {
			if (Static153.aClass14_3.aClass83_2 != null) {
				Static205.aClass72_5 = new Class72(Static153.aClass14_3.aClass83_2, 5200, 0);
				for (@Pc(88) int local88 = 0; local88 < 24; local88++) {
					Static71.aClass72Array1[local88] = new Class72(Static153.aClass14_3.aClass83Array1[local88], 6000, 0);
				}
				Static46.aClass72_2 = new Class72(Static153.aClass14_3.aClass83_1, 6000, 0);
				Static145.aClass32_3 = new Class32(255, Static205.aClass72_5, Static46.aClass72_2, 500000);
				Static39.aClass72_1 = new Class72(Static153.aClass14_3.aClass83_3, 24, 0);
				Static153.aClass14_3.aClass83_3 = null;
				Static153.aClass14_3.aClass83_1 = null;
				Static153.aClass14_3.aClass83_2 = null;
				Static153.aClass14_3.aClass83Array1 = null;
			}
		} catch (@Pc(146) IOException local146) {
			Static39.aClass72_1 = null;
			Static145.aClass32_3 = null;
			Static205.aClass72_5 = null;
			Static46.aClass72_2 = null;
		}
		if (Static99.anInt2495 != 0) {
			Static172.aBoolean154 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method590() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method587() {
		if (Static36.aClass64_1 != null) {
			Static36.aClass64_1.aBoolean130 = false;
		}
		Static36.aClass64_1 = null;
		if (Static123.aClass23_4 != null) {
			Static123.aClass23_4.method731();
			Static123.aClass23_4 = null;
		}
		Static88.method1494(Static36.aCanvas1);
		Static26.method473(Static36.aCanvas1);
		if (Static88.aClass25_1 != null) {
			Static88.aClass25_1.method2787(Static36.aCanvas1);
		}
		Static40.method696();
		Static131.method2504();
		Static88.aClass25_1 = null;
		if (Static58.aClass4_1 != null) {
			Static58.aClass4_1.method2780();
		}
		if (Static118.aClass4_2 != null) {
			Static118.aClass4_2.method2780();
		}
		Static45.method756();
		Static46.method788();
		try {
			if (Static205.aClass72_5 != null) {
				Static205.aClass72_5.method2634();
			}
			if (Static71.aClass72Array1 != null) {
				for (@Pc(68) int local68 = 0; local68 < Static71.aClass72Array1.length; local68++) {
					if (Static71.aClass72Array1[local68] != null) {
						Static71.aClass72Array1[local68].method2634();
					}
				}
			}
			if (Static46.aClass72_2 != null) {
				Static46.aClass72_2.method2634();
			}
			if (Static39.aClass72_1 != null) {
				Static39.aClass72_1.method2634();
			}
		} catch (@Pc(96) IOException local96) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method599() {
		@Pc(4) boolean local4 = Static210.method3319();
		if (local4 && Static128.aBoolean132 && Static58.aClass4_1 != null) {
			Static58.aClass4_1.method2772();
		}
		@Pc(19) boolean local19 = false;
		if (Static174.aBoolean157) {
			local19 = true;
			Static174.aBoolean157 = false;
		}
		if (Static174.anInt3884 == 0) {
			Static35.method670(local19, Static139.aClass65_1956, null, Static107.anInt2627);
		} else if (Static174.anInt3884 == 5 || Static174.anInt3884 == 10 || Static174.anInt3884 == 20) {
			Static137.method2583(Static126.aClass1_Sub2_Sub5_Sub4_Sub1_4, Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1);
		} else if (Static174.anInt3884 == 25) {
			@Pc(109) int local109;
			if (Static80.anInt1965 == 1) {
				if (Static207.anInt4415 < Static182.anInt4064) {
					Static207.anInt4415 = Static182.anInt4064;
				}
				local109 = (Static207.anInt4415 - Static182.anInt4064) * 50 / Static207.anInt4415;
				Static168.method2339(Static109.method2004(new Class65[] { Static166.aClass65_2238, Static208.aClass65_2350, Static118.method2250(local109), Static65.aClass65_1008 }), false);
			} else if (Static80.anInt1965 == 2) {
				if (Static79.anInt1933 > Static160.anInt2787) {
					Static160.anInt2787 = Static79.anInt1933;
				}
				local109 = (Static160.anInt2787 - Static79.anInt1933) * 50 / Static160.anInt2787 + 50;
				Static168.method2339(Static109.method2004(new Class65[] { Static166.aClass65_2238, Static208.aClass65_2350, Static118.method2250(local109), Static65.aClass65_1008 }), false);
			} else {
				Static168.method2339(Static166.aClass65_2238, false);
			}
		} else if (Static174.anInt3884 == 30) {
			Static46.method785();
		} else if (Static174.anInt3884 == 40) {
			Static168.method2339(Static109.method2004(new Class65[] { Static102.aClass65_1510, Static5.aClass65_58, Static98.aClass65_1473 }), false);
		}
		@Pc(192) Canvas local192 = Static36.aCanvas1;
		@Pc(206) Graphics local206;
		@Pc(214) int local214;
		if (Static174.anInt3884 == 30 && Static148.anInt3489 == 0 && !local19) {
			try {
				local206 = local192.getGraphics();
				for (local214 = 0; local214 < Static126.anInt3109; local214++) {
					if (Static57.aBooleanArray8[local214]) {
						Static188.aClass37_1.method1452(Static168.anIntArray351[local214], Static183.anIntArray449[local214], Static195.anIntArray481[local214], local206, Static105.anIntArray295[local214]);
						Static57.aBooleanArray8[local214] = false;
					}
				}
			} catch (@Pc(266) Exception local266) {
				local192.repaint();
			}
		} else if (Static174.anInt3884 > 0) {
			try {
				local206 = local192.getGraphics();
				Static188.aClass37_1.method1446(local206);
				for (local214 = 0; local214 < Static126.anInt3109; local214++) {
					Static57.aBooleanArray8[local214] = false;
				}
			} catch (@Pc(226) Exception local226) {
				local192.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method604() {
		if (Static174.anInt3884 != 1000) {
			@Pc(16) boolean local16 = Static126.method2391();
			if (!local16) {
				this.method602();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method583()) {
			return;
		}
		Static13.anInt910 = Integer.parseInt(this.getParameter("worldid"));
		Static125.anInt3092 = Integer.parseInt(this.getParameter("modewhat"));
		Static99.anInt2495 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static1.method3314();
		} else {
			Static24.method447();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static15.aBoolean19 = true;
		} else {
			Static15.aBoolean19 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static178.method3027();
			Static107.anInt2630 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static64.anInt1666 = 1;
		} else {
			Static64.anInt1666 = 0;
		}
		try {
			Static77.anInt1908 = Integer.parseInt(this.getParameter("js"));
			Static138.anInt3396 = Integer.parseInt(this.getParameter("plug"));
			Static154.anInt3548 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static188.aClass65_2456 = Static149.aClass65_2015.method2448(this);
		if (Static188.aClass65_2456 == null) {
			Static188.aClass65_2456 = Static117.aClass65_1665;
		}
		Static167.aString5 = this.getCodeBase().getHost();
		this.method597(Static125.anInt3092 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method588() {
		Static174.anInt3887++;
		if (Static174.anInt3887 % 1000 == 1) {
			@Pc(18) GregorianCalendar local18 = new GregorianCalendar();
			Static45.anInt1165 = local18.get(11) * 600 + local18.get(12) * 10 + local18.get(13) / 6;
			Static113.aRandom1.setSeed((long) Static45.anInt1165);
		}
		this.method604();
		Static184.method3065();
		Static154.method2693();
		Static16.method298();
		Static74.method1263();
		Static93.method1769();
		if (Static88.aClass25_1 != null) {
			@Pc(61) int local61 = Static88.aClass25_1.method2788();
			Static11.anInt261 = local61;
		}
		if (Static174.anInt3884 == 0) {
			this.method605();
			Static5.method67();
		} else if (Static174.anInt3884 == 5) {
			Static132.method2531(this);
			this.method605();
			Static5.method67();
		} else if (Static174.anInt3884 == 10) {
			Static132.method2531(this);
		} else if (Static174.anInt3884 == 20) {
			Static132.method2531(this);
			Static150.method2667();
		} else if (Static174.anInt3884 == 25) {
			Static45.method759();
		}
		if (Static174.anInt3884 == 30) {
			Static99.method1893();
		} else if (Static174.anInt3884 == 40) {
			Static150.method2667();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method605() {
		@Pc(17) int local17;
		if (Static41.anInt1097 == 0) {
			Static81.method1424(Static89.anIntArrayArrayArray3);
			for (local17 = 0; local17 < 4; local17++) {
				Static83.aClass57Array1[local17] = new Class57(104, 104);
			}
			Static189.aClass1_Sub2_Sub5_Sub3_8 = new Class1_Sub2_Sub5_Sub3(512, 512);
			Static41.anInt1097 = 20;
			Static107.anInt2627 = 5;
			Static139.aClass65_1956 = Static173.aClass65_2281;
			return;
		}
		@Pc(54) int local54;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static41.anInt1097 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local64 = local54 * 32 + 15 + 128;
				local71 = local64 * 3 + 600;
				local75 = Class1_Sub2_Sub5_Sub2.anIntArray138[local64];
				local52[local54] = local75 * local71 >> 16;
			}
			Static65.method1142(local52);
			Static107.anInt2627 = 10;
			Static41.anInt1097 = 30;
			Static139.aClass65_1956 = Static125.aClass65_1746;
		} else if (Static41.anInt1097 == 30) {
			Static134.aClass60_Sub1_124 = Static185.method3079(true, false, true, 0);
			Static201.aClass60_Sub1_149 = Static185.method3079(true, false, true, 1);
			Static154.aClass60_Sub1_133 = Static185.method3079(false, true, true, 2);
			Static157.aClass60_Sub1_165 = Static185.method3079(true, false, true, 3);
			Static52.aClass60_Sub1_55 = Static185.method3079(true, false, true, 4);
			Static121.aClass60_Sub1_115 = Static185.method3079(true, true, true, 5);
			Static16.aClass60_Sub1_15 = Static185.method3079(true, true, false, 6);
			Static155.aClass60_Sub1_135 = Static185.method3079(true, false, true, 7);
			Static143.aClass60_Sub1_64 = Static185.method3079(true, false, true, 8);
			Static33.aClass60_Sub1_34 = Static185.method3079(false, true, true, 9);
			Static22.aClass60_Sub1_20 = Static185.method3079(true, false, true, 10);
			Static90.aClass60_Sub1_168 = Static185.method3079(true, false, true, 11);
			Static195.aClass60_Sub1_160 = Static185.method3079(true, false, true, 12);
			Static33.aClass60_Sub1_35 = Static185.method3079(false, true, true, 13);
			Static174.aClass60_Sub1_148 = Static185.method3079(true, false, false, 14);
			Static45.aClass60_Sub1_45 = Static185.method3079(true, false, true, 15);
			Static143.aClass60_Sub1_65 = Static185.method3079(true, false, true, 16);
			Static79.aClass60_Sub1_80 = Static185.method3079(true, false, true, 17);
			Static209.aClass60_Sub1_167 = Static185.method3079(true, false, true, 18);
			Static79.aClass60_Sub1_81 = Static185.method3079(true, false, true, 19);
			Static52.aClass60_Sub1_56 = Static185.method3079(true, false, true, 20);
			Static34.aClass60_Sub1_38 = Static185.method3079(true, false, true, 21);
			Static37.aClass60_Sub1_39 = Static185.method3079(true, false, true, 22);
			Static54.aClass60_Sub1_137 = Static185.method3079(true, true, true, 23);
			Static41.anInt1097 = 40;
			Static139.aClass65_1956 = Static37.aClass65_660;
			Static107.anInt2627 = 20;
		} else if (Static41.anInt1097 == 40) {
			local17 = Static134.aClass60_Sub1_124.method2355() * 4 / 100;
			local17 += Static201.aClass60_Sub1_149.method2355() * 4 / 100;
			local17 += Static154.aClass60_Sub1_133.method2355() / 100;
			local17 += Static157.aClass60_Sub1_165.method2355() * 2 / 100;
			local17 += Static52.aClass60_Sub1_55.method2355() * 6 / 100;
			local17 += Static121.aClass60_Sub1_115.method2355() * 4 / 100;
			local17 += Static16.aClass60_Sub1_15.method2355() * 2 / 100;
			local17 += Static155.aClass60_Sub1_135.method2355() * 53 / 100;
			local17 += Static143.aClass60_Sub1_64.method2355() * 2 / 100;
			local17 += Static33.aClass60_Sub1_34.method2355() * 2 / 100;
			local17 += Static22.aClass60_Sub1_20.method2355() * 2 / 100;
			local17 += Static90.aClass60_Sub1_168.method2355() * 2 / 100;
			local17 += Static195.aClass60_Sub1_160.method2355() * 2 / 100;
			local17 += Static33.aClass60_Sub1_35.method2355() * 2 / 100;
			local17 += Static174.aClass60_Sub1_148.method2355() * 2 / 100;
			local17 += Static45.aClass60_Sub1_45.method2355() * 2 / 100;
			local17 += Static143.aClass60_Sub1_65.method2355() / 100;
			local17 += Static79.aClass60_Sub1_80.method2355() / 100;
			local17 += Static209.aClass60_Sub1_167.method2355() / 100;
			local17 += Static79.aClass60_Sub1_81.method2355() / 100;
			local17 += Static52.aClass60_Sub1_56.method2355() / 100;
			local17 += Static34.aClass60_Sub1_38.method2355() / 100;
			local17 += Static37.aClass60_Sub1_39.method2355() / 100;
			local17 += Static54.aClass60_Sub1_137.method2355() / 100;
			if (local17 == 100) {
				Static107.anInt2627 = 30;
				Static139.aClass65_1956 = Static146.aClass65_2000;
				Static13.method584(Static143.aClass60_Sub1_64, Static16.aClass60_Sub1_15, Static22.aClass60_Sub1_20);
				Static41.anInt1097 = 45;
			} else {
				if (local17 != 0) {
					Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static25.aClass65_538, Static118.method2250(local17), Static70.aClass65_1067 });
				}
				Static107.anInt2627 = 30;
			}
		} else if (Static41.anInt1097 == 45) {
			Static122.method2638(!Static13.aBoolean36);
			@Pc(587) Class1_Sub6_Sub2 local587 = new Class1_Sub6_Sub2();
			local587.method2052();
			Static58.aClass4_1 = Static37.method675(22050, 0, Static36.aCanvas1, Static153.aClass14_3);
			Static58.aClass4_1.method2781(local587);
			Static180.method2973(Static52.aClass60_Sub1_55, local587, Static174.aClass60_Sub1_148, Static45.aClass60_Sub1_45);
			Static118.aClass4_2 = Static37.method675(2048, 1, Static36.aCanvas1, Static153.aClass14_3);
			Static93.aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1();
			Static118.aClass4_2.method2781(Static93.aClass1_Sub6_Sub1_1);
			Static171.aClass43_1 = new Class43(22050, Static178.anInt4019);
			Static107.anInt2627 = 35;
			Static41.anInt1097 = 50;
			Static139.aClass65_1956 = Static188.aClass65_2457;
		} else if (Static41.anInt1097 == 50) {
			local17 = 0;
			if (Static126.aClass1_Sub2_Sub5_Sub4_Sub1_4 == null) {
				Static126.aClass1_Sub2_Sub5_Sub4_Sub1_4 = Static21.method401(Static117.aClass65_1665, Static33.aClass60_Sub1_35, Static75.aClass65_1131, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static38.aClass1_Sub2_Sub5_Sub4_Sub1_2 == null) {
				Static38.aClass1_Sub2_Sub5_Sub4_Sub1_2 = Static126.aClass1_Sub2_Sub5_Sub4_Sub1_4;
			} else {
				local17++;
			}
			if (Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5 == null) {
				Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5 = Static21.method401(Static117.aClass65_1665, Static33.aClass60_Sub1_35, Static201.aClass65_2375, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1 == null) {
				Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1 = Static21.method401(Static117.aClass65_1665, Static33.aClass60_Sub1_35, Static48.aClass65_783, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (local17 < 4) {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static158.aClass65_2104, Static118.method2250(local17 * 100 / 4), Static70.aClass65_1067 });
				Static107.anInt2627 = 40;
			} else {
				Static139.aClass65_1956 = Static105.aClass65_1534;
				Static41.anInt1097 = 60;
				Static107.anInt2627 = 40;
			}
		} else if (Static41.anInt1097 == 60) {
			local17 = Static196.method3209(Static22.aClass60_Sub1_20, Static143.aClass60_Sub1_64);
			local54 = Static83.method1444();
			if (local54 > local17) {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static42.aClass65_683, Static118.method2250(local17 * 100 / local54), Static70.aClass65_1067 });
				Static107.anInt2627 = 50;
			} else {
				Static139.aClass65_1956 = Static196.aClass65_2521;
				Static107.anInt2627 = 50;
				Static41.anInt1097 = 65;
			}
		} else if (Static41.anInt1097 == 65) {
			Static107.anInt2627 = 50;
			Static139.aClass65_1956 = Static39.aClass65_669;
			Static118.method2247(5);
			Static41.anInt1097 = 70;
		} else if (Static41.anInt1097 == 70) {
			Static154.aClass60_Sub1_133.method2338();
			local17 = Static154.aClass60_Sub1_133.method2319();
			Static143.aClass60_Sub1_65.method2338();
			local17 += Static143.aClass60_Sub1_65.method2319();
			Static79.aClass60_Sub1_80.method2338();
			local17 += Static79.aClass60_Sub1_80.method2319();
			Static209.aClass60_Sub1_167.method2338();
			local17 += Static209.aClass60_Sub1_167.method2319();
			Static79.aClass60_Sub1_81.method2338();
			local17 += Static79.aClass60_Sub1_81.method2319();
			Static52.aClass60_Sub1_56.method2338();
			local17 += Static52.aClass60_Sub1_56.method2319();
			Static34.aClass60_Sub1_38.method2338();
			local17 += Static34.aClass60_Sub1_38.method2319();
			Static37.aClass60_Sub1_39.method2338();
			local17 += Static37.aClass60_Sub1_39.method2319();
			if (local17 < 800) {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static183.aClass65_2322, Static118.method2250(local17 / 8), Static70.aClass65_1067 });
				Static107.anInt2627 = 60;
			} else {
				Static20.method388(Static154.aClass60_Sub1_133);
				Static108.method1978(Static154.aClass60_Sub1_133);
				Static107.method1974(Static155.aClass60_Sub1_135, Static154.aClass60_Sub1_133);
				Static7.method127(Static155.aClass60_Sub1_135, Static13.aBoolean36, Static143.aClass60_Sub1_65);
				Static137.method2588(Static155.aClass60_Sub1_135, Static209.aClass60_Sub1_167);
				Static19.method381(Static155.aClass60_Sub1_135, Static15.aBoolean19, Static38.aClass1_Sub2_Sub5_Sub4_Sub1_2, Static79.aClass60_Sub1_81);
				Static38.method680(Static201.aClass60_Sub1_149, Static52.aClass60_Sub1_56, Static134.aClass60_Sub1_124);
				Static139.method2609(Static34.aClass60_Sub1_38, Static155.aClass60_Sub1_135);
				Static16.method297(Static37.aClass60_Sub1_39);
				Static156.method2721(Static154.aClass60_Sub1_133);
				Static144.method2782(Static157.aClass60_Sub1_165, Static143.aClass60_Sub1_64, Static155.aClass60_Sub1_135, Static33.aClass60_Sub1_35);
				Static58.method1049(Static154.aClass60_Sub1_133);
				Static119.method2258(Static79.aClass60_Sub1_80);
				Static22.method404(Static154.aClass60_Sub1_133);
				Static34.method659(Static154.aClass60_Sub1_133);
				Static139.aClass65_1956 = Static51.aClass65_851;
				Static107.anInt2627 = 60;
				Static44.method730();
				Static41.anInt1097 = 80;
			}
		} else if (Static41.anInt1097 == 80) {
			local17 = 0;
			if (Static8.aClass1_Sub2_Sub5_Sub3_1 == null) {
				Static8.aClass1_Sub2_Sub5_Sub3_1 = Static174.method2964(Static143.aClass60_Sub1_64, Static92.aClass65_1340, Static117.aClass65_1665);
			} else {
				local17++;
			}
			if (Static107.aClass1_Sub2_Sub5_Sub1Array9 == null) {
				Static107.aClass1_Sub2_Sub5_Sub1Array9 = Static83.method1443(Static117.aClass65_1665, Static192.aClass65_2477, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static28.aClass1_Sub2_Sub5_Sub3Array1 == null) {
				Static28.aClass1_Sub2_Sub5_Sub3Array1 = Static204.method3262(Static117.aClass65_1665, Static62.aClass65_973, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static168.aClass1_Sub2_Sub5_Sub3Array9 == null) {
				Static168.aClass1_Sub2_Sub5_Sub3Array9 = Static28.aClass1_Sub2_Sub5_Sub3Array1;
			} else {
				local17++;
			}
			if (Static96.aClass1_Sub2_Sub5_Sub3Array3 == null) {
				Static96.aClass1_Sub2_Sub5_Sub3Array3 = Static204.method3262(Static117.aClass65_1665, Static129.aClass65_1804, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static114.aClass1_Sub2_Sub5_Sub3Array5 == null) {
				Static114.aClass1_Sub2_Sub5_Sub3Array5 = Static204.method3262(Static117.aClass65_1665, Static27.aClass65_571, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static168.aClass1_Sub2_Sub5_Sub3Array8 == null) {
				Static168.aClass1_Sub2_Sub5_Sub3Array8 = Static204.method3262(Static117.aClass65_1665, Static176.aClass65_2325, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static136.aClass1_Sub2_Sub5_Sub3Array10 == null) {
				Static136.aClass1_Sub2_Sub5_Sub3Array10 = Static204.method3262(Static117.aClass65_1665, Static34.aClass65_653, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static94.aClass1_Sub2_Sub5_Sub3Array2 == null) {
				Static94.aClass1_Sub2_Sub5_Sub3Array2 = Static204.method3262(Static117.aClass65_1665, Static157.aClass65_2549, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static197.aClass1_Sub2_Sub5_Sub3Array13 == null) {
				Static197.aClass1_Sub2_Sub5_Sub3Array13 = Static204.method3262(Static117.aClass65_1665, Static97.aClass65_1447, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static200.aClass1_Sub2_Sub5_Sub3_9 == null) {
				Static200.aClass1_Sub2_Sub5_Sub3_9 = Static174.method2964(Static143.aClass60_Sub1_64, Static173.aClass65_2285, Static117.aClass65_1665);
			} else {
				local17++;
			}
			if (Static189.aClass1_Sub2_Sub5_Sub3Array12 == null) {
				Static189.aClass1_Sub2_Sub5_Sub3Array12 = Static204.method3262(Static117.aClass65_1665, Static112.aClass65_1585, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static146.aClass1_Sub2_Sub5_Sub3Array11 == null) {
				Static146.aClass1_Sub2_Sub5_Sub3Array11 = Static204.method3262(Static117.aClass65_1665, Static159.aClass65_2156, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static49.aClass1_Sub2_Sub5_Sub1Array5 == null) {
				Static49.aClass1_Sub2_Sub5_Sub1Array5 = Static83.method1443(Static117.aClass65_1665, Static112.aClass65_1584, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			if (Static139.aClass1_Sub2_Sub5_Sub1Array11 == null) {
				Static139.aClass1_Sub2_Sub5_Sub1Array11 = Static83.method1443(Static117.aClass65_1665, Static73.aClass65_1103, Static143.aClass60_Sub1_64);
			} else {
				local17++;
			}
			local17++;
			if (local17 < 16) {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static51.aClass65_850, Static118.method2250(local17 * 100 / 16), Static70.aClass65_1067 });
				Static107.anInt2627 = 70;
			} else {
				Static126.aClass1_Sub2_Sub5_Sub4_Sub1_4.method1613(Static139.aClass1_Sub2_Sub5_Sub1Array11, null);
				Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1613(Static139.aClass1_Sub2_Sub5_Sub1Array11, null);
				Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1613(Static139.aClass1_Sub2_Sub5_Sub1Array11, null);
				if (Static126.aClass1_Sub2_Sub5_Sub4_Sub1_4 != Static38.aClass1_Sub2_Sub5_Sub4_Sub1_2) {
					Static38.aClass1_Sub2_Sub5_Sub4_Sub1_2.method1613(Static139.aClass1_Sub2_Sub5_Sub1Array11, null);
				}
				for (local54 = 0; local54 < Static197.aClass1_Sub2_Sub5_Sub3Array13.length; local54++) {
					Static197.aClass1_Sub2_Sub5_Sub3Array13[local54].method1308();
				}
				Static8.aClass1_Sub2_Sub5_Sub3_1.method1308();
				local64 = (int) (Math.random() * 21.0D) - 10;
				local71 = (int) (Math.random() * 21.0D) - 10;
				local75 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1250) int local1250 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(1252) int local1252 = 0; local1252 < Static28.aClass1_Sub2_Sub5_Sub3Array1.length; local1252++) {
					Static28.aClass1_Sub2_Sub5_Sub3Array1[local1252].method1307(local64 + local1250, local71 - -local1250, local1250 + local75);
				}
				Static107.aClass1_Sub2_Sub5_Sub1Array9[0].method553(local1250 + local64, local71 + local1250, local1250 + local75);
				Static41.anInt1097 = 90;
				Static139.aClass65_1956 = Static11.aClass65_217;
				Static107.anInt2627 = 70;
			}
		} else if (Static41.anInt1097 == 90) {
			if (Static33.aClass60_Sub1_34.method2338()) {
				@Pc(1347) Class31 local1347 = new Class31(Static33.aClass60_Sub1_34, Static143.aClass60_Sub1_64, 20, Static13.aBoolean36 ? 64 : 128);
				Static56.method1022(local1347);
				Static56.method1027(0.7F);
				Static139.aClass65_1956 = Static42.aClass65_698;
				Static107.anInt2627 = 90;
				Static41.anInt1097 = 110;
			} else {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static65.aClass65_1010, Static118.method2250(Static33.aClass60_Sub1_34.method2319()), Static70.aClass65_1067 });
				Static107.anInt2627 = 90;
			}
		} else if (Static41.anInt1097 == 110) {
			Static36.aClass64_1 = new Class64();
			Static153.aClass14_3.method625(Static36.aClass64_1, 10);
			Static107.anInt2627 = 94;
			Static139.aClass65_1956 = Static89.aClass65_1260;
			Static41.anInt1097 = 120;
		} else if (Static41.anInt1097 == 120) {
			if (Static22.aClass60_Sub1_20.method2324(Static185.aClass65_2440, Static117.aClass65_1665)) {
				@Pc(1416) Class70 local1416 = new Class70(Static22.aClass60_Sub1_20.method2325(Static117.aClass65_1665, Static185.aClass65_2440));
				Static117.method2157(local1416);
				Static107.anInt2627 = 96;
				Static139.aClass65_1956 = Static25.aClass65_533;
				Static41.anInt1097 = 130;
			} else {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static169.aClass65_1227, Static147.aClass65_2003 });
				Static107.anInt2627 = 96;
			}
		} else if (Static41.anInt1097 == 130) {
			if (!Static157.aClass60_Sub1_165.method2338()) {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static158.aClass65_2099, Static118.method2250(Static157.aClass60_Sub1_165.method2319() * 4 / 5), Static70.aClass65_1067 });
				Static107.anInt2627 = 100;
			} else if (!Static195.aClass60_Sub1_160.method2338()) {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static158.aClass65_2099, Static118.method2250(Static195.aClass60_Sub1_160.method2319() / 6 + 80), Static70.aClass65_1067 });
				Static107.anInt2627 = 100;
			} else if (Static33.aClass60_Sub1_35.method2338()) {
				Static107.anInt2627 = 100;
				Static139.aClass65_1956 = Static192.aClass65_2475;
				Static41.anInt1097 = 140;
			} else {
				Static139.aClass65_1956 = Static109.method2004(new Class65[] { Static158.aClass65_2099, Static118.method2250(Static33.aClass60_Sub1_35.method2319() / 20 + 96), Static70.aClass65_1067 });
				Static107.anInt2627 = 100;
			}
		} else if (Static41.anInt1097 == 140) {
			Static121.aClass60_Sub1_115.method2318(false);
			Static16.aClass60_Sub1_15.method2318(true);
			Static143.aClass60_Sub1_64.method2318(true);
			Static33.aClass60_Sub1_35.method2318(true);
			Static22.aClass60_Sub1_20.method2318(true);
			Static118.method2247(10);
		}
	}
}
