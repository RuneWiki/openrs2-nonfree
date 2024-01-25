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
				Static229.method3481("Argument count");
			}
			Static649.aClass275_7 = new Class275();
			Static649.aClass275_7.anInt7235 = Integer.parseInt(arg0[0]);
			Static385.aClass275_6 = new Class275();
			Static385.aClass275_6.anInt7235 = Integer.parseInt(arg0[1]);
			Static322.aClass275_5 = new Class275();
			Static322.aClass275_5.anInt7235 = Integer.parseInt(arg0[2]);
			Static228.aClass135_3 = Static621.aClass135_12;
			if (arg0[3].equals("live")) {
				Static431.aClass16_3 = Static422.aClass16_2;
			} else if (arg0[3].equals("rc")) {
				Static431.aClass16_3 = Static225.aClass16_1;
			} else if (arg0[3].equals("wip")) {
				Static431.aClass16_3 = Static555.aClass16_4;
			} else {
				Static229.method3481("modewhat");
			}
			Static654.anInt10668 = Static404.method5593(arg0[4]);
			if (Static654.anInt10668 == -1) {
				if (arg0[4].equals("english")) {
					Static654.anInt10668 = 0;
				} else if (arg0[4].equals("german")) {
					Static654.anInt10668 = 1;
				} else {
					Static229.method3481("language");
				}
			}
			Static154.aBoolean424 = false;
			Static158.aBoolean218 = false;
			if (arg0[5].equals("game0")) {
				Static227.aClass203_4 = Static342.aClass203_6;
			} else if (arg0[5].equals("game1")) {
				Static227.aClass203_4 = Static499.aClass203_8;
			} else if (arg0[5].equals("game2")) {
				Static227.aClass203_4 = Static601.aClass203_11;
			} else if (arg0[5].equals("game3")) {
				Static227.aClass203_4 = Static69.aClass203_10;
			} else {
				Static229.method3481("game");
			}
			Static360.aString78 = "";
			Static520.anInt8219 = Static227.aClass203_4.anInt5389;
			Static502.aString96 = null;
			Static452.aBoolean521 = false;
			Static566.aLong254 = 0L;
			Static622.anInt10292 = 0;
			Static591.aBoolean662 = false;
			Static637.aBoolean165 = true;
			Static118.aBoolean679 = true;
			Static224.anInt3866 = 0;
			Static464.aString94 = null;
			Static579.anInt9385 = 0;
			@Pc(181) client local181 = new client();
			Static548.aClient1 = local181;
			local181.method1352(Static227.aClass203_4.aString69, Static431.aClass16_3.method477() + 32);
			Static572.aFrame2.setLocation(40, 40);
		} catch (@Pc(205) Exception local205) {
			Static456.method6140((String) null, local205);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1361() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static534.anInt8358 + "," + Static402.anInt6661 + "," + Static98.anInt361 + "," + Static438.anInt7120 + "|";
			if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 != null) {
				local7 = local7 + "2)" + Static570.anInt9192 + "," + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] + Static534.anInt8358) + "," + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] + Static402.anInt6661) + "|";
			}
			local7 = local7 + "3)" + Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() + "|4)" + Static336.aClass3_Sub41_18.aClass14_Sub10_1.method3046() + "|5)" + Static241.method3664() + "|6)" + Static531.anInt8327 + "," + Static13.anInt306 + "|";
			local7 = local7 + "7)" + Static336.aClass3_Sub41_18.aClass14_Sub17_1.method5487() + "|";
			local7 = local7 + "8)" + Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511() + "|";
			local7 = local7 + "9)" + Static336.aClass3_Sub41_18.aClass14_Sub27_1.method8410() + "|";
			local7 = local7 + "10)" + Static336.aClass3_Sub41_18.aClass14_Sub8_1.method2916() + "|";
			local7 = local7 + "11)" + Static336.aClass3_Sub41_18.aClass14_Sub24_1.method6457() + "|";
			local7 = local7 + "12)" + Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() + "|";
			local7 = local7 + "13)" + Static525.anInt8303 + "|";
			local7 = local7 + "14)" + Static221.anInt3831;
			if (Static395.aClass3_Sub28_1 != null) {
				local7 = local7 + "|15)" + Static395.aClass3_Sub28_1.anInt4590;
			}
			try {
				if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 2) {
					@Pc(242) Class local242 = Class.forName("java.lang.ClassLoader");
					@Pc(246) Field local246 = local242.getDeclaredField("nativeLibraries");
					@Pc(249) Class local249 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(259) Method local259 = local249.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local259.invoke(local246, Boolean.TRUE);
					@Pc(282) Vector local282 = (Vector) local246.get(client.class.getClassLoader());
					for (@Pc(284) int local284 = 0; local284 < local282.size(); local284++) {
						try {
							@Pc(290) Object local290 = local282.elementAt(local284);
							@Pc(295) Field local295 = local290.getClass().getDeclaredField("name");
							local259.invoke(local295, Boolean.TRUE);
							try {
								@Pc(310) String local310 = (String) local295.get(local290);
								if (local310 != null && local310.indexOf("sw3d.dll") != -1) {
									@Pc(322) Field local322 = local290.getClass().getDeclaredField("handle");
									local259.invoke(local322, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local322.getLong(local290));
									local259.invoke(local322, Boolean.FALSE);
								}
							} catch (@Pc(358) Throwable local358) {
							}
							local259.invoke(local295, Boolean.FALSE);
						} catch (@Pc(370) Throwable local370) {
						}
					}
				}
			} catch (@Pc(378) Throwable local378) {
			}
			local7 = local7 + "]";
		} catch (@Pc(395) Throwable local395) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1365(@OriginalArg(1) int arg0) {
		Static425.anInt6942 = 0;
		Static214.aClass338_14 = null;
		Static32.aClass163_1 = null;
		Static512.aClass113_3.anInt3005++;
		Static512.aClass113_3.anInt3006 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1351()) {
			return;
		}
		Static649.aClass275_7 = new Class275();
		Static649.aClass275_7.anInt7235 = Integer.parseInt(this.getParameter("worldid"));
		Static385.aClass275_6 = new Class275();
		Static385.aClass275_6.anInt7235 = Integer.parseInt(this.getParameter("lobbyid"));
		Static385.aClass275_6.aString91 = this.getParameter("lobbyaddress");
		Static322.aClass275_5 = new Class275();
		Static322.aClass275_5.anInt7235 = Integer.parseInt(this.getParameter("demoid"));
		Static322.aClass275_5.aString91 = this.getParameter("demoaddress");
		Static228.aClass135_3 = Static99.method1638(Integer.parseInt(this.getParameter("modewhere")));
		if (Static621.aClass135_12 == Static228.aClass135_3) {
			Static228.aClass135_3 = Static224.aClass135_2;
		} else if (!Static133.method2250(Static228.aClass135_3) && Static228.aClass135_3 != Static256.aClass135_4) {
			Static228.aClass135_3 = Static256.aClass135_4;
		}
		Static431.aClass16_3 = Static256.method3847(Integer.parseInt(this.getParameter("modewhat")));
		if (Static431.aClass16_3 != Static555.aClass16_4 && Static431.aClass16_3 != Static225.aClass16_1 && Static422.aClass16_2 != Static431.aClass16_3) {
			Static431.aClass16_3 = Static422.aClass16_2;
		}
		try {
			Static654.anInt10668 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static654.anInt10668 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static154.aBoolean424 = true;
		} else {
			Static154.aBoolean424 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static158.aBoolean218 = true;
		} else {
			Static158.aBoolean218 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static595.aBoolean669 = true;
		} else {
			Static595.aBoolean669 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static227.aClass203_4 = Static342.aClass203_6;
			} else if (local152.equals("1")) {
				Static227.aClass203_4 = Static499.aClass203_8;
			} else if (local152.equals("2")) {
				Static227.aClass203_4 = Static601.aClass203_11;
			} else if (local152.equals("3")) {
				Static227.aClass203_4 = Static69.aClass203_10;
			}
		}
		try {
			Static224.anInt3866 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static224.anInt3866 = 0;
		}
		Static304.aString65 = this.getParameter("quiturl");
		Static360.aString78 = this.getParameter("settings");
		if (Static360.aString78 == null) {
			Static360.aString78 = "";
		}
		Static281.aBoolean315 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static579.anInt9385 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static579.anInt9385 = 0;
			}
		}
		Static520.anInt8219 = Integer.parseInt(this.getParameter("colourid"));
		if (Static520.anInt8219 < 0 || Static520.anInt8219 >= Static111.aColorArray1.length) {
			Static520.anInt8219 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static637.aBoolean165 = true;
			Static118.aBoolean679 = true;
		}
		@Pc(257) String local257 = this.getParameter("frombilling");
		if (local257 != null && local257.equals("true")) {
			Static452.aBoolean521 = true;
		}
		Static464.aString94 = this.getParameter("sskey");
		if (Static464.aString94 != null && Static464.aString94.length() < 2) {
			Static464.aString94 = null;
		}
		@Pc(283) String local283 = this.getParameter("force64mb");
		if (local283 != null && local283.equals("true")) {
			Static591.aBoolean662 = true;
		}
		@Pc(295) String local295 = this.getParameter("worldflags");
		if (local295 != null) {
			try {
				Static622.anInt10292 = Integer.parseInt(local295);
			} catch (@Pc(302) Exception local302) {
			}
		}
		@Pc(307) String local307 = this.getParameter("userFlow");
		if (local307 != null) {
			try {
				Static566.aLong254 = Long.parseLong(local307);
			} catch (@Pc(314) NumberFormatException local314) {
			}
		}
		Static502.aString96 = this.getParameter("additionalInfo");
		if (Static502.aString96 != null && Static502.aString96.length() > 50) {
			Static502.aString96 = null;
		}
		Static548.aClient1 = this;
		if (Static227.aClass203_4 == Static342.aClass203_6) {
			Static95.anInt9415 = 765;
			Static195.anInt3525 = 503;
		} else if (Static227.aClass203_4 == Static499.aClass203_8) {
			Static195.anInt3525 = 480;
			Static95.anInt9415 = 640;
		}
		this.method1358(Static95.anInt9415, Static431.aClass16_3.method477() + 32, Static195.anInt3525, Static227.aClass203_4.aString69);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1359() {
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != 2) {
			this.method1385();
			return;
		}
		try {
			this.method1385();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static456.method6140(local24.getMessage() + " (Recovered) " + this.method1361(), local24);
			Static45.aBoolean57 = true;
			Static168.method2665(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	public synchronized void method1364() {
		if (Static339.anApplet2 != null && Static330.aCanvas5 == null && !Static566.aClass92_6.aBoolean170) {
			try {
				@Pc(13) Class local13 = Static339.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static330.aCanvas5 = (Canvas) local17.get(Static339.anApplet2);
				local17.set(Static339.anApplet2, (Object) null);
				if (Static330.aCanvas5 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1364();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1371() {
		if (Static574.anInt9254 < Static512.aClass113_3.anInt3005) {
			Static98.aClass275_2.method6084();
			Static130.anInt9885 = (Static512.aClass113_3.anInt3005 - 1) * 50 * 5;
			if (Static130.anInt9885 > 3000) {
				Static130.anInt9885 = 3000;
			}
			if (Static512.aClass113_3.anInt3005 >= 2 && Static512.aClass113_3.anInt3006 == 6) {
				this.method1347("js5connect_outofdate");
				Static221.anInt3831 = 14;
				return;
			}
			if (Static512.aClass113_3.anInt3005 >= 4 && Static512.aClass113_3.anInt3006 == -1) {
				this.method1347("js5crc");
				Static221.anInt3831 = 14;
				return;
			}
			if (Static512.aClass113_3.anInt3005 >= 4 && Static41.method772(Static221.anInt3831)) {
				if (Static512.aClass113_3.anInt3006 == 7 || Static512.aClass113_3.anInt3006 == 9) {
					this.method1347("js5connect_full");
				} else if (Static512.aClass113_3.anInt3006 <= 0) {
					this.method1347("js5io");
				} else if (Static208.aString46 == null) {
					this.method1347("js5connect");
				} else {
					this.method1347("js5proxy_" + Static208.aString46.trim());
				}
				Static221.anInt3831 = 14;
				return;
			}
		}
		Static574.anInt9254 = Static512.aClass113_3.anInt3005;
		if (Static130.anInt9885 > 0) {
			Static130.anInt9885--;
			return;
		}
		try {
			if (Static425.anInt6942 == 0) {
				Static214.aClass338_14 = Static98.aClass275_2.method6086(Static566.aClass92_6);
				Static425.anInt6942++;
			}
			if (Static425.anInt6942 == 1) {
				if (Static214.aClass338_14.anInt9321 == 2) {
					if (Static214.aClass338_14.anObject18 != null) {
						Static208.aString46 = (String) Static214.aClass338_14.anObject18;
					}
					this.method1365(1000);
					return;
				}
				if (Static214.aClass338_14.anInt9321 == 1) {
					Static425.anInt6942++;
				}
			}
			if (Static425.anInt6942 == 2) {
				Static32.aClass163_1 = new Class163((Socket) Static214.aClass338_14.anObject18, Static566.aClass92_6, 25000);
				@Pc(194) Class3_Sub4 local194 = new Class3_Sub4(5);
				local194.method7948(Static675.aClass179_2.anInt4730);
				local194.method7909(645);
				Static32.aClass163_1.method3825(5, local194.aByteArray90);
				Static425.anInt6942++;
				Static501.aLong220 = Static15.method380();
			}
			if (Static425.anInt6942 == 3) {
				if (Static41.method772(Static221.anInt3831) || Static32.aClass163_1.method3821() > 0) {
					@Pc(247) int local247 = Static32.aClass163_1.method3820();
					if (local247 != 0) {
						this.method1365(local247);
						return;
					}
					Static425.anInt6942++;
				} else if (Static15.method380() - Static501.aLong220 > 30000L) {
					this.method1365(1001);
					return;
				}
			}
			if (Static425.anInt6942 == 4) {
				@Pc(279) boolean local279 = Static41.method772(Static221.anInt3831) || Static413.method5629(Static221.anInt3831) || Static592.method7807(Static221.anInt3831);
				@Pc(282) Class341[] local282 = Static583.method7729();
				@Pc(290) Class3_Sub4 local290 = new Class3_Sub4(local282.length * 4);
				Static32.aClass163_1.method3824(0, local290.aByteArray90, local290.aByteArray90.length);
				for (@Pc(301) int local301 = 0; local301 < local282.length; local301++) {
					local282[local301].method7727(local290.method7895());
				}
				Static512.aClass113_3.method2602(Static32.aClass163_1, !local279);
				Static214.aClass338_14 = null;
				Static32.aClass163_1 = null;
				Static425.anInt6942 = 0;
			}
		} catch (@Pc(333) IOException local333) {
			this.method1365(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1356() {
		if (Static591.aBoolean662) {
			Static525.anInt8303 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static2.method24();
		Static37.aClass66_1 = new Class66(Static566.aClass92_6);
		Static512.aClass113_3 = new Class113();
		Static555.method7320(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static256.aClass135_4 != Static228.aClass135_3) {
			Static545.aByteArrayArray24 = new byte[50][];
		}
		Static336.aClass3_Sub41_18 = Static384.method5387();
		if (Static228.aClass135_3 == Static256.aClass135_4) {
			Static649.aClass275_7.aString91 = this.getCodeBase().getHost();
		} else if (Static133.method2250(Static228.aClass135_3)) {
			Static649.aClass275_7.aString91 = this.getCodeBase().getHost();
			Static649.aClass275_7.anInt7236 = Static649.aClass275_7.anInt7235 + 40000;
			Static385.aClass275_6.anInt7236 = Static385.aClass275_6.anInt7235 + 40000;
			Static649.aClass275_7.anInt7232 = Static649.aClass275_7.anInt7235 + 50000;
			Static322.aClass275_5.anInt7236 = Static322.aClass275_5.anInt7235 + 40000;
			Static385.aClass275_6.anInt7232 = Static385.aClass275_6.anInt7235 + 50000;
			Static322.aClass275_5.anInt7232 = Static322.aClass275_5.anInt7235 + 50000;
		} else if (Static621.aClass135_12 == Static228.aClass135_3) {
			Static649.aClass275_7.aString91 = "127.0.0.1";
			Static385.aClass275_6.aString91 = "127.0.0.1";
			Static649.aClass275_7.anInt7236 = Static649.aClass275_7.anInt7235 + 40000;
			Static322.aClass275_5.aString91 = "127.0.0.1";
			Static385.aClass275_6.anInt7236 = Static385.aClass275_6.anInt7235 + 40000;
			Static649.aClass275_7.anInt7232 = Static649.aClass275_7.anInt7235 + 50000;
			Static322.aClass275_5.anInt7236 = Static322.aClass275_5.anInt7235 + 40000;
			Static385.aClass275_6.anInt7232 = Static385.aClass275_6.anInt7235 + 50000;
			Static322.aClass275_5.anInt7232 = Static322.aClass275_5.anInt7235 + 50000;
		}
		if (Static227.aClass203_4 == Static342.aClass203_6) {
			Static170.aBoolean228 = false;
		}
		Static98.aClass275_2 = Static649.aClass275_7;
		Static385.aShortArray73 = Static44.aShortArray11 = Static214.aShortArray136 = Static90.aShortArray26 = new short[256];
		if (Static227.aClass203_4 == Static499.aClass203_8) {
			Static661.aShortArrayArray18 = Static485.aShortArrayArray9;
			Static358.anInt6108 = 16777215;
			Static627.anInt10389 = 0;
			Static332.aShortArrayArrayArray2 = Static25.aShortArrayArrayArray1;
			Static84.aBoolean109 = true;
		} else if (Static69.aClass203_10 == Static227.aClass203_4) {
			Static332.aShortArrayArrayArray2 = Static578.aShortArrayArrayArray3;
			Static661.aShortArrayArray18 = Static509.aShortArrayArray11;
		} else {
			Static332.aShortArrayArrayArray2 = Static649.aShortArrayArrayArray4;
			Static661.aShortArrayArray18 = Static458.aShortArrayArray7;
		}
		try {
			Static390.aClipboard1 = Static548.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(222) Exception local222) {
		}
		Static413.aClass154_1 = Static604.method8231(Static330.aCanvas5);
		Static627.aClass48_1 = Static217.method8414(Static330.aCanvas5);
		try {
			if (Static566.aClass92_6.aClass312_2 != null) {
				Static674.aClass152_5 = new Class152(Static566.aClass92_6.aClass312_2, 5200, 0);
				for (@Pc(244) int local244 = 0; local244 < 37; local244++) {
					Static410.aClass152Array1[local244] = new Class152(Static566.aClass92_6.aClass312Array1[local244], 6000, 0);
				}
				Static258.aClass152_2 = new Class152(Static566.aClass92_6.aClass312_1, 6000, 0);
				Static584.aClass241_4 = new Class241(255, Static674.aClass152_5, Static258.aClass152_2, 500000);
				Static34.aClass152_1 = new Class152(Static566.aClass92_6.aClass312_3, 24, 0);
				Static566.aClass92_6.aClass312_3 = null;
				Static566.aClass92_6.aClass312_2 = null;
				Static566.aClass92_6.aClass312_1 = null;
				Static566.aClass92_6.aClass312Array1 = null;
			}
		} catch (@Pc(300) IOException local300) {
			Static674.aClass152_5 = null;
			Static258.aClass152_2 = null;
			Static584.aClass241_4 = null;
			Static34.aClass152_1 = null;
		}
		if (Static256.aClass135_4 != Static228.aClass135_3) {
			Static421.aBoolean485 = true;
		}
		Static39.aString14 = Static114.aClass84_12.method1729(Static654.anInt10668);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1380() {
		if (Static221.anInt3831 == 14) {
			return;
		}
		Static122.anInt2190++;
		if (Static122.anInt2190 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static575.anInt9259 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static594.aRandom1.setSeed((long) Static575.anInt9259);
		}
		if (Static122.anInt2190 % 50 == 0) {
			Static50.anInt1078 = Static256.anInt4501;
			Static256.anInt4501 = 0;
			Static128.anInt2274 = Static492.anInt840;
			Static492.anInt840 = 0;
		}
		this.method1381();
		if (Static563.aClass257_1 != null) {
			Static563.aClass257_1.method5621();
		}
		Static129.method8650();
		Static67.method1223();
		Static413.aClass154_1.method5011();
		Static627.aClass48_1.method7519();
		if (Static119.aClass95_4 != null) {
			Static119.aClass95_4.method8056((int) Static15.method380());
		}
		Static205.method3069();
		Static273.anInt4689 = 0;
		Static310.anInt5197 = 0;
		for (@Pc(104) Interface18 local104 = Static413.aClass154_1.method5012(); local104 != null; local104 = Static413.aClass154_1.method5012()) {
			@Pc(110) int local110 = local104.method3026();
			if (local110 == 2 || local110 == 3) {
				@Pc(122) char local122 = local104.method3024();
				if (Static24.method565() && (local122 == '`' || local122 == '§' || local122 == '²')) {
					if (Static38.method606()) {
						Static219.method3251();
					} else {
						Static442.method6036();
					}
				} else if (Static310.anInt5197 < 128) {
					Static54.anInterface18Array1[Static310.anInt5197] = local104;
					Static310.anInt5197++;
				}
			} else if (local110 == 0 && Static273.anInt4689 < 75) {
				Static139.anInterface18Array3[Static273.anInt4689] = local104;
				Static273.anInt4689++;
			}
		}
		Static565.anInt9132 = 0;
		for (@Pc(190) Class3_Sub6 local190 = Static627.aClass48_1.method7513(); local190 != null; local190 = Static627.aClass48_1.method7513()) {
			@Pc(196) int local196 = local190.method5326();
			if (local196 == -1) {
				Static242.aClass302_47.method6613(local190);
			} else if (local196 == 6) {
				Static565.anInt9132 += local190.method5325();
			} else if (Static413.method5630(local196)) {
				Static388.aClass302_43.method6613(local190);
				if (Static388.aClass302_43.method6608() > 10) {
					Static388.aClass302_43.method6611();
				}
			}
		}
		if (Static38.method606()) {
			Static474.method6314();
		}
		if (Static41.method772(Static221.anInt3831)) {
			Static385.method5401();
			Static613.method8315();
		} else if (Static408.method5609(Static221.anInt3831)) {
			Static182.method2869();
		}
		if (Static413.method5629(Static221.anInt3831) && !Static408.method5609(Static221.anInt3831)) {
			this.method1382();
			Static224.method3290();
			Static285.method4142();
		} else if (Static592.method7807(Static221.anInt3831) && !Static408.method5609(Static221.anInt3831)) {
			this.method1382();
			Static285.method4142();
		} else if (Static221.anInt3831 == 12) {
			Static285.method4142();
		} else if (Static487.method6425(Static221.anInt3831) && !Static408.method5609(Static221.anInt3831)) {
			Static364.method5243();
		} else if (Static221.anInt3831 == 13) {
			Static285.method4142();
			if (Static355.anInt6076 != -3 && Static355.anInt6076 != 2 && Static355.anInt6076 != 15) {
				Static316.method4541(false);
			}
		}
		Static389.method5451(Static119.aClass95_4);
		Static388.aClass302_43.method6611();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1354() {
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1381() {
		@Pc(7) boolean local7 = Static512.aClass113_3.method2598();
		if (!local7) {
			this.method1371();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1382() {
		@Pc(29) int local29;
		if (Static221.anInt3831 == 7 && Static474.anInt7575 == 0) {
			if (Static226.anInt3963 > 1) {
				Static70.anInt1402 = Static156.anInt2887;
				Static226.anInt3963--;
			}
			if (!Static532.aBoolean580) {
				Static79.method1311();
			}
			for (local29 = 0; local29 < 100 && Static678.method9026(); local29++) {
			}
		}
		Static281.anInt4774++;
		Static103.method1672((Class265) null, -1, -1);
		Static421.method5795(-1, -1, (Class265) null);
		Static357.method5168();
		Static156.anInt2887++;
		for (local29 = 0; local29 < Static331.anInt5501; local29++) {
			@Pc(69) Class34_Sub1_Sub1_Sub2_Sub2 local69 = Static129.aClass3_Sub52Array3[local29].aClass34_Sub1_Sub1_Sub2_Sub2_2;
			if (local69 != null) {
				@Pc(75) byte local75 = local69.aClass261_1.aByte106;
				if ((local75 & 0x1) != 0) {
					@Pc(86) int local86 = local69.method7866();
					@Pc(110) int local110;
					if ((local75 & 0x2) != 0 && local69.anInt9703 == 0 && Math.random() * 1000.0D < 10.0D) {
						local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(118) int local118 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local110 != 0 || local118 != 0) {
							@Pc(129) int local129 = local69.anIntArray529[0] + local110;
							@Pc(136) int local136 = local69.anIntArray528[0] + local118;
							if (local129 < 0) {
								local129 = 0;
							} else if (Static98.anInt361 - local86 - 1 < local129) {
								local129 = Static98.anInt361 - local86 - 1;
							}
							if (local136 < 0) {
								local136 = 0;
							} else if (local136 > Static438.anInt7120 - local86 - 1) {
								local136 = Static438.anInt7120 - local86 - 1;
							}
							@Pc(211) int local211 = Static597.method7883(-1, local129, Static152.anIntArray554, local136, true, 0, local69.anIntArray528[0], local69.anIntArray529[0], Static609.aClass110Array1[local69.aByte132], local86, 0, Static211.anIntArray203, local86, local86);
							if (local211 > 0) {
								if (local211 > 9) {
									local211 = 9;
								}
								for (@Pc(225) int local225 = 0; local225 < local211; local225++) {
									local69.anIntArray529[local225] = Static152.anIntArray554[local211 - local225 - 1];
									local69.anIntArray528[local225] = Static211.anIntArray203[local211 - local225 - 1];
									local69.aByteArray89[local225] = 1;
								}
								local69.anInt9703 = local211;
							}
						}
					}
					Static121.method1827(true, local69);
					local110 = Static8.method117(local69);
					Static527.method6833(local69);
					Static628.method8495(Static211.anInt3663, local110, local69, Static521.anInt8227);
					Static245.method3710(Static521.anInt8227, local69);
					Static236.method3579(local69);
				}
			}
		}
		if (Static474.anInt7575 == 0 && Static613.anInt10200 == 0) {
			if (Static451.anInt7263 == 2) {
				Static62.method1133();
			} else {
				Static29.method628();
			}
			if (Static370.anInt6266 >> 9 < 14 || Static370.anInt6266 >> 9 >= Static98.anInt361 - 14 || Static564.anInt9117 >> 9 < 14 || Static438.anInt7120 - 14 <= Static564.anInt9117 >> 9) {
				Static157.method2508();
			}
		}
		while (true) {
			@Pc(349) Class3_Sub53 local349;
			@Pc(354) Class265 local354;
			@Pc(362) Class265 local362;
			do {
				local349 = (Class3_Sub53) Static432.aClass302_46.method6611();
				if (local349 == null) {
					while (true) {
						do {
							local349 = (Class3_Sub53) Static538.aClass302_53.method6611();
							if (local349 == null) {
								while (true) {
									do {
										local349 = (Class3_Sub53) Static221.aClass302_22.method6611();
										if (local349 == null) {
											if (Static264.aClass265_8 != null) {
												Static289.method4164();
											}
											if (Static122.anInt2190 % 1500 == 0) {
												Static288.method4154();
											}
											if (Static221.anInt3831 == 7 && Static474.anInt7575 == 0) {
												Static265.method3920();
											}
											Static36.method731();
											if (Static24.aBoolean32 && Static643.aLong291 < Static15.method380() - 60000L) {
												Static5.method85();
											}
											for (@Pc(516) Class34_Sub3_Sub1 local516 = (Class34_Sub3_Sub1) Static315.aClass317_4.method6891(); local516 != null; local516 = (Class34_Sub3_Sub1) Static315.aClass317_4.method6894()) {
												if ((long) local516.anInt3082 < Static15.method380() / 1000L - 5L) {
													if (local516.aShort33 > 0) {
														Static390.method5455(0, local516.aString43 + Static114.aClass84_19.method1729(Static654.anInt10668), "", 5, "", "");
													}
													if (local516.aShort33 == 0) {
														Static390.method5455(0, local516.aString43 + Static114.aClass84_20.method1729(Static654.anInt10668), "", 5, "", "");
													}
													local516.method8764();
												}
											}
											if (Static221.anInt3831 == 7 && Static474.anInt7575 == 0) {
												if (Static12.aClass26_1 == null) {
													Static316.method4541(false);
													return;
												}
												Static156.anInt2889++;
												if (Static156.anInt2889 > 50) {
													@Pc(622) Class3_Sub37 local622 = Static90.method1509(Static441.aClass240_74, Static226.aClass144_2);
													Static301.method2678(local622);
												}
												try {
													Static538.method6888();
													return;
												} catch (@Pc(629) IOException local629) {
													Static316.method4541(false);
													return;
												}
											}
											return;
										}
										local354 = local349.aClass265_16;
										if (local354.anInt7004 < 0) {
											break;
										}
										local362 = Static223.method3278(local354.anInt6985);
									} while (local362 == null || local362.aClass265Array4 == null || local362.aClass265Array4.length <= local354.anInt7004 || local362.aClass265Array4[local354.anInt7004] != local354);
									Static250.method3767(local349);
								}
							}
							local354 = local349.aClass265_16;
							if (local354.anInt7004 < 0) {
								break;
							}
							local362 = Static223.method3278(local354.anInt6985);
						} while (local362 == null || local362.aClass265Array4 == null || local354.anInt7004 >= local362.aClass265Array4.length || local354 != local362.aClass265Array4[local354.anInt7004]);
						Static250.method3767(local349);
					}
				}
				local354 = local349.aClass265_16;
				if (local354.anInt7004 < 0) {
					break;
				}
				local362 = Static223.method3278(local354.anInt6985);
			} while (local362 == null || local362.aClass265Array4 == null || local362.aClass265Array4.length <= local354.anInt7004 || local354 != local362.aClass265Array4[local354.anInt7004]);
			Static250.method3767(local349);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1355() {
		if (Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() != 2) {
			this.method1380();
			return;
		}
		try {
			this.method1380();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static456.method6140(local24.getMessage() + " (Recovered) " + this.method1361(), local24);
			Static45.aBoolean57 = true;
			Static168.method2665(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1346() {
		if (Static24.aBoolean32) {
			Static5.method85();
		}
		Static111.method1722();
		if (Static119.aClass95_4 != null) {
			Static119.aClass95_4.method8007();
		}
		if (Static438.aFrame1 != null) {
			Static28.method626(Static438.aFrame1, Static566.aClass92_6);
			Static438.aFrame1 = null;
		}
		if (Static12.aClass26_1 != null) {
			Static12.aClass26_1.method746();
			Static12.aClass26_1 = null;
		}
		Static1.method8753();
		Static512.aClass113_3.method2603();
		Static37.aClass66_1.method1512();
		if (Static480.aClass79_1 != null) {
			Static480.aClass79_1.method1712();
			Static480.aClass79_1 = null;
		}
		try {
			Static674.aClass152_5.method3498();
			for (@Pc(59) int local59 = 0; local59 < 37; local59++) {
				Static410.aClass152Array1[local59].method3498();
			}
			Static258.aClass152_2.method3498();
			Static34.aClass152_1.method3498();
			Static218.method3192();
		} catch (@Pc(82) Exception local82) {
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1385() {
		if (Static221.anInt3831 == 14) {
			return;
		}
		@Pc(18) long local18 = Static193.method3000() / 1000000L - Static34.aLong27;
		Static34.aLong27 = Static193.method3000() / 1000000L;
		@Pc(26) boolean local26 = Static677.method9021();
		if (local26 && Static501.aBoolean551 && Static388.aClass41_2 != null) {
			Static388.aClass41_2.method7700();
		}
		if (Static330.method4701(Static221.anInt3831)) {
			if (Static451.aLong200 != 0L && Static451.aLong200 < Static15.method380()) {
				Static551.method7076(false, Static241.method3664(), Static375.anInt7470, Static97.anInt1959);
			} else if (!Static119.aClass95_4.method7996() && Static65.aBoolean91) {
				Static442.method6035();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static438.aFrame1 == null) {
			@Pc(76) Container local76;
			if (Static572.aFrame2 != null) {
				local76 = Static572.aFrame2;
			} else if (Static339.anApplet2 == null) {
				local76 = Static353.anApplet_Sub1_1;
			} else {
				local76 = Static339.anApplet2;
			}
			local90 = local76.getSize().width;
			local94 = local76.getSize().height;
			if (Static572.aFrame2 == local76) {
				@Pc(100) Insets local100 = Static572.aFrame2.getInsets();
				local94 -= local100.top + local100.bottom;
				local90 -= local100.right + local100.left;
			}
			if (Static190.anInt3438 != local90 || local94 != Static674.anInt10898 || Static88.aBoolean149) {
				if (Static119.aClass95_4 == null || Static119.aClass95_4.method8016()) {
					Static2.method24();
				} else {
					Static190.anInt3438 = local90;
					Static674.anInt10898 = local94;
				}
				Static451.aLong200 = Static15.method380() + 500L;
				Static88.aBoolean149 = false;
			}
		}
		if (Static438.aFrame1 != null && !Static584.aBoolean658 && Static330.method4701(Static221.anInt3831)) {
			Static551.method7076(false, Static336.aClass3_Sub41_18.aClass14_Sub13_2.method4048(), -1, -1);
		}
		@Pc(164) boolean local164 = false;
		if (Static384.aBoolean449) {
			local164 = true;
			Static384.aBoolean449 = false;
		}
		if (local164) {
			Static242.method5991();
		}
		if (Static119.aClass95_4 != null && Static119.aClass95_4.method7996() || Static241.method3664() != 1) {
			Static184.method2885();
		}
		if (Static41.method772(Static221.anInt3831)) {
			Static654.method8759(local164);
		} else if (Static211.method3127(Static221.anInt3831)) {
			Static110.method1715();
		} else if (Static656.method8768(Static221.anInt3831)) {
			Static110.method1715();
		} else if (Static408.method5609(Static221.anInt3831)) {
			if (Static642.anInt10564 == 1) {
				if (Static643.anInt10568 < Static358.anInt6109) {
					Static643.anInt10568 = Static358.anInt6109;
				}
				local90 = (Static643.anInt10568 - Static358.anInt6109) * 50 / Static643.anInt10568;
				Static651.method8742(true, Static114.aClass84_12.method1729(Static654.anInt10668) + "<br>(" + local90 + "%)", Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
			} else if (Static642.anInt10564 == 2) {
				if (Static483.anInt7695 > Static193.anInt3514) {
					Static193.anInt3514 = Static483.anInt7695;
				}
				local90 = (Static193.anInt3514 - Static483.anInt7695) * 50 / Static193.anInt3514 + 50;
				Static651.method8742(true, Static114.aClass84_12.method1729(Static654.anInt10668) + "<br>(" + local90 + "%)", Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
			} else {
				Static651.method8742(true, Static114.aClass84_12.method1729(Static654.anInt10668), Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
			}
		} else if (Static221.anInt3831 == 10) {
			Static419.method5763(local18);
		} else if (Static221.anInt3831 == 13) {
			Static651.method8742(false, Static114.aClass84_14.method1729(Static654.anInt10668) + "<br>" + Static114.aClass84_15.method1729(Static654.anInt10668), Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
		}
		if (Static594.anInt9604 == 3) {
			for (local90 = 0; local90 < Static514.anInt8102; local90++) {
				@Pc(361) Rectangle local361 = Class167_Sub2.aRectangleArray2[local90];
				if (Static68.aBooleanArray4[local90]) {
					Static119.aClass95_4.method8071(local361.width, local361.x, local361.y, -65281, local361.height);
				} else if (Static170.aBooleanArray10[local90]) {
					Static119.aClass95_4.method8071(local361.width, local361.x, local361.y, -65536, local361.height);
				} else {
					Static119.aClass95_4.method8071(local361.width, local361.x, local361.y, -16711936, local361.height);
				}
			}
		}
		if (Static38.method606()) {
			Static610.method8277(Static119.aClass95_4);
		}
		if (Static566.aClass92_6.aBoolean170 && Static330.method4701(Static221.anInt3831) && Static594.anInt9604 == 0 && Static241.method3664() == 1 && !local164) {
			local94 = 0;
			for (@Pc(497) int local497 = 0; local497 < Static514.anInt8102; local497++) {
				if (Static170.aBooleanArray10[local497]) {
					Static170.aBooleanArray10[local497] = false;
					Static280.aRectangleArray1[local94++] = Class167_Sub2.aRectangleArray2[local497];
				}
			}
			try {
				if (Static498.aBoolean757) {
					Static313.method7417(Static280.aRectangleArray1, local94);
				} else {
					Static119.aClass95_4.method8068(local94, Static280.aRectangleArray1);
				}
			} catch (@Pc(537) Exception_Sub1 local537) {
			}
		} else if (!Static41.method772(Static221.anInt3831)) {
			for (local94 = 0; local94 < Static514.anInt8102; local94++) {
				Static170.aBooleanArray10[local94] = false;
			}
			try {
				if (Static498.aBoolean757) {
					Static90.method1504();
				} else {
					Static119.aClass95_4.method8020();
				}
			} catch (@Pc(471) Exception_Sub1 local471) {
				Static456.method6140(local471.getMessage() + " (Recovered) " + this.method1361(), local471);
				Static168.method2665(false, 0);
			}
		}
		Static84.method1337();
		local94 = Static336.aClass3_Sub41_18.aClass14_Sub26_1.method7784();
		if (local94 == 0) {
			Static26.method592(15L);
		} else if (local94 == 1) {
			Static26.method592(10L);
		} else if (local94 == 2) {
			Static26.method592(5L);
		} else if (local94 == 3) {
			Static26.method592(2L);
		}
		if (Static402.aBoolean460) {
			Static318.method4561();
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub12_1.method3863() == 1 && Static221.anInt3831 == 3 && Static187.anInt3418 != -1) {
			Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub12_1);
			Static219.method3247();
		}
	}
}
