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
				Static203.method4319("argument count");
			}
			Static261.anInt5273 = Integer.parseInt(arg0[0]);
			Static236.anInt1712 = 2;
			if (arg0[1].equals("live")) {
				Static159.anInt3534 = 0;
			} else if (arg0[1].equals("rc")) {
				Static159.anInt3534 = 1;
			} else if (arg0[1].equals("wip")) {
				Static159.anInt3534 = 2;
			} else {
				Static203.method4319("modewhat");
			}
			Static245.aBoolean315 = false;
			Static134.anInt3081 = Static184.method2978(arg0[2]);
			if (Static134.anInt3081 == -1) {
				if (arg0[2].equals("english")) {
					Static134.anInt3081 = 0;
				} else if (arg0[2].equals("german")) {
					Static134.anInt3081 = 1;
				} else {
					Static203.method4319("language");
				}
			}
			Static46.method920(Static134.anInt3081);
			Static109.aBoolean152 = false;
			Static89.aBoolean387 = false;
			if (arg0[3].equals("game0")) {
				Static208.anInt4489 = 0;
			} else if (arg0[3].equals("game1")) {
				Static208.anInt4489 = 1;
			} else {
				Static203.method4319("game");
			}
			Static264.aBoolean330 = false;
			Static210.aString313 = "";
			Static228.anInt4842 = 0;
			Static23.anInt656 = 0;
			@Pc(128) client local128 = new client();
			Static241.aClient1 = local128;
			local128.method730(Static208.anInt4489 == 1 ? "mechscape" : "runescape", Static159.anInt3534 + 32);
			Static280.aFrame2.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static66.method3525(local154, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method739() {
		for (Static266.anInt5321 = 0; Static312.method4735() && Static266.anInt5321 < 128; Static266.anInt5321++) {
			Static301.anIntArray445[Static266.anInt5321] = Static35.anInt873;
			Static242.anIntArray465[Static266.anInt5321] = Static89.aChar5;
		}
		Static286.anInt5740++;
		if (Static36.anInt902 != -1) {
			Static138.method2309(0, Static36.anInt902, 0, 0, 0, Static38.anInt950, Static270.anInt5412);
		}
		Static12.anInt4023++;
		if (Static294.aBoolean367) {
			label197: for (@Pc(56) int local56 = 0; local56 < 32768; local56++) {
				@Pc(65) Class2_Sub4_Sub1 local65 = Static105.aClass2_Sub4_Sub1Array1[local56];
				if (local65 != null) {
					@Pc(72) byte local72 = local65.aClass145_1.aByte21;
					if ((local72 & 0x2) > 0 && local65.anInt2787 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(100) int local100 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(108) int local108 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local100 != 0 || local108 != 0) {
							local65.anIntArray283[0] = (local65.anInt2846 >> 7) + local100;
							local65.anIntArray286[0] = (local65.anInt2794 >> 7) + local108;
							local65.aByteArray53[0] = 1;
							Static82.aClass75Array1[Static185.anInt4085].method1816(false, false, local65.method2088(), local65.method2088(), local65.anInt2794 >> 7, 0, local65.anInt2846 >> 7);
							if (local65.anIntArray283[0] >= 0 && local65.anIntArray283[0] <= 104 - local65.method2088() && local65.anIntArray286[0] >= 0 && local65.anIntArray286[0] <= 104 - local65.method2088() && Static82.aClass75Array1[Static185.anInt4085].method1819(local65.anIntArray286[0], local65.anInt2794 >> 7, local65.anIntArray283[0], local65.anInt2846 >> 7)) {
								if (local65.method2088() > 1) {
									for (@Pc(241) int local241 = local65.anIntArray283[0]; local65.anIntArray283[0] + local65.method2088() > local241; local241++) {
										for (@Pc(256) int local256 = local65.anIntArray286[0]; local65.anIntArray286[0] + local65.method2088() > local256; local256++) {
											if ((Static82.aClass75Array1[Static185.anInt4085].anIntArrayArray30[local241][local256] & 0x2401FF) != 0) {
												continue label197;
											}
										}
									}
								}
								local65.anInt2787 = 1;
							}
						}
					}
					Static282.method4295(local65);
					Static281.method2097(local65);
					Static247.method3810(local65);
					Static82.aClass75Array1[Static185.anInt4085].method1815(local65.anInt2794 >> 7, false, local65.anInt2846 >> 7, local65.method2088(), local65.method2088(), false);
				}
			}
		}
		if (!Static294.aBoolean367 && Static208.anInt4489 == 0) {
			Static163.method2576();
		} else if (Static253.anInt5118 == 0 && Static251.anInt5521 == 0) {
			if (Static106.anInt2378 == 2) {
				Static109.method1793();
			} else {
				Static82.method1412();
			}
			if (Static58.anInt1269 >> 7 < 14 || Static58.anInt1269 >> 7 >= 90 || Static94.anInt2161 >> 7 < 14 || Static94.anInt2161 >> 7 >= 90) {
				Static202.method3232();
			}
		}
		while (true) {
			@Pc(386) Class1_Sub27 local386;
			@Pc(394) Class191 local394;
			@Pc(406) Class191 local406;
			do {
				local386 = (Class1_Sub27) Static145.aClass26_58.method673();
				if (local386 == null) {
					while (true) {
						do {
							local386 = (Class1_Sub27) Static266.aClass26_51.method673();
							if (local386 == null) {
								while (true) {
									do {
										local386 = (Class1_Sub27) Static262.aClass26_50.method673();
										if (local386 == null) {
											if (Static238.aClass191_11 != null) {
												Static208.method3295();
											}
											if (Static296.aClass47_7 != null && Static296.aClass47_7.anInt1417 == 1) {
												if (Static296.aClass47_7.anObject2 != null) {
													Static5.method2409(Static209.aString309, Static205.aBoolean278);
												}
												Static205.aBoolean278 = false;
												Static209.aString309 = null;
												Static296.aClass47_7 = null;
											}
											if (Static133.anInt3061 % 1500 == 0) {
												Static68.method1163();
											}
											return;
										}
										local394 = local386.aClass191_14;
										if (local394.anInt6165 < 0) {
											break;
										}
										local406 = Static171.method2789(local394.anInt6093);
									} while (local406 == null || local406.aClass191Array2 == null || local406.aClass191Array2.length <= local394.anInt6165 || local394 != local406.aClass191Array2[local394.anInt6165]);
									Static140.method2329(local386);
								}
							}
							local394 = local386.aClass191_14;
							if (local394.anInt6165 < 0) {
								break;
							}
							local406 = Static171.method2789(local394.anInt6093);
						} while (local406 == null || local406.aClass191Array2 == null || local394.anInt6165 >= local406.aClass191Array2.length || local406.aClass191Array2[local394.anInt6165] != local394);
						Static140.method2329(local386);
					}
				}
				local394 = local386.aClass191_14;
				if (local394.anInt6165 < 0) {
					break;
				}
				local406 = Static171.method2789(local394.anInt6093);
			} while (local406 == null || local406.aClass191Array2 == null || local406.aClass191Array2.length <= local394.anInt6165 || local394 != local406.aClass191Array2[local394.anInt6165]);
			Static140.method2329(local386);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method740() {
		@Pc(9) boolean local9 = Static280.aClass41_3.method1024();
		if (!local9) {
			this.method761();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method721() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method724()) {
			return;
		}
		Static261.anInt5273 = Integer.parseInt(this.getParameter("worldid"));
		Static236.anInt1712 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static236.anInt1712 < 0 || Static236.anInt1712 > 1) {
			Static236.anInt1712 = 0;
		}
		Static159.anInt3534 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static159.anInt3534 < 0 || Static159.anInt3534 > 2) {
			Static159.anInt3534 = 0;
		}
		@Pc(48) String local48 = this.getParameter("advertsuppressed");
		if (local48 != null && local48.equals("1")) {
			Static245.aBoolean315 = true;
		} else {
			Static245.aBoolean315 = false;
		}
		try {
			Static134.anInt3081 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(68) Exception local68) {
			Static134.anInt3081 = 0;
		}
		Static46.method920(Static134.anInt3081);
		@Pc(77) String local77 = this.getParameter("objecttag");
		if (local77 != null && local77.equals("1")) {
			Static89.aBoolean387 = true;
		} else {
			Static89.aBoolean387 = false;
		}
		@Pc(93) String local93 = this.getParameter("js");
		if (local93 != null && local93.equals("1")) {
			Static109.aBoolean152 = true;
		} else {
			Static109.aBoolean152 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static208.anInt4489 = 1;
		} else {
			Static208.anInt4489 = 0;
		}
		try {
			Static23.anInt656 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(130) Exception local130) {
			Static23.anInt656 = 0;
		}
		Static210.aString313 = this.getParameter("settings");
		if (Static210.aString313 == null) {
			Static210.aString313 = "";
		}
		@Pc(145) String local145 = this.getParameter("country");
		if (local145 != null) {
			try {
				Static228.anInt4842 = Integer.parseInt(local145);
			} catch (@Pc(152) Exception local152) {
				Static228.anInt4842 = 0;
			}
		}
		@Pc(158) String local158 = this.getParameter("haveie6");
		if (local158 != null && local158.equals("1")) {
			Static264.aBoolean330 = true;
		} else {
			Static264.aBoolean330 = false;
		}
		Static241.aClient1 = this;
		this.method715(Static159.anInt3534 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method749(@OriginalArg(1) int arg0) {
		Static253.aClass104_6 = null;
		Static70.aClass47_2 = null;
		Static280.aClass41_3.anInt1237 = arg0;
		Static280.aClass41_3.anInt1236++;
		Static34.anInt786 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method750(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method2199();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(31) int[] local31 = Static106.anIntArray236 = new int[6];
					local31[0] = local14.method2244();
					local31[1] = local14.method2244();
					local31[2] = local14.method2244();
					local31[3] = local14.method2244();
					local31[4] = local14.method2244();
					local31[5] = local14.method2244();
				} else if (local18 == 4) {
					@Pc(79) int local79 = local14.method2199();
					Static170.anIntArray342 = new int[local79];
					for (@Pc(84) int local84 = 0; local84 < local79; local84++) {
						Static170.anIntArray342[local84] = local14.method2244();
						if (Static170.anIntArray342[local84] == 65535) {
							Static170.anIntArray342[local84] = -1;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method725() {
		Static36.method769();
		Static267.aClass81_3 = new Class81();
		Static280.aClass41_3 = new Class41();
		if (Static159.anInt3534 != 0) {
			Static271.aByteArrayArray17 = new byte[50][];
		}
		Static108.method1774(Static142.aClass112_2);
		if (Static236.anInt1712 == 0) {
			Static130.aString178 = this.getCodeBase().getHost();
			Static63.anInt1367 = 443;
			Static46.anInt1110 = 43594;
		} else if (Static236.anInt1712 == 1) {
			Static130.aString178 = this.getCodeBase().getHost();
			Static46.anInt1110 = Static261.anInt5273 + 40000;
			Static63.anInt1367 = Static261.anInt5273 + 50000;
		} else if (Static236.anInt1712 == 2) {
			Static46.anInt1110 = Static261.anInt5273 + 40000;
			Static63.anInt1367 = Static261.anInt5273 + 50000;
			Static130.aString178 = "127.0.0.1";
		}
		Static44.aString59 = Static130.aString178;
		Static313.anInt6274 = Static46.anInt1110;
		Static188.anInt4156 = Static313.anInt6274;
		if (Static208.anInt4489 == 1) {
			Static186.aShortArray81 = Static88.aShortArray62;
			Static211.aShortArrayArray9 = Static271.aShortArrayArray12;
			Static180.anInt3944 = 0;
			Static180.anInt3946 = 16777215;
			Static278.aShortArrayArray13 = Static185.aShortArrayArray7;
			Static248.aShortArray90 = Static241.aShortArray88;
			Static77.aBoolean122 = true;
		} else {
			Static186.aShortArray81 = Static2.aShortArray1;
			Static248.aShortArray90 = Static245.aShortArray89;
			Static211.aShortArrayArray9 = Static115.aShortArrayArray6;
			Static278.aShortArrayArray13 = Static9.aShortArrayArray1;
		}
		Static265.anInt5307 = Static46.anInt1110;
		Static277.anInt5551 = Static63.anInt1367;
		if (Static179.anInt3942 == 3 && Static236.anInt1712 != 2) {
			Static96.anInt2210 = Static261.anInt5273;
		}
		Static251.aShortArray94 = Static309.aShortArray100 = Static228.aShortArray83 = Static197.aShortArray82 = new short[256];
		Static65.method1140();
		Static60.method1081(Static108.aCanvas1);
		Static169.method2750(Static108.aCanvas1);
		Static223.aClass69_1 = Static69.method1172();
		if (Static223.aClass69_1 != null) {
			Static223.aClass69_1.method1697(Static108.aCanvas1);
		}
		Static192.anInt4224 = Static179.anInt3942;
		try {
			if (Static142.aClass112_2.aClass5_3 != null) {
				Static6.aClass193_1 = new Class193(Static142.aClass112_2.aClass5_3, 5200, 0);
				for (@Pc(175) int local175 = 0; local175 < 29; local175++) {
					Static255.aClass193Array1[local175] = new Class193(Static142.aClass112_2.aClass5Array1[local175], 6000, 0);
				}
				Static119.aClass193_6 = new Class193(Static142.aClass112_2.aClass5_2, 6000, 0);
				Static124.aClass83_2 = new Class83(255, Static6.aClass193_1, Static119.aClass193_6, 500000);
				Static251.aClass193_9 = new Class193(Static142.aClass112_2.aClass5_1, 24, 0);
				Static142.aClass112_2.aClass5_1 = null;
				Static142.aClass112_2.aClass5_2 = null;
				Static142.aClass112_2.aClass5_3 = null;
				Static142.aClass112_2.aClass5Array1 = null;
			}
		} catch (@Pc(233) IOException local233) {
			Static251.aClass193_9 = null;
			Static124.aClass83_2 = null;
			Static6.aClass193_1 = null;
			Static119.aClass193_6 = null;
		}
		if (Static208.anInt4489 == 0) {
			Static87.aString115 = Static72.aString98;
		} else if (Static208.anInt4489 == 1) {
			Static87.aString115 = Static262.aString377;
		}
		if (Static236.anInt1712 != 0) {
			Static24.aBoolean36 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method735() {
		if (Static96.anInt2212 == 1000) {
			return;
		}
		@Pc(25) long local25 = Static34.method691() / 1000000L - Static16.aLong29;
		Static16.aLong29 = Static34.method691() / 1000000L;
		@Pc(33) boolean local33 = Static166.method2727();
		if (local33 && Static82.aBoolean132 && Static114.aClass15_1 != null) {
			Static114.aClass15_1.method1251();
		}
		if ((Static96.anInt2212 == 30 || Static96.anInt2212 == 10) && (Static272.aBoolean337 || Static229.aLong187 != 0L && Static229.aLong187 < Static258.method3967())) {
			Static286.method4392(Static217.method3458(), Static139.anInt3176, Static153.anInt3412, Static272.aBoolean337);
		}
		@Pc(95) int local95;
		@Pc(99) int local99;
		if (Static229.aFrame1 == null) {
			@Pc(82) Container local82;
			if (Static229.aFrame1 != null) {
				local82 = Static229.aFrame1;
			} else if (Static280.aFrame2 == null) {
				local82 = Static142.aClass112_2.anApplet1;
			} else {
				local82 = Static280.aFrame2;
			}
			local95 = local82.getSize().width;
			local99 = local82.getSize().height;
			if (Static280.aFrame2 == local82) {
				@Pc(106) Insets local106 = Static280.aFrame2.getInsets();
				local95 -= local106.right + local106.left;
				local99 -= local106.top + local106.bottom;
			}
			if (Static163.anInt3557 != local95 || Static7.anInt207 != local99) {
				if (Static179.aString261.startsWith("mac")) {
					Static7.anInt207 = local99;
					Static163.anInt3557 = local95;
				} else {
					Static36.method769();
				}
				Static229.aLong187 = Static258.method3967() + 500L;
			}
		}
		@Pc(156) boolean local156 = false;
		if (Static229.aFrame1 != null && !Static135.aBoolean191 && (Static96.anInt2212 == 30 || Static96.anInt2212 == 10)) {
			Static286.method4392(Static309.anInt6184, -1, -1, false);
		}
		if (Static283.aBoolean358) {
			Static283.aBoolean358 = false;
			local156 = true;
		}
		if (local156) {
			Static297.method4538();
		}
		if (Static294.aBoolean367) {
			for (local95 = 0; local95 < 100; local95++) {
				Static29.aBooleanArray6[local95] = true;
			}
		}
		if (Static96.anInt2212 == 0) {
			Static277.method4186(local156, Static66.aString333, null, Static22.anInt612);
		} else if (Static96.anInt2212 == 5) {
			Static129.method2071(Static176.aClass1_Sub3_Sub5_2, false);
		} else if (Static96.anInt2212 == 10) {
			Static107.method1252();
		} else if (Static96.anInt2212 == 25 || Static96.anInt2212 == 28) {
			if (Static186.anInt4095 == 1) {
				if (Static222.anInt4704 < Static144.anInt3282) {
					Static222.anInt4704 = Static144.anInt3282;
				}
				local95 = (Static222.anInt4704 - Static144.anInt3282) * 50 / Static222.anInt4704;
				Static182.method2957(Static115.aString149 + "<br>(" + local95 + "%)", false);
			} else if (Static186.anInt4095 == 2) {
				if (Static222.anInt4707 > Static134.anInt3084) {
					Static134.anInt3084 = Static222.anInt4707;
				}
				local95 = (Static134.anInt3084 - Static222.anInt4707) * 50 / Static134.anInt3084 + 50;
				Static182.method2957(Static115.aString149 + "<br>(" + local95 + "%)", false);
			} else {
				Static182.method2957(Static115.aString149, false);
			}
		} else if (Static96.anInt2212 == 30) {
			Static93.method1580(local25);
		} else if (Static96.anInt2212 == 40) {
			Static182.method2957(Static301.aString341 + "<br>" + Static173.aString247, false);
		}
		if (Static294.aBoolean367 && Static96.anInt2212 != 0) {
			Static294.method4509();
			for (local95 = 0; local95 < Static203.anInt5700; local95++) {
				Static55.aBooleanArray15[local95] = false;
			}
		} else {
			@Pc(388) Graphics local388;
			if ((Static96.anInt2212 == 30 || Static96.anInt2212 == 10) && Static206.anInt4453 == 0 && !local156) {
				try {
					local388 = Static108.aCanvas1.getGraphics();
					for (local99 = 0; local99 < Static203.anInt5700; local99++) {
						if (Static55.aBooleanArray15[local99]) {
							Static293.aClass3_1.method2414(local388, Static103.anIntArray231[local99], Static117.anIntArray424[local99], Static197.anIntArray379[local99], Static128.anIntArray278[local99]);
							Static55.aBooleanArray15[local99] = false;
						}
					}
				} catch (@Pc(453) Exception local453) {
					Static108.aCanvas1.repaint();
				}
			} else if (Static96.anInt2212 != 0) {
				try {
					local388 = Static108.aCanvas1.getGraphics();
					Static293.aClass3_1.method2410(local388);
					for (local99 = 0; local99 < Static203.anInt5700; local99++) {
						Static55.aBooleanArray15[local99] = false;
					}
				} catch (@Pc(408) Exception local408) {
					Static108.aCanvas1.repaint();
				}
			}
		}
		if (Static122.aBoolean161) {
			Static162.method2566();
		}
		if (Static283.aBoolean357 && Static96.anInt2212 == 10 && Static36.anInt902 != -1) {
			Static283.aBoolean357 = false;
			Static24.method510(Static142.aClass112_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method720() {
		if (Static294.aBoolean367) {
			Static294.method4523();
		}
		if (Static229.aFrame1 != null) {
			Static173.method2821(Static229.aFrame1, Static142.aClass112_2);
			Static229.aFrame1 = null;
		}
		if (Static17.aClass88_1 != null) {
			Static17.aClass88_1.aBoolean187 = false;
		}
		Static17.aClass88_1 = null;
		if (Static5.aClass104_5 != null) {
			Static5.aClass104_5.method2571();
			Static5.aClass104_5 = null;
		}
		Static234.method3710(Static108.aCanvas1);
		Static301.method3615(Static108.aCanvas1);
		if (Static223.aClass69_1 != null) {
			Static223.aClass69_1.method1699(Static108.aCanvas1);
		}
		Static69.method1175();
		Static210.method3371();
		Static223.aClass69_1 = null;
		if (Static114.aClass15_1 != null) {
			Static114.aClass15_1.method1242();
		}
		if (Static157.aClass15_2 != null) {
			Static157.aClass15_2.method1242();
		}
		Static280.aClass41_3.method1037();
		Static267.aClass81_3.method1973();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method756() {
		if (!Static283.aBoolean357) {
			label258: while (true) {
				do {
					if (!Static312.method4735()) {
						break label258;
					}
				} while (Static89.aChar5 != 's' && Static89.aChar5 != 'S');
				Static283.aBoolean357 = true;
			}
		}
		@Pc(39) int local39;
		if (Static251.anInt5522 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(42) long local42 = Static258.method3967();
			if (Static309.aLong239 == 0L) {
				Static309.aLong239 = local42;
			}
			if (local39 > 16384 && local42 - Static309.aLong239 < 5000L) {
				if (local42 - Static166.aLong127 > 1000L) {
					System.gc();
					Static166.aLong127 = local42;
				}
				Static22.anInt612 = 5;
				Static66.aString333 = Static99.aString130;
			} else {
				Static22.anInt612 = 5;
				Static66.aString333 = Static134.aString189;
				Static251.anInt5522 = 10;
			}
			return;
		}
		@Pc(91) int local91;
		if (Static251.anInt5522 == 10) {
			for (local91 = 0; local91 < 4; local91++) {
				Static82.aClass75Array1[local91] = new Class75(104, 104);
			}
			Static22.anInt612 = 10;
			Static66.aString333 = Static117.aString318;
			Static251.anInt5522 = 30;
		} else if (Static251.anInt5522 == 30) {
			if (Static311.aClass51_1 == null) {
				Static311.aClass51_1 = new Class51(Static280.aClass41_3, Static267.aClass81_3);
			}
			if (Static311.aClass51_1.method1178()) {
				Static149.aClass168_112 = Static181.method2931(true, true, 0, false);
				Static31.aClass168_25 = Static181.method2931(true, true, 1, false);
				Static197.aClass168_145 = Static181.method2931(false, true, 2, true);
				Static57.aClass168_212 = Static181.method2931(true, true, 3, false);
				Static281.aClass168_98 = Static181.method2931(true, true, 4, false);
				Static124.aClass168_93 = Static181.method2931(true, true, 5, true);
				Static310.aClass168_209 = Static181.method2931(true, false, 6, true);
				Static112.aClass168_84 = Static181.method2931(true, true, 7, false);
				Static277.aClass168_188 = Static181.method2931(true, true, 8, false);
				Static65.aClass168_50 = Static181.method2931(true, true, 9, false);
				Static122.aClass168_91 = Static181.method2931(true, true, 10, false);
				Static27.aClass168_148 = Static181.method2931(true, true, 11, false);
				Static208.aClass168_154 = Static181.method2931(true, true, 12, false);
				Static41.aClass168_34 = Static181.method2931(true, true, 13, false);
				Static53.aClass168_41 = Static181.method2931(true, false, 14, false);
				Static207.aClass168_152 = Static181.method2931(true, true, 15, false);
				Static262.aClass168_178 = Static181.method2931(true, true, 16, false);
				Static188.aClass168_139 = Static181.method2931(true, true, 17, false);
				Static183.aClass168_134 = Static181.method2931(true, true, 18, false);
				Static37.aClass168_30 = Static181.method2931(true, true, 19, false);
				Static197.aClass168_144 = Static181.method2931(true, true, 20, false);
				Static2.aClass168_4 = Static181.method2931(true, true, 21, false);
				Static87.aClass168_66 = Static181.method2931(true, true, 22, false);
				Static280.aClass168_191 = Static181.method2931(true, true, 23, true);
				Static106.aClass168_81 = Static181.method2931(true, true, 24, false);
				Static54.aClass168_42 = Static181.method2931(true, true, 25, false);
				Static100.aClass168_78 = Static181.method2931(true, true, 26, true);
				Static11.aClass168_13 = Static181.method2931(true, true, 27, false);
				Static90.aClass168_71 = Static181.method2931(true, true, 28, true);
				Static22.anInt612 = 15;
				Static251.anInt5522 = 40;
				Static66.aString333 = Static130.aString181;
			} else {
				Static66.aString333 = Static163.aString217;
				Static22.anInt612 = 12;
			}
		} else if (Static251.anInt5522 == 40) {
			local91 = 0;
			for (local39 = 0; local39 < 29; local39++) {
				local91 += Static62.aClass13_Sub1Array1[local39].method2965() * Static175.anIntArray24[local39] / 100;
			}
			if (local91 == 100) {
				Static66.aString333 = Static148.aString204;
				Static22.anInt612 = 20;
				Static300.method4574(Static277.aClass168_188);
				Static66.method3527(Static277.aClass168_188);
				Static315.method4762(Static277.aClass168_188);
				Static251.anInt5522 = 41;
			} else {
				Static22.anInt612 = 20;
				if (local91 != 0) {
					Static66.aString333 = Static109.aString143 + local91 + "%";
				}
			}
		} else if (Static251.anInt5522 == 41) {
			if (Static90.aClass168_71.method4054()) {
				this.method750(Static90.aClass168_71.method4062(1));
				Static22.anInt612 = 25;
				Static66.aString333 = Static70.aString92;
				Static251.anInt5522 = 45;
			} else {
				Static66.aString333 = Static254.aString361 + Static90.aClass168_71.method4042() + "%";
				Static22.anInt612 = 25;
			}
		} else if (Static251.anInt5522 == 45) {
			Static105.method1739(Static11.aBoolean17);
			Static220.aClass1_Sub10_Sub3_3 = new Class1_Sub10_Sub3();
			Static220.aClass1_Sub10_Sub3_3.method3150();
			Static114.aClass15_1 = Static124.method2031(0, Static142.aClass112_2, 22050, Static108.aCanvas1);
			Static114.aClass15_1.method1246(Static220.aClass1_Sub10_Sub3_3);
			Static47.method947(Static207.aClass168_152, Static220.aClass1_Sub10_Sub3_3, Static281.aClass168_98, Static53.aClass168_41);
			Static157.aClass15_2 = Static124.method2031(1, Static142.aClass112_2, 2048, Static108.aCanvas1);
			Static101.aClass1_Sub10_Sub2_2 = new Class1_Sub10_Sub2();
			Static157.aClass15_2.method1246(Static101.aClass1_Sub10_Sub2_2);
			Static189.aClass19_1 = new Class19(22050, Static230.anInt3026);
			Static240.anInt5003 = Static310.aClass168_209.method4069("scape main");
			Static66.aString333 = Static93.aString119;
			Static251.anInt5522 = 50;
			Static22.anInt612 = 30;
		} else if (Static251.anInt5522 == 50) {
			local91 = Static311.method4704(Static277.aClass168_188, Static41.aClass168_34);
			local39 = Static31.method676();
			if (local91 < local39) {
				Static22.anInt612 = 35;
				Static66.aString333 = Static84.aString111 + local91 * 100 / local39 + "%";
			} else {
				Static251.anInt5522 = 60;
				Static66.aString333 = Static114.aString148;
				Static22.anInt612 = 35;
			}
		} else if (Static251.anInt5522 == 60) {
			local91 = Static40.method813(Static277.aClass168_188);
			local39 = Static130.method2109();
			if (local91 >= local39) {
				Static66.aString333 = Static101.aString13;
				Static22.anInt612 = 40;
				Static251.anInt5522 = 65;
			} else {
				Static66.aString333 = Static20.aString36 + local91 * 100 / local39 + "%";
				Static22.anInt612 = 40;
			}
		} else if (Static251.anInt5522 == 65) {
			Static120.method4730(Static277.aClass168_188, Static41.aClass168_34);
			Static22.anInt612 = 45;
			Static66.aString333 = Static244.aString289;
			Static112.method1823(5);
			Static251.anInt5522 = 70;
		} else if (Static251.anInt5522 == 70) {
			Static197.aClass168_145.method4054();
			local91 = Static197.aClass168_145.method4042();
			Static262.aClass168_178.method4054();
			local91 += Static262.aClass168_178.method4042();
			Static188.aClass168_139.method4054();
			local91 += Static188.aClass168_139.method4042();
			Static183.aClass168_134.method4054();
			local91 += Static183.aClass168_134.method4042();
			Static37.aClass168_30.method4054();
			local91 += Static37.aClass168_30.method4042();
			Static197.aClass168_144.method4054();
			local91 += Static197.aClass168_144.method4042();
			Static2.aClass168_4.method4054();
			local91 += Static2.aClass168_4.method4042();
			Static87.aClass168_66.method4054();
			local91 += Static87.aClass168_66.method4042();
			Static106.aClass168_81.method4054();
			local91 += Static106.aClass168_81.method4042();
			Static54.aClass168_42.method4054();
			local91 += Static54.aClass168_42.method4042();
			Static11.aClass168_13.method4054();
			local91 += Static11.aClass168_13.method4042();
			if (local91 >= 1100) {
				Static300.method4582(Static197.aClass168_145);
				Static35.method738(Static197.aClass168_145);
				Static199.method4760(Static197.aClass168_145);
				Static197.method3178(Static197.aClass168_145, Static112.aClass168_84);
				Static279.method4262(Static262.aClass168_178, Static112.aClass168_84);
				Static116.method1879(Static183.aClass168_134, Static112.aClass168_84);
				Static232.method3678(Static130.aClass1_Sub3_Sub5_Sub1_2, Static37.aClass168_30, Static112.aClass168_84);
				Static246.method3805(Static197.aClass168_145);
				Static173.method2818(Static197.aClass168_144, Static149.aClass168_112, Static31.aClass168_25);
				Static124.method2030(Static197.aClass168_145);
				Static140.method2333(Static112.aClass168_84, Static2.aClass168_4);
				Static88.method1531(Static87.aClass168_66);
				Static254.method3875(Static197.aClass168_145);
				Static214.method3427(Static57.aClass168_212, Static277.aClass168_188, Static112.aClass168_84, Static41.aClass168_34);
				Static184.method2979(Static197.aClass168_145);
				Static35.method742(Static188.aClass168_139);
				Static125.method2046(new Class130(), Static106.aClass168_81, Static54.aClass168_42);
				Static139.method2321(Static106.aClass168_81, Static54.aClass168_42);
				Static208.method3294(Static197.aClass168_145);
				Static63.method1120(Static197.aClass168_145);
				Static241.method3784(Static197.aClass168_145);
				Static170.method2758(Static277.aClass168_188, Static197.aClass168_145);
				Static9.method299(Static197.aClass168_145, Static277.aClass168_188);
				Static217.method3457(Static277.aClass168_188, Static197.aClass168_145);
				Static22.anInt612 = 50;
				Static66.aString333 = Static287.aString411;
				Static136.method2301();
				Static251.anInt5522 = 80;
			} else {
				Static22.anInt612 = 50;
				Static66.aString333 = Static17.aString35 + local91 / 11 + "%";
			}
		} else if (Static251.anInt5522 == 80) {
			local91 = Static86.method1566(Static277.aClass168_188);
			local39 = Static172.method2812();
			if (local91 >= local39) {
				Static35.method748(Static277.aClass168_188);
				Static22.anInt612 = 60;
				Static66.aString333 = Static315.aString449;
				Static251.anInt5522 = 90;
			} else {
				Static22.anInt612 = 60;
				Static66.aString333 = Static109.aString145 + local91 * 100 / local39 + "%";
			}
		} else if (Static251.anInt5522 == 90) {
			if (Static100.aClass168_78.method4054()) {
				@Pc(937) Class63_Sub1 local937 = new Class63_Sub1(Static65.aClass168_50, Static100.aClass168_78, Static277.aClass168_188, 20, !Static41.aBoolean72);
				Static237.method3746(local937);
				if (Static166.anInt3743 == 1) {
					Static237.method3738(0.9F);
				}
				if (Static166.anInt3743 == 2) {
					Static237.method3738(0.8F);
				}
				if (Static166.anInt3743 == 3) {
					Static237.method3738(0.7F);
				}
				if (Static166.anInt3743 == 4) {
					Static237.method3738(0.6F);
				}
				Static251.anInt5522 = 100;
				Static22.anInt612 = 70;
				Static66.aString333 = Static277.aString391;
			} else {
				Static66.aString333 = Static208.aString305 + Static100.aClass168_78.method4042() + "%";
				Static22.anInt612 = 70;
			}
		} else if (Static251.anInt5522 == 100) {
			if (Static287.method4394(Static277.aClass168_188)) {
				Static251.anInt5522 = 110;
			}
		} else if (Static251.anInt5522 == 110) {
			Static17.aClass88_1 = new Class88();
			Static142.aClass112_2.method2879(10, Static17.aClass88_1);
			Static22.anInt612 = 75;
			Static66.aString333 = Static38.aString54;
			Static251.anInt5522 = 120;
		} else if (Static251.anInt5522 == 120) {
			if (Static122.aClass168_91.method4074("", "huffman")) {
				@Pc(1045) Class70 local1045 = new Class70(Static122.aClass168_91.method4053("huffman", ""));
				Static240.method3779(local1045);
				Static66.aString333 = Static69.aString91;
				Static22.anInt612 = 80;
				Static251.anInt5522 = 130;
			} else {
				Static22.anInt612 = 80;
				Static66.aString333 = Static9.aString22 + "0%";
			}
		} else if (Static251.anInt5522 == 130) {
			if (!Static57.aClass168_212.method4054()) {
				Static66.aString333 = Static14.aString32 + Static57.aClass168_212.method4042() * 3 / 4 + "%";
				Static22.anInt612 = 85;
			} else if (!Static208.aClass168_154.method4054()) {
				Static66.aString333 = Static14.aString32 + (Static208.aClass168_154.method4042() / 10 + 75) + "%";
				Static22.anInt612 = 85;
			} else if (!Static41.aClass168_34.method4054()) {
				Static66.aString333 = Static14.aString32 + (Static41.aClass168_34.method4042() / 20 + 85) + "%";
				Static22.anInt612 = 85;
			} else if (Static280.aClass168_191.method4061("details")) {
				Static268.method2002(Static280.aClass168_191);
				Static42.method871(Static11.aClass168_13);
				Static224.method3545(Static112.aClass168_84);
				Static66.aString333 = Static168.aString236;
				Static251.anInt5522 = 135;
				Static22.anInt612 = 95;
			} else {
				Static66.aString333 = Static14.aString32 + (Static280.aClass168_191.method4066("details") / 10 + 90) + "%";
				Static22.anInt612 = 85;
			}
		} else if (Static251.anInt5522 == 135) {
			local91 = Static7.method241();
			if (local91 == -1) {
				Static66.aString333 = Static50.aString21;
				Static22.anInt612 = 95;
			} else if (local91 == 7 || local91 == 9) {
				this.method717("worldlistfull");
				Static112.method1823(1000);
			} else if (Static155.aBoolean224) {
				Static251.anInt5522 = 140;
				Static22.anInt612 = 96;
				Static66.aString333 = Static207.aString301;
			} else {
				this.method717("worldlistio_" + local91);
				Static112.method1823(1000);
			}
		} else if (Static251.anInt5522 == 140) {
			Static40.anInt987 = Static57.aClass168_212.method4069("loginscreen");
			Static124.aClass168_93.method4057(false);
			Static310.aClass168_209.method4057(true);
			Static277.aClass168_188.method4057(true);
			Static41.aClass168_34.method4057(true);
			Static122.aClass168_91.method4057(true);
			Static57.aClass168_212.method4057(true);
			Static66.aString333 = Static252.aString356;
			Static122.aBoolean161 = true;
			Static251.anInt5522 = 150;
			Static22.anInt612 = 97;
		} else if (Static251.anInt5522 == 150) {
			Static97.method1630();
			if (Static283.aBoolean357) {
				Static309.anInt6196 = 0;
				Static309.anInt6184 = 0;
				Static266.anInt5317 = 0;
				Static124.anInt2706 = 0;
			}
			Static283.aBoolean357 = true;
			Static24.method510(Static142.aClass112_2);
			Static286.method4392(Static309.anInt6184, -1, -1, false);
			Static22.anInt612 = 100;
			Static66.aString333 = Static34.aString51;
			Static251.anInt5522 = 160;
		} else if (Static251.anInt5522 == 160) {
			Static43.method872(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method761() {
		if (Static18.anInt488 < Static280.aClass41_3.anInt1236) {
			if (Static265.anInt5307 == Static188.anInt4156) {
				Static188.anInt4156 = Static277.anInt5551;
			} else {
				Static188.anInt4156 = Static265.anInt5307;
			}
			Static304.anInt6023 = (Static280.aClass41_3.anInt1236 * 50 - 50) * 5;
			if (Static304.anInt6023 > 3000) {
				Static304.anInt6023 = 3000;
			}
			if (Static280.aClass41_3.anInt1236 >= 2 && Static280.aClass41_3.anInt1237 == 6) {
				this.method717("js5connect_outofdate");
				Static96.anInt2212 = 1000;
				return;
			}
			if (Static280.aClass41_3.anInt1236 >= 4 && Static280.aClass41_3.anInt1237 == -1) {
				this.method717("js5crc");
				Static96.anInt2212 = 1000;
				return;
			}
			if (Static280.aClass41_3.anInt1236 >= 4 && (Static96.anInt2212 == 0 || Static96.anInt2212 == 5)) {
				if (Static280.aClass41_3.anInt1237 == 7 || Static280.aClass41_3.anInt1237 == 9) {
					this.method717("js5connect_full");
				} else if (Static280.aClass41_3.anInt1237 > 0) {
					this.method717("js5connect");
				} else {
					this.method717("js5io");
				}
				Static96.anInt2212 = 1000;
				return;
			}
		}
		Static18.anInt488 = Static280.aClass41_3.anInt1236;
		if (Static304.anInt6023 > 0) {
			Static304.anInt6023--;
			return;
		}
		try {
			if (Static34.anInt786 == 0) {
				Static70.aClass47_2 = Static142.aClass112_2.method2889(Static44.aString59, Static188.anInt4156);
				Static34.anInt786++;
			}
			if (Static34.anInt786 == 1) {
				if (Static70.aClass47_2.anInt1417 == 2) {
					this.method749(1000);
					return;
				}
				if (Static70.aClass47_2.anInt1417 == 1) {
					Static34.anInt786++;
				}
			}
			if (Static34.anInt786 == 2) {
				Static253.aClass104_6 = new Class104((Socket) Static70.aClass47_2.anObject2, Static142.aClass112_2);
				@Pc(189) Class1_Sub14 local189 = new Class1_Sub14(5);
				local189.method2191(15);
				local189.method2236(551);
				Static253.aClass104_6.method2579(local189.aByteArray55, 5);
				Static34.anInt786++;
				Static145.aLong236 = Static258.method3967();
			}
			if (Static34.anInt786 == 3) {
				if (Static96.anInt2212 == 0 || Static96.anInt2212 == 5 || Static253.aClass104_6.method2581() > 0) {
					@Pc(249) int local249 = Static253.aClass104_6.method2573();
					if (local249 != 0) {
						this.method749(local249);
						return;
					}
					Static34.anInt786++;
				} else if (Static258.method3967() - Static145.aLong236 > 30000L) {
					this.method749(1001);
					return;
				}
			}
			if (Static34.anInt786 == 4) {
				@Pc(285) boolean local285 = Static96.anInt2212 == 5 || Static96.anInt2212 == 10 || Static96.anInt2212 == 28;
				Static280.aClass41_3.method1026(Static253.aClass104_6, !local285);
				Static70.aClass47_2 = null;
				Static34.anInt786 = 0;
				Static253.aClass104_6 = null;
			}
		} catch (@Pc(302) IOException local302) {
			this.method749(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method716() {
		if (Static96.anInt2212 == 1000) {
			return;
		}
		Static133.anInt3061++;
		if (Static133.anInt3061 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static308.anInt6132 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static134.aRandom1.setSeed((long) Static308.anInt6132);
		}
		this.method740();
		if (Static311.aClass51_1 != null) {
			Static311.aClass51_1.method1181();
		}
		Static174.method4212();
		Static248.method3834();
		Static69.method1173();
		Static200.method3203();
		if (Static294.aBoolean367) {
			Static113.method1836();
		}
		if (Static223.aClass69_1 != null) {
			@Pc(83) int local83 = Static223.aClass69_1.method1694();
			Static134.anInt3083 = local83;
		}
		if (Static96.anInt2212 == 0) {
			this.method756();
			Static214.method3430();
		} else if (Static96.anInt2212 == 5) {
			this.method756();
			Static214.method3430();
		} else if (Static96.anInt2212 == 25 || Static96.anInt2212 == 28) {
			Static93.method1579();
		}
		if (Static96.anInt2212 == 10) {
			this.method739();
			Static59.method1077();
			Static35.method741();
			Static38.method799();
		} else if (Static96.anInt2212 == 30) {
			Static230.method2189();
		} else if (Static96.anInt2212 == 40) {
			Static38.method799();
			if (Static271.anInt5421 != -3) {
				if (Static271.anInt5421 == 15) {
					Static43.method873();
				} else if (Static271.anInt5421 != 2) {
					Static170.method2760();
				}
			}
		}
	}
}
