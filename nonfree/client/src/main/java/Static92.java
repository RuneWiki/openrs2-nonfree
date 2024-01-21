import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_68;

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
	public static int anInt2140;

	@OriginalMember(owner = "client!jd", name = "U", descriptor = "Lclient!ve;")
	public static Class69 aClass69_22;

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	public static int anInt2138 = 0;

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
	public static int anInt2141 = 0;

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
	public static int anInt2144 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_633 = Static81.method1507("<col=ffffff>");

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_634 = Static81.method1507("");

	@OriginalMember(owner = "client!jd", name = "gb", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class61 local3 = new Class61();
		local3.anInt2601 = arg2 / 128;
		local3.anInt2595 = arg3 / 128;
		local3.anInt2588 = arg4 / 128;
		local3.anInt2598 = arg5 / 128;
		local3.anInt2605 = arg1;
		local3.anInt2597 = arg2;
		local3.anInt2606 = arg3;
		local3.anInt2590 = arg4;
		local3.anInt2602 = arg5;
		local3.anInt2603 = arg6;
		local3.anInt2592 = arg7;
		Static19.aClass61ArrayArray1[arg0][Static19.anIntArray40[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!dj;)V")
	public static void method1675(@OriginalArg(1) Class24 arg0) {
		Static5.aClass24_40 = arg0;
		Static56.method1089();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!fj;)V")
	public static void method1676(@OriginalArg(1) Class1_Sub7 arg0) {
		if (Static210.aClass10_5 != null) {
			try {
				Static210.aClass10_5.method312(0L);
				Static210.aClass10_5.method318(24, arg0.anInt3592, arg0.aByteArray38);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt3592 += 24;
	}
}
