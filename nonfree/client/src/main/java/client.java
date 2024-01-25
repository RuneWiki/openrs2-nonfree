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
				Static350.method4964("argument count");
			}
			Static2.anInt4 = Integer.parseInt(arg0[0]);
			Static449.aClass207_11 = Static315.aClass207_5;
			if (arg0[1].equals("live")) {
				Static35.aClass257_1 = Static381.aClass257_4;
			} else if (arg0[1].equals("rc")) {
				Static35.aClass257_1 = Static134.aClass257_2;
			} else if (arg0[1].equals("wip")) {
				Static35.aClass257_1 = Static186.aClass257_3;
			} else {
				Static350.method4964("modewhat");
			}
			Static382.anInt6289 = Static382.method5262(arg0[2]);
			if (Static382.anInt6289 == -1) {
				if (arg0[2].equals("english")) {
					Static382.anInt6289 = 0;
				} else if (arg0[2].equals("german")) {
					Static382.anInt6289 = 1;
				} else {
					Static350.method4964("language");
				}
			}
			Static70.aBoolean130 = false;
			Static89.aBoolean121 = false;
			if (arg0[3].equals("game0")) {
				Static323.aClass44_4 = Static307.aClass44_2;
			} else if (arg0[3].equals("game1")) {
				Static323.aClass44_4 = Static193.aClass44_3;
			} else {
				Static350.method4964("game");
			}
			Static146.anInt2651 = Static323.aClass44_4.anInt1139;
			Static124.anInt3591 = 0;
			Static441.anInt7213 = 0;
			Static208.aBoolean241 = true;
			Static181.aBoolean223 = true;
			Static300.aString70 = "";
			@Pc(124) client local124 = new client();
			Static160.aClient1 = local124;
			local124.method1007(Static323.aClass44_4.aString10, Static35.aClass257_1.method5880() + 32);
			Static176.aFrame2.setLocation(40, 40);
		} catch (@Pc(148) Exception local148) {
			Static40.method799(local148, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method996() {
		if (Static54.anInt1123 == 1000) {
			return;
		}
		Static125.anInt2225++;
		if (Static125.anInt2225 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static411.anInt6897 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static182.aRandom1.setSeed((long) Static411.anInt6897);
		}
		if (Static125.anInt2225 % 50 == 0) {
			Static314.anInt7072 = Static322.anInt5260;
			Static99.anInt1803 = Static208.anInt3630;
			Static322.anInt5260 = 0;
			Static208.anInt3630 = 0;
		}
		this.method1016();
		if (Static397.aClass259_1 != null) {
			Static397.aClass259_1.method5893();
		}
		Static249.method3848();
		Static326.aClass86_1.method1866();
		Static37.aClass71_26.method1622();
		if (Static375.aClass74_1 != null) {
			@Pc(87) int local87 = Static375.aClass74_1.method1682();
			Static238.anInt4074 = local87;
		}
		if (Static44.aClass28_14 != null) {
			Static44.aClass28_14.method3544((int) Static154.method2527());
		}
		Static234.method3668();
		Static203.anInt3583 = 0;
		for (@Pc(106) Class139 local106 = Static326.aClass86_1.method1868(); local106 != null && Static203.anInt3583 < 128; local106 = Static326.aClass86_1.method1868()) {
			if (local106.method3200() != 1) {
				@Pc(117) char local117 = local106.method3201();
				if (!Static49.method904() || local117 != '`' && local117 != '§') {
					Static370.aClass139Array1[Static203.anInt3583] = local106;
					Static203.anInt3583++;
				} else if (Static220.method3382()) {
					Static250.method3852();
				} else {
					Static317.method5230();
				}
			}
		}
		for (@Pc(166) Class6_Sub7 local166 = Static37.aClass71_26.method1621(); local166 != null; local166 = Static37.aClass71_26.method1621()) {
			@Pc(172) int local172 = local166.method1261();
			if (local172 == -1) {
				Static181.aClass88_28.method1878(local166);
			} else if (Static237.method3714(local172)) {
				Static254.aClass88_34.method1878(local166);
			}
			if (Static254.aClass88_34.method1880() > 10) {
				Static254.aClass88_34.method1881();
			}
		}
		if (Static220.method3382()) {
			Static202.method3184();
		}
		if (Static54.anInt1123 == 0) {
			this.method1023();
			Static100.method402();
		} else if (Static54.anInt1123 == 5) {
			this.method1023();
			Static100.method402();
		} else if (Static54.anInt1123 == 25 || Static54.anInt1123 == 28) {
			Static92.method1592();
		}
		if (Static54.anInt1123 == 10) {
			this.method1020();
			Static271.method4126();
			Static211.method3281();
			Static28.method361();
		} else if (Static54.anInt1123 == 30) {
			Static102.method4404();
		} else if (Static54.anInt1123 == 40) {
			Static28.method361();
			if (Static189.anInt6579 != -3 && Static189.anInt6579 != 2 && Static189.anInt6579 != 15) {
				Static44.method825();
			}
		}
		Static450.method5988(Static44.aClass28_14);
		Static254.aClass88_34.method1881();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1015() {
		if (Static376.aClass179_3.anInt4659 > Static138.anInt6829) {
			if (Static178.anInt1113 == Static384.anInt6347) {
				Static384.anInt6347 = Static358.anInt6021;
			} else {
				Static384.anInt6347 = Static178.anInt1113;
			}
			Static6.anInt92 = (Static376.aClass179_3.anInt4659 - 1) * 50 * 5;
			if (Static6.anInt92 > 3000) {
				Static6.anInt92 = 3000;
			}
			if (Static376.aClass179_3.anInt4659 >= 2 && Static376.aClass179_3.anInt4660 == 6) {
				this.method998("js5connect_outofdate");
				Static54.anInt1123 = 1000;
				return;
			}
			if (Static376.aClass179_3.anInt4659 >= 4 && Static376.aClass179_3.anInt4660 == -1) {
				this.method998("js5crc");
				Static54.anInt1123 = 1000;
				return;
			}
			if (Static376.aClass179_3.anInt4659 >= 4 && (Static54.anInt1123 == 0 || Static54.anInt1123 == 5)) {
				if (Static376.aClass179_3.anInt4660 == 7 || Static376.aClass179_3.anInt4660 == 9) {
					this.method998("js5connect_full");
				} else if (Static376.aClass179_3.anInt4660 > 0) {
					this.method998("js5connect");
				} else {
					this.method998("js5io");
				}
				Static54.anInt1123 = 1000;
				return;
			}
		}
		Static138.anInt6829 = Static376.aClass179_3.anInt4659;
		if (Static6.anInt92 > 0) {
			Static6.anInt92--;
			return;
		}
		try {
			if (Static437.anInt7195 == 0) {
				Static5.aClass249_1 = Static165.aClass103_3.method2378(Static367.aString66, Static384.anInt6347);
				Static437.anInt7195++;
			}
			if (Static437.anInt7195 == 1) {
				if (Static5.aClass249_1.anInt6929 == 2) {
					this.method1021(1000);
					return;
				}
				if (Static5.aClass249_1.anInt6929 == 1) {
					Static437.anInt7195++;
				}
			}
			if (Static437.anInt7195 == 2) {
				Static382.aClass30_3 = new Class30((Socket) Static5.aClass249_1.anObject10, Static165.aClass103_3);
				@Pc(192) Class6_Sub15 local192 = new Class6_Sub15(5);
				local192.method3075(Static289.aClass20_2.anInt414);
				local192.method3107(581);
				Static382.aClass30_3.method733(local192.aByteArray51, 5);
				Static437.anInt7195++;
				Static445.aLong216 = Static154.method2527();
			}
			if (Static437.anInt7195 == 3) {
				if (Static54.anInt1123 == 0 || Static54.anInt1123 == 5 || Static382.aClass30_3.method735() > 0) {
					@Pc(248) int local248 = Static382.aClass30_3.method738();
					if (local248 != 0) {
						this.method1021(local248);
						return;
					}
					Static437.anInt7195++;
				} else if (Static154.method2527() - Static445.aLong216 > 30000L) {
					this.method1021(1001);
					return;
				}
			}
			if (Static437.anInt7195 == 4) {
				@Pc(275) boolean local275 = Static54.anInt1123 == 5 || Static54.anInt1123 == 10 || Static54.anInt1123 == 28;
				Static376.aClass179_3.method4138(Static382.aClass30_3, !local275);
				Static437.anInt7195 = 0;
				Static382.aClass30_3 = null;
				Static5.aClass249_1 = null;
			}
		} catch (@Pc(292) IOException local292) {
			this.method1021(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1016() {
		@Pc(11) boolean local11 = Static376.aClass179_3.method4128();
		if (!local11) {
			this.method1015();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1003() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static10.method5378();
		Static16.aClass165_1 = new Class165(Static165.aClass103_3);
		Static376.aClass179_3 = new Class179();
		if (Static449.aClass207_11 != Static194.aClass207_8) {
			Static247.aByteArrayArray25 = new byte[50][];
		}
		Static8.aClass173_Sub1_1 = new Class173_Sub1(Static165.aClass103_3);
		if (Static449.aClass207_11 == Static194.aClass207_8) {
			Static53.aString9 = this.getCodeBase().getHost();
			Static377.anInt6697 = 443;
			Static401.anInt6633 = 43594;
		} else if (Static338.method4780(Static449.aClass207_11)) {
			Static53.aString9 = this.getCodeBase().getHost();
			Static401.anInt6633 = Static2.anInt4 + 40000;
			Static377.anInt6697 = Static2.anInt4 + 50000;
		} else if (Static449.aClass207_11 == Static315.aClass207_5) {
			Static53.aString9 = "127.0.0.1";
			Static401.anInt6633 = Static2.anInt4 + 40000;
			Static377.anInt6697 = Static2.anInt4 + 50000;
		}
		Static367.aString66 = Static53.aString9;
		Static178.anInt1113 = Static401.anInt6633;
		Static172.anInt3043 = Static401.anInt6633;
		Static358.anInt6021 = Static377.anInt6697;
		Static384.anInt6347 = Static172.anInt3043;
		if (Static193.aClass44_3 == Static323.aClass44_4) {
			Static339.aShortArrayArray6 = Static197.aShortArrayArray4;
			Static414.anInt6927 = 0;
			Static102.aShortArrayArray5 = Static90.aShortArrayArray1;
			Static21.aShortArray11 = Static208.aShortArray61;
			Static219.aBoolean247 = true;
			Static348.aShortArray85 = Static341.aShortArray73;
			Static215.anInt3736 = 16777215;
		} else {
			Static339.aShortArrayArray6 = Static426.aShortArrayArray8;
			Static348.aShortArray85 = Static90.aShortArray30;
			Static21.aShortArray11 = Static25.aShortArray102;
			Static102.aShortArrayArray5 = Static129.aShortArrayArray3;
		}
		Static107.aShortArray31 = Static160.aShortArray47 = Static65.aShortArray20 = Static123.aShortArray32 = new short[256];
		if (Static143.anInt2575 == 3) {
			Static53.anInt1053 = Static2.anInt4;
		}
		Static326.aClass86_1 = Static305.method4410(Static314.aCanvas8);
		Static37.aClass71_26 = Static331.method4737(Static314.aCanvas8);
		Static375.aClass74_1 = Static19.method276();
		if (Static375.aClass74_1 != null) {
			Static375.aClass74_1.method1683(Static314.aCanvas8);
		}
		Static279.anInt4747 = Static143.anInt2575;
		try {
			if (Static165.aClass103_3.aClass142_3 != null) {
				Static18.aClass155_3 = new Class155(Static165.aClass103_3.aClass142_3, 5200, 0);
				for (@Pc(164) int local164 = 0; local164 < 30; local164++) {
					Static179.aClass155Array1[local164] = new Class155(Static165.aClass103_3.aClass142Array1[local164], 6000, 0);
				}
				Static179.aClass155_4 = new Class155(Static165.aClass103_3.aClass142_2, 6000, 0);
				Static158.aClass14_1 = new Class14(255, Static18.aClass155_3, Static179.aClass155_4, 500000);
				Static182.aClass155_5 = new Class155(Static165.aClass103_3.aClass142_1, 24, 0);
				Static165.aClass103_3.aClass142_2 = null;
				Static165.aClass103_3.aClass142Array1 = null;
				Static165.aClass103_3.aClass142_3 = null;
				Static165.aClass103_3.aClass142_1 = null;
			}
		} catch (@Pc(220) IOException local220) {
			Static182.aClass155_5 = null;
			Static18.aClass155_3 = null;
			Static158.aClass14_1 = null;
			Static179.aClass155_4 = null;
		}
		if (Static449.aClass207_11 != Static194.aClass207_8) {
			Static412.aBoolean472 = true;
		}
		Static155.aString30 = (Static323.aClass44_4 == Static307.aClass44_2 ? Static424.aClass231_7 : Static396.aClass231_102).method5138(Static382.anInt6289);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method1008() {
		if (Static54.anInt1123 == 1000) {
			return;
		}
		@Pc(17) long local17 = Static93.method1593() / 1000000L - Static181.aLong98;
		Static181.aLong98 = Static93.method1593() / 1000000L;
		@Pc(25) boolean local25 = Static48.method5463();
		if (local25 && Static284.aBoolean341 && Static18.aClass105_1 != null) {
			Static18.aClass105_1.method5171();
		}
		if (Static54.anInt1123 == 30 || Static54.anInt1123 == 10) {
			if (Static423.aLong208 != 0L && Static154.method2527() > Static423.aLong208) {
				Static369.method5142(false, Static172.method2743(), Static8.aClass173_Sub1_1.anInt4412, Static8.aClass173_Sub1_1.anInt4410);
			} else if (!Static44.aClass28_14.method3569() && Static422.aBoolean477) {
				Static338.method4779();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static93.aFrame1 == null) {
			@Pc(83) Container local83;
			if (Static176.aFrame2 == null) {
				local83 = Static165.aClass103_3.anApplet1;
			} else {
				local83 = Static176.aFrame2;
			}
			local92 = local83.getSize().width;
			local96 = local83.getSize().height;
			if (local83 == Static176.aFrame2) {
				@Pc(102) Insets local102 = Static176.aFrame2.getInsets();
				local96 -= local102.bottom + local102.top;
				local92 -= local102.left + local102.right;
			}
			if (Static377.anInt6742 != local92 || local96 != Static383.anInt6310) {
				if (Static44.aClass28_14 == null || Static44.aClass28_14.method3555()) {
					Static10.method5378();
				} else {
					Static383.anInt6310 = local96;
					Static377.anInt6742 = local92;
				}
				Static423.aLong208 = Static154.method2527() + 500L;
			}
		}
		if (Static93.aFrame1 != null && !Static343.aBoolean385 && (Static54.anInt1123 == 30 || Static54.anInt1123 == 10)) {
			Static369.method5142(false, Static8.aClass173_Sub1_1.anInt4409, -1, -1);
		}
		@Pc(173) boolean local173 = false;
		if (Static44.aBoolean76) {
			local173 = true;
			Static44.aBoolean76 = false;
		}
		if (local173) {
			Static240.method3729();
		}
		if (Static44.aClass28_14 != null && Static44.aClass28_14.method3569() || Static172.method2743() != 1) {
			Static207.method3239();
		}
		if (Static54.anInt1123 == 0) {
			Static192.method3031(Static192.aColorArray6[Static146.anInt2651], Static402.anInt6639, local173, Static10.aColorArray9[Static146.anInt2651], Static417.aString65, Static431.aColorArray8[Static146.anInt2651]);
		} else if (Static54.anInt1123 == 5) {
			Static135.method2191(Static192.aColorArray6[Static146.anInt2651].getRGB(), Static44.aClass28_14, Static45.aClass92_1, Static431.aColorArray8[Static146.anInt2651].getRGB(), Static44.aClass28_14.method3569() | local173, Static10.aColorArray9[Static146.anInt2651].getRGB());
		} else if (Static54.anInt1123 == 10) {
			Static450.method5987();
		} else if (Static54.anInt1123 == 25 || Static54.anInt1123 == 28) {
			if (Static102.anInt4995 == 1) {
				if (Static210.anInt3657 < Static306.anInt3571) {
					Static210.anInt3657 = Static306.anInt3571;
				}
				local92 = (Static210.anInt3657 - Static306.anInt3571) * 50 / Static210.anInt3657;
				Static94.method1630(true, Static60.aClass92_2, Static306.aClass231_61.method5138(Static382.anInt6289) + "<br>(" + local92 + "%)");
			} else if (Static102.anInt4995 == 2) {
				if (Static371.anInt6173 > Static41.anInt900) {
					Static41.anInt900 = Static371.anInt6173;
				}
				local92 = (Static41.anInt900 - Static371.anInt6173) * 50 / Static41.anInt900 + 50;
				Static94.method1630(true, Static60.aClass92_2, Static306.aClass231_61.method5138(Static382.anInt6289) + "<br>(" + local92 + "%)");
			} else {
				Static94.method1630(true, Static60.aClass92_2, Static306.aClass231_61.method5138(Static382.anInt6289));
			}
		} else if (Static54.anInt1123 == 30) {
			Static283.method4260(local17);
		} else if (Static54.anInt1123 == 40) {
			Static94.method1630(true, Static60.aClass92_2, Static302.aClass231_89.method5138(Static382.anInt6289) + "<br>" + Static237.aClass231_72.method5138(Static382.anInt6289));
		}
		if (Static320.anInt5213 == 3) {
			for (local92 = 0; local92 < Static299.anInt4962; local92++) {
				@Pc(392) Rectangle local392 = Class121.aRectangleArray2[local92];
				if (Static73.aBooleanArray10[local92]) {
					Static44.aClass28_14.method3531(local392.x, -1996553985, local392.y, local392.height, local392.width);
				} else if (Static298.aBooleanArray21[local92]) {
					Static44.aClass28_14.method3531(local392.x, -1996554240, local392.y, local392.height, local392.width);
				}
			}
		}
		if (Static220.method3382()) {
			Static378.method5921(Static44.aClass28_14);
		}
		if ((Static54.anInt1123 == 30 || Static54.anInt1123 == 10) && Static320.anInt5213 == 0 && Static172.method2743() == 1 && !local173 && Static143.aString24.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Static299.anInt4962; local96++) {
				if (Static298.aBooleanArray21[local96]) {
					Static298.aBooleanArray21[local96] = false;
					Static62.aRectangleArray1[local92++] = Class121.aRectangleArray2[local96];
				}
			}
			Static44.aClass28_14.method3545(Static62.aRectangleArray1, local92);
		} else if (Static54.anInt1123 != 0) {
			Static44.aClass28_14.method3503();
			for (local92 = 0; local92 < Static299.anInt4962; local92++) {
				Static298.aBooleanArray21[local92] = false;
			}
		}
		if (Static8.aClass173_Sub1_1.anInt4405 == 0) {
			Static170.method1617(15L);
		} else if (Static8.aClass173_Sub1_1.anInt4405 == 1) {
			Static170.method1617(10L);
		} else if (Static8.aClass173_Sub1_1.anInt4405 == 2) {
			Static170.method1617(5L);
		} else if (Static8.aClass173_Sub1_1.anInt4405 == 3) {
			Static170.method1617(2L);
		}
		if (Static64.aBoolean116) {
			Static446.method5952();
		}
		if (Static8.aClass173_Sub1_1.aBoolean310 && Static54.anInt1123 == 10 && Static313.anInt5099 != -1) {
			Static8.aClass173_Sub1_1.aBoolean310 = false;
			Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method1020() {
		Static338.anInt5679++;
		Static311.method4459(-1, -1, null);
		Static297.method4368(-1, -1, null);
		Static346.method4859();
		Static323.anInt5265++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class3_Sub3_Sub6_Sub2 local33 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass17_1.aByte6;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method5512();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt6756 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(99) int local99 = local74 + local33.anIntArray582[0];
							@Pc(106) int local106 = local82 + local33.anIntArray583[0];
							if (local99 < 0) {
								local99 = 0;
							} else if (local99 > Static84.anInt1632 - local50 - 1) {
								local99 = Static84.anInt1632 - local50 - 1;
							}
							if (local106 < 0) {
								local106 = 0;
							} else if (Static261.anInt4480 - local50 - 1 < local106) {
								local106 = Static261.anInt4480 - local50 - 1;
							}
							@Pc(188) int local188 = Static434.method5877(local50, local33.anIntArray583[0], local106, true, 0, local33.anIntArray582[0], 0, local50, Static401.anIntArray576, -1, Static254.aClass61Array2[local33.aByte93], local99, local50, Static120.anIntArray217);
							if (local188 > 0) {
								if (local188 > 9) {
									local188 = 9;
								}
								for (@Pc(199) int local199 = 0; local199 < local188; local199++) {
									local33.anIntArray582[local199] = Static120.anIntArray217[local188 - local199 - 1];
									local33.anIntArray583[local199] = Static401.anIntArray576[local188 - local199 - 1];
									local33.aByteArray86[local199] = 1;
								}
								local33.anInt6756 = local188;
							}
						}
					}
					Static119.method1908(true, local33);
					local74 = Static216.method3338(local33);
					Static80.method1467(local74, Static20.anInt331, local33, Static180.anInt3128);
					Static365.method3025(local33);
				}
			}
		}
		if (Static140.anInt2540 == 0 && Static90.anInt1675 == 0) {
			if (Static9.anInt164 == 2) {
				Static343.method4832();
			} else {
				Static429.method5847();
			}
			if (Static32.anInt521 >> 7 < 14 || Static84.anInt1632 - 14 <= Static32.anInt521 >> 7 || Static214.anInt3730 >> 7 < 14 || Static261.anInt4480 - 14 <= Static214.anInt3730 >> 7) {
				Static290.method4319();
			}
		}
		while (true) {
			@Pc(326) Class6_Sub29 local326;
			@Pc(331) Class239 local331;
			@Pc(339) Class239 local339;
			do {
				local326 = (Class6_Sub29) Static384.aClass88_42.method1881();
				if (local326 == null) {
					while (true) {
						do {
							local326 = (Class6_Sub29) Static446.aClass88_47.method1881();
							if (local326 == null) {
								while (true) {
									do {
										local326 = (Class6_Sub29) Static357.aClass88_41.method1881();
										if (local326 == null) {
											if (Static332.aClass239_12 != null) {
												Static87.method1531();
											}
											if (Static125.anInt2225 % 1500 == 0) {
												Static265.method4067();
											}
											Static386.method5314();
											if (Static243.aBoolean270 && Static154.method2527() - 60000L > Static424.aLong9) {
												Static224.method3409();
												return;
											}
											return;
										}
										local331 = local326.aClass239_10;
										if (local331.anInt6487 < 0) {
											break;
										}
										local339 = Static299.method4387(local331.anInt6479);
									} while (local339 == null || local339.aClass239Array1 == null || local339.aClass239Array1.length <= local331.anInt6487 || local339.aClass239Array1[local331.anInt6487] != local331);
									Static308.method4424(local326);
								}
							}
							local331 = local326.aClass239_10;
							if (local331.anInt6487 < 0) {
								break;
							}
							local339 = Static299.method4387(local331.anInt6479);
						} while (local339 == null || local339.aClass239Array1 == null || local339.aClass239Array1.length <= local331.anInt6487 || local331 != local339.aClass239Array1[local331.anInt6487]);
						Static308.method4424(local326);
					}
				}
				local331 = local326.aClass239_10;
				if (local331.anInt6487 < 0) {
					break;
				}
				local339 = Static299.method4387(local331.anInt6479);
			} while (local339 == null || local339.aClass239Array1 == null || local339.aClass239Array1.length <= local331.anInt6487 || local339.aClass239Array1[local331.anInt6487] != local331);
			Static308.method4424(local326);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method997() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1021(@OriginalArg(1) int arg0) {
		Static376.aClass179_3.anInt4659++;
		Static382.aClass30_3 = null;
		Static5.aClass249_1 = null;
		Static437.anInt7195 = 0;
		Static376.aClass179_3.anInt4660 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1011() {
		if (Static243.aBoolean270) {
			Static224.method3409();
		}
		if (Static44.aClass28_14 != null) {
			Static44.aClass28_14.method3562();
		}
		if (Static93.aFrame1 != null) {
			Static223.method3407(Static165.aClass103_3, Static93.aFrame1);
			Static93.aFrame1 = null;
		}
		if (Static103.aClass30_1 != null) {
			Static103.aClass30_1.method741();
			Static103.aClass30_1 = null;
		}
		if (Static375.aClass74_1 != null) {
			Static375.aClass74_1.method1685(Static314.aCanvas8);
		}
		Static375.aClass74_1 = null;
		Static192.method3027();
		Static376.aClass179_3.method4133();
		Static16.aClass165_1.method3737();
		if (Static274.aClass172_1 != null) {
			Static274.aClass172_1.method3953();
			Static274.aClass172_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1023() {
		@Pc(10) int local10;
		if (!Static8.aClass173_Sub1_1.aBoolean310) {
			for (local10 = 0; local10 < Static203.anInt3583; local10++) {
				if (Static370.aClass139Array1[local10].method3201() == 's' || Static370.aClass139Array1[local10].method3201() == 'S') {
					Static8.aClass173_Sub1_1.aBoolean310 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Static103.anInt1841 == 0) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local55 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(58) long local58 = Static154.method2527();
			if (Static268.aLong144 == 0L) {
				Static268.aLong144 = local58;
			}
			if (local55 > 16384 && local58 - Static268.aLong144 < 5000L) {
				if (local58 - Static141.aLong77 > 1000L) {
					System.gc();
					Static141.aLong77 = local58;
				}
				Static417.aString65 = Static45.aClass231_15.method5138(Static382.anInt6289);
				Static402.anInt6639 = 5;
			} else {
				Static417.aString65 = Static327.aClass231_94.method5138(Static382.anInt6289);
				Static103.anInt1841 = 10;
				Static402.anInt6639 = 5;
			}
		} else if (Static103.anInt1841 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static254.aClass61Array2[local10] = Static253.method3906(Static84.anInt1632, Static261.anInt4480);
			}
			Static417.aString65 = Static63.aClass231_23.method5138(Static382.anInt6289);
			Static103.anInt1841 = 20;
			Static402.anInt6639 = 10;
		} else if (Static103.anInt1841 == 20) {
			if (Static397.aClass259_1 == null) {
				Static397.aClass259_1 = new Class259(Static376.aClass179_3, Static16.aClass165_1);
			}
			if (Static397.aClass259_1.method5888()) {
				Static100.aClass158_8 = Static240.method3731(true, 0, false);
				Static367.aClass158_90 = Static240.method3731(true, 1, false);
				Static435.aClass158_94 = Static240.method3731(true, 2, false);
				Static429.aClass158_93 = Static240.method3731(true, 3, false);
				Static144.aClass158_30 = Static240.method3731(true, 4, false);
				Static118.aClass158_26 = Static240.method3731(true, 5, true);
				Static280.aClass158_63 = Static240.method3731(false, 6, true);
				Static223.aClass158_51 = Static240.method3731(true, 7, false);
				Static76.aClass158_17 = Static240.method3731(true, 8, false);
				Static63.aClass158_15 = Static240.method3731(true, 9, false);
				Static207.aClass158_44 = Static240.method3731(true, 10, false);
				Static305.aClass158_67 = Static240.method3731(true, 11, false);
				Static313.aClass158_69 = Static240.method3731(true, 12, false);
				Static241.aClass158_55 = Static240.method3731(true, 13, false);
				Static340.aClass158_71 = Static240.method3731(false, 14, false);
				Static123.aClass158_27 = Static240.method3731(true, 15, false);
				Static312.aClass158_68 = Static240.method3731(true, 16, false);
				Static250.aClass158_58 = Static240.method3731(true, 17, false);
				Static129.aClass158_29 = Static240.method3731(true, 18, false);
				Static85.aClass158_22 = Static240.method3731(true, 19, false);
				Static197.aClass158_42 = Static240.method3731(true, 20, false);
				Static20.aClass158_6 = Static240.method3731(true, 21, false);
				Static337.aClass158_70 = Static240.method3731(true, 22, false);
				Static422.aClass158_88 = Static240.method3731(true, 23, true);
				Static363.aClass158_81 = Static240.method3731(true, 24, false);
				Static382.aClass158_82 = Static240.method3731(true, 25, false);
				Static52.aClass158_13 = Static240.method3731(true, 26, true);
				Static268.aClass158_62 = Static240.method3731(true, 27, false);
				Static360.aClass158_77 = Static240.method3731(true, 28, true);
				Static315.aClass158_56 = Static240.method3731(true, 29, false);
				Static417.aString65 = Static402.aClass231_103.method5138(Static382.anInt6289);
				Static402.anInt6639 = 15;
				Static103.anInt1841 = 30;
			} else {
				Static417.aString65 = Static126.aClass231_82.method5138(Static382.anInt6289);
				Static402.anInt6639 = 12;
			}
		} else if (Static103.anInt1841 == 30) {
			local10 = 0;
			for (local55 = 0; local55 < 30; local55++) {
				local10 += Static420.aClass96_Sub1Array1[local55].method4062() * Static271.anIntArray407[local55] / 100;
			}
			if (local10 == 100) {
				Static417.aString65 = Static445.aClass231_114.method5138(Static382.anInt6289);
				Static402.anInt6639 = 20;
				Static206.method3221(Static76.aClass158_17);
				Static105.method1767(Static76.aClass158_17);
				Static103.anInt1841 = 40;
			} else {
				if (local10 != 0) {
					Static417.aString65 = Static190.aClass231_54.method5138(Static382.anInt6289) + local10 + "%";
				}
				Static402.anInt6639 = 20;
			}
		} else if (Static103.anInt1841 == 40) {
			if (Static360.aClass158_77.method3685()) {
				this.method1024(Static360.aClass158_77.method3691(1));
				Static417.aString65 = Static254.aClass231_70.method5138(Static382.anInt6289);
				Static402.anInt6639 = 25;
				Static103.anInt1841 = 50;
			} else {
				Static417.aString65 = Static44.aClass231_14.method5138(Static382.anInt6289) + Static360.aClass158_77.method3688() + "%";
				Static402.anInt6639 = 25;
			}
		} else if (Static103.anInt1841 == 50) {
			Static209.method3260();
			Static417.aString65 = Static139.aClass231_58.method5138(Static382.anInt6289);
			Static103.anInt1841 = 60;
			Static402.anInt6639 = 30;
		} else if (Static103.anInt1841 == 60) {
			local10 = Static217.method3362(Static241.aClass158_55, Static76.aClass158_17);
			local55 = Static381.method5251();
			if (local55 > local10) {
				Static417.aString65 = Static183.aClass231_97.method5138(Static382.anInt6289) + local10 * 100 / local55 + "%";
				Static402.anInt6639 = 35;
			} else {
				Static417.aString65 = Static443.aClass231_113.method5138(Static382.anInt6289);
				Static402.anInt6639 = 35;
				Static103.anInt1841 = 70;
			}
		} else if (Static103.anInt1841 == 70) {
			local10 = Static269.method4106(Static76.aClass158_17);
			local55 = Static247.method3807();
			if (local10 < local55) {
				Static417.aString65 = Static412.aClass231_106.method5138(Static382.anInt6289) + local10 * 100 / local55 + "%";
				Static402.anInt6639 = 40;
			} else {
				Static417.aString65 = Static255.aClass231_77.method5138(Static382.anInt6289);
				Static402.anInt6639 = 40;
				Static103.anInt1841 = 80;
			}
		} else if (Static103.anInt1841 == 80) {
			if (Static52.aClass158_13.method3685()) {
				Static265.anInterface11_7 = new Class108(Static52.aClass158_13, Static63.aClass158_15, Static76.aClass158_17);
				Static417.aString65 = Static193.aClass231_56.method5138(Static382.anInt6289);
				Static103.anInt1841 = 90;
				Static402.anInt6639 = 45;
			} else {
				Static417.aString65 = Static423.aClass231_110.method5138(Static382.anInt6289) + Static52.aClass158_13.method3688() + "%";
				Static402.anInt6639 = 45;
			}
		} else if (Static103.anInt1841 == 90) {
			Static417.aString65 = Static402.aClass231_104.method5138(Static382.anInt6289);
			Static103.anInt1841 = 95;
			Static402.anInt6639 = 50;
		} else if (Static103.anInt1841 == 95) {
			if (Static8.aClass173_Sub1_1.aBoolean310) {
				Static8.aClass173_Sub1_1.anInt4418 = 0;
				Static8.aClass173_Sub1_1.anInt4413 = 0;
				Static8.aClass173_Sub1_1.anInt4417 = 0;
				Static8.aClass173_Sub1_1.anInt4409 = 1;
				Static8.aClass173_Sub1_1.anInt4408 = 0;
			}
			Static8.aClass173_Sub1_1.aBoolean310 = true;
			Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
			Static301.method2521(false, Static8.aClass173_Sub1_1.anInt4408);
			Static417.aString65 = Static216.aClass231_67.method5138(Static382.anInt6289);
			Static103.anInt1841 = 100;
			Static402.anInt6639 = 55;
		} else if (Static103.anInt1841 == 100) {
			Static46.method4884(Static241.aClass158_55, Static44.aClass28_14, Static76.aClass158_17);
			Static417.aString65 = Static5.aClass231_1.method5138(Static382.anInt6289);
			Static402.anInt6639 = 60;
			Static260.method4007(5);
			Static103.anInt1841 = 110;
		} else if (Static103.anInt1841 == 110) {
			Static435.aClass158_94.method3685();
			local10 = Static435.aClass158_94.method3688();
			Static312.aClass158_68.method3685();
			local10 += Static312.aClass158_68.method3688();
			Static250.aClass158_58.method3685();
			local10 += Static250.aClass158_58.method3688();
			Static129.aClass158_29.method3685();
			local10 += Static129.aClass158_29.method3688();
			Static85.aClass158_22.method3685();
			local10 += Static85.aClass158_22.method3688();
			Static197.aClass158_42.method3685();
			local10 += Static197.aClass158_42.method3688();
			Static20.aClass158_6.method3685();
			local10 += Static20.aClass158_6.method3688();
			Static337.aClass158_70.method3685();
			local10 += Static337.aClass158_70.method3688();
			Static363.aClass158_81.method3685();
			local10 += Static363.aClass158_81.method3688();
			Static382.aClass158_82.method3685();
			local10 += Static382.aClass158_82.method3688();
			Static268.aClass158_62.method3685();
			local10 += Static268.aClass158_62.method3688();
			Static315.aClass158_56.method3685();
			local10 += Static315.aClass158_56.method3688();
			if (local10 < 1200) {
				Static417.aString65 = Static206.aClass231_63.method5138(Static382.anInt6289) + local10 / 12 + "%";
				Static402.anInt6639 = 65;
			} else {
				Static414.aClass258_2 = new Class258(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static255.aClass222_1 = new Class222(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static187.aClass145_1 = new Class145(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94, Static76.aClass158_17);
				Static35.aClass122_1 = new Class122(Static323.aClass44_4, Static382.anInt6289, Static250.aClass158_58);
				Static156.aClass146_3 = new Class146(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static412.aClass169_5 = new Class169(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static167.aClass223_1 = new Class223(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94, Static223.aClass158_51);
				Static172.aClass16_1 = new Class16(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static221.aClass72_1 = new Class72(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static113.aClass127_2 = new Class127(Static323.aClass44_4, Static382.anInt6289, true, Static312.aClass158_68, Static223.aClass158_51);
				Static171.aClass254_3 = new Class254(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94, Static76.aClass158_17);
				Static405.aClass190_4 = new Class190(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94, Static76.aClass158_17);
				Static336.aClass59_2 = new Class59(Static323.aClass44_4, Static382.anInt6289, true, Static129.aClass158_29, Static223.aClass158_51);
				Static354.aClass170_2 = new Class170(Static323.aClass44_4, Static382.anInt6289, true, Static414.aClass258_2, Static85.aClass158_22, Static223.aClass158_51);
				Static320.aClass116_1 = new Class116(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static244.aClass174_2 = new Class174(Static323.aClass44_4, Static382.anInt6289, Static197.aClass158_42, Static100.aClass158_8, Static367.aClass158_90);
				Static187.aClass217_1 = new Class217(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static251.aClass147_1 = new Class147(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static93.aClass70_1 = new Class70(Static323.aClass44_4, Static382.anInt6289, Static20.aClass158_6, Static223.aClass158_51);
				Static333.aClass50_3 = new Class50(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static93.aClass1_1 = new Class1(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static255.aClass199_1 = new Class199(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static427.aClass58_1 = new Class58(Static323.aClass44_4, Static382.anInt6289, Static337.aClass158_70);
				Static91.aClass43_1 = new Class43(Static323.aClass44_4, Static382.anInt6289, Static435.aClass158_94);
				Static19.method274(Static429.aClass158_93, Static76.aClass158_17, Static223.aClass158_51, Static241.aClass158_55);
				Static326.method4620(Static315.aClass158_56);
				Static380.aClass151_1 = new Class151(Static382.anInt6289, Static363.aClass158_81, Static382.aClass158_82);
				Static327.aClass129_2 = new Class129(Static382.anInt6289, Static363.aClass158_81, Static382.aClass158_82, new Class177());
				Static417.aString65 = Static252.aClass231_75.method5138(Static382.anInt6289);
				Static402.anInt6639 = 65;
				Static306.method3205();
				Static113.aClass127_2.method2822(!Static8.aClass173_Sub1_1.method3965(Static155.anInt2774));
				Static71.aClass126_1 = new Class126();
				Static263.method4044();
				Static257.method3952(Static268.aClass158_62);
				Static160.method2637(Static223.aClass158_51, Static265.anInterface11_7);
				Static103.anInt1841 = 120;
			}
		} else if (Static103.anInt1841 == 120) {
			local10 = Static321.method4568(Static76.aClass158_17);
			local55 = Static139.method3082();
			if (local55 > local10) {
				Static417.aString65 = Static120.aClass231_33.method5138(Static382.anInt6289) + local10 * 100 / local55 + "%";
				Static402.anInt6639 = 70;
			} else {
				Static339.method4786(Static44.aClass28_14, Static76.aClass158_17);
				Static111.method1828(Static205.aClass12Array3);
				Static417.aString65 = Static402.aClass231_105.method5138(Static382.anInt6289);
				Static402.anInt6639 = 70;
				Static103.anInt1841 = 130;
			}
		} else if (Static103.anInt1841 == 130) {
			if (Static207.aClass158_44.method3681("huffman", "")) {
				@Pc(1207) Class183 local1207 = new Class183(Static207.aClass158_44.method3680("", "huffman"));
				Static250.method3854(local1207);
				Static417.aString65 = Static273.aClass231_84.method5138(Static382.anInt6289);
				Static402.anInt6639 = 75;
				Static103.anInt1841 = 140;
			} else {
				Static417.aString65 = Static83.aClass231_25.method5138(Static382.anInt6289) + "0%";
				Static402.anInt6639 = 75;
			}
		} else if (Static103.anInt1841 == 140) {
			if (Static429.aClass158_93.method3685()) {
				Static417.aString65 = Static19.aClass231_9.method5138(Static382.anInt6289);
				Static103.anInt1841 = 150;
				Static402.anInt6639 = 80;
			} else {
				Static417.aString65 = Static422.aClass231_109.method5138(Static382.anInt6289) + Static429.aClass158_93.method3688() + "%";
				Static402.anInt6639 = 80;
			}
		} else if (Static103.anInt1841 == 150) {
			if (Static313.aClass158_69.method3685()) {
				Static417.aString65 = Static185.aClass231_87.method5138(Static382.anInt6289);
				Static103.anInt1841 = 160;
				Static402.anInt6639 = 82;
			} else {
				Static417.aString65 = Static51.aClass231_18.method5138(Static382.anInt6289) + Static313.aClass158_69.method3688() + "%";
				Static402.anInt6639 = 82;
			}
		} else if (Static103.anInt1841 == 160) {
			if (Static241.aClass158_55.method3685()) {
				Static417.aString65 = Static118.aClass231_31.method5138(Static382.anInt6289);
				Static103.anInt1841 = 170;
				Static402.anInt6639 = 85;
			} else {
				Static417.aString65 = Static118.aClass231_31.method5138(Static382.anInt6289) + Static241.aClass158_55.method3688() + "%";
				Static402.anInt6639 = 85;
			}
		} else if (Static103.anInt1841 == 170) {
			if (Static422.aClass158_88.method3667("details")) {
				Static36.method2053(Static422.aClass158_88, Static156.aClass146_3, Static412.aClass169_5, Static113.aClass127_2, Static171.aClass254_3, Static405.aClass190_4, Static71.aClass126_1);
				Static417.aString65 = Static50.aClass231_17.method5138(Static382.anInt6289);
				Static402.anInt6639 = 89;
				Static103.anInt1841 = 180;
			} else {
				Static417.aString65 = Static21.aClass231_10.method5138(Static382.anInt6289) + Static422.aClass158_88.method3666("details") + "%";
				Static402.anInt6639 = 87;
			}
		} else if (Static103.anInt1841 == 180) {
			local10 = Static255.method3941();
			if (local10 == -1) {
				Static417.aString65 = Static321.aClass231_93.method5138(Static382.anInt6289);
				Static402.anInt6639 = 90;
			} else if (local10 == 7 || local10 == 9) {
				this.method998("worldlistfull");
				Static260.method4007(1000);
			} else if (Static301.aBoolean200) {
				Static417.aString65 = Static45.aClass231_16.method5138(Static382.anInt6289);
				Static402.anInt6639 = 90;
				Static103.anInt1841 = 190;
			} else {
				this.method998("worldlistio_" + local10);
				Static260.method4007(1000);
			}
		} else if (Static103.anInt1841 == 190) {
			Static235.anIntArray358 = new int[Static255.aClass199_1.anInt4999];
			Static434.aBooleanArray27 = new boolean[Static255.aClass199_1.anInt4999];
			Static307.aStringArray18 = new String[Static93.aClass1_1.anInt3];
			for (local10 = 0; local10 < Static255.aClass199_1.anInt4999; local10++) {
				if (Static255.aClass199_1.method4413(local10).anInt3624 == 0) {
					Static434.aBooleanArray27[local10] = true;
					Static105.anInt1912++;
				}
				Static235.anIntArray358[local10] = -1;
			}
			Static256.method3946();
			Static197.anInt3500 = Static429.aClass158_93.method3677("loginscreen");
			Static118.aClass158_26.method3700(false);
			Static280.aClass158_63.method3700(true);
			Static76.aClass158_17.method3700(true);
			Static241.aClass158_55.method3700(true);
			Static207.aClass158_44.method3700(true);
			Static429.aClass158_93.method3700(true);
			Static64.aBoolean116 = true;
			Static435.aClass158_94.anInt4036 = 2;
			Static250.aClass158_58.anInt4036 = 2;
			Static312.aClass158_68.anInt4036 = 2;
			Static129.aClass158_29.anInt4036 = 2;
			Static85.aClass158_22.anInt4036 = 2;
			Static197.aClass158_42.anInt4036 = 2;
			Static20.aClass158_6.anInt4036 = 2;
			Static369.method5142(false, Static8.aClass173_Sub1_1.anInt4409, -1, -1);
			Static417.aString65 = Static188.aClass231_53.method5138(Static382.anInt6289);
			Static103.anInt1841 = 200;
			Static402.anInt6639 = 95;
		} else if (Static103.anInt1841 == 200) {
			Static65.method1236(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method1024(@OriginalArg(0) byte[] arg0) {
		@Pc(18) Class6_Sub15 local18 = new Class6_Sub15(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(22) int local22 = local18.method3111();
					if (local22 == 0) {
						return;
					}
					if (local22 == 1) {
						@Pc(115) int[] local115 = Static105.anIntArray203 = new int[6];
						local115[0] = local18.method3108();
						local115[1] = local18.method3108();
						local115[2] = local18.method3108();
						local115[3] = local18.method3108();
						local115[4] = local18.method3108();
						local115[5] = local18.method3108();
					} else {
						@Pc(44) int local44;
						@Pc(39) int local39;
						if (local22 == 4) {
							local39 = local18.method3111();
							Static245.anIntArray378 = new int[local39];
							for (local44 = 0; local44 < local39; local44++) {
								Static245.anIntArray378[local44] = local18.method3108();
								if (Static245.anIntArray378[local44] == 65535) {
									Static245.anIntArray378[local44] = -1;
								}
							}
						} else if (local22 == 5) {
							local39 = local18.method3111();
							Static287.anIntArray434 = new int[local39];
							for (local44 = 0; local44 < local39; local44++) {
								Static287.anIntArray434[local44] = local18.method3108();
								if (Static287.anIntArray434[local44] == 65535) {
									Static287.anIntArray434[local44] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1004()) {
			return;
		}
		Static2.anInt4 = Integer.parseInt(this.getParameter("worldid"));
		Static449.aClass207_11 = Static432.method5874(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static338.method4780(Static449.aClass207_11) && Static194.aClass207_8 != Static449.aClass207_11) {
			Static449.aClass207_11 = Static194.aClass207_8;
		}
		Static35.aClass257_1 = Static421.method4465(Integer.parseInt(this.getParameter("modewhat")));
		if (Static35.aClass257_1 != Static186.aClass257_3 && Static134.aClass257_2 != Static35.aClass257_1 && Static381.aClass257_4 != Static35.aClass257_1) {
			Static35.aClass257_1 = Static381.aClass257_4;
		}
		try {
			Static382.anInt6289 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static382.anInt6289 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static70.aBoolean130 = true;
		} else {
			Static70.aBoolean130 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static89.aBoolean121 = true;
		} else {
			Static89.aBoolean121 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static171.aBoolean139 = true;
		} else {
			Static171.aBoolean139 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static323.aClass44_4 = Static193.aClass44_3;
		} else {
			Static323.aClass44_4 = Static307.aClass44_2;
		}
		try {
			Static441.anInt7213 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static441.anInt7213 = 0;
		}
		Static299.aString42 = this.getParameter("quiturl");
		Static300.aString70 = this.getParameter("settings");
		if (Static300.aString70 == null) {
			Static300.aString70 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static124.anInt3591 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static124.anInt3591 = 0;
			}
		}
		Static146.anInt2651 = Integer.parseInt(this.getParameter("colourid"));
		if (Static146.anInt2651 < 0 || Static146.anInt2651 >= Static192.aColorArray6.length) {
			Static146.anInt2651 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static208.aBoolean241 = true;
			Static181.aBoolean223 = true;
		}
		Static160.aClient1 = this;
		if (Static307.aClass44_2 == Static323.aClass44_4) {
			Static165.anInt2943 = 503;
			Static225.anInt3839 = 765;
		} else if (Static323.aClass44_4 == Static193.aClass44_3) {
			Static165.anInt2943 = 480;
			Static225.anInt3839 = 640;
		}
		this.method1000(Static35.aClass257_1.method5880() + 32, Static165.anInt2943, Static225.anInt3839);
	}
}
