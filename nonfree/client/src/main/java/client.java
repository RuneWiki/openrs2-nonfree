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
				Static345.method5670("Argument count");
			}
			Static300.aClass278_2 = new Class278();
			Static300.aClass278_2.anInt8394 = Integer.parseInt(arg0[0]);
			Static303.aClass278_3 = new Class278();
			Static303.aClass278_3.anInt8394 = Integer.parseInt(arg0[1]);
			Static134.aClass278_1 = new Class278();
			Static134.aClass278_1.anInt8394 = Integer.parseInt(arg0[2]);
			Static85.aClass107_2 = Static109.aClass107_3;
			if (arg0[3].equals("live")) {
				Static623.aClass244_6 = Static559.aClass244_5;
			} else if (arg0[3].equals("rc")) {
				Static623.aClass244_6 = Static115.aClass244_4;
			} else if (arg0[3].equals("wip")) {
				Static623.aClass244_6 = Static447.aClass244_3;
			} else {
				Static345.method5670("modewhat");
			}
			Static380.anInt7247 = Static598.method8181(arg0[4]);
			if (Static380.anInt7247 == -1) {
				if (arg0[4].equals("english")) {
					Static380.anInt7247 = 0;
				} else if (arg0[4].equals("german")) {
					Static380.anInt7247 = 1;
				} else {
					Static345.method5670("language");
				}
			}
			Static193.aBoolean378 = false;
			Static637.aBoolean860 = false;
			if (arg0[5].equals("game0")) {
				Static648.aClass62_16 = Static592.aClass62_13;
			} else if (arg0[5].equals("game1")) {
				Static648.aClass62_16 = Static518.aClass62_15;
			} else if (arg0[5].equals("game2")) {
				Static648.aClass62_16 = Static603.aClass62_14;
			} else if (arg0[5].equals("game3")) {
				Static648.aClass62_16 = Static278.aClass62_9;
			} else {
				Static345.method5670("game");
			}
			Static331.aString72 = null;
			Static455.aString92 = "";
			Static595.aBoolean821 = true;
			Static518.aBoolean849 = true;
			Static486.aBoolean732 = false;
			Static313.aBoolean541 = false;
			Static134.anInt3486 = 0;
			Static356.anInt6937 = 0;
			Static100.aLong55 = 0L;
			Static191.anInt4461 = Static648.aClass62_16.anInt2526;
			Static226.aString47 = null;
			Static544.anInt9349 = 0;
			@Pc(188) client local188 = new client();
			Static321.aClient2 = local188;
			local188.method1809(Static648.aClass62_16.aString18, Static623.aClass244_6.method6374() + 32);
			Static599.aFrame141.setLocation(40, 40);
		} catch (@Pc(212) Exception local212) {
			Static544.method7724(null, local212);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method1816() {
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 2) {
			this.method1839();
			return;
		}
		try {
			this.method1839();
		} catch (@Pc(14) ThreadDeath local14) {
			throw local14;
		} catch (@Pc(17) Throwable local17) {
			Static544.method7724(local17.getMessage() + " (Recovered) " + this.method1821(), local17);
			Static111.aBoolean235 = true;
			Static559.method7893(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method1824() {
		if (Static581.anInt9720 == 14) {
			return;
		}
		Static251.anInt5580++;
		if (Static251.anInt5580 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static99.anInt2578 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static121.aRandom2.setSeed((long) Static99.anInt2578);
		}
		if (Static251.anInt5580 % 50 == 0) {
			Static73.anInt1918 = Static214.anInt7032;
			Static419.anInt7812 = Static197.anInt4621;
			Static214.anInt7032 = 0;
			Static197.anInt4621 = 0;
		}
		this.method1832();
		if (Static638.aClass331_1 != null) {
			Static638.aClass331_1.method7989();
		}
		Static297.method5117();
		Static234.method4498();
		Static326.aClass238_1.method6951();
		Static501.aClass59_5.method4101();
		if (Static47.aClass33_3 != null) {
			Static47.aClass33_3.method6201((int) Static444.method6719());
		}
		Static480.method7066();
		Static343.anInt6755 = 0;
		Static324.anInt6510 = 0;
		for (@Pc(94) Interface13 local94 = Static326.aClass238_1.method6949(); local94 != null; local94 = Static326.aClass238_1.method6949()) {
			@Pc(100) int local100 = local94.method746();
			if (local100 == 2 || local100 == 3) {
				@Pc(112) char local112 = local94.method745();
				if (Static8.method104() && (local112 == '`' || local112 == '§' || local112 == '²')) {
					if (Static405.method6401()) {
						Static143.method3167();
					} else {
						Static344.method5654();
					}
				} else if (Static343.anInt6755 < 128) {
					Static124.anInterface13Array1[Static343.anInt6755] = local94;
					Static343.anInt6755++;
				}
			} else if (local100 == 0 && Static324.anInt6510 < 75) {
				Static608.anInterface13Array4[Static324.anInt6510] = local94;
				Static324.anInt6510++;
			}
		}
		Static305.anInt6116 = 0;
		for (@Pc(178) Class3_Sub30 local178 = Static501.aClass59_5.method4104(); local178 != null; local178 = Static501.aClass59_5.method4104()) {
			@Pc(184) int local184 = local178.method6362();
			if (local184 == -1) {
				Static271.aClass276_39.method6906(local178);
			} else if (local184 == 6) {
				Static305.anInt6116 += local178.method6366();
			} else if (Static174.method3568(local184)) {
				Static264.aClass276_37.method6906(local178);
				if (Static264.aClass276_37.method6918() > 10) {
					Static264.aClass276_37.method6911();
				}
			}
		}
		if (Static405.method6401()) {
			Static186.method3749();
		}
		if (Static335.method5572(Static581.anInt9720)) {
			Static637.method8382();
			Static123.method2861();
		} else if (Static556.method7824(Static581.anInt9720)) {
			Static221.method4286();
		}
		if (Static408.method6434(Static581.anInt9720) && !Static556.method7824(Static581.anInt9720)) {
			this.method1840();
			Static271.method4926();
			Static443.method6711();
		} else if (Static135.method3115(Static581.anInt9720) && !Static556.method7824(Static581.anInt9720)) {
			this.method1840();
			Static443.method6711();
		} else if (Static581.anInt9720 == 12) {
			Static443.method6711();
		} else if (Static405.method6400(Static581.anInt9720) && !Static556.method7824(Static581.anInt9720)) {
			Static491.method7201();
		} else if (Static581.anInt9720 == 13) {
			Static443.method6711();
			if (Static30.anInt570 != -3 && Static30.anInt570 != 2 && Static30.anInt570 != 15) {
				Static229.method4376(false);
			}
		}
		Static546.method7616(Static47.aClass33_3);
		Static264.aClass276_37.method6911();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1815() {
		if (Static555.aBoolean799) {
			Static176.method3582();
		}
		Static141.method3156();
		if (Static47.aClass33_3 != null) {
			Static47.aClass33_3.method6151();
		}
		if (Static385.aFrame149 != null) {
			Static624.method8487(Static379.aClass228_6, Static385.aFrame149);
			Static385.aFrame149 = null;
		}
		if (Static412.aClass51_25 != null) {
			Static412.aClass51_25.method3508();
			Static412.aClass51_25 = null;
		}
		Static267.method4900();
		Static262.aClass65_2.method2524();
		Static366.aClass126_2.method3960();
		if (Static231.aClass282_1 != null) {
			Static231.aClass282_1.method6997();
			Static231.aClass282_1 = null;
		}
		try {
			Static169.aClass76_1.method2767();
			for (@Pc(59) int local59 = 0; local59 < 37; local59++) {
				Static287.aClass76Array1[local59].method2767();
			}
			Static485.aClass76_3.method2767();
			Static209.aClass76_2.method2767();
			Static26.method460();
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1812()) {
			return;
		}
		Static300.aClass278_2 = new Class278();
		Static300.aClass278_2.anInt8394 = Integer.parseInt(this.getParameter("worldid"));
		Static303.aClass278_3 = new Class278();
		Static303.aClass278_3.anInt8394 = Integer.parseInt(this.getParameter("lobbyid"));
		Static303.aClass278_3.aString94 = this.getParameter("lobbyaddress");
		Static134.aClass278_1 = new Class278();
		Static134.aClass278_1.anInt8394 = Integer.parseInt(this.getParameter("demoid"));
		Static134.aClass278_1.aString94 = this.getParameter("demoaddress");
		Static85.aClass107_2 = Static482.method7083(Integer.parseInt(this.getParameter("modewhere")));
		if (Static85.aClass107_2 == Static109.aClass107_3) {
			Static85.aClass107_2 = Static559.aClass107_5;
		} else if (!Static408.method6433(Static85.aClass107_2) && Static624.aClass107_7 != Static85.aClass107_2) {
			Static85.aClass107_2 = Static624.aClass107_7;
		}
		Static623.aClass244_6 = Static283.method4955(Integer.parseInt(this.getParameter("modewhat")));
		if (Static447.aClass244_3 != Static623.aClass244_6 && Static115.aClass244_4 != Static623.aClass244_6 && Static623.aClass244_6 != Static559.aClass244_5) {
			Static623.aClass244_6 = Static559.aClass244_5;
		}
		try {
			Static380.anInt7247 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static380.anInt7247 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static637.aBoolean860 = true;
		} else {
			Static637.aBoolean860 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static193.aBoolean378 = true;
		} else {
			Static193.aBoolean378 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static614.aBoolean856 = true;
		} else {
			Static614.aBoolean856 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static648.aClass62_16 = Static592.aClass62_13;
			} else if (local152.equals("1")) {
				Static648.aClass62_16 = Static518.aClass62_15;
			} else if (local152.equals("2")) {
				Static648.aClass62_16 = Static603.aClass62_14;
			} else if (local152.equals("3")) {
				Static648.aClass62_16 = Static278.aClass62_9;
			}
		}
		try {
			Static134.anInt3486 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static134.anInt3486 = 0;
		}
		Static236.aString49 = this.getParameter("quiturl");
		Static455.aString92 = this.getParameter("settings");
		if (Static455.aString92 == null) {
			Static455.aString92 = "";
		}
		Static207.aBoolean425 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static544.anInt9349 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static544.anInt9349 = 0;
			}
		}
		Static191.anInt4461 = Integer.parseInt(this.getParameter("colourid"));
		if (Static191.anInt4461 < 0 || Static191.anInt4461 >= Static515.aColorArray5.length) {
			Static191.anInt4461 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static595.aBoolean821 = true;
			Static518.aBoolean849 = true;
		}
		@Pc(261) String local261 = this.getParameter("frombilling");
		if (local261 != null && local261.equals("true")) {
			Static313.aBoolean541 = true;
		}
		Static226.aString47 = this.getParameter("sskey");
		if (Static226.aString47 != null && Static226.aString47.length() < 2) {
			Static226.aString47 = null;
		}
		@Pc(285) String local285 = this.getParameter("force64mb");
		if (local285 != null && local285.equals("true")) {
			Static486.aBoolean732 = true;
		}
		@Pc(297) String local297 = this.getParameter("worldflags");
		if (local297 != null) {
			try {
				Static356.anInt6937 = Integer.parseInt(local297);
			} catch (@Pc(304) Exception local304) {
			}
		}
		@Pc(309) String local309 = this.getParameter("userFlow");
		if (local309 != null) {
			try {
				Static100.aLong55 = Long.parseLong(local309);
			} catch (@Pc(316) NumberFormatException local316) {
			}
		}
		Static331.aString72 = this.getParameter("additionalInfo");
		if (Static331.aString72 != null && Static331.aString72.length() > 50) {
			Static331.aString72 = null;
		}
		Static321.aClient2 = this;
		if (Static648.aClass62_16 == Static592.aClass62_13) {
			Static199.anInt4634 = 765;
			Static523.anInt9075 = 503;
		} else if (Static518.aClass62_15 == Static648.aClass62_16) {
			Static199.anInt4634 = 640;
			Static523.anInt9075 = 480;
		}
		this.method1810(Static623.aClass244_6.method6374() + 32, Static648.aClass62_16.aString18, Static199.anInt4634, Static523.anInt9075);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1819() {
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 2) {
			this.method1824();
			return;
		}
		try {
			this.method1824();
		} catch (@Pc(14) ThreadDeath local14) {
			throw local14;
		} catch (@Pc(17) Throwable local17) {
			Static544.method7724(local17.getMessage() + " (Recovered) " + this.method1821(), local17);
			Static111.aBoolean235 = true;
			Static559.method7893(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method1826(@OriginalArg(0) int arg0) {
		Static388.aClass376_28 = null;
		Static167.anInt3998 = 0;
		Static168.aClass303_2 = null;
		Static262.aClass65_2.anInt2591++;
		Static262.aClass65_2.anInt2592 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1813() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1827() {
		if (Static262.aClass65_2.anInt2591 > Static292.anInt5928) {
			Static621.aClass278_5.method6940();
			Static310.anInt6164 = (Static262.aClass65_2.anInt2591 - 1) * 5 * 50;
			if (Static310.anInt6164 > 3000) {
				Static310.anInt6164 = 3000;
			}
			if (Static262.aClass65_2.anInt2591 >= 2 && Static262.aClass65_2.anInt2592 == 6) {
				this.method1823("js5connect_outofdate");
				Static581.anInt9720 = 14;
				return;
			}
			if (Static262.aClass65_2.anInt2591 >= 4 && Static262.aClass65_2.anInt2592 == -1) {
				this.method1823("js5crc");
				Static581.anInt9720 = 14;
				return;
			}
			if (Static262.aClass65_2.anInt2591 >= 4 && Static335.method5572(Static581.anInt9720)) {
				if (Static262.aClass65_2.anInt2592 == 7 || Static262.aClass65_2.anInt2592 == 9) {
					this.method1823("js5connect_full");
				} else if (Static262.aClass65_2.anInt2592 <= 0) {
					this.method1823("js5io");
				} else if (Static491.aString96 == null) {
					this.method1823("js5connect");
				} else {
					this.method1823("js5proxy_" + Static491.aString96.trim());
				}
				Static581.anInt9720 = 14;
				return;
			}
		}
		Static292.anInt5928 = Static262.aClass65_2.anInt2591;
		if (Static310.anInt6164 > 0) {
			Static310.anInt6164--;
			return;
		}
		try {
			if (Static167.anInt3998 == 0) {
				Static388.aClass376_28 = Static621.aClass278_5.method6939(Static379.aClass228_6);
				Static167.anInt3998++;
			}
			if (Static167.anInt3998 == 1) {
				if (Static388.aClass376_28.anInt10510 == 2) {
					if (Static388.aClass376_28.anObject19 != null) {
						Static491.aString96 = (String) Static388.aClass376_28.anObject19;
					}
					this.method1826(1000);
					return;
				}
				if (Static388.aClass376_28.anInt10510 == 1) {
					Static167.anInt3998++;
				}
			}
			if (Static167.anInt3998 == 2) {
				Static168.aClass303_2 = new Class303((Socket) Static388.aClass376_28.anObject19, Static379.aClass228_6, 25000);
				@Pc(196) Class3_Sub15 local196 = new Class3_Sub15(5);
				local196.method8448(Static577.aClass240_30.anInt7401);
				local196.method8419(636);
				Static168.aClass303_2.method7404(local196.aByteArray106, 5);
				Static167.anInt3998++;
				Static541.aLong241 = Static444.method6719();
			}
			if (Static167.anInt3998 == 3) {
				if (Static335.method5572(Static581.anInt9720) || Static168.aClass303_2.method7400() > 0) {
					@Pc(253) int local253 = Static168.aClass303_2.method7398();
					if (local253 != 0) {
						this.method1826(local253);
						return;
					}
					Static167.anInt3998++;
				} else if (Static444.method6719() - Static541.aLong241 > 30000L) {
					this.method1826(1001);
					return;
				}
			}
			if (Static167.anInt3998 == 4) {
				@Pc(286) boolean local286 = Static335.method5572(Static581.anInt9720) || Static408.method6434(Static581.anInt9720) || Static135.method3115(Static581.anInt9720);
				@Pc(289) Class24[] local289 = Static28.method490();
				@Pc(297) Class3_Sub15 local297 = new Class3_Sub15(local289.length * 4);
				Static168.aClass303_2.method7399(local297.aByteArray106.length, 0, local297.aByteArray106);
				for (@Pc(308) int local308 = 0; local308 < local289.length; local308++) {
					local289[local308].method493(local297.method8402());
				}
				Static262.aClass65_2.method2527(!local286, Static168.aClass303_2);
				Static167.anInt3998 = 0;
				Static388.aClass376_28 = null;
				Static168.aClass303_2 = null;
			}
		} catch (@Pc(342) IOException local342) {
			this.method1826(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1832() {
		@Pc(13) boolean local13 = Static262.aClass65_2.method2517();
		if (!local13) {
			this.method1827();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	@Override
	public synchronized void method1822() {
		if (Static632.anApplet2 != null && Static177.aCanvas10 == null && !Static379.aClass228_6.aBoolean613) {
			try {
				@Pc(13) Class local13 = Static632.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static177.aCanvas10 = (Canvas) local17.get(Static632.anApplet2);
				local17.set(Static632.anApplet2, null);
				if (Static177.aCanvas10 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1822();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1818() {
		if (Static486.aBoolean732) {
			Static6.anInt66 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static531.method7546();
		Static366.aClass126_2 = new Class126(Static379.aClass228_6);
		Static262.aClass65_2 = new Class65();
		Static382.method6056(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static624.aClass107_7 != Static85.aClass107_2) {
			Static28.aByteArrayArray1 = new byte[50][];
		}
		Static552.aClass3_Sub48_30 = Static602.method8212();
		if (Static624.aClass107_7 == Static85.aClass107_2) {
			Static300.aClass278_2.aString94 = this.getCodeBase().getHost();
		} else if (Static408.method6433(Static85.aClass107_2)) {
			Static300.aClass278_2.aString94 = this.getCodeBase().getHost();
			Static300.aClass278_2.anInt8398 = Static300.aClass278_2.anInt8394 + 40000;
			Static303.aClass278_3.anInt8398 = Static303.aClass278_3.anInt8394 + 40000;
			Static300.aClass278_2.anInt8395 = Static300.aClass278_2.anInt8394 + 50000;
			Static134.aClass278_1.anInt8398 = Static134.aClass278_1.anInt8394 + 40000;
			Static303.aClass278_3.anInt8395 = Static303.aClass278_3.anInt8394 + 50000;
			Static134.aClass278_1.anInt8395 = Static134.aClass278_1.anInt8394 + 50000;
		} else if (Static109.aClass107_3 == Static85.aClass107_2) {
			Static300.aClass278_2.aString94 = "127.0.0.1";
			Static303.aClass278_3.aString94 = "127.0.0.1";
			Static300.aClass278_2.anInt8398 = Static300.aClass278_2.anInt8394 + 40000;
			Static134.aClass278_1.aString94 = "127.0.0.1";
			Static303.aClass278_3.anInt8398 = Static303.aClass278_3.anInt8394 + 40000;
			Static300.aClass278_2.anInt8395 = Static300.aClass278_2.anInt8394 + 50000;
			Static134.aClass278_1.anInt8398 = Static134.aClass278_1.anInt8394 + 40000;
			Static303.aClass278_3.anInt8395 = Static303.aClass278_3.anInt8394 + 50000;
			Static134.aClass278_1.anInt8395 = Static134.aClass278_1.anInt8394 + 50000;
		}
		if (Static648.aClass62_16 == Static592.aClass62_13) {
			Static320.aBoolean554 = false;
		}
		Static621.aClass278_5 = Static300.aClass278_2;
		Static2.aShortArray1 = Static323.aShortArray93 = Static18.aShortArray2 = Static251.aShortArray78 = new short[256];
		if (Static518.aClass62_15 == Static648.aClass62_16) {
			Static109.aBoolean233 = true;
			Static351.aShortArrayArray14 = Static253.aShortArrayArray7;
			Static315.anInt6423 = 0;
			Static621.anInt10313 = 16777215;
			Static221.aShortArrayArrayArray1 = Static325.aShortArrayArrayArray3;
		} else if (Static278.aClass62_9 == Static648.aClass62_16) {
			Static221.aShortArrayArrayArray1 = Static377.aShortArrayArrayArray4;
			Static351.aShortArrayArray14 = Static322.aShortArrayArray9;
		} else {
			Static221.aShortArrayArrayArray1 = Static237.aShortArrayArrayArray2;
			Static351.aShortArrayArray14 = Static348.aShortArrayArray3;
		}
		try {
			Static425.aClipboard3 = Static321.aClient2.getToolkit().getSystemClipboard();
		} catch (@Pc(219) Exception local219) {
		}
		Static326.aClass238_1 = Static100.method2544(Static177.aCanvas10);
		Static501.aClass59_5 = Static104.method2564(Static177.aCanvas10);
		try {
			if (Static379.aClass228_6.aClass150_4 != null) {
				Static169.aClass76_1 = new Class76(Static379.aClass228_6.aClass150_4, 5200, 0);
				for (@Pc(248) int local248 = 0; local248 < 37; local248++) {
					Static287.aClass76Array1[local248] = new Class76(Static379.aClass228_6.aClass150Array1[local248], 6000, 0);
				}
				Static485.aClass76_3 = new Class76(Static379.aClass228_6.aClass150_2, 6000, 0);
				Static433.aClass370_3 = new Class370(255, Static169.aClass76_1, Static485.aClass76_3, 500000);
				Static209.aClass76_2 = new Class76(Static379.aClass228_6.aClass150_3, 24, 0);
				Static379.aClass228_6.aClass150_3 = null;
				Static379.aClass228_6.aClass150_2 = null;
				Static379.aClass228_6.aClass150Array1 = null;
				Static379.aClass228_6.aClass150_4 = null;
			}
		} catch (@Pc(304) IOException local304) {
			Static485.aClass76_3 = null;
			Static433.aClass370_3 = null;
			Static169.aClass76_1 = null;
			Static209.aClass76_2 = null;
		}
		if (Static624.aClass107_7 != Static85.aClass107_2) {
			Static264.aBoolean502 = true;
		}
		Static472.aString64 = Static287.aClass176_12.method4986(Static380.anInt7247);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1821() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static446.anInt8090 + "," + Static124.anInt3150 + "," + Static394.anInt7540 + "," + Static462.anInt8391 + "|";
			if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 != null) {
				local7 = local7 + "2)" + Static552.anInt9440 + "," + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] + Static446.anInt8090) + "," + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] + Static124.anInt3150) + "|";
			}
			local7 = local7 + "3)" + Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() + "|4)" + Static552.aClass3_Sub48_30.aClass23_Sub24_1.method6648() + "|5)" + Static626.method8490() + "|6)" + Static114.anInt2970 + "," + Static256.anInt5669 + "|";
			local7 = local7 + "7)" + Static552.aClass3_Sub48_30.aClass23_Sub7_1.method3329() + "|";
			local7 = local7 + "8)" + Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537() + "|";
			local7 = local7 + "9)" + Static552.aClass3_Sub48_30.aClass23_Sub26_1.method7099() + "|";
			local7 = local7 + "10)" + Static552.aClass3_Sub48_30.aClass23_Sub4_1.method1180() + "|";
			local7 = local7 + "11)" + Static552.aClass3_Sub48_30.aClass23_Sub19_1.method5517() + "|";
			local7 = local7 + "12)" + Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() + "|";
			local7 = local7 + "13)" + Static6.anInt66 + "|";
			local7 = local7 + "14)" + Static581.anInt9720;
			if (Static2.aClass3_Sub23_1 != null) {
				local7 = local7 + "|15)" + Static2.aClass3_Sub23_1.anInt4394;
			}
			try {
				if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 2) {
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
									@Pc(328) Field local328 = local296.getClass().getDeclaredField("handle");
									local265.invoke(local328, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local328.getLong(local296));
									local265.invoke(local328, Boolean.FALSE);
								}
							} catch (@Pc(364) Throwable local364) {
							}
							local265.invoke(local301, Boolean.FALSE);
						} catch (@Pc(376) Throwable local376) {
						}
					}
				}
			} catch (@Pc(388) Throwable local388) {
			}
			local7 = local7 + "]";
		} catch (@Pc(399) Throwable local399) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1839() {
		if (Static581.anInt9720 == 14) {
			return;
		}
		@Pc(17) long local17 = Static337.method5581() / 1000000L - Static287.aLong140;
		Static287.aLong140 = Static337.method5581() / 1000000L;
		@Pc(25) boolean local25 = Static457.method6873();
		if (local25 && Static48.aBoolean89 && Static189.aClass122_1 != null) {
			Static189.aClass122_1.method6806();
		}
		if (Static297.method5115(Static581.anInt9720)) {
			if (Static594.aLong259 != 0L && Static444.method6719() > Static594.aLong259) {
				Static494.method7243(Static1.anInt10388, Static626.method8490(), Static135.anInt3496, false);
			} else if (!Static47.aClass33_3.method6186() && Static360.aBoolean606) {
				Static605.method8262();
			}
		}
		@Pc(87) int local87;
		@Pc(91) int local91;
		if (Static385.aFrame149 == null) {
			@Pc(73) Container local73;
			if (Static599.aFrame141 != null) {
				local73 = Static599.aFrame141;
			} else if (Static632.anApplet2 == null) {
				local73 = Static36.anApplet_Sub1_1;
			} else {
				local73 = Static632.anApplet2;
			}
			local87 = local73.getSize().width;
			local91 = local73.getSize().height;
			if (Static599.aFrame141 == local73) {
				@Pc(97) Insets local97 = Static599.aFrame141.getInsets();
				local91 -= local97.top + local97.bottom;
				local87 -= local97.left + local97.right;
			}
			if (local87 != Static354.anInt6929 || local91 != Static396.anInt7575 || Static439.aBoolean678) {
				if (Static47.aClass33_3 == null || Static47.aClass33_3.method6166()) {
					Static531.method7546();
				} else {
					Static396.anInt7575 = local91;
					Static354.anInt6929 = local87;
				}
				Static594.aLong259 = Static444.method6719() + 500L;
				Static439.aBoolean678 = false;
			}
		}
		if (Static385.aFrame149 != null && !Static386.aBoolean722 && Static297.method5115(Static581.anInt9720)) {
			Static494.method7243(-1, Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448(), -1, false);
		}
		@Pc(165) boolean local165 = false;
		if (Static70.aBoolean147) {
			local165 = true;
			Static70.aBoolean147 = false;
		}
		if (local165) {
			Static140.method3138();
		}
		if (Static47.aClass33_3 != null && Static47.aClass33_3.method6186() || Static626.method8490() != 1) {
			Static594.method8139();
		}
		if (Static335.method5572(Static581.anInt9720)) {
			Static600.method6709(local165);
		} else if (Static193.method3842(Static581.anInt9720)) {
			Static405.method6398();
		} else if (Static429.method6585(Static581.anInt9720)) {
			Static405.method6398();
		} else if (Static556.method7824(Static581.anInt9720)) {
			if (Static621.anInt10312 == 1) {
				if (Static276.anInt5845 < Static375.anInt7103) {
					Static276.anInt5845 = Static375.anInt7103;
				}
				local87 = (Static276.anInt5845 - Static375.anInt7103) * 50 / Static276.anInt5845;
				Static646.method8660(true, Static424.aClass315_16, Static47.aClass33_3, Static528.aClass25_7, Static287.aClass176_12.method4986(Static380.anInt7247) + "<br>(" + local87 + "%)");
			} else if (Static621.anInt10312 == 2) {
				if (Static320.anInt6482 > Static50.anInt1086) {
					Static50.anInt1086 = Static320.anInt6482;
				}
				local87 = (Static50.anInt1086 - Static320.anInt6482) * 50 / Static50.anInt1086 + 50;
				Static646.method8660(true, Static424.aClass315_16, Static47.aClass33_3, Static528.aClass25_7, Static287.aClass176_12.method4986(Static380.anInt7247) + "<br>(" + local87 + "%)");
			} else {
				Static646.method8660(true, Static424.aClass315_16, Static47.aClass33_3, Static528.aClass25_7, Static287.aClass176_12.method4986(Static380.anInt7247));
			}
		} else if (Static581.anInt9720 == 10) {
			Static77.method3506(local17);
		} else if (Static581.anInt9720 == 13) {
			Static646.method8660(false, Static424.aClass315_16, Static47.aClass33_3, Static528.aClass25_7, Static287.aClass176_14.method4986(Static380.anInt7247) + "<br>" + Static287.aClass176_15.method4986(Static380.anInt7247));
		}
		if (Static94.anInt2529 == 3) {
			for (local87 = 0; local87 < Static457.anInt8300; local87++) {
				@Pc(363) Rectangle local363 = Class160.aRectangleArray2[local87];
				if (Static73.aBooleanArray3[local87]) {
					Static47.aClass33_3.method6156(local363.width, local363.x, local363.height, -65281, local363.y);
				} else if (Static441.aBooleanArray17[local87]) {
					Static47.aClass33_3.method6156(local363.width, local363.x, local363.height, -65536, local363.y);
				} else {
					Static47.aClass33_3.method6156(local363.width, local363.x, local363.height, -16711936, local363.y);
				}
			}
		}
		if (Static405.method6401()) {
			Static602.method8214(Static47.aClass33_3);
		}
		if (Static379.aClass228_6.aBoolean613 && Static297.method5115(Static581.anInt9720) && Static94.anInt2529 == 0 && Static626.method8490() == 1 && !local165) {
			local87 = 0;
			for (local91 = 0; local91 < Static457.anInt8300; local91++) {
				if (Static441.aBooleanArray17[local91]) {
					Static441.aBooleanArray17[local91] = false;
					Static163.aRectangleArray1[local87++] = Class160.aRectangleArray2[local91];
				}
			}
			try {
				if (Static349.aBoolean590) {
					Static356.method5817(local87, Static163.aRectangleArray1);
				} else {
					Static47.aClass33_3.method6234(Static163.aRectangleArray1, local87);
				}
			} catch (@Pc(531) Exception_Sub1 local531) {
			}
		} else if (!Static335.method5572(Static581.anInt9720)) {
			for (local87 = 0; local87 < Static457.anInt8300; local87++) {
				Static441.aBooleanArray17[local87] = false;
			}
			try {
				if (Static349.aBoolean590) {
					Static410.method6440();
				} else {
					Static47.aClass33_3.method6170();
				}
			} catch (@Pc(465) Exception_Sub1 local465) {
				Static544.method7724(local465.getMessage() + " (Recovered) " + this.method1821(), local465);
				Static559.method7893(false, 0);
			}
		}
		Static126.method2897();
		local87 = Static552.aClass3_Sub48_30.aClass23_Sub11_1.method3629();
		if (local87 == 0) {
			Static500.method7308(15L);
		} else if (local87 == 1) {
			Static500.method7308(10L);
		} else if (local87 == 2) {
			Static500.method7308(5L);
		} else if (local87 == 3) {
			Static500.method7308(2L);
		}
		if (Static226.aBoolean452) {
			Static464.method6946();
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub15_1.method4695() == 1 && Static581.anInt9720 == 3 && Static530.anInt9144 != -1) {
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub15_1, 0);
			Static152.method3314();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1840() {
		@Pc(32) int local32;
		if (Static581.anInt9720 == 7 && Static621.anInt10311 == 0) {
			if (Static285.anInt5873 > 1) {
				Static285.anInt5873--;
				Static488.anInt8666 = Static244.anInt5487;
			}
			if (!Static433.aBoolean672) {
				Static137.method3124();
			}
			for (local32 = 0; local32 < 100 && Static16.method238(); local32++) {
			}
		}
		Static550.anInt9371++;
		Static484.method7112(null, -1, -1);
		Static169.method3524(null, -1, -1);
		Static555.method7817();
		Static244.anInt5487++;
		for (local32 = 0; local32 < Static234.anInt5314; local32++) {
			@Pc(72) Class2_Sub3_Sub1_Sub2_Sub1 local72 = Static482.aClass3_Sub49Array1[local32].aClass2_Sub3_Sub1_Sub2_Sub1_2;
			if (local72 != null) {
				@Pc(78) byte local78 = local72.aClass22_1.aByte14;
				if ((local78 & 0x1) != 0) {
					@Pc(86) int local86 = local72.method5308();
					@Pc(110) int local110;
					if ((local78 & 0x2) != 0 && local72.anInt6343 == 0 && Math.random() * 1000.0D < 10.0D) {
						local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(118) int local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local110 != 0 || local118 != 0) {
							@Pc(132) int local132 = local110 + local72.anIntArray378[0];
							@Pc(140) int local140 = local72.anIntArray377[0] + local118;
							if (local132 < 0) {
								local132 = 0;
							} else if (Static394.anInt7540 - local86 - 1 < local132) {
								local132 = Static394.anInt7540 - local86 - 1;
							}
							if (local140 < 0) {
								local140 = 0;
							} else if (local140 > Static462.anInt8391 - local86 - 1) {
								local140 = Static462.anInt8391 - local86 - 1;
							}
							@Pc(219) int local219 = Static392.method6267(Static334.aClass291Array20[local72.aByte128], local86, local72.anIntArray378[0], local86, local86, Static420.anIntArray483, local72.anIntArray377[0], local140, -1, local132, 0, true, Static105.anIntArray116, 0);
							if (local219 > 0) {
								if (local219 > 9) {
									local219 = 9;
								}
								for (@Pc(230) int local230 = 0; local230 < local219; local230++) {
									local72.anIntArray378[local230] = Static105.anIntArray116[local219 - local230 - 1];
									local72.anIntArray377[local230] = Static420.anIntArray483[local219 - local230 - 1];
									local72.aByteArray69[local230] = 1;
								}
								local72.anInt6343 = local219;
							}
						}
					}
					Static24.method417(true, local72);
					local110 = Static633.method8557(local72);
					Static606.method8264(local72);
					Static521.method7465(Static344.anInt6771, Static363.anInt6997, local110, local72);
					Static321.method4756(Static344.anInt6771, local72);
					Static342.method5640(local72);
				}
			}
		}
		if (Static621.anInt10311 == 0 && Static567.anInt9650 == 0) {
			if (Static516.anInt9019 == 2) {
				Static598.method8177();
			} else {
				Static58.method1281();
			}
			if (Static465.anInt8425 >> 9 < 14 || Static394.anInt7540 - 14 <= Static465.anInt8425 >> 9 || Static289.anInt5908 >> 9 < 14 || Static462.anInt8391 - 14 <= Static289.anInt5908 >> 9) {
				Static94.method2467();
			}
		}
		while (true) {
			@Pc(345) Class3_Sub51 local345;
			@Pc(350) Class108 local350;
			@Pc(361) Class108 local361;
			do {
				local345 = (Class3_Sub51) Static406.aClass276_47.method6911();
				if (local345 == null) {
					while (true) {
						do {
							local345 = (Class3_Sub51) Static447.aClass276_48.method6911();
							if (local345 == null) {
								while (true) {
									do {
										local345 = (Class3_Sub51) Static306.aClass276_42.method6911();
										if (local345 == null) {
											if (Static233.aClass108_7 != null) {
												Static480.method7070();
											}
											if (Static251.anInt5580 % 1500 == 0) {
												Static362.method5872();
											}
											if (Static581.anInt9720 == 7 && Static621.anInt10311 == 0) {
												Static49.method1147();
											}
											Static314.method5351();
											if (Static555.aBoolean799 && Static424.aLong254 < Static444.method6719() - 60000L) {
												Static176.method3582();
											}
											for (@Pc(528) Class2_Sub4_Sub2 local528 = (Class2_Sub4_Sub2) Static327.aClass375_5.method8638(); local528 != null; local528 = (Class2_Sub4_Sub2) Static327.aClass375_5.method8635()) {
												if ((long) local528.anInt8513 < Static444.method6719() / 1000L - 5L) {
													if (local528.aShort106 > 0) {
														Static97.method2492("", "", 5, "", 0, local528.aString95 + Static287.aClass176_19.method4986(Static380.anInt7247));
													}
													if (local528.aShort106 == 0) {
														Static97.method2492("", "", 5, "", 0, local528.aString95 + Static287.aClass176_20.method4986(Static380.anInt7247));
													}
													local528.method8558();
												}
											}
											if (Static581.anInt9720 == 7 && Static621.anInt10311 == 0) {
												if (Static412.aClass51_25 == null) {
													Static229.method4376(false);
													return;
												}
												Static559.anInt9555++;
												if (Static559.anInt9555 > 50) {
													@Pc(633) Class3_Sub26 local633 = Static640.method8636(Static24.aClass344_4, Static403.aClass294_3);
													Static472.method5189(local633);
												}
												try {
													Static388.method6125();
													return;
												} catch (@Pc(640) IOException local640) {
													Static229.method4376(false);
													return;
												}
											}
											return;
										}
										local350 = local345.aClass108_13;
										if (local350.anInt4083 < 0) {
											break;
										}
										local361 = Static113.method8285(local350.anInt4046);
									} while (local361 == null || local361.aClass108Array1 == null || local361.aClass108Array1.length <= local350.anInt4083 || local350 != local361.aClass108Array1[local350.anInt4083]);
									Static84.method2222(local345);
								}
							}
							local350 = local345.aClass108_13;
							if (local350.anInt4083 < 0) {
								break;
							}
							local361 = Static113.method8285(local350.anInt4046);
						} while (local361 == null || local361.aClass108Array1 == null || local361.aClass108Array1.length <= local350.anInt4083 || local350 != local361.aClass108Array1[local350.anInt4083]);
						Static84.method2222(local345);
					}
				}
				local350 = local345.aClass108_13;
				if (local350.anInt4083 < 0) {
					break;
				}
				local361 = Static113.method8285(local350.anInt4046);
			} while (local361 == null || local361.aClass108Array1 == null || local361.aClass108Array1.length <= local350.anInt4083 || local350 != local361.aClass108Array1[local350.anInt4083]);
			Static84.method2222(local345);
		}
	}
}
