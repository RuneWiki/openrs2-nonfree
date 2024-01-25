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

	static {
		new Class158("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static38.method740("Argument count");
			}
			Static156.aClass35_8 = new Class35();
			Static156.aClass35_8.anInt1006 = Integer.parseInt(arg0[0]);
			Static283.aClass35_11 = new Class35();
			Static283.aClass35_11.anInt1006 = Integer.parseInt(arg0[1]);
			Static214.aClass35_16 = new Class35();
			Static214.aClass35_16.anInt1006 = Integer.parseInt(arg0[2]);
			Static314.aClass248_7 = Static366.aClass248_8;
			if (arg0[3].equals("live")) {
				Static262.aClass256_6 = Static319.aClass256_5;
			} else if (arg0[3].equals("rc")) {
				Static262.aClass256_6 = Static303.aClass256_7;
			} else if (arg0[3].equals("wip")) {
				Static262.aClass256_6 = Static66.aClass256_3;
			} else {
				Static38.method740("modewhat");
			}
			Static365.anInt6682 = Static222.method3441(arg0[4]);
			if (Static365.anInt6682 == -1) {
				if (arg0[4].equals("english")) {
					Static365.anInt6682 = 0;
				} else if (arg0[4].equals("german")) {
					Static365.anInt6682 = 1;
				} else {
					Static38.method740("language");
				}
			}
			Static316.aBoolean374 = false;
			Static352.aBoolean417 = false;
			if (arg0[5].equals("game0")) {
				Static268.aClass272_4 = Static181.aClass272_2;
			} else if (arg0[5].equals("game1")) {
				Static268.aClass272_4 = Static266.aClass272_3;
			} else {
				Static38.method740("game");
			}
			Static218.aBoolean269 = true;
			Static346.aBoolean406 = true;
			Static263.anInt5071 = Static268.aClass272_4.anInt7964;
			Static284.anInt3192 = 0;
			Static2.anInt47 = 0;
			Static404.aBoolean347 = false;
			Static325.aString57 = "";
			@Pc(155) client local155 = new client();
			Static271.aClient1 = local155;
			local155.method1045(Static268.aClass272_4.aString67, Static262.aClass256_6.method5764() + 32);
			Static416.aFrame3.setLocation(40, 40);
		} catch (@Pc(178) Exception local178) {
			Static247.method3669(null, local178);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1047() {
		if (Static170.anInt3494 == 13) {
			return;
		}
		Static187.anInt3975++;
		if (Static187.anInt3975 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static315.anInt5900 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static398.aRandom1.setSeed((long) Static315.anInt5900);
		}
		if (Static187.anInt3975 % 50 == 0) {
			Static137.anInt3044 = Static339.anInt6203;
			Static223.anInt4458 = Static56.anInt1515;
			Static339.anInt6203 = 0;
			Static56.anInt1515 = 0;
		}
		this.method1058();
		if (Static88.aClass162_1 != null) {
			Static88.aClass162_1.method3637();
		}
		Static135.method2223();
		Static414.aClass48_1.method1121();
		Static336.aClass87_1.method1910();
		if (Static73.aClass22_1 != null) {
			@Pc(83) int local83 = Static73.aClass22_1.method509();
			Static24.anInt605 = local83;
		}
		if (Static30.aClass106_3 != null) {
			Static30.aClass106_3.method5976((int) Static250.method3737());
		}
		Static181.method3046();
		Static119.anInt2647 = 0;
		for (@Pc(100) Class113 local100 = Static414.aClass48_1.method1118(); local100 != null && Static119.anInt2647 < 128; local100 = Static414.aClass48_1.method1118()) {
			if (local100.method5054() != 1) {
				@Pc(111) char local111 = local100.method5049();
				if (!Static313.method4480() || local111 != '`' && local111 != '§') {
					Static400.aClass113Array1[Static119.anInt2647] = local100;
					Static119.anInt2647++;
				} else if (Static52.method975()) {
					Static233.method3559();
				} else {
					Static44.method4575();
				}
			}
		}
		for (@Pc(158) Class1_Sub25 local158 = Static336.aClass87_1.method1911(); local158 != null; local158 = Static336.aClass87_1.method1911()) {
			@Pc(164) int local164 = local158.method3350();
			if (local164 == -1) {
				Static389.aClass203_45.method4551(local158);
			} else if (Static232.method3533(local164)) {
				Static341.aClass203_43.method4551(local158);
			}
			if (Static341.aClass203_43.method4552() > 10) {
				Static341.aClass203_43.method4549();
			}
		}
		if (Static52.method975()) {
			Static381.method5711();
		}
		if (Static170.anInt3494 == 0) {
			this.method1055();
			Static435.method5864();
		} else if (Static170.anInt3494 == 1) {
			this.method1055();
			Static435.method5864();
		} else if (Static198.method6177(Static170.anInt3494)) {
			Static325.method4626();
		}
		if (Static129.method2126(Static170.anInt3494) && !Static198.method6177(Static170.anInt3494)) {
			this.method1065();
			Static221.method3431();
			Static70.method1342();
		} else if (Static91.method1566(Static170.anInt3494) && !Static198.method6177(Static170.anInt3494)) {
			this.method1065();
			Static70.method1342();
		} else if (Static170.anInt3494 == 11) {
			Static70.method1342();
		} else if (Static100.method1714(Static170.anInt3494) && !Static198.method6177(Static170.anInt3494)) {
			Static369.method5150();
		} else if (Static170.anInt3494 == 12) {
			Static70.method1342();
			if (Static168.anInt1709 != -3 && Static168.anInt1709 != 2 && Static168.anInt1709 != 15) {
				Static162.method2668(false);
			}
		}
		Static94.method1630(Static30.aClass106_3);
		Static341.aClass203_43.method4549();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1042() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1039() {
		try {
			this.method1047();
		} catch (@Pc(16) OutOfMemoryError local16) {
			if (local16.getMessage() == null || !local16.getMessage().startsWith("native")) {
				throw local16;
			}
			Static197.method3166(0);
			Static247.method3669(local16.getMessage() + " (Recovered) " + this.method1032(), local16);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	protected String method1032() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static278.anInt5374 + "," + Static380.anInt6896 + "," + Static209.anInt4283 + "," + Static211.anInt4295 + "|";
			if (Static429.aClass30_Sub1_Sub1_Sub2_2 != null) {
				local5 = local5 + "2)" + Static426.anInt1486 + "," + (Static278.anInt5374 + Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0]) + "," + (Static380.anInt6896 + Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0]) + "|";
			}
			local5 = local5 + "3)" + Static262.anInt2805 + "|4)" + Static12.aClass34_Sub1_1.anInt7161 + "|5)" + Static86.method1531() + "|6)" + Static152.anInt3234 + "," + Static342.anInt6292 + "|";
			local5 = local5 + "7)" + Static12.aClass34_Sub1_1.method5466(Static262.anInt2805) + "|";
			local5 = local5 + "8)" + Static12.aClass34_Sub1_1.method5462(Static262.anInt2805) + "|";
			local5 = local5 + "9)" + Static12.aClass34_Sub1_1.aBoolean451 + "|";
			local5 = local5 + "10)" + Static12.aClass34_Sub1_1.aBoolean458 + "|";
			local5 = local5 + "11)" + Static12.aClass34_Sub1_1.aBoolean453 + "|";
			local5 = local5 + "12)" + Static12.aClass34_Sub1_1.method5471(Static262.anInt2805) + "|";
			local5 = local5 + "13)" + Static155.anInt3339 + "|";
			local5 = local5 + "14)" + Static170.anInt3494;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(226) Throwable local226) {
			}
			local5 = local5 + "]";
		} catch (@Pc(237) Throwable local237) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1052() {
		if (Static170.anInt3494 == 13) {
			return;
		}
		@Pc(23) long local23 = Static328.method4657() / 1000000L - Static36.aLong204;
		Static36.aLong204 = Static328.method4657() / 1000000L;
		@Pc(31) boolean local31 = Static346.method4898();
		if (local31 && Static180.aBoolean240 && Static193.aClass31_2 != null) {
			Static193.aClass31_2.method2018();
		}
		if (Static361.method5080(Static170.anInt3494)) {
			if (Static435.aLong217 != 0L && Static435.aLong217 < Static250.method3737()) {
				Static230.method3513(Static12.aClass34_Sub1_1.anInt7164, Static86.method1531(), false, Static12.aClass34_Sub1_1.anInt7158);
			} else if (!Static30.aClass106_3.method5942() && Static116.aBoolean168) {
				Static175.method2964();
			}
		}
		@Pc(86) int local86;
		@Pc(90) int local90;
		if (Static93.aFrame2 == null) {
			@Pc(78) Container local78;
			if (Static416.aFrame3 == null) {
				local78 = Static150.aClass183_3.anApplet1;
			} else {
				local78 = Static416.aFrame3;
			}
			local86 = local78.getSize().width;
			local90 = local78.getSize().height;
			if (Static416.aFrame3 == local78) {
				@Pc(96) Insets local96 = Static416.aFrame3.getInsets();
				local86 -= local96.right + local96.left;
				local90 -= local96.bottom + local96.top;
			}
			if (Static134.anInt2979 != local86 || local90 != Static270.anInt5255) {
				if (Static30.aClass106_3 == null || Static30.aClass106_3.method5925()) {
					Static262.method2062();
				} else {
					Static270.anInt5255 = local90;
					Static134.anInt2979 = local86;
				}
				Static435.aLong217 = Static250.method3737() + 500L;
			}
		}
		if (Static93.aFrame2 != null && !Static266.aBoolean321 && Static361.method5080(Static170.anInt3494)) {
			Static230.method3513(-1, Static12.aClass34_Sub1_1.anInt7174, false, -1);
		}
		@Pc(157) boolean local157 = false;
		if (Static274.aBoolean331) {
			local157 = true;
			Static274.aBoolean331 = false;
		}
		if (local157) {
			Static57.method1073();
		}
		if (Static30.aClass106_3 != null && Static30.aClass106_3.method5942() || Static86.method1531() != 1) {
			Static179.method3014();
		}
		if (Static170.anInt3494 == 0) {
			Static390.method5426(Static50.anInt1224, Static330.aColorArray2[Static263.anInt5071], Static405.aColorArray3[Static263.anInt5071], Static70.aColorArray1[Static263.anInt5071], Static389.aString61, local157);
		} else if (Static170.anInt3494 == 1) {
			Static188.method3081(Static13.aClass20_2, Static30.aClass106_3, Static30.aClass106_3.method5942() | local157, Static70.aColorArray1[Static263.anInt5071].getRGB(), Static330.aColorArray2[Static263.anInt5071].getRGB(), Static405.aColorArray3[Static263.anInt5071].getRGB());
		} else if (Static61.method1142(Static170.anInt3494)) {
			Static69.method1332();
		} else if (Static439.method5902(Static170.anInt3494)) {
			Static69.method1332();
		} else if (Static198.method6177(Static170.anInt3494)) {
			if (Static368.anInt6726 == 1) {
				if (Static26.anInt653 > Static16.anInt376) {
					Static16.anInt376 = Static26.anInt653;
				}
				local86 = (Static16.anInt376 - Static26.anInt653) * 50 / Static16.anInt376;
				Static338.method5238(true, Static374.aClass158_147.method3594(Static365.anInt6682) + "<br>(" + local86 + "%)", Static308.aClass20_5);
			} else if (Static368.anInt6726 == 2) {
				if (Static169.anInt3489 > Static291.anInt7491) {
					Static291.anInt7491 = Static169.anInt3489;
				}
				local86 = (Static291.anInt7491 - Static169.anInt3489) * 50 / Static291.anInt7491 + 50;
				Static338.method5238(true, Static374.aClass158_147.method3594(Static365.anInt6682) + "<br>(" + local86 + "%)", Static308.aClass20_5);
			} else {
				Static338.method5238(true, Static374.aClass158_147.method3594(Static365.anInt6682), Static308.aClass20_5);
			}
		} else if (Static170.anInt3494 == 9) {
			Static393.method5440(local23);
		} else if (Static170.anInt3494 == 12) {
			Static338.method5238(true, Static51.aClass158_28.method3594(Static365.anInt6682) + "<br>" + Static158.aClass158_90.method3594(Static365.anInt6682), Static308.aClass20_5);
		}
		if (Static213.anInt3960 == 3) {
			for (local86 = 0; local86 < Static316.anInt5918; local86++) {
				@Pc(379) Rectangle local379 = Class30_Sub1_Sub1_Sub2.aRectangleArray2[local86];
				if (Static69.aBooleanArray10[local86]) {
					Static30.aClass106_3.method5941(local379.y, local379.width, local379.x, local379.height, -1996553985);
				} else if (Static55.aBooleanArray7[local86]) {
					Static30.aClass106_3.method5941(local379.y, local379.width, local379.x, local379.height, -1996554240);
				}
			}
		}
		if (Static52.method975()) {
			Static60.method1122(Static30.aClass106_3);
		}
		if (Static361.method5080(Static170.anInt3494) && Static213.anInt3960 == 0 && Static86.method1531() == 1 && !local157 && Static282.aString44.equals("1.1")) {
			local86 = 0;
			for (local90 = 0; local90 < Static316.anInt5918; local90++) {
				if (Static55.aBooleanArray7[local90]) {
					Static55.aBooleanArray7[local90] = false;
					Static12.aRectangleArray1[local86++] = Class30_Sub1_Sub1_Sub2.aRectangleArray2[local90];
				}
			}
			Static30.aClass106_3.method5946(Static12.aRectangleArray1, local86);
		} else if (Static170.anInt3494 != 0) {
			Static30.aClass106_3.method5977();
			for (local86 = 0; local86 < Static316.anInt5918; local86++) {
				Static55.aBooleanArray7[local86] = false;
			}
		}
		if (Static12.aClass34_Sub1_1.anInt7171 == 0) {
			Static289.method4249(15L);
		} else if (Static12.aClass34_Sub1_1.anInt7171 == 1) {
			Static289.method4249(10L);
		} else if (Static12.aClass34_Sub1_1.anInt7171 == 2) {
			Static289.method4249(5L);
		} else if (Static12.aClass34_Sub1_1.anInt7171 == 3) {
			Static289.method4249(2L);
		}
		if (Static427.aBoolean488) {
			Static115.method1868();
		}
		if (Static12.aClass34_Sub1_1.aBoolean445 && Static170.anInt3494 == 2 && Static456.anInt1594 != -1) {
			Static12.aClass34_Sub1_1.aBoolean445 = false;
			Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1033() {
		try {
			this.method1052();
		} catch (@Pc(8) OutOfMemoryError local8) {
			if (local8.getMessage() == null || !local8.getMessage().startsWith("native")) {
				throw local8;
			}
			Static197.method3166(0);
			Static247.method3669(local8.getMessage() + " (Recovered) " + this.method1032(), local8);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1054() {
		if (Static175.aClass159_2.anInt4705 > Static352.anInt6563) {
			Static156.aClass35_9.aBoolean65 = !Static156.aClass35_9.aBoolean65;
			Static316.anInt5912 = (Static175.aClass159_2.anInt4705 * 50 - 50) * 5;
			if (Static316.anInt5912 > 3000) {
				Static316.anInt5912 = 3000;
			}
			if (Static175.aClass159_2.anInt4705 >= 2 && Static175.aClass159_2.anInt4704 == 6) {
				this.method1041("js5connect_outofdate");
				Static170.anInt3494 = 13;
				return;
			}
			if (Static175.aClass159_2.anInt4705 >= 4 && Static175.aClass159_2.anInt4704 == -1) {
				this.method1041("js5crc");
				Static170.anInt3494 = 13;
				return;
			}
			if (Static175.aClass159_2.anInt4705 >= 4 && Static56.method1069(Static170.anInt3494)) {
				if (Static175.aClass159_2.anInt4704 == 7 || Static175.aClass159_2.anInt4704 == 9) {
					this.method1041("js5connect_full");
				} else if (Static175.aClass159_2.anInt4704 > 0) {
					this.method1041("js5connect");
				} else {
					this.method1041("js5io");
				}
				Static170.anInt3494 = 13;
				return;
			}
		}
		Static352.anInt6563 = Static175.aClass159_2.anInt4705;
		if (Static316.anInt5912 > 0) {
			Static316.anInt5912--;
			return;
		}
		try {
			if (Static260.anInt5044 == 0) {
				Static57.aClass157_1 = Static150.aClass183_3.method4154(Static156.aClass35_9.method735(), Static156.aClass35_9.aString6);
				Static260.anInt5044++;
			}
			if (Static260.anInt5044 == 1) {
				if (Static57.aClass157_1.anInt4667 == 2) {
					this.method1056(1000);
					return;
				}
				if (Static57.aClass157_1.anInt4667 == 1) {
					Static260.anInt5044++;
				}
			}
			if (Static260.anInt5044 == 2) {
				Static214.aClass236_15 = new Class236((Socket) Static57.aClass157_1.anObject13, Static150.aClass183_3);
				@Pc(185) Class1_Sub3 local185 = new Class1_Sub3(5);
				local185.method1208(Static168.aClass247_26.anInt7273);
				local185.method1197(598);
				Static214.aClass236_15.method5227(5, local185.aByteArray14);
				Static260.anInt5044++;
				Static324.aLong206 = Static250.method3737();
			}
			if (Static260.anInt5044 == 3) {
				if (Static56.method1069(Static170.anInt3494) || Static214.aClass236_15.method5235() > 0) {
					@Pc(243) int local243 = Static214.aClass236_15.method5231();
					if (local243 != 0) {
						this.method1056(local243);
						return;
					}
					Static260.anInt5044++;
				} else if (Static250.method3737() - Static324.aLong206 > 30000L) {
					this.method1056(1001);
					return;
				}
			}
			if (Static260.anInt5044 == 4) {
				@Pc(276) boolean local276 = Static170.anInt3494 == 1 || Static129.method2126(Static170.anInt3494) || Static91.method1566(Static170.anInt3494);
				Static175.aClass159_2.method3612(Static214.aClass236_15, !local276);
				Static214.aClass236_15 = null;
				Static260.anInt5044 = 0;
				Static57.aClass157_1 = null;
			}
		} catch (@Pc(298) IOException local298) {
			this.method1056(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1055() {
		@Pc(6) int local6;
		if (!Static12.aClass34_Sub1_1.aBoolean445) {
			for (local6 = 0; local6 < Static119.anInt2647; local6++) {
				if (Static400.aClass113Array1[local6].method5049() == 's' || Static400.aClass113Array1[local6].method5049() == 'S') {
					Static12.aClass34_Sub1_1.aBoolean445 = true;
					break;
				}
			}
		}
		@Pc(64) int local64;
		if (Static64.anInt1730 == 0) {
			@Pc(55) Runtime local55 = Runtime.getRuntime();
			local64 = (int) ((local55.totalMemory() - local55.freeMemory()) / 1024L);
			@Pc(67) long local67 = Static250.method3737();
			if (Static179.aLong106 == 0L) {
				Static179.aLong106 = local67;
			}
			if (local64 > 16384 && local67 - Static179.aLong106 < 5000L) {
				if (local67 - Static93.aLong187 > 1000L) {
					System.gc();
					Static93.aLong187 = local67;
				}
				Static389.aString61 = Static194.aClass158_106.method3594(Static365.anInt6682);
				Static50.anInt1224 = 5;
			} else {
				Static389.aString61 = Static42.aClass158_22.method3594(Static365.anInt6682);
				Static50.anInt1224 = 5;
				Static64.anInt1730 = 10;
			}
		} else if (Static64.anInt1730 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static19.aClass120Array1[local6] = Static368.method5121(Static209.anInt4283, Static211.anInt4295);
			}
			Static389.aString61 = Static103.aClass158_57.method3594(Static365.anInt6682);
			Static50.anInt1224 = 10;
			Static64.anInt1730 = 20;
		} else if (Static64.anInt1730 == 20) {
			if (Static88.aClass162_1 == null) {
				Static88.aClass162_1 = new Class162(Static175.aClass159_2, Static253.aClass58_3);
			}
			if (Static88.aClass162_1.method3639()) {
				Static382.aClass211_77 = Static294.method4270(true, false, 0);
				Static383.aClass211_79 = Static294.method4270(true, false, 1);
				Static37.aClass211_13 = Static294.method4270(true, false, 2);
				Static126.aClass211_34 = Static294.method4270(true, false, 3);
				Static125.aClass211_33 = Static294.method4270(true, false, 4);
				Static136.aClass211_36 = Static294.method4270(true, true, 5);
				Static362.aClass211_75 = Static294.method4270(false, true, 6);
				Static227.aClass211_59 = Static294.method4270(true, false, 7);
				Static140.aClass211_38 = Static294.method4270(true, false, 8);
				Static166.aClass211_43 = Static294.method4270(true, false, 9);
				Static192.aClass211_49 = Static294.method4270(true, false, 10);
				Static238.aClass211_60 = Static294.method4270(true, false, 11);
				Static10.aClass211_91 = Static294.method4270(true, false, 12);
				Static24.aClass211_8 = Static294.method4270(true, false, 13);
				Static68.aClass211_20 = Static294.method4270(false, false, 14);
				Static112.aClass211_31 = Static294.method4270(true, false, 15);
				Static386.aClass211_80 = Static294.method4270(true, false, 16);
				Static140.aClass211_37 = Static294.method4270(true, false, 17);
				Static65.aClass211_19 = Static294.method4270(true, false, 18);
				Static355.aClass211_74 = Static294.method4270(true, false, 19);
				Static136.aClass211_35 = Static294.method4270(true, false, 20);
				Static437.aClass211_88 = Static294.method4270(true, false, 21);
				Static173.aClass211_46 = Static294.method4270(true, false, 22);
				Static263.aClass211_69 = Static294.method4270(true, true, 23);
				Static152.aClass211_40 = Static294.method4270(true, false, 24);
				Static216.aClass211_56 = Static294.method4270(true, false, 25);
				Static6.aClass211_2 = Static294.method4270(true, true, 26);
				Static193.aClass211_50 = Static294.method4270(true, false, 27);
				Static382.aClass211_78 = Static294.method4270(true, true, 28);
				Static114.aClass211_32 = Static294.method4270(true, false, 29);
				Static389.aString61 = Static236.aClass158_123.method3594(Static365.anInt6682);
				Static50.anInt1224 = 15;
				Static64.anInt1730 = 30;
			} else {
				Static389.aString61 = Static460.aClass158_149.method3594(Static365.anInt6682);
				Static50.anInt1224 = 12;
			}
		} else if (Static64.anInt1730 == 30) {
			local6 = 0;
			for (local64 = 0; local64 < 30; local64++) {
				local6 += Static304.aClass111_Sub1Array2[local64].method2680() * Static143.anIntArray324[local64] / 100;
			}
			if (local6 == 100) {
				Static389.aString61 = Static326.aClass158_159.method3594(Static365.anInt6682);
				Static50.anInt1224 = 20;
				Static343.method4839(Static140.aClass211_38);
				Static286.method4187(Static140.aClass211_38);
				Static64.anInt1730 = 40;
			} else {
				if (local6 != 0) {
					Static389.aString61 = Static180.aClass158_100.method3594(Static365.anInt6682) + local6 + "%";
				}
				Static50.anInt1224 = 20;
			}
		} else if (Static64.anInt1730 == 40) {
			if (Static382.aClass211_78.method4745()) {
				this.method1060(Static382.aClass211_78.method4774(1));
				Static389.aString61 = Static420.aClass158_110.method3594(Static365.anInt6682);
				Static64.anInt1730 = 50;
				Static50.anInt1224 = 25;
			} else {
				Static389.aString61 = Static383.aClass158_183.method3594(Static365.anInt6682) + Static382.aClass211_78.method4756() + "%";
				Static50.anInt1224 = 25;
			}
		} else if (Static64.anInt1730 == 50) {
			Static458.method6183();
			Static389.aString61 = Static413.aClass158_195.method3594(Static365.anInt6682);
			Static50.anInt1224 = 30;
			Static64.anInt1730 = 60;
		} else if (Static64.anInt1730 == 60) {
			local6 = Static278.method4105(Static24.aClass211_8, Static140.aClass211_38);
			local64 = Static118.method2012();
			if (local6 < local64) {
				Static389.aString61 = Static68.aClass158_40.method3594(Static365.anInt6682) + local6 * 100 / local64 + "%";
				Static50.anInt1224 = 35;
			} else {
				Static389.aString61 = Static126.aClass158_70.method3594(Static365.anInt6682);
				Static64.anInt1730 = 70;
				Static50.anInt1224 = 35;
			}
		} else if (Static64.anInt1730 == 70) {
			local6 = Static324.method5502(Static140.aClass211_38);
			local64 = Static413.method5602();
			if (local64 > local6) {
				Static389.aString61 = Static107.aClass158_59.method3594(Static365.anInt6682) + local6 * 100 / local64 + "%";
				Static50.anInt1224 = 40;
			} else {
				Static389.aString61 = Static224.aClass158_184.method3594(Static365.anInt6682);
				Static64.anInt1730 = 80;
				Static50.anInt1224 = 40;
			}
		} else if (Static64.anInt1730 == 80) {
			if (Static6.aClass211_2.method4745()) {
				Static284.anInterface7_4 = new Class6(Static6.aClass211_2, Static166.aClass211_43, Static140.aClass211_38);
				Static389.aString61 = Static238.aClass158_124.method3594(Static365.anInt6682);
				Static64.anInt1730 = 90;
				Static50.anInt1224 = 45;
			} else {
				Static389.aString61 = Static338.aClass158_180.method3594(Static365.anInt6682) + Static6.aClass211_2.method4756() + "%";
				Static50.anInt1224 = 45;
			}
		} else if (Static64.anInt1730 == 90) {
			Static389.aString61 = Static102.aClass158_56.method3594(Static365.anInt6682);
			Static50.anInt1224 = 50;
			Static64.anInt1730 = 95;
		} else if (Static64.anInt1730 == 95) {
			if (Static12.aClass34_Sub1_1.aBoolean445) {
				Static12.aClass34_Sub1_1.anInt7161 = 0;
				Static12.aClass34_Sub1_1.anInt7162 = 0;
				Static12.aClass34_Sub1_1.anInt7176 = 0;
				Static12.aClass34_Sub1_1.anInt7174 = 1;
				Static12.aClass34_Sub1_1.anInt7165 = 0;
			}
			Static12.aClass34_Sub1_1.aBoolean445 = true;
			Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
			Static92.method1587(false, Static12.aClass34_Sub1_1.anInt7162);
			Static389.aString61 = Static353.aClass158_199.method3594(Static365.anInt6682);
			Static50.anInt1224 = 55;
			Static64.anInt1730 = 100;
		} else if (Static64.anInt1730 == 100) {
			Static259.method3824(Static140.aClass211_38, Static24.aClass211_8, Static30.aClass106_3);
			Static389.aString61 = Static113.aClass158_65.method3594(Static365.anInt6682);
			Static50.anInt1224 = 60;
			Static118.method2017(1);
			Static64.anInt1730 = 110;
		} else if (Static64.anInt1730 == 110) {
			Static37.aClass211_13.method4745();
			local6 = Static37.aClass211_13.method4756();
			Static386.aClass211_80.method4745();
			local6 += Static386.aClass211_80.method4756();
			Static140.aClass211_37.method4745();
			local6 += Static140.aClass211_37.method4756();
			Static65.aClass211_19.method4745();
			local6 += Static65.aClass211_19.method4756();
			Static355.aClass211_74.method4745();
			local6 += Static355.aClass211_74.method4756();
			Static136.aClass211_35.method4745();
			local6 += Static136.aClass211_35.method4756();
			Static437.aClass211_88.method4745();
			local6 += Static437.aClass211_88.method4756();
			Static173.aClass211_46.method4745();
			local6 += Static173.aClass211_46.method4756();
			Static152.aClass211_40.method4745();
			local6 += Static152.aClass211_40.method4756();
			Static216.aClass211_56.method4745();
			local6 += Static216.aClass211_56.method4756();
			Static193.aClass211_50.method4745();
			local6 += Static193.aClass211_50.method4756();
			Static114.aClass211_32.method4745();
			local6 += Static114.aClass211_32.method4756();
			if (local6 < 1200) {
				Static389.aString61 = Static63.aClass158_35.method3594(Static365.anInt6682) + local6 / 12 + "%";
				Static50.anInt1224 = 65;
			} else {
				Static53.aClass32_1 = new Class32(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static241.aClass258_1 = new Class258(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static60.aClass133_1 = new Class133(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13, Static140.aClass211_38);
				Static118.aClass145_3 = new Class145(Static268.aClass272_4, Static365.anInt6682, Static140.aClass211_37);
				Static365.aClass251_6 = new Class251(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static331.aClass191_5 = new Class191(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static19.aClass143_1 = new Class143(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13, Static227.aClass211_59);
				Static430.aClass174_24 = new Class174(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static447.aClass270_1 = new Class270(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static455.aClass161_4 = new Class161(Static268.aClass272_4, Static365.anInt6682, true, Static386.aClass211_80, Static227.aClass211_59);
				Static163.aClass170_2 = new Class170(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13, Static140.aClass211_38);
				Static420.aClass84_2 = new Class84(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13, Static140.aClass211_38);
				Static300.aClass44_2 = new Class44(Static268.aClass272_4, Static365.anInt6682, true, Static65.aClass211_19, Static227.aClass211_59);
				Static43.aClass57_1 = new Class57(Static268.aClass272_4, Static365.anInt6682, true, Static53.aClass32_1, Static355.aClass211_74, Static227.aClass211_59);
				Static201.aClass5_1 = new Class5(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static107.aClass239_1 = new Class239(Static268.aClass272_4, Static365.anInt6682, Static136.aClass211_35, Static382.aClass211_77, Static383.aClass211_79);
				Static106.aClass53_1 = new Class53(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static100.aClass42_1 = new Class42(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static145.aClass63_1 = new Class63(Static268.aClass272_4, Static365.anInt6682, Static437.aClass211_88, Static227.aClass211_59);
				Static257.aClass115_1 = new Class115(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static241.aClass250_1 = new Class250(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static344.aClass56_1 = new Class56(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static303.aClass152_1 = new Class152(Static268.aClass272_4, Static365.anInt6682, Static173.aClass211_46);
				Static204.aClass46_1 = new Class46(Static268.aClass272_4, Static365.anInt6682, Static37.aClass211_13);
				Static179.method3013(Static24.aClass211_8, Static227.aClass211_59, Static126.aClass211_34, Static140.aClass211_38);
				Static193.method3129(Static114.aClass211_32);
				Static157.aClass79_1 = new Class79(Static365.anInt6682, Static152.aClass211_40, Static216.aClass211_56);
				Static439.aClass127_2 = new Class127(Static365.anInt6682, Static152.aClass211_40, Static216.aClass211_56, new Class197());
				Static389.aString61 = Static288.aClass158_142.method3594(Static365.anInt6682);
				Static50.anInt1224 = 65;
				Static301.method4359();
				Static455.aClass161_4.method3630(!Static12.aClass34_Sub1_1.method5471(Static262.anInt2805));
				Static366.aClass190_1 = new Class190();
				Static226.method3464();
				Static170.method2728(Static193.aClass211_50);
				Static115.method1865(Static284.anInterface7_4, Static227.aClass211_59);
				Static64.anInt1730 = 120;
			}
		} else if (Static64.anInt1730 == 120) {
			local6 = Static171.method2737(Static140.aClass211_38);
			local64 = Static222.method3438();
			if (local6 < local64) {
				Static389.aString61 = Static127.aClass158_72.method3594(Static365.anInt6682) + local6 * 100 / local64 + "%";
				Static50.anInt1224 = 70;
			} else {
				Static318.method4543(Static30.aClass106_3, Static140.aClass211_38);
				Static415.method5631(Static184.aClass137Array8);
				Static389.aString61 = Static378.aClass158_179.method3594(Static365.anInt6682);
				Static64.anInt1730 = 130;
				Static50.anInt1224 = 70;
			}
		} else if (Static64.anInt1730 == 130) {
			if (Static192.aClass211_49.method4765("", "huffman")) {
				@Pc(1260) Class226 local1260 = new Class226(Static192.aClass211_49.method4749("", "huffman"));
				Static236.method3590(local1260);
				Static389.aString61 = Static137.aClass158_85.method3594(Static365.anInt6682);
				Static64.anInt1730 = 140;
				Static50.anInt1224 = 75;
			} else {
				Static389.aString61 = Static71.aClass158_42.method3594(Static365.anInt6682) + "0%";
				Static50.anInt1224 = 75;
			}
		} else if (Static64.anInt1730 == 140) {
			if (Static126.aClass211_34.method4745()) {
				Static389.aString61 = Static114.aClass158_67.method3594(Static365.anInt6682);
				Static50.anInt1224 = 80;
				Static64.anInt1730 = 150;
			} else {
				Static389.aString61 = Static234.aClass158_122.method3594(Static365.anInt6682) + Static126.aClass211_34.method4756() + "%";
				Static50.anInt1224 = 80;
			}
		} else if (Static64.anInt1730 == 150) {
			if (Static10.aClass211_91.method4745()) {
				Static389.aString61 = Static64.aClass158_36.method3594(Static365.anInt6682);
				Static64.anInt1730 = 160;
				Static50.anInt1224 = 82;
			} else {
				Static389.aString61 = Static11.aClass158_5.method3594(Static365.anInt6682) + Static10.aClass211_91.method4756() + "%";
				Static50.anInt1224 = 82;
			}
		} else if (Static64.anInt1730 == 160) {
			if (Static24.aClass211_8.method4745()) {
				Static389.aString61 = Static430.aClass158_202.method3594(Static365.anInt6682);
				Static50.anInt1224 = 85;
				Static64.anInt1730 = 170;
			} else {
				Static389.aString61 = Static430.aClass158_202.method3594(Static365.anInt6682) + Static24.aClass211_8.method4756() + "%";
				Static50.anInt1224 = 85;
			}
		} else if (Static64.anInt1730 == 170) {
			if (Static263.aClass211_69.method4747("details")) {
				Static377.method3865(Static263.aClass211_69, Static365.aClass251_6, Static331.aClass191_5, Static455.aClass161_4, Static163.aClass170_2, Static420.aClass84_2, Static366.aClass190_1);
				Static389.aString61 = Static161.aClass158_92.method3594(Static365.anInt6682);
				Static64.anInt1730 = 190;
				Static50.anInt1224 = 89;
			} else {
				Static389.aString61 = Static30.aClass158_14.method3594(Static365.anInt6682) + Static263.aClass211_69.method4775("details") + "%";
				Static50.anInt1224 = 87;
			}
		} else if (Static64.anInt1730 == 190) {
			Static398.aBooleanArray23 = new boolean[Static344.aClass56_1.anInt1921];
			Static31.anIntArray221 = new int[Static344.aClass56_1.anInt1921];
			Static255.aStringArray34 = new String[Static241.aClass250_1.anInt7363];
			for (local6 = 0; local6 < Static344.aClass56_1.anInt1921; local6++) {
				if (Static344.aClass56_1.method1400(local6).anInt4632 == 0) {
					Static398.aBooleanArray23[local6] = true;
					Static266.anInt5157++;
				}
				Static31.anIntArray221[local6] = -1;
			}
			Static221.method3428();
			Static97.anInt2326 = Static126.aClass211_34.method4759("loginscreen");
			Static128.anInt2852 = Static126.aClass211_34.method4759("lobbyscreen");
			Static136.aClass211_36.method4754(false);
			Static362.aClass211_75.method4754(true);
			Static140.aClass211_38.method4754(true);
			Static24.aClass211_8.method4754(true);
			Static192.aClass211_49.method4754(true);
			Static126.aClass211_34.method4754(true);
			Static37.aClass211_13.anInt6207 = 2;
			Static427.aBoolean488 = true;
			Static140.aClass211_37.anInt6207 = 2;
			Static386.aClass211_80.anInt6207 = 2;
			Static65.aClass211_19.anInt6207 = 2;
			Static355.aClass211_74.anInt6207 = 2;
			Static136.aClass211_35.anInt6207 = 2;
			Static437.aClass211_88.anInt6207 = 2;
			Static230.method3513(-1, Static12.aClass34_Sub1_1.anInt7174, false, -1);
			Static389.aString61 = Static420.aClass158_111.method3594(Static365.anInt6682);
			Static64.anInt1730 = 200;
			Static50.anInt1224 = 95;
		} else if (Static64.anInt1730 == 200) {
			Static118.method2017(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1056(@OriginalArg(0) int arg0) {
		Static214.aClass236_15 = null;
		Static175.aClass159_2.anInt4705++;
		Static57.aClass157_1 = null;
		Static260.anInt5044 = 0;
		Static175.aClass159_2.anInt4704 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1058() {
		@Pc(15) boolean local15 = Static175.aClass159_2.method3608();
		if (!local15) {
			this.method1054();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1037()) {
			return;
		}
		Static156.aClass35_8 = new Class35();
		Static156.aClass35_8.anInt1006 = Integer.parseInt(this.getParameter("worldid"));
		Static283.aClass35_11 = new Class35();
		Static283.aClass35_11.anInt1006 = Integer.parseInt(this.getParameter("lobbyid"));
		Static283.aClass35_11.aString6 = this.getParameter("lobbyaddress");
		Static214.aClass35_16 = new Class35();
		Static214.aClass35_16.anInt1006 = Integer.parseInt(this.getParameter("demoid"));
		Static214.aClass35_16.aString6 = this.getParameter("demoaddress");
		Static314.aClass248_7 = Static391.method5428(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static235.method3587(Static314.aClass248_7) && Static59.aClass248_1 != Static314.aClass248_7) {
			Static314.aClass248_7 = Static59.aClass248_1;
		}
		Static262.aClass256_6 = Static272.method4043(Integer.parseInt(this.getParameter("modewhat")));
		if (Static66.aClass256_3 != Static262.aClass256_6 && Static262.aClass256_6 != Static303.aClass256_7 && Static262.aClass256_6 != Static319.aClass256_5) {
			Static262.aClass256_6 = Static319.aClass256_5;
		}
		try {
			Static365.anInt6682 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static365.anInt6682 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static316.aBoolean374 = true;
		} else {
			Static316.aBoolean374 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static352.aBoolean417 = true;
		} else {
			Static352.aBoolean417 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static237.aBoolean302 = true;
		} else {
			Static237.aBoolean302 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static268.aClass272_4 = Static181.aClass272_2;
			} else if (local145.equals("1")) {
				Static268.aClass272_4 = Static266.aClass272_3;
			}
		}
		try {
			Static2.anInt47 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static2.anInt47 = 0;
		}
		Static160.aString30 = this.getParameter("quiturl");
		Static325.aString57 = this.getParameter("settings");
		if (Static325.aString57 == null) {
			Static325.aString57 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static284.anInt3192 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static284.anInt3192 = 0;
			}
		}
		Static263.anInt5071 = Integer.parseInt(this.getParameter("colourid"));
		if (Static263.anInt5071 < 0 || Static330.aColorArray2.length <= Static263.anInt5071) {
			Static263.anInt5071 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static218.aBoolean269 = true;
			Static346.aBoolean406 = true;
		}
		@Pc(228) String local228 = this.getParameter("frombilling");
		if (local228 != null && local228.equals("true")) {
			Static404.aBoolean347 = true;
		}
		if (Static181.aClass272_2 == Static268.aClass272_4) {
			Static190.anInt3989 = 503;
			Static431.anInt7617 = 765;
		} else if (Static268.aClass272_4 == Static266.aClass272_3) {
			Static190.anInt3989 = 480;
			Static431.anInt7617 = 640;
		}
		Static271.aClient1 = this;
		this.method1031(Static262.aClass256_6.method5764() + 32, Static190.anInt3989, Static431.anInt7617);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1060(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub3 local15 = new Class1_Sub3(arg0);
		while (true) {
			@Pc(19) int local19;
			@Pc(45) int local45;
			@Pc(40) int local40;
			label45: do {
				while (true) {
					while (true) {
						local19 = local15.method1171();
						if (local19 == 0) {
							return;
						}
						if (local19 == 1) {
							@Pc(117) int[] local117 = Static258.anIntArray474 = new int[6];
							local117[0] = local15.method1177();
							local117[1] = local15.method1177();
							local117[2] = local15.method1177();
							local117[3] = local15.method1177();
							local117[4] = local15.method1177();
							local117[5] = local15.method1177();
						} else {
							if (local19 != 4) {
								continue label45;
							}
							local40 = local15.method1171();
							Static80.anIntArray744 = new int[local40];
							for (local45 = 0; local45 < local40; local45++) {
								Static80.anIntArray744[local45] = local15.method1177();
								if (Static80.anIntArray744[local45] == 65535) {
									Static80.anIntArray744[local45] = -1;
								}
							}
						}
					}
				}
			} while (local19 != 5);
			local40 = local15.method1171();
			Static85.anIntArray219 = new int[local40];
			for (local45 = 0; local45 < local40; local45++) {
				Static85.anIntArray219[local45] = local15.method1177();
				if (Static85.anIntArray219[local45] == 65535) {
					Static85.anIntArray219[local45] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1029() {
		if (Static334.aBoolean390) {
			Static208.method3578();
		}
		if (Static30.aClass106_3 != null) {
			Static30.aClass106_3.method5966();
		}
		if (Static93.aFrame2 != null) {
			Static7.method82(Static93.aFrame2, Static150.aClass183_3);
			Static93.aFrame2 = null;
		}
		if (Static388.aClass236_13 != null) {
			Static388.aClass236_13.method5236();
			Static388.aClass236_13 = null;
		}
		if (Static73.aClass22_1 != null) {
			Static73.aClass22_1.method506(Static443.aCanvas33);
		}
		Static73.aClass22_1 = null;
		Static306.method4410();
		Static175.aClass159_2.method3619();
		Static253.aClass58_3.method1418();
		if (Static461.aClass184_4 != null) {
			Static461.aClass184_4.method4172();
			Static461.aClass184_4 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1065() {
		@Pc(34) int local34;
		if (Static170.anInt3494 == 6 && Static97.anInt2331 == 0) {
			if (Static32.anInt907 > 0) {
				Static32.anInt907--;
			}
			if (Static162.anInt3420 > 1) {
				Static111.anInt4635 = Static175.anInt3842;
				Static162.anInt3420--;
			}
			if (!Static96.aBoolean151) {
				Static83.method1517();
			}
			for (local34 = 0; local34 < 100 && Static131.method2160(); local34++) {
			}
		}
		Static234.anInt4630++;
		Static4.method54(-1, null, -1);
		Static229.method3506(-1, null, -1);
		Static191.method3099();
		Static175.anInt3842++;
		for (local34 = 0; local34 < Static127.anInt2832; local34++) {
			@Pc(78) Class30_Sub1_Sub1_Sub1 local78 = Static324.aClass1_Sub27Array2[local34].aClass30_Sub1_Sub1_Sub1_2;
			if (local78 != null) {
				@Pc(84) byte local84 = local78.aClass11_1.aByte8;
				if ((local84 & 0x1) != 0) {
					@Pc(92) int local92 = local78.method944();
					@Pc(116) int local116;
					if ((local84 & 0x2) != 0 && local78.anInt1314 == 0 && Math.random() * 1000.0D < 10.0D) {
						local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(124) int local124 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local116 != 0 || local124 != 0) {
							@Pc(141) int local141 = local116 + local78.anIntArray130[0];
							@Pc(148) int local148 = local78.anIntArray129[0] + local124;
							if (local141 < 0) {
								local141 = 0;
							} else if (Static209.anInt4283 - local92 - 1 < local141) {
								local141 = Static209.anInt4283 - local92 - 1;
							}
							if (local148 < 0) {
								local148 = 0;
							} else if (local148 > Static211.anInt4295 - local92 - 1) {
								local148 = Static211.anInt4295 - local92 - 1;
							}
							@Pc(227) int local227 = Static267.method3957(0, local148, -1, local141, Static114.anIntArray278, Static19.aClass120Array1[local78.aByte102], local78.anIntArray130[0], local78.anIntArray129[0], 0, local92, local92, true, Static313.anIntArray547, local92);
							if (local227 > 0) {
								if (local227 > 9) {
									local227 = 9;
								}
								for (@Pc(236) int local236 = 0; local236 < local227; local236++) {
									local78.anIntArray130[local236] = Static114.anIntArray278[local227 - local236 - 1];
									local78.anIntArray129[local236] = Static313.anIntArray547[local227 - local236 - 1];
									local78.aByteArray13[local236] = 1;
								}
								local78.anInt1314 = local227;
							}
						}
					}
					Static132.method2164(true, local78);
					local116 = Static61.method1146(local78);
					Static130.method2136(local116, local78, Static285.anInt5407, Static115.anInt2565);
					Static161.method2662(local78);
				}
			}
		}
		if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
			if (Static21.anInt6762 == 2) {
				Static226.method3458();
			} else {
				Static206.method3289();
			}
			if (Static378.anInt6885 >> 7 < 14 || Static378.anInt6885 >> 7 >= Static209.anInt4283 - 14 || Static78.anInt1973 >> 7 < 14 || Static78.anInt1973 >> 7 >= Static211.anInt4295 - 14) {
				Static393.method5439();
			}
		}
		while (true) {
			@Pc(354) Class1_Sub10 local354;
			@Pc(359) Class68 local359;
			@Pc(370) Class68 local370;
			do {
				local354 = (Class1_Sub10) Static90.aClass203_8.method4549();
				if (local354 == null) {
					while (true) {
						do {
							local354 = (Class1_Sub10) Static4.aClass203_1.method4549();
							if (local354 == null) {
								while (true) {
									do {
										local354 = (Class1_Sub10) Static106.aClass203_11.method4549();
										if (local354 == null) {
											if (Static404.aClass68_11 != null) {
												Static184.method3065();
											}
											if (Static187.anInt3975 % 1500 == 0) {
												Static260.method3875();
											}
											if (Static170.anInt3494 == 6 && Static97.anInt2331 == 0) {
												Static318.method4539();
											}
											Static30.method569();
											if (Static334.aBoolean390 && Static250.method3737() - 60000L > Static14.aLong8) {
												Static208.method3578();
											}
											for (@Pc(527) Class41_Sub3_Sub1 local527 = (Class41_Sub3_Sub1) Static212.aClass117_5.method2967(); local527 != null; local527 = (Class41_Sub3_Sub1) Static212.aClass117_5.method2970()) {
												if ((long) local527.anInt2851 < Static250.method3737() / 1000L - 5L) {
													if (local527.aShort51 > 0) {
														Static227.method3471("", 0, local527.aString25 + Static274.aClass158_136.method3594(Static365.anInt6682), 5, "");
													}
													if (local527.aShort51 == 0) {
														Static227.method3471("", 0, local527.aString25 + Static345.aClass158_170.method3594(Static365.anInt6682), 5, "");
													}
													local527.method5447();
												}
											}
											if (Static170.anInt3494 == 6 && Static97.anInt2331 == 0) {
												if (Static388.aClass236_13 == null) {
													Static162.method2668(false);
													return;
												}
												Static180.anInt3907++;
												if (Static180.anInt3907 > 50) {
													Static32.method677(Static285.aClass177_78);
												}
												try {
													if (Static388.aClass236_13 != null && Static433.aClass1_Sub3_Sub1_11.anInt1710 > 0) {
														Static339.anInt6203 += Static433.aClass1_Sub3_Sub1_11.anInt1710;
														Static388.aClass236_13.method5227(Static433.aClass1_Sub3_Sub1_11.anInt1710, Static433.aClass1_Sub3_Sub1_11.aByteArray14);
														Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
														Static180.anInt3907 = 0;
													}
												} catch (@Pc(652) IOException local652) {
													Static162.method2668(false);
												}
											}
											return;
										}
										local359 = local354.aClass68_3;
										if (local359.anInt2188 < 0) {
											break;
										}
										local370 = Static300.method4351(local359.anInt2129);
									} while (local370 == null || local370.aClass68Array2 == null || local370.aClass68Array2.length <= local359.anInt2188 || local370.aClass68Array2[local359.anInt2188] != local359);
									Static178.method3000(local354);
								}
							}
							local359 = local354.aClass68_3;
							if (local359.anInt2188 < 0) {
								break;
							}
							local370 = Static300.method4351(local359.anInt2129);
						} while (local370 == null || local370.aClass68Array2 == null || local359.anInt2188 >= local370.aClass68Array2.length || local370.aClass68Array2[local359.anInt2188] != local359);
						Static178.method3000(local354);
					}
				}
				local359 = local354.aClass68_3;
				if (local359.anInt2188 < 0) {
					break;
				}
				local370 = Static300.method4351(local359.anInt2129);
			} while (local370 == null || local370.aClass68Array2 == null || local370.aClass68Array2.length <= local359.anInt2188 || local370.aClass68Array2[local359.anInt2188] != local359);
			Static178.method3000(local354);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1030() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static262.method2062();
		Static253.aClass58_3 = new Class58(Static150.aClass183_3);
		Static175.aClass159_2 = new Class159();
		if (Static314.aClass248_7 != Static59.aClass248_1) {
			Static166.aByteArrayArray13 = new byte[50][];
		}
		Static12.aClass34_Sub1_1 = new Class34_Sub1(Static150.aClass183_3);
		if (Static314.aClass248_7 == Static59.aClass248_1) {
			Static156.aClass35_8.aString6 = this.getCodeBase().getHost();
		} else if (Static235.method3587(Static314.aClass248_7)) {
			Static156.aClass35_8.aString6 = this.getCodeBase().getHost();
			Static156.aClass35_8.anInt1005 = Static156.aClass35_8.anInt1006 + 40000;
			Static283.aClass35_11.anInt1005 = Static283.aClass35_11.anInt1006 + 40000;
			Static214.aClass35_16.anInt1005 = Static214.aClass35_16.anInt1006 + 40000;
			Static156.aClass35_8.anInt1004 = Static156.aClass35_8.anInt1006 + 50000;
			Static283.aClass35_11.anInt1004 = Static283.aClass35_11.anInt1006 + 50000;
			Static214.aClass35_16.anInt1004 = Static214.aClass35_16.anInt1006 + 50000;
		} else if (Static314.aClass248_7 == Static366.aClass248_8) {
			Static156.aClass35_8.aString6 = "127.0.0.1";
			Static283.aClass35_11.aString6 = "127.0.0.1";
			Static156.aClass35_8.anInt1005 = Static156.aClass35_8.anInt1006 + 40000;
			Static214.aClass35_16.aString6 = "127.0.0.1";
			Static283.aClass35_11.anInt1005 = Static283.aClass35_11.anInt1006 + 40000;
			Static156.aClass35_8.anInt1004 = Static156.aClass35_8.anInt1006 + 50000;
			Static214.aClass35_16.anInt1005 = Static214.aClass35_16.anInt1006 + 40000;
			Static283.aClass35_11.anInt1004 = Static283.aClass35_11.anInt1006 + 50000;
			Static214.aClass35_16.anInt1004 = Static214.aClass35_16.anInt1006 + 50000;
		}
		if (Static268.aClass272_4 == Static181.aClass272_2) {
			Static275.aBoolean333 = false;
		}
		if (Static268.aClass272_4 == Static266.aClass272_3) {
			Static15.anInt219 = 0;
			Static182.aShortArrayArray2 = Static355.aShortArrayArray4;
			Static365.aShortArray126 = Static137.aShortArray59;
			Static326.aBoolean381 = true;
			Static5.anInt68 = 16777215;
			Static431.aShortArrayArray8 = Static371.aShortArrayArray5;
			Static344.aShortArray114 = Static176.aShortArray65;
		} else {
			Static182.aShortArrayArray2 = Static396.aShortArrayArray7;
			Static344.aShortArray114 = Static32.aShortArray34;
			Static431.aShortArrayArray8 = Static221.aShortArrayArray3;
			Static365.aShortArray126 = Static59.aShortArray36;
		}
		Static430.aShortArray133 = Static325.aShortArray111 = Static358.aShortArray121 = Static383.aShortArray128 = new short[256];
		Static156.aClass35_9 = Static156.aClass35_8;
		Static414.aClass48_1 = Static18.method369(Static443.aCanvas33);
		Static336.aClass87_1 = Static417.method5677(Static443.aCanvas33);
		Static73.aClass22_1 = Static367.method5116();
		if (Static73.aClass22_1 != null) {
			Static73.aClass22_1.method507(Static443.aCanvas33);
		}
		Static274.anInt5304 = Static282.anInt5394;
		try {
			if (Static150.aClass183_3.aClass128_1 != null) {
				Static372.aClass187_4 = new Class187(Static150.aClass183_3.aClass128_1, 5200, 0);
				for (@Pc(226) int local226 = 0; local226 < 30; local226++) {
					Static257.aClass187Array1[local226] = new Class187(Static150.aClass183_3.aClass128Array1[local226], 6000, 0);
				}
				Static408.aClass187_5 = new Class187(Static150.aClass183_3.aClass128_3, 6000, 0);
				Static169.aClass195_4 = new Class195(255, Static372.aClass187_4, Static408.aClass187_5, 500000);
				Static119.aClass187_1 = new Class187(Static150.aClass183_3.aClass128_2, 24, 0);
				Static150.aClass183_3.aClass128_1 = null;
				Static150.aClass183_3.aClass128Array1 = null;
				Static150.aClass183_3.aClass128_2 = null;
				Static150.aClass183_3.aClass128_3 = null;
			}
		} catch (@Pc(282) IOException local282) {
			Static169.aClass195_4 = null;
			Static408.aClass187_5 = null;
			Static119.aClass187_1 = null;
			Static372.aClass187_4 = null;
		}
		if (Static314.aClass248_7 != Static59.aClass248_1) {
			Static227.aBoolean283 = true;
		}
		if (Static181.aClass272_2 == Static268.aClass272_4) {
			Static393.aString62 = Static432.aClass158_204.method3594(Static365.anInt6682);
		} else if (Static266.aClass272_3 == Static268.aClass272_4) {
			Static393.aString62 = Static18.aClass158_8.method3594(Static365.anInt6682);
		}
	}
}
