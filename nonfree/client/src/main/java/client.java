import jagex3.jagmisc.jagmisc;
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
				Static336.method5322("Argument count");
			}
			Static426.aClass319_10 = new Class319();
			Static426.aClass319_10.anInt9320 = Integer.parseInt(arg0[0]);
			Static93.aClass319_6 = new Class319();
			Static93.aClass319_6.anInt9320 = Integer.parseInt(arg0[1]);
			Static112.aClass319_9 = new Class319();
			Static112.aClass319_9.anInt9320 = Integer.parseInt(arg0[2]);
			Static464.aClass253_15 = Static440.aClass253_13;
			if (arg0[3].equals("live")) {
				Static522.aClass221_5 = Static270.aClass221_3;
			} else if (arg0[3].equals("rc")) {
				Static522.aClass221_5 = Static22.aClass221_4;
			} else if (arg0[3].equals("wip")) {
				Static522.aClass221_5 = Static5.aClass221_1;
			} else {
				Static336.method5322("modewhat");
			}
			Static193.anInt7803 = Static108.method2105(arg0[4]);
			if (Static193.anInt7803 == -1) {
				if (arg0[4].equals("english")) {
					Static193.anInt7803 = 0;
				} else if (arg0[4].equals("german")) {
					Static193.anInt7803 = 1;
				} else {
					Static336.method5322("language");
				}
			}
			Static317.aBoolean393 = false;
			Static255.aBoolean353 = false;
			if (arg0[5].equals("game0")) {
				Static222.aClass44_2 = Static8.aClass44_1;
			} else if (arg0[5].equals("game1")) {
				Static222.aClass44_2 = Static332.aClass44_4;
			} else {
				Static336.method5322("game");
			}
			Static99.aBoolean428 = false;
			Static389.anInt7144 = 0;
			Static281.aString42 = "";
			Static11.anInt628 = Static222.aClass44_2.anInt1187;
			Static482.aString81 = null;
			Static308.aBoolean388 = true;
			Static107.aBoolean167 = true;
			Static15.aBoolean58 = false;
			Static142.anInt2899 = 0;
			Static407.anInt7464 = 0;
			@Pc(161) client local161 = new client();
			Static317.aClient1 = local161;
			local161.method1270(Static222.aClass44_2.aString10, Static522.aClass221_5.method5574() + 32);
			Static107.aFrame1.setLocation(40, 40);
		} catch (@Pc(184) Exception local184) {
			Static2.method220(local184, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1268() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static223.anInt4827 + "," + Static150.anInt3027 + "," + Static118.anInt2527 + "," + Static549.anInt9482 + "|";
			if (Static111.aClass6_Sub1_Sub2_Sub1_3 != null) {
				local7 = local7 + "2)" + Static420.anInt7829 + "," + (Static223.anInt4827 + Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0]) + "," + (Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0] + Static150.anInt3027) + "|";
			}
			local7 = local7 + "3)" + Static382.anInt7091 + "|4)" + Static7.aClass3_Sub15_Sub1_1.anInt8366 + "|5)" + Static212.method3885() + "|6)" + Static480.anInt8652 + "," + Static412.anInt7547 + "|";
			local7 = local7 + "7)" + Static7.aClass3_Sub15_Sub1_1.method6943(Static382.anInt7091) + "|";
			local7 = local7 + "8)" + Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091) + "|";
			local7 = local7 + "9)" + Static7.aClass3_Sub15_Sub1_1.aBoolean607 + "|";
			local7 = local7 + "10)" + Static7.aClass3_Sub15_Sub1_1.aBoolean602 + "|";
			local7 = local7 + "11)" + Static7.aClass3_Sub15_Sub1_1.aBoolean595 + "|";
			local7 = local7 + "12)" + Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091) + "|";
			local7 = local7 + "13)" + Class5_Sub1.lb + "|";
			local7 = local7 + "14)" + Static512.anInt8932;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(228) Throwable local228) {
			}
			try {
				if (Static382.anInt7091 == 2) {
					@Pc(234) Class local234 = Class.forName("java.lang.ClassLoader");
					@Pc(238) Field local238 = local234.getDeclaredField("nativeLibraries");
					@Pc(241) Class local241 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(251) Method local251 = local241.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local251.invoke(local238, Boolean.TRUE);
					@Pc(274) Vector local274 = (Vector) local238.get(client.class.getClassLoader());
					for (@Pc(276) int local276 = 0; local276 < local274.size(); local276++) {
						try {
							@Pc(282) Object local282 = local274.elementAt(local276);
							@Pc(287) Field local287 = local282.getClass().getDeclaredField("name");
							local251.invoke(local287, Boolean.TRUE);
							try {
								@Pc(302) String local302 = (String) local287.get(local282);
								if (local302 != null && local302.indexOf("sw3d.dll") != -1) {
									@Pc(315) Field local315 = local282.getClass().getDeclaredField("handle");
									local251.invoke(local315, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local315.getLong(local282));
									local251.invoke(local315, Boolean.FALSE);
								}
							} catch (@Pc(351) Throwable local351) {
							}
							local251.invoke(local287, Boolean.FALSE);
						} catch (@Pc(363) Throwable local363) {
						}
					}
				}
			} catch (@Pc(371) Throwable local371) {
			}
			local7 = local7 + "]";
		} catch (@Pc(382) Throwable local382) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1283(@OriginalArg(1) int arg0) {
		Static349.aClass153_2.anInt4928 = arg0;
		Static222.anInt4817 = 0;
		Static513.aClass212_7 = null;
		Static349.aClass153_2.anInt4929++;
		Static476.aClass317_4 = null;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1285() {
		if (Static512.anInt8932 == 13) {
			return;
		}
		@Pc(16) long local16 = Static495.method4747() / 1000000L - Static297.aLong161;
		Static297.aLong161 = Static495.method4747() / 1000000L;
		@Pc(24) boolean local24 = Static153.method2641();
		if (local24 && Static432.aBoolean563 && Static62.aClass43_7 != null) {
			Static62.aClass43_7.method7015();
		}
		if (Static307.method4066(Static512.anInt8932)) {
			if (Static380.aLong218 != 0L && Static380.aLong218 < Static12.method647()) {
				Static295.method4940(Static7.aClass3_Sub15_Sub1_1.anInt8372, Static212.method3885(), false, Static7.aClass3_Sub15_Sub1_1.anInt8380);
			} else if (!Static121.aClass5_7.method7466() && Static340.aBoolean409) {
				Static169.method3228();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static258.aFrame2 == null) {
			@Pc(80) Container local80;
			if (Static107.aFrame1 != null) {
				local80 = Static107.aFrame1;
			} else if (Static370.anApplet1 == null) {
				local80 = Static391.anApplet_Sub1_1;
			} else {
				local80 = Static370.anApplet1;
			}
			local92 = local80.getSize().width;
			local96 = local80.getSize().height;
			if (Static107.aFrame1 == local80) {
				@Pc(102) Insets local102 = Static107.aFrame1.getInsets();
				local92 -= local102.right + local102.left;
				local96 -= local102.bottom + local102.top;
			}
			if (Static265.anInt5511 != local92 || local96 != Static211.anInt4645 || Static17.aBoolean318) {
				if (Static121.aClass5_7 == null || Static121.aClass5_7.method7445()) {
					Static303.method4997();
				} else {
					Static265.anInt5511 = local92;
					Static211.anInt4645 = local96;
				}
				Static380.aLong218 = Static12.method647() + 500L;
				Static17.aBoolean318 = false;
			}
		}
		if (Static258.aFrame2 != null && !Static530.aBoolean675 && Static307.method4066(Static512.anInt8932)) {
			Static295.method4940(-1, Static7.aClass3_Sub15_Sub1_1.anInt8369, false, -1);
		}
		@Pc(173) boolean local173 = false;
		if (Static2.aBoolean13) {
			local173 = true;
			Static2.aBoolean13 = false;
		}
		if (local173) {
			Static192.method3685();
		}
		if (Static121.aClass5_7 != null && Static121.aClass5_7.method7466() || Static212.method3885() != 1) {
			Static403.method6133();
		}
		if (Static512.anInt8932 == 0) {
			Static358.method5615(Static7.aString6, Static153.aColorArray2[Static11.anInt628], Static320.aColorArray3[Static11.anInt628], Static8.aColorArray1[Static11.anInt628], Static47.anInt9385);
		} else if (Static512.anInt8932 == 1) {
			Static35.method859(Static320.aColorArray3[Static11.anInt628].getRGB(), Static8.aColorArray1[Static11.anInt628].getRGB(), Static153.aColorArray2[Static11.anInt628].getRGB(), Static294.aClass59_2, Static121.aClass5_7.method7466() | local173, Static121.aClass5_7);
		} else if (Static376.method7301(Static512.anInt8932)) {
			Static475.method7089();
		} else if (Static180.method3438(Static512.anInt8932)) {
			Static475.method7089();
		} else if (Static457.method6861(Static512.anInt8932)) {
			if (Static366.anInt6835 == 1) {
				if (Static92.anInt1968 < Static225.anInt4875) {
					Static92.anInt1968 = Static225.anInt4875;
				}
				local92 = (Static92.anInt1968 - Static225.anInt4875) * 50 / Static92.anInt1968;
				Static141.method2464(true, Static164.aClass59_1, Static157.aClass67_50.method1934(Static193.anInt7803) + "<br>(" + local92 + "%)");
			} else if (Static366.anInt6835 == 2) {
				if (Static120.anInt2575 < Static26.anInt760) {
					Static120.anInt2575 = Static26.anInt760;
				}
				local92 = (Static120.anInt2575 - Static26.anInt760) * 50 / Static120.anInt2575 + 50;
				Static141.method2464(true, Static164.aClass59_1, Static157.aClass67_50.method1934(Static193.anInt7803) + "<br>(" + local92 + "%)");
			} else {
				Static141.method2464(true, Static164.aClass59_1, Static157.aClass67_50.method1934(Static193.anInt7803));
			}
		} else if (Static512.anInt8932 == 9) {
			Static275.method4762(local16);
		} else if (Static512.anInt8932 == 12) {
			Static141.method2464(true, Static164.aClass59_1, Static15.aClass67_8.method1934(Static193.anInt7803) + "<br>" + Static525.aClass67_147.method1934(Static193.anInt7803));
		}
		if (Static336.anInt6343 == 3) {
			for (local92 = 0; local92 < Static489.anInt8712; local92++) {
				@Pc(403) Rectangle local403 = Class102.aRectangleArray1[local92];
				if (Static280.aBooleanArray28[local92]) {
					Static121.aClass5_7.method7459(local403.width, local403.y, -1996553985, local403.height, local403.x);
				} else if (Static302.aBooleanArray29[local92]) {
					Static121.aClass5_7.method7459(local403.width, local403.y, -1996554240, local403.height, local403.x);
				}
			}
		}
		if (Static257.method4537()) {
			Static186.method3515(Static121.aClass5_7);
		}
		if (Static401.aClass285_11.aBoolean624 && Static307.method4066(Static512.anInt8932) && Static336.anInt6343 == 0 && Static212.method3885() == 1 && !local173) {
			local92 = 0;
			for (local96 = 0; local96 < Static489.anInt8712; local96++) {
				if (Static302.aBooleanArray29[local96]) {
					Static302.aBooleanArray29[local96] = false;
					Static289.aRectangleArray2[local92++] = Class102.aRectangleArray1[local96];
				}
			}
			try {
				Static121.aClass5_7.method7417(Static289.aRectangleArray2, local92);
			} catch (@Pc(544) Exception_Sub1 local544) {
			}
		} else if (Static512.anInt8932 != 0) {
			for (local92 = 0; local92 < Static489.anInt8712; local92++) {
				Static302.aBooleanArray29[local92] = false;
			}
			try {
				Static121.aClass5_7.method7449();
			} catch (@Pc(492) Exception_Sub1 local492) {
				Static2.method220(local492, local492.getMessage() + " (Recovered) " + this.method1268());
				Static269.method4698(0);
			}
		}
		if (Static7.aClass3_Sub15_Sub1_1.anInt8378 == 0) {
			Static327.method5231(15L);
		} else if (Static7.aClass3_Sub15_Sub1_1.anInt8378 == 1) {
			Static327.method5231(10L);
		} else if (Static7.aClass3_Sub15_Sub1_1.anInt8378 == 2) {
			Static327.method5231(5L);
		} else if (Static7.aClass3_Sub15_Sub1_1.anInt8378 == 3) {
			Static327.method5231(2L);
		}
		if (Static180.aBoolean300) {
			Static57.method1160();
		}
		if (Static7.aClass3_Sub15_Sub1_1.aBoolean593 && Static512.anInt8932 == 2 && Static422.anInt8667 != -1) {
			Static7.aClass3_Sub15_Sub1_1.aBoolean593 = false;
			Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1278() {
		if (Static99.aBoolean428) {
			Class5_Sub1.lb = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static303.method4997();
		Static412.aClass162_3 = new Class162(Static401.aClass285_11);
		Static349.aClass153_2 = new Class153();
		if (Static464.aClass253_15 != Static327.aClass253_10) {
			Static76.aByteArrayArray7 = new byte[50][];
		}
		Static7.aClass3_Sub15_Sub1_1 = new Class3_Sub15_Sub1(Static401.aClass285_11);
		if (Static464.aClass253_15 == Static327.aClass253_10) {
			Static426.aClass319_10.aString85 = this.getCodeBase().getHost();
		} else if (Static513.method7345(Static464.aClass253_15)) {
			Static426.aClass319_10.aString85 = this.getCodeBase().getHost();
			Static426.aClass319_10.anInt9315 = Static426.aClass319_10.anInt9320 + 40000;
			Static93.aClass319_6.anInt9315 = Static93.aClass319_6.anInt9320 + 40000;
			Static112.aClass319_9.anInt9315 = Static112.aClass319_9.anInt9320 + 40000;
			Static426.aClass319_10.anInt9319 = Static426.aClass319_10.anInt9320 + 50000;
			Static93.aClass319_6.anInt9319 = Static93.aClass319_6.anInt9320 + 50000;
			Static112.aClass319_9.anInt9319 = Static112.aClass319_9.anInt9320 + 50000;
		} else if (Static440.aClass253_13 == Static464.aClass253_15) {
			Static426.aClass319_10.aString85 = "127.0.0.1";
			Static93.aClass319_6.aString85 = "127.0.0.1";
			Static426.aClass319_10.anInt9315 = Static426.aClass319_10.anInt9320 + 40000;
			Static112.aClass319_9.aString85 = "127.0.0.1";
			Static93.aClass319_6.anInt9315 = Static93.aClass319_6.anInt9320 + 40000;
			Static112.aClass319_9.anInt9315 = Static112.aClass319_9.anInt9320 + 40000;
			Static426.aClass319_10.anInt9319 = Static426.aClass319_10.anInt9320 + 50000;
			Static93.aClass319_6.anInt9319 = Static93.aClass319_6.anInt9320 + 50000;
			Static112.aClass319_9.anInt9319 = Static112.aClass319_9.anInt9320 + 50000;
		}
		Static81.aClass319_5 = Static426.aClass319_10;
		if (Static222.aClass44_2 == Static8.aClass44_1) {
			Static9.aBoolean522 = false;
		}
		if (Static332.aClass44_4 == Static222.aClass44_2) {
			Static518.aShortArrayArray2 = Static448.aShortArrayArray8;
			Static73.aShortArray199 = Static255.aShortArray97;
			Static505.anInt8839 = 16777215;
			Static522.aShortArrayArray10 = Static487.aShortArrayArray9;
			Static96.aShortArray49 = Static93.aShortArray48;
			Static66.anInt1452 = 0;
			Static37.aBoolean72 = true;
		} else {
			Static73.aShortArray199 = Static118.aShortArray63;
			Static522.aShortArrayArray10 = Static445.aShortArrayArray7;
			Static96.aShortArray49 = Static491.aShortArray198;
			Static518.aShortArrayArray2 = Static209.aShortArrayArray4;
		}
		Static532.aShortArray194 = Static9.aShortArray184 = Static120.aShortArray64 = Static350.aShortArray148 = new short[256];
		Static364.aClass101_1 = Static87.method1777(Static549.aCanvas15);
		Static35.aClass54_1 = Static270.method4699(Static549.aCanvas15);
		try {
			if (Static401.aClass285_11.aClass323_3 != null) {
				Static258.aClass196_3 = new Class196(Static401.aClass285_11.aClass323_3, 5200, 0);
				for (@Pc(218) int local218 = 0; local218 < 32; local218++) {
					Static227.aClass196Array1[local218] = new Class196(Static401.aClass285_11.aClass323Array1[local218], 6000, 0);
				}
				Static430.aClass196_7 = new Class196(Static401.aClass285_11.aClass323_4, 6000, 0);
				Static238.aClass182_1 = new Class182(255, Static258.aClass196_3, Static430.aClass196_7, 500000);
				Static340.aClass196_6 = new Class196(Static401.aClass285_11.aClass323_2, 24, 0);
				Static401.aClass285_11.aClass323_2 = null;
				Static401.aClass285_11.aClass323Array1 = null;
				Static401.aClass285_11.aClass323_4 = null;
				Static401.aClass285_11.aClass323_3 = null;
			}
		} catch (@Pc(276) IOException local276) {
			Static258.aClass196_3 = null;
			Static238.aClass182_1 = null;
			Static340.aClass196_6 = null;
			Static430.aClass196_7 = null;
		}
		if (Static464.aClass253_15 != Static327.aClass253_10) {
			Static120.aBoolean193 = true;
		}
		if (Static8.aClass44_1 == Static222.aClass44_2) {
			Static217.aString35 = Static148.aClass67_47.method1934(Static193.anInt7803);
		} else if (Static222.aClass44_2 == Static332.aClass44_4) {
			Static217.aString35 = Static210.aClass67_63.method1934(Static193.anInt7803);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1287() {
		if (Static4.anInt8816 < Static349.aClass153_2.anInt4929) {
			Static81.aClass319_5.method7698();
			Static362.anInt6791 = (Static349.aClass153_2.anInt4929 * 50 - 50) * 5;
			if (Static362.anInt6791 > 3000) {
				Static362.anInt6791 = 3000;
			}
			if (Static349.aClass153_2.anInt4929 >= 2 && Static349.aClass153_2.anInt4928 == 6) {
				this.method1267("js5connect_outofdate");
				Static512.anInt8932 = 13;
				return;
			}
			if (Static349.aClass153_2.anInt4929 >= 4 && Static349.aClass153_2.anInt4928 == -1) {
				this.method1267("js5crc");
				Static512.anInt8932 = 13;
				return;
			}
			if (Static349.aClass153_2.anInt4929 >= 4 && Static66.method1330(Static512.anInt8932)) {
				if (Static349.aClass153_2.anInt4928 == 7 || Static349.aClass153_2.anInt4928 == 9) {
					this.method1267("js5connect_full");
				} else if (Static349.aClass153_2.anInt4928 > 0) {
					this.method1267("js5connect");
				} else {
					this.method1267("js5io");
				}
				Static512.anInt8932 = 13;
				return;
			}
		}
		Static4.anInt8816 = Static349.aClass153_2.anInt4929;
		if (Static362.anInt6791 > 0) {
			Static362.anInt6791--;
			return;
		}
		try {
			if (Static222.anInt4817 == 0) {
				Static513.aClass212_7 = Static81.aClass319_5.method7699(Static401.aClass285_11);
				Static222.anInt4817++;
			}
			if (Static222.anInt4817 == 1) {
				if (Static513.aClass212_7.anInt6547 == 2) {
					this.method1283(1000);
					return;
				}
				if (Static513.aClass212_7.anInt6547 == 1) {
					Static222.anInt4817++;
				}
			}
			if (Static222.anInt4817 == 2) {
				Static476.aClass317_4 = new Class317((Socket) Static513.aClass212_7.anObject13, Static401.aClass285_11);
				@Pc(170) Class3_Sub27 local170 = new Class3_Sub27(5);
				local170.method7576(Static538.aClass42_2.anInt1132);
				local170.method7594(611);
				Static476.aClass317_4.method7653(5, local170.aByteArray114);
				Static222.anInt4817++;
				Static53.aLong41 = Static12.method647();
			}
			if (Static222.anInt4817 == 3) {
				if (Static66.method1330(Static512.anInt8932) || Static476.aClass317_4.method7651() > 0) {
					@Pc(212) int local212 = Static476.aClass317_4.method7652();
					if (local212 != 0) {
						this.method1283(local212);
						return;
					}
					Static222.anInt4817++;
				} else if (Static12.method647() - Static53.aLong41 > 30000L) {
					this.method1283(1001);
					return;
				}
			}
			if (Static222.anInt4817 == 4) {
				@Pc(263) boolean local263 = Static512.anInt8932 == 1 || Static316.method5110(Static512.anInt8932) || Static173.method3293(Static512.anInt8932);
				Static349.aClass153_2.method4114(Static476.aClass317_4, !local263);
				Static476.aClass317_4 = null;
				Static513.aClass212_7 = null;
				Static222.anInt4817 = 0;
			}
		} catch (@Pc(280) IOException local280) {
			this.method1283(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1269() {
		if (Static382.anInt7091 != 2) {
			this.method1285();
			return;
		}
		try {
			this.method1285();
		} catch (@Pc(11) Throwable local11) {
			Static2.method220(local11, local11.getMessage() + " (Recovered) " + this.method1268());
			Static269.method4698(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method1288(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class3_Sub27 local14 = new Class3_Sub27(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.method7548();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(108) int[] local108 = Static342.anIntArray555 = new int[6];
						local108[0] = local14.method7591();
						local108[1] = local14.method7591();
						local108[2] = local14.method7591();
						local108[3] = local14.method7591();
						local108[4] = local14.method7591();
						local108[5] = local14.method7591();
					} else {
						@Pc(39) int local39;
						@Pc(34) int local34;
						if (local18 == 4) {
							local34 = local14.method7548();
							Static145.anIntArray286 = new int[local34];
							for (local39 = 0; local39 < local34; local39++) {
								Static145.anIntArray286[local39] = local14.method7591();
								if (Static145.anIntArray286[local39] == 65535) {
									Static145.anIntArray286[local39] = -1;
								}
							}
						} else if (local18 == 5) {
							local34 = local14.method7548();
							Static21.anIntArray125 = new int[local34];
							for (local39 = 0; local39 < local34; local39++) {
								Static21.anIntArray125[local39] = local14.method7591();
								if (Static21.anIntArray125[local39] == 65535) {
									Static21.anIntArray125[local39] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1273() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
	private void method1289(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class3_Sub27 local12 = new Class3_Sub27(arg0);
		while (true) {
			@Pc(16) int local16 = local12.method7548();
			if (local16 == 0) {
				return;
			}
			if (local16 == 2) {
				Static534.anInt9256 = local12.method7591();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1262()) {
			return;
		}
		Static426.aClass319_10 = new Class319();
		Static426.aClass319_10.anInt9320 = Integer.parseInt(this.getParameter("worldid"));
		Static93.aClass319_6 = new Class319();
		Static93.aClass319_6.anInt9320 = Integer.parseInt(this.getParameter("lobbyid"));
		Static93.aClass319_6.aString85 = this.getParameter("lobbyaddress");
		Static112.aClass319_9 = new Class319();
		Static112.aClass319_9.anInt9320 = Integer.parseInt(this.getParameter("demoid"));
		Static112.aClass319_9.aString85 = this.getParameter("demoaddress");
		Static464.aClass253_15 = Static456.method7275(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static513.method7345(Static464.aClass253_15) && Static327.aClass253_10 != Static464.aClass253_15) {
			Static464.aClass253_15 = Static327.aClass253_10;
		}
		Static522.aClass221_5 = Static181.method3471(Integer.parseInt(this.getParameter("modewhat")));
		if (Static5.aClass221_1 != Static522.aClass221_5 && Static22.aClass221_4 != Static522.aClass221_5 && Static522.aClass221_5 != Static270.aClass221_3) {
			Static522.aClass221_5 = Static270.aClass221_3;
		}
		try {
			Static193.anInt7803 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static193.anInt7803 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static317.aBoolean393 = true;
		} else {
			Static317.aBoolean393 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static255.aBoolean353 = true;
		} else {
			Static255.aBoolean353 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static83.aBoolean134 = true;
		} else {
			Static83.aBoolean134 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static222.aClass44_2 = Static8.aClass44_1;
			} else if (local145.equals("1")) {
				Static222.aClass44_2 = Static332.aClass44_4;
			}
		}
		try {
			Static142.anInt2899 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static142.anInt2899 = 0;
		}
		Static243.aString38 = this.getParameter("quiturl");
		Static281.aString42 = this.getParameter("settings");
		if (Static281.aString42 == null) {
			Static281.aString42 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static389.anInt7144 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static389.anInt7144 = 0;
			}
		}
		Static11.anInt628 = Integer.parseInt(this.getParameter("colourid"));
		if (Static11.anInt628 < 0 || Static11.anInt628 >= Static153.aColorArray2.length) {
			Static11.anInt628 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static308.aBoolean388 = true;
			Static107.aBoolean167 = true;
		}
		@Pc(227) String local227 = this.getParameter("frombilling");
		if (local227 != null && local227.equals("true")) {
			Static15.aBoolean58 = true;
		}
		Static482.aString81 = this.getParameter("sskey");
		if (Static482.aString81 != null && Static482.aString81.length() < 2) {
			Static482.aString81 = null;
		}
		@Pc(251) String local251 = this.getParameter("force64mb");
		if (local251 != null && local251.equals("true")) {
			Static99.aBoolean428 = true;
		}
		@Pc(263) String local263 = this.getParameter("worldflags");
		if (local263 != null) {
			try {
				Static407.anInt7464 = Integer.parseInt(local263);
			} catch (@Pc(270) Exception local270) {
			}
		}
		Static317.aClient1 = this;
		if (Static222.aClass44_2 == Static8.aClass44_1) {
			Static172.anInt3949 = 503;
			Static238.anInt4976 = 765;
		} else if (Static222.aClass44_2 == Static332.aClass44_4) {
			Static172.anInt3949 = 480;
			Static238.anInt4976 = 640;
		}
		this.method1266(Static172.anInt3949, Static522.aClass221_5.method5574() + 32, Static238.anInt4976, Static222.aClass44_2.aString10);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1293() {
		if (Static512.anInt8932 == 13) {
			return;
		}
		Static223.anInt4829++;
		if (Static223.anInt4829 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static30.anInt2584 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static482.aRandom1.setSeed((long) Static30.anInt2584);
		}
		if (Static223.anInt4829 % 50 == 0) {
			Static296.anInt5932 = Static287.anInt5847;
			Static287.anInt5847 = 0;
			Static195.anInt4428 = Static428.anInt7892;
			Static428.anInt7892 = 0;
		}
		this.method1299();
		if (Static4.aClass170_9 != null) {
			Static4.aClass170_9.method4636();
		}
		Static455.method6841();
		Static364.aClass101_1.method2592();
		Static35.aClass54_1.method4072();
		if (Static121.aClass5_7 != null) {
			Static121.aClass5_7.method7427((int) Static12.method647());
		}
		Static394.method6001();
		Static499.anInt3719 = 0;
		Static372.anInt6997 = 0;
		for (@Pc(90) Interface2 local90 = Static364.aClass101_1.method2591(); local90 != null; local90 = Static364.aClass101_1.method2591()) {
			@Pc(96) int local96 = local90.method4018();
			if (local96 == 2 || local96 == 3) {
				@Pc(128) char local128 = local90.method4020();
				if (Static308.method5031() && (local128 == '`' || local128 == '§')) {
					if (Static257.method4537()) {
						Static53.method1122();
					} else {
						Static10.method635();
					}
				} else if (Static372.anInt6997 < 128) {
					Static373.anInterface2Array1[Static372.anInt6997] = local90;
					Static372.anInt6997++;
				}
			} else if (local96 == 0 && Static499.anInt3719 < 75) {
				Static532.anInterface2Array2[Static499.anInt3719] = local90;
				Static499.anInt3719++;
			}
		}
		Static118.anInt2530 = 0;
		for (@Pc(179) Class3_Sub19 local179 = Static35.aClass54_1.method4063(); local179 != null; local179 = Static35.aClass54_1.method4063()) {
			@Pc(185) int local185 = local179.method4962();
			if (local185 == -1) {
				Static188.aClass71_36.method2076(local179);
			} else if (local185 == 6) {
				Static118.anInt2530 += local179.method4961();
			} else if (Static489.method7164(local185)) {
				Static71.aClass71_16.method2076(local179);
				if (Static71.aClass71_16.method2077() > 10) {
					Static71.aClass71_16.method2084();
				}
			}
		}
		if (Static257.method4537()) {
			Static294.method4933();
		}
		if (Static512.anInt8932 == 0) {
			this.method1296();
			Static221.method4024();
		} else if (Static512.anInt8932 == 1) {
			this.method1296();
			Static221.method4024();
		} else if (Static457.method6861(Static512.anInt8932)) {
			Static530.method7628();
		}
		if (Static316.method5110(Static512.anInt8932) && !Static457.method6861(Static512.anInt8932)) {
			this.method1298();
			Static387.method7804();
			Static32.method825();
		} else if (Static173.method3293(Static512.anInt8932) && !Static457.method6861(Static512.anInt8932)) {
			this.method1298();
			Static32.method825();
		} else if (Static512.anInt8932 == 11) {
			Static32.method825();
		} else if (Static471.method7030(Static512.anInt8932) && !Static457.method6861(Static512.anInt8932)) {
			Static280.method4814();
		} else if (Static512.anInt8932 == 12) {
			Static32.method825();
			if (Static133.anInt2745 != -3 && Static133.anInt2745 != 2 && Static133.anInt2745 != 15) {
				Static180.method3441(false);
			}
		}
		Static221.method4025(Static121.aClass5_7);
		Static71.aClass71_16.method2084();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1265() {
		if (Static382.anInt7091 != 2) {
			this.method1293();
			return;
		}
		try {
			this.method1293();
		} catch (@Pc(9) Throwable local9) {
			Static2.method220(local9, local9.getMessage() + " (Recovered) " + this.method1268());
			Static269.method4698(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1296() {
		@Pc(6) int local6;
		if (!Static7.aClass3_Sub15_Sub1_1.aBoolean593) {
			for (local6 = 0; local6 < Static372.anInt6997; local6++) {
				if (Static373.anInterface2Array1[local6].method4020() == 's' || Static373.anInterface2Array1[local6].method4020() == 'S') {
					Static7.aClass3_Sub15_Sub1_1.aBoolean593 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static168.anInt3862 == 0) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local55 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(58) long local58 = Static12.method647();
			if (Static407.aLong229 == 0L) {
				Static407.aLong229 = local58;
			}
			if (local55 > 16384 && local58 - Static407.aLong229 < 5000L) {
				if (local58 - Static381.aLong219 > 1000L) {
					System.gc();
					Static381.aLong219 = local58;
				}
				Static7.aString6 = Static144.aClass67_42.method1934(Static193.anInt7803);
				Static47.anInt9385 = 5;
			} else {
				Static7.aString6 = Static318.aClass67_78.method1934(Static193.anInt7803);
				Static168.anInt3862 = 10;
				Static47.anInt9385 = 5;
			}
		} else if (Static168.anInt3862 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static95.aClass306Array1[local6] = Static486.method6552(Static118.anInt2527, Static549.anInt9482);
			}
			Static7.aString6 = Static527.aClass67_148.method1934(Static193.anInt7803);
			Static47.anInt9385 = 10;
			Static168.anInt3862 = 20;
		} else if (Static168.anInt3862 == 20) {
			if (Static4.aClass170_9 == null) {
				Static4.aClass170_9 = new Class170(Static349.aClass153_2, Static412.aClass162_3, Static120.aBigInteger2, Static264.aBigInteger5);
			}
			if (Static4.aClass170_9.method4637()) {
				Static23.aClass161_84 = Static365.method5728(true, false, 0);
				Static480.aClass161_106 = Static365.method5728(true, false, 1);
				Static492.aClass161_109 = Static365.method5728(true, false, 2);
				Static469.aClass161_101 = Static365.method5728(true, false, 3);
				Static402.aClass161_107 = Static365.method5728(true, false, 4);
				Static307.aClass161_51 = Static365.method5728(true, true, 5);
				Static460.aClass161_42 = Static365.method5728(false, true, 6);
				Static549.aClass161_119 = Static365.method5728(true, false, 7);
				Static19.aClass161_7 = Static365.method5728(true, false, 8);
				Static345.aClass161_74 = Static365.method5728(true, false, 9);
				Static26.aClass161_9 = Static365.method5728(true, false, 10);
				Static494.aClass161_110 = Static365.method5728(true, false, 11);
				Static310.aClass161_61 = Static365.method5728(true, false, 12);
				Static62.aClass161_105 = Static365.method5728(true, false, 13);
				Static135.aClass161_28 = Static365.method5728(false, false, 14);
				Static365.aClass161_80 = Static365.method5728(true, false, 15);
				Static211.aClass161_49 = Static365.method5728(true, false, 16);
				Static197.aClass161_44 = Static365.method5728(true, false, 17);
				Static205.aClass161_46 = Static365.method5728(true, false, 18);
				Static350.aClass161_75 = Static365.method5728(true, false, 19);
				Static326.aClass161_66 = Static365.method5728(true, false, 20);
				Static350.aClass161_76 = Static365.method5728(true, false, 21);
				Static166.aClass161_78 = Static365.method5728(true, false, 22);
				Static4.aClass161_114 = Static365.method5728(true, true, 23);
				Static357.aClass161_77 = Static365.method5728(true, false, 24);
				Static424.aClass161_94 = Static365.method5728(true, false, 25);
				Static306.aClass161_60 = Static365.method5728(true, true, 26);
				Static191.aClass161_43 = Static365.method5728(true, false, 27);
				Static274.aClass161_59 = Static365.method5728(true, true, 28);
				Static70.aClass161_6 = Static365.method5728(true, false, 29);
				Static498.aClass161_113 = Static365.method5728(true, true, 30);
				Static243.aClass161_54 = Static365.method5728(true, true, 31);
				Static7.aString6 = Static75.aClass67_141.method1934(Static193.anInt7803);
				Static47.anInt9385 = 15;
				Static168.anInt3862 = 30;
			} else {
				Static7.aString6 = Static59.aClass67_18.method1934(Static193.anInt7803);
				Static47.anInt9385 = 12;
			}
		} else if (Static168.anInt3862 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 32; local55++) {
				local6 += Static400.aClass113_Sub1Array2[local55].method5717() * Static44.anIntArray142[local55] / 100;
			}
			if (local6 == 100) {
				Static7.aString6 = Static372.aClass67_114.method1934(Static193.anInt7803);
				Static47.anInt9385 = 20;
				Static497.method7184(Static19.aClass161_7);
				Static337.method5392(Static19.aClass161_7);
				Static168.anInt3862 = 35;
			} else {
				if (local6 != 0) {
					Static7.aString6 = Static241.aClass67_145.method1934(Static193.anInt7803) + local6 + "%";
				}
				Static47.anInt9385 = 20;
			}
		} else if (Static168.anInt3862 == 35) {
			Static437.method6619(Static498.aClass161_113, Static401.aClass285_11);
			Static7.aString6 = Static224.aClass67_68.method1934(Static193.anInt7803);
			Static168.anInt3862 = 40;
			Static47.anInt9385 = 20;
		} else if (Static168.anInt3862 == 40) {
			if (Static274.aClass161_59.method4262()) {
				this.method1288(Static274.aClass161_59.method4265(1));
				this.method1289(Static274.aClass161_59.method4265(3));
				if (Static534.anInt9256 == -1 || Static549.aClass161_119.method4241(Static534.anInt9256, 0)) {
					Static7.aString6 = Static19.aClass67_9.method1934(Static193.anInt7803);
					Static47.anInt9385 = 25;
					Static168.anInt3862 = 41;
				}
			} else {
				Static7.aString6 = Static440.aClass67_131.method1934(Static193.anInt7803) + Static274.aClass161_59.method4263() + "%";
				Static47.anInt9385 = 25;
			}
		} else if (Static168.anInt3862 == 41) {
			local6 = Static481.method7118("jaggl");
			if (local6 >= 0 && local6 < 100) {
				Static7.aString6 = Static90.aClass67_26.method1934(Static193.anInt7803) + local6 + "%";
				Static47.anInt9385 = 25;
			} else {
				Static7.aString6 = Static544.aClass67_153.method1934(Static193.anInt7803);
				Static168.anInt3862 = 42;
				Static47.anInt9385 = 25;
			}
		} else if (Static168.anInt3862 == 42) {
			local6 = Static481.method7118("jagdx");
			if (local6 >= 0 && local6 < 100) {
				Static7.aString6 = Static214.aClass67_66.method1934(Static193.anInt7803) + local6 + "%";
				Static47.anInt9385 = 25;
			} else {
				Static7.aString6 = Static412.aClass67_125.method1934(Static193.anInt7803);
				Static168.anInt3862 = 43;
				Static47.anInt9385 = 25;
			}
		} else if (Static168.anInt3862 == 43) {
			local6 = Static481.method7118("jagmisc");
			if (local6 >= 0 && local6 < 100) {
				Static7.aString6 = Static536.aClass67_151.method1934(Static193.anInt7803) + local6 + "%";
				Static47.anInt9385 = 25;
			} else {
				if (local6 == 100) {
					this.method1275();
				}
				Static7.aString6 = Static260.aClass67_79.method1934(Static193.anInt7803);
				Static168.anInt3862 = 44;
				Static47.anInt9385 = 25;
			}
		} else if (Static168.anInt3862 == 44) {
			local6 = Static481.method7118("sw3d");
			if (local6 >= 0 && local6 < 100) {
				Static7.aString6 = Static454.aClass67_136.method1934(Static193.anInt7803) + local6 + "%";
				Static47.anInt9385 = 25;
			} else {
				Static7.aString6 = Static278.aClass67_84.method1934(Static193.anInt7803);
				Static47.anInt9385 = 25;
				Static168.anInt3862 = 45;
			}
		} else if (Static168.anInt3862 == 45) {
			local6 = Static481.method7118("jaclib");
			if (local6 >= 0 && local6 < 100) {
				Static7.aString6 = Static142.aClass67_41.method1934(Static193.anInt7803) + local6 + "%";
				Static47.anInt9385 = 25;
			} else {
				if (local6 == 100) {
					this.method1261();
				}
				Static7.aString6 = Static403.aClass67_121.method1934(Static193.anInt7803);
				Static47.anInt9385 = 25;
				Static168.anInt3862 = 46;
			}
		} else if (Static168.anInt3862 == 46) {
			local6 = Static481.method7118("hw3d");
			if (local6 >= 0 && local6 < 100) {
				Static7.aString6 = Static146.aClass67_45.method1934(Static193.anInt7803) + local6 + "%";
				Static47.anInt9385 = 25;
			} else {
				Static7.aString6 = Static379.aClass67_120.method1934(Static193.anInt7803);
				Static47.anInt9385 = 25;
				Static168.anInt3862 = 47;
			}
		} else if (Static168.anInt3862 == 47) {
			if (Static243.aClass161_54.method4262()) {
				Static7.aString6 = Static180.aClass67_55.method1934(Static193.anInt7803);
				Static47.anInt9385 = 25;
				Static168.anInt3862 = 50;
			} else {
				Static7.aString6 = Static202.aClass67_61.method1934(Static193.anInt7803);
				Static47.anInt9385 = 25;
			}
		} else if (Static168.anInt3862 == 50) {
			Static339.method4759();
			Static7.aString6 = Static439.aClass67_130.method1934(Static193.anInt7803);
			Static168.anInt3862 = 60;
			Static47.anInt9385 = 30;
		} else if (Static168.anInt3862 == 60) {
			local6 = Static165.method3201(Static19.aClass161_7, Static62.aClass161_105);
			local55 = Static32.method824();
			if (local55 > local6) {
				Static7.aString6 = Static284.aClass67_88.method1934(Static193.anInt7803) + local6 * 100 / local55 + "%";
				Static47.anInt9385 = 35;
			} else {
				Static7.aString6 = Static51.aClass67_16.method1934(Static193.anInt7803);
				Static47.anInt9385 = 35;
				Static168.anInt3862 = 70;
			}
		} else if (Static168.anInt3862 == 70) {
			local6 = Static517.method7378(Static19.aClass161_7);
			local55 = Static184.method3482();
			if (local55 > local6) {
				Static7.aString6 = Static388.aClass67_139.method1934(Static193.anInt7803) + local6 * 100 / local55 + "%";
				Static47.anInt9385 = 40;
			} else {
				Static7.aString6 = Static224.aClass67_69.method1934(Static193.anInt7803);
				Static168.anInt3862 = 80;
				Static47.anInt9385 = 40;
			}
		} else if (Static168.anInt3862 == 80) {
			if (Static306.aClass161_60.method4262()) {
				Static202.anInterface4_10 = new Class268(Static306.aClass161_60, Static345.aClass161_74, Static19.aClass161_7);
				Static7.aString6 = Static408.aClass67_123.method1934(Static193.anInt7803);
				Static168.anInt3862 = 90;
				Static47.anInt9385 = 45;
			} else {
				Static7.aString6 = Static265.aClass67_82.method1934(Static193.anInt7803) + Static306.aClass161_60.method4263() + "%";
				Static47.anInt9385 = 45;
			}
		} else if (Static168.anInt3862 == 90) {
			Static7.aString6 = Static7.aClass67_7.method1934(Static193.anInt7803);
			Static168.anInt3862 = 95;
			Static47.anInt9385 = 50;
		} else if (Static168.anInt3862 == 95) {
			if (Static7.aClass3_Sub15_Sub1_1.aBoolean593) {
				Static7.aClass3_Sub15_Sub1_1.anInt8379 = 0;
				Static7.aClass3_Sub15_Sub1_1.anInt8366 = 0;
				Static7.aClass3_Sub15_Sub1_1.anInt8375 = 0;
				Static7.aClass3_Sub15_Sub1_1.anInt8365 = 0;
				Static7.aClass3_Sub15_Sub1_1.anInt8369 = 1;
			}
			Static7.aClass3_Sub15_Sub1_1.aBoolean593 = true;
			Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
			Static547.method7812(false, Static7.aClass3_Sub15_Sub1_1.anInt8379);
			Static7.aString6 = Static34.aClass67_11.method1934(Static193.anInt7803);
			Static168.anInt3862 = 100;
			Static47.anInt9385 = 55;
		} else if (Static168.anInt3862 == 100) {
			Static124.method7287(Static19.aClass161_7, Static62.aClass161_105, Static121.aClass5_7);
			Static7.aString6 = Static502.aClass67_144.method1934(Static193.anInt7803);
			Static47.anInt9385 = 60;
			Static333.method5283(1);
			Static168.anInt3862 = 110;
		} else if (Static168.anInt3862 == 110) {
			Static492.aClass161_109.method4262();
			local6 = Static492.aClass161_109.method4263();
			Static211.aClass161_49.method4262();
			local6 += Static211.aClass161_49.method4263();
			Static197.aClass161_44.method4262();
			local6 += Static197.aClass161_44.method4263();
			Static205.aClass161_46.method4262();
			local6 += Static205.aClass161_46.method4263();
			Static350.aClass161_75.method4262();
			local6 += Static350.aClass161_75.method4263();
			Static326.aClass161_66.method4262();
			local6 += Static326.aClass161_66.method4263();
			Static350.aClass161_76.method4262();
			local6 += Static350.aClass161_76.method4263();
			Static166.aClass161_78.method4262();
			local6 += Static166.aClass161_78.method4263();
			Static357.aClass161_77.method4262();
			local6 += Static357.aClass161_77.method4263();
			Static424.aClass161_94.method4262();
			local6 += Static424.aClass161_94.method4263();
			Static191.aClass161_43.method4262();
			local6 += Static191.aClass161_43.method4263();
			Static70.aClass161_6.method4262();
			local6 += Static70.aClass161_6.method4263();
			if (local6 < 1200) {
				Static7.aString6 = Static342.aClass67_103.method1934(Static193.anInt7803) + local6 / 12 + "%";
				Static47.anInt9385 = 65;
			} else {
				Static37.aClass121_1 = new Class121(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static546.aClass132_1 = new Class132(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static25.aClass88_1 = new Class88(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109, Static19.aClass161_7);
				Static402.aClass60_2 = new Class60(Static222.aClass44_2, Static193.anInt7803, Static197.aClass161_44);
				Static68.aClass233_2 = new Class233(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static236.aClass58_3 = new Class58(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static299.aClass69_2 = new Class69(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109, Static549.aClass161_119);
				Static382.aClass275_1 = new Class275(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static92.aClass316_1 = new Class316(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static454.aClass298_3 = new Class298(Static222.aClass44_2, Static193.anInt7803, true, Static211.aClass161_49, Static549.aClass161_119);
				Static531.aClass135_4 = new Class135(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109, Static19.aClass161_7);
				Static241.aClass198_15 = new Class198(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109, Static19.aClass161_7);
				Static345.aClass154_1 = new Class154(Static222.aClass44_2, Static193.anInt7803, true, Static205.aClass161_46, Static549.aClass161_119);
				Static99.aClass96_7 = new Class96(Static222.aClass44_2, Static193.anInt7803, true, Static37.aClass121_1, Static350.aClass161_75, Static549.aClass161_119);
				Static174.aClass282_1 = new Class282(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static46.aClass247_1 = new Class247(Static222.aClass44_2, Static193.anInt7803, Static326.aClass161_66, Static23.aClass161_84, Static480.aClass161_106);
				Static443.aClass72_1 = new Class72(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static144.aClass274_1 = new Class274(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static17.aClass231_2 = new Class231(Static222.aClass44_2, Static193.anInt7803, Static350.aClass161_76, Static549.aClass161_119);
				Static339.aClass318_3 = new Class318(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static103.aClass94_1 = new Class94(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Class6_Sub1_Sub3.lb = new Class55(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static231.aClass280_1 = new Class280(Static222.aClass44_2, Static193.anInt7803, Static166.aClass161_78);
				Static98.aClass309_1 = new Class309(Static222.aClass44_2, Static193.anInt7803, Static492.aClass161_109);
				Static541.method7733(Static549.aClass161_119, Static62.aClass161_105, Static469.aClass161_101, Static19.aClass161_7);
				Static233.method4155(Static70.aClass161_6);
				Static431.aClass62_1 = new Class62(Static193.anInt7803, Static357.aClass161_77, Static424.aClass161_94);
				Static494.aClass227_2 = new Class227(Static193.anInt7803, Static357.aClass161_77, Static424.aClass161_94, new Class188());
				Static7.aString6 = Static414.aClass67_126.method1934(Static193.anInt7803);
				Static47.anInt9385 = 65;
				Static491.method7789();
				Static454.aClass298_3.method7187(!Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091));
				Static127.aClass215_1 = new Class215();
				Static467.method6980();
				Static208.method3832(Static191.aClass161_43);
				Static430.method7550(Static202.anInterface4_10, Static549.aClass161_119);
				Static168.anInt3862 = 120;
			}
		} else if (Static168.anInt3862 == 120) {
			local6 = Static147.method2515(Static19.aClass161_7);
			local55 = Static264.method4647();
			if (local55 > local6) {
				Static7.aString6 = Static265.aClass67_81.method1934(Static193.anInt7803) + local6 * 100 / local55 + "%";
				Static47.anInt9385 = 70;
			} else {
				Static463.method6911(Static19.aClass161_7, Static121.aClass5_7);
				Static315.method5108(Static122.aClass119Array8);
				Static7.aString6 = Static321.aClass67_98.method1934(Static193.anInt7803);
				Static47.anInt9385 = 70;
				Static168.anInt3862 = 130;
			}
		} else if (Static168.anInt3862 == 130) {
			if (Static26.aClass161_9.method4258("huffman", "")) {
				@Pc(1557) Class13 local1557 = new Class13(Static26.aClass161_9.method4238("", "huffman"));
				Static247.method4272(local1557);
				Static7.aString6 = Static194.aClass67_59.method1934(Static193.anInt7803);
				Static47.anInt9385 = 75;
				Static168.anInt3862 = 140;
			} else {
				Static7.aString6 = Static440.aClass67_132.method1934(Static193.anInt7803) + "0%";
				Static47.anInt9385 = 75;
			}
		} else if (Static168.anInt3862 == 140) {
			if (Static469.aClass161_101.method4262()) {
				Static7.aString6 = Static226.aClass67_71.method1934(Static193.anInt7803);
				Static47.anInt9385 = 80;
				Static168.anInt3862 = 150;
			} else {
				Static7.aString6 = Static305.aClass67_95.method1934(Static193.anInt7803) + Static469.aClass161_101.method4263() + "%";
				Static47.anInt9385 = 80;
			}
		} else if (Static168.anInt3862 == 150) {
			if (Static310.aClass161_61.method4262()) {
				Static7.aString6 = Static144.aClass67_43.method1934(Static193.anInt7803);
				Static47.anInt9385 = 82;
				Static168.anInt3862 = 160;
			} else {
				Static7.aString6 = Static301.aClass67_91.method1934(Static193.anInt7803) + Static310.aClass161_61.method4263() + "%";
				Static47.anInt9385 = 82;
			}
		} else if (Static168.anInt3862 == 160) {
			if (Static62.aClass161_105.method4262()) {
				Static7.aString6 = Static378.aClass67_119.method1934(Static193.anInt7803);
				Static47.anInt9385 = 85;
				Static168.anInt3862 = 170;
			} else {
				Static7.aString6 = Static378.aClass67_119.method1934(Static193.anInt7803) + Static62.aClass161_105.method4263() + "%";
				Static47.anInt9385 = 85;
			}
		} else if (Static168.anInt3862 == 170) {
			if (Static4.aClass161_114.method4246("details")) {
				Static55.method1845(Static4.aClass161_114, Static68.aClass233_2, Static236.aClass58_3, Static454.aClass298_3, Static531.aClass135_4, Static241.aClass198_15, Static127.aClass215_1);
				Static7.aString6 = Static369.aClass67_112.method1934(Static193.anInt7803);
				Static47.anInt9385 = 89;
				Static168.anInt3862 = 190;
			} else {
				Static7.aString6 = Static280.aClass67_85.method1934(Static193.anInt7803) + Static4.aClass161_114.method4267("details") + "%";
				Static47.anInt9385 = 87;
			}
		} else if (Static168.anInt3862 == 190) {
			Static4.aBooleanArray44 = new boolean[Class6_Sub1_Sub3.lb.anInt1605];
			Static122.aStringArray17 = new String[Static103.aClass94_1.anInt2898];
			Static416.anIntArray153 = new int[Class6_Sub1_Sub3.lb.anInt1605];
			for (local6 = 0; local6 < Class6_Sub1_Sub3.lb.anInt1605; local6++) {
				if (Class6_Sub1_Sub3.lb.method1463(local6).anInt6313 == 0) {
					Static4.aBooleanArray44[local6] = true;
					Static176.anInt4108++;
				}
				Static416.anIntArray153[local6] = -1;
			}
			Static118.method2165();
			Static194.anInt4422 = Static469.aClass161_101.method4240("loginscreen");
			Static524.anInt9120 = Static469.aClass161_101.method4240("lobbyscreen");
			Static307.aClass161_51.method4255(false);
			Static460.aClass161_42.method4255(true);
			Static19.aClass161_7.method4255(true);
			Static62.aClass161_105.method4255(true);
			Static26.aClass161_9.method4255(true);
			Static469.aClass161_101.method4255(true);
			Static180.aBoolean300 = true;
			Static492.aClass161_109.anInt5061 = 2;
			Static197.aClass161_44.anInt5061 = 2;
			Static211.aClass161_49.anInt5061 = 2;
			Static205.aClass161_46.anInt5061 = 2;
			Static350.aClass161_75.anInt5061 = 2;
			Static326.aClass161_66.anInt5061 = 2;
			Static350.aClass161_76.anInt5061 = 2;
			Static295.method4940(-1, Static7.aClass3_Sub15_Sub1_1.anInt8369, false, -1);
			Static7.aString6 = Static154.aClass67_49.method1934(Static193.anInt7803);
			Static47.anInt9385 = 95;
			Static168.anInt3862 = 200;
		} else if (Static168.anInt3862 == 200) {
			Static333.method5283(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1274() {
		if (Static421.aBoolean556) {
			Static135.method2314();
		}
		if (Static121.aClass5_7 != null) {
			Static121.aClass5_7.method7437();
		}
		if (Static258.aFrame2 != null) {
			Static523.method7515(Static258.aFrame2, Static401.aClass285_11);
			Static258.aFrame2 = null;
		}
		if (Static467.aClass41_1 != null) {
			Static467.aClass41_1.method1066();
			Static467.aClass41_1 = null;
		}
		Static280.method4815();
		Static349.aClass153_2.method4120();
		Static412.aClass162_3.method4273();
		if (Static370.aClass251_1 != null) {
			Static370.aClass251_1.method6164();
			Static370.aClass251_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1298() {
		@Pc(26) int local26;
		if (Static512.anInt8932 == 6 && Static428.anInt7883 == 0) {
			if (Static270.anInt5584 > 1) {
				Static270.anInt5584--;
				Static483.anInt8679 = Static446.anInt8177;
			}
			if (!Static228.aBoolean342) {
				Static238.method4168();
			}
			for (local26 = 0; local26 < 100 && Static404.method6139(); local26++) {
			}
		}
		Static276.anInt5695++;
		Static402.method7156(-1, null, -1);
		Static324.method5200(null, -1, -1);
		Static320.method5154();
		Static446.anInt8177++;
		for (local26 = 0; local26 < Static183.anInt5938; local26++) {
			@Pc(72) Class6_Sub1_Sub2_Sub2 local72 = Static47.aClass3_Sub3Array4[local26].aClass6_Sub1_Sub2_Sub2_1;
			if (local72 != null) {
				@Pc(78) byte local78 = local72.aClass230_1.aByte57;
				if ((local78 & 0x1) != 0) {
					@Pc(89) int local89 = local72.method7083();
					@Pc(113) int local113;
					if ((local78 & 0x2) != 0 && local72.anInt8599 == 0 && Math.random() * 1000.0D < 10.0D) {
						local113 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(121) int local121 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local113 != 0 || local121 != 0) {
							@Pc(138) int local138 = local72.anIntArray733[0] + local113;
							if (local138 < 0) {
								local138 = 0;
							} else if (Static118.anInt2527 - local89 - 1 < local138) {
								local138 = Static118.anInt2527 - local89 - 1;
							}
							@Pc(171) int local171 = local72.anIntArray734[0] + local121;
							if (local171 < 0) {
								local171 = 0;
							} else if (Static549.anInt9482 - local89 - 1 < local171) {
								local171 = Static549.anInt9482 - local89 - 1;
							}
							@Pc(218) int local218 = Static165.method3200(0, local72.anIntArray734[0], local89, local89, Static333.anIntArray549, Static95.aClass306Array1[local72.aByte100], Static80.anIntArray199, true, local89, 0, -1, local72.anIntArray733[0], local171, local138);
							if (local218 > 0) {
								if (local218 > 9) {
									local218 = 9;
								}
								for (@Pc(229) int local229 = 0; local229 < local218; local229++) {
									local72.anIntArray733[local229] = Static80.anIntArray199[local218 - local229 - 1];
									local72.anIntArray734[local229] = Static333.anIntArray549[local218 - local229 - 1];
									local72.aByteArray99[local229] = 1;
								}
								local72.anInt8599 = local218;
							}
						}
					}
					Static90.method1817(true, local72);
					local113 = Static122.method2337(local72);
					Static289.method4899(Static463.anInt8327, local113, Static57.anInt1228, local72);
					Static187.method3527(local72);
				}
			}
		}
		if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
			if (Static305.anInt5998 == 2) {
				Static437.method6620();
			} else {
				Static531.method7629();
			}
			if (Static311.anInt6050 >> 9 < 14 || Static118.anInt2527 - 14 <= Static311.anInt6050 >> 9 || Static329.anInt6297 >> 9 < 14 || Static549.anInt9482 - 14 <= Static329.anInt6297 >> 9) {
				Static19.method725();
			}
		}
		while (true) {
			@Pc(355) Class3_Sub21 local355;
			@Pc(360) Class245 local360;
			@Pc(371) Class245 local371;
			do {
				local355 = (Class3_Sub21) Static233.aClass71_40.method2084();
				if (local355 == null) {
					while (true) {
						do {
							local355 = (Class3_Sub21) Static375.aClass71_56.method2084();
							if (local355 == null) {
								while (true) {
									do {
										local355 = (Class3_Sub21) Static471.aClass71_64.method2084();
										if (local355 == null) {
											if (Static166.aClass245_12 != null) {
												Static296.method4948();
											}
											if (Static223.anInt4829 % 1500 == 0) {
												Static36.method875();
											}
											if (Static512.anInt8932 == 6 && Static428.anInt7883 == 0) {
												Static138.method2346();
											}
											Static396.method6030();
											if (Static421.aBoolean556 && Static491.aLong282 < Static12.method647() - 60000L) {
												Static135.method2314();
											}
											for (@Pc(527) Class4_Sub3_Sub2 local527 = (Class4_Sub3_Sub2) Static200.aClass90_19.method2326(); local527 != null; local527 = (Class4_Sub3_Sub2) Static200.aClass90_19.method2325()) {
												if ((long) local527.anInt6794 < Static12.method647() / 1000L - 5L) {
													if (local527.aShort100 > 0) {
														Static536.method7668("", 0, local527.aString48 + Static281.aClass67_86.method1934(Static193.anInt7803), "", 5, "");
													}
													if (local527.aShort100 == 0) {
														Static536.method7668("", 0, local527.aString48 + Static136.aClass67_39.method1934(Static193.anInt7803), "", 5, "");
													}
													local527.method7407();
												}
											}
											if (Static512.anInt8932 == 6 && Static428.anInt7883 == 0) {
												if (Static467.aClass41_1 == null) {
													Static180.method3441(false);
													return;
												}
												Static326.anInt6217++;
												if (Static326.anInt6217 > 50) {
													Static278.method4791(Static219.aClass158_60);
												}
												try {
													if (Static467.aClass41_1 != null && Static515.aClass3_Sub27_Sub1_2.anInt9191 > 0) {
														Static287.anInt5847 += Static515.aClass3_Sub27_Sub1_2.anInt9191;
														Static467.aClass41_1.method1065(Static515.aClass3_Sub27_Sub1_2.anInt9191, Static515.aClass3_Sub27_Sub1_2.aByteArray114);
														Static326.anInt6217 = 0;
														Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
														return;
													}
												} catch (@Pc(654) IOException local654) {
													Static180.method3441(false);
													return;
												}
											}
											return;
										}
										local360 = local355.aClass245_8;
										if (local360.anInt7264 < 0) {
											break;
										}
										local371 = Static46.method1005(local360.anInt7238);
									} while (local371 == null || local371.aClass245Array2 == null || local360.anInt7264 >= local371.aClass245Array2.length || local360 != local371.aClass245Array2[local360.anInt7264]);
									Static60.method1227(local355);
								}
							}
							local360 = local355.aClass245_8;
							if (local360.anInt7264 < 0) {
								break;
							}
							local371 = Static46.method1005(local360.anInt7238);
						} while (local371 == null || local371.aClass245Array2 == null || local371.aClass245Array2.length <= local360.anInt7264 || local371.aClass245Array2[local360.anInt7264] != local360);
						Static60.method1227(local355);
					}
				}
				local360 = local355.aClass245_8;
				if (local360.anInt7264 < 0) {
					break;
				}
				local371 = Static46.method1005(local360.anInt7238);
			} while (local371 == null || local371.aClass245Array2 == null || local371.aClass245Array2.length <= local360.anInt7264 || local371.aClass245Array2[local360.anInt7264] != local360);
			Static60.method1227(local355);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method1299() {
		@Pc(12) boolean local12 = Static349.aClass153_2.method4118();
		if (!local12) {
			this.method1287();
		}
	}
}
