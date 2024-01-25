import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
	public static int anInt1368;

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
	public static int anInt1369;

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
	public static int anInt1370;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "Lclient!u;")
	public static final Class352 aClass352_4 = new Class352("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILjava/lang/String;ZB)V")
	public static void method1338(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		Static450.method6928();
		if (arg0 == 0) {
			Static202.aClass75_5 = Static187.method3520(Static4.aCanvas1, 0, Static377.aClass223_80, Static334.anInterface11_7, Static687.aClass6_Sub44_33.aClass7_Sub25_2.method7631() * 2);
			if (arg1 != null) {
				Static202.aClass75_5.GA(0);
				@Pc(38) Class53 local38 = Static629.method8576(Static254.anInt4888, Static373.aClass223_79);
				@Pc(47) Class67 local47 = Static202.aClass75_5.method6649(local38, Static691.method1239(Static583.aClass223_113, Static254.anInt4888));
				Static17.method220();
				Static562.method7944(local38, arg1, local47, Static202.aClass75_5, true);
			}
		} else {
			@Pc(60) Class75 local60 = null;
			@Pc(88) Class67 local88;
			if (arg1 != null) {
				local60 = Static187.method3520(Static4.aCanvas1, 0, Static377.aClass223_80, Static334.anInterface11_7, 0);
				local60.GA(0);
				@Pc(79) Class53 local79 = Static629.method8576(Static254.anInt4888, Static373.aClass223_79);
				local88 = local60.method6649(local79, Static691.method1239(Static583.aClass223_113, Static254.anInt4888));
				Static17.method220();
				Static562.method7944(local79, arg1, local88, local60, true);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static202.aClass75_5 = Static187.method3520(Static4.aCanvas1, arg0, Static377.aClass223_80, Static334.anInterface11_7, Static687.aClass6_Sub44_33.aClass7_Sub25_2.method7631() * 2);
					if (arg1 != null) {
						local60.GA(0);
						@Pc(121) Class53 local121 = Static629.method8576(Static254.anInt4888, Static373.aClass223_79);
						@Pc(130) Class67 local130 = local60.method6649(local121, Static691.method1239(Static583.aClass223_113, Static254.anInt4888));
						Static17.method220();
						Static562.method7944(local121, arg1, local130, local60, true);
					}
					if (Static202.aClass75_5.method6646()) {
						@Pc(144) boolean local144 = true;
						try {
							local144 = Static192.aClass6_Sub1_1.anInt39 > 256;
						} catch (@Pc(155) Throwable local155) {
						}
						@Pc(161) Class6_Sub18 local161;
						if (local144) {
							local161 = Static202.aClass75_5.method6702(146800640);
						} else {
							local161 = Static202.aClass75_5.method6702(104857600);
						}
						Static202.aClass75_5.method6698(local161);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(172) Throwable local172) {
					@Pc(177) int local177 = Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431();
					if (local177 == 2) {
						Static211.aBoolean336 = true;
					}
					Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub19_1);
					method1338(local177, arg1, arg2);
					@Pc(196) Object local196 = null;
					var14 = false;
				} finally {
					if (var14) {
						local88 = null;
						if (local60 != null) {
							try {
								local60.method6672();
							} catch (@Pc(359) Throwable local359) {
							}
						}
					}
				}
				if (local60 != null) {
					try {
						local60.method6672();
					} catch (@Pc(339) Throwable local339) {
					}
				}
				return;
			}
			local88 = null;
			if (local60 != null) {
				try {
					local60.method6672();
				} catch (@Pc(349) Throwable local349) {
				}
			}
		}
		Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6433(!arg2);
		Static687.aClass6_Sub44_33.method7080(arg0, Static687.aClass6_Sub44_33.aClass7_Sub19_1);
		Static226.method4052();
		Static202.aClass75_5.method6655();
		Static202.aClass75_5.X(32);
		Static373.aClass109_5 = Static202.aClass75_5.method6709();
		Static635.aClass109_12 = Static202.aClass75_5.method6709();
		Static191.method3634();
		Static202.aClass75_5.method6690(Static687.aClass6_Sub44_33.aClass7_Sub16_1.method5545() == 1);
		if (Static202.aClass75_5.method6666()) {
			Static591.method8211(Static687.aClass6_Sub44_33.aClass7_Sub17_1.method5991() == 1);
		}
		Static357.method5435(Static327.anInt5650 >> 3, Static202.aClass75_5, Static29.anInt380 >> 3);
		Static433.method6599();
		Static9.aClass328Array1 = null;
		Static513.aBoolean649 = true;
		Static554.aBoolean681 = false;
		Static300.method7412();
	}
}
