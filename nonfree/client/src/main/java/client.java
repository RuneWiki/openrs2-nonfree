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
				Static130.method2310();
			}
			Static69.anInt1855 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static89.anInt2298 = 0;
			} else if (arg0[1].equals("office")) {
				Static89.anInt2298 = 1;
			} else if (arg0[1].equals("local")) {
				Static89.anInt2298 = 2;
			} else {
				Static130.method2310();
			}
			if (arg0[2].equals("live")) {
				Static57.anInt1407 = 0;
			} else if (arg0[2].equals("rc")) {
				Static57.anInt1407 = 1;
			} else if (arg0[2].equals("wip")) {
				Static57.anInt1407 = 2;
			} else {
				Static130.method2310();
			}
			if (arg0[3].equals("lowmem")) {
				Static30.method502();
			} else if (arg0[3].equals("highmem")) {
				Static96.method1859();
			} else {
				Static130.method2310();
			}
			if (arg0[4].equals("free")) {
				Static94.aBoolean106 = false;
			} else if (arg0[4].equals("members")) {
				Static94.aBoolean106 = true;
			} else {
				Static130.method2310();
			}
			if (arg0[5].equals("english")) {
				Static64.anInt1688 = 0;
			} else if (arg0[5].equals("german")) {
				Static88.method1748();
				Static64.anInt1688 = 1;
				Static3.aClass46_45 = Static154.aClass46_1497;
			} else {
				Static130.method2310();
			}
			if (arg0[6].equals("game0")) {
				Static41.anInt1061 = 0;
			} else if (arg0[6].equals("game1")) {
				Static41.anInt1061 = 1;
			} else {
				Static130.method2310();
			}
			Static81.anInt2016 = 0;
			Static57.aString1 = "127.0.0.1";
			Static77.aClass46_738 = Static3.aClass46_44;
			@Pc(178) client local178 = new client();
			local178.method479("runescape", Static57.anInt1407 + 32);
			Static164.aFrame1.setLocation(40, 40);
		} catch (@Pc(195) Exception local195) {
			Static146.method2485(null, local195);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method481() {
		if (Static114.aClass5_1 != null) {
			Static114.aClass5_1.aBoolean14 = false;
		}
		Static114.aClass5_1 = null;
		if (Static59.aClass27_2 != null) {
			Static59.aClass27_2.method952();
			Static59.aClass27_2 = null;
		}
		Static17.method304(Static137.aCanvas1);
		Static143.method2447(Static137.aCanvas1);
		if (Static112.aClass31_35 != null) {
			Static112.aClass31_35.method2453(Static137.aCanvas1);
		}
		Static127.method2239();
		Static98.method1895();
		Static112.aClass31_35 = null;
		if (Static156.aClass41_2 != null) {
			Static156.aClass41_2.method2040();
		}
		if (Static43.aClass41_1 != null) {
			Static43.aClass41_1.method2040();
		}
		Static97.method1881();
		Static178.method3062();
		try {
			if (Static172.aClass56_5 != null) {
				Static172.aClass56_5.method1965();
			}
			if (Static109.aClass56Array1 != null) {
				for (@Pc(64) int local64 = 0; local64 < Static109.aClass56Array1.length; local64++) {
					if (Static109.aClass56Array1[local64] != null) {
						Static109.aClass56Array1[local64].method1965();
					}
				}
			}
			if (Static134.aClass56_4 != null) {
				Static134.aClass56_4.method1965();
			}
			if (Static50.aClass56_1 != null) {
				Static50.aClass56_1.method1965();
			}
		} catch (@Pc(92) IOException local92) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method473()) {
			return;
		}
		Static69.anInt1855 = Integer.parseInt(this.getParameter("worldid"));
		Static57.anInt1407 = Integer.parseInt(this.getParameter("modewhat"));
		Static89.anInt2298 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static30.method502();
		} else {
			Static96.method1859();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static94.aBoolean106 = true;
		} else {
			Static94.aBoolean106 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static88.method1748();
			Static3.aClass46_45 = Static154.aClass46_1497;
			Static64.anInt1688 = 1;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static41.anInt1061 = 1;
		} else {
			Static41.anInt1061 = 0;
		}
		try {
			Static38.anInt1004 = Integer.parseInt(this.getParameter("js"));
			Static142.anInt3317 = Integer.parseInt(this.getParameter("plug"));
			Static81.anInt2016 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(106) Exception local106) {
		}
		Static77.aClass46_738 = Static117.aClass46_1058.method1682(this);
		if (Static77.aClass46_738 == null) {
			Static77.aClass46_738 = Static3.aClass46_44;
		}
		Static57.aString1 = this.getCodeBase().getHost();
		this.method470(Static57.anInt1407 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method475() {
		Static142.anInt3325++;
		if (Static142.anInt3325 % 1000 == 1) {
			@Pc(18) GregorianCalendar local18 = new GregorianCalendar();
			Static137.anInt3251 = local18.get(11) * 600 + local18.get(12) * 10 + local18.get(13) / 6;
			Static39.aRandom1.setSeed((long) Static137.anInt3251);
		}
		this.method487();
		Static143.method2449();
		Static14.method267();
		Static6.method100();
		Static28.method496();
		Static154.method3129();
		if (Static112.aClass31_35 != null) {
			@Pc(65) int local65 = Static112.aClass31_35.method2452();
			Static71.anInt1856 = local65;
		}
		if (Static143.anInt3333 == 0) {
			this.method484();
			Static6.method101();
		} else if (Static143.anInt3333 == 5) {
			Static73.method1502(this);
			this.method484();
			Static6.method101();
		} else if (Static143.anInt3333 == 10) {
			Static73.method1502(this);
		} else if (Static143.anInt3333 == 20) {
			Static73.method1502(this);
			Static122.method2205();
		} else if (Static143.anInt3333 == 25) {
			Static24.method395();
		}
		if (Static143.anInt3333 == 30) {
			Static65.method1385();
		} else if (Static143.anInt3333 == 40) {
			Static122.method2205();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method484() {
		@Pc(14) int local14;
		if (Static17.anInt479 == 0) {
			Static121.method2178(Static112.anIntArrayArrayArray42);
			for (local14 = 0; local14 < 4; local14++) {
				Static29.aClass58Array1[local14] = new Class58(104, 104);
			}
			Static125.aClass4_Sub1_Sub7_Sub2_4 = new Class4_Sub1_Sub7_Sub2(512, 512);
			Static92.anInt2364 = 5;
			Static17.anInt479 = 20;
			Static3.aClass46_34 = Static174.aClass46_1426;
			return;
		}
		@Pc(51) int local51;
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(63) int local63;
		if (Static17.anInt479 == 20) {
			@Pc(49) int[] local49 = new int[9];
			for (local51 = 0; local51 < 9; local51++) {
				local59 = local51 * 32 + 143;
				local63 = Class4_Sub1_Sub7_Sub4.anIntArray412[local59];
				local69 = local59 * 3 + 600;
				local49[local51] = local69 * local63 >> 16;
			}
			Static66.method1451(local49);
			Static17.anInt479 = 30;
			Static3.aClass46_34 = Static35.aClass46_304;
			Static92.anInt2364 = 10;
		} else if (Static17.anInt479 == 30) {
			Static102.aClass62_Sub1_63 = Static121.method2177(0, true, true, false);
			Static15.aClass62_Sub1_14 = Static121.method2177(1, true, true, false);
			Static84.aClass62_Sub1_101 = Static121.method2177(2, true, false, true);
			Static76.aClass62_Sub1_95 = Static121.method2177(3, true, true, false);
			Static188.aClass62_Sub1_103 = Static121.method2177(4, true, true, false);
			Static160.aClass62_Sub1_88 = Static121.method2177(5, true, true, true);
			Static73.aClass62_Sub1_47 = Static121.method2177(6, false, true, true);
			Static25.aClass62_Sub1_20 = Static121.method2177(7, true, true, false);
			Static52.aClass62_Sub1_37 = Static121.method2177(8, true, true, false);
			Static28.aClass62_Sub1_22 = Static121.method2177(9, true, false, true);
			Static22.aClass62_Sub1_17 = Static121.method2177(10, true, true, false);
			Static111.aClass62_Sub1_65 = Static121.method2177(11, true, true, false);
			Static13.aClass62_Sub1_12 = Static121.method2177(12, true, true, false);
			Static175.aClass62_Sub1_94 = Static121.method2177(13, true, false, true);
			Static76.aClass62_Sub1_96 = Static121.method2177(14, false, true, false);
			Static15.aClass62_Sub1_13 = Static121.method2177(15, true, true, false);
			Static139.aClass62_Sub1_78 = Static121.method2177(16, true, true, false);
			Static176.aClass62_Sub1_98 = Static121.method2177(17, true, true, false);
			Static23.aClass62_Sub1_18 = Static121.method2177(18, true, true, false);
			Static10.aClass62_Sub1_9 = Static121.method2177(19, true, true, false);
			Static86.aClass62_Sub1_54 = Static121.method2177(20, true, true, false);
			Static112.aClass62_Sub1_102 = Static121.method2177(21, true, true, false);
			Static129.aClass62_Sub1_71 = Static121.method2177(22, true, true, false);
			Static92.anInt2364 = 20;
			Static3.aClass46_34 = Static99.aClass46_903;
			Static17.anInt479 = 40;
		} else if (Static17.anInt479 == 40) {
			local14 = Static102.aClass62_Sub1_63.method2883() * 4 / 100;
			@Pc(294) int local294 = local14 + Static15.aClass62_Sub1_14.method2883() * 4 / 100;
			@Pc(302) int local302 = local294 + Static84.aClass62_Sub1_101.method2883() / 100;
			@Pc(312) int local312 = local302 + Static76.aClass62_Sub1_95.method2883() * 2 / 100;
			@Pc(322) int local322 = local312 + Static188.aClass62_Sub1_103.method2883() * 6 / 100;
			@Pc(332) int local332 = local322 + Static160.aClass62_Sub1_88.method2883() * 4 / 100;
			@Pc(342) int local342 = local332 + Static73.aClass62_Sub1_47.method2883() * 2 / 100;
			@Pc(352) int local352 = local342 + Static25.aClass62_Sub1_20.method2883() * 54 / 100;
			@Pc(362) int local362 = local352 + Static52.aClass62_Sub1_37.method2883() * 2 / 100;
			@Pc(372) int local372 = local362 + Static28.aClass62_Sub1_22.method2883() * 2 / 100;
			@Pc(382) int local382 = local372 + Static22.aClass62_Sub1_17.method2883() * 2 / 100;
			@Pc(392) int local392 = local382 + Static111.aClass62_Sub1_65.method2883() * 2 / 100;
			@Pc(402) int local402 = local392 + Static13.aClass62_Sub1_12.method2883() * 2 / 100;
			@Pc(412) int local412 = local402 + Static175.aClass62_Sub1_94.method2883() * 2 / 100;
			@Pc(422) int local422 = local412 + Static76.aClass62_Sub1_96.method2883() * 2 / 100;
			@Pc(432) int local432 = local422 + Static15.aClass62_Sub1_13.method2883() * 2 / 100;
			@Pc(440) int local440 = local432 + Static139.aClass62_Sub1_78.method2883() / 100;
			@Pc(448) int local448 = local440 + Static176.aClass62_Sub1_98.method2883() / 100;
			@Pc(456) int local456 = local448 + Static23.aClass62_Sub1_18.method2883() / 100;
			@Pc(464) int local464 = local456 + Static10.aClass62_Sub1_9.method2883() / 100;
			@Pc(472) int local472 = local464 + Static86.aClass62_Sub1_54.method2883() / 100;
			@Pc(480) int local480 = local472 + Static112.aClass62_Sub1_102.method2883() / 100;
			@Pc(488) int local488 = local480 + Static129.aClass62_Sub1_71.method2883() / 100;
			if (local488 == 100) {
				Static92.anInt2364 = 30;
				Static3.aClass46_34 = Static167.aClass46_1364;
				Static60.method1150(Static73.aClass62_Sub1_47, Static22.aClass62_Sub1_17, Static52.aClass62_Sub1_37);
				Static17.anInt479 = 45;
			} else {
				if (local488 != 0) {
					Static3.aClass46_34 = Static69.method1482(new Class46[] { Static135.aClass46_1177, Static127.method2240(local488), Static101.aClass46_931 });
				}
				Static92.anInt2364 = 30;
			}
		} else if (Static17.anInt479 == 45) {
			Static170.method2912(!Static103.aBoolean113);
			@Pc(545) Class4_Sub2_Sub4 local545 = new Class4_Sub2_Sub4();
			local545.method2798();
			Static156.aClass41_2 = Static36.method639(Static137.aCanvas1, Static126.aClass76_4, 22050, 0);
			Static156.aClass41_2.method2037(local545);
			Static33.method567(local545, Static188.aClass62_Sub1_103, Static15.aClass62_Sub1_13, Static76.aClass62_Sub1_96);
			Static43.aClass41_1 = Static36.method639(Static137.aCanvas1, Static126.aClass76_4, 2048, 1);
			Static50.aClass4_Sub2_Sub1_1 = new Class4_Sub2_Sub1();
			Static43.aClass41_1.method2037(Static50.aClass4_Sub2_Sub1_1);
			Static60.aClass25_1 = new Class25(22050, Static154.anInt4087);
			Static3.aClass46_34 = Static176.aClass46_1449;
			Static92.anInt2364 = 35;
			Static17.anInt479 = 50;
		} else if (Static17.anInt479 == 50) {
			local51 = 0;
			if (Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7 == null) {
				Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7 = Static182.method3124(Static56.aClass46_1227, Static52.aClass62_Sub1_37, Static3.aClass46_44, Static175.aClass62_Sub1_94);
			} else {
				local51++;
			}
			if (Static33.aClass4_Sub1_Sub7_Sub1_Sub1_3 == null) {
				Static33.aClass4_Sub1_Sub7_Sub1_Sub1_3 = Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7;
			} else {
				local51++;
			}
			if (Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6 == null) {
				Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6 = Static182.method3124(Static30.aClass46_248, Static52.aClass62_Sub1_37, Static3.aClass46_44, Static175.aClass62_Sub1_94);
			} else {
				local51++;
			}
			if (Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5 == null) {
				Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5 = Static182.method3124(Static179.aClass46_1469, Static52.aClass62_Sub1_37, Static3.aClass46_44, Static175.aClass62_Sub1_94);
			} else {
				local51++;
			}
			if (local51 < 4) {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static153.aClass46_1301, Static127.method2240(local51 * 100 / 4), Static101.aClass46_931 });
				Static92.anInt2364 = 40;
			} else {
				Static92.anInt2364 = 40;
				Static17.anInt479 = 60;
				Static3.aClass46_34 = Static134.aClass46_1167;
			}
		} else if (Static17.anInt479 == 60) {
			local51 = Static77.method1562(Static52.aClass62_Sub1_37, Static22.aClass62_Sub1_17);
			local59 = Static41.method709();
			if (local59 > local51) {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static100.aClass46_915, Static127.method2240(local51 * 100 / local59), Static101.aClass46_931 });
				Static92.anInt2364 = 50;
			} else {
				Static3.aClass46_34 = Static4.aClass46_1040;
				Static17.anInt479 = 65;
				Static92.anInt2364 = 50;
			}
		} else if (Static17.anInt479 == 65) {
			Static92.anInt2364 = 50;
			Static3.aClass46_34 = Static25.aClass46_206;
			Static187.method3168(5);
			Static17.anInt479 = 70;
		} else if (Static17.anInt479 == 70) {
			Static84.aClass62_Sub1_101.method2869();
			local51 = Static84.aClass62_Sub1_101.method2867();
			Static139.aClass62_Sub1_78.method2869();
			local51 += Static139.aClass62_Sub1_78.method2867();
			Static176.aClass62_Sub1_98.method2869();
			local51 += Static176.aClass62_Sub1_98.method2867();
			Static23.aClass62_Sub1_18.method2869();
			local51 += Static23.aClass62_Sub1_18.method2867();
			Static10.aClass62_Sub1_9.method2869();
			local51 += Static10.aClass62_Sub1_9.method2867();
			Static86.aClass62_Sub1_54.method2869();
			local51 += Static86.aClass62_Sub1_54.method2867();
			Static112.aClass62_Sub1_102.method2869();
			local51 += Static112.aClass62_Sub1_102.method2867();
			Static129.aClass62_Sub1_71.method2869();
			local51 += Static129.aClass62_Sub1_71.method2867();
			if (local51 < 800) {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static97.aClass46_900, Static127.method2240(local51 / 8), Static101.aClass46_931 });
				Static92.anInt2364 = 60;
			} else {
				Static155.method2675(Static84.aClass62_Sub1_101);
				Static14.method265(Static84.aClass62_Sub1_101);
				Static8.method165(Static25.aClass62_Sub1_20, Static84.aClass62_Sub1_101);
				Static113.method2086(Static25.aClass62_Sub1_20, Static103.aBoolean113, Static139.aClass62_Sub1_78);
				Static13.method262(Static23.aClass62_Sub1_18, Static25.aClass62_Sub1_20);
				Static154.method3133(Static25.aClass62_Sub1_20, Static33.aClass4_Sub1_Sub7_Sub1_Sub1_3, Static94.aBoolean106, Static10.aClass62_Sub1_9);
				Static24.method398(Static15.aClass62_Sub1_14, Static86.aClass62_Sub1_54, Static102.aClass62_Sub1_63);
				Static52.method1026(Static25.aClass62_Sub1_20, Static112.aClass62_Sub1_102);
				Static159.method2691(Static129.aClass62_Sub1_71);
				Static56.method2455(Static84.aClass62_Sub1_101);
				Static53.method1030(Static52.aClass62_Sub1_37, Static175.aClass62_Sub1_94, Static76.aClass62_Sub1_95, Static25.aClass62_Sub1_20);
				Static96.method1857(Static84.aClass62_Sub1_101);
				Static166.method2758(Static176.aClass62_Sub1_98);
				Static92.anInt2364 = 60;
				Static3.aClass46_34 = Static163.aClass46_1375;
				Static83.method1640();
				Static17.anInt479 = 80;
			}
		} else if (Static17.anInt479 == 80) {
			local51 = 0;
			if (Static91.aClass4_Sub1_Sub7_Sub2_2 == null) {
				Static91.aClass4_Sub1_Sub7_Sub2_2 = Static26.method441(Static111.aClass46_1006, Static52.aClass62_Sub1_37, Static3.aClass46_44);
			} else {
				local51++;
			}
			if (Static61.aClass4_Sub1_Sub7_Sub3Array7 == null) {
				Static61.aClass4_Sub1_Sub7_Sub3Array7 = Static113.method2087(Static3.aClass46_44, Static52.aClass62_Sub1_37, Static50.aClass46_486);
			} else {
				local51++;
			}
			if (Static63.aClass4_Sub1_Sub7_Sub2Array5 == null) {
				Static63.aClass4_Sub1_Sub7_Sub2Array5 = Static39.method691(Static3.aClass46_44, Static147.aClass46_225, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static5.aClass4_Sub1_Sub7_Sub2Array1 == null) {
				Static5.aClass4_Sub1_Sub7_Sub2Array1 = Static39.method691(Static3.aClass46_44, Static105.aClass46_952, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static82.aClass4_Sub1_Sub7_Sub2Array6 == null) {
				Static82.aClass4_Sub1_Sub7_Sub2Array6 = Static39.method691(Static3.aClass46_44, Static143.aClass46_1222, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static109.aClass4_Sub1_Sub7_Sub2Array9 == null) {
				Static109.aClass4_Sub1_Sub7_Sub2Array9 = Static39.method691(Static3.aClass46_44, Static102.aClass46_939, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static186.aClass4_Sub1_Sub7_Sub2Array12 == null) {
				Static186.aClass4_Sub1_Sub7_Sub2Array12 = Static39.method691(Static3.aClass46_44, Static94.aClass46_875, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static98.aClass4_Sub1_Sub7_Sub2Array8 == null) {
				Static98.aClass4_Sub1_Sub7_Sub2Array8 = Static39.method691(Static3.aClass46_44, Static66.aClass46_690, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static41.aClass4_Sub1_Sub7_Sub2Array3 == null) {
				Static41.aClass4_Sub1_Sub7_Sub2Array3 = Static39.method691(Static3.aClass46_44, Static45.aClass46_402, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static185.aClass4_Sub1_Sub7_Sub2_7 == null) {
				Static185.aClass4_Sub1_Sub7_Sub2_7 = Static26.method441(Static116.aClass46_1047, Static52.aClass62_Sub1_37, Static3.aClass46_44);
			} else {
				local51++;
			}
			if (Static139.aClass4_Sub1_Sub7_Sub2Array10 == null) {
				Static139.aClass4_Sub1_Sub7_Sub2Array10 = Static39.method691(Static3.aClass46_44, Static118.aClass46_1062, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static33.aClass4_Sub1_Sub7_Sub2Array2 == null) {
				Static33.aClass4_Sub1_Sub7_Sub2Array2 = Static39.method691(Static3.aClass46_44, Static156.aClass46_1305, Static52.aClass62_Sub1_37);
			} else {
				local51++;
			}
			if (Static9.aClass4_Sub1_Sub7_Sub3Array1 == null) {
				Static9.aClass4_Sub1_Sub7_Sub3Array1 = Static113.method2087(Static3.aClass46_44, Static52.aClass62_Sub1_37, Static3.aClass46_30);
			} else {
				local51++;
			}
			if (Static102.aClass4_Sub1_Sub7_Sub3Array11 == null) {
				Static102.aClass4_Sub1_Sub7_Sub3Array11 = Static113.method2087(Static3.aClass46_44, Static52.aClass62_Sub1_37, Static14.aClass46_156);
			} else {
				local51++;
			}
			if (Static11.aClass4_Sub1_Sub7_Sub3Array2 == null) {
				Static11.aClass4_Sub1_Sub7_Sub3Array2 = Static113.method2087(Static3.aClass46_44, Static52.aClass62_Sub1_37, Static151.aClass46_1274);
			} else {
				local51++;
			}
			if (local51 < 15) {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static143.aClass46_1224, Static127.method2240(local51 * 100 / 13), Static101.aClass46_931 });
				Static92.anInt2364 = 70;
			} else {
				Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7.method910(Static102.aClass4_Sub1_Sub7_Sub3Array11, null);
				Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6.method910(Static102.aClass4_Sub1_Sub7_Sub3Array11, null);
				Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5.method910(Static102.aClass4_Sub1_Sub7_Sub3Array11, null);
				if (Static33.aClass4_Sub1_Sub7_Sub1_Sub1_3 != Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7) {
					Static33.aClass4_Sub1_Sub7_Sub1_Sub1_3.method910(Static102.aClass4_Sub1_Sub7_Sub3Array11, null);
				}
				for (local59 = 0; local59 < Static41.aClass4_Sub1_Sub7_Sub2Array3.length; local59++) {
					Static41.aClass4_Sub1_Sub7_Sub2Array3[local59].method2546();
				}
				for (local69 = 0; local69 < Static11.aClass4_Sub1_Sub7_Sub3Array2.length; local69++) {
					Static11.aClass4_Sub1_Sub7_Sub3Array2[local69].method2644();
				}
				local63 = (int) (Math.random() * 21.0D) - 10;
				Static91.aClass4_Sub1_Sub7_Sub2_2.method2546();
				@Pc(1197) int local1197 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1204) int local1204 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1211) int local1211 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(1213) int local1213 = 0; local1213 < Static63.aClass4_Sub1_Sub7_Sub2Array5.length; local1213++) {
					Static63.aClass4_Sub1_Sub7_Sub2Array5[local1213].method2551(local1211 + local63, local1211 + local1197, local1211 + local1204);
				}
				Static61.aClass4_Sub1_Sub7_Sub3Array7[0].method2639(local1211 + local63, local1197 + local1211, local1211 + local1204);
				Static3.aClass46_34 = Static176.aClass46_1446;
				Static92.anInt2364 = 70;
				Static17.anInt479 = 90;
			}
		} else if (Static17.anInt479 == 90) {
			if (Static28.aClass62_Sub1_22.method2869()) {
				@Pc(1296) Class15 local1296 = new Class15(Static28.aClass62_Sub1_22, Static52.aClass62_Sub1_37, 20, Static103.aBoolean113 ? 64 : 128);
				Static171.method2954(local1296);
				Static171.method2963(0.7F);
				Static3.aClass46_34 = Static164.aClass46_1338;
				Static92.anInt2364 = 90;
				Static17.anInt479 = 110;
			} else {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static3.aClass46_42, Static127.method2240(Static28.aClass62_Sub1_22.method2867()), Static101.aClass46_931 });
				Static92.anInt2364 = 90;
			}
		} else if (Static17.anInt479 == 110) {
			Static114.aClass5_1 = new Class5();
			Static126.aClass76_4.method2566(Static114.aClass5_1, 10);
			Static17.anInt479 = 120;
			Static3.aClass46_34 = Static92.aClass46_854;
			Static92.anInt2364 = 94;
		} else if (Static17.anInt479 == 120) {
			if (Static22.aClass62_Sub1_17.method2855(Static158.aClass46_1309, Static3.aClass46_44)) {
				@Pc(1365) Class82 local1365 = new Class82(Static22.aClass62_Sub1_17.method2862(Static158.aClass46_1309, Static3.aClass46_44));
				Static95.method2236(local1365);
				Static17.anInt479 = 130;
				Static92.anInt2364 = 96;
				Static3.aClass46_34 = Static67.aClass46_698;
			} else {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static166.aClass46_1352, Static46.aClass46_470 });
				Static92.anInt2364 = 96;
			}
		} else if (Static17.anInt479 == 130) {
			if (!Static76.aClass62_Sub1_95.method2869()) {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static110.aClass46_993, Static127.method2240(Static76.aClass62_Sub1_95.method2867() * 4 / 5), Static101.aClass46_931 });
				Static92.anInt2364 = 100;
			} else if (!Static13.aClass62_Sub1_12.method2869()) {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static110.aClass46_993, Static127.method2240(Static13.aClass62_Sub1_12.method2867() / 6 + 80), Static101.aClass46_931 });
				Static92.anInt2364 = 100;
			} else if (Static175.aClass62_Sub1_94.method2869()) {
				Static92.anInt2364 = 100;
				Static3.aClass46_34 = Static57.aClass46_545;
				Static17.anInt479 = 140;
			} else {
				Static3.aClass46_34 = Static69.method1482(new Class46[] { Static110.aClass46_993, Static127.method2240(Static175.aClass62_Sub1_94.method2867() / 20 + 96), Static101.aClass46_931 });
				Static92.anInt2364 = 100;
			}
		} else if (Static17.anInt479 == 140) {
			Static160.aClass62_Sub1_88.method2854(false);
			Static73.aClass62_Sub1_47.method2854(true);
			Static52.aClass62_Sub1_37.method2854(true);
			Static175.aClass62_Sub1_94.method2854(true);
			Static22.aClass62_Sub1_17.method2854(true);
			Static187.method3168(10);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method486(@OriginalArg(1) int arg0) {
		Static136.aClass84_5 = null;
		Static15.aClass27_1 = null;
		if (Static93.anInt2386 == Static121.anInt2925) {
			Static121.anInt2925 = Static144.anInt3350;
		} else {
			Static121.anInt2925 = Static93.anInt2386;
		}
		Static144.anInt3352 = 0;
		Static3.anInt87++;
		if (Static3.anInt87 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static143.anInt3333 > 5) {
				Static166.anInt3646 = 3000;
			} else {
				this.method474("js5connect_full");
				Static143.anInt3333 = 1000;
			}
		} else if (Static3.anInt87 >= 2 && arg0 == 6) {
			this.method474("js5connect_outofdate");
			Static143.anInt3333 = 1000;
		} else if (Static3.anInt87 >= 4) {
			if (Static143.anInt3333 > 5) {
				Static166.anInt3646 = 3000;
			} else {
				this.method474("js5connect");
				Static143.anInt3333 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method476() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method469() {
		if (Static41.anInt1061 == 1) {
			Static36.aShortArrayArray3 = Static26.aShortArrayArray2;
			Static79.aShortArray20 = Static148.aShortArray44;
			Static106.aShortArray32 = Static86.aShortArray21;
			Static181.aShortArrayArray7 = Static17.aShortArrayArray1;
		} else {
			Static79.aShortArray20 = Static39.aShortArray7;
			Static181.aShortArrayArray7 = Static48.aShortArrayArray4;
			Static36.aShortArrayArray3 = Static120.aShortArrayArray6;
			Static106.aShortArray32 = Static93.aShortArray26;
		}
		Static93.anInt2386 = Static89.anInt2298 == 0 ? 43594 : Static69.anInt1855 + 40000;
		Static121.anInt2925 = Static93.anInt2386;
		Static144.anInt3350 = Static89.anInt2298 == 0 ? 443 : Static69.anInt1855 + 50000;
		Static114.method2091();
		Static152.method2601(Static137.aCanvas1);
		Static129.method2285(Static137.aCanvas1);
		Static112.aClass31_35 = Static5.method94();
		if (Static112.aClass31_35 != null) {
			Static112.aClass31_35.method2451(Static137.aCanvas1);
		}
		Static60.anInt1483 = Static150.anInt3416;
		try {
			if (Static126.aClass76_4.aClass51_4 != null) {
				Static172.aClass56_5 = new Class56(Static126.aClass76_4.aClass51_4, 5200, 0);
				for (@Pc(90) int local90 = 0; local90 < 23; local90++) {
					Static109.aClass56Array1[local90] = new Class56(Static126.aClass76_4.aClass51Array1[local90], 6000, 0);
				}
				Static134.aClass56_4 = new Class56(Static126.aClass76_4.aClass51_2, 6000, 0);
				Static42.aClass52_1 = new Class52(255, Static172.aClass56_5, Static134.aClass56_4, 500000);
				Static50.aClass56_1 = new Class56(Static126.aClass76_4.aClass51_3, 24, 0);
				Static126.aClass76_4.aClass51_2 = null;
				Static126.aClass76_4.aClass51_3 = null;
				Static126.aClass76_4.aClass51_4 = null;
				Static126.aClass76_4.aClass51Array1 = null;
			}
		} catch (@Pc(148) IOException local148) {
			Static42.aClass52_1 = null;
			Static172.aClass56_5 = null;
			Static50.aClass56_1 = null;
			Static134.aClass56_4 = null;
		}
		if (Static89.anInt2298 != 0) {
			Static26.aBoolean31 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method487() {
		if (Static143.anInt3333 != 1000) {
			@Pc(18) boolean local18 = Static146.method2484();
			if (!local18) {
				this.method488();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method488() {
		if (Static68.anInt1843 >= 4) {
			this.method474("js5crc");
			Static143.anInt3333 = 1000;
			return;
		}
		if (Static39.anInt1037 >= 4) {
			if (Static143.anInt3333 <= 5) {
				this.method474("js5io");
				Static143.anInt3333 = 1000;
				return;
			}
			Static166.anInt3646 = 3000;
			Static39.anInt1037 = 3;
		}
		if (Static166.anInt3646-- > 0) {
			return;
		}
		try {
			if (Static144.anInt3352 == 0) {
				Static136.aClass84_5 = Static126.aClass76_4.method2564(Static57.aString1, Static121.anInt2925);
				Static144.anInt3352++;
			}
			if (Static144.anInt3352 == 1) {
				if (Static136.aClass84_5.anInt3578 == 2) {
					this.method486(-1);
					return;
				}
				if (Static136.aClass84_5.anInt3578 == 1) {
					Static144.anInt3352++;
				}
			}
			if (Static144.anInt3352 == 2) {
				Static15.aClass27_1 = new Class27((Socket) Static136.aClass84_5.anObject4, Static126.aClass76_4);
				@Pc(108) Class4_Sub11 local108 = new Class4_Sub11(5);
				local108.method1238(15);
				local108.method1256(488);
				Static15.aClass27_1.method957(local108.aByteArray19, 5);
				Static144.anInt3352++;
				Static38.aLong31 = Static149.method2559();
			}
			if (Static144.anInt3352 == 3) {
				if (Static143.anInt3333 <= 5 || Static15.aClass27_1.method959() > 0) {
					@Pc(144) int local144 = Static15.aClass27_1.method954();
					if (local144 != 0) {
						this.method486(local144);
						return;
					}
					Static144.anInt3352++;
				} else if (Static149.method2559() - Static38.aLong31 > 30000L) {
					this.method486(-2);
					return;
				}
			}
			if (Static144.anInt3352 == 4) {
				Static175.method3010(Static143.anInt3333 > 20, Static15.aClass27_1);
				Static15.aClass27_1 = null;
				Static144.anInt3352 = 0;
				Static136.aClass84_5 = null;
				Static3.anInt87 = 0;
			}
		} catch (@Pc(197) IOException local197) {
			this.method486(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method467() {
		@Pc(8) boolean local8 = Static155.method2673();
		if (local8 && Static106.aBoolean114 && Static156.aClass41_2 != null) {
			Static156.aClass41_2.method2038();
		}
		if (Static63.aBoolean72) {
			Static17.method304(Static137.aCanvas1);
			Static143.method2447(Static137.aCanvas1);
			if (Static112.aClass31_35 != null) {
				Static112.aClass31_35.method2453(Static137.aCanvas1);
			}
			this.method472();
			Static152.method2601(Static137.aCanvas1);
			Static129.method2285(Static137.aCanvas1);
			if (Static112.aClass31_35 != null) {
				Static112.aClass31_35.method2451(Static137.aCanvas1);
			}
		}
		if (Static143.anInt3333 == 0) {
			Static26.method440(null, Static3.aClass46_34, Static92.anInt2364);
		} else if (Static143.anInt3333 == 5) {
			Static139.method2396(Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7, Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5);
		} else if (Static143.anInt3333 == 10) {
			Static139.method2396(Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7, Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5);
		} else if (Static143.anInt3333 == 20) {
			Static139.method2396(Static160.aClass4_Sub1_Sub7_Sub1_Sub1_7, Static4.aClass4_Sub1_Sub7_Sub1_Sub1_5);
		} else if (Static143.anInt3333 == 25) {
			@Pc(114) int local114;
			if (Static46.anInt1215 == 1) {
				if (Static59.anInt1453 > Static121.anInt2922) {
					Static121.anInt2922 = Static59.anInt1453;
				}
				local114 = (Static121.anInt2922 - Static59.anInt1453) * 50 / Static121.anInt2922;
				Static13.method264(false, Static69.method1482(new Class46[] { Static128.aClass46_1117, Static122.aClass46_1085, Static127.method2240(local114), Static135.aClass46_1178 }));
			} else if (Static46.anInt1215 == 2) {
				if (Static184.anInt4142 < Static25.anInt617) {
					Static184.anInt4142 = Static25.anInt617;
				}
				local114 = (Static184.anInt4142 - Static25.anInt617) * 50 / Static184.anInt4142 + 50;
				Static13.method264(false, Static69.method1482(new Class46[] { Static128.aClass46_1117, Static122.aClass46_1085, Static127.method2240(local114), Static135.aClass46_1178 }));
			} else {
				Static13.method264(false, Static128.aClass46_1117);
			}
		} else if (Static143.anInt3333 == 30) {
			Static56.method2450();
		} else if (Static143.anInt3333 == 40) {
			Static13.method264(false, Static69.method1482(new Class46[] { Static42.aClass46_367, Static23.aClass46_194, Static68.aClass46_704 }));
		}
		@Pc(272) int local272;
		@Pc(262) Graphics local262;
		if (Static143.anInt3333 == 30 && Static127.anInt3025 == 0 && !Static9.aBoolean19) {
			try {
				local262 = Static137.aCanvas1.getGraphics();
				for (local272 = 0; local272 < Static59.anInt1457; local272++) {
					if (Static38.aBooleanArray5[local272]) {
						Static69.aClass42_1.method3021(Static121.anIntArray275[local272], Static66.anIntArray165[local272], local262, Static180.anIntArray432[local272], Static167.anIntArray362[local272]);
						Static38.aBooleanArray5[local272] = false;
					}
				}
			} catch (@Pc(328) Exception local328) {
				Static137.aCanvas1.repaint();
			}
		} else if (Static143.anInt3333 > 0) {
			try {
				local262 = Static137.aCanvas1.getGraphics();
				Static69.aClass42_1.method3018(local262);
				Static9.aBoolean19 = false;
				for (local272 = 0; local272 < Static59.anInt1457; local272++) {
					Static38.aBooleanArray5[local272] = false;
				}
			} catch (@Pc(284) Exception local284) {
				Static137.aCanvas1.repaint();
			}
		}
	}
}
