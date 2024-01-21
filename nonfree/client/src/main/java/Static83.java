import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "Z")
	public static boolean aBoolean97;

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
	public static int anInt2001;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "Lclient!s;")
	public static final Class87 aClass87_13 = new Class87();

	@OriginalMember(owner = "client!id", name = "T", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_595 = Static81.method1507("(Z");

	@OriginalMember(owner = "client!id", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_596 = Static81.method1507("AUS");

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_597 = Static81.method1507(" is already on your ignore list)3");

	@OriginalMember(owner = "client!id", name = "db", descriptor = "I")
	public static int anInt2000 = 0;

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_598 = aClass24_597;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!ve;)V")
	public static void method1542(@OriginalArg(1) Class69 arg0) {
		Static33.aClass69_7 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!fj;II)Lclient!dj;")
	public static Class24 method1544(@OriginalArg(0) Class1_Sub7 arg0) {
		try {
			@Pc(7) Class24 local7 = new Class24();
			local7.anInt1084 = arg0.method2795();
			if (local7.anInt1084 > 32767) {
				local7.anInt1084 = 32767;
			}
			local7.aByteArray13 = new byte[local7.anInt1084];
			arg0.anInt3592 += Static88.aClass97_1.method3316(0, arg0.anInt3592, local7.aByteArray13, local7.anInt1084, arg0.aByteArray38);
			return local7;
		} catch (@Pc(48) Exception local48) {
			return Static106.aClass24_713;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!dj;ILclient!dj;Lclient!dj;I)V")
	public static void method1545(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class24 arg2) {
		Static166.method2829(arg0, arg2, 9, arg1, -1);
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
	public static void method1546() {
		for (@Pc(21) Class1_Sub15 local21 = (Class1_Sub15) Static185.aClass87_28.method2827(); local21 != null; local21 = (Class1_Sub15) Static185.aClass87_28.method2830()) {
			if (local21.anInt2643 > 0) {
				local21.anInt2643--;
			}
			if (local21.anInt2643 != 0) {
				if (local21.anInt2648 > 0) {
					local21.anInt2648--;
				}
				if (local21.anInt2648 == 0 && local21.anInt2645 >= 1 && local21.anInt2653 >= 1 && local21.anInt2645 <= 102 && local21.anInt2653 <= 102 && (local21.anInt2646 < 0 || Static172.method2976(local21.anInt2652, local21.anInt2646))) {
					Static155.method2243(local21.anInt2640, local21.anInt2645, local21.anInt2653, local21.anInt2656, local21.anInt2649, local21.anInt2646, local21.anInt2652);
					local21.anInt2648 = -1;
					if (local21.anInt2646 == local21.anInt2654 && local21.anInt2654 == -1) {
						local21.method3563();
					} else if (local21.anInt2654 == local21.anInt2646 && local21.anInt2656 == local21.anInt2642 && local21.anInt2641 == local21.anInt2652) {
						local21.method3563();
					}
				}
			} else if (local21.anInt2654 < 0 || Static172.method2976(local21.anInt2641, local21.anInt2654)) {
				Static155.method2243(local21.anInt2640, local21.anInt2645, local21.anInt2653, local21.anInt2642, local21.anInt2649, local21.anInt2654, local21.anInt2641);
				local21.method3563();
			}
		}
	}
}
