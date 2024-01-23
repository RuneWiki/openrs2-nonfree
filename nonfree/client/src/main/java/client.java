import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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
				Static31.method644("argument count");
			}
			Static102.anInt2417 = Integer.parseInt(arg0[0]);
			Static111.anInt2557 = 2;
			if (arg0[1].equals("live")) {
				Static49.anInt1127 = 0;
			} else if (arg0[1].equals("rc")) {
				Static49.anInt1127 = 1;
			} else if (arg0[1].equals("wip")) {
				Static49.anInt1127 = 2;
			} else {
				Static31.method644("modewhat");
			}
			Static87.aBoolean139 = false;
			Static202.anInt4089 = Static247.method3828(arg0[2]);
			if (Static202.anInt4089 == -1) {
				if (arg0[2].equals("english")) {
					Static202.anInt4089 = 0;
				} else if (arg0[2].equals("german")) {
					Static202.anInt4089 = 1;
				} else {
					Static31.method644("language");
				}
			}
			Static34.method694(Static202.anInt4089);
			Static183.aBoolean344 = false;
			Static55.aBoolean85 = false;
			if (arg0[3].equals("game0")) {
				Static87.anInt1946 = 0;
			} else if (arg0[3].equals("game1")) {
				Static87.anInt1946 = 1;
			} else {
				Static31.method644("game");
			}
			Static194.aBoolean305 = false;
			Static30.anInt3253 = 0;
			Static98.anInt2315 = 0;
			Static253.aString292 = "";
			@Pc(129) client local129 = new client();
			Static237.aClient1 = local129;
			local129.method741(Static49.anInt1127 + 32, "runescape");
			Static193.aFrame1.setLocation(40, 40);
		} catch (@Pc(149) Exception local149) {
			Static3.method136(null, local149);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method761(@OriginalArg(0) byte[] arg0) {
		@Pc(17) Class1_Sub11 local17 = new Class1_Sub11(arg0);
		while (true) {
			@Pc(21) int local21 = local17.method2690();
			if (local21 == 0) {
				return;
			}
			if (local21 == 1) {
				@Pc(37) int[] local37 = Static149.anIntArray296 = new int[6];
				local37[0] = local17.method2691();
				local37[1] = local17.method2691();
				local37[2] = local17.method2691();
				local37[3] = local17.method2691();
				local37[4] = local17.method2691();
				local37[5] = local17.method2691();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method749() {
		if (Static194.anInt4017 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static153.method2696() / 1000000L - Static183.aLong161;
		Static183.aLong161 = Static153.method2696() / 1000000L;
		@Pc(25) boolean local25 = Static228.method3562();
		if (local25 && Static142.aBoolean225 && Static214.aClass52_2 != null) {
			Static214.aClass52_2.method4075();
		}
		if ((Static194.anInt4017 == 30 || Static194.anInt4017 == 10) && (Static26.aBoolean49 || Static14.aLong18 != 0L && Static14.aLong18 < Static294.method4413())) {
			Static102.method1909(Static31.method647(), Static75.anInt1605, Static26.aBoolean49, Static146.anInt3171);
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static237.aFrame2 == null) {
			@Pc(79) Container local79;
			if (Static237.aFrame2 != null) {
				local79 = Static237.aFrame2;
			} else if (Static193.aFrame1 == null) {
				local79 = Static253.aClass175_4.anApplet1;
			} else {
				local79 = Static193.aFrame1;
			}
			local92 = local79.getSize().width;
			local96 = local79.getSize().height;
			if (Static193.aFrame1 == local79) {
				@Pc(103) Insets local103 = Static193.aFrame1.getInsets();
				local96 -= local103.top + local103.bottom;
				local92 -= local103.right + local103.left;
			}
			if (Static82.anInt1780 != local92 || Static179.anInt3754 != local96) {
				if (Static288.aString328.startsWith("mac")) {
					Static82.anInt1780 = local92;
					Static179.anInt3754 = local96;
				} else {
					Static76.method1315();
				}
				Static14.aLong18 = Static294.method4413() + 500L;
			}
		}
		if (Static237.aFrame2 != null && !Static59.aBoolean304 && (Static194.anInt4017 == 30 || Static194.anInt4017 == 10)) {
			Static102.method1909(Static296.anInt5585, -1, false, -1);
		}
		@Pc(172) boolean local172 = false;
		if (Static115.aBoolean188) {
			local172 = true;
			Static115.aBoolean188 = false;
		}
		if (local172) {
			Static10.method251();
		}
		if (Static277.aBoolean412) {
			for (local92 = 0; local92 < 100; local92++) {
				Static272.aBooleanArray50[local92] = true;
			}
		}
		if (Static194.anInt4017 == 0) {
			Static113.method2068(local172, Static104.anInt2456, Static125.aString164, null);
		} else if (Static194.anInt4017 == 5) {
			Static229.method3575(false, Static134.aClass1_Sub2_Sub1_3);
		} else if (Static194.anInt4017 == 10) {
			Static268.method4067();
		} else if (Static194.anInt4017 == 25 || Static194.anInt4017 == 28) {
			if (Static198.anInt35 == 1) {
				if (Static273.anInt5323 > Static289.anInt5498) {
					Static289.anInt5498 = Static273.anInt5323;
				}
				local92 = (Static289.anInt5498 - Static273.anInt5323) * 50 / Static289.anInt5498;
				Static21.method412(false, Static186.aString229 + "<br>(" + local92 + "%)");
			} else if (Static198.anInt35 == 2) {
				if (Static205.anInt4152 < Static69.anInt1472) {
					Static205.anInt4152 = Static69.anInt1472;
				}
				local92 = (Static205.anInt4152 - Static69.anInt1472) * 50 / Static205.anInt4152 + 50;
				Static21.method412(false, Static186.aString229 + "<br>(" + local92 + "%)");
			} else {
				Static21.method412(false, Static186.aString229);
			}
		} else if (Static194.anInt4017 == 30) {
			Static29.method569(local17);
		} else if (Static194.anInt4017 == 40) {
			Static21.method412(false, Static87.aString112 + "<br>" + Static211.aString245);
		}
		if (Static277.aBoolean412 && Static194.anInt4017 != 0) {
			Static277.method4223();
			for (local92 = 0; local92 < Static270.anInt5273; local92++) {
				Static78.aBooleanArray17[local92] = false;
			}
		} else {
			@Pc(387) Graphics local387;
			if ((Static194.anInt4017 == 30 || Static194.anInt4017 == 10) && Static267.anInt5202 == 0 && !local172) {
				try {
					local387 = Static156.aCanvas2.getGraphics();
					for (local96 = 0; local96 < Static270.anInt5273; local96++) {
						if (Static78.aBooleanArray17[local96]) {
							Static72.aClass99_1.method3515(local387, Static55.anIntArray127[local96], Static62.anIntArray136[local96], Static189.anIntArray351[local96], Static215.anIntArray382[local96]);
							Static78.aBooleanArray17[local96] = false;
						}
					}
				} catch (@Pc(422) Exception local422) {
					Static156.aCanvas2.repaint();
				}
			} else if (Static194.anInt4017 != 0) {
				try {
					local387 = Static156.aCanvas2.getGraphics();
					Static72.aClass99_1.method3514(local387);
					for (local96 = 0; local96 < Static270.anInt5273; local96++) {
						Static78.aBooleanArray17[local96] = false;
					}
				} catch (@Pc(453) Exception local453) {
					Static156.aCanvas2.repaint();
				}
			}
		}
		if (Static166.aBoolean260) {
			Static249.method3855();
		}
		if (Static219.aBoolean339 && Static194.anInt4017 == 10 && Static116.anInt5593 != -1) {
			Static219.aBoolean339 = false;
			Static239.method3687(Static253.aClass175_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method755() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method762(@OriginalArg(1) int arg0) {
		Static297.aClass116_8 = null;
		Static177.aClass162_3.anInt5162++;
		Static177.aClass162_3.anInt5163 = arg0;
		Static186.anInt3846 = 0;
		Static90.aClass113_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method764() {
		for (Static53.anInt5284 = 0; Static71.method1267() && Static53.anInt5284 < 128; Static53.anInt5284++) {
			Static216.anIntArray383[Static53.anInt5284] = Static49.anInt1134;
			Static265.anIntArray460[Static53.anInt5284] = Static125.aChar2;
		}
		Static129.anInt2881++;
		if (Static116.anInt5593 != -1) {
			Static123.method2169(Static148.anInt3206, 0, Static116.anInt5593, 0, 0, Static3.anInt122, 0);
		}
		Static23.anInt471++;
		if (Static277.aBoolean412) {
			label188: for (@Pc(65) int local65 = 0; local65 < 32768; local65++) {
				@Pc(74) Class14_Sub2_Sub2 local74 = Static254.aClass14_Sub2_Sub2Array1[local65];
				if (local74 != null) {
					@Pc(81) byte local81 = local74.aClass46_1.aByte5;
					if ((local81 & 0x2) > 0 && local74.anInt4678 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(114) int local114 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local106 != 0 || local114 != 0) {
							local74.aByteArray63[0] = 1;
							local74.anIntArray415[0] = local106 + (local74.anInt4680 >> 7);
							local74.anIntArray418[0] = local114 + (local74.anInt4630 >> 7);
							Static88.aClass92Array1[Static140.anInt3034].method2573(local74.anInt4680 >> 7, local74.method3656(), 0, local74.anInt4630 >> 7, false, local74.method3656(), false);
							if (local74.anIntArray415[0] >= 0 && local74.anIntArray415[0] <= 104 - local74.method3656() && local74.anIntArray418[0] >= 0 && local74.anIntArray418[0] <= 104 - local74.method3656() && Static88.aClass92Array1[Static140.anInt3034].method2575(local74.anInt4630 >> 7, local74.anIntArray418[0], local74.anInt4680 >> 7, local74.anIntArray415[0])) {
								if (local74.method3656() > 1) {
									for (@Pc(239) int local239 = local74.anIntArray415[0]; local239 < local74.anIntArray415[0] + local74.method3656(); local239++) {
										for (@Pc(259) int local259 = local74.anIntArray418[0]; local259 < local74.anIntArray418[0] + local74.method3656(); local259++) {
											if ((Static88.aClass92Array1[Static140.anInt3034].anIntArrayArray15[local239][local259] & 0x2401FF) != 0) {
												continue label188;
											}
										}
									}
								}
								local74.anInt4678 = 1;
							}
						}
					}
					Static60.method1069(local74);
					Static131.method2230(local74);
					Static267.method4058(local74);
					Static88.aClass92Array1[Static140.anInt3034].method2569(local74.method3656(), false, local74.anInt4680 >> 7, local74.anInt4630 >> 7, false, local74.method3656());
				}
			}
		}
		if (!Static277.aBoolean412) {
			Static247.method3829();
		} else if (Static69.anInt1506 == 0 && Static239.anInt4742 == 0) {
			if (Static220.anInt4376 == 2) {
				Static224.method3518();
			} else {
				Static177.method2999();
			}
			if (Static69.anInt1504 >> 7 < 14 || Static69.anInt1504 >> 7 >= 90 || Static239.anInt4738 >> 7 < 14 || Static239.anInt4738 >> 7 >= 90) {
				Static104.method1942();
			}
		}
		while (true) {
			@Pc(386) Class1_Sub14 local386;
			@Pc(392) Class71 local392;
			@Pc(401) Class71 local401;
			do {
				local386 = (Class1_Sub14) Static170.aClass61_19.method1850();
				if (local386 == null) {
					while (true) {
						do {
							local386 = (Class1_Sub14) Static108.aClass61_13.method1850();
							if (local386 == null) {
								while (true) {
									do {
										local386 = (Class1_Sub14) Static276.aClass61_16.method1850();
										if (local386 == null) {
											if (Static84.aClass71_11 != null) {
												Static43.method759();
											}
											if (Static244.aClass116_5 != null && Static244.aClass116_5.anInt3812 == 1) {
												if (Static244.aClass116_5.anObject5 != null) {
													Static85.method1482(Static196.aBoolean168, Static262.aString303);
												}
												Static196.aBoolean168 = false;
												Static262.aString303 = null;
												Static244.aClass116_5 = null;
											}
											if (Static237.anInt4710 % 1500 == 0) {
												Static73.method1270();
											}
											return;
										}
										local392 = local386.aClass71_8;
										if (local392.anInt2689 < 0) {
											break;
										}
										local401 = Static56.method1058(local392.anInt2674);
									} while (local401 == null || local401.aClass71Array1 == null || local401.aClass71Array1.length <= local392.anInt2689 || local401.aClass71Array1[local392.anInt2689] != local392);
									Static188.method3144(local386);
								}
							}
							local392 = local386.aClass71_8;
							if (local392.anInt2689 < 0) {
								break;
							}
							local401 = Static56.method1058(local392.anInt2674);
						} while (local401 == null || local401.aClass71Array1 == null || local392.anInt2689 >= local401.aClass71Array1.length || local392 != local401.aClass71Array1[local392.anInt2689]);
						Static188.method3144(local386);
					}
				}
				local392 = local386.aClass71_8;
				if (local392.anInt2689 < 0) {
					break;
				}
				local401 = Static56.method1058(local392.anInt2674);
			} while (local401 == null || local401.aClass71Array1 == null || local401.aClass71Array1.length <= local392.anInt2689 || local401.aClass71Array1[local392.anInt2689] != local392);
			Static188.method3144(local386);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method765() {
		if (Static97.anInt2247 < Static177.aClass162_3.anInt5162) {
			if (Static240.anInt4769 == Static61.anInt1297) {
				Static240.anInt4769 = Static101.anInt2402;
			} else {
				Static240.anInt4769 = Static61.anInt1297;
			}
			Static22.anInt458 = (Static177.aClass162_3.anInt5162 - 1) * 50 * 5;
			if (Static22.anInt458 > 3000) {
				Static22.anInt458 = 3000;
			}
			if (Static177.aClass162_3.anInt5162 >= 2 && Static177.aClass162_3.anInt5163 == 6) {
				this.method745("js5connect_outofdate");
				Static194.anInt4017 = 1000;
				return;
			}
			if (Static177.aClass162_3.anInt5162 >= 4 && Static177.aClass162_3.anInt5163 == -1) {
				this.method745("js5crc");
				Static194.anInt4017 = 1000;
				return;
			}
			if (Static177.aClass162_3.anInt5162 >= 4 && (Static194.anInt4017 == 0 || Static194.anInt4017 == 5)) {
				if (Static177.aClass162_3.anInt5163 == 7 || Static177.aClass162_3.anInt5163 == 9) {
					this.method745("js5connect_full");
				} else if (Static177.aClass162_3.anInt5163 > 0) {
					this.method745("js5connect");
				} else {
					this.method745("js5io");
				}
				Static194.anInt4017 = 1000;
				return;
			}
		}
		Static97.anInt2247 = Static177.aClass162_3.anInt5162;
		if (Static22.anInt458 > 0) {
			Static22.anInt458--;
			return;
		}
		try {
			if (Static186.anInt3846 == 0) {
				Static297.aClass116_8 = Static253.aClass175_4.method4326(Static240.anInt4769, Static1.aString252);
				Static186.anInt3846++;
			}
			if (Static186.anInt3846 == 1) {
				if (Static297.aClass116_8.anInt3812 == 2) {
					this.method762(1000);
					return;
				}
				if (Static297.aClass116_8.anInt3812 == 1) {
					Static186.anInt3846++;
				}
			}
			if (Static186.anInt3846 == 2) {
				Static90.aClass113_2 = new Class113((Socket) Static297.aClass116_8.anObject5, Static253.aClass175_4);
				@Pc(176) Class1_Sub11 local176 = new Class1_Sub11(5);
				local176.method2655(15);
				local176.method2659(541);
				Static90.aClass113_2.method3017(5, local176.aByteArray47);
				Static186.anInt3846++;
				Static248.aLong173 = Static294.method4413();
			}
			if (Static186.anInt3846 == 3) {
				if (Static194.anInt4017 == 0 || Static194.anInt4017 == 5 || Static90.aClass113_2.method3014() > 0) {
					@Pc(226) int local226 = Static90.aClass113_2.method3012();
					if (local226 != 0) {
						this.method762(local226);
						return;
					}
					Static186.anInt3846++;
				} else if (Static294.method4413() - Static248.aLong173 > 30000L) {
					this.method762(1001);
					return;
				}
			}
			if (Static186.anInt3846 == 4) {
				@Pc(275) boolean local275 = Static194.anInt4017 == 5 || Static194.anInt4017 == 10 || Static194.anInt4017 == 28;
				Static177.aClass162_3.method4044(Static90.aClass113_2, !local275);
				Static90.aClass113_2 = null;
				Static186.anInt3846 = 0;
				Static297.aClass116_8 = null;
			}
		} catch (@Pc(292) IOException local292) {
			this.method762(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method743() {
		if (Static277.aBoolean412) {
			Static277.method4202();
		}
		if (Static237.aFrame2 != null) {
			Static246.method3819(Static253.aClass175_4, Static237.aFrame2);
			Static237.aFrame2 = null;
		}
		if (Static253.aClass175_4 != null) {
			Static253.aClass175_4.method4327(this.getClass());
		}
		if (Static218.aClass173_1 != null) {
			Static218.aClass173_1.aBoolean423 = false;
		}
		Static218.aClass173_1 = null;
		if (Static87.aClass113_1 != null) {
			Static87.aClass113_1.method3019();
			Static87.aClass113_1 = null;
		}
		Static68.method1246(Static156.aCanvas2);
		Static73.method1275(Static156.aCanvas2);
		if (Static190.aClass55_1 != null) {
			Static190.aClass55_1.method1570(Static156.aCanvas2);
		}
		Static226.method3550();
		Static85.method1488();
		Static190.aClass55_1 = null;
		if (Static214.aClass52_2 != null) {
			Static214.aClass52_2.method4083();
		}
		if (Static117.aClass52_1 != null) {
			Static117.aClass52_1.method4083();
		}
		Static177.aClass162_3.method4042();
		Static32.aClass130_8.method3286();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method742() {
		Static76.method1315();
		Static32.aClass130_8 = new Class130();
		Static177.aClass162_3 = new Class162();
		if (Static49.anInt1127 != 0) {
			Static102.aByteArrayArray7 = new byte[50][];
		}
		Static77.method1356(Static253.aClass175_4);
		if (Static111.anInt2557 == 0) {
			Static83.aString106 = this.getCodeBase().getHost();
			Static189.anInt3908 = 443;
			Static293.anInt5140 = 43594;
		} else if (Static111.anInt2557 == 1) {
			Static83.aString106 = this.getCodeBase().getHost();
			Static293.anInt5140 = Static102.anInt2417 + 40000;
			Static189.anInt3908 = Static102.anInt2417 + 50000;
		} else if (Static111.anInt2557 == 2) {
			Static293.anInt5140 = Static102.anInt2417 + 40000;
			Static83.aString106 = "127.0.0.1";
			Static189.anInt3908 = Static102.anInt2417 + 50000;
		}
		Static88.aShortArray44 = Static79.aShortArray43 = Static233.aShortArray76 = Static130.aShortArray49 = new short[256];
		Static13.anInt258 = Static293.anInt5140;
		Static240.anInt4769 = Static13.anInt258;
		if (Static87.anInt1946 == 1) {
			Static162.aShortArrayArray2 = Static233.aShortArrayArray5;
			Static140.aShortArray51 = Static78.aShortArray42;
			Static211.aShortArray74 = Static131.aShortArray50;
			Static45.aBoolean79 = true;
			Static267.aShortArrayArray6 = Static165.aShortArrayArray3;
			Static28.anInt655 = 16777215;
			Static28.anInt657 = 0;
		} else {
			Static211.aShortArray74 = Static115.aShortArray46;
			Static140.aShortArray51 = Static298.aShortArray92;
			Static267.aShortArrayArray6 = Static187.aShortArrayArray4;
			Static162.aShortArrayArray2 = Static137.aShortArrayArray1;
		}
		Static101.anInt2402 = Static189.anInt3908;
		Static1.aString252 = Static83.aString106;
		if (Static288.anInt5481 == 3 && Static111.anInt2557 != 2) {
			Static33.anInt764 = Static102.anInt2417;
		}
		Static61.anInt1297 = Static293.anInt5140;
		Static95.method1759();
		Static154.method2705(Static156.aCanvas2);
		Static191.method3160(Static156.aCanvas2);
		Static190.aClass55_1 = Static224.method3522();
		if (Static190.aClass55_1 != null) {
			Static190.aClass55_1.method1572(Static156.aCanvas2);
		}
		Static152.anInt3237 = Static288.anInt5481;
		try {
			if (Static253.aClass175_4.aClass115_4 != null) {
				Static295.aClass59_5 = new Class59(Static253.aClass175_4.aClass115_4, 5200, 0);
				for (@Pc(174) int local174 = 0; local174 < 29; local174++) {
					Static72.aClass59Array1[local174] = new Class59(Static253.aClass175_4.aClass115Array1[local174], 6000, 0);
				}
				Static215.aClass59_4 = new Class59(Static253.aClass175_4.aClass115_2, 6000, 0);
				Static130.aClass111_4 = new Class111(255, Static295.aClass59_5, Static215.aClass59_4, 500000);
				Static160.aClass59_1 = new Class59(Static253.aClass175_4.aClass115_3, 24, 0);
				Static253.aClass175_4.aClass115_4 = null;
				Static253.aClass175_4.aClass115Array1 = null;
				Static253.aClass175_4.aClass115_2 = null;
				Static253.aClass175_4.aClass115_3 = null;
			}
		} catch (@Pc(232) IOException local232) {
			Static130.aClass111_4 = null;
			Static215.aClass59_4 = null;
			Static295.aClass59_5 = null;
			Static160.aClass59_1 = null;
		}
		if (Static111.anInt2557 != 0) {
			Static85.aBoolean135 = true;
		}
		Static15.aString25 = Static47.aString65;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method767() {
		if (!Static219.aBoolean339) {
			label260: while (true) {
				do {
					if (!Static71.method1267()) {
						break label260;
					}
				} while (Static125.aChar2 != 's' && Static125.aChar2 != 'S');
				Static219.aBoolean339 = true;
			}
		}
		@Pc(39) int local39;
		if (Static286.anInt5477 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(42) long local42 = Static294.method4413();
			if (Static66.aLong53 == 0L) {
				Static66.aLong53 = local42;
			}
			if (local39 > 16384 && local42 - Static66.aLong53 < 5000L) {
				if (local42 - Static170.aLong134 > 1000L) {
					System.gc();
					Static170.aLong134 = local42;
				}
				Static125.aString164 = Static56.aString71;
				Static104.anInt2456 = 5;
			} else {
				Static125.aString164 = Static60.aString74;
				Static104.anInt2456 = 5;
				Static286.anInt5477 = 10;
			}
			return;
		}
		@Pc(96) int local96;
		if (Static286.anInt5477 == 10) {
			Static120.method2132();
			for (local96 = 0; local96 < 4; local96++) {
				Static88.aClass92Array1[local96] = new Class92(104, 104);
			}
			Static125.aString164 = Static151.aString334;
			Static286.anInt5477 = 30;
			Static104.anInt2456 = 10;
		} else if (Static286.anInt5477 == 30) {
			if (Static38.aClass38_1 == null) {
				Static38.aClass38_1 = new Class38(Static177.aClass162_3, Static32.aClass130_8);
			}
			if (Static38.aClass38_1.method1185()) {
				Static230.aClass91_72 = Static156.method1241(false, 0, true, true);
				Static232.aClass91_168 = Static156.method1241(false, 1, true, true);
				Static85.aClass91_67 = Static156.method1241(true, 2, true, false);
				Static246.aClass91_176 = Static156.method1241(false, 3, true, true);
				Static68.aClass91_56 = Static156.method1241(false, 4, true, true);
				Static203.aClass91_157 = Static156.method1241(true, 5, true, true);
				Static197.aClass91_152 = Static156.method1241(true, 6, false, true);
				Static230.aClass91_73 = Static156.method1241(false, 7, true, true);
				Static134.aClass91_110 = Static156.method1241(false, 8, true, true);
				Static191.aClass91_150 = Static156.method1241(false, 9, true, true);
				Static211.aClass91_158 = Static156.method1241(false, 10, true, true);
				Static49.aClass91_45 = Static156.method1241(false, 11, true, true);
				Static164.aClass91_129 = Static156.method1241(false, 12, true, true);
				Static24.aClass91_169 = Static156.method1241(false, 13, true, true);
				Static201.aClass91_154 = Static156.method1241(false, 14, false, true);
				Static61.aClass91_52 = Static156.method1241(false, 15, true, true);
				Static43.aClass91_37 = Static156.method1241(false, 16, true, true);
				Static221.aClass91_164 = Static156.method1241(false, 17, true, true);
				Static281.aClass91_194 = Static156.method1241(false, 18, true, true);
				Static296.aClass91_204 = Static156.method1241(false, 19, true, true);
				Static130.aClass91_102 = Static156.method1241(false, 20, true, true);
				Static165.aClass91_132 = Static156.method1241(false, 21, true, true);
				Static134.aClass91_107 = Static156.method1241(false, 22, true, true);
				Static106.aClass91_88 = Static156.method1241(true, 23, true, true);
				Static61.aClass91_51 = Static156.method1241(false, 24, true, true);
				Static102.aClass91_85 = Static156.method1241(false, 25, true, true);
				Static49.aClass91_44 = Static156.method1241(true, 26, true, true);
				Static268.aClass91_193 = Static156.method1241(false, 27, true, true);
				Static109.aClass91_91 = Static156.method1241(true, 28, true, true);
				Static286.anInt5477 = 40;
				Static125.aString164 = Static76.aString93;
				Static104.anInt2456 = 15;
			} else {
				Static104.anInt2456 = 12;
				Static125.aString164 = Static247.aString288;
			}
		} else if (Static286.anInt5477 == 40) {
			local96 = 0;
			for (local39 = 0; local39 < 29; local39++) {
				local96 += Static67.aClass63_Sub1Array2[local39].method1940() * Static88.anIntArray180[local39] / 100;
			}
			if (local96 == 100) {
				Static104.anInt2456 = 20;
				Static125.aString164 = Static194.aString236;
				Static233.method3606(Static134.aClass91_110);
				Static3.method138(Static134.aClass91_110);
				Static138.method3616(Static134.aClass91_110);
				Static286.anInt5477 = 41;
			} else {
				if (local96 != 0) {
					Static125.aString164 = Static104.aString141 + local96 + "%";
				}
				Static104.anInt2456 = 20;
			}
		} else if (Static286.anInt5477 == 41) {
			if (Static109.aClass91_91.method2499()) {
				this.method761(Static109.aClass91_91.method2488(1));
				Static104.anInt2456 = 25;
				Static286.anInt5477 = 45;
				Static125.aString164 = Static38.aString56;
			} else {
				Static125.aString164 = Static166.aString208 + Static109.aClass91_91.method2497() + "%";
				Static104.anInt2456 = 25;
			}
		} else if (Static286.anInt5477 == 45) {
			Static26.method530(Static147.aBoolean236);
			Static164.aClass1_Sub5_Sub2_1 = new Class1_Sub5_Sub2();
			Static164.aClass1_Sub5_Sub2_1.method1645();
			Static214.aClass52_2 = Static190.method3155(22050, Static156.aCanvas2, Static253.aClass175_4, 0);
			Static214.aClass52_2.method4078(Static164.aClass1_Sub5_Sub2_1);
			Static192.method3166(Static61.aClass91_52, Static68.aClass91_56, Static164.aClass1_Sub5_Sub2_1, Static201.aClass91_154);
			Static117.aClass52_1 = Static190.method3155(2048, Static156.aCanvas2, Static253.aClass175_4, 1);
			Static141.aClass1_Sub5_Sub4_1 = new Class1_Sub5_Sub4();
			Static117.aClass52_1.method4078(Static141.aClass1_Sub5_Sub4_1);
			Static20.aClass143_1 = new Class143(22050, Static13.anInt256);
			Static189.anInt3910 = Static197.aClass91_152.method2504("scape main");
			Static104.anInt2456 = 30;
			Static125.aString164 = Static79.aString101;
			Static286.anInt5477 = 50;
		} else if (Static286.anInt5477 == 50) {
			local96 = Static232.method3598(Static134.aClass91_110, Static24.aClass91_169);
			local39 = Static19.method366();
			if (local39 <= local96) {
				Static286.anInt5477 = 60;
				Static125.aString164 = Static99.aString132;
				Static104.anInt2456 = 35;
			} else {
				Static104.anInt2456 = 35;
				Static125.aString164 = Static45.aString63 + local96 * 100 / local39 + "%";
			}
		} else if (Static286.anInt5477 == 60) {
			local96 = Static228.method3567(Static134.aClass91_110);
			local39 = Static82.method1394();
			if (local39 > local96) {
				Static125.aString164 = Static131.aString167 + local96 * 100 / local39 + "%";
				Static104.anInt2456 = 40;
			} else {
				Static125.aString164 = Static205.aString244;
				Static286.anInt5477 = 65;
				Static104.anInt2456 = 40;
			}
		} else if (Static286.anInt5477 == 65) {
			Static261.method4006(Static134.aClass91_110, Static24.aClass91_169);
			Static125.aString164 = Static203.aString243;
			Static104.anInt2456 = 45;
			Static163.method2823(5);
			Static286.anInt5477 = 70;
		} else if (Static286.anInt5477 == 70) {
			Static85.aClass91_67.method2499();
			local96 = Static85.aClass91_67.method2497();
			Static43.aClass91_37.method2499();
			local96 += Static43.aClass91_37.method2497();
			Static221.aClass91_164.method2499();
			local96 += Static221.aClass91_164.method2497();
			Static281.aClass91_194.method2499();
			local96 += Static281.aClass91_194.method2497();
			Static296.aClass91_204.method2499();
			local96 += Static296.aClass91_204.method2497();
			Static130.aClass91_102.method2499();
			local96 += Static130.aClass91_102.method2497();
			Static165.aClass91_132.method2499();
			local96 += Static165.aClass91_132.method2497();
			Static134.aClass91_107.method2499();
			local96 += Static134.aClass91_107.method2497();
			Static61.aClass91_51.method2499();
			local96 += Static61.aClass91_51.method2497();
			Static102.aClass91_85.method2499();
			local96 += Static102.aClass91_85.method2497();
			Static268.aClass91_193.method2499();
			local96 += Static268.aClass91_193.method2497();
			if (local96 >= 1100) {
				Static189.method3147(Static85.aClass91_67);
				Static48.method935(Static85.aClass91_67);
				Static147.method2570(Static85.aClass91_67);
				Static87.method1514(Static85.aClass91_67, Static230.aClass91_73);
				Static1.method3380(Static43.aClass91_37, Static230.aClass91_73);
				Static92.method1624(Static230.aClass91_73, Static281.aClass91_194);
				Static178.method3181(Static296.aClass91_204, Static89.aClass1_Sub2_Sub1_Sub2_3, Static230.aClass91_73);
				Static249.method3854(Static85.aClass91_67);
				Static179.method3016(Static130.aClass91_102, Static230.aClass91_72, Static232.aClass91_168);
				Static282.method4248(Static85.aClass91_67);
				Static35.method1450(Static165.aClass91_132, Static230.aClass91_73);
				Static64.method1188(Static134.aClass91_107);
				Static6.method208(Static85.aClass91_67);
				Static258.method3972(Static24.aClass91_169, Static134.aClass91_110, Static246.aClass91_176, Static230.aClass91_73);
				Static127.method2190(Static85.aClass91_67);
				Static194.method3210(Static221.aClass91_164);
				Static209.method3322(Static61.aClass91_51, new Class152(), Static102.aClass91_85);
				Static185.method3086(Static61.aClass91_51, Static102.aClass91_85);
				Static20.method379(Static85.aClass91_67);
				Static62.method1124(Static85.aClass91_67);
				Static291.method4384(Static85.aClass91_67);
				Static24.method3651(Static134.aClass91_110, Static85.aClass91_67);
				Static33.method663(Static134.aClass91_110, Static85.aClass91_67);
				Static125.aString164 = Static211.aString246;
				Static104.anInt2456 = 50;
				Static7.method1807();
				Static286.anInt5477 = 80;
			} else {
				Static125.aString164 = Static143.aString179 + local96 / 11 + "%";
				Static104.anInt2456 = 50;
			}
		} else if (Static286.anInt5477 == 80) {
			local96 = Static1.method3391(Static134.aClass91_110);
			local39 = Static66.method1194();
			if (local39 > local96) {
				Static104.anInt2456 = 60;
				Static125.aString164 = Static95.aString127 + local96 * 100 / local39 + "%";
			} else {
				Static148.method2588(Static134.aClass91_110);
				Static286.anInt5477 = 90;
				Static104.anInt2456 = 60;
				Static125.aString164 = Static126.aString115;
			}
		} else if (Static286.anInt5477 == 90) {
			if (Static49.aClass91_44.method2499()) {
				@Pc(976) Class85_Sub1 local976 = new Class85_Sub1(Static191.aClass91_150, Static49.aClass91_44, Static134.aClass91_110, 20, !Static276.aBoolean217);
				Static110.method2022(local976);
				if (Static285.anInt5431 == 1) {
					Static110.method2021(0.9F);
				}
				if (Static285.anInt5431 == 2) {
					Static110.method2021(0.8F);
				}
				if (Static285.anInt5431 == 3) {
					Static110.method2021(0.7F);
				}
				if (Static285.anInt5431 == 4) {
					Static110.method2021(0.6F);
				}
				Static125.aString164 = Static265.aString304;
				Static286.anInt5477 = 100;
				Static104.anInt2456 = 70;
			} else {
				Static125.aString164 = Static272.aString307 + Static49.aClass91_44.method2497() + "%";
				Static104.anInt2456 = 70;
			}
		} else if (Static286.anInt5477 == 100) {
			if (Static33.method664(Static134.aClass91_110)) {
				Static286.anInt5477 = 110;
			}
		} else if (Static286.anInt5477 == 110) {
			Static218.aClass173_1 = new Class173();
			Static253.aClass175_4.method4320(Static218.aClass173_1, 10);
			Static125.aString164 = Static26.aString38;
			Static104.anInt2456 = 75;
			Static286.anInt5477 = 120;
		} else if (Static286.anInt5477 == 120) {
			if (Static211.aClass91_158.method2512("huffman", "")) {
				@Pc(1080) Class158 local1080 = new Class158(Static211.aClass91_158.method2511("", "huffman"));
				Static14.method290(local1080);
				Static125.aString164 = Static239.aString275;
				Static286.anInt5477 = 130;
				Static104.anInt2456 = 80;
			} else {
				Static104.anInt2456 = 80;
				Static125.aString164 = Static274.aString311 + "0%";
			}
		} else if (Static286.anInt5477 == 130) {
			if (!Static246.aClass91_176.method2499()) {
				Static125.aString164 = Static181.aString224 + Static246.aClass91_176.method2497() * 3 / 4 + "%";
				Static104.anInt2456 = 85;
			} else if (!Static164.aClass91_129.method2499()) {
				Static125.aString164 = Static181.aString224 + (Static164.aClass91_129.method2497() / 10 + 75) + "%";
				Static104.anInt2456 = 85;
			} else if (!Static24.aClass91_169.method2499()) {
				Static125.aString164 = Static181.aString224 + (Static24.aClass91_169.method2497() / 20 + 85) + "%";
				Static104.anInt2456 = 85;
			} else if (Static106.aClass91_88.method2491("details")) {
				Static21.method406(Static93.aClass1_Sub2_Sub11_Sub2Array1, Static106.aClass91_88);
				Static157.method2741(Static230.aClass91_73);
				Static125.aString164 = Static249.aString291;
				Static286.anInt5477 = 135;
				Static104.anInt2456 = 95;
			} else {
				Static125.aString164 = Static181.aString224 + (Static106.aClass91_88.method2508("details") / 10 + 90) + "%";
				Static104.anInt2456 = 85;
			}
		} else if (Static286.anInt5477 == 135) {
			local96 = Static255.method3907();
			if (local96 == -1) {
				Static125.aString164 = Static241.aString278;
				Static104.anInt2456 = 95;
			} else if (local96 == 7 || local96 == 9) {
				this.method745("worldlistfull");
				Static163.method2823(1000);
			} else if (Static297.aBoolean452) {
				Static104.anInt2456 = 96;
				Static125.aString164 = Static218.aString258;
				Static286.anInt5477 = 140;
			} else {
				this.method745("worldlistio_" + local96);
				Static163.method2823(1000);
			}
		} else if (Static286.anInt5477 == 140) {
			Static140.anInt3032 = Static246.aClass91_176.method2504("loginscreen");
			Static203.aClass91_157.method2507(false);
			Static197.aClass91_152.method2507(true);
			Static134.aClass91_110.method2507(true);
			Static24.aClass91_169.method2507(true);
			Static211.aClass91_158.method2507(true);
			Static246.aClass91_176.method2507(true);
			Static125.aString164 = Static31.aString42;
			Static166.aBoolean260 = true;
			Static286.anInt5477 = 150;
			Static104.anInt2456 = 97;
		} else if (Static286.anInt5477 == 150) {
			Static27.method547();
			if (Static219.aBoolean339) {
				Static296.anInt5585 = 0;
				Static20.anInt381 = 0;
				Static214.anInt4259 = 0;
				Static63.anInt1347 = 0;
			}
			Static219.aBoolean339 = true;
			Static239.method3687(Static253.aClass175_4);
			Static102.method1909(Static296.anInt5585, -1, false, -1);
			Static104.anInt2456 = 100;
			Static286.anInt5477 = 160;
			Static125.aString164 = Static133.aString168;
		} else if (Static286.anInt5477 == 160) {
			Static281.method4072(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method768() {
		@Pc(7) boolean local7 = Static177.aClass162_3.method4034();
		if (!local7) {
			this.method765();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method744() {
		if (Static194.anInt4017 == 1000) {
			return;
		}
		Static237.anInt4710++;
		if (Static237.anInt4710 % 1000 == 1) {
			@Pc(23) GregorianCalendar local23 = new GregorianCalendar();
			Static170.anInt3640 = local23.get(11) * 600 + local23.get(12) * 10 + local23.get(13) / 6;
			Static183.aRandom3.setSeed((long) Static170.anInt3640);
		}
		this.method768();
		if (Static38.aClass38_1 != null) {
			Static38.aClass38_1.method1183();
		}
		Static43.method747();
		Static105.method1947();
		Static43.method757();
		Static49.method939();
		if (Static277.aBoolean412) {
			Static94.method1747();
		}
		if (Static190.aClass55_1 != null) {
			@Pc(85) int local85 = Static190.aClass55_1.method1571();
			Static160.anInt3450 = local85;
		}
		if (Static194.anInt4017 == 0) {
			this.method767();
			Static115.method2092();
		} else if (Static194.anInt4017 == 5) {
			this.method767();
			Static115.method2092();
		} else if (Static194.anInt4017 == 25 || Static194.anInt4017 == 28) {
			Static270.method4087();
		}
		if (Static194.anInt4017 == 10) {
			this.method764();
			Static197.method3236();
			Static184.method3066();
			Static286.method4315();
		} else if (Static194.anInt4017 == 30) {
			Static52.method1025();
		} else if (Static194.anInt4017 == 40) {
			Static286.method4315();
			if (Static113.anInt2602 != -3) {
				if (Static113.anInt2602 == 15) {
					Static289.method4349();
				} else if (Static113.anInt2602 != 2) {
					Static39.method822();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method751()) {
			return;
		}
		Static102.anInt2417 = Integer.parseInt(this.getParameter("worldid"));
		Static111.anInt2557 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static111.anInt2557 < 0 || Static111.anInt2557 > 1) {
			Static111.anInt2557 = 0;
		}
		Static49.anInt1127 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static49.anInt1127 < 0 || Static49.anInt1127 > 2) {
			Static49.anInt1127 = 0;
		}
		@Pc(46) String local46 = this.getParameter("advertsuppressed");
		if (local46 != null && local46.equals("1")) {
			Static87.aBoolean139 = true;
		} else {
			Static87.aBoolean139 = false;
		}
		try {
			Static202.anInt4089 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(65) Exception local65) {
			Static202.anInt4089 = 0;
		}
		Static34.method694(Static202.anInt4089);
		@Pc(74) String local74 = this.getParameter("objecttag");
		if (local74 != null && local74.equals("1")) {
			Static183.aBoolean344 = true;
		} else {
			Static183.aBoolean344 = false;
		}
		@Pc(90) String local90 = this.getParameter("js");
		if (local90 != null && local90.equals("1")) {
			Static55.aBoolean85 = true;
		} else {
			Static55.aBoolean85 = false;
		}
		@Pc(106) String local106 = this.getParameter("game");
		if (local106 != null && local106.equals("1")) {
			Static87.anInt1946 = 1;
		} else {
			Static87.anInt1946 = 0;
		}
		try {
			Static98.anInt2315 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(126) Exception local126) {
			Static98.anInt2315 = 0;
		}
		Static253.aString292 = this.getParameter("settings");
		if (Static253.aString292 == null) {
			Static253.aString292 = "";
		}
		@Pc(142) String local142 = this.getParameter("country");
		if (local142 != null) {
			try {
				Static30.anInt3253 = Integer.parseInt(local142);
			} catch (@Pc(151) Exception local151) {
				Static30.anInt3253 = 0;
			}
		}
		@Pc(157) String local157 = this.getParameter("haveie6");
		if (local157 != null && local157.equals("1")) {
			Static194.aBoolean305 = true;
		} else {
			Static194.aBoolean305 = false;
		}
		Static237.aClient1 = this;
		this.method750(Static49.anInt1127 + 32);
	}
}
