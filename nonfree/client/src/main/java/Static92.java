import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "[I")
	public static final int[] anIntArray166 = new int[13];

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!qaa;")
	private static final Class269 aClass269_20 = new Class269(13, 3);

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public static int anInt1857 = -1;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
	public static int[] anIntArray167 = new int[1];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!wc;BI)V")
	public static void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5_Sub20 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static261.aClass238_28.aClass2_201) {
			return;
		}
		@Pc(13) int local13 = arg1.anInt10079;
		@Pc(16) int local16 = arg1.anInt10073;
		@Pc(19) int local19 = arg1.anInt10077;
		@Pc(23) int local23 = (int) arg1.aLong278;
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		@Pc(32) long local32 = arg1.aLong278;
		@Pc(44) Class2_Sub51 local44;
		@Pc(59) Class11_Sub1_Sub1_Sub2_Sub2 local59;
		@Pc(66) Class2_Sub50 local66;
		if (local19 == 6) {
			local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local23);
			if (local44 != null) {
				Static496.anInt8422 = arg0;
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 2;
				local59 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				Static76.anInt1679 = 0;
				local66 = Static595.method8194(Static610.aClass310_2, Static606.aClass269_94);
				local66.aClass2_Sub34_Sub2_2.method6857(local23);
				local66.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local66);
				Static191.method5050(0, true, local59.method2778(), -2, local59.method2778(), local59.anIntArray232[0], local59.anIntArray233[0], 0);
			}
		}
		@Pc(131) Class2_Sub50 local131;
		if (local19 == 45) {
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			local131 = Static595.method8194(Static610.aClass310_2, Static202.aClass269_42);
			local131.aClass2_Sub34_Sub2_2.method6916(local13 + Static451.anInt7933);
			local131.aClass2_Sub34_Sub2_2.method6854(local16 + Static470.anInt8063);
			local131.aClass2_Sub34_Sub2_2.method6854(local23);
			local131.aClass2_Sub34_Sub2_2.method6894(Static63.aClass32_1.method789(82) ? 1 : 0);
			Static311.method4754(local131);
			Static342.method5239(local13, local16);
		}
		if (local19 == 50) {
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			Static496.anInt8422 = arg0;
			Static212.anInt4408 = arg2;
			local131 = Static595.method8194(Static610.aClass310_2, Static328.aClass269_59);
			local131.aClass2_Sub34_Sub2_2.method6854(local13 + Static451.anInt7933);
			local131.aClass2_Sub34_Sub2_2.method6869(Static342.anInt6258);
			local131.aClass2_Sub34_Sub2_2.method6857(local16 + Static470.anInt8063);
			local131.aClass2_Sub34_Sub2_2.method6916(Static590.anInt9763);
			local131.aClass2_Sub34_Sub2_2.method6916(Static352.anInt6475);
			local131.aClass2_Sub34_Sub2_2.method6857(local23);
			local131.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
			Static311.method4754(local131);
			Static342.method5239(local13, local16);
		}
		if (local19 == 48) {
			Static496.anInt8422 = arg0;
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			Static212.anInt4408 = arg2;
			local131 = Static595.method8194(Static610.aClass310_2, Static331.aClass269_61);
			local131.aClass2_Sub34_Sub2_2.method6854(local23);
			local131.aClass2_Sub34_Sub2_2.method6854(local13 + Static451.anInt7933);
			local131.aClass2_Sub34_Sub2_2.method6857(local16 + Static470.anInt8063);
			local131.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
			Static311.method4754(local131);
			Static342.method5239(local13, local16);
		}
		if (local19 == 9) {
			Static76.anInt1679 = 0;
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			Static419.anInt7641 = 2;
			local131 = Static595.method8194(Static610.aClass310_2, Static29.aClass269_4);
			local131.aClass2_Sub34_Sub2_2.method6857(local23);
			local131.aClass2_Sub34_Sub2_2.method6897(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6916(Static451.anInt7933 + local13);
			local131.aClass2_Sub34_Sub2_2.method6900(Static470.anInt8063 + local16);
			Static311.method4754(local131);
			Static342.method5239(local13, local16);
		}
		if (local19 == 1002) {
			Static496.anInt8422 = arg0;
			Static212.anInt4408 = arg2;
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			local131 = Static595.method8194(Static610.aClass310_2, Static544.aClass269_87);
			local131.aClass2_Sub34_Sub2_2.method6854(local23);
			Static311.method4754(local131);
		}
		if (local19 == 44 || local19 == 1001) {
			Static20.method475(local13, local23, arg1.aString101, local16);
		}
		if (local19 == 1006) {
			Static419.anInt7641 = 2;
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			Static76.anInt1679 = 0;
			local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local23);
			if (local44 != null) {
				local59 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(457) Class236 local457 = local59.aClass236_1;
				if (local457.anIntArray462 != null) {
					local457 = local457.method5779(Static438.aClass198_1);
				}
				if (local457 != null) {
					@Pc(476) Class2_Sub50 local476 = Static595.method8194(Static610.aClass310_2, Static328.aClass269_60);
					local476.aClass2_Sub34_Sub2_2.method6854(local457.anInt6896);
					Static311.method4754(local476);
				}
			}
		}
		@Pc(515) Class2_Sub50 local515;
		@Pc(494) Class11_Sub1_Sub1_Sub2_Sub1 local494;
		if (local19 == 25) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static419.anInt7641 = 2;
				Static212.anInt4408 = arg2;
				Static76.anInt1679 = 0;
				Static496.anInt8422 = arg0;
				local515 = Static595.method8194(Static610.aClass310_2, Static107.aClass269_25);
				local515.aClass2_Sub34_Sub2_2.method6916(Static590.anInt9763);
				local515.aClass2_Sub34_Sub2_2.method6857(Static352.anInt6475);
				local515.aClass2_Sub34_Sub2_2.method6882(Static342.anInt6258);
				local515.aClass2_Sub34_Sub2_2.method6916(local23);
				local515.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 22) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static496.anInt8422 = arg0;
				Static212.anInt4408 = arg2;
				Static76.anInt1679 = 0;
				Static419.anInt7641 = 2;
				local515 = Static595.method8194(Static610.aClass310_2, Static174.aClass269_38);
				local515.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
				local515.aClass2_Sub34_Sub2_2.method6854(local23);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 1009 || local19 == 1004 || local19 == 1003 || local19 == 1007 || local19 == 1010) {
			Static193.method3438(local19, local23, local13);
		}
		if (local19 == 18) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static496.anInt8422 = arg0;
				Static419.anInt7641 = 2;
				Static212.anInt4408 = arg2;
				Static76.anInt1679 = 0;
				local515 = Static595.method8194(Static610.aClass310_2, Static217.aClass269_45);
				local515.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
				local515.aClass2_Sub34_Sub2_2.method6854(local23);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 20) {
			local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local23);
			if (local44 != null) {
				local59 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				Static496.anInt8422 = arg0;
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 2;
				Static76.anInt1679 = 0;
				local66 = Static595.method8194(Static610.aClass310_2, Static283.aClass269_56);
				local66.aClass2_Sub34_Sub2_2.method6900(local23);
				local66.aClass2_Sub34_Sub2_2.method6897(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local66);
				Static191.method5050(0, true, local59.method2778(), -2, local59.method2778(), local59.anIntArray232[0], local59.anIntArray233[0], 0);
			}
		}
		if (local19 == 15) {
			Static496.anInt8422 = arg0;
			Static419.anInt7641 = 2;
			Static76.anInt1679 = 0;
			Static212.anInt4408 = arg2;
			local131 = Static595.method8194(Static610.aClass310_2, Static478.aClass269_80);
			local131.aClass2_Sub34_Sub2_2.method6897(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6854(local13 + Static451.anInt7933);
			local131.aClass2_Sub34_Sub2_2.method6854(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local131.aClass2_Sub34_Sub2_2.method6857(Static470.anInt8063 + local16);
			Static311.method4754(local131);
			Static48.method945(local16, local13, local32);
		}
		if (local19 == 1012) {
			Static496.anInt8422 = arg0;
			Static212.anInt4408 = arg2;
			Static419.anInt7641 = 2;
			Static76.anInt1679 = 0;
			local131 = Static595.method8194(Static610.aClass310_2, Static81.aClass269_18);
			local131.aClass2_Sub34_Sub2_2.method6854(local23);
			Static311.method4754(local131);
		}
		if (local19 == 23) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static496.anInt8422 = arg0;
				Static76.anInt1679 = 0;
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 2;
				local515 = Static595.method8194(Static610.aClass310_2, aClass269_20);
				local515.aClass2_Sub34_Sub2_2.method6916(local23);
				local515.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 46) {
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			local131 = Static595.method8194(Static610.aClass310_2, Static107.aClass269_25);
			local131.aClass2_Sub34_Sub2_2.method6916(Static590.anInt9763);
			local131.aClass2_Sub34_Sub2_2.method6857(Static352.anInt6475);
			local131.aClass2_Sub34_Sub2_2.method6882(Static342.anInt6258);
			local131.aClass2_Sub34_Sub2_2.method6916(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt3246);
			local131.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
			Static311.method4754(local131);
		}
		if (local19 == 3) {
			Static496.anInt8422 = arg0;
			Static419.anInt7641 = 2;
			Static76.anInt1679 = 0;
			Static212.anInt4408 = arg2;
			local131 = Static595.method8194(Static610.aClass310_2, Static526.aClass269_85);
			local131.aClass2_Sub34_Sub2_2.method6900(local16 + Static470.anInt8063);
			local131.aClass2_Sub34_Sub2_2.method6900(Static451.anInt7933 + local13);
			local131.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6857(local23);
			Static311.method4754(local131);
			Static342.method5239(local13, local16);
		}
		if (local19 == 30) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static76.anInt1679 = 0;
				Static496.anInt8422 = arg0;
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 2;
				local515 = Static595.method8194(Static610.aClass310_2, Static49.aClass269_12);
				local515.aClass2_Sub34_Sub2_2.method6916(local23);
				local515.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 1011) {
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			Static419.anInt7641 = 2;
			Static76.anInt1679 = 0;
			local131 = Static595.method8194(Static610.aClass310_2, Static551.aClass269_88);
			local131.aClass2_Sub34_Sub2_2.method6857(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local131.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6854(Static451.anInt7933 + local13);
			local131.aClass2_Sub34_Sub2_2.method6854(Static470.anInt8063 + local16);
			Static311.method4754(local131);
			Static48.method945(local16, local13, local32);
		}
		if (local19 == 13) {
			local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local23);
			if (local44 != null) {
				Static496.anInt8422 = arg0;
				Static76.anInt1679 = 0;
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 2;
				local59 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				local66 = Static595.method8194(Static610.aClass310_2, Static396.aClass269_70);
				local66.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
				local66.aClass2_Sub34_Sub2_2.method6854(local23);
				Static311.method4754(local66);
				Static191.method5050(0, true, local59.method2778(), -2, local59.method2778(), local59.anIntArray232[0], local59.anIntArray233[0], 0);
			}
		}
		if (local19 == 5) {
			local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local23);
			if (local44 != null) {
				Static212.anInt4408 = arg2;
				local59 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				Static76.anInt1679 = 0;
				Static419.anInt7641 = 2;
				Static496.anInt8422 = arg0;
				local66 = Static595.method8194(Static610.aClass310_2, Static137.aClass269_33);
				local66.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
				local66.aClass2_Sub34_Sub2_2.method6900(local23);
				Static311.method4754(local66);
				Static191.method5050(0, true, local59.method2778(), -2, local59.method2778(), local59.anIntArray232[0], local59.anIntArray233[0], 0);
			}
		}
		if (local19 == 59) {
			Static496.anInt8422 = arg0;
			Static212.anInt4408 = arg2;
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			local131 = Static595.method8194(Static610.aClass310_2, Static37.aClass269_8);
			local131.aClass2_Sub34_Sub2_2.method6916(Static451.anInt7933 + local13);
			local131.aClass2_Sub34_Sub2_2.method6897(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6854(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local131.aClass2_Sub34_Sub2_2.method6916(Static470.anInt8063 + local16);
			Static311.method4754(local131);
			Static48.method945(local16, local13, local32);
		}
		@Pc(1475) Class78 local1475;
		if (local19 == 51) {
			local1475 = Static496.method7080(local16, local13);
			if (local1475 != null) {
				Static37.method815(local1475);
			}
		}
		if (local19 == 21) {
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			Static419.anInt7641 = 1;
			Static76.anInt1679 = 0;
			local131 = Static595.method8194(Static610.aClass310_2, Static521.aClass269_83);
			local131.aClass2_Sub34_Sub2_2.method6864(Static342.anInt6258);
			local131.aClass2_Sub34_Sub2_2.method6857(Static352.anInt6475);
			local131.aClass2_Sub34_Sub2_2.method6854(local13 + Static451.anInt7933);
			local131.aClass2_Sub34_Sub2_2.method6854(Static590.anInt9763);
			local131.aClass2_Sub34_Sub2_2.method6900(local16 + Static470.anInt8063);
			Static311.method4754(local131);
			Static191.method5050(0, true, 1, -4, 1, local13, local16, 0);
		}
		if (local19 == 58) {
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			local131 = Static595.method8194(Static610.aClass310_2, Static19.aClass269_40);
			local131.aClass2_Sub34_Sub2_2.method6916(local23);
			local131.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6916(local16 + Static470.anInt8063);
			local131.aClass2_Sub34_Sub2_2.method6854(local13 + Static451.anInt7933);
			Static311.method4754(local131);
			Static342.method5239(local13, local16);
		}
		if (local19 == 17) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 2;
				Static76.anInt1679 = 0;
				Static496.anInt8422 = arg0;
				local515 = Static595.method8194(Static610.aClass310_2, Static613.aClass269_16);
				local515.aClass2_Sub34_Sub2_2.method6854(local23);
				local515.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 47) {
			local1475 = Static496.method7080(local16, local13);
			if (local1475 != null) {
				Static171.method3178();
				@Pc(1701) Class2_Sub40 local1701 = Static69.method1332(local1475);
				Static545.method7612(local1701.method6409(), local1701.anInt7657, local1475);
				Static81.aString20 = Static371.method5590(local1475);
				if (Static81.aString20 == null) {
					Static81.aString20 = "Null";
				}
				Static109.aString27 = local1475.aString23 + "<col=ffffff>";
			}
			return;
		}
		if (local19 == 11) {
			Static419.anInt7641 = 2;
			Static76.anInt1679 = 0;
			Static496.anInt8422 = arg0;
			Static212.anInt4408 = arg2;
			local131 = Static595.method8194(Static610.aClass310_2, Static317.aClass269_58);
			local131.aClass2_Sub34_Sub2_2.method6916((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local131.aClass2_Sub34_Sub2_2.method6897(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6857(local16 + Static470.anInt8063);
			local131.aClass2_Sub34_Sub2_2.method6916(Static451.anInt7933 + local13);
			Static311.method4754(local131);
			Static48.method945(local16, local13, local32);
		}
		if (local19 == 57) {
			Static212.anInt4408 = arg2;
			Static496.anInt8422 = arg0;
			Static76.anInt1679 = 0;
			Static419.anInt7641 = 2;
			local131 = Static595.method8194(Static610.aClass310_2, Static365.aClass269_65);
			local131.aClass2_Sub34_Sub2_2.method6894(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6854(Static451.anInt7933 + local13);
			local131.aClass2_Sub34_Sub2_2.method6900(Static590.anInt9763);
			local131.aClass2_Sub34_Sub2_2.method6900(local16 + Static470.anInt8063);
			local131.aClass2_Sub34_Sub2_2.method6854(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local131.aClass2_Sub34_Sub2_2.method6864(Static342.anInt6258);
			local131.aClass2_Sub34_Sub2_2.method6854(Static352.anInt6475);
			Static311.method4754(local131);
			Static48.method945(local16, local13, local32);
		}
		if (local19 == 19) {
			if (Static278.anInt5322 > 0 && Static63.aClass32_1.method789(82) && Static63.aClass32_1.method789(81)) {
				Static185.method3333(local13 + Static451.anInt7933, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, Static470.anInt8063 + local16);
			} else {
				Static76.anInt1679 = 0;
				Static496.anInt8422 = arg0;
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 1;
				local131 = Static595.method8194(Static610.aClass310_2, Static501.aClass269_81);
				local131.aClass2_Sub34_Sub2_2.method6916(local16 + Static470.anInt8063);
				local131.aClass2_Sub34_Sub2_2.method6916(Static451.anInt7933 + local13);
				Static311.method4754(local131);
			}
		}
		if (local19 == 8) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static496.anInt8422 = arg0;
				Static76.anInt1679 = 0;
				Static419.anInt7641 = 2;
				Static212.anInt4408 = arg2;
				local515 = Static595.method8194(Static610.aClass310_2, Static43.aClass269_9);
				local515.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
				local515.aClass2_Sub34_Sub2_2.method6857(local23);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 16) {
			if (Static278.anInt5322 > 0 && Static63.aClass32_1.method789(82) && Static63.aClass32_1.method789(81)) {
				Static185.method3333(Static451.anInt7933 + local13, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, local16 + Static470.anInt8063);
			} else {
				local131 = Static483.method6942(local23, local13, local16);
				if (local23 == 1) {
					local131.aClass2_Sub34_Sub2_2.method6894(-1);
					local131.aClass2_Sub34_Sub2_2.method6894(-1);
					local131.aClass2_Sub34_Sub2_2.method6854((int) Static378.aFloat160);
					local131.aClass2_Sub34_Sub2_2.method6894(57);
					local131.aClass2_Sub34_Sub2_2.method6894(Static415.anInt7576);
					local131.aClass2_Sub34_Sub2_2.method6894(Static30.anInt6668);
					local131.aClass2_Sub34_Sub2_2.method6894(89);
					local131.aClass2_Sub34_Sub2_2.method6854(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925);
					local131.aClass2_Sub34_Sub2_2.method6854(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929);
					local131.aClass2_Sub34_Sub2_2.method6894(63);
				} else {
					Static419.anInt7641 = 1;
					Static76.anInt1679 = 0;
					Static496.anInt8422 = arg0;
					Static212.anInt4408 = arg2;
				}
				Static311.method4754(local131);
				Static191.method5050(0, true, 1, -4, 1, local13, local16, 0);
			}
		}
		if (local19 == 49) {
			local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local23);
			if (local44 != null) {
				Static419.anInt7641 = 2;
				Static76.anInt1679 = 0;
				Static212.anInt4408 = arg2;
				Static496.anInt8422 = arg0;
				local59 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				local66 = Static595.method8194(Static610.aClass310_2, Static261.aClass269_51);
				local66.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
				local66.aClass2_Sub34_Sub2_2.method6857(local23);
				Static311.method4754(local66);
				Static191.method5050(0, true, local59.method2778(), -2, local59.method2778(), local59.anIntArray232[0], local59.anIntArray233[0], 0);
			}
		}
		if (local19 == 12) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static496.anInt8422 = arg0;
				Static212.anInt4408 = arg2;
				Static419.anInt7641 = 2;
				Static76.anInt1679 = 0;
				local515 = Static595.method8194(Static610.aClass310_2, Static522.aClass269_84);
				local515.aClass2_Sub34_Sub2_2.method6900(local23);
				local515.aClass2_Sub34_Sub2_2.method6912(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 4) {
			local494 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local23];
			if (local494 != null) {
				Static496.anInt8422 = arg0;
				Static419.anInt7641 = 2;
				Static212.anInt4408 = arg2;
				Static76.anInt1679 = 0;
				local515 = Static595.method8194(Static610.aClass310_2, Static64.aClass269_14);
				local515.aClass2_Sub34_Sub2_2.method6857(local23);
				local515.aClass2_Sub34_Sub2_2.method6894(Static63.aClass32_1.method789(82) ? 1 : 0);
				Static311.method4754(local515);
				Static191.method5050(0, true, local494.method2778(), -2, local494.method2778(), local494.anIntArray232[0], local494.anIntArray233[0], 0);
			}
		}
		if (local19 == 60 && Static97.aClass78_2 == null) {
			Static640.method8565(local13, local16);
			Static97.aClass78_2 = Static496.method7080(local16, local13);
			Static397.method6022(Static97.aClass78_2);
		}
		if (local19 == 10) {
			local44 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local23);
			if (local44 != null) {
				local59 = local44.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				Static496.anInt8422 = arg0;
				Static419.anInt7641 = 2;
				Static76.anInt1679 = 0;
				Static212.anInt4408 = arg2;
				local66 = Static595.method8194(Static610.aClass310_2, Static254.aClass269_49);
				local66.aClass2_Sub34_Sub2_2.method6854(Static352.anInt6475);
				local66.aClass2_Sub34_Sub2_2.method6860(Static63.aClass32_1.method789(82) ? 1 : 0);
				local66.aClass2_Sub34_Sub2_2.method6900(local23);
				local66.aClass2_Sub34_Sub2_2.method6900(Static590.anInt9763);
				local66.aClass2_Sub34_Sub2_2.method6864(Static342.anInt6258);
				Static311.method4754(local66);
				Static191.method5050(0, true, local59.method2778(), -2, local59.method2778(), local59.anIntArray232[0], local59.anIntArray233[0], 0);
			}
		}
		if (local19 == 2) {
			Static419.anInt7641 = 2;
			Static496.anInt8422 = arg0;
			Static76.anInt1679 = 0;
			Static212.anInt4408 = arg2;
			local131 = Static595.method8194(Static610.aClass310_2, Static57.aClass269_13);
			local131.aClass2_Sub34_Sub2_2.method6857(Static451.anInt7933 + local13);
			local131.aClass2_Sub34_Sub2_2.method6900((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local131.aClass2_Sub34_Sub2_2.method6897(Static63.aClass32_1.method789(82) ? 1 : 0);
			local131.aClass2_Sub34_Sub2_2.method6854(local16 + Static470.anInt8063);
			Static311.method4754(local131);
			Static48.method945(local16, local13, local32);
		}
		if (Static301.aBoolean423) {
			Static171.method3178();
		}
		if (Static140.aClass78_6 != null && Static195.anInt9445 == 0) {
			Static397.method6022(Static140.aClass78_6);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V")
	public static void method1621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg3 + 1;
		Static259.method4236(arg4, arg1, arg2, Static618.anIntArrayArray101[arg3]);
		@Pc(19) int local19 = arg0 - 1;
		Static259.method4236(arg4, arg1, arg2, Static618.anIntArrayArray101[arg0]);
		for (@Pc(28) int local28 = local6; local28 <= local19; local28++) {
			@Pc(33) int[] local33 = Static618.anIntArrayArray101[local28];
			local33[arg4] = local33[arg1] = arg2;
		}
	}
}
