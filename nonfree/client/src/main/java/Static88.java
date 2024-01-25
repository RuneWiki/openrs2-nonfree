import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dca", name = "gb", descriptor = "I")
	public static int anInt1811;

	@OriginalMember(owner = "client!dca", name = "fb", descriptor = "F")
	public static float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIII)V")
	public static void method1486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == Static244.anInt4473 && arg1 == Static517.anInt8885 && arg0 == Static468.anInt7871) {
			return;
		}
		Static517.anInt8885 = arg1;
		Static28.aBoolean15 = true;
		Static244.anInt4473 = arg2;
		Static468.anInt7871 = arg0;
		@Pc(43) double local43 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(53) double local53 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(56) double local56 = Math.cos(local53);
		@Pc(59) double local59 = Math.sin(local53);
		@Pc(62) double local62 = Math.cos(local43);
		@Pc(65) double local65 = Math.sin(local43);
		Static611.aDouble23 = local65;
		Static508.aDouble21 = local62;
		Static242.aDouble10 = local59;
		Static94.aDouble7 = local59 * local65;
		Static1.aDouble20 = local56;
		Static158.aDouble8 = local62 * -local59;
		Static34.aDouble3 = local56 * local62;
		Static286.aDouble11 = -local56 * local65;
		Static292.aDouble12 = 0.0D;
	}

	@OriginalMember(owner = "client!dca", name = "n", descriptor = "(I)I")
	public static int method1487() {
		return Static483.anInt8236 == 1 ? Static212.anInt4040 : 0;
	}

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "(B)V")
	public static void method1488() {
		Static581.aClass47_1.method8500();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static322.aLongArray5[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static446.aLongArray13[local29] = 0L;
		}
		Static177.anInt3153 = 0;
	}
}
