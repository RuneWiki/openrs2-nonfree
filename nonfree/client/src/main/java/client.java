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

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[Lclient!iv;")
	public static final Class158[] aClass158Array1 = new Class158[5];

	static {
		for (@Pc(8) int local8 = 0; local8 < aClass158Array1.length; local8++) {
			aClass158Array1[local8] = new Class158();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static95.method1894("Argument count");
			}
			Static454.aClass271_4 = new Class271();
			Static454.aClass271_4.anInt7991 = Integer.parseInt(arg0[0]);
			Static134.aClass271_3 = new Class271();
			Static134.aClass271_3.anInt7991 = Integer.parseInt(arg0[1]);
			Static518.aClass271_6 = new Class271();
			Static518.aClass271_6.anInt7991 = Integer.parseInt(arg0[2]);
			Static342.aClass326_6 = Static480.aClass326_9;
			if (arg0[3].equals("live")) {
				Static110.aClass178_2 = Static289.aClass178_3;
			} else if (arg0[3].equals("rc")) {
				Static110.aClass178_2 = Static17.aClass178_1;
			} else if (arg0[3].equals("wip")) {
				Static110.aClass178_2 = Static536.aClass178_4;
			} else {
				Static95.method1894("modewhat");
			}
			Static142.anInt3088 = Static470.method6857(arg0[4]);
			if (Static142.anInt3088 == -1) {
				if (arg0[4].equals("english")) {
					Static142.anInt3088 = 0;
				} else if (arg0[4].equals("german")) {
					Static142.anInt3088 = 1;
				} else {
					Static95.method1894("language");
				}
			}
			Static414.aBoolean572 = false;
			Static314.aBoolean433 = false;
			if (arg0[5].equals("game0")) {
				Static162.aClass128_1 = Static592.aClass128_4;
			} else if (arg0[5].equals("game1")) {
				Static162.aClass128_1 = Static403.aClass128_3;
			} else {
				Static95.method1894("game");
			}
			Static67.aString22 = null;
			Static29.aBoolean102 = false;
			Static484.anInt9199 = Static162.aClass128_1.anInt3622;
			Static121.aBoolean211 = false;
			Static266.anInt5356 = 0;
			Static480.anInt10340 = 0;
			Static446.anInt8497 = 0;
			Static146.aString56 = "";
			Static172.aString67 = null;
			Static452.aLong234 = 0L;
			Static210.aBoolean711 = true;
			Static56.aBoolean120 = true;
			@Pc(168) client local168 = new client();
			Static104.aClient3 = local168;
			local168.method1521(Static162.aClass128_1.aString66, Static110.aClass178_2.method4367() + 32);
			Static402.aFrame3.setLocation(40, 40);
		} catch (@Pc(191) Exception local191) {
			Static109.method2014(null, local191);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1533() {
		@Pc(7) boolean local7 = Static433.aClass72_3.method1862();
		if (!local7) {
			this.method1537();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1524() {
		@Pc(12) String local12 = null;
		try {
			local12 = "[1)" + Static242.anInt10133 + "," + Static157.anInt3323 + "," + Static338.anInt6508 + "," + Static390.anInt7654 + "|";
			if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 != null) {
				local12 = local12 + "2)" + Static352.anInt6764 + "," + (Static242.anInt10133 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0]) + "," + (Static157.anInt3323 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0]) + "|";
			}
			local12 = local12 + "3)" + Static453.anInt8614 + "|4)" + Static455.aClass4_Sub35_Sub1_1.anInt9914 + "|5)" + Static578.method8122() + "|6)" + Static123.anInt9150 + "," + Static71.anInt1872 + "|";
			local12 = local12 + "7)" + Static455.aClass4_Sub35_Sub1_1.method7615(Static453.anInt8614) + "|";
			local12 = local12 + "8)" + Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614) + "|";
			local12 = local12 + "9)" + Static455.aClass4_Sub35_Sub1_1.aBoolean677 + "|";
			local12 = local12 + "10)" + Static455.aClass4_Sub35_Sub1_1.aBoolean675 + "|";
			local12 = local12 + "11)" + Static455.aClass4_Sub35_Sub1_1.aBoolean669 + "|";
			local12 = local12 + "12)" + Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614) + "|";
			local12 = local12 + "13)" + Static503.anInt9410 + "|";
			local12 = local12 + "14)" + Static9.anInt758;
			try {
				local12 = local12 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static453.anInt8614 == 2) {
					@Pc(231) Class local231 = Class.forName("java.lang.ClassLoader");
					@Pc(235) Field local235 = local231.getDeclaredField("nativeLibraries");
					@Pc(238) Class local238 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(248) Method local248 = local238.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local248.invoke(local235, Boolean.TRUE);
					@Pc(271) Vector local271 = (Vector) local235.get(client.class.getClassLoader());
					for (@Pc(273) int local273 = 0; local271.size() > local273; local273++) {
						try {
							@Pc(279) Object local279 = local271.elementAt(local273);
							@Pc(284) Field local284 = local279.getClass().getDeclaredField("name");
							local248.invoke(local284, Boolean.TRUE);
							try {
								@Pc(299) String local299 = (String) local284.get(local279);
								if (local299 != null && local299.indexOf("sw3d.dll") != -1) {
									@Pc(312) Field local312 = local279.getClass().getDeclaredField("handle");
									local248.invoke(local312, Boolean.TRUE);
									local12 = local12 + "|16)" + Long.toHexString(local312.getLong(local279));
									local248.invoke(local312, Boolean.FALSE);
								}
							} catch (@Pc(348) Throwable local348) {
							}
							local248.invoke(local284, Boolean.FALSE);
						} catch (@Pc(360) Throwable local360) {
						}
					}
				}
			} catch (@Pc(372) Throwable local372) {
			}
			local12 = local12 + "]";
		} catch (@Pc(383) Throwable local383) {
		}
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1532() {
		if (Static29.aBoolean102) {
			Static503.anInt9410 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static169.method2774();
		Static187.aClass225_2 = new Class225(Static372.aClass366_5);
		Static433.aClass72_3 = new Class72();
		Static448.method7389(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static342.aClass326_6 != Static383.aClass326_7) {
			Static302.aByteArrayArray20 = new byte[50][];
		}
		Static455.aClass4_Sub35_Sub1_1 = new Class4_Sub35_Sub1(Static372.aClass366_5);
		if (Static342.aClass326_6 == Static383.aClass326_7) {
			Static454.aClass271_4.aString164 = this.getCodeBase().getHost();
		} else if (Static21.method832(Static342.aClass326_6)) {
			Static454.aClass271_4.aString164 = this.getCodeBase().getHost();
			Static454.aClass271_4.anInt7994 = Static454.aClass271_4.anInt7991 + 40000;
			Static134.aClass271_3.anInt7994 = Static134.aClass271_3.anInt7991 + 40000;
			Static454.aClass271_4.anInt7987 = Static454.aClass271_4.anInt7991 + 50000;
			Static518.aClass271_6.anInt7994 = Static518.aClass271_6.anInt7991 + 40000;
			Static134.aClass271_3.anInt7987 = Static134.aClass271_3.anInt7991 + 50000;
			Static518.aClass271_6.anInt7987 = Static518.aClass271_6.anInt7991 + 50000;
		} else if (Static480.aClass326_9 == Static342.aClass326_6) {
			Static454.aClass271_4.aString164 = "127.0.0.1";
			Static134.aClass271_3.aString164 = "127.0.0.1";
			Static518.aClass271_6.aString164 = "127.0.0.1";
			Static454.aClass271_4.anInt7994 = Static454.aClass271_4.anInt7991 + 40000;
			Static134.aClass271_3.anInt7994 = Static134.aClass271_3.anInt7991 + 40000;
			Static518.aClass271_6.anInt7994 = Static518.aClass271_6.anInt7991 + 40000;
			Static454.aClass271_4.anInt7987 = Static454.aClass271_4.anInt7991 + 50000;
			Static134.aClass271_3.anInt7987 = Static134.aClass271_3.anInt7991 + 50000;
			Static518.aClass271_6.anInt7987 = Static518.aClass271_6.anInt7991 + 50000;
		}
		if (Static592.aClass128_4 == Static162.aClass128_1) {
			Static21.aBoolean89 = false;
		}
		Static353.aShortArray89 = Static484.aShortArray129 = Static371.aShortArray90 = Static387.aShortArray91 = new short[256];
		if (Static403.aClass128_3 == Static162.aClass128_1) {
			Static405.aBoolean565 = true;
			Static360.aShortArrayArrayArray3 = Static104.aShortArrayArrayArray4;
			Static217.aShortArrayArray17 = Static84.aShortArrayArray1;
			Static46.anInt1310 = 16777215;
			Static292.anInt5985 = 0;
		} else {
			Static360.aShortArrayArrayArray3 = Static591.aShortArrayArrayArray5;
			Static217.aShortArrayArray17 = Static280.aShortArrayArray15;
		}
		Static326.aClass271_2 = Static454.aClass271_4;
		try {
			Static499.aClipboard3 = Static104.aClient3.getToolkit().getSystemClipboard();
		} catch (@Pc(214) Exception local214) {
		}
		Static38.aClass174_1 = Static60.method1365(Static201.aCanvas7);
		Static294.aClass83_1 = Static79.method1615(Static201.aCanvas7);
		try {
			if (Static372.aClass366_5.aClass354_2 != null) {
				Static64.aClass283_1 = new Class283(Static372.aClass366_5.aClass354_2, 5200, 0);
				for (@Pc(238) int local238 = 0; local238 < 35; local238++) {
					Static141.aClass283Array33[local238] = new Class283(Static372.aClass366_5.aClass354Array1[local238], 6000, 0);
				}
				Static537.aClass283_3 = new Class283(Static372.aClass366_5.aClass354_4, 6000, 0);
				Static206.aClass346_8 = new Class346(255, Static64.aClass283_1, Static537.aClass283_3, 500000);
				Static357.aClass283_2 = new Class283(Static372.aClass366_5.aClass354_3, 24, 0);
				Static372.aClass366_5.aClass354_4 = null;
				Static372.aClass366_5.aClass354_3 = null;
				Static372.aClass366_5.aClass354_2 = null;
				Static372.aClass366_5.aClass354Array1 = null;
			}
		} catch (@Pc(294) IOException local294) {
			Static537.aClass283_3 = null;
			Static206.aClass346_8 = null;
			Static64.aClass283_1 = null;
			Static357.aClass283_2 = null;
		}
		if (Static383.aClass326_7 != Static342.aClass326_6) {
			Static370.aBoolean508 = true;
		}
		if (Static592.aClass128_4 == Static162.aClass128_1) {
			Static555.aString220 = Static223.aClass152_3.method3624(Static142.anInt3088);
		} else if (Static403.aClass128_3 == Static162.aClass128_1) {
			Static555.aString220 = Static223.aClass152_4.method3624(Static142.anInt3088);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1537() {
		if (Static343.anInt6621 < Static433.aClass72_3.anInt2351) {
			Static326.aClass271_2.method6250();
			Static438.anInt8367 = 5 * 50 * (Static433.aClass72_3.anInt2351 - 1);
			if (Static438.anInt8367 > 3000) {
				Static438.anInt8367 = 3000;
			}
			if (Static433.aClass72_3.anInt2351 >= 2 && Static433.aClass72_3.anInt2352 == 6) {
				this.method1530("js5connect_outofdate");
				Static9.anInt758 = 14;
				return;
			}
			if (Static433.aClass72_3.anInt2351 >= 4 && Static433.aClass72_3.anInt2352 == -1) {
				this.method1530("js5crc");
				Static9.anInt758 = 14;
				return;
			}
			if (Static433.aClass72_3.anInt2351 >= 4 && Static330.method5076(Static9.anInt758)) {
				if (Static433.aClass72_3.anInt2352 == 7 || Static433.aClass72_3.anInt2352 == 9) {
					this.method1530("js5connect_full");
				} else if (Static433.aClass72_3.anInt2352 <= 0) {
					this.method1530("js5io");
				} else if (Static283.aString115 == null) {
					this.method1530("js5connect");
				} else {
					this.method1530("js5proxy_" + Static283.aString115.trim());
				}
				Static9.anInt758 = 14;
				return;
			}
		}
		Static343.anInt6621 = Static433.aClass72_3.anInt2351;
		if (Static438.anInt8367 > 0) {
			Static438.anInt8367--;
			return;
		}
		try {
			if (Static211.anInt4428 == 0) {
				Static152.aClass316_3 = Static326.aClass271_2.method6248(Static372.aClass366_5);
				Static211.anInt4428++;
			}
			if (Static211.anInt4428 == 1) {
				if (Static152.aClass316_3.anInt9478 == 2) {
					if (Static152.aClass316_3.anObject136 != null) {
						Static283.aString115 = (String) Static152.aClass316_3.anObject136;
					}
					this.method1540(1000);
					return;
				}
				if (Static152.aClass316_3.anInt9478 == 1) {
					Static211.anInt4428++;
				}
			}
			if (Static211.anInt4428 == 2) {
				Static40.aClass99_1 = new Class99((Socket) Static152.aClass316_3.anObject136, Static372.aClass366_5);
				@Pc(202) Class4_Sub13 local202 = new Class4_Sub13(5);
				local202.method7052(Static58.aClass195_2.anInt5991);
				local202.method7032(624);
				Static40.aClass99_1.method2395(local202.aByteArray88, 5);
				Static211.anInt4428++;
				Static41.aLong23 = Static112.method2047();
			}
			if (Static211.anInt4428 == 3) {
				if (Static330.method5076(Static9.anInt758) || Static40.aClass99_1.method2396() > 0) {
					@Pc(255) int local255 = Static40.aClass99_1.method2397();
					if (local255 != 0) {
						this.method1540(local255);
						return;
					}
					Static211.anInt4428++;
				} else if (Static112.method2047() - Static41.aLong23 > 30000L) {
					this.method1540(1001);
					return;
				}
			}
			if (Static211.anInt4428 == 4) {
				@Pc(285) boolean local285 = Static330.method5076(Static9.anInt758) || Static299.method4770(Static9.anInt758) || Static254.method4045(Static9.anInt758);
				@Pc(288) Class223[] local288 = Static332.method5088();
				@Pc(296) Class4_Sub13 local296 = new Class4_Sub13(local288.length * 4);
				Static40.aClass99_1.method2392(local296.aByteArray88.length, 0, local296.aByteArray88);
				for (@Pc(307) int local307 = 0; local307 < local288.length; local307++) {
					local288[local307].method5090(local296.method6990());
				}
				Static433.aClass72_3.method1855(Static40.aClass99_1, !local285);
				Static211.anInt4428 = 0;
				Static152.aClass316_3 = null;
				Static40.aClass99_1 = null;
			}
		} catch (@Pc(343) IOException local343) {
			this.method1540(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1540(@OriginalArg(0) int arg0) {
		Static211.anInt4428 = 0;
		Static40.aClass99_1 = null;
		Static152.aClass316_3 = null;
		Static433.aClass72_3.anInt2351++;
		Static433.aClass72_3.anInt2352 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1520() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1527() {
		if (Static453.anInt8614 != 2) {
			this.method1545();
			return;
		}
		try {
			this.method1545();
		} catch (@Pc(13) ThreadDeath local13) {
			throw local13;
		} catch (@Pc(16) Throwable local16) {
			Static109.method2014(local16.getMessage() + " (Recovered) " + this.method1524(), local16);
			Static146.method2531(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	public synchronized void method1529() {
		if (Static589.anApplet2 != null && Static201.aCanvas7 == null && !Static372.aClass366_5.aBoolean720) {
			try {
				@Pc(13) Class local13 = Static589.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static201.aCanvas7 = (Canvas) local17.get(Static589.anApplet2);
				local17.set(Static589.anApplet2, null);
				if (Static201.aCanvas7 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1529();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1525() {
		if (Static453.anInt8614 != 2) {
			this.method1546();
			return;
		}
		try {
			this.method1546();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static109.method2014(local22.getMessage() + " (Recovered) " + this.method1524(), local22);
			Static146.method2531(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1545() {
		if (Static9.anInt758 == 14) {
			return;
		}
		Static306.anInt6122++;
		if (Static306.anInt6122 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static172.anInt3620 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static387.aRandom1.setSeed((long) Static172.anInt3620);
		}
		if (Static306.anInt6122 % 50 == 0) {
			Static447.anInt10079 = Static94.anInt2372;
			Static94.anInt2372 = 0;
			Static139.anInt3066 = Static74.anInt1906;
			Static74.anInt1906 = 0;
		}
		this.method1533();
		if (Static497.aClass109_1 != null) {
			Static497.aClass109_1.method2510();
		}
		Static271.method4405();
		Static38.aClass174_1.method4091();
		Static294.aClass83_1.method6902();
		if (Static39.aClass7_2 != null) {
			Static39.aClass7_2.method7853((int) Static112.method2047());
		}
		Static527.method7456();
		Static173.anInt3654 = 0;
		Static451.anInt8607 = 0;
		for (@Pc(96) Interface19 local96 = Static38.aClass174_1.method4088(); local96 != null; local96 = Static38.aClass174_1.method4088()) {
			@Pc(102) int local102 = local96.method5462();
			if (local102 == 2 || local102 == 3) {
				@Pc(132) char local132 = local96.method5461();
				if (Static206.method8063() && (local132 == '`' || local132 == '§' || local132 == '²')) {
					if (Static402.method6128()) {
						Static522.method7399();
					} else {
						Static92.method6655();
					}
				} else if (Static173.anInt3654 < 128) {
					Static504.anInterface19Array2[Static173.anInt3654] = local96;
					Static173.anInt3654++;
				}
			} else if (local102 == 0 && Static451.anInt8607 < 75) {
				Static19.anInterface19Array1[Static451.anInt8607] = local96;
				Static451.anInt8607++;
			}
		}
		Static56.anInt1480 = 0;
		for (@Pc(193) Class4_Sub24 local193 = Static294.aClass83_1.method6897(); local193 != null; local193 = Static294.aClass83_1.method6897()) {
			@Pc(199) int local199 = local193.method6389();
			if (local199 == -1) {
				Static311.aClass22_41.method894(local193);
			} else if (local199 == 6) {
				Static56.anInt1480 += local193.method6391();
			} else if (Static452.method6642(local199)) {
				Static36.aClass22_13.method894(local193);
				if (Static36.aClass22_13.method880() > 10) {
					Static36.aClass22_13.method896();
				}
			}
		}
		if (Static402.method6128()) {
			Static346.method5280();
		}
		if (Static330.method5076(Static9.anInt758)) {
			Static388.method5974();
			Static23.method882();
		} else if (Static364.method5492(Static9.anInt758)) {
			Static358.method5397();
		}
		if (Static299.method4770(Static9.anInt758) && !Static364.method5492(Static9.anInt758)) {
			this.method1549();
			Static534.method7520();
			Static94.method1889();
		} else if (Static254.method4045(Static9.anInt758) && !Static364.method5492(Static9.anInt758)) {
			this.method1549();
			Static94.method1889();
		} else if (Static9.anInt758 == 12) {
			Static94.method1889();
		} else if (Static429.method6381(Static9.anInt758) && !Static364.method5492(Static9.anInt758)) {
			Static355.method5356();
		} else if (Static9.anInt758 == 13) {
			Static94.method1889();
			if (Static229.anInt4849 != -3 && Static229.anInt4849 != 2 && Static229.anInt4849 != 15) {
				Static254.method4043(false);
			}
		}
		Static67.method1487(Static39.aClass7_2);
		Static36.aClass22_13.method896();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1546() {
		if (Static9.anInt758 == 14) {
			return;
		}
		@Pc(18) long local18 = Static493.method7123() / 1000000L - Static424.aLong216;
		Static424.aLong216 = Static493.method7123() / 1000000L;
		@Pc(26) boolean local26 = Static349.method5313();
		if (local26 && Static421.aBoolean581 && Static294.aClass15_2 != null) {
			Static294.aClass15_2.method5354();
		}
		if (Static305.method4821(Static9.anInt758)) {
			if (Static268.aLong141 != 0L && Static268.aLong141 < Static112.method2047()) {
				Static503.method7242(Static455.aClass4_Sub35_Sub1_1.anInt9912, Static578.method8122(), false, Static455.aClass4_Sub35_Sub1_1.anInt9919);
			} else if (!Static39.aClass7_2.method7847() && Static364.aBoolean483) {
				Static23.method887();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static514.aFrame2 == null) {
			@Pc(78) Container local78;
			if (Static402.aFrame3 != null) {
				local78 = Static402.aFrame3;
			} else if (Static589.anApplet2 == null) {
				local78 = Static220.anApplet_Sub1_2;
			} else {
				local78 = Static589.anApplet2;
			}
			local92 = local78.getSize().width;
			local96 = local78.getSize().height;
			if (local78 == Static402.aFrame3) {
				@Pc(102) Insets local102 = Static402.aFrame3.getInsets();
				local92 -= local102.left + local102.right;
				local96 -= local102.bottom + local102.top;
			}
			if (Static308.anInt6203 != local92 || local96 != Static507.anInt9504 || Static555.aBoolean697) {
				if (Static39.aClass7_2 == null || Static39.aClass7_2.method7802()) {
					Static169.method2774();
				} else {
					Static507.anInt9504 = local96;
					Static308.anInt6203 = local92;
				}
				Static268.aLong141 = Static112.method2047() + 500L;
				Static555.aBoolean697 = false;
			}
		}
		if (Static514.aFrame2 != null && !Static164.aBoolean245 && Static305.method4821(Static9.anInt758)) {
			Static503.method7242(-1, Static455.aClass4_Sub35_Sub1_1.anInt9917, false, -1);
		}
		@Pc(167) boolean local167 = false;
		if (Static179.aBoolean276) {
			local167 = true;
			Static179.aBoolean276 = false;
		}
		if (local167) {
			Static452.method6641();
		}
		if (Static39.aClass7_2 != null && Static39.aClass7_2.method7847() || Static578.method8122() != 1) {
			Static533.method7519();
		}
		if (Static330.method5076(Static9.anInt758)) {
			Static168.method2767(local167);
		} else if (Static488.method7099(Static9.anInt758)) {
			Static510.method5510();
		} else if (Static188.method3091(Static9.anInt758)) {
			Static510.method5510();
		} else if (Static364.method5492(Static9.anInt758)) {
			if (Static279.anInt5791 == 1) {
				if (Static179.anInt3762 > Static528.anInt9683) {
					Static528.anInt9683 = Static179.anInt3762;
				}
				local92 = (Static528.anInt9683 - Static179.anInt3762) * 50 / Static528.anInt9683;
				Static490.method7114(Static39.aClass7_2, true, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_16.method3624(Static142.anInt3088) + "<br>(" + local92 + "%)");
			} else if (Static279.anInt5791 == 2) {
				if (Static106.anInt2491 > Static89.anInt2296) {
					Static89.anInt2296 = Static106.anInt2491;
				}
				local92 = (Static89.anInt2296 - Static106.anInt2491) * 50 / Static89.anInt2296 + 50;
				Static490.method7114(Static39.aClass7_2, true, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_16.method3624(Static142.anInt3088) + "<br>(" + local92 + "%)");
			} else {
				Static490.method7114(Static39.aClass7_2, true, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_16.method3624(Static142.anInt3088));
			}
		} else if (Static9.anInt758 == 10) {
			Static417.method4092(local18);
		} else if (Static9.anInt758 == 13) {
			Static490.method7114(Static39.aClass7_2, false, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_18.method3624(Static142.anInt3088) + "<br>" + Static223.aClass152_19.method3624(Static142.anInt3088));
		}
		if (Static266.anInt5358 == 3) {
			for (local92 = 0; local92 < Static365.anInt7047; local92++) {
				@Pc(358) Rectangle local358 = Class5.aRectangleArray5[local92];
				if (Static222.aBooleanArray13[local92]) {
					Static39.aClass7_2.method7825(local358.height, local358.width, local358.y, -1996553985, local358.x);
				} else if (Static322.aBooleanArray15[local92]) {
					Static39.aClass7_2.method7825(local358.height, local358.width, local358.y, -1996554240, local358.x);
				}
			}
		}
		if (Static402.method6128()) {
			Static200.method3276(Static39.aClass7_2);
		}
		if (Static372.aClass366_5.aBoolean720 && Static305.method4821(Static9.anInt758) && Static266.anInt5358 == 0 && Static578.method8122() == 1 && !local167) {
			local92 = 0;
			for (local96 = 0; local96 < Static365.anInt7047; local96++) {
				if (Static322.aBooleanArray15[local96]) {
					Static322.aBooleanArray15[local96] = false;
					Static573.aRectangleArray6[local92++] = Class5.aRectangleArray5[local96];
				}
			}
			try {
				Static39.aClass7_2.method7799(Static573.aRectangleArray6, local92);
			} catch (@Pc(451) Exception_Sub1 local451) {
			}
		} else if (!Static330.method5076(Static9.anInt758)) {
			for (local92 = 0; local92 < Static365.anInt7047; local92++) {
				Static322.aBooleanArray15[local92] = false;
			}
			try {
				Static39.aClass7_2.method7827();
			} catch (@Pc(477) Exception_Sub1 local477) {
				Static109.method2014(local477.getMessage() + " (Recovered) " + this.method1524(), local477);
				Static146.method2531(0);
			}
		}
		if (Static455.aClass4_Sub35_Sub1_1.anInt9938 == 0) {
			Static214.method3478(15L);
		} else if (Static455.aClass4_Sub35_Sub1_1.anInt9938 == 1) {
			Static214.method3478(10L);
		} else if (Static455.aClass4_Sub35_Sub1_1.anInt9938 == 2) {
			Static214.method3478(5L);
		} else if (Static455.aClass4_Sub35_Sub1_1.anInt9938 == 3) {
			Static214.method3478(2L);
		}
		if (Static513.aBoolean648) {
			Static50.method1168();
		}
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean672 && Static9.anInt758 == 3 && Static446.anInt8493 != -1) {
			Static455.aClass4_Sub35_Sub1_1.aBoolean672 = false;
			Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1517() {
		if (Static1.aBoolean353) {
			Static573.method8080();
		}
		Static8.method673();
		if (Static39.aClass7_2 != null) {
			Static39.aClass7_2.method7792();
		}
		if (Static514.aFrame2 != null) {
			Static385.method5958(Static372.aClass366_5, Static514.aFrame2);
			Static514.aFrame2 = null;
		}
		if (Static528.aClass36_2 != null) {
			Static528.aClass36_2.method1992();
			Static528.aClass36_2 = null;
		}
		Static429.method6379();
		Static433.aClass72_3.method1864();
		Static187.aClass225_2.method5099();
		if (Static587.aClass164_1 != null) {
			Static587.aClass164_1.method3935();
			Static587.aClass164_1 = null;
		}
		try {
			Static64.aClass283_1.method6485();
			for (@Pc(57) int local57 = 0; local57 < 35; local57++) {
				Static141.aClass283Array33[local57].method6485();
			}
			Static537.aClass283_3.method6485();
			Static357.aClass283_2.method6485();
			Static29.method960();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1522()) {
			return;
		}
		Static454.aClass271_4 = new Class271();
		Static454.aClass271_4.anInt7991 = Integer.parseInt(this.getParameter("worldid"));
		Static134.aClass271_3 = new Class271();
		Static134.aClass271_3.anInt7991 = Integer.parseInt(this.getParameter("lobbyid"));
		Static134.aClass271_3.aString164 = this.getParameter("lobbyaddress");
		Static518.aClass271_6 = new Class271();
		Static518.aClass271_6.anInt7991 = Integer.parseInt(this.getParameter("demoid"));
		Static518.aClass271_6.aString164 = this.getParameter("demoaddress");
		Static342.aClass326_6 = Static99.method1923(Integer.parseInt(this.getParameter("modewhere")));
		if (Static480.aClass326_9 == Static342.aClass326_6) {
			Static342.aClass326_6 = Static173.aClass326_3;
		} else if (!Static21.method832(Static342.aClass326_6) && Static383.aClass326_7 != Static342.aClass326_6) {
			Static342.aClass326_6 = Static383.aClass326_7;
		}
		Static110.aClass178_2 = Static286.method4847(Integer.parseInt(this.getParameter("modewhat")));
		if (Static110.aClass178_2 != Static536.aClass178_4 && Static17.aClass178_1 != Static110.aClass178_2 && Static110.aClass178_2 != Static289.aClass178_3) {
			Static110.aClass178_2 = Static289.aClass178_3;
		}
		try {
			Static142.anInt3088 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static142.anInt3088 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static414.aBoolean572 = true;
		} else {
			Static414.aBoolean572 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static314.aBoolean433 = true;
		} else {
			Static314.aBoolean433 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static203.aBoolean291 = true;
		} else {
			Static203.aBoolean291 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static162.aClass128_1 = Static592.aClass128_4;
			} else if (local152.equals("1")) {
				Static162.aClass128_1 = Static403.aClass128_3;
			}
		}
		try {
			Static446.anInt8497 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static446.anInt8497 = 0;
		}
		Static414.aString163 = this.getParameter("quiturl");
		Static146.aString56 = this.getParameter("settings");
		if (Static146.aString56 == null) {
			Static146.aString56 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static480.anInt10340 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static480.anInt10340 = 0;
			}
		}
		Static484.anInt9199 = Integer.parseInt(this.getParameter("colourid"));
		if (Static484.anInt9199 < 0 || Static331.aColorArray3.length <= Static484.anInt9199) {
			Static484.anInt9199 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static210.aBoolean711 = true;
			Static56.aBoolean120 = true;
		}
		@Pc(232) String local232 = this.getParameter("frombilling");
		if (local232 != null && local232.equals("true")) {
			Static121.aBoolean211 = true;
		}
		Static67.aString22 = this.getParameter("sskey");
		if (Static67.aString22 != null && Static67.aString22.length() < 2) {
			Static67.aString22 = null;
		}
		@Pc(256) String local256 = this.getParameter("force64mb");
		if (local256 != null && local256.equals("true")) {
			Static29.aBoolean102 = true;
		}
		@Pc(268) String local268 = this.getParameter("worldflags");
		if (local268 != null) {
			try {
				Static266.anInt5356 = Integer.parseInt(local268);
			} catch (@Pc(275) Exception local275) {
			}
		}
		@Pc(280) String local280 = this.getParameter("userFlow");
		if (local280 != null) {
			try {
				Static452.aLong234 = Long.parseLong(local280);
			} catch (@Pc(287) NumberFormatException local287) {
			}
		}
		Static172.aString67 = this.getParameter("additionalInfo");
		if (Static172.aString67 != null && Static172.aString67.length() > 50) {
			Static172.aString67 = null;
		}
		if (Static162.aClass128_1 == Static592.aClass128_4) {
			Static324.anInt6378 = 503;
			Static370.anInt7124 = 765;
		} else if (Static403.aClass128_3 == Static162.aClass128_1) {
			Static370.anInt7124 = 640;
			Static324.anInt6378 = 480;
		}
		Static104.aClient3 = this;
		this.method1531(Static110.aClass178_2.method4367() + 32, Static162.aClass128_1.aString66, Static370.anInt7124, Static324.anInt6378);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1549() {
		@Pc(25) int local25;
		if (Static9.anInt758 == 7 && Static575.anInt10384 == 0) {
			if (Static388.anInt7599 > 1) {
				Static388.anInt7599--;
				Static389.anInt9603 = Static422.anInt8117;
			}
			if (!Static117.aBoolean207) {
				Static486.method7075();
			}
			for (local25 = 0; local25 < 100 && Static347.method5293(); local25++) {
			}
		}
		Static92.anInt8628++;
		Static212.method3437(-1, null, -1);
		Static398.method6103(-1, -1, null);
		Static6.method633();
		Static422.anInt8117++;
		for (local25 = 0; local25 < Static222.anInt4653; local25++) {
			@Pc(71) Class21_Sub1_Sub1_Sub1_Sub1 local71 = Static590.aClass4_Sub29Array1[local25].aClass21_Sub1_Sub1_Sub1_Sub1_1;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass51_1.aByte21;
				if ((local77 & 0x1) != 0) {
					@Pc(85) int local85 = local71.method3339();
					@Pc(109) int local109;
					if ((local77 & 0x2) != 0 && local71.anInt4277 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(131) int local131 = local71.anIntArray206[0] + local109;
							@Pc(139) int local139 = local71.anIntArray207[0] + local117;
							if (local131 < 0) {
								local131 = 0;
							} else if (Static338.anInt6508 - local85 - 1 < local131) {
								local131 = Static338.anInt6508 - local85 - 1;
							}
							if (local139 < 0) {
								local139 = 0;
							} else if (Static390.anInt7654 - local85 - 1 < local139) {
								local139 = Static390.anInt7654 - local85 - 1;
							}
							@Pc(210) int local210 = Static235.method3837(Static526.aClass232Array1[local71.aByte127], 0, true, -1, local71.anIntArray207[0], local85, Static245.anIntArray276, local139, local131, 0, local85, local85, local71.anIntArray206[0], Static302.anIntArray333);
							if (local210 > 0) {
								if (local210 > 9) {
									local210 = 9;
								}
								for (@Pc(222) int local222 = 0; local222 < local210; local222++) {
									local71.anIntArray206[local222] = Static245.anIntArray276[local210 - local222 - 1];
									local71.anIntArray207[local222] = Static302.anIntArray333[local210 - local222 - 1];
									local71.aByteArray34[local222] = 1;
								}
								local71.anInt4277 = local210;
							}
						}
					}
					Static123.method7021(local71, true);
					local109 = Static145.method2519(local71);
					Static10.method716(local71);
					Static538.method7538(local71, Static203.anInt4167, local109, Static470.anInt8940);
					Static282.method4488(Static470.anInt8940, local71);
					Static381.method5905(local71);
				}
			}
		}
		if (Static575.anInt10384 == 0 && Static232.anInt4898 == 0) {
			if (Static300.anInt6053 == 2) {
				Static359.method5412();
			} else {
				Static23.method888();
			}
			if (Static534.anInt9775 >> 9 < 14 || Static338.anInt6508 - 14 <= Static534.anInt9775 >> 9 || Static114.anInt2613 >> 9 < 14 || Static114.anInt2613 >> 9 >= Static390.anInt7654 - 14) {
				Static259.method4099();
			}
		}
		while (true) {
			@Pc(352) Class4_Sub37 local352;
			@Pc(357) Class155 local357;
			@Pc(368) Class155 local368;
			do {
				local352 = (Class4_Sub37) Static360.aClass22_45.method896();
				if (local352 == null) {
					while (true) {
						do {
							local352 = (Class4_Sub37) Static72.aClass22_15.method896();
							if (local352 == null) {
								while (true) {
									do {
										local352 = (Class4_Sub37) Static197.aClass22_23.method896();
										if (local352 == null) {
											if (Static292.aClass155_7 != null) {
												Static497.method7183();
											}
											if (Static306.anInt6122 % 1500 == 0) {
												Static220.method7178();
											}
											if (Static9.anInt758 == 7 && Static575.anInt10384 == 0) {
												Static5.method114();
											}
											Static62.method8024();
											if (Static1.aBoolean353 && Static112.method2047() - 60000L > Static386.aLong199) {
												Static573.method8080();
											}
											for (@Pc(530) Class21_Sub3_Sub2 local530 = (Class21_Sub3_Sub2) Static339.aClass158_15.method3726(); local530 != null; local530 = (Class21_Sub3_Sub2) Static339.aClass158_15.method3721()) {
												if ((long) local530.anInt10591 < Static112.method2047() / 1000L - 5L) {
													if (local530.aShort125 > 0) {
														Static84.method1791(5, "", "", local530.aString234 + Static223.aClass152_23.method3624(Static142.anInt3088), 0, "");
													}
													if (local530.aShort125 == 0) {
														Static84.method1791(5, "", "", local530.aString234 + Static223.aClass152_24.method3624(Static142.anInt3088), 0, "");
													}
													local530.method8246();
												}
											}
											if (Static9.anInt758 == 7 && Static575.anInt10384 == 0) {
												if (Static528.aClass36_2 == null) {
													Static254.method4043(false);
													return;
												}
												Static494.anInt9313++;
												if (Static494.anInt9313 > 50) {
													@Pc(634) Class4_Sub39 local634 = Static32.method999(Static402.aClass356_1, Static247.aClass344_35);
													Static50.method1166(local634);
												}
												try {
													Static446.method6581();
													return;
												} catch (@Pc(641) IOException local641) {
													Static254.method4043(false);
													return;
												}
											}
											return;
										}
										local357 = local352.aClass155_10;
										if (local357.anInt4765 < 0) {
											break;
										}
										local368 = Static558.method7916(local357.anInt4769);
									} while (local368 == null || local368.aClass155Array2 == null || local368.aClass155Array2.length <= local357.anInt4765 || local357 != local368.aClass155Array2[local357.anInt4765]);
									Static471.method6884(local352);
								}
							}
							local357 = local352.aClass155_10;
							if (local357.anInt4765 < 0) {
								break;
							}
							local368 = Static558.method7916(local357.anInt4769);
						} while (local368 == null || local368.aClass155Array2 == null || local368.aClass155Array2.length <= local357.anInt4765 || local368.aClass155Array2[local357.anInt4765] != local357);
						Static471.method6884(local352);
					}
				}
				local357 = local352.aClass155_10;
				if (local357.anInt4765 < 0) {
					break;
				}
				local368 = Static558.method7916(local357.anInt4769);
			} while (local368 == null || local368.aClass155Array2 == null || local368.aClass155Array2.length <= local357.anInt4765 || local357 != local368.aClass155Array2[local357.anInt4765]);
			Static471.method6884(local352);
		}
	}
}
