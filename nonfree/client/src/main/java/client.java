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
				Static260.method7061("Argument count");
			}
			Static280.aClass255_3 = new Class255();
			Static280.aClass255_3.anInt7912 = Integer.parseInt(arg0[0]);
			Static561.aClass255_5 = new Class255();
			Static561.aClass255_5.anInt7912 = Integer.parseInt(arg0[1]);
			Static92.aClass255_1 = new Class255();
			Static92.aClass255_1.anInt7912 = Integer.parseInt(arg0[2]);
			Static193.aClass107_2 = Static305.aClass107_5;
			if (arg0[3].equals("live")) {
				Static201.aClass317_2 = Static29.aClass317_1;
			} else if (arg0[3].equals("rc")) {
				Static201.aClass317_2 = Static494.aClass317_3;
			} else if (arg0[3].equals("wip")) {
				Static201.aClass317_2 = Static611.aClass317_5;
			} else {
				Static260.method7061("modewhat");
			}
			Static476.anInt8915 = Static224.method4294(arg0[4]);
			if (Static476.anInt8915 == -1) {
				if (arg0[4].equals("english")) {
					Static476.anInt8915 = 0;
				} else if (arg0[4].equals("german")) {
					Static476.anInt8915 = 1;
				} else {
					Static260.method7061("language");
				}
			}
			Static503.aBoolean663 = false;
			Static612.aBoolean729 = false;
			if (arg0[5].equals("game0")) {
				Static423.aClass316_4 = Static195.aClass316_2;
			} else if (arg0[5].equals("game1")) {
				Static423.aClass316_4 = Static557.aClass316_6;
			} else if (arg0[5].equals("game2")) {
				Static423.aClass316_4 = Static544.aClass316_5;
			} else if (arg0[5].equals("game3")) {
				Static423.aClass316_4 = Static352.aClass316_3;
			} else {
				Static260.method7061("game");
			}
			Static418.aBoolean568 = false;
			Static26.aString7 = "";
			Static535.aLong241 = 0L;
			Static431.aString91 = null;
			Static482.anInt8988 = 0;
			Static406.aBoolean551 = true;
			Static486.aBoolean654 = true;
			Static179.aBoolean320 = false;
			Static553.anInt9912 = 0;
			Static510.anInt9347 = Static423.aClass316_4.anInt9447;
			Static199.anInt8569 = 0;
			Static49.aString11 = null;
			@Pc(182) client local182 = new client();
			Static30.aClient1 = local182;
			local182.method2226(Static201.aClass317_2.method7864() + 32, Static423.aClass316_4.aString98);
			Static255.aFrame2.setLocation(40, 40);
		} catch (@Pc(205) Exception local205) {
			Static408.method6625(null, local205);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method2231() {
		if (Static142.aClass329_3.anInt9761 > Static416.anInt7880) {
			Static185.aClass255_2.method6754();
			Static117.anInt3131 = (Static142.aClass329_3.anInt9761 * 50 - 50) * 5;
			if (Static117.anInt3131 > 3000) {
				Static117.anInt3131 = 3000;
			}
			if (Static142.aClass329_3.anInt9761 >= 2 && Static142.aClass329_3.anInt9762 == 6) {
				this.method2212("js5connect_outofdate");
				Static529.anInt9623 = 14;
				return;
			}
			if (Static142.aClass329_3.anInt9761 >= 4 && Static142.aClass329_3.anInt9762 == -1) {
				this.method2212("js5crc");
				Static529.anInt9623 = 14;
				return;
			}
			if (Static142.aClass329_3.anInt9761 >= 4 && Static389.method6421(Static529.anInt9623)) {
				if (Static142.aClass329_3.anInt9762 == 7 || Static142.aClass329_3.anInt9762 == 9) {
					this.method2212("js5connect_full");
				} else if (Static142.aClass329_3.anInt9762 <= 0) {
					this.method2212("js5io");
				} else if (Static428.aString61 == null) {
					this.method2212("js5connect");
				} else {
					this.method2212("js5proxy_" + Static428.aString61.trim());
				}
				Static529.anInt9623 = 14;
				return;
			}
		}
		Static416.anInt7880 = Static142.aClass329_3.anInt9761;
		if (Static117.anInt3131 > 0) {
			Static117.anInt3131--;
			return;
		}
		try {
			if (Static247.anInt7324 == 0) {
				Static1.aClass240_9 = Static185.aClass255_2.method6757(Static268.aClass370_3);
				Static247.anInt7324++;
			}
			if (Static247.anInt7324 == 1) {
				if (Static1.aClass240_9.anInt7566 == 2) {
					if (Static1.aClass240_9.anObject13 != null) {
						Static428.aString61 = (String) Static1.aClass240_9.anObject13;
					}
					this.method2233(1000);
					return;
				}
				if (Static1.aClass240_9.anInt7566 == 1) {
					Static247.anInt7324++;
				}
			}
			if (Static247.anInt7324 == 2) {
				Static469.aClass291_1 = new Class291((Socket) Static1.aClass240_9.anObject13, Static268.aClass370_3, 25000);
				@Pc(190) Class2_Sub11 local190 = new Class2_Sub11(5);
				local190.method8374(Static444.aClass141_2.anInt4991);
				local190.method8387(634);
				Static469.aClass291_1.method7520(local190.aByteArray128, 5);
				Static247.anInt7324++;
				Static246.aLong117 = Static277.method5091();
			}
			if (Static247.anInt7324 == 3) {
				if (Static389.method6421(Static529.anInt9623) || Static469.aClass291_1.method7517() > 0) {
					@Pc(233) int local233 = Static469.aClass291_1.method7523();
					if (local233 != 0) {
						this.method2233(local233);
						return;
					}
					Static247.anInt7324++;
				} else if (Static277.method5091() - Static246.aLong117 > 30000L) {
					this.method2233(1001);
					return;
				}
			}
			if (Static247.anInt7324 == 4) {
				@Pc(279) boolean local279 = Static389.method6421(Static529.anInt9623) || Static461.method6813(Static529.anInt9623) || Static115.method2851(Static529.anInt9623);
				@Pc(282) Class346[] local282 = Static580.method8638();
				@Pc(290) Class2_Sub11 local290 = new Class2_Sub11(local282.length * 4);
				Static469.aClass291_1.method7524(local290.aByteArray128, 0, local290.aByteArray128.length);
				for (@Pc(301) int local301 = 0; local301 < local282.length; local301++) {
					local282[local301].method8639(local290.method8381());
				}
				Static142.aClass329_3.method8128(!local279, Static469.aClass291_1);
				Static247.anInt7324 = 0;
				Static1.aClass240_9 = null;
				Static469.aClass291_1 = null;
			}
		} catch (@Pc(345) IOException local345) {
			this.method2233(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method2222() {
		if (Static418.aBoolean568) {
			Static514.anInt9425 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static407.method6619();
		Static238.aClass5_3 = new Class5(Static268.aClass370_3);
		Static142.aClass329_3 = new Class329();
		Static89.method2479(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static193.aClass107_2 != Static448.aClass107_7) {
			Static642.aByteArrayArray26 = new byte[50][];
		}
		Static74.aClass2_Sub13_5 = Static447.method7044();
		if (Static193.aClass107_2 == Static448.aClass107_7) {
			Static280.aClass255_3.aString89 = this.getCodeBase().getHost();
		} else if (Static73.method2122(Static193.aClass107_2)) {
			Static280.aClass255_3.aString89 = this.getCodeBase().getHost();
			Static280.aClass255_3.anInt7914 = Static280.aClass255_3.anInt7912 + 40000;
			Static561.aClass255_5.anInt7914 = Static561.aClass255_5.anInt7912 + 40000;
			Static280.aClass255_3.anInt7908 = Static280.aClass255_3.anInt7912 + 50000;
			Static92.aClass255_1.anInt7914 = Static92.aClass255_1.anInt7912 + 40000;
			Static561.aClass255_5.anInt7908 = Static561.aClass255_5.anInt7912 + 50000;
			Static92.aClass255_1.anInt7908 = Static92.aClass255_1.anInt7912 + 50000;
		} else if (Static305.aClass107_5 == Static193.aClass107_2) {
			Static280.aClass255_3.aString89 = "127.0.0.1";
			Static561.aClass255_5.aString89 = "127.0.0.1";
			Static280.aClass255_3.anInt7914 = Static280.aClass255_3.anInt7912 + 40000;
			Static92.aClass255_1.aString89 = "127.0.0.1";
			Static561.aClass255_5.anInt7914 = Static561.aClass255_5.anInt7912 + 40000;
			Static92.aClass255_1.anInt7914 = Static92.aClass255_1.anInt7912 + 40000;
			Static280.aClass255_3.anInt7908 = Static280.aClass255_3.anInt7912 + 50000;
			Static561.aClass255_5.anInt7908 = Static561.aClass255_5.anInt7912 + 50000;
			Static92.aClass255_1.anInt7908 = Static92.aClass255_1.anInt7912 + 50000;
		}
		Static464.aShortArray115 = Static350.aShortArray77 = Static328.aShortArray76 = Static111.aShortArray30 = new short[256];
		if (Static423.aClass316_4 == Static195.aClass316_2) {
			Static291.aBoolean462 = false;
		}
		if (Static557.aClass316_6 == Static423.aClass316_4) {
			Static362.aBoolean525 = true;
			Static384.aShortArrayArray22 = Static186.aShortArrayArray17;
			Static60.anInt2003 = 16777215;
			Static411.aShortArrayArrayArray6 = Static99.aShortArrayArrayArray2;
			Static60.anInt2006 = 0;
		} else if (Static423.aClass316_4 == Static352.aClass316_3) {
			Static384.aShortArrayArray22 = Static60.aShortArrayArray5;
			Static411.aShortArrayArrayArray6 = Static286.aShortArrayArrayArray5;
		} else {
			Static384.aShortArrayArray22 = Static629.aShortArrayArray24;
			Static411.aShortArrayArrayArray6 = Static22.aShortArrayArrayArray1;
		}
		Static185.aClass255_2 = Static280.aClass255_3;
		try {
			Static574.aClipboard1 = Static30.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(225) Exception local225) {
		}
		Static449.aClass90_1 = Static138.method3108(Static639.aCanvas10);
		Static628.aClass9_1 = Static261.method4787(Static639.aCanvas10);
		try {
			if (Static268.aClass370_3.aClass320_3 != null) {
				Static591.aClass184_4 = new Class184(Static268.aClass370_3.aClass320_3, 5200, 0);
				for (@Pc(247) int local247 = 0; local247 < 37; local247++) {
					Static343.aClass184Array1[local247] = new Class184(Static268.aClass370_3.aClass320Array1[local247], 6000, 0);
				}
				Static56.aClass184_1 = new Class184(Static268.aClass370_3.aClass320_2, 6000, 0);
				Static593.aClass233_4 = new Class233(255, Static591.aClass184_4, Static56.aClass184_1, 500000);
				Static174.aClass184_2 = new Class184(Static268.aClass370_3.aClass320_4, 24, 0);
				Static268.aClass370_3.aClass320_2 = null;
				Static268.aClass370_3.aClass320_3 = null;
				Static268.aClass370_3.aClass320Array1 = null;
				Static268.aClass370_3.aClass320_4 = null;
			}
		} catch (@Pc(303) IOException local303) {
			Static591.aClass184_4 = null;
			Static56.aClass184_1 = null;
			Static174.aClass184_2 = null;
			Static593.aClass233_4 = null;
		}
		if (Static193.aClass107_2 != Static448.aClass107_7) {
			Static624.aBoolean742 = true;
		}
		Static150.aString93 = Static588.aClass351_14.method8691(Static476.anInt8915);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method2221() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method2232() {
		@Pc(11) boolean local11 = Static142.aClass329_3.method8118();
		if (!local11) {
			this.method2231();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method2233(@OriginalArg(0) int arg0) {
		Static142.aClass329_3.anInt9761++;
		Static1.aClass240_9 = null;
		Static142.aClass329_3.anInt9762 = arg0;
		Static247.anInt7324 = 0;
		Static469.aClass291_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method2210() {
		if (Static453.aBoolean599) {
			Static154.method6048();
		}
		Static211.method4171();
		if (Static186.aClass20_4 != null) {
			Static186.aClass20_4.method7238();
		}
		if (Static232.aFrame1 != null) {
			Static265.method4893(Static232.aFrame1, Static268.aClass370_3);
			Static232.aFrame1 = null;
		}
		if (Static272.aClass116_1 != null) {
			Static272.aClass116_1.method3740();
			Static272.aClass116_1 = null;
		}
		Static419.method6760();
		Static142.aClass329_3.method8126();
		Static238.aClass5_3.method110();
		if (Static305.aClass262_1 != null) {
			Static305.aClass262_1.method6850();
			Static305.aClass262_1 = null;
		}
		try {
			Static591.aClass184_4.method5461();
			for (@Pc(55) int local55 = 0; local55 < 37; local55++) {
				Static343.aClass184Array1[local55].method5461();
			}
			Static56.aClass184_1.method5461();
			Static174.aClass184_2.method5461();
			Static633.method9180();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method2229() {
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 2) {
			this.method2244();
			return;
		}
		try {
			this.method2244();
		} catch (@Pc(25) ThreadDeath local25) {
			throw local25;
		} catch (@Pc(28) Throwable local28) {
			Static408.method6625(local28.getMessage() + " (Recovered) " + this.method2211(), local28);
			Static389.aBoolean544 = true;
			Static316.method5509(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method2219()) {
			return;
		}
		Static280.aClass255_3 = new Class255();
		Static280.aClass255_3.anInt7912 = Integer.parseInt(this.getParameter("worldid"));
		Static561.aClass255_5 = new Class255();
		Static561.aClass255_5.anInt7912 = Integer.parseInt(this.getParameter("lobbyid"));
		Static561.aClass255_5.aString89 = this.getParameter("lobbyaddress");
		Static92.aClass255_1 = new Class255();
		Static92.aClass255_1.anInt7912 = Integer.parseInt(this.getParameter("demoid"));
		Static92.aClass255_1.aString89 = this.getParameter("demoaddress");
		Static193.aClass107_2 = Static186.method3883(Integer.parseInt(this.getParameter("modewhere")));
		if (Static305.aClass107_5 == Static193.aClass107_2) {
			Static193.aClass107_2 = Static354.aClass107_6;
		} else if (!Static73.method2122(Static193.aClass107_2) && Static448.aClass107_7 != Static193.aClass107_2) {
			Static193.aClass107_2 = Static448.aClass107_7;
		}
		Static201.aClass317_2 = Static524.method8694(Integer.parseInt(this.getParameter("modewhat")));
		if (Static201.aClass317_2 != Static611.aClass317_5 && Static201.aClass317_2 != Static494.aClass317_3 && Static29.aClass317_1 != Static201.aClass317_2) {
			Static201.aClass317_2 = Static29.aClass317_1;
		}
		try {
			Static476.anInt8915 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static476.anInt8915 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static503.aBoolean663 = true;
		} else {
			Static503.aBoolean663 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static612.aBoolean729 = true;
		} else {
			Static612.aBoolean729 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static578.aBoolean579 = true;
		} else {
			Static578.aBoolean579 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static423.aClass316_4 = Static195.aClass316_2;
			} else if (local152.equals("1")) {
				Static423.aClass316_4 = Static557.aClass316_6;
			} else if (local152.equals("2")) {
				Static423.aClass316_4 = Static544.aClass316_5;
			} else if (local152.equals("3")) {
				Static423.aClass316_4 = Static352.aClass316_3;
			}
		}
		try {
			Static482.anInt8988 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static482.anInt8988 = 0;
		}
		Static362.aString77 = this.getParameter("quiturl");
		Static26.aString7 = this.getParameter("settings");
		if (Static26.aString7 == null) {
			Static26.aString7 = "";
		}
		Static97.aBoolean224 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static199.anInt8569 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static199.anInt8569 = 0;
			}
		}
		Static510.anInt9347 = Integer.parseInt(this.getParameter("colourid"));
		if (Static510.anInt9347 < 0 || Static43.aColorArray5.length <= Static510.anInt9347) {
			Static510.anInt9347 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static406.aBoolean551 = true;
			Static486.aBoolean654 = true;
		}
		@Pc(252) String local252 = this.getParameter("frombilling");
		if (local252 != null && local252.equals("true")) {
			Static179.aBoolean320 = true;
		}
		Static431.aString91 = this.getParameter("sskey");
		if (Static431.aString91 != null && Static431.aString91.length() < 2) {
			Static431.aString91 = null;
		}
		@Pc(276) String local276 = this.getParameter("force64mb");
		if (local276 != null && local276.equals("true")) {
			Static418.aBoolean568 = true;
		}
		@Pc(288) String local288 = this.getParameter("worldflags");
		if (local288 != null) {
			try {
				Static553.anInt9912 = Integer.parseInt(local288);
			} catch (@Pc(295) Exception local295) {
			}
		}
		@Pc(300) String local300 = this.getParameter("userFlow");
		if (local300 != null) {
			try {
				Static535.aLong241 = Long.parseLong(local300);
			} catch (@Pc(307) NumberFormatException local307) {
			}
		}
		Static49.aString11 = this.getParameter("additionalInfo");
		if (Static49.aString11 != null && Static49.aString11.length() > 50) {
			Static49.aString11 = null;
		}
		if (Static195.aClass316_2 == Static423.aClass316_4) {
			Static467.anInt8715 = 503;
			Static326.anInt6591 = 765;
		} else if (Static423.aClass316_4 == Static557.aClass316_6) {
			Static326.anInt6591 = 640;
			Static467.anInt8715 = 480;
		}
		Static30.aClient1 = this;
		this.method2225(Static326.anInt6591, Static467.anInt8715, Static201.aClass317_2.method7864() + 32, Static423.aClass316_4.aString98);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method2223() {
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 2) {
			this.method2246();
			return;
		}
		try {
			this.method2246();
		} catch (@Pc(26) ThreadDeath local26) {
			throw local26;
		} catch (@Pc(29) Throwable local29) {
			Static408.method6625(local29.getMessage() + " (Recovered) " + this.method2211(), local29);
			Static389.aBoolean544 = true;
			Static316.method5509(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method2243() {
		@Pc(23) int local23;
		if (Static529.anInt9623 == 7 && Static513.anInt9420 == 0) {
			if (Static612.anInt10717 > 1) {
				Static62.anInt2039 = Static7.anInt132;
				Static612.anInt10717--;
			}
			if (!Static65.aBoolean754) {
				Static364.method6173();
			}
			for (local23 = 0; local23 < 100 && Static616.method8985(); local23++) {
			}
		}
		Static99.anInt2781++;
		Static327.method5626(null, -1, -1);
		Static437.method6921(-1, null, -1);
		Static499.method7732();
		Static7.anInt132++;
		for (local23 = 0; local23 < Static474.anInt8881; local23++) {
			@Pc(67) Class3_Sub1_Sub3_Sub3_Sub1 local67 = Static62.aClass2_Sub33Array1[local23].aClass3_Sub1_Sub3_Sub3_Sub1_2;
			if (local67 != null) {
				@Pc(73) byte local73 = local67.aClass27_1.aByte10;
				if ((local73 & 0x1) != 0) {
					@Pc(81) int local81 = local67.method5214();
					@Pc(105) int local105;
					if ((local73 & 0x2) != 0 && local67.anInt6102 == 0 && Math.random() * 1000.0D < 10.0D) {
						local105 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(113) int local113 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local105 != 0 || local113 != 0) {
							@Pc(131) int local131 = local67.anIntArray358[0] + local105;
							if (local131 < 0) {
								local131 = 0;
							} else if (Static47.anInt1794 - local81 - 1 < local131) {
								local131 = Static47.anInt1794 - local81 - 1;
							}
							@Pc(163) int local163 = local113 + local67.anIntArray357[0];
							if (local163 < 0) {
								local163 = 0;
							} else if (local163 > Static209.anInt4742 - local81 - 1) {
								local163 = Static209.anInt4742 - local81 - 1;
							}
							@Pc(214) int local214 = Static621.method9058(local131, local81, local81, Static391.anIntArray480, true, -1, local67.anIntArray358[0], local67.anIntArray357[0], Static96.anIntArray133, local163, Static55.aClass104Array3[local67.aByte132], local81, 0, 0);
							if (local214 > 0) {
								if (local214 > 9) {
									local214 = 9;
								}
								for (@Pc(228) int local228 = 0; local228 < local214; local228++) {
									local67.anIntArray358[local228] = Static96.anIntArray133[local214 - local228 - 1];
									local67.anIntArray357[local228] = Static391.anIntArray480[local214 - local228 - 1];
									local67.aByteArray82[local228] = 1;
								}
								local67.anInt6102 = local214;
							}
						}
					}
					Static505.method7792(true, local67);
					local105 = Static186.method3881(local67);
					Static84.method2412(local67);
					Static292.method5258(Static56.anInt1903, local105, local67, Static133.anInt3322);
					Static83.method2401(local67, Static56.anInt1903);
					Static518.method7859(local67);
				}
			}
		}
		if (Static513.anInt9420 == 0 && Static411.anInt7764 == 0) {
			if (Static496.anInt9165 == 2) {
				Static49.method1755();
			} else {
				Static322.method5589();
			}
			if (Static135.anInt3347 >> 9 < 14 || Static135.anInt3347 >> 9 >= Static47.anInt1794 - 14 || Static621.anInt10870 >> 9 < 14 || Static621.anInt10870 >> 9 >= Static209.anInt4742 - 14) {
				Static33.method4648();
			}
		}
		while (true) {
			@Pc(361) Class2_Sub44 local361;
			@Pc(366) Class24 local366;
			@Pc(379) Class24 local379;
			do {
				local361 = (Class2_Sub44) Static488.aClass341_57.method8526();
				if (local361 == null) {
					while (true) {
						do {
							local361 = (Class2_Sub44) Static156.aClass341_37.method8526();
							if (local361 == null) {
								while (true) {
									do {
										local361 = (Class2_Sub44) Static98.aClass341_28.method8526();
										if (local361 == null) {
											if (Static612.aClass24_17 != null) {
												Static123.method2957();
											}
											if (Static407.anInt7704 % 1500 == 0) {
												Static420.method6785();
											}
											if (Static529.anInt9623 == 7 && Static513.anInt9420 == 0) {
												Static570.method8516();
											}
											Static33.method4664();
											if (Static453.aBoolean599 && Static277.method5091() - 60000L > Static232.aLong107) {
												Static154.method6048();
											}
											for (@Pc(542) Class3_Sub2_Sub1 local542 = (Class3_Sub2_Sub1) Static96.aClass325_2.method8016(); local542 != null; local542 = (Class3_Sub2_Sub1) Static96.aClass325_2.method8022()) {
												if (Static277.method5091() / 1000L - 5L > (long) local542.anInt3406) {
													if (local542.aShort33 > 0) {
														Static101.method2658("", 5, 0, local542.aString28 + Static588.aClass351_21.method8691(Static476.anInt8915), "", "");
													}
													if (local542.aShort33 == 0) {
														Static101.method2658("", 5, 0, local542.aString28 + Static588.aClass351_22.method8691(Static476.anInt8915), "", "");
													}
													local542.method8909();
												}
											}
											if (Static529.anInt9623 == 7 && Static513.anInt9420 == 0) {
												if (Static272.aClass116_1 == null) {
													Static68.method2104(false);
													return;
												}
												Static201.anInt4634++;
												if (Static201.anInt4634 > 50) {
													@Pc(650) Class2_Sub52 local650 = Static130.method3019(Static392.aClass94_78, Static361.aClass183_1);
													Static96.method2563(local650);
												}
												try {
													Static547.method8179();
													return;
												} catch (@Pc(657) IOException local657) {
													Static68.method2104(false);
													return;
												}
											}
											return;
										}
										local366 = local361.aClass24_15;
										if (local366.anInt439 < 0) {
											break;
										}
										local379 = Static87.method8101(local366.anInt511);
									} while (local379 == null || local379.aClass24Array1 == null || local379.aClass24Array1.length <= local366.anInt439 || local366 != local379.aClass24Array1[local366.anInt439]);
									Static284.method5153(local361);
								}
							}
							local366 = local361.aClass24_15;
							if (local366.anInt439 < 0) {
								break;
							}
							local379 = Static87.method8101(local366.anInt511);
						} while (local379 == null || local379.aClass24Array1 == null || local379.aClass24Array1.length <= local366.anInt439 || local366 != local379.aClass24Array1[local366.anInt439]);
						Static284.method5153(local361);
					}
				}
				local366 = local361.aClass24_15;
				if (local366.anInt439 < 0) {
					break;
				}
				local379 = Static87.method8101(local366.anInt511);
			} while (local379 == null || local379.aClass24Array1 == null || local366.anInt439 >= local379.aClass24Array1.length || local366 != local379.aClass24Array1[local366.anInt439]);
			Static284.method5153(local361);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method2244() {
		if (Static529.anInt9623 == 14) {
			return;
		}
		Static407.anInt7704++;
		if (Static407.anInt7704 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static134.anInt3332 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static507.aRandom1.setSeed((long) Static134.anInt3332);
		}
		if (Static407.anInt7704 % 50 == 0) {
			Static57.anInt1931 = Static312.anInt6434;
			Static312.anInt6434 = 0;
			Static573.anInt10250 = Static18.anInt303;
			Static18.anInt303 = 0;
		}
		this.method2232();
		if (Static437.aClass84_1 != null) {
			Static437.aClass84_1.method2849();
		}
		Static622.method9063();
		Static338.method5844();
		Static449.aClass90_1.method8780();
		Static628.aClass9_1.method795();
		if (Static186.aClass20_4 != null) {
			Static186.aClass20_4.method7249((int) Static277.method5091());
		}
		Static429.method6864();
		Static558.anInt9991 = 0;
		Static266.anInt5672 = 0;
		for (@Pc(91) Interface16 local91 = Static449.aClass90_1.method8782(); local91 != null; local91 = Static449.aClass90_1.method8782()) {
			@Pc(97) int local97 = local91.method4432();
			if (local97 == 2 || local97 == 3) {
				@Pc(126) char local126 = local91.method4433();
				if (Static590.method8718() && (local126 == '`' || local126 == '§' || local126 == '²')) {
					if (Static458.method7145()) {
						Static47.method1690();
					} else {
						Static74.method2131();
					}
				} else if (Static266.anInt5672 < 128) {
					Static332.anInterface16Array1[Static266.anInt5672] = local91;
					Static266.anInt5672++;
				}
			} else if (local97 == 0 && Static558.anInt9991 < 75) {
				Static642.anInterface16Array2[Static558.anInt9991] = local91;
				Static558.anInt9991++;
			}
		}
		Static341.anInt6870 = 0;
		for (@Pc(176) Class2_Sub9 local176 = Static628.aClass9_1.method802(); local176 != null; local176 = Static628.aClass9_1.method802()) {
			@Pc(182) int local182 = local176.method7081();
			if (local182 == -1) {
				Static144.aClass341_32.method8528(local176);
			} else if (local182 == 6) {
				Static341.anInt6870 += local176.method7086();
			} else if (Static163.method3530(local182)) {
				Static253.aClass341_64.method8528(local176);
				if (Static253.aClass341_64.method8527() > 10) {
					Static253.aClass341_64.method8526();
				}
			}
		}
		if (Static458.method7145()) {
			Static237.method4457();
		}
		if (Static389.method6421(Static529.anInt9623)) {
			Static255.method4695();
			Static335.method5742();
		} else if (Static579.method8630(Static529.anInt9623)) {
			Static599.method8796();
		}
		if (Static461.method6813(Static529.anInt9623) && !Static579.method8630(Static529.anInt9623)) {
			this.method2243();
			Static143.method7506();
			Static323.method5595();
		} else if (Static115.method2851(Static529.anInt9623) && !Static579.method8630(Static529.anInt9623)) {
			this.method2243();
			Static323.method5595();
		} else if (Static529.anInt9623 == 12) {
			Static323.method5595();
		} else if (Static104.method2676(Static529.anInt9623) && !Static579.method8630(Static529.anInt9623)) {
			Static333.method5729();
		} else if (Static529.anInt9623 == 13) {
			Static323.method5595();
			if (Static173.anInt4167 != -3 && Static173.anInt4167 != 2 && Static173.anInt4167 != 15) {
				Static68.method2104(false);
			}
		}
		Static215.method4187(Static186.aClass20_4);
		Static253.aClass341_64.method8526();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method2217() {
		if (Static334.anApplet2 != null && Static639.aCanvas10 == null && !Static268.aClass370_3.aBoolean740) {
			try {
				@Pc(18) Class local18 = Static334.anApplet2.getClass();
				@Pc(22) Field local22 = local18.getDeclaredField("canvas");
				Static639.aCanvas10 = (Canvas) local22.get(Static334.anApplet2);
				local22.set(Static334.anApplet2, null);
				if (Static639.aCanvas10 != null) {
					return;
				}
			} catch (@Pc(35) Exception local35) {
			}
		}
		super.method2217();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method2246() {
		if (Static529.anInt9623 == 14) {
			return;
		}
		@Pc(17) long local17 = Static531.method6598() / 1000000L - Static308.aLong141;
		Static308.aLong141 = Static531.method6598() / 1000000L;
		@Pc(29) boolean local29 = Static544.method8157();
		if (local29 && Static301.aBoolean468 && Static538.aClass33_45 != null) {
			Static538.aClass33_45.method7217();
		}
		if (Static568.method8487(Static529.anInt9623)) {
			if (Static240.aLong113 != 0L && Static277.method5091() > Static240.aLong113) {
				Static317.method5514(Static89.method2478(), Static81.anInt2495, false, Static541.anInt9717);
			} else if (!Static186.aClass20_4.method7258() && Static483.aBoolean653) {
				Static634.method9197();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static232.aFrame1 == null) {
			@Pc(77) Container local77;
			if (Static255.aFrame2 != null) {
				local77 = Static255.aFrame2;
			} else if (Static334.anApplet2 == null) {
				local77 = Static297.anApplet_Sub1_1;
			} else {
				local77 = Static334.anApplet2;
			}
			local89 = local77.getSize().width;
			local93 = local77.getSize().height;
			if (local77 == Static255.aFrame2) {
				@Pc(99) Insets local99 = Static255.aFrame2.getInsets();
				local89 -= local99.left + local99.right;
				local93 -= local99.top + local99.bottom;
			}
			if (Static584.anInt5338 != local89 || local93 != Static330.anInt6688 || Static291.aBoolean463) {
				if (Static186.aClass20_4 == null || Static186.aClass20_4.method7298()) {
					Static407.method6619();
				} else {
					Static330.anInt6688 = local93;
					Static584.anInt5338 = local89;
				}
				Static240.aLong113 = Static277.method5091() + 500L;
				Static291.aBoolean463 = false;
			}
		}
		if (Static232.aFrame1 != null && !Static437.aBoolean575 && Static568.method8487(Static529.anInt9623)) {
			Static317.method5514(Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919(), -1, false, -1);
		}
		@Pc(167) boolean local167 = false;
		if (Static249.aBoolean394) {
			local167 = true;
			Static249.aBoolean394 = false;
		}
		if (local167) {
			Static390.method6424();
		}
		if (Static186.aClass20_4 != null && Static186.aClass20_4.method7258() || Static89.method2478() != 1) {
			Static132.method3031();
		}
		if (Static389.method6421(Static529.anInt9623)) {
			Static429.method6858(local167);
		} else if (Static601.method8802(Static529.anInt9623)) {
			Static392.method6460();
		} else if (Static461.method6814(Static529.anInt9623)) {
			Static392.method6460();
		} else if (Static579.method8630(Static529.anInt9623)) {
			if (Static234.anInt5126 == 1) {
				if (Static60.anInt2005 > Static633.anInt10995) {
					Static633.anInt10995 = Static60.anInt2005;
				}
				local89 = (Static633.anInt10995 - Static60.anInt2005) * 50 / Static633.anInt10995;
				Static151.method3426(true, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_14.method8691(Static476.anInt8915) + "<br>(" + local89 + "%)", Static186.aClass20_4);
			} else if (Static234.anInt5126 == 2) {
				if (Static228.anInt5049 < Static405.anInt7686) {
					Static228.anInt5049 = Static405.anInt7686;
				}
				local89 = (Static228.anInt5049 - Static405.anInt7686) * 50 / Static228.anInt5049 + 50;
				Static151.method3426(true, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_14.method8691(Static476.anInt8915) + "<br>(" + local89 + "%)", Static186.aClass20_4);
			} else {
				Static151.method3426(true, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_14.method8691(Static476.anInt8915), Static186.aClass20_4);
			}
		} else if (Static529.anInt9623 == 10) {
			Static636.method9201(local17);
		} else if (Static529.anInt9623 == 13) {
			Static151.method3426(false, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_16.method8691(Static476.anInt8915) + "<br>" + Static588.aClass351_17.method8691(Static476.anInt8915), Static186.aClass20_4);
		}
		if (Static626.anInt1506 == 3) {
			for (local89 = 0; local89 < Static511.anInt9364; local89++) {
				@Pc(360) Rectangle local360 = Class272.aRectangleArray2[local89];
				if (Static437.aBooleanArray20[local89]) {
					Static186.aClass20_4.method7271(local360.width, local360.y, -65281, local360.x, local360.height);
				} else if (Static60.aBooleanArray9[local89]) {
					Static186.aClass20_4.method7271(local360.width, local360.y, -65536, local360.x, local360.height);
				} else {
					Static186.aClass20_4.method7271(local360.width, local360.y, -16711936, local360.x, local360.height);
				}
			}
		}
		if (Static458.method7145()) {
			Static191.method3919(Static186.aClass20_4);
		}
		if (Static268.aClass370_3.aBoolean740 && Static568.method8487(Static529.anInt9623) && Static626.anInt1506 == 0 && Static89.method2478() == 1 && !local167) {
			local89 = 0;
			for (local93 = 0; local93 < Static511.anInt9364; local93++) {
				if (Static60.aBooleanArray9[local93]) {
					Static60.aBooleanArray9[local93] = false;
					Static52.aRectangleArray1[local89++] = Class272.aRectangleArray2[local93];
				}
			}
			try {
				if (Static487.aBoolean676) {
					Static390.method6422(local89, Static52.aRectangleArray1);
				} else {
					Static186.aClass20_4.method7260(Static52.aRectangleArray1, local89);
				}
			} catch (@Pc(483) Exception_Sub1 local483) {
			}
		} else if (!Static389.method6421(Static529.anInt9623)) {
			for (local89 = 0; local89 < Static511.anInt9364; local89++) {
				Static60.aBooleanArray9[local89] = false;
			}
			try {
				if (Static487.aBoolean676) {
					Static246.method4549();
				} else {
					Static186.aClass20_4.method7292();
				}
			} catch (@Pc(512) Exception_Sub1 local512) {
				Static408.method6625(local512.getMessage() + " (Recovered) " + this.method2211(), local512);
				Static316.method5509(false, 0);
			}
		}
		Static277.method5090();
		local89 = Static74.aClass2_Sub13_5.aClass14_Sub24_1.method8147();
		if (local89 == 0) {
			Static190.method3914(15L);
		} else if (local89 == 1) {
			Static190.method3914(10L);
		} else if (local89 == 2) {
			Static190.method3914(5L);
		} else if (local89 == 3) {
			Static190.method3914(2L);
		}
		if (Static78.aBoolean206) {
			Static460.method7177();
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub19_1.method6726() == 1 && Static529.anInt9623 == 3 && Static475.anInt10143 != -1) {
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub19_1, 0);
			Static318.method5531();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method2211() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static84.anInt2565 + "," + Static32.anInt723 + "," + Static47.anInt1794 + "," + Static209.anInt4742 + "|";
			if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 != null) {
				local7 = local7 + "2)" + Static12.anInt172 + "," + (Static84.anInt2565 + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0]) + "," + (Static32.anInt723 + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0]) + "|";
			}
			local7 = local7 + "3)" + Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() + "|4)" + Static74.aClass2_Sub13_5.aClass14_Sub27_1.method8731() + "|5)" + Static89.method2478() + "|6)" + Static81.anInt2497 + "," + Static423.anInt7984 + "|";
			local7 = local7 + "7)" + Static74.aClass2_Sub13_5.aClass14_Sub8_1.method3544() + "|";
			local7 = local7 + "8)" + Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864() + "|";
			local7 = local7 + "9)" + Static74.aClass2_Sub13_5.aClass14_Sub25_1.method8177() + "|";
			local7 = local7 + "10)" + Static74.aClass2_Sub13_5.aClass14_Sub4_1.method2491() + "|";
			local7 = local7 + "11)" + Static74.aClass2_Sub13_5.aClass14_Sub2_1.method655() + "|";
			local7 = local7 + "12)" + Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() + "|";
			local7 = local7 + "13)" + Static514.anInt9425 + "|";
			local7 = local7 + "14)" + Static529.anInt9623;
			if (Static494.aClass2_Sub16_1 != null) {
				local7 = local7 + "|15)" + Static494.aClass2_Sub16_1.anInt3436;
			}
			try {
				if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 2) {
					@Pc(246) Class local246 = Class.forName("java.lang.ClassLoader");
					@Pc(250) Field local250 = local246.getDeclaredField("nativeLibraries");
					@Pc(253) Class local253 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(263) Method local263 = local253.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local263.invoke(local250, Boolean.TRUE);
					@Pc(286) Vector local286 = (Vector) local250.get(client.class.getClassLoader());
					for (@Pc(288) int local288 = 0; local286.size() > local288; local288++) {
						try {
							@Pc(294) Object local294 = local286.elementAt(local288);
							@Pc(299) Field local299 = local294.getClass().getDeclaredField("name");
							local263.invoke(local299, Boolean.TRUE);
							try {
								@Pc(314) String local314 = (String) local299.get(local294);
								if (local314 != null && local314.indexOf("sw3d.dll") != -1) {
									@Pc(326) Field local326 = local294.getClass().getDeclaredField("handle");
									local263.invoke(local326, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local326.getLong(local294));
									local263.invoke(local326, Boolean.FALSE);
								}
							} catch (@Pc(362) Throwable local362) {
							}
							local263.invoke(local299, Boolean.FALSE);
						} catch (@Pc(374) Throwable local374) {
						}
					}
				}
			} catch (@Pc(386) Throwable local386) {
			}
			local7 = local7 + "]";
		} catch (@Pc(397) Throwable local397) {
		}
		return local7;
	}
}
