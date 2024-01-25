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
				Static14.method311("argument count");
			}
			Static127.anInt2851 = Integer.parseInt(arg0[0]);
			Static306.anInt6192 = 2;
			if (arg0[1].equals("live")) {
				Static189.anInt4083 = 0;
			} else if (arg0[1].equals("rc")) {
				Static189.anInt4083 = 1;
			} else if (arg0[1].equals("wip")) {
				Static189.anInt4083 = 2;
			} else {
				Static14.method311("modewhat");
			}
			Static253.anInt5246 = Static253.method4352(arg0[2]);
			if (Static253.anInt5246 == -1) {
				if (arg0[2].equals("english")) {
					Static253.anInt5246 = 0;
				} else if (arg0[2].equals("german")) {
					Static253.anInt5246 = 1;
				} else {
					Static14.method311("language");
				}
			}
			Static79.method1436(Static253.anInt5246);
			Static304.aBoolean538 = false;
			Static27.aBoolean27 = false;
			if (arg0[3].equals("game0")) {
				Static269.anInt5508 = 0;
			} else if (arg0[3].equals("game1")) {
				Static269.anInt5508 = 1;
			} else {
				Static14.method311("game");
			}
			Static145.anInt3255 = 0;
			Static153.aString115 = "";
			Static10.anInt205 = 0;
			Static171.anInt3786 = Static269.anInt5508;
			@Pc(126) client local126 = new client();
			Static78.aClient1 = local126;
			local126.method861(Static269.anInt5508 == 1 ? "stellardawn" : "runescape", Static189.anInt4083 + 32);
			Static350.aFrame3.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static103.method2841(local154, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method858() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method856() {
		if (Static139.anInt3135 == 1000) {
			return;
		}
		Static342.anInt6706++;
		if (Static342.anInt6706 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static88.anInt1938 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static150.aRandom11.setSeed((long) Static88.anInt1938);
		}
		this.method883();
		if (Static176.aClass111_1 != null) {
			Static176.aClass111_1.method3024();
		}
		Static161.method3103();
		Static294.method3383();
		Static351.method5650();
		Static187.method3424();
		if (Static164.aClass92_7 != null) {
			Static164.aClass92_7.method4526((int) Static274.method4763());
		}
		if (Static76.aClass117_1 != null) {
			@Pc(81) int local81 = Static76.aClass117_1.method3192();
			Static32.anInt3682 = local81;
		}
		Static260.method4431();
		if (Static139.anInt3135 == 0) {
			this.method888();
			Static304.method5144();
		} else if (Static139.anInt3135 == 5) {
			this.method888();
			Static304.method5144();
		} else if (Static139.anInt3135 == 25 || Static139.anInt3135 == 28) {
			Static342.method5575();
		}
		if (Static139.anInt3135 == 10) {
			this.method889();
			Static253.method4349();
			Static140.method2776();
			Static279.method4787();
		} else if (Static139.anInt3135 == 30) {
			Static235.method5578();
		} else if (Static139.anInt3135 == 40) {
			Static279.method4787();
			if (Static68.anInt1533 != -3) {
				if (Static68.anInt1533 == 15) {
					Static131.method2637();
				} else if (Static68.anInt1533 != 2) {
					Static136.method2722();
				}
			}
		}
		Static273.method4751(Static164.aClass92_7);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method855() {
		if (Static139.anInt3135 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static193.method3509() / 1000000L - Static333.aLong14;
		Static333.aLong14 = Static193.method3509() / 1000000L;
		@Pc(28) boolean local28 = Static52.method984();
		if (local28 && Static174.aBoolean320 && Static320.aClass39_2 != null) {
			Static320.aClass39_2.method4797();
		}
		if (Static139.anInt3135 == 30 || Static139.anInt3135 == 10) {
			if (Static159.aLong121 != 0L && Static159.aLong121 < Static274.method4763()) {
				Static39.method732(false, Static229.anInt4770, Static143.anInt3193, Static11.method265());
			} else if (Static164.aClass92_7.method4462() && Static189.aBoolean338) {
				Static67.method1249();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static315.aFrame2 == null) {
			@Pc(80) Container local80;
			if (Static350.aFrame3 == null) {
				local80 = Static212.aClass120_3.anApplet1;
			} else {
				local80 = Static350.aFrame3;
			}
			local89 = local80.getSize().width;
			local93 = local80.getSize().height;
			if (Static350.aFrame3 == local80) {
				@Pc(99) Insets local99 = Static350.aFrame3.getInsets();
				local93 -= local99.top + local99.bottom;
				local89 -= local99.right + local99.left;
			}
			if (local89 != Static193.anInt4171 || Static135.anInt3077 != local93) {
				if (Static164.aClass92_7 == null || Static164.aClass92_7.method4492()) {
					Static316.method4688();
				} else {
					Static135.anInt3077 = local93;
					Static193.anInt4171 = local89;
				}
				Static159.aLong121 = Static274.method4763() + 500L;
			}
		}
		if (Static315.aFrame2 != null && !Static317.aBoolean551 && (Static139.anInt3135 == 30 || Static139.anInt3135 == 10)) {
			Static39.method732(false, -1, -1, Static56.anInt1228);
		}
		@Pc(161) boolean local161 = false;
		if (Static350.aBoolean592) {
			Static350.aBoolean592 = false;
			local161 = true;
		}
		if (local161) {
			Static72.method1360();
		}
		if (Static164.aClass92_7 != null && Static164.aClass92_7.method4447() || Static11.method265() != 1) {
			Static240.method4159();
		}
		if (Static139.anInt3135 == 0) {
			Static116.method859(Static345.anInt6761, Static104.aColorArray123[Static171.anInt3786], local161, Static218.aColorArray82[Static171.anInt3786], Static298.aColorArray104[Static171.anInt3786], Static100.aString77);
		} else if (Static139.anInt3135 == 5) {
			Static98.method5505(Static164.aClass92_7, Static81.aClass78_2, Static104.aColorArray123[Static171.anInt3786].getRGB(), Static218.aColorArray82[Static171.anInt3786].getRGB(), Static298.aColorArray104[Static171.anInt3786].getRGB(), local161 | Static164.aClass92_7.method4447());
		} else if (Static139.anInt3135 == 10) {
			Static47.method903();
		} else if (Static139.anInt3135 == 25 || Static139.anInt3135 == 28) {
			if (Static19.anInt6738 == 1) {
				if (Static298.anInt6031 > Static111.anInt2451) {
					Static111.anInt2451 = Static298.anInt6031;
				}
				local89 = (Static111.anInt2451 - Static298.anInt6031) * 50 / Static111.anInt2451;
				Static164.method3149(Static118.aClass78_3, Static38.aString27 + "<br>(" + local89 + "%)", true);
			} else if (Static19.anInt6738 == 2) {
				if (Static180.anInt3947 < Static339.anInt6678) {
					Static180.anInt3947 = Static339.anInt6678;
				}
				local89 = (Static180.anInt3947 - Static339.anInt6678) * 50 / Static180.anInt3947 + 50;
				Static164.method3149(Static118.aClass78_3, Static38.aString27 + "<br>(" + local89 + "%)", true);
			} else {
				Static164.method3149(Static118.aClass78_3, Static38.aString27, true);
			}
		} else if (Static139.anInt3135 == 30) {
			Static345.method5611(local18);
		} else if (Static139.anInt3135 == 40) {
			Static164.method3149(Static118.aClass78_3, Static317.aString236 + "<br>" + Static94.aString72, true);
		}
		if (Static264.anInt3389 == 3) {
			for (local89 = 0; local89 < Static2.anInt5069; local89++) {
				@Pc(369) Rectangle local369 = Class2.aRectangleArray21[local89];
				if (Static105.aBooleanArray30[local89]) {
					Static164.aClass92_7.method4502(local369.y, local369.width, local369.x, local369.height, -1996553985);
				} else if (Static128.aBooleanArray19[local89]) {
					Static164.aClass92_7.method4502(local369.y, local369.width, local369.x, local369.height, -1996554240);
				}
			}
		}
		if (Static279.method4782()) {
			Static64.method1087(Static164.aClass92_7);
		}
		if ((Static139.anInt3135 == 30 || Static139.anInt3135 == 10) && Static264.anInt3389 == 0 && Static11.method265() == 1 && !local161 && Static172.aString131.equals("1.1")) {
			local89 = 0;
			for (local93 = 0; local93 < Static2.anInt5069; local93++) {
				if (Static128.aBooleanArray19[local93]) {
					Static128.aBooleanArray19[local93] = false;
					Static143.aRectangleArray11[local89++] = Class2.aRectangleArray21[local93];
				}
			}
			Static164.aClass92_7.method4507(Static143.aRectangleArray11, local89);
		} else if (Static139.anInt3135 != 0) {
			Static164.aClass92_7.method4452();
			for (local89 = 0; local89 < Static2.anInt5069; local89++) {
				Static128.aBooleanArray19[local89] = false;
			}
		}
		if (Static217.aBoolean385) {
			Static14.method313();
		}
		if (Static332.aBoolean571 && Static139.anInt3135 == 10 && Static310.anInt6220 != -1) {
			Static332.aBoolean571 = false;
			Static290.method4960(Static212.aClass120_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method868()) {
			return;
		}
		Static127.anInt2851 = Integer.parseInt(this.getParameter("worldid"));
		Static306.anInt6192 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static306.anInt6192 < 0 || Static306.anInt6192 > 1) {
			Static306.anInt6192 = 0;
		}
		Static189.anInt4083 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static189.anInt4083 < 0 || Static189.anInt4083 > 2) {
			Static189.anInt4083 = 0;
		}
		try {
			Static253.anInt5246 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(54) Exception local54) {
			Static253.anInt5246 = 0;
		}
		Static79.method1436(Static253.anInt5246);
		@Pc(63) String local63 = this.getParameter("objecttag");
		if (local63 != null && local63.equals("1")) {
			Static304.aBoolean538 = true;
		} else {
			Static304.aBoolean538 = false;
		}
		@Pc(79) String local79 = this.getParameter("js");
		if (local79 != null && local79.equals("1")) {
			Static27.aBoolean27 = true;
		} else {
			Static27.aBoolean27 = false;
		}
		@Pc(95) String local95 = this.getParameter("game");
		if (local95 != null && local95.equals("1")) {
			Static269.anInt5508 = 1;
		} else {
			Static269.anInt5508 = 0;
		}
		try {
			Static145.anInt3255 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(114) Exception local114) {
			Static145.anInt3255 = 0;
		}
		Static107.aString260 = this.getParameter("quiturl");
		Static153.aString115 = this.getParameter("settings");
		if (Static153.aString115 == null) {
			Static153.aString115 = "";
		}
		@Pc(132) String local132 = this.getParameter("country");
		if (local132 != null) {
			try {
				Static10.anInt205 = Integer.parseInt(local132);
			} catch (@Pc(139) Exception local139) {
				Static10.anInt205 = 0;
			}
		}
		Static171.anInt3786 = Integer.parseInt(this.getParameter("colourid"));
		if (Static171.anInt3786 < 0 || Static171.anInt3786 >= Static298.aColorArray104.length) {
			Static171.anInt3786 = 0;
		}
		Static78.aClient1 = this;
		this.method862(Static189.anInt4083 + 32);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method882() {
		if (Static331.aClass93_2.anInt2727 > Static14.anInt314) {
			Static208.anInt4350 = (Static331.aClass93_2.anInt2727 - 1) * 5 * 50;
			if (Static47.anInt1066 == Static120.anInt2720) {
				Static47.anInt1066 = Static73.anInt1645;
			} else {
				Static47.anInt1066 = Static120.anInt2720;
			}
			if (Static208.anInt4350 > 3000) {
				Static208.anInt4350 = 3000;
			}
			if (Static331.aClass93_2.anInt2727 >= 2 && Static331.aClass93_2.anInt2728 == 6) {
				this.method864("js5connect_outofdate");
				Static139.anInt3135 = 1000;
				return;
			}
			if (Static331.aClass93_2.anInt2727 >= 4 && Static331.aClass93_2.anInt2728 == -1) {
				this.method864("js5crc");
				Static139.anInt3135 = 1000;
				return;
			}
			if (Static331.aClass93_2.anInt2727 >= 4 && (Static139.anInt3135 == 0 || Static139.anInt3135 == 5)) {
				if (Static331.aClass93_2.anInt2728 == 7 || Static331.aClass93_2.anInt2728 == 9) {
					this.method864("js5connect_full");
				} else if (Static331.aClass93_2.anInt2728 > 0) {
					this.method864("js5connect");
				} else {
					this.method864("js5io");
				}
				Static139.anInt3135 = 1000;
				return;
			}
		}
		Static14.anInt314 = Static331.aClass93_2.anInt2727;
		if (Static208.anInt4350 > 0) {
			Static208.anInt4350--;
			return;
		}
		try {
			if (Static348.anInt6794 == 0) {
				Static79.aClass51_2 = Static212.aClass120_3.method3227(Static47.anInt1066, Static124.aString117);
				Static348.anInt6794++;
			}
			if (Static348.anInt6794 == 1) {
				if (Static79.aClass51_2.anInt1229 == 2) {
					this.method887(1000);
					return;
				}
				if (Static79.aClass51_2.anInt1229 == 1) {
					Static348.anInt6794++;
				}
			}
			if (Static348.anInt6794 == 2) {
				Static336.aClass171_4 = new Class171((Socket) Static79.aClass51_2.anObject1, Static212.aClass120_3);
				@Pc(189) Class4_Sub7 local189 = new Class4_Sub7(5);
				local189.method2416(15);
				local189.method2387(559);
				Static336.aClass171_4.method4636(local189.aByteArray42, 5);
				Static348.anInt6794++;
				Static17.aLong19 = Static274.method4763();
			}
			if (Static348.anInt6794 == 3) {
				if (Static139.anInt3135 == 0 || Static139.anInt3135 == 5 || Static336.aClass171_4.method4638() > 0) {
					@Pc(247) int local247 = Static336.aClass171_4.method4639();
					if (local247 != 0) {
						this.method887(local247);
						return;
					}
					Static348.anInt6794++;
				} else if (Static274.method4763() - Static17.aLong19 > 30000L) {
					this.method887(1001);
					return;
				}
			}
			if (Static348.anInt6794 == 4) {
				@Pc(283) boolean local283 = Static139.anInt3135 == 5 || Static139.anInt3135 == 10 || Static139.anInt3135 == 28;
				Static331.aClass93_2.method2426(Static336.aClass171_4, !local283);
				Static348.anInt6794 = 0;
				Static336.aClass171_4 = null;
				Static79.aClass51_2 = null;
			}
		} catch (@Pc(300) IOException local300) {
			this.method887(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method883() {
		@Pc(7) boolean local7 = Static331.aClass93_2.method2432();
		if (!local7) {
			this.method882();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method852() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static316.method4688();
		Static148.aClass199_4 = new Class199(Static212.aClass120_3);
		Static331.aClass93_2 = new Class93();
		if (Static189.anInt4083 != 0) {
			Static329.aByteArrayArray24 = new byte[50][];
		}
		Static132.method2675(Static212.aClass120_3);
		if (Static306.anInt6192 == 0) {
			Static58.aString36 = this.getCodeBase().getHost();
			Static294.anInt3990 = 443;
			Static5.anInt152 = 43594;
		} else if (Static306.anInt6192 == 1) {
			Static58.aString36 = this.getCodeBase().getHost();
			Static5.anInt152 = Static127.anInt2851 + 40000;
			Static294.anInt3990 = Static127.anInt2851 + 50000;
		} else if (Static306.anInt6192 == 2) {
			Static58.aString36 = "127.0.0.1";
			Static5.anInt152 = Static127.anInt2851 + 40000;
			Static294.anInt3990 = Static127.anInt2851 + 50000;
		}
		Static120.anInt2720 = Static5.anInt152;
		Static124.aString117 = Static58.aString36;
		Static109.anInt2399 = Static5.anInt152;
		Static73.anInt1645 = Static294.anInt3990;
		Static86.aShortArray43 = Static81.aShortArray42 = Static233.aShortArray73 = Static106.aShortArray47 = new short[256];
		Static47.anInt1066 = Static109.anInt2399;
		if (Static269.anInt5508 == 1) {
			Static59.anInt1272 = 16777215;
			Static101.aShortArrayArray8 = Static225.aShortArrayArray11;
			Static325.anInt6400 = 0;
			Static335.aShortArrayArray12 = Static156.aShortArrayArray9;
			Static311.aShortArray112 = Static270.aShortArray114;
			Static106.aBoolean205 = true;
			Static218.aShortArray72 = Static93.aShortArray46;
		} else {
			Static101.aShortArrayArray8 = Static169.aShortArrayArray10;
			Static335.aShortArrayArray12 = Static117.aShortArrayArray5;
			Static218.aShortArray72 = Static187.aShortArray58;
			Static311.aShortArray112 = Static108.aShortArray48;
		}
		if (Static172.anInt3803 == 3) {
			Static320.anInt6328 = Static127.anInt2851;
		}
		Static78.method1412();
		Static164.method3146(Static101.aCanvas8);
		Static102.method1878(Static101.aCanvas8);
		Static76.aClass117_1 = Static98.method5501();
		if (Static76.aClass117_1 != null) {
			Static76.aClass117_1.method3193(Static101.aCanvas8);
		}
		Static354.anInt4885 = Static172.anInt3803;
		try {
			if (Static212.aClass120_3.aClass212_1 != null) {
				Static7.aClass149_1 = new Class149(Static212.aClass120_3.aClass212_1, 5200, 0);
				for (@Pc(172) int local172 = 0; local172 < 29; local172++) {
					Static355.aClass149Array1[local172] = new Class149(Static212.aClass120_3.aClass212Array1[local172], 6000, 0);
				}
				Static18.aClass149_2 = new Class149(Static212.aClass120_3.aClass212_2, 6000, 0);
				Static38.aClass169_1 = new Class169(255, Static7.aClass149_1, Static18.aClass149_2, 500000);
				Static153.aClass149_3 = new Class149(Static212.aClass120_3.aClass212_3, 24, 0);
				Static212.aClass120_3.aClass212Array1 = null;
				Static212.aClass120_3.aClass212_1 = null;
				Static212.aClass120_3.aClass212_3 = null;
				Static212.aClass120_3.aClass212_2 = null;
			}
		} catch (@Pc(228) IOException local228) {
			Static38.aClass169_1 = null;
			Static7.aClass149_1 = null;
			Static153.aClass149_3 = null;
			Static18.aClass149_2 = null;
		}
		if (Static269.anInt5508 == 0) {
			Static243.aString185 = Static44.aString31;
		} else if (Static269.anInt5508 == 1) {
			Static243.aString185 = Static37.aString26;
		}
		if (Static306.anInt6192 != 0) {
			Static258.aBoolean450 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method885(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub7 local10 = new Class4_Sub7(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local10.method2380();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(28) int[] local28 = Static235.anIntArray535 = new int[6];
					local28[0] = local10.method2404();
					local28[1] = local10.method2404();
					local28[2] = local10.method2404();
					local28[3] = local10.method2404();
					local28[4] = local10.method2404();
					local28[5] = local10.method2404();
				} else if (local18 == 4) {
					@Pc(75) int local75 = local10.method2380();
					Static100.anIntArray223 = new int[local75];
					for (@Pc(80) int local80 = 0; local80 < local75; local80++) {
						Static100.anIntArray223[local80] = local10.method2404();
						if (Static100.anIntArray223[local80] == 65535) {
							Static100.anIntArray223[local80] = -1;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method887(@OriginalArg(0) int arg0) {
		Static79.aClass51_2 = null;
		Static348.anInt6794 = 0;
		Static336.aClass171_4 = null;
		Static331.aClass93_2.anInt2728 = arg0;
		Static331.aClass93_2.anInt2727++;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method888() {
		if (!Static332.aBoolean571) {
			label222: while (true) {
				do {
					if (!Static204.method3619()) {
						break label222;
					}
				} while (Static306.aChar4 != 's' && Static306.aChar4 != 'S');
				Static332.aBoolean571 = true;
			}
		}
		@Pc(37) int local37;
		if (Static148.anInt4861 == 0) {
			@Pc(27) Runtime local27 = Runtime.getRuntime();
			local37 = (int) ((local27.totalMemory() - local27.freeMemory()) / 1024L);
			@Pc(42) long local42 = Static274.method4763();
			if (Static135.aLong107 == 0L) {
				Static135.aLong107 = local42;
			}
			if (local37 > 16384 && local42 - Static135.aLong107 < 5000L) {
				if (local42 - Static295.aLong222 > 1000L) {
					System.gc();
					Static295.aLong222 = local42;
				}
				Static345.anInt6761 = 5;
				Static100.aString77 = Static77.aString53;
			} else {
				Static148.anInt4861 = 10;
				Static345.anInt6761 = 5;
				Static100.aString77 = Static30.aString18;
			}
			return;
		}
		@Pc(86) int local86;
		if (Static148.anInt4861 == 10) {
			for (local86 = 0; local86 < 4; local86++) {
				Static345.aClass174Array1[local86] = Static322.method5313(Static290.anInt5893, Static92.anInt2048);
			}
			Static345.anInt6761 = 10;
			Static148.anInt4861 = 20;
			Static100.aString77 = Static109.aString81;
		} else if (Static148.anInt4861 == 20) {
			if (Static176.aClass111_1 == null) {
				Static176.aClass111_1 = new Class111(Static331.aClass93_2, Static148.aClass199_4);
			}
			if (Static176.aClass111_1.method3030()) {
				Static16.aClass11_3 = Static134.method2702(true, false, 0);
				Static114.aClass11_52 = Static134.method2702(true, false, 1);
				Static266.aClass11_113 = Static134.method2702(true, false, 2);
				Static52.aClass11_19 = Static134.method2702(true, false, 3);
				Static60.aClass11_28 = Static134.method2702(true, false, 4);
				Static159.aClass11_72 = Static134.method2702(true, true, 5);
				Static20.aClass11_9 = Static134.method2702(false, true, 6);
				Static67.aClass11_31 = Static134.method2702(true, false, 7);
				Static292.aClass11_130 = Static134.method2702(true, false, 8);
				Static5.aClass11_2 = Static134.method2702(true, false, 9);
				Static316.aClass11_114 = Static134.method2702(true, false, 10);
				Static203.aClass11_84 = Static134.method2702(true, false, 11);
				Static54.aClass11_21 = Static134.method2702(true, false, 12);
				Static58.aClass11_24 = Static134.method2702(true, false, 13);
				Static234.aClass11_97 = Static134.method2702(false, false, 14);
				Static292.aClass11_129 = Static134.method2702(true, false, 15);
				Static191.aClass11_80 = Static134.method2702(true, false, 16);
				Static112.aClass11_51 = Static134.method2702(true, false, 17);
				Static150.aClass11_148 = Static134.method2702(true, false, 18);
				Static54.aClass11_20 = Static134.method2702(true, false, 19);
				Static144.aClass11_68 = Static134.method2702(true, false, 20);
				Static78.aClass11_39 = Static134.method2702(true, false, 21);
				Static55.aClass11_22 = Static134.method2702(true, false, 22);
				Static150.aClass11_147 = Static134.method2702(true, true, 23);
				Static237.aClass11_98 = Static134.method2702(true, false, 24);
				Static19.aClass11_150 = Static134.method2702(true, false, 25);
				Static349.aClass11_154 = Static134.method2702(true, true, 26);
				Static309.aClass11_138 = Static134.method2702(true, false, 27);
				Static230.aClass11_94 = Static134.method2702(true, true, 28);
				Static148.anInt4861 = 30;
				Static345.anInt6761 = 15;
				Static100.aString77 = Static297.aString226;
			} else {
				Static345.anInt6761 = 12;
				Static100.aString77 = Static196.aString147;
			}
		} else if (Static148.anInt4861 == 30) {
			local86 = 0;
			for (local37 = 0; local37 < 29; local37++) {
				local86 += Static67.aClass18_Sub1Array1[local37].method5608() * Static120.anIntArray249[local37] / 100;
			}
			if (local86 == 100) {
				Static100.aString77 = Static6.aString66;
				Static345.anInt6761 = 20;
				Static57.method1019(Static292.aClass11_130);
				Static200.method3577(Static292.aClass11_130);
				Static148.anInt4861 = 40;
			} else {
				Static345.anInt6761 = 20;
				if (local86 != 0) {
					Static100.aString77 = Static19.aString249 + local86 + "%";
				}
			}
		} else if (Static148.anInt4861 == 40) {
			if (Static230.aClass11_94.method303()) {
				this.method885(Static230.aClass11_94.method300(1));
				Static345.anInt6761 = 25;
				Static100.aString77 = Static347.aString251;
				Static148.anInt4861 = 50;
			} else {
				Static100.aString77 = Static78.aString54 + Static230.aClass11_94.method293() + "%";
				Static345.anInt6761 = 25;
			}
		} else if (Static148.anInt4861 == 50) {
			Static195.method3537(Static240.aBoolean423);
			Static206.aClass4_Sub13_Sub3_2 = new Class4_Sub13_Sub3();
			Static206.aClass4_Sub13_Sub3_2.method4872();
			Static320.aClass39_2 = Static126.method2523(Static212.aClass120_3, 0, Static101.aCanvas8, 22050);
			Static320.aClass39_2.method4793(Static206.aClass4_Sub13_Sub3_2);
			Static22.method395(Static60.aClass11_28, Static234.aClass11_97, Static292.aClass11_129, Static206.aClass4_Sub13_Sub3_2);
			Static36.aClass39_1 = Static126.method2523(Static212.aClass120_3, 1, Static101.aCanvas8, 2048);
			Static337.aClass4_Sub13_Sub2_2 = new Class4_Sub13_Sub2();
			Static36.aClass39_1.method4793(Static337.aClass4_Sub13_Sub2_2);
			Static127.aClass118_1 = new Class118(22050, Static57.anInt1232);
			Static83.anInt1764 = Static20.aClass11_9.method301("scape main");
			Static100.aString77 = Static210.aString203;
			Static345.anInt6761 = 30;
			Static148.anInt4861 = 60;
		} else if (Static148.anInt4861 == 60) {
			local86 = Static84.method1500(Static58.aClass11_24, Static292.aClass11_130);
			local37 = Static260.method4427();
			if (local86 < local37) {
				Static345.anInt6761 = 35;
				Static100.aString77 = Static285.aString212 + local86 * 100 / local37 + "%";
			} else {
				Static148.anInt4861 = 70;
				Static345.anInt6761 = 35;
				Static100.aString77 = Static170.aString126;
			}
		} else if (Static148.anInt4861 == 70) {
			local86 = Static135.method2710(Static292.aClass11_130);
			local37 = Static39.method739();
			if (local86 < local37) {
				Static345.anInt6761 = 40;
				Static100.aString77 = Static208.aString154 + local86 * 100 / local37 + "%";
			} else {
				Static100.aString77 = Static257.aString191;
				Static345.anInt6761 = 40;
				Static148.anInt4861 = 80;
			}
		} else if (Static148.anInt4861 == 80) {
			if (Static349.aClass11_154.method303()) {
				Static156.anInterface1_3 = new Class217(Static349.aClass11_154, Static5.aClass11_2, Static292.aClass11_130);
				Static345.anInt6761 = 45;
				Static100.aString77 = Static246.aString187;
				Static148.anInt4861 = 90;
			} else {
				Static100.aString77 = Static307.aString125 + Static349.aClass11_154.method293() + "%";
				Static345.anInt6761 = 45;
			}
		} else if (Static148.anInt4861 == 90) {
			Static148.anInt4861 = 95;
			Static100.aString77 = Static348.aString252;
			Static345.anInt6761 = 50;
		} else if (Static148.anInt4861 == 95) {
			if (Static332.aBoolean571) {
				Static339.anInt6679 = 0;
				Static56.anInt1228 = 1;
				Static273.anInt5611 = 0;
				Static152.anInt3390 = 0;
				Static351.anInt6806 = 0;
			}
			Static332.aBoolean571 = true;
			Static290.method4960(Static212.aClass120_3);
			Static355.method5714();
			Static137.method2729(false, Static273.anInt5611);
			Static345.anInt6761 = 55;
			Static100.aString77 = Static52.aString34;
			Static148.anInt4861 = 100;
		} else if (Static148.anInt4861 == 100) {
			Static138.method2739(Static58.aClass11_24, Static292.aClass11_130, Static164.aClass92_7);
			Static100.aString77 = Static106.aString79;
			Static345.anInt6761 = 60;
			Static233.method3965(5);
			Static148.anInt4861 = 110;
		} else if (Static148.anInt4861 == 110) {
			Static266.aClass11_113.method303();
			local86 = Static266.aClass11_113.method293();
			Static191.aClass11_80.method303();
			local86 += Static191.aClass11_80.method293();
			Static112.aClass11_51.method303();
			local86 += Static112.aClass11_51.method293();
			Static150.aClass11_148.method303();
			local86 += Static150.aClass11_148.method293();
			Static54.aClass11_20.method303();
			local86 += Static54.aClass11_20.method293();
			Static144.aClass11_68.method303();
			local86 += Static144.aClass11_68.method293();
			Static78.aClass11_39.method303();
			local86 += Static78.aClass11_39.method293();
			Static55.aClass11_22.method303();
			local86 += Static55.aClass11_22.method293();
			Static237.aClass11_98.method303();
			local86 += Static237.aClass11_98.method293();
			Static19.aClass11_150.method303();
			local86 += Static19.aClass11_150.method293();
			Static309.aClass11_138.method303();
			local86 += Static309.aClass11_138.method293();
			if (local86 < 1100) {
				Static345.anInt6761 = 65;
				Static100.aString77 = Static191.aString139 + local86 / 11 + "%";
			} else {
				Static12.method278(Static266.aClass11_113);
				Static331.method5440(Static266.aClass11_113);
				Static268.method4659(Static266.aClass11_113);
				Static28.method5006(Static266.aClass11_113, Static67.aClass11_31);
				Static286.method4909(Static67.aClass11_31, Static191.aClass11_80);
				Static291.method4974(Static67.aClass11_31, Static150.aClass11_148);
				Static78.method1415(Static54.aClass11_20, Static67.aClass11_31);
				Static170.method3201(Static266.aClass11_113);
				Static8.method240(Static144.aClass11_68, Static114.aClass11_52, Static16.aClass11_3);
				Static302.method5120(Static266.aClass11_113);
				Static333.method77(Static67.aClass11_31, Static78.aClass11_39);
				Static44.method811(Static55.aClass11_22);
				Static182.method3395(Static266.aClass11_113);
				Static138.method2736(Static292.aClass11_130, Static67.aClass11_31, Static58.aClass11_24, Static52.aClass11_19);
				Static215.method3720(Static266.aClass11_113);
				Static271.method4735(Static112.aClass11_51);
				Static184.method3417(Static237.aClass11_98, new Class150(), Static19.aClass11_150);
				Static122.method2461(Static237.aClass11_98, Static19.aClass11_150);
				Static129.method2603(Static266.aClass11_113);
				Static318.method5277(Static266.aClass11_113);
				Static170.method3204(Static266.aClass11_113);
				Static234.method3973(Static266.aClass11_113, Static292.aClass11_130);
				Static160.method3096(Static266.aClass11_113, Static292.aClass11_130);
				Static67.method1252(Static266.aClass11_113);
				Static8.method243(Static292.aClass11_130, Static266.aClass11_113);
				Static169.method3183(Static266.aClass11_113);
				Static100.method1853(Static266.aClass11_113);
				Static345.anInt6761 = 65;
				Static100.aString77 = Static213.aString163;
				Static249.method4320();
				Static148.anInt4861 = 120;
			}
		} else if (Static148.anInt4861 == 120) {
			local86 = Static27.method477(Static292.aClass11_130);
			local37 = Static344.method5599();
			if (local37 > local86) {
				Static345.anInt6761 = 70;
				Static100.aString77 = Static229.aString174 + local86 * 100 / local37 + "%";
			} else {
				Static317.method5266(Static164.aClass92_7, Static292.aClass11_130);
				Static323.method5320(Static164.aClass60Array7);
				Static148.anInt4861 = 130;
				Static100.aString77 = Static279.aString207;
				Static345.anInt6761 = 70;
			}
		} else if (Static148.anInt4861 == 130) {
			Static165.aClass67_5 = new Class67();
			Static212.aClass120_3.method3232(Static165.aClass67_5, 10);
			Static148.anInt4861 = 140;
			Static100.aString77 = Static223.aString170;
			Static345.anInt6761 = 75;
		} else if (Static148.anInt4861 == 140) {
			if (Static316.aClass11_114.method289("huffman", "")) {
				@Pc(1076) Class126 local1076 = new Class126(Static316.aClass11_114.method283("", "huffman"));
				Static325.method5351(local1076);
				Static345.anInt6761 = 80;
				Static100.aString77 = Static148.aString176;
				Static148.anInt4861 = 150;
			} else {
				Static345.anInt6761 = 80;
				Static100.aString77 = Static271.aString204 + "0%";
			}
		} else if (Static148.anInt4861 == 150) {
			if (!Static52.aClass11_19.method303()) {
				Static100.aString77 = Static119.aString85 + Static52.aClass11_19.method293() * 3 / 4 + "%";
				Static345.anInt6761 = 85;
			} else if (!Static54.aClass11_21.method303()) {
				Static100.aString77 = Static119.aString85 + (Static54.aClass11_21.method293() / 10 + 75) + "%";
				Static345.anInt6761 = 85;
			} else if (!Static58.aClass11_24.method303()) {
				Static100.aString77 = Static119.aString85 + (Static58.aClass11_24.method293() / 20 + 85) + "%";
				Static345.anInt6761 = 85;
			} else if (Static150.aClass11_147.method291("details")) {
				Static42.method2050(Static150.aClass11_147);
				Static345.method5612(Static309.aClass11_138);
				Static9.method5410(Static67.aClass11_31, Static156.anInterface1_3);
				Static345.anInt6761 = 85;
				Static100.aString77 = Static150.aString244;
				Static148.anInt4861 = 160;
			} else {
				Static100.aString77 = Static119.aString85 + (Static150.aClass11_147.method304("details") / 10 + 90) + "%";
				Static345.anInt6761 = 85;
			}
		} else if (Static148.anInt4861 == 160) {
			local86 = Static307.method3190();
			if (local86 == -1) {
				Static100.aString77 = Static136.aString105;
				Static345.anInt6761 = 90;
			} else if (local86 == 7 || local86 == 9) {
				this.method864("worldlistfull");
				Static233.method3965(1000);
			} else if (Static258.aBoolean449) {
				Static100.aString77 = Static209.aString157;
				Static345.anInt6761 = 90;
				Static148.anInt4861 = 170;
			} else {
				this.method864("worldlistio_" + local86);
				Static233.method3965(1000);
			}
		} else if (Static148.anInt4861 == 170) {
			Static289.anIntArray486 = new int[Static160.anInt3615];
			Static72.aBooleanArray12 = new boolean[Static160.anInt3615];
			Static60.aStringArray7 = new String[Static44.anInt942];
			for (local86 = 0; local86 < Static160.anInt3615; local86++) {
				if (Static107.method5713(local86).anInt4450 == 0) {
					Static72.aBooleanArray12[local86] = true;
					Static337.anInt5811++;
				}
				Static289.anIntArray486[local86] = -1;
			}
			Static160.method3094();
			Static79.anInt1718 = Static52.aClass11_19.method301("loginscreen");
			Static159.aClass11_72.method280(false);
			Static20.aClass11_9.method280(true);
			Static292.aClass11_130.method280(true);
			Static58.aClass11_24.method280(true);
			Static316.aClass11_114.method280(true);
			Static52.aClass11_19.method280(true);
			Static217.aBoolean385 = true;
			Static266.aClass11_113.anInt298 = 2;
			Static112.aClass11_51.anInt298 = 2;
			Static191.aClass11_80.anInt298 = 2;
			Static150.aClass11_148.anInt298 = 2;
			Static54.aClass11_20.anInt298 = 2;
			Static144.aClass11_68.anInt298 = 2;
			Static78.aClass11_39.anInt298 = 2;
			Static39.method732(false, -1, -1, Static56.anInt1228);
			Static148.anInt4861 = 180;
			Static100.aString77 = Static67.aString46;
			Static345.anInt6761 = 95;
		} else if (Static148.anInt4861 == 180) {
			Static156.method3020(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method889() {
		Static352.anInt6604 = 0;
		while (Static204.method3619() && Static352.anInt6604 < 128) {
			if (!Static265.method4633() || Static306.aChar4 != '`' && Static306.aChar4 != '§') {
				Static129.anIntArray269[Static352.anInt6604] = Static229.anInt4776;
				Static305.anIntArray501[Static352.anInt6604] = Static306.aChar4;
				Static352.anInt6604++;
			} else if (Static279.method4782()) {
				Static161.method3107();
			} else {
				Static13.method307();
			}
		}
		if (Static279.method4782()) {
			Static242.method4204();
		}
		Static106.anInt2370++;
		Static279.method4784(-1, null, -1);
		Static59.method1050(null, -1, -1);
		if (Static310.anInt6220 != -1) {
			Static46.method881(Static310.anInt6220, 0, 0, Static38.anInt832, 0, 0, Static202.anInt4258);
		}
		Static344.anInt6736++;
		for (@Pc(93) int local93 = 0; local93 < 32768; local93++) {
			@Pc(99) Class2_Sub2_Sub1_Sub2 local99 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local93];
			if (local99 != null) {
				@Pc(105) byte local105 = local99.aClass34_1.aByte19;
				if ((local105 & 0x1) != 0) {
					@Pc(113) int local113 = local99.method5425();
					@Pc(137) int local137;
					if ((local105 & 0x2) != 0 && local99.anInt6547 == 0 && Math.random() * 1000.0D < 10.0D) {
						local137 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(145) int local145 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local137 != 0 || local145 != 0) {
							@Pc(159) int local159 = local99.anIntArray518[0] + local137;
							if (local159 < 0) {
								local159 = 0;
							} else if (Static92.anInt2048 - local113 - 1 < local159) {
								local159 = Static92.anInt2048 - local113 - 1;
							}
							@Pc(190) int local190 = local145 + local99.anIntArray517[0];
							if (local190 < 0) {
								local190 = 0;
							} else if (local190 > Static290.anInt5893 - local113 - 1) {
								local190 = Static290.anInt5893 - local113 - 1;
							}
							@Pc(236) int local236 = Static13.method308(0, Static15.anIntArray46, local113, -1, Static345.aClass174Array1[local99.aByte73], local113, local159, true, 0, local99.anIntArray518[0], local113, local99.anIntArray517[0], local190, Static163.anIntArray316);
							if (local236 > 0) {
								if (local236 > 9) {
									local236 = 9;
								}
								for (@Pc(247) int local247 = 0; local247 < local236; local247++) {
									local99.anIntArray518[local247] = Static163.anIntArray316[local236 - local247 - 1];
									local99.anIntArray517[local247] = Static15.anIntArray46[local236 - local247 - 1];
									local99.aByteArray90[local247] = 1;
								}
								local99.anInt6547 = local236;
							}
						}
					}
					Static343.method5587(local99, true);
					local137 = Static206.method3642(local99);
					Static287.method4921(local137, Static134.anInt3070, Static50.anInt1103, local99);
					Static343.method5589(local99);
				}
			}
		}
		if (Static279.anInt5648 == 0 && Static45.anInt5671 == 0) {
			if (Static303.anInt3065 == 2) {
				Static142.method2792();
			} else {
				Static115.method2087();
			}
			if (Static230.anInt4796 >> 7 < 14 || Static230.anInt4796 >> 7 >= Static92.anInt2048 - 14 || Static133.anInt3056 >> 7 < 14 || Static290.anInt5893 - 14 <= Static133.anInt3056 >> 7) {
				Static220.method3779();
			}
		}
		while (true) {
			@Pc(359) Class4_Sub22 local359;
			@Pc(364) Class72 local364;
			@Pc(375) Class72 local375;
			do {
				local359 = (Class4_Sub22) Static152.aClass130_72.method3500();
				if (local359 == null) {
					while (true) {
						do {
							local359 = (Class4_Sub22) Static344.aClass130_154.method3500();
							if (local359 == null) {
								while (true) {
									do {
										local359 = (Class4_Sub22) Static238.aClass130_107.method3500();
										if (local359 == null) {
											if (Static301.aClass72_19 != null) {
												Static111.method2068();
											}
											if (Static342.anInt6706 % 1500 == 0) {
												Static149.method2878();
											}
											Static265.method4626();
											if (Static156.aBoolean291 && Static9.aLong243 < Static274.method4763() - 60000L) {
												Static188.method3431();
												return;
											}
											return;
										}
										local364 = local359.aClass72_12;
										if (local364.anInt1849 < 0) {
											break;
										}
										local375 = Static66.method1243(local364.anInt1813);
									} while (local375 == null || local375.aClass72Array1 == null || local364.anInt1849 >= local375.aClass72Array1.length || local364 != local375.aClass72Array1[local364.anInt1849]);
									Static97.method1756(local359);
								}
							}
							local364 = local359.aClass72_12;
							if (local364.anInt1849 < 0) {
								break;
							}
							local375 = Static66.method1243(local364.anInt1813);
						} while (local375 == null || local375.aClass72Array1 == null || local364.anInt1849 >= local375.aClass72Array1.length || local364 != local375.aClass72Array1[local364.anInt1849]);
						Static97.method1756(local359);
					}
				}
				local364 = local359.aClass72_12;
				if (local364.anInt1849 < 0) {
					break;
				}
				local375 = Static66.method1243(local364.anInt1813);
			} while (local375 == null || local375.aClass72Array1 == null || local364.anInt1849 >= local375.aClass72Array1.length || local364 != local375.aClass72Array1[local364.anInt1849]);
			Static97.method1756(local359);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method869() {
		if (Static156.aBoolean291) {
			Static188.method3431();
		}
		if (Static164.aClass92_7 != null) {
			Static164.aClass92_7.method4478();
		}
		if (Static315.aFrame2 != null) {
			Static72.method1361(Static315.aFrame2, Static212.aClass120_3);
			Static315.aFrame2 = null;
		}
		if (Static165.aClass67_5 != null) {
			Static165.aClass67_5.aBoolean130 = false;
		}
		Static165.aClass67_5 = null;
		if (Static131.aClass171_3 != null) {
			Static131.aClass171_3.method4637();
			Static131.aClass171_3 = null;
		}
		Static85.method1516(Static101.aCanvas8);
		Static211.method3683(Static101.aCanvas8);
		if (Static76.aClass117_1 != null) {
			Static76.aClass117_1.method3191(Static101.aCanvas8);
		}
		Static65.method1099();
		Static333.method76();
		Static76.aClass117_1 = null;
		if (Static320.aClass39_2 != null) {
			Static320.aClass39_2.method4798();
		}
		if (Static36.aClass39_1 != null) {
			Static36.aClass39_1.method4798();
		}
		Static331.aClass93_2.method2429();
		Static148.aClass199_4.method5275();
		if (Static113.aClass66_8 != null) {
			Static113.aClass66_8.method1408();
			Static113.aClass66_8 = null;
		}
	}
}
