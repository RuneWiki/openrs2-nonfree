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
				Static164.method2811("Argument count");
			}
			Static412.aClass155_10 = new Class155();
			Static412.aClass155_10.anInt4152 = Integer.parseInt(arg0[0]);
			Static381.aClass155_15 = new Class155();
			Static381.aClass155_15.anInt4152 = Integer.parseInt(arg0[1]);
			Static408.aClass155_2 = new Class155();
			Static408.aClass155_2.anInt4152 = Integer.parseInt(arg0[2]);
			Static392.aClass373_6 = Static472.aClass373_7;
			if (arg0[3].equals("live")) {
				Static116.aClass168_1 = Static207.aClass168_2;
			} else if (arg0[3].equals("rc")) {
				Static116.aClass168_1 = Static248.aClass168_3;
			} else if (arg0[3].equals("wip")) {
				Static116.aClass168_1 = Static612.aClass168_5;
			} else {
				Static164.method2811("modewhat");
			}
			Static496.anInt7407 = Static525.method7301(arg0[4]);
			if (Static496.anInt7407 == -1) {
				if (arg0[4].equals("english")) {
					Static496.anInt7407 = 0;
				} else if (arg0[4].equals("german")) {
					Static496.anInt7407 = 1;
				} else {
					Static164.method2811("language");
				}
			}
			Static640.aBoolean751 = false;
			Static131.aBoolean221 = false;
			if (arg0[5].equals("game0")) {
				Static51.aClass17_2 = Static579.aClass17_5;
			} else if (arg0[5].equals("game1")) {
				Static51.aClass17_2 = Static112.aClass17_3;
			} else if (arg0[5].equals("game2")) {
				Static51.aClass17_2 = Static600.aClass17_6;
			} else if (arg0[5].equals("game3")) {
				Static51.aClass17_2 = Static463.aClass17_4;
			} else {
				Static164.method2811("game");
			}
			Static634.aBoolean746 = true;
			Static9.aBoolean20 = true;
			Static272.aBoolean375 = false;
			Static272.aLong122 = 0L;
			Static2.aString1 = null;
			Static112.aString22 = "";
			Static333.anInt5840 = 0;
			Static63.aString16 = null;
			Static145.anInt3032 = Static51.aClass17_2.anInt420;
			Static193.aBoolean755 = false;
			Static309.anInt7824 = 0;
			Static65.anInt1744 = 0;
			@Pc(187) client local187 = new client();
			Static509.aClient1 = local187;
			local187.method1717(Static51.aClass17_2.aString3, Static116.aClass168_1.method4189() + 32);
			Static80.aFrame2.setLocation(40, 40);
		} catch (@Pc(210) Exception local210) {
			Static25.method7457(local210, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1720() {
		@Pc(12) boolean local12 = Static194.aClass322_2.method7439();
		if (!local12) {
			this.method1726();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1714() {
		@Pc(10) String local10 = null;
		try {
			local10 = "[1)" + Static406.anInt6899 + "," + Static338.anInt5885 + "," + Static456.anInt7428 + "," + Static5.anInt112 + "|";
			if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 != null) {
				local10 = local10 + "2)" + Static531.anInt8550 + "," + (Static406.anInt6899 + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0]) + "," + (Static338.anInt5885 + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0]) + "|";
			}
			local10 = local10 + "3)" + Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() + "|4)" + Static305.aClass2_Sub49_15.aClass33_Sub7_1.method2924() + "|5)" + Static402.method6006() + "|6)" + Class16_Sub1_Sub5_Sub1.lb + "," + Static71.anInt1925 + "|";
			local10 = local10 + "7)" + Static305.aClass2_Sub49_15.aClass33_Sub20_1.method5562() + "|";
			local10 = local10 + "8)" + Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267() + "|";
			local10 = local10 + "9)" + Static305.aClass2_Sub49_15.aClass33_Sub17_1.method5248() + "|";
			local10 = local10 + "10)" + Static305.aClass2_Sub49_15.aClass33_Sub2_1.method1432() + "|";
			local10 = local10 + "11)" + Static305.aClass2_Sub49_15.aClass33_Sub26_1.method8367() + "|";
			local10 = local10 + "12)" + Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() + "|";
			local10 = local10 + "13)" + Static79.anInt2093 + "|";
			local10 = local10 + "14)" + Static454.anInt7416;
			if (Static153.aClass2_Sub42_1 != null) {
				local10 = local10 + "|15)" + Static153.aClass2_Sub42_1.anInt9302;
			}
			try {
				if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 2) {
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
									local10 = local10 + "|16)" + Long.toHexString(local324.getLong(local291));
									local261.invoke(local324, Boolean.FALSE);
								}
							} catch (@Pc(360) Throwable local360) {
							}
							local261.invoke(local296, Boolean.FALSE);
						} catch (@Pc(372) Throwable local372) {
						}
					}
				}
			} catch (@Pc(384) Throwable local384) {
			}
			local10 = local10 + "]";
		} catch (@Pc(395) Throwable local395) {
		}
		return local10;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1723() {
		if (Static454.anInt7416 == 14) {
			return;
		}
		Static389.anInt6694++;
		if (Static389.anInt6694 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static570.anInt9338 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static159.aRandom1.setSeed((long) Static570.anInt9338);
		}
		if (Static389.anInt6694 % 50 == 0) {
			Static357.anInt6186 = Static139.anInt2961;
			Static139.anInt2961 = 0;
			Static545.anInt8784 = Static253.anInt4808;
			Static253.anInt4808 = 0;
		}
		this.method1720();
		if (Static93.aClass89_1 != null) {
			Static93.aClass89_1.method2194();
		}
		Static335.method5089();
		Static613.method8566();
		Static185.aClass221_1.method8053();
		Static186.aClass358_1.method8727();
		if (Static141.aClass13_27 != null) {
			Static141.aClass13_27.method8097((int) Static48.method1203());
		}
		Static368.method5464();
		Static413.anInt6940 = 0;
		Static206.anInt3998 = 0;
		for (@Pc(95) Interface20 local95 = Static185.aClass221_1.method8051(); local95 != null; local95 = Static185.aClass221_1.method8051()) {
			@Pc(101) int local101 = local95.method7058();
			if (local101 == 2 || local101 == 3) {
				@Pc(115) char local115 = local95.method7056();
				if (Static316.method4864() && (local115 == '`' || local115 == '§' || local115 == '²')) {
					if (Static331.method5045()) {
						Static142.method2574();
					} else {
						Static618.method8597();
					}
				} else if (Static206.anInt3998 < 128) {
					Static248.anInterface20Array3[Static206.anInt3998] = local95;
					Static206.anInt3998++;
				}
			} else if (local101 == 0 && Static413.anInt6940 < 75) {
				Static51.anInterface20Array2[Static413.anInt6940] = local95;
				Static413.anInt6940++;
			}
		}
		Static617.anInt10101 = 0;
		for (@Pc(187) Class2_Sub1 local187 = Static186.aClass358_1.method8724(); local187 != null; local187 = Static186.aClass358_1.method8724()) {
			@Pc(193) int local193 = local187.method7153();
			if (local193 == -1) {
				Static232.aClass114_23.method2771(local187);
			} else if (local193 == 6) {
				Static617.anInt10101 += local187.method7154();
			} else if (Static448.method6400(local193)) {
				Static574.aClass114_53.method2771(local187);
				if (Static574.aClass114_53.method2766() > 10) {
					Static574.aClass114_53.method2765();
				}
			}
		}
		if (Static331.method5045()) {
			Static503.method7022();
		}
		if (Static266.method4376(Static454.anInt7416)) {
			Static233.method3736();
			Static127.method2286();
		} else if (Static243.method6205(Static454.anInt7416)) {
			Static28.method8899();
		}
		if (Static509.method7066(Static454.anInt7416) && !Static243.method6205(Static454.anInt7416)) {
			this.method1739();
			Static234.method3749();
			Static487.method6857();
		} else if (Static85.method1801(Static454.anInt7416) && !Static243.method6205(Static454.anInt7416)) {
			this.method1739();
			Static487.method6857();
		} else if (Static454.anInt7416 == 12) {
			Static487.method6857();
		} else if (Static19.method522(Static454.anInt7416) && !Static243.method6205(Static454.anInt7416)) {
			Static30.method658();
		} else if (Static454.anInt7416 == 13) {
			Static487.method6857();
			if (Static321.anInt5651 != -3 && Static321.anInt5651 != 2 && Static321.anInt5651 != 15) {
				Static448.method6402(false);
			}
		}
		Static283.method4511(Static141.aClass13_27);
		Static574.aClass114_53.method2765();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1724(@OriginalArg(0) int arg0) {
		Static229.aClass319_3 = null;
		Static194.aClass322_2.anInt8639 = arg0;
		Static194.aClass322_2.anInt8638++;
		Static57.anInt1428 = 0;
		Static232.aClass367_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1707() {
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != 2) {
			this.method1723();
			return;
		}
		try {
			this.method1723();
		} catch (@Pc(25) ThreadDeath local25) {
			throw local25;
		} catch (@Pc(28) Throwable local28) {
			Static25.method7457(local28, local28.getMessage() + " (Recovered) " + this.method1714());
			Static223.aBoolean283 = true;
			Static99.method1936(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1715() {
		if (Static272.aBoolean375) {
			Static79.anInt2093 = 64;
		}
		@Pc(19) Frame local19 = new Frame("Jagex");
		local19.pack();
		local19.dispose();
		Static141.method2565();
		Static216.aClass116_2 = new Class116(Static265.aClass286_3);
		Static194.aClass322_2 = new Class322();
		Static518.method7211(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static242.aClass373_4 != Static392.aClass373_6) {
			Static462.aByteArrayArray19 = new byte[50][];
		}
		Static305.aClass2_Sub49_15 = Static460.method6507();
		if (Static392.aClass373_6 == Static242.aClass373_4) {
			Static412.aClass155_10.aString38 = this.getCodeBase().getHost();
		} else if (Static15.method412(Static392.aClass373_6)) {
			Static412.aClass155_10.aString38 = this.getCodeBase().getHost();
			Static412.aClass155_10.anInt4155 = Static412.aClass155_10.anInt4152 + 40000;
			Static381.aClass155_15.anInt4155 = Static381.aClass155_15.anInt4152 + 40000;
			Static408.aClass155_2.anInt4155 = Static408.aClass155_2.anInt4152 + 40000;
			Static412.aClass155_10.anInt4150 = Static412.aClass155_10.anInt4152 + 50000;
			Static381.aClass155_15.anInt4150 = Static381.aClass155_15.anInt4152 + 50000;
			Static408.aClass155_2.anInt4150 = Static408.aClass155_2.anInt4152 + 50000;
		} else if (Static392.aClass373_6 == Static472.aClass373_7) {
			Static412.aClass155_10.aString38 = "127.0.0.1";
			Static381.aClass155_15.aString38 = "127.0.0.1";
			Static412.aClass155_10.anInt4155 = Static412.aClass155_10.anInt4152 + 40000;
			Static408.aClass155_2.aString38 = "127.0.0.1";
			Static381.aClass155_15.anInt4155 = Static381.aClass155_15.anInt4152 + 40000;
			Static408.aClass155_2.anInt4155 = Static408.aClass155_2.anInt4152 + 40000;
			Static412.aClass155_10.anInt4150 = Static412.aClass155_10.anInt4152 + 50000;
			Static381.aClass155_15.anInt4150 = Static381.aClass155_15.anInt4152 + 50000;
			Static408.aClass155_2.anInt4150 = Static408.aClass155_2.anInt4152 + 50000;
		}
		Static262.aClass155_9 = Static412.aClass155_10;
		if (Static112.aClass17_3 == Static51.aClass17_2) {
			Static404.aBoolean492 = true;
			Static260.aShortArrayArrayArray1 = Static530.aShortArrayArrayArray4;
			Static97.aShortArrayArray2 = Static12.aShortArrayArray1;
			Static349.anInt6068 = 0;
			Static67.anInt1828 = 16777215;
		} else if (Static51.aClass17_2 == Static463.aClass17_4) {
			Static97.aShortArrayArray2 = Static648.aShortArrayArray18;
			Static260.aShortArrayArrayArray1 = Static355.aShortArrayArrayArray2;
		} else {
			Static260.aShortArrayArrayArray1 = Static386.aShortArrayArrayArray3;
			Static97.aShortArrayArray2 = Static480.aShortArrayArray12;
		}
		if (Static579.aClass17_5 == Static51.aClass17_2) {
			Static407.aBoolean497 = false;
		}
		Static183.aShortArray54 = Static140.aShortArray47 = Static332.aShortArray71 = Static168.aShortArray53 = new short[256];
		try {
			Static79.aClipboard1 = Static509.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(222) Exception local222) {
		}
		Static185.aClass221_1 = Static252.method4191(Static150.aCanvas4);
		Static186.aClass358_1 = Static129.method2293(Static150.aCanvas4);
		try {
			if (Static265.aClass286_3.aClass82_3 != null) {
				Static267.aClass204_3 = new Class204(Static265.aClass286_3.aClass82_3, 5200, 0);
				for (@Pc(244) int local244 = 0; local244 < 37; local244++) {
					Static131.aClass204Array1[local244] = new Class204(Static265.aClass286_3.aClass82Array1[local244], 6000, 0);
				}
				Static204.aClass204_2 = new Class204(Static265.aClass286_3.aClass82_4, 6000, 0);
				Static358.aClass349_4 = new Class349(255, Static267.aClass204_3, Static204.aClass204_2, 500000);
				Static67.aClass204_1 = new Class204(Static265.aClass286_3.aClass82_2, 24, 0);
				Static265.aClass286_3.aClass82Array1 = null;
				Static265.aClass286_3.aClass82_3 = null;
				Static265.aClass286_3.aClass82_2 = null;
				Static265.aClass286_3.aClass82_4 = null;
			}
		} catch (@Pc(302) IOException local302) {
			Static204.aClass204_2 = null;
			Static358.aClass349_4 = null;
			Static67.aClass204_1 = null;
			Static267.aClass204_3 = null;
		}
		if (Static392.aClass373_6 != Static242.aClass373_4) {
			Static238.aBoolean585 = true;
		}
		Static596.aString105 = Static573.aClass345_14.method7951(Static496.anInt7407);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1710() {
		if (Static342.aBoolean425) {
			Static293.method4635();
		}
		Static164.method2810();
		if (Static141.aClass13_27 != null) {
			Static141.aClass13_27.method8117();
		}
		if (Static18.aFrame1 != null) {
			Static554.method7826(Static18.aFrame1, Static265.aClass286_3);
			Static18.aFrame1 = null;
		}
		if (Static341.aClass22_4 != null) {
			Static341.aClass22_4.method7460();
			Static341.aClass22_4 = null;
		}
		Static584.method8081();
		Static194.aClass322_2.method7433();
		Static216.aClass116_2.method2775();
		if (Static69.aClass329_1 != null) {
			Static69.aClass329_1.method7530();
			Static69.aClass329_1 = null;
		}
		try {
			Static267.aClass204_3.method4778();
			for (@Pc(51) int local51 = 0; local51 < 37; local51++) {
				Static131.aClass204Array1[local51].method4778();
			}
			Static204.aClass204_2.method4778();
			Static67.aClass204_1.method4778();
			Static582.method8065();
		} catch (@Pc(74) Exception local74) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1726() {
		if (Static194.aClass322_2.anInt8638 > Static431.anInt7668) {
			Static262.aClass155_9.method3615();
			Static313.anInt8615 = (Static194.aClass322_2.anInt8638 * 50 - 50) * 5;
			if (Static313.anInt8615 > 3000) {
				Static313.anInt8615 = 3000;
			}
			if (Static194.aClass322_2.anInt8638 >= 2 && Static194.aClass322_2.anInt8639 == 6) {
				this.method1712("js5connect_outofdate");
				Static454.anInt7416 = 14;
				return;
			}
			if (Static194.aClass322_2.anInt8638 >= 4 && Static194.aClass322_2.anInt8639 == -1) {
				this.method1712("js5crc");
				Static454.anInt7416 = 14;
				return;
			}
			if (Static194.aClass322_2.anInt8638 >= 4 && Static266.method4376(Static454.anInt7416)) {
				if (Static194.aClass322_2.anInt8639 == 7 || Static194.aClass322_2.anInt8639 == 9) {
					this.method1712("js5connect_full");
				} else if (Static194.aClass322_2.anInt8639 <= 0) {
					this.method1712("js5io");
				} else if (Static46.aString49 == null) {
					this.method1712("js5connect");
				} else {
					this.method1712("js5proxy_" + Static46.aString49.trim());
				}
				Static454.anInt7416 = 14;
				return;
			}
		}
		Static431.anInt7668 = Static194.aClass322_2.anInt8638;
		if (Static313.anInt8615 > 0) {
			Static313.anInt8615--;
			return;
		}
		try {
			if (Static57.anInt1428 == 0) {
				Static229.aClass319_3 = Static262.aClass155_9.method3617(Static265.aClass286_3);
				Static57.anInt1428++;
			}
			if (Static57.anInt1428 == 1) {
				if (Static229.aClass319_3.anInt8562 == 2) {
					if (Static229.aClass319_3.anObject19 != null) {
						Static46.aString49 = (String) Static229.aClass319_3.anObject19;
					}
					this.method1724(1000);
					return;
				}
				if (Static229.aClass319_3.anInt8562 == 1) {
					Static57.anInt1428++;
				}
			}
			if (Static57.anInt1428 == 2) {
				Static232.aClass367_1 = new Class367((Socket) Static229.aClass319_3.anObject19, Static265.aClass286_3, 25000);
				@Pc(197) Class2_Sub17 local197 = new Class2_Sub17(5);
				local197.method2837(Static150.aClass34_2.anInt808);
				local197.method2827(638);
				Static232.aClass367_1.method8567(5, local197.aByteArray26);
				Static57.anInt1428++;
				Static151.aLong81 = Static48.method1203();
			}
			if (Static57.anInt1428 == 3) {
				if (Static266.method4376(Static454.anInt7416) || Static232.aClass367_1.method8570() > 0) {
					@Pc(248) int local248 = Static232.aClass367_1.method8574();
					if (local248 != 0) {
						this.method1724(local248);
						return;
					}
					Static57.anInt1428++;
				} else if (Static48.method1203() - Static151.aLong81 > 30000L) {
					this.method1724(1001);
					return;
				}
			}
			if (Static57.anInt1428 == 4) {
				@Pc(278) boolean local278 = Static266.method4376(Static454.anInt7416) || Static509.method7066(Static454.anInt7416) || Static85.method1801(Static454.anInt7416);
				@Pc(281) Class208[] local281 = Static316.method4869();
				@Pc(289) Class2_Sub17 local289 = new Class2_Sub17(local281.length * 4);
				Static232.aClass367_1.method8568(0, local289.aByteArray26, local289.aByteArray26.length);
				for (@Pc(300) int local300 = 0; local300 < local281.length; local300++) {
					local281[local300].method4862(local289.method2881());
				}
				Static194.aClass322_2.method7435(Static232.aClass367_1, !local278);
				Static57.anInt1428 = 0;
				Static232.aClass367_1 = null;
				Static229.aClass319_3 = null;
			}
		} catch (@Pc(332) IOException local332) {
			this.method1724(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1709() {
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method1718() {
		if (Static107.anApplet1 != null && Static150.aCanvas4 == null && !Static265.aClass286_3.aBoolean534) {
			try {
				@Pc(13) Class local13 = Static107.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static150.aCanvas4 = (Canvas) local17.get(Static107.anApplet1);
				local17.set(Static107.anApplet1, (Object) null);
				if (Static150.aCanvas4 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1718();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1719() {
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != 2) {
			this.method1737();
			return;
		}
		try {
			this.method1737();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static25.method7457(local24, local24.getMessage() + " (Recovered) " + this.method1714());
			Static223.aBoolean283 = true;
			Static99.method1936(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1737() {
		if (Static454.anInt7416 == 14) {
			return;
		}
		@Pc(22) long local22 = Static636.method8748() / 1000000L - Static339.aLong152;
		Static339.aLong152 = Static636.method8748() / 1000000L;
		@Pc(30) boolean local30 = Static78.method1680();
		if (local30 && Static609.aBoolean725 && Static25.aClass39_4 != null) {
			Static25.aClass39_4.method4900();
		}
		if (Static398.method5948(Static454.anInt7416)) {
			if (Static257.aLong118 != 0L && Static48.method1203() > Static257.aLong118) {
				Static63.method1431(Static475.anInt7677, false, Static402.method6006(), Static7.anInt134);
			} else if (!Static141.aClass13_27.method8084() && Static528.aBoolean262) {
				Static366.method5448();
			}
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (Static18.aFrame1 == null) {
			@Pc(82) Container local82;
			if (Static80.aFrame2 != null) {
				local82 = Static80.aFrame2;
			} else if (Static107.anApplet1 == null) {
				local82 = Static253.anApplet_Sub1_1;
			} else {
				local82 = Static107.anApplet1;
			}
			local94 = local82.getSize().width;
			local98 = local82.getSize().height;
			if (local82 == Static80.aFrame2) {
				@Pc(104) Insets local104 = Static80.aFrame2.getInsets();
				local98 -= local104.top + local104.bottom;
				local94 -= local104.left + local104.right;
			}
			if (local94 != Static334.anInt5861 || Static16.anInt323 != local98 || Static35.aBoolean69) {
				if (Static141.aClass13_27 == null || Static141.aClass13_27.method8114()) {
					Static141.method2565();
				} else {
					Static16.anInt323 = local98;
					Static334.anInt5861 = local94;
				}
				Static257.aLong118 = Static48.method1203() + 500L;
				Static35.aBoolean69 = false;
			}
		}
		if (Static18.aFrame1 != null && !Static453.aBoolean526 && Static398.method5948(Static454.anInt7416)) {
			Static63.method1431(-1, false, Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520(), -1);
		}
		@Pc(171) boolean local171 = false;
		if (Static201.aBoolean297) {
			Static201.aBoolean297 = false;
			local171 = true;
		}
		if (local171) {
			Static123.method2208();
		}
		if (Static141.aClass13_27 != null && Static141.aClass13_27.method8084() || Static402.method6006() != 1) {
			Static569.method7932();
		}
		if (Static266.method4376(Static454.anInt7416)) {
			Static149.method2634(local171);
		} else if (Static645.method8858(Static454.anInt7416)) {
			Static386.method5689();
		} else if (Static213.method3542(Static454.anInt7416)) {
			Static386.method5689();
		} else if (Static243.method6205(Static454.anInt7416)) {
			if (Static85.anInt2172 == 1) {
				if (Static559.anInt9233 < Static171.anInt3468) {
					Static559.anInt9233 = Static171.anInt3468;
				}
				local94 = (Static559.anInt9233 - Static171.anInt3468) * 50 / Static559.anInt9233;
				Static24.method603(Static39.aClass37_1, Static141.aClass13_27, true, Static266.aClass183_7, Static573.aClass345_14.method7951(Static496.anInt7407) + "<br>(" + local94 + "%)");
			} else if (Static85.anInt2172 == 2) {
				if (Static296.anInt5352 < Static417.anInt6986) {
					Static296.anInt5352 = Static417.anInt6986;
				}
				local94 = (Static296.anInt5352 - Static417.anInt6986) * 50 / Static296.anInt5352 + 50;
				Static24.method603(Static39.aClass37_1, Static141.aClass13_27, true, Static266.aClass183_7, Static573.aClass345_14.method7951(Static496.anInt7407) + "<br>(" + local94 + "%)");
			} else {
				Static24.method603(Static39.aClass37_1, Static141.aClass13_27, true, Static266.aClass183_7, Static573.aClass345_14.method7951(Static496.anInt7407));
			}
		} else if (Static454.anInt7416 == 10) {
			Static252.method4190(local22);
		} else if (Static454.anInt7416 == 13) {
			Static24.method603(Static39.aClass37_1, Static141.aClass13_27, false, Static266.aClass183_7, Static573.aClass345_16.method7951(Static496.anInt7407) + "<br>" + Static573.aClass345_17.method7951(Static496.anInt7407));
		}
		if (Static108.anInt2358 == 3) {
			for (local94 = 0; local94 < Static509.anInt8223; local94++) {
				@Pc(373) Rectangle local373 = Class2_Sub18.aRectangleArray1[local94];
				if (Static205.aBooleanArray16[local94]) {
					Static141.aClass13_27.method8155(local373.height, local373.width, local373.x, local373.y, -65281);
				} else if (Static375.aBooleanArray13[local94]) {
					Static141.aClass13_27.method8155(local373.height, local373.width, local373.x, local373.y, -65536);
				} else {
					Static141.aClass13_27.method8155(local373.height, local373.width, local373.x, local373.y, -16711936);
				}
			}
		}
		if (Static331.method5045()) {
			Static424.method6177(Static141.aClass13_27);
		}
		if (Static265.aClass286_3.aBoolean534 && Static398.method5948(Static454.anInt7416) && Static108.anInt2358 == 0 && Static402.method6006() == 1 && !local171) {
			local94 = 0;
			for (local98 = 0; local98 < Static509.anInt8223; local98++) {
				if (Static375.aBooleanArray13[local98]) {
					Static375.aBooleanArray13[local98] = false;
					Static593.aRectangleArray2[local94++] = Class2_Sub18.aRectangleArray1[local98];
				}
			}
			try {
				if (Static148.aBoolean241) {
					Static451.method6423(local94, Static593.aRectangleArray2);
				} else {
					Static141.aClass13_27.method8170(local94, Static593.aRectangleArray2);
				}
			} catch (@Pc(491) Exception_Sub1 local491) {
			}
		} else if (!Static266.method4376(Static454.anInt7416)) {
			for (local94 = 0; local94 < Static509.anInt8223; local94++) {
				Static375.aBooleanArray13[local94] = false;
			}
			try {
				if (Static148.aBoolean241) {
					Static601.method8464();
				} else {
					Static141.aClass13_27.method8129();
				}
			} catch (@Pc(524) Exception_Sub1 local524) {
				Static25.method7457(local524, local524.getMessage() + " (Recovered) " + this.method1714());
				Static99.method1936(false, 0);
			}
		}
		Static412.method6052();
		local94 = Static305.aClass2_Sub49_15.aClass33_Sub19_1.method5445();
		if (local94 == 0) {
			Static440.method6322(15L);
		} else if (local94 == 1) {
			Static440.method6322(10L);
		} else if (local94 == 2) {
			Static440.method6322(5L);
		} else if (local94 == 3) {
			Static440.method6322(2L);
		}
		if (Static397.aBoolean483) {
			Static116.method2085();
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub22_1.method6417() == 1 && Static454.anInt7416 == 3 && Static592.anInt9857 != -1) {
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub22_1, 0);
			Static531.method7366();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1711()) {
			return;
		}
		Static412.aClass155_10 = new Class155();
		Static412.aClass155_10.anInt4152 = Integer.parseInt(this.getParameter("worldid"));
		Static381.aClass155_15 = new Class155();
		Static381.aClass155_15.anInt4152 = Integer.parseInt(this.getParameter("lobbyid"));
		Static381.aClass155_15.aString38 = this.getParameter("lobbyaddress");
		Static408.aClass155_2 = new Class155();
		Static408.aClass155_2.anInt4152 = Integer.parseInt(this.getParameter("demoid"));
		Static408.aClass155_2.aString38 = this.getParameter("demoaddress");
		Static392.aClass373_6 = Static534.method7397(Integer.parseInt(this.getParameter("modewhere")));
		if (Static472.aClass373_7 == Static392.aClass373_6) {
			Static392.aClass373_6 = Static364.aClass373_5;
		} else if (!Static15.method412(Static392.aClass373_6) && Static392.aClass373_6 != Static242.aClass373_4) {
			Static392.aClass373_6 = Static242.aClass373_4;
		}
		Static116.aClass168_1 = Static527.method7324(Integer.parseInt(this.getParameter("modewhat")));
		if (Static116.aClass168_1 != Static612.aClass168_5 && Static116.aClass168_1 != Static248.aClass168_3 && Static207.aClass168_2 != Static116.aClass168_1) {
			Static116.aClass168_1 = Static207.aClass168_2;
		}
		try {
			Static496.anInt7407 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static496.anInt7407 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static131.aBoolean221 = true;
		} else {
			Static131.aBoolean221 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static640.aBoolean751 = true;
		} else {
			Static640.aBoolean751 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static160.aBoolean258 = true;
		} else {
			Static160.aBoolean258 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static51.aClass17_2 = Static579.aClass17_5;
			} else if (local152.equals("1")) {
				Static51.aClass17_2 = Static112.aClass17_3;
			} else if (local152.equals("2")) {
				Static51.aClass17_2 = Static600.aClass17_6;
			} else if (local152.equals("3")) {
				Static51.aClass17_2 = Static463.aClass17_4;
			}
		}
		try {
			Static65.anInt1744 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static65.anInt1744 = 0;
		}
		Static460.aString63 = this.getParameter("quiturl");
		Static112.aString22 = this.getParameter("settings");
		if (Static112.aString22 == null) {
			Static112.aString22 = "";
		}
		Static183.aBoolean279 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static309.anInt7824 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static309.anInt7824 = 0;
			}
		}
		Static145.anInt3032 = Integer.parseInt(this.getParameter("colourid"));
		if (Static145.anInt3032 < 0 || Static472.aColorArray6.length <= Static145.anInt3032) {
			Static145.anInt3032 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static634.aBoolean746 = true;
			Static9.aBoolean20 = true;
		}
		@Pc(256) String local256 = this.getParameter("frombilling");
		if (local256 != null && local256.equals("true")) {
			Static193.aBoolean755 = true;
		}
		Static63.aString16 = this.getParameter("sskey");
		if (Static63.aString16 != null && Static63.aString16.length() < 2) {
			Static63.aString16 = null;
		}
		@Pc(282) String local282 = this.getParameter("force64mb");
		if (local282 != null && local282.equals("true")) {
			Static272.aBoolean375 = true;
		}
		@Pc(294) String local294 = this.getParameter("worldflags");
		if (local294 != null) {
			try {
				Static333.anInt5840 = Integer.parseInt(local294);
			} catch (@Pc(301) Exception local301) {
			}
		}
		@Pc(306) String local306 = this.getParameter("userFlow");
		if (local306 != null) {
			try {
				Static272.aLong122 = Long.parseLong(local306);
			} catch (@Pc(313) NumberFormatException local313) {
			}
		}
		Static2.aString1 = this.getParameter("additionalInfo");
		if (Static2.aString1 != null && Static2.aString1.length() > 50) {
			Static2.aString1 = null;
		}
		if (Static579.aClass17_5 == Static51.aClass17_2) {
			Static478.anInt7732 = 503;
			Static143.anInt2998 = 765;
		} else if (Static51.aClass17_2 == Static112.aClass17_3) {
			Static143.anInt2998 = 640;
			Static478.anInt7732 = 480;
		}
		Static509.aClient1 = this;
		this.method1705(Static116.aClass168_1.method4189() + 32, Static143.anInt2998, Static478.anInt7732, Static51.aClass17_2.aString3);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1739() {
		@Pc(25) int local25;
		if (Static454.anInt7416 == 7 && Static360.anInt6253 == 0) {
			if (Static626.anInt10190 > 1) {
				Static626.anInt10190--;
				Static82.anInt2146 = Static148.anInt3063;
			}
			if (!Static113.aBoolean192) {
				Static298.method4717();
			}
			for (local25 = 0; local25 < 100 && Static429.method8912(); local25++) {
			}
		}
		Static190.anInt3789++;
		Static90.method1856((Class303) null, -1, -1);
		Static577.method8013((Class303) null, -1, -1);
		Static478.method6781();
		Static148.anInt3063++;
		for (local25 = 0; local25 < Static608.anInt10053; local25++) {
			@Pc(71) Class16_Sub1_Sub1_Sub3_Sub1 local71 = Static480.aClass2_Sub32Array1[local25].aClass16_Sub1_Sub1_Sub3_Sub1_2;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass113_1.aByte57;
				if ((local77 & 0x1) != 0) {
					@Pc(85) int local85 = local71.method6999();
					@Pc(109) int local109;
					if ((local77 & 0x2) != 0 && local71.anInt8133 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(135) int local135 = local71.anIntArray595[0] + local109;
							@Pc(143) int local143 = local71.anIntArray594[0] + local117;
							if (local135 < 0) {
								local135 = 0;
							} else if (local135 > Static456.anInt7428 - local85 - 1) {
								local135 = Static456.anInt7428 - local85 - 1;
							}
							if (local143 < 0) {
								local143 = 0;
							} else if (local143 > Static5.anInt112 - local85 - 1) {
								local143 = Static5.anInt112 - local85 - 1;
							}
							@Pc(217) int local217 = Static79.method1729(Static591.anIntArray693, local143, local85, 0, Static520.aClass175Array1[local71.aByte109], Static390.anIntArray444, true, local85, 0, -1, local71.anIntArray595[0], local85, local135, local71.anIntArray594[0]);
							if (local217 > 0) {
								if (local217 > 9) {
									local217 = 9;
								}
								for (@Pc(231) int local231 = 0; local231 < local217; local231++) {
									local71.anIntArray595[local231] = Static390.anIntArray444[local217 - local231 - 1];
									local71.anIntArray594[local231] = Static591.anIntArray693[local217 - local231 - 1];
									local71.aByteArray85[local231] = 1;
								}
								local71.anInt8133 = local217;
							}
						}
					}
					Static64.method1473(local71, true);
					local109 = Static104.method1961(local71);
					Static410.method6038(local71);
					Static196.method3384(local109, Static363.anInt6280, Static135.anInt2905, local71);
					Static489.method7361(Static135.anInt2905, local71);
					Static159.method2769(local71);
				}
			}
		}
		if (Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
			if (Static407.anInt6909 == 2) {
				Static590.method8341();
			} else {
				Static303.method4762();
			}
			if (Static576.anInt9403 >> 9 < 14 || Static576.anInt9403 >> 9 >= Static456.anInt7428 - 14 || Static63.anInt1715 >> 9 < 14 || Static63.anInt1715 >> 9 >= Static5.anInt112 - 14) {
				Static259.method4297();
			}
		}
		while (true) {
			@Pc(362) Class2_Sub18 local362;
			@Pc(367) Class303 local367;
			@Pc(375) Class303 local375;
			do {
				local362 = (Class2_Sub18) Static596.aClass114_59.method2765();
				if (local362 == null) {
					while (true) {
						do {
							local362 = (Class2_Sub18) Static289.aClass114_27.method2765();
							if (local362 == null) {
								while (true) {
									do {
										local362 = (Class2_Sub18) Static102.aClass114_11.method2765();
										if (local362 == null) {
											if (Static351.aClass303_13 != null) {
												Static559.method7860();
											}
											if (Static389.anInt6694 % 1500 == 0) {
												Static206.method3478();
											}
											if (Static454.anInt7416 == 7 && Static360.anInt6253 == 0) {
												Static533.method7371();
											}
											Static20.method556();
											if (Static342.aBoolean425 && Static48.method1203() - 60000L > Static641.aLong271) {
												Static293.method4635();
											}
											for (@Pc(550) Class16_Sub6_Sub2 local550 = (Class16_Sub6_Sub2) Static39.aClass19_2.method562(); local550 != null; local550 = (Class16_Sub6_Sub2) Static39.aClass19_2.method558()) {
												if ((long) local550.anInt6081 < Static48.method1203() / 1000L - 5L) {
													if (local550.aShort83 > 0) {
														Static107.method1973(local550.aString50 + Static573.aClass345_21.method7951(Static496.anInt7407), 0, "", "", 5, "");
													}
													if (local550.aShort83 == 0) {
														Static107.method1973(local550.aString50 + Static573.aClass345_22.method7951(Static496.anInt7407), 0, "", "", 5, "");
													}
													local550.method8874();
												}
											}
											if (Static454.anInt7416 == 7 && Static360.anInt6253 == 0) {
												if (Static341.aClass22_4 == null) {
													Static448.method6402(false);
													return;
												}
												Static617.anInt10103++;
												if (Static617.anInt10103 > 50) {
													@Pc(653) Class2_Sub31 local653 = Static275.method4480(Static640.aClass314_2, Static555.aClass145_162);
													Static526.method7309(local653);
												}
												try {
													Static255.method4268();
													return;
												} catch (@Pc(660) IOException local660) {
													Static448.method6402(false);
													return;
												}
											}
											return;
										}
										local367 = local362.aClass303_4;
										if (local367.anInt7983 < 0) {
											break;
										}
										local375 = Static43.method1101(local367.anInt7985);
									} while (local375 == null || local375.aClass303Array2 == null || local367.anInt7983 >= local375.aClass303Array2.length || local375.aClass303Array2[local367.anInt7983] != local367);
									Static156.method2728(local362);
								}
							}
							local367 = local362.aClass303_4;
							if (local367.anInt7983 < 0) {
								break;
							}
							local375 = Static43.method1101(local367.anInt7985);
						} while (local375 == null || local375.aClass303Array2 == null || local375.aClass303Array2.length <= local367.anInt7983 || local375.aClass303Array2[local367.anInt7983] != local367);
						Static156.method2728(local362);
					}
				}
				local367 = local362.aClass303_4;
				if (local367.anInt7983 < 0) {
					break;
				}
				local375 = Static43.method1101(local367.anInt7985);
			} while (local375 == null || local375.aClass303Array2 == null || local367.anInt7983 >= local375.aClass303Array2.length || local367 != local375.aClass303Array2[local367.anInt7983]);
			Static156.method2728(local362);
		}
	}
}
