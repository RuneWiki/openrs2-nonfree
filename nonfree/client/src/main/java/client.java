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

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!kk;")
	public static final Class127 aClass127_2 = new Class127("WTWIP", 3);

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	public static int anInt1195 = 0;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	public static final int anInt1197 = 0;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 24)
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static175.method3466("argument count");
			}
			Class123_Sub1.anInt3368 = Integer.parseInt(arg0[0]);
			Static114.aClass127_4 = Class12_Sub4.aClass127_7;
			if (arg0[1].equals("live")) {
				Static189.aClass209_2 = Class160.aClass209_3;
			} else if (arg0[1].equals("rc")) {
				Static189.aClass209_2 = Class121.aClass209_1;
			} else if (arg0[1].equals("wip")) {
				Static189.aClass209_2 = Class11_Sub5_Sub5.aClass209_4;
			} else {
				Static175.method3466("modewhat");
			}
			Class197.anInt5569 = Static24.method860(arg0[2]);
			if (Class197.anInt5569 == -1) {
				if (arg0[2].equals("english")) {
					Class197.anInt5569 = 0;
				} else if (arg0[2].equals("german")) {
					Class197.anInt5569 = 1;
				} else {
					Static175.method3466("language");
				}
			}
			Class162.aBoolean298 = false;
			Class185.aBoolean375 = false;
			if (arg0[3].equals("game0")) {
				Class226.aClass50_4 = Class2_Sub26.aClass50_3;
			} else if (arg0[3].equals("game1")) {
				Class226.aClass50_4 = Class2_Sub3_Sub12.aClass50_1;
			} else {
				Static175.method3466("game");
			}
			Static297.anInt5995 = 0;
			Class28.aBoolean68 = true;
			Class90_Sub1.aBoolean482 = true;
			Class59.aString17 = "";
			Class116.anInt3145 = 0;
			Class51.anInt1553 = Class226.aClass50_4.anInt1551;
			@Pc(131) client local131 = new client();
			Static135.aClient1 = local131;
			local131.method1385(Class226.aClass50_4.aString15, Static189.aClass209_2.method5283() + 32);
			Static207.aFrame1.setLocation(40, 40);
		} catch (@Pc(154) Exception local154) {
			Static241.method6254(local154, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V", line = 91)
	private void method1399(@OriginalArg(0) int arg0) {
		Static264.aClass183_3.anInt5052 = arg0;
		Static197.aClass32_8 = null;
		Static96.aClass111_1 = null;
		Class208.anInt5788 = 0;
		Static264.aClass183_3.anInt5053++;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 105)
	@Override
	protected void method1387() {
		if (Class2_Sub3_Sub35.anInt6430 == 1000) {
			return;
		}
		@Pc(18) long local18 = Static284.method5258() / 1000000L - Class109.aLong89;
		Class109.aLong89 = Static284.method5258() / 1000000L;
		@Pc(31) boolean local31 = Static183.method3311();
		if (local31 && Class252.aBoolean486 && Static280.aClass221_2 != null) {
			Static280.aClass221_2.method6318();
		}
		if (Class2_Sub3_Sub35.anInt6430 == 30 || Class2_Sub3_Sub35.anInt6430 == 10) {
			if (Class2_Sub2.aLong214 != 0L && Class2_Sub2.aLong214 < Static190.method3686()) {
				Static134.method2679(Static203.aClass177_Sub1_2.anInt4883, Static135.method2694(), false, Static203.aClass177_Sub1_2.anInt4874);
			} else if (Static177.aClass19_8.method2861() && Class89.aBoolean176) {
				Static328.method5884();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static338.aFrame2 == null) {
			@Pc(84) Container local84;
			if (Static207.aFrame1 == null) {
				local84 = Static305.aClass152_5.anApplet1;
			} else {
				local84 = Static207.aFrame1;
			}
			local92 = local84.getSize().width;
			local96 = local84.getSize().height;
			if (local84 == Static207.aFrame1) {
				@Pc(102) Insets local102 = Static207.aFrame1.getInsets();
				local92 -= local102.right + local102.left;
				local96 -= local102.top + local102.bottom;
			}
			if (Static133.anInt2660 != local92 || local96 != Static166.anInt2316) {
				if (Static177.aClass19_8 == null || Static177.aClass19_8.method2842()) {
					Static327.method5878();
				} else {
					Static133.anInt2660 = local92;
					Static166.anInt2316 = local96;
				}
				Class2_Sub2.aLong214 = Static190.method3686() + 500L;
			}
		}
		if (Static338.aFrame2 != null && !Static225.aBoolean306 && (Class2_Sub3_Sub35.anInt6430 == 30 || Class2_Sub3_Sub35.anInt6430 == 10)) {
			Static134.method2679(-1, Static203.aClass177_Sub1_2.anInt4884, false, -1);
		}
		@Pc(169) boolean local169 = false;
		if (Class2_Sub2_Sub16.aBoolean412) {
			Class2_Sub2_Sub16.aBoolean412 = false;
			local169 = true;
		}
		if (local169) {
			Static347.method6261();
		}
		if (Static177.aClass19_8 != null && Static177.aClass19_8.method2814() || Static135.method2694() != 1) {
			Static91.method2109();
		}
		if (Class2_Sub3_Sub35.anInt6430 == 0) {
			Static161.method3291(Class195.aColorArray4[Class51.anInt1553], local169, Class2_Sub3_Sub15.anInt2647, Class43.aString13, Class2_Sub3_Sub28.aColorArray3[Class51.anInt1553], Class2_Sub2_Sub4.aColorArray2[Class51.anInt1553]);
		} else if (Class2_Sub3_Sub35.anInt6430 == 5) {
			Static180.method3513(Class2_Sub3_Sub28.aColorArray3[Class51.anInt1553].getRGB(), Static177.aClass19_8, Static49.aClass130_1, Static177.aClass19_8.method2814() | local169, Class195.aColorArray4[Class51.anInt1553].getRGB(), Class2_Sub2_Sub4.aColorArray2[Class51.anInt1553].getRGB());
		} else if (Class2_Sub3_Sub35.anInt6430 == 10) {
			Static314.method5710();
		} else if (Class2_Sub3_Sub35.anInt6430 == 25 || Class2_Sub3_Sub35.anInt6430 == 28) {
			if (Class167.anInt4498 == 1) {
				if (Class2_Sub3_Sub8.anInt1586 < Class101.anInt2691) {
					Class2_Sub3_Sub8.anInt1586 = Class101.anInt2691;
				}
				local92 = (Class2_Sub3_Sub8.anInt1586 - Class101.anInt2691) * 50 / Class2_Sub3_Sub8.anInt1586;
				Static326.method5858(Static253.aClass130_4, true, Class11_Sub5_Sub3.aClass79_102.method2269(Class197.anInt5569) + "<br>(" + local92 + "%)");
			} else if (Class167.anInt4498 == 2) {
				if (Class2_Sub3_Sub20.anInt3537 < Class206.anInt5730) {
					Class2_Sub3_Sub20.anInt3537 = Class206.anInt5730;
				}
				local92 = (Class2_Sub3_Sub20.anInt3537 - Class206.anInt5730) * 50 / Class2_Sub3_Sub20.anInt3537 + 50;
				Static326.method5858(Static253.aClass130_4, true, Class11_Sub5_Sub3.aClass79_102.method2269(Class197.anInt5569) + "<br>(" + local92 + "%)");
			} else {
				Static326.method5858(Static253.aClass130_4, true, Class11_Sub5_Sub3.aClass79_102.method2269(Class197.anInt5569));
			}
		} else if (Class2_Sub3_Sub35.anInt6430 == 30) {
			Static124.method2505(local18);
		} else if (Class2_Sub3_Sub35.anInt6430 == 40) {
			Static326.method5858(Static253.aClass130_4, true, Class2_Sub3_Sub10_Sub1.aClass79_137.method2269(Class197.anInt5569) + "<br>" + Class63.aClass79_40.method2269(Class197.anInt5569));
		}
		if (Class109.anInt2804 == 3) {
			for (local92 = 0; local92 < Class109.anInt2803; local92++) {
				@Pc(398) Rectangle local398 = Class55.aRectangleArray1[local92];
				if (Class17.aBooleanArray6[local92]) {
					Static177.aClass19_8.method2870(local398.height, local398.x, local398.y, -1996553985, local398.width);
				} else if (Class243.aBooleanArray64[local92]) {
					Static177.aClass19_8.method2870(local398.height, local398.x, local398.y, -1996554240, local398.width);
				}
			}
		}
		if (Static310.method6319()) {
			Static256.method4726(Static177.aClass19_8);
		}
		if ((Class2_Sub3_Sub35.anInt6430 == 30 || Class2_Sub3_Sub35.anInt6430 == 10) && Class109.anInt2804 == 0 && Static135.method2694() == 1 && !local169 && Static200.aString34.equals("1.1")) {
			local92 = 0;
			for (local96 = 0; local96 < Class109.anInt2803; local96++) {
				if (Class243.aBooleanArray64[local96]) {
					Class243.aBooleanArray64[local96] = false;
					Class188.aRectangleArray2[local92++] = Class55.aRectangleArray1[local96];
				}
			}
			Static177.aClass19_8.method2844(Class188.aRectangleArray2, local92);
		} else if (Class2_Sub3_Sub35.anInt6430 != 0) {
			Static177.aClass19_8.method2885();
			for (local92 = 0; local92 < Class109.anInt2803; local92++) {
				Class243.aBooleanArray64[local92] = false;
			}
		}
		if (Static203.aClass177_Sub1_2.anInt4871 == 0) {
			Static214.method4024(15L);
		} else if (Static203.aClass177_Sub1_2.anInt4871 == 1) {
			Static214.method4024(10L);
		} else if (Static203.aClass177_Sub1_2.anInt4871 == 2) {
			Static214.method4024(5L);
		} else if (Static203.aClass177_Sub1_2.anInt4871 == 3) {
			Static214.method4024(2L);
		}
		if (Class11_Sub5_Sub4.aBoolean446) {
			Static2.method29();
		}
		if (Static203.aClass177_Sub1_2.aBoolean362 && Class2_Sub3_Sub35.anInt6430 == 10 && Class97.anInt2592 != -1) {
			Static203.aClass177_Sub1_2.aBoolean362 = false;
			Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1389)
	@Override
	public void init() {
		if (!this.method1390()) {
			return;
		}
		Class123_Sub1.anInt3368 = Integer.parseInt(this.getParameter("worldid"));
		Static114.aClass127_4 = Static221.method4121(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static252.method4639(Static114.aClass127_4) && Class132.aClass127_6 != Static114.aClass127_4) {
			Static114.aClass127_4 = Class132.aClass127_6;
		}
		Static189.aClass209_2 = Static123.method2486(Integer.parseInt(this.getParameter("modewhat")));
		if (Class11_Sub5_Sub5.aClass209_4 != Static189.aClass209_2 && Class121.aClass209_1 != Static189.aClass209_2 && Class160.aClass209_3 != Static189.aClass209_2) {
			Static189.aClass209_2 = Class160.aClass209_3;
		}
		try {
			Class197.anInt5569 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Class197.anInt5569 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Class162.aBoolean298 = true;
		} else {
			Class162.aBoolean298 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Class185.aBoolean375 = true;
		} else {
			Class185.aBoolean375 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			RuntimeException_Sub1.aBoolean180 = true;
		} else {
			RuntimeException_Sub1.aBoolean180 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Class226.aClass50_4 = Class2_Sub3_Sub12.aClass50_1;
		} else {
			Class226.aClass50_4 = Class2_Sub26.aClass50_3;
		}
		try {
			Class116.anInt3145 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Class116.anInt3145 = 0;
		}
		Static284.aString57 = this.getParameter("quiturl");
		Class59.aString17 = this.getParameter("settings");
		if (Class59.aString17 == null) {
			Class59.aString17 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static297.anInt5995 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static297.anInt5995 = 0;
			}
		}
		Class51.anInt1553 = Integer.parseInt(this.getParameter("colourid"));
		if (Class51.anInt1553 < 0 || Class51.anInt1553 >= Class2_Sub2_Sub4.aColorArray2.length) {
			Class51.anInt1553 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Class28.aBoolean68 = true;
			Class90_Sub1.aBoolean482 = true;
		}
		Static135.aClient1 = this;
		if (Class226.aClass50_4 == Class2_Sub26.aClass50_3) {
			Class2_Sub3_Sub23.anInt4824 = 503;
			Class171.anInt4692 = 765;
		} else if (Class226.aClass50_4 == Class2_Sub3_Sub12.aClass50_1) {
			Class2_Sub3_Sub23.anInt4824 = 480;
			Class171.anInt4692 = 640;
		}
		this.method1396(Class171.anInt4692, Static189.aClass209_2.method5283() + 32, Class2_Sub3_Sub23.anInt4824);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1491)
	@Override
	protected void method1386() {
		if (Class2_Sub3_Sub35.anInt6430 == 1000) {
			return;
		}
		Class83.anInt2345++;
		if (Class83.anInt2345 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static260.anInt5340 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Class2_Sub3_Sub7.aRandom1.setSeed((long) Static260.anInt5340);
		}
		if (Class83.anInt2345 % 50 == 0) {
			Static193.anInt3742 = Static164.anInt3344;
			Static275.anInt2434 = Static278.anInt5685;
			Static164.anInt3344 = 0;
			Static278.anInt5685 = 0;
		}
		this.method1414();
		if (Static51.aClass154_1 != null) {
			Static51.aClass154_1.method3878();
		}
		Static362.method6439();
		Static36.method1135();
		Static163.aClass123_2.method3338();
		Static210.aClass119_1.method3308();
		if (Static314.aClass131_1 != null) {
			@Pc(81) int local81 = Static314.aClass131_1.method3694();
			Class216_Sub1.anInt6051 = local81;
		}
		if (Static177.aClass19_8 != null) {
			Static177.aClass19_8.method2850((int) Static190.method3686());
		}
		Static52.method1616();
		Class2_Sub3_Sub1.anInt159 = 0;
		for (@Pc(103) Class37 local103 = Static163.aClass123_2.method3343(); local103 != null && Class2_Sub3_Sub1.anInt159 < 128; local103 = Static163.aClass123_2.method3343()) {
			if (local103.method1462() != 1) {
				@Pc(114) char local114 = local103.method1458();
				if (!Static330.method5935() || local114 != '`' && local114 != '§') {
					Class111.aClass37Array1[Class2_Sub3_Sub1.anInt159] = local103;
					Class2_Sub3_Sub1.anInt159++;
				} else if (Static310.method6319()) {
					Static298.method5479();
				} else {
					Static121.method2442();
				}
			}
		}
		Static345.aClass2_Sub24_1 = null;
		for (@Pc(163) Class2_Sub24 local163 = Static210.aClass119_1.method3309(); local163 != null; local163 = Static210.aClass119_1.method3309()) {
			@Pc(169) int local169 = local163.method5248();
			if (local169 == -1) {
				Class187.aClass135_31.method3541(local163);
			} else if (Static307.method5655(local169)) {
				Static345.aClass2_Sub24_1 = local163;
			}
		}
		if (Static310.method6319()) {
			Static98.method2211();
		}
		if (Class2_Sub3_Sub35.anInt6430 == 0) {
			this.method1413();
			Static133.method2664();
		} else if (Class2_Sub3_Sub35.anInt6430 == 5) {
			this.method1413();
			Static133.method2664();
		} else if (Class2_Sub3_Sub35.anInt6430 == 25 || Class2_Sub3_Sub35.anInt6430 == 28) {
			Static299.method5484();
		}
		if (Class2_Sub3_Sub35.anInt6430 == 10) {
			this.method1407();
			Static133.method2665();
			Static154.method3149();
			Static85.method1963();
		} else if (Class2_Sub3_Sub35.anInt6430 == 30) {
			Static128.method2551();
		} else if (Class2_Sub3_Sub35.anInt6430 == 40) {
			Static85.method1963();
			if (Class2_Sub3_Sub6.anInt1045 != -3 && Class2_Sub3_Sub6.anInt1045 != 2 && Class2_Sub3_Sub6.anInt1045 != 15) {
				Static92.method2146();
			}
		}
		Static295.method5430(Static177.aClass19_8);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1813)
	@Override
	protected void method1391() {
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2165)
	private void method1404() {
		if (Class190.anInt5350 < Static264.aClass183_3.anInt5053) {
			Class210.anInt5799 = 5 * 50 * (Static264.aClass183_3.anInt5053 - 1);
			if (Static81.anInt1841 == Static16.anInt4748) {
				Static81.anInt1841 = Static307.anInt6181;
			} else {
				Static81.anInt1841 = Static16.anInt4748;
			}
			if (Class210.anInt5799 > 3000) {
				Class210.anInt5799 = 3000;
			}
			if (Static264.aClass183_3.anInt5053 >= 2 && Static264.aClass183_3.anInt5052 == 6) {
				this.method1394("js5connect_outofdate");
				Class2_Sub3_Sub35.anInt6430 = 1000;
				return;
			}
			if (Static264.aClass183_3.anInt5053 >= 4 && Static264.aClass183_3.anInt5052 == -1) {
				this.method1394("js5crc");
				Class2_Sub3_Sub35.anInt6430 = 1000;
				return;
			}
			if (Static264.aClass183_3.anInt5053 >= 4 && (Class2_Sub3_Sub35.anInt6430 == 0 || Class2_Sub3_Sub35.anInt6430 == 5)) {
				if (Static264.aClass183_3.anInt5052 == 7 || Static264.aClass183_3.anInt5052 == 9) {
					this.method1394("js5connect_full");
				} else if (Static264.aClass183_3.anInt5052 > 0) {
					this.method1394("js5connect");
				} else {
					this.method1394("js5io");
				}
				Class2_Sub3_Sub35.anInt6430 = 1000;
				return;
			}
		}
		Class190.anInt5350 = Static264.aClass183_3.anInt5053;
		if (Class210.anInt5799 > 0) {
			Class210.anInt5799--;
			return;
		}
		try {
			if (Class208.anInt5788 == 0) {
				Static197.aClass32_8 = Static305.aClass152_5.method3752(Static201.aString36, Static81.anInt1841);
				Class208.anInt5788++;
			}
			if (Class208.anInt5788 == 1) {
				if (Static197.aClass32_8.anInt992 == 2) {
					this.method1399(1000);
					return;
				}
				if (Static197.aClass32_8.anInt992 == 1) {
					Class208.anInt5788++;
				}
			}
			if (Class208.anInt5788 == 2) {
				Static96.aClass111_1 = new Class111((Socket) Static197.aClass32_8.anObject2, Static305.aClass152_5);
				@Pc(186) Class2_Sub4 local186 = new Class2_Sub4(5);
				local186.method4843(Class2_Sub2_Sub3.aClass242_2.anInt7025);
				local186.method4814(578);
				Static96.aClass111_1.method2799(5, local186.aByteArray73);
				Class208.anInt5788++;
				Static346.aLong220 = Static190.method3686();
			}
			if (Class208.anInt5788 == 3) {
				if (Class2_Sub3_Sub35.anInt6430 == 0 || Class2_Sub3_Sub35.anInt6430 == 5 || Static96.aClass111_1.method2797() > 0) {
					@Pc(245) int local245 = Static96.aClass111_1.method2802();
					if (local245 != 0) {
						this.method1399(local245);
						return;
					}
					Class208.anInt5788++;
				} else if (Static190.method3686() - Static346.aLong220 > 30000L) {
					this.method1399(1001);
					return;
				}
			}
			if (Class208.anInt5788 == 4) {
				@Pc(278) boolean local278 = Class2_Sub3_Sub35.anInt6430 == 5 || Class2_Sub3_Sub35.anInt6430 == 10 || Class2_Sub3_Sub35.anInt6430 == 28;
				Static264.aClass183_3.method4640(Static96.aClass111_1, !local278);
				Static197.aClass32_8 = null;
				Class208.anInt5788 = 0;
				Static96.aClass111_1 = null;
			}
		} catch (@Pc(295) IOException local295) {
			this.method1399(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2331)
	private void method1407() {
		Class116.anInt3144++;
		Static349.method6275(-1, null, -1);
		Static61.method1737(-1, null, -1);
		Static286.method5279();
		Class65.anInt1874++;
		for (@Pc(27) int local27 = 0; local27 < 32768; local27++) {
			@Pc(33) Class11_Sub5_Sub2_Sub2 local33 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local27];
			if (local33 != null) {
				@Pc(39) byte local39 = local33.aClass71_1.aByte16;
				if ((local39 & 0x1) != 0) {
					@Pc(50) int local50 = local33.method4329();
					@Pc(74) int local74;
					if ((local39 & 0x2) != 0 && local33.anInt4634 == 0 && Math.random() * 1000.0D < 10.0D) {
						local74 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(82) int local82 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local74 != 0 || local82 != 0) {
							@Pc(96) int local96 = local74 + local33.anIntArray316[0];
							if (local96 < 0) {
								local96 = 0;
							} else if (Class241.anInt7020 - local50 - 1 < local96) {
								local96 = Class241.anInt7020 - local50 - 1;
							}
							@Pc(128) int local128 = local33.anIntArray317[0] + local82;
							if (local128 < 0) {
								local128 = 0;
							} else if (OutputStream_Sub1.anInt4442 - local50 - 1 < local128) {
								local128 = OutputStream_Sub1.anInt4442 - local50 - 1;
							}
							@Pc(179) int local179 = Static132.method2656(true, Class2_Sub2_Sub5.anIntArray99, local50, -1, 0, 0, Class2_Sub3_Sub18.aClass46Array1[local33.aByte78], local33.anIntArray316[0], local50, local96, Class47.anIntArray105, local50, local128, local33.anIntArray317[0]);
							if (local179 > 0) {
								if (local179 > 9) {
									local179 = 9;
								}
								for (@Pc(190) int local190 = 0; local190 < local179; local190++) {
									local33.anIntArray316[local190] = Class2_Sub2_Sub5.anIntArray99[local179 - local190 - 1];
									local33.anIntArray317[local190] = Class47.anIntArray105[local179 - local190 - 1];
									local33.aByteArray51[local190] = 1;
								}
								local33.anInt4634 = local179;
							}
						}
					}
					Static294.method5549(local33, true);
					local74 = Static67.method6020(local33);
					Static93.method2162(local74, Static16.anInt4746, Static159.anInt3225, local33);
					Static162.method3316(local33);
				}
			}
		}
		if (Class2_Sub3_Sub35.anInt6429 == 0 && Class2_Sub3_Sub15.anInt2649 == 0) {
			if (Static291.anInt5899 == 2) {
				Static207.method3918();
			} else {
				Static186.method5250();
			}
			if (Static127.anInt6765 >> 7 < 14 || Static127.anInt6765 >> 7 >= Class241.anInt7020 - 14 || Static197.anInt3773 >> 7 < 14 || Static197.anInt3773 >> 7 >= OutputStream_Sub1.anInt4442 - 14) {
				Static241.method6255();
			}
		}
		while (true) {
			@Pc(298) Class2_Sub13 local298;
			@Pc(303) Class161 local303;
			@Pc(311) Class161 local311;
			do {
				local298 = (Class2_Sub13) Class245.aClass135_43.method3550();
				if (local298 == null) {
					while (true) {
						do {
							local298 = (Class2_Sub13) Class145.aClass135_25.method3550();
							if (local298 == null) {
								while (true) {
									do {
										local298 = (Class2_Sub13) Class183.aClass135_30.method3550();
										if (local298 == null) {
											if (Class243.aClass161_14 != null) {
												Static115.method2400();
											}
											if (Class83.anInt2345 % 1500 == 0) {
												Static299.method5486();
											}
											Static239.method4429();
											if (Class2_Sub2_Sub2_Sub2.aBoolean374 && Class243.aLong221 < Static190.method3686() - 60000L) {
												Static317.method5766();
												return;
											}
											return;
										}
										local303 = local298.aClass161_3;
										if (local303.anInt4290 < 0) {
											break;
										}
										local311 = Static6.method140(local303.anInt4268);
									} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4290 >= local311.aClass161Array2.length || local303 != local311.aClass161Array2[local303.anInt4290]);
									Static185.method3592(local298);
								}
							}
							local303 = local298.aClass161_3;
							if (local303.anInt4290 < 0) {
								break;
							}
							local311 = Static6.method140(local303.anInt4268);
						} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4290 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4290] != local303);
						Static185.method3592(local298);
					}
				}
				local303 = local298.aClass161_3;
				if (local303.anInt4290 < 0) {
					break;
				}
				local311 = Static6.method140(local303.anInt4268);
			} while (local311 == null || local311.aClass161Array2 == null || local303.anInt4290 >= local311.aClass161Array2.length || local311.aClass161Array2[local303.anInt4290] != local303);
			Static185.method3592(local298);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 2536)
	private void method1408(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class2_Sub4 local14 = new Class2_Sub4(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(18) int local18 = local14.method4816();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						@Pc(109) int[] local109 = Static195.anIntArray228 = new int[6];
						local109[0] = local14.method4830();
						local109[1] = local14.method4830();
						local109[2] = local14.method4830();
						local109[3] = local14.method4830();
						local109[4] = local14.method4830();
						local109[5] = local14.method4830();
					} else {
						@Pc(38) int local38;
						@Pc(33) int local33;
						if (local18 == 4) {
							local33 = local14.method4816();
							Static110.anIntArray150 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static110.anIntArray150[local38] = local14.method4830();
								if (Static110.anIntArray150[local38] == 65535) {
									Static110.anIntArray150[local38] = -1;
								}
							}
						} else if (local18 == 5) {
							local33 = local14.method4816();
							Static301.anIntArray412 = new int[local33];
							for (local38 = 0; local38 < local33; local38++) {
								Static301.anIntArray412[local38] = local14.method4830();
								if (Static301.anIntArray412[local38] == 65535) {
									Static301.anIntArray412[local38] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2887)
	@Override
	protected void method1389() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static327.method5878();
		Static1.aClass206_1 = new Class206(Static305.aClass152_5);
		Static264.aClass183_3 = new Class183();
		if (Static114.aClass127_4 != Class132.aClass127_6) {
			Static25.aByteArrayArray3 = new byte[50][];
		}
		Static203.aClass177_Sub1_2 = new Class177_Sub1(Static305.aClass152_5);
		if (Static114.aClass127_4 == Class132.aClass127_6) {
			Static57.aString14 = this.getCodeBase().getHost();
			Static366.anInt7212 = 43594;
			Static34.anInt919 = 443;
		} else if (Static252.method4639(Static114.aClass127_4)) {
			Static57.aString14 = this.getCodeBase().getHost();
			Static366.anInt7212 = Class123_Sub1.anInt3368 + 40000;
			Static34.anInt919 = Class123_Sub1.anInt3368 + 50000;
		} else if (Class12_Sub4.aClass127_7 == Static114.aClass127_4) {
			Static366.anInt7212 = Class123_Sub1.anInt3368 + 40000;
			Static34.anInt919 = Class123_Sub1.anInt3368 + 50000;
			Static57.aString14 = "127.0.0.1";
		}
		Static16.anInt4748 = Static366.anInt7212;
		Static201.aString36 = Static57.aString14;
		Static255.anInt5144 = Static366.anInt7212;
		Static307.anInt6181 = Static34.anInt919;
		Static237.aShortArray78 = Class156.aShortArray77 = Class12_Sub6.aShortArray94 = Class104.aShortArray53 = new short[256];
		Static81.anInt1841 = Static255.anInt5144;
		if (Class152.anInt3791 == 3) {
			Class87.anInt2382 = Class123_Sub1.anInt3368;
		}
		if (Class226.aClass50_4 == Class2_Sub3_Sub12.aClass50_1) {
			Static174.aShortArrayArray6 = Class27.aShortArrayArray3;
			Class25_Sub1.anInt686 = 16777215;
			Class105.aBoolean192 = true;
			Static40.aShortArray19 = Class2_Sub15.aShortArray45;
			Canvas_Sub1.anInt5151 = 0;
			Static10.aShortArray1 = Class22.aShortArray4;
			Static328.aShortArrayArray7 = Class141.aShortArrayArray5;
		} else {
			Static40.aShortArray19 = Class93.aShortArray64;
			Static10.aShortArray1 = Class49.aShortArray122;
			Static328.aShortArrayArray7 = Class22.aShortArrayArray2;
			Static174.aShortArrayArray6 = Class236.aShortArrayArray9;
		}
		Static163.aClass123_2 = Static18.method556(Static21.aCanvas1);
		Static210.aClass119_1 = Static30.method948(Static21.aCanvas1);
		Static314.aClass131_1 = Static59.method1704();
		if (Static314.aClass131_1 != null) {
			Static314.aClass131_1.method3693(Static21.aCanvas1);
		}
		Static342.anInt6865 = Class152.anInt3791;
		try {
			if (Static305.aClass152_5.aClass204_2 != null) {
				Static103.aClass205_1 = new Class205(Static305.aClass152_5.aClass204_2, 5200, 0);
				for (@Pc(171) int local171 = 0; local171 < 29; local171++) {
					Class129.aClass205Array1[local171] = new Class205(Static305.aClass152_5.aClass204Array1[local171], 6000, 0);
				}
				Static141.aClass205_2 = new Class205(Static305.aClass152_5.aClass204_3, 6000, 0);
				Static18.aClass207_1 = new Class207(255, Static103.aClass205_1, Static141.aClass205_2, 500000);
				Static294.aClass205_6 = new Class205(Static305.aClass152_5.aClass204_1, 24, 0);
				Static305.aClass152_5.aClass204_1 = null;
				Static305.aClass152_5.aClass204_3 = null;
				Static305.aClass152_5.aClass204Array1 = null;
				Static305.aClass152_5.aClass204_2 = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static141.aClass205_2 = null;
			Static103.aClass205_1 = null;
			Static294.aClass205_6 = null;
			Static18.aClass207_1 = null;
		}
		if (Class132.aClass127_6 != Static114.aClass127_4) {
			Class2_Sub2_Sub6_Sub2.aBoolean456 = true;
		}
		Class194.aString56 = (Class2_Sub26.aClass50_3 == Class226.aClass50_4 ? Class11_Sub5_Sub2.aClass79_99 : Class11_Sub5_Sub2.aClass79_98).method2269(Class197.anInt5569);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3049)
	private void method1413() {
		@Pc(6) int local6;
		if (!Static203.aClass177_Sub1_2.aBoolean362) {
			for (local6 = 0; local6 < Class2_Sub3_Sub1.anInt159; local6++) {
				if (Class111.aClass37Array1[local6].method1458() == 's' || Class111.aClass37Array1[local6].method1458() == 'S') {
					Static203.aClass177_Sub1_2.aBoolean362 = true;
					break;
				}
			}
		}
		@Pc(55) int local55;
		if (Class208.anInt5789 == 0) {
			@Pc(45) Runtime local45 = Runtime.getRuntime();
			local55 = (int) ((local45.totalMemory() - local45.freeMemory()) / 1024L);
			@Pc(60) long local60 = Static190.method3686();
			if (Class4.aLong11 == 0L) {
				Class4.aLong11 = local60;
			}
			if (local55 > 16384 && local60 - Class4.aLong11 < 5000L) {
				if (local60 - Class11_Sub2_Sub1.aLong22 > 1000L) {
					System.gc();
					Class11_Sub2_Sub1.aLong22 = local60;
				}
				Class43.aString13 = Class210.aClass79_122.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 5;
			} else {
				Class43.aString13 = Class103.aClass79_63.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 5;
				Class208.anInt5789 = 10;
			}
		} else if (Class208.anInt5789 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Class2_Sub3_Sub18.aClass46Array1[local6] = Static23.method853(OutputStream_Sub1.anInt4442, Class241.anInt7020);
			}
			Class43.aString13 = Class78_Sub1.aClass79_46.method2269(Class197.anInt5569);
			Class208.anInt5789 = 20;
			Class2_Sub3_Sub15.anInt2647 = 10;
		} else if (Class208.anInt5789 == 20) {
			if (Static51.aClass154_1 == null) {
				Static51.aClass154_1 = new Class154(Static264.aClass183_3, Static1.aClass206_1);
			}
			if (Static51.aClass154_1.method3873()) {
				Static319.aClass197_77 = Static153.method3102(true, 0, false);
				Static33.aClass197_67 = Static153.method3102(true, 1, false);
				Static266.aClass197_71 = Static153.method3102(true, 2, false);
				Static329.aClass197_9 = Static153.method3102(true, 3, false);
				Static81.aClass197_21 = Static153.method3102(true, 4, false);
				Static265.aClass197_70 = Static153.method3102(true, 5, true);
				Static94.aClass197_23 = Static153.method3102(false, 6, true);
				Static220.aClass197_63 = Static153.method3102(true, 7, false);
				Static29.aClass197_5 = Static153.method3102(true, 8, false);
				Static301.aClass197_86 = Static153.method3102(true, 9, false);
				Static71.aClass197_18 = Static153.method3102(true, 10, false);
				Static201.aClass197_58 = Static153.method3102(true, 11, false);
				Static182.aClass197_54 = Static153.method3102(true, 12, false);
				Static235.aClass197_64 = Static153.method3102(true, 13, false);
				Static124.aClass197_32 = Static153.method3102(false, 14, false);
				Static113.aClass197_28 = Static153.method3102(true, 15, false);
				Static365.aClass197_96 = Static153.method3102(true, 16, false);
				Static210.aClass197_61 = Static153.method3102(true, 17, false);
				Static201.aClass197_57 = Static153.method3102(true, 18, false);
				Static57.aClass197_12 = Static153.method3102(true, 19, false);
				Static130.aClass197_35 = Static153.method3102(true, 20, false);
				Static162.aClass197_45 = Static153.method3102(true, 21, false);
				Static271.aClass197_75 = Static153.method3102(true, 22, false);
				Static363.aClass197_66 = Static153.method3102(true, 23, true);
				Static359.aClass197_94 = Static153.method3102(true, 24, false);
				Static130.aClass197_34 = Static153.method3102(true, 25, false);
				Static218.aClass197_47 = Static153.method3102(true, 26, true);
				Static57.aClass197_11 = Static153.method3102(true, 27, false);
				Static81.aClass197_20 = Static153.method3102(true, 28, true);
				Class43.aString13 = Class11_Sub1.aClass79_76.method2269(Class197.anInt5569);
				Class208.anInt5789 = 30;
				Class2_Sub3_Sub15.anInt2647 = 15;
			} else {
				Class43.aString13 = Class134.aClass79_78.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 12;
			}
		} else if (Class208.anInt5789 == 30) {
			local6 = 0;
			for (local55 = 0; local55 < 29; local55++) {
				local6 += Class242.aClass25_Sub1Array2[local55].method896() * Class2_Sub3_Sub26.anIntArray362[local55] / 100;
			}
			if (local6 == 100) {
				Class43.aString13 = Class2_Sub3_Sub22.aClass79_89.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 20;
				Static58.method2392(Static29.aClass197_5);
				Static41.method1359(Static29.aClass197_5);
				Class208.anInt5789 = 40;
			} else {
				if (local6 != 0) {
					Class43.aString13 = Class85.aClass79_47.method2269(Class197.anInt5569) + local6 + "%";
				}
				Class2_Sub3_Sub15.anInt2647 = 20;
			}
		} else if (Class208.anInt5789 == 40) {
			if (Static81.aClass197_20.method5074()) {
				this.method1408(Static81.aClass197_20.method5083(1));
				Class43.aString13 = Class85.aClass79_48.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 25;
				Class208.anInt5789 = 50;
			} else {
				Class43.aString13 = Class23.aClass79_18.method2269(Class197.anInt5569) + Static81.aClass197_20.method5092() + "%";
				Class2_Sub3_Sub15.anInt2647 = 25;
			}
		} else if (Class208.anInt5789 == 50) {
			Static80.method1911(Static203.aClass177_Sub1_2.aBoolean352);
			Static359.aClass2_Sub12_Sub3_3 = new Class2_Sub12_Sub3();
			Static359.aClass2_Sub12_Sub3_3.method4297();
			Static280.aClass221_2 = Static355.method6348(0, Static305.aClass152_5, Static21.aCanvas1, 22050);
			Static280.aClass221_2.method6331(Static359.aClass2_Sub12_Sub3_3);
			Static168.method3370(Static124.aClass197_32, Static113.aClass197_28, Static81.aClass197_21, Static359.aClass2_Sub12_Sub3_3);
			Static177.aClass221_1 = Static355.method6348(1, Static305.aClass152_5, Static21.aCanvas1, 2048);
			Static211.aClass2_Sub12_Sub2_2 = new Class2_Sub12_Sub2();
			Static177.aClass221_1.method6331(Static211.aClass2_Sub12_Sub2_2);
			Static277.aClass249_1 = new Class249(22050, Static331.anInt6630);
			Static90.anInt2046 = Static94.aClass197_23.method5076("scape main");
			Class43.aString13 = Class2_Sub3_Sub37.aClass79_144.method2269(Class197.anInt5569);
			Class2_Sub3_Sub15.anInt2647 = 30;
			Class208.anInt5789 = 60;
		} else if (Class208.anInt5789 == 60) {
			local6 = Static60.method1709(Static235.aClass197_64, Static29.aClass197_5);
			local55 = Static203.method1090();
			if (local55 > local6) {
				Class43.aString13 = Class185.aClass79_109.method2269(Class197.anInt5569) + local6 * 100 / local55 + "%";
				Class2_Sub3_Sub15.anInt2647 = 35;
			} else {
				Class43.aString13 = Class49_Sub1_Sub1.aClass79_53.method2269(Class197.anInt5569);
				Class208.anInt5789 = 70;
				Class2_Sub3_Sub15.anInt2647 = 35;
			}
		} else if (Class208.anInt5789 == 70) {
			local6 = Static310.method6334(Static29.aClass197_5);
			local55 = Static31.method991();
			if (local6 < local55) {
				Class43.aString13 = Canvas_Sub1.aClass79_111.method2269(Class197.anInt5569) + local6 * 100 / local55 + "%";
				Class2_Sub3_Sub15.anInt2647 = 40;
			} else {
				Class43.aString13 = Class141.aClass79_80.method2269(Class197.anInt5569);
				Class208.anInt5789 = 80;
				Class2_Sub3_Sub15.anInt2647 = 40;
			}
		} else if (Class208.anInt5789 == 80) {
			if (Static218.aClass197_47.method5074()) {
				Static120.anInterface2_4 = new Class99(Static218.aClass197_47, Static301.aClass197_86, Static29.aClass197_5);
				Class43.aString13 = Class2_Sub3_Sub31.aClass79_123.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 45;
				Class208.anInt5789 = 90;
			} else {
				Class43.aString13 = Class11_Sub1.aClass79_77.method2269(Class197.anInt5569) + Static218.aClass197_47.method5092() + "%";
				Class2_Sub3_Sub15.anInt2647 = 45;
			}
		} else if (Class208.anInt5789 == 90) {
			Class43.aString13 = Class169.aClass79_100.method2269(Class197.anInt5569);
			Class208.anInt5789 = 95;
			Class2_Sub3_Sub15.anInt2647 = 50;
		} else if (Class208.anInt5789 == 95) {
			if (Static203.aClass177_Sub1_2.aBoolean362) {
				Static203.aClass177_Sub1_2.anInt4884 = 1;
				Static203.aClass177_Sub1_2.anInt4868 = 0;
				Static203.aClass177_Sub1_2.anInt4875 = 0;
				Static203.aClass177_Sub1_2.anInt4873 = 0;
				Static203.aClass177_Sub1_2.anInt4881 = 0;
			}
			Static203.aClass177_Sub1_2.aBoolean362 = true;
			Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
			Static232.method4366(false, Static203.aClass177_Sub1_2.anInt4868);
			Class43.aString13 = Class2_Sub3_Sub10_Sub1.aClass79_138.method2269(Class197.anInt5569);
			Class2_Sub3_Sub15.anInt2647 = 55;
			Class208.anInt5789 = 100;
		} else if (Class208.anInt5789 == 100) {
			Static219.method4103(Static29.aClass197_5, Static235.aClass197_64, Static177.aClass19_8);
			Class43.aString13 = Class2_Sub22.aClass79_73.method2269(Class197.anInt5569);
			Class2_Sub3_Sub15.anInt2647 = 60;
			Static313.method5706(5);
			Class208.anInt5789 = 110;
		} else if (Class208.anInt5789 == 110) {
			Static266.aClass197_71.method5074();
			local6 = Static266.aClass197_71.method5092();
			Static365.aClass197_96.method5074();
			local6 += Static365.aClass197_96.method5092();
			Static210.aClass197_61.method5074();
			local6 += Static210.aClass197_61.method5092();
			Static201.aClass197_57.method5074();
			local6 += Static201.aClass197_57.method5092();
			Static57.aClass197_12.method5074();
			local6 += Static57.aClass197_12.method5092();
			Static130.aClass197_35.method5074();
			local6 += Static130.aClass197_35.method5092();
			Static162.aClass197_45.method5074();
			local6 += Static162.aClass197_45.method5092();
			Static271.aClass197_75.method5074();
			local6 += Static271.aClass197_75.method5092();
			Static359.aClass197_94.method5074();
			local6 += Static359.aClass197_94.method5092();
			Static130.aClass197_34.method5074();
			local6 += Static130.aClass197_34.method5092();
			Static57.aClass197_11.method5074();
			local6 += Static57.aClass197_11.method5092();
			if (local6 < 1100) {
				Class43.aString13 = Class30.aClass79_22.method2269(Class197.anInt5569) + local6 / 11 + "%";
				Class2_Sub3_Sub15.anInt2647 = 65;
			} else {
				Static338.aClass18_2 = new Class18(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static55.aClass7_1 = new Class7(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static206.aClass150_3 = new Class150(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71, Static29.aClass197_5);
				Static131.aClass109_1 = new Class109(Class226.aClass50_4, Class197.anInt5569, Static210.aClass197_61);
				Static37.aClass72_3 = new Class72(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static313.aClass241_5 = new Class241(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static21.aClass55_1 = new Class55(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71, Static220.aClass197_63);
				Static166.aClass51_3 = new Class51(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static84.aClass190_3 = new Class190(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static334.aClass202_4 = new Class202(Class226.aClass50_4, Class197.anInt5569, true, Static365.aClass197_96, Static220.aClass197_63);
				Static219.aClass125_1 = new Class125(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71, Static29.aClass197_5);
				Static297.aClass104_2 = new Class104(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71, Static29.aClass197_5);
				Static6.aClass219_1 = new Class219(Class226.aClass50_4, Class197.anInt5569, true, Static201.aClass197_57, Static220.aClass197_63);
				Static290.aClass107_2 = new Class107(Class226.aClass50_4, Class197.anInt5569, true, Static338.aClass18_2, Static57.aClass197_12, Static220.aClass197_63);
				Static264.aClass233_1 = new Class233(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static37.aClass85_1 = new Class85(Class226.aClass50_4, Class197.anInt5569, Static130.aClass197_35, Static319.aClass197_77, Static33.aClass197_67);
				Static9.aClass213_1 = new Class213(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static255.aClass160_1 = new Class160(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static299.aClass211_2 = new Class211(Class226.aClass50_4, Class197.anInt5569, Static162.aClass197_45, Static220.aClass197_63);
				Static342.aClass132_1 = new Class132(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static171.aClass193_2 = new Class193(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static152.aClass45_1 = new Class45(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static299.aClass128_1 = new Class128(Class226.aClass50_4, Class197.anInt5569, Static271.aClass197_75);
				Static52.aClass199_1 = new Class199(Class226.aClass50_4, Class197.anInt5569, Static266.aClass197_71);
				Static119.method5703(Static235.aClass197_64, Static220.aClass197_63, Static329.aClass197_9, Static29.aClass197_5);
				Static302.method5545(new Class83(), Static359.aClass197_94, Static130.aClass197_34);
				Static110.method2368(Static359.aClass197_94, Static130.aClass197_34);
				Class43.aString13 = Class49_Sub2_Sub1.aClass79_130.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 65;
				Static147.method2800();
				Static334.aClass202_4.method5161(!Static203.aClass177_Sub1_2.method4496(Class2_Sub10.anInt1760));
				Static199.aClass226_1 = new Class226();
				Static163.method1508();
				Static356.method6363(Static57.aClass197_11);
				Static269.method5038(Static120.anInterface2_4, Static220.aClass197_63);
				Class208.anInt5789 = 120;
			}
		} else if (Class208.anInt5789 == 120) {
			local6 = Static125.method2511(Static29.aClass197_5);
			local55 = Static234.method4376();
			if (local55 > local6) {
				Class43.aString13 = Class85.aClass79_49.method2269(Class197.anInt5569) + local6 * 100 / local55 + "%";
				Class2_Sub3_Sub15.anInt2647 = 70;
			} else {
				Static41.method1358(Static177.aClass19_8, Static29.aClass197_5);
				Static135.method2693(Static117.aClass13Array27);
				Class43.aString13 = Class123.aClass79_72.method2269(Class197.anInt5569);
				Class208.anInt5789 = 130;
				Class2_Sub3_Sub15.anInt2647 = 70;
			}
		} else if (Class208.anInt5789 == 130) {
			if (Static71.aClass197_18.method5099("huffman", "")) {
				@Pc(1242) Class140 local1242 = new Class140(Static71.aClass197_18.method5085("huffman", ""));
				Static311.method5688(local1242);
				Class43.aString13 = Class96.aClass79_59.method2269(Class197.anInt5569);
				Class208.anInt5789 = 140;
				Class2_Sub3_Sub15.anInt2647 = 75;
			} else {
				Class43.aString13 = Class207.aClass79_121.method2269(Class197.anInt5569) + "0%";
				Class2_Sub3_Sub15.anInt2647 = 75;
			}
		} else if (Class208.anInt5789 == 140) {
			if (Static329.aClass197_9.method5074()) {
				Class43.aString13 = Class49.aClass79_128.method2269(Class197.anInt5569);
				Class208.anInt5789 = 150;
				Class2_Sub3_Sub15.anInt2647 = 80;
			} else {
				Class43.aString13 = Class157.aClass79_90.method2269(Class197.anInt5569) + Static329.aClass197_9.method5092() + "%";
				Class2_Sub3_Sub15.anInt2647 = 80;
			}
		} else if (Class208.anInt5789 == 150) {
			if (Static182.aClass197_54.method5074()) {
				Class43.aString13 = Class2_Sub3_Sub35.aClass79_134.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 82;
				Class208.anInt5789 = 160;
			} else {
				Class43.aString13 = Class52.aClass79_35.method2269(Class197.anInt5569) + Static182.aClass197_54.method5092() + "%";
				Class2_Sub3_Sub15.anInt2647 = 82;
			}
		} else if (Class208.anInt5789 == 160) {
			if (Static235.aClass197_64.method5074()) {
				Class43.aString13 = Class218.aClass79_126.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 85;
				Class208.anInt5789 = 170;
			} else {
				Class43.aString13 = Class218.aClass79_126.method2269(Class197.anInt5569) + Static235.aClass197_64.method5092() + "%";
				Class2_Sub3_Sub15.anInt2647 = 85;
			}
		} else if (Class208.anInt5789 == 170) {
			if (Static363.aClass197_66.method5073("details")) {
				Static321.method5513(Static363.aClass197_66, Static37.aClass72_3, Static313.aClass241_5, Static334.aClass202_4, Static219.aClass125_1, Static297.aClass104_2, Static199.aClass226_1);
				Class43.aString13 = Class202.aClass79_118.method2269(Class197.anInt5569);
				Class208.anInt5789 = 180;
				Class2_Sub3_Sub15.anInt2647 = 89;
			} else {
				Class43.aString13 = Class2_Sub2_Sub10_Sub1.aClass79_68.method2269(Class197.anInt5569) + Static363.aClass197_66.method5086("details") + "%";
				Class2_Sub3_Sub15.anInt2647 = 87;
			}
		} else if (Class208.anInt5789 == 180) {
			local6 = Static296.method5431();
			if (local6 == -1) {
				Class43.aString13 = Class2_Sub31.aClass79_117.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 90;
			} else if (local6 == 7 || local6 == 9) {
				this.method1394("worldlistfull");
				Static313.method5706(1000);
			} else if (Class55.aBoolean130) {
				Class43.aString13 = Class224.aClass79_133.method2269(Class197.anInt5569);
				Class2_Sub3_Sub15.anInt2647 = 90;
				Class208.anInt5789 = 190;
			} else {
				this.method1394("worldlistio_" + local6);
				Static313.method5706(1000);
			}
		} else if (Class208.anInt5789 == 190) {
			Static83.aBooleanArray18 = new boolean[Static152.aClass45_1.anInt1464];
			Static71.aStringArray11 = new String[Static171.aClass193_2.anInt5482];
			Static71.anIntArray117 = new int[Static152.aClass45_1.anInt1464];
			for (local6 = 0; local6 < Static152.aClass45_1.anInt1464; local6++) {
				if (Static152.aClass45_1.method1625(local6).anInt1257 == 0) {
					Static83.aBooleanArray18[local6] = true;
					Class2_Sub2_Sub7.anInt2291++;
				}
				Static71.anIntArray117[local6] = -1;
			}
			Static295.method5426();
			Static365.anInt7203 = Static329.aClass197_9.method5076("loginscreen");
			Static265.aClass197_70.method5071(false);
			Static94.aClass197_23.method5071(true);
			Static29.aClass197_5.method5071(true);
			Static235.aClass197_64.method5071(true);
			Static71.aClass197_18.method5071(true);
			Static329.aClass197_9.method5071(true);
			Class11_Sub5_Sub4.aBoolean446 = true;
			Static266.aClass197_71.anInt5546 = 2;
			Static210.aClass197_61.anInt5546 = 2;
			Static365.aClass197_96.anInt5546 = 2;
			Static201.aClass197_57.anInt5546 = 2;
			Static57.aClass197_12.anInt5546 = 2;
			Static130.aClass197_35.anInt5546 = 2;
			Static162.aClass197_45.anInt5546 = 2;
			Static134.method2679(-1, Static203.aClass177_Sub1_2.anInt4884, false, -1);
			Class43.aString13 = Class55.aClass79_36.method2269(Class197.anInt5569);
			Class208.anInt5789 = 200;
			Class2_Sub3_Sub15.anInt2647 = 95;
		} else if (Class208.anInt5789 == 200) {
			Static47.method1527(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 3616)
	private void method1414() {
		@Pc(21) boolean local21 = Static264.aClass183_3.method4641();
		if (!local21) {
			this.method1404();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 3637)
	@Override
	protected void method1388() {
		if (Class2_Sub2_Sub2_Sub2.aBoolean374) {
			Static317.method5766();
		}
		if (Static177.aClass19_8 != null) {
			Static177.aClass19_8.method2827();
		}
		if (Static338.aFrame2 != null) {
			Static17.method4216(Static338.aFrame2, Static305.aClass152_5);
			Static338.aFrame2 = null;
		}
		if (Static312.aClass111_4 != null) {
			Static312.aClass111_4.method2801();
			Static312.aClass111_4 = null;
		}
		if (Static314.aClass131_1 != null) {
			Static314.aClass131_1.method3692(Static21.aCanvas1);
		}
		Static314.aClass131_1 = null;
		if (Static280.aClass221_2 != null) {
			Static280.aClass221_2.method6327();
		}
		if (Static177.aClass221_1 != null) {
			Static177.aClass221_1.method6327();
		}
		Static264.aClass183_3.method4646();
		Static1.aClass206_1.method5229();
		if (Class3_Sub1.aClass162_1 != null) {
			Class3_Sub1.aClass162_1.method4116();
			Class3_Sub1.aClass162_1 = null;
		}
	}
}
