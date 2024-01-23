import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
	public static int anInt2136 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!ia;)I")
	public static int method1639(@OriginalArg(1) Class51 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < Static201.anInt4259; local17++) {
			if (arg0.method1401(Static113.aClass51Array15[local17])) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method1641() {
		try {
			if (Static32.aClass113_1 == null) {
				Static32.aClass113_1 = new Class113(Static51.aClass72_3, Static150.method2574(new Class51[] { Static167.method2865(), Static39.aClass51_279 }).method1427());
			}
		} catch (@Pc(28) Exception local28) {
			local28.printStackTrace();
			Static32.aClass113_1 = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public static void method1643() {
		@Pc(1) Class50 local1 = Static103.aClass50_2;
		synchronized (Static103.aClass50_2) {
			Static158.anInt3440++;
			Static71.anInt1636 = Static169.anInt3809;
			Static205.anInt4361 = Static97.anInt2130;
			Static15.anInt373 = Static103.anInt4807;
			Static15.anInt371 = Static146.anInt774;
			Static148.anInt3214 = Static220.anInt4642;
			Static106.anInt2346 = Static136.anInt2614;
			Static150.aLong116 = Static126.aLong102;
			Static146.anInt774 = 0;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!k;)V")
	public static void method1645(@OriginalArg(1) Class1_Sub16 arg0) {
		if (Static114.aClass112_4 != null) {
			try {
				Static114.aClass112_4.method3298(0L);
				Static114.aClass112_4.method3287(arg0.aByteArray62, arg0.anInt4860, 24);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt4860 += 24;
	}
}
