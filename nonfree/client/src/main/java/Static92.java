import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public static int anInt1738;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public static int anInt1739;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_43 = new Class205(9, 6);

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_32 = new Class11(34, 3);

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!wg;[I[I[IZ)V")
	public static void method1696(@OriginalArg(0) Class1_Sub5_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = arg1[local11];
			@Pc(21) int local21 = arg3[local11];
			@Pc(25) int local25 = arg2[local11];
			@Pc(27) int local27 = 0;
			while (local21 != 0 && arg0.aClass12Array3.length > local27) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg0.aClass12Array3[local27] = null;
					} else {
						@Pc(45) Class202 local45 = Static36.aClass236_1.method5396(local17);
						@Pc(48) int local48 = local45.anInt4932;
						@Pc(53) Class12 local53 = arg0.aClass12Array3[local27];
						if (local53 != null) {
							if (local53.anInt319 == local17) {
								if (local48 == 0) {
									local53 = arg0.aClass12Array3[local27] = null;
								} else if (local48 == 1) {
									local53.anInt320 = 1;
									local53.anInt321 = 0;
									local53.anInt317 = 0;
									local53.anInt318 = 0;
									local53.anInt316 = local25;
									Static169.method2965(0, false, arg0.aByte69, arg0.anInt6390, local45, arg0.anInt6386);
								} else if (local48 == 2) {
									local53.anInt317 = 0;
								}
							} else if (local45.anInt4945 >= Static36.aClass236_1.method5396(local53.anInt319).anInt4945) {
								local53 = arg0.aClass12Array3[local27] = null;
							}
						}
						if (local53 == null) {
							local53 = arg0.aClass12Array3[local27] = new Class12();
							local53.anInt316 = local25;
							local53.anInt321 = 0;
							local53.anInt317 = 0;
							local53.anInt319 = local17;
							local53.anInt318 = 0;
							local53.anInt320 = 1;
							Static169.method2965(0, false, arg0.aByte69, arg0.anInt6390, local45, arg0.anInt6386);
						}
					}
				}
				local27++;
				local21 >>>= 0x1;
			}
		}
	}
}
