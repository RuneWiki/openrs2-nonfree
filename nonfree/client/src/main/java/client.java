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
				Static190.method3486();
			}
			Static156.anInt3974 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Static143.anInt3743 = 0;
			} else if (arg0[1].equals("office")) {
				Static143.anInt3743 = 1;
			} else if (arg0[1].equals("local")) {
				Static143.anInt3743 = 2;
			} else {
				Static190.method3486();
			}
			if (arg0[2].equals("live")) {
				Static97.anInt2845 = 0;
			} else if (arg0[2].equals("rc")) {
				Static97.anInt2845 = 1;
			} else if (arg0[2].equals("wip")) {
				Static97.anInt2845 = 2;
			} else {
				Static190.method3486();
			}
			if (arg0[3].equals("lowmem")) {
				Static189.method3458();
			} else if (arg0[3].equals("highmem")) {
				Static83.method1957();
			} else {
				Static190.method3486();
			}
			if (arg0[4].equals("free")) {
				Static107.aBoolean117 = false;
			} else if (arg0[4].equals("members")) {
				Static107.aBoolean117 = true;
			} else {
				Static190.method3486();
			}
			if (arg0[5].equals("english")) {
				Static132.anInt3564 = 0;
			} else if (arg0[5].equals("german")) {
				Static158.method3035();
				Static101.aClass60_813 = Static147.aClass60_1037;
				Static132.anInt3564 = 1;
			} else {
				Static190.method3486();
			}
			if (arg0[6].equals("game0")) {
				Static143.anInt3755 = 0;
			} else if (arg0[6].equals("game1")) {
				Static143.anInt3755 = 1;
			} else {
				Static190.method3486();
			}
			Static50.aString1 = "127.0.0.1";
			Static143.anInt3754 = 0;
			Static79.aClass60_642 = Static101.aClass60_807;
			@Pc(180) client local180 = new client();
			local180.method751(Static97.anInt2845 + 32, "runescape");
			Static183.aFrame1.setLocation(40, 40);
		} catch (@Pc(197) Exception local197) {
			Static153.method2973(null, local197);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method746() {
		Static20.anInt580++;
		if (Static20.anInt580 % 1000 == 1) {
			@Pc(20) GregorianCalendar local20 = new GregorianCalendar();
			Static14.anInt470 = local20.get(11) * 600 + local20.get(12) * 10 + local20.get(13) / 6;
			Static194.aRandom1.setSeed((long) Static14.anInt470);
		}
		this.method773();
		Static182.method3396();
		Static14.method377();
		Static107.method2406();
		Static161.method3039();
		Static139.method2830();
		if (Static158.aClass11_1 != null) {
			@Pc(71) int local71 = Static158.aClass11_1.method2427();
			Static26.anInt803 = local71;
		}
		if (Static144.anInt3778 == 0) {
			this.method774();
			Static143.method2891();
		} else if (Static144.anInt3778 == 5) {
			Static65.method1488(this);
			this.method774();
			Static143.method2891();
		} else if (Static144.anInt3778 == 10) {
			Static65.method1488(this);
		} else if (Static144.anInt3778 == 20) {
			Static65.method1488(this);
			Static103.method2356();
		} else if (Static144.anInt3778 == 25) {
			Static116.method2525();
		}
		if (Static144.anInt3778 == 30) {
			Static107.method2404();
		} else if (Static144.anInt3778 == 40) {
			Static103.method2356();
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method767() {
		if (Static11.anInt384 >= 4) {
			this.method760("js5crc");
			Static144.anInt3778 = 1000;
			return;
		}
		if (Static39.anInt1274 >= 4) {
			if (Static144.anInt3778 <= 5) {
				this.method760("js5io");
				Static144.anInt3778 = 1000;
				return;
			}
			Static39.anInt1274 = 3;
			Static131.anInt250 = 3000;
		}
		if (Static131.anInt250-- > 0) {
			return;
		}
		try {
			if (Static2.anInt4179 == 0) {
				Static7.aClass25_48 = Static65.aClass81_1.method3156(Static50.aString1, Static147.anInt3823);
				Static2.anInt4179++;
			}
			if (Static2.anInt4179 == 1) {
				if (Static7.aClass25_48.anInt1695 == 2) {
					this.method768(-1);
					return;
				}
				if (Static7.aClass25_48.anInt1695 == 1) {
					Static2.anInt4179++;
				}
			}
			if (Static2.anInt4179 == 2) {
				Static174.aClass66_40 = new Class66((Socket) Static7.aClass25_48.anObject2, Static65.aClass81_1);
				@Pc(106) Class2_Sub3 local106 = new Class2_Sub3(5);
				local106.method224(15);
				local106.method197(490);
				Static174.aClass66_40.method2838(local106.aByteArray4, 5);
				Static2.anInt4179++;
				Static57.aLong50 = Static1.method2();
			}
			if (Static2.anInt4179 == 3) {
				if (Static144.anInt3778 <= 5 || Static174.aClass66_40.method2841() > 0) {
					@Pc(157) int local157 = Static174.aClass66_40.method2835();
					if (local157 != 0) {
						this.method768(local157);
						return;
					}
					Static2.anInt4179++;
				} else if (Static1.method2() - Static57.aLong50 > 30000L) {
					this.method768(-2);
					return;
				}
			}
			if (Static2.anInt4179 == 4) {
				Static21.method474(Static174.aClass66_40, Static144.anInt3778 > 20);
				Static174.aClass66_40 = null;
				Static10.anInt326 = 0;
				Static2.anInt4179 = 0;
				Static7.aClass25_48 = null;
			}
		} catch (@Pc(192) IOException local192) {
			this.method768(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method768(@OriginalArg(0) int arg0) {
		Static2.anInt4179 = 0;
		Static174.aClass66_40 = null;
		Static10.anInt326++;
		Static7.aClass25_48 = null;
		if (Static147.anInt3823 == Static65.anInt1998) {
			Static147.anInt3823 = Static152.anInt2802;
		} else {
			Static147.anInt3823 = Static65.anInt1998;
		}
		if (Static10.anInt326 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (Static144.anInt3778 > 5) {
				Static131.anInt250 = 3000;
			} else {
				this.method760("js5connect_full");
				Static144.anInt3778 = 1000;
			}
		} else if (Static10.anInt326 >= 2 && arg0 == 6) {
			this.method760("js5connect_outofdate");
			Static144.anInt3778 = 1000;
		} else if (Static10.anInt326 >= 4) {
			if (Static144.anInt3778 > 5) {
				Static131.anInt250 = 3000;
			} else {
				this.method760("js5connect");
				Static144.anInt3778 = 1000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method750() {
		@Pc(4) boolean local4 = Static142.method2875();
		if (local4 && Static107.aBoolean118 && Static31.aClass8_1 != null) {
			Static31.aClass8_1.method2796();
		}
		if (Static18.aBoolean176) {
			Static43.method943(Static159.aCanvas36);
			Static57.method1337(Static159.aCanvas36);
			if (Static158.aClass11_1 != null) {
				Static158.aClass11_1.method2419(Static159.aCanvas36);
			}
			this.method748();
			Static114.method2496(Static159.aCanvas36);
			Static12.method313(Static159.aCanvas36);
			if (Static158.aClass11_1 != null) {
				Static158.aClass11_1.method2421(Static159.aCanvas36);
			}
		}
		if (Static144.anInt3778 == 0) {
			Static184.method3424(Static95.aClass60_775, null, Static180.anInt3284);
		} else if (Static144.anInt3778 == 5) {
			Static138.method534(Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2, Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5);
		} else if (Static144.anInt3778 == 10) {
			Static138.method534(Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2, Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5);
		} else if (Static144.anInt3778 == 20) {
			Static138.method534(Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2, Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5);
		} else if (Static144.anInt3778 == 25) {
			@Pc(99) int local99;
			if (Static24.anInt752 == 1) {
				if (Static140.anInt3673 > Static165.anInt4099) {
					Static165.anInt4099 = Static140.anInt3673;
				}
				local99 = (Static165.anInt4099 - Static140.anInt3673) * 50 / Static165.anInt4099;
				Static52.method1233(false, Static193.method3536(new Class60[] { Static165.aClass60_1119, Static148.aClass60_1044, Static72.method1661(local99), Static3.aClass60_23 }));
			} else if (Static24.anInt752 == 2) {
				if (Static72.anInt2167 > Static157.anInt3983) {
					Static157.anInt3983 = Static72.anInt2167;
				}
				local99 = (Static157.anInt3983 - Static72.anInt2167) * 50 / Static157.anInt3983 + 50;
				Static52.method1233(false, Static193.method3536(new Class60[] { Static165.aClass60_1119, Static148.aClass60_1044, Static72.method1661(local99), Static3.aClass60_23 }));
			} else {
				Static52.method1233(false, Static165.aClass60_1119);
			}
		} else if (Static144.anInt3778 == 30) {
			Static84.method1987();
		} else if (Static144.anInt3778 == 40) {
			Static52.method1233(false, Static193.method3536(new Class60[] { Static131.aClass60_58, Static66.aClass60_500, Static182.aClass60_1223 }));
		}
		@Pc(256) int local256;
		@Pc(246) Graphics local246;
		if (Static144.anInt3778 == 30 && Static159.anInt4432 == 0 && !Static94.aBoolean109) {
			try {
				local246 = Static159.aCanvas36.getGraphics();
				for (local256 = 0; local256 < Static42.anInt1305; local256++) {
					if (Static196.aBooleanArray19[local256]) {
						Static192.aClass44_1.method2453(Static99.anIntArray329[local256], Static38.anIntArray101[local256], local246, Static16.anIntArray42[local256], Static98.anIntArray326[local256]);
						Static196.aBooleanArray19[local256] = false;
					}
				}
			} catch (@Pc(316) Exception local316) {
				Static159.aCanvas36.repaint();
			}
		} else if (Static144.anInt3778 > 0) {
			try {
				local246 = Static159.aCanvas36.getGraphics();
				Static192.aClass44_1.method2450(local246);
				Static94.aBoolean109 = false;
				for (local256 = 0; local256 < Static42.anInt1305; local256++) {
					Static196.aBooleanArray19[local256] = false;
				}
			} catch (@Pc(272) Exception local272) {
				Static159.aCanvas36.repaint();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method756() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method749() {
		if (Static38.aClass31_1 != null) {
			Static38.aClass31_1.aBoolean80 = false;
		}
		Static38.aClass31_1 = null;
		if (Static29.aClass66_10 != null) {
			Static29.aClass66_10.method2834();
			Static29.aClass66_10 = null;
		}
		Static43.method943(Static159.aCanvas36);
		Static57.method1337(Static159.aCanvas36);
		if (Static158.aClass11_1 != null) {
			Static158.aClass11_1.method2419(Static159.aCanvas36);
		}
		Static167.method3115();
		Static19.method2422();
		Static158.aClass11_1 = null;
		if (Static31.aClass8_1 != null) {
			Static31.aClass8_1.method2803();
		}
		if (Static113.aClass8_2 != null) {
			Static113.aClass8_2.method2803();
		}
		Static88.method2047();
		Static40.method906();
		try {
			if (Static158.aClass40_5 != null) {
				Static158.aClass40_5.method1916();
			}
			if (Static1.aClass40Array1 != null) {
				for (@Pc(64) int local64 = 0; local64 < Static1.aClass40Array1.length; local64++) {
					if (Static1.aClass40Array1[local64] != null) {
						Static1.aClass40Array1[local64].method1916();
					}
				}
			}
			if (Static46.aClass40_1 != null) {
				Static46.aClass40_1.method1916();
			}
			if (Static148.aClass40_4 != null) {
				Static148.aClass40_4.method1916();
			}
		} catch (@Pc(96) IOException local96) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method773() {
		if (Static144.anInt3778 != 1000) {
			@Pc(12) boolean local12 = Static81.method1904();
			if (!local12) {
				this.method767();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method774() {
		@Pc(14) int local14;
		if (Static140.anInt3676 == 0) {
			Static20.method449(Static32.anIntArrayArrayArray4);
			for (local14 = 0; local14 < 4; local14++) {
				Static48.aClass35Array1[local14] = new Class35(104, 104);
			}
			Static98.aClass2_Sub1_Sub7_Sub4_6 = new Class2_Sub1_Sub7_Sub4(512, 512);
			Static95.aClass60_775 = Static25.aClass60_183;
			Static180.anInt3284 = 5;
			Static140.anInt3676 = 20;
			return;
		}
		@Pc(55) int local55;
		@Pc(66) int local66;
		@Pc(76) int local76;
		@Pc(70) int local70;
		if (Static140.anInt3676 == 20) {
			@Pc(53) int[] local53 = new int[9];
			for (local55 = 0; local55 < 9; local55++) {
				local66 = local55 * 32 + 128 + 15;
				local70 = Class2_Sub1_Sub7_Sub1.anIntArray133[local66];
				local76 = local66 * 3 + 600;
				local53[local55] = local76 * local70 >> 16;
			}
			Static73.method1664(local53);
			Static95.aClass60_775 = Static183.aClass60_1270;
			Static140.anInt3676 = 30;
			Static180.anInt3284 = 10;
		} else if (Static140.anInt3676 == 30) {
			Static24.aClass13_Sub1_2 = Static22.method547(true, true, 0, false);
			Static160.aClass13_Sub1_7 = Static22.method547(true, true, 1, false);
			Static65.aClass13_Sub1_8 = Static22.method547(true, false, 2, true);
			Static5.aClass13_Sub1_1 = Static22.method547(true, true, 3, false);
			Static73.aClass13_Sub1_10 = Static22.method547(true, true, 4, false);
			Static113.aClass13_Sub1_15 = Static22.method547(true, true, 5, true);
			Static142.aClass13_Sub1_20 = Static22.method547(false, true, 6, true);
			Static143.aClass13_Sub1_21 = Static22.method547(true, true, 7, false);
			Static99.aClass13_Sub1_13 = Static22.method547(true, true, 8, false);
			Static134.aClass13_Sub1_17 = Static22.method547(true, false, 9, true);
			Static56.aClass13_Sub1_3 = Static22.method547(true, true, 10, false);
			Static147.aClass13_Sub1_23 = Static22.method547(true, true, 11, false);
			Static88.aClass13_Sub1_11 = Static22.method547(true, true, 12, false);
			Static188.aClass13_Sub1_27 = Static22.method547(true, false, 13, true);
			Static141.aClass13_Sub1_19 = Static22.method547(false, true, 14, false);
			Static194.aClass13_Sub1_28 = Static22.method547(true, true, 15, false);
			Static68.aClass13_Sub1_9 = Static22.method547(true, true, 16, false);
			Static167.aClass13_Sub1_24 = Static22.method547(true, true, 17, false);
			Static98.aClass13_Sub1_12 = Static22.method547(true, true, 18, false);
			Static129.aClass13_Sub1_16 = Static22.method547(true, true, 19, false);
			Static112.aClass13_Sub1_14 = Static22.method547(true, true, 20, false);
			Static71.aClass13_Sub1_25 = Static22.method547(true, true, 21, false);
			Static136.aClass13_Sub1_18 = Static22.method547(true, true, 22, false);
			Static180.anInt3284 = 20;
			Static140.anInt3676 = 40;
			Static95.aClass60_775 = Static123.aClass60_941;
		} else if (Static140.anInt3676 == 40) {
			local14 = Static24.aClass13_Sub1_2.method544() * 4 / 100;
			local14 += Static160.aClass13_Sub1_7.method544() * 4 / 100;
			local14 += Static65.aClass13_Sub1_8.method544() / 100;
			local14 += Static5.aClass13_Sub1_1.method544() * 2 / 100;
			local14 += Static73.aClass13_Sub1_10.method544() * 6 / 100;
			local14 += Static113.aClass13_Sub1_15.method544() * 4 / 100;
			local14 += Static142.aClass13_Sub1_20.method544() * 2 / 100;
			local14 += Static143.aClass13_Sub1_21.method544() * 54 / 100;
			local14 += Static99.aClass13_Sub1_13.method544() * 2 / 100;
			local14 += Static134.aClass13_Sub1_17.method544() * 2 / 100;
			local14 += Static56.aClass13_Sub1_3.method544() * 2 / 100;
			local14 += Static147.aClass13_Sub1_23.method544() * 2 / 100;
			local14 += Static88.aClass13_Sub1_11.method544() * 2 / 100;
			local14 += Static188.aClass13_Sub1_27.method544() * 2 / 100;
			local14 += Static141.aClass13_Sub1_19.method544() * 2 / 100;
			local14 += Static194.aClass13_Sub1_28.method544() * 2 / 100;
			local14 += Static68.aClass13_Sub1_9.method544() / 100;
			local14 += Static167.aClass13_Sub1_24.method544() / 100;
			local14 += Static98.aClass13_Sub1_12.method544() / 100;
			local14 += Static129.aClass13_Sub1_16.method544() / 100;
			local14 += Static112.aClass13_Sub1_14.method544() / 100;
			local14 += Static71.aClass13_Sub1_25.method544() / 100;
			local14 += Static136.aClass13_Sub1_18.method544() / 100;
			if (local14 == 100) {
				Static95.aClass60_775 = Static73.aClass60_538;
				Static180.anInt3284 = 30;
				Static114.method2498(Static99.aClass13_Sub1_13, Static142.aClass13_Sub1_20, Static56.aClass13_Sub1_3);
				Static140.anInt3676 = 45;
			} else {
				if (local14 != 0) {
					Static95.aClass60_775 = Static193.method3536(new Class60[] { Static112.aClass60_879, Static72.method1661(local14), Static1.aClass60_1 });
				}
				Static180.anInt3284 = 30;
			}
		} else if (Static140.anInt3676 == 45) {
			Static198.method3580(!Static8.aBoolean3);
			@Pc(569) Class2_Sub7_Sub1 local569 = new Class2_Sub7_Sub1();
			local569.method1543();
			Static31.aClass8_1 = Static179.method3350(0, 22050, Static159.aCanvas36, Static65.aClass81_1);
			Static31.aClass8_1.method2793(local569);
			Static186.method3431(local569, Static73.aClass13_Sub1_10, Static194.aClass13_Sub1_28, Static141.aClass13_Sub1_19);
			Static113.aClass8_2 = Static179.method3350(1, 2048, Static159.aCanvas36, Static65.aClass81_1);
			Static178.aClass2_Sub7_Sub4_2 = new Class2_Sub7_Sub4();
			Static113.aClass8_2.method2793(Static178.aClass2_Sub7_Sub4_2);
			Static151.aClass84_2 = new Class84(22050, Static98.anInt2858);
			Static95.aClass60_775 = Static8.aClass60_78;
			Static140.anInt3676 = 50;
			Static180.anInt3284 = 35;
		} else if (Static140.anInt3676 == 50) {
			local14 = 0;
			if (Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5 == null) {
				Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5 = Static65.method1491(Static17.aClass60_131, Static188.aClass13_Sub1_27, Static99.aClass13_Sub1_13, Static101.aClass60_807);
			} else {
				local14++;
			}
			if (Static55.aClass2_Sub1_Sub7_Sub3_Sub1_1 == null) {
				Static55.aClass2_Sub1_Sub7_Sub3_Sub1_1 = Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5;
			} else {
				local14++;
			}
			if (Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3 == null) {
				Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3 = Static65.method1491(Static112.aClass60_877, Static188.aClass13_Sub1_27, Static99.aClass13_Sub1_13, Static101.aClass60_807);
			} else {
				local14++;
			}
			if (Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2 == null) {
				Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2 = Static65.method1491(Static172.aClass60_1161, Static188.aClass13_Sub1_27, Static99.aClass13_Sub1_13, Static101.aClass60_807);
			} else {
				local14++;
			}
			if (local14 < 4) {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static90.aClass60_717, Static72.method1661(local14 * 100 / 4), Static1.aClass60_1 });
				Static180.anInt3284 = 40;
			} else {
				Static180.anInt3284 = 40;
				Static95.aClass60_775 = Static54.aClass60_397;
				Static140.anInt3676 = 60;
			}
		} else if (Static140.anInt3676 == 60) {
			local14 = Static67.method1571(Static99.aClass13_Sub1_13, Static56.aClass13_Sub1_3);
			local55 = Static10.method283();
			if (local55 > local14) {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static77.aClass60_629, Static72.method1661(local14 * 100 / local55), Static1.aClass60_1 });
				Static180.anInt3284 = 50;
			} else {
				Static95.aClass60_775 = Static1.aClass60_7;
				Static140.anInt3676 = 65;
				Static180.anInt3284 = 50;
			}
		} else if (Static140.anInt3676 == 65) {
			Static180.anInt3284 = 50;
			Static95.aClass60_775 = Static70.aClass60_529;
			Static139.method2831(5);
			Static140.anInt3676 = 70;
		} else if (Static140.anInt3676 == 70) {
			Static65.aClass13_Sub1_8.method524();
			local14 = Static65.aClass13_Sub1_8.method529();
			Static68.aClass13_Sub1_9.method524();
			local14 += Static68.aClass13_Sub1_9.method529();
			Static167.aClass13_Sub1_24.method524();
			local14 += Static167.aClass13_Sub1_24.method529();
			Static98.aClass13_Sub1_12.method524();
			local14 += Static98.aClass13_Sub1_12.method529();
			Static129.aClass13_Sub1_16.method524();
			local14 += Static129.aClass13_Sub1_16.method529();
			Static112.aClass13_Sub1_14.method524();
			local14 += Static112.aClass13_Sub1_14.method529();
			Static71.aClass13_Sub1_25.method524();
			local14 += Static71.aClass13_Sub1_25.method529();
			Static136.aClass13_Sub1_18.method524();
			local14 += Static136.aClass13_Sub1_18.method529();
			if (local14 < 800) {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static30.aClass60_214, Static72.method1661(local14 / 8), Static1.aClass60_1 });
				Static180.anInt3284 = 60;
			} else {
				Static43.method942(Static65.aClass13_Sub1_8);
				Static61.method1424(Static65.aClass13_Sub1_8);
				Static60.method1399(Static143.aClass13_Sub1_21, Static65.aClass13_Sub1_8);
				Static81.method1909(Static143.aClass13_Sub1_21, Static8.aBoolean3, Static68.aClass13_Sub1_9);
				Static14.method376(Static143.aClass13_Sub1_21, Static98.aClass13_Sub1_12);
				Static41.method914(Static143.aClass13_Sub1_21, Static129.aClass13_Sub1_16, Static107.aBoolean117, Static55.aClass2_Sub1_Sub7_Sub3_Sub1_1);
				Static47.method2319(Static112.aClass13_Sub1_14, Static160.aClass13_Sub1_7, Static24.aClass13_Sub1_2);
				Static72.method1656(Static143.aClass13_Sub1_21, Static71.aClass13_Sub1_25);
				Static134.method2772(Static136.aClass13_Sub1_18);
				Static49.method1126(Static65.aClass13_Sub1_8);
				Static126.method2642(Static99.aClass13_Sub1_13, Static143.aClass13_Sub1_21, Static5.aClass13_Sub1_1, Static188.aClass13_Sub1_27);
				Static83.method1956(Static65.aClass13_Sub1_8);
				Static41.method913(Static167.aClass13_Sub1_24);
				Static95.aClass60_775 = Static21.aClass60_146;
				Static180.anInt3284 = 60;
				Static151.method2091();
				Static140.anInt3676 = 80;
			}
		} else if (Static140.anInt3676 == 80) {
			local14 = 0;
			if (Static11.aClass2_Sub1_Sub7_Sub4_3 == null) {
				Static11.aClass2_Sub1_Sub7_Sub4_3 = Static24.method616(Static52.aClass60_376, Static101.aClass60_807, Static99.aClass13_Sub1_13);
			} else {
				local14++;
			}
			if (Static57.aClass2_Sub1_Sub7_Sub2Array3 == null) {
				Static57.aClass2_Sub1_Sub7_Sub2Array3 = Static31.method765(Static99.aClass13_Sub1_13, Static10.aClass60_94, Static101.aClass60_807);
			} else {
				local14++;
			}
			if (Static22.aClass2_Sub1_Sub7_Sub4Array3 == null) {
				Static22.aClass2_Sub1_Sub7_Sub4Array3 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static91.aClass60_745);
			} else {
				local14++;
			}
			if (Static157.aClass2_Sub1_Sub7_Sub4Array10 == null) {
				Static157.aClass2_Sub1_Sub7_Sub4Array10 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static64.aClass60_481);
			} else {
				local14++;
			}
			if (Static113.aClass2_Sub1_Sub7_Sub4Array9 == null) {
				Static113.aClass2_Sub1_Sub7_Sub4Array9 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static80.aClass60_646);
			} else {
				local14++;
			}
			if (Static22.aClass2_Sub1_Sub7_Sub4Array2 == null) {
				Static22.aClass2_Sub1_Sub7_Sub4Array2 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static55.aClass60_402);
			} else {
				local14++;
			}
			if (Static63.aClass2_Sub1_Sub7_Sub4Array5 == null) {
				Static63.aClass2_Sub1_Sub7_Sub4Array5 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static21.aClass60_145);
			} else {
				local14++;
			}
			if (Static185.aClass2_Sub1_Sub7_Sub4Array12 == null) {
				Static185.aClass2_Sub1_Sub7_Sub4Array12 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static53.aClass60_382);
			} else {
				local14++;
			}
			if (Static182.aClass2_Sub1_Sub7_Sub4Array11 == null) {
				Static182.aClass2_Sub1_Sub7_Sub4Array11 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static4.aClass60_37);
			} else {
				local14++;
			}
			if (Static157.aClass2_Sub1_Sub7_Sub4_8 == null) {
				Static157.aClass2_Sub1_Sub7_Sub4_8 = Static24.method616(Static163.aClass60_1107, Static101.aClass60_807, Static99.aClass13_Sub1_13);
			} else {
				local14++;
			}
			if (Static160.aClass2_Sub1_Sub7_Sub4Array7 == null) {
				Static160.aClass2_Sub1_Sub7_Sub4Array7 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static64.aClass60_480);
			} else {
				local14++;
			}
			if (Static4.aClass2_Sub1_Sub7_Sub4Array1 == null) {
				Static4.aClass2_Sub1_Sub7_Sub4Array1 = Static90.method2060(Static101.aClass60_807, Static99.aClass13_Sub1_13, Static29.aClass60_208);
			} else {
				local14++;
			}
			if (Static94.aClass2_Sub1_Sub7_Sub2Array8 == null) {
				Static94.aClass2_Sub1_Sub7_Sub2Array8 = Static31.method765(Static99.aClass13_Sub1_13, Static139.aClass60_1003, Static101.aClass60_807);
			} else {
				local14++;
			}
			if (Static22.aClass2_Sub1_Sub7_Sub2Array1 == null) {
				Static22.aClass2_Sub1_Sub7_Sub2Array1 = Static31.method765(Static99.aClass13_Sub1_13, Static157.aClass60_1079, Static101.aClass60_807);
			} else {
				local14++;
			}
			local14++;
			if (local14 < 15) {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static136.aClass60_991, Static72.method1661(local14 * 100 / 13), Static1.aClass60_1 });
				Static180.anInt3284 = 70;
			} else {
				Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5.method1804(Static22.aClass2_Sub1_Sub7_Sub2Array1, null);
				Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3.method1804(Static22.aClass2_Sub1_Sub7_Sub2Array1, null);
				Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1804(Static22.aClass2_Sub1_Sub7_Sub2Array1, null);
				if (Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5 != Static55.aClass2_Sub1_Sub7_Sub3_Sub1_1) {
					Static55.aClass2_Sub1_Sub7_Sub3_Sub1_1.method1804(Static22.aClass2_Sub1_Sub7_Sub2Array1, null);
				}
				for (local55 = 0; local55 < Static182.aClass2_Sub1_Sub7_Sub4Array11.length; local55++) {
					Static182.aClass2_Sub1_Sub7_Sub4Array11[local55].method2147();
				}
				Static11.aClass2_Sub1_Sub7_Sub4_3.method2147();
				local66 = (int) (Math.random() * 21.0D) - 10;
				local76 = (int) (Math.random() * 21.0D) - 10;
				local70 = (int) (Math.random() * 21.0D) - 10;
				@Pc(1210) int local1210 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(1212) int local1212 = 0; local1212 < Static22.aClass2_Sub1_Sub7_Sub4Array3.length; local1212++) {
					Static22.aClass2_Sub1_Sub7_Sub4Array3[local1212].method2142(local1210 + local66, local76 - -local1210, local1210 + local70);
				}
				Static57.aClass2_Sub1_Sub7_Sub2Array3[0].method1205(local66 + local1210, local1210 + local76, local1210 + local70);
				Static95.aClass60_775 = Static47.aClass60_822;
				Static140.anInt3676 = 90;
				Static180.anInt3284 = 70;
			}
		} else if (Static140.anInt3676 == 90) {
			if (Static134.aClass13_Sub1_17.method524()) {
				@Pc(1300) Class68 local1300 = new Class68(Static134.aClass13_Sub1_17, Static99.aClass13_Sub1_13, 20, Static8.aBoolean3 ? 64 : 128);
				Static45.method1046(local1300);
				Static45.method1041(0.7F);
				Static180.anInt3284 = 90;
				Static95.aClass60_775 = Static83.aClass60_662;
				Static140.anInt3676 = 110;
			} else {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static197.aClass60_1331, Static72.method1661(Static134.aClass13_Sub1_17.method529()), Static1.aClass60_1 });
				Static180.anInt3284 = 90;
			}
		} else if (Static140.anInt3676 == 110) {
			Static38.aClass31_1 = new Class31();
			Static65.aClass81_1.method3153(10, Static38.aClass31_1);
			Static140.anInt3676 = 120;
			Static180.anInt3284 = 94;
			Static95.aClass60_775 = Static155.aClass60_1064;
		} else if (Static140.anInt3676 == 120) {
			if (Static56.aClass13_Sub1_3.method530(Static101.aClass60_807, Static20.aClass60_136)) {
				@Pc(1371) Class80 local1371 = new Class80(Static56.aClass13_Sub1_3.method537(Static20.aClass60_136, Static101.aClass60_807));
				Static143.method2893(local1371);
				Static180.anInt3284 = 96;
				Static140.anInt3676 = 130;
				Static95.aClass60_775 = Static122.aClass60_931;
			} else {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static1.aClass60_6, Static93.aClass60_759 });
				Static180.anInt3284 = 96;
			}
		} else if (Static140.anInt3676 == 130) {
			if (!Static5.aClass13_Sub1_1.method524()) {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static114.aClass60_898, Static72.method1661(Static5.aClass13_Sub1_1.method529() * 4 / 5), Static1.aClass60_1 });
				Static180.anInt3284 = 100;
			} else if (!Static88.aClass13_Sub1_11.method524()) {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static114.aClass60_898, Static72.method1661(Static88.aClass13_Sub1_11.method529() / 6 + 80), Static1.aClass60_1 });
				Static180.anInt3284 = 100;
			} else if (Static188.aClass13_Sub1_27.method524()) {
				Static95.aClass60_775 = Static6.aClass60_64;
				Static180.anInt3284 = 100;
				Static140.anInt3676 = 140;
			} else {
				Static95.aClass60_775 = Static193.method3536(new Class60[] { Static114.aClass60_898, Static72.method1661(Static188.aClass13_Sub1_27.method529() / 20 + 96), Static1.aClass60_1 });
				Static180.anInt3284 = 100;
			}
		} else if (Static140.anInt3676 == 140) {
			Static113.aClass13_Sub1_15.method511(false);
			Static142.aClass13_Sub1_20.method511(true);
			Static99.aClass13_Sub1_13.method511(true);
			Static188.aClass13_Sub1_27.method511(true);
			Static56.aClass13_Sub1_3.method511(true);
			Static139.method2831(10);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method764()) {
			return;
		}
		Static156.anInt3974 = Integer.parseInt(this.getParameter("worldid"));
		Static97.anInt2845 = Integer.parseInt(this.getParameter("modewhat"));
		Static143.anInt3743 = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String local29 = this.getParameter("lowmem");
		if (local29 != null && local29.equals("1")) {
			Static189.method3458();
		} else {
			Static83.method1957();
		}
		@Pc(45) String local45 = this.getParameter("members");
		if (local45 != null && local45.equals("1")) {
			Static107.aBoolean117 = true;
		} else {
			Static107.aBoolean117 = false;
		}
		@Pc(61) String local61 = this.getParameter("lang");
		if (local61 != null && local61.equals("1")) {
			Static158.method3035();
			Static132.anInt3564 = 1;
			Static101.aClass60_813 = Static147.aClass60_1037;
		}
		@Pc(77) String local77 = this.getParameter("game");
		if (local77 != null && local77.equals("1")) {
			Static143.anInt3755 = 1;
		} else {
			Static143.anInt3755 = 0;
		}
		try {
			Static31.anInt994 = Integer.parseInt(this.getParameter("js"));
			Static128.anInt3498 = Integer.parseInt(this.getParameter("plug"));
			Static143.anInt3754 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(106) Exception local106) {
		}
		Static79.aClass60_642 = Static158.aClass60_1086.method2695(this);
		if (Static79.aClass60_642 == null) {
			Static79.aClass60_642 = Static101.aClass60_807;
		}
		Static50.aString1 = this.getCodeBase().getHost();
		this.method763(Static97.anInt2845 + 32);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method753() {
		if (Static143.anInt3755 == 1) {
			Static127.aShortArrayArray6 = Static8.aShortArrayArray1;
			Static100.aShortArrayArray4 = Static19.aShortArrayArray5;
			Static70.aShortArray42 = Static53.aShortArray30;
			Static93.aShortArray48 = Static80.aShortArray44;
		} else {
			Static93.aShortArray48 = Static39.aShortArray24;
			Static70.aShortArray42 = Static40.aShortArray25;
			Static127.aShortArrayArray6 = Static26.aShortArrayArray3;
			Static100.aShortArrayArray4 = Static147.aShortArrayArray7;
		}
		Static65.anInt1998 = Static143.anInt3743 == 0 ? 43594 : Static156.anInt3974 + 40000;
		Static152.anInt2802 = Static143.anInt3743 == 0 ? 443 : Static156.anInt3974 + 50000;
		Static147.anInt3823 = Static65.anInt1998;
		Static32.method794();
		Static114.method2496(Static159.aCanvas36);
		Static12.method313(Static159.aCanvas36);
		Static158.aClass11_1 = Static165.method3104();
		if (Static158.aClass11_1 != null) {
			Static158.aClass11_1.method2421(Static159.aCanvas36);
		}
		Static183.anInt4438 = Static170.anInt4155;
		try {
			if (Static65.aClass81_1.aClass30_3 != null) {
				Static158.aClass40_5 = new Class40(Static65.aClass81_1.aClass30_3, 5200, 0);
				for (@Pc(79) int local79 = 0; local79 < 23; local79++) {
					Static1.aClass40Array1[local79] = new Class40(Static65.aClass81_1.aClass30Array1[local79], 6000, 0);
				}
				Static46.aClass40_1 = new Class40(Static65.aClass81_1.aClass30_4, 6000, 0);
				Static118.aClass69_3 = new Class69(255, Static158.aClass40_5, Static46.aClass40_1, 500000);
				Static148.aClass40_4 = new Class40(Static65.aClass81_1.aClass30_2, 24, 0);
				Static65.aClass81_1.aClass30Array1 = null;
				Static65.aClass81_1.aClass30_2 = null;
				Static65.aClass81_1.aClass30_4 = null;
				Static65.aClass81_1.aClass30_3 = null;
			}
		} catch (@Pc(137) IOException local137) {
			Static158.aClass40_5 = null;
			Static148.aClass40_4 = null;
			Static118.aClass69_3 = null;
			Static46.aClass40_1 = null;
		}
		if (Static143.anInt3743 != 0) {
			Static105.aBoolean136 = true;
		}
	}
}
