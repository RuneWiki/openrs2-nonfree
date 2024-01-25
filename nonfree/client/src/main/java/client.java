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
			if (arg0.length != 4) {
				Static24.method5097("argument count");
			}
			Static72.anInt1418 = Integer.parseInt(arg0[0]);
			Static113.anInt6411 = 2;
			if (arg0[1].equals("live")) {
				Static310.anInt6141 = 0;
			} else if (arg0[1].equals("rc")) {
				Static310.anInt6141 = 1;
			} else if (arg0[1].equals("wip")) {
				Static310.anInt6141 = 2;
			} else {
				Static24.method5097("modewhat");
			}
			Static344.anInt6698 = Static154.method5393(arg0[2]);
			if (Static344.anInt6698 == -1) {
				if (arg0[2].equals("english")) {
					Static344.anInt6698 = 0;
				} else if (arg0[2].equals("german")) {
					Static344.anInt6698 = 1;
				} else {
					Static24.method5097("language");
				}
			}
			Static222.method3878(Static344.anInt6698);
			Static352.aBoolean452 = false;
			Static341.aBoolean445 = false;
			if (arg0[3].equals("game0")) {
				Static309.anInt6133 = 0;
			} else if (arg0[3].equals("game1")) {
				Static309.anInt6133 = 1;
			} else {
				Static24.method5097("game");
			}
			Static230.aString248 = "";
			Static329.anInt6344 = 0;
			Static11.anInt258 = Static309.anInt6133;
			Static321.anInt6214 = 0;
			@Pc(129) client local129 = new client();
			Static37.aClient2 = local129;
			local129.method803(Static310.anInt6141 + 32, Static309.anInt6133 == 1 ? "stellardawn" : "runescape");
			Static176.aFrame4.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static69.method1091(null, local154);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method795() {
		if (Static266.anInt5370 == 1000) {
			return;
		}
		Static51.anInt1101++;
		if (Static51.anInt1101 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static301.anInt5984 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static342.aRandom1.setSeed((long) Static301.anInt5984);
		}
		this.method821();
		if (Static268.aClass107_1 != null) {
			Static268.aClass107_1.method2384();
		}
		Static23.method439();
		Static123.method2158();
		Static156.method2488();
		Static341.method5591();
		if (Static212.aClass122_2 != null) {
			Static212.aClass122_2.method4726((int) Static53.method898());
		}
		if (Static345.aClass79_1 != null) {
			@Pc(81) int local81 = Static345.aClass79_1.method5428();
			Static19.anInt532 = local81;
		}
		Static49.method843();
		if (Static266.anInt5370 == 0) {
			this.method822();
			Static350.method5691();
		} else if (Static266.anInt5370 == 5) {
			this.method822();
			Static350.method5691();
		} else if (Static266.anInt5370 == 25 || Static266.anInt5370 == 28) {
			Static52.method895();
		}
		if (Static266.anInt5370 == 10) {
			this.method824();
			Static124.method2171();
			Static308.method5184();
			Static188.method3399();
		} else if (Static266.anInt5370 == 30) {
			Static124.method2167();
		} else if (Static266.anInt5370 == 40) {
			Static188.method3399();
			if (Static84.anInt1683 != -3) {
				if (Static84.anInt1683 == 15) {
					Static84.method1336();
				} else if (Static84.anInt1683 != 2) {
					Static251.method4218();
				}
			}
		}
		Static249.method3961(Static212.aClass122_2);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method813(@OriginalArg(0) int arg0) {
		Static10.aClass163_1.anInt4856 = arg0;
		Static350.anInt6809 = 0;
		Static233.aClass16_3 = null;
		Static36.aClass207_3 = null;
		Static10.aClass163_1.anInt4855++;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method815() {
		if (Static10.aClass163_1.anInt4855 > Static165.anInt3204) {
			Static66.anInt6663 = (Static10.aClass163_1.anInt4855 - 1) * 250;
			if (Static342.anInt6677 == Static47.anInt1037) {
				Static342.anInt6677 = Static230.anInt6570;
			} else {
				Static342.anInt6677 = Static47.anInt1037;
			}
			if (Static66.anInt6663 > 3000) {
				Static66.anInt6663 = 3000;
			}
			if (Static10.aClass163_1.anInt4855 >= 2 && Static10.aClass163_1.anInt4856 == 6) {
				this.method798("js5connect_outofdate");
				Static266.anInt5370 = 1000;
				return;
			}
			if (Static10.aClass163_1.anInt4855 >= 4 && Static10.aClass163_1.anInt4856 == -1) {
				this.method798("js5crc");
				Static266.anInt5370 = 1000;
				return;
			}
			if (Static10.aClass163_1.anInt4855 >= 4 && (Static266.anInt5370 == 0 || Static266.anInt5370 == 5)) {
				if (Static10.aClass163_1.anInt4856 == 7 || Static10.aClass163_1.anInt4856 == 9) {
					this.method798("js5connect_full");
				} else if (Static10.aClass163_1.anInt4856 > 0) {
					this.method798("js5connect");
				} else {
					this.method798("js5io");
				}
				Static266.anInt5370 = 1000;
				return;
			}
		}
		Static165.anInt3204 = Static10.aClass163_1.anInt4855;
		if (Static66.anInt6663 > 0) {
			Static66.anInt6663--;
			return;
		}
		try {
			if (Static350.anInt6809 == 0) {
				Static36.aClass207_3 = Static353.aClass42_5.method960(Static342.anInt6677, Static346.aString255);
				Static350.anInt6809++;
			}
			if (Static350.anInt6809 == 1) {
				if (Static36.aClass207_3.anInt6346 == 2) {
					this.method813(1000);
					return;
				}
				if (Static36.aClass207_3.anInt6346 == 1) {
					Static350.anInt6809++;
				}
			}
			if (Static350.anInt6809 == 2) {
				Static233.aClass16_3 = new Class16((Socket) Static36.aClass207_3.anObject7, Static353.aClass42_5);
				@Pc(174) Class3_Sub4 local174 = new Class3_Sub4(5);
				local174.method3614(15);
				local174.method3650(556);
				Static233.aClass16_3.method397(local174.aByteArray70, 5);
				Static350.anInt6809++;
				Static203.aLong137 = Static53.method898();
			}
			if (Static350.anInt6809 == 3) {
				if (Static266.anInt5370 == 0 || Static266.anInt5370 == 5 || Static233.aClass16_3.method391() > 0) {
					@Pc(234) int local234 = Static233.aClass16_3.method394();
					if (local234 != 0) {
						this.method813(local234);
						return;
					}
					Static350.anInt6809++;
				} else if (Static53.method898() - Static203.aLong137 > 30000L) {
					this.method813(1001);
					return;
				}
			}
			if (Static350.anInt6809 == 4) {
				@Pc(268) boolean local268 = Static266.anInt5370 == 5 || Static266.anInt5370 == 10 || Static266.anInt5370 == 28;
				Static10.aClass163_1.method4176(Static233.aClass16_3, !local268);
				Static233.aClass16_3 = null;
				Static350.anInt6809 = 0;
				Static36.aClass207_3 = null;
			}
		} catch (@Pc(285) IOException local285) {
			this.method813(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method796() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method809()) {
			return;
		}
		Static72.anInt1418 = Integer.parseInt(this.getParameter("worldid"));
		Static113.anInt6411 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static113.anInt6411 < 0 || Static113.anInt6411 > 1) {
			Static113.anInt6411 = 0;
		}
		Static310.anInt6141 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static310.anInt6141 < 0 || Static310.anInt6141 > 2) {
			Static310.anInt6141 = 0;
		}
		try {
			Static344.anInt6698 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(51) Exception local51) {
			Static344.anInt6698 = 0;
		}
		Static222.method3878(Static344.anInt6698);
		@Pc(60) String local60 = this.getParameter("objecttag");
		if (local60 != null && local60.equals("1")) {
			Static352.aBoolean452 = true;
		} else {
			Static352.aBoolean452 = false;
		}
		@Pc(76) String local76 = this.getParameter("js");
		if (local76 != null && local76.equals("1")) {
			Static341.aBoolean445 = true;
		} else {
			Static341.aBoolean445 = false;
		}
		@Pc(92) String local92 = this.getParameter("game");
		if (local92 != null && local92.equals("1")) {
			Static309.anInt6133 = 1;
		} else {
			Static309.anInt6133 = 0;
		}
		try {
			Static329.anInt6344 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(111) Exception local111) {
			Static329.anInt6344 = 0;
		}
		Static198.aString154 = this.getParameter("quiturl");
		Static230.aString248 = this.getParameter("settings");
		if (Static230.aString248 == null) {
			Static230.aString248 = "";
		}
		@Pc(129) String local129 = this.getParameter("country");
		if (local129 != null) {
			try {
				Static321.anInt6214 = Integer.parseInt(local129);
			} catch (@Pc(136) Exception local136) {
				Static321.anInt6214 = 0;
			}
		}
		Static11.anInt258 = Integer.parseInt(this.getParameter("colourid"));
		if (Static11.anInt258 < 0 || Static11.anInt258 >= Static250.aColorArray26.length) {
			Static11.anInt258 = 0;
		}
		Static37.aClient2 = this;
		this.method806(Static310.anInt6141 + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method821() {
		@Pc(11) boolean local11 = Static10.aClass163_1.method4172();
		if (!local11) {
			this.method815();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method822() {
		if (!Static250.aBoolean275) {
			label222: while (true) {
				do {
					if (!Static253.method4241()) {
						break label222;
					}
				} while (Static32.aChar1 != 's' && Static32.aChar1 != 'S');
				Static250.aBoolean275 = true;
			}
		}
		@Pc(39) int local39;
		if (Static54.anInt1164 == 0) {
			@Pc(29) Runtime local29 = Runtime.getRuntime();
			local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
			@Pc(42) long local42 = Static53.method898();
			if (Static149.aLong108 == 0L) {
				Static149.aLong108 = local42;
			}
			if (local39 > 16384 && local42 - Static149.aLong108 < 5000L) {
				if (local42 - Static185.aLong131 > 1000L) {
					System.gc();
					Static185.aLong131 = local42;
				}
				Static176.aString218 = Static111.aString81;
				Static176.anInt5893 = 5;
			} else {
				Static54.anInt1164 = 10;
				Static176.aString218 = Static45.aString27;
				Static176.anInt5893 = 5;
			}
			return;
		}
		@Pc(89) int local89;
		if (Static54.anInt1164 == 10) {
			for (local89 = 0; local89 < 4; local89++) {
				Static34.aClass13Array1[local89] = Static289.method4948(Static162.anInt2152, Static122.anInt2632);
			}
			Static176.anInt5893 = 10;
			Static176.aString218 = Static155.aString68;
			Static54.anInt1164 = 20;
		} else if (Static54.anInt1164 == 20) {
			if (Static268.aClass107_1 == null) {
				Static268.aClass107_1 = new Class107(Static10.aClass163_1, Static321.aClass78_3);
			}
			if (Static268.aClass107_1.method2383()) {
				Static192.aClass100_84 = Static212.method1616(true, false, 0);
				Static44.aClass100_17 = Static212.method1616(true, false, 1);
				Static296.aClass100_115 = Static212.method1616(true, false, 2);
				Static178.aClass100_75 = Static212.method1616(true, false, 3);
				Static3.aClass100_1 = Static212.method1616(true, false, 4);
				Static50.aClass100_20 = Static212.method1616(true, true, 5);
				Static244.aClass100_98 = Static212.method1616(false, true, 6);
				Static100.aClass100_38 = Static212.method1616(true, false, 7);
				Static317.aClass100_112 = Static212.method1616(true, false, 8);
				Static118.aClass100_51 = Static212.method1616(true, false, 9);
				Static185.aClass100_82 = Static212.method1616(true, false, 10);
				Static293.aClass100_121 = Static212.method1616(true, false, 11);
				Static69.aClass100_25 = Static212.method1616(true, false, 12);
				Static86.aClass100_86 = Static212.method1616(true, false, 13);
				Static90.aClass100_34 = Static212.method1616(false, false, 14);
				Static102.aClass100_39 = Static212.method1616(true, false, 15);
				Static227.aClass100_95 = Static212.method1616(true, false, 16);
				Static277.aClass100_111 = Static212.method1616(true, false, 17);
				Static175.aClass100_74 = Static212.method1616(true, false, 18);
				Static107.aClass100_45 = Static212.method1616(true, false, 19);
				Static147.aClass100_63 = Static212.method1616(true, false, 20);
				Static38.aClass100_14 = Static212.method1616(true, false, 21);
				Static72.aClass100_26 = Static212.method1616(true, false, 22);
				Static124.aClass100_58 = Static212.method1616(true, true, 23);
				Static185.aClass100_83 = Static212.method1616(true, false, 24);
				Static179.aClass100_80 = Static212.method1616(true, false, 25);
				Static179.aClass100_81 = Static212.method1616(true, true, 26);
				Static102.aClass100_40 = Static212.method1616(true, false, 27);
				Static125.aClass100_60 = Static212.method1616(true, true, 28);
				Static54.anInt1164 = 30;
				Static176.anInt5893 = 15;
				Static176.aString218 = Static157.aString116;
			} else {
				Static176.aString218 = Static113.aString237;
				Static176.anInt5893 = 12;
			}
		} else if (Static54.anInt1164 == 30) {
			local89 = 0;
			for (local39 = 0; local39 < 29; local39++) {
				local89 += Static72.aClass152_Sub1Array1[local39].method3969() * Static241.anIntArray391[local39] / 100;
			}
			if (local89 == 100) {
				Static176.aString218 = Static174.aString133;
				Static176.anInt5893 = 20;
				Static288.method4936(Static317.aClass100_112);
				Static71.method4508(Static317.aClass100_112);
				Static54.anInt1164 = 40;
			} else {
				Static176.anInt5893 = 20;
				if (local89 != 0) {
					Static176.aString218 = Static352.aString259 + local89 + "%";
				}
			}
		} else if (Static54.anInt1164 == 40) {
			if (Static125.aClass100_60.method2311()) {
				this.method826(Static125.aClass100_60.method2318(1));
				Static176.anInt5893 = 25;
				Static176.aString218 = Static289.aString212;
				Static54.anInt1164 = 50;
			} else {
				Static176.aString218 = Static45.aString28 + Static125.aClass100_60.method2291() + "%";
				Static176.anInt5893 = 25;
			}
		} else if (Static54.anInt1164 == 50) {
			Static11.method174(Static149.aBoolean162);
			Static2.aClass3_Sub2_Sub4_1 = new Class3_Sub2_Sub4();
			Static2.aClass3_Sub2_Sub4_1.method5116();
			Static348.aClass30_2 = Static158.method2503(Static353.aClass42_5, 0, 22050, Static295.aCanvas4);
			Static348.aClass30_2.method4518(Static2.aClass3_Sub2_Sub4_1);
			Static274.method5041(Static2.aClass3_Sub2_Sub4_1, Static90.aClass100_34, Static102.aClass100_39, Static3.aClass100_1);
			Static194.aClass30_1 = Static158.method2503(Static353.aClass42_5, 1, 2048, Static295.aCanvas4);
			Static273.aClass3_Sub2_Sub2_2 = new Class3_Sub2_Sub2();
			Static194.aClass30_1.method4518(Static273.aClass3_Sub2_Sub2_2);
			Static323.aClass132_1 = new Class132(22050, Static244.anInt4835);
			Class5_Sub4_Sub4.lb = Static244.aClass100_98.method2304("scape main");
			Static176.anInt5893 = 30;
			Static176.aString218 = Static149.aString110;
			Static54.anInt1164 = 60;
		} else if (Static54.anInt1164 == 60) {
			local89 = Static210.method3678(Static317.aClass100_112, Static86.aClass100_86);
			local39 = Static296.method5023();
			if (local39 > local89) {
				Static176.aString218 = Static156.aString115 + local89 * 100 / local39 + "%";
				Static176.anInt5893 = 35;
			} else {
				Static176.aString218 = Static106.aString80;
				Static54.anInt1164 = 70;
				Static176.anInt5893 = 35;
			}
		} else if (Static54.anInt1164 == 70) {
			local89 = Static122.method2152(Static317.aClass100_112);
			local39 = Static81.method1272();
			if (local39 > local89) {
				Static176.aString218 = Static203.aString160 + local89 * 100 / local39 + "%";
				Static176.anInt5893 = 40;
			} else {
				Static176.anInt5893 = 40;
				Static54.anInt1164 = 80;
				Static176.aString218 = Static300.aString222;
			}
		} else if (Static54.anInt1164 == 80) {
			if (Static179.aClass100_81.method2311()) {
				Static127.anInterface9_3 = new Class108(Static179.aClass100_81, Static118.aClass100_51, Static317.aClass100_112);
				Static176.anInt5893 = 45;
				Static176.aString218 = Static330.aString236;
				Static54.anInt1164 = 90;
			} else {
				Static176.aString218 = Static100.aString76 + Static179.aClass100_81.method2291() + "%";
				Static176.anInt5893 = 45;
			}
		} else if (Static54.anInt1164 == 90) {
			Static176.aString218 = Static26.aString17;
			Static54.anInt1164 = 95;
			Static176.anInt5893 = 50;
		} else if (Static54.anInt1164 == 95) {
			if (Static250.aBoolean275) {
				Static197.anInt4054 = 0;
				Static226.anInt4626 = 0;
				Static135.anInt2792 = 0;
				Static45.anInt930 = 0;
				Static37.anInt6452 = 1;
			}
			Static250.aBoolean275 = true;
			Static261.method4409(Static353.aClass42_5);
			Static127.method2208();
			Static67.method1071(Static197.anInt4054, false);
			Static54.anInt1164 = 100;
			Static176.anInt5893 = 55;
			Static176.aString218 = Static272.aString194;
		} else if (Static54.anInt1164 == 100) {
			Static127.method2205(Static212.aClass122_2, Static86.aClass100_86, Static317.aClass100_112);
			Static176.anInt5893 = 60;
			Static176.aString218 = Static164.aString233;
			Static353.method5714(5);
			Static54.anInt1164 = 110;
		} else if (Static54.anInt1164 == 110) {
			Static296.aClass100_115.method2311();
			local89 = Static296.aClass100_115.method2291();
			Static227.aClass100_95.method2311();
			local89 += Static227.aClass100_95.method2291();
			Static277.aClass100_111.method2311();
			local89 += Static277.aClass100_111.method2291();
			Static175.aClass100_74.method2311();
			local89 += Static175.aClass100_74.method2291();
			Static107.aClass100_45.method2311();
			local89 += Static107.aClass100_45.method2291();
			Static147.aClass100_63.method2311();
			local89 += Static147.aClass100_63.method2291();
			Static38.aClass100_14.method2311();
			local89 += Static38.aClass100_14.method2291();
			Static72.aClass100_26.method2311();
			local89 += Static72.aClass100_26.method2291();
			Static185.aClass100_83.method2311();
			local89 += Static185.aClass100_83.method2291();
			Static179.aClass100_80.method2311();
			local89 += Static179.aClass100_80.method2291();
			Static102.aClass100_40.method2311();
			local89 += Static102.aClass100_40.method2291();
			if (local89 < 1100) {
				Static176.anInt5893 = 65;
				Static176.aString218 = Static58.aString37 + local89 / 11 + "%";
			} else {
				Static47.method816(Static296.aClass100_115);
				Static98.method1677(Static296.aClass100_115);
				Static213.method3732(Static296.aClass100_115);
				Static283.method3803(Static296.aClass100_115, Static100.aClass100_38);
				Static112.method1932(Static227.aClass100_95, Static100.aClass100_38);
				Static143.method5635(Static100.aClass100_38, Static175.aClass100_74);
				Static212.method1618(Static107.aClass100_45, Static100.aClass100_38);
				Static355.method5742(Static296.aClass100_115);
				Static100.method1718(Static192.aClass100_84, Static147.aClass100_63, Static44.aClass100_17);
				Static71.method4526(Static296.aClass100_115);
				Static14.method385(Static100.aClass100_38, Static38.aClass100_14);
				Static241.method4150(Static72.aClass100_26);
				Static267.method4544(Static296.aClass100_115);
				Static286.method4932(Static317.aClass100_112, Static178.aClass100_75, Static86.aClass100_86, Static100.aClass100_38);
				Static178.method2912(Static296.aClass100_115);
				Static148.method2397(Static277.aClass100_111);
				Static204.method3548(Static179.aClass100_80, Static185.aClass100_83, new Class67());
				Static67.method1062(Static179.aClass100_80, Static185.aClass100_83);
				Static300.method5082(Static296.aClass100_115);
				Static223.method3898(Static296.aClass100_115);
				Static143.method5628(Static296.aClass100_115);
				Static180.method3226(Static317.aClass100_112, Static296.aClass100_115);
				Static248.method4186(Static296.aClass100_115, Static317.aClass100_112);
				Static213.method3730(Static296.aClass100_115);
				Static75.method1146(Static317.aClass100_112, Static296.aClass100_115);
				Static257.method4353(Static296.aClass100_115);
				Static52.method894(Static296.aClass100_115);
				Static176.anInt5893 = 65;
				Static176.aString218 = Static95.aString70;
				Static151.method2440();
				Static54.anInt1164 = 120;
			}
		} else if (Static54.anInt1164 == 120) {
			local89 = Static292.method4974(Static317.aClass100_112);
			local39 = Static341.method5588();
			if (local39 > local89) {
				Static176.aString218 = Static234.aString185 + local89 * 100 / local39 + "%";
				Static176.anInt5893 = 70;
			} else {
				Static286.method4927(Static317.aClass100_112, Static212.aClass122_2);
				Static248.method4184(Static153.aClass57Array10);
				Static176.anInt5893 = 70;
				Static54.anInt1164 = 130;
				Static176.aString218 = Static353.aString260;
			}
		} else if (Static54.anInt1164 == 130) {
			Static102.aClass95_1 = new Class95();
			Static353.aClass42_5.method972(Static102.aClass95_1, 10);
			Static176.anInt5893 = 75;
			Static54.anInt1164 = 140;
			Static176.aString218 = Static230.aString247;
		} else if (Static54.anInt1164 == 140) {
			if (Static185.aClass100_82.method2314("huffman", "")) {
				@Pc(1064) Class136 local1064 = new Class136(Static185.aClass100_82.method2290("", "huffman"));
				Static339.method4908(local1064);
				Static176.aString218 = Static81.aString52;
				Static54.anInt1164 = 150;
				Static176.anInt5893 = 80;
			} else {
				Static176.aString218 = Static37.aString240 + "0%";
				Static176.anInt5893 = 80;
			}
		} else if (Static54.anInt1164 == 150) {
			if (!Static178.aClass100_75.method2311()) {
				Static176.aString218 = Static226.aString175 + Static178.aClass100_75.method2291() * 3 / 4 + "%";
				Static176.anInt5893 = 85;
			} else if (!Static69.aClass100_25.method2311()) {
				Static176.aString218 = Static226.aString175 + (Static69.aClass100_25.method2291() / 10 + 75) + "%";
				Static176.anInt5893 = 85;
			} else if (!Static86.aClass100_86.method2311()) {
				Static176.aString218 = Static226.aString175 + (Static86.aClass100_86.method2291() / 20 + 85) + "%";
				Static176.anInt5893 = 85;
			} else if (Static124.aClass100_58.method2317("details")) {
				Static193.method1919(Static124.aClass100_58);
				Static303.method4797(Static102.aClass100_40);
				Static93.method1568(Static127.anInterface9_3, Static100.aClass100_38);
				Static176.anInt5893 = 85;
				Static54.anInt1164 = 160;
				Static176.aString218 = Static138.aString108;
			} else {
				Static176.aString218 = Static226.aString175 + (Static124.aClass100_58.method2320("details") / 10 + 90) + "%";
				Static176.anInt5893 = 85;
			}
		} else if (Static54.anInt1164 == 160) {
			local89 = Static84.method1335();
			if (local89 == -1) {
				Static176.anInt5893 = 90;
				Static176.aString218 = Static250.aString178;
			} else if (local89 == 7 || local89 == 9) {
				this.method798("worldlistfull");
				Static353.method5714(1000);
			} else if (Static323.aBoolean425) {
				Static54.anInt1164 = 170;
				Static176.aString218 = Static68.aString48;
				Static176.anInt5893 = 90;
			} else {
				this.method798("worldlistio_" + local89);
				Static353.method5714(1000);
			}
		} else if (Static54.anInt1164 == 170) {
			Static195.aStringArray24 = new String[Static299.anInt5947];
			Static213.aBooleanArray22 = new boolean[Static4.anInt68];
			Static347.anIntArray563 = new int[Static4.anInt68];
			for (local89 = 0; local89 < Static4.anInt68; local89++) {
				if (Static189.method3407(local89).anInt2992 == 0) {
					Static213.aBooleanArray22[local89] = true;
					Static109.anInt2315++;
				}
				Static347.anIntArray563[local89] = -1;
			}
			Static82.method1277();
			Static154.anInt6367 = Static178.aClass100_75.method2304("loginscreen");
			Static50.aClass100_20.method2294(false);
			Static244.aClass100_98.method2294(true);
			Static317.aClass100_112.method2294(true);
			Static86.aClass100_86.method2294(true);
			Static185.aClass100_82.method2294(true);
			Static178.aClass100_75.method2294(true);
			Static296.aClass100_115.anInt2828 = 2;
			Static114.aBoolean126 = true;
			Static277.aClass100_111.anInt2828 = 2;
			Static227.aClass100_95.anInt2828 = 2;
			Static175.aClass100_74.anInt2828 = 2;
			Static107.aClass100_45.anInt2828 = 2;
			Static147.aClass100_63.anInt2828 = 2;
			Static38.aClass100_14.anInt2828 = 2;
			Static85.method1382(false, Static37.anInt6452, -1, -1);
			Static54.anInt1164 = 180;
			Static176.aString218 = Static299.aString220;
			Static176.anInt5893 = 95;
		} else if (Static54.anInt1164 == 180) {
			Static68.method1088(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method801() {
		if (Static63.aBoolean66) {
			Static323.method5291();
		}
		if (Static212.aClass122_2 != null) {
			Static212.aClass122_2.method4780();
		}
		if (Static67.aFrame1 != null) {
			Static296.method5022(Static67.aFrame1, Static353.aClass42_5);
			Static67.aFrame1 = null;
		}
		if (Static102.aClass95_1 != null) {
			Static102.aClass95_1.aBoolean155 = false;
		}
		Static102.aClass95_1 = null;
		if (Static76.aClass16_2 != null) {
			Static76.aClass16_2.method392();
			Static76.aClass16_2 = null;
		}
		Static276.method4629(Static295.aCanvas4);
		Static203.method3541(Static295.aCanvas4);
		if (Static345.aClass79_1 != null) {
			Static345.aClass79_1.method5430(Static295.aCanvas4);
		}
		Static159.method2523();
		Static288.method4937();
		Static345.aClass79_1 = null;
		if (Static348.aClass30_2 != null) {
			Static348.aClass30_2.method4510();
		}
		if (Static194.aClass30_1 != null) {
			Static194.aClass30_1.method4510();
		}
		Static10.aClass163_1.method4171();
		Static321.aClass78_3.method1939();
		if (Static88.aClass115_1 != null) {
			Static88.aClass115_1.method2842();
			Static88.aClass115_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method824() {
		Static114.anInt2412 = 0;
		while (Static253.method4241() && Static114.anInt2412 < 128) {
			if (!Static175.method2872() || Static32.aChar1 != '`' && Static32.aChar1 != '§') {
				Static198.anIntArray340[Static114.anInt2412] = Static20.anInt554;
				Static223.anIntArray372[Static114.anInt2412] = Static32.aChar1;
				Static114.anInt2412++;
			} else if (Static130.method2222()) {
				Static298.method5057();
			} else {
				Static42.method729();
			}
		}
		if (Static130.method2222()) {
			Static97.method1656();
		}
		Static347.anInt6759++;
		Static319.method5266(null, -1, -1);
		Static246.method4183(-1, -1, null);
		if (Static191.anInt3991 != -1) {
			Static171.method2835(0, Static171.anInt3583, 0, Static191.anInt3991, 0, Static298.anInt5944, 0);
		}
		Static293.anInt6247++;
		for (@Pc(87) int local87 = 0; local87 < 32768; local87++) {
			@Pc(93) Class5_Sub4_Sub4_Sub2 local93 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local87];
			if (local93 != null) {
				@Pc(99) byte local99 = local93.aClass119_1.aByte37;
				if ((local99 & 0x1) != 0) {
					@Pc(107) int local107 = local93.method4208();
					@Pc(134) int local134;
					if ((local99 & 0x2) != 0 && local93.anInt4958 == 0 && Math.random() * 1000.0D < 10.0D) {
						local134 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(142) int local142 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local134 != 0 || local142 != 0) {
							@Pc(153) int local153 = local93.anIntArray405[0] + local134;
							@Pc(160) int local160 = local93.anIntArray404[0] + local142;
							if (local153 < 0) {
								local153 = 0;
							} else if (Static162.anInt2152 - local107 - 1 < local153) {
								local153 = Static162.anInt2152 - local107 - 1;
							}
							if (local160 < 0) {
								local160 = 0;
							} else if (Static122.anInt2632 - local107 - 1 < local160) {
								local160 = Static122.anInt2632 - local107 - 1;
							}
							@Pc(234) int local234 = Static319.method5267(local93.anIntArray405[0], local160, local107, local153, Static76.anIntArray94, Static308.anIntArray508, local107, 0, local93.anIntArray404[0], 0, local107, -1, true, Static34.aClass13Array1[local93.aByte69]);
							if (local234 > 0) {
								if (local234 > 9) {
									local234 = 9;
								}
								for (@Pc(246) int local246 = 0; local246 < local234; local246++) {
									local93.anIntArray405[local246] = Static76.anIntArray94[local234 - local246 - 1];
									local93.anIntArray404[local246] = Static308.anIntArray508[local234 - local246 - 1];
									local93.aByteArray80[local246] = 1;
								}
								local93.anInt4958 = local234;
							}
						}
					}
					Static295.method5008(local93, true);
					local134 = Static46.method772(local93);
					Static298.method5062(Static138.anInt2797, Static57.anInt1246, local134, local93);
					Static291.method4968(local93);
				}
			}
		}
		if (Static71.anInt5326 == 0 && Static104.anInt2185 == 0) {
			if (Static261.anInt5200 == 2) {
				Static237.method4024();
			} else {
				Static9.method165();
			}
			if (Static110.anInt2324 >> 7 < 14 || Static162.anInt2152 - 14 <= Static110.anInt2324 >> 7 || Static210.anInt4317 >> 7 < 14 || Static122.anInt2632 - 14 <= Static210.anInt4317 >> 7) {
				Static347.method5657();
			}
		}
		while (true) {
			@Pc(364) Class3_Sub41 local364;
			@Pc(369) Class181 local369;
			@Pc(380) Class181 local380;
			do {
				local364 = (Class3_Sub41) Static65.aClass127_6.method3396();
				if (local364 == null) {
					while (true) {
						do {
							local364 = (Class3_Sub41) Static132.aClass127_14.method3396();
							if (local364 == null) {
								while (true) {
									do {
										local364 = (Class3_Sub41) Static160.aClass127_16.method3396();
										if (local364 == null) {
											if (Static328.aClass181_50 != null) {
												Static20.method416();
											}
											if (Static51.anInt1101 % 1500 == 0) {
												Static184.method5383();
											}
											Static321.method5274();
											if (Static63.aBoolean66 && Static53.method898() - 60000L > Static328.aLong195) {
												Static323.method5291();
												return;
											}
											return;
										}
										local369 = local364.aClass181_54;
										if (local369.anInt5688 < 0) {
											break;
										}
										local380 = Static20.method415(local369.anInt5734);
									} while (local380 == null || local380.aClass181Array2 == null || local369.anInt5688 >= local380.aClass181Array2.length || local380.aClass181Array2[local369.anInt5688] != local369);
									Static139.method2275(local364);
								}
							}
							local369 = local364.aClass181_54;
							if (local369.anInt5688 < 0) {
								break;
							}
							local380 = Static20.method415(local369.anInt5734);
						} while (local380 == null || local380.aClass181Array2 == null || local369.anInt5688 >= local380.aClass181Array2.length || local380.aClass181Array2[local369.anInt5688] != local369);
						Static139.method2275(local364);
					}
				}
				local369 = local364.aClass181_54;
				if (local369.anInt5688 < 0) {
					break;
				}
				local380 = Static20.method415(local369.anInt5734);
			} while (local380 == null || local380.aClass181Array2 == null || local380.aClass181Array2.length <= local369.anInt5688 || local369 != local380.aClass181Array2[local369.anInt5688]);
			Static139.method2275(local364);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method797() {
		if (Static266.anInt5370 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static317.method4685() / 1000000L - Static76.aLong62;
		Static76.aLong62 = Static317.method4685() / 1000000L;
		@Pc(31) boolean local31 = Static182.method3248();
		if (local31 && Static107.aBoolean119 && Static348.aClass30_2 != null) {
			Static348.aClass30_2.method4521();
		}
		if (Static266.anInt5370 == 30 || Static266.anInt5370 == 10) {
			if (Static138.aLong103 != 0L && Static53.method898() > Static138.aLong103) {
				Static85.method1382(false, Static205.method34(), Static321.anInt6220, Static175.anInt3635);
			} else if (Static212.aClass122_2.method4730() && Static319.aBoolean423) {
				Static258.method4379();
			}
		}
		@Pc(96) int local96;
		@Pc(100) int local100;
		if (Static67.aFrame1 == null) {
			@Pc(88) Container local88;
			if (Static176.aFrame4 == null) {
				local88 = Static353.aClass42_5.anApplet1;
			} else {
				local88 = Static176.aFrame4;
			}
			local96 = local88.getSize().width;
			local100 = local88.getSize().height;
			if (Static176.aFrame4 == local88) {
				@Pc(106) Insets local106 = Static176.aFrame4.getInsets();
				local96 -= local106.left + local106.right;
				local100 -= local106.top + local106.bottom;
			}
			if (local96 != Static56.anInt1236 || local100 != Static165.anInt3205) {
				if (Static212.aClass122_2 == null || Static212.aClass122_2.method4748()) {
					Static7.method149();
				} else {
					Static56.anInt1236 = local96;
					Static165.anInt3205 = local100;
				}
				Static138.aLong103 = Static53.method898() + 500L;
			}
		}
		if (Static67.aFrame1 != null && !Static135.aBoolean157 && (Static266.anInt5370 == 30 || Static266.anInt5370 == 10)) {
			Static85.method1382(false, Static37.anInt6452, -1, -1);
		}
		@Pc(170) boolean local170 = false;
		if (Static266.aBoolean335) {
			Static266.aBoolean335 = false;
			local170 = true;
		}
		if (local170) {
			Static306.method5130();
		}
		if (Static212.aClass122_2 != null && Static212.aClass122_2.method4767() || Static205.method34() != 1) {
			Static203.method3543();
		}
		if (Static266.anInt5370 == 0) {
			Static21.method424(Static250.aColorArray26[Static11.anInt258], Static176.anInt5893, Static235.aColorArray25[Static11.anInt258], Static184.aColorArray33[Static11.anInt258], Static176.aString218, local170);
		} else if (Static266.anInt5370 == 5) {
			Static345.method5623(Static235.aColorArray25[Static11.anInt258].getRGB(), Static184.aColorArray33[Static11.anInt258].getRGB(), Static250.aColorArray26[Static11.anInt258].getRGB(), Static243.aClass120_6, Static212.aClass122_2.method4767() | local170, Static212.aClass122_2);
		} else if (Static266.anInt5370 == 10) {
			Static61.method1008();
		} else if (Static266.anInt5370 == 25 || Static266.anInt5370 == 28) {
			if (Static78.anInt1558 == 1) {
				if (Static231.anInt4674 > Static230.anInt6563) {
					Static230.anInt6563 = Static231.anInt4674;
				}
				local96 = (Static230.anInt6563 - Static231.anInt4674) * 50 / Static230.anInt6563;
				Static300.method5080(Static168.aString130 + "<br>(" + local96 + "%)", true, Static83.aClass120_1);
			} else if (Static78.anInt1558 == 2) {
				if (Static1.anInt9 < Static290.anInt5803) {
					Static1.anInt9 = Static290.anInt5803;
				}
				local96 = (Static1.anInt9 - Static290.anInt5803) * 50 / Static1.anInt9 + 50;
				Static300.method5080(Static168.aString130 + "<br>(" + local96 + "%)", true, Static83.aClass120_1);
			} else {
				Static300.method5080(Static168.aString130, true, Static83.aClass120_1);
			}
		} else if (Static266.anInt5370 == 30) {
			Static292.method4975(local18);
		} else if (Static266.anInt5370 == 40) {
			Static300.method5080(Static283.aString167 + "<br>" + Static272.aString193, true, Static83.aClass120_1);
		}
		if (Static350.anInt6810 == 3) {
			for (local96 = 0; local96 < Static312.anInt6281; local96++) {
				@Pc(375) Rectangle local375 = Class3.aRectangleArray122[local96];
				if (Static330.aBooleanArray30[local96]) {
					Static212.aClass122_2.method4801(local375.height, local375.x, local375.y, local375.width, -1996553985);
				} else if (Static28.aBooleanArray1[local96]) {
					Static212.aClass122_2.method4801(local375.height, local375.x, local375.y, local375.width, -1996554240);
				}
			}
		}
		if (Static130.method2222()) {
			Static198.method3462(Static212.aClass122_2);
		}
		if ((Static266.anInt5370 == 30 || Static266.anInt5370 == 10) && Static350.anInt6810 == 0 && Static205.method34() == 1 && !local170 && Static59.aString39.equals("1.1")) {
			local96 = 0;
			for (local100 = 0; local100 < Static312.anInt6281; local100++) {
				if (Static28.aBooleanArray1[local100]) {
					Static28.aBooleanArray1[local100] = false;
					Static91.aRectangleArray40[local96++] = Class3.aRectangleArray122[local100];
				}
			}
			Static212.aClass122_2.method4712(Static91.aRectangleArray40, local96);
		} else if (Static266.anInt5370 != 0) {
			Static212.aClass122_2.method4789();
			for (local96 = 0; local96 < Static312.anInt6281; local96++) {
				Static28.aBooleanArray1[local96] = false;
			}
		}
		if (Static114.aBoolean126) {
			Static117.method2035();
		}
		if (Static250.aBoolean275 && Static266.anInt5370 == 10 && Static191.anInt3991 != -1) {
			Static250.aBoolean275 = false;
			Static261.method4409(Static353.aClass42_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method826(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method3643();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(31) int[] local31 = Static29.anIntArray38 = new int[6];
					local31[0] = local14.method3649();
					local31[1] = local14.method3649();
					local31[2] = local14.method3649();
					local31[3] = local14.method3649();
					local31[4] = local14.method3649();
					local31[5] = local14.method3649();
				} else if (local18 == 4) {
					@Pc(80) int local80 = local14.method3643();
					Static178.anIntArray252 = new int[local80];
					for (@Pc(85) int local85 = 0; local85 < local80; local85++) {
						Static178.anIntArray252[local85] = local14.method3649();
						if (Static178.anIntArray252[local85] == 65535) {
							Static178.anIntArray252[local85] = -1;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method805() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static7.method149();
		Static321.aClass78_3 = new Class78(Static353.aClass42_5);
		Static10.aClass163_1 = new Class163();
		if (Static310.anInt6141 != 0) {
			Static94.aByteArrayArray10 = new byte[50][];
		}
		Static91.method1444(Static353.aClass42_5);
		if (Static113.anInt6411 == 0) {
			Static323.aString232 = this.getCodeBase().getHost();
			Static86.anInt4277 = 43594;
			Static7.anInt203 = 443;
		} else if (Static113.anInt6411 == 1) {
			Static323.aString232 = this.getCodeBase().getHost();
			Static86.anInt4277 = Static72.anInt1418 + 40000;
			Static7.anInt203 = Static72.anInt1418 + 50000;
		} else if (Static113.anInt6411 == 2) {
			Static86.anInt4277 = Static72.anInt1418 + 40000;
			Static323.aString232 = "127.0.0.1";
			Static7.anInt203 = Static72.anInt1418 + 50000;
		}
		Static47.anInt1037 = Static86.anInt4277;
		Static147.anInt2909 = Static86.anInt4277;
		Static230.anInt6570 = Static7.anInt203;
		Static346.aString255 = Static323.aString232;
		if (Static309.anInt6133 == 1) {
			Static18.anInt527 = 0;
			Static8.aShortArrayArray1 = Static114.aShortArrayArray3;
			Static290.anInt5810 = 16777215;
			Static333.aShortArray111 = Static135.aShortArray70;
			Static196.aShortArrayArray4 = Static200.aShortArrayArray5;
			Static157.aShortArray71 = Static273.aShortArray103;
			Static309.aBoolean418 = true;
		} else {
			Static8.aShortArrayArray1 = Static19.aShortArrayArray2;
			Static196.aShortArrayArray4 = Static299.aShortArrayArray7;
			Static157.aShortArray71 = Static344.aShortArray113;
			Static333.aShortArray111 = Static44.aShortArray27;
		}
		if (Static59.anInt1274 == 3) {
			Static287.anInt5784 = Static72.anInt1418;
		}
		Static342.anInt6677 = Static147.anInt2909;
		Static244.aShortArray97 = Static88.aShortArray57 = Static121.aShortArray68 = Static232.aShortArray85 = new short[256];
		Static130.method2223();
		Static20.method417(Static295.aCanvas4);
		Static270.method4576(Static295.aCanvas4);
		Static345.aClass79_1 = Static270.method4577();
		if (Static345.aClass79_1 != null) {
			Static345.aClass79_1.method5423(Static295.aCanvas4);
		}
		Static102.anInt2144 = Static59.anInt1274;
		try {
			if (Static353.aClass42_5.aClass39_2 != null) {
				Static130.aClass36_5 = new Class36(Static353.aClass42_5.aClass39_2, 5200, 0);
				for (@Pc(168) int local168 = 0; local168 < 29; local168++) {
					Static261.aClass36Array1[local168] = new Class36(Static353.aClass42_5.aClass39Array1[local168], 6000, 0);
				}
				Static4.aClass36_1 = new Class36(Static353.aClass42_5.aClass39_3, 6000, 0);
				Static5.aClass55_1 = new Class55(255, Static130.aClass36_5, Static4.aClass36_1, 500000);
				Static4.aClass36_2 = new Class36(Static353.aClass42_5.aClass39_4, 24, 0);
				Static353.aClass42_5.aClass39Array1 = null;
				Static353.aClass42_5.aClass39_2 = null;
				Static353.aClass42_5.aClass39_3 = null;
				Static353.aClass42_5.aClass39_4 = null;
			}
		} catch (@Pc(226) IOException local226) {
			Static130.aClass36_5 = null;
			Static4.aClass36_1 = null;
			Static4.aClass36_2 = null;
			Static5.aClass55_1 = null;
		}
		if (Static309.anInt6133 == 0) {
			Static262.aString261 = Static40.aString238;
		} else if (Static309.anInt6133 == 1) {
			Static262.aString261 = Static181.aString32;
		}
		if (Static113.anInt6411 != 0) {
			Static276.aBoolean345 = true;
		}
	}
}
