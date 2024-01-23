import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
			if (arg0.length < 7 || arg0.length > 8) {
				Static209.method3280();
			}
			Static59.anInt1179 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static46.anInt954 = 0;
			} else if (arg0[1].equals("office")) {
				Static46.anInt954 = 1;
			} else if (arg0[1].equals("local")) {
				Static46.anInt954 = 2;
			} else {
				Static209.method3280();
			}
			if (arg0[2].equals("live")) {
				Static166.anInt3405 = 0;
			} else if (arg0[2].equals("rc")) {
				Static166.anInt3405 = 1;
			} else if (arg0[2].equals("wip")) {
				Static166.anInt3405 = 2;
			} else {
				Static209.method3280();
			}
			if (arg0[4].equals("free")) {
				Static224.aBoolean3 = false;
			} else if (arg0[4].equals("members")) {
				Static224.aBoolean3 = true;
			} else {
				Static209.method3280();
			}
			if (arg0[5].equals("english")) {
				Static195.anInt3972 = 0;
			} else if (arg0[5].equals("german")) {
				Static121.method1939();
				Static195.anInt3972 = 1;
			} else {
				Static209.method3280();
			}
			if (arg0[6].equals("game0")) {
				Static186.anInt4481 = 0;
			} else if (arg0[6].equals("game1")) {
				Static186.anInt4481 = 1;
			} else {
				Static209.method3280();
			}
			if (arg0.length != 8) {
				Static9.aBoolean8 = false;
			} else if (arg0[7].equals("safemode")) {
				Static9.aBoolean8 = true;
			} else {
				Static209.method3280();
			}
			Static20.aString1 = "127.0.0.1";
			Static107.anInt2137 = 0;
			Static38.aClass50_302 = Static7.aClass50_69;
			@Pc(180) client local180 = new client();
			local180.method548(Static166.anInt3405 + 32, "runescape");
			Static69.aFrame1.setLocation(40, 40);
		} catch (@Pc(197) Exception local197) {
			Static204.method3249(local197, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method549() {
		@Pc(21) int local21;
		if (Static63.anInt1265 == 0) {
			@Pc(12) Runtime local12 = Runtime.getRuntime();
			local21 = (int) ((local12.totalMemory() - local12.freeMemory()) / 1024L);
			@Pc(24) long local24 = Static179.method2941();
			if (Static153.aLong127 == 0L) {
				Static153.aLong127 = local24;
			}
			if (local21 > 16384 && local24 - Static153.aLong127 < 5000L) {
				if (local24 - Static231.aLong170 > 1000L) {
					System.gc();
					Static231.aLong170 = local24;
				}
				Static124.anInt2471 = 5;
				Static22.aClass50_169 = Static76.aClass50_498;
			} else {
				Static124.anInt2471 = 5;
				Static22.aClass50_169 = Static157.aClass50_1075;
				Static63.anInt1265 = 10;
			}
			return;
		}
		@Pc(74) int local74;
		if (Static63.anInt1265 == 10) {
			Static1.method35();
			for (local74 = 0; local74 < 4; local74++) {
				Static22.aClass16Array1[local74] = new Class16(104, 104);
			}
			Static22.aClass50_169 = Static163.aClass50_1098;
			Static63.anInt1265 = 30;
			Static124.anInt2471 = 10;
		} else if (Static63.anInt1265 == 30) {
			Static109.aClass86_Sub1_25 = Static129.method2048(true, false, 0, true);
			Static60.aClass86_Sub1_10 = Static129.method2048(true, false, 1, true);
			Static64.aClass86_Sub1_12 = Static129.method2048(true, true, 2, false);
			Static65.aClass86_Sub1_38 = Static129.method2048(true, false, 3, true);
			Static38.aClass86_Sub1_6 = Static129.method2048(true, false, 4, true);
			Static136.aClass86_Sub1_16 = Static129.method2048(true, true, 5, true);
			Static58.aClass86_Sub1_9 = Static129.method2048(false, true, 6, true);
			Static92.aClass86_Sub1_20 = Static129.method2048(true, false, 7, true);
			Static141.aClass86_Sub1_33 = Static129.method2048(true, false, 8, true);
			Static27.aClass86_Sub1_4 = Static129.method2048(true, false, 9, true);
			Static66.aClass86_Sub1_14 = Static129.method2048(true, false, 10, true);
			Static212.aClass86_Sub1_41 = Static129.method2048(true, false, 11, true);
			Static197.aClass86_Sub1_43 = Static129.method2048(true, false, 12, true);
			Static25.aClass86_Sub1_2 = Static129.method2048(true, false, 13, true);
			Static32.aClass86_Sub1_5 = Static129.method2048(false, false, 14, true);
			Static221.aClass86_Sub1_42 = Static129.method2048(true, false, 15, true);
			Static119.aClass86_Sub1_26 = Static129.method2048(true, false, 16, true);
			Static25.aClass86_Sub1_3 = Static129.method2048(true, false, 17, true);
			Static13.aClass86_Sub1_1 = Static129.method2048(true, false, 18, true);
			Static166.aClass86_Sub1_32 = Static129.method2048(true, false, 19, true);
			Static92.aClass86_Sub1_21 = Static129.method2048(true, false, 20, true);
			Static120.aClass86_Sub1_27 = Static129.method2048(true, false, 21, true);
			Static206.aClass86_Sub1_37 = Static129.method2048(true, false, 22, true);
			Static204.aClass86_Sub1_36 = Static129.method2048(true, true, 23, true);
			Static190.aClass86_Sub1_34 = Static129.method2048(true, false, 24, true);
			Static104.aClass86_Sub1_22 = Static129.method2048(true, false, 25, true);
			Static209.aClass86_Sub1_40 = Static129.method2048(true, true, 26, true);
			Static22.aClass50_169 = Static152.aClass50_1051;
			Static124.anInt2471 = 15;
			Static63.anInt1265 = 40;
		} else if (Static63.anInt1265 == 40) {
			local74 = Static109.aClass86_Sub1_25.method3343() * 4 / 100;
			local74 += Static60.aClass86_Sub1_10.method3343() * 4 / 100;
			local74 += Static64.aClass86_Sub1_12.method3343() / 100;
			local74 += Static65.aClass86_Sub1_38.method3343() * 2 / 100;
			local74 += Static38.aClass86_Sub1_6.method3343() * 6 / 100;
			local74 += Static136.aClass86_Sub1_16.method3343() * 4 / 100;
			local74 += Static58.aClass86_Sub1_9.method3343() * 2 / 100;
			local74 += Static92.aClass86_Sub1_20.method3343() * 50 / 100;
			local74 += Static141.aClass86_Sub1_33.method3343() * 2 / 100;
			local74 += Static27.aClass86_Sub1_4.method3343() * 2 / 100;
			local74 += Static66.aClass86_Sub1_14.method3343() * 2 / 100;
			local74 += Static212.aClass86_Sub1_41.method3343() * 2 / 100;
			local74 += Static197.aClass86_Sub1_43.method3343() * 2 / 100;
			local74 += Static25.aClass86_Sub1_2.method3343() * 2 / 100;
			local74 += Static32.aClass86_Sub1_5.method3343() * 2 / 100;
			local74 += Static221.aClass86_Sub1_42.method3343() * 2 / 100;
			local74 += Static119.aClass86_Sub1_26.method3343() / 100;
			local74 += Static25.aClass86_Sub1_3.method3343() / 100;
			local74 += Static13.aClass86_Sub1_1.method3343() / 100;
			local74 += Static166.aClass86_Sub1_32.method3343() / 100;
			local74 += Static92.aClass86_Sub1_21.method3343() / 100;
			local74 += Static120.aClass86_Sub1_27.method3343() / 100;
			local74 += Static206.aClass86_Sub1_37.method3343() / 100;
			local74 += Static204.aClass86_Sub1_36.method3343() / 100;
			local74 += Static190.aClass86_Sub1_34.method3343() / 100;
			local74 += Static104.aClass86_Sub1_22.method3343() / 100;
			local74 += Static209.aClass86_Sub1_40.method3343() / 100;
			if (local74 == 100) {
				Static124.anInt2471 = 20;
				Static22.aClass50_169 = Static199.aClass50_1297;
				Static223.method3421(Static141.aClass86_Sub1_33);
				Static2.method43(Static141.aClass86_Sub1_33);
				Static176.method2914(Static141.aClass86_Sub1_33);
				Static223.method3424(Static141.aClass86_Sub1_33);
				Static63.anInt1265 = 45;
			} else {
				if (local74 != 0) {
					Static22.aClass50_169 = Static17.method257(new Class50[] { Static111.aClass50_714, Static160.method2684(local74), Static172.aClass50_1150 });
				}
				Static124.anInt2471 = 20;
			}
		} else if (Static63.anInt1265 == 45) {
			Static220.method3389(Static151.aBoolean134);
			Static172.aClass1_Sub12_Sub3_4 = new Class1_Sub12_Sub3();
			Static172.aClass1_Sub12_Sub3_4.method2622();
			Static58.aClass48_1 = Static140.method2328(0, Static193.aCanvas4, Static4.aClass87_1, 22050);
			Static58.aClass48_1.method3227(Static172.aClass1_Sub12_Sub3_4);
			Static142.method2342(Static32.aClass86_Sub1_5, Static38.aClass86_Sub1_6, Static221.aClass86_Sub1_42, Static172.aClass1_Sub12_Sub3_4);
			Static132.aClass48_2 = Static140.method2328(1, Static193.aCanvas4, Static4.aClass87_1, 2048);
			Static226.aClass1_Sub12_Sub1_2 = new Class1_Sub12_Sub1();
			Static132.aClass48_2.method3227(Static226.aClass1_Sub12_Sub1_2);
			Static225.aClass8_1 = new Class8(22050, Static50.anInt1044);
			Static71.anInt1332 = Static58.aClass86_Sub1_9.method3336(Static138.aClass50_948);
			Static124.anInt2471 = 30;
			Static22.aClass50_169 = Static78.aClass50_518;
			Static63.anInt1265 = 50;
		} else if (Static63.anInt1265 == 50) {
			local74 = Static125.method2002(Static25.aClass86_Sub1_2, Static141.aClass86_Sub1_33);
			local21 = Static25.method364();
			if (local21 > local74) {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static70.aClass50_481, Static160.method2684(local74 * 100 / local21), Static172.aClass50_1150 });
				Static124.anInt2471 = 35;
			} else {
				Static22.aClass50_169 = Static60.aClass50_425;
				Static124.anInt2471 = 35;
				Static63.anInt1265 = 60;
			}
		} else if (Static63.anInt1265 == 60) {
			local74 = Static157.method2613(Static141.aClass86_Sub1_33);
			local21 = Static118.method1867();
			if (local21 > local74) {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static150.aClass50_1030, Static160.method2684(local74 * 100 / local21), Static172.aClass50_1150 });
				Static124.anInt2471 = 40;
			} else {
				Static22.aClass50_169 = Static79.aClass50_1055;
				Static124.anInt2471 = 40;
				Static63.anInt1265 = 65;
			}
		} else if (Static63.anInt1265 == 65) {
			Static91.method3220(Static25.aClass86_Sub1_2, Static141.aClass86_Sub1_33);
			Static22.aClass50_169 = Static21.aClass50_164;
			Static124.anInt2471 = 45;
			Static229.method3481(5);
			Static63.anInt1265 = 70;
		} else if (Static63.anInt1265 == 70) {
			Static64.aClass86_Sub1_12.method3312();
			local74 = Static64.aClass86_Sub1_12.method3340();
			Static119.aClass86_Sub1_26.method3312();
			local74 += Static119.aClass86_Sub1_26.method3340();
			Static25.aClass86_Sub1_3.method3312();
			local74 += Static25.aClass86_Sub1_3.method3340();
			Static13.aClass86_Sub1_1.method3312();
			local74 += Static13.aClass86_Sub1_1.method3340();
			Static166.aClass86_Sub1_32.method3312();
			local74 += Static166.aClass86_Sub1_32.method3340();
			Static92.aClass86_Sub1_21.method3312();
			local74 += Static92.aClass86_Sub1_21.method3340();
			Static120.aClass86_Sub1_27.method3312();
			local74 += Static120.aClass86_Sub1_27.method3340();
			Static206.aClass86_Sub1_37.method3312();
			local74 += Static206.aClass86_Sub1_37.method3340();
			Static190.aClass86_Sub1_34.method3312();
			local74 += Static190.aClass86_Sub1_34.method3340();
			Static104.aClass86_Sub1_22.method3312();
			local74 += Static104.aClass86_Sub1_22.method3340();
			if (local74 < 1000) {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static233.aClass50_1428, Static160.method2684(local74 / 10), Static172.aClass50_1150 });
				Static124.anInt2471 = 50;
			} else {
				Static5.method77(Static64.aClass86_Sub1_12);
				Static49.method773(Static64.aClass86_Sub1_12);
				Static121.method1941(Static64.aClass86_Sub1_12);
				Static210.method3287(Static92.aClass86_Sub1_20, Static64.aClass86_Sub1_12);
				Static130.method2185(Static119.aClass86_Sub1_26, Static224.aBoolean3, Static92.aClass86_Sub1_20);
				Static183.method3010(Static13.aClass86_Sub1_1, Static92.aClass86_Sub1_20);
				Static103.method1594(Static224.aBoolean3, Static92.aClass86_Sub1_20, Static166.aClass86_Sub1_32, Static117.aClass1_Sub1_Sub10_Sub1_1);
				Static136.method1040(Static64.aClass86_Sub1_12);
				Static55.method813(Static92.aClass86_Sub1_21, Static109.aClass86_Sub1_25, Static60.aClass86_Sub1_10);
				Static63.method971(Static92.aClass86_Sub1_20, Static120.aClass86_Sub1_27);
				Static183.method3005(Static206.aClass86_Sub1_37);
				Static39.method638(Static64.aClass86_Sub1_12);
				Static118.method1869(Static141.aClass86_Sub1_33, Static92.aClass86_Sub1_20, Static25.aClass86_Sub1_2, Static65.aClass86_Sub1_38);
				Static165.method2165(Static64.aClass86_Sub1_12);
				Static22.method308(Static25.aClass86_Sub1_3);
				Static42.method671(new Class30(), Static104.aClass86_Sub1_22, Static190.aClass86_Sub1_34);
				Static35.method559(Static104.aClass86_Sub1_22, Static190.aClass86_Sub1_34);
				Static22.aClass50_169 = Static233.aClass50_1424;
				Static124.anInt2471 = 50;
				Static142.method2347();
				Static63.anInt1265 = 80;
			}
		} else if (Static63.anInt1265 == 80) {
			local74 = Static6.method86(Static141.aClass86_Sub1_33);
			local21 = Static26.method379();
			if (local21 > local74) {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static99.aClass50_1434, Static160.method2684(local74 * 100 / local21), Static172.aClass50_1150 });
				Static124.anInt2471 = 60;
			} else {
				Static219.method2419(Static141.aClass86_Sub1_33);
				Static22.aClass50_169 = Static2.aClass50_21;
				Static124.anInt2471 = 60;
				Static63.anInt1265 = 90;
			}
		} else if (Static63.anInt1265 == 90) {
			if (Static209.aClass86_Sub1_40.method3312()) {
				@Pc(1092) Class82 local1092 = new Class82(Static27.aClass86_Sub1_4, Static209.aClass86_Sub1_40, Static141.aClass86_Sub1_33, 20, !Static205.aBoolean196);
				Static215.method3365(local1092);
				if (Static231.anInt4421 == 1) {
					Static215.method3361(0.9F);
				}
				if (Static231.anInt4421 == 2) {
					Static215.method3361(0.8F);
				}
				if (Static231.anInt4421 == 3) {
					Static215.method3361(0.7F);
				}
				if (Static231.anInt4421 == 4) {
					Static215.method3361(0.6F);
				}
				Static22.aClass50_169 = Static191.aClass50_1259;
				Static63.anInt1265 = 100;
				Static124.anInt2471 = 70;
			} else {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static114.aClass50_787, Static160.method2684(Static209.aClass86_Sub1_40.method3340()), Static172.aClass50_1150 });
				Static124.anInt2471 = 70;
			}
		} else if (Static63.anInt1265 == 100) {
			if (Static189.method3116(Static141.aClass86_Sub1_33)) {
				Static63.anInt1265 = 110;
			}
		} else if (Static63.anInt1265 == 110) {
			Static113.aClass21_1 = new Class21();
			Static4.aClass87_1.method2694(Static113.aClass21_1, 10);
			Static22.aClass50_169 = Static93.aClass50_598;
			Static63.anInt1265 = 120;
			Static124.anInt2471 = 75;
		} else if (Static63.anInt1265 == 120) {
			if (Static66.aClass86_Sub1_14.method3321(Static30.aClass50_208, Static7.aClass50_69)) {
				@Pc(1200) Class59 local1200 = new Class59(Static66.aClass86_Sub1_14.method3335(Static7.aClass50_69, Static30.aClass50_208));
				Static46.method700(local1200);
				Static63.anInt1265 = 130;
				Static22.aClass50_169 = Static98.aClass50_649;
				Static124.anInt2471 = 80;
			} else {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static37.aClass50_297, Static44.aClass50_334 });
				Static124.anInt2471 = 80;
			}
		} else if (Static63.anInt1265 == 130) {
			if (!Static65.aClass86_Sub1_38.method3312()) {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static22.aClass50_170, Static160.method2684(Static65.aClass86_Sub1_38.method3340() * 3 / 4), Static172.aClass50_1150 });
				Static124.anInt2471 = 85;
			} else if (!Static197.aClass86_Sub1_43.method3312()) {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static22.aClass50_170, Static160.method2684(Static197.aClass86_Sub1_43.method3340() / 10 + 75), Static172.aClass50_1150 });
				Static124.anInt2471 = 85;
			} else if (!Static25.aClass86_Sub1_2.method3312()) {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static22.aClass50_170, Static160.method2684(Static25.aClass86_Sub1_2.method3340() / 20 + 85), Static172.aClass50_1150 });
				Static124.anInt2471 = 85;
			} else if (Static204.aClass86_Sub1_36.method3310(Static122.aClass50_834)) {
				Static190.method3123(Static82.aClass78_Sub1Array2, Static102.aClass78_Sub1Array3, Static204.aClass78_Sub1Array6, Static204.aClass86_Sub1_36, Static73.aClass1_Sub1_Sub8_Sub1Array7, Static233.aClass78_Sub1Array9);
				Static63.anInt1265 = 140;
				Static22.aClass50_169 = Static176.aClass50_1200;
				Static124.anInt2471 = 100;
			} else {
				Static22.aClass50_169 = Static17.method257(new Class50[] { Static22.aClass50_170, Static160.method2684(Static204.aClass86_Sub1_36.method3331(Static122.aClass50_834) / 10 + 90), Static172.aClass50_1150 });
				Static124.anInt2471 = 85;
			}
		} else if (Static63.anInt1265 == 140) {
			Static82.anInt1670 = Static65.aClass86_Sub1_38.method3336(Static40.aClass50_306);
			Static136.aClass86_Sub1_16.method3341(false);
			Static58.aClass86_Sub1_9.method3341(true);
			Static141.aClass86_Sub1_33.method3341(true);
			Static25.aClass86_Sub1_2.method3341(true);
			Static66.aClass86_Sub1_14.method3341(true);
			Static65.aClass86_Sub1_38.method3341(true);
			Static223.aBoolean209 = true;
			Static118.method1872();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method553(@OriginalArg(1) int arg0) {
		Static8.aClass116_1 = null;
		Static216.aClass26_4 = null;
		if (Static8.anInt192 == Static14.anInt261) {
			Static14.anInt261 = Static8.anInt188;
		} else {
			Static14.anInt261 = Static8.anInt192;
		}
		Static17.anInt341++;
		Static123.anInt1748 = 0;
		if (Static17.anInt341 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static220.anInt4304 == 0 || Static220.anInt4304 == 5) {
				this.method530("js5connect_full");
				Static220.anInt4304 = 1000;
			} else {
				Static233.anInt4474 = 3000;
			}
		} else if (Static17.anInt341 >= 2 && arg0 == 6) {
			this.method530("js5connect_outofdate");
			Static220.anInt4304 = 1000;
		} else if (Static17.anInt341 >= 4) {
			if (Static220.anInt4304 == 0 || Static220.anInt4304 == 5) {
				this.method530("js5connect");
				Static220.anInt4304 = 1000;
			} else {
				Static233.anInt4474 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method533() {
		if (Static220.anInt4304 == 1000) {
			return;
		}
		Static107.anInt2132++;
		if (Static107.anInt2132 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static71.anInt1340 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static125.aRandom1.setSeed((long) Static71.anInt1340);
		}
		this.method558();
		Static111.method1756();
		Static119.method1894();
		Static192.method3138();
		Static183.method3008();
		Static26.method381();
		if (Static48.aClass42_1 != null) {
			@Pc(67) int local67 = Static48.aClass42_1.method1039();
			Static87.anInt1831 = local67;
		}
		if (Static220.anInt4304 == 0) {
			this.method549();
			Static19.method292();
		} else if (Static220.anInt4304 == 5) {
			this.method549();
			Static19.method292();
		} else if (Static220.anInt4304 == 25 || Static220.anInt4304 == 28) {
			Static11.method181();
		}
		if (Static220.anInt4304 == 10) {
			this.method554();
			Static224.method66();
			Static54.method807();
		} else if (Static220.anInt4304 == 30) {
			Static42.method677();
		} else if (Static220.anInt4304 == 40) {
			Static54.method807();
			if (Static133.anInt2753 != -3) {
				if (Static133.anInt2753 == 15) {
					Static100.method1553();
				} else if (Static133.anInt2753 != 2) {
					Static118.method1872();
					return;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method539() {
		if (Static18.aBrowsercontrol1 != null) {
			Static18.aBrowsercontrol1.method2291();
			Static18.aBrowsercontrol1 = null;
		}
		if (Static4.aClass87_1 != null) {
			Static4.aClass87_1.method2696(this.getClass());
		}
		if (Static113.aClass21_1 != null) {
			Static113.aClass21_1.aBoolean43 = false;
		}
		Static113.aClass21_1 = null;
		if (Static33.aClass26_2 != null) {
			Static33.aClass26_2.method776();
			Static33.aClass26_2 = null;
		}
		Static19.method290(Static193.aCanvas4);
		Static173.method2878(Static193.aCanvas4);
		if (Static48.aClass42_1 != null) {
			Static48.aClass42_1.method1036(Static193.aCanvas4);
		}
		Static16.method232();
		Static56.method816();
		Static48.aClass42_1 = null;
		if (Static58.aClass48_1 != null) {
			Static58.aClass48_1.method3216();
		}
		if (Static132.aClass48_2 != null) {
			Static132.aClass48_2.method3216();
		}
		Static113.method1840();
		Static140.method2332();
		try {
			if (Static85.aClass53_1 != null) {
				Static85.aClass53_1.method1434();
			}
			if (Static116.aClass53Array1 != null) {
				for (@Pc(81) int local81 = 0; local81 < Static116.aClass53Array1.length; local81++) {
					if (Static116.aClass53Array1[local81] != null) {
						Static116.aClass53Array1[local81].method1434();
					}
				}
			}
			if (Static129.aClass53_3 != null) {
				Static129.aClass53_3.method1434();
			}
			if (Static93.aClass53_2 != null) {
				Static93.aClass53_2.method1434();
			}
		} catch (@Pc(115) IOException local115) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method536() {
		Static57.method836(Static9.aBoolean8, Static4.aClass87_1);
		Static12.aShortArray2 = Static194.aShortArray60 = Static173.aShortArray54 = Static163.aShortArray43 = new short[256];
		if (Static186.anInt4481 == 1) {
			Static112.aShortArray34 = Static124.aShortArray39;
			Static213.aShortArray61 = Static131.aShortArray40;
			Static60.aShortArrayArray4 = Static234.aShortArrayArray6;
			Static31.aShortArrayArray2 = Static6.aShortArrayArray1;
		} else {
			Static31.aShortArrayArray2 = Static86.aShortArrayArray5;
			Static60.aShortArrayArray4 = Static47.aShortArrayArray3;
			Static213.aShortArray61 = Static101.aShortArray29;
			Static112.aShortArray34 = Static93.aShortArray26;
		}
		Static8.anInt188 = Static46.anInt954 == 0 ? 443 : Static59.anInt1179 + 50000;
		Static8.anInt192 = Static46.anInt954 == 0 ? 43594 : Static59.anInt1179 + 40000;
		Static14.anInt261 = Static8.anInt192;
		Static75.method1097();
		Static156.method2584(Static193.aCanvas4);
		Static162.method2709(Static193.aCanvas4);
		Static48.aClass42_1 = Static53.method800();
		if (Static48.aClass42_1 != null) {
			Static48.aClass42_1.method1038(Static193.aCanvas4);
		}
		Static211.anInt4179 = Static161.anInt3336;
		try {
			if (Static4.aClass87_1.aClass34_2 != null) {
				Static85.aClass53_1 = new Class53(Static4.aClass87_1.aClass34_2, 5200, 0);
				for (@Pc(93) int local93 = 0; local93 < 27; local93++) {
					Static116.aClass53Array1[local93] = new Class53(Static4.aClass87_1.aClass34Array1[local93], 6000, 0);
				}
				Static129.aClass53_3 = new Class53(Static4.aClass87_1.aClass34_3, 6000, 0);
				Static52.aClass123_5 = new Class123(255, Static85.aClass53_1, Static129.aClass53_3, 500000);
				Static93.aClass53_2 = new Class53(Static4.aClass87_1.aClass34_4, 24, 0);
				Static4.aClass87_1.aClass34_4 = null;
				Static4.aClass87_1.aClass34_3 = null;
				Static4.aClass87_1.aClass34_2 = null;
				Static4.aClass87_1.aClass34Array1 = null;
			}
		} catch (@Pc(149) IOException local149) {
			Static52.aClass123_5 = null;
			Static129.aClass53_3 = null;
			Static85.aClass53_1 = null;
			Static93.aClass53_2 = null;
		}
		if (Static46.anInt954 != 0) {
			Static229.aBoolean214 = true;
		}
		Static162.aClass50_1088 = Static171.aClass50_1147;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method538()) {
			return;
		}
		Static59.anInt1179 = Integer.parseInt(this.getParameter("worldid"));
		Static166.anInt3405 = Integer.parseInt(this.getParameter("modewhat"));
		Static46.anInt954 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("safemode");
		if (local29 != null && local29.equals("1")) {
			Static9.aBoolean8 = true;
		} else {
			Static9.aBoolean8 = false;
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static224.aBoolean3 = true;
		} else {
			Static224.aBoolean3 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static121.method1939();
			Static195.anInt3972 = 1;
		}
		@Pc(75) String local75 = this.getParameter("game");
		if (local75 != null && local75.equals("1")) {
			Static186.anInt4481 = 1;
		} else {
			Static186.anInt4481 = 0;
		}
		try {
			Static112.anInt2225 = Integer.parseInt(this.getParameter("js"));
			Static201.anInt4058 = Integer.parseInt(this.getParameter("plug"));
			Static107.anInt2137 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(104) Exception local104) {
		}
		Static38.aClass50_302 = Static99.aClass50_1432.method1224(this);
		if (Static38.aClass50_302 == null) {
			Static38.aClass50_302 = Static7.aClass50_69;
		}
		@Pc(117) String local117 = this.getParameter("advert");
		if (local117 != null) {
			@Pc(123) byte[] local123;
			try {
				local123 = local117.getBytes("ISO-8859-1");
			} catch (@Pc(125) UnsupportedEncodingException local125) {
				local123 = local117.getBytes();
			}
			@Pc(135) Class50 local135 = Static20.method301(local123.length, 0, local123);
			@Pc(139) boolean local139 = Static201.method3214(local135);
			if (local139) {
				Static4.aClass50_32 = local135;
			}
		}
		Static20.aString1 = this.getCodeBase().getHost();
		this.method544(Static166.anInt3405 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method554() {
		Static5.method76(this);
		for (Static40.anInt879 = 0; Static177.method2919() && Static40.anInt879 < 128; Static40.anInt879++) {
			Static122.anIntArray270[Static40.anInt879] = Static69.anInt1316;
			Static186.anIntArray518[Static40.anInt879] = Static57.anInt1134;
		}
		Static42.anInt921++;
		if (Static10.anInt204 != -1) {
			Static221.method3400(Static48.anInt1023, 0, 0, Static185.anInt3844, 0, Static10.anInt204, 0);
		}
		Static31.anInt594++;
		Static66.method1002();
		while (true) {
			@Pc(66) Class1_Sub29 local66;
			@Pc(71) Class93 local71;
			@Pc(82) Class93 local82;
			do {
				local66 = (Class1_Sub29) Static23.aClass75_3.method2241();
				if (local66 == null) {
					while (true) {
						do {
							local66 = (Class1_Sub29) Static191.aClass75_19.method2241();
							if (local66 == null) {
								while (true) {
									do {
										local66 = (Class1_Sub29) Static209.aClass75_21.method2241();
										if (local66 == null) {
											if (Static54.aClass93_35 != null) {
												Static109.method1724();
												return;
											}
											return;
										}
										local71 = local66.aClass93_119;
										if (local71.anInt3614 < 0) {
											break;
										}
										local82 = Static164.method2725(local71.anInt3660);
									} while (local82 == null || local82.aClass93Array1 == null || local82.aClass93Array1.length <= local71.anInt3614 || local71 != local82.aClass93Array1[local71.anInt3614]);
									Static144.method2381(local66);
								}
							}
							local71 = local66.aClass93_119;
							if (local71.anInt3614 < 0) {
								break;
							}
							local82 = Static164.method2725(local71.anInt3660);
						} while (local82 == null || local82.aClass93Array1 == null || local82.aClass93Array1.length <= local71.anInt3614 || local71 != local82.aClass93Array1[local71.anInt3614]);
						Static144.method2381(local66);
					}
				}
				local71 = local66.aClass93_119;
				if (local71.anInt3614 < 0) {
					break;
				}
				local82 = Static164.method2725(local71.anInt3660);
			} while (local82 == null || local82.aClass93Array1 == null || local82.aClass93Array1.length <= local71.anInt3614 || local82.aClass93Array1[local71.anInt3614] != local71);
			Static144.method2381(local66);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method556() {
		if (Static156.anInt3211 >= 4) {
			this.method530("js5crc");
			Static220.anInt4304 = 1000;
			return;
		}
		if (Static165.anInt2647 >= 4) {
			if (Static220.anInt4304 == 0 || Static220.anInt4304 == 5) {
				this.method530("js5io");
				Static220.anInt4304 = 1000;
				return;
			}
			Static165.anInt2647 = 3;
			Static233.anInt4474 = 3000;
		}
		if (Static233.anInt4474-- > 0) {
			return;
		}
		try {
			if (Static123.anInt1748 == 0) {
				Static8.aClass116_1 = Static4.aClass87_1.method2686(Static14.anInt261, Static20.aString1);
				Static123.anInt1748++;
			}
			if (Static123.anInt1748 == 1) {
				if (Static8.aClass116_1.anInt4156 == 2) {
					this.method553(-1);
					return;
				}
				if (Static8.aClass116_1.anInt4156 == 1) {
					Static123.anInt1748++;
				}
			}
			if (Static123.anInt1748 == 2) {
				Static216.aClass26_4 = new Class26((Socket) Static8.aClass116_1.anObject5, Static4.aClass87_1);
				@Pc(108) Class1_Sub17 local108 = new Class1_Sub17(5);
				local108.method2175(15);
				local108.method2124(506);
				Static216.aClass26_4.method781(local108.aByteArray40, 5);
				Static123.anInt1748++;
				Static74.aLong58 = Static179.method2941();
			}
			if (Static123.anInt1748 == 3) {
				if (Static220.anInt4304 == 0 || Static220.anInt4304 == 5 || Static216.aClass26_4.method777() > 0) {
					@Pc(171) int local171 = Static216.aClass26_4.method782();
					if (local171 != 0) {
						this.method553(local171);
						return;
					}
					Static123.anInt1748++;
				} else if (Static179.method2941() - Static74.aLong58 > 30000L) {
					this.method553(-2);
					return;
				}
			}
			if (Static123.anInt1748 == 4) {
				@Pc(205) boolean local205 = Static220.anInt4304 == 5 || Static220.anInt4304 == 10 || Static220.anInt4304 == 28;
				Static32.method463(Static216.aClass26_4, !local205);
				Static8.aClass116_1 = null;
				Static123.anInt1748 = 0;
				Static17.anInt341 = 0;
				Static216.aClass26_4 = null;
			}
		} catch (@Pc(223) IOException local223) {
			this.method553(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method542() {
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method558() {
		@Pc(8) boolean local8 = Static69.method1012();
		if (!local8) {
			this.method556();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method547() {
		if (Static220.anInt4304 == 1000) {
			return;
		}
		@Pc(16) boolean local16 = Static189.method3114();
		if (local16 && Static159.aBoolean199 && Static58.aClass48_1 != null) {
			Static58.aClass48_1.method3234();
		}
		if (Static122.aBoolean104 && (Static220.anInt4304 == 30 || Static220.anInt4304 == 10)) {
			Static210.method3284();
		}
		@Pc(39) boolean local39 = false;
		if (Static60.aBoolean61) {
			local39 = true;
			Static60.aBoolean61 = false;
		}
		if (Static220.anInt4304 == 0) {
			Static212.method3298(Static124.anInt2471, null, local39, Static22.aClass50_169);
		} else if (Static220.anInt4304 == 5) {
			Static138.method2297(Static187.aClass1_Sub1_Sub10_3);
		} else if (Static220.anInt4304 == 10) {
			Static49.method765();
		} else if (Static220.anInt4304 == 25 || Static220.anInt4304 == 28) {
			@Pc(108) int local108;
			if (Static75.anInt1527 == 1) {
				if (Static100.anInt2018 < Static78.anInt1572) {
					Static100.anInt2018 = Static78.anInt1572;
				}
				local108 = (Static100.anInt2018 - Static78.anInt1572) * 50 / Static100.anInt2018;
				Static77.method1123(false, Static17.method257(new Class50[] { Static32.aClass50_226, Static30.aClass50_209, Static160.method2684(local108), Static21.aClass50_166 }));
			} else if (Static75.anInt1527 == 2) {
				if (Static114.anInt2290 > Static157.anInt3238) {
					Static157.anInt3238 = Static114.anInt2290;
				}
				local108 = (Static157.anInt3238 - Static114.anInt2290) * 50 / Static157.anInt3238 + 50;
				Static77.method1123(false, Static17.method257(new Class50[] { Static32.aClass50_226, Static30.aClass50_209, Static160.method2684(local108), Static21.aClass50_166 }));
			} else {
				Static77.method1123(false, Static32.aClass50_226);
			}
		} else if (Static220.anInt4304 == 30) {
			Static91.method3226();
		} else if (Static220.anInt4304 == 40) {
			Static77.method1123(false, Static17.method257(new Class50[] { Static176.aClass50_1202, Static234.aClass50_1438, Static28.aClass50_206 }));
		}
		@Pc(251) int local251;
		@Pc(241) Graphics local241;
		if ((Static220.anInt4304 == 30 || Static220.anInt4304 == 10) && Static20.anInt418 == 0 && !local39) {
			try {
				local241 = Static193.aCanvas4.getGraphics();
				for (local251 = 0; local251 < Static42.anInt924; local251++) {
					if (Static222.aBooleanArray28[local251]) {
						Static133.aClass35_1.method3258(Static118.anIntArray258[local251], Static189.anIntArray440[local251], Static75.anIntArray124[local251], local241, Static135.anIntArray296[local251]);
						Static222.aBooleanArray28[local251] = false;
					}
				}
			} catch (@Pc(312) Exception local312) {
				Static193.aCanvas4.repaint();
			}
		} else if (Static220.anInt4304 != 0) {
			try {
				local241 = Static193.aCanvas4.getGraphics();
				Static133.aClass35_1.method3257(local241);
				for (local251 = 0; local251 < Static42.anInt924; local251++) {
					Static222.aBooleanArray28[local251] = false;
				}
			} catch (@Pc(267) Exception local267) {
				Static193.aCanvas4.repaint();
			}
		}
		if (Static223.aBoolean209) {
			Static38.method611();
		}
		if (Static18.aBrowsercontrol1 != null && Static75.anInt1529 != 0) {
			@Pc(329) Point local329 = Static193.aCanvas4.getLocationOnScreen();
			@Pc(332) Dimension local332 = Static193.aCanvas4.getSize();
			Static18.aBrowsercontrol1.method2288(local329.x, local329.y - Static75.anInt1529, local332.width, Static75.anInt1529);
		}
	}
}
