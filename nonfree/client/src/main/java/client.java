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
				Static573.method8159("Argument count");
			}
			Static29.aClass56_2 = new Class56();
			Static29.aClass56_2.anInt1712 = Integer.parseInt(arg0[0]);
			Static288.aClass56_3 = new Class56();
			Static288.aClass56_3.anInt1712 = Integer.parseInt(arg0[1]);
			Static19.aClass56_1 = new Class56();
			Static19.aClass56_1.anInt1712 = Integer.parseInt(arg0[2]);
			Static212.aClass35_2 = Static636.aClass35_7;
			if (arg0[3].equals("live")) {
				Static579.aClass47_6 = Static91.aClass47_3;
			} else if (arg0[3].equals("rc")) {
				Static579.aClass47_6 = Static184.aClass47_4;
			} else if (arg0[3].equals("wip")) {
				Static579.aClass47_6 = Static253.aClass47_5;
			} else {
				Static573.method8159("modewhat");
			}
			Static307.anInt5931 = Static46.method848(arg0[4]);
			if (Static307.anInt5931 == -1) {
				if (arg0[4].equals("english")) {
					Static307.anInt5931 = 0;
				} else if (arg0[4].equals("german")) {
					Static307.anInt5931 = 1;
				} else {
					Static573.method8159("language");
				}
			}
			Static118.aBoolean172 = false;
			Static229.aBoolean323 = false;
			if (arg0[5].equals("game0")) {
				Static630.aClass271_17 = Static237.aClass271_11;
			} else if (arg0[5].equals("game1")) {
				Static630.aClass271_17 = Static646.aClass271_15;
			} else if (arg0[5].equals("game2")) {
				Static630.aClass271_17 = Static89.aClass271_14;
			} else if (arg0[5].equals("game3")) {
				Static630.aClass271_17 = Static412.aClass271_13;
			} else {
				Static573.method8159("game");
			}
			Static195.anInt3958 = 0;
			Static406.anInt7525 = Static630.aClass271_17.anInt8162;
			Static248.aBoolean348 = false;
			Static548.aLong241 = 0L;
			Static217.aBoolean305 = false;
			Static262.anInt5209 = 0;
			Static108.aString25 = null;
			Static362.aString82 = null;
			Static364.anInt6726 = 0;
			Static162.aString32 = "";
			Static579.aBoolean666 = true;
			Static447.aBoolean546 = true;
			@Pc(182) client local182 = new client();
			Static119.aClient1 = local182;
			local182.method1362(Static579.aClass47_6.method1168() + 32, Static630.aClass271_17.aString92);
			Static70.aFrame3.setLocation(40, 40);
		} catch (@Pc(206) Exception local206) {
			Static619.method8645(local206, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1351() {
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1366() {
		if (Static554.anInt1821 == 14) {
			return;
		}
		@Pc(19) long local19 = Static34.method4603() / 1000000L - Static175.aLong93;
		Static175.aLong93 = Static34.method4603() / 1000000L;
		@Pc(27) boolean local27 = Static623.method8675();
		if (local27 && Static166.aBoolean250 && Static4.aClass190_6 != null) {
			Static4.aClass190_6.method7491();
		}
		if (Static316.method5291(Static554.anInt1821)) {
			if (Static97.aLong47 != 0L && Static32.method595() > Static97.aLong47) {
				Static381.method5938(false, Static269.anInt5359, Static323.method5374(), Static270.anInt5363);
			} else if (!Static162.aClass100_7.method8853() && Static359.aBoolean437) {
				Static362.method5753();
			}
		}
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (Static476.aFrame6 == null) {
			@Pc(79) Container local79;
			if (Static70.aFrame3 != null) {
				local79 = Static70.aFrame3;
			} else if (Static42.anApplet1 == null) {
				local79 = Static4.anApplet_Sub1_5;
			} else {
				local79 = Static42.anApplet1;
			}
			local93 = local79.getSize().width;
			local97 = local79.getSize().height;
			if (local79 == Static70.aFrame3) {
				@Pc(103) Insets local103 = Static70.aFrame3.getInsets();
				local93 -= local103.left + local103.right;
				local97 -= local103.top + local103.bottom;
			}
			if (Static26.anInt535 != local93 || Static539.anInt9304 != local97 || Static585.aBoolean670) {
				if (Static162.aClass100_7 == null || Static162.aClass100_7.method8848()) {
					Static132.method2134();
				} else {
					Static26.anInt535 = local93;
					Static539.anInt9304 = local97;
				}
				Static97.aLong47 = Static32.method595() + 500L;
				Static585.aBoolean670 = false;
			}
		}
		if (Static476.aFrame6 != null && !Static399.aBoolean503 && Static316.method5291(Static554.anInt1821)) {
			Static381.method5938(false, -1, Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501(), -1);
		}
		@Pc(167) boolean local167 = false;
		if (Static362.aBoolean440) {
			local167 = true;
			Static362.aBoolean440 = false;
		}
		if (local167) {
			Static27.method485();
		}
		if (Static162.aClass100_7 != null && Static162.aClass100_7.method8853() || Static323.method5374() != 1) {
			Static643.method8977();
		}
		if (Static349.method5628(Static554.anInt1821)) {
			Static292.method5058(local167);
		} else if (Static67.method1171(Static554.anInt1821)) {
			Static14.method277();
		} else if (Static159.method3019(Static554.anInt1821)) {
			Static14.method277();
		} else if (Static217.method3690(Static554.anInt1821)) {
			if (Static600.anInt10019 == 1) {
				if (Static482.anInt8364 > Static617.anInt10205) {
					Static617.anInt10205 = Static482.anInt8364;
				}
				local93 = (Static617.anInt10205 - Static482.anInt8364) * 50 / Static617.anInt10205;
				Static67.method1169(true, Static317.aClass192_12.method5299(Static307.anInt5931) + "<br>(" + local93 + "%)", Static176.aClass133_45, Static43.aClass50_2, Static162.aClass100_7);
			} else if (Static600.anInt10019 == 2) {
				if (Static57.anInt1236 > Static49.anInt913) {
					Static49.anInt913 = Static57.anInt1236;
				}
				local93 = (Static49.anInt913 - Static57.anInt1236) * 50 / Static49.anInt913 + 50;
				Static67.method1169(true, Static317.aClass192_12.method5299(Static307.anInt5931) + "<br>(" + local93 + "%)", Static176.aClass133_45, Static43.aClass50_2, Static162.aClass100_7);
			} else {
				Static67.method1169(true, Static317.aClass192_12.method5299(Static307.anInt5931), Static176.aClass133_45, Static43.aClass50_2, Static162.aClass100_7);
			}
		} else if (Static554.anInt1821 == 10) {
			Static583.method8202(local19);
		} else if (Static554.anInt1821 == 13) {
			Static67.method1169(false, Static317.aClass192_14.method5299(Static307.anInt5931) + "<br>" + Static317.aClass192_15.method5299(Static307.anInt5931), Static176.aClass133_45, Static43.aClass50_2, Static162.aClass100_7);
		}
		if (Static205.anInt4087 == 3) {
			for (local93 = 0; local93 < Static595.anInt9912; local93++) {
				@Pc(367) Rectangle local367 = Class6.aRectangleArray148[local93];
				if (Static567.aBooleanArray53[local93]) {
					Static162.aClass100_7.method8814(-65281, local367.x, local367.y, local367.width, local367.height);
				} else if (Static623.aBooleanArray57[local93]) {
					Static162.aClass100_7.method8814(-65536, local367.x, local367.y, local367.width, local367.height);
				} else {
					Static162.aClass100_7.method8814(-16711936, local367.x, local367.y, local367.width, local367.height);
				}
			}
		}
		if (Static368.method5827()) {
			Static258.method4614(Static162.aClass100_7);
		}
		if (Static529.aClass112_6.aBoolean264 && Static316.method5291(Static554.anInt1821) && Static205.anInt4087 == 0 && Static323.method5374() == 1 && !local167) {
			local93 = 0;
			for (local97 = 0; local97 < Static595.anInt9912; local97++) {
				if (Static623.aBooleanArray57[local97]) {
					Static623.aBooleanArray57[local97] = false;
					Static11.aRectangleArray7[local93++] = Class6.aRectangleArray148[local97];
				}
			}
			try {
				if (Static389.aBoolean497) {
					Static359.method5715(local93, Static11.aRectangleArray7);
				} else {
					Static162.aClass100_7.method8837(local93, Static11.aRectangleArray7);
				}
			} catch (@Pc(492) Exception_Sub1 local492) {
			}
		} else if (!Static349.method5628(Static554.anInt1821)) {
			for (local93 = 0; local93 < Static595.anInt9912; local93++) {
				Static623.aBooleanArray57[local93] = false;
			}
			try {
				if (Static389.aBoolean497) {
					Static132.method2138();
				} else {
					Static162.aClass100_7.method8772();
				}
			} catch (@Pc(521) Exception_Sub1 local521) {
				Static619.method8645(local521, local521.getMessage() + " (Recovered) " + this.method1348());
				Static278.method4875(0, false);
			}
		}
		Static150.method2371();
		local93 = Static348.aClass6_Sub22_19.aClass15_Sub9_1.method2203();
		if (local93 == 0) {
			Static179.method3254(15L);
		} else if (local93 == 1) {
			Static179.method3254(10L);
		} else if (local93 == 2) {
			Static179.method3254(5L);
		} else if (local93 == 3) {
			Static179.method3254(2L);
		}
		if (Static604.aBoolean684) {
			Static466.method6568();
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub12_1.method4190() == 1 && Static554.anInt1821 == 3 && Static554.anInt1822 != -1) {
			Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub12_1);
			Static289.method5031();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	protected void method1360() {
		if (Static248.aBoolean348) {
			Static396.anInt7427 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static132.method2134();
		Static49.aClass130_1 = new Class130(Static529.aClass112_6);
		Static34.aClass296_2 = new Class296();
		Static255.method4576(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static418.aClass35_3 != Static212.aClass35_2) {
			Static619.aByteArrayArray169 = new byte[50][];
		}
		Static348.aClass6_Sub22_19 = Static132.method2135();
		if (Static418.aClass35_3 == Static212.aClass35_2) {
			Static29.aClass56_2.aString17 = this.getCodeBase().getHost();
		} else if (Static638.method8958(Static212.aClass35_2)) {
			Static29.aClass56_2.aString17 = this.getCodeBase().getHost();
			Static29.aClass56_2.anInt1715 = Static29.aClass56_2.anInt1712 + 40000;
			Static288.aClass56_3.anInt1715 = Static288.aClass56_3.anInt1712 + 40000;
			Static29.aClass56_2.anInt1717 = Static29.aClass56_2.anInt1712 + 50000;
			Static19.aClass56_1.anInt1715 = Static19.aClass56_1.anInt1712 + 40000;
			Static288.aClass56_3.anInt1717 = Static288.aClass56_3.anInt1712 + 50000;
			Static19.aClass56_1.anInt1717 = Static19.aClass56_1.anInt1712 + 50000;
		} else if (Static212.aClass35_2 == Static636.aClass35_7) {
			Static29.aClass56_2.aString17 = "127.0.0.1";
			Static288.aClass56_3.aString17 = "127.0.0.1";
			Static19.aClass56_1.aString17 = "127.0.0.1";
			Static29.aClass56_2.anInt1715 = Static29.aClass56_2.anInt1712 + 40000;
			Static288.aClass56_3.anInt1715 = Static288.aClass56_3.anInt1712 + 40000;
			Static19.aClass56_1.anInt1715 = Static19.aClass56_1.anInt1712 + 40000;
			Static29.aClass56_2.anInt1717 = Static29.aClass56_2.anInt1712 + 50000;
			Static288.aClass56_3.anInt1717 = Static288.aClass56_3.anInt1712 + 50000;
			Static19.aClass56_1.anInt1717 = Static19.aClass56_1.anInt1712 + 50000;
		}
		Static315.aClass56_4 = Static29.aClass56_2;
		Static354.aShortArray33 = Static563.aShortArray130 = Static354.aShortArray32 = Static108.aShortArray47 = new short[256];
		if (Static237.aClass271_11 == Static630.aClass271_17) {
			Static191.aBoolean280 = false;
		}
		if (Static646.aClass271_15 == Static630.aClass271_17) {
			Static576.aBoolean330 = true;
			Static634.anInt10638 = 16777215;
			Static588.anInt9824 = 0;
			Static472.aShortArrayArray18 = Static53.aShortArrayArray1;
			Static47.aShortArrayArrayArray1 = Static195.aShortArrayArrayArray2;
		} else if (Static412.aClass271_13 == Static630.aClass271_17) {
			Static472.aShortArrayArray18 = Static470.aShortArrayArray17;
			Static47.aShortArrayArrayArray1 = Static390.aShortArrayArrayArray4;
		} else {
			Static472.aShortArrayArray18 = Static101.aShortArrayArray2;
			Static47.aShortArrayArrayArray1 = Static568.aShortArrayArrayArray5;
		}
		try {
			Static590.aClipboard3 = Static119.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(223) Exception local223) {
		}
		Static647.aClass251_1 = Static72.method1291(Static271.aCanvas6);
		Static429.aClass71_1 = Static538.method7913(Static271.aCanvas6);
		try {
			if (Static529.aClass112_6.aClass171_2 != null) {
				Static219.aClass73_1 = new Class73(Static529.aClass112_6.aClass171_2, 5200, 0);
				for (@Pc(245) int local245 = 0; local245 < 37; local245++) {
					Static435.aClass73Array1[local245] = new Class73(Static529.aClass112_6.aClass171Array1[local245], 6000, 0);
				}
				Static425.aClass73_5 = new Class73(Static529.aClass112_6.aClass171_4, 6000, 0);
				Static512.aClass227_4 = new Class227(255, Static219.aClass73_1, Static425.aClass73_5, 500000);
				Static406.aClass73_4 = new Class73(Static529.aClass112_6.aClass171_3, 24, 0);
				Static529.aClass112_6.aClass171_2 = null;
				Static529.aClass112_6.aClass171_3 = null;
				Static529.aClass112_6.aClass171Array1 = null;
				Static529.aClass112_6.aClass171_4 = null;
			}
		} catch (@Pc(303) IOException local303) {
			Static406.aClass73_4 = null;
			Static425.aClass73_5 = null;
			Static512.aClass227_4 = null;
			Static219.aClass73_1 = null;
		}
		if (Static418.aClass35_3 != Static212.aClass35_2) {
			Static403.aBoolean505 = true;
		}
		Static525.aString107 = Static317.aClass192_12.method5299(Static307.anInt5931);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1356() {
		if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() != 2) {
			this.method1366();
			return;
		}
		try {
			this.method1366();
		} catch (@Pc(24) ThreadDeath local24) {
			throw local24;
		} catch (@Pc(27) Throwable local27) {
			Static619.method8645(local27, local27.getMessage() + " (Recovered) " + this.method1348());
			Static441.aBoolean529 = true;
			Static278.method4875(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1355() {
		if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() != 2) {
			this.method1377();
			return;
		}
		try {
			this.method1377();
		} catch (@Pc(23) ThreadDeath local23) {
			throw local23;
		} catch (@Pc(26) Throwable local26) {
			Static619.method8645(local26, local26.getMessage() + " (Recovered) " + this.method1348());
			Static441.aBoolean529 = true;
			Static278.method4875(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1371() {
		if (Static34.aClass296_2.anInt8633 > Static596.anInt9914) {
			Static315.aClass56_4.method1429();
			Static229.anInt4538 = (Static34.aClass296_2.anInt8633 - 1) * 5 * 50;
			if (Static229.anInt4538 > 3000) {
				Static229.anInt4538 = 3000;
			}
			if (Static34.aClass296_2.anInt8633 >= 2 && Static34.aClass296_2.anInt8634 == 6) {
				this.method1359("js5connect_outofdate");
				Static554.anInt1821 = 14;
				return;
			}
			if (Static34.aClass296_2.anInt8633 >= 4 && Static34.aClass296_2.anInt8634 == -1) {
				this.method1359("js5crc");
				Static554.anInt1821 = 14;
				return;
			}
			if (Static34.aClass296_2.anInt8633 >= 4 && Static349.method5628(Static554.anInt1821)) {
				if (Static34.aClass296_2.anInt8634 == 7 || Static34.aClass296_2.anInt8634 == 9) {
					this.method1359("js5connect_full");
				} else if (Static34.aClass296_2.anInt8634 <= 0) {
					this.method1359("js5io");
				} else if (Static232.aString53 == null) {
					this.method1359("js5connect");
				} else {
					this.method1359("js5proxy_" + Static232.aString53.trim());
				}
				Static554.anInt1821 = 14;
				return;
			}
		}
		Static596.anInt9914 = Static34.aClass296_2.anInt8633;
		if (Static229.anInt4538 > 0) {
			Static229.anInt4538--;
			return;
		}
		try {
			if (Static502.anInt8694 == 0) {
				Static624.aClass328_9 = Static315.aClass56_4.method1431(Static529.aClass112_6);
				Static502.anInt8694++;
			}
			if (Static502.anInt8694 == 1) {
				if (Static624.aClass328_9.anInt9389 == 2) {
					if (Static624.aClass328_9.anObject21 != null) {
						Static232.aString53 = (String) Static624.aClass328_9.anObject21;
					}
					this.method1383(1000);
					return;
				}
				if (Static624.aClass328_9.anInt9389 == 1) {
					Static502.anInt8694++;
				}
			}
			if (Static502.anInt8694 == 2) {
				Static58.aClass185_1 = new Class185((Socket) Static624.aClass328_9.anObject21, Static529.aClass112_6, 25000);
				@Pc(189) Class6_Sub40 local189 = new Class6_Sub40(5);
				local189.method8589(Static640.aClass218_2.anInt6779);
				local189.method8554(639);
				Static58.aClass185_1.method5219(local189.aByteArray113, 5);
				Static502.anInt8694++;
				Static182.aLong97 = Static32.method595();
			}
			if (Static502.anInt8694 == 3) {
				if (Static349.method5628(Static554.anInt1821) || Static58.aClass185_1.method5220() > 0) {
					@Pc(239) int local239 = Static58.aClass185_1.method5214();
					if (local239 != 0) {
						this.method1383(local239);
						return;
					}
					Static502.anInt8694++;
				} else if (Static32.method595() - Static182.aLong97 > 30000L) {
					this.method1383(1001);
					return;
				}
			}
			if (Static502.anInt8694 == 4) {
				@Pc(287) boolean local287 = Static349.method5628(Static554.anInt1821) || Static578.method5706(Static554.anInt1821) || Static578.method5704(Static554.anInt1821);
				@Pc(290) Class28[] local290 = Static33.method597();
				@Pc(298) Class6_Sub40 local298 = new Class6_Sub40(local290.length * 4);
				Static58.aClass185_1.method5217(local298.aByteArray113.length, 0, local298.aByteArray113);
				for (@Pc(309) int local309 = 0; local309 < local290.length; local309++) {
					local290[local309].method600(local298.method8579());
				}
				Static34.aClass296_2.method7426(Static58.aClass185_1, !local287);
				Static624.aClass328_9 = null;
				Static502.anInt8694 = 0;
				Static58.aClass185_1 = null;
			}
		} catch (@Pc(345) IOException local345) {
			this.method1383(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1363()) {
			return;
		}
		Static29.aClass56_2 = new Class56();
		Static29.aClass56_2.anInt1712 = Integer.parseInt(this.getParameter("worldid"));
		Static288.aClass56_3 = new Class56();
		Static288.aClass56_3.anInt1712 = Integer.parseInt(this.getParameter("lobbyid"));
		Static288.aClass56_3.aString17 = this.getParameter("lobbyaddress");
		Static19.aClass56_1 = new Class56();
		Static19.aClass56_1.anInt1712 = Integer.parseInt(this.getParameter("demoid"));
		Static19.aClass56_1.aString17 = this.getParameter("demoaddress");
		Static212.aClass35_2 = Static68.method1191(Integer.parseInt(this.getParameter("modewhere")));
		if (Static212.aClass35_2 == Static636.aClass35_7) {
			Static212.aClass35_2 = Static41.aClass35_1;
		} else if (!Static638.method8958(Static212.aClass35_2) && Static418.aClass35_3 != Static212.aClass35_2) {
			Static212.aClass35_2 = Static418.aClass35_3;
		}
		Static579.aClass47_6 = Static368.method5825(Integer.parseInt(this.getParameter("modewhat")));
		if (Static253.aClass47_5 != Static579.aClass47_6 && Static579.aClass47_6 != Static184.aClass47_4 && Static579.aClass47_6 != Static91.aClass47_3) {
			Static579.aClass47_6 = Static91.aClass47_3;
		}
		try {
			Static307.anInt5931 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static307.anInt5931 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static229.aBoolean323 = true;
		} else {
			Static229.aBoolean323 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static118.aBoolean172 = true;
		} else {
			Static118.aBoolean172 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static369.aBoolean451 = true;
		} else {
			Static369.aBoolean451 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static630.aClass271_17 = Static237.aClass271_11;
			} else if (local152.equals("1")) {
				Static630.aClass271_17 = Static646.aClass271_15;
			} else if (local152.equals("2")) {
				Static630.aClass271_17 = Static89.aClass271_14;
			} else if (local152.equals("3")) {
				Static630.aClass271_17 = Static412.aClass271_13;
			}
		}
		try {
			Static364.anInt6726 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static364.anInt6726 = 0;
		}
		Static292.aString69 = this.getParameter("quiturl");
		Static162.aString32 = this.getParameter("settings");
		if (Static162.aString32 == null) {
			Static162.aString32 = "";
		}
		Static555.aBoolean645 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static195.anInt3958 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static195.anInt3958 = 0;
			}
		}
		Static406.anInt7525 = Integer.parseInt(this.getParameter("colourid"));
		if (Static406.anInt7525 < 0 || Static611.aColorArray3.length <= Static406.anInt7525) {
			Static406.anInt7525 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static579.aBoolean666 = true;
			Static447.aBoolean546 = true;
		}
		@Pc(252) String local252 = this.getParameter("frombilling");
		if (local252 != null && local252.equals("true")) {
			Static217.aBoolean305 = true;
		}
		Static362.aString82 = this.getParameter("sskey");
		if (Static362.aString82 != null && Static362.aString82.length() < 2) {
			Static362.aString82 = null;
		}
		@Pc(276) String local276 = this.getParameter("force64mb");
		if (local276 != null && local276.equals("true")) {
			Static248.aBoolean348 = true;
		}
		@Pc(288) String local288 = this.getParameter("worldflags");
		if (local288 != null) {
			try {
				Static262.anInt5209 = Integer.parseInt(local288);
			} catch (@Pc(295) Exception local295) {
			}
		}
		@Pc(300) String local300 = this.getParameter("userFlow");
		if (local300 != null) {
			try {
				Static548.aLong241 = Long.parseLong(local300);
			} catch (@Pc(307) NumberFormatException local307) {
			}
		}
		Static108.aString25 = this.getParameter("additionalInfo");
		if (Static108.aString25 != null && Static108.aString25.length() > 50) {
			Static108.aString25 = null;
		}
		if (Static630.aClass271_17 == Static237.aClass271_11) {
			Static106.anInt2101 = 503;
			Static507.anInt8741 = 765;
		} else if (Static630.aClass271_17 == Static646.aClass271_15) {
			Static106.anInt2101 = 480;
			Static507.anInt8741 = 640;
		}
		Static119.aClient1 = this;
		this.method1346(Static579.aClass47_6.method1168() + 32, Static507.anInt8741, Static106.anInt2101, Static630.aClass271_17.aString92);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1374() {
		@Pc(28) int local28;
		if (Static554.anInt1821 == 7 && Static572.anInt9602 == 0) {
			if (Static328.anInt6241 > 1) {
				Static328.anInt6241--;
				Static30.anInt4467 = Static320.anInt6118;
			}
			if (!Static71.aBoolean94) {
				Static370.method5839();
			}
			for (local28 = 0; local28 < 100 && Static355.method5681(); local28++) {
			}
		}
		Static333.anInt9456++;
		Static165.method3050(-1, (Class302) null, -1);
		Static275.method4852(-1, (Class302) null, -1);
		Static624.method8686();
		Static320.anInt6118++;
		for (local28 = 0; local28 < Static273.anInt5420; local28++) {
			@Pc(72) Class20_Sub2_Sub2_Sub1_Sub2 local72 = Static1.aClass6_Sub46Array5[local28].aClass20_Sub2_Sub2_Sub1_Sub2_1;
			if (local72 != null) {
				@Pc(78) byte local78 = local72.aClass247_1.aByte89;
				if ((local78 & 0x1) != 0) {
					@Pc(86) int local86 = local72.method4913();
					@Pc(110) int local110;
					if ((local78 & 0x2) != 0 && local72.anInt5574 == 0 && Math.random() * 1000.0D < 10.0D) {
						local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(118) int local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local110 != 0 || local118 != 0) {
							@Pc(132) int local132 = local110 + local72.anIntArray335[0];
							@Pc(140) int local140 = local72.anIntArray336[0] + local118;
							if (local132 < 0) {
								local132 = 0;
							} else if (Static442.anInt7975 - local86 - 1 < local132) {
								local132 = Static442.anInt7975 - local86 - 1;
							}
							if (local140 < 0) {
								local140 = 0;
							} else if (Static284.anInt7916 - local86 - 1 < local140) {
								local140 = Static284.anInt7916 - local86 - 1;
							}
							@Pc(218) int local218 = Static108.method1764(local72.anIntArray336[0], local72.anIntArray335[0], local132, local86, true, -1, local86, 0, Static297.anIntArray433, Static619.aClass319Array1[local72.aByte131], local140, 0, local86, Static647.anIntArray649);
							if (local218 > 0) {
								if (local218 > 9) {
									local218 = 9;
								}
								for (@Pc(227) int local227 = 0; local227 < local218; local227++) {
									local72.anIntArray335[local227] = Static297.anIntArray433[local218 - local227 - 1];
									local72.anIntArray336[local227] = Static647.anIntArray649[local218 - local227 - 1];
									local72.aByteArray60[local227] = 1;
								}
								local72.anInt5574 = local218;
							}
						}
					}
					Static623.method8674(true, local72);
					local110 = Static621.method8657(local72);
					Static342.method5552(local72);
					Static308.method5209(local72, local110, Static8.anInt148, Static611.anInt10086);
					Static92.method1519(Static8.anInt148, local72);
					Static437.method6777(local72);
				}
			}
		}
		if (Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
			if (Static334.anInt6354 == 2) {
				Static372.method7364();
			} else {
				Static572.method8144();
			}
			if (Static580.anInt9662 >> 9 < 14 || Static442.anInt7975 - 14 <= Static580.anInt9662 >> 9 || Static524.anInt9123 >> 9 < 14 || Static284.anInt7916 - 14 <= Static524.anInt9123 >> 9) {
				Static69.method1194();
			}
		}
		while (true) {
			@Pc(347) Class6_Sub10 local347;
			@Pc(352) Class302 local352;
			@Pc(360) Class302 local360;
			do {
				local347 = (Class6_Sub10) Static97.aClass8_10.method152();
				if (local347 == null) {
					while (true) {
						do {
							local347 = (Class6_Sub10) Static369.aClass8_40.method152();
							if (local347 == null) {
								while (true) {
									do {
										local347 = (Class6_Sub10) Static218.aClass8_26.method152();
										if (local347 == null) {
											if (Static478.aClass302_56 != null) {
												Static562.method8099();
											}
											if (Static113.anInt2243 % 1500 == 0) {
												Static139.method2254();
											}
											if (Static554.anInt1821 == 7 && Static572.anInt9602 == 0) {
												Static529.method7848();
											}
											Static495.method7404();
											if (Static318.aBoolean410 && Static32.method595() - 60000L > Static603.aLong264) {
												Static238.method4143();
											}
											for (@Pc(525) Class20_Sub6_Sub2 local525 = (Class20_Sub6_Sub2) Static131.aClass81_3.method2118(); local525 != null; local525 = (Class20_Sub6_Sub2) Static131.aClass81_3.method2128()) {
												if ((long) local525.anInt6133 < Static32.method595() / 1000L - 5L) {
													if (local525.aShort69 > 0) {
														Static145.method2337(0, "", local525.aString79 + Static317.aClass192_19.method5299(Static307.anInt5931), 5, "", "");
													}
													if (local525.aShort69 == 0) {
														Static145.method2337(0, "", local525.aString79 + Static317.aClass192_20.method5299(Static307.anInt5931), 5, "", "");
													}
													local525.method9004();
												}
											}
											if (Static554.anInt1821 == 7 && Static572.anInt9602 == 0) {
												if (Static97.aClass29_1 == null) {
													Static126.method2048(false);
													return;
												}
												Static475.anInt8297++;
												if (Static475.anInt8297 > 50) {
													@Pc(632) Class6_Sub9 local632 = Static560.method8089(Static391.aClass126_1, Static538.aClass208_81);
													Static263.method4681(local632);
												}
												try {
													Static265.method3201();
													return;
												} catch (@Pc(641) IOException local641) {
													Static126.method2048(false);
													return;
												}
											}
											return;
										}
										local352 = local347.aClass302_14;
										if (local352.anInt8834 < 0) {
											break;
										}
										local360 = Static386.method4914(local352.anInt8806);
									} while (local360 == null || local360.aClass302Array2 == null || local360.aClass302Array2.length <= local352.anInt8834 || local352 != local360.aClass302Array2[local352.anInt8834]);
									Static244.method4193(local347);
								}
							}
							local352 = local347.aClass302_14;
							if (local352.anInt8834 < 0) {
								break;
							}
							local360 = Static386.method4914(local352.anInt8806);
						} while (local360 == null || local360.aClass302Array2 == null || local360.aClass302Array2.length <= local352.anInt8834 || local360.aClass302Array2[local352.anInt8834] != local352);
						Static244.method4193(local347);
					}
				}
				local352 = local347.aClass302_14;
				if (local352.anInt8834 < 0) {
					break;
				}
				local360 = Static386.method4914(local352.anInt8806);
			} while (local360 == null || local360.aClass302Array2 == null || local360.aClass302Array2.length <= local352.anInt8834 || local352 != local360.aClass302Array2[local352.anInt8834]);
			Static244.method4193(local347);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1345() {
		if (Static318.aBoolean410) {
			Static238.method4143();
		}
		Static261.method4650();
		if (Static162.aClass100_7 != null) {
			Static162.aClass100_7.method8789();
		}
		if (Static476.aFrame6 != null) {
			Static543.method7947(Static476.aFrame6, Static529.aClass112_6);
			Static476.aFrame6 = null;
		}
		if (Static97.aClass29_1 != null) {
			Static97.aClass29_1.method4606();
			Static97.aClass29_1 = null;
		}
		Static604.method8484();
		Static34.aClass296_2.method7434();
		Static49.aClass130_1.method3580();
		if (Static115.aClass380_1 != null) {
			Static115.aClass380_1.method8967();
			Static115.aClass380_1 = null;
		}
		try {
			Static219.aClass73_1.method1966();
			for (@Pc(51) int local51 = 0; local51 < 37; local51++) {
				Static435.aClass73Array1[local51].method1966();
			}
			Static425.aClass73_5.method1966();
			Static406.aClass73_4.method1966();
			Static74.method1295();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1377() {
		if (Static554.anInt1821 == 14) {
			return;
		}
		Static113.anInt2243++;
		if (Static113.anInt2243 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static411.anInt6250 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static364.aRandom1.setSeed((long) Static411.anInt6250);
		}
		if (Static113.anInt2243 % 50 == 0) {
			Static88.anInt1826 = Static247.anInt4940;
			Static492.anInt8564 = Static131.anInt2518;
			Static247.anInt4940 = 0;
			Static131.anInt2518 = 0;
		}
		this.method1378();
		if (Static4.aClass230_5 != null) {
			Static4.aClass230_5.method6217();
		}
		Static172.method3149();
		Static341.method5525();
		Static647.aClass251_1.method6711();
		Static429.aClass71_1.method7695();
		if (Static162.aClass100_7 != null) {
			Static162.aClass100_7.method8818((int) Static32.method595());
		}
		Static496.method7413();
		Static519.anInt9082 = 0;
		Static298.anInt6415 = 0;
		for (@Pc(100) Interface18 local100 = Static647.aClass251_1.method6714(); local100 != null; local100 = Static647.aClass251_1.method6714()) {
			@Pc(106) int local106 = local100.method4140();
			if (local106 == 2 || local106 == 3) {
				@Pc(118) char local118 = local100.method4142();
				if (Static628.method8720() && (local118 == '`' || local118 == '§' || local118 == '²')) {
					if (Static368.method5827()) {
						Static595.method8362();
					} else {
						Static79.method1392();
					}
				} else if (Static519.anInt9082 < 128) {
					Static191.anInterface18Array1[Static519.anInt9082] = local100;
					Static519.anInt9082++;
				}
			} else if (local106 == 0 && Static298.anInt6415 < 75) {
				Static342.anInterface18Array2[Static298.anInt6415] = local100;
				Static298.anInt6415++;
			}
		}
		Static3.anInt51 = 0;
		for (@Pc(189) Class6_Sub15 local189 = Static429.aClass71_1.method7703(); local189 != null; local189 = Static429.aClass71_1.method7703()) {
			@Pc(195) int local195 = local189.method8390();
			if (local195 == -1) {
				Static230.aClass8_20.method157(local189);
			} else if (local195 == 6) {
				Static3.anInt51 += local189.method8385();
			} else if (Static549.method7970(local195)) {
				Static334.aClass8_33.method157(local189);
				if (Static334.aClass8_33.method150() > 10) {
					Static334.aClass8_33.method152();
				}
			}
		}
		if (Static368.method5827()) {
			Static596.method8366();
		}
		if (Static349.method5628(Static554.anInt1821)) {
			Static465.method7072();
			Static360.method5725();
		} else if (Static217.method3690(Static554.anInt1821)) {
			Static371.method5859();
		}
		if (Static578.method5706(Static554.anInt1821) && !Static217.method3690(Static554.anInt1821)) {
			this.method1374();
			Static493.method7390();
			Static31.method555();
		} else if (Static578.method5704(Static554.anInt1821) && !Static217.method3690(Static554.anInt1821)) {
			this.method1374();
			Static31.method555();
		} else if (Static554.anInt1821 == 12) {
			Static31.method555();
		} else if (Static283.method5439(Static554.anInt1821) && !Static217.method3690(Static554.anInt1821)) {
			Static374.method5907();
		} else if (Static554.anInt1821 == 13) {
			Static31.method555();
			if (Static576.anInt4602 != -3 && Static576.anInt4602 != 2 && Static576.anInt4602 != 15) {
				Static126.method2048(false);
			}
		}
		Static193.method3444(Static162.aClass100_7);
		Static334.aClass8_33.method152();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1348() {
		@Pc(13) String local13 = null;
		try {
			local13 = "[1)" + Static606.anInt8651 + "," + Static195.anInt3961 + "," + Static442.anInt7975 + "," + Static284.anInt7916 + "|";
			if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 != null) {
				local13 = local13 + "2)" + Static175.anInt3636 + "," + (Static606.anInt8651 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0]) + "," + (Static195.anInt3961 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0]) + "|";
			}
			local13 = local13 + "3)" + Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() + "|4)" + Static348.aClass6_Sub22_19.aClass15_Sub11_2.method4165() + "|5)" + Static323.method5374() + "|6)" + Static321.anInt6137 + "," + Static356.anInt6630 + "|";
			local13 = local13 + "7)" + Static348.aClass6_Sub22_19.aClass15_Sub1_1.method331() + "|";
			local13 = local13 + "8)" + Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642() + "|";
			local13 = local13 + "9)" + Static348.aClass6_Sub22_19.aClass15_Sub6_1.method1414() + "|";
			local13 = local13 + "10)" + Static348.aClass6_Sub22_19.aClass15_Sub27_1.method8659() + "|";
			local13 = local13 + "11)" + Static348.aClass6_Sub22_19.aClass15_Sub25_1.method8355() + "|";
			local13 = local13 + "12)" + Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() + "|";
			local13 = local13 + "13)" + Static396.anInt7427 + "|";
			local13 = local13 + "14)" + Static554.anInt1821;
			if (Static428.aClass6_Sub28_1 != null) {
				local13 = local13 + "|15)" + Static428.aClass6_Sub28_1.anInt6061;
			}
			try {
				if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 2) {
					@Pc(253) Class local253 = Class.forName("java.lang.ClassLoader");
					@Pc(257) Field local257 = local253.getDeclaredField("nativeLibraries");
					@Pc(260) Class local260 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(270) Method local270 = local260.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local270.invoke(local257, Boolean.TRUE);
					@Pc(293) Vector local293 = (Vector) local257.get(client.class.getClassLoader());
					for (@Pc(295) int local295 = 0; local293.size() > local295; local295++) {
						try {
							@Pc(301) Object local301 = local293.elementAt(local295);
							@Pc(306) Field local306 = local301.getClass().getDeclaredField("name");
							local270.invoke(local306, Boolean.TRUE);
							try {
								@Pc(321) String local321 = (String) local306.get(local301);
								if (local321 != null && local321.indexOf("sw3d.dll") != -1) {
									@Pc(334) Field local334 = local301.getClass().getDeclaredField("handle");
									local270.invoke(local334, Boolean.TRUE);
									local13 = local13 + "|16)" + Long.toHexString(local334.getLong(local301));
									local270.invoke(local334, Boolean.FALSE);
								}
							} catch (@Pc(370) Throwable local370) {
							}
							local270.invoke(local306, Boolean.FALSE);
						} catch (@Pc(382) Throwable local382) {
						}
					}
				}
			} catch (@Pc(394) Throwable local394) {
			}
			local13 = local13 + "]";
		} catch (@Pc(405) Throwable local405) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1378() {
		@Pc(11) boolean local11 = Static34.aClass296_2.method7424();
		if (!local11) {
			this.method1371();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1383(@OriginalArg(1) int arg0) {
		Static58.aClass185_1 = null;
		Static624.aClass328_9 = null;
		Static34.aClass296_2.anInt8634 = arg0;
		Static34.aClass296_2.anInt8633++;
		Static502.anInt8694 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1353() {
		if (Static42.anApplet1 != null && Static271.aCanvas6 == null && !Static529.aClass112_6.aBoolean264) {
			try {
				@Pc(18) Class local18 = Static42.anApplet1.getClass();
				@Pc(22) Field local22 = local18.getDeclaredField("canvas");
				Static271.aCanvas6 = (Canvas) local22.get(Static42.anApplet1);
				local22.set(Static42.anApplet1, (Object) null);
				if (Static271.aCanvas6 != null) {
					return;
				}
			} catch (@Pc(35) Exception local35) {
			}
		}
		super.method1353();
	}
}
