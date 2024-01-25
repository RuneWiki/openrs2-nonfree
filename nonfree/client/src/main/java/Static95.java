import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array4;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "Lclient!wd;")
	public static final Class366 aClass366_3 = new Class366(1);

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	public static final int anInt2616 = 0;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[4];

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString32 = "";

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)I")
	public static int method2214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static574.anInt9869 == -1) {
			return 1;
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != arg1) {
			Static395.method6310(Static121.aClass84_13.method2710(Static372.anInt7083), arg1, true);
			if (arg1 != Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358()) {
				return -1;
			}
		}
		try {
			@Pc(42) Dimension local42 = Static549.aCanvas13.getSize();
			Static500.method7268(Static634.aClass27_19, true, Static171.aClass16_5, Static121.aClass84_13.method2710(Static372.anInt7083), Static446.aClass345_13);
			@Pc(62) Class344 local62 = Static600.method8252(Static517.aClass237_125, Static574.anInt9869);
			@Pc(67) long local67 = Static342.method5463();
			Static171.aClass16_5.la();
			Static3.aClass54_1.method5128(0, Static180.anInt4229, 0);
			Static171.aClass16_5.method6066(Static3.aClass54_1);
			Static171.aClass16_5.DA(local42.width / 2, local42.height / 2, 512, 512);
			Static171.aClass16_5.xa(1.0F);
			Static171.aClass16_5.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(108) Class83 local108 = Static171.aClass16_5.method6094(local62, 2048, 64, 64, 768);
			@Pc(110) int local110 = 0;
			label41: for (@Pc(112) int local112 = 0; local112 < 500; local112++) {
				Static171.aClass16_5.GA(0);
				Static171.aClass16_5.ya();
				for (@Pc(121) int local121 = 15; local121 >= 0; local121--) {
					for (@Pc(125) int local125 = 0; local125 <= local121; local125++) {
						Static141.aClass54_3.method5128((int) ((float) Static572.anInt9827 * ((float) local125 - (float) local121 / 2.0F)), 0, Static572.anInt9827 * (local121 + 1));
						local108.method8003(Static141.aClass54_3, null, 0);
						local110++;
						if (Static342.method5463() - local67 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static171.aClass16_5.method6061();
			@Pc(199) long local199 = (long) (local110 * 1000) / (Static342.method5463() - local67);
			Static171.aClass16_5.GA(0);
			Static171.aClass16_5.ya();
			return (int) local199;
		} catch (@Pc(208) Throwable local208) {
			local208.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
	public static void method2216() {
		Static332.anInt6573 = 0;
		@Pc(17) int local17 = Static628.anInt10493 + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >> 9);
		@Pc(24) int local24 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >> 9) + Static594.anInt10160;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static332.anInt6573 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static332.anInt6573 = 1;
		}
		if (Static332.anInt6573 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static332.anInt6573 = 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
	public static void method2217() {
		try {
			@Pc(10) int local10;
			if (Static570.anInt9813 == 1) {
				local10 = Static608.aClass8_Sub16_Sub1_4.method2270();
				if (local10 > 0 && Static608.aClass8_Sub16_Sub1_4.method2290()) {
					local10 -= Static542.anInt9401;
					if (local10 < 0) {
						local10 = 0;
					}
					Static608.aClass8_Sub16_Sub1_4.method2294(local10);
					return;
				}
				Static608.aClass8_Sub16_Sub1_4.method2277();
				Static608.aClass8_Sub16_Sub1_4.method2297();
				if (Static68.aClass237_22 == null) {
					Static570.anInt9813 = 0;
				} else {
					Static570.anInt9813 = 2;
				}
				Static271.aClass357_1 = null;
				Static12.aClass8_Sub47_1 = null;
			}
			if (Static570.anInt9813 == 3) {
				local10 = Static608.aClass8_Sub16_Sub1_4.method2270();
				if (local10 < Static227.anInt5183 && Static608.aClass8_Sub16_Sub1_4.method2290()) {
					local10 += Static249.anInt5515;
					if (Static227.anInt5183 < local10) {
						local10 = Static227.anInt5183;
					}
					Static608.aClass8_Sub16_Sub1_4.method2294(local10);
				} else {
					Static570.anInt9813 = 0;
					Static249.anInt5515 = 0;
				}
			}
		} catch (@Pc(107) Exception local107) {
			local107.printStackTrace();
			Static608.aClass8_Sub16_Sub1_4.method2277();
			Static570.anInt9813 = 0;
			Static271.aClass357_1 = null;
			Static12.aClass8_Sub47_1 = null;
			Static68.aClass237_22 = null;
			Static10.aClass8_Sub16_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Z")
	public static boolean method2218(@OriginalArg(1) int arg0) {
		if (arg0 == 4 || arg0 == 23 || arg0 == 49 || arg0 == 30 || arg0 == 16) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1011;
		}
	}
}
