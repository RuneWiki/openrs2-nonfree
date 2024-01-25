import jagex3.jagmisc.jagmisc;
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
			if (arg0.length != 6) {
				Static373.method4782("Argument count");
			}
			Static393.aClass124_6 = new Class124();
			Static393.aClass124_6.anInt3453 = Integer.parseInt(arg0[0]);
			Static257.aClass124_4 = new Class124();
			Static257.aClass124_4.anInt3453 = Integer.parseInt(arg0[1]);
			Static26.aClass124_1 = new Class124();
			Static26.aClass124_1.anInt3453 = Integer.parseInt(arg0[2]);
			Static313.aClass136_7 = Static50.aClass136_1;
			if (arg0[3].equals("live")) {
				Static451.aClass181_7 = Static173.aClass181_3;
			} else if (arg0[3].equals("rc")) {
				Static451.aClass181_7 = Static380.aClass181_6;
			} else if (arg0[3].equals("wip")) {
				Static451.aClass181_7 = Static258.aClass181_4;
			} else {
				Static373.method4782("modewhat");
			}
			Static5.anInt20 = Static303.method4040(arg0[4]);
			if (Static5.anInt20 == -1) {
				if (arg0[4].equals("english")) {
					Static5.anInt20 = 0;
				} else if (arg0[4].equals("german")) {
					Static5.anInt20 = 1;
				} else {
					Static373.method4782("language");
				}
			}
			Static129.aBoolean142 = false;
			Static193.aBoolean205 = false;
			if (arg0[5].equals("game0")) {
				Static191.aClass137_3 = Static419.aClass137_4;
			} else if (arg0[5].equals("game1")) {
				Static191.aClass137_3 = Static55.aClass137_1;
			} else {
				Static373.method4782("game");
			}
			Static274.anInt4622 = 0;
			Static17.anInt265 = Static191.aClass137_3.anInt3868;
			Static184.aBoolean199 = true;
			Static263.aBoolean285 = true;
			Static240.aString48 = "";
			Static191.anInt3399 = 0;
			@Pc(153) client local153 = new client();
			Static129.aClient1 = local153;
			local153.method715(Static191.aClass137_3.aString45, Static451.aClass181_7.method3873() + 32);
			Static452.aFrame5.setLocation(40, 40);
		} catch (@Pc(176) Exception local176) {
			Static419.method5247(local176, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method701() {
		try {
			this.method721();
		} catch (@Pc(8) OutOfMemoryError local8) {
			if (local8.getMessage() == null || !local8.getMessage().startsWith("native")) {
				throw local8;
			}
			Static90.method1613(0);
			Static419.method5247(local8, local8.getMessage() + " (Recovered) " + this.method713());
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method699()) {
			return;
		}
		Static393.aClass124_6 = new Class124();
		Static393.aClass124_6.anInt3453 = Integer.parseInt(this.getParameter("worldid"));
		Static257.aClass124_4 = new Class124();
		Static257.aClass124_4.anInt3453 = Integer.parseInt(this.getParameter("lobbyid"));
		Static257.aClass124_4.aString37 = this.getParameter("lobbyaddress");
		Static26.aClass124_1 = new Class124();
		Static26.aClass124_1.anInt3453 = Integer.parseInt(this.getParameter("demoid"));
		Static26.aClass124_1.aString37 = this.getParameter("demoaddress");
		Static313.aClass136_7 = Static233.method4312(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static73.method1202(Static313.aClass136_7) && Static313.aClass136_7 != Static167.aClass136_5) {
			Static313.aClass136_7 = Static167.aClass136_5;
		}
		Static451.aClass181_7 = Static344.method4448(Integer.parseInt(this.getParameter("modewhat")));
		if (Static258.aClass181_4 != Static451.aClass181_7 && Static451.aClass181_7 != Static380.aClass181_6 && Static451.aClass181_7 != Static173.aClass181_3) {
			Static451.aClass181_7 = Static173.aClass181_3;
		}
		try {
			Static5.anInt20 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static5.anInt20 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static129.aBoolean142 = true;
		} else {
			Static129.aBoolean142 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static193.aBoolean205 = true;
		} else {
			Static193.aBoolean205 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static138.aBoolean149 = true;
		} else {
			Static138.aBoolean149 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static191.aClass137_3 = Static419.aClass137_4;
			} else if (local145.equals("1")) {
				Static191.aClass137_3 = Static55.aClass137_1;
			}
		}
		try {
			Static274.anInt4622 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static274.anInt4622 = 0;
		}
		Static457.aString73 = this.getParameter("quiturl");
		Static240.aString48 = this.getParameter("settings");
		if (Static240.aString48 == null) {
			Static240.aString48 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static191.anInt3399 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static191.anInt3399 = 0;
			}
		}
		Static17.anInt265 = Integer.parseInt(this.getParameter("colourid"));
		if (Static17.anInt265 < 0 || Static17.anInt265 >= Static123.aColorArray2.length) {
			Static17.anInt265 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static184.aBoolean199 = true;
			Static263.aBoolean285 = true;
		}
		Static129.aClient1 = this;
		if (Static419.aClass137_4 == Static191.aClass137_3) {
			Static81.anInt1634 = 503;
			Static448.anInt7377 = 765;
		} else if (Static191.aClass137_3 == Static55.aClass137_1) {
			Static81.anInt1634 = 480;
			Static448.anInt7377 = 640;
		}
		this.method712(Static81.anInt1634, Static448.anInt7377, Static451.aClass181_7.method3873() + 32);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method716() {
		@Pc(11) boolean local11 = Static90.aClass120_1.method2652();
		if (!local11) {
			this.method726();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method700() {
		try {
			this.method734();
		} catch (@Pc(16) OutOfMemoryError local16) {
			if (local16.getMessage() == null || !local16.getMessage().startsWith("native")) {
				throw local16;
			}
			Static90.method1613(0);
			Static419.method5247(local16, local16.getMessage() + " (Recovered) " + this.method713());
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method697() {
		if (Static351.aBoolean381) {
			Static157.method2340();
		}
		if (Static269.aClass51_9 != null) {
			Static269.aClass51_9.method5315();
		}
		if (Static145.aFrame4 != null) {
			Static39.method562(Static230.aClass61_4, Static145.aFrame4);
			Static145.aFrame4 = null;
		}
		if (Static211.aClass247_4 != null) {
			Static211.aClass247_4.method5162();
			Static211.aClass247_4 = null;
		}
		if (Static98.aClass111_1 != null) {
			Static98.aClass111_1.method3571(Static95.aCanvas3);
		}
		Static98.aClass111_1 = null;
		Static409.method5135();
		Static90.aClass120_1.method2647();
		Static292.aClass36_2.method598();
		if (Static39.aClass198_1 != null) {
			Static39.aClass198_1.method4090();
			Static39.aClass198_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method721() {
		if (Static206.anInt3642 == 13) {
			return;
		}
		@Pc(21) long local21 = Static143.method2213() / 1000000L - Static170.aLong146;
		Static170.aLong146 = Static143.method2213() / 1000000L;
		@Pc(33) boolean local33 = Static52.method719();
		if (local33 && Static226.aBoolean244 && Static99.aClass116_1 != null) {
			Static99.aClass116_1.method5583();
		}
		if (Static56.method757(Static206.anInt3642)) {
			if (Static421.aLong210 != 0L && Static421.aLong210 < Static158.method2342()) {
				Static335.method4379(Static120.method1994(), Static130.aClass153_Sub1_1.anInt5239, false, Static130.aClass153_Sub1_1.anInt5241);
			} else if (!Static269.aClass51_9.method5305() && Static141.aBoolean166) {
				Static357.method4567();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static145.aFrame4 == null) {
			@Pc(83) Container local83;
			if (Static452.aFrame5 == null) {
				local83 = Static230.aClass61_4.anApplet1;
			} else {
				local83 = Static452.aFrame5;
			}
			local92 = local83.getSize().width;
			local96 = local83.getSize().height;
			if (Static452.aFrame5 == local83) {
				@Pc(102) Insets local102 = Static452.aFrame5.getInsets();
				local92 -= local102.left + local102.right;
				local96 -= local102.bottom + local102.top;
			}
			if (local92 != Static382.anInt6127 || Static439.anInt7322 != local96) {
				if (Static269.aClass51_9 == null || Static269.aClass51_9.method5342()) {
					Static326.method5718();
				} else {
					Static382.anInt6127 = local92;
					Static439.anInt7322 = local96;
				}
				Static421.aLong210 = Static158.method2342() + 500L;
			}
		}
		if (Static145.aFrame4 != null && !Static173.aBoolean186 && Static56.method757(Static206.anInt3642)) {
			Static335.method4379(Static130.aClass153_Sub1_1.anInt5233, -1, false, -1);
		}
		@Pc(168) boolean local168 = false;
		if (Static124.aBoolean135) {
			Static124.aBoolean135 = false;
			local168 = true;
		}
		if (local168) {
			Static108.method1875();
		}
		if (Static269.aClass51_9 != null && Static269.aClass51_9.method5305() || Static120.method1994() != 1) {
			Static193.method2788();
		}
		if (Static206.anInt3642 == 0) {
			Static138.method2150(Static86.aColorArray1[Static17.anInt265], Static102.anInt2084, local168, Static112.aString21, Static386.aColorArray3[Static17.anInt265], Static123.aColorArray2[Static17.anInt265]);
		} else if (Static206.anInt3642 == 1) {
			Static44.method596(Static123.aColorArray2[Static17.anInt265].getRGB(), Static86.aColorArray1[Static17.anInt265].getRGB(), Static305.aClass63_15, Static269.aClass51_9, Static386.aColorArray3[Static17.anInt265].getRGB(), local168 | Static269.aClass51_9.method5305());
		} else if (Static92.method1633(Static206.anInt3642)) {
			Static83.method5800();
		} else if (Static354.method4564(Static206.anInt3642)) {
			Static83.method5800();
		} else if (Static300.method4008(Static206.anInt3642)) {
			if (Static234.anInt4039 == 1) {
				if (Static427.anInt7149 < Static395.anInt6313) {
					Static427.anInt7149 = Static395.anInt6313;
				}
				local92 = (Static427.anInt7149 - Static395.anInt6313) * 50 / Static427.anInt7149;
				Static374.method4823(Static259.aClass63_7, Static10.aClass55_6.method1205(Static5.anInt20) + "<br>(" + local92 + "%)", true);
			} else if (Static234.anInt4039 == 2) {
				if (Static214.anInt2504 > Static38.anInt672) {
					Static38.anInt672 = Static214.anInt2504;
				}
				local92 = (Static38.anInt672 - Static214.anInt2504) * 50 / Static38.anInt672 + 50;
				Static374.method4823(Static259.aClass63_7, Static10.aClass55_6.method1205(Static5.anInt20) + "<br>(" + local92 + "%)", true);
			} else {
				Static374.method4823(Static259.aClass63_7, Static10.aClass55_6.method1205(Static5.anInt20), true);
			}
		} else if (Static206.anInt3642 == 9) {
			Static166.method2400(local21);
		} else if (Static206.anInt3642 == 12) {
			Static374.method4823(Static259.aClass63_7, Static292.aClass55_106.method1205(Static5.anInt20) + "<br>" + Static122.aClass55_54.method1205(Static5.anInt20), true);
		}
		if (Static288.anInt4801 == 3) {
			for (local92 = 0; local92 < Static57.anInt967; local92++) {
				@Pc(402) Rectangle local402 = Class7_Sub4_Sub2_Sub1.aRectangleArray1[local92];
				if (Static271.aBooleanArray26[local92]) {
					Static269.aClass51_9.method5286(local402.width, -1996553985, local402.x, local402.height, local402.y);
				} else if (Static308.aBooleanArray28[local92]) {
					Static269.aClass51_9.method5286(local402.width, -1996554240, local402.x, local402.height, local402.y);
				}
			}
		}
		if (Static168.method2454()) {
			Static398.method5050(Static269.aClass51_9);
		}
		if (Static56.method757(Static206.anInt3642) && Static288.anInt4801 == 0 && Static120.method1994() == 1 && !local168 && Static85.aString8.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static57.anInt967; local96++) {
				if (Static308.aBooleanArray28[local96]) {
					Static308.aBooleanArray28[local96] = false;
					Static240.aRectangleArray2[local92++] = Class7_Sub4_Sub2_Sub1.aRectangleArray1[local96];
				}
			}
			Static269.aClass51_9.method5343(Static240.aRectangleArray2, local92);
		} else if (Static206.anInt3642 != 0) {
			Static269.aClass51_9.method5353();
			for (local92 = 0; local92 < Static57.anInt967; local92++) {
				Static308.aBooleanArray28[local92] = false;
			}
		}
		if (Static130.aClass153_Sub1_1.anInt5230 == 0) {
			Static214.method2089(15L);
		} else if (Static130.aClass153_Sub1_1.anInt5230 == 1) {
			Static214.method2089(10L);
		} else if (Static130.aClass153_Sub1_1.anInt5230 == 2) {
			Static214.method2089(5L);
		} else if (Static130.aClass153_Sub1_1.anInt5230 == 3) {
			Static214.method2089(2L);
		}
		if (Static425.aBoolean470) {
			Static237.method3233();
		}
		if (Static130.aClass153_Sub1_1.aBoolean339 && Static206.anInt3642 == 2 && Static183.anInt3293 != -1) {
			Static130.aClass153_Sub1_1.aBoolean339 = false;
			Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;")
	@Override
	protected String method713() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static359.anInt5713 + "," + Static314.anInt5181 + "," + Static333.anInt3375 + "," + Static102.anInt2086 + "|";
			if (Static104.aClass26_Sub2_Sub4_Sub2_2 != null) {
				local5 = local5 + "2)" + Static268.anInt4539 + "," + (Static359.anInt5713 + Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0]) + "," + (Static314.anInt5181 + Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0]) + "|";
			}
			local5 = local5 + "3)" + Static377.anInt6113 + "|4)" + Static130.aClass153_Sub1_1.anInt5244 + "|5)" + Static120.method1994() + "|6)" + Static251.anInt4258 + "," + Static286.anInt4051 + "|";
			local5 = local5 + "7)" + Static130.aClass153_Sub1_1.method4218(Static377.anInt6113) + "|";
			local5 = local5 + "8)" + Static130.aClass153_Sub1_1.method4217(Static377.anInt6113) + "|";
			local5 = local5 + "9)" + Static130.aClass153_Sub1_1.aBoolean341 + "|";
			local5 = local5 + "10)" + Static130.aClass153_Sub1_1.aBoolean338 + "|";
			local5 = local5 + "11)" + Static130.aClass153_Sub1_1.aBoolean352 + "|";
			local5 = local5 + "12)" + Static130.aClass153_Sub1_1.method4229(Static377.anInt6113) + "|";
			local5 = local5 + "13)" + Static268.anInt4537 + "|";
			local5 = local5 + "14)" + Static206.anInt3642;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(223) Throwable local223) {
			}
			local5 = local5 + "]";
		} catch (@Pc(234) Throwable local234) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method703() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static326.method5718();
		Static292.aClass36_2 = new Class36(Static230.aClass61_4);
		Static90.aClass120_1 = new Class120();
		if (Static313.aClass136_7 != Static167.aClass136_5) {
			Static423.aByteArrayArray23 = new byte[50][];
		}
		Static130.aClass153_Sub1_1 = new Class153_Sub1(Static230.aClass61_4);
		if (Static167.aClass136_5 == Static313.aClass136_7) {
			Static393.aClass124_6.aString37 = this.getCodeBase().getHost();
		} else if (Static73.method1202(Static313.aClass136_7)) {
			Static393.aClass124_6.aString37 = this.getCodeBase().getHost();
			Static393.aClass124_6.anInt3455 = Static393.aClass124_6.anInt3453 + 40000;
			Static257.aClass124_4.anInt3455 = Static257.aClass124_4.anInt3453 + 40000;
			Static26.aClass124_1.anInt3455 = Static26.aClass124_1.anInt3453 + 40000;
			Static393.aClass124_6.anInt3454 = Static393.aClass124_6.anInt3453 + 50000;
			Static257.aClass124_4.anInt3454 = Static257.aClass124_4.anInt3453 + 50000;
			Static26.aClass124_1.anInt3454 = Static26.aClass124_1.anInt3453 + 50000;
		} else if (Static50.aClass136_1 == Static313.aClass136_7) {
			Static393.aClass124_6.aString37 = "127.0.0.1";
			Static257.aClass124_4.aString37 = "127.0.0.1";
			Static393.aClass124_6.anInt3455 = Static393.aClass124_6.anInt3453 + 40000;
			Static26.aClass124_1.aString37 = "127.0.0.1";
			Static257.aClass124_4.anInt3455 = Static257.aClass124_4.anInt3453 + 40000;
			Static393.aClass124_6.anInt3454 = Static393.aClass124_6.anInt3453 + 50000;
			Static26.aClass124_1.anInt3455 = Static26.aClass124_1.anInt3453 + 40000;
			Static257.aClass124_4.anInt3454 = Static257.aClass124_4.anInt3453 + 50000;
			Static26.aClass124_1.anInt3454 = Static26.aClass124_1.anInt3453 + 50000;
		}
		if (Static191.aClass137_3 == Static55.aClass137_1) {
			Static60.anInt1104 = 0;
			Static243.aBoolean254 = true;
			Static45.aShortArray9 = Static117.aShortArray36;
			Static291.aShortArrayArray3 = Static420.aShortArrayArray8;
			Static361.aShortArray98 = Static252.aShortArray66;
			Static407.aShortArrayArray7 = Static91.aShortArrayArray1;
			Static362.anInt5746 = 16777215;
		} else {
			Static407.aShortArrayArray7 = Static337.aShortArrayArray5;
			Static361.aShortArray98 = Static185.aShortArray65;
			Static45.aShortArray9 = Static216.aShortArray22;
			Static291.aShortArrayArray3 = Static308.aShortArrayArray4;
		}
		if (Static419.aClass137_4 == Static191.aClass137_3) {
			Static258.aBoolean277 = false;
		}
		Static180.aShortArray63 = Static413.aShortArray114 = Static420.aShortArray115 = Static59.aShortArray20 = new short[256];
		Static393.aClass124_5 = Static393.aClass124_6;
		Static310.aClass130_1 = Static410.method5163(Static95.aCanvas3);
		Static154.aClass50_1 = Static398.method5052(Static95.aCanvas3);
		Static98.aClass111_1 = Static403.method3326();
		if (Static98.aClass111_1 != null) {
			Static98.aClass111_1.method3574(Static95.aCanvas3);
		}
		Static365.anInt5847 = Static85.anInt1679;
		try {
			if (Static230.aClass61_4.aClass266_4 != null) {
				Static215.aClass6_2 = new Class6(Static230.aClass61_4.aClass266_4, 5200, 0);
				for (@Pc(223) int local223 = 0; local223 < 30; local223++) {
					Static287.aClass6Array2[local223] = new Class6(Static230.aClass61_4.aClass266Array1[local223], 6000, 0);
				}
				Static91.aClass6_1 = new Class6(Static230.aClass61_4.aClass266_3, 6000, 0);
				Static249.aClass250_1 = new Class250(255, Static215.aClass6_2, Static91.aClass6_1, 500000);
				Static257.aClass6_3 = new Class6(Static230.aClass61_4.aClass266_2, 24, 0);
				Static230.aClass61_4.aClass266_3 = null;
				Static230.aClass61_4.aClass266Array1 = null;
				Static230.aClass61_4.aClass266_4 = null;
				Static230.aClass61_4.aClass266_2 = null;
			}
		} catch (@Pc(281) IOException local281) {
			Static249.aClass250_1 = null;
			Static257.aClass6_3 = null;
			Static215.aClass6_2 = null;
			Static91.aClass6_1 = null;
		}
		if (Static313.aClass136_7 != Static167.aClass136_5) {
			Static416.aBoolean433 = true;
		}
		if (Static419.aClass137_4 == Static191.aClass137_3) {
			Static111.aString20 = Static124.aClass55_55.method1205(Static5.anInt20);
		} else if (Static191.aClass137_3 == Static55.aClass137_1) {
			Static111.aString20 = Static363.aClass55_122.method1205(Static5.anInt20);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method709() {
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method726() {
		if (Static196.anInt3461 < Static90.aClass120_1.anInt3283) {
			Static393.aClass124_5.aBoolean208 = !Static393.aClass124_5.aBoolean208;
			Static43.anInt696 = (Static90.aClass120_1.anInt3283 - 1) * 50 * 5;
			if (Static43.anInt696 > 3000) {
				Static43.anInt696 = 3000;
			}
			if (Static90.aClass120_1.anInt3283 >= 2 && Static90.aClass120_1.anInt3284 == 6) {
				this.method711("js5connect_outofdate");
				Static206.anInt3642 = 13;
				return;
			}
			if (Static90.aClass120_1.anInt3283 >= 4 && Static90.aClass120_1.anInt3284 == -1) {
				this.method711("js5crc");
				Static206.anInt3642 = 13;
				return;
			}
			if (Static90.aClass120_1.anInt3283 >= 4 && Static168.method2451(Static206.anInt3642)) {
				if (Static90.aClass120_1.anInt3284 == 7 || Static90.aClass120_1.anInt3284 == 9) {
					this.method711("js5connect_full");
				} else if (Static90.aClass120_1.anInt3284 <= 0) {
					this.method711("js5io");
				} else {
					this.method711("js5connect");
				}
				Static206.anInt3642 = 13;
				return;
			}
		}
		Static196.anInt3461 = Static90.aClass120_1.anInt3283;
		if (Static43.anInt696 > 0) {
			Static43.anInt696--;
			return;
		}
		try {
			if (Static171.anInt3074 == 0) {
				Static367.aClass236_3 = Static230.aClass61_4.method1463(Static393.aClass124_5.aString37, Static393.aClass124_5.method2807());
				Static171.anInt3074++;
			}
			if (Static171.anInt3074 == 1) {
				if (Static367.aClass236_3.anInt6178 == 2) {
					this.method730(1000);
					return;
				}
				if (Static367.aClass236_3.anInt6178 == 1) {
					Static171.anInt3074++;
				}
			}
			if (Static171.anInt3074 == 2) {
				Static444.aClass247_5 = new Class247((Socket) Static367.aClass236_3.anObject8, Static230.aClass61_4);
				@Pc(183) Class7_Sub14 local183 = new Class7_Sub14(5);
				local183.method3970(Class22_Sub7.aClass188_2.anInt5048);
				local183.method3933(595);
				Static444.aClass247_5.method5151(5, local183.aByteArray75);
				Static171.anInt3074++;
				Static189.aLong169 = Static158.method2342();
			}
			if (Static171.anInt3074 == 3) {
				if (Static168.method2451(Static206.anInt3642) || Static444.aClass247_5.method5161() > 0) {
					@Pc(232) int local232 = Static444.aClass247_5.method5155();
					if (local232 != 0) {
						this.method730(local232);
						return;
					}
					Static171.anInt3074++;
				} else if (Static158.method2342() - Static189.aLong169 > 30000L) {
					this.method730(1001);
					return;
				}
			}
			if (Static171.anInt3074 == 4) {
				@Pc(281) boolean local281 = Static206.anInt3642 == 1 || Static411.method5164(Static206.anInt3642) || Static459.method5312(Static206.anInt3642);
				Static90.aClass120_1.method2655(!local281, Static444.aClass247_5);
				Static367.aClass236_3 = null;
				Static444.aClass247_5 = null;
				Static171.anInt3074 = 0;
			}
		} catch (@Pc(298) IOException local298) {
			this.method730(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method729() {
		@Pc(36) int local36;
		if (Static206.anInt3642 == 6 && Static64.anInt1229 == 0) {
			if (Static37.anInt654 > 1) {
				Static37.anInt654--;
				Static302.anInt5112 = Static90.anInt1865;
			}
			if (Static59.anInt1060 > 0) {
				Static59.anInt1060--;
			}
			if (!Static331.aBoolean372) {
				Static27.method307();
			}
			for (local36 = 0; local36 < 100 && Static94.method1665(); local36++) {
			}
		}
		Static436.anInt7296++;
		Static299.method3998(-1, null, -1);
		Static79.method1388(-1, -1, null);
		Static391.method4976();
		Static90.anInt1865++;
		for (local36 = 0; local36 < 32768; local36++) {
			@Pc(75) Class26_Sub2_Sub4_Sub1 local75 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local36];
			if (local75 != null) {
				@Pc(81) byte local81 = local75.aClass249_1.aByte87;
				if ((local81 & 0x1) != 0) {
					@Pc(89) int local89 = local75.method5512();
					@Pc(110) int local110;
					if ((local81 & 0x2) != 0 && local75.anInt7117 == 0 && Math.random() * 1000.0D < 10.0D) {
						local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(118) int local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local110 != 0 || local118 != 0) {
							@Pc(133) int local133 = local75.anIntArray603[0] + local110;
							@Pc(141) int local141 = local75.anIntArray604[0] + local118;
							if (local133 < 0) {
								local133 = 0;
							} else if (local133 > Static333.anInt3375 - local89 - 1) {
								local133 = Static333.anInt3375 - local89 - 1;
							}
							if (local141 < 0) {
								local141 = 0;
							} else if (Static102.anInt2086 - local89 - 1 < local141) {
								local141 = Static102.anInt2086 - local89 - 1;
							}
							@Pc(212) int local212 = Static46.method607(local89, local75.anIntArray603[0], Static100.anIntArray134, 0, local141, Static230.anIntArray348, -1, true, local89, local89, Static179.aClass70Array3[local75.aByte102], local75.anIntArray604[0], 0, local133);
							if (local212 > 0) {
								if (local212 > 9) {
									local212 = 9;
								}
								for (@Pc(224) int local224 = 0; local224 < local212; local224++) {
									local75.anIntArray603[local224] = Static230.anIntArray348[local212 - local224 - 1];
									local75.anIntArray604[local224] = Static100.anIntArray134[local212 - local224 - 1];
									local75.aByteArray94[local224] = 1;
								}
								local75.anInt7117 = local212;
							}
						}
					}
					Static63.method923(local75, true);
					local110 = Static402.method5073(local75);
					Static414.method5213(local110, Static19.anInt274, local75, Static9.anInt59);
					Static324.method4290(local75);
				}
			}
		}
		if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
			if (Static9.anInt60 == 2) {
				Static329.method4323();
			} else {
				Static376.method4835();
			}
			if (Static46.anInt737 >> 7 < 14 || Static333.anInt3375 - 14 <= Static46.anInt737 >> 7 || Static181.anInt3254 >> 7 < 14 || Static181.anInt3254 >> 7 >= Static102.anInt2086 - 14) {
				Static279.method5724();
			}
		}
		while (true) {
			@Pc(340) Class7_Sub18 local340;
			@Pc(345) Class95 local345;
			@Pc(356) Class95 local356;
			do {
				local340 = (Class7_Sub18) Static459.aClass85_38.method2004();
				if (local340 == null) {
					while (true) {
						do {
							local340 = (Class7_Sub18) Static205.aClass85_22.method2004();
							if (local340 == null) {
								while (true) {
									do {
										local340 = (Class7_Sub18) Static451.aClass85_48.method2004();
										if (local340 == null) {
											if (Static191.aClass95_9 != null) {
												Static40.method2439();
											}
											if (Static274.anInt4617 % 1500 == 0) {
												Static402.method5074();
											}
											if (Static206.anInt3642 == 6 && Static64.anInt1229 == 0) {
												Static428.method5535();
											}
											Static274.method3665();
											if (Static351.aBoolean381 && Static44.aLong33 < Static158.method2342() - 60000L) {
												Static157.method2340();
											}
											for (@Pc(520) Class28_Sub1_Sub2 local520 = (Class28_Sub1_Sub2) Static45.aClass169_2.method3598(); local520 != null; local520 = (Class28_Sub1_Sub2) Static45.aClass169_2.method3597()) {
												if ((long) local520.anInt7352 < Static158.method2342() / 1000L - 5L) {
													if (local520.aShort101 > 0) {
														Static336.method4383(5, 0, "", local520.aString71 + Static128.aClass55_58.method1205(Static5.anInt20), "");
													}
													if (local520.aShort101 == 0) {
														Static336.method4383(5, 0, "", local520.aString71 + Static355.aClass55_78.method1205(Static5.anInt20), "");
													}
													local520.method5642();
												}
											}
											if (Static206.anInt3642 == 6 && Static64.anInt1229 == 0) {
												if (Static211.aClass247_4 == null) {
													Static362.method4646(false);
													return;
												}
												Static48.anInt748++;
												if (Static48.anInt748 > 50) {
													Static81.method1414(Static407.aClass2_101);
												}
												try {
													if (Static211.aClass247_4 != null && Static255.aClass7_Sub14_Sub1_2.anInt4989 > 0) {
														Static209.anInt3682 += Static255.aClass7_Sub14_Sub1_2.anInt4989;
														Static211.aClass247_4.method5151(Static255.aClass7_Sub14_Sub1_2.anInt4989, Static255.aClass7_Sub14_Sub1_2.aByteArray75);
														Static48.anInt748 = 0;
														Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
														return;
													}
												} catch (@Pc(660) IOException local660) {
													Static362.method4646(false);
													return;
												}
											}
											return;
										}
										local345 = local340.aClass95_5;
										if (local345.anInt2602 < 0) {
											break;
										}
										local356 = Static313.method4088(local345.anInt2646);
									} while (local356 == null || local356.aClass95Array1 == null || local356.aClass95Array1.length <= local345.anInt2602 || local356.aClass95Array1[local345.anInt2602] != local345);
									Static159.method2352(local340);
								}
							}
							local345 = local340.aClass95_5;
							if (local345.anInt2602 < 0) {
								break;
							}
							local356 = Static313.method4088(local345.anInt2646);
						} while (local356 == null || local356.aClass95Array1 == null || local345.anInt2602 >= local356.aClass95Array1.length || local345 != local356.aClass95Array1[local345.anInt2602]);
						Static159.method2352(local340);
					}
				}
				local345 = local340.aClass95_5;
				if (local345.anInt2602 < 0) {
					break;
				}
				local356 = Static313.method4088(local345.anInt2646);
			} while (local356 == null || local356.aClass95Array1 == null || local345.anInt2602 >= local356.aClass95Array1.length || local356.aClass95Array1[local345.anInt2602] != local345);
			Static159.method2352(local340);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method730(@OriginalArg(1) int arg0) {
		Static367.aClass236_3 = null;
		Static171.anInt3074 = 0;
		Static90.aClass120_1.anInt3284 = arg0;
		Static90.aClass120_1.anInt3283++;
		Static444.aClass247_5 = null;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method734() {
		if (Static206.anInt3642 == 13) {
			return;
		}
		Static274.anInt4617++;
		if (Static274.anInt4617 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static312.anInt5169 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static254.aRandom1.setSeed((long) Static312.anInt5169);
		}
		if (Static274.anInt4617 % 50 == 0) {
			Static99.anInt2004 = Static209.anInt3682;
			Static209.anInt3682 = 0;
			Static139.anInt2674 = Static432.anInt7272;
			Static432.anInt7272 = 0;
		}
		this.method716();
		if (Static396.aClass104_1 != null) {
			Static396.aClass104_1.method2307();
		}
		Static201.method2882();
		Static310.aClass130_1.method5064();
		Static154.aClass50_1.method1869();
		if (Static98.aClass111_1 != null) {
			@Pc(89) int local89 = Static98.aClass111_1.method3572();
			Static217.anInt3861 = local89;
		}
		if (Static269.aClass51_9 != null) {
			Static269.aClass51_9.method5299((int) Static158.method2342());
		}
		Static228.method3144();
		Static425.anInt7000 = 0;
		for (@Pc(106) Class16 local106 = Static310.aClass130_1.method5067(); local106 != null && Static425.anInt7000 < 128; local106 = Static310.aClass130_1.method5067()) {
			if (local106.method5100() != 1) {
				@Pc(119) char local119 = local106.method5102();
				if (!Static87.method1510() || local119 != '`' && local119 != '§') {
					Static42.aClass16Array1[Static425.anInt7000] = local106;
					Static425.anInt7000++;
				} else if (Static168.method2454()) {
					Static32.method420();
				} else {
					Static275.method3672();
				}
			}
		}
		for (@Pc(164) Class7_Sub12 local164 = Static154.aClass50_1.method1867(); local164 != null; local164 = Static154.aClass50_1.method1867()) {
			@Pc(170) int local170 = local164.method940();
			if (local170 == -1) {
				Static57.aClass85_5.method2011(local164);
			} else if (Static391.method4975(local170)) {
				Static204.aClass85_37.method2011(local164);
			}
			if (Static204.aClass85_37.method2013() > 10) {
				Static204.aClass85_37.method2004();
			}
		}
		if (Static168.method2454()) {
			Static45.method603();
		}
		if (Static206.anInt3642 == 0) {
			this.method736();
			Static309.method4075();
		} else if (Static206.anInt3642 == 1) {
			this.method736();
			Static309.method4075();
		} else if (Static300.method4008(Static206.anInt3642)) {
			Static209.method2999();
		}
		if (Static411.method5164(Static206.anInt3642) && !Static300.method4008(Static206.anInt3642)) {
			this.method729();
			Static122.method2003();
			Static287.method5210();
		} else if (Static459.method5312(Static206.anInt3642) && !Static300.method4008(Static206.anInt3642)) {
			this.method729();
			Static287.method5210();
		} else if (Static206.anInt3642 == 11) {
			Static287.method5210();
		} else if (Static252.method3357(Static206.anInt3642) && !Static300.method4008(Static206.anInt3642)) {
			Static16.method5104();
		} else if (Static206.anInt3642 == 12) {
			Static287.method5210();
			if (Static445.anInt1109 != -3 && Static445.anInt1109 != 2 && Static445.anInt1109 != 15) {
				Static362.method4646(false);
			}
		}
		Static350.method4523(Static269.aClass51_9);
		Static204.aClass85_37.method2004();
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method736() {
		@Pc(10) int local10;
		if (!Static130.aClass153_Sub1_1.aBoolean339) {
			for (local10 = 0; local10 < Static425.anInt7000; local10++) {
				if (Static42.aClass16Array1[local10].method5102() == 's' || Static42.aClass16Array1[local10].method5102() == 'S') {
					Static130.aClass153_Sub1_1.aBoolean339 = true;
					break;
				}
			}
		}
		@Pc(50) int local50;
		if (Static180.anInt3242 == 0) {
			@Pc(41) Runtime local41 = Runtime.getRuntime();
			local50 = (int) ((local41.totalMemory() - local41.freeMemory()) / 1024L);
			@Pc(53) long local53 = Static158.method2342();
			if (Static398.aLong203 == 0L) {
				Static398.aLong203 = local53;
			}
			if (local50 > 16384 && local53 - Static398.aLong203 < 5000L) {
				if (local53 - Static19.aLong18 > 1000L) {
					System.gc();
					Static19.aLong18 = local53;
				}
				Static112.aString21 = Static326.aClass55_149.method1205(Static5.anInt20);
				Static102.anInt2084 = 5;
			} else {
				Static112.aString21 = Static99.aClass55_44.method1205(Static5.anInt20);
				Static180.anInt3242 = 10;
				Static102.anInt2084 = 5;
			}
		} else if (Static180.anInt3242 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static179.aClass70Array3[local10] = Static183.method2670(Static102.anInt2086, Static333.anInt3375);
			}
			Static112.aString21 = Static205.aClass55_79.method1205(Static5.anInt20);
			Static180.anInt3242 = 20;
			Static102.anInt2084 = 10;
		} else if (Static180.anInt3242 == 20) {
			if (Static396.aClass104_1 == null) {
				Static396.aClass104_1 = new Class104(Static90.aClass120_1, Static292.aClass36_2);
			}
			if (Static396.aClass104_1.method2309()) {
				Static264.aClass178_80 = Static336.method4384(0, false, true);
				Static432.aClass178_136 = Static336.method4384(1, false, true);
				Static413.aClass178_124 = Static336.method4384(2, false, true);
				Static415.aClass178_127 = Static336.method4384(3, false, true);
				Static32.aClass178_12 = Static336.method4384(4, false, true);
				Static402.aClass178_123 = Static336.method4384(5, true, true);
				Static122.aClass178_39 = Static336.method4384(6, true, false);
				Static80.aClass178_22 = Static336.method4384(7, false, true);
				Static25.aClass178_9 = Static336.method4384(8, false, true);
				Static15.aClass178_4 = Static336.method4384(9, false, true);
				Static170.aClass178_83 = Static336.method4384(10, false, true);
				Static236.aClass178_67 = Static336.method4384(11, false, true);
				Static78.aClass178_20 = Static336.method4384(12, false, true);
				Static249.aClass178_74 = Static336.method4384(13, false, true);
				Static282.aClass178_86 = Static336.method4384(14, false, false);
				Static271.aClass178_82 = Static336.method4384(15, false, true);
				Static4.aClass178_137 = Static336.method4384(16, false, true);
				Static398.aClass178_122 = Static336.method4384(17, false, true);
				Static106.aClass178_32 = Static336.method4384(18, false, true);
				Static20.aClass178_34 = Static336.method4384(19, false, true);
				Static388.aClass178_120 = Static336.method4384(20, false, true);
				Static419.aClass178_129 = Static336.method4384(21, false, true);
				Static331.aClass178_102 = Static336.method4384(22, false, true);
				Static224.aClass178_108 = Static336.method4384(23, true, true);
				Static206.aClass178_58 = Static336.method4384(24, false, true);
				Static197.aClass178_54 = Static336.method4384(25, false, true);
				Static81.aClass178_23 = Static336.method4384(26, true, true);
				Static237.aClass178_68 = Static336.method4384(27, false, true);
				Static70.aClass178_19 = Static336.method4384(28, true, true);
				Static20.aClass178_33 = Static336.method4384(29, false, true);
				Static112.aString21 = Static88.aClass55_40.method1205(Static5.anInt20);
				Static180.anInt3242 = 30;
				Static102.anInt2084 = 15;
			} else {
				Static112.aString21 = Static31.aClass55_12.method1205(Static5.anInt20);
				Static102.anInt2084 = 12;
			}
		} else if (Static180.anInt3242 == 30) {
			local10 = 0;
			for (local50 = 0; local50 < 30; local50++) {
				local10 += Static250.aClass4_Sub1Array2[local50].method5786() * Static325.anIntArray486[local50] / 100;
			}
			if (local10 == 100) {
				Static112.aString21 = Static420.aClass55_136.method1205(Static5.anInt20);
				Static102.anInt2084 = 20;
				Static320.method4224(Static25.aClass178_9);
				Static420.method5269(Static25.aClass178_9);
				Static180.anInt3242 = 40;
			} else {
				if (local10 != 0) {
					Static112.aString21 = Static397.aClass55_131.method1205(Static5.anInt20) + local10 + "%";
				}
				Static102.anInt2084 = 20;
			}
		} else if (Static180.anInt3242 == 40) {
			if (Static70.aClass178_19.method3841()) {
				this.method737(Static70.aClass178_19.method3823(1));
				Static112.aString21 = Static376.aClass55_127.method1205(Static5.anInt20);
				Static102.anInt2084 = 25;
				Static180.anInt3242 = 50;
			} else {
				Static112.aString21 = Static262.aClass55_148.method1205(Static5.anInt20) + Static70.aClass178_19.method3840() + "%";
				Static102.anInt2084 = 25;
			}
		} else if (Static180.anInt3242 == 50) {
			Static98.method1712();
			Static112.aString21 = Static9.aClass55_5.method1205(Static5.anInt20);
			Static102.anInt2084 = 30;
			Static180.anInt3242 = 60;
		} else if (Static180.anInt3242 == 60) {
			local10 = Static388.method4967(Static25.aClass178_9, Static249.aClass178_74);
			local50 = Static49.method622();
			if (local50 > local10) {
				Static112.aString21 = Static84.aClass55_100.method1205(Static5.anInt20) + local10 * 100 / local50 + "%";
				Static102.anInt2084 = 35;
			} else {
				Static112.aString21 = Static325.aClass55_115.method1205(Static5.anInt20);
				Static102.anInt2084 = 35;
				Static180.anInt3242 = 70;
			}
		} else if (Static180.anInt3242 == 70) {
			local10 = Static225.method3917(Static25.aClass178_9);
			local50 = Static170.method3677();
			if (local50 > local10) {
				Static112.aString21 = Static334.aClass55_118.method1205(Static5.anInt20) + local10 * 100 / local50 + "%";
				Static102.anInt2084 = 40;
			} else {
				Static112.aString21 = Static157.aClass55_64.method1205(Static5.anInt20);
				Static102.anInt2084 = 40;
				Static180.anInt3242 = 80;
			}
		} else if (Static180.anInt3242 == 80) {
			if (Static81.aClass178_23.method3841()) {
				Static351.anInterface4_5 = new Class141(Static81.aClass178_23, Static15.aClass178_4, Static25.aClass178_9);
				Static112.aString21 = Static195.aClass55_74.method1205(Static5.anInt20);
				Static102.anInt2084 = 45;
				Static180.anInt3242 = 90;
			} else {
				Static112.aString21 = Static216.aClass55_29.method1205(Static5.anInt20) + Static81.aClass178_23.method3840() + "%";
				Static102.anInt2084 = 45;
			}
		} else if (Static180.anInt3242 == 90) {
			Static112.aString21 = Static314.aClass55_110.method1205(Static5.anInt20);
			Static180.anInt3242 = 95;
			Static102.anInt2084 = 50;
		} else if (Static180.anInt3242 == 95) {
			if (Static130.aClass153_Sub1_1.aBoolean339) {
				Static130.aClass153_Sub1_1.anInt5244 = 0;
				Static130.aClass153_Sub1_1.anInt5234 = 0;
				Static130.aClass153_Sub1_1.anInt5245 = 0;
				Static130.aClass153_Sub1_1.anInt5242 = 0;
				Static130.aClass153_Sub1_1.anInt5233 = 1;
			}
			Static130.aClass153_Sub1_1.aBoolean339 = true;
			Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
			Static284.method704(false, Static130.aClass153_Sub1_1.anInt5245);
			Static112.aString21 = Static459.aClass55_137.method1205(Static5.anInt20);
			Static102.anInt2084 = 55;
			Static180.anInt3242 = 100;
		} else if (Static180.anInt3242 == 100) {
			Static292.method3871(Static269.aClass51_9, Static25.aClass178_9, Static249.aClass178_74);
			Static112.aString21 = Static322.aClass55_113.method1205(Static5.anInt20);
			Static102.anInt2084 = 60;
			Static138.method2151(1);
			Static180.anInt3242 = 110;
		} else if (Static180.anInt3242 == 110) {
			Static413.aClass178_124.method3841();
			local10 = Static413.aClass178_124.method3840();
			Static4.aClass178_137.method3841();
			local10 += Static4.aClass178_137.method3840();
			Static398.aClass178_122.method3841();
			local10 += Static398.aClass178_122.method3840();
			Static106.aClass178_32.method3841();
			local10 += Static106.aClass178_32.method3840();
			Static20.aClass178_34.method3841();
			local10 += Static20.aClass178_34.method3840();
			Static388.aClass178_120.method3841();
			local10 += Static388.aClass178_120.method3840();
			Static419.aClass178_129.method3841();
			local10 += Static419.aClass178_129.method3840();
			Static331.aClass178_102.method3841();
			local10 += Static331.aClass178_102.method3840();
			Static206.aClass178_58.method3841();
			local10 += Static206.aClass178_58.method3840();
			Static197.aClass178_54.method3841();
			local10 += Static197.aClass178_54.method3840();
			Static237.aClass178_68.method3841();
			local10 += Static237.aClass178_68.method3840();
			Static20.aClass178_33.method3841();
			local10 += Static20.aClass178_33.method3840();
			if (local10 < 1200) {
				Static112.aString21 = Static72.aClass55_35.method1205(Static5.anInt20) + local10 / 12 + "%";
				Static102.anInt2084 = 65;
			} else {
				Static443.aClass193_4 = new Class193(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static223.aClass154_1 = new Class154(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static23.aClass29_1 = new Class29(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124, Static25.aClass178_9);
				Static258.aClass208_1 = new Class208(Static191.aClass137_3, Static5.anInt20, Static398.aClass178_122);
				Static258.aClass155_5 = new Class155(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static76.aClass233_3 = new Class233(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static430.aClass162_2 = new Class162(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124, Static80.aClass178_22);
				Static395.aClass207_1 = new Class207(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static230.aClass152_1 = new Class152(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static411.aClass142_4 = new Class142(Static191.aClass137_3, Static5.anInt20, true, Static4.aClass178_137, Static80.aClass178_22);
				Static106.aClass62_3 = new Class62(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124, Static25.aClass178_9);
				Static351.aClass176_4 = new Class176(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124, Static25.aClass178_9);
				Static442.aClass98_1 = new Class98(Static191.aClass137_3, Static5.anInt20, true, Static106.aClass178_32, Static80.aClass178_22);
				Static259.aClass206_2 = new Class206(Static191.aClass137_3, Static5.anInt20, true, Static443.aClass193_4, Static20.aClass178_34, Static80.aClass178_22);
				Static138.aClass122_1 = new Class122(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static364.aClass151_2 = new Class151(Static191.aClass137_3, Static5.anInt20, Static388.aClass178_120, Static264.aClass178_80, Static432.aClass178_136);
				Static439.aClass255_1 = new Class255(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static411.aClass217_1 = new Class217(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static79.aClass231_1 = new Class231(Static191.aClass137_3, Static5.anInt20, Static419.aClass178_129, Static80.aClass178_22);
				Static109.aClass18_1 = new Class18(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static459.aClass170_4 = new Class170(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static253.aClass210_1 = new Class210(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static446.aClass53_1 = new Class53(Static191.aClass137_3, Static5.anInt20, Static331.aClass178_102);
				Static172.aClass123_1 = new Class123(Static191.aClass137_3, Static5.anInt20, Static413.aClass178_124);
				Static84.method3644(Static415.aClass178_127, Static80.aClass178_22, Static249.aClass178_74, Static25.aClass178_9);
				Static361.method4640(Static20.aClass178_33);
				Static62.aClass227_1 = new Class227(Static5.anInt20, Static206.aClass178_58, Static197.aClass178_54);
				Static209.aClass204_1 = new Class204(Static5.anInt20, Static206.aClass178_58, Static197.aClass178_54, new Class192());
				Static112.aString21 = Static285.aClass55_103.method1205(Static5.anInt20);
				Static102.anInt2084 = 65;
				Static23.method247();
				Static411.aClass142_4.method3150(!Static130.aClass153_Sub1_1.method4229(Static377.anInt6113));
				Static224.aClass239_7 = new Class239();
				Static281.method5553();
				Static326.method5716(Static237.aClass178_68);
				Static404.method5767(Static351.anInterface4_5, Static80.aClass178_22);
				Static180.anInt3242 = 120;
			}
		} else if (Static180.anInt3242 == 120) {
			local10 = Static269.method3625(Static25.aClass178_9);
			local50 = Static223.method3122();
			if (local10 < local50) {
				Static112.aString21 = Static310.aClass55_109.method1205(Static5.anInt20) + local10 * 100 / local50 + "%";
				Static102.anInt2084 = 70;
			} else {
				Static68.method1148(Static269.aClass51_9, Static25.aClass178_9);
				Static290.method3849(Static321.aClass11Array9);
				Static112.aString21 = Static69.aClass55_33.method1205(Static5.anInt20);
				Static180.anInt3242 = 130;
				Static102.anInt2084 = 70;
			}
		} else if (Static180.anInt3242 == 130) {
			if (Static170.aClass178_83.method3820("", "huffman")) {
				@Pc(1212) Class112 local1212 = new Class112(Static170.aClass178_83.method3826("", "huffman"));
				Static33.method460(local1212);
				Static112.aString21 = Static193.aClass55_73.method1205(Static5.anInt20);
				Static102.anInt2084 = 75;
				Static180.anInt3242 = 140;
			} else {
				Static112.aString21 = Static5.aClass55_4.method1205(Static5.anInt20) + "0%";
				Static102.anInt2084 = 75;
			}
		} else if (Static180.anInt3242 == 140) {
			if (Static415.aClass178_127.method3841()) {
				Static112.aString21 = Static116.aClass55_107.method1205(Static5.anInt20);
				Static180.anInt3242 = 150;
				Static102.anInt2084 = 80;
			} else {
				Static112.aString21 = Static4.aClass55_151.method1205(Static5.anInt20) + Static415.aClass178_127.method3840() + "%";
				Static102.anInt2084 = 80;
			}
		} else if (Static180.anInt3242 == 150) {
			if (Static78.aClass178_20.method3841()) {
				Static112.aString21 = Static102.aClass55_46.method1205(Static5.anInt20);
				Static102.anInt2084 = 82;
				Static180.anInt3242 = 160;
			} else {
				Static112.aString21 = Static21.aClass55_7.method1205(Static5.anInt20) + Static78.aClass178_20.method3840() + "%";
				Static102.anInt2084 = 82;
			}
		} else if (Static180.anInt3242 == 160) {
			if (Static249.aClass178_74.method3841()) {
				Static112.aString21 = Static364.aClass55_43.method1205(Static5.anInt20);
				Static180.anInt3242 = 170;
				Static102.anInt2084 = 85;
			} else {
				Static112.aString21 = Static364.aClass55_43.method1205(Static5.anInt20) + Static249.aClass178_74.method3840() + "%";
				Static102.anInt2084 = 85;
			}
		} else if (Static180.anInt3242 == 170) {
			if (Static224.aClass178_108.method3822("details")) {
				Static93.method3423(Static224.aClass178_108, Static258.aClass155_5, Static76.aClass233_3, Static411.aClass142_4, Static106.aClass62_3, Static351.aClass176_4, Static224.aClass239_7);
				Static112.aString21 = Static106.aClass55_49.method1205(Static5.anInt20);
				Static180.anInt3242 = 190;
				Static102.anInt2084 = 89;
			} else {
				Static112.aString21 = Static90.aClass55_41.method1205(Static5.anInt20) + Static224.aClass178_108.method3837("details") + "%";
				Static102.anInt2084 = 87;
			}
		} else if (Static180.anInt3242 == 190) {
			Static91.aStringArray13 = new String[Static459.aClass170_4.anInt4583];
			Static196.aBooleanArray18 = new boolean[Static253.aClass210_1.anInt5452];
			Static101.anIntArray136 = new int[Static253.aClass210_1.anInt5452];
			for (local10 = 0; local10 < Static253.aClass210_1.anInt5452; local10++) {
				if (Static253.aClass210_1.method4380(local10).anInt6254 == 0) {
					Static196.aBooleanArray18[local10] = true;
					Static369.anInt5897++;
				}
				Static101.anIntArray136[local10] = -1;
			}
			Static326.method5717();
			Static100.anInt2033 = Static415.aClass178_127.method3836("loginscreen");
			Static231.anInt6548 = Static415.aClass178_127.method3836("lobbyscreen");
			Static402.aClass178_123.method3815(false);
			Static122.aClass178_39.method3815(true);
			Static25.aClass178_9.method3815(true);
			Static249.aClass178_74.method3815(true);
			Static170.aClass178_83.method3815(true);
			Static415.aClass178_127.method3815(true);
			Static413.aClass178_124.anInt4835 = 2;
			Static425.aBoolean470 = true;
			Static398.aClass178_122.anInt4835 = 2;
			Static4.aClass178_137.anInt4835 = 2;
			Static106.aClass178_32.anInt4835 = 2;
			Static20.aClass178_34.anInt4835 = 2;
			Static388.aClass178_120.anInt4835 = 2;
			Static419.aClass178_129.anInt4835 = 2;
			Static335.method4379(Static130.aClass153_Sub1_1.anInt5233, -1, false, -1);
			Static112.aString21 = Static342.aClass55_119.method1205(Static5.anInt20);
			Static102.anInt2084 = 95;
			Static180.anInt3242 = 200;
		} else if (Static180.anInt3242 == 200) {
			Static138.method2151(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method737(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class7_Sub14 local10 = new Class7_Sub14(arg0);
		while (true) {
			@Pc(18) int local18;
			@Pc(43) int local43;
			@Pc(38) int local38;
			label45: do {
				while (true) {
					while (true) {
						local18 = local10.method3981();
						if (local18 == 0) {
							return;
						}
						if (local18 == 1) {
							@Pc(109) int[] local109 = Static353.anIntArray521 = new int[6];
							local109[0] = local10.method3943();
							local109[1] = local10.method3943();
							local109[2] = local10.method3943();
							local109[3] = local10.method3943();
							local109[4] = local10.method3943();
							local109[5] = local10.method3943();
						} else {
							if (local18 != 4) {
								continue label45;
							}
							local38 = local10.method3981();
							Static268.anIntArray414 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static268.anIntArray414[local43] = local10.method3943();
								if (Static268.anIntArray414[local43] == 65535) {
									Static268.anIntArray414[local43] = -1;
								}
							}
						}
					}
				}
			} while (local18 != 5);
			local38 = local10.method3981();
			Static186.anIntArray303 = new int[local38];
			for (local43 = 0; local43 < local38; local43++) {
				Static186.anIntArray303[local43] = local10.method3943();
				if (Static186.anIntArray303[local43] == 65535) {
					Static186.anIntArray303[local43] = -1;
				}
			}
		}
	}
}
