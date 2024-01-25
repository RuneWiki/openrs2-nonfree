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
				Static337.method5178("Argument count");
			}
			Static518.aClass109_4 = new Class109();
			Static518.aClass109_4.anInt2756 = Integer.parseInt(arg0[0]);
			Static398.aClass109_3 = new Class109();
			Static398.aClass109_3.anInt2756 = Integer.parseInt(arg0[1]);
			Static187.aClass109_1 = new Class109();
			Static187.aClass109_1.anInt2756 = Integer.parseInt(arg0[2]);
			Static34.aClass346_2 = Static28.aClass346_1;
			if (arg0[3].equals("live")) {
				Static238.aClass97_1 = Static650.aClass97_7;
			} else if (arg0[3].equals("rc")) {
				Static238.aClass97_1 = Static416.aClass97_4;
			} else if (arg0[3].equals("wip")) {
				Static238.aClass97_1 = Static447.aClass97_5;
			} else {
				Static337.method5178("modewhat");
			}
			Static321.anInt5554 = Static48.method771(arg0[4]);
			if (Static321.anInt5554 == -1) {
				if (arg0[4].equals("english")) {
					Static321.anInt5554 = 0;
				} else if (arg0[4].equals("german")) {
					Static321.anInt5554 = 1;
				} else {
					Static337.method5178("language");
				}
			}
			Static297.aBoolean391 = false;
			Static259.aBoolean174 = false;
			if (arg0[5].equals("game0")) {
				Static24.aClass235_1 = Static191.aClass235_2;
			} else if (arg0[5].equals("game1")) {
				Static24.aClass235_1 = Static609.aClass235_7;
			} else if (arg0[5].equals("game2")) {
				Static24.aClass235_1 = Static378.aClass235_4;
			} else if (arg0[5].equals("game3")) {
				Static24.aClass235_1 = Static447.aClass235_5;
			} else {
				Static337.method5178("game");
			}
			Static120.aString144 = null;
			Static589.aBoolean312 = false;
			Static55.aLong30 = 0L;
			Static19.aString5 = null;
			Static458.aBoolean638 = false;
			Static141.anInt2321 = 0;
			Static604.aString143 = "";
			Static178.anInt3170 = 0;
			Static409.anInt7033 = Static24.aClass235_1.anInt6378;
			Static41.anInt706 = 0;
			Static517.aBoolean709 = true;
			Static386.aBoolean562 = true;
			@Pc(184) client local184 = new client();
			Static108.aClient1 = local184;
			local184.method1198(Static24.aClass235_1.aString101, Static238.aClass97_1.method1932() + 32);
			Static510.aFrame2.setLocation(40, 40);
		} catch (@Pc(207) Exception local207) {
			Static280.method4194((String) null, local207);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1214() {
		if (Static497.anInt8480 < Static49.aClass331_1.anInt9150) {
			Static282.aClass109_2.method2382();
			Static528.anInt8799 = (Static49.aClass331_1.anInt9150 - 1) * 250;
			if (Static528.anInt8799 > 3000) {
				Static528.anInt8799 = 3000;
			}
			if (Static49.aClass331_1.anInt9150 >= 2 && Static49.aClass331_1.anInt9151 == 6) {
				this.method1204("js5connect_outofdate");
				Static469.anInt7883 = 14;
				return;
			}
			if (Static49.aClass331_1.anInt9150 >= 4 && Static49.aClass331_1.anInt9151 == -1) {
				this.method1204("js5crc");
				Static469.anInt7883 = 14;
				return;
			}
			if (Static49.aClass331_1.anInt9150 >= 4 && Static538.method7674(Static469.anInt7883)) {
				if (Static49.aClass331_1.anInt9151 == 7 || Static49.aClass331_1.anInt9151 == 9) {
					this.method1204("js5connect_full");
				} else if (Static49.aClass331_1.anInt9151 <= 0) {
					this.method1204("js5io");
				} else if (Static597.aString136 == null) {
					this.method1204("js5connect");
				} else {
					this.method1204("js5proxy_" + Static597.aString136.trim());
				}
				Static469.anInt7883 = 14;
				return;
			}
		}
		Static497.anInt8480 = Static49.aClass331_1.anInt9150;
		if (Static528.anInt8799 > 0) {
			Static528.anInt8799--;
			return;
		}
		try {
			if (Static569.anInt7524 == 0) {
				Static449.aClass330_7 = Static282.aClass109_2.method2383(Static214.aClass192_1);
				Static569.anInt7524++;
			}
			if (Static569.anInt7524 == 1) {
				if (Static449.aClass330_7.anInt9132 == 2) {
					if (Static449.aClass330_7.anObject19 != null) {
						Static597.aString136 = (String) Static449.aClass330_7.anObject19;
					}
					this.method1216(1000);
					return;
				}
				if (Static449.aClass330_7.anInt9132 == 1) {
					Static569.anInt7524++;
				}
			}
			if (Static569.anInt7524 == 2) {
				Static491.aClass257_3 = new Class257((Socket) Static449.aClass330_7.anObject19, Static214.aClass192_1, 25000);
				@Pc(184) Class5_Sub12 local184 = new Class5_Sub12(5);
				local184.method8647(Static603.aClass244_2.anInt6597);
				local184.method8622(640);
				Static491.aClass257_3.method6185(local184.aByteArray104, 5);
				Static569.anInt7524++;
				Static523.aLong230 = Static205.method3179();
			}
			if (Static569.anInt7524 == 3) {
				if (Static538.method7674(Static469.anInt7883) || Static491.aClass257_3.method6193() > 0) {
					@Pc(237) int local237 = Static491.aClass257_3.method6192();
					if (local237 != 0) {
						this.method1216(local237);
						return;
					}
					Static569.anInt7524++;
				} else if (Static205.method3179() - Static523.aLong230 > 30000L) {
					this.method1216(1001);
					return;
				}
			}
			if (Static569.anInt7524 == 4) {
				@Pc(267) boolean local267 = Static538.method7674(Static469.anInt7883) || Static454.method6737(Static469.anInt7883) || Static318.method4969(Static469.anInt7883);
				@Pc(270) Class18[] local270 = Static20.method454();
				@Pc(278) Class5_Sub12 local278 = new Class5_Sub12(local270.length * 4);
				Static491.aClass257_3.method6189(local278.aByteArray104, local278.aByteArray104.length, 0);
				for (@Pc(289) int local289 = 0; local289 < local270.length; local289++) {
					local270[local289].method455(local278.method8623());
				}
				Static49.aClass331_1.method7797(!local267, Static491.aClass257_3);
				Static449.aClass330_7 = null;
				Static491.aClass257_3 = null;
				Static569.anInt7524 = 0;
			}
		} catch (@Pc(331) IOException local331) {
			this.method1216(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1212() {
		if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 2) {
			this.method1218();
			return;
		}
		try {
			this.method1218();
		} catch (@Pc(25) ThreadDeath local25) {
			throw local25;
		} catch (@Pc(28) Throwable local28) {
			Static280.method4194(local28.getMessage() + " (Recovered) " + this.method1207(), local28);
			Static590.aBoolean775 = true;
			Static590.method8288(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1199() {
		if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 2) {
			this.method1230();
			return;
		}
		try {
			this.method1230();
		} catch (@Pc(18) ThreadDeath local18) {
			throw local18;
		} catch (@Pc(21) Throwable local21) {
			Static280.method4194(local21.getMessage() + " (Recovered) " + this.method1207(), local21);
			Static590.aBoolean775 = true;
			Static590.method8288(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1216(@OriginalArg(0) int arg0) {
		Static49.aClass331_1.anInt9151 = arg0;
		Static569.anInt7524 = 0;
		Static449.aClass330_7 = null;
		Static49.aClass331_1.anInt9150++;
		Static491.aClass257_3 = null;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1200() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1195() {
		if (Static383.aBoolean558) {
			Static159.method2410();
		}
		Static321.method4988();
		if (Static485.aClass126_17 != null) {
			Static485.aClass126_17.method7044();
		}
		if (Static630.aFrame3 != null) {
			Static373.method5812(Static214.aClass192_1, Static630.aFrame3);
			Static630.aFrame3 = null;
		}
		if (Static487.aClass30_2 != null) {
			Static487.aClass30_2.method671();
			Static487.aClass30_2 = null;
		}
		Static644.method8844();
		Static49.aClass331_1.method7792();
		Static268.aClass94_1.method1912();
		if (Static525.aClass340_1 != null) {
			Static525.aClass340_1.method8131();
			Static525.aClass340_1 = null;
		}
		try {
			Static161.aClass64_1.method1314();
			for (@Pc(55) int local55 = 0; local55 < 37; local55++) {
				Static162.aClass64Array1[local55].method1314();
			}
			Static467.aClass64_5.method1314();
			Static423.aClass64_4.method1314();
			Static416.method6341();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1218() {
		if (Static469.anInt7883 == 14) {
			return;
		}
		@Pc(19) long local19 = Static116.method1666() / 1000000L - Static482.aLong257;
		Static482.aLong257 = Static116.method1666() / 1000000L;
		@Pc(27) boolean local27 = Static30.method608();
		if (local27 && Static309.aBoolean451 && Static68.aClass63_1 != null) {
			Static68.aClass63_1.method3492();
		}
		if (Static509.method7367(Static469.anInt7883)) {
			if (Static224.aLong118 != 0L && Static205.method3179() > Static224.aLong118) {
				Static236.method3632(false, Static259.method1979(), Static464.anInt7861, Static368.anInt6517);
			} else if (!Static485.aClass126_17.method6993() && Static636.aBoolean832) {
				Static243.method3689();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static630.aFrame3 == null) {
			@Pc(77) Container local77;
			if (Static510.aFrame2 != null) {
				local77 = Static510.aFrame2;
			} else if (Static270.anApplet5 == null) {
				local77 = Static3.anApplet_Sub1_1;
			} else {
				local77 = Static270.anApplet5;
			}
			local89 = local77.getSize().width;
			local93 = local77.getSize().height;
			if (Static510.aFrame2 == local77) {
				@Pc(99) Insets local99 = Static510.aFrame2.getInsets();
				local89 -= local99.right + local99.left;
				local93 -= local99.top + local99.bottom;
			}
			if (Static489.anInt8353 != local89 || Static374.anInt6594 != local93 || Static9.aBoolean5) {
				if (Static485.aClass126_17 == null || Static485.aClass126_17.method7012()) {
					Static110.method1619();
				} else {
					Static374.anInt6594 = local93;
					Static489.anInt8353 = local89;
				}
				Static224.aLong118 = Static205.method3179() + 500L;
				Static9.aBoolean5 = false;
			}
		}
		if (Static630.aFrame3 != null && !Static292.aBoolean386 && Static509.method7367(Static469.anInt7883)) {
			Static236.method3632(false, Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191(), -1, -1);
		}
		@Pc(167) boolean local167 = false;
		if (Static267.aBoolean362) {
			local167 = true;
			Static267.aBoolean362 = false;
		}
		if (local167) {
			Static639.method8796();
		}
		if (Static485.aClass126_17 != null && Static485.aClass126_17.method6993() || Static259.method1979() != 1) {
			Static101.method1476();
		}
		if (Static538.method7674(Static469.anInt7883)) {
			Static217.method3300(local167);
		} else if (Static403.method6190(Static469.anInt7883)) {
			Static76.method1238();
		} else if (Static372.method5783(Static469.anInt7883)) {
			Static76.method1238();
		} else if (Static326.method5072(Static469.anInt7883)) {
			if (Static220.anInt3794 == 1) {
				if (Static564.anInt9281 > Static10.anInt160) {
					Static10.anInt160 = Static564.anInt9281;
				}
				local89 = (Static10.anInt160 - Static564.anInt9281) * 50 / Static10.anInt160;
				Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, true, Static76.aClass58_13.method1237(Static321.anInt5554) + "<br>(" + local89 + "%)");
			} else if (Static220.anInt3794 == 2) {
				if (Static69.anInt1100 > Static244.anInt4081) {
					Static244.anInt4081 = Static69.anInt1100;
				}
				local89 = (Static244.anInt4081 - Static69.anInt1100) * 50 / Static244.anInt4081 + 50;
				Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, true, Static76.aClass58_13.method1237(Static321.anInt5554) + "<br>(" + local89 + "%)");
			} else {
				Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, true, Static76.aClass58_13.method1237(Static321.anInt5554));
			}
		} else if (Static469.anInt7883 == 10) {
			Static298.method2522(local19);
		} else if (Static469.anInt7883 == 13) {
			Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, false, Static76.aClass58_15.method1237(Static321.anInt5554) + "<br>" + Static76.aClass58_16.method1237(Static321.anInt5554));
		}
		if (Static579.anInt9497 == 3) {
			for (local89 = 0; local89 < Static188.anInt10386; local89++) {
				@Pc(371) Rectangle local371 = Class5_Sub5_Sub1.aRectangleArray1[local89];
				if (Static517.aBooleanArray51[local89]) {
					Static485.aClass126_17.method7005(local371.height, -65281, local371.width, local371.y, local371.x);
				} else if (Static248.aBooleanArray27[local89]) {
					Static485.aClass126_17.method7005(local371.height, -65536, local371.width, local371.y, local371.x);
				} else {
					Static485.aClass126_17.method7005(local371.height, -16711936, local371.width, local371.y, local371.x);
				}
			}
		}
		if (Static192.method7611()) {
			Static233.method6785(Static485.aClass126_17);
		}
		if (Static214.aClass192_1.aBoolean390 && Static509.method7367(Static469.anInt7883) && Static579.anInt9497 == 0 && Static259.method1979() == 1 && !local167) {
			local89 = 0;
			for (local93 = 0; local93 < Static188.anInt10386; local93++) {
				if (Static248.aBooleanArray27[local93]) {
					Static248.aBooleanArray27[local93] = false;
					Static558.aRectangleArray2[local89++] = Class5_Sub5_Sub1.aRectangleArray1[local93];
				}
			}
			try {
				if (Static144.aBoolean196) {
					Static602.method8408(Static558.aRectangleArray2, local89);
				} else {
					Static485.aClass126_17.method7035(Static558.aRectangleArray2, local89);
				}
			} catch (@Pc(486) Exception_Sub1 local486) {
			}
		} else if (!Static538.method7674(Static469.anInt7883)) {
			for (local89 = 0; local89 < Static188.anInt10386; local89++) {
				Static248.aBooleanArray27[local89] = false;
			}
			try {
				if (Static144.aBoolean196) {
					Static418.method6362();
				} else {
					Static485.aClass126_17.method7050();
				}
			} catch (@Pc(515) Exception_Sub1 local515) {
				Static280.method4194(local515.getMessage() + " (Recovered) " + this.method1207(), local515);
				Static590.method8288(false, 0);
			}
		}
		Static206.method3187();
		local89 = Static627.aClass5_Sub46_31.aClass11_Sub18_1.method6179();
		if (local89 == 0) {
			Static452.method7478(15L);
		} else if (local89 == 1) {
			Static452.method7478(10L);
		} else if (local89 == 2) {
			Static452.method7478(5L);
		} else if (local89 == 3) {
			Static452.method7478(2L);
		}
		if (Static87.aBoolean115) {
			Static69.method1139();
		}
		if (Static627.aClass5_Sub46_31.aClass11_Sub12_1.method3658() == 1 && Static469.anInt7883 == 3 && Static302.anInt4813 != -1) {
			Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub12_1, 0);
			Static499.method7307();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1219() {
		@Pc(15) boolean local15 = Static49.aClass331_1.method7791();
		if (!local15) {
			this.method1214();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1197() {
		if (Static270.anApplet5 != null && Static181.aCanvas3 == null && !Static214.aClass192_1.aBoolean390) {
			try {
				@Pc(13) Class local13 = Static270.anApplet5.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static181.aCanvas3 = (Canvas) local17.get(Static270.anApplet5);
				local17.set(Static270.anApplet5, (Object) null);
				if (Static181.aCanvas3 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1197();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1205()) {
			return;
		}
		Static518.aClass109_4 = new Class109();
		Static518.aClass109_4.anInt2756 = Integer.parseInt(this.getParameter("worldid"));
		Static398.aClass109_3 = new Class109();
		Static398.aClass109_3.anInt2756 = Integer.parseInt(this.getParameter("lobbyid"));
		Static398.aClass109_3.aString44 = this.getParameter("lobbyaddress");
		Static187.aClass109_1 = new Class109();
		Static187.aClass109_1.anInt2756 = Integer.parseInt(this.getParameter("demoid"));
		Static187.aClass109_1.aString44 = this.getParameter("demoaddress");
		Static34.aClass346_2 = Static225.method3519(Integer.parseInt(this.getParameter("modewhere")));
		if (Static34.aClass346_2 == Static28.aClass346_1) {
			Static34.aClass346_2 = Static383.aClass346_5;
		} else if (!Static347.method8141(Static34.aClass346_2) && Static363.aClass346_4 != Static34.aClass346_2) {
			Static34.aClass346_2 = Static363.aClass346_4;
		}
		Static238.aClass97_1 = Static19.method453(Integer.parseInt(this.getParameter("modewhat")));
		if (Static238.aClass97_1 != Static447.aClass97_5 && Static238.aClass97_1 != Static416.aClass97_4 && Static650.aClass97_7 != Static238.aClass97_1) {
			Static238.aClass97_1 = Static650.aClass97_7;
		}
		try {
			Static321.anInt5554 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static321.anInt5554 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static259.aBoolean174 = true;
		} else {
			Static259.aBoolean174 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static297.aBoolean391 = true;
		} else {
			Static297.aBoolean391 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static115.aBoolean134 = true;
		} else {
			Static115.aBoolean134 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static24.aClass235_1 = Static191.aClass235_2;
			} else if (local152.equals("1")) {
				Static24.aClass235_1 = Static609.aClass235_7;
			} else if (local152.equals("2")) {
				Static24.aClass235_1 = Static378.aClass235_4;
			} else if (local152.equals("3")) {
				Static24.aClass235_1 = Static447.aClass235_5;
			}
		}
		try {
			Static141.anInt2321 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static141.anInt2321 = 0;
		}
		Static599.aString137 = this.getParameter("quiturl");
		Static604.aString143 = this.getParameter("settings");
		if (Static604.aString143 == null) {
			Static604.aString143 = "";
		}
		Static80.aBoolean105 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static178.anInt3170 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static178.anInt3170 = 0;
			}
		}
		Static409.anInt7033 = Integer.parseInt(this.getParameter("colourid"));
		if (Static409.anInt7033 < 0 || Static294.aColorArray2.length <= Static409.anInt7033) {
			Static409.anInt7033 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static517.aBoolean709 = true;
			Static386.aBoolean562 = true;
		}
		@Pc(252) String local252 = this.getParameter("frombilling");
		if (local252 != null && local252.equals("true")) {
			Static589.aBoolean312 = true;
		}
		Static120.aString144 = this.getParameter("sskey");
		if (Static120.aString144 != null && Static120.aString144.length() < 2) {
			Static120.aString144 = null;
		}
		@Pc(276) String local276 = this.getParameter("force64mb");
		if (local276 != null && local276.equals("true")) {
			Static458.aBoolean638 = true;
		}
		@Pc(288) String local288 = this.getParameter("worldflags");
		if (local288 != null) {
			try {
				Static41.anInt706 = Integer.parseInt(local288);
			} catch (@Pc(295) Exception local295) {
			}
		}
		@Pc(300) String local300 = this.getParameter("userFlow");
		if (local300 != null) {
			try {
				Static55.aLong30 = Long.parseLong(local300);
			} catch (@Pc(307) NumberFormatException local307) {
			}
		}
		Static19.aString5 = this.getParameter("additionalInfo");
		if (Static19.aString5 != null && Static19.aString5.length() > 50) {
			Static19.aString5 = null;
		}
		Static108.aClient1 = this;
		if (Static191.aClass235_2 == Static24.aClass235_1) {
			Static519.anInt7022 = 765;
			Static363.anInt6413 = 503;
		} else if (Static609.aClass235_7 == Static24.aClass235_1) {
			Static363.anInt6413 = 480;
			Static519.anInt7022 = 640;
		}
		this.method1196(Static238.aClass97_1.method1932() + 32, Static24.aClass235_1.aString101, Static519.anInt7022, Static363.anInt6413);
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1226() {
		@Pc(26) int local26;
		if (Static469.anInt7883 == 7 && Static548.anInt9084 == 0) {
			if (Static443.anInt7473 > 1) {
				Static20.anInt442 = Static278.anInt4551;
				Static443.anInt7473--;
			}
			if (!Static251.aBoolean343) {
				Static313.method4948();
			}
			for (local26 = 0; local26 < 100 && Static277.method4156(); local26++) {
			}
		}
		Static128.anInt2091++;
		Static173.method2667(-1, (Class357) null, -1);
		Static94.method8737(-1, (Class357) null, -1);
		Static528.method7562();
		Static278.anInt4551++;
		for (local26 = 0; local26 < Static108.anInt1716; local26++) {
			@Pc(72) Class14_Sub1_Sub1_Sub3_Sub2 local72 = Static367.aClass5_Sub13Array1[local26].aClass14_Sub1_Sub1_Sub3_Sub2_1;
			if (local72 != null) {
				@Pc(78) byte local78 = local72.aClass271_1.aByte97;
				if ((local78 & 0x1) != 0) {
					@Pc(86) int local86 = local72.method2509();
					@Pc(110) int local110;
					if ((local78 & 0x2) != 0 && local72.anInt2972 == 0 && Math.random() * 1000.0D < 10.0D) {
						local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(118) int local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local110 != 0 || local118 != 0) {
							@Pc(132) int local132 = local72.anIntArray253[0] + local110;
							if (local132 < 0) {
								local132 = 0;
							} else if (Static111.anInt1752 - local86 - 1 < local132) {
								local132 = Static111.anInt1752 - local86 - 1;
							}
							@Pc(163) int local163 = local118 + local72.anIntArray252[0];
							if (local163 < 0) {
								local163 = 0;
							} else if (local163 > Static279.anInt4567 - local86 - 1) {
								local163 = Static279.anInt4567 - local86 - 1;
							}
							@Pc(216) int local216 = Static551.method7788(local86, local72.anIntArray253[0], Static308.aClass182Array1[local72.aByte125], local72.anIntArray252[0], local86, Static202.anIntArray294, true, local86, 0, local163, 0, Static325.anIntArray411, local132, -1);
							if (local216 > 0) {
								if (local216 > 9) {
									local216 = 9;
								}
								for (@Pc(228) int local228 = 0; local228 < local216; local228++) {
									local72.anIntArray253[local228] = Static202.anIntArray294[local216 - local228 - 1];
									local72.anIntArray252[local228] = Static325.anIntArray411[local216 - local228 - 1];
									local72.aByteArray27[local228] = 1;
								}
								local72.anInt2972 = local216;
							}
						}
					}
					Static578.method8155(local72, true);
					local110 = Static542.method7722(local72);
					Static109.method1609(local72);
					Static319.method4977(Static561.anInt9239, local72, local110, Static563.anInt9268);
					Static78.method1248(local72, Static563.anInt9268);
					Static241.method3665(local72);
				}
			}
		}
		if (Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
			if (Static584.anInt9543 == 2) {
				Static590.method8289();
			} else {
				Static270.method4084();
			}
			if (Static70.anInt9231 >> 9 < 14 || Static70.anInt9231 >> 9 >= Static111.anInt1752 - 14 || Static646.anInt10445 >> 9 < 14 || Static646.anInt10445 >> 9 >= Static279.anInt4567 - 14) {
				Static477.method6942();
			}
		}
		while (true) {
			@Pc(361) Class5_Sub9 local361;
			@Pc(366) Class357 local366;
			@Pc(374) Class357 local374;
			do {
				local361 = (Class5_Sub9) Static272.aClass306_17.method7302();
				if (local361 == null) {
					while (true) {
						do {
							local361 = (Class5_Sub9) Static118.aClass306_12.method7302();
							if (local361 == null) {
								while (true) {
									do {
										local361 = (Class5_Sub9) Static297.aClass306_18.method7302();
										if (local361 == null) {
											if (Static629.aClass357_15 != null) {
												Static199.method7027();
											}
											if (Static235.anInt3998 % 1500 == 0) {
												Static298.method2508();
											}
											if (Static469.anInt7883 == 7 && Static548.anInt9084 == 0) {
												Static243.method3690();
											}
											Static363.method5679();
											if (Static383.aBoolean558 && Static27.aLong14 < Static205.method3179() - 60000L) {
												Static159.method2410();
											}
											for (@Pc(537) Class14_Sub2_Sub1 local537 = (Class14_Sub2_Sub1) Static172.aClass363_3.method8484(); local537 != null; local537 = (Class14_Sub2_Sub1) Static172.aClass363_3.method8478()) {
												if (Static205.method3179() / 1000L - 5L > (long) local537.anInt455) {
													if (local537.aShort16 > 0) {
														Static365.method5696(0, local537.aString6 + Static76.aClass58_20.method1237(Static321.anInt5554), "", "", "", 5);
													}
													if (local537.aShort16 == 0) {
														Static365.method5696(0, local537.aString6 + Static76.aClass58_21.method1237(Static321.anInt5554), "", "", "", 5);
													}
													local537.method8904();
												}
											}
											if (Static469.anInt7883 == 7 && Static548.anInt9084 == 0) {
												if (Static487.aClass30_2 == null) {
													Static268.method4076(false);
													return;
												}
												Static294.anInt4739++;
												if (Static294.anInt4739 > 50) {
													@Pc(641) Class5_Sub40 local641 = Static25.method507(Static98.aClass208_2, Static389.aClass181_54);
													Static612.method8496(local641);
												}
												try {
													Static483.method6971();
													return;
												} catch (@Pc(648) IOException local648) {
													Static268.method4076(false);
													return;
												}
											}
											return;
										}
										local366 = local361.aClass357_2;
										if (local366.anInt9846 < 0) {
											break;
										}
										local374 = Static472.method6903(local366.anInt9837);
									} while (local374 == null || local374.aClass357Array2 == null || local374.aClass357Array2.length <= local366.anInt9846 || local366 != local374.aClass357Array2[local366.anInt9846]);
									Static82.method1317(local361);
								}
							}
							local366 = local361.aClass357_2;
							if (local366.anInt9846 < 0) {
								break;
							}
							local374 = Static472.method6903(local366.anInt9837);
						} while (local374 == null || local374.aClass357Array2 == null || local374.aClass357Array2.length <= local366.anInt9846 || local374.aClass357Array2[local366.anInt9846] != local366);
						Static82.method1317(local361);
					}
				}
				local366 = local361.aClass357_2;
				if (local366.anInt9846 < 0) {
					break;
				}
				local374 = Static472.method6903(local366.anInt9837);
			} while (local374 == null || local374.aClass357Array2 == null || local366.anInt9846 >= local374.aClass357Array2.length || local374.aClass357Array2[local366.anInt9846] != local366);
			Static82.method1317(local361);
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1230() {
		if (Static469.anInt7883 == 14) {
			return;
		}
		Static235.anInt3998++;
		if (Static235.anInt3998 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static53.anInt817 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static196.aRandom1.setSeed((long) Static53.anInt817);
		}
		if (Static235.anInt3998 % 50 == 0) {
			Static612.anInt10006 = Static399.anInt6930;
			Static76.anInt1280 = Static401.anInt8427;
			Static399.anInt6930 = 0;
			Static401.anInt8427 = 0;
		}
		this.method1219();
		if (Static267.aClass303_1 != null) {
			Static267.aClass303_1.method7162();
		}
		Static353.method5592();
		Static83.method7213();
		Static600.aClass38_1.method795();
		Static81.aClass13_1.method6353();
		if (Static485.aClass126_17 != null) {
			Static485.aClass126_17.method7053((int) Static205.method3179());
		}
		Static207.method3203();
		Static626.anInt10210 = 0;
		Static451.anInt7590 = 0;
		for (@Pc(101) Interface24 local101 = Static600.aClass38_1.method800(); local101 != null; local101 = Static600.aClass38_1.method800()) {
			@Pc(107) int local107 = local101.method5140();
			if (local107 == 2 || local107 == 3) {
				@Pc(137) char local137 = local101.method5144();
				if (Static371.method4028() && (local137 == '`' || local137 == '§' || local137 == '²')) {
					if (Static192.method7611()) {
						Static503.method3566();
					} else {
						Static57.method963();
					}
				} else if (Static451.anInt7590 < 128) {
					Static451.anInterface24Array4[Static451.anInt7590] = local101;
					Static451.anInt7590++;
				}
			} else if (local107 == 0 && Static626.anInt10210 < 75) {
				Static495.anInterface24Array3[Static626.anInt10210] = local101;
				Static626.anInt10210++;
			}
		}
		Static565.anInt9287 = 0;
		for (@Pc(191) Class5_Sub33 local191 = Static81.aClass13_1.method6348(); local191 != null; local191 = Static81.aClass13_1.method6348()) {
			@Pc(197) int local197 = local191.method6097();
			if (local197 == -1) {
				Static103.aClass306_11.method7303(local191);
			} else if (local197 == 6) {
				Static565.anInt9287 += local191.method6092();
			} else if (Static19.method452(local197)) {
				Static622.aClass306_65.method7303(local191);
				if (Static622.aClass306_65.method7306() > 10) {
					Static622.aClass306_65.method7302();
				}
			}
		}
		if (Static192.method7611()) {
			Static277.method4155();
		}
		if (Static538.method7674(Static469.anInt7883)) {
			Static452.method7477();
			Static619.method8532();
		} else if (Static326.method5072(Static469.anInt7883)) {
			Static362.method5666();
		}
		if (Static454.method6737(Static469.anInt7883) && !Static326.method5072(Static469.anInt7883)) {
			this.method1226();
			Static446.method6618();
			Static599.method8377();
		} else if (Static318.method4969(Static469.anInt7883) && !Static326.method5072(Static469.anInt7883)) {
			this.method1226();
			Static599.method8377();
		} else if (Static469.anInt7883 == 12) {
			Static599.method8377();
		} else if (Static80.method1260(Static469.anInt7883) && !Static326.method5072(Static469.anInt7883)) {
			Static533.method382();
		} else if (Static469.anInt7883 == 13) {
			Static599.method8377();
			if (Static430.anInt7288 != -3 && Static430.anInt7288 != 2 && Static430.anInt7288 != 15) {
				Static268.method4076(false);
			}
		}
		Static289.method4296(Static485.aClass126_17);
		Static622.aClass306_65.method7302();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1202() {
		if (Static458.aBoolean638) {
			Static125.anInt2059 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static110.method1619();
		Static268.aClass94_1 = new Class94(Static214.aClass192_1);
		Static49.aClass331_1 = new Class331();
		Static126.method1887(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static363.aClass346_4 != Static34.aClass346_2) {
			Static641.aByteArrayArray27 = new byte[50][];
		}
		Static627.aClass5_Sub46_31 = Static10.method189();
		if (Static34.aClass346_2 == Static363.aClass346_4) {
			Static518.aClass109_4.aString44 = this.getCodeBase().getHost();
		} else if (Static347.method8141(Static34.aClass346_2)) {
			Static518.aClass109_4.aString44 = this.getCodeBase().getHost();
			Static518.aClass109_4.anInt2759 = Static518.aClass109_4.anInt2756 + 40000;
			Static398.aClass109_3.anInt2759 = Static398.aClass109_3.anInt2756 + 40000;
			Static187.aClass109_1.anInt2759 = Static187.aClass109_1.anInt2756 + 40000;
			Static518.aClass109_4.anInt2758 = Static518.aClass109_4.anInt2756 + 50000;
			Static398.aClass109_3.anInt2758 = Static398.aClass109_3.anInt2756 + 50000;
			Static187.aClass109_1.anInt2758 = Static187.aClass109_1.anInt2756 + 50000;
		} else if (Static28.aClass346_1 == Static34.aClass346_2) {
			Static518.aClass109_4.aString44 = "127.0.0.1";
			Static398.aClass109_3.aString44 = "127.0.0.1";
			Static518.aClass109_4.anInt2759 = Static518.aClass109_4.anInt2756 + 40000;
			Static187.aClass109_1.aString44 = "127.0.0.1";
			Static398.aClass109_3.anInt2759 = Static398.aClass109_3.anInt2756 + 40000;
			Static187.aClass109_1.anInt2759 = Static187.aClass109_1.anInt2756 + 40000;
			Static518.aClass109_4.anInt2758 = Static518.aClass109_4.anInt2756 + 50000;
			Static398.aClass109_3.anInt2758 = Static398.aClass109_3.anInt2756 + 50000;
			Static187.aClass109_1.anInt2758 = Static187.aClass109_1.anInt2756 + 50000;
		}
		if (Static191.aClass235_2 == Static24.aClass235_1) {
			Static69.aBoolean75 = false;
		}
		Static283.aShortArray60 = Static256.aShortArray131 = Static188.aShortArray191 = Static322.aShortArray63 = new short[256];
		Static282.aClass109_2 = Static518.aClass109_4;
		if (Static609.aClass235_7 == Static24.aClass235_1) {
			Static347.aShortArrayArray20 = Static112.aShortArrayArray1;
			Static135.anInt2217 = 16777215;
			Static473.aBoolean660 = true;
			Static538.anInt8954 = 0;
			Static550.aShortArrayArrayArray3 = Static297.aShortArrayArrayArray1;
		} else if (Static447.aClass235_5 == Static24.aClass235_1) {
			Static347.aShortArrayArray20 = Static169.aShortArrayArray4;
			Static550.aShortArrayArrayArray3 = Static445.aShortArrayArrayArray4;
		} else {
			Static347.aShortArrayArray20 = Static526.aShortArrayArray18;
			Static550.aShortArrayArrayArray3 = Static457.aShortArrayArrayArray5;
		}
		try {
			Static177.aClipboard1 = Static108.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(221) Exception local221) {
		}
		Static600.aClass38_1 = Static200.method3154(Static181.aCanvas3);
		Static81.aClass13_1 = Static143.method4227(Static181.aCanvas3);
		try {
			if (Static214.aClass192_1.aClass62_4 != null) {
				Static161.aClass64_1 = new Class64(Static214.aClass192_1.aClass62_4, 5200, 0);
				for (@Pc(243) int local243 = 0; local243 < 37; local243++) {
					Static162.aClass64Array1[local243] = new Class64(Static214.aClass192_1.aClass62Array1[local243], 6000, 0);
				}
				Static467.aClass64_5 = new Class64(Static214.aClass192_1.aClass62_3, 6000, 0);
				Static249.aClass229_1 = new Class229(255, Static161.aClass64_1, Static467.aClass64_5, 500000);
				Static423.aClass64_4 = new Class64(Static214.aClass192_1.aClass62_2, 24, 0);
				Static214.aClass192_1.aClass62_3 = null;
				Static214.aClass192_1.aClass62_2 = null;
				Static214.aClass192_1.aClass62Array1 = null;
				Static214.aClass192_1.aClass62_4 = null;
			}
		} catch (@Pc(301) IOException local301) {
			Static161.aClass64_1 = null;
			Static423.aClass64_4 = null;
			Static467.aClass64_5 = null;
			Static249.aClass229_1 = null;
		}
		if (Static34.aClass346_2 != Static363.aClass346_4) {
			Static125.aBoolean158 = true;
		}
		Static646.aString146 = Static76.aClass58_13.method1237(Static321.anInt5554);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1207() {
		@Pc(15) String local15 = null;
		try {
			local15 = "[1)" + Static113.anInt1785 + "," + Static622.anInt10087 + "," + Static111.anInt1752 + "," + Static279.anInt4567 + "|";
			if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 != null) {
				local15 = local15 + "2)" + Static299.anInt4751 + "," + (Static113.anInt1785 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0]) + "," + (Static622.anInt10087 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0]) + "|";
			}
			local15 = local15 + "3)" + Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() + "|4)" + Static627.aClass5_Sub46_31.aClass11_Sub6_1.method1369() + "|5)" + Static259.method1979() + "|6)" + Static254.anInt4283 + "," + Static438.anInt7403 + "|";
			local15 = local15 + "7)" + Static627.aClass5_Sub46_31.aClass11_Sub11_1.method2927() + "|";
			local15 = local15 + "8)" + Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195() + "|";
			local15 = local15 + "9)" + Static627.aClass5_Sub46_31.aClass11_Sub23_1.method7462() + "|";
			local15 = local15 + "10)" + Static627.aClass5_Sub46_31.aClass11_Sub29_1.method8541() + "|";
			local15 = local15 + "11)" + Static627.aClass5_Sub46_31.aClass11_Sub27_1.method7849() + "|";
			local15 = local15 + "12)" + Static627.aClass5_Sub46_31.aClass11_Sub10_1.method2643() + "|";
			local15 = local15 + "13)" + Static125.anInt2059 + "|";
			local15 = local15 + "14)" + Static469.anInt7883;
			if (Static343.aClass5_Sub28_1 != null) {
				local15 = local15 + "|15)" + Static343.aClass5_Sub28_1.anInt5496;
			}
			try {
				if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 2) {
					@Pc(249) Class local249 = Class.forName("java.lang.ClassLoader");
					@Pc(253) Field local253 = local249.getDeclaredField("nativeLibraries");
					@Pc(256) Class local256 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(266) Method local266 = local256.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local266.invoke(local253, Boolean.TRUE);
					@Pc(289) Vector local289 = (Vector) local253.get(client.class.getClassLoader());
					for (@Pc(291) int local291 = 0; local289.size() > local291; local291++) {
						try {
							@Pc(297) Object local297 = local289.elementAt(local291);
							@Pc(302) Field local302 = local297.getClass().getDeclaredField("name");
							local266.invoke(local302, Boolean.TRUE);
							try {
								@Pc(317) String local317 = (String) local302.get(local297);
								if (local317 != null && local317.indexOf("sw3d.dll") != -1) {
									@Pc(330) Field local330 = local297.getClass().getDeclaredField("handle");
									local266.invoke(local330, Boolean.TRUE);
									local15 = local15 + "|16)" + Long.toHexString(local330.getLong(local297));
									local266.invoke(local330, Boolean.FALSE);
								}
							} catch (@Pc(366) Throwable local366) {
							}
							local266.invoke(local302, Boolean.FALSE);
						} catch (@Pc(378) Throwable local378) {
						}
					}
				}
			} catch (@Pc(386) Throwable local386) {
			}
			local15 = local15 + "]";
		} catch (@Pc(397) Throwable local397) {
		}
		return local15;
	}
}
