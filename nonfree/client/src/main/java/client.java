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
				Static180.method2618();
			}
			Static74.anInt1521 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static187.anInt3891 = 0;
			} else if (arg0[1].equals("office")) {
				Static187.anInt3891 = 1;
			} else if (arg0[1].equals("local")) {
				Static187.anInt3891 = 2;
			} else {
				Static180.method2618();
			}
			if (arg0[2].equals("live")) {
				Static133.anInt2869 = 0;
			} else if (arg0[2].equals("rc")) {
				Static133.anInt2869 = 1;
			} else if (arg0[2].equals("wip")) {
				Static133.anInt2869 = 2;
			} else {
				Static180.method2618();
			}
			if (arg0[3].equals("lowmem")) {
				Static17.method332();
			} else if (arg0[3].equals("highmem")) {
				Static152.method2257();
			} else {
				Static180.method2618();
			}
			if (arg0[4].equals("free")) {
				Static36.aBoolean36 = false;
			} else if (arg0[4].equals("members")) {
				Static36.aBoolean36 = true;
			} else {
				Static180.method2618();
			}
			if (arg0[5].equals("english")) {
				Static134.anInt2873 = 0;
			} else if (arg0[5].equals("german")) {
				Static200.method2927();
				Static134.anInt2873 = 1;
			} else {
				Static180.method2618();
			}
			if (arg0[6].equals("game0")) {
				Static65.anInt1369 = 0;
			} else if (arg0[6].equals("game1")) {
				Static65.anInt1369 = 1;
			} else {
				Static180.method2618();
			}
			Static66.aClass62_466 = Static69.aClass62_484;
			Static209.aString6 = "127.0.0.1";
			Static173.anInt3687 = 0;
			@Pc(182) client local182 = new client();
			local182.method519(Static133.anInt2869 + 32, "runescape");
			Static113.aFrame1.setLocation(40, 40);
		} catch (@Pc(199) Exception local199) {
			Static84.method2582(null, local199);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method524(@OriginalArg(1) int arg0) {
		Static175.aClass36_4 = null;
		if (Static5.anInt171 == Static208.anInt4336) {
			Static208.anInt4336 = Static104.anInt2343;
		} else {
			Static208.anInt4336 = Static5.anInt171;
		}
		Static150.aClass56_13 = null;
		Static204.anInt4233++;
		Static27.anInt605 = 0;
		if (Static204.anInt4233 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static87.anInt1821 <= 5) {
				this.method510("js5connect_full");
				Static87.anInt1821 = 1000;
			} else {
				Static24.anInt579 = 3000;
			}
		} else if (Static204.anInt4233 >= 2 && arg0 == 6) {
			this.method510("js5connect_outofdate");
			Static87.anInt1821 = 1000;
		} else if (Static204.anInt4233 >= 4) {
			if (Static87.anInt1821 <= 5) {
				this.method510("js5connect");
				Static87.anInt1821 = 1000;
			} else {
				Static24.anInt579 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method514()) {
			return;
		}
		Static74.anInt1521 = Integer.parseInt(this.getParameter("worldid"));
		Static133.anInt2869 = Integer.parseInt(this.getParameter("modewhat"));
		Static187.anInt3891 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static17.method332();
		} else {
			Static152.method2257();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static36.aBoolean36 = true;
		} else {
			Static36.aBoolean36 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static200.method2927();
			Static134.anInt2873 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static65.anInt1369 = 1;
		} else {
			Static65.anInt1369 = 0;
		}
		try {
			Static196.anInt4035 = Integer.parseInt(this.getParameter("js"));
			Static137.anInt2897 = Integer.parseInt(this.getParameter("plug"));
			Static173.anInt3687 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static66.aClass62_466 = Static155.aClass62_1181.method1842(this);
		if (Static66.aClass62_466 == null) {
			Static66.aClass62_466 = Static69.aClass62_484;
		}
		Static209.aString6 = this.getCodeBase().getHost();
		this.method508(Static133.anInt2869 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method509() {
		if (Static28.aClass91_1 != null) {
			Static28.aClass91_1.aBoolean165 = false;
		}
		Static28.aClass91_1 = null;
		if (Static151.aClass36_3 != null) {
			Static151.aClass36_3.method862();
			Static151.aClass36_3 = null;
		}
		Static187.method2683(Static139.aCanvas1);
		Static144.method2184(Static139.aCanvas1);
		if (Static172.aClass20_2 != null) {
			Static172.aClass20_2.method2656(Static139.aCanvas1);
		}
		Static16.method307();
		Static74.method1039();
		Static172.aClass20_2 = null;
		if (Static96.aClass3_1 != null) {
			Static96.aClass3_1.method101();
		}
		if (Static174.aClass3_2 != null) {
			Static174.aClass3_2.method101();
		}
		Static118.method1834();
		Static93.method1398();
		try {
			if (Static64.aClass9_1 != null) {
				Static64.aClass9_1.method220();
			}
			if (Static111.aClass9Array1 != null) {
				for (@Pc(65) int local65 = 0; local65 < Static111.aClass9Array1.length; local65++) {
					if (Static111.aClass9Array1[local65] != null) {
						Static111.aClass9Array1[local65].method220();
					}
				}
			}
			if (Static200.aClass9_5 != null) {
				Static200.aClass9_5.method220();
			}
			if (Static154.aClass9_2 != null) {
				Static154.aClass9_2.method220();
			}
		} catch (@Pc(93) IOException local93) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method513() {
		Static25.anInt581++;
		if (Static25.anInt581 % 1000 == 1) {
			@Pc(18) GregorianCalendar local18 = new GregorianCalendar();
			Static62.anInt1302 = local18.get(11) * 600 + local18.get(12) * 10 + local18.get(13) / 6;
			Static198.aRandom1.setSeed((long) Static62.anInt1302);
		}
		this.method526();
		Static6.method131();
		Static106.method1669();
		Static8.method148();
		Static180.method2614();
		Static119.method1848();
		if (Static172.aClass20_2 != null) {
			@Pc(65) int local65 = Static172.aClass20_2.method2658();
			Static87.anInt1822 = local65;
		}
		if (Static87.anInt1821 == 0) {
			this.method527();
			Static120.method1887();
		} else if (Static87.anInt1821 == 5) {
			Static137.method2052(this);
			this.method527();
			Static120.method1887();
		} else if (Static87.anInt1821 == 10) {
			Static137.method2052(this);
		} else if (Static87.anInt1821 == 20) {
			Static137.method2052(this);
			Static208.method3037();
		} else if (Static87.anInt1821 == 25) {
			Static85.method1202();
		}
		if (Static87.anInt1821 == 30) {
			Static107.method1676();
		} else if (Static87.anInt1821 == 40) {
			Static208.method3037();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method525() {
		if (Static143.anInt3032 >= 4) {
			this.method510("js5crc");
			Static87.anInt1821 = 1000;
			return;
		}
		if (Static69.anInt1430 >= 4) {
			if (Static87.anInt1821 <= 5) {
				this.method510("js5io");
				Static87.anInt1821 = 1000;
				return;
			}
			Static69.anInt1430 = 3;
			Static24.anInt579 = 3000;
		}
		if (Static24.anInt579-- > 0) {
			return;
		}
		try {
			if (Static27.anInt605 == 0) {
				Static150.aClass56_13 = Static170.aClass41_3.method1046(Static208.anInt4336, Static209.aString6);
				Static27.anInt605++;
			}
			if (Static27.anInt605 == 1) {
				if (Static150.aClass56_13.anInt2418 == 2) {
					this.method524(-1);
					return;
				}
				if (Static150.aClass56_13.anInt2418 == 1) {
					Static27.anInt605++;
				}
			}
			if (Static27.anInt605 == 2) {
				Static175.aClass36_4 = new Class36((Socket) Static150.aClass56_13.anObject2, Static170.aClass41_3);
				@Pc(101) Class2_Sub11 local101 = new Class2_Sub11(5);
				local101.method1565(15);
				local101.method1544(496);
				Static175.aClass36_4.method858(local101.aByteArray26, 5);
				Static27.anInt605++;
				Static159.aLong107 = Static104.method1634();
			}
			if (Static27.anInt605 == 3) {
				if (Static87.anInt1821 <= 5 || Static175.aClass36_4.method863() > 0) {
					@Pc(156) int local156 = Static175.aClass36_4.method859();
					if (local156 != 0) {
						this.method524(local156);
						return;
					}
					Static27.anInt605++;
				} else if (Static104.method1634() - Static159.aLong107 > 30000L) {
					this.method524(-2);
					return;
				}
			}
			if (Static27.anInt605 == 4) {
				Static13.method231(Static175.aClass36_4, Static87.anInt1821 > 20);
				Static27.anInt605 = 0;
				Static175.aClass36_4 = null;
				Static150.aClass56_13 = null;
				Static204.anInt4233 = 0;
			}
		} catch (@Pc(200) IOException local200) {
			this.method524(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method512() {
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method526() {
		if (Static87.anInt1821 != 1000) {
			@Pc(16) boolean local16 = Static42.method3004();
			if (!local16) {
				this.method525();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method527() {
		@Pc(22) int local22;
		if (Static19.anInt451 == 0) {
			@Pc(12) Runtime local12 = Runtime.getRuntime();
			local22 = (int) ((local12.totalMemory() - local12.freeMemory()) / 1024L);
			@Pc(25) long local25 = Static104.method1634();
			if (Static118.aLong89 == 0L) {
				Static118.aLong89 = local25;
			}
			if (local22 > 16384 && local25 - Static118.aLong89 < 5000L) {
				if (local25 - Static161.aLong110 > 1000L) {
					System.gc();
					Static161.aLong110 = local25;
				}
				Static111.anInt2425 = 5;
				Static137.aClass62_1027 = Static39.aClass62_1525;
			} else {
				Static137.aClass62_1027 = Static184.aClass62_713;
				Static111.anInt2425 = 5;
				Static19.anInt451 = 10;
			}
			return;
		}
		@Pc(81) int local81;
		if (Static19.anInt451 == 10) {
			Static205.method2993(Static171.anIntArrayArrayArray7);
			for (local81 = 0; local81 < 4; local81++) {
				Static164.aClass95Array1[local81] = new Class95(104, 104);
			}
			Static111.anInt2425 = 10;
			Static137.aClass62_1027 = Static115.aClass62_879;
			Static19.anInt451 = 30;
		} else if (Static19.anInt451 == 30) {
			Static49.aClass71_Sub1_1 = Static116.method1790(true, false, true, 0);
			Static146.aClass71_Sub1_15 = Static116.method1790(true, false, true, 1);
			Static157.aClass71_Sub1_19 = Static116.method1790(true, true, false, 2);
			Static173.aClass71_Sub1_21 = Static116.method1790(true, false, true, 3);
			Static126.aClass71_Sub1_13 = Static116.method1790(true, false, true, 4);
			Static153.aClass71_Sub1_16 = Static116.method1790(true, true, true, 5);
			Static63.aClass71_Sub1_5 = Static116.method1790(false, true, true, 6);
			Static126.aClass71_Sub1_14 = Static116.method1790(true, false, true, 7);
			Static59.aClass71_Sub1_4 = Static116.method1790(true, false, true, 8);
			Static101.aClass71_Sub1_11 = Static116.method1790(true, true, false, 9);
			Static56.aClass71_Sub1_3 = Static116.method1790(true, false, true, 10);
			Static156.aClass71_Sub1_18 = Static116.method1790(true, false, true, 11);
			Static179.aClass71_Sub1_23 = Static116.method1790(true, false, true, 12);
			Static86.aClass71_Sub1_20 = Static116.method1790(true, true, false, 13);
			Static65.aClass71_Sub1_6 = Static116.method1790(false, false, true, 14);
			Static71.aClass71_Sub1_7 = Static116.method1790(true, false, true, 15);
			Static92.aClass71_Sub1_9 = Static116.method1790(true, false, true, 16);
			Static203.aClass71_Sub1_26 = Static116.method1790(true, false, true, 17);
			Static96.aClass71_Sub1_10 = Static116.method1790(true, false, true, 18);
			Static191.aClass71_Sub1_24 = Static116.method1790(true, false, true, 19);
			Static55.aClass71_Sub1_2 = Static116.method1790(true, false, true, 20);
			Static153.aClass71_Sub1_17 = Static116.method1790(true, false, true, 21);
			Static200.aClass71_Sub1_25 = Static116.method1790(true, false, true, 22);
			Static203.aClass71_Sub1_27 = Static116.method1790(true, true, true, 23);
			Static111.anInt2425 = 15;
			Static137.aClass62_1027 = Static198.aClass62_1443;
			Static19.anInt451 = 40;
		} else if (Static19.anInt451 == 40) {
			local81 = Static49.aClass71_Sub1_1.method2147() * 4 / 100;
			local81 += Static146.aClass71_Sub1_15.method2147() * 4 / 100;
			local81 += Static157.aClass71_Sub1_19.method2147() / 100;
			local81 += Static173.aClass71_Sub1_21.method2147() * 2 / 100;
			local81 += Static126.aClass71_Sub1_13.method2147() * 6 / 100;
			local81 += Static153.aClass71_Sub1_16.method2147() * 4 / 100;
			local81 += Static63.aClass71_Sub1_5.method2147() * 2 / 100;
			local81 += Static126.aClass71_Sub1_14.method2147() * 53 / 100;
			local81 += Static59.aClass71_Sub1_4.method2147() * 2 / 100;
			local81 += Static101.aClass71_Sub1_11.method2147() * 2 / 100;
			local81 += Static56.aClass71_Sub1_3.method2147() * 2 / 100;
			local81 += Static156.aClass71_Sub1_18.method2147() * 2 / 100;
			local81 += Static179.aClass71_Sub1_23.method2147() * 2 / 100;
			local81 += Static86.aClass71_Sub1_20.method2147() * 2 / 100;
			local81 += Static65.aClass71_Sub1_6.method2147() * 2 / 100;
			local81 += Static71.aClass71_Sub1_7.method2147() * 2 / 100;
			local81 += Static92.aClass71_Sub1_9.method2147() / 100;
			local81 += Static203.aClass71_Sub1_26.method2147() / 100;
			local81 += Static96.aClass71_Sub1_10.method2147() / 100;
			local81 += Static191.aClass71_Sub1_24.method2147() / 100;
			local81 += Static55.aClass71_Sub1_2.method2147() / 100;
			local81 += Static153.aClass71_Sub1_17.method2147() / 100;
			local81 += Static200.aClass71_Sub1_25.method2147() / 100;
			local81 += Static203.aClass71_Sub1_27.method2147() / 100;
			if (local81 == 100) {
				Static111.anInt2425 = 20;
				Static137.aClass62_1027 = Static44.aClass62_323;
				Static42.method3006(Static56.aClass71_Sub1_3, Static59.aClass71_Sub1_4, Static63.aClass71_Sub1_5);
				Static19.anInt451 = 45;
			} else {
				if (local81 != 0) {
					Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static41.aClass62_1537, Static119.method1865(local81), Static31.aClass62_231 });
				}
				Static111.anInt2425 = 20;
			}
		} else if (Static19.anInt451 == 45) {
			Static120.method1888(!Static60.aBoolean52);
			@Pc(572) Class2_Sub2_Sub1 local572 = new Class2_Sub2_Sub1();
			local572.method391();
			Static96.aClass3_1 = Static102.method1622(Static139.aCanvas1, 22050, 0, Static170.aClass41_3);
			Static96.aClass3_1.method96(local572);
			Static64.method887(Static65.aClass71_Sub1_6, Static71.aClass71_Sub1_7, local572, Static126.aClass71_Sub1_13);
			Static174.aClass3_2 = Static102.method1622(Static139.aCanvas1, 2048, 1, Static170.aClass41_3);
			Static32.aClass2_Sub2_Sub3_1 = new Class2_Sub2_Sub3();
			Static174.aClass3_2.method96(Static32.aClass2_Sub2_Sub3_1);
			Static130.aClass49_1 = new Class49(22050, Static88.anInt1852);
			Static137.aClass62_1027 = Static139.aClass62_1043;
			Static19.anInt451 = 50;
			Static111.anInt2425 = 30;
		} else if (Static19.anInt451 == 50) {
			local81 = 0;
			if (Static59.aClass71_Sub1_4.method2116(Static120.aClass62_931)) {
				local81++;
			}
			if (Static59.aClass71_Sub1_4.method2116(Static126.aClass62_984)) {
				local81++;
			}
			if (Static59.aClass71_Sub1_4.method2116(Static184.aClass62_716)) {
				local81++;
			}
			if (Static86.aClass71_Sub1_20.method2116(Static120.aClass62_931)) {
				local81++;
			}
			if (Static86.aClass71_Sub1_20.method2116(Static126.aClass62_984)) {
				local81++;
			}
			if (Static86.aClass71_Sub1_20.method2116(Static184.aClass62_716)) {
				local81++;
			}
			if (local81 < 6) {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static63.aClass62_446, Static119.method1865(local81 * 100 / 6), Static31.aClass62_231 });
				Static111.anInt2425 = 35;
			} else {
				Static137.aClass62_1027 = Static28.aClass62_204;
				Static19.anInt451 = 60;
				Static111.anInt2425 = 35;
			}
		} else if (Static19.anInt451 == 60) {
			local81 = Static186.method2681(Static56.aClass71_Sub1_3, Static59.aClass71_Sub1_4);
			local22 = Static109.method1688();
			if (local81 < local22) {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static148.aClass62_1093, Static119.method1865(local81 * 100 / local22), Static31.aClass62_231 });
				Static111.anInt2425 = 40;
			} else {
				Static111.anInt2425 = 40;
				Static137.aClass62_1027 = Static208.aClass62_1497;
				Static19.anInt451 = 65;
			}
		} else if (Static19.anInt451 == 65) {
			Static10.aClass2_Sub1_Sub12_1 = Static142.method2154(Static59.aClass71_Sub1_4, Static69.aClass62_484, Static86.aClass71_Sub1_20, Static120.aClass62_931);
			Static18.aClass2_Sub1_Sub12_Sub1_Sub1_2 = (Class2_Sub1_Sub12_Sub1_Sub1) Static10.aClass2_Sub1_Sub12_1;
			Static13.aClass2_Sub1_Sub12_2 = Static142.method2154(Static59.aClass71_Sub1_4, Static69.aClass62_484, Static86.aClass71_Sub1_20, Static126.aClass62_984);
			Static47.aClass2_Sub1_Sub12_3 = Static142.method2154(Static59.aClass71_Sub1_4, Static69.aClass62_484, Static86.aClass71_Sub1_20, Static184.aClass62_716);
			Static111.anInt2425 = 45;
			Static137.aClass62_1027 = Static28.aClass62_208;
			Static2.method55(5);
			Static19.anInt451 = 70;
		} else if (Static19.anInt451 == 70) {
			Static157.aClass71_Sub1_19.method2113();
			local81 = Static157.aClass71_Sub1_19.method2133();
			Static92.aClass71_Sub1_9.method2113();
			local81 += Static92.aClass71_Sub1_9.method2133();
			Static203.aClass71_Sub1_26.method2113();
			local81 += Static203.aClass71_Sub1_26.method2133();
			Static96.aClass71_Sub1_10.method2113();
			local81 += Static96.aClass71_Sub1_10.method2133();
			Static191.aClass71_Sub1_24.method2113();
			local81 += Static191.aClass71_Sub1_24.method2133();
			Static55.aClass71_Sub1_2.method2113();
			local81 += Static55.aClass71_Sub1_2.method2133();
			Static153.aClass71_Sub1_17.method2113();
			local81 += Static153.aClass71_Sub1_17.method2133();
			Static200.aClass71_Sub1_25.method2113();
			local81 += Static200.aClass71_Sub1_25.method2133();
			if (local81 < 800) {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static91.aClass62_723, Static119.method1865(local81 / 8), Static31.aClass62_231 });
				Static111.anInt2425 = 50;
			} else {
				Static167.method2450(Static157.aClass71_Sub1_19);
				Static162.method2384(Static157.aClass71_Sub1_19);
				Static154.method2289(Static157.aClass71_Sub1_19, Static126.aClass71_Sub1_14);
				Static116.method1782(Static60.aBoolean52, Static126.aClass71_Sub1_14, Static92.aClass71_Sub1_9, Static36.aBoolean36);
				Static159.method2353(Static96.aClass71_Sub1_10, Static126.aClass71_Sub1_14);
				Static189.method2721(Static191.aClass71_Sub1_24, Static36.aBoolean36, Static18.aClass2_Sub1_Sub12_Sub1_Sub1_2, Static126.aClass71_Sub1_14);
				Static175.method2550(Static49.aClass71_Sub1_1, Static146.aClass71_Sub1_15, Static55.aClass71_Sub1_2);
				Static147.method2198(Static126.aClass71_Sub1_14, Static153.aClass71_Sub1_17);
				Static39.method3131(Static200.aClass71_Sub1_25);
				Static211.method3085(Static157.aClass71_Sub1_19);
				Static167.method2447(Static173.aClass71_Sub1_21, Static59.aClass71_Sub1_4, Static126.aClass71_Sub1_14, Static86.aClass71_Sub1_20);
				Static199.method2925(Static157.aClass71_Sub1_19);
				Static207.method3012(Static203.aClass71_Sub1_26);
				Static131.method1031(Static157.aClass71_Sub1_19);
				Static158.method2346(Static157.aClass71_Sub1_19);
				Static111.anInt2425 = 50;
				Static137.aClass62_1027 = Static78.aClass62_554;
				Static88.method1251();
				Static19.anInt451 = 80;
			}
		} else if (Static19.anInt451 == 80) {
			local81 = 0;
			if (Static194.aClass2_Sub1_Sub2_4 == null) {
				@Pc(1000) Class2_Sub1_Sub2_Sub1 local1000 = Static192.method2747(Static69.aClass62_484, Static59.aClass71_Sub1_4, Static66.aClass62_471);
				if (local1000 != null) {
					local1000.method297();
					Static194.aClass2_Sub1_Sub2_4 = local1000;
				}
			} else {
				local81++;
			}
			if (Static16.aClass42_Sub1Array1 == null) {
				Static16.aClass42_Sub1Array1 = Static24.method437(Static193.aClass62_1392, Static69.aClass62_484, Static59.aClass71_Sub1_4);
			} else {
				local81++;
			}
			if (Static170.aClass2_Sub1_Sub2_Sub1Array1 == null) {
				Static170.aClass2_Sub1_Sub2_Sub1Array1 = Static154.method2287(Static196.aClass62_1401, Static59.aClass71_Sub1_4, Static69.aClass62_484);
			} else {
				local81++;
			}
			if (Static135.aClass2_Sub1_Sub2Array8 == null) {
				Static135.aClass2_Sub1_Sub2Array8 = Static82.method1166(Static59.aClass71_Sub1_4, Static30.aClass62_226, Static69.aClass62_484);
			} else {
				local81++;
			}
			if (Static78.aClass2_Sub1_Sub2Array6 == null) {
				Static78.aClass2_Sub1_Sub2Array6 = Static82.method1166(Static59.aClass71_Sub1_4, Static210.aClass62_1516, Static69.aClass62_484);
			} else {
				local81++;
			}
			if (Static40.aClass2_Sub1_Sub2Array4 == null) {
				Static40.aClass2_Sub1_Sub2Array4 = Static82.method1166(Static59.aClass71_Sub1_4, Static143.aClass62_1058, Static69.aClass62_484);
			} else {
				local81++;
			}
			if (Static15.aClass2_Sub1_Sub2Array2 == null) {
				Static15.aClass2_Sub1_Sub2Array2 = Static82.method1166(Static59.aClass71_Sub1_4, Static211.aClass62_1520, Static69.aClass62_484);
			} else {
				local81++;
			}
			if (Static140.aClass2_Sub1_Sub2Array9 == null) {
				Static140.aClass2_Sub1_Sub2Array9 = Static82.method1166(Static59.aClass71_Sub1_4, Static25.aClass62_166, Static69.aClass62_484);
			} else {
				local81++;
			}
			@Pc(1098) int local1098;
			if (Static154.aClass2_Sub1_Sub2Array10 == null) {
				@Pc(1094) Class2_Sub1_Sub2_Sub1[] local1094 = Static154.method2287(Static145.aClass62_1074, Static59.aClass71_Sub1_4, Static69.aClass62_484);
				if (local1094 != null) {
					for (local1098 = 0; local1098 < local1094.length; local1098++) {
						local1094[local1098].method297();
					}
					Static154.aClass2_Sub1_Sub2Array10 = local1094;
				}
			} else {
				local81++;
			}
			if (Static117.aClass2_Sub1_Sub2_3 == null) {
				Static117.aClass2_Sub1_Sub2_3 = Static48.method731(Static117.aClass62_895, Static69.aClass62_484, Static59.aClass71_Sub1_4);
			} else {
				local81++;
			}
			if (Static43.aClass2_Sub1_Sub2Array5 == null) {
				Static43.aClass2_Sub1_Sub2Array5 = Static82.method1166(Static59.aClass71_Sub1_4, Static40.aClass62_303, Static69.aClass62_484);
			} else {
				local81++;
			}
			if (Static34.aClass2_Sub1_Sub2Array3 == null) {
				Static34.aClass2_Sub1_Sub2Array3 = Static82.method1166(Static59.aClass71_Sub1_4, Static65.aClass62_454, Static69.aClass62_484);
			} else {
				local81++;
			}
			if (Static74.aClass42Array4 == null) {
				Static74.aClass42Array4 = Static6.method127(Static69.aClass62_484, Static59.aClass71_Sub1_4, Static19.aClass62_139);
			} else {
				local81++;
			}
			if (Static78.aClass42Array5 == null) {
				Static78.aClass42Array5 = Static6.method127(Static69.aClass62_484, Static59.aClass71_Sub1_4, Static16.aClass62_122);
			} else {
				local81++;
			}
			local81++;
			if (local81 < 15) {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static105.aClass62_804, Static119.method1865(local81 * 100 / 15), Static31.aClass62_231 });
				Static111.anInt2425 = 60;
			} else {
				Static10.aClass2_Sub1_Sub12_1.method1383(Static78.aClass42Array5, null);
				Static13.aClass2_Sub1_Sub12_2.method1383(Static78.aClass42Array5, null);
				local1098 = (int) (Math.random() * 21.0D) - 10;
				Static47.aClass2_Sub1_Sub12_3.method1383(Static78.aClass42Array5, null);
				local22 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1233) int local1233 = (int) (Math.random() * 41.0D) - 20;
				@Pc(1240) int local1240 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1242) int local1242 = 0; local1242 < Static170.aClass2_Sub1_Sub2_Sub1Array1.length; local1242++) {
					Static170.aClass2_Sub1_Sub2_Sub1Array1[local1242].method290(local1233 + local22, local1098 + local1233, local1240 + local1233);
				}
				Static16.aClass42_Sub1Array1[0].method2475(local22 + local1233, local1098 + local1233, local1233 + local1240);
				Static111.anInt2425 = 60;
				Static15.aClass2_Sub1_Sub2Array1 = Static170.aClass2_Sub1_Sub2_Sub1Array1;
				Static137.aClass62_1027 = Static28.aClass62_197;
				Static19.anInt451 = 90;
			}
		} else if (Static19.anInt451 == 90) {
			if (Static101.aClass71_Sub1_11.method2113()) {
				@Pc(1332) Class77 local1332 = new Class77(Static101.aClass71_Sub1_11, Static59.aClass71_Sub1_4, 20, Static60.aBoolean52 ? 64 : 128);
				Static45.method707(local1332);
				Static45.method710(0.7F);
				Static19.anInt451 = 110;
				Static111.anInt2425 = 70;
				Static137.aClass62_1027 = Static80.aClass62_564;
			} else {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static147.aClass62_1084, Static119.method1865(Static101.aClass71_Sub1_11.method2133()), Static31.aClass62_231 });
				Static111.anInt2425 = 70;
			}
		} else if (Static19.anInt451 == 110) {
			Static28.aClass91_1 = new Class91();
			Static170.aClass41_3.method1044(Static28.aClass91_1, 10);
			Static19.anInt451 = 120;
			Static111.anInt2425 = 75;
			Static137.aClass62_1027 = Static52.aClass62_358;
		} else if (Static19.anInt451 == 120) {
			if (Static56.aClass71_Sub1_3.method2141(Static174.aClass62_1302, Static69.aClass62_484)) {
				@Pc(1401) Class83 local1401 = new Class83(Static56.aClass71_Sub1_3.method2139(Static174.aClass62_1302, Static69.aClass62_484));
				Static216.method3193(local1401);
				Static137.aClass62_1027 = Static67.aClass62_477;
				Static111.anInt2425 = 80;
				Static19.anInt451 = 130;
			} else {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static65.aClass62_455, Static197.aClass62_1428 });
				Static111.anInt2425 = 80;
			}
		} else if (Static19.anInt451 == 130) {
			if (!Static173.aClass71_Sub1_21.method2113()) {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static92.aClass62_726, Static119.method1865(Static173.aClass71_Sub1_21.method2133() * 4 / 5), Static31.aClass62_231 });
				Static111.anInt2425 = 85;
			} else if (!Static179.aClass71_Sub1_23.method2113()) {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static92.aClass62_726, Static119.method1865(Static179.aClass71_Sub1_23.method2133() / 6 + 80), Static31.aClass62_231 });
				Static111.anInt2425 = 85;
			} else if (Static86.aClass71_Sub1_20.method2113()) {
				Static111.anInt2425 = 100;
				Static137.aClass62_1027 = Static105.aClass62_802;
				Static19.anInt451 = 140;
			} else {
				Static137.aClass62_1027 = Static169.method2460(new Class62[] { Static92.aClass62_726, Static119.method1865(Static86.aClass71_Sub1_20.method2133() / 20 + 96), Static31.aClass62_231 });
				Static111.anInt2425 = 85;
			}
		} else if (Static19.anInt451 == 140) {
			Static153.aClass71_Sub1_16.method2118(false);
			Static63.aClass71_Sub1_5.method2118(true);
			Static59.aClass71_Sub1_4.method2118(true);
			Static86.aClass71_Sub1_20.method2118(true);
			Static56.aClass71_Sub1_3.method2118(true);
			Static2.method55(10);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method521() {
		@Pc(7) boolean local7 = false;
		@Pc(10) boolean local10 = Static113.method1745();
		if (local10 && Static164.aBoolean148 && Static96.aClass3_1 != null) {
			Static96.aClass3_1.method105();
		}
		if (Static197.aBoolean180) {
			Static197.aBoolean180 = false;
			local7 = true;
		}
		if (Static87.anInt1821 == 0) {
			Static7.method1720(local7, Static111.anInt2425, Static137.aClass62_1027, null);
		} else if (Static87.anInt1821 == 5 || Static87.anInt1821 == 10 || Static87.anInt1821 == 20) {
			Static170.method2499(Static47.aClass2_Sub1_Sub12_3, Static10.aClass2_Sub1_Sub12_1);
		} else if (Static87.anInt1821 == 25) {
			@Pc(93) int local93;
			if (Static41.anInt4504 == 1) {
				if (Static112.anInt2448 < Static89.anInt1941) {
					Static112.anInt2448 = Static89.anInt1941;
				}
				local93 = (Static112.anInt2448 - Static89.anInt1941) * 50 / Static112.anInt2448;
				Static175.method2549(Static169.method2460(new Class62[] { Static17.aClass62_132, Static82.aClass62_577, Static119.method1865(local93), Static58.aClass62_394 }), false);
			} else if (Static41.anInt4504 == 2) {
				if (Static33.anInt787 > Static119.anInt2616) {
					Static119.anInt2616 = Static33.anInt787;
				}
				local93 = (Static119.anInt2616 - Static33.anInt787) * 50 / Static119.anInt2616 + 50;
				Static175.method2549(Static169.method2460(new Class62[] { Static17.aClass62_132, Static82.aClass62_577, Static119.method1865(local93), Static58.aClass62_394 }), false);
			} else {
				Static175.method2549(Static17.aClass62_132, false);
			}
		} else if (Static87.anInt1821 == 30) {
			Static105.method1647();
		} else if (Static87.anInt1821 == 40) {
			Static175.method2549(Static169.method2460(new Class62[] { Static96.aClass62_762, Static28.aClass62_203, Static117.aClass62_893 }), false);
		}
		@Pc(204) Canvas local204 = Static139.aCanvas1;
		@Pc(224) Graphics local224;
		@Pc(232) int local232;
		if (Static87.anInt1821 == 30 && Static182.anInt3831 == 0 && !local7) {
			try {
				local224 = local204.getGraphics();
				for (local232 = 0; local232 < Static29.anInt713; local232++) {
					if (Static32.aBooleanArray3[local232]) {
						Static127.aClass46_1.method2381(Static209.anIntArray391[local232], Static115.anIntArray237[local232], local224, Static11.anIntArray26[local232], Static181.anIntArray332[local232]);
						Static32.aBooleanArray3[local232] = false;
					}
				}
			} catch (@Pc(292) Exception local292) {
				local204.repaint();
			}
		} else if (Static87.anInt1821 > 0) {
			try {
				local224 = local204.getGraphics();
				Static127.aClass46_1.method2380(local224);
				for (local232 = 0; local232 < Static29.anInt713; local232++) {
					Static32.aBooleanArray3[local232] = false;
				}
			} catch (@Pc(248) Exception local248) {
				local204.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	@Override
	protected void method520() {
		Static2.aShortArray7 = Static211.aShortArray156 = Static131.aShortArray56 = new short[256];
		Static5.anInt171 = Static187.anInt3891 == 0 ? 43594 : Static74.anInt1521 + 40000;
		Static208.anInt4336 = Static5.anInt171;
		Static104.anInt2343 = Static187.anInt3891 == 0 ? 443 : Static74.anInt1521 + 50000;
		if (Static65.anInt1369 == 1) {
			Static163.aShortArray118 = Static54.aShortArray32;
			Static140.aShortArrayArray3 = Static127.aShortArrayArray2;
			Static151.aShortArrayArray4 = Static5.aShortArrayArray1;
			Static136.aShortArray160 = Static140.aShortArray108;
		} else {
			Static163.aShortArray118 = Static63.aShortArray36;
			Static136.aShortArray160 = Static213.aShortArray157;
			Static151.aShortArrayArray4 = Static168.aShortArrayArray5;
			Static140.aShortArrayArray3 = Static211.aShortArrayArray6;
		}
		Static34.method597();
		Static123.method3145(Static139.aCanvas1);
		Static56.method791(Static139.aCanvas1);
		Static172.aClass20_2 = Static178.method2578();
		if (Static172.aClass20_2 != null) {
			Static172.aClass20_2.method2653(Static139.aCanvas1);
		}
		Static196.anInt4043 = Static75.anInt1525;
		try {
			if (Static170.aClass41_3.aClass88_2 != null) {
				Static64.aClass9_1 = new Class9(Static170.aClass41_3.aClass88_2, 5200, 0);
				for (@Pc(84) int local84 = 0; local84 < 24; local84++) {
					Static111.aClass9Array1[local84] = new Class9(Static170.aClass41_3.aClass88Array1[local84], 6000, 0);
				}
				Static200.aClass9_5 = new Class9(Static170.aClass41_3.aClass88_3, 6000, 0);
				Static121.aClass98_1 = new Class98(255, Static64.aClass9_1, Static200.aClass9_5, 500000);
				Static154.aClass9_2 = new Class9(Static170.aClass41_3.aClass88_4, 24, 0);
				Static170.aClass41_3.aClass88Array1 = null;
				Static170.aClass41_3.aClass88_3 = null;
				Static170.aClass41_3.aClass88_2 = null;
				Static170.aClass41_3.aClass88_4 = null;
			}
		} catch (@Pc(142) IOException local142) {
			Static64.aClass9_1 = null;
			Static200.aClass9_5 = null;
			Static121.aClass98_1 = null;
			Static154.aClass9_2 = null;
		}
		Static216.aClass62_1539 = Static73.aClass62_514;
		if (Static187.anInt3891 != 0) {
			Static137.aBoolean126 = true;
		}
	}
}
