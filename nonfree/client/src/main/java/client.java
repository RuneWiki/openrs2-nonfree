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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!jn;")
	public static final Class179 lb = new Class179(1, -1);

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static612.method8434("Argument count");
			}
			Static506.aClass354_5 = new Class354();
			Static506.aClass354_5.anInt9837 = Integer.parseInt(arg0[0]);
			Static305.aClass354_2 = new Class354();
			Static305.aClass354_2.anInt9837 = Integer.parseInt(arg0[1]);
			Static466.aClass354_4 = new Class354();
			Static466.aClass354_4.anInt9837 = Integer.parseInt(arg0[2]);
			Static74.aClass104_2 = Static120.aClass104_5;
			if (arg0[3].equals("live")) {
				Static14.aClass286_1 = Static177.aClass286_3;
			} else if (arg0[3].equals("rc")) {
				Static14.aClass286_1 = Static104.aClass286_2;
			} else if (arg0[3].equals("wip")) {
				Static14.aClass286_1 = Static265.aClass286_4;
			} else {
				Static612.method8434("modewhat");
			}
			Static616.anInt10077 = Static455.method6580(arg0[4]);
			if (Static616.anInt10077 == -1) {
				if (arg0[4].equals("english")) {
					Static616.anInt10077 = 0;
				} else if (arg0[4].equals("german")) {
					Static616.anInt10077 = 1;
				} else {
					Static612.method8434("language");
				}
			}
			Static301.aBoolean334 = false;
			Static329.aBoolean421 = false;
			if (arg0[5].equals("game0")) {
				Static457.aClass176_6 = Static615.aClass176_7;
			} else if (arg0[5].equals("game1")) {
				Static457.aClass176_6 = Static427.aClass176_5;
			} else if (arg0[5].equals("game2")) {
				Static457.aClass176_6 = Static379.aClass176_4;
			} else if (arg0[5].equals("game3")) {
				Static457.aClass176_6 = Static217.aClass176_2;
			} else {
				Static612.method8434("game");
			}
			Static429.aBoolean694 = true;
			Static272.aBoolean295 = true;
			Static483.anInt8262 = 0;
			Static259.aString53 = null;
			Static506.anInt8485 = 0;
			Static645.aBoolean726 = false;
			Static434.anInt7423 = 0;
			Static106.aLong65 = 0L;
			Static355.aString76 = null;
			Static345.aBoolean392 = false;
			Static654.anInt2126 = Static457.aClass176_6.anInt4801;
			Static245.aString52 = "";
			@Pc(183) client local183 = new client();
			Static563.aClient1 = local183;
			local183.method1427(Static457.aClass176_6.aString57, Static14.aClass286_1.method7017() + 32);
			Static293.aFrame3.setLocation(40, 40);
		} catch (@Pc(206) Exception local206) {
			Static664.method9007(local206, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1430() {
		if (Static345.aBoolean392) {
			Static549.anInt9246 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static464.method6863();
		Static626.aClass80_3 = new Class80(Static569.aClass380_6);
		Static424.aClass73_2 = new Class73();
		Static292.method4191(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static648.aClass104_9 != Static74.aClass104_2) {
			Static489.aByteArrayArray24 = new byte[50][];
		}
		Static96.aClass6_Sub22_7 = Static430.method8456();
		if (Static648.aClass104_9 == Static74.aClass104_2) {
			Static506.aClass354_5.aString135 = this.getCodeBase().getHost();
		} else if (Static487.method7076(Static74.aClass104_2)) {
			Static506.aClass354_5.aString135 = this.getCodeBase().getHost();
			Static506.aClass354_5.anInt9840 = Static506.aClass354_5.anInt9837 + 40000;
			Static305.aClass354_2.anInt9840 = Static305.aClass354_2.anInt9837 + 40000;
			Static506.aClass354_5.anInt9834 = Static506.aClass354_5.anInt9837 + 50000;
			Static466.aClass354_4.anInt9840 = Static466.aClass354_4.anInt9837 + 40000;
			Static305.aClass354_2.anInt9834 = Static305.aClass354_2.anInt9837 + 50000;
			Static466.aClass354_4.anInt9834 = Static466.aClass354_4.anInt9837 + 50000;
		} else if (Static120.aClass104_5 == Static74.aClass104_2) {
			Static506.aClass354_5.aString135 = "127.0.0.1";
			Static305.aClass354_2.aString135 = "127.0.0.1";
			Static466.aClass354_4.aString135 = "127.0.0.1";
			Static506.aClass354_5.anInt9840 = Static506.aClass354_5.anInt9837 + 40000;
			Static305.aClass354_2.anInt9840 = Static305.aClass354_2.anInt9837 + 40000;
			Static466.aClass354_4.anInt9840 = Static466.aClass354_4.anInt9837 + 40000;
			Static506.aClass354_5.anInt9834 = Static506.aClass354_5.anInt9837 + 50000;
			Static305.aClass354_2.anInt9834 = Static305.aClass354_2.anInt9837 + 50000;
			Static466.aClass354_4.anInt9834 = Static466.aClass354_4.anInt9837 + 50000;
		}
		Static406.aClass354_3 = Static506.aClass354_5;
		Static511.aShortArray81 = Static133.aShortArray46 = Static25.aShortArray55 = Static248.aShortArray64 = new short[256];
		if (Static457.aClass176_6 == Static427.aClass176_5) {
			Static268.anInt4671 = 0;
			Static601.anInt9807 = 16777215;
			Static598.aShortArrayArray18 = Static197.aShortArrayArray12;
			Static3.aShortArrayArrayArray2 = Static134.aShortArrayArrayArray3;
			Static71.aBoolean71 = true;
		} else if (Static457.aClass176_6 == Static217.aClass176_2) {
			Static3.aShortArrayArrayArray2 = Static155.aShortArrayArrayArray4;
			Static598.aShortArrayArray18 = Static169.aShortArrayArray11;
		} else {
			Static3.aShortArrayArrayArray2 = Static362.aShortArrayArrayArray5;
			Static598.aShortArrayArray18 = Static532.aShortArrayArray17;
		}
		if (Static615.aClass176_7 == Static457.aClass176_6) {
			Static624.aBoolean712 = false;
		}
		try {
			Static280.aClipboard1 = Static563.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(223) Exception local223) {
		}
		Static170.aClass4_1 = Static466.method6903(Static140.aCanvas1);
		Static193.aClass128_1 = Static417.method6240(Static140.aCanvas1);
		try {
			if (Static569.aClass380_6.aClass114_4 != null) {
				Static43.aClass238_1 = new Class238(Static569.aClass380_6.aClass114_4, 5200, 0);
				for (@Pc(245) int local245 = 0; local245 < 37; local245++) {
					Static630.aClass238Array3[local245] = new Class238(Static569.aClass380_6.aClass114Array1[local245], 6000, 0);
				}
				Static132.aClass238_2 = new Class238(Static569.aClass380_6.aClass114_3, 6000, 0);
				Static293.aClass274_1 = new Class274(255, Static43.aClass238_1, Static132.aClass238_2, 500000);
				Static446.aClass238_7 = new Class238(Static569.aClass380_6.aClass114_2, 24, 0);
				Static569.aClass380_6.aClass114_3 = null;
				Static569.aClass380_6.aClass114_4 = null;
				Static569.aClass380_6.aClass114_2 = null;
				Static569.aClass380_6.aClass114Array1 = null;
			}
		} catch (@Pc(303) IOException local303) {
			Static132.aClass238_2 = null;
			Static43.aClass238_1 = null;
			Static293.aClass274_1 = null;
			Static446.aClass238_7 = null;
		}
		if (Static74.aClass104_2 != Static648.aClass104_9) {
			Static544.aBoolean667 = true;
		}
		Static231.aString40 = Static52.aClass41_12.method1007(Static616.anInt10077);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1434() {
		@Pc(12) String local12 = null;
		try {
			local12 = "[1)" + Static534.anInt8753 + "," + Static234.anInt4239 + "," + Static491.anInt9856 + "," + Static393.anInt6574 + "|";
			if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 != null) {
				local12 = local12 + "2)" + Static253.anInt4353 + "," + (Static534.anInt8753 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0]) + "," + (Static234.anInt4239 + Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0]) + "|";
			}
			local12 = local12 + "3)" + Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() + "|4)" + Static96.aClass6_Sub22_7.aClass29_Sub6_2.method1664() + "|5)" + Static455.method6591() + "|6)" + Static449.anInt7506 + "," + Static348.anInt5935 + "|";
			local12 = local12 + "7)" + Static96.aClass6_Sub22_7.aClass29_Sub21_1.method6967() + "|";
			local12 = local12 + "8)" + Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428() + "|";
			local12 = local12 + "9)" + Static96.aClass6_Sub22_7.aClass29_Sub25_1.method8119() + "|";
			local12 = local12 + "10)" + Static96.aClass6_Sub22_7.aClass29_Sub12_1.method4082() + "|";
			local12 = local12 + "11)" + Static96.aClass6_Sub22_7.aClass29_Sub26_1.method8504() + "|";
			local12 = local12 + "12)" + Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() + "|";
			local12 = local12 + "13)" + Static549.anInt9246 + "|";
			local12 = local12 + "14)" + Static556.anInt9319;
			if (Static296.aClass6_Sub33_1 != null) {
				local12 = local12 + "|15)" + Static296.aClass6_Sub33_1.anInt4998;
			}
			try {
				if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 2) {
					@Pc(246) Class local246 = Class.forName("java.lang.ClassLoader");
					@Pc(250) Field local250 = local246.getDeclaredField("nativeLibraries");
					@Pc(253) Class local253 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(263) Method local263 = local253.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local263.invoke(local250, Boolean.TRUE);
					@Pc(286) Vector local286 = (Vector) local250.get(client.class.getClassLoader());
					for (@Pc(288) int local288 = 0; local288 < local286.size(); local288++) {
						try {
							@Pc(294) Object local294 = local286.elementAt(local288);
							@Pc(299) Field local299 = local294.getClass().getDeclaredField("name");
							local263.invoke(local299, Boolean.TRUE);
							try {
								@Pc(314) String local314 = (String) local299.get(local294);
								if (local314 != null && local314.indexOf("sw3d.dll") != -1) {
									@Pc(327) Field local327 = local294.getClass().getDeclaredField("handle");
									local263.invoke(local327, Boolean.TRUE);
									local12 = local12 + "|16)" + Long.toHexString(local327.getLong(local294));
									local263.invoke(local327, Boolean.FALSE);
								}
							} catch (@Pc(363) Throwable local363) {
							}
							local263.invoke(local299, Boolean.FALSE);
						} catch (@Pc(375) Throwable local375) {
						}
					}
				}
			} catch (@Pc(387) Throwable local387) {
			}
			local12 = local12 + "]";
		} catch (@Pc(398) Throwable local398) {
		}
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1432() {
		if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 2) {
			this.method1462();
			return;
		}
		try {
			this.method1462();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static664.method9007(local19, local19.getMessage() + " (Recovered) " + this.method1434());
			Static211.aBoolean214 = true;
			Static646.method8805(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1450(@OriginalArg(1) int arg0) {
		Static424.aClass73_2.anInt2063++;
		Static324.aClass295_2 = null;
		Static225.anInt3839 = 0;
		Static424.aClass73_2.anInt2062 = arg0;
		Static44.aClass103_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1451() {
		if (Static556.anInt9319 == 14) {
			return;
		}
		Static90.anInt1698++;
		if (Static90.anInt1698 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static460.anInt7982 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static53.aRandom1.setSeed((long) Static460.anInt7982);
		}
		if (Static90.anInt1698 % 50 == 0) {
			Static441.anInt7472 = Static332.anInt7617;
			Static332.anInt7617 = 0;
			Static13.anInt10826 = Static296.anInt4972;
			Static296.anInt4972 = 0;
		}
		this.method1452();
		if (Static126.aClass306_10 != null) {
			Static126.aClass306_10.method7243();
		}
		Static327.method4641();
		Static645.method8800();
		Static170.aClass4_1.method1023();
		Static193.aClass128_1.method5197();
		if (Static546.aClass132_13 != null) {
			Static546.aClass132_13.method7458((int) Static566.method7936());
		}
		Static585.method8095();
		Static482.anInt8256 = 0;
		Static473.anInt8160 = 0;
		for (@Pc(100) Interface20 local100 = Static170.aClass4_1.method1025(); local100 != null; local100 = Static170.aClass4_1.method1025()) {
			@Pc(106) int local106 = local100.method1558();
			if (local106 == 2 || local106 == 3) {
				@Pc(136) char local136 = local100.method1557();
				if (Static341.method8996() && (local136 == '`' || local136 == '§' || local136 == '²')) {
					if (Static578.method8044()) {
						Static402.method5811();
					} else {
						Static653.method8880();
					}
				} else if (Static473.anInt8160 < 128) {
					Static649.anInterface20Array2[Static473.anInt8160] = local100;
					Static473.anInt8160++;
				}
			} else if (local106 == 0 && Static482.anInt8256 < 75) {
				Static352.anInterface20Array1[Static482.anInt8256] = local100;
				Static482.anInt8256++;
			}
		}
		Static551.anInt8500 = 0;
		for (@Pc(186) Class6_Sub27 local186 = Static193.aClass128_1.method5196(); local186 != null; local186 = Static193.aClass128_1.method5196()) {
			@Pc(192) int local192 = local186.method8186();
			if (local192 == -1) {
				Static655.aClass362_63.method8536(local186);
			} else if (local192 == 6) {
				Static551.anInt8500 += local186.method8185();
			} else if (Static114.method1808(local192)) {
				Static60.aClass362_8.method8536(local186);
				if (Static60.aClass362_8.method8533() > 10) {
					Static60.aClass362_8.method8531();
				}
			}
		}
		if (Static578.method8044()) {
			Static5.method175();
		}
		if (Static563.method7899(Static556.anInt9319)) {
			Static464.method6866();
			Static378.method6991();
		} else if (Static224.method3273(Static556.anInt9319)) {
			Static122.method1896();
		}
		if (Static625.method8609(Static556.anInt9319) && !Static224.method3273(Static556.anInt9319)) {
			this.method1464();
			Static213.method3110();
			Static196.method2875();
		} else if (Static261.method3800(Static556.anInt9319) && !Static224.method3273(Static556.anInt9319)) {
			this.method1464();
			Static196.method2875();
		} else if (Static556.anInt9319 == 12) {
			Static196.method2875();
		} else if (Static126.method8985(Static556.anInt9319) && !Static224.method3273(Static556.anInt9319)) {
			Static373.method5340();
		} else if (Static556.anInt9319 == 13) {
			Static196.method2875();
			if (Static182.anInt3145 != -3 && Static182.anInt3145 != 2 && Static182.anInt3145 != 15) {
				Static483.method7043(false);
			}
		}
		Static17.method472(Static546.aClass132_13);
		Static60.aClass362_8.method8531();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1452() {
		@Pc(7) boolean local7 = Static424.aClass73_2.method1811();
		if (!local7) {
			this.method1456();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1441()) {
			return;
		}
		Static506.aClass354_5 = new Class354();
		Static506.aClass354_5.anInt9837 = Integer.parseInt(this.getParameter("worldid"));
		Static305.aClass354_2 = new Class354();
		Static305.aClass354_2.anInt9837 = Integer.parseInt(this.getParameter("lobbyid"));
		Static305.aClass354_2.aString135 = this.getParameter("lobbyaddress");
		Static466.aClass354_4 = new Class354();
		Static466.aClass354_4.anInt9837 = Integer.parseInt(this.getParameter("demoid"));
		Static466.aClass354_4.aString135 = this.getParameter("demoaddress");
		Static74.aClass104_2 = Static191.method2707(Integer.parseInt(this.getParameter("modewhere")));
		if (Static74.aClass104_2 == Static120.aClass104_5) {
			Static74.aClass104_2 = Static444.aClass104_8;
		} else if (!Static487.method7076(Static74.aClass104_2) && Static648.aClass104_9 != Static74.aClass104_2) {
			Static74.aClass104_2 = Static648.aClass104_9;
		}
		Static14.aClass286_1 = Static555.method7837(Integer.parseInt(this.getParameter("modewhat")));
		if (Static265.aClass286_4 != Static14.aClass286_1 && Static14.aClass286_1 != Static104.aClass286_2 && Static14.aClass286_1 != Static177.aClass286_3) {
			Static14.aClass286_1 = Static177.aClass286_3;
		}
		try {
			Static616.anInt10077 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static616.anInt10077 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static329.aBoolean421 = true;
		} else {
			Static329.aBoolean421 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static301.aBoolean334 = true;
		} else {
			Static301.aBoolean334 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static487.aBoolean562 = true;
		} else {
			Static487.aBoolean562 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static457.aClass176_6 = Static615.aClass176_7;
			} else if (local152.equals("1")) {
				Static457.aClass176_6 = Static427.aClass176_5;
			} else if (local152.equals("2")) {
				Static457.aClass176_6 = Static379.aClass176_4;
			} else if (local152.equals("3")) {
				Static457.aClass176_6 = Static217.aClass176_2;
			}
		}
		try {
			Static506.anInt8485 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static506.anInt8485 = 0;
		}
		Static617.aString137 = this.getParameter("quiturl");
		Static245.aString52 = this.getParameter("settings");
		if (Static245.aString52 == null) {
			Static245.aString52 = "";
		}
		Static67.aBoolean67 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static483.anInt8262 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static483.anInt8262 = 0;
			}
		}
		Static654.anInt2126 = Integer.parseInt(this.getParameter("colourid"));
		if (Static654.anInt2126 < 0 || Static333.aColorArray3.length <= Static654.anInt2126) {
			Static654.anInt2126 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static429.aBoolean694 = true;
			Static272.aBoolean295 = true;
		}
		@Pc(254) String local254 = this.getParameter("frombilling");
		if (local254 != null && local254.equals("true")) {
			Static645.aBoolean726 = true;
		}
		Static259.aString53 = this.getParameter("sskey");
		if (Static259.aString53 != null && Static259.aString53.length() < 2) {
			Static259.aString53 = null;
		}
		@Pc(280) String local280 = this.getParameter("force64mb");
		if (local280 != null && local280.equals("true")) {
			Static345.aBoolean392 = true;
		}
		@Pc(292) String local292 = this.getParameter("worldflags");
		if (local292 != null) {
			try {
				Static434.anInt7423 = Integer.parseInt(local292);
			} catch (@Pc(299) Exception local299) {
			}
		}
		@Pc(304) String local304 = this.getParameter("userFlow");
		if (local304 != null) {
			try {
				Static106.aLong65 = Long.parseLong(local304);
			} catch (@Pc(311) NumberFormatException local311) {
			}
		}
		Static355.aString76 = this.getParameter("additionalInfo");
		if (Static355.aString76 != null && Static355.aString76.length() > 50) {
			Static355.aString76 = null;
		}
		if (Static615.aClass176_7 == Static457.aClass176_6) {
			Static335.anInt5755 = 503;
			Static365.anInt6242 = 765;
		} else if (Static427.aClass176_5 == Static457.aClass176_6) {
			Static335.anInt5755 = 480;
			Static365.anInt6242 = 640;
		}
		Static563.aClient1 = this;
		this.method1435(Static457.aClass176_6.aString57, Static335.anInt5755, Static365.anInt6242, Static14.aClass286_1.method7017() + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1445() {
		if (Static192.aBoolean195) {
			Static472.method6956();
		}
		Static271.method7757();
		if (Static546.aClass132_13 != null) {
			Static546.aClass132_13.method7491();
		}
		if (Static289.aFrame1 != null) {
			Static179.method2534(Static569.aClass380_6, Static289.aFrame1);
			Static289.aFrame1 = null;
		}
		if (Static163.aClass170_1 != null) {
			Static163.aClass170_1.method8770();
			Static163.aClass170_1 = null;
		}
		Static25.method2636();
		Static424.aClass73_2.method1805();
		Static626.aClass80_3.method1905();
		if (Static564.aClass301_1 != null) {
			Static564.aClass301_1.method7185();
			Static564.aClass301_1 = null;
		}
		try {
			Static43.aClass238_1.method5536();
			for (@Pc(51) int local51 = 0; local51 < 37; local51++) {
				Static630.aClass238Array3[local51].method5536();
			}
			Static132.aClass238_2.method5536();
			Static446.aClass238_7.method5536();
			Static449.method6494();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method1438() {
		if (Static180.anApplet6 != null && Static140.aCanvas1 == null && !Static569.aClass380_6.aBoolean728) {
			try {
				@Pc(17) Class local17 = Static180.anApplet6.getClass();
				@Pc(21) Field local21 = local17.getDeclaredField("canvas");
				Static140.aCanvas1 = (Canvas) local21.get(Static180.anApplet6);
				local21.set(Static180.anApplet6, (Object) null);
				if (Static140.aCanvas1 != null) {
					return;
				}
			} catch (@Pc(34) Exception local34) {
			}
		}
		super.method1438();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1456() {
		if (Static424.aClass73_2.anInt2063 > Static93.anInt7361) {
			Static406.aClass354_3.method8303();
			Static642.anInt10377 = (Static424.aClass73_2.anInt2063 * 50 - 50) * 5;
			if (Static642.anInt10377 > 3000) {
				Static642.anInt10377 = 3000;
			}
			if (Static424.aClass73_2.anInt2063 >= 2 && Static424.aClass73_2.anInt2062 == 6) {
				this.method1433("js5connect_outofdate");
				Static556.anInt9319 = 14;
				return;
			}
			if (Static424.aClass73_2.anInt2063 >= 4 && Static424.aClass73_2.anInt2062 == -1) {
				this.method1433("js5crc");
				Static556.anInt9319 = 14;
				return;
			}
			if (Static424.aClass73_2.anInt2063 >= 4 && Static563.method7899(Static556.anInt9319)) {
				if (Static424.aClass73_2.anInt2062 == 7 || Static424.aClass73_2.anInt2062 == 9) {
					this.method1433("js5connect_full");
				} else if (Static424.aClass73_2.anInt2062 <= 0) {
					this.method1433("js5io");
				} else if (Static129.aString24 == null) {
					this.method1433("js5connect");
				} else {
					this.method1433("js5proxy_" + Static129.aString24.trim());
				}
				Static556.anInt9319 = 14;
				return;
			}
		}
		Static93.anInt7361 = Static424.aClass73_2.anInt2063;
		if (Static642.anInt10377 > 0) {
			Static642.anInt10377--;
			return;
		}
		try {
			if (Static225.anInt3839 == 0) {
				Static44.aClass103_1 = Static406.aClass354_3.method8301(Static569.aClass380_6);
				Static225.anInt3839++;
			}
			if (Static225.anInt3839 == 1) {
				if (Static44.aClass103_1.anInt2541 == 2) {
					if (Static44.aClass103_1.anObject9 != null) {
						Static129.aString24 = (String) Static44.aClass103_1.anObject9;
					}
					this.method1450(1000);
					return;
				}
				if (Static44.aClass103_1.anInt2541 == 1) {
					Static225.anInt3839++;
				}
			}
			if (Static225.anInt3839 == 2) {
				Static324.aClass295_2 = new Class295((Socket) Static44.aClass103_1.anObject9, Static569.aClass380_6, 25000);
				@Pc(207) Class6_Sub23 local207 = new Class6_Sub23(5);
				local207.method8366(Static367.aClass105_2.anInt2549);
				local207.method8364(646);
				Static324.aClass295_2.method7105(5, local207.aByteArray101);
				Static225.anInt3839++;
				Static201.aLong259 = Static566.method7936();
			}
			if (Static225.anInt3839 == 3) {
				if (Static563.method7899(Static556.anInt9319) || Static324.aClass295_2.method7103() > 0) {
					@Pc(266) int local266 = Static324.aClass295_2.method7100();
					if (local266 != 0) {
						this.method1450(local266);
						return;
					}
					Static225.anInt3839++;
				} else if (Static566.method7936() - Static201.aLong259 > 30000L) {
					this.method1450(1001);
					return;
				}
			}
			if (Static225.anInt3839 == 4) {
				@Pc(300) boolean local300 = Static563.method7899(Static556.anInt9319) || Static625.method8609(Static556.anInt9319) || Static261.method3800(Static556.anInt9319);
				@Pc(303) Class392[] local303 = Static673.method9100();
				@Pc(311) Class6_Sub23 local311 = new Class6_Sub23(local303.length * 4);
				Static324.aClass295_2.method7107(local311.aByteArray101.length, local311.aByteArray101, 0);
				for (@Pc(322) int local322 = 0; local322 < local303.length; local322++) {
					local303[local322].method9103(local311.method8369());
				}
				Static424.aClass73_2.method1810(!local300, Static324.aClass295_2);
				Static225.anInt3839 = 0;
				Static324.aClass295_2 = null;
				Static44.aClass103_1 = null;
			}
		} catch (@Pc(358) IOException local358) {
			this.method1450(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1444() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method1462() {
		if (Static556.anInt9319 == 14) {
			return;
		}
		@Pc(18) long local18 = Static221.method3203() / 1000000L - Static157.aLong87;
		Static157.aLong87 = Static221.method3203() / 1000000L;
		@Pc(26) boolean local26 = Static393.method5579();
		if (local26 && Static416.aBoolean483 && Static231.aClass64_2 != null) {
			Static231.aClass64_2.method1739();
		}
		if (Static252.method3641(Static556.anInt9319)) {
			if (Static321.aLong159 != 0L && Static566.method7936() > Static321.aLong159) {
				Static138.method2063(Static455.method6591(), false, Static186.anInt3181, Static164.anInt10672);
			} else if (!Static546.aClass132_13.method7447() && Static672.aBoolean724) {
				Static154.method2171();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static289.aFrame1 == null) {
			@Pc(78) Container local78;
			if (Static293.aFrame3 != null) {
				local78 = Static293.aFrame3;
			} else if (Static180.anApplet6 == null) {
				local78 = Static131.anApplet_Sub1_1;
			} else {
				local78 = Static180.anApplet6;
			}
			local90 = local78.getSize().width;
			local94 = local78.getSize().height;
			if (Static293.aFrame3 == local78) {
				@Pc(100) Insets local100 = Static293.aFrame3.getInsets();
				local94 -= local100.bottom + local100.top;
				local90 -= local100.right + local100.left;
			}
			if (local90 != Static338.anInt5825 || Static13.anInt10825 != local94 || Static558.aBoolean680) {
				if (Static546.aClass132_13 == null || Static546.aClass132_13.method7506()) {
					Static464.method6863();
				} else {
					Static338.anInt5825 = local90;
					Static13.anInt10825 = local94;
				}
				Static321.aLong159 = Static566.method7936() + 500L;
				Static558.aBoolean680 = false;
			}
		}
		if (Static289.aFrame1 != null && !Static247.aBoolean271 && Static252.method3641(Static556.anInt9319)) {
			Static138.method2063(Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277(), false, -1, -1);
		}
		@Pc(171) boolean local171 = false;
		if (Static312.aBoolean579) {
			Static312.aBoolean579 = false;
			local171 = true;
		}
		if (local171) {
			Static240.method3600();
		}
		if (Static546.aClass132_13 != null && Static546.aClass132_13.method7447() || Static455.method6591() != 1) {
			Static509.method7248();
		}
		if (Static563.method7899(Static556.anInt9319)) {
			Static617.method8511(local171);
		} else if (Static136.method2051(Static556.anInt9319)) {
			Static210.method3099();
		} else if (Static126.method8986(Static556.anInt9319)) {
			Static210.method3099();
		} else if (Static224.method3273(Static556.anInt9319)) {
			if (Static180.anInt9944 == 1) {
				if (Static109.anInt1989 < Static604.anInt4517) {
					Static109.anInt1989 = Static604.anInt4517;
				}
				local90 = (Static109.anInt1989 - Static604.anInt4517) * 50 / Static109.anInt1989;
				Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, true, Static423.aClass19_9, Static52.aClass41_12.method1007(Static616.anInt10077) + "<br>(" + local90 + "%)");
			} else if (Static180.anInt9944 == 2) {
				if (Static104.anInt1932 > Static59.anInt1156) {
					Static59.anInt1156 = Static104.anInt1932;
				}
				local90 = (Static59.anInt1156 - Static104.anInt1932) * 50 / Static59.anInt1156 + 50;
				Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, true, Static423.aClass19_9, Static52.aClass41_12.method1007(Static616.anInt10077) + "<br>(" + local90 + "%)");
			} else {
				Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, true, Static423.aClass19_9, Static52.aClass41_12.method1007(Static616.anInt10077));
			}
		} else if (Static556.anInt9319 == 10) {
			Static267.method3978(local18);
		} else if (Static556.anInt9319 == 13) {
			Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, false, Static423.aClass19_9, Static52.aClass41_14.method1007(Static616.anInt10077) + "<br>" + Static52.aClass41_15.method1007(Static616.anInt10077));
		}
		if (Static49.anInt1033 == 3) {
			for (local90 = 0; local90 < Static65.anInt1203; local90++) {
				@Pc(374) Rectangle local374 = Class6_Sub1_Sub7.aRectangleArray2[local90];
				if (Static253.aBooleanArray15[local90]) {
					Static546.aClass132_13.method7462(-65281, local374.width, local374.x, local374.y, local374.height);
				} else if (Static504.aBooleanArray24[local90]) {
					Static546.aClass132_13.method7462(-65536, local374.width, local374.x, local374.y, local374.height);
				} else {
					Static546.aClass132_13.method7462(-16711936, local374.width, local374.x, local374.y, local374.height);
				}
			}
		}
		if (Static578.method8044()) {
			Static265.method3964(Static546.aClass132_13);
		}
		if (Static569.aClass380_6.aBoolean728 && Static252.method3641(Static556.anInt9319) && Static49.anInt1033 == 0 && Static455.method6591() == 1 && !local171) {
			local90 = 0;
			for (local94 = 0; local94 < Static65.anInt1203; local94++) {
				if (Static504.aBooleanArray24[local94]) {
					Static504.aBooleanArray24[local94] = false;
					Static82.aRectangleArray1[local90++] = Class6_Sub1_Sub7.aRectangleArray2[local94];
				}
			}
			try {
				if (Static594.aBoolean693) {
					Static50.method979(Static82.aRectangleArray1, local90);
				} else {
					Static546.aClass132_13.method7490(Static82.aRectangleArray1, local90);
				}
			} catch (@Pc(540) Exception_Sub1 local540) {
			}
		} else if (!Static563.method7899(Static556.anInt9319)) {
			for (local90 = 0; local90 < Static65.anInt1203; local90++) {
				Static504.aBooleanArray24[local90] = false;
			}
			try {
				if (Static594.aBoolean693) {
					Static375.method5344();
				} else {
					Static546.aClass132_13.method7461();
				}
			} catch (@Pc(478) Exception_Sub1 local478) {
				Static664.method9007(local478, local478.getMessage() + " (Recovered) " + this.method1434());
				Static646.method8805(0, false);
			}
		}
		Static289.method4158();
		local90 = Static96.aClass6_Sub22_7.aClass29_Sub2_1.method1397();
		if (local90 == 0) {
			Static520.method7923(15L);
		} else if (local90 == 1) {
			Static520.method7923(10L);
		} else if (local90 == 2) {
			Static520.method7923(5L);
		} else if (local90 == 3) {
			Static520.method7923(2L);
		}
		if (Static4.aBoolean6) {
			Static332.method6601();
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub19_1.method6423() == 1 && Static556.anInt9319 == 3 && Static561.anInt9357 != -1) {
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub19_1, 0);
			Static633.method8698();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method1464() {
		@Pc(23) int local23;
		if (Static556.anInt9319 == 7 && Static190.anInt3237 == 0) {
			if (Static551.anInt8501 > 1) {
				Static551.anInt8501--;
				Static61.anInt1166 = Static94.anInt1719;
			}
			if (!Static277.aBoolean303) {
				Static93.method6335();
			}
			for (local23 = 0; local23 < 100 && Static363.method5235(); local23++) {
			}
		}
		Static332.anInt7620++;
		Static159.method2243((Class321) null, -1, -1);
		Static526.method7373(-1, -1, (Class321) null);
		Static490.method7097();
		Static94.anInt1719++;
		for (local23 = 0; local23 < Static490.anInt8336; local23++) {
			@Pc(67) Class2_Sub1_Sub1_Sub3_Sub2 local67 = Static84.aClass6_Sub44Array1[local23].aClass2_Sub1_Sub1_Sub3_Sub2_2;
			if (local67 != null) {
				@Pc(73) byte local73 = local67.aClass91_1.aByte35;
				if ((local73 & 0x1) != 0) {
					@Pc(81) int local81 = local67.method4326();
					@Pc(102) int local102;
					if ((local73 & 0x2) != 0 && local67.anInt5119 == 0 && Math.random() * 1000.0D < 10.0D) {
						local102 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(110) int local110 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local102 != 0 || local110 != 0) {
							@Pc(127) int local127 = local67.anIntArray302[0] + local102;
							@Pc(134) int local134 = local110 + local67.anIntArray301[0];
							if (local127 < 0) {
								local127 = 0;
							} else if (local127 > Static491.anInt9856 - local81 - 1) {
								local127 = Static491.anInt9856 - local81 - 1;
							}
							if (local134 < 0) {
								local134 = 0;
							} else if (local134 > Static393.anInt6574 - local81 - 1) {
								local134 = Static393.anInt6574 - local81 - 1;
							}
							@Pc(208) int local208 = Static526.method7374(local67.anIntArray302[0], local134, 0, Static521.anIntArray573, local67.anIntArray301[0], local81, local81, local81, local127, -1, Static83.aClass324Array1[local67.aByte140], true, 0, Static459.anIntArray519);
							if (local208 > 0) {
								if (local208 > 9) {
									local208 = 9;
								}
								for (@Pc(222) int local222 = 0; local222 < local208; local222++) {
									local67.anIntArray302[local222] = Static459.anIntArray519[local208 - local222 - 1];
									local67.anIntArray301[local222] = Static521.anIntArray573[local208 - local222 - 1];
									local67.aByteArray51[local222] = 1;
								}
								local67.anInt5119 = local208;
							}
						}
					}
					Static635.method8719(local67, true);
					local102 = Static555.method7832(local67);
					Static29.method5712(local67);
					Static559.method7888(Static417.anInt7257, local102, Static449.anInt7502, local67);
					Static282.method4111(Static417.anInt7257, local67);
					Static148.method2141(local67);
				}
			}
		}
		if (Static190.anInt3237 == 0 && Static131.anInt2291 == 0) {
			if (Static407.anInt6820 == 2) {
				Static641.method8757();
			} else {
				Static246.method3615();
			}
			if (Static23.anInt564 >> 9 < 14 || Static491.anInt9856 - 14 <= Static23.anInt564 >> 9 || Static542.anInt9140 >> 9 < 14 || Static542.anInt9140 >> 9 >= Static393.anInt6574 - 14) {
				Static35.method855();
			}
		}
		while (true) {
			@Pc(351) Class6_Sub49 local351;
			@Pc(356) Class321 local356;
			@Pc(367) Class321 local367;
			do {
				local351 = (Class6_Sub49) Static486.aClass362_56.method8531();
				if (local351 == null) {
					while (true) {
						do {
							local351 = (Class6_Sub49) Static459.aClass362_44.method8531();
							if (local351 == null) {
								while (true) {
									do {
										local351 = (Class6_Sub49) Static296.aClass362_22.method8531();
										if (local351 == null) {
											if (Static489.aClass321_39 != null) {
												Static483.method7044();
											}
											if (Static90.anInt1698 % 1500 == 0) {
												Static105.method1717();
											}
											if (Static556.anInt9319 == 7 && Static190.anInt3237 == 0) {
												Static51.method1004();
											}
											Static614.method8484();
											if (Static192.aBoolean195 && Static84.aLong50 < Static566.method7936() - 60000L) {
												Static472.method6956();
											}
											for (@Pc(529) Class2_Sub6_Sub2 local529 = (Class2_Sub6_Sub2) Static213.aClass43_6.method1087(); local529 != null; local529 = (Class2_Sub6_Sub2) Static213.aClass43_6.method1088()) {
												if ((long) local529.anInt6138 < Static566.method7936() / 1000L - 5L) {
													if (local529.aShort81 > 0) {
														Static55.method3549("", "", "", 5, 0, local529.aString79 + Static52.aClass41_19.method1007(Static616.anInt10077));
													}
													if (local529.aShort81 == 0) {
														Static55.method3549("", "", "", 5, 0, local529.aString79 + Static52.aClass41_20.method1007(Static616.anInt10077));
													}
													local529.method8436();
												}
											}
											if (Static556.anInt9319 == 7 && Static190.anInt3237 == 0) {
												if (Static163.aClass170_1 == null) {
													Static483.method7043(false);
													return;
												}
												Static145.anInt2484++;
												if (Static145.anInt2484 > 50) {
													@Pc(634) Class6_Sub26 local634 = Static268.method3981(Static377.aClass15_2, Static55.aClass289_58);
													Static670.method9077(local634);
												}
												try {
													Static356.method5157();
													return;
												} catch (@Pc(641) IOException local641) {
													Static483.method7043(false);
													return;
												}
											}
											return;
										}
										local356 = local351.aClass321_44;
										if (local356.anInt9061 < 0) {
											break;
										}
										local367 = Static286.method4134(local356.anInt9033);
									} while (local367 == null || local367.aClass321Array1 == null || local367.aClass321Array1.length <= local356.anInt9061 || local367.aClass321Array1[local356.anInt9061] != local356);
									Static295.method4226(local351);
								}
							}
							local356 = local351.aClass321_44;
							if (local356.anInt9061 < 0) {
								break;
							}
							local367 = Static286.method4134(local356.anInt9033);
						} while (local367 == null || local367.aClass321Array1 == null || local356.anInt9061 >= local367.aClass321Array1.length || local367.aClass321Array1[local356.anInt9061] != local356);
						Static295.method4226(local351);
					}
				}
				local356 = local351.aClass321_44;
				if (local356.anInt9061 < 0) {
					break;
				}
				local367 = Static286.method4134(local356.anInt9033);
			} while (local367 == null || local367.aClass321Array1 == null || local367.aClass321Array1.length <= local356.anInt9061 || local367.aClass321Array1[local356.anInt9061] != local356);
			Static295.method4226(local351);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1431() {
		if (Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() != 2) {
			this.method1451();
			return;
		}
		try {
			this.method1451();
		} catch (@Pc(19) ThreadDeath local19) {
			throw local19;
		} catch (@Pc(22) Throwable local22) {
			Static664.method9007(local22, local22.getMessage() + " (Recovered) " + this.method1434());
			Static211.aBoolean214 = true;
			Static646.method8805(0, false);
		}
	}
}
