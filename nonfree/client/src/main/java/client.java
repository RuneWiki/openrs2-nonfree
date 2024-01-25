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
				Static98.method1485("Argument count");
			}
			Static275.aClass170_5 = new Class170();
			Static275.aClass170_5.anInt4548 = Integer.parseInt(arg0[0]);
			Static59.aClass170_1 = new Class170();
			Static59.aClass170_1.anInt4548 = Integer.parseInt(arg0[1]);
			Static109.aClass170_2 = new Class170();
			Static109.aClass170_2.anInt4548 = Integer.parseInt(arg0[2]);
			Static207.aClass258_3 = Static558.aClass258_7;
			if (arg0[3].equals("live")) {
				Static183.aClass360_2 = Static155.aClass360_4;
			} else if (arg0[3].equals("rc")) {
				Static183.aClass360_2 = Static461.aClass360_5;
			} else if (arg0[3].equals("wip")) {
				Static183.aClass360_2 = Static578.aClass360_6;
			} else {
				Static98.method1485("modewhat");
			}
			Static52.anInt1264 = Static302.method4547(arg0[4]);
			if (Static52.anInt1264 == -1) {
				if (arg0[4].equals("english")) {
					Static52.anInt1264 = 0;
				} else if (arg0[4].equals("german")) {
					Static52.anInt1264 = 1;
				} else {
					Static98.method1485("language");
				}
			}
			Static590.aBoolean730 = false;
			Static97.aBoolean181 = false;
			if (arg0[5].equals("game0")) {
				Static328.aClass284_2 = Static574.aClass284_4;
			} else if (arg0[5].equals("game1")) {
				Static328.aClass284_2 = Static404.aClass284_3;
			} else {
				Static98.method1485("game");
			}
			Static107.anInt2202 = 0;
			Static458.aBoolean624 = false;
			Static311.aBoolean435 = true;
			Static161.aBoolean284 = true;
			Static15.aLong12 = 0L;
			Static55.anInt3626 = 0;
			Static46.aString8 = null;
			Static57.aBoolean99 = false;
			Static397.aString62 = "";
			Static259.anInt4808 = Static328.aClass284_2.anInt7923;
			Static200.anInt3958 = 0;
			Static544.aString96 = null;
			@Pc(166) client local166 = new client();
			Static413.aClient1 = local166;
			local166.method1071(Static183.aClass360_2.method7931() + 32, Static328.aClass284_2.aString74);
			Static593.aFrame2.setLocation(40, 40);
		} catch (@Pc(189) Exception local189) {
			Static58.method946(null, local189);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1085() {
		if (Static201.anInt3963 == 14) {
			return;
		}
		Static412.anInt575++;
		if (Static412.anInt575 % 1000 == 1) {
			@Pc(29) GregorianCalendar local29 = new GregorianCalendar();
			Static532.anInt8742 = local29.get(11) * 600 + local29.get(12) * 10 + local29.get(13) / 6;
			Static576.aRandom4.setSeed((long) Static532.anInt8742);
		}
		if (Static412.anInt575 % 50 == 0) {
			Static435.anInt878 = Static265.anInt4876;
			Static265.anInt4876 = 0;
			Static263.anInt4843 = Static159.anInt3212;
			Static159.anInt3212 = 0;
		}
		this.method1093();
		if (Static55.aClass176_2 != null) {
			Static55.aClass176_2.method3949();
		}
		Static475.method6743();
		Static529.aClass177_10.method4000();
		Static326.aClass149_1.method5883();
		if (Static307.aClass100_6 != null) {
			Static307.aClass100_6.method6205((int) Static548.method7437());
		}
		Static472.method6648();
		Static19.anInt584 = 0;
		Static398.anInt8718 = 0;
		for (@Pc(96) Interface2 local96 = Static529.aClass177_10.method4006(); local96 != null; local96 = Static529.aClass177_10.method4006()) {
			@Pc(102) int local102 = local96.method5042();
			if (local102 == 2 || local102 == 3) {
				@Pc(134) char local134 = local96.method5044();
				if (Static164.method2883() && (local134 == '`' || local134 == '§' || local134 == '²')) {
					if (Static462.method6517()) {
						Static56.method938();
					} else {
						Static348.method5191();
					}
				} else if (Static398.anInt8718 < 128) {
					Static577.anInterface2Array2[Static398.anInt8718] = local96;
					Static398.anInt8718++;
				}
			} else if (local102 == 0 && Static19.anInt584 < 75) {
				Static245.anInterface2Array1[Static19.anInt584] = local96;
				Static19.anInt584++;
			}
		}
		Static148.anInt3056 = 0;
		for (@Pc(182) Class2_Sub16 local182 = Static326.aClass149_1.method5878(); local182 != null; local182 = Static326.aClass149_1.method5878()) {
			@Pc(188) int local188 = local182.method6008();
			if (local188 == -1) {
				Static113.aClass8_15.method212(local182);
			} else if (local188 == 6) {
				Static148.anInt3056 += local182.method6010();
			} else if (Static513.method7129(local188)) {
				Static445.aClass8_54.method212(local182);
				if (Static445.aClass8_54.method214() > 10) {
					Static445.aClass8_54.method217();
				}
			}
		}
		if (Static462.method6517()) {
			Static327.method5032();
		}
		if (Static98.method1487(Static201.anInt3963)) {
			Static246.method3824();
			Static505.method7024();
		} else if (Static338.method5154(Static201.anInt3963)) {
			Static447.method6413();
		}
		if (Static181.method3117(Static201.anInt3963) && !Static338.method5154(Static201.anInt3963)) {
			this.method1096();
			Static133.method2288();
			Static395.method5770();
		} else if (Static407.method5922(Static201.anInt3963) && !Static338.method5154(Static201.anInt3963)) {
			this.method1096();
			Static395.method5770();
		} else if (Static201.anInt3963 == 12) {
			Static395.method5770();
		} else if (Static28.method5282(Static201.anInt3963) && !Static338.method5154(Static201.anInt3963)) {
			Static402.method5872();
		} else if (Static201.anInt3963 == 13) {
			Static395.method5770();
			if (Static46.anInt1128 != -3 && Static46.anInt1128 != 2 && Static46.anInt1128 != 15) {
				Static295.method7108(false);
			}
		}
		Static112.method1679(Static307.aClass100_6);
		Static445.aClass8_54.method217();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1073() {
		if (Static562.anApplet2 != null && Static471.aCanvas12 == null && !Static356.aClass287_5.aBoolean628) {
			try {
				@Pc(13) Class local13 = Static562.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static471.aCanvas12 = (Canvas) local17.get(Static562.anApplet2);
				local17.set(Static562.anApplet2, null);
				if (Static471.aCanvas12 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1073();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1075() {
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1090() {
		if (Static24.anInt645 < Static42.aClass327_1.anInt8672) {
			Static176.aClass170_3.method3783();
			Static395.anInt6895 = (Static42.aClass327_1.anInt8672 * 50 - 50) * 5;
			if (Static395.anInt6895 > 3000) {
				Static395.anInt6895 = 3000;
			}
			if (Static42.aClass327_1.anInt8672 >= 2 && Static42.aClass327_1.anInt8671 == 6) {
				this.method1068("js5connect_outofdate");
				Static201.anInt3963 = 14;
				return;
			}
			if (Static42.aClass327_1.anInt8672 >= 4 && Static42.aClass327_1.anInt8671 == -1) {
				this.method1068("js5crc");
				Static201.anInt3963 = 14;
				return;
			}
			if (Static42.aClass327_1.anInt8672 >= 4 && Static98.method1487(Static201.anInt3963)) {
				if (Static42.aClass327_1.anInt8671 == 7 || Static42.aClass327_1.anInt8671 == 9) {
					this.method1068("js5connect_full");
				} else if (Static42.aClass327_1.anInt8671 <= 0) {
					this.method1068("js5io");
				} else if (Static248.aString36 == null) {
					this.method1068("js5connect");
				} else {
					this.method1068("js5proxy_" + Static248.aString36.trim());
				}
				Static201.anInt3963 = 14;
				return;
			}
		}
		Static24.anInt645 = Static42.aClass327_1.anInt8672;
		if (Static395.anInt6895 > 0) {
			Static395.anInt6895--;
			return;
		}
		try {
			if (Static81.anInt1761 == 0) {
				Static459.aClass347_5 = Static176.aClass170_3.method3780(Static356.aClass287_5);
				Static81.anInt1761++;
			}
			if (Static81.anInt1761 == 1) {
				if (Static459.aClass347_5.anInt9172 == 2) {
					if (Static459.aClass347_5.anObject49 != null) {
						Static248.aString36 = (String) Static459.aClass347_5.anObject49;
					}
					this.method1095(1000);
					return;
				}
				if (Static459.aClass347_5.anInt9172 == 1) {
					Static81.anInt1761++;
				}
			}
			if (Static81.anInt1761 == 2) {
				Static417.aClass285_1 = new Class285((Socket) Static459.aClass347_5.anObject49, Static356.aClass287_5);
				@Pc(200) Class2_Sub15 local200 = new Class2_Sub15(5);
				local200.method4333(Static193.aClass180_2.anInt4831);
				local200.method4288(621);
				Static417.aClass285_1.method6501(5, local200.aByteArray62);
				Static81.anInt1761++;
				Static329.aLong153 = Static548.method7437();
			}
			if (Static81.anInt1761 == 3) {
				if (Static98.method1487(Static201.anInt3963) || Static417.aClass285_1.method6504() > 0) {
					@Pc(253) int local253 = Static417.aClass285_1.method6496();
					if (local253 != 0) {
						this.method1095(local253);
						return;
					}
					Static81.anInt1761++;
				} else if (Static548.method7437() - Static329.aLong153 > 30000L) {
					this.method1095(1001);
					return;
				}
			}
			if (Static81.anInt1761 == 4) {
				@Pc(285) boolean local285 = Static98.method1487(Static201.anInt3963) || Static181.method3117(Static201.anInt3963) || Static407.method5922(Static201.anInt3963);
				@Pc(288) Class107[] local288 = Static135.method2305();
				@Pc(296) Class2_Sub15 local296 = new Class2_Sub15(local288.length * 4);
				Static417.aClass285_1.method6499(0, local296.aByteArray62, local296.aByteArray62.length);
				for (@Pc(309) int local309 = 0; local309 < local288.length; local309++) {
					local288[local309].method2303(local296.method4307());
				}
				Static42.aClass327_1.method7228(!local285, Static417.aClass285_1);
				Static81.anInt1761 = 0;
				Static417.aClass285_1 = null;
				Static459.aClass347_5 = null;
			}
		} catch (@Pc(349) IOException local349) {
			this.method1095(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1093() {
		@Pc(12) boolean local12 = Static42.aClass327_1.method7222();
		if (!local12) {
			this.method1090();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1083() {
		if (Static57.aBoolean99) {
			Static440.anInt7756 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static220.method3487();
		Static282.aClass319_2 = new Class319(Static356.aClass287_5);
		Static42.aClass327_1 = new Class327();
		Static339.method2370(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static207.aClass258_3 != Static375.aClass258_6) {
			Static199.aByteArrayArray16 = new byte[50][];
		}
		Static72.aClass2_Sub12_Sub1_1 = new Class2_Sub12_Sub1(Static356.aClass287_5);
		if (Static207.aClass258_3 == Static375.aClass258_6) {
			Static275.aClass170_5.aString35 = this.getCodeBase().getHost();
		} else if (Static490.method6859(Static207.aClass258_3)) {
			Static275.aClass170_5.aString35 = this.getCodeBase().getHost();
			Static275.aClass170_5.anInt4550 = Static275.aClass170_5.anInt4548 + 40000;
			Static59.aClass170_1.anInt4550 = Static59.aClass170_1.anInt4548 + 40000;
			Static275.aClass170_5.anInt4549 = Static275.aClass170_5.anInt4548 + 50000;
			Static109.aClass170_2.anInt4550 = Static109.aClass170_2.anInt4548 + 40000;
			Static59.aClass170_1.anInt4549 = Static59.aClass170_1.anInt4548 + 50000;
			Static109.aClass170_2.anInt4549 = Static109.aClass170_2.anInt4548 + 50000;
		} else if (Static558.aClass258_7 == Static207.aClass258_3) {
			Static275.aClass170_5.aString35 = "127.0.0.1";
			Static59.aClass170_1.aString35 = "127.0.0.1";
			Static109.aClass170_2.aString35 = "127.0.0.1";
			Static275.aClass170_5.anInt4550 = Static275.aClass170_5.anInt4548 + 40000;
			Static59.aClass170_1.anInt4550 = Static59.aClass170_1.anInt4548 + 40000;
			Static109.aClass170_2.anInt4550 = Static109.aClass170_2.anInt4548 + 40000;
			Static275.aClass170_5.anInt4549 = Static275.aClass170_5.anInt4548 + 50000;
			Static59.aClass170_1.anInt4549 = Static59.aClass170_1.anInt4548 + 50000;
			Static109.aClass170_2.anInt4549 = Static109.aClass170_2.anInt4548 + 50000;
		}
		Static305.aShortArray96 = Static401.aShortArray101 = Static441.aShortArray103 = Static525.aShortArray142 = new short[256];
		if (Static574.aClass284_4 == Static328.aClass284_2) {
			Static158.aBoolean255 = false;
		}
		if (Static328.aClass284_2 == Static404.aClass284_3) {
			Static315.aShortArrayArray31 = Static161.aShortArrayArray3;
			Static561.aBoolean709 = true;
			Static218.anInt5033 = 16777215;
			Static65.aShortArrayArrayArray1 = Static358.aShortArrayArrayArray8;
			Static481.anInt8211 = 0;
		} else {
			Static65.aShortArrayArrayArray1 = Static213.aShortArrayArrayArray2;
			Static315.aShortArrayArray31 = Static532.aShortArrayArray32;
		}
		Static176.aClass170_3 = Static275.aClass170_5;
		try {
			Static484.aClipboard1 = Static413.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(213) Exception local213) {
		}
		Static529.aClass177_10 = Static551.method7465(Static471.aCanvas12);
		Static326.aClass149_1 = Static426.method6106(Static471.aCanvas12);
		try {
			if (Static356.aClass287_5.aClass63_4 != null) {
				Static393.aClass64_5 = new Class64(Static356.aClass287_5.aClass63_4, 5200, 0);
				for (@Pc(241) int local241 = 0; local241 < 35; local241++) {
					Static459.aClass64Array1[local241] = new Class64(Static356.aClass287_5.aClass63Array1[local241], 6000, 0);
				}
				Static153.aClass64_2 = new Class64(Static356.aClass287_5.aClass63_2, 6000, 0);
				Static248.aClass207_1 = new Class207(255, Static393.aClass64_5, Static153.aClass64_2, 500000);
				Static83.aClass64_1 = new Class64(Static356.aClass287_5.aClass63_3, 24, 0);
				Static356.aClass287_5.aClass63_4 = null;
				Static356.aClass287_5.aClass63Array1 = null;
				Static356.aClass287_5.aClass63_2 = null;
				Static356.aClass287_5.aClass63_3 = null;
			}
		} catch (@Pc(299) IOException local299) {
			Static153.aClass64_2 = null;
			Static248.aClass207_1 = null;
			Static83.aClass64_1 = null;
			Static393.aClass64_5 = null;
		}
		if (Static375.aClass258_6 != Static207.aClass258_3) {
			Static489.aBoolean647 = true;
		}
		if (Static574.aClass284_4 == Static328.aClass284_2) {
			Static537.aString95 = Static290.aClass198_1.method4365(Static52.anInt1264);
		} else if (Static404.aClass284_3 == Static328.aClass284_2) {
			Static537.aString95 = Static290.aClass198_2.method4365(Static52.anInt1264);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1072()) {
			return;
		}
		Static275.aClass170_5 = new Class170();
		Static275.aClass170_5.anInt4548 = Integer.parseInt(this.getParameter("worldid"));
		Static59.aClass170_1 = new Class170();
		Static59.aClass170_1.anInt4548 = Integer.parseInt(this.getParameter("lobbyid"));
		Static59.aClass170_1.aString35 = this.getParameter("lobbyaddress");
		Static109.aClass170_2 = new Class170();
		Static109.aClass170_2.anInt4548 = Integer.parseInt(this.getParameter("demoid"));
		Static109.aClass170_2.aString35 = this.getParameter("demoaddress");
		Static207.aClass258_3 = Static482.method6799(Integer.parseInt(this.getParameter("modewhere")));
		if (Static207.aClass258_3 == Static558.aClass258_7) {
			Static207.aClass258_3 = Static158.aClass258_2;
		} else if (!Static490.method6859(Static207.aClass258_3) && Static375.aClass258_6 != Static207.aClass258_3) {
			Static207.aClass258_3 = Static375.aClass258_6;
		}
		Static183.aClass360_2 = Static309.method4625(Integer.parseInt(this.getParameter("modewhat")));
		if (Static578.aClass360_6 != Static183.aClass360_2 && Static183.aClass360_2 != Static461.aClass360_5 && Static155.aClass360_4 != Static183.aClass360_2) {
			Static183.aClass360_2 = Static155.aClass360_4;
		}
		try {
			Static52.anInt1264 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static52.anInt1264 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static97.aBoolean181 = true;
		} else {
			Static97.aBoolean181 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static590.aBoolean730 = true;
		} else {
			Static590.aBoolean730 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static594.aBoolean733 = true;
		} else {
			Static594.aBoolean733 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static328.aClass284_2 = Static574.aClass284_4;
			} else if (local152.equals("1")) {
				Static328.aClass284_2 = Static404.aClass284_3;
			}
		}
		try {
			Static200.anInt3958 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static200.anInt3958 = 0;
		}
		Static47.aString9 = this.getParameter("quiturl");
		Static397.aString62 = this.getParameter("settings");
		if (Static397.aString62 == null) {
			Static397.aString62 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static107.anInt2202 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static107.anInt2202 = 0;
			}
		}
		Static259.anInt4808 = Integer.parseInt(this.getParameter("colourid"));
		if (Static259.anInt4808 < 0 || Static394.aColorArray3.length <= Static259.anInt4808) {
			Static259.anInt4808 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static311.aBoolean435 = true;
			Static161.aBoolean284 = true;
		}
		@Pc(234) String local234 = this.getParameter("frombilling");
		if (local234 != null && local234.equals("true")) {
			Static458.aBoolean624 = true;
		}
		Static544.aString96 = this.getParameter("sskey");
		if (Static544.aString96 != null && Static544.aString96.length() < 2) {
			Static544.aString96 = null;
		}
		@Pc(258) String local258 = this.getParameter("force64mb");
		if (local258 != null && local258.equals("true")) {
			Static57.aBoolean99 = true;
		}
		@Pc(270) String local270 = this.getParameter("worldflags");
		if (local270 != null) {
			try {
				Static55.anInt3626 = Integer.parseInt(local270);
			} catch (@Pc(277) Exception local277) {
			}
		}
		@Pc(282) String local282 = this.getParameter("userFlow");
		if (local282 != null) {
			try {
				Static15.aLong12 = Long.parseLong(local282);
			} catch (@Pc(289) NumberFormatException local289) {
			}
		}
		Static46.aString8 = this.getParameter("additionalInfo");
		if (Static46.aString8 != null && Static46.aString8.length() > 50) {
			Static46.aString8 = null;
		}
		Static413.aClient1 = this;
		if (Static574.aClass284_4 == Static328.aClass284_2) {
			Static554.anInt9119 = 503;
			Static26.anInt651 = 765;
		} else if (Static404.aClass284_3 == Static328.aClass284_2) {
			Static554.anInt9119 = 480;
			Static26.anInt651 = 640;
		}
		this.method1079(Static183.aClass360_2.method7931() + 32, Static328.aClass284_2.aString74, Static26.anInt651, Static554.anInt9119);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1082() {
		if (Static105.aBoolean199) {
			Static53.method919();
		}
		Static589.method7959();
		if (Static307.aClass100_6 != null) {
			Static307.aClass100_6.method6262();
		}
		if (Static125.aFrame1 != null) {
			Static221.method3492(Static125.aFrame1, Static356.aClass287_5);
			Static125.aFrame1 = null;
		}
		if (Static57.aClass116_1 != null) {
			Static57.aClass116_1.method2483();
			Static57.aClass116_1 = null;
		}
		Static458.method6491();
		Static42.aClass327_1.method7224();
		Static282.aClass319_2.method7077();
		if (Static12.aClass215_1 != null) {
			Static12.aClass215_1.method4966();
			Static12.aClass215_1 = null;
		}
		try {
			Static393.aClass64_5.method1192();
			for (@Pc(51) int local51 = 0; local51 < 35; local51++) {
				Static459.aClass64Array1[local51].method1192();
			}
			Static153.aClass64_2.method1192();
			Static83.aClass64_1.method1192();
		} catch (@Pc(77) Exception local77) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1077() {
		if (Static391.anInt6846 != 2) {
			this.method1097();
			return;
		}
		try {
			this.method1097();
		} catch (@Pc(15) ThreadDeath local15) {
			throw local15;
		} catch (@Pc(18) Throwable local18) {
			Static58.method946(local18.getMessage() + " (Recovered) " + this.method1076(), local18);
			Static547.method5859(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1095(@OriginalArg(1) int arg0) {
		Static417.aClass285_1 = null;
		Static42.aClass327_1.anInt8672++;
		Static42.aClass327_1.anInt8671 = arg0;
		Static81.anInt1761 = 0;
		Static459.aClass347_5 = null;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1096() {
		@Pc(23) int local23;
		if (Static201.anInt3963 == 7 && Static199.anInt3950 == 0) {
			if (Static94.anInt1996 > 1) {
				Static504.anInt8433 = Static500.anInt8403;
				Static94.anInt1996--;
			}
			if (!Static167.aBoolean291) {
				Static540.method7371();
			}
			for (local23 = 0; local23 < 100 && Static144.method2408(); local23++) {
			}
		}
		Static367.anInt6534++;
		Static120.method1777(-1, -1, null);
		Static581.method7884(null, -1, -1);
		Static82.method1279();
		Static500.anInt8403++;
		for (local23 = 0; local23 < Static31.anInt820; local23++) {
			@Pc(74) Class6_Sub1_Sub1_Sub1_Sub1 local74 = Static223.aClass2_Sub32Array1[local23].aClass6_Sub1_Sub1_Sub1_Sub1_1;
			if (local74 != null) {
				@Pc(80) byte local80 = local74.aClass86_1.aByte35;
				if ((local80 & 0x1) != 0) {
					@Pc(91) int local91 = local74.method6165();
					@Pc(115) int local115;
					if ((local80 & 0x2) != 0 && local74.anInt7424 == 0 && Math.random() * 1000.0D < 10.0D) {
						local115 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(123) int local123 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local115 != 0 || local123 != 0) {
							@Pc(137) int local137 = local115 + local74.anIntArray510[0];
							@Pc(144) int local144 = local123 + local74.anIntArray509[0];
							if (local137 < 0) {
								local137 = 0;
							} else if (Static188.anInt3850 - local91 - 1 < local137) {
								local137 = Static188.anInt3850 - local91 - 1;
							}
							if (local144 < 0) {
								local144 = 0;
							} else if (Static49.anInt1174 - local91 - 1 < local144) {
								local144 = Static49.anInt1174 - local91 - 1;
							}
							@Pc(214) int local214 = Static101.method1504(Static44.anIntArray59, local91, local74.anIntArray510[0], 0, local144, true, local91, Static495.aClass355Array1[local74.aByte112], local74.anIntArray509[0], local137, local91, Static287.anIntArray362, -1, 0);
							if (local214 > 0) {
								if (local214 > 9) {
									local214 = 9;
								}
								for (@Pc(226) int local226 = 0; local226 < local214; local226++) {
									local74.anIntArray510[local226] = Static287.anIntArray362[local214 - local226 - 1];
									local74.anIntArray509[local226] = Static44.anIntArray59[local214 - local226 - 1];
									local74.aByteArray73[local226] = 1;
								}
								local74.anInt7424 = local214;
							}
						}
					}
					Static571.method7718(true, local74);
					local115 = Static349.method5211(local74);
					Static140.method2379(local115, Static406.anInt7066, local74, Static122.anInt2385);
					Static343.method4370(local74, Static406.anInt7066);
					Static571.method7721(local74);
				}
			}
		}
		if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
			if (Static311.anInt5570 == 2) {
				Static195.method3242();
			} else {
				Static145.method2415();
			}
			if (Static90.anInt1932 >> 9 < 14 || Static188.anInt3850 - 14 <= Static90.anInt1932 >> 9 || Static7.anInt337 >> 9 < 14 || Static49.anInt1174 - 14 <= Static7.anInt337 >> 9) {
				Static502.method536();
			}
		}
		while (true) {
			@Pc(346) Class2_Sub31 local346;
			@Pc(351) Class196 local351;
			@Pc(362) Class196 local362;
			do {
				local346 = (Class2_Sub31) Static24.aClass8_1.method217();
				if (local346 == null) {
					while (true) {
						do {
							local346 = (Class2_Sub31) Static50.aClass8_4.method217();
							if (local346 == null) {
								while (true) {
									do {
										local346 = (Class2_Sub31) Static516.aClass8_60.method217();
										if (local346 == null) {
											if (Static288.aClass196_3 != null) {
												Static425.method4962();
											}
											if (Static412.anInt575 % 1500 == 0) {
												Static78.method7554();
											}
											if (Static201.anInt3963 == 7 && Static199.anInt3950 == 0) {
												Static104.method1576();
											}
											Static52.method902();
											if (Static105.aBoolean199 && Static548.method7437() - 60000L > Static207.aLong106) {
												Static53.method919();
											}
											for (@Pc(520) Class6_Sub3_Sub2 local520 = (Class6_Sub3_Sub2) Static349.aClass109_6.method2314(); local520 != null; local520 = (Class6_Sub3_Sub2) Static349.aClass109_6.method2312()) {
												if (Static548.method7437() / 1000L - 5L > (long) local520.anInt7975) {
													if (local520.aShort87 > 0) {
														Static375.method5567("", local520.aString83 + Static290.aClass198_21.method4365(Static52.anInt1264), 5, "", 0, "");
													}
													if (local520.aShort87 == 0) {
														Static375.method5567("", local520.aString83 + Static290.aClass198_22.method4365(Static52.anInt1264), 5, "", 0, "");
													}
													local520.method7989();
												}
											}
											if (Static201.anInt3963 == 7 && Static199.anInt3950 == 0) {
												if (Static57.aClass116_1 == null) {
													Static295.method7108(false);
													return;
												}
												Static354.anInt4541++;
												if (Static354.anInt4541 > 50) {
													@Pc(622) Class2_Sub42 local622 = Static249.method3910(Static320.aClass286_104, Static400.aClass145_2);
													Static531.method7296(local622);
												}
												try {
													Static550.method7463();
													return;
												} catch (@Pc(629) IOException local629) {
													Static295.method7108(false);
													return;
												}
											}
											return;
										}
										local351 = local346.aClass196_4;
										if (local351.anInt5154 < 0) {
											break;
										}
										local362 = Static117.method1748(local351.anInt5089);
									} while (local362 == null || local362.aClass196Array2 == null || local351.anInt5154 >= local362.aClass196Array2.length || local351 != local362.aClass196Array2[local351.anInt5154]);
									Static552.method7490(local346);
								}
							}
							local351 = local346.aClass196_4;
							if (local351.anInt5154 < 0) {
								break;
							}
							local362 = Static117.method1748(local351.anInt5089);
						} while (local362 == null || local362.aClass196Array2 == null || local362.aClass196Array2.length <= local351.anInt5154 || local351 != local362.aClass196Array2[local351.anInt5154]);
						Static552.method7490(local346);
					}
				}
				local351 = local346.aClass196_4;
				if (local351.anInt5154 < 0) {
					break;
				}
				local362 = Static117.method1748(local351.anInt5089);
			} while (local362 == null || local362.aClass196Array2 == null || local362.aClass196Array2.length <= local351.anInt5154 || local351 != local362.aClass196Array2[local351.anInt5154]);
			Static552.method7490(local346);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1097() {
		if (Static201.anInt3963 == 14) {
			return;
		}
		@Pc(16) long local16 = Static121.method1778() / 1000000L - Static412.aLong14;
		Static412.aLong14 = Static121.method1778() / 1000000L;
		@Pc(26) boolean local26 = Static62.method976();
		if (local26 && Static242.aBoolean363 && Static79.aClass14_1 != null) {
			Static79.aClass14_1.method5523();
		}
		if (Static298.method4512(Static201.anInt3963)) {
			if (Static62.aLong40 != 0L && Static548.method7437() > Static62.aLong40) {
				Static273.method4136(false, Static72.aClass2_Sub12_Sub1_1.anInt1924, Static72.aClass2_Sub12_Sub1_1.anInt1913, Static212.method3434());
			} else if (!Static307.aClass100_6.method6192() && Static573.aBoolean716) {
				Static594.method7991();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static125.aFrame1 == null) {
			@Pc(74) Container local74;
			if (Static593.aFrame2 != null) {
				local74 = Static593.aFrame2;
			} else if (Static562.anApplet2 == null) {
				local74 = Static509.anApplet_Sub1_1;
			} else {
				local74 = Static562.anApplet2;
			}
			local88 = local74.getSize().width;
			local92 = local74.getSize().height;
			if (local74 == Static593.aFrame2) {
				@Pc(98) Insets local98 = Static593.aFrame2.getInsets();
				local88 -= local98.left + local98.right;
				local92 -= local98.bottom + local98.top;
			}
			if (local88 != Static455.anInt7877 || local92 != Static248.anInt4654 || Static545.aBoolean684) {
				if (Static307.aClass100_6 == null || Static307.aClass100_6.method6254()) {
					Static220.method3487();
				} else {
					Static455.anInt7877 = local88;
					Static248.anInt4654 = local92;
				}
				Static62.aLong40 = Static548.method7437() + 500L;
				Static545.aBoolean684 = false;
			}
		}
		if (Static125.aFrame1 != null && !Static523.aBoolean664 && Static298.method4512(Static201.anInt3963)) {
			Static273.method4136(false, -1, -1, Static72.aClass2_Sub12_Sub1_1.anInt1908);
		}
		@Pc(170) boolean local170 = false;
		if (Static481.aBoolean644) {
			local170 = true;
			Static481.aBoolean644 = false;
		}
		if (local170) {
			Static468.method6574();
		}
		if (Static307.aClass100_6 != null && Static307.aClass100_6.method6192() || Static212.method3434() != 1) {
			Static139.method2348();
		}
		if (Static98.method1487(Static201.anInt3963)) {
			Static29.method540(local170);
		} else if (Static593.method7986(Static201.anInt3963)) {
			Static480.method6787();
		} else if (Static264.method4067(Static201.anInt3963)) {
			Static480.method6787();
		} else if (Static338.method5154(Static201.anInt3963)) {
			if (Static125.anInt2405 == 1) {
				if (Static91.anInt1973 > Static523.anInt8625) {
					Static523.anInt8625 = Static91.anInt1973;
				}
				local88 = (Static523.anInt8625 - Static91.anInt1973) * 50 / Static523.anInt8625;
				Static458.method6493(Static307.aClass100_6, true, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_14.method4365(Static52.anInt1264) + "<br>(" + local88 + "%)");
			} else if (Static125.anInt2405 == 2) {
				if (Static233.anInt4345 < Static414.anInt9338) {
					Static233.anInt4345 = Static414.anInt9338;
				}
				local88 = (Static233.anInt4345 - Static414.anInt9338) * 50 / Static233.anInt4345 + 50;
				Static458.method6493(Static307.aClass100_6, true, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_14.method4365(Static52.anInt1264) + "<br>(" + local88 + "%)");
			} else {
				Static458.method6493(Static307.aClass100_6, true, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_14.method4365(Static52.anInt1264));
			}
		} else if (Static201.anInt3963 == 10) {
			Static302.method4548(local16);
		} else if (Static201.anInt3963 == 13) {
			Static458.method6493(Static307.aClass100_6, false, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_16.method4365(Static52.anInt1264) + "<br>" + Static290.aClass198_17.method4365(Static52.anInt1264));
		}
		if (Static318.anInt5934 == 3) {
			for (local88 = 0; local88 < Static451.anInt488; local88++) {
				@Pc(368) Rectangle local368 = Class230.aRectangleArray1[local88];
				if (Static493.aBooleanArray35[local88]) {
					Static307.aClass100_6.method6261(-1996553985, local368.x, local368.y, local368.height, local368.width);
				} else if (Static64.aBooleanArray5[local88]) {
					Static307.aClass100_6.method6261(-1996554240, local368.x, local368.y, local368.height, local368.width);
				}
			}
		}
		if (Static462.method6517()) {
			Static66.method7180(Static307.aClass100_6);
		}
		if (Static356.aClass287_5.aBoolean628 && Static298.method4512(Static201.anInt3963) && Static318.anInt5934 == 0 && Static212.method3434() == 1 && !local170) {
			local88 = 0;
			for (local92 = 0; local92 < Static451.anInt488; local92++) {
				if (Static64.aBooleanArray5[local92]) {
					Static64.aBooleanArray5[local92] = false;
					Static367.aRectangleArray2[local88++] = Class230.aRectangleArray1[local92];
				}
			}
			try {
				Static307.aClass100_6.method6202(Static367.aRectangleArray2, local88);
			} catch (@Pc(520) Exception_Sub1 local520) {
			}
		} else if (!Static98.method1487(Static201.anInt3963)) {
			for (local88 = 0; local88 < Static451.anInt488; local88++) {
				Static64.aBooleanArray5[local88] = false;
			}
			try {
				Static307.aClass100_6.method6238();
			} catch (@Pc(464) Exception_Sub1 local464) {
				Static58.method946(local464.getMessage() + " (Recovered) " + this.method1076(), local464);
				Static547.method5859(0);
			}
		}
		if (Static72.aClass2_Sub12_Sub1_1.anInt1909 == 0) {
			Static459.method6498(15L);
		} else if (Static72.aClass2_Sub12_Sub1_1.anInt1909 == 1) {
			Static459.method6498(10L);
		} else if (Static72.aClass2_Sub12_Sub1_1.anInt1909 == 2) {
			Static459.method6498(5L);
		} else if (Static72.aClass2_Sub12_Sub1_1.anInt1909 == 3) {
			Static459.method6498(2L);
		}
		if (Static441.aBoolean613) {
			Static216.method3475();
		}
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean158 && Static201.anInt3963 == 3 && Static554.anInt9121 != -1) {
			Static72.aClass2_Sub12_Sub1_1.aBoolean158 = false;
			Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1076() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static35.anInt906 + "," + Static130.anInt5246 + "," + Static188.anInt3850 + "," + Static49.anInt1174 + "|";
			if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 != null) {
				local7 = local7 + "2)" + Static566.anInt9278 + "," + (Static35.anInt906 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0]) + "," + (Static130.anInt5246 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0]) + "|";
			}
			local7 = local7 + "3)" + Static391.anInt6846 + "|4)" + Static72.aClass2_Sub12_Sub1_1.anInt1927 + "|5)" + Static212.method3434() + "|6)" + Static140.anInt2937 + "," + Static120.anInt2371 + "|";
			local7 = local7 + "7)" + Static72.aClass2_Sub12_Sub1_1.method1408(Static391.anInt6846) + "|";
			local7 = local7 + "8)" + Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846) + "|";
			local7 = local7 + "9)" + Static72.aClass2_Sub12_Sub1_1.aBoolean163 + "|";
			local7 = local7 + "10)" + Static72.aClass2_Sub12_Sub1_1.aBoolean150 + "|";
			local7 = local7 + "11)" + Static72.aClass2_Sub12_Sub1_1.aBoolean168 + "|";
			local7 = local7 + "12)" + Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846) + "|";
			local7 = local7 + "13)" + Static440.anInt7756 + "|";
			local7 = local7 + "14)" + Static201.anInt3963;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static391.anInt6846 == 2) {
					@Pc(233) Class local233 = Class.forName("java.lang.ClassLoader");
					@Pc(237) Field local237 = local233.getDeclaredField("nativeLibraries");
					@Pc(240) Class local240 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(250) Method local250 = local240.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local250.invoke(local237, Boolean.TRUE);
					@Pc(273) Vector local273 = (Vector) local237.get(client.class.getClassLoader());
					for (@Pc(275) int local275 = 0; local275 < local273.size(); local275++) {
						try {
							@Pc(281) Object local281 = local273.elementAt(local275);
							@Pc(286) Field local286 = local281.getClass().getDeclaredField("name");
							local250.invoke(local286, Boolean.TRUE);
							try {
								@Pc(301) String local301 = (String) local286.get(local281);
								if (local301 != null && local301.indexOf("sw3d.dll") != -1) {
									@Pc(314) Field local314 = local281.getClass().getDeclaredField("handle");
									local250.invoke(local314, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local314.getLong(local281));
									local250.invoke(local314, Boolean.FALSE);
								}
							} catch (@Pc(350) Throwable local350) {
							}
							local250.invoke(local286, Boolean.FALSE);
						} catch (@Pc(362) Throwable local362) {
						}
					}
				}
			} catch (@Pc(370) Throwable local370) {
			}
			local7 = local7 + "]";
		} catch (@Pc(381) Throwable local381) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1078() {
		if (Static391.anInt6846 != 2) {
			this.method1085();
			return;
		}
		try {
			this.method1085();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static58.method946(local22.getMessage() + " (Recovered) " + this.method1076(), local22);
			Static547.method5859(0);
		}
	}
}
