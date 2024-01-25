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
				Static126.method1975("Argument count");
			}
			Static90.aClass365_2 = new Class365();
			Static90.aClass365_2.anInt9973 = Integer.parseInt(arg0[0]);
			Static515.aClass365_4 = new Class365();
			Static515.aClass365_4.anInt9973 = Integer.parseInt(arg0[1]);
			Static457.aClass365_5 = new Class365();
			Static457.aClass365_5.anInt9973 = Integer.parseInt(arg0[2]);
			Static99.aClass267_3 = Static223.aClass267_5;
			if (arg0[3].equals("live")) {
				Static541.aClass103_5 = Static58.aClass103_1;
			} else if (arg0[3].equals("rc")) {
				Static541.aClass103_5 = Static359.aClass103_4;
			} else if (arg0[3].equals("wip")) {
				Static541.aClass103_5 = Static196.aClass103_2;
			} else {
				Static126.method1975("modewhat");
			}
			Static259.anInt4113 = Static154.method2277(arg0[4]);
			if (Static259.anInt4113 == -1) {
				if (arg0[4].equals("english")) {
					Static259.anInt4113 = 0;
				} else if (arg0[4].equals("german")) {
					Static259.anInt4113 = 1;
				} else {
					Static126.method1975("language");
				}
			}
			Static240.aBoolean272 = false;
			Static394.aBoolean491 = false;
			if (arg0[5].equals("game0")) {
				Static591.aClass174_7 = Static137.aClass174_1;
			} else if (arg0[5].equals("game1")) {
				Static591.aClass174_7 = Static478.aClass174_6;
			} else if (arg0[5].equals("game2")) {
				Static591.aClass174_7 = Static243.aClass174_2;
			} else if (arg0[5].equals("game3")) {
				Static591.aClass174_7 = Static425.aClass174_5;
			} else {
				Static126.method1975("game");
			}
			Static21.anInt150 = Static591.aClass174_7.anInt4124;
			Static471.aString82 = "";
			Static577.aString98 = null;
			Static570.aBoolean678 = true;
			Static513.aBoolean630 = true;
			Static183.aBoolean251 = false;
			Static222.anInt3544 = 0;
			Static328.aString57 = null;
			Static55.aLong47 = 0L;
			Static312.anInt5547 = 0;
			Static464.aBoolean586 = false;
			Static276.anInt4337 = 0;
			@Pc(188) client local188 = new client();
			Static437.aClient1 = local188;
			local188.method1250(Static591.aClass174_7.aString37, Static541.aClass103_5.method2065() + 32);
			Static634.aFrame5.setLocation(40, 40);
		} catch (@Pc(212) Exception local212) {
			Static17.method268((String) null, local212);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1245() {
		if (Static464.aBoolean586) {
			Static126.anInt2180 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static665.method6311();
		Static280.aClass52_2 = new Class52(Static150.aClass202_2);
		Static589.aClass288_3 = new Class288();
		Static45.method619(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static99.aClass267_3 != Static71.aClass267_2) {
			Static185.aByteArrayArray9 = new byte[50][];
		}
		Static655.aClass5_Sub36_29 = Static235.method3369();
		if (Static71.aClass267_2 == Static99.aClass267_3) {
			Static90.aClass365_2.aString112 = this.getCodeBase().getHost();
		} else if (Static360.method5291(Static99.aClass267_3)) {
			Static90.aClass365_2.aString112 = this.getCodeBase().getHost();
			Static90.aClass365_2.anInt9967 = Static90.aClass365_2.anInt9973 + 40000;
			Static515.aClass365_4.anInt9967 = Static515.aClass365_4.anInt9973 + 40000;
			Static90.aClass365_2.anInt9970 = Static90.aClass365_2.anInt9973 + 50000;
			Static457.aClass365_5.anInt9967 = Static457.aClass365_5.anInt9973 + 40000;
			Static515.aClass365_4.anInt9970 = Static515.aClass365_4.anInt9973 + 50000;
			Static457.aClass365_5.anInt9970 = Static457.aClass365_5.anInt9973 + 50000;
		} else if (Static99.aClass267_3 == Static223.aClass267_5) {
			Static90.aClass365_2.aString112 = "127.0.0.1";
			Static515.aClass365_4.aString112 = "127.0.0.1";
			Static90.aClass365_2.anInt9967 = Static90.aClass365_2.anInt9973 + 40000;
			Static457.aClass365_5.aString112 = "127.0.0.1";
			Static515.aClass365_4.anInt9967 = Static515.aClass365_4.anInt9973 + 40000;
			Static457.aClass365_5.anInt9967 = Static457.aClass365_5.anInt9973 + 40000;
			Static90.aClass365_2.anInt9970 = Static90.aClass365_2.anInt9973 + 50000;
			Static515.aClass365_4.anInt9970 = Static515.aClass365_4.anInt9973 + 50000;
			Static457.aClass365_5.anInt9970 = Static457.aClass365_5.anInt9973 + 50000;
		}
		if (Static591.aClass174_7 == Static137.aClass174_1) {
			Static490.aBoolean609 = false;
		}
		Static6.aClass365_1 = Static90.aClass365_2;
		if (Static478.aClass174_6 == Static591.aClass174_7) {
			Static326.anInt5966 = 16777215;
			Static424.anInt7534 = 0;
			Static469.aShortArrayArrayArray4 = Static254.aShortArrayArrayArray3;
			Static544.aShortArrayArray16 = Static574.aShortArrayArray17;
			Static464.aBoolean585 = true;
		} else if (Static591.aClass174_7 == Static425.aClass174_5) {
			Static544.aShortArrayArray16 = Static274.aShortArrayArray12;
			Static469.aShortArrayArrayArray4 = Static153.aShortArrayArrayArray2;
		} else {
			Static469.aShortArrayArrayArray4 = Static65.aShortArrayArrayArray1;
			Static544.aShortArrayArray16 = Static75.aShortArrayArray4;
		}
		Static25.aShortArray5 = Static677.aShortArray160 = Static198.aShortArray43 = Static77.aShortArray9 = new short[256];
		try {
			Static200.aClipboard1 = Static437.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(229) Exception local229) {
		}
		Static176.aClass157_1 = Static10.method171(Static105.aCanvas2);
		Static178.aClass111_1 = Static498.method7219(Static105.aCanvas2);
		try {
			if (Static150.aClass202_2.aClass281_3 != null) {
				Static187.aClass85_2 = new Class85(Static150.aClass202_2.aClass281_3, 5200, 0);
				for (@Pc(251) int local251 = 0; local251 < 37; local251++) {
					Static474.aClass85Array1[local251] = new Class85(Static150.aClass202_2.aClass281Array1[local251], 6000, 0);
				}
				Static4.aClass85_1 = new Class85(Static150.aClass202_2.aClass281_4, 6000, 0);
				Static666.aClass287_4 = new Class287(255, Static187.aClass85_2, Static4.aClass85_1, 500000);
				Static405.aClass85_3 = new Class85(Static150.aClass202_2.aClass281_2, 24, 0);
				Static150.aClass202_2.aClass281_2 = null;
				Static150.aClass202_2.aClass281Array1 = null;
				Static150.aClass202_2.aClass281_3 = null;
				Static150.aClass202_2.aClass281_4 = null;
			}
		} catch (@Pc(307) IOException local307) {
			Static4.aClass85_1 = null;
			Static405.aClass85_3 = null;
			Static187.aClass85_2 = null;
			Static666.aClass287_4 = null;
		}
		if (Static71.aClass267_2 != Static99.aClass267_3) {
			Static451.aBoolean575 = true;
		}
		Static391.aString69 = Static49.aClass42_12.method730(Static259.anInt4113);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1264() {
		if (Static539.anInt8853 == 14) {
			return;
		}
		@Pc(19) long local19 = Static6.method142() / 1000000L - Static216.aLong124;
		Static216.aLong124 = Static6.method142() / 1000000L;
		@Pc(27) boolean local27 = Static157.method2376();
		if (local27 && Static26.aBoolean13 && Static549.aClass107_3 != null) {
			Static549.aClass107_3.method8597();
		}
		if (Static115.method1839(Static539.anInt8853)) {
			if (Static398.aLong207 != 0L && Static398.aLong207 < Static124.method1947()) {
				Static113.method1830(Static420.anInt7183, Static581.method7952(), Static397.anInt6904, false);
			} else if (!Static563.aClass143_13.method6207() && Static571.aBoolean679) {
				Static535.method8704();
			}
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (Static518.aFrame4 == null) {
			@Pc(75) Container local75;
			if (Static634.aFrame5 != null) {
				local75 = Static634.aFrame5;
			} else if (Static285.anApplet5 == null) {
				local75 = Static279.anApplet_Sub1_1;
			} else {
				local75 = Static285.anApplet5;
			}
			local89 = local75.getSize().width;
			local93 = local75.getSize().height;
			if (Static634.aFrame5 == local75) {
				@Pc(99) Insets local99 = Static634.aFrame5.getInsets();
				local89 -= local99.right + local99.left;
				local93 -= local99.bottom + local99.top;
			}
			if (Static197.anInt3210 != local89 || Static267.anInt4239 != local93 || Static446.aBoolean570) {
				if (Static563.aClass143_13 == null || Static563.aClass143_13.method6214()) {
					Static665.method6311();
				} else {
					Static197.anInt3210 = local89;
					Static267.anInt4239 = local93;
				}
				Static398.aLong207 = Static124.method1947() + 500L;
				Static446.aBoolean570 = false;
			}
		}
		if (Static518.aFrame4 != null && !Static324.aBoolean434 && Static115.method1839(Static539.anInt8853)) {
			Static113.method1830(-1, Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866(), -1, false);
		}
		@Pc(162) boolean local162 = false;
		if (Static594.aBoolean710) {
			local162 = true;
			Static594.aBoolean710 = false;
		}
		if (local162) {
			Static587.method8002();
		}
		if (Static563.aClass143_13 != null && Static563.aClass143_13.method6207() || Static581.method7952() != 1) {
			Static212.method3058();
		}
		if (Static316.method6935(Static539.anInt8853)) {
			Static515.method3299(local162);
		} else if (Static357.method5270(Static539.anInt8853)) {
			Static275.method3830();
		} else if (Static461.method6842(Static539.anInt8853)) {
			Static275.method3830();
		} else if (Static553.method7612(Static539.anInt8853)) {
			if (Static260.anInt4118 == 1) {
				if (Static499.anInt8510 < Static392.anInt6775) {
					Static499.anInt8510 = Static392.anInt6775;
				}
				local89 = (Static499.anInt8510 - Static392.anInt6775) * 50 / Static499.anInt8510;
				Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, true, Static49.aClass42_12.method730(Static259.anInt4113) + "<br>(" + local89 + "%)");
			} else if (Static260.anInt4118 == 2) {
				if (Static3.anInt23 > Static643.anInt10180) {
					Static643.anInt10180 = Static3.anInt23;
				}
				local89 = (Static643.anInt10180 - Static3.anInt23) * 50 / Static643.anInt10180 + 50;
				Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, true, Static49.aClass42_12.method730(Static259.anInt4113) + "<br>(" + local89 + "%)");
			} else {
				Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, true, Static49.aClass42_12.method730(Static259.anInt4113));
			}
		} else if (Static539.anInt8853 == 10) {
			Static377.method5545(local19);
		} else if (Static539.anInt8853 == 13) {
			Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, false, Static49.aClass42_14.method730(Static259.anInt4113) + "<br>" + Static49.aClass42_15.method730(Static259.anInt4113));
		}
		if (Static325.anInt5947 == 3) {
			for (local89 = 0; local89 < Static283.anInt4411; local89++) {
				@Pc(356) Rectangle local356 = Class305.aRectangleArray1[local89];
				if (Static224.aBooleanArray6[local89]) {
					Static563.aClass143_13.method6235(local356.y, local356.width, local356.height, -65281, local356.x);
				} else if (Static209.aBooleanArray4[local89]) {
					Static563.aClass143_13.method6235(local356.y, local356.width, local356.height, -65536, local356.x);
				} else {
					Static563.aClass143_13.method6235(local356.y, local356.width, local356.height, -16711936, local356.x);
				}
			}
		}
		if (Static384.method5635()) {
			Static212.method3063(Static563.aClass143_13);
		}
		if (Static150.aClass202_2.aBoolean386 && Static115.method1839(Static539.anInt8853) && Static325.anInt5947 == 0 && Static581.method7952() == 1 && !local162) {
			local89 = 0;
			for (local93 = 0; local93 < Static283.anInt4411; local93++) {
				if (Static209.aBooleanArray4[local93]) {
					Static209.aBooleanArray4[local93] = false;
					Static630.aRectangleArray2[local89++] = Class305.aRectangleArray1[local93];
				}
			}
			try {
				if (Static305.aBoolean315) {
					Static581.method7950(Static630.aRectangleArray2, local89);
				} else {
					Static563.aClass143_13.method6251(local89, Static630.aRectangleArray2);
				}
			} catch (@Pc(518) Exception_Sub1 local518) {
			}
		} else if (!Static316.method6935(Static539.anInt8853)) {
			for (local89 = 0; local89 < Static283.anInt4411; local89++) {
				Static209.aBooleanArray4[local89] = false;
			}
			try {
				if (Static305.aBoolean315) {
					Static573.method7838();
				} else {
					Static563.aClass143_13.method6201();
				}
			} catch (@Pc(456) Exception_Sub1 local456) {
				Static17.method268(local456.getMessage() + " (Recovered) " + this.method1248(), local456);
				Static75.method1101(false, 0);
			}
		}
		Static119.method1904();
		local89 = Static655.aClass5_Sub36_29.aClass2_Sub1_1.method37();
		if (local89 == 0) {
			Static127.method1985(15L);
		} else if (local89 == 1) {
			Static127.method1985(10L);
		} else if (local89 == 2) {
			Static127.method1985(5L);
		} else if (local89 == 3) {
			Static127.method1985(2L);
		}
		if (Static661.aBoolean757) {
			Static570.method7816();
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub9_1.method3783() == 1 && Static539.anInt8853 == 3 && Static131.anInt2222 != -1) {
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub9_1, 0);
			Static185.method2703();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1251() {
		if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 2) {
			this.method1264();
			return;
		}
		try {
			this.method1264();
		} catch (@Pc(24) ThreadDeath local24) {
			throw local24;
		} catch (@Pc(27) Throwable local27) {
			Static17.method268(local27.getMessage() + " (Recovered) " + this.method1248(), local27);
			Static239.aBoolean271 = true;
			Static75.method1101(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1265() {
		@Pc(15) boolean local15 = Static589.aClass288_3.method7040();
		if (!local15) {
			this.method1267();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1257() {
		if (Static439.aBoolean565) {
			Static267.method3773();
		}
		Static550.method7597();
		if (Static563.aClass143_13 != null) {
			Static563.aClass143_13.method6225();
		}
		if (Static518.aFrame4 != null) {
			Static419.method6179(Static150.aClass202_2, Static518.aFrame4);
			Static518.aFrame4 = null;
		}
		if (Static537.aClass240_34 != null) {
			Static537.aClass240_34.method5658();
			Static537.aClass240_34 = null;
		}
		Static287.method3971();
		Static589.aClass288_3.method7051();
		Static280.aClass52_2.method946();
		if (Static548.aClass231_1 != null) {
			Static548.aClass231_1.method5371();
			Static548.aClass231_1 = null;
		}
		try {
			Static187.aClass85_2.method1848();
			for (@Pc(57) int local57 = 0; local57 < 37; local57++) {
				Static474.aClass85Array1[local57].method1848();
			}
			Static4.aClass85_1.method1848();
			Static405.aClass85_3.method1848();
			Static254.method3576();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1267() {
		if (Static589.aClass288_3.anInt8301 > Static213.anInt3440) {
			Static6.aClass365_1.method8293();
			Static609.anInt9836 = (Static589.aClass288_3.anInt8301 * 50 - 50) * 5;
			if (Static609.anInt9836 > 3000) {
				Static609.anInt9836 = 3000;
			}
			if (Static589.aClass288_3.anInt8301 >= 2 && Static589.aClass288_3.anInt8302 == 6) {
				this.method1255("js5connect_outofdate");
				Static539.anInt8853 = 14;
				return;
			}
			if (Static589.aClass288_3.anInt8301 >= 4 && Static589.aClass288_3.anInt8302 == -1) {
				this.method1255("js5crc");
				Static539.anInt8853 = 14;
				return;
			}
			if (Static589.aClass288_3.anInt8301 >= 4 && Static316.method6935(Static539.anInt8853)) {
				if (Static589.aClass288_3.anInt8302 == 7 || Static589.aClass288_3.anInt8302 == 9) {
					this.method1255("js5connect_full");
				} else if (Static589.aClass288_3.anInt8302 <= 0) {
					this.method1255("js5io");
				} else if (Static58.aString7 == null) {
					this.method1255("js5connect");
				} else {
					this.method1255("js5proxy_" + Static58.aString7.trim());
				}
				Static539.anInt8853 = 14;
				return;
			}
		}
		Static213.anInt3440 = Static589.aClass288_3.anInt8301;
		if (Static609.anInt9836 > 0) {
			Static609.anInt9836--;
			return;
		}
		try {
			if (Static170.anInt2805 == 0) {
				Static443.aClass297_5 = Static6.aClass365_1.method8291(Static150.aClass202_2);
				Static170.anInt2805++;
			}
			if (Static170.anInt2805 == 1) {
				if (Static443.aClass297_5.anInt8459 == 2) {
					if (Static443.aClass297_5.anObject15 != null) {
						Static58.aString7 = (String) Static443.aClass297_5.anObject15;
					}
					this.method1275(1000);
					return;
				}
				if (Static443.aClass297_5.anInt8459 == 1) {
					Static170.anInt2805++;
				}
			}
			if (Static170.anInt2805 == 2) {
				Static657.aClass289_2 = new Class289((Socket) Static443.aClass297_5.anObject15, Static150.aClass202_2, 25000);
				@Pc(194) Class5_Sub15 local194 = new Class5_Sub15(5);
				local194.method3651(Static304.aClass208_2.anInt5598);
				local194.method3679(644);
				Static657.aClass289_2.method7057(local194.aByteArray45, 5);
				Static170.anInt2805++;
				Static34.aLong38 = Static124.method1947();
			}
			if (Static170.anInt2805 == 3) {
				if (Static316.method6935(Static539.anInt8853) || Static657.aClass289_2.method7056() > 0) {
					@Pc(232) int local232 = Static657.aClass289_2.method7055();
					if (local232 != 0) {
						this.method1275(local232);
						return;
					}
					Static170.anInt2805++;
				} else if (Static124.method1947() - Static34.aLong38 > 30000L) {
					this.method1275(1001);
					return;
				}
			}
			if (Static170.anInt2805 == 4) {
				@Pc(281) boolean local281 = Static316.method6935(Static539.anInt8853) || Static576.method7860(Static539.anInt8853) || Static385.method5648(Static539.anInt8853);
				@Pc(284) Class66[] local284 = Static85.method1309();
				@Pc(292) Class5_Sub15 local292 = new Class5_Sub15(local284.length * 4);
				Static657.aClass289_2.method7062(local292.aByteArray45.length, 0, local292.aByteArray45);
				for (@Pc(303) int local303 = 0; local303 < local284.length; local303++) {
					local284[local303].method1310(local292.method3671());
				}
				Static589.aClass288_3.method7044(Static657.aClass289_2, !local281);
				Static443.aClass297_5 = null;
				Static170.anInt2805 = 0;
				Static657.aClass289_2 = null;
			}
		} catch (@Pc(339) IOException local339) {
			this.method1275(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1256() {
		if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() != 2) {
			this.method1278();
			return;
		}
		try {
			this.method1278();
		} catch (@Pc(28) ThreadDeath local28) {
			throw local28;
		} catch (@Pc(31) Throwable local31) {
			Static17.method268(local31.getMessage() + " (Recovered) " + this.method1248(), local31);
			Static239.aBoolean271 = true;
			Static75.method1101(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method1263() {
		if (Static285.anApplet5 != null && Static105.aCanvas2 == null && !Static150.aClass202_2.aBoolean386) {
			try {
				@Pc(13) Class local13 = Static285.anApplet5.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static105.aCanvas2 = (Canvas) local17.get(Static285.anApplet5);
				local17.set(Static285.anApplet5, (Object) null);
				if (Static105.aCanvas2 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1263();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1252()) {
			return;
		}
		Static90.aClass365_2 = new Class365();
		Static90.aClass365_2.anInt9973 = Integer.parseInt(this.getParameter("worldid"));
		Static515.aClass365_4 = new Class365();
		Static515.aClass365_4.anInt9973 = Integer.parseInt(this.getParameter("lobbyid"));
		Static515.aClass365_4.aString112 = this.getParameter("lobbyaddress");
		Static457.aClass365_5 = new Class365();
		Static457.aClass365_5.anInt9973 = Integer.parseInt(this.getParameter("demoid"));
		Static457.aClass365_5.aString112 = this.getParameter("demoaddress");
		Static99.aClass267_3 = Static359.method4147(Integer.parseInt(this.getParameter("modewhere")));
		if (Static223.aClass267_5 == Static99.aClass267_3) {
			Static99.aClass267_3 = Static619.aClass267_7;
		} else if (!Static360.method5291(Static99.aClass267_3) && Static71.aClass267_2 != Static99.aClass267_3) {
			Static99.aClass267_3 = Static71.aClass267_2;
		}
		Static541.aClass103_5 = Static508.method7315(Integer.parseInt(this.getParameter("modewhat")));
		if (Static541.aClass103_5 != Static196.aClass103_2 && Static541.aClass103_5 != Static359.aClass103_4 && Static541.aClass103_5 != Static58.aClass103_1) {
			Static541.aClass103_5 = Static58.aClass103_1;
		}
		try {
			Static259.anInt4113 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static259.anInt4113 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static240.aBoolean272 = true;
		} else {
			Static240.aBoolean272 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static394.aBoolean491 = true;
		} else {
			Static394.aBoolean491 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static28.aBoolean15 = true;
		} else {
			Static28.aBoolean15 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static591.aClass174_7 = Static137.aClass174_1;
			} else if (local152.equals("1")) {
				Static591.aClass174_7 = Static478.aClass174_6;
			} else if (local152.equals("2")) {
				Static591.aClass174_7 = Static243.aClass174_2;
			} else if (local152.equals("3")) {
				Static591.aClass174_7 = Static425.aClass174_5;
			}
		}
		try {
			Static312.anInt5547 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static312.anInt5547 = 0;
		}
		Static440.aString77 = this.getParameter("quiturl");
		Static471.aString82 = this.getParameter("settings");
		if (Static471.aString82 == null) {
			Static471.aString82 = "";
		}
		Static418.aBoolean512 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static222.anInt3544 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static222.anInt3544 = 0;
			}
		}
		Static21.anInt150 = Integer.parseInt(this.getParameter("colourid"));
		if (Static21.anInt150 < 0 || Static4.aColorArray1.length <= Static21.anInt150) {
			Static21.anInt150 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static570.aBoolean678 = true;
			Static513.aBoolean630 = true;
		}
		@Pc(252) String local252 = this.getParameter("frombilling");
		if (local252 != null && local252.equals("true")) {
			Static183.aBoolean251 = true;
		}
		Static328.aString57 = this.getParameter("sskey");
		if (Static328.aString57 != null && Static328.aString57.length() < 2) {
			Static328.aString57 = null;
		}
		@Pc(278) String local278 = this.getParameter("force64mb");
		if (local278 != null && local278.equals("true")) {
			Static464.aBoolean586 = true;
		}
		@Pc(290) String local290 = this.getParameter("worldflags");
		if (local290 != null) {
			try {
				Static276.anInt4337 = Integer.parseInt(local290);
			} catch (@Pc(297) Exception local297) {
			}
		}
		@Pc(302) String local302 = this.getParameter("userFlow");
		if (local302 != null) {
			try {
				Static55.aLong47 = Long.parseLong(local302);
			} catch (@Pc(309) NumberFormatException local309) {
			}
		}
		Static577.aString98 = this.getParameter("additionalInfo");
		if (Static577.aString98 != null && Static577.aString98.length() > 50) {
			Static577.aString98 = null;
		}
		if (Static591.aClass174_7 == Static137.aClass174_1) {
			Static345.anInt6198 = 765;
			Static427.anInt10577 = 503;
		} else if (Static591.aClass174_7 == Static478.aClass174_6) {
			Static345.anInt6198 = 640;
			Static427.anInt10577 = 480;
		}
		Static437.aClient1 = this;
		this.method1261(Static591.aClass174_7.aString37, Static541.aClass103_5.method2065() + 32, Static427.anInt10577, Static345.anInt6198);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1275(@OriginalArg(0) int arg0) {
		Static589.aClass288_3.anInt8301++;
		Static170.anInt2805 = 0;
		Static657.aClass289_2 = null;
		Static443.aClass297_5 = null;
		Static589.aClass288_3.anInt8302 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1277() {
		@Pc(32) int local32;
		if (Static539.anInt8853 == 7 && Static16.anInt9847 == 0) {
			if (Static563.anInt9175 > 1) {
				Static658.anInt9448 = Static293.anInt4549;
				Static563.anInt9175--;
			}
			if (!Static423.aBoolean549) {
				Static301.method4088();
			}
			for (local32 = 0; local32 < 100 && Static125.method1953(); local32++) {
			}
		}
		Static648.anInt10220++;
		Static655.method8587((Class394) null, -1, -1);
		Static178.method2615(-1, (Class394) null, -1);
		Static621.method8304();
		Static293.anInt4549++;
		for (local32 = 0; local32 < Static562.anInt9155; local32++) {
			@Pc(72) Class41_Sub1_Sub1_Sub3_Sub1 local72 = Static278.aClass5_Sub34Array1[local32].aClass41_Sub1_Sub1_Sub3_Sub1_1;
			if (local72 != null) {
				@Pc(78) byte local78 = local72.aClass311_1.aByte107;
				if ((local78 & 0x1) != 0) {
					@Pc(86) int local86 = local72.method7917();
					@Pc(110) int local110;
					if ((local78 & 0x2) != 0 && local72.anInt9526 == 0 && Math.random() * 1000.0D < 10.0D) {
						local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(118) int local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local110 != 0 || local118 != 0) {
							@Pc(133) int local133 = local72.anIntArray528[0] + local110;
							if (local133 < 0) {
								local133 = 0;
							} else if (Static124.anInt2150 - local86 - 1 < local133) {
								local133 = Static124.anInt2150 - local86 - 1;
							}
							@Pc(165) int local165 = local72.anIntArray527[0] + local118;
							if (local165 < 0) {
								local165 = 0;
							} else if (local165 > Static64.anInt1015 - local86 - 1) {
								local165 = Static64.anInt1015 - local86 - 1;
							}
							@Pc(216) int local216 = Static170.method2525(local133, local86, local86, local72.anIntArray528[0], -1, Static137.aClass234Array1[local72.aByte149], Static273.anIntArray256, 0, 0, true, Static502.anIntArray465, local72.anIntArray527[0], local86, local165);
							if (local216 > 0) {
								if (local216 > 9) {
									local216 = 9;
								}
								for (@Pc(230) int local230 = 0; local230 < local216; local230++) {
									local72.anIntArray528[local230] = Static273.anIntArray256[local216 - local230 - 1];
									local72.anIntArray527[local230] = Static502.anIntArray465[local216 - local230 - 1];
									local72.aByteArray90[local230] = 1;
								}
								local72.anInt9526 = local216;
							}
						}
					}
					Static149.method2218(local72, true);
					local110 = Static57.method859(local72);
					Static224.method3189(local72);
					Static53.method3584(Static652.anInt10280, Static194.anInt10095, local110, local72);
					Static413.method6083(local72, Static194.anInt10095);
					Static411.method6069(local72);
				}
			}
		}
		if (Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
			if (Static133.anInt2254 == 2) {
				Static516.method3867();
			} else {
				Static362.method5336();
			}
			if (Static570.anInt9347 >> 9 < 14 || Static124.anInt2150 - 14 <= Static570.anInt9347 >> 9 || Static105.anInt1868 >> 9 < 14 || Static105.anInt1868 >> 9 >= Static64.anInt1015 - 14) {
				Static197.method2805();
			}
		}
		while (true) {
			@Pc(346) Class5_Sub28 local346;
			@Pc(351) Class394 local351;
			@Pc(362) Class394 local362;
			do {
				local346 = (Class5_Sub28) Static102.aClass124_14.method2571();
				if (local346 == null) {
					while (true) {
						do {
							local346 = (Class5_Sub28) Static311.aClass124_49.method2571();
							if (local346 == null) {
								while (true) {
									do {
										local346 = (Class5_Sub28) Static259.aClass124_40.method2571();
										if (local346 == null) {
											if (Static610.aClass394_12 != null) {
												Static305.method4160();
											}
											if (Static421.anInt7434 % 1500 == 0) {
												Static347.method5212();
											}
											if (Static539.anInt8853 == 7 && Static16.anInt9847 == 0) {
												Static543.method7515();
											}
											Static178.method2619();
											if (Static439.aBoolean565 && Static3.aLong1 < Static124.method1947() - 60000L) {
												Static267.method3773();
											}
											for (@Pc(530) Class41_Sub4_Sub2 local530 = (Class41_Sub4_Sub2) Static508.aClass102_8.method2062(); local530 != null; local530 = (Class41_Sub4_Sub2) Static508.aClass102_8.method2054()) {
												if (Static124.method1947() / 1000L - 5L > (long) local530.anInt7654) {
													if (local530.aShort90 > 0) {
														Static423.method6423(5, 0, local530.aString74 + Static49.aClass42_19.method730(Static259.anInt4113), "", "", "");
													}
													if (local530.aShort90 == 0) {
														Static423.method6423(5, 0, local530.aString74 + Static49.aClass42_20.method730(Static259.anInt4113), "", "", "");
													}
													local530.method8644();
												}
											}
											if (Static539.anInt8853 == 7 && Static16.anInt9847 == 0) {
												if (Static537.aClass240_34 == null) {
													Static162.method6698(false);
													return;
												}
												Static53.anInt4077++;
												if (Static53.anInt4077 > 50) {
													@Pc(640) Class5_Sub16 local640 = Static455.method6717(Static544.aClass187_83, Static16.aClass332_8);
													Static479.method7038(local640);
												}
												try {
													Static652.method8576();
													return;
												} catch (@Pc(647) IOException local647) {
													Static162.method6698(false);
													return;
												}
											}
											return;
										}
										local351 = local346.aClass394_2;
										if (local351.anInt10502 < 0) {
											break;
										}
										local362 = Static238.method3422(local351.anInt10530);
									} while (local362 == null || local362.aClass394Array2 == null || local362.aClass394Array2.length <= local351.anInt10502 || local351 != local362.aClass394Array2[local351.anInt10502]);
									Static497.method7205(local346);
								}
							}
							local351 = local346.aClass394_2;
							if (local351.anInt10502 < 0) {
								break;
							}
							local362 = Static238.method3422(local351.anInt10530);
						} while (local362 == null || local362.aClass394Array2 == null || local351.anInt10502 >= local362.aClass394Array2.length || local351 != local362.aClass394Array2[local351.anInt10502]);
						Static497.method7205(local346);
					}
				}
				local351 = local346.aClass394_2;
				if (local351.anInt10502 < 0) {
					break;
				}
				local362 = Static238.method3422(local351.anInt10530);
			} while (local362 == null || local362.aClass394Array2 == null || local362.aClass394Array2.length <= local351.anInt10502 || local351 != local362.aClass394Array2[local351.anInt10502]);
			Static497.method7205(local346);
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method1278() {
		if (Static539.anInt8853 == 14) {
			return;
		}
		Static421.anInt7434++;
		if (Static421.anInt7434 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static608.anInt9821 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static163.aRandom1.setSeed((long) Static608.anInt9821);
		}
		if (Static421.anInt7434 % 50 == 0) {
			Static539.anInt8855 = Static126.anInt2181;
			Static126.anInt2181 = 0;
			Static113.anInt2020 = Static411.anInt7046;
			Static411.anInt7046 = 0;
		}
		this.method1265();
		if (Static469.aClass291_1 != null) {
			Static469.aClass291_1.method7096();
		}
		Static44.method612();
		Static516.method3866();
		Static176.aClass157_1.method3302();
		Static178.aClass111_1.method8698();
		if (Static563.aClass143_13 != null) {
			Static563.aClass143_13.method6239((int) Static124.method1947());
		}
		Static6.method145();
		Static358.anInt6287 = 0;
		Static225.anInt3592 = 0;
		for (@Pc(98) Interface18 local98 = Static176.aClass157_1.method3298(); local98 != null; local98 = Static176.aClass157_1.method3298()) {
			@Pc(106) int local106 = local98.method5311();
			if (local106 == 2 || local106 == 3) {
				@Pc(133) char local133 = local98.method5313();
				if (Static284.method3903() && (local133 == '`' || local133 == '§' || local133 == '²')) {
					if (Static384.method5635()) {
						Static531.method7414();
					} else {
						Static165.method2443();
					}
				} else if (Static358.anInt6287 < 128) {
					Static90.anInterface18Array1[Static358.anInt6287] = local98;
					Static358.anInt6287++;
				}
			} else if (local106 == 0 && Static225.anInt3592 < 75) {
				Static421.anInterface18Array2[Static225.anInt3592] = local98;
				Static225.anInt3592++;
			}
		}
		Static145.anInt2413 = 0;
		for (@Pc(185) Class5_Sub25 local185 = Static178.aClass111_1.method8702(); local185 != null; local185 = Static178.aClass111_1.method8702()) {
			@Pc(191) int local191 = local185.method3318();
			if (local191 == -1) {
				Static364.aClass124_62.method2574(local185);
			} else if (local191 == 6) {
				Static145.anInt2413 += local185.method3316();
			} else if (Static34.method453(local191)) {
				Static598.aClass124_96.method2574(local185);
				if (Static598.aClass124_96.method2568() > 10) {
					Static598.aClass124_96.method2571();
				}
			}
		}
		if (Static384.method5635()) {
			Static280.method3889();
		}
		if (Static316.method6935(Static539.anInt8853)) {
			Static126.method1977();
			Static661.method8631();
		} else if (Static553.method7612(Static539.anInt8853)) {
			Static462.method6846();
		}
		if (Static576.method7860(Static539.anInt8853) && !Static553.method7612(Static539.anInt8853)) {
			this.method1277();
			Static93.method1447();
			Static328.method5096();
		} else if (Static385.method5648(Static539.anInt8853) && !Static553.method7612(Static539.anInt8853)) {
			this.method1277();
			Static328.method5096();
		} else if (Static539.anInt8853 == 12) {
			Static328.method5096();
		} else if (Static427.method8766(Static539.anInt8853) && !Static553.method7612(Static539.anInt8853)) {
			Static470.method6956();
		} else if (Static539.anInt8853 == 13) {
			Static328.method5096();
			if (Static489.anInt8413 != -3 && Static489.anInt8413 != 2 && Static489.anInt8413 != 15) {
				Static162.method6698(false);
			}
		}
		Static335.method5151(Static563.aClass143_13);
		Static598.aClass124_96.method2571();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1253() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1248() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static454.anInt7910 + "," + Static48.anInt750 + "," + Static124.anInt2150 + "," + Static64.anInt1015 + "|";
			if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 != null) {
				local5 = local5 + "2)" + Static458.anInt7955 + "," + (Static454.anInt7910 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0]) + "," + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] + Static48.anInt750) + "|";
			}
			local5 = local5 + "3)" + Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() + "|4)" + Static655.aClass5_Sub36_29.aClass2_Sub28_2.method8721() + "|5)" + Static581.method7952() + "|6)" + Static563.anInt9176 + "," + Static316.anInt8165 + "|";
			local5 = local5 + "7)" + Static655.aClass5_Sub36_29.aClass2_Sub16_1.method6973() + "|";
			local5 = local5 + "8)" + Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269() + "|";
			local5 = local5 + "9)" + Static655.aClass5_Sub36_29.aClass2_Sub8_1.method3768() + "|";
			local5 = local5 + "10)" + Static655.aClass5_Sub36_29.aClass2_Sub10_1.method3819() + "|";
			local5 = local5 + "11)" + Static655.aClass5_Sub36_29.aClass2_Sub13_1.method6692() + "|";
			local5 = local5 + "12)" + Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() + "|";
			local5 = local5 + "13)" + Static126.anInt2180 + "|";
			local5 = local5 + "14)" + Static539.anInt8853;
			if (Static87.aClass5_Sub30_1 != null) {
				local5 = local5 + "|15)" + Static87.aClass5_Sub30_1.anInt4369;
			}
			try {
				if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 2) {
					@Pc(244) Class local244 = Class.forName("java.lang.ClassLoader");
					@Pc(248) Field local248 = local244.getDeclaredField("nativeLibraries");
					@Pc(251) Class local251 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(261) Method local261 = local251.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local261.invoke(local248, Boolean.TRUE);
					@Pc(284) Vector local284 = (Vector) local248.get(client.class.getClassLoader());
					for (@Pc(286) int local286 = 0; local286 < local284.size(); local286++) {
						try {
							@Pc(291) Object local291 = local284.elementAt(local286);
							@Pc(296) Field local296 = local291.getClass().getDeclaredField("name");
							local261.invoke(local296, Boolean.TRUE);
							try {
								@Pc(311) String local311 = (String) local296.get(local291);
								if (local311 != null && local311.indexOf("sw3d.dll") != -1) {
									@Pc(324) Field local324 = local291.getClass().getDeclaredField("handle");
									local261.invoke(local324, Boolean.TRUE);
									local5 = local5 + "|16)" + Long.toHexString(local324.getLong(local291));
									local261.invoke(local324, Boolean.FALSE);
								}
							} catch (@Pc(360) Throwable local360) {
							}
							local261.invoke(local296, Boolean.FALSE);
						} catch (@Pc(372) Throwable local372) {
						}
					}
				}
			} catch (@Pc(380) Throwable local380) {
			}
			local5 = local5 + "]";
		} catch (@Pc(391) Throwable local391) {
		}
		return local5;
	}
}
