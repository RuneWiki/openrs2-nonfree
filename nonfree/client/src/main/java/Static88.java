import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!em", name = "K", descriptor = "I")
	public static int anInt1815;

	@OriginalMember(owner = "client!em", name = "C", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_27 = new Class244(55, 4);

	@OriginalMember(owner = "client!em", name = "J", descriptor = "I")
	public static int anInt1814 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!km;[I[II[I)V")
	public static void method1480(@OriginalArg(0) Class28_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) int local14 = arg1[local8];
			@Pc(18) int local18 = arg3[local8];
			@Pc(22) int local22 = arg2[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && local24 < arg0.aClass81Array3.length) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass81Array3[local24] = null;
					} else {
						@Pc(42) Class177 local42 = Static176.aClass43_2.method930(local14);
						@Pc(45) int local45 = local42.anInt4500;
						@Pc(50) Class81 local50 = arg0.aClass81Array3[local24];
						if (local50 != null) {
							if (local50.anInt2042 == local14) {
								if (local45 == 0) {
									local50 = arg0.aClass81Array3[local24] = null;
								} else if (local45 == 1) {
									local50.anInt2040 = 0;
									local50.anInt2046 = 1;
									local50.anInt2041 = 0;
									local50.anInt2043 = local22;
									local50.anInt2045 = 0;
									Static351.method2911(arg0.aByte73, arg0.anInt5774, 0, local42, arg0.anInt5766, false);
								} else if (local45 == 2) {
									local50.anInt2040 = 0;
								}
							} else if (local42.anInt4520 >= Static176.aClass43_2.method930(local50.anInt2042).anInt4520) {
								local50 = arg0.aClass81Array3[local24] = null;
							}
						}
						if (local50 == null) {
							local50 = arg0.aClass81Array3[local24] = new Class81();
							local50.anInt2045 = 0;
							local50.anInt2041 = 0;
							local50.anInt2046 = 1;
							local50.anInt2042 = local14;
							local50.anInt2043 = local22;
							local50.anInt2040 = 0;
							Static351.method2911(arg0.aByte73, arg0.anInt5774, 0, local42, arg0.anInt5766, false);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}
}
