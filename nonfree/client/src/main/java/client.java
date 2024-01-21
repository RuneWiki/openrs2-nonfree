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
				Static96.method1641();
			}
			Static118.anInt2710 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static214.anInt4256 = 0;
			} else if (arg0[1].equals("office")) {
				Static214.anInt4256 = 1;
			} else if (arg0[1].equals("local")) {
				Static214.anInt4256 = 2;
			} else {
				Static96.method1641();
			}
			if (arg0[2].equals("live")) {
				Static165.anInt3382 = 0;
			} else if (arg0[2].equals("rc")) {
				Static165.anInt3382 = 1;
			} else if (arg0[2].equals("wip")) {
				Static165.anInt3382 = 2;
			} else {
				Static96.method1641();
			}
			if (arg0[3].equals("lowmem")) {
				Static208.method3142();
			} else if (arg0[3].equals("highmem")) {
				Static143.method2298();
			} else {
				Static96.method1641();
			}
			if (arg0[4].equals("free")) {
				Static116.aBoolean127 = false;
			} else if (arg0[4].equals("members")) {
				Static116.aBoolean127 = true;
			} else {
				Static96.method1641();
			}
			if (arg0[5].equals("english")) {
				Static98.anInt2134 = 0;
			} else if (arg0[5].equals("german")) {
				Static22.method436();
				Static98.anInt2134 = 1;
			} else {
				Static96.method1641();
			}
			if (arg0[6].equals("game0")) {
				Static180.anInt3675 = 0;
			} else if (arg0[6].equals("game1")) {
				Static180.anInt3675 = 1;
			} else {
				Static96.method1641();
			}
			Static63.aClass83_988 = Static182.aClass83_1067;
			Static132.anInt2868 = 0;
			Static196.aString6 = "127.0.0.1";
			@Pc(176) client local176 = new client();
			local176.method630("runescape", Static165.anInt3382 + 32);
			Static67.aFrame1.setLocation(40, 40);
		} catch (@Pc(193) Exception local193) {
			Static188.method2856(null, local193);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method629() {
		if (Static175.aClass45_1 != null) {
			Static175.aClass45_1.aBoolean94 = false;
		}
		Static175.aClass45_1 = null;
		if (Static175.aClass25_5 != null) {
			Static175.aClass25_5.method796();
			Static175.aClass25_5 = null;
		}
		Static48.method958(Static69.aCanvas1);
		Static109.method1943(Static69.aCanvas1);
		if (Static60.aClass13_2 != null) {
			Static60.aClass13_2.method415(Static69.aCanvas1);
		}
		Static196.method2943();
		Static41.method811();
		Static60.aClass13_2 = null;
		if (Static168.aClass10_2 != null) {
			Static168.aClass10_2.method1782();
		}
		if (Static142.aClass10_1 != null) {
			Static142.aClass10_1.method1782();
		}
		Static115.method2031();
		Static150.method2341();
		try {
			if (Static161.aClass67_2 != null) {
				Static161.aClass67_2.method2202();
			}
			if (Static123.aClass67Array1 != null) {
				for (@Pc(71) int local71 = 0; local71 < Static123.aClass67Array1.length; local71++) {
					if (Static123.aClass67Array1[local71] != null) {
						Static123.aClass67Array1[local71].method2202();
					}
				}
			}
			if (Static94.aClass67_5 != null) {
				Static94.aClass67_5.method2202();
			}
			if (Static149.aClass67_6 != null) {
				Static149.aClass67_6.method2202();
			}
		} catch (@Pc(103) IOException local103) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method642() {
		if (Static68.anInt1625 != 1000) {
			@Pc(19) boolean local19 = Static180.method2791();
			if (!local19) {
				this.method648();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method644(@OriginalArg(0) int arg0) {
		Static85.aClass15_7 = null;
		Static183.aClass25_2 = null;
		if (Static208.anInt4116 == Static94.anInt2004) {
			Static208.anInt4116 = Static80.anInt1792;
		} else {
			Static208.anInt4116 = Static94.anInt2004;
		}
		Static26.anInt662 = 0;
		Static6.anInt161++;
		if (Static6.anInt161 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static68.anInt1625 > 5) {
				Static156.anInt4249 = 3000;
			} else {
				this.method641("js5connect_full");
				Static68.anInt1625 = 1000;
			}
		} else if (Static6.anInt161 >= 2 && arg0 == 6) {
			this.method641("js5connect_outofdate");
			Static68.anInt1625 = 1000;
		} else if (Static6.anInt161 >= 4) {
			if (Static68.anInt1625 > 5) {
				Static156.anInt4249 = 3000;
			} else {
				this.method641("js5connect");
				Static68.anInt1625 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method634() {
		Static13.anInt386++;
		if (Static13.anInt386 % 1000 == 1) {
			@Pc(18) GregorianCalendar local18 = new GregorianCalendar();
			Static80.anInt1787 = local18.get(11) * 600 + local18.get(12) * 10 + local18.get(13) / 6;
			Static12.aRandom1.setSeed((long) Static80.anInt1787);
		}
		this.method642();
		Static204.method3084();
		Static94.method1611();
		Static192.method2892();
		Static112.method1577();
		Static94.method1609();
		if (Static60.aClass13_2 != null) {
			@Pc(62) int local62 = Static60.aClass13_2.method414();
			Static27.anInt1416 = local62;
		}
		if (Static68.anInt1625 == 0) {
			this.method649();
			Static114.method2017();
		} else if (Static68.anInt1625 == 5) {
			Static35.method721(this);
			this.method649();
			Static114.method2017();
		} else if (Static68.anInt1625 == 10) {
			Static35.method721(this);
		} else if (Static68.anInt1625 == 20) {
			Static35.method721(this);
			Static127.method2163();
		} else if (Static68.anInt1625 == 25) {
			Static210.method3193();
		}
		if (Static68.anInt1625 == 30) {
			Static40.method795();
		} else if (Static68.anInt1625 == 40) {
			Static127.method2163();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method636() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method633()) {
			return;
		}
		Static118.anInt2710 = Integer.parseInt(this.getParameter("worldid"));
		Static165.anInt3382 = Integer.parseInt(this.getParameter("modewhat"));
		Static214.anInt4256 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static208.method3142();
		} else {
			Static143.method2298();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static116.aBoolean127 = true;
		} else {
			Static116.aBoolean127 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static22.method436();
			Static98.anInt2134 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static180.anInt3675 = 1;
		} else {
			Static180.anInt3675 = 0;
		}
		try {
			Static158.anInt3205 = Integer.parseInt(this.getParameter("js"));
			Static52.anInt1333 = Integer.parseInt(this.getParameter("plug"));
			Static132.anInt2868 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static63.aClass83_988 = Static17.aClass83_95.method2424(this);
		if (Static63.aClass83_988 == null) {
			Static63.aClass83_988 = Static182.aClass83_1067;
		}
		Static196.aString6 = this.getCodeBase().getHost();
		this.method635(Static165.anInt3382 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method628() {
		@Pc(3) boolean local3 = false;
		@Pc(10) boolean local10 = Static18.method1615();
		if (local10 && Static125.aBoolean136 && Static168.aClass10_2 != null) {
			Static168.aClass10_2.method1772();
		}
		if (Static18.aBoolean104) {
			local3 = true;
			Static18.aBoolean104 = false;
		}
		if (Static68.anInt1625 == 0) {
			Static191.method2870(local3, Static46.anInt1125, Static206.aClass83_1176, null);
		} else if (Static68.anInt1625 == 5 || Static68.anInt1625 == 10 || Static68.anInt1625 == 20) {
			Static139.method2249(Static77.aClass2_Sub2_Sub5_2, Static62.aClass2_Sub2_Sub5_1);
		} else if (Static68.anInt1625 == 25) {
			@Pc(98) int local98;
			if (Static53.anInt1353 == 1) {
				if (Static41.anInt1038 > Static6.anInt166) {
					Static6.anInt166 = Static41.anInt1038;
				}
				local98 = (Static6.anInt166 - Static41.anInt1038) * 50 / Static6.anInt166;
				Static142.method2281(false, Static67.method1268(new Class83[] { Static29.aClass83_217, Static173.aClass83_1025, Static129.method2179(local98), Static213.aClass83_1209 }));
			} else if (Static53.anInt1353 == 2) {
				if (Static105.anInt2425 < Static82.anInt1838) {
					Static105.anInt2425 = Static82.anInt1838;
				}
				local98 = (Static105.anInt2425 - Static82.anInt1838) * 50 / Static105.anInt2425 + 50;
				Static142.method2281(false, Static67.method1268(new Class83[] { Static29.aClass83_217, Static173.aClass83_1025, Static129.method2179(local98), Static213.aClass83_1209 }));
			} else {
				Static142.method2281(false, Static29.aClass83_217);
			}
		} else if (Static68.anInt1625 == 30) {
			Static135.method2228();
		} else if (Static68.anInt1625 == 40) {
			Static142.method2281(false, Static67.method1268(new Class83[] { Static27.aClass83_453, Static28.aClass83_212, Static34.aClass83_284 }));
		}
		@Pc(191) Canvas local191 = Static69.aCanvas1;
		@Pc(206) Graphics local206;
		@Pc(214) int local214;
		if (Static68.anInt1625 == 30 && Static95.anInt2022 == 0 && !local3) {
			try {
				local206 = local191.getGraphics();
				for (local214 = 0; local214 < Static139.anInt2948; local214++) {
					if (Static162.aBooleanArray28[local214]) {
						Static191.aClass34_1.method2582(Static86.anIntArray181[local214], Static101.anIntArray226[local214], Static15.anIntArray27[local214], local206, Static71.anIntArray167[local214]);
						Static162.aBooleanArray28[local214] = false;
					}
				}
			} catch (@Pc(267) Exception local267) {
				local191.repaint();
			}
		} else if (Static68.anInt1625 > 0) {
			try {
				local206 = local191.getGraphics();
				Static191.aClass34_1.method2585(local206);
				for (local214 = 0; local214 < Static139.anInt2948; local214++) {
					Static162.aBooleanArray28[local214] = false;
				}
			} catch (@Pc(226) Exception local226) {
				local191.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method638() {
		Static94.anInt2004 = Static214.anInt4256 == 0 ? 43594 : Static118.anInt2710 + 40000;
		if (Static180.anInt3675 == 1) {
			Static105.aShortArrayArray3 = Static93.aShortArrayArray2;
			Static46.aShortArray13 = Static14.aShortArray22;
			Static3.aShortArrayArray1 = Static157.aShortArrayArray6;
			Static3.aShortArray1 = Static102.aShortArray21;
		} else {
			Static3.aShortArray1 = Static161.aShortArray3;
			Static3.aShortArrayArray1 = Static106.aShortArrayArray4;
			Static105.aShortArrayArray3 = Static138.aShortArrayArray5;
			Static46.aShortArray13 = Static43.aShortArray14;
		}
		Static116.aShortArray26 = Static74.aShortArray20 = Static215.aShortArray60 = new short[256];
		Static80.anInt1792 = Static214.anInt4256 == 0 ? 443 : Static118.anInt2710 + 50000;
		Static208.anInt4116 = Static94.anInt2004;
		Static196.method2945();
		Static11.method288(Static69.aCanvas1);
		Static148.method2319(Static69.aCanvas1);
		Static60.aClass13_2 = Static116.method2042();
		if (Static60.aClass13_2 != null) {
			Static60.aClass13_2.method413(Static69.aCanvas1);
		}
		Static94.anInt1997 = Static1.anInt1;
		try {
			if (Static23.aClass1_1.aClass80_3 != null) {
				Static161.aClass67_2 = new Class67(Static23.aClass1_1.aClass80_3, 5200, 0);
				for (@Pc(86) int local86 = 0; local86 < 24; local86++) {
					Static123.aClass67Array1[local86] = new Class67(Static23.aClass1_1.aClass80Array1[local86], 6000, 0);
				}
				Static94.aClass67_5 = new Class67(Static23.aClass1_1.aClass80_2, 6000, 0);
				Static152.aClass8_4 = new Class8(255, Static161.aClass67_2, Static94.aClass67_5, 500000);
				Static149.aClass67_6 = new Class67(Static23.aClass1_1.aClass80_1, 24, 0);
				Static23.aClass1_1.aClass80_2 = null;
				Static23.aClass1_1.aClass80_3 = null;
				Static23.aClass1_1.aClass80_1 = null;
				Static23.aClass1_1.aClass80Array1 = null;
			}
		} catch (@Pc(142) IOException local142) {
			Static94.aClass67_5 = null;
			Static149.aClass67_6 = null;
			Static152.aClass8_4 = null;
			Static161.aClass67_2 = null;
		}
		if (Static214.anInt4256 != 0) {
			Static167.aBoolean160 = true;
		}
		Static163.aClass83_961 = Static147.aClass83_1177;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method648() {
		if (Static44.anInt1171 >= 4) {
			this.method641("js5crc");
			Static68.anInt1625 = 1000;
			return;
		}
		if (Static167.anInt3455 >= 4) {
			if (Static68.anInt1625 <= 5) {
				this.method641("js5io");
				Static68.anInt1625 = 1000;
				return;
			}
			Static167.anInt3455 = 3;
			Static156.anInt4249 = 3000;
		}
		if (Static156.anInt4249-- > 0) {
			return;
		}
		try {
			if (Static26.anInt662 == 0) {
				Static85.aClass15_7 = Static23.aClass1_1.method1(Static196.aString6, Static208.anInt4116);
				Static26.anInt662++;
			}
			if (Static26.anInt662 == 1) {
				if (Static85.aClass15_7.anInt624 == 2) {
					this.method644(-1);
					return;
				}
				if (Static85.aClass15_7.anInt624 == 1) {
					Static26.anInt662++;
				}
			}
			if (Static26.anInt662 == 2) {
				Static183.aClass25_2 = new Class25((Socket) Static85.aClass15_7.anObject1, Static23.aClass1_1);
				@Pc(100) Class2_Sub3 local100 = new Class2_Sub3(5);
				local100.method247(15);
				local100.method246(497);
				Static183.aClass25_2.method800(local100.aByteArray2, 5);
				Static26.anInt662++;
				Static87.aLong61 = Static68.method1276();
			}
			if (Static26.anInt662 == 3) {
				if (Static68.anInt1625 <= 5 || Static183.aClass25_2.method798() > 0) {
					@Pc(138) int local138 = Static183.aClass25_2.method802();
					if (local138 != 0) {
						this.method644(local138);
						return;
					}
					Static26.anInt662++;
				} else if (Static68.method1276() - Static87.aLong61 > 30000L) {
					this.method644(-2);
					return;
				}
			}
			if (Static26.anInt662 == 4) {
				Static188.method2858(Static183.aClass25_2, Static68.anInt1625 > 20);
				Static6.anInt161 = 0;
				Static85.aClass15_7 = null;
				Static26.anInt662 = 0;
				Static183.aClass25_2 = null;
			}
		} catch (@Pc(196) IOException local196) {
			this.method644(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method649() {
		@Pc(29) int local29;
		if (Static160.anInt3229 == 0) {
			@Pc(20) Runtime local20 = Runtime.getRuntime();
			local29 = (int) ((local20.totalMemory() - local20.freeMemory()) / 1024L);
			@Pc(32) long local32 = Static68.method1276();
			if (Static139.aLong104 == 0L) {
				Static139.aLong104 = local32;
			}
			if (local29 > 16384 && local32 - Static139.aLong104 < 5000L) {
				if (local32 - Static18.aLong68 > 1000L) {
					System.gc();
					Static18.aLong68 = local32;
				}
				Static206.aClass83_1176 = Static53.aClass83_408;
				Static46.anInt1125 = 5;
			} else {
				Static46.anInt1125 = 5;
				Static206.aClass83_1176 = Static79.aClass83_565;
				Static160.anInt3229 = 10;
			}
			return;
		}
		@Pc(87) int local87;
		if (Static160.anInt3229 == 10) {
			Static10.method274(Static170.anIntArrayArrayArray10);
			for (local87 = 0; local87 < 4; local87++) {
				Static117.aClass22Array1[local87] = new Class22(104, 104);
			}
			Static46.anInt1125 = 10;
			Static206.aClass83_1176 = Static26.aClass83_151;
			Static160.anInt3229 = 30;
		} else if (Static160.anInt3229 == 30) {
			Static18.aClass28_Sub1_13 = Static147.method3113(true, 0, false, true);
			Static68.aClass28_Sub1_10 = Static147.method3113(true, 1, false, true);
			Static201.aClass28_Sub1_26 = Static147.method3113(false, 2, true, true);
			Static44.aClass28_Sub1_7 = Static147.method3113(true, 3, false, true);
			Static137.aClass28_Sub1_21 = Static147.method3113(true, 4, false, true);
			Static32.aClass28_Sub1_3 = Static147.method3113(true, 5, true, true);
			Static157.aClass28_Sub1_23 = Static147.method3113(true, 6, true, false);
			Static160.aClass28_Sub1_24 = Static147.method3113(true, 7, false, true);
			Static113.aClass28_Sub1_18 = Static147.method3113(true, 8, false, true);
			Static34.aClass28_Sub1_4 = Static147.method3113(false, 9, true, true);
			Static197.aClass28_Sub1_25 = Static147.method3113(true, 10, false, true);
			Static125.aClass28_Sub1_19 = Static147.method3113(true, 11, false, true);
			Static211.aClass28_Sub1_27 = Static147.method3113(true, 12, false, true);
			Static73.aClass28_Sub1_11 = Static147.method3113(false, 13, true, true);
			Static42.aClass28_Sub1_6 = Static147.method3113(true, 14, false, false);
			Static106.aClass28_Sub1_16 = Static147.method3113(true, 15, false, true);
			Static44.aClass28_Sub1_8 = Static147.method3113(true, 16, false, true);
			Static23.aClass28_Sub1_2 = Static147.method3113(true, 17, false, true);
			Static142.aClass28_Sub1_22 = Static147.method3113(true, 18, false, true);
			Static57.aClass28_Sub1_9 = Static147.method3113(true, 19, false, true);
			Static130.aClass28_Sub1_20 = Static147.method3113(true, 20, false, true);
			Static91.aClass28_Sub1_12 = Static147.method3113(true, 21, false, true);
			Static37.aClass28_Sub1_5 = Static147.method3113(true, 22, false, true);
			Static97.aClass28_Sub1_14 = Static147.method3113(true, 23, true, true);
			Static206.aClass83_1176 = Static17.aClass83_101;
			Static160.anInt3229 = 40;
			Static46.anInt1125 = 15;
		} else if (Static160.anInt3229 == 40) {
			local87 = Static18.aClass28_Sub1_13.method881() * 4 / 100;
			local87 += Static68.aClass28_Sub1_10.method881() * 4 / 100;
			local87 += Static201.aClass28_Sub1_26.method881() / 100;
			local87 += Static44.aClass28_Sub1_7.method881() * 2 / 100;
			local87 += Static137.aClass28_Sub1_21.method881() * 6 / 100;
			local87 += Static32.aClass28_Sub1_3.method881() * 4 / 100;
			local87 += Static157.aClass28_Sub1_23.method881() * 2 / 100;
			local87 += Static160.aClass28_Sub1_24.method881() * 53 / 100;
			local87 += Static113.aClass28_Sub1_18.method881() * 2 / 100;
			local87 += Static34.aClass28_Sub1_4.method881() * 2 / 100;
			local87 += Static197.aClass28_Sub1_25.method881() * 2 / 100;
			local87 += Static125.aClass28_Sub1_19.method881() * 2 / 100;
			local87 += Static211.aClass28_Sub1_27.method881() * 2 / 100;
			local87 += Static73.aClass28_Sub1_11.method881() * 2 / 100;
			local87 += Static42.aClass28_Sub1_6.method881() * 2 / 100;
			local87 += Static106.aClass28_Sub1_16.method881() * 2 / 100;
			local87 += Static44.aClass28_Sub1_8.method881() / 100;
			local87 += Static23.aClass28_Sub1_2.method881() / 100;
			local87 += Static142.aClass28_Sub1_22.method881() / 100;
			local87 += Static57.aClass28_Sub1_9.method881() / 100;
			local87 += Static130.aClass28_Sub1_20.method881() / 100;
			local87 += Static91.aClass28_Sub1_12.method881() / 100;
			local87 += Static37.aClass28_Sub1_5.method881() / 100;
			local87 += Static97.aClass28_Sub1_14.method881() / 100;
			if (local87 == 100) {
				Static206.aClass83_1176 = Static15.aClass83_86;
				Static46.anInt1125 = 20;
				Static61.method1178(Static197.aClass28_Sub1_25, Static113.aClass28_Sub1_18, Static157.aClass28_Sub1_23);
				Static160.anInt3229 = 45;
			} else {
				if (local87 != 0) {
					Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static52.aClass83_400, Static129.method2179(local87), Static214.aClass83_1218 });
				}
				Static46.anInt1125 = 20;
			}
		} else if (Static160.anInt3229 == 45) {
			Static216.method3270(!Static158.aBoolean148);
			@Pc(572) Class2_Sub9_Sub3 local572 = new Class2_Sub9_Sub3();
			local572.method1553();
			Static168.aClass10_2 = Static103.method1810(0, Static69.aCanvas1, Static23.aClass1_1, 22050);
			Static168.aClass10_2.method1786(local572);
			Static188.method2857(Static42.aClass28_Sub1_6, Static106.aClass28_Sub1_16, local572, Static137.aClass28_Sub1_21);
			Static142.aClass10_1 = Static103.method1810(1, Static69.aCanvas1, Static23.aClass1_1, 2048);
			Static34.aClass2_Sub9_Sub4_1 = new Class2_Sub9_Sub4();
			Static142.aClass10_1.method1786(Static34.aClass2_Sub9_Sub4_1);
			Static15.aClass88_1 = new Class88(22050, Static68.anInt1622);
			Static206.aClass83_1176 = Static203.aClass83_1156;
			Static46.anInt1125 = 30;
			Static160.anInt3229 = 50;
		} else if (Static160.anInt3229 == 50) {
			local87 = 0;
			if (Static113.aClass28_Sub1_18.method862(Static104.aClass83_692)) {
				local87++;
			}
			if (Static113.aClass28_Sub1_18.method862(Static185.aClass83_1083)) {
				local87++;
			}
			if (Static113.aClass28_Sub1_18.method862(Static213.aClass83_1210)) {
				local87++;
			}
			if (Static73.aClass28_Sub1_11.method862(Static104.aClass83_692)) {
				local87++;
			}
			if (Static73.aClass28_Sub1_11.method862(Static185.aClass83_1083)) {
				local87++;
			}
			if (Static73.aClass28_Sub1_11.method862(Static213.aClass83_1210)) {
				local87++;
			}
			if (local87 < 6) {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static27.aClass83_451, Static129.method2179(local87 * 100 / 6), Static214.aClass83_1218 });
				Static46.anInt1125 = 35;
			} else {
				Static46.anInt1125 = 35;
				Static160.anInt3229 = 60;
				Static206.aClass83_1176 = Static159.aClass83_949;
			}
		} else if (Static160.anInt3229 == 60) {
			local87 = Static212.method3226(Static113.aClass28_Sub1_18, Static197.aClass28_Sub1_25);
			local29 = Static109.method1941();
			if (local29 > local87) {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static124.aClass83_738, Static129.method2179(local87 * 100 / local29), Static214.aClass83_1218 });
				Static46.anInt1125 = 40;
			} else {
				Static206.aClass83_1176 = Static180.aClass83_1050;
				Static160.anInt3229 = 65;
				Static46.anInt1125 = 40;
			}
		} else if (Static160.anInt3229 == 65) {
			Static77.aClass2_Sub2_Sub5_2 = Static68.method1278(Static73.aClass28_Sub1_11, Static104.aClass83_692, Static113.aClass28_Sub1_18, Static182.aClass83_1067);
			Static147.aClass2_Sub2_Sub5_Sub1_Sub1_6 = (Class2_Sub2_Sub5_Sub1_Sub1) Static77.aClass2_Sub2_Sub5_2;
			Static167.aClass2_Sub2_Sub5_3 = Static68.method1278(Static73.aClass28_Sub1_11, Static185.aClass83_1083, Static113.aClass28_Sub1_18, Static182.aClass83_1067);
			Static62.aClass2_Sub2_Sub5_1 = Static68.method1278(Static73.aClass28_Sub1_11, Static213.aClass83_1210, Static113.aClass28_Sub1_18, Static182.aClass83_1067);
			Static206.aClass83_1176 = Static64.aClass83_492;
			Static46.anInt1125 = 45;
			Static197.method2972(5);
			Static160.anInt3229 = 70;
		} else if (Static160.anInt3229 == 70) {
			Static201.aClass28_Sub1_26.method874();
			local87 = Static201.aClass28_Sub1_26.method869();
			Static44.aClass28_Sub1_8.method874();
			local87 += Static44.aClass28_Sub1_8.method869();
			Static23.aClass28_Sub1_2.method874();
			local87 += Static23.aClass28_Sub1_2.method869();
			Static142.aClass28_Sub1_22.method874();
			local87 += Static142.aClass28_Sub1_22.method869();
			Static57.aClass28_Sub1_9.method874();
			local87 += Static57.aClass28_Sub1_9.method869();
			Static130.aClass28_Sub1_20.method874();
			local87 += Static130.aClass28_Sub1_20.method869();
			Static91.aClass28_Sub1_12.method874();
			local87 += Static91.aClass28_Sub1_12.method869();
			Static37.aClass28_Sub1_5.method874();
			local87 += Static37.aClass28_Sub1_5.method869();
			if (local87 < 800) {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static131.aClass83_842, Static129.method2179(local87 / 8), Static214.aClass83_1218 });
				Static46.anInt1125 = 50;
			} else {
				Static38.method765(Static201.aClass28_Sub1_26);
				Static184.method2822(Static201.aClass28_Sub1_26);
				Static41.method808(Static160.aClass28_Sub1_24, Static201.aClass28_Sub1_26);
				Static49.method968(Static158.aBoolean148, Static116.aBoolean127, Static160.aClass28_Sub1_24, Static44.aClass28_Sub1_8);
				Static160.method2459(Static142.aClass28_Sub1_22, Static160.aClass28_Sub1_24);
				Static11.method291(Static116.aBoolean127, Static57.aClass28_Sub1_9, Static147.aClass2_Sub2_Sub5_Sub1_Sub1_6, Static160.aClass28_Sub1_24);
				Static69.method1295(Static130.aClass28_Sub1_20, Static68.aClass28_Sub1_10, Static18.aClass28_Sub1_13);
				Static193.method2904(Static160.aClass28_Sub1_24, Static91.aClass28_Sub1_12);
				Static76.method3255(Static37.aClass28_Sub1_5);
				Static157.method2383(Static201.aClass28_Sub1_26);
				Static163.method2506(Static73.aClass28_Sub1_11, Static44.aClass28_Sub1_7, Static160.aClass28_Sub1_24, Static113.aClass28_Sub1_18);
				Static41.method810(Static201.aClass28_Sub1_26);
				Static157.method2411(Static23.aClass28_Sub1_2);
				Static197.method2971(Static201.aClass28_Sub1_26);
				Static205.method3106(Static201.aClass28_Sub1_26);
				Static206.aClass83_1176 = Static162.aClass83_1134;
				Static46.anInt1125 = 50;
				Static181.method2794();
				Static160.anInt3229 = 80;
			}
		} else if (Static160.anInt3229 == 80) {
			local87 = 0;
			if (Static138.aClass2_Sub2_Sub17_5 == null) {
				@Pc(986) Class2_Sub2_Sub17_Sub1 local986 = Static185.method2830(Static182.aClass83_1067, Static160.aClass83_950, Static113.aClass28_Sub1_18);
				if (local986 != null) {
					local986.method1918();
					Static138.aClass2_Sub2_Sub17_5 = local986;
				}
			} else {
				local87++;
			}
			if (Static87.aClass29_Sub1Array1 == null) {
				Static87.aClass29_Sub1Array1 = Static22.method430(Static182.aClass83_1067, Static115.aClass83_776, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			if (Static130.aClass2_Sub2_Sub17_Sub1Array1 == null) {
				Static130.aClass2_Sub2_Sub17_Sub1Array1 = Static118.method2065(Static113.aClass28_Sub1_18, Static56.aClass83_422, Static182.aClass83_1067);
			} else {
				local87++;
			}
			if (Static38.aClass2_Sub2_Sub17Array3 == null) {
				Static38.aClass2_Sub2_Sub17Array3 = Static13.method303(Static182.aClass83_1067, Static190.aClass83_1100, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			if (Static169.aClass2_Sub2_Sub17Array8 == null) {
				Static169.aClass2_Sub2_Sub17Array8 = Static13.method303(Static182.aClass83_1067, Static173.aClass83_1027, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			if (Static130.aClass2_Sub2_Sub17Array7 == null) {
				Static130.aClass2_Sub2_Sub17Array7 = Static13.method303(Static182.aClass83_1067, Static167.aClass83_992, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			if (Static170.aClass2_Sub2_Sub17Array9 == null) {
				Static170.aClass2_Sub2_Sub17Array9 = Static13.method303(Static182.aClass83_1067, Static76.aClass83_1228, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			if (Static190.aClass2_Sub2_Sub17Array11 == null) {
				Static190.aClass2_Sub2_Sub17Array11 = Static13.method303(Static182.aClass83_1067, Static110.aClass83_752, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			@Pc(1084) int local1084;
			if (Static86.aClass2_Sub2_Sub17Array5 == null) {
				@Pc(1080) Class2_Sub2_Sub17_Sub1[] local1080 = Static118.method2065(Static113.aClass28_Sub1_18, Static164.aClass83_973, Static182.aClass83_1067);
				if (local1080 != null) {
					for (local1084 = 0; local1084 < local1080.length; local1084++) {
						local1080[local1084].method1918();
					}
					Static86.aClass2_Sub2_Sub17Array5 = local1080;
				}
			} else {
				local87++;
			}
			if (Static110.aClass2_Sub2_Sub17_4 == null) {
				Static110.aClass2_Sub2_Sub17_4 = Static27.method1104(Static111.aClass83_762, Static113.aClass28_Sub1_18, Static182.aClass83_1067);
			} else {
				local87++;
			}
			if (Static175.aClass2_Sub2_Sub17Array10 == null) {
				Static175.aClass2_Sub2_Sub17Array10 = Static13.method303(Static182.aClass83_1067, Static4.aClass83_21, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			if (Static23.aClass2_Sub2_Sub17Array2 == null) {
				Static23.aClass2_Sub2_Sub17Array2 = Static13.method303(Static182.aClass83_1067, Static59.aClass83_462, Static113.aClass28_Sub1_18);
			} else {
				local87++;
			}
			if (Static172.aClass29Array7 == null) {
				Static172.aClass29Array7 = Static4.method85(Static113.aClass28_Sub1_18, Static182.aClass83_1067, Static116.aClass83_786);
			} else {
				local87++;
			}
			if (Static177.aClass29Array8 == null) {
				Static177.aClass29Array8 = Static4.method85(Static113.aClass28_Sub1_18, Static182.aClass83_1067, Static108.aClass83_721);
			} else {
				local87++;
			}
			local87++;
			if (local87 < 15) {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static163.aClass83_960, Static129.method2179(local87 * 100 / 15), Static214.aClass83_1218 });
				Static46.anInt1125 = 60;
			} else {
				Static77.aClass2_Sub2_Sub5_2.method1085(Static177.aClass29Array8, null);
				Static167.aClass2_Sub2_Sub5_3.method1085(Static177.aClass29Array8, null);
				Static62.aClass2_Sub2_Sub5_1.method1085(Static177.aClass29Array8, null);
				local29 = (int) (Math.random() * 21.0D) - 10;
				local1084 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1217) int local1217 = (int) (Math.random() * 41.0D) - 20;
				@Pc(1224) int local1224 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1226) int local1226 = 0; local1226 < Static130.aClass2_Sub2_Sub17_Sub1Array1.length; local1226++) {
					Static130.aClass2_Sub2_Sub17_Sub1Array1[local1226].method1920(local1217 + local29, local1084 - -local1217, local1217 + local1224);
				}
				Static87.aClass29_Sub1Array1[0].method1188(local1217 + local29, local1217 + local1084, local1224 + local1217);
				Static46.anInt1125 = 60;
				Static206.aClass83_1176 = Static105.aClass83_701;
				Static160.anInt3229 = 90;
				Static52.aClass2_Sub2_Sub17Array4 = Static130.aClass2_Sub2_Sub17_Sub1Array1;
			}
		} else if (Static160.anInt3229 == 90) {
			if (Static34.aClass28_Sub1_4.method874()) {
				@Pc(1316) Class39 local1316 = new Class39(Static34.aClass28_Sub1_4, Static113.aClass28_Sub1_18, 20, Static158.aBoolean148 ? 64 : 128);
				Static24.method473(local1316);
				Static24.method459(0.7F);
				Static206.aClass83_1176 = Static181.aClass83_1057;
				Static160.anInt3229 = 110;
				Static46.anInt1125 = 70;
			} else {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static181.aClass83_1054, Static129.method2179(Static34.aClass28_Sub1_4.method869()), Static214.aClass83_1218 });
				Static46.anInt1125 = 70;
			}
		} else if (Static160.anInt3229 == 110) {
			Static175.aClass45_1 = new Class45();
			Static23.aClass1_1.method8(Static175.aClass45_1, 10);
			Static46.anInt1125 = 75;
			Static206.aClass83_1176 = Static36.aClass83_289;
			Static160.anInt3229 = 120;
		} else if (Static160.anInt3229 == 120) {
			if (Static197.aClass28_Sub1_25.method877(Static182.aClass83_1067, Static194.aClass83_1116)) {
				@Pc(1383) Class55 local1383 = new Class55(Static197.aClass28_Sub1_25.method860(Static194.aClass83_1116, Static182.aClass83_1067));
				Static27.method1107(local1383);
				Static46.anInt1125 = 80;
				Static206.aClass83_1176 = Static124.aClass83_739;
				Static160.anInt3229 = 130;
			} else {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static43.aClass83_352, Static113.aClass83_766 });
				Static46.anInt1125 = 80;
			}
		} else if (Static160.anInt3229 == 130) {
			if (!Static44.aClass28_Sub1_7.method874()) {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static196.aClass83_1123, Static129.method2179(Static44.aClass28_Sub1_7.method869() * 4 / 5), Static214.aClass83_1218 });
				Static46.anInt1125 = 85;
			} else if (!Static211.aClass28_Sub1_27.method874()) {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static196.aClass83_1123, Static129.method2179(Static211.aClass28_Sub1_27.method869() / 6 + 80), Static214.aClass83_1218 });
				Static46.anInt1125 = 85;
			} else if (Static73.aClass28_Sub1_11.method874()) {
				Static46.anInt1125 = 100;
				Static206.aClass83_1176 = Static175.aClass83_1036;
				Static160.anInt3229 = 140;
			} else {
				Static206.aClass83_1176 = Static67.method1268(new Class83[] { Static196.aClass83_1123, Static129.method2179(Static73.aClass28_Sub1_11.method869() / 20 + 96), Static214.aClass83_1218 });
				Static46.anInt1125 = 85;
			}
		} else if (Static160.anInt3229 == 140) {
			Static32.aClass28_Sub1_3.method859(false);
			Static157.aClass28_Sub1_23.method859(true);
			Static113.aClass28_Sub1_18.method859(true);
			Static73.aClass28_Sub1_11.method859(true);
			Static197.aClass28_Sub1_25.method859(true);
			Static197.method2972(10);
		}
	}
}
