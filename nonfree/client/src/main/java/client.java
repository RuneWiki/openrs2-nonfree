import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static35.method8317("Argument count");
			}
			Static616.aClass326_11 = new Class326();
			Static616.aClass326_11.anInt8758 = Integer.parseInt(arg0[0]);
			Static390.aClass326_8 = new Class326();
			Static390.aClass326_8.anInt8758 = Integer.parseInt(arg0[1]);
			Static451.aClass326_6 = new Class326();
			Static451.aClass326_6.anInt8758 = Integer.parseInt(arg0[2]);
			Static252.aClass80_3 = Static122.aClass80_1;
			if (arg0[3].equals("live")) {
				Static298.aClass113_4 = Static252.aClass113_2;
			} else if (arg0[3].equals("rc")) {
				Static298.aClass113_4 = Static273.aClass113_3;
			} else if (arg0[3].equals("wip")) {
				Static298.aClass113_4 = Static130.aClass113_1;
			} else {
				Static35.method8317("modewhat");
			}
			Static483.anInt7694 = Static283.method6304(arg0[4]);
			if (Static483.anInt7694 == -1) {
				if (arg0[4].equals("english")) {
					Static483.anInt7694 = 0;
				} else if (arg0[4].equals("german")) {
					Static483.anInt7694 = 1;
				} else {
					Static35.method8317("language");
				}
			}
			Static206.aBoolean251 = false;
			Static418.aBoolean471 = false;
			if (arg0[5].equals("game0")) {
				Static189.aClass375_5 = Static605.aClass375_7;
			} else if (arg0[5].equals("game1")) {
				Static189.aClass375_5 = Static25.aClass375_2;
			} else if (arg0[5].equals("game2")) {
				Static189.aClass375_5 = Static485.aClass375_6;
			} else if (arg0[5].equals("game3")) {
				Static189.aClass375_5 = Static93.aClass375_3;
			} else {
				Static35.method8317("game");
			}
			Static322.aString56 = null;
			Static528.aLong234 = 0L;
			Static435.aString32 = null;
			Static540.aBoolean664 = false;
			Static425.aBoolean495 = true;
			Static296.aBoolean353 = true;
			Static287.aBoolean327 = false;
			Static295.anInt4833 = Static189.aClass375_5.anInt10144;
			Static310.anInt4998 = 0;
			Static380.anInt5916 = 0;
			Static534.anInt8759 = 0;
			Static377.aString78 = "";
			@Pc(184) client local184 = new client();
			Static78.aClient1 = local184;
			local184.method1058(Static189.aClass375_5.aString110, Static298.aClass113_4.method2576() + 32);
			Static202.aFrame2.setLocation(40, 40);
		} catch (@Pc(208) Exception local208) {
			Static163.method2447(local208, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1065(@OriginalArg(0) int arg0) {
		Static571.aClass257_2 = null;
		Static34.aClass108_2 = null;
		Static301.aClass104_3.anInt2683++;
		Static397.anInt6246 = 0;
		Static301.aClass104_3.anInt2684 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1062() {
		if (Static365.aBoolean427) {
			Static202.method2859();
		}
		Static433.method5968();
		if (Static192.aClass95_4 != null) {
			Static192.aClass95_4.method6930();
		}
		if (Static298.aFrame3 != null) {
			Static120.method1758(Static298.aFrame3, Static452.aClass226_6);
			Static298.aFrame3 = null;
		}
		if (Static155.aClass121_2 != null) {
			Static155.aClass121_2.method2936();
			Static155.aClass121_2 = null;
		}
		Static620.method8305();
		Static301.aClass104_3.method2236();
		Static522.aClass376_3.method8480();
		if (Static308.aClass253_1 != null) {
			Static308.aClass253_1.method5493();
			Static308.aClass253_1 = null;
		}
		try {
			Static25.aClass254_1.method5498();
			for (@Pc(63) int local63 = 0; local63 < 37; local63++) {
				Static167.aClass254Array1[local63].method5498();
			}
			Static216.aClass254_10.method5498();
			Static363.aClass254_9.method5498();
			Static119.method1753();
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method1066() {
		@Pc(7) boolean local7 = Static301.aClass104_3.method2229();
		if (!local7) {
			this.method1067();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	@Override
	protected void method1059() {
		if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != 2) {
			this.method1077();
			return;
		}
		try {
			this.method1077();
		} catch (@Pc(26) ThreadDeath local26) {
			throw local26;
		} catch (@Pc(29) Throwable local29) {
			Static163.method2447(local29, local29.getMessage() + " (Recovered) " + this.method1051());
			Static317.method4257(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method1067() {
		if (Static301.aClass104_3.anInt2683 > Static96.anInt1815) {
			Static216.aClass326_9.method7370();
			Static412.anInt6402 = (Static301.aClass104_3.anInt2683 * 50 - 50) * 5;
			if (Static412.anInt6402 > 3000) {
				Static412.anInt6402 = 3000;
			}
			if (Static301.aClass104_3.anInt2683 >= 2 && Static301.aClass104_3.anInt2684 == 6) {
				this.method1063("js5connect_outofdate");
				Static324.anInt5145 = 14;
				return;
			}
			if (Static301.aClass104_3.anInt2683 >= 4 && Static301.aClass104_3.anInt2684 == -1) {
				this.method1063("js5crc");
				Static324.anInt5145 = 14;
				return;
			}
			if (Static301.aClass104_3.anInt2683 >= 4 && Static133.method1838(Static324.anInt5145)) {
				if (Static301.aClass104_3.anInt2684 == 7 || Static301.aClass104_3.anInt2684 == 9) {
					this.method1063("js5connect_full");
				} else if (Static301.aClass104_3.anInt2684 <= 0) {
					this.method1063("js5io");
				} else if (Static245.aString38 == null) {
					this.method1063("js5connect");
				} else {
					this.method1063("js5proxy_" + Static245.aString38.trim());
				}
				Static324.anInt5145 = 14;
				return;
			}
		}
		Static96.anInt1815 = Static301.aClass104_3.anInt2683;
		if (Static412.anInt6402 > 0) {
			Static412.anInt6402--;
			return;
		}
		try {
			if (Static397.anInt6246 == 0) {
				Static34.aClass108_2 = Static216.aClass326_9.method7373(Static452.aClass226_6);
				Static397.anInt6246++;
			}
			if (Static397.anInt6246 == 1) {
				if (Static34.aClass108_2.anInt2766 == 2) {
					if (Static34.aClass108_2.anObject6 != null) {
						Static245.aString38 = (String) Static34.aClass108_2.anObject6;
					}
					this.method1065(1000);
					return;
				}
				if (Static34.aClass108_2.anInt2766 == 1) {
					Static397.anInt6246++;
				}
			}
			if (Static397.anInt6246 == 2) {
				Static571.aClass257_2 = new Class257((Socket) Static34.aClass108_2.anObject6, Static452.aClass226_6, 25000);
				@Pc(208) Class2_Sub22 local208 = new Class2_Sub22(5);
				local208.method8537(Static582.aClass314_2.anInt8556);
				local208.method8552(631);
				Static571.aClass257_2.method5550(5, local208.aByteArray115);
				Static397.anInt6246++;
				Static261.aLong116 = Static476.method6413();
			}
			if (Static397.anInt6246 == 3) {
				if (Static133.method1838(Static324.anInt5145) || Static571.aClass257_2.method5551() > 0) {
					@Pc(249) int local249 = Static571.aClass257_2.method5544();
					if (local249 != 0) {
						this.method1065(local249);
						return;
					}
					Static397.anInt6246++;
				} else if (Static476.method6413() - Static261.aLong116 > 30000L) {
					this.method1065(1001);
					return;
				}
			}
			if (Static397.anInt6246 == 4) {
				@Pc(298) boolean local298 = Static133.method1838(Static324.anInt5145) || Static602.method8118(Static324.anInt5145) || Static155.method2317(Static324.anInt5145);
				@Pc(301) Class170[] local301 = Static266.method3737();
				@Pc(309) Class2_Sub22 local309 = new Class2_Sub22(local301.length * 4);
				Static571.aClass257_2.method5543(local309.aByteArray115.length, 0, local309.aByteArray115);
				for (@Pc(320) int local320 = 0; local320 < local301.length; local320++) {
					local301[local320].method3736(local309.method8542());
				}
				Static301.aClass104_3.method2232(Static571.aClass257_2, !local298);
				Static571.aClass257_2 = null;
				Static397.anInt6246 = 0;
				Static34.aClass108_2 = null;
			}
		} catch (@Pc(356) IOException local356) {
			this.method1065(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	@Override
	protected void method1057() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1070() {
		if (Static324.anInt5145 == 14) {
			return;
		}
		Static262.anInt5597++;
		if (Static262.anInt5597 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static233.anInt3814 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static244.aRandom3.setSeed((long) Static233.anInt3814);
		}
		if (Static262.anInt5597 % 50 == 0) {
			Static46.anInt977 = Static137.anInt2278;
			Static443.anInt7088 = Static135.anInt2273;
			Static137.anInt2278 = 0;
			Static135.anInt2273 = 0;
		}
		this.method1066();
		if (Static442.aClass87_1 != null) {
			Static442.aClass87_1.method1808();
		}
		Static186.method4312();
		Static517.method7210();
		Static16.aClass167_1.method3547();
		Static507.aClass335_1.method7817();
		if (Static192.aClass95_4 != null) {
			Static192.aClass95_4.method6925((int) Static476.method6413());
		}
		Static453.method6193();
		Static131.anInt10170 = 0;
		Static427.anInt6728 = 0;
		for (@Pc(102) Interface22 local102 = Static16.aClass167_1.method3543(); local102 != null; local102 = Static16.aClass167_1.method3543()) {
			@Pc(108) int local108 = local102.method5225();
			if (local108 == 2 || local108 == 3) {
				@Pc(120) char local120 = local102.method5226();
				if (Static117.method1728() && (local120 == '`' || local120 == '§' || local120 == '²')) {
					if (Static578.method7895()) {
						Static125.method1793();
					} else {
						Static88.method1311();
					}
				} else if (Static427.anInt6728 < 128) {
					Static587.anInterface22Array1[Static427.anInt6728] = local102;
					Static427.anInt6728++;
				}
			} else if (local108 == 0 && Static131.anInt10170 < 75) {
				Static622.anInterface22Array2[Static131.anInt10170] = local102;
				Static131.anInt10170++;
			}
		}
		Static487.anInt8042 = 0;
		for (@Pc(190) Class2_Sub12 local190 = Static507.aClass335_1.method7816(); local190 != null; local190 = Static507.aClass335_1.method7816()) {
			@Pc(196) int local196 = local190.method7241();
			if (local196 == -1) {
				Static156.aClass109_24.method2323(local190);
			} else if (local196 == 6) {
				Static487.anInt8042 += local190.method7236();
			} else if (Static91.method1432(local196)) {
				Static595.aClass109_69.method2323(local190);
				if (Static595.aClass109_69.method2320() > 10) {
					Static595.aClass109_69.method2322();
				}
			}
		}
		if (Static578.method7895()) {
			Static184.method2684();
		}
		if (Static133.method1838(Static324.anInt5145)) {
			Static140.method2129();
			Static266.method3743();
		} else if (Static466.method6313(Static324.anInt5145)) {
			Static363.method4914();
		}
		if (Static602.method8118(Static324.anInt5145) && !Static466.method6313(Static324.anInt5145)) {
			this.method1074();
			Static253.method3516();
			Static234.method8407();
		} else if (Static155.method2317(Static324.anInt5145) && !Static466.method6313(Static324.anInt5145)) {
			this.method1074();
			Static234.method8407();
		} else if (Static324.anInt5145 == 12) {
			Static234.method8407();
		} else if (Static569.method7798(Static324.anInt5145) && !Static466.method6313(Static324.anInt5145)) {
			Static130.method1832();
		} else if (Static324.anInt5145 == 13) {
			Static234.method8407();
			if (Static354.anInt5584 != -3 && Static354.anInt5584 != 2 && Static354.anInt5584 != 15) {
				Static211.method2746(false);
			}
		}
		Static216.method6834(Static192.aClass95_4);
		Static595.aClass109_69.method2322();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1064()) {
			return;
		}
		Static616.aClass326_11 = new Class326();
		Static616.aClass326_11.anInt8758 = Integer.parseInt(this.getParameter("worldid"));
		Static390.aClass326_8 = new Class326();
		Static390.aClass326_8.anInt8758 = Integer.parseInt(this.getParameter("lobbyid"));
		Static390.aClass326_8.aString102 = this.getParameter("lobbyaddress");
		Static451.aClass326_6 = new Class326();
		Static451.aClass326_6.anInt8758 = Integer.parseInt(this.getParameter("demoid"));
		Static451.aClass326_6.aString102 = this.getParameter("demoaddress");
		Static252.aClass80_3 = Static335.method4546(Integer.parseInt(this.getParameter("modewhere")));
		if (Static252.aClass80_3 == Static122.aClass80_1) {
			Static252.aClass80_3 = Static258.aClass80_4;
		} else if (!Static342.method4621(Static252.aClass80_3) && Static162.aClass80_2 != Static252.aClass80_3) {
			Static252.aClass80_3 = Static162.aClass80_2;
		}
		Static298.aClass113_4 = Static124.method1780(Integer.parseInt(this.getParameter("modewhat")));
		if (Static298.aClass113_4 != Static130.aClass113_1 && Static298.aClass113_4 != Static273.aClass113_3 && Static252.aClass113_2 != Static298.aClass113_4) {
			Static298.aClass113_4 = Static252.aClass113_2;
		}
		try {
			Static483.anInt7694 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static483.anInt7694 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static206.aBoolean251 = true;
		} else {
			Static206.aBoolean251 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static418.aBoolean471 = true;
		} else {
			Static418.aBoolean471 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static85.aBoolean497 = true;
		} else {
			Static85.aBoolean497 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static189.aClass375_5 = Static605.aClass375_7;
			} else if (local152.equals("1")) {
				Static189.aClass375_5 = Static25.aClass375_2;
			} else if (local152.equals("2")) {
				Static189.aClass375_5 = Static485.aClass375_6;
			} else if (local152.equals("3")) {
				Static189.aClass375_5 = Static93.aClass375_3;
			}
		}
		try {
			Static380.anInt5916 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static380.anInt5916 = 0;
		}
		Static58.aString12 = this.getParameter("quiturl");
		Static377.aString78 = this.getParameter("settings");
		if (Static377.aString78 == null) {
			Static377.aString78 = "";
		}
		Static340.aBoolean387 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static310.anInt4998 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static310.anInt4998 = 0;
			}
		}
		Static295.anInt4833 = Integer.parseInt(this.getParameter("colourid"));
		if (Static295.anInt4833 < 0 || Static292.aColorArray1.length <= Static295.anInt4833) {
			Static295.anInt4833 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static425.aBoolean495 = true;
			Static296.aBoolean353 = true;
		}
		@Pc(261) String local261 = this.getParameter("frombilling");
		if (local261 != null && local261.equals("true")) {
			Static287.aBoolean327 = true;
		}
		Static435.aString32 = this.getParameter("sskey");
		if (Static435.aString32 != null && Static435.aString32.length() < 2) {
			Static435.aString32 = null;
		}
		@Pc(287) String local287 = this.getParameter("force64mb");
		if (local287 != null && local287.equals("true")) {
			Static540.aBoolean664 = true;
		}
		@Pc(299) String local299 = this.getParameter("worldflags");
		if (local299 != null) {
			try {
				Static534.anInt8759 = Integer.parseInt(local299);
			} catch (@Pc(306) Exception local306) {
			}
		}
		@Pc(311) String local311 = this.getParameter("userFlow");
		if (local311 != null) {
			try {
				Static528.aLong234 = Long.parseLong(local311);
			} catch (@Pc(318) NumberFormatException local318) {
			}
		}
		Static322.aString56 = this.getParameter("additionalInfo");
		if (Static322.aString56 != null && Static322.aString56.length() > 50) {
			Static322.aString56 = null;
		}
		if (Static605.aClass375_7 == Static189.aClass375_5) {
			Static66.anInt10099 = 765;
			Static364.anInt5763 = 503;
		} else if (Static25.aClass375_2 == Static189.aClass375_5) {
			Static364.anInt5763 = 480;
			Static66.anInt10099 = 640;
		}
		Static78.aClient1 = this;
		this.method1055(Static364.anInt5763, Static189.aClass375_5.aString110, Static298.aClass113_4.method2576() + 32, Static66.anInt10099);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1074() {
		@Pc(21) int local21;
		if (Static324.anInt5145 == 7 && Static324.anInt5144 == 0) {
			if (Static363.anInt5740 > 1) {
				Static363.anInt5740--;
				Static369.anInt5832 = Static542.anInt8903;
			}
			if (!Static627.aBoolean736) {
				Static131.method8459();
			}
			for (local21 = 0; local21 < 100 && Static266.method3741(); local21++) {
			}
		}
		Static544.anInt9305++;
		Static70.method970(-1, -1, null);
		Static415.method5565(-1, null, -1);
		Static299.method4132();
		Static542.anInt8903++;
		for (local21 = 0; local21 < Static645.anInt9916; local21++) {
			@Pc(71) Class13_Sub1_Sub1_Sub1_Sub1 local71 = Static38.aClass2_Sub43Array1[local21].aClass13_Sub1_Sub1_Sub1_Sub1_2;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass150_1.aByte46;
				if ((local77 & 0x1) != 0) {
					@Pc(88) int local88 = local71.method3950();
					@Pc(112) int local112;
					if ((local77 & 0x2) != 0 && local71.anInt4639 == 0 && Math.random() * 1000.0D < 10.0D) {
						local112 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(120) int local120 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local112 != 0 || local120 != 0) {
							@Pc(137) int local137 = local71.anIntArray307[0] + local112;
							if (local137 < 0) {
								local137 = 0;
							} else if (Static228.anInt3704 - local88 - 1 < local137) {
								local137 = Static228.anInt3704 - local88 - 1;
							}
							@Pc(165) int local165 = local71.anIntArray306[0] + local120;
							if (local165 < 0) {
								local165 = 0;
							} else if (Static162.anInt2911 - local88 - 1 < local165) {
								local165 = Static162.anInt2911 - local88 - 1;
							}
							@Pc(215) int local215 = Static183.method2679(-1, Static210.anIntArray231, Static75.anIntArray107, local88, local137, true, Static230.aClass240Array1[local71.aByte127], 0, local71.anIntArray307[0], local88, local88, local165, local71.anIntArray306[0], 0);
							if (local215 > 0) {
								if (local215 > 9) {
									local215 = 9;
								}
								for (@Pc(227) int local227 = 0; local227 < local215; local227++) {
									local71.anIntArray307[local227] = Static75.anIntArray107[local215 - local227 - 1];
									local71.anIntArray306[local227] = Static210.anIntArray231[local215 - local227 - 1];
									local71.aByteArray52[local227] = 1;
								}
								local71.anInt4639 = local215;
							}
						}
					}
					Static512.method7195(local71, true);
					local112 = Static308.method4204(local71);
					Static223.method3043(local71);
					Static550.method7574(local112, Static41.anInt827, local71, Static512.anInt8551);
					Static309.method4209(local71, Static512.anInt8551);
					Static339.method4575(local71);
				}
			}
		}
		if (Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
			if (Static445.anInt7122 == 2) {
				Static273.method3798();
			} else {
				Static573.method7859();
			}
			if (Static250.anInt4000 >> 9 < 14 || Static228.anInt3704 - 14 <= Static250.anInt4000 >> 9 || Static644.anInt10376 >> 9 < 14 || Static644.anInt10376 >> 9 >= Static162.anInt2911 - 14) {
				Static642.method8603();
			}
		}
		while (true) {
			@Pc(352) Class2_Sub46 local352;
			@Pc(357) Class261 local357;
			@Pc(365) Class261 local365;
			do {
				local352 = (Class2_Sub46) Static485.aClass109_51.method2322();
				if (local352 == null) {
					while (true) {
						do {
							local352 = (Class2_Sub46) Static79.aClass109_7.method2322();
							if (local352 == null) {
								while (true) {
									do {
										local352 = (Class2_Sub46) Static122.aClass109_13.method2322();
										if (local352 == null) {
											if (Static444.aClass261_9 != null) {
												Static490.method6838();
											}
											if (Static262.anInt5597 % 1500 == 0) {
												Static626.method8392();
											}
											if (Static324.anInt5145 == 7 && Static324.anInt5144 == 0) {
												Static409.method5497();
											}
											Static181.method2638();
											if (Static365.aBoolean427 && Static74.aLong49 < Static476.method6413() - 60000L) {
												Static202.method2859();
											}
											for (@Pc(521) Class13_Sub3_Sub1 local521 = (Class13_Sub3_Sub1) Static121.aClass171_2.method3745(); local521 != null; local521 = (Class13_Sub3_Sub1) Static121.aClass171_2.method3744()) {
												if ((long) local521.anInt1491 < Static476.method6413() / 1000L - 5L) {
													if (local521.aShort25 > 0) {
														Static443.method6042("", 0, "", local521.aString15 + Static434.aClass271_19.method5972(Static483.anInt7694), "", 5);
													}
													if (local521.aShort25 == 0) {
														Static443.method6042("", 0, "", local521.aString15 + Static434.aClass271_20.method5972(Static483.anInt7694), "", 5);
													}
													local521.method8394();
												}
											}
											if (Static324.anInt5145 == 7 && Static324.anInt5144 == 0) {
												if (Static155.aClass121_2 == null) {
													Static211.method2746(false);
													return;
												}
												Static22.anInt550++;
												if (Static22.anInt550 > 50) {
													@Pc(620) Class2_Sub40 local620 = Static464.method6285(Static251.aClass131_1, Static528.aClass179_111);
													Static528.method7295(local620);
												}
												try {
													Static124.method1779();
													return;
												} catch (@Pc(627) IOException local627) {
													Static211.method2746(false);
													return;
												}
											}
											return;
										}
										local357 = local352.aClass261_10;
										if (local357.anInt6629 < 0) {
											break;
										}
										local365 = Static357.method4826(local357.anInt6631);
									} while (local365 == null || local365.aClass261Array2 == null || local357.anInt6629 >= local365.aClass261Array2.length || local365.aClass261Array2[local357.anInt6629] != local357);
									Static300.method4138(local352);
								}
							}
							local357 = local352.aClass261_10;
							if (local357.anInt6629 < 0) {
								break;
							}
							local365 = Static357.method4826(local357.anInt6631);
						} while (local365 == null || local365.aClass261Array2 == null || local357.anInt6629 >= local365.aClass261Array2.length || local357 != local365.aClass261Array2[local357.anInt6629]);
						Static300.method4138(local352);
					}
				}
				local357 = local352.aClass261_10;
				if (local357.anInt6629 < 0) {
					break;
				}
				local365 = Static357.method4826(local357.anInt6631);
			} while (local365 == null || local365.aClass261Array2 == null || local365.aClass261Array2.length <= local357.anInt6629 || local357 != local365.aClass261Array2[local357.anInt6629]);
			Static300.method4138(local352);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1077() {
		if (Static324.anInt5145 == 14) {
			return;
		}
		@Pc(17) long local17 = Static114.method1711() / 1000000L - Static108.aLong59;
		Static108.aLong59 = Static114.method1711() / 1000000L;
		@Pc(25) boolean local25 = Static354.method4749();
		if (local25 && Static446.aBoolean675 && Static123.aClass35_1 != null) {
			Static123.aClass35_1.method2749();
		}
		if (Static320.method4280(Static324.anInt5145)) {
			if (Static67.aLong44 != 0L && Static67.aLong44 < Static476.method6413()) {
				Static424.method5664(false, Static53.anInt1099, Static453.anInt7268, Static626.method8388());
			} else if (!Static192.aClass95_4.method6958() && Static241.aBoolean279) {
				Static467.method6315();
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		if (Static298.aFrame3 == null) {
			@Pc(71) Container local71;
			if (Static202.aFrame2 != null) {
				local71 = Static202.aFrame2;
			} else if (Static617.anApplet2 == null) {
				local71 = Static263.anApplet_Sub1_1;
			} else {
				local71 = Static617.anApplet2;
			}
			local83 = local71.getSize().width;
			local87 = local71.getSize().height;
			if (local71 == Static202.aFrame2) {
				@Pc(93) Insets local93 = Static202.aFrame2.getInsets();
				local87 -= local93.top + local93.bottom;
				local83 -= local93.right + local93.left;
			}
			if (local83 != Static550.anInt9024 || local87 != Static236.anInt3828 || Static555.aBoolean676) {
				if (Static192.aClass95_4 == null || Static192.aClass95_4.method6993()) {
					Static236.method3210();
				} else {
					Static236.anInt3828 = local87;
					Static550.anInt9024 = local83;
				}
				Static67.aLong44 = Static476.method6413() + 500L;
				Static555.aBoolean676 = false;
			}
		}
		if (Static298.aFrame3 != null && !Static223.aBoolean258 && Static320.method4280(Static324.anInt5145)) {
			Static424.method5664(false, -1, -1, Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437());
		}
		@Pc(160) boolean local160 = false;
		if (Static377.aBoolean430) {
			local160 = true;
			Static377.aBoolean430 = false;
		}
		if (local160) {
			Static130.method1828();
		}
		if (Static192.aClass95_4 != null && Static192.aClass95_4.method6958() || Static626.method8388() != 1) {
			Static32.method574();
		}
		if (Static133.method1838(Static324.anInt5145)) {
			Static215.method2967(local160);
		} else if (Static378.method8122(Static324.anInt5145)) {
			Static382.method5118();
		} else if (Static335.method4545(Static324.anInt5145)) {
			Static382.method5118();
		} else if (Static466.method6313(Static324.anInt5145)) {
			if (Static275.anInt4390 == 1) {
				if (Static380.anInt5922 > Static205.anInt6316) {
					Static205.anInt6316 = Static380.anInt5922;
				}
				local83 = (Static205.anInt6316 - Static380.anInt5922) * 50 / Static205.anInt6316;
				Static445.method6068(Static389.aClass256_13, Static434.aClass271_12.method5972(Static483.anInt7694) + "<br>(" + local83 + "%)", Static505.aClass62_21, true, Static192.aClass95_4);
			} else if (Static275.anInt4390 == 2) {
				if (Static483.anInt7695 > Static250.anInt4004) {
					Static250.anInt4004 = Static483.anInt7695;
				}
				local83 = (Static250.anInt4004 - Static483.anInt7695) * 50 / Static250.anInt4004 + 50;
				Static445.method6068(Static389.aClass256_13, Static434.aClass271_12.method5972(Static483.anInt7694) + "<br>(" + local83 + "%)", Static505.aClass62_21, true, Static192.aClass95_4);
			} else {
				Static445.method6068(Static389.aClass256_13, Static434.aClass271_12.method5972(Static483.anInt7694), Static505.aClass62_21, true, Static192.aClass95_4);
			}
		} else if (Static324.anInt5145 == 10) {
			Static476.method6412(local17);
		} else if (Static324.anInt5145 == 13) {
			Static445.method6068(Static389.aClass256_13, Static434.aClass271_14.method5972(Static483.anInt7694) + "<br>" + Static434.aClass271_15.method5972(Static483.anInt7694), Static505.aClass62_21, false, Static192.aClass95_4);
		}
		if (Static205.anInt6319 == 3) {
			for (local83 = 0; local83 < Static385.anInt6044; local83++) {
				@Pc(362) Rectangle local362 = Class2_Sub2_Sub10.aRectangleArray1[local83];
				if (Static556.aBooleanArray182[local83]) {
					Static192.aClass95_4.method6989(local362.x, -65281, local362.height, local362.y, local362.width);
				} else if (Static498.aBooleanArray144[local83]) {
					Static192.aClass95_4.method6989(local362.x, -65536, local362.height, local362.y, local362.width);
				} else {
					Static192.aClass95_4.method6989(local362.x, -16711936, local362.height, local362.y, local362.width);
				}
			}
		}
		if (Static578.method7895()) {
			Static207.method2929(Static192.aClass95_4);
		}
		if (Static452.aClass226_6.aBoolean415 && Static320.method4280(Static324.anInt5145) && Static205.anInt6319 == 0 && Static626.method8388() == 1 && !local160) {
			local83 = 0;
			for (local87 = 0; local87 < Static385.anInt6044; local87++) {
				if (Static498.aBooleanArray144[local87]) {
					Static498.aBooleanArray144[local87] = false;
					Static419.aRectangleArray2[local83++] = Class2_Sub2_Sub10.aRectangleArray1[local87];
				}
			}
			try {
				if (Static319.aBoolean356) {
					Static599.method8098(local83, Static419.aRectangleArray2);
				} else {
					Static192.aClass95_4.method6931(Static419.aRectangleArray2, local83);
				}
			} catch (@Pc(532) Exception_Sub1 local532) {
			}
		} else if (!Static133.method1838(Static324.anInt5145)) {
			for (local83 = 0; local83 < Static385.anInt6044; local83++) {
				Static498.aBooleanArray144[local83] = false;
			}
			try {
				if (Static319.aBoolean356) {
					Static211.method2745();
				} else {
					Static192.aClass95_4.method6975();
				}
			} catch (@Pc(470) Exception_Sub1 local470) {
				Static163.method2447(local470, local470.getMessage() + " (Recovered) " + this.method1051());
				Static317.method4257(false, 0);
			}
		}
		Static293.method4049();
		local83 = Static234.aClass2_Sub5_48.aClass6_Sub20_1.method7255();
		if (local83 == 0) {
			Static444.method6061(15L);
		} else if (local83 == 1) {
			Static444.method6061(10L);
		} else if (local83 == 2) {
			Static444.method6061(5L);
		} else if (local83 == 3) {
			Static444.method6061(2L);
		}
		if (Static171.aBoolean225) {
			Static309.method4210();
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub29_1.method8579() == 1 && Static324.anInt5145 == 3 && Static38.anInt777 != -1) {
			Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub29_1);
			Static329.method4407();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1054() {
		if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != 2) {
			this.method1070();
			return;
		}
		try {
			this.method1070();
		} catch (@Pc(20) ThreadDeath local20) {
			throw local20;
		} catch (@Pc(23) Throwable local23) {
			Static163.method2447(local23, local23.getMessage() + " (Recovered) " + this.method1051());
			Static317.method4257(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1051() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static132.anInt2246 + "," + Static123.anInt2176 + "," + Static228.anInt3704 + "," + Static162.anInt2911 + "|";
			if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 != null) {
				local7 = local7 + "2)" + Static91.anInt1705 + "," + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] + Static132.anInt2246) + "," + (Static123.anInt2176 + Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0]) + "|";
			}
			local7 = local7 + "3)" + Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() + "|4)" + Static234.aClass2_Sub5_48.aClass6_Sub11_1.method3433() + "|5)" + Static626.method8388() + "|6)" + Static511.anInt8548 + "," + Static153.anInt2747 + "|";
			local7 = local7 + "7)" + Static234.aClass2_Sub5_48.aClass6_Sub17_1.method4403() + "|";
			local7 = local7 + "8)" + Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575() + "|";
			local7 = local7 + "9)" + Static234.aClass2_Sub5_48.aClass6_Sub15_1.method4218() + "|";
			local7 = local7 + "10)" + Static234.aClass2_Sub5_48.aClass6_Sub25_1.method8110() + "|";
			local7 = local7 + "11)" + Static234.aClass2_Sub5_48.aClass6_Sub8_1.method2927() + "|";
			local7 = local7 + "12)" + Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() + "|";
			local7 = local7 + "13)" + Static234.anInt10094 + "|";
			local7 = local7 + "14)" + Static324.anInt5145;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(239) Throwable local239) {
			}
			try {
				if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 2) {
					@Pc(248) Class local248 = Class.forName("java.lang.ClassLoader");
					@Pc(252) Field local252 = local248.getDeclaredField("nativeLibraries");
					@Pc(255) Class local255 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(265) Method local265 = local255.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local265.invoke(local252, Boolean.TRUE);
					@Pc(288) Vector local288 = (Vector) local252.get(client.class.getClassLoader());
					for (@Pc(290) int local290 = 0; local288.size() > local290; local290++) {
						try {
							@Pc(296) Object local296 = local288.elementAt(local290);
							@Pc(301) Field local301 = local296.getClass().getDeclaredField("name");
							local265.invoke(local301, Boolean.TRUE);
							try {
								@Pc(316) String local316 = (String) local301.get(local296);
								if (local316 != null && local316.indexOf("sw3d.dll") != -1) {
									@Pc(329) Field local329 = local296.getClass().getDeclaredField("handle");
									local265.invoke(local329, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local329.getLong(local296));
									local265.invoke(local329, Boolean.FALSE);
								}
							} catch (@Pc(365) Throwable local365) {
							}
							local265.invoke(local301, Boolean.FALSE);
						} catch (@Pc(377) Throwable local377) {
						}
					}
				}
			} catch (@Pc(385) Throwable local385) {
			}
			local7 = local7 + "]";
		} catch (@Pc(396) Throwable local396) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1052() {
		if (Static540.aBoolean664) {
			Static234.anInt10094 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static236.method3210();
		Static522.aClass376_3 = new Class376(Static452.aClass226_6);
		Static301.aClass104_3 = new Class104();
		Static49.method7191(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static252.aClass80_3 != Static162.aClass80_2) {
			Static565.aByteArrayArray30 = new byte[50][];
		}
		Static234.aClass2_Sub5_48 = Static441.method5556();
		if (Static252.aClass80_3 == Static162.aClass80_2) {
			Static616.aClass326_11.aString102 = this.getCodeBase().getHost();
		} else if (Static342.method4621(Static252.aClass80_3)) {
			Static616.aClass326_11.aString102 = this.getCodeBase().getHost();
			Static616.aClass326_11.anInt8764 = Static616.aClass326_11.anInt8758 + 40000;
			Static390.aClass326_8.anInt8764 = Static390.aClass326_8.anInt8758 + 40000;
			Static616.aClass326_11.anInt8760 = Static616.aClass326_11.anInt8758 + 50000;
			Static451.aClass326_6.anInt8764 = Static451.aClass326_6.anInt8758 + 40000;
			Static390.aClass326_8.anInt8760 = Static390.aClass326_8.anInt8758 + 50000;
			Static451.aClass326_6.anInt8760 = Static451.aClass326_6.anInt8758 + 50000;
		} else if (Static252.aClass80_3 == Static122.aClass80_1) {
			Static616.aClass326_11.aString102 = "127.0.0.1";
			Static390.aClass326_8.aString102 = "127.0.0.1";
			Static616.aClass326_11.anInt8764 = Static616.aClass326_11.anInt8758 + 40000;
			Static451.aClass326_6.aString102 = "127.0.0.1";
			Static390.aClass326_8.anInt8764 = Static390.aClass326_8.anInt8758 + 40000;
			Static451.aClass326_6.anInt8764 = Static451.aClass326_6.anInt8758 + 40000;
			Static616.aClass326_11.anInt8760 = Static616.aClass326_11.anInt8758 + 50000;
			Static390.aClass326_8.anInt8760 = Static390.aClass326_8.anInt8758 + 50000;
			Static451.aClass326_6.anInt8760 = Static451.aClass326_6.anInt8758 + 50000;
		}
		if (Static189.aClass375_5 == Static605.aClass375_7) {
			Static265.aBoolean291 = false;
		}
		Static216.aClass326_9 = Static616.aClass326_11;
		Static448.aShortArray92 = Static53.aShortArray21 = Static572.aShortArray138 = Static616.aShortArray146 = new short[256];
		if (Static25.aClass375_2 == Static189.aClass375_5) {
			Static100.aShortArrayArrayArray5 = Static553.aShortArrayArrayArray9;
			Static507.anInt8422 = 16777215;
			Static341.aBoolean388 = true;
			Static433.anInt7009 = 0;
			Static375.aShortArrayArray23 = Static139.aShortArrayArray21;
		} else if (Static93.aClass375_3 == Static189.aClass375_5) {
			Static100.aShortArrayArrayArray5 = Static337.aShortArrayArrayArray8;
			Static375.aShortArrayArray23 = Static340.aShortArrayArray22;
		} else {
			Static100.aShortArrayArrayArray5 = Static120.aShortArrayArrayArray7;
			Static375.aShortArrayArray23 = Static114.aShortArrayArray17;
		}
		try {
			Static486.aClipboard1 = Static78.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(223) Exception local223) {
		}
		Static16.aClass167_1 = Static249.method3416(Static504.aCanvas11);
		Static507.aClass335_1 = Static195.method2800(Static504.aCanvas11);
		try {
			if (Static452.aClass226_6.aClass92_3 != null) {
				Static25.aClass254_1 = new Class254(Static452.aClass226_6.aClass92_3, 5200, 0);
				for (@Pc(245) int local245 = 0; local245 < 37; local245++) {
					Static167.aClass254Array1[local245] = new Class254(Static452.aClass226_6.aClass92Array1[local245], 6000, 0);
				}
				Static216.aClass254_10 = new Class254(Static452.aClass226_6.aClass92_1, 6000, 0);
				Static323.aClass135_4 = new Class135(255, Static25.aClass254_1, Static216.aClass254_10, 500000);
				Static363.aClass254_9 = new Class254(Static452.aClass226_6.aClass92_2, 24, 0);
				Static452.aClass226_6.aClass92Array1 = null;
				Static452.aClass226_6.aClass92_3 = null;
				Static452.aClass226_6.aClass92_1 = null;
				Static452.aClass226_6.aClass92_2 = null;
			}
		} catch (@Pc(301) IOException local301) {
			Static25.aClass254_1 = null;
			Static216.aClass254_10 = null;
			Static363.aClass254_9 = null;
			Static323.aClass135_4 = null;
		}
		if (Static162.aClass80_2 != Static252.aClass80_3) {
			Static80.aBoolean117 = true;
		}
		Static367.aString75 = Static434.aClass271_12.method5972(Static483.anInt7694);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	public synchronized void method1056() {
		if (Static617.anApplet2 != null && Static504.aCanvas11 == null && !Static452.aClass226_6.aBoolean415) {
			try {
				@Pc(13) Class local13 = Static617.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static504.aCanvas11 = (Canvas) local17.get(Static617.anApplet2);
				local17.set(Static617.anApplet2, null);
				if (Static504.aCanvas11 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1056();
	}
}
