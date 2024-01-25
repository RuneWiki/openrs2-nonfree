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
				Static439.method6797("Argument count");
			}
			Static490.aClass280_4 = new Class280();
			Static490.aClass280_4.anInt8497 = Integer.parseInt(arg0[0]);
			Static631.aClass280_5 = new Class280();
			Static631.aClass280_5.anInt8497 = Integer.parseInt(arg0[1]);
			Static476.aClass280_3 = new Class280();
			Static476.aClass280_3.anInt8497 = Integer.parseInt(arg0[2]);
			Static277.aClass313_9 = Static253.aClass313_8;
			if (arg0[3].equals("live")) {
				Static51.aClass348_2 = Static613.aClass348_4;
			} else if (arg0[3].equals("rc")) {
				Static51.aClass348_2 = Static51.aClass348_1;
			} else if (arg0[3].equals("wip")) {
				Static51.aClass348_2 = Static558.aClass348_3;
			} else {
				Static439.method6797("modewhat");
			}
			Static372.anInt7083 = Static289.method4830(arg0[4]);
			if (Static372.anInt7083 == -1) {
				if (arg0[4].equals("english")) {
					Static372.anInt7083 = 0;
				} else if (arg0[4].equals("german")) {
					Static372.anInt7083 = 1;
				} else {
					Static439.method6797("language");
				}
			}
			Static109.aBoolean224 = false;
			Static247.aBoolean402 = false;
			if (arg0[5].equals("game0")) {
				Static18.aClass217_1 = Static207.aClass217_3;
			} else if (arg0[5].equals("game1")) {
				Static18.aClass217_1 = Static281.aClass217_4;
			} else if (arg0[5].equals("game2")) {
				Static18.aClass217_1 = Static589.aClass217_7;
			} else if (arg0[5].equals("game3")) {
				Static18.aClass217_1 = Static524.aClass217_5;
			} else {
				Static439.method6797("game");
			}
			Static358.aBoolean480 = false;
			Static193.aString58 = null;
			Static150.aBoolean273 = false;
			Static60.anInt1930 = 0;
			Static550.anInt10292 = 0;
			Static600.aString110 = null;
			Static349.anInt6743 = 0;
			Static212.aBoolean371 = true;
			Static420.aBoolean573 = true;
			Static59.anInt1905 = Static18.aClass217_1.anInt6835;
			Static254.aString54 = "";
			Static161.aLong101 = 0L;
			@Pc(182) client local182 = new client();
			Static227.aClient1 = local182;
			local182.method1916(Static51.aClass348_2.method8142() + 32, Static18.aClass217_1.aString71);
			Static602.aFrame3.setLocation(40, 40);
		} catch (@Pc(205) Exception local205) {
			Static596.method8231(null, local205);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1919() {
		if (Static435.anInt8191 == 14) {
			return;
		}
		@Pc(18) long local18 = Static376.method5846() / 1000000L - Static630.aLong279;
		Static630.aLong279 = Static376.method5846() / 1000000L;
		@Pc(26) boolean local26 = Static360.method5664();
		if (local26 && Static424.aBoolean575 && Static637.aClass80_3 != null) {
			Static637.aClass80_3.method3202();
		}
		if (Static183.method3494(Static435.anInt8191)) {
			if (Static137.aLong85 != 0L && Static137.aLong85 < Static342.method5463()) {
				Static327.method5366(Static216.anInt4998, Static644.anInt10710, Static383.method6158(), false);
			} else if (!Static171.aClass16_5.method6056() && Static11.aBoolean9) {
				Static314.method5187();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static197.aFrame1 == null) {
			@Pc(76) Container local76;
			if (Static602.aFrame3 != null) {
				local76 = Static602.aFrame3;
			} else if (Static152.anApplet1 == null) {
				local76 = Static370.anApplet_Sub1_1;
			} else {
				local76 = Static152.anApplet1;
			}
			local90 = local76.getSize().width;
			local94 = local76.getSize().height;
			if (Static602.aFrame3 == local76) {
				@Pc(100) Insets local100 = Static602.aFrame3.getInsets();
				local90 -= local100.right + local100.left;
				local94 -= local100.top + local100.bottom;
			}
			if (local90 != Static354.anInt6829 || Static69.anInt7730 != local94 || Static226.aBoolean386) {
				if (Static171.aClass16_5 == null || Static171.aClass16_5.method6055()) {
					Static163.method3266();
				} else {
					Static354.anInt6829 = local90;
					Static69.anInt7730 = local94;
				}
				Static137.aLong85 = Static342.method5463() + 500L;
				Static226.aBoolean386 = false;
			}
		}
		if (Static197.aFrame1 != null && !Static216.aBoolean372 && Static183.method3494(Static435.anInt8191)) {
			Static327.method5366(-1, -1, Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307(), false);
		}
		@Pc(172) boolean local172 = false;
		if (Static277.aBoolean412) {
			local172 = true;
			Static277.aBoolean412 = false;
		}
		if (local172) {
			Static582.method8106();
		}
		if (Static171.aClass16_5 != null && Static171.aClass16_5.method6056() || Static383.method6158() != 1) {
			Static121.method2707();
		}
		if (Static155.method3152(Static435.anInt8191)) {
			Static407.method6457(local172);
		} else if (Static281.method4757(Static435.anInt8191)) {
			Static457.method6927();
		} else if (Static103.method2361(Static435.anInt8191)) {
			Static457.method6927();
		} else if (Static351.method5556(Static435.anInt8191)) {
			if (Static201.anInt4620 == 1) {
				if (Static156.anInt3935 < Static308.anInt6237) {
					Static156.anInt3935 = Static308.anInt6237;
				}
				local90 = (Static156.anInt3935 - Static308.anInt6237) * 50 / Static156.anInt3935;
				Static500.method7268(Static634.aClass27_19, true, Static171.aClass16_5, Static121.aClass84_12.method2710(Static372.anInt7083) + "<br>(" + local90 + "%)", Static446.aClass345_13);
			} else if (Static201.anInt4620 == 2) {
				if (Static137.anInt3573 > Static146.anInt3693) {
					Static146.anInt3693 = Static137.anInt3573;
				}
				local90 = (Static146.anInt3693 - Static137.anInt3573) * 50 / Static146.anInt3693 + 50;
				Static500.method7268(Static634.aClass27_19, true, Static171.aClass16_5, Static121.aClass84_12.method2710(Static372.anInt7083) + "<br>(" + local90 + "%)", Static446.aClass345_13);
			} else {
				Static500.method7268(Static634.aClass27_19, true, Static171.aClass16_5, Static121.aClass84_12.method2710(Static372.anInt7083), Static446.aClass345_13);
			}
		} else if (Static435.anInt8191 == 10) {
			Static155.method3155(local18);
		} else if (Static435.anInt8191 == 13) {
			Static500.method7268(Static634.aClass27_19, false, Static171.aClass16_5, Static121.aClass84_14.method2710(Static372.anInt7083) + "<br>" + Static121.aClass84_15.method2710(Static372.anInt7083), Static446.aClass345_13);
		}
		if (Static22.anInt950 == 3) {
			for (local90 = 0; local90 < Static259.anInt5574; local90++) {
				@Pc(369) Rectangle local369 = Class8_Sub5_Sub1_Sub2.aRectangleArray2[local90];
				if (Static373.aBooleanArray26[local90]) {
					Static171.aClass16_5.method6086(local369.x, local369.y, -65281, local369.height, local369.width);
				} else if (Static10.aBooleanArray1[local90]) {
					Static171.aClass16_5.method6086(local369.x, local369.y, -65536, local369.height, local369.width);
				} else {
					Static171.aClass16_5.method6086(local369.x, local369.y, -16711936, local369.height, local369.width);
				}
			}
		}
		if (Static360.method5661()) {
			Static595.method8220(Static171.aClass16_5);
		}
		if (Static51.aClass118_1.aBoolean301 && Static183.method3494(Static435.anInt8191) && Static22.anInt950 == 0 && Static383.method6158() == 1 && !local172) {
			local90 = 0;
			for (local94 = 0; local94 < Static259.anInt5574; local94++) {
				if (Static10.aBooleanArray1[local94]) {
					Static10.aBooleanArray1[local94] = false;
					Static63.aRectangleArray1[local90++] = Class8_Sub5_Sub1_Sub2.aRectangleArray2[local94];
				}
			}
			try {
				if (Static513.aBoolean642) {
					Static91.method2154(Static63.aRectangleArray1, local90);
				} else {
					Static171.aClass16_5.method6097(Static63.aRectangleArray1, local90);
				}
			} catch (@Pc(541) Exception_Sub1 local541) {
			}
		} else if (!Static155.method3152(Static435.anInt8191)) {
			for (local90 = 0; local90 < Static259.anInt5574; local90++) {
				Static10.aBooleanArray1[local90] = false;
			}
			try {
				if (Static513.aBoolean642) {
					Static525.method7463();
				} else {
					Static171.aClass16_5.method6098();
				}
			} catch (@Pc(479) Exception_Sub1 local479) {
				Static596.method8231(local479.getMessage() + " (Recovered) " + this.method1912(), local479);
				Static553.method7773(false, 0);
			}
		}
		Static194.method3639();
		local90 = Static155.aClass8_Sub25_6.aClass36_Sub8_1.method3635();
		if (local90 == 0) {
			Static214.method4061(15L);
		} else if (local90 == 1) {
			Static214.method4061(10L);
		} else if (local90 == 2) {
			Static214.method4061(5L);
		} else if (local90 == 3) {
			Static214.method4061(2L);
		}
		if (Static504.aBoolean626) {
			Static206.method7641();
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub28_1.method8299() == 1 && Static435.anInt8191 == 3 && Static212.anInt4965 != -1) {
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub28_1, 0);
			Static35.method7912();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	public synchronized void method1907() {
		if (Static152.anApplet1 != null && Static549.aCanvas13 == null && !Static51.aClass118_1.aBoolean301) {
			try {
				@Pc(13) Class local13 = Static152.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static549.aCanvas13 = (Canvas) local17.get(Static152.anApplet1);
				local17.set(Static152.anApplet1, null);
				if (Static549.aCanvas13 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1907();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method1922() {
		if (Static548.anInt9469 < Static499.aClass113_3.anInt4112) {
			Static471.aClass280_2.method7028();
			Static355.anInt6834 = (Static499.aClass113_3.anInt4112 - 1) * 50 * 5;
			if (Static355.anInt6834 > 3000) {
				Static355.anInt6834 = 3000;
			}
			if (Static499.aClass113_3.anInt4112 >= 2 && Static499.aClass113_3.anInt4113 == 6) {
				this.method1905("js5connect_outofdate");
				Static435.anInt8191 = 14;
				return;
			}
			if (Static499.aClass113_3.anInt4112 >= 4 && Static499.aClass113_3.anInt4113 == -1) {
				this.method1905("js5crc");
				Static435.anInt8191 = 14;
				return;
			}
			if (Static499.aClass113_3.anInt4112 >= 4 && Static155.method3152(Static435.anInt8191)) {
				if (Static499.aClass113_3.anInt4113 == 7 || Static499.aClass113_3.anInt4113 == 9) {
					this.method1905("js5connect_full");
				} else if (Static499.aClass113_3.anInt4113 <= 0) {
					this.method1905("js5io");
				} else if (Static52.aString13 == null) {
					this.method1905("js5connect");
				} else {
					this.method1905("js5proxy_" + Static52.aString13.trim());
				}
				Static435.anInt8191 = 14;
				return;
			}
		}
		Static548.anInt9469 = Static499.aClass113_3.anInt4112;
		if (Static355.anInt6834 > 0) {
			Static355.anInt6834--;
			return;
		}
		try {
			if (Static419.anInt7932 == 0) {
				Static17.aClass301_2 = Static471.aClass280_2.method7026(Static51.aClass118_1);
				Static419.anInt7932++;
			}
			if (Static419.anInt7932 == 1) {
				if (Static17.aClass301_2.anInt8915 == 2) {
					if (Static17.aClass301_2.anObject18 != null) {
						Static52.aString13 = (String) Static17.aClass301_2.anObject18;
					}
					this.method1929(1000);
					return;
				}
				if (Static17.aClass301_2.anInt8915 == 1) {
					Static419.anInt7932++;
				}
			}
			if (Static419.anInt7932 == 2) {
				Static226.aClass375_2 = new Class375((Socket) Static17.aClass301_2.anObject18, Static51.aClass118_1, 25000);
				@Pc(204) Class8_Sub8 local204 = new Class8_Sub8(5);
				local204.method8562(Static125.aClass306_30.anInt8954);
				local204.method8523(632);
				Static226.aClass375_2.method8609(local204.aByteArray107, 5);
				Static419.anInt7932++;
				Static232.aLong131 = Static342.method5463();
			}
			if (Static419.anInt7932 == 3) {
				if (Static155.method3152(Static435.anInt8191) || Static226.aClass375_2.method8608() > 0) {
					@Pc(242) int local242 = Static226.aClass375_2.method8604();
					if (local242 != 0) {
						this.method1929(local242);
						return;
					}
					Static419.anInt7932++;
				} else if (Static342.method5463() - Static232.aLong131 > 30000L) {
					this.method1929(1001);
					return;
				}
			}
			if (Static419.anInt7932 == 4) {
				@Pc(292) boolean local292 = Static155.method3152(Static435.anInt8191) || Static330.method3429(Static435.anInt8191) || Static118.method5770(Static435.anInt8191);
				@Pc(295) Class38[] local295 = Static45.method1358();
				@Pc(303) Class8_Sub8 local303 = new Class8_Sub8(local295.length * 4);
				Static226.aClass375_2.method8610(local303.aByteArray107.length, local303.aByteArray107, 0);
				for (@Pc(314) int local314 = 0; local314 < local295.length; local314++) {
					local295[local314].method1360(local303.method8540());
				}
				Static499.aClass113_3.method3341(Static226.aClass375_2, !local292);
				Static419.anInt7932 = 0;
				Static17.aClass301_2 = null;
				Static226.aClass375_2 = null;
			}
		} catch (@Pc(346) IOException local346) {
			this.method1929(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1913() {
		if (Static358.aBoolean480) {
			Static153.anInt3785 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static163.method3266();
		Static508.aClass239_3 = new Class239(Static51.aClass118_1);
		Static499.aClass113_3 = new Class113();
		Static203.method3758(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static277.aClass313_9 != Static101.aClass313_5) {
			Static331.aByteArrayArray176 = new byte[50][];
		}
		Static155.aClass8_Sub25_6 = Static577.method8053();
		if (Static101.aClass313_5 == Static277.aClass313_9) {
			Static490.aClass280_4.aString87 = this.getCodeBase().getHost();
		} else if (Static254.method3441(Static277.aClass313_9)) {
			Static490.aClass280_4.aString87 = this.getCodeBase().getHost();
			Static490.aClass280_4.anInt8501 = Static490.aClass280_4.anInt8497 + 40000;
			Static631.aClass280_5.anInt8501 = Static631.aClass280_5.anInt8497 + 40000;
			Static476.aClass280_3.anInt8501 = Static476.aClass280_3.anInt8497 + 40000;
			Static490.aClass280_4.anInt8493 = Static490.aClass280_4.anInt8497 + 50000;
			Static631.aClass280_5.anInt8493 = Static631.aClass280_5.anInt8497 + 50000;
			Static476.aClass280_3.anInt8493 = Static476.aClass280_3.anInt8497 + 50000;
		} else if (Static253.aClass313_8 == Static277.aClass313_9) {
			Static490.aClass280_4.aString87 = "127.0.0.1";
			Static631.aClass280_5.aString87 = "127.0.0.1";
			Static490.aClass280_4.anInt8501 = Static490.aClass280_4.anInt8497 + 40000;
			Static476.aClass280_3.aString87 = "127.0.0.1";
			Static631.aClass280_5.anInt8501 = Static631.aClass280_5.anInt8497 + 40000;
			Static476.aClass280_3.anInt8501 = Static476.aClass280_3.anInt8497 + 40000;
			Static490.aClass280_4.anInt8493 = Static490.aClass280_4.anInt8497 + 50000;
			Static631.aClass280_5.anInt8493 = Static631.aClass280_5.anInt8497 + 50000;
			Static476.aClass280_3.anInt8493 = Static476.aClass280_3.anInt8497 + 50000;
		}
		Static487.aShortArray107 = Static54.aShortArray4 = Static309.aShortArray76 = Static119.aShortArray12 = new short[256];
		if (Static18.aClass217_1 == Static207.aClass217_3) {
			Static345.aBoolean465 = false;
		}
		Static471.aClass280_2 = Static490.aClass280_4;
		if (Static281.aClass217_4 == Static18.aClass217_1) {
			Static174.aShortArrayArray6 = Static232.aShortArrayArray7;
			Static131.aBoolean255 = true;
			Static450.aShortArrayArrayArray2 = Static44.aShortArrayArrayArray1;
			Static618.anInt10388 = 0;
			Static487.anInt8673 = 16777215;
		} else if (Static18.aClass217_1 == Static524.aClass217_5) {
			Static450.aShortArrayArrayArray2 = Static590.aShortArrayArrayArray4;
			Static174.aShortArrayArray6 = Static641.aShortArrayArray19;
		} else {
			Static450.aShortArrayArrayArray2 = Static589.aShortArrayArrayArray3;
			Static174.aShortArrayArray6 = Static315.aShortArrayArray11;
		}
		try {
			Static3.aClipboard1 = Static227.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(221) Exception local221) {
		}
		Static295.aClass209_1 = Static585.method8136(Static549.aCanvas13);
		Static288.aClass35_6 = Static127.method2813(Static549.aCanvas13);
		try {
			if (Static51.aClass118_1.aClass379_1 != null) {
				Static51.aClass235_2 = new Class235(Static51.aClass118_1.aClass379_1, 5200, 0);
				for (@Pc(243) int local243 = 0; local243 < 37; local243++) {
					Static546.aClass235Array1[local243] = new Class235(Static51.aClass118_1.aClass379Array1[local243], 6000, 0);
				}
				Static35.aClass235_9 = new Class235(Static51.aClass118_1.aClass379_2, 6000, 0);
				Static192.aClass291_1 = new Class291(255, Static51.aClass235_2, Static35.aClass235_9, 500000);
				Static289.aClass235_4 = new Class235(Static51.aClass118_1.aClass379_3, 24, 0);
				Static51.aClass118_1.aClass379_2 = null;
				Static51.aClass118_1.aClass379_3 = null;
				Static51.aClass118_1.aClass379Array1 = null;
				Static51.aClass118_1.aClass379_1 = null;
			}
		} catch (@Pc(299) IOException local299) {
			Static289.aClass235_4 = null;
			Static51.aClass235_2 = null;
			Static192.aClass291_1 = null;
			Static35.aClass235_9 = null;
		}
		if (Static277.aClass313_9 != Static101.aClass313_5) {
			Static450.aBoolean595 = true;
		}
		Static590.aString106 = Static121.aClass84_12.method2710(Static372.anInt7083);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1910() {
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 2) {
			this.method1928();
			return;
		}
		try {
			this.method1928();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static596.method8231(local24.getMessage() + " (Recovered) " + this.method1912(), local24);
			Static593.aBoolean729 = true;
			Static553.method7773(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1923() {
		@Pc(32) int local32;
		if (Static435.anInt8191 == 7 && Static453.anInt8320 == 0) {
			if (Static128.anInt3427 > 1) {
				Static128.anInt3427--;
				Static409.anInt7812 = Static75.anInt2309;
			}
			if (!Static211.aBoolean370) {
				Static16.method768();
			}
			for (local32 = 0; local32 < 100 && Static181.method3456(); local32++) {
			}
		}
		Static77.anInt2367++;
		Static385.method8094(-1, -1, null);
		Static570.method7927(null, -1, -1);
		Static103.method2359();
		Static75.anInt2309++;
		for (local32 = 0; local32 < Static438.anInt8226; local32++) {
			@Pc(80) Class15_Sub1_Sub2_Sub2_Sub2 local80 = Static537.aClass8_Sub50Array1[local32].aClass15_Sub1_Sub2_Sub2_Sub2_2;
			if (local80 != null) {
				@Pc(86) byte local86 = local80.aClass300_1.aByte100;
				if ((local86 & 0x1) != 0) {
					@Pc(97) int local97 = local80.method6692();
					@Pc(121) int local121;
					if ((local86 & 0x2) != 0 && local80.anInt8137 == 0 && Math.random() * 1000.0D < 10.0D) {
						local121 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(129) int local129 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local121 != 0 || local129 != 0) {
							@Pc(143) int local143 = local80.anIntArray435[0] + local121;
							if (local143 < 0) {
								local143 = 0;
							} else if (Static372.anInt7082 - local97 - 1 < local143) {
								local143 = Static372.anInt7082 - local97 - 1;
							}
							@Pc(171) int local171 = local80.anIntArray436[0] + local129;
							if (local171 < 0) {
								local171 = 0;
							} else if (local171 > Static218.anInt5023 - local97 - 1) {
								local171 = Static218.anInt5023 - local97 - 1;
							}
							@Pc(221) int local221 = Static553.method7769(Static21.anIntArray25, local171, local80.anIntArray435[0], local143, local80.anIntArray436[0], Static204.aClass48Array1[local80.aByte124], local97, 0, true, local97, -1, Static581.anIntArray582, 0, local97);
							if (local221 > 0) {
								if (local221 > 9) {
									local221 = 9;
								}
								for (@Pc(232) int local232 = 0; local232 < local221; local232++) {
									local80.anIntArray435[local232] = Static21.anIntArray25[local221 - local232 - 1];
									local80.anIntArray436[local232] = Static581.anIntArray582[local221 - local232 - 1];
									local80.aByteArray69[local232] = 1;
								}
								local80.anInt8137 = local221;
							}
						}
					}
					Static193.method3638(local80, true);
					local121 = Static206.method7639(local80);
					Static170.method3365(local80);
					Static10.method131(Static94.anInt6314, local80, Static618.anInt10390, local121);
					Static213.method4051(local80, Static94.anInt6314);
					Static484.method7152(local80);
				}
			}
		}
		if (Static453.anInt8320 == 0 && Static354.anInt6822 == 0) {
			if (Static427.anInt8005 == 2) {
				Static33.method1197();
			} else {
				Static54.method1597();
			}
			if (Static637.anInt10650 >> 9 < 14 || Static372.anInt7082 - 14 <= Static637.anInt10650 >> 9 || Static377.anInt7114 >> 9 < 14 || Static377.anInt7114 >> 9 >= Static218.anInt5023 - 14) {
				Static587.method8336();
			}
		}
		while (true) {
			@Pc(359) Class8_Sub40 local359;
			@Pc(364) Class331 local364;
			@Pc(372) Class331 local372;
			do {
				local359 = (Class8_Sub40) Static148.aClass43_34.method1432();
				if (local359 == null) {
					while (true) {
						do {
							local359 = (Class8_Sub40) Static471.aClass43_55.method1432();
							if (local359 == null) {
								while (true) {
									do {
										local359 = (Class8_Sub40) Static203.aClass43_28.method1432();
										if (local359 == null) {
											if (Static10.aClass331_3 != null) {
												Static137.method2950();
											}
											if (Static435.anInt8192 % 1500 == 0) {
												Static591.method8170();
											}
											if (Static435.anInt8191 == 7 && Static453.anInt8320 == 0) {
												Static264.method4609();
											}
											Static98.method2232();
											if (Static359.aBoolean485 && Static342.method5463() - 60000L > Static11.aLong6) {
												Static579.method8093();
											}
											for (@Pc(539) Class15_Sub5_Sub2 local539 = (Class15_Sub5_Sub2) Static51.aClass123_2.method3537(); local539 != null; local539 = (Class15_Sub5_Sub2) Static51.aClass123_2.method3541()) {
												if (Static342.method5463() / 1000L - 5L > (long) local539.anInt10147) {
													if (local539.aShort118 > 0) {
														Static170.method3363(local539.aString108 + Static121.aClass84_19.method2710(Static372.anInt7083), "", 5, 0, "", "");
													}
													if (local539.aShort118 == 0) {
														Static170.method3363(local539.aString108 + Static121.aClass84_20.method2710(Static372.anInt7083), "", 5, 0, "", "");
													}
													local539.method8314();
												}
											}
											if (Static435.anInt8191 == 7 && Static453.anInt8320 == 0) {
												if (Static319.aClass240_2 == null) {
													Static232.method4294(false);
													return;
												}
												Static271.anInt5723++;
												if (Static271.anInt5723 > 50) {
													@Pc(648) Class8_Sub31 local648 = Static51.method1418(Static8.aClass257_4, Static608.aClass336_1);
													Static262.method4604(local648);
												}
												try {
													Static441.method6809();
													return;
												} catch (@Pc(655) IOException local655) {
													Static232.method4294(false);
													return;
												}
											}
											return;
										}
										local364 = local359.aClass331_14;
										if (local364.anInt9535 < 0) {
											break;
										}
										local372 = Static178.method3435(local364.anInt9509);
									} while (local372 == null || local372.aClass331Array2 == null || local372.aClass331Array2.length <= local364.anInt9535 || local364 != local372.aClass331Array2[local364.anInt9535]);
									Static273.method4698(local359);
								}
							}
							local364 = local359.aClass331_14;
							if (local364.anInt9535 < 0) {
								break;
							}
							local372 = Static178.method3435(local364.anInt9509);
						} while (local372 == null || local372.aClass331Array2 == null || local364.anInt9535 >= local372.aClass331Array2.length || local364 != local372.aClass331Array2[local364.anInt9535]);
						Static273.method4698(local359);
					}
				}
				local364 = local359.aClass331_14;
				if (local364.anInt9535 < 0) {
					break;
				}
				local372 = Static178.method3435(local364.anInt9509);
			} while (local372 == null || local372.aClass331Array2 == null || local364.anInt9535 >= local372.aClass331Array2.length || local364 != local372.aClass331Array2[local364.anInt9535]);
			Static273.method4698(local359);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method1924() {
		@Pc(11) boolean local11 = Static499.aClass113_3.method3346();
		if (!local11) {
			this.method1922();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1908()) {
			return;
		}
		Static490.aClass280_4 = new Class280();
		Static490.aClass280_4.anInt8497 = Integer.parseInt(this.getParameter("worldid"));
		Static631.aClass280_5 = new Class280();
		Static631.aClass280_5.anInt8497 = Integer.parseInt(this.getParameter("lobbyid"));
		Static631.aClass280_5.aString87 = this.getParameter("lobbyaddress");
		Static476.aClass280_3 = new Class280();
		Static476.aClass280_3.anInt8497 = Integer.parseInt(this.getParameter("demoid"));
		Static476.aClass280_3.aString87 = this.getParameter("demoaddress");
		Static277.aClass313_9 = Static389.method6231(Integer.parseInt(this.getParameter("modewhere")));
		if (Static277.aClass313_9 == Static253.aClass313_8) {
			Static277.aClass313_9 = Static78.aClass313_4;
		} else if (!Static254.method3441(Static277.aClass313_9) && Static277.aClass313_9 != Static101.aClass313_5) {
			Static277.aClass313_9 = Static101.aClass313_5;
		}
		Static51.aClass348_2 = Static565.method3492(Integer.parseInt(this.getParameter("modewhat")));
		if (Static51.aClass348_2 != Static558.aClass348_3 && Static51.aClass348_1 != Static51.aClass348_2 && Static613.aClass348_4 != Static51.aClass348_2) {
			Static51.aClass348_2 = Static613.aClass348_4;
		}
		try {
			Static372.anInt7083 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static372.anInt7083 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static109.aBoolean224 = true;
		} else {
			Static109.aBoolean224 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static247.aBoolean402 = true;
		} else {
			Static247.aBoolean402 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static155.aBoolean282 = true;
		} else {
			Static155.aBoolean282 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static18.aClass217_1 = Static207.aClass217_3;
			} else if (local152.equals("1")) {
				Static18.aClass217_1 = Static281.aClass217_4;
			} else if (local152.equals("2")) {
				Static18.aClass217_1 = Static589.aClass217_7;
			} else if (local152.equals("3")) {
				Static18.aClass217_1 = Static524.aClass217_5;
			}
		}
		try {
			Static60.anInt1930 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static60.anInt1930 = 0;
		}
		Static447.aString56 = this.getParameter("quiturl");
		Static254.aString54 = this.getParameter("settings");
		if (Static254.aString54 == null) {
			Static254.aString54 = "";
		}
		Static69.aBoolean557 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static550.anInt10292 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static550.anInt10292 = 0;
			}
		}
		Static59.anInt1905 = Integer.parseInt(this.getParameter("colourid"));
		if (Static59.anInt1905 < 0 || Static384.aColorArray6.length <= Static59.anInt1905) {
			Static59.anInt1905 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static212.aBoolean371 = true;
			Static420.aBoolean573 = true;
		}
		@Pc(252) String local252 = this.getParameter("frombilling");
		if (local252 != null && local252.equals("true")) {
			Static150.aBoolean273 = true;
		}
		Static193.aString58 = this.getParameter("sskey");
		if (Static193.aString58 != null && Static193.aString58.length() < 2) {
			Static193.aString58 = null;
		}
		@Pc(278) String local278 = this.getParameter("force64mb");
		if (local278 != null && local278.equals("true")) {
			Static358.aBoolean480 = true;
		}
		@Pc(290) String local290 = this.getParameter("worldflags");
		if (local290 != null) {
			try {
				Static349.anInt6743 = Integer.parseInt(local290);
			} catch (@Pc(297) Exception local297) {
			}
		}
		@Pc(302) String local302 = this.getParameter("userFlow");
		if (local302 != null) {
			try {
				Static161.aLong101 = Long.parseLong(local302);
			} catch (@Pc(309) NumberFormatException local309) {
			}
		}
		Static600.aString110 = this.getParameter("additionalInfo");
		if (Static600.aString110 != null && Static600.aString110.length() > 50) {
			Static600.aString110 = null;
		}
		Static227.aClient1 = this;
		if (Static207.aClass217_3 == Static18.aClass217_1) {
			Static328.anInt9768 = 765;
			Static594.anInt10159 = 503;
		} else if (Static281.aClass217_4 == Static18.aClass217_1) {
			Static328.anInt9768 = 640;
			Static594.anInt10159 = 480;
		}
		this.method1904(Static51.aClass348_2.method8142() + 32, Static328.anInt9768, Static18.aClass217_1.aString71, Static594.anInt10159);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1909() {
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1928() {
		if (Static435.anInt8191 == 14) {
			return;
		}
		Static435.anInt8192++;
		if (Static435.anInt8192 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static223.anInt9989 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static288.aRandom6.setSeed((long) Static223.anInt9989);
		}
		if (Static435.anInt8192 % 50 == 0) {
			Static12.anInt163 = Static337.anInt6641;
			Static337.anInt6641 = 0;
			Static221.anInt5063 = Static287.anInt5905;
			Static287.anInt5905 = 0;
		}
		this.method1924();
		if (Static613.aClass164_1 != null) {
			Static613.aClass164_1.method4607();
		}
		Static330.method3430();
		Static304.method4966();
		Static295.aClass209_1.method5487();
		Static288.aClass35_6.method5771();
		if (Static171.aClass16_5 != null) {
			Static171.aClass16_5.method6119((int) Static342.method5463());
		}
		Static48.method3449();
		Static122.anInt3320 = 0;
		Static349.anInt6741 = 0;
		for (@Pc(95) Interface21 local95 = Static295.aClass209_1.method5486(); local95 != null; local95 = Static295.aClass209_1.method5486()) {
			@Pc(101) int local101 = local95.method3237();
			if (local101 == 2 || local101 == 3) {
				@Pc(131) char local131 = local95.method3239();
				if (Static382.method6146() && (local131 == '`' || local131 == '§' || local131 == '²')) {
					if (Static360.method5661()) {
						Static510.method7347();
					} else {
						Static393.method6282();
					}
				} else if (Static122.anInt3320 < 128) {
					Static547.anInterface21Array2[Static122.anInt3320] = local95;
					Static122.anInt3320++;
				}
			} else if (local101 == 0 && Static349.anInt6741 < 75) {
				Static198.anInterface21Array1[Static349.anInt6741] = local95;
				Static349.anInt6741++;
			}
		}
		Static92.anInt2553 = 0;
		for (@Pc(187) Class8_Sub33 local187 = Static288.aClass35_6.method5765(); local187 != null; local187 = Static288.aClass35_6.method5765()) {
			@Pc(193) int local193 = local187.method7204();
			if (local193 == -1) {
				Static140.aClass43_23.method1424(local187);
			} else if (local193 == 6) {
				Static92.anInt2553 += local187.method7205();
			} else if (Static494.method7230(local193)) {
				Static188.aClass43_24.method1424(local187);
				if (Static188.aClass43_24.method1430() > 10) {
					Static188.aClass43_24.method1432();
				}
			}
		}
		if (Static360.method5661()) {
			Static387.method6210();
		}
		if (Static155.method3152(Static435.anInt8191)) {
			Static424.method6604();
			Static200.method3717();
		} else if (Static351.method5556(Static435.anInt8191)) {
			Static52.method1579();
		}
		if (Static330.method3429(Static435.anInt8191) && !Static351.method5556(Static435.anInt8191)) {
			this.method1923();
			Static605.method7727();
			Static6.method65();
		} else if (Static118.method5770(Static435.anInt8191) && !Static351.method5556(Static435.anInt8191)) {
			this.method1923();
			Static6.method65();
		} else if (Static435.anInt8191 == 12) {
			Static6.method65();
		} else if (Static564.method7850(Static435.anInt8191) && !Static351.method5556(Static435.anInt8191)) {
			Static11.method159();
		} else if (Static435.anInt8191 == 13) {
			Static6.method65();
			if (Static128.anInt3420 != -3 && Static128.anInt3420 != 2 && Static128.anInt3420 != 15) {
				Static232.method4294(false);
			}
		}
		Static517.method7402(Static171.aClass16_5);
		Static188.aClass43_24.method1432();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1929(@OriginalArg(1) int arg0) {
		Static17.aClass301_2 = null;
		Static419.anInt7932 = 0;
		Static499.aClass113_3.anInt4112++;
		Static226.aClass375_2 = null;
		Static499.aClass113_3.anInt4113 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1903() {
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 2) {
			this.method1919();
			return;
		}
		try {
			this.method1919();
		} catch (@Pc(18) ThreadDeath local18) {
			throw local18;
		} catch (@Pc(21) Throwable local21) {
			Static596.method8231(local21.getMessage() + " (Recovered) " + this.method1912(), local21);
			Static593.aBoolean729 = true;
			Static553.method7773(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method1918() {
		if (Static359.aBoolean485) {
			Static579.method8093();
		}
		Static286.method4818();
		if (Static171.aClass16_5 != null) {
			Static171.aClass16_5.method6063();
		}
		if (Static197.aFrame1 != null) {
			Static618.method8387(Static51.aClass118_1, Static197.aFrame1);
			Static197.aFrame1 = null;
		}
		if (Static319.aClass240_2 != null) {
			Static319.aClass240_2.method6372();
			Static319.aClass240_2 = null;
		}
		Static474.method7035();
		Static499.aClass113_3.method3345();
		Static508.aClass239_3.method6346();
		if (Static62.aClass182_1 != null) {
			Static62.aClass182_1.method4824();
			Static62.aClass182_1 = null;
		}
		try {
			Static51.aClass235_2.method6174();
			for (@Pc(58) int local58 = 0; local58 < 37; local58++) {
				Static546.aClass235Array1[local58].method6174();
			}
			Static35.aClass235_9.method6174();
			Static289.aClass235_4.method6174();
			Static298.method8351();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1912() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static628.anInt10493 + "," + Static594.anInt10160 + "," + Static372.anInt7082 + "," + Static218.anInt5023 + "|";
			if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 != null) {
				local7 = local7 + "2)" + Static128.anInt3428 + "," + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] + Static628.anInt10493) + "," + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] + Static594.anInt10160) + "|";
			}
			local7 = local7 + "3)" + Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() + "|4)" + Static155.aClass8_Sub25_6.aClass36_Sub26_2.method7794() + "|5)" + Static383.method6158() + "|6)" + Static235.anInt5298 + "," + Static313.anInt6355 + "|";
			local7 = local7 + "7)" + Static155.aClass8_Sub25_6.aClass36_Sub21_1.method6959() + "|";
			local7 = local7 + "8)" + Static155.aClass8_Sub25_6.aClass36_Sub14_1.method4894() + "|";
			local7 = local7 + "9)" + Static155.aClass8_Sub25_6.aClass36_Sub2_1.method1626() + "|";
			local7 = local7 + "10)" + Static155.aClass8_Sub25_6.aClass36_Sub17_1.method5459() + "|";
			local7 = local7 + "11)" + Static155.aClass8_Sub25_6.aClass36_Sub29_1.method8472() + "|";
			local7 = local7 + "12)" + Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() + "|";
			local7 = local7 + "13)" + Static153.anInt3785 + "|";
			local7 = local7 + "14)" + Static435.anInt8191;
			if (Static38.aClass8_Sub15_1 != null) {
				local7 = local7 + "|15)" + Static38.aClass8_Sub15_1.anInt2575;
			}
			try {
				if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 2) {
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
									@Pc(326) Field local326 = local294.getClass().getDeclaredField("handle");
									local263.invoke(local326, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local326.getLong(local294));
									local263.invoke(local326, Boolean.FALSE);
								}
							} catch (@Pc(362) Throwable local362) {
							}
							local263.invoke(local299, Boolean.FALSE);
						} catch (@Pc(374) Throwable local374) {
						}
					}
				}
			} catch (@Pc(386) Throwable local386) {
			}
			local7 = local7 + "]";
		} catch (@Pc(402) Throwable local402) {
		}
		return local7;
	}
}
