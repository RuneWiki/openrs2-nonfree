import jagex3.jagmisc.jagmisc;
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
				Static142.method7674("Argument count");
			}
			Static495.aClass363_5 = new Class363();
			Static495.aClass363_5.anInt9891 = Integer.parseInt(arg0[0]);
			Static44.aClass363_2 = new Class363();
			Static44.aClass363_2.anInt9891 = Integer.parseInt(arg0[1]);
			Static181.aClass363_4 = new Class363();
			Static181.aClass363_4.anInt9891 = Integer.parseInt(arg0[2]);
			Static2.aClass135_1 = Static407.aClass135_14;
			if (arg0[3].equals("live")) {
				Static545.aClass228_14 = Static144.aClass228_1;
			} else if (arg0[3].equals("rc")) {
				Static545.aClass228_14 = Static343.aClass228_9;
			} else if (arg0[3].equals("wip")) {
				Static545.aClass228_14 = Static463.aClass228_11;
			} else {
				Static142.method7674("modewhat");
			}
			Static325.anInt6083 = Static159.method2861(arg0[4]);
			if (Static325.anInt6083 == -1) {
				if (arg0[4].equals("english")) {
					Static325.anInt6083 = 0;
				} else if (arg0[4].equals("german")) {
					Static325.anInt6083 = 1;
				} else {
					Static142.method7674("language");
				}
			}
			Static458.aBoolean561 = false;
			Static515.aBoolean636 = false;
			if (arg0[5].equals("game0")) {
				Static212.aClass222_2 = Static232.aClass222_3;
			} else if (arg0[5].equals("game1")) {
				Static212.aClass222_2 = Static542.aClass222_7;
			} else if (arg0[5].equals("game2")) {
				Static212.aClass222_2 = Static305.aClass222_5;
			} else if (arg0[5].equals("game3")) {
				Static212.aClass222_2 = Static449.aClass222_6;
			} else {
				Static142.method7674("game");
			}
			Static151.aLong77 = 0L;
			Static330.aString66 = "";
			Static58.anInt1583 = 0;
			Static301.aBoolean357 = true;
			Static136.aBoolean182 = true;
			Static574.aBoolean677 = false;
			Static93.aBoolean147 = false;
			Static279.aString58 = null;
			Static76.aString8 = null;
			Static459.anInt8079 = Static212.aClass222_2.anInt6790;
			Static331.anInt6182 = 0;
			Static572.anInt9441 = 0;
			@Pc(185) client local185 = new client();
			Static116.aClient1 = local185;
			local185.method1812(Static212.aClass222_2.aString72, Static545.aClass228_14.method5980() + 32);
			Static209.aFrame3.setLocation(40, 40);
		} catch (@Pc(208) Exception local208) {
			Static335.method5467(null, local208);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	protected void method1820() {
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 2) {
			this.method1831();
			return;
		}
		try {
			this.method1831();
		} catch (@Pc(25) ThreadDeath local25) {
			throw local25;
		} catch (@Pc(28) Throwable local28) {
			Static335.method5467(local28.getMessage() + " (Recovered) " + this.method1803(), local28);
			Static441.method6865(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1803() {
		@Pc(12) String local12 = null;
		try {
			local12 = "[1)" + Static299.anInt5307 + "," + Static171.anInt3340 + "," + Static634.anInt10129 + "," + Static638.anInt10172 + "|";
			if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 != null) {
				local12 = local12 + "2)" + Static549.anInt9262 + "," + (Static299.anInt5307 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0]) + "," + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0] + Static171.anInt3340) + "|";
			}
			local12 = local12 + "3)" + Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() + "|4)" + Static262.aClass3_Sub27_12.aClass21_Sub26_1.method8162() + "|5)" + Static634.method8682() + "|6)" + Static109.anInt2357 + "," + Static330.anInt6165 + "|";
			local12 = local12 + "7)" + Static262.aClass3_Sub27_12.aClass21_Sub12_1.method4533() + "|";
			local12 = local12 + "8)" + Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474() + "|";
			local12 = local12 + "9)" + Static262.aClass3_Sub27_12.aClass21_Sub15_1.method5810() + "|";
			local12 = local12 + "10)" + Static262.aClass3_Sub27_12.aClass21_Sub9_1.method3111() + "|";
			local12 = local12 + "11)" + Static262.aClass3_Sub27_12.aClass21_Sub29_1.method8645() + "|";
			local12 = local12 + "12)" + Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() + "|";
			local12 = local12 + "13)" + Static131.anInt2701 + "|";
			local12 = local12 + "14)" + Static485.anInt8420;
			try {
				local12 = local12 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(236) Throwable local236) {
			}
			try {
				if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 2) {
					@Pc(247) Class local247 = Class.forName("java.lang.ClassLoader");
					@Pc(251) Field local251 = local247.getDeclaredField("nativeLibraries");
					@Pc(254) Class local254 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(264) Method local264 = local254.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local264.invoke(local251, Boolean.TRUE);
					@Pc(287) Vector local287 = (Vector) local251.get(client.class.getClassLoader());
					for (@Pc(289) int local289 = 0; local287.size() > local289; local289++) {
						try {
							@Pc(295) Object local295 = local287.elementAt(local289);
							@Pc(300) Field local300 = local295.getClass().getDeclaredField("name");
							local264.invoke(local300, Boolean.TRUE);
							try {
								@Pc(315) String local315 = (String) local300.get(local295);
								if (local315 != null && local315.indexOf("sw3d.dll") != -1) {
									@Pc(328) Field local328 = local295.getClass().getDeclaredField("handle");
									local264.invoke(local328, Boolean.TRUE);
									local12 = local12 + "|16)" + Long.toHexString(local328.getLong(local295));
									local264.invoke(local328, Boolean.FALSE);
								}
							} catch (@Pc(364) Throwable local364) {
							}
							local264.invoke(local300, Boolean.FALSE);
						} catch (@Pc(376) Throwable local376) {
						}
					}
				}
			} catch (@Pc(388) Throwable local388) {
			}
			local12 = local12 + "]";
		} catch (@Pc(399) Throwable local399) {
		}
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1827() {
		if (Static223.anInt4249 < Static365.aClass248_1.anInt7432) {
			Static4.aClass363_1.method8469();
			Static524.anInt8436 = (Static365.aClass248_1.anInt7432 - 1) * 50 * 5;
			if (Static524.anInt8436 > 3000) {
				Static524.anInt8436 = 3000;
			}
			if (Static365.aClass248_1.anInt7432 >= 2 && Static365.aClass248_1.anInt7431 == 6) {
				this.method1822("js5connect_outofdate");
				Static485.anInt8420 = 14;
				return;
			}
			if (Static365.aClass248_1.anInt7432 >= 4 && Static365.aClass248_1.anInt7431 == -1) {
				this.method1822("js5crc");
				Static485.anInt8420 = 14;
				return;
			}
			if (Static365.aClass248_1.anInt7432 >= 4 && Static514.method7665(Static485.anInt8420)) {
				if (Static365.aClass248_1.anInt7431 == 7 || Static365.aClass248_1.anInt7431 == 9) {
					this.method1822("js5connect_full");
				} else if (Static365.aClass248_1.anInt7431 <= 0) {
					this.method1822("js5io");
				} else if (Static395.aString79 == null) {
					this.method1822("js5connect");
				} else {
					this.method1822("js5proxy_" + Static395.aString79.trim());
				}
				Static485.anInt8420 = 14;
				return;
			}
		}
		Static223.anInt4249 = Static365.aClass248_1.anInt7432;
		if (Static524.anInt8436 > 0) {
			Static524.anInt8436--;
			return;
		}
		try {
			if (Static391.anInt7254 == 0) {
				Static127.aClass304_1 = Static4.aClass363_1.method8471(Static205.aClass138_2);
				Static391.anInt7254++;
			}
			if (Static391.anInt7254 == 1) {
				if (Static127.aClass304_1.anInt8838 == 2) {
					if (Static127.aClass304_1.anObject16 != null) {
						Static395.aString79 = (String) Static127.aClass304_1.anObject16;
					}
					this.method1834(1000);
					return;
				}
				if (Static127.aClass304_1.anInt8838 == 1) {
					Static391.anInt7254++;
				}
			}
			if (Static391.anInt7254 == 2) {
				Static261.aClass305_1 = new Class305((Socket) Static127.aClass304_1.anObject16, Static205.aClass138_2, 25000);
				@Pc(193) Class3_Sub3 local193 = new Class3_Sub3(5);
				local193.method4220(Static624.aClass136_2.anInt4034);
				local193.method4265(630);
				Static261.aClass305_1.method7636(5, local193.aByteArray54);
				Static391.anInt7254++;
				Static489.aLong227 = Static374.method6036();
			}
			if (Static391.anInt7254 == 3) {
				if (Static514.method7665(Static485.anInt8420) || Static261.aClass305_1.method7635() > 0) {
					@Pc(237) int local237 = Static261.aClass305_1.method7633();
					if (local237 != 0) {
						this.method1834(local237);
						return;
					}
					Static391.anInt7254++;
				} else if (Static374.method6036() - Static489.aLong227 > 30000L) {
					this.method1834(1001);
					return;
				}
			}
			if (Static391.anInt7254 == 4) {
				@Pc(282) boolean local282 = Static514.method7665(Static485.anInt8420) || Static103.method2142(Static485.anInt8420) || Static365.method5961(Static485.anInt8420);
				@Pc(285) Class255[] local285 = Static420.method6588();
				@Pc(293) Class3_Sub3 local293 = new Class3_Sub3(local285.length * 4);
				Static261.aClass305_1.method7634(local293.aByteArray54, local293.aByteArray54.length, 0);
				for (@Pc(304) int local304 = 0; local304 < local285.length; local304++) {
					local285[local304].method6586(local293.method4207());
				}
				Static365.aClass248_1.method6448(Static261.aClass305_1, !local282);
				Static391.anInt7254 = 0;
				Static127.aClass304_1 = null;
				Static261.aClass305_1 = null;
			}
		} catch (@Pc(342) IOException local342) {
			this.method1834(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1807() {
		if (Static440.aBoolean552) {
			Static52.method1478();
		}
		Static352.method5819();
		if (Static323.aClass5_9 != null) {
			Static323.aClass5_9.method7548();
		}
		if (Static4.aFrame1 != null) {
			Static261.method4323(Static205.aClass138_2, Static4.aFrame1);
			Static4.aFrame1 = null;
		}
		if (Static413.aClass230_1 != null) {
			Static413.aClass230_1.method6028();
			Static413.aClass230_1 = null;
		}
		Static568.method8120();
		Static365.aClass248_1.method6455();
		Static168.aClass266_2.method6907();
		if (Static465.aClass27_1 != null) {
			Static465.aClass27_1.method1256();
			Static465.aClass27_1 = null;
		}
		try {
			Static607.aClass173_7.method4425();
			for (@Pc(55) int local55 = 0; local55 < 37; local55++) {
				Static497.aClass173Array1[local55].method4425();
			}
			Static182.aClass173_2.method4425();
			Static43.aClass173_1.method4425();
			Static421.method6612();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1828() {
		if (Static485.anInt8420 == 14) {
			return;
		}
		@Pc(18) long local18 = Static401.method6459() / 1000000L - Static182.aLong92;
		Static182.aLong92 = Static401.method6459() / 1000000L;
		@Pc(30) boolean local30 = Static390.method6326();
		if (local30 && Static120.aBoolean173 && Static105.aClass188_1 != null) {
			Static105.aClass188_1.method7767();
		}
		if (Static317.method5191(Static485.anInt8420)) {
			if (Static215.aLong115 != 0L && Static374.method6036() > Static215.aLong115) {
				Static398.method6435(Static10.anInt590, false, Static274.anInt4967, Static634.method8682());
			} else if (!Static323.aClass5_9.method7518() && Static406.aBoolean531) {
				Static1.method8296();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static4.aFrame1 == null) {
			@Pc(80) Container local80;
			if (Static209.aFrame3 != null) {
				local80 = Static209.aFrame3;
			} else if (Static504.anApplet2 == null) {
				local80 = Static128.anApplet_Sub1_1;
			} else {
				local80 = Static504.anApplet2;
			}
			local92 = local80.getSize().width;
			local96 = local80.getSize().height;
			if (Static209.aFrame3 == local80) {
				@Pc(102) Insets local102 = Static209.aFrame3.getInsets();
				local96 -= local102.top + local102.bottom;
				local92 -= local102.left + local102.right;
			}
			if (local92 != Static463.anInt7087 || local96 != Static73.anInt1757 || Static314.aBoolean418) {
				if (Static323.aClass5_9 == null || Static323.aClass5_9.method7559()) {
					Static157.method2847();
				} else {
					Static463.anInt7087 = local92;
					Static73.anInt1757 = local96;
				}
				Static215.aLong115 = Static374.method6036() + 500L;
				Static314.aBoolean418 = false;
			}
		}
		if (Static4.aFrame1 != null && !Static638.aBoolean726 && Static317.method5191(Static485.anInt8420)) {
			Static398.method6435(-1, false, -1, Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086());
		}
		@Pc(172) boolean local172 = false;
		if (Static20.aBoolean62) {
			Static20.aBoolean62 = false;
			local172 = true;
		}
		if (local172) {
			Static428.method4107();
		}
		if (Static323.aClass5_9 != null && Static323.aClass5_9.method7518() || Static634.method8682() != 1) {
			Static40.method1343();
		}
		if (Static514.method7665(Static485.anInt8420)) {
			Static354.method5836(local172);
		} else if (Static503.method7431(Static485.anInt8420)) {
			Static214.method3617();
		} else if (Static545.method8455(Static485.anInt8420)) {
			Static214.method3617();
		} else if (Static487.method7257(Static485.anInt8420)) {
			if (Static263.anInt4810 == 1) {
				if (Static177.anInt3434 < Static236.anInt4460) {
					Static177.anInt3434 = Static236.anInt4460;
				}
				local92 = (Static177.anInt3434 - Static236.anInt4460) * 50 / Static177.anInt3434;
				Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, true, Static59.aClass43_12.method1598(Static325.anInt6083) + "<br>(" + local92 + "%)");
			} else if (Static263.anInt4810 == 2) {
				if (Static9.anInt584 < Static365.anInt6937) {
					Static9.anInt584 = Static365.anInt6937;
				}
				local92 = (Static9.anInt584 - Static365.anInt6937) * 50 / Static9.anInt584 + 50;
				Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, true, Static59.aClass43_12.method1598(Static325.anInt6083) + "<br>(" + local92 + "%)");
			} else {
				Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, true, Static59.aClass43_12.method1598(Static325.anInt6083));
			}
		} else if (Static485.anInt8420 == 10) {
			Static93.method2086(local18);
		} else if (Static485.anInt8420 == 13) {
			Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, false, Static59.aClass43_14.method1598(Static325.anInt6083) + "<br>" + Static59.aClass43_15.method1598(Static325.anInt6083));
		}
		if (Static277.anInt4996 == 3) {
			for (local92 = 0; local92 < Static619.anInt10014; local92++) {
				@Pc(366) Rectangle local366 = Class10_Sub2.aRectangleArray2[local92];
				if (Static504.aBooleanArray23[local92]) {
					Static323.aClass5_9.method7513(local366.x, local366.y, local366.height, local366.width, -65281);
				} else if (Static314.aBooleanArray17[local92]) {
					Static323.aClass5_9.method7513(local366.x, local366.y, local366.height, local366.width, -65536);
				} else {
					Static323.aClass5_9.method7513(local366.x, local366.y, local366.height, local366.width, -16711936);
				}
			}
		}
		if (Static3.method35()) {
			Static644.method8774(Static323.aClass5_9);
		}
		if (Static205.aClass138_2.aBoolean278 && Static317.method5191(Static485.anInt8420) && Static277.anInt4996 == 0 && Static634.method8682() == 1 && !local172) {
			local92 = 0;
			for (local96 = 0; local96 < Static619.anInt10014; local96++) {
				if (Static314.aBooleanArray17[local96]) {
					Static314.aBooleanArray17[local96] = false;
					Static421.aRectangleArray1[local92++] = Class10_Sub2.aRectangleArray2[local96];
				}
			}
			try {
				if (Static219.aBoolean285) {
					Static270.method4454(local92, Static421.aRectangleArray1);
				} else {
					Static323.aClass5_9.method7558(local92, Static421.aRectangleArray1);
				}
			} catch (@Pc(547) Exception_Sub1 local547) {
			}
		} else if (!Static514.method7665(Static485.anInt8420)) {
			for (local92 = 0; local92 < Static619.anInt10014; local92++) {
				Static314.aBooleanArray17[local92] = false;
			}
			try {
				if (Static219.aBoolean285) {
					Static413.method6519();
				} else {
					Static323.aClass5_9.method7557();
				}
			} catch (@Pc(481) Exception_Sub1 local481) {
				Static335.method5467(local481.getMessage() + " (Recovered) " + this.method1803(), local481);
				Static441.method6865(false, 0);
			}
		}
		Static451.method6956();
		local92 = Static262.aClass3_Sub27_12.aClass21_Sub24_1.method7795();
		if (local92 == 0) {
			Static258.method4293(15L);
		} else if (local92 == 1) {
			Static258.method4293(10L);
		} else if (local92 == 2) {
			Static258.method4293(5L);
		} else if (local92 == 3) {
			Static258.method4293(2L);
		}
		if (Static238.aBoolean299) {
			Static300.method4786();
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub11_1.method4362() == 1 && Static485.anInt8420 == 3 && Static307.anInt5465 != -1) {
			Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub11_1);
			Static108.method2177();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method1819() {
		if (Static504.anApplet2 != null && Static364.aCanvas13 == null && !Static205.aClass138_2.aBoolean278) {
			try {
				@Pc(13) Class local13 = Static504.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static364.aCanvas13 = (Canvas) local17.get(Static504.anApplet2);
				local17.set(Static504.anApplet2, null);
				if (Static364.aCanvas13 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1819();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1805()) {
			return;
		}
		Static495.aClass363_5 = new Class363();
		Static495.aClass363_5.anInt9891 = Integer.parseInt(this.getParameter("worldid"));
		Static44.aClass363_2 = new Class363();
		Static44.aClass363_2.anInt9891 = Integer.parseInt(this.getParameter("lobbyid"));
		Static44.aClass363_2.aString109 = this.getParameter("lobbyaddress");
		Static181.aClass363_4 = new Class363();
		Static181.aClass363_4.anInt9891 = Integer.parseInt(this.getParameter("demoid"));
		Static181.aClass363_4.aString109 = this.getParameter("demoaddress");
		Static2.aClass135_1 = Static177.method3082(Integer.parseInt(this.getParameter("modewhere")));
		if (Static2.aClass135_1 == Static407.aClass135_14) {
			Static2.aClass135_1 = Static350.aClass135_12;
		} else if (!Static121.method2421(Static2.aClass135_1) && Static42.aClass135_2 != Static2.aClass135_1) {
			Static2.aClass135_1 = Static42.aClass135_2;
		}
		Static545.aClass228_14 = Static596.method8357(Integer.parseInt(this.getParameter("modewhat")));
		if (Static545.aClass228_14 != Static463.aClass228_11 && Static545.aClass228_14 != Static343.aClass228_9 && Static144.aClass228_1 != Static545.aClass228_14) {
			Static545.aClass228_14 = Static144.aClass228_1;
		}
		try {
			Static325.anInt6083 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static325.anInt6083 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static458.aBoolean561 = true;
		} else {
			Static458.aBoolean561 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static515.aBoolean636 = true;
		} else {
			Static515.aBoolean636 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static595.aBoolean728 = true;
		} else {
			Static595.aBoolean728 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static212.aClass222_2 = Static232.aClass222_3;
			} else if (local152.equals("1")) {
				Static212.aClass222_2 = Static542.aClass222_7;
			} else if (local152.equals("2")) {
				Static212.aClass222_2 = Static305.aClass222_5;
			} else if (local152.equals("3")) {
				Static212.aClass222_2 = Static449.aClass222_6;
			}
		}
		try {
			Static58.anInt1583 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static58.anInt1583 = 0;
		}
		Static603.aString108 = this.getParameter("quiturl");
		Static330.aString66 = this.getParameter("settings");
		if (Static330.aString66 == null) {
			Static330.aString66 = "";
		}
		Static141.aBoolean184 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static572.anInt9441 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static572.anInt9441 = 0;
			}
		}
		Static459.anInt8079 = Integer.parseInt(this.getParameter("colourid"));
		if (Static459.anInt8079 < 0 || Static128.aColorArray10.length <= Static459.anInt8079) {
			Static459.anInt8079 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static301.aBoolean357 = true;
			Static136.aBoolean182 = true;
		}
		@Pc(254) String local254 = this.getParameter("frombilling");
		if (local254 != null && local254.equals("true")) {
			Static93.aBoolean147 = true;
		}
		Static76.aString8 = this.getParameter("sskey");
		if (Static76.aString8 != null && Static76.aString8.length() < 2) {
			Static76.aString8 = null;
		}
		@Pc(278) String local278 = this.getParameter("force64mb");
		if (local278 != null && local278.equals("true")) {
			Static574.aBoolean677 = true;
		}
		@Pc(290) String local290 = this.getParameter("worldflags");
		if (local290 != null) {
			try {
				Static331.anInt6182 = Integer.parseInt(local290);
			} catch (@Pc(297) Exception local297) {
			}
		}
		@Pc(302) String local302 = this.getParameter("userFlow");
		if (local302 != null) {
			try {
				Static151.aLong77 = Long.parseLong(local302);
			} catch (@Pc(309) NumberFormatException local309) {
			}
		}
		Static279.aString58 = this.getParameter("additionalInfo");
		if (Static279.aString58 != null && Static279.aString58.length() > 50) {
			Static279.aString58 = null;
		}
		Static116.aClient1 = this;
		if (Static212.aClass222_2 == Static232.aClass222_3) {
			Static90.anInt2181 = 503;
			Static612.anInt9912 = 765;
		} else if (Static212.aClass222_2 == Static542.aClass222_7) {
			Static612.anInt9912 = 640;
			Static90.anInt2181 = 480;
		}
		this.method1817(Static545.aClass228_14.method5980() + 32, Static212.aClass222_2.aString72, Static612.anInt9912, Static90.anInt2181);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1831() {
		if (Static485.anInt8420 == 14) {
			return;
		}
		Static101.anInt2262++;
		if (Static101.anInt2262 % 1000 == 1) {
			@Pc(30) GregorianCalendar local30 = new GregorianCalendar();
			Static526.anInt8988 = local30.get(11) * 600 + local30.get(12) * 10 + local30.get(13) / 6;
			Static310.aRandom1.setSeed((long) Static526.anInt8988);
		}
		if (Static101.anInt2262 % 50 == 0) {
			Static277.anInt4995 = Static482.anInt8389;
			Static272.anInt4940 = Static553.anInt9279;
			Static482.anInt8389 = 0;
			Static553.anInt9279 = 0;
		}
		this.method1832();
		if (Static618.aClass295_1 != null) {
			Static618.aClass295_1.method7326();
		}
		Static258.method4294();
		Static594.method8340();
		Static339.aClass163_1.method4108();
		Static483.aClass191_1.method6983();
		if (Static323.aClass5_9 != null) {
			Static323.aClass5_9.method7509((int) Static374.method6036());
		}
		Static356.method5861();
		Static447.anInt7968 = 0;
		Static611.anInt9889 = 0;
		for (@Pc(99) Interface5 local99 = Static339.aClass163_1.method4109(); local99 != null; local99 = Static339.aClass163_1.method4109()) {
			@Pc(105) int local105 = local99.method7868();
			if (local105 == 2 || local105 == 3) {
				@Pc(119) char local119 = local99.method7866();
				if (Static513.method7657() && (local119 == '`' || local119 == '§' || local119 == '²')) {
					if (Static3.method35()) {
						Static510.method7624();
					} else {
						Static345.method5779();
					}
				} else if (Static611.anInt9889 < 128) {
					Static283.anInterface5Array5[Static611.anInt9889] = local99;
					Static611.anInt9889++;
				}
			} else if (local105 == 0 && Static447.anInt7968 < 75) {
				Static391.anInterface5Array6[Static447.anInt7968] = local99;
				Static447.anInt7968++;
			}
		}
		Static472.anInt8271 = 0;
		for (@Pc(191) Class3_Sub31 local191 = Static483.aClass191_1.method6986(); local191 != null; local191 = Static483.aClass191_1.method6986()) {
			@Pc(197) int local197 = local191.method6923();
			if (local197 == -1) {
				Static489.aClass223_51.method5868(local191);
			} else if (local197 == 6) {
				Static472.anInt8271 += local191.method6920();
			} else if (Static255.method4269(local197)) {
				Static537.aClass223_58.method5868(local191);
				if (Static537.aClass223_58.method5866() > 10) {
					Static537.aClass223_58.method5872();
				}
			}
		}
		if (Static3.method35()) {
			Static582.method8232();
		}
		if (Static514.method7665(Static485.anInt8420)) {
			Static604.method8436();
			Static504.method7455();
		} else if (Static487.method7257(Static485.anInt8420)) {
			Static454.method6979();
		}
		if (Static103.method2142(Static485.anInt8420) && !Static487.method7257(Static485.anInt8420)) {
			this.method1840();
			Static279.method4518();
			Static379.method6104();
		} else if (Static365.method5961(Static485.anInt8420) && !Static487.method7257(Static485.anInt8420)) {
			this.method1840();
			Static379.method6104();
		} else if (Static485.anInt8420 == 12) {
			Static379.method6104();
		} else if (Static2.method22(Static485.anInt8420) && !Static487.method7257(Static485.anInt8420)) {
			Static481.method7185();
		} else if (Static485.anInt8420 == 13) {
			Static379.method6104();
			if (Static77.anInt1909 != -3 && Static77.anInt1909 != 2 && Static77.anInt1909 != 15) {
				Static439.method6845(false);
			}
		}
		Static596.method8355(Static323.aClass5_9);
		Static537.aClass223_58.method5872();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1832() {
		@Pc(11) boolean local11 = Static365.aClass248_1.method6451();
		if (!local11) {
			this.method1827();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1806() {
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 2) {
			this.method1828();
			return;
		}
		try {
			this.method1828();
		} catch (@Pc(18) ThreadDeath local18) {
			throw local18;
		} catch (@Pc(21) Throwable local21) {
			Static335.method5467(local21.getMessage() + " (Recovered) " + this.method1803(), local21);
			Static441.method6865(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1834(@OriginalArg(1) int arg0) {
		Static365.aClass248_1.anInt7431 = arg0;
		Static365.aClass248_1.anInt7432++;
		Static391.anInt7254 = 0;
		Static261.aClass305_1 = null;
		Static127.aClass304_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1810() {
		if (Static574.aBoolean677) {
			Static131.anInt2701 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static157.method2847();
		Static168.aClass266_2 = new Class266(Static205.aClass138_2);
		Static365.aClass248_1 = new Class248();
		Static402.method6463(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static2.aClass135_1 != Static42.aClass135_2) {
			Static178.aByteArrayArray33 = new byte[50][];
		}
		Static262.aClass3_Sub27_12 = Static374.method6033();
		if (Static42.aClass135_2 == Static2.aClass135_1) {
			Static495.aClass363_5.aString109 = this.getCodeBase().getHost();
		} else if (Static121.method2421(Static2.aClass135_1)) {
			Static495.aClass363_5.aString109 = this.getCodeBase().getHost();
			Static495.aClass363_5.anInt9884 = Static495.aClass363_5.anInt9891 + 40000;
			Static44.aClass363_2.anInt9884 = Static44.aClass363_2.anInt9891 + 40000;
			Static495.aClass363_5.anInt9890 = Static495.aClass363_5.anInt9891 + 50000;
			Static181.aClass363_4.anInt9884 = Static181.aClass363_4.anInt9891 + 40000;
			Static44.aClass363_2.anInt9890 = Static44.aClass363_2.anInt9891 + 50000;
			Static181.aClass363_4.anInt9890 = Static181.aClass363_4.anInt9891 + 50000;
		} else if (Static407.aClass135_14 == Static2.aClass135_1) {
			Static495.aClass363_5.aString109 = "127.0.0.1";
			Static44.aClass363_2.aString109 = "127.0.0.1";
			Static181.aClass363_4.aString109 = "127.0.0.1";
			Static495.aClass363_5.anInt9884 = Static495.aClass363_5.anInt9891 + 40000;
			Static44.aClass363_2.anInt9884 = Static44.aClass363_2.anInt9891 + 40000;
			Static495.aClass363_5.anInt9890 = Static495.aClass363_5.anInt9891 + 50000;
			Static181.aClass363_4.anInt9884 = Static181.aClass363_4.anInt9891 + 40000;
			Static44.aClass363_2.anInt9890 = Static44.aClass363_2.anInt9891 + 50000;
			Static181.aClass363_4.anInt9890 = Static181.aClass363_4.anInt9891 + 50000;
		}
		if (Static212.aClass222_2 == Static542.aClass222_7) {
			Static341.aShortArrayArrayArray5 = Static197.aShortArrayArrayArray2;
			Static596.anInt9743 = 0;
			Static394.anInt7316 = 16777215;
			Static585.aBoolean689 = true;
			Static494.aShortArrayArray14 = Static114.aShortArrayArray5;
		} else if (Static449.aClass222_6 == Static212.aClass222_2) {
			Static494.aShortArrayArray14 = Static286.aShortArrayArray11;
			Static341.aShortArrayArrayArray5 = Static82.aShortArrayArrayArray1;
		} else {
			Static494.aShortArrayArray14 = Static458.aShortArrayArray13;
			Static341.aShortArrayArrayArray5 = Static543.aShortArrayArrayArray6;
		}
		Static278.aShortArray71 = Static108.aShortArray26 = Static601.aShortArray145 = Static544.aShortArray144 = new short[256];
		Static4.aClass363_1 = Static495.aClass363_5;
		if (Static212.aClass222_2 == Static232.aClass222_3) {
			Static548.aBoolean664 = false;
		}
		try {
			Static510.aClipboard1 = Static116.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(226) Exception local226) {
		}
		Static339.aClass163_1 = Static386.method6227(Static364.aCanvas13);
		Static483.aClass191_1 = Static603.method8427(Static364.aCanvas13);
		try {
			if (Static205.aClass138_2.aClass175_1 != null) {
				Static607.aClass173_7 = new Class173(Static205.aClass138_2.aClass175_1, 5200, 0);
				for (@Pc(248) int local248 = 0; local248 < 37; local248++) {
					Static497.aClass173Array1[local248] = new Class173(Static205.aClass138_2.aClass175Array1[local248], 6000, 0);
				}
				Static182.aClass173_2 = new Class173(Static205.aClass138_2.aClass175_3, 6000, 0);
				Static479.aClass209_4 = new Class209(255, Static607.aClass173_7, Static182.aClass173_2, 500000);
				Static43.aClass173_1 = new Class173(Static205.aClass138_2.aClass175_2, 24, 0);
				Static205.aClass138_2.aClass175_3 = null;
				Static205.aClass138_2.aClass175Array1 = null;
				Static205.aClass138_2.aClass175_1 = null;
				Static205.aClass138_2.aClass175_2 = null;
			}
		} catch (@Pc(304) IOException local304) {
			Static43.aClass173_1 = null;
			Static479.aClass209_4 = null;
			Static182.aClass173_2 = null;
			Static607.aClass173_7 = null;
		}
		if (Static2.aClass135_1 != Static42.aClass135_2) {
			Static106.aBoolean155 = true;
		}
		Static323.aString65 = Static59.aClass43_12.method1598(Static325.anInt6083);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1804() {
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1840() {
		@Pc(27) int local27;
		if (Static485.anInt8420 == 7 && Static251.anInt4607 == 0) {
			if (Static458.anInt8066 > 1) {
				Static458.anInt8066--;
				Static406.anInt7450 = Static371.anInt7006;
			}
			if (!Static447.aBoolean555) {
				Static309.method5103();
			}
			for (local27 = 0; local27 < 100 && Static550.method6467(); local27++) {
			}
		}
		Static354.anInt6785++;
		Static556.method8021(-1, null, -1);
		Static464.method7045(null, -1, -1);
		Static163.method2897();
		Static371.anInt7006++;
		for (local27 = 0; local27 < Static294.anInt5193; local27++) {
			@Pc(71) Class4_Sub1_Sub2_Sub1_Sub1 local71 = Static28.aClass3_Sub28Array1[local27].aClass4_Sub1_Sub2_Sub1_Sub1_2;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass109_1.aByte35;
				if ((local77 & 0x1) != 0) {
					@Pc(88) int local88 = local71.method5059();
					@Pc(109) int local109;
					if ((local77 & 0x2) != 0 && local71.anInt5792 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(131) int local131 = local109 + local71.anIntArray310[0];
							@Pc(138) int local138 = local117 + local71.anIntArray309[0];
							if (local131 < 0) {
								local131 = 0;
							} else if (local131 > Static634.anInt10129 - local88 - 1) {
								local131 = Static634.anInt10129 - local88 - 1;
							}
							if (local138 < 0) {
								local138 = 0;
							} else if (Static638.anInt10172 - local88 - 1 < local138) {
								local138 = Static638.anInt10172 - local88 - 1;
							}
							@Pc(211) int local211 = Static585.method8266(local88, true, Static271.aClass105Array1[local71.aByte123], local88, -1, local131, 0, local88, local71.anIntArray309[0], 0, local138, Static259.anIntArray252, Static449.anIntArray496, local71.anIntArray310[0]);
							if (local211 > 0) {
								if (local211 > 9) {
									local211 = 9;
								}
								for (@Pc(222) int local222 = 0; local222 < local211; local222++) {
									local71.anIntArray310[local222] = Static259.anIntArray252[local211 - local222 - 1];
									local71.anIntArray309[local222] = Static449.anIntArray496[local211 - local222 - 1];
									local71.aByteArray61[local222] = 1;
								}
								local71.anInt5792 = local211;
							}
						}
					}
					Static475.method7128(local71, true);
					local109 = Static452.method2911(local71);
					Static223.method3719(local71);
					Static580.method8226(Static585.anInt9592, Static374.anInt7015, local109, local71);
					Static192.method3268(Static585.anInt9592, local71);
					Static130.method2518(local71);
				}
			}
		}
		if (Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
			if (Static305.anInt5422 == 2) {
				Static607.method8702();
			} else {
				Static169.method2961();
			}
			if (Static611.anInt9892 >> 9 < 14 || Static611.anInt9892 >> 9 >= Static634.anInt10129 - 14 || Static20.anInt824 >> 9 < 14 || Static638.anInt10172 - 14 <= Static20.anInt824 >> 9) {
				Static225.method7340();
			}
		}
		while (true) {
			@Pc(348) Class3_Sub21 local348;
			@Pc(353) Class279 local353;
			@Pc(361) Class279 local361;
			do {
				local348 = (Class3_Sub21) Static82.aClass223_11.method5872();
				if (local348 == null) {
					while (true) {
						do {
							local348 = (Class3_Sub21) Static483.aClass223_50.method5872();
							if (local348 == null) {
								while (true) {
									do {
										local348 = (Class3_Sub21) Static443.aClass223_45.method5872();
										if (local348 == null) {
											if (Static608.aClass279_18 != null) {
												Static179.method3112();
											}
											if (Static101.anInt2262 % 1500 == 0) {
												Static445.method6914();
											}
											if (Static485.anInt8420 == 7 && Static251.anInt4607 == 0) {
												Static586.method8274();
											}
											Static192.method3270();
											if (Static440.aBoolean552 && Static374.method6036() - 60000L > Static190.aLong102) {
												Static52.method1478();
											}
											for (@Pc(522) Class4_Sub2_Sub1 local522 = (Class4_Sub2_Sub1) Static643.aClass120_9.method2966(); local522 != null; local522 = (Class4_Sub2_Sub1) Static643.aClass120_9.method2962()) {
												if (Static374.method6036() / 1000L - 5L > (long) local522.anInt4538) {
													if (local522.aShort59 > 0) {
														Static582.method8231(local522.aString53 + Static59.aClass43_19.method1598(Static325.anInt6083), "", 5, 0, "", "");
													}
													if (local522.aShort59 == 0) {
														Static582.method8231(local522.aString53 + Static59.aClass43_20.method1598(Static325.anInt6083), "", 5, 0, "", "");
													}
													local522.method7841();
												}
											}
											if (Static485.anInt8420 == 7 && Static251.anInt4607 == 0) {
												if (Static413.aClass230_1 == null) {
													Static439.method6845(false);
													return;
												}
												Static556.anInt9294++;
												if (Static556.anInt9294 > 50) {
													@Pc(626) Class3_Sub14 local626 = Static139.method2308(Static55.aClass130_24, Static24.aClass233_1);
													Static562.method8096(local626);
												}
												try {
													Static154.method2812();
													return;
												} catch (@Pc(633) IOException local633) {
													Static439.method6845(false);
													return;
												}
											}
											return;
										}
										local353 = local348.aClass279_5;
										if (local353.anInt8147 < 0) {
											break;
										}
										local361 = Static433.method6771(local353.anInt8203);
									} while (local361 == null || local361.aClass279Array2 == null || local353.anInt8147 >= local361.aClass279Array2.length || local353 != local361.aClass279Array2[local353.anInt8147]);
									Static304.method4843(local348);
								}
							}
							local353 = local348.aClass279_5;
							if (local353.anInt8147 < 0) {
								break;
							}
							local361 = Static433.method6771(local353.anInt8203);
						} while (local361 == null || local361.aClass279Array2 == null || local361.aClass279Array2.length <= local353.anInt8147 || local361.aClass279Array2[local353.anInt8147] != local353);
						Static304.method4843(local348);
					}
				}
				local353 = local348.aClass279_5;
				if (local353.anInt8147 < 0) {
					break;
				}
				local361 = Static433.method6771(local353.anInt8203);
			} while (local361 == null || local361.aClass279Array2 == null || local361.aClass279Array2.length <= local353.anInt8147 || local353 != local361.aClass279Array2[local353.anInt8147]);
			Static304.method4843(local348);
		}
	}
}
