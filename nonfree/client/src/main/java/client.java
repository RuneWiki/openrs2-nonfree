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
				Static100.method1723();
			}
			Static26.anInt662 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static101.anInt2449 = 0;
			} else if (arg0[1].equals("office")) {
				Static101.anInt2449 = 1;
			} else if (arg0[1].equals("local")) {
				Static101.anInt2449 = 2;
			} else {
				Static100.method1723();
			}
			if (arg0[2].equals("live")) {
				Static124.anInt2953 = 0;
			} else if (arg0[2].equals("rc")) {
				Static124.anInt2953 = 1;
			} else if (arg0[2].equals("wip")) {
				Static124.anInt2953 = 2;
			} else {
				Static100.method1723();
			}
			if (arg0[3].equals("lowmem")) {
				Static57.method1121();
			} else if (arg0[3].equals("highmem")) {
				Static57.method1120();
			} else {
				Static100.method1723();
			}
			if (arg0[4].equals("free")) {
				Static60.aBoolean291 = false;
			} else if (arg0[4].equals("members")) {
				Static60.aBoolean291 = true;
			} else {
				Static100.method1723();
			}
			if (arg0[5].equals("english")) {
				Static111.anInt2675 = 0;
			} else if (arg0[5].equals("german")) {
				Static98.method1685();
				Static111.anInt2675 = 1;
			} else {
				Static100.method1723();
			}
			if (arg0[6].equals("game0")) {
				Static43.anInt1295 = 0;
			} else if (arg0[6].equals("game1")) {
				Static43.anInt1295 = 1;
			} else {
				Static100.method1723();
			}
			Static4.anInt108 = 0;
			Static193.aClass41_1043 = Static156.aClass41_981;
			Static83.aString3 = "127.0.0.1";
			@Pc(182) client local182 = new client();
			local182.method589(Static124.anInt2953 + 32, "runescape");
			Static177.aFrame1.setLocation(40, 40);
		} catch (@Pc(199) Exception local199) {
			Static196.method3064(null, local199);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method601() {
		if (Static136.anInt3164 >= 4) {
			this.method592("js5crc");
			Static203.anInt4533 = 1000;
			return;
		}
		if (Static67.anInt1762 >= 4) {
			if (Static203.anInt4533 <= 5) {
				this.method592("js5io");
				Static203.anInt4533 = 1000;
				return;
			}
			Static67.anInt1762 = 3;
			Static147.anInt3349 = 3000;
		}
		if (Static147.anInt3349-- > 0) {
			return;
		}
		try {
			if (Static216.anInt4756 == 0) {
				Static56.aClass75_3 = Static111.aClass83_2.method2619(Static83.aString3, Static151.anInt3442);
				Static216.anInt4756++;
			}
			if (Static216.anInt4756 == 1) {
				if (Static56.aClass75_3.anInt3346 == 2) {
					this.method604(-1);
					return;
				}
				if (Static56.aClass75_3.anInt3346 == 1) {
					Static216.anInt4756++;
				}
			}
			if (Static216.anInt4756 == 2) {
				Static168.aClass63_3 = new Class63((Socket) Static56.aClass75_3.anObject3, Static111.aClass83_2);
				@Pc(100) Class2_Sub3 local100 = new Class2_Sub3(5);
				local100.method208(15);
				local100.method200(500);
				Static168.aClass63_3.method2037(5, local100.aByteArray4);
				Static216.anInt4756++;
				Static88.aLong66 = Static182.method2903();
			}
			if (Static216.anInt4756 == 3) {
				if (Static203.anInt4533 <= 5 || Static168.aClass63_3.method2035() > 0) {
					@Pc(157) int local157 = Static168.aClass63_3.method2042();
					if (local157 != 0) {
						this.method604(local157);
						return;
					}
					Static216.anInt4756++;
				} else if (Static182.method2903() - Static88.aLong66 > 30000L) {
					this.method604(-2);
					return;
				}
			}
			if (Static216.anInt4756 == 4) {
				Static70.method1286(Static203.anInt4533 > 20, Static168.aClass63_3);
				Static216.anInt4756 = 0;
				Static105.anInt2538 = 0;
				Static56.aClass75_3 = null;
				Static168.aClass63_3 = null;
			}
		} catch (@Pc(190) IOException local190) {
			this.method604(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method590() {
		Static103.aShortArray72 = Static106.aShortArray75 = Static6.aShortArray9 = Static95.aShortArray67 = new short[256];
		if (Static43.anInt1295 == 1) {
			Static6.aShortArrayArray1 = Static86.aShortArrayArray4;
			Static76.aShortArrayArray3 = Static178.aShortArrayArray6;
			Static131.aShortArray90 = Static62.aShortArray43;
			Static13.aShortArray12 = Static178.aShortArray135;
		} else {
			Static13.aShortArray12 = Static184.aShortArray140;
			Static131.aShortArray90 = Static77.aShortArray58;
			Static6.aShortArrayArray1 = Static192.aShortArrayArray7;
			Static76.aShortArrayArray3 = Static126.aShortArrayArray5;
		}
		Static195.anInt4421 = Static101.anInt2449 == 0 ? 43594 : Static26.anInt662 + 40000;
		Static45.anInt1335 = Static101.anInt2449 == 0 ? 443 : Static26.anInt662 + 50000;
		Static151.anInt3442 = Static195.anInt4421;
		Static180.method2876();
		Static128.method2080(Static139.aCanvas1);
		Static95.method1659(Static139.aCanvas1);
		Static150.aClass19_1 = Static33.method656();
		if (Static150.aClass19_1 != null) {
			Static150.aClass19_1.method1630(Static139.aCanvas1);
		}
		Static47.anInt1370 = Static162.anInt3783;
		try {
			if (Static111.aClass83_2.aClass34_4 != null) {
				Static17.aClass56_1 = new Class56(Static111.aClass83_2.aClass34_4, 5200, 0);
				for (@Pc(97) int local97 = 0; local97 < 27; local97++) {
					Static218.aClass56Array1[local97] = new Class56(Static111.aClass83_2.aClass34Array1[local97], 6000, 0);
				}
				Static91.aClass56_2 = new Class56(Static111.aClass83_2.aClass34_2, 6000, 0);
				Static150.aClass96_4 = new Class96(255, Static17.aClass56_1, Static91.aClass56_2, 500000);
				Static157.aClass56_3 = new Class56(Static111.aClass83_2.aClass34_3, 24, 0);
				Static111.aClass83_2.aClass34Array1 = null;
				Static111.aClass83_2.aClass34_2 = null;
				Static111.aClass83_2.aClass34_3 = null;
				Static111.aClass83_2.aClass34_4 = null;
			}
		} catch (@Pc(153) IOException local153) {
			Static91.aClass56_2 = null;
			Static17.aClass56_1 = null;
			Static157.aClass56_3 = null;
			Static150.aClass96_4 = null;
		}
		Static132.aClass41_846 = Static117.aClass41_803;
		if (Static101.anInt2449 != 0) {
			Static133.aBoolean166 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method596()) {
			return;
		}
		Static26.anInt662 = Integer.parseInt(this.getParameter("worldid"));
		Static124.anInt2953 = Integer.parseInt(this.getParameter("modewhat"));
		Static101.anInt2449 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static57.method1121();
		} else {
			Static57.method1120();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static60.aBoolean291 = true;
		} else {
			Static60.aBoolean291 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static98.method1685();
			Static111.anInt2675 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static43.anInt1295 = 1;
		} else {
			Static43.anInt1295 = 0;
		}
		try {
			Static62.anInt1676 = Integer.parseInt(this.getParameter("js"));
			Static128.anInt2993 = Integer.parseInt(this.getParameter("plug"));
			Static4.anInt108 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static193.aClass41_1043 = Static95.aClass41_699.method1397(this);
		if (Static193.aClass41_1043 == null) {
			Static193.aClass41_1043 = Static156.aClass41_981;
		}
		Static83.aString3 = this.getCodeBase().getHost();
		this.method600(Static124.anInt2953 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method604(@OriginalArg(0) int arg0) {
		Static56.aClass75_3 = null;
		Static216.anInt4756 = 0;
		Static168.aClass63_3 = null;
		Static105.anInt2538++;
		if (Static151.anInt3442 == Static195.anInt4421) {
			Static151.anInt3442 = Static45.anInt1335;
		} else {
			Static151.anInt3442 = Static195.anInt4421;
		}
		if (Static105.anInt2538 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static203.anInt4533 > 5) {
				Static147.anInt3349 = 3000;
			} else {
				this.method592("js5connect_full");
				Static203.anInt4533 = 1000;
			}
		} else if (Static105.anInt2538 >= 2 && arg0 == 6) {
			this.method592("js5connect_outofdate");
			Static203.anInt4533 = 1000;
		} else if (Static105.anInt2538 >= 4) {
			if (Static203.anInt4533 <= 5) {
				this.method592("js5connect");
				Static203.anInt4533 = 1000;
			} else {
				Static147.anInt3349 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method594() {
		if (Static194.aClass26_2 != null) {
			Static194.aClass26_2.aBoolean53 = false;
		}
		Static194.aClass26_2 = null;
		if (Static30.aClass63_1 != null) {
			Static30.aClass63_1.method2043();
			Static30.aClass63_1 = null;
		}
		Static106.method1814(Static139.aCanvas1);
		Static102.method1756(Static139.aCanvas1);
		if (Static150.aClass19_1 != null) {
			Static150.aClass19_1.method1634(Static139.aCanvas1);
		}
		Static131.method2087();
		Static43.method904();
		Static150.aClass19_1 = null;
		if (Static25.aClass31_7 != null) {
			Static25.aClass31_7.method1501();
		}
		if (Static100.aClass31_4 != null) {
			Static100.aClass31_4.method1501();
		}
		Static41.method882();
		Static209.method3231();
		try {
			if (Static17.aClass56_1 != null) {
				Static17.aClass56_1.method1793();
			}
			if (Static218.aClass56Array1 != null) {
				for (@Pc(66) int local66 = 0; local66 < Static218.aClass56Array1.length; local66++) {
					if (Static218.aClass56Array1[local66] != null) {
						Static218.aClass56Array1[local66].method1793();
					}
				}
			}
			if (Static91.aClass56_2 != null) {
				Static91.aClass56_2.method1793();
			}
			if (Static157.aClass56_3 != null) {
				Static157.aClass56_3.method1793();
			}
		} catch (@Pc(94) IOException local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method605() {
		@Pc(19) int local19;
		if (Static29.anInt698 == 0) {
			@Pc(9) Runtime local9 = Runtime.getRuntime();
			local19 = (int) ((local9.totalMemory() - local9.freeMemory()) / 1024L);
			@Pc(22) long local22 = Static182.method2903();
			if (Static1.aLong118 == 0L) {
				Static1.aLong118 = local22;
			}
			if (local19 > 16384 && local22 - Static1.aLong118 < 5000L) {
				if (local22 - Static157.aLong113 > 1000L) {
					System.gc();
					Static157.aLong113 = local22;
				}
				Static5.anInt284 = 5;
				Static185.aClass41_1116 = Static53.aClass41_440;
			} else {
				Static29.anInt698 = 10;
				Static5.anInt284 = 5;
				Static185.aClass41_1116 = Static159.aClass41_999;
			}
			return;
		}
		@Pc(78) int local78;
		if (Static29.anInt698 == 10) {
			Static160.method2589();
			for (local78 = 0; local78 < 4; local78++) {
				Static149.aClass42Array1[local78] = new Class42(104, 104);
			}
			Static5.anInt284 = 10;
			Static185.aClass41_1116 = Static9.aClass41_66;
			Static29.anInt698 = 30;
		} else if (Static29.anInt698 == 30) {
			Static60.aClass15_Sub1_138 = Static85.method1529(0, true, true, false);
			Static198.aClass15_Sub1_122 = Static85.method1529(1, true, true, false);
			Static74.aClass15_Sub1_48 = Static85.method1529(2, true, false, true);
			Static78.aClass15_Sub1_49 = Static85.method1529(3, true, true, false);
			Static11.aClass15_Sub1_12 = Static85.method1529(4, true, true, false);
			Static25.aClass15_Sub1_137 = Static85.method1529(5, true, true, true);
			Static86.aClass15_Sub1_57 = Static85.method1529(6, false, true, true);
			Static207.aClass15_Sub1_130 = Static85.method1529(7, true, true, false);
			Static200.aClass15_Sub1_125 = Static85.method1529(8, true, true, false);
			Static59.aClass15_Sub1_40 = Static85.method1529(9, true, true, false);
			Static8.aClass15_Sub1_10 = Static85.method1529(10, true, true, false);
			Static118.aClass15_Sub1_75 = Static85.method1529(11, true, true, false);
			Static17.aClass15_Sub1_15 = Static85.method1529(12, true, true, false);
			Static85.aClass15_Sub1_56 = Static85.method1529(13, true, true, false);
			Static17.aClass15_Sub1_14 = Static85.method1529(14, false, true, false);
			Static132.aClass15_Sub1_79 = Static85.method1529(15, true, true, false);
			Static95.aClass15_Sub1_62 = Static85.method1529(16, true, true, false);
			Static168.aClass15_Sub1_103 = Static85.method1529(17, true, true, false);
			Static146.aClass15_Sub1_88 = Static85.method1529(18, true, true, false);
			Static220.aClass15_Sub1_139 = Static85.method1529(19, true, true, false);
			Static173.aClass15_Sub1_109 = Static85.method1529(20, true, true, false);
			Static16.aClass15_Sub1_13 = Static85.method1529(21, true, true, false);
			Static211.aClass15_Sub1_134 = Static85.method1529(22, true, true, false);
			Static115.aClass15_Sub1_105 = Static85.method1529(23, true, true, true);
			Static18.aClass15_Sub1_17 = Static85.method1529(24, true, true, false);
			Static179.aClass15_Sub1_111 = Static85.method1529(25, true, true, false);
			Static140.aClass15_Sub1_85 = Static85.method1529(26, true, true, true);
			Static29.anInt698 = 40;
			Static5.anInt284 = 15;
			Static185.aClass41_1116 = Static61.aClass41_479;
		} else if (Static29.anInt698 == 40) {
			local78 = Static60.aClass15_Sub1_138.method429() * 4 / 100;
			local78 += Static198.aClass15_Sub1_122.method429() * 4 / 100;
			local78 += Static74.aClass15_Sub1_48.method429() / 100;
			local78 += Static78.aClass15_Sub1_49.method429() * 2 / 100;
			local78 += Static11.aClass15_Sub1_12.method429() * 6 / 100;
			local78 += Static25.aClass15_Sub1_137.method429() * 4 / 100;
			local78 += Static86.aClass15_Sub1_57.method429() * 2 / 100;
			local78 += Static207.aClass15_Sub1_130.method429() * 50 / 100;
			local78 += Static200.aClass15_Sub1_125.method429() * 2 / 100;
			local78 += Static59.aClass15_Sub1_40.method429() * 2 / 100;
			local78 += Static8.aClass15_Sub1_10.method429() * 2 / 100;
			local78 += Static118.aClass15_Sub1_75.method429() * 2 / 100;
			local78 += Static17.aClass15_Sub1_15.method429() * 2 / 100;
			local78 += Static85.aClass15_Sub1_56.method429() * 2 / 100;
			local78 += Static17.aClass15_Sub1_14.method429() * 2 / 100;
			local78 += Static132.aClass15_Sub1_79.method429() * 2 / 100;
			local78 += Static95.aClass15_Sub1_62.method429() / 100;
			local78 += Static168.aClass15_Sub1_103.method429() / 100;
			local78 += Static146.aClass15_Sub1_88.method429() / 100;
			local78 += Static220.aClass15_Sub1_139.method429() / 100;
			local78 += Static173.aClass15_Sub1_109.method429() / 100;
			local78 += Static16.aClass15_Sub1_13.method429() / 100;
			local78 += Static211.aClass15_Sub1_134.method429() / 100;
			local78 += Static115.aClass15_Sub1_105.method429() / 100;
			local78 += Static18.aClass15_Sub1_17.method429() / 100;
			local78 += Static179.aClass15_Sub1_111.method429() / 100;
			local78 += Static140.aClass15_Sub1_85.method429() / 100;
			if (local78 == 100) {
				Static5.anInt284 = 20;
				Static185.aClass41_1116 = Static219.aClass41_1284;
				Static137.method2189(Static86.aClass15_Sub1_57, Static8.aClass15_Sub1_10, Static200.aClass15_Sub1_125);
				Static29.anInt698 = 45;
			} else {
				if (local78 != 0) {
					Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static13.aClass41_82, Static152.method2471(local78), Static134.aClass41_859 });
				}
				Static5.anInt284 = 20;
			}
		} else if (Static29.anInt698 == 45) {
			Static40.method858(!Static217.aBoolean290);
			@Pc(613) Class2_Sub6_Sub3 local613 = new Class2_Sub6_Sub3();
			local613.method2468();
			Static25.aClass31_7 = Static195.method3059(0, Static139.aCanvas1, Static111.aClass83_2, 22050);
			Static25.aClass31_7.method1509(local613);
			Static148.method2318(Static17.aClass15_Sub1_14, local613, Static11.aClass15_Sub1_12, Static132.aClass15_Sub1_79);
			Static100.aClass31_4 = Static195.method3059(1, Static139.aCanvas1, Static111.aClass83_2, 2048);
			Static200.aClass2_Sub6_Sub4_2 = new Class2_Sub6_Sub4();
			Static100.aClass31_4.method1509(Static200.aClass2_Sub6_Sub4_2);
			Static103.aClass82_1 = new Class82(22050, Static10.anInt374);
			Static29.anInt698 = 50;
			Static185.aClass41_1116 = Static28.aClass41_191;
			Static5.anInt284 = 30;
		} else if (Static29.anInt698 == 50) {
			local78 = 0;
			if (Static200.aClass15_Sub1_125.method392(Static175.aClass41_1080)) {
				local78++;
			}
			if (Static200.aClass15_Sub1_125.method392(Static143.aClass41_906)) {
				local78++;
			}
			if (Static200.aClass15_Sub1_125.method392(Static94.aClass41_687)) {
				local78++;
			}
			if (Static85.aClass15_Sub1_56.method392(Static175.aClass41_1080)) {
				local78++;
			}
			if (Static85.aClass15_Sub1_56.method392(Static143.aClass41_906)) {
				local78++;
			}
			if (Static85.aClass15_Sub1_56.method392(Static94.aClass41_687)) {
				local78++;
			}
			if (local78 < 6) {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static101.aClass41_728, Static152.method2471(local78 * 100 / 6), Static134.aClass41_859 });
				Static5.anInt284 = 35;
			} else {
				Static5.anInt284 = 35;
				Static29.anInt698 = 60;
				Static185.aClass41_1116 = Static139.aClass41_886;
			}
		} else if (Static29.anInt698 == 60) {
			local78 = Static42.method192(Static8.aClass15_Sub1_10, Static200.aClass15_Sub1_125);
			local19 = Static91.method1599();
			if (local78 < local19) {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static42.aClass41_48, Static152.method2471(local78 * 100 / local19), Static134.aClass41_859 });
				Static5.anInt284 = 40;
			} else {
				Static5.anInt284 = 40;
				Static185.aClass41_1116 = Static86.aClass41_642;
				Static29.anInt698 = 65;
			}
		} else if (Static29.anInt698 == 65) {
			Static45.aClass2_Sub2_Sub4_2 = Static55.method1079(Static85.aClass15_Sub1_56, Static200.aClass15_Sub1_125, Static156.aClass41_981, Static175.aClass41_1080);
			Static139.aClass2_Sub2_Sub4_Sub1_Sub1_1 = (Class2_Sub2_Sub4_Sub1_Sub1) Static45.aClass2_Sub2_Sub4_2;
			Static3.aClass2_Sub2_Sub4_1 = Static55.method1079(Static85.aClass15_Sub1_56, Static200.aClass15_Sub1_125, Static156.aClass41_981, Static143.aClass41_906);
			Static49.aClass2_Sub2_Sub4_3 = Static55.method1079(Static85.aClass15_Sub1_56, Static200.aClass15_Sub1_125, Static156.aClass41_981, Static94.aClass41_687);
			Static5.anInt284 = 45;
			Static185.aClass41_1116 = Static2.aClass41_21;
			Static116.method1955(5);
			Static29.anInt698 = 70;
		} else if (Static29.anInt698 == 70) {
			Static74.aClass15_Sub1_48.method412();
			local78 = Static74.aClass15_Sub1_48.method398();
			Static95.aClass15_Sub1_62.method412();
			local78 += Static95.aClass15_Sub1_62.method398();
			Static168.aClass15_Sub1_103.method412();
			local78 += Static168.aClass15_Sub1_103.method398();
			Static146.aClass15_Sub1_88.method412();
			local78 += Static146.aClass15_Sub1_88.method398();
			Static220.aClass15_Sub1_139.method412();
			local78 += Static220.aClass15_Sub1_139.method398();
			Static173.aClass15_Sub1_109.method412();
			local78 += Static173.aClass15_Sub1_109.method398();
			Static16.aClass15_Sub1_13.method412();
			local78 += Static16.aClass15_Sub1_13.method398();
			Static211.aClass15_Sub1_134.method412();
			local78 += Static211.aClass15_Sub1_134.method398();
			Static18.aClass15_Sub1_17.method412();
			local78 += Static18.aClass15_Sub1_17.method398();
			Static179.aClass15_Sub1_111.method412();
			local78 += Static179.aClass15_Sub1_111.method398();
			if (local78 < 1000) {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static45.aClass41_390, Static152.method2471(local78 / 10), Static134.aClass41_859 });
				Static5.anInt284 = 50;
			} else {
				Static85.method1531(Static74.aClass15_Sub1_48);
				Static122.method2036(Static74.aClass15_Sub1_48);
				Static120.method2029(Static74.aClass15_Sub1_48);
				Static175.method2826(Static207.aClass15_Sub1_130, Static74.aClass15_Sub1_48);
				Static25.method3299(Static95.aClass15_Sub1_62, Static207.aClass15_Sub1_130, Static60.aBoolean291, Static217.aBoolean290);
				Static43.method899(Static146.aClass15_Sub1_88, Static207.aClass15_Sub1_130);
				Static167.method2702(Static60.aBoolean291, Static220.aClass15_Sub1_139, Static139.aClass2_Sub2_Sub4_Sub1_Sub1_1, Static207.aClass15_Sub1_130);
				Static17.method327(Static74.aClass15_Sub1_48);
				Static41.method883(Static173.aClass15_Sub1_109, Static60.aClass15_Sub1_138, Static198.aClass15_Sub1_122);
				Static187.method2972(Static207.aClass15_Sub1_130, Static16.aClass15_Sub1_13);
				Static161.method2613(Static211.aClass15_Sub1_134);
				Static134.method2139(Static74.aClass15_Sub1_48);
				Static111.method1896(Static200.aClass15_Sub1_125, Static78.aClass15_Sub1_49, Static85.aClass15_Sub1_56, Static207.aClass15_Sub1_130);
				Static168.method2708(Static74.aClass15_Sub1_48);
				Static65.method1201(Static168.aClass15_Sub1_103);
				Static138.method2201(Static179.aClass15_Sub1_111, new Class76(), Static18.aClass15_Sub1_17);
				Static167.method2700(Static18.aClass15_Sub1_17, Static179.aClass15_Sub1_111);
				Static185.aClass41_1116 = Static189.aClass41_1148;
				Static5.anInt284 = 50;
				Static182.method2901();
				Static29.anInt698 = 80;
			}
		} else if (Static29.anInt698 == 80) {
			local78 = 0;
			if (Static43.aClass2_Sub2_Sub16_1 == null) {
				@Pc(1058) Class2_Sub2_Sub16_Sub1 local1058 = Static8.method255(Static54.aClass41_446, Static200.aClass15_Sub1_125, Static156.aClass41_981);
				if (local1058 != null) {
					local1058.method2425();
					Static43.aClass2_Sub2_Sub16_1 = local1058;
				}
			} else {
				local78++;
			}
			if (Static213.aClass60_Sub1Array2 == null) {
				Static213.aClass60_Sub1Array2 = Static132.method2093(Static16.aClass41_97, Static156.aClass41_981, Static200.aClass15_Sub1_125);
			} else {
				local78++;
			}
			if (Static28.aClass2_Sub2_Sub16_Sub1Array1 == null) {
				Static28.aClass2_Sub2_Sub16_Sub1Array1 = Static3.method56(Static1.aClass41_1014, Static156.aClass41_981, Static200.aClass15_Sub1_125);
			} else {
				local78++;
			}
			if (Static130.aClass2_Sub2_Sub16Array17 == null) {
				Static130.aClass2_Sub2_Sub16Array17 = Static212.method3259(Static129.aClass41_125, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			if (Static211.aClass2_Sub2_Sub16Array20 == null) {
				Static211.aClass2_Sub2_Sub16Array20 = Static212.method3259(Static85.aClass41_640, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			if (Static115.aClass2_Sub2_Sub16Array18 == null) {
				Static115.aClass2_Sub2_Sub16Array18 = Static212.method3259(Static93.aClass41_673, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			if (Static158.aClass2_Sub2_Sub16Array16 == null) {
				Static158.aClass2_Sub2_Sub16Array16 = Static212.method3259(Static207.aClass41_1240, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			if (Static201.aClass2_Sub2_Sub16Array19 == null) {
				Static201.aClass2_Sub2_Sub16Array19 = Static212.method3259(Static127.aClass41_834, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			@Pc(1156) int local1156;
			if (Static99.aClass2_Sub2_Sub16Array12 == null) {
				@Pc(1152) Class2_Sub2_Sub16_Sub1[] local1152 = Static3.method56(Static36.aClass41_269, Static156.aClass41_981, Static200.aClass15_Sub1_125);
				if (local1152 != null) {
					for (local1156 = 0; local1156 < local1152.length; local1156++) {
						local1152[local1156].method2425();
					}
					Static99.aClass2_Sub2_Sub16Array12 = local1152;
				}
			} else {
				local78++;
			}
			if (Static176.aClass2_Sub2_Sub16_3 == null) {
				Static176.aClass2_Sub2_Sub16_3 = Static196.method3066(Static210.aClass41_1254, Static156.aClass41_981, Static200.aClass15_Sub1_125);
			} else {
				local78++;
			}
			if (Static139.aClass2_Sub2_Sub16Array15 == null) {
				Static139.aClass2_Sub2_Sub16Array15 = Static212.method3259(Static201.aClass41_1202, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			if (Static33.aClass2_Sub2_Sub16Array4 == null) {
				Static33.aClass2_Sub2_Sub16Array4 = Static212.method3259(Static101.aClass41_727, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			if (Static6.aClass60Array3 == null) {
				Static6.aClass60Array3 = Static1.method2633(Static127.aClass41_833, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			if (Static32.aClass60Array8 == null) {
				Static32.aClass60Array8 = Static1.method2633(Static213.aClass41_1261, Static200.aClass15_Sub1_125, Static156.aClass41_981);
			} else {
				local78++;
			}
			local78++;
			if (local78 < 15) {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static136.aClass41_866, Static152.method2471(local78 * 100 / 15), Static134.aClass41_859 });
				Static5.anInt284 = 60;
			} else {
				local19 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1268) int local1268 = (int) (Math.random() * 21.0D) - 10;
				local1156 = (int) (Math.random() * 21.0D) - 10;
				Static45.aClass2_Sub2_Sub4_2.method779(Static32.aClass60Array8, null);
				Static3.aClass2_Sub2_Sub4_1.method779(Static32.aClass60Array8, null);
				@Pc(1290) int local1290 = (int) (Math.random() * 41.0D) - 20;
				Static49.aClass2_Sub2_Sub4_3.method779(Static32.aClass60Array8, null);
				for (@Pc(1296) int local1296 = 0; local1296 < Static28.aClass2_Sub2_Sub16_Sub1Array1.length; local1296++) {
					Static28.aClass2_Sub2_Sub16_Sub1Array1[local1296].method2411(local1290 + local19, local1290 + local1156, local1290 + local1268);
				}
				Static213.aClass60_Sub1Array2[0].method2745(local19 + local1290, local1290 + local1156, local1290 + local1268);
				Static5.anInt284 = 60;
				Static29.anInt698 = 90;
				Static219.aClass2_Sub2_Sub16Array21 = Static28.aClass2_Sub2_Sub16_Sub1Array1;
				Static185.aClass41_1116 = Static128.aClass41_838;
			}
		} else if (Static29.anInt698 == 90) {
			if (Static140.aClass15_Sub1_85.method412()) {
				@Pc(1381) Class36 local1381 = new Class36(Static59.aClass15_Sub1_40, Static140.aClass15_Sub1_85, Static200.aClass15_Sub1_125, 20, Static217.aBoolean290);
				Static155.method2533(local1381);
				Static155.method2521(0.7F);
				Static185.aClass41_1116 = Static123.aClass41_333;
				Static29.anInt698 = 110;
				Static5.anInt284 = 70;
			} else {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static204.aClass41_1215, Static152.method2471(Static140.aClass15_Sub1_85.method398()), Static134.aClass41_859 });
				Static5.anInt284 = 70;
			}
		} else if (Static29.anInt698 == 110) {
			Static194.aClass26_2 = new Class26();
			Static111.aClass83_2.method2618(Static194.aClass26_2, 10);
			Static185.aClass41_1116 = Static176.aClass41_1090;
			Static5.anInt284 = 75;
			Static29.anInt698 = 120;
		} else if (Static29.anInt698 == 120) {
			if (Static8.aClass15_Sub1_10.method394(Static139.aClass41_883, Static156.aClass41_981)) {
				@Pc(1456) Class92 local1456 = new Class92(Static8.aClass15_Sub1_10.method410(Static139.aClass41_883, Static156.aClass41_981));
				Static13.method293(local1456);
				Static29.anInt698 = 130;
				Static185.aClass41_1116 = Static74.aClass41_594;
				Static5.anInt284 = 80;
			} else {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static187.aClass41_1137, Static176.aClass41_1084 });
				Static5.anInt284 = 80;
			}
		} else if (Static29.anInt698 == 130) {
			if (!Static78.aClass15_Sub1_49.method412()) {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static63.aClass41_531, Static152.method2471(Static78.aClass15_Sub1_49.method398() * 4 / 5), Static134.aClass41_859 });
				Static5.anInt284 = 85;
			} else if (!Static17.aClass15_Sub1_15.method412()) {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static63.aClass41_531, Static152.method2471(Static17.aClass15_Sub1_15.method398() / 6 + 80), Static134.aClass41_859 });
				Static5.anInt284 = 85;
			} else if (Static85.aClass15_Sub1_56.method412()) {
				Static5.anInt284 = 100;
				Static29.anInt698 = 140;
				Static185.aClass41_1116 = Static22.aClass41_133;
			} else {
				Static185.aClass41_1116 = Static149.method2324(new Class41[] { Static63.aClass41_531, Static152.method2471(Static85.aClass15_Sub1_56.method398() / 20 + 96), Static134.aClass41_859 });
				Static5.anInt284 = 85;
			}
		} else if (Static29.anInt698 == 140) {
			Static25.aClass15_Sub1_137.method415(false);
			Static86.aClass15_Sub1_57.method415(true);
			Static200.aClass15_Sub1_125.method415(true);
			Static85.aClass15_Sub1_56.method415(true);
			Static8.aClass15_Sub1_10.method415(true);
			Static78.aClass15_Sub1_49.method415(true);
			Static116.method1955(10);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method595() {
		@Pc(7) boolean local7 = false;
		@Pc(10) boolean local10 = Static127.method2069();
		if (local10 && Static96.aBoolean127 && Static25.aClass31_7 != null) {
			Static25.aClass31_7.method1500();
		}
		if (Static48.aBoolean70) {
			local7 = true;
			Static48.aBoolean70 = false;
		}
		if (Static203.anInt4533 == 0) {
			Static149.method2326(null, Static185.aClass41_1116, local7, Static5.anInt284);
		} else if (Static203.anInt4533 == 5 || Static203.anInt4533 == 10 || Static203.anInt4533 == 20) {
			Static166.method2399(Static45.aClass2_Sub2_Sub4_2, Static49.aClass2_Sub2_Sub4_3);
		} else if (Static203.anInt4533 == 25) {
			@Pc(119) int local119;
			if (Static179.anInt4149 == 1) {
				if (Static173.anInt4078 > Static131.anInt3009) {
					Static131.anInt3009 = Static173.anInt4078;
				}
				local119 = (Static131.anInt3009 - Static173.anInt4078) * 50 / Static131.anInt3009;
				Static31.method606(Static149.method2324(new Class41[] { Static215.aClass41_1270, Static28.aClass41_193, Static152.method2471(local119), Static13.aClass41_84 }), false);
			} else if (Static179.anInt4149 == 2) {
				if (Static99.anInt2417 > Static128.anInt2989) {
					Static128.anInt2989 = Static99.anInt2417;
				}
				local119 = (Static128.anInt2989 - Static99.anInt2417) * 50 / Static128.anInt2989 + 50;
				Static31.method606(Static149.method2324(new Class41[] { Static215.aClass41_1270, Static28.aClass41_193, Static152.method2471(local119), Static13.aClass41_84 }), false);
			} else {
				Static31.method606(Static215.aClass41_1270, false);
			}
		} else if (Static203.anInt4533 == 30) {
			Static217.method3297();
		} else if (Static203.anInt4533 == 40) {
			Static31.method606(Static149.method2324(new Class41[] { Static99.aClass41_714, Static127.aClass41_831, Static88.aClass41_650 }), false);
		}
		@Pc(202) Canvas local202 = Static139.aCanvas1;
		@Pc(219) Graphics local219;
		@Pc(227) int local227;
		if (Static203.anInt4533 == 30 && Static119.anInt2867 == 0 && !local7) {
			try {
				local219 = local202.getGraphics();
				for (local227 = 0; local227 < Static182.anInt4210; local227++) {
					if (Static187.aBooleanArray22[local227]) {
						Static178.aClass22_1.method1216(Static70.anIntArray173[local227], Static118.anIntArray306[local227], Static117.anIntArray303[local227], Static71.anIntArray175[local227], local219);
						Static187.aBooleanArray22[local227] = false;
					}
				}
			} catch (@Pc(279) Exception local279) {
				local202.repaint();
			}
		} else if (Static203.anInt4533 > 0) {
			try {
				local219 = local202.getGraphics();
				Static178.aClass22_1.method1219(local219);
				for (local227 = 0; local227 < Static182.anInt4210; local227++) {
					Static187.aBooleanArray22[local227] = false;
				}
			} catch (@Pc(239) Exception local239) {
				local202.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method599() {
		Static103.anInt2511++;
		if (Static103.anInt2511 % 1000 == 1) {
			@Pc(16) GregorianCalendar local16 = new GregorianCalendar();
			Static25.anInt4763 = local16.get(11) * 600 + local16.get(12) * 10 + local16.get(13) / 6;
			Static62.aRandom1.setSeed((long) Static25.anInt4763);
		}
		this.method607();
		Static41.method885();
		Static20.method423();
		Static194.method3305();
		Static44.method928();
		Static180.method2872();
		if (Static150.aClass19_1 != null) {
			@Pc(69) int local69 = Static150.aClass19_1.method1633();
			Static79.anInt2046 = local69;
		}
		if (Static203.anInt4533 == 0) {
			this.method605();
			Static94.method1639();
		} else if (Static203.anInt4533 == 5) {
			Static46.method2856(this);
			this.method605();
			Static94.method1639();
		} else if (Static203.anInt4533 == 10) {
			Static46.method2856(this);
		} else if (Static203.anInt4533 == 20) {
			Static46.method2856(this);
			Static158.method2568();
		} else if (Static203.anInt4533 == 25) {
			Static163.method2658();
		}
		if (Static203.anInt4533 == 30) {
			Static102.method1755();
		} else if (Static203.anInt4533 == 40) {
			Static158.method2568();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method607() {
		if (Static203.anInt4533 != 1000) {
			@Pc(17) boolean local17 = Static86.method1532();
			if (!local17) {
				this.method601();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method585() {
	}
}
