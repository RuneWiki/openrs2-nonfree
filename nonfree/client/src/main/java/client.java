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
				Static332.method4387("Argument count");
			}
			Static290.aClass220_4 = new Class220();
			Static290.aClass220_4.anInt5746 = Integer.parseInt(arg0[0]);
			Static240.aClass220_3 = new Class220();
			Static240.aClass220_3.anInt5746 = Integer.parseInt(arg0[1]);
			Static122.aClass220_2 = new Class220();
			Static122.aClass220_2.anInt5746 = Integer.parseInt(arg0[2]);
			Static193.aClass178_9 = Static236.aClass178_15;
			if (arg0[3].equals("live")) {
				Static140.aClass201_3 = Static427.aClass201_5;
			} else if (arg0[3].equals("rc")) {
				Static140.aClass201_3 = Static37.aClass201_2;
			} else if (arg0[3].equals("wip")) {
				Static140.aClass201_3 = Static1.aClass201_1;
			} else {
				Static332.method4387("modewhat");
			}
			Static429.anInt6999 = Static187.method2740(arg0[4]);
			if (Static429.anInt6999 == -1) {
				if (arg0[4].equals("english")) {
					Static429.anInt6999 = 0;
				} else if (arg0[4].equals("german")) {
					Static429.anInt6999 = 1;
				} else {
					Static332.method4387("language");
				}
			}
			Static141.aBoolean165 = false;
			Static443.aBoolean524 = false;
			if (arg0[5].equals("game0")) {
				Static231.aClass6_7 = Static43.aClass6_6;
			} else if (arg0[5].equals("game1")) {
				Static231.aClass6_7 = Static15.aClass6_1;
			} else {
				Static332.method4387("game");
			}
			Static400.anInt6511 = 0;
			Static268.anInt4436 = Static231.aClass6_7.anInt96;
			Static339.anInt5516 = 0;
			Static428.aBoolean505 = true;
			Static219.aBoolean281 = true;
			Static7.aString2 = "";
			@Pc(156) client local156 = new client();
			Static425.aClient1 = local156;
			local156.method741(Static140.aClass201_3.method4061() + 32, Static231.aClass6_7.aString1);
			Static43.aFrame4.setLocation(40, 40);
		} catch (@Pc(180) Exception local180) {
			Static33.method448(local180, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method748() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static283.method3705();
		Static185.aClass234_2 = new Class234(Static24.aClass196_1);
		Static373.aClass54_2 = new Class54();
		if (Static324.aClass178_18 != Static193.aClass178_9) {
			Static184.aByteArrayArray8 = new byte[50][];
		}
		Static413.aClass49_Sub1_1 = new Class49_Sub1(Static24.aClass196_1);
		if (Static324.aClass178_18 == Static193.aClass178_9) {
			Static290.aClass220_4.aString62 = this.getCodeBase().getHost();
		} else if (Static173.method2398(Static193.aClass178_9)) {
			Static290.aClass220_4.aString62 = this.getCodeBase().getHost();
			Static290.aClass220_4.anInt5753 = Static290.aClass220_4.anInt5746 + 40000;
			Static240.aClass220_3.anInt5753 = Static240.aClass220_3.anInt5746 + 40000;
			Static290.aClass220_4.anInt5751 = Static290.aClass220_4.anInt5746 + 50000;
			Static122.aClass220_2.anInt5753 = Static122.aClass220_2.anInt5746 + 40000;
			Static240.aClass220_3.anInt5751 = Static240.aClass220_3.anInt5746 + 50000;
			Static122.aClass220_2.anInt5751 = Static122.aClass220_2.anInt5746 + 50000;
		} else if (Static193.aClass178_9 == Static236.aClass178_15) {
			Static290.aClass220_4.aString62 = "127.0.0.1";
			Static240.aClass220_3.aString62 = "127.0.0.1";
			Static122.aClass220_2.aString62 = "127.0.0.1";
			Static290.aClass220_4.anInt5753 = Static290.aClass220_4.anInt5746 + 40000;
			Static240.aClass220_3.anInt5753 = Static240.aClass220_3.anInt5746 + 40000;
			Static290.aClass220_4.anInt5751 = Static290.aClass220_4.anInt5746 + 50000;
			Static122.aClass220_2.anInt5753 = Static122.aClass220_2.anInt5746 + 40000;
			Static240.aClass220_3.anInt5751 = Static240.aClass220_3.anInt5746 + 50000;
			Static122.aClass220_2.anInt5751 = Static122.aClass220_2.anInt5746 + 50000;
		}
		Static338.aClass220_5 = Static290.aClass220_4;
		if (Static231.aClass6_7 == Static15.aClass6_1) {
			Static34.aShortArray30 = Static391.aShortArray108;
			Static180.aShortArrayArray3 = Static362.aShortArrayArray6;
			Static196.aBoolean269 = true;
			Static63.anInt5743 = 0;
			Static171.anInt3111 = 16777215;
			Static276.aShortArray84 = Static25.aShortArray1;
			Static155.aShortArrayArray2 = Static243.aShortArrayArray5;
		} else {
			Static155.aShortArrayArray2 = Static412.aShortArrayArray8;
			Static180.aShortArrayArray3 = Static70.aShortArrayArray1;
			Static276.aShortArray84 = Static401.aShortArray110;
			Static34.aShortArray30 = Static234.aShortArray65;
		}
		if (Static231.aClass6_7 == Static43.aClass6_6) {
			Static7.aBoolean4 = false;
		}
		Static252.aShortArray80 = Static361.aShortArray9 = Static208.aShortArray113 = Static257.aShortArray82 = new short[256];
		Static180.aClass107_1 = Static258.method3440(Static391.aCanvas5);
		Static455.aClass48_1 = Static250.method3301(Static391.aCanvas5);
		Static87.aClass47_1 = Static231.method3151();
		if (Static87.aClass47_1 != null) {
			Static87.aClass47_1.method2872(Static391.aCanvas5);
		}
		Static166.anInt3039 = Static300.anInt4900;
		try {
			if (Static24.aClass196_1.aClass70_3 != null) {
				Static23.aClass142_7 = new Class142(Static24.aClass196_1.aClass70_3, 5200, 0);
				for (@Pc(225) int local225 = 0; local225 < 30; local225++) {
					Static309.aClass142Array1[local225] = new Class142(Static24.aClass196_1.aClass70Array1[local225], 6000, 0);
				}
				Static375.aClass142_6 = new Class142(Static24.aClass196_1.aClass70_2, 6000, 0);
				Static140.aClass117_2 = new Class117(255, Static23.aClass142_7, Static375.aClass142_6, 500000);
				Static37.aClass142_2 = new Class142(Static24.aClass196_1.aClass70_4, 24, 0);
				Static24.aClass196_1.aClass70_3 = null;
				Static24.aClass196_1.aClass70_2 = null;
				Static24.aClass196_1.aClass70_4 = null;
				Static24.aClass196_1.aClass70Array1 = null;
			}
		} catch (@Pc(281) IOException local281) {
			Static140.aClass117_2 = null;
			Static23.aClass142_7 = null;
			Static375.aClass142_6 = null;
			Static37.aClass142_2 = null;
		}
		if (Static324.aClass178_18 != Static193.aClass178_9) {
			Static397.aBoolean449 = true;
		}
		if (Static43.aClass6_6 == Static231.aClass6_7) {
			Static281.aString41 = Static363.aClass15_101.method180(Static429.anInt6999);
		} else if (Static231.aClass6_7 == Static15.aClass6_1) {
			Static281.aString41 = Static370.aClass15_111.method180(Static429.anInt6999);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method735()) {
			return;
		}
		Static290.aClass220_4 = new Class220();
		Static290.aClass220_4.anInt5746 = Integer.parseInt(this.getParameter("worldid"));
		Static240.aClass220_3 = new Class220();
		Static240.aClass220_3.anInt5746 = Integer.parseInt(this.getParameter("lobbyid"));
		Static240.aClass220_3.aString62 = this.getParameter("lobbyaddress");
		Static122.aClass220_2 = new Class220();
		Static122.aClass220_2.anInt5746 = Integer.parseInt(this.getParameter("demoid"));
		Static122.aClass220_2.aString62 = this.getParameter("demoaddress");
		Static193.aClass178_9 = Static142.method2008(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static173.method2398(Static193.aClass178_9) && Static324.aClass178_18 != Static193.aClass178_9) {
			Static193.aClass178_9 = Static324.aClass178_18;
		}
		Static140.aClass201_3 = Static325.method4289(Integer.parseInt(this.getParameter("modewhat")));
		if (Static140.aClass201_3 != Static1.aClass201_1 && Static140.aClass201_3 != Static37.aClass201_2 && Static140.aClass201_3 != Static427.aClass201_5) {
			Static140.aClass201_3 = Static427.aClass201_5;
		}
		try {
			Static429.anInt6999 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static429.anInt6999 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static141.aBoolean165 = true;
		} else {
			Static141.aBoolean165 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static443.aBoolean524 = true;
		} else {
			Static443.aBoolean524 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static225.aBoolean285 = true;
		} else {
			Static225.aBoolean285 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static231.aClass6_7 = Static43.aClass6_6;
			} else if (local145.equals("1")) {
				Static231.aClass6_7 = Static15.aClass6_1;
			}
		}
		try {
			Static400.anInt6511 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static400.anInt6511 = 0;
		}
		Static353.aString64 = this.getParameter("quiturl");
		Static7.aString2 = this.getParameter("settings");
		if (Static7.aString2 == null) {
			Static7.aString2 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static339.anInt5516 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static339.anInt5516 = 0;
			}
		}
		Static268.anInt4436 = Integer.parseInt(this.getParameter("colourid"));
		if (Static268.anInt4436 < 0 || Static268.anInt4436 >= Static338.aColorArray2.length) {
			Static268.anInt4436 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static428.aBoolean505 = true;
			Static219.aBoolean281 = true;
		}
		if (Static231.aClass6_7 == Static43.aClass6_6) {
			Static421.anInt7076 = 503;
			Static81.anInt1607 = 765;
		} else if (Static231.aClass6_7 == Static15.aClass6_1) {
			Static81.anInt1607 = 640;
			Static421.anInt7076 = 480;
		}
		Static425.aClient1 = this;
		this.method747(Static421.anInt7076, Static140.aClass201_3.method4061() + 32, Static81.anInt1607);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method743() {
		try {
			this.method768();
		} catch (@Pc(13) OutOfMemoryError local13) {
			if (local13.getMessage() == null || !local13.getMessage().startsWith("native")) {
				throw local13;
			}
			Static398.method4984(0);
			Static33.method448(local13, local13.getMessage() + " (Recovered) " + this.method737());
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method740() {
		if (Static247.aBoolean303) {
			Static125.method1758();
		}
		if (Static39.aClass135_1 != null) {
			Static39.aClass135_1.method5332();
		}
		if (Static276.aFrame5 != null) {
			Static339.method4485(Static276.aFrame5, Static24.aClass196_1);
			Static276.aFrame5 = null;
		}
		if (Static338.aClass152_4 != null) {
			Static338.aClass152_4.method2924();
			Static338.aClass152_4 = null;
		}
		if (Static87.aClass47_1 != null) {
			Static87.aClass47_1.method2873(Static391.aCanvas5);
		}
		Static87.aClass47_1 = null;
		Static223.method3023();
		Static373.aClass54_2.method1240();
		Static185.aClass234_2.method4929();
		if (Static160.aClass40_2 != null) {
			Static160.aClass40_2.method686();
			Static160.aClass40_2 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method734() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method755() {
		@Pc(6) int local6;
		if (!Static413.aClass49_Sub1_1.aBoolean239) {
			for (local6 = 0; local6 < Static306.anInt5006; local6++) {
				if (Static167.aClass36Array1[local6].method577() == 's' || Static167.aClass36Array1[local6].method577() == 'S') {
					Static413.aClass49_Sub1_1.aBoolean239 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static294.anInt4834 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local55 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(58) long local58 = Static266.method3498();
			if (Static63.aLong175 == 0L) {
				Static63.aLong175 = local58;
			}
			if (local55 > 16384 && local58 - Static63.aLong175 < 5000L) {
				if (local58 - Static370.aLong187 > 1000L) {
					System.gc();
					Static370.aLong187 = local58;
				}
				Static166.aString26 = Static245.aClass15_66.method180(Static429.anInt6999);
				Static90.anInt1726 = 5;
			} else {
				Static166.aString26 = Static13.aClass15_7.method180(Static429.anInt6999);
				Static294.anInt4834 = 10;
				Static90.anInt1726 = 5;
			}
		} else if (Static294.anInt4834 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static409.aClass128Array1[local6] = Static49.method641(Static337.anInt5497, Static282.anInt4644);
			}
			Static166.aString26 = Static285.aClass15_81.method180(Static429.anInt6999);
			Static294.anInt4834 = 20;
			Static90.anInt1726 = 10;
		} else if (Static294.anInt4834 == 20) {
			if (Static75.aClass109_1 == null) {
				Static75.aClass109_1 = new Class109(Static373.aClass54_2, Static185.aClass234_2);
			}
			if (Static75.aClass109_1.method2042()) {
				Static179.aClass211_50 = Static384.method5094(true, false, 0);
				Static284.aClass211_69 = Static384.method5094(true, false, 1);
				Static170.aClass211_95 = Static384.method5094(true, false, 2);
				Static37.aClass211_13 = Static384.method5094(true, false, 3);
				Static277.aClass211_67 = Static384.method5094(true, false, 4);
				Static280.aClass211_68 = Static384.method5094(true, true, 5);
				Static231.aClass211_62 = Static384.method5094(false, true, 6);
				Static8.aClass211_5 = Static384.method5094(true, false, 7);
				Static13.aClass211_11 = Static384.method5094(true, false, 8);
				Static172.aClass211_46 = Static384.method5094(true, false, 9);
				Static226.aClass211_61 = Static384.method5094(true, false, 10);
				Static268.aClass211_65 = Static384.method5094(true, false, 11);
				Static4.aClass211_2 = Static384.method5094(true, false, 12);
				Static57.aClass211_18 = Static384.method5094(true, false, 13);
				Static399.aClass211_87 = Static384.method5094(false, false, 14);
				Static10.aClass211_6 = Static384.method5094(true, false, 15);
				Static81.aClass211_22 = Static384.method5094(true, false, 16);
				Static108.aClass211_8 = Static384.method5094(true, false, 17);
				Static11.aClass211_9 = Static384.method5094(true, false, 18);
				Static391.aClass211_85 = Static384.method5094(true, false, 19);
				Static75.aClass211_20 = Static384.method5094(true, false, 20);
				Static291.aClass211_72 = Static384.method5094(true, false, 21);
				Static405.aClass211_90 = Static384.method5094(true, false, 22);
				Static359.aClass211_80 = Static384.method5094(true, true, 23);
				Static120.aClass211_31 = Static384.method5094(true, false, 24);
				Static40.aClass211_15 = Static384.method5094(true, false, 25);
				Static327.aClass211_78 = Static384.method5094(true, true, 26);
				Static43.aClass211_55 = Static384.method5094(true, false, 27);
				Static23.aClass211_86 = Static384.method5094(true, true, 28);
				Static271.aClass211_66 = Static384.method5094(true, false, 29);
				Static166.aString26 = Static182.aClass15_51.method180(Static429.anInt6999);
				Static90.anInt1726 = 15;
				Static294.anInt4834 = 30;
			} else {
				Static166.aString26 = Static295.aClass15_83.method180(Static429.anInt6999);
				Static90.anInt1726 = 12;
			}
		} else if (Static294.anInt4834 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 30; local55++) {
				local6 += Static339.aClass124_Sub1Array2[local55].method5849() * Static283.anIntArray376[local55] / 100;
			}
			if (local6 == 100) {
				Static166.aString26 = Static256.aClass15_74.method180(Static429.anInt6999);
				Static90.anInt1726 = 20;
				Static283.method3704(Static13.aClass211_11);
				Static408.method5547(Static13.aClass211_11);
				Static294.anInt4834 = 40;
			} else {
				if (local6 != 0) {
					Static166.aString26 = Static253.aClass15_70.method180(Static429.anInt6999) + local6 + "%";
				}
				Static90.anInt1726 = 20;
			}
		} else if (Static294.anInt4834 == 40) {
			if (Static23.aClass211_86.method4360()) {
				this.method756(Static23.aClass211_86.method4353(1));
				Static166.aString26 = Static386.aClass15_116.method180(Static429.anInt6999);
				Static294.anInt4834 = 50;
				Static90.anInt1726 = 25;
			} else {
				Static166.aString26 = Static79.aClass15_25.method180(Static429.anInt6999) + Static23.aClass211_86.method4359() + "%";
				Static90.anInt1726 = 25;
			}
		} else if (Static294.anInt4834 == 50) {
			Static333.method4393();
			Static166.aString26 = Static306.aClass15_88.method180(Static429.anInt6999);
			Static294.anInt4834 = 60;
			Static90.anInt1726 = 30;
		} else if (Static294.anInt4834 == 60) {
			local6 = Static84.method4129(Static57.aClass211_18, Static13.aClass211_11);
			local55 = Static250.method3303();
			if (local6 < local55) {
				Static166.aString26 = Static100.aClass15_35.method180(Static429.anInt6999) + local6 * 100 / local55 + "%";
				Static90.anInt1726 = 35;
			} else {
				Static166.aString26 = Static254.aClass15_71.method180(Static429.anInt6999);
				Static90.anInt1726 = 35;
				Static294.anInt4834 = 70;
			}
		} else if (Static294.anInt4834 == 70) {
			local6 = Static145.method2041(Static13.aClass211_11);
			local55 = Static166.method2311();
			if (local55 > local6) {
				Static166.aString26 = Static212.aClass15_58.method180(Static429.anInt6999) + local6 * 100 / local55 + "%";
				Static90.anInt1726 = 40;
			} else {
				Static166.aString26 = Static281.aClass15_80.method180(Static429.anInt6999);
				Static294.anInt4834 = 80;
				Static90.anInt1726 = 40;
			}
		} else if (Static294.anInt4834 == 80) {
			if (Static327.aClass211_78.method4360()) {
				Static91.anInterface5_2 = new Class205(Static327.aClass211_78, Static172.aClass211_46, Static13.aClass211_11);
				Static166.aString26 = Static261.aClass15_76.method180(Static429.anInt6999);
				Static90.anInt1726 = 45;
				Static294.anInt4834 = 90;
			} else {
				Static166.aString26 = Static197.aClass15_55.method180(Static429.anInt6999) + Static327.aClass211_78.method4359() + "%";
				Static90.anInt1726 = 45;
			}
		} else if (Static294.anInt4834 == 90) {
			Static166.aString26 = Static31.aClass15_14.method180(Static429.anInt6999);
			Static294.anInt4834 = 95;
			Static90.anInt1726 = 50;
		} else if (Static294.anInt4834 == 95) {
			if (Static413.aClass49_Sub1_1.aBoolean239) {
				Static413.aClass49_Sub1_1.anInt3221 = 0;
				Static413.aClass49_Sub1_1.anInt3202 = 0;
				Static413.aClass49_Sub1_1.anInt3207 = 1;
				Static413.aClass49_Sub1_1.anInt3201 = 0;
				Static413.aClass49_Sub1_1.anInt3200 = 0;
			}
			Static413.aClass49_Sub1_1.aBoolean239 = true;
			Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
			Static192.method2786(false, Static413.aClass49_Sub1_1.anInt3221);
			Static166.aString26 = Static380.aClass15_114.method180(Static429.anInt6999);
			Static294.anInt4834 = 100;
			Static90.anInt1726 = 55;
		} else if (Static294.anInt4834 == 100) {
			Static256.method3379(Static57.aClass211_18, Static39.aClass135_1, Static13.aClass211_11);
			Static166.aString26 = Static229.aClass15_61.method180(Static429.anInt6999);
			Static90.anInt1726 = 60;
			Static119.method4569(1);
			Static294.anInt4834 = 110;
		} else if (Static294.anInt4834 == 110) {
			Static170.aClass211_95.method4360();
			local6 = Static170.aClass211_95.method4359();
			Static81.aClass211_22.method4360();
			local6 += Static81.aClass211_22.method4359();
			Static108.aClass211_8.method4360();
			local6 += Static108.aClass211_8.method4359();
			Static11.aClass211_9.method4360();
			local6 += Static11.aClass211_9.method4359();
			Static391.aClass211_85.method4360();
			local6 += Static391.aClass211_85.method4359();
			Static75.aClass211_20.method4360();
			local6 += Static75.aClass211_20.method4359();
			Static291.aClass211_72.method4360();
			local6 += Static291.aClass211_72.method4359();
			Static405.aClass211_90.method4360();
			local6 += Static405.aClass211_90.method4359();
			Static120.aClass211_31.method4360();
			local6 += Static120.aClass211_31.method4359();
			Static40.aClass211_15.method4360();
			local6 += Static40.aClass211_15.method4359();
			Static43.aClass211_55.method4360();
			local6 += Static43.aClass211_55.method4359();
			Static271.aClass211_66.method4360();
			local6 += Static271.aClass211_66.method4359();
			if (local6 < 1200) {
				Static166.aString26 = Static208.aClass15_123.method180(Static429.anInt6999) + local6 / 12 + "%";
				Static90.anInt1726 = 65;
			} else {
				Static435.aClass240_2 = new Class240(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static445.aClass1_1 = new Class1(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static357.aClass5_2 = new Class5(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95, Static13.aClass211_11);
				Static294.aClass252_1 = new Class252(Static231.aClass6_7, Static429.anInt6999, Static108.aClass211_8);
				Static351.aClass79_4 = new Class79(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static74.aClass12_2 = new Class12(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static116.aClass101_2 = new Class101(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95, Static8.aClass211_5);
				Static332.aClass159_1 = new Class159(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static458.aClass31_4 = new Class31(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static51.aClass151_1 = new Class151(Static231.aClass6_7, Static429.anInt6999, true, Static81.aClass211_22, Static8.aClass211_5);
				Static82.aClass235_1 = new Class235(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95, Static13.aClass211_11);
				Static357.aClass122_3 = new Class122(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95, Static13.aClass211_11);
				Static120.aClass115_2 = new Class115(Static231.aClass6_7, Static429.anInt6999, true, Static11.aClass211_9, Static8.aClass211_5);
				Static416.aClass64_2 = new Class64(Static231.aClass6_7, Static429.anInt6999, true, Static435.aClass240_2, Static391.aClass211_85, Static8.aClass211_5);
				Static378.aClass94_4 = new Class94(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static170.aClass125_3 = new Class125(Static231.aClass6_7, Static429.anInt6999, Static75.aClass211_20, Static179.aClass211_50, Static284.aClass211_69);
				Static344.aClass263_1 = new Class263(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static28.aClass129_3 = new Class129(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static452.aClass246_2 = new Class246(Static231.aClass6_7, Static429.anInt6999, Static291.aClass211_72, Static8.aClass211_5);
				Static444.aClass179_1 = new Class179(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static176.aClass266_1 = new Class266(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static74.aClass204_1 = new Class204(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static426.aClass156_2 = new Class156(Static231.aClass6_7, Static429.anInt6999, Static405.aClass211_90);
				Static438.aClass143_5 = new Class143(Static231.aClass6_7, Static429.anInt6999, Static170.aClass211_95);
				Static295.method3844(Static37.aClass211_13, Static57.aClass211_18, Static8.aClass211_5, Static13.aClass211_11);
				Static179.method2496(Static271.aClass211_66);
				Static190.aClass97_1 = new Class97(Static429.anInt6999, Static120.aClass211_31, Static40.aClass211_15);
				Static350.aClass66_1 = new Class66(Static429.anInt6999, Static120.aClass211_31, Static40.aClass211_15, new Class16());
				Static166.aString26 = Static438.aClass15_45.method180(Static429.anInt6999);
				Static90.anInt1726 = 65;
				Static453.method6004();
				Static51.aClass151_1.method2915(!Static413.aClass49_Sub1_1.method2485(Static341.anInt5549));
				Static52.aClass81_1 = new Class81();
				Static207.method2904();
				Static199.method2852(Static43.aClass211_55);
				Static323.method4975(Static91.anInterface5_2, Static8.aClass211_5);
				Static294.anInt4834 = 120;
			}
		} else if (Static294.anInt4834 == 120) {
			local6 = Static162.method60(Static13.aClass211_11);
			local55 = Static150.method2111();
			if (local55 > local6) {
				Static166.aString26 = Static87.aClass15_30.method180(Static429.anInt6999) + local6 * 100 / local55 + "%";
				Static90.anInt1726 = 70;
			} else {
				Static129.method1851(Static13.aClass211_11, Static39.aClass135_1);
				Static225.method3048(Static164.aClass95Array6);
				Static166.aString26 = Static196.aClass15_54.method180(Static429.anInt6999);
				Static90.anInt1726 = 70;
				Static294.anInt4834 = 130;
			}
		} else if (Static294.anInt4834 == 130) {
			if (Static226.aClass211_61.method4378("huffman", "")) {
				@Pc(1214) Class236 local1214 = new Class236(Static226.aClass211_61.method4362("", "huffman"));
				Static302.method3944(local1214);
				Static166.aString26 = Static74.aClass15_24.method180(Static429.anInt6999);
				Static294.anInt4834 = 140;
				Static90.anInt1726 = 75;
			} else {
				Static166.aString26 = Static144.aClass15_41.method180(Static429.anInt6999) + "0%";
				Static90.anInt1726 = 75;
			}
		} else if (Static294.anInt4834 == 140) {
			if (Static37.aClass211_13.method4360()) {
				Static166.aString26 = Static359.aClass15_109.method180(Static429.anInt6999);
				Static90.anInt1726 = 80;
				Static294.anInt4834 = 150;
			} else {
				Static166.aString26 = Static375.aClass15_113.method180(Static429.anInt6999) + Static37.aClass211_13.method4359() + "%";
				Static90.anInt1726 = 80;
			}
		} else if (Static294.anInt4834 == 150) {
			if (Static4.aClass211_2.method4360()) {
				Static166.aString26 = Static346.aClass15_105.method180(Static429.anInt6999);
				Static90.anInt1726 = 82;
				Static294.anInt4834 = 160;
			} else {
				Static166.aString26 = Static428.aClass15_129.method180(Static429.anInt6999) + Static4.aClass211_2.method4359() + "%";
				Static90.anInt1726 = 82;
			}
		} else if (Static294.anInt4834 == 160) {
			if (Static57.aClass211_18.method4360()) {
				Static166.aString26 = Static254.aClass15_72.method180(Static429.anInt6999);
				Static294.anInt4834 = 170;
				Static90.anInt1726 = 85;
			} else {
				Static166.aString26 = Static254.aClass15_72.method180(Static429.anInt6999) + Static57.aClass211_18.method4359() + "%";
				Static90.anInt1726 = 85;
			}
		} else if (Static294.anInt4834 == 170) {
			if (Static359.aClass211_80.method4376("details")) {
				Static292.method4939(Static359.aClass211_80, Static351.aClass79_4, Static74.aClass12_2, Static51.aClass151_1, Static82.aClass235_1, Static357.aClass122_3, Static52.aClass81_1);
				Static166.aString26 = Static325.aClass15_95.method180(Static429.anInt6999);
				Static90.anInt1726 = 89;
				Static294.anInt4834 = 190;
			} else {
				Static166.aString26 = Static175.aClass15_50.method180(Static429.anInt6999) + Static359.aClass211_80.method4380("details") + "%";
				Static90.anInt1726 = 87;
			}
		} else if (Static294.anInt4834 == 190) {
			Static432.aStringArray45 = new String[Static176.aClass266_1.anInt7472];
			Static83.anIntArray416 = new int[Static74.aClass204_1.anInt5088];
			Static269.aBooleanArray22 = new boolean[Static74.aClass204_1.anInt5088];
			for (local6 = 0; local6 < Static74.aClass204_1.anInt5088; local6++) {
				if (Static74.aClass204_1.method4074(local6).anInt2117 == 0) {
					Static269.aBooleanArray22[local6] = true;
					Static275.anInt4595++;
				}
				Static83.anIntArray416[local6] = -1;
			}
			Static131.method1901();
			Static343.anInt5688 = Static37.aClass211_13.method4384("loginscreen");
			Static40.anInt665 = Static37.aClass211_13.method4384("lobbyscreen");
			Static280.aClass211_68.method4385(false);
			Static231.aClass211_62.method4385(true);
			Static13.aClass211_11.method4385(true);
			Static57.aClass211_18.method4385(true);
			Static226.aClass211_61.method4385(true);
			Static37.aClass211_13.method4385(true);
			Static401.aBoolean452 = true;
			Static170.aClass211_95.anInt5388 = 2;
			Static108.aClass211_8.anInt5388 = 2;
			Static81.aClass211_22.anInt5388 = 2;
			Static11.aClass211_9.anInt5388 = 2;
			Static391.aClass211_85.anInt5388 = 2;
			Static75.aClass211_20.anInt5388 = 2;
			Static291.aClass211_72.anInt5388 = 2;
			Static265.method3497(false, -1, -1, Static413.aClass49_Sub1_1.anInt3207);
			Static166.aString26 = Static458.aClass15_121.method180(Static429.anInt6999);
			Static294.anInt4834 = 200;
			Static90.anInt1726 = 95;
		} else if (Static294.anInt4834 == 200) {
			Static119.method4569(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method756(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.method5007();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(115) int[] local115 = Static410.anIntArray525 = new int[6];
						local115[0] = local14.method5028();
						local115[1] = local14.method5028();
						local115[2] = local14.method5028();
						local115[3] = local14.method5028();
						local115[4] = local14.method5028();
						local115[5] = local14.method5028();
					} else {
						@Pc(40) int local40;
						@Pc(35) int local35;
						if (local18 == 4) {
							local35 = local14.method5007();
							Static373.anIntArray492 = new int[local35];
							for (local40 = 0; local40 < local35; local40++) {
								Static373.anIntArray492[local40] = local14.method5028();
								if (Static373.anIntArray492[local40] == 65535) {
									Static373.anIntArray492[local40] = -1;
								}
							}
						} else if (local18 == 5) {
							local35 = local14.method5007();
							Static291.anIntArray387 = new int[local35];
							for (local40 = 0; local40 < local35; local40++) {
								Static291.anIntArray387[local40] = local14.method5028();
								if (Static291.anIntArray387[local40] == 65535) {
									Static291.anIntArray387[local40] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)Ljava/lang/String;")
	@Override
	protected String method737() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static365.anInt6047 + "," + Static366.anInt6052 + "," + Static337.anInt5497 + "," + Static282.anInt4644 + "|";
			if (Static401.aClass8_Sub3_Sub1_Sub1_2 != null) {
				local5 = local5 + "2)" + Static68.anInt1387 + "," + (Static365.anInt6047 + Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0]) + "," + (Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] + Static366.anInt6052) + "|";
			}
			local5 = local5 + "3)" + Static341.anInt5549 + "|4)" + Static413.aClass49_Sub1_1.anInt3200 + "|5)" + Static37.method500() + "|6)" + Static345.anInt5723 + "," + Static120.anInt2134 + "|";
			local5 = local5 + "7)" + Static413.aClass49_Sub1_1.method2481(Static341.anInt5549) + "|";
			local5 = local5 + "8)" + Static413.aClass49_Sub1_1.method2478(Static341.anInt5549) + "|";
			local5 = local5 + "9)" + Static413.aClass49_Sub1_1.aBoolean236 + "|";
			local5 = local5 + "10)" + Static413.aClass49_Sub1_1.aBoolean237 + "|";
			local5 = local5 + "11)" + Static413.aClass49_Sub1_1.aBoolean245 + "|";
			local5 = local5 + "12)" + Static413.aClass49_Sub1_1.method2485(Static341.anInt5549) + "|";
			local5 = local5 + "13)" + Static18.anInt296 + "|";
			local5 = local5 + "14)" + Static8.anInt119;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(224) Throwable local224) {
			}
			local5 = local5 + "]";
		} catch (@Pc(235) Throwable local235) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method739() {
		try {
			this.method765();
		} catch (@Pc(16) OutOfMemoryError local16) {
			if (local16.getMessage() == null || !local16.getMessage().startsWith("native")) {
				throw local16;
			}
			Static398.method4984(0);
			Static33.method448(local16, local16.getMessage() + " (Recovered) " + this.method737());
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method762(@OriginalArg(0) int arg0) {
		Static373.aClass54_2.anInt1521++;
		Static226.anInt3894 = 0;
		Static263.aClass152_3 = null;
		Static373.aClass54_2.anInt1522 = arg0;
		Static406.aClass45_9 = null;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method763() {
		@Pc(7) boolean local7 = Static373.aClass54_2.method1234();
		if (!local7) {
			this.method764();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method764() {
		if (Static373.aClass54_2.anInt1521 > Static430.anInt7136) {
			Static249.anInt7641 = (Static373.aClass54_2.anInt1521 * 50 - 50) * 5;
			Static338.aClass220_5.aBoolean406 = !Static338.aClass220_5.aBoolean406;
			if (Static249.anInt7641 > 3000) {
				Static249.anInt7641 = 3000;
			}
			if (Static373.aClass54_2.anInt1521 >= 2 && Static373.aClass54_2.anInt1522 == 6) {
				this.method745("js5connect_outofdate");
				Static8.anInt119 = 13;
				return;
			}
			if (Static373.aClass54_2.anInt1521 >= 4 && Static373.aClass54_2.anInt1522 == -1) {
				this.method745("js5crc");
				Static8.anInt119 = 13;
				return;
			}
			if (Static373.aClass54_2.anInt1521 >= 4 && Static313.method4068(Static8.anInt119)) {
				if (Static373.aClass54_2.anInt1522 == 7 || Static373.aClass54_2.anInt1522 == 9) {
					this.method745("js5connect_full");
				} else if (Static373.aClass54_2.anInt1522 <= 0) {
					this.method745("js5io");
				} else {
					this.method745("js5connect");
				}
				Static8.anInt119 = 13;
				return;
			}
		}
		Static430.anInt7136 = Static373.aClass54_2.anInt1521;
		if (Static249.anInt7641 > 0) {
			Static249.anInt7641--;
			return;
		}
		try {
			if (Static226.anInt3894 == 0) {
				Static406.aClass45_9 = Static24.aClass196_1.method3914(Static338.aClass220_5.aString62, Static338.aClass220_5.method4602());
				Static226.anInt3894++;
			}
			if (Static226.anInt3894 == 1) {
				if (Static406.aClass45_9.anInt1129 == 2) {
					this.method762(1000);
					return;
				}
				if (Static406.aClass45_9.anInt1129 == 1) {
					Static226.anInt3894++;
				}
			}
			if (Static226.anInt3894 == 2) {
				Static263.aClass152_3 = new Class152((Socket) Static406.aClass45_9.anObject5, Static24.aClass196_1);
				@Pc(182) Class4_Sub9 local182 = new Class4_Sub9(5);
				local182.method4999(Static389.aClass44_2.anInt1111);
				local182.method5047(593);
				Static263.aClass152_3.method2926(5, local182.aByteArray81);
				Static226.anInt3894++;
				Static243.aLong117 = Static266.method3498();
			}
			if (Static226.anInt3894 == 3) {
				if (Static313.method4068(Static8.anInt119) || Static263.aClass152_3.method2921() > 0) {
					@Pc(222) int local222 = Static263.aClass152_3.method2925();
					if (local222 != 0) {
						this.method762(local222);
						return;
					}
					Static226.anInt3894++;
				} else if (Static266.method3498() - Static243.aLong117 > 30000L) {
					this.method762(1001);
					return;
				}
			}
			if (Static226.anInt3894 == 4) {
				@Pc(268) boolean local268 = Static8.anInt119 == 1 || Static173.method2395(Static8.anInt119) || Static405.method5418(Static8.anInt119);
				Static373.aClass54_2.method1232(Static263.aClass152_3, !local268);
				Static406.aClass45_9 = null;
				Static263.aClass152_3 = null;
				Static226.anInt3894 = 0;
			}
		} catch (@Pc(285) IOException local285) {
			this.method762(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method765() {
		if (Static8.anInt119 == 13) {
			return;
		}
		Static265.anInt4371++;
		if (Static265.anInt4371 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static198.anInt5149 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static370.aRandom1.setSeed((long) Static198.anInt5149);
		}
		if (Static265.anInt4371 % 50 == 0) {
			Static449.anInt7510 = Static212.anInt3691;
			Static212.anInt3691 = 0;
			Static347.anInt5756 = Static451.anInt7551;
			Static451.anInt7551 = 0;
		}
		this.method763();
		if (Static75.aClass109_1 != null) {
			Static75.aClass109_1.method2046();
		}
		Static77.method1257();
		Static180.aClass107_1.method2002();
		Static455.aClass48_1.method1145();
		if (Static87.aClass47_1 != null) {
			@Pc(83) int local83 = Static87.aClass47_1.method2875();
			Static157.anInt2901 = local83;
		}
		if (Static39.aClass135_1 != null) {
			Static39.aClass135_1.method5389((int) Static266.method3498());
		}
		Static190.method2774();
		Static306.anInt5006 = 0;
		for (@Pc(100) Class36 local100 = Static180.aClass107_1.method2000(); local100 != null && Static306.anInt5006 < 128; local100 = Static180.aClass107_1.method2000()) {
			if (local100.method573() != 1) {
				@Pc(111) char local111 = local100.method577();
				if (!Static168.method1847() || local111 != '`' && local111 != '§') {
					Static167.aClass36Array1[Static306.anInt5006] = local100;
					Static306.anInt5006++;
				} else if (Static223.method3022()) {
					Static220.method2996();
				} else {
					Static209.method2911();
				}
			}
		}
		for (@Pc(162) Class4_Sub1 local162 = Static455.aClass48_1.method1146(); local162 != null; local162 = Static455.aClass48_1.method1146()) {
			@Pc(168) int local168 = local162.method67();
			if (local168 == -1) {
				Static154.aClass244_14.method5273(local162);
			} else if (Static368.method4864(local168)) {
				Static398.aClass244_36.method5273(local162);
			}
			if (Static398.aClass244_36.method5266() > 10) {
				Static398.aClass244_36.method5268();
			}
		}
		if (Static223.method3022()) {
			Static105.method1580();
		}
		if (Static8.anInt119 == 0) {
			this.method755();
			Static251.method3313();
		} else if (Static8.anInt119 == 1) {
			this.method755();
			Static251.method3313();
		} else if (Static229.method3102(Static8.anInt119)) {
			Static388.method5134();
		}
		if (Static173.method2395(Static8.anInt119) && !Static229.method3102(Static8.anInt119)) {
			this.method767();
			Static161.method2282();
			Static173.method2399();
		} else if (Static405.method5418(Static8.anInt119) && !Static229.method3102(Static8.anInt119)) {
			this.method767();
			Static173.method2399();
		} else if (Static8.anInt119 == 11) {
			Static173.method2399();
		} else if (Static130.method1856(Static8.anInt119) && !Static229.method3102(Static8.anInt119)) {
			Static449.method5957();
		} else if (Static8.anInt119 == 12) {
			Static173.method2399();
			if (Static366.anInt6050 != -3 && Static366.anInt6050 != 2 && Static366.anInt6050 != 15) {
				Static33.method450(false);
			}
		}
		Static393.method5732(Static39.aClass135_1);
		Static398.aClass244_36.method5268();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method767() {
		@Pc(31) int local31;
		if (Static8.anInt119 == 6 && Static166.anInt3041 == 0) {
			if (Static284.anInt4667 > 0) {
				Static284.anInt4667--;
			}
			if (Static385.anInt6297 > 1) {
				Static161.anInt2989 = Static79.anInt1568;
				Static385.anInt6297--;
			}
			if (!Static339.aBoolean390) {
				Static89.method1407();
			}
			for (local31 = 0; local31 < 100 && Static279.method3689(); local31++) {
			}
		}
		Static298.anInt4895++;
		Static252.method3319(-1, null, -1);
		Static199.method2853(-1, -1, null);
		Static164.method2300();
		Static79.anInt1568++;
		for (local31 = 0; local31 < 32768; local31++) {
			@Pc(74) Class8_Sub3_Sub1_Sub2 local74 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local31];
			if (local74 != null) {
				@Pc(80) byte local80 = local74.aClass78_1.aByte34;
				if ((local80 & 0x1) != 0) {
					@Pc(88) int local88 = local74.method5894();
					@Pc(112) int local112;
					if ((local80 & 0x2) != 0 && local74.anInt7427 == 0 && Math.random() * 1000.0D < 10.0D) {
						local112 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(120) int local120 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local112 != 0 || local120 != 0) {
							@Pc(137) int local137 = local112 + local74.anIntArray560[0];
							@Pc(145) int local145 = local74.anIntArray559[0] + local120;
							if (local137 < 0) {
								local137 = 0;
							} else if (local137 > Static337.anInt5497 - local88 - 1) {
								local137 = Static337.anInt5497 - local88 - 1;
							}
							if (local145 < 0) {
								local145 = 0;
							} else if (local145 > Static282.anInt4644 - local88 - 1) {
								local145 = Static282.anInt4644 - local88 - 1;
							}
							@Pc(218) int local218 = Static79.method1278(Static240.anIntArray339, local74.anIntArray559[0], -1, 0, local88, local88, Static409.aClass128Array1[local74.aByte99], local88, true, local145, local74.anIntArray560[0], local137, Static388.anIntArray502, 0);
							if (local218 > 0) {
								if (local218 > 9) {
									local218 = 9;
								}
								for (@Pc(229) int local229 = 0; local229 < local218; local229++) {
									local74.anIntArray560[local229] = Static388.anIntArray502[local218 - local229 - 1];
									local74.anIntArray559[local229] = Static240.anIntArray339[local218 - local229 - 1];
									local74.aByteArray88[local229] = 1;
								}
								local74.anInt7427 = local218;
							}
						}
					}
					Static84.method4132(true, local74);
					local112 = Static231.method3152(local74);
					Static261.method3392(local74, local112, Static325.anInt5266, Static206.anInt4094);
					Static214.method2938(local74);
				}
			}
		}
		if (Static166.anInt3041 == 0 && Static254.anInt4212 == 0) {
			if (Static97.anInt1791 == 2) {
				Static427.method2167();
			} else {
				Static141.method1991();
			}
			if (Static235.anInt4004 >> 7 < 14 || Static235.anInt4004 >> 7 >= Static337.anInt5497 - 14 || Static393.anInt7135 >> 7 < 14 || Static282.anInt4644 - 14 <= Static393.anInt7135 >> 7) {
				Static255.method3372();
			}
		}
		while (true) {
			@Pc(349) Class4_Sub34 local349;
			@Pc(354) Class110 local354;
			@Pc(362) Class110 local362;
			do {
				local349 = (Class4_Sub34) Static301.aClass244_28.method5268();
				if (local349 == null) {
					while (true) {
						do {
							local349 = (Class4_Sub34) Static6.aClass244_1.method5268();
							if (local349 == null) {
								while (true) {
									do {
										local349 = (Class4_Sub34) Static302.aClass244_29.method5268();
										if (local349 == null) {
											if (Static11.aClass110_1 != null) {
												Static388.method5131();
											}
											if (Static265.anInt4371 % 1500 == 0) {
												Static222.method3020();
											}
											if (Static8.anInt119 == 6 && Static166.anInt3041 == 0) {
												Static260.method6058();
											}
											Static329.method4329();
											if (Static247.aBoolean303 && Static266.method3498() - 60000L > Static398.aLong191) {
												Static125.method1758();
											}
											if (Static8.anInt119 == 6 && Static166.anInt3041 == 0) {
												if (Static338.aClass152_4 == null) {
													Static33.method450(false);
													return;
												}
												Static351.anInt5837++;
												if (Static351.anInt5837 > 50) {
													Static448.method5935(Static278.aClass146_62);
												}
												try {
													if (Static338.aClass152_4 != null && Static247.aClass4_Sub9_Sub2_2.anInt6207 > 0) {
														Static212.anInt3691 += Static247.aClass4_Sub9_Sub2_2.anInt6207;
														Static338.aClass152_4.method2926(Static247.aClass4_Sub9_Sub2_2.anInt6207, Static247.aClass4_Sub9_Sub2_2.aByteArray81);
														Static351.anInt5837 = 0;
														Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
														return;
													}
												} catch (@Pc(581) IOException local581) {
													Static33.method450(false);
													return;
												}
											}
											return;
										}
										local354 = local349.aClass110_14;
										if (local354.anInt2585 < 0) {
											break;
										}
										local362 = Static235.method3185(local354.anInt2649);
									} while (local362 == null || local362.aClass110Array1 == null || local362.aClass110Array1.length <= local354.anInt2585 || local362.aClass110Array1[local354.anInt2585] != local354);
									Static80.method1289(local349);
								}
							}
							local354 = local349.aClass110_14;
							if (local354.anInt2585 < 0) {
								break;
							}
							local362 = Static235.method3185(local354.anInt2649);
						} while (local362 == null || local362.aClass110Array1 == null || local362.aClass110Array1.length <= local354.anInt2585 || local362.aClass110Array1[local354.anInt2585] != local354);
						Static80.method1289(local349);
					}
				}
				local354 = local349.aClass110_14;
				if (local354.anInt2585 < 0) {
					break;
				}
				local362 = Static235.method3185(local354.anInt2649);
			} while (local362 == null || local362.aClass110Array1 == null || local362.aClass110Array1.length <= local354.anInt2585 || local362.aClass110Array1[local354.anInt2585] != local354);
			Static80.method1289(local349);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method768() {
		if (Static8.anInt119 == 13) {
			return;
		}
		@Pc(16) long local16 = Static243.method3230() / 1000000L - Static166.aLong83;
		Static166.aLong83 = Static243.method3230() / 1000000L;
		@Pc(24) boolean local24 = Static98.method1494();
		if (local24 && Static26.aBoolean37 && Static226.aClass53_1 != null) {
			Static226.aClass53_1.method5632();
		}
		if (Static315.method4081(Static8.anInt119)) {
			if (Static191.aLong96 != 0L && Static266.method3498() > Static191.aLong96) {
				Static265.method3497(false, Static413.aClass49_Sub1_1.anInt3212, Static413.aClass49_Sub1_1.anInt3211, Static37.method500());
			} else if (!Static39.aClass135_1.method5392() && Static71.aBoolean510) {
				Static398.method4982();
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		if (Static276.aFrame5 == null) {
			@Pc(73) Container local73;
			if (Static43.aFrame4 == null) {
				local73 = Static24.aClass196_1.anApplet1;
			} else {
				local73 = Static43.aFrame4;
			}
			local81 = local73.getSize().width;
			local85 = local73.getSize().height;
			if (local73 == Static43.aFrame4) {
				@Pc(91) Insets local91 = Static43.aFrame4.getInsets();
				local85 -= local91.bottom + local91.top;
				local81 -= local91.left + local91.right;
			}
			if (local81 != Static298.anInt4896 || Static75.anInt1525 != local85) {
				if (Static39.aClass135_1 == null || Static39.aClass135_1.method5375()) {
					Static283.method3705();
				} else {
					Static298.anInt4896 = local81;
					Static75.anInt1525 = local85;
				}
				Static191.aLong96 = Static266.method3498() + 500L;
			}
		}
		if (Static276.aFrame5 != null && !Static252.aBoolean308 && Static315.method4081(Static8.anInt119)) {
			Static265.method3497(false, -1, -1, Static413.aClass49_Sub1_1.anInt3207);
		}
		@Pc(156) boolean local156 = false;
		if (Static169.aBoolean226) {
			local156 = true;
			Static169.aBoolean226 = false;
		}
		if (local156) {
			Static79.method1276();
		}
		if (Static39.aClass135_1 != null && Static39.aClass135_1.method5392() || Static37.method500() != 1) {
			Static194.method5772();
		}
		if (Static8.anInt119 == 0) {
			Static304.method3976(Static2.aColorArray1[Static268.anInt4436], Static90.anInt1726, local156, Static428.aColorArray3[Static268.anInt4436], Static338.aColorArray2[Static268.anInt4436], Static166.aString26);
		} else if (Static8.anInt119 == 1) {
			Static146.method2052(local156 | Static39.aClass135_1.method5392(), Static49.aClass123_1, Static428.aColorArray3[Static268.anInt4436].getRGB(), Static338.aColorArray2[Static268.anInt4436].getRGB(), Static2.aColorArray1[Static268.anInt4436].getRGB(), Static39.aClass135_1);
		} else if (Static8.anInt119 == 2) {
			Static302.method3943();
		} else if (Static8.anInt119 == 6) {
			Static302.method3943();
		} else if (Static229.method3102(Static8.anInt119)) {
			if (Static84.anInt5160 == 1) {
				if (Static375.anInt6137 > Static445.anInt7463) {
					Static445.anInt7463 = Static375.anInt6137;
				}
				local81 = (Static445.anInt7463 - Static375.anInt6137) * 50 / Static445.anInt7463;
				Static94.method4424(Static283.aClass123_6, Static243.aClass15_65.method180(Static429.anInt6999) + "<br>(" + local81 + "%)", true);
			} else if (Static84.anInt5160 == 2) {
				if (Static246.anInt4084 < Static294.anInt4838) {
					Static246.anInt4084 = Static294.anInt4838;
				}
				local81 = (Static246.anInt4084 - Static294.anInt4838) * 50 / Static246.anInt4084 + 50;
				Static94.method4424(Static283.aClass123_6, Static243.aClass15_65.method180(Static429.anInt6999) + "<br>(" + local81 + "%)", true);
			} else {
				Static94.method4424(Static283.aClass123_6, Static243.aClass15_65.method180(Static429.anInt6999), true);
			}
		} else if (Static8.anInt119 == 9) {
			Static412.method5611(local16);
		} else if (Static8.anInt119 == 12) {
			Static94.method4424(Static283.aClass123_6, Static375.aClass15_112.method180(Static429.anInt6999) + "<br>" + Static79.aClass15_26.method180(Static429.anInt6999), true);
		}
		if (Static271.anInt4516 == 3) {
			for (local81 = 0; local81 < Static177.anInt3224; local81++) {
				@Pc(395) Rectangle local395 = Class4_Sub9.aRectangleArray3[local81];
				if (Static154.aBooleanArray15[local81]) {
					Static39.aClass135_1.method5394(local395.width, local395.x, local395.height, local395.y, -1996553985);
				} else if (Static324.aBooleanArray26[local81]) {
					Static39.aClass135_1.method5394(local395.width, local395.x, local395.height, local395.y, -1996554240);
				}
			}
		}
		if (Static223.method3022()) {
			Static235.method3184(Static39.aClass135_1);
		}
		if (Static315.method4081(Static8.anInt119) && Static271.anInt4516 == 0 && Static37.method500() == 1 && !local156 && Static300.aString51.equals("1.1")) {
			local81 = 0;
			for (local85 = 0; local85 < Static177.anInt3224; local85++) {
				if (Static324.aBooleanArray26[local85]) {
					Static324.aBooleanArray26[local85] = false;
					Static417.aRectangleArray4[local81++] = Class4_Sub9.aRectangleArray3[local85];
				}
			}
			Static39.aClass135_1.method5365(Static417.aRectangleArray4, local81);
		} else if (Static8.anInt119 != 0) {
			Static39.aClass135_1.method5341();
			for (local81 = 0; local81 < Static177.anInt3224; local81++) {
				Static324.aBooleanArray26[local81] = false;
			}
		}
		if (Static413.aClass49_Sub1_1.anInt3216 == 0) {
			Static435.method5777(15L);
		} else if (Static413.aClass49_Sub1_1.anInt3216 == 1) {
			Static435.method5777(10L);
		} else if (Static413.aClass49_Sub1_1.anInt3216 == 2) {
			Static435.method5777(5L);
		} else if (Static413.aClass49_Sub1_1.anInt3216 == 3) {
			Static435.method5777(2L);
		}
		if (Static401.aBoolean452) {
			Static151.method2115();
		}
		if (Static413.aClass49_Sub1_1.aBoolean239 && Static8.anInt119 == 2 && Static182.anInt3346 != -1) {
			Static413.aClass49_Sub1_1.aBoolean239 = false;
			Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
		}
	}
}
