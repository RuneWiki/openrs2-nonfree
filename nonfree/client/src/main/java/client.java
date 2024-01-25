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
				Static11.method5112("argument count");
			}
			Static321.anInt6393 = Integer.parseInt(arg0[0]);
			Static217.anInt951 = 2;
			if (arg0[1].equals("live")) {
				Static254.anInt5234 = 0;
			} else if (arg0[1].equals("rc")) {
				Static254.anInt5234 = 1;
			} else if (arg0[1].equals("wip")) {
				Static254.anInt5234 = 2;
			} else {
				Static11.method5112("modewhat");
			}
			Static331.anInt3763 = Static92.method1455(arg0[2]);
			if (Static331.anInt3763 == -1) {
				if (arg0[2].equals("english")) {
					Static331.anInt3763 = 0;
				} else if (arg0[2].equals("german")) {
					Static331.anInt3763 = 1;
				} else {
					Static11.method5112("language");
				}
			}
			Static208.method3731(Static331.anInt3763);
			Static182.aBoolean289 = false;
			Static129.aBoolean209 = false;
			if (arg0[3].equals("game0")) {
				Class10_Sub1_Sub1.lb = 0;
			} else if (arg0[3].equals("game1")) {
				Class10_Sub1_Sub1.lb = 1;
			} else {
				Static11.method5112("game");
			}
			Static76.anInt1569 = 0;
			Static235.anInt6127 = Class10_Sub1_Sub1.lb;
			Static172.anInt3639 = 0;
			Static59.aString51 = "";
			@Pc(125) client local125 = new client();
			Static71.aClient1 = local125;
			local125.method829(Static254.anInt5234 + 32, Class10_Sub1_Sub1.lb == 1 ? "stellardawn" : "runescape");
			Static333.aFrame2.setLocation(40, 40);
		} catch (@Pc(153) Exception local153) {
			Static268.method4816(null, local153);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method841() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method828() {
		if (Static261.anInt5376 == 1000) {
			return;
		}
		Static282.anInt3516++;
		if (Static282.anInt3516 % 1000 == 1) {
			@Pc(28) GregorianCalendar local28 = new GregorianCalendar();
			Static272.anInt5035 = local28.get(11) * 600 + local28.get(12) * 10 + local28.get(13) / 6;
			Static100.aRandom1.setSeed((long) Static272.anInt5035);
		}
		this.method849();
		if (Static85.aClass204_1 != null) {
			Static85.aClass204_1.method5505();
		}
		Static120.method1955();
		Static310.method5336();
		Static166.method2925();
		Static191.method3368();
		if (Static217.aClass105_5 != null) {
			Static217.aClass105_5.method4290((int) Static292.method5114());
		}
		if (Static212.aClass24_1 != null) {
			@Pc(80) int local80 = Static212.aClass24_1.method442();
			Static94.anInt1786 = local80;
		}
		Static57.method1116();
		if (Static261.anInt5376 == 0) {
			this.method854();
			Static228.method4127();
		} else if (Static261.anInt5376 == 5) {
			this.method854();
			Static228.method4127();
		} else if (Static261.anInt5376 == 25 || Static261.anInt5376 == 28) {
			Static58.method1136();
		}
		if (Static261.anInt5376 == 10) {
			this.method851();
			Static20.method355();
			Static101.method1596();
			Static102.method1604();
		} else if (Static261.anInt5376 == 30) {
			Static140.method2317();
		} else if (Static261.anInt5376 == 40) {
			Static102.method1604();
			if (Static6.anInt4143 != -3) {
				if (Static6.anInt4143 == 15) {
					Static24.method402();
				} else if (Static6.anInt4143 != 2) {
					Static324.method5503();
				}
			}
		}
		Static154.method2692(Static217.aClass105_5);
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method825()) {
			return;
		}
		Static321.anInt6393 = Integer.parseInt(this.getParameter("worldid"));
		Static217.anInt951 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static217.anInt951 < 0 || Static217.anInt951 > 1) {
			Static217.anInt951 = 0;
		}
		Static254.anInt5234 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static254.anInt5234 < 0 || Static254.anInt5234 > 2) {
			Static254.anInt5234 = 0;
		}
		try {
			Static331.anInt3763 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(51) Exception local51) {
			Static331.anInt3763 = 0;
		}
		Static208.method3731(Static331.anInt3763);
		@Pc(60) String local60 = this.getParameter("objecttag");
		if (local60 != null && local60.equals("1")) {
			Static182.aBoolean289 = true;
		} else {
			Static182.aBoolean289 = false;
		}
		@Pc(76) String local76 = this.getParameter("js");
		if (local76 != null && local76.equals("1")) {
			Static129.aBoolean209 = true;
		} else {
			Static129.aBoolean209 = false;
		}
		@Pc(92) String local92 = this.getParameter("game");
		if (local92 != null && local92.equals("1")) {
			Class10_Sub1_Sub1.lb = 1;
		} else {
			Class10_Sub1_Sub1.lb = 0;
		}
		try {
			Static76.anInt1569 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(111) Exception local111) {
			Static76.anInt1569 = 0;
		}
		Static114.aString85 = this.getParameter("quiturl");
		Static59.aString51 = this.getParameter("settings");
		if (Static59.aString51 == null) {
			Static59.aString51 = "";
		}
		@Pc(129) String local129 = this.getParameter("country");
		if (local129 != null) {
			try {
				Static172.anInt3639 = Integer.parseInt(local129);
			} catch (@Pc(136) Exception local136) {
				Static172.anInt3639 = 0;
			}
		}
		Static235.anInt6127 = Integer.parseInt(this.getParameter("colourid"));
		if (Static235.anInt6127 < 0 || Static182.aColorArray3.length <= Static235.anInt6127) {
			Static235.anInt6127 = 0;
		}
		Static71.aClient1 = this;
		this.method820(Static254.anInt5234 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method847(@OriginalArg(0) int arg0) {
		Static114.aClass154_1.anInt4731 = arg0;
		Static5.aClass193_1 = null;
		Static165.anInt3419 = 0;
		Static114.aClass154_1.anInt4730++;
		Static245.aClass202_2 = null;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method848() {
		if (Static8.anInt109 < Static114.aClass154_1.anInt4730) {
			if (Static29.anInt544 == Static214.anInt4553) {
				Static29.anInt544 = Static149.anInt3069;
			} else {
				Static29.anInt544 = Static214.anInt4553;
			}
			Static314.anInt6237 = (Static114.aClass154_1.anInt4730 - 1) * 50 * 5;
			if (Static314.anInt6237 > 3000) {
				Static314.anInt6237 = 3000;
			}
			if (Static114.aClass154_1.anInt4730 >= 2 && Static114.aClass154_1.anInt4731 == 6) {
				this.method836("js5connect_outofdate");
				Static261.anInt5376 = 1000;
				return;
			}
			if (Static114.aClass154_1.anInt4730 >= 4 && Static114.aClass154_1.anInt4731 == -1) {
				this.method836("js5crc");
				Static261.anInt5376 = 1000;
				return;
			}
			if (Static114.aClass154_1.anInt4730 >= 4 && (Static261.anInt5376 == 0 || Static261.anInt5376 == 5)) {
				if (Static114.aClass154_1.anInt4731 == 7 || Static114.aClass154_1.anInt4731 == 9) {
					this.method836("js5connect_full");
				} else if (Static114.aClass154_1.anInt4731 <= 0) {
					this.method836("js5io");
				} else {
					this.method836("js5connect");
				}
				Static261.anInt5376 = 1000;
				return;
			}
		}
		Static8.anInt109 = Static114.aClass154_1.anInt4730;
		if (Static314.anInt6237 > 0) {
			Static314.anInt6237--;
			return;
		}
		try {
			if (Static165.anInt3419 == 0) {
				Static5.aClass193_1 = Static197.aClass215_5.method5673(Static29.anInt544, Static351.aString149);
				Static165.anInt3419++;
			}
			if (Static165.anInt3419 == 1) {
				if (Static5.aClass193_1.anInt5986 == 2) {
					this.method847(1000);
					return;
				}
				if (Static5.aClass193_1.anInt5986 == 1) {
					Static165.anInt3419++;
				}
			}
			if (Static165.anInt3419 == 2) {
				Static245.aClass202_2 = new Class202((Socket) Static5.aClass193_1.anObject7, Static197.aClass215_5);
				@Pc(177) Class1_Sub21 local177 = new Class1_Sub21(5);
				local177.method5718(15);
				local177.method5702(561);
				Static245.aClass202_2.method5480(5, local177.aByteArray82);
				Static165.anInt3419++;
				Static105.aLong44 = Static292.method5114();
			}
			if (Static165.anInt3419 == 3) {
				if (Static261.anInt5376 == 0 || Static261.anInt5376 == 5 || Static245.aClass202_2.method5473() > 0) {
					@Pc(237) int local237 = Static245.aClass202_2.method5478();
					if (local237 != 0) {
						this.method847(local237);
						return;
					}
					Static165.anInt3419++;
				} else if (Static292.method5114() - Static105.aLong44 > 30000L) {
					this.method847(1001);
					return;
				}
			}
			if (Static165.anInt3419 == 4) {
				@Pc(267) boolean local267 = Static261.anInt5376 == 5 || Static261.anInt5376 == 10 || Static261.anInt5376 == 28;
				Static114.aClass154_1.method4096(Static245.aClass202_2, !local267);
				Static165.anInt3419 = 0;
				Static245.aClass202_2 = null;
				Static5.aClass193_1 = null;
			}
		} catch (@Pc(284) IOException local284) {
			this.method847(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method849() {
		@Pc(7) boolean local7 = Static114.aClass154_1.method4105();
		if (!local7) {
			this.method848();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method833() {
		if (Static261.anInt5376 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static244.method5350() / 1000000L - Static210.aLong126;
		Static210.aLong126 = Static244.method5350() / 1000000L;
		@Pc(26) boolean local26 = Static207.method3708();
		if (local26 && Static92.aBoolean123 && Static205.aClass125_1 != null) {
			Static205.aClass125_1.method5305();
		}
		if (Static261.anInt5376 == 30 || Static261.anInt5376 == 10) {
			if (Static119.aLong56 != 0L && Static292.method5114() > Static119.aLong56) {
				Static146.method4165(Static151.method2632(), false, Static147.anInt3045, Static18.anInt358);
			} else if (Static217.aClass105_5.method4285() && Static337.aBoolean537) {
				Static124.method1994();
			}
		}
		@Pc(98) int local98;
		@Pc(102) int local102;
		if (Static291.aFrame1 == null) {
			@Pc(90) Container local90;
			if (Static333.aFrame2 == null) {
				local90 = Static197.aClass215_5.anApplet1;
			} else {
				local90 = Static333.aFrame2;
			}
			local98 = local90.getSize().width;
			local102 = local90.getSize().height;
			if (Static333.aFrame2 == local90) {
				@Pc(108) Insets local108 = Static333.aFrame2.getInsets();
				local98 -= local108.right + local108.left;
				local102 -= local108.bottom + local108.top;
			}
			if (local98 != Static350.anInt4382 || Static132.anInt6775 != local102) {
				if (Static217.aClass105_5 == null || Static217.aClass105_5.method4254()) {
					Static348.method5331();
				} else {
					Static132.anInt6775 = local102;
					Static350.anInt4382 = local98;
				}
				Static119.aLong56 = Static292.method5114() + 500L;
			}
		}
		if (Static291.aFrame1 != null && !Static167.aBoolean266 && (Static261.anInt5376 == 30 || Static261.anInt5376 == 10)) {
			Static146.method4165(Static25.anInt449, false, -1, -1);
		}
		@Pc(176) boolean local176 = false;
		if (Static306.aBoolean506) {
			Static306.aBoolean506 = false;
			local176 = true;
		}
		if (local176) {
			Static129.method2096();
		}
		if (Static217.aClass105_5 != null && Static217.aClass105_5.method4274() || Static151.method2632() != 1) {
			Static74.method1295();
		}
		if (Static261.anInt5376 == 0) {
			Static278.method4959(Static185.anInt3839, Static159.aString248, Static75.aColorArray2[Static235.anInt6127], Static58.aColorArray1[Static235.anInt6127], local176, Static182.aColorArray3[Static235.anInt6127]);
		} else if (Static261.anInt5376 == 5) {
			Static126.method2006(Static217.aClass105_5, Static58.aColorArray1[Static235.anInt6127].getRGB(), local176 | Static217.aClass105_5.method4274(), Static286.aClass29_3, Static75.aColorArray2[Static235.anInt6127].getRGB(), Static182.aColorArray3[Static235.anInt6127].getRGB());
		} else if (Static261.anInt5376 == 10) {
			Static5.method36();
		} else if (Static261.anInt5376 == 25 || Static261.anInt5376 == 28) {
			if (Static38.anInt3166 == 1) {
				if (Static37.anInt997 > Static203.anInt4294) {
					Static203.anInt4294 = Static37.anInt997;
				}
				local98 = (Static203.anInt4294 - Static37.anInt997) * 50 / Static203.anInt4294;
				Static159.method5486(true, Static101.aString78 + "<br>(" + local98 + "%)", Static233.aClass29_2);
			} else if (Static38.anInt3166 == 2) {
				if (Static293.anInt5898 < Static73.anInt957) {
					Static293.anInt5898 = Static73.anInt957;
				}
				local98 = (Static293.anInt5898 - Static73.anInt957) * 50 / Static293.anInt5898 + 50;
				Static159.method5486(true, Static101.aString78 + "<br>(" + local98 + "%)", Static233.aClass29_2);
			} else {
				Static159.method5486(true, Static101.aString78, Static233.aClass29_2);
			}
		} else if (Static261.anInt5376 == 30) {
			Static229.method4153(local18);
		} else if (Static261.anInt5376 == 40) {
			Static159.method5486(true, Static259.aString205 + "<br>" + Static50.aString43, Static233.aClass29_2);
		}
		if (Static235.anInt6130 == 3) {
			for (local98 = 0; local98 < Static344.anInt6649; local98++) {
				@Pc(381) Rectangle local381 = Class1_Sub5_Sub21.aRectangleArray4[local98];
				if (Static75.aBooleanArray6[local98]) {
					Static217.aClass105_5.method4225(local381.height, -1996553985, local381.width, local381.x, local381.y);
				} else if (Static78.aBooleanArray7[local98]) {
					Static217.aClass105_5.method4225(local381.height, -1996554240, local381.width, local381.x, local381.y);
				}
			}
		}
		if (Static256.method4565()) {
			Static262.method1691(Static217.aClass105_5);
		}
		if ((Static261.anInt5376 == 30 || Static261.anInt5376 == 10) && Static235.anInt6130 == 0 && Static151.method2632() == 1 && !local176 && Static343.aString267.equals("1.1")) {
			local98 = 0;
			for (local102 = 0; local102 < Static344.anInt6649; local102++) {
				if (Static78.aBooleanArray7[local102]) {
					Static78.aBooleanArray7[local102] = false;
					Static132.aRectangleArray7[local98++] = Class1_Sub5_Sub21.aRectangleArray4[local102];
				}
			}
			Static217.aClass105_5.method4261(Static132.aRectangleArray7, local98);
		} else if (Static261.anInt5376 != 0) {
			Static217.aClass105_5.method4245();
			for (local98 = 0; local98 < Static344.anInt6649; local98++) {
				Static78.aBooleanArray7[local98] = false;
			}
		}
		if (Static98.aBoolean153) {
			Static119.method1930();
		}
		if (Static5.aBoolean10 && Static261.anInt5376 == 10 && Static129.anInt2569 != -1) {
			Static5.aBoolean10 = false;
			Static100.method1593(Static197.aClass215_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method838() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static348.method5331();
		Static153.aClass178_1 = new Class178(Static197.aClass215_5);
		Static114.aClass154_1 = new Class154();
		if (Static254.anInt5234 != 0) {
			Static172.aByteArrayArray11 = new byte[50][];
		}
		Static120.method1953(Static197.aClass215_5);
		if (Static217.anInt951 == 0) {
			Static30.aString23 = this.getCodeBase().getHost();
			Static325.anInt2760 = 443;
			Static57.anInt1356 = 43594;
		} else if (Static217.anInt951 == 1) {
			Static30.aString23 = this.getCodeBase().getHost();
			Static57.anInt1356 = Static321.anInt6393 + 40000;
			Static325.anInt2760 = Static321.anInt6393 + 50000;
		} else if (Static217.anInt951 == 2) {
			Static325.anInt2760 = Static321.anInt6393 + 50000;
			Static57.anInt1356 = Static321.anInt6393 + 40000;
			Static30.aString23 = "127.0.0.1";
		}
		Static351.aString149 = Static30.aString23;
		Static214.anInt4553 = Static57.anInt1356;
		Static149.anInt3069 = Static325.anInt2760;
		Static233.anInt4834 = Static57.anInt1356;
		if (Static343.anInt6573 == 3) {
			Static35.anInt877 = Static321.anInt6393;
		}
		if (Class10_Sub1_Sub1.lb == 1) {
			Static238.aShortArray66 = Static268.aShortArray88;
			Static290.aBoolean485 = true;
			Static331.anInt3765 = 16777215;
			Static325.aShortArray47 = Static236.aShortArray61;
			Static259.aShortArrayArray11 = Static73.aShortArrayArray2;
			Static8.anInt112 = 0;
			Static262.aShortArrayArray5 = Static325.aShortArrayArray9;
		} else {
			Static259.aShortArrayArray11 = Static325.aShortArrayArray8;
			Static238.aShortArray66 = Static288.aShortArray100;
			Static325.aShortArray47 = Static189.aShortArray102;
			Static262.aShortArrayArray5 = Static91.aShortArrayArray3;
		}
		Static29.anInt544 = Static233.anInt4834;
		Static294.aShortArray101 = Static97.aShortArray13 = Static264.aShortArray87 = Static203.aShortArray59 = new short[256];
		Static78.method1312();
		Static326.method4952(Static235.aCanvas6);
		Static71.method1255(Static235.aCanvas6);
		Static212.aClass24_1 = Static60.method1144();
		if (Static212.aClass24_1 != null) {
			Static212.aClass24_1.method444(Static235.aCanvas6);
		}
		Static61.anInt1414 = Static343.anInt6573;
		try {
			if (Static197.aClass215_5.aClass108_3 != null) {
				Static35.aClass171_2 = new Class171(Static197.aClass215_5.aClass108_3, 5200, 0);
				for (@Pc(169) int local169 = 0; local169 < 29; local169++) {
					Static348.aClass171Array3[local169] = new Class171(Static197.aClass215_5.aClass108Array1[local169], 6000, 0);
				}
				Static159.aClass171_4 = new Class171(Static197.aClass215_5.aClass108_2, 6000, 0);
				Static323.aClass203_11 = new Class203(255, Static35.aClass171_2, Static159.aClass171_4, 500000);
				Static8.aClass171_1 = new Class171(Static197.aClass215_5.aClass108_4, 24, 0);
				Static197.aClass215_5.aClass108_2 = null;
				Static197.aClass215_5.aClass108_3 = null;
				Static197.aClass215_5.aClass108_4 = null;
				Static197.aClass215_5.aClass108Array1 = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static35.aClass171_2 = null;
			Static159.aClass171_4 = null;
			Static323.aClass203_11 = null;
			Static8.aClass171_1 = null;
		}
		if (Class10_Sub1_Sub1.lb == 0) {
			Static281.aString222 = Static250.aString198;
		} else if (Class10_Sub1_Sub1.lb == 1) {
			Static281.aString222 = Static15.aString10;
		}
		if (Static217.anInt951 != 0) {
			Static248.aBoolean4 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method851() {
		Static102.anInt1950 = 0;
		while (Static283.method4992() && Static102.anInt1950 < 128) {
			if (!Static134.method2266() || Static276.aChar4 != '`' && Static276.aChar4 != '§') {
				Static43.anIntArray67[Static102.anInt1950] = Static136.anInt2694;
				Static12.anIntArray9[Static102.anInt1950] = Static276.aChar4;
				Static102.anInt1950++;
			} else if (Static256.method4565()) {
				Static86.method1389();
			} else {
				Static92.method1451();
			}
		}
		if (Static256.method4565()) {
			Static172.method3083();
		}
		Static41.anInt1126++;
		Static63.method2281(null, -1, -1);
		Static237.method4325(null, -1, -1);
		if (Static129.anInt2569 != -1) {
			Static291.method5101(0, 0, 0, Static129.anInt2569, Static26.anInt476, Static321.anInt6388, 0);
		}
		Static244.anInt6207++;
		for (@Pc(87) int local87 = 0; local87 < 32768; local87++) {
			@Pc(93) Class10_Sub1_Sub2_Sub1 local93 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local87];
			if (local93 != null) {
				@Pc(99) byte local99 = local93.aClass60_1.aByte15;
				if ((local99 & 0x1) != 0) {
					@Pc(110) int local110 = local93.method3402();
					@Pc(137) int local137;
					if ((local99 & 0x2) != 0 && local93.anInt4088 == 0 && Math.random() * 1000.0D < 10.0D) {
						local137 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(145) int local145 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local137 != 0 || local145 != 0) {
							@Pc(159) int local159 = local137 + local93.anIntArray387[0];
							if (local159 < 0) {
								local159 = 0;
							} else if (local159 > Static43.anInt1151 - local110 - 1) {
								local159 = Static43.anInt1151 - local110 - 1;
							}
							@Pc(194) int local194 = local145 + local93.anIntArray388[0];
							if (local194 < 0) {
								local194 = 0;
							} else if (Static260.anInt5348 - local110 - 1 < local194) {
								local194 = Static260.anInt5348 - local110 - 1;
							}
							@Pc(244) int local244 = Static162.method2854(Static41.anIntArray62, local110, local194, 0, true, local110, local110, local93.anIntArray387[0], Static313.aClass17Array1[local93.aByte73], Static96.anIntArray154, 0, -1, local159, local93.anIntArray388[0]);
							if (local244 > 0) {
								if (local244 > 9) {
									local244 = 9;
								}
								for (@Pc(255) int local255 = 0; local255 < local244; local255++) {
									local93.anIntArray387[local255] = Static96.anIntArray154[local244 - local255 - 1];
									local93.anIntArray388[local255] = Static41.anIntArray62[local244 - local255 - 1];
									local93.aByteArray46[local255] = 1;
								}
								local93.anInt4088 = local244;
							}
						}
					}
					Static49.method4615(true, local93);
					local137 = Static308.method5235(local93);
					Static355.method5866(local137, Static294.anInt5915, local93, Static189.anInt6106);
					Static203.method3688(local93);
				}
			}
		}
		if (Static302.anInt6039 == 0 && Static51.anInt1261 == 0) {
			if (Static246.anInt5156 == 2) {
				Static86.method1392();
			} else {
				Static355.method5867();
			}
			if (Static4.anInt41 >> 7 < 14 || Static43.anInt1151 - 14 <= Static4.anInt41 >> 7 || Static177.anInt3734 >> 7 < 14 || Static177.anInt3734 >> 7 >= Static260.anInt5348 - 14) {
				Static152.method2657();
			}
		}
		while (true) {
			@Pc(366) Class1_Sub8 local366;
			@Pc(371) Class163 local371;
			@Pc(379) Class163 local379;
			do {
				local366 = (Class1_Sub8) Static229.aClass14_23.method310();
				if (local366 == null) {
					while (true) {
						do {
							local366 = (Class1_Sub8) Static276.aClass14_30.method310();
							if (local366 == null) {
								while (true) {
									do {
										local366 = (Class1_Sub8) Static339.aClass14_37.method310();
										if (local366 == null) {
											if (Static157.aClass163_11 != null) {
												Static344.method5754();
											}
											if (Static282.anInt3516 % 1500 == 0) {
												Static73.method746();
											}
											Static28.method487();
											if (Static216.aBoolean367 && Static292.method5114() - 60000L > Static222.aLong137) {
												Static250.method4491();
												return;
											}
											return;
										}
										local371 = local366.aClass163_3;
										if (local371.anInt4923 < 0) {
											break;
										}
										local379 = Static248.method22(local371.anInt4918);
									} while (local379 == null || local379.aClass163Array3 == null || local379.aClass163Array3.length <= local371.anInt4923 || local371 != local379.aClass163Array3[local371.anInt4923]);
									Static122.method1972(local366);
								}
							}
							local371 = local366.aClass163_3;
							if (local371.anInt4923 < 0) {
								break;
							}
							local379 = Static248.method22(local371.anInt4918);
						} while (local379 == null || local379.aClass163Array3 == null || local379.aClass163Array3.length <= local371.anInt4923 || local371 != local379.aClass163Array3[local371.anInt4923]);
						Static122.method1972(local366);
					}
				}
				local371 = local366.aClass163_3;
				if (local371.anInt4923 < 0) {
					break;
				}
				local379 = Static248.method22(local371.anInt4918);
			} while (local379 == null || local379.aClass163Array3 == null || local379.aClass163Array3.length <= local371.anInt4923 || local371 != local379.aClass163Array3[local371.anInt4923]);
			Static122.method1972(local366);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method854() {
		if (!Static5.aBoolean10) {
			label222: while (true) {
				do {
					if (!Static283.method4992()) {
						break label222;
					}
				} while (Static276.aChar4 != 's' && Static276.aChar4 != 'S');
				Static5.aBoolean10 = true;
			}
		}
		@Pc(45) int local45;
		if (Static321.anInt6391 == 0) {
			@Pc(36) Runtime local36 = Runtime.getRuntime();
			local45 = (int) ((local36.totalMemory() - local36.freeMemory()) / 1024L);
			@Pc(48) long local48 = Static292.method5114();
			if (Static106.aLong45 == 0L) {
				Static106.aLong45 = local48;
			}
			if (local45 > 16384 && local48 - Static106.aLong45 < 5000L) {
				if (local48 - Static328.aLong15 > 1000L) {
					System.gc();
					Static328.aLong15 = local48;
				}
				Static185.anInt3839 = 5;
				Static159.aString248 = Static115.aString87;
			} else {
				Static159.aString248 = Static339.aString258;
				Static185.anInt3839 = 5;
				Static321.anInt6391 = 10;
			}
			return;
		}
		@Pc(99) int local99;
		if (Static321.anInt6391 == 10) {
			for (local99 = 0; local99 < 4; local99++) {
				Static313.aClass17Array1[local99] = Static85.method1386(Static260.anInt5348, Static43.anInt1151);
			}
			Static321.anInt6391 = 20;
			Static185.anInt3839 = 10;
			Static159.aString248 = Static207.aString165;
		} else if (Static321.anInt6391 == 20) {
			if (Static85.aClass204_1 == null) {
				Static85.aClass204_1 = new Class204(Static114.aClass154_1, Static153.aClass178_1);
			}
			if (Static85.aClass204_1.method5501()) {
				Static315.aClass134_139 = Static169.method2992(true, 0, false);
				Static10.aClass134_7 = Static169.method2992(true, 1, false);
				Static137.aClass134_128 = Static169.method2992(true, 2, false);
				Static317.aClass134_140 = Static169.method2992(true, 3, false);
				Static330.aClass134_144 = Static169.method2992(true, 4, false);
				Static29.aClass134_12 = Static169.method2992(true, 5, true);
				Static88.aClass134_38 = Static169.method2992(false, 6, true);
				Static200.aClass134_97 = Static169.method2992(true, 7, false);
				Static125.aClass134_55 = Static169.method2992(true, 8, false);
				Static129.aClass134_60 = Static169.method2992(true, 9, false);
				Static344.aClass134_146 = Static169.method2992(true, 10, false);
				Static312.aClass134_138 = Static169.method2992(true, 11, false);
				Static189.aClass134_135 = Static169.method2992(true, 12, false);
				Static77.aClass134_33 = Static169.method2992(true, 13, false);
				Static192.aClass134_92 = Static169.method2992(false, 14, false);
				Static210.aClass134_102 = Static169.method2992(true, 15, false);
				Static94.aClass134_41 = Static169.method2992(true, 16, false);
				Static184.aClass134_87 = Static169.method2992(true, 17, false);
				Class10_Sub1_Sub4.lb = Static169.method2992(true, 18, false);
				Static37.aClass134_18 = Static169.method2992(true, 19, false);
				Static233.aClass134_111 = Static169.method2992(true, 20, false);
				Static55.aClass134_29 = Static169.method2992(true, 21, false);
				Static132.aClass134_153 = Static169.method2992(true, 22, false);
				Static282.aClass134_79 = Static169.method2992(true, 23, true);
				Static264.aClass134_123 = Static169.method2992(true, 24, false);
				Static350.aClass134_101 = Static169.method2992(true, 25, false);
				Static218.aClass134_104 = Static169.method2992(true, 26, true);
				Static152.aClass134_71 = Static169.method2992(true, 27, false);
				Static89.aClass134_39 = Static169.method2992(true, 28, true);
				Static159.aString248 = Static105.aString79;
				Static185.anInt3839 = 15;
				Static321.anInt6391 = 30;
			} else {
				Static185.anInt3839 = 12;
				Static159.aString248 = Static92.aString69;
			}
		} else if (Static321.anInt6391 == 30) {
			local99 = 0;
			for (local45 = 0; local45 < 29; local45++) {
				local99 += Static60.aClass113_Sub1Array1[local45].method4973() * Static242.anIntArray475[local45] / 100;
			}
			if (local99 == 100) {
				Static185.anInt3839 = 20;
				Static159.aString248 = Static89.aString68;
				Static10.method164(Static125.aClass134_55);
				Static124.method1988(Static125.aClass134_55);
				Static321.anInt6391 = 40;
			} else {
				Static185.anInt3839 = 20;
				if (local99 != 0) {
					Static159.aString248 = Static184.aString140 + local99 + "%";
				}
			}
		} else if (Static321.anInt6391 == 40) {
			if (Static89.aClass134_39.method3031()) {
				this.method858(Static89.aClass134_39.method3014(1));
				Static185.anInt3839 = 25;
				Static321.anInt6391 = 50;
				Static159.aString248 = Static266.aString214;
			} else {
				Static159.aString248 = Static22.aString15 + Static89.aClass134_39.method3006() + "%";
				Static185.anInt3839 = 25;
			}
		} else if (Static321.anInt6391 == 50) {
			Static29.method490(Static138.aBoolean522);
			Static261.aClass1_Sub31_Sub3_2 = new Class1_Sub31_Sub3();
			Static261.aClass1_Sub31_Sub3_2.method4736();
			Static205.aClass125_1 = Static312.method5354(22050, Static235.aCanvas6, Static197.aClass215_5, 0);
			Static205.aClass125_1.method5307(Static261.aClass1_Sub31_Sub3_2);
			Static28.method485(Static330.aClass134_144, Static210.aClass134_102, Static261.aClass1_Sub31_Sub3_2, Static192.aClass134_92);
			Static310.aClass125_2 = Static312.method5354(2048, Static235.aCanvas6, Static197.aClass215_5, 1);
			Static142.aClass1_Sub31_Sub2_1 = new Class1_Sub31_Sub2();
			Static310.aClass125_2.method5307(Static142.aClass1_Sub31_Sub2_1);
			Static49.aClass194_3 = new Class194(22050, Static348.anInt6162);
			Static107.anInt2045 = Static88.aClass134_38.method3018("scape main");
			Static321.anInt6391 = 60;
			Static159.aString248 = Static256.aString202;
			Static185.anInt3839 = 30;
		} else if (Static321.anInt6391 == 60) {
			local99 = Static16.method297(Static77.aClass134_33, Static125.aClass134_55);
			local45 = Static317.method5432();
			if (local45 > local99) {
				Static159.aString248 = Static352.aString274 + local99 * 100 / local45 + "%";
				Static185.anInt3839 = 35;
			} else {
				Static185.anInt3839 = 35;
				Static321.anInt6391 = 70;
				Static159.aString248 = Static315.aString245;
			}
		} else if (Static321.anInt6391 == 70) {
			local99 = Static37.method779(Static125.aClass134_55);
			local45 = Static208.method3736();
			if (local45 > local99) {
				Static159.aString248 = Static144.aString108 + local99 * 100 / local45 + "%";
				Static185.anInt3839 = 40;
			} else {
				Static159.aString248 = Static131.aString101;
				Static185.anInt3839 = 40;
				Static321.anInt6391 = 80;
			}
		} else if (Static321.anInt6391 == 80) {
			if (Static218.aClass134_104.method3031()) {
				Static71.anInterface2_1 = new Class39(Static218.aClass134_104, Static129.aClass134_60, Static125.aClass134_55);
				Static321.anInt6391 = 90;
				Static159.aString248 = Static235.aString243;
				Static185.anInt3839 = 45;
			} else {
				Static159.aString248 = Static130.aString185 + Static218.aClass134_104.method3006() + "%";
				Static185.anInt3839 = 45;
			}
		} else if (Static321.anInt6391 == 90) {
			Static159.aString248 = Static295.aString236;
			Static321.anInt6391 = 95;
			Static185.anInt3839 = 50;
		} else if (Static321.anInt6391 == 95) {
			if (Static5.aBoolean10) {
				Static313.anInt6232 = 0;
				Static25.anInt449 = 1;
				Static13.anInt213 = 0;
				Static231.anInt4828 = 0;
				Static248.anInt26 = 0;
			}
			Static5.aBoolean10 = true;
			Static100.method1593(Static197.aClass215_5);
			Static344.method5760();
			Static257.method4570(false, Static248.anInt26);
			Static321.anInt6391 = 100;
			Static185.anInt3839 = 55;
			Static159.aString248 = Static276.aString220;
		} else if (Static321.anInt6391 == 100) {
			Static66.method1208(Static125.aClass134_55, Static217.aClass105_5, Static77.aClass134_33);
			Static159.aString248 = Static176.aString138;
			Static185.anInt3839 = 60;
			Static16.method298(5);
			Static321.anInt6391 = 110;
		} else if (Static321.anInt6391 == 110) {
			Static137.aClass134_128.method3031();
			local99 = Static137.aClass134_128.method3006();
			Static94.aClass134_41.method3031();
			local99 += Static94.aClass134_41.method3006();
			Static184.aClass134_87.method3031();
			local99 += Static184.aClass134_87.method3006();
			Class10_Sub1_Sub4.lb.method3031();
			local99 += Class10_Sub1_Sub4.lb.method3006();
			Static37.aClass134_18.method3031();
			local99 += Static37.aClass134_18.method3006();
			Static233.aClass134_111.method3031();
			local99 += Static233.aClass134_111.method3006();
			Static55.aClass134_29.method3031();
			local99 += Static55.aClass134_29.method3006();
			Static132.aClass134_153.method3031();
			local99 += Static132.aClass134_153.method3006();
			Static264.aClass134_123.method3031();
			local99 += Static264.aClass134_123.method3006();
			Static350.aClass134_101.method3031();
			local99 += Static350.aClass134_101.method3006();
			Static152.aClass134_71.method3031();
			local99 += Static152.aClass134_71.method3006();
			if (local99 < 1100) {
				Static159.aString248 = Static293.aString232 + local99 / 11 + "%";
				Static185.anInt3839 = 65;
			} else {
				Static187.method3328(Static137.aClass134_128);
				Static58.method1135(Static137.aClass134_128);
				Static214.method3966(Static137.aClass134_128);
				Static64.method1193(Static137.aClass134_128, Static200.aClass134_97);
				Static322.method5494(Static94.aClass134_41, Static200.aClass134_97);
				Static306.method5300(Static200.aClass134_97, Class10_Sub1_Sub4.lb);
				Static330.method5547(Static37.aClass134_18, Static200.aClass134_97);
				Static314.method5369(Static137.aClass134_128);
				Static260.method4681(Static315.aClass134_139, Static233.aClass134_111, Static10.aClass134_7);
				Static323.method5832(Static137.aClass134_128);
				Static331.method3174(Static200.aClass134_97, Static55.aClass134_29);
				Static68.method1220(Static132.aClass134_153);
				Static330.method5545(Static137.aClass134_128);
				Static72.method1267(Static77.aClass134_33, Static200.aClass134_97, Static125.aClass134_55, Static317.aClass134_140);
				Static152.method2661(Static137.aClass134_128);
				Static326.method4951(Static184.aClass134_87);
				Static41.method876(new Class187(), Static350.aClass134_101, Static264.aClass134_123);
				Static154.method2686(Static350.aClass134_101, Static264.aClass134_123);
				Static305.method5283(Static137.aClass134_128);
				Static83.method1320(Static137.aClass134_128);
				Static254.method4547(Static137.aClass134_128);
				Static177.method3163(Static137.aClass134_128, Static125.aClass134_55);
				Static308.method5237(Static125.aClass134_55, Static137.aClass134_128);
				Static261.method4713(Static137.aClass134_128);
				Static336.method5589(Static125.aClass134_55, Static137.aClass134_128);
				Static205.method3699(Static137.aClass134_128);
				Static272.method4369(Static137.aClass134_128);
				Static159.aString248 = Static306.aString242;
				Static185.anInt3839 = 65;
				Static206.method3703();
				Static321.anInt6391 = 120;
			}
		} else if (Static321.anInt6391 == 120) {
			local99 = Static202.method3668(Static125.aClass134_55);
			local45 = Static192.method3377();
			if (local99 < local45) {
				Static185.anInt3839 = 70;
				Static159.aString248 = Static115.aString88 + local99 * 100 / local45 + "%";
			} else {
				Static220.method4066(Static217.aClass105_5, Static125.aClass134_55);
				Static103.method1626(Static19.aClass8Array1);
				Static159.aString248 = Static178.aString139;
				Static321.anInt6391 = 130;
				Static185.anInt3839 = 70;
			}
		} else if (Static321.anInt6391 == 130) {
			Static287.aClass48_1 = new Class48();
			Static197.aClass215_5.method5654(Static287.aClass48_1, 10);
			Static321.anInt6391 = 140;
			Static185.anInt3839 = 75;
			Static159.aString248 = Static28.aString19;
		} else if (Static321.anInt6391 == 140) {
			if (Static344.aClass134_146.method3012("", "huffman")) {
				@Pc(1080) Class216 local1080 = new Class216(Static344.aClass134_146.method3029("", "huffman"));
				Static352.method5836(local1080);
				Static159.aString248 = Static194.aString155;
				Static321.anInt6391 = 150;
				Static185.anInt3839 = 80;
			} else {
				Static185.anInt3839 = 80;
				Static159.aString248 = Static53.aString45 + "0%";
			}
		} else if (Static321.anInt6391 == 150) {
			if (!Static317.aClass134_140.method3031()) {
				Static159.aString248 = Static96.aString74 + Static317.aClass134_140.method3006() * 3 / 4 + "%";
				Static185.anInt3839 = 85;
			} else if (!Static189.aClass134_135.method3031()) {
				Static159.aString248 = Static96.aString74 + (Static189.aClass134_135.method3006() / 10 + 75) + "%";
				Static185.anInt3839 = 85;
			} else if (!Static77.aClass134_33.method3031()) {
				Static159.aString248 = Static96.aString74 + (Static77.aClass134_33.method3006() / 20 + 85) + "%";
				Static185.anInt3839 = 85;
			} else if (Static282.aClass134_79.method3030("details")) {
				Static150.method2245(Static282.aClass134_79);
				Static194.method3445(Static152.aClass134_71);
				Static11.method5110(Static71.anInterface2_1, Static200.aClass134_97);
				Static321.anInt6391 = 160;
				Static159.aString248 = Static73.aString33;
				Static185.anInt3839 = 85;
			} else {
				Static159.aString248 = Static96.aString74 + (Static282.aClass134_79.method3023("details") / 10 + 90) + "%";
				Static185.anInt3839 = 85;
			}
		} else if (Static321.anInt6391 == 160) {
			local99 = Static10.method165();
			if (local99 == -1) {
				Static185.anInt3839 = 90;
				Static159.aString248 = Static55.aString46;
			} else if (local99 == 7 || local99 == 9) {
				this.method836("worldlistfull");
				Static16.method298(1000);
			} else if (Static220.aBoolean372) {
				Static159.aString248 = Static115.aString89;
				Static321.anInt6391 = 170;
				Static185.anInt3839 = 90;
			} else {
				this.method836("worldlistio_" + local99);
				Static16.method298(1000);
			}
		} else if (Static321.anInt6391 == 170) {
			Static254.aBooleanArray21 = new boolean[Static128.anInt3534];
			Static20.aStringArray3 = new String[Static282.anInt3511];
			Static35.anIntArray51 = new int[Static128.anInt3534];
			for (local99 = 0; local99 < Static128.anInt3534; local99++) {
				if (Static53.method1077(local99).anInt5481 == 0) {
					Static254.aBooleanArray21[local99] = true;
					Static166.anInt3450++;
				}
				Static35.anIntArray51[local99] = -1;
			}
			Static257.method4567();
			Static132.anInt6772 = Static317.aClass134_140.method3018("loginscreen");
			Static29.aClass134_12.method3021(false);
			Static88.aClass134_38.method3021(true);
			Static125.aClass134_55.method3021(true);
			Static77.aClass134_33.method3021(true);
			Static344.aClass134_146.method3021(true);
			Static317.aClass134_140.method3021(true);
			Static137.aClass134_128.anInt3576 = 2;
			Static98.aBoolean153 = true;
			Static184.aClass134_87.anInt3576 = 2;
			Static94.aClass134_41.anInt3576 = 2;
			Class10_Sub1_Sub4.lb.anInt3576 = 2;
			Static37.aClass134_18.anInt3576 = 2;
			Static233.aClass134_111.anInt3576 = 2;
			Static55.aClass134_29.anInt3576 = 2;
			Static146.method4165(Static25.anInt449, false, -1, -1);
			Static321.anInt6391 = 180;
			Static159.aString248 = Static77.aString60;
			Static185.anInt3839 = 95;
		} else if (Static321.anInt6391 == 180) {
			Static173.method3108(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method834() {
		if (Static216.aBoolean367) {
			Static250.method4491();
		}
		if (Static217.aClass105_5 != null) {
			Static217.aClass105_5.method4299();
		}
		if (Static291.aFrame1 != null) {
			Static278.method4962(Static291.aFrame1, Static197.aClass215_5);
			Static291.aFrame1 = null;
		}
		if (Static287.aClass48_1 != null) {
			Static287.aClass48_1.aBoolean94 = false;
		}
		Static287.aClass48_1 = null;
		if (Static81.aClass202_3 != null) {
			Static81.aClass202_3.method5477();
			Static81.aClass202_3 = null;
		}
		Static24.method404(Static235.aCanvas6);
		Static158.method2805(Static235.aCanvas6);
		if (Static212.aClass24_1 != null) {
			Static212.aClass24_1.method439(Static235.aCanvas6);
		}
		Static206.method3704();
		Static19.method331();
		Static212.aClass24_1 = null;
		if (Static205.aClass125_1 != null) {
			Static205.aClass125_1.method5318();
		}
		if (Static310.aClass125_2 != null) {
			Static310.aClass125_2.method5318();
		}
		Static114.aClass154_1.method4103();
		Static153.aClass178_1.method4821();
		if (Static137.aClass63_2 != null) {
			Static137.aClass63_2.method1310();
			Static137.aClass63_2 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method858(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub21 local15 = new Class1_Sub21(arg0);
		while (true) {
			while (true) {
				@Pc(19) int local19 = local15.method5720();
				if (local19 == 0) {
					return;
				}
				if (local19 == 1) {
					@Pc(32) int[] local32 = Static332.anIntArray651 = new int[6];
					local32[0] = local15.method5715();
					local32[1] = local15.method5715();
					local32[2] = local15.method5715();
					local32[3] = local15.method5715();
					local32[4] = local15.method5715();
					local32[5] = local15.method5715();
				} else if (local19 == 4) {
					@Pc(77) int local77 = local15.method5720();
					Static53.anIntArray94 = new int[local77];
					for (@Pc(82) int local82 = 0; local82 < local77; local82++) {
						Static53.anIntArray94[local82] = local15.method5715();
						if (Static53.anIntArray94[local82] == 65535) {
							Static53.anIntArray94[local82] = -1;
						}
					}
				}
			}
		}
	}
}
