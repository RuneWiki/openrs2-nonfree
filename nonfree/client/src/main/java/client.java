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
				Static326.method4737("argument count");
			}
			Static166.anInt3667 = Integer.parseInt(arg0[0]);
			Static96.aClass73_2 = Static182.aClass73_3;
			if (arg0[1].equals("live")) {
				Static234.aClass28_3 = Static44.aClass28_1;
			} else if (arg0[1].equals("rc")) {
				Static234.aClass28_3 = Static361.aClass28_4;
			} else if (arg0[1].equals("wip")) {
				Static234.aClass28_3 = Static167.aClass28_2;
			} else {
				Static326.method4737("modewhat");
			}
			Static48.anInt952 = Static266.method4093(arg0[2]);
			if (Static48.anInt952 == -1) {
				if (arg0[2].equals("english")) {
					Static48.anInt952 = 0;
				} else if (arg0[2].equals("german")) {
					Static48.anInt952 = 1;
				} else {
					Static326.method4737("language");
				}
			}
			Static197.aBoolean345 = false;
			Static177.aBoolean120 = false;
			if (arg0[3].equals("game0")) {
				Static313.aClass94_8 = Static59.aClass94_3;
			} else if (arg0[3].equals("game1")) {
				Static313.aClass94_8 = Static360.aClass94_7;
			} else {
				Static326.method4737("game");
			}
			Static292.aBoolean478 = true;
			Static254.aBoolean435 = true;
			Static348.aString68 = "";
			Static318.anInt5417 = 0;
			Static380.anInt6150 = 0;
			Static172.anInt3129 = Static313.aClass94_8.anInt2209;
			@Pc(130) client local130 = new client();
			Static305.aClient1 = local130;
			local130.method792(Static313.aClass94_8.aString19, Static234.aClass28_3.method497() + 32);
			Static142.aFrame2.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static62.method1006(local154, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method794() {
		if (Static142.anInt2665 == 1000) {
			return;
		}
		Static366.anInt5883++;
		if (Static366.anInt5883 % 1000 == 1) {
			@Pc(30) GregorianCalendar local30 = new GregorianCalendar();
			Static245.anInt1950 = local30.get(11) * 600 + local30.get(12) * 10 + local30.get(13) / 6;
			Static393.aRandom1.setSeed((long) Static245.anInt1950);
		}
		if (Static366.anInt5883 % 50 == 0) {
			Static136.anInt6305 = Static109.anInt1910;
			Static328.anInt5513 = Static215.anInt3681;
			Static109.anInt1910 = 0;
			Static215.anInt3681 = 0;
		}
		this.method820();
		if (Static170.aClass168_1 != null) {
			Static170.aClass168_1.method3671();
		}
		Static364.method5202();
		Static44.method683();
		Static264.aClass154_1.method3995();
		Static300.aClass182_1.method4120();
		if (Static202.aClass114_1 != null) {
			@Pc(94) int local94 = Static202.aClass114_1.method2984();
			Static180.anInt3208 = local94;
		}
		if (Static66.aClass164_2 != null) {
			Static66.aClass164_2.method5367((int) Static378.method5293());
		}
		Static248.method3692();
		Static330.anInt5516 = 0;
		for (@Pc(111) Class69 local111 = Static264.aClass154_1.method3991(); local111 != null && Static330.anInt5516 < 128; local111 = Static264.aClass154_1.method3991()) {
			if (local111.method1263() != 1) {
				@Pc(124) char local124 = local111.method1261();
				if (!Static308.method4587() || local124 != '`' && local124 != '§') {
					Static389.aClass69Array1[Static330.anInt5516] = local111;
					Static330.anInt5516++;
				} else if (Static94.method1372()) {
					Static211.method2967();
				} else {
					Static122.method1789();
				}
			}
		}
		Static379.aClass1_Sub13_1 = null;
		for (@Pc(169) Class1_Sub13 local169 = Static300.aClass182_1.method4113(); local169 != null; local169 = Static300.aClass182_1.method4113()) {
			@Pc(175) int local175 = local169.method2558();
			if (local175 == -1) {
				Static109.aClass17_16.method199(local169);
			} else if (Static153.method2319(local175)) {
				Static379.aClass1_Sub13_1 = local169;
			}
		}
		if (Static94.method1372()) {
			Static348.method5093();
		}
		if (Static142.anInt2665 == 0) {
			this.method814();
			Static252.method3889();
		} else if (Static142.anInt2665 == 5) {
			this.method814();
			Static252.method3889();
		} else if (Static142.anInt2665 == 25 || Static142.anInt2665 == 28) {
			Static268.method4133();
		}
		if (Static142.anInt2665 == 10) {
			this.method822();
			Static176.method2581();
			Static71.method1146();
			Static102.method2561();
		} else if (Static142.anInt2665 == 30) {
			Static115.method1699();
		} else if (Static142.anInt2665 == 40) {
			Static102.method2561();
			if (Static288.anInt4959 != -3 && Static288.anInt4959 != 2 && Static288.anInt4959 != 15) {
				Static384.method5442();
			}
		}
		Static175.method2563(Static66.aClass164_2);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method788() {
		if (Static142.anInt2665 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static288.method4363() / 1000000L - Static70.aLong35;
		Static70.aLong35 = Static288.method4363() / 1000000L;
		@Pc(35) boolean local35 = Static73.method1165();
		if (local35 && Static12.aBoolean13 && Static216.aClass14_1 != null) {
			Static216.aClass14_1.method4897();
		}
		if (Static142.anInt2665 == 30 || Static142.anInt2665 == 10) {
			if (Static137.aLong72 != 0L && Static378.method5293() > Static137.aLong72) {
				Static228.method3177(Static188.aClass135_Sub1_1.anInt3378, Static254.method3903(), Static188.aClass135_Sub1_1.anInt3381, false);
			} else if (Static66.aClass164_2.method5328() && Static153.aBoolean243) {
				Static151.method2293();
			}
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static47.aFrame1 == null) {
			@Pc(86) Container local86;
			if (Static142.aFrame2 == null) {
				local86 = Static341.aClass162_5.anApplet1;
			} else {
				local86 = Static142.aFrame2;
			}
			local94 = local86.getSize().width;
			local98 = local86.getSize().height;
			if (local86 == Static142.aFrame2) {
				@Pc(104) Insets local104 = Static142.aFrame2.getInsets();
				local98 -= local104.top + local104.bottom;
				local94 -= local104.left + local104.right;
			}
			if (local94 != Static160.anInt2899 || Static278.anInt4645 != local98) {
				if (Static66.aClass164_2 == null || Static66.aClass164_2.method5308()) {
					Static150.method2272();
				} else {
					Static160.anInt2899 = local94;
					Static278.anInt4645 = local98;
				}
				Static137.aLong72 = Static378.method5293() + 500L;
			}
		}
		if (Static47.aFrame1 != null && !Static300.aBoolean485 && (Static142.anInt2665 == 30 || Static142.anInt2665 == 10)) {
			Static228.method3177(-1, Static188.aClass135_Sub1_1.anInt3380, -1, false);
		}
		@Pc(166) boolean local166 = false;
		if (Static326.aBoolean515) {
			local166 = true;
			Static326.aBoolean515 = false;
		}
		if (local166) {
			Static191.method2738();
		}
		if (Static66.aClass164_2 != null && Static66.aClass164_2.method5381() || Static254.method3903() != 1) {
			Static262.method5507();
		}
		if (Static142.anInt2665 == 0) {
			Static19.method208(Static71.aString10, Static73.aColorArray1[Static172.anInt3129], Static300.aColorArray2[Static172.anInt3129], Static302.anInt5151, Static366.aColorArray3[Static172.anInt3129], local166);
		} else if (Static142.anInt2665 == 5) {
			Static288.method4360(Static366.aColorArray3[Static172.anInt3129].getRGB(), Static73.aColorArray1[Static172.anInt3129].getRGB(), Static101.aClass137_2, local166 | Static66.aClass164_2.method5381(), Static300.aColorArray2[Static172.anInt3129].getRGB(), Static66.aClass164_2);
		} else if (Static142.anInt2665 == 10) {
			Static289.method4398();
		} else if (Static142.anInt2665 == 25 || Static142.anInt2665 == 28) {
			if (Static334.anInt5568 == 1) {
				if (Static330.anInt5518 > Static222.anInt4506) {
					Static222.anInt4506 = Static330.anInt5518;
				}
				local94 = (Static222.anInt4506 - Static330.anInt5518) * 50 / Static222.anInt4506;
				Static62.method1008(Static125.aClass169_112.method3680(Static48.anInt952) + "<br>(" + local94 + "%)", Static334.aClass137_7, true);
			} else if (Static334.anInt5568 == 2) {
				if (Static164.anInt2966 > Static134.anInt2506) {
					Static134.anInt2506 = Static164.anInt2966;
				}
				local94 = (Static134.anInt2506 - Static164.anInt2966) * 50 / Static134.anInt2506 + 50;
				Static62.method1008(Static125.aClass169_112.method3680(Static48.anInt952) + "<br>(" + local94 + "%)", Static334.aClass137_7, true);
			} else {
				Static62.method1008(Static125.aClass169_112.method3680(Static48.anInt952), Static334.aClass137_7, true);
			}
		} else if (Static142.anInt2665 == 30) {
			Static225.method3186(local18);
		} else if (Static142.anInt2665 == 40) {
			Static62.method1008(Static209.aClass169_184.method3680(Static48.anInt952) + "<br>" + Static122.aClass169_110.method3680(Static48.anInt952), Static334.aClass137_7, true);
		}
		if (Static394.anInt6421 == 3) {
			for (local94 = 0; local94 < Static75.anInt1459; local94++) {
				@Pc(390) Rectangle local390 = Class198.aRectangleArray1[local94];
				if (Static227.aBooleanArray23[local94]) {
					Static66.aClass164_2.method5343(local390.height, -1996553985, local390.y, local390.x, local390.width);
				} else if (Static277.aBooleanArray26[local94]) {
					Static66.aClass164_2.method5343(local390.height, -1996554240, local390.y, local390.x, local390.width);
				}
			}
		}
		if (Static94.method1372()) {
			Static361.method5012(Static66.aClass164_2);
		}
		if ((Static142.anInt2665 == 30 || Static142.anInt2665 == 10) && Static394.anInt6421 == 0 && Static254.method3903() == 1 && !local166 && Static237.aString48.equals("1.1")) {
			local94 = 0;
			for (local98 = 0; local98 < Static75.anInt1459; local98++) {
				if (Static277.aBooleanArray26[local98]) {
					Static277.aBooleanArray26[local98] = false;
					Static314.aRectangleArray2[local94++] = Class198.aRectangleArray1[local98];
				}
			}
			Static66.aClass164_2.method5350(Static314.aRectangleArray2, local94);
		} else if (Static142.anInt2665 != 0) {
			Static66.aClass164_2.method5404();
			for (local94 = 0; local94 < Static75.anInt1459; local94++) {
				Static277.aBooleanArray26[local94] = false;
			}
		}
		if (Static188.aClass135_Sub1_1.anInt3385 == 0) {
			Static57.method5056(15L);
		} else if (Static188.aClass135_Sub1_1.anInt3385 == 1) {
			Static57.method5056(10L);
		} else if (Static188.aClass135_Sub1_1.anInt3385 == 2) {
			Static57.method5056(5L);
		} else if (Static188.aClass135_Sub1_1.anInt3385 == 3) {
			Static57.method5056(2L);
		}
		if (Static391.aBoolean589) {
			Static383.method5428();
		}
		if (Static188.aClass135_Sub1_1.aBoolean323 && Static142.anInt2665 == 10 && Static352.anInt5753 != -1) {
			Static188.aClass135_Sub1_1.aBoolean323 = false;
			Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method809() {
		if (Static69.anInt1386 < Static73.aClass92_1.anInt2180) {
			if (Static91.anInt1662 == Static394.anInt6422) {
				Static394.anInt6422 = Static128.anInt2264;
			} else {
				Static394.anInt6422 = Static91.anInt1662;
			}
			Static137.anInt2561 = (Static73.aClass92_1.anInt2180 - 1) * 50 * 5;
			if (Static137.anInt2561 > 3000) {
				Static137.anInt2561 = 3000;
			}
			if (Static73.aClass92_1.anInt2180 >= 2 && Static73.aClass92_1.anInt2179 == 6) {
				this.method786("js5connect_outofdate");
				Static142.anInt2665 = 1000;
				return;
			}
			if (Static73.aClass92_1.anInt2180 >= 4 && Static73.aClass92_1.anInt2179 == -1) {
				this.method786("js5crc");
				Static142.anInt2665 = 1000;
				return;
			}
			if (Static73.aClass92_1.anInt2180 >= 4 && (Static142.anInt2665 == 0 || Static142.anInt2665 == 5)) {
				if (Static73.aClass92_1.anInt2179 == 7 || Static73.aClass92_1.anInt2179 == 9) {
					this.method786("js5connect_full");
				} else if (Static73.aClass92_1.anInt2179 <= 0) {
					this.method786("js5io");
				} else {
					this.method786("js5connect");
				}
				Static142.anInt2665 = 1000;
				return;
			}
		}
		Static69.anInt1386 = Static73.aClass92_1.anInt2180;
		if (Static137.anInt2561 > 0) {
			Static137.anInt2561--;
			return;
		}
		try {
			if (Static321.anInt5438 == 0) {
				Static252.aClass112_9 = Static341.aClass162_5.method3289(Static394.anInt6422, Static314.aString60);
				Static321.anInt5438++;
			}
			if (Static321.anInt5438 == 1) {
				if (Static252.aClass112_9.anInt2969 == 2) {
					this.method819(1000);
					return;
				}
				if (Static252.aClass112_9.anInt2969 == 1) {
					Static321.anInt5438++;
				}
			}
			if (Static321.anInt5438 == 2) {
				Static147.aClass130_3 = new Class130((Socket) Static252.aClass112_9.anObject5, Static341.aClass162_5);
				@Pc(180) Class1_Sub33 local180 = new Class1_Sub33(5);
				local180.method5165(Static159.aClass66_2.anInt1518);
				local180.method5142(575);
				Static147.aClass130_3.method2670(5, local180.aByteArray86);
				Static321.anInt5438++;
				Static174.aLong98 = Static378.method5293();
			}
			if (Static321.anInt5438 == 3) {
				if (Static142.anInt2665 == 0 || Static142.anInt2665 == 5 || Static147.aClass130_3.method2675() > 0) {
					@Pc(226) int local226 = Static147.aClass130_3.method2672();
					if (local226 != 0) {
						this.method819(local226);
						return;
					}
					Static321.anInt5438++;
				} else if (Static378.method5293() - Static174.aLong98 > 30000L) {
					this.method819(1001);
					return;
				}
			}
			if (Static321.anInt5438 == 4) {
				@Pc(277) boolean local277 = Static142.anInt2665 == 5 || Static142.anInt2665 == 10 || Static142.anInt2665 == 28;
				Static73.aClass92_1.method1786(!local277, Static147.aClass130_3);
				Static147.aClass130_3 = null;
				Static321.anInt5438 = 0;
				Static252.aClass112_9 = null;
			}
		} catch (@Pc(294) IOException local294) {
			this.method819(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method803() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method802() {
		if (Static121.aBoolean177) {
			Static251.method3883();
		}
		if (Static66.aClass164_2 != null) {
			Static66.aClass164_2.method5320();
		}
		if (Static47.aFrame1 != null) {
			Static329.method3255(Static341.aClass162_5, Static47.aFrame1);
			Static47.aFrame1 = null;
		}
		if (Static6.aClass130_1 != null) {
			Static6.aClass130_1.method2668();
			Static6.aClass130_1 = null;
		}
		if (Static202.aClass114_1 != null) {
			Static202.aClass114_1.method2986(Static177.aCanvas3);
		}
		Static202.aClass114_1 = null;
		if (Static216.aClass14_1 != null) {
			Static216.aClass14_1.method4893();
		}
		if (Static296.aClass14_2 != null) {
			Static296.aClass14_2.method4893();
		}
		Static73.aClass92_1.method1778();
		Static83.aClass250_1.method5527();
		if (Static352.aClass173_1 != null) {
			Static352.aClass173_1.method3895();
			Static352.aClass173_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method814() {
		@Pc(6) int local6;
		if (!Static188.aClass135_Sub1_1.aBoolean323) {
			for (local6 = 0; local6 < Static330.anInt5516; local6++) {
				if (Static389.aClass69Array1[local6].method1261() == 's' || Static389.aClass69Array1[local6].method1261() == 'S') {
					Static188.aClass135_Sub1_1.aBoolean323 = true;
					break;
				}
			}
		}
		@Pc(60) int local60;
		if (Static103.anInt1813 == 0) {
			@Pc(50) Runtime local50 = Runtime.getRuntime();
			local60 = (int) ((local50.totalMemory() - local50.freeMemory()) / 1024L);
			@Pc(63) long local63 = Static378.method5293();
			if (Static178.aLong100 == 0L) {
				Static178.aLong100 = local63;
			}
			if (local60 > 16384 && local63 - Static178.aLong100 < 5000L) {
				if (local63 - Static92.aLong49 > 1000L) {
					System.gc();
					Static92.aLong49 = local63;
				}
				Static71.aString10 = Static285.aClass169_267.method3680(Static48.anInt952);
				Static302.anInt5151 = 5;
			} else {
				Static71.aString10 = Static14.aClass169_12.method3680(Static48.anInt952);
				Static302.anInt5151 = 5;
				Static103.anInt1813 = 10;
			}
		} else if (Static103.anInt1813 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static257.aClass222Array1[local6] = Static26.method469(Static92.anInt1675, Static262.anInt6340);
			}
			Static71.aString10 = Static179.aClass169_168.method3680(Static48.anInt952);
			Static103.anInt1813 = 20;
			Static302.anInt5151 = 10;
		} else if (Static103.anInt1813 == 20) {
			if (Static170.aClass168_1 == null) {
				Static170.aClass168_1 = new Class168(Static73.aClass92_1, Static83.aClass250_1);
			}
			if (Static170.aClass168_1.method3676()) {
				Static13.aClass230_2 = Static268.method4135(0, false, true);
				Static388.aClass230_90 = Static268.method4135(1, false, true);
				Static307.aClass230_79 = Static268.method4135(2, false, true);
				Static268.aClass230_64 = Static268.method4135(3, false, true);
				Static134.aClass230_35 = Static268.method4135(4, false, true);
				Static25.aClass230_5 = Static268.method4135(5, true, true);
				Static156.aClass230_44 = Static268.method4135(6, true, false);
				Static350.aClass230_78 = Static268.method4135(7, false, true);
				Static145.aClass230_41 = Static268.method4135(8, false, true);
				Static79.aClass230_28 = Static268.method4135(9, false, true);
				Static281.aClass230_67 = Static268.method4135(10, false, true);
				Static339.aClass230_76 = Static268.method4135(11, false, true);
				Static98.aClass230_32 = Static268.method4135(12, false, true);
				Static27.aClass230_8 = Static268.method4135(13, false, true);
				Static70.aClass230_26 = Static268.method4135(14, false, false);
				Static177.aClass230_25 = Static268.method4135(15, false, true);
				Static226.aClass230_58 = Static268.method4135(16, false, true);
				Static94.aClass230_31 = Static268.method4135(17, false, true);
				Static22.aClass230_59 = Static268.method4135(18, false, true);
				Static358.aClass230_80 = Static268.method4135(19, false, true);
				Static185.aClass230_49 = Static268.method4135(20, false, true);
				Static55.aClass230_19 = Static268.method4135(21, false, true);
				Static87.aClass230_30 = Static268.method4135(22, false, true);
				Static314.aClass230_70 = Static268.method4135(23, true, true);
				Static332.aClass230_75 = Static268.method4135(24, false, true);
				Static39.aClass230_13 = Static268.method4135(25, false, true);
				Static34.aClass230_11 = Static268.method4135(26, true, true);
				Static163.aClass230_47 = Static268.method4135(27, false, true);
				Static12.aClass230_1 = Static268.method4135(28, true, true);
				Static71.aString10 = Static381.aClass169_334.method3680(Static48.anInt952);
				Static302.anInt5151 = 15;
				Static103.anInt1813 = 30;
			} else {
				Static71.aString10 = Static256.aClass169_238.method3680(Static48.anInt952);
				Static302.anInt5151 = 12;
			}
		} else if (Static103.anInt1813 == 30) {
			local6 = 0;
			for (local60 = 0; local60 < 29; local60++) {
				local6 += Static104.aClass56_Sub1Array1[local60].method3298() * Static230.anIntArray724[local60] / 100;
			}
			if (local6 == 100) {
				Static71.aString10 = Static350.aClass169_307.method3680(Static48.anInt952);
				Static302.anInt5151 = 20;
				Static144.method2182(Static145.aClass230_41);
				Static29.method482(Static145.aClass230_41);
				Static103.anInt1813 = 40;
			} else {
				if (local6 != 0) {
					Static71.aString10 = Static87.aClass169_80.method3680(Static48.anInt952) + local6 + "%";
				}
				Static302.anInt5151 = 20;
			}
		} else if (Static103.anInt1813 == 40) {
			if (Static12.aClass230_1.method4954()) {
				this.method818(Static12.aClass230_1.method4961(1));
				Static71.aString10 = Static48.aClass169_41.method3680(Static48.anInt952);
				Static302.anInt5151 = 25;
				Static103.anInt1813 = 50;
			} else {
				Static71.aString10 = Static24.aClass169_19.method3680(Static48.anInt952) + Static12.aClass230_1.method4955() + "%";
				Static302.anInt5151 = 25;
			}
		} else if (Static103.anInt1813 == 50) {
			Static227.method4204(Static188.aClass135_Sub1_1.aBoolean325);
			Static90.aClass1_Sub7_Sub1_1 = new Class1_Sub7_Sub1();
			Static90.aClass1_Sub7_Sub1_1.method1060();
			Static216.aClass14_1 = Static55.method899(22050, Static177.aCanvas3, 0, Static341.aClass162_5);
			Static216.aClass14_1.method4894(Static90.aClass1_Sub7_Sub1_1);
			Static118.method1736(Static177.aClass230_25, Static90.aClass1_Sub7_Sub1_1, Static134.aClass230_35, Static70.aClass230_26);
			Static296.aClass14_2 = Static55.method899(2048, Static177.aCanvas3, 1, Static341.aClass162_5);
			Static366.aClass1_Sub7_Sub4_2 = new Class1_Sub7_Sub4();
			Static296.aClass14_2.method4894(Static366.aClass1_Sub7_Sub4_2);
			Static173.aClass195_1 = new Class195(22050, Static212.anInt3652);
			Static352.anInt5761 = Static156.aClass230_44.method4970("scape main");
			Static71.aString10 = Static83.aClass169_66.method3680(Static48.anInt952);
			Static103.anInt1813 = 60;
			Static302.anInt5151 = 30;
		} else if (Static103.anInt1813 == 60) {
			local6 = Static16.method185(Static145.aClass230_41, Static27.aClass230_8);
			local60 = Static68.method1134();
			if (local60 > local6) {
				Static71.aString10 = Static365.aClass169_322.method3680(Static48.anInt952) + local6 * 100 / local60 + "%";
				Static302.anInt5151 = 35;
			} else {
				Static71.aString10 = Static374.aClass169_330.method3680(Static48.anInt952);
				Static302.anInt5151 = 35;
				Static103.anInt1813 = 70;
			}
		} else if (Static103.anInt1813 == 70) {
			local6 = Static225.method3185(Static145.aClass230_41);
			local60 = Static321.method4704();
			if (local60 > local6) {
				Static71.aString10 = Static273.aClass169_257.method3680(Static48.anInt952) + local6 * 100 / local60 + "%";
				Static302.anInt5151 = 40;
			} else {
				Static71.aString10 = Static53.aClass169_42.method3680(Static48.anInt952);
				Static103.anInt1813 = 80;
				Static302.anInt5151 = 40;
			}
		} else if (Static103.anInt1813 == 80) {
			if (Static34.aClass230_11.method4954()) {
				Static16.anInterface2_1 = new Class215(Static34.aClass230_11, Static79.aClass230_28, Static145.aClass230_41);
				Static71.aString10 = Static170.aClass169_158.method3680(Static48.anInt952);
				Static103.anInt1813 = 90;
				Static302.anInt5151 = 45;
			} else {
				Static71.aString10 = Static295.aClass169_279.method3680(Static48.anInt952) + Static34.aClass230_11.method4955() + "%";
				Static302.anInt5151 = 45;
			}
		} else if (Static103.anInt1813 == 90) {
			Static71.aString10 = Static225.aClass169_210.method3680(Static48.anInt952);
			Static103.anInt1813 = 95;
			Static302.anInt5151 = 50;
		} else if (Static103.anInt1813 == 95) {
			if (Static188.aClass135_Sub1_1.aBoolean323) {
				Static188.aClass135_Sub1_1.anInt3376 = 0;
				Static188.aClass135_Sub1_1.anInt3372 = 0;
				Static188.aClass135_Sub1_1.anInt3383 = 0;
				Static188.aClass135_Sub1_1.anInt3380 = 1;
				Static188.aClass135_Sub1_1.anInt3375 = 0;
			}
			Static188.aClass135_Sub1_1.aBoolean323 = true;
			Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
			Static212.method2970(false, Static188.aClass135_Sub1_1.anInt3375);
			Static71.aString10 = Static258.aClass169_243.method3680(Static48.anInt952);
			Static103.anInt1813 = 100;
			Static302.anInt5151 = 55;
		} else if (Static103.anInt1813 == 100) {
			Static130.method1905(Static66.aClass164_2, Static27.aClass230_8, Static145.aClass230_41);
			Static71.aString10 = Static295.aClass169_280.method3680(Static48.anInt952);
			Static302.anInt5151 = 60;
			Static212.method2974(5);
			Static103.anInt1813 = 110;
		} else if (Static103.anInt1813 == 110) {
			Static307.aClass230_79.method4954();
			local6 = Static307.aClass230_79.method4955();
			Static226.aClass230_58.method4954();
			local6 += Static226.aClass230_58.method4955();
			Static94.aClass230_31.method4954();
			local6 += Static94.aClass230_31.method4955();
			Static22.aClass230_59.method4954();
			local6 += Static22.aClass230_59.method4955();
			Static358.aClass230_80.method4954();
			local6 += Static358.aClass230_80.method4955();
			Static185.aClass230_49.method4954();
			local6 += Static185.aClass230_49.method4955();
			Static55.aClass230_19.method4954();
			local6 += Static55.aClass230_19.method4955();
			Static87.aClass230_30.method4954();
			local6 += Static87.aClass230_30.method4955();
			Static332.aClass230_75.method4954();
			local6 += Static332.aClass230_75.method4955();
			Static39.aClass230_13.method4954();
			local6 += Static39.aClass230_13.method4955();
			Static163.aClass230_47.method4954();
			local6 += Static163.aClass230_47.method4955();
			if (local6 < 1100) {
				Static71.aString10 = Static302.aClass169_285.method3680(Static48.anInt952) + local6 / 11 + "%";
				Static302.anInt5151 = 65;
			} else {
				Static232.aClass47_2 = new Class47(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static160.aClass163_1 = new Class163(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static175.aClass52_1 = new Class52(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79, Static145.aClass230_41);
				Static8.aClass242_1 = new Class242(Static313.aClass94_8, Static48.anInt952, Static94.aClass230_31);
				Static259.aClass158_6 = new Class158(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static140.aClass214_28 = new Class214(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static183.aClass146_2 = new Class146(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79, Static350.aClass230_78);
				Static133.aClass247_1 = new Class247(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static68.aClass252_1 = new Class252(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static54.aClass153_1 = new Class153(Static313.aClass94_8, Static48.anInt952, true, Static226.aClass230_58, Static350.aClass230_78);
				Static16.aClass249_1 = new Class249(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79, Static145.aClass230_41);
				Static309.aClass184_3 = new Class184(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79, Static145.aClass230_41);
				Static168.aClass196_2 = new Class196(Static313.aClass94_8, Static48.anInt952, true, Static22.aClass230_59, Static350.aClass230_78);
				Static263.aClass102_2 = new Class102(Static313.aClass94_8, Static48.anInt952, true, Static232.aClass47_2, Static358.aClass230_80, Static350.aClass230_78);
				Static27.aClass232_1 = new Class232(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static25.aClass67_1 = new Class67(Static313.aClass94_8, Static48.anInt952, Static185.aClass230_49, Static13.aClass230_2, Static388.aClass230_90);
				Static274.aClass63_1 = new Class63(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static301.aClass31_1 = new Class31(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static10.aClass246_1 = new Class246(Static313.aClass94_8, Static48.anInt952, Static55.aClass230_19, Static350.aClass230_78);
				Static72.aClass37_1 = new Class37(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static279.aClass23_1 = new Class23(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static351.aClass101_1 = new Class101(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static371.aClass147_5 = new Class147(Static313.aClass94_8, Static48.anInt952, Static87.aClass230_30);
				Static158.aClass229_3 = new Class229(Static313.aClass94_8, Static48.anInt952, Static307.aClass230_79);
				Static267.method4122(Static27.aClass230_8, Static268.aClass230_64, Static350.aClass230_78, Static145.aClass230_41);
				Static134.method1982(Static39.aClass230_13, Static332.aClass230_75, new Class198());
				Static4.method51(Static332.aClass230_75, Static39.aClass230_13);
				Static71.aString10 = Static251.aClass169_233.method3680(Static48.anInt952);
				Static302.anInt5151 = 65;
				Static51.method836();
				Static54.aClass153_1.method3087(!Static188.aClass135_Sub1_1.method2747(Static25.anInt394));
				Static230.aClass72_3 = new Class72();
				Static251.method3879();
				Static183.method1329(Static163.aClass230_47);
				Static326.method4736(Static350.aClass230_78, Static16.anInterface2_1);
				Static103.anInt1813 = 120;
			}
		} else if (Static103.anInt1813 == 120) {
			local6 = Static186.method2665(Static145.aClass230_41);
			local60 = Static278.method4116();
			if (local60 > local6) {
				Static71.aString10 = Static294.aClass169_277.method3680(Static48.anInt952) + local6 * 100 / local60 + "%";
				Static302.anInt5151 = 70;
			} else {
				Static235.method3243(Static145.aClass230_41, Static66.aClass164_2);
				Static394.method5587(Static215.aClass51Array14);
				Static71.aString10 = Static208.aClass169_183.method3680(Static48.anInt952);
				Static302.anInt5151 = 70;
				Static103.anInt1813 = 130;
			}
		} else if (Static103.anInt1813 == 130) {
			if (Static281.aClass230_67.method4972("huffman", "")) {
				@Pc(1286) Class220 local1286 = new Class220(Static281.aClass230_67.method4981("", "huffman"));
				Static71.method1153(local1286);
				Static71.aString10 = Static279.aClass169_261.method3680(Static48.anInt952);
				Static302.anInt5151 = 75;
				Static103.anInt1813 = 140;
			} else {
				Static71.aString10 = Static226.aClass169_205.method3680(Static48.anInt952) + "0%";
				Static302.anInt5151 = 75;
			}
		} else if (Static103.anInt1813 == 140) {
			if (Static268.aClass230_64.method4954()) {
				Static71.aString10 = Static337.aClass169_303.method3680(Static48.anInt952);
				Static302.anInt5151 = 80;
				Static103.anInt1813 = 150;
			} else {
				Static71.aString10 = Static107.aClass169_316.method3680(Static48.anInt952) + Static268.aClass230_64.method4955() + "%";
				Static302.anInt5151 = 80;
			}
		} else if (Static103.anInt1813 == 150) {
			if (Static98.aClass230_32.method4954()) {
				Static71.aString10 = Static281.aClass169_264.method3680(Static48.anInt952);
				Static302.anInt5151 = 82;
				Static103.anInt1813 = 160;
			} else {
				Static71.aString10 = Static42.aClass169_36.method3680(Static48.anInt952) + Static98.aClass230_32.method4955() + "%";
				Static302.anInt5151 = 82;
			}
		} else if (Static103.anInt1813 == 160) {
			if (Static27.aClass230_8.method4954()) {
				Static71.aString10 = Static147.aClass169_131.method3680(Static48.anInt952);
				Static302.anInt5151 = 85;
				Static103.anInt1813 = 170;
			} else {
				Static71.aString10 = Static147.aClass169_131.method3680(Static48.anInt952) + Static27.aClass230_8.method4955() + "%";
				Static302.anInt5151 = 85;
			}
		} else if (Static103.anInt1813 == 170) {
			if (Static314.aClass230_70.method4958("details")) {
				Static353.method2107(Static314.aClass230_70, Static259.aClass158_6, Static140.aClass214_28, Static54.aClass153_1, Static16.aClass249_1, Static309.aClass184_3, Static230.aClass72_3);
				Static71.aString10 = Static86.aClass169_75.method3680(Static48.anInt952);
				Static302.anInt5151 = 89;
				Static103.anInt1813 = 180;
			} else {
				Static71.aString10 = Static302.aClass169_284.method3680(Static48.anInt952) + Static314.aClass230_70.method4986("details") + "%";
				Static302.anInt5151 = 87;
			}
		} else if (Static103.anInt1813 == 180) {
			local6 = Static51.method838();
			if (local6 == -1) {
				Static71.aString10 = Static161.aClass169_149.method3680(Static48.anInt952);
				Static302.anInt5151 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method786("worldlistfull");
				Static212.method2974(1000);
			} else if (Static148.aBoolean231) {
				Static71.aString10 = Static120.aClass169_109.method3680(Static48.anInt952);
				Static302.anInt5151 = 90;
				Static103.anInt1813 = 190;
			} else {
				this.method786("worldlistio_" + local6);
				Static212.method2974(1000);
			}
		} else if (Static103.anInt1813 == 190) {
			Static105.aBooleanArray10 = new boolean[Static351.aClass101_1.anInt2671];
			Static158.anIntArray322 = new int[Static351.aClass101_1.anInt2671];
			Static230.aStringArray83 = new String[Static279.aClass23_1.anInt382];
			for (local6 = 0; local6 < Static351.aClass101_1.anInt2671; local6++) {
				if (Static351.aClass101_1.method2167(local6).anInt62 == 0) {
					Static105.aBooleanArray10[local6] = true;
					Static380.anInt6134++;
				}
				Static158.anIntArray322[local6] = -1;
			}
			Static10.method97();
			Static160.anInt2901 = Static268.aClass230_64.method4970("loginscreen");
			Static25.aClass230_5.method4967(false);
			Static156.aClass230_44.method4967(true);
			Static145.aClass230_41.method4967(true);
			Static27.aClass230_8.method4967(true);
			Static281.aClass230_67.method4967(true);
			Static268.aClass230_64.method4967(true);
			Static391.aBoolean589 = true;
			Static307.aClass230_79.anInt5779 = 2;
			Static94.aClass230_31.anInt5779 = 2;
			Static226.aClass230_58.anInt5779 = 2;
			Static22.aClass230_59.anInt5779 = 2;
			Static358.aClass230_80.anInt5779 = 2;
			Static185.aClass230_49.anInt5779 = 2;
			Static55.aClass230_19.anInt5779 = 2;
			Static228.method3177(-1, Static188.aClass135_Sub1_1.anInt3380, -1, false);
			Static71.aString10 = Static303.aClass169_286.method3680(Static48.anInt952);
			Static103.anInt1813 = 200;
			Static302.anInt5151 = 95;
		} else if (Static103.anInt1813 == 200) {
			Static176.method2587(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method796()) {
			return;
		}
		Static166.anInt3667 = Integer.parseInt(this.getParameter("worldid"));
		Static96.aClass73_2 = Static227.method4203(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static40.method624(Static96.aClass73_2) && Static314.aClass73_5 != Static96.aClass73_2) {
			Static96.aClass73_2 = Static314.aClass73_5;
		}
		Static234.aClass28_3 = Static270.method4147(Integer.parseInt(this.getParameter("modewhat")));
		if (Static167.aClass28_2 != Static234.aClass28_3 && Static361.aClass28_4 != Static234.aClass28_3 && Static234.aClass28_3 != Static44.aClass28_1) {
			Static234.aClass28_3 = Static44.aClass28_1;
		}
		try {
			Static48.anInt952 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static48.anInt952 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static197.aBoolean345 = true;
		} else {
			Static197.aBoolean345 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static177.aBoolean120 = true;
		} else {
			Static177.aBoolean120 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static392.aBoolean593 = true;
		} else {
			Static392.aBoolean593 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static313.aClass94_8 = Static360.aClass94_7;
		} else {
			Static313.aClass94_8 = Static59.aClass94_3;
		}
		try {
			Static380.anInt6150 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static380.anInt6150 = 0;
		}
		Static161.aString26 = this.getParameter("quiturl");
		Static348.aString68 = this.getParameter("settings");
		if (Static348.aString68 == null) {
			Static348.aString68 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static318.anInt5417 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static318.anInt5417 = 0;
			}
		}
		Static172.anInt3129 = Integer.parseInt(this.getParameter("colourid"));
		if (Static172.anInt3129 < 0 || Static172.anInt3129 >= Static73.aColorArray1.length) {
			Static172.anInt3129 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static292.aBoolean478 = true;
			Static254.aBoolean435 = true;
		}
		Static305.aClient1 = this;
		if (Static313.aClass94_8 == Static59.aClass94_3) {
			Static48.anInt953 = 503;
			Static275.anInt4790 = 765;
		} else if (Static313.aClass94_8 == Static360.aClass94_7) {
			Static275.anInt4790 = 640;
			Static48.anInt953 = 480;
		}
		this.method793(Static48.anInt953, Static275.anInt4790, Static234.aClass28_3.method497() + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method818(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class1_Sub33 local14 = new Class1_Sub33(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method5174();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(30) int[] local30 = Static164.anIntArray351 = new int[6];
					local30[0] = local14.method5177();
					local30[1] = local14.method5177();
					local30[2] = local14.method5177();
					local30[3] = local14.method5177();
					local30[4] = local14.method5177();
					local30[5] = local14.method5177();
				} else {
					@Pc(81) int local81;
					@Pc(86) int local86;
					if (local18 == 4) {
						local81 = local14.method5174();
						Static129.anIntArray297 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static129.anIntArray297[local86] = local14.method5177();
							if (Static129.anIntArray297[local86] == 65535) {
								Static129.anIntArray297[local86] = -1;
							}
						}
					} else if (local18 == 5) {
						local81 = local14.method5174();
						Static228.anIntArray485 = new int[local81];
						for (local86 = 0; local86 < local81; local86++) {
							Static228.anIntArray485[local86] = local14.method5177();
							if (Static228.anIntArray485[local86] == 65535) {
								Static228.anIntArray485[local86] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method800() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static150.method2272();
		Static83.aClass250_1 = new Class250(Static341.aClass162_5);
		Static73.aClass92_1 = new Class92();
		if (Static96.aClass73_2 != Static314.aClass73_5) {
			Static54.aByteArrayArray5 = new byte[50][];
		}
		Static188.aClass135_Sub1_1 = new Class135_Sub1(Static341.aClass162_5);
		if (Static314.aClass73_5 == Static96.aClass73_2) {
			Static125.aString20 = this.getCodeBase().getHost();
			Static151.anInt2793 = 443;
			Static78.anInt1493 = 43594;
		} else if (Static40.method624(Static96.aClass73_2)) {
			Static125.aString20 = this.getCodeBase().getHost();
			Static78.anInt1493 = Static166.anInt3667 + 40000;
			Static151.anInt2793 = Static166.anInt3667 + 50000;
		} else if (Static182.aClass73_3 == Static96.aClass73_2) {
			Static151.anInt2793 = Static166.anInt3667 + 50000;
			Static78.anInt1493 = Static166.anInt3667 + 40000;
			Static125.aString20 = "127.0.0.1";
		}
		Static128.anInt2264 = Static151.anInt2793;
		Static314.aString60 = Static125.aString20;
		Static91.anInt1662 = Static78.anInt1493;
		Static108.anInt1883 = Static78.anInt1493;
		if (Static360.aClass94_7 == Static313.aClass94_8) {
			Static394.anInt6424 = 16777215;
			Static35.aShortArrayArray1 = Static130.aShortArrayArray4;
			Static130.anInt2407 = 0;
			Static107.aShortArrayArray8 = Static176.aShortArrayArray6;
			Static327.aBoolean516 = true;
			Static228.aShortArray90 = Static371.aShortArray74;
			Static307.aShortArray99 = Static222.aShortArray94;
		} else {
			Static307.aShortArray99 = Static68.aShortArray32;
			Static35.aShortArrayArray1 = Static150.aShortArrayArray5;
			Static228.aShortArray90 = Static215.aShortArray81;
			Static107.aShortArrayArray8 = Static89.aShortArrayArray2;
		}
		if (Static237.anInt3958 == 3) {
			Static233.anInt3887 = Static166.anInt3667;
		}
		Static391.aShortArray123 = Static318.aShortArray97 = Static296.aShortArray95 = Static228.aShortArray91 = new short[256];
		Static394.anInt6422 = Static108.anInt1883;
		Static264.aClass154_1 = Static308.method4588(Static177.aCanvas3);
		Static300.aClass182_1 = Static46.method709(Static177.aCanvas3);
		Static202.aClass114_1 = Static186.method2671();
		if (Static202.aClass114_1 != null) {
			Static202.aClass114_1.method2988(Static177.aCanvas3);
		}
		Static26.anInt588 = Static237.anInt3958;
		try {
			if (Static341.aClass162_5.aClass237_3 != null) {
				Static143.aClass192_4 = new Class192(Static341.aClass162_5.aClass237_3, 5200, 0);
				for (@Pc(166) int local166 = 0; local166 < 29; local166++) {
					Static329.aClass192Array2[local166] = new Class192(Static341.aClass162_5.aClass237Array1[local166], 6000, 0);
				}
				Static302.aClass192_5 = new Class192(Static341.aClass162_5.aClass237_1, 6000, 0);
				Static62.aClass38_1 = new Class38(255, Static143.aClass192_4, Static302.aClass192_5, 500000);
				Static31.aClass192_1 = new Class192(Static341.aClass162_5.aClass237_2, 24, 0);
				Static341.aClass162_5.aClass237Array1 = null;
				Static341.aClass162_5.aClass237_2 = null;
				Static341.aClass162_5.aClass237_3 = null;
				Static341.aClass162_5.aClass237_1 = null;
			}
		} catch (@Pc(224) IOException local224) {
			Static62.aClass38_1 = null;
			Static31.aClass192_1 = null;
			Static302.aClass192_5 = null;
			Static143.aClass192_4 = null;
		}
		if (Static314.aClass73_5 != Static96.aClass73_2) {
			Static260.aBoolean445 = true;
		}
		Static176.aString32 = (Static313.aClass94_8 == Static59.aClass94_3 ? Static209.aClass169_185 : Static172.aClass169_162).method3680(Static48.anInt952);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method819(@OriginalArg(0) int arg0) {
		Static147.aClass130_3 = null;
		Static73.aClass92_1.anInt2179 = arg0;
		Static73.aClass92_1.anInt2180++;
		Static252.aClass112_9 = null;
		Static321.anInt5438 = 0;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method820() {
		@Pc(12) boolean local12 = Static73.aClass92_1.method1776();
		if (!local12) {
			this.method809();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method822() {
		Static109.anInt1911++;
		Static97.method1418(-1, null, -1);
		Static393.method5571(-1, null, -1);
		Static198.method2853();
		Static105.anInt1853++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class25_Sub1_Sub1_Sub2 local33 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass59_1.aByte16;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method1877();
					@Pc(71) int local71;
					if ((local39 & 0x2) != 0 && local33.anInt2381 == 0 && Math.random() * 1000.0D < 10.0D) {
						local71 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(79) int local79 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local71 != 0 || local79 != 0) {
							@Pc(93) int local93 = local71 + local33.anIntArray296[0];
							@Pc(100) int local100 = local79 + local33.anIntArray295[0];
							if (local93 < 0) {
								local93 = 0;
							} else if (Static92.anInt1675 - local50 - 1 < local93) {
								local93 = Static92.anInt1675 - local50 - 1;
							}
							if (local100 < 0) {
								local100 = 0;
							} else if (local100 > Static262.anInt6340 - local50 - 1) {
								local100 = Static262.anInt6340 - local50 - 1;
							}
							@Pc(167) int local167 = Static126.method1835(0, local50, local33.anIntArray296[0], Static42.anIntArray123, local50, Static257.aClass222Array1[local33.aByte70], local100, Static48.anIntArray134, local93, 0, local33.anIntArray295[0], -1, true, local50);
							if (local167 > 0) {
								if (local167 > 9) {
									local167 = 9;
								}
								for (@Pc(176) int local176 = 0; local176 < local167; local176++) {
									local33.anIntArray296[local176] = Static48.anIntArray134[local167 - local176 - 1];
									local33.anIntArray295[local176] = Static42.anIntArray123[local167 - local176 - 1];
									local33.aByteArray40[local176] = 1;
								}
								local33.anInt2381 = local167;
							}
						}
					}
					Static166.method2989(true, local33);
					local71 = Static17.method191(local33);
					Static279.method4279(Static89.anInt1645, local33, local71, Static341.anInt5632);
					Static370.method5192(local33);
				}
			}
		}
		if (Static354.anInt5766 == 0 && Static300.anInt5112 == 0) {
			if (Static323.anInt5463 == 2) {
				Static164.method2421();
			} else {
				Static123.method4613();
			}
			if (Static256.anInt4409 >> 7 < 14 || Static92.anInt1675 - 14 <= Static256.anInt4409 >> 7 || Static133.anInt2471 >> 7 < 14 || Static133.anInt2471 >> 7 >= Static262.anInt6340 - 14) {
				Static246.method3675();
			}
		}
		while (true) {
			@Pc(284) Class1_Sub39 local284;
			@Pc(289) Class117 local289;
			@Pc(297) Class117 local297;
			do {
				local284 = (Class1_Sub39) Static310.aClass17_64.method203();
				if (local284 == null) {
					while (true) {
						do {
							local284 = (Class1_Sub39) Static22.aClass17_35.method203();
							if (local284 == null) {
								while (true) {
									do {
										local284 = (Class1_Sub39) Static140.aClass17_67.method203();
										if (local284 == null) {
											if (Static227.aClass117_14 != null) {
												Static334.method4795();
											}
											if (Static366.anInt5883 % 1500 == 0) {
												Static180.method2596();
											}
											Static140.method5237();
											if (Static121.aBoolean177 && Static378.method5293() - 60000L > Static104.aLong56) {
												Static251.method3883();
											}
											return;
										}
										local289 = local284.aClass117_16;
										if (local289.anInt3043 < 0) {
											break;
										}
										local297 = Static13.method107(local289.anInt3066);
									} while (local297 == null || local297.aClass117Array1 == null || local289.anInt3043 >= local297.aClass117Array1.length || local289 != local297.aClass117Array1[local289.anInt3043]);
									Static387.method5496(local284);
								}
							}
							local289 = local284.aClass117_16;
							if (local289.anInt3043 < 0) {
								break;
							}
							local297 = Static13.method107(local289.anInt3066);
						} while (local297 == null || local297.aClass117Array1 == null || local289.anInt3043 >= local297.aClass117Array1.length || local297.aClass117Array1[local289.anInt3043] != local289);
						Static387.method5496(local284);
					}
				}
				local289 = local284.aClass117_16;
				if (local289.anInt3043 < 0) {
					break;
				}
				local297 = Static13.method107(local289.anInt3066);
			} while (local297 == null || local297.aClass117Array1 == null || local289.anInt3043 >= local297.aClass117Array1.length || local289 != local297.aClass117Array1[local289.anInt3043]);
			Static387.method5496(local284);
		}
	}
}
