import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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
			if (arg0.length != 4) {
				Static170.method2694("argument count");
			}
			Static183.anInt3652 = Integer.parseInt(arg0[0]);
			Static74.anInt1511 = 2;
			if (arg0[1].equals("live")) {
				Static29.anInt630 = 0;
			} else if (arg0[1].equals("rc")) {
				Static29.anInt630 = 1;
			} else if (arg0[1].equals("wip")) {
				Static29.anInt630 = 2;
			} else {
				Static170.method2694("modewhat");
			}
			Static230.aBoolean290 = false;
			Static187.anInt3840 = Static149.method2344(arg0[2]);
			if (Static187.anInt3840 == -1) {
				if (arg0[2].equals("english")) {
					Static187.anInt3840 = 0;
				} else if (arg0[2].equals("german")) {
					Static187.anInt3840 = 1;
				} else {
					Static170.method2694("language");
				}
			}
			Static208.method3284(Static187.anInt3840);
			Static102.aBoolean118 = false;
			Static76.aBoolean90 = false;
			if (arg0[3].equals("game0")) {
				Static122.anInt2465 = 0;
			} else if (arg0[3].equals("game1")) {
				Static122.anInt2465 = 1;
			} else {
				Static170.method2694("game");
			}
			Static10.anInt248 = 0;
			Static147.aString99 = "";
			Static212.anInt4120 = 0;
			Static13.aBoolean23 = false;
			@Pc(130) client local130 = new client();
			Static191.aClient1 = local130;
			local130.method781(Static29.anInt630 + 32, Static122.anInt2465 == 1 ? "mechscape" : "runescape");
			Static32.aFrame1.setLocation(40, 40);
		} catch (@Pc(157) Exception local157) {
			Static204.method3269(local157, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method776() {
		if (Static251.aBoolean330) {
			Static251.method3875();
		}
		if (Static250.aFrame2 != null) {
			Static157.method261(Static95.aClass184_3, Static250.aFrame2);
			Static250.aFrame2 = null;
		}
		if (Static88.aClass30_1 != null) {
			Static88.aClass30_1.aBoolean64 = false;
		}
		Static88.aClass30_1 = null;
		if (Static261.aClass91_3 != null) {
			Static261.aClass91_3.method2302();
			Static261.aClass91_3 = null;
		}
		Static295.method4587(Static139.aCanvas1);
		Static93.method2553(Static139.aCanvas1);
		if (Static42.aClass47_1 != null) {
			Static42.aClass47_1.method1208(Static139.aCanvas1);
		}
		Static144.method2298();
		Static212.method3324();
		Static42.aClass47_1 = null;
		if (Static100.aClass112_44 != null) {
			Static100.aClass112_44.method4463();
		}
		if (Static260.aClass112_115 != null) {
			Static260.aClass112_115.method4463();
		}
		Static82.aClass70_2.method1830();
		Static284.aClass82_3.method2055();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method783(@OriginalArg(1) byte[] arg0) {
		@Pc(11) Class4_Sub24 local11 = new Class4_Sub24(arg0);
		while (true) {
			@Pc(15) int local15 = local11.method3110();
			if (local15 == 0) {
				return;
			}
			if (local15 == 1) {
				@Pc(31) int[] local31 = Static52.anIntArray122 = new int[6];
				local31[0] = local11.method3085();
				local31[1] = local11.method3085();
				local31[2] = local11.method3085();
				local31[3] = local11.method3085();
				local31[4] = local11.method3085();
				local31[5] = local11.method3085();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method784() {
		if (Static82.aClass70_2.anInt2165 > Static184.anInt3666) {
			Static173.anInt3482 = (Static82.aClass70_2.anInt2165 - 1) * 250;
			if (Static173.anInt3482 > 3000) {
				Static173.anInt3482 = 3000;
			}
			if (Static17.anInt387 == Static140.anInt2772) {
				Static140.anInt2772 = Static9.anInt185;
			} else {
				Static140.anInt2772 = Static17.anInt387;
			}
			if (Static82.aClass70_2.anInt2165 >= 2 && Static82.aClass70_2.anInt2166 == 6) {
				this.method769("js5connect_outofdate");
				Static204.anInt4047 = 1000;
				return;
			}
			if (Static82.aClass70_2.anInt2165 >= 4 && Static82.aClass70_2.anInt2166 == -1) {
				this.method769("js5crc");
				Static204.anInt4047 = 1000;
				return;
			}
			if (Static82.aClass70_2.anInt2165 >= 4 && (Static204.anInt4047 == 0 || Static204.anInt4047 == 5)) {
				if (Static82.aClass70_2.anInt2166 == 7 || Static82.aClass70_2.anInt2166 == 9) {
					this.method769("js5connect_full");
				} else if (Static82.aClass70_2.anInt2166 > 0) {
					this.method769("js5connect");
				} else {
					this.method769("js5io");
				}
				Static204.anInt4047 = 1000;
				return;
			}
		}
		Static184.anInt3666 = Static82.aClass70_2.anInt2165;
		if (Static173.anInt3482 > 0) {
			Static173.anInt3482--;
			return;
		}
		try {
			if (Static144.anInt2860 == 0) {
				Static277.aClass119_8 = Static95.aClass184_3.method4611(Static140.anInt2772, Static253.aString168);
				Static144.anInt2860++;
			}
			if (Static144.anInt2860 == 1) {
				if (Static277.aClass119_8.anInt3695 == 2) {
					this.method788(1000);
					return;
				}
				if (Static277.aClass119_8.anInt3695 == 1) {
					Static144.anInt2860++;
				}
			}
			if (Static144.anInt2860 == 2) {
				Static276.aClass91_4 = new Class91((Socket) Static277.aClass119_8.anObject4, Static95.aClass184_3);
				@Pc(201) Class4_Sub24 local201 = new Class4_Sub24(5);
				local201.method3116(15);
				local201.method3066(546);
				Static276.aClass91_4.method2303(5, local201.aByteArray47);
				Static144.anInt2860++;
				Static154.aLong116 = Static61.method1150();
			}
			if (Static144.anInt2860 == 3) {
				if (Static204.anInt4047 == 0 || Static204.anInt4047 == 5 || Static276.aClass91_4.method2300() > 0) {
					@Pc(260) int local260 = Static276.aClass91_4.method2305();
					if (local260 != 0) {
						this.method788(local260);
						return;
					}
					Static144.anInt2860++;
				} else if (Static61.method1150() - Static154.aLong116 > 30000L) {
					this.method788(1001);
					return;
				}
			}
			if (Static144.anInt2860 == 4) {
				@Pc(295) boolean local295 = Static204.anInt4047 == 5 || Static204.anInt4047 == 10 || Static204.anInt4047 == 28;
				Static82.aClass70_2.method1845(Static276.aClass91_4, !local295);
				Static276.aClass91_4 = null;
				Static277.aClass119_8 = null;
				Static144.anInt2860 = 0;
			}
		} catch (@Pc(314) IOException local314) {
			this.method788(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method785() {
		for (Static298.anInt5328 = 0; Static247.method3793() && Static298.anInt5328 < 128; Static298.anInt5328++) {
			Static93.anIntArray267[Static298.anInt5328] = Static89.anInt1799;
			Static178.anIntArray300[Static298.anInt5328] = Static254.aChar4;
		}
		Static309.anInt1336++;
		if (Static56.anInt1264 != -1) {
			Static286.method4476(0, 0, 0, Static292.anInt5674, 0, Static189.anInt5672, Static56.anInt1264);
		}
		Static131.anInt1441++;
		if (Static251.aBoolean330) {
			label199: for (@Pc(59) int local59 = 0; local59 < 32768; local59++) {
				@Pc(68) Class13_Sub5_Sub2 local68 = Static260.aClass13_Sub5_Sub2Array114[local59];
				if (local68 != null) {
					@Pc(75) byte local75 = local68.aClass185_1.aByte23;
					if ((local75 & 0x2) > 0 && local68.anInt5271 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(103) int local103 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(111) int local111 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local103 != 0 || local111 != 0) {
							local68.anIntArray411[0] = local103 + (local68.anInt5334 >> 7);
							local68.aByteArray61[0] = 1;
							local68.anIntArray418[0] = local111 + (local68.anInt5294 >> 7);
							Static223.aClass12Array1[Static222.anInt4467].method278(false, local68.method4219(), local68.method4219(), false, local68.anInt5334 >> 7, local68.anInt5294 >> 7, 0);
							if (local68.anIntArray411[0] >= 0 && local68.anIntArray411[0] <= 104 - local68.method4219() && local68.anIntArray418[0] >= 0 && local68.anIntArray418[0] <= 104 - local68.method4219() && Static223.aClass12Array1[Static222.anInt4467].method266(local68.anInt5334 >> 7, local68.anInt5294 >> 7, local68.anIntArray418[0], local68.anIntArray411[0])) {
								if (local68.method4219() > 1) {
									for (@Pc(241) int local241 = local68.anIntArray411[0]; local241 < local68.anIntArray411[0] + local68.method4219(); local241++) {
										for (@Pc(256) int local256 = local68.anIntArray418[0]; local68.anIntArray418[0] + local68.method4219() > local256; local256++) {
											if ((Static223.aClass12Array1[Static222.anInt4467].anIntArrayArray1[local241][local256] & 0x2401FF) != 0) {
												continue label199;
											}
										}
									}
								}
								local68.anInt5271 = 1;
							}
						}
					}
					Static299.method4598(local68);
					Static104.method1785(local68);
					Static233.method3637(local68);
					Static223.aClass12Array1[Static222.anInt4467].method274(local68.method4219(), local68.method4219(), local68.anInt5294 >> 7, local68.anInt5334 >> 7, false, false);
				}
			}
		}
		if (!Static251.aBoolean330 && Static122.anInt2465 == 0) {
			Static197.method3209();
		} else if (Static141.anInt2799 == 0 && Static228.anInt4576 == 0) {
			if (Static99.anInt1946 == 2) {
				Static97.method3591();
			} else {
				Static282.method4404();
			}
			if (Static71.anInt1457 >> 7 < 14 || Static71.anInt1457 >> 7 >= 90 || Static248.anInt4865 >> 7 < 14 || Static248.anInt4865 >> 7 >= 90) {
				Static14.method264();
			}
		}
		while (true) {
			@Pc(395) Class4_Sub23 local395;
			@Pc(403) Class97 local403;
			@Pc(415) Class97 local415;
			do {
				local395 = (Class4_Sub23) Static25.aClass17_3.method617();
				if (local395 == null) {
					while (true) {
						do {
							local395 = (Class4_Sub23) Static92.aClass17_13.method617();
							if (local395 == null) {
								while (true) {
									do {
										local395 = (Class4_Sub23) Static56.aClass17_6.method617();
										if (local395 == null) {
											if (Static186.aClass97_17 != null) {
												Static159.method2565();
											}
											if (Static226.aClass119_7 != null && Static226.aClass119_7.anInt3695 == 1) {
												if (Static226.aClass119_7.anObject4 != null) {
													Static181.method4698(Static81.aBoolean99, Static243.aString160);
												}
												Static81.aBoolean99 = false;
												Static226.aClass119_7 = null;
												Static243.aString160 = null;
											}
											if (Static50.anInt1118 % 1500 == 0) {
												Static301.method4629();
											}
											return;
										}
										local403 = local395.aClass97_15;
										if (local403.anInt3146 < 0) {
											break;
										}
										local415 = Static148.method2340(local403.anInt3165);
									} while (local415 == null || local415.aClass97Array1 == null || local403.anInt3146 >= local415.aClass97Array1.length || local403 != local415.aClass97Array1[local403.anInt3146]);
									Static145.method4497(local395);
								}
							}
							local403 = local395.aClass97_15;
							if (local403.anInt3146 < 0) {
								break;
							}
							local415 = Static148.method2340(local403.anInt3165);
						} while (local415 == null || local415.aClass97Array1 == null || local415.aClass97Array1.length <= local403.anInt3146 || local415.aClass97Array1[local403.anInt3146] != local403);
						Static145.method4497(local395);
					}
				}
				local403 = local395.aClass97_15;
				if (local403.anInt3146 < 0) {
					break;
				}
				local415 = Static148.method2340(local403.anInt3165);
			} while (local415 == null || local415.aClass97Array1 == null || local415.aClass97Array1.length <= local403.anInt3146 || local415.aClass97Array1[local403.anInt3146] != local403);
			Static145.method4497(local395);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method775() {
		Static19.method426();
		Static284.aClass82_3 = new Class82();
		Static82.aClass70_2 = new Class70();
		if (Static29.anInt630 != 0) {
			Static65.aByteArrayArray16 = new byte[50][];
		}
		Static268.method4233(Static95.aClass184_3);
		if (Static74.anInt1511 == 0) {
			Static68.aString68 = this.getCodeBase().getHost();
			Static254.anInt4972 = 43594;
			Static43.anInt869 = 443;
		} else if (Static74.anInt1511 == 1) {
			Static68.aString68 = this.getCodeBase().getHost();
			Static43.anInt869 = Static183.anInt3652 + 50000;
			Static254.anInt4972 = Static183.anInt3652 + 40000;
		} else if (Static74.anInt1511 == 2) {
			Static68.aString68 = "127.0.0.1";
			Static254.anInt4972 = Static183.anInt3652 + 40000;
			Static43.anInt869 = Static183.anInt3652 + 50000;
		}
		Static9.anInt185 = Static43.anInt869;
		Static226.aShortArray75 = Static102.aShortArray35 = Static58.aShortArray45 = Static38.aShortArray16 = new short[256];
		if (Static300.anInt5735 == 3 && Static74.anInt1511 != 2) {
			Static250.anInt4906 = Static183.anInt3652;
		}
		if (Static122.anInt2465 == 1) {
			Static168.aBoolean217 = true;
			Static56.aShortArrayArray1 = Static144.aShortArrayArray5;
			Static35.aShortArray2 = Static21.aShortArray10;
			Static264.aShortArrayArray6 = Static139.aShortArrayArray4;
			Static290.anInt5645 = 16777215;
			Static290.anInt5641 = 0;
			Static286.aShortArray93 = Static243.aShortArray80;
		} else {
			Static264.aShortArrayArray6 = Static293.aShortArrayArray8;
			Static35.aShortArray2 = Static34.aShortArray95;
			Static56.aShortArrayArray1 = Static266.aShortArrayArray7;
			Static286.aShortArray93 = Static51.aShortArray21;
		}
		Static253.aString168 = Static68.aString68;
		Static109.anInt2179 = Static254.anInt4972;
		Static140.anInt2772 = Static109.anInt2179;
		Static17.anInt387 = Static254.anInt4972;
		Static250.method3844();
		Static7.method116(Static139.aCanvas1);
		Static29.method608(Static139.aCanvas1);
		Static42.aClass47_1 = Static150.method2372();
		if (Static42.aClass47_1 != null) {
			Static42.aClass47_1.method1212(Static139.aCanvas1);
		}
		Static29.anInt627 = Static300.anInt5735;
		try {
			if (Static95.aClass184_3.aClass68_2 != null) {
				Static246.aClass31_5 = new Class31(Static95.aClass184_3.aClass68_2, 5200, 0);
				for (@Pc(167) int local167 = 0; local167 < 29; local167++) {
					Static9.aClass31Array1[local167] = new Class31(Static95.aClass184_3.aClass68Array1[local167], 6000, 0);
				}
				Static132.aClass31_3 = new Class31(Static95.aClass184_3.aClass68_4, 6000, 0);
				Static211.aClass55_5 = new Class55(255, Static246.aClass31_5, Static132.aClass31_3, 500000);
				Static202.aClass31_4 = new Class31(Static95.aClass184_3.aClass68_3, 24, 0);
				Static95.aClass184_3.aClass68_2 = null;
				Static95.aClass184_3.aClass68Array1 = null;
				Static95.aClass184_3.aClass68_4 = null;
				Static95.aClass184_3.aClass68_3 = null;
			}
		} catch (@Pc(223) IOException local223) {
			Static211.aClass55_5 = null;
			Static246.aClass31_5 = null;
			Static132.aClass31_3 = null;
			Static202.aClass31_4 = null;
		}
		if (Static74.anInt1511 != 0) {
			Static262.aBoolean344 = true;
		}
		if (Static122.anInt2465 == 0) {
			Static257.aString171 = Static88.aString69;
		} else if (Static122.anInt2465 == 1) {
			Static257.aString171 = Static13.aString12;
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method773()) {
			return;
		}
		Static183.anInt3652 = Integer.parseInt(this.getParameter("worldid"));
		Static74.anInt1511 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static74.anInt1511 < 0 || Static74.anInt1511 > 1) {
			Static74.anInt1511 = 0;
		}
		Static29.anInt630 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static29.anInt630 < 0 || Static29.anInt630 > 2) {
			Static29.anInt630 = 0;
		}
		@Pc(50) String local50 = this.getParameter("advertsuppressed");
		if (local50 != null && local50.equals("1")) {
			Static230.aBoolean290 = true;
		} else {
			Static230.aBoolean290 = false;
		}
		try {
			Static187.anInt3840 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(69) Exception local69) {
			Static187.anInt3840 = 0;
		}
		Static208.method3284(Static187.anInt3840);
		@Pc(78) String local78 = this.getParameter("objecttag");
		if (local78 != null && local78.equals("1")) {
			Static102.aBoolean118 = true;
		} else {
			Static102.aBoolean118 = false;
		}
		@Pc(94) String local94 = this.getParameter("js");
		if (local94 != null && local94.equals("1")) {
			Static76.aBoolean90 = true;
		} else {
			Static76.aBoolean90 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static122.anInt2465 = 1;
		} else {
			Static122.anInt2465 = 0;
		}
		try {
			Static212.anInt4120 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(130) Exception local130) {
			Static212.anInt4120 = 0;
		}
		Static147.aString99 = this.getParameter("settings");
		if (Static147.aString99 == null) {
			Static147.aString99 = "";
		}
		@Pc(146) String local146 = this.getParameter("country");
		if (local146 != null) {
			try {
				Static10.anInt248 = Integer.parseInt(local146);
			} catch (@Pc(155) Exception local155) {
				Static10.anInt248 = 0;
			}
		}
		@Pc(161) String local161 = this.getParameter("haveie6");
		if (local161 != null && local161.equals("1")) {
			Static13.aBoolean23 = true;
		} else {
			Static13.aBoolean23 = false;
		}
		Static191.aClient1 = this;
		this.method767(Static29.anInt630 + 32);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method787() {
		if (!Static209.aBoolean250) {
			label262: while (true) {
				do {
					if (!Static247.method3793()) {
						break label262;
					}
				} while (Static254.aChar4 != 's' && Static254.aChar4 != 'S');
				Static209.aBoolean250 = true;
			}
		}
		@Pc(38) int local38;
		if (Static210.anInt4109 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(41) long local41 = Static61.method1150();
			if (Static138.aLong104 == 0L) {
				Static138.aLong104 = local41;
			}
			if (local38 > 16384 && local41 - Static138.aLong104 < 5000L) {
				if (local41 - Static250.aLong171 > 1000L) {
					System.gc();
					Static250.aLong171 = local41;
				}
				Static65.anInt5707 = 5;
				Static190.aString134 = Static55.aString42;
			} else {
				Static210.anInt4109 = 10;
				Static65.anInt5707 = 5;
				Static190.aString134 = Static92.aString71;
			}
			return;
		}
		@Pc(91) int local91;
		if (Static210.anInt4109 == 10) {
			for (local91 = 0; local91 < 4; local91++) {
				Static223.aClass12Array1[local91] = new Class12(104, 104);
			}
			Static210.anInt4109 = 30;
			Static65.anInt5707 = 10;
			Static190.aString134 = Static276.aString181;
		} else if (Static210.anInt4109 == 30) {
			if (Static267.aClass52_1 == null) {
				Static267.aClass52_1 = new Class52(Static82.aClass70_2, Static284.aClass82_3);
			}
			if (Static267.aClass52_1.method1398()) {
				Static75.aClass22_29 = Static177.method2913(0, false, true, true);
				Static101.aClass22_33 = Static177.method2913(1, false, true, true);
				Static278.aClass22_96 = Static177.method2913(2, true, true, false);
				Static182.aClass22_64 = Static177.method2913(3, false, true, true);
				Static137.aClass22_47 = Static177.method2913(4, false, true, true);
				Static296.aClass22_105 = Static177.method2913(5, true, true, true);
				Static145.aClass22_101 = Static177.method2913(6, true, false, true);
				Static80.aClass22_31 = Static177.method2913(7, false, true, true);
				Static60.aClass22_26 = Static177.method2913(8, false, true, true);
				Static192.aClass22_20 = Static177.method2913(9, false, true, true);
				Static155.aClass22_57 = Static177.method2913(10, false, true, true);
				Static140.aClass22_48 = Static177.method2913(11, false, true, true);
				Static269.aClass22_95 = Static177.method2913(12, false, true, true);
				Static292.aClass22_102 = Static177.method2913(13, false, true, true);
				Static191.aClass22_67 = Static177.method2913(14, false, false, true);
				Static218.aClass22_75 = Static177.method2913(15, false, true, true);
				Static200.aClass22_70 = Static177.method2913(16, false, true, true);
				Static198.aClass22_69 = Static177.method2913(17, false, true, true);
				Static65.aClass22_104 = Static177.method2913(18, false, true, true);
				Static213.aClass22_71 = Static177.method2913(19, false, true, true);
				Static127.aClass22_42 = Static177.method2913(20, false, true, true);
				Static175.aClass22_63 = Static177.method2913(21, false, true, true);
				Static245.aClass22_84 = Static177.method2913(22, false, true, true);
				Static52.aClass22_25 = Static177.method2913(23, true, true, true);
				Static5.aClass22_2 = Static177.method2913(24, false, true, true);
				Static13.aClass22_6 = Static177.method2913(25, false, true, true);
				Static160.aClass22_58 = Static177.method2913(26, true, true, true);
				Static86.aClass22_32 = Static177.method2913(27, false, true, true);
				Static256.aClass22_86 = Static177.method2913(28, true, true, true);
				Static65.anInt5707 = 15;
				Static190.aString134 = Static111.aString81;
				Static210.anInt4109 = 40;
			} else {
				Static190.aString134 = Static84.aString66;
				Static65.anInt5707 = 12;
			}
		} else if (Static210.anInt4109 == 40) {
			local91 = 0;
			for (local38 = 0; local38 < 29; local38++) {
				local91 += Static45.aClass39_Sub1Array1[local38].method1147() * Static102.anIntArray168[local38] / 100;
			}
			if (local91 == 100) {
				Static190.aString134 = Static63.aString48;
				Static65.anInt5707 = 20;
				Static52.method1024(Static60.aClass22_26);
				Static110.method1857(Static60.aClass22_26);
				Static23.method527(Static60.aClass22_26);
				Static210.anInt4109 = 41;
			} else {
				if (local91 != 0) {
					Static190.aString134 = Static131.aString53 + local91 + "%";
				}
				Static65.anInt5707 = 20;
			}
		} else if (Static210.anInt4109 == 41) {
			if (Static256.aClass22_86.method682()) {
				this.method783(Static256.aClass22_86.method683(1));
				Static65.anInt5707 = 25;
				Static190.aString134 = Static52.aString41;
				Static210.anInt4109 = 45;
			} else {
				Static190.aString134 = Static20.aString98 + Static256.aClass22_86.method664() + "%";
				Static65.anInt5707 = 25;
			}
		} else if (Static210.anInt4109 == 45) {
			Static82.method1397(Static159.aBoolean209);
			Static292.aClass4_Sub6_Sub2_3 = new Class4_Sub6_Sub2();
			Static292.aClass4_Sub6_Sub2_3.method827();
			Static100.aClass112_44 = Static144.method2299(0, Static139.aCanvas1, 22050, Static95.aClass184_3);
			Static100.aClass112_44.method4455(Static292.aClass4_Sub6_Sub2_3);
			Static161.method2601(Static218.aClass22_75, Static292.aClass4_Sub6_Sub2_3, Static137.aClass22_47, Static191.aClass22_67);
			Static260.aClass112_115 = Static144.method2299(1, Static139.aCanvas1, 2048, Static95.aClass184_3);
			Static10.aClass4_Sub6_Sub4_1 = new Class4_Sub6_Sub4();
			Static260.aClass112_115.method4455(Static10.aClass4_Sub6_Sub4_1);
			Static93.aClass16_2 = new Class16(22050, Static75.anInt1523);
			Static186.anInt3694 = Static145.aClass22_101.method661("scape main");
			Static190.aString134 = Static55.aString43;
			Static65.anInt5707 = 30;
			Static210.anInt4109 = 50;
		} else if (Static210.anInt4109 == 50) {
			local91 = Static53.method1025(Static292.aClass22_102, Static60.aClass22_26);
			local38 = Static120.method2502();
			if (local38 <= local91) {
				Static65.anInt5707 = 35;
				Static190.aString134 = Static265.aString175;
				Static210.anInt4109 = 60;
			} else {
				Static65.anInt5707 = 35;
				Static190.aString134 = Static169.aString119 + local91 * 100 / local38 + "%";
			}
		} else if (Static210.anInt4109 == 60) {
			local91 = Static2.method10(Static60.aClass22_26);
			local38 = Static170.method2695();
			if (local38 <= local91) {
				Static190.aString134 = Static200.aString138;
				Static65.anInt5707 = 40;
				Static210.anInt4109 = 65;
			} else {
				Static190.aString134 = Static184.aString127 + local91 * 100 / local38 + "%";
				Static65.anInt5707 = 40;
			}
		} else if (Static210.anInt4109 == 65) {
			Static123.method2038(Static60.aClass22_26, Static292.aClass22_102);
			Static190.aString134 = Static72.aString57;
			Static65.anInt5707 = 45;
			Static123.method2035(5);
			Static210.anInt4109 = 70;
		} else if (Static210.anInt4109 == 70) {
			Static278.aClass22_96.method682();
			local91 = Static278.aClass22_96.method664();
			Static200.aClass22_70.method682();
			local91 += Static200.aClass22_70.method664();
			Static198.aClass22_69.method682();
			local91 += Static198.aClass22_69.method664();
			Static65.aClass22_104.method682();
			local91 += Static65.aClass22_104.method664();
			Static213.aClass22_71.method682();
			local91 += Static213.aClass22_71.method664();
			Static127.aClass22_42.method682();
			local91 += Static127.aClass22_42.method664();
			Static175.aClass22_63.method682();
			local91 += Static175.aClass22_63.method664();
			Static245.aClass22_84.method682();
			local91 += Static245.aClass22_84.method664();
			Static5.aClass22_2.method682();
			local91 += Static5.aClass22_2.method664();
			Static13.aClass22_6.method682();
			local91 += Static13.aClass22_6.method664();
			Static86.aClass22_32.method682();
			local91 += Static86.aClass22_32.method664();
			if (local91 >= 1100) {
				Static256.method3967(Static278.aClass22_96);
				Static127.method2073(Static278.aClass22_96);
				Static225.method3548(Static278.aClass22_96);
				Static193.method3168(Static80.aClass22_31, Static278.aClass22_96);
				Static287.method4480(Static80.aClass22_31, Static200.aClass22_70);
				Static248.method3800(Static80.aClass22_31, Static65.aClass22_104);
				Static230.method3613(Static213.aClass22_71, Static94.aClass4_Sub2_Sub9_Sub2_1, Static80.aClass22_31);
				Static208.method3285(Static278.aClass22_96);
				Static180.method2937(Static101.aClass22_33, Static75.aClass22_29, Static127.aClass22_42);
				Static43.method803(Static278.aClass22_96);
				Static88.method1488(Static175.aClass22_63, Static80.aClass22_31);
				Static273.method4323(Static245.aClass22_84);
				Static43.method799(Static278.aClass22_96);
				Static209.method3297(Static60.aClass22_26, Static292.aClass22_102, Static80.aClass22_31, Static182.aClass22_64);
				Static76.method1296(Static278.aClass22_96);
				Static255.method3942(Static198.aClass22_69);
				Static125.method2045(new Class11(), Static13.aClass22_6, Static5.aClass22_2);
				Static168.method2667(Static5.aClass22_2, Static13.aClass22_6);
				Static35.method226(Static278.aClass22_96);
				Static105.method1793(Static278.aClass22_96);
				Static301.method4632(Static278.aClass22_96);
				Static80.method1371(Static278.aClass22_96, Static60.aClass22_26);
				Static46.method931(Static278.aClass22_96, Static60.aClass22_26);
				Static65.anInt5707 = 50;
				Static190.aString134 = Static136.aString91;
				Static72.method1223();
				Static210.anInt4109 = 80;
			} else {
				Static65.anInt5707 = 50;
				Static190.aString134 = Static162.aString116 + local91 / 11 + "%";
			}
		} else if (Static210.anInt4109 == 80) {
			local91 = Static81.method1389(Static60.aClass22_26);
			local38 = Static168.method2668();
			if (local38 > local91) {
				Static190.aString134 = Static85.aString67 + local91 * 100 / local38 + "%";
				Static65.anInt5707 = 60;
			} else {
				Static7.method111(Static60.aClass22_26);
				Static65.anInt5707 = 60;
				Static210.anInt4109 = 90;
				Static190.aString134 = Static170.aString121;
			}
		} else if (Static210.anInt4109 == 90) {
			if (Static160.aClass22_58.method682()) {
				@Pc(980) Class95_Sub1 local980 = new Class95_Sub1(Static192.aClass22_20, Static160.aClass22_58, Static60.aClass22_26, 20, !Static226.aBoolean286);
				Static283.method4428(local980);
				if (Static248.anInt4872 == 1) {
					Static283.method4413(0.9F);
				}
				if (Static248.anInt4872 == 2) {
					Static283.method4413(0.8F);
				}
				if (Static248.anInt4872 == 3) {
					Static283.method4413(0.7F);
				}
				if (Static248.anInt4872 == 4) {
					Static283.method4413(0.6F);
				}
				Static210.anInt4109 = 100;
				Static190.aString134 = Static195.aString135;
				Static65.anInt5707 = 70;
			} else {
				Static190.aString134 = Static250.aString165 + Static160.aClass22_58.method664() + "%";
				Static65.anInt5707 = 70;
			}
		} else if (Static210.anInt4109 == 100) {
			if (Static232.method3634(Static60.aClass22_26)) {
				Static210.anInt4109 = 110;
			}
		} else if (Static210.anInt4109 == 110) {
			Static88.aClass30_1 = new Class30();
			Static95.aClass184_3.method4621(Static88.aClass30_1, 10);
			Static190.aString134 = Static195.aString136;
			Static65.anInt5707 = 75;
			Static210.anInt4109 = 120;
		} else if (Static210.anInt4109 == 120) {
			if (Static155.aClass22_57.method659("", "huffman")) {
				@Pc(1079) Class69 local1079 = new Class69(Static155.aClass22_57.method681("", "huffman"));
				Static49.method974(local1079);
				Static65.anInt5707 = 80;
				Static190.aString134 = Static277.aString184;
				Static210.anInt4109 = 130;
			} else {
				Static190.aString134 = Static241.aString157 + "0%";
				Static65.anInt5707 = 80;
			}
		} else if (Static210.anInt4109 == 130) {
			if (!Static182.aClass22_64.method682()) {
				Static190.aString134 = Static279.aString185 + Static182.aClass22_64.method664() * 3 / 4 + "%";
				Static65.anInt5707 = 85;
			} else if (!Static269.aClass22_95.method682()) {
				Static190.aString134 = Static279.aString185 + (Static269.aClass22_95.method664() / 10 + 75) + "%";
				Static65.anInt5707 = 85;
			} else if (!Static292.aClass22_102.method682()) {
				Static190.aString134 = Static279.aString185 + (Static292.aClass22_102.method664() / 20 + 85) + "%";
				Static65.anInt5707 = 85;
			} else if (Static52.aClass22_25.method684("details")) {
				Static76.method1292(Static52.aClass22_25, Static4.aClass4_Sub2_Sub4_Sub2Array1);
				Static117.method1973(Static86.aClass22_32);
				Static119.method2000(Static80.aClass22_31);
				Static190.aString134 = Static273.aString180;
				Static65.anInt5707 = 95;
				Static210.anInt4109 = 135;
			} else {
				Static190.aString134 = Static279.aString185 + (Static52.aClass22_25.method657("details") / 10 + 90) + "%";
				Static65.anInt5707 = 85;
			}
		} else if (Static210.anInt4109 == 135) {
			local91 = Static113.method1903();
			if (local91 == -1) {
				Static65.anInt5707 = 95;
				Static190.aString134 = Static154.aString105;
			} else if (local91 == 7 || local91 == 9) {
				this.method769("worldlistfull");
				Static123.method2035(1000);
			} else if (Static223.aBoolean280) {
				Static190.aString134 = Static47.aString39;
				Static210.anInt4109 = 140;
				Static65.anInt5707 = 96;
			} else {
				this.method769("worldlistio_" + local91);
				Static123.method2035(1000);
			}
		} else if (Static210.anInt4109 == 140) {
			Static263.anInt5161 = Static182.aClass22_64.method661("loginscreen");
			Static296.aClass22_105.method674(false);
			Static145.aClass22_101.method674(true);
			Static60.aClass22_26.method674(true);
			Static292.aClass22_102.method674(true);
			Static155.aClass22_57.method674(true);
			Static182.aClass22_64.method674(true);
			Static190.aString134 = Static105.aString79;
			Static245.aBoolean305 = true;
			Static65.anInt5707 = 97;
			Static210.anInt4109 = 150;
		} else if (Static210.anInt4109 == 150) {
			Static220.method3406();
			if (Static209.aBoolean250) {
				Static188.anInt5754 = 0;
				Static230.anInt4613 = 0;
				Static174.anInt3538 = 0;
				Static228.anInt4580 = 0;
			}
			Static209.aBoolean250 = true;
			Static204.method3268(Static95.aClass184_3);
			Static112.method1885(false, Static228.anInt4580, -1, -1);
			Static65.anInt5707 = 100;
			Static190.aString134 = Static73.aString59;
			Static210.anInt4109 = 160;
		} else if (Static210.anInt4109 == 160) {
			Static58.method2509(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method788(@OriginalArg(1) int arg0) {
		Static276.aClass91_4 = null;
		Static82.aClass70_2.anInt2166 = arg0;
		Static82.aClass70_2.anInt2165++;
		Static144.anInt2860 = 0;
		Static277.aClass119_8 = null;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method789() {
		@Pc(7) boolean local7 = Static82.aClass70_2.method1839();
		if (!local7) {
			this.method784();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method770() {
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method771() {
		if (Static204.anInt4047 == 1000) {
			return;
		}
		@Pc(20) long local20 = Static250.method3845() / 1000000L - Static243.aLong167;
		Static243.aLong167 = Static250.method3845() / 1000000L;
		@Pc(28) boolean local28 = Static5.method87();
		if (local28 && Static64.aBoolean80 && Static100.aClass112_44 != null) {
			Static100.aClass112_44.method4452();
		}
		if ((Static204.anInt4047 == 30 || Static204.anInt4047 == 10) && (Static66.aBoolean338 || Static200.aLong143 != 0L && Static61.method1150() > Static200.aLong143)) {
			Static112.method1885(Static66.aBoolean338, Static284.method4440(), Static121.anInt2458, Static104.anInt2103);
		}
		@Pc(97) int local97;
		@Pc(101) int local101;
		if (Static250.aFrame2 == null) {
			@Pc(82) Container local82;
			if (Static250.aFrame2 != null) {
				local82 = Static250.aFrame2;
			} else if (Static32.aFrame1 == null) {
				local82 = Static95.aClass184_3.anApplet1;
			} else {
				local82 = Static32.aFrame1;
			}
			local97 = local82.getSize().width;
			local101 = local82.getSize().height;
			if (local82 == Static32.aFrame1) {
				@Pc(108) Insets local108 = Static32.aFrame1.getInsets();
				local97 -= local108.right + local108.left;
				local101 -= local108.top + local108.bottom;
			}
			if (Static162.anInt3312 != local97 || local101 != Static242.anInt4775) {
				if (Static300.aString195.startsWith("mac")) {
					Static242.anInt4775 = local101;
					Static162.anInt3312 = local97;
				} else {
					Static19.method426();
				}
				Static200.aLong143 = Static61.method1150() + 500L;
			}
		}
		if (Static250.aFrame2 != null && !Static132.aBoolean169 && (Static204.anInt4047 == 30 || Static204.anInt4047 == 10)) {
			Static112.method1885(false, Static228.anInt4580, -1, -1);
		}
		@Pc(172) boolean local172 = false;
		if (Static159.aBoolean210) {
			local172 = true;
			Static159.aBoolean210 = false;
		}
		if (local172) {
			Static20.method2333();
		}
		if (Static251.aBoolean330) {
			for (local97 = 0; local97 < 100; local97++) {
				Static48.aBooleanArray14[local97] = true;
			}
		}
		if (Static204.anInt4047 == 0) {
			Static7.method117(local172, Static65.anInt5707, Static190.aString134, null);
		} else if (Static204.anInt4047 == 5) {
			Static182.method2938(false, Static86.aClass4_Sub2_Sub9_3);
		} else if (Static204.anInt4047 == 10) {
			Static187.method3134();
		} else if (Static204.anInt4047 == 25 || Static204.anInt4047 == 28) {
			if (Static160.anInt3279 == 1) {
				if (Static143.anInt2834 < Static97.anInt4591) {
					Static143.anInt2834 = Static97.anInt4591;
				}
				local97 = (Static143.anInt2834 - Static97.anInt4591) * 50 / Static143.anInt2834;
				Static250.method3846(Static174.aString124 + "<br>(" + local97 + "%)", false);
			} else if (Static160.anInt3279 == 2) {
				if (Static276.anInt5449 > Static240.anInt2598) {
					Static240.anInt2598 = Static276.anInt5449;
				}
				local97 = (Static240.anInt2598 - Static276.anInt5449) * 50 / Static240.anInt2598 + 50;
				Static250.method3846(Static174.aString124 + "<br>(" + local97 + "%)", false);
			} else {
				Static250.method3846(Static174.aString124, false);
			}
		} else if (Static204.anInt4047 == 30) {
			Static77.method1319(local20);
		} else if (Static204.anInt4047 == 40) {
			Static250.method3846(Static184.aString128 + "<br>" + Static210.aString141, false);
		}
		if (Static251.aBoolean330 && Static204.anInt4047 != 0) {
			Static251.method3887();
			for (local97 = 0; local97 < Static65.anInt5697; local97++) {
				Static22.aBooleanArray8[local97] = false;
			}
		} else {
			@Pc(362) Graphics local362;
			if ((Static204.anInt4047 == 30 || Static204.anInt4047 == 10) && Static20.anInt2891 == 0 && !local172) {
				try {
					local362 = Static139.aCanvas1.getGraphics();
					for (local101 = 0; local101 < Static65.anInt5697; local101++) {
						if (Static22.aBooleanArray8[local101]) {
							Static147.aClass42_1.method3930(Static184.anIntArray304[local101], local362, Static242.anIntArray380[local101], Static184.anIntArray305[local101], Static226.anIntArray370[local101]);
							Static22.aBooleanArray8[local101] = false;
						}
					}
				} catch (@Pc(400) Exception local400) {
					Static139.aCanvas1.repaint();
				}
			} else if (Static204.anInt4047 != 0) {
				try {
					local362 = Static139.aCanvas1.getGraphics();
					Static147.aClass42_1.method3931(local362);
					for (local101 = 0; local101 < Static65.anInt5697; local101++) {
						Static22.aBooleanArray8[local101] = false;
					}
				} catch (@Pc(437) Exception local437) {
					Static139.aCanvas1.repaint();
				}
			}
		}
		if (Static245.aBoolean305) {
			Static2.method14();
		}
		if (Static209.aBoolean250 && Static204.anInt4047 == 10 && Static56.anInt1264 != -1) {
			Static209.aBoolean250 = false;
			Static204.method3268(Static95.aClass184_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method779() {
		if (Static204.anInt4047 == 1000) {
			return;
		}
		Static50.anInt1118++;
		if (Static50.anInt1118 % 1000 == 1) {
			@Pc(36) GregorianCalendar local36 = new GregorianCalendar();
			Static53.anInt1192 = local36.get(11) * 600 + local36.get(12) * 10 + local36.get(13) / 6;
			Static202.aRandom1.setSeed((long) Static53.anInt1192);
		}
		this.method789();
		if (Static267.aClass52_1 != null) {
			Static267.aClass52_1.method1399();
		}
		Static48.method949();
		Static65.method4575();
		Static27.method577();
		Static132.method2150();
		if (Static251.aBoolean330) {
			Static239.method3677();
		}
		if (Static42.aClass47_1 != null) {
			@Pc(85) int local85 = Static42.aClass47_1.method1211();
			Static131.anInt1447 = local85;
		}
		if (Static204.anInt4047 == 0) {
			this.method787();
			Static298.method4218();
		} else if (Static204.anInt4047 == 5) {
			this.method787();
			Static298.method4218();
		} else if (Static204.anInt4047 == 25 || Static204.anInt4047 == 28) {
			Static165.method2630();
		}
		if (Static204.anInt4047 == 10) {
			this.method785();
			Static48.method943();
			Static136.method2195();
			Static237.method3672();
		} else if (Static204.anInt4047 == 30) {
			Static178.method2930();
		} else if (Static204.anInt4047 == 40) {
			Static237.method3672();
			if (Static140.anInt2773 != -3) {
				if (Static140.anInt2773 == 15) {
					Static274.method4326();
				} else if (Static140.anInt2773 != 2) {
					Static39.method721();
				}
			}
		}
	}
}
