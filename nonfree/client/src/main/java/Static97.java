import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_47 = new Class151(116, -1);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
	public static void method1973(@OriginalArg(0) int arg0) {
		if (Static306.anInt4811 == 1) {
			Static85.anInt1771 = arg0;
		} else if (Static306.anInt4811 == 2) {
			Static54.anInt1255 = arg0;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
	public static int method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static386.anInt5675 == -1) {
			return 1;
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != arg1) {
			Static261.method3766(true, Static279.aClass179_13.method4066(Static164.anInt2984), arg1);
			if (arg1 != Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052()) {
				return -1;
			}
		}
		try {
			@Pc(43) Dimension local43 = Static17.aCanvas1.getSize();
			Static460.method6416(Static279.aClass179_13.method4066(Static164.anInt2984), Static636.aClass31_14, Static582.aClass33_13, true, Static189.aClass56_5);
			@Pc(59) Class334 local59 = Static111.method2111(Static386.anInt5675, Static89.aClass34_20);
			@Pc(62) long local62 = Static429.method5935();
			Static582.aClass33_13.la();
			Static149.aClass92_2.method3854(0, Static85.anInt1770, 0);
			Static582.aClass33_13.method8133(Static149.aClass92_2);
			Static582.aClass33_13.DA(local43.width / 2, local43.height / 2, 512, 512);
			Static582.aClass33_13.xa(1.0F);
			Static582.aClass33_13.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(103) Class62 local103 = Static582.aClass33_13.method8072(local59, 2048, 64, 64, 768);
			@Pc(105) int local105 = 0;
			label41: for (@Pc(107) int local107 = 0; local107 < 500; local107++) {
				Static582.aClass33_13.GA(0);
				Static582.aClass33_13.ya();
				for (@Pc(116) int local116 = 15; local116 >= 0; local116--) {
					for (@Pc(120) int local120 = 0; local120 <= local116; local120++) {
						Static440.aClass92_7.method3854((int) (((float) local120 - (float) local116 / 2.0F) * (float) Static63.anInt1356), 0, (local116 + 1) * Static63.anInt1356);
						local103.method7335(Static440.aClass92_7, (Class3_Sub4) null, 0);
						local105++;
						if ((long) arg0 <= Static429.method5935() - local62) {
							break label41;
						}
					}
				}
			}
			Static582.aClass33_13.method8153();
			@Pc(188) long local188 = (long) (local105 * 1000) / (Static429.method5935() - local62);
			Static582.aClass33_13.GA(0);
			Static582.aClass33_13.ya();
			return (int) local188;
		} catch (@Pc(197) Throwable local197) {
			local197.printStackTrace();
			return -1;
		}
	}
}
