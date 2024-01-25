import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
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
			if (arg0.length != 4) {
				Static162.method3042("argument count");
			}
			Static151.anInt3096 = Integer.parseInt(arg0[0]);
			Static183.anInt3622 = 2;
			if (arg0[1].equals("live")) {
				Static158.anInt3190 = 0;
			} else if (arg0[1].equals("rc")) {
				Static158.anInt3190 = 1;
			} else if (arg0[1].equals("wip")) {
				Static158.anInt3190 = 2;
			} else {
				Static162.method3042("modewhat");
			}
			Static21.anInt455 = Static52.method1201(arg0[2]);
			if (Static21.anInt455 == -1) {
				if (arg0[2].equals("english")) {
					Static21.anInt455 = 0;
				} else if (arg0[2].equals("german")) {
					Static21.anInt455 = 1;
				} else {
					Static162.method3042("language");
				}
			}
			Static36.aBoolean76 = false;
			Static18.aBoolean56 = false;
			if (arg0[3].equals("game0")) {
				Static41.anInt830 = 0;
			} else if (arg0[3].equals("game1")) {
				Static41.anInt830 = 1;
			} else {
				Static162.method3042("game");
			}
			Static94.anInt2145 = 0;
			Static95.anInt6376 = Static41.anInt830;
			Static331.aString28 = "";
			Static50.anInt1114 = 0;
			@Pc(122) client local122 = new client();
			Static293.aClient1 = local122;
			local122.method1027(Static41.anInt830 == 1 ? "stellardawn" : "runescape", Static158.anInt3190 + 32);
			Static348.aFrame2.setLocation(40, 40);
		} catch (@Pc(147) Exception local147) {
			Static69.method1566(null, local147);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1018() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static244.method4199();
		Static81.aClass136_1 = new Class136(Static177.aClass168_2);
		Static193.aClass165_1 = new Class165();
		if (Static158.anInt3190 != 0) {
			Static282.aByteArrayArray17 = new byte[50][];
		}
		Static162.method3043(Static177.aClass168_2);
		if (Static183.anInt3622 == 0) {
			Static149.aString26 = this.getCodeBase().getHost();
			Static109.anInt2409 = 43594;
			Static275.anInt5623 = 443;
		} else if (Static183.anInt3622 == 1) {
			Static149.aString26 = this.getCodeBase().getHost();
			Static109.anInt2409 = Static151.anInt3096 + 40000;
			Static275.anInt5623 = Static151.anInt3096 + 50000;
		} else if (Static183.anInt3622 == 2) {
			Static149.aString26 = "127.0.0.1";
			Static109.anInt2409 = Static151.anInt3096 + 40000;
			Static275.anInt5623 = Static151.anInt3096 + 50000;
		}
		Static165.anInt3323 = Static109.anInt2409;
		Static163.anInt1490 = Static275.anInt5623;
		Static85.aString19 = Static149.aString26;
		Static34.anInt599 = Static109.anInt2409;
		Static256.anInt5074 = Static34.anInt599;
		if (Static41.anInt830 == 1) {
			Static260.anInt5270 = 16777215;
			Static262.aShortArray78 = Static269.aShortArray79;
			Static296.aBoolean536 = true;
			Static276.aShortArrayArray6 = Static33.aShortArrayArray1;
			Static96.aShortArray52 = Static233.aShortArray74;
			Static282.aShortArrayArray7 = Static86.aShortArrayArray2;
			Static332.anInt3541 = 0;
		} else {
			Static262.aShortArray78 = Static346.aShortArray113;
			Static96.aShortArray52 = Static71.aShortArray50;
			Static282.aShortArrayArray7 = Static116.aShortArrayArray3;
			Static276.aShortArrayArray6 = Static171.aShortArrayArray5;
		}
		Static330.aShortArray102 = Static189.aShortArray81 = Static316.aShortArray100 = Static306.aShortArray86 = new short[256];
		if (Static268.anInt5456 == 3) {
			Static261.anInt5114 = Static151.anInt3096;
		}
		Static92.aClass97_2 = Static146.method2860(Static240.aCanvas4);
		Static284.aClass61_1 = Static308.method4632(Static240.aCanvas4);
		Static22.aClass123_1 = Static37.method859();
		if (Static22.aClass123_1 != null) {
			Static22.aClass123_1.method3696(Static240.aCanvas4);
		}
		Static237.anInt4540 = Static268.anInt5456;
		try {
			if (Static177.aClass168_2.aClass130_1 != null) {
				Static167.aClass174_4 = new Class174(Static177.aClass168_2.aClass130_1, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Static104.aClass174Array3[local171] = new Class174(Static177.aClass168_2.aClass130Array1[local171], 6000, 0);
				}
				Static111.aClass174_3 = new Class174(Static177.aClass168_2.aClass130_3, 6000, 0);
				Static154.aClass71_5 = new Class71(255, Static167.aClass174_4, Static111.aClass174_3, 500000);
				Static241.aClass174_5 = new Class174(Static177.aClass168_2.aClass130_2, 24, 0);
				Static177.aClass168_2.aClass130Array1 = null;
				Static177.aClass168_2.aClass130_2 = null;
				Static177.aClass168_2.aClass130_1 = null;
				Static177.aClass168_2.aClass130_3 = null;
			}
		} catch (@Pc(229) IOException local229) {
			Static241.aClass174_5 = null;
			Static167.aClass174_4 = null;
			Static111.aClass174_3 = null;
			Static154.aClass71_5 = null;
		}
		if (Static183.anInt3622 != 0) {
			Static147.aBoolean25 = true;
		}
		if (Static41.anInt830 == 0) {
			Static333.aString62 = Static41.aClass93_11.method2819(Static21.anInt455);
		} else if (Static41.anInt830 == 1) {
			Static333.aString62 = Static130.aClass93_90.method2819(Static21.anInt455);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1038(@OriginalArg(0) int arg0) {
		Static226.aClass173_3 = null;
		Static302.aClass193_7 = null;
		Static193.aClass165_1.anInt5431++;
		Static211.anInt4085 = 0;
		Static193.aClass165_1.anInt5432 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1017() {
		if (Static263.anInt5396 == 1000) {
			return;
		}
		@Pc(20) long local20 = Static15.method627() / 1000000L - Static357.aLong217;
		Static357.aLong217 = Static15.method627() / 1000000L;
		@Pc(28) boolean local28 = Static347.method3869();
		if (local28 && Static8.aBoolean11 && Static124.aClass94_2 != null) {
			Static124.aClass94_2.method5974();
		}
		if (Static263.anInt5396 == 30 || Static263.anInt5396 == 10) {
			if (Static26.aLong14 != 0L && Static51.method1197() > Static26.aLong14) {
				Static46.method1099(Static129.method2627(), false, Static228.anInt934, Static234.anInt4499);
			} else if (Static147.aClass4_2.method4211() && Static253.aBoolean604) {
				Static211.method3771();
			}
		}
		@Pc(91) int local91;
		@Pc(95) int local95;
		if (Static335.aFrame1 == null) {
			@Pc(83) Container local83;
			if (Static348.aFrame2 == null) {
				local83 = Static177.aClass168_2.anApplet1;
			} else {
				local83 = Static348.aFrame2;
			}
			local91 = local83.getSize().width;
			local95 = local83.getSize().height;
			if (local83 == Static348.aFrame2) {
				@Pc(101) Insets local101 = Static348.aFrame2.getInsets();
				local95 -= local101.bottom + local101.top;
				local91 -= local101.right + local101.left;
			}
			if (local91 != Static33.anInt591 || Static1.anInt16 != local95) {
				if (Static147.aClass4_2 == null || Static147.aClass4_2.method4231()) {
					Static244.method4199();
				} else {
					Static1.anInt16 = local95;
					Static33.anInt591 = local91;
				}
				Static26.aLong14 = Static51.method1197() + 500L;
			}
		}
		if (Static335.aFrame1 != null && !Static81.aBoolean158 && (Static263.anInt5396 == 30 || Static263.anInt5396 == 10)) {
			Static46.method1099(Static6.anInt150, false, -1, -1);
		}
		@Pc(161) boolean local161 = false;
		if (Static157.aBoolean286) {
			local161 = true;
			Static157.aBoolean286 = false;
		}
		if (local161) {
			Static183.method3318();
		}
		if (Static147.aClass4_2 != null && Static147.aClass4_2.method4213() || Static129.method2627() != 1) {
			Static253.method5944();
		}
		if (Static263.anInt5396 == 0) {
			Static256.method4642(Static341.aString64, Static113.anInt2538, Static34.aColorArray1[Static95.anInt6376], Static169.aColorArray2[Static95.anInt6376], local161, Static187.aColorArray3[Static95.anInt6376]);
		} else if (Static263.anInt5396 == 5) {
			Static315.method5543(Static56.aClass37_1, Static34.aColorArray1[Static95.anInt6376].getRGB(), Static169.aColorArray2[Static95.anInt6376].getRGB(), local161 | Static147.aClass4_2.method4213(), Static187.aColorArray3[Static95.anInt6376].getRGB(), Static147.aClass4_2);
		} else if (Static263.anInt5396 == 10) {
			Static313.method5509();
		} else if (Static263.anInt5396 == 25 || Static263.anInt5396 == 28) {
			if (Static203.anInt3381 == 1) {
				if (Static97.anInt6861 > Static348.anInt6911) {
					Static348.anInt6911 = Static97.anInt6861;
				}
				local91 = (Static348.anInt6911 - Static97.anInt6861) * 50 / Static348.anInt6911;
				Static224.method3945(true, Static111.aClass93_46.method2819(Static21.anInt455) + "<br>(" + local91 + "%)", Static193.aClass37_2);
			} else if (Static203.anInt3381 == 2) {
				if (Static79.anInt1746 < Static179.anInt3568) {
					Static79.anInt1746 = Static179.anInt3568;
				}
				local91 = (Static79.anInt1746 - Static179.anInt3568) * 50 / Static79.anInt1746 + 50;
				Static224.method3945(true, Static111.aClass93_46.method2819(Static21.anInt455) + "<br>(" + local91 + "%)", Static193.aClass37_2);
			} else {
				Static224.method3945(true, Static111.aClass93_46.method2819(Static21.anInt455), Static193.aClass37_2);
			}
		} else if (Static263.anInt5396 == 30) {
			Static327.method5741(local20);
		} else if (Static263.anInt5396 == 40) {
			Static224.method3945(true, Static277.aClass93_102.method2819(Static21.anInt455) + "<br>" + Static56.aClass93_17.method2819(Static21.anInt455), Static193.aClass37_2);
		}
		if (Static280.anInt5692 == 3) {
			for (local91 = 0; local91 < Static53.anInt1131; local91++) {
				@Pc(395) Rectangle local395 = Class20_Sub1.aRectangleArray1[local91];
				if (Static19.aBooleanArray3[local91]) {
					Static147.aClass4_2.method4261(local395.y, local395.x, local395.height, local395.width, -1996553985);
				} else if (Static135.aBooleanArray12[local91]) {
					Static147.aClass4_2.method4261(local395.y, local395.x, local395.height, local395.width, -1996554240);
				}
			}
		}
		if (Static236.method4072()) {
			Static55.method4428(Static147.aClass4_2);
		}
		if ((Static263.anInt5396 == 30 || Static263.anInt5396 == 10) && Static280.anInt5692 == 0 && Static129.method2627() == 1 && !local161 && Static268.aString51.equals("1.1")) {
			local91 = 0;
			for (local95 = 0; local95 < Static53.anInt1131; local95++) {
				if (Static135.aBooleanArray12[local95]) {
					Static135.aBooleanArray12[local95] = false;
					Static300.aRectangleArray4[local91++] = Class20_Sub1.aRectangleArray1[local95];
				}
			}
			Static147.aClass4_2.method4281(Static300.aRectangleArray4, local91);
		} else if (Static263.anInt5396 != 0) {
			Static147.aClass4_2.method4298();
			for (local91 = 0; local91 < Static53.anInt1131; local91++) {
				Static135.aBooleanArray12[local91] = false;
			}
		}
		if (Static349.anInt6923 == 0) {
			Static102.method2276(15L);
		} else if (Static349.anInt6923 == 1) {
			Static102.method2276(10L);
		} else if (Static349.anInt6923 == 2) {
			Static102.method2276(5L);
		} else if (Static349.anInt6923 == 3) {
			Static102.method2276(2L);
		}
		if (Static19.aBoolean57) {
			Static249.method4528();
		}
		if (Static259.aBoolean475 && Static263.anInt5396 == 10 && Static111.anInt2471 != -1) {
			Static259.aBoolean475 = false;
			Static106.method2337(Static177.aClass168_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1040() {
		@Pc(9) int local9;
		if (!Static259.aBoolean475) {
			for (local9 = 0; local9 < Static49.anInt1100; local9++) {
				if (Static138.aClass69Array1[local9].method5546() == 's' || Static138.aClass69Array1[local9].method5546() == 'S') {
					Static259.aBoolean475 = true;
					break;
				}
			}
		}
		@Pc(56) int local56;
		if (Static169.anInt3465 == 0) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local56 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static51.method1197();
			if (Static91.aLong58 == 0L) {
				Static91.aLong58 = local59;
			}
			if (local56 > 16384 && local59 - Static91.aLong58 < 5000L) {
				if (local59 - Static101.aLong67 > 1000L) {
					System.gc();
					Static101.aLong67 = local59;
				}
				Static341.aString64 = Static355.aClass93_119.method2819(Static21.anInt455);
				Static113.anInt2538 = 5;
			} else {
				Static341.aString64 = Static141.aClass93_58.method2819(Static21.anInt455);
				Static169.anInt3465 = 10;
				Static113.anInt2538 = 5;
			}
		} else if (Static169.anInt3465 == 10) {
			for (local9 = 0; local9 < 4; local9++) {
				Static169.aClass151Array1[local9] = Static177.method3261(Static95.anInt6381, Static237.anInt4532);
			}
			Static341.aString64 = Static303.aClass93_106.method2819(Static21.anInt455);
			Static169.anInt3465 = 20;
			Static113.anInt2538 = 10;
		} else if (Static169.anInt3465 == 20) {
			if (Static322.aClass153_1 == null) {
				Static322.aClass153_1 = new Class153(Static193.aClass165_1, Static81.aClass136_1);
			}
			if (Static322.aClass153_1.method4139()) {
				Static86.aClass191_55 = Static296.method5239(false, 0, true);
				Static275.aClass191_181 = Static296.method5239(false, 1, true);
				Static31.aClass191_18 = Static296.method5239(false, 2, true);
				Static178.aClass191_111 = Static296.method5239(false, 3, true);
				Static299.aClass191_164 = Static296.method5239(false, 4, true);
				Static122.aClass191_148 = Static296.method5239(true, 5, true);
				Static91.aClass191_59 = Static296.method5239(true, 6, false);
				Static201.aClass191_132 = Static296.method5239(false, 7, true);
				Static59.aClass191_35 = Static296.method5239(false, 8, true);
				Static229.aClass191_78 = Static296.method5239(false, 9, true);
				Static261.aClass191_169 = Static296.method5239(false, 10, true);
				Static198.aClass191_129 = Static296.method5239(false, 11, true);
				Static253.aClass191_222 = Static296.method5239(false, 12, true);
				Static318.aClass191_204 = Static296.method5239(false, 13, true);
				Static342.aClass191_221 = Static296.method5239(false, 14, false);
				Static355.aClass191_223 = Static296.method5239(false, 15, true);
				Static184.aClass191_116 = Static296.method5239(false, 16, true);
				Static233.aClass191_150 = Static296.method5239(false, 17, true);
				Static85.aClass191_53 = Static296.method5239(false, 18, true);
				Static68.aClass191_41 = Static296.method5239(false, 19, true);
				Static278.aClass191_182 = Static296.method5239(false, 20, true);
				Static137.aClass191_88 = Static296.method5239(false, 21, true);
				Static205.aClass191_135 = Static296.method5239(false, 22, true);
				Static133.aClass191_84 = Static296.method5239(true, 23, true);
				Static177.aClass191_110 = Static296.method5239(false, 24, true);
				Static179.aClass191_112 = Static296.method5239(false, 25, true);
				Static46.aClass191_26 = Static296.method5239(true, 26, true);
				Static186.aClass191_174 = Static296.method5239(false, 27, true);
				Static211.aClass191_140 = Static296.method5239(true, 28, true);
				Static341.aString64 = Static193.aClass93_74.method2819(Static21.anInt455);
				Static113.anInt2538 = 15;
				Static169.anInt3465 = 30;
			} else {
				Static341.aString64 = Static79.aClass93_26.method2819(Static21.anInt455);
				Static113.anInt2538 = 12;
			}
		} else if (Static169.anInt3465 == 30) {
			local9 = 0;
			for (local56 = 0; local56 < 29; local56++) {
				local9 += Static213.aClass121_Sub1Array1[local56].method4867() * Static271.anIntArray406[local56] / 100;
			}
			if (local9 == 100) {
				Static341.aString64 = Static213.aClass93_81.method2819(Static21.anInt455);
				Static113.anInt2538 = 20;
				Static223.method3931(Static59.aClass191_35);
				Static179.method3267(Static59.aClass191_35);
				Static169.anInt3465 = 40;
			} else {
				if (local9 != 0) {
					Static341.aString64 = Static187.aClass93_73.method2819(Static21.anInt455) + local9 + "%";
				}
				Static113.anInt2538 = 20;
			}
		} else if (Static169.anInt3465 == 40) {
			if (Static211.aClass191_140.method5452()) {
				this.method1046(Static211.aClass191_140.method5448(1));
				Static341.aString64 = Static138.aClass93_56.method2819(Static21.anInt455);
				Static113.anInt2538 = 25;
				Static169.anInt3465 = 50;
			} else {
				Static341.aString64 = Static165.aClass93_68.method2819(Static21.anInt455) + Static211.aClass191_140.method5442() + "%";
				Static113.anInt2538 = 25;
			}
		} else if (Static169.anInt3465 == 50) {
			Static59.method1350(Static103.aBoolean202);
			Static258.aClass2_Sub3_Sub3_2 = new Class2_Sub3_Sub3();
			Static258.aClass2_Sub3_Sub3_2.method1758();
			Static124.aClass94_2 = Static39.method936(0, 22050, Static240.aCanvas4, Static177.aClass168_2);
			Static124.aClass94_2.method5967(Static258.aClass2_Sub3_Sub3_2);
			Static326.method5737(Static299.aClass191_164, Static342.aClass191_221, Static355.aClass191_223, Static258.aClass2_Sub3_Sub3_2);
			Static221.aClass94_3 = Static39.method936(1, 2048, Static240.aCanvas4, Static177.aClass168_2);
			Static313.aClass2_Sub3_Sub1_2 = new Class2_Sub3_Sub1();
			Static221.aClass94_3.method5967(Static313.aClass2_Sub3_Sub1_2);
			Static351.aClass46_8 = new Class46(22050, Static65.anInt1429);
			Static102.anInt2329 = Static91.aClass191_59.method5446("scape main");
			Static341.aString64 = Static318.aClass93_111.method2819(Static21.anInt455);
			Static113.anInt2538 = 30;
			Static169.anInt3465 = 60;
		} else if (Static169.anInt3465 == 60) {
			local9 = Static65.method1488(Static59.aClass191_35, Static318.aClass191_204);
			local56 = Static278.method5041();
			if (local9 < local56) {
				Static341.aString64 = Static25.aClass93_21.method2819(Static21.anInt455) + local9 * 100 / local56 + "%";
				Static113.anInt2538 = 35;
			} else {
				Static341.aString64 = Static286.aClass93_104.method2819(Static21.anInt455);
				Static169.anInt3465 = 70;
				Static113.anInt2538 = 35;
			}
		} else if (Static169.anInt3465 == 70) {
			local9 = Static73.method3196(Static59.aClass191_35);
			local56 = Static235.method4068();
			if (local9 < local56) {
				Static341.aString64 = Static183.aClass93_72.method2819(Static21.anInt455) + local9 * 100 / local56 + "%";
				Static113.anInt2538 = 40;
			} else {
				Static341.aString64 = Static179.aClass93_69.method2819(Static21.anInt455);
				Static169.anInt3465 = 80;
				Static113.anInt2538 = 40;
			}
		} else if (Static169.anInt3465 == 80) {
			if (Static46.aClass191_26.method5452()) {
				Static274.anInterface7_5 = new Class202(Static46.aClass191_26, Static229.aClass191_78, Static59.aClass191_35);
				Static341.aString64 = Static214.aClass93_82.method2819(Static21.anInt455);
				Static169.anInt3465 = 90;
				Static113.anInt2538 = 45;
			} else {
				Static341.aString64 = Static39.aClass93_10.method2819(Static21.anInt455) + Static46.aClass191_26.method5442() + "%";
				Static113.anInt2538 = 45;
			}
		} else if (Static169.anInt3465 == 90) {
			Static341.aString64 = Static336.aClass93_115.method2819(Static21.anInt455);
			Static113.anInt2538 = 50;
			Static169.anInt3465 = 95;
		} else if (Static169.anInt3465 == 95) {
			if (Static259.aBoolean475) {
				Static84.anInt1829 = 0;
				Static343.anInt6875 = 0;
				Static6.anInt150 = 1;
				Static114.anInt6585 = 0;
				Static7.anInt152 = 0;
			}
			Static259.aBoolean475 = true;
			Static106.method2337(Static177.aClass168_2);
			Static99.method2235();
			Static313.method5504(false, Static84.anInt1829);
			Static341.aString64 = Static98.aClass93_37.method2819(Static21.anInt455);
			Static113.anInt2538 = 55;
			Static169.anInt3465 = 100;
		} else if (Static169.anInt3465 == 100) {
			Static319.method5612(Static147.aClass4_2, Static59.aClass191_35, Static318.aClass191_204);
			Static341.aString64 = Static53.aClass93_15.method2819(Static21.anInt455);
			Static113.anInt2538 = 60;
			Static125.method2616(5);
			Static169.anInt3465 = 110;
		} else if (Static169.anInt3465 == 110) {
			Static31.aClass191_18.method5452();
			local9 = Static31.aClass191_18.method5442();
			Static184.aClass191_116.method5452();
			local9 += Static184.aClass191_116.method5442();
			Static233.aClass191_150.method5452();
			local9 += Static233.aClass191_150.method5442();
			Static85.aClass191_53.method5452();
			local9 += Static85.aClass191_53.method5442();
			Static68.aClass191_41.method5452();
			local9 += Static68.aClass191_41.method5442();
			Static278.aClass191_182.method5452();
			local9 += Static278.aClass191_182.method5442();
			Static137.aClass191_88.method5452();
			local9 += Static137.aClass191_88.method5442();
			Static205.aClass191_135.method5452();
			local9 += Static205.aClass191_135.method5442();
			Static177.aClass191_110.method5452();
			local9 += Static177.aClass191_110.method5442();
			Static179.aClass191_112.method5452();
			local9 += Static179.aClass191_112.method5442();
			Static186.aClass191_174.method5452();
			local9 += Static186.aClass191_174.method5442();
			if (local9 < 1100) {
				Static341.aString64 = Static143.aClass93_61.method2819(Static21.anInt455) + local9 / 11 + "%";
				Static113.anInt2538 = 65;
			} else {
				Static134.method2692(Static31.aClass191_18);
				Static83.method1899(Static31.aClass191_18);
				Static137.method2724(Static31.aClass191_18);
				Static297.method5243(Static31.aClass191_18, Static201.aClass191_132);
				Static7.method214(Static201.aClass191_132, Static184.aClass191_116, Static21.anInt455);
				Static31.method770(Static21.anInt455, Static201.aClass191_132, Static85.aClass191_53);
				Static10.method377(Static21.anInt455, Static201.aClass191_132, Static68.aClass191_41);
				Static210.method3756(Static31.aClass191_18);
				Static54.method1231(Static278.aClass191_182, Static275.aClass191_181, Static86.aClass191_55);
				Static189.method5120(Static31.aClass191_18);
				Static148.method2867(Static137.aClass191_88, Static201.aClass191_132);
				Static79.method1814(Static205.aClass191_135);
				Static236.method4077(Static31.aClass191_18);
				Static300.method5150(Static201.aClass191_132, Static178.aClass191_111, Static318.aClass191_204, Static59.aClass191_35);
				Static264.method4800(Static31.aClass191_18);
				Static117.method2498(Static233.aClass191_150);
				Static133.method2666(Static179.aClass191_112, Static177.aClass191_110, new Class19());
				Static304.method5345(Static179.aClass191_112, Static177.aClass191_110);
				Static227.method3971(Static31.aClass191_18);
				Static159.method3013(Static31.aClass191_18);
				Static94.method2131(Static31.aClass191_18);
				Static269.method4864(Static59.aClass191_35, Static31.aClass191_18);
				Static144.method2822(Static31.aClass191_18, Static59.aClass191_35);
				Static269.method4873(Static31.aClass191_18);
				Static61.method1386(Static59.aClass191_35, Static31.aClass191_18);
				Static147.method414(Static31.aClass191_18);
				Static226.method3032(Static31.aClass191_18);
				Static341.aString64 = Static275.aClass93_100.method2819(Static21.anInt455);
				Static113.anInt2538 = 65;
				Static182.method3300();
				Static169.anInt3465 = 120;
			}
		} else if (Static169.anInt3465 == 120) {
			local9 = Static313.method5508(Static59.aClass191_35);
			local56 = Static225.method3965();
			if (local56 > local9) {
				Static341.aString64 = Static10.aClass93_5.method2819(Static21.anInt455) + local9 * 100 / local56 + "%";
				Static113.anInt2538 = 70;
			} else {
				Static249.method4524(Static147.aClass4_2, Static59.aClass191_35);
				Static351.method4761(Static326.aClass31Array17);
				Static341.aString64 = Static79.aClass93_25.method2819(Static21.anInt455);
				Static113.anInt2538 = 70;
				Static169.anInt3465 = 130;
			}
		} else if (Static169.anInt3465 == 130) {
			Static341.aString64 = Static58.aClass93_20.method2819(Static21.anInt455);
			Static113.anInt2538 = 75;
			Static169.anInt3465 = 140;
		} else if (Static169.anInt3465 == 140) {
			if (Static261.aClass191_169.method5438("huffman", "")) {
				@Pc(1138) Class197 local1138 = new Class197(Static261.aClass191_169.method5436("huffman", ""));
				Static137.method2721(local1138);
				Static341.aString64 = Static207.aClass93_110.method2819(Static21.anInt455);
				Static113.anInt2538 = 80;
				Static169.anInt3465 = 150;
			} else {
				Static341.aString64 = Static81.aClass93_28.method2819(Static21.anInt455) + "0%";
				Static113.anInt2538 = 80;
			}
		} else if (Static169.anInt3465 == 150) {
			if (!Static178.aClass191_111.method5452()) {
				Static341.aString64 = Static241.aClass93_89.method2819(Static21.anInt455) + Static178.aClass191_111.method5442() * 3 / 4 + "%";
				Static113.anInt2538 = 85;
			} else if (!Static253.aClass191_222.method5452()) {
				Static341.aString64 = Static241.aClass93_89.method2819(Static21.anInt455) + (Static253.aClass191_222.method5442() / 10 + 75) + "%";
				Static113.anInt2538 = 85;
			} else if (!Static318.aClass191_204.method5452()) {
				Static341.aString64 = Static241.aClass93_89.method2819(Static21.anInt455) + (Static318.aClass191_204.method5442() / 20 + 85) + "%";
				Static113.anInt2538 = 85;
			} else if (Static133.aClass191_84.method5455("details")) {
				Static127.method1616(Static133.aClass191_84);
				Static129.method2630(Static186.aClass191_174);
				Static336.method5825(Static201.aClass191_132, Static274.anInterface7_5);
				Static341.aString64 = Static99.aClass93_40.method2819(Static21.anInt455);
				Static113.anInt2538 = 85;
				Static169.anInt3465 = 160;
			} else {
				Static341.aString64 = Static241.aClass93_89.method2819(Static21.anInt455) + (Static133.aClass191_84.method5458("details") / 10 + 90) + "%";
				Static113.anInt2538 = 85;
			}
		} else if (Static169.anInt3465 == 160) {
			local9 = Static55.method4454();
			if (local9 == -1) {
				Static341.aString64 = Static196.aClass93_76.method2819(Static21.anInt455);
				Static113.anInt2538 = 90;
			} else if (local9 == 7 || local9 == 9) {
				this.method1021("worldlistfull");
				Static125.method2616(1000);
			} else if (Static322.aBoolean573) {
				Static341.aString64 = Static103.aClass93_44.method2819(Static21.anInt455);
				Static169.anInt3465 = 170;
				Static113.anInt2538 = 90;
			} else {
				this.method1021("worldlistio_" + local9);
				Static125.method2616(1000);
			}
		} else if (Static169.anInt3465 == 170) {
			Static5.aBooleanArray23 = new boolean[Static328.anInt6643];
			Static31.anIntArray37 = new int[Static328.anInt6643];
			Static102.aStringArray14 = new String[Static285.anInt5783];
			for (local9 = 0; local9 < Static328.anInt6643; local9++) {
				if (Static20.method679(local9).anInt2650 == 0) {
					Static5.aBooleanArray23[local9] = true;
					Static170.anInt3040++;
				}
				Static31.anIntArray37[local9] = -1;
			}
			Static250.method4556();
			Static20.anInt435 = Static178.aClass191_111.method5446("loginscreen");
			Static122.aClass191_148.method5441(false);
			Static91.aClass191_59.method5441(true);
			Static59.aClass191_35.method5441(true);
			Static318.aClass191_204.method5441(true);
			Static261.aClass191_169.method5441(true);
			Static178.aClass191_111.method5441(true);
			Static31.aClass191_18.anInt6270 = 2;
			Static19.aBoolean57 = true;
			Static233.aClass191_150.anInt6270 = 2;
			Static184.aClass191_116.anInt6270 = 2;
			Static85.aClass191_53.anInt6270 = 2;
			Static68.aClass191_41.anInt6270 = 2;
			Static278.aClass191_182.anInt6270 = 2;
			Static137.aClass191_88.anInt6270 = 2;
			Static46.method1099(Static6.anInt150, false, -1, -1);
			Static341.aString64 = Static336.aClass93_116.method2819(Static21.anInt455);
			Static169.anInt3465 = 180;
			Static113.anInt2538 = 95;
		} else if (Static169.anInt3465 == 180) {
			Static117.method2497(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1041() {
		if (Static193.aClass165_1.anInt5431 > Static82.anInt2746) {
			Static279.anInt5689 = (Static193.aClass165_1.anInt5431 - 1) * 5 * 50;
			if (Static165.anInt3323 == Static256.anInt5074) {
				Static256.anInt5074 = Static163.anInt1490;
			} else {
				Static256.anInt5074 = Static165.anInt3323;
			}
			if (Static279.anInt5689 > 3000) {
				Static279.anInt5689 = 3000;
			}
			if (Static193.aClass165_1.anInt5431 >= 2 && Static193.aClass165_1.anInt5432 == 6) {
				this.method1021("js5connect_outofdate");
				Static263.anInt5396 = 1000;
				return;
			}
			if (Static193.aClass165_1.anInt5431 >= 4 && Static193.aClass165_1.anInt5432 == -1) {
				this.method1021("js5crc");
				Static263.anInt5396 = 1000;
				return;
			}
			if (Static193.aClass165_1.anInt5431 >= 4 && (Static263.anInt5396 == 0 || Static263.anInt5396 == 5)) {
				if (Static193.aClass165_1.anInt5432 == 7 || Static193.aClass165_1.anInt5432 == 9) {
					this.method1021("js5connect_full");
				} else if (Static193.aClass165_1.anInt5432 > 0) {
					this.method1021("js5connect");
				} else {
					this.method1021("js5io");
				}
				Static263.anInt5396 = 1000;
				return;
			}
		}
		Static82.anInt2746 = Static193.aClass165_1.anInt5431;
		if (Static279.anInt5689 > 0) {
			Static279.anInt5689--;
			return;
		}
		try {
			if (Static211.anInt4085 == 0) {
				Static302.aClass193_7 = Static177.aClass168_2.method4848(Static85.aString19, Static256.anInt5074);
				Static211.anInt4085++;
			}
			if (Static211.anInt4085 == 1) {
				if (Static302.aClass193_7.anInt6293 == 2) {
					this.method1038(1000);
					return;
				}
				if (Static302.aClass193_7.anInt6293 == 1) {
					Static211.anInt4085++;
				}
			}
			if (Static211.anInt4085 == 2) {
				Static226.aClass173_3 = new Class173((Socket) Static302.aClass193_7.anObject7, Static177.aClass168_2);
				@Pc(192) Class2_Sub10 local192 = new Class2_Sub10(5);
				local192.method4430(15);
				local192.method4450(569);
				Static226.aClass173_3.method5021(5, local192.aByteArray57);
				Static211.anInt4085++;
				Static313.aLong191 = Static51.method1197();
			}
			if (Static211.anInt4085 == 3) {
				if (Static263.anInt5396 == 0 || Static263.anInt5396 == 5 || Static226.aClass173_3.method5024() > 0) {
					@Pc(235) int local235 = Static226.aClass173_3.method5028();
					if (local235 != 0) {
						this.method1038(local235);
						return;
					}
					Static211.anInt4085++;
				} else if (Static51.method1197() - Static313.aLong191 > 30000L) {
					this.method1038(1001);
					return;
				}
			}
			if (Static211.anInt4085 == 4) {
				@Pc(288) boolean local288 = Static263.anInt5396 == 5 || Static263.anInt5396 == 10 || Static263.anInt5396 == 28;
				Static193.aClass165_1.method4799(Static226.aClass173_3, !local288);
				Static226.aClass173_3 = null;
				Static302.aClass193_7 = null;
				Static211.anInt4085 = 0;
			}
		} catch (@Pc(307) IOException local307) {
			this.method1038(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1020() {
		if (Static288.aBoolean540) {
			Static153.method2951();
		}
		if (Static147.aClass4_2 != null) {
			Static147.aClass4_2.method4238();
		}
		if (Static335.aFrame1 != null) {
			Static139.method2759(Static335.aFrame1, Static177.aClass168_2);
			Static335.aFrame1 = null;
		}
		if (Static157.aClass173_1 != null) {
			Static157.aClass173_1.method5027();
			Static157.aClass173_1 = null;
		}
		if (Static22.aClass123_1 != null) {
			Static22.aClass123_1.method3698(Static240.aCanvas4);
		}
		Static22.aClass123_1 = null;
		if (Static124.aClass94_2 != null) {
			Static124.aClass94_2.method5972();
		}
		if (Static221.aClass94_3 != null) {
			Static221.aClass94_3.method5972();
		}
		Static193.aClass165_1.method4803();
		Static81.aClass136_1.method3776();
		if (Static313.aClass83_1 != null) {
			Static313.aClass83_1.method2507();
			Static313.aClass83_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1033() {
		if (Static263.anInt5396 == 1000) {
			return;
		}
		Static212.anInt4090++;
		if (Static212.anInt4090 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static316.anInt6393 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static11.aRandom1.setSeed((long) Static316.anInt6393);
		}
		this.method1044();
		if (Static322.aClass153_1 != null) {
			Static322.aClass153_1.method4138();
		}
		Static54.method1230();
		Static166.method3083();
		Static92.aClass97_2.method5674();
		Static284.aClass61_1.method2664();
		if (Static22.aClass123_1 != null) {
			@Pc(77) int local77 = Static22.aClass123_1.method3697();
			Static333.anInt6673 = local77;
		}
		if (Static147.aClass4_2 != null) {
			Static147.aClass4_2.method4232((int) Static51.method1197());
		}
		Static240.method4135();
		Static49.anInt1100 = 0;
		for (@Pc(94) Class69 local94 = Static92.aClass97_2.method5671(); local94 != null && Static49.anInt1100 < 128; local94 = Static92.aClass97_2.method5671()) {
			if (local94.method5547() != 1) {
				@Pc(107) char local107 = local94.method5546();
				if (!Static6.method208() || local107 != '`' && local107 != '§') {
					Static138.aClass69Array1[Static49.anInt1100] = local94;
					Static49.anInt1100++;
				} else if (Static236.method4072()) {
					Static291.method5164();
				} else {
					Static207.method5563();
				}
			}
		}
		Static187.aClass2_Sub16_1 = null;
		for (@Pc(154) Class2_Sub16 local154 = Static284.aClass61_1.method2663(); local154 != null; local154 = Static284.aClass61_1.method2663()) {
			@Pc(160) int local160 = local154.method1562();
			if (local160 == -1) {
				Static178.aClass216_33.method5995(local154);
			} else if (Static149.method2896(local160)) {
				Static187.aClass2_Sub16_1 = local154;
			}
		}
		if (Static236.method4072()) {
			Static135.method2701();
		}
		if (Static263.anInt5396 == 0) {
			this.method1040();
			Static295.method5215();
		} else if (Static263.anInt5396 == 5) {
			this.method1040();
			Static295.method5215();
		} else if (Static263.anInt5396 == 25 || Static263.anInt5396 == 28) {
			Static320.method5407();
		}
		if (Static263.anInt5396 == 10) {
			this.method1045();
			Static81.method1818();
			Static110.method2391();
			Static160.method3022();
		} else if (Static263.anInt5396 == 30) {
			Static65.method1492();
		} else if (Static263.anInt5396 == 40) {
			Static160.method3022();
			if (Static211.anInt4078 != -3) {
				if (Static211.anInt4078 == 15) {
					Static114.method5712();
				} else if (Static211.anInt4078 != 2) {
					Static38.method868();
				}
			}
		}
		Static187.method3376(Static147.aClass4_2);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1044() {
		@Pc(15) boolean local15 = Static193.aClass165_1.method4797();
		if (!local15) {
			this.method1041();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1045() {
		Static220.anInt4246++;
		Static177.method3262(-1, null, -1);
		Static161.method3039(null, -1, -1);
		Static5.method4296();
		Static157.anInt3179++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class62_Sub1_Sub2_Sub1 local33 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass186_1.aByte63;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4777();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt5372 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(96) int local96 = local74 + local33.anIntArray397[0];
							@Pc(103) int local103 = local82 + local33.anIntArray396[0];
							if (local96 < 0) {
								local96 = 0;
							} else if (Static95.anInt6381 - local50 - 1 < local96) {
								local96 = Static95.anInt6381 - local50 - 1;
							}
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > Static237.anInt4532 - local50 - 1) {
								local103 = Static237.anInt4532 - local50 - 1;
							}
							@Pc(182) int local182 = Static313.method5507(local50, local96, true, local33.anIntArray397[0], Static137.anIntArray241, Static169.aClass151Array1[local33.aByte56], local50, local50, 0, local103, 0, local33.anIntArray396[0], -1, Static120.anIntArray231);
							if (local182 > 0) {
								if (local182 > 9) {
									local182 = 9;
								}
								for (@Pc(196) int local196 = 0; local196 < local182; local196++) {
									local33.anIntArray397[local196] = Static137.anIntArray241[local182 - local196 - 1];
									local33.anIntArray396[local196] = Static120.anIntArray231[local182 - local196 - 1];
									local33.aByteArray60[local196] = 1;
								}
								local33.anInt5372 = local182;
							}
						}
					}
					Static82.method2657(local33, true);
					local74 = Static79.method1812(local33);
					Static169.method3188(Static260.anInt5269, Static75.anInt1603, local74, local33);
					Static267.method4827(local33);
				}
			}
		}
		if (Static95.anInt6375 == 0 && Static345.anInt664 == 0) {
			if (Static182.anInt3602 == 2) {
				Static212.method3772();
			} else {
				Static293.method5194();
			}
			if (Static287.anInt5819 >> 7 < 14 || Static95.anInt6381 - 14 <= Static287.anInt5819 >> 7 || Static290.anInt5837 >> 7 < 14 || Static290.anInt5837 >> 7 >= Static237.anInt4532 - 14) {
				Static135.method2702();
			}
		}
		while (true) {
			@Pc(318) Class2_Sub44 local318;
			@Pc(323) Class146 local323;
			@Pc(336) Class146 local336;
			do {
				local318 = (Class2_Sub44) Static23.aClass216_16.method5999();
				if (local318 == null) {
					while (true) {
						do {
							local318 = (Class2_Sub44) Static164.aClass216_32.method5999();
							if (local318 == null) {
								while (true) {
									do {
										local318 = (Class2_Sub44) Static356.aClass216_46.method5999();
										if (local318 == null) {
											if (Static285.aClass146_14 != null) {
												Static346.method5940();
											}
											if (Static212.anInt4090 % 1500 == 0) {
												Static139.method2751();
											}
											Static96.method2171();
											if (Static288.aBoolean540 && Static223.aLong133 < Static51.method1197() - 60000L) {
												Static153.method2951();
												return;
											}
											return;
										}
										local323 = local318.aClass146_18;
										if (local323.anInt4493 < 0) {
											break;
										}
										local336 = Static1.method16(local323.anInt4458);
									} while (local336 == null || local336.aClass146Array2 == null || local336.aClass146Array2.length <= local323.anInt4493 || local336.aClass146Array2[local323.anInt4493] != local323);
									Static72.method1646(local318);
								}
							}
							local323 = local318.aClass146_18;
							if (local323.anInt4493 < 0) {
								break;
							}
							local336 = Static1.method16(local323.anInt4458);
						} while (local336 == null || local336.aClass146Array2 == null || local323.anInt4493 >= local336.aClass146Array2.length || local336.aClass146Array2[local323.anInt4493] != local323);
						Static72.method1646(local318);
					}
				}
				local323 = local318.aClass146_18;
				if (local323.anInt4493 < 0) {
					break;
				}
				local336 = Static1.method16(local323.anInt4458);
			} while (local336 == null || local336.aClass146Array2 == null || local323.anInt4493 >= local336.aClass146Array2.length || local323 != local336.aClass146Array2[local323.anInt4493]);
			Static72.method1646(local318);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1046(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class2_Sub10 local15 = new Class2_Sub10(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(21) int local21 = local15.method4421();
					if (local21 == 0) {
						return;
					}
					if (local21 == 1) {
						@Pc(113) int[] local113 = Static319.anIntArray471 = new int[6];
						local113[0] = local15.method4464();
						local113[1] = local15.method4464();
						local113[2] = local15.method4464();
						local113[3] = local15.method4464();
						local113[4] = local15.method4464();
						local113[5] = local15.method4464();
					} else {
						@Pc(42) int local42;
						@Pc(37) int local37;
						if (local21 == 4) {
							local37 = local15.method4421();
							Static6.anIntArray6 = new int[local37];
							for (local42 = 0; local42 < local37; local42++) {
								Static6.anIntArray6[local42] = local15.method4464();
								if (Static6.anIntArray6[local42] == 65535) {
									Static6.anIntArray6[local42] = -1;
								}
							}
						} else if (local21 == 5) {
							local37 = local15.method4421();
							Static64.anIntArray141 = new int[local37];
							for (local42 = 0; local42 < local37; local42++) {
								Static64.anIntArray141[local42] = local15.method4464();
								if (Static64.anIntArray141[local42] == 65535) {
									Static64.anIntArray141[local42] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1034()) {
			return;
		}
		Static151.anInt3096 = Integer.parseInt(this.getParameter("worldid"));
		Static183.anInt3622 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static183.anInt3622 < 0 || Static183.anInt3622 > 1) {
			Static183.anInt3622 = 0;
		}
		Static158.anInt3190 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static158.anInt3190 < 0 || Static158.anInt3190 > 2) {
			Static158.anInt3190 = 0;
		}
		try {
			Static21.anInt455 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(51) Exception local51) {
			Static21.anInt455 = 0;
		}
		@Pc(57) String local57 = this.getParameter("objecttag");
		if (local57 != null && local57.equals("1")) {
			Static36.aBoolean76 = true;
		} else {
			Static36.aBoolean76 = false;
		}
		@Pc(73) String local73 = this.getParameter("js");
		if (local73 != null && local73.equals("1")) {
			Static18.aBoolean56 = true;
		} else {
			Static18.aBoolean56 = false;
		}
		@Pc(89) String local89 = this.getParameter("game");
		if (local89 != null && local89.equals("1")) {
			Static41.anInt830 = 1;
		} else {
			Static41.anInt830 = 0;
		}
		try {
			Static94.anInt2145 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(108) Exception local108) {
			Static94.anInt2145 = 0;
		}
		Static252.aString44 = this.getParameter("quiturl");
		Static331.aString28 = this.getParameter("settings");
		if (Static331.aString28 == null) {
			Static331.aString28 = "";
		}
		@Pc(126) String local126 = this.getParameter("country");
		if (local126 != null) {
			try {
				Static50.anInt1114 = Integer.parseInt(local126);
			} catch (@Pc(133) Exception local133) {
				Static50.anInt1114 = 0;
			}
		}
		Static95.anInt6376 = Integer.parseInt(this.getParameter("colourid"));
		if (Static95.anInt6376 < 0 || Static187.aColorArray3.length <= Static95.anInt6376) {
			Static95.anInt6376 = 0;
		}
		Static293.aClient1 = this;
		this.method1030(Static158.anInt3190 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1022() {
	}
}
