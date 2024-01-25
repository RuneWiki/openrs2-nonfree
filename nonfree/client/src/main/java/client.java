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
				Static284.method4956("Argument count");
			}
			Static307.aClass358_2 = new Class358();
			Static307.aClass358_2.anInt10266 = Integer.parseInt(arg0[0]);
			Static578.aClass358_5 = new Class358();
			Static578.aClass358_5.anInt10266 = Integer.parseInt(arg0[1]);
			Static439.aClass358_3 = new Class358();
			Static439.aClass358_3.anInt10266 = Integer.parseInt(arg0[2]);
			Static630.aClass212_18 = Static496.aClass212_17;
			if (arg0[3].equals("live")) {
				Static136.aClass12_3 = Static6.aClass12_2;
			} else if (arg0[3].equals("rc")) {
				Static136.aClass12_3 = Static3.aClass12_1;
			} else if (arg0[3].equals("wip")) {
				Static136.aClass12_3 = Static432.aClass12_4;
			} else {
				Static284.method4956("modewhat");
			}
			Static638.anInt10709 = Static237.method4303(arg0[4]);
			if (Static638.anInt10709 == -1) {
				if (arg0[4].equals("english")) {
					Static638.anInt10709 = 0;
				} else if (arg0[4].equals("german")) {
					Static638.anInt10709 = 1;
				} else {
					Static284.method4956("language");
				}
			}
			Static296.aBoolean473 = false;
			Static257.aBoolean439 = false;
			if (arg0[5].equals("game0")) {
				Static8.aClass290_1 = Static406.aClass290_34;
			} else if (arg0[5].equals("game1")) {
				Static8.aClass290_1 = Static25.aClass290_5;
			} else if (arg0[5].equals("game2")) {
				Static8.aClass290_1 = Static339.aClass290_32;
			} else if (arg0[5].equals("game3")) {
				Static8.aClass290_1 = Static552.aClass290_37;
			} else {
				Static284.method4956("game");
			}
			Static162.aString39 = "";
			Static143.aString27 = null;
			Static414.anInt7699 = 0;
			Static552.anInt9484 = 0;
			Static472.aBoolean671 = false;
			Static361.aLong189 = 0L;
			Static479.aBoolean677 = true;
			Static393.aBoolean579 = true;
			Static108.aString21 = null;
			Static48.aBoolean137 = false;
			Static234.anInt5227 = 0;
			Static87.anInt2632 = Static8.aClass290_1.anInt8594;
			@Pc(181) client local181 = new client();
			Static545.aClient1 = local181;
			local181.method2123(Static8.aClass290_1.aString86, Static136.aClass12_3.method500() + 32);
			Static500.aFrame9.setLocation(40, 40);
		} catch (@Pc(204) Exception local204) {
			Static358.method5809(local204, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method2134() {
		if (Static333.anInt6626 == 14) {
			return;
		}
		@Pc(16) long local16 = Static585.method8086() / 1000000L - Static145.aLong88;
		Static145.aLong88 = Static585.method8086() / 1000000L;
		@Pc(28) boolean local28 = Static262.method4631();
		if (local28 && Static342.aBoolean544 && Static282.aClass114_2 != null) {
			Static282.aClass114_2.method4222();
		}
		if (Static157.method3089(Static333.anInt6626)) {
			if (Static408.aLong202 != 0L && Static582.method8056() > Static408.aLong202) {
				Static210.method3780(Static326.method5447(), Static258.anInt5557, Static245.anInt5351, false);
			} else if (!Static467.aClass5_13.method6182() && Static274.aBoolean459) {
				Static490.method4315();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static224.aFrame5 == null) {
			@Pc(76) Container local76;
			if (Static500.aFrame9 != null) {
				local76 = Static500.aFrame9;
			} else if (Static635.anApplet2 == null) {
				local76 = Static560.anApplet_Sub1_1;
			} else {
				local76 = Static635.anApplet2;
			}
			local88 = local76.getSize().width;
			local92 = local76.getSize().height;
			if (Static500.aFrame9 == local76) {
				@Pc(98) Insets local98 = Static500.aFrame9.getInsets();
				local88 -= local98.left + local98.right;
				local92 -= local98.top + local98.bottom;
			}
			if (Static351.anInt6858 != local88 || Static59.anInt1894 != local92 || Static68.aBoolean183) {
				if (Static467.aClass5_13 == null || Static467.aClass5_13.method6163()) {
					Static266.method4777();
				} else {
					Static59.anInt1894 = local92;
					Static351.anInt6858 = local88;
				}
				Static408.aLong202 = Static582.method8056() + 500L;
				Static68.aBoolean183 = false;
			}
		}
		if (Static224.aFrame5 != null && !Static8.aBoolean55 && Static157.method3089(Static333.anInt6626)) {
			Static210.method3780(Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282(), -1, -1, false);
		}
		@Pc(172) boolean local172 = false;
		if (Static459.aBoolean659) {
			Static459.aBoolean659 = false;
			local172 = true;
		}
		if (local172) {
			Static465.method6954();
		}
		if (Static467.aClass5_13 != null && Static467.aClass5_13.method6182() || Static326.method5447() != 1) {
			Static486.method8547();
		}
		if (Static46.method1557(Static333.anInt6626)) {
			Static71.method2061(local172);
		} else if (Static354.method5748(Static333.anInt6626)) {
			Static86.method8585();
		} else if (Static319.method5325(Static333.anInt6626)) {
			Static86.method8585();
		} else if (Static365.method5880(Static333.anInt6626)) {
			if (Static249.anInt5410 == 1) {
				if (Static319.anInt6355 < Static276.anInt9806) {
					Static319.anInt6355 = Static276.anInt9806;
				}
				local88 = (Static319.anInt6355 - Static276.anInt9806) * 50 / Static319.anInt6355;
				Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, true, Static467.aClass5_13, Static536.aClass316_14.method7577(Static638.anInt10709) + "<br>(" + local88 + "%)");
			} else if (Static249.anInt5410 == 2) {
				if (Static254.anInt5479 > Static493.anInt8604) {
					Static493.anInt8604 = Static254.anInt5479;
				}
				local88 = (Static493.anInt8604 - Static254.anInt5479) * 50 / Static493.anInt8604 + 50;
				Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, true, Static467.aClass5_13, Static536.aClass316_14.method7577(Static638.anInt10709) + "<br>(" + local88 + "%)");
			} else {
				Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, true, Static467.aClass5_13, Static536.aClass316_14.method7577(Static638.anInt10709));
			}
		} else if (Static333.anInt6626 == 10) {
			Static353.method5745(local16);
		} else if (Static333.anInt6626 == 13) {
			Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, false, Static467.aClass5_13, Static536.aClass316_16.method7577(Static638.anInt10709) + "<br>" + Static536.aClass316_17.method7577(Static638.anInt10709));
		}
		if (Static313.anInt6259 == 3) {
			for (local88 = 0; local88 < Static588.anInt9948; local88++) {
				@Pc(370) Rectangle local370 = Class6_Sub38.aRectangleArray1[local88];
				if (Static412.aBooleanArray20[local88]) {
					Static467.aClass5_13.method6144(local370.height, local370.width, -65281, local370.x, local370.y);
				} else if (Static337.aBooleanArray15[local88]) {
					Static467.aClass5_13.method6144(local370.height, local370.width, -65536, local370.x, local370.y);
				} else {
					Static467.aClass5_13.method6144(local370.height, local370.width, -16711936, local370.x, local370.y);
				}
			}
		}
		if (Static388.method6089()) {
			Static17.method579(Static467.aClass5_13);
		}
		if (Static496.aClass104_4.aBoolean288 && Static157.method3089(Static333.anInt6626) && Static313.anInt6259 == 0 && Static326.method5447() == 1 && !local172) {
			local88 = 0;
			for (local92 = 0; local92 < Static588.anInt9948; local92++) {
				if (Static337.aBooleanArray15[local92]) {
					Static337.aBooleanArray15[local92] = false;
					Static493.aRectangleArray2[local88++] = Class6_Sub38.aRectangleArray1[local92];
				}
			}
			try {
				if (Static238.aBoolean425) {
					Static378.method5990(Static493.aRectangleArray2, local88);
				} else {
					Static467.aClass5_13.method6157(Static493.aRectangleArray2, local88);
				}
			} catch (@Pc(496) Exception_Sub1 local496) {
			}
		} else if (!Static46.method1557(Static333.anInt6626)) {
			for (local88 = 0; local88 < Static588.anInt9948; local88++) {
				Static337.aBooleanArray15[local88] = false;
			}
			try {
				if (Static238.aBoolean425) {
					Static10.method499();
				} else {
					Static467.aClass5_13.method6117();
				}
			} catch (@Pc(531) Exception_Sub1 local531) {
				Static358.method5809(local531, local531.getMessage() + " (Recovered) " + this.method2129());
				Static237.method4302(0, false);
			}
		}
		Static504.method7270();
		local88 = Static87.aClass6_Sub33_6.aClass14_Sub21_1.method7176();
		if (local88 == 0) {
			Static344.method5698(15L);
		} else if (local88 == 1) {
			Static344.method5698(10L);
		} else if (local88 == 2) {
			Static344.method5698(5L);
		} else if (local88 == 3) {
			Static344.method5698(2L);
		}
		if (Static573.aBoolean777) {
			Static5.method439();
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub2_1.method715() == 1 && Static333.anInt6626 == 3 && Static30.anInt830 != -1) {
			Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub2_1);
			Static541.method7640();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method2125() {
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method2128() {
		if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != 2) {
			this.method2134();
			return;
		}
		try {
			this.method2134();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static358.method5809(local24, local24.getMessage() + " (Recovered) " + this.method2129());
			Static398.aBoolean584 = true;
			Static237.method4302(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method2121() {
		if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != 2) {
			this.method2143();
			return;
		}
		try {
			this.method2143();
		} catch (@Pc(32) ThreadDeath local32) {
			throw local32;
		} catch (@Pc(35) Throwable local35) {
			Static358.method5809(local35, local35.getMessage() + " (Recovered) " + this.method2129());
			Static398.aBoolean584 = true;
			Static237.method4302(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method2141() {
		if (Static633.aClass152_3.anInt5586 > Static202.anInt4430) {
			Static184.aClass358_1.method8344();
			Static645.anInt10776 = (Static633.aClass152_3.anInt5586 - 1) * 250;
			if (Static645.anInt10776 > 3000) {
				Static645.anInt10776 = 3000;
			}
			if (Static633.aClass152_3.anInt5586 >= 2 && Static633.aClass152_3.anInt5587 == 6) {
				this.method2132("js5connect_outofdate");
				Static333.anInt6626 = 14;
				return;
			}
			if (Static633.aClass152_3.anInt5586 >= 4 && Static633.aClass152_3.anInt5587 == -1) {
				this.method2132("js5crc");
				Static333.anInt6626 = 14;
				return;
			}
			if (Static633.aClass152_3.anInt5586 >= 4 && Static46.method1557(Static333.anInt6626)) {
				if (Static633.aClass152_3.anInt5587 == 7 || Static633.aClass152_3.anInt5587 == 9) {
					this.method2132("js5connect_full");
				} else if (Static633.aClass152_3.anInt5587 <= 0) {
					this.method2132("js5io");
				} else if (Static509.aString99 == null) {
					this.method2132("js5connect");
				} else {
					this.method2132("js5proxy_" + Static509.aString99.trim());
				}
				Static333.anInt6626 = 14;
				return;
			}
		}
		Static202.anInt4430 = Static633.aClass152_3.anInt5586;
		if (Static645.anInt10776 > 0) {
			Static645.anInt10776--;
			return;
		}
		try {
			if (Static396.anInt7401 == 0) {
				Static583.aClass159_8 = Static184.aClass358_1.method8340(Static496.aClass104_4);
				Static396.anInt7401++;
			}
			if (Static396.anInt7401 == 1) {
				if (Static583.aClass159_8.anInt5910 == 2) {
					if (Static583.aClass159_8.anObject13 != null) {
						Static509.aString99 = (String) Static583.aClass159_8.anObject13;
					}
					this.method2142(1000);
					return;
				}
				if (Static583.aClass159_8.anInt5910 == 1) {
					Static396.anInt7401++;
				}
			}
			if (Static396.anInt7401 == 2) {
				Static391.aClass365_2 = new Class365((Socket) Static583.aClass159_8.anObject13, Static496.aClass104_4, 25000);
				@Pc(197) Class6_Sub8 local197 = new Class6_Sub8(5);
				local197.method8211(Static519.aClass238_2.anInt7405);
				local197.method8202(637);
				Static391.aClass365_2.method8462(5, local197.aByteArray102);
				Static396.anInt7401++;
				Static575.aLong69 = Static582.method8056();
			}
			if (Static396.anInt7401 == 3) {
				if (Static46.method1557(Static333.anInt6626) || Static391.aClass365_2.method8457() > 0) {
					@Pc(235) int local235 = Static391.aClass365_2.method8460();
					if (local235 != 0) {
						this.method2142(local235);
						return;
					}
					Static396.anInt7401++;
				} else if (Static582.method8056() - Static575.aLong69 > 30000L) {
					this.method2142(1001);
					return;
				}
			}
			if (Static396.anInt7401 == 4) {
				@Pc(282) boolean local282 = Static46.method1557(Static333.anInt6626) || Static268.method4834(Static333.anInt6626) || Static275.method8428(Static333.anInt6626);
				@Pc(285) Class119[] local285 = Static185.method3446();
				@Pc(293) Class6_Sub8 local293 = new Class6_Sub8(local285.length * 4);
				Static391.aClass365_2.method8463(0, local293.aByteArray102.length, local293.aByteArray102);
				for (@Pc(304) int local304 = 0; local304 < local285.length; local304++) {
					local285[local304].method3448(local293.method8236());
				}
				Static633.aClass152_3.method4609(Static391.aClass365_2, !local282);
				Static391.aClass365_2 = null;
				Static396.anInt7401 = 0;
				Static583.aClass159_8 = null;
			}
		} catch (@Pc(340) IOException local340) {
			this.method2142(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method2127() {
		if (Static128.aBoolean242) {
			Static48.method1562();
		}
		Static69.method2047();
		if (Static467.aClass5_13 != null) {
			Static467.aClass5_13.method6106();
		}
		if (Static224.aFrame5 != null) {
			Static495.method7177(Static224.aFrame5, Static496.aClass104_4);
			Static224.aFrame5 = null;
		}
		if (Static226.aClass41_1 != null) {
			Static226.aClass41_1.method1733();
			Static226.aClass41_1 = null;
		}
		Static557.method7834();
		Static633.aClass152_3.method4598();
		Static314.aClass267_2.method6814();
		if (Static126.aClass279_1 != null) {
			Static126.aClass279_1.method6970();
			Static126.aClass279_1 = null;
		}
		try {
			Static443.aClass240_4.method6269();
			for (@Pc(51) int local51 = 0; local51 < 37; local51++) {
				Static109.aClass240Array1[local51].method6269();
			}
			Static444.aClass240_5.method6269();
			Static359.aClass240_3.method6269();
			Static231.method4209();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method2142(@OriginalArg(1) int arg0) {
		Static396.anInt7401 = 0;
		Static633.aClass152_3.anInt5586++;
		Static583.aClass159_8 = null;
		Static391.aClass365_2 = null;
		Static633.aClass152_3.anInt5587 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method2143() {
		if (Static333.anInt6626 == 14) {
			return;
		}
		Static384.anInt7234++;
		if (Static384.anInt7234 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static294.anInt6025 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static309.aRandom1.setSeed((long) Static294.anInt6025);
		}
		if (Static384.anInt7234 % 50 == 0) {
			Static139.anInt3322 = Static624.anInt10500;
			Static218.anInt4655 = Static186.anInt4076;
			Static624.anInt10500 = 0;
			Static186.anInt4076 = 0;
		}
		this.method2144();
		if (Static301.aClass126_1 != null) {
			Static301.aClass126_1.method3587();
		}
		Static80.method2190();
		Static111.method2503();
		Static391.aClass91_1.method6219();
		Static6.aClass96_1.method8028();
		if (Static467.aClass5_13 != null) {
			Static467.aClass5_13.method6169((int) Static582.method8056());
		}
		Static523.method7455();
		Static26.anInt772 = 0;
		Static564.anInt9701 = 0;
		for (@Pc(102) Interface8 local102 = Static391.aClass91_1.method6221(); local102 != null; local102 = Static391.aClass91_1.method6221()) {
			@Pc(108) int local108 = local102.method2082();
			if (local108 == 2 || local108 == 3) {
				@Pc(139) char local139 = local102.method2083();
				if (Static479.method7089() && (local139 == '`' || local139 == '§' || local139 == '²')) {
					if (Static388.method6089()) {
						Static15.method550();
					} else {
						Static256.method4523();
					}
				} else if (Static564.anInt9701 < 128) {
					Static37.anInterface8Array1[Static564.anInt9701] = local102;
					Static564.anInt9701++;
				}
			} else if (local108 == 0 && Static26.anInt772 < 75) {
				Static577.anInterface8Array3[Static26.anInt772] = local102;
				Static26.anInt772++;
			}
		}
		Static551.anInt9470 = 0;
		for (@Pc(187) Class6_Sub22 local187 = Static6.aClass96_1.method8020(); local187 != null; local187 = Static6.aClass96_1.method8020()) {
			@Pc(195) int local195 = local187.method3463();
			if (local195 == -1) {
				Static494.aClass163_52.method4967(local187);
			} else if (local195 == 6) {
				Static551.anInt9470 += local187.method3459();
			} else if (Static467.method6968(local195)) {
				Static313.aClass163_35.method4967(local187);
				if (Static313.aClass163_35.method4972() > 10) {
					Static313.aClass163_35.method4969();
				}
			}
		}
		if (Static388.method6089()) {
			Static463.method6950();
		}
		if (Static46.method1557(Static333.anInt6626)) {
			Static69.method2044();
			Static67.method2006();
		} else if (Static365.method5880(Static333.anInt6626)) {
			Static341.method5673();
		}
		if (Static268.method4834(Static333.anInt6626) && !Static365.method5880(Static333.anInt6626)) {
			this.method2147();
			Static393.method6216();
			Static407.method6402();
		} else if (Static275.method8428(Static333.anInt6626) && !Static365.method5880(Static333.anInt6626)) {
			this.method2147();
			Static407.method6402();
		} else if (Static333.anInt6626 == 12) {
			Static407.method6402();
		} else if (Static238.method4328(Static333.anInt6626) && !Static365.method5880(Static333.anInt6626)) {
			Static348.method5722();
		} else if (Static333.anInt6626 == 13) {
			Static407.method6402();
			if (Static64.anInt10754 != -3 && Static64.anInt10754 != 2 && Static64.anInt10754 != 15) {
				Static5.method440(false);
			}
		}
		Static425.method6603(Static467.aClass5_13);
		Static313.aClass163_35.method4969();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method2129() {
		@Pc(12) String local12 = null;
		try {
			local12 = "[1)" + Static477.anInt8412 + "," + Static227.anInt5049 + "," + Static306.anInt6176 + "," + Static108.anInt2930 + "|";
			if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 != null) {
				local12 = local12 + "2)" + Static86.anInt10575 + "," + (Static477.anInt8412 + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0]) + "," + (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] + Static227.anInt5049) + "|";
			}
			local12 = local12 + "3)" + Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() + "|4)" + Static87.aClass6_Sub33_6.aClass14_Sub23_1.method7320() + "|5)" + Static326.method5447() + "|6)" + Static294.anInt6026 + "," + Static277.anInt5899 + "|";
			local12 = local12 + "7)" + Static87.aClass6_Sub33_6.aClass14_Sub10_1.method3033() + "|";
			local12 = local12 + "8)" + Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504() + "|";
			local12 = local12 + "9)" + Static87.aClass6_Sub33_6.aClass14_Sub28_1.method8390() + "|";
			local12 = local12 + "10)" + Static87.aClass6_Sub33_6.aClass14_Sub20_1.method7110() + "|";
			local12 = local12 + "11)" + Static87.aClass6_Sub33_6.aClass14_Sub5_1.method2299() + "|";
			local12 = local12 + "12)" + Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() + "|";
			local12 = local12 + "13)" + Static510.anInt8806 + "|";
			local12 = local12 + "14)" + Static333.anInt6626;
			if (Static18.aClass6_Sub38_1 != null) {
				local12 = local12 + "|15)" + Static18.aClass6_Sub38_1.anInt7891;
			}
			try {
				if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 2) {
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
									@Pc(327) Field local327 = local294.getClass().getDeclaredField("handle");
									local263.invoke(local327, Boolean.TRUE);
									local12 = local12 + "|16)" + Long.toHexString(local327.getLong(local294));
									local263.invoke(local327, Boolean.FALSE);
								}
							} catch (@Pc(363) Throwable local363) {
							}
							local263.invoke(local299, Boolean.FALSE);
						} catch (@Pc(375) Throwable local375) {
						}
					}
				}
			} catch (@Pc(387) Throwable local387) {
			}
			local12 = local12 + "]";
		} catch (@Pc(398) Throwable local398) {
		}
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2122() {
		if (Static635.anApplet2 != null && Static428.aCanvas12 == null && !Static496.aClass104_4.aBoolean288) {
			try {
				@Pc(13) Class local13 = Static635.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static428.aCanvas12 = (Canvas) local17.get(Static635.anApplet2);
				local17.set(Static635.anApplet2, (Object) null);
				if (Static428.aCanvas12 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method2122();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method2144() {
		@Pc(7) boolean local7 = Static633.aClass152_3.method4605();
		if (!local7) {
			this.method2141();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method2147() {
		@Pc(27) int local27;
		if (Static333.anInt6626 == 7 && Static347.anInt6836 == 0) {
			if (Static96.anInt2770 > 1) {
				Static440.anInt7977 = Static51.anInt1750;
				Static96.anInt2770--;
			}
			if (!Static199.aBoolean358) {
				Static95.method2327();
			}
			for (local27 = 0; local27 < 100 && Static395.method6253(); local27++) {
			}
		}
		Static492.anInt8597++;
		Static13.method524(-1, -1, (Class302) null);
		Static527.method7491(-1, (Class302) null, -1);
		Static7.method448();
		Static51.anInt1750++;
		for (local27 = 0; local27 < Static337.anInt6701; local27++) {
			@Pc(71) Class9_Sub4_Sub2_Sub1_Sub1 local71 = Static303.aClass6_Sub42Array1[local27].aClass9_Sub4_Sub2_Sub1_Sub1_1;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass158_1.aByte57;
				if ((local77 & 0x1) != 0) {
					@Pc(85) int local85 = local71.method3620();
					@Pc(112) int local112;
					if ((local77 & 0x2) != 0 && local71.anInt4359 == 0 && Math.random() * 1000.0D < 10.0D) {
						local112 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(120) int local120 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local112 != 0 || local120 != 0) {
							@Pc(138) int local138 = local71.anIntArray197[0] + local112;
							@Pc(145) int local145 = local120 + local71.anIntArray198[0];
							if (local138 < 0) {
								local138 = 0;
							} else if (Static306.anInt6176 - local85 - 1 < local138) {
								local138 = Static306.anInt6176 - local85 - 1;
							}
							if (local145 < 0) {
								local145 = 0;
							} else if (Static108.anInt2930 - local85 - 1 < local145) {
								local145 = Static108.anInt2930 - local85 - 1;
							}
							@Pc(219) int local219 = Static568.method2131(Static313.aClass258Array1[local71.aByte135], local85, Static267.anIntArray255, 0, 0, local145, local85, local71.anIntArray198[0], Static217.anIntArray207, true, local138, -1, local71.anIntArray197[0], local85);
							if (local219 > 0) {
								if (local219 > 9) {
									local219 = 9;
								}
								for (@Pc(230) int local230 = 0; local230 < local219; local230++) {
									local71.anIntArray197[local230] = Static267.anIntArray255[local219 - local230 - 1];
									local71.anIntArray198[local230] = Static217.anIntArray207[local219 - local230 - 1];
									local71.aByteArray31[local230] = 1;
								}
								local71.anInt4359 = local219;
							}
						}
					}
					Static571.method7991(true, local71);
					local112 = Static203.method3700(local71);
					Static196.method3568(local71);
					Static539.method7624(Static623.anInt10492, local71, Static511.anInt8817, local112);
					Static497.method7193(Static511.anInt8817, local71);
					Static579.method8039(local71);
				}
			}
		}
		if (Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
			if (Static554.anInt9497 == 2) {
				Static55.method1671();
			} else {
				Static345.method5703();
			}
			if (Static184.anInt4048 >> 9 < 14 || Static184.anInt4048 >> 9 >= Static306.anInt6176 - 14 || Static259.anInt6990 >> 9 < 14 || Static259.anInt6990 >> 9 >= Static108.anInt2930 - 14) {
				Static119.method2557();
			}
		}
		while (true) {
			@Pc(353) Class6_Sub29 local353;
			@Pc(358) Class302 local358;
			@Pc(366) Class302 local366;
			do {
				local353 = (Class6_Sub29) Static341.aClass163_38.method4969();
				if (local353 == null) {
					while (true) {
						do {
							local353 = (Class6_Sub29) Static184.aClass163_22.method4969();
							if (local353 == null) {
								while (true) {
									do {
										local353 = (Class6_Sub29) Static138.aClass163_17.method4969();
										if (local353 == null) {
											if (Static448.aClass302_13 != null) {
												Static401.method6299();
											}
											if (Static384.anInt7234 % 1500 == 0) {
												Static8.method486();
											}
											if (Static333.anInt6626 == 7 && Static347.anInt6836 == 0) {
												Static372.method5918();
											}
											Static627.method8565();
											if (Static128.aBoolean242 && Static135.aLong82 < Static582.method8056() - 60000L) {
												Static48.method1562();
											}
											for (@Pc(531) Class9_Sub1_Sub2 local531 = (Class9_Sub1_Sub2) Static220.aClass234_13.method6092(); local531 != null; local531 = (Class9_Sub1_Sub2) Static220.aClass234_13.method6098()) {
												if (Static582.method8056() / 1000L - 5L > (long) local531.anInt5336) {
													if (local531.aShort48 > 0) {
														Static548.method7725(5, local531.aString50 + Static536.aClass316_21.method7577(Static638.anInt10709), 0, "", "", "");
													}
													if (local531.aShort48 == 0) {
														Static548.method7725(5, local531.aString50 + Static536.aClass316_22.method7577(Static638.anInt10709), 0, "", "", "");
													}
													local531.method8408();
												}
											}
											if (Static333.anInt6626 == 7 && Static347.anInt6836 == 0) {
												if (Static226.aClass41_1 == null) {
													Static5.method440(false);
													return;
												}
												Static360.anInt6970++;
												if (Static360.anInt6970 > 50) {
													@Pc(632) Class6_Sub17 local632 = Static330.method7824(Static457.aClass185_92, Static569.aClass134_2);
													Static452.method6867(local632);
												}
												try {
													Static169.method3193();
													return;
												} catch (@Pc(639) IOException local639) {
													Static5.method440(false);
													return;
												}
											}
											return;
										}
										local358 = local353.aClass302_7;
										if (local358.anInt8898 < 0) {
											break;
										}
										local366 = Static299.method5103(local358.anInt8857);
									} while (local366 == null || local366.aClass302Array2 == null || local366.aClass302Array2.length <= local358.anInt8898 || local358 != local366.aClass302Array2[local358.anInt8898]);
									Static435.method6669(local353);
								}
							}
							local358 = local353.aClass302_7;
							if (local358.anInt8898 < 0) {
								break;
							}
							local366 = Static299.method5103(local358.anInt8857);
						} while (local366 == null || local366.aClass302Array2 == null || local358.anInt8898 >= local366.aClass302Array2.length || local366.aClass302Array2[local358.anInt8898] != local358);
						Static435.method6669(local353);
					}
				}
				local358 = local353.aClass302_7;
				if (local358.anInt8898 < 0) {
					break;
				}
				local366 = Static299.method5103(local358.anInt8857);
			} while (local366 == null || local366.aClass302Array2 == null || local366.aClass302Array2.length <= local358.anInt8898 || local366.aClass302Array2[local358.anInt8898] != local358);
			Static435.method6669(local353);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	protected void method2130() {
		if (Static48.aBoolean137) {
			Static510.anInt8806 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static266.method4777();
		Static314.aClass267_2 = new Class267(Static496.aClass104_4);
		Static633.aClass152_3 = new Class152();
		Static298.method5090(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static630.aClass212_18 != Static86.aClass212_19) {
			Static144.aByteArrayArray36 = new byte[50][];
		}
		Static87.aClass6_Sub33_6 = Static319.method5323();
		if (Static86.aClass212_19 == Static630.aClass212_18) {
			Static307.aClass358_2.aString107 = this.getCodeBase().getHost();
		} else if (Static257.method4574(Static630.aClass212_18)) {
			Static307.aClass358_2.aString107 = this.getCodeBase().getHost();
			Static307.aClass358_2.anInt10271 = Static307.aClass358_2.anInt10266 + 40000;
			Static578.aClass358_5.anInt10271 = Static578.aClass358_5.anInt10266 + 40000;
			Static439.aClass358_3.anInt10271 = Static439.aClass358_3.anInt10266 + 40000;
			Static307.aClass358_2.anInt10268 = Static307.aClass358_2.anInt10266 + 50000;
			Static578.aClass358_5.anInt10268 = Static578.aClass358_5.anInt10266 + 50000;
			Static439.aClass358_3.anInt10268 = Static439.aClass358_3.anInt10266 + 50000;
		} else if (Static496.aClass212_17 == Static630.aClass212_18) {
			Static307.aClass358_2.aString107 = "127.0.0.1";
			Static578.aClass358_5.aString107 = "127.0.0.1";
			Static439.aClass358_3.aString107 = "127.0.0.1";
			Static307.aClass358_2.anInt10271 = Static307.aClass358_2.anInt10266 + 40000;
			Static578.aClass358_5.anInt10271 = Static578.aClass358_5.anInt10266 + 40000;
			Static439.aClass358_3.anInt10271 = Static439.aClass358_3.anInt10266 + 40000;
			Static307.aClass358_2.anInt10268 = Static307.aClass358_2.anInt10266 + 50000;
			Static578.aClass358_5.anInt10268 = Static578.aClass358_5.anInt10266 + 50000;
			Static439.aClass358_3.anInt10268 = Static439.aClass358_3.anInt10266 + 50000;
		}
		Static184.aClass358_1 = Static307.aClass358_2;
		if (Static25.aClass290_5 == Static8.aClass290_1) {
			Static578.anInt9856 = 16777215;
			Static158.aShortArrayArray13 = Static395.aShortArrayArray23;
			Static198.aBoolean343 = true;
			Static352.anInt6859 = 0;
			Static119.aShortArrayArrayArray3 = Static220.aShortArrayArrayArray8;
		} else if (Static552.aClass290_37 == Static8.aClass290_1) {
			Static119.aShortArrayArrayArray3 = Static338.aShortArrayArrayArray6;
			Static158.aShortArrayArray13 = Static46.aShortArrayArray1;
		} else {
			Static158.aShortArrayArray13 = Static262.aShortArrayArray15;
			Static119.aShortArrayArrayArray3 = Static150.aShortArrayArrayArray4;
		}
		if (Static8.aClass290_1 == Static406.aClass290_34) {
			Static560.aBoolean765 = false;
		}
		Static434.aShortArray181 = Static634.aShortArray182 = Static467.aShortArray135 = Static576.aShortArray176 = new short[256];
		try {
			Static15.aClipboard1 = Static545.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(220) Exception local220) {
		}
		Static391.aClass91_1 = Static627.method8564(Static428.aCanvas12);
		Static6.aClass96_1 = Static138.method2759(Static428.aCanvas12);
		try {
			if (Static496.aClass104_4.aClass360_3 != null) {
				Static443.aClass240_4 = new Class240(Static496.aClass104_4.aClass360_3, 5200, 0);
				for (@Pc(242) int local242 = 0; local242 < 37; local242++) {
					Static109.aClass240Array1[local242] = new Class240(Static496.aClass104_4.aClass360Array1[local242], 6000, 0);
				}
				Static444.aClass240_5 = new Class240(Static496.aClass104_4.aClass360_1, 6000, 0);
				Static61.aClass26_1 = new Class26(255, Static443.aClass240_4, Static444.aClass240_5, 500000);
				Static359.aClass240_3 = new Class240(Static496.aClass104_4.aClass360_2, 24, 0);
				Static496.aClass104_4.aClass360_2 = null;
				Static496.aClass104_4.aClass360_3 = null;
				Static496.aClass104_4.aClass360Array1 = null;
				Static496.aClass104_4.aClass360_1 = null;
			}
		} catch (@Pc(300) IOException local300) {
			Static443.aClass240_4 = null;
			Static444.aClass240_5 = null;
			Static61.aClass26_1 = null;
			Static359.aClass240_3 = null;
		}
		if (Static86.aClass212_19 != Static630.aClass212_18) {
			Static164.aBoolean291 = true;
		}
		Static467.aString85 = Static536.aClass316_14.method7577(Static638.anInt10709);
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method2124()) {
			return;
		}
		Static307.aClass358_2 = new Class358();
		Static307.aClass358_2.anInt10266 = Integer.parseInt(this.getParameter("worldid"));
		Static578.aClass358_5 = new Class358();
		Static578.aClass358_5.anInt10266 = Integer.parseInt(this.getParameter("lobbyid"));
		Static578.aClass358_5.aString107 = this.getParameter("lobbyaddress");
		Static439.aClass358_3 = new Class358();
		Static439.aClass358_3.anInt10266 = Integer.parseInt(this.getParameter("demoid"));
		Static439.aClass358_3.aString107 = this.getParameter("demoaddress");
		Static630.aClass212_18 = Static327.method5482(Integer.parseInt(this.getParameter("modewhere")));
		if (Static630.aClass212_18 == Static496.aClass212_17) {
			Static630.aClass212_18 = Static375.aClass212_15;
		} else if (!Static257.method4574(Static630.aClass212_18) && Static630.aClass212_18 != Static86.aClass212_19) {
			Static630.aClass212_18 = Static86.aClass212_19;
		}
		Static136.aClass12_3 = Static614.method8442(Integer.parseInt(this.getParameter("modewhat")));
		if (Static432.aClass12_4 != Static136.aClass12_3 && Static136.aClass12_3 != Static3.aClass12_1 && Static6.aClass12_2 != Static136.aClass12_3) {
			Static136.aClass12_3 = Static6.aClass12_2;
		}
		try {
			Static638.anInt10709 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static638.anInt10709 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static257.aBoolean439 = true;
		} else {
			Static257.aBoolean439 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static296.aBoolean473 = true;
		} else {
			Static296.aBoolean473 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static320.aBoolean496 = true;
		} else {
			Static320.aBoolean496 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static8.aClass290_1 = Static406.aClass290_34;
			} else if (local152.equals("1")) {
				Static8.aClass290_1 = Static25.aClass290_5;
			} else if (local152.equals("2")) {
				Static8.aClass290_1 = Static339.aClass290_32;
			} else if (local152.equals("3")) {
				Static8.aClass290_1 = Static552.aClass290_37;
			}
		}
		try {
			Static234.anInt5227 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static234.anInt5227 = 0;
		}
		Static9.aString3 = this.getParameter("quiturl");
		Static162.aString39 = this.getParameter("settings");
		if (Static162.aString39 == null) {
			Static162.aString39 = "";
		}
		Static201.aBoolean576 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static414.anInt7699 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static414.anInt7699 = 0;
			}
		}
		Static87.anInt2632 = Integer.parseInt(this.getParameter("colourid"));
		if (Static87.anInt2632 < 0 || Static523.aColorArray3.length <= Static87.anInt2632) {
			Static87.anInt2632 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static479.aBoolean677 = true;
			Static393.aBoolean579 = true;
		}
		@Pc(256) String local256 = this.getParameter("frombilling");
		if (local256 != null && local256.equals("true")) {
			Static472.aBoolean671 = true;
		}
		Static143.aString27 = this.getParameter("sskey");
		if (Static143.aString27 != null && Static143.aString27.length() < 2) {
			Static143.aString27 = null;
		}
		@Pc(282) String local282 = this.getParameter("force64mb");
		if (local282 != null && local282.equals("true")) {
			Static48.aBoolean137 = true;
		}
		@Pc(294) String local294 = this.getParameter("worldflags");
		if (local294 != null) {
			try {
				Static552.anInt9484 = Integer.parseInt(local294);
			} catch (@Pc(301) Exception local301) {
			}
		}
		@Pc(306) String local306 = this.getParameter("userFlow");
		if (local306 != null) {
			try {
				Static361.aLong189 = Long.parseLong(local306);
			} catch (@Pc(313) NumberFormatException local313) {
			}
		}
		Static108.aString21 = this.getParameter("additionalInfo");
		if (Static108.aString21 != null && Static108.aString21.length() > 50) {
			Static108.aString21 = null;
		}
		Static545.aClient1 = this;
		if (Static406.aClass290_34 == Static8.aClass290_1) {
			Static52.anInt1780 = 503;
			Static182.anInt4018 = 765;
		} else if (Static8.aClass290_1 == Static25.aClass290_5) {
			Static52.anInt1780 = 480;
			Static182.anInt4018 = 640;
		}
		this.method2119(Static52.anInt1780, Static8.aClass290_1.aString86, Static136.aClass12_3.method500() + 32, Static182.anInt4018);
	}
}
