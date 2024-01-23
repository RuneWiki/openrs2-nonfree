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
				Static234.method4061("argument count");
			}
			Static31.anInt807 = Integer.parseInt(arg0[0]);
			Static105.anInt6119 = 2;
			if (arg0[1].equals("live")) {
				Static277.anInt5947 = 0;
			} else if (arg0[1].equals("rc")) {
				Static277.anInt5947 = 1;
			} else if (arg0[1].equals("wip")) {
				Static277.anInt5947 = 2;
			} else {
				Static234.method4061("modewhat");
			}
			Static40.aBoolean105 = false;
			Static244.anInt5333 = Static238.method4102(arg0[2]);
			if (Static244.anInt5333 == -1) {
				if (arg0[2].equals("english")) {
					Static244.anInt5333 = 0;
				} else if (arg0[2].equals("german")) {
					Static244.anInt5333 = 1;
				} else {
					Static234.method4061("language");
				}
			}
			Static3.method71(Static244.anInt5333);
			Static87.aBoolean109 = false;
			Static130.aBoolean148 = false;
			if (arg0[3].equals("game0")) {
				Static230.anInt5101 = 0;
			} else if (arg0[3].equals("game1")) {
				Static230.anInt5101 = 1;
			} else {
				Static234.method4061("game");
			}
			Static178.anInt4015 = 0;
			Static88.anInt2055 = 0;
			Static24.aString15 = "";
			Static245.aBoolean289 = false;
			@Pc(129) client local129 = new client();
			Static26.aClient1 = local129;
			local129.method846(Static277.anInt5947 + 32, "runescape");
			Static48.aFrame1.setLocation(40, 40);
		} catch (@Pc(150) Exception local150) {
			Static217.method3829(null, local150);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method853() {
		if (Static284.anInt6051 < Static10.aClass42_1.anInt1426) {
			Static222.anInt4932 = (Static10.aClass42_1.anInt1426 - 1) * 50 * 5;
			if (Static15.anInt393 == Static206.anInt4590) {
				Static206.anInt4590 = Static98.anInt2195;
			} else {
				Static206.anInt4590 = Static15.anInt393;
			}
			if (Static222.anInt4932 > 3000) {
				Static222.anInt4932 = 3000;
			}
			if (Static10.aClass42_1.anInt1426 >= 2 && Static10.aClass42_1.anInt1427 == 6) {
				this.method841("js5connect_outofdate");
				Static279.anInt5968 = 1000;
				return;
			}
			if (Static10.aClass42_1.anInt1426 >= 4 && Static10.aClass42_1.anInt1427 == -1) {
				this.method841("js5crc");
				Static279.anInt5968 = 1000;
				return;
			}
			if (Static10.aClass42_1.anInt1426 >= 4 && (Static279.anInt5968 == 0 || Static279.anInt5968 == 5)) {
				if (Static10.aClass42_1.anInt1427 == 7 || Static10.aClass42_1.anInt1427 == 9) {
					this.method841("js5connect_full");
				} else if (Static10.aClass42_1.anInt1427 <= 0) {
					this.method841("js5io");
				} else {
					this.method841("js5connect");
				}
				Static279.anInt5968 = 1000;
				return;
			}
		}
		Static284.anInt6051 = Static10.aClass42_1.anInt1426;
		if (Static222.anInt4932 > 0) {
			Static222.anInt4932--;
			return;
		}
		try {
			if (Static232.anInt5136 == 0) {
				Static208.aClass43_7 = Static43.aClass66_1.method1616(Static206.anInt4590, Static194.aString136);
				Static232.anInt5136++;
			}
			if (Static232.anInt5136 == 1) {
				if (Static208.aClass43_7.anInt1456 == 2) {
					this.method857(1000);
					return;
				}
				if (Static208.aClass43_7.anInt1456 == 1) {
					Static232.anInt5136++;
				}
			}
			if (Static232.anInt5136 == 2) {
				Static245.aClass41_4 = new Class41((Socket) Static208.aClass43_7.anObject3, Static43.aClass66_1);
				@Pc(188) Class1_Sub16 local188 = new Class1_Sub16(5);
				local188.method2621(15);
				local188.method2606(545);
				Static245.aClass41_4.method1068(local188.aByteArray39, 5);
				Static232.anInt5136++;
				Static295.aLong114 = Static294.method4792();
			}
			if (Static232.anInt5136 == 3) {
				if (Static279.anInt5968 == 0 || Static279.anInt5968 == 5 || Static245.aClass41_4.method1067() > 0) {
					@Pc(247) int local247 = Static245.aClass41_4.method1066();
					if (local247 != 0) {
						this.method857(local247);
						return;
					}
					Static232.anInt5136++;
				} else if (Static294.method4792() - Static295.aLong114 > 30000L) {
					this.method857(1001);
					return;
				}
			}
			if (Static232.anInt5136 == 4) {
				@Pc(282) boolean local282 = Static279.anInt5968 == 5 || Static279.anInt5968 == 10 || Static279.anInt5968 == 28;
				Static10.aClass42_1.method1078(Static245.aClass41_4, !local282);
				Static232.anInt5136 = 0;
				Static208.aClass43_7 = null;
				Static245.aClass41_4 = null;
			}
		} catch (@Pc(299) IOException local299) {
			this.method857(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method849() {
		if (Static296.aBoolean335) {
			Static296.method4809();
		}
		if (Static158.aFrame2 != null) {
			Static13.method289(Static158.aFrame2, Static43.aClass66_1);
			Static158.aFrame2 = null;
		}
		if (Static43.aClass66_1 != null) {
			Static43.aClass66_1.method1618(this.getClass());
		}
		if (Static173.aClass115_1 != null) {
			Static173.aClass115_1.aBoolean213 = false;
		}
		Static173.aClass115_1 = null;
		if (Static22.aClass41_1 != null) {
			Static22.aClass41_1.method1062();
			Static22.aClass41_1 = null;
		}
		Static46.method4787(Static9.aCanvas1);
		Static34.method724(Static9.aCanvas1);
		if (Static70.aClass37_1 != null) {
			Static70.aClass37_1.method4785(Static9.aCanvas1);
		}
		Static250.method1410();
		Static129.method2197();
		Static70.aClass37_1 = null;
		if (Static273.aClass9_2 != null) {
			Static273.aClass9_2.method4352();
		}
		if (Static264.aClass9_1 != null) {
			Static264.aClass9_1.method4352();
		}
		Static10.aClass42_1.method1080();
		Static299.aClass80_3.method2278();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method857(@OriginalArg(1) int arg0) {
		Static10.aClass42_1.anInt1426++;
		Static232.anInt5136 = 0;
		Static10.aClass42_1.anInt1427 = arg0;
		Static245.aClass41_4 = null;
		Static208.aClass43_7 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method858(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub16 local14 = new Class1_Sub16(arg0);
		while (true) {
			@Pc(18) int local18 = local14.method2655();
			if (local18 == 0) {
				return;
			}
			if (local18 == 1) {
				@Pc(30) int[] local30 = Static52.anIntArray148 = new int[6];
				local30[0] = local14.method2652();
				local30[1] = local14.method2652();
				local30[2] = local14.method2652();
				local30[3] = local14.method2652();
				local30[4] = local14.method2652();
				local30[5] = local14.method2652();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method859() {
		@Pc(11) boolean local11 = Static10.aClass42_1.method1074();
		if (!local11) {
			this.method853();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method833() {
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method861() {
		for (Static14.anInt379 = 0; Static223.method935() && Static14.anInt379 < 128; Static14.anInt379++) {
			Static292.anIntArray610[Static14.anInt379] = Static1.anInt77;
			Static101.anIntArray272[Static14.anInt379] = Static81.aChar1;
		}
		Static112.anInt2417++;
		if (Static194.anInt4389 != -1) {
			Static181.method3282(0, 0, Static144.anInt3368, Static194.anInt4389, 0, Static193.anInt4370, 0);
		}
		Static27.anInt754++;
		if (Static296.aBoolean335) {
			label198: for (@Pc(56) int local56 = 0; local56 < 32768; local56++) {
				@Pc(65) Class25_Sub1_Sub2 local65 = Static27.aClass25_Sub1_Sub2Array1[local56];
				if (local65 != null) {
					@Pc(73) byte local73 = local65.aClass143_1.aByte23;
					if ((local73 & 0x2) > 0 && local65.anInt1610 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(101) int local101 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(109) int local109 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local101 != 0 || local109 != 0) {
							local65.anIntArray172[0] = local101 + (local65.anInt1635 >> 7);
							local65.aByteArray15[0] = 1;
							local65.anIntArray173[0] = (local65.anInt1604 >> 7) + local109;
							Static213.aClass36Array1[Static145.anInt3477].method952(local65.method1243(), local65.method1243(), local65.anInt1604 >> 7, local65.anInt1635 >> 7, false, false, 0);
							if (local65.anIntArray172[0] >= 0 && local65.anIntArray172[0] <= 104 - local65.method1243() && local65.anIntArray173[0] >= 0 && local65.anIntArray173[0] <= 104 - local65.method1243() && Static213.aClass36Array1[Static145.anInt3477].method958(local65.anIntArray173[0], local65.anInt1635 >> 7, local65.anIntArray172[0], local65.anInt1604 >> 7)) {
								if (local65.method1243() > 1) {
									for (@Pc(251) int local251 = local65.anIntArray172[0]; local65.anIntArray172[0] + local65.method1243() > local251; local251++) {
										for (@Pc(267) int local267 = local65.anIntArray173[0]; local65.anIntArray173[0] + local65.method1243() > local267; local267++) {
											if ((Static213.aClass36Array1[Static145.anInt3477].anIntArrayArray7[local251][local267] & 0x2401FF) != 0) {
												continue label198;
											}
										}
									}
								}
								local65.anInt1610 = 1;
							}
						}
					}
					Static54.method1093(local65);
					Static122.method2093(local65);
					Static194.method3448(local65);
					Static213.aClass36Array1[Static145.anInt3477].method959(local65.method1243(), local65.anInt1635 >> 7, false, local65.anInt1604 >> 7, false, local65.method1243());
				}
			}
		}
		if (!Static296.aBoolean335 && Static230.anInt5101 == 0) {
			Static95.method1637();
		} else if (Static209.anInt4636 == 0 && Static25.anInt507 == 0) {
			if (Static280.anInt5999 == 2) {
				Static76.method4255();
			} else {
				Static235.method4067();
			}
			if (Static229.anInt5072 >> 7 < 14 || Static229.anInt5072 >> 7 >= 90 || Static157.anInt3612 >> 7 < 14 || Static157.anInt3612 >> 7 >= 90) {
				Static65.method327();
			}
		}
		while (true) {
			@Pc(397) Class1_Sub27 local397;
			@Pc(403) Class116 local403;
			@Pc(415) Class116 local415;
			do {
				local397 = (Class1_Sub27) Static281.aClass131_26.method3798();
				if (local397 == null) {
					while (true) {
						do {
							local397 = (Class1_Sub27) Static227.aClass131_15.method3798();
							if (local397 == null) {
								while (true) {
									do {
										local397 = (Class1_Sub27) Static131.aClass131_7.method3798();
										if (local397 == null) {
											if (Static204.aClass116_11 != null) {
												Static65.method324();
											}
											if (Static178.aClass43_6 != null && Static178.aClass43_6.anInt1456 == 1) {
												if (Static178.aClass43_6.anObject3 != null) {
													Static277.method4609(Static241.aString166, Static107.aBoolean124);
												}
												Static178.aClass43_6 = null;
												Static241.aString166 = null;
												Static107.aBoolean124 = false;
											}
											if (Static32.anInt809 % 1500 == 0) {
												Static130.method2207();
											}
											return;
										}
										local403 = local397.aClass116_13;
										if (local403.anInt4297 < 0) {
											break;
										}
										local415 = Static115.method1897(local403.anInt4344);
									} while (local415 == null || local415.aClass116Array1 == null || local403.anInt4297 >= local415.aClass116Array1.length || local403 != local415.aClass116Array1[local403.anInt4297]);
									Static22.method392(local397);
								}
							}
							local403 = local397.aClass116_13;
							if (local403.anInt4297 < 0) {
								break;
							}
							local415 = Static115.method1897(local403.anInt4344);
						} while (local415 == null || local415.aClass116Array1 == null || local403.anInt4297 >= local415.aClass116Array1.length || local415.aClass116Array1[local403.anInt4297] != local403);
						Static22.method392(local397);
					}
				}
				local403 = local397.aClass116_13;
				if (local403.anInt4297 < 0) {
					break;
				}
				local415 = Static115.method1897(local403.anInt4344);
			} while (local415 == null || local415.aClass116Array1 == null || local403.anInt4297 >= local415.aClass116Array1.length || local415.aClass116Array1[local403.anInt4297] != local403);
			Static22.method392(local397);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method845()) {
			return;
		}
		Static31.anInt807 = Integer.parseInt(this.getParameter("worldid"));
		Static105.anInt6119 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static105.anInt6119 < 0 || Static105.anInt6119 > 1) {
			Static105.anInt6119 = 0;
		}
		Static277.anInt5947 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static277.anInt5947 < 0 || Static277.anInt5947 > 2) {
			Static277.anInt5947 = 0;
		}
		@Pc(53) String local53 = this.getParameter("advertsuppressed");
		if (local53 != null && local53.equals("1")) {
			Static40.aBoolean105 = true;
		} else {
			Static40.aBoolean105 = false;
		}
		try {
			Static244.anInt5333 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(73) Exception local73) {
			Static244.anInt5333 = 0;
		}
		Static3.method71(Static244.anInt5333);
		@Pc(82) String local82 = this.getParameter("objecttag");
		if (local82 != null && local82.equals("1")) {
			Static87.aBoolean109 = true;
		} else {
			Static87.aBoolean109 = false;
		}
		@Pc(99) String local99 = this.getParameter("js");
		if (local99 != null && local99.equals("1")) {
			Static130.aBoolean148 = true;
		} else {
			Static130.aBoolean148 = false;
		}
		@Pc(116) String local116 = this.getParameter("game");
		if (local116 != null && local116.equals("1")) {
			Static230.anInt5101 = 1;
		} else {
			Static230.anInt5101 = 0;
		}
		try {
			Static178.anInt4015 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(135) Exception local135) {
			Static178.anInt4015 = 0;
		}
		Static24.aString15 = this.getParameter("settings");
		if (Static24.aString15 == null) {
			Static24.aString15 = "";
		}
		@Pc(151) String local151 = this.getParameter("country");
		if (local151 != null) {
			try {
				Static88.anInt2055 = Integer.parseInt(local151);
			} catch (@Pc(160) Exception local160) {
				Static88.anInt2055 = 0;
			}
		}
		@Pc(166) String local166 = this.getParameter("haveie6");
		if (local166 != null && local166.equals("1")) {
			Static245.aBoolean289 = true;
		} else {
			Static245.aBoolean289 = false;
		}
		Static26.aClient1 = this;
		this.method836(Static277.anInt5947 + 32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method829() {
		Static213.method3741();
		Static299.aClass80_3 = new Class80();
		Static10.aClass42_1 = new Class42();
		if (Static277.anInt5947 != 0) {
			Static87.aByteArrayArray42 = new byte[50][];
		}
		Static44.method951(Static43.aClass66_1);
		if (Static105.anInt6119 == 0) {
			Static34.aString31 = this.getCodeBase().getHost();
			Static25.anInt510 = 443;
			Static176.anInt3984 = 43594;
		} else if (Static105.anInt6119 == 1) {
			Static34.aString31 = this.getCodeBase().getHost();
			Static176.anInt3984 = Static31.anInt807 + 40000;
			Static25.anInt510 = Static31.anInt807 + 50000;
		} else if (Static105.anInt6119 == 2) {
			Static25.anInt510 = Static31.anInt807 + 50000;
			Static176.anInt3984 = Static31.anInt807 + 40000;
			Static34.aString31 = "127.0.0.1";
		}
		Static98.anInt2195 = Static25.anInt510;
		Static194.aString136 = Static34.aString31;
		Static23.anInt486 = Static176.anInt3984;
		if (Static93.anInt2149 == 3 && Static105.anInt6119 != 2) {
			Static113.anInt2454 = Static31.anInt807;
		}
		if (Static230.anInt5101 == 1) {
			Static66.aBoolean191 = true;
			Static202.aShortArrayArray8 = Static179.aShortArrayArray6;
			Static91.aShortArray43 = Static135.aShortArray50;
			Static230.aShortArray80 = Static285.aShortArray92;
			Static201.anInt4492 = 0;
			Static201.anInt4495 = 16777215;
			Static122.aShortArrayArray5 = Static197.aShortArrayArray7;
		} else {
			Static230.aShortArray80 = Static158.aShortArray61;
			Static91.aShortArray43 = Static277.aShortArray91;
			Static122.aShortArrayArray5 = Static31.aShortArrayArray3;
			Static202.aShortArrayArray8 = Static150.aShortArrayArray4;
		}
		Static206.anInt4590 = Static23.anInt486;
		Static15.anInt393 = Static176.anInt3984;
		Static272.aShortArray89 = Static92.aShortArray44 = Static56.aShortArray40 = Static247.aShortArray85 = new short[256];
		Static280.method4646();
		Static268.method4508(Static9.aCanvas1);
		Static68.method1298(Static9.aCanvas1);
		Static70.aClass37_1 = Static167.method3094();
		if (Static70.aClass37_1 != null) {
			Static70.aClass37_1.method4784(Static9.aCanvas1);
		}
		Static255.anInt5535 = Static93.anInt2149;
		try {
			if (Static43.aClass66_1.aClass97_4 != null) {
				Static271.aClass14_5 = new Class14(Static43.aClass66_1.aClass97_4, 5200, 0);
				for (@Pc(172) int local172 = 0; local172 < 29; local172++) {
					Static16.aClass14Array1[local172] = new Class14(Static43.aClass66_1.aClass97Array1[local172], 6000, 0);
				}
				Static15.aClass14_1 = new Class14(Static43.aClass66_1.aClass97_3, 6000, 0);
				Static40.aClass90_3 = new Class90(255, Static271.aClass14_5, Static15.aClass14_1, 500000);
				Static164.aClass14_4 = new Class14(Static43.aClass66_1.aClass97_2, 24, 0);
				Static43.aClass66_1.aClass97Array1 = null;
				Static43.aClass66_1.aClass97_2 = null;
				Static43.aClass66_1.aClass97_4 = null;
				Static43.aClass66_1.aClass97_3 = null;
			}
		} catch (@Pc(228) IOException local228) {
			Static271.aClass14_5 = null;
			Static15.aClass14_1 = null;
			Static164.aClass14_4 = null;
			Static40.aClass90_3 = null;
		}
		Static226.aString154 = Static6.aString75;
		if (Static105.anInt6119 != 0) {
			Static167.aBoolean196 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method832() {
		if (Static279.anInt5968 == 1000) {
			return;
		}
		@Pc(19) long local19 = Static62.method1210() / 1000000L - Static280.aLong196;
		Static280.aLong196 = Static62.method1210() / 1000000L;
		@Pc(27) boolean local27 = Static9.method215();
		if (local27 && Static191.aBoolean212 && Static273.aClass9_2 != null) {
			Static273.aClass9_2.method4337();
		}
		if ((Static279.anInt5968 == 30 || Static279.anInt5968 == 10) && (Static252.aBoolean293 || Static163.aLong154 != 0L && Static294.method4792() > Static163.aLong154)) {
			Static134.method2296(Static252.aBoolean293, Static180.anInt4075, Static277.method4610(), Static275.anInt5914);
		}
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (Static158.aFrame2 == null) {
			@Pc(80) Container local80;
			if (Static158.aFrame2 != null) {
				local80 = Static158.aFrame2;
			} else if (Static48.aFrame1 == null) {
				local80 = Static43.aClass66_1.anApplet1;
			} else {
				local80 = Static48.aFrame1;
			}
			local93 = local80.getSize().width;
			local97 = local80.getSize().height;
			if (local80 == Static48.aFrame1) {
				@Pc(103) Insets local103 = Static48.aFrame1.getInsets();
				local97 -= local103.bottom + local103.top;
				local93 -= local103.right + local103.left;
			}
			if (local93 != Static105.anInt6113 || Static80.anInt1912 != local97) {
				if (Static93.aString65.startsWith("mac")) {
					Static105.anInt6113 = local93;
					Static80.anInt1912 = local97;
				} else {
					Static213.method3741();
				}
				Static163.aLong154 = Static294.method4792() + 500L;
			}
		}
		@Pc(145) boolean local145 = false;
		if (Static158.aFrame2 != null && !Static76.aBoolean290 && (Static279.anInt5968 == 30 || Static279.anInt5968 == 10)) {
			Static134.method2296(false, -1, Static272.anInt5852, -1);
		}
		if (Static52.aBoolean83) {
			Static52.aBoolean83 = false;
			local145 = true;
		}
		if (local145) {
			Static275.method4583();
		}
		if (Static296.aBoolean335) {
			for (local93 = 0; local93 < 100; local93++) {
				Static165.aBooleanArray16[local93] = true;
			}
		}
		if (Static279.anInt5968 == 0) {
			Static171.method3146(Static213.aString149, local145, null, Static229.anInt5079);
		} else if (Static279.anInt5968 == 5) {
			Static210.method3710(false, Static156.aClass1_Sub2_Sub16_3);
		} else if (Static279.anInt5968 == 10) {
			Static246.method4221();
		} else if (Static279.anInt5968 == 25 || Static279.anInt5968 == 28) {
			if (Static280.anInt5995 == 1) {
				if (Static25.anInt502 > Static87.anInt2031) {
					Static87.anInt2031 = Static25.anInt502;
				}
				local93 = (Static87.anInt2031 - Static25.anInt502) * 50 / Static87.anInt2031;
				Static242.method4171(false, Static19.aString12 + "<br>(" + local93 + "%)");
			} else if (Static280.anInt5995 == 2) {
				if (Static58.anInt1513 > Static76.anInt5430) {
					Static76.anInt5430 = Static58.anInt1513;
				}
				local93 = (Static76.anInt5430 - Static58.anInt1513) * 50 / Static76.anInt5430 + 50;
				Static242.method4171(false, Static19.aString12 + "<br>(" + local93 + "%)");
			} else {
				Static242.method4171(false, Static19.aString12);
			}
		} else if (Static279.anInt5968 == 30) {
			Static56.method1124(local19);
		} else if (Static279.anInt5968 == 40) {
			Static242.method4171(false, Static209.aString148 + "<br>" + Static247.aString172);
		}
		if (Static296.aBoolean335 && Static279.anInt5968 != 0) {
			Static296.method4801();
			for (local93 = 0; local93 < Static31.anInt803; local93++) {
				Static138.aBooleanArray13[local93] = false;
			}
		} else {
			@Pc(366) Graphics local366;
			if ((Static279.anInt5968 == 30 || Static279.anInt5968 == 10) && Static171.anInt3878 == 0 && !local145) {
				try {
					local366 = Static9.aCanvas1.getGraphics();
					for (local97 = 0; local97 < Static31.anInt803; local97++) {
						if (Static138.aBooleanArray13[local97]) {
							Static1.aClass5_1.method1710(Static32.anIntArray89[local97], Static144.anIntArray299[local97], Static129.anIntArray268[local97], local366, Static120.anIntArray298[local97]);
							Static138.aBooleanArray13[local97] = false;
						}
					}
				} catch (@Pc(431) Exception local431) {
					Static9.aCanvas1.repaint();
				}
			} else if (Static279.anInt5968 != 0) {
				try {
					local366 = Static9.aCanvas1.getGraphics();
					Static1.aClass5_1.method1713(local366);
					for (local97 = 0; local97 < Static31.anInt803; local97++) {
						Static138.aBooleanArray13[local97] = false;
					}
				} catch (@Pc(390) Exception local390) {
					Static9.aCanvas1.repaint();
				}
			}
		}
		if (Static32.aBoolean47) {
			Static196.method3522();
		}
		if (Static157.aBoolean187 && Static279.anInt5968 == 10 && Static194.anInt4389 != -1) {
			Static157.aBoolean187 = false;
			Static251.method4273(Static43.aClass66_1);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method839() {
		if (Static279.anInt5968 == 1000) {
			return;
		}
		Static32.anInt809++;
		if (Static32.anInt809 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static173.anInt3931 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static73.aRandom1.setSeed((long) Static173.anInt3931);
		}
		this.method859();
		if (Static66.aClass79_2 != null) {
			Static66.aClass79_2.method2208();
		}
		Static114.method1864();
		Static96.method1648();
		Static166.method3079();
		Static215.method3784();
		if (Static296.aBoolean335) {
			Static237.method4092();
		}
		if (Static70.aClass37_1 != null) {
			@Pc(83) int local83 = Static70.aClass37_1.method4788();
			Static161.anInt3716 = local83;
		}
		if (Static279.anInt5968 == 0) {
			this.method865();
			Static54.method1101();
		} else if (Static279.anInt5968 == 5) {
			this.method865();
			Static54.method1101();
		} else if (Static279.anInt5968 == 25 || Static279.anInt5968 == 28) {
			Static190.method3394();
		}
		if (Static279.anInt5968 == 10) {
			this.method861();
			Static39.method886();
			Static207.method3667();
			Static87.method1515();
		} else if (Static279.anInt5968 == 30) {
			Static43.method945();
		} else if (Static279.anInt5968 == 40) {
			Static87.method1515();
			if (Static275.anInt5910 != -3) {
				if (Static275.anInt5910 == 15) {
					Static158.method2963();
				} else if (Static275.anInt5910 != 2) {
					Static267.method2725();
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method865() {
		if (!Static157.aBoolean187) {
			label264: while (true) {
				do {
					if (!Static223.method935()) {
						break label264;
					}
				} while (Static81.aChar1 != 's' && Static81.aChar1 != 'S');
				Static157.aBoolean187 = true;
			}
		}
		@Pc(38) int local38;
		if (Static117.anInt2572 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(41) long local41 = Static294.method4792();
			if (Static110.aLong83 == 0L) {
				Static110.aLong83 = local41;
			}
			if (local38 > 16384 && local41 - Static110.aLong83 < 5000L) {
				if (local41 - Static27.aLong33 > 1000L) {
					System.gc();
					Static27.aLong33 = local41;
				}
				Static213.aString149 = Static188.aString122;
				Static229.anInt5079 = 5;
			} else {
				Static213.aString149 = Static254.aString169;
				Static229.anInt5079 = 5;
				Static117.anInt2572 = 10;
			}
			return;
		}
		@Pc(96) int local96;
		if (Static117.anInt2572 == 10) {
			Static67.method1283();
			for (local96 = 0; local96 < 4; local96++) {
				Static213.aClass36Array1[local96] = new Class36(104, 104);
			}
			Static229.anInt5079 = 10;
			Static213.aString149 = Static266.aString188;
			Static117.anInt2572 = 30;
		} else if (Static117.anInt2572 == 30) {
			if (Static66.aClass79_2 == null) {
				Static66.aClass79_2 = new Class79(Static10.aClass42_1, Static299.aClass80_3);
			}
			if (Static66.aClass79_2.method2206()) {
				Static68.aClass83_44 = Static18.method378(0, true, false, true);
				Static13.aClass83_15 = Static18.method378(1, true, false, true);
				Static90.aClass83_56 = Static18.method378(2, true, true, false);
				Static114.aClass83_75 = Static18.method378(3, true, false, true);
				Static80.aClass83_49 = Static18.method378(4, true, false, true);
				Static78.aClass83_47 = Static18.method378(5, true, true, true);
				Static210.aClass83_139 = Static18.method378(6, false, true, true);
				Static285.aClass83_199 = Static18.method378(7, true, false, true);
				Static33.aClass83_20 = Static18.method378(8, true, false, true);
				Static11.aClass83_91 = Static18.method378(9, true, false, true);
				Static129.aClass83_88 = Static18.method378(10, true, false, true);
				Static231.aClass83_172 = Static18.method378(11, true, false, true);
				Static167.aClass83_119 = Static18.method378(12, true, false, true);
				Static259.aClass83_179 = Static18.method378(13, true, false, true);
				Static91.aClass83_58 = Static18.method378(14, false, false, true);
				Static245.aClass83_166 = Static18.method378(15, true, false, true);
				Static119.aClass83_81 = Static18.method378(16, true, false, true);
				Static216.aClass83_143 = Static18.method378(17, true, false, true);
				Static96.aClass83_62 = Static18.method378(18, true, false, true);
				Static217.aClass83_145 = Static18.method378(19, true, false, true);
				Static179.aClass83_123 = Static18.method378(20, true, false, true);
				Static243.aClass83_164 = Static18.method378(21, true, false, true);
				Static247.aClass83_169 = Static18.method378(22, true, false, true);
				Static241.aClass83_162 = Static18.method378(23, true, true, true);
				Static230.aClass83_155 = Static18.method378(24, true, false, true);
				Static265.aClass83_188 = Static18.method378(25, true, false, true);
				Static91.aClass83_59 = Static18.method378(26, true, true, true);
				Static298.aClass83_205 = Static18.method378(27, true, false, true);
				Static100.aClass83_185 = Static18.method378(28, true, true, true);
				Static213.aString149 = Static254.aString171;
				Static229.anInt5079 = 15;
				Static117.anInt2572 = 40;
			} else {
				Static213.aString149 = Static199.aString140;
				Static229.anInt5079 = 12;
			}
		} else if (Static117.anInt2572 == 40) {
			local96 = 0;
			for (local38 = 0; local38 < 29; local38++) {
				local96 += Static179.aClass85_Sub1Array2[local38].method2510() * Static24.anIntArray51[local38] / 100;
			}
			if (local96 == 100) {
				Static229.anInt5079 = 20;
				Static213.aString149 = Static250.aString55;
				Static89.method1533(Static33.aClass83_20);
				Static129.method2198(Static33.aClass83_20);
				Static112.method1804(Static33.aClass83_20);
				Static117.anInt2572 = 41;
			} else {
				Static229.anInt5079 = 20;
				if (local96 != 0) {
					Static213.aString149 = Static39.aString41 + local96 + "%";
				}
			}
		} else if (Static117.anInt2572 == 41) {
			if (Static100.aClass83_185.method2300()) {
				this.method858(Static100.aClass83_185.method2330(1));
				Static229.anInt5079 = 25;
				Static213.aString149 = Static177.aString116;
				Static117.anInt2572 = 45;
			} else {
				Static213.aString149 = Static186.aString121 + Static100.aClass83_185.method2318() + "%";
				Static229.anInt5079 = 25;
			}
		} else if (Static117.anInt2572 == 45) {
			Static35.method731(Static153.aBoolean183);
			Static193.aClass1_Sub3_Sub2_3 = new Class1_Sub3_Sub2();
			Static193.aClass1_Sub3_Sub2_3.method1012();
			Static273.aClass9_2 = Static225.method3929(22050, Static9.aCanvas1, 0, Static43.aClass66_1);
			Static273.aClass9_2.method4346(Static193.aClass1_Sub3_Sub2_3);
			Static207.method3675(Static91.aClass83_58, Static245.aClass83_166, Static193.aClass1_Sub3_Sub2_3, Static80.aClass83_49);
			Static264.aClass9_1 = Static225.method3929(2048, Static9.aCanvas1, 1, Static43.aClass66_1);
			Static245.aClass1_Sub3_Sub1_2 = new Class1_Sub3_Sub1();
			Static264.aClass9_1.method4346(Static245.aClass1_Sub3_Sub1_2);
			Static161.aClass135_1 = new Class135(22050, Static43.anInt1255);
			Static175.anInt3976 = Static210.aClass83_139.method2322("scape main");
			Static229.anInt5079 = 30;
			Static117.anInt2572 = 50;
			Static213.aString149 = Static268.aString190;
		} else if (Static117.anInt2572 == 50) {
			local96 = Static102.method1685(Static259.aClass83_179, Static33.aClass83_20);
			local38 = Static281.method4667();
			if (local96 >= local38) {
				Static117.anInt2572 = 60;
				Static213.aString149 = Static94.aString198;
				Static229.anInt5079 = 35;
			} else {
				Static213.aString149 = Static199.aString141 + local96 * 100 / local38 + "%";
				Static229.anInt5079 = 35;
			}
		} else if (Static117.anInt2572 == 60) {
			local96 = Static206.method3656(Static33.aClass83_20);
			local38 = Static49.method1042();
			if (local96 >= local38) {
				Static117.anInt2572 = 65;
				Static213.aString149 = Static23.aString14;
				Static229.anInt5079 = 40;
			} else {
				Static213.aString149 = Static102.aString73 + local96 * 100 / local38 + "%";
				Static229.anInt5079 = 40;
			}
		} else if (Static117.anInt2572 == 65) {
			Static28.method537(Static259.aClass83_179, Static33.aClass83_20);
			Static213.aString149 = Static287.aString196;
			Static229.anInt5079 = 45;
			Static140.method2511(5);
			Static117.anInt2572 = 70;
		} else if (Static117.anInt2572 == 70) {
			Static90.aClass83_56.method2300();
			local96 = Static90.aClass83_56.method2318();
			Static119.aClass83_81.method2300();
			local96 += Static119.aClass83_81.method2318();
			Static216.aClass83_143.method2300();
			local96 += Static216.aClass83_143.method2318();
			Static96.aClass83_62.method2300();
			local96 += Static96.aClass83_62.method2318();
			Static217.aClass83_145.method2300();
			local96 += Static217.aClass83_145.method2318();
			Static179.aClass83_123.method2300();
			local96 += Static179.aClass83_123.method2318();
			Static243.aClass83_164.method2300();
			local96 += Static243.aClass83_164.method2318();
			Static247.aClass83_169.method2300();
			local96 += Static247.aClass83_169.method2318();
			Static230.aClass83_155.method2300();
			local96 += Static230.aClass83_155.method2318();
			Static265.aClass83_188.method2300();
			local96 += Static265.aClass83_188.method2318();
			Static298.aClass83_205.method2300();
			local96 += Static298.aClass83_205.method2318();
			if (local96 < 1100) {
				Static213.aString149 = Static77.aString60 + local96 / 11 + "%";
				Static229.anInt5079 = 50;
			} else {
				Static119.method1961(Static90.aClass83_56);
				Static251.method4274(Static90.aClass83_56);
				Static284.method4684(Static90.aClass83_56);
				Static34.method719(Static285.aClass83_199, Static90.aClass83_56);
				Static62.method1207(Static119.aClass83_81, Static285.aClass83_199);
				Static64.method1246(Static96.aClass83_62, Static285.aClass83_199);
				Static20.method4342(Static217.aClass83_145, Static174.aClass1_Sub2_Sub16_Sub2_1, Static285.aClass83_199);
				Static5.method101(Static90.aClass83_56);
				Static107.method1747(Static13.aClass83_15, Static179.aClass83_123, Static68.aClass83_44);
				Static20.method4351(Static90.aClass83_56);
				Static180.method3274(Static285.aClass83_199, Static243.aClass83_164);
				Static218.method3881(Static247.aClass83_169);
				Static87.method1516(Static90.aClass83_56);
				Static257.method4357(Static259.aClass83_179, Static114.aClass83_75, Static33.aClass83_20, Static285.aClass83_199);
				Static14.method310(Static90.aClass83_56);
				Static287.method4705(Static216.aClass83_143);
				Static145.method2767(Static265.aClass83_188, new Class174(), Static230.aClass83_155);
				Static152.method2853(Static265.aClass83_188, Static230.aClass83_155);
				Static280.method4649(Static90.aClass83_56);
				Static154.method2866(Static90.aClass83_56);
				Static191.method3402(Static90.aClass83_56);
				Static173.method3182(Static33.aClass83_20, Static90.aClass83_56);
				Static128.method2186(Static33.aClass83_20, Static90.aClass83_56);
				Static229.anInt5079 = 50;
				Static213.aString149 = Static258.aString183;
				Static152.method2854();
				Static117.anInt2572 = 80;
			}
		} else if (Static117.anInt2572 == 80) {
			local96 = Static196.method3518(Static33.aClass83_20);
			local38 = Static33.method681();
			if (local38 <= local96) {
				Static130.method2199(Static33.aClass83_20);
				Static213.aString149 = Static19.aString13;
				Static229.anInt5079 = 60;
				Static117.anInt2572 = 90;
			} else {
				Static229.anInt5079 = 60;
				Static213.aString149 = Static200.aString104 + local96 * 100 / local38 + "%";
			}
		} else if (Static117.anInt2572 == 90) {
			if (Static91.aClass83_59.method2300()) {
				@Pc(990) Class2_Sub1 local990 = new Class2_Sub1(Static11.aClass83_91, Static91.aClass83_59, Static33.aClass83_20, 20, !Static45.aBoolean75);
				Static151.method2828(local990);
				if (Static20.anInt5576 == 1) {
					Static151.method2846(0.9F);
				}
				if (Static20.anInt5576 == 2) {
					Static151.method2846(0.8F);
				}
				if (Static20.anInt5576 == 3) {
					Static151.method2846(0.7F);
				}
				if (Static20.anInt5576 == 4) {
					Static151.method2846(0.6F);
				}
				Static213.aString149 = Static158.aString107;
				Static117.anInt2572 = 100;
				Static229.anInt5079 = 70;
			} else {
				Static213.aString149 = Static115.aString77 + Static91.aClass83_59.method2318() + "%";
				Static229.anInt5079 = 70;
			}
		} else if (Static117.anInt2572 == 100) {
			if (Static189.method3380(Static33.aClass83_20)) {
				Static117.anInt2572 = 110;
			}
		} else if (Static117.anInt2572 == 110) {
			Static173.aClass115_1 = new Class115();
			Static43.aClass66_1.method1615(10, Static173.aClass115_1);
			Static213.aString149 = Static217.aString150;
			Static229.anInt5079 = 75;
			Static117.anInt2572 = 120;
		} else if (Static117.anInt2572 == 120) {
			if (Static129.aClass83_88.method2311("huffman", "")) {
				@Pc(1094) Class96 local1094 = new Class96(Static129.aClass83_88.method2314("huffman", ""));
				Static249.method4263(local1094);
				Static229.anInt5079 = 80;
				Static213.aString149 = Static181.aString119;
				Static117.anInt2572 = 130;
			} else {
				Static213.aString149 = Static20.aString181 + "0%";
				Static229.anInt5079 = 80;
			}
		} else if (Static117.anInt2572 == 130) {
			if (!Static114.aClass83_75.method2300()) {
				Static213.aString149 = Static87.aString59 + Static114.aClass83_75.method2318() * 3 / 4 + "%";
				Static229.anInt5079 = 85;
			} else if (!Static167.aClass83_119.method2300()) {
				Static213.aString149 = Static87.aString59 + (Static167.aClass83_119.method2318() / 10 + 75) + "%";
				Static229.anInt5079 = 85;
			} else if (!Static259.aClass83_179.method2300()) {
				Static213.aString149 = Static87.aString59 + (Static259.aClass83_179.method2318() / 20 + 85) + "%";
				Static229.anInt5079 = 85;
			} else if (Static241.aClass83_162.method2316("details")) {
				Static281.method4665(Static181.aClass1_Sub2_Sub14_Sub1Array2, Static241.aClass83_162);
				Static248.method4254(Static285.aClass83_199);
				Static229.anInt5079 = 95;
				Static213.aString149 = Static84.aString57;
				Static117.anInt2572 = 135;
			} else {
				Static213.aString149 = Static87.aString59 + (Static241.aClass83_162.method2320("details") / 10 + 90) + "%";
				Static229.anInt5079 = 85;
			}
		} else if (Static117.anInt2572 == 135) {
			local96 = Static273.method4571();
			if (local96 == -1) {
				Static229.anInt5079 = 95;
				Static213.aString149 = Static61.aString49;
			} else if (local96 == 7 || local96 == 9) {
				this.method841("worldlistfull");
				Static140.method2511(1000);
			} else if (Static36.aBoolean66) {
				Static229.anInt5079 = 96;
				Static213.aString149 = Static224.aString153;
				Static117.anInt2572 = 140;
			} else {
				this.method841("worldlistio_" + local96);
				Static140.method2511(1000);
			}
		} else if (Static117.anInt2572 == 140) {
			Static66.anInt3693 = Static114.aClass83_75.method2322("loginscreen");
			Static78.aClass83_47.method2303(false);
			Static210.aClass83_139.method2303(true);
			Static33.aClass83_20.method2303(true);
			Static259.aClass83_179.method2303(true);
			Static129.aClass83_88.method2303(true);
			Static114.aClass83_75.method2303(true);
			Static32.aBoolean47 = true;
			Static117.anInt2572 = 150;
			Static229.anInt5079 = 97;
			Static213.aString149 = Static205.aString146;
		} else if (Static117.anInt2572 == 150) {
			Static69.method1305();
			if (Static157.aBoolean187) {
				Static272.anInt5852 = 0;
				Static8.anInt4429 = 0;
				Static171.anInt3870 = 0;
				Static204.anInt4555 = 0;
			}
			Static157.aBoolean187 = true;
			Static251.method4273(Static43.aClass66_1);
			Static134.method2296(false, -1, Static272.anInt5852, -1);
			Static229.anInt5079 = 100;
			Static117.anInt2572 = 160;
			Static213.aString149 = Static10.aString8;
		} else if (Static117.anInt2572 == 160) {
			Static102.method1683(true);
		}
	}
}
