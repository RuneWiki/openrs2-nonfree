import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!el", name = "k", descriptor = "[Lclient!na;")
	public static Class136[] aClass136Array1;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_24 = new Class84("M", "M", "M", "M");

	@OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_14 = new Class83(260);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1482() {
		Static157.method2372(false);
		if (Static444.anInt7609 >= 0 && Static444.anInt7609 != 0) {
			Static262.method3812(Static444.anInt7609);
			Static444.anInt7609 = -1;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILclient!me;I)V")
	public static void method1485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub29 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt4372 == -1 && arg3.anIntArray350 == null) {
			return;
		}
		@Pc(21) int local21 = 0;
		if (arg1 > arg3.anInt4381) {
			local21 = arg1 - arg3.anInt4381;
		} else if (arg1 < arg3.anInt4373) {
			local21 = arg3.anInt4373 - arg1;
		}
		@Pc(55) int local55 = Static389.aClass128_Sub1_1.anInt3573 * arg3.anInt4380 >> 8;
		if (arg2 > arg3.anInt4378) {
			local21 += arg2 - arg3.anInt4378;
		} else if (arg3.anInt4374 > arg2) {
			local21 += arg3.anInt4374 - arg2;
		}
		if (arg3.anInt4377 == 0 || arg3.anInt4377 < local21 - 64 || Static389.aClass128_Sub1_1.anInt3573 == 0 || arg3.anInt4367 != arg0) {
			if (arg3.aClass1_Sub7_Sub4_3 != null) {
				Static38.aClass1_Sub7_Sub1_1.method3979(arg3.aClass1_Sub7_Sub4_3);
				arg3.aClass1_Sub7_Sub4_3 = null;
			}
			if (arg3.aClass1_Sub7_Sub4_2 != null) {
				Static38.aClass1_Sub7_Sub1_1.method3979(arg3.aClass1_Sub7_Sub4_2);
				arg3.aClass1_Sub7_Sub4_2 = null;
			}
			return;
		}
		local21 -= 64;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(149) int local149 = (arg3.anInt4377 - local21) * local55 / arg3.anInt4377;
		if (arg3.aClass1_Sub7_Sub4_3 != null) {
			arg3.aClass1_Sub7_Sub4_3.method5957(local149);
		} else if (arg3.anInt4372 >= 0) {
			@Pc(170) Class241 local170 = Static462.method5504(Static235.aClass250_53, arg3.anInt4372, 0);
			if (local170 != null) {
				@Pc(177) Class1_Sub32_Sub1 local177 = local170.method5507().method4014(Static205.aClass229_1);
				@Pc(182) Class1_Sub7_Sub4 local182 = Static463.method5945(local177, local149);
				local182.method5933(-1);
				Static38.aClass1_Sub7_Sub1_1.method3976(local182);
				arg3.aClass1_Sub7_Sub4_3 = local182;
			}
		}
		if (arg3.aClass1_Sub7_Sub4_2 != null) {
			arg3.aClass1_Sub7_Sub4_2.method5957(local149);
			if (arg3.aClass1_Sub7_Sub4_2.method6069()) {
				return;
			}
			arg3.aClass1_Sub7_Sub4_2 = null;
		} else if (arg3.anIntArray350 != null && (arg3.anInt4366 -= arg4) <= 0) {
			@Pc(213) int local213 = (int) ((double) arg3.anIntArray350.length * Math.random());
			@Pc(221) Class241 local221 = Static462.method5504(Static235.aClass250_53, arg3.anIntArray350[local213], 0);
			if (local221 != null) {
				@Pc(228) Class1_Sub32_Sub1 local228 = local221.method5507().method4014(Static205.aClass229_1);
				@Pc(233) Class1_Sub7_Sub4 local233 = Static463.method5945(local228, local149);
				local233.method5933(0);
				Static38.aClass1_Sub7_Sub1_1.method3976(local233);
				arg3.aClass1_Sub7_Sub4_2 = local233;
				arg3.anInt4366 = arg3.anInt4368 + (int) (Math.random() * (double) (arg3.anInt4375 - arg3.anInt4368));
				return;
			}
		}
	}
}
